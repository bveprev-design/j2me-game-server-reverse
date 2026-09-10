package mobak.p000a.p002b.p003a;

import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.a.h */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/h.class */
public final class C0015h extends AbstractC0012e {

    /* JADX INFO: renamed from: b */
    private C0035c f195b;

    /* JADX INFO: renamed from: c */
    private C0035c f196c;

    /* JADX INFO: renamed from: d */
    private C0035c f197d;

    /* JADX INFO: renamed from: a */
    public C0031x[] f198a;

    /* JADX INFO: renamed from: a */
    private short[][] f199a;

    /* JADX INFO: renamed from: a */
    private String[][] f200a;

    /* JADX INFO: renamed from: b */
    private int f201b;

    /* JADX INFO: renamed from: c */
    private int f202c;

    /* JADX INFO: renamed from: d */
    private String f203d;

    /* JADX INFO: renamed from: e */
    private String f204e;

    /* JADX INFO: renamed from: b */
    private short[][] f205b;

    /* JADX INFO: renamed from: b */
    private String[][] f206b;

    /* JADX INFO: renamed from: b */
    private boolean f207b;

    /* JADX INFO: renamed from: a */
    private byte f208a;

    /* JADX INFO: renamed from: c */
    private boolean f209c;

    /* JADX INFO: renamed from: a */
    int f210a;

    public C0015h(int i, int i2) {
        this.f198a = null;
        this.f207b = false;
        this.f208a = (byte) 0;
        this.f210a = 16773632;
        this.f202c = i2;
        this.f201b = 0;
        this.f207b = true;
        m220n();
    }

    public C0015h(int i) {
        this.f198a = null;
        this.f207b = false;
        this.f208a = (byte) 0;
        this.f210a = 16773632;
        this.f201b = i;
        this.f202c = i;
        m220n();
    }

