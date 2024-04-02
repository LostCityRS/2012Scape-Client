package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pz")
public class class453 {

	@ObfuscatedName("pz.u")
	public int field4837;

	@ObfuscatedName("pz.j")
	public int field4836;

	@ObfuscatedName("pz.a")
	public int field4838;

	public class453() {
		this.field4837 = -302102445;
	}

	public class453(int arg0, int arg1, int arg2) {
		this.field4837 = arg0 * 302102445;
		this.field4836 = arg1 * -1432496707;
		this.field4838 = arg2 * -52805541;
	}

	public class453(int arg0) {
		if (arg0 == -1) {
			this.field4837 = -302102445;
		} else {
			this.field4837 = (arg0 >> 28 & 0x3) * 302102445;
			this.field4836 = (arg0 >> 14 & 0x3FFF) * -1432496707;
			this.field4838 = (arg0 & 0x3FFF) * -52805541;
		}
	}

	public String toString() {
		return this.field4837 * -1918843867 + "," + (this.field4836 * 401083797 >> 6) + "," + (this.field4838 * -526848045 >> 6) + "," + (this.field4836 * 401083797 & 0x3F) + "," + (this.field4838 * -526848045 & 0x3F);
	}
}
