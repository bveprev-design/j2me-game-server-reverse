package mobak.p006c;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import mobak.Main2;
import mobak.p000a.p001a.C0005e;
import mobak.p004b.C0063c;

/* JADX INFO: renamed from: mobak.c.a */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/c/a.class */
public final class C0066a {

    /* JADX INFO: renamed from: a */
    public static C0072g f620a;

    /* JADX INFO: renamed from: b */
    public static C0072g f621b = new C0072g();

    /* JADX INFO: renamed from: c */
    public static C0072g f622c = new C0072g();

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x009a: INVOKE (r0 I:java.lang.Throwable) VIRTUAL call: java.lang.Throwable.printStackTrace():void A[MD:():void (c)], block:B:19:0x0099 */
    /* JADX INFO: renamed from: a */
    private static void m772a(int i, String str) {
        Throwable thPrintStackTrace;
        try {
            if (str.indexOf("<?") < 0) {
                f620a.m802a(i, str);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (str.indexOf("<?") >= 0) {
                stringBuffer.append(str.substring(0, str.indexOf("<?")));
                String strSubstring = str.substring(str.indexOf("<?") + 2);
                String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("?>"));
                if (strSubstring2.equals("n")) {
                    stringBuffer.append("\n");
                } else {
                    stringBuffer.append(m777b(Integer.parseInt(strSubstring2)));
                }
                str = strSubstring.substring(strSubstring.indexOf("?>") + 2);
            }
            if (str.length() > 0) {
                stringBuffer.append(str);
            }
            f620a.m802a(i, stringBuffer.toString());
        } catch (Exception e) {
            thPrintStackTrace.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m773a(int i) {
        return m774a(i, (String[]) null);
    }

    /* JADX INFO: renamed from: a */
    public static String m774a(int i, String[] strArr) {
        return m775a(m777b(i), strArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m775a(String str, String[] strArr) {
        try {
            if (str.indexOf("<%") < 0) {
                return str;
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (str.indexOf("<%") >= 0) {
                stringBuffer.append(str.substring(0, str.indexOf("<%")));
                String strSubstring = str.substring(str.indexOf("<%") + 2);
                String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("%>"));
                if (strSubstring2.equals("login")) {
                    stringBuffer.append(C0005e.f76a.f85b);
                } else if (strSubstring2.equals("heroid")) {
                    stringBuffer.append(C0005e.f76a.f84a);
                } else if (strSubstring2.equals("n")) {
                    stringBuffer.append("\n");
                } else {
                    stringBuffer.append(strArr[Integer.parseInt(strSubstring2)]);
                }
                str = strSubstring.substring(strSubstring.indexOf("%>") + 2);
            }
            if (str.length() > 0) {
                stringBuffer.append(str);
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "cannot getMessage";
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m776a(String str) {
        int i = 0;
        if (str.startsWith("?")) {
            i = 1;
        }
        try {
            return Integer.parseInt(str.substring(i, str.indexOf(" ")));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m777b(int i) {
        try {
            if (f620a == null) {
                InputStream resourceAsStream = Main2.f0a.getClass().getResourceAsStream("/mobak/help/Language.txt");
                Vector vector = new Vector();
                byte[] bArr = new byte[resourceAsStream.available()];
                resourceAsStream.read(bArr);
                resourceAsStream.close();
                String str = new String(bArr, "UTF-8");
                int length = 0;
                boolean z = true;
                while (length < str.length()) {
                    int iIndexOf = str.indexOf("\r\n", length);
                    int length2 = iIndexOf;
                    if (iIndexOf == -1) {
                        length2 = str.length();
                    }
                    String strSubstring = str.substring(length, length2);
                    if (z) {
                        z = false;
                    } else {
                        vector.addElement(strSubstring);
                    }
                    m776a(strSubstring);
                    length = length2 + "\r\n".length();
                }
                f620a = new C0072g();
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    String str2 = (String) vector.elementAt(i2);
                    int iM776a = m776a(str2);
                    int iIndexOf2 = str2.indexOf(" ");
                    m772a(iM776a, iIndexOf2 < 0 ? str2 : str2.substring(iIndexOf2 + 1));
                }
            }
            String strM803a = f620a.m803a(i);
            if (strM803a != null) {
                return strM803a;
            }
            String appProperty = Main2.f0a.getAppProperty(new StringBuffer().append(i).append("").toString());
            return appProperty == null ? "" : appProperty;
        } catch (IOException e) {
            C0063c.m746a(new StringBuffer().append("load Language String: ").append(e).toString());
            return "line not found";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m778a(byte b) {
        switch (b) {
            case 1:
                return m774a(19, (String[]) null);
            case 2:
                return m774a(20, (String[]) null);
            case 3:
                return m774a(21, (String[]) null);
            case 4:
                return m774a(22, (String[]) null);
            case 5:
                return m774a(23, (String[]) null);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m779c(int i) {
        switch (i) {
            case 1:
                return m774a(24, (String[]) null);
            case 2:
                return m774a(25, (String[]) null);
            case 3:
                return m774a(26, (String[]) null);
            case 4:
                return m774a(27, (String[]) null);
            case 5:
                return m774a(28, (String[]) null);
            default:
                return "";
        }
    }
}
