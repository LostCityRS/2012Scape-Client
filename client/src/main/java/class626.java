
import deob.ObfuscatedName;

@ObfuscatedName("wz")
public class class626 {

	@ObfuscatedName("wz.u")
	public final class334 field7344;

	@ObfuscatedName("wz.j")
	public int field7345;

	@ObfuscatedName("wz.a")
	public class451 field7346 = new class451(64);

	public class626(class527 arg0, class519 arg1, class334 arg2) {
		this.field7344 = arg2;
		if (this.field7344 == null) {
			this.field7345 = 0;
		} else {
			this.field7345 = this.field7344.method5637(class161.field1672.field1668);
		}
	}

	@ObfuscatedName("wz.u(IB)Lwe;")
	public class627 method12669(int arg0) {
		class451 var2 = this.field7346;
		class627 var3;
		synchronized (this.field7346) {
			var3 = (class627) this.field7346.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field7344;
		byte[] var6;
		synchronized (this.field7344) {
			var6 = this.field7344.method5627(class161.field1672.field1668, arg0);
		}
		class627 var8 = new class627();
		if (var6 != null) {
			var8.method12682(new Packet(var6));
		}
		class451 var9 = this.field7346;
		synchronized (this.field7346) {
			this.field7346.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("wz.j(I)V")
	public void method12671() {
		class451 var1 = this.field7346;
		synchronized (this.field7346) {
			this.field7346.method7922();
		}
	}

	@ObfuscatedName("wz.a(II)V")
	public void method12674(int arg0) {
		class451 var2 = this.field7346;
		synchronized (this.field7346) {
			this.field7346.method7921(arg0);
		}
	}

	@ObfuscatedName("wz.s(B)V")
	public void method12672() {
		class451 var1 = this.field7346;
		synchronized (this.field7346) {
			this.field7346.method7925();
		}
	}
}
