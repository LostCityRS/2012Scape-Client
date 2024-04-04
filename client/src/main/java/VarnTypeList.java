import deob.ObfuscatedName;

@ObfuscatedName("ui")
public class VarnTypeList {

    @ObfuscatedName("ui.u")
    public final Js5 field6759;

    @ObfuscatedName("ui.j")
    public final WeightedCache field6758 = new WeightedCache(64);

    public VarnTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field6759 = arg2;
        if (this.field6759 != null) {
            this.field6759.method5637(Js5ConfigGroup.VARN.field1668);
        }
    }

    @ObfuscatedName("ui.u(IB)Luh;")
    public VarnType method12004(int arg0) {
        WeightedCache var2 = this.field6758;
        VarnType var3;
        synchronized (this.field6758) {
            var3 = (VarnType) this.field6758.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var5 = this.field6759.fetchFile(Js5ConfigGroup.VARN.field1668, arg0);
        VarnType var6 = new VarnType();
        if (var5 != null) {
            var6.method12016(new Packet(var5));
        }
        WeightedCache var7 = this.field6758;
        synchronized (this.field6758) {
            this.field6758.method7937(var6, (long) arg0);
            return var6;
        }
    }

    @ObfuscatedName("ui.j(B)V")
    public void method12005() {
        WeightedCache var1 = this.field6758;
        synchronized (this.field6758) {
            this.field6758.method7922();
        }
    }

    @ObfuscatedName("ui.a(II)V")
    public void method12006(int arg0) {
        WeightedCache var2 = this.field6758;
        synchronized (this.field6758) {
            this.field6758.method7921(arg0);
        }
    }

    @ObfuscatedName("ui.s(B)V")
    public void method12010() {
        WeightedCache var1 = this.field6758;
        synchronized (this.field6758) {
            this.field6758.method7925();
        }
    }
}
