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
        if (client.options.toolkit.getValue() == 0) {
            client.options.method15449(client.options.toolkit, true);
        } else {
            client.options.method15448(client.options.toolkitDefault, 0);
            Statics.method5600(0, false);
        }
        save();
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
        if (client.options.toolkit.getValue() == 2) {
            client.options.method15449(client.options.toolkit, true);
        } else {
            client.options.method15448(client.options.toolkitDefault, 2);
            Statics.method5600(2, false);
        }
        save();
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
        if (client.options.toolkit.getValue() == arg1) {
            client.options.method15449(client.options.toolkit, true);
        } else {
            client.options.method15448(client.options.toolkitDefault, arg1);
            Statics.method5600(arg1, false);
        }
        save();
        arg0.method15943(var3);
    }

    @ObfuscatedName("lh.l(I)V")
    public static void method5717() {
        client.options.method15448(client.options.removeRoof, 2);
        client.options.method15448(client.options.removeRoofOverride, 2);
        client.options.method15448(client.options.groundDecor, 1);
        client.options.method15448(client.options.groundBlending, 1);
        client.options.method15448(client.options.idleAnims, 1);
        client.options.method15448(client.options.flickeringEffects, 1);
        client.options.method15448(client.options.characterShadows, 1);
        client.options.method15448(client.options.texturing, 1);
        client.options.method15448(client.options.sceneryShadows, 2);
        client.options.method15448(client.options.lightDetail, 1);
        client.options.method15448(client.options.waterDetail, 2);
        client.options.method15448(client.options.fog, 1);
        client.options.method15448(client.options.antialiasingDefault, 0);
        client.options.method15448(client.options.antialiasing, 0);
        client.options.method15448(client.options.particles, 2);
        client.options.method15448(client.options.buildArea, BuildAreaSize.field2139.field2143);
        client.options.method15448(client.options.bloom, 0);
        if (client.toolkit != null && client.toolkit.method450() && client.toolkit.isBloomEnabled()) {
            client.toolkit.method558();
        }
        client.options.method15448(client.options.skyDetail, 1);
        method7165();
        client.options.method15448(client.options.maxScreensize, 0);
        client.options.method15448(client.options.preset, 4);
        client.method13901();
        client.world.getEnvironmentManager().method8154();
        client.field9165 = true;
    }

    @ObfuscatedName("lq.f(I)V")
    public static void method5928() {
        client.options.method15448(client.options.removeRoof, 2);
        client.options.method15448(client.options.removeRoofOverride, 2);
        client.options.method15448(client.options.groundDecor, 1);
        client.options.method15448(client.options.groundBlending, 1);
        client.options.method15448(client.options.idleAnims, 1);
        client.options.method15448(client.options.flickeringEffects, 1);
        client.options.method15448(client.options.characterShadows, 1);
        client.options.method15448(client.options.texturing, 1);
        client.options.method15448(client.options.sceneryShadows, 1);
        client.options.method15448(client.options.lightDetail, 1);
        client.options.method15448(client.options.waterDetail, 0);
        client.options.method15448(client.options.fog, 1);
        client.options.method15448(client.options.antialiasingDefault, 0);
        client.options.method15448(client.options.antialiasing, 0);
        client.options.method15448(client.options.particles, 1);
        client.options.method15448(client.options.buildArea, BuildAreaSize.field2139.field2143);
        client.options.method15448(client.options.bloom, 0);
        if (client.toolkit != null && client.toolkit.method450() && client.toolkit.isBloomEnabled()) {
            client.toolkit.method558();
        }
        client.options.method15448(client.options.skyDetail, 1);
        method7165();
        client.options.method15448(client.options.maxScreensize, 1);
        client.options.method15448(client.options.preset, 3);
        client.method13901();
        client.world.getEnvironmentManager().method8154();
        client.field9165 = true;
    }

    @ObfuscatedName("oi.d(I)V")
    public static void method7359() {
        client.options.method15448(client.options.removeRoof, 1);
        client.options.method15448(client.options.removeRoofOverride, 1);
        client.options.method15448(client.options.groundDecor, 1);
        client.options.method15448(client.options.groundBlending, 1);
        client.options.method15448(client.options.idleAnims, 0);
        client.options.method15448(client.options.flickeringEffects, 0);
        client.options.method15448(client.options.characterShadows, 0);
        client.options.method15448(client.options.sceneryShadows, 0);
        client.options.method15448(client.options.texturing, 0);
        client.options.method15448(client.options.lightDetail, 0);
        client.options.method15448(client.options.waterDetail, 0);
        client.options.method15448(client.options.fog, 0);
        client.options.method15448(client.options.antialiasingDefault, 0);
        client.options.method15448(client.options.antialiasing, 0);
        client.options.method15448(client.options.particles, 0);
        client.options.method15448(client.options.buildArea, BuildAreaSize.field2139.field2143);
        client.options.method15448(client.options.bloom, 0);
        if (client.toolkit != null && client.toolkit.method450() && client.toolkit.isBloomEnabled()) {
            client.toolkit.method558();
        }
        client.options.method15448(client.options.skyDetail, 0);
        method7165();
        client.options.method15448(client.options.maxScreensize, 2);
        client.options.method15448(client.options.preset, 2);
        client.method13901();
        client.world.getEnvironmentManager().method8154();
        client.field9165 = true;
    }

    @ObfuscatedName("aw.z(ZI)V")
    public static void method1886(boolean arg0) {
        client.options.method15448(client.options.removeRoof, 1);
        client.options.method15448(client.options.removeRoofOverride, 1);
        client.options.method15448(client.options.groundDecor, 0);
        client.options.method15448(client.options.fog, 0);
        client.options.method15448(client.options.groundBlending, 0);
        client.options.method15448(client.options.idleAnims, 0);
        client.options.method15448(client.options.flickeringEffects, 0);
        client.options.method15448(client.options.characterShadows, 0);
        client.options.method15448(client.options.sceneryShadows, 0);
        client.options.method15448(client.options.texturing, 0);
        client.options.method15448(client.options.lightDetail, 0);
        client.options.method15448(client.options.waterDetail, 0);
        client.options.method15448(client.options.antialiasingDefault, 0);
        client.options.method15448(client.options.antialiasing, 0);
        client.options.method15448(client.options.particles, 0);
        client.options.method15448(client.options.buildArea, BuildAreaSize.field2139.field2143);
        client.options.method15448(client.options.bloom, 0);
        if (client.toolkit != null && client.toolkit.method450() && client.toolkit.isBloomEnabled()) {
            client.toolkit.method558();
        }
        client.options.method15448(client.options.skyDetail, 0);
        method7165();
        client.options.method15448(client.options.maxScreensize, 2);
        client.options.method15448(client.options.preset, 1);
        client.method13901();
        client.world.getEnvironmentManager().method8154();
        client.field9165 = true;
    }

    @ObfuscatedName("og.n(I)V")
    public static void method7165() {
        if (GameShell.field4144 > 1) {
            client.options.method15448(client.options.cpuUsage, 4);
        } else {
            client.options.method15448(client.options.cpuUsage, 2);
        }
    }

    @ObfuscatedName("j.j(I)V")
    public static void save() {
        FileOnDisk var0 = null;
        try {
            var0 = GameShell.method4031("", client.modeGame.field6404, true);
            Packet var1 = client.options.createPreferencesBlock();
            var0.method12075(var1.data, 0, var1.pos);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method12076();
            }
        } catch (Exception var4) {
        }
    }
}
