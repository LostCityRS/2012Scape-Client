package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.class0;
import java.awt.Canvas;

@ObfuscatedName("abg")
public class class756 extends class894 implements class298 {

	@ObfuscatedName("abg.u")
	public final class898 field8848;

	@ObfuscatedName("abg.j")
	public final Canvas field8844;

	@ObfuscatedName("abg.a")
	public long field8850;

	@ObfuscatedName("abg.s")
	public long field8846;

	@ObfuscatedName("abg.c")
	public long field8851;

	@ObfuscatedName("abg.m")
	public int field8847;

	@ObfuscatedName("abg.t")
	public int field8849;

	@ObfuscatedName("abg.l")
	public boolean field8845 = false;

	@ObfuscatedName("abg.f")
	public boolean field8843 = false;

	@ObfuscatedName("abg.d")
	public D3DPRESENT_PARAMETERS field8852;

	public class756(class898 arg0, Canvas arg1, int arg2, int arg3, boolean arg4) {
		super(arg0);
		this.field8844 = arg1;
		this.field8848 = arg0;
		this.field8847 = arg2;
		this.field8849 = arg3;
		this.field8843 = arg4;
		this.method4914();
		this.field8848.method16025(this);
	}

	@ObfuscatedName("abg.n()V")
	public void method4914() {
		this.method944();
		this.field8852 = new D3DPRESENT_PARAMETERS(this.field8844);
		this.field8852.Windowed = true;
		this.field8852.BackBufferCount = 1;
		this.field8852.BackBufferWidth = this.field8847;
		this.field8852.BackBufferHeight = this.field8849;
		if (this.field8843) {
			this.field8850 = IDirect3DDevice.GetSwapChain(this.field8848.field9975, 0);
			this.field8851 = IDirect3DSwapChain.GetBackBuffer(this.field8850, 0, 0);
			this.field8846 = IDirect3DDevice.GetDepthStencilSurface(this.field8848.field9975);
		} else if (class898.method16034(this.field8848.field9989, this.field8848.field9973, this.field8848.field9974, this.field8848.field8383, this.field8852)) {
			int var1 = this.field8852.AutoDepthStencilFormat;
			this.field8850 = IDirect3DDevice.CreateAdditionalSwapChain(this.field8848.field9975, this.field8852);
			this.field8851 = IDirect3DSwapChain.GetBackBuffer(this.field8850, 0, 0);
			this.field8846 = IDirect3DDevice.CreateDepthStencilSurface(this.field8848.field9975, this.field8847, this.field8849, var1, this.field8852.MultiSampleType, this.field8852.MultiSampleQuality, false);
		} else {
			throw new RuntimeException();
		}
		if (this.field8845) {
			this.method954();
		}
	}

	@ObfuscatedName("abg.u()I")
	public int method921() {
		return this.field8847;
	}

	@ObfuscatedName("abg.j()I")
	public int method922() {
		return this.field8849;
	}

	@ObfuscatedName("abg.s()Z")
	public boolean method954() {
		this.field8845 = true;
		if (Statics.method18(IDirect3DDevice.SetRenderTarget(this.field8848.field9975, 0, this.field8851))) {
			return false;
		} else if (Statics.method18(IDirect3DDevice.SetDepthStencilSurface(this.field8848.field9975, this.field8846))) {
			return false;
		} else {
			return super.method954();
		}
	}

	@ObfuscatedName("abg.c()Z")
	public boolean method925() {
		this.field8845 = false;
		return class0.method19(IDirect3DDevice.SetDepthStencilSurface(this.field8848.field9975, 0L));
	}

	@ObfuscatedName("abg.ay()I")
	public int method918() {
		return IDirect3DSwapChain.Present(this.field8850, 0);
	}

	@ObfuscatedName("abg.af(II)I")
	public int method919(int arg0, int arg1) {
		return IDirect3DSwapChain.Present(this.field8850, 0);
	}

	@ObfuscatedName("abg.ar(II)V")
	public void method923(int arg0, int arg1) {
		this.method944();
		this.field8847 = arg0;
		this.field8849 = arg1;
		if (this.field8843) {
			this.field8848.method16023();
		}
		this.method4914();
		super.method923(arg0, arg1);
	}

	@ObfuscatedName("abg.a()V")
	public void method944() {
		if (this.field8851 != 0L) {
			IUnknown.Release(this.field8851);
			this.field8851 = 0L;
		}
		if (this.field8846 != 0L) {
			IUnknown.Release(this.field8846);
			this.field8846 = 0L;
		}
		if (this.field8850 != 0L) {
			IUnknown.Release(this.field8850);
			this.field8850 = 0L;
		}
		this.field8848.method16026(this);
	}

	@ObfuscatedName("abg.aw()V")
	public void method14229() {
		if (this.field8851 != 0L) {
			IUnknown.Release(this.field8851);
			this.field8851 = 0L;
		}
		if (this.field8846 != 0L) {
			IUnknown.Release(this.field8846);
			this.field8846 = 0L;
		}
		if (this.field8850 != 0L) {
			IUnknown.Release(this.field8850);
			this.field8850 = 0L;
		}
		this.field8848.method16026(this);
	}

	public void finalize() throws Throwable {
		this.method14229();
		super.finalize();
	}
}
