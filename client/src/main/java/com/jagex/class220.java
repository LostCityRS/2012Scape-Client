package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gd")
public class class220 {

	@ObfuscatedName("gd.u")
	public long field2393;

	@ObfuscatedName("gd.j")
	public long field2392 = -4174233242007032883L;

	@ObfuscatedName("gd.a")
	public class547 field2394 = new class547();

	public class220(class814 arg0) {
		this.method4116(arg0);
	}

	@ObfuscatedName("gd.u(Laet;I)V")
	public void method4116(class814 arg0) {
		this.field2393 = arg0.method15246() * -1354765113996518537L;
		this.field2392 = arg0.method15246() * 4174233242007032883L;
		for (int var2 = arg0.method15220(); var2 != 0; var2 = arg0.method15220()) {
			class789 var3;
			if (var2 == 1) {
				var3 = new class935(this);
			} else if (var2 == 4) {
				var3 = new class934(this);
			} else if (var2 == 3) {
				var3 = new class933(this);
			} else if (var2 == 2) {
				var3 = new class932(this);
			} else {
				throw new RuntimeException("");
			}
			var3.method14985(arg0);
			this.field2394.method11558(var3);
		}
	}

	@ObfuscatedName("gd.j(Ladh;B)V")
	public void method4115(class788 arg0) {
		if (this.field2393 * -625397745083093433L != arg0.field4228 * 4763964654233859639L || this.field2392 * 6561377639537985275L != arg0.field9435 * 4544769545177626269L) {
			throw new RuntimeException("");
		}
		for (class789 var2 = (class789) this.field2394.method11563(); var2 != null; var2 = (class789) this.field2394.method11567()) {
			var2.method14986(arg0);
		}
		arg0.field9435 += 3857494019174481845L;
	}
}
