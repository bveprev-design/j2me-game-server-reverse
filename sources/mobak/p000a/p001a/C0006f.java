package mobak.p000a.p001a;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.C0050b;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p000a.p002b.p003a.AbstractC0012e;
import mobak.p004b.C0063c;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.a.f */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/a/f.class */
public final class C0006f extends AbstractC0003c {

    /* JADX INFO: renamed from: c */
    private boolean f111c;

    /* JADX INFO: renamed from: d */
    private String f117d;

    /* JADX INFO: renamed from: e */
    private String f118e;

    /* JADX INFO: renamed from: e */
    private byte f121e;

    /* JADX INFO: renamed from: f */
    private byte f122f;

    /* JADX INFO: renamed from: a */
    public C0004d[] f123a;

    /* JADX INFO: renamed from: b */
    private static boolean f110b = true;

    /* JADX INFO: renamed from: a */
    private static short f112a = -1;

    /* JADX INFO: renamed from: b */
    private static short f113b = -1;

    /* JADX INFO: renamed from: c */
    private static short f114c = -1;

    /* JADX INFO: renamed from: a */
    private byte f115a = -2;

    /* JADX INFO: renamed from: b */
    private byte f116b = -1;

    /* JADX INFO: renamed from: d */
    private byte f119d = -1;

    /* JADX INFO: renamed from: f */
    private int f120f = -1;

