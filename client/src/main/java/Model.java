import deob.ObfuscatedName;

@ObfuscatedName("qa")
public abstract class Model {

    @ObfuscatedName("qa.j")
    public boolean field391 = false;

    @ObfuscatedName("qa.j(IIIIII[FIF[F)V")
    public void method238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8, float[] arg9) {
        int var11 = arg0 - arg3;
        int var12 = arg1 - arg4;
        int var13 = arg2 - arg5;
        float var14 = arg6[2] * (float) var13 + arg6[0] * (float) var11 + arg6[1] * (float) var12;
        float var15 = arg6[5] * (float) var13 + arg6[3] * (float) var11 + arg6[4] * (float) var12;
        float var16 = arg6[8] * (float) var13 + arg6[6] * (float) var11 + arg6[7] * (float) var12;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F + arg8;
        if (arg7 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg7 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg9[0] = var18;
        arg9[1] = var19;
    }

    @ObfuscatedName("qa.a(IIIIII[FFIF[F)V")
    public void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9, float[] arg10) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg6[2] * (float) var14 + arg6[0] * (float) var12 + arg6[1] * (float) var13;
        float var16 = arg6[5] * (float) var14 + arg6[3] * (float) var12 + arg6[4] * (float) var13;
        float var17 = arg6[8] * (float) var14 + arg6[6] * (float) var12 + arg6[7] * (float) var13;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var18 = arg7 * var18;
        }
        float var19 = var16 + 0.5F + arg9;
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg10[0] = var18;
        arg10[1] = var19;
    }

    @ObfuscatedName("qa.s(FFF)I")
    public int method240(float arg0, float arg1, float arg2) {
        float var4 = arg0 < 0.0F ? -arg0 : arg0;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var5 > var4 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @ObfuscatedName("qa.l(IIIIIII[FIFFF[F)V")
    public void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11, float[] arg12) {
        int var14 = arg0 - arg3;
        int var15 = arg1 - arg4;
        int var16 = arg2 - arg5;
        float var17 = arg7[2] * (float) var16 + arg7[0] * (float) var14 + arg7[1] * (float) var15;
        float var18 = arg7[5] * (float) var16 + arg7[3] * (float) var14 + arg7[4] * (float) var15;
        float var19 = arg7[8] * (float) var16 + arg7[6] * (float) var14 + arg7[7] * (float) var15;
        float var20;
        float var21;
        if (arg6 == 0) {
            var20 = arg9 + var17 + 0.5F;
            var21 = -var19 + arg11 + 0.5F;
        } else if (arg6 == 1) {
            var20 = arg9 + var17 + 0.5F;
            var21 = arg11 + var19 + 0.5F;
        } else if (arg6 == 2) {
            var20 = -var17 + arg9 + 0.5F;
            var21 = -var18 + arg10 + 0.5F;
        } else if (arg6 == 3) {
            var20 = arg9 + var17 + 0.5F;
            var21 = -var18 + arg10 + 0.5F;
        } else if (arg6 == 4) {
            var20 = arg11 + var19 + 0.5F;
            var21 = -var18 + arg10 + 0.5F;
        } else {
            var20 = -var19 + arg11 + 0.5F;
            var21 = -var18 + arg10 + 0.5F;
        }
        if (arg8 == 1) {
            float var22 = var20;
            var20 = -var21;
            var21 = var22;
        } else if (arg8 == 2) {
            var20 = -var20;
            var21 = -var21;
        } else if (arg8 == 3) {
            float var23 = var20;
            var20 = var21;
            var21 = -var23;
        }
        arg12[0] = var20;
        arg12[1] = var21;
    }

    @ObfuscatedName("qa.d(Ldw;[II)Ldt;")
    public ModelRelated1 method349(ModelUnlit arg0, int[] arg1, int arg2) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        float[][] var7 = null;
        if (arg0.field1348 != null) {
            int var8 = arg0.field1334;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];
            for (int var15 = 0; var15 < var8; var15++) {
                var9[var15] = Integer.MAX_VALUE;
                var10[var15] = -2147483647;
                var11[var15] = Integer.MAX_VALUE;
                var12[var15] = -2147483647;
                var13[var15] = Integer.MAX_VALUE;
                var14[var15] = -2147483647;
            }
            for (int var16 = 0; var16 < arg2; var16++) {
                int var17 = arg1[var16];
                if (arg0.field1348[var17] != -1) {
                    int var18 = arg0.field1348[var17] & 0xFF;
                    for (int var19 = 0; var19 < 3; var19++) {
                        short var20;
                        if (var19 == 0) {
                            var20 = arg0.field1322[var17];
                        } else if (var19 == 1) {
                            var20 = arg0.field1323[var17];
                        } else {
                            var20 = arg0.field1324[var17];
                        }
                        int var21 = arg0.field1316[var20];
                        int var22 = arg0.field1320[var20];
                        int var23 = arg0.field1318[var20];
                        if (var21 < var9[var18]) {
                            var9[var18] = var21;
                        }
                        if (var21 > var10[var18]) {
                            var10[var18] = var21;
                        }
                        if (var22 < var11[var18]) {
                            var11[var18] = var22;
                        }
                        if (var22 > var12[var18]) {
                            var12[var18] = var22;
                        }
                        if (var23 < var13[var18]) {
                            var13[var18] = var23;
                        }
                        if (var23 > var14[var18]) {
                            var14[var18] = var23;
                        }
                    }
                }
            }
            var4 = new int[var8];
            var5 = new int[var8];
            var6 = new int[var8];
            var7 = new float[var8][];
            for (int var24 = 0; var24 < var8; var24++) {
                byte var25 = arg0.field1335[var24];
                if (var25 > 0) {
                    var4[var24] = (var9[var24] + var10[var24]) / 2;
                    var5[var24] = (var11[var24] + var12[var24]) / 2;
                    var6[var24] = (var13[var24] + var14[var24]) / 2;
                    float var27;
                    float var28;
                    float var29;
                    if (var25 == 1) {
                        int var26 = arg0.field1339[var24];
                        if (var26 == 0) {
                            var27 = 1.0F;
                            var28 = 1.0F;
                        } else if (var26 > 0) {
                            var27 = 1.0F;
                            var28 = (float) var26 / 1024.0F;
                        } else {
                            var28 = 1.0F;
                            var27 = (float) -var26 / 1024.0F;
                        }
                        var29 = 64.0F / (float) arg0.field1340[var24];
                    } else if (var25 == 2) {
                        var27 = 64.0F / (float) arg0.field1339[var24];
                        var29 = 64.0F / (float) arg0.field1340[var24];
                        var28 = 64.0F / (float) arg0.field1341[var24];
                    } else {
                        var27 = (float) arg0.field1339[var24] / 1024.0F;
                        var29 = (float) arg0.field1340[var24] / 1024.0F;
                        var28 = (float) arg0.field1341[var24] / 1024.0F;
                    }
                    var7[var24] = this.method347(arg0.field1336[var24], arg0.field1337[var24], arg0.field1338[var24], arg0.field1327[var24] & 0xFF, var27, var29, var28);
                }
            }
        }
        return new ModelRelated1(this, var4, var5, var6, var7);
    }

    @ObfuscatedName("qa.z(IIIIFFF)[F")
    public float[] method347(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[3] = 0.0F;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[8] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) -arg2 / var19;
                var15 = (float) arg0 / var19;
            }
            var13[0] = var14 * var14 * var18 + var16;
            var13[1] = var15 * var17;
            var13[2] = var14 * var15 * var18;
            var13[3] = -var15 * var17;
            var13[4] = var16;
            var13[5] = var14 * var17;
            var13[6] = var14 * var15 * var18;
            var13[7] = -var14 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[0] *= arg4;
        var9[1] *= arg4;
        var9[2] *= arg4;
        var9[3] *= arg5;
        var9[4] *= arg5;
        var9[5] *= arg5;
        var9[6] *= arg6;
        var9[7] *= arg6;
        var9[8] *= arg6;
        return var9;
    }

    @ObfuscatedName("qa.v(Lxa;IIIIIII)V")
    public void method256(FloorModel arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        int var12 = -arg4 / 2;
        int var13 = -arg5 / 2;
        int var14 = arg0.getFineHeight(arg1 + var12, arg3 + var13);
        int var15 = arg4 / 2;
        int var16 = -arg5 / 2;
        int var17 = arg0.getFineHeight(arg1 + var15, arg3 + var16);
        int var18 = -arg4 / 2;
        int var19 = arg5 / 2;
        int var20 = arg0.getFineHeight(arg1 + var18, arg3 + var19);
        int var21 = arg4 / 2;
        int var22 = arg5 / 2;
        int var23 = arg0.getFineHeight(arg1 + var21, arg3 + var22);
        int var24 = var14 < var17 ? var14 : var17;
        int var25 = var20 < var23 ? var20 : var23;
        int var26 = var17 < var23 ? var17 : var23;
        int var27 = var14 < var20 ? var14 : var20;
        if (arg5 != 0) {
            int var28 = (int) (Math.atan2((double) (var24 - var25), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg6 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg6;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > arg6) {
                        var28 = arg6;
                    }
                }
                this.t(var28);
            }
        }
        if (arg4 != 0) {
            int var30 = (int) (Math.atan2((double) (var27 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var30 != 0) {
                if (arg7 != 0) {
                    if (var30 > 8192) {
                        int var31 = 16384 - arg7;
                        if (var30 < var31) {
                            var30 = var31;
                        }
                    } else if (var30 > arg7) {
                        var30 = arg7;
                    }
                }
                this.EA(var30);
            }
        }
        int var32 = var14 + var23;
        if (var17 + var20 < var32) {
            var32 = var17 + var20;
        }
        int var33 = (var32 >> 1) - arg2;
        if (var33 != 0) {
            this.ia(0, var33, 0);
        }
    }

    @ObfuscatedName("qa.r(Laje;ILaje;IIIIZ)V")
    public final void method375(FrameSet arg0, int arg1, FrameSet arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg1 == -1) {
            return;
        }
        this.method257();
        if (!this.ea()) {
            this.method407();
            return;
        }
        AnimFrame var9 = arg0.field10350[arg1];
        AnimBase var10 = var9.field1496;
        AnimFrame var11 = null;
        if (arg2 != null) {
            var11 = arg2.field10350[arg3];
            if (var11.field1496 != var10) {
                var11 = null;
            }
        }
        this.method263(var10, var9, var11, arg4, arg5, arg6, null, false, arg7, 65535, null);
        this.ka();
        this.method407();
    }

    @ObfuscatedName("qa.g(Laje;ILaje;IIIIIZ[I)V")
    public final void method260(FrameSet arg0, int arg1, FrameSet arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int[] arg9) {
        if (arg1 == -1) {
            return;
        }
        this.method257();
        if (!this.ea()) {
            this.method407();
            return;
        }
        AnimFrame var11 = arg0.field10350[arg1];
        AnimBase var12 = var11.field1496;
        AnimFrame var13 = null;
        if (arg2 != null) {
            var13 = arg2.field10350[arg3];
            if (var13.field1496 != var12) {
                var13 = null;
            }
        }
        this.method263(var12, var11, var13, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
        this.ka();
        this.method407();
    }

    @ObfuscatedName("qa.ay(Laje;ILaje;IIILaje;ILaje;III[ZZ)V")
    public final void method301(FrameSet arg0, int arg1, FrameSet arg2, int arg3, int arg4, int arg5, FrameSet arg6, int arg7, FrameSet arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
        if (arg1 == -1) {
            return;
        }
        if (arg12 == null || arg7 == -1) {
            this.method375(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
            return;
        }
        this.method257();
        if (!this.ea()) {
            this.method407();
            return;
        }
        AnimFrame var15 = arg0.field10350[arg1];
        AnimBase var16 = var15.field1496;
        AnimFrame var17 = null;
        if (arg2 != null) {
            var17 = arg2.field10350[arg3];
            if (var17.field1496 != var16) {
                var17 = null;
            }
        }
        this.method263(var16, var15, var17, arg4, arg5, 0, arg12, false, arg13, 65535, null);
        AnimFrame var18 = arg6.field10350[arg7];
        AnimFrame var19 = null;
        if (arg8 != null) {
            var19 = arg8.field10350[arg9];
            if (var19.field1496 != var16) {
                var19 = null;
            }
        }
        this.method266(0, new int[0], 0, 0, 0, 0, arg13);
        this.method263(var18.field1496, var18, var19, arg10, arg11, 0, arg12, true, arg13, 65535, null);
        this.ka();
        this.method407();
    }

    @ObfuscatedName("qa.af(Laje;I)V")
    public final void method262(FrameSet arg0, int arg1) {
        if (arg1 == -1) {
            return;
        }
        this.method257();
        if (!this.ea()) {
            this.method407();
            return;
        }
        AnimFrame var3 = arg0.field10350[arg1];
        AnimBase var4 = var3.field1496;
        for (int var5 = 0; var5 < var3.field1485; var5++) {
            short var6 = var3.field1486[var5];
            if (var4.field9361[var6]) {
                if (var3.field1490[var5] != -1) {
                    this.w(0, 0, 0, 0);
                }
                this.w(var4.field9365[var6], var3.field1494[var5], var3.field1481[var5], var3.field1489[var5]);
            }
        }
        this.ka();
        this.method407();
    }

    @ObfuscatedName("qa.ar(Laco;Ldu;Ldu;III[ZZZI[I)V")
    public void method263(AnimBase arg0, AnimFrame arg1, AnimFrame arg2, int arg3, int arg4, int arg5, boolean[] arg6, boolean arg7, boolean arg8, int arg9, int[] arg10) {
        if (arg2 == null || arg3 == 0) {
            for (int var37 = 0; var37 < arg1.field1485; var37++) {
                short var38 = arg1.field1486[var37];
                if (arg6 == null || arg6[var38] == arg7 || arg0.field9365[var38] == 0) {
                    short var39 = arg1.field1490[var37];
                    if (var39 != -1) {
                        this.method264(0, arg0.field9364[var39], 0, 0, 0, arg5, arg8, arg9 & arg0.field9352[var39], arg10);
                    }
                    this.method264(arg0.field9365[var38], arg0.field9364[var38], arg1.field1494[var37], arg1.field1481[var37], arg1.field1489[var37], arg5, arg8, arg9 & arg0.field9352[var38], arg10);
                }
            }
            return;
        }
        int var12 = 0;
        int var13 = 0;
        for (int var14 = 0; var14 < arg0.field9362; var14++) {
            boolean var15 = false;
            if (var12 < arg1.field1485 && arg1.field1486[var12] == var14) {
                var15 = true;
            }
            boolean var16 = false;
            if (var13 < arg2.field1485 && arg2.field1486[var13] == var14) {
                var16 = true;
            }
            if (var15 || var16) {
                if (arg6 == null || arg6[var14] == arg7 || arg0.field9365[var14] == 0) {
                    short var17 = 0;
                    int var18 = arg0.field9365[var14];
                    if (var18 == 3 || var18 == 10) {
                        var17 = 128;
                    }
                    short var19;
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    if (var15) {
                        var19 = arg1.field1494[var12];
                        var20 = arg1.field1481[var12];
                        var21 = arg1.field1489[var12];
                        var22 = arg1.field1490[var12];
                        var23 = arg1.field1488[var12];
                        var12++;
                    } else {
                        var19 = var17;
                        var20 = var17;
                        var21 = var17;
                        var22 = -1;
                        var23 = 0;
                    }
                    short var24;
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    if (var16) {
                        var24 = arg2.field1494[var13];
                        var25 = arg2.field1481[var13];
                        var26 = arg2.field1489[var13];
                        var27 = arg2.field1490[var13];
                        var28 = arg2.field1488[var13];
                        var13++;
                    } else {
                        var24 = var17;
                        var25 = var17;
                        var26 = var17;
                        var27 = -1;
                        var28 = 0;
                    }
                    int var32;
                    int var33;
                    int var34;
                    if ((var23 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var32 = var19;
                        var33 = var20;
                        var34 = var21;
                    } else if (var18 == 2) {
                        int var29 = var24 - var19 & 0x3FFF;
                        int var30 = var25 - var20 & 0x3FFF;
                        int var31 = var26 - var21 & 0x3FFF;
                        if (var29 >= 8192) {
                            var29 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var32 = arg3 * var29 / arg4 + var19 & 0x3FFF;
                        var33 = arg3 * var30 / arg4 + var20 & 0x3FFF;
                        var34 = arg3 * var31 / arg4 + var21 & 0x3FFF;
                    } else if (var18 == 9) {
                        int var35 = var24 - var19 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        var32 = arg3 * var35 / arg4 + var19 & 0x3FFF;
                        var34 = 0;
                        var33 = 0;
                    } else if (var18 == 7) {
                        int var36 = var24 - var19 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var32 = arg3 * var36 / arg4 + var19 & 0x3F;
                        var33 = (var25 - var20) * arg3 / arg4 + var20;
                        var34 = (var26 - var21) * arg3 / arg4 + var21;
                    } else {
                        var32 = (var24 - var19) * arg3 / arg4 + var19;
                        var33 = (var25 - var20) * arg3 / arg4 + var20;
                        var34 = (var26 - var21) * arg3 / arg4 + var21;
                    }
                    if (var22 != -1) {
                        this.method264(0, arg0.field9364[var22], 0, 0, 0, arg5, arg8, arg9 & arg0.field9352[var22], arg10);
                    } else if (var27 != -1) {
                        this.method264(0, arg0.field9364[var27], 0, 0, 0, arg5, arg8, arg9 & arg0.field9352[var27], arg10);
                    }
                    this.method264(var18, arg0.field9364[var14], var32, var33, var34, arg5, arg8, arg9 & arg0.field9352[var14], arg10);
                } else {
                    if (var15) {
                        var12++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("qa.an(I[IIIIIZI[I)V")
    public void method264(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8) {
        if (arg5 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var12 = -arg2;
                arg2 = arg4;
                arg4 = var12;
            } else if (arg0 == 3) {
                int var10 = arg2;
                arg2 = arg4;
                arg4 = var10;
            } else if (arg0 == 2) {
                int var11 = arg2;
                arg2 = -arg4 & 0x3FFF;
                arg4 = var11 & 0x3FFF;
            }
        } else if (arg5 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg2 = -arg2;
                arg4 = -arg4;
            } else if (arg0 == 2) {
                arg2 = -arg2 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg5 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var15 = arg2;
                arg2 = -arg4;
                arg4 = var15;
            } else if (arg0 == 3) {
                int var13 = arg2;
                arg2 = arg4;
                arg4 = var13;
            } else if (arg0 == 2) {
                int var14 = arg2;
                arg2 = arg4 & 0x3FFF;
                arg4 = -var14 & 0x3FFF;
            }
        }
        if (arg7 == 65535) {
            this.method266(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        } else {
            this.e(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
        }
    }

    @ObfuscatedName("qa.ag(Lkc;IZ)V")
    public abstract void method239(Matrix4x3 arg0, int arg1, boolean arg2);

    /**
     * resize: this function is obfuscated because sw3d links to native dll functions
     */
    @ObfuscatedName("qa.oa(III)V")
    public abstract void oa(int arg0, int arg1, int arg2);

    @ObfuscatedName("qa.f(I)V")
    public abstract void f(int arg0);

    @ObfuscatedName("qa.b()V")
    public abstract void method247();

    @ObfuscatedName("qa.S(I)V")
    public abstract void S(int arg0);

    /**
     * setAllowedOperations: this function is obfuscated because sw3d links to native dll functions
     */
    @ObfuscatedName("qa.KA(I)V")
    public abstract void KA(int arg0);

    @ObfuscatedName("qa.wa()V")
    public abstract void wa();

    @ObfuscatedName("qa.pa(IILxa;Lxa;III)V")
    public abstract void pa(int arg0, int arg1, FloorModel arg2, FloorModel arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("qa.k()V")
    public abstract void method257();

    @ObfuscatedName("qa.ap(I[IIIIIZ)V")
    public abstract void method266(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @ObfuscatedName("qa.e(I[IIIIZI[I)V")
    public abstract void e(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @ObfuscatedName("qa.ka()V")
    public abstract void ka();

    @ObfuscatedName("qa.as(Lkc;Ldy;I)V")
    public abstract void method271(Matrix4x3 arg0, ScreenBoundingBox arg1, int arg2);

    @ObfuscatedName("qa.ai(IILkc;ZI)Z")
    public abstract boolean method272(int arg0, int arg1, Matrix4x3 arg2, boolean arg3, int arg4);

    @ObfuscatedName("qa.ga(Lna;)Lna;")
    public abstract HardShadow ga(HardShadow arg0);

    @ObfuscatedName("qa.N()I")
    public abstract int N();

    @ObfuscatedName("qa.n()I")
    public abstract int n();

    @ObfuscatedName("qa.aw()[Ldx;")
    public abstract ModelParticleEmitter[] method276();

    @ObfuscatedName("qa.ya()I")
    public abstract int ya();

    @ObfuscatedName("qa.YA()I")
    public abstract int YA();

    @ObfuscatedName("qa.o()I")
    public abstract int o();

    @ObfuscatedName("qa.AA()I")
    public abstract int AA();

    @ObfuscatedName("qa.ha()I")
    public abstract int ha();

    @ObfuscatedName("qa.p(I)V")
    public abstract void p(int arg0);

    @ObfuscatedName("qa.Q(I)V")
    public abstract void Q(int arg0);

    @ObfuscatedName("qa.EA(I)V")
    public abstract void EA(int arg0);

    @ObfuscatedName("qa.Z()I")
    public abstract int Z();

    /**
     * recolour: this function is obfuscated because sw3d links to native dll functions
     */
    @ObfuscatedName("qa.X(SS)V")
    public abstract void X(short arg0, short arg1);

    @ObfuscatedName("qa.al(B[B)V")
    public abstract void method288(byte arg0, byte[] arg1);

    /**
     * retexture: this function is obfuscated because sw3d links to native dll functions
     */
    @ObfuscatedName("qa.W(SS)V")
    public abstract void W(short arg0, short arg1);

    /**
     * tint: this function is obfuscated because sw3d links to native dll functions
     */
    @ObfuscatedName("qa.PA(IIII)V")
    public abstract void PA(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("qa.at()Z")
    public abstract boolean method291();

    @ObfuscatedName("qa.i()Z")
    public abstract boolean i();

    @ObfuscatedName("qa.u()Z")
    public abstract boolean u();

    @ObfuscatedName("qa.ax(Lkc;)V")
    public abstract void method294(Matrix4x3 arg0);

    @ObfuscatedName("qa.q(BIZ)Lqa;")
    public abstract Model copy(byte arg0, int arg1, boolean arg2);

    @ObfuscatedName("qa.ad(Lqa;IIIZ)V")
    public abstract void method297(Model arg0, int arg1, int arg2, int arg3, boolean arg4);

    @ObfuscatedName("qa.m()I")
    public abstract int m();

    @ObfuscatedName("qa.ao()[B")
    public abstract byte[] ao();

    @ObfuscatedName("qa.w(IIII)V")
    public abstract void w(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("qa.ia(III)V")
    public abstract void ia(int arg0, int arg1, int arg2);

    @ObfuscatedName("qa.RA()I")
    public abstract int RA();

    @ObfuscatedName("qa.t(I)V")
    public abstract void t(int arg0);

    @ObfuscatedName("qa.c()I")
    public abstract int c();

    @ObfuscatedName("qa.h()V")
    public abstract void method407();

    @ObfuscatedName("qa.am()[Lct;")
    public abstract ModelParticleEffector[] method413();

    @ObfuscatedName("qa.ea()Z")
    public abstract boolean ea();
}
