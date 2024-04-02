package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aie")
public class class920 extends class787 {

	// $FF: synthetic field
	public final class219 this$0;

	@ObfuscatedName("aie.s")
	public long field10183;

	@ObfuscatedName("aie.c")
	public String field10182;

	public class920(class219 arg0) {
		this.this$0 = arg0;
		this.field10183 = 1624211662567525877L;
		this.field10182 = null;
	}

	@ObfuscatedName("aie.u(Laet;I)V")
	public void method14956(class814 arg0) {
		if (arg0.method15220() != 255) {
			arg0.field9626 -= -1748220013;
			this.field10183 = arg0.method15246() * -1624211662567525877L;
		}
		this.field10182 = arg0.method15219();
	}

	@ObfuscatedName("aie.j(Lga;B)V")
	public void method14955(class218 arg0) {
		arg0.method4051(this.field10183 * 1570293372038924707L, this.field10182);
	}
}
