
import deob.ObfuscatedName;

@ObfuscatedName("ch")
public final class class114 {

	@ObfuscatedName("ch.u")
	public class565 field1199;

	@ObfuscatedName("ch.j")
	public final int field1200;

	public class114(int arg0) {
		this.field1200 = arg0;
	}

	@ObfuscatedName("ch.u(I)V")
	public void method2420() {
		if (this.field1199 != null) {
			this.field1199.method11925();
		}
	}

	@ObfuscatedName("ch.j(III)V")
	public void method2418(int arg0, int arg1) {
		if (this.field1199 == null) {
			this.field1199 = new class565(this.field1200);
		}
		class802 var3 = (class802) this.field1199.method11923((long) arg0);
		if (var3 == null) {
			class802 var4 = new class802(arg1);
			this.field1199.method11927(var4, (long) arg0);
		} else {
			var3.field9556 = arg1;
		}
	}

	@ObfuscatedName("ch.a(II)I")
	public int method2416(int arg0) {
		class802 var2 = (class802) this.field1199.method11923((long) arg0);
		if (var2 == null) {
			class572 var3 = Statics.field1510.method12004(arg0);
			return var3.field6760 == 'i' ? 0 : -1;
		} else {
			return var2.field9556;
		}
	}

	@ObfuscatedName("ch.s(II)I")
	public int method2417(int arg0) {
		class528 var2 = Statics.field7196.method11311(arg0);
		int var3 = var2.field6409;
		int var4 = var2.field6411 == 31 ? -1 : (0x1 << var2.field6411 + 1) - 1;
		return (this.method2416(var3) & var4) >>> var2.field6410;
	}
}
