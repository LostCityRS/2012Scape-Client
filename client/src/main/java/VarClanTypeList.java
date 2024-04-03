import deob.ObfuscatedName;

@ObfuscatedName("wz")
public class VarClanTypeList {

    @ObfuscatedName("wz.u")
    public final Js5 field7344;

    @ObfuscatedName("wz.j")
    public int field7345;

    @ObfuscatedName("wz.a")
    public WeightedCache field7346 = new WeightedCache(64);

    public VarClanTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field7344 = arg2;
        if (this.field7344 == null) {
            this.field7345 = 0;
        } else {
            this.field7345 = this.field7344.method5637(Js5ConfigGroup.VARCLAN.field1668);
        }
    }

    @ObfuscatedName("wz.u(IB)Lwe;")
    public VarClanType method12669(int arg0) {
        WeightedCache var2 = this.field7346;
        VarClanType var3;
        synchronized (this.field7346) {
            var3 = (VarClanType) this.field7346.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7344;
        byte[] var6;
        synchronized (this.field7344) {
            var6 = this.field7344.method5627(Js5ConfigGroup.VARCLAN.field1668, arg0);
        }
        VarClanType var8 = new VarClanType();
        if (var6 != null) {
            var8.method12682(new Packet(var6));
        }
        WeightedCache var9 = this.field7346;
        synchronized (this.field7346) {
            this.field7346.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("wz.j(I)V")
    public void method12671() {
        WeightedCache var1 = this.field7346;
        synchronized (this.field7346) {
            this.field7346.method7922();
        }
    }

    @ObfuscatedName("wz.a(II)V")
    public void method12674(int arg0) {
        WeightedCache var2 = this.field7346;
        synchronized (this.field7346) {
            this.field7346.method7921(arg0);
        }
    }

    @ObfuscatedName("wz.s(B)V")
    public void method12672() {
        WeightedCache var1 = this.field7346;
        synchronized (this.field7346) {
            this.field7346.method7925();
        }
    }
}
