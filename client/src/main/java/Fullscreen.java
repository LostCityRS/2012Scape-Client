import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("uw")
public final class Fullscreen {

    @ObfuscatedName("uw.u")
    public static boolean allowed = true;

    public Fullscreen() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("lr.j(Lub;IIIII)Ljava/awt/Frame;")
    public static Frame method6036(FullscreenImpl arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 == 0) {
            FullscreenMode[] var5 = Statics.method11507(arg0);
            if (var5 == null) {
                return null;
            }
            boolean var6 = false;
            for (int var7 = 0; var7 < var5.length; var7++) {
                if (var5[var7].field6709 == arg1 && var5[var7].field6707 == arg2 && (arg4 == 0 || var5[var7].field6706 == arg4) && (!var6 || var5[var7].field6708 > arg3)) {
                    arg3 = var5[var7].field6708;
                    var6 = true;
                }
            }
            if (!var6) {
                return null;
            }
        }
        Frame var8 = new Frame("Jagex Full Screen");
        var8.setResizable(false);
        arg0.method11884(var8, arg1, arg2, arg3, arg4);
        return var8;
    }
}
