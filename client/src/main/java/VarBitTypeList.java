import deob.ObfuscatedName;

@ObfuscatedName("pd")
public class VarBitTypeList implements PlayerTypeListRelated {

    @ObfuscatedName("pd.j")
    public final Js5 field4664;

    @ObfuscatedName("pd.a")
    public WeightedCache field4665 = new WeightedCache(64);

    public VarBitTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        this.field4664 = arg2;
        if (this.field4664 != null) {
            int var4 = this.field4664.capacity() - 1;
            Js5ConfigGroup.VARBIT.method3071();
            this.field4664.getGroupCapacity(var4);
        }
    }

    @ObfuscatedName("pd.u(II)Lpe;")
    public VarBitType method7668(int arg0) {
        WeightedCache var2 = this.field4665;
        VarBitType var3;
        synchronized (this.field4665) {
            var3 = (VarBitType) this.field4665.method7916((long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        Js5 var5 = this.field4664;
        byte[] var6;
        synchronized (this.field4664) {
            var6 = this.field4664.fetchFile(Js5ConfigGroup.VARBIT.method3073(arg0), Js5ConfigGroup.VARBIT.method3075(arg0));
        }
        VarBitType var8 = new VarBitType();
        if (var6 != null) {
            var8.method7682(new Packet(var6));
        }
        WeightedCache var9 = this.field4665;
        synchronized (this.field4665) {
            this.field4665.method7937(var8, (long) arg0);
            return var8;
        }
    }

    @ObfuscatedName("pd.j(I)V")
    public void method7660() {
        WeightedCache var1 = this.field4665;
        synchronized (this.field4665) {
            this.field4665.method7922();
        }
    }

    @ObfuscatedName("pd.a(II)V")
    public void method7661(int arg0) {
        WeightedCache var2 = this.field4665;
        synchronized (this.field4665) {
            this.field4665.method7921(arg0);
        }
    }

    @ObfuscatedName("pd.s(B)V")
    public void method7662() {
        WeightedCache var1 = this.field4665;
        synchronized (this.field4665) {
            this.field4665.method7925();
        }
    }

    @ObfuscatedName("pd.c(II)V")
    public void resizeCache(int arg0) {
        WeightedCache var2 = this.field4665;
        synchronized (this.field4665) {
            this.field4665.method7922();
            this.field4665 = new WeightedCache(arg0);
        }
    }
}
