
import deob.ObfuscatedName;

@ObfuscatedName("tz")
public class class541 {

	@ObfuscatedName("tz.u")
	public final class527 field6557;

	@ObfuscatedName("tz.j")
	public final class519 field6552;

	@ObfuscatedName("tz.a")
	public boolean field6553;

	@ObfuscatedName("tz.s")
	public final class334 field6554;

	@ObfuscatedName("tz.c")
	public final class334 field6555;

	@ObfuscatedName("tz.t")
	public class451 field6561 = new class451(256);

	@ObfuscatedName("tz.l")
	public final class451 field6558 = new class451(500);

	@ObfuscatedName("tz.f")
	public final class451 field6559 = new class451(30);

	@ObfuscatedName("tz.d")
	public final class451 field6560 = new class451(50);

	@ObfuscatedName("tz.z")
	public int field6551;

	@ObfuscatedName("tz.n")
	public final String[] field6563;

	@ObfuscatedName("tz.o")
	public class129[] field6562 = new class129[4];

	@ObfuscatedName("tz.q")
	public class570 field6564 = new class570(null, null);

	public class541(class527 arg0, class519 arg1, boolean arg2, class334 arg3, class334 arg4) {
		this.field6557 = arg0;
		this.field6552 = arg1;
		this.field6553 = arg2;
		this.field6554 = arg3;
		this.field6555 = arg4;
		if (this.field6554 != null) {
			int var6 = this.field6554.method5638() - 1;
			class161.field1631.method3071();
			this.field6554.method5637(var6);
		}
		if (class527.field6407 == this.field6557) {
			this.field6563 = new String[] { null, null, null, null, null, class588.field6874.method12206(this.field6552) };
		} else {
			this.field6563 = new String[] { null, null, null, null, null, null };
		}
	}

	@ObfuscatedName("tz.u(II)Ltg;")
	public class540 method11471(int arg0) {
		class451 var2 = this.field6561;
		class540 var3;
		synchronized (this.field6561) {
			var3 = (class540) this.field6561.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field6554;
		byte[] var6;
		synchronized (this.field6554) {
			var6 = this.field6554.method5627(class161.field1631.method3073(arg0), class161.field1631.method3075(arg0));
		}
		class540 var8 = new class540();
		var8.field6474 = arg0;
		var8.field6473 = this;
		var8.field6505 = (String[]) this.field6563.clone();
		if (var6 != null) {
			var8.method11408(new class814(var6));
		}
		var8.method11410();
		if (var8.field6481) {
			var8.field6491 = 0;
			var8.field6492 = false;
		}
		if (!this.field6553 && var8.field6542) {
			var8.field6505 = null;
			var8.field6545 = null;
		}
		class451 var9 = this.field6561;
		synchronized (this.field6561) {
			this.field6561.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("tz.j(ZB)V")
	public void method11472(boolean arg0) {
		if (this.field6553 != arg0) {
			this.field6553 = arg0;
			this.method11479();
		}
	}

	@ObfuscatedName("tz.a(II)V")
	public void method11473(int arg0) {
		this.field6551 = arg0;
		class451 var2 = this.field6558;
		synchronized (this.field6558) {
			this.field6558.method7922();
		}
		class451 var4 = this.field6559;
		synchronized (this.field6559) {
			this.field6559.method7922();
		}
		class451 var6 = this.field6560;
		synchronized (this.field6560) {
			this.field6560.method7922();
		}
	}

	@ObfuscatedName("tz.s(II)V")
	public void method11474(int arg0) {
		this.field6561 = new class451(arg0);
	}

	@ObfuscatedName("tz.c(I)V")
	public void method11479() {
		class451 var1 = this.field6561;
		synchronized (this.field6561) {
			this.field6561.method7922();
		}
		class451 var3 = this.field6558;
		synchronized (this.field6558) {
			this.field6558.method7922();
		}
		class451 var5 = this.field6559;
		synchronized (this.field6559) {
			this.field6559.method7922();
		}
		class451 var7 = this.field6560;
		synchronized (this.field6560) {
			this.field6560.method7922();
		}
		this.field6562 = new class129[4];
		this.field6564 = new class570(null, null);
	}

	@ObfuscatedName("tz.m(IB)V")
	public void method11487(int arg0) {
		class451 var2 = this.field6561;
		synchronized (this.field6561) {
			this.field6561.method7921(arg0);
		}
		class451 var4 = this.field6558;
		synchronized (this.field6558) {
			this.field6558.method7921(arg0);
		}
		class451 var6 = this.field6559;
		synchronized (this.field6559) {
			this.field6559.method7921(arg0);
		}
		class451 var8 = this.field6560;
		synchronized (this.field6560) {
			this.field6560.method7921(arg0);
		}
	}

	@ObfuscatedName("tz.t(I)V")
	public void method11477() {
		class451 var1 = this.field6561;
		synchronized (this.field6561) {
			this.field6561.method7925();
		}
		class451 var3 = this.field6558;
		synchronized (this.field6558) {
			this.field6558.method7925();
		}
		class451 var5 = this.field6559;
		synchronized (this.field6559) {
			this.field6559.method7925();
		}
		class451 var7 = this.field6560;
		synchronized (this.field6560) {
			this.field6560.method7925();
		}
	}
}
