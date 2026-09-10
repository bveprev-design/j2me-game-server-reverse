package mobak.p000a.p002b.p003a;

import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import mobak.C0050b;
import mobak.Main2;
import mobak.p000a.p001a.AbstractC0003c;
import mobak.p000a.p001a.C0005e;
import mobak.p000a.p001a.C0006f;
import mobak.p000a.p002b.AbstractC0041i;
import mobak.p000a.p002b.C0035c;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0059h;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a.b.a.i */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/a/i.class */
public final class C0016i extends AbstractC0026s {

    /* JADX INFO: renamed from: a */
    private C0006f[] f211a;

    /* JADX INFO: renamed from: d */
    private void m225d() {
        if (this.f211a != null) {
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= this.f211a.length) {
                    break;
                }
                this.f211a[b2] = null;
                b = (byte) (b2 + 1);
            }
        } else {
            this.f211a = new C0006f[10];
        }
        C0005e.f76a.m128c(this.f211a);
        ((AbstractC0041i) this).f464a.m408c();
    }

    /* JADX INFO: renamed from: a */
    public static C0016i m226a(short s) {
        String strSubstring;
        String strValueOf = String.valueOf((int) s);
        boolean zM321a = AbstractC0026s.m321a(s);
        InputStream resourceAsStream = Main2.f0a.getClass().getResourceAsStream(new StringBuffer().append("/mobak/help/").append(strValueOf).toString());
        if (resourceAsStream == null) {
            return null;
        }
        C0016i c0016i = new C0016i((short) -11);
        c0016i.mo223c();
        byte[] bArr = new byte[resourceAsStream.available()];
        resourceAsStream.read(bArr);
        resourceAsStream.close();
        String str = new String(bArr, "UTF-8");
        while (str != null && !str.equals("")) {
            if (str.indexOf("\n") > 0) {
                strSubstring = str.substring(0, str.indexOf("\n") - 1);
                str = str.substring(str.indexOf("\n") + 1);
            } else {
                strSubstring = str;
                str = null;
            }
            int i = 0;
            while (i < strSubstring.length() && !Character.isDigit(strSubstring.charAt(i)) && strSubstring.charAt(i) != '#' && strSubstring.charAt(i) != '/') {
                i++;
            }
            if (i >= strSubstring.length()) {
                strSubstring = "";
            } else if (i > 0) {
                strSubstring = strSubstring.substring(i);
            }
            if (!strSubstring.startsWith("#") && !strSubstring.startsWith("//")) {
                short s2 = Short.parseShort(strSubstring.substring(0, strSubstring.indexOf(" ")));
                String strSubstring2 = strSubstring.substring(strSubstring.indexOf(" "));
                if (s2 > 0) {
                    C0035c c0035c = ((AbstractC0041i) c0016i).f464a;
                    c0035c.f352a += 5;
                    int i2 = c0035c.f352a;
                    c0035c.m401a(strSubstring2, AbstractC0041i.f442b, (byte) 46, false, -1);
                    c0035c.m410a(s2, (short) 1, (short) i2, zM321a);
                    if (c0035c.f352a < i2 + 8 + 35) {
                        c0035c.f352a = i2 + 8 + 35;
                    }
                } else {
                    ((AbstractC0041i) c0016i).f464a.f352a += 5;
                    ((AbstractC0041i) c0016i).f464a.m402a(strSubstring2, AbstractC0041i.f442b, false, -1);
                }
            }
        }
        return c0016i;
    }

    public C0016i(short s) {
        super(s);
        this.f211a = null;
        try {
            RunnableC0037e.f360a.m461j();
            C0006f.m147b();
            switch (s) {
                case -11:
                case -7:
                    m547a((short) 16, (short) (m190a() + 8), (short) (RunnableC0037e.f360a.getWidth() - 32), (short) (((RunnableC0037e.f360a.getHeight() - m190a()) - C0025r.m274a()) - 16), false);
                    ((AbstractC0041i) this).f456a = new C0025r(null, new byte[]{55}, null);
                    ((AbstractC0012e) this).f166a = C0066a.m773a(118);
                    return;
                case -5:
                    m547a((short) 16, (short) (m190a() + 8), (short) (RunnableC0037e.f360a.getWidth() - 75), (short) (((RunnableC0037e.f360a.getHeight() - m190a()) - 16) - C0025r.m274a()), true);
                    try {
                        ((AbstractC0041i) this).f456a = new C0025r(new byte[]{74, 86}, new byte[]{51, 55, 95}, null);
                        C0023p c0023p = new C0023p((byte) 30);
                        c0023p.f246a = C0059h.f576a[90];
                        c0023p.m268a((short) 269);
                        c0023p.f247b = C0059h.f576a[90];
                        ((AbstractC0041i) this).f456a.m282a(false, c0023p);
                        break;
                    } catch (Exception unused) {
                        C0063c.m746a("popupMenu create");
                    }
                    ((AbstractC0026s) this).f270a = (byte) ((((((RunnableC0037e.f360a.getHeight() - m190a()) - 10) - RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f142d))) - RunnableC0037e.m477b(C0050b.m638a(AbstractC0012e.f143e))) - C0025r.m274a()) / 37);
                    ((AbstractC0012e) this).f166a = C0066a.m773a(93);
                    ((AbstractC0026s) this).f274c = (byte) 0;
                    ((AbstractC0026s) this).f273b = (byte) 0;
                    mo168a();
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            C0063c.m746a(new StringBuffer().append("ViewHelp () ").append(e).toString());
        }
        C0063c.m746a(new StringBuffer().append("ViewHelp () ").append(e).toString());
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a_ */
    protected final boolean mo164a_() {
        if (this.f463k == -7 || this.f463k == -11) {
            RunnableC0037e.f360a.m443f();
            return true;
        }
        super.m327b((short) 0);
        return true;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo169a(Graphics graphics) {
        try {
            super.mo169a(graphics);
            if (this.f463k == -5) {
                try {
                    m330d(graphics);
                    if (((AbstractC0041i) this).f464a.m409a()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        try {
                            stringBuffer.append(C0005e.f76a.m102a());
                            ((AbstractC0041i) this).f464a.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                            StringBuffer stringBufferDelete = stringBuffer.delete(0, stringBuffer.toString().length());
                            stringBufferDelete.append(C0066a.m773a(18)).append(": ").append(C0066a.m778a(C0005e.f76a.f96a));
                            ((AbstractC0041i) this).f464a.m402a(stringBufferDelete.toString(), AbstractC0041i.f442b, false, -1);
                            StringBuffer stringBufferDelete2 = stringBufferDelete.delete(0, stringBufferDelete.toString().length());
                            stringBufferDelete2.append(C0066a.m773a(102)).append(": ").append(C0005e.f76a.m116d());
                            ((AbstractC0041i) this).f464a.m402a(stringBufferDelete2.toString(), AbstractC0041i.f442b, false, -1);
                            StringBuffer stringBufferDelete3 = stringBufferDelete2.delete(0, stringBufferDelete2.toString().length());
                            stringBufferDelete3.append(C0066a.m774a(101, new String[]{String.valueOf(C0005e.f76a.m113b()), String.valueOf(C0005e.f76a.m117c() + 1)}));
                            ((AbstractC0041i) this).f464a.m402a(stringBufferDelete3.toString(), AbstractC0041i.f442b, false, -1);
                            stringBuffer = stringBufferDelete3.delete(0, stringBufferDelete3.toString().length());
                            String[] strArrM139a = C0005e.f76a.m139a();
                            for (byte b = 0; b < strArrM139a.length; b = (byte) (b + 1)) {
                                stringBuffer.append(strArrM139a[b]);
                                ((AbstractC0041i) this).f464a.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                                stringBuffer = stringBuffer.delete(0, stringBuffer.toString().length());
                            }
                        } catch (Exception e) {
                            C0063c.m746a(new StringBuffer().append("1 ").append(e).toString());
                        }
                        try {
                            if (C0005e.f76a.f94a != null && C0005e.f76a.f94a.length > 0) {
                                stringBuffer.append("\n").append(C0066a.m773a(103)).append(": ");
                                ((AbstractC0041i) this).f464a.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                                stringBuffer = stringBuffer.delete(0, stringBuffer.toString().length());
                                for (byte b2 = 0; b2 < C0005e.f76a.f94a.length; b2 = (byte) (b2 + 1)) {
                                    stringBuffer.append(C0005e.f76a.f94a[b2].f74a).append(": ").append(C0005e.f76a.f94a[b2].f75b);
                                    int iM129a = C0005e.m129a((short) C0005e.f76a.f94a[b2].f73a);
                                    if (iM129a > 0) {
                                        stringBuffer.append(" ").append("\f7").append("+").append(Math.abs(iM129a)).append("\f1\n");
                                    } else if (iM129a < 0) {
                                        stringBuffer.append(" ").append("\f2").append("-").append(Math.abs(iM129a)).append("\f1\n");
                                    }
                                    ((AbstractC0041i) this).f464a.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                                    stringBuffer = stringBuffer.delete(0, stringBuffer.toString().length());
                                }
                            }
                        } catch (Exception e2) {
                            C0063c.m746a(new StringBuffer().append("2: ").append(e2).toString());
                        }
                        try {
                            if (C0005e.f76a.f95b != null && C0005e.f76a.f95b.length > 0) {
                                stringBuffer.append("\n").append(C0066a.m773a(104)).append(": ");
                                ((AbstractC0041i) this).f464a.m402a(stringBuffer.toString(), AbstractC0041i.f442b, false, -1);
                                StringBuffer stringBufferDelete4 = stringBuffer.delete(0, stringBuffer.toString().length());
                                for (byte b3 = 0; b3 < C0005e.f76a.f95b.length; b3 = (byte) (b3 + 1)) {
                                    stringBufferDelete4.append(C0005e.f76a.f95b[b3].f74a).append(": ").append(C0005e.f76a.f95b[b3].f75b);
                                    int iM129a2 = C0005e.m129a((short) C0005e.f76a.f95b[b3].f73a);
                                    if (iM129a2 > 0) {
                                        stringBufferDelete4.append(" ").append("\f7").append("+").append(Math.abs(iM129a2)).append("\f1\n");
                                    } else if (iM129a2 < 0) {
                                        stringBufferDelete4.append(" ").append("\f2").append("-").append(Math.abs(iM129a2)).append("\f1\n");
                                    }
                                    ((AbstractC0041i) this).f464a.m402a(stringBufferDelete4.toString(), AbstractC0041i.f442b, false, -1);
                                    stringBufferDelete4 = stringBufferDelete4.delete(0, stringBufferDelete4.toString().length());
                                }
                            }
                        } catch (Exception e3) {
                            C0063c.m746a(new StringBuffer().append("3: ").append(e3).toString());
                        }
                    }
                } catch (Exception e4) {
                    C0063c.m746a(new StringBuffer().append("PopupMenu text ").append(e4.getMessage()).toString());
                }
            } else if (((AbstractC0041i) this).f464a != null) {
                ((AbstractC0041i) this).f464a.m395a(graphics, (byte) 0);
            }
            ((AbstractC0041i) this).f456a.m291a(graphics);
        } catch (Exception e5) {
            C0063c.m746a(new StringBuffer().append("ViewHelp ").append(e5.getMessage()).toString());
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final void mo202a(int i) {
        if (this.f463k != -7 && this.f463k != -11) {
            super.mo202a(i);
        } else if (RunnableC0037e.f360a.getGameAction(i) == 6) {
            ((AbstractC0041i) this).f464a.m398b();
        } else if (RunnableC0037e.f360a.getGameAction(i) == 1) {
            ((AbstractC0041i) this).f464a.m396a();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m227a(byte b, int i) {
        C0006f[] c0006fArrM101b = C0005e.f76a.m101b(b);
        C0006f[] c0006fArr = new C0006f[i];
        short s = 0;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (c0006fArrM101b == null || s3 >= c0006fArrM101b.length) {
                break;
            }
            if (c0006fArrM101b[s3] != null && c0006fArrM101b[s3].m58b() && c0006fArrM101b[s3].mo75h() == 0) {
                if (c0006fArr[s] == null) {
                    c0006fArr[s] = c0006fArrM101b[s3];
                    short s4 = (short) (s + 1);
                    s = s4;
                    if (s4 >= i) {
                        s = 0;
                    }
                } else {
                    short s5 = 0;
                    while (true) {
                        short s6 = s5;
                        if (s6 >= i) {
                            break;
                        }
                        if (c0006fArr[s6].m71a((byte) 1) < c0006fArrM101b[s3].m71a((byte) 1)) {
                            c0006fArr[s6] = c0006fArrM101b[s3];
                            break;
                        }
                        s5 = (short) (s6 + 1);
                    }
                }
            }
            s2 = (short) (s3 + 1);
        }
        short s7 = 0;
        while (true) {
            short s8 = s7;
            if (s8 >= i) {
                return;
            }
            C0005e.m131a(c0006fArr[s8]);
            s7 = (short) (s8 + 1);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final boolean mo170a(C0023p c0023p) {
        switch ((byte) c0023p.f245a) {
            case 48:
                m227a((byte) 3, 1);
                m227a((byte) 4, 1);
                m227a((byte) 2, 1);
                m227a((byte) 5, 1);
                m227a((byte) 1, 2);
                m227a((byte) 6, 4);
                m225d();
                return true;
            case 74:
                C0006f[] c0006fArrM101b = C0005e.f76a.m101b(m228a(((AbstractC0026s) this).f273b));
                boolean z = false;
                if (c0006fArrM101b != null) {
                    byte b = 0;
                    while (true) {
                        byte b2 = b;
                        if (b2 < c0006fArrM101b.length) {
                            if (c0006fArrM101b[b2] == null || c0006fArrM101b[b2].mo75h() > 0) {
                                b = (byte) (b2 + 1);
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    RunnableC0037e.m427a(C0066a.m773a(74), C0066a.m773a(126));
                    return true;
                }
                RunnableC0037e.f360a.m437a((AbstractC0012e) AbstractC0012e.m188a(m228a(((AbstractC0026s) this).f273b)), true);
                m546j();
                return true;
            case 86:
                AbstractC0003c[] abstractC0003cArrMo165a = mo165a((byte) 0);
                if (abstractC0003cArrMo165a == null || abstractC0003cArrMo165a.length <= ((AbstractC0026s) this).f273b || abstractC0003cArrMo165a[((AbstractC0026s) this).f273b] == null) {
                    return false;
                }
                C0005e.m132b((C0006f) abstractC0003cArrMo165a[((AbstractC0026s) this).f273b]);
                m225d();
                mo168a();
                m546j();
                return true;
            default:
                return super.mo170a(c0023p);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e
    /* JADX INFO: renamed from: a */
    protected final int mo191a() {
        return 15;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    public final void mo168a() {
        ((AbstractC0041i) this).f456a.m303a(true, false);
        if (this.f463k == -5) {
            if (mo176a() == null) {
                ((AbstractC0041i) this).f456a.m288a((byte) 74, false);
            } else {
                ((AbstractC0041i) this).f456a.m288a((byte) 86, false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte m228a(byte b) {
        switch (b) {
            case 0:
                return (byte) 3;
            case 1:
            case 2:
            case 3:
            case 4:
                return (byte) 6;
            case 5:
            case 6:
                return (byte) 1;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 2;
            case 9:
                return (byte) 5;
            default:
                return (byte) -1;
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a */
    protected final AbstractC0003c[] mo165a(byte b) {
        switch (this.f463k) {
            case -5:
                return this.f211a;
            default:
                return super.mo165a(b);
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s
    /* JADX INFO: renamed from: a */
    protected final void mo174a(boolean z) {
        if (this.f463k == -5) {
            byte b = z ? (byte) (((AbstractC0026s) this).f273b + 1) : (byte) (((AbstractC0026s) this).f273b - 1);
            byte b2 = b;
            if (b < 0 || b2 >= 10) {
                return;
            }
            ((AbstractC0026s) this).f273b = b2;
            if (((AbstractC0026s) this).f271a[((AbstractC0026s) this).f274c] > ((AbstractC0026s) this).f273b) {
                ((AbstractC0026s) this).f271a[((AbstractC0026s) this).f274c] = ((AbstractC0026s) this).f273b;
            }
            if (((AbstractC0026s) this).f273b - ((AbstractC0026s) this).f271a[((AbstractC0026s) this).f274c] >= ((AbstractC0026s) this).f270a) {
                ((AbstractC0026s) this).f271a[((AbstractC0026s) this).f274c] = (byte) ((((AbstractC0026s) this).f273b - ((AbstractC0026s) this).f270a) + 1);
            }
        }
    }

    @Override // mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: c */
    public final void mo223c() {
        switch (this.f463k) {
            case -5:
                m225d();
                mo168a();
                super.mo223c();
                break;
        }
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo178a(int i, int i2) {
        if (this.f463k == -5) {
            return super.mo178a(i, i2);
        }
        return false;
    }

    @Override // mobak.p000a.p002b.p003a.AbstractC0026s, mobak.p000a.p002b.p003a.AbstractC0012e, mobak.p000a.p002b.AbstractC0041i
    /* JADX INFO: renamed from: a */
    protected final boolean mo179a(int i, int i2, int i3) {
        if (this.f463k == -5) {
            return super.mo179a(i, i2, i3);
        }
        if (this.f463k != -7 && this.f463k != -11) {
            return false;
        }
        if (i2 > RunnableC0037e.f360a.getHeight() / 2) {
            ((AbstractC0041i) this).f464a.m398b();
            return true;
        }
        ((AbstractC0041i) this).f464a.m396a();
        return true;
    }
}
