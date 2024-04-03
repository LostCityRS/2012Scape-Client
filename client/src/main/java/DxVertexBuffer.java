import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.HRESULT;

@ObfuscatedName("jk")
public class DxVertexBuffer implements VertexBuffer {

    @ObfuscatedName("jk.u")
    public final DxToolkit field3332;

    @ObfuscatedName("jk.j")
    public int field3331;

    @ObfuscatedName("jk.a")
    public int field3333;

    @ObfuscatedName("jk.s")
    public byte field3330;

    @ObfuscatedName("jk.c")
    public final boolean field3334;

    @ObfuscatedName("jk.m")
    public long field3335 = 0L;

    public DxVertexBuffer(DxToolkit arg0, boolean arg1) {
        this.field3332 = arg0;
        this.field3334 = arg1;
        this.field3332.method13586(this);
    }

    @ObfuscatedName("jk.t()I")
    public int method4451() {
        return this.field3333;
    }

    @ObfuscatedName("jk.v()I")
    public int method4934() {
        return this.field3330;
    }

    @ObfuscatedName("jk.u(II)Z")
    public boolean method4269(int arg0, int arg1) {
        this.field3333 = arg0;
        this.field3330 = (byte) arg1;
        if (this.field3333 > this.field3331) {
            int var3 = 8;
            byte var4;
            if (this.field3334) {
                var4 = 0;
                var3 |= 0x200;
            } else {
                var4 = 1;
            }
            if (this.field3335 != 0L) {
                IUnknown.Release(this.field3335);
            }
            this.field3335 = IDirect3DDevice.CreateVertexBuffer(this.field3332.field9975, this.field3333, var3, 0, var4);
            this.field3331 = this.field3333;
        }
        return this.field3335 != 0L;
    }

    @ObfuscatedName("jk.f(II)J")
    public long method4453(int arg0, int arg1) {
        return IDirect3DVertexBuffer.Lock(this.field3335, arg0, arg1, this.field3334 ? 8192 : 0);
    }

    @ObfuscatedName("jk.d()V")
    public void method4454() {
        IDirect3DVertexBuffer.Unlock(this.field3335);
    }

    @ObfuscatedName("jk.l(IIJ)Z")
    public boolean method4452(int arg0, int arg1, long arg2) {
        return HRESULT.method19(IDirect3DVertexBuffer.Upload(this.field3335, arg0, arg1, this.field3334 ? 8192 : 0, arg2));
    }

    @ObfuscatedName("jk.s()V")
    public void method168() {
        if (this.field3335 != 0L) {
            IUnknown.Release(this.field3335);
            this.field3335 = 0L;
        }
        this.field3331 = 0;
        this.field3333 = 0;
        this.field3332.method13485(this);
    }

    @ObfuscatedName("jk.k()V")
    public void method4936() {
        if (this.field3335 != 0L) {
            this.field3332.method16038(this.field3335);
            this.field3335 = 0L;
            this.field3331 = 0;
            this.field3333 = 0;
        }
    }

    public void finalize() {
        this.method4936();
    }
}
