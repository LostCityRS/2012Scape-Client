package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ej")
public class class164 {

	@ObfuscatedName("ej.u")
	public class165[] components;

	@ObfuscatedName("ej.j")
	public class165[] field1733;

	@ObfuscatedName("ej.a")
	public boolean field1734;

	public class164(boolean arg0, class165[] arg1) {
		this.components = arg1;
		this.field1734 = arg0;
	}

	@ObfuscatedName("ej.u(S)[Lew;")
	public class165[] method3104() {
		return this.field1733 == null ? this.components : this.field1733;
	}

	@ObfuscatedName("ej.j(B)[Lew;")
	public class165[] method3105() {
		if (this.field1733 == null) {
			int var1 = this.components.length;
			this.field1733 = new class165[var1];
			System.arraycopy(this.components, 0, this.field1733, 0, this.components.length);
		}
		return this.field1733;
	}

	@ObfuscatedName("ej.a(II)Lew;")
	public class165 method3108(int arg0) {
		if (this.components[0].parentLayer >>> 16 != arg0 >>> 16) {
			throw new IllegalArgumentException();
		}
		return this.components[arg0 & 0xFFFF];
	}
}
