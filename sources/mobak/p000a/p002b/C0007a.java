package mobak.p000a.p002b;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: renamed from: mobak.a.b.a */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a.class */
public final class C0007a extends AbstractC0045m {

    /* JADX INFO: renamed from: a */
    private Image f124a;

    /* JADX INFO: renamed from: a */
    private short f125a;

    /* JADX INFO: renamed from: b */
    private short f126b;

    /* JADX INFO: renamed from: c */
    private short f127c;

    /* JADX INFO: renamed from: d */
    private short f128d;

    /* JADX INFO: renamed from: e */
    private short f129e;

    public C0007a(C0049q c0049q, Image image, short s, short s2, short s3) {
        super(c0049q);
        this.f127c = (short) 0;
        this.f124a = image;
        this.f125a = s;
        this.f126b = (short) (RunnableC0037e.m476a(this.f124a) / this.f125a);
        this.f128d = s2;
        this.f129e = s3;
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final void mo159a(Graphics graphics) {
        if (this.f127c < this.f126b) {
            RunnableC0037e.m468a(graphics, this.f124a, this.f125a * this.f127c, 0, this.f125a, RunnableC0037e.m477b(this.f124a), 0, this.f128d + ((34 - this.f125a) / 2), this.f129e, 0);
        }
        this.f127c = (short) (this.f127c + 1);
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final boolean mo160a() {
        if (this.f124a == null || this.f127c >= this.f126b) {
            return super.mo160a();
        }
        return false;
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final void mo161a() {
    }
}
