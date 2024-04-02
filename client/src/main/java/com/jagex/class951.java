package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajo")
public class class951 extends class800 {

	@ObfuscatedName("ajo.t")
	public int field10370;

	@ObfuscatedName("ajo.l")
	public String field10362;

	@ObfuscatedName("ajo.f")
	public String field10372;

	@ObfuscatedName("ajo.d")
	public class547 field10363;

	@ObfuscatedName("ajo.z")
	public int field10365;

	@ObfuscatedName("ajo.n")
	public int field10366 = -534172565;

	@ObfuscatedName("ajo.o")
	public int field10367 = -825457583;

	@ObfuscatedName("ajo.q")
	public int field10368 = -1788734976;

	@ObfuscatedName("ajo.p")
	public int field10369 = 0;

	@ObfuscatedName("ajo.w")
	public int field10364 = -215112192;

	@ObfuscatedName("ajo.b")
	public int field10371 = 0;

	@ObfuscatedName("ajo.x")
	public boolean field10361 = true;

	public class951(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		this.field10370 = arg0 * -1587222781;
		this.field10362 = arg1;
		this.field10372 = arg2;
		this.field10365 = arg3 * 1206077527;
		this.field10366 = arg4 * 534172565;
		this.field10361 = arg5;
		this.field10367 = arg6 * 825457583;
		if (this.field10367 * -1015235761 == 255) {
			this.field10367 = 0;
		}
		class184.method2571(arg7);
		this.field10363 = new class547();
	}

	@ObfuscatedName("ajo.u(III)Z")
	public boolean method16717(int arg0, int arg1) {
		for (class807 var3 = (class807) this.field10363.method11563(); var3 != null; var3 = (class807) this.field10363.method11567()) {
			if (var3.method15167(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ajo.j(II[II)Z")
	public boolean method16707(int arg0, int arg1, int[] arg2) {
		for (class807 var4 = (class807) this.field10363.method11563(); var4 != null; var4 = (class807) this.field10363.method11567()) {
			if (var4.method15168(arg0, arg1)) {
				var4.method15169(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ajo.a(II[II)Z")
	public boolean method16708(int arg0, int arg1, int[] arg2) {
		for (class807 var4 = (class807) this.field10363.method11563(); var4 != null; var4 = (class807) this.field10363.method11567()) {
			if (var4.method15167(arg0, arg1)) {
				var4.method15170(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ajo.s(III[IB)Z")
	public boolean method16705(int arg0, int arg1, int arg2, int[] arg3) {
		for (class807 var5 = (class807) this.field10363.method11563(); var5 != null; var5 = (class807) this.field10363.method11567()) {
			if (var5.method15166(arg0, arg1, arg2)) {
				var5.method15170(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ajo.c(B)V")
	public void method16710() {
		this.field10368 = -1788734976;
		this.field10369 = 0;
		this.field10364 = -215112192;
		this.field10371 = 0;
		for (class807 var1 = (class807) this.field10363.method11563(); var1 != null; var1 = (class807) this.field10363.method11567()) {
			if (var1.field9576 * -945084875 < this.field10368 * 239364753) {
				this.field10368 = var1.field9576 * -197465243;
			}
			if (var1.field9575 * 914193985 > this.field10369 * 1498150343) {
				this.field10369 = var1.field9575 * -2141926473;
			}
			if (var1.field9577 * 1871072153 < this.field10364 * 866111971) {
				this.field10364 = var1.field9577 * 561902931;
			}
			if (var1.field9579 * -1175473095 > this.field10371 * 357331541) {
				this.field10371 = var1.field9579 * -895433131;
			}
		}
	}

	@ObfuscatedName("yt.m(Lls;III)Lajo;")
	public static class951 method13263(class334 arg0, int arg1, int arg2) {
		class814 var3 = new class814(arg0.method5627(arg1, arg2));
		class951 var4 = new class951(arg2, var3.method15337(), var3.method15337(), var3.method15379(), var3.method15379(), var3.method15220() == 1, var3.method15220(), var3.method15220());
		int var5 = var3.method15220();
		for (int var6 = 0; var6 < var5; var6++) {
			var4.field10363.method11558(new class807(var3.method15220(), var3.method15239(), var3.method15239(), var3.method15239(), var3.method15239(), var3.method15239(), var3.method15239(), var3.method15239(), var3.method15239()));
		}
		var4.method16710();
		return var4;
	}
}
