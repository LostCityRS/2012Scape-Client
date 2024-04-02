
import deob.ObfuscatedName;

@ObfuscatedName("vp")
public class class606 {

	@ObfuscatedName("vp.u")
	public final class334 field7185;

	@ObfuscatedName("vp.j")
	public final class451 field7186 = new class451(64);

	public class606(class527 arg0, class519 arg1, class334 arg2) {
		this.field7185 = arg2;
		this.field7185.method5637(class161.field1634.field1668);
	}

	@ObfuscatedName("vp.u(II)Lvy;")
	public class607 method12453(int arg0) {
		class451 var2 = this.field7186;
		class607 var3;
		synchronized (this.field7186) {
			var3 = (class607) this.field7186.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field7185;
		byte[] var6;
		synchronized (this.field7185) {
			var6 = this.field7185.method5627(class161.field1634.field1668, arg0);
		}
		class607 var8 = new class607();
		if (var6 != null) {
			var8.method12467(new class814(var6));
		}
		class451 var9 = this.field7186;
		synchronized (this.field7186) {
			this.field7186.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("vp.j(I)V")
	public void method12464() {
		class451 var1 = this.field7186;
		synchronized (this.field7186) {
			this.field7186.method7922();
		}
	}

	@ObfuscatedName("vp.a(II)V")
	public void method12455(int arg0) {
		class451 var2 = this.field7186;
		synchronized (this.field7186) {
			this.field7186.method7921(arg0);
		}
	}

	@ObfuscatedName("vp.s(B)V")
	public void method12456() {
		class451 var1 = this.field7186;
		synchronized (this.field7186) {
			this.field7186.method7925();
		}
	}
}
