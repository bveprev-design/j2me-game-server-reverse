package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.C0050b;
import mobak.p000a.p002b.AbstractC0036d;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;

/* JADX INFO: renamed from: mobak.a.b.a.u */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/u.class */
public final class C0028u extends AbstractC0036d {

    /* JADX INFO: renamed from: a */
    private String f279a;

    /* JADX INFO: renamed from: a */
    private Image f280a;

    /* JADX INFO: renamed from: b */
    private byte f281b;

    /* JADX INFO: renamed from: c */
    private byte f282c;

    /* JADX INFO: renamed from: d */
    private byte f283d;

    /* JADX INFO: renamed from: e */
    private byte f284e;

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final short mo252a() {
        return this.f284e;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: b */
    public final short mo251b() {
        return this.f283d;
    }

    public C0028u(String str, short s, short s2, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f279a = str;
        ((AbstractC0036d) this).f355a = s;
        ((AbstractC0036d) this).f356b = s2;
        this.f281b = b;
        this.f282c = b2;
        this.f283d = b3;
        this.f284e = b4;
        ((AbstractC0036d) this).f359a = b5;
        ((AbstractC0036d) this).f357b = -16777216;
        super.f358c = 0;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final void mo250a(Graphics graphics, short s, short s2, byte b) {
        if (graphics == null || this.f279a == null) {
            return;
        }
        if (this.f280a == null && !this.f279a.equals("")) {
            try {
                this.f280a = C0050b.m638a(C0050b.m633a(this.f279a));
                if ((this.f281b != 0 || this.f282c != 0 || this.f283d != 0 || this.f284e != 0) && (this.f281b != 0 || this.f282c != 0 || this.f283d != RunnableC0037e.m476a(this.f280a) || this.f284e != RunnableC0037e.m477b(this.f280a))) {
                    this.f280a = Image.createImage(this.f280a, this.f281b, this.f282c, this.f283d, this.f284e, 0);
                }
            } catch (Exception e) {
                C0063c.m746a(new StringBuffer().append("drawTTS").append(e.toString()).toString());
                this.f280a = null;
                this.f279a = "";
            }
        }
        if (this.f280a == null) {
            return;
        }
        if (b == 0) {
            RunnableC0037e.m466a(graphics, this.f280a, ((AbstractC0036d) this).f355a - s, ((AbstractC0036d) this).f356b - s2, ((AbstractC0036d) this).f359a);
        } else {
            RunnableC0037e.m466a(graphics, this.f280a, ((AbstractC0036d) this).f355a - s, ((AbstractC0036d) this).f356b - s2, b);
        }
        if (((AbstractC0036d) this).f357b == -16777216) {
            return;
        }
        int iM479a = RunnableC0037e.m479a(graphics);
        RunnableC0037e.m478a(graphics, ((AbstractC0036d) this).f357b);
        byte b2 = 1;
        while (true) {
            byte b3 = b2;
            if (b3 > super.f358c) {
                RunnableC0037e.m478a(graphics, iM479a);
                return;
            } else {
                graphics.drawRect((((AbstractC0036d) this).f355a - s) - b3, (((AbstractC0036d) this).f356b - s2) - b3, RunnableC0037e.m476a(this.f280a) + (b3 * 2), RunnableC0037e.m477b(this.f280a) + (b3 * 2));
                b2 = (byte) (b3 + 1);
            }
        }
    }
}
