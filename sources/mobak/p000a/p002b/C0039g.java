package mobak.p000a.p002b;

import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import mobak.Main2;
import mobak.p004b.C0063c;
import mobak.p004b.p005a.C0058g;
import mobak.p006c.C0066a;
import mobak.p006c.C0067b;
import mobak.p006c.InterfaceC0070e;

/* JADX INFO: renamed from: mobak.a.b.g */
/* JADX INFO: loaded from: LordMancerElite1190-spaces.im.jar:mobak/a/b/g.class */
public final class C0039g implements CommandListener, ItemStateListener {

    /* JADX INFO: renamed from: a */
    Form f427a;

    /* JADX INFO: renamed from: a */
    private C0067b[] f428a;

    /* JADX INFO: renamed from: a */
    Command f429a;

    /* JADX INFO: renamed from: b */
    private Command f430b;

    /* JADX INFO: renamed from: a */
    private short f431a;

    /* JADX INFO: renamed from: b */
    private short f432b;

    /* JADX INFO: renamed from: a */
    Vector f433a;

    /* JADX INFO: renamed from: b */
    public Vector f434b;

    /* JADX INFO: renamed from: d */
    private Vector f435d;

    /* JADX INFO: renamed from: c */
    public Vector f436c;

    /* JADX INFO: renamed from: a */
    private InterfaceC0070e f437a;

    /* JADX INFO: renamed from: a */
    Alert f438a;

    /* JADX INFO: renamed from: a */
    public int f439a;

    public C0039g(String str, InterfaceC0070e interfaceC0070e) {
        this.f439a = 0;
        this.f427a = new Form(str);
        this.f427a.setCommandListener(this);
        this.f427a.setItemStateListener(this);
        this.f433a = new Vector();
        this.f434b = new Vector();
        this.f436c = new Vector();
        this.f435d = new Vector();
        this.f437a = interfaceC0070e;
    }

    public C0039g(C0067b[] c0067bArr, String str, short s, short s2) {
        this.f439a = 0;
        this.f428a = c0067bArr;
        this.f427a = new Form(str);
        this.f429a = new Command(C0066a.m777b(34), 4, 0);
        this.f430b = new Command("ok", 4, 0);
        this.f427a.addCommand(this.f429a);
        this.f427a.addCommand(this.f430b);
        this.f427a.setCommandListener(this);
        for (int i = 0; i < this.f428a.length; i++) {
            m525a(this.f428a[i]);
        }
        Display.getDisplay(Main2.f0a).setCurrent(this.f427a);
        this.f431a = s;
        this.f432b = s2;
    }

    /* JADX INFO: renamed from: a */
    public final void m514a(String str, String str2, int i, int i2) {
        TextField textField = new TextField(str, str2, i, i2);
        this.f433a.addElement(textField);
        this.f427a.append(textField);
        this.f427a.setCommandListener(this);
    }

    /* JADX INFO: renamed from: a */
    public final String m515a(int i) {
        return ((TextField) this.f433a.elementAt(i)).getString();
    }

    /* JADX INFO: renamed from: a */
    public final void m516a(String str, int i, String[] strArr, boolean[] zArr) {
        ChoiceGroup choiceGroup = new ChoiceGroup(str, i);
        for (String str2 : strArr) {
            choiceGroup.append(str2, (Image) null);
        }
        if (zArr != null) {
            choiceGroup.setSelectedFlags(zArr);
        }
        this.f434b.addElement(choiceGroup);
        this.f427a.append(choiceGroup);
    }

    /* JADX INFO: renamed from: a */
    public final int m517a(int i) {
        return ((ChoiceGroup) this.f434b.elementAt(i)).getSelectedIndex();
    }

