package mobak.p004b;

import java.io.IOException;
import java.io.InputStream;
import mobak.Main2;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.p005a.C0057f;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.b.a */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/b/a.class */
final class RunnableC0051a implements Runnable {

    /* JADX INFO: renamed from: a */
    public InputStream f559a;

    /* JADX INFO: renamed from: b */
    private short f560b;

    /* JADX INFO: renamed from: a */
    private long f561a;

    /* JADX INFO: renamed from: a */
    private byte f562a;

    /* JADX INFO: renamed from: a */
    Thread f565a;

    /* JADX INFO: renamed from: a */
    private final C0063c f568a;

    /* JADX INFO: renamed from: a */
    public short f557a = 0;

    /* JADX INFO: renamed from: a */
    public boolean f558a = false;

    /* JADX INFO: renamed from: a */
    public int f563a = 0;

    /* JADX INFO: renamed from: b */
    private boolean f564b = true;

    /* JADX INFO: renamed from: b */
    private byte f566b = 0;

    /* JADX INFO: renamed from: a */
    byte[] f567a = new byte[C0063c.m764b() + 10];

    public RunnableC0051a(C0063c c0063c, InputStream inputStream) {
        this.f568a = c0063c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [short] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: a */
    private short m648a(int i, int i2) {
        this.f568a.m751a();
        ?? M765a = C0063c.m765a(this.f568a);
        if (M765a == 0) {
            return (short) 0;
        }
        try {
            if (this.f559a.available() <= 0) {
                return (short) 0;
            }
            M765a = (short) this.f559a.read(this.f567a, i, i2);
            return M765a;
        } catch (IOException e) {
            C0063c.m744a(new StringBuffer().append("readData: ").append(e.getMessage()).toString(), false);
            return (short) 0;
        } catch (Error e2) {
            C0063c.m746a(M765a.getMessage());
            return (short) 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? M768c;
        short sM648a;
        boolean z = false;
        short s = 0;
        short s2 = C0063c.f591a;
        while (!Main2.f1a && C0063c.m767b(this.f568a) && (M768c = C0063c.m768c(this.f568a)) == 0) {
            try {
                Thread.sleep(200L);
                M768c = this.f568a.f612a;
                if (M768c != 0) {
                    this.f568a.m748a();
                    if (this.f568a.m751a()) {
                        C0058g c0058g = new C0058g(C0059h.f576a[55]);
                        c0058g.m670a(C0005e.f76a.f84a);
                        c0058g.m671b(this.f560b);
                        this.f568a.m749a(c0058g);
                    } else {
                        C0063c.m769a(this.f568a);
                    }
                    if (C0063c.m770b(this.f568a) > C0063c.f594b) {
                        RunnableC0037e.m428a(C0066a.m773a(29), C0066a.m773a(31), new C0064d(this));
                        this.f568a.f612a = false;
                    } else {
                        Thread.sleep(5000L);
                    }
                }
                if (C0063c.m765a(this.f568a) && !this.f568a.f612a && !this.f564b && System.currentTimeMillis() - this.f561a > (this.f562a + 1) * C0063c.f593a * 1000 && C0005e.f76a != null) {
                    if (this.f562a > C0063c.f594b) {
                        C0063c.m766a(this.f568a);
                    } else {
                        this.f562a = (byte) (this.f562a + 1);
                        this.f568a.m749a(new C0058g(C0059h.f576a[54], (short) 0, (short) 0));
                    }
                }
                while (this.f559a != null && (sM648a = m648a(s, s2)) > 0 && C0063c.m765a(this.f568a)) {
                    this.f561a = System.currentTimeMillis();
                    this.f564b = false;
                    this.f562a = (byte) 0;
                    s = (short) (s + sM648a);
                    this.f563a += sM648a;
                    this.f558a = true;
                    if (z) {
                        short s3 = (short) (s2 - sM648a);
                        s2 = s3;
                        if (s3 == 0) {
                            m649a();
                            s = 0;
                            s2 = C0063c.f591a;
                            z = false;
                        }
                    } else {
                        if (sM648a != C0063c.f591a) {
                            s2 = (short) (s2 - sM648a);
                        }
                        if (s == C0063c.f591a) {
                            this.f557a = (short) (((127 & this.f567a[0]) << 8) | (255 & this.f567a[1]));
                            s2 = (short) (((127 & this.f567a[4]) << 8) | (255 & this.f567a[5]));
                            z = true;
                        }
                    }
                    Thread.sleep(100L);
                }
                this.f558a = false;
            } catch (Error e) {
                C0063c.m746a(M768c.getMessage());
            } catch (Exception e2) {
                C0063c.m746a(new StringBuffer().append("inputRun ").append(e2.toString()).toString());
            }
        }
        this.f565a = null;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m649a() {
        try {
            byte bM742a = C0063c.m742a(this.f567a);
            if (this.f566b == 0) {
                this.f566b = bM742a;
            }
            C0057f.m650a(this.f567a);
            this.f566b = (byte) (this.f566b - 1);
            if (C0057f.m654a() == C0063c.f597a.f607c && C0063c.f597a.f608a > 0) {
                C0063c.f597a.f608a = System.currentTimeMillis();
                RunnableC0037e.m446a((short) (((bM742a - this.f566b) * 100) / bM742a));
            }
            if (this.f566b == 0) {
                try {
                    boolean zM455c = RunnableC0037e.f360a.m455c();
                    short sM654a = C0057f.m654a();
                    short sM655b = C0057f.m655b();
                    C0059h.m677a();
                    if (this.f568a.m743a(sM654a)) {
                        this.f568a.m755c();
                    }
                    if (sM655b != 0) {
                        this.f568a.m750a(sM655b, zM455c);
                    }
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("compileGameCommand: ").append(e.getMessage()).toString());
                }
                this.f560b = this.f557a;
                this.f557a = (short) 0;
            }
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append("putPkg ").append(e2.getMessage()).toString());
        }
    }
}
