import deob.ObfuscatedName;
import jagdx.*;

@ObfuscatedName("abw")
public class DxTexture_Sub1 extends DxTexture implements GpuTextureRelated1 {

    public DxTexture_Sub1(DxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
    }

    @ObfuscatedName("abw.bf(I)Lde;")
    public GraphicsDeletable method4534(int arg0) {
        return new DxRelated1(this, arg0);
    }

    @ObfuscatedName("abw.n(IIII[II)V")
    public void method4415(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        long var7 = IDirect3DTexture.GetSurfaceLevel(this.field3325, 0);
        long var9 = IDirect3DDevice.CreateRenderTarget(this.field3326.field9975, arg2, arg3, 21, 0, 0, true);
        if (HRESULT.method19(IDirect3DDevice.StretchRect(this.field3326.field9975, var7, arg0, arg1, arg2, arg3, var9, 0, 0, arg2, arg3, 1))) {
            IDirect3DSurface.Download(var9, 0, 0, arg2, arg3, arg2 * 4, 16, this.field3326.field8245);
            this.field3326.field8244.clear();
            this.field3326.field8244.asIntBuffer().get(arg4);
        }
        IUnknown.Release(var7);
        IUnknown.Release(var9);
    }

    @ObfuscatedName("abw.u()I")
    public int method4409() {
        return super.method4409();
    }

    @ObfuscatedName("abw.j()I")
    public int method4449() {
        return super.method4449();
    }

    @ObfuscatedName("abw.a(F)F")
    public float method4437(float arg0) {
        return super.method4437(arg0);
    }

    @ObfuscatedName("abw.t(F)F")
    public float method4439(float arg0) {
        return super.method4439(arg0);
    }

    @ObfuscatedName("abw.l()Z")
    public boolean method4408() {
        return super.method4408();
    }

    @ObfuscatedName("abw.f(ZZ)V")
    public void method4412(boolean arg0, boolean arg1) {
        super.method4412(arg0, arg1);
    }

    @ObfuscatedName("abw.d(IIII[III)V")
    public void method4413(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        super.method4413(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("abw.z(IIII[BLcy;II)V")
    public void method4414(int arg0, int arg1, int arg2, int arg3, byte[] arg4, TextureFormat arg5, int arg6, int arg7) {
        super.method4414(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @ObfuscatedName("abw.o()F")
    public float method4433() {
        return super.method4433();
    }

    @ObfuscatedName("abw.q()F")
    public float method4443() {
        return super.method4443();
    }

    @ObfuscatedName("abw.p()Z")
    public boolean method4418() {
        return super.method4418();
    }

    @ObfuscatedName("abw.au()V")
    public void method4527() {
        super.method4527();
    }

    @ObfuscatedName("abw.ae(Lhd;)V")
    public void method4525(GpuTextureRelated arg0) {
        super.method4525(arg0);
    }

    @ObfuscatedName("abw.s()V")
    public void method168() {
        super.method168();
    }
}
