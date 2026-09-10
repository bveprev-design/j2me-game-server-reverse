package mobak.p000a.p002b.p003a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.Main2;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p006c.C0066a;
import mobak.p006c.C0069d;

/* JADX INFO: renamed from: mobak.a.b.a.r */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/r.class */
public final class C0025r {

    /* JADX INFO: renamed from: a */
    private static int f253a = -6;

    /* JADX INFO: renamed from: b */
    private static int f254b = -7;

    /* JADX INFO: renamed from: a */
    private static final int[] f255a = {-6, 21, -202, 57345};

    /* JADX INFO: renamed from: b */
    private static final int[] f256b = {-7, 22, -203, 57346};

    /* JADX INFO: renamed from: a */
    private static short f257a;

    /* JADX INFO: renamed from: b */
    private static short f258b;

    /* JADX INFO: renamed from: c */
    private static short f259c;

    /* JADX INFO: renamed from: d */
    private static short f260d;

    /* JADX INFO: renamed from: e */
    private static short f261e;

    /* JADX INFO: renamed from: f */
    private static short f262f;

    /* JADX INFO: renamed from: a */
    private Vector f263a;

    /* JADX INFO: renamed from: b */
    private Vector f264b;

    /* JADX INFO: renamed from: a */
    private Vector[] f265a;

    /* JADX INFO: renamed from: a */
    private byte f266a;

    /* JADX INFO: renamed from: b */
    private byte f267b;

    /* JADX INFO: renamed from: c */
    private byte f268c;

    /* JADX INFO: renamed from: a */
    public static short m272a(byte b) {
        switch (b) {
            case -2:
                return (short) 62;
            case -1:
            case 0:
            case 3:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 80:
            case 82:
            case 91:
            case 92:
            default:
                return (short) 0;
            case 1:
                return (short) 69;
            case 2:
                return (short) 70;
            case 4:
                return (short) 71;
            case 5:
                return (short) 47;
            case 8:
                return (short) 94;
            case 47:
                return (short) 203;
            case 48:
                return (short) 175;
            case 49:
                return (short) 207;
            case 50:
                return (short) 1;
            case 51:
                return (short) 72;
            case 52:
                return (short) 73;
            case 53:
                return (short) 74;
            case 54:
                return (short) 76;
            case 55:
                return (short) 1;
            case 56:
                return (short) 106;
            case 57:
                return (short) 77;
            case 58:
                return (short) 63;
            case 59:
                return (short) 79;
            case 60:
                return (short) 81;
            case 61:
                return (short) 82;
            case 62:
                return (short) 83;
            case 63:
                return (short) 39;
            case 64:
                return (short) 85;
            case 65:
                return (short) 86;
            case 66:
                return (short) 71;
            case 67:
                return (short) 54;
            case 68:
                return (short) 87;
            case 69:
                return (short) 88;
            case 70:
                return (short) 64;
            case 71:
                return (short) 84;
            case 72:
                return (short) 65;
            case 73:
                return (short) 89;
            case 74:
                return (short) 90;
            case 75:
                return (short) 74;
            case 76:
                return (short) 100;
            case 77:
                return (short) 130;
            case 78:
                return (short) 131;
            case 79:
                return (short) 68;
            case 81:
                return (short) 7;
            case 83:
                return (short) 92;
            case 84:
                return (short) 8;
            case 85:
                return (short) 93;
            case 86:
                return (short) 91;
            case 87:
                return (short) 95;
            case 88:
                return (short) 52;
            case 89:
                return (short) 98;
            case 90:
                return (short) 53;
            case 93:
                return (short) 68;
            case 94:
                return (short) 38;
            case 95:
                return (short) 118;
            case 96:
                return (short) 106;
            case 97:
                return (short) 81;
            case 98:
                return (short) 77;
            case 99:
                return (short) 74;
            case 100:
                return (short) 172;
            case 101:
                return (short) 179;
            case 102:
                return (short) 181;
            case 103:
                return (short) 275;
            case 104:
                return (short) 274;
        }
    }

    private C0025r(byte b) {
        this.f266a = (byte) 0;
        this.f267b = (byte) -1;
        this.f268c = b;
    }

