import deob.ObfuscatedName;

@ObfuscatedName("vb")
public class VarClientTypeList {

    @ObfuscatedName("vb.u")
    public final Js5 field7161;

    @ObfuscatedName("vb.j")
    public int field7160;

    @ObfuscatedName("vb.a")
    public final SoftLruHashTable field7159 = new SoftLruHashTable(64);

    public VarClientTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field7161 = arg2;
        this.field7160 = this.field7161.getGroupCapacity(Js5ConfigGroup.VARCINT.field1668);
    }

    @ObfuscatedName("vb.u(IS)Lvr;")
    public VarClientType method12359(int arg0) {
        SoftLruHashTable var2 = this.field7159;
        VarClientType var3;
        synchronized (this.field7159) {
            var3 = (VarClientType) this.field7159.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7161;
        byte[] var6;
        synchronized (this.field7161) {
            var6 = this.field7161.fetchFile(Js5ConfigGroup.VARCINT.field1668, arg0);
        }
        VarClientType var8 = new VarClientType();
        if (var6 != null) {
            var8.method12349(new Packet(var6));
        }
        SoftLruHashTable var9 = this.field7159;
        synchronized (this.field7159) {
            this.field7159.method7937(var8, (long) arg0);
            return var8;
        }
    }
}
