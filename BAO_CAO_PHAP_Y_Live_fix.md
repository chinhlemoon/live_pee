# BAO CAO PHAP Y - Live_fix.apk
Ngay phan tich: 2026-10-24 (Asia/Bangkok) | Nguoi yeu cau: Hoang
Phuong phap: phan tich tinh (static forensic), khong cai dat/khong chay APK. Cong cu: Python + jadx 1.5.6

## 1. Dinh danh mau
- File: C:\Users\admin\Downloads\CODE\LIVE\Live_fix.apk
- Kich thuoc: 259,082,847 bytes (247.08 MB); LastWriteTime 2026-10-24 00:34:42
- SHA-256: 2A3F939C8315E0AFB4F2D900F02D01281F9B99C09DB6BCBBED08B1D6408856A4
- ZIP: 11,179 entries, giai nen ~681.6 MB; .so ~320.93 MB; ABI: arm64-v8a, armeabi-v7a, x86, x86_64
- classes.dex lop vo chi 10,392 bytes (loader) - khong phai code app that

## 2. Ket luan: Shopee dong goi lai bang LSPatch + module VCAM
- assets/lspatch/origin.apk (253,728,079 bytes) = APK goc; loader.dex (1,083,556); liblspatch.so theo ABI
- assets/lspatch/modules/Wolf.apk (2,873,263 bytes) = module Xposed cay vao
- assets/lspatch/config.json: appComponentFactory = com.shopee.app.asm.anr.launch.ShopeeAppComponentFactory -> app goc la SHOPEE
- config.json: LSPatch 0.6, core 1.9.2, API_CODE 93, sigBypassLevel = 2, debuggable = false; originalSignature = Garena Online Pte. Ltd. (Singapore)
- Python zipfile bao Overlapped entries voi origin.apk: dac trung LSPatch, khong phai hong file
- Co file watermark tieng Viet chong chia se mien phi o goc va assets/

## 3. Module Wolf.apk = VCAM / MYCAM (camera ao)
- Package com.example.vcam, versionName 4.4, versionCode 28, compileSdk 34
- assets/xposed_init: com.example.vcam.HookMain; meta-data: xposedmodule=true, xposeddescription=MYCAM, xposedminversion=51
- Quyen: SYSTEM_ALERT_WINDOW (cua so noi), READ/WRITE_EXTERNAL_STORAGE, MANAGE_EXTERNAL_STORAGE, READ_MEDIA_VIDEO, READ_MEDIA_IMAGES
- application debuggable=true, allowBackup=true - dau hieu ban build mod
- jadx: 1,368 file Java, 1,194/1,195 class (1 loi decompile - binh thuong); 800 file nam trong package bi obfuscate fhdsjfsdjfdsfdsdsff...
- Class loi (com.example.vcam): HookMain.java (~1.12 MB), Menu.java (~583 KB, 12,853 dong), LicenseManager.java (~114 KB - kiem tra key, chi ghi nhan, khong can thiep), ConnectionBlocker.java (~246 KB), MainActivity.java (~110 KB), VideoPickerActivity.java (~26 KB), VideoToFrames.java (~109 KB)
- Native: libtest.so (arm64-v8a, armeabi-v7a); anh res/drawable/nqc.png ~606 KB
- Chuoi hien thi bi ma hoa dang mang short[] giai ma luc chay -> phai doc cau truc field/class thay vi grep text

## 4. Co che HookMain (camera ao)
- Hook ca Camera1 (android.hardware.Camera) va Camera2 (CameraDevice, CameraCaptureSession, CaptureRequest), dung SurfaceTexture/Surface
- Dung MediaPlayer, MediaExtractor, MediaFormat + VideoToFrames de lay hinh tu video da chon va dua vao duong camera
- Co ham updateProxyConfig(...) (HookMain.java ~dong 18323) nhan cau hinh proxy tu Menu; 13 diem cham Socket trong HookMain

## 5. CHUC NANG CUA MENU (cau hoi chinh)
Menu la cua so noi (WindowManager + toggleButton keo tha, nho vi tri lastX/lastY) hien trong tien trinh Shopee sau khi LSPatch nap module.
Menu.java dong 301-304 khai bao 4 tab: TAB_MAIN=0, TAB_PROXY=1, TAB_CONNECTION_BLOCKER=2, TAB_AUTOCLICK=3. Nut chuyen tab: btnTabMain / btnTabProxy / btnTabConnectionBlocker / btnTabAutoClick (dong 317-320).

