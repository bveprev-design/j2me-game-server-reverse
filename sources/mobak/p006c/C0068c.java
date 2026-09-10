package mobak.p006c;

import javax.microedition.rms.RecordFilter;

/* JADX INFO: renamed from: mobak.c.c */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/c/c.class */
final class C0068c implements RecordFilter {

    /* JADX INFO: renamed from: a */
    private byte[] f631a;

    public C0068c(C0071f c0071f, byte[] bArr) {
        this.f631a = null;
        this.f631a = bArr;
    }

    public final boolean matches(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        if (this.f631a == null || this.f631a.length == 0) {
            return true;
        }
        if (bArr.length < this.f631a.length) {
            return false;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= this.f631a.length) {
                return true;
            }
            if (this.f631a[s2] != bArr[s2]) {
                return false;
            }
            s = (short) (s2 + 1);
        }
    }
}
