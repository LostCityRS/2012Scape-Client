package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gs")
public class class219 {

	@ObfuscatedName("gs.u")
	public long field2379;

	@ObfuscatedName("gs.j")
	public int field2375 = 275547203;

	@ObfuscatedName("gs.a")
	public class547 field2376 = new class547();

	public class219(class814 arg0) {
		this.method4110(arg0);
	}

	@ObfuscatedName("gs.u(Laet;B)V")
	public void method4110(class814 arg0) {
		this.field2379 = arg0.method15246() * -5546582176239359211L;
		this.field2375 = arg0.method15379() * -275547203;
		for (int var2 = arg0.method15220(); var2 != 0; var2 = arg0.method15220()) {
			class787 var3;
			if (var2 == 3) {
				var3 = new class920(this);
			} else if (var2 == 1) {
				var3 = new class919(this);
			} else if (var2 == 13) {
				var3 = new class928(this);
			} else if (var2 == 4) {
				var3 = new class927(this);
			} else if (var2 == 6) {
				var3 = new class930(this);
			} else if (var2 == 5) {
				var3 = new class923(this);
			} else if (var2 == 2) {
				var3 = new class922(this);
			} else if (var2 == 7) {
				var3 = new class924(this);
			} else if (var2 == 8) {
				var3 = new class929(this);
			} else if (var2 == 9) {
				var3 = new class921(this);
			} else if (var2 == 10) {
				var3 = new class925(this);
			} else if (var2 == 11) {
				var3 = new class931(this);
			} else if (var2 == 12) {
				var3 = new class926(this);
			} else {
				throw new RuntimeException("");
			}
			var3.method14956(arg0);
			this.field2376.method11558(var3);
		}
	}

	@ObfuscatedName("gs.j(Lga;I)V")
	public void method4109(class218 arg0) {
		if (this.field2379 * 8935590008506977341L != arg0.field2347 * 6846731128798323019L || this.field2375 * -26798187 != arg0.field2348 * 837035335) {
			throw new RuntimeException("");
		}
		for (class787 var2 = (class787) this.field2376.method11563(); var2 != null; var2 = (class787) this.field2376.method11567()) {
			var2.method14955(arg0);
		}
		arg0.field2348 += 2059269239;
	}
}
