package mobak.p000a.p002b.p003a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.Main2;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0001a;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p001a.C0006f;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.a.w */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/w.class */
public final class C0030w extends AbstractC0012e {

    /* JADX INFO: renamed from: a */
    public int f286a;

    /* JADX INFO: renamed from: a */
    public String[][] f287a;

    /* JADX INFO: renamed from: a */
    private byte[][] f288a;

    /* JADX INFO: renamed from: a */
    public short[] f289a;

    /* JADX INFO: renamed from: a */
    public byte[] f290a;

    /* JADX INFO: renamed from: b */
    public short[] f291b;

    /* JADX INFO: renamed from: a */
    private boolean[][] f292a;

    /* JADX INFO: renamed from: a */
    public AbstractC0003c[][] f293a;

    /* JADX INFO: renamed from: b */
    private byte f295b;

    /* JADX INFO: renamed from: c */
    short[] f296c;

    /* JADX INFO: renamed from: a */
    byte f297a;

    /* JADX INFO: renamed from: l */
    short f298l;

    /* JADX INFO: renamed from: c */
    private byte f299c;

    /* JADX INFO: renamed from: a */
    Vector f303a;

    /* JADX INFO: renamed from: a */
    private C0023p f305a;

    /* JADX INFO: renamed from: b */
    private C0023p f306b;

    /* JADX INFO: renamed from: c */
    private C0023p f307c;

    /* JADX INFO: renamed from: d */
    private C0023p f308d;

    /* JADX INFO: renamed from: e */
    private C0023p f309e;

    /* JADX INFO: renamed from: f */
    private C0023p f310f;

    /* JADX INFO: renamed from: g */
    private C0023p f311g;

    /* JADX INFO: renamed from: h */
    private C0023p f312h;

    /* JADX INFO: renamed from: i */
    private C0023p f313i;

    /* JADX INFO: renamed from: j */
    private C0023p f314j;

    /* JADX INFO: renamed from: k */
    private C0023p f315k;

    /* JADX INFO: renamed from: l */
    private C0023p f316l;

    /* JADX INFO: renamed from: m */
    private C0023p f317m;

    /* JADX INFO: renamed from: n */
    private C0023p f318n;

    /* JADX INFO: renamed from: b */
    private boolean f300b = false;

    /* JADX INFO: renamed from: c */
    private boolean f301c = false;

    /* JADX INFO: renamed from: d */
    private boolean f302d = false;

    /* JADX INFO: renamed from: e */
    private boolean f304e = false;

    /* JADX INFO: renamed from: b */
    private Vector f294b = new Vector();

