
import deob.ObfuscatedName;

@ObfuscatedName("lo")
public abstract class class337 {

	@ObfuscatedName("lo.c")
	public class552 field3594 = new class552();

	@ObfuscatedName("lo.m")
	public class552 field3595 = new class552();

	@ObfuscatedName("lo.t")
	public class552 field3605 = new class552();

	@ObfuscatedName("lo.l")
	public class552 field3596 = new class552();

	@ObfuscatedName("lo.f")
	public int field3598;

	@ObfuscatedName("lo.d")
	public long field3599;

	@ObfuscatedName("lo.z")
	public class814 field3597 = new class814(6);

	@ObfuscatedName("lo.n")
	public byte field3601 = 0;

	@ObfuscatedName("lo.o")
	public volatile int field3602 = 0;

	@ObfuscatedName("lo.q")
	public volatile int field3591 = 0;

	@ObfuscatedName("lo.p")
	public class814 field3590 = new class814(10);

	@ObfuscatedName("lo.w")
	public class1003 field3592;

	@ObfuscatedName("lo.u(IIBZB)Lalp;")
	public class1003 method5765(int arg0, int arg1, byte arg2, boolean arg3) {
		long var5 = ((long) arg0 << 32) + (long) arg1;
		class1003 var7 = new class1003();
		var7.field9554 = var5;
		var7.field10598 = arg2;
		var7.field10354 = arg3;
		if (arg3) {
			if (this.method5764() >= 50) {
				throw new RuntimeException();
			}
			this.field3594.method11728(var7);
		} else if (this.method5739() < 20) {
			this.field3605.method11728(var7);
		} else {
			throw new RuntimeException();
		}
		return var7;
	}

	@ObfuscatedName("lo.j(I)Z")
	public boolean method5737() {
		return this.method5739() >= 20;
	}

	@ObfuscatedName("lo.a(I)Z")
	public boolean method5738() {
		return this.method5764() >= 50;
	}

	@ObfuscatedName("lo.s(B)I")
	public int method5739() {
		return this.field3605.method11732() + this.field3596.method11732();
	}

	@ObfuscatedName("lo.c(B)I")
	public int method5764() {
		return this.field3594.method11732() + this.field3595.method11732();
	}

	@ObfuscatedName("lo.m(I)V")
	public abstract void method5741();

	@ObfuscatedName("lo.t(I)Z")
	public abstract boolean method5742();

	@ObfuscatedName("lo.l(Ljava/lang/Object;ZI)V")
	public abstract void method5743(Object arg0, boolean arg1);

	@ObfuscatedName("lo.f(ZB)V")
	public abstract void method5744(boolean arg0);

	@ObfuscatedName("lo.d(B)V")
	public abstract void method5745();

	@ObfuscatedName("lo.n(B)V")
	public abstract void method5747();

	@ObfuscatedName("lo.z(I)V")
	public abstract void method5777();
}
