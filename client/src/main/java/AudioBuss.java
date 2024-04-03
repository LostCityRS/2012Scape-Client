import deob.ObfuscatedName;

@ObfuscatedName("adc")
public abstract class AudioBuss extends Node {

    @ObfuscatedName("adc.s")
    public AudioBuss field9473;

    @ObfuscatedName("adc.c")
    public int field9475;

    @ObfuscatedName("adc.m")
    public SoundPacket field9474;

    @ObfuscatedName("adc.t")
    public volatile boolean field9472 = true;

    @ObfuscatedName("adc.u()I")
    public int method15049() {
        return 255;
    }

    @ObfuscatedName("adc.c([III)V")
    public final void method15033(int[] arg0, int arg1, int arg2) {
        if (this.field9472) {
            this.method15034(arg0, arg1, arg2);
        } else {
            this.method15046(arg2);
        }
    }

    @ObfuscatedName("adc.j()Ladc;")
    public abstract AudioBuss method15031();

    @ObfuscatedName("adc.a()Ladc;")
    public abstract AudioBuss method15032();

    @ObfuscatedName("adc.m([III)V")
    public abstract void method15034(int[] arg0, int arg1, int arg2);

    @ObfuscatedName("adc.s()I")
    public abstract int method15035();

    @ObfuscatedName("adc.t(I)V")
    public abstract void method15046(int arg0);
}