    /* JADX INFO: renamed from: a */
    public static void m146a() {
        f110b = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m147b() {
        f110b = true;
    }

    /* JADX INFO: renamed from: a */
    public static Image m148a(int i) {
        if (i <= 14) {
            if (f112a == -1) {
                f112a = C0050b.m633a("item-1.png");
            }
            return C0050b.m638a(f112a);
        }
        if (f113b == -1) {
            f113b = C0050b.m633a("item-2.png");
        }
        return C0050b.m638a(f113b);
    }

    public C0006f(boolean z) {
        this.f111c = z;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: c */
    public final void mo60c(int i) {
        try {
            ((AbstractC0003c) this).f64c = i;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("set_imageCode").append(e.toString()).toString());
        }
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final byte mo22a() {
        return this.f115a;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: b */
    public final byte mo23b() {
        return this.f116b;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: h */
    public final byte mo75h() {
        return this.f119d;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final boolean mo50a(AbstractC0003c abstractC0003c) {
        try {
            if (abstractC0003c.mo51e() != 2) {
                return false;
            }
            C0006f c0006f = (C0006f) abstractC0003c;
            return this.f120f == c0006f.f120f && this.f116b == c0006f.f116b;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("equal").append(e.toString()).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m149a(Graphics graphics, C0006f c0006f, short s, short s2, short s3) {
        Image imageM148a;
        short s4 = (short) (s + 2 + 1);
        short s5 = (short) (s2 + 2);
        if ((s3 & 1) == 1) {
            AbstractC0012e.m184a(graphics, (int) s, (int) s2, (s3 & 1024) == 1024 ? 2 : 1);
        } else {
            AbstractC0012e.m184a(graphics, (int) s, (int) s2, 0);
        }
        if (((byte) (c0006f.f115a & 1)) == 1) {
            if (f114c == -1) {
                f114c = C0050b.m633a("magic.png");
            }
            imageM148a = C0050b.m638a(f114c);
        } else {
            imageM148a = m148a(((AbstractC0003c) c0006f).f64c);
        }
        if (((AbstractC0003c) c0006f).f64c <= 14) {
            RunnableC0037e.m468a(graphics, imageM148a, ((AbstractC0003c) c0006f).f64c * 37, 0, 37, 31, 0, s4, s5, 0);
        } else {
            RunnableC0037e.m468a(graphics, imageM148a, (((AbstractC0003c) c0006f).f64c - 15) * 37, 0, 37, 31, 0, s4, s5, 0);
        }
        if ((s3 & 4) == 4) {
            AbstractC0003c.m80a(graphics, s, s2, ((AbstractC0003c) c0006f).f59c);
        }
        if ((s3 & 8) == 8) {
            AbstractC0003c.m82c(graphics, s, s2, c0006f.f117d);
        }
        AbstractC0041i.f441a.m781a(((AbstractC0003c) c0006f).f63b);
        if ((s3 & 2) == 2) {
            AbstractC0003c.m78a(graphics, s, s2, ((AbstractC0003c) c0006f).f63b);
        }
        if ((s3 & 16) != 0 && ((AbstractC0003c) c0006f).f60a > 0) {
            AbstractC0003c.m79b(graphics, s, s2, ((AbstractC0003c) c0006f).f61a);
        }
        if ((s3 & 768) != 0) {
            AbstractC0003c.m81a(graphics, s, s2, c0006f.m72a((byte) (((s3 & 768) >> 8) - 1)), c0006f.f111c);
        }
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: e */
    public final byte mo51e() {
        return (byte) 2;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: g */
    public final byte mo74g() {
        return this.f121e;
    }

    /* JADX INFO: renamed from: a */
    public final void m150a(byte b) {
        this.f119d = b;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final void mo48a(C0035c c0035c, String str, short s) {
        if (c0035c == null || this.f118e == null || this.f118e.equals("")) {
            return;
        }
        try {
            if (c0035c.m409a()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(((AbstractC0003c) this).f68c).append("\n");
                c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(C0066a.m773a(18)).append(": ").append(C0066a.m778a(m66f())).append("\n");
                c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                stringBuffer.delete(0, stringBuffer.length());
                c0035c.f352a += AbstractC0041i.f442b.f634a / 2;
                if (str != null && !str.equals("")) {
                    stringBuffer.append(str).append("\n");
                    c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                    stringBuffer.delete(0, stringBuffer.length());
                }
                c0035c.f352a += AbstractC0041i.f442b.f634a / 2;
                if (!m76a().equals("") && ((short) (s & 4096)) == 4096) {
                    stringBuffer.append(C0066a.m773a(174)).append(": ").append(m76a());
                    c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                    stringBuffer.delete(0, stringBuffer.length());
                }
                if (this.f123a != null && this.f123a.length > 0) {
                    stringBuffer.append(C0066a.m773a(55)).append(":\n");
                    c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                    stringBuffer.delete(0, stringBuffer.length());
                    for (byte b = 0; b < this.f123a.length; b = (byte) (b + 1)) {
                        stringBuffer.append(this.f123a[b].f74a).append(": ");
                        if (this.f123a[b].f75b > 0) {
                            stringBuffer.append("+");
                        } else {
                            stringBuffer.append("-");
                        }
                        stringBuffer.append(Math.abs(this.f123a[b].f75b)).append("\n");
                        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                        stringBuffer.delete(0, stringBuffer.length());
                    }
                }
                stringBuffer.append(this.f118e).append("\n");
                c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                stringBuffer.delete(0, stringBuffer.length());
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getDescription").append(e.toString()).toString());
        }
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final void mo52a(Graphics graphics, short s, short s2, short s3) {
        if (graphics == null) {
            return;
        }
        if ((s3 & 32) != 32) {
            m149a(graphics, this, s, s2, s3);
            return;
        }
        m149a(graphics, this, s, s2, s3);
        if ((s3 & 64) == 64) {
            if (f110b) {
                AbstractC0012e.m193a(graphics, s, s2, !((AbstractC0003c) this).f58a, this.f119d > 0);
            } else {
                AbstractC0012e.m193a(graphics, s, s2, !((AbstractC0003c) this).f58a, ((AbstractC0003c) this).f58a);
            }
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id[").append("_id").append("\n");
        stringBuffer.append("race[").append("_raceId").append("\n");
        stringBuffer.append("level[").append("_level").append("\n");
        stringBuffer.append("quantity[").append("_quantity").append("\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m151a(int i) {
        ((AbstractC0003c) this).f70e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m152a(String str) {
        this.f118e = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m153b(byte b) {
        this.f116b = b;
        this.f117d = String.valueOf((int) b);
    }

    /* JADX INFO: renamed from: c */
    public final void m154c(byte b) {
        this.f121e = b;
    }

    /* JADX INFO: renamed from: b */
    public final void m155b(int i) {
        this.f120f = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m156d(byte b) {
        this.f115a = b;
    }

    /* JADX INFO: renamed from: e */
    public final void m157e(byte b) {
        this.f122f = b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m158b(byte b) {
        return ((byte) (this.f122f & b)) == b;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final boolean mo84a(byte b) {
        return (this.f115a & b) > 0;
    }
}
