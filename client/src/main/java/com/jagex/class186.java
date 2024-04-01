package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fy")
public class class186 {

	@ObfuscatedName("fy.u")
	public int field2156;

	@ObfuscatedName("fy.j")
	public int field2151 = 8;

	@ObfuscatedName("fy.a")
	public int field2152;

	@ObfuscatedName("fy.s")
	public int field2153;

	@ObfuscatedName("fy.c")
	public int field2154;

	@ObfuscatedName("fy.m")
	public boolean field2159;

	@ObfuscatedName("fy.t")
	public int field2155 = 16777215;

	@ObfuscatedName("fy.l")
	public int field2150;

	@ObfuscatedName("fy.f")
	public int field2158;

	@ObfuscatedName("fy.d")
	public int field2157;

	@ObfuscatedName("fy.z")
	public int field2160;

	@ObfuscatedName("fy.u(Laet;B)V")
	public void method3595(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method3593(arg0, var2);
		}
	}

	@ObfuscatedName("fy.j(Laet;II)V")
	public void method3593(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2151 = arg0.method15239();
		} else if (arg1 == 2) {
			this.field2159 = true;
		} else if (arg1 == 3) {
			this.field2152 = arg0.method15240();
			this.field2153 = arg0.method15240();
			this.field2154 = arg0.method15240();
		} else if (arg1 == 4) {
			this.field2156 = arg0.method15220();
		} else if (arg1 == 5) {
			this.field2150 = arg0.method15411();
		} else if (arg1 == 6) {
			this.field2155 = arg0.method15241();
		} else if (arg1 == 7) {
			this.field2158 = arg0.method15240();
			this.field2157 = arg0.method15240();
			this.field2160 = arg0.method15240();
		}
	}
}
