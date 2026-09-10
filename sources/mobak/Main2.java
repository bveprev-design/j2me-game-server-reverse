package mobak;

import java.io.UnsupportedEncodingException;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.StringItem;
import javax.microedition.midlet.MIDlet;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0039g;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p000a.p002b.p003a.C0025r;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;
import mobak.p006c.C0069d;
import mobak.p006c.C0071f;
import mobak.p006c.InterfaceC0070e;

/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/Main2.class */
public class Main2 extends MIDlet implements InterfaceC0070e {

    /* JADX INFO: renamed from: a */
    public static Main2 f0a;

    /* JADX INFO: renamed from: a */
    public static boolean f1a;

    /* JADX INFO: renamed from: a */
    private byte f2a;

    /* JADX INFO: renamed from: b */
    public boolean f3b;

    /* JADX INFO: renamed from: a */
    public String f4a;

    /* JADX INFO: renamed from: a */
    private C0065c f5a;

    /* JADX INFO: renamed from: a */
    public C0071f f6a;

    /* JADX INFO: renamed from: a */
    public RunnableC0076f f7a;

    /* JADX INFO: renamed from: a */
    private C0039g f9a;

    /* JADX INFO: renamed from: b */
    public String f10b;

    /* JADX INFO: renamed from: a */
    public int f11a;

    /* JADX INFO: renamed from: c */
    public boolean f8c = true;

    /* JADX INFO: renamed from: b */
    public int f12b = -1;

