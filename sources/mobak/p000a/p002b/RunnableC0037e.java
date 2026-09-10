package mobak.p000a.p002b;

import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import mobak.C0050b;
import mobak.Main2;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.p003a.AbstractC0012e;
import mobak.p000a.p002b.p003a.C0013f;
import mobak.p000a.p002b.p003a.C0025r;
import mobak.p004b.C0063c;
import mobak.p006c.AbstractC0073h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.e */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/e.class */
public final class RunnableC0037e extends GameCanvas implements Runnable {

    /* JADX INFO: renamed from: a */
    public static RunnableC0037e f360a;

    /* JADX INFO: renamed from: a */
    private boolean f361a;

    /* JADX INFO: renamed from: a */
    private byte f362a;

    /* JADX INFO: renamed from: a */
    private String[] f363a;

    /* JADX INFO: renamed from: b */
    private String[] f364b;

    /* JADX INFO: renamed from: a */
    private short[] f365a;

    /* JADX INFO: renamed from: b */
    private boolean f366b;

    /* JADX INFO: renamed from: a */
    public static AbstractC0003c[] f367a;

    /* JADX INFO: renamed from: b */
    private byte f384b;

    /* JADX INFO: renamed from: a */
    public C0013f f385a;

    /* JADX INFO: renamed from: a */
    public C0034b f386a;

    /* JADX INFO: renamed from: a */
    public C0049q f387a;

    /* JADX INFO: renamed from: a */
    private AbstractC0012e[] f388a;

    /* JADX INFO: renamed from: c */
    private byte f389c;

    /* JADX INFO: renamed from: c */
    private boolean f390c;

    /* JADX INFO: renamed from: d */
    private boolean f391d;

    /* JADX INFO: renamed from: e */
    private boolean f392e;

    /* JADX INFO: renamed from: f */
    private boolean f393f;

    /* JADX INFO: renamed from: g */
    private boolean f394g;

    /* JADX INFO: renamed from: a */
    private C0035c f395a;

    /* JADX INFO: renamed from: i */
    private boolean f399i;

    /* JADX INFO: renamed from: j */
    private boolean f400j;

    /* JADX INFO: renamed from: a */
    private long f401a;

    /* JADX INFO: renamed from: b */
    private int f402b;

    /* JADX INFO: renamed from: c */
    private int f403c;

    /* JADX INFO: renamed from: d */
    private int f404d;

    /* JADX INFO: renamed from: k */
    private boolean f405k;

    /* JADX INFO: renamed from: d */
    private byte f406d;

    /* JADX INFO: renamed from: b */
    private long f407b;

    /* JADX INFO: renamed from: l */
    private boolean f408l;

    /* JADX INFO: renamed from: a */
    private String f409a;

    /* JADX INFO: renamed from: a */
    private Thread f410a;

    /* JADX INFO: renamed from: a */
    private Graphics f411a;

    /* JADX INFO: renamed from: a */
    private static short f368a = 0;

    /* JADX INFO: renamed from: b */
    private static short f369b = -1;

    /* JADX INFO: renamed from: c */
    private static short f370c = -1;

    /* JADX INFO: renamed from: d */
    private static short f371d = -1;

    /* JADX INFO: renamed from: e */
    private static short f372e = -1;

    /* JADX INFO: renamed from: f */
    private static short f373f = -1;

    /* JADX INFO: renamed from: b */
    private static final short[] f374b = {128, 155, 171, 189, 212};

    /* JADX INFO: renamed from: c */
    private static final short[] f375c = {12, 43, 72, 98, 119};

    /* JADX INFO: renamed from: d */
    private static final short[] f376d = {27, 17, 19, 24, 8};

    /* JADX INFO: renamed from: e */
    private static short[] f377e = null;

    /* JADX INFO: renamed from: g */
    private static short f378g = -1;

    /* JADX INFO: renamed from: h */
    private static short f379h = -1;

    /* JADX INFO: renamed from: i */
    private static short f380i = -1;

    /* JADX INFO: renamed from: j */
    private static short f381j = -1;

    /* JADX INFO: renamed from: k */
    private static short f382k = -1;

    /* JADX INFO: renamed from: l */
    private static short f383l = -1;

    /* JADX INFO: renamed from: a */
    private static Vector f396a = new Vector(10);

    /* JADX INFO: renamed from: h */
    private static boolean f397h = false;

    /* JADX INFO: renamed from: a */
    public static int f398a = 49;

