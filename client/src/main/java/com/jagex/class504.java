package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("rr")
public class class504 {

	@ObfuscatedName("rr.u")
	public class165 com;

	@ObfuscatedName("rr.j")
	public class164 itf;

	@ObfuscatedName("rr.u(I)Lew;")
	public class165 method11061() {
		return this.itf.method3108(this.com.parentLayer);
	}

	@ObfuscatedName("rr.j(III)Z")
	public boolean method11062(int arg0, int arg1) {
		class165 var3 = class165.method15145(arg0, arg1);
		if (var3 == null) {
			this.method11063();
			return false;
		} else {
			this.itf = Statics.interfaces[arg0 >> 16];
			this.com = var3;
			return true;
		}
	}

	@ObfuscatedName("rr.a(Lej;IIB)Z")
	public boolean method11066(class164 arg0, int arg1, int arg2) {
		if (arg0 != null) {
			class165 var4 = arg0.method3108(arg1);
			if (var4 != null) {
				this.itf = arg0;
				this.com = var4;
				return true;
			}
		}
		this.method11063();
		return false;
	}

	@ObfuscatedName("rr.s(I)V")
	public void method11063() {
		this.itf = null;
		this.com = null;
	}
}
