import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("abk")
public class GlxCubeTexture extends GlxBaseTexture implements GpuCubeTexture {

    public GlxCubeTexture(GlxToolkit arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, TextureFormat.field1296, DataType.field1501, arg1 * arg1 * 6, arg2);
        this.field3733.method13557(this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; var5++) {
                this.method5985(var5 + 34069, arg1, arg1, arg3[var5]);
            }
        } else {
            for (int var6 = 0; var6 < 6; var6++) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, GlxToolkit.method16100(this.field3736, this.field3731), arg1, arg1, 0, GlxToolkit.method16093(this.field3736), this.field3733.field10024, arg3[var6], 0);
            }
        }
    }

    @ObfuscatedName("abk.au()V")
    public void method4527() {
        super.method4527();
    }

    @ObfuscatedName("abk.ae(Lhd;)V")
    public void method4525(GpuTextureRelated arg0) {
        super.method4525(arg0);
    }

    @ObfuscatedName("abk.s()V")
    public void method168() {
        super.method168();
    }
}
