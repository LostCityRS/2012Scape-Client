import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("adr")
public class VorbisSound extends Node {

    @ObfuscatedName("adr.s")
    public byte[][] field9496;

    @ObfuscatedName("adr.c")
    public int field9495;

    @ObfuscatedName("adr.m")
    public int field9480;

    @ObfuscatedName("adr.t")
    public int field9487;

    @ObfuscatedName("adr.l")
    public int field9482;

    @ObfuscatedName("adr.f")
    public boolean field9483;

    @ObfuscatedName("adr.k")
    public static boolean field9479 = false;

    @ObfuscatedName("adr.h")
    public float[] field9497;

    @ObfuscatedName("adr.r")
    public int field9500;

    @ObfuscatedName("adr.g")
    public int field9498;

    @ObfuscatedName("adr.y")
    public boolean field9499;

    @ObfuscatedName("adr.ao")
    public float[] field9509;

    @ObfuscatedName("adr.al")
    public int field9510 = 0;

    @ObfuscatedName("adr.at")
    public int field9511;

    @ObfuscatedName("adr.ax")
    public int field9512 = 0;

    @ObfuscatedName("adr.u(I)F")
    public static float method15068(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @ObfuscatedName("adr.j([BI)V")
    public static void method15082(byte[] arg0, int arg1) {
        Statics.field9492 = arg0;
        Statics.field9485 = arg1;
        Statics.field9486 = 0;
    }

    @ObfuscatedName("adr.a()I")
    public static int method15084() {
        int var0 = Statics.field9492[Statics.field9485] >> Statics.field9486 & 0x1;
        Statics.field9486++;
        Statics.field9485 += Statics.field9486 >> 3;
        Statics.field9486 &= 0x7;
        return var0;
    }

    @ObfuscatedName("adr.s(I)I")
    public static int method15060(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - Statics.field9486) {
            int var3 = 8 - Statics.field9486;
            int var4 = (0x1 << var3) - 1;
            var1 += (Statics.field9492[Statics.field9485] >> Statics.field9486 & var4) << var2;
            Statics.field9486 = 0;
            Statics.field9485++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (Statics.field9492[Statics.field9485] >> Statics.field9486 & var5) << var2;
            Statics.field9486 += arg0;
        }
        return var1;
    }

