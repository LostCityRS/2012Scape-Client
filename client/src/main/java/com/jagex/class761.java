package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("abz")
public class class761 extends class390 {

	@ObfuscatedName("abz.u")
	public long field9239 = 0L;

	@ObfuscatedName("abz.j")
	public long field9237 = 0L;

	@ObfuscatedName("abz.a")
	public long field9240 = 0L;

	@ObfuscatedName("abz.s")
	public long[] field9238 = new long[10];

	@ObfuscatedName("abz.c")
	public int field9236 = 0;

	@ObfuscatedName("abz.m")
	public int field9241 = -1239870389;

	public class761() {
		this.field9239 = System.nanoTime() * -3798520680320039521L;
		this.field9237 = System.nanoTime() * -617124204938066923L;
	}

	@ObfuscatedName("abz.a(B)V")
	public void method6833() {
		this.field9240 = 0L;
		if (this.field9237 * -1003525242131666115L > this.field9239 * -6718591151786863009L) {
			this.field9239 += this.field9237 * -4219137907410924573L - this.field9239;
		}
	}

	@ObfuscatedName("abz.s(B)J")
	public long method6839() {
		this.field9239 += this.method14720() * -3798520680320039521L;
		return this.field9237 * -1003525242131666115L > this.field9239 * -6718591151786863009L ? (this.field9237 * -1003525242131666115L - this.field9239 * -6718591151786863009L) / 1000000L : 0L;
	}

	@ObfuscatedName("abz.c(J)I")
	public int method6832(long arg0) {
		if (this.field9237 * -1003525242131666115L > this.field9239 * -6718591151786863009L) {
			this.field9240 += this.field9237 * 3347382769712514999L - this.field9239 * -8951806434356001507L;
			this.field9239 += this.field9237 * -4219137907410924573L - this.field9239;
			this.field9237 += arg0 * -617124204938066923L;
			return 1;
		}
		int var3 = 0;
		do {
			var3++;
			this.field9237 += arg0 * -617124204938066923L;
		} while (var3 < 10 && this.field9237 * -1003525242131666115L < this.field9239 * -6718591151786863009L);
		if (this.field9237 * -1003525242131666115L < this.field9239 * -6718591151786863009L) {
			this.field9237 = this.field9239 * -503881263359290933L;
		}
		return var3;
	}

	@ObfuscatedName("abz.m(I)J")
	public long method6843() {
		return this.field9239 * -6718591151786863009L;
	}

	@ObfuscatedName("abz.w(I)J")
	public long method14720() {
		long var1 = System.nanoTime();
		long var3 = var1 - this.field9240 * -3121411537767408469L;
		this.field9240 = var1 * -7642760450248032765L;
		if (var3 > -5000000000L && var3 < 5000000000L) {
			this.field9238[this.field9236 * -35945643] = var3;
			this.field9236 = (this.field9236 * -35945643 + 1) % 10 * 1142710781;
			if (this.field9241 * 218699107 < 1) {
				this.field9241 += -1239870389;
			}
		}
		long var5 = 0L;
		for (int var7 = 1; var7 <= this.field9241 * 218699107; var7++) {
			var5 += this.field9238[(this.field9236 * -35945643 - var7 + 10) % 10];
		}
		return var5 / (long) (this.field9241 * 218699107);
	}
}
