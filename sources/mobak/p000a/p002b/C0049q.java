package mobak.p000a.p002b;

import java.util.Date;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.C0050b;
import mobak.Main2;
import mobak.p000a.p001a.C0001a;
import mobak.p000a.p001a.C0004d;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p001a.C0006f;
import mobak.p000a.p002b.p003a.AbstractC0012e;
import mobak.p000a.p002b.p003a.C0023p;
import mobak.p000a.p002b.p003a.C0025r;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.q */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/q.class */
public final class C0049q extends AbstractC0041i {

    /* JADX INFO: renamed from: a */
    private static final byte[] f496a = {2, 58, 53, 54};

    /* JADX INFO: renamed from: a */
    private static int f497a = 0;

    /* JADX INFO: renamed from: a */
    private short f498a;

    /* JADX INFO: renamed from: b */
    private short f499b;

    /* JADX INFO: renamed from: c */
    private short f500c;

    /* JADX INFO: renamed from: d */
    private short f501d;

    /* JADX INFO: renamed from: e */
    private short f502e;

    /* JADX INFO: renamed from: f */
    private short f503f;

    /* JADX INFO: renamed from: g */
    private short f504g;

    /* JADX INFO: renamed from: h */
    private short f505h;

    /* JADX INFO: renamed from: i */
    private short f506i;

    /* JADX INFO: renamed from: j */
    private short f507j;

    /* JADX INFO: renamed from: l */
    private short f508l;

    /* JADX INFO: renamed from: a */
    public C0006f f515a;

    /* JADX INFO: renamed from: b */
    private byte[][] f516b;

    /* JADX INFO: renamed from: a */
    private long f517a;

    /* JADX INFO: renamed from: k */
    private byte f529k;

    /* JADX INFO: renamed from: l */
    private byte f530l;

    /* JADX INFO: renamed from: m */
    private byte f531m;

    /* JADX INFO: renamed from: b */
    private int f532b;

    /* JADX INFO: renamed from: a */
    private C0023p f533a;

    /* JADX INFO: renamed from: a */
    private byte[][] f509a = new byte[5][6];

    /* JADX INFO: renamed from: a */
    private byte f510a = 0;

    /* JADX INFO: renamed from: b */
    private byte f511b = 0;

    /* JADX INFO: renamed from: a */
    public boolean f512a = false;

    /* JADX INFO: renamed from: m */
    private short f513m = 0;

    /* JADX INFO: renamed from: c */
    private byte f514c = -1;

    /* JADX INFO: renamed from: b */
    private boolean f518b = false;

    /* JADX INFO: renamed from: f */
    private byte f519f = 0;

    /* JADX INFO: renamed from: g */
    private byte f520g = 0;

    /* JADX INFO: renamed from: c */
    private boolean f521c = false;

    /* JADX INFO: renamed from: d */
    private boolean f522d = false;

    /* JADX INFO: renamed from: a */
    private AbstractC0045m[] f523a = new AbstractC0045m[10];

    /* JADX INFO: renamed from: h */
    private byte f524h = 0;

    /* JADX INFO: renamed from: i */
    private byte f525i = 0;

    /* JADX INFO: renamed from: a */
    private C0001a[] f526a = null;

    /* JADX INFO: renamed from: b */
    private C0001a[] f527b = null;

    /* JADX INFO: renamed from: j */
    private byte f528j = 0;

    /* JADX INFO: renamed from: a */
    private C0058g f534a = null;

    /* JADX INFO: renamed from: a */
    public C0005e f535a = null;

