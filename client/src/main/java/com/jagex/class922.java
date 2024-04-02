package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ais")
public class class922 extends class787 {

	// $FF: synthetic field
	public final class219 this$0;

	@ObfuscatedName("ais.s")
	public int field10186;

	@ObfuscatedName("ais.c")
	public byte field10187;

	public class922(class219 arg0) {
		this.this$0 = arg0;
		this.field10186 = 2002756369;
	}

	@ObfuscatedName("ais.u(Laet;I)V")
	public void method14956(class814 arg0) {
		this.field10186 = arg0.method15239() * -2002756369;
		this.field10187 = arg0.method15238();
	}

	@ObfuscatedName("ais.j(Lga;B)V")
	public void method14955(class218 arg0) {
		arg0.method4052(this.field10186 * -125152753, this.field10187);
	}
}
