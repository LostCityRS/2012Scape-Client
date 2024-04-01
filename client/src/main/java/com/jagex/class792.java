package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ada")
public class class792 extends class399 {

	@ObfuscatedName("ada.s")
	public class280 field9469;

	@ObfuscatedName("ada.c")
	public int field9466;

	@ObfuscatedName("ada.m")
	public PacketBit field9467;

	@ObfuscatedName("ada.t")
	public int field9465;

	@ObfuscatedName("ada.l")
	public static class792[] field9470 = new class792[300];

	@ObfuscatedName("ada.f")
	public static int field9468 = 0;

	@ObfuscatedName("ty.u(I)Lada;")
	public static class792 method11377() {
		return field9468 == 0 ? new class792() : field9470[--field9468];
	}

	@ObfuscatedName("acx.j(Ljm;Lue;I)Lada;")
	public static class792 method14781(class280 arg0, Isaac arg1) {
		class792 var2 = method11377();
		var2.field9469 = arg0;
		var2.field9466 = arg0.field2896;
		if (var2.field9466 == -1) {
			var2.field9467 = new PacketBit(260);
		} else if (var2.field9466 == -2) {
			var2.field9467 = new PacketBit(10000);
		} else if (var2.field9466 <= 18) {
			var2.field9467 = new PacketBit(20);
		} else if (var2.field9466 <= 98) {
			var2.field9467 = new PacketBit(100);
		} else {
			var2.field9467 = new PacketBit(260);
		}
		var2.field9467.method16876(arg1);
		var2.field9467.method16864(var2.field9469.field2957);
		var2.field9465 = 0;
		return var2;
	}

	@ObfuscatedName("ju.a(B)Lada;")
	public static class792 method4876() {
		class792 var0 = method11377();
		var0.field9469 = null;
		var0.field9466 = 0;
		var0.field9467 = new PacketBit(5000);
		return var0;
	}

	@ObfuscatedName("ada.s(I)V")
	public void method15023() {
		if (field9468 < field9470.length) {
			field9470[++field9468 - 1] = this;
		}
	}
}