    public RunnableC0037e() {
        super(false);
        this.f361a = false;
        this.f362a = (byte) -1;
        this.f363a = new String[5];
        this.f364b = new String[5];
        this.f365a = new short[5];
        this.f384b = (byte) 0;
        this.f388a = new AbstractC0012e[10];
        this.f390c = false;
        this.f391d = false;
        this.f392e = false;
        this.f393f = false;
        this.f394g = false;
        this.f400j = false;
        this.f404d = 0;
        this.f405k = false;
        this.f406d = (byte) 0;
        this.f407b = System.currentTimeMillis();
        this.f408l = false;
        this.f409a = "";
        this.f411a = null;
        if (f369b == -1) {
            f369b = C0050b.m633a("bigclock.png");
        }
        if (f370c == -1) {
            f370c = C0050b.m633a("bigclockfon.png");
        }
        setFullScreenMode(true);
        f360a = this;
        this.f385a = AbstractC0012e.m183a();
        this.f386a = new C0034b();
        this.f404d = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX INFO: renamed from: a */
    public final void m417a() {
        byte bM143e;
        AbstractC0041i abstractC0041iM423a;
        System.currentTimeMillis();
        if (this.f411a == null) {
            this.f411a = getGraphics();
        }
        try {
            this.f366b = false;
            if (this.f400j && (abstractC0041iM423a = m423a()) != null && !m463e()) {
                abstractC0041iM423a.m552a(this.f402b, this.f403c, (int) (System.currentTimeMillis() - this.f401a));
            }
            byte bM419a = m419a();
            try {
                switch (bM419a) {
                    case 1:
                        if (this.f385a != null && this.f385a.m542e()) {
                            this.f385a.m526b(this.f411a);
                        }
                        break;
                    case 2:
                        if (this.f386a != null && this.f385a.m542e()) {
                            this.f386a.m526b(this.f411a);
                        }
                        break;
                    case 3:
                        if (this.f387a != null && this.f385a.m542e()) {
                            this.f387a.m526b(this.f411a);
                        }
                        break;
                    case 4:
                        if (this.f362a >= 0 && this.f388a != null && this.f388a.length > this.f362a && this.f388a[this.f362a] != null && this.f388a[this.f362a].m542e()) {
                            this.f388a[this.f362a].m526b(this.f411a);
                        }
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                C0063c.m746a(new StringBuffer().append("drawScreen: ").append(e.getMessage()).append(" mode: ").append(m458a(m419a())).toString());
            }
            if (this.f393f && m435a() == null) {
                if (!this.f390c) {
                    this.f390c = true;
                }
                if (this.f394g) {
                    if (f371d < 0) {
                        f371d = C0050b.m633a("logo.png");
                    }
                    this.f411a.setColor(3342336);
                    this.f411a.fillRect(0, 0, getWidth(), getHeight());
                    m466a(this.f411a, C0050b.m638a(f371d), getWidth() / 2, getHeight() / 2, 3);
                    if (f372e < 0) {
                        f372e = C0050b.m633a("txt.png");
                    }
                    if (f373f < 0) {
                        f373f = (short) C0050b.m638a(f372e).getHeight();
                    }
                    m468a(this.f411a, C0050b.m638a(f372e), 0, 0, 128, f373f, 0, (getWidth() - 128) / 2, (getHeight() - f373f) / 2, 0);
                    if (this.f384b >= f374b.length + 1) {
                        this.f384b = (byte) -10;
                    }
                    if (this.f384b >= 0 && this.f384b < f374b.length) {
                        m468a(this.f411a, C0050b.m638a(f372e), f374b[this.f384b], 0, f376d[this.f384b], f373f, 0, ((getWidth() - 128) / 2) + f375c[this.f384b], (getHeight() - f373f) / 2, 0);
                    }
                } else {
                    m468a(this.f411a, C0050b.m638a(f370c), 0, 0, C0050b.m638a(f370c).getWidth(), C0050b.m638a(f370c).getHeight(), 0, getWidth() / 2, getHeight() / 2, 3);
                    if (this.f384b >= 4) {
                        this.f384b = (byte) 0;
                    }
                    Image imageM638a = C0050b.m638a(f369b);
                    int width = imageM638a.getWidth() / 4;
                    int height = imageM638a.getHeight();
                    m468a(this.f411a, imageM638a, width * this.f384b, 0, width, height, 0, (getWidth() - width) / 2, (getHeight() - height) / 2, 0);
                }
                this.f384b = (byte) (this.f384b + 1);
                Graphics graphics = this.f411a;
                if (f379h == -1) {
                    f379h = C0050b.m633a("progressbar_center.png");
                }
                if (f380i == -1) {
                    f380i = C0050b.m633a("progressbar_right.png");
                }
                if (f378g == -1) {
                    f378g = C0050b.m633a("progressbar_left.png");
                }
                if (f381j == -1) {
                    f381j = C0050b.m633a("progressbar_position_center.png");
                }
                if (f382k == -1) {
                    f382k = C0050b.m633a("progressbar_position_right.png");
                }
                if (f383l == -1) {
                    f383l = C0050b.m633a("progressbar_position_100.png");
                }
                int width2 = C0050b.m638a(f378g).getWidth();
                int height2 = C0050b.m638a(f378g).getHeight();
                int width3 = C0050b.m638a(f380i).getWidth();
                C0050b.m638a(f380i).getHeight();
                int height3 = C0050b.m638a(f379h).getHeight();
                m467a(graphics, f378g, 0, getHeight(), 36);
                m471a(graphics, f379h, 1, 0, width2, getHeight() - ((height2 - height3) / 2), getWidth() - width3, true, 32);
                m467a(graphics, f380i, getWidth(), getHeight(), 40);
                int width4 = C0050b.m638a(f381j).getWidth();
                int height4 = C0050b.m638a(f381j).getHeight();
                int width5 = getWidth() - width3;
                int i = width2 + (((width5 - width2) * f368a) / 100);
                m471a(graphics, f381j, 1, 0, width2 - width4, getHeight() - ((height2 - height4) / 2), i, true, 32);
                if (f368a >= 99) {
                    m467a(graphics, f383l, width5, getHeight() - ((height2 - C0050b.m638a(f383l).getHeight()) / 2), 36);
                } else {
                    m467a(graphics, f382k, i, getHeight() - ((height2 - C0050b.m638a(f382k).getHeight()) / 2), 36);
                }
            }
            if (!this.f391d) {
                Graphics graphics2 = this.f411a;
                switch (bM419a) {
                    case 1:
                        if (this.f385a == null) {
                            bM143e = C0005e.f76a != null ? C0005e.f76a.m143e() : (byte) 0;
                        } else {
                            bM143e = this.f385a.m529a();
                        }
                        break;
                    case 2:
                        if (this.f386a == null) {
                            bM143e = C0005e.f76a != null ? C0005e.f76a.m143e() : (byte) 0;
                        } else {
                            bM143e = this.f386a.m529a();
                        }
                        break;
                    case 3:
                        if (this.f387a == null) {
                            bM143e = C0005e.f76a != null ? C0005e.f76a.m143e() : (byte) 0;
                        } else {
                            bM143e = this.f387a.m529a();
                        }
                        break;
                    case 4:
                        if (this.f362a >= 0 && this.f388a != null && this.f388a.length > this.f362a && this.f388a[this.f362a] != null) {
                            bM143e = this.f388a[this.f362a].m529a();
                        } else if (C0005e.f76a != null) {
                            bM143e = C0005e.f76a.m143e();
                        } else {
                            bM143e = 0;
                        }
                        break;
                    default:
                        bM143e = C0005e.f76a != null ? C0005e.f76a.m143e() : (byte) 0;
                        break;
                }
                byte b = bM143e;
                C0043k c0043kM435a = m435a();
                if (c0043kM435a != null) {
                    if (c0043kM435a.f483a == null) {
                        m433m();
                    } else if (c0043kM435a.f485e > System.currentTimeMillis()) {
                        if (c0043kM435a.f484a != null) {
                            c0043kM435a.f484a.mo163b();
                        }
                        m433m();
                    } else {
                        m426a(graphics2, c0043kM435a.f477a, c0043kM435a.f478b, c0043kM435a.f479c, c0043kM435a.f480d);
                        if (c0043kM435a.f482a != null && c0043kM435a.f482a.length() > 0) {
                            c0043kM435a.f486a.m782a(graphics2, c0043kM435a.f482a, f360a.getWidth() / 2, 15 + 10, 3);
                        }
                        c0043kM435a.f483a.m395a(graphics2, (byte) 0);
                        if (c0043kM435a.f481a == 3) {
                            C0025r.m278a(graphics2, b);
                        } else {
                            C0025r.m279b(graphics2, b);
                        }
                    }
                }
            }
            if (!this.f366b) {
                m452a(this.f411a);
            }
            if (m421f() && this.f395a != null) {
                this.f395a.m408c();
                C0063c.f597a.m757a(this.f395a);
                this.f395a.m395a(this.f411a, (byte) 0);
            }
            if (f397h) {
                this.f409a = new Date(System.currentTimeMillis()).toString();
                this.f409a = this.f409a.substring(this.f409a.indexOf(":") - 2);
                this.f409a = this.f409a.substring(0, this.f409a.indexOf(" "));
                this.f411a.setColor(0);
                this.f411a.fillRect(8, (5 + AbstractC0041i.f446f.f634a) - (AbstractC0041i.f446f.f634a / 2), AbstractC0041i.f446f.m781a(this.f409a) + 3, AbstractC0041i.f446f.f634a);
                AbstractC0041i.f446f.m782a(this.f411a, this.f409a, 10 + (AbstractC0041i.f446f.m781a(this.f409a) / 2), 5 + AbstractC0041i.f446f.f634a, 3);
            }
            flushGraphics();
        } catch (Error e2) {
            C0063c.m746a(new StringBuffer().append("drawScreen error: ").append(e2.toString()).toString());
        } catch (Exception e3) {
            C0063c.m746a(new StringBuffer().append("drawScreen: ").append(e3.toString()).toString());
        }
        System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!Main2.f1a && this.f361a) {
            try {
                Thread.sleep(100L);
                if (Display.getDisplay(Main2.f0a).getCurrent() == this) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        if (this.f404d != 0 && ((this.f408l && jCurrentTimeMillis - this.f407b > 500) || (!this.f408l && jCurrentTimeMillis - this.f407b > 200))) {
                            this.f408l = false;
                            keyPressed(this.f404d);
                        }
                    } catch (Exception e) {
                        C0063c.m746a(new StringBuffer().append("key repeat error: ").append(e.getMessage()).toString());
                    }
                    m417a();
                }
            } catch (Error e2) {
                C0063c.m746a(new StringBuffer().append("ScreenDrawer.run error: ").append(e2.getMessage()).toString());
            } catch (Exception e3) {
                C0063c.m746a(new StringBuffer().append("ScreenDrawer.run ").append(e3.toString()).toString());
            }
        }
        this.f361a = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m418b() {
        if (this.f361a) {
            return;
        }
        Display.getDisplay(Main2.f0a).setCurrent(this);
        setFullScreenMode(true);
        this.f361a = true;
        this.f410a = new Thread(this);
        this.f410a.start();
    }

