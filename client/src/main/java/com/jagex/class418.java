package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("oi")
public class class418 {

	@ObfuscatedName("oi.u")
	public int field4459 = -366431187;

	@ObfuscatedName("oi.j")
	public int field4458 = -1463370311;

	@ObfuscatedName("oi.a")
	public int[] field4457;

	@ObfuscatedName("oi.s")
	public class420 field4460 = class420.field4468;

	@ObfuscatedName("oi.c")
	public int field4461 = 439877117;

	@ObfuscatedName("oi.u(Laet;B)V")
	public void method7354(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method7355(arg0, var2);
		}
	}

	@ObfuscatedName("oi.j(Laet;II)V")
	public void method7355(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field4459 = arg0.method15239() * 366431187;
		} else if (arg1 == 2) {
			this.field4457 = new int[arg0.method15220()];
			for (int var3 = 0; var3 < this.field4457.length; var3++) {
				this.field4457[var3] = arg0.method15239();
			}
		} else if (arg1 == 3) {
			this.field4458 = arg0.method15220() * 1463370311;
		} else if (arg1 == 4) {
			this.field4460 = (class420) class518.method8032(Statics.method14028(), arg0.method15220());
		} else if (arg1 == 5) {
			this.field4461 = arg0.method15411() * -439877117;
		}
	}
}
