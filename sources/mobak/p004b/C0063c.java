package mobak.p004b;

import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import mobak.C0050b;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.b.c */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/b/c.class */
public final class C0063c {

    /* JADX INFO: renamed from: b */
    public static short f592b;

    /* JADX INFO: renamed from: a */
    private SocketConnection f601a;

    /* JADX INFO: renamed from: c */
    private boolean f603c;

    /* JADX INFO: renamed from: d */
    private boolean f604d;

    /* JADX INFO: renamed from: a */
    private RunnableC0051a f605a;

    /* JADX INFO: renamed from: a */
    private RunnableC0062b f606a;

    /* JADX INFO: renamed from: c */
    public short f607c;

    /* JADX INFO: renamed from: a */
    public long f608a;

    /* JADX INFO: renamed from: c */
    private String f609c;

    /* JADX INFO: renamed from: d */
    private String f610d;

    /* JADX INFO: renamed from: a */
    private StringBuffer f614a;

    /* JADX INFO: renamed from: a */
    public static short f591a = 6;

    /* JADX INFO: renamed from: a */
    public static int f593a = 45;

    /* JADX INFO: renamed from: b */
    public static int f594b = 2;

    /* JADX INFO: renamed from: d */
    private static short f595d = 256;

    /* JADX INFO: renamed from: a */
    public static String f596a = "";

    /* JADX INFO: renamed from: a */
    public static C0063c f597a = null;

    /* JADX INFO: renamed from: a */
    private static String[] f598a = new String[5];

    /* JADX INFO: renamed from: a */
    private static byte f599a = 0;

    /* JADX INFO: renamed from: b */
    private static String f600b = null;

    /* JADX INFO: renamed from: b */
    private boolean f602b = false;

    /* JADX INFO: renamed from: b */
    private byte f611b = 0;

    /* JADX INFO: renamed from: a */
    public boolean f612a = false;

    /* JADX INFO: renamed from: e */
    private boolean f613e = false;

    /* JADX INFO: renamed from: a */
    public static short m741a(byte[] bArr) {
        if (bArr == null) {
            return (short) 0;
        }
        return (short) (((127 & bArr[4]) << 8) | (255 & bArr[5]));
    }

