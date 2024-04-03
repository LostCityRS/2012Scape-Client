import deob.ObfuscatedName;

@ObfuscatedName("alp")
public class Js5NetRequest extends Js5Request {

    @ObfuscatedName("alp.d")
    public Packet field10599;

    @ObfuscatedName("alp.z")
    public int field10600;

    @ObfuscatedName("alp.n")
    public byte field10598;

    @ObfuscatedName("alp.u(I)[B")
    public byte[] method16685() {
        if (this.field10352 || this.field10599.field9626 < this.field10599.field9629.length - this.field10598) {
            throw new RuntimeException();
        }
        return this.field10599.field9629;
    }

    @ObfuscatedName("alp.j(I)I")
    public int method16687() {
        return this.field10599 == null ? 0 : this.field10599.field9626 * 100 / (this.field10599.field9629.length - this.field10598);
    }
}
