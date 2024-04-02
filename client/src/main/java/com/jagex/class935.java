package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("air")
public class class935 extends class789 {

	// $FF: synthetic field
	public final class220 this$0;

	@ObfuscatedName("air.s")
	public String field10223;

	@ObfuscatedName("air.c")
	public int field10221;

	@ObfuscatedName("air.m")
	public byte field10222;

	public class935(class220 arg0) {
		this.this$0 = arg0;
		this.field10223 = null;
	}

	@ObfuscatedName("air.u(Laet;B)V")
	public void method14985(Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos--;
			arg0.g8();
		}
		this.field10223 = arg0.fastgstr();
		this.field10221 = arg0.g2();
		this.field10222 = arg0.g1b();
		arg0.g8();
	}

	@ObfuscatedName("air.j(Ladh;B)V")
	public void method14986(class788 arg0) {
		class217 var2 = new class217();
		var2.field2343 = this.field10223;
		var2.field2341 = this.field10221;
		var2.field2342 = this.field10222;
		arg0.method14981(var2);
	}
}
