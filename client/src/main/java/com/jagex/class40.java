package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("q")
public class class40 {

	@ObfuscatedName("q.u")
	public int field574;

	@ObfuscatedName("q.j")
	public int field573;

	@ObfuscatedName("q.u(IIII)Z")
	public boolean method1385(int arg0, int arg1, int arg2) {
		int var4 = this.field573;
		if (this.field574 == arg0 && this.field573 == 0) {
			return false;
		}
		boolean var5;
		if (this.field573 == 0) {
			if (arg0 > this.field574 && arg0 <= this.field574 + arg1 || arg0 < this.field574 && arg0 >= this.field574 - arg1) {
				this.field574 = arg0;
				return false;
			}
			var5 = true;
		} else if (this.field573 > 0 && arg0 > this.field574) {
			int var6 = this.field573 * this.field573 / (arg1 * 2);
			int var7 = this.field574 + var6;
			if (var7 < arg0 && var7 >= this.field574) {
				var5 = true;
			} else {
				var5 = false;
			}
		} else if (this.field573 < 0 && arg0 < this.field574) {
			int var8 = this.field573 * this.field573 / (arg1 * 2);
			int var9 = this.field574 - var8;
			if (var9 > arg0 && var9 <= this.field574) {
				var5 = true;
			} else {
				var5 = false;
			}
		} else {
			var5 = false;
		}
		if (var5) {
			if (arg0 > this.field574) {
				this.field573 += arg1;
				if (arg2 != 0 && this.field573 > arg2) {
					this.field573 = arg2;
				}
			} else {
				this.field573 -= arg1;
				if (arg2 != 0 && this.field573 < -arg2) {
					this.field573 = -arg2;
				}
			}
			if (this.field573 != var4) {
				int var10 = this.field573 * this.field573 / (arg1 * 2);
				if (arg0 > this.field574) {
					if (this.field574 + var10 > arg0) {
						this.field573 = var4;
					}
				} else if (arg0 < this.field574 && this.field574 - var10 < arg0) {
					this.field573 = var4;
				}
			}
		} else if (this.field573 > 0) {
			this.field573 -= arg1;
			if (this.field573 < 0) {
				this.field573 = 0;
			}
		} else {
			this.field573 += arg1;
			if (this.field573 > 0) {
				this.field573 = 0;
			}
		}
		this.field574 += this.field573 + var4 >> 1;
		return var5;
	}

	@ObfuscatedName("q.j(IB)V")
	public void method1386(int arg0) {
		this.field574 = arg0;
		this.field573 = 0;
	}

	@ObfuscatedName("q.a(I)I")
	public int method1387() {
		return this.field574 & 0x3FFF;
	}

	@ObfuscatedName("q.s(I)V")
	public void method1388() {
		this.field574 &= 0x3FFF;
	}
}
