package mobak.p000a.p002b;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import mobak.C0050b;
import mobak.Main2;
import mobak.RunnableC0000a;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p002b.p003a.AbstractC0012e;
import mobak.p000a.p002b.p003a.C0016i;
import mobak.p000a.p002b.p003a.C0020m;
import mobak.p000a.p002b.p003a.C0023p;
import mobak.p000a.p002b.p003a.C0025r;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;
import mobak.p006c.C0069d;
import mobak.p006c.C0071f;
import mobak.p006c.InterfaceC0070e;

/* JADX INFO: renamed from: mobak.a.b.i */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/i.class */
public abstract class AbstractC0041i implements InterfaceC0070e {

    /* JADX INFO: renamed from: a */
    public C0039g f451a;

    /* JADX INFO: renamed from: a */
    private C0023p f455a;

    /* JADX INFO: renamed from: k */
    public short f463k;

    /* JADX INFO: renamed from: a */
    public C0035c f464a;

    /* JADX INFO: renamed from: a */
    private String f465a;

    /* JADX INFO: renamed from: g */
    private boolean f466g;

    /* JADX INFO: renamed from: a */
    private static boolean f440a = false;

    /* JADX INFO: renamed from: a */
    public static C0069d f441a = null;

    /* JADX INFO: renamed from: b */
    public static C0069d f442b = null;

    /* JADX INFO: renamed from: c */
    public static C0069d f443c = null;

    /* JADX INFO: renamed from: d */
    public static C0069d f444d = null;

    /* JADX INFO: renamed from: e */
    public static C0069d f445e = null;

    /* JADX INFO: renamed from: f */
    public static C0069d f446f = null;

    /* JADX INFO: renamed from: g */
    public static C0069d f447g = null;

    /* JADX INFO: renamed from: h */
    public static C0069d f448h = null;

    /* JADX INFO: renamed from: c */
    public static String f449c = null;

    /* JADX INFO: renamed from: a */
    private static short f460a = -1;

    /* JADX INFO: renamed from: b */
    private boolean f450b = false;

    /* JADX INFO: renamed from: c */
    private boolean f452c = false;

    /* JADX INFO: renamed from: d */
    private boolean f453d = false;

    /* JADX INFO: renamed from: e */
    private boolean f454e = false;

    /* JADX INFO: renamed from: a */
    public C0025r f456a = null;

    /* JADX INFO: renamed from: d */
    public byte f457d = 0;

    /* JADX INFO: renamed from: a */
    private byte f458a = -1;

    /* JADX INFO: renamed from: b */
    private byte f459b = -1;

    /* JADX INFO: renamed from: b */
    private short f461b = -1;

    /* JADX INFO: renamed from: f */
    private boolean f462f = true;

    /* JADX INFO: renamed from: e */
    public byte f467e = 0;

    /* JADX INFO: renamed from: a */
    protected abstract void mo169a(Graphics graphics);

