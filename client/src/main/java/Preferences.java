import deob.ObfuscatedName;

@ObfuscatedName("am")
public class Preferences {

    @ObfuscatedName("am.q")
    public static boolean field823 = false;

    @ObfuscatedName("am.p")
    public static boolean field824 = false;

    @ObfuscatedName("am.w")
    public static boolean field812 = false;

    public Preferences() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("wp.a(I)I")
    public static int method12606() {
        ClientAutoSetupResult var0 = Statics.method1395();
        GraphicsPacketQueue.method15160(var0);
        return var0.method12695();
    }

    @ObfuscatedName("mb.c(Lagp;I)V")
    public static void method6480(ClientAutoSetupResult arg0) {
        arg0.method15939(0);
        byte var2;
        if (GameShell.field4152 >= 96) {
            int var1 = CpuProfiling.method4552();
            if (var1 <= 100) {
                method5717();
                var2 = 4;
            } else if (var1 <= 500) {
                method5928();
                var2 = 3;
            } else if (var1 <= 1001) {
                method7359();
                var2 = 2;
            } else {
                method1886(true);
                var2 = 1;
            }
            arg0.method15942(0, var1);
        } else {
            method1886(true);
            var2 = 1;
            arg0.method15941(64);
        }
        if (Statics.options.field9661.getValue() == 0) {
            Statics.options.method15449(Statics.options.field9661, true);
        } else {
            Statics.options.method15448(Statics.options.field9670, 0);
            Statics.method5600(0, false);
        }
        Statics.method1245();
        arg0.method15943(var2);
    }

    @ObfuscatedName("dc.m(Lagp;IB)V")
    public static void method2788(ClientAutoSetupResult arg0, int arg1) {
        arg0.method15939(2);
        byte var2;
        if (arg1 > 12053) {
            method5717();
            var2 = 4;
        } else if (arg1 > 5020) {
            method5928();
            var2 = 3;
        } else if (arg1 > 2007) {
            method7359();
            var2 = 2;
        } else {
            method1886(true);
            var2 = 1;
        }
        if (Statics.options.field9661.getValue() == 2) {
            Statics.options.method15449(Statics.options.field9661, true);
        } else {
            Statics.options.method15448(Statics.options.field9670, 2);
            Statics.method5600(2, false);
        }
        Statics.method1245();
        arg0.method15943(var2);
    }

    @ObfuscatedName("td.t(Lagp;III)V")
    public static void method11555(ClientAutoSetupResult arg0, int arg1, int arg2) {
        arg0.method15939(arg1);
        byte var3;
        if (arg2 > 20015) {
            method5717();
            var3 = 4;
        } else if (arg2 > 10020) {
            method5928();
            var3 = 3;
        } else if (arg2 > 5073) {
            method7359();
            var3 = 2;
        } else {
            method1886(true);
            var3 = 1;
        }
        if (Statics.options.field9661.getValue() == arg1) {
            Statics.options.method15449(Statics.options.field9661, true);
        } else {
            Statics.options.method15448(Statics.options.field9670, arg1);
            Statics.method5600(arg1, false);
        }
        Statics.method1245();
        arg0.method15943(var3);
    }

    @ObfuscatedName("lh.l(I)V")
    public static void method5717() {
        Statics.options.method15448(Statics.options.field9660, 2);
        Statics.options.method15448(Statics.options.field9655, 2);
        Statics.options.method15448(Statics.options.field9671, 1);
        Statics.options.method15448(Statics.options.field9647, 1);
        Statics.options.method15448(Statics.options.field9649, 1);
        Statics.options.method15448(Statics.options.field9645, 1);
        Statics.options.method15448(Statics.options.field9658, 1);
        Statics.options.method15448(Statics.options.field9659, 1);
        Statics.options.method15448(Statics.options.field9651, 2);
        Statics.options.method15448(Statics.options.field9650, 1);
        Statics.options.method15448(Statics.options.field9666, 2);
        Statics.options.method15448(Statics.options.field9646, 1);
        Statics.options.method15448(Statics.options.field9637, 0);
        Statics.options.method15448(Statics.options.field9665, 0);
        Statics.options.method15448(Statics.options.field9648, 2);
        Statics.options.method15448(Statics.options.buildArea, BuildAreaSize.field2139.field2143);
        Statics.options.method15448(Statics.options.field9673, 0);
        if (Statics.renderer != null && Statics.renderer.method450() && Statics.renderer.method600()) {
            Statics.renderer.method558();
        }
        Statics.options.method15448(Statics.options.skyDetail, 1);
        method7165();
        Statics.options.method15448(Statics.options.field9677, 0);
        Statics.options.method15448(Statics.options.field9633, 4);
        client.method13901();
        client.world.getEnvironmentManager().method8154();
        client.field9165 = true;
    }

