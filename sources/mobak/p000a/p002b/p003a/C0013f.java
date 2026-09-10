package mobak.p000a.p002b.p003a;

import java.util.Random;
import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.C0075e;
import mobak.Main2;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0038f;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;
import mobak.p006c.C0069d;

/* JADX INFO: renamed from: mobak.a.b.a.f */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/f.class */
public final class C0013f extends AbstractC0012e {

    /* JADX INFO: renamed from: a */
    private static final String[] f171a = {C0066a.m773a(288), C0066a.m773a(2), C0066a.m773a(3), C0066a.m773a(204), C0066a.m773a(1)};

    /* JADX INFO: renamed from: b */
    private static final String[] f172b = {C0066a.m773a(2), C0066a.m773a(3), C0066a.m773a(204), C0066a.m773a(1)};

    /* JADX INFO: renamed from: a */
    private static final int[] f173a = {1114163, 9359084, 10053120, 16764006, 16777215, 6723891, 26112, 6699291};

    /* JADX INFO: renamed from: d */
    private static String f174d = "locationAncer";

    /* JADX INFO: renamed from: a */
    protected byte f175a;

    /* JADX INFO: renamed from: a */
    String[][] f177a;

    /* JADX INFO: renamed from: a */
    short[] f178a;

    /* JADX INFO: renamed from: i */
    private C0069d f179i;

    /* JADX INFO: renamed from: b */
    private short[] f182b;

    /* JADX INFO: renamed from: b */
    private boolean f176b = false;

    /* JADX INFO: renamed from: b */
    protected byte f180b = -1;

    /* JADX INFO: renamed from: c */
    protected byte f181c = -1;

    /* JADX INFO: renamed from: f */
    private byte f183f = 0;

    /* JADX INFO: renamed from: g */
    private byte f184g = 0;

    /* JADX INFO: renamed from: c */
    private boolean f185c = false;

    /* JADX INFO: renamed from: d */
    private boolean f186d = false;

    /* JADX INFO: renamed from: e */
    private boolean f187e = false;

    /* JADX INFO: renamed from: f */
    private boolean f188f = false;

