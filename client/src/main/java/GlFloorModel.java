import deob.ObfuscatedName;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@ObfuscatedName("yj")
public class GlFloorModel extends FloorModel {

    @ObfuscatedName("yj.l")
    public final GlToolkit field7688;

    @ObfuscatedName("yj.f")
    public int field7689;

    @ObfuscatedName("yj.d")
    public int field7695;

    @ObfuscatedName("yj.z")
    public int field7686;

    @ObfuscatedName("yj.n")
    public final int field7692;

    @ObfuscatedName("yj.o")
    public int field7709;

    @ObfuscatedName("yj.q")
    public int field7694;

    @ObfuscatedName("yj.p")
    public short[][] field7687;

    @ObfuscatedName("yj.w")
    public GlFloorModelRelated1[][][] field7696;

    @ObfuscatedName("yj.b")
    public int[][][] field7691;

    @ObfuscatedName("yj.x")
    public int[][][] field7690;

    @ObfuscatedName("yj.i")
    public int[][][] field7699;

    @ObfuscatedName("yj.v")
    public int[][][] field7718;

    @ObfuscatedName("yj.k")
    public int[][][] field7706;

    @ObfuscatedName("yj.h")
    public int[][][] field7702;

    @ObfuscatedName("yj.r")
    public byte[][] field7711;

    @ObfuscatedName("yj.g")
    public GlFloorModelRelated2 field7704;

    @ObfuscatedName("yj.y")
    public IterableQueue field7705 = new IterableQueue();

    @ObfuscatedName("yj.e")
    public Node[] field7703;

    @ObfuscatedName("yj.ay")
    public GlInterfaceRelated field7707;

    @ObfuscatedName("yj.af")
    public GlRelated1 field7708;

    @ObfuscatedName("yj.ar")
    public GlRelated1 field7715;

    @ObfuscatedName("yj.an")
    public GlRelated1 field7710;

    @ObfuscatedName("yj.ap")
    public GlRelated1 field7701;

    @ObfuscatedName("yj.ag")
    public int field7712;

    @ObfuscatedName("yj.as")
    public int field7713;

    @ObfuscatedName("yj.ai")
    public byte[][] field7700;

    @ObfuscatedName("yj.ao")
    public float[][] field7693;

    @ObfuscatedName("yj.al")
    public float[][] field7716;

    @ObfuscatedName("yj.at")
    public float[][] field7717;

    @ObfuscatedName("yj.ax")
    public IterableMap field7697;

    @ObfuscatedName("yj.aw")
    public static final float[] field7719 = new float[16];

    public GlFloorModel(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7688 = arg0;
        this.field7689 = this.field388 - 2;
        this.field7695 = 0x1 << this.field7689;
        this.field7686 = arg1;
        this.field7692 = arg2;
        this.field7706 = new int[arg3][arg4][];
        this.field7696 = new GlFloorModelRelated1[arg3][arg4][];
        this.field7699 = new int[arg3][arg4][];
        this.field7718 = new int[arg3][arg4][];
        this.field7691 = new int[arg3][arg4][];
        this.field7690 = new int[arg3][arg4][];
        this.field7687 = new short[arg3 * arg4][];
        this.field7711 = new byte[arg3][arg4];
        this.field7700 = new byte[arg3 + 1][arg4 + 1];
        this.field7693 = new float[this.field387 + 1][this.field386 + 1];
        this.field7716 = new float[this.field387 + 1][this.field386 + 1];
        this.field7717 = new float[this.field387 + 1][this.field386 + 1];
        for (int var9 = 1; var9 < this.field386; var9++) {
            for (int var10 = 1; var10 < this.field387; var10++) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field7693[var10][var9] = (float) var11 * var13;
                this.field7716[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field7717[var10][var9] = (float) var12 * var13;
            }
        }
        this.field7697 = new IterableMap(128);
        if ((this.field7692 & 0x10) != 0) {
            this.field7704 = new GlFloorModelRelated2(this.field7688, this);
        }
    }

