import deob.ObfuscatedName;

@ObfuscatedName("qv")
public class VarClanSettingTypeList {

    @ObfuscatedName("qv.u")
    public final Js5 field5038;

    @ObfuscatedName("qv.j")
    public WeightedCache field5039 = new WeightedCache(64);

    public VarClanSettingTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field5038 = arg2;
        if (this.field5038 != null) {
            this.field5038.method5637(Js5ConfigGroup.VARCLANSETTING.field1668);
        }
    }

    @ObfuscatedName("qv.u(IB)Lqh;")
    public VarClanSettingType method8290(int arg0) {
        WeightedCache var2 = this.field5039;
        VarClanSettingType var3;
        synchronized (this.field5039) {
            var3 = (VarClanSettingType) this.field5039.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field5038;
        byte[] var6;
        synchronized (this.field5038) {
            var6 = this.field5038.fetchFile(Js5ConfigGroup.VARCLANSETTING.field1668, arg0);
        }
        VarClanSettingType var8 = new VarClanSettingType();
        if (var6 != null) {
            var8.method8279(new Packet(var6));
        }
        WeightedCache var9 = this.field5039;
        synchronized (this.field5039) {
            this.field5039.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("qv.j(B)V")
    public void method8291() {
        WeightedCache var1 = this.field5039;
        synchronized (this.field5039) {
            this.field5039.method7922();
        }
    }

    @ObfuscatedName("qv.a(II)V")
    public void method8292(int arg0) {
        WeightedCache var2 = this.field5039;
        synchronized (this.field5039) {
            this.field5039.method7921(arg0);
        }
    }

    @ObfuscatedName("qv.s(I)V")
    public void method8293() {
        WeightedCache var1 = this.field5039;
        synchronized (this.field5039) {
            this.field5039.method7925();
        }
    }
}
