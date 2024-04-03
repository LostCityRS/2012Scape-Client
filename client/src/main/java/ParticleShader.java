import deob.ObfuscatedName;

@ObfuscatedName("ft")
public abstract class ParticleShader {

    @ObfuscatedName("ft.u")
    public GpuToolkit field2274;

    @ObfuscatedName("ft.j")
    public GpuTexture field2271;

    @ObfuscatedName("ft.a")
    public final Matrix4x4 field2273 = new Matrix4x4();

    @ObfuscatedName("ft.s")
    public int field2272;

    public ParticleShader(GpuToolkit arg0) {
        this.field2274 = arg0;
    }

    @ObfuscatedName("ft.j(I)V")
    public abstract void method3871(int arg0);

    @ObfuscatedName("ft.a()V")
    public abstract void method3872();

    @ObfuscatedName("ft.u(Lka;)V")
    public abstract void method3875(Matrix4x4 arg0);
}