    public C0013f(short s) {
        ((AbstractC0012e) this).f167b = AbstractC0041i.f449c;
        this.f463k = s;
        this.f179i = AbstractC0041i.f446f;
        ((AbstractC0041i) this).f467e = (byte) (Math.abs(new Random().nextInt()) % 5);
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final void mo202a(int i) {
        int gameAction = RunnableC0037e.f360a.getGameAction(i);
        if (this.f175a != 5) {
            if (gameAction == 6) {
                if (this.f181c < this.f177a[this.f180b].length - 1) {
                    this.f181c = (byte) (this.f181c + 1);
                } else {
                    this.f181c = (byte) 0;
                }
            } else if (gameAction == 1) {
                if (this.f181c > 0) {
                    this.f181c = (byte) (this.f181c - 1);
                } else {
                    this.f181c = (byte) (this.f177a[this.f180b].length - 1);
                }
            }
            if (gameAction == 8) {
                try {
                    mo207a_();
                    return;
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("").append(e).toString());
                    return;
                }
            }
            return;
        }
        synchronized (f174d) {
            try {
                if (gameAction == 6) {
                    if (this.f188f) {
                        this.f184g = (byte) (this.f184g + 1);
                    }
                    return;
                }
                if (gameAction == 1) {
                    if (this.f187e) {
                        this.f184g = (byte) (this.f184g - 1);
                    }
                } else if (gameAction == 2) {
                    if (this.f185c) {
                        this.f183f = (byte) (this.f183f - 1);
                    }
                } else if (gameAction == 5) {
                    if (this.f186d) {
                        this.f183f = (byte) (this.f183f + 1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private short m203b() {
        switch (this.f175a) {
            case 1:
            case 4:
                return (short) ((RunnableC0037e.f360a.getHeight() - (m204b().length * AbstractC0012e.m195a(this.f179i))) / 2);
            default:
                return m190a();
        }
    }

    /* JADX INFO: renamed from: b */
    private String[] m204b() {
        return this.f177a[this.f180b];
    }

    /* JADX INFO: renamed from: a */
    public static String[] m205a() {
        String strM794a = Main2.f0a.f6a.m794a((byte) 17, (String) null);
        String strM794a2 = Main2.f0a.f6a.m794a((byte) 2, (String) null);
        return ((strM794a == null || strM794a.equals("")) && (strM794a2 == null || strM794a2.equals(""))) ? f171a : f172b;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x045c A[Catch: Exception -> 0x04af, TryCatch #1 {Exception -> 0x04af, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0010, B:8:0x0023, B:9:0x0027, B:10:0x0048, B:12:0x004f, B:14:0x0056, B:16:0x005d, B:18:0x0069, B:116:0x0455, B:118:0x045c, B:119:0x0464, B:121:0x046c, B:19:0x0086, B:24:0x00cd, B:25:0x0114, B:26:0x0115, B:31:0x0126, B:33:0x0157, B:34:0x015c, B:36:0x016d, B:37:0x0172, B:39:0x017b, B:40:0x0180, B:42:0x0191, B:43:0x0196, B:46:0x01ba, B:54:0x01e8, B:55:0x0202, B:56:0x020c, B:58:0x0212, B:59:0x025c, B:62:0x0265, B:64:0x026d, B:66:0x0278, B:68:0x0280, B:70:0x02a7, B:72:0x02b2, B:74:0x02bd, B:75:0x02ec, B:77:0x02f5, B:80:0x0307, B:82:0x0310, B:84:0x031f, B:83:0x0319, B:79:0x02fe, B:85:0x033e, B:86:0x0348, B:88:0x035b, B:89:0x0374, B:91:0x037b, B:92:0x039a, B:94:0x03a1, B:95:0x03cf, B:97:0x03d6, B:99:0x040d, B:103:0x0414, B:105:0x0416, B:107:0x041a, B:109:0x0421, B:111:0x0428, B:113:0x042f, B:115:0x043b, B:7:0x0018), top: B:128:0x0000, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x046c A[Catch: Exception -> 0x04af, TryCatch #1 {Exception -> 0x04af, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0010, B:8:0x0023, B:9:0x0027, B:10:0x0048, B:12:0x004f, B:14:0x0056, B:16:0x005d, B:18:0x0069, B:116:0x0455, B:118:0x045c, B:119:0x0464, B:121:0x046c, B:19:0x0086, B:24:0x00cd, B:25:0x0114, B:26:0x0115, B:31:0x0126, B:33:0x0157, B:34:0x015c, B:36:0x016d, B:37:0x0172, B:39:0x017b, B:40:0x0180, B:42:0x0191, B:43:0x0196, B:46:0x01ba, B:54:0x01e8, B:55:0x0202, B:56:0x020c, B:58:0x0212, B:59:0x025c, B:62:0x0265, B:64:0x026d, B:66:0x0278, B:68:0x0280, B:70:0x02a7, B:72:0x02b2, B:74:0x02bd, B:75:0x02ec, B:77:0x02f5, B:80:0x0307, B:82:0x0310, B:84:0x031f, B:83:0x0319, B:79:0x02fe, B:85:0x033e, B:86:0x0348, B:88:0x035b, B:89:0x0374, B:91:0x037b, B:92:0x039a, B:94:0x03a1, B:95:0x03cf, B:97:0x03d6, B:99:0x040d, B:103:0x0414, B:105:0x0416, B:107:0x041a, B:109:0x0421, B:111:0x0428, B:113:0x042f, B:115:0x043b, B:7:0x0018), top: B:128:0x0000, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        try {
            if (this.f175a == 1 || this.f175a == 4) {
                AbstractC0012e.m192a(graphics, AbstractC0012e.f149i, (int) ((AbstractC0041i) this).f467e);
            } else {
                super.mo169a(graphics);
            }
            switch (this.f175a) {
                case 1:
                case 4:
                    if (this.f177a != null && this.f180b >= 0 && this.f181c >= 0 && this.f177a.length > this.f180b) {
                        m194a(graphics, m203b(), this.f177a[this.f180b], this.f181c, this.f179i);
                    }
                    if (((AbstractC0041i) this).f456a != null) {
                        ((AbstractC0041i) this).f456a.m291a(graphics);
                    }
                    if (this.f175a == 1) {
                        AbstractC0041i.f442b.m782a(graphics, C0066a.m773a(171), 2, 0, 0);
                        AbstractC0041i.f442b.m782a(graphics, ":", AbstractC0041i.f442b.m781a(C0066a.m773a(171)) + 2, 0, 0);
                        AbstractC0041i.f442b.m782a(graphics, "1.19.0", AbstractC0041i.f442b.m781a(C0066a.m773a(171)) + 5, 0, 0);
                        return;
                    }
                    return;
                case 2:
                case 3:
                default:
                    if (this.f177a != null && this.f180b >= 0 && this.f181c >= 0 && this.f177a.length > this.f180b) {
                        m194a(graphics, m203b(), this.f177a[this.f180b], this.f181c, this.f179i);
                    }
                    if (((AbstractC0041i) this).f456a != null) {
                        ((AbstractC0041i) this).f456a.m291a(graphics);
                    }
                    if (this.f175a == 1) {
                        AbstractC0041i.f442b.m782a(graphics, C0066a.m773a(171), 2, 0, 0);
                        AbstractC0041i.f442b.m782a(graphics, ":", AbstractC0041i.f442b.m781a(C0066a.m773a(171)) + 2, 0, 0);
                        AbstractC0041i.f442b.m782a(graphics, "1.19.0", AbstractC0041i.f442b.m781a(C0066a.m773a(171)) + 5, 0, 0);
                        return;
                    }
                    return;
                case 5:
                    int iM190a = m190a() + 5;
                    int iM274a = C0025r.m274a() + 5;
                    int width = RunnableC0037e.f360a.getWidth() - 20;
                    int height = (RunnableC0037e.f360a.getHeight() - iM190a) - iM274a;
                    int iMin = Math.min(width / 50, height / 50);
                    int i = iMin;
                    if (iMin < 1) {
                        i = 1;
                    }
                    if (graphics != null) {
                        m190a();
                        short sM480b = (short) RunnableC0037e.m480b(graphics);
                        short sM481c = (short) RunnableC0037e.m481c(graphics);
                        short sM482d = (short) RunnableC0037e.m482d(graphics);
                        short sM483e = (short) RunnableC0037e.m483e(graphics);
                        graphics.setClip(10, iM190a, width, height);
                        this.f186d = false;
                        this.f187e = false;
                        this.f185c = false;
                        this.f188f = false;
                        synchronized (f174d) {
                            if (C0050b.m621a()) {
                                for (short s = 0; s < 2500; s = (short) (s + 1)) {
                                    short sM209a = m209a((byte) (s % 50), i);
                                    short sM210a = m210a((byte) (s / 50), i, iM190a, iM274a);
                                    if (sM209a < RunnableC0037e.m480b(graphics)) {
                                        this.f185c = true;
                                    }
                                    if (sM209a + i >= RunnableC0037e.m480b(graphics) + RunnableC0037e.m482d(graphics)) {
                                        this.f186d = true;
                                    }
                                    if (sM210a < RunnableC0037e.m481c(graphics)) {
                                        this.f187e = true;
                                    }
                                    if (sM210a + i >= RunnableC0037e.m481c(graphics) + RunnableC0037e.m483e(graphics)) {
                                        this.f188f = true;
                                    }
                                    byte bM644b = C0050b.m644b(C0050b.m642a(C0050b.m625a((int) s)));
                                    int i2 = f173a[bM644b];
                                    if (C0050b.m643c(C0050b.m625a((int) s))) {
                                        i2 = 16759803;
                                    }
                                    RunnableC0037e.m478a(graphics, i2);
                                    graphics.fillRect(sM209a, sM210a, i, i);
                                    if (!C0050b.m631b(C0050b.m625a((int) s)) && bM644b != 1 && bM644b != 0 && i > 2) {
                                        RunnableC0037e.m478a(graphics, 89478485);
                                        graphics.fillRect(sM209a + 1, sM210a + 1, i - 2, i - 2);
                                    }
                                }
                            }
                            if (C0005e.f76a != null) {
                                RunnableC0037e.m478a(graphics, 16451113);
                                short sM209a2 = m209a(C0005e.f76a.m97a(), i);
                                short sM210a2 = m210a(C0005e.f76a.m98b(), i, iM190a, iM274a);
                                graphics.fillRect(sM209a2, sM210a2, i, i);
                                m208a(C0005e.f76a.m102a(), graphics, sM209a2, (short) (sM210a2 + i), C0005e.f76a.m143e());
                            }
                            if (C0050b.m604a() > 0) {
                                for (short s2 = 0; s2 < C0050b.m604a(); s2 = (short) (s2 + 1)) {
                                    C0038f c0038fM605a = C0050b.m605a((int) s2);
                                    if (c0038fM605a != null && c0038fM605a.m497a()) {
                                        short sM209a3 = m209a(c0038fM605a.m501a(), i);
                                        short sM210a3 = m210a(c0038fM605a.m502b(), i, iM190a, iM274a);
                                        int iM505d = c0038fM605a.m503c() == 2 ? c0038fM605a.m505d() + 1 : 5;
                                        if (c0038fM605a.m503c() == 2) {
                                            RunnableC0037e.m478a(graphics, 1774063);
                                            graphics.fillRect(sM209a3, sM210a3 - i, i << 1, i << 1);
                                            m208a(c0038fM605a.m504a(), graphics, sM209a3, (short) (sM210a3 + i), iM505d);
                                        } else {
                                            if (c0038fM605a.m503c() == 4 || c0038fM605a.m503c() == 5) {
                                                RunnableC0037e.m478a(graphics, 6678684);
                                            } else if (c0038fM605a.m503c() == 1) {
                                                RunnableC0037e.m478a(graphics, 16451113);
                                            } else {
                                                RunnableC0037e.m478a(graphics, 9636760);
                                            }
                                            graphics.fillRect(sM209a3, sM210a3, i, i);
                                            m208a(c0038fM605a.m504a(), graphics, sM209a3, (short) (sM210a3 + i), iM505d);
                                        }
                                    }
                                }
                            }
                            graphics.setClip(sM480b, sM481c, sM482d, sM483e);
                            if (this.f187e) {
                                RunnableC0037e.m466a(graphics, C0050b.m638a(AbstractC0012e.f142d), RunnableC0037e.f360a.getWidth() / 2, m190a() + 2, 3);
                            }
                            if (this.f188f) {
                                RunnableC0037e.m466a(graphics, C0050b.m638a(AbstractC0012e.f143e), RunnableC0037e.f360a.getWidth() / 2, (RunnableC0037e.f360a.getHeight() - C0025r.m274a()) - 3, 3);
                            }
                            if (this.f185c) {
                                RunnableC0037e.m466a(graphics, C0050b.m638a(AbstractC0012e.f144f), 8, RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f148h)) + 8 + ((((RunnableC0037e.f360a.getHeight() - m190a()) - 32) - C0025r.m274a()) / 2), 3);
                            }
                            if (this.f186d) {
                                RunnableC0037e.m466a(graphics, C0050b.m638a(AbstractC0012e.f145g), RunnableC0037e.f360a.getWidth() - 8, RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f148h)) + 8 + ((((RunnableC0037e.f360a.getHeight() - m190a()) - 32) - C0025r.m274a()) / 2), 3);
                            }
                            break;
                        }
                    }
                    if (((AbstractC0041i) this).f456a != null) {
                        ((AbstractC0041i) this).f456a.m291a(graphics);
                    }
                    if (this.f175a == 1) {
                        AbstractC0041i.f442b.m782a(graphics, C0066a.m773a(171), 2, 0, 0);
                        AbstractC0041i.f442b.m782a(graphics, ":", AbstractC0041i.f442b.m781a(C0066a.m773a(171)) + 2, 0, 0);
                        AbstractC0041i.f442b.m782a(graphics, "1.19.0", AbstractC0041i.f442b.m781a(C0066a.m773a(171)) + 5, 0, 0);
                        return;
                    }
                    return;
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("CityMenu ").append(e.getMessage()).toString());
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case 55:
                switch (this.f175a) {
                    case 2:
                        if (!C0005e.f76a.m93a()) {
                            RunnableC0037e.m427a(new StringBuffer().append(C0066a.m773a(164)).append("!").toString(), C0066a.m773a(165));
                            return true;
                        }
                        if (!C0050b.m621a()) {
                            RunnableC0037e.m427a(C0066a.m773a(36), C0066a.m773a(37));
                            return true;
                        }
                        try {
                            C0063c.f597a.m749a(new C0058g(C0059h.f576a[28], (short) 0, (short) 0));
                            return true;
                        } catch (Exception e) {
                            C0063c.m746a(new StringBuffer().append("executePopupMenuAction").append(e.toString()).toString());
                            return true;
                        }
                    case 3:
                        C0063c.f597a.m749a(new C0058g(C0059h.f576a[15], (short) 0, (short) 0));
                        RunnableC0037e.f360a.m441a((byte) 2);
                        RunnableC0037e.f360a.f386a.m363a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), true);
                        RunnableC0037e.f360a.f386a.m385b();
                        return true;
                    default:
                        RunnableC0037e.f360a.m441a((byte) 2);
                        RunnableC0037e.f360a.f386a.m363a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), true);
                        return true;
                }
            default:
                return super.mo170a(c0023p);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo206a() {
        return !((AbstractC0041i) this).f456a.m297a();
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a_ */
    public final void mo207a_() {
        switch (this.f175a) {
            case 1:
                if (this.f176b) {
                    switch (this.f181c) {
                        case 0:
                            RunnableC0037e.f360a.m442e();
                            break;
                        case 1:
                            C0063c.f597a.m749a(new C0058g(C0059h.f576a[24], (short) 0, (short) 0));
                            Main2.f0a.m4a(true);
                            break;
                    }
                } else {
                    int i = this.f181c;
                    if (this.f177a[0] == f172b) {
                        i++;
                    }
                    switch (i) {
                        case 0:
                            Main2.f0a.m1b((byte) 7);
                            this.f175a = (byte) 1;
                            this.f181c = (byte) 0;
                            break;
                        case 1:
                            Main2 main2 = Main2.f0a;
                            if (C0063c.f597a == null) {
                                new C0063c();
                            }
                            C0063c.f597a.m747a(String.valueOf(main2.f11a), main2.f10b);
                            if (Main2.m8a(C0005e.f76a.f85b) == null) {
                                RunnableC0037e.m431a(C0066a.m773a(29), C0066a.m773a(170), "", new C0075e(main2));
                            } else if (main2.f7a == null || !main2.f7a.f640a) {
                                main2.m0a((byte) 1);
                            } else {
                                main2.f7a.f639a = (byte) 1;
                            }
                            this.f175a = (byte) 1;
                            this.f181c = (byte) 0;
                            break;
                        case 2:
                            this.f177a = new String[][]{new String[]{C0066a.m773a(6), C0066a.m773a(5), C0066a.m773a(121), C0066a.m773a(138), C0066a.m773a(34)}};
                            this.f175a = (byte) 4;
                            this.f181c = (byte) 0;
                            break;
                        case 3:
                            Main2.m5a(Main2.f0a.m7b());
                            break;
                        case 4:
                            Main2.f0a.m4a(true);
                            break;
                    }
                }
                break;
            case 2:
                if (this.f181c < this.f177a[0].length - 1) {
                    C0058g c0058g = new C0058g(C0059h.f576a[8], (short) 8, C0059h.f576a[7]);
                    c0058g.m670a((int) this.f178a[this.f181c]);
                    c0058g.m670a(C0005e.f76a.f84a);
                    C0063c.f597a.m749a(c0058g);
                } else if (!C0005e.f76a.m93a()) {
                    RunnableC0037e.m427a(new StringBuffer().append(C0066a.m773a(164)).append("!").toString(), C0066a.m773a(165));
                } else if (!C0050b.m621a()) {
                    RunnableC0037e.m427a(C0066a.m773a(36), C0066a.m773a(37));
                } else {
                    try {
                        C0038f c0038f = new C0038f();
                        c0038f.m510b();
                        c0038f.m493a((byte) 4);
                        c0038f.mo494a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), true);
                        C0050b.m627a(c0038f.m501a(), c0038f.m502b());
                        C0005e.f76a.m96a(c0038f.m501a(), c0038f.m502b());
                        C0063c.f597a.m749a(new C0058g(C0059h.f576a[28], (short) 0, (short) 0));
                    } catch (Exception e) {
                        C0063c.m746a(new StringBuffer().append("cityentry").append(e.toString()).toString());
                    }
                    RunnableC0037e.f360a.m441a((byte) 2);
                    RunnableC0037e.f360a.f386a.m363a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), true);
                    RunnableC0037e.f360a.f386a.m385b();
                }
                break;
            case 3:
                if (this.f180b != 0) {
                    if (this.f181c == this.f177a[1].length - 1) {
                        this.f180b = (byte) 0;
                    } else if (C0005e.f76a.m107a(((AbstractC0012e) this).f170a) >= this.f182b[this.f181c]) {
                        RunnableC0037e.m431a(C0066a.m773a(135), C0066a.m774a(206, new String[]{this.f177a[1][this.f181c], String.valueOf((int) this.f182b[this.f181c])}), new StringBuffer().append(C0066a.m773a(41)).append("?").toString(), new C0008a(this));
                    } else if (!((AbstractC0012e) this).f170a) {
                        RunnableC0037e.m427a(C0066a.m773a(135), C0066a.m773a(205));
                    } else {
                        Main2.m11a();
                    }
                } else if (this.f181c != this.f177a[0].length - 1) {
                    this.f180b = (byte) 1;
                } else {
                    C0063c.f597a.m749a(new C0058g(C0059h.f576a[30], (short) 0, C0059h.f576a[10]));
                }
                break;
            case 4:
                switch (this.f181c) {
                    case 0:
                        Main2.f0a.m1b((byte) 3);
                        break;
                    case 1:
                        Main2.f0a.m1b((byte) 4);
                        break;
                    case 2:
                        Main2.f0a.f6a.m798a();
                        break;
                    case 3:
                        RunnableC0037e.f360a.m450g();
                        RunnableC0037e.m427a(C0066a.m773a(139), new StringBuffer().append(C0066a.m773a(140)).append(C0066a.m773a(141)).toString());
                        break;
                    case 4:
                        this.f177a = new String[][]{m205a()};
                        this.f175a = (byte) 1;
                        this.f181c = (byte) 0;
                        break;
                }
                break;
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f175a) {
            case 1:
                stringBuffer.append("screen: MainMenu\n");
                break;
            case 2:
                stringBuffer.append("screen: City\n");
                stringBuffer.append("name: ").append(((AbstractC0012e) this).f166a).append("\n");
                break;
            case 3:
                stringBuffer.append("screen: Teleport\n");
                break;
            case 5:
                stringBuffer.append("screen: LocationMap\n");
                break;
        }
        if (RunnableC0037e.f360a.m423a() == this) {
            stringBuffer.append("state: active");
        } else {
            stringBuffer.append("status: passive");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m208a(String str, Graphics graphics, short s, short s2, int i) {
        if (str == null || str.length() <= 0) {
            return;
        }
        RunnableC0037e.m478a(graphics, 0);
        C0038f.m489a(graphics, i, s, s2, AbstractC0041i.f441a.m781a(str), AbstractC0041i.f441a.f634a);
        AbstractC0041i.f441a.m782a(graphics, str, s, s2, 0);
    }

    /* JADX INFO: renamed from: a */
    private static short m209a(short s, int i) {
        return (short) ((10 + ((RunnableC0037e.f360a.getWidth() - 20) / 2)) - ((25 - s) * i));
    }

    /* JADX INFO: renamed from: a */
    private static short m210a(short s, int i, int i2, int i3) {
        return (short) ((i2 + (((RunnableC0037e.f360a.getHeight() - i2) - i3) / 2)) - ((25 - s) * i));
    }

    /* JADX INFO: renamed from: a */
    public final void m211a(short[] sArr) {
        this.f178a = sArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m212a(byte b) {
        this.f180b = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m213a(String[][] strArr) {
        this.f177a = strArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m214b(short[] sArr) {
        this.f182b = sArr;
    }

    /* JADX INFO: renamed from: d */
    public final void m215d() {
        this.f177a = new String[][]{new String[]{C0066a.m773a(34), C0066a.m773a(1)}, new String[0]};
        this.f176b = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m216b(byte b) {
        this.f181c = (byte) 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m217c(byte b) {
        this.f175a = b;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        byte bM196a = m196a(this.f179i, m204b().length, m203b(), i2);
        if (bM196a < 0 || bM196a >= m204b().length) {
            return false;
        }
        this.f181c = bM196a;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        ?? r0;
        byte bM196a = m196a(this.f179i, m204b().length, m203b(), i2);
        if (bM196a < 0 || bM196a >= m204b().length || (r0 = this.f181c) != bM196a) {
            return false;
        }
        try {
            mo207a_();
            r0 = 1;
            return true;
        } catch (Exception e) {
            C0063c.m746a(r0.getMessage());
            return false;
        }
    }
}
