package mobak.p000a.p002b;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import mobak.p000a.p002b.p003a.C0022o;
import mobak.p000a.p002b.p003a.C0028u;
import mobak.p000a.p002b.p003a.C0033z;
import mobak.p004b.C0063c;
import mobak.p006c.C0069d;

/* JADX INFO: renamed from: mobak.a.b.c */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/c.class */
public final class C0035c extends AbstractC0036d {

    /* JADX INFO: renamed from: c */
    private short f339c;

    /* JADX INFO: renamed from: d */
    private short f340d;

    /* JADX INFO: renamed from: a */
    private boolean f341a;

    /* JADX INFO: renamed from: b */
    private boolean f342b;

    /* JADX INFO: renamed from: e */
    private short f344e;

    /* JADX INFO: renamed from: f */
    private short f345f;

    /* JADX INFO: renamed from: g */
    private short f346g;

    /* JADX INFO: renamed from: b */
    private byte f347b;

    /* JADX INFO: renamed from: a */
    private Vector f348a;

    /* JADX INFO: renamed from: d */
    private int f349d;

    /* JADX INFO: renamed from: e */
    private int f350e;

    /* JADX INFO: renamed from: c */
    private byte f351c;

    /* JADX INFO: renamed from: a */
    public int f352a;

    /* JADX INFO: renamed from: c */
    private boolean f353c;

    /* JADX INFO: renamed from: f */
    private int f354f;

    /* JADX INFO: renamed from: a */
    private static C0069d f338a = AbstractC0041i.f448h;

    /* JADX INFO: renamed from: a */
    private static C0069d[] f343a = {AbstractC0041i.f441a, AbstractC0041i.f442b, AbstractC0041i.f443c, AbstractC0041i.f444d, AbstractC0041i.f445e, AbstractC0041i.f446f, AbstractC0041i.f447g, AbstractC0041i.f448h};

    public C0035c(short s, short s2, short s3, short s4, boolean z, boolean z2, boolean z3) {
        this.f346g = (short) 0;
        this.f347b = (byte) 2;
        this.f351c = (byte) 10;
        this.f353c = false;
        this.f354f = -1;
        ((AbstractC0036d) this).f355a = (short) 16;
        ((AbstractC0036d) this).f356b = s2;
        this.f339c = s3;
        this.f340d = s4;
        this.f341a = false;
        this.f344e = (short) 0;
        this.f345f = (short) 0;
        this.f342b = false;
        this.f353c = true;
        this.f348a = new Vector();
        if (this.f353c) {
            return;
        }
        this.f341a = true;
    }

    public C0035c(short s, short s2, short s3, short s4, boolean z, boolean z2) {
        this.f346g = (short) 0;
        this.f347b = (byte) 2;
        this.f351c = (byte) 10;
        this.f353c = false;
        this.f354f = -1;
        ((AbstractC0036d) this).f355a = s;
        ((AbstractC0036d) this).f356b = s2;
        this.f339c = s3;
        this.f340d = s4;
        this.f341a = z;
        this.f344e = (short) 0;
        this.f345f = (short) 0;
        this.f342b = false;
        this.f348a = new Vector();
    }

    /* JADX INFO: renamed from: a */
    public final void m395a(Graphics graphics, byte b) {
        if (graphics == null || this.f348a == null) {
            return;
        }
        short sM480b = (short) RunnableC0037e.m480b(graphics);
        short sM481c = (short) RunnableC0037e.m481c(graphics);
        short sM482d = (short) RunnableC0037e.m482d(graphics);
        short sM483e = (short) RunnableC0037e.m483e(graphics);
        graphics.setClip(((AbstractC0036d) this).f355a - 5, ((AbstractC0036d) this).f356b, this.f339c + 10, this.f340d);
        for (int i = 0; i < this.f348a.size(); i++) {
            AbstractC0036d abstractC0036d = (AbstractC0036d) this.f348a.elementAt(i);
            if (abstractC0036d.f355a - this.f344e <= ((AbstractC0036d) this).f355a + this.f339c + 5 && (abstractC0036d.f355a - this.f344e) + abstractC0036d.mo251b() >= ((AbstractC0036d) this).f355a - 5 && abstractC0036d.f356b - this.f345f <= ((AbstractC0036d) this).f356b + this.f340d + 5 && (abstractC0036d.f356b - this.f345f) + abstractC0036d.mo252a() >= ((AbstractC0036d) this).f356b - 5) {
                abstractC0036d.mo250a(graphics, this.f344e, this.f345f, b);
            }
        }
        if (this.f341a) {
            if (m399b()) {
                if (this.f346g < 10) {
                    this.f346g = (short) (this.f346g + 1);
                } else {
                    this.f345f = (short) 0;
                    this.f346g = (short) 0;
                    this.f351c = (byte) 10;
                }
            } else if (this.f345f != 0 || this.f351c <= 0) {
                m398b();
            } else {
                this.f351c = (byte) (this.f351c - 1);
            }
        } else if (this.f342b) {
            if (this.f346g == 0) {
                this.f344e = (short) (this.f344e + 1);
                if (this.f344e + this.f339c + 10 >= this.f349d) {
                    if (this.f346g < 10) {
                        this.f346g = (short) (this.f346g + 1);
                    } else {
                        this.f344e = (short) 0;
                        this.f346g = (short) 0;
                    }
                }
            } else {
                this.f346g = (short) (this.f346g + 1);
                if (this.f346g > 1) {
                    this.f346g = (short) 0;
                }
            }
        }
        graphics.setClip(sM480b, sM481c, sM482d, sM483e);
    }

