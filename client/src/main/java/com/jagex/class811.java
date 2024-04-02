package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adb")
public class class811 extends class399 {

	@ObfuscatedName("adb.s")
	public final class119 field9600;

	@ObfuscatedName("adb.c")
	public final class274 field9602;

	@ObfuscatedName("adb.m")
	public int field9601;

	@ObfuscatedName("adb.t")
	public int field9603;

	@ObfuscatedName("adb.l")
	public int field9599;

	@ObfuscatedName("adb.f")
	public float field9604;

	@ObfuscatedName("adb.d")
	public float field9605;

	@ObfuscatedName("adb.z")
	public static float[] field9606 = new float[3];

	public class811(class119 arg0, class467 arg1) {
		this.field9600 = arg0;
		this.field9602 = this.field9600.method2534();
		this.method15214();
	}

	@ObfuscatedName("adb.u(I)V")
	public void method15214() {
		this.field9601 = this.field9600.field1240;
		this.field9603 = this.field9600.field1241;
		this.field9599 = this.field9600.field1242;
		if (this.field9600.field1237 != null) {
			this.field9600.field1237.method5392((float) this.field9602.field2754, (float) this.field9602.field2763, (float) this.field9602.field2765, field9606);
		}
		this.field9604 = field9606[0];
		this.field9605 = field9606[2];
	}
}
