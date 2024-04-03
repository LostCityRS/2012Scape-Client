import deob.ObfuscatedName;

@ObfuscatedName("ba")
public class ba extends Heap implements ua {

    public long nativeid;

    public ba(ja arg0, int arg1) {
        this.sa(arg0, arg1);
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            cp.method2358(this);
        }
    }

    @ObfuscatedName("ba.ma(Z)V")
    public native void ma(boolean arg0);

    @ObfuscatedName("ba.u()V")
    public native void u();

    @ObfuscatedName("ba.ha()V")
    public native void ha();

    @ObfuscatedName("ba.sa(Lja;I)V")
    public native void sa(ja arg0, int arg1);
}
