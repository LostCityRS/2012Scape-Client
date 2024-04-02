
import deob.ObfuscatedName;

@ObfuscatedName("dc")
public class ModelBillboard {

	@ObfuscatedName("dc.u")
	public final int field1512;

	@ObfuscatedName("dc.j")
	public final int field1513;

	@ObfuscatedName("dc.a")
	public final int field1511;

	@ObfuscatedName("dc.s")
	public final int field1514;

	public ModelBillboard(int arg0, int arg1, int arg2, int arg3) {
		this.field1512 = arg0;
		this.field1513 = arg1;
		this.field1511 = arg2;
		this.field1514 = arg3;
	}

	@ObfuscatedName("dc.u(IS)Ldc;")
	public ModelBillboard method2784(int arg0) {
		return new ModelBillboard(this.field1512, arg0, this.field1511, this.field1514);
	}
}
