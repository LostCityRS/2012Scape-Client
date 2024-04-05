import deob.ObfuscatedName;

@ObfuscatedName("uq")
public class EnumTypeList {

    @ObfuscatedName("uq.u")
    public final Js5 field6804;

    @ObfuscatedName("uq.j")
    public final SoftLruHashTable field6805 = new SoftLruHashTable(128);

    public EnumTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field6804 = arg2;
        if (this.field6804 != null) {
            int var4 = this.field6804.capacity() - 1;
            Js5ConfigGroup.ENUMTYPE.method3071();
            this.field6804.getGroupCapacity(var4);
        }
    }

    @ObfuscatedName("uq.u(II)Lud;")
    public EnumType method12116(int arg0) {
        SoftLruHashTable var2 = this.field6805;
        EnumType var3;
        synchronized (this.field6805) {
            var3 = (EnumType) this.field6805.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var5 = this.field6804.fetchFile(Js5ConfigGroup.ENUMTYPE.method3073(arg0), Js5ConfigGroup.ENUMTYPE.method3075(arg0));
        EnumType var6 = new EnumType();
        if (var5 != null) {
            var6.method12121(new Packet(var5));
        }
        SoftLruHashTable var7 = this.field6805;
        synchronized (this.field6805) {
            this.field6805.method7937(var6, (long) arg0);
            return var6;
        }
    }
}
