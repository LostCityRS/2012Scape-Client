import deob.ObfuscatedName;

@ObfuscatedName("zw")
public class FontRelated1 extends Font {

    @ObfuscatedName("zw.q")
    public PureJavaToolkit field8430;

    @ObfuscatedName("zw.p")
    public byte[][] field8426;

    @ObfuscatedName("zw.w")
    public int[] field8428;

    @ObfuscatedName("zw.b")
    public int[] field8427;

    @ObfuscatedName("zw.x")
    public int[] field8429;

    @ObfuscatedName("zw.i")
    public int[] field8425;

    @ObfuscatedName("zw.v")
    public int[] field8431;

    public FontRelated1(PureJavaToolkit arg0, FontMetrics arg1, PalettedSpriteData[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field8430 = arg0;
        this.field8430 = arg0;
        this.field8427 = arg3;
        this.field8429 = arg4;
        this.field8426 = new byte[arg2.length][];
        this.field8425 = new int[arg2.length];
        this.field8431 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field8426[var6] = arg2[var6].field8408;
            this.field8425[var6] = arg2[var6].field8412;
            this.field8431[var6] = arg2[var6].field8413;
        }
        this.field8428 = arg2[0].field8410;
    }

    @ObfuscatedName("zw.UA(CIIIZ)V")
    public void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field8430.field8001 == null) {
            return;
        }
        int var6 = this.field8431[arg0] + arg1;
        int var7 = this.field8425[arg0] + arg2;
        int var8 = this.field8427[arg0];
        int var9 = this.field8429[arg0];
        int var10 = this.field8430.field8002;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field8430.field8027) {
            int var15 = this.field8430.field8027 - var7;
            var9 -= var15;
            var7 = this.field8430.field8027;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field8430.field8008) {
            var9 -= var7 + var9 - this.field8430.field8008;
        }
        if (var6 < this.field8430.field8005) {
            int var16 = this.field8430.field8005 - var6;
            var8 -= var16;
            var6 = this.field8430.field8005;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field8430.field8024) {
            int var17 = var6 + var8 - this.field8430.field8024;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if (arg4) {
            this.method13855(this.field8426[arg0], this.field8430.field8001, arg3, var14, var11, var8, var9, var12, var13);
        } else {
            this.method13861(this.field8426[arg0], this.field8430.field8001, this.field8428, var14, var11, var8, var9, var12, var13);
        }
    }

    @ObfuscatedName("zw.n([B[I[IIIIIII)V")
    public void method13861(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        boolean var12 = false;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                byte var15;
                if ((var15 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16;
                if ((var16 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var16 & 0xFF];
                }
                byte var17;
                if ((var17 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var17 & 0xFF];
                }
                byte var18;
                if ((var18 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var18 & 0xFF];
                }
            }
            for (int var19 = var11; var19 < 0; var19++) {
                byte var20;
                if ((var20 = arg0[arg3++]) == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2[var20 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @ObfuscatedName("zw.x([B[IIIIIIII)V")
    public void method13855(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @ObfuscatedName("zw.b(CIIIZLta;II)V")
    public void method867(char arg0, int arg1, int arg2, int arg3, boolean arg4, GraphicsRelated arg5, int arg6, int arg7) {
        if (this.field8430.field8001 == null) {
            return;
        }
        if (arg5 == null) {
            this.UA(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field8431[arg0] + arg1;
        int var10 = this.field8425[arg0] + arg2;
        int var11 = this.field8427[arg0];
        int var12 = this.field8429[arg0];
        int var13 = this.field8430.field8002;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field8430.field8027) {
            int var18 = this.field8430.field8027 - var10;
            var12 -= var18;
            var10 = this.field8430.field8027;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field8430.field8008) {
            var12 -= var10 + var12 - this.field8430.field8008;
        }
        if (var9 < this.field8430.field8005) {
            int var19 = this.field8430.field8005 - var9;
            var11 -= var19;
            var9 = this.field8430.field8005;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field8430.field8024) {
            int var20 = var9 + var11 - this.field8430.field8024;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 <= 0 || var12 <= 0) {
            return;
        }
        if (arg4) {
            this.method13857(this.field8426[arg0], this.field8430.field8001, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field8427[arg0], arg5, arg6, arg7);
        } else {
            this.method13856(this.field8426[arg0], this.field8430.field8001, this.field8428, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field8427[arg0], arg5, arg6, arg7);
        }
    }

    @ObfuscatedName("zw.y([B[I[IIIIIIIIIIILta;II)V")
    public void method13856(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, GraphicsRelated arg13, int arg14, int arg15) {
        PureJavaGraphicsRelated var17 = (PureJavaGraphicsRelated) arg13;
        int[] var18 = var17.field7648;
        int[] var19 = var17.field7649;
        int var20 = arg10 - this.field8430.field8005;
        int var21 = arg11;
        if (arg15 > arg11) {
            var21 = arg15;
            arg5 += this.field8430.field8002 * (arg15 - arg11);
            arg4 += (arg15 - arg11) * arg12;
        }
        int var22 = var18.length + arg15 < arg7 + arg11 ? var18.length + arg15 : arg7 + arg11;
        boolean var23 = false;
        for (int var24 = var21; var24 < var22; var24++) {
            int var25 = var18[var24 - arg15] + arg14;
            int var26 = var19[var24 - arg15];
            int var27 = arg6;
            if (var20 > var25) {
                int var28 = var20 - var25;
                if (var28 >= var26) {
                    arg4 += arg6 + arg9;
                    arg5 += arg6 + arg8;
                    continue;
                }
                var26 -= var28;
            } else {
                int var29 = var25 - var20;
                if (var29 >= arg6) {
                    arg4 += arg6 + arg9;
                    arg5 += arg6 + arg8;
                    continue;
                }
                arg4 += var29;
                var27 = arg6 - var29;
                arg5 += var29;
            }
            int var30 = 0;
            if (var27 < var26) {
                var26 = var27;
            } else {
                var30 = var27 - var26;
            }
            for (int var31 = -var26; var31 < 0; var31++) {
                byte var32;
                if ((var32 = arg0[arg4++]) == 0) {
                    arg5++;
                } else {
                    arg1[arg5++] = arg2[var32 & 0xFF];
                }
            }
            arg4 += arg9 + var30;
            arg5 += arg8 + var30;
        }
    }

    @ObfuscatedName("zw.ac([B[IIIIIIIIIIILta;II)V")
    public void method13857(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, GraphicsRelated arg12, int arg13, int arg14) {
        PureJavaGraphicsRelated var16 = (PureJavaGraphicsRelated) arg12;
        int[] var17 = var16.field7648;
        int[] var18 = var16.field7649;
        int var19 = arg9 - this.field8430.field8005;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += this.field8430.field8002 * (arg14 - arg10);
            arg3 += (arg14 - arg10) * arg11;
        }
        int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
        for (int var22 = var20; var22 < var21; var22++) {
            int var23 = var17[var22 - arg14] + arg13;
            int var24 = var18[var22 - arg14];
            int var25 = arg5;
            if (var19 > var23) {
                int var26 = var19 - var23;
                if (var26 >= var24) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                var24 -= var26;
            } else {
                int var27 = var23 - var19;
                if (var27 >= arg5) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                arg3 += var27;
                var25 = arg5 - var27;
                arg4 += var27;
            }
            int var28 = 0;
            if (var25 < var24) {
                var24 = var25;
            } else {
                var28 = var25 - var24;
            }
            for (int var29 = -var24; var29 < 0; var29++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            arg3 += arg3 + var28;
            arg4 += arg7 + var28;
        }
    }
}
