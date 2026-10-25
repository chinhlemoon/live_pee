import zipfile, os, sys
sys.stdout.reconfigure(encoding='utf-8', errors='replace')
z=zipfile.ZipFile('Live_fix.apk')
print('--- assets/lspatch all ---')
for i in z.infolist():
    if 'lspatch' in i.filename.lower(): print(i.filename, i.file_size)
print('--- lspatch config/json/txt content ---')
for i in z.infolist():
    n=i.filename.lower()
    if 'lspatch' in n and n.endswith(('.json','.txt','.properties')):
        try:
            print('###', i.filename)
            print(z.read(i.filename)[:8000].decode('utf-8','replace'))
        except Exception as e: print('err', e)
os.makedirs('_extract', exist_ok=True)
for name,out in [('assets/lspatch/modules/Wolf.apk','_extract/Wolf.apk'),('assets/lspatch/origin.apk','_extract/origin.apk')]:
    if not os.path.exists(out):
        with z.open(name) as src, open(out,'wb') as dst:
            while True:
                b=src.read(1048576)
                if not b: break
                dst.write(b)
    print('extracted', out, os.path.getsize(out))
for path in ['_extract/Wolf.apk','_extract/origin.apk']:
    print('=====', path, '=====')
    zz=zipfile.ZipFile(path); infos=zz.infolist()
    print('entries', len(infos), 'uncompressed_MB', round(sum(i.file_size for i in infos)/1048576,1))
    for i in infos[:120]: print(i.filename, i.file_size)
    print('--- key files ---')
    for i in infos:
        if i.filename.endswith('.dex') or i.filename in ('AndroidManifest.xml','resources.arsc') or 'xposed' in i.filename.lower() or 'lspatch' in i.filename.lower(): print('KEY', i.filename, i.file_size)
