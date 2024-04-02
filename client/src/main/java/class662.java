
import deob.ObfuscatedName;

@ObfuscatedName("yh")
public class class662 extends WallDecorLayerEntity implements Location {

	@ObfuscatedName("yh.z")
	public class116 field7570;

	@ObfuscatedName("yh.n")
	public boolean field7568;

	@ObfuscatedName("yh.o")
	public EntityBounds field7569;

	@ObfuscatedName("yh.q")
	public boolean field7571 = true;

	public class662(Scene arg0, RendererToolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
		this.field7570 = new class116(arg1, arg2, arg3, arg12, arg13, this.field9807, arg5, this, arg9, arg14);
		this.field7568 = arg3.field6493 != 0 && !arg9;
		this.method15642(1);
	}

	@ObfuscatedName("yh.bn(I)Z")
	public boolean method12807() {
		return false;
	}

	@ObfuscatedName("yh.ba(I)Z")
	public boolean method12808() {
		return this.field7571;
	}

	@ObfuscatedName("yh.br(Lra;I)Lok;")
	public EntityBounds method12810(RendererToolkit arg0) {
		return this.field7569;
	}

	@ObfuscatedName("yh.bc(I)I")
	public int method12809() {
		return this.field7570.method2434();
	}

	@ObfuscatedName("yh.bp(I)I")
	public int method12811() {
		return this.field7570.method2436();
	}

	@ObfuscatedName("yh.bd(Lto;I)V")
	public void method12893(class539 arg0) {
		this.field7570.method2452(arg0);
	}

	@ObfuscatedName("yh.bi(Lra;B)Loz;")
	public PickableEntity method12812(RendererToolkit arg0) {
		Model var2 = this.field7570.method2437(arg0, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = arg0.method516();
		var3.method5115(this.method8558());
		var3.method5116((float) this.field10496, 0.0F, (float) this.field10497);
		ScaleRotTrans var4 = this.method8565();
		PickableEntity var5 = PickableEntity.method12205(this.field7568);
		int var6 = (int) var4.field3464.field3475 >> 9;
		int var7 = (int) var4.field3464.field3477 >> 9;
		this.field7570.method2438(arg0, var2, var3, var6, var6, var7, var7, true);
		var2.method271(var3, this.field9811[0], 0);
		if (this.field7570.field1229 != null) {
			ParticleList var8 = this.field7570.field1229.method8112();
			arg0.method733(var8);
		}
		this.field7571 = var2.method292() || this.field7570.field1229 != null;
		if (this.field7569 == null) {
			this.field7569 = GraphEntity.method15140((int) var4.field3464.field3475, (int) var4.field3464.field3476, (int) var4.field3464.field3477, var2);
		} else {
			GraphEntity.method11162(this.field7569, (int) var4.field3464.field3475, (int) var4.field3464.field3476, (int) var4.field3464.field3477, var2);
		}
		return var5;
	}

	@ObfuscatedName("yh.bx(Lra;B)V")
	public void method12851(RendererToolkit arg0) {
		Model var2 = this.field7570.method2437(arg0, 262144, false, true);
		if (var2 == null) {
			return;
		}
		Matrix4x3 var3 = this.method8558();
		ScaleRotTrans var4 = this.method8565();
		int var5 = (int) var4.field3464.field3475 >> 9;
		int var6 = (int) var4.field3464.field3477 >> 9;
		this.field7570.method2438(arg0, var2, var3, var5, var5, var6, var6, false);
	}

	@ObfuscatedName("yh.bb(Lra;III)Z")
	public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
		Model var4 = this.field7570.method2437(arg0, 131072, false, false);
		return var4 == null ? false : var4.method272(arg1, arg2, this.method8558(), false, 0);
	}

	@ObfuscatedName("yh.u(B)I")
	public int method2401() {
		return this.field7570.field1219;
	}

	@ObfuscatedName("yh.j(B)I")
	public int method2390() {
		return this.field7570.field1226;
	}

	@ObfuscatedName("yh.a(I)I")
	public int method2391() {
		return this.field7570.field1216;
	}

	@ObfuscatedName("yh.s(I)V")
	public void method2409() {
	}

	@ObfuscatedName("yh.c(I)Z")
	public boolean method2393() {
		return this.field7570.method2435();
	}

	@ObfuscatedName("yh.m(Lra;I)V")
	public void method2406(RendererToolkit arg0) {
		this.field7570.method2440(arg0);
	}

	@ObfuscatedName("yh.t(Lra;I)V")
	public void method2412(RendererToolkit arg0) {
		this.field7570.method2441(arg0);
	}
}
