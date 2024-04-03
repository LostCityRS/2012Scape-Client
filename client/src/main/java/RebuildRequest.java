import deob.ObfuscatedName;

@ObfuscatedName("mo")
public class RebuildRequest {

    @ObfuscatedName("mo.u")
    public RebuildType rebuildType;

    @ObfuscatedName("mo.j")
    public PacketBit buf;

    public RebuildRequest(RebuildType arg0, PacketBit arg1) {
        this.rebuildType = arg0;
        this.buf = arg1;
    }
}
