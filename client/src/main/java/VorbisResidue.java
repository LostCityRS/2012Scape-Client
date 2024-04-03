import deob.ObfuscatedName;

@ObfuscatedName("ni")
public class VorbisResidue {

    @ObfuscatedName("ni.u")
    public int field4107 = VorbisSound.method15060(16);

    @ObfuscatedName("ni.j")
    public int field4110 = VorbisSound.method15060(24);

    @ObfuscatedName("ni.a")
    public int field4108 = VorbisSound.method15060(24);

    @ObfuscatedName("ni.s")
    public int field4106 = VorbisSound.method15060(24) + 1;

    @ObfuscatedName("ni.c")
    public int field4109 = VorbisSound.method15060(6) + 1;

    @ObfuscatedName("ni.m")
    public int field4105 = VorbisSound.method15060(8);

    @ObfuscatedName("ni.t")
    public int[] field4111;

    public VorbisResidue() {
        int[] var1 = new int[this.field4109];
        for (int var2 = 0; var2 < this.field4109; var2++) {
            int var3 = 0;
            int var4 = VorbisSound.method15060(3);
            boolean var5 = VorbisSound.method15084() != 0;
            if (var5) {
                var3 = VorbisSound.method15060(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field4111 = new int[this.field4109 * 8];
        for (int var6 = 0; var6 < this.field4109 * 8; var6++) {
            this.field4111[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : VorbisSound.method15060(8);
        }
    }

    @ObfuscatedName("ni.u([FIZ)V")
    public void method6627(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = Statics.field9489[this.field4105].field4061;
        int var6 = this.field4108 - this.field4110;
        int var7 = var6 / this.field4106;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = Statics.field9489[this.field4105].method6595();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4109;
                        }
                        var11 /= this.field4109;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4111[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4106 * var10 + this.field4110;
                        VorbisCodebook var17 = Statics.field9489[var15];
                        if (this.field4107 == 0) {
                            int var18 = this.field4106 / var17.field4061;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method6588();
                                for (int var21 = 0; var21 < var17.field4061; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4106) {
                                float[] var23 = var17.method6588();
                                for (int var24 = 0; var24 < var17.field4061; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }
}
