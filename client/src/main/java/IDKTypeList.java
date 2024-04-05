import deob.ObfuscatedName;

@ObfuscatedName("gq")
public class IDKTypeList implements PlayerTypeListRelated {

    @ObfuscatedName("gq.u")
    public final Js5 field2298;

    @ObfuscatedName("gq.j")
    public final Js5 field2299;

    @ObfuscatedName("gq.a")
    public final SoftLruHashTable field2300 = new SoftLruHashTable(64);

    public IDKTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
        this.field2298 = arg2;
        this.field2299 = arg3;
        this.field2298.getGroupCapacity(Js5ConfigGroup.IDKTYPE.field1668);
    }

    @ObfuscatedName("gq.u(II)Lgp;")
    public IDKType method3909(int arg0) {
        SoftLruHashTable var2 = this.field2300;
        IDKType var3;
        synchronized (this.field2300) {
            var3 = (IDKType) this.field2300.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field2298;
        byte[] var6;
        synchronized (this.field2298) {
            var6 = this.field2298.fetchFile(Js5ConfigGroup.IDKTYPE.field1668, arg0);
        }
        IDKType var8 = new IDKType();
        var8.field2296 = this;
        if (var6 != null) {
            var8.method3902(new Packet(var6));
        }
        SoftLruHashTable var9 = this.field2300;
        synchronized (this.field2300) {
            this.field2300.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("gq.j(B)V")
    public void method3910() {
        SoftLruHashTable var1 = this.field2300;
        synchronized (this.field2300) {
            this.field2300.method7922();
        }
    }

    @ObfuscatedName("gq.a(IS)V")
    public void method3911(int arg0) {
        SoftLruHashTable var2 = this.field2300;
        synchronized (this.field2300) {
            this.field2300.method7921(arg0);
        }
    }

    @ObfuscatedName("gq.s(I)V")
    public void method3917() {
        SoftLruHashTable var1 = this.field2300;
        synchronized (this.field2300) {
            this.field2300.removeSoft();
        }
    }
}
