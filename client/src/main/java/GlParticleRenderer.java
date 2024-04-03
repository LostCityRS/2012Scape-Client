import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bu")
public class GlParticleRenderer {

    @ObfuscatedName("bu.u")
    public float[] field1128 = new float[16];

    @ObfuscatedName("bu.j")
    public GpuPacket field1120 = new GpuPacket(786336);

    @ObfuscatedName("bu.a")
    public GlInterfaceRelated field1121;

    @ObfuscatedName("bu.s")
    public GlRelated1 field1135;

    @ObfuscatedName("bu.c")
    public GlRelated1 field1123;

    @ObfuscatedName("bu.m")
    public GlRelated1 field1124;

    @ObfuscatedName("bu.t")
    public final int field1125 = 64;

    @ObfuscatedName("bu.l")
    public final int field1126 = 768;

    @ObfuscatedName("bu.f")
    public final int field1127 = 1600;

    @ObfuscatedName("bu.d")
    public final int field1136 = IntMath.method2540(1600);

    @ObfuscatedName("bu.z")
    public final int field1129 = 64;

    @ObfuscatedName("bu.n")
    public int[] field1130 = new int[8191];

    @ObfuscatedName("bu.o")
    public int[] field1131 = new int[1600];

    @ObfuscatedName("bu.q")
    public int[] field1132 = new int[64];

    @ObfuscatedName("bu.p")
    public Particle[][] field1119 = new Particle[1600][64];

    @ObfuscatedName("bu.w")
    public Particle[][] field1122 = new Particle[64][768];

    @ObfuscatedName("bu.b")
    public int field1133 = 0;

    @ObfuscatedName("bu.u(Lyq;)V")
    public void method2263(GlToolkit arg0) {
        this.field1121 = arg0.method13301(24, null, 196584, true);
        this.field1124 = new GlRelated1(this.field1121, 5126, 2, 0);
        this.field1135 = new GlRelated1(this.field1121, 5126, 3, 8);
        this.field1123 = new GlRelated1(this.field1121, 5121, 4, 20);
    }

