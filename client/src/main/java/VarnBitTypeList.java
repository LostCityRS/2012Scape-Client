import deob.ObfuscatedName;

@ObfuscatedName("sr")
public class VarnBitTypeList {

    @ObfuscatedName("sr.u")
    public final Js5 field6414;

    @ObfuscatedName("sr.j")
    public final SoftLruHashTable field6413 = new SoftLruHashTable(64);

    public VarnBitTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field6414 = arg2;
        if (this.field6414 != null) {
            this.field6414.getGroupCapacity(Js5ConfigGroup.VARNBIT.field1668);
        }
    }

    @ObfuscatedName("sr.u(II)Lsj;")
    public VarnBitType method11311(int arg0) {
        SoftLruHashTable var2 = this.field6413;
        VarnBitType var3;
        synchronized (this.field6413) {
            var3 = (VarnBitType) this.field6413.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var5 = this.field6414.fetchFile(Js5ConfigGroup.VARNBIT.field1668, arg0);
        VarnBitType var6 = new VarnBitType();
        if (var5 != null) {
            var6.method11304(new Packet(var5));
        }
        SoftLruHashTable var7 = this.field6413;
        synchronized (this.field6413) {
            this.field6413.method7937(var6, (long) arg0);
            return var6;
        }
    }

    @ObfuscatedName("sr.j(B)V")
    public void method11312() {
        SoftLruHashTable var1 = this.field6413;
        synchronized (this.field6413) {
            this.field6413.method7922();
        }
    }

    @ObfuscatedName("sr.a(II)V")
    public void method11310(int arg0) {
        SoftLruHashTable var2 = this.field6413;
        synchronized (this.field6413) {
            this.field6413.method7921(arg0);
        }
    }

    @ObfuscatedName("sr.s(B)V")
    public void method11313() {
        SoftLruHashTable var1 = this.field6413;
        synchronized (this.field6413) {
            this.field6413.removeSoft();
        }
    }
}
