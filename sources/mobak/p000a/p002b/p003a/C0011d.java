package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.Main2;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0002b;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.a.d */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/d.class */
public final class C0011d extends AbstractC0026s {

    /* JADX INFO: renamed from: a */
    private C0002b[] f134a;

    /* JADX INFO: renamed from: a */
    private C0023p f135a;

    /* JADX INFO: renamed from: d */
    private boolean f136d;

    public C0011d(C0002b[] c0002bArr) {
        super((short) -9);
        this.f136d = false;
        m173d();
        this.f134a = c0002bArr;
        ((AbstractC0026s) this).f270a = m201a(true);
        ((AbstractC0026s) this).f273b = (byte) 0;
        ((AbstractC0026s) this).f274c = (byte) 0;
        ((AbstractC0041i) this).f456a = new C0025r(new byte[]{51, 81, 59, 89}, new byte[]{55}, null);
        ((AbstractC0041i) this).f456a.m285a((short) 248, (byte) 81);
        mo168a();
    }

    public C0011d() {
        super((short) -13);
        this.f136d = false;
        m173d();
        ((AbstractC0026s) this).f270a = m201a(true);
        this.f134a = new C0002b[6];
        this.f134a[0] = new C0002b((short) (C0005e.f76a.m142d() - 1), (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.f134a[1] = new C0002b((short) (C0005e.f76a.m142d() + 4), (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.f134a[2] = new C0002b((short) 10, (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.f134a[3] = new C0002b((short) 11, (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.f134a[4] = new C0002b((short) 12, (byte) 0, (byte) 0, (byte) 0, "", 0);
        this.f134a[5] = new C0002b((short) (12 + C0005e.f76a.m142d()), (byte) 0, (byte) 0, (byte) 0, "", 0);
        ((AbstractC0041i) this).f456a = new C0025r();
        ((AbstractC0041i) this).f456a.m282a(false, new C0023p((byte) 55));
        this.f135a = new C0023p((byte) 58);
        this.f135a.m268a((short) 7);
        this.f135a.m267a(C0066a.m777b(257));
        ((AbstractC0041i) this).f456a.m282a(true, this.f135a);
        this.f136d = true;
        ((AbstractC0041i) this).f464a.m401a(C0066a.m777b(258), AbstractC0041i.f442b, (byte) 0, false, -1);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a_ */
    protected final boolean mo164a_() {
        RunnableC0037e.f360a.m443f();
        return true;
    }

    /* JADX INFO: renamed from: d */
    private void m173d() {
        m547a((short) 61, (short) (m190a() + 8), (short) ((RunnableC0037e.f360a.getWidth() - 32) - 41), (short) (((RunnableC0037e.f360a.getHeight() - m190a()) - C0025r.m274a()) - 40), true);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        if (((AbstractC0041i) this).f464a.m409a() && !this.f136d) {
            m175n();
        }
        super.m329c(graphics);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a */
    protected final AbstractC0003c[] mo165a(byte b) {
        return this.f134a;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a */
    protected final void mo174a(boolean z) {
        short s = ((AbstractC0026s) this).f273b;
        super.mo174a(z);
        if (s != ((AbstractC0026s) this).f273b) {
            m175n();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m175n() {
        if (this.f136d) {
            return;
        }
        m546j();
        AbstractC0003c abstractC0003cMo176a = mo176a();
        if (abstractC0003cMo176a != null) {
            mo167a(abstractC0003cMo176a, ((AbstractC0026s) this).f272a[((AbstractC0026s) this).f274c]);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: b */
    protected final boolean mo166b() {
        AbstractC0003c abstractC0003cMo176a = mo176a();
        if (abstractC0003cMo176a == null) {
            return false;
        }
        try {
            C0058g c0058g = new C0058g(C0059h.f576a[62], (short) 0, (short) 0);
            c0058g.m672a((byte) 4);
            c0058g.m670a(abstractC0003cMo176a.m68e());
            C0063c.f597a.m749a(c0058g);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("invintation fixObject: ").append(e.getMessage()).toString());
        }
        RunnableC0037e.f360a.m443f();
        return true;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
        if (this.f136d) {
            return;
        }
        ((AbstractC0041i) this).f456a.m303a(true, false);
        if (((AbstractC0026s) this).f273b < 0 || ((AbstractC0026s) this).f274c < 0 || mo176a() == null) {
            return;
        }
        ((AbstractC0041i) this).f456a.m306a(((C0002b) mo176a()).f56a, false);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case 58:
                RunnableC0037e.m431a("", this.f135a.f248a, "", new C0032y(this));
                return true;
            case 59:
                if (mo176a() == null) {
                    return false;
                }
                C0002b c0002b = (C0002b) mo176a();
                Main2.f0a.f12b = c0002b.m68e();
                Main2.f0a.m1b((byte) 6);
                return true;
            case 89:
                if (mo176a() == null || RunnableC0037e.f360a.f386a == null) {
                    return false;
                }
                C0002b c0002b2 = (C0002b) mo176a();
                RunnableC0037e.f360a.f386a.m363a(c0002b2.f53a, c0002b2.f54b, true);
                RunnableC0037e.f360a.m441a((byte) 2);
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a */
    protected final AbstractC0003c mo176a() {
        if (this.f136d) {
            return null;
        }
        return super.mo176a();
    }
}
