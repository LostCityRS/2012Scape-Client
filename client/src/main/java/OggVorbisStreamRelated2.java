import deob.ObfuscatedName;

@ObfuscatedName("adk")
public class OggVorbisStreamRelated2 extends Node {

    @ObfuscatedName("adk.s")
    public final short[][] field9559;

    @ObfuscatedName("adk.c")
    public double field9560;

    public OggVorbisStreamRelated2(short[][] arg0, double arg1) {
        this.field9559 = arg0;
        this.field9560 = arg1;
    }

    @ObfuscatedName("adk.u(B)J")
    public long method15162() {
        return (long) (this.field9559.length << 32 | this.field9559[0].length);
    }
}