    public C0049q() {
        byte b;
        String str;
        this.f498a = (short) -1;
        this.f499b = (short) -1;
        this.f500c = (short) -1;
        this.f501d = (short) -1;
        this.f502e = (short) -1;
        this.f503f = (short) -1;
        this.f504g = (short) -1;
        this.f505h = (short) -1;
        this.f506i = (short) -1;
        this.f507j = (short) -1;
        this.f508l = (short) -1;
        this.f529k = (byte) -1;
        int i = 1;
        try {
            C0050b.m637d();
            int i2 = 1 + 1;
            this.f529k = (byte) 0;
            switch (C0050b.m642a(C0050b.m624a(C0005e.f76a.m97a(), C0005e.f76a.m98b()))) {
                case 2:
                    str = "tiles_rocks.png";
                    this.f529k = (byte) 1;
                    break;
                case 3:
                    str = "tiles_sand.png";
                    this.f529k = (byte) 2;
                    break;
                case 4:
                    str = "tiles_snow.png";
                    this.f529k = (byte) 3;
                    break;
                case 5:
                    str = "tiles_grass.png";
                    this.f529k = (byte) 2;
                    break;
                default:
                    str = "tiles_rocks.png";
                    this.f529k = (byte) 1;
                    break;
            }
            this.f500c = C0050b.m633a("battle_bottom_corner.png");
            this.f501d = C0050b.m633a("battle_bottom.png");
            this.f502e = C0050b.m633a("battle_bottom_mid.png");
            this.f503f = C0050b.m633a("battle_vertical_mid.png");
            this.f504g = C0050b.m633a("battle_vertical.png");
            this.f505h = C0050b.m633a("battle_top.png");
            this.f506i = C0050b.m633a("battle_middle_top.png");
            this.f507j = C0050b.m633a("battle_progress_fill.png");
            this.f508l = C0050b.m633a("battle_over_deco.png");
            i = i2 + 1 + 1;
            this.f498a = C0050b.m633a(str);
            this.f499b = C0050b.m633a("leg_cursors.png");
            while (true) {
                byte b2 = b;
                if (b2 >= 5) {
                    this.f532b = C0005e.f76a.m104a(C0005e.f76a.f95b, (byte) 10, 0);
                    ((AbstractC0041i) this).f456a = new C0025r(new byte[]{51, 56, 4, 1, 5}, new byte[]{51, 2, 58, 53, 54, 59, 63}, null);
                    ((AbstractC0041i) this).f456a.m303a(true, false);
                    ((AbstractC0041i) this).f456a.m285a((short) 190, (byte) 58);
                    this.f533a = new C0023p((byte) 30);
                    this.f533a.m268a((short) 264);
                    this.f533a.m267a(C0066a.m774a(265, new String[]{String.valueOf(C0050b.f547c)}));
                    this.f533a.f246a = C0059h.f576a[87];
                    this.f533a.m261a(true);
                    ((AbstractC0041i) this).f456a.m282a(false, this.f533a);
                    m580d();
                    m581n();
                    this.f517a = 0L;
                    super.f463k = (short) -101;
                    RunnableC0037e.f360a.m447a(true);
                    if (C0005e.f76a != null) {
                        m527d(C0005e.f76a.m143e());
                        return;
                    }
                    return;
                }
                byte b3 = 0;
                while (true) {
                    byte b4 = b3;
                    if (b4 < 6) {
                        this.f509a[b2][b4] = 0;
                        b3 = (byte) (b4 + 1);
                    }
                }
                b = (byte) (b2 + 1);
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("BS r.l.e, step ").append(String.valueOf(i)).append(": ").append(e.toString()).toString());
        }
        b = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m565a(byte b) {
        this.f518b = true;
        this.f519f = b;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        int i = 1;
        try {
            if (!C0005e.f76a.f81a || C0005e.f76a.m94a((byte) 1) == null) {
                ((AbstractC0041i) this).f456a.m301b((byte) 54);
            } else {
                ((AbstractC0041i) this).f456a.m302c((byte) 54);
            }
            mo168a();
            int i2 = 1 + 1 + 1;
            if (graphics != null) {
                int iM567a = (m567a((byte) 0) % 34) - 34;
                int iM569b = (m569b((byte) 0) % 30) - 30;
                graphics.setClip(0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
                for (int i3 = iM567a; i3 <= RunnableC0037e.f360a.getWidth(); i3 += 34) {
                    for (int i4 = iM569b; i4 <= RunnableC0037e.f360a.getHeight(); i4 += 30) {
                        RunnableC0037e.m470a(graphics, this.f498a, 0, 0, 34, 30, 0, i3, i4, 20);
                    }
                }
                for (byte b = 0; b < 5; b = (byte) (b + 1)) {
                    for (byte b2 = 0; b2 < 6; b2 = (byte) (b2 + 1)) {
                        short sM567a = m567a(b);
                        short sM569b = (short) (m569b(b2) - 30);
                        graphics.setClip(sM567a, sM569b, 34, 30);
                        if ((b + b2) % 2 == 0) {
                            RunnableC0037e.m470a(graphics, this.f498a, 0, 0, 34, 30, 0, sM567a, sM569b, 20);
                        } else {
                            RunnableC0037e.m470a(graphics, this.f498a, 34, 0, 34, 30, 0, sM567a, sM569b, 20);
                        }
                    }
                }
                graphics.setClip(0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
            }
            i = i2 + 1;
            if (graphics != null && this.f509a != null) {
                for (byte b3 = 0; b3 < 5; b3 = (byte) (b3 + 1)) {
                    for (byte b4 = 0; b4 < 6; b4 = (byte) (b4 + 1)) {
                        if (this.f509a[b3][b4] != 0) {
                            short sM567a2 = m567a(b3);
                            short sM569b2 = (short) (m569b(b4) - 30);
                            if (this.f509a[b3][b4] == -1) {
                                graphics.setClip(sM567a2, sM569b2, 34, 30);
                                if ((b3 + b4) % 2 == 0) {
                                    RunnableC0037e.m470a(graphics, this.f498a, 68, 0, 34, 30, 0, sM567a2, sM569b2, 20);
                                } else {
                                    RunnableC0037e.m470a(graphics, this.f498a, 102, 0, 34, 30, 0, sM567a2, sM569b2, 20);
                                }
                                graphics.setClip(0, 0, RunnableC0037e.f360a.getWidth(), RunnableC0037e.f360a.getHeight());
                            } else {
                                if (!this.f521c && this.f525i == this.f524h && this.f509a[b3][b4] == -128) {
                                    RunnableC0037e.m470a(graphics, this.f499b, 18 * this.f529k, 0, 18, 17, 0, ((short) (sM567a2 + 8)) + 1, (short) (sM569b2 + 6), 0);
                                }
                                byte b5 = (byte) (this.f509a[b3][b4] & 127);
                                if (m587a(b5)) {
                                    C0001a c0001aM588a = null;
                                    try {
                                        c0001aM588a = m588a(b5);
                                    } catch (Exception e) {
                                        C0063c.m744a(new StringBuffer().append("unitDraw [").append((int) b5).append("]").append(e).toString(), true);
                                    }
                                    if (c0001aM588a != null) {
                                        synchronized (c0001aM588a) {
                                            c0001aM588a.mo52a(graphics, sM567a2, sM569b2, (short) -126);
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            int i5 = i + 1;
            if (this.f512a) {
                if (this.f521c || this.f525i != this.f524h) {
                    m536a(graphics, (short) (m567a(this.f510a) + 10), (short) ((m569b(this.f511b) - 30) + 4), 0);
                } else {
                    m536a(graphics, (short) (m567a(this.f510a) + 8), (short) ((m569b(this.f511b) - 30) + 6), 0);
                }
            }
            int i6 = i5 + 1;
            if (this.f517a != 0) {
                int iM104a = (C0005e.f76a.m104a(C0005e.f76a.f95b, (byte) 10, 0) * 100) / this.f532b;
                String string = new Date(((long) f497a) - (System.currentTimeMillis() - this.f517a)).toString();
                String strSubstring = string.substring(string.indexOf(":") + 1);
                strSubstring.substring(0, strSubstring.indexOf(" "));
                if (((long) f497a) - (System.currentTimeMillis() - this.f517a) < 0) {
                    if (this.f512a) {
                        ((AbstractC0041i) this).f456a.m307a(f496a, true, true, true);
                        this.f512a = false;
                    }
                    m566a(graphics, 0, iM104a);
                } else {
                    m566a(graphics, (int) ((100 * (((long) f497a) - (System.currentTimeMillis() - this.f517a))) / ((long) f497a)), iM104a);
                }
            }
            ((AbstractC0041i) this).f456a.m291a(graphics);
            i = i6 + 1 + 1;
            if (this.f523a[this.f525i] != null && this.f525i != this.f524h) {
                if (this.f523a[this.f525i].mo160a()) {
                    this.f523a[this.f525i].mo161a();
                    this.f523a[this.f525i] = null;
                    this.f525i = (byte) (this.f525i + 1);
                    if (this.f525i >= this.f523a.length) {
                        this.f525i = (byte) 0;
                    }
                } else {
                    try {
                        this.f523a[this.f525i].mo159a(graphics);
                    } catch (Exception e2) {
                        C0063c.m744a(new StringBuffer().append("m_draw ").append(e2).toString(), false);
                    }
                }
            }
            int i7 = i + 1;
            if (this.f518b) {
                if (this.f516b != null) {
                    m577o();
                }
                if (this.f520g <= 20) {
                    if (this.f525i == this.f524h) {
                        this.f520g = (byte) (this.f520g + 1);
                    }
                } else {
                    RunnableC0037e.f360a.m461j();
                    RunnableC0037e.f360a.m441a(this.f519f);
                    RunnableC0037e.f360a.f387a = null;
                    C0063c.f597a.m749a(new C0058g(C0059h.f576a[73]));
                }
            }
        } catch (Exception e3) {
            C0063c.m746a(new StringBuffer().append("BS d.s.e, step ").append(String.valueOf(i)).append(": ").append(e3.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m566a(Graphics graphics, int i, int i2) {
        try {
            int width = RunnableC0037e.f360a.getWidth();
            int height = RunnableC0037e.f360a.getHeight();
            int iM473a = RunnableC0037e.m473a(this.f502e);
            int i3 = (width - iM473a) / 2;
            RunnableC0037e.m467a(graphics, this.f502e, i3, height, 36);
            int iM473a2 = RunnableC0037e.m473a(this.f500c) / 2;
            int iM474b = RunnableC0037e.m474b(this.f500c);
            if (iM473a + (iM473a2 << 1) < width) {
                RunnableC0037e.m471a(graphics, this.f501d, 2, 0, i3, height, iM473a2, true, 32);
                RunnableC0037e.m471a(graphics, this.f501d, 2, 1, i3 + iM473a, height, width - iM473a2, true, 32);
            }
            int iM474b2 = RunnableC0037e.m474b(this.f503f);
            int iM473a3 = RunnableC0037e.m473a(this.f503f) / 2;
            int i4 = (height - iM474b2) / 2;
            RunnableC0037e.m470a(graphics, this.f503f, 0, 0, iM473a3, iM474b2, 0, 0, i4, 20);
            RunnableC0037e.m470a(graphics, this.f503f, iM473a3, 0, iM473a3, iM474b2, 0, width, i4, 24);
            if (i4 + iM474b2 < height - iM474b) {
                RunnableC0037e.m471a(graphics, this.f504g, 2, 0, 0, i4 + iM474b2, height - iM474b, false, 4);
                RunnableC0037e.m471a(graphics, this.f504g, 2, 1, width, i4 + iM474b2, height - iM474b, false, 8);
            }
            RunnableC0037e.m471a(graphics, this.f504g, 2, 0, 0, i4, 0, false, 4);
            RunnableC0037e.m471a(graphics, this.f504g, 2, 1, width, i4, 0, false, 8);
            RunnableC0037e.m470a(graphics, this.f500c, 0, 0, iM473a2, iM474b, 0, 0, height, 36);
            RunnableC0037e.m470a(graphics, this.f500c, iM473a2, 0, iM473a2, iM474b, 0, width, height, 40);
            int iM473a4 = RunnableC0037e.m473a(this.f505h) / 2;
            int iM474b3 = RunnableC0037e.m474b(this.f505h);
            if (width > (iM473a4 << 1)) {
                RunnableC0037e.m471a(graphics, this.f506i, 1, 0, iM473a4, 0, width - iM473a4, true, 16);
            }
            RunnableC0037e.m470a(graphics, this.f505h, 0, 0, iM473a4, iM474b3, 0, 0, 0, 20);
            RunnableC0037e.m470a(graphics, this.f505h, iM473a4, 0, iM473a4, iM474b3, 0, width, 0, 24);
            int i5 = width - 49;
            int iM473a5 = RunnableC0037e.m473a(this.f507j) / 4;
            int iM474b4 = RunnableC0037e.m474b(this.f507j);
            int i6 = 25 + ((i5 * i) / 100);
            RunnableC0037e.m465b(graphics, 25, 2, i6 - 25, iM474b4);
            RunnableC0037e.m471a(graphics, this.f507j, 4, 3, 25, 2, i6 - iM473a5, true, 16);
            RunnableC0037e.m470a(graphics, this.f507j, iM473a5 << 1, 0, iM473a5, iM474b4, 0, i6, 2, 24);
            int i7 = (width - 24) - ((i5 * i2) / 100);
            RunnableC0037e.m465b(graphics, i7, 9, (width - 24) - i7, iM474b4);
            RunnableC0037e.m471a(graphics, this.f507j, 4, 1, width - 24, 9, i7 + iM473a5, true, 16);
            RunnableC0037e.m470a(graphics, this.f507j, 0, 0, iM473a5, iM474b4, 0, i7, 9, 20);
            RunnableC0037e.m465b(graphics, 0, 0, width, height);
            int iM473a6 = RunnableC0037e.m473a(this.f508l) / 2;
            int iM474b5 = RunnableC0037e.m474b(this.f508l);
            RunnableC0037e.m470a(graphics, this.f508l, 0, 0, iM473a6, iM474b5, 0, 21, 9, 20);
            RunnableC0037e.m470a(graphics, this.f508l, iM473a6, 0, iM473a6, iM474b5, 0, (width - 21) + 1, 2, 24);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("BS d.f.e, step ").append(String.valueOf(0)).append(": ").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private short m567a(byte b) {
        return (short) (m568a() + (b * 34));
    }

    /* JADX INFO: renamed from: a */
    private static short m568a() {
        return (short) ((RunnableC0037e.f360a.getWidth() - 170) / 2);
    }

    /* JADX INFO: renamed from: b */
    private short m569b(byte b) {
        return (short) (m570b() + (30 * (b + 1)));
    }

    /* JADX INFO: renamed from: b */
    private short m570b() {
        int iM474b = RunnableC0037e.m474b(this.f506i);
        return (short) (iM474b + ((((RunnableC0037e.f360a.getHeight() - iM474b) - C0025r.m274a()) - 180) / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        C0006f[] c0006fArrM94a;
        if (c0023p == null) {
            return false;
        }
        ?? M265a = c0023p.m265a();
        switch (M265a) {
            case 1:
                try {
                    if (this.f524h != this.f525i || this.f521c) {
                        return true;
                    }
                    this.f521c = true;
                    m534e((byte) -1);
                    m583a(this.f510a, this.f511b);
                    C0063c.f597a.m749a(this.f534a);
                    this.f534a = null;
                    this.f516b = null;
                    m586a().m26a(false);
                    m577o();
                    this.f514c = (byte) -1;
                    return true;
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("GO ").append(e).toString());
                    return true;
                }
            case 2:
            case 58:
                if (this.f524h != this.f525i || this.f521c) {
                    return true;
                }
                if (this.f534a != null) {
                    C0063c.f597a.m749a(this.f534a);
                    this.f534a = null;
                }
                return m571a(c0023p.m265a() == 58);
            case 4:
                if (this.f524h != this.f525i || this.f521c) {
                    return true;
                }
                this.f530l = this.f510a;
                this.f531m = this.f511b;
                C0005e.f76a.f81a = false;
                this.f521c = true;
                m534e((byte) -1);
                try {
                    C0058g c0058g = new C0058g(C0059h.f576a[46], (short) 6, (short) 0);
                    c0058g.m670a(this.f515a.m68e());
                    c0058g.m672a(this.f510a);
                    c0058g.m672a(this.f511b);
                    C0063c.f597a.m749a(c0058g);
                    this.f528j = (byte) 1;
                    this.f515a.m63e(this.f515a.mo24c() - 1);
                    C0005e.f76a.f81a = false;
                    C0004d c0004dM105a = C0005e.m105a(C0005e.f76a.f95b, C0004d.f72a);
                    if (c0004dM105a != null) {
                        c0004dM105a.f75b -= this.f515a.mo23b();
                    }
                    if (this.f515a.mo24c() <= 0) {
                        C0005e.f76a.m106a(this.f515a.m68e());
                    }
                    break;
                } catch (Exception e2) {
                    C0063c.m746a(new StringBuffer().append("magic").append(e2.toString()).toString());
                }
                this.f515a = null;
                return true;
            case 5:
                if (this.f524h != this.f525i || this.f521c) {
                    return true;
                }
                this.f521c = true;
                m534e((byte) -1);
                try {
                    m590p();
                    return true;
                } catch (Exception e3) {
                    C0063c.m746a(new StringBuffer().append("CS_ATTACK").append(e3.toString()).toString());
                    return true;
                }
            case 53:
                RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m186a((short) -4), true);
                return true;
            case 54:
                if (this.f524h != this.f525i || (c0006fArrM94a = C0005e.f76a.m94a((byte) 1)) == null || c0006fArrM94a.length <= 0) {
                    return true;
                }
                RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m186a((short) -1), true);
                return true;
            case 56:
                if (this.f524h != this.f525i) {
                    return true;
                }
                this.f515a = null;
                return true;
            case 59:
                Main2.f0a.f12b = this.f535a.f84a;
                Main2.f0a.m1b((byte) 6);
                return true;
            case 63:
                C0040h c0040h = new C0040h(this);
                if (this.f513m >= 3) {
                    RunnableC0037e.m431a(C0066a.m773a(39), C0066a.m773a(209), new StringBuffer().append(C0066a.m773a(41)).append("?").toString(), c0040h);
                    return false;
                }
                RunnableC0037e.m431a(C0066a.m773a(39), C0066a.m773a(40), new StringBuffer().append(C0066a.m773a(41)).append("?").toString(), c0040h);
                return false;
            default:
                try {
                    M265a = super.mo170a(c0023p);
                    return M265a;
                } catch (Exception e4) {
                    C0063c.m746a(M265a.getMessage());
                    return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [mobak.b.a.g] */
    /* JADX INFO: renamed from: a */
    private boolean m571a(boolean z) {
        try {
            this.f534a = null;
            if (m586a() == null) {
                return false;
            }
            m586a().m26a(false);
            this.f514c = (byte) -1;
            m577o();
            this.f516b = null;
            C0058g c0058g = new C0058g(C0059h.f576a[36], (short) 0, (short) 0);
            ?? r0 = z;
            if (r0 != 0) {
                try {
                    r0 = c0058g;
                    r0.m672a((byte) 1);
                } catch (Exception e) {
                    C0063c.m746a(r0.getMessage());
                }
            }
            C0063c.f597a.m749a(c0058g);
            return true;
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append("sendPass ").append(e2).toString());
            return false;
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
        try {
            C0006f[] c0006fArrM94a = C0005e.f76a.m94a((byte) 1);
            if (c0006fArrM94a == null || c0006fArrM94a.length <= 0 || !C0005e.f76a.f81a) {
                ((AbstractC0041i) this).f456a.m301b((byte) 54);
            } else {
                ((AbstractC0041i) this).f456a.m302c((byte) 54);
            }
            if (this.f525i == this.f524h && !this.f521c) {
                m534e((byte) 0);
                if (((AbstractC0041i) this).f456a.m297a()) {
                    return;
                }
                byte b = this.f509a[this.f510a][this.f511b];
                ((AbstractC0041i) this).f456a.m303a(true, false);
                if (this.f512a) {
                    if (b == -1 && this.f515a == null) {
                        m534e((byte) 10);
                    } else if (this.f515a != null && C0005e.f76a.f81a) {
                        m534e((byte) 3);
                        byte b2 = this.f509a[this.f510a][this.f511b];
                        byte b3 = b2;
                        if (b2 != -1) {
                            b3 = (byte) (this.f509a[this.f510a][this.f511b] & 127);
                        }
                        boolean zM158b = false;
                        if (b3 == 0) {
                            zM158b = this.f515a.m158b((byte) 16);
                        } else if (b3 >= 1 && b3 <= 5) {
                            zM158b = this.f515a.m158b((byte) 2);
                        } else if (b3 >= 51 && b3 <= 100) {
                            zM158b = this.f515a.m158b((byte) 1);
                        } else if (b3 == -1) {
                            zM158b = this.f515a.m158b((byte) 32);
                        }
                        if (!zM158b) {
                            ((AbstractC0041i) this).f456a.m288a((byte) 56, false);
                            m534e((byte) 3);
                            return;
                        } else {
                            ((AbstractC0041i) this).f456a.m288a((byte) 56, false);
                            ((AbstractC0041i) this).f456a.m288a((byte) 4, false);
                            m534e((byte) 4);
                            return;
                        }
                    }
                    if (this.f514c > 0) {
                        C0001a c0001aM586a = m586a();
                        if (c0001aM586a == null) {
                            return;
                        }
                        boolean zM25a = c0001aM586a.m25a();
                        byte bMo22a = m586a().mo22a();
                        byte bMo23b = m586a().mo23b();
                        if (zM25a && bMo22a - 1 >= 0 && this.f509a[bMo22a - 1][bMo23b] != -1 && ((byte) (this.f509a[bMo22a - 1][bMo23b] & 127)) > 50) {
                            zM25a = false;
                        }
                        if (zM25a && bMo22a + 1 < 5 && this.f509a[bMo22a + 1][bMo23b] != -1 && ((byte) (this.f509a[bMo22a + 1][bMo23b] & 127)) > 50) {
                            zM25a = false;
                        }
                        if (zM25a && bMo23b - 1 >= 0 && this.f509a[bMo22a][bMo23b - 1] != -1 && ((byte) (this.f509a[bMo22a][bMo23b - 1] & 127)) > 50) {
                            zM25a = false;
                        }
                        if (zM25a && bMo23b + 1 < 6 && this.f509a[bMo22a][bMo23b + 1] != -1 && ((byte) (this.f509a[bMo22a][bMo23b + 1] & 127)) > 50) {
                            zM25a = false;
                        }
                        if (b == 0) {
                            if (m586a() == null || m586a().mo24c() != -1) {
                                m534e((byte) 10);
                            } else {
                                m534e((byte) 7);
                            }
                        } else if (((byte) (b & 128)) == -128 && b != -1) {
                            m534e((byte) 1);
                        }
                        if (b != -1) {
                            byte b4 = (byte) (b & 127);
                            if (b4 >= 1 && b4 <= 50) {
                                m534e((byte) 9);
                            } else if (b4 >= 51 && b4 <= 100) {
                                if (zM25a && c0001aM586a.m25a()) {
                                    m534e((byte) 5);
                                } else {
                                    byte bM589a = m589a(this.f510a, this.f511b, true);
                                    if ((c0001aM586a.mo24c() == -1 || c0001aM586a.mo24c() >= bM589a) && bM589a >= 0) {
                                        m534e((byte) 5);
                                    } else {
                                        m534e((byte) 10);
                                    }
                                }
                            }
                        }
                    }
                    if (((AbstractC0041i) this).f457d == 5) {
                        ((AbstractC0041i) this).f456a.m288a((byte) 5, false);
                    } else if (((AbstractC0041i) this).f457d == 1 || ((AbstractC0041i) this).f457d == 7) {
                        ((AbstractC0041i) this).f456a.m288a((byte) 1, false);
                    }
                    this.f533a.m261a(true);
                }
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("defineMenu ").append(e).toString());
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final void mo202a(int i) {
        switch (RunnableC0037e.f360a.getGameAction(i)) {
            case 1:
                if (this.f511b > 0) {
                    this.f511b = (byte) (this.f511b - 1);
                }
                break;
            case 2:
                if (this.f510a > 0) {
                    this.f510a = (byte) (this.f510a - 1);
                }
                break;
            case 5:
                if (this.f510a < 4) {
                    this.f510a = (byte) (this.f510a + 1);
                }
                break;
            case 6:
                if (this.f511b < 5) {
                    this.f511b = (byte) (this.f511b + 1);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m572a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    if (this.f509a[b2][b4] == -1) {
                        this.f509a[b2][b4] = 0;
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
        byte b5 = 0;
        while (true) {
            byte b6 = b5;
            if (b6 >= bArr.length) {
                return;
            }
            byte b7 = (byte) ((bArr[b6] & (-16)) >> 4);
            byte b8 = (byte) (bArr[b6] & 15);
            if (b7 >= 0 && b7 < 5 && b8 >= 0 && b8 < 6) {
                this.f509a[b7][b8] = -1;
            }
            b5 = (byte) (b6 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final byte m573a(byte b) {
        return (byte) ((b & (-16)) >> 4);
    }

    /* JADX INFO: renamed from: b */
    public static final byte m574b(byte b) {
        return (byte) (b & 15);
    }

    /* JADX INFO: renamed from: b */
    public final void m575b(byte[] bArr) {
        C0001a c0001aM586a;
        byte bMo24c;
        try {
            this.f516b = null;
            if (bArr == null || bArr.length == 0 || (bMo24c = (c0001aM586a = m586a()).mo24c()) == -1) {
                return;
            }
            this.f516b = new byte[(bMo24c << 1) + 1][(bMo24c << 1) + 1];
            for (short s = 0; s < bArr.length; s = (short) (s + 1)) {
                this.f516b[s % ((bMo24c << 1) + 1)][s / ((bMo24c << 1) + 1)] = bArr[s];
            }
            byte bMo22a = c0001aM586a.mo22a();
            byte bMo23b = c0001aM586a.mo23b();
            for (byte b = 0; b < 5; b = (byte) (b + 1)) {
                for (byte b2 = 0; b2 < 6; b2 = (byte) (b2 + 1)) {
                    byte b3 = (byte) ((b - bMo22a) + bMo24c);
                    byte b4 = (byte) ((b2 - bMo23b) + bMo24c);
                    if (b3 >= 0 && b4 >= 0 && b3 < (bMo24c * 2) + 1 && b4 < (bMo24c * 2) + 1 && this.f516b[b3][b4] <= bMo24c) {
                        this.f509a[b][b2] = (byte) (this.f509a[b][b2] | (-128));
                    }
                }
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("set unit environs: ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m576a(byte b, byte b2, byte b3) {
        try {
            C0001a c0001aM588a = m588a(b);
            if (c0001aM588a != null) {
                c0001aM588a.m30c(b2);
                c0001aM588a.m29b(b3);
                for (byte b4 = 0; b4 < 5; b4 = (byte) (b4 + 1)) {
                    for (byte b5 = 0; b5 < 6; b5 = (byte) (b5 + 1)) {
                        if (this.f509a[b4][b5] != -1) {
                            if (((byte) (this.f509a[b4][b5] & 127)) == b && !(b4 == b2 && b5 == b3)) {
                                this.f509a[b4][b5] = 0;
                                C0063c.m746a(new StringBuffer().append("BattleScreen: misplaced unit \u2116").append(String.valueOf((int) b)).append(" found in (").append(String.valueOf((int) b4)).append(", ").append(String.valueOf((int) b5)).append(") but must be in (").append(String.valueOf((int) b2)).append(", ").append(String.valueOf((int) b3)).append(")").toString());
                            } else if (((byte) (this.f509a[b4][b5] & 127)) != b && b4 == b2 && b5 == b3) {
                                this.f509a[b4][b5] = b;
                                C0063c.m746a(new StringBuffer().append("BattleScreen: unit \u2116").append(String.valueOf((int) b)).append(" must be in (").append(String.valueOf((int) b4)).append(", ").append(String.valueOf((int) b5)).append(") but it wasn't there").toString());
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("BattleScreen.reassureActiveUnitPosition (").append(String.valueOf((int) b)).append(", ").append(String.valueOf((int) b2)).append(", ").append(String.valueOf((int) b3)).append(") error: ").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: o */
    private void m577o() {
        this.f516b = null;
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                return;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    if (this.f509a[b2][b4] != -1 && ((byte) (this.f509a[b2][b4] & (-128))) == -128) {
                        this.f509a[b2][b4] = (byte) (this.f509a[b2][b4] & 127);
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m578c(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        byte b = (byte) ((bArr[0] & 240) >> 4);
        m591a(new C0044l(this, bArr, this.f509a[b][(byte) (bArr[0] & 15)]));
    }

    /* JADX INFO: renamed from: a */
    public final void m579a(byte b, int i) {
        try {
            this.f521c = false;
            m577o();
            if (b >= 1 && b <= 50) {
                this.f534a = null;
                if (!this.f512a) {
                    this.f513m = (short) (this.f513m + 1);
                    C0005e.f76a.f81a = C0005e.f76a.m94a((byte) 1) != null;
                    if (i > 0) {
                        f497a = i;
                    }
                    this.f517a = System.currentTimeMillis();
                    this.f522d = false;
                    ((AbstractC0041i) this).f456a.m307a(f496a, false, true, true);
                }
                this.f512a = true;
            }
            if (b >= 51 && b <= 100) {
                if (this.f512a || this.f517a == 0) {
                    this.f513m = (short) (this.f513m + 1);
                    ((AbstractC0041i) this).f456a.m307a(f496a, true, true, true);
                    f497a = i;
                    this.f517a = System.currentTimeMillis();
                }
                this.f512a = false;
            }
            C0001a c0001aM586a = m586a();
            if (c0001aM586a != null) {
                c0001aM586a.m26a(false);
            }
            this.f514c = b;
            C0001a c0001aM588a = m588a(b);
            if (c0001aM588a != null) {
                c0001aM588a.m26a(true);
                if (this.f512a) {
                    this.f510a = c0001aM588a.mo22a();
                    this.f511b = c0001aM588a.mo23b();
                }
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("setActiveUnit: ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m580d() {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    byte b5 = (byte) (this.f509a[b2][b4] & 127);
                    if (b5 >= 1 && b5 <= 50) {
                        this.f509a[b2][b4] = 0;
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
        C0001a[] c0001aArrM92a = C0005e.f76a.m92a();
        if (c0001aArrM92a == null || c0001aArrM92a.length <= 0) {
            return;
        }
        byte b6 = 0;
        while (true) {
            byte b7 = b6;
            if (b7 >= c0001aArrM92a.length) {
                return;
            }
            if (c0001aArrM92a[b7] != null) {
                this.f509a[c0001aArrM92a[b7].mo22a()][5] = (byte) (b7 + 1);
                c0001aArrM92a[b7].m30c(b7);
                c0001aArrM92a[b7].m29b((byte) 5);
            }
            b6 = (byte) (b7 + 1);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m581n() {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 6) {
                    byte b5 = (byte) (this.f509a[b2][b4] & 127);
                    if (b5 >= 51 && b5 <= 100) {
                        this.f509a[b2][b4] = 0;
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
        if (this.f535a == null) {
            return;
        }
        C0001a[] c0001aArrM92a = this.f535a.m92a();
        byte b6 = 0;
        while (true) {
            byte b7 = b6;
            if (b7 >= c0001aArrM92a.length) {
                return;
            }
            if (c0001aArrM92a[b7] != null) {
                this.f509a[(5 - c0001aArrM92a[b7].mo22a()) - 1][0] = (byte) (b7 + 51);
                c0001aArrM92a[b7].m30c((byte) ((5 - c0001aArrM92a[b7].mo22a()) - 1));
                c0001aArrM92a[b7].m29b((byte) 0);
            }
            b6 = (byte) (b7 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m582a(byte b, byte b2) {
        byte[] bArr;
        try {
            C0001a c0001aM586a = m586a();
            if (c0001aM586a == null || b < 0 || b >= 5 || b2 < 0 || b2 >= 6) {
                return null;
            }
            if (this.f516b == null || this.f516b.length <= 1) {
                byte bAbs = (byte) Math.abs(b - c0001aM586a.mo22a());
                byte bAbs2 = (byte) Math.abs(b2 - c0001aM586a.mo23b());
                byte[] bArr2 = new byte[bAbs + bAbs2 + 1];
                bArr = bArr2;
                bArr2[bArr.length - 1] = m584a(b, b2);
                byte b3 = b;
                byte b4 = b2;
                if (bAbs == 0) {
                    for (byte b5 = 1; b5 < bArr.length; b5 = (byte) (b5 + 1)) {
                        b4 = b2 - c0001aM586a.mo23b() > 0 ? (byte) (b4 - 1) : (byte) (b4 + 1);
                        bArr[(bArr.length - 1) - b5] = m584a(b, b4);
                    }
                } else if (bAbs2 == 0) {
                    for (byte b6 = 1; b6 < bArr.length; b6 = (byte) (b6 + 1)) {
                        b3 = b - c0001aM586a.mo22a() > 0 ? (byte) (b3 - 1) : (byte) (b3 + 1);
                        bArr[(bArr.length - b6) - 1] = m584a(b3, b2);
                    }
                } else {
                    boolean z = false;
                    for (byte b7 = 1; b7 < bArr.length; b7 = (byte) (b7 + 1)) {
                        if ((z || b4 == c0001aM586a.mo23b()) && b3 != c0001aM586a.mo22a()) {
                            b3 = b - c0001aM586a.mo22a() > 0 ? (byte) (b3 - 1) : (byte) (b3 + 1);
                        } else {
                            b4 = b2 - c0001aM586a.mo23b() > 0 ? (byte) (b4 - 1) : (byte) (b4 + 1);
                        }
                        z = !z;
                        bArr[(bArr.length - 1) - b7] = m584a(b3, b4);
                    }
                }
            } else {
                byte bMo22a = (byte) ((b - c0001aM586a.mo22a()) + c0001aM586a.mo24c());
                byte bMo23b = (byte) ((b2 - c0001aM586a.mo23b()) + c0001aM586a.mo24c());
                byte[] bArr3 = new byte[this.f516b[bMo22a][bMo23b] + 1];
                bArr = bArr3;
                bArr3[bArr.length - 1] = m584a(b, b2);
                boolean z2 = false;
                byte b8 = 2;
                while (!z2) {
                    z2 = true;
                    byte b9 = bMo22a;
                    byte b10 = bMo23b;
                    if (bMo22a > 0 && this.f516b[bMo22a - 1][bMo23b] < this.f516b[b9][b10]) {
                        b9 = (byte) (bMo22a - 1);
                    }
                    if (bMo22a < (c0001aM586a.mo24c() << 1) && this.f516b[bMo22a + 1][bMo23b] < this.f516b[b9][b10]) {
                        b9 = (byte) (bMo22a + 1);
                    }
                    if (bMo23b > 0 && this.f516b[bMo22a][bMo23b - 1] < this.f516b[b9][b10]) {
                        b10 = (byte) (bMo23b - 1);
                    }
                    if (bMo23b < (c0001aM586a.mo24c() << 1) && this.f516b[bMo22a][bMo23b + 1] < this.f516b[b9][b10]) {
                        b10 = (byte) (bMo23b + 1);
                    }
                    if (b9 != bMo22a || b10 != bMo23b) {
                        if (b8 <= bArr.length) {
                            bMo22a = b9;
                            bMo23b = b10;
                            bArr[bArr.length - b8] = m584a((byte) ((c0001aM586a.mo22a() + bMo22a) - c0001aM586a.mo24c()), (byte) ((c0001aM586a.mo23b() + bMo23b) - c0001aM586a.mo24c()));
                            b8 = (byte) (b8 + 1);
                            z2 = false;
                        }
                    }
                }
            }
            bArr[0] = m584a(c0001aM586a.mo22a(), c0001aM586a.mo23b());
            return bArr;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getStep ").append(e).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m583a(byte b, byte b2) {
        byte[] bArrM582a = m582a(b, b2);
        if (bArrM582a != null) {
            this.f534a = new C0058g(C0059h.f576a[35], (short) (1 + bArrM582a.length), (short) 0);
            try {
                this.f534a.m672a((byte) bArrM582a.length);
                this.f534a.m669a(bArrM582a);
            } catch (Exception unused) {
            }
            m591a(new C0044l(this, bArrM582a, this.f514c));
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte m584a(byte b, byte b2) {
        return (byte) (((byte) ((b << 4) & (-16))) | ((byte) (b2 & 15)));
    }

    /* JADX INFO: renamed from: a */
    public final void m585a(boolean z, C0001a c0001a, int i) {
        C0001a[] c0001aArr = z ? this.f526a : this.f527b;
        byte length = -1;
        if (c0001aArr == null) {
            c0001aArr = new C0001a[1];
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= c0001aArr.length) {
                break;
            }
            if (c0001aArr[b2] == null) {
                length = b2;
                break;
            }
            b = (byte) (b2 + 1);
        }
        if (length < 0) {
            length = (byte) c0001aArr.length;
            C0001a[] c0001aArr2 = new C0001a[c0001aArr.length + 1];
            System.arraycopy(c0001aArr, 0, c0001aArr2, 0, c0001aArr.length);
            c0001aArr = c0001aArr2;
        }
        c0001aArr[length] = c0001a;
        f497a += i;
        if (z) {
            this.f526a = c0001aArr;
            this.f509a[c0001a.mo22a()][c0001a.mo23b()] = (byte) (c0001a.mo22a() + 1);
        } else {
            this.f527b = c0001aArr;
            this.f509a[c0001a.mo22a()][c0001a.mo23b()] = (byte) (c0001a.mo22a() + 51);
        }
    }

    /* JADX INFO: renamed from: a */
    private C0001a m586a() {
        if (this.f514c <= 0) {
            return null;
        }
        try {
            return m588a(this.f514c);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("cannot get active group: ").append(e).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m587a(byte b) {
        if (b >= 1 && b <= 5) {
            return true;
        }
        if (b > 5 && b <= 50) {
            return true;
        }
        if (b < 51 || b > 55) {
            return b > 55 && b <= 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final C0001a m588a(byte b) {
        if (b >= 1 && b <= 5) {
            return C0005e.f76a.m90a((byte) (b - 1));
        }
        if (b > 5 && b <= 50) {
            if (this.f526a == null) {
                throw new Exception(new StringBuffer().append("bad unit index ").append((int) b).toString());
            }
            if (this.f526a.length <= b - 6) {
                throw new Exception(new StringBuffer().append("bad unit index ").append((int) b).toString());
            }
            return this.f526a[b - 6];
        }
        if (b >= 51 && b <= 55) {
            return this.f535a.m90a((byte) (b - 51));
        }
        if (b <= 55 || b > 100) {
            throw new Exception(new StringBuffer().append("bad unit index ").append((int) b).toString());
        }
        if (this.f527b == null) {
            throw new Exception(new StringBuffer().append("bad unit index ").append((int) b).toString());
        }
        if (this.f527b.length <= b - 56) {
            throw new Exception(new StringBuffer().append("bad unit index ").append((int) b).toString());
        }
        return this.f527b[b - 56];
    }

    /* JADX INFO: renamed from: a */
    private byte m589a(byte b, byte b2, boolean z) {
        C0001a c0001aM586a;
        try {
            if (!this.f512a || (c0001aM586a = m586a()) == null) {
                return (byte) -1;
            }
            if (!z) {
                if (b < 0 || b2 < 0 || b >= 5 || b2 >= 6) {
                    return (byte) -1;
                }
                if (c0001aM586a.mo24c() == -1 || this.f516b == null) {
                    if (b == c0001aM586a.mo22a() && b2 == c0001aM586a.mo23b()) {
                        return (byte) 0;
                    }
                    if ((this.f509a[b][b2] & 127) == 0) {
                        return (byte) (((byte) Math.abs(b - c0001aM586a.mo22a())) + ((byte) Math.abs(b2 - c0001aM586a.mo23b())) + 1);
                    }
                    return (byte) -1;
                }
                byte bMo22a = (byte) ((b - c0001aM586a.mo22a()) + c0001aM586a.mo24c());
                byte bMo23b = (byte) ((b2 - c0001aM586a.mo23b()) + c0001aM586a.mo24c());
                if (bMo22a < 0 || bMo22a >= this.f516b.length || bMo23b < 0 || bMo23b >= this.f516b[bMo22a].length) {
                    return (byte) -1;
                }
                return this.f516b[bMo22a][bMo23b];
            }
            byte[] bArr = new byte[4];
            bArr[0] = 127;
            bArr[1] = 127;
            bArr[2] = 127;
            bArr[3] = 127;
            bArr[0] = m589a((byte) (b - 1), b2, false);
            bArr[1] = m589a(b, (byte) (b2 + 1), false);
            bArr[2] = m589a((byte) (b + 1), b2, false);
            bArr[3] = m589a(b, (byte) (b2 - 1), false);
            char c = 0;
            if (bArr[1] >= 0 && (bArr[1] < bArr[0] || bArr[0] < 0)) {
                c = 1;
            }
            if (bArr[2] >= 0 && (bArr[2] < bArr[c] || bArr[c] < 0)) {
                c = 2;
            }
            if (bArr[3] >= 0 && (bArr[3] < bArr[c] || bArr[c] < 0)) {
                c = 3;
            }
            if (bArr[c] < 0 || bArr[c] >= 127) {
                return (byte) -1;
            }
            if (c0001aM586a.mo24c() != -1 && bArr[c] > c0001aM586a.mo24c()) {
                return (byte) -1;
            }
            return bArr[c];
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getStepsCount ").append(e).toString());
            return (byte) -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0221  */
    /* JADX INFO: renamed from: p */
    private void m590p() {
        C0001a c0001aM586a = m586a();
        if (c0001aM586a == null) {
            return;
        }
        boolean z = true;
        boolean z2 = false;
        C0001a[] c0001aArrM92a = this.f535a.m92a();
        if (c0001aM586a.m25a()) {
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 < c0001aArrM92a.length) {
                    if (c0001aArrM92a[b2] != null && ((Math.abs(c0001aArrM92a[b2].mo22a() - c0001aM586a.mo22a()) == 1 && c0001aArrM92a[b2].mo23b() == c0001aM586a.mo23b()) || (Math.abs(c0001aArrM92a[b2].mo23b() - c0001aM586a.mo23b()) == 1 && c0001aArrM92a[b2].mo22a() == c0001aM586a.mo22a()))) {
                        z = false;
                        break;
                    }
                    b = (byte) (b2 + 1);
                } else {
                    break;
                }
            }
        }
        if (z && c0001aM586a.m25a()) {
            z2 = true;
        } else {
            if (m588a((byte) (this.f509a[this.f510a][this.f511b] & 127)) == null) {
                return;
            }
            byte bM589a = 0;
            if ((Math.abs(m586a().mo22a() - this.f510a) != 1 || m586a().mo23b() != this.f511b) && (Math.abs(m586a().mo23b() - this.f511b) != 1 || m586a().mo22a() != this.f510a)) {
                bM589a = m589a(this.f510a, this.f511b, true);
            }
            if (bM589a != 0) {
                byte[] bArr = new byte[4];
                bArr[0] = 127;
                bArr[1] = 127;
                bArr[2] = 127;
                bArr[3] = 127;
                bArr[0] = m589a((byte) (this.f510a - 1), this.f511b, false);
                bArr[1] = m589a(this.f510a, (byte) (this.f511b + 1), false);
                bArr[2] = m589a((byte) (this.f510a + 1), this.f511b, false);
                bArr[3] = m589a(this.f510a, (byte) (this.f511b - 1), false);
                char c = 0;
                if (bArr[1] > 0 && (bArr[1] < bArr[0] || bArr[0] < 0)) {
                    c = 1;
                }
                if (bArr[2] > 0 && (bArr[2] < bArr[c] || bArr[c] < 0)) {
                    c = 2;
                }
                if (bArr[3] > 0 && (bArr[3] < bArr[c] || bArr[c] < 0)) {
                    c = 3;
                }
                if (bArr[c] > 0) {
                    switch (c) {
                        case 0:
                            m583a((byte) (this.f510a - 1), this.f511b);
                            break;
                        case 1:
                            m583a(this.f510a, (byte) (this.f511b + 1));
                            break;
                        case 2:
                            m583a((byte) (this.f510a + 1), this.f511b);
                            break;
                        case 3:
                            m583a(this.f510a, (byte) (this.f511b - 1));
                            break;
                    }
                    z2 = true;
                }
            } else {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f534a == null) {
                this.f534a = new C0058g(C0059h.f576a[37], (short) 50, (short) 0);
            } else {
                this.f534a.m672a((byte) 1);
            }
            this.f534a.m672a((byte) (this.f514c - 1));
            this.f534a.m672a(this.f510a);
            this.f534a.m672a(this.f511b);
            C0063c.f597a.m749a(this.f534a);
            this.f516b = null;
            this.f534a = null;
            m586a().m26a(false);
            m577o();
            this.f514c = (byte) -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m591a(AbstractC0045m abstractC0045m) {
        if (abstractC0045m == null) {
            return;
        }
        this.f523a[this.f524h] = abstractC0045m;
        this.f524h = (byte) (this.f524h + 1);
        if (this.f524h >= this.f523a.length) {
            this.f524h = (byte) 0;
        }
        m534e((byte) -1);
    }

    /* JADX INFO: renamed from: b */
    public final void m592b(byte b, int i) {
        m591a(new C0046n(this, b, i));
    }

    /* JADX INFO: renamed from: b */
    public final void m593b(byte b) {
        if (1 == this.f528j) {
            this.f528j = (byte) 0;
            this.f521c = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m594a(boolean z) {
        Image imageM638a = z ? C0050b.m638a(C0050b.m633a("magic_success.png")) : C0050b.m638a(C0050b.m633a("magic_failure.png"));
        m591a(new C0007a(this, imageM638a, (short) RunnableC0037e.m477b(imageM638a), m567a(this.f530l), (short) (m569b(this.f531m) - 30)));
    }

    /* JADX INFO: renamed from: a */
    public final void m595a(byte b, byte b2, byte b3, byte b4) {
        byte b5 = (byte) (this.f509a[b][b2] & 127);
        this.f509a[b][b2] = (byte) (this.f509a[b][b2] & (-128));
        this.f509a[b3][b4] = (byte) (this.f509a[b3][b4] | b5);
    }

    /* JADX INFO: renamed from: c */
    private boolean m596c(int i, int i2) {
        if (i < m568a() || i2 < m570b() || i > m568a() + 170 || i2 > m570b() + 210) {
            return false;
        }
        byte bM568a = (byte) ((i - m568a()) / 34);
        byte bM570b = (byte) ((i2 - m570b()) / 30);
        if (bM568a < 0) {
            bM568a = 0;
        }
        if (bM568a >= 5) {
            bM568a = 4;
        }
        if (bM570b < 0) {
            bM570b = 0;
        }
        if (bM570b >= 6) {
            bM570b = 5;
        }
        this.f510a = bM568a;
        this.f511b = bM570b;
        return true;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: b */
    protected final boolean mo180b(int i, int i2, int i3) {
        return false;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        m596c(i, i2);
        mo168a();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mobak.a.b.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        m596c(i, i2);
        ?? M531b = this;
        M531b.mo168a();
        try {
            M531b = m531b(((AbstractC0041i) this).f456a.m296a(false, true, false));
            return true;
        } catch (Exception e) {
            M531b.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    static byte m597a(C0049q c0049q, byte b) {
        return (byte) (b & 127);
    }

    /* JADX INFO: renamed from: a */
    static boolean m598a(C0049q c0049q, byte b) {
        return m587a(b);
    }

    /* JADX INFO: renamed from: a */
    static byte[][] m599a(C0049q c0049q) {
        return c0049q.f509a;
    }

    /* JADX INFO: renamed from: a */
    static short m600a(C0049q c0049q, byte b) {
        return c0049q.m567a(b);
    }

    /* JADX INFO: renamed from: b */
    static short m601b(C0049q c0049q, byte b) {
        return c0049q.m569b(b);
    }

    /* JADX INFO: renamed from: a */
    static void m602a(C0049q c0049q, byte b, C0001a c0001a) {
        if (b >= 1 && b <= 5) {
            C0005e.f76a.m91a((byte) (b - 1), (C0001a) null);
            return;
        }
        if (b > 5 && b <= 50) {
            if (c0049q.f526a == null || c0049q.f526a.length <= b - 6) {
                return;
            }
            c0049q.f526a[b - 6] = null;
            return;
        }
        if (b >= 51 && b <= 55) {
            c0049q.f535a.m91a((byte) (b - 51), (C0001a) null);
        } else {
            if (b <= 55 || b > 100 || c0049q.f527b == null || c0049q.f527b.length <= b - 56) {
                return;
            }
            c0049q.f527b[b - 56] = null;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m603a(C0049q c0049q, byte b) {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= 5) {
                return;
            }
            byte b4 = 0;
            while (true) {
                byte b5 = b4;
                if (b5 < 6) {
                    if (((byte) (c0049q.f509a[b3][b5] & 127)) == b) {
                        c0049q.f509a[b3][b5] = (byte) (c0049q.f509a[b3][b5] & (-128));
                        return;
                    }
                    b4 = (byte) (b5 + 1);
                }
            }
            b2 = (byte) (b3 + 1);
        }
    }
}
