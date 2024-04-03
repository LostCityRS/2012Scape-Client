import deob.ObfuscatedName;
import jaclib.memory.Stream;
import jaggl.OpenGL;

@ObfuscatedName("yz")
public class GlModel extends Model {

    @ObfuscatedName("yz.d")
    public final GlToolkit field7891;

    @ObfuscatedName("yz.z")
    public int field7905;

    @ObfuscatedName("yz.n")
    public int field7857;

    @ObfuscatedName("yz.o")
    public byte field7858;

    @ObfuscatedName("yz.q")
    public short field7859;

    @ObfuscatedName("yz.p")
    public short field7860;

    @ObfuscatedName("yz.w")
    public boolean field7913 = false;

    @ObfuscatedName("yz.b")
    public boolean field7867 = false;

    @ObfuscatedName("yz.x")
    public int field7863 = 0;

    @ObfuscatedName("yz.i")
    public int field7864 = 0;

    @ObfuscatedName("yz.v")
    public int[] field7865;

    @ObfuscatedName("yz.k")
    public int[] field7866;

    @ObfuscatedName("yz.h")
    public int[] field7904;

    @ObfuscatedName("yz.r")
    public int[][] field7868;

    @ObfuscatedName("yz.g")
    public short[] field7869;

    @ObfuscatedName("yz.y")
    public int field7870 = 0;

    @ObfuscatedName("yz.e")
    public short[] field7856;

    @ObfuscatedName("yz.ay")
    public short[] field7872;

    @ObfuscatedName("yz.af")
    public short[] field7873;

    @ObfuscatedName("yz.ar")
    public byte[] field7874;

    @ObfuscatedName("yz.an")
    public GlModelRelated1 field7875;

    @ObfuscatedName("yz.ap")
    public float[] field7876;

    @ObfuscatedName("yz.ag")
    public float[] field7901;

    @ObfuscatedName("yz.as")
    public int field7883 = 0;

    @ObfuscatedName("yz.ai")
    public int field7877 = 0;

    @ObfuscatedName("yz.ao")
    public short[] field7912;

    @ObfuscatedName("yz.al")
    public byte[] field7881;

    @ObfuscatedName("yz.at")
    public short[] field7882;

    @ObfuscatedName("yz.ax")
    public short[] field7902;

    @ObfuscatedName("yz.aw")
    public short[] field7896;

    @ObfuscatedName("yz.aa")
    public short[] field7897;

    @ObfuscatedName("yz.am")
    public int[][] field7886;

    @ObfuscatedName("yz.ad")
    public short[] field7887;

    @ObfuscatedName("yz.az")
    public GlRelated1 field7888;

    @ObfuscatedName("yz.ak")
    public GlRelated1 field7889;

    @ObfuscatedName("yz.av")
    public GlRelated1 field7890;

    @ObfuscatedName("yz.aj")
    public GlRelated1 field7885;

    @ObfuscatedName("yz.ah")
    public GlModelBindingRelated field7892;

    @ObfuscatedName("yz.au")
    public GlBinding field7893;

    @ObfuscatedName("yz.ae")
    public GlInterfaceRelated field7894;

    @ObfuscatedName("yz.ac")
    public boolean field7900 = true;

    @ObfuscatedName("yz.aq")
    public int field7861;

    @ObfuscatedName("yz.ab")
    public int field7850;

    @ObfuscatedName("yz.bq")
    public boolean field7898 = false;

    @ObfuscatedName("yz.bz")
    public short field7899;

    @ObfuscatedName("yz.bv")
    public short field7884;

    @ObfuscatedName("yz.bj")
    public short field7871;

    @ObfuscatedName("yz.bf")
    public short field7880;

    @ObfuscatedName("yz.bt")
    public short field7895;

    @ObfuscatedName("yz.bg")
    public short field7911;

    @ObfuscatedName("yz.bl")
    public int[] field7919;

    @ObfuscatedName("yz.bk")
    public int[] field7906;

    @ObfuscatedName("yz.bs")
    public short[] field7907;

    @ObfuscatedName("yz.bn")
    public ModelParticleEmitter[] field7908;

    @ObfuscatedName("yz.ba")
    public ModelParticleEffector[] field7909;

    @ObfuscatedName("yz.bd")
    public int field7910;

    @ObfuscatedName("yz.bc")
    public GlModelRelated6[] field7903;

    @ObfuscatedName("yz.br")
    public GlModelRelated7[] field7915;

    @ObfuscatedName("yz.bp")
    public int[][] field7878;

    @ObfuscatedName("yz.bx")
    public static float[] field7848 = new float[2];

    @ObfuscatedName("yz.bm")
    public static final int[] field7916 = new int[8];

    @ObfuscatedName("yz.bb")
    public static final int[] field7917 = new int[8];

    @ObfuscatedName("yz.be")
    public static final int[] field7918 = new int[8];

    public GlModel(GlToolkit arg0) {
        this.field7891 = arg0;
        this.field7888 = new GlRelated1(null, 5126, 3, 0);
        this.field7885 = new GlRelated1(null, 5126, 2, 0);
        this.field7890 = new GlRelated1(null, 5126, 3, 0);
        this.field7889 = new GlRelated1(null, 5121, 4, 0);
        this.field7892 = new GlModelBindingRelated();
    }