    /* JADX INFO: renamed from: a */
    public final byte m419a() {
        return (byte) (this.f389c & 7);
    }

    /* JADX INFO: renamed from: e */
    private final byte m420e() {
        return (byte) (((byte) (this.f389c >> 4)) & 7);
    }

    /* JADX INFO: renamed from: f */
    private boolean m421f() {
        return ((byte) (this.f389c & 8)) != 0;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m422a(boolean z, boolean z2, boolean z3) {
        C0043k c0043kM435a = m435a();
        if ((c0043kM435a == null || !z) && !z2) {
            return false;
        }
        if (c0043kM435a.f484a != null && (z3 || z)) {
            c0043kM435a.f484a.mo163b();
        } else if (c0043kM435a.f484a != null && (!z3 || z2)) {
            c0043kM435a.f484a.mo162a();
        }
        m433m();
        return true;
    }

    protected final synchronized void keyPressed(int i) {
        try {
            if (this.f405k) {
                if (this.f406d == 0) {
                    C0025r.m317b(i);
                    m433m();
                    m427a(C0066a.m773a(139), new StringBuffer().append(C0066a.m773a(140)).append(C0066a.m773a(142)).toString());
                    this.f406d = (byte) 1;
                    return;
                }
                if (this.f406d == 1) {
                    C0025r.m318c(i);
                    m433m();
                    m427a(C0066a.m773a(139), new StringBuffer().append(C0066a.m773a(140)).append(C0066a.m773a(260)).toString());
                    this.f406d = (byte) 2;
                    return;
                }
                if (this.f406d == 2) {
                    f398a = i;
                    m433m();
                    m427a(C0066a.m773a(139), C0066a.m773a(143));
                    this.f405k = false;
                    C0025r.m319b();
                    Main2.f0a.f6a.m786a((byte) 19, f398a);
                    return;
                }
            }
            if (!C0025r.m315a(i) && !C0025r.m316b(i) && f360a.getGameAction(i) != 8 && this.f404d != i) {
                this.f404d = i;
                this.f407b = System.currentTimeMillis();
                this.f408l = true;
            }
            AbstractC0041i abstractC0041iM423a = m423a();
            if (i == f398a) {
                f397h = !f397h;
            }
            if (i == 48) {
                if (C0063c.f597a == null) {
                    return;
                }
                if (m421f()) {
                    this.f395a = null;
                    this.f389c = (byte) (this.f389c & (-9));
                    return;
                } else {
                    this.f395a = new C0035c((short) 0, (short) 0, (short) (getWidth() - 5), (short) (getHeight() - 5), true, false);
                    C0063c.f597a.m757a(this.f395a);
                    this.f389c = (byte) (this.f389c | 8);
                    return;
                }
            }
            if (this.f393f && this.f390c && !this.f392e) {
                return;
            }
            C0043k c0043kM435a = m435a();
            if (this.f391d || c0043kM435a == null) {
                if (this.f390c || abstractC0041iM423a == null) {
                    return;
                }
                try {
                    abstractC0041iM423a.mo248d(i);
                    return;
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("screen.keyPressed ").append(e.toString()).toString());
                    return;
                }
            }
            if (m422a(C0025r.m315a(i) || f360a.getGameAction(i) == 8, C0025r.m316b(i), c0043kM435a.f481a == 1)) {
                return;
            }
            if (getGameAction(i) == 6) {
                c0043kM435a.f483a.m398b();
            } else if (getGameAction(i) == 1) {
                c0043kM435a.f483a.m396a();
            }
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append("keyPressedSD ").append(e2.toString()).toString());
        }
    }

    protected final void keyReleased(int i) {
        this.f404d = 0;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0041i m423a() {
        switch (m419a()) {
            case 1:
                return this.f385a;
            case 2:
                return this.f386a;
            case 3:
                return this.f387a;
            case 4:
                if (this.f362a >= 0) {
                    return this.f388a[this.f362a];
                }
                break;
        }
        this.f389c = (byte) 1;
        this.f385a = AbstractC0012e.m183a();
        return this.f385a;
    }

    /* JADX INFO: renamed from: b */
    public final byte m424b() {
        return (byte) (getWidth() / 25);
    }

    /* JADX INFO: renamed from: c */
    public final byte m425c() {
        return (byte) (getHeight() / 25);
    }

    /* JADX INFO: renamed from: a */
    public static void m426a(Graphics graphics, int i, int i2, int i3, int i4) {
        if (f377e == null) {
            f377e = new short[C0050b.f543a.length];
            for (int i5 = 0; i5 < C0050b.f543a.length; i5++) {
                f377e[i5] = C0050b.m633a(C0050b.f543a[i5]);
            }
        }
        int width = C0050b.m638a(f377e[0]).getWidth();
        int height = C0050b.m638a(f377e[0]).getHeight();
        int i6 = (i4 - (height << 1)) / height;
        if ((i4 - (height << 1)) % height > 0) {
            i6++;
        }
        m467a(graphics, f377e[0], i, i2, 20);
        if (i3 > (width << 1)) {
            int i7 = i + (((i3 - (width << 1)) << 1) / 3);
            m471a(graphics, f377e[9], 1, 0, i + width, i2, i7, true, 16);
            m467a(graphics, f377e[1], i7, i2, 20);
            m471a(graphics, f377e[9], 1, 0, (i + i3) - width, i2, i7 + width, true, 16);
        }
        m467a(graphics, f377e[2], i + i3, i2, 24);
        while (true) {
            i2 += height;
            int i8 = i6;
            i6--;
            if (i8 <= 0) {
                break;
            }
            m467a(graphics, f377e[i6 % 3 == 1 ? '\n' : (char) 3], i, i2, 20);
            m471a(graphics, f377e[4], 1, 0, i + width, i2, (i + i3) - width, true, 16);
            m467a(graphics, f377e[i6 % 3 == 2 ? (char) 11 : (char) 5], i + i3, i2, 24);
        }
        m467a(graphics, f377e[6], i, i2, 20);
        if (i3 > (width << 1)) {
            int i9 = i + ((i3 - (width << 1)) / 3);
            m471a(graphics, f377e[12], 1, 0, i + width, i2, i9, true, 16);
            m467a(graphics, f377e[7], i9, i2, 20);
            m471a(graphics, f377e[12], 1, 0, (i + i3) - width, i2, i9 + width, true, 16);
        }
        m467a(graphics, f377e[8], i + i3, i2, 24);
    }

    /* JADX INFO: renamed from: a */
    public static void m427a(String str, String str2) {
        m432a((byte) 1, str, str2, (AbstractC0073h) null, -1);
    }

    /* JADX INFO: renamed from: a */
    public static void m428a(String str, String str2, AbstractC0073h abstractC0073h) {
        m432a((byte) 1, str, str2, abstractC0073h, -1);
    }

    /* JADX INFO: renamed from: a */
    public static void m429a(String str, String str2, int i) {
        m432a((byte) 1, str, str2, (AbstractC0073h) null, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m430a(String str, String str2, AbstractC0073h abstractC0073h, int i) {
        m432a((byte) 1, str, str2, abstractC0073h, 15000);
    }

    /* JADX INFO: renamed from: a */
    public static void m431a(String str, String str2, String str3, AbstractC0073h abstractC0073h) {
        if (str3 != null) {
            m432a((byte) 3, str, new StringBuffer().append(str2).append("\n").append(str3).toString(), abstractC0073h, -1);
        } else {
            m432a((byte) 3, str, str2, abstractC0073h, -1);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m432a(byte b, String str, String str2, AbstractC0073h abstractC0073h, int i) {
        if (str == null && str2 == null) {
            return;
        }
        f396a.addElement(new C0043k(b, str, str2, abstractC0073h, i));
    }

    /* JADX INFO: renamed from: m */
    private static void m433m() {
        if (!f396a.isEmpty()) {
            f396a.removeElementAt(0);
        }
        if (f396a.isEmpty()) {
            f360a.f392e = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m434c() {
        while (!f396a.isEmpty()) {
            m433m();
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0043k m435a() {
        if (f396a.isEmpty()) {
            return null;
        }
        return (C0043k) f396a.elementAt(0);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m436a(C0013f c0013f, boolean z) {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f388a.length) {
                break;
            }
            this.f388a[b2] = null;
            b = (byte) (b2 + 1);
        }
        this.f362a = (byte) -1;
        AbstractC0041i abstractC0041iM423a = m423a();
        if (abstractC0041iM423a != null) {
            abstractC0041iM423a.mo223c();
        }
        System.gc();
        m437a((AbstractC0012e) c0013f, z);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m437a(AbstractC0012e abstractC0012e, boolean z) {
        if (abstractC0012e == null) {
            return;
        }
        this.f362a = (byte) (this.f362a + 1);
        if (this.f362a >= this.f388a.length) {
            AbstractC0012e[] abstractC0012eArr = new AbstractC0012e[(this.f388a.length * 3) / 2];
            System.arraycopy(this.f388a, 0, abstractC0012eArr, 0, this.f388a.length);
            this.f388a = abstractC0012eArr;
        }
        this.f388a[this.f362a] = abstractC0012e;
        if (!z || m419a() == 4) {
            if (this.f362a > 0) {
                abstractC0012e.m528a(this.f388a[this.f362a - 1]);
            }
            this.f388a[this.f362a].mo223c();
        } else {
            if (C0005e.f76a != null) {
                abstractC0012e.m527d(C0005e.f76a.m143e());
            }
            m440b((byte) 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m438d() {
        if (C0005e.f76a != null) {
            if (this.f387a != null) {
                this.f387a.m527d(C0005e.f76a.m143e());
            }
            if (this.f386a != null) {
                this.f386a.m527d(C0005e.f76a.m143e());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0012e m439a() {
        if (this.f362a < 0) {
            return null;
        }
        return this.f388a[this.f362a];
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m440b(byte b) {
        synchronized (f360a) {
            if (m419a() == 4) {
                return;
            }
            this.f389c = (byte) (this.f389c << 4);
            this.f389c = (byte) (this.f389c | 4);
            AbstractC0041i abstractC0041iM423a = m423a();
            if (abstractC0041iM423a != null) {
                abstractC0041iM423a.mo223c();
            }
            System.gc();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m441a(byte b) {
        synchronized (f360a) {
            this.f389c = b;
            if (m419a() != 4) {
                this.f362a = (byte) -1;
                if (m419a() != 3) {
                    for (byte b2 = 0; b2 < this.f388a.length; b2 = (byte) (b2 + 1)) {
                        this.f388a[b2] = null;
                    }
                }
            }
            AbstractC0041i abstractC0041iM423a = m423a();
            if (abstractC0041iM423a != null) {
                abstractC0041iM423a.mo223c();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m442e() {
        byte bM419a = m419a();
        byte bM420e = m420e();
        if (bM420e == 3 || bM420e == 1 || bM420e == 4 || bM420e == 2) {
            this.f389c = (byte) (this.f389c >> 4);
            this.f389c = (byte) (this.f389c | ((byte) (bM419a << 4)));
            AbstractC0041i abstractC0041iM423a = m423a();
            if (abstractC0041iM423a != null) {
                abstractC0041iM423a.mo223c();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m443f() {
        this.f388a[this.f362a] = null;
        this.f362a = (byte) (this.f362a - 1);
        if (this.f362a >= 0 && this.f388a[this.f362a] != null) {
            this.f388a[this.f362a].mo223c();
        }
        if (this.f362a < 0 && m419a() == 4) {
            m442e();
        }
        System.gc();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m444a() {
        return this.f393f;
    }

    /* JADX INFO: renamed from: a */
    public final void m445a(boolean z, boolean z2) {
        this.f394g = z;
        this.f390c = true;
        this.f384b = (byte) 0;
        f368a = (short) 0;
        this.f393f = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m446a(short s) {
        f368a = s;
    }

    /* JADX INFO: renamed from: a */
    public final void m447a(boolean z) {
        this.f394g = false;
        this.f393f = false;
        this.f384b = (byte) 0;
        this.f390c = false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m448b() {
        return this.f390c;
    }

    /* JADX INFO: renamed from: b */
    public final void m449b(boolean z) {
        this.f390c = z;
    }

    /* JADX INFO: renamed from: g */
    public final void m450g() {
        this.f405k = true;
        this.f406d = (byte) 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m451h() {
        if (this.f410a == null) {
            return;
        }
        this.f361a = false;
        try {
            Thread.sleep(1000L);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("kill").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m452a(Graphics graphics) {
        if (this.f366b) {
            return;
        }
        this.f366b = true;
        if (m421f()) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f364b.length) {
                return;
            }
            if (this.f364b[b2] != null) {
                short sM781a = this.f365a[b2];
                int height = (f360a.getHeight() - C0025r.m274a()) - (AbstractC0041i.f445e.f634a * (b2 + 1));
                graphics.setColor(4605510);
                graphics.fillRect(0, height, f360a.getWidth(), AbstractC0041i.f445e.f634a);
                graphics.setColor(8421504);
                graphics.drawLine(0, height, f360a.getWidth(), height);
                graphics.drawLine(0, height + AbstractC0041i.f445e.f634a, f360a.getWidth(), height + AbstractC0041i.f445e.f634a);
                if (this.f363a[b2] != null && !this.f363a[b2].trim().equals("")) {
                    AbstractC0041i.f445e.m782a(graphics, new StringBuffer().append(this.f363a[b2].trim()).append(": ").toString(), sM781a, height, 0);
                    sM781a = (short) (sM781a + AbstractC0041i.f445e.m781a(new StringBuffer().append(this.f363a[b2].trim()).append(": ").toString()));
                }
                AbstractC0041i.f442b.m782a(graphics, this.f364b[b2], sM781a, height, 0);
                short sM781a2 = (short) (sM781a + AbstractC0041i.f442b.m781a(this.f364b[b2]));
                short[] sArr = this.f365a;
                sArr[b2] = (short) (sArr[b2] - 2);
                if (this.f365a[b2] + sM781a2 < 0) {
                    String[] strArr = this.f364b;
                    this.f363a[b2] = null;
                    strArr[b2] = null;
                    this.f365a[b2] = 0;
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized byte m453d() {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f363a.length) {
                return (byte) -1;
            }
            if (this.f364b[b2] == null) {
                return b2;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m454b(String str, String str2) {
        byte bM453d;
        if (str2 == null || str2.trim().equals("") || (bM453d = m453d()) < 0) {
            return;
        }
        if (str.startsWith("\\id") && str.indexOf(" ") > 0) {
            str = str.substring(str.indexOf(" ") + 1);
        }
        this.f363a[bM453d] = str;
        if (str2.startsWith("\\id") && str2.indexOf(" ") > 0) {
            str2 = str2.substring(str2.indexOf(" ") + 1);
        }
        this.f364b[bM453d] = str2;
        this.f365a[bM453d] = (short) f360a.getWidth();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m455c() {
        return this.f394g;
    }

    /* JADX INFO: renamed from: a */
    public final String m456a() {
        return m458a(m419a());
    }

    /* JADX INFO: renamed from: b */
    public final String m457b() {
        return m458a(m420e());
    }

    /* JADX INFO: renamed from: a */
    private static String m458a(byte b) {
        switch (b) {
            case 1:
                return "MainMenu";
            case 2:
                return "Strategical";
            case 3:
                return "Battle";
            case 4:
                return "MenuStack";
            default:
                return "undef";
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m459d() {
        return this.f391d;
    }

    /* JADX INFO: renamed from: i */
    public final void m460i() {
        this.f391d = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m461j() {
        this.f391d = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m462k() {
        this.f392e = true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m463e() {
        return (this.f391d || m435a() == null) ? false : true;
    }

    protected final void pointerDragged(int i, int i2) {
    }

    protected final void pointerPressed(int i, int i2) {
        AbstractC0041i abstractC0041iM423a;
        this.f402b = i;
        this.f403c = i2;
        this.f401a = System.currentTimeMillis();
        this.f400j = true;
        this.f399i = false;
        if (this.f393f && this.f390c && !this.f392e) {
            return;
        }
        boolean zM310a = C0025r.m310a(i, i2);
        boolean zM311b = C0025r.m311b(i, i2);
        C0043k c0043kM435a = m435a();
        if (this.f391d || c0043kM435a == null) {
            if (this.f390c || (abstractC0041iM423a = m423a()) == null) {
                return;
            }
            abstractC0041iM423a.m549k();
            this.f399i = abstractC0041iM423a.m548b(i, i2);
            return;
        }
        if (zM310a) {
            m422a(true, false, false);
            this.f399i = true;
        } else if (zM311b) {
            m422a(false, true, false);
            this.f399i = true;
        }
    }

    protected final void pointerReleased(int i, int i2) {
        AbstractC0041i abstractC0041iM423a;
        this.f400j = false;
        if (this.f399i) {
            return;
        }
        if ((this.f393f && this.f390c && !this.f392e) || (abstractC0041iM423a = m423a()) == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (abstractC0041iM423a.m551c(i, i2, (int) (jCurrentTimeMillis - this.f401a)) || abstractC0041iM423a.m550f() || jCurrentTimeMillis - this.f401a >= 500) {
            return;
        }
        int iAbs = Math.abs(i - this.f402b);
        int iAbs2 = Math.abs(i2 - this.f403c);
        if (iAbs > 50 || iAbs2 > 50) {
            if (iAbs > (iAbs2 << 1)) {
                if (i < this.f402b) {
                    m464a(2);
                    return;
                } else {
                    m464a(5);
                    return;
                }
            }
            if (iAbs2 > (iAbs << 1)) {
                if (i2 < this.f403c) {
                    m464a(1);
                } else {
                    m464a(6);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m464a(int i) {
        keyPressed(getKeyCode(i));
        getKeyCode(i);
        this.f404d = 0;
    }

    /* JADX INFO: renamed from: b */
    public static final void m465b(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setClip(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public static final void m466a(Graphics graphics, Image image, int i, int i2, int i3) {
        try {
            graphics.drawImage(image, i, i2, i3);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("drawImage ").append(e).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m467a(Graphics graphics, short s, int i, int i2, int i3) {
        m466a(graphics, C0050b.m638a(s), i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m468a(Graphics graphics, Image image, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (graphics == null || image == null) {
            return;
        }
        if (i8 == 0) {
            i8 = 20;
        }
        try {
            graphics.drawRegion(image, i, i2, i3, i4, i5, i6, i7, i8);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("Graphics.drawRegion (Image, ").append(String.valueOf(i)).append(", ").append(String.valueOf(i2)).append(", ").append(String.valueOf(i3)).append(", ").append(String.valueOf(i4)).append(", ").append(String.valueOf(i5)).append(", ").append(String.valueOf(i6)).append(", ").append(String.valueOf(i7)).append(", ").append(String.valueOf(i8)).append("): ").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m469a(Graphics graphics, short s, int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            Image imageM638a = C0050b.m638a(s);
            int width = imageM638a.getWidth() / i;
            m468a(graphics, imageM638a, width * i3, 0, width, imageM638a.getHeight() / i2, 0, i5, i6, 0);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("drawImage ").append(e).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m470a(Graphics graphics, short s, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if ((i8 & 8) != 0) {
                i6 -= i3;
                i8 = (i8 & (-9)) | 4;
            }
            m468a(graphics, C0050b.m638a(s), i, 0, i3, i4, 0, i6, i7, i8);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("drawImageShort ").append(e).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m471a(Graphics graphics, short s, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        int width = C0050b.m638a(s).getWidth() / i;
        int height = C0050b.m638a(s).getHeight();
        if (i6 == 0) {
            i6 = z ? 16 : 4;
        }
        if ((z ? i3 : i4) > i5) {
            int i7 = z ? 8 : 32;
            int i8 = z ? i3 : i4;
            while (true) {
                int i9 = i8;
                if (i8 < i5) {
                    return;
                }
                m470a(graphics, s, width * i2, 0, width, height, 0, z ? i9 : i3, z ? i4 : i9, i7 | i6);
                i8 = i9 - (z ? width : height);
            }
        } else {
            int i10 = z ? 4 : 16;
            int i11 = z ? i3 : i4;
            while (true) {
                int i12 = i11;
                if (i11 >= i5) {
                    return;
                }
                m470a(graphics, s, width * i2, 0, width, height, 0, z ? i12 : i3, z ? i4 : i12, i10 | i6);
                i11 = i12 + (z ? width : height);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m472l() {
        Display.getDisplay(Main2.f0a).setCurrent(this);
    }

    /* JADX INFO: renamed from: a */
    public static final int m473a(short s) {
        return C0050b.m638a(s).getWidth();
    }

    /* JADX INFO: renamed from: b */
    public static final int m474b(short s) {
        return C0050b.m638a(s).getHeight();
    }

    public final int getGameAction(int i) {
        try {
            return super/*javax.microedition.lcdui.Canvas*/.getGameAction(i);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getGameAction ").append(e.toString()).toString());
            return 999;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m475a(int i) {
        return 8 == getGameAction(i);
    }

    public final int getWidth() {
        return super/*javax.microedition.lcdui.Displayable*/.getWidth();
    }

    public final int getHeight() {
        return super/*javax.microedition.lcdui.Displayable*/.getHeight();
    }

    /* JADX INFO: renamed from: a */
    public static int m476a(Image image) {
        return image.getWidth();
    }

    /* JADX INFO: renamed from: b */
    public static int m477b(Image image) {
        return image.getHeight();
    }

    /* JADX INFO: renamed from: a */
    public static void m478a(Graphics graphics, int i) {
        graphics.setColor(i);
    }

    /* JADX INFO: renamed from: a */
    public static int m479a(Graphics graphics) {
        return graphics.getColor();
    }

    /* JADX INFO: renamed from: b */
    public static int m480b(Graphics graphics) {
        return graphics.getClipX();
    }

    /* JADX INFO: renamed from: c */
    public static int m481c(Graphics graphics) {
        return graphics.getClipY();
    }

    /* JADX INFO: renamed from: d */
    public static int m482d(Graphics graphics) {
        return graphics.getClipWidth();
    }

    /* JADX INFO: renamed from: e */
    public static int m483e(Graphics graphics) {
        return graphics.getClipHeight();
    }

    /* JADX INFO: renamed from: a */
    static short m484a() {
        return (short) 10;
    }

    /* JADX INFO: renamed from: b */
    static short m485b() {
        return (short) 15;
    }

    /* JADX INFO: renamed from: c */
    static short m486c() {
        return (short) (f360a.getWidth() - 20);
    }

    /* JADX INFO: renamed from: d */
    static short m487d() {
        return (short) (((f360a.getHeight() - C0025r.m274a()) - 15) - 10);
    }
}
