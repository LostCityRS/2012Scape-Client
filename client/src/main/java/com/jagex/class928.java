package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aiv")
public class class928 extends class787 {

	// $FF: synthetic field
	public final class219 this$0;

	@ObfuscatedName("aiv.s")
	public long field10204;

	@ObfuscatedName("aiv.c")
	public String field10202;

	@ObfuscatedName("aiv.m")
	public int field10203;

	public class928(class219 arg0) {
		this.this$0 = arg0;
		this.field10204 = -1L;
		this.field10202 = null;
		this.field10203 = 0;
	}

	@ObfuscatedName("aiv.u(Laet;I)V")
	public void method14956(Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos--;
			this.field10204 = arg0.g8();
		}
		this.field10202 = arg0.fastgstr();
		this.field10203 = arg0.g2();
	}

	@ObfuscatedName("aiv.j(Lga;B)V")
	public void method14955(class218 arg0) {
		arg0.method4070(this.field10204, this.field10202, this.field10203);
	}
}
