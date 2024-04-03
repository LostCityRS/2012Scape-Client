import deob.ObfuscatedName;

@ObfuscatedName("agq")
public abstract class GpuFramebuffer extends Framebuffer {

    @ObfuscatedName("agq.j")
    public GpuToolkit field9933;

    public GpuFramebuffer(GpuToolkit arg0) {
        this.field9933 = arg0;
    }

    @ObfuscatedName("agq.s()Z")
    public boolean method954() {
        this.field9933.method13814();
        return true;
    }

    @ObfuscatedName("agq.ap()V")
    public void method16007() {
        if (this.field9933.method457() == this) {
            this.field9933.method13510();
        }
    }
}
