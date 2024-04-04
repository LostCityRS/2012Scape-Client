import deob.ObfuscatedName;

@ObfuscatedName("vp")
public class LightTypeList {

    @ObfuscatedName("vp.u")
    public final Js5 field7185;

    @ObfuscatedName("vp.j")
    public final WeightedCache field7186 = new WeightedCache(64);

    public LightTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field7185 = arg2;
        this.field7185.method5637(Js5ConfigGroup.LIGHTTYPE.field1668);
    }

    @ObfuscatedName("vp.u(II)Lvy;")
    public LightType method12453(int arg0) {
        WeightedCache var2 = this.field7186;
        LightType var3;
        synchronized (this.field7186) {
            var3 = (LightType) this.field7186.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7185;
        byte[] var6;
        synchronized (this.field7185) {
            var6 = this.field7185.fetchFile(Js5ConfigGroup.LIGHTTYPE.field1668, arg0);
        }
        LightType var8 = new LightType();
        if (var6 != null) {
            var8.method12467(new Packet(var6));
        }
        WeightedCache var9 = this.field7186;
        synchronized (this.field7186) {
            this.field7186.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("vp.j(I)V")
    public void method12464() {
        WeightedCache var1 = this.field7186;
        synchronized (this.field7186) {
            this.field7186.method7922();
        }
    }

    @ObfuscatedName("vp.a(II)V")
    public void method12455(int arg0) {
        WeightedCache var2 = this.field7186;
        synchronized (this.field7186) {
            this.field7186.method7921(arg0);
        }
    }

    @ObfuscatedName("vp.s(B)V")
    public void method12456() {
        WeightedCache var1 = this.field7186;
        synchronized (this.field7186) {
            this.field7186.method7925();
        }
    }
}