    /* JADX INFO: renamed from: a */
    public static byte m742a(byte[] bArr) {
        if (bArr == null) {
            return (byte) 0;
        }
        return bArr[2];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m743a(short s) {
        return this.f607c == s;
    }

    /* JADX INFO: renamed from: a */
    public static void m744a(String str, boolean z) {
        if (str != null && !str.equals(f600b) && z) {
            RunnableC0037e.m427a(C0066a.m773a(135), str);
            f600b = str;
            RunnableC0037e.f360a.m462k();
        }
        f598a[f599a] = str;
        byte b = (byte) (f599a + 1);
        f599a = b;
        if (b >= f598a.length) {
            f599a = (byte) 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m745a(Exception exc) {
        exc.printStackTrace();
        m744a(exc.getMessage(), false);
    }

    /* JADX INFO: renamed from: a */
    public static void m746a(String str) {
        m744a(str, false);
    }

    public C0063c() {
        this.f603c = false;
        f597a = this;
        this.f603c = false;
        this.f604d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m747a(String str, String str2) {
        this.f609c = str2;
        this.f610d = str;
        this.f605a = new RunnableC0051a(this, null);
        this.f606a = new RunnableC0062b(this, null);
        f597a = this;
        this.f603c = false;
        this.f604d = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m748a() {
        try {
            this.f612a = true;
            this.f601a = Connector.open(new StringBuffer().append("socket://").append(this.f609c).append(":").append(this.f610d).toString());
            this.f613e = false;
            this.f612a = false;
            this.f604d = true;
            RunnableC0051a runnableC0051a = this.f605a;
            runnableC0051a.f559a = this.f601a.openDataInputStream();
            if (runnableC0051a.f565a == null) {
                runnableC0051a.f565a = new Thread(runnableC0051a);
                runnableC0051a.f565a.start();
            }
            RunnableC0062b runnableC0062b = this.f606a;
            runnableC0062b.f587a = this.f601a.openDataOutputStream();
            if (runnableC0062b.f586a == null) {
                runnableC0062b.f586a = new Thread(runnableC0062b);
                runnableC0062b.f586a.start();
            }
        } catch (SecurityException e) {
            this.f613e = true;
            this.f601a = null;
            m744a(new StringBuffer().append("SocketListenerMe ").append(e.toString()).toString(), false);
        } catch (Exception e2) {
            this.f601a = null;
            m744a(new StringBuffer().append("SocketListenerMe ").append(e2.toString()).toString(), false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m749a(C0058g c0058g) {
        if (c0058g != null) {
            try {
                if (c0058g.m666a() != 0) {
                    m750a(c0058g.m666a(), c0058g.m675a());
                }
            } catch (Exception e) {
                m744a(new StringBuffer().append("sendCommand ").append(e.toString()).toString(), false);
                return false;
            }
        }
        RunnableC0062b runnableC0062b = this.f606a;
        synchronized (runnableC0062b.f577a) {
            try {
                if (c0058g == null) {
                    return true;
                }
                runnableC0062b.f578a[runnableC0062b.f579a] = c0058g.m667a();
                runnableC0062b.f589b++;
                runnableC0062b.f588a += runnableC0062b.f578a[runnableC0062b.f579a].length;
                runnableC0062b.f579a = (byte) (runnableC0062b.f579a + 1);
                if (runnableC0062b.f579a >= runnableC0062b.f578a.length) {
                    if (runnableC0062b.f578a[0] == null || runnableC0062b.f578a[0].length == 0) {
                        runnableC0062b.f579a = (byte) 0;
                    } else {
                        byte[][] bArr = new byte[runnableC0062b.f578a.length + 5][0];
                        System.arraycopy(runnableC0062b.f578a, 0, bArr, 0, runnableC0062b.f578a.length);
                        runnableC0062b.f578a = bArr;
                    }
                }
                runnableC0062b.f580b = (byte) (runnableC0062b.f580b + 1);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m750a(short s, boolean z) {
        if (s == 0) {
            return;
        }
        this.f607c = s;
        this.f608a = System.currentTimeMillis();
        RunnableC0037e.f360a.m445a(z, true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m751a() {
        this.f602b = this.f601a != null;
        if (!this.f602b) {
            return false;
        }
        try {
            this.f602b = true;
            this.f601a.getLocalPort();
        } catch (IOException unused) {
            this.f602b = false;
            m752f();
        }
        return this.f602b;
    }

    /* JADX INFO: renamed from: f */
    private void m752f() {
        if (this.f612a) {
            return;
        }
        m744a(C0066a.m773a(147), false);
        if (RunnableC0037e.f360a.m448b()) {
            RunnableC0037e.f360a.m449b(false);
        }
        RunnableC0051a runnableC0051a = this.f605a;
        if (runnableC0051a.f567a != null) {
            for (int i = 0; i < runnableC0051a.f567a.length; i++) {
                runnableC0051a.f567a[i] = 0;
            }
        }
        this.f612a = true;
        this.f611b = (byte) 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m753b() {
        try {
            C0058g c0058g = new C0058g(C0059h.f576a[3], (short) 30, (short) 0);
            c0058g.m670a(f593a);
            c0058g.m670a(f594b);
            c0058g.m671b(f595d);
            c0058g.m674a(f596a);
            m749a(c0058g);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m754b() {
        return this.f607c != -1;
    }

    /* JADX INFO: renamed from: c */
    public final void m755c() {
        this.f607c = (short) -1;
        RunnableC0037e.f360a.m447a(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m756d() {
        this.f608a = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public final void m757a(C0035c c0035c) {
        if (c0035c == null) {
            return;
        }
        if (this.f614a == null) {
            this.f614a = new StringBuffer();
        } else {
            this.f614a.delete(0, this.f614a.length());
        }
        if (this.f605a != null) {
            if (this.f605a.f558a) {
                c0035c.m402a("Receiving", AbstractC0041i.f442b, false, 0);
            } else {
                c0035c.m402a("Waiting", AbstractC0041i.f442b, false, 0);
            }
            this.f614a.append("last read: ").append((int) this.f605a.f557a);
            c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
            this.f614a.delete(0, this.f614a.length());
            this.f614a.append("bytes read: ").append(this.f605a.f563a);
            c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
            this.f614a.delete(0, this.f614a.length());
        }
        if (this.f606a != null) {
            this.f614a.append("last sent: ").append((int) this.f606a.f585a);
            c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
            this.f614a.delete(0, this.f614a.length());
            this.f614a.append("pkg sent: ").append(this.f606a.f589b);
            c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
            this.f614a.delete(0, this.f614a.length());
            this.f614a.append("bytes sent: ").append(this.f606a.f588a);
            c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
            this.f614a.delete(0, this.f614a.length());
        }
        this.f614a.append("cur. sceen mode: ").append(RunnableC0037e.f360a.m456a());
        c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
        this.f614a.delete(0, this.f614a.length());
        this.f614a.append("prev. sceen mode: ").append(RunnableC0037e.f360a.m457b());
        c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
        this.f614a.delete(0, this.f614a.length());
        this.f614a.append("freeMee: ").append(Runtime.getRuntime().freeMemory());
        c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
        this.f614a.delete(0, this.f614a.length());
        this.f614a.append("images container: ").append(C0050b.m639a());
        c0035c.m402a(this.f614a.toString(), AbstractC0041i.f442b, false, 0);
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= f598a.length) {
                return;
            }
            if (f598a[b2] != null) {
                c0035c.m402a(f598a[b2], AbstractC0041i.f442b, false, 0);
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m758a(boolean z) {
        this.f603c = true;
        if (z) {
            m749a(new C0058g(C0059h.f576a[24], (short) 0, (short) 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mobak.b.c] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [mobak.b.c] */
    /* JADX INFO: renamed from: e */
    public final void m759e() {
        ?? r0 = this;
        r0.f604d = false;
        try {
            if (this.f601a != null) {
                this.f601a.close();
            }
            r0 = this;
            r0.f601a = null;
        } catch (IOException e) {
            m744a(r0.getMessage(), false);
        }
        f597a = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m760c() {
        return this.f604d;
    }

    /* JADX INFO: renamed from: a */
    public static short m761a() {
        return f595d;
    }

    /* JADX INFO: renamed from: a */
    public static void m762a(short s) {
        f595d = s;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m763d() {
        return this.f613e;
    }

    /* JADX INFO: renamed from: b */
    static short m764b() {
        return f595d;
    }

    /* JADX INFO: renamed from: a */
    static boolean m765a(C0063c c0063c) {
        return c0063c.f602b;
    }

    /* JADX INFO: renamed from: a */
    static void m766a(C0063c c0063c) {
        c0063c.m752f();
    }

    /* JADX INFO: renamed from: b */
    static boolean m767b(C0063c c0063c) {
        return c0063c.f604d;
    }

    /* JADX INFO: renamed from: c */
    static boolean m768c(C0063c c0063c) {
        return c0063c.f603c;
    }

    /* JADX INFO: renamed from: a */
    static byte m769a(C0063c c0063c) {
        byte b = c0063c.f611b;
        c0063c.f611b = (byte) (b + 1);
        return b;
    }

    /* JADX INFO: renamed from: b */
    static byte m770b(C0063c c0063c) {
        return c0063c.f611b;
    }

    /* JADX INFO: renamed from: a */
    static byte[] m771a(byte[] bArr, short s, byte b, byte b2, short s2) {
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= f591a) {
                bArr[0] = (byte) (s >> 8);
                bArr[1] = (byte) s;
                bArr[2] = b;
                bArr[3] = b2;
                bArr[4] = (byte) (s2 >> 8);
                bArr[5] = (byte) s2;
                return bArr;
            }
            bArr[b4] = 0;
            b3 = (byte) (b4 + 1);
        }
    }
}
