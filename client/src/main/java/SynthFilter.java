import deob.ObfuscatedName;

@ObfuscatedName("ng")
public class SynthFilter {

    @ObfuscatedName("ng.u")
    public int[] pairs = new int[2];

    @ObfuscatedName("ng.a")
    public int[][][] octaves = new int[2][2][4];

    @ObfuscatedName("ng.s")
    public int[][][] gain = new int[2][2][4];

    @ObfuscatedName("ng.c")
    public int[] inverseGain = new int[2];

    @ObfuscatedName("ng.m")
    public static float[][] floatingCoefficients = new float[2][8];

    @ObfuscatedName("ng.t")
    public static int[][] coefficients = new int[2][8];

    @ObfuscatedName("ng.u(IIF)F")
    public float getAmplitude(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.gain[arg0][1][arg1] - this.gain[arg0][0][arg1]) * arg2 + (float) this.gain[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @ObfuscatedName("ng.j(F)F")
    public static float method6620(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @ObfuscatedName("ng.a(IIF)F")
    public float method6609(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.octaves[arg0][1][arg1] - this.octaves[arg0][0][arg1]) * arg2 + (float) this.octaves[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method6620(var5);
    }

    @ObfuscatedName("ng.s(IF)I")
    public int compute(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.inverseGain[1] - this.inverseGain[0]) * arg1 + (float) this.inverseGain[0];
            float var4 = var3 * 0.0030517578F;
            Statics.floatingInverseA0 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            Statics.inverseA0 = (int) (Statics.floatingInverseA0 * 65536.0F);
        }
        if (this.pairs[arg0] == 0) {
            return 0;
        }
        float var5 = this.getAmplitude(arg0, 0, arg1);
        floatingCoefficients[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method6609(arg0, 0, arg1));
        floatingCoefficients[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.pairs[arg0]; var6++) {
            float var7 = this.getAmplitude(arg0, var6, arg1);
            float var8 = var7 * -2.0F * (float) Math.cos((double) this.method6609(arg0, var6, arg1));
            float var9 = var7 * var7;
            floatingCoefficients[arg0][var6 * 2 + 1] = floatingCoefficients[arg0][var6 * 2 - 1] * var9;
            floatingCoefficients[arg0][var6 * 2] = floatingCoefficients[arg0][var6 * 2 - 1] * var8 + floatingCoefficients[arg0][var6 * 2 - 2] * var9;
            for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
                floatingCoefficients[arg0][var10] += floatingCoefficients[arg0][var10 - 1] * var8 + floatingCoefficients[arg0][var10 - 2] * var9;
            }
            floatingCoefficients[arg0][1] += floatingCoefficients[arg0][0] * var8 + var9;
            floatingCoefficients[arg0][0] += var8;
        }
        if (arg0 == 0) {
            for (int var11 = 0; var11 < this.pairs[0] * 2; var11++) {
                floatingCoefficients[0][var11] *= Statics.floatingInverseA0;
            }
        }
        for (int var12 = 0; var12 < this.pairs[arg0] * 2; var12++) {
            coefficients[arg0][var12] = (int) (floatingCoefficients[arg0][var12] * 65536.0F);
        }
        return this.pairs[arg0] * 2;
    }

    @ObfuscatedName("ng.c(Laet;Lmt;)V")
    public final void decode(Packet arg0, SynthEnvelope arg1) {
        int var3 = arg0.g1();
        this.pairs[0] = var3 >> 4;
        this.pairs[1] = var3 & 0xF;
        if (var3 == 0) {
            int[] var9 = this.inverseGain;
            this.inverseGain[1] = 0;
            var9[0] = 0;
            return;
        }
        this.inverseGain[0] = arg0.g2();
        this.inverseGain[1] = arg0.g2();
        int var4 = arg0.g1();
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.pairs[var5]; var6++) {
                this.octaves[var5][0][var6] = arg0.g2();
                this.gain[var5][0][var6] = arg0.g2();
            }
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < this.pairs[var7]; var8++) {
                if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
                    this.octaves[var7][1][var8] = this.octaves[var7][0][var8];
                    this.gain[var7][1][var8] = this.gain[var7][0][var8];
                } else {
                    this.octaves[var7][1][var8] = arg0.g2();
                    this.gain[var7][1][var8] = arg0.g2();
                }
            }
        }
        if (var4 != 0 || this.inverseGain[1] != this.inverseGain[0]) {
            arg1.decodeStages(arg0);
        }
    }
}
