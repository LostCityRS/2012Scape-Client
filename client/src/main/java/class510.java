
import deob.ObfuscatedName;

@ObfuscatedName("st")
public class class510 {

	@ObfuscatedName("st.u")
	public final class334 field6342;

	@ObfuscatedName("st.j")
	public final class451 field6341 = new class451(64);

	@ObfuscatedName("st.a")
	public final class451 field6340 = new class451(100);

	public class510(class527 arg0, class519 arg1, class334 arg2, class334 arg3, class334 arg4) {
		this.field6342 = arg2;
		if (this.field6342 != null) {
			int var6 = this.field6342.method5638() - 1;
			class161.field1637.method3071();
			this.field6342.method5637(var6);
		}
		class947.method16191(arg3, arg4, 2);
	}

	@ObfuscatedName("st.u(II)Lso;")
	public class509 method11144(int arg0) {
		class451 var2 = this.field6341;
		class509 var3;
		synchronized (this.field6341) {
			var3 = (class509) this.field6341.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field6342;
		byte[] var6;
		synchronized (this.field6342) {
			var6 = this.field6342.method5627(class161.field1637.method3073(arg0), class161.field1637.method3075(arg0));
		}
		class509 var8 = new class509();
		var8.field6318 = arg0;
		var8.field6317 = this;
		if (var6 != null) {
			var8.method11122(new Packet(var6));
		}
		var8.method11124();
		class451 var9 = this.field6341;
		synchronized (this.field6341) {
			this.field6341.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("st.j(II)Laje;")
	public class947 method11146(int arg0) {
		class451 var2 = this.field6340;
		synchronized (this.field6340) {
			class947 var3 = (class947) this.field6340.method7916((long) arg0);
			if (var3 == null) {
				var3 = new class947(arg0);
				this.field6340.method7937(var3, (long) arg0);
			}
			return var3.method16652() ? var3 : null;
		}
	}

	@ObfuscatedName("st.a(I)V")
	public void method11143() {
		class451 var1 = this.field6341;
		synchronized (this.field6341) {
			this.field6341.method7922();
		}
		class451 var3 = this.field6340;
		synchronized (this.field6340) {
			this.field6340.method7922();
		}
	}

	@ObfuscatedName("st.s(II)V")
	public void method11147(int arg0) {
		class451 var2 = this.field6341;
		synchronized (this.field6341) {
			this.field6341.method7921(arg0);
		}
		class451 var4 = this.field6340;
		synchronized (this.field6340) {
			this.field6340.method7921(arg0);
		}
	}

	@ObfuscatedName("st.c(I)V")
	public void method11148() {
		class451 var1 = this.field6341;
		synchronized (this.field6341) {
			this.field6341.method7925();
		}
		class451 var3 = this.field6340;
		synchronized (this.field6340) {
			this.field6340.method7925();
		}
	}
}
