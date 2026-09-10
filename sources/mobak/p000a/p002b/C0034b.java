package mobak.p000a.p002b;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.C0050b;
import mobak.Main2;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.p003a.AbstractC0012e;
import mobak.p000a.p002b.p003a.C0023p;
import mobak.p000a.p002b.p003a.C0025r;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.b */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/b.class */
public final class C0034b extends AbstractC0041i {

    /* JADX INFO: renamed from: a */
    private static int f323a;

    /* JADX INFO: renamed from: b */
    private static int f324b;

    /* JADX INFO: renamed from: b */
    private byte f325b;

    /* JADX INFO: renamed from: c */
    private byte f326c;

    /* JADX INFO: renamed from: a */
    private byte[][] f332a;

    /* JADX INFO: renamed from: b */
    private byte[][] f333b;

    /* JADX INFO: renamed from: f */
    private byte f334f = -1;

    /* JADX INFO: renamed from: c */
    private int f335c = -1;

    /* JADX INFO: renamed from: a */
    private boolean f336a = false;

    /* JADX INFO: renamed from: g */
    private byte f337g = 0;

    /* JADX INFO: renamed from: a */
    private static byte f322a = 5;

    /* JADX INFO: renamed from: a */
    private static short f327a = -1;

    /* JADX INFO: renamed from: b */
    private static short f328b = -1;

    /* JADX INFO: renamed from: c */
    private static short f329c = -1;

    /* JADX INFO: renamed from: d */
    private static short f330d = -1;

    /* JADX INFO: renamed from: e */
    private static short f331e = -1;

