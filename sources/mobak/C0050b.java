package mobak;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Image;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.C0038f;
import mobak.p004b.C0063c;

/* JADX INFO: renamed from: mobak.b */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/b.class */
public final class C0050b {

    /* JADX INFO: renamed from: a */
    private static Image[] f536a;

    /* JADX INFO: renamed from: b */
    private static String[] f537b;

    /* JADX INFO: renamed from: a */
    private static C0077g[] f538a;

    /* JADX INFO: renamed from: c */
    private static byte[] f544c;

    /* JADX INFO: renamed from: a */
    private static Image f556a;

    /* JADX INFO: renamed from: a */
    private static C0038f[] f539a = null;

    /* JADX INFO: renamed from: b */
    private static byte[] f540b = null;

    /* JADX INFO: renamed from: a */
    private static byte f541a = 7;

    /* JADX INFO: renamed from: b */
    private static byte f542b = 120;

    /* JADX INFO: renamed from: a */
    public static final String[] f543a = {"modal_window_part1.png", "modal_window_part2.png", "modal_window_part3.png", "modal_window_part4.png", "modal_window_part5.png", "modal_window_part6.png", "modal_window_part7.png", "modal_window_part8.png", "modal_window_part9.png", "modal_window_part10.png", "modal_window_part11.png", "modal_window_part12.png", "modal_window_part13.png"};

    /* JADX INFO: renamed from: a */
    public static int f545a = 10000;

    /* JADX INFO: renamed from: b */
    public static int f546b = 2;

    /* JADX INFO: renamed from: c */
    public static int f547c = 1;

    /* JADX INFO: renamed from: a */
    public static final byte[] f548a = {9, 1};

    /* JADX INFO: renamed from: c */
    private static byte f549c = 7;

    /* JADX INFO: renamed from: d */
    private static byte f550d = -128;

    /* JADX INFO: renamed from: d */
    private static byte[] f551d = new byte[450];

    /* JADX INFO: renamed from: e */
    private static byte f552e = 64;

    /* JADX INFO: renamed from: f */
    private static byte f553f = (byte) (64 ^ (-1));

    /* JADX INFO: renamed from: b */
    private static Image[] f554b = new Image[14];

    /* JADX INFO: renamed from: c */
    private static final String[] f555c = {"2-1.png", "3-1.png", "4-1.png", "5-1.png", "3-2.png", "4-2.png", "5-2.png", "5-3.png", "7-6.png", "6.png", "6_1-2-3.png", "7.png", "7_1-3-4.png", "0.png"};

    /* JADX INFO: renamed from: a */
    public static int m604a() {
        if (f539a == null) {
            return 0;
        }
        return f539a.length;
    }

