package mobak.p000a.p002b;

import javax.microedition.lcdui.Graphics;
import mobak.p000a.p001a.C0001a;
import mobak.p004b.C0063c;

/* JADX INFO: renamed from: mobak.a.b.n */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/n.class */
public final class C0046n extends AbstractC0045m {

    /* JADX INFO: renamed from: a */
    private byte f492a;

    /* JADX INFO: renamed from: a */
    private int f493a;

    /* JADX INFO: renamed from: a */
    private final C0049q f494a;

    public C0046n(C0049q c0049q, byte b, int i) {
        super(c0049q);
        this.f494a = c0049q;
        this.f492a = b;
        this.f493a = i < 0 ? 0 : i;
        if (C0049q.m598a(c0049q, this.f492a)) {
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final void mo159a(Graphics graphics) {
        if (C0049q.m598a(this.f494a, this.f492a)) {
            C0001a c0001aM588a = this.f494a.m588a(this.f492a);
            if (c0001aM588a == null) {
                this.f492a = (byte) -1;
                return;
            }
            if (c0001aM588a.mo47d() == 0) {
                try {
                    c0001aM588a.m45a(this.f493a);
                } catch (Exception e) {
                    C0063c.m744a(new StringBuffer().append("unitAttackAnimate: ").append(e).toString(), false);
                }
            }
            c0001aM588a.m46h((byte) (c0001aM588a.mo47d() + 1));
            if (c0001aM588a.mo47d() > 15) {
                c0001aM588a.m46h((byte) -1);
                c0001aM588a.m54b(this.f493a);
                if (c0001aM588a.mo24c() <= 0) {
                    C0049q.m602a(this.f494a, this.f492a, (C0001a) null);
                    C0049q.m603a(this.f494a, this.f492a);
                }
                this.f492a = (byte) -1;
            }
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final boolean mo160a() {
        if (this.f492a < 0) {
            return super.mo160a();
        }
        return false;
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final void mo161a() {
    }
}
