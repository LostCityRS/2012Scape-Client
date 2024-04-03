import deob.ObfuscatedName;

import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("nf")
public class class383 {

    public class383() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.u(Ljava/lang/String;ZZZZS)V")
    public static void method3613(String arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        method5599(arg0, arg1, arg2, "openjs", arg3, arg4);
    }

    @ObfuscatedName("lb.j(Ljava/lang/String;ZZLjava/lang/String;ZZI)V")
    public static void method5599(String arg0, boolean arg1, boolean arg2, String arg3, boolean arg4, boolean arg5) {
        if (!arg1) {
            method12203(arg0, 3);
            return;
        }
        if (!arg4 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var7) {
            }
        }
        if (Statics.field2247.startsWith("win") && !arg4) {
            method12203(arg0, 0);
            return;
        }
        if (Statics.field2247.startsWith("mac")) {
            method1814(arg0, 1, arg3);
            return;
        }
        method12203(arg0, 2);
    }

    @ObfuscatedName("vu.a(Ljava/lang/String;II)Z")
    public static boolean method12203(String arg0, int arg1) {
        return method1814(arg0, arg1, "openjs");
    }

    @ObfuscatedName("al.s(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method1814(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!Statics.field2247.startsWith("win")) {
                    throw new Exception();
                } else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
                    String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int var4 = 0; var4 < arg0.length(); var4++) {
                        if (var3.indexOf(arg0.charAt(var4)) == -1) {
                            throw new Exception();
                        }
                    }
                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Throwable var11) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Object var6 = BrowserControl.method12168(Statics.field6387, arg2, new Object[]{(new URL(Statics.field6387.getCodeBase(), arg0)).toString()});
                return var6 != null;
            } catch (Throwable var12) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                Statics.field6387.getAppletContext().showDocument(new URL(Statics.field6387.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var13) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                BrowserControl.method12167(Statics.field6387, "loggedout");
            } catch (Throwable var15) {
            }
            try {
                Statics.field6387.getAppletContext().showDocument(new URL(Statics.field6387.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var14) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
