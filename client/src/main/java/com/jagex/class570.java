package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("uz")
public class class570 {

	@ObfuscatedName("uz.u")
	public Object field6757;

	@ObfuscatedName("uz.j")
	public Object field6756;

	public class570(Object arg0, Object arg1) {
		this.field6757 = arg0;
		this.field6756 = arg1;
	}

	public String toString() {
		return this.field6757 + ", " + this.field6756;
	}

	public boolean equals(Object arg0) {
		if (arg0 == null || !(arg0 instanceof class570)) {
			return false;
		}
		class570 var2 = (class570) arg0;
		if (this.field6757 == null) {
			if (var2.field6757 != null) {
				return false;
			}
		} else if (!this.field6757.equals(var2.field6757)) {
			return false;
		}
		if (this.field6756 == null) {
			if (var2.field6756 != null) {
				return false;
			}
		} else if (!this.field6756.equals(var2.field6756)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field6757 != null) {
			var1 += this.field6757.hashCode();
		}
		if (this.field6756 != null) {
			var1 += this.field6756.hashCode() * 31;
		}
		return var1;
	}
}
