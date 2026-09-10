package mobak.p006c;

/* JADX INFO: renamed from: mobak.c.g */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/c/g.class */
public final class C0072g {

    /* JADX INFO: renamed from: a */
    private String[] f637a = new String[5];

    /* JADX INFO: renamed from: a */
    private int[] f638a = new int[5];

    /* JADX INFO: renamed from: a */
    public final void m802a(int i, String str) {
        int i2;
        int iM804a = m804a(i);
        int length = iM804a;
        if (iM804a < 0) {
            if (this.f637a != null && this.f638a != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f638a.length) {
                        i2 = -1;
                        break;
                    } else {
                        if (this.f637a[i3] == null) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                i2 = -1;
            }
            length = i2;
        }
        if (length < 0) {
            length = this.f638a.length;
            int[] iArr = new int[this.f638a.length + 5];
            System.arraycopy(this.f638a, 0, iArr, 0, this.f638a.length);
            this.f638a = iArr;
            String[] strArr = new String[this.f637a.length + 5];
            System.arraycopy(this.f637a, 0, strArr, 0, this.f637a.length);
            this.f637a = strArr;
        }
        this.f638a[length] = i;
        this.f637a[length] = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m803a(int i) {
        int iM804a = m804a(i);
        if (iM804a >= 0) {
            return this.f637a[iM804a];
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private int m804a(int i) {
        if (this.f637a == null || this.f638a == null) {
            return -1;
        }
        for (int i2 = 0; i2 < this.f638a.length; i2++) {
            if (this.f638a[i2] == i) {
                return i2;
            }
        }
        return -1;
    }
}
