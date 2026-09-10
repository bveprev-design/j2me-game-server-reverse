package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.p000a.p002b.AbstractC0036d;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p006c.C0069d;

/* JADX INFO: renamed from: mobak.a.b.a.o */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/o.class */
public final class C0022o extends AbstractC0036d {

    /* JADX INFO: renamed from: a */
    String f241a;

    /* JADX INFO: renamed from: a */
    private C0069d f242a;

    /* JADX INFO: renamed from: a */
    public int f243a = -1;

    /* JADX INFO: renamed from: d */
    private int f244d;

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final void mo250a(Graphics graphics, short s, short s2, byte b) {
        if (graphics == null || this.f241a == null || this.f242a == null) {
            return;
        }
        if (this.f243a >= 0) {
            RunnableC0037e.m478a(graphics, this.f243a);
            graphics.fillRect(((AbstractC0036d) this).f355a - s, ((AbstractC0036d) this).f356b - s2, mo251b(), mo252a());
        }
        if (this.f241a.equals("")) {
            return;
        }
        if (b == 0) {
            this.f242a.m782a(graphics, this.f241a, ((AbstractC0036d) this).f355a - s, ((AbstractC0036d) this).f356b - s2, ((AbstractC0036d) this).f359a);
        } else {
            this.f242a.m782a(graphics, this.f241a, ((AbstractC0036d) this).f355a - s, ((AbstractC0036d) this).f356b - s2, b);
        }
        if (((AbstractC0036d) this).f357b == -16777216) {
            return;
        }
        int iM479a = RunnableC0037e.m479a(graphics);
        RunnableC0037e.m478a(graphics, ((AbstractC0036d) this).f357b);
        byte b2 = 1;
        while (true) {
            byte b3 = b2;
            if (b3 > this.f358c) {
                RunnableC0037e.m478a(graphics, iM479a);
                return;
            } else {
                graphics.drawRect((((AbstractC0036d) this).f355a - s) - b3, (((AbstractC0036d) this).f356b - s2) - b3, this.f242a.m781a(this.f241a.trim()) + (b3 * 2), this.f242a.f634a + (b3 * 2));
                b2 = (byte) (b3 + 1);
            }
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: b */
    public final short mo251b() {
        if (this.f242a == null || this.f241a == null) {
            return (short) 0;
        }
        return (short) this.f242a.m781a(this.f241a);
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final short mo252a() {
        if (this.f242a == null || this.f241a == null) {
            return (short) 0;
        }
        return (short) this.f242a.f634a;
    }

    public C0022o(String str, short s, short s2, C0069d c0069d, int i) {
        if (str.equals("\u0000")) {
            this.f241a = "";
        } else {
            this.f241a = str;
        }
        ((AbstractC0036d) this).f355a = s;
        ((AbstractC0036d) this).f356b = s2;
        this.f242a = c0069d;
        ((AbstractC0036d) this).f357b = -16777216;
        this.f358c = 0;
        this.f244d = i;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final boolean mo253a(C0069d c0069d) {
        return c0069d == this.f242a;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final String mo254a() {
        return this.f241a;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: b */
    public final int mo255b() {
        return this.f244d;
    }
}
