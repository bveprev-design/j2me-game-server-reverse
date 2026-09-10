package mobak.p000a.p001a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.C0050b;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p000a.p002b.p003a.AbstractC0012e;
import mobak.p006c.C0066a;
import mobak.p006c.C0071f;

/* JADX INFO: renamed from: mobak.a.a.a */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/a/a.class */
public final class C0001a extends AbstractC0003c {

    /* JADX INFO: renamed from: a */
    private static short f18a = -1;

    /* JADX INFO: renamed from: b */
    private static short f19b = -1;

    /* JADX INFO: renamed from: c */
    private static short f20c = -1;

    /* JADX INFO: renamed from: d */
    private static short f21d = -1;

    /* JADX INFO: renamed from: a */
    private static byte f22a = 0;

    /* JADX INFO: renamed from: e */
    private static short f23e = -1;

    /* JADX INFO: renamed from: b */
    private static byte f24b;

    /* JADX INFO: renamed from: d */
    private static byte f25d;

    /* JADX INFO: renamed from: e */
    private static byte f26e;

    /* JADX INFO: renamed from: f */
    private byte f27f;

    /* JADX INFO: renamed from: f */
    private short f28f;

    /* JADX INFO: renamed from: g */
    private byte f29g;

    /* JADX INFO: renamed from: h */
    private byte f30h;

    /* JADX INFO: renamed from: i */
    private byte f31i;

    /* JADX INFO: renamed from: j */
    private byte f32j;

    /* JADX INFO: renamed from: n */
    private short f40n;

    /* JADX INFO: renamed from: b */
    private boolean f41b;

    /* JADX INFO: renamed from: o */
    private short f43o;

    /* JADX INFO: renamed from: l */
    private byte f45l;

    /* JADX INFO: renamed from: m */
    private byte f47m;

    /* JADX INFO: renamed from: n */
    private byte f48n;

    /* JADX INFO: renamed from: o */
    private byte f49o;

    /* JADX INFO: renamed from: a */
    private Vector f50a;

    /* JADX INFO: renamed from: p */
    private byte f51p;

    /* JADX INFO: renamed from: g */
    private short f33g = 0;

    /* JADX INFO: renamed from: h */
    private short f34h = 0;

    /* JADX INFO: renamed from: i */
    private short f35i = 0;

    /* JADX INFO: renamed from: j */
    private short f36j = 0;

    /* JADX INFO: renamed from: k */
    private short f37k = 0;

    /* JADX INFO: renamed from: l */
    private short f38l = 0;

    /* JADX INFO: renamed from: m */
    private short f39m = 0;

    /* JADX INFO: renamed from: k */
    private byte f42k = -1;

    /* JADX INFO: renamed from: d */
    private String f44d = "0";

    /* JADX INFO: renamed from: c */
    private boolean f46c = false;

    /* JADX INFO: renamed from: b */
    private static String m20b(byte b) {
        if (b == 1) {
            return "\f7";
        }
        return b == 2 ? "\f2" : "\f1";
    }

