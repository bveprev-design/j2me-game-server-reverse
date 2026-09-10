package mobak;

import java.util.Vector;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;
import mobak.p000a.p002b.RunnableC0037e;
import mobak.p006c.C0066a;

/* JADX INFO: renamed from: mobak.a */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a.class */
public final class RunnableC0000a implements Runnable {

    /* JADX INFO: renamed from: a */
    private Thread f13a = new Thread(this);

    /* JADX INFO: renamed from: a */
    private static boolean f14a = false;

    /* JADX INFO: renamed from: a */
    private String f15a;

    /* JADX INFO: renamed from: b */
    private String f16b;

    /* JADX INFO: renamed from: c */
    private String f17c;

    private RunnableC0000a(String str, String str2, String str3) {
        this.f15a = str;
        this.f17c = str2;
        this.f16b = str3;
        this.f13a.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageConnection messageConnection = null;
        try {
            try {
                MessageConnection messageConnectionOpen = Connector.open(new StringBuffer().append("sms://").append(this.f15a).toString());
                messageConnection = messageConnectionOpen;
                TextMessage textMessageNewMessage = messageConnectionOpen.newMessage("text");
                textMessageNewMessage.setPayloadText(this.f17c);
                messageConnection.send(textMessageNewMessage);
                if (!f14a) {
                    RunnableC0037e.m427a("", C0066a.m773a(188));
                }
                f14a = true;
                if (messageConnection != null) {
                    try {
                        messageConnection.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                if (!f14a) {
                    RunnableC0037e.m427a("", C0066a.m774a(189, new String[]{String.valueOf(this.f15a), this.f16b}));
                }
                f14a = true;
                if (messageConnection != null) {
                    try {
                        messageConnection.close();
                    } catch (Exception unused3) {
                    }
                }
            }
        } catch (Throwable th) {
            if (messageConnection != null) {
                try {
                    messageConnection.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m16a() {
        try {
            Class.forName("javax.wireless.messaging.Message");
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m17a(String str, String str2, String str3) {
        if (m16a() == 0) {
            return;
        }
        new RunnableC0000a(str2, str, str3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m18a() {
        f14a = false;
    }

    /* JADX INFO: renamed from: a */
    public static final String[] m19a(String str, char c) {
        Vector vector = new Vector();
        int length = -1;
        while (length < str.length() - 1) {
            int i = length;
            int iIndexOf = str.indexOf(32, i + 1);
            length = iIndexOf;
            if (iIndexOf == -1) {
                length = str.length();
            }
            if ((length - i) - 1 > 0) {
                vector.addElement(str.substring(i + 1, length));
            }
        }
        if (vector.size() <= 0) {
            return new String[0];
        }
        String[] strArr = new String[vector.size()];
        for (int i2 = 0; i2 < vector.size(); i2++) {
            strArr[i2] = (String) vector.elementAt(i2);
        }
        return strArr;
    }
}
