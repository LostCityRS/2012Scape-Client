
import deob.ObfuscatedName;

@ObfuscatedName("akv")
public abstract class WallDecorLayerEntity extends GraphEntity {

	@ObfuscatedName("akv.b")
	public short field10496;

	@ObfuscatedName("akv.x")
	public short field10497;

	public WallDecorLayerEntity(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		super(arg0);
		this.field9807 = (byte) arg4;
		this.field9809 = (byte) arg5;
		this.field10496 = (short) arg6;
		this.field10497 = (short) arg7;
		this.method8551(new Vector3((float) arg1, (float) arg2, (float) arg3));
	}

	@ObfuscatedName("akv.fu([Lacg;I)I")
	public int method15639(Light[] arg0) {
		Vector3 var2 = this.method8565().field3464;
		return this.method15637((int) var2.field3475 >> this.field9808.field4510, (int) var2.field3477 >> this.field9808.field4510, arg0);
	}

	@ObfuscatedName("akv.fh(Lra;I)Z")
	public boolean method15634(RendererToolkit arg0) {
		Vector3 var2 = this.method8565().field3464;
		return this.field9808.field4493.method7590(this.field9809, (int) var2.field3475 >> this.field9808.field4510, (int) var2.field3477 >> this.field9808.field4510, this.method12809());
	}

	@ObfuscatedName("akv.fz(I)Z")
	public boolean method15635() {
		Vector3 var1 = this.method8565().field3464;
		return this.field9808.field4544[this.field9808.field4531 + (((int) var1.field3475 >> this.field9808.field4510) - this.field9808.field4521)][this.field9808.field4531 + (((int) var1.field3477 >> this.field9808.field4510) - this.field9808.field4503)];
	}

	@ObfuscatedName("akv.be(I)Z")
	public final boolean method12815() {
		return false;
	}

	@ObfuscatedName("akv.bw(Lra;Laes;IIIZI)V")
	public final void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("akv.bo(B)V")
	public final void method12817() {
		throw new IllegalStateException();
	}
}
