import deob.ObfuscatedName;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

@ObfuscatedName("hg")
public class class252 {

    @ObfuscatedName("hg.u")
    public final GpuToolkit field2569;

    @ObfuscatedName("hg.j")
    public class224 field2561 = class224.field2417;

    @ObfuscatedName("hg.a")
    public class224 field2562;

    @ObfuscatedName("hg.s")
    public int field2563 = 128;

    @ObfuscatedName("hg.c")
    public int field2564 = 0;

    @ObfuscatedName("hg.m")
    public float[] field2572 = new float[this.field2563 * 16];

    @ObfuscatedName("hg.t")
    public GpuTexture[] field2567 = new GpuTexture[this.field2563];

    @ObfuscatedName("hg.l")
    public int[] field2560 = new int[this.field2563];

    @ObfuscatedName("hg.f")
    public int field2568;

    @ObfuscatedName("hg.d")
    public VertexBuffer field2565;

    @ObfuscatedName("hg.z")
    public VertexDeclaration field2570;

    @ObfuscatedName("hg.n")
    public IndexBuffer field2571;

    @ObfuscatedName("hg.o")
    public int[] field2566 = new int[4];

    public class252(GpuToolkit arg0, int arg1) {
        this.field2569 = arg0;
        this.field2565 = this.field2569.method13584(true);
        this.field2565.method4269(arg1 * 96, 24);
        this.field2570 = this.field2569.method13585(new VertexDeclarationElement[]{new VertexDeclarationElement(new class237[]{class237.field2495, class237.field2483, class237.field2488})});
        this.field2571 = this.field2569.method13797(false);
        int var3 = arg1 * 6;
        this.field2571.method4535(var3);
        ByteBuffer var4 = this.field2569.field8244;
        var4.clear();
        for (int var5 = 0; var5 < arg1; var5++) {
            var4.putShort((short) (var5 * 4));
            var4.putShort((short) (var5 * 4 + 2));
            var4.putShort((short) (var5 * 4 + 1));
            var4.putShort((short) (var5 * 4 + 2));
            var4.putShort((short) (var5 * 4 + 3));
            var4.putShort((short) (var5 * 4 + 1));
        }
        this.field2571.method4452(0, var3 * this.field2571.method4538().field1508, this.field2569.field8245);
        this.field2568 = arg1;
        this.field2564 = 0;
    }

    @ObfuscatedName("hg.u()V")
    public void method4496() {
        this.field2565.method168();
        this.field2571.method168();
        this.field2565 = null;
        this.field2571 = null;
        this.field2570 = null;
        this.field2564 = 0;
    }

