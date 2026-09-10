package mobak.p000a.p002b.p003a;

import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.AbstractC0073h;

/* JADX INFO: renamed from: mobak.a.b.a.b */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/b.class */
final class C0009b extends AbstractC0073h {

    /* JADX INFO: renamed from: a */
    private final C0020m f131a;

    C0009b(C0020m c0020m) {
        this.f131a = c0020m;
    }

    @Override // mobak.p006c.AbstractC0073h
    /* JADX INFO: renamed from: a */
    public final void mo162a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v7, types: [mobak.b.a.g] */
    /* JADX WARN: Type inference failed for: r0v8, types: [mobak.b.c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
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
        ?? Abs = Math.abs(this.f131a.f225b.m406a(this.f131a.f223a + 1).mo255b());
        if (Abs != 0) {
            try {
                ?? c0058g = new C0058g(C0059h.f576a[82], (short) 4, (short) 0);
                c0058g.m670a(Abs);
                Abs = C0063c.f597a.m749a(c0058g);
            } catch (Exception e) {
                C0063c.m745a((Exception) Abs);
            }
        }
    }
}
