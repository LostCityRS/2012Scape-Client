import deob.ObfuscatedName;

@ObfuscatedName("aag")
public class ProgrammableBatchedSpriteShader extends BatchedSpriteShader {

    @ObfuscatedName("aag.a")
    public GpuShader field8696;

    @ObfuscatedName("aag.s")
    public GpuProgramUniform field8695;

    @ObfuscatedName("aag.c")
    public GpuProgram field8697;

    public ProgrammableBatchedSpriteShader(GpuToolkit arg0) throws ShaderException {
        super(arg0);
        this.method14064();
    }

    @ObfuscatedName("aag.s(I)Z")
    public boolean method14064() throws ShaderException {
        this.field8696 = this.field2276.method13490("BatchedSprite");
        this.field8695 = this.field8696.method3357("SpriteSampler");
        this.field8697 = this.field8696.method3330("Normal");
        this.field8696.method3335(this.field8697);
        return true;
    }

    @ObfuscatedName("aag.u()V")
    public void method3878() {
        this.field8696.method3325();
        this.field8696.method3336(this.field8695, 0, this.field2275);
    }
}
