import deob.ObfuscatedName;

@ObfuscatedName("hf")
public class GlModelRelated3 {

    @ObfuscatedName("hf.u")
    public boolean field2538;

    @ObfuscatedName("hf.j")
    public boolean field2535;

    @ObfuscatedName("hf.a")
    public VertexBuffer field2536;

    @ObfuscatedName("hf.s")
    public VertexBuffer field2537;

    public GlModelRelated3(boolean arg0) {
        this.field2535 = arg0;
    }

    @ObfuscatedName("hf.u()Z")
    public boolean method4492() {
        return this.field2538 && !this.field2535;
    }

    @ObfuscatedName("hf.j()V")
    public void method4491() {
        if (this.field2537 != null) {
            this.field2537.method168();
        }
        this.field2538 = false;
    }
}
