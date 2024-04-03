import deob.ObfuscatedName;

@ObfuscatedName("ahe")
public abstract class GpuSurface extends Surface {

    @ObfuscatedName("ahe.u")
    public GpuToolkit field9948;

    public GpuSurface(GpuToolkit arg0) {
        this.field9948 = arg0;
    }

    @ObfuscatedName("ahe.s()Z")
    public boolean method954() {
        this.field9948.method13814();
        return true;
    }

    @ObfuscatedName("ahe.ar(II)V")
    public void method923(int arg0, int arg1) {
        if (this.field9948.method457() == this) {
            this.field9948.method13510();
        }
    }
}
