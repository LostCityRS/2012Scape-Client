import deob.ObfuscatedName;
import sun.misc.Unsafe;

import java.nio.ByteBuffer;

@ObfuscatedName("yg")
public class GpuModel extends Model {

    @ObfuscatedName("yg.c")
    public final GpuToolkit field7925;

    @ObfuscatedName("yg.m")
    public int field7923;

    @ObfuscatedName("yg.t")
    public int field7952;

    @ObfuscatedName("yg.l")
    public short field7928;

    @ObfuscatedName("yg.f")
    public short field7929;

    @ObfuscatedName("yg.d")
    public int field7930;

    @ObfuscatedName("yg.z")
    public int field7959;

    @ObfuscatedName("yg.n")
    public int[] field7932;

    @ObfuscatedName("yg.o")
    public int[] field7931;

    @ObfuscatedName("yg.q")
    public int[] field7934;

    @ObfuscatedName("yg.p")
    public int[][] field7935;

    @ObfuscatedName("yg.w")
    public short[] field7978;

    @ObfuscatedName("yg.b")
    public int field7937;

    @ObfuscatedName("yg.x")
    public short[] field7994;

    @ObfuscatedName("yg.i")
    public short[] field7954;

    @ObfuscatedName("yg.v")
    public short[] field7924;

    @ObfuscatedName("yg.k")
    public short[] field7960;

    @ObfuscatedName("yg.h")
    public short[] field7942;

    @ObfuscatedName("yg.r")
    public byte[] field7973;

    @ObfuscatedName("yg.g")
    public float[] field7944;

    @ObfuscatedName("yg.y")
    public float[] field7945;

    @ObfuscatedName("yg.e")
    public GpuModelRelated3 field7955;

    @ObfuscatedName("yg.ay")
    public int field7947;

    @ObfuscatedName("yg.af")
    public int field7948;

    @ObfuscatedName("yg.ar")
    public short[] field7949;

    @ObfuscatedName("yg.an")
    public byte[] field7950;

    @ObfuscatedName("yg.ap")
    public short[] field7951;

    @ObfuscatedName("yg.ag")
    public short[] field7974;

    @ObfuscatedName("yg.as")
    public short[] field7953;

    @ObfuscatedName("yg.ai")
    public short[] field7936;

    @ObfuscatedName("yg.ao")
    public int[][] field7933;

    @ObfuscatedName("yg.al")
    public short[] field7941;

    @ObfuscatedName("yg.at")
    public GlModelRelated2 field7957;

    @ObfuscatedName("yg.ax")
    public GlModelRelated3 field7958;

    @ObfuscatedName("yg.aw")
    public GlModelRelated3 field7927;

    @ObfuscatedName("yg.aa")
    public GlModelRelated3 field7956;

    @ObfuscatedName("yg.am")
    public GlModelRelated3 field7961;

    @ObfuscatedName("yg.ad")
    public boolean field7962;

    @ObfuscatedName("yg.az")
    public boolean field7963;

    @ObfuscatedName("yg.ak")
    public boolean field7964;

    @ObfuscatedName("yg.av")
    public boolean field7940;

    @ObfuscatedName("yg.aj")
    public int field7980;

    @ObfuscatedName("yg.ah")
    public int field7967;

    @ObfuscatedName("yg.au")
    public boolean field7968;

    @ObfuscatedName("yg.ae")
    public int field7969;

    @ObfuscatedName("yg.ac")
    public int field7970;

    @ObfuscatedName("yg.aq")
    public int field7971;

    @ObfuscatedName("yg.ab")
    public int field7972;

    @ObfuscatedName("yg.bq")
    public int field7982;

    @ObfuscatedName("yg.bz")
    public int field7939;

    @ObfuscatedName("yg.bv")
    public int[] field7975;

    @ObfuscatedName("yg.bj")
    public int[] field7966;

    @ObfuscatedName("yg.bf")
    public int[] field7977;

    @ObfuscatedName("yg.bt")
    public int[] field7993;

    @ObfuscatedName("yg.bg")
    public short[] field7979;

    @ObfuscatedName("yg.bl")
    public ModelParticleEmitter[] field7985;

    @ObfuscatedName("yg.bk")
    public ModelParticleEffector[] field7981;

    @ObfuscatedName("yg.bs")
    public int field7938;

    @ObfuscatedName("yg.bn")
    public GlModelRelated4[] field7983;

    @ObfuscatedName("yg.ba")
    public GlModelRelated5[] field7984;

    @ObfuscatedName("yg.bd")
    public int[][] field7943;

    @ObfuscatedName("yg.bc")
    public long[] field7946;

    @ObfuscatedName("yg.br")
    public float[] field7987;

    @ObfuscatedName("yg.bp")
    public int[] field7988;

    @ObfuscatedName("yg.bi")
    public int[] field7989;

    @ObfuscatedName("yg.bx")
    public final int[] field7990;

    @ObfuscatedName("yg.bm")
    public final int[] field7976;

    @ObfuscatedName("yg.bb")
    public final int[] field7992;

    @ObfuscatedName("yg.be")
    public int field7965;

    @ObfuscatedName("yg.bw")
    public int field7926;

    @ObfuscatedName("yg.bo")
    public int field7995;

    @ObfuscatedName("yg.bh")
    public boolean field7996;

    public GpuModel(GpuToolkit arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field7930 = 0;
        this.field7959 = 0;
        this.field7937 = 0;
        this.field7947 = 0;
        this.field7948 = 0;
        this.field7962 = false;
        this.field7963 = true;
        this.field7964 = false;
        this.field7940 = false;
        this.field7968 = false;
        this.field7987 = new float[2];
        this.field7988 = new int[1];
        this.field7989 = new int[1];
        this.field7990 = new int[8];
        this.field7976 = new int[8];
        this.field7992 = new int[8];
        this.field7925 = arg0;
        this.field7923 = arg1;
        this.field7952 = arg2;
        this.field7962 = arg4;
        if (arg3 || GpuModelFlags.method4166(this.field7923, this.field7952)) {
            this.field7958 = new GlModelRelated3(GpuModelFlags.method4171(this.field7923, this.field7952));
        }
        if (arg3 || GpuModelFlags.method4169(this.field7923, this.field7952)) {
            this.field7961 = new GlModelRelated3(GpuModelFlags.method4224(this.field7923, this.field7952));
        }
        if (arg3 || GpuModelFlags.method4233(this.field7923, this.field7952)) {
            this.field7927 = new GlModelRelated3(GpuModelFlags.method4173(this.field7923, this.field7952));
        }
        if (arg3 || GpuModelFlags.method4167(this.field7923, this.field7952)) {
            this.field7956 = new GlModelRelated3(GpuModelFlags.method4172(this.field7923, this.field7952));
        }
        if (arg3 || GpuModelFlags.method4179(this.field7923, this.field7952)) {
            this.field7957 = new GlModelRelated2(GpuModelFlags.method4175(this.field7923, this.field7952));
        }
        if (arg3 && arg4) {
            this.field7958.field2537 = this.field7958.field2536 = this.field7925.method13584(this.field7962);
            this.field7961.field2537 = this.field7961.field2536 = this.field7925.method13584(this.field7962);
            this.field7927.field2537 = this.field7927.field2536 = this.field7925.method13584(this.field7962);
            this.field7956.field2537 = this.field7956.field2536 = this.field7925.method13584(this.field7962);
        }
    }