    public C0034b() {
        AbstractC0041i.m538f();
        f323a = 0;
        f324b = 0;
        f327a = C0050b.m633a("decorWater.png");
        f328b = C0050b.m633a("decorRocks.png");
        f329c = C0050b.m633a("decorSand.png");
        f330d = C0050b.m633a("decorSnow.png");
        f331e = C0050b.m633a("decorGrass.png");
        ((AbstractC0041i) this).f456a = new C0025r();
        ((AbstractC0041i) this).f456a.m283a(true, (byte) 8, (short) 94);
        ((AbstractC0041i) this).f456a.m283a(true, (byte) 1, (short) 69);
        ((AbstractC0041i) this).f456a.m283a(true, (byte) 85, (short) 93);
        ((AbstractC0041i) this).f456a.m283a(true, (byte) 88, (short) 52);
        ((AbstractC0041i) this).f456a.m283a(true, (byte) 87, (short) 95);
        ((AbstractC0041i) this).f456a.m283a(true, (byte) 102, (short) 181);
        ((AbstractC0041i) this).f456a.m283a(false, (byte) 64, (short) 1);
        ((AbstractC0041i) this).f456a.m283a(false, (byte) 89, (short) 98);
        ((AbstractC0041i) this).f456a.m283a(false, (byte) 94, (short) 38);
        ((AbstractC0041i) this).f456a.m283a(false, (byte) 76, (short) 100);
        ((AbstractC0041i) this).f456a.m283a(false, (byte) 95, (short) 118);
        ((AbstractC0041i) this).f456a.m283a(false, (byte) 97, (short) 81);
        ((AbstractC0041i) this).f456a.m283a(false, (byte) 98, (short) 77);
        m534e((byte) 9);
        this.f463k = (short) -100;
        if (C0005e.f76a != null) {
            m527d(C0005e.f76a.m143e());
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        try {
            if (C0050b.m621a()) {
                if (C0005e.f76a.m100b() && this.f333b != null && this.f333b.length > 0 && this.f334f >= 0 && this.f334f < this.f333b.length) {
                    C0005e.f76a.m96a(this.f333b[this.f334f][0], this.f333b[this.f334f][1]);
                    if (this.f334f != this.f333b.length - 1) {
                        m363a(this.f333b[this.f334f][0], this.f333b[this.f334f][1], false);
                    }
                    this.f334f = (byte) (this.f334f + 1);
                } else if (this.f333b != null && this.f334f >= this.f333b.length) {
                    try {
                        m364b();
                        m362a((byte[][]) null);
                        AbstractC0041i.m539g();
                        m385b();
                    } catch (Exception e) {
                        C0063c.m746a(new StringBuffer().append("hero moveEnd: ").append(e.getMessage()).toString());
                    }
                }
                byte b = (byte) (f323a / 25);
                byte b2 = b;
                if (b < 0) {
                    b2 = 0;
                }
                byte b3 = (byte) (f324b / 25);
                byte b4 = b3;
                if (b3 < 0) {
                    b4 = 0;
                }
                byte bM424b = (byte) (b2 + RunnableC0037e.f360a.m424b());
                byte b5 = bM424b;
                if (bM424b >= 50) {
                    b5 = 49;
                }
                byte bM425c = (byte) (b4 + RunnableC0037e.f360a.m425c());
                byte b6 = bM425c;
                if (bM425c >= 50) {
                    b6 = 49;
                }
                if (b6 >= 47) {
                    RunnableC0037e.m478a(graphics, 0);
                    graphics.fillRect(0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
                }
                m377a(graphics, b2, b4, b5, b6);
                m365c(graphics);
                ((AbstractC0041i) this).f456a.m291a(graphics);
                mo168a();
                m535a(graphics, (short) ((m378a() - 8) - f323a), (short) ((m379b() - 8) - f324b));
            }
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append("strategical ").append(e2.getMessage()).toString());
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case -2:
                m392a((byte) 1);
                return true;
            case 1:
                m392a((byte) 0);
                return true;
            case 3:
            case 10:
                return true;
            case 8:
                m392a((byte) 3);
                return true;
            case 47:
                m392a((byte) 4);
                return true;
            case 58:
                m392a((byte) 2);
                return true;
            case 59:
                m390i();
                return true;
            case 71:
                C0038f c0038fM605a = C0050b.m605a(this.f335c);
                if (c0038fM605a == null || c0038fM605a.m503c() != 1) {
                    return true;
                }
                C0005e.f76a.f90b = c0038fM605a.m500a();
                RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m186a((short) -12), true);
                return true;
            case 75:
                C0038f c0038fM606a = C0050b.m606a(this.f325b, this.f326c);
                if (c0038fM606a == null) {
                    return true;
                }
                if (c0038fM606a.m503c() != 2) {
                    c0038fM606a.m512c();
                    return true;
                }
                C0058g c0058g = new C0058g(C0059h.f576a[84]);
                c0058g.m668a(C0059h.f576a[5]);
                c0058g.m670a(c0038fM606a.m500a());
                C0063c.f597a.m749a(c0058g);
                return true;
            case 76:
                try {
                    C0063c.f597a.m749a(new C0058g(C0059h.f576a[51], (short) 0, (short) 0));
                    return true;
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("keyPressedSS2").append(e.toString()).toString());
                    return true;
                }
            case 89:
                m363a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), true);
                return true;
            case 94:
                RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m185b(), true);
                return true;
            case 98:
                try {
                    C0058g c0058g2 = new C0058g(C0059h.f576a[62], (short) 0, C0059h.f576a[62]);
                    c0058g2.m672a((byte) 3);
                    C0063c.f597a.m749a(c0058g2);
                    return true;
                } catch (Exception e2) {
                    C0063c.m746a(new StringBuffer().append("keyPressed: ").append(e2.getMessage()).toString());
                    return true;
                }
            case 99:
                C0038f c0038fM605a2 = C0050b.m605a(this.f335c);
                if (c0038fM605a2 == null) {
                    return true;
                }
                C0058g c0058g3 = new C0058g(C0059h.f576a[66], (short) 0, C0059h.f576a[5]);
                c0058g3.m670a(c0038fM605a2.m500a());
                C0063c.f597a.m749a(c0058g3);
                return true;
            case 102:
                C0005e.m137a();
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final void mo202a(int i) {
        if (C0005e.f76a.m100b()) {
            return;
        }
        if (RunnableC0037e.f360a.getGameAction(i) == 1) {
            this.f326c = (byte) (this.f326c - 1);
            if (this.f326c < 0) {
                this.f326c = (byte) 0;
            }
            if (m379b() < f324b) {
                int i2 = f324b - 25;
                f324b = i2;
                if (i2 < 0) {
                    f324b = 0;
                }
            }
        } else if (RunnableC0037e.f360a.getGameAction(i) == 6) {
            this.f326c = (byte) (this.f326c + 1);
            if (this.f326c >= 50) {
                this.f326c = (byte) 49;
            }
            if (m379b() > f324b + (RunnableC0037e.f360a.getHeight() - C0025r.m274a())) {
                int i3 = f324b + 25;
                f324b = i3;
                if ((i3 + RunnableC0037e.f360a.getHeight()) - C0025r.m274a() > 1250) {
                    f324b = (1250 - RunnableC0037e.f360a.getHeight()) + C0025r.m274a();
                }
            }
        } else if (RunnableC0037e.f360a.getGameAction(i) == 2) {
            this.f325b = (byte) (this.f325b - 1);
            if (this.f325b < 0) {
                this.f325b = (byte) 0;
            }
            if (m378a() < f323a) {
                int i4 = f323a - 25;
                f323a = i4;
                if (i4 < 0) {
                    f323a = 0;
                }
            }
        } else if (RunnableC0037e.f360a.getGameAction(i) == 5) {
            this.f325b = (byte) (this.f325b + 1);
            if (this.f325b >= 50) {
                this.f325b = (byte) 49;
            }
            if (m378a() > f323a + RunnableC0037e.f360a.getWidth()) {
                int i5 = f323a + 25;
                f323a = i5;
                if (i5 + RunnableC0037e.f360a.getWidth() > 1250) {
                    f323a = 1250 - RunnableC0037e.f360a.getWidth();
                }
            }
        }
        m361n();
    }

    /* JADX INFO: renamed from: n */
    private void m361n() {
        m362a((byte[][]) null);
        m385b();
        if (this.f325b == C0005e.f76a.m97a() && this.f326c == C0005e.f76a.m98b()) {
            return;
        }
        if (C0050b.m611a(this.f325b, this.f326c) < 0) {
            if (C0050b.m631b(C0050b.m624a(this.f325b, this.f326c))) {
                m362a(m387a(this.f325b, this.f326c));
                return;
            } else {
                m362a((byte[][]) null);
                return;
            }
        }
        m362a((byte[][]) null);
        if ((Math.abs(this.f325b - C0005e.f76a.m97a()) == 1 && this.f326c - C0005e.f76a.m98b() == 0) || (Math.abs(this.f326c - C0005e.f76a.m98b()) == 1 && this.f325b - C0005e.f76a.m97a() == 0)) {
            m362a(new byte[][]{new byte[]{C0005e.f76a.m97a(), C0005e.f76a.m98b()}});
            return;
        }
        if (this.f332a == null) {
            return;
        }
        short sM382a = m382a(this.f325b);
        short sM383b = m383b(this.f326c);
        if (sM382a < 0 || sM382a >= this.f332a.length || sM383b < 0 || sM383b >= this.f332a[sM382a].length) {
            return;
        }
        byte[] bArr = {-1, -1, -1, -1};
        if (sM382a - 1 >= 0) {
            bArr[0] = this.f332a[sM382a - 1][sM383b];
        }
        if (sM382a + 1 < this.f332a.length) {
            bArr[1] = this.f332a[sM382a + 1][sM383b];
        }
        if (sM383b + 1 < this.f332a[sM382a].length) {
            bArr[2] = this.f332a[sM382a][sM383b + 1];
        }
        if (sM383b - 1 >= 0) {
            bArr[3] = this.f332a[sM382a][sM383b - 1];
        }
        byte b = 0;
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bArr.length) {
                break;
            }
            if (bArr[b3] < bArr[b] && bArr[b3] > 0) {
                b = b3;
            }
            b2 = (byte) (b3 + 1);
        }
        if (bArr[b] < 0) {
            return;
        }
        byte[][] bArrM387a = null;
        switch (b) {
            case 0:
                bArrM387a = m387a((byte) (this.f325b - 1), this.f326c);
                break;
            case 1:
                bArrM387a = m387a((byte) (this.f325b + 1), this.f326c);
                break;
            case 2:
                bArrM387a = m387a(this.f325b, (byte) (this.f326c + 1));
                break;
            case 3:
                bArrM387a = m387a(this.f325b, (byte) (this.f326c - 1));
                break;
        }
        m362a(bArrM387a);
    }

    /* JADX INFO: renamed from: a */
    private void m362a(byte[][] bArr) {
        synchronized (C0005e.f76a) {
            this.f333b = bArr;
            if (this.f333b != null) {
                this.f334f = (byte) 0;
            } else {
                this.f334f = (byte) -1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m363a(byte b, byte b2, boolean z) {
        if (z) {
            this.f325b = b;
            this.f326c = b2;
            m362a(m387a(this.f325b, this.f326c));
        }
        f323a = b * 25;
        f324b = b2 * 25;
        byte width = (byte) (RunnableC0037e.f360a.getWidth() / 25);
        byte height = (byte) ((RunnableC0037e.f360a.getHeight() - C0025r.m274a()) / 25);
        f323a -= (width / 2) * 25;
        f324b -= (height / 2) * 25;
        if (f323a < 0) {
            f323a = 0;
        }
        if (f324b < 0) {
            f324b = 0;
        }
        if (f323a + RunnableC0037e.f360a.getWidth() > 1250) {
            f323a = 1250 - RunnableC0037e.f360a.getWidth();
        }
        if ((f324b + RunnableC0037e.f360a.getHeight()) - C0025r.m274a() > 1250) {
            f324b = (1250 - RunnableC0037e.f360a.getHeight()) + C0025r.m274a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [mobak.a.b.b] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX INFO: renamed from: b */
    private boolean m364b() {
        try {
            byte b = this.f333b[this.f333b.length - 1][0];
            byte b2 = this.f333b[this.f333b.length - 1][1];
            C0005e.f76a.m99a(false);
            m534e((byte) 0);
            C0058g c0058g = new C0058g(C0059h.f576a[18], (short) 2, (short) 0);
            if (this.f337g == 1) {
                C0005e.f76a.m96a(b, b2);
            }
            c0058g.m672a(C0005e.f76a.m97a());
            c0058g.m672a(C0005e.f76a.m98b());
            C0063c.f597a.m749a(c0058g);
            if (this.f337g != 0) {
                byte b3 = this.f337g;
                this.f337g = (byte) 0;
                switch (b3) {
                    case 1:
                        m389h();
                        this.f336a = false;
                        return true;
                    case 2:
                        m391j();
                        this.f336a = false;
                        m363a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), true);
                        return true;
                    case 3:
                        ?? M749a = this;
                        try {
                            C0058g c0058g2 = new C0058g(C0059h.f576a[29], (short) 3, C0059h.f576a[21], true);
                            if (M749a.f325b == 0) {
                                c0058g2.m672a((byte) 8);
                            } else if (M749a.f326c == 0) {
                                c0058g2.m672a((byte) 9);
                            } else if (M749a.f325b == 49) {
                                c0058g2.m672a((byte) 10);
                            } else {
                                c0058g2.m672a((byte) 11);
                            }
                            c0058g2.m672a(M749a.f325b);
                            c0058g2.m672a(M749a.f326c);
                            AbstractC0041i.m538f();
                            M749a = C0063c.f597a.m749a(c0058g2);
                            break;
                        } catch (Exception e) {
                            C0063c.m746a(M749a.getMessage());
                        }
                        this.f336a = false;
                        return true;
                    case 4:
                        m388g();
                        this.f336a = false;
                        return true;
                }
                C0063c.m746a(new StringBuffer().append("heroMotionEnd").append(e.toString()).toString());
                return false;
            }
            m363a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), true);
            return false;
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append("heroMotionEnd").append(e2.toString()).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m365c(Graphics graphics) {
        try {
            synchronized (C0005e.f76a) {
                try {
                    if (this.f333b != null && this.f333b.length > 0 && !C0005e.f76a.m100b() && this.f334f < this.f333b.length) {
                        for (byte b = 0; b < this.f333b.length; b = (byte) (b + 1)) {
                            if (this.f333b[b][0] != C0005e.f76a.m97a() || this.f333b[b][1] != C0005e.f76a.m98b()) {
                                AbstractC0041i.m537a(graphics, (byte) 13, (short) (((this.f333b[b][0] * 25) + 4) - f323a), (short) (((this.f333b[b][1] * 25) + 4) - f324b), 0);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("drawHeroWay: ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static final byte m366a(byte b, byte b2, byte b3, byte b4) {
        if (C0050b.m642a(b2) >= C0050b.m642a(b4) && C0050b.m642a(b2) > C0050b.m642a(b) && C0050b.m642a(b2) > C0050b.m642a(b3)) {
            return C0050b.m642a(b2);
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: a */
    private static final byte m367a(byte b, byte b2) {
        if (C0050b.m642a(b) > C0050b.m642a(b2)) {
            return C0050b.m642a(b);
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: a */
    private static final byte m368a(byte b, byte b2, byte b3) {
        if (C0050b.m642a(b2) != C0050b.m642a(b) || C0050b.m642a(b) <= C0050b.m642a(b3)) {
            return (byte) -1;
        }
        return C0050b.m642a(b);
    }

    /* JADX INFO: renamed from: b */
    private static final byte m369b(byte b, byte b2, byte b3, byte b4) {
        if (C0050b.m642a(b) == C0050b.m642a(b2) && C0050b.m642a(b2) == C0050b.m642a(b3) && C0050b.m642a(b3) > C0050b.m642a(b4)) {
            return C0050b.m642a(b);
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: a */
    private static final void m370a(Graphics graphics, byte b, byte[] bArr, short s, short s2, byte b2) {
        byte b3 = bArr[b];
        byte bM642a = C0050b.m642a(b2);
        if (b3 == bM642a) {
            return;
        }
        int i = 0;
        int i2 = 0;
        switch (b) {
            case 8:
                if (b3 == 8) {
                    bArr[0] = -1;
                }
                i = 75;
                i2 = 25;
                break;
            case 9:
                if (b3 == 8) {
                    bArr[1] = -1;
                }
                i = 50;
                i2 = 25;
                break;
            case 10:
                if (b3 == 8) {
                    bArr[2] = -1;
                }
                i = 50;
                i2 = 0;
                break;
            case 11:
                if (b3 == 8) {
                    bArr[3] = -1;
                }
                if (b3 >= 6) {
                    bArr[3] = -1;
                    bArr[0] = -1;
                }
                i = 75;
                i2 = 0;
                break;
        }
        Image imageM646a = C0050b.m646a(b3, bM642a, b);
        RunnableC0037e.m465b(graphics, s, s2, 25, 25);
        RunnableC0037e.m468a(graphics, imageM646a, i, i2, 25, 25, 0, s, s2, 0);
        RunnableC0037e.m465b(graphics, 0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
    }

    /* JADX INFO: renamed from: b */
    private static final void m371b(Graphics graphics, byte b, byte[] bArr, short s, short s2, byte b2) {
        byte b3 = bArr[b];
        byte bM642a = C0050b.m642a(b2);
        if (b3 == bM642a || bArr[b] < 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 25;
        int i4 = 25;
        short s3 = 0;
        short s4 = 0;
        switch (b) {
            case 4:
                i2 = 25;
                if (b3 >= 6) {
                    bArr[3] = -1;
                    bArr[0] = -1;
                }
                i3 = 12;
                break;
            case 5:
                i2 = 0;
                i = 25;
                i4 = 12;
                break;
            case 6:
                i2 = 25;
                i3 = 12;
                s3 = 12;
                s = (short) (s + 1);
                break;
            case 7:
                i = 25;
                i4 = 12;
                s4 = 12;
                s2 = (short) (s2 + 1);
                break;
        }
        if (b3 == 6) {
            switch (b) {
                case 4:
                    i2 = 0;
                    i = 50;
                    break;
                case 5:
                    i2 = 0;
                    i = 25;
                    break;
                case 7:
                    i2 = 0;
                    i = 0;
                    break;
            }
            i3 = 25;
            i4 = 25;
            s3 = 0;
            s4 = 0;
        }
        if (b3 == 7 && bM642a != 6) {
            switch (b) {
                case 4:
                    i2 = 0;
                    i = 25;
                    break;
                case 6:
                    i2 = 0;
                    i = 50;
                    break;
                case 7:
                    i2 = 0;
                    i = 0;
                    break;
            }
            i3 = 25;
            i4 = 25;
            s3 = 0;
            s4 = 0;
        }
        Image imageM646a = C0050b.m646a(b3, bM642a, b);
        RunnableC0037e.m465b(graphics, s + s3, s2 + s4, i3, i4);
        RunnableC0037e.m468a(graphics, imageM646a, i, i2, 25, 25, 0, s, s2, 0);
        RunnableC0037e.m465b(graphics, 0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
    }

    /* JADX INFO: renamed from: c */
    private static final void m372c(Graphics graphics, byte b, byte[] bArr, short s, short s2, byte b2) {
        byte b3 = bArr[b];
        byte bM642a = C0050b.m642a(b2);
        if (b3 == bM642a) {
            return;
        }
        short s3 = 0;
        short s4 = 0;
        switch (b) {
            case 1:
                s3 = 12;
                s = (short) (s + 1);
                break;
            case 2:
                s3 = 12;
                s4 = 12;
                s = (short) (s + 1);
                s2 = (short) (s2 + 1);
                break;
            case 3:
                s4 = 12;
                s2 = (short) (s2 + 1);
                break;
        }
        Image imageM646a = C0050b.m646a(b3, bM642a, b);
        RunnableC0037e.m465b(graphics, s + s3, s2 + s4, 12, 12);
        RunnableC0037e.m468a(graphics, imageM646a, 0, 0, 25, 25, 0, s, s2, 0);
        RunnableC0037e.m465b(graphics, 0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
    }

    /* JADX INFO: renamed from: a */
    private static final void m373a(Graphics graphics, short s, short s2, byte[] bArr) {
        char c = 0;
        if (s == 0) {
            c = 2;
        } else if (s == 49) {
            c = 5;
        } else if (s2 == 0) {
            c = 1;
        }
        if (s2 == 49) {
            c = 6;
        }
        Image imageM638a = C0050b.m638a(C0050b.m633a("steam.png"));
        int i = 0;
        switch (c) {
            case 1:
                i = C0050b.m643c(bArr[7]) ? 1 : 1 - 1;
                if (!C0050b.m643c(bArr[3])) {
                    i++;
                }
                break;
            case 2:
                i = C0050b.m643c(bArr[5]) ? 7 : 7 - 1;
                if (!C0050b.m643c(bArr[1])) {
                    i++;
                }
                break;
            case 5:
                i = C0050b.m643c(bArr[5]) ? 4 : 4 - 1;
                if (!C0050b.m643c(bArr[1])) {
                    i++;
                }
                break;
            case 6:
                i = C0050b.m643c(bArr[7]) ? 10 : 10 - 1;
                if (!C0050b.m643c(bArr[3])) {
                    i++;
                }
                break;
        }
        short sM476a = (short) (RunnableC0037e.m476a(imageM638a) / 12);
        RunnableC0037e.m468a(graphics, imageM638a, sM476a * i, 0, sM476a, RunnableC0037e.m477b(imageM638a), 0, m374a((int) s), m375b((int) s2), 0);
    }

    /* JADX INFO: renamed from: a */
    public static final short m374a(int i) {
        return (short) ((i * 25) - f323a);
    }

    /* JADX INFO: renamed from: b */
    public static final short m375b(int i) {
        return (short) (((i * 25) - f324b) - 4);
    }

    /* JADX INFO: renamed from: a */
    private static void m376a(Graphics graphics, short s, short s2, byte b, byte[] bArr) {
        if (C0050b.m643c(b)) {
            m373a(graphics, s, s2, bArr);
        }
        C0005e.f76a.m95a(graphics);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m377a(Graphics graphics, byte b, byte b2, byte b3, byte b4) {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[16];
        Vector vector = new Vector();
        for (int i = 0; i < C0050b.m604a(); i++) {
            if (C0050b.m605a(i) != null) {
                C0038f c0038fM605a = C0050b.m605a(i);
                if (c0038fM605a.m501a() >= b - 1 && c0038fM605a.m501a() <= b3 + 1 && c0038fM605a.m502b() >= b2 - 1 && c0038fM605a.m502b() <= b4 + 1) {
                    vector.addElement(c0038fM605a);
                }
            }
        }
        int i2 = b3;
        while (true) {
            short s = (short) i2;
            if (s >= b) {
                if (s >= 0 && s < 50) {
                    int i3 = b2;
                    while (true) {
                        short s2 = (short) i3;
                        if (s2 <= b4) {
                            if (s2 >= 0 && s2 < 50) {
                                boolean z = s == C0005e.f76a.m97a() && s2 == C0005e.f76a.m98b();
                                boolean z2 = false;
                                C0038f c0038f = null;
                                short s3 = 0;
                                while (true) {
                                    short s4 = s3;
                                    if (s4 < vector.size()) {
                                        C0038f c0038f2 = (C0038f) vector.elementAt(s4);
                                        if (c0038f2 != null && c0038f2.m501a() == s && c0038f2.m502b() == s2) {
                                            c0038f = c0038f2;
                                        } else {
                                            s3 = (short) (s4 + 1);
                                        }
                                    }
                                }
                                short sM374a = m374a((int) s);
                                short sM375b = m375b((int) s2);
                                byte bM624a = C0050b.m624a(s, s2);
                                Image imageM647a = C0050b.m647a();
                                RunnableC0037e.m465b(graphics, sM374a, sM375b, 25, 25);
                                RunnableC0037e.m468a(graphics, imageM647a, C0050b.m644b(C0050b.m642a(bM624a)) * 25, 0, 25, 25, 0, sM374a, sM375b, 0);
                                RunnableC0037e.m465b(graphics, 0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
                                if (C0050b.m642a(bM624a) != 8) {
                                    bArr[0] = C0050b.m624a((short) (s - 1), (short) (s2 - 1));
                                    bArr[1] = C0050b.m624a(s, (short) (s2 - 1));
                                    bArr[2] = C0050b.m624a((short) (s + 1), (short) (s2 - 1));
                                    bArr[3] = C0050b.m624a((short) (s + 1), s2);
                                    bArr[4] = C0050b.m624a((short) (s + 1), (short) (s2 + 1));
                                    bArr[5] = C0050b.m624a(s, (short) (s2 + 1));
                                    bArr[6] = C0050b.m624a((short) (s - 1), (short) (s2 + 1));
                                    bArr[7] = C0050b.m624a((short) (s - 1), s2);
                                    bArr2[0] = m366a(bArr[7], bArr[0], bArr[1], bM624a);
                                    bArr2[1] = m366a(bArr[1], bArr[2], bArr[3], bM624a);
                                    bArr2[2] = m366a(bArr[3], bArr[4], bArr[5], bM624a);
                                    bArr2[3] = m366a(bArr[5], bArr[6], bArr[7], bM624a);
                                    bArr2[4] = m367a(bArr[7], bM624a);
                                    bArr2[5] = m367a(bArr[1], bM624a);
                                    bArr2[6] = m367a(bArr[3], bM624a);
                                    bArr2[7] = m367a(bArr[5], bM624a);
                                    bArr2[8] = m368a(bArr[7], bArr[1], bM624a);
                                    bArr2[9] = m368a(bArr[1], bArr[3], bM624a);
                                    bArr2[10] = m368a(bArr[3], bArr[5], bM624a);
                                    bArr2[11] = m368a(bArr[5], bArr[7], bM624a);
                                    bArr2[12] = m369b(bArr[5], bArr[7], bArr[1], bM624a);
                                    bArr2[13] = m369b(bArr[7], bArr[1], bArr[3], bM624a);
                                    bArr2[14] = m369b(bArr[1], bArr[3], bArr[5], bM624a);
                                    bArr2[15] = m369b(bArr[3], bArr[5], bArr[7], bM624a);
                                    byte b5 = bArr[7];
                                    byte b6 = bArr[1];
                                    byte b7 = bArr[3];
                                    byte b8 = bArr[5];
                                    byte bM642a = (C0050b.m642a(b5) == C0050b.m642a(b6) && C0050b.m642a(b6) == C0050b.m642a(b7) && C0050b.m642a(b7) == C0050b.m642a(b8) && C0050b.m642a(b8) > C0050b.m642a(bM624a)) ? C0050b.m642a(b5) : (byte) -1;
                                    byte b9 = bM642a;
                                    if (bM642a >= 0) {
                                        byte bM642a2 = C0050b.m642a(bM624a);
                                        if (b9 != bM642a2) {
                                            Image imageM646a = C0050b.m646a(b9, bM642a2, (byte) -1);
                                            RunnableC0037e.m465b(graphics, sM374a, sM375b, 25, 25);
                                            RunnableC0037e.m468a(graphics, imageM646a, 25, 25, 25, 25, 0, sM374a, sM375b, 0);
                                            RunnableC0037e.m465b(graphics, 0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
                                        }
                                    } else {
                                        byte b10 = 12;
                                        while (true) {
                                            byte b11 = b10;
                                            if (b11 <= 15) {
                                                if (bArr2[b11] >= 0) {
                                                    byte b12 = bArr2[b11];
                                                    byte bM642a3 = C0050b.m642a(bM624a);
                                                    if (b12 != bM642a3) {
                                                        int i4 = 0;
                                                        switch (b11) {
                                                            case 12:
                                                                bArr2[11] = -1;
                                                                bArr2[8] = -1;
                                                                bArr2[4] = -1;
                                                                bArr2[7] = -1;
                                                                bArr2[5] = -1;
                                                                i4 = 50;
                                                                break;
                                                            case 13:
                                                                bArr2[9] = -1;
                                                                bArr2[8] = -1;
                                                                bArr2[5] = -1;
                                                                bArr2[6] = -1;
                                                                bArr2[4] = -1;
                                                                i4 = 0;
                                                                break;
                                                            case 14:
                                                                bArr2[10] = -1;
                                                                bArr2[9] = -1;
                                                                bArr2[6] = -1;
                                                                bArr2[7] = -1;
                                                                bArr2[5] = -1;
                                                                i4 = 75;
                                                                break;
                                                            case 15:
                                                                bArr2[10] = -1;
                                                                bArr2[11] = -1;
                                                                bArr2[7] = -1;
                                                                bArr2[6] = -1;
                                                                bArr2[4] = -1;
                                                                i4 = 25;
                                                                break;
                                                        }
                                                        Image imageM646a2 = C0050b.m646a(b12, bM642a3, b11);
                                                        RunnableC0037e.m465b(graphics, sM374a, sM375b, 25, 25);
                                                        RunnableC0037e.m468a(graphics, imageM646a2, i4, 50, 25, 25, 0, sM374a, sM375b, 0);
                                                        RunnableC0037e.m465b(graphics, 0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
                                                    }
                                                } else {
                                                    b10 = (byte) (b11 + 1);
                                                }
                                            }
                                        }
                                        byte b13 = 0;
                                        while (true) {
                                            byte b14 = b13;
                                            if (b14 < 8) {
                                                byte b15 = -1;
                                                byte b16 = 4;
                                                while (true) {
                                                    byte b17 = b16;
                                                    if (b17 <= 11) {
                                                        if (bArr2[b17] >= 0 && (((!z && c0038f == null) || bArr2[b17] < 6) && (b15 < 0 || bArr2[b17] < bArr2[b15]))) {
                                                            b15 = b17;
                                                        }
                                                        b16 = (byte) (b17 + 1);
                                                    } else if (b15 >= 0 && bArr2[b15] >= 0) {
                                                        if (b15 < 4 || b15 > 7) {
                                                            m370a(graphics, b15, bArr2, sM374a, sM375b, bM624a);
                                                        } else {
                                                            m371b(graphics, b15, bArr2, sM374a, sM375b, bM624a);
                                                        }
                                                        bArr2[b15] = -1;
                                                        b13 = (byte) (b14 + 1);
                                                    }
                                                }
                                            }
                                        }
                                        byte bM620a = C0050b.m620a((int) s, (int) s2);
                                        if (bM620a != -1) {
                                            short s5 = -1;
                                            switch (C0050b.m642a(C0050b.m624a(s, s2))) {
                                                case 1:
                                                    s5 = f327a;
                                                    break;
                                                case 2:
                                                    s5 = f328b;
                                                    break;
                                                case 3:
                                                    s5 = f329c;
                                                    break;
                                                case 4:
                                                    s5 = f330d;
                                                    break;
                                                case 5:
                                                    s5 = f331e;
                                                    break;
                                            }
                                            if (s5 != -1) {
                                                int iM474b = RunnableC0037e.m474b(s5);
                                                RunnableC0037e.m470a(graphics, s5, iM474b * (bM620a % (RunnableC0037e.m473a(s5) / iM474b)), 0, iM474b, iM474b, 0, sM374a, sM375b, 20);
                                            }
                                        }
                                        if (c0038f != null || z) {
                                            m371b(graphics, (byte) 4, bArr2, sM374a, sM375b, bM624a);
                                            m371b(graphics, (byte) 5, bArr2, sM374a, sM375b, bM624a);
                                            m371b(graphics, (byte) 6, bArr2, sM374a, sM375b, bM624a);
                                            m370a(graphics, (byte) 8, bArr2, sM374a, sM375b, bM624a);
                                            m370a(graphics, (byte) 9, bArr2, sM374a, sM375b, bM624a);
                                            if (c0038f != null) {
                                                c0038f.mo498a(graphics);
                                                c0038f = null;
                                            }
                                            if (z) {
                                                m376a(graphics, s, s2, bM624a, bArr);
                                                z2 = true;
                                                z = false;
                                            }
                                            m371b(graphics, (byte) 7, bArr2, sM374a, sM375b, bM624a);
                                            m370a(graphics, (byte) 11, bArr2, sM374a, sM375b, bM624a);
                                            m370a(graphics, (byte) 10, bArr2, sM374a, sM375b, bM624a);
                                        }
                                    }
                                    byte b18 = 0;
                                    while (true) {
                                        byte b19 = b18;
                                        if (b19 <= 3) {
                                            if (bArr2[b19] >= 0) {
                                                if (c0038f != null && bArr2[b19] >= 6) {
                                                    c0038f.mo498a(graphics);
                                                    c0038f = null;
                                                }
                                                if (z && bArr2[b19] >= 6) {
                                                    m376a(graphics, s, s2, bM624a, bArr);
                                                    z2 = true;
                                                    z = false;
                                                }
                                                m372c(graphics, b19, bArr2, sM374a, sM375b, bM624a);
                                            }
                                            b18 = (byte) (b19 + 1);
                                        } else {
                                            if (c0038f != null) {
                                                c0038f.mo498a(graphics);
                                            }
                                            if (z) {
                                                m376a(graphics, s, s2, bM624a, bArr);
                                                z2 = true;
                                            }
                                            if (!z2 && C0050b.m643c(bM624a)) {
                                                m373a(graphics, s, s2, bArr);
                                            }
                                        }
                                    }
                                }
                            }
                            i3 = s2 + 1;
                        }
                    }
                }
                i2 = s - 1;
            } else {
                short s6 = 0;
                while (true) {
                    short s7 = s6;
                    if (s7 >= vector.size()) {
                        C0005e.f76a.m145a(graphics);
                        return;
                    } else {
                        if (vector.elementAt(s7) != null) {
                            ((C0038f) vector.elementAt(s7)).m499b(graphics);
                        }
                        s6 = (short) (s7 + 1);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized short m378a() {
        return (short) ((this.f325b * 25) + 12);
    }

    /* JADX INFO: renamed from: b */
    private synchronized short m379b() {
        return (short) ((this.f326c * 25) + 12);
    }

    /* JADX INFO: renamed from: a */
    private static final short m380a(short s, byte[][] bArr, byte b) {
        if (bArr == null) {
            return (short) -1;
        }
        return (short) ((s - b) + ((byte) ((bArr.length - 1) / 2)));
    }

    /* JADX INFO: renamed from: b */
    private static final short m381b(short s, byte[][] bArr, byte b) {
        if (bArr == null || bArr[0] == null) {
            return (short) -1;
        }
        return (short) ((s - b) + ((byte) ((bArr[0].length - 1) / 2)));
    }

    /* JADX INFO: renamed from: a */
    private synchronized short m382a(short s) {
        return m380a(s, this.f332a, C0005e.f76a.m97a());
    }

    /* JADX INFO: renamed from: b */
    private synchronized short m383b(short s) {
        return m381b(s, this.f332a, C0005e.f76a.m98b());
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final synchronized void mo168a() {
        if (((AbstractC0041i) this).f456a.m297a()) {
            return;
        }
        if (!this.f336a) {
            this.f335c = -1;
        }
        ((AbstractC0041i) this).f456a.m303a(true, false);
        if ((this.f333b == null || (this.f333b != null && this.f334f > this.f333b.length + 1)) && C0005e.f76a.m100b()) {
            C0005e.f76a.m99a(false);
        }
        if (C0005e.f76a.m100b()) {
            return;
        }
        if (Math.abs(C0005e.f76a.m97a() - this.f325b) > RunnableC0037e.f360a.m424b()) {
            m534e((byte) 10);
            return;
        }
        if (Math.abs(C0005e.f76a.m98b() - this.f326c) > RunnableC0037e.f360a.m425c()) {
            m534e((byte) 10);
            return;
        }
        byte b = C0050b.m631b(C0050b.m624a(this.f325b, this.f326c)) ? (this.f332a == null || this.f332a[m382a((short) this.f325b)][m383b((short) this.f326c)] != 127) ? (byte) 9 : (byte) 10 : (byte) 10;
        C0038f c0038fM607a = C0050b.m607a(this.f325b, this.f326c, true);
        if (this.f333b != null && c0038fM607a != null) {
            ((AbstractC0041i) this).f456a.m308a(c0038fM607a.m496a(), false);
            switch (c0038fM607a.m503c()) {
                case 1:
                    b = c0038fM607a.m507e() == 2 ? (byte) -3 : (byte) 10;
                    break;
                case 3:
                    b = -4;
                    break;
                default:
                    b = -2;
                    break;
            }
            if (!this.f336a) {
                this.f335c = C0050b.m608a(c0038fM607a);
            }
        } else if (b == 9) {
            if (C0005e.f76a.m97a() == this.f325b && C0005e.f76a.m98b() == this.f326c) {
                ((AbstractC0041i) this).f456a.m288a((byte) 85, false);
                ((AbstractC0041i) this).f456a.m288a((byte) 87, false);
                ((AbstractC0041i) this).f456a.m288a((byte) 88, false);
                ((AbstractC0041i) this).f456a.m288a((byte) 102, false);
                C0023p[] c0023pArrM140a = C0005e.f76a.m140a();
                byte b2 = 0;
                while (true) {
                    byte b3 = b2;
                    if (c0023pArrM140a == null || b3 >= c0023pArrM140a.length) {
                        break;
                    }
                    ((AbstractC0041i) this).f456a.m282a(true, c0023pArrM140a[b3]);
                    c0023pArrM140a[b3].m261a(true);
                    b2 = (byte) (b3 + 1);
                }
                b = -3;
            } else if (C0050b.m643c(C0050b.m624a(this.f325b, this.f326c))) {
                b = -2;
                ((AbstractC0041i) this).f456a.m288a((byte) 8, false);
            } else {
                ((AbstractC0041i) this).f456a.m288a((byte) 1, false);
            }
        }
        m534e(b);
    }

    /* JADX INFO: renamed from: a */
    public static final byte[][] m384a(byte b, byte b2, byte b3, byte b4) {
        try {
            if (!C0050b.m621a()) {
                return null;
            }
            short s = b4;
            byte[][] bArr = new byte[(b3 << 1) + 1][(s << 1) + 1];
            for (short s2 = 0; s2 < (b3 * 2) + 1; s2 = (short) (s2 + 1)) {
                for (short s3 = 0; s3 < (s * 2) + 1; s3 = (short) (s3 + 1)) {
                    bArr[s2][s3] = 127;
                }
            }
            bArr[b3][s] = 0;
            boolean z = false;
            while (!z) {
                z = true;
                for (short s4 = 0; s4 < (b3 * 2) + 1; s4 = (short) (s4 + 1)) {
                    for (short s5 = 0; s5 < (s * 2) + 1; s5 = (short) (s5 + 1)) {
                        if (s4 != b3 || s5 != s) {
                            short length = bArr == null ? (short) -1 : (short) ((b + s4) - ((byte) ((bArr.length - 1) / 2)));
                            short length2 = (bArr == null || bArr[0] == null) ? (short) -1 : (short) ((b2 + s5) - ((byte) ((bArr[0].length - 1) / 2)));
                            if (length >= 0 && length < 50 && length2 >= 0 && length2 < 50 && C0050b.m631b(C0050b.m624a((short) ((byte) length), (short) ((byte) length2)))) {
                                byte b5 = bArr[s4][s5];
                                if (length > 0 && s4 > 0 && C0050b.m631b(C0050b.m624a((short) ((byte) (length - 1)), (short) ((byte) length2))) && bArr[s4 - 1][s5] < b5) {
                                    b5 = bArr[s4 - 1][s5];
                                }
                                if (length < 49 && s4 < bArr.length - 1 && C0050b.m631b(C0050b.m624a((short) ((byte) (length + 1)), (short) ((byte) length2))) && bArr[s4 + 1][s5] < b5) {
                                    b5 = bArr[s4 + 1][s5];
                                }
                                if (length2 > 0 && s5 > 0 && C0050b.m631b(C0050b.m624a((short) ((byte) length), (short) ((byte) (length2 - 1)))) && bArr[s4][s5 - 1] < b5) {
                                    b5 = bArr[s4][s5 - 1];
                                }
                                if (length2 < 49 && s5 < bArr[0].length - 1 && C0050b.m631b(C0050b.m624a((short) ((byte) length), (short) ((byte) (length2 + 1)))) && bArr[s4][s5 + 1] < b5) {
                                    b5 = bArr[s4][s5 + 1];
                                }
                                if (b5 < 127 && b5 < bArr[s4][s5] - 1) {
                                    z = false;
                                    bArr[s4][s5] = (byte) (b5 + 1);
                                }
                            }
                        }
                    }
                }
            }
            return bArr;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("estimateenvirons: ").append(e.getMessage()).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m385b() {
        this.f332a = m384a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), RunnableC0037e.f360a.m424b(), RunnableC0037e.f360a.m425c());
    }

    /* JADX INFO: renamed from: a */
    public static final byte[][] m386a(byte b, byte b2, byte[][] bArr, byte b3, byte b4) {
        if (!C0050b.m621a() || b3 < 0 || b4 < 0) {
            return null;
        }
        C0038f c0038fM606a = C0050b.m606a(b3, b4);
        if ((c0038fM606a != null && c0038fM606a.m497a()) || b3 >= 50 || b4 >= 50 || bArr == null || C0050b.m630a(C0050b.m624a(b3, b4))) {
            return null;
        }
        short sM380a = m380a(b3, bArr, b);
        short sM381b = m381b(b4, bArr, b2);
        if (sM380a < 0 || sM381b < 0 || sM380a >= bArr.length || sM381b >= bArr[0].length || bArr[sM380a][sM381b] == 127) {
            return null;
        }
        byte[][] bArr2 = new byte[bArr[sM380a][sM381b] + 1][2];
        if (bArr2.length == 0) {
            return null;
        }
        bArr2[bArr2.length - 1][0] = b3;
        bArr2[bArr2.length - 1][1] = b4;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            short sM380a2 = m380a(bArr2[length + 1][0], bArr, b);
            short sM381b2 = m381b(bArr2[length + 1][1], bArr, b2);
            if (sM380a2 >= 0 && sM381b2 >= 0) {
                if (sM380a2 > 0 && bArr[sM380a2 - 1][sM381b2] < bArr[sM380a2][sM381b2]) {
                    bArr2[length][0] = (byte) (bArr2[length + 1][0] - 1);
                    bArr2[length][1] = bArr2[length + 1][1];
                } else if (sM380a2 + 1 < bArr.length && bArr[sM380a2 + 1][sM381b2] < bArr[sM380a2][sM381b2]) {
                    bArr2[length][0] = (byte) (bArr2[length + 1][0] + 1);
                    bArr2[length][1] = bArr2[length + 1][1];
                } else if (sM381b2 > 0 && bArr[sM380a2][sM381b2 - 1] < bArr[sM380a2][sM381b2]) {
                    bArr2[length][1] = (byte) (bArr2[length + 1][1] - 1);
                    bArr2[length][0] = bArr2[length + 1][0];
                } else if (sM381b2 + 1 < bArr[0].length && bArr[sM380a2][sM381b2 + 1] < bArr[sM380a2][sM381b2]) {
                    bArr2[length][1] = (byte) (bArr2[length + 1][1] + 1);
                    bArr2[length][0] = bArr2[length + 1][0];
                }
            }
        }
        bArr2[0][0] = b;
        bArr2[0][1] = b2;
        return bArr2;
    }

    /* JADX INFO: renamed from: a */
    private synchronized byte[][] m387a(byte b, byte b2) {
        byte[][] bArrM386a = m386a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), this.f332a, b, b2);
        if (bArrM386a == null || bArrM386a.length <= 1) {
            return null;
        }
        byte[][] bArr = new byte[bArrM386a.length - 1][2];
        System.arraycopy(bArrM386a, 1, bArr, 0, bArr.length);
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    private boolean m388g() {
        try {
            C0038f c0038fM605a = C0050b.m605a(this.f335c);
            if (c0038fM605a != null) {
                try {
                    C0058g c0058g = new C0058g(C0059h.f576a[74], (short) 0, C0059h.f576a[9]);
                    c0058g.m670a(c0038fM605a.m500a());
                    C0063c.f597a.m749a(c0058g);
                    return true;
                } catch (Exception unused) {
                }
            }
            AbstractC0041i.m539g();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m389h() {
        try {
            C0038f c0038fM605a = C0050b.m605a(this.f335c);
            if (c0038fM605a != null) {
                try {
                    short s = 0;
                    if (c0038fM605a.m503c() == 3 || c0038fM605a.m503c() == 4) {
                        s = C0059h.f576a[7];
                    } else if (c0038fM605a.m503c() == 2) {
                        s = C0059h.f576a[10];
                    } else if (c0038fM605a.m503c() == 5) {
                        s = C0059h.f576a[8];
                    }
                    C0058g c0058g = new C0058g(C0059h.f576a[10], (short) 4, s);
                    c0058g.m670a(c0038fM605a.m500a());
                    C0063c.f597a.m749a(c0058g);
                    return true;
                } catch (Exception unused) {
                }
            }
            AbstractC0041i.m539g();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mobak.a.b.f] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [mobak.Main2] */
    /* JADX INFO: renamed from: i */
    private boolean m390i() {
        ?? M605a = C0050b.m605a(this.f335c);
        if (M605a == 0) {
            return false;
        }
        try {
            Main2.f0a.f12b = M605a.m500a();
            M605a = Main2.f0a;
            M605a.m1b((byte) 6);
            return true;
        } catch (Exception e) {
            C0063c.m746a(M605a.getMessage());
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, mobak.a.b.f] */
    /* JADX INFO: renamed from: j */
    private boolean m391j() {
        boolean z;
        ?? M605a = C0050b.m605a(this.f335c);
        if (M605a == 0) {
            return false;
        }
        try {
            if (C0050b.m604a() <= 0) {
                z = false;
                break;
            }
            short s = 0;
            while (true) {
                if (s >= C0050b.m604a()) {
                    z = false;
                    break;
                }
                C0038f c0038fM605a = C0050b.m605a((int) s);
                if (c0038fM605a != null && c0038fM605a.m503c() == 2) {
                    byte bAbs = (byte) Math.abs(this.f325b - c0038fM605a.m501a());
                    byte bAbs2 = (byte) Math.abs(this.f326c - c0038fM605a.m502b());
                    if (bAbs >= 0 && bAbs2 >= 0 && bAbs <= f322a && bAbs2 <= f322a) {
                        z = true;
                        break;
                    }
                }
                s = (short) (s + 1);
            }
            if (z) {
                RunnableC0037e.m427a(C0066a.m773a(135), C0066a.m773a(166));
                return true;
            }
            C0058g c0058g = new C0058g(C0059h.f576a[33], (short) 4, C0059h.f576a[6]);
            C0005e.f76a.f90b = M605a.m500a();
            c0058g.m670a(M605a.m500a());
            C0063c.f597a.m749a(c0058g);
            m534e((byte) -1);
            return true;
        } catch (Exception e) {
            C0063c.m746a(M605a.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m392a(byte b) {
        if (b != 0) {
            this.f336a = true;
        }
        AbstractC0041i.m538f();
        m534e((byte) -1);
        this.f337g = b;
        short s = this.f325b;
        short s2 = this.f326c;
        if (s == C0005e.f76a.m97a() && s2 == C0005e.f76a.m98b()) {
            return true;
        }
        this.f332a = null;
        C0005e.f76a.m99a(true);
        return true;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: c */
    public final void mo223c() {
        super.mo223c();
        try {
            m385b();
        } catch (Exception e) {
            C0063c.m744a(new StringBuffer().append("reset strategical screen: ").append(e.getMessage()).toString(), false);
        }
        m534e((byte) 9);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m393a(byte b, byte b2) {
        if (this.f333b == null || !C0005e.f76a.m100b()) {
            return false;
        }
        synchronized (C0005e.f76a) {
            for (short s = 0; s < this.f333b.length; s = (short) (s + 1)) {
                if (this.f333b[s][0] == b && this.f333b[s][1] == b2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m394d() {
        if (C0050b.m631b(C0050b.m624a(C0005e.f76a.m97a(), C0005e.f76a.m98b()))) {
            return;
        }
        byte b = 1;
        while (true) {
            byte b2 = b;
            if (b2 >= 3) {
                return;
            }
            int iM97a = C0005e.f76a.m97a() - b2;
            while (true) {
                byte b3 = (byte) iM97a;
                if (b3 < C0005e.f76a.m97a() + b2) {
                    int iM98b = C0005e.f76a.m98b() - b2;
                    while (true) {
                        byte b4 = (byte) iM98b;
                        if (b4 < C0005e.f76a.m98b() + b2) {
                            if (C0050b.m631b(C0050b.m624a(C0005e.f76a.m97a(), C0005e.f76a.m98b())) && C0050b.m623a(C0005e.f76a.m97a(), C0005e.f76a.m98b())) {
                                C0005e.f76a.m96a(b3, b4);
                                return;
                            }
                            iM98b = b4 + 1;
                        }
                    }
                    iM97a = b3 + 1;
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        if (C0005e.f76a == null || C0005e.f76a.m100b()) {
            return false;
        }
        this.f325b = (byte) ((f323a + i) / 25);
        this.f326c = (byte) ((f324b + i2) / 25);
        m361n();
        mo168a();
        return true;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        if (C0005e.f76a == null || C0005e.f76a.m100b()) {
            return false;
        }
        mo168a();
        m530c();
        return true;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: b */
    protected final boolean mo180b(int i, int i2, int i3) {
        return false;
    }
}