    public GlModel(GlToolkit arg0, ModelUnlit arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7891 = arg0;
        this.field7905 = arg2;
        this.field7857 = arg5;
        if (GlModelFlags.method2097(arg2, arg5)) {
            this.field7888 = new GlRelated1(null, 5126, 3, 0);
        }
        if (GlModelFlags.method2099(arg2, arg5)) {
            this.field7885 = new GlRelated1(null, 5126, 2, 0);
        }
        if (GlModelFlags.method2098(arg2, arg5)) {
            this.field7890 = new GlRelated1(null, 5126, 3, 0);
        }
        if (GlModelFlags.method2161(arg2, arg5)) {
            this.field7889 = new GlRelated1(null, 5121, 4, 0);
        }
        if (GlModelFlags.method2179(arg2, arg5)) {
            this.field7892 = new GlModelBindingRelated();
        }
        MaterialTypeList var7 = arg0.field400;
        int[] var8 = new int[arg1.field1342];
        this.field7906 = new int[arg1.field1315 + 1];
        for (int var9 = 0; var9 < arg1.field1342; var9++) {
            if (arg1.field1345 == null || arg1.field1345[var9] != 2) {
                if (arg1.field1330 != null && arg1.field1330[var9] != -1) {
                    Material var10 = var7.method889(arg1.field1330[var9] & 0xFFFF);
                    if (((this.field7857 & 0x40) == 0 || !var10.field1250) && var10.field1265) {
                        continue;
                    }
                }
                int var10003 = this.field7883;
                int var10001 = this.field7883;
                this.field7883 = var10003 + 1;
                var8[var10001] = var9;
                this.field7906[arg1.field1322[var9]]++;
                this.field7906[arg1.field1323[var9]]++;
                this.field7906[arg1.field1324[var9]]++;
            }
        }
        this.field7877 = this.field7883;
        long[] var11 = new long[this.field7883];
        boolean var12 = (this.field7905 & 0x100) != 0;
        for (int var13 = 0; var13 < this.field7883; var13++) {
            int var14 = var8[var13];
            Material var15 = null;
            int var16 = 0;
            byte var17 = 0;
            byte var18 = 0;
            byte var19 = 0;
            if (arg1.field1349 != null) {
                boolean var20 = false;
                for (int var21 = 0; var21 < arg1.field1349.length; var21++) {
                    ModelBillboard var22 = arg1.field1349[var21];
                    if (var22.field1513 == var14) {
                        BillboardType var23 = BillboardType.method3666(var22.field1512);
                        if (var23.field2667) {
                            var20 = true;
                        }
                        if (var23.field2661 != -1) {
                            Material var24 = var7.method889(var23.field2661);
                            if (MaterialAlphaMode.field4853 == var24.field1262) {
                                this.field7913 = true;
                            }
                        }
                    }
                }
                if (var20) {
                    var11[var13] = Long.MAX_VALUE;
                    this.field7877--;
                    continue;
                }
            }
            short var25 = -1;
            if (arg1.field1330 != null) {
                var25 = arg1.field1330[var14];
                if (var25 != -1) {
                    var15 = var7.method889(var25 & 0xFFFF);
                    if ((this.field7857 & 0x40) != 0 && var15.field1250) {
                        var25 = -1;
                        var15 = null;
                    } else {
                        var18 = var15.field1270;
                        var19 = var15.field1248;
                        if (var15.field1268 != 0 || var15.field1261 != 0) {
                            this.field7867 = true;
                        }
                    }
                }
            }
            boolean var26 = arg1.field1332 != null && arg1.field1332[var14] != 0 || var15 != null && MaterialAlphaMode.field4854 != var15.field1262;
            if ((var12 || var26) && arg1.field1326 != null) {
                var16 += arg1.field1326[var14] << 17;
            }
            if (var26) {
                var16 += 65536;
            }
            int var27 = ((var18 & 0xFF) << 8) + var16;
            int var28 = (var19 & 0xFF) + var27;
            int var29 = ((var25 & 0xFFFF) << 16) + var17;
            int var30 = (var13 & 0xFFFF) + var29;
            var11[var13] = ((long) var28 << 32) + (long) var30;
            this.field7913 |= var26;
            this.field7867 |= var15 != null && (var15.field1268 != 0 || var15.field1261 != 0);
        }
        Algorithms.method12650(var11, var8);
        this.field7863 = arg1.field1328;
        this.field7864 = arg1.field1315;
        this.field7865 = arg1.field1316;
        this.field7866 = arg1.field1320;
        this.field7904 = arg1.field1318;
        this.field7869 = arg1.field1321;
        GlVertexNormal[] var31 = new GlVertexNormal[this.field7864];
        this.field7908 = arg1.field1347;
        this.field7909 = arg1.field1346;
        if (arg1.field1349 != null) {
            this.field7910 = arg1.field1349.length;
            this.field7903 = new GlModelRelated6[this.field7910];
            this.field7915 = new GlModelRelated7[this.field7910];
            for (int var32 = 0; var32 < this.field7910; var32++) {
                ModelBillboard var33 = arg1.field1349[var32];
                BillboardType var34 = BillboardType.method3666(var33.field1512);
                int var35 = -1;
                for (int var36 = 0; var36 < this.field7883; var36++) {
                    if (var33.field1513 == var8[var36]) {
                        var35 = var36;
                        break;
                    }
                }
                if (var35 == -1) {
                    throw new RuntimeException();
                }
                int var37 = Statics.field5084[arg1.field1329[var33.field1513] & 0xFFFF] & 0xFFFFFF;
                int var38 = var37 | 255 - (arg1.field1332 == null ? 0 : arg1.field1332[var33.field1513]) << 24;
                this.field7903[var32] = new GlModelRelated6(var35, arg1.field1322[var33.field1513], arg1.field1323[var33.field1513], arg1.field1324[var33.field1513], var34.field2658, var34.field2662, var34.field2661, var34.field2665, var34.field2664, var34.field2667, var34.field2666, var33.field1514);
                this.field7915[var32] = new GlModelRelated7(var38);
            }
        }
        int var39 = this.field7883 * 3;
        this.field7856 = new short[var39];
        this.field7872 = new short[var39];
        this.field7873 = new short[var39];
        this.field7874 = new byte[var39];
        this.field7876 = new float[var39];
        this.field7901 = new float[var39];
        this.field7912 = new short[this.field7883];
        this.field7881 = new byte[this.field7883];
        this.field7882 = new short[this.field7883];
        this.field7902 = new short[this.field7883];
        this.field7896 = new short[this.field7883];
        this.field7897 = new short[this.field7883];
        if (arg1.field1333 != null) {
            this.field7887 = new short[this.field7883];
        }
        this.field7859 = (short) arg3;
        this.field7860 = (short) arg4;
        this.field7907 = new short[var39];
        Statics.field7914 = new long[var39];
        int var40 = 0;
        for (int var41 = 0; var41 < arg1.field1315; var41++) {
            int var42 = this.field7906[var41];
            this.field7906[var41] = var40;
            var40 += var42;
            var31[var41] = new GlVertexNormal();
        }
        this.field7906[arg1.field1315] = var40;
        ModelRelated1 var43 = this.method349(arg1, var8, this.field7883);
        TriangleNormal[] var44 = new TriangleNormal[arg1.field1342];
        for (int var45 = 0; var45 < arg1.field1342; var45++) {
            short var46 = arg1.field1322[var45];
            short var47 = arg1.field1323[var45];
            short var48 = arg1.field1324[var45];
            int var49 = this.field7865[var47] - this.field7865[var46];
            int var50 = this.field7866[var47] - this.field7866[var46];
            int var51 = this.field7904[var47] - this.field7904[var46];
            int var52 = this.field7865[var48] - this.field7865[var46];
            int var53 = this.field7866[var48] - this.field7866[var46];
            int var54 = this.field7904[var48] - this.field7904[var46];
            int var55 = var50 * var54 - var51 * var53;
            int var56 = var51 * var52 - var49 * var54;
            int var57;
            for (var57 = var49 * var53 - var50 * var52; var55 > 8192 || var56 > 8192 || var57 > 8192 || var55 < -8192 || var56 < -8192 || var57 < -8192; var57 >>= 0x1) {
                var55 >>= 0x1;
                var56 >>= 0x1;
            }
            int var58 = (int) Math.sqrt((double) (var57 * var57 + var55 * var55 + var56 * var56));
            if (var58 <= 0) {
                var58 = 1;
            }
            int var59 = var55 * 256 / var58;
            int var60 = var56 * 256 / var58;
            int var61 = var57 * 256 / var58;
            byte var62 = arg1.field1345 == null ? 0 : arg1.field1345[var45];
            if (var62 == 0) {
                GlVertexNormal var63 = var31[var46];
                var63.field1104 += var59;
                var63.field1101 += var60;
                var63.field1103 += var61;
                var63.field1102++;
                GlVertexNormal var64 = var31[var47];
                var64.field1104 += var59;
                var64.field1101 += var60;
                var64.field1103 += var61;
                var64.field1102++;
                GlVertexNormal var65 = var31[var48];
                var65.field1104 += var59;
                var65.field1101 += var60;
                var65.field1103 += var61;
                var65.field1102++;
            } else if (var62 == 1) {
                TriangleNormal var66 = var44[var45] = new TriangleNormal();
                var66.field1075 = var59;
                var66.field1074 = var60;
                var66.field1076 = var61;
            }
        }
        for (int var67 = 0; var67 < this.field7883; var67++) {
            int var68 = var8[var67];
            int var69 = arg1.field1329[var68] & 0xFFFF;
            int var70;
            if (arg1.field1348 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field1348[var68];
            }
            int var71;
            if (arg1.field1332 == null) {
                var71 = 0;
            } else {
                var71 = arg1.field1332[var68] & 0xFF;
            }
            short var72 = arg1.field1330 == null ? -1 : arg1.field1330[var68];
            if (var72 != -1 && (this.field7857 & 0x40) != 0) {
                Material var73 = var7.method889(var72 & 0xFFFF);
                if (var73.field1250) {
                    var72 = -1;
                }
            }
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            float var79 = 0.0F;
            byte var80 = 0;
            byte var81 = 0;
            int var82 = 0;
            if (var72 != -1) {
                if (var70 == -1) {
                    var74 = 0.0F;
                    var75 = 1.0F;
                    var76 = 1.0F;
                    var77 = 1.0F;
                    var80 = 1;
                    var78 = 0.0F;
                    var79 = 0.0F;
                    var81 = 2;
                } else {
                    var70 &= 0xFF;
                    byte var83 = arg1.field1335[var70];
                    if (var83 == 0) {
                        short var84 = arg1.field1322[var68];
                        short var85 = arg1.field1323[var68];
                        short var86 = arg1.field1324[var68];
                        short var87 = arg1.field1336[var70];
                        short var88 = arg1.field1337[var70];
                        short var89 = arg1.field1338[var70];
                        float var90 = (float) arg1.field1316[var87];
                        float var91 = (float) arg1.field1320[var87];
                        float var92 = (float) arg1.field1318[var87];
                        float var93 = (float) arg1.field1316[var88] - var90;
                        float var94 = (float) arg1.field1320[var88] - var91;
                        float var95 = (float) arg1.field1318[var88] - var92;
                        float var96 = (float) arg1.field1316[var89] - var90;
                        float var97 = (float) arg1.field1320[var89] - var91;
                        float var98 = (float) arg1.field1318[var89] - var92;
                        float var99 = (float) arg1.field1316[var84] - var90;
                        float var100 = (float) arg1.field1320[var84] - var91;
                        float var101 = (float) arg1.field1318[var84] - var92;
                        float var102 = (float) arg1.field1316[var85] - var90;
                        float var103 = (float) arg1.field1320[var85] - var91;
                        float var104 = (float) arg1.field1318[var85] - var92;
                        float var105 = (float) arg1.field1316[var86] - var90;
                        float var106 = (float) arg1.field1320[var86] - var91;
                        float var107 = (float) arg1.field1318[var86] - var92;
                        float var108 = var94 * var98 - var95 * var97;
                        float var109 = var95 * var96 - var93 * var98;
                        float var110 = var93 * var97 - var94 * var96;
                        float var111 = var97 * var110 - var98 * var109;
                        float var112 = var98 * var108 - var96 * var110;
                        float var113 = var96 * var109 - var97 * var108;
                        float var114 = 1.0F / (var95 * var113 + var93 * var111 + var94 * var112);
                        var74 = (var101 * var113 + var99 * var111 + var100 * var112) * var114;
                        var76 = (var104 * var113 + var102 * var111 + var103 * var112) * var114;
                        var78 = (var107 * var113 + var105 * var111 + var106 * var112) * var114;
                        float var115 = var94 * var110 - var95 * var109;
                        float var116 = var95 * var108 - var93 * var110;
                        float var117 = var93 * var109 - var94 * var108;
                        float var118 = 1.0F / (var98 * var117 + var96 * var115 + var97 * var116);
                        var75 = (var101 * var117 + var99 * var115 + var100 * var116) * var118;
                        var77 = (var104 * var117 + var102 * var115 + var103 * var116) * var118;
                        var79 = (var107 * var117 + var105 * var115 + var106 * var116) * var118;
                    } else {
                        short var119 = arg1.field1322[var68];
                        short var120 = arg1.field1323[var68];
                        short var121 = arg1.field1324[var68];
                        int var122 = var43.field1523[var70];
                        int var123 = var43.field1522[var70];
                        int var124 = var43.field1524[var70];
                        float[] var125 = var43.field1525[var70];
                        byte var126 = arg1.field1325[var70];
                        float var127 = (float) arg1.field1317[var70] / 256.0F;
                        if (var83 == 1) {
                            float var128 = (float) arg1.field1341[var70] / 1024.0F;
                            this.method416(arg1.field1316[var119], arg1.field1320[var119], arg1.field1318[var119], var122, var123, var124, var125, var128, var126, var127, field7848);
                            var74 = field7848[0];
                            var75 = field7848[1];
                            this.method416(arg1.field1316[var120], arg1.field1320[var120], arg1.field1318[var120], var122, var123, var124, var125, var128, var126, var127, field7848);
                            var76 = field7848[0];
                            var77 = field7848[1];
                            this.method416(arg1.field1316[var121], arg1.field1320[var121], arg1.field1318[var121], var122, var123, var124, var125, var128, var126, var127, field7848);
                            var78 = field7848[0];
                            var79 = field7848[1];
                            float var129 = var128 / 2.0F;
                            if ((var126 & 0x1) == 0) {
                                if (var76 - var74 > var129) {
                                    var76 -= var128;
                                    var80 = 1;
                                } else if (var74 - var76 > var129) {
                                    var76 += var128;
                                    var80 = 2;
                                }
                                if (var78 - var74 > var129) {
                                    var78 -= var128;
                                    var81 = 1;
                                } else if (var74 - var78 > var129) {
                                    var78 += var128;
                                    var81 = 2;
                                }
                            } else {
                                if (var77 - var75 > var129) {
                                    var77 -= var128;
                                    var80 = 1;
                                } else if (var75 - var77 > var129) {
                                    var77 += var128;
                                    var80 = 2;
                                }
                                if (var79 - var75 > var129) {
                                    var79 -= var128;
                                    var81 = 1;
                                } else if (var75 - var79 > var129) {
                                    var79 += var128;
                                    var81 = 2;
                                }
                            }
                        } else if (var83 == 2) {
                            float var130 = (float) arg1.field1343[var70] / 256.0F;
                            float var131 = (float) arg1.field1344[var70] / 256.0F;
                            int var132 = arg1.field1316[var120] - arg1.field1316[var119];
                            int var133 = arg1.field1320[var120] - arg1.field1320[var119];
                            int var134 = arg1.field1318[var120] - arg1.field1318[var119];
                            int var135 = arg1.field1316[var121] - arg1.field1316[var119];
                            int var136 = arg1.field1320[var121] - arg1.field1320[var119];
                            int var137 = arg1.field1318[var121] - arg1.field1318[var119];
                            int var138 = var133 * var137 - var134 * var136;
                            int var139 = var134 * var135 - var132 * var137;
                            int var140 = var132 * var136 - var133 * var135;
                            float var141 = 64.0F / (float) arg1.field1339[var70];
                            float var142 = 64.0F / (float) arg1.field1340[var70];
                            float var143 = 64.0F / (float) arg1.field1341[var70];
                            float var144 = (var125[2] * (float) var140 + var125[0] * (float) var138 + var125[1] * (float) var139) / var141;
                            float var145 = (var125[5] * (float) var140 + var125[3] * (float) var138 + var125[4] * (float) var139) / var142;
                            float var146 = (var125[8] * (float) var140 + var125[6] * (float) var138 + var125[7] * (float) var139) / var143;
                            var82 = this.method240(var144, var145, var146);
                            this.method241(arg1.field1316[var119], arg1.field1320[var119], arg1.field1318[var119], var122, var123, var124, var82, var125, var126, var127, var130, var131, field7848);
                            var74 = field7848[0];
                            var75 = field7848[1];
                            this.method241(arg1.field1316[var120], arg1.field1320[var120], arg1.field1318[var120], var122, var123, var124, var82, var125, var126, var127, var130, var131, field7848);
                            var76 = field7848[0];
                            var77 = field7848[1];
                            this.method241(arg1.field1316[var121], arg1.field1320[var121], arg1.field1318[var121], var122, var123, var124, var82, var125, var126, var127, var130, var131, field7848);
                            var78 = field7848[0];
                            var79 = field7848[1];
                        } else if (var83 == 3) {
                            this.method238(arg1.field1316[var119], arg1.field1320[var119], arg1.field1318[var119], var122, var123, var124, var125, var126, var127, field7848);
                            var74 = field7848[0];
                            var75 = field7848[1];
                            this.method238(arg1.field1316[var120], arg1.field1320[var120], arg1.field1318[var120], var122, var123, var124, var125, var126, var127, field7848);
                            var76 = field7848[0];
                            var77 = field7848[1];
                            this.method238(arg1.field1316[var121], arg1.field1320[var121], arg1.field1318[var121], var122, var123, var124, var125, var126, var127, field7848);
                            var78 = field7848[0];
                            var79 = field7848[1];
                            if ((var126 & 0x1) == 0) {
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var80 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var80 = 2;
                                }
                                if (var78 - var74 > 0.5F) {
                                    var78--;
                                    var81 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var81 = 2;
                                }
                            } else {
                                if (var77 - var75 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var75 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                                if (var79 - var75 > 0.5F) {
                                    var79--;
                                    var81 = 1;
                                } else if (var75 - var79 > 0.5F) {
                                    var79++;
                                    var81 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var147;
            if (arg1.field1345 == null) {
                var147 = 0;
            } else {
                var147 = arg1.field1345[var68];
            }
            if (var147 == 0) {
                long var148 = ((long) (var69 << 8) + (long) (var82 << 24) + (long) var71 << 32) + (long) (var70 << 2);
                short var150 = arg1.field1322[var68];
                short var151 = arg1.field1323[var68];
                short var152 = arg1.field1324[var68];
                GlVertexNormal var153 = var31[var150];
                this.field7882[var67] = this.method13079(arg1, var150, var148, var153.field1104, var153.field1101, var153.field1103, var153.field1102, var74, var75);
                GlVertexNormal var154 = var31[var151];
                this.field7902[var67] = this.method13079(arg1, var151, (long) var80 + var148, var154.field1104, var154.field1101, var154.field1103, var154.field1102, var76, var77);
                GlVertexNormal var155 = var31[var152];
                this.field7896[var67] = this.method13079(arg1, var152, (long) var81 + var148, var155.field1104, var155.field1101, var155.field1103, var155.field1102, var78, var79);
            } else if (var147 == 1) {
                TriangleNormal var156 = var44[var68];
                long var157 = (long) ((var70 << 2) + (var156.field1075 > 0 ? 1024 : 2048) + (var156.field1074 + 256 << 12) + (var156.field1076 + 256 << 22)) + ((long) (var69 << 8) + (long) (var82 << 24) + (long) var71 << 32);
                this.field7882[var67] = this.method13079(arg1, arg1.field1322[var68], var157, var156.field1075, var156.field1074, var156.field1076, 0, var74, var75);
                this.field7902[var67] = this.method13079(arg1, arg1.field1323[var68], (long) var80 + var157, var156.field1075, var156.field1074, var156.field1076, 0, var76, var77);
                this.field7896[var67] = this.method13079(arg1, arg1.field1324[var68], (long) var81 + var157, var156.field1075, var156.field1074, var156.field1076, 0, var78, var79);
            }
            if (arg1.field1332 != null) {
                this.field7881[var67] = arg1.field1332[var68];
            }
            if (arg1.field1333 != null) {
                this.field7887[var67] = arg1.field1333[var68];
            }
            this.field7912[var67] = arg1.field1329[var68];
            this.field7897[var67] = var72;
        }
        int var159 = 0;
        short var160 = -10000;
        for (int var161 = 0; var161 < this.field7877; var161++) {
            short var162 = this.field7897[var161];
            if (var160 != var162) {
                var159++;
                var160 = var162;
            }
        }
        this.field7919 = new int[var159 + 1];
        int var163 = 0;
        short var164 = -10000;
        for (int var165 = 0; var165 < this.field7877; var165++) {
            short var166 = this.field7897[var165];
            if (var164 != var166) {
                this.field7919[var163++] = var165;
                var164 = var166;
            }
        }
        this.field7919[var163] = this.field7877;
        Statics.field7914 = null;
        this.field7856 = method13078(this.field7856, this.field7870);
        this.field7872 = method13078(this.field7872, this.field7870);
        this.field7873 = method13078(this.field7873, this.field7870);
        this.field7874 = method13077(this.field7874, this.field7870);
        this.field7876 = method13076(this.field7876, this.field7870);
        this.field7901 = method13076(this.field7901, this.field7870);
        if (arg1.field1313 != null && GlModelFlags.method2115(arg2, this.field7857)) {
            this.field7868 = arg1.method2649(false);
        }
        if (arg1.field1349 != null && GlModelFlags.method2116(arg2, this.field7857)) {
            this.field7878 = arg1.method2629();
        }
        if (arg1.field1331 != null && GlModelFlags.method2141(arg2, this.field7857)) {
            int var167 = 0;
            int[] var168 = new int[256];
            for (int var169 = 0; var169 < this.field7883; var169++) {
                int var170 = arg1.field1331[var8[var169]];
                if (var170 >= 0) {
                    int var10002 = var168[var170]++;
                    if (var170 > var167) {
                        var167 = var170;
                    }
                }
            }
            this.field7886 = new int[var167 + 1][];
            for (int var171 = 0; var171 <= var167; var171++) {
                this.field7886[var171] = new int[var168[var171]];
                var168[var171] = 0;
            }
            for (int var172 = 0; var172 < this.field7883; var172++) {
                int var173 = arg1.field1331[var8[var172]];
                if (var173 >= 0) {
                    this.field7886[var173][var168[var173]++] = var172;
                }
            }
        }
    }

    @ObfuscatedName("yz.x(Ldw;IJIIIIFF)S")
    public short method13079(ModelUnlit arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field7906[arg1];
        int var12 = this.field7906[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field7907[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (Statics.field7914[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field7907[var13] = (short) (this.field7870 + 1);
        Statics.field7914[var13] = arg2;
        this.field7856[this.field7870] = (short) arg3;
        this.field7872[this.field7870] = (short) arg4;
        this.field7873[this.field7870] = (short) arg5;
        this.field7874[this.field7870] = (byte) arg6;
        this.field7876[this.field7870] = arg7;
        this.field7901[this.field7870] = arg8;
        return (short) this.field7870++;
    }

    @ObfuscatedName("yz.y([BI)[B")
    public static byte[] method13077(byte[] arg0, int arg1) {
        byte[] var2 = new byte[arg1];
        System.arraycopy(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @ObfuscatedName("yz.aa([SI)[S")
    public static short[] method13078(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        System.arraycopy(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @ObfuscatedName("yz.ba([FI)[F")
    public static float[] method13076(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        System.arraycopy(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @ObfuscatedName("yz.m()I")
    public int m() {
        return this.field7905;
    }

    @ObfuscatedName("yz.KA(I)V")
    public void KA(int arg0) {
        this.field7905 = arg0;
        if (this.field7875 != null && (this.field7905 & 0x10000) == 0) {
            this.field7856 = this.field7875.field1185;
            this.field7872 = this.field7875.field1186;
            this.field7873 = this.field7875.field1187;
            this.field7874 = this.field7875.field1188;
            this.field7875 = null;
        }
        this.field7900 = true;
        this.method13081();
    }

    @ObfuscatedName("yz.b()V")
    public void method247() {
        if (this.field7870 <= 0 || this.field7877 <= 0) {
            return;
        }
        this.method13093(false);
        if ((this.field7858 & 0x10) == 0 && this.field7892.field1096 == null) {
            this.method13095(false);
        }
        this.method13081();
    }

    @ObfuscatedName("yz.q(BIZ)Lqa;")
    public Model method295(byte arg0, int arg1, boolean arg2) {
        boolean var4 = false;
        GlModel var5;
        GlModel var6;
        if (arg0 > 0 && arg0 <= 7) {
            var5 = this.field7891.field8188[arg0 - 1];
            var6 = this.field7891.field8115[arg0 - 1];
            var4 = true;
        } else {
            var6 = var5 = new GlModel(this.field7891);
        }
        return this.method13080(var6, var5, arg1, var4, arg2);
    }

    @ObfuscatedName("yz.gp(Lyz;Lyz;IZZ)Lqa;")
    public Model method13080(GlModel arg0, GlModel arg1, int arg2, boolean arg3, boolean arg4) {
        arg0.field7858 = 0;
        arg0.field7905 = arg2;
        arg0.field7857 = this.field7857;
        arg0.field7859 = this.field7859;
        arg0.field7860 = this.field7860;
        arg0.field7863 = this.field7863;
        arg0.field7864 = this.field7864;
        arg0.field7870 = this.field7870;
        arg0.field7883 = this.field7883;
        arg0.field7877 = this.field7877;
        arg0.field7910 = this.field7910;
        if ((arg2 & 0x100) == 0) {
            arg0.field7913 = this.field7913;
        } else {
            arg0.field7913 = true;
        }
        arg0.field7867 = this.field7867;
        boolean var6 = GlModelFlags.method2085(arg2, this.field7857);
        boolean var7 = GlModelFlags.method2086(arg2, this.field7857);
        boolean var8 = GlModelFlags.method2160(arg2, this.field7857);
        boolean var9 = var6 | var7 | var8;
        if (var9) {
            if (!var6) {
                arg0.field7865 = this.field7865;
            } else if (arg1.field7865 == null || arg1.field7865.length < this.field7863) {
                arg0.field7865 = arg1.field7865 = new int[this.field7863];
            } else {
                arg0.field7865 = arg1.field7865;
            }
            if (!var7) {
                arg0.field7866 = this.field7866;
            } else if (arg1.field7866 == null || arg1.field7866.length < this.field7863) {
                arg0.field7866 = arg1.field7866 = new int[this.field7863];
            } else {
                arg0.field7866 = arg1.field7866;
            }
            if (!var8) {
                arg0.field7904 = this.field7904;
            } else if (arg1.field7904 == null || arg1.field7904.length < this.field7863) {
                arg0.field7904 = arg1.field7904 = new int[this.field7863];
            } else {
                arg0.field7904 = arg1.field7904;
            }
            for (int var10 = 0; var10 < this.field7863; var10++) {
                if (var6) {
                    arg0.field7865[var10] = this.field7865[var10];
                }
                if (var7) {
                    arg0.field7866[var10] = this.field7866[var10];
                }
                if (var8) {
                    arg0.field7904[var10] = this.field7904[var10];
                }
            }
        } else {
            arg0.field7865 = this.field7865;
            arg0.field7866 = this.field7866;
            arg0.field7904 = this.field7904;
        }
        if (GlModelFlags.method2124(arg2, this.field7857)) {
            if (arg3) {
                arg0.field7858 = (byte) (arg0.field7858 | 0x1);
            }
            arg0.field7888 = arg1.field7888;
            arg0.field7888.field1099 = this.field7888.field1099;
            arg0.field7888.field1097 = this.field7888.field1097;
        } else if (GlModelFlags.method2097(arg2, this.field7857)) {
            arg0.field7888 = this.field7888;
        } else {
            arg0.field7888 = null;
        }
        if (GlModelFlags.method2090(arg2, this.field7857)) {
            if (arg1.field7912 == null || arg1.field7912.length < this.field7883) {
                arg0.field7912 = arg1.field7912 = new short[this.field7883];
            } else {
                arg0.field7912 = arg1.field7912;
            }
            for (int var11 = 0; var11 < this.field7883; var11++) {
                arg0.field7912[var11] = this.field7912[var11];
            }
        } else {
            arg0.field7912 = this.field7912;
        }
        if (GlModelFlags.method2091(arg2, this.field7857)) {
            if (arg1.field7881 == null || arg1.field7881.length < this.field7883) {
                arg0.field7881 = arg1.field7881 = new byte[this.field7883];
            } else {
                arg0.field7881 = arg1.field7881;
            }
            for (int var12 = 0; var12 < this.field7883; var12++) {
                arg0.field7881[var12] = this.field7881[var12];
            }
        } else {
            arg0.field7881 = this.field7881;
        }
        if (GlModelFlags.method2104(arg2, this.field7857)) {
            if (arg3) {
                arg0.field7858 = (byte) (arg0.field7858 | 0x2);
            }
            arg0.field7889 = arg1.field7889;
            arg0.field7889.field1099 = this.field7889.field1099;
            arg0.field7889.field1097 = this.field7889.field1097;
        } else if (GlModelFlags.method2161(arg2, this.field7857)) {
            arg0.field7889 = this.field7889;
        } else {
            arg0.field7889 = null;
        }
        if (GlModelFlags.method2089(arg2, this.field7857)) {
            if (arg1.field7856 == null || arg1.field7856.length < this.field7870) {
                int var13 = this.field7870;
                arg0.field7856 = arg1.field7856 = new short[var13];
                arg0.field7872 = arg1.field7872 = new short[var13];
                arg0.field7873 = arg1.field7873 = new short[var13];
            } else {
                arg0.field7856 = arg1.field7856;
                arg0.field7872 = arg1.field7872;
                arg0.field7873 = arg1.field7873;
            }
            if (this.field7875 == null) {
                for (int var17 = 0; var17 < this.field7870; var17++) {
                    arg0.field7856[var17] = this.field7856[var17];
                    arg0.field7872[var17] = this.field7872[var17];
                    arg0.field7873[var17] = this.field7873[var17];
                }
            } else {
                if (arg1.field7875 == null) {
                    arg1.field7875 = new GlModelRelated1();
                }
                GlModelRelated1 var14 = arg0.field7875 = arg1.field7875;
                if (var14.field1185 == null || var14.field1185.length < this.field7870) {
                    int var15 = this.field7870;
                    var14.field1185 = new short[var15];
                    var14.field1186 = new short[var15];
                    var14.field1187 = new short[var15];
                    var14.field1188 = new byte[var15];
                }
                for (int var16 = 0; var16 < this.field7870; var16++) {
                    arg0.field7856[var16] = this.field7856[var16];
                    arg0.field7872[var16] = this.field7872[var16];
                    arg0.field7873[var16] = this.field7873[var16];
                    var14.field1185[var16] = this.field7875.field1185[var16];
                    var14.field1186[var16] = this.field7875.field1186[var16];
                    var14.field1187[var16] = this.field7875.field1187[var16];
                    var14.field1188[var16] = this.field7875.field1188[var16];
                }
            }
            arg0.field7874 = this.field7874;
        } else {
            arg0.field7875 = this.field7875;
            arg0.field7856 = this.field7856;
            arg0.field7872 = this.field7872;
            arg0.field7873 = this.field7873;
            arg0.field7874 = this.field7874;
        }
        if (GlModelFlags.method2103(arg2, this.field7857)) {
            if (arg3) {
                arg0.field7858 = (byte) (arg0.field7858 | 0x4);
            }
            arg0.field7890 = arg1.field7890;
            arg0.field7890.field1099 = this.field7890.field1099;
            arg0.field7890.field1097 = this.field7890.field1097;
        } else if (GlModelFlags.method2098(arg2, this.field7857)) {
            arg0.field7890 = this.field7890;
        } else {
            arg0.field7890 = null;
        }
        if (GlModelFlags.method2114(arg2, this.field7857)) {
            if (arg1.field7876 == null || arg1.field7876.length < this.field7883) {
                int var18 = this.field7870;
                arg0.field7876 = arg1.field7876 = new float[var18];
                arg0.field7901 = arg1.field7901 = new float[var18];
            } else {
                arg0.field7876 = arg1.field7876;
                arg0.field7901 = arg1.field7901;
            }
            for (int var19 = 0; var19 < this.field7870; var19++) {
                arg0.field7876[var19] = this.field7876[var19];
                arg0.field7901[var19] = this.field7901[var19];
            }
        } else {
            arg0.field7876 = this.field7876;
            arg0.field7901 = this.field7901;
        }
        if (GlModelFlags.method2105(arg2, this.field7857)) {
            if (arg3) {
                arg0.field7858 = (byte) (arg0.field7858 | 0x8);
            }
            arg0.field7885 = arg1.field7885;
            arg0.field7885.field1099 = this.field7885.field1099;
            arg0.field7885.field1097 = this.field7885.field1097;
        } else if (GlModelFlags.method2099(arg2, this.field7857)) {
            arg0.field7885 = this.field7885;
        } else {
            arg0.field7885 = null;
        }
        if (GlModelFlags.method2093(arg2, this.field7857)) {
            if (arg1.field7882 == null || arg1.field7882.length < this.field7883) {
                int var20 = this.field7883;
                arg0.field7882 = arg1.field7882 = new short[var20];
                arg0.field7902 = arg1.field7902 = new short[var20];
                arg0.field7896 = arg1.field7896 = new short[var20];
            } else {
                arg0.field7882 = arg1.field7882;
                arg0.field7902 = arg1.field7902;
                arg0.field7896 = arg1.field7896;
            }
            for (int var21 = 0; var21 < this.field7883; var21++) {
                arg0.field7882[var21] = this.field7882[var21];
                arg0.field7902[var21] = this.field7902[var21];
                arg0.field7896[var21] = this.field7896[var21];
            }
        } else {
            arg0.field7882 = this.field7882;
            arg0.field7902 = this.field7902;
            arg0.field7896 = this.field7896;
        }
        if (GlModelFlags.method2122(arg2, this.field7857)) {
            if (arg3) {
                arg0.field7858 = (byte) (arg0.field7858 | 0x10);
            }
            arg0.field7892 = arg1.field7892;
            arg0.field7892.field1096 = this.field7892.field1096;
        } else if (GlModelFlags.method2179(arg2, this.field7857)) {
            arg0.field7892 = this.field7892;
        } else {
            arg0.field7892 = null;
        }
        if (GlModelFlags.method2094(arg2, this.field7857)) {
            if (arg1.field7897 == null || arg1.field7897.length < this.field7883) {
                int var22 = this.field7883;
                arg0.field7897 = arg1.field7897 = new short[var22];
            } else {
                arg0.field7897 = arg1.field7897;
            }
            for (int var23 = 0; var23 < this.field7883; var23++) {
                arg0.field7897[var23] = this.field7897[var23];
            }
        } else {
            arg0.field7897 = this.field7897;
        }
        if (!GlModelFlags.method2144(arg2, this.field7857)) {
            arg0.field7915 = this.field7915;
        } else if (arg1.field7915 == null || arg1.field7915.length < this.field7910) {
            int var25 = this.field7910;
            arg0.field7915 = arg1.field7915 = new GlModelRelated7[var25];
            for (int var26 = 0; var26 < this.field7910; var26++) {
                arg0.field7915[var26] = this.field7915[var26].method2244();
            }
        } else {
            arg0.field7915 = arg1.field7915;
            for (int var24 = 0; var24 < this.field7910; var24++) {
                arg0.field7915[var24].method2245(this.field7915[var24]);
            }
        }
        arg0.field7903 = this.field7903;
        if (this.field7898) {
            arg0.field7861 = this.field7861;
            arg0.field7850 = this.field7850;
            arg0.field7871 = this.field7871;
            arg0.field7880 = this.field7880;
            arg0.field7899 = this.field7899;
            arg0.field7884 = this.field7884;
            arg0.field7895 = this.field7895;
            arg0.field7911 = this.field7911;
            arg0.field7898 = true;
        } else {
            arg0.field7898 = false;
        }
        arg0.field7868 = this.field7868;
        arg0.field7886 = this.field7886;
        arg0.field7878 = this.field7878;
        arg0.field7907 = this.field7907;
        arg0.field7906 = this.field7906;
        arg0.field7869 = this.field7869;
        arg0.field7887 = this.field7887;
        arg0.field7919 = this.field7919;
        arg0.field7908 = this.field7908;
        arg0.field7909 = this.field7909;
        return arg0;
    }

    @ObfuscatedName("yz.gq()V")
    public void method13081() {
        if (!this.field7900) {
            return;
        }
        this.field7900 = false;
        if (this.field7908 == null && this.field7909 == null && this.field7903 == null && !GlModelFlags.method2088(this.field7905, this.field7857)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (this.field7865 != null && !GlModelFlags.method2107(this.field7905, this.field7857)) {
                if (this.field7888 != null && this.field7888.field1097 == null) {
                    this.field7900 = true;
                } else {
                    if (!this.field7898) {
                        this.method13082();
                    }
                    var1 = true;
                }
            }
            if (this.field7866 != null && !GlModelFlags.method2108(this.field7905, this.field7857)) {
                if (this.field7888 != null && this.field7888.field1097 == null) {
                    this.field7900 = true;
                } else {
                    if (!this.field7898) {
                        this.method13082();
                    }
                    var2 = true;
                }
            }
            if (this.field7904 != null && !GlModelFlags.method2117(this.field7905, this.field7857)) {
                if (this.field7888 != null && this.field7888.field1097 == null) {
                    this.field7900 = true;
                } else {
                    if (!this.field7898) {
                        this.method13082();
                    }
                    var3 = true;
                }
            }
            if (var1) {
                this.field7865 = null;
            }
            if (var2) {
                this.field7866 = null;
            }
            if (var3) {
                this.field7904 = null;
            }
        }
        if (this.field7907 != null && this.field7865 == null && this.field7866 == null && this.field7904 == null) {
            this.field7907 = null;
            this.field7906 = null;
        }
        if (this.field7874 != null && !GlModelFlags.method2110(this.field7905, this.field7857)) {
            if (this.field7890 == null) {
                if (this.field7889 != null && this.field7889.field1097 == null) {
                    this.field7900 = true;
                } else {
                    this.field7873 = null;
                    this.field7872 = null;
                    this.field7856 = null;
                    this.field7874 = null;
                }
            } else if (this.field7890.field1097 == null) {
                this.field7900 = true;
            } else {
                this.field7873 = null;
                this.field7872 = null;
                this.field7856 = null;
                this.field7874 = null;
            }
        }
        if (this.field7912 != null && !GlModelFlags.method2148(this.field7905, this.field7857)) {
            if (this.field7889 != null && this.field7889.field1097 == null) {
                this.field7900 = true;
            } else {
                this.field7912 = null;
            }
        }
        if (this.field7881 != null && !GlModelFlags.method2112(this.field7905, this.field7857)) {
            if (this.field7889 != null && this.field7889.field1097 == null) {
                this.field7900 = true;
            } else {
                this.field7881 = null;
            }
        }
        if (this.field7876 != null && !GlModelFlags.method2113(this.field7905, this.field7857)) {
            if (this.field7885 != null && this.field7885.field1097 == null) {
                this.field7900 = true;
            } else {
                this.field7901 = null;
                this.field7876 = null;
            }
        }
        if (this.field7897 != null && !GlModelFlags.method2101(this.field7905, this.field7857)) {
            if (this.field7889 != null && this.field7889.field1097 == null) {
                this.field7900 = true;
            } else {
                this.field7897 = null;
            }
        }
        if (this.field7882 != null && !GlModelFlags.method2125(this.field7905, this.field7857)) {
            if ((this.field7892 == null || this.field7892.field1096 != null) && (this.field7889 == null || this.field7889.field1097 != null)) {
                this.field7896 = null;
                this.field7902 = null;
                this.field7882 = null;
            } else {
                this.field7900 = true;
            }
        }
        if (this.field7886 != null && !GlModelFlags.method2141(this.field7905, this.field7857)) {
            this.field7886 = null;
            this.field7887 = null;
        }
        if (this.field7868 != null && !GlModelFlags.method2115(this.field7905, this.field7857)) {
            this.field7868 = null;
            this.field7869 = null;
        }
        if (this.field7878 != null && !GlModelFlags.method2116(this.field7905, this.field7857)) {
            this.field7878 = null;
        }
        if (this.field7919 != null && (this.field7905 & 0x800) == 0 && (this.field7905 & 0x40000) == 0) {
            this.field7919 = null;
        }
    }

    @ObfuscatedName("yz.f(I)V")
    public void f(int arg0) {
        int var2 = Trig1.field3439[arg0];
        int var3 = Trig1.field3447[arg0];
        for (int var4 = 0; var4 < this.field7864; var4++) {
            int var5 = this.field7904[var4] * var2 + this.field7865[var4] * var3 >> 14;
            this.field7904[var4] = this.field7904[var4] * var3 - this.field7865[var4] * var2 >> 14;
            this.field7865[var4] = var5;
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.S(I)V")
    public void S(int arg0) {
        int var2 = Trig1.field3439[arg0];
        int var3 = Trig1.field3447[arg0];
        for (int var4 = 0; var4 < this.field7864; var4++) {
            int var5 = this.field7904[var4] * var2 + this.field7865[var4] * var3 >> 14;
            this.field7904[var4] = this.field7904[var4] * var3 - this.field7865[var4] * var2 >> 14;
            this.field7865[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field7870; var6++) {
            int var7 = this.field7873[var6] * var2 + this.field7856[var6] * var3 >> 14;
            this.field7873[var6] = (short) (this.field7873[var6] * var3 - this.field7856[var6] * var2 >> 14);
            this.field7856[var6] = (short) var7;
        }
        if (this.field7890 == null && this.field7889 != null) {
            this.field7889.field1097 = null;
        }
        if (this.field7890 != null) {
            this.field7890.field1097 = null;
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.t(I)V")
    public void t(int arg0) {
        int var2 = Trig1.field3439[arg0];
        int var3 = Trig1.field3447[arg0];
        for (int var4 = 0; var4 < this.field7864; var4++) {
            int var5 = this.field7866[var4] * var3 - this.field7904[var4] * var2 >> 14;
            this.field7904[var4] = this.field7904[var4] * var3 + this.field7866[var4] * var2 >> 14;
            this.field7866[var4] = var5;
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.EA(I)V")
    public void EA(int arg0) {
        int var2 = Trig1.field3439[arg0];
        int var3 = Trig1.field3447[arg0];
        for (int var4 = 0; var4 < this.field7864; var4++) {
            int var5 = this.field7866[var4] * var2 + this.field7865[var4] * var3 >> 14;
            this.field7866[var4] = this.field7866[var4] * var3 - this.field7865[var4] * var2 >> 14;
            this.field7865[var4] = var5;
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.ia(III)V")
    public void ia(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7864; var4++) {
            if (arg0 != 0) {
                this.field7865[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field7866[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field7904[var4] += arg2;
            }
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.wa()V")
    public void wa() {
        for (int var1 = 0; var1 < this.field7864; var1++) {
            this.field7904[var1] = -this.field7904[var1];
        }
        for (int var2 = 0; var2 < this.field7870; var2++) {
            this.field7873[var2] = (short) -this.field7873[var2];
        }
        for (int var3 = 0; var3 < this.field7883; var3++) {
            short var4 = this.field7882[var3];
            this.field7882[var3] = this.field7896[var3];
            this.field7896[var3] = var4;
        }
        if (this.field7890 == null && this.field7889 != null) {
            this.field7889.field1097 = null;
        }
        if (this.field7890 != null) {
            this.field7890.field1097 = null;
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        if (this.field7892 != null) {
            this.field7892.field1096 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.oa(III)V")
    public void oa(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7864; var4++) {
            if (arg0 != 128) {
                this.field7865[var4] = this.field7865[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field7866[var4] = this.field7866[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field7904[var4] = this.field7904[var4] * arg2 >> 7;
            }
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.pa(IILxa;Lxa;III)V")
    public void pa(int arg0, int arg1, FloorModel arg2, FloorModel arg3, int arg4, int arg5, int arg6) {
        if (!this.field7898) {
            this.method13082();
        }
        int var8 = this.field7871 + arg4;
        int var9 = this.field7880 + arg4;
        int var10 = this.field7895 + arg6;
        int var11 = this.field7911 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var8 < 0 || arg2.field385 + var9 >> arg2.field388 >= arg2.field387 || var10 < 0 || arg2.field385 + var11 >> arg2.field388 >= arg2.field386)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field385 + var9 >> arg3.field388 >= arg3.field387 || var10 < 0 || arg3.field385 + var11 >> arg3.field388 >= arg3.field386) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field388;
            int var13 = arg2.field385 - 1 + var9 >> arg2.field388;
            int var14 = var10 >> arg2.field388;
            int var15 = arg2.field385 - 1 + var11 >> arg2.field388;
            if (arg2.method199(var12, var14) == arg5 && arg2.method199(var13, var14) == arg5 && arg2.method199(var12, var15) == arg5 && arg2.method199(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field7864; var16++) {
                this.field7866[var16] = this.field7866[var16] + arg2.method196(this.field7865[var16] + arg4, this.field7904[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field7899;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field7864; var18++) {
                int var19 = (this.field7866[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field7866[var18] += (arg2.method196(this.field7865[var18] + arg4, this.field7904[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = (arg1 >> 8 & 0xFF) * 4;
            int var22 = (arg1 >> 16 & 0xFF) << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var20 >> 1) < 0 || arg2.field385 + (var20 >> 1) + arg4 >= arg2.field387 << arg2.field388 || arg6 - (var21 >> 1) < 0 || arg2.field385 + (var21 >> 1) + arg6 >= arg2.field386 << arg2.field388) {
                return;
            }
            this.method256(arg2, arg4, arg5, arg6, var20, var21, var22, var23);
        } else if (arg0 == 4) {
            int var24 = this.field7884 - this.field7899;
            for (int var25 = 0; var25 < this.field7864; var25++) {
                this.field7866[var25] = this.field7866[var25] + (arg3.method196(this.field7865[var25] + arg4, this.field7904[var25] + arg6) - arg5) + var24;
            }
        } else if (arg0 == 5) {
            int var26 = this.field7884 - this.field7899;
            for (int var27 = 0; var27 < this.field7864; var27++) {
                int var28 = this.field7865[var27] + arg4;
                int var29 = this.field7904[var27] + arg6;
                int var30 = arg2.method196(var28, var29);
                int var31 = arg3.method196(var28, var29);
                int var32 = var30 - var31 - arg1;
                this.field7866[var27] = ((this.field7866[var27] << 8) / var26 * var32 >> 8) - (arg5 - var30);
            }
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.gz()V")
    public void method13082() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field7864; var9++) {
            int var10 = this.field7865[var9];
            int var11 = this.field7866[var9];
            int var12 = this.field7904[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field7871 = (short) var1;
        this.field7880 = (short) var4;
        this.field7899 = (short) var2;
        this.field7884 = (short) var5;
        this.field7895 = (short) var3;
        this.field7911 = (short) var6;
        this.field7850 = (int) (Math.sqrt((double) var7) + 0.99D);
        this.field7861 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field7898 = true;
    }

    @ObfuscatedName("yz.N()I")
    public int N() {
        if (!this.field7898) {
            this.method13082();
        }
        return this.field7850;
    }

    @ObfuscatedName("yz.n()I")
    public int n() {
        if (!this.field7898) {
            this.method13082();
        }
        return this.field7861;
    }

    @ObfuscatedName("yz.RA()I")
    public int RA() {
        if (!this.field7898) {
            this.method13082();
        }
        return this.field7871;
    }

    @ObfuscatedName("yz.ya()I")
    public int ya() {
        if (!this.field7898) {
            this.method13082();
        }
        return this.field7880;
    }

    @ObfuscatedName("yz.YA()I")
    public int YA() {
        if (!this.field7898) {
            this.method13082();
        }
        return this.field7899;
    }

    @ObfuscatedName("yz.o()I")
    public int o() {
        if (!this.field7898) {
            this.method13082();
        }
        return this.field7884;
    }

    @ObfuscatedName("yz.AA()I")
    public int AA() {
        if (!this.field7898) {
            this.method13082();
        }
        return this.field7895;
    }

    @ObfuscatedName("yz.ha()I")
    public int ha() {
        if (!this.field7898) {
            this.method13082();
        }
        return this.field7911;
    }

    @ObfuscatedName("yz.ad(Lqa;IIIZ)V")
    public void method297(Model arg0, int arg1, int arg2, int arg3, boolean arg4) {
        GlModel var6 = (GlModel) arg0;
        if (this.field7883 == 0 || var6.field7883 * -1431655765 == 0) {
            return;
        }
        int var7 = var6.field7864;
        int[] var8 = var6.field7865;
        int[] var9 = var6.field7866;
        int[] var10 = var6.field7904;
        short[] var11 = var6.field7856;
        short[] var12 = var6.field7872;
        short[] var13 = var6.field7873;
        byte[] var14 = var6.field7874;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field7875 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field7875.field1185;
            var16 = this.field7875.field1186;
            var17 = this.field7875.field1187;
            var18 = this.field7875.field1188;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field7875 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field7875.field1185;
            var20 = var6.field7875.field1186;
            var21 = var6.field7875.field1187;
            var22 = var6.field7875.field1188;
        }
        int[] var23 = var6.field7906;
        short[] var24 = var6.field7907;
        if (!var6.field7898) {
            var6.method13082();
        }
        short var25 = var6.field7899;
        short var26 = var6.field7884;
        short var27 = var6.field7871;
        short var28 = var6.field7880;
        short var29 = var6.field7895;
        short var30 = var6.field7911;
        for (int var31 = 0; var31 < this.field7864; var31++) {
            int var32 = this.field7866[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field7865[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field7904[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field7906[var31];
                        int var37 = this.field7906[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field7907[var38] - 1;
                            if (var35 == -1 || this.field7874[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field7875 = new GlModelRelated1();
                                            var15 = this.field7875.field1185 = Statics.method879(this.field7856);
                                            var16 = this.field7875.field1186 = Statics.method879(this.field7872);
                                            var17 = this.field7875.field1187 = Statics.method879(this.field7873);
                                            var18 = this.field7875.field1188 = GpuByteArrayUtil.method16683(this.field7874);
                                        }
                                        if (var19 == null) {
                                            GlModelRelated1 var44 = var6.field7875 = new GlModelRelated1();
                                            var19 = var44.field1185 = Statics.method879(var11);
                                            var20 = var44.field1186 = Statics.method879(var12);
                                            var21 = var44.field1187 = Statics.method879(var13);
                                            var22 = var44.field1188 = GpuByteArrayUtil.method16683(var14);
                                        }
                                        short var45 = this.field7856[var35];
                                        short var46 = this.field7872[var35];
                                        short var47 = this.field7873[var35];
                                        byte var48 = this.field7874[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        byte var56 = var14[var40];
                                        int var57 = this.field7906[var31];
                                        int var58 = this.field7906[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field7907[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                        if (this.field7890 == null && this.field7889 != null) {
                                            this.field7889.field1097 = null;
                                        }
                                        if (this.field7890 != null) {
                                            this.field7890.field1097 = null;
                                        }
                                        if (var6.field7890 == null && var6.field7889 != null) {
                                            var6.field7889.field1097 = null;
                                        }
                                        if (var6.field7890 != null) {
                                            var6.field7890.field1097 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("yz.p(I)V")
    public void p(int arg0) {
        this.field7859 = (short) arg0;
        if (this.field7889 != null) {
            this.field7889.field1097 = null;
        }
    }

    @ObfuscatedName("yz.Q(I)V")
    public void Q(int arg0) {
        this.field7860 = (short) arg0;
        if (this.field7889 != null) {
            this.field7889.field1097 = null;
        }
        if (this.field7890 != null) {
            this.field7890.field1097 = null;
        }
    }

    @ObfuscatedName("yz.c()I")
    public int c() {
        return this.field7859;
    }

    @ObfuscatedName("yz.Z()I")
    public int Z() {
        return this.field7860;
    }

    @ObfuscatedName("yz.ao()[B")
    public byte[] ao() {
        return this.field7881;
    }

    @ObfuscatedName("yz.X(SS)V")
    public void X(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field7883; var3++) {
            if (this.field7912[var3] == arg0) {
                this.field7912[var3] = arg1;
            }
        }
        if (this.field7903 != null) {
            for (int var4 = 0; var4 < this.field7910; var4++) {
                GlModelRelated6 var5 = this.field7903[var4];
                GlModelRelated7 var6 = this.field7915[var4];
                var6.field1090 = var6.field1090 & 0xFF000000 | Statics.field5084[this.field7912[var5.field1178] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field7889 != null) {
            this.field7889.field1097 = null;
        }
    }

    @ObfuscatedName("yz.al(B[B)V")
    public void method288(byte arg0, byte[] arg1) {
        if (arg1 == null) {
            for (int var3 = 0; var3 < this.field7883; var3++) {
                this.field7881[var3] = arg0;
            }
        } else {
            for (int var4 = 0; var4 < this.field7883; var4++) {
                int var5 = 255 - (255 - (arg1[var4] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
                this.field7881[var4] = (byte) var5;
            }
        }
        if (this.field7889 != null) {
            this.field7889.field1097 = null;
        }
    }

    @ObfuscatedName("yz.W(SS)V")
    public void W(short arg0, short arg1) {
        MaterialTypeList var3 = this.field7891.field400;
        for (int var4 = 0; var4 < this.field7883; var4++) {
            if (this.field7897[var4] == arg0) {
                this.field7897[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            Material var7 = var3.method889(arg0 & 0xFFFF);
            var5 = var7.field1266;
            var6 = var7.field1267;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            Material var10 = var3.method889(arg1 & 0xFFFF);
            var8 = var10.field1266;
            var9 = var10.field1267;
            if (var10.field1268 != 0 || var10.field1261 != 0) {
                this.field7867 = true;
            }
        }
        if (!(var5 != var8 | var6 != var9)) {
            return;
        }
        if (this.field7903 != null) {
            for (int var11 = 0; var11 < this.field7910; var11++) {
                GlModelRelated6 var12 = this.field7903[var11];
                GlModelRelated7 var13 = this.field7915[var11];
                var13.field1090 = var13.field1090 & 0xFF000000 | Statics.field5084[this.field7912[var12.field1178] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field7889 != null) {
            this.field7889.field1097 = null;
        }
    }

    @ObfuscatedName("yz.PA(IIII)V")
    public void PA(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field7883; var5++) {
            int var6 = this.field7912[var5] & 0xFFFF;
            int var7 = var6 >> 10 & 0x3F;
            int var8 = var6 >> 7 & 0x7;
            int var9 = var6 & 0x7F;
            if (arg0 != -1) {
                var7 += (arg0 - var7) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var8 += (arg1 - var8) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var9 += (arg2 - var9) * arg3 >> 7;
            }
            this.field7912[var5] = (short) (var7 << 10 | var8 << 7 | var9);
        }
        if (this.field7903 != null) {
            for (int var10 = 0; var10 < this.field7910; var10++) {
                GlModelRelated6 var11 = this.field7903[var10];
                GlModelRelated7 var12 = this.field7915[var10];
                var12.field1090 = var12.field1090 & 0xFF000000 | Statics.field5084[this.field7912[var11.field1178] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field7889 != null) {
            this.field7889.field1097 = null;
        }
    }

    @ObfuscatedName("yz.at()Z")
    public boolean method291() {
        if (this.field7897 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field7897.length; var1++) {
            if (this.field7897[var1] != -1 && !this.field7891.field8083.method2322(this.field7897[var1], -1)) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("yz.i()Z")
    public boolean i() {
        return this.field7913;
    }

    @ObfuscatedName("yz.u()Z")
    public boolean u() {
        return this.field7867;
    }

    @ObfuscatedName("yz.k()V")
    public void method257() {
    }

    @ObfuscatedName("yz.h()V")
    public void method407() {
    }

    @ObfuscatedName("yz.ea()Z")
    public boolean ea() {
        if (this.field7868 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field7863; var1++) {
            this.field7865[var1] <<= 0x4;
            this.field7866[var1] <<= 0x4;
            this.field7904[var1] <<= 0x4;
        }
        Statics.field7855 = 0;
        Statics.field7920 = 0;
        Statics.field7921 = 0;
        return true;
    }

    @ObfuscatedName("yz.e(I[IIIIZI[I)V")
    public void e(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            Statics.field7855 = 0;
            Statics.field7920 = 0;
            Statics.field7921 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field7868.length) {
                    int[] var16 = this.field7868[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field7869 == null || (arg6 & this.field7869[var18]) != 0) {
                            Statics.field7855 += this.field7865[var18];
                            Statics.field7920 += this.field7866[var18];
                            Statics.field7921 += this.field7904[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                Statics.field7855 = Statics.field7855 / var13 + var10;
                Statics.field7920 = Statics.field7920 / var13 + var11;
                Statics.field7921 = Statics.field7921 / var13 + var12;
                Statics.field7922 = true;
            } else {
                Statics.field7855 = var10;
                Statics.field7920 = var11;
                Statics.field7921 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field7868.length) {
                    int[] var27 = this.field7868[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field7869 == null || (arg6 & this.field7869[var29]) != 0) {
                            this.field7865[var29] += var22;
                            this.field7866[var29] += var23;
                            this.field7904[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field7868.length) {
                        int[] var92 = this.field7868[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field7869 == null || (arg6 & this.field7869[var94]) != 0) {
                                this.field7865[var94] -= Statics.field7855;
                                this.field7866[var94] -= Statics.field7920;
                                this.field7904[var94] -= Statics.field7921;
                                if (arg4 != 0) {
                                    int var95 = Trig1.field3439[arg4];
                                    int var96 = Trig1.field3447[arg4];
                                    int var97 = this.field7866[var94] * var95 + this.field7865[var94] * var96 + 16383 >> 14;
                                    this.field7866[var94] = this.field7866[var94] * var96 - this.field7865[var94] * var95 + 16383 >> 14;
                                    this.field7865[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = Trig1.field3439[arg2];
                                    int var99 = Trig1.field3447[arg2];
                                    int var100 = this.field7866[var94] * var99 - this.field7904[var94] * var98 + 16383 >> 14;
                                    this.field7904[var94] = this.field7904[var94] * var99 + this.field7866[var94] * var98 + 16383 >> 14;
                                    this.field7866[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = Trig1.field3439[arg3];
                                    int var102 = Trig1.field3447[arg3];
                                    int var103 = this.field7904[var94] * var101 + this.field7865[var94] * var102 + 16383 >> 14;
                                    this.field7904[var94] = this.field7904[var94] * var102 - this.field7865[var94] * var101 + 16383 >> 14;
                                    this.field7865[var94] = var103;
                                }
                                this.field7865[var94] += Statics.field7855;
                                this.field7866[var94] += Statics.field7920;
                                this.field7904[var94] += Statics.field7921;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field7868.length) {
                            int[] var106 = this.field7868[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field7869 == null || (arg6 & this.field7869[var108]) != 0) {
                                    int var109 = this.field7906[var108];
                                    int var110 = this.field7906[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field7907[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = Trig1.field3439[arg4];
                                            int var114 = Trig1.field3447[arg4];
                                            int var115 = this.field7872[var112] * var113 + this.field7856[var112] * var114 + 16383 >> 14;
                                            this.field7872[var112] = (short) (this.field7872[var112] * var114 - this.field7856[var112] * var113 + 16383 >> 14);
                                            this.field7856[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = Trig1.field3439[arg2];
                                            int var117 = Trig1.field3447[arg2];
                                            int var118 = this.field7872[var112] * var117 - this.field7873[var112] * var116 + 16383 >> 14;
                                            this.field7873[var112] = (short) (this.field7873[var112] * var117 + this.field7872[var112] * var116 + 16383 >> 14);
                                            this.field7872[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = Trig1.field3439[arg3];
                                            int var120 = Trig1.field3447[arg3];
                                            int var121 = this.field7873[var112] * var119 + this.field7856[var112] * var120 + 16383 >> 14;
                                            this.field7873[var112] = (short) (this.field7873[var112] * var120 - this.field7856[var112] * var119 + 16383 >> 14);
                                            this.field7856[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field7890 == null && this.field7889 != null) {
                        this.field7889.field1097 = null;
                    }
                    if (this.field7890 != null) {
                        this.field7890.field1097 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (Statics.field7922) {
                    int var36 = arg7[6] * Statics.field7921 + arg7[0] * Statics.field7855 + arg7[3] * Statics.field7920 + 8192 >> 14;
                    int var37 = arg7[7] * Statics.field7921 + arg7[1] * Statics.field7855 + arg7[4] * Statics.field7920 + 8192 >> 14;
                    int var38 = arg7[8] * Statics.field7921 + arg7[2] * Statics.field7855 + arg7[5] * Statics.field7920 + 8192 >> 14;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    Statics.field7855 = var39;
                    Statics.field7920 = var40;
                    Statics.field7921 = var41;
                    Statics.field7922 = false;
                }
                int[] var42 = new int[9];
                int var43 = Trig1.field3447[arg2];
                int var44 = Trig1.field3439[arg2];
                int var45 = Trig1.field3447[arg3];
                int var46 = Trig1.field3439[arg3];
                int var47 = Trig1.field3447[arg4];
                int var48 = Trig1.field3439[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                int var51 = var42[2] * -Statics.field7921 + var42[0] * -Statics.field7855 + var42[1] * -Statics.field7920 + 8192 >> 14;
                int var52 = var42[5] * -Statics.field7921 + var42[3] * -Statics.field7855 + var42[4] * -Statics.field7920 + 8192 >> 14;
                int var53 = var42[8] * -Statics.field7921 + var42[6] * -Statics.field7855 + var42[7] * -Statics.field7920 + 8192 >> 14;
                int var54 = Statics.field7855 + var51;
                int var55 = Statics.field7920 + var52;
                int var56 = Statics.field7921 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 8192 >> 14;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 8192 >> 14;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 8192 >> 14;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 8192 >> 14;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 8192 >> 14;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 8192 >> 14;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 8192 >> 14;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 8192 >> 14;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field7868.length) {
                        int[] var81 = this.field7868[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field7869 == null || (arg6 & this.field7869[var83]) != 0) {
                                int var84 = this.field7904[var83] * var68[2] + this.field7866[var83] * var68[1] + this.field7865[var83] * var68[0] + 8192 >> 14;
                                int var85 = this.field7904[var83] * var68[5] + this.field7866[var83] * var68[4] + this.field7865[var83] * var68[3] + 8192 >> 14;
                                int var86 = this.field7904[var83] * var68[8] + this.field7866[var83] * var68[7] + this.field7865[var83] * var68[6] + 8192 >> 14;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field7865[var83] = var87;
                                this.field7866[var83] = var88;
                                this.field7904[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field7868.length) {
                        int[] var174 = this.field7868[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field7869 == null || (arg6 & this.field7869[var176]) != 0) {
                                this.field7865[var176] -= Statics.field7855;
                                this.field7866[var176] -= Statics.field7920;
                                this.field7904[var176] -= Statics.field7921;
                                this.field7865[var176] = this.field7865[var176] * arg2 >> 7;
                                this.field7866[var176] = this.field7866[var176] * arg3 >> 7;
                                this.field7904[var176] = this.field7904[var176] * arg4 >> 7;
                                this.field7865[var176] += Statics.field7855;
                                this.field7866[var176] += Statics.field7920;
                                this.field7904[var176] += Statics.field7921;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (Statics.field7922) {
                    int var128 = arg7[6] * Statics.field7921 + arg7[0] * Statics.field7855 + arg7[3] * Statics.field7920 + 8192 >> 14;
                    int var129 = arg7[7] * Statics.field7921 + arg7[1] * Statics.field7855 + arg7[4] * Statics.field7920 + 8192 >> 14;
                    int var130 = arg7[8] * Statics.field7921 + arg7[2] * Statics.field7855 + arg7[5] * Statics.field7920 + 8192 >> 14;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    Statics.field7855 = var131;
                    Statics.field7920 = var132;
                    Statics.field7921 = var133;
                    Statics.field7922 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -Statics.field7855 * var134 + 8192 >> 14;
                int var138 = -Statics.field7920 * var135 + 8192 >> 14;
                int var139 = -Statics.field7921 * var136 + 8192 >> 14;
                int var140 = Statics.field7855 + var137;
                int var141 = Statics.field7920 + var138;
                int var142 = Statics.field7921 + var139;
                int[] var143 = new int[]{arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14};
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var127 * var136 + 8192 >> 14;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 8192 >> 14;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 8192 >> 14;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 8192 >> 14;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 8192 >> 14;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field7868.length) {
                        int[] var163 = this.field7868[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field7869 == null || (arg6 & this.field7869[var165]) != 0) {
                                int var166 = this.field7904[var165] * var150[2] + this.field7866[var165] * var150[1] + this.field7865[var165] * var150[0] + 8192 >> 14;
                                int var167 = this.field7904[var165] * var150[5] + this.field7866[var165] * var150[4] + this.field7865[var165] * var150[3] + 8192 >> 14;
                                int var168 = this.field7904[var165] * var150[8] + this.field7866[var165] * var150[7] + this.field7865[var165] * var150[6] + 8192 >> 14;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field7865[var165] = var169;
                                this.field7866[var165] = var170;
                                this.field7904[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7886 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field7886.length) {
                        int[] var179 = this.field7886[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field7887 == null || (arg6 & this.field7887[var181]) != 0) {
                                int var182 = (this.field7881[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field7881[var181] = (byte) var182;
                                if (this.field7889 != null) {
                                    this.field7889.field1097 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7903 != null) {
                    for (int var183 = 0; var183 < this.field7910; var183++) {
                        GlModelRelated6 var184 = this.field7903[var183];
                        GlModelRelated7 var185 = this.field7915[var183];
                        var185.field1090 = var185.field1090 & 0xFFFFFF | 255 - (this.field7881[var184.field1178] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field7886 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var187 = arg1[var186];
                    if (var187 < this.field7886.length) {
                        int[] var188 = this.field7886[var187];
                        for (int var189 = 0; var189 < var188.length; var189++) {
                            int var190 = var188[var189];
                            if (this.field7887 == null || (arg6 & this.field7887[var190]) != 0) {
                                int var191 = this.field7912[var190] & 0xFFFF;
                                int var192 = var191 >> 10 & 0x3F;
                                int var193 = var191 >> 7 & 0x7;
                                int var194 = var191 & 0x7F;
                                int var195 = arg2 + var192 & 0x3F;
                                int var196 = arg3 / 4 + var193;
                                if (var196 < 0) {
                                    var196 = 0;
                                } else if (var196 > 7) {
                                    var196 = 7;
                                }
                                int var197 = arg4 + var194;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 127) {
                                    var197 = 127;
                                }
                                this.field7912[var190] = (short) (var195 << 10 | var196 << 7 | var197);
                                if (this.field7889 != null) {
                                    this.field7889.field1097 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7903 != null) {
                    for (int var198 = 0; var198 < this.field7910; var198++) {
                        GlModelRelated6 var199 = this.field7903[var198];
                        GlModelRelated7 var200 = this.field7915[var198];
                        var200.field1090 = var200.field1090 & 0xFF000000 | Statics.field5084[this.field7912[var199.field1178] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field7878 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field7878.length) {
                        int[] var203 = this.field7878[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            GlModelRelated7 var205 = this.field7915[var203[var204]];
                            var205.field1092 += arg2;
                            var205.field1094 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7878 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field7878.length) {
                        int[] var208 = this.field7878[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            GlModelRelated7 var210 = this.field7915[var208[var209]];
                            var210.field1091 = var210.field1091 * arg2 >> 7;
                            var210.field1095 = var210.field1095 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7878 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field7878.length) {
                    int[] var213 = this.field7878[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        GlModelRelated7 var215 = this.field7915[var213[var214]];
                        var215.field1093 = var215.field1093 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @ObfuscatedName("yz.w(IIII)V")
    public void w(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            Statics.field7855 = 0;
            Statics.field7920 = 0;
            Statics.field7921 = 0;
            for (int var6 = 0; var6 < this.field7864; var6++) {
                Statics.field7855 += this.field7865[var6];
                Statics.field7920 += this.field7866[var6];
                Statics.field7921 += this.field7904[var6];
                var5++;
            }
            if (var5 > 0) {
                Statics.field7855 = Statics.field7855 / var5 + arg1;
                Statics.field7920 = Statics.field7920 / var5 + arg2;
                Statics.field7921 = Statics.field7921 / var5 + arg3;
            } else {
                Statics.field7855 = arg1;
                Statics.field7920 = arg2;
                Statics.field7921 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field7864; var7++) {
                this.field7865[var7] += arg1;
                this.field7866[var7] += arg2;
                this.field7904[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field7864; var8++) {
                this.field7865[var8] -= Statics.field7855;
                this.field7866[var8] -= Statics.field7920;
                this.field7904[var8] -= Statics.field7921;
                if (arg3 != 0) {
                    int var9 = Trig1.field3439[arg3];
                    int var10 = Trig1.field3447[arg3];
                    int var11 = this.field7866[var8] * var9 + this.field7865[var8] * var10 + 16383 >> 14;
                    this.field7866[var8] = this.field7866[var8] * var10 - this.field7865[var8] * var9 + 16383 >> 14;
                    this.field7865[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = Trig1.field3439[arg1];
                    int var13 = Trig1.field3447[arg1];
                    int var14 = this.field7866[var8] * var13 - this.field7904[var8] * var12 + 16383 >> 14;
                    this.field7904[var8] = this.field7904[var8] * var13 + this.field7866[var8] * var12 + 16383 >> 14;
                    this.field7866[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = Trig1.field3439[arg2];
                    int var16 = Trig1.field3447[arg2];
                    int var17 = this.field7904[var8] * var15 + this.field7865[var8] * var16 + 16383 >> 14;
                    this.field7904[var8] = this.field7904[var8] * var16 - this.field7865[var8] * var15 + 16383 >> 14;
                    this.field7865[var8] = var17;
                }
                this.field7865[var8] += Statics.field7855;
                this.field7866[var8] += Statics.field7920;
                this.field7904[var8] += Statics.field7921;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field7864; var18++) {
                this.field7865[var18] -= Statics.field7855;
                this.field7866[var18] -= Statics.field7920;
                this.field7904[var18] -= Statics.field7921;
                this.field7865[var18] = this.field7865[var18] * arg1 / 128;
                this.field7866[var18] = this.field7866[var18] * arg2 / 128;
                this.field7904[var18] = this.field7904[var18] * arg3 / 128;
                this.field7865[var18] += Statics.field7855;
                this.field7866[var18] += Statics.field7920;
                this.field7904[var18] += Statics.field7921;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field7883; var19++) {
                int var20 = (this.field7881[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field7881[var19] = (byte) var20;
            }
            if (this.field7889 != null) {
                this.field7889.field1097 = null;
            }
            if (this.field7903 != null) {
                for (int var21 = 0; var21 < this.field7910; var21++) {
                    GlModelRelated6 var22 = this.field7903[var21];
                    GlModelRelated7 var23 = this.field7915[var21];
                    var23.field1090 = var23.field1090 & 0xFFFFFF | 255 - (this.field7881[var22.field1178] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field7883; var24++) {
                int var25 = this.field7912[var24] & 0xFFFF;
                int var26 = var25 >> 10 & 0x3F;
                int var27 = var25 >> 7 & 0x7;
                int var28 = var25 & 0x7F;
                int var29 = arg1 + var26 & 0x3F;
                int var30 = arg2 / 4 + var27;
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 7) {
                    var30 = 7;
                }
                int var31 = arg3 + var28;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 127) {
                    var31 = 127;
                }
                this.field7912[var24] = (short) (var29 << 10 | var30 << 7 | var31);
            }
            if (this.field7889 != null) {
                this.field7889.field1097 = null;
            }
            if (this.field7903 != null) {
                for (int var32 = 0; var32 < this.field7910; var32++) {
                    GlModelRelated6 var33 = this.field7903[var32];
                    GlModelRelated7 var34 = this.field7915[var32];
                    var34.field1090 = var34.field1090 & 0xFF000000 | Statics.field5084[this.field7912[var33.field1178] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field7910; var35++) {
                GlModelRelated7 var36 = this.field7915[var35];
                var36.field1092 += arg1;
                var36.field1094 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field7910; var37++) {
                GlModelRelated7 var38 = this.field7915[var37];
                var38.field1091 = var38.field1091 * arg1 >> 7;
                var38.field1095 = var38.field1095 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field7910; var39++) {
                GlModelRelated7 var40 = this.field7915[var39];
                var40.field1093 = var40.field1093 + arg1 & 0x3FFF;
            }
        }
    }

    @ObfuscatedName("yz.ap(I[IIIIIZ)V")
    public void method266(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            Statics.field7855 = 0;
            Statics.field7920 = 0;
            Statics.field7921 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field7868.length) {
                    int[] var15 = this.field7868[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        Statics.field7855 += this.field7865[var17];
                        Statics.field7920 += this.field7866[var17];
                        Statics.field7921 += this.field7904[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                Statics.field7855 = Statics.field7855 / var12 + var9;
                Statics.field7920 = Statics.field7920 / var12 + var10;
                Statics.field7921 = Statics.field7921 / var12 + var11;
            } else {
                Statics.field7855 = var9;
                Statics.field7920 = var10;
                Statics.field7921 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field7868.length) {
                    int[] var23 = this.field7868[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field7865[var25] += var18;
                        this.field7866[var25] += var19;
                        this.field7904[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var27 = arg1[var26];
                if (var27 < this.field7868.length) {
                    int[] var28 = this.field7868[var27];
                    if ((arg5 & 0x1) == 0) {
                        for (int var29 = 0; var29 < var28.length; var29++) {
                            int var30 = var28[var29];
                            this.field7865[var30] -= Statics.field7855;
                            this.field7866[var30] -= Statics.field7920;
                            this.field7904[var30] -= Statics.field7921;
                            if (arg4 != 0) {
                                int var31 = Trig1.field3439[arg4];
                                int var32 = Trig1.field3447[arg4];
                                int var33 = this.field7866[var30] * var31 + this.field7865[var30] * var32 + 16383 >> 14;
                                this.field7866[var30] = this.field7866[var30] * var32 - this.field7865[var30] * var31 + 16383 >> 14;
                                this.field7865[var30] = var33;
                            }
                            if (arg2 != 0) {
                                int var34 = Trig1.field3439[arg2];
                                int var35 = Trig1.field3447[arg2];
                                int var36 = this.field7866[var30] * var35 - this.field7904[var30] * var34 + 16383 >> 14;
                                this.field7904[var30] = this.field7904[var30] * var35 + this.field7866[var30] * var34 + 16383 >> 14;
                                this.field7866[var30] = var36;
                            }
                            if (arg3 != 0) {
                                int var37 = Trig1.field3439[arg3];
                                int var38 = Trig1.field3447[arg3];
                                int var39 = this.field7904[var30] * var37 + this.field7865[var30] * var38 + 16383 >> 14;
                                this.field7904[var30] = this.field7904[var30] * var38 - this.field7865[var30] * var37 + 16383 >> 14;
                                this.field7865[var30] = var39;
                            }
                            this.field7865[var30] += Statics.field7855;
                            this.field7866[var30] += Statics.field7920;
                            this.field7904[var30] += Statics.field7921;
                        }
                    } else {
                        for (int var40 = 0; var40 < var28.length; var40++) {
                            int var41 = var28[var40];
                            this.field7865[var41] -= Statics.field7855;
                            this.field7866[var41] -= Statics.field7920;
                            this.field7904[var41] -= Statics.field7921;
                            if (arg2 != 0) {
                                int var42 = Trig1.field3439[arg2];
                                int var43 = Trig1.field3447[arg2];
                                int var44 = this.field7866[var41] * var43 - this.field7904[var41] * var42 + 16383 >> 14;
                                this.field7904[var41] = this.field7904[var41] * var43 + this.field7866[var41] * var42 + 16383 >> 14;
                                this.field7866[var41] = var44;
                            }
                            if (arg4 != 0) {
                                int var45 = Trig1.field3439[arg4];
                                int var46 = Trig1.field3447[arg4];
                                int var47 = this.field7866[var41] * var45 + this.field7865[var41] * var46 + 16383 >> 14;
                                this.field7866[var41] = this.field7866[var41] * var46 - this.field7865[var41] * var45 + 16383 >> 14;
                                this.field7865[var41] = var47;
                            }
                            if (arg3 != 0) {
                                int var48 = Trig1.field3439[arg3];
                                int var49 = Trig1.field3447[arg3];
                                int var50 = this.field7904[var41] * var48 + this.field7865[var41] * var49 + 16383 >> 14;
                                this.field7904[var41] = this.field7904[var41] * var49 - this.field7865[var41] * var48 + 16383 >> 14;
                                this.field7865[var41] = var50;
                            }
                            this.field7865[var41] += Statics.field7855;
                            this.field7866[var41] += Statics.field7920;
                            this.field7904[var41] += Statics.field7921;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var51 = 0; var51 < var8; var51++) {
                    int var52 = arg1[var51];
                    if (var52 < this.field7868.length) {
                        int[] var53 = this.field7868[var52];
                        for (int var54 = 0; var54 < var53.length; var54++) {
                            int var55 = var53[var54];
                            int var56 = this.field7906[var55];
                            int var57 = this.field7906[var55 + 1];
                            for (int var58 = var56; var58 < var57; var58++) {
                                int var59 = this.field7907[var58] - 1;
                                if (var59 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var60 = Trig1.field3439[arg4];
                                    int var61 = Trig1.field3447[arg4];
                                    int var62 = this.field7872[var59] * var60 + this.field7856[var59] * var61 + 16383 >> 14;
                                    this.field7872[var59] = (short) (this.field7872[var59] * var61 - this.field7856[var59] * var60 + 16383 >> 14);
                                    this.field7856[var59] = (short) var62;
                                }
                                if (arg2 != 0) {
                                    int var63 = Trig1.field3439[arg2];
                                    int var64 = Trig1.field3447[arg2];
                                    int var65 = this.field7872[var59] * var64 - this.field7873[var59] * var63 + 16383 >> 14;
                                    this.field7873[var59] = (short) (this.field7873[var59] * var64 + this.field7872[var59] * var63 + 16383 >> 14);
                                    this.field7872[var59] = (short) var65;
                                }
                                if (arg3 != 0) {
                                    int var66 = Trig1.field3439[arg3];
                                    int var67 = Trig1.field3447[arg3];
                                    int var68 = this.field7873[var59] * var66 + this.field7856[var59] * var67 + 16383 >> 14;
                                    this.field7873[var59] = (short) (this.field7873[var59] * var67 - this.field7856[var59] * var66 + 16383 >> 14);
                                    this.field7856[var59] = (short) var68;
                                }
                            }
                        }
                    }
                }
                if (this.field7890 == null && this.field7889 != null) {
                    this.field7889.field1097 = null;
                }
                if (this.field7890 != null) {
                    this.field7890.field1097 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field7868.length) {
                    int[] var71 = this.field7868[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field7865[var73] -= Statics.field7855;
                        this.field7866[var73] -= Statics.field7920;
                        this.field7904[var73] -= Statics.field7921;
                        this.field7865[var73] = this.field7865[var73] * arg2 >> 7;
                        this.field7866[var73] = this.field7866[var73] * arg3 >> 7;
                        this.field7904[var73] = this.field7904[var73] * arg4 >> 7;
                        this.field7865[var73] += Statics.field7855;
                        this.field7866[var73] += Statics.field7920;
                        this.field7904[var73] += Statics.field7921;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7886 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var75 = arg1[var74];
                    if (var75 < this.field7886.length) {
                        int[] var76 = this.field7886[var75];
                        for (int var77 = 0; var77 < var76.length; var77++) {
                            int var78 = var76[var77];
                            int var79 = (this.field7881[var78] & 0xFF) + arg2 * 8;
                            if (var79 < 0) {
                                var79 = 0;
                            } else if (var79 > 255) {
                                var79 = 255;
                            }
                            this.field7881[var78] = (byte) var79;
                        }
                        if (var76.length > 0 && this.field7889 != null) {
                            this.field7889.field1097 = null;
                        }
                    }
                }
                if (this.field7903 != null) {
                    for (int var80 = 0; var80 < this.field7910; var80++) {
                        GlModelRelated6 var81 = this.field7903[var80];
                        GlModelRelated7 var82 = this.field7915[var80];
                        var82.field1090 = var82.field1090 & 0xFFFFFF | 255 - (this.field7881[var81.field1178] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field7886 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var84 = arg1[var83];
                    if (var84 < this.field7886.length) {
                        int[] var85 = this.field7886[var84];
                        for (int var86 = 0; var86 < var85.length; var86++) {
                            int var87 = var85[var86];
                            int var88 = this.field7912[var87] & 0xFFFF;
                            int var89 = var88 >> 10 & 0x3F;
                            int var90 = var88 >> 7 & 0x7;
                            int var91 = var88 & 0x7F;
                            int var92 = arg2 + var89 & 0x3F;
                            int var93 = arg3 / 4 + var90;
                            if (var93 < 0) {
                                var93 = 0;
                            } else if (var93 > 7) {
                                var93 = 7;
                            }
                            int var94 = arg4 + var91;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 127) {
                                var94 = 127;
                            }
                            this.field7912[var87] = (short) (var92 << 10 | var93 << 7 | var94);
                        }
                        if (var85.length > 0 && this.field7889 != null) {
                            this.field7889.field1097 = null;
                        }
                    }
                }
                if (this.field7903 != null) {
                    for (int var95 = 0; var95 < this.field7910; var95++) {
                        GlModelRelated6 var96 = this.field7903[var95];
                        GlModelRelated7 var97 = this.field7915[var95];
                        var97.field1090 = var97.field1090 & 0xFF000000 | Statics.field5084[this.field7912[var96.field1178] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field7878 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field7878.length) {
                        int[] var100 = this.field7878[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            GlModelRelated7 var102 = this.field7915[var100[var101]];
                            var102.field1092 += arg2;
                            var102.field1094 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7878 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field7878.length) {
                        int[] var105 = this.field7878[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            GlModelRelated7 var107 = this.field7915[var105[var106]];
                            var107.field1091 = var107.field1091 * arg2 >> 7;
                            var107.field1095 = var107.field1095 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7878 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field7878.length) {
                    int[] var110 = this.field7878[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        GlModelRelated7 var112 = this.field7915[var110[var111]];
                        var112.field1093 = var112.field1093 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @ObfuscatedName("yz.ka()V")
    public void ka() {
        for (int var1 = 0; var1 < this.field7863; var1++) {
            this.field7865[var1] = this.field7865[var1] + 7 >> 4;
            this.field7866[var1] = this.field7866[var1] + 7 >> 4;
            this.field7904[var1] = this.field7904[var1] + 7 >> 4;
        }
        if (this.field7888 != null) {
            this.field7888.field1097 = null;
        }
        this.field7898 = false;
    }

    @ObfuscatedName("yz.ag(Lkc;IZ)V")
    public void method239(Matrix4x3 arg0, int arg1, boolean arg2) {
        if (this.field7869 == null) {
            return;
        }
        Matrix4x3 var4 = arg0;
        if (arg2) {
            var4 = this.field7891.field8077;
            var4.method5170(arg0);
        }
        float[] var5 = new float[3];
        for (int var6 = 0; var6 < this.field7864; var6++) {
            if ((arg1 & this.field7869[var6]) != 0) {
                var4.method5119((float) this.field7865[var6], (float) this.field7866[var6], (float) this.field7904[var6], var5);
                this.field7865[var6] = (int) var5[0];
                this.field7866[var6] = (int) var5[1];
                this.field7904[var6] = (int) var5[2];
            }
        }
    }

    @ObfuscatedName("yz.am()[Lct;")
    public ModelParticleEffector[] method413() {
        return this.field7909;
    }

    @ObfuscatedName("yz.aw()[Ldx;")
    public ModelParticleEmitter[] method276() {
        return this.field7908;
    }

    @ObfuscatedName("yz.ax(Lkc;)V")
    public void method294(Matrix4x3 arg0) {
        Matrix4x4 var2 = this.field7891.field8132;
        var2.method5385(arg0);
        if (this.field7908 != null) {
            for (int var3 = 0; var3 < this.field7908.length; var3++) {
                ModelParticleEmitter var4 = this.field7908[var3];
                ModelParticleEmitter var5 = var4;
                if (var4.field1372 != null) {
                    var5 = var4.field1372;
                }
                var5.field1378 = (int) (var2.field3480[8] * (float) this.field7904[var4.field1374] + var2.field3480[0] * (float) this.field7865[var4.field1374] + var2.field3480[4] * (float) this.field7866[var4.field1374] + var2.field3480[12]);
                var5.field1379 = (int) (var2.field3480[9] * (float) this.field7904[var4.field1374] + var2.field3480[1] * (float) this.field7865[var4.field1374] + var2.field3480[5] * (float) this.field7866[var4.field1374] + var2.field3480[13]);
                var5.field1380 = (int) (var2.field3480[10] * (float) this.field7904[var4.field1374] + var2.field3480[2] * (float) this.field7865[var4.field1374] + var2.field3480[6] * (float) this.field7866[var4.field1374] + var2.field3480[14]);
                var5.field1381 = (int) (var2.field3480[8] * (float) this.field7904[var4.field1375] + var2.field3480[0] * (float) this.field7865[var4.field1375] + var2.field3480[4] * (float) this.field7866[var4.field1375] + var2.field3480[12]);
                var5.field1377 = (int) (var2.field3480[9] * (float) this.field7904[var4.field1375] + var2.field3480[1] * (float) this.field7865[var4.field1375] + var2.field3480[5] * (float) this.field7866[var4.field1375] + var2.field3480[13]);
                var5.field1373 = (int) (var2.field3480[10] * (float) this.field7904[var4.field1375] + var2.field3480[2] * (float) this.field7865[var4.field1375] + var2.field3480[6] * (float) this.field7866[var4.field1375] + var2.field3480[14]);
                var5.field1384 = (int) (var2.field3480[8] * (float) this.field7904[var4.field1376] + var2.field3480[0] * (float) this.field7865[var4.field1376] + var2.field3480[4] * (float) this.field7866[var4.field1376] + var2.field3480[12]);
                var5.field1385 = (int) (var2.field3480[9] * (float) this.field7904[var4.field1376] + var2.field3480[1] * (float) this.field7865[var4.field1376] + var2.field3480[5] * (float) this.field7866[var4.field1376] + var2.field3480[13]);
                var5.field1386 = (int) (var2.field3480[10] * (float) this.field7904[var4.field1376] + var2.field3480[2] * (float) this.field7865[var4.field1376] + var2.field3480[6] * (float) this.field7866[var4.field1376] + var2.field3480[14]);
            }
        }
        if (this.field7909 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field7909.length; var6++) {
            ModelParticleEffector var7 = this.field7909[var6];
            ModelParticleEffector var8 = var7;
            if (var7.field1238 != null) {
                var8 = var7.field1238;
            }
            if (var7.field1237 == null) {
                var7.field1237 = new Matrix4x4(var2);
            } else {
                var7.field1237.method5412(var2);
            }
            var8.field1240 = (int) (var2.field3480[8] * (float) this.field7904[var7.field1239] + var2.field3480[0] * (float) this.field7865[var7.field1239] + var2.field3480[4] * (float) this.field7866[var7.field1239] + var2.field3480[12]);
            var8.field1241 = (int) (var2.field3480[9] * (float) this.field7904[var7.field1239] + var2.field3480[1] * (float) this.field7865[var7.field1239] + var2.field3480[5] * (float) this.field7866[var7.field1239] + var2.field3480[13]);
            var8.field1242 = (int) (var2.field3480[10] * (float) this.field7904[var7.field1239] + var2.field3480[2] * (float) this.field7865[var7.field1239] + var2.field3480[6] * (float) this.field7866[var7.field1239] + var2.field3480[14]);
        }
    }

    @ObfuscatedName("yz.ai(IILkc;ZI)Z")
    public boolean method272(int arg0, int arg1, Matrix4x3 arg2, boolean arg3, int arg4) {
        Matrix4x4 var6 = this.field7891.field8132;
        var6.method5385(arg2);
        var6.method5384(this.field7891.field8120);
        boolean var7 = false;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        int var10 = Integer.MAX_VALUE;
        int var11 = Integer.MIN_VALUE;
        if (!this.field7898) {
            this.method13082();
        }
        int var12 = this.field7880 - this.field7871 >> 1;
        int var13 = this.field7884 - this.field7899 >> 1;
        int var14 = this.field7911 - this.field7895 >> 1;
        int var15 = this.field7871 + var12;
        int var16 = this.field7899 + var13;
        int var17 = this.field7895 + var14;
        int var18 = var15 - (var12 << arg4);
        int var19 = var16 - (var13 << arg4);
        int var20 = var17 - (var14 << arg4);
        int var21 = (var12 << arg4) + var15;
        int var22 = (var13 << arg4) + var16;
        int var23 = (var14 << arg4) + var17;
        field7916[0] = var18;
        field7917[0] = var19;
        field7918[0] = var20;
        field7916[1] = var21;
        field7917[1] = var19;
        field7918[1] = var20;
        field7916[2] = var18;
        field7917[2] = var22;
        field7918[2] = var20;
        field7916[3] = var21;
        field7917[3] = var22;
        field7918[3] = var20;
        field7916[4] = var18;
        field7917[4] = var19;
        field7918[4] = var23;
        field7916[5] = var21;
        field7917[5] = var19;
        field7918[5] = var23;
        field7916[6] = var18;
        field7917[6] = var22;
        field7918[6] = var23;
        field7916[7] = var21;
        field7917[7] = var22;
        field7918[7] = var23;
        for (int var24 = 0; var24 < 8; var24++) {
            int var25 = field7916[var24];
            int var26 = field7917[var24];
            int var27 = field7918[var24];
            float var28 = var6.field3480[10] * (float) var27 + var6.field3480[2] * (float) var25 + var6.field3480[6] * (float) var26 + var6.field3480[14];
            float var29 = var6.field3480[11] * (float) var27 + var6.field3480[3] * (float) var25 + var6.field3480[7] * (float) var26 + var6.field3480[15];
            if (var28 >= -var29) {
                float var30 = var6.field3480[8] * (float) var27 + var6.field3480[0] * (float) var25 + var6.field3480[4] * (float) var26 + var6.field3480[12];
                float var31 = var6.field3480[9] * (float) var27 + var6.field3480[1] * (float) var25 + var6.field3480[5] * (float) var26 + var6.field3480[13];
                int var32 = (int) (this.field7891.field8124 * var30 / var29 + this.field7891.field8123);
                int var33 = (int) (this.field7891.field8224 * var31 / var29 + this.field7891.field8125);
                if (var32 < var8) {
                    var8 = var32;
                }
                if (var32 > var9) {
                    var9 = var32;
                }
                if (var33 < var10) {
                    var10 = var33;
                }
                if (var33 > var11) {
                    var11 = var33;
                }
                var7 = true;
            }
        }
        if (var7 && arg0 > var8 && arg0 < var9 && arg1 > var10 && arg1 < var11) {
            if (arg3) {
                return true;
            }
            if (this.field7891.field8041.length < this.field7870) {
                this.field7891.field8041 = new int[this.field7870];
                this.field7891.field8059 = new int[this.field7870];
            }
            int[] var34 = this.field7891.field8041;
            int[] var35 = this.field7891.field8059;
            for (int var36 = 0; var36 < this.field7864; var36++) {
                int var37 = this.field7865[var36];
                int var38 = this.field7866[var36];
                int var39 = this.field7904[var36];
                float var40 = var6.field3480[10] * (float) var39 + var6.field3480[2] * (float) var37 + var6.field3480[6] * (float) var38 + var6.field3480[14];
                float var41 = var6.field3480[11] * (float) var39 + var6.field3480[3] * (float) var37 + var6.field3480[7] * (float) var38 + var6.field3480[15];
                if (var40 >= -var41) {
                    float var42 = var6.field3480[8] * (float) var39 + var6.field3480[0] * (float) var37 + var6.field3480[4] * (float) var38 + var6.field3480[12];
                    float var43 = var6.field3480[9] * (float) var39 + var6.field3480[1] * (float) var37 + var6.field3480[5] * (float) var38 + var6.field3480[13];
                    int var44 = this.field7906[var36];
                    int var45 = this.field7906[var36 + 1];
                    for (int var46 = var44; var46 < var45; var46++) {
                        int var47 = this.field7907[var46] - 1;
                        if (var47 == -1) {
                            break;
                        }
                        var34[var47] = (int) (this.field7891.field8124 * var42 / var41 + this.field7891.field8123);
                        var35[var47] = (int) (this.field7891.field8224 * var43 / var41 + this.field7891.field8125);
                    }
                } else {
                    int var48 = this.field7906[var36];
                    int var49 = this.field7906[var36 + 1];
                    for (int var50 = var48; var50 < var49; var50++) {
                        int var51 = this.field7907[var50] - 1;
                        if (var51 == -1) {
                            break;
                        }
                        var34[this.field7907[var50] - 1] = -999999;
                    }
                }
            }
            for (int var52 = 0; var52 < this.field7883; var52++) {
                if (var34[this.field7882[var52]] != -999999 && var34[this.field7902[var52]] != -999999 && var34[this.field7896[var52]] != -999999 && this.method13086(arg0, arg1, var35[this.field7882[var52]], var35[this.field7902[var52]], var35[this.field7896[var52]], var34[this.field7882[var52]], var34[this.field7902[var52]], var34[this.field7896[var52]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("yz.gk(IIIIIIII)Z")
    public boolean method13086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @ObfuscatedName("yz.ga(Lna;)Lna;")
    public HardShadow ga(HardShadow arg0) {
        if (this.field7870 == 0) {
            return null;
        }
        if (!this.field7898) {
            this.method13082();
        }
        int var2;
        int var3;
        if (this.field7891.field8164 > 0) {
            var2 = this.field7871 - (this.field7891.field8164 * this.field7884 >> 8) >> this.field7891.field8092;
            var3 = this.field7880 - (this.field7891.field8164 * this.field7899 >> 8) >> this.field7891.field8092;
        } else {
            var2 = this.field7871 - (this.field7891.field8164 * this.field7899 >> 8) >> this.field7891.field8092;
            var3 = this.field7880 - (this.field7891.field8164 * this.field7884 >> 8) >> this.field7891.field8092;
        }
        int var4;
        int var5;
        if (this.field7891.field8165 > 0) {
            var4 = this.field7895 - (this.field7891.field8165 * this.field7884 >> 8) >> this.field7891.field8092;
            var5 = this.field7911 - (this.field7891.field8165 * this.field7899 >> 8) >> this.field7891.field8092;
        } else {
            var4 = this.field7895 - (this.field7891.field8165 * this.field7899 >> 8) >> this.field7891.field8092;
            var5 = this.field7911 - (this.field7891.field8165 * this.field7884 >> 8) >> this.field7891.field8092;
        }
        int var6 = var3 - var2 + 1;
        int var7 = var5 - var4 + 1;
        GlHardShadow var8 = (GlHardShadow) arg0;
        GlHardShadow var9;
        if (var8 != null && var8.method17110(var6, var7)) {
            var9 = var8;
            var8.method17118();
        } else {
            var9 = new GlHardShadow(this.field7891, var6, var7);
        }
        var9.method17115(var2, var4, var3, var5);
        this.method13096(var9);
        return var9;
    }

    @ObfuscatedName("yz.gc(Laln;)V")
    public void method13096(GlHardShadow arg0) {
        if (this.field7891.field8041.length < this.field7870) {
            this.field7891.field8041 = new int[this.field7870];
            this.field7891.field8059 = new int[this.field7870];
        }
        int[] var2 = this.field7891.field8041;
        int[] var3 = this.field7891.field8059;
        for (int var4 = 0; var4 < this.field7864; var4++) {
            int var5 = (this.field7865[var4] - (this.field7866[var4] * this.field7891.field8164 >> 8) >> this.field7891.field8092) - arg0.field10578;
            int var6 = (this.field7904[var4] - (this.field7866[var4] * this.field7891.field8165 >> 8) >> this.field7891.field8092) - arg0.field10575;
            int var7 = this.field7906[var4];
            int var8 = this.field7906[var4 + 1];
            for (int var9 = var7; var9 < var8; var9++) {
                int var10 = (this.field7907[var9] & 0xFFFF) - 1;
                if (var10 == -1) {
                    break;
                }
                var2[var10] = var5;
                var3[var10] = var6;
            }
        }
        for (int var11 = 0; var11 < this.field7877; var11++) {
            if (this.field7881 == null || this.field7881[var11] <= 128) {
                int var12 = this.field7882[var11] & 0xFFFF;
                int var13 = this.field7902[var11] & 0xFFFF;
                int var14 = this.field7896[var11] & 0xFFFF;
                int var15 = var2[var12];
                int var16 = var2[var13];
                int var17 = var2[var14];
                int var18 = var3[var12];
                int var19 = var3[var13];
                int var20 = var3[var14];
                if ((var15 - var16) * (var19 - var20) - (var17 - var16) * (var19 - var18) > 0) {
                    arg0.method17112(var18, var19, var20, var15, var16, var17);
                }
            }
        }
    }

    @ObfuscatedName("yz.as(Lkc;Ldy;I)V")
    public void method271(Matrix4x3 arg0, ScreenBoundingBox arg1, int arg2) {
        if ((arg2 & 0x2) != 0) {
            OpenGL.glPolygonMode(1032, 6913);
        }
        if (this.field7870 == 0) {
            return;
        }
        Matrix4x4 var4 = this.field7891.field8118;
        Matrix4x4 var5 = this.field7891.field8132;
        Matrix4x4 var6 = this.field7891.field8133;
        var5.method5385(arg0);
        var6.method5412(var5);
        var6.method5384(this.field7891.field8120);
        if (!this.field7898) {
            this.method13082();
        }
        float[] var7 = this.field7891.field8210;
        var5.method5390(0.0F, (float) this.field7899, 0.0F, var7);
        float var8 = var7[0];
        float var9 = var7[1];
        float var10 = var7[2];
        var5.method5390(0.0F, (float) this.field7884, 0.0F, var7);
        float var11 = var7[0];
        float var12 = var7[1];
        float var13 = var7[2];
        for (int var14 = 0; var14 < 6; var14++) {
            float[] var15 = this.field7891.field8218[var14];
            float var16 = var15[2] * var10 + var15[0] * var8 + var15[1] * var9 + var15[3] + (float) this.field7850;
            float var17 = var15[2] * var13 + var15[0] * var11 + var15[1] * var12 + var15[3] + (float) this.field7850;
            if (var16 < 0.0F && var17 < 0.0F) {
                return;
            }
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field7880 + this.field7871 >> 1;
            int var21 = this.field7911 + this.field7895 >> 1;
            short var23 = this.field7899;
            float var25 = var6.field3480[8] * (float) var21 + var6.field3480[0] * (float) var20 + var6.field3480[4] * (float) var23 + var6.field3480[12];
            float var26 = var6.field3480[9] * (float) var21 + var6.field3480[1] * (float) var20 + var6.field3480[5] * (float) var23 + var6.field3480[13];
            float var27 = var6.field3480[10] * (float) var21 + var6.field3480[2] * (float) var20 + var6.field3480[6] * (float) var23 + var6.field3480[14];
            float var28 = var6.field3480[11] * (float) var21 + var6.field3480[3] * (float) var20 + var6.field3480[7] * (float) var23 + var6.field3480[15];
            if (var27 >= -var28) {
                arg1.field1516 = (int) (this.field7891.field8124 * var25 / var28 + this.field7891.field8123);
                arg1.field1518 = (int) (this.field7891.field8224 * var26 / var28 + this.field7891.field8125);
            } else {
                var18 = true;
            }
            short var30 = this.field7884;
            float var32 = var6.field3480[8] * (float) var21 + var6.field3480[0] * (float) var20 + var6.field3480[4] * (float) var30 + var6.field3480[12];
            float var33 = var6.field3480[9] * (float) var21 + var6.field3480[1] * (float) var20 + var6.field3480[5] * (float) var30 + var6.field3480[13];
            float var34 = var6.field3480[10] * (float) var21 + var6.field3480[2] * (float) var20 + var6.field3480[6] * (float) var30 + var6.field3480[14];
            float var35 = var6.field3480[11] * (float) var21 + var6.field3480[3] * (float) var20 + var6.field3480[7] * (float) var30 + var6.field3480[15];
            if (var34 >= -var35) {
                arg1.field1519 = (int) (this.field7891.field8124 * var32 / var35 + this.field7891.field8123);
                arg1.field1520 = (int) (this.field7891.field8224 * var33 / var35 + this.field7891.field8125);
            } else {
                var18 = true;
            }
            if (var18) {
                if (var27 < -var28 && var34 < -var35) {
                    var19 = false;
                } else if (var27 < -var28) {
                    float var36 = (var27 + var28) / (var34 + var35) - 1.0F;
                    float var37 = (var32 - var25) * var36 + var25;
                    float var38 = (var33 - var26) * var36 + var26;
                    float var39 = (var35 - var28) * var36 + var28;
                    arg1.field1516 = (int) (this.field7891.field8124 * var37 / var39 + this.field7891.field8123);
                    arg1.field1518 = (int) (this.field7891.field8224 * var38 / var39 + this.field7891.field8125);
                } else if (var34 < -var35) {
                    float var40 = (var34 + var35) / (var27 + var28) - 1.0F;
                    float var41 = (var25 - var32) * var40 + var32;
                    float var42 = (var26 - var33) * var40 + var33;
                    float var43 = (var28 - var35) * var40 + var35;
                    arg1.field1519 = (int) (this.field7891.field8124 * var41 / var43 + this.field7891.field8123);
                    arg1.field1520 = (int) (this.field7891.field8224 * var42 / var43 + this.field7891.field8125);
                }
            }
            if (var19) {
                if (var27 / var28 > var34 / var35) {
                    float var44 = var4.field3480[0] * (float) this.field7850 + var25 + var4.field3480[12];
                    float var45 = var4.field3480[3] * (float) this.field7850 + var28 + var4.field3480[15];
                    arg1.field1517 = (int) (this.field7891.field8124 * var44 / var45 + (this.field7891.field8123 - (float) arg1.field1516));
                } else {
                    float var46 = var4.field3480[0] * (float) this.field7850 + var32 + var4.field3480[12];
                    float var47 = var4.field3480[3] * (float) this.field7850 + var35 + var4.field3480[15];
                    arg1.field1517 = (int) (this.field7891.field8124 * var46 / var47 + (this.field7891.field8123 - (float) arg1.field1519));
                }
                arg1.field1521 = true;
            }
        }
        this.field7891.method13311();
        this.field7891.method13282(var5);
        this.method13084();
        this.field7891.method13357();
        var5.method5384(this.field7891.field8116);
        this.method13085(var5);
        if ((arg2 & 0x2) != 0) {
            OpenGL.glPolygonMode(1028, 6914);
        }
    }

    @ObfuscatedName("yz.gm()V")
    public void method13084() {
        if (this.field7877 == 0) {
            return;
        }
        if (this.field7858 != 0) {
            this.method13093(true);
        }
        this.method13093(false);
        if (this.field7892 != null) {
            if (this.field7892.field1096 == null) {
                this.method13095((this.field7858 & 0x10) != 0);
            }
            if (this.field7892.field1096 != null) {
                this.field7891.method13322(this.field7890 != null);
                this.field7891.method13305(this.field7888, this.field7890, this.field7889, this.field7885);
                int var1 = this.field7919.length - 1;
                for (int var2 = 0; var2 < var1; var2++) {
                    int var3 = this.field7919[var2];
                    int var4 = this.field7919[var2 + 1];
                    int var5 = this.field7897[var3] & 0xFFFF;
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    this.field7891.method13313(var5, this.field7890 != null);
                    this.field7891.method13307(this.field7892.field1096, 4, var3 * 3, (var4 - var3) * 3);
                }
            }
        }
        this.method13081();
    }

    @ObfuscatedName("yz.gh(Lka;)V")
    public void method13085(Matrix4x4 arg0) {
        if (this.field7903 == null) {
            return;
        }
        Matrix4x4 var2 = this.field7891.field8087;
        this.field7891.method13281();
        this.field7891.RA(!this.field7913);
        this.field7891.method13322(false);
        this.field7891.method13305(this.field7891.field8221, null, null, this.field7891.field8211);
        for (int var3 = 0; var3 < this.field7910; var3++) {
            GlModelRelated6 var4 = this.field7903[var3];
            GlModelRelated7 var5 = this.field7915[var3];
            if (!var4.field1183 || !this.field7891.method600()) {
                float var6 = (float) (this.field7865[var4.field1179] + this.field7865[var4.field1175] + this.field7865[var4.field1177]) * 0.3333333F;
                float var7 = (float) (this.field7866[var4.field1179] + this.field7866[var4.field1175] + this.field7866[var4.field1177]) * 0.3333333F;
                float var8 = (float) (this.field7904[var4.field1179] + this.field7904[var4.field1175] + this.field7904[var4.field1177]) * 0.3333333F;
                float var9 = arg0.field3480[8] * var8 + arg0.field3480[0] * var6 + arg0.field3480[4] * var7 + arg0.field3480[12];
                float var10 = arg0.field3480[9] * var8 + arg0.field3480[1] * var6 + arg0.field3480[5] * var7 + arg0.field3480[13];
                float var11 = arg0.field3480[10] * var8 + arg0.field3480[2] * var6 + arg0.field3480[6] * var7 + arg0.field3480[14];
                float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field1184;
                var2.method5415(var5.field1093, var4.field1176 * var5.field1091 >> 7, var4.field1181 * var5.field1095 >> 7, (float) var5.field1092 + var9 - var9 * var12, (float) var5.field1094 + var10 - var10 * var12, var11 - var11 * var12);
                this.field7891.method13360(var2);
                int var13 = var5.field1090;
                OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                this.field7891.method13312(var4.field1180);
                this.field7891.method13327(var4.field1182);
                this.field7891.method13306(7, 0, 4);
            }
        }
        this.field7891.RA(true);
        this.field7891.method13357();
    }

    @ObfuscatedName("yz.ge(Z)V")
    public void method13095(boolean arg0) {
        if (this.field7891.field8226.data.length < this.field7877 * 6) {
            this.field7891.field8226 = new GpuPacket((this.field7877 + 100) * 6);
        } else {
            this.field7891.field8226.pos = 0;
        }
        GpuPacket var2 = this.field7891.field8226;
        if (this.field7891.field8149) {
            for (int var3 = 0; var3 < this.field7877; var3++) {
                var2.p2(this.field7882[var3]);
                var2.p2(this.field7902[var3]);
                var2.p2(this.field7896[var3]);
            }
        } else {
            for (int var4 = 0; var4 < this.field7877; var4++) {
                var2.ip2(this.field7882[var4]);
                var2.ip2(this.field7902[var4]);
                var2.ip2(this.field7896[var4]);
            }
        }
        if (var2.pos == 0) {
            return;
        }
        if (arg0) {
            if (this.field7893 == null) {
                this.field7893 = this.field7891.method13345(5123, var2.data, var2.pos, true);
            } else {
                this.field7893.method2338(5123, var2.data, var2.pos);
            }
            this.field7892.field1096 = this.field7893;
        } else {
            this.field7892.field1096 = this.field7891.method13345(5123, var2.data, var2.pos, false);
        }
        if (!arg0) {
            this.field7900 = true;
        }
    }

    @ObfuscatedName("yz.gr(Z)V")
    public void method13093(boolean arg0) {
        boolean var2 = this.field7889 != null && this.field7889.field1097 == null;
        boolean var3 = this.field7890 != null && this.field7890.field1097 == null;
        boolean var4 = this.field7888 != null && this.field7888.field1097 == null;
        boolean var5 = this.field7885 != null && this.field7885.field1097 == null;
        if (arg0) {
            var2 &= (this.field7858 & 0x2) != 0;
            var3 &= (this.field7858 & 0x4) != 0;
            var4 &= (this.field7858 & 0x1) != 0;
            var5 &= (this.field7858 & 0x8) != 0;
        }
        byte var6 = 0;
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var4) {
            var7 = var6;
            var6 = (byte) (var6 + 12);
        }
        if (var2) {
            var8 = var6;
            var6 = (byte) (var6 + 4);
        }
        if (var3) {
            var9 = var6;
            var6 = (byte) (var6 + 12);
        }
        if (var5) {
            var10 = var6;
            var6 = (byte) (var6 + 8);
        }
        if (var6 == 0) {
            return;
        }
        if (this.field7891.field8226.data.length < this.field7870 * var6) {
            this.field7891.field8226 = new GpuPacket((this.field7870 + 100) * var6);
        } else {
            this.field7891.field8226.pos = 0;
        }
        GpuPacket var11 = this.field7891.field8226;
        if (var4) {
            if (this.field7891.field8149) {
                for (int var12 = 0; var12 < this.field7864; var12++) {
                    int var13 = Stream.floatToRawIntBits((float) this.field7865[var12]);
                    int var14 = Stream.floatToRawIntBits((float) this.field7866[var12]);
                    int var15 = Stream.floatToRawIntBits((float) this.field7904[var12]);
                    int var16 = this.field7906[var12];
                    int var17 = this.field7906[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field7907[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        var11.pos = var6 * var19;
                        var11.p4(var13);
                        var11.p4(var14);
                        var11.p4(var15);
                    }
                }
            } else {
                for (int var20 = 0; var20 < this.field7864; var20++) {
                    int var21 = Stream.floatToRawIntBits((float) this.field7865[var20]);
                    int var22 = Stream.floatToRawIntBits((float) this.field7866[var20]);
                    int var23 = Stream.floatToRawIntBits((float) this.field7904[var20]);
                    int var24 = this.field7906[var20];
                    int var25 = this.field7906[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = (this.field7907[var26] & 0xFFFF) - 1;
                        if (var27 == -1) {
                            break;
                        }
                        var11.pos = var6 * var27;
                        var11.ip4(var21);
                        var11.ip4(var22);
                        var11.ip4(var23);
                    }
                }
            }
        }
        if (var2) {
            if (this.field7890 == null) {
                short[] var28;
                short[] var29;
                short[] var30;
                byte[] var31;
                if (this.field7875 == null) {
                    var28 = this.field7856;
                    var29 = this.field7872;
                    var30 = this.field7873;
                    var31 = this.field7874;
                } else {
                    var28 = this.field7875.field1185;
                    var29 = this.field7875.field1186;
                    var30 = this.field7875.field1187;
                    var31 = this.field7875.field1188;
                }
                float var32 = this.field7891.field8145[0];
                float var33 = this.field7891.field8145[1];
                float var34 = this.field7891.field8145[2];
                float var35 = this.field7891.field8158;
                float var36 = this.field7891.field8159 * 768.0F / (float) this.field7860;
                float var37 = this.field7891.field8121 * 768.0F / (float) this.field7860;
                for (int var38 = 0; var38 < this.field7883; var38++) {
                    int var39 = this.method13088(this.field7912[var38], this.field7897[var38], this.field7859, this.field7881[var38]);
                    float var40 = (float) (var39 >>> 24) * this.field7891.field8136;
                    float var41 = (float) (var39 >> 16 & 0xFF) * this.field7891.field8156;
                    float var42 = (float) (var39 >> 8 & 0xFF) * this.field7891.field8179;
                    short var43 = this.field7882[var38];
                    short var44 = (short) var31[var43];
                    float var45;
                    if (var44 == 0) {
                        var45 = ((float) var30[var43] * var34 + (float) var28[var43] * var32 + (float) var29[var43] * var33) * 0.0026041667F;
                    } else {
                        var45 = ((float) var30[var43] * var34 + (float) var28[var43] * var32 + (float) var29[var43] * var33) / (float) (var44 * 256);
                    }
                    float var46 = var35 + var45 * (var45 < 0.0F ? var37 : var36);
                    int var47 = (int) (var40 * var46);
                    if (var47 < 0) {
                        var47 = 0;
                    } else if (var47 > 255) {
                        var47 = 255;
                    }
                    int var48 = (int) (var41 * var46);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var42 * var46);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var11.pos = var6 * var43 + var8;
                    var11.p1(var47);
                    var11.p1(var48);
                    var11.p1(var49);
                    var11.p1(255 - (this.field7881[var38] & 0xFF));
                    short var50 = this.field7902[var38];
                    short var51 = (short) var31[var50];
                    float var52;
                    if (var51 == 0) {
                        var52 = ((float) var30[var50] * var34 + (float) var28[var50] * var32 + (float) var29[var50] * var33) * 0.0026041667F;
                    } else {
                        var52 = ((float) var30[var50] * var34 + (float) var28[var50] * var32 + (float) var29[var50] * var33) / (float) (var51 * 256);
                    }
                    float var53 = var35 + var52 * (var52 < 0.0F ? var37 : var36);
                    int var54 = (int) (var40 * var53);
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 255) {
                        var54 = 255;
                    }
                    int var55 = (int) (var41 * var53);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var42 * var53);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var11.pos = var6 * var50 + var8;
                    var11.p1(var54);
                    var11.p1(var55);
                    var11.p1(var56);
                    var11.p1(255 - (this.field7881[var38] & 0xFF));
                    short var57 = this.field7896[var38];
                    short var58 = (short) var31[var57];
                    float var59;
                    if (var58 == 0) {
                        var59 = ((float) var30[var57] * var34 + (float) var28[var57] * var32 + (float) var29[var57] * var33) * 0.0026041667F;
                    } else {
                        var59 = ((float) var30[var57] * var34 + (float) var28[var57] * var32 + (float) var29[var57] * var33) / (float) (var58 * 256);
                    }
                    float var60 = var35 + var59 * (var59 < 0.0F ? var37 : var36);
                    int var61 = (int) (var40 * var60);
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 255) {
                        var61 = 255;
                    }
                    int var62 = (int) (var41 * var60);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var42 * var60);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var11.pos = var6 * var57 + var8;
                    var11.p1(var61);
                    var11.p1(var62);
                    var11.p1(var63);
                    var11.p1(255 - (this.field7881[var38] & 0xFF));
                }
            } else {
                for (int var64 = 0; var64 < this.field7883; var64++) {
                    int var65 = this.method13088(this.field7912[var64], this.field7897[var64], this.field7859, this.field7881[var64]);
                    var11.pos = (this.field7882[var64] & 0xFFFF) * var6 + var8;
                    var11.p4(var65);
                    var11.pos = (this.field7902[var64] & 0xFFFF) * var6 + var8;
                    var11.p4(var65);
                    var11.pos = (this.field7896[var64] & 0xFFFF) * var6 + var8;
                    var11.p4(var65);
                }
            }
        }
        if (var3) {
            short[] var66;
            short[] var67;
            short[] var68;
            byte[] var69;
            if (this.field7875 == null) {
                var66 = this.field7856;
                var67 = this.field7872;
                var68 = this.field7873;
                var69 = this.field7874;
            } else {
                var66 = this.field7875.field1185;
                var67 = this.field7875.field1186;
                var68 = this.field7875.field1187;
                var69 = this.field7875.field1188;
            }
            float var70 = 3.0F / (float) this.field7860;
            float var71 = 3.0F / (float) (this.field7860 / 2 + this.field7860);
            var11.pos = var9;
            if (this.field7891.field8149) {
                for (int var72 = 0; var72 < this.field7870; var72++) {
                    int var73 = var69[var72] & 0xFF;
                    if (var73 == 0) {
                        var11.method16851((float) var66[var72] * var71);
                        var11.method16851((float) var67[var72] * var71);
                        var11.method16851((float) var68[var72] * var71);
                    } else {
                        float var74 = var70 / (float) var73;
                        var11.method16851((float) var66[var72] * var74);
                        var11.method16851((float) var67[var72] * var74);
                        var11.method16851((float) var68[var72] * var74);
                    }
                    var11.pos += var6 - 12;
                }
            } else {
                for (int var75 = 0; var75 < this.field7870; var75++) {
                    int var76 = var69[var75] & 0xFF;
                    if (var76 == 0) {
                        var11.method16855((float) var66[var75] * var71);
                        var11.method16855((float) var67[var75] * var71);
                        var11.method16855((float) var68[var75] * var71);
                    } else {
                        float var77 = var70 / (float) var76;
                        var11.method16855((float) var66[var75] * var77);
                        var11.method16855((float) var67[var75] * var77);
                        var11.method16855((float) var68[var75] * var77);
                    }
                    var11.pos += var6 - 12;
                }
            }
        }
        if (var5) {
            var11.pos = var10;
            if (this.field7891.field8149) {
                for (int var78 = 0; var78 < this.field7870; var78++) {
                    var11.method16851(this.field7876[var78]);
                    var11.method16851(this.field7901[var78]);
                    var11.pos += var6 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field7870; var79++) {
                    var11.method16855(this.field7876[var79]);
                    var11.method16855(this.field7901[var79]);
                    var11.pos += var6 - 8;
                }
            }
        }
        var11.pos = this.field7870 * var6;
        GlInterfaceRelated var80;
        if (arg0) {
            if (this.field7894 == null) {
                this.field7894 = this.field7891.method13301(var6, var11.data, var11.pos, true);
            } else {
                this.field7894.method2234(var6, var11.data, var11.pos);
            }
            var80 = this.field7894;
            this.field7858 = 0;
        } else {
            var80 = this.field7891.method13301(var6, var11.data, var11.pos, false);
            this.field7900 = true;
        }
        if (var4) {
            this.field7888.field1097 = var80;
            this.field7888.field1099 = var7;
        }
        if (var5) {
            this.field7885.field1097 = var80;
            this.field7885.field1099 = var10;
        }
        if (var2) {
            this.field7889.field1097 = var80;
            this.field7889.field1099 = var8;
        }
        if (var3) {
            this.field7890.field1097 = var80;
            this.field7890.field1099 = var9;
        }
    }

    @ObfuscatedName("yz.gf(ISIB)I")
    public int method13088(int arg0, short arg1, int arg2, byte arg3) {
        int var5 = Statics.field5084[method13089(arg0, arg2)];
        if (arg1 != -1) {
            Material var6 = this.field7891.field400.method889(arg1 & 0xFFFF);
            int var7 = var6.field1266 & 0xFF;
            if (var7 != 0) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg2 * 131586;
                }
                if (var7 == 256) {
                    var5 = var8;
                } else {
                    int var10 = 256 - var7;
                    var5 = ((var5 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((var5 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field1267 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (var5 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (var5 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var5 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                var5 = (var14 >> 8) + ((var12 & 0xFF00) << 8) + (var13 & 0xFF00);
            }
        }
        return var5 << 8 | 255 - (arg3 & 0xFF);
    }

    @ObfuscatedName("yz.gl(II)I")
    public static final int method13089(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
