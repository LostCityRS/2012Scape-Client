
import deob.ObfuscatedName;

@ObfuscatedName("wp")
public class class614 {

	@ObfuscatedName("wp.u")
	public final class334 field7291;

	@ObfuscatedName("wp.j")
	public final class451 field7292 = new class451(64);

	public class614(class527 arg0, class519 arg1, class334 arg2) {
		this.field7291 = arg2;
		if (this.field7291 != null) {
			this.field7291.method5637(class161.field1636.field1668);
		}
	}

	@ObfuscatedName("wp.u(IB)Lwv;")
	public class613 method12600(int arg0) {
		class451 var2 = this.field7292;
		class613 var3;
		synchronized (this.field7292) {
			var3 = (class613) this.field7292.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field7291;
		byte[] var6;
		synchronized (this.field7291) {
			var6 = this.field7291.method5627(class161.field1636.field1668, arg0);
		}
		class613 var8 = new class613();
		if (var6 != null) {
			var8.method12580(new Packet(var6));
		}
		class451 var9 = this.field7292;
		synchronized (this.field7292) {
			this.field7292.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("wp.j(B)V")
	public void method12595() {
		class451 var1 = this.field7292;
		synchronized (this.field7292) {
			this.field7292.method7922();
		}
	}

	@ObfuscatedName("wp.a(II)V")
	public void method12596(int arg0) {
		class451 var2 = this.field7292;
		synchronized (this.field7292) {
			this.field7292.method7921(arg0);
		}
	}

	@ObfuscatedName("wp.s(B)V")
	public void method12597() {
		class451 var1 = this.field7292;
		synchronized (this.field7292) {
			this.field7292.method7925();
		}
	}
}
