package mobak.p000a.p002b.p003a;

import mobak.C0050b;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.AbstractC0073h;

/* JADX INFO: renamed from: mobak.a.b.a.a */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/a.class */
final class C0008a extends AbstractC0073h {

    /* JADX INFO: renamed from: a */
    private final C0013f f130a;

    C0008a(C0013f c0013f) {
        this.f130a = c0013f;
    }

    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: a */
    public final void mo162a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mobak.b.a.g] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [mobak.b.c] */
    /* JADX WARN: Type inference failed for: r0v5, types: [mobak.b.a.g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: b */
    public final void mo163b() {
        ?? c0058g = new C0058g(C0059h.f576a[30], (short) 4, C0059h.f576a[10]);
        try {
            c0058g = c0058g;
            c0058g.m670a(this.f130a.f181c + 1);
        } catch (Exception e) {
            C0063c.m746a(c0058g.getMessage());
        }
        C0063c.f597a.m749a(c0058g);
        C0050b.m622b();
    }
}