    @ObfuscatedName("adr.c([B)V")
    public void method15061(byte[] arg0) throws IOException {
        Packet var2 = new Packet(arg0);
        this.field9495 = var2.g4s();
        this.field9480 = var2.g4s();
        this.field9487 = var2.g4s();
        this.field9482 = var2.g4s();
        if (this.field9482 < 0) {
            this.field9482 = ~this.field9482;
            this.field9483 = true;
        }
        int var3 = var2.g4s();
        if (var3 < 0) {
            throw new IOException();
        }
        this.field9496 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.g1();
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.gdata(var7, 0, var5);
            this.field9496[var4] = var7;
        }
    }

    @ObfuscatedName("adr.m([B)V")
    public static void method15092(byte[] arg0) {
        method15082(arg0, 0);
        Statics.field9481 = 0x1 << method15060(4);
        Statics.field9488 = 0x1 << method15060(4);
        Statics.field9484 = new float[Statics.field9488];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? Statics.field9481 : Statics.field9488;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = IntMath.method2540(var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = IntMath.method3511(var14, var13);
            }
            if (var1 == 0) {
                Statics.field9508 = var6;
                Statics.field9502 = var8;
                Statics.field9503 = var10;
                Statics.field9507 = var12;
            } else {
                Statics.field9504 = var6;
                Statics.field9505 = var8;
                Statics.field9506 = var10;
                Statics.field9478 = var12;
            }
        }
        int var15 = method15060(8) + 1;
        Statics.field9489 = new VorbisCodebook[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            Statics.field9489[var16] = new VorbisCodebook();
        }
        int var17 = method15060(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method15060(16);
        }
        int var19 = method15060(6) + 1;
        Statics.field9490 = new VorbisFloor[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            Statics.field9490[var20] = new VorbisFloor();
        }
        int var21 = method15060(6) + 1;
        Statics.field9491 = new VorbisResidue[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            Statics.field9491[var22] = new VorbisResidue();
        }
        int var23 = method15060(6) + 1;
        Statics.field9501 = new VorbisMapping[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            Statics.field9501[var24] = new VorbisMapping();
        }
        int var25 = method15060(6) + 1;
        Statics.field9493 = new boolean[var25];
        Statics.field9494 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            Statics.field9493[var26] = method15084() != 0;
            method15060(16);
            method15060(16);
            Statics.field9494[var26] = method15060(8);
        }
        field9479 = true;
    }

    @ObfuscatedName("adr.t(I)[F")
    public float[] method15076(int arg0) {
        method15082(this.field9496[arg0], 0);
        method15084();
        int var2 = method15060(IntMath.method2540(Statics.field9494.length - 1));
        boolean var3 = Statics.field9493[var2];
        int var4 = var3 ? Statics.field9488 : Statics.field9481;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method15084() != 0;
            var6 = method15084() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (Statics.field9481 >> 2);
            var9 = (Statics.field9481 >> 2) + (var4 >> 2);
            var10 = Statics.field9481 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (Statics.field9481 >> 2);
            var12 = (Statics.field9481 >> 2) + (var4 - (var4 >> 2));
            var13 = Statics.field9481 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        VorbisMapping var14 = Statics.field9501[Statics.field9494[var2]];
        int var15 = var14.field4051;
        int var16 = var14.field4049[var15];
        boolean var17 = !Statics.field9490[var16].method6444();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4050; var19++) {
            VorbisResidue var20 = Statics.field9491[var14.field4052[var19]];
            float[] var21 = Statics.field9484;
            var20.method6627(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field4051;
            int var23 = var14.field4049[var22];
            Statics.field9490[var23].method6445(Statics.field9484, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                Statics.field9484[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = Statics.field9484;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? Statics.field9504 : Statics.field9508;
            float[] var32 = var3 ? Statics.field9505 : Statics.field9502;
            float[] var33 = var3 ? Statics.field9506 : Statics.field9503;
            int[] var34 = var3 ? Statics.field9478 : Statics.field9507;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - 4 - var40 * 4];
                float var46 = var31[var25 - 3 - var40 * 4];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = IntMath.method2540(var4 - 1);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - 1 - var55];
                        float var57 = var28[var52 - 3 - var55];
                        float var58 = var28[var53 - 1 - var55];
                        float var59 = var28[var53 - 3 - var55];
                        var28[var52 - 1 - var55] = var56 + var58;
                        var28[var52 - 3 - var55] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - 1 - var55] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - 3 - var55] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - 1 - var71 * 2] = var28[var71 * 4];
                var28[var4 - 2 - var71 * 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - 1 - var71 * 2] = var28[var71 * 4 + 2];
                var28[var4 - var26 - 2 - var71 * 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - 2 - var72 * 2];
                float var78 = var28[var4 - 1 - var72 * 2];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - 2 - var72 * 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 - var78 + var80) * 0.5F;
                var28[var4 - 1 - var72 * 2] = (-var76 + var78 + var80) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + 1 + var25];
                var28[var25 - 1 - var81] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + 1 + var25];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 - var26 + var82] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                Statics.field9484[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                Statics.field9484[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field9500 > 0) {
            int var91 = this.field9500 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field9499) {
                for (int var92 = 0; var92 < this.field9498; var92++) {
                    int var93 = (this.field9500 >> 1) + var92;
                    var90[var92] += this.field9497[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length - (var4 >> 1) + var94;
                    var90[var95] += Statics.field9484[var94];
                }
            }
        }
        float[] var96 = this.field9497;
        this.field9497 = Statics.field9484;
        Statics.field9484 = var96;
        this.field9500 = var4;
        this.field9498 = var12 - (var4 >> 1);
        this.field9499 = var17;
        return var90;
    }

    @ObfuscatedName("adr.l(Lls;)Z")
    public static boolean method15064(Js5 arg0) {
        if (!field9479) {
            byte[] var1 = arg0.fetchFile(0, 0);
            if (var1 == null) {
                return false;
            }
            method15092(var1);
        }
        return true;
    }

    @ObfuscatedName("adr.f(Lls;II)Ladr;")
    public static VorbisSound method15065(Js5 arg0, int arg1, int arg2) {
        if (!method15064(arg0)) {
            arg0.method5629(arg1, arg2);
            return null;
        }
        byte[] var3 = arg0.fetchFile(arg1, arg2);
        if (var3 == null) {
            return null;
        }
        VorbisSound var4 = null;
        try {
            var4 = new VorbisSound(var3);
        } catch (IOException var6) {
            var6.printStackTrace();
        }
        return var4;
    }

    @ObfuscatedName("adr.d(Lls;I)Ladr;")
    public static VorbisSound method15066(Js5 arg0, int arg1) {
        if (!method15064(arg0)) {
            arg0.method5630(arg1);
            return null;
        }
        byte[] var2 = arg0.method5635(arg1);
        if (var2 == null) {
            return null;
        }
        VorbisSound var3 = null;
        try {
            var3 = new VorbisSound(var2);
        } catch (IOException var5) {
            var5.printStackTrace();
        }
        return var3;
    }

    public VorbisSound(byte[] arg0) throws IOException {
        this.method15061(arg0);
    }

    @ObfuscatedName("adr.z()Laly;")
    public VariableRateSoundPacket method15099() {
        VorbisPlayer.method4778(this);
        return this.method15071() && (this.field9510 <= this.field9495 || this.field9512 <= this.field9495 / GameShell.method2809()) ? null : new VariableRateSoundPacket(this.field9495, this, this.field9509, this.field9487, this.field9482, this.field9483);
    }

    @ObfuscatedName("adr.n(I)I")
    public int method15062(int arg0) {
        int var2 = 0;
        if (this.field9509 == null) {
            this.field9500 = 0;
            this.field9497 = new float[Statics.field9488];
            this.field9509 = new float[this.field9480];
            this.field9510 = 0;
            this.field9511 = 0;
        }
        while (arg0 > this.field9510 && this.field9511 < this.field9496.length) {
            float[] var3 = this.method15076(this.field9511);
            if (var3 != null) {
                int var4 = this.field9510;
                int var5 = var3.length;
                if (var5 > this.field9480 - var4) {
                    var5 = this.field9480 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field9509[var4++] = var3[var6];
                }
                var2 += var4 - this.field9510;
                this.field9510 = var4;
            }
            this.field9511++;
        }
        return var2;
    }

    @ObfuscatedName("adr.o(I)V")
    public void method15069(int arg0) {
        if (arg0 > this.field9480 - 1) {
            arg0 = this.field9480 - 1;
        }
        if (arg0 > this.field9510) {
            this.field9512 = this.method15062(arg0);
        } else {
            this.field9512 = 0;
        }
        if (!this.method15071()) {
            this.field9497 = null;
        }
    }

    @ObfuscatedName("adr.q()I")
    public int method15074() {
        return this.field9510;
    }

    @ObfuscatedName("adr.x()Z")
    public boolean method15071() {
        return this.field9510 < this.field9480 - 1;
    }

    @ObfuscatedName("adr.k()I")
    public int method15072() {
        return this.field9495;
    }
}
