package mobak.p004b.p005a;

import mobak.C0050b;
import mobak.C0077g;
import mobak.Main2;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0001a;
import mobak.p000a.p001a.C0002b;
import mobak.p000a.p001a.C0004d;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p001a.C0006f;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0034b;
import mobak.p000a.p002b.C0038f;
import mobak.p000a.p002b.C0039g;
import mobak.p000a.p002b.C0042j;
import mobak.p000a.p002b.C0049q;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p000a.p002b.p003a.AbstractC0012e;
import mobak.p000a.p002b.p003a.AbstractC0026s;
import mobak.p000a.p002b.p003a.C0010c;
import mobak.p000a.p002b.p003a.C0011d;
import mobak.p000a.p002b.p003a.C0013f;
import mobak.p000a.p002b.p003a.C0015h;
import mobak.p000a.p002b.p003a.C0016i;
import mobak.p000a.p002b.p003a.C0018k;
import mobak.p000a.p002b.p003a.C0019l;
import mobak.p000a.p002b.p003a.C0020m;
import mobak.p000a.p002b.p003a.C0021n;
import mobak.p000a.p002b.p003a.C0023p;
import mobak.p000a.p002b.p003a.C0025r;
import mobak.p000a.p002b.p003a.C0030w;
import mobak.p000a.p002b.p003a.C0031x;
import mobak.p004b.C0063c;
import mobak.p006c.C0066a;
import mobak.p006c.C0067b;
import mobak.p006c.C0072g;

/* JADX INFO: renamed from: mobak.b.a.h */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/b/a/h.class */
public final class C0059h {

    /* JADX INFO: renamed from: a */
    private static String[] f575a = new String[0];

    /* JADX INFO: renamed from: a */
    public static final short[] f576a = {12, 10002, 10001, 3002, 10000, 18, 24, 74, 72, 63, 1012, 16, 26, 64, 21, 73, 25, 20, 61, 27, 65, 60, 22, 1, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 153, 169, 170, 171, 173, 174, 175, 192, 193, 206, 208, 209, 199, 201, 213, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 10003, 10005, 10004, 10006};

