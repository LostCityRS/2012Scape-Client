package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ads")
public class class807 extends class399 {

	@ObfuscatedName("ads.s")
	public int field9578;

	@ObfuscatedName("ads.c")
	public int field9572;

	@ObfuscatedName("ads.m")
	public int field9573;

	@ObfuscatedName("ads.t")
	public int field9574;

	@ObfuscatedName("ads.l")
	public int field9571;

	@ObfuscatedName("ads.f")
	public int field9576;

	@ObfuscatedName("ads.d")
	public int field9577;

	@ObfuscatedName("ads.z")
	public int field9575;

	@ObfuscatedName("ads.n")
	public int field9579;

	public class807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		this.field9578 = arg0 * -755313441;
		this.field9572 = arg1 * -1140775995;
		this.field9573 = arg2 * -1764521989;
		this.field9574 = arg3 * -1796193237;
		this.field9571 = arg4 * -841717441;
		this.field9576 = arg5 * 101678109;
		this.field9577 = arg6 * -1771579223;
		this.field9575 = arg7 * 1889636801;
		this.field9579 = arg8 * -215221751;
	}

	@ObfuscatedName("ads.u(III)Z")
	public boolean method15167(int arg0, int arg1) {
		return arg0 >= this.field9572 * -60005619 && arg0 <= this.field9574 * 977427075 && arg1 >= this.field9573 * 20081459 && arg1 <= this.field9571 * -361625921;
	}

	@ObfuscatedName("ads.j(IIIB)Z")
	public boolean method15166(int arg0, int arg1, int arg2) {
		return this.field9578 * 14018335 == arg0 && arg1 >= this.field9572 * -60005619 && arg1 <= this.field9574 * 977427075 && arg2 >= this.field9573 * 20081459 && arg2 <= this.field9571 * -361625921;
	}

	@ObfuscatedName("ads.a(IIB)Z")
	public boolean method15168(int arg0, int arg1) {
		return arg0 >= this.field9576 * -945084875 && arg0 <= this.field9575 * 914193985 && arg1 >= this.field9577 * 1871072153 && arg1 <= this.field9579 * -1175473095;
	}

	@ObfuscatedName("ads.s(II[IB)V")
	public void method15169(int arg0, int arg1, int[] arg2) {
		arg2[0] = this.field9578 * 14018335;
		arg2[1] = this.field9572 * -60005619 - this.field9576 * -945084875 + arg0;
		arg2[2] = this.field9573 * 20081459 - this.field9577 * 1871072153 + arg1;
	}

	@ObfuscatedName("ads.c(II[II)V")
	public void method15170(int arg0, int arg1, int[] arg2) {
		arg2[0] = 0;
		arg2[1] = this.field9576 * -945084875 - this.field9572 * -60005619 + arg0;
		arg2[2] = this.field9577 * 1871072153 - this.field9573 * 20081459 + arg1;
	}
}
