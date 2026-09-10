package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0001a;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.a.n */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/n.class */
public final class C0021n extends AbstractC0026s {

    /* JADX INFO: renamed from: a */
    private AbstractC0003c[] f239a;

    /* JADX INFO: renamed from: d */
    private boolean f240d;

    public C0021n(short s) {
        super(s);
        this.f239a = null;
        this.f240d = true;
        m547a((short) 61, (short) (m190a() + 8), (short) ((RunnableC0037e.f360a.getWidth() - 32) - 41), (short) (((RunnableC0037e.f360a.getHeight() - m190a()) - C0025r.m274a()) - 40), true);
        ((AbstractC0026s) this).f272a = new short[]{46};
        ((AbstractC0026s) this).f270a = m201a(true);
        switch (s) {
            case -4:
                ((AbstractC0012e) this).f166a = C0066a.m773a(52);
                ((AbstractC0041i) this).f456a = new C0025r(null, new byte[]{52, 55, 73, 72, 95}, null);
                ((AbstractC0041i) this).f456a.m301b((byte) 73);
                short[] sArr = ((AbstractC0026s) this).f272a;
                sArr[0] = (short) (sArr[0] | 2048);
                RunnableC0037e.f367a = RunnableC0037e.f360a.f387a.f535a.m92a();
                break;
            case -3:
                ((AbstractC0012e) this).f166a = C0066a.m773a(52);
                ((AbstractC0041i) this).f456a = new C0025r(new byte[]{79}, new byte[]{51, 55, 100, 48, 98, 95}, null);
                short[] sArr2 = ((AbstractC0026s) this).f272a;
                sArr2[0] = (short) (sArr2[0] | 4096);
                short[] sArr3 = ((AbstractC0026s) this).f272a;
                sArr3[0] = (short) (sArr3[0] | 16);
                ((AbstractC0041i) this).f456a.m285a((short) 186, (byte) 79);
                ((AbstractC0041i) this).f456a.m285a((short) 187, (byte) 98);
                break;
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a_ */
    protected final boolean mo164a_() {
        return m327b((short) 0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a */
    protected final AbstractC0003c[] mo165a(byte b) {
        AbstractC0003c[] abstractC0003cArrM197a;
        if (AbstractC0026s.m331a(this.f239a)) {
            if (b == 0) {
                switch (this.f463k) {
                    case -4:
                    case -3:
                        abstractC0003cArrM197a = !this.f240d ? AbstractC0012e.m197a(RunnableC0037e.f367a) : AbstractC0012e.m197a(C0005e.f76a.m92a());
                        break;
                    case -2:
                    default:
                        abstractC0003cArrM197a = null;
                        break;
                    case -1:
                        abstractC0003cArrM197a = AbstractC0012e.m197a(C0005e.f76a.m94a((byte) 1));
                        break;
                }
            } else {
                abstractC0003cArrM197a = null;
            }
            this.f239a = abstractC0003cArrM197a;
        }
        return this.f239a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case 48:
                RunnableC0037e.m431a(C0066a.m777b(135), C0066a.m777b(246), "", new C0024q(this));
                return true;
            case 72:
                this.f240d = false;
                this.f239a = null;
                ((AbstractC0026s) this).f273b = (byte) 0;
                ((AbstractC0026s) this).f271a[0] = 0;
                m546j();
                ((AbstractC0041i) this).f456a.m302c((byte) 73);
                ((AbstractC0041i) this).f456a.m301b((byte) 72);
                m198b(RunnableC0037e.f360a.f387a.f535a.m102a());
                return true;
            case 73:
                this.f240d = true;
                this.f239a = null;
                ((AbstractC0026s) this).f273b = (byte) 0;
                m546j();
                ((AbstractC0041i) this).f456a.m301b((byte) 73);
                ((AbstractC0041i) this).f456a.m302c((byte) 72);
                m198b(C0066a.m773a(52));
                return true;
            case 79:
                if (((AbstractC0026s) this).f275c) {
                    try {
                        AbstractC0003c abstractC0003cMo176a = mo176a();
                        if (abstractC0003cMo176a.mo23b() > 0) {
                            C0058g c0058g = new C0058g(C0059h.f576a[71], (short) 8, C0059h.f576a[17]);
                            c0058g.m670a(abstractC0003cMo176a.m68e());
                            c0058g.m670a(abstractC0003cMo176a.mo23b());
                            abstractC0003cMo176a.m61d(0);
                            C0063c.f597a.m749a(c0058g);
                        }
                    } catch (Exception e) {
                        C0063c.m746a(new StringBuffer().append("").append(e).toString());
                    }
                    break;
                }
                mo166b();
                return true;
            case 98:
                try {
                    AbstractC0003c abstractC0003cMo176a2 = mo176a();
                    C0058g c0058g2 = new C0058g(C0059h.f576a[72], (short) 8, C0059h.f576a[17]);
                    c0058g2.m670a(abstractC0003cMo176a2.m68e());
                    C0063c.f597a.m749a(c0058g2);
                    return true;
                } catch (Exception e2) {
                    C0063c.m746a(new StringBuffer().append("").append(e2).toString());
                    return true;
                }
            case 100:
                ?? M749a = this.f240d;
                if (M749a != 0) {
                    try {
                        ((AbstractC0041i) this).f456a.m285a((short) 52, (byte) 100);
                        C0058g c0058g3 = new C0058g(C0059h.f576a[67], (short) 0, C0059h.f576a[7]);
                        c0058g3.m672a((byte) 1);
                        M749a = C0063c.f597a.m749a(c0058g3);
                    } catch (Exception e3) {
                        C0063c.m746a(M749a.getMessage());
                    }
                    break;
                } else {
                    ((AbstractC0041i) this).f456a.m285a((short) 172, (byte) 100);
                }
                this.f240d = !this.f240d;
                this.f239a = null;
                m546j();
                ((AbstractC0026s) this).f271a[((AbstractC0026s) this).f274c] = 0;
                ((AbstractC0026s) this).f273b = (byte) 0;
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        try {
            if (this.f463k == -3 && this.f240d) {
                if (C0005e.f76a.m120d() <= 0) {
                    ((AbstractC0041i) this).f456a.m287a((byte) 100, true, false);
                } else {
                    ((AbstractC0041i) this).f456a.m287a((byte) 100, false, false);
                }
            }
            super.m329c(graphics);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("ArmyView ").append(e.getMessage()).toString());
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
        boolean z;
        if (this.f463k == -4) {
            return;
        }
        ((AbstractC0041i) this).f456a.m303a(true, false);
        if (this.f463k == -3) {
            if (C0005e.f76a.m125c() == 5 || !this.f240d) {
                ((AbstractC0041i) this).f456a.m301b((byte) 79);
            } else {
                ((AbstractC0041i) this).f456a.m302c((byte) 79);
                ((AbstractC0041i) this).f456a.m288a((byte) 79, false);
            }
            AbstractC0003c abstractC0003cMo176a = mo176a();
            C0001a[] c0001aArrM92a = C0005e.f76a.m92a();
            short s = 0;
            while (true) {
                short s2 = s;
                if (c0001aArrM92a != null && s2 < c0001aArrM92a.length) {
                    if (c0001aArrM92a[s2] != null && c0001aArrM92a[s2] != abstractC0003cMo176a && c0001aArrM92a[s2].mo50a(abstractC0003cMo176a)) {
                        z = true;
                        break;
                    }
                    s = (short) (s2 + 1);
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                ((AbstractC0041i) this).f456a.m302c((byte) 98);
                ((AbstractC0041i) this).f456a.m288a((byte) 98, false);
            } else {
                ((AbstractC0041i) this).f456a.m301b((byte) 98);
            }
        }
        if (this.f463k == -3 && ((AbstractC0026s) this).f274c == 0) {
            return;
        }
        super.mo168a();
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: c */
    public final void mo223c() {
        this.f239a = null;
        super.mo223c();
    }

    /* JADX INFO: renamed from: a */
    static void m249a(C0021n c0021n) {
        AbstractC0003c abstractC0003cMo176a = c0021n.mo176a();
        if (abstractC0003cMo176a != null) {
            C0058g c0058g = new C0058g(C0059h.f576a[68]);
            if (!c0021n.f240d) {
                c0058g.m672a((byte) 2);
                C0005e.f76a.m119e(-1);
            } else if (C0005e.f76a.m125c() <= 1) {
                RunnableC0037e.m427a(C0066a.m773a(135), C0066a.m773a(165));
                return;
            } else {
                c0058g.m672a((byte) 1);
                C0005e.f76a.m91a((byte) abstractC0003cMo176a.mo47d(), (C0001a) null);
            }
            if (((AbstractC0026s) c0021n).f273b > 0) {
                ((AbstractC0026s) c0021n).f273b = (byte) (((AbstractC0026s) c0021n).f273b - 1);
            }
            if (((AbstractC0026s) c0021n).f273b < ((AbstractC0026s) c0021n).f271a[((AbstractC0026s) c0021n).f274c]) {
                ((AbstractC0026s) c0021n).f271a[((AbstractC0026s) c0021n).f274c] = ((AbstractC0026s) c0021n).f273b;
            }
            abstractC0003cMo176a.m63e(0);
            c0021n.m546j();
            c0058g.m670a(abstractC0003cMo176a.m68e());
            C0063c.f597a.m749a(c0058g);
        }
    }
}
