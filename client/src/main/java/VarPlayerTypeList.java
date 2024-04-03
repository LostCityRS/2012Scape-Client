import deob.ObfuscatedName;

@ObfuscatedName("jw")
public class VarPlayerTypeList implements PlayerTypeListRelated {

    @ObfuscatedName("jw.u")
    public final Js5 field3314;

    @ObfuscatedName("jw.j")
    public int field3312;

    @ObfuscatedName("jw.a")
    public WeightedCache field3313 = new WeightedCache(64);

    public VarPlayerTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field3314 = arg2;
        if (this.field3314 == null) {
            this.field3312 = 0;
        } else {
            this.field3312 = this.field3314.method5637(Js5ConfigGroup.VARP.field1668);
        }
    }

    @ObfuscatedName("jw.u(II)Lju;")
    public VarPlayerType method4890(int arg0) {
        WeightedCache var2 = this.field3313;
        VarPlayerType var3;
        synchronized (this.field3313) {
            var3 = (VarPlayerType) this.field3313.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field3314;
        byte[] var6;
        synchronized (this.field3314) {
            var6 = this.field3314.method5627(Js5ConfigGroup.VARP.field1668, arg0);
        }
        VarPlayerType var8 = new VarPlayerType();
        if (var6 != null) {
            var8.method4870(new Packet(var6));
        }
        WeightedCache var9 = this.field3313;
        synchronized (this.field3313) {
            this.field3313.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("jw.j(B)V")
    public void method4881() {
        WeightedCache var1 = this.field3313;
        synchronized (this.field3313) {
            this.field3313.method7922();
        }
    }

    @ObfuscatedName("jw.a(II)V")
    public void method4882(int arg0) {
        WeightedCache var2 = this.field3313;
        synchronized (this.field3313) {
            this.field3313.method7921(arg0);
        }
    }

    @ObfuscatedName("jw.s(I)V")
    public void method4883() {
        WeightedCache var1 = this.field3313;
        synchronized (this.field3313) {
            this.field3313.method7925();
        }
    }
}
