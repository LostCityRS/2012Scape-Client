package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("uc")
public class class564 {

	@ObfuscatedName("uc.u")
	public int field6716 = 0;

	@ObfuscatedName("uc.j")
	public int field6713 = 1162512113;

	@ObfuscatedName("uc.a")
	public int field6715 = 412066304;

	@ObfuscatedName("uc.s")
	public boolean field6719 = true;

	@ObfuscatedName("uc.c")
	public boolean field6717 = true;

	@ObfuscatedName("uc.m")
	public int field6718;

	@ObfuscatedName("uc.t")
	public int field6714;

	@ObfuscatedName("uc.l")
	public int field6720;

	@ObfuscatedName("uc.f")
	public int field6721;

	@ObfuscatedName("uc.u(Laet;B)V")
	public void method11909(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method11918(arg0, var2);
		}
	}

	@ObfuscatedName("uc.j(Laet;II)V")
	public void method11918(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field6716 = arg0.method15241() * -318279463;
			this.method11916(this.field6716 * 1162219369);
		} else if (arg1 == 2) {
			this.field6713 = arg0.method15239() * -1162512113;
			if (this.field6713 * -2038540817 == 65535) {
				this.field6713 = 1162512113;
			}
		} else if (arg1 == 3) {
			this.field6715 = (arg0.method15239() << 2) * -1626585135;
		} else if (arg1 == 4) {
			this.field6719 = false;
		} else if (arg1 == 5) {
			this.field6717 = false;
		}
	}

	@ObfuscatedName("uc.a(IB)V")
	public void method11916(int arg0) {
		double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (double) (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}
			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}
		double var18 = var12 / 6.0D;
		this.field6714 = (int) (var14 * 256.0D) * 1722494481;
		this.field6720 = (int) (var16 * 256.0D) * 219031955;
		if (this.field6714 * -1826258191 < 0) {
			this.field6714 = 0;
		} else if (this.field6714 * -1826258191 > 255) {
			this.field6714 = 1149428463;
		}
		if (this.field6720 * 1981045915 < 0) {
			this.field6720 = 0;
		} else if (this.field6720 * 1981045915 > 255) {
			this.field6720 = 18573677;
		}
		if (var16 > 0.5D) {
			this.field6721 = (int) ((1.0D - var16) * var14 * 512.0D) * -1898975223;
		} else {
			this.field6721 = (int) (var14 * var16 * 512.0D) * -1898975223;
		}
		if (this.field6721 * -123822535 < 1) {
			this.field6721 = -1898975223;
		}
		this.field6718 = (int) ((double) (this.field6721 * -123822535) * var18) * -371993097;
	}
}
