import deob.ObfuscatedName;

@ObfuscatedName("aci")
public class MidiNote extends Node {

    @ObfuscatedName("aci.s")
    public int channel;

    @ObfuscatedName("aci.c")
    public MidiInstrument instrument;

    @ObfuscatedName("aci.m")
    public BasicSoundPacket sound;

    @ObfuscatedName("aci.t")
    public MidiRelated2 field9391;

    @ObfuscatedName("aci.l")
    public int field9387;

    @ObfuscatedName("aci.f")
    public int midiKey;

    @ObfuscatedName("aci.d")
    public int field9404;

    @ObfuscatedName("aci.z")
    public int pan;

    @ObfuscatedName("aci.n")
    public int field9386;

    @ObfuscatedName("aci.o")
    public int field9389;

    @ObfuscatedName("aci.q")
    public int field9393;

    @ObfuscatedName("aci.p")
    public int field9394;

    @ObfuscatedName("aci.w")
    public int field9395;

    @ObfuscatedName("aci.b")
    public int field9396;

    @ObfuscatedName("aci.x")
    public int field9402;

    @ObfuscatedName("aci.i")
    public int field9397;

    @ObfuscatedName("aci.v")
    public int field9399;

    @ObfuscatedName("aci.k")
    public int field9383;

    @ObfuscatedName("aci.h")
    public SoundAudioBuss stream;

    @ObfuscatedName("aci.r")
    public int field9392;

    @ObfuscatedName("aci.y")
    public int field9398;

    @ObfuscatedName("aci.u(I)V")
    public void release() {
        this.instrument = null;
        this.sound = null;
        this.field9391 = null;
        this.stream = null;
    }
}
