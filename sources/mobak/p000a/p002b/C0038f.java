package mobak.p000a.p002b;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.C0050b;
import mobak.C0077g;
import mobak.p004b.C0063c;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.f */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/f.class */
public class C0038f {

    /* JADX INFO: renamed from: a */
    private static short f412a = -1;

    /* JADX INFO: renamed from: b */
    private static short f413b = -1;

    /* JADX INFO: renamed from: c */
    private static short f414c = -1;

    /* JADX INFO: renamed from: d */
    private static short f415d = -1;

    /* JADX INFO: renamed from: e */
    private static short f416e = -1;

    /* JADX INFO: renamed from: b */
    private byte f418b;

    /* JADX INFO: renamed from: c */
    private byte f419c;

    /* JADX INFO: renamed from: a */
    private int f420a;

    /* JADX INFO: renamed from: f */
    private byte f423f;

    /* JADX INFO: renamed from: a */
    private int[] f424a;

    /* JADX INFO: renamed from: a */
    private String f425a;

    /* JADX INFO: renamed from: g */
    private byte f426g;

    /* JADX INFO: renamed from: a */
    private byte f417a = -1;

    /* JADX INFO: renamed from: e */
    private byte f422e = -1;

    /* JADX INFO: renamed from: d */
    private byte f421d = -1;

    /* JADX INFO: renamed from: a */
    public static Image m488a(byte b) {
        return b < 12 ? C0050b.m638a(C0050b.m633a("herouse1.png")) : C0050b.m638a(C0050b.m633a("herouse2.png"));
    }

