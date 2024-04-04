import deob.ObfuscatedName;

@ObfuscatedName("mt")
public class SynthEnvelope {

    @ObfuscatedName("mt.u")
    public int stages = 2;

    @ObfuscatedName("mt.j")
    public int[] times = new int[2];

    @ObfuscatedName("mt.a")
    public int[] levels = new int[2];

    @ObfuscatedName("mt.s")
    public int minInterval;

    @ObfuscatedName("mt.c")
    public int maxInterval;

    @ObfuscatedName("mt.m")
    public int wavetable;

    @ObfuscatedName("mt.t")
    public int nextTime;

    @ObfuscatedName("mt.l")
    public int phase;

    @ObfuscatedName("mt.f")
    public int slope;

    @ObfuscatedName("mt.d")
    public int level;

    @ObfuscatedName("mt.z")
    public int time;

    public SynthEnvelope() {
        this.times[0] = 0;
        this.times[1] = 65535;
        this.levels[0] = 0;
        this.levels[1] = 65535;
    }

    @ObfuscatedName("mt.u(Laet;)V")
    public final void decode(Packet arg0) {
        this.wavetable = arg0.g1();
        this.minInterval = arg0.g4s();
        this.maxInterval = arg0.g4s();
        this.decodeStages(arg0);
    }

    @ObfuscatedName("mt.j(Laet;)V")
    public final void decodeStages(Packet arg0) {
        this.stages = arg0.g1();
        this.times = new int[this.stages];
        this.levels = new int[this.stages];
        for (int var2 = 0; var2 < this.stages; var2++) {
            this.times[var2] = arg0.g2();
            this.levels[var2] = arg0.g2();
        }
    }

    @ObfuscatedName("mt.a()V")
    public final void reset() {
        this.nextTime = 0;
        this.phase = 0;
        this.slope = 0;
        this.level = 0;
        this.time = 0;
    }

    @ObfuscatedName("mt.s(I)I")
    public final int nextLevel(int arg0) {
        if (this.time >= this.nextTime) {
            this.level = this.levels[this.phase++] << 15;
            if (this.phase >= this.stages) {
                this.phase = this.stages - 1;
            }
            this.nextTime = (int) ((double) this.times[this.phase] / 65536.0D * (double) arg0);
            if (this.nextTime > this.time) {
                this.slope = ((this.levels[this.phase] << 15) - this.level) / (this.nextTime - this.time);
            }
        }
        this.level += this.slope;
        this.time++;
        return this.level - this.slope >> 15;
    }
}