    public Main2() {
        try {
            f0a = this;
            m3c();
            C0066a.m773a(1);
            C0050b.m635c();
            C0063c.f597a = new C0063c();
            try {
                RunnableC0037e runnableC0037e = new RunnableC0037e();
                RunnableC0037e.f360a = runnableC0037e;
                runnableC0037e.m417a();
                RunnableC0037e.f360a.m441a((byte) 1);
                RunnableC0037e.f360a.m418b();
                new C0063c();
                AbstractC0041i.m540h();
            } catch (Exception e) {
                C0063c.m746a(new StringBuffer().append("Main2").append(e.toString()).toString());
            }
        } catch (Error unused) {
            try {
                destroyApp(false);
            } catch (Exception e2) {
                C0063c.m746a(new StringBuffer().append("exit des ").append(e2.toString()).toString());
            }
            notifyDestroyed();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m0a(byte b) {
        this.f7a = new RunnableC0076f(this, b);
        new Thread(this.f7a).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v15, types: [mobak.a.b.g] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: b */
    public final void m1b(byte b) {
        this.f2a = b;
        ?? r0 = b;
        switch (r0) {
            case 1:
            case 2:
                if (RunnableC0037e.f360a != null) {
                    RunnableC0037e.f360a.m472l();
                    this.f9a = null;
                }
                break;
            case 3:
                try {
                    this.f9a = new C0039g(C0066a.m777b(9), this);
                    String strM8a = m8a(C0005e.f76a.f85b);
                    if (strM8a != null) {
                        this.f9a.m514a(C0066a.m773a(11), strM8a, 100, 0);
                    } else {
                        this.f9a.m514a(C0066a.m773a(11), "+", 100, 0);
                    }
                    this.f9a.m514a(C0066a.m773a(10), this.f4a, 8, 2);
                    m14a(this.f9a);
                    r0 = this.f9a;
                    r0.m519a();
                } catch (Exception e) {
                    C0063c.m744a(r0.getMessage(), true);
                    return;
                }
                break;
            case 4:
                this.f9a = new C0039g(C0066a.m777b(9), this);
                this.f9a.m514a(C0066a.m773a(16), this.f10b, 40, 0);
                this.f9a.m514a(C0066a.m773a(17), String.valueOf(this.f11a), 10, 5);
                this.f9a.m514a(C0066a.m773a(14), String.valueOf(C0063c.f594b), 10, 5);
                this.f9a.m514a(C0066a.m773a(13), String.valueOf(C0063c.f593a), 10, 5);
                this.f9a.m514a(C0066a.m773a(12), String.valueOf((int) C0063c.m761a()), 10, 5);
                this.f9a.m516a(C0066a.m777b(118), 2, new String[]{C0066a.m777b(249)}, new boolean[]{this.f8c});
                m14a(this.f9a);
                this.f9a.m519a();
                break;
            case 6:
                if (this.f12b != -1) {
                    this.f9a = new C0039g(C0066a.m777b(9), this);
                    this.f9a.m514a(C0066a.m773a(79), "", 100, 0);
                    m14a(this.f9a);
                    this.f9a.m519a();
                }
                break;
            case 7:
                this.f9a = new C0039g(C0066a.m777b(9), this);
                this.f9a.m514a(C0066a.m773a(279), this.f5a != null ? this.f5a.f615a : "", 32, 0);
                this.f9a.m514a(C0066a.m773a(289), this.f5a != null ? this.f5a.f616b : "", 32, 0);
                this.f9a.m514a(C0066a.m773a(291), this.f5a != null ? this.f5a.f617c : "", 16, 0);
                this.f9a.m514a(C0066a.m773a(280), this.f5a != null ? this.f5a.f618d : "", 32, 0);
                boolean[] zArr = new boolean[5];
                zArr[0] = false;
                zArr[1] = false;
                zArr[2] = false;
                zArr[3] = false;
                zArr[4] = false;
                if (this.f5a != null) {
                    zArr[this.f5a.f619a - 1] = true;
                } else {
                    zArr[0] = true;
                }
                this.f9a.m516a(C0066a.m777b(281), 4, new String[]{C0066a.m777b(19), C0066a.m777b(20), C0066a.m777b(21), C0066a.m777b(22), C0066a.m777b(23)}, zArr);
                this.f9a.m523a("", "");
                this.f9a.m520a(C0066a.m777b(287));
                this.f9a.m520a(C0066a.m777b(34));
                mo13c(0);
                this.f9a.m519a();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2b() {
        switch (this.f2a) {
            case 2:
            case 7:
                break;
            case 3:
            case 4:
                m1b((byte) 2);
                return;
            case 5:
            default:
                return;
            case 6:
                this.f12b = -1;
                break;
        }
        m1b((byte) 1);
    }

    /* JADX INFO: renamed from: c */
    private void m3c() {
        if (this.f6a == null) {
            this.f6a = new C0071f();
        }
        this.f11a = this.f6a.m791a((byte) 15, 20010);
        this.f10b = this.f6a.m794a((byte) 16, "lordmancer.ru");
        this.f8c = this.f6a.m793a((byte) 18, (byte) 1) > 0;
        C0063c.f594b = this.f6a.m791a((byte) 6, 3);
        C0063c.f593a = this.f6a.m791a((byte) 5, 30);
        C0063c.m762a(this.f6a.m792a((byte) 7, (short) 512));
        this.f6a.m791a((byte) 10, 60000);
        C0025r.m320c();
        RunnableC0037e.f398a = this.f6a.m791a((byte) 19, 49);
        String[] strArr = {"utf-8", "utf-16", "ISO8859_5", "ISO8859-5", "ISO-8859-5", "ISO_8859-5", "ISO_8859-5:1988", "ISO-IR-144", "8859_5", "Cyrillic", "CSISOLatinCyrillic", "IBM915", "IBM-915", "Cp915", "915", "Cp1251", "Windows-1251", "win1251", "Cp866", "IBM866", "IBM-866", "866", "CP866", "CSIBM866", "KOI8_R", "KOI8-R", "KOI8", "CSKOI8R", System.getProperty("microedition.encoding")};
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= strArr.length) {
                break;
            }
            try {
                if (!new String("\u0430\u0431\u0432\u0433\u0434\u0435".getBytes(strArr[b2]), strArr[b2]).equals("??????")) {
                    C0063c.f596a = strArr[b2];
                    break;
                }
                throw new UnsupportedEncodingException("");
            } catch (UnsupportedEncodingException unused) {
                b = (byte) (b2 + 1);
            }
        }
        if (C0005e.f76a == null) {
            C0005e.f76a = new C0005e(true);
        }
        C0005e.f76a.f84a = this.f6a.m791a((byte) 1, -1);
        long jM790a = this.f6a.m790a((byte) 13, -1L);
        C0005e.f76a.f85b = this.f6a.m794a((byte) 17, "");
        if (C0005e.f76a.f85b.equals("")) {
            C0005e.f76a.f85b = getAppProperty("login");
            this.f6a.m788a((byte) 17, C0005e.f76a.f85b);
        }
        if ((C0005e.f76a.f85b == null || C0005e.f76a.f85b.equals("")) && jM790a > 0) {
            C0005e.f76a.f85b = String.valueOf(jM790a);
        }
        C0005e.f76a.f85b = m8a(C0005e.f76a.f85b);
        this.f4a = this.f6a.m794a((byte) 2, "");
        if (this.f4a == null || this.f4a.equals("")) {
            this.f4a = getAppProperty("password");
            this.f6a.m788a((byte) 2, this.f4a);
        }
        try {
            if (AbstractC0041i.f441a == null) {
                AbstractC0041i.f441a = new C0069d("White", (byte) 8);
            }
            if (AbstractC0041i.f442b == null) {
                AbstractC0041i.f442b = new C0069d("White", (byte) 10);
            }
            if (AbstractC0041i.f443c == null) {
                AbstractC0041i.f443c = new C0069d("Gray", (byte) 10);
            }
            if (AbstractC0041i.f444d == null) {
                AbstractC0041i.f444d = new C0069d("Gray", (byte) 11);
            }
            if (AbstractC0041i.f445e == null) {
                AbstractC0041i.f445e = new C0069d("Yellow", (byte) 10);
            }
            if (AbstractC0041i.f446f == null) {
                AbstractC0041i.f446f = new C0069d("White", (byte) 13);
            }
            if (AbstractC0041i.f447g == null) {
                AbstractC0041i.f447g = new C0069d("Black", (byte) 10);
            }
            if (AbstractC0041i.f448h == null) {
                AbstractC0041i.f448h = new C0069d("Green", (byte) 10);
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("loadProp").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4a(boolean z) {
        RunnableC0037e.f360a.m449b(false);
        if (RunnableC0037e.f360a != null) {
            RunnableC0037e.f360a.m451h();
        }
        if (C0063c.f597a != null) {
            C0063c.f597a.m758a(true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (C0063c.f597a != null && C0063c.f597a.m760c() && System.currentTimeMillis() - jCurrentTimeMillis < 10000) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
            if (C0063c.f597a != null && C0063c.f597a.m760c()) {
                C0063c.f597a.m759e();
            }
        }
        try {
            if (this.f6a != null) {
                C0071f c0071f = this.f6a;
                if (c0071f.f635a != null) {
                    c0071f.f635a.closeRecordStore();
                }
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("exit () ").append(e.toString()).toString());
        }
        try {
            destroyApp(false);
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append("exit () ").append(e2.toString()).toString());
        }
        notifyDestroyed();
        f1a = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m5a(String str) {
        try {
            f0a.platformRequest(str);
        } catch (ConnectionNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m6a() {
        return new StringBuffer().append("http://").append(C0066a.m777b(4)).toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m7b() {
        String string;
        StringBuffer stringBufferAppend = new StringBuffer().append(m6a()).append("?p=27").append("").append("").append("&");
        String strM8a = m8a(C0005e.f76a.f85b);
        if (this.f4a == null || this.f4a.equals("") || strM8a == null) {
            string = "";
        } else {
            string = new StringBuffer().append("log=").append(strM8a.startsWith("+") ? strM8a.substring(1) : strM8a).append("&pas=").append(this.f4a).toString();
        }
        return stringBufferAppend.append(string).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v25, types: [long] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: a */
    public static String m8a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        str.trim();
        if (str.indexOf(64) > 0 && str.lastIndexOf(46) > str.indexOf(64) && str.length() > 6) {
            return str;
        }
        boolean zStartsWith = str.startsWith("8");
        ?? string = str;
        if (zStartsWith) {
            string = new StringBuffer().append("7").append(str.substring(1)).toString();
        }
        boolean zStartsWith2 = (string == true ? 1 : 0).startsWith("+");
        ?? r0 = zStartsWith2;
        ?? r4 = string;
        if (!zStartsWith2) {
            String string2 = new StringBuffer().append("+").append(string == true ? 1 : 0).toString();
            r4 = string2;
            r0 = string2;
        }
        try {
            String strSubstring = r4.substring(1);
            if (strSubstring.length() < 11 || strSubstring.length() > 13) {
                return null;
            }
            r0 = Long.parseLong(r4.substring(1));
            return r4;
        } catch (Exception e) {
            C0063c.m745a((Exception) r0);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m9a(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char lowerCase = Character.toLowerCase(str.charAt(i));
            if (lowerCase >= '\u0430' && lowerCase <= '\u044f') {
                return false;
            }
        }
        return true;
    }

    @Override // mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: b */
    public final void mo10b(int i) {
        if (i == 1) {
            m2b();
        }
        switch (this.f2a) {
            case 3:
                if (this.f2a == 3) {
                    String strM8a = m8a(this.f9a.m515a(0));
                    if (strM8a != null) {
                        C0005e.f76a.f85b = strM8a;
                        this.f6a.m788a((byte) 17, C0005e.f76a.f85b);
                        this.f4a = this.f9a.m515a(1);
                        this.f6a.m788a((byte) 2, this.f4a);
                        m2b();
                    } else {
                        this.f9a.m524a(C0066a.m773a(29), C0066a.m773a(30), 4);
                    }
                }
                break;
            case 4:
                if (this.f2a == 4) {
                    this.f10b = this.f9a.m515a(0);
                    this.f11a = Integer.parseInt(this.f9a.m515a(1));
                    this.f6a.m786a((byte) 15, this.f11a);
                    this.f6a.m788a((byte) 16, this.f10b);
                    int i2 = Integer.parseInt(this.f9a.m515a(2));
                    int i3 = i2;
                    if (i2 < 1) {
                        i3 = 1;
                    }
                    if (i3 > 7) {
                        i3 = 7;
                    }
                    C0063c.f594b = i3;
                    int i4 = Integer.parseInt(this.f9a.m515a(3));
                    int i5 = i4;
                    if (i4 < 10) {
                        i5 = 10;
                    }
                    if (i5 > 100) {
                        i5 = 100;
                    }
                    C0063c.f593a = i5;
                    this.f6a.m786a((byte) 6, C0063c.f594b);
                    this.f6a.m786a((byte) 5, C0063c.f593a);
                    int i6 = Integer.parseInt(this.f9a.m515a(4));
                    int i7 = i6;
                    if (i6 < 128) {
                        i7 = 128;
                    }
                    if (i7 > 2048) {
                        i7 = 2048;
                    }
                    C0063c.m762a((short) i7);
                    C0071f c0071f = this.f6a;
                    short sM761a = C0063c.m761a();
                    c0071f.m789a((byte) 7, new byte[]{(byte) (sM761a >> 8), (byte) sM761a});
                    this.f8c = ((ChoiceGroup) this.f9a.f434b.elementAt(0)).isSelected(0);
                    if (this.f8c) {
                        this.f6a.m787a((byte) 18, (byte) 1);
                    } else {
                        this.f6a.m787a((byte) 18, (byte) 0);
                    }
                    m2b();
                }
                break;
            case 6:
                String strM515a = this.f9a.m515a(0);
                if (!strM515a.equals("")) {
                    C0058g c0058g = new C0058g(C0059h.f576a[31], (short) 50, (short) 0);
                    try {
                        c0058g.m670a(this.f12b);
                        c0058g.m674a(strM515a);
                        C0063c.f597a.m749a(c0058g);
                    } catch (Exception e) {
                        C0063c.m746a(new StringBuffer().append("onButtonClick SEND_MESSAGE: ").append(e.toString()).toString());
                    }
                    m2b();
                    break;
                }
                break;
            case 7:
                try {
                    String strM515a2 = this.f9a.m515a(0);
                    String strM515a3 = this.f9a.m515a(1);
                    String strM515a4 = this.f9a.m515a(2);
                    String strM515a5 = this.f9a.m515a(3);
                    if (strM515a2 == null || strM515a2.trim().equals("") || strM515a4 == null || strM515a4.trim().equals("") || strM515a5 == null || strM515a5.trim().equals("")) {
                        this.f9a.m524a(C0066a.m773a(29), C0066a.m773a(290), 4);
                    } else {
                        String strM8a2 = m8a(strM515a3);
                        if (strM8a2 == null) {
                            this.f9a.m524a(C0066a.m773a(29), C0066a.m773a(30), 4);
                        } else if (!m9a(strM515a4)) {
                            this.f9a.m524a(C0066a.m773a(29), C0066a.m773a(293), 4);
                        } else if (!((!strM8a2.startsWith("+") || strM8a2.startsWith("+79") || strM8a2.startsWith("+375")) ? false : true)) {
                            this.f5a = new C0065c(strM515a2, strM8a2, strM515a4, strM515a5, (byte) (this.f9a.m517a(0) + 1));
                            C0065c c0065c = this.f5a;
                            if (C0063c.f597a == null) {
                                new C0063c();
                            }
                            C0063c.f597a.m747a(String.valueOf(this.f11a), this.f10b);
                            if (this.f7a == null || !this.f7a.f640a) {
                                this.f7a = new RunnableC0076f(this, c0065c);
                                new Thread(this.f7a).start();
                            }
                            m2b();
                        } else {
                            this.f9a.m524a(C0066a.m773a(29), C0066a.m773a(292), 4);
                        }
                    }
                } catch (Exception e2) {
                    C0063c.m746a(new StringBuffer().append("onButtonClick REGISTRATION_SCREEN: ").append(e2.toString()).toString());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11a() {
        RunnableC0037e.m431a(C0066a.m777b(135), C0066a.m777b(229), C0066a.m777b(276), new C0074d());
    }

    @Override // mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: e */
    public final void mo12e() {
    }

    @Override // mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: c */
    public final void mo13c(int i) {
        if (this.f9a == null || this.f2a != 7) {
            return;
        }
        short[] sArr = {282, 283, 284, 285, 286};
        int iM517a = this.f9a.m517a(0);
        if (iM517a > -1) {
            try {
                ((StringItem) this.f9a.f436c.elementAt(0)).setText(C0066a.m777b(sArr[iM517a]));
            } catch (ArrayIndexOutOfBoundsException e) {
                C0063c.m746a(new StringBuffer().append("There's no label with index ").append(String.valueOf(0)).append(", ").append(e.toString()).toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static final void m14a(C0039g c0039g) {
        c0039g.m520a(C0066a.m777b(8));
        c0039g.m520a(C0066a.m777b(34));
    }

    protected void destroyApp(boolean z) {
    }

    protected void pauseApp() {
    }

    protected void startApp() {
    }

    /* JADX INFO: renamed from: a */
    public final String m15a(String str, String str2) {
        try {
            String appProperty = getAppProperty(str);
            return (appProperty == null || appProperty.length() == 0) ? str2 : appProperty;
        } catch (Exception unused) {
            return str2;
        }
    }
}
