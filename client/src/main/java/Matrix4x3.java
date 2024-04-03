import deob.ObfuscatedName;

@ObfuscatedName("kc")
public class Matrix4x3 {

    @ObfuscatedName("kc.u")
    public static final Matrix4x3 field3455 = new Matrix4x3();

    @ObfuscatedName("kc.j")
    public float field3453;

    @ObfuscatedName("kc.a")
    public float field3452;

    @ObfuscatedName("kc.s")
    public float field3456;

    @ObfuscatedName("kc.c")
    public float field3454;

    @ObfuscatedName("kc.m")
    public float field3451;

    @ObfuscatedName("kc.t")
    public float field3462;

    @ObfuscatedName("kc.l")
    public float field3457;

    @ObfuscatedName("kc.f")
    public float field3461;

    @ObfuscatedName("kc.d")
    public float field3459;

    @ObfuscatedName("kc.z")
    public float field3460;

    @ObfuscatedName("kc.n")
    public float field3450;

    @ObfuscatedName("kc.o")
    public float field3458;

    public Matrix4x3() {
        this.method5157();
    }

    public Matrix4x3(Matrix4x3 arg0) {
        this.method5115(arg0);
    }

    @ObfuscatedName("kc.u(Lkc;)V")
    public void method5115(Matrix4x3 arg0) {
        this.field3453 = arg0.field3453;
        this.field3454 = arg0.field3454;
        this.field3457 = arg0.field3457;
        this.field3460 = arg0.field3460;
        this.field3452 = arg0.field3452;
        this.field3451 = arg0.field3451;
        this.field3461 = arg0.field3461;
        this.field3450 = arg0.field3450;
        this.field3456 = arg0.field3456;
        this.field3462 = arg0.field3462;
        this.field3459 = arg0.field3459;
        this.field3458 = arg0.field3458;
    }

    @ObfuscatedName("kc.j(Lkx;)V")
    public void method5104(ScaleRotTrans arg0) {
        this.method5109(arg0.field3463);
        this.method5127(arg0.field3464);
    }

    @ObfuscatedName("kc.a(Lkx;)V")
    public void method5101(ScaleRotTrans arg0) {
        float var2 = arg0.field3463.field3471 * arg0.field3463.field3471;
        float var3 = arg0.field3463.field3471 * arg0.field3463.field3465;
        float var4 = arg0.field3463.field3471 * arg0.field3463.field3469;
        float var5 = arg0.field3463.field3471 * arg0.field3463.field3470;
        float var6 = arg0.field3463.field3465 * arg0.field3463.field3465;
        float var7 = arg0.field3463.field3469 * arg0.field3463.field3465;
        float var8 = arg0.field3463.field3470 * arg0.field3463.field3465;
        float var9 = arg0.field3463.field3469 * arg0.field3463.field3469;
        float var10 = arg0.field3463.field3470 * arg0.field3463.field3469;
        float var11 = arg0.field3463.field3470 * arg0.field3463.field3470;
        this.field3453 = var2 + var6 - var11 - var9;
        this.field3452 = var5 + var7 + var7 + var5;
        this.field3456 = var8 - var4 - var4 + var8;
        this.field3454 = var7 - var5 - var5 + var7;
        this.field3451 = var2 + var9 - var6 - var11;
        this.field3462 = var3 + var10 + var10 + var3;
        this.field3457 = var4 + var8 + var8 + var4;
        this.field3461 = var10 - var3 - var3 + var10;
        this.field3459 = var2 + var11 - var9 - var6;
        this.field3460 = arg0.field3464.field3475;
        this.field3450 = arg0.field3464.field3476;
        this.field3458 = arg0.field3464.field3477;
    }