    /* JADX INFO: renamed from: b */
    public final void m526b(Graphics graphics) {
        mo169a(graphics);
        if (this.f455a == null) {
            return;
        }
        if (this.f453d) {
            this.f453d = false;
            this.f451a = new C0039g(C0066a.m777b(9), this);
            String[] strArr = this.f455a.f249a;
            short[] sArr = this.f455a.f250a;
            int[] iArr = this.f455a.f251a;
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= strArr.length) {
                    this.f451a.m520a("OK");
                    this.f451a.m520a(C0066a.m777b(34));
                    this.f451a.m519a();
                    return;
                } else {
                    if (sArr[s2] < 0) {
                        this.f451a.m514a(strArr[s2], "", 100, iArr[s2]);
                    } else {
                        this.f451a.m514a(strArr[s2], "", sArr[s2], iArr[s2]);
                    }
                    s = (short) (s2 + 1);
                }
            }
        } else {
            if (!this.f452c || this.f454e) {
                return;
            }
            this.f454e = true;
            C0048p c0048p = new C0048p(this);
            if (!this.f455a.m269d()) {
                RunnableC0037e.m431a("", this.f455a.f248a, "", c0048p);
                return;
            }
            String[] strArr2 = new String[this.f451a.f433a.size()];
            short s3 = 0;
            while (true) {
                short s4 = s3;
                if (s4 >= this.f451a.f433a.size()) {
                    RunnableC0037e.m431a("", C0066a.m775a(this.f455a.f248a, strArr2), "", c0048p);
                    return;
                } else {
                    strArr2[s4] = this.f451a.m515a((int) s4);
                    s3 = (short) (s4 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo248d(int i) {
        C0023p c0023p = null;
        if (this.f456a != null) {
            if (mo206a() && RunnableC0037e.f360a.m475a(i) && !this.f456a.m298b()) {
                mo207a_();
                return;
            }
            mo168a();
            C0023p c0023pM296a = this.f456a.m296a(C0025r.m316b(i), C0025r.m315a(i), RunnableC0037e.f360a.m475a(i));
            c0023p = c0023pM296a;
            if (c0023pM296a == null && this.f456a.m297a()) {
                this.f456a.m294a(RunnableC0037e.f360a.getGameAction(i));
                return;
            }
        }
        if (c0023p == null || !m531b(c0023p)) {
            mo202a(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m527d(byte b) {
        this.f467e = b;
        if (this.f456a != null) {
            this.f456a.m273a(this.f467e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m528a(AbstractC0041i abstractC0041i) {
        this.f467e = abstractC0041i.f467e;
        if (this.f456a != null) {
            this.f456a.m273a(this.f467e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte m529a() {
        return this.f467e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m530c() {
        C0023p c0023pM296a;
        if (this.f456a == null || (c0023pM296a = this.f456a.m296a(false, true, false)) == null) {
            return false;
        }
        try {
            return m531b(c0023pM296a);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("(Screen descendant).pushLeftPopupMenuButton () error: ").append(e.toString()).toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m531b(C0023p c0023p) {
        boolean zMo170a = mo170a(c0023p);
        if (c0023p != null && ((byte) c0023p.f245a) != 30 && c0023p.f246a != 0) {
            C0063c.f597a.m749a(new C0058g(c0023p.f246a));
        }
        return zMo170a;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo170a(C0023p c0023p) {
        if (c0023p == null) {
            return false;
        }
        switch ((byte) c0023p.f245a) {
            case 30:
                if (c0023p == null) {
                    return true;
                }
                m553d();
                this.f455a = c0023p;
                boolean z = false;
                if (this.f455a.f248a != null) {
                    this.f452c = true;
                    z = true;
                }
                if (this.f455a.f249a != null) {
                    this.f453d = true;
                    z = true;
                }
                if (z) {
                    return true;
                }
                m555n();
                return true;
            case 64:
                RunnableC0037e.m431a(C0066a.m773a(135), C0066a.m773a(185), "", new C0047o(this));
                return true;
            case 71:
                m561m();
                return true;
            case 85:
                RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m187a(), true);
                return true;
            case 87:
                RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m186a((short) -2), true);
                return true;
            case 88:
                RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m186a((short) -3), true);
                return true;
            case 95:
                m545b(this.f463k);
                return true;
            case 97:
                C0020m.m231a();
                return true;
            case 101:
                m558l();
                return true;
            case 102:
                C0005e.m137a();
                return true;
            case 103:
                Main2 main2 = Main2.f0a;
                Main2.m5a(new StringBuffer().append(Main2.m6a()).append("?p=28").append("").append("").toString());
                return true;
            case 104:
                Main2 main3 = Main2.f0a;
                Main2.m5a(new StringBuffer().append(Main2.m6a()).append("?ma=auction-type-lot&p=27").append("").append("").toString());
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo202a(int i) {
    }

    public AbstractC0041i() {
        f440a = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m532a(short s) {
        this.f463k = s;
    }

    /* JADX INFO: renamed from: a */
    private void m533a(String str) {
        try {
            this.f461b = C0050b.m633a(str);
            this.f458a = (byte) (RunnableC0037e.m476a(C0050b.m638a(this.f461b)) / 17);
            this.f459b = (byte) 0;
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("loadAnimCursor").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m534e(byte b) {
        if (b != this.f457d) {
            this.f457d = b;
            try {
                if (f460a == -1) {
                    f460a = C0050b.m633a("cursors.png");
                }
                if (this.f457d <= 0) {
                    if (this.f457d >= 0) {
                        this.f459b = (byte) -1;
                        this.f458a = (byte) -1;
                        return;
                    }
                    switch (this.f457d) {
                        case -4:
                            m533a("hand.png");
                            break;
                        case -3:
                            m533a("herou-cursor.png");
                            return;
                        case -2:
                            m533a("entry.png");
                            return;
                        case -1:
                            m533a("clock.png");
                            return;
                    }
                    return;
                }
                byte b2 = -1;
                switch (this.f457d) {
                    case 1:
                        b2 = 0;
                        break;
                    case 2:
                        b2 = 1;
                        break;
                    case 3:
                        b2 = 3;
                        break;
                    case 4:
                        b2 = 4;
                        break;
                    case 5:
                        b2 = 5;
                        break;
                    case 6:
                        b2 = 7;
                        break;
                    case 7:
                        b2 = 10;
                        break;
                    case 9:
                        b2 = 11;
                        break;
                    case 10:
                        b2 = 12;
                        break;
                }
                if (b2 >= 0) {
                    this.f459b = b2;
                    this.f458a = (byte) -1;
                }
            } catch (Exception e) {
                C0063c.m746a(new StringBuffer().append("loadCursor ").append(e.toString()).toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected final void m535a(Graphics graphics, short s, short s2) {
        m536a(graphics, s, s2, 0);
    }

    /* JADX INFO: renamed from: a */
    protected final void m536a(Graphics graphics, short s, short s2, int i) {
        try {
            if (this.f457d != 0 && s >= 0 && s2 >= 0 && s <= RunnableC0037e.f360a.getWidth() && s2 <= RunnableC0037e.f360a.getHeight()) {
                if (this.f457d > 0) {
                    RunnableC0037e.m468a(graphics, C0050b.m638a(f460a), 17 * this.f459b, 0, 17, 17, 0, s, s2, 0);
                    return;
                }
                RunnableC0037e.m468a(graphics, C0050b.m638a(this.f461b), 17 * this.f459b, 0, 17, 17, 0, s, s2, 0);
                this.f459b = (byte) (this.f459b + 1);
                if (this.f459b >= this.f458a) {
                    this.f459b = (byte) 0;
                }
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("drawCursor ").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m537a(Graphics graphics, byte b, short s, short s2, int i) {
        if (f460a == -1) {
            f460a = C0050b.m633a("cursors.png");
        }
        RunnableC0037e.m468a(graphics, C0050b.m638a(f460a), b * 17, 0, 17, 17, 0, s, s2, 0);
    }

    /* JADX INFO: renamed from: f */
    public static void m538f() {
        f440a = true;
    }

    /* JADX INFO: renamed from: g */
    public static void m539g() {
        f440a = false;
    }

    /* JADX INFO: renamed from: h */
    public static void m540h() {
        f440a = false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m541d() {
        return f440a;
    }

    /* JADX INFO: renamed from: c */
    public void mo223c() {
        boolean z;
        short[] sArr;
        C0016i c0016iM226a;
        try {
            Main2 main2 = Main2.f0a;
            short s = this.f463k;
            if (main2.f8c) {
                short[] sArrM796a = main2.f6a.m796a((byte) 14);
                short[] sArr2 = sArrM796a == null ? null : sArrM796a;
                boolean z2 = true;
                if (sArr2 != null) {
                    for (short s2 = 0; s2 < sArr2.length; s2 = (short) (s2 + 1)) {
                        if (sArr2[s2] == s) {
                            z2 = false;
                            break;
                        }
                    }
                }
                if (z2) {
                    if (sArr2 == null) {
                        sArr = new short[1];
                    } else {
                        short[] sArr3 = new short[sArr2.length + 1];
                        System.arraycopy(sArr2, 0, sArr3, 0, sArr2.length);
                        sArr = sArr3;
                    }
                    sArr[sArr.length - 1] = s;
                    C0071f c0071f = main2.f6a;
                    short[] sArr4 = sArr;
                    byte[] bArr = new byte[sArr4.length << 1];
                    short s3 = 0;
                    for (short s4 = 0; s4 < sArr4.length; s4 = (short) (s4 + 1)) {
                        bArr[s3] = (byte) (sArr4[s4] >> 8);
                        short s5 = (short) (s3 + 1);
                        bArr[s5] = (byte) sArr4[s4];
                        s3 = (short) (s5 + 1);
                    }
                    c0071f.m789a((byte) 14, bArr);
                }
                z = z2;
            } else {
                z = false;
            }
            if (!z || (c0016iM226a = C0016i.m226a(this.f463k)) == null) {
                return;
            }
            RunnableC0037e.f360a.m437a(c0016iM226a, RunnableC0037e.f360a.m423a() == this);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("HelpViewInit ").append(e.getMessage()).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo168a();

    /* JADX INFO: renamed from: e */
    public final boolean m542e() {
        return this.f462f;
    }

    /* JADX INFO: renamed from: c */
    public final void m543c(boolean z) {
        this.f462f = z;
    }

    /* JADX INFO: renamed from: i */
    public final void m544i() {
        m545b(this.f463k);
    }

    /* JADX INFO: renamed from: b */
    public static void m545b(short s) {
        try {
            C0016i c0016iM226a = C0016i.m226a(s);
            if (c0016iM226a != null) {
                RunnableC0037e.f360a.m437a((AbstractC0012e) c0016iM226a, true);
                return;
            }
            C0058g c0058g = new C0058g(C0059h.f576a[49]);
            c0058g.m668a(C0059h.f576a[49]);
            c0058g.m671b(s);
            C0063c.f597a.m749a(c0058g);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("addToOrderRequest ").append(e.toString()).toString());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m546j() {
        if (this.f464a != null) {
            this.f464a.m408c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m547a(short s, short s2, short s3, short s4, boolean z) {
        if (this.f464a != null) {
            this.f464a = null;
        }
        this.f464a = new C0035c(s, s2, s3, s4, z, false);
    }

    /* JADX INFO: renamed from: a */
    public String mo200a() {
        return f449c;
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo178a(int i, int i2);

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo179a(int i, int i2, int i3);

    /* JADX INFO: renamed from: b */
    protected abstract boolean mo180b(int i, int i2, int i3);

    /* JADX INFO: renamed from: b */
    public final boolean m548b(int i, int i2) {
        try {
            if (this.f456a != null) {
                if (C0025r.m310a(i, i2)) {
                    C0023p c0023pM296a = this.f456a.m296a(false, true, false);
                    if (c0023pM296a == null) {
                        return true;
                    }
                    m531b(c0023pM296a);
                    return true;
                }
                if (C0025r.m311b(i, i2)) {
                    C0023p c0023pM296a2 = this.f456a.m296a(true, false, false);
                    if (c0023pM296a2 == null) {
                        return true;
                    }
                    m531b(c0023pM296a2);
                    return true;
                }
                if (this.f456a.m297a() && this.f456a.m312c(i, i2)) {
                    C0023p c0023pM296a3 = this.f456a.m296a(false, false, true);
                    if (c0023pM296a3 == null) {
                        return true;
                    }
                    m531b(c0023pM296a3);
                    return true;
                }
            }
            this.f466g = mo178a(i, i2);
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("Screen.pointerPressed: ").append(e.getMessage()).toString());
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m549k() {
        this.f466g = false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m550f() {
        return this.f466g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m551c(int i, int i2, int i3) {
        return mo179a(i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public final void m552a(int i, int i2, int i3) {
        mo180b(i, i2, i3);
    }

    @Override // mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: b */
    public void mo10b(int i) {
        if (i == 1) {
            RunnableC0037e.f360a.m472l();
            m553d();
            return;
        }
        if (i != 0) {
            return;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= this.f451a.f433a.size()) {
                RunnableC0037e.f360a.m472l();
                if (this.f455a == null || !this.f455a.m264c()) {
                    m555n();
                    return;
                }
                return;
            }
            if (this.f451a.m515a((int) s2).equals("")) {
                return;
            } else {
                s = (short) (s2 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m553d() {
        this.f455a = null;
        this.f454e = false;
        this.f451a = null;
    }

    /* JADX INFO: renamed from: a */
    private String[] m554a(int i, int i2) {
        String strM556a = m556a(new StringBuffer().append("num").append(String.valueOf(i)).append("-").append(String.valueOf(i2)).toString(), (String) null);
        String strM556a2 = strM556a == null ? m556a(new StringBuffer().append("num").append(String.valueOf(i)).append(String.valueOf(i2)).toString(), "") : strM556a;
        String strM557a = m557a("moneyName", i, "");
        String strM557a2 = m557a("smsprefix", i, "mancer");
        String[] strArrM19a = RunnableC0000a.m19a(strM556a2, ' ');
        String[] strArr = new String[6];
        strArr[0] = strArrM19a[0];
        strArr[1] = strArrM19a[1];
        strArr[2] = strM557a;
        strArr[3] = strArrM19a[2];
        strArr[4] = strM557a2;
        strArr[5] = strArrM19a.length > 3 ? strArrM19a[3] : "";
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX INFO: renamed from: n */
    private void m555n() {
        if (this.f451a != null) {
            if (this.f451a.f439a == 10) {
                String strM774a = C0066a.m774a(180, m554a(this.f451a.m517a(0) + 1, this.f451a.m517a(1)));
                C0039g c0039g = this.f451a;
                String strM777b = C0066a.m777b(135);
                AlertType alertType = AlertType.CONFIRMATION;
                String strM777b2 = C0066a.m777b(215);
                c0039g.f438a = new Alert(strM777b, strM774a, (Image) null, alertType);
                c0039g.f429a = new Command(C0066a.m777b(34), 4, 0);
                c0039g.f438a.addCommand(c0039g.f429a);
                c0039g.f438a.addCommand(new Command(strM777b2, 4, 0));
                c0039g.f438a.setCommandListener(c0039g);
                c0039g.f438a.setTimeout(-2);
                Display.getDisplay(Main2.f0a).setCurrent(c0039g.f438a);
                return;
            }
            if (this.f451a.f439a == 20) {
                String strM515a = this.f451a.m515a(0);
                if (strM515a.trim().equals("")) {
                    return;
                }
                int i = Integer.parseInt(strM515a);
                ?? M108a = C0005e.f76a.m108a();
                if (M108a < i) {
                    Main2.m11a();
                    return;
                }
                try {
                    C0058g c0058g = new C0058g(C0059h.f576a[77]);
                    c0058g.m670a(i);
                    M108a = C0063c.f597a.m749a(c0058g);
                } catch (Exception e) {
                    C0063c.m745a((Exception) M108a);
                }
                mo10b(1);
                return;
            }
        }
        if (this.f455a == null) {
            return;
        }
        try {
            short s = this.f455a.f246a;
            short s2 = this.f455a.f247b;
            C0058g c0058g2 = new C0058g(s);
            c0058g2.m668a(s2);
            if (this.f455a.m270e()) {
                c0058g2.m670a(mo230b());
            }
            if (this.f451a != null && this.f451a.f433a.size() > 0) {
                for (short s3 = 0; s3 < this.f451a.f433a.size(); s3 = (short) (s3 + 1)) {
                    c0058g2.m674a(this.f451a.m515a((int) s3));
                }
            }
            C0063c.f597a.m749a(c0058g2);
            m553d();
        } catch (Exception e2) {
            C0063c.m746a(new StringBuffer().append(e2).append("").toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public int mo230b() {
        return -1;
    }

    @Override // mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: e */
    public final void mo12e() {
        if (this.f451a.f439a == 10) {
            String[] strArrM554a = m554a(this.f451a.m517a(0) + 1, this.f451a.m517a(1));
            if (strArrM554a != null) {
                String string = new StringBuffer().append(strArrM554a[5]).append(strArrM554a[4]).toString();
                RunnableC0000a.m17a(new StringBuffer().append(string).append("id").append(String.valueOf(C0005e.f76a.f84a)).toString(), strArrM554a[0], string);
            }
        }
    }

    @Override // mobak.p006c.InterfaceC0070e
    /* JADX INFO: renamed from: c */
    public void mo13c(int i) {
        if (this.f451a.f439a == 10) {
            if (i != 0) {
                if (i == 1) {
                    if (this.f451a.m517a(1) < 0) {
                        this.f451a.m522b(0);
                        return;
                    } else {
                        this.f451a.m522b(0);
                        this.f451a.m521a(C0066a.m777b(129), 0);
                        return;
                    }
                }
                return;
            }
            C0039g c0039g = this.f451a;
            if (c0039g.f434b != null && c0039g.f434b.size() > 1) {
                Item item = (ChoiceGroup) c0039g.f434b.elementAt(1);
                c0039g.f434b.removeElementAt(1);
                for (int i2 = 0; i2 <= c0039g.f427a.size(); i2++) {
                    if (c0039g.f427a.get(i2) == item) {
                        c0039g.f427a.delete(i2);
                        break;
                    }
                }
            }
            int iM517a = this.f451a.m517a(0);
            short s = Short.parseShort(m557a("numCount", iM517a + 1, "0").trim());
            if (s <= 0) {
                this.f451a.m524a(C0066a.m777b(135), C0066a.m777b(216), 4);
                return;
            }
            String[] strArr = new String[s + 1];
            strArr[0] = "";
            short s2 = 0;
            while (true) {
                short s3 = s2;
                if (s3 >= s) {
                    break;
                }
                String[] strArrM554a = m554a(iM517a + 1, s3 + 1);
                strArr[s3 + 1] = new StringBuffer().append(strArrM554a[3]).append(" ").append(C0066a.m777b(230)).append(" (").append(strArrM554a[1]).append(" ").append(strArrM554a[2]).append(")").toString();
                s2 = (short) (s3 + 1);
            }
            this.f451a.m516a(C0066a.m777b(214), 4, strArr, (boolean[]) null);
            this.f451a.m518a(1);
            String strM557a = m557a("comment", iM517a + 1, (String) null);
            if (strM557a != null) {
                this.f451a.m523a((String) null, strM557a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m556a(String str, String str2) {
        int iIndexOf;
        String string = new StringBuffer().append(str).append(":").toString();
        if (this.f465a != null && (iIndexOf = this.f465a.indexOf(string)) >= 0) {
            int length = iIndexOf + string.length();
            int iIndexOf2 = this.f465a.indexOf(13, length);
            int iIndexOf3 = iIndexOf2;
            if (iIndexOf2 == -1) {
                iIndexOf3 = this.f465a.indexOf(10, length);
            }
            return iIndexOf3 == -1 ? this.f465a.substring(length) : this.f465a.substring(length, iIndexOf3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    private String m557a(String str, int i, String str2) {
        return m556a(new StringBuffer().append(str).append(String.valueOf(i)).toString(), str2);
    }

    /* JADX INFO: renamed from: l */
    public static void m558l() {
        String strM794a = Main2.f0a.f6a.m794a((byte) 20, "0");
        C0058g c0058g = new C0058g(C0059h.f576a[106], (short) 8, C0059h.f576a[106]);
        c0058g.m673a(Long.parseLong(strM794a));
        C0063c.f597a.m749a(c0058g);
    }

    /* JADX INFO: renamed from: a */
    public final void m559a(long j, String str) {
        RunnableC0000a.m18a();
        this.f451a = new C0039g(C0066a.m777b(212), this);
        this.f451a.f439a = 10;
        this.f451a.m523a((String) null, C0066a.m777b(231));
        this.f465a = m560a(j, str);
        if (this.f465a == null || this.f465a.equals("")) {
            RunnableC0037e.m427a(C0066a.m777b(135), C0066a.m777b(278));
            return;
        }
        int i = Short.parseShort(m556a("count", "0").trim());
        String[] strArr = new String[i];
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= i) {
                this.f451a.m516a(C0066a.m777b(213), 4, strArr, (boolean[]) null);
                this.f451a.m521a(C0066a.m777b(34), 1);
                mo13c(0);
                this.f451a.m519a();
                return;
            }
            strArr[s2] = m557a("name", s2 + 1, "0");
            s = (short) (s2 + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private String m560a(long j, String str) {
        if (str != null && !str.equals("")) {
            Main2.f0a.f6a.m788a((byte) 20, String.valueOf(j));
            Main2.f0a.f6a.m788a((byte) 21, str);
            return str;
        }
        String strM794a = Main2.f0a.f6a.m794a((byte) 21, "");
        String str2 = strM794a;
        if (strM794a.equals("")) {
            try {
                InputStream resourceAsStream = Main2.f0a.getClass().getResourceAsStream("/mobak/help/country.txt");
                byte[] bArr = new byte[resourceAsStream.available()];
                resourceAsStream.read(bArr);
                resourceAsStream.close();
                str2 = new String(bArr, "UTF-8");
            } catch (IOException unused) {
                str2 = "";
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: m */
    public final void m561m() {
        this.f451a = new C0039g(C0066a.m777b(83), this);
        this.f451a.f439a = 20;
        this.f451a.m520a(C0066a.m777b(83));
        this.f451a.m520a(C0066a.m777b(34));
        this.f451a.m523a((String) null, C0066a.m774a(232, new String[]{String.valueOf(C0050b.f545a)}));
        this.f451a.m514a(C0066a.m773a(83), "", 15, 2);
        this.f451a.m519a();
    }

    /* JADX INFO: renamed from: a */
    protected boolean mo206a() {
        return false;
    }

    /* JADX INFO: renamed from: a_ */
    public void mo207a_() {
    }

    /* JADX INFO: renamed from: b */
    static void m562b(AbstractC0041i abstractC0041i) {
        abstractC0041i.m553d();
    }

    /* JADX INFO: renamed from: c */
    static void m563c(AbstractC0041i abstractC0041i) {
        abstractC0041i.m555n();
    }
}
