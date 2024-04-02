package com.jagex;

import deob.ObfuscatedName;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("if")
public class class276 implements Iterator {

	@ObfuscatedName("if.u")
	public class978 field2777;

	@ObfuscatedName("if.j")
	public int field2775 = 0;

	@ObfuscatedName("if.a")
	public int field2776 = this.field2777.field10517 * 758969061;

	public class276(class978 arg0) {
		this.field2777 = arg0;
	}

	public boolean hasNext() {
		return this.field2775 * -1287973605 < this.field2777.field10520 * -1870242109;
	}

	public Object next() {
		if (this.field2777.field10517 * 1659878095 != this.field2776 * -1330866269) {
			throw new ConcurrentModificationException();
		} else if (this.field2775 * -1287973605 < this.field2777.field10520 * -1870242109) {
			Object var1 = this.field2777.field10519[this.field2775 * -1287973605].field2774;
			this.field2775 += -2094908141;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
