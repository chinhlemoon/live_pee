import zipfile, os, sys, re
sys.stdout.reconfigure(encoding='utf-8', errors='replace')
path='_extract/Wolf.apk'
z=zipfile.ZipFile(path); infos=z.infolist()
print('=== Wolf entries ===', len(infos))
for i in infos: print(i.filename, i.file_size)
def strings_from(data, minlen=4):
    out=[]
    cur=[]
    for b in data:
        if 32<=b<127:
            cur.append(chr(b))
        else:
            if len(cur)>=minlen: out.append(''.join(cur))
            cur=[]
    if len(cur)>=minlen: out.append(''.join(cur))
    # utf16le strings
    txt=data.decode('utf-16le','ignore')
    for m in re.finditer(r'[ -~\u00a0-\uffff]{4,}', txt):
        s=m.group(0).strip()
        if len(s)>=minlen and any(c.isalpha() for c in s): out.append(s)
    return out
allstr=[]
for i in infos:
    if i.filename.endswith(('.dex','.so','.xml','.json','.txt','.properties')) or i.filename=='AndroidManifest.xml' or 'assets/' in i.filename:
        try: data=z.read(i.filename)
        except Exception as e: print('readerr', i.filename, e); continue
        ss=strings_from(data)
        print(f'--- strings from {i.filename}: {len(ss)} ---')
        for s in ss: allstr.append((i.filename,s))
with open('_wolf_strings.txt','w',encoding='utf-8') as f:
    for src,s in allstr: f.write(f'{src}\t{s}\n')
print('total strings', len(allstr))
kw=['menu','overlay','float','windowmanager','modmenu','switch','checkbox','seekbar','button']
print('=== MENU / OVERLAY related ===')
seen=set()
for src,s in allstr:
    low=s.lower()
    if any(k in low for k in kw) and s not in seen:
        seen.add(s); print(src,'|',s[:300])
print('=== URLs ===')
for src,s in allstr:
    if 'http://' in s or 'https://' in s: print(src,'|',s[:300])
print('=== class-like / package strings (first 250) ===')
cnt=0
for src,s in allstr:
    if (s.startswith('L') and '/' in s and s.endswith(';')) or s.startswith('com.') or s.startswith('org.'):
        print(src,'|',s[:250]); cnt+=1
        if cnt>=250: break
