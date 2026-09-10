package mobak.p000a.p001a;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0034b;
import mobak.p000a.p002b.C0038f;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p000a.p002b.p003a.C0023p;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;

/* JADX INFO: renamed from: mobak.a.a.e */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/a/e.class */
public final class C0005e {

    /* JADX INFO: renamed from: a */
    public static C0005e f76a;

    /* JADX INFO: renamed from: a */
    private static short[][] f77a;

    /* JADX INFO: renamed from: a */
    public String f78a;

    /* JADX INFO: renamed from: c */
    private int f80c;

    /* JADX INFO: renamed from: a */
    private C0006f[] f82a;

    /* JADX INFO: renamed from: a */
    public int f84a;

    /* JADX INFO: renamed from: b */
    public String f85b;

    /* JADX INFO: renamed from: b */
    private byte f86b;

    /* JADX INFO: renamed from: c */
    private byte f87c;

    /* JADX INFO: renamed from: d */
    private byte f88d;

    /* JADX INFO: renamed from: e */
    private int f91e;

    /* JADX INFO: renamed from: c */
    private String f93c;

    /* JADX INFO: renamed from: a */
    public C0004d[] f94a;

    /* JADX INFO: renamed from: b */
    public C0004d[] f95b;

    /* JADX INFO: renamed from: a */
    public byte f96a;

    /* JADX INFO: renamed from: d */
    private String f99d;

    /* JADX INFO: renamed from: e */
    private String f100e;

    /* JADX INFO: renamed from: a */
    private C0006f[][] f107a;

    /* JADX INFO: renamed from: a */
    private String[] f108a;

    /* JADX INFO: renamed from: a */
    private C0023p[] f109a;

    /* JADX INFO: renamed from: a */
    private C0001a[] f79a = new C0001a[5];

    /* JADX INFO: renamed from: a */
    public boolean f81a = false;

    /* JADX INFO: renamed from: d */
    private int f83d = 0;

    /* JADX INFO: renamed from: c */
    private boolean f89c = false;

    /* JADX INFO: renamed from: b */
    public int f90b = 0;

    /* JADX INFO: renamed from: a */
    private short f92a = 1;

    /* JADX INFO: renamed from: a */
    private long f97a = 0;

    /* JADX INFO: renamed from: f */
    private int f98f = 0;

    /* JADX INFO: renamed from: b */
    public boolean f101b = false;

    /* JADX INFO: renamed from: a */
    private Vector f102a = null;

    /* JADX INFO: renamed from: b */
    private Vector f103b = null;

    /* JADX INFO: renamed from: c */
    private Vector f104c = null;

    /* JADX INFO: renamed from: d */
    private Vector f105d = null;

    /* JADX INFO: renamed from: e */
    private Vector f106e = null;

    /* JADX INFO: renamed from: a */
    public final void m87a(C0006f[] c0006fArr) {
        this.f102a = new Vector();
        this.f103b = new Vector();
        this.f104c = new Vector();
        this.f105d = new Vector();
        this.f106e = new Vector();
        if (c0006fArr != null) {
            this.f82a = c0006fArr;
        } else {
            this.f82a = new C0006f[30];
        }
        if (c0006fArr == null) {
            return;
        }
        m88a(this.f102a, (byte) 1);
        m88a(this.f103b, (byte) 4);
        m88a(this.f104c, (byte) 2);
        m88a(this.f105d, (byte) 8);
        m88a(this.f106e, (byte) 16);
    }

    /* JADX INFO: renamed from: a */
    private void m88a(Vector vector, byte b) {
        if (vector == null) {
            return;
        }
        for (int i = 0; i < this.f82a.length; i++) {
            if (this.f82a[i] != null && (this.f82a[i].mo22a() & b) != 0) {
                vector.addElement(this.f82a[i]);
            }
        }
    }