    public C0025r() {
        this.f266a = (byte) 0;
        this.f267b = (byte) -1;
        this.f263a = new Vector();
        this.f264b = new Vector();
        this.f268c = (byte) 0;
    }

    public C0025r(byte[] bArr, byte[] bArr2, byte[][] bArr3) {
        this.f266a = (byte) 0;
        this.f267b = (byte) -1;
        if (bArr != null) {
            this.f263a = new Vector(bArr.length);
            for (int i = 0; i < bArr.length; i++) {
                m283a(true, bArr[i], m272a(bArr[i]));
            }
        } else {
            this.f263a = new Vector();
        }
        if (bArr2 != null) {
            this.f264b = new Vector(bArr2.length);
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                m283a(false, bArr2[i2], m272a(bArr2[i2]));
            }
        } else {
            this.f264b = new Vector();
        }
        if (bArr3 != null) {
            this.f265a = new Vector[bArr3.length];
            for (int i3 = 0; i3 < bArr3.length; i3++) {
                this.f265a[i3] = new Vector();
                for (int i4 = 0; i4 < bArr3[i3].length; i4++) {
                    m280a(this.f265a[i3], bArr3[i3][i4], m272a(bArr3[i3][i4]));
                }
            }
        }
        this.f267b = (byte) -1;
        this.f268c = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m273a(byte b) {
        this.f268c = b;
    }

    /* JADX INFO: renamed from: a */
    public static int m274a() {
        return RunnableC0037e.m474b(f258b);
    }

    /* JADX INFO: renamed from: a */
    private void m275a(Graphics graphics, C0069d c0069d, String str, String str2) {
        int width = RunnableC0037e.f360a.getWidth();
        int height = RunnableC0037e.f360a.getHeight();
        int i = (width - 176) / 2;
        int iM474b = height - RunnableC0037e.m474b(f258b);
        m276a(graphics, i, iM474b, 88);
        m276a(graphics, i + 88, iM474b, 88);
        if (str != null && !str.equals("")) {
            c0069d.m782a(graphics, str, i + 44, height - (RunnableC0037e.m474b(f258b) / 2), 3);
        }
        if (str2 == null || str2.equals("")) {
            return;
        }
        c0069d.m782a(graphics, str2, (width - i) - 44, height - (RunnableC0037e.m474b(f258b) / 2), 3);
    }

    /* JADX INFO: renamed from: a */
    private void m276a(Graphics graphics, int i, int i2, int i3) {
        int iM473a = RunnableC0037e.m473a(f257a) / 5;
        int iM474b = RunnableC0037e.m474b(f257a);
        int iM473a2 = RunnableC0037e.m473a(f259c) / 5;
        int iM474b2 = RunnableC0037e.m474b(f259c);
        RunnableC0037e.m470a(graphics, f257a, this.f268c * iM473a, 0, iM473a, iM474b, 0, i, i2, 0);
        RunnableC0037e.m471a(graphics, f258b, 5, this.f268c, i + iM473a, i2, (i + i3) - iM473a, true, 16);
        RunnableC0037e.m470a(graphics, f259c, this.f268c * iM473a2, 0, iM473a2, iM474b2, 0, i + (i3 - iM473a), i2, 0);
    }

