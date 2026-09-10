package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0004d;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p001a.C0006f;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.a.c */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/c.class */
public final class C0010c extends AbstractC0026s {

    /* JADX INFO: renamed from: f */
    private byte f132f;

    /* JADX INFO: renamed from: d */
    private boolean f133d;

    public C0010c(short s) {
        super(s);
        this.f132f = (byte) -1;
        this.f133d = false;
        m547a((short) 61, (short) (m190a() + 8), (short) ((RunnableC0037e.f360a.getWidth() - 32) - 41), (short) (((RunnableC0037e.f360a.getHeight() - m190a()) - C0025r.m274a()) - 40), true);
        C0006f.m147b();
        ((AbstractC0026s) this).f272a = new short[]{110};
        ((AbstractC0026s) this).f270a = m201a(true);
        switch (s) {
            case -12:
                ((AbstractC0012e) this).f166a = C0066a.m773a(95);
                short[] sArr = ((AbstractC0026s) this).f272a;
                sArr[0] = (short) (sArr[0] | 16);
                ((AbstractC0041i) this).f456a = new C0025r(new byte[]{81}, new byte[]{52, 55, 71, 95, 49}, new byte[][]{new byte[]{70, 68, 67, 90, 69}});
                ((AbstractC0041i) this).f456a.m301b((byte) 71);
                break;
            case -6:
                ((AbstractC0012e) this).f166a = C0066a.m773a(95);
                ((AbstractC0041i) this).f456a = new C0025r(new byte[]{86, 74}, new byte[]{55}, null);
                break;
            case -2:
                ((AbstractC0012e) this).f166a = C0066a.m773a(95);
                ((AbstractC0041i) this).f456a = new C0025r(new byte[]{51, 86, 74, 79}, new byte[]{52, 55, 100, 48, 95, 49}, new byte[][]{new byte[]{70, 68, 67, 90, 69}});
                short[] sArr2 = ((AbstractC0026s) this).f272a;
                sArr2[0] = (short) (sArr2[0] | 4096);
                ((AbstractC0041i) this).f456a.m285a((short) 173, (byte) 100);
                ((AbstractC0041i) this).f456a.m285a((short) 176, (byte) 48);
                ((AbstractC0041i) this).f456a.m285a((short) 186, (byte) 79);
                ((AbstractC0041i) this).f456a.m288a((byte) 48, true);
                C0006f[] c0006fArrM94a = C0005e.f76a.m94a((byte) -1);
                if (c0006fArrM94a == null || c0006fArrM94a.length == 0) {
                    RunnableC0037e.m427a(C0066a.m773a(74), C0066a.m773a(133));
                }
                break;
            case -1:
                C0006f.m146a();
                ((AbstractC0012e) this).f166a = C0066a.m773a(71);
                ((AbstractC0041i) this).f456a = new C0025r(new byte[]{81}, new byte[]{55}, null);
                C0006f[] c0006fArrM94a2 = C0005e.f76a.m94a((byte) 1);
                if (c0006fArrM94a2 == null || c0006fArrM94a2.length == 0) {
                    RunnableC0037e.m427a(C0066a.m773a(74), C0066a.m773a(132));
                }
                break;
        }
        ((AbstractC0026s) this).f274c = (byte) 0;
        ((AbstractC0026s) this).f273b = (byte) 0;
        mo168a();
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a_ */
    protected final boolean mo164a_() {
        return super.m327b((short) 0);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a */
    protected final AbstractC0003c[] mo165a(byte b) {
        if (b != 0) {
            return null;
        }
        switch (this.f463k) {
            case -12:
                return AbstractC0012e.m197a(C0005e.f76a.m94a(this.f132f));
            case -6:
                return AbstractC0012e.m197a(C0005e.f76a.m101b(this.f132f));
            case -2:
                return !this.f133d ? AbstractC0012e.m197a(C0005e.f76a.m94a(this.f132f)) : AbstractC0012e.m197a(RunnableC0037e.f367a);
            case -1:
                return AbstractC0012e.m197a(C0005e.f76a.m94a((byte) 1));
            default:
                return null;
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: b */
    protected final boolean mo166b() {
        if (this.f463k != -1) {
            return super.mo166b();
        }
        AbstractC0003c[] abstractC0003cArrMo165a = mo165a(((AbstractC0026s) this).f274c);
        if (abstractC0003cArrMo165a == null || abstractC0003cArrMo165a.length == 0 || abstractC0003cArrMo165a.length <= ((AbstractC0026s) this).f273b || abstractC0003cArrMo165a[((AbstractC0026s) this).f273b] == null) {
            return true;
        }
        if (((C0006f) abstractC0003cArrMo165a[((AbstractC0026s) this).f273b]).mo23b() > C0005e.f76a.m104a(C0005e.f76a.f95b, C0004d.f72a, 0)) {
            RunnableC0037e.m427a("", C0066a.m773a(123));
            return true;
        }
        RunnableC0037e.f360a.f387a.f515a = (C0006f) abstractC0003cArrMo165a[((AbstractC0026s) this).f273b];
        super.m327b((short) 0);
        return true;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a */
    protected final void mo167a(AbstractC0003c abstractC0003c, short s) {
        if (this.f463k == -1) {
            abstractC0003c.mo48a(((AbstractC0041i) this).f464a, C0066a.m774a(277, new String[]{String.valueOf((int) ((C0006f) abstractC0003c).mo23b()), String.valueOf(C0005e.f76a.m104a(C0005e.f76a.f95b, C0004d.f72a, 0))}), s);
        } else {
            abstractC0003c.mo48a(((AbstractC0041i) this).f464a, (String) null, s);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
        AbstractC0003c abstractC0003cMo176a;
        if (this.f463k != -12) {
            ((AbstractC0041i) this).f456a.m303a(true, false);
            if (this.f133d || (abstractC0003cMo176a = mo176a()) == null || !abstractC0003cMo176a.m58b()) {
                return;
            }
            if (this.f463k != -2 && this.f463k != -6) {
                if (this.f463k == -1) {
                    ((AbstractC0041i) this).f456a.m288a((byte) 81, false);
                    return;
                }
                return;
            } else {
                if (abstractC0003cMo176a.mo74g() > 0) {
                    if (abstractC0003cMo176a.mo75h() <= 0) {
                        ((AbstractC0041i) this).f456a.m288a((byte) 74, false);
                        return;
                    } else {
                        ((AbstractC0041i) this).f456a.m288a((byte) 86, false);
                        return;
                    }
                }
                return;
            }
        }
        ((AbstractC0041i) this).f456a.m301b((byte) 71);
        C0006f[] c0006fArrM94a = C0005e.f76a.m94a((byte) -1);
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= c0006fArrM94a.length) {
                return;
            }
            if (c0006fArrM94a[s2] != null && c0006fArrM94a[s2].mo23b() > 0) {
                ((AbstractC0041i) this).f456a.m302c((byte) 71);
                return;
            }
            s = (short) (s2 + 1);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        try {
            if (this.f463k == -2 && !this.f133d) {
                if (C0005e.f76a.m123e() <= 0) {
                    ((AbstractC0041i) this).f456a.m288a((byte) 100, true);
                } else {
                    ((AbstractC0041i) this).f456a.m288a((byte) 100, false);
                }
            }
            if (mo176a() != null) {
                mo168a();
            }
            m329c(graphics);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("BagView ").append(e.getMessage()).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        AbstractC0003c[] abstractC0003cArrMo165a;
        AbstractC0003c[] abstractC0003cArrMo165a2;
        ?? M749a = (byte) c0023p.f245a;
        switch (M749a) {
            case 48:
                return m171g();
            case 66:
                m172a((byte) 1);
                return true;
            case 67:
                m172a((byte) 4);
                return true;
            case 68:
                m172a((byte) 2);
                return true;
            case 69:
                m172a((byte) 16);
                return true;
            case 70:
                m172a((byte) -1);
                return true;
            case 71:
                try {
                    C0058g c0058g = new C0058g(C0059h.f576a[44]);
                    c0058g.m670a(C0005e.f76a.f90b);
                    C0005e.f76a.f90b = -1;
                    m172a((byte) -1);
                    C0006f[] c0006fArrM94a = C0005e.f76a.m94a((byte) -1);
                    AbstractC0026s.m324a(c0058g, c0006fArrM94a);
                    for (short s = 0; s < c0006fArrM94a.length; s = (short) (s + 1)) {
                        if (c0006fArrM94a[s] != null && c0006fArrM94a[s].mo23b() > 0) {
                            c0006fArrM94a[s].m61d(0);
                        }
                    }
                    M749a = C0063c.f597a.m749a(c0058g);
                    break;
                } catch (Exception e) {
                    C0063c.m746a(M749a.getMessage());
                }
                return super.m327b((short) 0);
            case 74:
                if ((this.f463k != -6 && this.f463k != -2) || (abstractC0003cArrMo165a2 = mo165a((byte) 0)) == null || abstractC0003cArrMo165a2.length <= ((AbstractC0026s) this).f273b || abstractC0003cArrMo165a2[((AbstractC0026s) this).f273b] == null) {
                    return false;
                }
                if (!abstractC0003cArrMo165a2[((AbstractC0026s) this).f273b].m58b()) {
                    RunnableC0037e.m427a(C0066a.m773a(105), C0066a.m773a(57));
                    return false;
                }
                C0005e.m131a((C0006f) abstractC0003cArrMo165a2[((AbstractC0026s) this).f273b]);
                if (this.f463k == -6) {
                    super.m327b((short) 0);
                    return true;
                }
                mo168a();
                return true;
            case 86:
                if ((this.f463k != -6 && this.f463k != -2 && this.f463k != -5) || (abstractC0003cArrMo165a = mo165a((byte) 0)) == null || abstractC0003cArrMo165a.length <= ((AbstractC0026s) this).f273b || abstractC0003cArrMo165a[((AbstractC0026s) this).f273b] == null) {
                    return false;
                }
                C0005e.m132b((C0006f) abstractC0003cArrMo165a[((AbstractC0026s) this).f273b]);
                mo168a();
                return true;
            case 90:
                m172a((byte) 8);
                return true;
            case 100:
                ?? M749a2 = this.f133d;
                if (M749a2 == 0) {
                    try {
                        ((AbstractC0041i) this).f456a.m285a((short) 95, (byte) 100);
                        C0058g c0058g2 = new C0058g(C0059h.f576a[67], (short) 0, C0059h.f576a[7]);
                        c0058g2.m672a((byte) 2);
                        M749a2 = C0063c.f597a.m749a(c0058g2);
                    } catch (Exception e2) {
                        C0063c.m746a(M749a2.getMessage());
                    }
                    break;
                } else {
                    ((AbstractC0041i) this).f456a.m285a((short) 173, (byte) 100);
                }
                this.f133d = !this.f133d;
                if (this.f133d) {
                    ((AbstractC0041i) this).f456a.m288a((byte) 48, false);
                } else {
                    ((AbstractC0041i) this).f456a.m288a((byte) 48, true);
                }
                m546j();
                ((AbstractC0026s) this).f271a[((AbstractC0026s) this).f274c] = 0;
                ((AbstractC0026s) this).f273b = (byte) 0;
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m171g() {
        try {
            AbstractC0003c abstractC0003cMo176a = mo176a();
            if (abstractC0003cMo176a == null) {
                return true;
            }
            C0058g c0058g = new C0058g(C0059h.f576a[68]);
            if (this.f133d) {
                c0058g.m672a((byte) 4);
                C0005e.f76a.m122g(-1);
            } else {
                c0058g.m672a((byte) 3);
                C0005e.f76a.m124a((byte) abstractC0003cMo176a.mo47d(), (C0006f) null);
            }
            abstractC0003cMo176a.m63e(0);
            m546j();
            c0058g.m670a(abstractC0003cMo176a.m68e());
            C0063c.f597a.m749a(c0058g);
            return true;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("thing dismiss: ").append(e.getMessage()).toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m172a(byte b) {
        ((AbstractC0026s) this).f273b = (byte) 0;
        ((AbstractC0026s) this).f271a[0] = 0;
        this.f132f = b;
    }
}
