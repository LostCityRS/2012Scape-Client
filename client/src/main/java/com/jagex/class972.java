package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("akr")
public abstract class class972 extends class836 {

	@ObfuscatedName("akr.y")
	public static final int[] field10506 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("akr.e")
	public short field10507;

	public class972(class423 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0);
		this.field9807 = (byte) arg4;
		this.field9809 = (byte) arg5;
		this.field10507 = (short) arg6;
		this.method8551(new class317((float) arg1, (float) arg2, (float) arg3));
	}

	@ObfuscatedName("akr.fu([Lacg;I)I")
	public int method15639(class780[] arg0) {
		class317 var2 = this.method8565().field3464;
		int var3 = (int) var2.field3475 >> this.field9808.field4510;
		int var4 = (int) var2.field3477 >> this.field9808.field4510;
		int var5 = 0;
		if (this.field9808.field4521 == var3) {
			var5++;
		} else if (this.field9808.field4521 < var3) {
			var5 += 2;
		}
		if (this.field9808.field4503 == var4) {
			var5 += 3;
		} else if (this.field9808.field4503 > var4) {
			var5 += 6;
		}
		int var6 = field10506[var5];
		if ((this.field10507 & var6) != 0) {
			return this.method15637(var3, var4, arg0);
		} else if (this.field10507 == 1 && var3 > 0) {
			return this.method15637(var3 - 1, var4, arg0);
		} else if (this.field10507 == 4 && var3 <= this.field9808.field4495) {
			return this.method15637(var3 + 1, var4, arg0);
		} else if (this.field10507 == 8 && var4 > 0) {
			return this.method15637(var3, var4 - 1, arg0);
		} else if (this.field10507 == 2 && var4 <= this.field9808.field4496) {
			return this.method15637(var3, var4 + 1, arg0);
		} else if (this.field10507 == 16 && var3 > 0 && var4 <= this.field9808.field4496) {
			return this.method15637(var3 - 1, var4 + 1, arg0);
		} else if (this.field10507 == 32 && var3 <= this.field9808.field4495 && var4 <= this.field9808.field4496) {
			return this.method15637(var3 + 1, var4 + 1, arg0);
		} else if (this.field10507 == 128 && var3 > 0 && var4 > 0) {
			return this.method15637(var3 - 1, var4 - 1, arg0);
		} else if (this.field10507 == 64 && var3 <= this.field9808.field4495 && var4 > 0) {
			return this.method15637(var3 + 1, var4 - 1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("akr.fh(Lra;I)Z")
	public boolean method15634(class14 arg0) {
		class317 var2 = this.method8565().field3464;
		return this.field9808.field4493.method7600(this, this.field9809, (int) var2.field3475 >> this.field9808.field4510, (int) var2.field3477 >> this.field9808.field4510);
	}

	@ObfuscatedName("akr.fz(I)Z")
	public boolean method15635() {
		class317 var1 = this.method8565().field3464;
		return this.field9808.field4544[this.field9808.field4531 + (((int) var1.field3475 >> this.field9808.field4510) - this.field9808.field4521)][this.field9808.field4531 + (((int) var1.field3477 >> this.field9808.field4510) - this.field9808.field4503)];
	}
}