    public GpuModel(GpuToolkit arg0, ModelUnlit arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        MaterialTypeList var7 = arg0.field400;
        int[] var8 = new int[arg1.field1342];
        this.field7993 = new int[arg1.field1315 + 1];
        for (int var9 = 0; var9 < arg1.field1342; var9++) {
            if (arg1.field1345 == null || arg1.field1345[var9] != 2) {
                if (arg1.field1330 != null && arg1.field1330[var9] != -1) {
                    Material var10 = var7.method889(arg1.field1330[var9] & 0xFFFF);
                    if (((this.field7952 & 0x40) == 0 || !var10.field1250) && var10.field1265) {
                        continue;
                    }
                }
                int var10003 = this.field7947 * -1431655765;
                int var10001 = this.field7947 * -1431655765;
                this.field7947 = (var10003 + 1) * 3;
                var8[var10001] = var9;
                this.field7993[arg1.field1322[var9]]++;
                this.field7993[arg1.field1323[var9]]++;
                this.field7993[arg1.field1324[var9]]++;
            }
        }
        this.field7948 = this.field7947 * -1431655765;
        long[] var11 = new long[this.field7947 * -1431655765];
        boolean var12 = (this.field7923 & 0x100) != 0;
        for (int var13 = 0; var13 < this.field7947 * -1431655765; var13++) {
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
                                this.field7964 = true;
                            }
                        }
                    }
                }
                if (var20) {
                    var11[var13] = Long.MAX_VALUE;
                    this.field7948--;
                    continue;
                }
            }
            short var25 = -1;
            if (arg1.field1330 != null) {
                var25 = arg1.field1330[var14];
                if (var25 != -1) {
                    var15 = var7.method889(var25 & 0xFFFF);
                    if ((this.field7952 & 0x40) != 0 && var15.field1250) {
                        var25 = -1;
                        var15 = null;
                    } else {
                        var18 = var15.field1270;
                        var19 = var15.field1248;
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
            this.field7964 |= var26;
            this.field7940 |= var15 != null && (var15.field1268 != 0 || var15.field1261 != 0);
        }
        Algorithms.method12650(var11, var8);
        this.field7930 = arg1.field1328;
        this.field7959 = arg1.field1315;
        this.field7932 = arg1.field1316;
        this.field7931 = arg1.field1320;
        this.field7934 = arg1.field1318;
        this.field7978 = arg1.field1321;
        GpuVertexNormal[] var31 = new GpuVertexNormal[this.field7959];
        this.field7985 = arg1.field1347;
        this.field7981 = arg1.field1346;
        if (arg1.field1349 != null) {
            this.field7938 = arg1.field1349.length;
            this.field7983 = new GlModelRelated4[this.field7938];
            this.field7984 = new GlModelRelated5[this.field7938];
            for (int var32 = 0; var32 < this.field7938; var32++) {
                ModelBillboard var33 = arg1.field1349[var32];
                BillboardType var34 = BillboardType.method3666(var33.field1512);
                int var35 = -1;
                for (int var36 = 0; var36 < this.field7947 * -1431655765; var36++) {
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
                this.field7983[var32] = new GlModelRelated4(var35, arg1.field1322[var33.field1513], arg1.field1323[var33.field1513], arg1.field1324[var33.field1513], var34.field2658, var34.field2662, var34.field2661, var34.field2665, var34.field2664, var34.field2667, var34.field2666, var33.field1514);
                this.field7984[var32] = new GlModelRelated5(var38);
            }
        }
        int var39 = this.field7947;
        this.field7994 = new short[var39];
        this.field7954 = new short[var39];
        this.field7924 = new short[var39];
        this.field7960 = new short[var39];
        this.field7942 = new short[var39];
        this.field7973 = new byte[var39];
        this.field7944 = new float[var39];
        this.field7945 = new float[var39];
        this.field7949 = new short[this.field7947 * -1431655765];
        this.field7950 = new byte[this.field7947 * -1431655765];
        this.field7951 = new short[this.field7947 * -1431655765];
        this.field7974 = new short[this.field7947 * -1431655765];
        this.field7953 = new short[this.field7947 * -1431655765];
        this.field7936 = new short[this.field7947 * -1431655765];
        if (arg1.field1333 != null) {
            this.field7941 = new short[this.field7947 * -1431655765];
        }
        this.field7928 = (short) arg3;
        this.field7929 = (short) arg4;
        this.field7979 = new short[var39];
        this.field7946 = new long[var39];
        int var40 = 0;
        for (int var41 = 0; var41 < arg1.field1315; var41++) {
            int var42 = this.field7993[var41];
            this.field7993[var41] = var40;
            var40 += var42;
            var31[var41] = new GpuVertexNormal();
        }
        this.field7993[arg1.field1315] = var40;
        ModelRelated1 var43 = this.method349(arg1, var8, this.field7947 * -1431655765);
        GlTriangleNormal[] var44 = new GlTriangleNormal[arg1.field1342];
        for (int var45 = 0; var45 < arg1.field1342; var45++) {
            short var46 = arg1.field1322[var45];
            short var47 = arg1.field1323[var45];
            short var48 = arg1.field1324[var45];
            int var49 = this.field7932[var47] - this.field7932[var46];
            int var50 = this.field7931[var47] - this.field7931[var46];
            int var51 = this.field7934[var47] - this.field7934[var46];
            int var52 = this.field7932[var48] - this.field7932[var46];
            int var53 = this.field7931[var48] - this.field7931[var46];
            int var54 = this.field7934[var48] - this.field7934[var46];
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
                GpuVertexNormal var63 = var31[var46];
                var63.field2558 += var59;
                var63.field2557 += var60;
                var63.field2556 += var61;
                var63.field2559++;
                GpuVertexNormal var64 = var31[var47];
                var64.field2558 += var59;
                var64.field2557 += var60;
                var64.field2556 += var61;
                var64.field2559++;
                GpuVertexNormal var65 = var31[var48];
                var65.field2558 += var59;
                var65.field2557 += var60;
                var65.field2556 += var61;
                var65.field2559++;
            } else if (var62 == 1) {
                GlTriangleNormal var66 = var44[var45] = new GlTriangleNormal();
                var66.field2530 = var59;
                var66.field2531 = var60;
                var66.field2532 = var61;
            }
        }
        for (int var67 = 0; var67 < this.field7947 * -1431655765; var67++) {
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
            if (var72 != -1 && (this.field7952 & 0x40) != 0) {
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
                            this.method416(arg1.field1316[var119], arg1.field1320[var119], arg1.field1318[var119], var122, var123, var124, var125, var128, var126, var127, this.field7987);
                            var74 = this.field7987[0];
                            var75 = this.field7987[1];
                            this.method416(arg1.field1316[var120], arg1.field1320[var120], arg1.field1318[var120], var122, var123, var124, var125, var128, var126, var127, this.field7987);
                            var76 = this.field7987[0];
                            var77 = this.field7987[1];
                            this.method416(arg1.field1316[var121], arg1.field1320[var121], arg1.field1318[var121], var122, var123, var124, var125, var128, var126, var127, this.field7987);
                            var78 = this.field7987[0];
                            var79 = this.field7987[1];
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
                            this.method241(arg1.field1316[var119], arg1.field1320[var119], arg1.field1318[var119], var122, var123, var124, var82, var125, var126, var127, var130, var131, this.field7987);
                            var74 = this.field7987[0];
                            var75 = this.field7987[1];
                            this.method241(arg1.field1316[var120], arg1.field1320[var120], arg1.field1318[var120], var122, var123, var124, var82, var125, var126, var127, var130, var131, this.field7987);
                            var76 = this.field7987[0];
                            var77 = this.field7987[1];
                            this.method241(arg1.field1316[var121], arg1.field1320[var121], arg1.field1318[var121], var122, var123, var124, var82, var125, var126, var127, var130, var131, this.field7987);
                            var78 = this.field7987[0];
                            var79 = this.field7987[1];
                        } else if (var83 == 3) {
                            this.method238(arg1.field1316[var119], arg1.field1320[var119], arg1.field1318[var119], var122, var123, var124, var125, var126, var127, this.field7987);
                            var74 = this.field7987[0];
                            var75 = this.field7987[1];
                            this.method238(arg1.field1316[var120], arg1.field1320[var120], arg1.field1318[var120], var122, var123, var124, var125, var126, var127, this.field7987);
                            var76 = this.field7987[0];
                            var77 = this.field7987[1];
                            this.method238(arg1.field1316[var121], arg1.field1320[var121], arg1.field1318[var121], var122, var123, var124, var125, var126, var127, this.field7987);
                            var78 = this.field7987[0];
                            var79 = this.field7987[1];
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
                GpuVertexNormal var153 = var31[var150];
                this.field7951[var67] = this.method13116(arg1, var150, var67, var148, var153.field2558, var153.field2557, var153.field2556, var153.field2559, var74, var75);
                GpuVertexNormal var154 = var31[var151];
                this.field7974[var67] = this.method13116(arg1, var151, var67, (long) var80 + var148, var154.field2558, var154.field2557, var154.field2556, var154.field2559, var76, var77);
                GpuVertexNormal var155 = var31[var152];
                this.field7953[var67] = this.method13116(arg1, var152, var67, (long) var81 + var148, var155.field2558, var155.field2557, var155.field2556, var155.field2559, var78, var79);
            } else if (var147 == 1) {
                GlTriangleNormal var156 = var44[var68];
                long var157 = (long) ((var70 << 2) + (var156.field2530 > 0 ? 1024 : 2048) + (var156.field2531 + 256 << 12) + (var156.field2532 + 256 << 22)) + ((long) (var69 << 8) + (long) (var82 << 24) + (long) var71 << 32);
                this.field7951[var67] = this.method13116(arg1, arg1.field1322[var68], var67, var157, var156.field2530, var156.field2531, var156.field2532, 0, var74, var75);
                this.field7974[var67] = this.method13116(arg1, arg1.field1323[var68], var67, (long) var80 + var157, var156.field2530, var156.field2531, var156.field2532, 0, var76, var77);
                this.field7953[var67] = this.method13116(arg1, arg1.field1324[var68], var67, (long) var81 + var157, var156.field2530, var156.field2531, var156.field2532, 0, var78, var79);
            }
            if (arg1.field1332 != null) {
                this.field7950[var67] = arg1.field1332[var68];
            }
            if (arg1.field1333 != null) {
                this.field7941[var67] = arg1.field1333[var68];
            }
            this.field7949[var67] = arg1.field1329[var68];
            this.field7936[var67] = var72;
        }
        if (this.field7948 > 0) {
            int var159 = 1;
            short var160 = this.field7936[0];
            for (int var161 = 0; var161 < this.field7948; var161++) {
                short var162 = this.field7936[var161];
                if (var160 != var162) {
                    var159++;
                    var160 = var162;
                }
            }
            this.field7966 = new int[var159];
            this.field7977 = new int[var159];
            this.field7975 = new int[var159 + 1];
            this.field7975[0] = 0;
            int var163 = this.field7937;
            short var164 = 0;
            int var165 = 0;
            short var166 = this.field7936[0];
            for (int var167 = 0; var167 < this.field7948; var167++) {
                short var168 = this.field7936[var167];
                if (var166 != var168) {
                    this.field7966[var165] = var163;
                    this.field7977[var165] = var164 - var163 + 1;
                    var165++;
                    this.field7975[var165] = var167;
                    var163 = this.field7937;
                    var164 = 0;
                    var166 = var168;
                }
                short var169 = this.field7951[var167];
                if (var169 < var163) {
                    var163 = var169;
                }
                if (var169 > var164) {
                    var164 = var169;
                }
                short var170 = this.field7974[var167];
                if (var170 < var163) {
                    var163 = var170;
                }
                if (var170 > var164) {
                    var164 = var170;
                }
                short var171 = this.field7953[var167];
                if (var171 < var163) {
                    var163 = var171;
                }
                if (var171 > var164) {
                    var164 = var171;
                }
            }
            this.field7966[var165] = var163;
            this.field7977[var165] = var164 - var163 + 1;
            var165++;
            this.field7975[var165] = this.field7948;
        }
        this.field7946 = null;
        this.field7994 = method13118(this.field7994, this.field7937);
        this.field7954 = method13118(this.field7954, this.field7937);
        this.field7924 = method13118(this.field7924, this.field7937);
        this.field7960 = method13118(this.field7960, this.field7937);
        this.field7942 = method13118(this.field7942, this.field7937);
        this.field7973 = method13117(this.field7973, this.field7937);
        this.field7944 = method13119(this.field7944, this.field7937);
        this.field7945 = method13119(this.field7945, this.field7937);
        if (arg1.field1313 != null && GpuModelFlags.method4184(arg2, this.field7952)) {
            this.field7935 = arg1.method2649(false);
        }
        if (arg1.field1349 != null && GpuModelFlags.method4250(arg2, this.field7952)) {
            this.field7943 = arg1.method2629();
        }
        if (arg1.field1331 != null && GpuModelFlags.method4183(arg2, this.field7952)) {
            int var172 = 0;
            int[] var173 = new int[256];
            for (int var174 = 0; var174 < this.field7947 * -1431655765; var174++) {
                int var175 = arg1.field1331[var8[var174]];
                if (var175 >= 0) {
                    int var10002 = var173[var175]++;
                    if (var175 > var172) {
                        var172 = var175;
                    }
                }
            }
            this.field7933 = new int[var172 + 1][];
            for (int var176 = 0; var176 <= var172; var176++) {
                this.field7933[var176] = new int[var173[var176]];
                var173[var176] = 0;
            }
            for (int var177 = 0; var177 < this.field7947 * -1431655765; var177++) {
                int var178 = arg1.field1331[var8[var177]];
                if (var178 >= 0) {
                    this.field7933[var178][var173[var178]++] = var177;
                }
            }
        }
    }

    @ObfuscatedName("yg.x(Ldw;IIJIIIIFF)S")
    public short method13116(ModelUnlit arg0, int arg1, int arg2, long arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9) {
        int var12 = this.field7993[arg1];
        int var13 = this.field7993[arg1 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field7979[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (this.field7946[var15] == arg3) {
                return (short) (var16 - 1);
            }
        }
        this.field7979[var14] = (short) (this.field7937 + 1);
        this.field7946[var14] = arg3;
        this.field7954[this.field7937] = (short) arg2;
        this.field7994[this.field7937] = (short) arg1;
        this.field7924[this.field7937] = (short) arg4;
        this.field7960[this.field7937] = (short) arg5;
        this.field7942[this.field7937] = (short) arg6;
        this.field7973[this.field7937] = (byte) arg7;
        this.field7944[this.field7937] = arg8;
        this.field7945[this.field7937] = arg9;
        return (short) this.field7937++;
    }

    @ObfuscatedName("yg.y([BI)[B")
    public static byte[] method13117(byte[] arg0, int arg1) {
        byte[] var2 = new byte[arg1];
        System.arraycopy(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @ObfuscatedName("yg.aa([SI)[S")
    public static short[] method13118(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        System.arraycopy(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @ObfuscatedName("yg.ba([FI)[F")
    public static float[] method13119(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        System.arraycopy(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @ObfuscatedName("yg.m()I")
    public int m() {
        return this.field7923;
    }

    @ObfuscatedName("yg.KA(I)V")
    public void KA(int arg0) {
        if (this.field7958 != null) {
            this.field7958.field2535 = GpuModelFlags.method4171(arg0, this.field7952);
        }
        if (this.field7961 != null) {
            this.field7961.field2535 = GpuModelFlags.method4224(arg0, this.field7952);
        }
        if (this.field7927 != null) {
            this.field7927.field2535 = GpuModelFlags.method4173(arg0, this.field7952);
        }
        if (this.field7956 != null) {
            this.field7956.field2535 = GpuModelFlags.method4172(arg0, this.field7952);
        }
        this.field7923 = arg0;
        if (this.field7955 != null && (this.field7923 & 0x10000) == 0) {
            this.field7924 = this.field7955.field2588;
            this.field7960 = this.field7955.field2586;
            this.field7942 = this.field7955.field2587;
            this.field7973 = this.field7955.field2589;
            this.field7955 = null;
        }
        this.field7963 = true;
        this.method13122();
    }

    @ObfuscatedName("yg.b()V")
    public void method247() {
        if (this.field7937 > 0 && this.field7948 > 0) {
            this.method13129();
            this.method13135();
            this.method13122();
        }
    }

    @ObfuscatedName("yg.q(BIZ)Lqa;")
    public Model method295(byte arg0, int arg1, boolean arg2) {
        boolean var4 = false;
        GpuModel var5;
        GpuModel var6;
        if (arg0 > 0 && arg0 <= 7) {
            var5 = this.field7925.field8395[arg0 - 1];
            var6 = this.field7925.field8394[arg0 - 1];
            var4 = true;
        } else {
            var6 = var5 = new GpuModel(this.field7925, 0, 0, true, false);
        }
        return this.method13121(var6, var5, arg1, var4, arg2);
    }

    @ObfuscatedName("yg.gp(Lyg;Lyg;IZZ)Lqa;")
    public Model method13121(GpuModel arg0, GpuModel arg1, int arg2, boolean arg3, boolean arg4) {
        arg0.field7923 = arg2;
        arg0.field7952 = this.field7952;
        arg0.field7928 = this.field7928;
        arg0.field7929 = this.field7929;
        arg0.field7930 = this.field7930;
        arg0.field7959 = this.field7959;
        arg0.field7937 = this.field7937;
        arg0.field7947 = this.field7947;
        arg0.field7948 = this.field7948;
        arg0.field7938 = this.field7938;
        if ((arg2 & 0x100) == 0) {
            arg0.field7964 = this.field7964;
        } else {
            arg0.field7964 = true;
        }
        arg0.field7940 = this.field7940;
        boolean var6 = GpuModelFlags.method4231(arg2, this.field7952);
        boolean var7 = GpuModelFlags.method4157(arg2, this.field7952);
        boolean var8 = GpuModelFlags.method4156(arg2, this.field7952);
        boolean var9 = var6 | var7 | var8;
        if (var9) {
            if (!var6) {
                arg0.field7932 = this.field7932;
            } else if (arg1.field7932 == null || arg1.field7932.length < this.field7930) {
                arg0.field7932 = arg1.field7932 = new int[this.field7930];
            } else {
                arg0.field7932 = arg1.field7932;
            }
            if (!var7) {
                arg0.field7931 = this.field7931;
            } else if (arg1.field7931 == null || arg1.field7931.length < this.field7930) {
                arg0.field7931 = arg1.field7931 = new int[this.field7930];
            } else {
                arg0.field7931 = arg1.field7931;
            }
            if (!var8) {
                arg0.field7934 = this.field7934;
            } else if (arg1.field7934 == null || arg1.field7934.length < this.field7930) {
                arg0.field7934 = arg1.field7934 = new int[this.field7930];
            } else {
                arg0.field7934 = arg1.field7934;
            }
            for (int var10 = 0; var10 < this.field7930; var10++) {
                if (var6) {
                    arg0.field7932[var10] = this.field7932[var10];
                }
                if (var7) {
                    arg0.field7931[var10] = this.field7931[var10];
                }
                if (var8) {
                    arg0.field7934[var10] = this.field7934[var10];
                }
            }
        } else {
            arg0.field7932 = this.field7932;
            arg0.field7931 = this.field7931;
            arg0.field7934 = this.field7934;
        }
        if (GpuModelFlags.method4171(arg2, this.field7952)) {
            arg0.field7958 = arg1.field7958;
            arg0.field7958.field2536 = this.field7958.field2536;
            arg0.field7958.field2538 = this.field7958.field2538;
            arg0.field7958.field2535 = true;
        } else if (GpuModelFlags.method4166(arg2, this.field7952)) {
            arg0.field7958 = this.field7958;
        } else {
            arg0.field7958 = null;
        }
        if (GpuModelFlags.method4159(arg2, this.field7952)) {
            if (arg1.field7949 == null || arg1.field7949.length < this.field7947 * -1431655765) {
                arg0.field7949 = arg1.field7949 = new short[this.field7947 * -1431655765];
            } else {
                arg0.field7949 = arg1.field7949;
            }
            for (int var11 = 0; var11 < this.field7947 * -1431655765; var11++) {
                arg0.field7949[var11] = this.field7949[var11];
            }
        } else {
            arg0.field7949 = this.field7949;
        }
        if (GpuModelFlags.method4257(arg2, this.field7952)) {
            if (arg1.field7950 == null || arg1.field7950.length < this.field7947 * -1431655765) {
                arg0.field7950 = arg1.field7950 = new byte[this.field7947 * -1431655765];
            } else {
                arg0.field7950 = arg1.field7950;
            }
            for (int var12 = 0; var12 < this.field7947 * -1431655765; var12++) {
                arg0.field7950[var12] = this.field7950[var12];
            }
        } else {
            arg0.field7950 = this.field7950;
        }
        if (GpuModelFlags.method4173(arg2, this.field7952)) {
            arg0.field7927 = arg1.field7927;
            arg0.field7927.field2536 = this.field7927.field2536;
            arg0.field7927.field2538 = this.field7927.field2538;
            arg0.field7927.field2535 = true;
        } else if (GpuModelFlags.method4233(arg2, this.field7952)) {
            arg0.field7927 = this.field7927;
        } else {
            arg0.field7927 = null;
        }
        if (GpuModelFlags.method4256(arg2, this.field7952)) {
            if (arg1.field7924 == null || arg1.field7924.length < this.field7937) {
                int var13 = this.field7937;
                arg0.field7924 = arg1.field7924 = new short[var13];
                arg0.field7960 = arg1.field7960 = new short[var13];
                arg0.field7942 = arg1.field7942 = new short[var13];
            } else {
                arg0.field7924 = arg1.field7924;
                arg0.field7960 = arg1.field7960;
                arg0.field7942 = arg1.field7942;
            }
            if (this.field7955 == null) {
                arg0.field7955 = null;
                for (int var17 = 0; var17 < this.field7937; var17++) {
                    arg0.field7924[var17] = this.field7924[var17];
                    arg0.field7960[var17] = this.field7960[var17];
                    arg0.field7942[var17] = this.field7942[var17];
                }
            } else {
                if (arg1.field7955 == null) {
                    arg1.field7955 = new GpuModelRelated3();
                }
                GpuModelRelated3 var14 = arg0.field7955 = arg1.field7955;
                if (var14.field2588 == null || var14.field2588.length < this.field7937) {
                    int var15 = this.field7937;
                    var14.field2588 = new short[var15];
                    var14.field2586 = new short[var15];
                    var14.field2587 = new short[var15];
                    var14.field2589 = new byte[var15];
                }
                for (int var16 = 0; var16 < this.field7937; var16++) {
                    arg0.field7924[var16] = this.field7924[var16];
                    arg0.field7960[var16] = this.field7960[var16];
                    arg0.field7942[var16] = this.field7942[var16];
                    var14.field2588[var16] = this.field7955.field2588[var16];
                    var14.field2586[var16] = this.field7955.field2586[var16];
                    var14.field2587[var16] = this.field7955.field2587[var16];
                    var14.field2589[var16] = this.field7955.field2589[var16];
                }
            }
            arg0.field7973 = this.field7973;
        } else {
            arg0.field7955 = this.field7955;
            arg0.field7924 = this.field7924;
            arg0.field7960 = this.field7960;
            arg0.field7942 = this.field7942;
            arg0.field7973 = this.field7973;
        }
        if (GpuModelFlags.method4172(arg2, this.field7952)) {
            arg0.field7956 = arg1.field7956;
            arg0.field7956.field2536 = this.field7956.field2536;
            arg0.field7956.field2538 = this.field7956.field2538;
            arg0.field7956.field2535 = true;
        } else if (GpuModelFlags.method4167(arg2, this.field7952)) {
            arg0.field7956 = this.field7956;
        } else {
            arg0.field7956 = null;
        }
        if (GpuModelFlags.method4161(arg2, this.field7952)) {
            if (arg1.field7944 == null || arg1.field7944.length < this.field7947 * -1431655765) {
                int var18 = this.field7937;
                arg0.field7944 = arg1.field7944 = new float[var18];
                arg0.field7945 = arg1.field7945 = new float[var18];
            } else {
                arg0.field7944 = arg1.field7944;
                arg0.field7945 = arg1.field7945;
            }
            for (int var19 = 0; var19 < this.field7937; var19++) {
                arg0.field7944[var19] = this.field7944[var19];
                arg0.field7945[var19] = this.field7945[var19];
            }
        } else {
            arg0.field7944 = this.field7944;
            arg0.field7945 = this.field7945;
        }
        if (GpuModelFlags.method4224(arg2, this.field7952)) {
            arg0.field7961 = arg1.field7961;
            arg0.field7961.field2536 = this.field7961.field2536;
            arg0.field7961.field2538 = this.field7961.field2538;
            arg0.field7961.field2535 = true;
        } else if (GpuModelFlags.method4169(arg2, this.field7952)) {
            arg0.field7961 = this.field7961;
        } else {
            arg0.field7961 = null;
        }
        if (GpuModelFlags.method4249(arg2, this.field7952)) {
            if (arg1.field7951 == null || arg1.field7951.length < this.field7947 * -1431655765) {
                int var20 = this.field7947 * -1431655765;
                arg0.field7951 = arg1.field7951 = new short[var20];
                arg0.field7974 = arg1.field7974 = new short[var20];
                arg0.field7953 = arg1.field7953 = new short[var20];
            } else {
                arg0.field7951 = arg1.field7951;
                arg0.field7974 = arg1.field7974;
                arg0.field7953 = arg1.field7953;
            }
            for (int var21 = 0; var21 < this.field7947 * -1431655765; var21++) {
                arg0.field7951[var21] = this.field7951[var21];
                arg0.field7974[var21] = this.field7974[var21];
                arg0.field7953[var21] = this.field7953[var21];
            }
        } else {
            arg0.field7951 = this.field7951;
            arg0.field7974 = this.field7974;
            arg0.field7953 = this.field7953;
        }
        if (GpuModelFlags.method4175(arg2, this.field7952)) {
            arg0.field7957 = arg1.field7957;
            arg0.field7957.field2420 = this.field7957.field2420;
            arg0.field7957.field2418 = this.field7957.field2418;
            arg0.field7957.field2419 = true;
        } else if (GpuModelFlags.method4179(arg2, this.field7952)) {
            arg0.field7957 = this.field7957;
        } else {
            arg0.field7957 = null;
        }
        if (GpuModelFlags.method4163(arg2, this.field7952)) {
            if (arg1.field7936 == null || arg1.field7936.length < this.field7947 * -1431655765) {
                int var22 = this.field7947 * -1431655765;
                arg0.field7936 = arg1.field7936 = new short[var22];
            } else {
                arg0.field7936 = arg1.field7936;
            }
            for (int var23 = 0; var23 < this.field7947 * -1431655765; var23++) {
                arg0.field7936[var23] = this.field7936[var23];
            }
        } else {
            arg0.field7936 = this.field7936;
        }
        if (!GpuModelFlags.method4164(arg2, this.field7952)) {
            arg0.field7984 = this.field7984;
        } else if (arg1.field7984 == null || arg1.field7984.length < this.field7938) {
            int var25 = this.field7938;
            arg0.field7984 = arg1.field7984 = new GlModelRelated5[var25];
            for (int var26 = 0; var26 < this.field7938; var26++) {
                arg0.field7984[var26] = this.field7984[var26].method4403();
            }
        } else {
            arg0.field7984 = arg1.field7984;
            for (int var24 = 0; var24 < this.field7938; var24++) {
                arg0.field7984[var24].method4402(this.field7984[var24]);
            }
        }
        arg0.field7983 = this.field7983;
        if (this.field7968) {
            arg0.field7980 = this.field7980;
            arg0.field7967 = this.field7967;
            arg0.field7971 = this.field7971;
            arg0.field7972 = this.field7972;
            arg0.field7969 = this.field7969;
            arg0.field7970 = this.field7970;
            arg0.field7982 = this.field7982;
            arg0.field7939 = this.field7939;
            arg0.field7968 = true;
        } else {
            arg0.field7968 = false;
        }
        arg0.field7935 = this.field7935;
        arg0.field7933 = this.field7933;
        arg0.field7943 = this.field7943;
        arg0.field7979 = this.field7979;
        arg0.field7993 = this.field7993;
        arg0.field7994 = this.field7994;
        arg0.field7954 = this.field7954;
        arg0.field7978 = this.field7978;
        arg0.field7941 = this.field7941;
        arg0.field7975 = this.field7975;
        arg0.field7977 = this.field7977;
        arg0.field7966 = this.field7966;
        arg0.field7985 = this.field7985;
        arg0.field7981 = this.field7981;
        return arg0;
    }

    @ObfuscatedName("yg.gq()V")
    public void method13122() {
        if (!this.field7963) {
            return;
        }
        this.field7963 = false;
        if (this.field7985 == null && this.field7981 == null && this.field7983 == null && !GpuModelFlags.method4155(this.field7923, this.field7952)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (this.field7932 != null && !GpuModelFlags.method4176(this.field7923, this.field7952)) {
                if (this.field7958 == null || this.field7958.method4492()) {
                    if (!this.field7968) {
                        this.method13128();
                    }
                    var1 = true;
                } else {
                    this.field7963 = true;
                }
            }
            if (this.field7931 != null && !GpuModelFlags.method4177(this.field7923, this.field7952)) {
                if (this.field7958 == null || this.field7958.method4492()) {
                    if (!this.field7968) {
                        this.method13128();
                    }
                    var2 = true;
                } else {
                    this.field7963 = true;
                }
            }
            if (this.field7934 != null && !GpuModelFlags.method4178(this.field7923, this.field7952)) {
                if (this.field7958 == null || this.field7958.method4492()) {
                    if (!this.field7968) {
                        this.method13128();
                    }
                    var3 = true;
                } else {
                    this.field7963 = true;
                }
            }
            if (var1) {
                this.field7932 = null;
            }
            if (var2) {
                this.field7931 = null;
            }
            if (var3) {
                this.field7934 = null;
            }
        }
        if (this.field7979 != null && this.field7932 == null && this.field7931 == null && this.field7934 == null) {
            this.field7979 = null;
            this.field7993 = null;
        }
        if (this.field7973 != null && !GpuModelFlags.method4230(this.field7923, this.field7952)) {
            label211:
            {
                label210:
                {
                    if ((this.field7952 & 0x37) == 0) {
                        if (this.field7927 != null && !this.field7927.method4492()) {
                            break label210;
                        }
                    } else if (this.field7956 != null && !this.field7956.method4492()) {
                        break label210;
                    }
                    this.field7942 = null;
                    this.field7960 = null;
                    this.field7924 = null;
                    this.field7973 = null;
                    break label211;
                }
                this.field7963 = true;
            }
        }
        if (this.field7949 != null && !GpuModelFlags.method4180(this.field7923, this.field7952)) {
            if (this.field7927 == null || this.field7927.method4492()) {
                this.field7949 = null;
            } else {
                this.field7963 = true;
            }
        }
        if (this.field7950 != null && !GpuModelFlags.method4181(this.field7923, this.field7952)) {
            if (this.field7927 == null || this.field7927.method4492()) {
                this.field7950 = null;
            } else {
                this.field7963 = true;
            }
        }
        if (this.field7944 != null && !GpuModelFlags.method4245(this.field7923, this.field7952)) {
            if (this.field7961 == null || this.field7961.method4492()) {
                this.field7945 = null;
                this.field7944 = null;
            } else {
                this.field7963 = true;
            }
        }
        if (this.field7936 != null && !GpuModelFlags.method4187(this.field7923, this.field7952)) {
            if (this.field7927 == null || this.field7927.method4492()) {
                this.field7936 = null;
            } else {
                this.field7963 = true;
            }
        }
        if (this.field7951 != null && !GpuModelFlags.method4186(this.field7923, this.field7952)) {
            if ((this.field7957 == null || this.field7957.method4263()) && (this.field7927 == null || this.field7927.method4492())) {
                this.field7953 = null;
                this.field7974 = null;
                this.field7951 = null;
            } else {
                this.field7963 = true;
            }
        }
        if (this.field7994 != null) {
            if (this.field7958 == null || this.field7958.method4492()) {
                this.field7994 = null;
            } else {
                this.field7963 = true;
            }
        }
        if (this.field7954 != null) {
            if (this.field7927 == null || this.field7927.method4492()) {
                this.field7954 = null;
            } else {
                this.field7963 = true;
            }
        }
        if (this.field7933 != null && !GpuModelFlags.method4183(this.field7923, this.field7952)) {
            this.field7933 = null;
            this.field7941 = null;
        }
        if (this.field7935 != null && !GpuModelFlags.method4184(this.field7923, this.field7952)) {
            this.field7935 = null;
            this.field7978 = null;
        }
        if (this.field7943 != null && !GpuModelFlags.method4250(this.field7923, this.field7952)) {
            this.field7943 = null;
        }
        if (this.field7975 != null && (this.field7923 & 0x800) == 0 && (this.field7923 & 0x40000) == 0) {
            this.field7975 = null;
            this.field7977 = null;
            this.field7966 = null;
        }
    }

    @ObfuscatedName("yg.gz()V")
    public void method13167() {
        if (this.field7958 != null) {
            this.field7958.field2538 = false;
        }
    }

    @ObfuscatedName("yg.gk()V")
    public void method13174() {
        if (this.field7927 != null) {
            this.field7927.field2538 = false;
        }
    }

    @ObfuscatedName("yg.gc()V")
    public void method13125() {
        if ((this.field7952 & 0x37) == 0) {
            if (this.field7927 != null) {
                this.field7927.field2538 = false;
            }
        } else if (this.field7956 != null) {
            this.field7956.field2538 = false;
        }
    }

    @ObfuscatedName("yg.gm()V")
    public void method13126() {
        if (this.field7957 != null) {
            this.field7957.field2418 = false;
        }
    }

    @ObfuscatedName("yg.f(I)V")
    public void f(int arg0) {
        int var2 = Trig1.field3439[arg0];
        int var3 = Trig1.field3447[arg0];
        for (int var4 = 0; var4 < this.field7959; var4++) {
            int var5 = this.field7934[var4] * var2 + this.field7932[var4] * var3 >> 14;
            this.field7934[var4] = this.field7934[var4] * var3 - this.field7932[var4] * var2 >> 14;
            this.field7932[var4] = var5;
        }
        this.method13167();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.S(I)V")
    public void S(int arg0) {
        int var2 = Trig1.field3439[arg0];
        int var3 = Trig1.field3447[arg0];
        for (int var4 = 0; var4 < this.field7959; var4++) {
            int var5 = this.field7934[var4] * var2 + this.field7932[var4] * var3 >> 14;
            this.field7934[var4] = this.field7934[var4] * var3 - this.field7932[var4] * var2 >> 14;
            this.field7932[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field7937; var6++) {
            int var7 = this.field7942[var6] * var2 + this.field7924[var6] * var3 >> 14;
            this.field7942[var6] = (short) (this.field7942[var6] * var3 - this.field7924[var6] * var2 >> 14);
            this.field7924[var6] = (short) var7;
        }
        this.method13167();
        this.method13125();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.t(I)V")
    public void t(int arg0) {
        int var2 = Trig1.field3439[arg0];
        int var3 = Trig1.field3447[arg0];
        for (int var4 = 0; var4 < this.field7959; var4++) {
            int var5 = this.field7931[var4] * var3 - this.field7934[var4] * var2 >> 14;
            this.field7934[var4] = this.field7934[var4] * var3 + this.field7931[var4] * var2 >> 14;
            this.field7931[var4] = var5;
        }
        this.method13167();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.EA(I)V")
    public void EA(int arg0) {
        int var2 = Trig1.field3439[arg0];
        int var3 = Trig1.field3447[arg0];
        for (int var4 = 0; var4 < this.field7959; var4++) {
            int var5 = this.field7932[var4] * var3 + this.field7931[var4] * var2 >> 14;
            this.field7931[var4] = this.field7931[var4] * var3 - this.field7932[var4] * var2 >> 14;
            this.field7932[var4] = var5;
        }
        this.method13167();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.ia(III)V")
    public void ia(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7959; var4++) {
            if (arg0 != 0) {
                this.field7932[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field7931[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field7934[var4] += arg2;
            }
        }
        this.method13167();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.wa()V")
    public void wa() {
        for (int var1 = 0; var1 < this.field7959; var1++) {
            this.field7934[var1] = -this.field7934[var1];
        }
        for (int var2 = 0; var2 < this.field7937; var2++) {
            this.field7942[var2] = (short) -this.field7942[var2];
        }
        for (int var3 = 0; var3 < this.field7947 * -1431655765; var3++) {
            short var4 = this.field7951[var3];
            this.field7951[var3] = this.field7953[var3];
            this.field7953[var3] = var4;
        }
        this.method13167();
        this.method13125();
        this.method13126();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.oa(III)V")
    public void oa(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7959; var4++) {
            if (arg0 != 128) {
                this.field7932[var4] = this.field7932[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field7931[var4] = this.field7931[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field7934[var4] = this.field7934[var4] * arg2 >> 7;
            }
        }
        this.method13167();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.pa(IILxa;Lxa;III)V")
    public void pa(int arg0, int arg1, FloorModel arg2, FloorModel arg3, int arg4, int arg5, int arg6) {
        if (!this.field7968) {
            this.method13128();
        }
        int var8 = this.field7971 + arg4;
        int var9 = this.field7972 + arg4;
        int var10 = this.field7982 + arg6;
        int var11 = this.field7939 + arg6;
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
            for (int var16 = 0; var16 < this.field7959; var16++) {
                this.field7931[var16] = this.field7931[var16] + arg2.method196(this.field7932[var16] + arg4, this.field7934[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            int var17 = this.field7969;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field7959; var18++) {
                int var19 = (this.field7931[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field7931[var18] += (arg2.method196(this.field7932[var18] + arg4, this.field7934[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
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
            int var24 = this.field7970 - this.field7969;
            for (int var25 = 0; var25 < this.field7959; var25++) {
                this.field7931[var25] = this.field7931[var25] + (arg3.method196(this.field7932[var25] + arg4, this.field7934[var25] + arg6) - arg5) + var24;
            }
        } else if (arg0 == 5) {
            int var26 = this.field7970 - this.field7969;
            for (int var27 = 0; var27 < this.field7959; var27++) {
                int var28 = this.field7932[var27] + arg4;
                int var29 = this.field7934[var27] + arg6;
                int var30 = arg2.method196(var28, var29);
                int var31 = arg3.method196(var28, var29);
                int var32 = var30 - var31 - arg1;
                this.field7931[var27] = ((this.field7931[var27] << 8) / var26 * var32 >> 8) - (arg5 - var30);
            }
        }
        this.method13167();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.gh()V")
    public void method13128() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field7959; var9++) {
            int var10 = this.field7932[var9];
            int var11 = this.field7931[var9];
            int var12 = this.field7934[var9];
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
        this.field7971 = var1;
        this.field7972 = var4;
        this.field7969 = var2;
        this.field7970 = var5;
        this.field7982 = var3;
        this.field7939 = var6;
        this.field7967 = (int) (Math.sqrt((double) var7) + 0.99D);
        this.field7980 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field7968 = true;
    }

    @ObfuscatedName("yg.N()I")
    public int N() {
        if (!this.field7968) {
            this.method13128();
        }
        return this.field7967;
    }

    @ObfuscatedName("yg.n()I")
    public int n() {
        if (!this.field7968) {
            this.method13128();
        }
        return this.field7980;
    }

    @ObfuscatedName("yg.RA()I")
    public int RA() {
        if (!this.field7968) {
            this.method13128();
        }
        return this.field7971;
    }

    @ObfuscatedName("yg.ya()I")
    public int ya() {
        if (!this.field7968) {
            this.method13128();
        }
        return this.field7972;
    }

    @ObfuscatedName("yg.YA()I")
    public int YA() {
        if (!this.field7968) {
            this.method13128();
        }
        return this.field7969;
    }

    @ObfuscatedName("yg.o()I")
    public int o() {
        if (!this.field7968) {
            this.method13128();
        }
        return this.field7970;
    }

    @ObfuscatedName("yg.AA()I")
    public int AA() {
        if (!this.field7968) {
            this.method13128();
        }
        return this.field7982;
    }

    @ObfuscatedName("yg.ha()I")
    public int ha() {
        if (!this.field7968) {
            this.method13128();
        }
        return this.field7939;
    }

    @ObfuscatedName("yg.ad(Lqa;IIIZ)V")
    public void method297(Model arg0, int arg1, int arg2, int arg3, boolean arg4) {
        GpuModel var6 = (GpuModel) arg0;
        if (this.field7947 * -1431655765 == 0 || var6.field7947 * -1431655765 == 0) {
            return;
        }
        int var7 = var6.field7959;
        int[] var8 = var6.field7932;
        int[] var9 = var6.field7931;
        int[] var10 = var6.field7934;
        short[] var11 = var6.field7924;
        short[] var12 = var6.field7960;
        short[] var13 = var6.field7942;
        byte[] var14 = var6.field7973;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field7955 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field7955.field2588;
            var16 = this.field7955.field2586;
            var17 = this.field7955.field2587;
            var18 = this.field7955.field2589;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field7955 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field7955.field2588;
            var20 = var6.field7955.field2586;
            var21 = var6.field7955.field2587;
            var22 = var6.field7955.field2589;
        }
        int[] var23 = var6.field7993;
        short[] var24 = var6.field7979;
        if (!var6.field7968) {
            var6.method13128();
        }
        int var25 = var6.field7969;
        int var26 = var6.field7970;
        int var27 = var6.field7971;
        int var28 = var6.field7972;
        int var29 = var6.field7982;
        int var30 = var6.field7939;
        for (int var31 = 0; var31 < this.field7959; var31++) {
            int var32 = this.field7931[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field7932[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field7934[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field7993[var31];
                        int var37 = this.field7993[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field7979[var38] - 1;
                            if (var35 == -1 || this.field7973[var35] != 0) {
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
                                            this.field7955 = new GpuModelRelated3();
                                            var15 = this.field7955.field2588 = Statics.method879(this.field7924);
                                            var16 = this.field7955.field2586 = Statics.method879(this.field7960);
                                            var17 = this.field7955.field2587 = Statics.method879(this.field7942);
                                            var18 = this.field7955.field2589 = GpuByteArrayUtil.method16683(this.field7973);
                                        }
                                        if (var19 == null) {
                                            GpuModelRelated3 var44 = var6.field7955 = new GpuModelRelated3();
                                            var19 = var44.field2588 = Statics.method879(var11);
                                            var20 = var44.field2586 = Statics.method879(var12);
                                            var21 = var44.field2587 = Statics.method879(var13);
                                            var22 = var44.field2589 = GpuByteArrayUtil.method16683(var14);
                                        }
                                        short var45 = this.field7924[var35];
                                        short var46 = this.field7960[var35];
                                        short var47 = this.field7942[var35];
                                        byte var48 = this.field7973[var35];
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
                                        int var57 = this.field7993[var31];
                                        int var58 = this.field7993[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field7979[var59] - 1;
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
                                        var6.method13125();
                                        this.method13125();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("yg.p(I)V")
    public void p(int arg0) {
        this.field7928 = (short) arg0;
        this.method13174();
    }

    @ObfuscatedName("yg.Q(I)V")
    public void Q(int arg0) {
        this.field7929 = (short) arg0;
        this.method13167();
        this.method13125();
    }

    @ObfuscatedName("yg.c()I")
    public int c() {
        return this.field7928;
    }

    @ObfuscatedName("yg.Z()I")
    public int Z() {
        return this.field7929;
    }

    @ObfuscatedName("yg.ao()[B")
    public byte[] ao() {
        return this.field7950;
    }

    @ObfuscatedName("yg.X(SS)V")
    public void X(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field7947 * -1431655765; var3++) {
            if (this.field7949[var3] == arg0) {
                this.field7949[var3] = arg1;
            }
        }
        if (this.field7983 != null) {
            for (int var4 = 0; var4 < this.field7938; var4++) {
                GlModelRelated4 var5 = this.field7983[var4];
                GlModelRelated5 var6 = this.field7984[var4];
                var6.field2477 = var6.field2477 & 0xFF000000 | Statics.field5084[this.field7949[var5.field2524] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method13174();
    }

    @ObfuscatedName("yg.al(B[B)V")
    public void method288(byte arg0, byte[] arg1) {
        if (arg1 == null) {
            for (int var3 = 0; var3 < this.field7947 * -1431655765; var3++) {
                this.field7950[var3] = arg0;
            }
        } else {
            for (int var4 = 0; var4 < this.field7947 * -1431655765; var4++) {
                int var5 = 255 - (255 - (arg1[var4] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
                this.field7950[var4] = (byte) var5;
            }
        }
        this.method13174();
    }

    @ObfuscatedName("yg.W(SS)V")
    public void W(short arg0, short arg1) {
        MaterialTypeList var3 = this.field7925.field400;
        for (int var4 = 0; var4 < this.field7947 * -1431655765; var4++) {
            if (this.field7936[var4] == arg0) {
                this.field7936[var4] = arg1;
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
                this.field7940 = true;
            }
        }
        if (!(var5 != var8 | var6 != var9)) {
            return;
        }
        if (this.field7983 != null) {
            for (int var11 = 0; var11 < this.field7938; var11++) {
                GlModelRelated4 var12 = this.field7983[var11];
                GlModelRelated5 var13 = this.field7984[var11];
                var13.field2477 = var13.field2477 & 0xFF000000 | Statics.field5084[this.field7949[var12.field2524] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method13174();
    }

    @ObfuscatedName("yg.PA(IIII)V")
    public void PA(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field7947 * -1431655765; var5++) {
            int var6 = this.field7949[var5] & 0xFFFF;
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
            this.field7949[var5] = (short) (var7 << 10 | var8 << 7 | var9);
        }
        if (this.field7983 != null) {
            for (int var10 = 0; var10 < this.field7938; var10++) {
                GlModelRelated4 var11 = this.field7983[var10];
                GlModelRelated5 var12 = this.field7984[var10];
                var12.field2477 = var12.field2477 & 0xFF000000 | Statics.field5084[this.field7949[var11.field2524] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method13174();
    }

    @ObfuscatedName("yg.at()Z")
    public boolean method291() {
        if (this.field7936 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field7936.length; var1++) {
            if (this.field7936[var1] != -1 && !this.field7925.field8336.method4350(this.field7936[var1], -1)) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("yg.i()Z")
    public boolean i() {
        return this.field7964;
    }

    @ObfuscatedName("yg.u()Z")
    public boolean u() {
        return this.field7940;
    }

    @ObfuscatedName("yg.k()V")
    public void method257() {
    }

    @ObfuscatedName("yg.h()V")
    public void method407() {
    }

    @ObfuscatedName("yg.ea()Z")
    public boolean ea() {
        if (this.field7935 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field7930; var1++) {
            this.field7932[var1] <<= 0x4;
            this.field7931[var1] <<= 0x4;
            this.field7934[var1] <<= 0x4;
        }
        this.field7965 = 0;
        this.field7926 = 0;
        this.field7995 = 0;
        return true;
    }

    @ObfuscatedName("yg.e(I[IIIIZI[I)V")
    public void e(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            this.field7965 = 0;
            this.field7926 = 0;
            this.field7995 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field7935.length) {
                    int[] var16 = this.field7935[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field7978 == null || (arg6 & this.field7978[var18]) != 0) {
                            this.field7965 += this.field7932[var18];
                            this.field7926 += this.field7931[var18];
                            this.field7995 += this.field7934[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                this.field7965 = this.field7965 / var13 + var10;
                this.field7926 = this.field7926 / var13 + var11;
                this.field7995 = this.field7995 / var13 + var12;
                this.field7996 = true;
            } else {
                this.field7965 = var10;
                this.field7926 = var11;
                this.field7995 = var12;
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
                if (var26 < this.field7935.length) {
                    int[] var27 = this.field7935[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field7978 == null || (arg6 & this.field7978[var29]) != 0) {
                            this.field7932[var29] += var22;
                            this.field7931[var29] += var23;
                            this.field7934[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field7935.length) {
                        int[] var92 = this.field7935[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field7978 == null || (arg6 & this.field7978[var94]) != 0) {
                                this.field7932[var94] -= this.field7965;
                                this.field7931[var94] -= this.field7926;
                                this.field7934[var94] -= this.field7995;
                                if (arg4 != 0) {
                                    int var95 = Trig1.field3439[arg4];
                                    int var96 = Trig1.field3447[arg4];
                                    int var97 = this.field7932[var94] * var96 + this.field7931[var94] * var95 + 16383 >> 14;
                                    this.field7931[var94] = this.field7931[var94] * var96 - this.field7932[var94] * var95 + 16383 >> 14;
                                    this.field7932[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = Trig1.field3439[arg2];
                                    int var99 = Trig1.field3447[arg2];
                                    int var100 = this.field7931[var94] * var99 - this.field7934[var94] * var98 + 16383 >> 14;
                                    this.field7934[var94] = this.field7934[var94] * var99 + this.field7931[var94] * var98 + 16383 >> 14;
                                    this.field7931[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = Trig1.field3439[arg3];
                                    int var102 = Trig1.field3447[arg3];
                                    int var103 = this.field7934[var94] * var101 + this.field7932[var94] * var102 + 16383 >> 14;
                                    this.field7934[var94] = this.field7934[var94] * var102 - this.field7932[var94] * var101 + 16383 >> 14;
                                    this.field7932[var94] = var103;
                                }
                                this.field7932[var94] += this.field7965;
                                this.field7931[var94] += this.field7926;
                                this.field7934[var94] += this.field7995;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field7935.length) {
                            int[] var106 = this.field7935[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field7978 == null || (arg6 & this.field7978[var108]) != 0) {
                                    int var109 = this.field7993[var108];
                                    int var110 = this.field7993[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field7979[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = Trig1.field3439[arg4];
                                            int var114 = Trig1.field3447[arg4];
                                            int var115 = this.field7960[var112] * var113 + this.field7924[var112] * var114 + 16383 >> 14;
                                            this.field7960[var112] = (short) (this.field7960[var112] * var114 - this.field7924[var112] * var113 + 16383 >> 14);
                                            this.field7924[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = Trig1.field3439[arg2];
                                            int var117 = Trig1.field3447[arg2];
                                            int var118 = this.field7960[var112] * var117 - this.field7942[var112] * var116 + 16383 >> 14;
                                            this.field7942[var112] = (short) (this.field7960[var112] * var116 + this.field7942[var112] * var117 + 16383 >> 14);
                                            this.field7960[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = Trig1.field3439[arg3];
                                            int var120 = Trig1.field3447[arg3];
                                            int var121 = this.field7942[var112] * var119 + this.field7924[var112] * var120 + 16383 >> 14;
                                            this.field7942[var112] = (short) (this.field7942[var112] * var120 - this.field7924[var112] * var119 + 16383 >> 14);
                                            this.field7924[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method13125();
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (this.field7996) {
                    int var36 = arg7[6] * this.field7995 + arg7[0] * this.field7965 + arg7[3] * this.field7926 + 8192 >> 14;
                    int var37 = arg7[7] * this.field7995 + arg7[1] * this.field7965 + arg7[4] * this.field7926 + 8192 >> 14;
                    int var38 = arg7[8] * this.field7995 + arg7[2] * this.field7965 + arg7[5] * this.field7926 + 8192 >> 14;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    this.field7965 = var39;
                    this.field7926 = var40;
                    this.field7995 = var41;
                    this.field7996 = false;
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
                int var51 = var42[2] * -this.field7995 + var42[0] * -this.field7965 + var42[1] * -this.field7926 + 8192 >> 14;
                int var52 = var42[5] * -this.field7995 + var42[3] * -this.field7965 + var42[4] * -this.field7926 + 8192 >> 14;
                int var53 = var42[8] * -this.field7995 + var42[6] * -this.field7965 + var42[7] * -this.field7926 + 8192 >> 14;
                int var54 = this.field7965 + var51;
                int var55 = this.field7926 + var52;
                int var56 = this.field7995 + var53;
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
                    if (var80 < this.field7935.length) {
                        int[] var81 = this.field7935[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field7978 == null || (arg6 & this.field7978[var83]) != 0) {
                                int var84 = this.field7934[var83] * var68[2] + this.field7932[var83] * var68[0] + this.field7931[var83] * var68[1] + 8192 >> 14;
                                int var85 = this.field7934[var83] * var68[5] + this.field7932[var83] * var68[3] + this.field7931[var83] * var68[4] + 8192 >> 14;
                                int var86 = this.field7934[var83] * var68[8] + this.field7932[var83] * var68[6] + this.field7931[var83] * var68[7] + 8192 >> 14;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field7932[var83] = var87;
                                this.field7931[var83] = var88;
                                this.field7934[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field7935.length) {
                        int[] var174 = this.field7935[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field7978 == null || (arg6 & this.field7978[var176]) != 0) {
                                this.field7932[var176] -= this.field7965;
                                this.field7931[var176] -= this.field7926;
                                this.field7934[var176] -= this.field7995;
                                this.field7932[var176] = this.field7932[var176] * arg2 >> 7;
                                this.field7931[var176] = this.field7931[var176] * arg3 >> 7;
                                this.field7934[var176] = this.field7934[var176] * arg4 >> 7;
                                this.field7932[var176] += this.field7965;
                                this.field7931[var176] += this.field7926;
                                this.field7934[var176] += this.field7995;
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
                if (this.field7996) {
                    int var128 = arg7[6] * this.field7995 + arg7[0] * this.field7965 + arg7[3] * this.field7926 + 8192 >> 14;
                    int var129 = arg7[7] * this.field7995 + arg7[1] * this.field7965 + arg7[4] * this.field7926 + 8192 >> 14;
                    int var130 = arg7[8] * this.field7995 + arg7[2] * this.field7965 + arg7[5] * this.field7926 + 8192 >> 14;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    this.field7965 = var131;
                    this.field7926 = var132;
                    this.field7995 = var133;
                    this.field7996 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -this.field7965 * var134 + 8192 >> 14;
                int var138 = -this.field7926 * var135 + 8192 >> 14;
                int var139 = -this.field7995 * var136 + 8192 >> 14;
                int var140 = this.field7965 + var137;
                int var141 = this.field7926 + var138;
                int var142 = this.field7995 + var139;
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
                    if (var162 < this.field7935.length) {
                        int[] var163 = this.field7935[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field7978 == null || (arg6 & this.field7978[var165]) != 0) {
                                int var166 = this.field7934[var165] * var150[2] + this.field7932[var165] * var150[0] + this.field7931[var165] * var150[1] + 8192 >> 14;
                                int var167 = this.field7934[var165] * var150[5] + this.field7932[var165] * var150[3] + this.field7931[var165] * var150[4] + 8192 >> 14;
                                int var168 = this.field7934[var165] * var150[8] + this.field7932[var165] * var150[6] + this.field7931[var165] * var150[7] + 8192 >> 14;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field7932[var165] = var169;
                                this.field7931[var165] = var170;
                                this.field7934[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7933 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var179 = arg1[var178];
                    if (var179 < this.field7933.length) {
                        int[] var180 = this.field7933[var179];
                        for (int var181 = 0; var181 < var180.length; var181++) {
                            int var182 = var180[var181];
                            if (this.field7941 == null || (arg6 & this.field7941[var182]) != 0) {
                                int var183 = (this.field7950[var182] & 0xFF) + arg2 * 8;
                                if (var183 < 0) {
                                    var183 = 0;
                                } else if (var183 > 255) {
                                    var183 = 255;
                                }
                                this.field7950[var182] = (byte) var183;
                            }
                        }
                        var177 |= var180.length > 0;
                    }
                }
                if (var177) {
                    if (this.field7983 != null) {
                        for (int var184 = 0; var184 < this.field7938; var184++) {
                            GlModelRelated4 var185 = this.field7983[var184];
                            GlModelRelated5 var186 = this.field7984[var184];
                            var186.field2477 = var186.field2477 & 0xFFFFFF | 255 - (this.field7950[var185.field2524] & 0xFF) << 24;
                        }
                    }
                    this.method13174();
                }
            }
        } else if (arg0 == 7) {
            if (this.field7933 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var189 = arg1[var188];
                    if (var189 < this.field7933.length) {
                        int[] var190 = this.field7933[var189];
                        for (int var191 = 0; var191 < var190.length; var191++) {
                            int var192 = var190[var191];
                            if (this.field7941 == null || (arg6 & this.field7941[var192]) != 0) {
                                int var193 = this.field7949[var192] & 0xFFFF;
                                int var194 = var193 >> 10 & 0x3F;
                                int var195 = var193 >> 7 & 0x7;
                                int var196 = var193 & 0x7F;
                                int var197 = arg2 + var194 & 0x3F;
                                int var198 = arg3 / 4 + var195;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var199 = arg4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 127) {
                                    var199 = 127;
                                }
                                this.field7949[var192] = (short) (var197 << 10 | var198 << 7 | var199);
                            }
                        }
                        var187 |= var190.length > 0;
                    }
                }
                if (var187) {
                    if (this.field7983 != null) {
                        for (int var200 = 0; var200 < this.field7938; var200++) {
                            GlModelRelated4 var201 = this.field7983[var200];
                            GlModelRelated5 var202 = this.field7984[var200];
                            var202.field2477 = var202.field2477 & 0xFF000000 | Statics.field5084[this.field7949[var201.field2524] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method13174();
                }
            }
        } else if (arg0 == 8) {
            if (this.field7943 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field7943.length) {
                        int[] var205 = this.field7943[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            GlModelRelated5 var207 = this.field7984[var205[var206]];
                            var207.field2476 += arg2;
                            var207.field2473 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7943 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field7943.length) {
                        int[] var210 = this.field7943[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            GlModelRelated5 var212 = this.field7984[var210[var211]];
                            var212.field2474 = var212.field2474 * arg2 >> 7;
                            var212.field2475 = var212.field2475 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7943 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (var214 < this.field7943.length) {
                    int[] var215 = this.field7943[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        GlModelRelated5 var217 = this.field7984[var215[var216]];
                        var217.field2478 = var217.field2478 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @ObfuscatedName("yg.w(IIII)V")
    public void w(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            this.field7965 = 0;
            this.field7926 = 0;
            this.field7995 = 0;
            for (int var6 = 0; var6 < this.field7959; var6++) {
                this.field7965 += this.field7932[var6];
                this.field7926 += this.field7931[var6];
                this.field7995 += this.field7934[var6];
                var5++;
            }
            if (var5 > 0) {
                this.field7965 = this.field7965 / var5 + arg1;
                this.field7926 = this.field7926 / var5 + arg2;
                this.field7995 = this.field7995 / var5 + arg3;
            } else {
                this.field7965 = arg1;
                this.field7926 = arg2;
                this.field7995 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field7959; var7++) {
                this.field7932[var7] += arg1;
                this.field7931[var7] += arg2;
                this.field7934[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field7959; var8++) {
                this.field7932[var8] -= this.field7965;
                this.field7931[var8] -= this.field7926;
                this.field7934[var8] -= this.field7995;
                if (arg3 != 0) {
                    int var9 = Trig1.field3439[arg3];
                    int var10 = Trig1.field3447[arg3];
                    int var11 = this.field7932[var8] * var10 + this.field7931[var8] * var9 + 16383 >> 14;
                    this.field7931[var8] = this.field7931[var8] * var10 - this.field7932[var8] * var9 + 16383 >> 14;
                    this.field7932[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = Trig1.field3439[arg1];
                    int var13 = Trig1.field3447[arg1];
                    int var14 = this.field7931[var8] * var13 - this.field7934[var8] * var12 + 16383 >> 14;
                    this.field7934[var8] = this.field7934[var8] * var13 + this.field7931[var8] * var12 + 16383 >> 14;
                    this.field7931[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = Trig1.field3439[arg2];
                    int var16 = Trig1.field3447[arg2];
                    int var17 = this.field7934[var8] * var15 + this.field7932[var8] * var16 + 16383 >> 14;
                    this.field7934[var8] = this.field7934[var8] * var16 - this.field7932[var8] * var15 + 16383 >> 14;
                    this.field7932[var8] = var17;
                }
                this.field7932[var8] += this.field7965;
                this.field7931[var8] += this.field7926;
                this.field7934[var8] += this.field7995;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field7959; var18++) {
                this.field7932[var18] -= this.field7965;
                this.field7931[var18] -= this.field7926;
                this.field7934[var18] -= this.field7995;
                this.field7932[var18] = this.field7932[var18] * arg1 / 128;
                this.field7931[var18] = this.field7931[var18] * arg2 / 128;
                this.field7934[var18] = this.field7934[var18] * arg3 / 128;
                this.field7932[var18] += this.field7965;
                this.field7931[var18] += this.field7926;
                this.field7934[var18] += this.field7995;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field7947 * -1431655765; var19++) {
                int var20 = (this.field7950[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field7950[var19] = (byte) var20;
            }
            if (this.field7983 != null) {
                for (int var21 = 0; var21 < this.field7938; var21++) {
                    GlModelRelated4 var22 = this.field7983[var21];
                    GlModelRelated5 var23 = this.field7984[var21];
                    var23.field2477 = var23.field2477 & 0xFFFFFF | 255 - (this.field7950[var22.field2524] & 0xFF) << 24;
                }
            }
            this.method13174();
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field7947 * -1431655765; var24++) {
                int var25 = this.field7949[var24] & 0xFFFF;
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
                this.field7949[var24] = (short) (var29 << 10 | var30 << 7 | var31);
            }
            if (this.field7983 != null) {
                for (int var32 = 0; var32 < this.field7938; var32++) {
                    GlModelRelated4 var33 = this.field7983[var32];
                    GlModelRelated5 var34 = this.field7984[var32];
                    var34.field2477 = var34.field2477 & 0xFF000000 | Statics.field5084[this.field7949[var33.field2524] & 0xFFFF] & 0xFFFFFF;
                }
            }
            this.method13174();
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field7938; var35++) {
                GlModelRelated5 var36 = this.field7984[var35];
                var36.field2476 += arg1;
                var36.field2473 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field7938; var37++) {
                GlModelRelated5 var38 = this.field7984[var37];
                var38.field2474 = var38.field2474 * arg1 >> 7;
                var38.field2475 = var38.field2475 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field7938; var39++) {
                GlModelRelated5 var40 = this.field7984[var39];
                var40.field2478 = var40.field2478 + arg1 & 0x3FFF;
            }
        }
    }

    @ObfuscatedName("yg.ap(I[IIIIIZ)V")
    public void method266(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            this.field7965 = 0;
            this.field7926 = 0;
            this.field7995 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field7935.length) {
                    int[] var15 = this.field7935[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field7965 += this.field7932[var17];
                        this.field7926 += this.field7931[var17];
                        this.field7995 += this.field7934[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                this.field7965 = this.field7965 / var12 + var9;
                this.field7926 = this.field7926 / var12 + var10;
                this.field7995 = this.field7995 / var12 + var11;
            } else {
                this.field7965 = var9;
                this.field7926 = var10;
                this.field7995 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field7935.length) {
                    int[] var23 = this.field7935[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field7932[var25] += var18;
                        this.field7931[var25] += var19;
                        this.field7934[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var27 = arg1[var26];
                if (var27 < this.field7935.length) {
                    int[] var28 = this.field7935[var27];
                    if ((arg5 & 0x1) == 0) {
                        for (int var29 = 0; var29 < var28.length; var29++) {
                            int var30 = var28[var29];
                            this.field7932[var30] -= this.field7965;
                            this.field7931[var30] -= this.field7926;
                            this.field7934[var30] -= this.field7995;
                            if (arg4 != 0) {
                                int var31 = Trig1.field3439[arg4];
                                int var32 = Trig1.field3447[arg4];
                                int var33 = this.field7932[var30] * var32 + this.field7931[var30] * var31 + 16383 >> 14;
                                this.field7931[var30] = this.field7931[var30] * var32 - this.field7932[var30] * var31 + 16383 >> 14;
                                this.field7932[var30] = var33;
                            }
                            if (arg2 != 0) {
                                int var34 = Trig1.field3439[arg2];
                                int var35 = Trig1.field3447[arg2];
                                int var36 = this.field7931[var30] * var35 - this.field7934[var30] * var34 + 16383 >> 14;
                                this.field7934[var30] = this.field7934[var30] * var35 + this.field7931[var30] * var34 + 16383 >> 14;
                                this.field7931[var30] = var36;
                            }
                            if (arg3 != 0) {
                                int var37 = Trig1.field3439[arg3];
                                int var38 = Trig1.field3447[arg3];
                                int var39 = this.field7934[var30] * var37 + this.field7932[var30] * var38 + 16383 >> 14;
                                this.field7934[var30] = this.field7934[var30] * var38 - this.field7932[var30] * var37 + 16383 >> 14;
                                this.field7932[var30] = var39;
                            }
                            this.field7932[var30] += this.field7965;
                            this.field7931[var30] += this.field7926;
                            this.field7934[var30] += this.field7995;
                        }
                    } else {
                        for (int var40 = 0; var40 < var28.length; var40++) {
                            int var41 = var28[var40];
                            this.field7932[var41] -= this.field7965;
                            this.field7931[var41] -= this.field7926;
                            this.field7934[var41] -= this.field7995;
                            if (arg2 != 0) {
                                int var42 = Trig1.field3439[arg2];
                                int var43 = Trig1.field3447[arg2];
                                int var44 = this.field7931[var41] * var43 - this.field7934[var41] * var42 + 16383 >> 14;
                                this.field7934[var41] = this.field7934[var41] * var43 + this.field7931[var41] * var42 + 16383 >> 14;
                                this.field7931[var41] = var44;
                            }
                            if (arg4 != 0) {
                                int var45 = Trig1.field3439[arg4];
                                int var46 = Trig1.field3447[arg4];
                                int var47 = this.field7932[var41] * var46 + this.field7931[var41] * var45 + 16383 >> 14;
                                this.field7931[var41] = this.field7931[var41] * var46 - this.field7932[var41] * var45 + 16383 >> 14;
                                this.field7932[var41] = var47;
                            }
                            if (arg3 != 0) {
                                int var48 = Trig1.field3439[arg3];
                                int var49 = Trig1.field3447[arg3];
                                int var50 = this.field7934[var41] * var48 + this.field7932[var41] * var49 + 16383 >> 14;
                                this.field7934[var41] = this.field7934[var41] * var49 - this.field7932[var41] * var48 + 16383 >> 14;
                                this.field7932[var41] = var50;
                            }
                            this.field7932[var41] += this.field7965;
                            this.field7931[var41] += this.field7926;
                            this.field7934[var41] += this.field7995;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var51 = 0; var51 < var8; var51++) {
                    int var52 = arg1[var51];
                    if (var52 < this.field7935.length) {
                        int[] var53 = this.field7935[var52];
                        for (int var54 = 0; var54 < var53.length; var54++) {
                            int var55 = var53[var54];
                            int var56 = this.field7993[var55];
                            int var57 = this.field7993[var55 + 1];
                            for (int var58 = var56; var58 < var57; var58++) {
                                int var59 = this.field7979[var58] - 1;
                                if (var59 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var60 = Trig1.field3439[arg4];
                                    int var61 = Trig1.field3447[arg4];
                                    int var62 = this.field7960[var59] * var60 + this.field7924[var59] * var61 + 16383 >> 14;
                                    this.field7960[var59] = (short) (this.field7960[var59] * var61 - this.field7924[var59] * var60 + 16383 >> 14);
                                    this.field7924[var59] = (short) var62;
                                }
                                if (arg2 != 0) {
                                    int var63 = Trig1.field3439[arg2];
                                    int var64 = Trig1.field3447[arg2];
                                    int var65 = this.field7960[var59] * var64 - this.field7942[var59] * var63 + 16383 >> 14;
                                    this.field7942[var59] = (short) (this.field7960[var59] * var63 + this.field7942[var59] * var64 + 16383 >> 14);
                                    this.field7960[var59] = (short) var65;
                                }
                                if (arg3 != 0) {
                                    int var66 = Trig1.field3439[arg3];
                                    int var67 = Trig1.field3447[arg3];
                                    int var68 = this.field7942[var59] * var66 + this.field7924[var59] * var67 + 16383 >> 14;
                                    this.field7942[var59] = (short) (this.field7942[var59] * var67 - this.field7924[var59] * var66 + 16383 >> 14);
                                    this.field7924[var59] = (short) var68;
                                }
                            }
                        }
                    }
                }
                this.method13125();
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field7935.length) {
                    int[] var71 = this.field7935[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field7932[var73] -= this.field7965;
                        this.field7931[var73] -= this.field7926;
                        this.field7934[var73] -= this.field7995;
                        this.field7932[var73] = this.field7932[var73] * arg2 >> 7;
                        this.field7931[var73] = this.field7931[var73] * arg3 >> 7;
                        this.field7934[var73] = this.field7934[var73] * arg4 >> 7;
                        this.field7932[var73] += this.field7965;
                        this.field7931[var73] += this.field7926;
                        this.field7934[var73] += this.field7995;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7933 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var76 = arg1[var75];
                    if (var76 < this.field7933.length) {
                        int[] var77 = this.field7933[var76];
                        for (int var78 = 0; var78 < var77.length; var78++) {
                            int var79 = var77[var78];
                            int var80 = (this.field7950[var79] & 0xFF) + arg2 * 8;
                            if (var80 < 0) {
                                var80 = 0;
                            } else if (var80 > 255) {
                                var80 = 255;
                            }
                            this.field7950[var79] = (byte) var80;
                        }
                        var74 |= var77.length > 0;
                    }
                }
                if (var74) {
                    if (this.field7983 != null) {
                        for (int var81 = 0; var81 < this.field7938; var81++) {
                            GlModelRelated4 var82 = this.field7983[var81];
                            GlModelRelated5 var83 = this.field7984[var81];
                            var83.field2477 = var83.field2477 & 0xFFFFFF | 255 - (this.field7950[var82.field2524] & 0xFF) << 24;
                        }
                    }
                    this.method13174();
                }
            }
        } else if (arg0 == 7) {
            if (this.field7933 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var86 = arg1[var85];
                    if (var86 < this.field7933.length) {
                        int[] var87 = this.field7933[var86];
                        for (int var88 = 0; var88 < var87.length; var88++) {
                            int var89 = var87[var88];
                            int var90 = this.field7949[var89] & 0xFFFF;
                            int var91 = var90 >> 10 & 0x3F;
                            int var92 = var90 >> 7 & 0x7;
                            int var93 = var90 & 0x7F;
                            int var94 = arg2 + var91 & 0x3F;
                            int var95 = arg3 / 4 + var92;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var96 = arg4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 127) {
                                var96 = 127;
                            }
                            this.field7949[var89] = (short) (var94 << 10 | var95 << 7 | var96);
                        }
                        var84 |= var87.length > 0;
                    }
                }
                if (var84) {
                    if (this.field7983 != null) {
                        for (int var97 = 0; var97 < this.field7938; var97++) {
                            GlModelRelated4 var98 = this.field7983[var97];
                            GlModelRelated5 var99 = this.field7984[var97];
                            var99.field2477 = var99.field2477 & 0xFF000000 | Statics.field5084[this.field7949[var98.field2524] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method13174();
                }
            }
        } else if (arg0 == 8) {
            if (this.field7943 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field7943.length) {
                        int[] var102 = this.field7943[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            GlModelRelated5 var104 = this.field7984[var102[var103]];
                            var104.field2476 += arg2;
                            var104.field2473 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7943 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field7943.length) {
                        int[] var107 = this.field7943[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            GlModelRelated5 var109 = this.field7984[var107[var108]];
                            var109.field2474 = var109.field2474 * arg2 >> 7;
                            var109.field2475 = var109.field2475 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7943 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field7943.length) {
                    int[] var112 = this.field7943[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        GlModelRelated5 var114 = this.field7984[var112[var113]];
                        var114.field2478 = var114.field2478 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @ObfuscatedName("yg.ka()V")
    public void ka() {
        for (int var1 = 0; var1 < this.field7930; var1++) {
            this.field7932[var1] = this.field7932[var1] + 7 >> 4;
            this.field7931[var1] = this.field7931[var1] + 7 >> 4;
            this.field7934[var1] = this.field7934[var1] + 7 >> 4;
        }
        this.method13167();
        this.field7968 = false;
    }

    @ObfuscatedName("yg.ag(Lkc;IZ)V")
    public void method239(Matrix4x3 arg0, int arg1, boolean arg2) {
        if (this.field7978 == null) {
            return;
        }
        Matrix4x3 var4 = arg0;
        if (arg2) {
            var4 = this.field7925.field8351;
            var4.method5170(arg0);
        }
        float[] var5 = new float[3];
        for (int var6 = 0; var6 < this.field7959; var6++) {
            if ((arg1 & this.field7978[var6]) != 0) {
                var4.method5119((float) this.field7932[var6], (float) this.field7931[var6], (float) this.field7934[var6], var5);
                this.field7932[var6] = (int) var5[0];
                this.field7931[var6] = (int) var5[1];
                this.field7934[var6] = (int) var5[2];
            }
        }
    }

    @ObfuscatedName("yg.am()[Lct;")
    public ModelParticleEffector[] method413() {
        return this.field7981;
    }

    @ObfuscatedName("yg.aw()[Ldx;")
    public ModelParticleEmitter[] method276() {
        return this.field7985;
    }

    @ObfuscatedName("yg.ax(Lkc;)V")
    public void method294(Matrix4x3 arg0) {
        Matrix4x4 var2 = this.field7925.field8264;
        var2.method5385(arg0);
        if (this.field7985 != null) {
            for (int var3 = 0; var3 < this.field7985.length; var3++) {
                ModelParticleEmitter var4 = this.field7985[var3];
                ModelParticleEmitter var5 = var4;
                if (var4.field1372 != null) {
                    var5 = var4.field1372;
                }
                var5.field1378 = (int) (var2.field3480[8] * (float) this.field7934[var4.field1374] + var2.field3480[0] * (float) this.field7932[var4.field1374] + var2.field3480[4] * (float) this.field7931[var4.field1374] + var2.field3480[12]);
                var5.field1379 = (int) (var2.field3480[9] * (float) this.field7934[var4.field1374] + var2.field3480[1] * (float) this.field7932[var4.field1374] + var2.field3480[5] * (float) this.field7931[var4.field1374] + var2.field3480[13]);
                var5.field1380 = (int) (var2.field3480[10] * (float) this.field7934[var4.field1374] + var2.field3480[2] * (float) this.field7932[var4.field1374] + var2.field3480[6] * (float) this.field7931[var4.field1374] + var2.field3480[14]);
                var5.field1381 = (int) (var2.field3480[8] * (float) this.field7934[var4.field1375] + var2.field3480[0] * (float) this.field7932[var4.field1375] + var2.field3480[4] * (float) this.field7931[var4.field1375] + var2.field3480[12]);
                var5.field1377 = (int) (var2.field3480[9] * (float) this.field7934[var4.field1375] + var2.field3480[1] * (float) this.field7932[var4.field1375] + var2.field3480[5] * (float) this.field7931[var4.field1375] + var2.field3480[13]);
                var5.field1373 = (int) (var2.field3480[10] * (float) this.field7934[var4.field1375] + var2.field3480[2] * (float) this.field7932[var4.field1375] + var2.field3480[6] * (float) this.field7931[var4.field1375] + var2.field3480[14]);
                var5.field1384 = (int) (var2.field3480[8] * (float) this.field7934[var4.field1376] + var2.field3480[0] * (float) this.field7932[var4.field1376] + var2.field3480[4] * (float) this.field7931[var4.field1376] + var2.field3480[12]);
                var5.field1385 = (int) (var2.field3480[9] * (float) this.field7934[var4.field1376] + var2.field3480[1] * (float) this.field7932[var4.field1376] + var2.field3480[5] * (float) this.field7931[var4.field1376] + var2.field3480[13]);
                var5.field1386 = (int) (var2.field3480[10] * (float) this.field7934[var4.field1376] + var2.field3480[2] * (float) this.field7932[var4.field1376] + var2.field3480[6] * (float) this.field7931[var4.field1376] + var2.field3480[14]);
            }
        }
        if (this.field7981 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field7981.length; var6++) {
            ModelParticleEffector var7 = this.field7981[var6];
            ModelParticleEffector var8 = var7;
            if (var7.field1238 != null) {
                var8 = var7.field1238;
            }
            if (var7.field1237 == null) {
                var7.field1237 = new Matrix4x4(var2);
            } else {
                var7.field1237.method5412(var2);
            }
            var8.field1240 = (int) (var2.field3480[8] * (float) this.field7934[var7.field1239] + var2.field3480[0] * (float) this.field7932[var7.field1239] + var2.field3480[4] * (float) this.field7931[var7.field1239] + var2.field3480[12]);
            var8.field1241 = (int) (var2.field3480[9] * (float) this.field7934[var7.field1239] + var2.field3480[1] * (float) this.field7932[var7.field1239] + var2.field3480[5] * (float) this.field7931[var7.field1239] + var2.field3480[13]);
            var8.field1242 = (int) (var2.field3480[10] * (float) this.field7934[var7.field1239] + var2.field3480[2] * (float) this.field7932[var7.field1239] + var2.field3480[6] * (float) this.field7931[var7.field1239] + var2.field3480[14]);
        }
    }

    @ObfuscatedName("yg.ai(IILkc;ZI)Z")
    public boolean method272(int arg0, int arg1, Matrix4x3 arg2, boolean arg3, int arg4) {
        return this.method13131(arg0, arg1, 0, 0, arg2, arg3, arg4);
    }

    @ObfuscatedName("yg.ge(IIIILkc;ZI)Z")
    public boolean method13131(int arg0, int arg1, int arg2, int arg3, Matrix4x3 arg4, boolean arg5, int arg6) {
        Matrix4x4 var8 = this.field7925.field8264;
        var8.method5385(arg4);
        var8.method5384(this.field7925.field8318);
        boolean var9 = false;
        float var10 = Float.MAX_VALUE;
        float var11 = -3.4028235E38F;
        float var12 = Float.MAX_VALUE;
        float var13 = -3.4028235E38F;
        if (!this.field7968) {
            this.method13128();
        }
        int var14 = this.field7972 - this.field7971 >> 1;
        int var15 = this.field7970 - this.field7969 >> 1;
        int var16 = this.field7939 - this.field7982 >> 1;
        int var17 = this.field7971 + var14;
        int var18 = this.field7969 + var15;
        int var19 = this.field7982 + var16;
        int var20 = var17 - (var14 << arg6);
        int var21 = var18 - (var15 << arg6);
        int var22 = var19 - (var16 << arg6);
        int var23 = (var14 << arg6) + var17;
        int var24 = (var15 << arg6) + var18;
        int var25 = (var16 << arg6) + var19;
        this.field7990[0] = var20;
        this.field7976[0] = var21;
        this.field7992[0] = var22;
        this.field7990[1] = var23;
        this.field7976[1] = var21;
        this.field7992[1] = var22;
        this.field7990[2] = var20;
        this.field7976[2] = var24;
        this.field7992[2] = var22;
        this.field7990[3] = var23;
        this.field7976[3] = var24;
        this.field7992[3] = var22;
        this.field7990[4] = var20;
        this.field7976[4] = var21;
        this.field7992[4] = var25;
        this.field7990[5] = var23;
        this.field7976[5] = var21;
        this.field7992[5] = var25;
        this.field7990[6] = var20;
        this.field7976[6] = var24;
        this.field7992[6] = var25;
        this.field7990[7] = var23;
        this.field7976[7] = var24;
        this.field7992[7] = var25;
        for (int var26 = 0; var26 < 8; var26++) {
            float var27 = (float) this.field7990[var26];
            float var28 = (float) this.field7976[var26];
            float var29 = (float) this.field7992[var26];
            float var30 = var8.field3480[10] * var29 + var8.field3480[2] * var27 + var8.field3480[6] * var28 + var8.field3480[14];
            float var31 = var8.field3480[11] * var29 + var8.field3480[3] * var27 + var8.field3480[7] * var28 + var8.field3480[15];
            if (var30 >= -var31) {
                float var32 = var8.field3480[8] * var29 + var8.field3480[0] * var27 + var8.field3480[4] * var28 + var8.field3480[12];
                float var33 = var8.field3480[9] * var29 + var8.field3480[1] * var27 + var8.field3480[5] * var28 + var8.field3480[13];
                float var34 = this.field7925.field8282 * var32 / var31 + this.field7925.field8281;
                float var35 = this.field7925.field8284 * var33 / var31 + this.field7925.field8283;
                if (var34 < var10) {
                    var10 = var34;
                }
                if (var34 > var11) {
                    var11 = var34;
                }
                if (var35 < var12) {
                    var12 = var35;
                }
                if (var35 > var13) {
                    var13 = var35;
                }
                var9 = true;
            }
        }
        int var36 = arg0 + arg2;
        int var37 = arg1 + arg3;
        if (var9 && (float) var36 > var10 && (float) arg0 < var11 && (float) var37 > var12 && (float) arg1 < var13) {
            if (arg5) {
                return true;
            }
            if (this.field7988.length < this.field7937) {
                this.field7988 = new int[this.field7937];
                this.field7989 = new int[this.field7937];
            }
            for (int var38 = 0; var38 < this.field7959; var38++) {
                float var39 = (float) this.field7932[var38];
                float var40 = (float) this.field7931[var38];
                float var41 = (float) this.field7934[var38];
                float var42 = var8.field3480[10] * var41 + var8.field3480[2] * var39 + var8.field3480[6] * var40 + var8.field3480[14];
                float var43 = var8.field3480[11] * var41 + var8.field3480[3] * var39 + var8.field3480[7] * var40 + var8.field3480[15];
                if (var42 >= -var43) {
                    float var44 = var8.field3480[8] * var41 + var8.field3480[0] * var39 + var8.field3480[4] * var40 + var8.field3480[12];
                    float var45 = var8.field3480[9] * var41 + var8.field3480[1] * var39 + var8.field3480[5] * var40 + var8.field3480[13];
                    int var46 = this.field7993[var38];
                    int var47 = this.field7993[var38 + 1];
                    for (int var48 = var46; var48 < var47; var48++) {
                        int var49 = this.field7979[var48] - 1;
                        if (var49 == -1) {
                            break;
                        }
                        this.field7988[var49] = (int) (this.field7925.field8282 * var44 / var43 + this.field7925.field8281);
                        this.field7989[var49] = (int) (this.field7925.field8284 * var45 / var43 + this.field7925.field8283);
                    }
                } else {
                    int var50 = this.field7993[var38];
                    int var51 = this.field7993[var38 + 1];
                    for (int var52 = var50; var52 < var51; var52++) {
                        int var53 = this.field7979[var52] - 1;
                        if (var53 == -1) {
                            break;
                        }
                        this.field7988[this.field7979[var52] - 1] = -999999;
                    }
                }
            }
            for (int var54 = 0; var54 < this.field7947 * -1431655765; var54++) {
                if (this.field7988[this.field7951[var54]] != -999999 && this.field7988[this.field7974[var54]] != -999999 && this.field7988[this.field7953[var54]] != -999999 && this.method13132(arg0, arg1, var36, var37, this.field7989[this.field7951[var54]], this.field7989[this.field7974[var54]], this.field7989[this.field7953[var54]], this.field7988[this.field7951[var54]], this.field7988[this.field7974[var54]], this.field7988[this.field7953[var54]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("yg.gr(IIIIIIIIII)Z")
    public boolean method13132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
            return false;
        } else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
            return false;
        } else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
            return false;
        } else {
            return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
        }
    }

    @ObfuscatedName("yg.ga(Lna;)Lna;")
    public HardShadow ga(HardShadow arg0) {
        if (this.field7937 == 0) {
            return null;
        }
        if (!this.field7968) {
            this.method13128();
        }
        int var2;
        int var3;
        if (this.field7925.field8327 > 0) {
            var2 = this.field7971 - (this.field7925.field8327 * this.field7970 >> 8) >> this.field7925.field8326;
            var3 = this.field7972 - (this.field7925.field8327 * this.field7969 >> 8) >> this.field7925.field8326;
        } else {
            var2 = this.field7971 - (this.field7925.field8327 * this.field7969 >> 8) >> this.field7925.field8326;
            var3 = this.field7972 - (this.field7925.field8327 * this.field7970 >> 8) >> this.field7925.field8326;
        }
        int var4;
        int var5;
        if (this.field7925.field8371 > 0) {
            var4 = this.field7982 - (this.field7925.field8371 * this.field7970 >> 8) >> this.field7925.field8326;
            var5 = this.field7939 - (this.field7925.field8371 * this.field7969 >> 8) >> this.field7925.field8326;
        } else {
            var4 = this.field7982 - (this.field7925.field8371 * this.field7969 >> 8) >> this.field7925.field8326;
            var5 = this.field7939 - (this.field7925.field8371 * this.field7970 >> 8) >> this.field7925.field8326;
        }
        int var6 = var3 - var2 + 1;
        int var7 = var5 - var4 + 1;
        GpuHardShadow var8 = (GpuHardShadow) arg0;
        GpuHardShadow var9;
        if (var8 != null && var8.method17123(var6, var7)) {
            var9 = var8;
            var8.method17126();
        } else {
            var9 = new GpuHardShadow(this.field7925, var6, var7);
        }
        var9.method17141(var2, var4, var3, var5);
        this.method13133(var9);
        return var9;
    }

    @ObfuscatedName("yg.gf(Lalk;)V")
    public void method13133(GpuHardShadow arg0) {
        if (this.field7988.length < this.field7937) {
            this.field7988 = new int[this.field7937];
            this.field7989 = new int[this.field7937];
        }
        for (int var2 = 0; var2 < this.field7959; var2++) {
            int var3 = (this.field7932[var2] - (this.field7931[var2] * this.field7925.field8327 >> 8) >> this.field7925.field8326) - arg0.field10586;
            int var4 = (this.field7934[var2] - (this.field7931[var2] * this.field7925.field8371 >> 8) >> this.field7925.field8326) - arg0.field10585;
            int var5 = this.field7993[var2];
            int var6 = this.field7993[var2 + 1];
            for (int var7 = var5; var7 < var6; var7++) {
                int var8 = this.field7979[var7] - 1;
                if (var8 == -1) {
                    break;
                }
                this.field7988[var8] = var3;
                this.field7989[var8] = var4;
            }
        }
        for (int var9 = 0; var9 < this.field7948; var9++) {
            if (this.field7950 == null || this.field7950[var9] <= 128) {
                short var10 = this.field7951[var9];
                short var11 = this.field7974[var9];
                short var12 = this.field7953[var9];
                int var13 = this.field7988[var10];
                int var14 = this.field7988[var11];
                int var15 = this.field7988[var12];
                int var16 = this.field7989[var10];
                int var17 = this.field7989[var11];
                int var18 = this.field7989[var12];
                if ((var13 - var14) * (var17 - var18) - (var15 - var14) * (var17 - var16) > 0) {
                    arg0.method17127(var16, var17, var18, var13, var14, var15);
                }
            }
        }
    }

    @ObfuscatedName("yg.as(Lkc;Ldy;I)V")
    public void method271(Matrix4x3 arg0, ScreenBoundingBox arg1, int arg2) {
        if (Statics.field7997 != null) {
            Statics.field7997.method4273();
        }
        if (arg1 != null) {
            arg1.field1521 = false;
        }
        if (this.field7937 == 0) {
            return;
        }
        Matrix4x4 var4 = this.field7925.field8368;
        Matrix4x4 var5 = this.field7925.field8264;
        Matrix4x4 var6 = this.field7925.field8357;
        var5.method5385(arg0);
        var6.method5412(var5);
        var6.method5384(this.field7925.field8318);
        if (!this.field7968) {
            this.method13128();
        }
        float[] var7 = this.field7925.field8254;
        var5.method5390(0.0F, (float) this.field7969, 0.0F, var7);
        float var8 = var7[0];
        float var9 = var7[1];
        float var10 = var7[2];
        var5.method5390(0.0F, (float) this.field7970, 0.0F, var7);
        float var11 = var7[0];
        float var12 = var7[1];
        float var13 = var7[2];
        for (int var14 = 0; var14 < 6; var14++) {
            float[] var15 = this.field7925.field8280[var14];
            float var16 = var15[2] * var10 + var15[0] * var8 + var15[1] * var9 + var15[3] + (float) this.field7967;
            float var17 = var15[2] * var13 + var15[0] * var11 + var15[1] * var12 + var15[3] + (float) this.field7967;
            if (var16 < 0.0F && var17 < 0.0F) {
                return;
            }
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field7972 + this.field7971 >> 1;
            int var21 = this.field7982 + this.field7939 >> 1;
            int var23 = this.field7969;
            float var25 = var6.field3480[8] * (float) var21 + var6.field3480[0] * (float) var20 + var6.field3480[4] * (float) var23 + var6.field3480[12];
            float var26 = var6.field3480[9] * (float) var21 + var6.field3480[1] * (float) var20 + var6.field3480[5] * (float) var23 + var6.field3480[13];
            float var27 = var6.field3480[10] * (float) var21 + var6.field3480[2] * (float) var20 + var6.field3480[6] * (float) var23 + var6.field3480[14];
            float var28 = var6.field3480[11] * (float) var21 + var6.field3480[3] * (float) var20 + var6.field3480[7] * (float) var23 + var6.field3480[15];
            if (var27 >= -var28) {
                arg1.field1516 = (int) (this.field7925.field8282 * var25 / var28 + this.field7925.field8281);
                arg1.field1518 = (int) (this.field7925.field8284 * var26 / var28 + this.field7925.field8283);
            } else {
                var18 = true;
            }
            int var30 = this.field7970;
            float var32 = var6.field3480[8] * (float) var21 + var6.field3480[0] * (float) var20 + var6.field3480[4] * (float) var30 + var6.field3480[12];
            float var33 = var6.field3480[9] * (float) var21 + var6.field3480[1] * (float) var20 + var6.field3480[5] * (float) var30 + var6.field3480[13];
            float var34 = var6.field3480[10] * (float) var21 + var6.field3480[2] * (float) var20 + var6.field3480[6] * (float) var30 + var6.field3480[14];
            float var35 = var6.field3480[11] * (float) var21 + var6.field3480[3] * (float) var20 + var6.field3480[7] * (float) var30 + var6.field3480[15];
            if (var34 >= -var35) {
                arg1.field1519 = (int) (this.field7925.field8282 * var32 / var35 + this.field7925.field8281);
                arg1.field1520 = (int) (this.field7925.field8284 * var33 / var35 + this.field7925.field8283);
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
                    arg1.field1516 = (int) (this.field7925.field8282 * var37 / var39 + this.field7925.field8281);
                    arg1.field1518 = (int) (this.field7925.field8284 * var38 / var39 + this.field7925.field8283);
                } else if (var34 < -var35) {
                    float var40 = (var34 + var35) / (var27 + var28) - 1.0F;
                    float var41 = (var25 - var32) * var40 + var32;
                    float var42 = (var26 - var33) * var40 + var33;
                    float var43 = (var28 - var35) * var40 + var35;
                    arg1.field1519 = (int) (this.field7925.field8282 * var41 / var43 + this.field7925.field8281);
                    arg1.field1520 = (int) (this.field7925.field8284 * var42 / var43 + this.field7925.field8283);
                }
            }
            if (var19) {
                if (var27 / var28 > var34 / var35) {
                    float var44 = var4.field3480[0] * (float) this.field7967 + var25 + var4.field3480[12];
                    float var45 = var4.field3480[3] * (float) this.field7967 + var28 + var4.field3480[15];
                    arg1.field1517 = (int) (this.field7925.field8282 * var44 / var45 + (this.field7925.field8281 - (float) arg1.field1516));
                } else {
                    float var46 = var4.field3480[0] * (float) this.field7967 + var32 + var4.field3480[12];
                    float var47 = var4.field3480[3] * (float) this.field7967 + var35 + var4.field3480[15];
                    arg1.field1517 = (int) (this.field7925.field8282 * var46 / var47 + (this.field7925.field8281 - (float) arg1.field1519));
                }
                arg1.field1521 = true;
            }
        }
        this.field7925.method13523(arg2);
        this.method13134(arg0);
        this.field7925.method13523(0);
        var5.method5385(arg0);
        var5.method5384(this.field7925.field8258);
        this.method13162(var5);
    }

    @ObfuscatedName("yg.gl(Lkc;)V")
    public void method13134(Matrix4x3 arg0) {
        if (this.field7948 == 0 || (!this.method13129() || !this.method13135())) {
            return;
        }
        if (Statics.field7997 != null) {
        }
        this.field7925.method13598();
        ModelShader var2 = this.field7925.field8345;
        this.field7925.method13587(0, this.field7958.field2536);
        this.field7925.method13587(1, this.field7927.field2536);
        this.field7925.method13587(2, this.field7961.field2536);
        this.field7925.method13588(this.field7957.field2420);
        this.field7925.field8264.method5385(arg0);
        var2.method3848(this.field7925.field8264);
        var2.field2248.method5453();
        if (this.field7925.field8274) {
            WaterFogData var3 = this.field7925.method13573();
            var2.field2266.method5074(0.0F, 1.0F, 0.0F, (float) -this.field7925.field8236);
            var2.field2266.method5079(3.0F / (float) var3.field1471);
            var2.field2259.method5373((float) (var3.field1475 >> 16 & 0xFF) / 255.0F, (float) (var3.field1475 >> 8 & 0xFF) / 255.0F, (float) (var3.field1475 >> 0 & 0xFF) / 255.0F);
        } else {
            var2.field2266.method5074(0.0F, 0.0F, 0.0F, 0.0F);
            var2.field2259.method5373(0.0F, 0.0F, 0.0F);
        }
        if (this.field7925.field8364 > 0) {
            var2.field2260.method5074(0.0F, 0.0F, 1.0F, -this.field7925.field8251);
            var2.field2249.method5373((float) (this.field7925.field8363 >> 16 & 0xFF) / 255.0F, (float) (this.field7925.field8363 >> 8 & 0xFF) / 255.0F, (float) (this.field7925.field8363 >> 0 & 0xFF) / 255.0F);
            this.field7925.field8264.method5385(arg0);
            this.field7925.field8264.method5407();
            var2.field2266.method5082(this.field7925.field8264);
            this.field7925.field8264.method5385(arg0);
            this.field7925.field8264.method5384(this.field7925.field8258);
            this.field7925.field8264.method5407();
            var2.field2260.method5082(this.field7925.field8264);
            var2.field2260.method5079(1.0F / (this.field7925.field8304 - this.field7925.field8251));
        } else {
            var2.field2260.method5074(0.0F, 0.0F, 0.0F, 0.0F);
            var2.field2249.method5373(0.0F, 0.0F, 0.0F);
        }
        if ((this.field7952 & 0x37) == 0) {
            this.field7925.method13688(this.field7925.field8298);
            if (this.field7925.field8242) {
                this.field7925.method13539(false);
            }
            for (int var4 = 0; var4 < this.field7966.length; var4++) {
                int var5 = this.field7975[var4];
                int var6 = this.field7975[var4 + 1];
                int var7 = this.field7936[var5] & 0xFFFF;
                boolean var8 = false;
                if (var7 == 65535) {
                    var2.field2268 = this.field7925.field8312;
                    float[] var10 = var2.field2248.field3480;
                    var2.field2248.field3480[13] = 0.0F;
                    var10[12] = 0.0F;
                } else {
                    var2.field2268 = this.field7925.field8336.method4359(var7);
                    Material var9 = this.field7925.field400.method889(var7);
                    var8 = !Material.method12638(var9.field1270);
                    var2.field2248.field3480[12] = (float) (this.field7925.field8391 % 128000) / 1000.0F * (float) var9.field1268 / 64.0F % 1.0F;
                    var2.field2248.field3480[13] = (float) (this.field7925.field8391 % 128000) / 1000.0F * (float) var9.field1261 / 64.0F % 1.0F;
                }
                var2.field2267 = this.field7966[var4];
                var2.field2261 = this.field7977[var4];
                var2.field2269 = var5 * 3;
                var2.field2252 = var6 - var5;
                var2.method3849(var8);
            }
        } else {
            this.field7925.method13587(3, this.field7956.field2536);
            this.field7925.method13688(this.field7925.field8343);
            Matrix4x3 var11 = this.field7925.field8351;
            var11.method5115(arg0);
            var11.method5102();
            int var12 = 0;
            if (this.field7925.field8242) {
                this.field7925.method13539(true);
            } else {
                var2.field2262.method5373(this.field7925.field8272[0], this.field7925.field8272[1], this.field7925.field8272[2]);
                var2.field2262.method5324(var11);
                var2.field2263.method5373(this.field7925.field8320 * this.field7925.field8316, this.field7925.field8320 * this.field7925.field8317, this.field7925.field8320 * this.field7925.field8237);
                var2.field2264.method5373(-this.field7925.field8373 * this.field7925.field8316, -this.field7925.field8373 * this.field7925.field8317, -this.field7925.field8373 * this.field7925.field8237);
                var2.field2265.method5373(this.field7925.field8319 * this.field7925.field8316, this.field7925.field8319 * this.field7925.field8317, this.field7925.field8319 * this.field7925.field8237);
                if (this.field7925.field8323 > 0) {
                    var12 = this.field7925.field8323;
                    Vector3 var13 = this.field7925.field8266;
                    for (int var14 = 0; var14 < var12; var14++) {
                        Light var15 = this.field7925.field8365[var14];
                        int var16 = var15.method14881();
                        var13.method5334(var15.field9369);
                        var13.method5319(var11);
                        var2.field2251[var14 * 4] = var13.field3475;
                        var2.field2251[var14 * 4 + 1] = var13.field3476;
                        var2.field2251[var14 * 4 + 2] = var13.field3477;
                        var2.field2251[var14 * 4 + 3] = var15.method14880() * var15.method14880();
                        float var17 = var15.method14893() / 255.0F;
                        var2.field2250[var14 * 4] = (float) (var16 >> 16 & 0xFF) * var17;
                        var2.field2250[var14 * 4 + 1] = (float) (var16 >> 8 & 0xFF) * var17;
                        var2.field2250[var14 * 4 + 2] = (float) (var16 & 0xFF) * var17;
                        var2.field2250[var14 * 4 + 3] = 1.0F;
                    }
                }
            }
            for (int var18 = 0; var18 < this.field7966.length; var18++) {
                int var19 = this.field7975[var18];
                int var20 = this.field7975[var18 + 1];
                int var21 = this.field7936[var19] & 0xFFFF;
                byte var22 = 11;
                if (var21 == 65535) {
                    var2.field2268 = this.field7925.field8312;
                    float[] var24 = var2.field2248.field3480;
                    var2.field2248.field3480[13] = 0.0F;
                    var24[12] = 0.0F;
                } else {
                    var2.field2268 = this.field7925.field8336.method4359(var21);
                    Material var23 = this.field7925.field400.method889(var21);
                    var22 = var23.field1270;
                    var2.method3862(var23);
                    var2.field2248.field3480[12] = (float) (this.field7925.field8391 % 128000) / 1000.0F * (float) var23.field1268 / 64.0F % 1.0F;
                    var2.field2248.field3480[13] = (float) (this.field7925.field8391 % 128000) / 1000.0F * (float) var23.field1261 / 64.0F % 1.0F;
                }
                var2.field2267 = this.field7966[var18];
                var2.field2261 = this.field7977[var18];
                var2.field2269 = var19 * 3;
                var2.field2252 = var20 - var19;
                switch (var22) {
                    case 1:
                        var2.field2258.method5373(this.field7925.field8322.field3480[12], this.field7925.field8322.field3480[13], this.field7925.field8322.field3480[14]);
                        var2.field2258.method5319(var11);
                        var2.method3851(var12);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    default:
                        var2.method3850(var12);
                        break;
                    case 5:
                        if (this.field7925.field8242) {
                            var2.method3850(var12);
                        } else {
                            WaterfallShader var25 = this.field7925.field8277;
                            Material var26 = this.field7925.field400.method889(var21);
                            var25.method16193(var26.field1248, var26.field1264);
                            var25.field10089.method5385(arg0);
                            var25.field10093.method5385(arg0);
                            var25.field10093.method5384(this.field7925.field8279);
                            var25.field10095 = this.field7966[var18];
                            var25.field10090 = this.field7977[var18];
                            var25.field10103 = var19 * 3;
                            var25.field10088 = var20 - var19;
                            var25.method16192();
                        }
                        break;
                    case 6:
                        var2.method3849(!Material.method12638(var22));
                        break;
                    case 7:
                        var2.field2258.method5373(this.field7925.field8322.field3480[12], this.field7925.field8322.field3480[13], this.field7925.field8322.field3480[14]);
                        var2.field2258.method5319(var11);
                        var2.field2256.method5385(arg0);
                        var2.field2253 = this.field7925.method13516();
                        var2.method3852(var12);
                }
            }
        }
        this.method13122();
    }

    @ObfuscatedName("yg.gb(Lka;)V")
    public void method13162(Matrix4x4 arg0) {
        if (this.field7983 == null) {
            return;
        }
        this.field7925.RA(!this.field7964);
        Matrix4x3 var2 = this.field7925.field8351;
        ParticleShader var3 = this.field7925.field8314;
        for (int var4 = 0; var4 < this.field7938; var4++) {
            GlModelRelated4 var5 = this.field7983[var4];
            GlModelRelated5 var6 = this.field7984[var4];
            if (!var5.field2523 || !this.field7925.method600()) {
                float var7 = (float) (this.field7932[var5.field2526] + this.field7932[var5.field2522] + this.field7932[var5.field2521]) * 0.3333333F;
                float var8 = (float) (this.field7931[var5.field2526] + this.field7931[var5.field2522] + this.field7931[var5.field2521]) * 0.3333333F;
                float var9 = (float) (this.field7934[var5.field2526] + this.field7934[var5.field2522] + this.field7934[var5.field2521]) * 0.3333333F;
                float var10 = arg0.field3480[8] * var9 + arg0.field3480[0] * var7 + arg0.field3480[4] * var8 + arg0.field3480[12];
                float var11 = arg0.field3480[9] * var9 + arg0.field3480[1] * var7 + arg0.field3480[5] * var8 + arg0.field3480[13];
                float var12 = arg0.field3480[10] * var9 + arg0.field3480[2] * var7 + arg0.field3480[6] * var8 + arg0.field3480[14];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var10 * var10 + var11 * var11))) * (float) var5.field2529;
                var2.method5188(var6.field2478, var5.field2528 * var6.field2474 >> 7, var5.field2525 * var6.field2475 >> 7, (float) var6.field2476 + var10 - var10 * var13, (float) var6.field2473 + var11 - var11 * var13, var12 - var12 * var13);
                var2.method5117(this.field7925.field8257);
                this.field7925.field8357.method5385(var2);
                var3.method3875(this.field7925.field8357);
                var3.field2273.method5453();
                var3.field2272 = var6.field2477;
                var3.field2271 = this.field7925.field8336.method4359(var5.field2527);
                var3.method3872();
            }
        }
        this.field7925.RA(true);
    }

    @ObfuscatedName("yg.go()Z")
    public boolean method13135() {
        if (this.field7957.field2418) {
            return true;
        }
        if (this.field7957.field2421 == null) {
            this.field7957.field2421 = this.field7925.method13797(false);
        }
        IndexBuffer var1 = this.field7957.field2421;
        var1.method4535(this.field7948 * 6);
        Unsafe var2 = this.field7925.field8247;
        if (var2 != null) {
            int var3 = this.field7948 * 6;
            long var4 = var1.method4453(0, var3);
            if (var4 == 0L) {
                return false;
            }
            for (int var6 = 0; var6 < this.field7948; var6++) {
                var2.putShort(var4, this.field7951[var6]);
                long var7 = var4 + 2L;
                var2.putShort(var7, this.field7974[var6]);
                long var9 = var7 + 2L;
                var2.putShort(var9, this.field7953[var6]);
                var4 = var9 + 2L;
            }
            var1.method4454();
            this.field7957.field2420 = var1;
            this.field7957.field2418 = true;
            this.field7963 = true;
            return true;
        }
        ByteBuffer var11 = this.field7925.field8244;
        var11.clear();
        for (int var12 = 0; var12 < this.field7948; var12++) {
            var11.putShort(this.field7951[var12]);
            var11.putShort(this.field7974[var12]);
            var11.putShort(this.field7953[var12]);
        }
        if (var1.method4452(0, var11.position(), this.field7925.field8245)) {
            this.field7957.field2420 = var1;
            this.field7957.field2418 = true;
            this.field7963 = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("yg.gi()Z")
    public boolean method13129() {
        boolean var1 = !this.field7927.field2538;
        boolean var2 = (this.field7952 & 0x37) != 0 && !this.field7956.field2538;
        boolean var3 = !this.field7958.field2538;
        boolean var4 = !this.field7961.field2538;
        if (!var3 && !var1 && !var2 && !var4) {
            return true;
        }
        boolean var5 = true;
        if (var3 && this.field7994 != null) {
            if (this.field7958.field2537 == null) {
                this.field7958.field2537 = this.field7925.method13584(this.field7962);
            }
            VertexBuffer var6 = this.field7958.field2537;
            var6.method4269(this.field7937 * 12, 12);
            Unsafe var7 = this.field7925.field8247;
            if (var7 == null) {
                ByteBuffer var17 = this.field7925.field8244;
                var17.clear();
                for (int var18 = 0; var18 < this.field7937; var18++) {
                    var17.putFloat((float) this.field7932[this.field7994[var18]]);
                    var17.putFloat((float) this.field7931[this.field7994[var18]]);
                    var17.putFloat((float) this.field7934[this.field7994[var18]]);
                }
                var6.method4452(0, var17.position(), this.field7925.field8245);
            } else {
                int var8 = this.field7937 * 12;
                long var9 = var6.method4453(0, var8);
                for (int var11 = 0; var11 < this.field7937; var11++) {
                    short var12 = this.field7994[var11];
                    var7.putFloat(var9, (float) this.field7932[var12]);
                    long var13 = var9 + 4L;
                    var7.putFloat(var13, (float) this.field7931[var12]);
                    long var15 = var13 + 4L;
                    var7.putFloat(var15, (float) this.field7934[var12]);
                    var9 = var15 + 4L;
                }
                var6.method4454();
            }
            this.field7958.field2536 = var6;
            this.field7958.field2538 = true;
        }
        if (var1) {
            if (this.field7927.field2537 == null) {
                this.field7927.field2537 = this.field7925.method13584(this.field7962);
            }
            VertexBuffer var19 = this.field7927.field2537;
            var19.method4269(this.field7937 * 4, 4);
            Unsafe var20 = this.field7925.field8247;
            if (var20 == null) {
                ByteBuffer var45 = this.field7925.field8244;
                var45.clear();
                if ((this.field7952 & 0x37) == 0) {
                    short[] var46;
                    short[] var47;
                    short[] var48;
                    byte[] var49;
                    if (this.field7955 == null) {
                        var46 = this.field7924;
                        var47 = this.field7960;
                        var48 = this.field7942;
                        var49 = this.field7973;
                    } else {
                        var46 = this.field7955.field2588;
                        var47 = this.field7955.field2586;
                        var48 = this.field7955.field2587;
                        var49 = this.field7955.field2589;
                    }
                    float var50 = this.field7925.field8320 * 768.0F / (float) this.field7929;
                    float var51 = this.field7925.field8373 * 768.0F / (float) this.field7929;
                    for (int var52 = 0; var52 < this.field7937; var52++) {
                        short var53 = this.field7954[var52];
                        int var54 = this.method13139(this.field7949[var53] & 0xFFFF, this.field7936[var53], this.field7928);
                        float var55 = (float) (var54 >> 16 & 0xFF) * this.field7925.field8316;
                        float var56 = (float) (var54 >> 8 & 0xFF) * this.field7925.field8317;
                        float var57 = (float) (var54 & 0xFF) * this.field7925.field8237;
                        byte var58 = var49[var52];
                        float var59;
                        if (var58 == 0) {
                            var59 = (this.field7925.field8272[2] * (float) var48[var52] + this.field7925.field8272[0] * (float) var46[var52] + this.field7925.field8272[1] * (float) var47[var52]) * 0.0026041667F;
                        } else {
                            var59 = (this.field7925.field8272[2] * (float) var48[var52] + this.field7925.field8272[0] * (float) var46[var52] + this.field7925.field8272[1] * (float) var47[var52]) / ((float) var58 * 256.0F);
                        }
                        float var60 = this.field7925.field8319 + var59 * (var59 < 0.0F ? var51 : var50);
                        int var61 = (int) (var55 * var60);
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 255) {
                            var61 = 255;
                        }
                        int var62 = (int) (var56 * var60);
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 255) {
                            var62 = 255;
                        }
                        int var63 = (int) (var57 * var60);
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 255) {
                            var63 = 255;
                        }
                        var45.putInt(255 - this.field7950[var53] << 24 | var61 << 16 | var62 << 8 | var63);
                    }
                } else {
                    for (int var64 = 0; var64 < this.field7937; var64++) {
                        short var65 = this.field7954[var64];
                        int var66 = 255 - this.field7950[var65] << 24 | this.method13139(this.field7949[var65] & 0xFFFF, this.field7936[var65], this.field7928);
                        var45.putInt(var66);
                    }
                }
                var19.method4452(0, var45.position(), this.field7925.field8245);
            } else {
                int var21 = this.field7937 * 4;
                long var22 = var19.method4453(0, var21);
                if ((this.field7952 & 0x37) == 0) {
                    short[] var24;
                    short[] var25;
                    short[] var26;
                    byte[] var27;
                    if (this.field7955 == null) {
                        var24 = this.field7924;
                        var25 = this.field7960;
                        var26 = this.field7942;
                        var27 = this.field7973;
                    } else {
                        var24 = this.field7955.field2588;
                        var25 = this.field7955.field2586;
                        var26 = this.field7955.field2587;
                        var27 = this.field7955.field2589;
                    }
                    float var28 = this.field7925.field8320 * 768.0F / (float) this.field7929;
                    float var29 = this.field7925.field8373 * 768.0F / (float) this.field7929;
                    for (int var30 = 0; var30 < this.field7937; var30++) {
                        short var31 = this.field7954[var30];
                        int var32 = this.method13139(this.field7949[var31] & 0xFFFF, this.field7936[var31], this.field7928);
                        float var33 = (float) (var32 >> 16 & 0xFF) * this.field7925.field8316;
                        float var34 = (float) (var32 >> 8 & 0xFF) * this.field7925.field8317;
                        float var35 = (float) (var32 & 0xFF) * this.field7925.field8237;
                        byte var36 = var27[var30];
                        float var37;
                        if (var36 == 0) {
                            var37 = (this.field7925.field8272[2] * (float) var26[var30] + this.field7925.field8272[0] * (float) var24[var30] + this.field7925.field8272[1] * (float) var25[var30]) * 0.0026041667F;
                        } else {
                            var37 = (this.field7925.field8272[2] * (float) var26[var30] + this.field7925.field8272[0] * (float) var24[var30] + this.field7925.field8272[1] * (float) var25[var30]) / ((float) var36 * 256.0F);
                        }
                        float var38 = this.field7925.field8319 + var37 * (var37 < 0.0F ? var29 : var28);
                        int var39 = (int) (var33 * var38);
                        if (var39 < 0) {
                            var39 = 0;
                        } else if (var39 > 255) {
                            var39 = 255;
                        }
                        int var40 = (int) (var34 * var38);
                        if (var40 < 0) {
                            var40 = 0;
                        } else if (var40 > 255) {
                            var40 = 255;
                        }
                        int var41 = (int) (var35 * var38);
                        if (var41 < 0) {
                            var41 = 0;
                        } else if (var41 > 255) {
                            var41 = 255;
                        }
                        var20.putInt(var22, 255 - this.field7950[var31] << 24 | var39 << 16 | var40 << 8 | var41);
                        var22 += 4L;
                    }
                } else {
                    for (int var42 = 0; var42 < this.field7937; var42++) {
                        short var43 = this.field7954[var42];
                        int var44 = 255 - this.field7950[var43] << 24 | this.method13139(this.field7949[var43] & 0xFFFF, this.field7936[var43], this.field7928);
                        var20.putInt(var22, var44);
                        var22 += 4L;
                    }
                }
                var19.method4454();
            }
            this.field7927.field2536 = var19;
            this.field7927.field2538 = true;
        }
        if (var2) {
            if (this.field7956.field2537 == null) {
                this.field7956.field2537 = this.field7925.method13584(this.field7962);
            }
            VertexBuffer var67 = this.field7956.field2537;
            var67.method4269(this.field7937 * 12, 12);
            short[] var68;
            short[] var69;
            short[] var70;
            byte[] var71;
            if (this.field7955 == null) {
                var68 = this.field7924;
                var69 = this.field7960;
                var70 = this.field7942;
                var71 = this.field7973;
            } else {
                var68 = this.field7955.field2588;
                var69 = this.field7955.field2586;
                var70 = this.field7955.field2587;
                var71 = this.field7955.field2589;
            }
            float var72 = 3.0F / (float) this.field7929;
            float var73 = 3.0F / (float) (this.field7929 / 2 + this.field7929);
            Unsafe var74 = this.field7925.field8247;
            if (var74 == null) {
                ByteBuffer var87 = this.field7925.field8244;
                var87.clear();
                for (int var88 = 0; var88 < this.field7937; var88++) {
                    float var89 = var71[var88] == 0 ? var73 : var72 / (float) var71[var88];
                    float var90 = (float) var68[var88] * var89;
                    float var91 = (float) var69[var88] * var89;
                    float var92 = (float) var70[var88] * var89;
                    var87.putFloat(var90);
                    var87.putFloat(var91);
                    var87.putFloat(var92);
                }
                var67.method4452(0, var87.position(), this.field7925.field8245);
            } else {
                int var75 = this.field7937 * 12;
                long var76 = var67.method4453(0, var75);
                for (int var78 = 0; var78 < this.field7937; var78++) {
                    float var79 = var71[var78] == 0 ? var73 : var72 / (float) var71[var78];
                    float var80 = (float) var68[var78] * var79;
                    float var81 = (float) var69[var78] * var79;
                    float var82 = (float) var70[var78] * var79;
                    var74.putFloat(var76, var80);
                    long var83 = var76 + 4L;
                    var74.putFloat(var83, var81);
                    long var85 = var83 + 4L;
                    var74.putFloat(var85, var82);
                    var76 = var85 + 4L;
                }
                var67.method4454();
            }
            this.field7956.field2536 = var67;
            this.field7956.field2538 = true;
        }
        if (var4) {
            if (this.field7961.field2537 == null) {
                this.field7961.field2537 = this.field7925.method13584(this.field7962);
            }
            VertexBuffer var93 = this.field7961.field2537;
            var93.method4269(this.field7937 * 8, 8);
            Unsafe var94 = this.field7925.field8247;
            if (var94 == null) {
                ByteBuffer var101 = this.field7925.field8244;
                var101.clear();
                for (int var102 = 0; var102 < this.field7937; var102++) {
                    var101.putFloat(this.field7944[var102]);
                    var101.putFloat(this.field7945[var102]);
                }
                var93.method4452(0, var101.position(), this.field7925.field8245);
            } else {
                int var95 = this.field7937 * 8;
                long var96 = var93.method4453(0, var95);
                for (int var98 = 0; var98 < this.field7937; var98++) {
                    var94.putFloat(var96, this.field7944[var98]);
                    long var99 = var96 + 4L;
                    var94.putFloat(var99, this.field7945[var98]);
                    var96 = var99 + 4L;
                }
                var93.method4454();
            }
            this.field7961.field2536 = var93;
            this.field7961.field2538 = true;
        }
        return var5;
    }

    @ObfuscatedName("yg.gs()V")
    public void method13137() {
        if (this.field7958 != null) {
            this.field7958.method4491();
        }
        if (this.field7961 != null) {
            this.field7961.method4491();
        }
        if (this.field7927 != null) {
            this.field7927.method4491();
        }
        if (this.field7956 != null) {
            this.field7956.method4491();
        }
        if (this.field7957 != null) {
            this.field7957.method4265();
        }
    }

    @ObfuscatedName("yg.gd(II)I")
    public int method13141(int arg0, int arg1) {
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @ObfuscatedName("yg.gj(ISI)I")
    public int method13139(int arg0, short arg1, int arg2) {
        int var4 = this.field7925.field8243[this.method13141(arg0, arg2)];
        if (arg1 != -1) {
            Material var5 = this.field7925.field400.method889(arg1 & 0xFFFF);
            int var6 = var5.field1266 & 0xFF;
            if (var6 != 0) {
                int var7 = arg2 * 131586;
                if (var6 == 256) {
                    var4 = var7;
                } else {
                    int var9 = 256 - var6;
                    var4 = ((var4 & 0xFF00FF) * var9 + (var7 & 0xFF00FF) * var6 & 0xFF00FF00) + ((var4 & 0xFF00) * var9 + (var7 & 0xFF00) * var6 & 0xFF0000) >> 8;
                }
            }
            int var10 = var5.field1267 & 0xFF;
            if (var10 != 0) {
                var10 += 256;
                int var11 = (var4 >> 16 & 0xFF) * var10;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 >> 8 & 0xFF) * var10;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (var4 & 0xFF) * var10;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                var4 = (var13 >> 8) + ((var11 & 0xFF00) << 8) + (var12 & 0xFF00);
            }
        }
        return var4 & 0xFFFFFF;
    }
}