    public C0030w(int i, short s) {
        if (((AbstractC0041i) this).f464a == null) {
            short sM190a = (short) (m190a() + 8 + 88 + 3);
            ((AbstractC0041i) this).f464a = new C0035c((short) 16, sM190a, (short) (RunnableC0037e.f360a.getWidth() - 32), (short) (((RunnableC0037e.f360a.getHeight() - sM190a) - C0025r.m274a()) - 2), true, false);
        } else {
            ((AbstractC0041i) this).f464a.m408c();
        }
        this.f286a = i;
        this.f287a = new String[][]{null, null};
        this.f288a = new byte[][]{new byte[]{1, -1}, new byte[]{10, -10}};
        this.f289a = new short[]{0, 0};
        this.f290a = new byte[]{1, 1};
        this.f291b = new short[]{0, 0};
        this.f296c = new short[]{-1, -1};
        this.f292a = new boolean[][]{new boolean[]{true, true}, new boolean[]{true, true}};
        this.f293a = new AbstractC0003c[][]{null, null};
        this.f297a = (byte) -1;
        this.f298l = (short) -1;
        this.f295b = (byte) -1;
        ((AbstractC0041i) this).f456a = new C0025r();
        ((AbstractC0041i) this).f456a.m283a(false, (byte) 55, C0025r.m272a((byte) 55));
        this.f307c = new C0023p((byte) 83, s);
        ((AbstractC0041i) this).f456a.m282a(false, this.f307c);
        if (m333a((byte) 1)) {
            this.f309e = new C0023p((byte) 78);
            this.f309e.m268a((short) 191);
            this.f309e.m263b(true);
            ((AbstractC0041i) this).f456a.m282a(false, this.f309e);
        }
        if (m333a((byte) 2)) {
            this.f310f = new C0023p((byte) 77);
            ((AbstractC0041i) this).f456a.m282a(false, this.f310f);
        }
        if (m333a((byte) 4)) {
            ((AbstractC0041i) this).f456a.m282a(false, new C0023p((byte) 49));
            this.f311g = new C0023p((byte) 70);
            ((AbstractC0041i) this).f456a.m281a((byte) 0, this.f311g);
            this.f312h = new C0023p((byte) 66);
            ((AbstractC0041i) this).f456a.m281a((byte) 0, this.f312h);
            this.f313i = new C0023p((byte) 68);
            ((AbstractC0041i) this).f456a.m281a((byte) 0, this.f313i);
            this.f314j = new C0023p((byte) 67);
            ((AbstractC0041i) this).f456a.m281a((byte) 0, this.f314j);
            this.f315k = new C0023p((byte) 90);
            ((AbstractC0041i) this).f456a.m281a((byte) 0, this.f315k);
            this.f316l = new C0023p((byte) 69);
            ((AbstractC0041i) this).f456a.m281a((byte) 0, this.f316l);
        }
        if (m333a((byte) 8)) {
            this.f317m = new C0023p((byte) 98);
            this.f317m.m268a((short) 238);
            ((AbstractC0041i) this).f456a.m282a(false, this.f317m);
        }
        if (m333a((byte) 32)) {
            this.f318n = new C0023p((byte) 48);
            this.f318n.m268a((short) (175 + (m336d() - 1)));
            ((AbstractC0041i) this).f456a.m282a(false, this.f318n);
        }
        this.f306b = new C0023p((byte) 95);
        ((AbstractC0041i) this).f456a.m282a(false, this.f306b);
        this.f305a = new C0023p((byte) 102);
        ((AbstractC0041i) this).f456a.m282a(false, this.f305a);
        this.f308d = new C0023p((byte) 81, C0025r.m272a((byte) 81));
        this.f308d.m268a((short) 7);
        this.f308d.m261a(false);
        ((AbstractC0041i) this).f456a.m282a(true, this.f308d);
        if (m336d() == 2) {
            C0006f.m146a();
        }
        ((AbstractC0012e) this).f170a = false;
    }

