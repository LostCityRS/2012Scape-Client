
import deob.ObfuscatedName;

@ObfuscatedName("ph")
public class class444 {

	@ObfuscatedName("ph.u")
	public final class334 field4809;

	@ObfuscatedName("ph.j")
	public final class334 field4806;

	@ObfuscatedName("ph.c")
	public class451 field4808 = new class451(128);

	@ObfuscatedName("ph.m")
	public class451 field4810 = new class451(64);

	public class444(class527 arg0, class519 arg1, class334 arg2, class334 arg3) {
		this.field4809 = arg2;
		this.field4806 = arg3;
		this.field4809.method5637(class161.field1661.field1668);
	}

	@ObfuscatedName("ph.u(II)Lpw;")
	public class443 method7862(int arg0) {
		class451 var2 = this.field4808;
		class443 var3;
		synchronized (this.field4808) {
			var3 = (class443) this.field4808.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field4809;
		byte[] var6;
		synchronized (this.field4809) {
			var6 = this.field4809.method5627(class161.field1661.field1668, arg0);
		}
		class443 var8 = new class443();
		var8.field4763 = arg0;
		var8.field4798 = this;
		if (var6 != null) {
			var8.method7836(new class814(var6));
		}
		var8.method7853();
		class451 var9 = this.field4808;
		synchronized (this.field4808) {
			this.field4808.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("ph.j(III)V")
	public void method7876(int arg0, int arg1) {
		this.field4808 = new class451(arg0);
		this.field4810 = new class451(arg1);
	}

	@ObfuscatedName("ph.a(I)V")
	public void method7864() {
		class451 var1 = this.field4808;
		synchronized (this.field4808) {
			this.field4808.method7922();
		}
		class451 var3 = this.field4810;
		synchronized (this.field4810) {
			this.field4810.method7922();
		}
	}

	@ObfuscatedName("ph.s(IS)V")
	public void method7865(int arg0) {
		class451 var2 = this.field4808;
		synchronized (this.field4808) {
			this.field4808.method7921(arg0);
		}
		class451 var4 = this.field4810;
		synchronized (this.field4810) {
			this.field4810.method7921(arg0);
		}
	}

	@ObfuscatedName("ph.c(I)V")
	public void method7866() {
		class451 var1 = this.field4808;
		synchronized (this.field4808) {
			this.field4808.method7925();
		}
		class451 var3 = this.field4810;
		synchronized (this.field4810) {
			this.field4810.method7925();
		}
	}
}