    /* JADX INFO: renamed from: a */
    public static C0038f m605a(int i) {
        if (i >= 0 && f539a != null && f539a.length > i) {
            return f539a[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C0038f m606a(byte b, byte b2) {
        int iM611a = m611a(b, b2);
        if (iM611a >= 0) {
            return f539a[iM611a];
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C0038f m607a(byte b, byte b2, boolean z) {
        int i;
        if (f539a == null) {
            i = -1;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= f539a.length) {
                i = -1;
                break;
            }
            if (f539a[i2] != null && f539a[i2].m501a() == b && f539a[i2].m502b() == b2 && f539a[i2].m497a()) {
                i = i2;
                break;
            }
            i2++;
        }
        int i3 = i;
        if (i < 0) {
            return null;
        }
        return f539a[i3];
    }

    /* JADX INFO: renamed from: a */
    public static int m608a(C0038f c0038f) {
        if (c0038f == null) {
            return -1;
        }
        return m609a(c0038f.m500a(), c0038f.m503c());
    }

    /* JADX INFO: renamed from: a */
    public static int m609a(int i, byte b) {
        if (f539a == null) {
            return -1;
        }
        for (int i2 = 0; i2 < f539a.length; i2++) {
            if (f539a[i2] != null && f539a[i2].m500a() == i && f539a[i2].m503c() == b && f539a[i2].m497a()) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m610b(int i, byte b) {
        if (f539a == null) {
            return -1;
        }
        for (int i2 = 0; i2 < f539a.length; i2++) {
            if (f539a[i2] != null && f539a[i2].m500a() == i && f539a[i2].m503c() == b) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m611a(byte b, byte b2) {
        if (f539a == null || f539a.length == 0) {
            return -1;
        }
        for (int i = 0; i < f539a.length; i++) {
            C0038f c0038f = f539a[i];
            if (c0038f != null && c0038f.m501a() == b && c0038f.m502b() == b2 && c0038f.m497a()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m612b(C0038f c0038f) {
        if (c0038f == null) {
            return -1;
        }
        if (f539a == null) {
            f539a = new C0038f[10];
        }
        int length = -1;
        for (int i = 0; i < f539a.length; i++) {
            if (f539a[i] != null && f539a[i].m500a() == c0038f.m500a() && f539a[i].m503c() == c0038f.m503c()) {
                return i;
            }
            if (f539a[i] == null && length < 0) {
                length = i;
            }
        }
        if (length < 0) {
            C0038f[] c0038fArr = new C0038f[f539a.length + 10];
            System.arraycopy(f539a, 0, c0038fArr, 0, f539a.length);
            length = f539a.length;
            f539a = c0038fArr;
        }
        f539a[length] = c0038f;
        return length;
    }

    /* JADX INFO: renamed from: a */
    private static void m613a(int i) {
        if (f539a == null || f539a.length == 0 || i < 0 || i >= f539a.length || f539a[i] == null) {
            return;
        }
        m628a(f539a[i]);
        f539a[i] = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m614a(int i, byte b) {
        if (f539a == null) {
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i3 < f539a.length; i3++) {
            if (f539a[i3] != null && f539a[i3].m500a() == i && f539a[i3].m503c() == b) {
                i2 = i3;
                break;
            }
        }
        m613a(i2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m615a() {
        if (f539a == null || f539a.length == 0) {
            return;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= f539a.length) {
                return;
            }
            C0038f c0038f = f539a[s2];
            if (f539a != null && c0038f != null) {
                int i = -1;
                for (int i2 = 0; i2 < f539a.length; i2++) {
                    if (f539a[i2] == c0038f) {
                        i = i2;
                        break;
                    }
                }
                m613a(i);
            }
            s = (short) (s2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0038f m616a(C0038f c0038f, byte b, byte b2) {
        C0077g c0077gM636a;
        if (c0038f == null || f539a == null) {
            return null;
        }
        C0077g c0077gM636a2 = m636a(c0038f.m503c());
        for (int i = 0; i < f539a.length; i++) {
            if (f539a[i] != null && f539a[i] != c0038f && f539a[i].m497a() && (c0077gM636a = m636a(f539a[i].m503c())) != null) {
                byte b3 = 0;
                while (true) {
                    byte b4 = b3;
                    if (b4 >= c0077gM636a2.f647e) {
                        break;
                    }
                    byte b5 = 0;
                    while (true) {
                        byte b6 = b5;
                        if (b6 < c0077gM636a.f647e) {
                            if (b + c0077gM636a2.f648a[b4][0] == f539a[i].m501a() + c0077gM636a.f648a[b6][0] && b2 + c0077gM636a2.f648a[b4][1] == f539a[i].m502b() + c0077gM636a.f648a[b6][1]) {
                                return f539a[i];
                            }
                            b5 = (byte) (b6 + 1);
                        }
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m617a(C0038f c0038f, byte b, byte b2) {
        if (c0038f == null) {
            return false;
        }
        if (!m621a()) {
            return true;
        }
        C0077g c0077gM636a = m636a(c0038f.m503c());
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= c0077gM636a.f647e) {
                return false;
            }
            byte bM624a = m624a((short) ((byte) (b + c0077gM636a.f648a[b4][0])), (short) ((byte) (b2 + c0077gM636a.f648a[b4][1])));
            if (((byte) ((bM624a & f542b) >> 3)) > 0 || m630a(bM624a)) {
                return true;
            }
            b3 = (byte) (b4 + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m618b(C0038f c0038f, byte b, byte b2) {
        if (c0038f == null || C0005e.f76a == null || c0038f.m511b()) {
            return false;
        }
        C0077g c0077gM636a = m636a(c0038f.m503c());
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= c0077gM636a.f647e) {
                return false;
            }
            if (b + c0077gM636a.f648a[b4][0] == C0005e.f76a.m97a() && b2 + c0077gM636a.f648a[b4][1] == C0005e.f76a.m98b()) {
                return true;
            }
            b3 = (byte) (b4 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m619a(byte[] bArr) {
        if (bArr == null || bArr.length != 2500) {
            return false;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= bArr.length) {
                break;
            }
            bArr[s2] = (byte) (bArr[s2] & (f550d | f549c));
            s = (short) (s2 + 1);
        }
        Random random = new Random();
        int i = 0;
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 50) {
                break;
            }
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 < 50) {
                    byte b5 = (byte) (bArr[(b2 * 50) + b4] & f549c);
                    if (i < 150 && ((b5 == 1 || b5 == 2 || b5 == 3 || b5 == 4 || b5 == 5) && Math.abs(random.nextInt()) % bArr.length < 150)) {
                        boolean z = b4 > 0 && (bArr[((b2 * 50) + b4) - 1] & f549c) == b5;
                        boolean z2 = b4 < 49 && (bArr[((b2 * 50) + b4) + 1] & f549c) == b5;
                        boolean z3 = b2 > 0 && (bArr[((b2 - 1) * 50) + b4] & f549c) == b5;
                        boolean z4 = b2 < 49 && (bArr[((b2 + 1) * 50) + b4] & f549c) == b5;
                        if (z && z2 && z3 && z4) {
                            f551d[i * 3] = b4;
                            f551d[(i * 3) + 1] = b2;
                            f551d[(i * 3) + 2] = (byte) (Math.abs(random.nextInt()) % 3);
                            i++;
                        }
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            b = (byte) (b2 + 1);
        }
        while (i < 150) {
            for (int i2 = 0; i2 < 3; i2++) {
                f551d[(i * 3) + i2] = -1;
            }
            i++;
        }
        f540b = bArr;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static byte m620a(int i, int i2) {
        if (f540b == null) {
            return (byte) -1;
        }
        byte b = (byte) (f540b[(i2 * 50) + i] & f549c);
        if (b != 1 && b != 2 && b != 3 && b != 4 && b != 5) {
            return (byte) -1;
        }
        for (int i3 = 0; i3 < 150 && f551d[i3 * 3] != -1 && f551d[(i3 * 3) + 1] <= i2; i3++) {
            if (f551d[(i3 * 3) + 1] == i2 && f551d[i3 * 3] > i) {
                return (byte) -1;
            }
            if (f551d[i3 * 3] == i && f551d[(i3 * 3) + 1] == i2) {
                return f551d[(i3 * 3) + 2];
            }
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m621a() {
        return f540b != null;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m622b() {
        f540b = null;
        f539a = null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m623a(short s, short s2) {
        return s >= 0 && s < 50 && s2 >= 0 && s2 < 50;
    }

    /* JADX INFO: renamed from: a */
    public static byte m624a(short s, short s2) {
        if (m621a() && m623a(s, s2)) {
            return f540b[(s2 * 50) + s];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: a */
    public static byte m625a(int i) {
        if (f540b == null || i < 0 || i >= f540b.length) {
            return (byte) 0;
        }
        return f540b[i];
    }

    /* JADX INFO: renamed from: a */
    private static void m626a(byte b, byte b2, byte b3) {
        if (m621a() && m623a(b, b2)) {
            f540b[(b2 * 50) + b] = b3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m627a(byte b, byte b2) {
        if (m621a() && m623a(b, b2)) {
            m626a(b, b2, (byte) (m624a(b, b2) & f553f));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m628a(C0038f c0038f) {
        C0077g c0077gM636a;
        if (c0038f == null || (c0077gM636a = m636a(c0038f.m503c())) == null || c0077gM636a.f647e <= 0) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= c0077gM636a.f647e) {
                return;
            }
            m627a((byte) (c0038f.m501a() + c0077gM636a.f648a[b2][0]), (byte) (c0038f.m502b() + c0077gM636a.f648a[b2][1]));
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m629b(C0038f c0038f) {
        C0077g c0077gM636a;
        if (c0038f == null || (c0077gM636a = m636a(c0038f.m503c())) == null || c0077gM636a.f647e <= 0) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= c0077gM636a.f647e) {
                return;
            }
            byte bM501a = (byte) (c0038f.m501a() + c0077gM636a.f648a[b2][0]);
            byte bM502b = (byte) (c0038f.m502b() + c0077gM636a.f648a[b2][1]);
            if (m621a() && m623a(bM501a, bM502b)) {
                m626a(bM501a, bM502b, (byte) (m624a(bM501a, bM502b) | f552e));
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m630a(byte b) {
        return ((byte) (b & f541a)) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m631b(byte b) {
        byte bM642a = m642a(b);
        return (bM642a == 6 || bM642a == 8 || bM642a == 1 || bM642a == 7 || (b & f552e) == f552e) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m632a(byte b, byte b2) {
        if (m621a() && m623a(b, b2)) {
            return m631b(m624a(b, b2));
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static short m633a(String str) {
        if (str == null) {
            return (short) -1;
        }
        if (f536a == null) {
            f536a = new Image[5];
            f537b = new String[5];
        }
        synchronized (Main2.f0a) {
            short length = 0;
            while (length < f537b.length && f537b[length] != null) {
                if (f537b[length].equals(str)) {
                    return length;
                }
                length = (short) (length + 1);
            }
            if (length >= f537b.length) {
                length = (short) f536a.length;
                Image[] imageArr = new Image[f536a.length + 5];
                System.arraycopy(f536a, 0, imageArr, 0, f536a.length);
                f536a = imageArr;
                String[] strArr = new String[f537b.length + 5];
                System.arraycopy(f537b, 0, strArr, 0, f537b.length);
                f537b = strArr;
            }
            f536a[length] = m634a(new StringBuffer().append("/mobak/res/").append(str).toString());
            if (f536a[length] == null) {
                return (short) -1;
            }
            f537b[length] = str;
            return length;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Image m634a(String str) {
        try {
            return Image.createImage(str);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("loadImage (").append(str).append("): ").append(e.toString()).toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v24, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: c */
    public static void m635c() {
        ?? resourceAsStream = Main2.f0a.getClass().getResourceAsStream("/mobak/res/imageSize");
        if (resourceAsStream == 0) {
            return;
        }
        try {
            ?? r0 = new byte[resourceAsStream.available()];
            resourceAsStream.read(r0);
            if (r0.length == 0) {
                return;
            }
            int i = r0[0];
            f538a = new C0077g[i];
            int i2 = 1;
            for (byte b = 0; b < i; b = (byte) (b + 1)) {
                C0077g c0077g = new C0077g();
                int i3 = i2;
                int i4 = i2 + 1;
                c0077g.f643a = r0[i3] == true ? (byte) 1 : (byte) 0;
                int i5 = i4 + 1;
                c0077g.f644b = r0[i4] == true ? (byte) 1 : (byte) 0;
                int i6 = i5 + 1;
                c0077g.f645c = r0[i5] == true ? (byte) 1 : (byte) 0;
                int i7 = i6 + 1;
                c0077g.f646d = r0[i6] == true ? (byte) 1 : (byte) 0;
                int i8 = i7 + 1;
                c0077g.f647e = r0[i7] == true ? (byte) 1 : (byte) 0;
                resourceAsStream = c0077g.f647e;
                if (resourceAsStream > 0) {
                    c0077g.f648a = new byte[c0077g.f647e][2];
                    byte b2 = 0;
                    for (byte b3 = 0; b3 < c0077g.f647e; b3 = (byte) (b3 + 1)) {
                        int i9 = i8;
                        int i10 = i8 + 1;
                        c0077g.f648a[b2][0] = r0[i9] == true ? 1 : 0;
                        i8 = i10 + 1;
                        c0077g.f648a[b2][1] = r0[i10] == true ? 1 : 0;
                        b2 = (byte) (b2 + 1);
                    }
                }
                int i11 = i8;
                i2 = i8 + 1;
                int i12 = r0[i11];
                if (i12 > 0) {
                    c0077g.f649a = new byte[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = i2;
                        i2++;
                        c0077g.f649a[i13] = r0[i14] == true ? 1 : 0;
                    }
                }
                f538a[b] = c0077g;
            }
        } catch (Exception e) {
            C0063c.m746a(resourceAsStream.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0077g m636a(byte b) {
        if (f538a == null || f538a.length == 0) {
            return null;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= f538a.length) {
                return null;
            }
            if (f538a[b3] != null && f538a[b3].f643a == b) {
                return f538a[b3];
            }
            b2 = (byte) (b3 + 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m637d() {
        if (f536a != null) {
            for (int i = 0; i < f536a.length; i++) {
                f536a[i] = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Image m638a(short s) {
        try {
            if (f536a == null || s < 0 || s >= f536a.length) {
                return null;
            }
            if (f536a[s] == null) {
                f536a[s] = m634a(new StringBuffer().append("/mobak/res/").append(f537b[s]).toString());
            }
            return f536a[s];
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getImage (").append((int) s).append(") ").append(e).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m639a() {
        return new StringBuffer().append("length: ").append(String.valueOf(f536a.length)).toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [byte[], java.lang.Exception] */
    /* JADX INFO: renamed from: a */
    public static final byte m640a(byte b, int i) {
        ?? r0 = f544c;
        if (r0 == 0) {
            try {
                InputStream resourceAsStream = Main2.f0a.getClass().getResourceAsStream("/mobak/res/units_margin.bin");
                if (resourceAsStream == null) {
                    f544c = new byte[0];
                    return (byte) 20;
                }
                f544c = new byte[resourceAsStream.available()];
                resourceAsStream.read(f544c);
                resourceAsStream.close();
            } catch (IOException e) {
                C0063c.m745a((Exception) r0);
            }
        }
        int i2 = ((b - 1) * 5) + i;
        if (i2 >= f544c.length) {
            return (byte) 20;
        }
        return f544c[i2];
    }

    /* JADX INFO: renamed from: a */
    public static void m641a(C0038f c0038f, boolean z) {
        byte b;
        if (c0038f == null) {
            return;
        }
        byte bM501a = c0038f.m501a();
        byte bM502b = c0038f.m502b();
        byte b2 = 1;
        do {
            if (m616a(c0038f, bM501a, bM502b) == null && !m617a(c0038f, bM501a, bM502b) && !m618b(c0038f, bM501a, bM502b) && (!z || m632a(bM501a, bM502b))) {
                return;
            }
            int i = bM501a - b2;
            while (true) {
                byte b3 = (byte) i;
                if (b3 <= bM501a + b2) {
                    if (b3 >= 0 && b3 < 50) {
                        int i2 = bM502b - b2;
                        while (true) {
                            byte b4 = (byte) i2;
                            if (b4 > bM502b + b2) {
                                break;
                            }
                            if (b4 >= 0 && b4 < 50 && m616a(c0038f, b3, b4) == null && !m617a(c0038f, b3, b4) && !m618b(c0038f, b3, b4) && (!z || m632a(b3, b4))) {
                                c0038f.mo494a(b3, b4, false);
                                return;
                            }
                            i2 = b4 + 1;
                        }
                    }
                    i = b3 + 1;
                }
            }
            b = (byte) (b2 + 1);
            b2 = b;
        } while (b <= 20);
    }

    /* JADX INFO: renamed from: a */
    public static final byte m642a(byte b) {
        byte b2 = (byte) (b & f549c);
        if (b2 == 0) {
            return (byte) 8;
        }
        return b2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m643c(byte b) {
        return (b & f550d) == f550d;
    }

    /* JADX INFO: renamed from: b */
    public static final byte m644b(byte b) {
        if (b == 8) {
            return (byte) 0;
        }
        return b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Switch 'out' block B:36:0x00d4 for B:23:0x0093 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:42:0x00f4 for B:31:0x00b5 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: a */
    private static final byte m645a(byte b, byte b2, byte b3) {
        switch (b) {
            case 2:
                switch (b2) {
                    case 1:
                        return (byte) 0;
                    default:
                        return (byte) -1;
                }
            case 3:
                switch (b2) {
                    case 1:
                        return (byte) 1;
                    case 2:
                        return (byte) 4;
                    default:
                        switch (b2) {
                            case 1:
                                return (byte) 0;
                            default:
                                return (byte) -1;
                        }
                }
            case 4:
                switch (b2) {
                    case 1:
                        return (byte) 2;
                    case 2:
                        return (byte) 5;
                    default:
                        switch (b2) {
                            case 1:
                                return (byte) 1;
                            case 2:
                                return (byte) 4;
                            default:
                                switch (b2) {
                                    case 1:
                                        return (byte) 0;
                                    default:
                                        return (byte) -1;
                                }
                        }
                }
            case 5:
                switch (b2) {
                    case 1:
                        return (byte) 3;
                    case 2:
                        return (byte) 6;
                    case 3:
                        return (byte) 7;
                    default:
                        switch (b2) {
                            case 1:
                                return (byte) 2;
                            case 2:
                                return (byte) 5;
                            default:
                                switch (b2) {
                                    case 1:
                                        return (byte) 1;
                                    case 2:
                                        return (byte) 4;
                                    default:
                                        switch (b2) {
                                            case 1:
                                                return (byte) 0;
                                            default:
                                                return (byte) -1;
                                        }
                                }
                        }
                }
            case 6:
                switch (b3) {
                    case 4:
                    case 5:
                    case 7:
                        return (byte) 10;
                    case 6:
                    default:
                        return (byte) 9;
                }
            case 7:
                switch (b2) {
                    case 6:
                        return (byte) 8;
                    default:
                        switch (b3) {
                            case 4:
                            case 6:
                            case 7:
                                return (byte) 12;
                            case 5:
                            default:
                                return (byte) 11;
                        }
                }
            case 8:
                return (byte) 13;
            default:
                return (byte) -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Image m646a(byte b, byte b2, byte b3) {
        byte bM645a = m645a(b, b2, b3);
        if (bM645a < 0 || bM645a >= f554b.length) {
            return null;
        }
        if (f554b[bM645a] == null) {
            Image[] imageArr = f554b;
            StringBuffer stringBufferAppend = new StringBuffer().append("/mobak/res/");
            byte bM645a2 = m645a(b, b2, b3);
            imageArr[bM645a] = m634a(stringBufferAppend.append((bM645a2 < 0 || bM645a2 >= f555c.length) ? "" : f555c[bM645a2]).toString());
        }
        return f554b[bM645a];
    }

    /* JADX INFO: renamed from: a */
    public static final Image m647a() {
        if (f556a == null) {
            f556a = m634a("/mobak/res/tail.png");
        }
        return f556a;
    }
}