    /* JADX INFO: renamed from: a */
    public static byte m332a(byte b) {
        byte b2 = 0;
        short s = 1;
        while (true) {
            short s2 = s;
            if (s2 >= 129) {
                return b2;
            }
            if ((b & s2) != 0) {
                b2 = (byte) (b2 + 1);
            }
            s = (short) (s2 << 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m333a(byte b) {
        return (this.f286a & b) > 0;
    }

    /* JADX INFO: renamed from: a */
    private boolean m334a(byte b, byte b2) {
        return ((b2 == 0 ? mo230b() : m335c()) & b) == b;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: b */
    public final byte mo230b() {
        return (byte) (255 & (this.f286a >> 16));
    }

    /* JADX INFO: renamed from: c */
    public final byte m335c() {
        return (byte) (255 & (this.f286a >> 8));
    }

    /* JADX INFO: renamed from: d */
    public final byte m336d() {
        return (byte) (3 & (this.f286a >> 30));
    }

    /* JADX INFO: renamed from: a */
    public final void m337a(int i, byte b, byte b2) {
        this.f288a[i][0] = b;
        this.f288a[i][1] = b2;
    }

    /* JADX INFO: renamed from: a */
    public final void m338a(int i, boolean z, boolean z2) {
        this.f292a[i][0] = z;
        this.f292a[i][0] = z2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m339b() {
        return (this.f286a & 134217728) > 0;
    }

    /* JADX INFO: renamed from: a */
    private short m340a(byte b) {
        if (b == 0 && m339b()) {
            switch (m336d()) {
                case 1:
                    return (short) 5;
                case 2:
                    return (short) 30;
            }
        }
        if (this.f291b == null || b < 0 || b >= this.f291b.length) {
            return (short) 0;
        }
        return this.f291b[b];
    }

    /* JADX INFO: renamed from: b */
    private boolean m341b(byte b) {
        if (b == 0) {
            return (this.f286a & 268435456) > 0;
        }
        return b == 1 && (this.f286a & 536870912) > 0;
    }

    /* JADX INFO: renamed from: a */
    short m342a(byte b, boolean z) {
        short length = 0;
        if (b == 0 && m339b()) {
            switch (m336d()) {
                case 1:
                    length = 5;
                    break;
                case 2:
                    length = 30;
                    break;
            }
        } else {
            if (this.f293a == null || b < 0 || b >= this.f293a.length || this.f293a[b] == null) {
                return (short) 0;
            }
            length = (short) this.f293a[b].length;
        }
        if (z) {
            return length;
        }
        short s = 0;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= length) {
                return s;
            }
            if (m343a(m344a(b, s3))) {
                s = (short) (s + 1);
            }
            s2 = (short) (s3 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m343a(AbstractC0003c abstractC0003c) {
        if (abstractC0003c != null && abstractC0003c.mo84a(this.f295b) && abstractC0003c.m85c()) {
            return !this.f302d || abstractC0003c.m58b();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    AbstractC0003c m344a(byte b, short s) {
        if (s < 0 || s >= m342a(b, true)) {
            return null;
        }
        if (b == 0 && m339b()) {
            switch (m336d()) {
                case 1:
                    return C0005e.f76a.m92a()[s];
                case 2:
                    return C0005e.f76a.m94a((byte) -1)[s];
            }
        }
        if ((this.f293a == null || b < 0 || b >= this.f293a.length) && s >= this.f293a[b].length) {
            return null;
        }
        return this.f293a[b][s];
    }

    /* JADX INFO: renamed from: a */
    private short m345a(byte b, short s) {
        short sM342a = m342a(b, true);
        if (sM342a >= 0 && s + 1 >= sM342a) {
            return (short) -1;
        }
        do {
            short s2 = (short) (s + 1);
            s = s2;
            if (s2 >= sM342a) {
                break;
            }
        } while (!m343a(m344a(b, s)));
        if (s >= sM342a) {
            return (short) -1;
        }
        return s;
    }

    /* JADX INFO: renamed from: b */
    private short m346b(byte b, short s) {
        do {
            short s2 = (short) (s - 1);
            s = s2;
            if (s2 <= -1) {
                break;
            }
        } while (!m343a(m344a(b, s)));
        return s;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
        this.f308d.m261a(false);
        if (this.f318n != null) {
            this.f318n.m261a(this.f297a == 1);
        }
        boolean zM341b = m341b(this.f297a);
        AbstractC0003c abstractC0003cM344a = m344a(this.f297a, this.f298l);
        if (this.f310f != null) {
            boolean zM360a = zM341b && m343a(abstractC0003cM344a);
            if (m334a((byte) 8, this.f297a)) {
                zM360a &= m360a(this.f297a, this.f298l);
            }
            this.f310f.m263b(zM360a);
        }
        if (this.f309e != null) {
            this.f309e.m263b(m342a((byte) 1, true) > 0);
        }
        this.f307c.m263b(m356g());
        if (zM341b && abstractC0003cM344a != null) {
            if (abstractC0003cM344a.m58b() || !m334a((byte) 8, this.f297a)) {
                this.f308d.m261a(true);
                if (this.f310f != null) {
                    this.f310f.m263b(m341b(this.f297a));
                }
            }
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final synchronized void mo202a(int i) {
        int gameAction = RunnableC0037e.f360a.getGameAction(i);
        if (this.f300b) {
            switch (gameAction) {
                case 1:
                    m349a((int) this.f288a[0][0], true, this.f298l);
                    break;
                case 2:
                    m349a((int) this.f288a[1][1], true, this.f298l);
                    break;
                case 5:
                    m349a((int) this.f288a[1][0], true, this.f298l);
                    break;
                case 6:
                    m349a((int) this.f288a[0][1], true, this.f298l);
                    break;
            }
        }
        switch (gameAction) {
            case 1:
                m347a(true);
                break;
            case 2:
                m348d(false);
                break;
            case 5:
                m348d(true);
                break;
            case 6:
                m347a(false);
                break;
        }
        this.f301c = false;
    }

    /* JADX INFO: renamed from: a */
    void m347a(boolean z) {
        byte b = this.f297a;
        byte b2 = z ? (byte) (b - 1) : (byte) (b + 1);
        if (m342a(b2, false) <= 0) {
            return;
        }
        this.f297a = b2;
        short s = this.f296c[this.f297a];
        short sM342a = m342a(this.f297a, true);
        byte b3 = 0;
        short sM345a = this.f296c[this.f297a];
        while (true) {
            short s2 = sM345a;
            if (s2 >= sM342a || s2 < 0) {
                break;
            }
            if (m343a(m344a(this.f297a, s2))) {
                s = s2;
                if (b3 == this.f299c) {
                    break;
                } else {
                    b3 = (byte) (b3 + 1);
                }
            }
            sM345a = m345a(this.f297a, s2);
        }
        this.f298l = s;
    }

    /* JADX INFO: renamed from: d */
    protected final void m348d(boolean z) {
        short sM345a = z ? m345a(this.f297a, this.f298l) : m346b(this.f297a, this.f298l);
        if (sM345a < 0) {
            return;
        }
        this.f298l = sM345a;
        if (this.f296c[this.f297a] > this.f298l) {
            this.f296c[this.f297a] = this.f298l;
        }
        short s = 0;
        short s2 = this.f298l;
        byte bM201a = m201a(false);
        short sM346b = this.f298l;
        while (true) {
            short s3 = sM346b;
            if (s3 < 0) {
                break;
            }
            s2 = s3;
            short s4 = (short) (s + 1);
            s = s4;
            if (s4 == bM201a || s3 == this.f296c[this.f297a]) {
                break;
            } else {
                sM346b = m346b(this.f297a, s3);
            }
        }
        if (s2 != this.f296c[this.f297a]) {
            this.f296c[this.f297a] = s2;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m349a(int i, boolean z, short s) {
        m350a(i, z, this.f297a, s);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0323  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX INFO: renamed from: a */
    private void m350a(int i, boolean z, byte b, short s) {
        int iMin;
        boolean z2;
        short s2;
        int iMin2;
        AbstractC0003c abstractC0003cM344a = m344a(b, s);
        if (abstractC0003cM344a == null) {
            return;
        }
        if (i < 0) {
            abstractC0003cM344a.m65a(i, this.f292a[b][0], this.f292a[b][1]);
            return;
        }
        byte b2 = 0;
        if (m334a((byte) 1, b)) {
            short s3 = s;
            AbstractC0003c abstractC0003cM344a2 = m344a(b, s3 == true ? (short) 1 : (short) 0);
            if (abstractC0003cM344a2 == null) {
                iMin2 = 0;
            } else {
                long jM71a = 0;
                short sM342a = m342a((byte) 0, true);
                byte b3 = (byte) ((this.f289a[0] >> 8) - 1);
                short s4 = 0;
                while (true) {
                    short s5 = s4;
                    if (s5 >= sM342a) {
                        break;
                    }
                    AbstractC0003c abstractC0003cM344a3 = m344a((byte) 0, s5);
                    if (abstractC0003cM344a3 != null && abstractC0003cM344a3.mo23b() > 0) {
                        s3 = b3;
                        jM71a += (long) (this.f290a[0] * abstractC0003cM344a3.m71a(s3 == true ? (byte) 1 : (byte) 0) * abstractC0003cM344a3.mo23b());
                    }
                    s4 = (short) (s5 + 1);
                }
                short sM342a2 = m342a((byte) 1, true);
                byte b4 = (byte) ((this.f289a[1] >> 8) - 1);
                short s6 = 0;
                while (true) {
                    short s7 = s6;
                    if (s7 >= sM342a2) {
                        break;
                    }
                    AbstractC0003c abstractC0003cM344a4 = m344a((byte) 1, s7);
                    if (abstractC0003cM344a4 != null && abstractC0003cM344a4.mo23b() > 0) {
                        s3 = b4;
                        jM71a += (long) (this.f290a[1] * abstractC0003cM344a4.m71a(s3 == true ? (byte) 1 : (byte) 0) * abstractC0003cM344a4.mo23b());
                    }
                    s6 = (short) (s7 + 1);
                }
                long jM107a = C0005e.f76a.m107a(((AbstractC0012e) this).f170a) - jM71a;
                ?? r3 = s3 == true ? 1 : 0;
                iMin2 = (int) Math.min(i, jM107a / ((long) abstractC0003cM344a2.m71a((byte) ((this.f289a[this.f297a] >> 8) - 1))));
            }
            i = iMin2;
            if (iMin2 <= 0) {
                if (z) {
                    if (((AbstractC0012e) this).f170a) {
                        Main2.m11a();
                        return;
                    } else {
                        if (RunnableC0037e.f360a.m463e()) {
                            return;
                        }
                        RunnableC0037e.m427a(C0066a.m773a(105), this.f287a[b][0]);
                        return;
                    }
                }
                return;
            }
            b2 = 1;
        }
        if (m334a((byte) 2, b)) {
            AbstractC0003c abstractC0003cM344a5 = m344a(b, s);
            if (abstractC0003cM344a5 == null) {
                z2 = false;
            } else if (abstractC0003cM344a5.mo23b() > 0) {
                z2 = true;
            } else {
                byte b5 = (byte) (this.f297a == 0 ? 1 : 0);
                if (m340a(b5) == -1) {
                    z2 = true;
                } else {
                    short sM342a3 = m342a(b5, true);
                    short sM342a4 = m342a(b5, true);
                    if (sM342a4 < 0) {
                        s2 = -1;
                    } else {
                        short s8 = 0;
                        short s9 = 0;
                        while (true) {
                            short s10 = s9;
                            if (s10 >= sM342a4) {
                                break;
                            }
                            if (m344a(b5, s10) != null) {
                                s8 = (short) (s8 + 1);
                            }
                            s9 = (short) (s10 + 1);
                        }
                        s2 = s8;
                    }
                    short s11 = s2;
                    if (sM342a3 > 0) {
                        short s12 = 0;
                        while (true) {
                            short s13 = s12;
                            if (s13 < sM342a3) {
                                AbstractC0003c abstractC0003cM344a6 = m344a(b5, s13);
                                if (abstractC0003cM344a6 == null || !abstractC0003cM344a5.mo50a(abstractC0003cM344a6) || abstractC0003cM344a6.mo23b() == abstractC0003cM344a6.mo24c()) {
                                    if (abstractC0003cM344a6 != null && abstractC0003cM344a6.mo23b() == abstractC0003cM344a6.mo24c()) {
                                        s11 = (short) (s11 - 1);
                                    }
                                    s12 = (short) (s13 + 1);
                                } else {
                                    z2 = true;
                                }
                            }
                        }
                    } else {
                        s11 = 0;
                    }
                    if (m340a(b5) > 0) {
                        sM342a3 = m340a(b5);
                    }
                    short sM342a5 = m342a(this.f297a, true);
                    short s14 = 0;
                    while (true) {
                        short s15 = s14;
                        if (s15 >= sM342a5) {
                            break;
                        }
                        AbstractC0003c abstractC0003cM344a7 = m344a(this.f297a, s15);
                        if (abstractC0003cM344a7 != null && abstractC0003cM344a7.mo23b() != 0) {
                            byte b6 = false;
                            short s16 = 0;
                            while (true) {
                                short s17 = s16;
                                if (s17 < s11) {
                                    AbstractC0003c abstractC0003cM344a8 = m344a(b5, s15);
                                    if (abstractC0003cM344a8 != null && abstractC0003cM344a8.mo23b() != abstractC0003cM344a8.mo24c() && abstractC0003cM344a8.mo50a(abstractC0003cM344a7)) {
                                        b6 = true;
                                        break;
                                    }
                                    s16 = (short) (s17 + 1);
                                } else {
                                    break;
                                }
                            }
                            if (b6 == false) {
                                s11 = (short) (s11 + 1);
                            }
                        }
                        s14 = (short) (s15 + 1);
                    }
                    if (s11 < sM342a3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            if (!z2) {
                if (!z || RunnableC0037e.f360a.m463e()) {
                    return;
                }
                RunnableC0037e.m427a(C0066a.m773a(105), this.f287a[b][b2]);
                return;
            }
            b2 = (byte) (b2 + 1);
        }
        if (m334a((byte) 4, b)) {
            int i2 = i;
            AbstractC0003c abstractC0003cM344a9 = m344a(b, s);
            if (abstractC0003cM344a9 == null) {
                iMin = 0;
            } else {
                int iMo23b = 0;
                byte b7 = 0;
                while (true) {
                    byte b8 = b7;
                    if (b8 >= 5) {
                        break;
                    }
                    C0001a c0001a = C0005e.f76a.m92a()[b8];
                    if (c0001a != null) {
                        iMo23b += (c0001a.mo24c() - c0001a.mo23b()) * c0001a.mo57b();
                    }
                    b7 = (byte) (b8 + 1);
                }
                short sM342a6 = m342a((byte) 1, true);
                byte b9 = 0;
                while (true) {
                    byte b10 = b9;
                    if (b10 >= sM342a6) {
                        break;
                    }
                    AbstractC0003c abstractC0003cM344a10 = m344a((byte) 1, b10);
                    if (abstractC0003cM344a10 != null) {
                        iMo23b += abstractC0003cM344a10.mo23b() * abstractC0003cM344a10.mo57b();
                    }
                    b9 = (byte) (b10 + 1);
                }
                iMin = Math.min(i2, ((C0005e.f76a.m104a(C0005e.f76a.f95b, (byte) 14, 0) * 100) - iMo23b) / abstractC0003cM344a9.mo57b());
            }
            i = iMin;
            if (iMin <= 0) {
                if (!z || RunnableC0037e.f360a.m463e()) {
                    return;
                }
                RunnableC0037e.m427a(C0066a.m773a(105), this.f287a[b][b2]);
                return;
            }
            b2 = (byte) (b2 + 1);
        }
        if (!m334a((byte) 8, b) || m360a(b, s)) {
            if (i > 0) {
                abstractC0003cM344a.m65a(i, this.f292a[b][0], this.f292a[b][1]);
            }
        } else {
            if (!z || RunnableC0037e.f360a.m463e()) {
                return;
            }
            RunnableC0037e.m427a(C0066a.m773a(105), this.f287a[b][b2]);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m351a(byte b) {
        if (b == -1 || this.f295b == -1) {
            this.f295b = b;
        } else if ((this.f295b & b) > 0) {
            this.f295b = (byte) (this.f295b & (b ^ (-1)));
        } else {
            this.f295b = (byte) (this.f295b | b);
        }
        m358p();
    }

    /* JADX INFO: renamed from: a */
    private boolean m352a(C0058g c0058g, byte b) {
        short sM342a;
        if (c0058g == null || (sM342a = m342a(b, true)) < 0) {
            return false;
        }
        boolean z = false;
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= sM342a) {
                return z;
            }
            AbstractC0003c abstractC0003cM344a = m344a(b, s2);
            if (abstractC0003cM344a != null && abstractC0003cM344a.mo23b() > 0) {
                try {
                    c0058g.m670a(abstractC0003cM344a.m68e());
                    c0058g.m670a(abstractC0003cM344a.mo23b());
                    z = true;
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("addToOrderRequest").append(e.toString()).toString());
                }
            }
            s = (short) (s2 + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m353b(byte b) {
        short sM342a = m342a(b, true);
        if (sM342a < 0) {
            return;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= sM342a) {
                return;
            }
            AbstractC0003c abstractC0003cM344a = m344a(b, s2);
            if (abstractC0003cM344a != null && abstractC0003cM344a.mo23b() > 0) {
                abstractC0003cM344a.m61d(0);
            }
            s = (short) (s2 + 1);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m354n() {
        if (this.f303a != null && this.f303a.size() > 0) {
            try {
                C0058g c0058g = new C0058g(C0059h.f576a[83], (short) 200, (short) 0);
                for (short s = 0; s < this.f303a.size(); s = (short) (s + 1)) {
                    c0058g.m670a(((AbstractC0003c) this.f303a.elementAt(s)).m68e());
                }
                C0063c.f597a.m749a(c0058g);
            } catch (Exception unused) {
            }
        }
        this.f303a = null;
    }

    /* JADX INFO: renamed from: o */
    private void m355o() {
        if (this.f300b) {
            this.f308d.m268a((short) 7);
        } else {
            this.f308d.m268a((short) 106);
        }
        this.f300b = !this.f300b;
    }

    /* JADX INFO: renamed from: g */
    private boolean m356g() {
        short sM342a = m342a((byte) 0, true);
        if (sM342a > 0) {
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= sM342a) {
                    break;
                }
                AbstractC0003c abstractC0003cM344a = m344a((byte) 0, s2);
                if (abstractC0003cM344a != null && abstractC0003cM344a.mo23b() > 0) {
                    return true;
                }
                s = (short) (s2 + 1);
            }
        }
        short sM342a2 = m342a((byte) 1, true);
        if (sM342a2 <= 0) {
            return false;
        }
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= sM342a2) {
                return false;
            }
            AbstractC0003c abstractC0003cM344a2 = m344a((byte) 1, s4);
            if (abstractC0003cM344a2 != null && abstractC0003cM344a2.mo23b() > 0) {
                return true;
            }
            s3 = (short) (s4 + 1);
        }
    }

    /* JADX INFO: renamed from: d */
    protected final void m357d() {
        m354n();
        m353b((byte) 0);
        m353b((byte) 1);
        C0063c.f597a.m749a(new C0058g(C0059h.f576a[15]));
        RunnableC0037e.f360a.m443f();
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch (c0023p.m265a()) {
            case 48:
                RunnableC0037e.m431a(C0066a.m777b(135), C0066a.m777b((short) ((246 + m336d()) - 1)), "", new C0027t(this));
                return true;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 79:
            case 80:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            default:
                return super.mo170a(c0023p);
            case 55:
                if (m356g()) {
                    RunnableC0037e.m431a(C0066a.m773a(135), C0066a.m773a(192), "", new C0029v(this));
                    return true;
                }
                m357d();
                return true;
            case 66:
                m351a((byte) 1);
                return true;
            case 67:
                m351a((byte) 4);
                return true;
            case 68:
                m351a((byte) 2);
                return true;
            case 69:
                m351a((byte) 16);
                return true;
            case 70:
                m351a((byte) -1);
                return true;
            case 77:
                if (m344a(this.f297a, this.f298l) == null) {
                    return true;
                }
                m349a(Integer.MAX_VALUE, false, this.f298l);
                return true;
            case 78:
                short sM342a = m342a((byte) 1, true);
                if (sM342a <= 0) {
                    return true;
                }
                short sM345a = 0;
                while (true) {
                    short s = sM345a;
                    if (s >= sM342a || s < 0 || m344a((byte) 1, s) == null) {
                        return true;
                    }
                    m350a(Integer.MAX_VALUE, false, (byte) 1, s);
                    sM345a = m345a((byte) 1, s);
                }
                break;
            case 81:
                m355o();
                return true;
            case 83:
                C0058g c0058g = new C0058g(C0059h.f576a[25], (short) 200, (short) 0);
                switch (m336d()) {
                    case 1:
                        c0058g.m668a(C0059h.f576a[17]);
                        break;
                    case 2:
                        c0058g.m668a(C0059h.f576a[16]);
                        break;
                }
                boolean zM352a = m352a(c0058g, (byte) 0);
                boolean zM352a2 = m352a(c0058g, (byte) 1);
                m354n();
                if (zM352a || zM352a2) {
                    C0063c.f597a.m749a(c0058g);
                }
                m357d();
                return true;
            case 90:
                m351a((byte) 8);
                return true;
            case 98:
                if (this.f302d) {
                    this.f317m.m268a((short) 238);
                } else {
                    this.f317m.m268a((short) 239);
                }
                this.f302d = !this.f302d;
                m358p();
                return true;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m358p() {
        this.f296c[0] = m345a((byte) 0, (short) -1);
        this.f296c[1] = m345a((byte) 1, (short) -1);
        this.f298l = this.f296c[this.f297a];
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e
    /* JADX INFO: renamed from: a */
    protected final int mo191a() {
        return 15;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final synchronized void mo169a(Graphics graphics) {
        super.mo169a(graphics);
        mo168a();
        short sM190a = (short) (m190a() + 5);
        this.f294b.removeAllElements();
        m359a(graphics, (short) (sM190a - 2), (byte) 0);
        m359a(graphics, (short) (sM190a + 44), (byte) 1);
        ((AbstractC0041i) this).f456a.m291a(graphics);
    }

    /* JADX INFO: renamed from: a */
    private void m359a(Graphics graphics, short s, byte b) {
        byte bM201a = m201a(false);
        short width = (short) ((RunnableC0037e.f360a.getWidth() - (bM201a * 41)) / 2);
        byte b2 = (byte) (8 - b);
        if (this.f296c[b] < 0) {
            this.f296c[b] = m345a(b, (short) -1);
        }
        short sM345a = this.f296c[b];
        if (m346b(b, this.f296c[b]) >= 0) {
            RunnableC0037e.m468a(graphics, C0050b.m638a(AbstractC0012e.f144f), 0, 0, RunnableC0037e.m476a(C0050b.m638a(AbstractC0012e.f144f)), RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f144f)), 0, width - 2, s + 17, 3);
        }
        short s2 = sM345a;
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= bM201a) {
                break;
            }
            RunnableC0037e.m468a(graphics, C0050b.m638a(AbstractC0012e.f139c), 0, 0, RunnableC0037e.m476a(C0050b.m638a(AbstractC0012e.f139c)), RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f139c)), 0, width, s, 0);
            AbstractC0003c abstractC0003cM344a = m344a(b, sM345a);
            if (abstractC0003cM344a != null) {
                if (this.f297a < 0) {
                    this.f297a = b;
                }
                if (this.f298l < 0) {
                    this.f298l = sM345a;
                }
                this.f294b.addElement(new C0014g(width, s, 41, 35, b, sM345a));
                if (this.f297a == b && this.f298l == sM345a) {
                    this.f299c = b4;
                    short s3 = 1;
                    if (this.f300b) {
                        s3 = 1025;
                    }
                    abstractC0003cM344a.mo52a(graphics, width, s, (short) (this.f289a[b] | s3));
                    if (!this.f301c) {
                        ((AbstractC0041i) this).f464a.m408c();
                        abstractC0003cM344a.mo48a(((AbstractC0041i) this).f464a, (String) null, this.f289a[b]);
                        this.f301c = true;
                    }
                    if (((AbstractC0041i) this).f464a != null) {
                        ((AbstractC0041i) this).f464a.m395a(graphics, (byte) 0);
                    }
                } else {
                    abstractC0003cM344a.mo52a(graphics, width, s, this.f289a[b]);
                }
            } else {
                RunnableC0037e.m469a(graphics, AbstractC0012e.f148h, C0050b.f548a[0], C0050b.f548a[1], b2, 0, width, s);
            }
            if (sM345a >= 0) {
                s2 = sM345a;
                sM345a = m345a(b, sM345a);
            }
            width = (short) (width + 41);
            b3 = (byte) (b4 + 1);
        }
        if (m345a(b, s2) > 0) {
            RunnableC0037e.m468a(graphics, C0050b.m638a(AbstractC0012e.f145g), 0, 0, RunnableC0037e.m476a(C0050b.m638a(AbstractC0012e.f145g)), RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f145g)), 0, width + 2, s + 17, 3);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m360a(byte b, short s) {
        AbstractC0003c abstractC0003cM344a = m344a(b, s);
        if (abstractC0003cM344a == null) {
            return false;
        }
        return abstractC0003cM344a.m58b();
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: c */
    public final void mo223c() {
        super.mo223c();
        mo168a();
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        this.f304e = false;
        return false;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: b */
    protected final boolean mo180b(int i, int i2, int i3) {
        C0014g c0014g = null;
        for (int i4 = 0; i4 < this.f294b.size() && c0014g == null; i4++) {
            C0014g c0014g2 = (C0014g) this.f294b.elementAt(i4);
            if (c0014g2.m218a(i, i2)) {
                c0014g = c0014g2;
            }
        }
        if (c0014g == null || this.f297a != c0014g.f193a || this.f298l != c0014g.f194a) {
            return false;
        }
        if (!this.f300b) {
            m355o();
        }
        byte bM219a = c0014g.m219a(i, i2);
        if (2 == bM219a) {
            if (i3 > 300) {
                m349a(this.f288a[0][0] * AbstractC0012e.m181a(i3, 300), true, this.f298l);
            } else if (!this.f304e) {
                m349a(1, true, this.f298l);
            }
            this.f304e = true;
            return true;
        }
        if (3 != bM219a) {
            return true;
        }
        if (i3 > 300) {
            m349a(this.f288a[0][1] * AbstractC0012e.m181a(i3, 300), true, this.f298l);
        } else if (!this.f304e) {
            m349a(-1, true, this.f298l);
        }
        this.f304e = true;
        return true;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        C0014g c0014g = null;
        for (int i4 = 0; i4 < this.f294b.size() && c0014g == null; i4++) {
            C0014g c0014g2 = (C0014g) this.f294b.elementAt(i4);
            if (c0014g2.m218a(i, i2)) {
                c0014g = c0014g2;
            }
        }
        if (c0014g == null) {
            return false;
        }
        if (this.f297a == c0014g.f193a && this.f298l == c0014g.f194a) {
            if (!this.f300b) {
                m355o();
            }
            byte bM219a = c0014g.m219a(i, i2);
            if (2 == bM219a) {
                if (this.f304e && i3 < 300) {
                    return true;
                }
                m349a(this.f288a[0][0] * AbstractC0012e.m181a(i3, 300), true, this.f298l);
                return true;
            }
            if (3 != bM219a) {
                return true;
            }
            if (this.f304e && i3 < 300) {
                return true;
            }
            m349a(this.f288a[0][1] * AbstractC0012e.m181a(i3, 300), true, this.f298l);
            return true;
        }
        if (this.f300b) {
            m355o();
        }
        this.f297a = c0014g.f193a;
        this.f298l = c0014g.f194a;
        byte bM201a = m201a(false);
        short s = (short) (this.f298l - (bM201a / 2));
        int length = 0;
        if (this.f297a == 0 && m339b()) {
            switch (m336d()) {
                case 1:
                case 2:
                    length = C0005e.f76a.m94a((byte) -1).length;
                    break;
            }
        } else {
            length = this.f293a[this.f297a].length;
        }
        if (s <= 0) {
            this.f296c[this.f297a] = 0;
        } else if (s + bM201a < length) {
            this.f296c[this.f297a] = s;
        } else {
            this.f296c[this.f297a] = (short) (length - bM201a);
        }
        this.f301c = false;
        return true;
    }
}
