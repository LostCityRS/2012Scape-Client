import deob.ObfuscatedName;

@ObfuscatedName("i")
public class i extends FloorModel implements SoftwareRendererRelated {

    public long nativeid;

    @ObfuscatedName("i.m")
    public ja field475;

    @ObfuscatedName("i.t")
    public IterableQueue field476 = new IterableQueue();

    public i(ja arg0, ba arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
        super(arg2, arg3, arg6, arg4);
        this.field475 = arg0;
        this.method1177(this.field475, arg1, arg2, arg3, this.field389, arg5, arg6, arg7, arg8);
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            class111.method2358(this);
        }
    }

    @ObfuscatedName("i.u(II[I[I[I[I[I[I[I[ILdk;Z)V")
    public final void method193(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, WaterFogData arg10, boolean arg11) {
        this.method1178(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10.field1475, arg10.field1471, arg10.field1474, arg11);
    }

    @ObfuscatedName("i.j(II[I[I[I[I[I[I[I[I[I[I[ILdk;Z)V")
    public void method219(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, WaterFogData arg13, boolean arg14) {
        boolean var16 = false;
        if (arg9 != null) {
            int[] var17 = arg9;
            for (int var18 = 0; var18 < var17.length; var18++) {
                int var19 = var17[var18];
                if (var19 != -1) {
                    var16 = true;
                    break;
                }
            }
        }
        int var20 = arg9.length;
        int[] var21 = new int[var20 * 3];
        int[] var22 = new int[var20 * 3];
        int[] var23 = new int[var20 * 3];
        int[] var24 = new int[var20 * 3];
        int[] var25 = new int[var20 * 3];
        int[] var26 = arg10 == null ? null : new int[var20 * 3];
        int[] var27 = arg3 == null ? null : new int[var20 * 3];
        int[] var28 = arg5 == null ? null : new int[var20 * 3];
        int var29 = 0;
        for (int var30 = 0; var30 < var20; var30++) {
            int var31 = arg6[var30];
            int var32 = arg7[var30];
            int var33 = arg8[var30];
            var21[var29] = arg2[var31];
            var22[var29] = arg4[var31];
            var23[var29] = arg9[var30];
            var24[var29] = arg11[var30];
            var25[var29] = arg12[var30];
            if (arg10 != null) {
                var26[var29] = arg10[var30];
            }
            if (arg3 != null) {
                var27[var29] = arg3[var31];
            }
            if (arg5 != null) {
                var28[var29] = arg5[var31];
            }
            var29++;
            var21[var29] = arg2[var32];
            var22[var29] = arg4[var32];
            var23[var29] = arg9[var30];
            var24[var29] = arg11[var30];
            var25[var29] = arg12[var30];
            if (arg10 != null) {
                var26[var29] = arg10[var30];
            }
            if (arg3 != null) {
                var27[var29] = arg3[var32];
            }
            if (arg5 != null) {
                var28[var29] = arg5[var32];
            }
            var29++;
            var21[var29] = arg2[var33];
            var22[var29] = arg4[var33];
            var23[var29] = arg9[var30];
            var24[var29] = arg11[var30];
            var25[var29] = arg12[var30];
            if (arg10 != null) {
                var26[var29] = arg10[var30];
            }
            if (arg3 != null) {
                var27[var29] = arg3[var33];
            }
            if (arg5 != null) {
                var28[var29] = arg5[var33];
            }
            var29++;
        }
        if (var16 || var26 != null) {
            this.method1178(arg0, arg1, var21, var27, var22, var28, var23, var26, var24, var25, arg13.field1475, arg13.field1471, arg13.field1474, arg14);
        }
    }

    @ObfuscatedName("i.a(III[[ZZI)V")
    public void method212(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        int var7 = 0;
        float[] var8 = new float[this.field476.method11613()];
        for (Light var9 = (Light) this.field476.method11563(); var9 != null; var9 = (Light) this.field476.method11567()) {
            var8[var7++] = var9.method14893();
        }
        this.method1180(var8);
        for (int var10 = 0; var10 < arg2 + arg2; var10++) {
            for (int var11 = 0; var11 < arg2 + arg2; var11++) {
                if (arg3[var10][var11]) {
                    int var12 = arg0 - arg2 + var10;
                    int var13 = arg1 - arg2 + var11;
                    if (var12 >= 0 && var12 < this.field387 && var13 >= 0 && var13 < this.field386) {
                        this.field475.method987().method108(this, var12, var13);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.s(IIIIIII[[Z)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        this.field475.method987().method119(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @ObfuscatedName("i.l(Lna;IIIIZ)Z")
    public boolean method203(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return true;
    }

    @ObfuscatedName("i.f(Lacg;[I)V")
    public void method204(Light arg0, int[] arg1) {
        this.field476.method11558(arg0);
        this.method1179(arg0.hashCode(), arg0.method14888(), arg0.method14882(), arg0.method14879(), arg0.method14880(), arg0.method14881(), arg1);
    }

    @ObfuscatedName("i.G(Lja;Lba;II[[I[[IIII)V")
    public native void method1177(ja arg0, ba arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

    @ObfuscatedName("i.ma(Z)V")
    public native void method92(boolean arg0);

    @ObfuscatedName("i.ya(II[I[I[I[I[I[I[I[IIIIZ)V")
    public native void method1178(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @ObfuscatedName("i.SA()V")
    public native void method195();

    @ObfuscatedName("i.w(IILna;)Lna;")
    public native HardShadow method200(int arg0, int arg1, HardShadow arg2);

    @ObfuscatedName("i.NA(Lna;IIIIZ)V")
    public native void method194(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @ObfuscatedName("i.A(IIIIII[I)V")
    public native void method1179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

    @ObfuscatedName("i.LA(III)V")
    public native void method192(int arg0, int arg1, int arg2);

    @ObfuscatedName("i.t([F)V")
    public native void method1180(float[] arg0);

    @ObfuscatedName("i.UA(Lna;IIIIZ)V")
    public native void method209(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
