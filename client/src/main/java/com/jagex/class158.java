package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("en")
public class class158 {

	@ObfuscatedName("en.u")
	public Packet field1614 = new Packet(null);

	@ObfuscatedName("en.j")
	public int field1606;

	@ObfuscatedName("en.a")
	public int[] field1610;

	@ObfuscatedName("en.s")
	public int[] field1604;

	@ObfuscatedName("en.c")
	public int[] field1605;

	@ObfuscatedName("en.m")
	public int[] field1613;

	@ObfuscatedName("en.t")
	public int field1603;

	@ObfuscatedName("en.f")
	public long field1609;

	@ObfuscatedName("en.d")
	public static final byte[] field1607 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public class158() {
	}

	public class158(byte[] arg0) {
		this.method3015(arg0);
	}

	@ObfuscatedName("en.u([B)V")
	public void method3015(byte[] arg0) {
		this.field1614.data = arg0;
		this.field1614.pos = 10;
		int var2 = this.field1614.g2();
		this.field1606 = this.field1614.g2();
		this.field1603 = 500000;
		this.field1610 = new int[var2];
		int var3 = 0;
		while (var3 < var2) {
			int var4 = this.field1614.g4s();
			int var5 = this.field1614.g4s();
			if (var4 == 1297379947) {
				this.field1610[var3] = this.field1614.pos;
				var3++;
			}
			this.field1614.pos += var5;
		}
		this.field1609 = 0L;
		this.field1604 = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.field1604[var6] = this.field1610[var6];
		}
		this.field1605 = new int[var2];
		this.field1613 = new int[var2];
	}

	@ObfuscatedName("en.j()V")
	public void method3016() {
		this.field1614.data = null;
		this.field1610 = null;
		this.field1604 = null;
		this.field1605 = null;
		this.field1613 = null;
	}

	@ObfuscatedName("en.a()Z")
	public boolean method3017() {
		return this.field1614.data != null;
	}

	@ObfuscatedName("en.s()I")
	public int method3018() {
		return this.field1604.length;
	}

	@ObfuscatedName("en.c(I)V")
	public void method3030(int arg0) {
		this.field1614.pos = this.field1604[arg0];
	}

	@ObfuscatedName("en.m(I)V")
	public void method3020(int arg0) {
		this.field1604[arg0] = this.field1614.pos;
	}

	@ObfuscatedName("en.t()V")
	public void method3043() {
		this.field1614.pos = -1;
	}

	@ObfuscatedName("en.l(I)V")
	public void method3025(int arg0) {
		int var2 = this.field1614.method15261();
		this.field1605[arg0] += var2;
	}

	@ObfuscatedName("en.f(I)I")
	public int method3029(int arg0) {
		return this.method3024(arg0);
	}

	@ObfuscatedName("en.d(I)I")
	public int method3024(int arg0) {
		byte var2 = this.field1614.data[this.field1614.pos];
		int var3;
		if (var2 < 0) {
			var3 = var2 & 0xFF;
			this.field1613[arg0] = var3;
			this.field1614.pos++;
		} else {
			var3 = this.field1613[arg0];
		}
		if (var3 != 240 && var3 != 247) {
			return this.method3014(arg0, var3);
		}
		int var4 = this.field1614.method15261();
		if (var3 == 247 && var4 > 0) {
			int var5 = this.field1614.data[this.field1614.pos] & 0xFF;
			if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
				this.field1614.pos++;
				this.field1613[arg0] = var5;
				return this.method3014(arg0, var5);
			}
		}
		this.field1614.pos += var4;
		return 0;
	}

	@ObfuscatedName("en.z(II)I")
	public int method3014(int arg0, int arg1) {
		if (arg1 != 255) {
			byte var7 = field1607[arg1 - 128];
			int var8 = arg1;
			if (var7 >= 1) {
				var8 = arg1 | this.field1614.g1() << 8;
			}
			if (var7 >= 2) {
				var8 |= this.field1614.g1() << 16;
			}
			return var8;
		}
		int var3 = this.field1614.g1();
		int var4 = this.field1614.method15261();
		if (var3 == 47) {
			this.field1614.pos += var4;
			return 1;
		} else if (var3 == 81) {
			int var5 = this.field1614.method15241();
			var4 -= 3;
			int var6 = this.field1605[arg0];
			this.field1609 += (long) (this.field1603 - var5) * (long) var6;
			this.field1603 = var5;
			this.field1614.pos += var4;
			return 2;
		} else {
			this.field1614.pos += var4;
			return 3;
		}
	}

	@ObfuscatedName("en.n(I)J")
	public long method3026(int arg0) {
		return (long) this.field1603 * (long) arg0 + this.field1609;
	}

	@ObfuscatedName("en.o()I")
	public int method3027() {
		int var1 = this.field1604.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; var4++) {
			if (this.field1604[var4] >= 0 && this.field1605[var4] < var3) {
				var2 = var4;
				var3 = this.field1605[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("en.q()Z")
	public boolean method3019() {
		int var1 = this.field1604.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.field1604[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("en.p(J)V")
	public void method3028(long arg0) {
		this.field1609 = arg0;
		int var3 = this.field1604.length;
		for (int var4 = 0; var4 < var3; var4++) {
			this.field1605[var4] = 0;
			this.field1613[var4] = 0;
			this.field1614.pos = this.field1610[var4];
			this.method3025(var4);
			this.field1604[var4] = this.field1614.pos;
		}
	}
}
