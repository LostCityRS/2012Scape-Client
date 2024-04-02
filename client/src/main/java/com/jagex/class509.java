package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("so")
public class class509 {

	@ObfuscatedName("so.u")
	public static boolean field6319 = false;

	@ObfuscatedName("so.j")
	public class510 field6317;

	@ObfuscatedName("so.a")
	public int field6318;

	@ObfuscatedName("so.s")
	public int[] field6329;

	@ObfuscatedName("so.c")
	public int[] field6320;

	@ObfuscatedName("so.m")
	public int[] field6321;

	@ObfuscatedName("so.t")
	public int[][] field6338;

	@ObfuscatedName("so.l")
	public int field6336 = -1;

	@ObfuscatedName("so.f")
	public boolean[] field6324;

	@ObfuscatedName("so.d")
	public int field6325 = 5;

	@ObfuscatedName("so.z")
	public int field6326 = -1;

	@ObfuscatedName("so.n")
	public int field6327 = -1;

	@ObfuscatedName("so.o")
	public int field6328 = 99;

	@ObfuscatedName("so.q")
	public int field6323 = -1;

	@ObfuscatedName("so.p")
	public int field6330 = -1;

	@ObfuscatedName("so.w")
	public int field6331 = 2;

	@ObfuscatedName("so.b")
	public boolean field6332 = false;

	@ObfuscatedName("so.x")
	public boolean field6333 = false;

	@ObfuscatedName("so.i")
	public boolean field6334 = false;

	@ObfuscatedName("so.v")
	public int[] field6335;

	@ObfuscatedName("so.k")
	public int[] field6316;

	@ObfuscatedName("so.h")
	public int[] field6337;

	@ObfuscatedName("so.r")
	public class565 field6322;

	@ObfuscatedName("so.g")
	public int field6339 = -1;

	@ObfuscatedName("so.u(Laet;I)V")
	public void method11122(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method11123(arg0, var2);
		}
	}

	@ObfuscatedName("so.j(Laet;II)V")
	public void method11123(class814 arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.method15239();
			this.field6321 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field6321[var4] = arg0.method15239();
			}
			this.field6329 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.field6329[var5] = arg0.method15239();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.field6329[var6] += arg0.method15239() << 16;
			}
		} else if (arg1 == 2) {
			this.field6336 = arg0.method15239();
		} else if (arg1 == 3) {
			this.field6324 = new boolean[256];
			int var7 = arg0.method15220();
			for (int var8 = 0; var8 < var7; var8++) {
				this.field6324[arg0.method15220()] = true;
			}
		} else if (arg1 == 5) {
			this.field6325 = arg0.method15220();
		} else if (arg1 == 6) {
			this.field6326 = arg0.method15239();
		} else if (arg1 == 7) {
			this.field6327 = arg0.method15239();
		} else if (arg1 == 8) {
			this.field6328 = arg0.method15220();
		} else if (arg1 == 9) {
			this.field6323 = arg0.method15220();
		} else if (arg1 == 10) {
			this.field6330 = arg0.method15220();
		} else if (arg1 == 11) {
			this.field6331 = arg0.method15220();
		} else if (arg1 == 12) {
			int var9 = arg0.method15220();
			this.field6320 = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field6320[var10] = arg0.method15239();
			}
			for (int var11 = 0; var11 < var9; var11++) {
				this.field6320[var11] += arg0.method15239() << 16;
			}
		} else if (arg1 == 13) {
			int var12 = arg0.method15239();
			this.field6338 = new int[var12][];
			for (int var13 = 0; var13 < var12; var13++) {
				int var14 = arg0.method15220();
				if (var14 > 0) {
					this.field6338[var13] = new int[var14];
					this.field6338[var13][0] = arg0.method15241();
					for (int var15 = 1; var15 < var14; var15++) {
						this.field6338[var13][var15] = arg0.method15239();
					}
				}
			}
		} else if (arg1 == 14) {
			this.field6332 = true;
		} else if (arg1 == 15) {
			this.field6333 = true;
		} else if (arg1 != 16) {
			if (arg1 == 18) {
				this.field6334 = true;
			} else if (arg1 == 19) {
				if (this.field6335 == null) {
					this.field6335 = new int[this.field6338.length];
					for (int var16 = 0; var16 < this.field6338.length; var16++) {
						this.field6335[var16] = 255;
					}
				}
				this.field6335[arg0.method15220()] = arg0.method15220();
			} else if (arg1 == 20) {
				if (this.field6316 == null || this.field6337 == null) {
					this.field6316 = new int[this.field6338.length];
					this.field6337 = new int[this.field6338.length];
					for (int var17 = 0; var17 < this.field6338.length; var17++) {
						this.field6316[var17] = 256;
						this.field6337[var17] = 256;
					}
				}
				int var18 = arg0.method15220();
				this.field6316[var18] = arg0.method15239();
				this.field6337[var18] = arg0.method15239();
			} else if (arg1 == 22) {
				this.field6339 = arg0.method15220();
			} else if (arg1 == 249) {
				int var19 = arg0.method15220();
				if (this.field6322 == null) {
					int var20 = class595.method2839(var19);
					this.field6322 = new class565(var20);
				}
				for (int var21 = 0; var21 < var19; var21++) {
					boolean var22 = arg0.method15220() == 1;
					int var23 = arg0.method15241();
					class399 var24;
					if (var22) {
						var24 = new class798(arg0.method15337());
					} else {
						var24 = new class802(arg0.method15379());
					}
					this.field6322.method11927(var24, (long) var23);
				}
			}
		}
	}

	@ObfuscatedName("so.a(I)V")
	public void method11124() {
		if (this.field6323 == -1) {
			if (this.field6324 == null) {
				this.field6323 = 0;
			} else {
				this.field6323 = 2;
			}
		}
		if (this.field6330 != -1) {
			return;
		}
		if (this.field6324 == null) {
			this.field6330 = 0;
		} else {
			this.field6330 = 2;
		}
	}

	@ObfuscatedName("so.s(I)Z")
	public boolean method11129() {
		if (this.field6329 == null) {
			return true;
		}
		boolean var1 = true;
		int[] var2 = this.field6329;
		for (int var3 = 0; var3 < var2.length; var3++) {
			int var4 = var2[var3];
			if (this.field6317.method11146(var4 >>> 16) == null) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("so.c(IIB)I")
	public int method11121(int arg0, int arg1) {
		if (this.field6322 == null) {
			return arg1;
		} else {
			class802 var3 = (class802) this.field6322.method11923((long) arg0);
			return var3 == null ? arg1 : var3.field9556;
		}
	}

	@ObfuscatedName("so.m(ILjava/lang/String;B)Ljava/lang/String;")
	public String method11127(int arg0, String arg1) {
		if (this.field6322 == null) {
			return arg1;
		} else {
			class798 var3 = (class798) this.field6322.method11923((long) arg0);
			return var3 == null ? arg1 : (String) var3.field9550;
		}
	}
}