    /* JADX INFO: renamed from: a */
    public final void m518a(int i) {
        if (this.f436c.size() <= 1) {
            return;
        }
        Item item = (StringItem) this.f436c.elementAt(1);
        this.f436c.removeElementAt(1);
        for (int i2 = 0; i2 <= this.f427a.size(); i2++) {
            if (this.f427a.get(i2) == item) {
                this.f427a.delete(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m519a() {
        Display.getDisplay(Main2.f0a).setCurrent(this.f427a);
    }

    /* JADX INFO: renamed from: a */
    public final void m520a(String str) {
        Command command = new Command(str, 4, 0);
        this.f435d.addElement(command);
        this.f427a.addCommand(command);
    }

    /* JADX INFO: renamed from: a */
    public final void m521a(String str, int i) {
        Command command = new Command(str, 4, 0);
        if (this.f435d.size() < i) {
            int size = i - this.f435d.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f435d.addElement(null);
            }
        }
        if (this.f435d.size() == i) {
            this.f435d.insertElementAt(command, i);
        } else {
            this.f435d.setElementAt(command, i);
        }
        this.f427a.addCommand(command);
    }

    /* JADX INFO: renamed from: b */
    public final void m522b(int i) {
        this.f427a.removeCommand((Command) this.f435d.elementAt(0));
        this.f435d.setElementAt(null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m523a(String str, String str2) {
        StringItem stringItem = new StringItem(str, str2);
        this.f436c.addElement(stringItem);
        this.f427a.append(stringItem);
    }

    /* JADX INFO: renamed from: a */
    public final void m524a(String str, String str2, int i) {
        AlertType alertType;
        switch (4) {
            case 1:
                alertType = AlertType.ALARM;
                break;
            case 2:
            default:
                alertType = AlertType.CONFIRMATION;
                break;
            case 3:
                alertType = AlertType.INFO;
                break;
            case 4:
                alertType = AlertType.WARNING;
                break;
        }
        this.f438a = new Alert(str, str2, (Image) null, alertType);
        this.f429a = new Command(C0066a.m777b(34), 4, 0);
        this.f438a.addCommand(this.f429a);
        this.f438a.setCommandListener(this);
        this.f438a.setTimeout(-2);
        Display.getDisplay(Main2.f0a).setCurrent(this.f438a);
    }

    /* JADX INFO: renamed from: a */
    private void m525a(C0067b c0067b) {
        switch (c0067b.f624b) {
            case 1:
                this.f427a.append(c0067b.f625a);
                this.f427a.append(new TextField(C0066a.m777b(235), String.valueOf(c0067b.f628a), 10, 5));
                this.f427a.append(new TextField(C0066a.m777b(236), String.valueOf(c0067b.f629b), 10, 5));
                break;
            case 2:
                String[] strArr = c0067b.f626a;
                boolean[] zArr = c0067b.f627a;
                ChoiceGroup choiceGroup = new ChoiceGroup(c0067b.f625a, 2);
                for (String str : strArr) {
                    choiceGroup.append(str, (Image) null);
                }
                choiceGroup.setSelectedFlags(zArr);
                this.f427a.append(choiceGroup);
                break;
            case 3:
                this.f427a.append(new TextField(c0067b.f625a, c0067b.f630b, 10, 0));
                break;
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (displayable == this.f438a) {
            m519a();
            if (command != this.f429a) {
                this.f437a.mo12e();
            }
            this.f438a = null;
        }
        if (command == this.f429a) {
            Display.getDisplay(Main2.f0a).setCurrent(RunnableC0037e.f360a);
            RunnableC0037e.f360a.m447a(true);
        }
        Command display = command;
        if (display == this.f430b) {
            try {
                int i = 0;
                C0058g c0058g = new C0058g(this.f431a);
                c0058g.m668a(this.f432b);
                for (int i2 = 0; i2 < this.f428a.length; i2++) {
                    switch (this.f428a[i2].f624b) {
                        case 1:
                            int i3 = i + 1;
                            int i4 = i3 + 1;
                            String string = this.f427a.get(i3).getString();
                            i = i4 + 1;
                            String string2 = this.f427a.get(i4).getString();
                            if (string2.length() > 0 && string.length() > 0) {
                                int i5 = Integer.parseInt(string);
                                int i6 = Integer.parseInt(string2);
                                if (i5 < i6) {
                                    c0058g.m672a(this.f428a[i2].f623a);
                                    c0058g.m670a(i5);
                                    c0058g.m670a(i6);
                                }
                            }
                            break;
                        case 2:
                            int i7 = i;
                            i++;
                            ChoiceGroup choiceGroup = this.f427a.get(i7);
                            int length = this.f428a[i2].f626a.length;
                            boolean[] zArr = new boolean[length];
                            int selectedFlags = choiceGroup.getSelectedFlags(zArr);
                            if (selectedFlags > 0) {
                                c0058g.m672a(this.f428a[i2].f623a);
                                c0058g.m672a((byte) selectedFlags);
                                for (byte b = 0; b < length; b = (byte) (b + 1)) {
                                    if (zArr[b]) {
                                        c0058g.m672a(b);
                                    }
                                }
                            } else {
                                c0058g.m672a(this.f428a[i2].f623a);
                                c0058g.m672a((byte) 0);
                            }
                            break;
                        case 3:
                            int i8 = i;
                            i++;
                            TextField textField = this.f427a.get(i8);
                            if (textField.getString().trim().length() > 0) {
                                c0058g.m672a(this.f428a[i2].f623a);
                                c0058g.m674a(textField.getString().trim());
                            }
                            break;
                    }
                }
                C0063c.f597a.m749a(c0058g);
                display = Display.getDisplay(Main2.f0a);
                display.setCurrent(RunnableC0037e.f360a);
                return;
            } catch (Exception e) {
                C0063c.m745a((Exception) display);
            }
        }
        for (int i9 = 0; this.f435d != null && i9 < this.f435d.size(); i9++) {
            if (command == this.f435d.elementAt(i9)) {
                this.f437a.mo10b(i9);
                return;
            }
        }
    }

    public final void itemStateChanged(Item item) {
        for (int i = 0; i < this.f434b.size(); i++) {
            if (this.f434b.elementAt(i) == item) {
                this.f437a.mo13c(i);
                return;
            }
        }
    }
}
