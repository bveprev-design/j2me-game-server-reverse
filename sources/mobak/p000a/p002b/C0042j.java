package mobak.p000a.p002b;

import java.util.Random;
import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.p000a.p001a.C0005e;
import mobak.p004b.C0063c;

/* JADX INFO: renamed from: mobak.a.b.j */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/j.class */
public final class C0042j extends C0038f {

    /* JADX INFO: renamed from: a */
    private byte f469a;

    /* JADX INFO: renamed from: a */
    private byte[][] f470a;

    /* JADX INFO: renamed from: c */
    private byte f472c;

    /* JADX INFO: renamed from: d */
    private byte f473d;

    /* JADX INFO: renamed from: a */
    private Random f468a = null;

    /* JADX INFO: renamed from: a */
    private boolean f475a = true;

    /* JADX INFO: renamed from: e */
    private byte f476e = 0;

    /* JADX INFO: renamed from: b */
    private byte f471b = -1;

    /* JADX INFO: renamed from: b */
    private byte[][] f474b = null;

    /* JADX INFO: renamed from: a */
    private Random m564a() {
        if (this.f468a == null) {
            this.f468a = new Random();
        }
        return this.f468a;
    }

    public C0042j(byte b) {
        this.f469a = b;
    }

    @Override // mobak.p000a.p002b.C0038f
    /* JADX INFO: renamed from: a */
    public final void mo498a(Graphics graphics) {
        if (graphics != null && m497a()) {
            short sM374a = C0034b.m374a((int) m501a());
            short sM375b = C0034b.m375b((int) m502b());
            if (sM374a < 0 || sM375b < 0 || sM374a > RunnableC0037e.f360a.getWidth() || sM375b > RunnableC0037e.f360a.getHeight()) {
                return;
            }
            boolean z = m507e() == 2;
            if (RunnableC0037e.f360a.m444a()) {
                z = false;
            }
            if (z) {
                try {
                    if (this.f471b < 0 || this.f470a == null) {
                        if (m564a().nextInt(100) > 90) {
                            C0050b.m628a((C0038f) this);
                            if (this.f474b == null) {
                                this.f472c = m501a();
                                this.f473d = m502b();
                                this.f474b = C0034b.m384a(this.f472c, this.f473d, this.f469a, this.f469a);
                            }
                            if (this.f474b != null) {
                                this.f470a = null;
                                for (short s = 0; this.f470a == null && s < 10; s = (short) (s + 1)) {
                                    this.f470a = C0034b.m386a(this.f472c, this.f473d, this.f474b, (byte) (((double) m501a()) + ((double) (-this.f469a)) + (((double) (2 * this.f469a)) * m564a().nextDouble())), (byte) (((double) m502b()) + ((double) (-this.f469a)) + (((double) (2 * this.f469a)) * m564a().nextDouble())));
                                }
                                if (this.f470a != null) {
                                    this.f471b = (byte) 0;
                                }
                            }
                            C0050b.m629b((C0038f) this);
                        }
                    } else if ((this.f470a[this.f471b][0] != C0005e.f76a.m97a() || this.f470a[this.f471b][1] != C0005e.f76a.m98b()) && !RunnableC0037e.f360a.f386a.m393a(this.f470a[this.f471b][0], this.f470a[this.f471b][1])) {
                        if (this.f476e < 5) {
                            this.f476e = (byte) (this.f476e + 1);
                        } else {
                            this.f476e = (byte) 0;
                            m495b(this.f470a[this.f471b][0], this.f470a[this.f471b][1], false);
                            if (this.f475a) {
                                this.f471b = (byte) (this.f471b + 1);
                            } else {
                                this.f471b = (byte) (this.f471b - 1);
                            }
                            if (this.f471b >= this.f470a.length) {
                                this.f471b = (byte) (this.f470a.length - 1);
                                this.f475a = false;
                            }
                            if (this.f471b < 0) {
                                this.f475a = true;
                            }
                        }
                    }
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("heroObject move ").append(e).toString());
                }
            }
            super.mo498a(graphics);
        }
    }

    @Override // mobak.p000a.p002b.C0038f
    /* JADX INFO: renamed from: a */
    public final void mo494a(byte b, byte b2, boolean z) {
        this.f474b = null;
        this.f471b = (byte) -1;
        m495b(b, b2, false);
    }
}