    @ObfuscatedName("kc.s()V")
    public void method5157() {
        this.field3458 = 0.0F;
        this.field3450 = 0.0F;
        this.field3460 = 0.0F;
        this.field3461 = 0.0F;
        this.field3457 = 0.0F;
        this.field3462 = 0.0F;
        this.field3454 = 0.0F;
        this.field3456 = 0.0F;
        this.field3452 = 0.0F;
        this.field3459 = 1.0F;
        this.field3451 = 1.0F;
        this.field3453 = 1.0F;
    }

    @ObfuscatedName("kc.c(FFFFFFFFF)V")
    public void method5103(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        float var10 = arg3 - arg0;
        float var11 = arg4 - arg1;
        float var12 = arg5 - arg2;
        float var13 = arg7 * var12 - arg8 * var11;
        float var14 = arg8 * var10 - arg6 * var12;
        float var15 = arg6 * var11 - arg7 * var10;
        float var16 = (float) (1.0D / Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14)));
        float var17 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var10 * var10 + var11 * var11)));
        this.field3453 = var13 * var16;
        this.field3454 = var14 * var16;
        this.field3457 = var15 * var16;
        this.field3456 = var10 * var17;
        this.field3462 = var11 * var17;
        this.field3459 = var12 * var17;
        this.field3452 = this.field3462 * this.field3457 - this.field3459 * this.field3454;
        this.field3451 = this.field3459 * this.field3453 - this.field3457 * this.field3456;
        this.field3461 = this.field3456 * this.field3454 - this.field3462 * this.field3453;
        this.field3460 = -(this.field3457 * arg2 + this.field3454 * arg1 + this.field3453 * arg0);
        this.field3450 = -(this.field3461 * arg2 + this.field3452 * arg0 + this.field3451 * arg1);
        this.field3458 = -(this.field3459 * arg2 + this.field3462 * arg1 + this.field3456 * arg0);
    }

    @ObfuscatedName("kc.m(IIIFFF)V")
    public void method5188(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5) {
        if (arg0 == 0) {
            this.field3461 = 0.0F;
            this.field3457 = 0.0F;
            this.field3462 = 0.0F;
            this.field3454 = 0.0F;
            this.field3456 = 0.0F;
            this.field3452 = 0.0F;
            this.field3453 = arg1 * 2;
            this.field3451 = arg2 * 2;
            this.field3459 = 1.0F;
            this.field3460 = arg3 - (float) arg1;
            this.field3450 = arg4 - (float) arg2;
            this.field3458 = arg5;
            return;
        }
        float var7 = Trig2.field3449[arg0 & 0x3FFF];
        float var8 = Trig2.field3448[arg0 & 0x3FFF];
        this.field3459 = 1.0F;
        this.field3461 = 0.0F;
        this.field3457 = 0.0F;
        this.field3462 = 0.0F;
        this.field3456 = 0.0F;
        this.field3453 = var7 * 2.0F * (float) arg1;
        this.field3451 = var7 * 2.0F * (float) arg2;
        this.field3452 = var8 * 2.0F * (float) arg1;
        this.field3454 = var8 * -2.0F * (float) arg2;
        this.field3460 = (var8 * 0.5F - var7 * 0.5F) * (float) (arg1 * 2) + arg3;
        this.field3450 = (var8 * -0.5F - var7 * 0.5F) * (float) (arg2 * 2) + arg4;
        this.field3458 = arg5;
    }

    @ObfuscatedName("kc.t(FFFFFFFFF)V")
    public void method5105(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        this.field3453 = arg0;
        this.field3454 = arg3;
        this.field3457 = arg6;
        this.field3460 = 0.0F;
        this.field3452 = arg1;
        this.field3451 = arg4;
        this.field3461 = arg7;
        this.field3450 = 0.0F;
        this.field3456 = arg2;
        this.field3462 = arg5;
        this.field3459 = arg8;
        this.field3458 = 0.0F;
    }

    @ObfuscatedName("kc.l(Lkc;)V")
    public void method5170(Matrix4x3 arg0) {
        if (arg0 == this) {
            this.method5102();
            return;
        }
        this.field3453 = arg0.field3453;
        this.field3454 = arg0.field3452;
        this.field3457 = arg0.field3456;
        this.field3452 = arg0.field3454;
        this.field3451 = arg0.field3451;
        this.field3461 = arg0.field3462;
        this.field3456 = arg0.field3457;
        this.field3462 = arg0.field3461;
        this.field3459 = arg0.field3459;
        this.field3460 = -(this.field3457 * arg0.field3458 + this.field3454 * arg0.field3450 + this.field3453 * arg0.field3460);
        this.field3450 = -(this.field3461 * arg0.field3458 + this.field3452 * arg0.field3460 + this.field3451 * arg0.field3450);
        this.field3458 = -(this.field3459 * arg0.field3458 + this.field3462 * arg0.field3450 + this.field3456 * arg0.field3460);
    }

    @ObfuscatedName("kc.f()V")
    public void method5102() {
        float var1 = this.field3460;
        float var2 = this.field3450;
        float var3 = this.field3454;
        this.field3454 = this.field3452;
        this.field3452 = var3;
        float var4 = this.field3457;
        this.field3457 = this.field3456;
        this.field3456 = var4;
        float var5 = this.field3461;
        this.field3461 = this.field3462;
        this.field3462 = var5;
        this.field3460 = -(this.field3458 * this.field3457 + this.field3454 * var2 + this.field3453 * var1);
        this.field3450 = -(this.field3461 * this.field3458 + this.field3452 * var1 + this.field3451 * var2);
        this.field3458 = -(this.field3459 * this.field3458 + this.field3462 * var2 + this.field3456 * var1);
    }

    @ObfuscatedName("kc.d(FFFF)V")
    public void method5106(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.cos((double) arg3);
        float var6 = (float) Math.sin((double) arg3);
        this.field3453 = arg0 * arg0 * (1.0F - var5) + var5;
        this.field3452 = arg0 * arg1 * (1.0F - var5) + arg2 * var6;
        this.field3456 = arg0 * arg2 * (1.0F - var5) + -arg1 * var6;
        this.field3454 = arg0 * arg1 * (1.0F - var5) + -arg2 * var6;
        this.field3451 = arg1 * arg1 * (1.0F - var5) + var5;
        this.field3462 = arg1 * arg2 * (1.0F - var5) + arg0 * var6;
        this.field3457 = arg0 * arg2 * (1.0F - var5) + arg1 * var6;
        this.field3461 = arg1 * arg2 * (1.0F - var5) + -arg0 * var6;
        this.field3459 = arg2 * arg2 * (1.0F - var5) + var5;
        this.field3458 = 0.0F;
        this.field3450 = 0.0F;
        this.field3460 = 0.0F;
    }

    @ObfuscatedName("kc.z(Lkn;)V")
    public void method5109(Quaternion arg0) {
        this.method5160(arg0.field3465, arg0.field3469, arg0.field3470, arg0.field3471);
    }

    @ObfuscatedName("kc.n(FFFF)V")
    public void method5160(float arg0, float arg1, float arg2, float arg3) {
        float var5 = arg0 * arg0;
        float var6 = arg0 * arg1;
        float var7 = arg0 * arg2;
        float var8 = arg0 * arg3;
        float var9 = arg1 * arg1;
        float var10 = arg1 * arg2;
        float var11 = arg1 * arg3;
        float var12 = arg2 * arg2;
        float var13 = arg2 * arg3;
        this.field3453 = 1.0F - (var9 + var12) * 2.0F;
        this.field3454 = (var6 - var13) * 2.0F;
        this.field3457 = (var7 + var11) * 2.0F;
        this.field3452 = (var6 + var13) * 2.0F;
        this.field3451 = 1.0F - (var5 + var12) * 2.0F;
        this.field3461 = (var10 - var8) * 2.0F;
        this.field3456 = (var7 - var11) * 2.0F;
        this.field3462 = (var8 + var10) * 2.0F;
        this.field3459 = 1.0F - (var5 + var9) * 2.0F;
        this.field3458 = 0.0F;
        this.field3450 = 0.0F;
        this.field3460 = 0.0F;
    }

    @ObfuscatedName("kc.o(FFFF)V")
    public void method5178(float arg0, float arg1, float arg2, float arg3) {
        float var5 = (float) Math.cos((double) arg3);
        float var6 = (float) Math.sin((double) arg3);
        float var7 = arg0 * arg0 * (1.0F - var5) + var5;
        float var8 = arg0 * arg1 * (1.0F - var5) + arg2 * var6;
        float var9 = arg0 * arg2 * (1.0F - var5) + -arg1 * var6;
        float var10 = arg0 * arg1 * (1.0F - var5) + -arg2 * var6;
        float var11 = arg1 * arg1 * (1.0F - var5) + var5;
        float var12 = arg1 * arg2 * (1.0F - var5) + arg0 * var6;
        float var13 = arg0 * arg2 * (1.0F - var5) + arg1 * var6;
        float var14 = arg1 * arg2 * (1.0F - var5) + -arg0 * var6;
        float var15 = arg2 * arg2 * (1.0F - var5) + var5;
        float var16 = this.field3453;
        float var17 = this.field3452;
        float var18 = this.field3454;
        float var19 = this.field3451;
        float var20 = this.field3457;
        float var21 = this.field3461;
        float var22 = this.field3460;
        float var23 = this.field3450;
        this.field3453 = this.field3456 * var13 + var7 * var16 + var10 * var17;
        this.field3452 = this.field3456 * var14 + var8 * var16 + var11 * var17;
        this.field3456 = this.field3456 * var15 + var9 * var16 + var12 * var17;
        this.field3454 = this.field3462 * var13 + var7 * var18 + var10 * var19;
        this.field3451 = this.field3462 * var14 + var8 * var18 + var11 * var19;
        this.field3462 = this.field3462 * var15 + var9 * var18 + var12 * var19;
        this.field3457 = this.field3459 * var13 + var7 * var20 + var10 * var21;
        this.field3461 = this.field3459 * var14 + var8 * var20 + var11 * var21;
        this.field3459 = this.field3459 * var15 + var9 * var20 + var12 * var21;
        this.field3460 = this.field3458 * var13 + var7 * var22 + var10 * var23;
        this.field3450 = this.field3458 * var14 + var8 * var22 + var11 * var23;
        this.field3458 = this.field3458 * var15 + var9 * var22 + var12 * var23;
    }

    @ObfuscatedName("kc.q(FFF)V")
    public void method5112(float arg0, float arg1, float arg2) {
        this.field3453 = arg0;
        this.field3454 = 0.0F;
        this.field3457 = 0.0F;
        this.field3460 = 0.0F;
        this.field3452 = 0.0F;
        this.field3451 = arg1;
        this.field3461 = 0.0F;
        this.field3450 = 0.0F;
        this.field3456 = 0.0F;
        this.field3462 = 0.0F;
        this.field3459 = arg2;
        this.field3458 = 0.0F;
    }

    @ObfuscatedName("kc.p(FFF)V")
    public void method5113(float arg0, float arg1, float arg2) {
        this.field3453 *= arg0;
        this.field3454 *= arg0;
        this.field3457 *= arg0;
        this.field3460 *= arg0;
        this.field3452 *= arg1;
        this.field3451 *= arg1;
        this.field3461 *= arg1;
        this.field3450 *= arg1;
        this.field3456 *= arg2;
        this.field3462 *= arg2;
        this.field3459 *= arg2;
        this.field3458 *= arg2;
    }

    @ObfuscatedName("kc.w(FFF)V")
    public void method5114(float arg0, float arg1, float arg2) {
        this.field3461 = 0.0F;
        this.field3457 = 0.0F;
        this.field3462 = 0.0F;
        this.field3454 = 0.0F;
        this.field3456 = 0.0F;
        this.field3452 = 0.0F;
        this.field3459 = 1.0F;
        this.field3451 = 1.0F;
        this.field3453 = 1.0F;
        this.field3460 = arg0;
        this.field3450 = arg1;
        this.field3458 = arg2;
    }

    @ObfuscatedName("kc.b(Lko;)V")
    public void method5127(Vector3 arg0) {
        this.method5116(arg0.field3475, arg0.field3476, arg0.field3477);
    }

    @ObfuscatedName("kc.x(FFF)V")
    public void method5116(float arg0, float arg1, float arg2) {
        this.field3460 += arg0;
        this.field3450 += arg1;
        this.field3458 += arg2;
    }

    @ObfuscatedName("kc.i(Lkc;)V")
    public void method5117(Matrix4x3 arg0) {
        float var2 = this.field3453;
        float var3 = this.field3452;
        float var4 = this.field3454;
        float var5 = this.field3451;
        float var6 = this.field3457;
        float var7 = this.field3461;
        float var8 = this.field3460;
        float var9 = this.field3450;
        float var10 = this.field3456;
        float var11 = this.field3462;
        float var12 = this.field3459;
        float var13 = this.field3458;
        this.field3453 = arg0.field3457 * var10 + arg0.field3454 * var3 + arg0.field3453 * var2;
        this.field3452 = arg0.field3461 * var10 + arg0.field3452 * var2 + arg0.field3451 * var3;
        this.field3456 = arg0.field3459 * var10 + arg0.field3462 * var3 + arg0.field3456 * var2;
        this.field3454 = arg0.field3457 * var11 + arg0.field3454 * var5 + arg0.field3453 * var4;
        this.field3451 = arg0.field3461 * var11 + arg0.field3452 * var4 + arg0.field3451 * var5;
        this.field3462 = arg0.field3459 * var11 + arg0.field3462 * var5 + arg0.field3456 * var4;
        this.field3457 = arg0.field3457 * var12 + arg0.field3454 * var7 + arg0.field3453 * var6;
        this.field3461 = arg0.field3461 * var12 + arg0.field3452 * var6 + arg0.field3451 * var7;
        this.field3459 = arg0.field3459 * var12 + arg0.field3462 * var7 + arg0.field3456 * var6;
        this.field3460 = arg0.field3457 * var13 + arg0.field3454 * var9 + arg0.field3453 * var8 + arg0.field3460;
        this.field3450 = arg0.field3461 * var13 + arg0.field3452 * var8 + arg0.field3451 * var9 + arg0.field3450;
        this.field3458 = arg0.field3459 * var13 + arg0.field3462 * var9 + arg0.field3456 * var8 + arg0.field3458;
    }

    @ObfuscatedName("kc.v(Lkc;Lkc;)V")
    public void method5118(Matrix4x3 arg0, Matrix4x3 arg1) {
        this.field3453 = arg0.field3456 * arg1.field3457 + arg0.field3453 * arg1.field3453 + arg0.field3452 * arg1.field3454;
        this.field3452 = arg0.field3456 * arg1.field3461 + arg0.field3453 * arg1.field3452 + arg0.field3452 * arg1.field3451;
        this.field3456 = arg0.field3456 * arg1.field3459 + arg0.field3453 * arg1.field3456 + arg0.field3452 * arg1.field3462;
        this.field3454 = arg0.field3462 * arg1.field3457 + arg0.field3454 * arg1.field3453 + arg0.field3451 * arg1.field3454;
        this.field3451 = arg0.field3462 * arg1.field3461 + arg0.field3454 * arg1.field3452 + arg0.field3451 * arg1.field3451;
        this.field3462 = arg0.field3462 * arg1.field3459 + arg0.field3454 * arg1.field3456 + arg0.field3451 * arg1.field3462;
        this.field3457 = arg0.field3459 * arg1.field3457 + arg0.field3461 * arg1.field3454 + arg0.field3457 * arg1.field3453;
        this.field3461 = arg0.field3459 * arg1.field3461 + arg0.field3461 * arg1.field3451 + arg0.field3457 * arg1.field3452;
        this.field3459 = arg0.field3459 * arg1.field3459 + arg0.field3461 * arg1.field3462 + arg0.field3457 * arg1.field3456;
        this.field3460 = arg0.field3458 * arg1.field3457 + arg0.field3460 * arg1.field3453 + arg0.field3450 * arg1.field3454 + arg1.field3460;
        this.field3450 = arg0.field3458 * arg1.field3461 + arg0.field3460 * arg1.field3452 + arg0.field3450 * arg1.field3451 + arg1.field3450;
        this.field3458 = arg0.field3458 * arg1.field3459 + arg0.field3460 * arg1.field3456 + arg0.field3450 * arg1.field3462 + arg1.field3458;
    }

    @ObfuscatedName("kc.k(FFF[F)V")
    public void method5119(float arg0, float arg1, float arg2, float[] arg3) {
        arg3[0] = this.field3457 * arg2 + this.field3454 * arg1 + this.field3453 * arg0 + this.field3460;
        arg3[1] = this.field3461 * arg2 + this.field3452 * arg0 + this.field3451 * arg1 + this.field3450;
        arg3[2] = this.field3459 * arg2 + this.field3462 * arg1 + this.field3456 * arg0 + this.field3458;
    }

    @ObfuscatedName("kc.h(FFF[F)V")
    public void method5120(float arg0, float arg1, float arg2, float[] arg3) {
        float var5 = arg0 - this.field3460;
        float var6 = arg1 - this.field3450;
        float var7 = arg2 - this.field3458;
        arg3[0] = (float) (this.field3456 * var7 + this.field3453 * var5 + this.field3452 * var6);
        arg3[1] = (float) (this.field3462 * var7 + this.field3454 * var5 + this.field3451 * var6);
        arg3[2] = (float) (this.field3459 * var7 + this.field3461 * var6 + this.field3457 * var5);
    }

    @ObfuscatedName("kc.r([F)V")
    public void method5121(float[] arg0) {
        float var2 = arg0[0] - this.field3460;
        float var3 = arg0[1] - this.field3450;
        float var4 = arg0[2] - this.field3458;
        arg0[0] = (float) (this.field3456 * var4 + this.field3453 * var2 + this.field3452 * var3);
        arg0[1] = (float) (this.field3462 * var4 + this.field3454 * var2 + this.field3451 * var3);
        arg0[2] = (float) (this.field3459 * var4 + this.field3461 * var3 + this.field3457 * var2);
    }

    @ObfuscatedName("kc.g([F)V")
    public void method5184(float[] arg0) {
        float var2 = arg0[0];
        float var3 = arg0[1];
        float var4 = arg0[2];
        arg0[0] = this.field3456 * var4 + this.field3453 * var2 + this.field3452 * var3;
        arg0[1] = this.field3462 * var4 + this.field3454 * var2 + this.field3451 * var3;
        arg0[2] = this.field3459 * var4 + this.field3461 * var3 + this.field3457 * var2;
    }

    @ObfuscatedName("kc.y([F)[F")
    public float[] method5123(float[] arg0) {
        arg0[0] = this.field3460;
        arg0[1] = this.field3450;
        arg0[2] = this.field3458;
        return arg0;
    }

    public String toString() {
        return this.field3453 + "," + this.field3454 + "," + this.field3457 + "," + this.field3460 + " - " + this.field3452 + "," + this.field3451 + "," + this.field3461 + "," + this.field3450 + " - " + this.field3456 + "," + this.field3462 + "," + this.field3459 + "," + this.field3458;
    }
}
