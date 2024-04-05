import deob.ObfuscatedName;

@ObfuscatedName("acq")
public class GlFloorModelRelated extends Node {

    @ObfuscatedName("acq.s")
    public final GlToolkit field9330;

    @ObfuscatedName("acq.c")
    public final GlFloorModel field9333;

    @ObfuscatedName("acq.m")
    public final Light field9324;

    @ObfuscatedName("acq.t")
    public int field9325;

    @ObfuscatedName("acq.l")
    public int field9326;

    @ObfuscatedName("acq.f")
    public int field9327;

    @ObfuscatedName("acq.d")
    public int field9328;

    @ObfuscatedName("acq.z")
    public int field9331;

    @ObfuscatedName("acq.n")
    public int field9336;

    @ObfuscatedName("acq.o")
    public final GlBinding field9322;

    @ObfuscatedName("acq.q")
    public final GlInterfaceRelated field9332;

    @ObfuscatedName("acq.p")
    public final GlRelated1 field9323;

    @ObfuscatedName("acq.w")
    public final GlRelated1 field9334;

    @ObfuscatedName("acq.b")
    public float[][] field9335;

    @ObfuscatedName("acq.x")
    public float[][] field9329;

    @ObfuscatedName("acq.i")
    public float[][] field9337;

    @ObfuscatedName("acq.v")
    public Packet field9338;

    @ObfuscatedName("acq.k")
    public GpuPacket field9339;

    @ObfuscatedName("acq.h")
    public HashTable field9340;

