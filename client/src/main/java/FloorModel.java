import deob.ObfuscatedName;

@ObfuscatedName("xa")
public abstract class FloorModel {

    @ObfuscatedName("xa.u")
    public final int field387;

    @ObfuscatedName("xa.j")
    public final int field386;

    @ObfuscatedName("xa.a")
    public final int field385;

    @ObfuscatedName("xa.s")
    public final int field388;

    @ObfuscatedName("xa.c")
    public final int[][] field389;

    public FloorModel(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field387 = arg0;
        this.field386 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field385 = 0x1 << var5;
        this.field388 = var5;
        this.field389 = arg3;
    }

    @ObfuscatedName("xa.c(III)I")
    public final int method196(int arg0, int arg1) {
        int var3 = arg0 >> this.field388;
        int var4 = arg1 >> this.field388;
        if (var3 < 0 || var4 < 0 || var3 > this.field387 - 1 || var4 > this.field386 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field385 - 1;
        int var6 = arg1 & this.field385 - 1;
        int var7 = (this.field385 - var5) * this.field389[var3][var4] + this.field389[var3 + 1][var4] * var5 >> this.field388;
        int var8 = (this.field385 - var5) * this.field389[var3][var4 + 1] + this.field389[var3 + 1][var4 + 1] * var5 >> this.field388;
        return (this.field385 - var6) * var7 + var6 * var8 >> this.field388;
    }

    @ObfuscatedName("xa.m(III)I")
    public final int method199(int arg0, int arg1) {
        return this.field389[arg0][arg1];
    }

    @ObfuscatedName("xa.s(IIIIIII[[Z)V")
    public abstract void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @ObfuscatedName("xa.LA(III)V")
    public abstract void method192(int arg0, int arg1, int arg2);

    @ObfuscatedName("xa.u(II[I[I[I[I[I[I[I[ILdk;Z)V")
    public abstract void method193(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, WaterFogData arg10, boolean arg11);

    @ObfuscatedName("xa.NA(Lna;IIIIZ)V")
    public abstract void method194(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @ObfuscatedName("xa.SA()V")
    public abstract void method195();

    @ObfuscatedName("xa.w(IILna;)Lna;")
    public abstract HardShadow method200(int arg0, int arg1, HardShadow arg2);

    @ObfuscatedName("xa.l(Lna;IIIIZ)Z")
    public abstract boolean method203(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @ObfuscatedName("xa.f(Lacg;[I)V")
    public abstract void method204(Light arg0, int[] arg1);

    @ObfuscatedName("xa.UA(Lna;IIIIZ)V")
    public abstract void method209(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @ObfuscatedName("xa.a(III[[ZZI)V")
    public abstract void method212(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @ObfuscatedName("xa.j(II[I[I[I[I[I[I[I[I[I[I[ILdk;Z)V")
    public abstract void method219(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, WaterFogData arg13, boolean arg14);
}