    @ObfuscatedName("yj.LA(III)V")
    public void method192(int arg0, int arg1, int arg2) {
        if ((this.field7700[arg0][arg1] & 0xFF) < arg2) {
            this.field7700[arg0][arg1] = (byte) arg2;
        }
    }

    @ObfuscatedName("yj.u(II[I[I[I[I[I[I[I[ILdk;Z)V")
    public void method193(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, WaterFogData arg10, boolean arg11) {
        MaterialTypeList var13 = this.field7688.field400;
        if (arg5 != null && this.field7702 == null) {
            this.field7702 = new int[this.field387][this.field386][];
        }
        if (arg3 != null && this.field7706 == null) {
            this.field7706 = new int[this.field387][this.field386][];
        }
        this.field7699[arg0][arg1] = arg2;
        this.field7718[arg0][arg1] = arg4;
        this.field7691[arg0][arg1] = arg6;
        this.field7690[arg0][arg1] = arg7;
        if (this.field7702 != null) {
            this.field7702[arg0][arg1] = arg5;
        }
        if (this.field7706 != null) {
            this.field7706[arg0][arg1] = arg3;
        }
        GlFloorModelRelated1[] var14 = this.field7696[arg0][arg1] = new GlFloorModelRelated1[arg6.length];
        for (int var15 = 0; var15 < arg6.length; var15++) {
            int var16 = arg8[var15];
            int var17 = arg9[var15];
            if ((this.field7692 & 0x20) != 0 && var16 != -1 && var13.method889(var16).field1250) {
                var17 = 128;
                var16 = -1;
            }
            long var18 = (long) arg10.field1474 << 48 | (long) arg10.field1471 << 42 | (long) arg10.field1475 << 28 | (long) (var17 << 14) | (long) var16;
            Node var20;
            for (var20 = this.field7697.method11923(var18); var20 != null; var20 = this.field7697.method11924()) {
                GlFloorModelRelated1 var21 = (GlFloorModelRelated1) var20;
                if (var21.field9343 == var16 && (float) var17 == var21.field9341 && var21.field9345.method2711(arg10)) {
                    break;
                }
            }
            if (var20 == null) {
                var14[var15] = new GlFloorModelRelated1(this, var16, var17, arg10);
                this.field7697.method11927(var14[var15], var18);
            } else {
                var14[var15] = (GlFloorModelRelated1) var20;
            }
        }
        if (arg11) {
            this.field7711[arg0][arg1] = (byte) (this.field7711[arg0][arg1] | 0x1);
        }
        if (arg6.length > this.field7713) {
            this.field7713 = arg6.length;
        }
        this.field7712 += arg6.length;
    }

    @ObfuscatedName("yj.j(II[I[I[I[I[I[I[I[I[I[I[ILdk;Z)V")
    public void method219(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, WaterFogData arg13, boolean arg14) {
        int var16 = arg9.length;
        int[] var17 = new int[var16 * 3];
        int[] var18 = new int[var16 * 3];
        int[] var19 = new int[var16 * 3];
        int[] var20 = arg10 == null ? null : new int[var16 * 3];
        int[] var21 = new int[var16 * 3];
        int[] var22 = new int[var16 * 3];
        int[] var23 = arg3 == null ? null : new int[var16 * 3];
        int[] var24 = arg5 == null ? null : new int[var16 * 3];
        int var25 = 0;
        for (int var26 = 0; var26 < var16; var26++) {
            int var27 = arg6[var26];
            int var28 = arg7[var26];
            int var29 = arg8[var26];
            var17[var25] = arg2[var27];
            var18[var25] = arg4[var27];
            var19[var25] = arg9[var26];
            var21[var25] = arg11[var26];
            var22[var25] = arg12[var26];
            if (arg10 != null) {
                var20[var25] = arg10[var26];
            }
            if (arg3 != null) {
                var23[var25] = arg3[var27];
            }
            if (arg5 != null) {
                var24[var25] = arg5[var27];
            }
            var25++;
            var17[var25] = arg2[var28];
            var18[var25] = arg4[var28];
            var19[var25] = arg9[var26];
            var21[var25] = arg11[var26];
            var22[var25] = arg12[var26];
            if (arg10 != null) {
                var20[var25] = arg10[var26];
            }
            if (arg3 != null) {
                var23[var25] = arg3[var28];
            }
            if (arg5 != null) {
                var24[var25] = arg5[var28];
            }
            var25++;
            var17[var25] = arg2[var29];
            var18[var25] = arg4[var29];
            var19[var25] = arg9[var26];
            var21[var25] = arg11[var26];
            var22[var25] = arg12[var26];
            if (arg10 != null) {
                var20[var25] = arg10[var26];
            }
            if (arg3 != null) {
                var23[var25] = arg3[var29];
            }
            if (arg5 != null) {
                var24[var25] = arg5[var29];
            }
            var25++;
        }
        this.method193(arg0, arg1, var17, var23, var18, var24, var19, var20, var21, var22, arg13, arg14);
    }

