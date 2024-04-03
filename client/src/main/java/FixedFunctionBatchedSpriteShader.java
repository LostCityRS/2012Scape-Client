import deob.ObfuscatedName;

@ObfuscatedName("aas")
public class FixedFunctionBatchedSpriteShader extends BatchedSpriteShader {

    public FixedFunctionBatchedSpriteShader(GpuToolkit arg0) {
        super(arg0);
    }

    @ObfuscatedName("aas.u()V")
    public void method3878() {
        this.field2276.method13764(Matrix4x4.field3479, Matrix4x4.field3479, Matrix4x4.field3479);
        this.field2276.method13629(0);
        this.field2276.method13557(this.field2275);
        this.field2276.method13560(0, TextureCombiner.field2546);
        this.field2276.method13562(0, TextureCombiner.field2546);
        this.field2276.method13560(1, TextureCombiner.field2545);
        this.field2276.method13562(1, TextureCombiner.field2545);
        this.field2276.method13632(TextureCombineMode.field2574, TextureCombineMode.field2574);
    }
}
