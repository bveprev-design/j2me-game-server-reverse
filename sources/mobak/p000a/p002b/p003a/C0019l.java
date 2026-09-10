package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p006c.C0069d;

/* JADX INFO: renamed from: mobak.a.b.a.l */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/l.class */
public final class C0019l extends AbstractC0012e {

    /* JADX INFO: renamed from: l */
    private short f213l;

    /* JADX INFO: renamed from: a */
    private byte f214a;

    /* JADX INFO: renamed from: a */
    private String[] f215a;

    /* JADX INFO: renamed from: a */
    private int[] f216a;

    /* JADX INFO: renamed from: i */
    private C0069d f217i;

    public C0019l(String str, String str2, String str3) {
        this.f213l = (short) 0;
        this.f213l = (short) -108;
        AbstractC0041i.f449c = str;
        ((AbstractC0012e) this).f166a = str2;
        ((AbstractC0041i) this).f464a = new C0035c((short) 16, (short) (m190a() + 8), (short) (RunnableC0037e.f360a.getWidth() - 32), (short) (((RunnableC0037e.f360a.getHeight() - m190a()) - 22) - C0025r.m274a()), false, false, true);
        this.f217i = AbstractC0041i.f442b;
        ((AbstractC0041i) this).f464a.m402a(str3, this.f217i, false, -1);
        ((AbstractC0041i) this).f456a = new C0025r();
    }

    public C0019l(String str, String str2, String[] strArr, int[] iArr) {
        this.f213l = (short) 0;
        this.f213l = (short) -109;
        AbstractC0041i.f449c = str;
        ((AbstractC0012e) this).f166a = str2;
        this.f215a = strArr;
        this.f216a = iArr;
        this.f214a = (byte) 0;
        ((AbstractC0041i) this).f456a = new C0025r();
        this.f217i = AbstractC0041i.f446f;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        synchronized (this) {
            super.mo169a(graphics);
            switch (this.f213l) {
                case -109:
                    m194a(graphics, m229b(), this.f215a, this.f214a, this.f217i);
                    break;
                case -108:
                    ((AbstractC0041i) this).f464a.m395a(graphics, (byte) 0);
                    break;
            }
            ((AbstractC0041i) this).f456a.m291a(graphics);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
        if (this.f213l == -109) {
            ((AbstractC0041i) this).f456a.m303a(true, false);
            if (mo230b() >= 0) {
                ((AbstractC0041i) this).f456a.m303a(true, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private short m229b() {
        return (short) (m190a() + 10);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        if (this.f213l != -109) {
            if (this.f213l != -108) {
                return false;
            }
            ((AbstractC0041i) this).f464a.m414c(i2);
            return true;
        }
        byte bM196a = m196a(this.f217i, this.f215a.length, m229b(), i2);
        if (bM196a < 0 || bM196a >= this.f215a.length) {
            return false;
        }
        this.f214a = bM196a;
        return true;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        if (this.f213l != -109) {
            return false;
        }
        byte bM196a = m196a(this.f217i, this.f215a.length, m229b(), i2);
        if (bM196a >= 0 && bM196a < this.f215a.length) {
            this.f214a = bM196a;
        }
        if (((AbstractC0041i) this).f456a == null) {
            return true;
        }
        mo168a();
        try {
            m531b(((AbstractC0041i) this).f456a.m296a(false, false, true));
            return true;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("TextMenuScreen.pointReleased: ").append(e.toString()).toString());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: b */
    public final int mo230b() {
        switch (this.f213l) {
            case -109:
                return (this.f216a == null || this.f214a < 0 || this.f214a >= this.f216a.length) ? super.mo230b() : this.f216a[this.f214a];
            case -108:
                return ((AbstractC0041i) this).f464a.m405a();
            default:
                return 0;
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final String mo200a() {
        return AbstractC0041i.f449c;
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final void mo202a(int i) {
        if (i == 6 || 6 == RunnableC0037e.f360a.getGameAction(i)) {
            switch (this.f213l) {
                case -109:
                    if (this.f214a < this.f215a.length - 1) {
                        this.f214a = (byte) (this.f214a + 1);
                    }
                    break;
                case -108:
                    ((AbstractC0041i) this).f464a.m398b();
                    break;
            }
        }
        if (i == 1 || 1 == RunnableC0037e.f360a.getGameAction(i)) {
            switch (this.f213l) {
                case -109:
                    if (this.f214a > 0) {
                        this.f214a = (byte) (this.f214a - 1);
                    }
                    break;
                case -108:
                    ((AbstractC0041i) this).f464a.m396a();
                    break;
            }
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e
    /* JADX INFO: renamed from: a */
    public final void mo182a(String str) {
        synchronized (this) {
            ((AbstractC0041i) this).f464a.m408c();
            ((AbstractC0041i) this).f464a.m402a(str, AbstractC0041i.f442b, false, -1);
        }
    }
}
