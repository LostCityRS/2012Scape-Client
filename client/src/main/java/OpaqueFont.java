import deob.ObfuscatedName;

@ObfuscatedName("zb")
public class OpaqueFont extends Font {

    @ObfuscatedName("zb.q")
    public PureJavaToolkit field8435;

    @ObfuscatedName("zb.p")
    public byte[][] field8434;

    @ObfuscatedName("zb.w")
    public int[] field8438;

    @ObfuscatedName("zb.b")
    public int[] field8436;

    @ObfuscatedName("zb.x")
    public int[] field8437;

    @ObfuscatedName("zb.i")
    public int[] field8433;

    public OpaqueFont(PureJavaToolkit arg0, FontMetrics arg1, PalettedSpriteData[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field8435 = arg0;
        this.field8438 = arg3;
        this.field8436 = arg4;
        this.field8434 = new byte[arg2.length][];
        this.field8437 = new int[arg2.length];
        this.field8433 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field8434[var6] = arg2[var6].field8408;
            this.field8437[var6] = arg2[var6].field8412;
            this.field8433[var6] = arg2[var6].field8413;
        }
    }

    @ObfuscatedName("zb.UA(CIIIZ)V")
    public void method848(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field8435.field8001 == null) {
            return;
        }
        int var6 = this.field8433[arg0] + arg1;
        int var7 = this.field8437[arg0] + arg2;
        int var8 = this.field8438[arg0];
        int var9 = this.field8436[arg0];
        int var10 = this.field8435.field8002;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field8435.field8027) {
            int var15 = this.field8435.field8027 - var7;
            var9 -= var15;
            var7 = this.field8435.field8027;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field8435.field8008) {
            var9 -= var7 + var9 - this.field8435.field8008;
        }
        if (var6 < this.field8435.field8005) {
            int var16 = this.field8435.field8005 - var6;
            var8 -= var16;
            var6 = this.field8435.field8005;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field8435.field8024) {
            int var17 = var6 + var8 - this.field8435.field8024;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if ((arg3 & -16777216) == -16777216) {
            this.method13866(this.field8434[arg0], this.field8435.field8001, arg3, var14, var11, var8, var9, var12, var13);
        } else if ((arg3 & 0xFF000000) != 0) {
            this.method13873(this.field8434[arg0], this.field8435.field8001, arg3, var14, var11, var8, var9, var12, var13);
        }
    }

    @ObfuscatedName("zb.n([B[IIIIIIII)V")
    public void method13866(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("zb.x([B[IIIIIIII)V")
    public void method13873(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 >>> 24;
        int var11 = 255 - var10;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = ((arg2 & 0xFF00) * var10 & 0xFF0000) + ((arg2 & 0xFF00FF) * var10 & 0xFF00FF00) >> 8;
                    int var15 = arg1[arg4];
                    arg1[arg4++] = (((var15 & 0xFF00) * var11 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 & 0xFF00FF00) >> 8) + var14;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @ObfuscatedName("zb.b(CIIIZLta;II)V")
    public void method867(char arg0, int arg1, int arg2, int arg3, boolean arg4, GraphicsRelated arg5, int arg6, int arg7) {
        if (this.field8435.field8001 == null) {
            return;
        }
        if (arg5 == null) {
            this.method848(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field8433[arg0] + arg1;
        int var10 = this.field8437[arg0] + arg2;
        int var11 = this.field8438[arg0];
        int var12 = this.field8436[arg0];
        int var13 = this.field8435.field8002;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field8435.field8027) {
            int var18 = this.field8435.field8027 - var10;
            var12 -= var18;
            var10 = this.field8435.field8027;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field8435.field8008) {
            var12 -= var10 + var12 - this.field8435.field8008;
        }
        if (var9 < this.field8435.field8005) {
            int var19 = this.field8435.field8005 - var9;
            var11 -= var19;
            var9 = this.field8435.field8005;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field8435.field8024) {
            int var20 = var9 + var11 - this.field8435.field8024;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 <= 0 || var12 <= 0) {
            return;
        }
        if ((arg3 & -16777216) == -16777216) {
            this.method13869(this.field8434[arg0], this.field8435.field8001, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field8438[arg0], arg5, arg6, arg7);
        } else {
            this.method13868(this.field8434[arg0], this.field8435.field8001, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field8438[arg0], arg5, arg6, arg7);
        }
    }

    @ObfuscatedName("zb.y([B[IIIIIIIIIIILta;II)V")
    public void method13869(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, GraphicsRelated arg12, int arg13, int arg14) {
        PureJavaGraphicsRelated var16 = (PureJavaGraphicsRelated) arg12;
        int[] var17 = var16.field7648;
        int[] var18 = var16.field7649;
        int var19 = arg10;
        if (arg14 > arg10) {
            var19 = arg14;
            arg4 += this.field8435.field8002 * (arg14 - arg10);
            arg3 += (arg14 - arg10) * arg11;
        }
        int var20 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
        for (int var21 = var19; var21 < var20; var21++) {
            int var22 = var17[var21 - arg14] + arg13;
            int var23 = var18[var21 - arg14];
            int var24 = arg5;
            if (arg9 > var22) {
                int var25 = arg9 - var22;
                if (var25 >= var23) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                var23 -= var25;
            } else {
                int var26 = var22 - arg9;
                if (var26 >= arg5) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                arg3 += var26;
                var24 = arg5 - var26;
                arg4 += var26;
            }
            int var27 = 0;
            if (var24 < var23) {
                var23 = var24;
            } else {
                var27 = var24 - var23;
            }
            for (int var28 = 0; var28 < var23; var28++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            arg3 += arg8 + var27;
            arg4 += arg7 + var27;
        }
    }

    @ObfuscatedName("zb.ac([B[IIIIIIIIIIILta;II)V")
    public void method13868(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, GraphicsRelated arg12, int arg13, int arg14) {
        PureJavaGraphicsRelated var16 = (PureJavaGraphicsRelated) arg12;
        int[] var17 = var16.field7648;
        int[] var18 = var16.field7649;
        int var19 = arg9 - this.field8435.field8005;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += this.field8435.field8002 * (arg14 - arg10);
            arg3 += (arg14 - arg10) * arg11;
        }
        int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
        int var22 = arg2 >>> 24;
        int var23 = 255 - var22;
        for (int var24 = var20; var24 < var21; var24++) {
            int var25 = var17[var24 - arg14] + arg13;
            int var26 = var18[var24 - arg14];
            int var27 = arg5;
            if (var19 > var25) {
                int var28 = var19 - var25;
                if (var28 >= var26) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                var26 -= var28;
            } else {
                int var29 = var25 - var19;
                if (var29 >= arg5) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                arg3 += var29;
                var27 = arg5 - var29;
                arg4 += var29;
            }
            int var30 = 0;
            if (var27 < var26) {
                var26 = var27;
            } else {
                var30 = var27 - var26;
            }
            for (int var31 = -var26; var31 < 0; var31++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    int var32 = ((arg2 & 0xFF00FF) * var22 & 0xFF00FF00) + ((arg2 & 0xFF00) * var22 & 0xFF0000) >> 8;
                    int var33 = arg1[arg4];
                    arg1[arg4++] = (((var33 & 0xFF00FF) * var23 & 0xFF00FF00) + ((var33 & 0xFF00) * var23 & 0xFF0000) >> 8) + var32;
                }
            }
            arg3 += arg8 + var30;
            arg4 += arg7 + var30;
        }
    }
}
