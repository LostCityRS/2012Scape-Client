package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aia")
public class class924 extends class787 {

	// $FF: synthetic field
	public final class219 this$0;

	@ObfuscatedName("aia.s")
	public int field10193;

	@ObfuscatedName("aia.c")
	public int field10190;

	@ObfuscatedName("aia.m")
	public int field10191;

	@ObfuscatedName("aia.t")
	public int field10192;

	public class924(class219 arg0) {
		this.this$0 = arg0;
		this.field10193 = -1;
	}

	@ObfuscatedName("aia.u(Laet;I)V")
	public void method14956(Packet arg0) {
		this.field10193 = arg0.g2();
		this.field10190 = arg0.g4s();
		this.field10191 = arg0.g1();
		this.field10192 = arg0.g1();
	}

	@ObfuscatedName("aia.j(Lga;B)V")
	public void method14955(class218 arg0) {
		arg0.method4053(this.field10193, this.field10190, this.field10191, this.field10192);
	}
}
