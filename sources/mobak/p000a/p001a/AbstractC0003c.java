package mobak.p000a.p001a;

import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p000a.p002b.p003a.AbstractC0012e;
import mobak.p006c.C0069d;
import mobak.p006c.C0071f;

/* JADX INFO: renamed from: mobak.a.a.c */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/a/c.class */
public abstract class AbstractC0003c {

    /* JADX INFO: renamed from: a */
    private static short f57a = 0;

    /* JADX INFO: renamed from: a */
    protected boolean f58a;

    /* JADX INFO: renamed from: c */
    protected byte f59c;

    /* JADX INFO: renamed from: a */
    protected int f60a;

    /* JADX INFO: renamed from: a */
    protected String f61a;

    /* JADX INFO: renamed from: b */
    protected int f62b;

    /* JADX INFO: renamed from: b */
    protected String f63b;

    /* JADX INFO: renamed from: c */
    protected int f64c;

    /* JADX INFO: renamed from: d */
    protected int f65d;

    /* JADX INFO: renamed from: a */
    private int[] f66a;

    /* JADX INFO: renamed from: a */
    private String[] f67a;

    /* JADX INFO: renamed from: c */
    protected String f68c;

    /* JADX INFO: renamed from: d */
    private String f69d;

    /* JADX INFO: renamed from: e */
    protected int f70e = -1;

    /* JADX INFO: renamed from: b */
    private boolean f71b = true;

    /* JADX INFO: renamed from: b */
    public final boolean m58b() {
        return this.f58a;
    }

    /* JADX INFO: renamed from: c */
    public final void m59c(boolean z) {
        this.f58a = z;
    }

    /* JADX INFO: renamed from: a */
    public final int mo22a() {
        return this.f64c;
    }

    /* JADX INFO: renamed from: c */
    public void mo60c(int i) {
        this.f64c = i;
    }

    /* JADX INFO: renamed from: b */
    public final int mo23b() {
        return this.f60a;
    }

    /* JADX INFO: renamed from: d */
    public final void m61d(int i) {
        this.f60a = C0071f.m801a(i);
        this.f61a = String.valueOf(i);
    }

    /* JADX INFO: renamed from: c */
    public final int mo24c() {
        return this.f62b;
    }

    /* JADX INFO: renamed from: a */
    public final void m62a(int i, boolean z) {
        this.f62b = i;
        if (this.f62b < 0) {
            this.f62b = 0;
        }
        this.f63b = String.valueOf(this.f62b);
    }

