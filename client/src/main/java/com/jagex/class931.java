package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aio")
public class class931 extends class787 {

	// $FF: synthetic field
	public final class219 this$0;

	@ObfuscatedName("aio.s")
	public int field10209;

	@ObfuscatedName("aio.c")
	public int field10210;

	@ObfuscatedName("aio.m")
	public int field10211;

	@ObfuscatedName("aio.t")
	public int field10212;

	public class931(class219 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("aio.u(Laet;I)V")
	public void method14956(class814 arg0) {
		this.field10209 = arg0.method15379() * 22192447;
		this.field10212 = arg0.method15379() * -699140911;
		this.field10210 = arg0.method15220() * 1839923481;
		this.field10211 = arg0.method15220() * -1466439;
	}

	@ObfuscatedName("aio.j(Lga;B)V")
	public void method14955(class218 arg0) {
		arg0.method4040(this.field10209 * -886583617, this.field10212 * -22748111, this.field10210 * -445723863, this.field10211 * -1781746039);
	}
}