    @ObfuscatedName("hg.j()V")
    public void method4503() {
        if (this.field2564 == 0) {
            return;
        }
        this.field2569.method13597();
        this.field2569.method13592(1);
        this.field2569.method13588(this.field2571);
        this.field2569.method13587(0, this.field2565);
        this.field2569.method13688(this.field2570);
        BatchedSpriteShader var1 = this.field2569.field8347;
        Unsafe var2 = this.field2569.field8247;
        ByteBuffer var3 = this.field2569.field8244;
        var3.clear();
        int var4 = (this.field2568 + this.field2564 - 1) / this.field2568;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = Math.min(this.field2568, this.field2564 - var5);
            long var9 = this.field2565.method4453(0, var8 * 96);
            int var11 = this.field2568 * var7 + var8;
            for (int var12 = var5; var12 < var11; var12++) {
                for (int var13 = 0; var13 < 4; var13++) {
                    var2.putFloat(var9, this.field2572[var6++]);
                    long var14 = var9 + 4L;
                    var2.putFloat(var14, this.field2572[var6++]);
                    long var16 = var14 + 4L;
                    var2.putFloat(var16, 0.0F);
                    long var18 = var16 + 4L;
                    var2.putFloat(var18, this.field2572[var6++]);
                    long var20 = var18 + 4L;
                    var2.putFloat(var20, this.field2572[var6++]);
                    long var22 = var20 + 4L;
                    var2.putInt(var22, this.field2560[var12]);
                    var9 = var22 + 4L;
                }
            }
            this.field2565.method4454();
            GpuTexture var24 = this.field2567[var5];
            int var25 = 1;
            int var26 = 0;
            for (int var27 = var5 + 1; var27 < var11; var27++) {
                if (this.field2567[var27] == var24) {
                    var25++;
                } else {
                    var1.field2275 = var24;
                    var1.method3878();
                    this.field2569.method13595(this.field2571, class255.field2582, var26 * 4, var25 * 4, var26 * 6, var25 * 2);
                    var24 = this.field2567[var27];
                    var25 = 1;
                    var26 = var27 - var5;
                }
            }
            var1.field2275 = var24;
            var1.method3878();
            this.field2569.method13595(this.field2571, class255.field2582, var26 * 4, var25 * 4, var26 * 6, var25 * 2);
            var5 += this.field2568;
        }
        this.field2564 = 0;
    }

    @ObfuscatedName("hg.a(FFFFFFFFLhc;I)V")
    public void method4497(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, GpuTexture arg8, int arg9) {
        if ((arg9 & 0xFF000000) == 0) {
            return;
        }
        this.field2569.method453(this.field2566);
        int var11 = this.field2566[0];
        int var12 = this.field2566[1];
        int var13 = this.field2566[2];
        int var14 = this.field2566[3];
        if (arg0 > (float) var13 || (arg1 > (float) var14 || (arg2 < (float) var11 || arg3 < (float) var12))) {
            return;
        }
        float var15 = arg2 - arg0;
        float var16 = arg3 - arg1;
        float var17 = arg6 - arg4;
        float var18 = arg7 - arg5;
        if (arg0 < (float) var11) {
            arg4 += ((float) var11 - arg0) / var15 * var17;
            arg0 = var11;
        }
        if (arg1 < (float) var12) {
            arg5 += ((float) var12 - arg1) / var16 * var18;
            arg1 = var12;
        }
        if (arg2 > (float) var13) {
            arg6 -= (arg2 - (float) var13) / var15 * var17;
            arg2 = var13;
        }
        if (arg3 > (float) var14) {
            arg7 -= (arg3 - (float) var14) / var16 * var18;
            arg3 = var14;
        }
        this.method4499();
        float var19 = this.method4500(arg0);
        float var20 = this.method4517(arg1);
        float var21 = this.method4500(arg2);
        float var22 = this.method4517(arg3);
        this.field2572[this.field2564 * 16] = var19;
        this.field2572[this.field2564 * 16 + 1] = var20;
        this.field2572[this.field2564 * 16 + 2] = arg4;
        this.field2572[this.field2564 * 16 + 3] = arg5;
        this.field2572[this.field2564 * 16 + 4] = var21;
        this.field2572[this.field2564 * 16 + 5] = var20;
        this.field2572[this.field2564 * 16 + 6] = arg6;
        this.field2572[this.field2564 * 16 + 7] = arg5;
        this.field2572[this.field2564 * 16 + 8] = var19;
        this.field2572[this.field2564 * 16 + 9] = var22;
        this.field2572[this.field2564 * 16 + 10] = arg4;
        this.field2572[this.field2564 * 16 + 11] = arg7;
        this.field2572[this.field2564 * 16 + 12] = var21;
        this.field2572[this.field2564 * 16 + 13] = var22;
        this.field2572[this.field2564 * 16 + 14] = arg6;
        this.field2572[this.field2564 * 16 + 15] = arg7;
        this.field2567[this.field2564] = arg8;
        this.field2560[this.field2564] = arg9;
        this.field2564++;
        if (class224.field2415 == this.field2561) {
            this.method4503();
        }
    }

    @ObfuscatedName("hg.s(FFFFFFFFFFFFFFFFLhc;I)V")
    public void method4498(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15, GpuTexture arg16, int arg17) {
        if ((arg17 & 0xFF000000) == 0) {
            return;
        }
        this.field2569.method453(this.field2566);
        int var19 = this.field2566[0];
        int var20 = this.field2566[1];
        int var21 = this.field2566[2];
        int var22 = this.field2566[3];
        byte var23 = 0;
        int var24 = (arg0 < (float) var19 ? 1 : 0) + (arg2 < (float) var19 ? 1 : 0) + (arg4 < (float) var19 ? 1 : 0) + (arg6 < (float) var19 ? 1 : 0);
        if (var24 == 4) {
            return;
        }
        int var25 = var23 | var24;
        int var26 = (arg0 > (float) var21 ? 1 : 0) + (arg2 > (float) var21 ? 1 : 0) + (arg4 > (float) var21 ? 1 : 0) + (arg6 > (float) var21 ? 1 : 0);
        if (var26 == 4) {
            return;
        }
        int var27 = var25 | var26;
        int var28 = (arg1 < (float) var20 ? 1 : 0) + (arg3 < (float) var20 ? 1 : 0) + (arg5 < (float) var20 ? 1 : 0) + (arg7 < (float) var20 ? 1 : 0);
        if (var28 == 4) {
            return;
        }
        int var29 = var27 | var28;
        int var30 = (arg1 > (float) var22 ? 1 : 0) + (arg3 > (float) var22 ? 1 : 0) + (arg5 > (float) var22 ? 1 : 0) + (arg7 > (float) var22 ? 1 : 0);
        if (var30 == 4) {
            return;
        }
        int var31 = var29 | var30;
        if (var31 != 0) {
            this.method4503();
            this.field2569.method515(true);
            this.field2569.method659(var19, var20, var21, var22);
        }
        this.method4499();
        float var32 = this.method4500(arg0);
        float var33 = this.method4517(arg1);
        float var34 = this.method4500(arg2);
        float var35 = this.method4517(arg3);
        float var36 = this.method4500(arg4);
        float var37 = this.method4517(arg5);
        float var38 = this.method4500(arg6);
        float var39 = this.method4517(arg7);
        this.field2572[this.field2564 * 16] = var32;
        this.field2572[this.field2564 * 16 + 1] = var33;
        this.field2572[this.field2564 * 16 + 2] = arg8;
        this.field2572[this.field2564 * 16 + 3] = arg9;
        this.field2572[this.field2564 * 16 + 4] = var34;
        this.field2572[this.field2564 * 16 + 5] = var35;
        this.field2572[this.field2564 * 16 + 6] = arg10;
        this.field2572[this.field2564 * 16 + 7] = arg11;
        this.field2572[this.field2564 * 16 + 8] = var36;
        this.field2572[this.field2564 * 16 + 9] = var37;
        this.field2572[this.field2564 * 16 + 10] = arg12;
        this.field2572[this.field2564 * 16 + 11] = arg13;
        this.field2572[this.field2564 * 16 + 12] = var38;
        this.field2572[this.field2564 * 16 + 13] = var39;
        this.field2572[this.field2564 * 16 + 14] = arg14;
        this.field2572[this.field2564 * 16 + 15] = arg15;
        this.field2567[this.field2564] = arg16;
        this.field2560[this.field2564] = arg17;
        this.field2564++;
        if (class224.field2415 == this.field2561 || var31 > 0) {
            this.method4503();
        }
        if (var31 != 0) {
            this.field2569.method515(false);
            this.field2569.method753();
            this.field2569.method659(var19, var20, var21, var22);
        }
    }

    @ObfuscatedName("hg.c()V")
    public void method4499() {
        if (this.field2564 != this.field2563) {
            return;
        }
        this.field2563 *= 2;
        float[] var1 = new float[this.field2563 * 16];
        for (int var2 = 0; var2 < this.field2564 * 16; var2++) {
            var1[var2] = this.field2572[var2];
        }
        this.field2572 = var1;
        GpuTexture[] var3 = new GpuTexture[this.field2563];
        int[] var4 = new int[this.field2563];
        for (int var5 = 0; var5 < this.field2564; var5++) {
            var3[var5] = this.field2567[var5];
            var4[var5] = this.field2560[var5];
        }
        this.field2567 = var3;
        this.field2560 = var4;
    }

    @ObfuscatedName("hg.m(F)F")
    public float method4500(float arg0) {
        int var2 = this.field2569.method457().method921();
        return (arg0 + this.field2569.method13750()) / (float) var2 * 2.0F - 1.0F;
    }

    @ObfuscatedName("hg.t(F)F")
    public float method4517(float arg0) {
        int var2 = this.field2569.method457().method922();
        return (1.0F - (arg0 + this.field2569.method13750()) / (float) var2) * 2.0F - 1.0F;
    }

    @ObfuscatedName("hg.l()V")
    public void method4502() {
        this.field2562 = this.field2561;
        this.field2561 = class224.field2416;
    }

    @ObfuscatedName("hg.f()V")
    public void method4501() {
        if (this.field2562 != null) {
            this.field2561 = this.field2562;
            this.field2562 = null;
        }
    }

    @ObfuscatedName("hg.d()Lgy;")
    public class224 method4507() {
        return this.field2561;
    }
}
