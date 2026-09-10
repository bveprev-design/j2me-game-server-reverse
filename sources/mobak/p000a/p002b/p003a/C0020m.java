package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.C0039g;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;
import mobak.p006c.C0069d;
import mobak.p006c.InterfaceC0070e;

/* JADX INFO: renamed from: mobak.a.b.a.m */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/m.class */
public final class C0020m extends AbstractC0012e implements InterfaceC0070e {

    /* JADX INFO: renamed from: a */
    public byte f218a;

    /* JADX INFO: renamed from: a */
    public String[] f219a;

    /* JADX INFO: renamed from: a */
    public int[] f220a;

    /* JADX INFO: renamed from: i */
    private C0069d f221i;

    /* JADX INFO: renamed from: b */
    private byte f222b;

    /* JADX INFO: renamed from: a */
    int f223a;

    /* JADX INFO: renamed from: b */
    private String[] f224b;

    /* JADX INFO: renamed from: b */
    C0035c f225b;

    /* JADX INFO: renamed from: b */
    private int[] f226b;

    /* JADX INFO: renamed from: c */
    private byte f227c;

    /* JADX INFO: renamed from: d */
    private String f228d;

    /* JADX INFO: renamed from: b */
    private int f229b;

    /* JADX INFO: renamed from: c */
    private String[] f230c;

    /* JADX INFO: renamed from: d */
    private String[] f231d;

    /* JADX INFO: renamed from: b */
    private boolean f232b;

    /* JADX INFO: renamed from: c */
    private boolean f233c = false;

    /* JADX INFO: renamed from: a */
    private C0023p f234a;

    /* JADX INFO: renamed from: b */
    private C0023p f235b;

    /* JADX INFO: renamed from: c */
    private C0023p f236c;

    /* JADX INFO: renamed from: c */
    private int f237c;

    /* JADX INFO: renamed from: a */
    private static C0020m f238a;

    /* JADX INFO: renamed from: a */
    public static final C0020m m231a() {
        if (f238a == null) {
            C0005e.f76a.f101b = true;
            f238a = new C0020m();
            RunnableC0037e.f360a.m437a((AbstractC0012e) f238a, true);
            C0063c.f597a.m749a(new C0058g(C0059h.f576a[60], (short) 0, C0059h.f576a[61]));
        }
        return f238a;
    }

    private C0020m() {
        this.f463k = (short) -107;
        this.f228d = C0066a.m773a(81);
        ((AbstractC0012e) this).f166a = C0066a.m773a(154);
        this.f219a = null;
        this.f220a = null;
        this.f221i = AbstractC0041i.f446f;
        ((AbstractC0041i) this).f456a = new C0025r(new byte[]{51, 81, 96, 58, 98, 79}, new byte[]{52, 55, 97}, null);
        ((AbstractC0041i) this).f456a.m285a((short) 208, (byte) 98);
        ((AbstractC0041i) this).f456a.m285a((short) 169, (byte) 97);
        ((AbstractC0041i) this).f456a.m285a((short) 34, (byte) 55);
        ((AbstractC0041i) this).f456a.m285a((short) 237, (byte) 79);
        ((AbstractC0041i) this).f456a.m288a((byte) 98, true);
        this.f225b = new C0035c((short) 16, (short) (m190a() + 8), (short) (RunnableC0037e.f360a.getWidth() - 32), (short) (((RunnableC0037e.f360a.getHeight() - m190a()) - 22) - C0025r.m274a()), false, false);
        ((AbstractC0041i) this).f456a.m285a((short) 152, (byte) 96);
        ((AbstractC0041i) this).f456a.m285a((short) 153, (byte) 58);
        ((AbstractC0041i) this).f456a.m288a((byte) 51, true);
        ((AbstractC0041i) this).f456a.m288a((byte) 96, true);
        ((AbstractC0041i) this).f456a.m288a((byte) 58, true);
        ((AbstractC0041i) this).f456a.m288a((byte) 79, true);
        this.f234a = new C0023p((byte) 71);
        this.f234a.m261a(false);
        this.f234a.m268a((short) 241);
        ((AbstractC0041i) this).f456a.m282a(true, this.f234a);
        this.f235b = new C0023p((byte) 30);
        this.f235b.m261a(false);
        this.f235b.m268a((short) 267);
        this.f235b.m271c(true);
        this.f235b.f246a = C0059h.f576a[88];
        ((AbstractC0041i) this).f456a.m282a(true, this.f235b);
        this.f236c = new C0023p((byte) 30);
        this.f236c.m261a(false);
        this.f236c.m268a((short) 252);
        this.f236c.m271c(true);
        this.f236c.f246a = C0059h.f576a[89];
        ((AbstractC0041i) this).f456a.m282a(true, this.f236c);
    }