### 5.1 Tab Main - chon nguon camera gia
- Field: spinnerVideo, selectedVideoPath (dong 350, 362)
- Chuc nang: chon video trong may lam nguon phat; HookMain phat video nay vao duong camera cua Shopee Live thay camera that (video quay san nhung bi nhan la livestream truc tiep)

### 5.2 Tab Proxy - cau hinh proxy cho app
- Field: switchProxyEnabled, editProxyHost, editProxyPort, editProxyUsername, editProxyPassword, spinnerProxyType, spinnerProxyConfigs, editConfigName, btnTestProxy, textProxyStatus
- Chuc nang: bat/tat proxy, nhap thong so, chon loai proxy, luu/tai nhieu cau hinh theo ten, test proxy, xem trang thai; cau hinh day xuong HookMain.updateProxyConfig()

### 5.3 Tab Connection Blocker - chan ket noi theo luat
- Field: switchConnectionBlockerEnabled, editBlockTarget, editBlockPort, editBlockDescription, btnAddBlockRule, spinnerBlockRules, blockRulesList, textConnectionStats, switchLogEnabled, networkLogsList, btnClearLogs
- Bang chung lop ConnectionBlocker: 94 diem cham socket/connect; import Socket, DatagramSocket, InetAddress, InetSocketAddress, okhttp3.internal.connection; callback dong 526-529: onConnectionAllowed / onConnectionBlocked / onNetworkLog / onRuleTriggered
- Chuc nang: tao luat chan theo dich + cong, bat/tat chan, ghi log mang, xem thong ke va xoa log; muc dich kha nang cao la chan ket noi kiem tra/giam sat cua app chu

### 5.4 Tab AutoClick - tu dong bam theo kich ban
- Field: switchAutoClickEnabled, autoClickManager (kieu l2), editInterval, editTargetText, editResourceId, editLayoutId, spinnerScripts, btnSetAutoClickConfig
- Class l2 import Instrumentation, Handler, View, ViewGroup, TextView: duyet cay giao dien app chu, tim dung phan tu roi gia lap bam theo chu ky
- Chuc nang: bat/tat tu bam, dat chu ky, chi dinh phan tu bang text / resource ID / layout ID, chon script san, luu cau hinh

### 5.5 Ngoai menu
- LicenseManager: kiem tra key rieng, khong thuoc 4 tab. MainActivity + VideoPickerActivity: chuan bi/chon video truoc khi vao Shopee

## 6. Danh gia tong the
Bo cong cu livestream gia cho Shopee Live, gom 4 manh: (1) video quay san lam camera (VCAM) gia lap phat truc tiep; (2) Proxy doi danh tinh/duong mang; (3) Connection Blocker chan ket noi kiem tra/giam sat kem log mang; (4) AutoClick tu van hanh thao tac giao dien theo kich ban.
Kem theo: dong goi LSPatch + bypass chu ky muc 2, ma hoa chuoi chong dich nguoc, watermark chong chia se mien phi, kiem tra key bang LicenseManager.

## 7. Gioi han cua bao cao
- Phan tich tinh, chua chay tren thiet bi: endpoint bi chan cu the va du lieu gui ve may chu kiem tra key chua xac minh runtime
- Nhieu ten ham/bien bi obfuscate (fhdsjfs..., xadas...): ket luan dua tren ten field/class jadx khoi phuc, import, callback, cau truc UI - tin cay cao o muc chuc nang tab, thap hon o chi tiet tung nut nho
- Bao cao chi mo ta/phap y, khong sua doi va khong bypass LicenseManager

## 8. File phat sinh khi phan tich (cung thu muc LIVE)
- _extract/Wolf.apk (origin.apk chua trich xong do overlapped entries), _jadx_wolf/ (nguon jadx Wolf), _wolf_strings.txt
- _report1.txt, _report2.txt, _report3.txt, _forensic1.py, _forensic2.py, _forensic3.py, _jadx.log, _jadx_err.log
--- HET BAO CAO ---
