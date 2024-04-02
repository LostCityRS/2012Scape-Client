
import deob.ObfuscatedName;

@ObfuscatedName("pd")
public class class432 implements class463 {

	@ObfuscatedName("pd.j")
	public final class334 field4664;

	@ObfuscatedName("pd.a")
	public class451 field4665 = new class451(64);

	public class432(class527 arg0, class519 arg1, class334 arg2) {
		this.field4664 = arg2;
		if (this.field4664 != null) {
			int var4 = this.field4664.method5638() - 1;
			class161.field1626.method3071();
			this.field4664.method5637(var4);
		}
	}

	@ObfuscatedName("pd.u(II)Lpe;")
	public class433 method7668(int arg0) {
		class451 var2 = this.field4665;
		class433 var3;
		synchronized (this.field4665) {
			var3 = (class433) this.field4665.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field4664;
		byte[] var6;
		synchronized (this.field4664) {
			var6 = this.field4664.method5627(class161.field1626.method3073(arg0), class161.field1626.method3075(arg0));
		}
		class433 var8 = new class433();
		if (var6 != null) {
			var8.method7682(new class814(var6));
		}
		class451 var9 = this.field4665;
		synchronized (this.field4665) {
			this.field4665.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("pd.j(I)V")
	public void method7660() {
		class451 var1 = this.field4665;
		synchronized (this.field4665) {
			this.field4665.method7922();
		}
	}

	@ObfuscatedName("pd.a(II)V")
	public void method7661(int arg0) {
		class451 var2 = this.field4665;
		synchronized (this.field4665) {
			this.field4665.method7921(arg0);
		}
	}

	@ObfuscatedName("pd.s(B)V")
	public void method7662() {
		class451 var1 = this.field4665;
		synchronized (this.field4665) {
			this.field4665.method7925();
		}
	}

	@ObfuscatedName("pd.c(II)V")
	public void method7658(int arg0) {
		class451 var2 = this.field4665;
		synchronized (this.field4665) {
			this.field4665.method7922();
			this.field4665 = new class451(arg0);
		}
	}
}
