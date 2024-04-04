import deob.ObfuscatedName;

import java.util.Arrays;
import java.util.Random;

@ObfuscatedName("mu")
public class SynthInstrument {

    @ObfuscatedName("mu.u")
    public SynthEnvelope phaseEnvelope;

    @ObfuscatedName("mu.j")
    public SynthEnvelope amplitudeEnvelope;

    @ObfuscatedName("mu.a")
    public SynthEnvelope phaseModulationEnvelope;

    @ObfuscatedName("mu.s")
    public SynthEnvelope phaseModulationAmplitudeEnvelope;

    @ObfuscatedName("mu.c")
    public SynthEnvelope amplitudeModulationEnvelope;

    @ObfuscatedName("mu.m")
    public SynthEnvelope amplitudeModulationAmplitudeEnvelope;

    @ObfuscatedName("mu.t")
    public SynthEnvelope gateClosedPhaseEnveope;

    @ObfuscatedName("mu.l")
    public SynthEnvelope gateOpenPhaseEnvelope;

    @ObfuscatedName("mu.f")
    public int[] harmonicVolume = new int[]{0, 0, 0, 0, 0};

    @ObfuscatedName("mu.d")
    public int[] harmonicSemitone = new int[]{0, 0, 0, 0, 0};

    @ObfuscatedName("mu.z")
    public int[] harmonicDelay = new int[]{0, 0, 0, 0, 0};

    @ObfuscatedName("mu.n")
    public int reverbDelay = 0;

    @ObfuscatedName("mu.o")
    public int reverbVolume = 100;

    @ObfuscatedName("mu.q")
    public SynthFilter filter;

    @ObfuscatedName("mu.p")
    public SynthEnvelope filterEnvelope;

    @ObfuscatedName("mu.w")
    public int length = 500;

    @ObfuscatedName("mu.b")
    public int start = 0;

    @ObfuscatedName("mu.x")
    public static int[] samples = new int[220500];

    @ObfuscatedName("mu.i")
    public static int[] NOISE = new int[32768];

    @ObfuscatedName("mu.v")
    public static int[] SINE = new int[32768];

    @ObfuscatedName("mu.h")
    public static int[] oscillatorTimes = new int[5];

    @ObfuscatedName("mu.r")
    public static int[] oscillatorStartSamples = new int[5];

    @ObfuscatedName("mu.g")
    public static int[] scaledOscillatorAmplitudes = new int[5];

    @ObfuscatedName("mu.y")
    public static int[] oscillatorIntervalRanges = new int[5];

    @ObfuscatedName("mu.e")
    public static int[] oscillatorMinIntervals = new int[5];

