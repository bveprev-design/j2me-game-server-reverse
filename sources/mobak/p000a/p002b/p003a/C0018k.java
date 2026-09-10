package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.a.k */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/k.class */
public final class C0018k extends AbstractC0026s {
    C0018k() {
        super((short) -10);
        ((AbstractC0012e) this).f166a = C0066a.m773a(181);
    }

    public C0018k(String str, int i) {
        super((short) -10);
        m547a((short) 16, (short) ((byte) (m190a() + 8)), (short) (RunnableC0037e.f360a.getWidth() - 32), (short) (((RunnableC0037e.f360a.getHeight() - m190a()) - C0025r.m274a()) - 40), true);
        ((AbstractC0012e) this).f166a = C0066a.m773a(181);
        mo223c();
        ((AbstractC0041i) this).f464a.m402a(str, AbstractC0041i.f442b, false, -1);
        ((AbstractC0041i) this).f456a = new C0025r(null, new byte[]{51, 55}, null);
        if ((i & 1) == 1) {
            ((AbstractC0041i) this).f456a.m283a(false, (byte) 101, (short) 179);
        }
        if ((i & 2) == 2) {
            ((AbstractC0041i) this).f456a.m283a(false, (byte) 71, (short) 83);
        }
        if ((i & 8) == 8) {
            ((AbstractC0041i) this).f456a.m283a(false, (byte) 96, (short) 259);
        }
        if ((i & 16) == 16) {
            C0023p c0023p = new C0023p((byte) 30);
            c0023p.f246a = C0059h.f576a[86];
            c0023p.m268a((short) 261);
            c0023p.f249a = new String[]{C0066a.m774a(262, new String[]{String.valueOf(C0050b.f546b)})};
            c0023p.f250a = new short[]{3};
            c0023p.f251a = new int[]{2};
            c0023p.m267a(C0066a.m773a(263));
            c0023p.f247b = C0059h.f576a[86];
            ((AbstractC0041i) this).f456a.m282a(false, c0023p);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a_ */
    protected final boolean mo164a_() {
        RunnableC0037e.f360a.m443f();
        return true;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        super.mo169a(graphics);
        ((AbstractC0041i) this).f464a.m395a(graphics, (byte) 0);
        ((AbstractC0041i) this).f456a.m291a(graphics);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        return false;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        return false;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i, mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: b */
    public final void mo10b(int i) {
        while (i != 1) {
            if (i != 0 || ((AbstractC0041i) this).f451a.f439a != 3) {
                super.mo10b(i);
                return;
            }
            C0058g c0058g = new C0058g(C0059h.f576a[78]);
            c0058g.m670a(((AbstractC0041i) this).f451a.m517a(0));
            C0063c.f597a.m749a(c0058g);
            i = 1;
            this = this;
        }
        RunnableC0037e.f360a.m472l();
        ((AbstractC0041i) this).f451a = null;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case 96:
                RunnableC0037e.f360a.m437a((AbstractC0012e) new C0011d(), true);
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }
}
