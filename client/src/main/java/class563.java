
import deob.ObfuscatedName;

@ObfuscatedName("ux")
public class class563 {

	@ObfuscatedName("ux.u")
	public final class334 field6710;

	@ObfuscatedName("ux.j")
	public final class451 field6711 = new class451(128);

	public class563(class527 arg0, class519 arg1, class334 arg2) {
		this.field6710 = arg2;
		this.field6710.method5637(class161.field1640.field1668);
	}

	@ObfuscatedName("ux.u(IB)Luc;")
	public class564 method11895(int arg0) {
		class451 var2 = this.field6711;
		class564 var3;
		synchronized (this.field6711) {
			var3 = (class564) this.field6711.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field6710;
		byte[] var6;
		synchronized (this.field6710) {
			var6 = this.field6710.method5627(class161.field1640.field1668, arg0);
		}
		class564 var8 = new class564();
		if (var6 != null) {
			var8.method11909(new class814(var6));
		}
		class451 var9 = this.field6711;
		synchronized (this.field6711) {
			this.field6711.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("ux.j(I)V")
	public void method11894() {
		class451 var1 = this.field6711;
		synchronized (this.field6711) {
			this.field6711.method7922();
		}
	}

	@ObfuscatedName("ux.a(IB)V")
	public void method11896(int arg0) {
		class451 var2 = this.field6711;
		synchronized (this.field6711) {
			this.field6711.method7921(arg0);
		}
	}

	@ObfuscatedName("ux.s(B)V")
	public void method11899() {
		class451 var1 = this.field6711;
		synchronized (this.field6711) {
			this.field6711.method7925();
		}
	}
}
