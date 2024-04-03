import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@ObfuscatedName("jb")
public class DxGraphicsDeletableRelated implements DxGraphicsDeletable {

    @ObfuscatedName("jb.u")
    public final DxToolkit field3336;

    @ObfuscatedName("jb.j")
    public final DataType field3337;

    @ObfuscatedName("jb.a")
    public final TextureFormat field3339;

    @ObfuscatedName("jb.s")
    public final int field3338;

    @ObfuscatedName("jb.c")
    public final int field3340;

    @ObfuscatedName("jb.m")
    public long field3341;

    public DxGraphicsDeletableRelated(DxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5) {
        this.field3336 = arg0;
        this.field3338 = arg3;
        this.field3340 = arg4;
        this.field3339 = arg1;
        this.field3337 = arg2;
        this.field3341 = IDirect3DDevice.CreateRenderTarget(this.field3336.field9975, arg3, arg4, DxToolkit.method16037(this.field3339, this.field3337), arg5, 0, false);
        this.field3336.method13586(this);
    }

    @ObfuscatedName("jb.u()I")
    public int method164() {
        return this.field3338;
    }

    @ObfuscatedName("jb.a()I")
    public int method165() {
        return this.field3340;
    }

    @ObfuscatedName("jb.j()J")
    public long method4909() {
        return this.field3341;
    }

    @ObfuscatedName("jb.s()V")
    public void method168() {
        if (this.field3341 != 0L) {
            IUnknown.Release(this.field3341);
            this.field3341 = 0L;
        }
        this.field3336.method13485(this);
    }

    @ObfuscatedName("jb.o()V")
    public void method4905() {
        if (this.field3341 != 0L) {
            this.field3336.method16038(this.field3341);
            this.field3341 = 0L;
        }
    }

    public void finalize() {
        this.method4905();
    }
}
