package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pk")
public final class class452 {

	@ObfuscatedName("pk.u")
	public class800 field4834 = new class800();

	@ObfuscatedName("pk.j")
	public int field4831;

	@ObfuscatedName("pk.a")
	public int field4832;

	@ObfuscatedName("pk.s")
	public class565 field4833;

	@ObfuscatedName("pk.c")
	public class552 field4830 = new class552();

	public class452(int arg0) {
		this.field4831 = arg0 * -642514293;
		this.field4832 = arg0 * -1170319355;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field4833 = new class565(var2);
	}

	@ObfuscatedName("pk.u(J)Ladi;")
	public class800 method7965(long arg0) {
		class800 var3 = (class800) this.field4833.method11923(arg0);
		if (var3 != null) {
			this.field4830.method11728(var3);
		}
		return var3;
	}

	@ObfuscatedName("pk.j(Ladi;J)V")
	public void method7958(class800 arg0, long arg1) {
		if (this.field4832 * -1267682099 == 0) {
			class800 var4 = this.field4830.method11729();
			var4.method6979();
			var4.method15142();
			if (this.field4834 == var4) {
				class800 var5 = this.field4830.method11729();
				var5.method6979();
				var5.method15142();
			}
		} else {
			this.field4832 -= -1170319355;
		}
		this.field4833.method11927(arg0, arg1);
		this.field4830.method11728(arg0);
	}

	@ObfuscatedName("pk.a(B)V")
	public void method7959() {
		this.field4830.method11733();
		this.field4833.method11925();
		this.field4834 = new class800();
		this.field4832 = this.field4831 * -1784925777;
	}
}
