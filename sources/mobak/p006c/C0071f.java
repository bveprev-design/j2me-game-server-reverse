package mobak.p006c;

import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;
import mobak.p004b.C0063c;

/* JADX INFO: renamed from: mobak.c.f */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/c/f.class */
public final class C0071f {

    /* JADX INFO: renamed from: a */
    public RecordStore f635a;

    /* JADX INFO: renamed from: a */
    private byte[] f636a = new byte[1];

    public C0071f() {
        try {
            this.f635a = RecordStore.openRecordStore("LM", true);
        } catch (RecordStoreException e) {
            C0063c.m746a(new StringBuffer().append("RMSManager").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m786a(byte b, int i) {
        return m789a(b, new byte[]{(byte) (i >>> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i});
    }

    /* JADX INFO: renamed from: a */
    public final boolean m787a(byte b, byte b2) {
        return m789a((byte) 18, new byte[]{b2});
    }

    /* JADX INFO: renamed from: a */
    public final boolean m788a(byte b, String str) {
        if (str == null || str.trim().equals("")) {
            return false;
        }
        try {
            return m789a(b, (C0063c.f596a == null || C0063c.f596a.equals("")) ? str.getBytes() : str.getBytes(C0063c.f596a));
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("setString").append(e.toString()).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m789a(byte b, byte[] bArr) {
        try {
            if (this.f635a == null) {
                return false;
            }
            if (bArr != null) {
                try {
                    if (bArr.length != 0) {
                        RecordEnumeration recordEnumerationEnumerateRecords = this.f635a.enumerateRecords(new C0068c(this, new byte[]{b}), (RecordComparator) null, false);
                        byte[] bArr2 = new byte[1 + bArr.length];
                        this.f636a[0] = b;
                        System.arraycopy(this.f636a, 0, bArr2, 0, 1);
                        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
                        if (recordEnumerationEnumerateRecords.numRecords() <= 0) {
                            if (this.f635a.getSizeAvailable() < bArr2.length) {
                                throw new Exception("no available space");
                            }
                            this.f635a.addRecord(bArr2, 0, bArr2.length);
                            return true;
                        }
                        int iNextRecordId = recordEnumerationEnumerateRecords.nextRecordId();
                        if (this.f635a.getSizeAvailable() + this.f635a.getRecordSize(iNextRecordId) < bArr2.length) {
                            throw new Exception("no available space");
                        }
                        this.f635a.setRecord(iNextRecordId, bArr2, 0, bArr2.length);
                        return true;
                    }
                } catch (RecordStoreNotOpenException e) {
                    C0063c.m746a(new StringBuffer().append("RecordStoreNotOpenException").append(e.toString()).toString());
                    return false;
                } catch (InvalidRecordIDException e2) {
                    C0063c.m746a(new StringBuffer().append("InvalidRecordIDException").append(e2.toString()).toString());
                    return false;
                } catch (RecordStoreException e3) {
                    C0063c.m746a(new StringBuffer().append("RecordStoreException").append(e3.toString()).toString());
                    return false;
                }
            }
            return m797a(b);
        } catch (Exception e4) {
            C0063c.m746a(new StringBuffer().append("cannot write data to RMS").append(e4.toString()).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m790a(byte b, long j) {
        try {
            byte[] bArrM795a = m795a((byte) 13);
            if (bArrM795a == null || bArrM795a.length != 8) {
                return j;
            }
            long j2 = 0;
            for (byte b2 = 0; b2 < 8; b2 = (byte) (b2 + 1)) {
                j2 |= (long) (bArrM795a[b2] & 127);
                if (bArrM795a[b2] < 0) {
                    j2 |= 128;
                }
                if (b2 < 7) {
                    j2 <<= 8;
                }
            }
            return j2;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getLong").append(e.toString()).toString());
            return j;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m791a(byte b, int i) {
        try {
            byte[] bArrM795a = m795a(b);
            if (bArrM795a == null || bArrM795a.length != 4) {
                return i;
            }
            int i2 = 0;
            for (byte b2 = 0; b2 < 4; b2 = (byte) (b2 + 1)) {
                i2 |= bArrM795a[b2] & 127;
                if (bArrM795a[b2] < 0) {
                    i2 |= 128;
                }
                if (b2 < 3) {
                    i2 <<= 8;
                }
            }
            return i2;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getInt").append(e.toString()).toString());
            return i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final short m792a(byte b, short s) {
        try {
            byte[] bArrM795a = m795a((byte) 7);
            if (bArrM795a == null || bArrM795a.length != 2) {
                return (short) 512;
            }
            short s2 = 0;
            for (byte b2 = 0; b2 < 2; b2 = (byte) (b2 + 1)) {
                s2 = (short) (s2 | (bArrM795a[b2] & 127));
                if (bArrM795a[b2] < 0) {
                    s2 = (short) (s2 | 128);
                }
                if (b2 < 1) {
                    s2 = (short) (s2 << 8);
                }
            }
            return s2;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getShort").append(e.toString()).toString());
            return (short) 512;
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte m793a(byte b, byte b2) {
        try {
            byte[] bArrM795a = m795a((byte) 18);
            if (bArrM795a == null || bArrM795a.length != 1) {
                return (byte) 1;
            }
            return bArrM795a[0];
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("getByte").append(e.toString()).toString());
            return (byte) 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.lang.Throwable] */
    /* JADX INFO: renamed from: a */
    public final String m794a(byte b, String str) {
        ?? M795a = m795a(b);
        if (M795a == 0) {
            return str;
        }
        try {
            return (C0063c.f596a == null || C0063c.f596a.equals("")) ? new String((byte[]) M795a) : new String((byte[]) M795a, C0063c.f596a);
        } catch (Exception e) {
            C0063c.m746a(M795a.getMessage());
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m795a(byte b) {
        if (this.f635a == null) {
            return null;
        }
        try {
            this.f636a[0] = b;
            RecordEnumeration recordEnumerationEnumerateRecords = this.f635a.enumerateRecords(new C0068c(this, this.f636a), (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() <= 0) {
                return null;
            }
            byte[] bArrNextRecord = recordEnumerationEnumerateRecords.nextRecord();
            byte[] bArr = new byte[bArrNextRecord.length - 1];
            System.arraycopy(bArrNextRecord, 1, bArr, 0, bArr.length);
            return bArr;
        } catch (InvalidRecordIDException e) {
            C0063c.m746a(new StringBuffer().append("InvalidRecordIDException").append(e.toString()).toString());
            return null;
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append("RMS Exception").append(e2.toString()).toString());
            return null;
        } catch (RecordStoreException e3) {
            C0063c.m746a(new StringBuffer().append("RecordStoreException").append(e3.toString()).toString());
            return null;
        } catch (RecordStoreNotOpenException e4) {
            C0063c.m746a(new StringBuffer().append("RecordStoreNotOpenException").append(e4.toString()).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final short[] m796a(byte b) {
        if (this.f635a == null) {
            return null;
        }
        try {
            this.f636a[0] = b;
            RecordEnumeration recordEnumerationEnumerateRecords = this.f635a.enumerateRecords(new C0068c(this, this.f636a), (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() <= 0) {
                return null;
            }
            byte[] bArrNextRecord = recordEnumerationEnumerateRecords.nextRecord();
            byte[] bArr = new byte[bArrNextRecord.length - 1];
            short[] sArr = new short[bArr.length / 2];
            System.arraycopy(bArrNextRecord, 1, bArr, 0, bArr.length);
            short s = 0;
            for (short s2 = 0; s2 < bArr.length; s2 = (short) (s2 + 2)) {
                sArr[s] = (short) (((short) ((bArr[s2] << 8) & 65280)) | ((short) (bArr[s2 + 1] & 255)));
                s = (short) (s + 1);
            }
            return sArr;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("RMS Exception").append(e.toString()).toString());
            return null;
        } catch (RecordStoreNotOpenException e2) {
            C0063c.m746a(new StringBuffer().append("RecordStoreNotOpenException").append(e2.toString()).toString());
            return null;
        } catch (InvalidRecordIDException e3) {
            C0063c.m746a(new StringBuffer().append("InvalidRecordIDException").append(e3.toString()).toString());
            return null;
        } catch (RecordStoreException e4) {
            C0063c.m746a(new StringBuffer().append("RecordStoreException").append(e4.toString()).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m797a(byte b) {
        try {
            this.f636a[0] = b;
            RecordEnumeration recordEnumerationEnumerateRecords = this.f635a.enumerateRecords(new C0068c(this, this.f636a), (RecordComparator) null, false);
            if (recordEnumerationEnumerateRecords.numRecords() <= 0) {
                return true;
            }
            this.f635a.deleteRecord(recordEnumerationEnumerateRecords.nextRecordId());
            return true;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("delete").append(e.toString()).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m798a() {
        try {
            RecordEnumeration recordEnumerationEnumerateRecords = this.f635a.enumerateRecords(new C0068c(this, null), (RecordComparator) null, false);
            int iNumRecords = recordEnumerationEnumerateRecords.numRecords();
            for (int i = 0; i < iNumRecords; i++) {
                try {
                    this.f635a.deleteRecord(recordEnumerationEnumerateRecords.nextRecordId());
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("deleteOne").append(e.toString()).toString());
                }
            }
            return true;
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append("deleteAll").append(e2.toString()).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static short m799a(byte[] bArr, int i, short s) {
        return (bArr == null || bArr.length - i < 2) ? s : (short) (((short) ((255 & bArr[i]) << 8)) | (255 & bArr[i + 1]));
    }

    /* JADX INFO: renamed from: a */
    public static String m800a(byte[] bArr, int i, int i2, String str) {
        if (bArr != null) {
            try {
                if (bArr.length - i >= i2) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, i, bArr2, 0, i2);
                    return (C0063c.f596a == null || C0063c.f596a.equals("")) ? new String(bArr2) : new String(bArr2, C0063c.f596a);
                }
            } catch (Exception e) {
                C0063c.m746a(new StringBuffer().append("getString").append(e.toString()).toString());
                return str;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static final short m801a(int i) {
        if (i > 32767) {
            return Short.MAX_VALUE;
        }
        if (i < -32768) {
            return Short.MIN_VALUE;
        }
        return (short) i;
    }
}
