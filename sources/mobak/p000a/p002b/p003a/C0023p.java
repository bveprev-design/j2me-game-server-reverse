package mobak.p000a.p002b.p003a;

import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.a.p */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/p.class */
public final class C0023p {

    /* JADX INFO: renamed from: a */
    public int f245a;

    /* JADX INFO: renamed from: a */
    public short f246a;

    /* JADX INFO: renamed from: b */
    public short f247b;

    /* JADX INFO: renamed from: a */
    public String f248a;

    /* JADX INFO: renamed from: a */
    public String[] f249a;

    /* JADX INFO: renamed from: a */
    public short[] f250a;

    /* JADX INFO: renamed from: a */
    public int[] f251a;

    /* JADX INFO: renamed from: a */
    public static final short m256a(int i) {
        return (short) (i >> 8);
    }

    /* JADX INFO: renamed from: a */
    private static final int m257a(int i, short s) {
        return (i & (-16776961)) | (s << 8);
    }

    /* JADX INFO: renamed from: a */
    private static final int m258a(int i, boolean z, byte b) {
        return z ? i | (b << 24) : i & ((b << 24) ^ (-1));
    }

    /* JADX INFO: renamed from: a */
    public static final int m259a(short s, byte b) {
        return m257a((0 & (-256)) | b, s);
    }

    public C0023p(byte b) {
        this.f245a = (this.f245a & (-256)) | b;
        this.f245a = m257a(this.f245a, C0025r.m272a(b));
        this.f245a = m258a(this.f245a, true, (byte) -128);
        this.f245a = m258a(this.f245a, true, (byte) 64);
    }

    public C0023p(byte b, short s) {
        this.f245a = (this.f245a & (-256)) | b;
        this.f245a = m257a(this.f245a, s);
        this.f245a = m258a(this.f245a, true, (byte) -128);
        this.f245a = m258a(this.f245a, true, (byte) 64);
    }

    public C0023p(int i) {
        this.f245a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m260a() {
        return ((this.f245a >> 24) & (-128)) == -128;
    }

    /* JADX INFO: renamed from: a */
    public final void m261a(boolean z) {
        this.f245a = m258a(this.f245a, z, (byte) -128);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m262b() {
        return ((this.f245a >> 24) & 64) == 64;
    }

    /* JADX INFO: renamed from: b */
    public final void m263b(boolean z) {
        this.f245a = m258a(this.f245a, z, (byte) 64);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m264c() {
        return ((this.f245a >> 24) & 16) == 16;
    }

    /* JADX INFO: renamed from: a */
    public final byte m265a() {
        return (byte) this.f245a;
    }

    /* JADX INFO: renamed from: a */
    public final String m266a() {
        return C0066a.m777b(m256a(this.f245a));
    }

    /* JADX INFO: renamed from: a */
    public final void m267a(String str) {
        this.f248a = str;
        this.f245a = m258a(this.f245a, true, (byte) 16);
    }

    /* JADX INFO: renamed from: a */
    public final void m268a(short s) {
        this.f245a = m257a(this.f245a, s);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m269d() {
        return ((this.f245a >> 24) & 8) == 8;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m270e() {
        return ((this.f245a >> 24) & 4) == 4;
    }

    /* JADX INFO: renamed from: c */
    public final void m271c(boolean z) {
        this.f245a = m258a(this.f245a, true, (byte) 4);
    }
}
