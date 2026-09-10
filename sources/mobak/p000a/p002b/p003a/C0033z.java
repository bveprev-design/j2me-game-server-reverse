package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0001a;
import mobak.p000a.p001a.C0006f;
import mobak.p000a.p002b.AbstractC0036d;
import mobak.p000a.p002b.RunnableC0037e;

/* JADX INFO: renamed from: mobak.a.b.a.z */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/z.class */
public final class C0033z extends AbstractC0036d {

    /* JADX INFO: renamed from: c */
    private short f321c;

    public C0033z(short s, short s2, short s3) {
        this.f321c = s;
        ((AbstractC0036d) this).f355a = s2;
        ((AbstractC0036d) this).f356b = s3;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final void mo250a(Graphics graphics, short s, short s2, byte b) {
        short sM482d = (short) RunnableC0037e.m482d(graphics);
        short sM480b = (short) RunnableC0037e.m480b(graphics);
        graphics.setClip((short) (((AbstractC0036d) this).f355a - s), RunnableC0037e.m481c(graphics), 42, RunnableC0037e.m483e(graphics));
        if (((AbstractC0036d) this).f359a == 1) {
            short s3 = (short) (((AbstractC0036d) this).f355a - s);
            short s4 = (short) (((AbstractC0036d) this).f356b - s2);
            AbstractC0012e.m184a(graphics, (int) s3, (int) s4, 0);
            RunnableC0037e.m468a(graphics, C0006f.m148a(0), 0, 0, 37, 31, 0, s3 + 1, s4 + 2 + 1, 0);
        } else {
            short s5 = (short) (((AbstractC0036d) this).f355a - s);
            short s6 = (short) (((AbstractC0036d) this).f356b - s2);
            AbstractC0012e.m184a(graphics, (int) s5, (int) s6, 0);
            byte bM640a = (byte) (20 - C0050b.m640a((byte) 5, 4));
            RunnableC0037e.m468a(graphics, C0001a.m21a((byte) 5), 200, 28, (41 - bM640a) - 2, 28, 0, s5 + bM640a, s6 + 3 + 1, 0);
        }
        AbstractC0003c.m83a(this.f321c, graphics, (short) (((AbstractC0036d) this).f355a - s), (short) (((AbstractC0036d) this).f356b - s2));
        graphics.setClip(sM480b, RunnableC0037e.m481c(graphics), sM482d, RunnableC0037e.m483e(graphics));
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final short mo252a() {
        return (short) 43;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: b */
    public final short mo251b() {
        return (short) 42;
    }
}
