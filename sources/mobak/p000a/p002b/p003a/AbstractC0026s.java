package mobak.p000a.p002b.p003a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0034b;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;

/* JADX INFO: renamed from: mobak.a.b.a.s */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/s.class */
public abstract class AbstractC0026s extends AbstractC0012e {

    /* JADX INFO: renamed from: b */
    public static boolean f269b = false;

    /* JADX INFO: renamed from: a */
    protected byte f270a;

    /* JADX INFO: renamed from: a */
    byte[] f271a = {0, 0};

    /* JADX INFO: renamed from: a */
    protected short[] f272a = {0, 0};

    /* JADX INFO: renamed from: b */
    protected byte f273b = -1;

    /* JADX INFO: renamed from: c */
    protected byte f274c = -1;

    /* JADX INFO: renamed from: c */
    protected boolean f275c = false;

    /* JADX INFO: renamed from: d */
    private boolean f276d = false;

    /* JADX INFO: renamed from: a */
    private Vector f277a = new Vector();

    /* JADX INFO: renamed from: a */
    public static final boolean m321a(short s) {
        switch (s) {
            case -5:
            case -2:
            case -1:
            case 4:
            case 8:
            case 32:
            case 64:
                return true;
            default:
                return false;
        }
    }

    AbstractC0026s(short s) {
        this.f463k = s;
        if (s == -7 || s == -11) {
            return;
        }
        RunnableC0037e.f367a = null;
    }

