package mobak;

import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;
import mobak.p006c.C0071f;

/* JADX INFO: renamed from: mobak.f */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/f.class */
public final class RunnableC0076f implements Runnable {

    /* JADX INFO: renamed from: a */
    public byte f639a;

    /* JADX INFO: renamed from: a */
    public boolean f640a;

    /* JADX INFO: renamed from: a */
    private C0065c f641a;

    /* JADX INFO: renamed from: a */
    private final Main2 f642a;

    RunnableC0076f(Main2 main2, byte b) {
        this.f642a = main2;
        this.f639a = (byte) 0;
        this.f639a = b;
    }

    RunnableC0076f(Main2 main2, C0065c c0065c) {
        this.f642a = main2;
        this.f639a = (byte) 0;
        this.f639a = (byte) 3;
        this.f641a = c0065c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v38 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? string;
        this.f640a = true;
        while (!Main2.f1a && this.f640a) {
            try {
                Thread.sleep(300L);
                if (this.f639a != 0) {
                    if (this.f639a == 1 || this.f639a == 3) {
                        RunnableC0037e.f360a.m445a(true, true);
                    }
                    byte b = 0;
                    while (true) {
                        byte b2 = b;
                        if (b2 < C0063c.f594b) {
                            try {
                                C0063c.f597a.m748a();
                                if (C0063c.f597a.m763d()) {
                                    this.f640a = false;
                                    RunnableC0037e.f360a.m447a(true);
                                    return;
                                }
                                ?? r0 = C0063c.f597a.f612a;
                                if (r0 == 0) {
                                    C0063c.f597a.m753b();
                                    if (RunnableC0037e.f360a == null) {
                                        RunnableC0037e runnableC0037e = new RunnableC0037e();
                                        RunnableC0037e.f360a = runnableC0037e;
                                        runnableC0037e.m418b();
                                    }
                                    if (this.f639a == 1) {
                                        this.f642a.f3b = false;
                                        int iM791a = this.f642a.f6a.m791a((byte) 9, -1);
                                        boolean z = false;
                                        if (iM791a > 0) {
                                            try {
                                                byte[] bArrM795a = this.f642a.f6a.m795a((byte) 8);
                                                short sM799a = C0071f.m799a(bArrM795a, 0, (short) -1);
                                                if (sM799a > 0) {
                                                    String strM800a = C0071f.m800a(bArrM795a, 2, sM799a, "");
                                                    int i = sM799a + 6;
                                                    AbstractC0041i.f449c = strM800a;
                                                    byte[] bArr = new byte[2500];
                                                    System.arraycopy(bArrM795a, i, bArr, 0, 2500);
                                                    C0050b.m619a(bArr);
                                                    z = true;
                                                }
                                            } catch (Exception e) {
                                                C0063c.m746a(new StringBuffer().append("dialup ").append(e.toString()).toString());
                                            }
                                        }
                                        short s = C0059h.f576a[20];
                                        if (!z) {
                                            s = C0059h.f576a[21];
                                        }
                                        C0058g c0058g = new C0058g(C0059h.f576a[0], (short) 16, s, true);
                                        c0058g.m674a("1.19.0");
                                        c0058g.m674a(C0005e.f76a.f85b);
                                        c0058g.m674a(this.f642a.f4a);
                                        if (z) {
                                            c0058g.m670a(iM791a);
                                        } else {
                                            c0058g.m670a(-1);
                                        }
                                        c0058g.m672a((byte) 4);
                                        c0058g.m674a("1.19.0");
                                        C0063c.f597a.m749a(c0058g);
                                        this.f642a.f7a = null;
                                    } else if (this.f639a == 3) {
                                        C0065c c0065c = this.f641a;
                                        this.f642a.f3b = true;
                                        C0058g c0058g2 = new C0058g(C0059h.f576a[0], (short) 16, C0059h.f576a[21], true);
                                        c0058g2.m674a("1.19.0");
                                        c0058g2.m674a(c0065c.f616b);
                                        c0058g2.m674a(c0065c.f617c);
                                        c0058g2.m670a(-1);
                                        c0058g2.m672a((byte) 4);
                                        c0058g2.m674a("1.19.0");
                                        c0058g2.m674a(c0065c.f615a);
                                        c0058g2.m674a(c0065c.f618d);
                                        c0058g2.m672a(c0065c.f619a);
                                        Main2 main2 = this.f642a;
                                        c0058g2.m674a(Main2.m6a());
                                        try {
                                            c0058g2.m673a(Long.parseLong(this.f642a.m15a("refID", "0")));
                                        } catch (NumberFormatException unused) {
                                            c0058g2.m673a(0L);
                                        }
                                        C0063c.f597a.m749a(c0058g2);
                                        this.f642a.f7a = null;
                                    }
                                    this.f639a = (byte) 0;
                                    return;
                                }
                                try {
                                    r0 = 5000;
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e2) {
                                    r0.printStackTrace();
                                }
                                string = new StringBuffer().append("connection").append(e.toString()).toString();
                                C0063c.m746a((String) string);
                                try {
                                    string = 5000;
                                    Thread.sleep(5000L);
                                } catch (InterruptedException e3) {
                                    string.printStackTrace();
                                }
                            } catch (Exception e4) {
                                string = new StringBuffer().append("connection").append(e4.toString()).toString();
                                C0063c.m746a((String) string);
                                string = 5000;
                                Thread.sleep(5000L);
                            }
                            b = (byte) (b2 + 1);
                        } else {
                            RunnableC0037e.f360a.m447a(true);
                            RunnableC0037e.m428a(C0066a.m773a(29), C0066a.m773a(31), new C0078h(this));
                            if (C0063c.f597a != null) {
                                C0063c.f597a.m759e();
                            }
                            this.f639a = (byte) 0;
                        }
                    }
                }
            } catch (Exception e5) {
                C0063c.m746a(new StringBuffer().append("runCon").append(e5.toString()).toString());
            }
        }
    }
}
