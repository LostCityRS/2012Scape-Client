import deob.ObfuscatedName;

@ObfuscatedName("ba")
public class ba extends Heap implements class10 {

    public long nativeid;

    public ba(ja arg0, int arg1) {
        this.method1161(arg0, arg1);
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            class111.method2358(this);
        }
    }

    @ObfuscatedName("ba.ma(Z)V")
    public native void method92(boolean arg0);

    @ObfuscatedName("ba.u()V")
    public native void method1152();

    @ObfuscatedName("ba.ha()V")
    public native void method1153();

    @ObfuscatedName("ba.sa(Lja;I)V")
    public native void method1161(ja arg0, int arg1);
}
