package mobak.p004b.p005a;

import mobak.p004b.C0063c;
import mobak.p006c.C0066a;
import mobak.p006c.C0071f;

/* JADX INFO: renamed from: mobak.b.a.f */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/b/a/f.class */
public final class C0057f {

    /* JADX INFO: renamed from: a */
    private static byte[] f569a = new byte[10240];

    /* JADX INFO: renamed from: a */
    protected static int f570a = 0;

    /* JADX INFO: renamed from: a */
    public static void m650a(byte[] bArr) {
        short sM741a = C0063c.m741a(bArr);
        System.arraycopy(bArr, C0063c.f591a, f569a, f570a, sM741a);
        f570a += sM741a;
    }

    /* JADX INFO: renamed from: a */
    public static void m651a() {
        int iM656a = m656a();
        for (int i = 0; i < iM656a + C0058g.f571a; i++) {
            f569a[i] = 0;
        }
        f570a = 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m652b() {
        f570a = C0058g.f571a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m653a() {
        if (f569a == null) {
            return true;
        }
        try {
            return f570a >= m656a() + C0058g.f571a;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("define EOF ").append(e).toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static short m654a() throws Exception {
        if (f569a == null || f569a.length < 2) {
            throw new Exception("command data isn't defined");
        }
        return (short) (((255 & f569a[0]) << 8) | (255 & f569a[1]));
    }

    /* JADX INFO: renamed from: b */
    public static short m655b() throws Exception {
        if (f569a == null || f569a.length < 6) {
            throw new Exception("command data isn't defined");
        }
        return (short) (((255 & f569a[4]) << 8) | (255 & f569a[5]));
    }

    /* JADX INFO: renamed from: a */
    public static int m656a() throws Exception {
        if (f569a == null || f569a.length < 6) {
            throw new Exception("command data isn't defined");
        }
        return ((255 & f569a[2]) << 8) | (255 & f569a[3]);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m657b() throws Exception {
        if (f569a == null || f569a.length < 6) {
            throw new Exception("command data isn't defined");
        }
        return f569a.length < 6;
    }

    /* JADX INFO: renamed from: a */
    protected static byte m658a() {
        if (m653a() || f570a >= m656a() + C0058g.f571a) {
            return (byte) 0;
        }
        f570a++;
        return f569a[f570a - 1];
    }

    /* JADX INFO: renamed from: c */
    protected static short m659c() {
        if (m653a()) {
            return (short) 0;
        }
        if ((m656a() + C0058g.f571a) - f570a < 2) {
            f570a = m656a() + C0058g.f571a + 1;
            return (short) 0;
        }
        short sM799a = C0071f.m799a(f569a, f570a, (short) 0);
        f570a += 2;
        return sM799a;
    }

    /* JADX INFO: renamed from: b */
    protected static int m660b() {
        if (m653a()) {
            return 0;
        }
        if ((m656a() + C0058g.f571a) - f570a < 4) {
            f570a = m656a() + C0058g.f571a + 1;
            return 0;
        }
        byte[] bArr = f569a;
        int i = f570a;
        int i2 = (bArr == null || bArr.length - i < 4) ? 0 : ((-16777216) & (bArr[i] << 24)) | (16711680 & (bArr[i + 1] << 16)) | (65280 & (bArr[i + 2] << 8)) | (255 & bArr[i + 3]);
        f570a += 4;
        return i2;
    }

    /* JADX INFO: renamed from: a */
    protected static long m661a() {
        if (m653a()) {
            return 0L;
        }
        if ((m656a() + C0058g.f571a) - f570a < 8) {
            f570a = m656a() + C0058g.f571a + 1;
            return 0L;
        }
        byte[] bArr = f569a;
        int i = f570a;
        long j = (bArr == null || bArr.length - i < 8) ? 0L : ((-72057594037927936L) & (((long) bArr[i]) << 56)) | (71776119061217280L & (((long) bArr[i + 1]) << 48)) | (280375465082880L & (((long) bArr[i + 2]) << 40)) | (1095216660480L & (((long) bArr[i + 3]) << 32)) | (4278190080L & (((long) bArr[i + 4]) << 24)) | (16711680 & (((long) bArr[i + 5]) << 16)) | (65280 & (((long) bArr[i + 6]) << 8)) | (255 & ((long) bArr[i + 7]));
        f570a += 8;
        return j;
    }

    /* JADX INFO: renamed from: a */
    protected static long m662a(byte b) {
        switch (b) {
            case 1:
                return m658a();
            case 2:
                return m659c();
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                return 0L;
            case 4:
                return m660b();
            case 8:
                return m661a();
        }
    }

    /* JADX INFO: renamed from: a */
    protected static String m663a() {
        if (m653a()) {
            return "";
        }
        short sM659c = m659c();
        if (sM659c < 0) {
            return C0066a.m773a((short) (sM659c & Short.MAX_VALUE));
        }
        if (sM659c == 0) {
            return "";
        }
        String strM800a = C0071f.m800a(f569a, f570a, sM659c, "");
        f570a += sM659c;
        return strM800a;
    }

    /* JADX INFO: renamed from: b */
    public static void m664b(byte[] bArr) {
        System.arraycopy(f569a, f570a, bArr, 0, bArr.length);
        f570a += bArr.length;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.lang.Exception, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static byte[] m665a(int i) {
        ?? r0;
        try {
            r0 = new byte[m656a() - 2];
            System.arraycopy(f569a, C0058g.f571a + 2, r0, 0, r0.length);
            return r0;
        } catch (Exception e) {
            C0063c.m745a((Exception) r0);
            return null;
        }
    }
}
