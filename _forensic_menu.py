import sys, os, re, json
sys.stdout.reconfigure(encoding='utf-8')

# 1. Load all field constants across entire codebase
fields = {}
for root, dirs, files in os.walk('_jadx_wolf/sources'):
    for f in files:
        if f.endswith('.java'):
            p = os.path.join(root, f)
            with open(p, 'r', encoding='utf-8', errors='ignore') as jf:
                c = jf.read()
            for m in re.finditer(r'public static int (f\w+)\s*=\s*(-?\d+);', c):
                fields[m.group(1)] = int(m.group(2))

print(f'Total fields loaded: {len(fields)}')

def eval_length(expr):
    expr = expr.strip()
    if expr.isdigit() or (expr.startswith('-') and expr[1:].isdigit()):
        return int(expr)
    m = re.match(r'(?:C\d+\.)?(f\w+)\s*\^\s*(-?\d+|\([^)]+\))', expr)
    if m:
        fname = m.group(1)
        k2_str = m.group(2).replace('(', '').replace(')', '').strip()
        k2 = int(k2_str)
        if fname in fields:
            return fields[fname] ^ k2
    try:
        local_dict = dict(fields)
        cleaned = re.sub(r'C\d+\.', '', expr)
        return eval(cleaned, {}, local_dict)
    except:
        return None

def decrypt_class_strings(file_path):
    with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
        code = f.read()

    # extract arrays
    arrays = {}
    for m in re.finditer(r'private static final short\[\] (f\d+short)\s*=\s*\{([^}]+)\};', code):
        arr_name = m.group(1)
        nums = [int(x.strip()) for x in m.group(2).split(',') if x.strip()]
        arrays[arr_name] = nums

    # map method returning array
    method_to_array = {}
    lines = code.split('\n')
    for idx, line in enumerate(lines):
        m = re.search(r'return (f\d+short);', line)
        if m:
            arr = m.group(1)
            for j in range(idx, max(0, idx - 50), -1):
                mm = re.search(r'public static short\[\] (m\w+)\(', lines[j])
                if mm:
                    method_to_array[mm.group(1)] = arr
                    break

    # find decrypt calls
    pattern = re.compile(r'C\d+\.m\d+\((m\d+)\(\),\s*(\d+),\s*([^,]+),\s*(-?\d+)\)')
    results = []
    for m_func, offset_str, len_expr, key_str in pattern.findall(code):
        arr_name = method_to_array.get(m_func)
        if not arr_name or arr_name not in arrays:
            continue
        arr = arrays[arr_name]
        offset = int(offset_str)
        key = int(key_str)
        length = eval_length(len_expr)
        if length is None or length <= 0 or offset + length > len(arr):
            continue
        chars = [chr((arr[offset + i] ^ key) & 0xffff) for i in range(length)]
        s = ''.join(chars)
        results.append((offset, s))
    return results

print('--- LicenseManager strings ---')
lm_strings = decrypt_class_strings('_jadx_wolf/sources/com/example/vcam/LicenseManager.java')
for off, s in lm_strings:
    if 'http' in s.lower() or 'api' in s.lower() or 'key' in s.lower() or 'server' in s.lower() or 'shopee' in s.lower() or 'zalo' in s.lower():
        print(f'  [{off}] {s}')

print('--- HookMain strings ---')
hm_strings = decrypt_class_strings('_jadx_wolf/sources/com/example/vcam/HookMain.java')
print(f'HookMain decrypted strings count: {len(hm_strings)}')
for off, s in hm_strings[:30]:
    print(f'  [{off}] {s}')

print('--- ConnectionBlocker strings ---')
cb_strings = decrypt_class_strings('_jadx_wolf/sources/com/example/vcam/ConnectionBlocker.java')
print(f'ConnectionBlocker decrypted strings count: {len(cb_strings)}')
for off, s in cb_strings[:30]:
    print(f'  [{off}] {s}')
