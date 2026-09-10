package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.C0050b;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p006c.C0066a;
import mobak.p006c.C0069d;
import mobak.p006c.InterfaceC0070e;

/* JADX INFO: renamed from: mobak.a.b.a.e */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/e.class */
public abstract class AbstractC0012e extends AbstractC0041i implements InterfaceC0070e {

    /* JADX INFO: renamed from: a */
    public static short f137a = -1;

    /* JADX INFO: renamed from: b */
    protected static short f138b = -1;

    /* JADX INFO: renamed from: c */
    protected static short f139c = -1;

    /* JADX INFO: renamed from: l */
    private static short f140l = -1;

    /* JADX INFO: renamed from: m */
    private static short f141m = -1;

    /* JADX INFO: renamed from: d */
    protected static short f142d = -1;

    /* JADX INFO: renamed from: e */
    protected static short f143e = -1;

    /* JADX INFO: renamed from: f */
    protected static short f144f = -1;

    /* JADX INFO: renamed from: g */
    protected static short f145g = -1;

    /* JADX INFO: renamed from: n */
    private static short f146n = -1;

    /* JADX INFO: renamed from: o */
    private static short f147o = -1;

    /* JADX INFO: renamed from: h */
    protected static short f148h = -1;

    /* JADX INFO: renamed from: i */
    protected static short f149i = -1;

    /* JADX INFO: renamed from: j */
    protected static short f150j = -1;

    /* JADX INFO: renamed from: p */
    private static short f151p = -1;

    /* JADX INFO: renamed from: q */
    private static short f152q = -1;

    /* JADX INFO: renamed from: r */
    private static short f153r = -1;

    /* JADX INFO: renamed from: s */
    private static short f154s = -1;

    /* JADX INFO: renamed from: t */
    private static short f155t = -1;

    /* JADX INFO: renamed from: u */
    private static short f156u = -1;

    /* JADX INFO: renamed from: v */
    private static short f157v = -1;

    /* JADX INFO: renamed from: w */
    private static short f158w = -1;

    /* JADX INFO: renamed from: x */
    private static short f159x = -1;

    /* JADX INFO: renamed from: y */
    private static short f160y = -1;

    /* JADX INFO: renamed from: z */
    private static short f161z = -1;

    /* JADX INFO: renamed from: A */
    private static short f162A = -1;

    /* JADX INFO: renamed from: B */
    private static short f163B = -1;

    /* JADX INFO: renamed from: C */
    private static short f164C = -1;

    /* JADX INFO: renamed from: D */
    private static short f165D = -1;

    /* JADX INFO: renamed from: a */
    protected String f166a;

    /* JADX INFO: renamed from: b */
    protected String f167b = AbstractC0041i.f449c;

    /* JADX INFO: renamed from: a */
    private int f168a;

    /* JADX INFO: renamed from: a */
    private Short f169a;

    /* JADX INFO: renamed from: a */
    protected boolean f170a;