    @ObfuscatedName("yj.SA()V")
    public void method195() {
        if (this.field7712 > 0) {
            byte[][] var1 = new byte[this.field387 + 1][this.field386 + 1];
            for (int var2 = 1; var2 < this.field387; var2++) {
                for (int var3 = 1; var3 < this.field386; var3++) {
                    var1[var2][var3] = (byte) ((this.field7700[var2][var3] >> 1) + (this.field7700[var2][var3 + 1] >> 3) + (this.field7700[var2][var3 - 1] >> 2) + (this.field7700[var2 - 1][var3] >> 2) + (this.field7700[var2 + 1][var3] >> 3));
                }
            }
            this.field7703 = new Node[this.field7697.method11926()];
            this.field7697.method11933(this.field7703);
            for (int var4 = 0; var4 < this.field7703.length; var4++) {
                ((GlFloorModelRelated1) this.field7703[var4]).method14874(this.field7712);
            }
            int var5 = 24;
            if (this.field7702 != null) {
                var5 += 4;
            }
            if ((this.field7692 & 0x7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7688.field8094.method70(this.field7712 * var5, false);
            Stream var7 = new Stream(var6);
            GlFloorModelRelated1[] var8 = new GlFloorModelRelated1[this.field7712];
            int var9 = IntMath.method1962(this.field7712 / 4);
            if (var9 < 1) {
                var9 = 1;
            }
            IterableMap var10 = new IterableMap(var9);
            GlFloorModelRelated1[] var11 = new GlFloorModelRelated1[this.field7713];
            for (int var12 = 0; var12 < this.field387; var12++) {
                for (int var13 = 0; var13 < this.field386; var13++) {
                    if (this.field7691[var12][var13] != null) {
                        GlFloorModelRelated1[] var14 = this.field7696[var12][var13];
                        int[] var15 = this.field7699[var12][var13];
                        int[] var16 = this.field7718[var12][var13];
                        int[] var17 = this.field7690[var12][var13];
                        int[] var18 = this.field7691[var12][var13];
                        int[] var19 = this.field7706 == null ? null : this.field7706[var12][var13];
                        int[] var20 = this.field7702 == null ? null : this.field7702[var12][var13];
                        if (var17 == null) {
                            var17 = var18;
                        }
                        float var21 = this.field7693[var12][var13];
                        float var22 = this.field7716[var12][var13];
                        float var23 = this.field7717[var12][var13];
                        float var24 = this.field7693[var12][var13 + 1];
                        float var25 = this.field7716[var12][var13 + 1];
                        float var26 = this.field7717[var12][var13 + 1];
                        float var27 = this.field7693[var12 + 1][var13 + 1];
                        float var28 = this.field7716[var12 + 1][var13 + 1];
                        float var29 = this.field7717[var12 + 1][var13 + 1];
                        float var30 = this.field7693[var12 + 1][var13];
                        float var31 = this.field7716[var12 + 1][var13];
                        float var32 = this.field7717[var12 + 1][var13];
                        int var33 = var1[var12][var13] & 0xFF;
                        int var34 = var1[var12][var13 + 1] & 0xFF;
                        int var35 = var1[var12 + 1][var13 + 1] & 0xFF;
                        int var36 = var1[var12 + 1][var13] & 0xFF;
                        int var37 = 0;
                        label346:
                        for (int var38 = 0; var38 < var18.length; var38++) {
                            GlFloorModelRelated1 var39 = var14[var38];
                            for (int var40 = 0; var40 < var37; var40++) {
                                if (var11[var40] == var39) {
                                    continue label346;
                                }
                            }
                            var11[var37++] = var39;
                        }
                        short[] var41 = this.field7687[this.field387 * var13 + var12] = new short[var18.length];
                        for (int var42 = 0; var42 < var18.length; var42++) {
                            int var43 = (var12 << this.field388) + var15[var42];
                            int var44 = (var13 << this.field388) + var16[var42];
                            int var45 = var43 >> this.field7689;
                            int var46 = var44 >> this.field7689;
                            int var47 = var18[var42];
                            int var48 = var17[var42];
                            int var49 = var19 == null ? 0 : var19[var42];
                            long var50 = (long) var48 << 48 | (long) var47 << 32 | (long) (var45 << 16) | (long) var46;
                            int var52 = var15[var42];
                            int var53 = var16[var42];
                            byte var54 = 74;
                            int var55 = 0;
                            float var56 = 1.0F;
                            float var57;
                            float var58;
                            float var59;
                            int var60;
                            if (var52 == 0 && var53 == 0) {
                                var57 = var21;
                                var58 = var22;
                                var59 = var23;
                                var60 = var54 - var33;
                            } else if (var52 == 0 && this.field385 == var53) {
                                var57 = var24;
                                var58 = var25;
                                var59 = var26;
                                var60 = var54 - var34;
                            } else if (this.field385 == var52 && this.field385 == var53) {
                                var57 = var27;
                                var58 = var28;
                                var59 = var29;
                                var60 = var54 - var35;
                            } else if (this.field385 == var52 && var53 == 0) {
                                var57 = var30;
                                var58 = var31;
                                var59 = var32;
                                var60 = var54 - var36;
                            } else {
                                float var61 = (float) var52 / (float) this.field385;
                                float var62 = (float) var53 / (float) this.field385;
                                float var63 = (var30 - var21) * var61 + var21;
                                float var64 = (var31 - var22) * var61 + var22;
                                float var65 = (var32 - var23) * var61 + var23;
                                float var66 = (var27 - var24) * var61 + var24;
                                float var67 = (var28 - var25) * var61 + var25;
                                float var68 = (var29 - var26) * var61 + var26;
                                var57 = (var66 - var63) * var62 + var63;
                                var58 = (var67 - var64) * var62 + var64;
                                var59 = (var68 - var65) * var62 + var65;
                                int var69 = ((var36 - var33) * var52 >> this.field388) + var33;
                                int var70 = ((var35 - var34) * var52 >> this.field388) + var34;
                                var60 = var54 - (((var70 - var69) * var53 >> this.field388) + var69);
                            }
                            if (var47 != -1) {
                                int var71 = (var47 & 0x7F) * var60 >> 7;
                                if (var71 < 2) {
                                    var71 = 2;
                                } else if (var71 > 126) {
                                    var71 = 126;
                                }
                                var55 = Statics.field5084[var47 & 0xFF80 | var71];
                                if ((this.field7692 & 0x7) == 0) {
                                    float var72 = this.field7688.field8145[2] * var59 + this.field7688.field8145[0] * var57 + this.field7688.field8145[1] * var58;
                                    var56 = this.field7688.field8158 + var72 * (var72 > 0.0F ? this.field7688.field8159 : this.field7688.field8121);
                                }
                            }
                            Node var73 = null;
                            if ((var43 & this.field7695 - 1) == 0 && (var44 & this.field7695 - 1) == 0) {
                                var73 = var10.method11923(var50);
                            }
                            int var84;
                            if (var73 == null) {
                                int var75;
                                if (var47 == var48) {
                                    var75 = var55;
                                } else {
                                    int var74 = (var48 & 0x7F) * var60 >> 7;
                                    if (var74 < 2) {
                                        var74 = 2;
                                    } else if (var74 > 126) {
                                        var74 = 126;
                                    }
                                    var75 = Statics.field5084[var48 & 0xFF80 | var74];
                                    if ((this.field7692 & 0x7) == 0) {
                                        float var76 = this.field7688.field8145[2] * var59 + this.field7688.field8145[0] * var57 + this.field7688.field8145[1] * var58;
                                        float var77 = this.field7688.field8158 + var56 * (var56 > 0.0F ? this.field7688.field8159 : this.field7688.field8121);
                                        int var78 = var75 >> 16 & 0xFF;
                                        int var79 = var75 >> 8 & 0xFF;
                                        int var80 = var75 & 0xFF;
                                        int var81 = (int) ((float) var78 * var77);
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        int var82 = (int) ((float) var79 * var77);
                                        if (var82 < 0) {
                                            var82 = 0;
                                        } else if (var82 > 255) {
                                            var82 = 255;
                                        }
                                        int var83 = (int) ((float) var80 * var77);
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var75 = var81 << 16 | var82 << 8 | var83;
                                    }
                                }
                                if (this.field7688.field8149) {
                                    var7.method39((float) var43);
                                    var7.method39((float) (this.method196(var43, var44) + var49));
                                    var7.method39((float) var44);
                                    var7.method38((byte) (var75 >> 16));
                                    var7.method38((byte) (var75 >> 8));
                                    var7.method38((byte) var75);
                                    var7.method38(-1);
                                    var7.method39((float) var43);
                                    var7.method39((float) var44);
                                    if (this.field7702 != null) {
                                        var7.method39(var20 == null ? 0.0F : (float) (var20[var42] - 1));
                                    }
                                    if ((this.field7692 & 0x7) != 0) {
                                        var7.method39(var57);
                                        var7.method39(var58);
                                        var7.method39(var59);
                                    }
                                } else {
                                    var7.method40((float) var43);
                                    var7.method40((float) (this.method196(var43, var44) + var49));
                                    var7.method40((float) var44);
                                    var7.method38((byte) (var75 >> 16));
                                    var7.method38((byte) (var75 >> 8));
                                    var7.method38((byte) var75);
                                    var7.method38(-1);
                                    var7.method40((float) var43);
                                    var7.method40((float) var44);
                                    if (this.field7702 != null) {
                                        var7.method40(var20 == null ? 0.0F : (float) (var20[var42] - 1));
                                    }
                                    if ((this.field7692 & 0x7) != 0) {
                                        var7.method40(var57);
                                        var7.method40(var58);
                                        var7.method40(var59);
                                    }
                                }
                                var84 = this.field7709++;
                                var41[var42] = (short) var84;
                                if (var47 != -1) {
                                    var8[var84] = var14[var42];
                                }
                                var10.method11927(new class799(var41[var42]), var50);
                            } else {
                                var41[var42] = ((class799) var73).field9551;
                                var84 = var41[var42] & 0xFFFF;
                                if (var47 != -1 && var14[var42].field4228 < var8[var84].field4228) {
                                    var8[var84] = var14[var42];
                                }
                            }
                            for (int var85 = 0; var85 < var37; var85++) {
                                var11[var85].method14860(var84, var55, var60, var56);
                            }
                            this.field7694++;
                        }
                    }
                }
            }
            for (int var86 = 0; var86 < this.field7709; var86++) {
                GlFloorModelRelated1 var87 = var8[var86];
                if (var87 != null) {
                    var87.method14870(var86);
                }
            }
            for (int var88 = 0; var88 < this.field387; var88++) {
                for (int var89 = 0; var89 < this.field386; var89++) {
                    short[] var90 = this.field7687[this.field387 * var89 + var88];
                    if (var90 != null) {
                        int var91 = 0;
                        int var92 = 0;
                        while (var92 < var90.length) {
                            int var93 = var90[var92++] & 0xFFFF;
                            int var94 = var90[var92++] & 0xFFFF;
                            int var95 = var90[var92++] & 0xFFFF;
                            GlFloorModelRelated1 var96 = var8[var93];
                            GlFloorModelRelated1 var97 = var8[var94];
                            GlFloorModelRelated1 var98 = var8[var95];
                            GlFloorModelRelated1 var99 = null;
                            if (var96 != null) {
                                var96.method14866(var88, var89, var91);
                                var99 = var96;
                            }
                            if (var97 != null) {
                                var97.method14866(var88, var89, var91);
                                if (var99 == null || var97.field4228 < var99.field4228) {
                                    var99 = var97;
                                }
                            }
                            if (var98 != null) {
                                var98.method14866(var88, var89, var91);
                                if (var99 == null || var98.field4228 < var99.field4228) {
                                    var99 = var98;
                                }
                            }
                            if (var99 != null) {
                                if (var96 != null) {
                                    var99.method14870(var93);
                                }
                                if (var97 != null) {
                                    var99.method14870(var94);
                                }
                                if (var98 != null) {
                                    var99.method14870(var95);
                                }
                                var99.method14866(var88, var89, var91);
                            }
                            var91++;
                        }
                    }
                }
            }
            var7.method41();
            this.field7707 = this.field7688.method13302(var5, var6, var7.method36(), false);
            if (this.field7707 instanceof class653) {
                var6.method62();
            }
            this.field7708 = new GlRelated1(this.field7707, 5126, 3, 0);
            this.field7715 = new GlRelated1(this.field7707, 5121, 4, 12);
            byte var100;
            if (this.field7702 == null) {
                this.field7701 = new GlRelated1(this.field7707, 5126, 2, 16);
                var100 = 24;
            } else {
                this.field7701 = new GlRelated1(this.field7707, 5126, 3, 16);
                var100 = 28;
            }
            if ((this.field7692 & 0x7) != 0) {
                this.field7710 = new GlRelated1(this.field7707, 5126, 3, var100);
            }
            long[] var101 = new long[this.field7703.length];
            for (int var102 = 0; var102 < this.field7703.length; var102++) {
                GlFloorModelRelated1 var103 = (GlFloorModelRelated1) this.field7703[var102];
                var101[var102] = var103.field4228;
                var103.method14861(this.field7709);
            }
            Algorithms.method11178(var101, this.field7703);
            if (this.field7704 != null) {
                this.field7704.method2276();
            }
        } else {
            this.field7704 = null;
        }
        if ((this.field7686 & 0x2) == 0) {
            this.field7718 = null;
            this.field7699 = null;
            this.field7691 = null;
        }
        this.field7702 = null;
        this.field7690 = null;
        this.field7706 = null;
        this.field7696 = null;
        this.field7700 = null;
        this.field7697 = null;
        this.field7717 = null;
        this.field7716 = null;
        this.field7693 = null;
    }

    @ObfuscatedName("yj.a(III[[ZZI)V")
    public void method212(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method12973(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("yj.t(III[[ZZI)V")
    public void method12973(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        if (this.field7703 == null) {
            return;
        }
        int var7 = arg2 + arg2 + 1;
        int var8 = var7 * var7;
        if (this.field7688.field8229.length < var8) {
            this.field7688.field8229 = new int[var8];
        }
        if (this.field7688.field8226.field9629.length < this.field7694 * 2) {
            this.field7688.field8226 = new GpuPacket(this.field7694 * 2);
        }
        int var9 = arg0 - arg2;
        int var10 = var9;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = arg1 - arg2;
        int var12 = var11;
        if (var11 < 0) {
            var11 = 0;
        }
        int var13 = arg0 + arg2;
        if (var13 > this.field387 - 1) {
            var13 = this.field387 - 1;
        }
        int var14 = arg1 + arg2;
        if (var14 > this.field386 - 1) {
            var14 = this.field386 - 1;
        }
        int var15 = 0;
        int[] var16 = this.field7688.field8229;
        for (int var17 = var9; var17 <= var13; var17++) {
            boolean[] var18 = arg3[var17 - var10];
            for (int var19 = var11; var19 <= var14; var19++) {
                if (var18[var19 - var12]) {
                    var16[var15++] = this.field387 * var19 + var17;
                }
            }
        }
        this.field7688.method13311();
        this.field7688.method13322((this.field7692 & 0x7) != 0);
        for (int var20 = 0; var20 < this.field7703.length; var20++) {
            ((GlFloorModelRelated1) this.field7703[var20]).method14862(var16, var15);
        }
        if (!this.field7705.method11585()) {
            int var21 = this.field7688.field8167;
            int var22 = this.field7688.field8168;
            this.field7688.method532(0, var22, this.field7688.field8169);
            this.field7688.method13322(false);
            this.field7688.method13325(false);
            this.field7688.method13327(128);
            this.field7688.method13312(-2);
            this.field7688.method13315(this.field7688.field8186);
            this.field7688.method13271(8448, 7681);
            this.field7688.method13318(0, 34166, 770);
            this.field7688.method13267(0, 34167, 770);
            for (Node var23 = this.field7705.method11563(); var23 != null; var23 = this.field7705.method11567()) {
                class777 var24 = (class777) var23;
                var24.method14849(arg0, arg1, arg2, arg3);
            }
            this.field7688.method13318(0, 5890, 768);
            this.field7688.method13267(0, 5890, 770);
            this.field7688.method13315(null);
            this.field7688.method532(var21, var22, this.field7688.field8169);
        }
        if (this.field7704 == null) {
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
        this.field7688.method13305(this.field7708, null, null, this.field7701);
        this.field7704.method2277(arg0, arg1, arg2, arg3, arg4);
        OpenGL.glPopMatrix();
    }

    @ObfuscatedName("yj.s(IIIIIII[[Z)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        RenderTarget var9 = this.field7688.method457();
        if (this.field7712 <= 0 || var9 == null) {
            return;
        }
        this.field7688.method13324();
        this.field7688.method13321(false);
        this.field7688.method13322(false);
        this.field7688.method13364(false);
        this.field7688.method13325(false);
        this.field7688.method13327(0);
        this.field7688.method13312(-2);
        this.field7688.method13315(null);
        field7719[0] = (float) arg2 / ((float) this.field385 * 128.0F * (float) var9.method921());
        field7719[1] = 0.0F;
        field7719[2] = 0.0F;
        field7719[3] = 0.0F;
        field7719[4] = 0.0F;
        field7719[5] = (float) arg2 / ((float) this.field385 * 128.0F * (float) var9.method922());
        field7719[6] = 0.0F;
        field7719[7] = 0.0F;
        field7719[8] = 0.0F;
        field7719[9] = 0.0F;
        field7719[10] = 0.0F;
        field7719[11] = 0.0F;
        field7719[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) var9.method921();
        field7719[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) var9.method922();
        field7719[14] = 0.0F;
        field7719[15] = 1.0F;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(field7719, 0);
        field7719[0] = 1.0F;
        field7719[1] = 0.0F;
        field7719[2] = 0.0F;
        field7719[3] = 0.0F;
        field7719[4] = 0.0F;
        field7719[5] = 0.0F;
        field7719[6] = 1.0F;
        field7719[7] = 0.0F;
        field7719[8] = 0.0F;
        field7719[9] = 1.0F;
        field7719[10] = 0.0F;
        field7719[11] = 0.0F;
        field7719[12] = 0.0F;
        field7719[13] = 0.0F;
        field7719[14] = 0.0F;
        field7719[15] = 1.0F;
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadMatrixf(field7719, 0);
        if ((this.field7692 & 0x7) == 0) {
            this.field7688.method13322(false);
        } else {
            this.field7688.method13322(true);
            this.field7688.method13294();
        }
        this.field7688.method13305(this.field7708, this.field7710, this.field7715, this.field7701);
        if (this.field7688.field8226.field9629.length < this.field7694 * 2) {
            this.field7688.field8226 = new GpuPacket(this.field7694 * 2);
        } else {
            this.field7688.field8226.field9626 = 0;
        }
        int var10 = 0;
        GpuPacket var11 = this.field7688.field8226;
        if (this.field7688.field8149) {
            for (int var12 = arg4; var12 < arg6; var12++) {
                int var13 = this.field387 * var12 + arg3;
                for (int var14 = arg3; var14 < arg5; var14++) {
                    if (arg7[var14 - arg3][var12 - arg4]) {
                        short[] var15 = this.field7687[var13];
                        if (var15 != null) {
                            for (int var16 = 0; var16 < var15.length; var16++) {
                                var11.method15287(var15[var16] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var13++;
                }
            }
        } else {
            for (int var17 = arg4; var17 < arg6; var17++) {
                int var18 = this.field387 * var17 + arg3;
                for (int var19 = arg3; var19 < arg5; var19++) {
                    if (arg7[var19 - arg3][var17 - arg4]) {
                        short[] var20 = this.field7687[var18];
                        if (var20 != null) {
                            for (int var21 = 0; var21 < var20.length; var21++) {
                                var11.method15221(var20[var21] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var18++;
                }
            }
        }
        if (var10 > 0) {
            GlFloorModelRelated4_Sub1 var22 = new GlFloorModelRelated4_Sub1(this.field7688, 5123, var11.field9629, var11.field9626);
            this.field7688.method13307(var22, 4, 0, var10);
        }
    }

    @ObfuscatedName("yj.w(IILna;)Lna;")
    public HardShadow method200(int arg0, int arg1, HardShadow arg2) {
        if ((this.field7711[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field385 >> this.field7688.field8092;
        GlHardShadow var5 = (GlHardShadow) arg2;
        GlHardShadow var6;
        if (var5 != null && var5.method17110(var4, var4)) {
            var6 = var5;
            var5.method17118();
        } else {
            var6 = new GlHardShadow(this.field7688, var4, var4);
        }
        var6.method17115(0, 0, var4, var4);
        this.method12975(var6, arg0, arg1);
        return var6;
    }

    @ObfuscatedName("yj.x(Laln;II)V")
    public void method12975(GlHardShadow arg0, int arg1, int arg2) {
        int[] var4 = this.field7699[arg1][arg2];
        int[] var5 = this.field7718[arg1][arg2];
        int var6 = var4.length;
        if (this.field7688.field8041.length < var6) {
            this.field7688.field8041 = new int[var6];
            this.field7688.field8059 = new int[var6];
        }
        int[] var7 = this.field7688.field8041;
        int[] var8 = this.field7688.field8059;
        for (int var9 = 0; var9 < var6; var9++) {
            var7[var9] = var4[var9] >> this.field7688.field8092;
            var8[var9] = var5[var9] >> this.field7688.field8092;
        }
        int var10 = 0;
        while (var10 < var6) {
            int var11 = var7[var10];
            int var12 = var8[var10++];
            int var13 = var7[var10];
            int var14 = var8[var10++];
            int var15 = var7[var10];
            int var16 = var8[var10++];
            if ((var11 - var13) * (var14 - var16) - (var14 - var12) * (var15 - var13) > 0) {
                arg0.method17112(var12, var14, var16, var11, var13, var15);
            }
        }
    }

    @ObfuscatedName("yj.l(Lna;IIIIZ)Z")
    public boolean method203(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field7704 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field7688.field8164 * arg2 >> 8) >> this.field7688.field8092;
            int var8 = arg3 - (this.field7688.field8165 * arg2 >> 8) >> this.field7688.field8092;
            return this.field7704.method2279(arg0, var7, var8);
        }
    }

    @ObfuscatedName("yj.UA(Lna;IIIIZ)V")
    public void method209(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field7704 != null && arg0 != null) {
            int var7 = arg1 - (this.field7688.field8164 * arg2 >> 8) >> this.field7688.field8092;
            int var8 = arg3 - (this.field7688.field8165 * arg2 >> 8) >> this.field7688.field8092;
            this.field7704.method2281(arg0, var7, var8);
        }
    }

    @ObfuscatedName("yj.NA(Lna;IIIIZ)V")
    public void method194(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field7704 != null && arg0 != null) {
            int var7 = arg1 - (this.field7688.field8164 * arg2 >> 8) >> this.field7688.field8092;
            int var8 = arg3 - (this.field7688.field8165 * arg2 >> 8) >> this.field7688.field8092;
            this.field7704.method2287(arg0, var7, var8);
        }
    }

    @ObfuscatedName("yj.f(Lacg;[I)V")
    public void method204(Light arg0, int[] arg1) {
        this.field7705.method11558(new class777(this.field7688, this, arg0, arg1));
    }
}
