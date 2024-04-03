import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("vg")
public class NoiseGeneratorRelated {

    @ObfuscatedName("vg.m")
    public static PrioritizedCache field7043 = new PrioritizedCache(16, PrioritizedCacheMode.field3710);

    public NoiseGeneratorRelated() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("vg.u(III)V")
    public static void method12214(int arg0, int arg1) {
        if (Statics.field7038 != arg0) {
            Statics.field7040 = new int[arg0];
            for (int var2 = 0; var2 < arg0; var2++) {
                Statics.field7040[var2] = (var2 << 12) / arg0;
            }
            Statics.field7038 = arg0;
        }
        if (Statics.field7037 == arg1) {
            return;
        }
        if (Statics.field7038 == arg1) {
            Statics.field7041 = Statics.field7040;
        } else {
            Statics.field7041 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                Statics.field7041[var3] = (var3 << 12) / arg1;
            }
        }
        Statics.field7037 = arg1;
    }

    @ObfuscatedName("vg.j(II)[B")
    public static byte[] method12215(int arg0) {
        byte[] var1 = (byte[]) field7043.method5949(arg0);
        if (var1 == null) {
            var1 = new byte[512];
            Random var2 = new Random((long) arg0);
            for (int var3 = 0; var3 < 255; var3++) {
                var1[var3] = (byte) var3;
            }
            for (int var4 = 0; var4 < 255; var4++) {
                int var5 = 255 - var4;
                int var6 = IntMath.method2715(var2, var5);
                byte var7 = var1[var6];
                var1[var6] = var1[var5];
                var1[var5] = var1[511 - var4] = var7;
            }
            field7043.method5954(arg0, var1);
        }
        return var1;
    }
}