    @ObfuscatedName("lq.f(I)V")
    public static void method5928() {
        Statics.options.method15448(Statics.options.field9660, 2);
        Statics.options.method15448(Statics.options.field9655, 2);
        Statics.options.method15448(Statics.options.field9671, 1);
        Statics.options.method15448(Statics.options.field9647, 1);
        Statics.options.method15448(Statics.options.field9649, 1);
        Statics.options.method15448(Statics.options.field9645, 1);
        Statics.options.method15448(Statics.options.field9658, 1);
        Statics.options.method15448(Statics.options.field9659, 1);
        Statics.options.method15448(Statics.options.field9651, 1);
        Statics.options.method15448(Statics.options.field9650, 1);
        Statics.options.method15448(Statics.options.field9666, 0);
        Statics.options.method15448(Statics.options.field9646, 1);
        Statics.options.method15448(Statics.options.field9637, 0);
        Statics.options.method15448(Statics.options.field9665, 0);
        Statics.options.method15448(Statics.options.field9648, 1);
        Statics.options.method15448(Statics.options.buildArea, BuildAreaSize.field2139.field2143);
        Statics.options.method15448(Statics.options.field9673, 0);
        if (Statics.renderer != null && Statics.renderer.method450() && Statics.renderer.method600()) {
            Statics.renderer.method558();
        }
        Statics.options.method15448(Statics.options.skyDetail, 1);
        method7165();
        Statics.options.method15448(Statics.options.field9677, 1);
        Statics.options.method15448(Statics.options.field9633, 3);
        client.method13901();
        client.world.getEnvironmentManager().method8154();
        client.field9165 = true;
    }

    @ObfuscatedName("oi.d(I)V")
    public static void method7359() {
        Statics.options.method15448(Statics.options.field9660, 1);
        Statics.options.method15448(Statics.options.field9655, 1);
        Statics.options.method15448(Statics.options.field9671, 1);
        Statics.options.method15448(Statics.options.field9647, 1);
        Statics.options.method15448(Statics.options.field9649, 0);
        Statics.options.method15448(Statics.options.field9645, 0);
        Statics.options.method15448(Statics.options.field9658, 0);
        Statics.options.method15448(Statics.options.field9651, 0);
        Statics.options.method15448(Statics.options.field9659, 0);
        Statics.options.method15448(Statics.options.field9650, 0);
        Statics.options.method15448(Statics.options.field9666, 0);
        Statics.options.method15448(Statics.options.field9646, 0);
        Statics.options.method15448(Statics.options.field9637, 0);
        Statics.options.method15448(Statics.options.field9665, 0);
        Statics.options.method15448(Statics.options.field9648, 0);
        Statics.options.method15448(Statics.options.buildArea, BuildAreaSize.field2139.field2143);
        Statics.options.method15448(Statics.options.field9673, 0);
        if (Statics.renderer != null && Statics.renderer.method450() && Statics.renderer.method600()) {
            Statics.renderer.method558();
        }
        Statics.options.method15448(Statics.options.skyDetail, 0);
        method7165();
        Statics.options.method15448(Statics.options.field9677, 2);
        Statics.options.method15448(Statics.options.field9633, 2);
        client.method13901();
        client.world.getEnvironmentManager().method8154();
        client.field9165 = true;
    }

    @ObfuscatedName("aw.z(ZI)V")
    public static void method1886(boolean arg0) {
        Statics.options.method15448(Statics.options.field9660, 1);
        Statics.options.method15448(Statics.options.field9655, 1);
        Statics.options.method15448(Statics.options.field9671, 0);
        Statics.options.method15448(Statics.options.field9646, 0);
        Statics.options.method15448(Statics.options.field9647, 0);
        Statics.options.method15448(Statics.options.field9649, 0);
        Statics.options.method15448(Statics.options.field9645, 0);
        Statics.options.method15448(Statics.options.field9658, 0);
        Statics.options.method15448(Statics.options.field9651, 0);
        Statics.options.method15448(Statics.options.field9659, 0);
        Statics.options.method15448(Statics.options.field9650, 0);
        Statics.options.method15448(Statics.options.field9666, 0);
        Statics.options.method15448(Statics.options.field9637, 0);
        Statics.options.method15448(Statics.options.field9665, 0);
        Statics.options.method15448(Statics.options.field9648, 0);
        Statics.options.method15448(Statics.options.buildArea, BuildAreaSize.field2139.field2143);
        Statics.options.method15448(Statics.options.field9673, 0);
        if (Statics.renderer != null && Statics.renderer.method450() && Statics.renderer.method600()) {
            Statics.renderer.method558();
        }
        Statics.options.method15448(Statics.options.skyDetail, 0);
        method7165();
        Statics.options.method15448(Statics.options.field9677, 2);
        Statics.options.method15448(Statics.options.field9633, 1);
        client.method13901();
        client.world.getEnvironmentManager().method8154();
        client.field9165 = true;
    }

    @ObfuscatedName("og.n(I)V")
    public static void method7165() {
        if (GameShell.field4144 > 1) {
            Statics.options.method15448(Statics.options.field9652, 4);
        } else {
            Statics.options.method15448(Statics.options.field9652, 2);
        }
    }
}