    /* JADX INFO: renamed from: a */
    public static Image m21a(byte b) {
        if (b <= 3) {
            if (f18a == -1) {
                f18a = C0050b.m633a("unites1.png");
            }
            return C0050b.m638a(f18a);
        }
        if (f19b == -1) {
            f19b = C0050b.m633a("unites2.png");
        }
        return C0050b.m638a(f19b);
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final byte mo22a() {
        return this.f31i;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: b */
    public final byte mo23b() {
        return this.f32j;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: c */
    public final byte mo24c() {
        return this.f30h;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final short mo22a() {
        return (byte) this.f70e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25a() {
        return !(this.f35i == 0 && this.f36j == 0) && this.f37k > 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m26a(boolean z) {
        this.f41b = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m27a(byte b, byte b2) {
        this.f49o = b;
        this.f29g = b2;
    }

    /* JADX INFO: renamed from: a */
    public final void m28a(byte b) {
        this.f27f = b;
    }

    /* JADX INFO: renamed from: b */
    public final void m29b(byte b) {
        this.f32j = b;
    }

    /* JADX INFO: renamed from: c */
    public final void m30c(byte b) {
        this.f31i = b;
    }

    /* JADX INFO: renamed from: d */
    public final void m31d(byte b) {
        this.f47m = b;
    }

    /* JADX INFO: renamed from: a */
    public final void m32a(short s) {
        this.f33g = s;
    }

    /* JADX INFO: renamed from: b */
    public final void m33b(short s) {
        this.f34h = s;
    }

    /* JADX INFO: renamed from: c */
    public final void m34c(short s) {
        this.f35i = s;
    }

    /* JADX INFO: renamed from: d */
    public final void m35d(short s) {
        this.f36j = s;
    }

    /* JADX INFO: renamed from: e */
    public final void m36e(byte b) {
        this.f48n = b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37e(short s) {
        this.f38l = s;
    }

    /* JADX INFO: renamed from: f */
    public final void m38f(short s) {
        this.f39m = s;
    }

    /* JADX INFO: renamed from: g */
    public final void m39g(short s) {
        this.f28f = s;
    }

    /* JADX INFO: renamed from: h */
    public final void m40h(short s) {
        this.f40n = s;
    }

    /* JADX INFO: renamed from: f */
    public final void m41f(byte b) {
        this.f30h = b;
    }

    /* JADX INFO: renamed from: g */
    public final void m42g(byte b) {
        this.f70e = b;
    }

    /* JADX INFO: renamed from: b */
    public final void m43b(boolean z) {
        this.f46c = z;
    }

    /* JADX INFO: renamed from: i */
    public final void m44i(short s) {
        this.f37k = s;
    }

    /* JADX INFO: renamed from: a */
    public final void m45a(int i) {
        this.f43o = C0071f.m801a(mo24c() - i);
        this.f44d = String.valueOf((int) this.f43o);
    }

    /* JADX INFO: renamed from: h */
    public final void m46h(byte b) {
        this.f42k = b;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: d */
    public final byte mo47d() {
        return this.f42k;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final void mo48a(C0035c c0035c, String str, short s) {
        if (c0035c == null) {
            return;
        }
        c0035c.m408c();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(((AbstractC0003c) this).f68c);
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(C0066a.m773a(18)).append(": ").append(C0066a.m778a(m66f()));
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
        if (((short) (s & 2048)) == 2048) {
            stringBuffer.append(C0066a.m773a(108)).append(": ").append((int) this.f28f).append(" ").append(C0066a.m773a(110)).append(" ").append((int) this.f40n);
        } else {
            stringBuffer.append(C0066a.m773a(108)).append(": ").append((int) this.f28f);
        }
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(C0066a.m773a(109)).append(": ");
        if (this.f49o != 0) {
            stringBuffer.append(m20b(this.f49o));
        }
        stringBuffer.append((int) this.f29g);
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(C0066a.m773a(111)).append(": ");
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        if (this.f30h >= 1 && this.f30h <= 3) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append((int) this.f30h);
            stringBuffer.append("  ").append(C0066a.m774a(112, new String[]{stringBuffer2.toString()}));
        }
        if (this.f30h == -1) {
            stringBuffer.append("  ").append(C0066a.m773a(114));
        }
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(C0066a.m773a(47)).append(": ");
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        String strM20b = m20b(this.f47m);
        if (this.f35i != 0 || this.f36j != 0) {
            stringBuffer.append("  ").append("- ").append(C0066a.m773a(115)).append(": ").append(strM20b).append((int) this.f35i).append(" - ").append((int) this.f36j);
            c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
            stringBuffer.delete(0, stringBuffer.length());
            stringBuffer.append("     ").append(C0066a.m773a(163)).append(": ");
            stringBuffer.append((int) this.f37k);
            c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
            stringBuffer.delete(0, stringBuffer.length());
        }
        stringBuffer.append("  ").append("- ").append(C0066a.m773a(116)).append(": ").append(strM20b).append((int) this.f33g).append(" - ").append((int) this.f34h);
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        stringBuffer.append(C0066a.m773a(117)).append(": ");
        if (this.f48n != 0) {
            stringBuffer.append(m20b(this.f48n));
        }
        stringBuffer.append((int) this.f39m).append(" - ").append((int) this.f38l);
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        if (this.f50a == null || this.f50a.size() <= 0) {
            return;
        }
        stringBuffer.append(C0066a.m773a(71)).append(": ");
        c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
        stringBuffer.delete(0, stringBuffer.length());
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= this.f50a.size()) {
                return;
            }
            if (this.f50a.elementAt(s3) != null) {
                String string = this.f50a.elementAt(s3).toString();
                if (!string.equals("")) {
                    stringBuffer.append("   ").append(string);
                    c0035c.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                    stringBuffer.delete(0, stringBuffer.length());
                }
            }
            s2 = (short) (s3 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m49a(String str) {
        if (this.f50a == null) {
            this.f50a = new Vector();
        }
        this.f50a.addElement(str);
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final boolean mo50a(AbstractC0003c abstractC0003c) {
        return abstractC0003c != null && (abstractC0003c instanceof C0001a) && ((C0001a) abstractC0003c).f27f == this.f27f;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: e */
    public final byte mo51e() {
        return (byte) 1;
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: a */
    public final void mo52a(Graphics graphics, short s, short s2, short s3) {
        if (graphics == null) {
            return;
        }
        if ((s3 & 32) != 32) {
            m53a(graphics, this, s, s2, s3);
            return;
        }
        m53a(graphics, this, s, s2, s3);
        if ((s3 & 64) == 64) {
            AbstractC0012e.m193a(graphics, s, s2, !((AbstractC0003c) this).f58a, ((AbstractC0003c) this).f58a);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m53a(Graphics graphics, C0001a c0001a, short s, short s2, short s3) {
        byte bM640a;
        short s4;
        byte bM781a;
        byte b;
        Image imageM638a;
        Image imageM21a;
        boolean z = (s3 & 128) == 128;
        short sM480b = (short) RunnableC0037e.m480b(graphics);
        short sM481c = (short) RunnableC0037e.m481c(graphics);
        short sM482d = (short) RunnableC0037e.m482d(graphics);
        short sM483e = (short) RunnableC0037e.m483e(graphics);
        if (z) {
            s4 = 0;
            bM640a = 0;
            bM781a = (byte) (34 - AbstractC0041i.f441a.m781a(((AbstractC0003c) c0001a).f63b));
            b = (byte) (28 - AbstractC0041i.f441a.f634a);
        } else {
            if ((s3 & 1) == 1) {
                AbstractC0012e.m184a(graphics, (int) s, (int) s2, 1);
            } else if ((s3 & 1024) == 1024) {
                AbstractC0012e.m184a(graphics, (int) s, (int) s2, 2);
            } else {
                AbstractC0012e.m184a(graphics, (int) s, (int) s2, 0);
            }
            bM640a = (byte) (20 - C0050b.m640a(c0001a.m66f(), c0001a.mo22a()));
            s4 = 4;
            bM781a = (byte) (41 - AbstractC0041i.f441a.m781a(((AbstractC0003c) c0001a).f63b));
            b = (byte) (35 - AbstractC0041i.f441a.f634a);
            graphics.setClip(s + 1, s2, 38, 35 + AbstractC0041i.f448h.f634a);
        }
        if (c0001a.f46c || !((AbstractC0003c) c0001a).f58a) {
            if (c0001a.m66f() <= 3) {
                if (f20c == -1) {
                    f20c = C0050b.m633a("enemy1.png");
                }
                imageM638a = C0050b.m638a(f20c);
            } else {
                if (f21d == -1) {
                    f21d = C0050b.m633a("enemy2.png");
                }
                imageM638a = C0050b.m638a(f21d);
            }
            imageM21a = imageM638a;
        } else {
            imageM21a = m21a(c0001a.m66f());
        }
        byte bM66f = c0001a.m66f();
        RunnableC0037e.m468a(graphics, imageM21a, 50 * c0001a.mo22a(), (bM66f > 3 ? (byte) (bM66f - 4) : (byte) (bM66f - 1)) * 28, 50, 28, 0, s + bM640a, s2 + s4, 0);
        if ((s3 & 4) == 4) {
            AbstractC0003c.m80a(graphics, s, s2, c0001a.m66f());
        }
        if ((s3 & 2) == 2) {
            if (z) {
                RunnableC0037e.m478a(graphics, 0);
                graphics.fillRect((s + bM781a) - 2, s2 + b, AbstractC0041i.f441a.m781a(((AbstractC0003c) c0001a).f63b) + 1, AbstractC0041i.f441a.f634a);
                AbstractC0041i.f441a.m782a(graphics, ((AbstractC0003c) c0001a).f63b, (s + bM781a) - 1, s2 + b, 0);
            } else {
                AbstractC0003c.m78a(graphics, s, s2, ((AbstractC0003c) c0001a).f63b);
            }
        }
        if ((s3 & 16) == 16 && ((AbstractC0003c) c0001a).f60a > 0) {
            AbstractC0003c.m79b(graphics, s, s2, ((AbstractC0003c) c0001a).f61a);
        }
        if ((s3 & 768) != 0 && !z) {
            AbstractC0003c.m81a(graphics, s, s2, c0001a.m72a((byte) (((s3 & 768) >> 8) - 1)), false);
        }
        if (z) {
            if (c0001a.f41b) {
                AbstractC0041i.m537a(graphics, (byte) 6, (short) (s + 8), (short) ((s2 - 1) + f22a), 0);
                byte b2 = (byte) (f22a + 1);
                f22a = b2;
                if (b2 > 7) {
                    f22a = (byte) 0;
                }
            }
            if (c0001a.f42k >= 0) {
                if (f23e == -1) {
                    short sM633a = C0050b.m633a("fight-slides_a.png");
                    f23e = sM633a;
                    f25d = (byte) RunnableC0037e.m474b(sM633a);
                    f26e = (byte) RunnableC0037e.m474b(f23e);
                    f24b = (byte) (RunnableC0037e.m473a(f23e) / f26e);
                }
                if (c0001a.f42k < f24b && c0001a.f42k >= 0) {
                    RunnableC0037e.m470a(graphics, f23e, f26e * c0001a.f42k, 0, f26e, f25d, 0, s, s2, 0);
                }
                byte bM781a2 = (byte) (34 - AbstractC0041i.f441a.m781a(c0001a.f44d));
                byte b3 = (byte) (28 - AbstractC0041i.f441a.f634a);
                RunnableC0037e.m478a(graphics, 16711680);
                graphics.fillRect((s + bM781a2) - 1, (s2 + b3) - c0001a.f45l, AbstractC0041i.f441a.m781a(c0001a.f44d) + 2, AbstractC0041i.f441a.f634a);
                AbstractC0041i.f441a.m782a(graphics, c0001a.f44d, s + bM781a2, (s2 + b3) - c0001a.f45l, 0);
                c0001a.f45l = (byte) (c0001a.f45l + 1);
            }
        }
        if (!z) {
            graphics.setClip(sM480b, sM481c, sM482d, sM483e);
            return;
        }
        if ((c0001a.f51p & 1) == 1) {
            AbstractC0041i.m537a(graphics, (byte) 2, (short) (s + bM640a), (short) (s2 + s4 + 10), 0);
        }
        if ((c0001a.f51p & 2) == 2) {
            AbstractC0041i.m537a(graphics, (byte) 9, (short) (s + bM640a + 5), (short) (s2 + s4 + 10), 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m54b(int i) {
        m62a(i, true);
        this.f43o = (short) 0;
        this.f44d = "0";
        this.f45l = (byte) 0;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unitGroup[").append((int) this.f27f).append("\n");
        stringBuffer.append("quantity[").append(((AbstractC0003c) this).f62b).append("\n");
        stringBuffer.append("raceId").append((int) ((AbstractC0003c) this).f59c).append("\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: i */
    public final void m55i(byte b) {
        this.f51p = b;
    }

    /* JADX INFO: renamed from: a */
    public final void m56a() {
        if (this.f50a != null) {
            this.f50a.removeAllElements();
        }
    }

    @Override // mobak.p000a.p001a.AbstractC0003c
    /* JADX INFO: renamed from: b */
    public final short mo57b() {
        return this.f40n;
    }
}
