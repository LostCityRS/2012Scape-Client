package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("rx")
public class class487 {

	@ObfuscatedName("rx.u")
	public class445 field5120;

	@ObfuscatedName("rx.j")
	public class445 field5121;

	@ObfuscatedName("rx.a")
	public class445 field5122;

	@ObfuscatedName("rx.s")
	public class445 field5123;

	@ObfuscatedName("rx.c")
	public class450 field5125;

	@ObfuscatedName("rx.m")
	public class450 field5129;

	@ObfuscatedName("rx.t")
	public class450 field5126;

	@ObfuscatedName("rx.l")
	public int field5127;

	@ObfuscatedName("rx.f")
	public int field5128;

	@ObfuscatedName("rx.d")
	public boolean field5124;

	public class487(class334 arg0) {
		byte[] var2 = arg0.method5635(class491.field5137.field5145);
		this.method8582(new Packet(var2));
	}

	@ObfuscatedName("rx.u(Laet;I)V")
	public void method8582(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field5120 = class447.method15895(arg0);
			} else if (var2 == 2) {
				this.field5121 = class447.method15895(arg0);
			} else if (var2 == 3) {
				this.field5122 = class447.method15895(arg0);
			} else if (var2 == 4) {
				this.field5123 = class447.method15895(arg0);
			} else if (var2 == 5) {
				this.field5125 = Statics.method3541(arg0);
			} else if (var2 == 6) {
				this.field5129 = Statics.method3541(arg0);
			} else if (var2 == 7) {
				this.field5126 = Statics.method3541(arg0);
			} else if (var2 == 8) {
				class447.method15895(arg0);
			} else if (var2 == 9) {
				class447.method15895(arg0);
			} else if (var2 == 10) {
				class447.method15895(arg0);
			} else if (var2 == 11) {
				this.field5124 = true;
			} else if (var2 == 12) {
				this.field5127 = arg0.g4s();
			} else if (var2 == 13) {
				this.field5128 = arg0.g4s();
			}
		}
	}
}
