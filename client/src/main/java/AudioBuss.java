import deob.ObfuscatedName;

@ObfuscatedName("adc")
public abstract class AudioBuss extends Node {

    @ObfuscatedName("adc.s")
    public AudioBuss field9473;

    @ObfuscatedName("adc.c")
    public int field9475;

    @ObfuscatedName("adc.m")
    public SoundPacket sound;

    @ObfuscatedName("adc.t")
    public volatile boolean active = true;

    @ObfuscatedName("adc.u()I")
    public int method15049() {
        return 255;
    }

    @ObfuscatedName("adc.c([III)V")
    public final void readIfActive(int[] arg0, int arg1, int arg2) {
        if (this.active) {
            this.read(arg0, arg1, arg2);
        } else {
            this.skip(arg2);
        }
    }

    @ObfuscatedName("adc.j()Ladc;")
    public abstract AudioBuss firstSubStream();

    @ObfuscatedName("adc.a()Ladc;")
    public abstract AudioBuss nextSubStream();

    @ObfuscatedName("adc.m([III)V")
    public abstract void read(int[] arg0, int arg1, int arg2);

    @ObfuscatedName("adc.s()I")
    public abstract int method15035();

    @ObfuscatedName("adc.t(I)V")
    public abstract void skip(int arg0);
}