    /* JADX INFO: renamed from: a */
    private static short m676a(short s) {
        short s2 = -1;
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= f576a.length) {
                break;
            }
            if (f576a[s4] == s) {
                s2 = s4;
                break;
            }
            s3 = (short) (s4 + 1);
        }
        return s2;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m677a() {
        short s = -1;
        boolean zM678a = false;
        try {
            try {
                C0057f.m652b();
                short sM676a = m676a(C0057f.m654a());
                s = sM676a;
                zM678a = m678a(sM676a);
                C0057f.m651a();
            } catch (Exception e) {
                StringBuffer stringBuffer = new StringBuffer("Executing error: ");
                if (s < 0 || s >= f575a.length) {
                    stringBuffer.append("index: ").append((int) s).append(" ");
                } else {
                    stringBuffer.append("message: ").append(f575a[s]).append(" ");
                }
                stringBuffer.append(e.toString());
                C0063c.m746a(stringBuffer.toString());
                C0057f.m651a();
            }
            return zM678a;
        } catch (Throwable th) {
            C0057f.m651a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m678a(short s) throws Exception {
        boolean zM739X;
        C0038f c0038fM605a;
        boolean z;
        switch (s) {
            case 0:
                Main2 main2 = Main2.f0a;
                if (main2.f3b) {
                    main2.f6a.m788a((byte) 17, (String) null);
                    main2.f6a.m788a((byte) 2, main2.f4a);
                    main2.f3b = false;
                }
                m706u();
                C0057f.m663a();
                RunnableC0037e.f360a.f385a.m215d();
                byte bM658a = C0057f.m658a();
                byte bM658a2 = C0057f.m658a();
                if (bM658a != 0 && bM658a2 != 0) {
                    C0005e.f76a.m96a(bM658a, bM658a2);
                    if (RunnableC0037e.f360a.f386a != null) {
                        RunnableC0037e.f360a.f386a.m363a(bM658a, bM658a2, true);
                    }
                }
                zM739X = true;
                break;
            case 1:
                zM739X = true;
                break;
            case 2:
                zM739X = true;
                break;
            case 3:
            case 4:
            case 9:
            case 12:
            case 25:
            case 28:
            case 29:
            case 30:
            case 36:
            case 37:
            case 39:
            case 40:
            case 42:
            case 43:
            case 44:
            case 45:
            case 51:
            case 58:
            case 59:
            case 60:
            case 66:
            case 67:
            case 68:
            case 71:
            case 72:
            case 73:
            case 74:
            case 77:
            case 78:
            case 82:
            case 83:
            case 84:
            case 85:
            case 87:
            case 88:
            case 89:
            case 90:
            case 92:
            case 93:
            case 95:
            case 96:
            default:
                throw new Exception("unknown cmd");
            case 5:
                RunnableC0037e.f360a.m449b(false);
                String strM663a = C0057f.m663a();
                String strM663a2 = C0057f.m663a();
                int iM660b = C0057f.m660b();
                int iM660b2 = C0057f.m660b();
                RunnableC0037e.m429a(strM663a, strM663a2, iM660b);
                if (iM660b2 > 0) {
                    C0058g c0058g = new C0058g(f576a[5]);
                    c0058g.m670a(iM660b2);
                    C0063c.f597a.m749a(c0058g);
                }
                zM739X = true;
                break;
            case 6:
                if (RunnableC0037e.f360a.f387a == null) {
                    RunnableC0037e.f360a.f387a = new C0049q();
                    RunnableC0037e.f360a.m447a(true);
                }
                if (C0005e.f76a.f101b) {
                    C0020m.m240d();
                }
                byte[] bArr = null;
                byte bM658a3 = C0057f.m658a();
                if (C0057f.m656a() > 1) {
                    byte[] bArr2 = new byte[C0057f.m656a() - 1];
                    bArr = bArr2;
                    C0057f.m664b(bArr2);
                }
                RunnableC0037e.f360a.f387a.m572a(bArr);
                if (bM658a3 == 1) {
                    C0063c.f597a.m749a(new C0058g(f576a[9]));
                }
                zM739X = true;
                break;
            case 7:
                RunnableC0037e.f367a = null;
                switch (C0057f.m658a()) {
                    case 0:
                        RunnableC0037e.f367a = m679a(true);
                        if (RunnableC0037e.f360a.m439a() != null) {
                            RunnableC0037e.f360a.m439a().mo168a();
                        }
                        AbstractC0026s.f269b = true;
                        z = true;
                        break;
                    case 1:
                        RunnableC0037e.f367a = m685a(false);
                        if (RunnableC0037e.f360a.m439a() != null) {
                            RunnableC0037e.f360a.m439a().mo168a();
                        }
                        AbstractC0026s.f269b = true;
                        z = true;
                        break;
                    default:
                        z = false;
                        break;
                }
                zM739X = z;
                break;
            case 8:
                if (C0057f.m658a() == 1 && C0057f.m659c() == 128) {
                    RunnableC0037e.f360a.m437a((AbstractC0012e) m682b(), true);
                }
                zM739X = true;
                break;
            case 10:
                zM739X = m686a(true);
                break;
            case 11:
                if (C0005e.f76a.f101b) {
                    C0020m.m240d();
                }
                RunnableC0037e.m431a(C0057f.m663a(), C0057f.m663a(), C0057f.m663a(), new C0054c());
                C0063c.f592b = C0057f.m659c();
                RunnableC0037e.f360a.m449b(false);
                zM739X = true;
                break;
            case 13:
                zM739X = true;
                break;
            case 14:
                zM739X = m687b();
                break;
            case 15:
                if (C0057f.m658a() == 2) {
                    RunnableC0037e.f360a.m443f();
                    RunnableC0037e.m427a("\u041e\u0448\u0438\u0431\u043a\u0430!", "\u041f\u0440\u043e\u0438\u0437\u043e\u0448\u043b\u0430 \u043e\u0448\u0438\u0431\u043a\u0430, \u043f\u043e\u043f\u0440\u043e\u0431\u0443\u0439\u0442\u0435 \u0435\u0449\u0435 \u0440\u0430\u0437.");
                    if (AbstractC0041i.m541d()) {
                        C0063c.f597a.m755c();
                    }
                }
                zM739X = true;
                break;
            case 16:
                zM739X = m689d();
                break;
            case 17:
                zM739X = m688c();
                break;
            case 18:
                zM739X = m690e();
                break;
            case 19:
                if (RunnableC0037e.f360a.f386a != null) {
                    RunnableC0037e.f360a.m454b(C0057f.m663a(), C0057f.m663a());
                }
                zM739X = true;
                break;
            case 20:
                zM739X = m691f();
                break;
            case 21:
                zM739X = m692g();
                break;
            case 22:
                zM739X = m693h();
                break;
            case 23:
                zM739X = m694i();
                break;
            case 24:
                zM739X = m695j();
                break;
            case 26:
                zM739X = m696k();
                break;
            case 27:
                zM739X = m697l();
                break;
            case 31:
                zM739X = m698m();
                break;
            case 32:
                C0063c.f597a.m755c();
                C0063c.f597a.m758a(false);
                RunnableC0037e.f360a.m441a((byte) 1);
                RunnableC0037e.f360a.f385a = AbstractC0012e.m183a();
                String strM663a3 = C0057f.m663a();
                String strM663a4 = C0057f.m663a();
                RunnableC0037e.f360a.f385a.m213a(new String[][]{C0013f.m205a(), new String[0]});
                RunnableC0037e.m431a(C0066a.m773a(29), strM663a3, strM663a4, new C0052a());
                zM739X = true;
                break;
            case 33:
                if (C0005e.f76a.f101b) {
                    C0020m.m240d();
                }
                byte bM658a4 = C0057f.m658a();
                C0063c.f597a.m750a(f576a[34], false);
                if (bM658a4 == 0) {
                    C0063c.f597a.m755c();
                    RunnableC0037e.m427a(C0057f.m663a(), C0057f.m663a());
                    AbstractC0041i.m540h();
                    RunnableC0037e.f360a.m423a().m534e((byte) 0);
                } else if (bM658a4 == 3) {
                    C0057f.m660b();
                    RunnableC0037e.m431a(C0066a.m773a(135), C0057f.m663a(), C0066a.m773a(184), new C0060i());
                    RunnableC0037e.f360a.m449b(false);
                } else {
                    if (RunnableC0037e.f360a.f387a == null) {
                        RunnableC0037e.f360a.f387a = new C0049q();
                    }
                    C0005e.f76a.f90b = 0;
                    RunnableC0037e.f360a.f387a.f535a = new C0005e(false);
                    String strM663a5 = C0057f.m663a();
                    String strM663a6 = C0057f.m663a();
                    int iM660b3 = C0057f.m660b();
                    if (strM663a5.equals("") || strM663a6.equals("")) {
                        RunnableC0037e.f360a.m441a((byte) 3);
                        RunnableC0037e.f360a.m472l();
                    } else {
                        RunnableC0037e.f360a.m449b(false);
                        RunnableC0037e.m430a(strM663a5, strM663a6, new C0061j(), 15000);
                    }
                    RunnableC0037e.f360a.f387a.f535a.f84a = iM660b3;
                    RunnableC0037e.f360a.f387a.f535a.f78a = C0057f.m663a();
                    int iM609a = C0050b.m609a(iM660b3, (byte) 1);
                    if (iM609a >= 0 && (c0038fM605a = C0050b.m605a(iM609a)) != null) {
                        c0038fM605a.m509a();
                        C0077g c0077gM636a = C0050b.m636a(c0038fM605a.m503c());
                        byte b = 0;
                        while (true) {
                            byte b2 = b;
                            if (b2 < c0077gM636a.f647e) {
                                C0050b.m627a((byte) (c0038fM605a.m501a() + c0077gM636a.f648a[b2][0]), (byte) (c0038fM605a.m502b() + c0077gM636a.f648a[b2][1]));
                                b = (byte) (b2 + 1);
                            }
                        }
                    }
                }
                zM739X = true;
                break;
            case 34:
                zM739X = m700o();
                break;
            case 35:
                zM739X = m701p();
                break;
            case 38:
                zM739X = m702q();
                break;
            case 41:
                zM739X = m703r();
                break;
            case 46:
                zM739X = m718F();
                break;
            case 47:
                zM739X = m704s();
                break;
            case 48:
                zM739X = m721I();
                break;
            case 49:
                zM739X = m705t();
                break;
            case 50:
                zM739X = m706u();
                break;
            case 52:
                zM739X = m707v();
                break;
            case 53:
                zM739X = m708w();
                break;
            case 54:
                zM739X = true;
                break;
            case 55:
                zM739X = m719G();
                break;
            case 56:
                zM739X = m710x();
                break;
            case 57:
                zM739X = m715C();
                break;
            case 61:
                zM739X = m711y();
                break;
            case 62:
                zM739X = m712z();
                break;
            case 63:
                zM739X = m713A();
                break;
            case 64:
                zM739X = m714B();
                break;
            case 65:
                C0005e.f76a.m109a(C0057f.m661a());
                zM739X = true;
                break;
            case 69:
                zM739X = m716D();
                break;
            case 70:
                zM739X = m717E();
                break;
            case 75:
                zM739X = m720H();
                break;
            case 76:
                zM739X = m723J();
                break;
            case 79:
                zM739X = m725K();
                break;
            case 80:
                zM739X = m726L();
                break;
            case 81:
                zM739X = m727M();
                break;
            case 86:
                zM739X = m728N();
                break;
            case 91:
                RunnableC0037e.f360a.m443f();
                zM739X = true;
                break;
            case 94:
                zM739X = m730P();
                break;
            case 97:
                zM739X = m729O();
                break;
            case 98:
                m733a(C0066a.f621b);
                zM739X = true;
                break;
            case 99:
                zM739X = m731Q();
                break;
            case 100:
                zM739X = m732R();
                break;
            case 101:
                zM739X = m734S();
                break;
            case 102:
                zM739X = m735T();
                break;
            case 103:
                zM739X = m736U();
                break;
            case 104:
                zM739X = m737V();
                break;
            case 105:
                zM739X = m738W();
                break;
            case 106:
                zM739X = m699n();
                break;
            case 107:
                C0063c.f597a.m755c();
                C0063c.f597a.m758a(false);
                RunnableC0037e.f360a.m441a((byte) 1);
                RunnableC0037e.f360a.f385a = AbstractC0012e.m183a();
                String strM663a7 = C0057f.m663a();
                RunnableC0037e.f360a.f385a.m213a(new String[][]{C0013f.m205a(), new String[0]});
                RunnableC0037e.m428a(C0066a.m773a(29), strM663a7, new C0053b());
                zM739X = true;
                break;
            case 108:
                Main2.m11a();
                zM739X = true;
                break;
            case 109:
                zM739X = m739X();
                break;
        }
        return zM739X;
    }

    /* JADX INFO: renamed from: a */
    private static final C0001a[] m679a(boolean z) {
        try {
            if (C0057f.m657b()) {
                return null;
            }
            int iM658a = C0057f.m658a();
            C0001a[] c0001aArr = new C0001a[iM658a];
            for (int i = 0; i < iM658a; i++) {
                c0001aArr[i] = null;
            }
            for (int i2 = 0; !C0057f.m653a() && i2 < iM658a; i2++) {
                c0001aArr[i2] = m680a();
                if (z) {
                    c0001aArr[i2].m43b(false);
                }
            }
            return c0001aArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final C0001a m680a() {
        try {
            int iM660b = C0057f.m660b();
            boolean z = C0057f.m658a() > 0;
            byte bM658a = C0057f.m658a();
            byte b = (byte) (bM658a & 15);
            byte b2 = (byte) ((bM658a >> 4) & 15);
            C0001a c0001a = new C0001a();
            c0001a.m31d((byte) 0);
            c0001a.m36e((byte) 0);
            c0001a.m69g(iM660b);
            c0001a.m59c(z);
            c0001a.m28a(bM658a);
            c0001a.m35d(C0057f.m659c());
            c0001a.m34c(C0057f.m659c());
            c0001a.m44i(C0057f.m659c());
            c0001a.m33b(C0057f.m659c());
            c0001a.m32a(C0057f.m659c());
            c0001a.m37e(C0057f.m659c());
            c0001a.m38f(C0057f.m659c());
            c0001a.m39g(C0057f.m659c());
            c0001a.m40h(C0057f.m659c());
            c0001a.m41f(C0057f.m658a());
            c0001a.m27a((byte) 0, C0057f.m658a());
            c0001a.m42g(C0057f.m658a());
            c0001a.m63e(C0057f.m660b());
            c0001a.m73b(C0057f.m663a());
            c0001a.m67j((byte) (b + 1));
            c0001a.mo60c((int) b2);
            byte bM658a2 = C0057f.m658a();
            c0001a.m30c((byte) ((bM658a2 >> 4) & 15));
            c0001a.m29b((byte) (bM658a2 & 15));
            c0001a.m70a(new int[]{C0057f.m660b(), C0057f.m660b()});
            c0001a.m77c(C0057f.m663a());
            return c0001a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final C0013f m681a() {
        try {
            C0013f c0013f = new C0013f((short) -104);
            int iM659c = C0057f.m659c();
            String[][] strArr = new String[1][iM659c + 1];
            short[] sArr = new short[iM659c];
            for (short s = 0; s < iM659c; s = (short) (s + 1)) {
                sArr[s] = C0057f.m659c();
                strArr[0][s] = C0057f.m663a();
            }
            c0013f.m199c(C0057f.m663a());
            c0013f.m198b(C0057f.m663a());
            strArr[0][iM659c] = C0066a.m773a(125);
            ((AbstractC0041i) c0013f).f456a = new C0025r(null, new byte[]{52, 64, 97, 95, 103, 104}, null);
            ((AbstractC0041i) c0013f).f456a.m283a(true, (byte) 85, (short) 93);
            ((AbstractC0041i) c0013f).f456a.m283a(true, (byte) 88, (short) 52);
            ((AbstractC0041i) c0013f).f456a.m283a(true, (byte) 87, (short) 95);
            ((AbstractC0041i) c0013f).f456a.m283a(true, (byte) 102, (short) 181);
            c0013f.m212a((byte) 0);
            c0013f.m216b((byte) 0);
            c0013f.m217c((byte) 2);
            c0013f.m213a(strArr);
            c0013f.m211a(sArr);
            c0013f.m527d(C0005e.m144a(C0057f.m658a()));
            AbstractC0041i.m539g();
            return c0013f;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("City Entry ").append(e.getMessage()).toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static final C0013f m682b() {
        try {
            C0013f c0013f = new C0013f((short) -102);
            c0013f.m198b(C0066a.m773a(200));
            int iM659c = C0057f.m659c();
            if (iM659c > 0) {
                String[][] strArr = new String[2][iM659c + 1];
                strArr[0] = new String[]{C0066a.m773a(33), C0066a.m773a(32)};
                short[] sArr = new short[iM659c];
                short[] sArr2 = new short[iM659c];
                for (byte b = 0; b < iM659c && !C0057f.m653a(); b = (byte) (b + 1)) {
                    sArr[b] = C0057f.m659c();
                    strArr[1][b] = C0057f.m663a();
                    sArr2[b] = C0057f.m659c();
                }
                strArr[1][iM659c] = C0066a.m773a(34);
                c0013f.m211a(sArr);
                c0013f.m213a(strArr);
                c0013f.m214b(sArr2);
            } else {
                c0013f.m213a(new String[][]{new String[]{C0066a.m773a(32)}});
            }
            c0013f.m217c((byte) 3);
            c0013f.m212a((byte) 0);
            c0013f.m216b((byte) 0);
            c0013f.m177b(false);
            ((AbstractC0041i) c0013f).f456a = new C0025r(null, new byte[]{55}, null);
            return c0013f;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [int, java.lang.Throwable] */
    /* JADX INFO: renamed from: a */
    private static final C0038f m683a() {
        C0038f c0038fM605a;
        ?? M612b;
        try {
            boolean z = false;
            int iM660b = C0057f.m660b();
            byte bM658a = C0057f.m658a();
            int iM610b = C0050b.m610b(iM660b, bM658a);
            if (iM610b == -1) {
                c0038fM605a = bM658a == 1 ? new C0042j(C0057f.m658a()) : new C0038f();
                z = true;
                c0038fM605a.m490a(iM660b);
                c0038fM605a.m493a(bM658a);
            } else {
                c0038fM605a = C0050b.m605a(iM610b);
                if (bM658a == 1) {
                    C0057f.m658a();
                }
            }
            byte bM658a2 = C0057f.m658a();
            if (((byte) (bM658a2 & 1)) == 1) {
                c0038fM605a.m508c(C0057f.m658a());
            }
            if (((byte) (bM658a2 & 2)) == 2) {
                c0038fM605a.m506b(C0057f.m658a());
            }
            if (((byte) (bM658a2 & 4)) == 4) {
                c0038fM605a.m492a(C0057f.m663a());
            }
            if (((byte) (bM658a2 & 8)) == 8) {
                int iM658a = C0057f.m658a();
                if (iM658a == 0) {
                    c0038fM605a.m491a((int[]) null);
                } else {
                    int[] iArr = new int[iM658a];
                    for (byte b = 0; !C0057f.m653a() && b < iM658a; b = (byte) (b + 1)) {
                        iArr[b] = C0057f.m660b();
                    }
                    c0038fM605a.m491a(iArr);
                }
            }
            if (((byte) (bM658a2 & 16)) == 16) {
                c0038fM605a.mo494a(C0057f.m658a(), C0057f.m658a(), false);
            }
            if (z) {
                M612b = C0050b.m612b(c0038fM605a);
            }
            return c0038fM605a;
        } catch (Exception e) {
            C0063c.m746a(M612b.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final C0006f m684a(boolean z) {
        try {
            C0006f c0006f = new C0006f(z);
            c0006f.m155b(C0057f.m660b());
            c0006f.m59c(C0057f.m658a() > 0);
            c0006f.m156d(C0057f.m658a());
            c0006f.mo60c(C0057f.m660b());
            c0006f.m67j(C0057f.m658a());
            c0006f.m73b(C0057f.m663a());
            c0006f.m152a(C0057f.m663a());
            c0006f.m69g(C0057f.m660b());
            c0006f.m153b(C0057f.m658a());
            c0006f.m63e(C0057f.m660b());
            c0006f.m151a((int) C0057f.m658a());
            c0006f.m150a(C0057f.m658a());
            c0006f.m154c(C0057f.m658a());
            c0006f.m157e(C0057f.m658a());
            c0006f.f123a = new C0004d[C0057f.m658a()];
            if (c0006f.f123a.length > 0) {
                for (byte b = 0; b < c0006f.f123a.length && !C0057f.m653a(); b = (byte) (b + 1)) {
                    c0006f.f123a[b] = new C0004d();
                    c0006f.f123a[b].f73a = C0057f.m660b();
                    c0006f.f123a[b].f74a = C0066a.f621b.m803a(c0006f.f123a[b].f73a);
                    c0006f.f123a[b].f75b = (int) C0057f.m662a(C0057f.m658a());
                }
            }
            c0006f.m70a(new int[]{C0057f.m660b(), C0057f.m660b(), C0057f.m660b()});
            c0006f.m77c(C0057f.m663a());
            return c0006f;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final C0006f[] m685a(boolean z) {
        try {
            int iM658a = C0057f.m658a();
            if (iM658a == 0) {
                return null;
            }
            C0006f[] c0006fArr = new C0006f[iM658a];
            for (byte b = 0; b < iM658a && !C0057f.m653a(); b = (byte) (b + 1)) {
                c0006fArr[b] = m684a(z);
            }
            return c0006fArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static final boolean m686a(boolean z) {
        switch (C0057f.m658a()) {
            case 0:
                RunnableC0037e.f360a.m436a(m681a(), z);
                break;
            case 1:
                C0063c.f597a.m755c();
                RunnableC0037e.m427a(C0066a.m773a(119), C0066a.m773a(120));
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static final boolean m687b() {
        if (RunnableC0037e.f360a.f387a == null) {
            RunnableC0037e.f360a.f387a = new C0049q();
        }
        if (RunnableC0037e.f360a.f387a.f535a == null) {
            RunnableC0037e.f360a.f387a.f535a = new C0005e(false);
        }
        C0001a[] c0001aArrM679a = m679a(false);
        if (c0001aArrM679a == null) {
            return true;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= c0001aArrM679a.length) {
                break;
            }
            c0001aArrM679a[b2].m43b(true);
            if (c0001aArrM679a[b2] != null && c0001aArrM679a[b2].mo22a() >= 0 && c0001aArrM679a[b2].mo22a() < 5) {
                RunnableC0037e.f360a.f387a.f535a.m91a((byte) c0001aArrM679a[b2].mo22a(), c0001aArrM679a[b2]);
            }
            b = (byte) (b2 + 1);
        }
        if (RunnableC0037e.f360a.f387a == null) {
            return true;
        }
        RunnableC0037e.f360a.f387a.m581n();
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m688c() {
        C0005e.f76a.m118d(C0057f.m660b());
        C0001a[] c0001aArrM679a = m679a(true);
        if (c0001aArrM679a == null) {
            return false;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                break;
            }
            C0005e.f76a.m91a(b2, (C0001a) null);
            b = (byte) (b2 + 1);
        }
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= c0001aArrM679a.length) {
                break;
            }
            if (c0001aArrM679a[b4] != null && c0001aArrM679a[b4].mo22a() >= 0 && c0001aArrM679a[b4].mo22a() < 5) {
                C0005e.f76a.m91a((byte) c0001aArrM679a[b4].mo22a(), c0001aArrM679a[b4]);
            }
            b3 = (byte) (b4 + 1);
        }
        RunnableC0037e.f360a.m423a().mo223c();
        if (RunnableC0037e.f360a.f387a != null) {
            RunnableC0037e.f360a.f387a.m580d();
        }
        AbstractC0026s.f269b = true;
        return true;
    }

    /* JADX INFO: renamed from: d */
    private static final boolean m689d() {
        C0005e.f76a.m121f(C0057f.m660b());
        C0006f[] c0006fArrM685a = m685a(false);
        if (c0006fArrM685a == null || c0006fArrM685a.length == 0) {
            C0005e.f76a.m87a((C0006f[]) null);
        } else {
            C0006f[] c0006fArr = new C0006f[30];
            for (int i = 0; i < c0006fArrM685a.length; i++) {
                if (c0006fArrM685a[i] != null) {
                    c0006fArr[c0006fArrM685a[i].mo47d()] = c0006fArrM685a[i];
                }
            }
            if (C0005e.f76a == null) {
                C0005e.f76a = new C0005e(true);
            }
            C0005e.f76a.m87a(c0006fArr);
            RunnableC0037e.f360a.m423a().mo223c();
        }
        C0005e.f76a.m127b(m685a(false));
        AbstractC0026s.f269b = true;
        return true;
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m690e() {
        if (C0005e.f76a == null) {
            C0005e.f76a = new C0005e(true);
        }
        C0005e.f76a.m96a(C0057f.m658a(), C0057f.m658a());
        if (RunnableC0037e.f360a.f386a == null) {
            return true;
        }
        RunnableC0037e.f360a.f386a.m363a(C0005e.f76a.m97a(), C0005e.f76a.m98b(), true);
        try {
            RunnableC0037e.f360a.f386a.m385b();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m691f() {
        if (RunnableC0037e.f360a.f386a == null) {
            RunnableC0037e.f360a.f386a = new C0034b();
        }
        synchronized (C0063c.f597a) {
            try {
                if (C0057f.m658a() == 1) {
                    C0050b.m615a();
                }
                short sM659c = C0057f.m659c();
                for (int i = 0; i < sM659c; i++) {
                    m683a();
                }
                short sM659c2 = C0057f.m659c();
                if (sM659c2 > 0) {
                    for (int i2 = 0; !C0057f.m653a() && i2 < sM659c2; i2++) {
                        C0050b.m614a(C0057f.m660b(), C0057f.m658a());
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (RunnableC0037e.f360a.f386a != null && C0005e.f76a != null) {
            RunnableC0037e.f360a.f386a.m385b();
        }
        RunnableC0037e.f360a.f386a.m385b();
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m692g() throws Exception {
        if (RunnableC0037e.f360a == null) {
            RunnableC0037e.f360a = new RunnableC0037e();
        }
        if (RunnableC0037e.f360a.f386a != null) {
            RunnableC0037e.f360a.f386a.m543c(false);
        }
        byte bM658a = C0057f.m658a();
        byte bM658a2 = C0057f.m658a();
        if (bM658a != 0 && bM658a2 != 0 && C0005e.f76a != null) {
            C0005e.f76a.m96a(bM658a, bM658a2);
            if (RunnableC0037e.f360a.f386a != null) {
                RunnableC0037e.f360a.f386a.m363a(bM658a, bM658a2, true);
            }
        }
        String strM663a = C0057f.m663a();
        int iM660b = C0057f.m660b();
        if ((C0057f.m656a() + C0058g.f571a) - C0057f.f570a < 2500) {
            throw new Exception("Map not full");
        }
        byte[] bArr = new byte[2500];
        C0057f.m664b(bArr);
        C0050b.m619a(bArr);
        AbstractC0041i.f449c = strM663a;
        if (RunnableC0037e.f360a.f386a != null && C0005e.f76a != null) {
            RunnableC0037e.f360a.f386a.m385b();
        }
        if (iM660b > 0) {
            if (Main2.f0a.f6a.m789a((byte) 8, C0057f.m665a(2))) {
                Main2.f0a.f6a.m786a((byte) 9, iM660b);
            }
        }
        C0050b.m615a();
        if (RunnableC0037e.f360a.f386a == null) {
            return true;
        }
        RunnableC0037e.f360a.f386a.m543c(true);
        return true;
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m693h() {
        byte bM658a = (byte) (C0057f.m658a() - 1);
        byte b = bM658a;
        byte b2 = (byte) (bM658a + 1);
        C0005e c0005e = C0005e.f76a;
        if (b >= 50) {
            b = (byte) (b - 50);
            if (RunnableC0037e.f360a.f387a != null) {
                c0005e = RunnableC0037e.f360a.f387a.f535a;
            }
        }
        if (c0005e == null) {
            return false;
        }
        C0001a c0001aM90a = c0005e.m90a(b);
        if (b >= 5) {
            c0001aM90a = c0005e == C0005e.f76a ? RunnableC0037e.f360a.f387a.m588a((byte) (b + 1)) : RunnableC0037e.f360a.f387a.m588a((byte) (b + 51));
        }
        if (c0001aM90a == null) {
            return false;
        }
        synchronized (c0001aM90a) {
            C0001a c0001a = c0001aM90a;
            if (c0001a != null) {
                try {
                    int iMo24c = c0001a.mo24c();
                    boolean z = false;
                    for (short sM659c = C0057f.m659c(); sM659c != Short.MIN_VALUE && !C0057f.m653a(); sM659c = C0057f.m659c()) {
                        if (sM659c == 1) {
                            c0001a.m27a(C0057f.m658a(), C0057f.m658a());
                        } else if (sM659c == 2) {
                            c0001a.m39g(C0057f.m659c());
                        } else if (sM659c == 4) {
                            iMo24c = C0057f.m660b();
                            z = true;
                        } else if (sM659c == 16) {
                            c0001a.m44i(C0057f.m659c());
                        } else if (sM659c == 8) {
                            z = true;
                        } else if (sM659c == 32) {
                            byte bM658a2 = C0057f.m658a();
                            byte b3 = (byte) ((bM658a2 >> 4) & 15);
                            byte b4 = (byte) (bM658a2 & 15);
                            if (RunnableC0037e.f360a.f387a != null) {
                                RunnableC0037e.f360a.f387a.m595a(c0001a.mo22a(), c0001a.mo23b(), b3, b4);
                            }
                            c0001a.m30c(b3);
                            c0001a.m29b(b4);
                        } else if (sM659c == 64) {
                            c0001a.m36e(C0057f.m658a());
                            c0001a.m38f(C0057f.m659c());
                            c0001a.m37e(C0057f.m659c());
                        } else if (sM659c == 128) {
                            c0001a.m31d(C0057f.m658a());
                            c0001a.m32a(C0057f.m659c());
                            c0001a.m33b(C0057f.m659c());
                            c0001a.m34c(C0057f.m659c());
                            c0001a.m35d(C0057f.m659c());
                        } else if (sM659c == 256) {
                            c0001a.m55i(C0057f.m658a());
                            c0001a.m56a();
                            short sM659c2 = C0057f.m659c();
                            for (short s = 0; s < sM659c2; s = (short) (s + 1)) {
                                c0001a.m49a(C0057f.m663a());
                            }
                        }
                    }
                    if (z) {
                        if (RunnableC0037e.f360a.f387a != null) {
                            RunnableC0037e.f360a.f387a.m592b(b2, iMo24c);
                        } else {
                            c0001a.m63e(iMo24c);
                        }
                    }
                } catch (Exception e) {
                    C0063c.m746a(new StringBuffer().append("unitSetChange: ").append(e.getMessage()).toString());
                }
            }
        }
        byte bM658a3 = C0057f.m658a();
        if (bM658a3 == 1) {
            m693h();
            return true;
        }
        if (bM658a3 != 2) {
            return true;
        }
        m700o();
        return true;
    }

    /* JADX INFO: renamed from: i */
    private static final boolean m694i() {
        C0063c.f597a.m749a(new C0058g(f576a[23], (short) 0, (short) 0));
        return true;
    }

    /* JADX INFO: renamed from: j */
    private static final boolean m695j() {
        C0055d c0055d = new C0055d();
        String strM663a = C0057f.m663a();
        String strM773a = strM663a;
        if (strM663a.trim().equals("")) {
            strM773a = C0066a.m773a(31);
        }
        RunnableC0037e.m428a(C0066a.m773a(1), strM773a, c0055d);
        return true;
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m696k() {
        if (!C0063c.f597a.m754b()) {
            return true;
        }
        C0063c.f597a.m755c();
        return true;
    }

    /* JADX INFO: renamed from: l */
    private static final boolean m697l() {
        if (C0063c.f597a.m754b()) {
            C0063c.f597a.m755c();
        }
        RunnableC0037e.m427a(C0066a.m773a(29), C0066a.m773a(35));
        return true;
    }

    /* JADX INFO: renamed from: m */
    private static final boolean m698m() {
        if (RunnableC0037e.f360a == null && RunnableC0037e.f360a.f386a == null) {
            return false;
        }
        RunnableC0037e.f360a.m454b(C0057f.m663a(), C0057f.m663a());
        return true;
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m699n() {
        RunnableC0037e.f360a.m447a(true);
        AbstractC0041i abstractC0041iM423a = RunnableC0037e.f360a.m423a();
        if (abstractC0041iM423a == null) {
            return true;
        }
        long jM661a = C0057f.m661a();
        String strM663a = null;
        if (C0057f.m658a() != 0) {
            strM663a = C0057f.m663a();
        }
        abstractC0041iM423a.m559a(jM661a, strM663a);
        return true;
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m700o() {
        try {
            if (RunnableC0037e.f360a.f387a == null) {
                return false;
            }
            byte bM658a = C0057f.m658a();
            RunnableC0037e.f360a.f387a.m579a(bM658a, C0057f.m660b());
            if (RunnableC0037e.f360a.f387a.f512a) {
                int iM658a = C0057f.m658a();
                byte[] bArr = null;
                if (iM658a != 0) {
                    byte[] bArr2 = new byte[iM658a];
                    bArr = bArr2;
                    C0057f.m664b(bArr2);
                }
                byte bM658a2 = C0057f.m658a();
                RunnableC0037e.f360a.f387a.m576a(bM658a, C0049q.m573a(bM658a2), C0049q.m574b(bM658a2));
                RunnableC0037e.f360a.f387a.m575b(bArr);
            }
            return true;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("activateUnit ").append(e.toString()).toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m701p() {
        if (RunnableC0037e.f360a.f387a == null) {
            return false;
        }
        byte[] bArr = new byte[C0057f.m658a()];
        C0057f.m664b(bArr);
        RunnableC0037e.f360a.f387a.m578c(bArr);
        switch (C0057f.m658a()) {
            case 1:
                m693h();
                return true;
            case 2:
                m700o();
                return true;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: q */
    private static final boolean m702q() {
        if (!RunnableC0037e.f360a.m459d()) {
            RunnableC0037e.m434c();
            RunnableC0037e.f360a.m460i();
        }
        byte bM658a = C0057f.m658a();
        C0063c.f597a.m755c();
        if ((bM658a & 1) == 1) {
            if ((bM658a & 2) == 2) {
                m708w();
            }
            if ((bM658a & 4) == 4) {
                m686a(false);
            }
        } else {
            if (((short) (bM658a & 4)) == 4) {
                C0050b.m622b();
            }
            C0057f.m658a();
            RunnableC0037e.f360a.m437a((AbstractC0012e) m681a(), false);
            byte bM658a2 = C0057f.m658a();
            byte bM658a3 = C0057f.m658a();
            if (bM658a2 != 0 && bM658a3 != 0) {
                C0005e.f76a.m96a(bM658a2, bM658a3);
            }
        }
        byte b = 0;
        if (((byte) (bM658a & 1)) == 1) {
            b = 2;
        }
        if ((bM658a & 6) != 0 || (bM658a & 1) == 0) {
            b = (byte) (((byte) (b << 4)) | 4);
        }
        if (RunnableC0037e.f360a.m419a() != 3) {
            RunnableC0037e.f360a.m441a((byte) 3);
        }
        RunnableC0037e.f360a.f387a.m565a(b);
        RunnableC0037e.f360a.f386a.m385b();
        return true;
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m703r() {
        byte bM658a = C0057f.m658a();
        if (bM658a != 1 && bM658a != 2) {
            return true;
        }
        AbstractC0012e abstractC0012eM439a = RunnableC0037e.f360a.m439a();
        RunnableC0037e.f360a.m449b(false);
        if (bM658a == 1) {
            RunnableC0037e.m427a(C0066a.m773a(29), C0066a.m773a(44));
        } else {
            RunnableC0037e.m427a(C0066a.m773a(83), C0066a.m773a(45));
        }
        if (abstractC0012eM439a == null) {
            return true;
        }
        RunnableC0037e.f360a.m441a((byte) 2);
        return true;
    }

    /* JADX INFO: renamed from: s */
    private static final boolean m704s() {
        byte bM658a = C0057f.m658a();
        C0001a c0001aM680a = m680a();
        if (bM658a != 1) {
            c0001aM680a.m43b(true);
        } else {
            c0001aM680a.m43b(false);
        }
        int iM660b = C0057f.m660b();
        if (RunnableC0037e.f360a.f387a == null) {
            return true;
        }
        RunnableC0037e.f360a.f387a.m585a(bM658a == 1, c0001aM680a, iM660b);
        return true;
    }

    /* JADX INFO: renamed from: t */
    private static final boolean m705t() {
        RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m189a(C0057f.m663a()), true);
        return true;
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m706u() {
        if (C0005e.f76a == null) {
            C0005e.f76a = new C0005e(true);
        }
        C0005e.f76a.f84a = C0057f.m660b();
        C0005e.f76a.m103a(C0057f.m663a());
        C0005e.f76a.m115b(C0057f.m659c());
        C0005e.f76a.m114c(C0057f.m660b());
        C0005e.f76a.m109a(C0057f.m661a());
        C0005e.f76a.m110b(C0057f.m660b());
        C0050b.f545a = C0057f.m660b();
        C0005e.f76a.f96a = C0057f.m658a();
        C0005e.f76a.m89a(C0057f.m659c());
        int iM659c = C0057f.m659c();
        if (iM659c > 0) {
            C0004d[] c0004dArr = new C0004d[iM659c];
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= iM659c) {
                    break;
                }
                c0004dArr[s2] = new C0004d();
                c0004dArr[s2].f73a = C0057f.m660b();
                c0004dArr[s2].f74a = C0066a.f621b.m803a(c0004dArr[s2].f73a);
                c0004dArr[s2].f75b = (int) C0057f.m662a(C0057f.m658a());
                s = (short) (s2 + 1);
            }
            C0005e.f76a.f94a = c0004dArr;
        }
        int iM659c2 = C0057f.m659c();
        if (iM659c2 > 0) {
            C0004d[] c0004dArr2 = new C0004d[iM659c2];
            short s3 = 0;
            while (true) {
                short s4 = s3;
                if (s4 >= iM659c2) {
                    break;
                }
                c0004dArr2[s4] = new C0004d();
                c0004dArr2[s4].f73a = C0057f.m660b();
                c0004dArr2[s4].f74a = C0066a.f621b.m803a(c0004dArr2[s4].f73a);
                c0004dArr2[s4].f75b = (int) C0057f.m662a(C0057f.m658a());
                s3 = (short) (s4 + 1);
            }
            C0005e.f76a.f95b = c0004dArr2;
        }
        String[] strArr = new String[C0057f.m658a()];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= strArr.length) {
                break;
            }
            strArr[b2] = C0057f.m663a();
            b = (byte) (b2 + 1);
        }
        C0005e.f76a.m138a(strArr);
        C0023p[] c0023pArr = new C0023p[C0057f.m658a()];
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= c0023pArr.length) {
                break;
            }
            c0023pArr[b4] = m724a();
            b3 = (byte) (b4 + 1);
        }
        C0005e.f76a.m141a(c0023pArr);
        int iM660b = C0057f.m660b();
        C0050b.f547c = iM660b;
        if (iM660b <= 0) {
            C0050b.f547c = 1;
        }
        RunnableC0037e.f360a.m438d();
        return true;
    }

    /* JADX INFO: renamed from: v */
    private static final boolean m707v() {
        try {
            if (C0063c.f597a.f607c != C0057f.m659c()) {
                return true;
            }
            C0063c.f597a.m756d();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: w */
    private static final boolean m708w() {
        try {
            m709a(false);
            return true;
        } catch (Exception e) {
            C0063c.m745a((Exception) 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m709a(boolean z) {
        int iM660b = C0057f.m660b();
        int iM660b2 = C0057f.m660b();
        C0015h c0015h = !z ? new C0015h(iM660b) : new C0015h(0, iM660b);
        RunnableC0037e.f360a.m437a(c0015h, iM660b2 == 1);
        int iM658a = C0057f.m658a();
        C0015h c0015h2 = c0015h;
        if (iM658a > 0) {
            c0015h2.f198a = new C0031x[iM658a];
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= iM658a || C0057f.m653a()) {
                return;
            }
            C0057f.m658a();
            int[][] iArr = new int[C0057f.m658a()][2];
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 >= iArr.length || C0057f.m653a()) {
                    break;
                }
                iArr[b4][0] = C0057f.m660b();
                iArr[b4][1] = C0057f.m660b();
                b3 = (byte) (b4 + 1);
            }
            C0015h c0015h3 = c0015h;
            if (b2 >= 0 && c0015h3.f198a != null && b2 < c0015h3.f198a.length) {
                if (c0015h3.f198a[b2] == null) {
                    c0015h3.f198a[b2] = new C0031x(c0015h3);
                }
                c0015h3.f198a[b2].f319a = iArr;
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00df: INVOKE (r0 I:java.lang.String) = (r0 I:java.lang.Throwable) VIRTUAL call: java.lang.Throwable.getMessage():java.lang.String A[MD:():java.lang.String (c)], block:B:42:0x00de */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: x */
    private static final boolean m710x() {
        ?? message;
        try {
            byte bM658a = C0057f.m658a();
            boolean z = (bM658a & 4) == 4;
            boolean z2 = ((byte) (bM658a & 2)) == 2;
            boolean z3 = ((byte) (bM658a & 1)) == 1;
            boolean z4 = ((byte) (bM658a & 16)) == 16;
            boolean z5 = ((byte) (bM658a & 8)) == 8;
            int iM659c = C0057f.m659c();
            String[] strArr = new String[iM659c];
            String[] strArr2 = new String[iM659c];
            int[] iArr = new int[iM659c];
            for (short s = 0; !C0057f.m653a() && s < iM659c; s = (short) (s + 1)) {
                iArr[(iM659c - 1) - s] = C0057f.m660b();
                strArr[s] = C0057f.m663a();
                strArr2[s] = C0057f.m663a();
            }
            if (!z && !z5) {
                C0020m.m231a().m243a(strArr, strArr2, iArr);
                return true;
            }
            if (z) {
                C0020m.m231a().m245a(strArr, strArr2, iArr, z2, z3, z4);
                return true;
            }
            if (!z5) {
                return true;
            }
            C0020m.m231a().m246b(strArr, strArr2, iArr);
            return true;
        } catch (Exception e) {
            C0063c.m746a(message.getMessage());
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00bb: INVOKE (r0 I:java.lang.String) = (r0 I:java.lang.Throwable) VIRTUAL call: java.lang.Throwable.getMessage():java.lang.String A[MD:():java.lang.String (c)], block:B:31:0x00ba */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: y */
    private static final boolean m711y() {
        ?? message;
        try {
            byte bM658a = C0057f.m658a();
            int iM659c = C0057f.m659c();
            if (bM658a == 1) {
                String[] strArr = new String[iM659c];
                int[] iArr = new int[iM659c];
                for (int i = 0; i < iM659c && !C0057f.m653a(); i++) {
                    iArr[i] = C0057f.m660b();
                    strArr[i] = C0057f.m663a();
                }
                C0020m c0020mM231a = C0020m.m231a();
                c0020mM231a.m242n();
                c0020mM231a.f219a = strArr;
                c0020mM231a.f220a = iArr;
                c0020mM231a.f218a = (byte) 1;
                return true;
            }
            if (bM658a != 2) {
                return true;
            }
            String[] strArr2 = new String[iM659c];
            String[] strArr3 = new String[iM659c];
            int[] iArr2 = new int[iM659c];
            for (int i2 = 0; i2 < iM659c && !C0057f.m653a(); i2++) {
                strArr2[i2] = C0057f.m663a();
                strArr3[i2] = C0057f.m663a();
                iArr2[i2] = C0057f.m660b();
            }
            C0020m.m231a().m233a(strArr2, strArr3, iArr2, C0057f.m658a() == 1, C0057f.m658a() == 1);
            return true;
        } catch (Exception e) {
            C0063c.m746a(message.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: z */
    private static final boolean m712z() {
        try {
            int iM659c = C0057f.m659c();
            C0002b[] c0002bArr = new C0002b[iM659c];
            for (short s = 0; s < iM659c && !C0057f.m653a(); s = (short) (s + 1)) {
                c0002bArr[s] = new C0002b(C0057f.m659c(), C0057f.m658a(), C0057f.m658a(), C0057f.m658a(), C0057f.m663a(), C0057f.m660b());
            }
            RunnableC0037e.f360a.m437a((AbstractC0012e) new C0011d(c0002bArr), true);
            return true;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("invitation ").append(e.getMessage()).toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final boolean m713A() {
        C0063c.f597a.m755c();
        try {
            String strM663a = C0057f.m663a();
            String strM663a2 = C0057f.m663a();
            if (strM663a2 != null && !strM663a2.equals("")) {
                RunnableC0037e.m427a(strM663a, strM663a2);
            }
            short sM659c = C0057f.m659c();
            if (sM659c == 0) {
                RunnableC0037e.f360a.m449b(false);
                return true;
            }
            C0063c.f597a.m750a(sM659c, false);
            return true;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("cancel: ").append(e.getMessage()).toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m714B() {
        C0056e c0056e = new C0056e();
        C0063c.f597a.m758a(false);
        RunnableC0037e.m428a(C0066a.m773a(135), C0066a.m773a(168), c0056e);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, mobak.a.b.a.m] */
    /* JADX INFO: renamed from: C */
    private static final boolean m715C() {
        ?? M231a;
        try {
            C0057f.m660b();
            int iM660b = C0057f.m660b();
            int iM660b2 = C0057f.m660b();
            M231a = C0020m.m231a();
            M231a.m232a(iM660b, iM660b2);
            return true;
        } catch (Exception e) {
            C0063c.m746a(M231a.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m716D() {
        String strM663a = C0057f.m663a();
        C0050b.f546b = C0057f.m660b();
        int iM660b = C0057f.m660b();
        int i = iM660b;
        if (iM660b == 0) {
            i = Integer.MAX_VALUE;
        }
        RunnableC0037e.f360a.m437a((AbstractC0012e) new C0018k(strM663a, i), true);
        return true;
    }

    /* JADX INFO: renamed from: E */
    private static final boolean m717E() {
        byte bM658a = C0057f.m658a();
        m686a(true);
        if (bM658a != 1) {
            return true;
        }
        C0050b.m622b();
        return true;
    }

    /* JADX INFO: renamed from: F */
    private static final boolean m718F() {
        if (RunnableC0037e.f360a.f387a == null) {
            return true;
        }
        RunnableC0037e.f360a.f387a.m593b((byte) 1);
        byte bM658a = C0057f.m658a();
        if (bM658a == 2) {
            return true;
        }
        RunnableC0037e.f360a.f387a.m594a(bM658a == 1);
        return true;
    }

    /* JADX INFO: renamed from: G */
    private static final boolean m719G() {
        switch (C0057f.m658a()) {
            case 1:
                RunnableC0037e.f360a.m449b(true);
                break;
            case 2:
                RunnableC0037e.f360a.m449b(false);
                break;
            case 3:
                m695j();
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    private static final boolean m720H() throws Exception {
        short sM659c = C0057f.m659c();
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= sM659c) {
                return true;
            }
            short sM659c2 = C0057f.m659c();
            int iM660b = C0057f.m660b();
            int i = C0057f.f570a;
            m678a(m676a(sM659c2));
            if (C0057f.f570a != i + iM660b) {
                C0063c.m746a("WARNING: bad multiple part length");
                C0057f.f570a = i + iM660b;
            }
            if (C0063c.f597a.m743a(sM659c2)) {
                C0063c.f597a.m755c();
            }
            s = (short) (s2 + 1);
        }
    }

    /* JADX INFO: renamed from: I */
    private static final boolean m721I() {
        C0005e.f76a.m136c(m684a(false));
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static final void m722a(AbstractC0012e abstractC0012e) {
        short sM659c = C0057f.m659c();
        if (sM659c > 0) {
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= sM659c) {
                    break;
                }
                ((AbstractC0041i) abstractC0012e).f456a.m282a(true, m724a());
                s = (short) (s2 + 1);
            }
        }
        short sM659c2 = C0057f.m659c();
        if (sM659c2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= sM659c2) {
                return;
            }
            ((AbstractC0041i) abstractC0012e).f456a.m282a(false, m724a());
            s3 = (short) (s4 + 1);
        }
    }

    /* JADX INFO: renamed from: J */
    private static final boolean m723J() {
        short sM659c = C0057f.m659c();
        switch (sM659c) {
            case -109:
                String strM663a = C0057f.m663a();
                String strM663a2 = C0057f.m663a();
                short sM659c2 = C0057f.m659c();
                int iM659c = C0057f.m659c();
                String[] strArr = new String[iM659c];
                int[] iArr = new int[iM659c];
                for (int i = 0; i < iM659c; i++) {
                    strArr[i] = C0057f.m663a();
                }
                for (int i2 = 0; i2 < iM659c; i2++) {
                    iArr[i2] = C0057f.m660b();
                }
                C0019l c0019l = new C0019l(strM663a, strM663a2, strArr, iArr);
                c0019l.m532a(sM659c2);
                if (sM659c2 != 0) {
                    ((AbstractC0041i) c0019l).f456a.m283a(false, (byte) 95, (short) 118);
                }
                m722a(c0019l);
                RunnableC0037e.f360a.m437a((AbstractC0012e) c0019l, true);
                break;
            case -108:
                byte bM658a = C0057f.m658a();
                if (bM658a == 1 || bM658a == 3) {
                    AbstractC0012e abstractC0012eM439a = RunnableC0037e.f360a.m439a();
                    abstractC0012eM439a.mo182a(C0057f.m663a());
                    if (bM658a == 3) {
                        ((AbstractC0041i) abstractC0012eM439a).f456a.m314a();
                        m722a(abstractC0012eM439a);
                    }
                } else {
                    String strM663a3 = C0057f.m663a();
                    String strM663a4 = C0057f.m663a();
                    short sM659c3 = C0057f.m659c();
                    C0019l c0019l2 = new C0019l(strM663a3, strM663a4, C0057f.m663a());
                    c0019l2.m532a(sM659c3);
                    m722a(c0019l2);
                    RunnableC0037e.f360a.m437a((AbstractC0012e) c0019l2, true);
                    if (sM659c3 != 0) {
                        ((AbstractC0041i) c0019l2).f456a.m283a(false, (byte) 95, (short) 118);
                    }
                }
                break;
            case -100:
                RunnableC0037e.f360a.m441a((byte) 2);
                break;
            default:
                switch (sM659c) {
                    case -13:
                        RunnableC0037e.f360a.m437a((AbstractC0012e) new C0011d(), true);
                        break;
                    case -12:
                    case -2:
                    case -1:
                        RunnableC0037e.f360a.m437a((AbstractC0012e) new C0010c(sM659c), true);
                        break;
                    case -5:
                        RunnableC0037e.f360a.m437a((AbstractC0012e) new C0016i(sM659c), true);
                        break;
                    case -4:
                    case -3:
                        RunnableC0037e.f360a.m437a((AbstractC0012e) new C0021n(sM659c), true);
                        break;
                }
                break;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static C0023p m724a() {
        C0023p c0023p = new C0023p(C0057f.m660b());
        c0023p.f246a = C0057f.m659c();
        if (((c0023p.f245a >> 24) & 32) == 32) {
            c0023p.f247b = C0057f.m659c();
        }
        if (c0023p.m264c()) {
            c0023p.m267a(C0057f.m663a());
        }
        if (c0023p.m269d()) {
            int iM658a = C0057f.m658a();
            String[] strArr = new String[iM658a];
            short[] sArr = new short[iM658a];
            int[] iArr = new int[iM658a];
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= iM658a) {
                    break;
                }
                strArr[b2] = C0057f.m663a();
                sArr[b2] = C0057f.m659c();
                iArr[b2] = C0057f.m660b();
                b = (byte) (b2 + 1);
            }
            c0023p.f249a = strArr;
            c0023p.f250a = sArr;
            c0023p.f251a = iArr;
        }
        return c0023p;
    }

    /* JADX INFO: renamed from: K */
    private static boolean m725K() {
        short sM659c = C0057f.m659c();
        String strM663a = C0057f.m663a();
        short sM659c2 = C0057f.m659c();
        int iM658a = C0057f.m658a();
        C0067b[] c0067bArr = new C0067b[iM658a];
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= iM658a) {
                new C0039g(c0067bArr, strM663a, sM659c, sM659c2);
                return true;
            }
            c0067bArr[b2] = new C0067b(C0057f.m658a(), C0057f.m658a(), C0057f.m663a());
            if (c0067bArr[b2].f624b == 2) {
                int iM658a2 = C0057f.m658a();
                String[] strArr = new String[iM658a2];
                boolean[] zArr = new boolean[iM658a2];
                byte b3 = 0;
                while (true) {
                    byte b4 = b3;
                    if (b4 >= iM658a2) {
                        break;
                    }
                    strArr[b4] = C0057f.m663a();
                    zArr[b4] = C0057f.m658a() == 1;
                    b3 = (byte) (b4 + 1);
                }
                c0067bArr[b2].f626a = strArr;
                c0067bArr[b2].f627a = zArr;
            }
            if (c0067bArr[b2].f624b == 1) {
                C0067b c0067b = c0067bArr[b2];
                int iM660b = C0057f.m660b();
                int iM660b2 = C0057f.m660b();
                c0067b.f628a = iM660b;
                c0067b.f629b = iM660b2;
            }
            if (c0067bArr[b2].f624b == 3) {
                c0067bArr[b2].f630b = C0057f.m663a();
            }
            b = (byte) (b2 + 1);
        }
    }

    /* JADX INFO: renamed from: L */
    private static boolean m726L() {
        C0057f.m658a();
        AbstractC0041i abstractC0041iM423a = RunnableC0037e.f360a.m423a();
        if (abstractC0041iM423a == null) {
            return false;
        }
        short sM659c = C0057f.m659c();
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= sM659c) {
                break;
            }
            abstractC0041iM423a.f456a.m282a(false, m724a());
            s = (short) (s2 + 1);
        }
        short sM659c2 = C0057f.m659c();
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= sM659c2) {
                return true;
            }
            abstractC0041iM423a.f456a.m282a(true, m724a());
            s3 = (short) (s4 + 1);
        }
    }

    /* JADX INFO: renamed from: M */
    private static boolean m727M() {
        C0030w c0030w = new C0030w(C0057f.m660b(), C0057f.m659c());
        c0030w.m532a(C0057f.m659c());
        c0030w.m198b(C0057f.m663a());
        String[] strArr = new String[C0030w.m332a(c0030w.mo230b())];
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= strArr.length) {
                break;
            }
            strArr[s2] = C0057f.m663a();
            s = (short) (s2 + 1);
        }
        c0030w.f287a[0] = strArr;
        String[] strArr2 = new String[C0030w.m332a(c0030w.m335c())];
        short s3 = 0;
        while (true) {
            short s4 = s3;
            if (s4 >= strArr2.length) {
                break;
            }
            strArr2[s4] = C0057f.m663a();
            s3 = (short) (s4 + 1);
        }
        c0030w.f287a[1] = strArr2;
        c0030w.m337a(0, C0057f.m658a(), C0057f.m658a());
        c0030w.m337a(1, C0057f.m658a(), C0057f.m658a());
        c0030w.f289a[0] = C0057f.m659c();
        c0030w.f289a[1] = C0057f.m659c();
        c0030w.f290a[0] = C0057f.m658a();
        c0030w.f290a[1] = C0057f.m658a();
        byte bM658a = C0057f.m658a();
        c0030w.m338a(0, (bM658a & 8) > 0, (bM658a & 4) > 0);
        c0030w.m338a(1, (bM658a & 2) > 0, (bM658a & 1) > 0);
        boolean z = C0057f.m658a() != 0;
        boolean z2 = z;
        if (z) {
            ((AbstractC0041i) c0030w).f456a.m283a(false, (byte) 101, (short) 179);
        }
        if (!c0030w.m339b()) {
            c0030w.f291b[0] = C0057f.m659c();
            AbstractC0003c[] abstractC0003cArrM685a = null;
            switch (c0030w.m336d()) {
                case 1:
                    abstractC0003cArrM685a = m679a(true);
                    break;
                case 2:
                    abstractC0003cArrM685a = m685a(false);
                    break;
            }
            c0030w.f293a[0] = abstractC0003cArrM685a;
        }
        c0030w.f291b[1] = C0057f.m659c();
        AbstractC0003c[] abstractC0003cArrM685a2 = null;
        switch (c0030w.m336d()) {
            case 1:
                abstractC0003cArrM685a2 = m679a(true);
                break;
            case 2:
                abstractC0003cArrM685a2 = m685a(z2);
                break;
        }
        c0030w.f293a[1] = abstractC0003cArrM685a2;
        if ((c0030w.f286a & 67108864) > 0) {
            RunnableC0037e.f360a.m443f();
        }
        c0030w.m177b(z2);
        RunnableC0037e.f360a.m437a((AbstractC0012e) c0030w, true);
        return true;
    }

    /* JADX INFO: renamed from: N */
    private static boolean m728N() {
        try {
            m709a(true);
            return true;
        } catch (Exception e) {
            C0063c.m745a((Exception) 1);
            return true;
        }
    }

    /* JADX INFO: renamed from: O */
    private static final boolean m729O() {
        try {
            int iM660b = C0057f.m660b();
            int iM660b2 = C0057f.m660b();
            C0006f c0006fM684a = m684a(false);
            C0005e.f76a.m134a(iM660b, iM660b2);
            C0005e.f76a.m130a(c0006fM684a);
            RunnableC0037e.f360a.m423a().mo223c();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: P */
    private static final boolean m730P() {
        try {
            int iM660b = C0057f.m660b();
            C0006f c0006fM684a = m684a(false);
            C0005e.f76a.m133h(iM660b);
            C0005e.f76a.m135b(c0006fM684a);
            RunnableC0037e.f360a.m423a().mo223c();
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: Q */
    private static final boolean m731Q() {
        m733a(C0066a.f622c);
        return true;
    }

    /* JADX INFO: renamed from: R */
    private static final boolean m732R() {
        m733a(C0066a.f620a);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static final void m733a(C0072g c0072g) {
        try {
            short sM659c = C0057f.m659c();
            for (int i = 0; i < sM659c; i++) {
                c0072g.m802a(C0057f.m660b(), C0057f.m663a());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: S */
    private static final boolean m734S() {
        C0005e.f76a.m110b(C0057f.m660b());
        return true;
    }

    /* JADX INFO: renamed from: T */
    private static final boolean m735T() {
        RunnableC0037e.f360a.m423a();
        AbstractC0041i.m558l();
        return true;
    }

    /* JADX INFO: renamed from: U */
    private static final boolean m736U() {
        RunnableC0037e.f360a.m423a().m561m();
        return true;
    }

    /* JADX INFO: renamed from: V */
    private static final boolean m737V() {
        C0023p c0023p = new C0023p((byte) 30);
        c0023p.f246a = f576a[86];
        c0023p.m268a((short) 261);
        c0023p.f249a = new String[]{C0066a.m774a(262, new String[]{String.valueOf(C0050b.f546b)})};
        c0023p.f250a = new short[]{3};
        c0023p.f251a = new int[]{2};
        c0023p.m267a(C0066a.m773a(263));
        c0023p.f247b = f576a[86];
        RunnableC0037e.f360a.m423a().mo170a(c0023p);
        return true;
    }

    /* JADX INFO: renamed from: W */
    private static final boolean m738W() {
        RunnableC0037e.f360a.m423a();
        AbstractC0041i.m545b(C0057f.m659c());
        return true;
    }

    /* JADX INFO: renamed from: X */
    private static final boolean m739X() {
        Main2.m5a(C0057f.m663a());
        return true;
    }
}
