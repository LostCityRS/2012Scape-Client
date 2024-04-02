
import deob.ObfuscatedName;

@ObfuscatedName("wi")
public class class612 {

	@ObfuscatedName("wi.u")
	public final class527 field7279;

	@ObfuscatedName("wi.j")
	public final class519 field7284;

	@ObfuscatedName("wi.a")
	public boolean field7278;

	@ObfuscatedName("wi.s")
	public final class334 field7277;

	@ObfuscatedName("wi.c")
	public final class334 field7280;

	@ObfuscatedName("wi.m")
	public final class451 field7281 = new class451(64);

	@ObfuscatedName("wi.t")
	public final class451 field7285 = new class451(50);

	@ObfuscatedName("wi.l")
	public final class451 field7283 = new class451(5);

	@ObfuscatedName("wi.f")
	public int field7276;

	@ObfuscatedName("wi.d")
	public final String[] field7282;

	public class612(class527 arg0, class519 arg1, boolean arg2, class334 arg3, class334 arg4) {
		this.field7279 = arg0;
		this.field7284 = arg1;
		this.field7278 = arg2;
		this.field7277 = arg3;
		this.field7280 = arg4;
		if (this.field7277 != null) {
			int var6 = this.field7277.method5638() - 1;
			class161.field1682.method3071();
			this.field7277.method5637(var6);
		}
		if (class527.field6407 == this.field7279) {
			this.field7282 = new String[] { null, null, null, null, null, class588.field6874.method12206(this.field7284) };
		} else {
			this.field7282 = new String[] { null, null, null, null, null, null };
		}
	}

	@ObfuscatedName("wi.u(IB)Lwq;")
	public class611 method12565(int arg0) {
		class451 var2 = this.field7281;
		class611 var3;
		synchronized (this.field7281) {
			var3 = (class611) this.field7281.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field7277;
		byte[] var6;
		synchronized (this.field7277) {
			var6 = this.field7277.method5627(class161.field1682.method3073(arg0), class161.field1682.method3075(arg0));
		}
		class611 var8 = new class611();
		var8.field7211 = arg0;
		var8.field7210 = this;
		var8.field7227 = (String[]) this.field7282.clone();
		if (var6 != null) {
			var8.method12507(new class814(var6));
		}
		var8.method12509();
		class451 var9 = this.field7281;
		synchronized (this.field7281) {
			this.field7281.method7937(var8, (long) arg0);
			return var8;
		}
	}

	@ObfuscatedName("wi.j(ZS)V")
	public void method12561(boolean arg0) {
		if (this.field7278 != arg0) {
			this.field7278 = arg0;
			this.method12558();
		}
	}

	@ObfuscatedName("wi.a(II)V")
	public void method12557(int arg0) {
		this.field7276 = arg0;
		class451 var2 = this.field7285;
		synchronized (this.field7285) {
			this.field7285.method7922();
		}
		class451 var4 = this.field7283;
		synchronized (this.field7283) {
			this.field7283.method7922();
		}
	}

	@ObfuscatedName("wi.s(B)V")
	public void method12558() {
		class451 var1 = this.field7281;
		synchronized (this.field7281) {
			this.field7281.method7922();
		}
		class451 var3 = this.field7285;
		synchronized (this.field7285) {
			this.field7285.method7922();
		}
		class451 var5 = this.field7283;
		synchronized (this.field7283) {
			this.field7283.method7922();
		}
	}

	@ObfuscatedName("wi.c(S)V")
	public void method12559() {
		class451 var1 = this.field7285;
		synchronized (this.field7285) {
			this.field7285.method7922();
		}
		class451 var3 = this.field7283;
		synchronized (this.field7283) {
			this.field7283.method7922();
		}
	}

	@ObfuscatedName("wi.m(II)V")
	public void method12556(int arg0) {
		class451 var2 = this.field7281;
		synchronized (this.field7281) {
			this.field7281.method7921(arg0);
		}
		class451 var4 = this.field7285;
		synchronized (this.field7285) {
			this.field7285.method7921(arg0);
		}
		class451 var6 = this.field7283;
		synchronized (this.field7283) {
			this.field7283.method7921(arg0);
		}
	}

	@ObfuscatedName("wi.t(I)V")
	public void method12555() {
		class451 var1 = this.field7281;
		synchronized (this.field7281) {
			this.field7281.method7925();
		}
		class451 var3 = this.field7285;
		synchronized (this.field7285) {
			this.field7285.method7925();
		}
		class451 var5 = this.field7283;
		synchronized (this.field7283) {
			this.field7283.method7925();
		}
	}
}
