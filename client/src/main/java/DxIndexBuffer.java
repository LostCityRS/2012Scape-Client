import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.HRESULT;

@ObfuscatedName("jg")
public class DxIndexBuffer implements IndexBuffer {

    @ObfuscatedName("jg.u")
    public final DxToolkit field3318;

    @ObfuscatedName("jg.j")
    public int field3316;

    @ObfuscatedName("jg.a")
    public int field3321;

    @ObfuscatedName("jg.s")
    public final boolean field3319;

    @ObfuscatedName("jg.c")
    public final DataType field3317;

    @ObfuscatedName("jg.m")
    public long field3320 = 0L;

    public DxIndexBuffer(DxToolkit arg0, DataType arg1, boolean arg2) {
        this.field3318 = arg0;
        this.field3317 = arg1;
        this.field3319 = arg2;
        this.field3318.method13586(this);
    }

    @ObfuscatedName("jg.t()I")
    public int method4451() {
        return this.field3316;
    }

    @ObfuscatedName("jg.u()Ldz;")
    public DataType method4538() {
        return this.field3317;
    }

    @ObfuscatedName("jg.v(I)V")
    public void method4535(int arg0) {
        this.field3316 = this.field3317.field1508 * arg0;
        if (this.field3316 <= this.field3321) {
            return;
        }
        if (this.field3320 != 0L) {
            IUnknown.Release(this.field3320);
        }
        int var2 = 8;
        byte var3;
        if (this.field3319) {
            var3 = 0;
            var2 |= 0x200;
        } else {
            var3 = 1;
        }
        this.field3320 = IDirect3DDevice.CreateIndexBuffer(this.field3318.field9975, this.field3316, var2, DataType.field1502 == this.field3317 ? 101 : 102, var3);
        this.field3321 = this.field3316;
    }

    @ObfuscatedName("jg.f(II)J")
    public long method4453(int arg0, int arg1) {
        return IDirect3DIndexBuffer.Lock(this.field3320, arg0, arg1, this.field3319 ? 8192 : 0);
    }

    @ObfuscatedName("jg.d()V")
    public void method4454() {
        IDirect3DIndexBuffer.Unlock(this.field3320);
    }

    @ObfuscatedName("jg.l(IIJ)Z")
    public boolean method4452(int arg0, int arg1, long arg2) {
        return HRESULT.method19(IDirect3DIndexBuffer.Upload(this.field3320, arg0, arg1, this.field3319 ? 8192 : 0, arg2));
    }

    @ObfuscatedName("jg.s()V")
    public void method168() {
        if (this.field3320 != 0L) {
            IUnknown.Release(this.field3320);
            this.field3320 = 0L;
        }
        this.field3321 = 0;
        this.field3316 = 0;
        this.field3318.method13485(this);
    }

    @ObfuscatedName("jg.a()V")
    public void method4898() {
        if (this.field3320 != 0L) {
            this.field3318.method16038(this.field3320);
            this.field3320 = 0L;
        }
        this.field3321 = 0;
        this.field3316 = 0;
    }

    public void finalize() {
        this.method4898();
    }
}