    /* JADX INFO: renamed from: a */
    public final void m232a(int i, int i2) {
        if (i < 0 && i2 < 0) {
            this.f233c = true;
            return;
        }
        this.f233c = false;
        m242n();
        this.f218a = (byte) 2;
        ((AbstractC0012e) this).f166a = this.f219a[this.f227c];
        if (this.f220a[this.f227c] != -1) {
            this.f224b = new String[]{new StringBuffer().append(C0066a.m773a(80)).append("(").append(i).append(")").toString(), new StringBuffer().append(C0066a.m773a(160)).append("(").append(i2).append(")").toString()};
        } else {
            this.f224b = new String[]{new StringBuffer().append(C0066a.m773a(66)).append("(").append(i).append(")").toString(), new StringBuffer().append(C0066a.m773a(67)).append("(").append(i2).append(")").toString()};
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m233a(String[] strArr, String[] strArr2, int[] iArr, boolean z, boolean z2) {
        m242n();
        this.f226b = iArr;
        this.f225b.m408c();
        m247a(strArr, strArr2);
        if (strArr != null && strArr.length > 0) {
            this.f225b.m406a(this.f223a).m415a(16773632, 2);
        }
        this.f228d = this.f219a[this.f227c];
        ((AbstractC0012e) this).f166a = C0066a.m773a(160);
        this.f218a = (byte) 4;
        ((AbstractC0041i) this).f456a.m285a((short) 156, (byte) 81);
        if (z) {
            ((AbstractC0041i) this).f456a.m288a((byte) 96, false);
        } else {
            ((AbstractC0041i) this).f456a.m288a((byte) 96, true);
        }
        if (z2) {
            ((AbstractC0041i) this).f456a.m288a((byte) 58, false);
        } else {
            ((AbstractC0041i) this).f456a.m288a((byte) 58, true);
        }
        ((AbstractC0041i) this).f456a.m288a((byte) 79, false);
        this.f235b.m261a(true);
        this.f236c.m261a(true);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        super.mo169a(graphics);
        synchronized (this) {
            switch (this.f218a) {
                case 1:
                    if (this.f219a != null) {
                        m194a(graphics, m234b(), this.f219a, this.f222b, this.f221i);
                    }
                    break;
                case 2:
                    if (this.f224b != null) {
                        m194a(graphics, m234b(), this.f224b, this.f222b, this.f221i);
                    }
                    break;
                case 3:
                case 4:
                    this.f225b.m395a(graphics, (byte) 0);
                    break;
            }
            ((AbstractC0041i) this).f456a.m291a(graphics);
            if (this.f230c != null) {
                synchronized (this) {
                    if (this.f229b == this.f230c.length - 1) {
                        this.f231d = null;
                        this.f230c = null;
                        this.f229b = 0;
                    } else {
                        for (short s = (short) this.f229b; s < this.f230c.length; s = (short) (s + 1)) {
                            if (RunnableC0037e.f360a.m453d() >= 0) {
                                RunnableC0037e.f360a.m454b(this.f231d[s], this.f230c[s]);
                                this.f229b++;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private short m234b() {
        return (short) (m190a() + 10);
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
        if (this.f218a == 1) {
            ((AbstractC0041i) this).f456a.m301b((byte) 55);
        } else {
            ((AbstractC0041i) this).f456a.m302c((byte) 55);
        }
        if (this.f218a == 4 && this.f225b.m409a()) {
            ((AbstractC0041i) this).f456a.m288a((byte) 81, true);
        } else {
            ((AbstractC0041i) this).f456a.m288a((byte) 81, false);
        }
        if (this.f218a == 3) {
            ((AbstractC0041i) this).f456a.m288a((byte) 81, true);
            boolean z = false;
            if (this.f220a[this.f227c] != -1) {
                z = true;
                if (this.f225b.m409a()) {
                    ((AbstractC0041i) this).f456a.m285a((short) 156, (byte) 81);
                } else {
                    ((AbstractC0041i) this).f456a.m285a((short) 157, (byte) 81);
                }
            } else if (!this.f225b.m409a()) {
                if (this.f232b) {
                    ((AbstractC0041i) this).f456a.m285a((short) 156, (byte) 81);
                } else {
                    ((AbstractC0041i) this).f456a.m285a((short) 157, (byte) 81);
                }
                z = true;
            }
            if (z) {
                ((AbstractC0041i) this).f456a.m288a((byte) 81, false);
            }
        }
        if (this.f233c) {
            ((AbstractC0041i) this).f456a.m288a((byte) 81, true);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case 30:
                if (c0023p.f246a != C0059h.f576a[89] || !c0023p.m270e()) {
                    return super.mo170a(c0023p);
                }
                int iMo230b = mo230b();
                if (C0005e.f76a.f84a == iMo230b) {
                    return false;
                }
                C0058g c0058g = new C0058g(c0023p.f246a);
                c0058g.m668a(c0023p.f247b);
                c0058g.m670a(iMo230b);
                C0063c.f597a.m749a(c0058g);
                return true;
            case 55:
                m241o();
                return true;
            case 58:
                if (this.f218a == 3) {
                    m238a((byte) 1, (byte) 0);
                    return true;
                }
                m239a((byte) 1);
                return true;
            case 71:
                if (this.f225b.m406a(this.f223a + 1) == null) {
                    return true;
                }
                RunnableC0037e.m431a("", C0066a.m773a(244), "", new C0009b(this));
                return true;
            case 79:
                C0058g c0058g2 = new C0058g(C0059h.f576a[79], (short) 0, C0059h.f576a[79]);
                c0058g2.m672a((byte) 1);
                C0063c.f597a.m749a(c0058g2);
                return true;
            case 81:
                switch (this.f218a) {
                    case 1:
                        m235b();
                        return true;
                    case 2:
                        m237g();
                        return true;
                    case 3:
                    case 4:
                        this.f237c = -1;
                        String strMo254a = null;
                        if (this.f225b.m406a(this.f223a) != null) {
                            strMo254a = this.f225b.m406a(this.f223a).mo254a();
                            this.f237c = this.f225b.m406a(this.f223a).mo255b();
                        }
                        String str = strMo254a;
                        boolean z = strMo254a != null;
                        ((AbstractC0041i) this).f451a = new C0039g(C0066a.m773a(79), this);
                        ((AbstractC0041i) this).f451a.m520a(C0066a.m773a(129));
                        ((AbstractC0041i) this).f451a.m520a(C0066a.m773a(34));
                        if (z && this.f220a[this.f227c] != -1) {
                            C0039g c0039g = ((AbstractC0041i) this).f451a;
                            String strM773a = C0066a.m773a(79);
                            String[] strArr = {C0066a.m773a(155), new StringBuffer().append(C0066a.m773a(159)).append(" (").append(str).append(")").toString()};
                            boolean[] zArr = new boolean[2];
                            zArr[0] = !z;
                            zArr[1] = z;
                            c0039g.m516a(strM773a, 1, strArr, zArr);
                        }
                        ((AbstractC0041i) this).f451a.m514a(C0066a.m773a(79), "", 200, 0);
                        ((AbstractC0041i) this).f451a.m519a();
                        return true;
                    default:
                        return true;
                }
            case 96:
                if (this.f218a == 3) {
                    m238a((byte) 2, (byte) 0);
                    return true;
                }
                m239a((byte) 2);
                return true;
            case 97:
                m240d();
                return true;
            case 98:
                m238a((byte) 0, (byte) 0);
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final void mo202a(int i) {
        switch (this.f218a) {
            case 1:
            case 2:
                int length = -1;
                switch (this.f218a) {
                    case 1:
                        if (this.f219a != null) {
                            length = this.f219a.length;
                        }
                        break;
                    case 2:
                        if (this.f224b != null) {
                            length = this.f224b.length;
                        }
                        break;
                }
                if (length != -1) {
                    if (RunnableC0037e.f360a.getGameAction(i) != 6) {
                        if (RunnableC0037e.f360a.getGameAction(i) == 1) {
                            if (this.f222b <= 0) {
                                this.f222b = (byte) (length - 1);
                            } else {
                                this.f222b = (byte) (this.f222b - 1);
                            }
                        }
                    } else if (this.f222b >= length - 1) {
                        this.f222b = (byte) 0;
                    } else {
                        this.f222b = (byte) (this.f222b + 1);
                    }
                    break;
                }
                break;
            case 3:
            case 4:
                int i2 = -1;
                if (RunnableC0037e.f360a.getGameAction(i) == 6) {
                    int iM411a = this.f225b.m411a(this.f223a + 1);
                    i2 = iM411a;
                    if (iM411a != -1 && !this.f225b.m413a(i2)) {
                        this.f225b.m398b();
                        i2 = -1;
                    }
                } else if (RunnableC0037e.f360a.getGameAction(i) == 1) {
                    int iM412b = this.f225b.m412b(this.f223a - 1);
                    i2 = iM412b;
                    if (iM412b != -1 && !this.f225b.m413a(i2)) {
                        this.f225b.m396a();
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    this.f225b.m406a(this.f223a).m416d();
                    this.f223a = i2;
                    this.f225b.m406a(this.f223a).m415a(16773632, 2);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m235b() {
        byte b = this.f222b;
        if (b < 0 || b >= this.f220a.length) {
            return false;
        }
        this.f227c = this.f222b;
        m236a(this.f220a[b], true);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m236a(int i, boolean z) {
        try {
            C0058g c0058g = z ? new C0058g(C0059h.f576a[57], (short) 4, C0059h.f576a[57]) : new C0058g(C0059h.f576a[57], (short) 4, (short) 0);
            c0058g.m670a(i);
            C0063c.f597a.m749a(c0058g);
            this.f225b.m408c();
        } catch (Exception e) {
            C0063c.m744a(new StringBuffer().append("select room: ").append(e.getMessage()).toString(), false);
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m237g() {
        if (this.f220a[this.f227c] == -1) {
            this.f232b = this.f222b != 0;
            m238a((byte) 0, (byte) (this.f222b + 1));
            return true;
        }
        if (this.f222b == 0) {
            m238a((byte) 0, (byte) 0);
            return true;
        }
        if (this.f222b != 1) {
            return true;
        }
        m239a((byte) 0);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static void m238a(byte b, byte b2) {
        try {
            C0058g c0058g = new C0058g(C0059h.f576a[58], (short) 0, C0059h.f576a[56]);
            c0058g.m672a(b);
            if (b2 != 0) {
                c0058g.m672a(b2);
            }
            C0063c.f597a.m749a(c0058g);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("MSG_LIST: ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m239a(byte b) {
        try {
            C0058g c0058g = new C0058g(C0059h.f576a[61], (short) 0, C0059h.f576a[61]);
            c0058g.m672a(b);
            C0063c.f597a.m749a(c0058g);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("MSG_LIST: ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m240d() {
        C0005e.f76a.f101b = false;
        f238a = null;
        try {
            C0058g c0058g = new C0058g(C0059h.f576a[60]);
            c0058g.m672a((byte) 1);
            C0063c.f597a.m749a(c0058g);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("closeChat ").append(e.getMessage()).toString());
        }
        RunnableC0037e.f360a.m443f();
    }

    /* JADX WARN: Switch 'out' block B:2:0x0000 for B:6:0x0010 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: o */
    private void m241o() {
        while (true) {
            if (this.f218a == 3) {
                m242n();
            }
            switch (this.f218a) {
                case 2:
                    this.f233c = false;
                    this.f218a = (byte) 1;
                    ((AbstractC0012e) this).f166a = C0066a.m773a(154);
                    this.f228d = C0066a.m773a(81);
                    ((AbstractC0041i) this).f456a.m305d((byte) 81);
                    m236a(-100, false);
                    return;
                case 3:
                case 4:
                    if (!this.f233c) {
                        m236a(this.f220a[this.f227c], true);
                        this.f228d = C0066a.m773a(81);
                        ((AbstractC0012e) this).f166a = this.f219a[this.f227c];
                        ((AbstractC0041i) this).f456a.m305d((byte) 81);
                        return;
                    }
                    this.f218a = (byte) 2;
                    break;
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m242n() {
        this.f234a.m261a(false);
        this.f235b.m261a(false);
        this.f236c.m261a(false);
        ((AbstractC0041i) this).f456a.m288a((byte) 51, true);
        ((AbstractC0041i) this).f456a.m288a((byte) 96, true);
        ((AbstractC0041i) this).f456a.m288a((byte) 58, true);
        ((AbstractC0041i) this).f456a.m288a((byte) 79, true);
        ((AbstractC0041i) this).f456a.m285a((short) 7, (byte) 81);
        ((AbstractC0041i) this).f456a.m288a((byte) 98, true);
        this.f222b = (byte) 0;
        this.f223a = 0;
        this.f225b.m408c();
    }

    /* JADX INFO: renamed from: a */
    public final void m243a(String[] strArr, String[] strArr2, int[] iArr) {
        if (!this.f225b.m409a()) {
            this.f225b.m406a(this.f223a).m416d();
        }
        if (this.f226b != null && this.f226b.length > 15) {
            m244p();
        }
        if (this.f226b == null) {
            this.f226b = iArr;
        } else {
            int[] iArr2 = new int[this.f226b.length + iArr.length];
            System.arraycopy(this.f226b, 0, iArr2, iArr.length, this.f226b.length);
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f226b = iArr2;
        }
        m247a(strArr, strArr2);
        if (this.f225b.m409a()) {
            return;
        }
        this.f225b.m406a(0).m415a(16773632, 2);
        this.f222b = (byte) 0;
        this.f223a = 0;
    }

    /* JADX INFO: renamed from: p */
    private void m244p() {
        this.f226b = null;
        this.f222b = (byte) 0;
        this.f223a = 0;
        this.f225b.m408c();
        ((AbstractC0041i) this).f456a.m288a((byte) 98, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m245a(String[] strArr, String[] strArr2, int[] iArr, boolean z, boolean z2, boolean z3) {
        m242n();
        m244p();
        ((AbstractC0041i) this).f456a.m288a((byte) 98, false);
        if (this.f218a != 3) {
            this.f228d = this.f219a[this.f227c];
            ((AbstractC0012e) this).f166a = C0066a.m773a(80);
            this.f218a = (byte) 3;
            this.f225b.m408c();
        }
        m243a(strArr, strArr2, iArr);
        if (z && z2) {
            ((AbstractC0041i) this).f456a.m288a((byte) 51, false);
            ((AbstractC0041i) this).f456a.m288a((byte) 96, false);
            ((AbstractC0041i) this).f456a.m288a((byte) 58, false);
        } else if (z2) {
            ((AbstractC0041i) this).f456a.m288a((byte) 51, false);
            ((AbstractC0041i) this).f456a.m288a((byte) 58, false);
        } else if (z) {
            ((AbstractC0041i) this).f456a.m288a((byte) 51, false);
            ((AbstractC0041i) this).f456a.m288a((byte) 96, false);
        }
        this.f235b.m261a(true);
        this.f236c.m261a(true);
        this.f234a.m261a(z3);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m246b(String[] strArr, String[] strArr2, int[] iArr) {
        if (this.f220a[this.f227c] == -1) {
            m243a(strArr, strArr2, iArr);
            return;
        }
        if (strArr2.length <= 5) {
            for (int i = 0; i < strArr2.length; i++) {
                RunnableC0037e.f360a.m454b(strArr[i], strArr2[i]);
            }
            return;
        }
        if (this.f231d != null) {
            String[] strArr3 = new String[this.f230c.length + strArr2.length];
            System.arraycopy(this.f230c, 0, strArr3, 0, this.f230c.length);
            System.arraycopy(strArr2, 0, strArr3, this.f230c.length, strArr2.length);
            this.f230c = strArr3;
            System.arraycopy(this.f231d, 0, strArr3, 0, this.f231d.length);
            System.arraycopy(strArr2, 0, strArr3, this.f231d.length, strArr2.length);
            this.f231d = strArr3;
            return;
        }
        this.f231d = new String[strArr2.length];
        this.f230c = new String[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            if (strArr2[i2] != null && !strArr2[i2].trim().equals("")) {
                this.f230c[i2] = new StringBuffer().append(strArr[i2]).append(": ").append(strArr2[i2]).toString();
            }
        }
        this.f229b = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m247a(String[] strArr, String[] strArr2) {
        if (this.f225b.m409a()) {
            this.f225b.f352a += 10;
        }
        for (int i = 0; i < strArr2.length; i++) {
            synchronized (this) {
                this.f225b.m402a(strArr2[i], AbstractC0041i.f442b, true, -1);
                this.f225b.m402a(strArr[i], AbstractC0041i.f448h, true, -1);
            }
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final String mo200a() {
        return this.f228d;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        switch (this.f218a) {
            case 1:
            case 2:
                byte bM196a = m196a(this.f221i, this.f219a.length, m234b(), i2);
                if (bM196a < 0 || bM196a >= this.f219a.length) {
                    return false;
                }
                this.f222b = bM196a;
                return true;
            case 3:
            case 4:
                int iM414c = this.f225b.m414c(i2);
                if (iM414c == -1) {
                    return false;
                }
                this.f225b.m406a(this.f223a).m416d();
                this.f223a = iM414c;
                this.f225b.m406a(this.f223a).m415a(16773632, 2);
                return true;
            default:
                return false;
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        byte bM196a;
        if ((this.f218a != 1 && this.f218a != 2) || (bM196a = m196a(this.f221i, this.f219a.length, m234b(), i2)) < 0 || bM196a >= this.f219a.length || this.f222b != bM196a) {
            return false;
        }
        if (this.f218a == 1) {
            return m235b();
        }
        if (this.f218a == 2) {
            return m237g();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: d */
    public final void mo248d(int i) {
        if (i != 51 || ((AbstractC0041i) this).f457d != 1) {
            super.mo248d(i);
            return;
        }
        byte b = this.f222b;
        if (b < 0 || b >= this.f220a.length) {
            return;
        }
        this.f227c = this.f222b;
        m236a(this.f220a[b], true);
    }

    @Override // mobak.p000a.p002b.AbstractC0041i, mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: b */
    public final void mo10b(int i) {
        String strM515a;
        if (i == 1) {
            RunnableC0037e.f360a.m472l();
            ((AbstractC0041i) this).f451a = null;
            return;
        }
        if (i != 0 || (strM515a = ((AbstractC0041i) this).f451a.m515a(0)) == null || strM515a.trim().equals("")) {
            return;
        }
        try {
            C0058g c0058g = new C0058g(C0059h.f576a[56]);
            boolean z = false;
            if (((AbstractC0041i) this).f451a.f434b.size() > 0) {
                z = ((AbstractC0041i) this).f451a.m517a(0) != 0;
            }
            if (z || this.f220a[this.f227c] == -1) {
                c0058g.m672a((byte) 1);
                c0058g.m670a(this.f237c);
            } else {
                c0058g.m672a((byte) 0);
                c0058g.m670a(0);
            }
            c0058g.m674a(strM515a);
            C0063c.f597a.m749a(c0058g);
            mo10b(1);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("Chat3 sendMsg: ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: b */
    public final int mo230b() {
        switch (this.f218a) {
            case 1:
                return -1;
            case 2:
                return -1;
            case 3:
            case 4:
                if (this.f225b.m406a(this.f223a) != null) {
                    return this.f225b.m406a(this.f223a).mo255b();
                }
                return -1;
            default:
                return -1;
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i, mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: c */
    public final void mo13c(int i) {
    }
}
