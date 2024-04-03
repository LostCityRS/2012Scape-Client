import deob.ObfuscatedName;

@ObfuscatedName("alx")
public class Js5WorkerRequest extends Js5Request {

    @ObfuscatedName("alx.o")
    public int field10593;

    @ObfuscatedName("alx.q")
    public DiskStore field10595;

    @ObfuscatedName("alx.p")
    public byte[] field10597;

    @ObfuscatedName("alx.u(I)[B")
    public byte[] method16685() {
        if (this.field10352) {
            throw new RuntimeException();
        }
        return this.field10597;
    }

    @ObfuscatedName("alx.j(I)I")
    public int method16687() {
        return this.field10352 ? 0 : 100;
    }
}
