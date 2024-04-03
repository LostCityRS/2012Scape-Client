import deob.ObfuscatedName;

@ObfuscatedName("wa")
public class wa extends GraphicsRelated implements ua {

    public long nativeid;

    public wa(ja arg0, ba arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.l(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            cp.method2358(this);
        }
    }

    @ObfuscatedName("wa.l(Lja;Lba;II[I[I)V")
    public native void l(ja arg0, ba arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @ObfuscatedName("wa.ma(Z)V")
    public native void ma(boolean arg0);
}
