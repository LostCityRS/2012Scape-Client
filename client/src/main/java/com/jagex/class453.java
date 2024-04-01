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
		this.field4837 = -1;
	}

	public class453(int arg0, int arg1, int arg2) {
		this.field4837 = arg0;
		this.field4836 = arg1;
		this.field4838 = arg2;
	}

	public class453(int arg0) {
		if (arg0 == -1) {
			this.field4837 = -1;
		} else {
			this.field4837 = arg0 >> 28 & 0x3;
			this.field4836 = arg0 >> 14 & 0x3FFF;
			this.field4838 = arg0 & 0x3FFF;
		}
	}

	public String toString() {
		return this.field4837 + "," + (this.field4836 >> 6) + "," + (this.field4838 >> 6) + "," + (this.field4836 & 0x3F) + "," + (this.field4838 & 0x3F);
	}
}
