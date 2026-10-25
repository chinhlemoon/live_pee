import zipfile, collections, os, sys
sys.stdout.reconfigure(encoding='utf-8', errors='replace')
z=zipfile.ZipFile('Live_fix.apk')
infos=z.infolist()
print('total_entries', len(infos))
print('total_uncompressed_MB', round(sum(i.file_size for i in infos)/1048576,1))
ext=collections.Counter()
extsize=collections.Counter()
for i in infos:
    e=os.path.splitext(i.filename)[1].lower() or '<noext>'
    ext[e]+=1; extsize[e]+=i.file_size
print('--- by ext (count, MB) ---')
for k,v in ext.most_common(25): print(k, v, round(extsize[k]/1048576,2))
print('--- largest 50 ---')
for i in sorted(infos, key=lambda x:-x.file_size)[:50]: print(round(i.file_size/1048576,2), i.filename.encode('utf-8','replace').decode('utf-8'))
print('--- top level ---')
d=collections.Counter(i.filename.split('/')[0] for i in infos)
for k,v in d.most_common(): print(k,v)
print('--- dex ---')
for i in infos:
    if i.filename.endswith('.dex'): print(i.filename, i.file_size)
print('--- lib ABIs ---')
abi=collections.Counter()
for i in infos:
    p=i.filename.split('/')
    if len(p)>=3 and p[0]=='lib': abi[p[1]]+=1
print(dict(abi))
print('--- META-INF ---')
for i in infos:
    if i.filename.startswith('META-INF/'): print(i.filename, i.file_size)
print('--- assets (first 200) ---')
for i in infos:
    if i.filename.startswith('assets/'): print(i.filename, i.file_size)
