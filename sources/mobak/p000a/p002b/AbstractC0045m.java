package mobak.p000a.p002b;

import javax.microedition.lcdui.Graphics;

/* JADX INFO: renamed from: mobak.a.b.m */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/m.class */
public abstract class AbstractC0045m {

    /* JADX INFO: renamed from: a */
    private byte f491a = 0;

    public AbstractC0045m(C0049q c0049q) {
    }

    /* JADX INFO: renamed from: a */
    abstract void mo159a(Graphics graphics);

    /* JADX INFO: renamed from: a */
    boolean mo160a() {
        if (this.f491a > 0) {
            return true;
        }
        this.f491a = (byte) (this.f491a + 1);
        return false;
    }

    /* JADX INFO: renamed from: a */
    abstract void mo161a();
}
