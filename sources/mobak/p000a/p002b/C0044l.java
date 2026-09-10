package mobak.p000a.p002b;

import javax.microedition.lcdui.Graphics;
import mobak.p000a.p001a.C0001a;

/* JADX INFO: renamed from: mobak.a.b.l */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/l.class */
public final class C0044l extends AbstractC0045m {

    /* JADX INFO: renamed from: a */
    private byte[] f487a;

    /* JADX INFO: renamed from: a */
    private byte f488a;

    /* JADX INFO: renamed from: b */
    private byte f489b;

    /* JADX INFO: renamed from: a */
    private final C0049q f490a;

    public C0044l(C0049q c0049q, byte[] bArr, byte b) {
        super(c0049q);
        this.f490a = c0049q;
        this.f487a = null;
        this.f488a = (byte) 0;
        this.f489b = (byte) -1;
        this.f487a = bArr;
        this.f489b = C0049q.m597a(c0049q, b);
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final void mo159a(Graphics graphics) {
        C0001a c0001aM588a;
        if (C0049q.m598a(this.f490a, this.f489b) && (c0001aM588a = this.f490a.m588a(this.f489b)) != null) {
            if (this.f488a == 0) {
                C0049q.m599a(this.f490a)[c0001aM588a.mo22a()][c0001aM588a.mo23b()] = (byte) (C0049q.m599a(this.f490a)[c0001aM588a.mo22a()][c0001aM588a.mo23b()] & (-128));
            }
            c0001aM588a.m30c(C0049q.m573a(this.f487a[this.f488a]));
            c0001aM588a.m29b(C0049q.m574b(this.f487a[this.f488a]));
            c0001aM588a.mo52a(graphics, C0049q.m600a(this.f490a, c0001aM588a.mo22a()), (short) (C0049q.m601b(this.f490a, c0001aM588a.mo23b()) - 30), (short) -126);
            this.f488a = (byte) (this.f488a + 1);
            if (this.f488a > this.f487a.length - 1) {
                this.f487a = null;
                this.f488a = (byte) 0;
                C0049q.m599a(this.f490a)[c0001aM588a.mo22a()][c0001aM588a.mo23b()] = (byte) ((C0049q.m599a(this.f490a)[c0001aM588a.mo22a()][c0001aM588a.mo23b()] & (-128)) | this.f489b);
                this.f489b = (byte) -1;
            }
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final boolean mo160a() {
        if (this.f487a == null || !C0049q.m598a(this.f490a, this.f489b) || this.f488a >= this.f487a.length) {
            return super.mo160a();
        }
        return false;
    }

    @Override // mobak.p000a.p002b.AbstractC0045m
    /* JADX INFO: renamed from: a */
    final void mo161a() {
        this.f487a = null;
    }
}
