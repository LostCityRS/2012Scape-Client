package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajt")
public class class955 extends class800 {

	@ObfuscatedName("ajt.t")
	public class584 field10394;

	@ObfuscatedName("ajt.l")
	public String[] field10392;

	@ObfuscatedName("ajt.f")
	public int[] field10390;

	@ObfuscatedName("ajt.d")
	public int[][] field10391;

	@ObfuscatedName("ajt.z")
	public int[] field10393;

	@ObfuscatedName("ajt.n")
	public boolean field10395 = true;

	@ObfuscatedName("ajt.u(Laet;I)V")
	public void method16746(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method16770(arg0, var2);
		}
	}

	@ObfuscatedName("ajt.j(Laet;IS)V")
	public void method16770(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field10392 = class526.method11508(arg0.method15337(), '<');
		} else if (arg1 == 2) {
			int var3 = arg0.method15220();
			this.field10393 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field10393[var4] = arg0.method15239();
			}
		} else if (arg1 == 3) {
			int var5 = arg0.method15220();
			this.field10390 = new int[var5];
			this.field10391 = new int[var5][];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.method15239();
				class473 var8 = Statics.method15663(var7);
				if (var8 != null) {
					this.field10390[var6] = var7;
					this.field10391[var6] = new int[var8.field5032];
					for (int var9 = 0; var9 < var8.field5032; var9++) {
						this.field10391[var6][var9] = arg0.method15239();
					}
				}
			}
		} else if (arg1 == 4) {
			this.field10395 = false;
		}
	}

	@ObfuscatedName("ajt.a(Laet;[II)V")
	public void method16748(class814 arg0, int[] arg1) {
		if (this.field10390 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field10390.length && var3 < arg1.length; var3++) {
			int var4 = this.method16752(var3).field5016;
			if (var4 > 0) {
				arg0.method15227((long) arg1[var3], var4);
			}
		}
	}

	@ObfuscatedName("ajt.s(Laet;I)Ljava/lang/String;")
	public String method16749(class814 arg0) {
		StringBuilder var2 = new StringBuilder(80);
		if (this.field10390 != null) {
			for (int var3 = 0; var3 < this.field10390.length; var3++) {
				var2.append(this.field10392[var3]);
				var2.append(this.field10394.method12175(this.method16752(var3), this.field10391[var3], arg0.method15231(Statics.method15663(this.field10390[var3]).field5018)));
			}
		}
		var2.append(this.field10392[this.field10392.length - 1]);
		return var2.toString();
	}

	@ObfuscatedName("ajt.c(B)Ljava/lang/String;")
	public String method16750() {
		StringBuilder var1 = new StringBuilder(80);
		if (this.field10392 == null) {
			return "";
		}
		var1.append(this.field10392[0]);
		for (int var2 = 1; var2 < this.field10392.length; var2++) {
			for (int var3 = 0; var3 < 3; var3++) {
				var1.append('.');
			}
			var1.append(this.field10392[var2]);
		}
		return var1.toString();
	}

	@ObfuscatedName("ajt.m(I)I")
	public int method16751() {
		return this.field10390 == null ? 0 : this.field10390.length;
	}

	@ObfuscatedName("ajt.t(II)Lqz;")
	public class473 method16752(int arg0) {
		return this.field10390 == null || arg0 < 0 || arg0 > this.field10390.length ? null : Statics.method15663(this.field10390[arg0]);
	}

	@ObfuscatedName("ajt.l(III)I")
	public int method16757(int arg0, int arg1) {
		if (this.field10390 == null || arg0 < 0 || arg0 > this.field10390.length) {
			return -1;
		} else if (this.field10391[arg0] == null || arg1 < 0 || arg1 > this.field10391[arg0].length) {
			return -1;
		} else {
			return this.field10391[arg0][arg1];
		}
	}

	@ObfuscatedName("ajt.f(I)V")
	public void method16754() {
		if (this.field10393 != null) {
			for (int var1 = 0; var1 < this.field10393.length; var1++) {
				this.field10393[var1] |= 0x8000;
			}
		}
	}
}
