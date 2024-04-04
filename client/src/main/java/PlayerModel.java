import deob.ObfuscatedName;

@ObfuscatedName("qc")
public class PlayerModel {

    @ObfuscatedName("qc.s")
    public int field5002;

    @ObfuscatedName("qc.c")
    public int[] field5001;

    @ObfuscatedName("qc.m")
    public ObjTypeCustomisation[] field5011;

    @ObfuscatedName("qc.t")
    public int[] field5000;

    @ObfuscatedName("qc.l")
    public boolean field5005;

    @ObfuscatedName("qc.f")
    public int field5006 = -1;

    @ObfuscatedName("qc.d")
    public long field5007;

    @ObfuscatedName("qc.z")
    public long field5008;

    @ObfuscatedName("qc.q")
    public static final int[] field5003 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};

    @ObfuscatedName("qc.p")
    public static WeightedCache field5012 = new WeightedCache(260);

    @ObfuscatedName("qc.w")
    public static WeightedCache field4998 = new WeightedCache(5);

    @ObfuscatedName("qc.u(I[I[Lvq;[IZIB)V")
    public void method8230(int arg0, int[] arg1, ObjTypeCustomisation[] arg2, int[] arg3, boolean arg4, int arg5) {
        if (this.field5002 != arg0) {
            this.field5002 = arg0;
        }
        this.field5001 = arg1;
        this.field5011 = arg2;
        this.field5000 = arg3;
        this.field5005 = arg4;
        this.field5006 = arg5;
        this.method8229();
    }

    @ObfuscatedName("qc.j(IILgq;S)V")
    public void method8231(int arg0, int arg1, IDKTypeList arg2) {
        int var4 = field5003[arg0];
        if (arg2.method3909(arg1) != null) {
            this.field5001[var4] = arg1 | Integer.MIN_VALUE;
            this.method8229();
        }
    }

    @ObfuscatedName("qc.a(III)V")
    public void method8260(int arg0, int arg1) {
        this.field5000[arg0] = arg1;
        this.method8229();
    }

    @ObfuscatedName("qc.s(ZI)V")
    public void method8233(boolean arg0) {
        this.field5005 = arg0;
        this.method8229();
    }

    @ObfuscatedName("qc.c(IILvj;I)V")
    public void method8234(int arg0, int arg1, ObjTypeList arg2) {
        if (arg1 == -1) {
            this.field5001[arg0] = 0;
        } else if (arg2.get(arg1) == null) {
            return;
        } else {
            this.field5001[arg0] = arg1 | 0x40000000;
            this.method8229();
        }
    }

    @ObfuscatedName("qc.m(I)V")
    public void method8229() {
        long[] var1 = Packet.crc64table;
        this.field5007 = -1L;
        this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (this.field5002 >> 8)) & 0xFFL)];
        this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) this.field5002) & 0xFFL)];
        for (int var2 = 0; var2 < this.field5001.length; var2++) {
            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (this.field5001[var2] >> 24)) & 0xFFL)];
            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (this.field5001[var2] >> 16)) & 0xFFL)];
            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (this.field5001[var2] >> 8)) & 0xFFL)];
            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) this.field5001[var2]) & 0xFFL)];
        }
        if (this.field5011 != null) {
            for (int var3 = 0; var3 < this.field5011.length; var3++) {
                if (this.field5011[var3] != null) {
                    int[] var4;
                    int[] var5;
                    if (this.field5005) {
                        var4 = this.field5011[var3].field7128;
                        var5 = this.field5011[var3].field7126;
                    } else {
                        var4 = this.field5011[var3].field7130;
                        var5 = this.field5011[var3].field7132;
                    }
                    if (var4 != null) {
                        for (int var6 = 0; var6 < var4.length; var6++) {
                            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (var4[var6] >> 8)) & 0xFFL)];
                            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) var4[var6]) & 0xFFL)];
                        }
                    }
                    if (var5 != null) {
                        for (int var7 = 0; var7 < var5.length; var7++) {
                            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (var5[var7] >> 8)) & 0xFFL)];
                            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) var5[var7]) & 0xFFL)];
                        }
                    }
                    if (this.field5011[var3].field7134 != null) {
                        for (int var8 = 0; var8 < this.field5011[var3].field7134.length; var8++) {
                            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (this.field5011[var3].field7134[var8] >> 8)) & 0xFFL)];
                            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) this.field5011[var3].field7134[var8]) & 0xFFL)];
                        }
                    }
                    if (this.field5011[var3].field7135 != null) {
                        for (int var9 = 0; var9 < this.field5011[var3].field7135.length; var9++) {
                            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (this.field5011[var3].field7135[var9] >> 8)) & 0xFFL)];
                            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) this.field5011[var3].field7135[var9]) & 0xFFL)];
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < 10; var10++) {
            this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) this.field5000[var10]) & 0xFFL)];
        }
        this.field5007 = this.field5007 >>> 8 ^ var1[(int) ((this.field5007 ^ (long) (this.field5005 ? 1 : 0)) & 0xFFL)];
    }

    @ObfuscatedName("qc.t(Lra;ILpn;Lgq;Lwi;Lvj;Lst;Lug;Ltt;Ltt;[Ltt;[IIZLrt;B)Lqa;")
    public Model method8244(RendererToolkit arg0, int arg1, BASTypeList arg2, IDKTypeList arg3, NPCTypeList arg4, ObjTypeList arg5, SeqTypeList arg6, VarIntDomain arg7, AnimationNode arg8, AnimationNode arg9, AnimationNode[] arg10, int[] arg11, int arg12, boolean arg13, WearposDefaults arg14) {
        if (this.field5006 != -1) {
            return arg4.method12565(this.field5006).method12510(arg0, arg1, arg2, arg7, arg8, arg9, arg10, arg11, arg12, null);
        }
        int var16 = arg1;
        long var17 = this.field5007;
        int[] var19 = this.field5001;
        boolean var20 = false;
        boolean var21 = false;
        if (arg8 != null) {
            SeqType var22 = arg8.method11804();
            if (var22 != null && (var22.field6326 >= 0 || var22.field6327 >= 0)) {
                var19 = new int[this.field5001.length];
                for (int var23 = 0; var23 < var19.length; var23++) {
                    var19[var23] = this.field5001[var23];
                }
                if (var22.field6326 >= 0 && arg14.field5173 != -1) {
                    var20 = true;
                    if (var22.field6326 == 65535) {
                        var19[arg14.field5173] = 0;
                        for (int var24 = 0; var24 < arg14.field5176.length; var24++) {
                            var19[arg14.field5176[var24]] = 0;
                        }
                        var17 ^= 0xFFFFFFFF00000000L;
                    } else {
                        var19[arg14.field5173] = var22.field6326 | 0x40000000;
                        for (int var25 = 0; var25 < arg14.field5176.length; var25++) {
                            var19[arg14.field5176[var25]] = 0;
                        }
                        var17 ^= (long) var19[arg14.field5173] << 32;
                    }
                }
                if (var22.field6327 >= 0 && arg14.field5174 != -1) {
                    var21 = true;
                    if (var22.field6327 == 65535) {
                        var19[arg14.field5174] = 0;
                        for (int var26 = 0; var26 < arg14.field5172.length; var26++) {
                            var19[arg14.field5172[var26]] = 0;
                        }
                        var17 ^= 0xFFFFFFFFL;
                    } else {
                        var19[arg14.field5174] = var22.field6327 | 0x40000000;
                        for (int var27 = 0; var27 < arg14.field5172.length; var27++) {
                            var19[arg14.field5172[var27]] = 0;
                        }
                        var17 ^= var19[arg14.field5174];
                    }
                }
            }
        }
        boolean var28 = false;
        int var29 = arg10 == null ? 0 : arg10.length;
        for (int var30 = 0; var30 < var29; var30++) {
            if (arg10[var30] != null) {
                var16 |= arg10[var30].method11779();
                var28 = true;
            }
        }
        if (arg8 != null) {
            var16 |= arg8.method11779();
            var28 = true;
        }
        if (arg9 != null) {
            var16 |= arg9.method11779();
            var28 = true;
        }
        boolean var31 = false;
        if (arg11 != null) {
            for (int var32 = 0; var32 < arg11.length; var32++) {
                if (arg11[var32] != -1) {
                    var16 |= 0x20;
                    var31 = true;
                }
            }
        }
        WeightedCache var33 = field5012;
        Model var34;
        synchronized (field5012) {
            var34 = (Model) field5012.method7916(var17);
        }
        BASType var36 = null;
        if (this.field5002 != -1) {
            var36 = arg2.method7784(this.field5002);
        }
        if (var34 == null || arg0.method519(var34.m(), var16) != 0) {
            if (var34 != null) {
                var16 = arg0.method520(var16, var34.m());
            }
            boolean var38 = false;
            int var39 = 0;
            while (true) {
                if (var39 >= var19.length) {
                    if (var38) {
                        if (this.field5008 != -1L) {
                            WeightedCache var45 = field5012;
                            synchronized (field5012) {
                                var34 = (Model) field5012.method7916(this.field5008);
                            }
                        }
                        if (var34 != null && arg0.method519(var34.m(), var16) == 0) {
                            break;
                        }
                        return null;
                    }
                    ModelUnlit[] var47 = new ModelUnlit[var19.length];
                    for (int var48 = 0; var48 < var19.length; var48++) {
                        int var49 = var19[var48];
                        ObjTypeCustomisation var50 = null;
                        boolean var51 = var48 == 5 && var20 || var48 == 3 && var21;
                        if ((var49 & 0x40000000) != 0) {
                            if (!var51 && this.field5011 != null && this.field5011[var48] != null) {
                                var50 = this.field5011[var48];
                            }
                            ModelUnlit var52 = arg5.get(var49 & 0x3FFFFFFF).method12245(this.field5005, var50);
                            if (var52 != null) {
                                var47[var48] = var52;
                            }
                        } else if ((var49 & Integer.MIN_VALUE) != 0) {
                            ModelUnlit var53 = arg3.method3909(var49 & 0x3FFFFFFF).method3890();
                            if (var53 != null) {
                                var47[var48] = var53;
                            }
                        }
                    }
                    if (var36 != null && var36.field4716 != null) {
                        for (int var54 = 0; var54 < var36.field4716.length; var54++) {
                            if (var47[var54] != null) {
                                int var55 = 0;
                                int var56 = 0;
                                int var57 = 0;
                                int var58 = 0;
                                int var59 = 0;
                                int var60 = 0;
                                if (var36.field4716[var54] != null) {
                                    var55 = var36.field4716[var54][0];
                                    var56 = var36.field4716[var54][1];
                                    var57 = var36.field4716[var54][2];
                                    var58 = var36.field4716[var54][3] << 3;
                                    var59 = var36.field4716[var54][4] << 3;
                                    var60 = var36.field4716[var54][5] << 3;
                                }
                                if (var58 != 0 || var59 != 0 || var60 != 0) {
                                    var47[var54].method2633(var58, var59, var60);
                                }
                                if (var55 != 0 || var56 != 0 || var57 != 0) {
                                    var47[var54].method2630(var55, var56, var57);
                                }
                            }
                        }
                    }
                    ModelUnlit var61 = new ModelUnlit(var47, var47.length);
                    int var62 = var16 | 0x4000;
                    var34 = arg0.method625(var61, var62, Statics.field3537, 64, 850);
                    for (int var63 = 0; var63 < 10; var63++) {
                        for (int var64 = 0; var64 < Statics.field5009[var63].length; var64++) {
                            if (this.field5000[var63] < Statics.field5010[var63][var64].length) {
                                var34.X(Statics.field5009[var63][var64], Statics.field5010[var63][var64][this.field5000[var63]]);
                            }
                        }
                    }
                    if (arg13) {
                        var34.KA(var16);
                        WeightedCache var65 = field5012;
                        synchronized (field5012) {
                            field5012.method7937(var34, var17);
                        }
                        this.field5008 = var17;
                    }
                    break;
                }
                int var40 = var19[var39];
                ObjTypeCustomisation var41 = null;
                boolean var42 = false;
                if (var20) {
                    if (arg14.field5173 == var39) {
                        var42 = true;
                    } else {
                        for (int var43 = 0; var43 < arg14.field5176.length; var43++) {
                            if (arg14.field5176[var43] == var39) {
                                var42 = true;
                                break;
                            }
                        }
                    }
                }
                if (var21) {
                    if (arg14.field5174 == var39) {
                        var42 = true;
                    } else {
                        for (int var44 = 0; var44 < arg14.field5172.length; var44++) {
                            if (arg14.field5172[var44] == var39) {
                                var42 = true;
                                break;
                            }
                        }
                    }
                }
                if ((var40 & 0x40000000) != 0) {
                    if (!var42 && this.field5011 != null && this.field5011[var39] != null) {
                        var41 = this.field5011[var39];
                    }
                    if (!arg5.get(var40 & 0x3FFFFFFF).method12246(this.field5005, var41)) {
                        var38 = true;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0 && !arg3.method3909(var40 & 0x3FFFFFFF).method3889()) {
                    var38 = true;
                }
                var39++;
            }
        }
        Model var67 = var34.method295((byte) 4, var16, true);
        if (!var28 && !var31) {
            return var67;
        }
        Matrix4x3[] var68 = null;
        if (var36 != null) {
            var68 = var36.method7750();
        }
        if (var31 && var68 != null) {
            for (int var69 = 0; var69 < arg11.length; var69++) {
                if (var68[var69] != null) {
                    var67.method239(var68[var69], 0x1 << var69, true);
                }
            }
        }
        int var70 = 0;
        int var71 = 1;
        while (var70 < var29) {
            if (arg10[var70] != null) {
                arg10[var70].method11765(var67, 0, var71);
            }
            var70++;
            var71 <<= 0x1;
        }
        if (var31) {
            for (int var72 = 0; var72 < arg11.length; var72++) {
                if (arg11[var72] != -1) {
                    int var73 = arg11[var72] - arg12;
                    int var74 = var73 & 0x3FFF;
                    Matrix4x3 var75 = new Matrix4x3();
                    var75.method5106(0.0F, 1.0F, 0.0F, Trig1.method5096(var74));
                    var67.method239(var75, 0x1 << var72, false);
                }
            }
        }
        if (var31 && var68 != null) {
            for (int var76 = 0; var76 < arg11.length; var76++) {
                if (var68[var76] != null) {
                    var67.method239(var68[var76], 0x1 << var76, false);
                }
            }
        }
        if (arg8 != null && arg9 != null) {
            Statics.method3537(var67, arg8, arg9);
        } else if (arg8 != null) {
            arg8.method11780(var67, 0);
        } else if (arg9 != null) {
            arg9.method11780(var67, 0);
        }
        return var67;
    }

    @ObfuscatedName("qc.l(Lra;ILgq;Lwi;Lvj;Lst;Lug;Ltt;I)Lqa;")
    public Model method8237(RendererToolkit arg0, int arg1, IDKTypeList arg2, NPCTypeList arg3, ObjTypeList arg4, SeqTypeList arg5, VarIntDomain arg6, AnimationNode arg7) {
        if (this.field5006 != -1) {
            return arg3.method12565(this.field5006).method12512(arg0, arg1, arg6, arg7, null);
        }
        int var9 = arg7 == null ? arg1 : arg1 | arg7.method11779();
        WeightedCache var10 = field4998;
        Model var11;
        synchronized (field4998) {
            var11 = (Model) field4998.method7916(this.field5007);
        }
        if (var11 == null || arg0.method519(var11.m(), var9) != 0) {
            if (var11 != null) {
                var9 = arg0.method520(var9, var11.m());
            }
            boolean var14 = false;
            for (int var15 = 0; var15 < this.field5001.length; var15++) {
                int var16 = this.field5001[var15];
                ObjTypeCustomisation var17 = null;
                if ((var16 & 0x40000000) != 0) {
                    if (this.field5011 != null && this.field5011[var15] != null) {
                        var17 = this.field5011[var15];
                    }
                    if (!arg4.get(var16 & 0x3FFFFFFF).method12275(this.field5005, var17)) {
                        var14 = true;
                    }
                } else if ((var16 & Integer.MIN_VALUE) != 0 && !arg2.method3909(var16 & 0x3FFFFFFF).method3891()) {
                    var14 = true;
                }
            }
            if (var14) {
                return null;
            }
            ModelUnlit[] var18 = new ModelUnlit[this.field5001.length];
            int var19 = 0;
            for (int var20 = 0; var20 < this.field5001.length; var20++) {
                int var21 = this.field5001[var20];
                ObjTypeCustomisation var22 = null;
                if ((var21 & 0x40000000) != 0) {
                    if (this.field5011 != null && this.field5011[var20] != null) {
                        var22 = this.field5011[var20];
                    }
                    ModelUnlit var23 = arg4.get(var21 & 0x3FFFFFFF).method12249(this.field5005, var22);
                    if (var23 != null) {
                        var18[var19++] = var23;
                    }
                } else if ((var21 & Integer.MIN_VALUE) != 0) {
                    ModelUnlit var24 = arg2.method3909(var21 & 0x3FFFFFFF).method3892();
                    if (var24 != null) {
                        var18[var19++] = var24;
                    }
                }
            }
            ModelUnlit var25 = new ModelUnlit(var18, var19);
            int var26 = var9 | 0x4000;
            var11 = arg0.method625(var25, var26, Statics.field3537, 64, 768);
            for (int var27 = 0; var27 < 10; var27++) {
                for (int var28 = 0; var28 < Statics.field5009[var27].length; var28++) {
                    if (this.field5000[var27] < Statics.field5010[var27][var28].length) {
                        var11.X(Statics.field5009[var27][var28], Statics.field5010[var27][var28][this.field5000[var27]]);
                    }
                }
            }
            var11.KA(var9);
            WeightedCache var29 = field4998;
            synchronized (field4998) {
                field4998.method7937(var11, this.field5007);
            }
        }
        if (arg7 == null) {
            return var11;
        } else {
            Model var31 = var11.method295((byte) 4, var9, true);
            arg7.method11780(var31, 0);
            return var31;
        }
    }

    @ObfuscatedName("qc.f(Lra;ILgq;Lst;Ltt;IIII)Lqa;")
    public Model method8257(RendererToolkit arg0, int arg1, IDKTypeList arg2, SeqTypeList arg3, AnimationNode arg4, int arg5, int arg6, int arg7) {
        int var9 = arg4 == null ? arg1 : arg1 | arg4.method11779();
        long var10 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg5;
        WeightedCache var12 = field4998;
        Model var13;
        synchronized (field4998) {
            var13 = (Model) field4998.method7916(var10);
        }
        if (var13 == null || arg0.method519(var13.m(), var9) != 0) {
            if (var13 != null) {
                var9 = arg0.method520(var9, var13.m());
            }
            ModelUnlit[] var16 = new ModelUnlit[3];
            int var17 = 0;
            if (!arg2.method3909(arg5).method3891() || !arg2.method3909(arg6).method3891() || !arg2.method3909(arg7).method3891()) {
                return null;
            }
            ModelUnlit var18 = arg2.method3909(arg5).method3892();
            if (var18 != null) {
                var16[var17++] = var18;
            }
            ModelUnlit var19 = arg2.method3909(arg6).method3892();
            if (var19 != null) {
                var16[var17++] = var19;
            }
            ModelUnlit var20 = arg2.method3909(arg7).method3892();
            if (var20 != null) {
                var16[var17++] = var20;
            }
            ModelUnlit var21 = new ModelUnlit(var16, var17);
            int var22 = var9 | 0x4000;
            var13 = arg0.method625(var21, var22, Statics.field3537, 64, 768);
            for (int var23 = 0; var23 < 10; var23++) {
                for (int var24 = 0; var24 < Statics.field5009[var23].length; var24++) {
                    if (this.field5000[var23] < Statics.field5010[var23][var24].length) {
                        var13.X(Statics.field5009[var23][var24], Statics.field5010[var23][var24][this.field5000[var23]]);
                    }
                }
            }
            var13.KA(var9);
            WeightedCache var25 = field4998;
            synchronized (field4998) {
                field4998.method7937(var13, var10);
            }
        }
        if (arg4 == null) {
            return var13;
        } else {
            Model var27 = var13.method295((byte) 4, var9, true);
            arg4.method11780(var27, 0);
            return var27;
        }
    }

    @ObfuscatedName("fd.d(I)I")
    public static int method3503() {
        WeightedCache var0 = field5012;
        synchronized (field5012) {
            return field5012.method7926();
        }
    }

    @ObfuscatedName("c.n(I)V")
    public static void method1323() {
        WeightedCache var0 = field5012;
        synchronized (field5012) {
            field5012.method7922();
        }
        WeightedCache var2 = field4998;
        synchronized (field4998) {
            field4998.method7922();
        }
    }

    @ObfuscatedName("jr.o(IB)V")
    public static void method4781(int arg0) {
        WeightedCache var1 = field5012;
        synchronized (field5012) {
            field5012.method7921(arg0);
        }
        WeightedCache var3 = field4998;
        synchronized (field4998) {
            field4998.method7921(arg0);
        }
    }
}