    public C0005e(boolean z) {
        this.f107a = null;
        if (z) {
            f76a = this;
            this.f87c = (byte) 1;
            this.f88d = (byte) 1;
            this.f107a = new C0006f[6][0];
            this.f107a[0] = new C0006f[2];
            this.f107a[1] = new C0006f[1];
            this.f107a[2] = new C0006f[1];
            this.f107a[3] = new C0006f[1];
            this.f107a[4] = new C0006f[1];
            this.f107a[5] = new C0006f[4];
            this.f82a = new C0006f[30];
            new Vector();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89a(short s) {
        this.f86b = (byte) s;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C0001a m90a(byte b) {
        if (b < 0 || b > 4) {
            return null;
        }
        return this.f79a[b];
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m91a(byte b, C0001a c0001a) {
        if (b < 0 || b > 4) {
            return;
        }
        this.f79a[b] = c0001a;
    }

    /* JADX INFO: renamed from: a */
    public final C0001a[] m92a() {
        return this.f79a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93a() {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                return false;
            }
            if (this.f79a[b2] != null) {
                return true;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0006f[] m94a(byte b) {
        Vector vector;
        switch (b) {
            case -1:
                return this.f82a;
            default:
                switch (b) {
                    case 1:
                        vector = this.f102a;
                        break;
                    case 2:
                        vector = this.f104c;
                        break;
                    case 4:
                        vector = this.f103b;
                        break;
                    case 8:
                        vector = this.f105d;
                        break;
                    case 16:
                        vector = this.f106e;
                        break;
                    default:
                        vector = null;
                        break;
                }
                Vector vector2 = vector;
                if (vector == null) {
                    return null;
                }
                C0006f[] c0006fArr = new C0006f[vector2.size()];
                short s = 0;
                while (true) {
                    short s2 = s;
                    if (s2 >= c0006fArr.length) {
                        return c0006fArr;
                    }
                    c0006fArr[s2] = (C0006f) vector2.elementAt(s2);
                    s = (short) (s2 + 1);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95a(Graphics graphics) {
        Image imageM488a = C0038f.m488a(this.f86b);
        int i = 12;
        byte b = this.f86b;
        byte b2 = b;
        if (b >= 12) {
            b2 = (byte) (b2 - 12);
            i = 9;
        }
        short sM476a = (short) (RunnableC0037e.m476a(imageM488a) / i);
        short sM477b = (short) RunnableC0037e.m477b(imageM488a);
        RunnableC0037e.m468a(graphics, imageM488a, sM476a * b2, 0, sM476a, sM477b, 0, C0034b.m374a((int) this.f87c), ((short) (C0034b.m375b((int) this.f88d) + 25)) - sM477b, 0);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m96a(byte b, byte b2) {
        this.f87c = b;
        this.f88d = b2;
    }

    /* JADX INFO: renamed from: a */
    public final byte m97a() {
        return this.f87c;
    }

    /* JADX INFO: renamed from: b */
    public final byte m98b() {
        return this.f88d;
    }

    /* JADX INFO: renamed from: a */
    public final void m99a(boolean z) {
        this.f89c = z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m100b() {
        return this.f89c;
    }

    /* JADX INFO: renamed from: b */
    public final C0006f[] m101b(byte b) {
        int i = 0;
        for (int i2 = 0; i2 < this.f82a.length; i2++) {
            if (this.f82a[i2] != null && this.f82a[i2].mo74g() == b) {
                i++;
            }
        }
        C0006f[] c0006fArr = new C0006f[i];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f82a.length; i4++) {
            if (this.f82a[i4] != null && this.f82a[i4].mo74g() == b) {
                int i5 = i3;
                i3++;
                c0006fArr[i5] = this.f82a[i4];
            }
        }
        return c0006fArr;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("name: ").append(this.f78a).append("\n");
        stringBuffer.append("level ").append((int) this.f92a).append("\n");
        stringBuffer.append("expr ").append(this.f91e).append("\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m102a() {
        return this.f78a;
    }

    /* JADX INFO: renamed from: a */
    public final void m103a(String str) {
        this.f78a = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m104a(C0004d[] c0004dArr, byte b, int i) {
        if (c0004dArr == null) {
            return 0;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= c0004dArr.length) {
                return 0;
            }
            if (c0004dArr[b3] != null && c0004dArr[b3].f73a == b) {
                return c0004dArr[b3].f75b + m129a(b);
            }
            b2 = (byte) (b3 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0004d m105a(C0004d[] c0004dArr, byte b) {
        if (c0004dArr == null) {
            return null;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= c0004dArr.length) {
                return null;
            }
            if (c0004dArr[b3] != null && c0004dArr[b3].f73a == b) {
                return c0004dArr[b3];
            }
            b2 = (byte) (b3 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m106a(int i) {
        if (this.f82a == null || this.f82a.length == 0) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f82a.length) {
                return;
            }
            if (this.f82a[b2] != null && ((AbstractC0003c) this.f82a[b2]).f65d == i) {
                this.f82a[b2] = null;
                return;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m107a(boolean z) {
        return !z ? this.f97a : this.f98f;
    }

    /* JADX INFO: renamed from: a */
    public final int m108a() {
        return this.f98f;
    }

    /* JADX INFO: renamed from: a */
    public final void m109a(long j) {
        this.f97a = j;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(j));
        int length = stringBuffer.length() / 3;
        if (stringBuffer.length() % 3 == 0) {
            length--;
        }
        for (int i = 0; i < length; i++) {
            stringBuffer.insert((stringBuffer.length() - ((i + 1) * 3)) - i, '\'');
        }
        this.f99d = stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m110b(int i) {
        this.f98f = i;
        this.f100e = String.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public final String m111b() {
        return this.f99d;
    }

    /* JADX INFO: renamed from: c */
    public final String m112c() {
        return this.f100e;
    }

    /* JADX INFO: renamed from: b */
    public final int m113b() {
        return this.f91e;
    }

    /* JADX INFO: renamed from: c */
    public final void m114c(int i) {
        this.f91e = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m115b(short s) {
        this.f92a = s;
        this.f93c = String.valueOf((int) s);
    }

    /* JADX INFO: renamed from: d */
    public final String m116d() {
        return this.f93c;
    }

    /* JADX INFO: renamed from: c */
    public final int m117c() {
        return this.f92a;
    }

    /* JADX INFO: renamed from: d */
    public final void m118d(int i) {
        this.f80c = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m119e(int i) {
        this.f80c--;
    }

    /* JADX INFO: renamed from: d */
    public final int m120d() {
        return this.f80c;
    }

    /* JADX INFO: renamed from: f */
    public final void m121f(int i) {
        this.f83d = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m122g(int i) {
        this.f83d--;
    }

    /* JADX INFO: renamed from: e */
    public final int m123e() {
        return this.f83d;
    }

    /* JADX INFO: renamed from: a */
    public final void m124a(byte b, C0006f c0006f) {
        if (b < 0 || b >= this.f82a.length) {
            return;
        }
        this.f82a[b] = null;
    }

    /* JADX INFO: renamed from: c */
    public final byte m125c() {
        byte b = 0;
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= this.f79a.length) {
                return b;
            }
            if (this.f79a[b3] != null) {
                b = (byte) (b + 1);
            }
            b2 = (byte) (b3 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m126a(C0004d[] c0004dArr, boolean z) {
        if (c0004dArr == null) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= c0004dArr.length) {
                return;
            }
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= f77a.length) {
                    break;
                }
                if (f77a[s2][0] == c0004dArr[b2].f73a) {
                    if (!z) {
                        short[] sArr = f77a[s2];
                        sArr[1] = (short) (sArr[1] - c0004dArr[b2].f75b);
                        break;
                    } else {
                        short[] sArr2 = f77a[s2];
                        sArr2[1] = (short) (sArr2[1] + c0004dArr[b2].f75b);
                        break;
                    }
                }
                s = (short) (s2 + 1);
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m127b(C0006f[] c0006fArr) {
        this.f107a = new C0006f[6][0];
        this.f107a[0] = new C0006f[2];
        this.f107a[1] = new C0006f[1];
        this.f107a[2] = new C0006f[1];
        this.f107a[3] = new C0006f[1];
        this.f107a[4] = new C0006f[1];
        this.f107a[5] = new C0006f[4];
        f77a = new short[this.f94a.length + this.f95b.length][2];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f94a.length) {
                break;
            }
            f77a[b2][0] = (short) this.f94a[b2].f73a;
            f77a[b2][1] = 0;
            b = (byte) (b2 + 1);
        }
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= this.f95b.length) {
                break;
            }
            f77a[this.f94a.length + b4][0] = (short) this.f95b[b4].f73a;
            f77a[this.f94a.length + b4][1] = 0;
            b3 = (byte) (b4 + 1);
        }
        if (c0006fArr == null) {
            return;
        }
        for (int i = 0; i < c0006fArr.length; i++) {
            if (c0006fArr[i] != null) {
                C0006f[] c0006fArr2 = this.f107a[c0006fArr[i].mo74g() - 1];
                for (int i2 = 0; i2 < c0006fArr2.length; i2++) {
                    if (c0006fArr2[i2] == null) {
                        c0006fArr2[i2] = c0006fArr[i];
                        m126a(c0006fArr2[i2].f123a, true);
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m128c(C0006f[] c0006fArr) {
        if (c0006fArr == null || c0006fArr.length < 0) {
            return;
        }
        byte b = 0;
        byte b2 = 0;
        for (int i = 0; i < this.f107a.length; i++) {
            for (int i2 = 0; i2 < this.f107a[i].length; i2++) {
                if (this.f107a[i][i2] != null) {
                    byte b3 = 0;
                    switch (this.f107a[i][i2].mo74g()) {
                        case 1:
                            byte b4 = b;
                            b = (byte) (b + 1);
                            b3 = (byte) (5 + b4);
                            break;
                        case 2:
                            b3 = 8;
                            break;
                        case 3:
                            b3 = 0;
                            break;
                        case 4:
                            b3 = 7;
                            break;
                        case 5:
                            b3 = 9;
                            break;
                        case 6:
                            byte b5 = b2;
                            b2 = (byte) (b2 + 1);
                            b3 = (byte) (1 + b5);
                            break;
                    }
                    c0006fArr[b3] = this.f107a[i][i2];
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m129a(short s) {
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 >= f77a.length) {
                return 0;
            }
            if (f77a[s3][0] == s) {
                return f77a[s3][1];
            }
            s2 = (short) (s3 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m130a(C0006f c0006f) {
        m126a(c0006f.f123a, true);
        C0006f[] c0006fArr = this.f107a[c0006f.mo74g() - 1];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= c0006fArr.length) {
                return;
            }
            if (c0006fArr[b2] == null) {
                c0006fArr[b2] = c0006f;
                return;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m131a(C0006f c0006f) {
        C0058g c0058g = new C0058g(C0059h.f576a[97], (short) 4, C0059h.f576a[97]);
        c0058g.m670a(c0006f.m68e());
        C0063c.f597a.m749a(c0058g);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m132b(C0006f c0006f) {
        C0058g c0058g = new C0058g(C0059h.f576a[94], (short) 4, C0059h.f576a[94]);
        c0058g.m670a(c0006f.m68e());
        C0063c.f597a.m749a(c0058g);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m133h(int i) {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f107a.length) {
                return;
            }
            C0006f[] c0006fArr = this.f107a[b2];
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < c0006fArr.length) {
                    if (c0006fArr[b4] != null && c0006fArr[b4].m68e() == i) {
                        m126a(c0006fArr[b4].f123a, false);
                        c0006fArr[b4] = null;
                        return;
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m134a(int i, int i2) {
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.f82a.length) {
                return;
            }
            if (this.f82a[b2] != null && this.f82a[b2].m68e() == i) {
                if (i2 == 1) {
                    this.f82a[b2] = null;
                } else {
                    this.f82a[b2].m63e(this.f82a[b2].mo24c() - 1);
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m135b(C0006f c0006f) {
        if (c0006f == null || c0006f.mo47d() < 0 || c0006f.mo47d() >= this.f82a.length) {
            return;
        }
        this.f82a[c0006f.mo47d()] = c0006f;
    }

    /* JADX INFO: renamed from: c */
    public final void m136c(C0006f c0006f) {
        C0006f[] c0006fArr = this.f107a[c0006f.mo74g() - 1];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= c0006fArr.length) {
                return;
            }
            if (c0006fArr[b2] != null && c0006fArr[b2].m68e() == 0) {
                c0006fArr[b2].m69g(c0006f.m68e());
                return;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m137a() {
        C0063c.f597a.m749a(new C0058g(C0059h.f576a[69], (short) 0, C0059h.f576a[69]));
    }

    /* JADX INFO: renamed from: a */
    public final void m138a(String[] strArr) {
        this.f108a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final String[] m139a() {
        return this.f108a;
    }

    /* JADX INFO: renamed from: a */
    public final C0023p[] m140a() {
        return this.f109a;
    }

    /* JADX INFO: renamed from: a */
    public final void m141a(C0023p[] c0023pArr) {
        this.f109a = c0023pArr;
    }

    /* JADX INFO: renamed from: d */
    public final byte m142d() {
        return this.f96a;
    }

    /* JADX INFO: renamed from: e */
    public final byte m143e() {
        return (byte) ((this.f96a - 1) % 5);
    }

    /* JADX INFO: renamed from: a */
    public static final byte m144a(byte b) {
        return (byte) ((b - 1) % 5);
    }

    /* JADX INFO: renamed from: a */
    public final void m145a(Graphics graphics) {
        if (this.f78a == null || this.f78a.equals("")) {
            return;
        }
        short sM374a = C0034b.m374a((int) this.f87c);
        int iM375b = C0034b.m375b((int) this.f88d) + 25 + 2;
        C0038f.m489a(graphics, f76a.m143e(), sM374a, iM375b, AbstractC0041i.f441a.m781a(this.f78a), AbstractC0041i.f441a.f634a);
        AbstractC0041i.f441a.m782a(graphics, this.f78a, sM374a, iM375b, 0);
    }
}
