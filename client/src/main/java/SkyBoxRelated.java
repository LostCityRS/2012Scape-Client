import deob.ObfuscatedName;

@ObfuscatedName("mh")
public class SkyBoxRelated {

    @ObfuscatedName("mh.c")
    public final int field3954;

    @ObfuscatedName("mh.m")
    public final int field3955;

    @ObfuscatedName("mh.t")
    public final int field3965;

    @ObfuscatedName("mh.l")
    public final int field3957;

    @ObfuscatedName("mh.f")
    public final int field3958;

    @ObfuscatedName("mh.d")
    public final boolean field3959;

    @ObfuscatedName("mh.z")
    public final int field3960;

    @ObfuscatedName("mh.n")
    public final int field3952;

    @ObfuscatedName("mh.o")
    public int field3962;

    @ObfuscatedName("mh.q")
    public int field3963;

    @ObfuscatedName("mh.p")
    public int field3964;

    @ObfuscatedName("mh.w")
    public int field3972;

    @ObfuscatedName("mh.b")
    public int field3966;

    @ObfuscatedName("mh.x")
    public Sprite field3967;

    @ObfuscatedName("mh.i")
    public int field3968;

    @ObfuscatedName("mh.v")
    public int field3975;

    @ObfuscatedName("mh.k")
    public int field3970;

    @ObfuscatedName("mh.ap")
    public static final int[] field3980 = new int[4];

    public SkyBoxRelated(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        this.field3965 = arg2;
        this.field3957 = arg3;
        this.field3958 = arg4;
        this.field3959 = arg7;
        this.field3960 = arg1;
        this.field3952 = arg6;
        this.field3955 = arg5;
        this.field3954 = arg0;
        this.field3968 = arg8;
        this.field3975 = arg9;
        this.field3970 = arg10;
    }

    @ObfuscatedName("mh.u()V")
    public static void method6406() {
        Statics.field3977 = null;
        Statics.field3979 = null;
    }

