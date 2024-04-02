
import deob.ObfuscatedName;

@ObfuscatedName("xm")
public class class658 extends GroundDecorLayerEntity implements class113 {

	@ObfuscatedName("xm.z")
	public class116 field7530;

	@ObfuscatedName("xm.n")
	public boolean field7529;

	@ObfuscatedName("xm.o")
	public EntityBounds field7528;

	@ObfuscatedName("xm.q")
	public boolean field7531 = true;

	public class658(Scene arg0, RendererToolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field6477);
		this.field7530 = new class116(arg1, arg2, arg3, class542.field6589.field6590, arg10, arg4, arg5, this, arg9, arg11);
		this.field7529 = arg3.field6493 != 0 && !arg9;
		this.method15642(1);
	}

	@ObfuscatedName("xm.bn(I)Z")
	public boolean method12807() {
		return false;
	}

	@ObfuscatedName("xm.ba(I)Z")
	public boolean method12808() {
		return this.field7531;
	}

	@ObfuscatedName("xm.br(Lra;I)Lok;")
	public EntityBounds method12810(RendererToolkit arg0) {
		return this.field7528;
	}

	@ObfuscatedName("xm.bc(I)I")
	public int method12809() {
		return this.field7530.method2434();
	}

	@ObfuscatedName("xm.bp(I)I")
	public int method12811() {
		return this.field7530.method2436();
	}

	@ObfuscatedName("xm.bi(Lra;B)Loz;")
	public PickableEntity method12812(RendererToolkit arg0) {
		Model var2 = this.field7530.method2437(arg0, 2048, false, true);
		if (var2 == null) {
			return null;
		}
		Matrix4x3 var3 = this.method8558();
		ScaleRotTrans var4 = this.method8565();
		PickableEntity var5 = PickableEntity.method12205(this.field7529);
		int var6 = (int) var4.field3464.field3475 >> 9;
		int var7 = (int) var4.field3464.field3477 >> 9;
		this.field7530.method2438(arg0, var2, var3, var6, var6, var7, var7, true);
		var2.method271(var3, this.field9811[0], 0);
		if (this.field7530.field1229 != null) {
			ParticleList var8 = this.field7530.field1229.method8112();
			arg0.method733(var8);
		}
		this.field7531 = var2.method292() || this.field7530.field1229 != null;
		if (this.field7528 == null) {
			this.field7528 = GraphEntity.method15140((int) var4.field3464.field3475, (int) var4.field3464.field3476, (int) var4.field3464.field3477, var2);
		} else {
			GraphEntity.method11162(this.field7528, (int) var4.field3464.field3475, (int) var4.field3464.field3476, (int) var4.field3464.field3477, var2);
		}
		return var5;
	}

	@ObfuscatedName("xm.bx(Lra;B)V")
	public void method12851(RendererToolkit arg0) {
		Model var2 = this.field7530.method2437(arg0, 262144, true, true);
		if (var2 != null) {
			Vector3 var3 = this.method8565().field3464;
			int var4 = (int) var3.field3475 >> 9;
			int var5 = (int) var3.field3477 >> 9;
			this.field7530.method2438(arg0, var2, this.method8558(), var4, var4, var5, var5, false);
		}
	}

	@ObfuscatedName("xm.bb(Lra;III)Z")
	public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
		Model var4 = this.field7530.method2437(arg0, 131072, false, false);
		return var4 == null ? false : var4.method272(arg1, arg2, this.method8558(), false, 0);
	}

	@ObfuscatedName("xm.be(I)Z")
	public final boolean method12815() {
		return false;
	}

	@ObfuscatedName("xm.bw(Lra;Laes;IIIZI)V")
	public final void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("xm.bo(B)V")
	public final void method12817() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("xm.u(B)I")
	public int method2401() {
		return this.field7530.field1219;
	}

	@ObfuscatedName("xm.j(B)I")
	public int method2390() {
		return this.field7530.field1226;
	}

	@ObfuscatedName("xm.a(I)I")
	public int method2391() {
		return this.field7530.field1216;
	}

	@ObfuscatedName("xm.bd(Lto;I)V")
	public void method12858(class539 arg0) {
		this.field7530.method2452(arg0);
	}

	@ObfuscatedName("xm.s(I)V")
	public void method2409() {
	}

	@ObfuscatedName("xm.c(I)Z")
	public boolean method2393() {
		return this.field7530.method2435();
	}

	@ObfuscatedName("xm.m(Lra;I)V")
	public void method2406(RendererToolkit arg0) {
		this.field7530.method2440(arg0);
	}

	@ObfuscatedName("xm.t(Lra;I)V")
	public void method2412(RendererToolkit arg0) {
		this.field7530.method2441(arg0);
	}
}