    /* JADX INFO: renamed from: a */
    private void m322a(Graphics graphics, AbstractC0003c[] abstractC0003cArr, short s, byte b, short s2, short s3, short s4) {
        int i;
        if (graphics == null) {
            return;
        }
        this.f277a.removeAllElements();
        short s5 = s3;
        byte b2 = b;
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= this.f270a) {
                if (abstractC0003cArr != null) {
                    if (b > 0) {
                        RunnableC0037e.m468a(graphics, C0050b.m638a(AbstractC0012e.f142d), 0, 0, RunnableC0037e.m476a(C0050b.m638a(AbstractC0012e.f142d)), RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f142d)), 0, s2 + 20, s3 - 3, 3);
                    }
                    if (b + this.f270a < abstractC0003cArr.length && this.f463k != -5) {
                        RunnableC0037e.m468a(graphics, C0050b.m638a(AbstractC0012e.f143e), 0, 0, RunnableC0037e.m476a(C0050b.m638a(AbstractC0012e.f143e)), RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f143e)), 0, s2 + 20, s3 + (44 * this.f270a) + 3, 3);
                    }
                    if (this.f463k == -5 && b + this.f270a < 10) {
                        RunnableC0037e.m468a(graphics, C0050b.m638a(AbstractC0012e.f143e), 0, 0, RunnableC0037e.m476a(C0050b.m638a(AbstractC0012e.f143e)), RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f143e)), 0, s2 + 20, s3 + (37 * this.f270a) + 3, 3);
                    }
                    if (this.f463k != -5) {
                        this.f277a.addElement(new C0014g(s2, s3, 41, 35, (byte) 0, (short) 0));
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f463k == -5) {
                switch (b2) {
                    case 0:
                        i = 5;
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 6:
                        i = 3;
                        break;
                    case 7:
                        i = 1;
                        break;
                    case 8:
                        i = 0;
                        break;
                    case 9:
                        i = 6;
                        break;
                    default:
                        i = -1;
                        break;
                }
                int i2 = i;
                if (i >= 0 && i2 <= 6 && (abstractC0003cArr == null || abstractC0003cArr.length <= b2 || abstractC0003cArr[b2] == null)) {
                    RunnableC0037e.m469a(graphics, s4 == b2 ? AbstractC0012e.f150j : AbstractC0012e.f148h, C0050b.f548a[0], C0050b.f548a[1], i2, 0, s2 + ((41 - (RunnableC0037e.m473a(AbstractC0012e.f148h) / C0050b.f548a[0])) / 2) + 1, s5 + 1);
                }
                if (abstractC0003cArr != null && abstractC0003cArr.length > b && b2 < abstractC0003cArr.length && abstractC0003cArr[b2] != null) {
                    short s6 = s;
                    if (s4 == b2) {
                        s6 = (short) (s | (this.f275c ? (short) 1024 : (short) 1));
                    }
                    abstractC0003cArr[b2].mo52a(graphics, s2, s5, s6);
                }
                this.f277a.addElement(new C0014g(s2, s5, 41, 35, (byte) 0, b2));
            } else if (abstractC0003cArr == null || abstractC0003cArr.length <= b || b2 >= abstractC0003cArr.length || abstractC0003cArr[b2] == null) {
                AbstractC0012e.m184a(graphics, (int) s2, (int) s5, 0);
            } else {
                short s7 = s;
                if (s4 == b2) {
                    s7 = (short) (s | (this.f275c ? (short) 1024 : (short) 1));
                }
                abstractC0003cArr[b2].mo52a(graphics, s2, s5, s7);
                this.f277a.addElement(new C0014g(s2, s5, 41, 35, (byte) 0, b2));
            }
            b2 = (byte) (b2 + 1);
            s5 = (short) (s5 + 37);
            b3 = (byte) (b4 + 1);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected void mo202a(int i) {
        AbstractC0003c abstractC0003cMo176a = mo176a();
        int gameAction = RunnableC0037e.f360a.getGameAction(i);
        if (!this.f275c) {
            if (this.f463k <= 0) {
                switch (gameAction) {
                    case 1:
                        mo174a(false);
                        break;
                    case 6:
                        mo174a(true);
                        break;
                }
            } else {
                switch (gameAction) {
                    case 1:
                        m323d(true);
                        break;
                    case 2:
                        mo174a(false);
                        break;
                    case 5:
                        mo174a(true);
                        break;
                    case 6:
                        m323d(false);
                        break;
                }
            }
        } else {
            switch (gameAction) {
                case 1:
                    m328c((short) 1);
                    break;
                case 2:
                    m328c((short) -10);
                    break;
                case 5:
                    m328c((short) 10);
                    break;
                case 6:
                    m328c((short) -1);
                    break;
            }
        }
        AbstractC0003c abstractC0003cMo176a2 = mo176a();
        if (this.f463k != -5) {
            if (abstractC0003cMo176a != abstractC0003cMo176a2) {
                m546j();
            }
            if ((abstractC0003cMo176a != abstractC0003cMo176a2 || ((AbstractC0041i) this).f464a.m409a()) && abstractC0003cMo176a2 != null) {
                mo167a(abstractC0003cMo176a2, this.f272a[this.f274c]);
            }
        }
        mo168a();
    }

    /* JADX INFO: renamed from: a */
    protected void mo167a(AbstractC0003c abstractC0003c, short s) {
        abstractC0003c.mo48a(((AbstractC0041i) this).f464a, (String) null, s);
    }

    /* JADX INFO: renamed from: d */
    private void m323d(boolean z) {
        short s = this.f271a[this.f274c];
        byte b = this.f274c;
        byte b2 = z ? (byte) (b - 1) : (byte) (b + 1);
        AbstractC0003c[] abstractC0003cArrMo165a = mo165a(b2);
        if (abstractC0003cArrMo165a == null || abstractC0003cArrMo165a.length == 0) {
            return;
        }
        this.f274c = b2;
        this.f273b = (byte) (this.f271a[this.f274c] + (this.f273b - s));
        if (abstractC0003cArrMo165a == null || abstractC0003cArrMo165a.length > this.f273b) {
            return;
        }
        this.f273b = (byte) (abstractC0003cArrMo165a.length - 1);
    }

    /* JADX INFO: renamed from: a */
    protected void mo174a(boolean z) {
        AbstractC0003c[] abstractC0003cArrMo165a = mo165a(this.f274c);
        if (abstractC0003cArrMo165a != null || this.f463k == -5) {
            byte b = z ? (byte) (this.f273b + 1) : (byte) (this.f273b - 1);
            byte b2 = b;
            if (b < 0 || b2 >= abstractC0003cArrMo165a.length) {
                return;
            }
            this.f273b = b2;
            if (this.f271a[this.f274c] > this.f273b) {
                this.f271a[this.f274c] = this.f273b;
            }
            if (this.f273b - this.f271a[this.f274c] >= this.f270a) {
                this.f271a[this.f274c] = (byte) ((this.f273b - this.f270a) + 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected AbstractC0003c[] mo165a(byte b) {
        if (b >= 0 && b == 1) {
            return RunnableC0037e.f367a;
        }
        return null;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public boolean mo170a(C0023p c0023p) {
        switch (c0023p.m265a()) {
            case 55:
                return mo164a_();
            case 78:
                AbstractC0003c[] abstractC0003cArrMo165a = mo165a((byte) 0);
                if (abstractC0003cArrMo165a == null || abstractC0003cArrMo165a.length == 0) {
                    return false;
                }
                byte b = 0;
                while (true) {
                    byte b2 = b;
                    if (b2 >= abstractC0003cArrMo165a.length) {
                        return true;
                    }
                    if (abstractC0003cArrMo165a[b2] != null) {
                        abstractC0003cArrMo165a[b2].m61d(abstractC0003cArrMo165a[b2].mo24c());
                    }
                    b = (byte) (b2 + 1);
                }
                break;
            case 81:
                return mo166b();
            case 84:
                return m325g();
            case 95:
                m544i();
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m324a(C0058g c0058g, AbstractC0003c[] abstractC0003cArr) {
        if (c0058g == null || abstractC0003cArr == null || abstractC0003cArr.length == 0) {
            return false;
        }
        boolean z = false;
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= abstractC0003cArr.length) {
                return z;
            }
            if (abstractC0003cArr[s2] != null && abstractC0003cArr[s2].mo23b() > 0) {
                try {
                    c0058g.m670a(abstractC0003cArr[s2].m68e());
                    c0058g.m670a(abstractC0003cArr[s2].mo23b());
                    z = true;
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("addToOrderRequest").append(e.toString()).toString());
                }
            }
            s = (short) (s2 + 1);
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m325g() {
        try {
            m326a(mo165a((byte) 0));
            m326a(mo165a((byte) 1));
            ((AbstractC0041i) this).f456a.m301b((byte) 84);
            if (this.f275c) {
                mo166b();
            }
            if (this.f463k == 16384) {
                return true;
            }
            mo164a_();
            return true;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("sendSaveRequest ").append(e.toString()).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m326a(AbstractC0003c[] abstractC0003cArr) {
        if (abstractC0003cArr == null || abstractC0003cArr.length == 0) {
            return;
        }
        for (int i = 0; i < abstractC0003cArr.length; i++) {
            if (abstractC0003cArr[i] != null && abstractC0003cArr[i].mo23b() > 0) {
                abstractC0003cArr[i].m61d(0);
            }
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public void mo168a() {
        ((AbstractC0041i) this).f456a.m303a(true, false);
        if (this.f273b < 0 || this.f274c < 0 || mo176a() == null) {
            return;
        }
        ((AbstractC0041i) this).f456a.m288a((byte) 81, false);
    }

    /* JADX INFO: renamed from: a_ */
    protected abstract boolean mo164a_();

    /* JADX INFO: renamed from: b */
    protected final boolean m327b(short s) {
        if (this.f275c && this.f463k != -1) {
            mo166b();
        }
        System.gc();
        if (RunnableC0037e.f360a.m448b() && !C0063c.f597a.m754b()) {
            RunnableC0037e.f360a.m449b(false);
        }
        m326a((AbstractC0003c[]) C0005e.f76a.m92a());
        C0034b.m394d();
        m326a((AbstractC0003c[]) C0005e.f76a.m94a((byte) -1));
        RunnableC0037e.f360a.m443f();
        RunnableC0037e.f360a.m423a().mo223c();
        return true;
    }

    /* JADX INFO: renamed from: a */
    protected AbstractC0003c mo176a() {
        AbstractC0003c[] abstractC0003cArrMo165a;
        if (this.f274c >= 0 && (abstractC0003cArrMo165a = mo165a(this.f274c)) != null && abstractC0003cArrMo165a.length != 0 && abstractC0003cArrMo165a.length > this.f273b) {
            return abstractC0003cArrMo165a[this.f273b];
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    protected boolean mo166b() {
        if (this.f275c) {
            ((AbstractC0041i) this).f456a.m285a((short) 7, (byte) 81);
        } else {
            ((AbstractC0041i) this).f456a.m285a((short) 106, (byte) 81);
        }
        this.f275c = !this.f275c;
        return true;
    }

    /* JADX INFO: renamed from: c */
    private boolean m328c(short s) {
        AbstractC0003c abstractC0003cMo176a;
        if (!this.f275c || (abstractC0003cMo176a = mo176a()) == null) {
            return false;
        }
        if (this.f463k == 1 || (this.f463k == 4 && this.f274c == 1)) {
            abstractC0003cMo176a.m65a((int) s, false, true);
        } else {
            abstractC0003cMo176a.m64f(s);
        }
        ((AbstractC0041i) this).f456a.m302c((byte) 84);
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("screen type[").append((int) this.f463k).append("]\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: c */
    protected final void m329c(Graphics graphics) {
        AbstractC0003c abstractC0003cMo176a;
        if (graphics == null) {
            return;
        }
        super.mo169a(graphics);
        if (this.f273b < 0 && this.f273b < 0) {
            boolean z = false;
            AbstractC0003c[] abstractC0003cArrMo165a = mo165a((byte) 0);
            if (abstractC0003cArrMo165a != null && abstractC0003cArrMo165a.length > 0) {
                this.f274c = (byte) 0;
                this.f273b = (byte) 0;
                z = true;
            }
            if (z) {
                mo168a();
            }
        }
        m322a(graphics, mo165a((byte) 0), this.f272a[0], this.f271a[0], (short) 16, (short) (m190a() + 10), this.f273b);
        if (((AbstractC0041i) this).f464a.m409a() && (abstractC0003cMo176a = mo176a()) != null) {
            mo167a(abstractC0003cMo176a, this.f272a[this.f274c]);
        }
        if (((AbstractC0041i) this).f464a != null) {
            ((AbstractC0041i) this).f464a.m395a(graphics, (byte) 0);
        }
        ((AbstractC0041i) this).f456a.m291a(graphics);
    }

    /* JADX INFO: renamed from: d */
    protected final void m330d(Graphics graphics) {
        if (graphics == null) {
            return;
        }
        super.mo169a(graphics);
        if (this.f273b < 0 && this.f273b < 0) {
            boolean z = false;
            AbstractC0003c[] abstractC0003cArrMo165a = mo165a((byte) 0);
            if (abstractC0003cArrMo165a != null && abstractC0003cArrMo165a.length > 0) {
                this.f274c = (byte) 0;
                this.f273b = (byte) 0;
                z = true;
            }
            if (z) {
                mo168a();
            }
        }
        m322a(graphics, mo165a((byte) 0), this.f272a[0], this.f271a[0], (short) ((RunnableC0037e.f360a.getWidth() - 16) - 41), (short) (m190a() + 10), this.f273b);
        if (((AbstractC0041i) this).f464a != null) {
            ((AbstractC0041i) this).f464a.m395a(graphics, (byte) 0);
        }
        ((AbstractC0041i) this).f456a.m291a(graphics);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e
    /* JADX INFO: renamed from: a */
    protected int mo191a() {
        return 15;
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m331a(AbstractC0003c[] abstractC0003cArr) {
        if (f269b) {
            f269b = false;
            return true;
        }
        if (abstractC0003cArr == null) {
            return true;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= abstractC0003cArr.length) {
                return false;
            }
            if (abstractC0003cArr[s2] == null || abstractC0003cArr[s2].mo24c() == 0) {
                return true;
            }
            s = (short) (s2 + 1);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected boolean mo178a(int i, int i2) {
        this.f276d = false;
        return false;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: b */
    protected final boolean mo180b(int i, int i2, int i3) {
        C0014g c0014g = null;
        for (int i4 = 0; i4 < this.f277a.size() && c0014g == null; i4++) {
            C0014g c0014g2 = (C0014g) this.f277a.elementAt(i4);
            if (c0014g2.m218a(i, i2)) {
                c0014g = c0014g2;
            }
        }
        if (c0014g == null || this.f274c != c0014g.f193a || this.f273b != c0014g.f194a) {
            return false;
        }
        if (!this.f275c) {
            m530c();
            return true;
        }
        byte bM219a = c0014g.m219a(i, i2);
        if (2 == bM219a) {
            if (i3 > 300) {
                m328c((short) ((byte) AbstractC0012e.m181a(i3, 300)));
            } else if (!this.f276d) {
                m328c((short) 1);
            }
            this.f276d = true;
            return true;
        }
        if (3 != bM219a) {
            return true;
        }
        if (i3 > 300) {
            m328c((short) ((byte) ((-1) * AbstractC0012e.m181a(i3, 300))));
        } else if (!this.f276d) {
            m328c((short) -1);
        }
        this.f276d = true;
        return true;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected boolean mo179a(int i, int i2, int i3) {
        C0014g c0014g = null;
        for (int i4 = 0; i4 < this.f277a.size() && c0014g == null; i4++) {
            C0014g c0014g2 = (C0014g) this.f277a.elementAt(i4);
            if (c0014g2.m218a(i, i2)) {
                c0014g = c0014g2;
            }
        }
        if (c0014g == null) {
            return false;
        }
        if (this.f274c == c0014g.f193a && this.f273b == c0014g.f194a) {
            if (!this.f275c) {
                m530c();
                return true;
            }
            byte bM219a = c0014g.m219a(i, i2);
            if (2 == bM219a) {
                if (this.f276d && i3 < 300) {
                    return true;
                }
                m328c((short) 1);
                return true;
            }
            if (3 != bM219a) {
                return true;
            }
            if (this.f276d && i3 < 300) {
                return true;
            }
            m328c((short) -1);
            return true;
        }
        AbstractC0003c abstractC0003cMo176a = mo176a();
        this.f273b = (byte) c0014g.f194a;
        this.f271a[this.f274c] = (byte) (this.f273b - (this.f270a / 2));
        AbstractC0003c[] abstractC0003cArrMo165a = mo165a((byte) 0);
        if (abstractC0003cArrMo165a != null && this.f271a[this.f274c] + this.f270a >= abstractC0003cArrMo165a.length) {
            this.f271a[this.f274c] = (byte) (abstractC0003cArrMo165a.length - this.f270a);
        }
        if (this.f271a[this.f274c] < 0) {
            this.f271a[this.f274c] = 0;
        }
        AbstractC0003c abstractC0003cMo176a2 = mo176a();
        if (this.f463k != -5) {
            if (abstractC0003cMo176a != abstractC0003cMo176a2) {
                m546j();
            }
            if ((abstractC0003cMo176a != abstractC0003cMo176a2 || ((AbstractC0041i) this).f464a.m409a()) && abstractC0003cMo176a2 != null) {
                mo167a(abstractC0003cMo176a2, this.f272a[this.f274c]);
            }
        }
        mo168a();
        return true;
    }
}
