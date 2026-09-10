package mobak.p000a.p002b;

import mobak.p006c.AbstractC0073h;
import mobak.p006c.C0069d;

/* JADX INFO: renamed from: mobak.a.b.k */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/k.class */
final class C0043k {

    /* JADX INFO: renamed from: a */
    public byte f481a;

    /* JADX INFO: renamed from: a */
    public String f482a;

    /* JADX INFO: renamed from: a */
    public C0035c f483a;

    /* JADX INFO: renamed from: a */
    public AbstractC0073h f484a;

    /* JADX INFO: renamed from: e */
    public int f485e;

    /* JADX INFO: renamed from: a */
    C0069d f486a = AbstractC0041i.f447g;

    /* JADX INFO: renamed from: a */
    int f477a = RunnableC0037e.m484a();

    /* JADX INFO: renamed from: b */
    int f478b = RunnableC0037e.m485b();

    /* JADX INFO: renamed from: c */
    int f479c = RunnableC0037e.m486c();

    /* JADX INFO: renamed from: d */
    int f480d = RunnableC0037e.m487d();

    public C0043k(byte b, String str, String str2, AbstractC0073h abstractC0073h, int i) {
        this.f481a = b;
        this.f482a = str;
        short s = (short) (this.f478b + ((this.f482a == null || this.f482a.equals("")) ? 10 : 25));
        this.f483a = new C0035c((short) (this.f477a + 10), s, (short) (this.f479c - 15), (short) ((this.f480d - 10) - (s - this.f478b)), false, false);
        this.f483a.m402a(str2, this.f486a, false, -1);
        this.f484a = abstractC0073h;
        this.f485e = i;
    }
}