    /* JADX INFO: renamed from: a */
    public static void m489a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        if (f412a == -1) {
            f412a = C0050b.m633a("name_label_left.png");
        }
        if (f413b == -1) {
            f413b = C0050b.m633a("name_label_middle.png");
        }
        if (f414c == -1) {
            f414c = C0050b.m633a("name_label_right.png");
        }
        int iM473a = RunnableC0037e.m473a(f412a) / 6;
        int iM474b = RunnableC0037e.m474b(f412a);
        int iM474b2 = RunnableC0037e.m474b(f413b);
        int iM473a2 = RunnableC0037e.m473a(f414c) / 6;
        int iM474b3 = RunnableC0037e.m474b(f414c);
        RunnableC0037e.m470a(graphics, f412a, i * iM473a, 0, iM473a, iM474b, 0, i2 - iM473a, i3 - ((iM474b2 - i5) / 2), 20);
        RunnableC0037e.m471a(graphics, f413b, 6, i, i2, i3 - ((iM474b2 - i5) / 2), i2 + i4, true, 16);
        RunnableC0037e.m470a(graphics, f414c, i * iM473a2, 0, iM473a2, iM474b3, 0, i2 + i4, i3 - ((iM474b3 - i5) / 2), 20);
    }

    /* JADX INFO: renamed from: a */
    public final void m490a(int i) {
        this.f420a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m491a(int[] iArr) {
        this.f424a = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m492a(String str) {
        this.f425a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m493a(byte b) {
        this.f419c = b;
    }

    /* JADX INFO: renamed from: a */
    public void mo494a(byte b, byte b2, boolean z) {
        m495b(b, b2, z);
    }

    /* JADX INFO: renamed from: b */
    protected final void m495b(byte b, byte b2, boolean z) {
        if (b == this.f421d && this.f422e == b2) {
            return;
        }
        if (this.f421d >= 0 && this.f422e >= 0) {
            C0050b.m628a(this);
        }
        this.f421d = b;
        this.f422e = b2;
        if (m497a()) {
            C0050b.m641a(this, z);
            if (m513c()) {
                return;
            }
            C0050b.m629b(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int[] m496a() {
        return this.f424a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m497a() {
        return ((byte) (this.f426g & (-128))) != -128;
    }

    /* JADX INFO: renamed from: a */
    public void mo498a(Graphics graphics) {
        Image imageM638a;
        if (graphics == null) {
            return;
        }
        try {
            if (m497a()) {
                short sM374a = C0034b.m374a((int) this.f421d);
                short sM375b = (short) (C0034b.m375b((int) this.f422e) + 25);
                if (sM374a < 0 || sM375b < 0 || sM374a > RunnableC0037e.f360a.getWidth() || sM375b > RunnableC0037e.f360a.getHeight()) {
                    return;
                }
                switch (this.f419c) {
                    case 1:
                        imageM638a = m488a(this.f423f);
                        break;
                    case 2:
                        imageM638a = C0050b.m638a(C0050b.m633a(new StringBuffer().append((int) ((byte) (this.f423f + 1))).append("castle.png").toString()));
                        break;
                    case 3:
                        byte b = this.f423f;
                        if (b == 0) {
                            imageM638a = C0050b.m638a(C0050b.m633a("sunduk_open.png"));
                        } else if (b == 1) {
                            imageM638a = C0050b.m638a(C0050b.m633a("sunduk.png"));
                        } else if (b != 2) {
                            imageM638a = b != 3 ? null : C0050b.m638a(C0050b.m633a("meshok_c.png"));
                        } else {
                            imageM638a = C0050b.m638a(C0050b.m633a("meshok_o.png"));
                        }
                        break;
                    case 4:
                        if (f415d == -1) {
                            f415d = C0050b.m633a("generators.png");
                        }
                        imageM638a = C0050b.m638a(f415d);
                        break;
                    case 5:
                        if (f416e == -1) {
                            f416e = C0050b.m633a("teleport.png");
                        }
                        imageM638a = C0050b.m638a(f416e);
                        break;
                    default:
                        imageM638a = null;
                        break;
                }
                Image image = imageM638a;
                if (imageM638a != null) {
                    if (this.f419c != 1) {
                        if (this.f418b <= 0) {
                            RunnableC0037e.m466a(graphics, image, sM374a, sM375b - RunnableC0037e.m477b(image), 0);
                            return;
                        }
                        byte bM476a = (byte) (RunnableC0037e.m476a(image) / this.f418b);
                        if (this.f417a < 0) {
                            RunnableC0037e.m468a(graphics, image, bM476a * this.f423f, 0, bM476a, RunnableC0037e.m477b(image), 0, sM374a, sM375b - RunnableC0037e.m477b(image), 0);
                            return;
                        }
                        if (this.f417a >= this.f418b) {
                            this.f417a = (byte) 0;
                        }
                        RunnableC0037e.m468a(graphics, image, bM476a * this.f417a, 0, bM476a, RunnableC0037e.m477b(image), 0, sM374a, sM375b - RunnableC0037e.m477b(image), 0);
                        this.f417a = (byte) (this.f417a + 1);
                        return;
                    }
                    int i = 12;
                    byte b2 = this.f423f;
                    byte b3 = b2;
                    if (b2 >= 12) {
                        b3 = (byte) (b3 - 12);
                        i = 9;
                    }
                    short sM476a = (short) (RunnableC0037e.m476a(image) / i);
                    short sM477b = (short) RunnableC0037e.m477b(image);
                    RunnableC0037e.m468a(graphics, image, sM476a * b3, 0, sM476a, sM477b, 0, sM374a, sM375b - RunnableC0037e.m477b(image), 0);
                    if (this.f426g == 7) {
                        AbstractC0041i.m537a(graphics, (byte) 14, (short) (sM374a + 5), (short) ((sM375b + 5) - sM477b), 0);
                    }
                }
            }
        } catch (Exception e) {
            C0063c.m745a((Exception) graphics);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m499b(Graphics graphics) {
        if (m497a() && this.f425a != null && this.f425a.length() > 0) {
            RunnableC0037e.m478a(graphics, 0);
            short sM374a = C0034b.m374a((int) this.f421d);
            int iM375b = C0034b.m375b((int) this.f422e) + 25 + 2;
            m489a(graphics, this.f419c == 2 ? this.f423f + 1 : 5, sM374a, iM375b, AbstractC0041i.f441a.m781a(this.f425a), AbstractC0041i.f441a.f634a);
            AbstractC0041i.f441a.m782a(graphics, this.f425a, sM374a, iM375b, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m500a() {
        return this.f420a;
    }

    /* JADX INFO: renamed from: a */
    public final byte m501a() {
        return this.f421d;
    }

    /* JADX INFO: renamed from: b */
    public final byte m502b() {
        return this.f422e;
    }

    /* JADX INFO: renamed from: c */
    public final byte m503c() {
        return this.f419c;
    }

    /* JADX INFO: renamed from: a */
    public final String m504a() {
        return this.f425a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("map object\n");
        stringBuffer.append("name: [").append(this.f425a).append("]\n");
        stringBuffer.append("type: [").append((int) this.f419c).append("]\n");
        if (this.f424a != null && this.f424a.length > 0) {
            stringBuffer.append("actions: ");
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= this.f424a.length) {
                    break;
                }
                stringBuffer.append(this.f424a[b2]).append(" ");
                b = (byte) (b2 + 1);
            }
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    public final byte m505d() {
        return this.f423f;
    }

    /* JADX INFO: renamed from: b */
    public final void m506b(byte b) {
        this.f423f = b;
        C0050b.m628a(this);
        if (!m513c()) {
            C0050b.m629b(this);
        }
        switch (this.f419c) {
            case 1:
                this.f417a = (byte) -1;
                this.f418b = (byte) 21;
                break;
            case 2:
                this.f417a = (byte) 0;
                if (this.f423f != 0) {
                    this.f418b = (byte) 3;
                } else {
                    this.f418b = (byte) 6;
                }
                break;
            case 3:
                this.f417a = (byte) 0;
                if (this.f423f != 1) {
                    this.f418b = (byte) 0;
                } else {
                    this.f418b = (byte) 4;
                }
                break;
            case 4:
                this.f417a = (byte) -1;
                this.f418b = (byte) 5;
                break;
            case 5:
                this.f417a = (byte) 0;
                this.f418b = (byte) 6;
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final byte m507e() {
        return this.f426g;
    }

    /* JADX INFO: renamed from: c */
    public final void m508c(byte b) {
        boolean zM497a = m497a();
        this.f426g = b;
        if (zM497a && !m497a()) {
            C0050b.m628a(this);
        } else {
            if (zM497a || !m497a()) {
                return;
            }
            C0050b.m641a(this, false);
            C0050b.m629b(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m509a() {
        this.f426g = (byte) (this.f426g & (-128));
    }

    /* JADX INFO: renamed from: b */
    public final void m510b() {
        this.f426g = (byte) (this.f426g & 127);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m511b() {
        return this.f419c == 2 || this.f419c == 4 || this.f419c == 5 || this.f419c == 3;
    }

    /* JADX INFO: renamed from: c */
    public final void m512c() {
        String strM773a = null;
        String strM773a2 = null;
        switch (this.f419c) {
            case 2:
                strM773a = new StringBuffer().append(C0066a.m773a(194)).append(C0066a.m779c(this.f423f + 1)).toString();
                strM773a2 = C0066a.m773a(195);
                break;
            case 3:
                if (this.f423f <= 1) {
                    strM773a = C0066a.m773a(97);
                    strM773a2 = C0066a.m773a(198);
                } else {
                    strM773a = C0066a.m773a(96);
                    strM773a2 = C0066a.m773a(199);
                }
                break;
            case 4:
                strM773a = new StringBuffer().append(C0066a.m773a(196)).append(C0066a.m779c(this.f423f + 1)).toString();
                strM773a2 = C0066a.m773a(197);
                break;
            case 5:
                strM773a = C0066a.m773a(200);
                strM773a2 = C0066a.m773a(201);
                break;
        }
        RunnableC0037e.m427a(strM773a, strM773a2);
    }

    /* JADX INFO: renamed from: c */
    private boolean m513c() {
        C0077g c0077gM636a = C0050b.m636a(this.f419c);
        if (c0077gM636a.f649a == null) {
            return false;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= c0077gM636a.f649a.length) {
                return false;
            }
            if (c0077gM636a.f649a[b2] == this.f423f) {
                return true;
            }
            b = (byte) (b2 + 1);
        }
    }
}