    /* JADX INFO: renamed from: b */
    private void m277b(Graphics graphics, int i, int i2, int i3) {
        int iM473a = RunnableC0037e.m473a(f260d) / 5;
        int iM474b = RunnableC0037e.m474b(f260d);
        int iM473a2 = RunnableC0037e.m473a(f262f) / 5;
        int iM474b2 = RunnableC0037e.m474b(f262f);
        RunnableC0037e.m470a(graphics, f260d, this.f268c * iM473a, 0, iM473a, iM474b, 0, i, i2, 0);
        RunnableC0037e.m471a(graphics, f261e, 5, this.f268c, i + iM473a, i2, (i + i3) - iM473a, true, 0);
        RunnableC0037e.m470a(graphics, f262f, this.f268c * iM473a2, 0, iM473a2, iM474b2, 0, i + (i3 - iM473a), i2, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m278a(Graphics graphics, byte b) {
        if (graphics == null) {
            return;
        }
        new C0025r(b).m275a(graphics, AbstractC0041i.f442b, C0066a.m773a(42), C0066a.m773a(43));
    }

    /* JADX INFO: renamed from: b */
    public static final void m279b(Graphics graphics, byte b) {
        if (graphics == null) {
            return;
        }
        new C0025r(b).m275a(graphics, AbstractC0041i.f442b, C0066a.m773a(146), (String) null);
    }

    /* JADX INFO: renamed from: a */
    private static void m280a(Vector vector, byte b, short s) {
        if (b == 52 || b == 51 || vector == null) {
            return;
        }
        vector.addElement(new C0023p(b, s));
    }

    /* JADX INFO: renamed from: a */
    public final void m281a(byte b, C0023p c0023p) {
        if (this.f265a == null) {
            this.f265a = new Vector[1];
            this.f265a[0] = new Vector();
        }
        if (this.f265a[0] == null) {
            this.f265a[0] = new Vector();
        }
        this.f265a[0].addElement(c0023p);
    }

    /* JADX INFO: renamed from: a */
    public final void m282a(boolean z, C0023p c0023p) {
        if (z) {
            if (this.f263a.contains(c0023p)) {
                return;
            }
            this.f263a.addElement(c0023p);
        } else {
            if (this.f264b.contains(c0023p)) {
                return;
            }
            this.f264b.addElement(c0023p);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m283a(boolean z, byte b, short s) {
        if (z) {
            m280a(this.f263a, b, s);
        } else {
            m280a(this.f264b, b, s);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m284b(Vector vector, byte b, short s) {
        if (vector == null) {
            return;
        }
        for (int i = 0; i < vector.size(); i++) {
            C0023p c0023p = (C0023p) vector.elementAt(i);
            if (c0023p.m265a() == b) {
                c0023p.m268a(s);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m285a(short s, byte b) {
        m284b(this.f263a, b, s);
        m284b(this.f264b, b, s);
    }

    /* JADX INFO: renamed from: a */
    private void m286a(Vector vector, int i, boolean z, boolean z2, boolean z3) {
        if (vector == null) {
            return;
        }
        boolean z4 = false;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            C0023p c0023p = (C0023p) vector.elementAt(i2);
            if (c0023p.m265a() == ((byte) i)) {
                if (C0023p.m256a(c0023p.f245a) != C0023p.m256a(i) && z3) {
                    c0023p.m268a(C0023p.m256a(i));
                }
                z4 = true;
                c0023p.m261a(!z);
            }
        }
        if (z4 || !z2) {
            return;
        }
        if (((byte) i) != 52 && ((byte) i) != 51 && vector != null) {
            vector.addElement(new C0023p(i));
        }
        if (z) {
            ((C0023p) vector.elementAt(vector.size() - 1)).m261a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m287a(byte b, boolean z, boolean z2) {
        m286a(this.f264b, C0023p.m259a(m272a((byte) 100), (byte) 100), z, false, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m288a(byte b, boolean z) {
        int iM259a = C0023p.m259a(m272a(b), b);
        m286a(this.f263a, iM259a, z, true, false);
        m286a(this.f264b, iM259a, z, false, false);
    }

    /* JADX INFO: renamed from: a */
    private static int m289a(Vector vector) {
        if (vector == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (((C0023p) vector.elementAt(i2)).m260a()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static int m290a(int i, Vector vector, int i2) {
        if (vector == null || vector.size() <= i) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = i; i4 < vector.size(); i4++) {
            if (((C0023p) vector.elementAt(i4)).m260a()) {
                if (i3 == i2) {
                    return i4;
                }
                i3++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m291a(Graphics graphics) {
        byte bM292a;
        Vector vector;
        if (graphics == null) {
            return;
        }
        try {
            RunnableC0037e.f360a.m452a(graphics);
            String strM773a = null;
            int iM289a = m289a(this.f263a);
            if (iM289a > 0) {
                strM773a = iM289a > 1 ? m298b() ? C0066a.m773a(146) : C0066a.m773a(72) : ((C0023p) this.f263a.elementAt(m290a(0, this.f263a, 0))).m266a();
            }
            String strM773a2 = null;
            int iM289a2 = m289a(this.f264b);
            if (iM289a2 > 0) {
                strM773a2 = iM289a2 > 1 ? m299c() ? C0066a.m773a(146) : C0066a.m773a(73) : ((C0023p) this.f264b.elementAt(m290a(0, this.f264b, 0))).m266a();
            }
            m275a(graphics, AbstractC0041i.f442b, strM773a, strM773a2);
            if (this.f266a != 0) {
                boolean z = this.f266a < 0;
                if (graphics != null) {
                    int width = RunnableC0037e.f360a.getWidth() / 2;
                    Vector vector2 = this.f264b;
                    if (z) {
                        width = (RunnableC0037e.f360a.getWidth() / 2) - 88;
                        vector2 = this.f263a;
                        if (width < 0) {
                            width = 0;
                        }
                    } else if (width + 88 > RunnableC0037e.f360a.getWidth()) {
                        width = RunnableC0037e.f360a.getWidth() - 88;
                    }
                    if (vector2 == null) {
                        this.f266a = (byte) 0;
                        return;
                    }
                    int height = (RunnableC0037e.f360a.getHeight() - RunnableC0037e.m474b(f258b)) - RunnableC0037e.m474b(f258b);
                    int i = 0;
                    for (int iM290a = m290a(0, vector2, 0); iM290a >= 0; iM290a = m290a(iM290a + 1, vector2, 0)) {
                        C0023p c0023p = (C0023p) vector2.elementAt(iM290a);
                        if (Math.abs((int) this.f266a) - 1 == iM290a) {
                            m277b(graphics, width, height, 88);
                            i = height;
                        } else {
                            m276a(graphics, width, height, 88);
                        }
                        (m293a(c0023p) ? AbstractC0041i.f442b : AbstractC0041i.f447g).m782a(graphics, c0023p.m266a(), width + (88 / 2), (height + (RunnableC0037e.m474b(f258b) / 2)) - 1, 3);
                        height -= RunnableC0037e.m474b(f258b);
                    }
                    C0023p c0023p2 = Math.abs((int) this.f266a) >= 1 ? (C0023p) vector2.elementAt(Math.abs((int) this.f266a) - 1) : null;
                    if (c0023p2 == null || c0023p2.m265a() != 49) {
                        return;
                    }
                    if ((z || this.f265a != null) && (bM292a = m292a((byte) Math.abs((int) this.f266a))) >= 0 && (vector = this.f265a[bM292a]) != null && vector.size() > 0) {
                        int i2 = z ? width + 88 : width - 88;
                        int height2 = i + (RunnableC0037e.m474b(f258b) * vector.size()) > RunnableC0037e.f360a.getHeight() - RunnableC0037e.m474b(f258b) ? RunnableC0037e.f360a.getHeight() - RunnableC0037e.m474b(f258b) : i + RunnableC0037e.m474b(f258b);
                        for (byte b = 0; b < vector.size(); b = (byte) (b + 1)) {
                            if (b == this.f267b) {
                                m277b(graphics, i2, height2, 88);
                            } else {
                                m276a(graphics, i2, height2, 88);
                            }
                            C0023p c0023p3 = (C0023p) vector.elementAt(b);
                            (m293a(c0023p3) ? AbstractC0041i.f442b : AbstractC0041i.f447g).m782a(graphics, c0023p3.m266a(), i2 + (88 / 2), (height2 + (RunnableC0037e.m474b(f258b) / 2)) - 1, 3);
                            height2 -= RunnableC0037e.m474b(f258b);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("PopupMenu ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private byte m292a(byte b) {
        if (b < 0 || this.f264b == null) {
            return (byte) -1;
        }
        byte b2 = -1;
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= b) {
                return b2;
            }
            if (((C0023p) this.f264b.elementAt(b4)).m265a() == 49) {
                b2 = (byte) (b2 + 1);
            }
            b3 = (byte) (b4 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m293a(C0023p c0023p) {
        return c0023p.m262b();
    }

    /* JADX INFO: renamed from: a */
    public final void m294a(int i) {
        byte b;
        Vector vector;
        byte b2;
        byte b3;
        if (i == 1 && m297a() && this.f266a != 0) {
            Vector vector2 = this.f266a < 0 ? this.f263a : this.f264b;
            if (this.f267b < 0) {
                byte bAbs = this.f266a;
                if (this.f266a < 0) {
                    bAbs = (byte) Math.abs((int) this.f266a);
                }
                byte b4 = (byte) (bAbs - 1);
                boolean z = false;
                byte b5 = 1;
                while (true) {
                    b3 = b5;
                    if (b4 + b3 >= vector2.size()) {
                        break;
                    }
                    C0023p c0023p = (C0023p) vector2.elementAt(b4 + b3);
                    if (m293a(c0023p) && c0023p.m260a()) {
                        z = true;
                        break;
                    }
                    b5 = (byte) (b3 + 1);
                }
                if (z) {
                    if (this.f266a < 0) {
                        this.f266a = (byte) (this.f266a - b3);
                    } else {
                        this.f266a = (byte) (this.f266a + b3);
                    }
                }
            } else {
                byte bM309a = m309a((byte) (this.f267b + 1), m292a((byte) Math.abs((int) this.f266a)));
                if (bM309a != -1) {
                    this.f267b = bM309a;
                }
            }
        }
        if (i == 6 && m297a() && this.f266a != 0) {
            Vector vector3 = this.f266a < 0 ? this.f263a : this.f264b;
            if (this.f267b < 0) {
                byte bAbs2 = this.f266a;
                if (this.f266a < 0) {
                    bAbs2 = (byte) Math.abs((int) this.f266a);
                }
                byte b6 = (byte) (bAbs2 - 1);
                boolean z2 = false;
                byte b7 = 1;
                while (true) {
                    b2 = b7;
                    if (b6 - b2 < 0) {
                        break;
                    }
                    C0023p c0023p2 = (C0023p) vector3.elementAt(b6 - b2);
                    if (m293a(c0023p2) && c0023p2.m260a()) {
                        z2 = true;
                        break;
                    }
                    b7 = (byte) (b2 + 1);
                }
                if (z2) {
                    if (this.f266a < 0) {
                        this.f266a = (byte) (this.f266a + b2);
                    } else {
                        this.f266a = (byte) (this.f266a - b2);
                    }
                }
            } else {
                byte b8 = (byte) (this.f267b - 1);
                byte bM292a = m292a((byte) Math.abs((int) this.f266a));
                if (this.f265a != null && (vector = this.f265a[bM292a]) != null) {
                    byte b9 = b8;
                    while (true) {
                        byte b10 = b9;
                        if (b10 < 0) {
                            b = -1;
                            break;
                        } else {
                            if (m293a(m295a(vector, (int) b10))) {
                                b = b10;
                                break;
                            }
                            b9 = (byte) (b10 - 1);
                        }
                    }
                } else {
                    b = -1;
                    break;
                }
                byte b11 = b;
                if (b != -1) {
                    this.f267b = b11;
                }
                if (m292a((byte) Math.abs((int) this.f266a)) < 0) {
                }
            }
        }
        if ((i == 5 || i == 2) && m297a()) {
            if (this.f267b >= 0) {
                this.f267b = (byte) -1;
            } else {
                if ((this.f266a <= 0 || i != 2) && (this.f266a >= 0 || i != 5)) {
                    return;
                }
                this.f267b = m309a((byte) 0, m292a((byte) Math.abs((int) this.f266a)));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0023p m295a(Vector vector, int i) {
        return (C0023p) vector.elementAt(i);
    }

    /* JADX INFO: renamed from: a */
    public final C0023p m296a(boolean z, boolean z2, boolean z3) {
        if (z && m289a(this.f264b) == 1 && this.f266a == 0) {
            return m295a(this.f264b, m290a(0, this.f264b, 0));
        }
        if (z) {
            this.f267b = (byte) -1;
            if (this.f266a > 0) {
                this.f266a = (byte) 0;
                return null;
            }
            this.f266a = (byte) 1;
            return null;
        }
        if ((z2 || z3) && m289a(this.f263a) == 1 && this.f266a == 0) {
            return m295a(this.f263a, m290a(0, this.f263a, 0));
        }
        if (z2 || (z3 && !m297a())) {
            this.f267b = (byte) -1;
            if (this.f266a < 0) {
                this.f266a = (byte) 0;
                return null;
            }
            this.f266a = (byte) ((-m290a(0, this.f263a, 0)) - 1);
            return null;
        }
        if (this.f267b < 0 && this.f266a != 0 && z3) {
            C0023p c0023pM295a = this.f266a < 0 ? m295a(this.f263a, Math.abs((int) this.f266a) - 1) : m295a(this.f264b, Math.abs((int) this.f266a) - 1);
            if (c0023pM295a.m265a() != 49) {
                this.f266a = (byte) 0;
            }
            return c0023pM295a;
        }
        if (this.f267b < 0 || this.f266a == 0 || !z3) {
            return null;
        }
        byte bM292a = m292a((byte) Math.abs((int) this.f266a));
        byte b = this.f267b;
        this.f267b = (byte) -1;
        this.f266a = (byte) 0;
        return m295a(this.f265a[bM292a], (int) b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m297a() {
        return this.f266a != 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m298b() {
        return this.f266a < 0;
    }

    /* JADX INFO: renamed from: c */
    private boolean m299c() {
        return this.f266a > 0;
    }

    /* JADX INFO: renamed from: a */
    private void m300a(Vector vector, byte b, boolean z) {
        if (vector == null) {
            return;
        }
        for (int i = 0; i < vector.size(); i++) {
            C0023p c0023pM295a = m295a(vector, i);
            if (c0023pM295a.m265a() == b) {
                c0023pM295a.m263b(z);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m301b(byte b) {
        m300a(this.f263a, b, false);
        m300a(this.f264b, b, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m302c(byte b) {
        m300a(this.f263a, b, true);
        m300a(this.f264b, b, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m303a(boolean z, boolean z2) {
        if (this.f263a == null) {
            return;
        }
        for (int i = 0; i < this.f263a.size(); i++) {
            m295a(this.f263a, i).m261a(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m304a(Vector vector, byte b) {
        if (vector == null) {
            return;
        }
        for (int i = 0; i < vector.size(); i++) {
            C0023p c0023pM295a = m295a(vector, i);
            if (c0023pM295a.m265a() == b) {
                c0023pM295a.m268a(m272a(b));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m305d(byte b) {
        m304a(this.f263a, (byte) 81);
        m304a(this.f264b, (byte) 81);
    }

    /* JADX INFO: renamed from: a */
    public final void m306a(byte[] bArr, boolean z) {
        m307a(bArr, false, true, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m307a(byte[] bArr, boolean z, boolean z2, boolean z3) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= bArr.length) {
                return;
            }
            m286a(this.f263a, C0023p.m259a(m272a(bArr[b2]), bArr[b2]), z, true, false);
            if (z3) {
                m286a(this.f264b, C0023p.m259a(m272a(bArr[b2]), bArr[b2]), z, true, false);
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m308a(int[] iArr, boolean z) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= iArr.length) {
                return;
            }
            m286a(this.f263a, iArr[b2], false, true, true);
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private byte m309a(byte b, byte b2) {
        Vector vector;
        if (this.f265a == null || (vector = this.f265a[b2]) == null) {
            return (byte) -1;
        }
        byte b3 = b;
        while (true) {
            byte b4 = b3;
            if (b4 >= vector.size()) {
                return (byte) -1;
            }
            if (m293a(m295a(vector, (int) b4))) {
                return b4;
            }
            b3 = (byte) (b4 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m310a(int i, int i2) {
        return i2 >= RunnableC0037e.f360a.getHeight() - RunnableC0037e.m474b(f258b) && i >= (RunnableC0037e.f360a.getWidth() - 176) / 2 && i <= RunnableC0037e.f360a.getWidth() / 2;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m311b(int i, int i2) {
        return i2 >= RunnableC0037e.f360a.getHeight() - RunnableC0037e.m474b(f258b) && i >= RunnableC0037e.f360a.getWidth() / 2 && i < (RunnableC0037e.f360a.getWidth() + 176) / 2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m312c(int i, int i2) {
        byte bM290a;
        C0023p c0023pM313a;
        boolean zM298b = (i >= (RunnableC0037e.f360a.getWidth() - 176) / 2 && i <= RunnableC0037e.f360a.getWidth() / 2) & (i2 <= RunnableC0037e.f360a.getHeight() - RunnableC0037e.m474b(f258b) && i2 >= m289a(this.f263a) * RunnableC0037e.m474b(f258b)) & m298b();
        boolean zM299c = (i >= RunnableC0037e.f360a.getWidth() / 2 && i <= (RunnableC0037e.f360a.getWidth() + 176) / 2) & (i2 <= RunnableC0037e.f360a.getHeight() - RunnableC0037e.m474b(f258b) && i2 >= m289a(this.f264b) * RunnableC0037e.m474b(f258b)) & m299c();
        if (!zM298b && !zM299c) {
            return false;
        }
        int height = ((RunnableC0037e.f360a.getHeight() - RunnableC0037e.m474b(f258b)) - i2) / RunnableC0037e.m474b(f258b);
        if (!m298b()) {
            if (!m299c() || (c0023pM313a = m313a((int) (bM290a = (byte) (m290a(0, this.f264b, height) + 1)))) == null || !c0023pM313a.m262b()) {
                return false;
            }
            this.f266a = bM290a;
            return true;
        }
        byte b = (byte) ((-m290a(0, this.f263a, height)) - 1);
        C0023p c0023pM313a2 = m313a((int) b);
        if (c0023pM313a2 == null || !c0023pM313a2.m262b()) {
            return false;
        }
        this.f266a = b;
        return true;
    }

    /* JADX INFO: renamed from: a */
    private C0023p m313a(int i) {
        if (i < 0) {
            return (C0023p) this.f263a.elementAt(Math.abs(i) - 1);
        }
        if (i > 0) {
            return (C0023p) this.f264b.elementAt(Math.abs(i) - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m314a() {
        if (this.f263a != null) {
            this.f263a.removeAllElements();
        }
        if (this.f264b != null) {
            this.f264b.removeAllElements();
        }
        this.f266a = (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m315a(int i) {
        if (i == f253a) {
            return true;
        }
        if (f253a == f255a[0]) {
            for (int i2 = 1; i2 < f255a.length; i2++) {
                if (i == f255a[i2]) {
                    return true;
                }
            }
        }
        return i == 42;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m316b(int i) {
        if (i == f254b) {
            return true;
        }
        if (f254b == f256b[0]) {
            for (int i2 = 0; i2 < f256b.length; i2++) {
                if (i == f256b[i2]) {
                    return true;
                }
            }
        }
        return i == 35;
    }

    /* JADX INFO: renamed from: b */
    public static void m317b(int i) {
        f253a = i;
    }

    /* JADX INFO: renamed from: c */
    public static void m318c(int i) {
        f254b = i;
    }

    /* JADX INFO: renamed from: b */
    public static void m319b() {
        Main2.f0a.f6a.m786a((byte) 11, f253a);
        Main2.f0a.f6a.m786a((byte) 12, f254b);
    }

    /* JADX INFO: renamed from: c */
    public static void m320c() {
        f253a = Main2.f0a.f6a.m791a((byte) 11, f253a);
        f254b = Main2.f0a.f6a.m791a((byte) 12, f254b);
    }

    static {
        f257a = (short) -1;
        f258b = (short) -1;
        f259c = (short) -1;
        f260d = (short) -1;
        f261e = (short) -1;
        f262f = (short) -1;
        f257a = C0050b.m633a("popup_menu_item_left_x.png");
        f258b = C0050b.m633a("popup_menu_item_center_x.png");
        f259c = C0050b.m633a("popup_menu_item_right_x.png");
        f260d = C0050b.m633a("popup_menu_selected_item_left_x.png");
        f261e = C0050b.m633a("popup_menu_selected_item_center_x.png");
        f262f = C0050b.m633a("popup_menu_selected_item_right_x.png");
    }
}