    @ObfuscatedName("bu.j(Lyq;Ldp;)V")
    public void method2264(GlToolkit arg0, ParticleList arg1) {
        if (arg0.field8116 == null) {
            return;
        }
        this.method2274(arg0);
        float var3 = arg0.field8116.field3480[2];
        float var4 = arg0.field8116.field3480[6];
        float var5 = arg0.field8116.field3480[10];
        float var6 = arg0.field8116.field3480[14];
        try {
            int var7 = 0;
            int var8 = Integer.MAX_VALUE;
            int var9 = 0;
            DualLink var10 = arg1.field1311.field6653;
            for (DualLink var11 = var10.field9265; var11 != var10; var11 = var11.field9265) {
                Particle var12 = (Particle) var11;
                int var13 = (int) ((float) (var12.field10147 >> 12) * var5 + (float) (var12.field10146 >> 12) * var4 + (float) (var12.field10145 >> 12) * var3 + var6);
                if (var13 > var9) {
                    var9 = var13;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                this.field1130[var7++] = var13;
            }
            int var14 = var9 - var8;
            int var15;
            if (var14 + 2 > 1600) {
                var15 = IntMath.method2540(var14) + 1 - this.field1136;
                var14 = (var14 >> var15) + 2;
            } else {
                var15 = 0;
                var14 += 2;
            }
            DualLink var16 = var10.field9265;
            int var17 = 0;
            int var18 = -2;
            boolean var19 = true;
            boolean var20 = true;
            while (var10 != var16) {
                this.field1133 = 0;
                for (int var21 = 0; var21 < var14; var21++) {
                    this.field1131[var21] = 0;
                }
                for (int var22 = 0; var22 < 64; var22++) {
                    this.field1132[var22] = 0;
                }
                while (var10 != var16) {
                    Particle var23 = (Particle) var16;
                    if (var20) {
                        var18 = var23.field10149;
                        var19 = var23.field10150;
                        var20 = false;
                    }
                    if (var17 > 0 && (var23.field10149 != var18 || var23.field10150 != var19)) {
                        var20 = true;
                        break;
                    }
                    int var24 = this.field1130[var17++] - var8 >> var15;
                    if (var24 < 1600) {
                        if (this.field1131[var24] < 64) {
                            this.field1119[var24][this.field1131[var24]++] = var23;
                        } else {
                            label91:
                            {
                                if (this.field1131[var24] == 64) {
                                    if (this.field1133 == 64) {
                                        break label91;
                                    }
                                    this.field1131[var24] += this.field1133++ + 1;
                                }
                                this.field1122[this.field1131[var24] - 64 - 1][this.field1132[this.field1131[var24] - 64 - 1]++] = var23;
                            }
                        }
                    }
                    var16 = var16.field9265;
                }
                if (var18 >= 0) {
                    arg0.method13312(var18);
                } else {
                    arg0.method13312(-1);
                }
                if (var19 && Statics.field1134 != arg0.field8158) {
                    arg0.IA(Statics.field1134);
                } else if (arg0.field8158 != 1.0F) {
                    arg0.IA(1.0F);
                }
                this.method2265(arg0, var14);
            }
        } catch (Exception var26) {
        }
        this.method2272(arg0);
    }

    @ObfuscatedName("bu.a(Lyq;I)V")
    public void method2265(GlToolkit arg0, int arg1) {
        OpenGL.glGetFloatv(2982, this.field1128, 0);
        float var3 = this.field1128[0];
        float var4 = this.field1128[4];
        float var5 = this.field1128[8];
        float var6 = this.field1128[1];
        float var7 = this.field1128[5];
        float var8 = this.field1128[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field1120.pos = 0;
        if (arg0.field8149) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field1131[var18] > 64 ? 64 : this.field1131[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        Particle var21 = this.field1119[var18][var20];
                        int var22 = var21.field10144;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field10145 >> 12);
                        float var28 = (float) (var21.field10146 >> 12);
                        float var29 = (float) (var21.field10147 >> 12);
                        int var30 = var21.field10148 >> 12;
                        this.field1120.method16851(0.0F);
                        this.field1120.method16851(0.0F);
                        this.field1120.method16851((float) -var30 * var9 + var27);
                        this.field1120.method16851((float) -var30 * var10 + var28);
                        this.field1120.method16851((float) -var30 * var11 + var29);
                        this.field1120.p1(var23);
                        this.field1120.p1(var24);
                        this.field1120.p1(var25);
                        this.field1120.p1(var26);
                        this.field1120.method16851(0.0F);
                        this.field1120.method16851(1.0F);
                        this.field1120.method16851((float) var30 * var15 + var27);
                        this.field1120.method16851((float) var30 * var16 + var28);
                        this.field1120.method16851((float) var30 * var17 + var29);
                        this.field1120.p1(var23);
                        this.field1120.p1(var24);
                        this.field1120.p1(var25);
                        this.field1120.p1(var26);
                        this.field1120.method16851(1.0F);
                        this.field1120.method16851(1.0F);
                        this.field1120.method16851((float) var30 * var9 + var27);
                        this.field1120.method16851((float) var30 * var10 + var28);
                        this.field1120.method16851((float) var30 * var11 + var29);
                        this.field1120.p1(var23);
                        this.field1120.p1(var24);
                        this.field1120.p1(var25);
                        this.field1120.p1(var26);
                        this.field1120.method16851(1.0F);
                        this.field1120.method16851(0.0F);
                        this.field1120.method16851((float) var30 * var12 + var27);
                        this.field1120.method16851((float) var30 * var13 + var28);
                        this.field1120.method16851((float) var30 * var14 + var29);
                        this.field1120.p1(var23);
                        this.field1120.p1(var24);
                        this.field1120.p1(var25);
                        this.field1120.p1(var26);
                    }
                    if (this.field1131[var18] > 64) {
                        int var31 = this.field1131[var18] - 64 - 1;
                        for (int var32 = this.field1132[var31] - 1; var32 >= 0; var32--) {
                            Particle var33 = this.field1122[var31][var32];
                            int var34 = var33.field10144;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field10145 >> 12);
                            float var40 = (float) (var33.field10146 >> 12);
                            float var41 = (float) (var33.field10147 >> 12);
                            int var42 = var33.field10148 >> 12;
                            this.field1120.method16851(0.0F);
                            this.field1120.method16851(0.0F);
                            this.field1120.method16851((float) -var42 * var9 + var39);
                            this.field1120.method16851((float) -var42 * var10 + var40);
                            this.field1120.method16851((float) -var42 * var11 + var41);
                            this.field1120.p1(var35);
                            this.field1120.p1(var36);
                            this.field1120.p1(var37);
                            this.field1120.p1(var38);
                            this.field1120.method16851(0.0F);
                            this.field1120.method16851(1.0F);
                            this.field1120.method16851((float) var42 * var15 + var39);
                            this.field1120.method16851((float) var42 * var16 + var40);
                            this.field1120.method16851((float) var42 * var17 + var41);
                            this.field1120.p1(var35);
                            this.field1120.p1(var36);
                            this.field1120.p1(var37);
                            this.field1120.p1(var38);
                            this.field1120.method16851(1.0F);
                            this.field1120.method16851(1.0F);
                            this.field1120.method16851((float) var42 * var9 + var39);
                            this.field1120.method16851((float) var42 * var10 + var40);
                            this.field1120.method16851((float) var42 * var11 + var41);
                            this.field1120.p1(var35);
                            this.field1120.p1(var36);
                            this.field1120.p1(var37);
                            this.field1120.p1(var38);
                            this.field1120.method16851(1.0F);
                            this.field1120.method16851(0.0F);
                            this.field1120.method16851((float) var42 * var12 + var39);
                            this.field1120.method16851((float) var42 * var13 + var40);
                            this.field1120.method16851((float) var42 * var14 + var41);
                            this.field1120.p1(var35);
                            this.field1120.p1(var36);
                            this.field1120.p1(var37);
                            this.field1120.p1(var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field1131[var43] > 64 ? 64 : this.field1131[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        Particle var46 = this.field1119[var43][var45];
                        int var47 = var46.field10144;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field10145 >> 12);
                        float var53 = (float) (var46.field10146 >> 12);
                        float var54 = (float) (var46.field10147 >> 12);
                        int var55 = var46.field10148 >> 12;
                        this.field1120.method16855(0.0F);
                        this.field1120.method16855(0.0F);
                        this.field1120.method16855((float) -var55 * var9 + var52);
                        this.field1120.method16855((float) -var55 * var10 + var53);
                        this.field1120.method16855((float) -var55 * var11 + var54);
                        this.field1120.p1(var48);
                        this.field1120.p1(var49);
                        this.field1120.p1(var50);
                        this.field1120.p1(var51);
                        this.field1120.method16855(0.0F);
                        this.field1120.method16855(1.0F);
                        this.field1120.method16855((float) var55 * var15 + var52);
                        this.field1120.method16855((float) var55 * var16 + var53);
                        this.field1120.method16855((float) var55 * var17 + var54);
                        this.field1120.p1(var48);
                        this.field1120.p1(var49);
                        this.field1120.p1(var50);
                        this.field1120.p1(var51);
                        this.field1120.method16855(1.0F);
                        this.field1120.method16855(1.0F);
                        this.field1120.method16855((float) var55 * var9 + var52);
                        this.field1120.method16855((float) var55 * var10 + var53);
                        this.field1120.method16855((float) var55 * var11 + var54);
                        this.field1120.p1(var48);
                        this.field1120.p1(var49);
                        this.field1120.p1(var50);
                        this.field1120.p1(var51);
                        this.field1120.method16855(1.0F);
                        this.field1120.method16855(0.0F);
                        this.field1120.method16855((float) var55 * var12 + var52);
                        this.field1120.method16855((float) var55 * var13 + var53);
                        this.field1120.method16855((float) var55 * var14 + var54);
                        this.field1120.p1(var48);
                        this.field1120.p1(var49);
                        this.field1120.p1(var50);
                        this.field1120.p1(var51);
                    }
                    if (this.field1131[var43] > 64) {
                        int var56 = this.field1131[var43] - 64 - 1;
                        for (int var57 = this.field1132[var56] - 1; var57 >= 0; var57--) {
                            Particle var58 = this.field1122[var56][var57];
                            int var59 = var58.field10144;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field10145 >> 12);
                            float var65 = (float) (var58.field10146 >> 12);
                            float var66 = (float) (var58.field10147 >> 12);
                            int var67 = var58.field10148 >> 12;
                            this.field1120.method16855(0.0F);
                            this.field1120.method16855(0.0F);
                            this.field1120.method16855((float) -var67 * var9 + var64);
                            this.field1120.method16855((float) -var67 * var10 + var65);
                            this.field1120.method16855((float) -var67 * var11 + var66);
                            this.field1120.p1(var60);
                            this.field1120.p1(var61);
                            this.field1120.p1(var62);
                            this.field1120.p1(var63);
                            this.field1120.method16855(0.0F);
                            this.field1120.method16855(1.0F);
                            this.field1120.method16855((float) var67 * var15 + var64);
                            this.field1120.method16855((float) var67 * var16 + var65);
                            this.field1120.method16855((float) var67 * var17 + var66);
                            this.field1120.p1(var60);
                            this.field1120.p1(var61);
                            this.field1120.p1(var62);
                            this.field1120.p1(var63);
                            this.field1120.method16855(1.0F);
                            this.field1120.method16855(1.0F);
                            this.field1120.method16855((float) var67 * var9 + var64);
                            this.field1120.method16855((float) var67 * var10 + var65);
                            this.field1120.method16855((float) var67 * var11 + var66);
                            this.field1120.p1(var60);
                            this.field1120.p1(var61);
                            this.field1120.p1(var62);
                            this.field1120.p1(var63);
                            this.field1120.method16855(1.0F);
                            this.field1120.method16855(0.0F);
                            this.field1120.method16855((float) var67 * var12 + var64);
                            this.field1120.method16855((float) var67 * var13 + var65);
                            this.field1120.method16855((float) var67 * var14 + var66);
                            this.field1120.p1(var60);
                            this.field1120.p1(var61);
                            this.field1120.p1(var62);
                            this.field1120.p1(var63);
                        }
                    }
                }
            }
        }
        if (this.field1120.pos != 0) {
            this.field1121.method2234(24, this.field1120.data, this.field1120.pos);
            arg0.method13305(this.field1135, null, this.field1123, this.field1124);
            arg0.method13306(7, 0, this.field1120.pos / 24);
        }
    }

    @ObfuscatedName("bu.s(Lyq;)V")
    public void method2274(GlToolkit arg0) {
        Statics.field1134 = arg0.field8158;
        arg0.method13311();
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method13325(false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @ObfuscatedName("bu.c(Lyq;)V")
    public void method2272(GlToolkit arg0) {
        arg0.method13325(true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (Statics.field1134 != arg0.field8158) {
            arg0.IA(Statics.field1134);
        }
    }
}
