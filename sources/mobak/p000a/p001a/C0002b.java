package mobak.p000a.p001a;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.C0038f;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p000a.p002b.p003a.AbstractC0012e;

/* JADX INFO: renamed from: mobak.a.a.b */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/a/b.class */
public final class C0002b extends AbstractC0003c {

    /* JADX INFO: renamed from: d */
    private String f52d;

    /* JADX INFO: renamed from: a */
    public byte f53a;

    /* JADX INFO: renamed from: b */
    public byte f54b;

    /* JADX INFO: renamed from: d */
    private byte f55d;

    /* JADX INFO: renamed from: a */
    public byte[] f56a;

    public C0002b(short s, byte b, byte b2, byte b3, String str, int i) {
        byte b4;
        ((AbstractC0003c) this).f65d = i;
        ((AbstractC0003c) this).f64c = s;
        this.f53a = b;
        this.f54b = b2;
        byte b5 = b3;
        this.f55d = b5;
        byte b6 = 0;
        this.f56a = null;
        while (b5 != 0) {
            if (((byte) (b5 & 1)) == 1) {
                b6 = (byte) (b6 + 1);
            }
            b5 = (byte) (b5 >> 1);
        }
        if (b6 > 0) {
            if (b6 > 1) {
                this.f56a = new byte[b6 + 1];
                b4 = 1;
                this.f56a[0] = 51;
            } else {
                this.f56a = new byte[b6];
                b4 = 0;
            }
            if (((byte) (this.f55d & 1)) == 1) {
                byte b7 = b4;
                b4 = (byte) (b4 + 1);
                this.f56a[b7] = 81;
            }
            if (((byte) (this.f55d & 2)) == 2) {
                byte b8 = b4;
                b4 = (byte) (b4 + 1);
                this.f56a[b8] = 59;
            }
            if (((byte) (this.f55d & 4)) == 4) {
                this.f56a[b4] = 89;
            }
        }
        this.f52d = str;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final void mo52a(Graphics graphics, short s, short s2, short s3) {
        if (graphics == null) {
            return;
        }
        Image imageM488a = C0038f.m488a((byte) ((AbstractC0003c) this).f64c);
        int i = 12;
        byte b = (byte) ((AbstractC0003c) this).f64c;
        byte b2 = b;
        if (b >= 12) {
            b2 = (byte) (b2 - 12);
            i = 9;
        }
        short sM476a = (short) (RunnableC0037e.m476a(imageM488a) / i);
        short sM477b = (short) RunnableC0037e.m477b(imageM488a);
        if (imageM488a == null) {
            return;
        }
        short sM480b = (short) RunnableC0037e.m480b(graphics);
        short sM481c = (short) RunnableC0037e.m481c(graphics);
        short sM482d = (short) RunnableC0037e.m482d(graphics);
        short sM483e = (short) RunnableC0037e.m483e(graphics);
        graphics.setClip(s, s2, 42, 37);
        AbstractC0012e.m184a(graphics, (int) s, (int) s2, (s3 & 1) == 1 ? 1 : 0);
        RunnableC0037e.m468a(graphics, imageM488a, b2 * sM476a, 0, sM476a, sM477b, 0, s + 7, s2 + 4, 0);
        graphics.setClip(sM480b, sM481c, sM482d, sM483e);
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final void mo48a(C0035c c0035c, String str, short s) {
        if (c0035c == null) {
            return;
        }
        c0035c.m408c();
        if (str != null && !str.equals("")) {
            c0035c.m402a(str, AbstractC0041i.f442b, false, -1);
        }
        c0035c.m402a(this.f52d, AbstractC0041i.f442b, false, -1);
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final boolean mo50a(AbstractC0003c abstractC0003c) {
        return false;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: e */
    public final byte mo51e() {
        return (byte) 0;
    }
}