    /* JADX INFO: renamed from: a */
    public final void m396a() {
        int iM397a = m397a(this.f354f, false);
        if (iM397a < 0) {
            if (m413a(0)) {
                return;
            }
            this.f345f = (short) (this.f345f - 6);
        } else {
            if (!m413a(iM397a)) {
                this.f345f = (short) (this.f345f - 6);
                return;
            }
            ((AbstractC0036d) this.f348a.elementAt(this.f354f)).m416d();
            ((AbstractC0036d) this.f348a.elementAt(iM397a)).m415a(16773632, 2);
            this.f354f = iM397a;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m397a(int i, boolean z) {
        if (this.f348a == null) {
            return -1;
        }
        if (i >= this.f348a.size() - 1 && z) {
            return -1;
        }
        if (i <= 0 && !z) {
            return -1;
        }
        int i2 = z ? 1 : -1;
        if (i < 0) {
            i = 0;
        }
        int i3 = i;
        while (true) {
            int i4 = i3;
            if ((i4 >= this.f348a.size() || !z) && (i4 < 0 || z)) {
                return -1;
            }
            AbstractC0036d abstractC0036d = (AbstractC0036d) this.f348a.elementAt(i4);
            if ((this.f353c || abstractC0036d.mo253a(f338a)) && abstractC0036d.mo255b() > 0 && i4 != i) {
                return i4;
            }
            i3 = i4 + i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m398b() {
        int iM397a = m397a(this.f354f, true);
        if (iM397a < 0) {
            if (m399b()) {
                return;
            }
            this.f345f = (short) (this.f345f + 6);
        } else {
            if (!m413a(iM397a)) {
                this.f345f = (short) (this.f345f + 6);
                return;
            }
            if (this.f354f >= 0 && this.f354f < this.f348a.size()) {
                ((AbstractC0036d) this.f348a.elementAt(this.f354f)).m416d();
            }
            ((AbstractC0036d) this.f348a.elementAt(iM397a)).m415a(16773632, 2);
            this.f354f = iM397a;
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final void mo250a(Graphics graphics, short s, short s2, byte b) {
        short s3 = ((AbstractC0036d) this).f355a;
        short s4 = ((AbstractC0036d) this).f356b;
        ((AbstractC0036d) this).f356b = (short) (((AbstractC0036d) this).f356b - s2);
        try {
            if (b == 0) {
                m395a(graphics, ((AbstractC0036d) this).f359a);
            } else {
                m395a(graphics, b);
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("drawTS").append(e.toString()).toString());
        }
        ((AbstractC0036d) this).f355a = s3;
        ((AbstractC0036d) this).f356b = s4;
    }

    /* JADX INFO: renamed from: b */
    private boolean m399b() {
        return this.f352a - this.f345f <= this.f340d;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: a */
    public final short mo252a() {
        return this.f340d;
    }

    @Override // mobak.p000a.p002b.AbstractC0036d
    /* JADX INFO: renamed from: b */
    public final short mo251b() {
        return this.f339c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23, types: [mobak.c.d] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX INFO: renamed from: a */
    private static Vector m400a(String str, C0069d c0069d, short s, short s2, byte b) {
        ?? Substring;
        boolean z;
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        String str2 = "";
        while (str.length() > 0) {
            if (str.startsWith("\n")) {
                str2 = "\n";
            } else if (str.startsWith("\f")) {
                str2 = "\f";
            } else if (str.startsWith("\\id")) {
                str2 = "\\id";
            }
            if (str2.length() > 0) {
                String str3 = str2;
                str = str.substring((str3.equals("\f") || str3.equals("\n")) ? 1 : str3.equals("\\id") ? 3 : 0);
            }
            int iIndexOf = str.indexOf("\n");
            int iIndexOf2 = iIndexOf;
            if (iIndexOf < 0 || (str.indexOf("\f") < iIndexOf2 && str.indexOf("\f") >= 0)) {
                iIndexOf2 = str.indexOf("\f");
            }
            if (iIndexOf2 < 0 || (str.indexOf("\\id") < iIndexOf2 && str.indexOf("\\id") >= 0)) {
                iIndexOf2 = str.indexOf("\\id");
            }
            if (iIndexOf2 < 0) {
                vector.addElement(new StringBuffer().append(str2).append(str).toString());
                str = "";
            } else {
                vector.addElement(new StringBuffer().append(str2).append(str.substring(0, iIndexOf2)).toString());
                str = str.substring(iIndexOf2);
            }
        }
        int i = 0;
        short sM781a = s;
        short s3 = 0;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            boolean z2 = false;
            String string = vector.elementAt(i2).toString();
            ?? r20 = string;
            if (string.startsWith("\n")) {
                Substring = r20.substring(1);
                z = true;
                sM781a = s;
            } else if (r20.startsWith("\f")) {
                c0069d = f343a[Integer.parseInt(r20.substring(1, 2))];
                Substring = r20.substring(2);
                z = z2;
            } else {
                ?? StartsWith = r20.startsWith("\\id");
                if (StartsWith != 0) {
                    try {
                        z = z2;
                        Substring = r20;
                        i = Integer.parseInt(r20.substring(3, r20.indexOf(" ")));
                        StartsWith = r20.substring(r20.indexOf(" ") + 1);
                        r20 = StartsWith;
                        z = z2;
                        Substring = r20;
                    } catch (Exception e) {
                        C0063c.m746a(StartsWith.getMessage());
                        z = z2;
                        Substring = r20;
                    }
                }
            }
            z = z2;
            Substring = r20;
            int iM781a = sM781a + c0069d.m781a(Substring == true ? 1 : 0);
            ?? r21 = Substring;
            if (iM781a >= s2 - 4) {
                int iM781a2 = 0;
                String strTrim = (Substring == true ? 1 : 0).trim();
                String strSubstring = "";
                boolean z3 = false;
                if (sM781a + c0069d.m781a(strTrim.substring(0, strTrim.indexOf(" ") + 1)) >= s2 - 4 || strTrim.indexOf(" ") < 0) {
                    boolean z4 = false;
                    for (int i3 = 0; i3 < strTrim.length(); i3++) {
                        if (sM781a + c0069d.m781a(strTrim.substring(0, i3)) >= s2 - 4) {
                            strSubstring = strTrim.substring(0, i3);
                            strTrim = strTrim.substring(i3);
                            z4 = true;
                            break;
                        }
                    }
                    if (!z4) {
                        strSubstring = strTrim;
                        strTrim = "";
                    }
                } else {
                    while (!z3 && strTrim.indexOf(" ") >= 0) {
                        String strSubstring2 = strTrim.substring(0, strTrim.indexOf(" ") + 1);
                        if (sM781a + iM781a2 + c0069d.m781a(strSubstring2) > s2 - 4) {
                            z3 = true;
                        } else {
                            strSubstring = new StringBuffer().append(strSubstring).append(strSubstring2).toString();
                            strTrim = strTrim.substring(strTrim.indexOf(" ") + 1);
                            iM781a2 = c0069d.m781a(strSubstring);
                        }
                    }
                }
                vector.insertElementAt("\n", i2 + 1);
                if (strTrim.length() > 0) {
                    vector.insertElementAt(strTrim, i2 + 2);
                }
                r21 = strSubstring;
            }
            if (z) {
                s3 = (short) (s3 + c0069d.f634a + b);
            }
            if (r21.length() > 0) {
                vector2.addElement(new C0022o(r21, sM781a, s3, c0069d, i));
                sM781a = (short) (sM781a + c0069d.m781a((String) r21));
            }
        }
        return vector2;
    }

    /* JADX INFO: renamed from: a */
    public final short m401a(String str, C0069d c0069d, byte b, boolean z, int i) {
        short s = b;
        short s2 = this.f339c;
        if (str == null || str.equals("") || c0069d == null) {
            return (short) 0;
        }
        short sMo252a = 0;
        Vector vectorM400a = m400a(str, c0069d, s, s2, this.f347b);
        short s3 = 0;
        for (int i2 = 0; i2 < vectorM400a.size(); i2++) {
            C0022o c0022o = (C0022o) vectorM400a.elementAt(i2);
            c0022o.f243a = i;
            boolean z2 = true;
            if (i2 == 0) {
                s3 = ((AbstractC0036d) c0022o).f356b;
            } else {
                z2 = s3 != ((AbstractC0036d) c0022o).f356b;
            }
            if (z2) {
                sMo252a = (short) (sMo252a + c0022o.mo252a());
            }
            if (z) {
                ((AbstractC0036d) c0022o).f356b = (short) (((AbstractC0036d) c0022o).f356b + 5);
                int i3 = i2;
                boolean z3 = z2;
                if (c0022o != null) {
                    if (this.f348a == null) {
                        this.f348a = new Vector();
                    }
                    ((AbstractC0036d) c0022o).f355a = (short) (((AbstractC0036d) c0022o).f355a + ((AbstractC0036d) this).f355a);
                    ((AbstractC0036d) c0022o).f356b = (short) (((AbstractC0036d) c0022o).f356b + ((AbstractC0036d) this).f356b);
                    this.f348a.insertElementAt(c0022o, i3);
                    if (c0022o.mo253a(f338a)) {
                        this.f353c = false;
                    }
                    if (z3) {
                        for (int i4 = i3 + 1; i4 < this.f348a.size(); i4++) {
                            AbstractC0036d abstractC0036d = (AbstractC0036d) this.f348a.elementAt(i4);
                            abstractC0036d.f356b = (short) (abstractC0036d.f356b + c0022o.mo252a() + this.f347b);
                            if (this.f350e < (abstractC0036d.f356b + abstractC0036d.mo252a()) - ((AbstractC0036d) this).f356b) {
                                this.f350e = (abstractC0036d.f356b + abstractC0036d.mo252a()) - ((AbstractC0036d) this).f356b;
                            }
                        }
                    }
                    if (this.f349d < (((AbstractC0036d) c0022o).f355a + c0022o.mo251b()) - ((AbstractC0036d) this).f355a) {
                        this.f349d = (((AbstractC0036d) c0022o).f355a + c0022o.mo251b()) - ((AbstractC0036d) this).f355a;
                    }
                    if (z3) {
                        this.f352a += c0022o.mo252a() + this.f347b;
                    }
                }
            } else {
                if (this.f352a == 0 || this.f348a.size() == 0) {
                    this.f352a = 5;
                }
                ((AbstractC0036d) c0022o).f356b = (short) (((AbstractC0036d) c0022o).f356b + this.f352a);
                m404a(c0022o);
            }
        }
        C0022o c0022o2 = (C0022o) vectorM400a.lastElement();
        if (!z) {
            this.f352a = ((((AbstractC0036d) c0022o2).f356b + c0022o2.mo252a()) - ((AbstractC0036d) this).f356b) + this.f347b;
        }
        return sMo252a;
    }

    /* JADX INFO: renamed from: a */
    public final short m402a(String str, C0069d c0069d, boolean z, int i) {
        return m401a(str, c0069d, (byte) 0, z, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m403a(String str, short s, short s2, byte b, byte b2, byte b3, byte b4, byte b5) {
        if (str == null || str.equals("")) {
            return;
        }
        m404a(new C0028u(str, s, s2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 3));
    }

    /* JADX INFO: renamed from: a */
    public final void m404a(AbstractC0036d abstractC0036d) {
        if (abstractC0036d == null) {
            return;
        }
        if (this.f348a == null) {
            this.f348a = new Vector();
        }
        abstractC0036d.f355a = (short) (abstractC0036d.f355a + ((AbstractC0036d) this).f355a);
        abstractC0036d.f356b = (short) (abstractC0036d.f356b + ((AbstractC0036d) this).f356b);
        this.f348a.addElement(abstractC0036d);
        if (abstractC0036d.mo253a(f338a)) {
            this.f353c = false;
        }
        if ((this.f353c || abstractC0036d.mo253a(f338a)) && this.f354f < 0 && abstractC0036d.mo255b() > 0) {
            this.f354f = this.f348a.size() - 1;
            abstractC0036d.m415a(16773632, 2);
        }
        if (this.f350e < (abstractC0036d.f356b + abstractC0036d.mo252a()) - ((AbstractC0036d) this).f356b) {
            this.f350e = (abstractC0036d.f356b + abstractC0036d.mo252a()) - ((AbstractC0036d) this).f356b;
        }
        if (this.f349d < (abstractC0036d.f355a + abstractC0036d.mo251b()) - ((AbstractC0036d) this).f355a) {
            this.f349d = (abstractC0036d.f355a + abstractC0036d.mo251b()) - ((AbstractC0036d) this).f355a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m405a() {
        AbstractC0036d abstractC0036dM406a = m406a(this.f354f);
        if (abstractC0036dM406a != null) {
            return abstractC0036dM406a.mo255b();
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0036d m406a(int i) {
        if (this.f348a != null && i >= 0 && i < this.f348a.size()) {
            return (AbstractC0036d) this.f348a.elementAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m407a(byte b) {
        return this.f348a != null && b >= 0 && b < this.f348a.size() && this.f348a.elementAt(b) != null;
    }

    /* JADX INFO: renamed from: c */
    public final void m408c() {
        this.f345f = (short) 0;
        this.f344e = (short) 0;
        this.f351c = (byte) 10;
        this.f346g = (short) 0;
        if (this.f348a != null) {
            this.f348a.removeAllElements();
        }
        this.f349d = 0;
        this.f350e = 0;
        this.f352a = 0;
        this.f354f = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m409a() {
        return this.f348a == null || this.f348a.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public final void m410a(short s, short s2, short s3, boolean z) {
        C0033z c0033z = new C0033z(s, (short) 1, s3);
        if (z) {
            ((AbstractC0036d) c0033z).f359a = (byte) 1;
        }
        m404a(c0033z);
    }

    /* JADX INFO: renamed from: a */
    public final int m411a(int i) {
        if (this.f348a == null) {
            return -1;
        }
        for (int i2 = i; i2 < this.f348a.size(); i2++) {
            AbstractC0036d abstractC0036dM406a = m406a(i2);
            if (abstractC0036dM406a != null && abstractC0036dM406a.mo253a(f338a)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m412b(int i) {
        if (this.f348a == null) {
            return -1;
        }
        for (int i2 = i; i2 >= 0; i2--) {
            AbstractC0036d abstractC0036dM406a = m406a(i2);
            if (abstractC0036dM406a != null && abstractC0036dM406a.mo253a(f338a)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m413a(int i) {
        AbstractC0036d abstractC0036dM406a = m406a(i);
        return abstractC0036dM406a != null && abstractC0036dM406a.f355a - this.f344e <= (((AbstractC0036d) this).f355a + this.f339c) + 5 && (abstractC0036dM406a.f355a - this.f344e) + abstractC0036dM406a.mo251b() >= ((AbstractC0036d) this).f355a - 5 && (abstractC0036dM406a.f356b - this.f345f) - 2 >= ((AbstractC0036d) this).f356b && (abstractC0036dM406a.f356b - this.f345f) + abstractC0036dM406a.mo252a() <= ((AbstractC0036d) this).f356b + this.f340d;
    }

    /* JADX INFO: renamed from: c */
    public final int m414c(int i) {
        if (this.f348a != null) {
            for (int i2 = 0; i2 < this.f348a.size(); i2++) {
                AbstractC0036d abstractC0036d = (AbstractC0036d) this.f348a.elementAt(i2);
                if ((this.f353c || abstractC0036d.mo253a(f338a)) && m413a(i2) && i >= abstractC0036d.f356b - this.f345f && i <= (abstractC0036d.f356b - this.f345f) + abstractC0036d.mo252a()) {
                    if (this.f354f > -1 && this.f354f < this.f348a.size()) {
                        ((AbstractC0036d) this.f348a.elementAt(this.f354f)).m416d();
                    }
                    abstractC0036d.m415a(16773632, 2);
                    this.f354f = i2;
                    return this.f354f;
                }
            }
        }
        return this.f354f;
    }
}
