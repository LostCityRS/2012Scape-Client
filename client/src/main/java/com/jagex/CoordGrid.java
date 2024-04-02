package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pz")
public class CoordGrid {

	@ObfuscatedName("pz.u")
	public int field4837;

	@ObfuscatedName("pz.j")
	public int x;

	@ObfuscatedName("pz.a")
	public int z;

	public CoordGrid() {
		this.field4837 = -1;
	}

	public CoordGrid(int arg0, int arg1, int arg2) {
		this.field4837 = arg0;
		this.x = arg1;
		this.z = arg2;
	}

	public CoordGrid(int arg0) {
		if (arg0 == -1) {
			this.field4837 = -1;
		} else {
			this.field4837 = arg0 >> 28 & 0x3;
			this.x = arg0 >> 14 & 0x3FFF;
			this.z = arg0 & 0x3FFF;
		}
	}

	public String toString() {
		return this.field4837 + "," + (this.x >> 6) + "," + (this.z >> 6) + "," + (this.x & 0x3F) + "," + (this.z & 0x3F);
	}
}
