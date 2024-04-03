import deob.ObfuscatedName;

@ObfuscatedName("oa")
public class oa implements EffectInterface, ua {

    public long nativeid = 0L;

    @ObfuscatedName("oa.u")
    public int field381;

    @ObfuscatedName("oa.j")
    public int field382;

    public oa(int arg0, int arg1) {
        this.field381 = arg0;
        this.field382 = arg1;
        this.g(arg0, arg1);
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
            cp.method2358(this);
        }
    }

    @ObfuscatedName("oa.ma(Z)V")
    public void ma(boolean arg0) {
        this.za(this.nativeid, arg0);
    }

    @ObfuscatedName("oa.s()V")
    public void method168() {
        this.ma(false);
    }

    @ObfuscatedName("oa.g(II)V")
    public native void g(int arg0, int arg1);

    @ObfuscatedName("oa.za(JZ)V")
    public native void za(long arg0, boolean arg1);
}
