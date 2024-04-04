import deob.ObfuscatedName;

@ObfuscatedName("alu")
public class SynthSoundPacket extends BasicSoundPacket {

    @ObfuscatedName("alu.f")
    public byte[] samples;

    public SynthSoundPacket(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field10295 = arg0;
        this.samples = arg1;
        this.field10294 = arg2;
        this.field10292 = arg3;
    }

    @ObfuscatedName("alu.f(Lme;)Lalu;")
    public SynthSoundPacket method17108(SampleRateConverter arg0) {
        this.samples = arg0.method6555(this.samples);
        this.field10295 = arg0.method6552(this.field10295);
        if (this.field10294 == this.field10292) {
            this.field10294 = this.field10292 = arg0.method6553(this.field10294);
        } else {
            this.field10294 = arg0.method6553(this.field10294);
            this.field10292 = arg0.method6553(this.field10292);
            if (this.field10294 == this.field10292) {
                this.field10294--;
            }
        }
        return this;
    }

    @ObfuscatedName("alu.u()I")
    public int method16496() {
        return this.samples.length;
    }

    @ObfuscatedName("alu.j(III)Laib;")
    public SoundAudioBuss create(int arg0, int arg1, int arg2) {
        return this.samples == null || this.samples.length == 0 ? null : new SynthSoundAudioBuss(this, arg0, arg1, arg2);
    }
}
