import deob.ObfuscatedName;

@ObfuscatedName("ce")
public abstract class Sprite implements FontGlyph {

    @ObfuscatedName("ce.g(II)V")
    public final void method2500(int arg0, int arg1) {
        this.method1054(arg0, arg1, 1, -1, 1);
    }

    @ObfuscatedName("ce.ar(IIII)V")
    public final void method2513(int arg0, int arg1, int arg2, int arg3) {
        this.method1041(arg0, arg1, arg2, arg3, 1, -1, 1, 1);
    }

    @ObfuscatedName("ce.an(IIIIIII)V")
    public final void method2502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1041(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
    }

    @ObfuscatedName("ce.ag(IIII)V")
    public final void method2511(int arg0, int arg1, int arg2, int arg3) {
        this.method1070(arg0, arg1, arg2, arg3, 1, -1, 1);
    }

    @ObfuscatedName("ce.ai(FFII)V")
    public final void method2503(float arg0, float arg1, int arg2, int arg3) {
        this.method2505(arg0, arg1, (float) this.method1042() / 2.0F, (float) this.method1047() / 2.0F, arg2, arg3, 1, -1, 1);
    }

    @ObfuscatedName("ce.ao(FFIIIII)V")
    public final void method2531(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2505(arg0, arg1, (float) this.method1042() / 2.0F, (float) this.method1047() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("ce.al(FFFFIIIII)V")
    public final void method2505(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (--arg2 * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var16 = (((float) this.method1042() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1042() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1047() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (--arg2 * var12 + ((float) this.method1047() - arg3) * var13) / 4096.0F + arg1;
        this.method2504(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @ObfuscatedName("ce.at(FFIILta;II)V")
    public final void method2506(float arg0, float arg1, int arg2, int arg3, GraphicsRelated arg4, int arg5, int arg6) {
        this.method2512(arg0, arg1, (float) this.method1042() / 2.0F, (float) this.method1047() / 2.0F, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("ce.ax(FFFFIILta;II)V")
    public final void method2512(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, GraphicsRelated arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            return;
        }
        double var10 = (double) (arg5 & 0xFFFF) * 9.587379924285257E-5D;
        float var12 = (float) Math.sin(var10) * (float) arg4;
        float var13 = (float) Math.cos(var10) * (float) arg4;
        float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var15 = (--arg2 * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var16 = (((float) this.method1042() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
        float var17 = (-((float) this.method1042() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
        float var18 = (-arg2 * var13 + ((float) this.method1047() - arg3) * var12) / 4096.0F + arg0;
        float var19 = (--arg2 * var12 + ((float) this.method1047() - arg3) * var13) / 4096.0F + arg1;
        this.method2509(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
    }

    @ObfuscatedName("ce.aw(FFFFFFIII)V")
    public final void method2504(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        this.method1060(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
    }

    @ObfuscatedName("ce.ad(FFFFFFLta;II)V")
    public final void method2509(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, GraphicsRelated arg6, int arg7, int arg8) {
        this.method1044(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
    }

    @ObfuscatedName("ce.q(IIII)V")
    public abstract void method1036(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("ce.p([I)V")
    public abstract void method1063(int[] arg0);

    @ObfuscatedName("ce.b()I")
    public abstract int method1042();

    @ObfuscatedName("ce.i()I")
    public abstract int method1045();

    @ObfuscatedName("ce.h(IIIIII)V")
    public abstract void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("ce.r(III)V")
    public abstract void method1052(int arg0, int arg1, int arg2);

    @ObfuscatedName("ce.af(IILta;II)V")
    public abstract void method1056(int arg0, int arg1, GraphicsRelated arg2, int arg3, int arg4);

    @ObfuscatedName("ce.ap(IIIIIIII)V")
    public abstract void method1041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @ObfuscatedName("ce.as(IIIIIII)V")
    public abstract void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("ce.am(FFFFFFIIII)V")
    public abstract void method1060(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

    @ObfuscatedName("ce.az(FFFFFFILta;II)V")
    public abstract void method1044(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, GraphicsRelated arg7, int arg8, int arg9);

    @ObfuscatedName("ce.w()I")
    public abstract int method1061();

    @ObfuscatedName("ce.v()I")
    public abstract int method1047();

    @ObfuscatedName("ce.ay(IIIII)V")
    public abstract void method1054(int arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ce.k()Lde;")
    public abstract GraphicsDeletable method1049();
}
