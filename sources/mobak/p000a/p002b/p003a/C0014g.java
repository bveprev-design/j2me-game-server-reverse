package mobak.p000a.p002b.p003a;

/* JADX INFO: renamed from: mobak.a.b.a.g */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/g.class */
public final class C0014g {

    /* JADX INFO: renamed from: a */
    private int f189a;

    /* JADX INFO: renamed from: b */
    private int f190b;

    /* JADX INFO: renamed from: c */
    private int f191c = 41;

    /* JADX INFO: renamed from: d */
    private int f192d = 35;

    /* JADX INFO: renamed from: a */
    public byte f193a;

    /* JADX INFO: renamed from: a */
    public short f194a;

    public C0014g(int i, int i2, int i3, int i4, byte b, short s) {
        this.f189a = i;
        this.f190b = i2;
        this.f193a = b;
        this.f194a = s;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m218a(int i, int i2) {
        return i >= this.f189a && i <= this.f189a + this.f191c && i2 >= this.f190b && i2 <= this.f190b + this.f192d;
    }

    /* JADX INFO: renamed from: a */
    public final byte m219a(int i, int i2) {
        if (i < this.f189a || i > this.f189a + this.f191c || i2 < this.f190b || i2 > this.f190b + (this.f192d / 2)) {
            return (i < this.f189a || i > this.f189a + this.f191c || i2 < this.f190b + (this.f192d / 2) || i2 > this.f190b + this.f192d) ? (byte) 1 : (byte) 3;
        }
        return (byte) 2;
    }
}
