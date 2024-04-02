package com.jagex;

import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("uk")
public class class566 implements Iterator {

	@ObfuscatedName("uk.u")
	public class565 field6730;

	@ObfuscatedName("uk.j")
	public class399 field6729;

	@ObfuscatedName("uk.a")
	public int field6731;

	@ObfuscatedName("uk.s")
	public class399 field6728 = null;

	public class566(class565 arg0) {
		this.field6730 = arg0;
		this.method11950();
	}

	@ObfuscatedName("uk.f(I)V")
	public void method11950() {
		this.field6729 = this.field6730.field6725[0].field4226;
		this.field6731 = 1;
		this.field6728 = null;
	}

	@ObfuscatedName("uk.d(B)Lnz;")
	public class399 method11955() {
		this.method11950();
		return (class399) this.next();
	}

	public Object next() {
		if (this.field6730.field6725[this.field6731 - 1] != this.field6729) {
			class399 var1 = this.field6729;
			this.field6729 = var1.field4226;
			this.field6728 = var1;
			return var1;
		}
		class399 var2;
		do {
			if (this.field6731 >= this.field6730.field6722) {
				return null;
			}
			var2 = this.field6730.field6725[++this.field6731 - 1].field4226;
		} while (this.field6730.field6725[this.field6731 - 1] == var2);
		this.field6729 = var2.field4226;
		this.field6728 = var2;
		return var2;
	}

	public boolean hasNext() {
		if (this.field6730.field6725[this.field6731 - 1] != this.field6729) {
			return true;
		}
		while (this.field6731 < this.field6730.field6722) {
			if (this.field6730.field6725[++this.field6731 - 1].field4226 != this.field6730.field6725[this.field6731 - 1]) {
				this.field6729 = this.field6730.field6725[this.field6731 - 1].field4226;
				return true;
			}
			this.field6729 = this.field6730.field6725[this.field6731 - 1];
		}
		return false;
	}

	public void remove() {
		if (this.field6728 == null) {
			throw new IllegalStateException();
		}
		this.field6728.method6979();
		this.field6728 = null;
	}
}
