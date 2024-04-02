package com.jagex;

import deob.ObfuscatedName;
import jaclib.nanotime.QueryPerformanceCounter;

@ObfuscatedName("acc")
public class class762 extends class390 {

	@ObfuscatedName("acc.u")
	public long field9243 = 0L;

	@ObfuscatedName("acc.j")
	public long field9246 = 0L;

	@ObfuscatedName("acc.a")
	public long field9244 = 0L;

	@ObfuscatedName("acc.s")
	public long[] field9245 = new long[10];

	@ObfuscatedName("acc.c")
	public int field9242 = 0;

	@ObfuscatedName("acc.m")
	public int field9247 = 1624128757;

	public class762() {
		this.field9246 = (this.field9243 = QueryPerformanceCounter.nanoTime() * 860874340924421395L) * 1329115511446142321L;
		if (this.field9243 * -1799003023977898725L == 0L) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("acc.a(B)V")
	public void method6833() {
		this.field9244 = 0L;
		if (this.field9246 * -2047565758685696693L > this.field9243 * -1799003023977898725L) {
			this.field9243 += this.field9246 * -326891067311545455L - this.field9243;
		}
	}

	@ObfuscatedName("acc.s(B)J")
	public long method6839() {
		this.field9243 += this.method14724() * 860874340924421395L;
		return this.field9246 * -2047565758685696693L > this.field9243 * -1799003023977898725L ? (this.field9246 * -2047565758685696693L - this.field9243 * -1799003023977898725L) / 1000000L : 0L;
	}

	@ObfuscatedName("acc.c(J)I")
	public int method6832(long arg0) {
		if (this.field9246 * -2047565758685696693L > this.field9243 * -1799003023977898725L) {
			this.field9244 += this.field9246 * 574730897495307119L - this.field9243 * -5780191560956844289L;
			this.field9243 += this.field9246 * -326891067311545455L - this.field9243;
			this.field9246 += arg0 * 7411516678377895011L;
			return 1;
		}
		int var3 = 0;
		do {
			var3++;
			this.field9246 += arg0 * 7411516678377895011L;
		} while (var3 < 10 && this.field9246 * -2047565758685696693L < this.field9243 * -1799003023977898725L);
		if (this.field9246 * -2047565758685696693L < this.field9243 * -1799003023977898725L) {
			this.field9246 = this.field9243 * 1329115511446142321L;
		}
		return var3;
	}

	@ObfuscatedName("acc.m(I)J")
	public long method6843() {
		return this.field9243 * -1799003023977898725L;
	}

	@ObfuscatedName("acc.w(I)J")
	public long method14724() {
		long var1 = QueryPerformanceCounter.nanoTime();
		long var3 = var1 - this.field9244 * -8430315835139815963L;
		this.field9244 = var1 * -1527920960438292499L;
		if (var3 > -5000000000L && var3 < 5000000000L) {
			this.field9245[this.field9242 * 251808305] = var3;
			this.field9242 = (this.field9242 * 251808305 + 1) % 10 * 1959710417;
			if (this.field9247 * 1753976669 < 1) {
				this.field9247 += 1624128757;
			}
		}
		long var5 = 0L;
		for (int var7 = 1; var7 <= this.field9247 * 1753976669; var7++) {
			var5 += this.field9245[(this.field9242 * 251808305 - var7 + 10) % 10];
		}
		return var5 / (long) (this.field9247 * 1753976669);
	}
}
