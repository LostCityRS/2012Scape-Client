import deob.ObfuscatedName;

@ObfuscatedName("mc")
public class class378 {

    @ObfuscatedName("mc.u")
    public int field4061;

    @ObfuscatedName("mc.j")
    public int field4063;

    @ObfuscatedName("mc.a")
    public int[] field4062;

    @ObfuscatedName("mc.s")
    public int[] field4060;

    @ObfuscatedName("mc.c")
    public float[][] field4064;

    @ObfuscatedName("mc.m")
    public int[] field4065;

    @ObfuscatedName("mc.u(II)I")
    public static int method6587(int arg0, int arg1) {
        int var2;
        for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; IntMath.method1621(var2, arg1) > arg0; var2--) {
        }
        return var2;
    }

    public class378() {
        VorbisSound.method15060(24);
        this.field4061 = VorbisSound.method15060(16);
        this.field4063 = VorbisSound.method15060(24);
        this.field4062 = new int[this.field4063];
        boolean var1 = VorbisSound.method15084() != 0;
        if (var1) {
            int var2 = 0;
            int var3 = VorbisSound.method15060(5) + 1;
            while (var2 < this.field4063) {
                int var4 = VorbisSound.method15060(IntMath.method2540(this.field4063 - var2));
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4062[var2++] = var3;
                }
                var3++;
            }
        } else {
            boolean var6 = VorbisSound.method15084() != 0;
            for (int var7 = 0; var7 < this.field4063; var7++) {
                if (var6 && VorbisSound.method15084() == 0) {
                    this.field4062[var7] = 0;
                } else {
                    this.field4062[var7] = VorbisSound.method15060(5) + 1;
                }
            }
        }
        this.method6586();
        int var8 = VorbisSound.method15060(4);
        if (var8 > 0) {
            float var9 = VorbisSound.method15068(VorbisSound.method15060(32));
            float var10 = VorbisSound.method15068(VorbisSound.method15060(32));
            int var11 = VorbisSound.method15060(4) + 1;
            boolean var12 = VorbisSound.method15084() != 0;
            int var13;
            if (var8 == 1) {
                var13 = method6587(this.field4063, this.field4061);
            } else {
                var13 = this.field4063 * this.field4061;
            }
            this.field4060 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4060[var14] = VorbisSound.method15060(var11);
            }
            this.field4064 = new float[this.field4063][this.field4061];
            if (var8 == 1) {
                for (int var15 = 0; var15 < this.field4063; var15++) {
                    float var16 = 0.0F;
                    int var17 = 1;
                    for (int var18 = 0; var18 < this.field4061; var18++) {
                        int var19 = var15 / var17 % var13;
                        float var20 = (float) this.field4060[var19] * var10 + var9 + var16;
                        this.field4064[var15][var18] = var20;
                        if (var12) {
                            var16 = var20;
                        }
                        var17 = var13 * var17;
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4063; var21++) {
                    float var22 = 0.0F;
                    int var23 = this.field4061 * var21;
                    for (int var24 = 0; var24 < this.field4061; var24++) {
                        float var25 = (float) this.field4060[var23] * var10 + var9 + var22;
                        this.field4064[var21][var24] = var25;
                        if (var12) {
                            var22 = var25;
                        }
                        var23++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("mc.j()V")
    public void method6586() {
        int[] var1 = new int[this.field4063];
        int[] var2 = new int[33];
        for (int var3 = 0; var3 < this.field4063; var3++) {
            int var4 = this.field4062[var3];
            if (var4 != 0) {
                int var5 = 0x1 << 32 - var4;
                int var6 = var2[var4];
                var1[var3] = var6;
                int var7;
                if ((var6 & var5) == 0) {
                    var7 = var6 | var5;
                    for (int var8 = var4 - 1; var8 >= 1; var8--) {
                        int var9 = var2[var8];
                        if (var6 != var9) {
                            break;
                        }
                        int var10 = 0x1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }
                        var2[var8] = var9 | var10;
                    }
                } else {
                    var7 = var2[var4 - 1];
                }
                var2[var4] = var7;
                for (int var11 = var4 + 1; var11 <= 32; var11++) {
                    int var12 = var2[var11];
                    if (var6 == var12) {
                        var2[var11] = var7;
                    }
                }
            }
        }
        this.field4065 = new int[8];
        int var13 = 0;
        for (int var14 = 0; var14 < this.field4063; var14++) {
            int var15 = this.field4062[var14];
            if (var15 != 0) {
                int var16 = var1[var14];
                int var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = Integer.MIN_VALUE >>> var18;
                    if ((var16 & var19) == 0) {
                        var17++;
                    } else {
                        if (this.field4065[var17] == 0) {
                            this.field4065[var17] = var13;
                        }
                        var17 = this.field4065[var17];
                    }
                    if (var17 >= this.field4065.length) {
                        int[] var20 = new int[this.field4065.length * 2];
                        for (int var21 = 0; var21 < this.field4065.length; var21++) {
                            var20[var21] = this.field4065[var21];
                        }
                        this.field4065 = var20;
                    }
                    int var22 = var19 >>> 1;
                }
                this.field4065[var17] = ~var14;
                if (var17 >= var13) {
                    var13 = var17 + 1;
                }
            }
        }
    }

    @ObfuscatedName("mc.a()I")
    public int method6595() {
        int var1;
        for (var1 = 0; this.field4065[var1] >= 0; var1 = VorbisSound.method15084() == 0 ? var1 + 1 : this.field4065[var1]) {
        }
        return ~this.field4065[var1];
    }

    @ObfuscatedName("mc.s()[F")
    public float[] method6588() {
        return this.field4064[this.method6595()];
    }
}
