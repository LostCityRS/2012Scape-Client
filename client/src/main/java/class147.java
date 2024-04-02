
import deob.ObfuscatedName;

@ObfuscatedName("df")
public class class147 {

	@ObfuscatedName("df.u")
	public final int field1552;

	@ObfuscatedName("df.j")
	public final class542 field1551;

	@ObfuscatedName("df.a")
	public int field1553;

	@ObfuscatedName("df.s")
	public int field1554;

	@ObfuscatedName("df.c")
	public int field1555;

	@ObfuscatedName("df.m")
	public int field1556;

	public class147(class814 arg0) {
		this.field1552 = arg0.method15411();
		this.field1551 = (class542) class518.method8032(class542.method6247(), arg0.method15220());
	}

	@ObfuscatedName("df.u(IIIIB)V")
	public void method2835(int arg0, int arg1, int arg2, int arg3) {
		class770.method13876(arg0, arg1, arg2, this.field1551.field6582, this.field1552, this.field1551.field6590, arg3);
		this.field1553 = arg0;
		this.field1554 = arg1;
		this.field1555 = arg2;
		this.field1556 = arg3;
	}

	@ObfuscatedName("df.j(I)V")
	public void method2830() {
		class770.method13876(this.field1553, this.field1554, this.field1555, this.field1551.field6582, -1, this.field1551.field6590, this.field1556);
	}

	@ObfuscatedName("df.a(I)Z")
	public boolean method2831() {
		if (this.field1552 < 0) {
			return true;
		}
		class540 var1 = Statics.field10355.method11471(this.field1552);
		boolean var2 = var1.method11411(this.field1551.field6590);
		int[] var3 = var1.method11422();
		if (var3 != null) {
			int[] var4 = var3;
			for (int var5 = 0; var5 < var4.length; var5++) {
				int var6 = var4[var5];
				var2 &= Statics.field566.method11144(var6).method11129();
			}
		}
		return var2;
	}
}
