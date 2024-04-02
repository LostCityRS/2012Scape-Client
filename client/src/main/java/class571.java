
import deob.ObfuscatedName;

@ObfuscatedName("ui")
public class class571 {

	@ObfuscatedName("ui.u")
	public final class334 field6759;

	@ObfuscatedName("ui.j")
	public final class451 field6758 = new class451(64);

	public class571(class527 arg0, class519 arg1, class334 arg2) {
		this.field6759 = arg2;
		if (this.field6759 != null) {
			this.field6759.method5637(class161.field1649.field1668);
		}
	}

	@ObfuscatedName("ui.u(IB)Luh;")
	public class572 method12004(int arg0) {
		class451 var2 = this.field6758;
		class572 var3;
		synchronized (this.field6758) {
			var3 = (class572) this.field6758.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		byte[] var5 = this.field6759.method5627(class161.field1649.field1668, arg0);
		class572 var6 = new class572();
		if (var5 != null) {
			var6.method12016(new class814(var5));
		}
		class451 var7 = this.field6758;
		synchronized (this.field6758) {
			this.field6758.method7937(var6, (long) arg0);
			return var6;
		}
	}

	@ObfuscatedName("ui.j(B)V")
	public void method12005() {
		class451 var1 = this.field6758;
		synchronized (this.field6758) {
			this.field6758.method7922();
		}
	}

	@ObfuscatedName("ui.a(II)V")
	public void method12006(int arg0) {
		class451 var2 = this.field6758;
		synchronized (this.field6758) {
			this.field6758.method7921(arg0);
		}
	}

	@ObfuscatedName("ui.s(B)V")
	public void method12010() {
		class451 var1 = this.field6758;
		synchronized (this.field6758) {
			this.field6758.method7925();
		}
	}
}
