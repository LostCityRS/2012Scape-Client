
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@ObfuscatedName("jl")
public class class303 implements class296 {

	@ObfuscatedName("jl.u")
	public final DxToolkit field3342;

	@ObfuscatedName("jl.j")
	public final DataType field3343;

	@ObfuscatedName("jl.a")
	public final int field3344;

	@ObfuscatedName("jl.s")
	public final int field3345;

	@ObfuscatedName("jl.c")
	public long field3346;

	public class303(DxToolkit arg0, DataType arg1, int arg2, int arg3, int arg4) {
		this.field3342 = arg0;
		this.field3344 = arg2;
		this.field3345 = arg3;
		this.field3343 = arg1;
		this.field3346 = IDirect3DDevice.CreateDepthStencilSurface(this.field3342.field9975, arg2, arg3, DxToolkit.method16022(this.field3343), arg4, 0, false);
		this.field3342.method13586(this);
	}

	@ObfuscatedName("jl.u()I")
	public int method164() {
		return this.field3344;
	}

	@ObfuscatedName("jl.a()I")
	public int method165() {
		return this.field3345;
	}

	@ObfuscatedName("jl.j()J")
	public long method4909() {
		return this.field3346;
	}

	@ObfuscatedName("jl.s()V")
	public void method168() {
		if (this.field3346 != 0L) {
			IUnknown.Release(this.field3346);
			this.field3346 = 0L;
		}
		this.field3342.method13485(this);
	}

	@ObfuscatedName("jl.o()V")
	public void method4905() {
		if (this.field3346 != 0L) {
			this.field3342.method16038(this.field3346);
			this.field3346 = 0L;
		}
	}

	public void finalize() {
		this.method4905();
	}
}
