package mobak.p006c;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.C0050b;
import mobak.Main2;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;

/* JADX INFO: renamed from: mobak.c.d */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/c/d.class */
public final class C0069d {

    /* JADX INFO: renamed from: a */
    private Image f632a;

    /* JADX INFO: renamed from: a */
    private short[] f633a;

    /* JADX INFO: renamed from: a */
    public int f634a;

    /* JADX INFO: renamed from: a */
    private static byte[] m780a(String str) throws IOException {
        InputStream resourceAsStream = Main2.f0a.getClass().getResourceAsStream(new StringBuffer().append("/mobak/res/").append(str).append(".png").toString());
        int iAvailable = resourceAsStream.available();
        byte[] bArr = new byte[iAvailable];
        DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
        int i = 0;
        do {
            int i2 = dataInputStream.read(bArr, i, bArr.length - i);
            i += i2;
            if (i2 == -1) {
                break;
            }
        } while (i < bArr.length);
        for (int i3 = i + 1; i3 < iAvailable; i3++) {
            bArr[i3] = 0;
        }
        dataInputStream.close();
        return bArr;
    }

    public C0069d(String str, byte b) {
        try {
            byte[] bArrM780a = m780a(new StringBuffer().append((int) b).append("pxd").toString());
            int length = bArrM780a.length;
            this.f633a = new short[length];
            for (int i = 0; i < length; i++) {
                this.f633a[i] = (short) (bArrM780a[i] & 255);
            }
            this.f632a = C0050b.m634a(new StringBuffer().append("/mobak/res/").append((int) b).append("px").append(str).append(".png").toString());
            this.f634a = RunnableC0037e.m477b(this.f632a) - 1;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("BFont").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m781a(String str) {
        if (str == null) {
            return 0;
        }
        int iM784a = 0;
        for (int i = 0; i < str.length(); i++) {
            iM784a += m784a(str.charAt(i)) + 1;
        }
        return iM784a - 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m782a(Graphics graphics, String str, int i, int i2, int i3) {
        if (graphics == null || str == null) {
            return;
        }
        int iM480b = RunnableC0037e.m480b(graphics);
        int iM481c = RunnableC0037e.m481c(graphics);
        int iM482d = RunnableC0037e.m482d(graphics);
        int iM483e = RunnableC0037e.m483e(graphics);
        if ((i3 & 1) == 1) {
            i -= m781a(str) / 2;
        } else if ((i3 & 8) == 8) {
            i -= m781a(str);
        }
        if ((i3 & 2) == 2) {
            i2 -= this.f634a / 2;
        } else if ((i3 & 32) == 32) {
            i2 -= this.f634a;
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            i += m785a(graphics, str.charAt(i4), i, i2, iM480b, iM481c, iM482d, iM483e) + 1;
        }
        graphics.setClip(iM480b, iM481c, iM482d, iM483e);
    }

    /* JADX INFO: renamed from: a */
    private static int m783a(int i) {
        int i2 = i;
        if (i > 848) {
            i2 -= 848;
        }
        if (i2 < 32 || i2 >= 256) {
            i2 = 32;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private int m784a(char c) {
        try {
            return this.f633a[(3 * (m783a((int) c) - 32)) + 2];
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("charWidth").append(e.toString()).toString());
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private final int m785a(Graphics graphics, char c, int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            int iM784a = m784a(c);
            int iM783a = m783a((int) c) - 32;
            int i7 = (256 * this.f633a[iM783a * 3]) + this.f633a[(iM783a * 3) + 1];
            graphics.setClip(i3, i4, i5, i6);
            graphics.clipRect(i, i2, iM784a, this.f634a);
            RunnableC0037e.m466a(graphics, this.f632a, i - i7, i2 - 1, 20);
            return iM784a;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("drawChar").append(e.toString()).toString());
            return 0;
        }
    }
}