    @ObfuscatedName("mh.j(IIII)Z")
    public boolean method6407(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3959) {
            this.field3964 = 1073741823;
            var8 = this.field3965;
            var9 = this.field3957;
            var10 = this.field3958;
        } else {
            int var5 = this.field3965 - arg0;
            int var6 = this.field3957 - arg1;
            int var7 = this.field3958 - arg2;
            this.field3964 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3964 == 0) {
                this.field3964 = 1;
            }
            var8 = (var5 << 8) / this.field3964;
            var9 = (var6 << 8) / this.field3964;
            var10 = (var7 << 8) / this.field3964;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3966 = this.field3955 * arg3 / (this.field3959 ? 1024 : this.field3964);
        } else {
            this.field3966 = 0;
        }
        if (this.field3966 < 8) {
            this.field3967 = null;
            return false;
        }
        int var12 = IntMath.method2839(this.field3966);
        if (var12 > arg3) {
            var12 = IntMath.method1962(arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3972 != var12) {
            this.field3972 = var12;
        }
        this.field3962 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field3963 = (int) (Math.atan2((double) var8, (double) -var10) * 2607.5945876176133D) & 0x3FFF;
        this.field3967 = null;
        return true;
    }

    @ObfuscatedName("mh.a(Lra;Lmh;)Z")
    public boolean method6422(RendererToolkit arg0, SkyBoxRelated arg1) {
        return this.field3967 != null || this.method6410(arg0, arg1);
    }

    @ObfuscatedName("mh.s(Lra;IIIIIIIIII)V")
    public void method6409(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field3967 == null) {
            return;
        }
        float[] var12 = new float[3];
        float var13 = (float) -(this.field3965 - arg7 << 16);
        float var14 = (float) (this.field3957 - arg8 << 15);
        float var15 = (float) -(this.field3958 - arg9 << 16);
        float[] var16 = new float[3];
        arg0.method525().method5123(var16);
        float var17 = var16[0] + var13;
        float var18 = var16[1] + var14;
        float var19 = var16[2] + var15;
        arg0.method550(var17, var18, var19, var12);
        if (var12[2] < 0.0F) {
            return;
        }
        int var20 = (int) (var12[0] - (float) (this.field3966 / 2));
        int var21 = (int) (var12[1] - (float) (this.field3966 / 2));
        if (var21 < arg4 && this.field3966 + var21 > 0 && var20 < arg3 && this.field3966 + var20 > 0) {
            this.field3967.method2502(var20, var21, this.field3966, this.field3966, 0, arg10 << 24 | 0xFFFFFF, 1);
        }
    }

    @ObfuscatedName("mh.c(Lra;Lmh;)Z")
    public boolean method6410(RendererToolkit arg0, SkyBoxRelated arg1) {
        if (this.field3967 == null) {
            if (this.field3954 == 0) {
                if (Statics.field6785.method898(this.field3960, TextureRelated2.field4848, 0.7F, this.field3972, this.field3972, false)) {
                    int[] var3 = Statics.field6785.method887(this.field3960, 0.7F, this.field3972, this.field3972, false);
                    this.field3967 = arg0.method506(var3, 0, this.field3972, this.field3972, this.field3972);
                }
            } else if (this.field3954 == 2) {
                this.method6411(arg0, arg1);
            } else if (this.field3954 == 1) {
                this.method6408(arg0, arg1);
            }
        }
        return this.field3967 != null;
    }

    @ObfuscatedName("mh.m(Lra;Lmh;)V")
    public void method6411(RendererToolkit arg0, SkyBoxRelated arg1) {
        ModelUnlit var3 = ModelUnlit.method2664(Statics.field549, this.field3960, 0);
        if (var3 == null) {
            return;
        }
        arg0.qa(field3980);
        arg0.r(0, 0, this.field3972, this.field3972);
        arg0.ba(2, 0);
        arg0.B(0, 0, this.field3972, this.field3972, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3959) {
                var4 = -arg1.field3965;
                var5 = -arg1.field3957;
                var6 = -arg1.field3958;
            } else {
                var4 = this.field3965 - arg1.field3965;
                var5 = this.field3957 - arg1.field3957;
                var6 = this.field3958 - arg1.field3958;
            }
        }
        if (this.field3962 != 0) {
            int var7 = -this.field3962 & 0x3FFF;
            int var8 = Trig1.sin[var7];
            int var9 = Trig1.cos[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field3963 != 0) {
            int var11 = -this.field3963 & 0x3FFF;
            int var12 = Trig1.sin[var11];
            int var13 = Trig1.cos[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.IA(1.0F);
        arg0.m(this.field3952, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        var3.method2633(this.field3968 & 0x3FFF, this.field3975 & 0x3FFF, this.field3970 & 0x3FFF);
        Model var15 = arg0.method625(var3, 2048, 0, 64, 768);
        int var16 = var15.ya() - var15.RA();
        int var17 = var15.o() - var15.YA();
        int var18 = var16 > var17 ? var16 : var17;
        int var19 = this.field3972 * 1024 / var18;
        Matrix4x4 var20 = arg0.method528();
        Matrix4x4 var21 = arg0.method781();
        var21.method5398((float) (this.field3972 / 2), (float) (this.field3972 / 2), (float) var19, (float) var19, 50.0F, 50000.0F, (float) arg0.method457().method921(), (float) arg0.method457().method922(), 1024.0F);
        arg0.method784(var21);
        Matrix4x3 var22 = new Matrix4x3();
        arg0.method524(var22);
        Matrix4x3 var23 = arg0.method516();
        var23.method5114(0.0F, 0.0F, (float) (50 - var15.AA()));
        var15.method271(var23, null, 1);
        this.field3967 = arg0.method508(0, 0, this.field3972, this.field3972, true);
        this.field3967.method1052(0, 0, 3);
        arg0.method784(var20);
        arg0.r(field3980[0], field3980[1], field3980[2], field3980[3]);
    }

    @ObfuscatedName("mh.t(Lra;Lmh;)V")
    public void method6408(RendererToolkit arg0, SkyBoxRelated arg1) {
        method6413(arg0);
        method6412(arg0);
        arg0.qa(field3980);
        arg0.r(0, 0, this.field3972, this.field3972);
        arg0.ba(2, 0);
        arg0.B(0, 0, this.field3972, this.field3972, this.field3952 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3959) {
                var3 = -arg1.field3965;
                var4 = -arg1.field3957;
                var5 = -arg1.field3958;
            } else {
                var3 = arg1.field3965 - this.field3965;
                var4 = arg1.field3957 - this.field3957;
                var5 = arg1.field3958 - this.field3958;
            }
        }
        if (this.field3962 != 0) {
            int var6 = Trig1.sin[this.field3962];
            int var7 = Trig1.cos[this.field3962];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field3963 != 0) {
            int var9 = Trig1.sin[this.field3963];
            int var10 = Trig1.cos[this.field3963];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        Model var12 = Statics.field3977.method295((byte) 0, 51200, true);
        var12.W((short) 0, (short) this.field3960);
        arg0.IA(1.0F);
        arg0.m(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3972 * 1024 / (var12.ya() - var12.RA());
        if (this.field3952 != 0) {
            var13 = var13 * 13 / 16;
        }
        Matrix4x4 var14 = arg0.method528();
        Matrix4x4 var15 = arg0.method781();
        var15.method5398((float) (this.field3972 / 2), (float) (this.field3972 / 2), (float) var13, (float) var13, 50.0F, 50000.0F, (float) arg0.method457().method921(), (float) arg0.method457().method922(), 1024.0F);
        arg0.method784(var15);
        arg0.method524(new Matrix4x3());
        Matrix4x3 var16 = new Matrix4x3();
        var16.method5114(0.0F, 0.0F, (float) (50 - var12.AA()));
        var12.method271(var16, null, 1);
        int var17 = this.field3972 * 13 / 16;
        int var18 = (this.field3972 - var17) / 2;
        Statics.field3978.method2502(var18, var18, var17, var17, 0, this.field3952 | 0xFF000000, 1);
        this.field3967 = arg0.method508(0, 0, this.field3972, this.field3972, true);
        arg0.ba(2, 0);
        arg0.B(0, 0, this.field3972, this.field3972, 0, 0);
        Statics.field3979.method2502(0, 0, this.field3972, this.field3972, 1, 0, 0);
        this.field3967.method1052(0, 0, 3);
        arg0.method784(var14);
        arg0.r(field3980[0], field3980[1], field3980[2], field3980[3]);
    }

    @ObfuscatedName("mh.l(Lra;)V")
    public static void method6413(RendererToolkit arg0) {
        if (Statics.field3977 != null) {
            return;
        }
        ModelUnlit var1 = new ModelUnlit(580, 1104, 1);
        var1.method2653((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
        var1.method2625(0, 128, 0);
        var1.method2625(0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = Trig1.sin[var3];
            int var5 = Trig1.cos[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var7 = var6 * 8192 / 24;
                int var8 = Trig1.cos[var7] >> 7;
                int var9 = Trig1.sin[var7] * var4 >> 21;
                int var10 = Trig1.sin[var7] * var5 >> 21;
                var1.method2625(var10, var8, -var9);
            }
            if (var2 > 0) {
                int var11 = var2 * 23 + 2;
                int var12 = var11 - 23;
                var1.method2626(0, var12, var11, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                for (int var13 = 1; var13 < 23; var13++) {
                    int var14 = var12 + 1;
                    int var15 = var11 + 1;
                    var1.method2626(var12, var14, var11, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                    var1.method2626(var14, var15, var11, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                    var12 = var14;
                    var11 = var15;
                }
                var1.method2626(var11, var12, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
            }
        }
        var1.field1315 = var1.field1328;
        var1.field1331 = null;
        var1.field1313 = null;
        var1.field1326 = null;
        Statics.field3977 = arg0.method625(var1, 51200, 33, 64, 768);
    }

    @ObfuscatedName("mh.f(Lra;)V")
    public static void method6412(RendererToolkit arg0) {
        if (Statics.field3979 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 3072 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = (var14 | 0xFF00) << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        Statics.field3979 = arg0.method506(var2, 0, 128, 128, 128);
        Statics.field3978 = arg0.method506(var1, 0, 128, 128, 128);
    }
}
