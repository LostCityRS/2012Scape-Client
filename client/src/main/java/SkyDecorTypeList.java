import deob.ObfuscatedName;

@ObfuscatedName("fj")
public class SkyDecorTypeList {

    @ObfuscatedName("fj.u")
    public final Js5 field2161;

    @ObfuscatedName("fj.j")
    public final SoftLruHashTable field2162 = new SoftLruHashTable(16);

    public SkyDecorTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field2161 = arg2;
        this.field2161.getGroupCapacity(Js5ConfigGroup.SKYDECORTYPE.field1668);
    }

    @ObfuscatedName("fj.u(II)Lfy;")
    public SkyDecorType method3601(int arg0) {
        SoftLruHashTable var2 = this.field2162;
        SkyDecorType var3;
        synchronized (this.field2162) {
            var3 = (SkyDecorType) this.field2162.get((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field2161;
        byte[] var6;
        synchronized (this.field2161) {
            var6 = this.field2161.fetchFile(Js5ConfigGroup.SKYDECORTYPE.field1668, arg0);
        }
        SkyDecorType var8 = new SkyDecorType();
        if (var6 != null) {
            var8.method3595(new Packet(var6));
        }
        SoftLruHashTable var9 = this.field2162;
        synchronized (this.field2162) {
            this.field2162.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("fj.j(I)V")
    public void method3602() {
        SoftLruHashTable var1 = this.field2162;
        synchronized (this.field2162) {
            this.field2162.method7922();
        }
    }

    @ObfuscatedName("fj.a(IB)V")
    public void method3608(int arg0) {
        SoftLruHashTable var2 = this.field2162;
        synchronized (this.field2162) {
            this.field2162.method7921(arg0);
        }
    }

    @ObfuscatedName("fj.s(I)V")
    public void method3600() {
        SoftLruHashTable var1 = this.field2162;
        synchronized (this.field2162) {
            this.field2162.removeSoft();
        }
    }
}
