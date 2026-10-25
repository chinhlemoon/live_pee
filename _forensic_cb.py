import sys, os, re
sys.stdout.reconfigure(encoding='utf-8')

with open('_jadx_wolf/sources/com/example/vcam/ConnectionBlocker.java', 'r', encoding='utf-8', errors='ignore') as f:
    text = f.read()

# decrypt all strings in ConnectionBlocker
from _forensic_menu import decrypt_class_strings
cb_strings = decrypt_class_strings('_jadx_wolf/sources/com/example/vcam/ConnectionBlocker.java')

with open('_cb_decrypted_strings.txt', 'w', encoding='utf-8', errors='replace') as out:
    for off, s in cb_strings:
        out.write(f'{off}\t{s}\n')

print(f'Total decrypted strings in ConnectionBlocker: {len(cb_strings)}')
for off, s in cb_strings:
    if any(k in s.lower() for k in ['rule', 'block', 'shopee', 'http', 'live', 'tcp', 'udp', 'config', 'dat', 'txt']):
        print(f'  [{off}] {s}')