    /* JADX INFO: renamed from: n */
    private void m220n() {
        this.f203d = String.valueOf(this.f201b);
        this.f204e = String.valueOf(this.f202c);
        this.f195b = new C0035c((short) 16, (byte) m190a(), (short) (RunnableC0037e.f360a.getWidth() - 32), (short) ((RunnableC0037e.f360a.getHeight() - m190a()) - C0025r.m274a()), false, false);
        this.f195b.f352a = 10;
        this.f195b.m402a(new StringBuffer().append(C0066a.m773a(134)).append(":    \f4").append(this.f203d).append(" / ").append(this.f204e).toString(), AbstractC0041i.f442b, false, -1);
        this.f195b.m403a("separator.png", (short) (this.f195b.mo251b() / 2), (short) (this.f195b.f352a + (RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f138b)) << 2)), (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 3);
        this.f195b.f352a += RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f138b)) * 5;
        this.f196c = new C0035c((short) 16, (byte) this.f195b.f352a, (short) (RunnableC0037e.f360a.getWidth() - 32), (short) 55, false, false);
        this.f195b.m404a(this.f196c);
        this.f196c.f352a = 2;
        this.f205b = new short[C0005e.f76a.f94a.length][2];
        this.f206b = new String[C0005e.f76a.f94a.length][2];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= C0005e.f76a.f94a.length) {
                break;
            }
            this.f196c.m401a(new StringBuffer().append(C0005e.f76a.f94a[b2].f74a).append("\f4").append(String.valueOf(C0005e.f76a.f94a[b2].f75b)).append("\f7\u0000").toString(), AbstractC0041i.f442b, (byte) 2, false, -1);
            this.f205b[b2][0] = (short) C0005e.f76a.f94a[b2].f73a;
            this.f206b[b2][0] = String.valueOf((int) this.f205b[b2][0]);
            b = (byte) (b2 + 1);
        }
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= C0005e.f76a.f94a.length * 3) {
                break;
            }
            if (b4 % 3 != 0 && this.f196c.m406a((int) b4) != null) {
                if (b4 % 3 == 1) {
                    this.f196c.m406a((int) b4).f355a = (short) (((RunnableC0037e.f360a.getWidth() - 32) * 60) / 100);
                } else if (b4 % 3 == 2) {
                    this.f196c.m406a((int) b4).f355a = (short) (((RunnableC0037e.f360a.getWidth() - 32) * 80) / 100);
                }
            }
            b3 = (byte) (b4 + 1);
        }
        this.f195b.f352a += this.f196c.f352a + 2;
        this.f199a = new short[C0005e.f76a.f95b.length][2];
        this.f200a = new String[C0005e.f76a.f95b.length][2];
        this.f195b.m403a("separator.png", (short) (this.f195b.mo251b() / 2), (short) (this.f195b.f352a + (RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f138b)) << 1)), (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 3);
        this.f195b.f352a += RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f138b)) * 5;
        this.f195b.m402a(new StringBuffer().append(C0066a.m773a(104)).append(":").toString(), AbstractC0041i.f442b, false, -1);
        this.f197d = new C0035c((short) 16, (byte) this.f195b.f352a, (short) (RunnableC0037e.f360a.getWidth() - 32), (short) 100, false, false);
        this.f197d.f352a = 2;
        this.f195b.m404a(this.f197d);
        byte b5 = 0;
        while (true) {
            byte b6 = b5;
            if (b6 >= C0005e.f76a.f95b.length) {
                break;
            }
            this.f197d.m401a(new StringBuffer().append(C0005e.f76a.f95b[b6].f74a).append("\f4").append(String.valueOf(C0005e.f76a.f95b[b6].f75b)).append("\f7\u0000").toString(), AbstractC0041i.f442b, (byte) 2, false, -1);
            this.f199a[b6][0] = (short) C0005e.f76a.f95b[b6].f73a;
            this.f200a[b6][0] = String.valueOf((int) this.f199a[b6][0]);
            b5 = (byte) (b6 + 1);
        }
        byte b7 = 0;
        while (true) {
            byte b8 = b7;
            if (b8 >= C0005e.f76a.f95b.length * 3) {
                this.f209c = false;
                this.f196c.m406a(0).m415a(this.f210a, 2);
                ((AbstractC0041i) this).f456a = new C0025r(new byte[]{81}, new byte[]{55}, null);
                ((AbstractC0012e) this).f166a = C0066a.m773a(144);
                ((AbstractC0041i) this).f456a.m285a((short) 148, (byte) 55);
                return;
            }
            if (b8 % 3 != 0 && this.f197d.m406a((int) b8) != null) {
                if (b8 % 3 == 1) {
                    this.f197d.m406a((int) b8).f355a = (short) (((RunnableC0037e.f360a.getWidth() - 32) * 60) / 100);
                } else if (b8 % 3 == 2) {
                    this.f197d.m406a((int) b8).f355a = (short) (((RunnableC0037e.f360a.getWidth() - 32) * 80) / 100);
                }
            }
            b7 = (byte) (b8 + 1);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final void mo202a(int i) {
        if (!this.f209c) {
            if (RunnableC0037e.f360a.getGameAction(i) == 6) {
                if (this.f208a < (this.f205b.length << 1)) {
                    m222a((byte) (this.f208a + 3));
                    return;
                } else {
                    m222a((byte) 0);
                    return;
                }
            }
            if (RunnableC0037e.f360a.getGameAction(i) == 1) {
                if (this.f208a > 0) {
                    m222a((byte) (this.f208a - 3));
                    return;
                } else {
                    m222a((byte) ((this.f205b.length - 1) * 3));
                    return;
                }
            }
            return;
        }
        if (RunnableC0037e.f360a.getGameAction(i) == 1) {
            if (this.f201b <= 0) {
                RunnableC0037e.m427a(C0066a.m773a(135), C0066a.m773a(136));
                return;
            }
            this.f201b--;
            this.f203d = String.valueOf(this.f201b);
            short[] sArr = this.f205b[this.f208a / 3];
            sArr[1] = (short) (sArr[1] + 1);
            this.f206b[this.f208a / 3][1] = String.valueOf((int) this.f205b[this.f208a / 3][1]);
            ((C0022o) this.f195b.m406a(1)).f241a = new StringBuffer().append(this.f203d).append(" / ").append(this.f204e).toString();
            C0022o c0022o = (C0022o) this.f196c.m406a((int) ((byte) (2 + this.f208a)));
            if (this.f205b[this.f208a / 3][1] == 0) {
                c0022o.f241a = " ";
            } else if (this.f205b[this.f208a / 3][1] > 0) {
                c0022o.f241a = new StringBuffer().append("+").append(this.f206b[this.f208a / 3][1]).toString();
            } else {
                c0022o.f241a = this.f206b[this.f208a / 3][1];
            }
            if (this.f198a == null) {
                return;
            }
            int[][] iArr = null;
            if (this.f208a / 3 >= 0 && this.f208a / 3 < this.f198a.length) {
                iArr = this.f198a[this.f208a / 3].f319a;
            }
            if (iArr == null) {
                return;
            }
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= iArr.length) {
                    return;
                }
                byte b3 = 0;
                while (true) {
                    byte b4 = b3;
                    if (b4 >= this.f199a.length) {
                        break;
                    }
                    if (this.f199a[b4][0] == iArr[b2][0]) {
                        short[] sArr2 = this.f199a[b4];
                        sArr2[1] = (short) (sArr2[1] + iArr[b2][1]);
                        this.f200a[b4][1] = String.valueOf((int) this.f199a[b4][1]);
                        C0022o c0022o2 = (C0022o) this.f197d.m406a((int) ((byte) (2 + (b4 * 3))));
                        if (this.f199a[b4][1] <= 0) {
                            c0022o2.f241a = this.f200a[b4][1];
                            break;
                        } else {
                            c0022o2.f241a = new StringBuffer().append("+").append(this.f200a[b4][1]).toString();
                            break;
                        }
                    }
                    b3 = (byte) (b4 + 1);
                }
                b = (byte) (b2 + 1);
            }
        } else {
            if (RunnableC0037e.f360a.getGameAction(i) != 6) {
                return;
            }
            if (this.f201b + 1 > this.f202c) {
                RunnableC0037e.m427a(C0066a.m773a(135), C0066a.m773a(137));
                return;
            }
            if (this.f205b[this.f208a / 3][1] == 0 && !this.f207b) {
                return;
            }
            if (this.f207b && !m221b()) {
                return;
            }
            this.f201b++;
            this.f203d = String.valueOf(this.f201b);
            short[] sArr3 = this.f205b[this.f208a / 3];
            sArr3[1] = (short) (sArr3[1] - 1);
            this.f206b[this.f208a / 3][1] = String.valueOf((int) this.f205b[this.f208a / 3][1]);
            ((C0022o) this.f195b.m406a(1)).f241a = new StringBuffer().append(this.f203d).append(" / ").append(this.f204e).toString();
            C0022o c0022o3 = (C0022o) this.f196c.m406a((int) ((byte) (2 + this.f208a)));
            if (this.f205b[this.f208a / 3][1] == 0) {
                c0022o3.f241a = " ";
            } else if (this.f205b[this.f208a / 3][1] > 0) {
                c0022o3.f241a = new StringBuffer().append("+").append(this.f206b[this.f208a / 3][1]).toString();
            } else {
                c0022o3.f241a = this.f206b[this.f208a / 3][1];
            }
            if (this.f198a == null) {
                return;
            }
            int[][] iArr2 = null;
            if (this.f208a / 3 >= 0 && this.f208a / 3 < this.f198a.length) {
                iArr2 = this.f198a[this.f208a / 3].f319a;
            }
            if (iArr2 == null) {
                return;
            }
            byte b5 = 0;
            while (true) {
                byte b6 = b5;
                if (b6 >= iArr2.length) {
                    return;
                }
                byte b7 = 0;
                while (true) {
                    byte b8 = b7;
                    if (b8 >= this.f199a.length) {
                        break;
                    }
                    if (this.f199a[b8][0] == iArr2[b6][0]) {
                        short[] sArr4 = this.f199a[b8];
                        sArr4[1] = (short) (sArr4[1] - iArr2[b6][1]);
                        this.f200a[b8][1] = String.valueOf((int) this.f199a[b8][1]);
                        C0022o c0022o4 = (C0022o) this.f197d.m406a((int) ((byte) (2 + (b8 * 3))));
                        if (this.f199a[b8][1] == 0) {
                            c0022o4.f241a = "";
                            break;
                        } else if (this.f199a[b8][1] <= 0) {
                            c0022o4.f241a = this.f200a[b8][1];
                            break;
                        } else {
                            c0022o4.f241a = new StringBuffer().append("+").append(this.f200a[b8][1]).toString();
                            break;
                        }
                    }
                    b7 = (byte) (b8 + 1);
                }
                b5 = (byte) (b6 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m221b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f205b.length; i2++) {
            if (this.f205b[i2][1] < 0) {
                i += this.f205b[i2][1];
            }
        }
        if ((this.f202c + i <= 0 && this.f205b[this.f208a / 3][1] <= 0) || (C0005e.m105a(C0005e.f76a.f94a, (byte) this.f205b[this.f208a / 3][0]).f75b + this.f205b[this.f208a / 3][1]) - 1 < 0) {
            return false;
        }
        if (this.f198a == null) {
            return true;
        }
        int[][] iArr = null;
        if (this.f208a / 3 >= 0 && this.f208a / 3 < this.f198a.length) {
            iArr = this.f198a[this.f208a / 3].f319a;
        }
        if (iArr == null) {
            return true;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= iArr.length) {
                return true;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 >= this.f199a.length) {
                    break;
                }
                if (this.f199a[b4][0] == iArr[b2][0]) {
                    if ((C0005e.m105a(C0005e.f76a.f95b, (byte) this.f199a[this.f208a / 3][0]).f75b + this.f199a[this.f208a / 3][1]) - iArr[b2][1] >= 0) {
                        break;
                    }
                    return false;
                }
                b3 = (byte) (b4 + 1);
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m222a(byte b) {
        if (this.f196c.m407a(b)) {
            this.f196c.m406a((int) this.f208a).m416d();
            this.f208a = b;
            this.f196c.m406a((int) this.f208a).m415a(this.f210a, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case 55:
                if (this.f201b != 0) {
                    RunnableC0037e.m431a(new StringBuffer().append(C0066a.m773a(135)).append("!").toString(), C0066a.m773a(145), new StringBuffer().append(C0066a.m773a(41)).append("?").toString(), new C0017j(this));
                } else {
                    if (this.f207b) {
                        short s = 0;
                        short s2 = 0;
                        byte b = 0;
                        while (true) {
                            byte b2 = b;
                            if (b2 < this.f205b.length) {
                                if (this.f205b[b2][1] < 0) {
                                    s = (short) (s + this.f205b[b2][1]);
                                }
                                if (this.f205b[b2][1] > 0) {
                                    s2 = (short) (s2 + this.f205b[b2][1]);
                                }
                                b = (byte) (b2 + 1);
                            } else {
                                if (!((-s) == this.f202c && s2 == (-s) && s < 0)) {
                                    RunnableC0037e.m431a(new StringBuffer().append(C0066a.m773a(135)).append("!").toString(), C0066a.m773a(145), new StringBuffer().append(C0066a.m773a(41)).append("?").toString(), new C0017j(this));
                                }
                            }
                        }
                    }
                    m224d();
                    RunnableC0037e.f360a.m443f();
                    this.f210a = 16773632;
                }
                return true;
            case 81:
                if (this.f209c) {
                    this.f210a = 16773632;
                } else {
                    this.f210a = 255;
                }
                this.f209c = !this.f209c;
                this.f196c.m406a((int) this.f208a).m415a(this.f210a, 2);
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: c */
    public final void mo223c() {
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        try {
            super.mo169a(graphics);
            this.f195b.m395a(graphics, (byte) 0);
            ((AbstractC0041i) this).f456a.m291a(graphics);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("HeroIncrease ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: d */
    void m224d() {
        C0058g c0058g = new C0058g(C0059h.f576a[53], (short) (4 * this.f205b.length), (short) 0);
        try {
            c0058g.m672a((byte) this.f205b.length);
            for (byte b = 0; b < this.f205b.length; b = (byte) (b + 1)) {
                c0058g.m671b(this.f205b[b][0]);
                c0058g.m671b(this.f205b[b][1]);
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("sendSelection").append(e.toString()).toString());
        }
        C0063c.f597a.m749a(c0058g);
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        return false;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        return false;
    }
}
