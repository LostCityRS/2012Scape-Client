import deob.ObfuscatedName;

@ObfuscatedName("oa")
public class oa implements EffectInterface, class10 {

    public long nativeid = 0L;

    @ObfuscatedName("oa.u")
    public int field381;

    @ObfuscatedName("oa.j")
    public int field382;

    public oa(int arg0, int arg1) {
        this.field381 = arg0;
        this.field382 = arg1;
        this.method163(arg0, arg1);
    }

    @ObfuscatedName("oa.u()I")
    public int method164() {
        return this.field381;
    }

    @ObfuscatedName("oa.a()I")
    public int method165() {
        return this.field382;
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            class111.method2358(this);
        }
    }

    @ObfuscatedName("oa.ma(Z)V")
    public void method92(boolean arg0) {
        this.method167(this.nativeid, arg0);
    }

    @ObfuscatedName("oa.s()V")
    public void method168() {
        this.method92(false);
    }

    @ObfuscatedName("oa.g(II)V")
    public native void method163(int arg0, int arg1);

    @ObfuscatedName("oa.za(JZ)V")
    public native void method167(long arg0, boolean arg1);
}