    /* JADX INFO: renamed from: b */
    public final void m177b(boolean z) {
        this.f170a = z;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case 55:
                if (RunnableC0037e.f360a.m448b() && !C0063c.f597a.m754b()) {
                    RunnableC0037e.f360a.m449b(false);
                }
                RunnableC0037e.f360a.m443f();
                RunnableC0037e.f360a.m423a().mo223c();
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected boolean mo178a(int i, int i2) {
        return false;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected boolean mo179a(int i, int i2, int i3) {
        return false;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: b */
    protected boolean mo180b(int i, int i2, int i3) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    protected static int m181a(int i, int i2) {
        int i3 = ((i - 300) / 1000) + 1;
        int i4 = i3;
        if (i3 < 0) {
            i4 = 0;
        }
        return i4;
    }

    /* JADX INFO: renamed from: a */
    public void mo182a(String str) {
    }

    protected AbstractC0012e() {
    }

    /* JADX INFO: renamed from: a */
    public static C0013f m183a() {
        try {
            if (f137a == -1) {
                f137a = C0050b.m633a("icons-of-races.png");
            }
            if (f142d == -1) {
                f142d = C0050b.m633a("arrow_top.png");
            }
            if (f143e == -1) {
                f143e = C0050b.m633a("arrow_bottom.png");
            }
            if (f144f == -1) {
                f144f = C0050b.m633a("arrow_left.png");
            }
            if (f145g == -1) {
                f145g = C0050b.m633a("arrow_right.png");
            }
            if (f146n == -1) {
                f146n = C0050b.m633a("red_indicator.png");
            }
            if (f147o == -1) {
                f147o = C0050b.m633a("green_indicator.png");
            }
            if (f148h == -1) {
                f148h = C0050b.m633a("equipment.png");
            }
            if (f149i == -1) {
                f149i = C0050b.m633a("tiles.png");
            }
            if (f150j == -1) {
                f150j = C0050b.m633a("equipment_selected.png");
            }
            if (f139c == -1) {
                f139c = C0050b.m633a("itemCell.png");
            }
            if (f140l == -1) {
                f140l = C0050b.m633a("itemCell1.png");
            }
            if (f141m == -1) {
                f141m = C0050b.m633a("itemCell2.png");
            }
            if (f138b == -1) {
                f138b = C0050b.m633a("separator.png");
            }
            f151p = C0050b.m633a("bottom_corner.png");
            f152q = C0050b.m633a("top_corner.png");
            f153r = C0050b.m633a("horizontal.png");
            f154s = C0050b.m633a("horizontal_mid.png");
            f155t = C0050b.m633a("vertical.png");
            f156u = C0050b.m633a("vertical_mid.png");
            f157v = C0050b.m633a("money_x.png");
            f158w = C0050b.m633a("crystals_x.png");
            f159x = C0050b.m633a("money_crystals_x.png");
            f160y = C0050b.m633a("middle_tile_x.png");
            f161z = C0050b.m633a("crystals.png");
            f162A = C0050b.m633a("money.png");
            f163B = C0050b.m633a("menu_item_left_x.png");
            f164C = C0050b.m633a("menu_item_center_x.png");
            f165D = C0050b.m633a("menu_item_right_x.png");
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("initMainMenu").append(e.toString()).toString());
        }
        C0013f c0013f = new C0013f((short) -103);
        ((AbstractC0012e) c0013f).f166a = null;
        c0013f.f177a = new String[][]{C0013f.m205a()};
        c0013f.f178a = null;
        c0013f.f180b = (byte) 0;
        c0013f.f181c = (byte) 0;
        c0013f.f175a = (byte) 1;
        return c0013f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m184a(Graphics graphics, int i, int i2, int i3) {
        int iM476a = RunnableC0037e.m476a(C0050b.m638a(f139c));
        int iM477b = RunnableC0037e.m477b(C0050b.m638a(f139c));
        short s = f139c;
        if (i3 == 1) {
            s = f140l;
        } else if (i3 == 2) {
            s = f141m;
        }
        RunnableC0037e.m468a(graphics, C0050b.m638a(s), 0, 0, iM476a, iM477b, 0, i, i2, 0);
    }

    /* JADX INFO: renamed from: b */
    public static final C0013f m185b() {
        C0013f c0013f = new C0013f((short) -105);
        ((AbstractC0012e) c0013f).f166a = C0066a.m773a(38);
        ((AbstractC0041i) c0013f).f456a = new C0025r(null, new byte[]{55}, null);
        c0013f.f175a = (byte) 5;
        return c0013f;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0026s m186a(short s) {
        AbstractC0026s c0021n = null;
        switch (s) {
            case -12:
            case -2:
            case -1:
                c0021n = new C0010c(s);
                break;
            case -4:
            case -3:
                c0021n = new C0021n(s);
                break;
        }
        return c0021n;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0026s m187a() {
        C0016i c0016i = new C0016i((short) -5);
        ((AbstractC0026s) c0016i).f273b = (byte) 0;
        return c0016i;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0026s m188a(byte b) {
        C0010c c0010c = new C0010c((short) -6);
        c0010c.m172a(b);
        c0010c.mo168a();
        return c0010c;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0026s m189a(String str) {
        C0016i c0016i = new C0016i((short) -7);
        ((AbstractC0041i) c0016i).f464a.m402a(str, AbstractC0041i.f442b, false, -1);
        return c0016i;
    }

    /* JADX INFO: renamed from: a */
    protected final short m190a() {
        if (this.f169a == null) {
            if (RunnableC0037e.f360a.getHeight() > 220) {
                this.f169a = new Short((short) (RunnableC0037e.m474b(f152q) + RunnableC0037e.m474b(f162A)));
            } else {
                int iM474b = RunnableC0037e.m474b(f152q);
                int iM474b2 = RunnableC0037e.m474b(f162A);
                int iM474b3 = RunnableC0037e.m474b(f159x);
                int iMo191a = mo191a();
                if (iMo191a > 0) {
                    iM474b -= iMo191a;
                }
                this.f169a = new Short((short) (iM474b + ((iM474b2 - iM474b3) / 2) + iM474b3 + 5));
            }
        }
        return this.f169a.shortValue();
    }

    /* JADX INFO: renamed from: a */
    protected int mo191a() {
        return 0;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public void mo169a(Graphics graphics) {
        try {
            graphics.setClip(0, 0, (short) RunnableC0037e.f360a.getWidth(), (short) RunnableC0037e.f360a.getHeight());
            if (f149i == -1) {
                f149i = C0050b.m633a("tiles.png");
            }
            m192a(graphics, f149i, (int) ((AbstractC0041i) this).f467e);
            int width = RunnableC0037e.f360a.getWidth() / 2;
            if (mo200a() != null) {
                AbstractC0041i.f442b.m782a(graphics, mo200a(), width, 6, 17);
            }
            if (this.f166a != null) {
                AbstractC0041i.f442b.m782a(graphics, this.f166a, width, ((AbstractC0041i.f442b.f634a * 3) / 2) + 3, 17);
            }
            int iMo191a = mo191a();
            int width2 = RunnableC0037e.f360a.getWidth();
            int height = RunnableC0037e.f360a.getHeight();
            int iM473a = RunnableC0037e.m473a(f154s) / 2;
            int iM474b = RunnableC0037e.m474b(f154s);
            int i = (width2 - iM473a) / 2;
            RunnableC0037e.m470a(graphics, f154s, 0, 0, iM473a, iM474b, 0, i, height, 36);
            RunnableC0037e.m470a(graphics, f154s, iM473a, 0, iM473a, iM474b, 0, i, 0, 0);
            int iM473a2 = RunnableC0037e.m473a(f152q) / 2;
            int iM474b2 = RunnableC0037e.m474b(f152q);
            if (iMo191a > 0) {
                iM473a2 = 0;
                iM474b2 -= iMo191a;
            }
            if (iM473a + (iM473a2 << 1) < width2) {
                RunnableC0037e.m471a(graphics, f153r, 4, 2, i, 0, iM473a2, true, 16);
                RunnableC0037e.m471a(graphics, f153r, 4, 3, i + iM473a, 0, width2 - iM473a2, true, 16);
            }
            if (iMo191a == 0) {
                RunnableC0037e.m470a(graphics, f152q, 0, 0, iM473a2, iM474b2, 0, 0, 0, 0);
                RunnableC0037e.m470a(graphics, f152q, iM473a2, 0, iM473a2, iM474b2, 0, width2 - iM473a2, 0, 0);
            }
            int iM473a3 = RunnableC0037e.m473a(f151p) / 2;
            int iM474b3 = RunnableC0037e.m474b(f151p);
            if (iM473a + (iM473a3 << 1) < width2) {
                RunnableC0037e.m471a(graphics, f153r, 4, 0, i, height, iM473a3, true, 32);
                RunnableC0037e.m471a(graphics, f153r, 4, 1, i + iM473a, height, width2 - iM473a3, true, 32);
            }
            int iM473a4 = RunnableC0037e.m473a(f162A);
            int iM474b4 = RunnableC0037e.m474b(f162A);
            RunnableC0037e.m470a(graphics, f162A, 0, 0, iM473a4, iM474b4, 0, 0, iM474b2, 0);
            int iM473a5 = RunnableC0037e.m473a(f161z);
            int iM474b5 = RunnableC0037e.m474b(f161z);
            RunnableC0037e.m470a(graphics, f161z, 0, 0, iM473a5, iM474b5, 0, width2 - iM473a5, iM474b2, 0);
            int iM473a6 = RunnableC0037e.m473a(f159x) / 5;
            int iM474b6 = RunnableC0037e.m474b(f159x);
            int i2 = ((width2 << 1) / 3) - iM473a6;
            int i3 = iM474b2 + ((iM474b4 - iM474b6) / 2);
            RunnableC0037e.m470a(graphics, f159x, ((AbstractC0041i) this).f467e * iM473a6, 0, iM473a6, iM474b6, 0, i2, i3, 0);
            int iM473a7 = RunnableC0037e.m473a(f157v) / 5;
            int iM474b7 = RunnableC0037e.m474b(f157v);
            RunnableC0037e.m471a(graphics, f160y, 5, ((AbstractC0041i) this).f467e, i2, i3, iM473a4 + iM473a7, true, 0);
            RunnableC0037e.m470a(graphics, f157v, iM473a7 * ((AbstractC0041i) this).f467e, 0, iM473a7, iM474b7, 0, iM473a4, iM474b2 + ((iM474b4 - iM474b7) / 2), 0);
            int i4 = ((i2 + iM473a4) + iM473a7) / 2;
            int i5 = i3 + (iM474b6 / 2);
            int iM473a8 = RunnableC0037e.m473a(f158w) / 5;
            int iM474b8 = RunnableC0037e.m474b(f158w);
            RunnableC0037e.m471a(graphics, f160y, 5, ((AbstractC0041i) this).f467e, i2 + iM473a6, i3, (width2 - iM473a5) - iM473a8, true, 0);
            RunnableC0037e.m470a(graphics, f158w, iM473a8 * ((AbstractC0041i) this).f467e, 0, iM473a8, iM474b8, 0, (width2 - iM473a5) - iM473a8, iM474b2 + ((iM474b5 - iM474b8) / 2), 0);
            int i6 = ((((i2 + iM473a6) + width2) - iM473a5) - iM473a8) / 2;
            int i7 = i3 + (iM474b6 / 2);
            int iM473a9 = RunnableC0037e.m473a(f156u) / 2;
            int iM474b9 = RunnableC0037e.m474b(f156u);
            RunnableC0037e.m470a(graphics, f156u, 0, 0, iM473a9, iM474b9, 0, 0, iM474b2 + iM474b4, 0);
            RunnableC0037e.m470a(graphics, f156u, iM473a9, 0, iM473a9, iM474b9, 0, width2 - iM473a9, iM474b2 + iM474b5, 0);
            if (iM474b2 + iM474b4 + iM474b9 < height - iM474b3) {
                RunnableC0037e.m471a(graphics, f155t, 2, 0, 0, iM474b2 + iM474b4 + iM474b9, height - iM474b3, false, 4);
                RunnableC0037e.m471a(graphics, f155t, 2, 1, width2, iM474b2 + iM474b5 + iM474b9, height - iM474b3, false, 8);
            }
            RunnableC0037e.m470a(graphics, f151p, 0, 0, iM473a3, iM474b3, 0, 0, height, 36);
            RunnableC0037e.m470a(graphics, f151p, iM473a3, 0, iM473a3, iM474b3, 0, width2 - iM473a3, height, 36);
            AbstractC0041i.f442b.m782a(graphics, C0005e.f76a.m112c(), i6, i7, 3);
            AbstractC0041i.f442b.m782a(graphics, C0005e.f76a.m111b(), i4, i5, 3);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("MenuScreen ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    protected static void m192a(Graphics graphics, short s, int i) {
        Image imageM638a = C0050b.m638a(s);
        int iM477b = RunnableC0037e.m477b(imageM638a);
        int iM477b2 = RunnableC0037e.m477b(imageM638a);
        int width = (RunnableC0037e.f360a.getWidth() / iM477b) + 1;
        int height = (RunnableC0037e.f360a.getHeight() / iM477b2) + 1;
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= width) {
                return;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < height) {
                    RunnableC0037e.m468a(graphics, imageM638a, iM477b * i, 0, iM477b, iM477b2, 0, b2 * iM477b, b4 * iM477b2, 0);
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m193a(Graphics graphics, short s, short s2, boolean z, boolean z2) {
        if (z2) {
            RunnableC0037e.m468a(graphics, C0050b.m638a(f147o), 0, 0, RunnableC0037e.m476a(C0050b.m638a(f147o)), RunnableC0037e.m477b(C0050b.m638a(f147o)), 0, s + 30, s2 + 2 + (RunnableC0037e.m477b(C0050b.m638a(f147o)) / 2), 3);
        } else if (z) {
            RunnableC0037e.m468a(graphics, C0050b.m638a(f146n), 0, 0, RunnableC0037e.m476a(C0050b.m638a(f146n)), RunnableC0037e.m477b(C0050b.m638a(f146n)), 0, s + 30, s2 + 2 + (RunnableC0037e.m477b(C0050b.m638a(f147o)) / 2), 3);
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m194a(Graphics graphics, short s, String[] strArr, byte b, C0069d c0069d) {
        if (b < this.f168a) {
            this.f168a = b;
        } else {
            int height = RunnableC0037e.f360a.getHeight();
            int i = s + ((b - this.f168a) * (c0069d.f634a + 3)) + c0069d.f634a;
            if (i > height - C0025r.m274a()) {
                this.f168a += ((i - (height - C0025r.m274a())) / (c0069d.f634a + 3)) + 1;
            }
        }
        if (graphics == null || strArr == null || strArr.length == 0 || c0069d == null) {
            return;
        }
        int width = RunnableC0037e.f360a.getWidth();
        int i2 = this.f168a;
        while (true) {
            byte b2 = (byte) i2;
            if (b2 >= strArr.length) {
                return;
            }
            int iM781a = c0069d.m781a(strArr[b2]);
            if (b2 == b) {
                int iM473a = RunnableC0037e.m473a(f163B) / 5;
                int iM474b = RunnableC0037e.m474b(f163B);
                int iM473a2 = RunnableC0037e.m473a(f165D) / 5;
                int iM474b2 = RunnableC0037e.m474b(f165D);
                int i3 = width < 176 ? 5 : 15;
                int i4 = (iM474b - c0069d.f634a) / 2;
                if (width - (i3 << 1) < iM781a + ((iM473a + iM473a2) / 2)) {
                    i3 = ((width - iM781a) - ((iM473a + iM473a2) / 2)) / 2;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                RunnableC0037e.m470a(graphics, f163B, iM473a * ((AbstractC0041i) this).f467e, 0, iM473a, iM474b, 0, i3, s - i4, 0);
                RunnableC0037e.m471a(graphics, f164C, 5, ((AbstractC0041i) this).f467e, i3 + iM473a, s - i4, (width - i3) - iM473a2, true, 0);
                RunnableC0037e.m470a(graphics, f165D, iM473a2 * ((AbstractC0041i) this).f467e, 0, iM473a2, iM474b2, 0, (width - i3) - iM473a2, s - i4, 0);
            }
            c0069d.m782a(graphics, strArr[b2], (RunnableC0037e.f360a.getWidth() - iM781a) / 2, s, 0);
            s = (short) (s + c0069d.f634a + 3);
            i2 = b2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    protected static int m195a(C0069d c0069d) {
        return c0069d.f634a + 3;
    }

    /* JADX INFO: renamed from: a */
    protected final byte m196a(C0069d c0069d, int i, int i2, int i3) {
        if (i >= 1 && i3 <= i3 + ((i - this.f168a) * (c0069d.f634a + 3))) {
            return (byte) (this.f168a + ((i3 - i2) / (c0069d.f634a + 3)));
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0003c[] m197a(AbstractC0003c[] abstractC0003cArr) {
        if (abstractC0003cArr == null || abstractC0003cArr.length == 0) {
            return null;
        }
        short s = 0;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= abstractC0003cArr.length) {
                break;
            }
            if (abstractC0003cArr[s3] != null && abstractC0003cArr[s3].mo24c() != 0) {
                s = (short) (s + 1);
            }
            s2 = (short) (s3 + 1);
        }
        if (s == 0) {
            return null;
        }
        if (s == abstractC0003cArr.length) {
            return abstractC0003cArr;
        }
        AbstractC0003c[] abstractC0003cArr2 = new AbstractC0003c[s];
        short s4 = 0;
        short s5 = 0;
        while (true) {
            short s6 = s5;
            if (s6 >= abstractC0003cArr.length) {
                return abstractC0003cArr2;
            }
            if (abstractC0003cArr[s6] != null && abstractC0003cArr[s6].mo24c() != 0) {
                abstractC0003cArr2[s4] = abstractC0003cArr[s6];
                s4 = (short) (s4 + 1);
            }
            s5 = (short) (s6 + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m198b(String str) {
        this.f166a = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m199c(String str) {
        this.f167b = str;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public String mo200a() {
        return this.f167b;
    }

    /* JADX INFO: renamed from: a */
    protected final byte m201a(boolean z) {
        return z ? (byte) ((((((RunnableC0037e.f360a.getHeight() - m190a()) - 10) - RunnableC0037e.m477b(C0050b.m638a(f142d))) - RunnableC0037e.m477b(C0050b.m638a(f143e))) - C0025r.m274a()) / 35) : (byte) ((RunnableC0037e.f360a.getWidth() - 16) / 41);
    }
}
