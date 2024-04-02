package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("sj")
public class class528 {

	@ObfuscatedName("sj.u")
	public int field6409;

	@ObfuscatedName("sj.j")
	public int field6410;

	@ObfuscatedName("sj.a")
	public int field6411;

	@ObfuscatedName("sj.u(Laet;I)V")
	public void method11304(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method11302(arg0, var2);
		}
	}

	@ObfuscatedName("sj.j(Laet;II)V")
	public void method11302(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field6409 = arg0.method15239() * -42861835;
			this.field6410 = arg0.method15220() * -1630879291;
			this.field6411 = arg0.method15220() * -2046321507;
		}
	}
}
