package mobak.p004b.p005a;

import mobak.p004b.C0063c;

/* JADX INFO: renamed from: mobak.b.a.g */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/b/a/g.class */
public final class C0058g {

    /* JADX INFO: renamed from: a */
    public static short f571a = 6;

    /* JADX INFO: renamed from: a */
    private byte[] f572a;

    /* JADX INFO: renamed from: b */
    private short f573b;

    /* JADX INFO: renamed from: a */
    private boolean f574a;

    public C0058g(short s) {
        this.f573b = (short) 0;
        this.f574a = false;
        this.f572a = new byte[6];
        this.f572a[0] = (byte) (s >> 8);
        this.f572a[1] = (byte) s;
    }

    public C0058g(short s, short s2, short s3, boolean z) {
        this.f573b = (short) 0;
        this.f574a = false;
        this.f572a = new byte[s2 + 6];
        this.f572a[0] = (byte) (s >> 8);
        this.f572a[1] = (byte) s;
        this.f572a[4] = (byte) (s3 >> 8);
        this.f572a[5] = (byte) s3;
        this.f574a = true;
    }

    public C0058g(short s, short s2, short s3) {
        this.f573b = (short) 0;
        this.f574a = false;
        this.f572a = new byte[s2 + 6];
        this.f572a[0] = (byte) (s >> 8);
        this.f572a[1] = (byte) s;
        this.f572a[4] = (byte) (s3 >> 8);
        this.f572a[5] = (byte) s3;
    }

    /* JADX INFO: renamed from: a */
    public final short m666a() throws Exception {
        if (this.f572a == null || this.f572a.length < 2) {
            throw new Exception("command data isn't defined");
        }
        return (short) (((255 & this.f572a[4]) << 8) | (255 & this.f572a[5]));
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m667a() {
        this.f572a[2] = (byte) (this.f573b >> 8);
        this.f572a[3] = (byte) this.f573b;
        return this.f572a;
    }

    /* JADX INFO: renamed from: a */
    public final void m668a(short s) {
        if (this.f572a == null || this.f572a.length < 4) {
            this.f572a = new byte[6];
        }
        this.f572a[4] = (byte) (s >> 8);
        this.f572a[5] = (byte) s;
    }

    /* JADX INFO: renamed from: a */
    public final int m669a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return 0;
        }
        if ((this.f572a.length - 6) - this.f573b < bArr.length) {
            byte[] bArr2 = new byte[6 + this.f573b + bArr.length];
            System.arraycopy(this.f572a, 0, bArr2, 0, this.f572a.length);
            this.f572a = bArr2;
        }
        System.arraycopy(bArr, 0, this.f572a, this.f573b + 6, bArr.length);
        this.f573b = (short) (this.f573b + bArr.length);
        this.f572a[2] = (byte) (this.f573b >> 8);
        this.f572a[3] = (byte) this.f573b;
        return bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final void m670a(int i) {
        if ((this.f572a.length - 6) - this.f573b < 4) {
            byte[] bArr = new byte[6 + this.f573b + 4];
            System.arraycopy(this.f572a, 0, bArr, 0, this.f572a.length);
            this.f572a = bArr;
        }
        this.f572a[6 + this.f573b] = (byte) (i >>> 24);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) (i >> 16);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) (i >> 8);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) i;
        this.f573b = (short) (this.f573b + 1);
    }

    /* JADX INFO: renamed from: b */
    public final void m671b(short s) {
        if ((this.f572a.length - 6) - this.f573b < 2) {
            byte[] bArr = new byte[6 + this.f573b + 2];
            System.arraycopy(this.f572a, 0, bArr, 0, this.f572a.length);
            this.f572a = bArr;
        }
        this.f572a[6 + this.f573b] = (byte) (s >> 8);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) s;
        this.f573b = (short) (this.f573b + 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m672a(byte b) {
        if ((this.f572a.length - 6) - this.f573b < 1) {
            byte[] bArr = new byte[6 + this.f573b + 1];
            System.arraycopy(this.f572a, 0, bArr, 0, this.f572a.length);
            this.f572a = bArr;
        }
        this.f572a[6 + this.f573b] = b;
        this.f573b = (short) (this.f573b + 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m673a(long j) {
        if ((this.f572a.length - 6) - this.f573b < 8) {
            byte[] bArr = new byte[6 + this.f573b + 8];
            System.arraycopy(this.f572a, 0, bArr, 0, this.f572a.length);
            this.f572a = bArr;
        }
        this.f572a[6 + this.f573b] = (byte) ((j >> 56) & 255);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) ((j >> 48) & 255);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) ((j >> 40) & 255);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) ((j >> 32) & 255);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) ((j >> 24) & 255);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) ((j >> 16) & 255);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) ((j >> 8) & 255);
        this.f573b = (short) (this.f573b + 1);
        this.f572a[6 + this.f573b] = (byte) (j & 255);
        this.f573b = (short) (this.f573b + 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m674a(String str) {
        if (str == null || str.equals("")) {
            m671b((short) 0);
            return;
        }
        byte[] bytes = null;
        if (C0063c.f596a.equals("")) {
            bytes = str.getBytes();
        } else {
            try {
                bytes = str.getBytes(C0063c.f596a);
            } catch (Exception e) {
                C0063c.m746a(new StringBuffer().append("addToBody").append(e.toString()).toString());
            }
        }
        if (bytes == null) {
            m671b((short) 0);
        } else {
            m671b((short) bytes.length);
            m669a(bytes);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m675a() {
        return this.f574a;
    }
}
