package mobak.p000a.p002b.p003a;

import java.util.Vector;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p006c.AbstractC0073h;

/* JADX INFO: renamed from: mobak.a.b.a.t */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/t.class */
final class C0027t extends AbstractC0073h {

    /* JADX INFO: renamed from: a */
    private final C0030w f278a;

    C0027t(C0030w c0030w) {
        this.f278a = c0030w;
    }

    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: a */
    public final void mo162a() {
    }

    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: b */
    public final void mo163b() {
        if (this.f278a.f303a == null) {
            this.f278a.f303a = new Vector();
        }
        AbstractC0003c abstractC0003cM344a = this.f278a.m344a(this.f278a.f297a, this.f278a.f298l);
        this.f278a.f303a.addElement(abstractC0003cM344a);
        abstractC0003cM344a.m86d(false);
        if (this.f278a.m342a(this.f278a.f297a, false) != 0) {
            this.f278a.m348d(this.f278a.f298l == this.f278a.f296c[this.f278a.f297a]);
            return;
        }
        byte b = this.f278a.f297a;
        this.f278a.m347a(true);
        this.f278a.f296c[b] = -1;
    }
}
