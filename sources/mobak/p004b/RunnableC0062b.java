package mobak.p004b;

import java.io.IOException;
import java.io.OutputStream;
import mobak.Main2;
import mobak.p004b.p005a.C0058g;

/* JADX INFO: renamed from: mobak.b.b */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/b/b.class */
final class RunnableC0062b implements Runnable {

    /* JADX INFO: renamed from: b */
    byte f580b;

    /* JADX INFO: renamed from: c */
    private byte f584c;

    /* JADX INFO: renamed from: a */
    Thread f586a;

    /* JADX INFO: renamed from: a */
    public OutputStream f587a;

    /* JADX INFO: renamed from: a */
    private final C0063c f590a;

    /* JADX INFO: renamed from: a */
    String f577a = new String(new byte[]{1});

    /* JADX INFO: renamed from: a */
    byte[][] f578a = new byte[5][0];

    /* JADX INFO: renamed from: a */
    byte f579a = 0;

    /* JADX INFO: renamed from: c */
    private int f581c = 0;

    /* JADX INFO: renamed from: d */
    private int f582d = 0;

    /* JADX INFO: renamed from: e */
    private int f583e = 0;

    /* JADX INFO: renamed from: a */
    short f585a = 1;

    /* JADX INFO: renamed from: a */
    public int f588a = 0;

    /* JADX INFO: renamed from: b */
    public int f589b = 0;

    public RunnableC0062b(C0063c c0063c, OutputStream outputStream) {
        this.f590a = c0063c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: a */
    private boolean m740a(byte[] bArr, byte[] bArr2, int i, int i2) {
        this.f590a.m751a();
        ?? M765a = C0063c.m765a(this.f590a);
        if (M765a == 0) {
            return false;
        }
        try {
            this.f587a.write(bArr);
            this.f587a.write(bArr2, i, i2);
            this.f587a.flush();
            M765a = 1;
            return true;
        } catch (IOException e) {
            C0063c.m766a(this.f590a);
            C0063c.m744a(new StringBuffer().append("sendData ").append(e.getMessage()).toString(), false);
            return false;
        } catch (Error e2) {
            C0063c.m746a(M765a.getMessage());
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!Main2.f1a && C0063c.m767b(this.f590a)) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                C0063c.m744a(new StringBuffer().append("Thread interrup: ").append(e.getMessage()).toString(), false);
            }
            if (C0063c.m768c(this.f590a)) {
                boolean z = this.f580b <= 0;
                boolean z2 = z;
                if (z) {
                    byte b = 0;
                    while (true) {
                        byte b2 = b;
                        if (b2 < this.f578a.length) {
                            if (this.f578a[b2] != null && this.f578a[b2].length > 0) {
                                z2 = false;
                                break;
                            }
                            b = (byte) (b2 + 1);
                        } else {
                            break;
                        }
                    }
                }
                if (z2) {
                    this.f590a.m759e();
                    break;
                }
            }
            if (this.f580b > 0) {
                short s = 0;
                while (this.f580b > 0 && C0063c.m765a(this.f590a) && !this.f590a.f612a) {
                    if (this.f584c >= this.f578a.length) {
                        this.f584c = (byte) -1;
                    }
                    if (this.f584c < 0) {
                        byte b3 = 0;
                        while (true) {
                            byte b4 = b3;
                            if (b4 >= this.f578a.length) {
                                break;
                            }
                            if (this.f578a[b4] != null) {
                                this.f584c = b4;
                                break;
                            }
                            b3 = (byte) (b4 + 1);
                        }
                        this.f582d = 0;
                        this.f581c = 0;
                    }
                    if (this.f584c >= 0) {
                        byte[] bArr = this.f578a[this.f584c];
                        if (bArr == null || bArr.length < C0063c.f591a) {
                            this.f578a[this.f584c] = null;
                            this.f584c = (byte) (this.f584c + 1);
                            this.f582d = 0;
                            this.f581c = 0;
                        } else {
                            short s2 = (short) (((short) (((255 & bArr[2]) << 8) | (255 & bArr[3]))) + C0058g.f571a);
                            byte length = (byte) (bArr.length / C0063c.m764b());
                            if (bArr.length % C0063c.m764b() > 0) {
                                length = (byte) (length + 1);
                            }
                            byte[] bArr2 = new byte[C0063c.f591a];
                            synchronized (this.f577a) {
                                while (this.f582d < length && C0063c.m765a(this.f590a)) {
                                    short sM764b = C0063c.m764b();
                                    if (s2 - this.f581c < C0063c.m764b()) {
                                        sM764b = (short) (s2 - this.f581c);
                                    }
                                    C0063c.m771a(bArr2, this.f585a, length, (byte) this.f582d, sM764b);
                                    if (!m740a(bArr2, bArr, this.f581c, sM764b)) {
                                        break;
                                    }
                                    this.f581c += sM764b;
                                    s = (short) (s + C0063c.f591a + sM764b);
                                    this.f582d++;
                                }
                                this.f583e += s;
                                if (this.f582d == length) {
                                    this.f578a[this.f584c] = null;
                                    this.f584c = (byte) (this.f584c + 1);
                                    this.f582d = 0;
                                    this.f581c = 0;
                                    this.f580b = (byte) (this.f580b - 1);
                                    this.f585a = (short) (this.f585a + 1);
                                    if (this.f585a < 0) {
                                        this.f585a = (short) 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f586a = null;
    }
}
