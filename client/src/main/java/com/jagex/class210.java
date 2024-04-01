package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gh")
public class class210 {

	@ObfuscatedName("gh.u")
	public final class334 field2320;

	@ObfuscatedName("gh.j")
	public final class334 field2318;

	@ObfuscatedName("gh.a")
	public class213 field2319;

	public class210(class334 arg0, class334 arg1) {
		this.field2320 = arg0;
		this.field2318 = arg1;
	}

	@ObfuscatedName("gh.u(Lij;B)Lgl;")
	public class214 method3973(class264 arg0) {
		if (arg0 == null) {
			return null;
		}
		class266 var2 = arg0.method4543();
		if (class266.field2623 == var2) {
			return new class212((class260) arg0);
		} else if (class266.field2626 == var2) {
			return new class207(this.method3974(), (class261) arg0);
		} else if (class266.field2624 == var2) {
			return new class206(this.field2320, (class269) arg0);
		} else if (class266.field2622 == var2) {
			return new class729(this.field2320, (class753) arg0);
		} else if (class266.field2620 == var2) {
			return new class730(this.field2320, this.field2318, (class752) arg0);
		} else if (class266.field2621 == var2) {
			return new class732(this.field2320, this.field2318, (class751) arg0);
		} else if (class266.field2625 == var2) {
			return new class731(this.field2320, this.field2318, (class750) arg0);
		} else if (class266.field2619 == var2) {
			return new class215(this.field2320, this.field2318, (class268) arg0);
		} else if (class266.field2627 == var2) {
			return new class211(this.field2320, (class267) arg0);
		} else if (class266.field2628 == var2) {
			return new class904(this.field2320, this.field2318, (class909) arg0);
		} else {
			return null;
		}
	}

	@ObfuscatedName("gh.j(I)Lgf;")
	public class213 method3974() {
		if (this.field2319 == null) {
			this.field2319 = new class213();
		}
		return this.field2319;
	}
}
