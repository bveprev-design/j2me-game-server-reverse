package mobak.p000a.p002b.p003a;

import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.AbstractC0073h;

/* JADX INFO: renamed from: mobak.a.b.a.y */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/y.class */
final class C0032y extends AbstractC0073h {

    /* JADX INFO: renamed from: a */
    private final C0011d f320a;

    C0032y(C0011d c0011d) {
        this.f320a = c0011d;
    }

    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: a */
    public final void mo162a() {
        RunnableC0037e.f360a.m443f();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Exception, mobak.a.b.e] */
    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: b */
    public final void mo163b() {
        ?? r0;
        try {
            C0058g c0058g = new C0058g(C0059h.f576a[85]);
            c0058g.m672a(((AbstractC0026s) this.f320a).f273b);
            C0063c.f597a.m749a(c0058g);
            r0 = RunnableC0037e.f360a;
            r0.m443f();
        } catch (Exception e) {
            C0063c.m745a((Exception) r0);
        }
    }
}
