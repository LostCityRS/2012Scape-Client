import deob.ObfuscatedName;

@ObfuscatedName("sr")
public class class529 {

    @ObfuscatedName("sr.u")
    public final Js5 field6414;

    @ObfuscatedName("sr.j")
    public final WeightedCache field6413 = new WeightedCache(64);

    public class529(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field6414 = arg2;
        if (this.field6414 != null) {
            this.field6414.method5637(Js5ConfigGroup.field1650.field1668);
        }
    }

    @ObfuscatedName("sr.u(II)Lsj;")
    public class528 method11311(int arg0) {
        WeightedCache var2 = this.field6413;
        class528 var3;
        synchronized (this.field6413) {
            var3 = (class528) this.field6413.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var5 = this.field6414.method5627(Js5ConfigGroup.field1650.field1668, arg0);
        class528 var6 = new class528();
        if (var5 != null) {
            var6.method11304(new Packet(var5));
        }
        WeightedCache var7 = this.field6413;
        synchronized (this.field6413) {
            this.field6413.method7937(var6, (long) arg0);
            return var6;
        }
    }

    @ObfuscatedName("sr.j(B)V")
    public void method11312() {
        WeightedCache var1 = this.field6413;
        synchronized (this.field6413) {
            this.field6413.method7922();
        }
    }

    @ObfuscatedName("sr.a(II)V")
    public void method11310(int arg0) {
        WeightedCache var2 = this.field6413;
        synchronized (this.field6413) {
            this.field6413.method7921(arg0);
        }
    }

    @ObfuscatedName("sr.s(B)V")
    public void method11313() {
        WeightedCache var1 = this.field6413;
        synchronized (this.field6413) {
            this.field6413.method7925();
        }
    }
}