    /* JADX INFO: renamed from: e */
    public final void m63e(int i) {
        m62a(i, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m64f(int i) {
        m65a(i, true, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m65a(int i, boolean z, boolean z2) {
        int i2 = (i <= 0 || Integer.MAX_VALUE - i >= this.f60a) ? this.f60a + i : 2147483646;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i2;
        if (z && i3 > this.f62b) {
            i3 = this.f62b;
        }
        if (z2 && i3 < 0) {
            i3 = 0;
        }
        m61d(i3);
    }

    /* JADX INFO: renamed from: f */
    public final byte m66f() {
        return this.f59c;
    }

    /* JADX INFO: renamed from: j */
    public final void m67j(byte b) {
        this.f59c = b;
    }

    /* JADX INFO: renamed from: d */
    public final int mo47d() {
        return this.f70e;
    }

    /* JADX INFO: renamed from: e */
    public final int m68e() {
        return this.f65d;
    }

    /* JADX INFO: renamed from: g */
    public final void m69g(int i) {
        this.f65d = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m70a(int[] iArr) {
        this.f66a = iArr;
        if (iArr == null || iArr.length <= 0) {
            this.f67a = null;
            return;
        }
        this.f67a = new String[iArr.length];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= iArr.length) {
                return;
            }
            this.f67a[b2] = String.valueOf(this.f66a[b2]);
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m71a(byte b) {
        if (this.f66a != null && b >= 0 && b < this.f66a.length) {
            return this.f66a[b];
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final String m72a(byte b) {
        return (this.f67a != null && b >= 0 && b < this.f67a.length) ? this.f67a[b] : "";
    }

    /* JADX INFO: renamed from: e */
    public abstract byte mo51e();

    /* JADX INFO: renamed from: a */
    public abstract boolean mo50a(AbstractC0003c abstractC0003c);

    /* JADX INFO: renamed from: b */
    public short mo57b() {
        return (short) 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m73b(String str) {
        this.f68c = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo52a(Graphics graphics, short s, short s2, short s3);

    /* JADX INFO: renamed from: a */
    public abstract void mo48a(C0035c c0035c, String str, short s);

    /* JADX INFO: renamed from: g */
    public byte mo74g() {
        return (byte) 0;
    }

    /* JADX INFO: renamed from: h */
    public byte mo75h() {
        return (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    public final String m76a() {
        return this.f69d;
    }

    /* JADX INFO: renamed from: c */
    public final void m77c(String str) {
        this.f69d = str;
    }

    /* JADX INFO: renamed from: a */
    public static final void m78a(Graphics graphics, short s, short s2, String str) {
        C0069d c0069d = AbstractC0041i.f441a;
        short sM781a = (short) (((s + 41) - c0069d.m781a(str)) - 2);
        short s3 = (short) (((s2 + 35) - c0069d.f634a) - 1);
        RunnableC0037e.m478a(graphics, 0);
        graphics.fillRect(sM781a - 1, s3, c0069d.m781a(str) + 2, c0069d.f634a);
        c0069d.m782a(graphics, str, sM781a, s3, 0);
    }

    /* JADX INFO: renamed from: b */
    public static final void m79b(Graphics graphics, short s, short s2, String str) {
        C0069d c0069d = AbstractC0041i.f445e;
        short sM781a = (short) (s + ((41 - c0069d.m781a(str)) / 2));
        short s3 = (short) (s2 + ((35 - c0069d.f634a) / 2));
        RunnableC0037e.m478a(graphics, 0);
        graphics.fillRect(sM781a - 1, s3 + 1, c0069d.m781a(str) + 2, c0069d.f634a - 1);
        c0069d.m782a(graphics, str, sM781a, s3, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m80a(Graphics graphics, short s, short s2, byte b) {
        if (b < 1 || b > 5) {
            return;
        }
        RunnableC0037e.m468a(graphics, C0050b.m638a(AbstractC0012e.f137a), 13 * (b - 1), 0, 13, 13, 0, (short) (s + 1), (short) ((s2 + 35) - 13), 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m81a(Graphics graphics, short s, short s2, String str, boolean z) {
        C0069d c0069d = AbstractC0041i.f448h;
        short s3 = (short) (s + 20);
        short s4 = (short) (s2 + 35 + (c0069d.f634a / 2));
        if (z) {
            if (f57a == 0) {
                f57a = C0050b.m633a("crystal.png");
            }
            RunnableC0037e.m466a(graphics, C0050b.m638a(f57a), (s3 - RunnableC0037e.m473a(f57a)) - (c0069d.m781a(str) / 2), (s4 - (RunnableC0037e.m474b(f57a) / 2)) + 1, 0);
        }
        c0069d.m782a(graphics, str, s3, s4, 3);
    }

    /* JADX INFO: renamed from: c */
    public static final void m82c(Graphics graphics, short s, short s2, String str) {
        C0069d c0069d = AbstractC0041i.f447g;
        short s3 = (short) (s + 2);
        RunnableC0037e.m478a(graphics, 14268500);
        graphics.fillRect(s3, s2 + 1, c0069d.m781a(str) + 2, c0069d.f634a - 1);
        c0069d.m782a(graphics, str, s3 + 1, s2, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m83a(int i, Graphics graphics, short s, short s2) {
        switch (i) {
            case 1:
                m78a(graphics, s, s2, "7");
                break;
            case 2:
                m79b(graphics, s, s2, "12");
                break;
            case 3:
                m80a(graphics, s, s2, (byte) 2);
                break;
            case 4:
                m81a(graphics, s, s2, "142", false);
                break;
            case 5:
                m82c(graphics, s, s2, "3");
                break;
            case 6:
                AbstractC0012e.m193a(graphics, s, s2, false, true);
                break;
            case 7:
                AbstractC0012e.m193a(graphics, s, s2, true, false);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo84a(byte b) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m85c() {
        return this.f71b;
    }

    /* JADX INFO: renamed from: d */
    public final void m86d(boolean z) {
        this.f71b = false;
    }
}