    static {
        Random rand = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            NOISE[var1] = (rand.nextInt() & 0x2) - 1;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            SINE[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
    }

    @ObfuscatedName("mu.u(II)[I")
    public final int[] getSamples(int arg0, int arg1) {
        Arrays.fill(samples, 0, arg0, 0);
        if (arg1 < 10) {
            return samples;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.phaseEnvelope.reset();
        this.amplitudeEnvelope.reset();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.phaseModulationEnvelope != null) {
            this.phaseModulationEnvelope.reset();
            this.phaseModulationAmplitudeEnvelope.reset();
            var5 = (int) ((double) (this.phaseModulationEnvelope.maxInterval - this.phaseModulationEnvelope.minInterval) * 32.768D / var3);
            var6 = (int) ((double) this.phaseModulationEnvelope.minInterval * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.amplitudeModulationEnvelope != null) {
            this.amplitudeModulationEnvelope.reset();
            this.amplitudeModulationAmplitudeEnvelope.reset();
            var8 = (int) ((double) (this.amplitudeModulationEnvelope.maxInterval - this.amplitudeModulationEnvelope.minInterval) * 32.768D / var3);
            var9 = (int) ((double) this.amplitudeModulationEnvelope.minInterval * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.harmonicVolume[var11] != 0) {
                oscillatorTimes[var11] = 0;
                oscillatorStartSamples[var11] = (int) ((double) this.harmonicDelay[var11] * var3);
                scaledOscillatorAmplitudes[var11] = (this.harmonicVolume[var11] << 14) / 100;
                oscillatorIntervalRanges[var11] = (int) ((double) (this.phaseEnvelope.maxInterval - this.phaseEnvelope.minInterval) * 32.768D * Math.pow(1.0057929410678534D, (double) this.harmonicSemitone[var11]) / var3);
                oscillatorMinIntervals[var11] = (int) ((double) this.phaseEnvelope.minInterval * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var13 = this.phaseEnvelope.nextLevel(arg0);
            int var14 = this.amplitudeEnvelope.nextLevel(arg0);
            if (this.phaseModulationEnvelope != null) {
                int var15 = this.phaseModulationEnvelope.nextLevel(arg0);
                int var16 = this.phaseModulationAmplitudeEnvelope.nextLevel(arg0);
                var13 += this.method6599(var7, var16, this.phaseModulationEnvelope.wavetable) >> 1;
                var7 += (var5 * var15 >> 16) + var6;
            }
            if (this.amplitudeModulationEnvelope != null) {
                int var17 = this.amplitudeModulationEnvelope.nextLevel(arg0);
                int var18 = this.amplitudeModulationAmplitudeEnvelope.nextLevel(arg0);
                var14 = var14 * ((this.method6599(var10, var18, this.amplitudeModulationEnvelope.wavetable) >> 1) + 32768) >> 15;
                var10 += (var8 * var17 >> 16) + var9;
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.harmonicVolume[var19] != 0) {
                    int var20 = oscillatorStartSamples[var19] + var12;
                    if (var20 < arg0) {
                        samples[var20] += this.method6599(oscillatorTimes[var19], scaledOscillatorAmplitudes[var19] * var14 >> 15, this.phaseEnvelope.wavetable);
                        oscillatorTimes[var19] += (oscillatorIntervalRanges[var19] * var13 >> 16) + oscillatorMinIntervals[var19];
                    }
                }
            }
        }
        if (this.gateClosedPhaseEnveope != null) {
            this.gateClosedPhaseEnveope.reset();
            this.gateOpenPhaseEnvelope.reset();
            int var21 = 0;
            boolean var22 = false;
            boolean var23 = true;
            for (int var24 = 0; var24 < arg0; var24++) {
                int var25 = this.gateClosedPhaseEnveope.nextLevel(arg0);
                int var26 = this.gateOpenPhaseEnvelope.nextLevel(arg0);
                int var27;
                if (var23) {
                    var27 = ((this.gateClosedPhaseEnveope.maxInterval - this.gateClosedPhaseEnveope.minInterval) * var25 >> 8) + this.gateClosedPhaseEnveope.minInterval;
                } else {
                    var27 = ((this.gateClosedPhaseEnveope.maxInterval - this.gateClosedPhaseEnveope.minInterval) * var26 >> 8) + this.gateClosedPhaseEnveope.minInterval;
                }
                var21 += 256;
                if (var21 >= var27) {
                    var21 = 0;
                    var23 = !var23;
                }
                if (var23) {
                    samples[var24] = 0;
                }
            }
        }
        if (this.reverbDelay > 0 && this.reverbVolume > 0) {
            int var28 = (int) ((double) this.reverbDelay * var3);
            for (int var29 = var28; var29 < arg0; var29++) {
                samples[var29] += samples[var29 - var28] * this.reverbVolume / 100;
            }
        }
        if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
            this.filterEnvelope.reset();
            int var30 = this.filterEnvelope.nextLevel(arg0 + 1);
            int var31 = this.filter.compute(0, (float) var30 / 65536.0F);
            int var32 = this.filter.compute(1, (float) var30 / 65536.0F);
            if (arg0 >= var31 + var32) {
                int var33 = 0;
                int var34 = var32;
                if (var32 > arg0 - var31) {
                    var34 = arg0 - var31;
                }
                while (var33 < var34) {
                    int var35 = (int) ((long) samples[var31 + var33] * (long) Statics.inverseA0 >> 16);
                    for (int var36 = 0; var36 < var31; var36++) {
                        var35 += (int) ((long) samples[var31 + var33 - 1 - var36] * (long) SynthFilter.coefficients[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var33; var37++) {
                        var35 -= (int) ((long) samples[var33 - 1 - var37] * (long) SynthFilter.coefficients[1][var37] >> 16);
                    }
                    samples[var33] = var35;
                    var30 = this.filterEnvelope.nextLevel(arg0 + 1);
                    var33++;
                }
                int var38 = 128;
                while (true) {
                    if (var38 > arg0 - var31) {
                        var38 = arg0 - var31;
                    }
                    while (var33 < var38) {
                        int var39 = (int) ((long) samples[var31 + var33] * (long) Statics.inverseA0 >> 16);
                        for (int var40 = 0; var40 < var31; var40++) {
                            var39 += (int) ((long) samples[var31 + var33 - 1 - var40] * (long) SynthFilter.coefficients[0][var40] >> 16);
                        }
                        for (int var41 = 0; var41 < var32; var41++) {
                            var39 -= (int) ((long) samples[var33 - 1 - var41] * (long) SynthFilter.coefficients[1][var41] >> 16);
                        }
                        samples[var33] = var39;
                        var30 = this.filterEnvelope.nextLevel(arg0 + 1);
                        var33++;
                    }
                    if (var33 >= arg0 - var31) {
                        while (var33 < arg0) {
                            int var42 = 0;
                            for (int var43 = var31 + var33 - arg0; var43 < var31; var43++) {
                                var42 += (int) ((long) samples[var31 + var33 - 1 - var43] * (long) SynthFilter.coefficients[0][var43] >> 16);
                            }
                            for (int var44 = 0; var44 < var32; var44++) {
                                var42 -= (int) ((long) samples[var33 - 1 - var44] * (long) SynthFilter.coefficients[1][var44] >> 16);
                            }
                            samples[var33] = var42;
                            this.filterEnvelope.nextLevel(arg0 + 1);
                            var33++;
                        }
                        break;
                    }
                    var31 = this.filter.compute(0, (float) var30 / 65536.0F);
                    var32 = this.filter.compute(1, (float) var30 / 65536.0F);
                    var38 += 128;
                }
            }
        }
        for (int var46 = 0; var46 < arg0; var46++) {
            if (samples[var46] < -32768) {
                samples[var46] = -32768;
            }
            if (samples[var46] > 32767) {
                samples[var46] = 32767;
            }
        }
        return samples;
    }

    @ObfuscatedName("mu.j(III)I")
    public final int method6599(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return SINE[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return NOISE[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("mu.a(Laet;)V")
    public final void method6600(Packet buf) {
        this.phaseEnvelope = new SynthEnvelope();
        this.phaseEnvelope.decode(buf);
        this.amplitudeEnvelope = new SynthEnvelope();
        this.amplitudeEnvelope.decode(buf);
        int var2 = buf.g1();
        if (var2 != 0) {
            buf.pos--;
            this.phaseModulationEnvelope = new SynthEnvelope();
            this.phaseModulationEnvelope.decode(buf);
            this.phaseModulationAmplitudeEnvelope = new SynthEnvelope();
            this.phaseModulationAmplitudeEnvelope.decode(buf);
        }
        int var3 = buf.g1();
        if (var3 != 0) {
            buf.pos--;
            this.amplitudeModulationEnvelope = new SynthEnvelope();
            this.amplitudeModulationEnvelope.decode(buf);
            this.amplitudeModulationAmplitudeEnvelope = new SynthEnvelope();
            this.amplitudeModulationAmplitudeEnvelope.decode(buf);
        }
        int var4 = buf.g1();
        if (var4 != 0) {
            buf.pos--;
            this.gateClosedPhaseEnveope = new SynthEnvelope();
            this.gateClosedPhaseEnveope.decode(buf);
            this.gateOpenPhaseEnvelope = new SynthEnvelope();
            this.gateOpenPhaseEnvelope.decode(buf);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = buf.gSmart1or2();
            if (var6 == 0) {
                break;
            }
            this.harmonicVolume[var5] = var6;
            this.harmonicSemitone[var5] = buf.gSmart1or2s();
            this.harmonicDelay[var5] = buf.gSmart1or2();
        }
        this.reverbDelay = buf.gSmart1or2();
        this.reverbVolume = buf.gSmart1or2();
        this.length = buf.g2();
        this.start = buf.g2();
        this.filter = new SynthFilter();
        this.filterEnvelope = new SynthEnvelope();
        this.filter.decode(buf, this.filterEnvelope);
    }
}
