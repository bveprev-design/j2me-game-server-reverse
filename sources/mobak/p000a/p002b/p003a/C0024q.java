package mobak.p000a.p002b.p003a;

import mobak.p004b.C0063c;
import mobak.p006c.AbstractC0073h;

/* JADX INFO: renamed from: mobak.a.b.a.q */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/q.class */
final class C0024q extends AbstractC0073h {

    /* JADX INFO: renamed from: a */
    private final C0021n f252a;

    C0024q(C0021n c0021n) {
        this.f252a = c0021n;
    }

    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: a */
    public final void mo162a() {
    }

    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: b */
    public final void mo163b() {
        try {
            C0021n.m249a(this.f252a);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("dismiss: ").append(e.getMessage()).toString());
        }
    }
}
