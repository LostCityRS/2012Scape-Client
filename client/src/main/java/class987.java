
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.class0;

@ObfuscatedName("akh")
public class class987 extends class891 {

	@ObfuscatedName("akh.s")
	public final DxToolkit field10536;

	@ObfuscatedName("akh.c")
	public int field10541;

	@ObfuscatedName("akh.m")
	public int field10538;

	@ObfuscatedName("akh.t")
	public int field10542;

	@ObfuscatedName("akh.l")
	public boolean field10540;

	@ObfuscatedName("akh.f")
	public class296 field10537 = null;

	@ObfuscatedName("akh.d")
	public final class304[] field10535 = new class304[4];

	public class987(DxToolkit arg0) {
		super(arg0);
		this.field10536 = arg0;
	}

	@ObfuscatedName("akh.u()I")
	public int method921() {
		return this.field10541;
	}

	@ObfuscatedName("akh.j()I")
	public int method922() {
		return this.field10538;
	}

	@ObfuscatedName("akh.n(Ldo;)V")
	public void method1207(class132 arg0) {
		class296 var2 = (class296) arg0;
		if (arg0 == null) {
			this.field10542 &= 0xFFFFFFEF;
			this.field10537 = null;
			if (this.field10540) {
				this.method16942(0L);
			}
			if (this.field10542 == 0) {
				this.field10538 = 0;
				this.field10541 = 0;
			}
			return;
		}
		if (this.field10542 == 0) {
			this.field10538 = var2.method165();
			this.field10541 = var2.method164();
			this.method16007();
		} else if (this.field10541 != var2.method164() || this.field10538 != var2.method165()) {
			throw new RuntimeException();
		}
		this.field10542 |= 0x10;
		this.field10537 = var2;
		if (this.field10540) {
			this.method16942(var2.method4909());
		}
	}

	@ObfuscatedName("akh.x(ILde;)V")
	public void method1206(int arg0, GraphicsDeletable arg1) {
		int var3 = 0x1 << arg0;
		class304 var4 = (class304) arg1;
		if (arg1 == null) {
			this.field10542 &= ~var3;
			this.field10535[arg0] = null;
			if (this.field10540) {
				this.method16954(arg0, 0L);
			}
			if (this.field10542 == 0) {
				this.field10538 = 0;
				this.field10541 = 0;
			}
			return;
		}
		if (this.field10542 == 0) {
			this.field10538 = var4.method165();
			this.field10541 = var4.method164();
			this.method16007();
		} else if (this.field10541 != var4.method164() || this.field10538 != var4.method165()) {
			throw new RuntimeException();
		}
		this.field10542 |= var3;
		this.field10535[arg0] = var4;
		if (this.field10540) {
			this.method16954(arg0, var4.method4909());
		}
	}

	@ObfuscatedName("akh.ag(IJ)Z")
	public boolean method16954(int arg0, long arg1) {
		return class0.method19(IDirect3DDevice.SetRenderTarget(this.field10536.field9975, arg0, arg1));
	}

	@ObfuscatedName("akh.as(J)Z")
	public boolean method16942(long arg0) {
		return class0.method19(IDirect3DDevice.SetDepthStencilSurface(this.field10536.field9975, arg0));
	}

	@ObfuscatedName("akh.r()Z")
	public boolean method1208() {
		return this.field10535[0] != null;
	}

	@ObfuscatedName("akh.s()Z")
	public boolean method954() {
		for (int var1 = 0; var1 < 4; var1++) {
			class304 var2 = this.field10535[var1];
			if (var2 != null) {
				long var3 = var2.method4909();
				this.method16954(var1, var3);
			}
		}
		if (this.field10537 != null) {
			this.method16942(this.field10537.method4909());
		}
		this.field10540 = true;
		return super.method954();
	}

	@ObfuscatedName("akh.c()Z")
	public boolean method925() {
		for (int var1 = 1; var1 < 4; var1++) {
			class304 var2 = this.field10535[var1];
			if (var2 != null) {
				this.method16954(var1, 0L);
			}
		}
		if (this.field10537 != null) {
			this.method16942(0L);
		}
		this.field10540 = false;
		return true;
	}

	@ObfuscatedName("akh.g(IIIIIIZZ)V")
	public void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (arg6) {
			long var9 = IDirect3DDevice.GetRenderTarget(this.field10536.field9975, 0);
			IDirect3DDevice.StretchRect(this.field10536.field9975, this.field10535[0].method4909(), arg0, arg1, arg2, arg3, var9, arg4, arg5, arg2, arg3, 0);
			IUnknown.Release(var9);
		}
	}

	@ObfuscatedName("akh.a()V")
	public void method944() {
		if (this.field10537 != null) {
			this.field10537.method168();
		}
		for (int var1 = 0; var1 < this.field10535.length; var1++) {
			if (this.field10535[var1] != null) {
				this.field10535[var1].method168();
			}
		}
	}

	@ObfuscatedName("akh.ai()V")
	public void method16943() {
		if (this.field10537 != null) {
			this.field10537.method4905();
		}
		for (int var1 = 0; var1 < this.field10535.length; var1++) {
			if (this.field10535[var1] != null) {
				this.field10535[var1].method4905();
			}
		}
	}

	public void finalize() throws Throwable {
		this.method16943();
		super.finalize();
	}
}
