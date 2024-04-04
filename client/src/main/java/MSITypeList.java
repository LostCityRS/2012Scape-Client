import deob.ObfuscatedName;

@ObfuscatedName("wd")
public class MSITypeList {

    @ObfuscatedName("wd.u")
    public final Js5 field7200;

    @ObfuscatedName("wd.j")
    public final Js5 field7199;

    @ObfuscatedName("wd.c")
    public WeightedCache field7201 = new WeightedCache(64);

    @ObfuscatedName("wd.m")
    public WeightedCache field7202 = new WeightedCache(64);

    public MSITypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
        this.field7200 = arg2;
        this.field7199 = arg3;
        this.field7200.getGroupCapacity(Js5ConfigGroup.MSITYPE.field1668);
        Math.random();
        Math.random();
        Math.random();
        Math.random();
    }

    @ObfuscatedName("wd.u(II)Lvc;")
    public MSIType method12491(int arg0) {
        WeightedCache var2 = this.field7201;
        MSIType var3;
        synchronized (this.field7201) {
            var3 = (MSIType) this.field7201.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field7200;
        byte[] var6;
        synchronized (this.field7200) {
            var6 = this.field7200.fetchFile(Js5ConfigGroup.MSITYPE.field1668, arg0);
        }
        MSIType var8 = new MSIType();
        var8.field7193 = this;
        if (var6 != null) {
            var8.method12486(new Packet(var6));
        }
        WeightedCache var9 = this.field7201;
        synchronized (this.field7201) {
            this.field7201.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("wd.j(IIB)V")
    public void resizeCache(int arg0, int arg1) {
        this.field7201 = new WeightedCache(arg0);
        this.field7202 = new WeightedCache(arg1);
    }

    @ObfuscatedName("wd.a(I)V")
    public void method12496() {
        WeightedCache var1 = this.field7201;
        synchronized (this.field7201) {
            this.field7201.method7922();
        }
        WeightedCache var3 = this.field7202;
        synchronized (this.field7202) {
            this.field7202.method7922();
        }
    }

    @ObfuscatedName("wd.s(IB)V")
    public void method12495(int arg0) {
        WeightedCache var2 = this.field7201;
        synchronized (this.field7201) {
            this.field7201.method7921(arg0);
        }
        WeightedCache var4 = this.field7202;
        synchronized (this.field7202) {
            this.field7202.method7921(arg0);
        }
    }

    @ObfuscatedName("wd.c(I)V")
    public void method12494() {
        WeightedCache var1 = this.field7201;
        synchronized (this.field7201) {
            this.field7201.method7925();
        }
        WeightedCache var3 = this.field7202;
        synchronized (this.field7202) {
            this.field7202.method7925();
        }
    }
}
