package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("oe")
public class class416 {

	@ObfuscatedName("oe.u")
	public class417 field4439;

	@ObfuscatedName("oe.a")
	public int field4446 = 1151703125;

	@ObfuscatedName("oe.s")
	public int field4442 = -291492885;

	@ObfuscatedName("oe.c")
	public int field4443 = 1252833311;

	@ObfuscatedName("oe.m")
	public int field4444 = -2107713427;

	@ObfuscatedName("oe.t")
	public int field4445 = 1957770366;

	@ObfuscatedName("oe.l")
	public int field4441 = 1977966525;

	@ObfuscatedName("oe.f")
	public int field4447 = -856282577;

	@ObfuscatedName("oe.d")
	public int field4448 = 1106947293;

	@ObfuscatedName("oe.z")
	public int field4449 = 1185283581;

	@ObfuscatedName("oe.u(Laet;S)V")
	public void method7302(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method7306(arg0, var2);
		}
	}

	@ObfuscatedName("oe.j(Laet;II)V")
	public void method7306(class814 arg0, int arg1) {
		if (arg1 == 1) {
			arg0.method15239();
		} else if (arg1 == 2) {
			this.field4446 = arg0.method15220() * 678236843;
		} else if (arg1 == 3) {
			this.field4442 = arg0.method15220() * 1514727701;
		} else if (arg1 == 4) {
			this.field4443 = 0;
		} else if (arg1 == 5) {
			this.field4445 = arg0.method15239() * -1567305419;
		} else if (arg1 == 6) {
			arg0.method15220();
		} else if (arg1 == 7) {
			this.field4441 = arg0.method15411() * -1977966525;
		} else if (arg1 == 8) {
			this.field4447 = arg0.method15411() * 856282577;
		} else if (arg1 == 9) {
			this.field4448 = arg0.method15411() * -1106947293;
		} else if (arg1 == 10) {
			this.field4449 = arg0.method15411() * -1185283581;
		} else if (arg1 == 11) {
			this.field4443 = arg0.method15239() * -1252833311;
		}
	}

	@ObfuscatedName("oe.a(Lra;I)Lce;")
	public class118 method7304(class14 arg0) {
		if (this.field4441 * 233221227 < 0) {
			return null;
		}
		class118 var2 = (class118) this.field4439.field4454.method7916((long) (this.field4441 * 233221227));
		if (var2 == null) {
			this.method7318(arg0);
			var2 = (class118) this.field4439.field4454.method7916((long) (this.field4441 * 233221227));
		}
		return var2;
	}

	@ObfuscatedName("oe.s(Lra;I)Lce;")
	public class118 method7305(class14 arg0) {
		if (this.field4447 * -1529175247 < 0) {
			return null;
		}
		class118 var2 = (class118) this.field4439.field4454.method7916((long) (this.field4447 * -1529175247));
		if (var2 == null) {
			this.method7318(arg0);
			var2 = (class118) this.field4439.field4454.method7916((long) (this.field4447 * -1529175247));
		}
		return var2;
	}

	@ObfuscatedName("oe.c(Lra;I)Lce;")
	public class118 method7301(class14 arg0) {
		if (this.field4448 * -3115893 < 0) {
			return this.method7304(arg0);
		}
		class118 var2 = (class118) this.field4439.field4454.method7916((long) (this.field4448 * -3115893));
		if (var2 == null) {
			this.method7318(arg0);
			var2 = (class118) this.field4439.field4454.method7916((long) (this.field4448 * -3115893));
		}
		return var2;
	}

	@ObfuscatedName("oe.m(Lra;I)Lce;")
	public class118 method7307(class14 arg0) {
		if (this.field4449 * 1255159979 < 0) {
			return this.method7305(arg0);
		}
		class118 var2 = (class118) this.field4439.field4454.method7916((long) (this.field4449 * 1255159979));
		if (var2 == null) {
			this.method7318(arg0);
			var2 = (class118) this.field4439.field4454.method7916((long) (this.field4449 * 1255159979));
		}
		return var2;
	}

	@ObfuscatedName("oe.t(Lra;B)V")
	public void method7318(class14 arg0) {
		class334 var2 = this.field4439.field4451;
		if (this.field4441 * 233221227 >= 0 && this.field4439.field4454.method7916((long) (this.field4441 * 233221227)) == null && var2.method5630(this.field4441 * 233221227)) {
			class140 var3 = class125.method2598(var2, this.field4441 * 233221227);
			this.field4439.field4454.method7937(arg0.method517(var3, true), (long) (this.field4441 * 233221227));
		}
		if (this.field4447 * -1529175247 >= 0 && this.field4439.field4454.method7916((long) (this.field4447 * -1529175247)) == null && var2.method5630(this.field4447 * -1529175247)) {
			class140 var4 = class125.method2598(var2, this.field4447 * -1529175247);
			this.field4439.field4454.method7937(arg0.method517(var4, true), (long) (this.field4447 * -1529175247));
		}
		if (this.field4448 * -3115893 >= 0 && this.field4439.field4454.method7916((long) (this.field4448 * -3115893)) == null && var2.method5630(this.field4448 * -3115893)) {
			class140 var5 = class125.method2598(var2, this.field4448 * -3115893);
			this.field4439.field4454.method7937(arg0.method517(var5, true), (long) (this.field4448 * -3115893));
		}
		if (this.field4449 * 1255159979 >= 0 && this.field4439.field4454.method7916((long) (this.field4449 * 1255159979)) == null && var2.method5630(this.field4449 * 1255159979)) {
			class140 var6 = class125.method2598(var2, this.field4449 * 1255159979);
			this.field4439.field4454.method7937(arg0.method517(var6, true), (long) (this.field4449 * 1255159979));
		}
	}
}
