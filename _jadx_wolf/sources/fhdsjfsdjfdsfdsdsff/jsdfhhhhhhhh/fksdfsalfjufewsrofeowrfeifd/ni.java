package fhdsjfsdjfdsfdsdsff.jsdfhhhhhhhh.fksdfsalfjufewsrofeowrfeifd;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.C0002;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.activity.C0014;
import androidx.activity.C0017;
import androidx.activity.C0020;
import androidx.appcompat.app.C0035;
import androidx.appcompat.app.C0036;
import androidx.appcompat.widget.C0047;
import androidx.fragment.app.C0093;
import androidx.fragment.app.C0094;
import androidx.fragment.app.C0099;
import androidx.profileinstaller.C0112;
import androidx.profileinstaller.C0113;
import androidx.profileinstaller.C0115;
import androidx.profileinstaller.C0116;
import androidx.profileinstaller.C0118;
import androidx.savedstate.C0127;
import androidx.startup.C0128;
import androidx.versionedparcelable.C0129;
import androidx.versionedparcelable.C0135;
import okhttp3.C0240;
import okhttp3.internal.authenticator.C0161;
import okhttp3.internal.cache2.C0178;
import okhttp3.internal.http1.C0188;
import okhttp3.internal.http2.C0194;
import okhttp3.internal.platform.android.C0201;
import okhttp3.internal.proxy.C0211;
import okhttp3.logging.C0234;
import retrofit2.http.C0249;

/* JADX INFO: loaded from: classes.dex */
public class ni extends p2 implements Menu {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f406short = {1669, 1696, 1715, 1698, 1698, 1719, 1718, 1778, 1693, 1712, 1720, 1719, 1713, 1702, 1778, 1713, 1715, 1724, 1778, 1724, 1725, 1702, 1778, 1712, 1719, 1778, 1724, 1703, 1726, 1726, 1788};
    public final to xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa;

    public ni(Context context, to toVar) {
        super(context);
        if (toVar == null) {
            throw new IllegalArgumentException(C0113.m4161(m6142(), 0, 31, 1746));
        }
        this.xadsadsadafsafasfasassaxadasdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassaxadsdsadafsafasfasassa = toVar;
    }

    /* JADX INFO: renamed from: ۣ۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6142() {
        if (C0035.m1268() < 0) {
            return f406short;
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return C0127.m4947(this, C0020.m700(C0093.m3364(this), i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return C0127.m4947(this, C0128.m5091(C0093.m3364(this), i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return C0127.m4947(this, C0047.m1649(C0093.m3364(this), i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return C0127.m4947(this, C0118.m4463(C0093.m3364(this), charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iM5342 = C0135.m5342(C0093.m3364(this), i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = C0127.m4947(this, menuItemArr2[i5]);
            }
        }
        return iM5342;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return C0036.m1371(this, C0116.m4317(C0093.m3364(this), i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return C0036.m1371(this, C0188.m7722(C0093.m3364(this), i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return C0036.m1371(this, C0201.m8212(C0093.m3364(this), i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return C0036.m1371(this, C0002.m17(C0093.m3364(this), charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        C0129.m5177(this);
        C0240.m9865(C0093.m3364(this));
    }

    @Override // android.view.Menu
    public void close() {
        C0240.m9863(C0093.m3364(this));
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return C0127.m4947(this, C0099.m3763(C0093.m3364(this), i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return C0127.m4947(this, C0249.m10005(C0093.m3364(this), i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return C0161.m6741(C0093.m3364(this));
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return C0194.m7867(C0093.m3364(this), i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return C0115.m4228(C0093.m3364(this), i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return C0014.m474(C0093.m3364(this), i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        C0234.m9440(this, i);
        C0017.m594(C0093.m3364(this), i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        C0211.m8357(this, i);
        C0178.m7339(C0093.m3364(this), i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        C0112.m4125(C0093.m3364(this), i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        C0118.m4507(C0093.m3364(this), i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        C0115.m4254(C0093.m3364(this), i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        C0135.m5291(C0093.m3364(this), z);
    }

    @Override // android.view.Menu
    public int size() {
        return C0094.m3431(C0093.m3364(this));
    }
}
