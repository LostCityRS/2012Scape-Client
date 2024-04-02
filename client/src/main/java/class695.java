
import deob.ObfuscatedName;

@ObfuscatedName("zt")
public class class695 extends CutsceneAction {

	@ObfuscatedName("zt.j")
	public final int field8467;

	@ObfuscatedName("zt.a")
	public final int field8468;

	public class695(Packet arg0) {
		super(arg0);
		this.field8467 = arg0.method15239();
		this.field8468 = arg0.method15411();
	}

	@ObfuscatedName("zt.j(I)V")
	public void method2873() {
		class147 var1 = Statics.field1528[this.field8467];
		client.method3302(var1.field1553, var1.field1554, var1.field1555, var1.field1551.field6582, var1.field1551.field6590, var1.field1556, this.field8468);
	}

	@ObfuscatedName("zt.s(B)Z")
	public boolean method2883() {
		SeqType var1 = Statics.field566.method11144(this.field8468);
		return var1.method11129();
	}
}