    public GlFloorModelRelated(GlToolkit arg0, GlFloorModel arg1, Light arg2, int[] arg3) {
        this.field9330 = arg0;
        this.field9324 = arg2;
        this.field9333 = arg1;
        int var5 = this.field9324.method14880() - (arg1.field385 >> 1);
        this.field9325 = this.field9324.method14888() - var5 >> arg1.field388;
        this.field9326 = this.field9324.method14888() + var5 >> arg1.field388;
        this.field9327 = this.field9324.method14879() - var5 >> arg1.field388;
        this.field9328 = this.field9324.method14879() + var5 >> arg1.field388;
        int var6 = this.field9326 - this.field9325 + 1;
        int var7 = this.field9328 - this.field9327 + 1;
        this.field9335 = new float[var6 + 1][var7 + 1];
        this.field9329 = new float[var6 + 1][var7 + 1];
        this.field9337 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field9327 + var8;
            if (var9 > 0 && var9 < this.field9333.field386 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field9325 + var10;
                    if (var11 > 0 && var11 < this.field9333.field387 - 1) {
                        int var12 = arg1.method199(var11 + 1, var9) - arg1.method199(var11 - 1, var9);
                        int var13 = arg1.method199(var11, var9 + 1) - arg1.method199(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                        this.field9335[var10][var8] = (float) var12 * var14;
                        this.field9329[var10][var8] = var14 * -256.0F;
                        this.field9337[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        for (int var16 = this.field9327; var16 <= this.field9328; var16++) {
            if (var16 >= 0 && var16 < arg1.field386) {
                for (int var17 = this.field9325; var17 <= this.field9326; var17++) {
                    if (var17 >= 0 && var17 < arg1.field387) {
                        int var18 = arg3[var15];
                        int[] var19 = arg1.field7691[var17][var16];
                        if (var19 != null && var18 != 0) {
                            if (var18 == 1) {
                                for (int var20 = 0; var20 < var19.length; var20 += 3) {
                                    if (var19[var20] != -1 && var19[var20 + 1] != -1 && var19[var20 + 2] != -1) {
                                        this.field9336 += 3;
                                    }
                                }
                            } else {
                                this.field9336 += 3;
                            }
                        }
                    }
                    var15++;
                }
            } else {
                var15 += this.field9326 - this.field9325;
            }
        }
        if (this.field9336 > 0) {
            this.field9338 = new Packet(this.field9336 * 2);
            this.field9339 = new GpuPacket(this.field9336 * 16);
            this.field9340 = new HashTable(IntMath.method2839(this.field9336));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field9327; var23 <= this.field9328; var23++) {
                if (var23 >= 0 && var23 < arg1.field386) {
                    int var24 = 0;
                    for (int var25 = this.field9325; var25 <= this.field9326; var25++) {
                        if (var25 >= 0 && var25 < arg1.field387) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field7691[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    int[] var28 = arg1.field7699[var25][var23];
                                    int[] var29 = arg1.field7718[var25][var23];
                                    int var30 = 0;
                                    label110:
                                    while (true) {
                                        while (true) {
                                            if (var30 >= var27.length) {
                                                break label110;
                                            }
                                            if (var27[var30] == -1 || var27[var30 + 1] == -1 || var27[var30 + 2] == -1) {
                                                var30 += 3;
                                            } else {
                                                this.method14856(var24, var21, var25, var23, var28[var30], var29[var30]);
                                                var30++;
                                                this.method14856(var24, var21, var25, var23, var28[var30], var29[var30]);
                                                var30++;
                                                this.method14856(var24, var21, var25, var23, var28[var30], var29[var30]);
                                                var30++;
                                            }
                                        }
                                    }
                                } else if (var26 == 3) {
                                    this.method14856(var24, var21, var25, var23, 0, 0);
                                    this.method14856(var24, var21, var25, var23, arg1.field385, 0);
                                    this.method14856(var24, var21, var25, var23, 0, arg1.field385);
                                } else if (var26 == 2) {
                                    this.method14856(var24, var21, var25, var23, arg1.field385, 0);
                                    this.method14856(var24, var21, var25, var23, arg1.field385, arg1.field385);
                                    this.method14856(var24, var21, var25, var23, 0, 0);
                                } else if (var26 == 5) {
                                    this.method14856(var24, var21, var25, var23, arg1.field385, arg1.field385);
                                    this.method14856(var24, var21, var25, var23, 0, arg1.field385);
                                    this.method14856(var24, var21, var25, var23, arg1.field385, 0);
                                } else if (var26 == 4) {
                                    this.method14856(var24, var21, var25, var23, 0, arg1.field385);
                                    this.method14856(var24, var21, var25, var23, 0, 0);
                                    this.method14856(var24, var21, var25, var23, arg1.field385, arg1.field385);
                                }
                            }
                        }
                        var22++;
                        var24++;
                    }
                } else {
                    var22 += this.field9326 - this.field9325;
                }
                var21++;
            }
            this.field9322 = this.field9330.method13345(5123, this.field9338.data, this.field9338.pos, false);
            this.field9332 = this.field9330.method13301(16, this.field9339.data, this.field9339.pos, false);
            this.field9323 = new GlRelated1(this.field9332, 5126, 3, 0);
            this.field9334 = new GlRelated1(this.field9332, 5121, 4, 12);
        } else {
            this.field9322 = null;
            this.field9332 = null;
            this.field9323 = null;
            this.field9334 = null;
        }
        this.field9339 = null;
        this.field9338 = null;
        this.field9340 = null;
        this.field9337 = null;
        this.field9329 = null;
        this.field9335 = null;
    }

    @ObfuscatedName("acq.u(S)V")
    public void method14850(short arg0) {
        if (this.field9330.field8149) {
            this.field9338.p2(arg0);
        } else {
            this.field9338.ip2(arg0);
        }
    }

    @ObfuscatedName("acq.j(IIIIII)V")
    public void method14856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var7 = -1L;
        int var9 = (arg2 << this.field9333.field388) + arg4;
        int var10 = (arg3 << this.field9333.field388) + arg5;
        int var11 = this.field9333.getFineHeight(var9, var10);
        if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var7 = ((long) var10 & 0xFFFFL) << 16 | (long) var9 & 0xFFFFL;
            FloorModelNode var12 = (FloorModelNode) this.field9340.get(var7);
            if (var12 != null) {
                this.method14850(var12.field9551);
                return;
            }
        }
        short var13 = (short) this.field9331++;
        if (var7 != -1L) {
            this.field9340.put(new FloorModelNode(var13), var7);
        }
        float var14;
        float var15;
        float var16;
        if (arg4 == 0 && arg5 == 0) {
            var14 = this.field9335[arg0][arg1];
            var15 = this.field9329[arg0][arg1];
            var16 = this.field9337[arg0][arg1];
        } else if (this.field9333.field385 == arg4 && arg5 == 0) {
            var14 = this.field9335[arg0 + 1][arg1];
            var15 = this.field9329[arg0 + 1][arg1];
            var16 = this.field9337[arg0 + 1][arg1];
        } else if (this.field9333.field385 == arg4 && this.field9333.field385 == arg5) {
            var14 = this.field9335[arg0 + 1][arg1 + 1];
            var15 = this.field9329[arg0 + 1][arg1 + 1];
            var16 = this.field9337[arg0 + 1][arg1 + 1];
        } else if (arg4 == 0 && this.field9333.field385 == arg5) {
            var14 = this.field9335[arg0][arg1 + 1];
            var15 = this.field9329[arg0][arg1 + 1];
            var16 = this.field9337[arg0][arg1 + 1];
        } else {
            float var17 = (float) arg4 / (float) this.field9333.field385;
            float var18 = (float) arg5 / (float) this.field9333.field385;
            float var19 = this.field9335[arg0][arg1];
            float var20 = this.field9329[arg0][arg1];
            float var21 = this.field9337[arg0][arg1];
            float var22 = this.field9335[arg0 + 1][arg1];
            float var23 = this.field9329[arg0 + 1][arg1];
            float var24 = this.field9337[arg0 + 1][arg1];
            float var25 = (this.field9335[arg0][arg1 + 1] - var19) * var17 + var19;
            float var26 = (this.field9329[arg0][arg1 + 1] - var20) * var17 + var20;
            float var27 = (this.field9337[arg0][arg1 + 1] - var21) * var17 + var21;
            float var28 = (this.field9335[arg0 + 1][arg1 + 1] - var22) * var17 + var22;
            float var29 = (this.field9329[arg0 + 1][arg1 + 1] - var23) * var17 + var23;
            float var30 = (this.field9337[arg0 + 1][arg1 + 1] - var24) * var17 + var24;
            var14 = (var28 - var25) * var18 + var25;
            var15 = (var29 - var26) * var18 + var26;
            var16 = (var30 - var27) * var18 + var27;
        }
        float var31 = (float) (this.field9324.method14888() - var9);
        float var32 = (float) (this.field9324.method14882() - var11);
        float var33 = (float) (this.field9324.method14879() - var10);
        float var34 = (float) Math.sqrt((double) (var33 * var33 + var31 * var31 + var32 * var32));
        float var35 = 1.0F / var34;
        float var36 = var31 * var35;
        float var37 = var32 * var35;
        float var38 = var33 * var35;
        float var39 = var34 / (float) this.field9324.method14880();
        float var40 = 1.0F - var39 * var39;
        if (var40 < 0.0F) {
            var40 = 0.0F;
        }
        float var41 = var16 * var38 + var14 * var36 + var15 * var37;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var40 * var41 * 2.0F;
        if (var42 > 1.0F) {
            var42 = 1.0F;
        }
        int var43 = this.field9324.method14881();
        int var44 = (int) ((float) (var43 >> 16 & 0xFF) * var42);
        if (var44 > 255) {
            var44 = 255;
        }
        int var45 = (int) ((float) (var43 >> 8 & 0xFF) * var42);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var43 & 0xFF) * var42);
        if (var46 > 255) {
            var46 = 255;
        }
        if (this.field9330.field8149) {
            this.field9339.method16851((float) var9);
            this.field9339.method16851((float) var11);
            this.field9339.method16851((float) var10);
        } else {
            this.field9339.method16855((float) var9);
            this.field9339.method16855((float) var11);
            this.field9339.method16855((float) var10);
        }
        this.field9339.p1(var44);
        this.field9339.p1(var45);
        this.field9339.p1(var46);
        this.field9339.p1(255);
        this.method14850(var13);
    }

    @ObfuscatedName("acq.a(III[[Z)V")
    public void method14849(int arg0, int arg1, int arg2, boolean[][] arg3) {
        if (this.field9322 == null || (this.field9325 > arg0 + arg2 || (this.field9326 < arg0 - arg2 || (this.field9327 > arg1 + arg2 || this.field9328 < arg1 - arg2)))) {
            return;
        }
        for (int var5 = this.field9327; var5 <= this.field9328; var5++) {
            for (int var6 = this.field9325; var6 <= this.field9326; var6++) {
                int var7 = var6 - arg0;
                int var8 = var5 - arg1;
                if (var7 > -arg2 && var7 < arg2 && var8 > -arg2 && var8 < arg2 && arg3[arg2 + var7][arg2 + var8]) {
                    this.field9330.method13319((int) (this.field9324.method14893() * 255.0F) << 24);
                    this.field9330.method13305(this.field9323, null, this.field9334, null);
                    this.field9330.method13307(this.field9322, 4, 0, this.field9336);
                    return;
                }
            }
        }
    }
}
