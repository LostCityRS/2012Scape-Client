package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("mf")
public class class357 {

	@ObfuscatedName("mf.u")
	public final int field3783;

	@ObfuscatedName("mf.j")
	public final int field3782;

	@ObfuscatedName("mf.a")
	public final int field3781;

	@ObfuscatedName("mf.s")
	public final int field3784;

	public class357() {
		this.field3783 = ((int) (Math.random() * 4.0D) + 32) * -1898123595;
		this.field3782 = ((int) (Math.random() * 2.0D) + 3) * -137277873;
		this.field3781 = ((int) (Math.random() * 3.0D) + 16) * -2102670891;
		if (Statics.field4961.field9659.method15686() == 1) {
			this.field3784 = (int) (Math.random() * 6.0D) * -1492335127;
		} else {
			this.field3784 = (int) (Math.random() * 12.0D) * -1492335127;
		}
	}

	public class357(int arg0, int arg1, int arg2, int arg3) {
		this.field3783 = arg0 * -1898123595;
		this.field3782 = arg1 * -137277873;
		this.field3781 = arg2 * -2102670891;
		this.field3784 = arg3 * -1492335127;
	}
}
