package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("gc")
public abstract class class208 implements class214 {

	@ObfuscatedName("gc.u")
	public final class334 field2310;

	@ObfuscatedName("gc.j")
	public final class334 field2313;

	@ObfuscatedName("gc.a")
	public final class262 field2311;

	@ObfuscatedName("gc.s")
	public class15 field2312;

	@ObfuscatedName("gc.c")
	public int field2309;

	@ObfuscatedName("gc.m")
	public long field2314;

	public class208(class334 arg0, class334 arg1, class262 arg2) {
		this.field2310 = arg0;
		this.field2313 = arg1;
		this.field2311 = arg2;
	}

	@ObfuscatedName("gc.j(ZI)V")
	public void method3932(boolean arg0) {
		int var2 = this.field2311.field2605.method4586(this.field2311.field2602 * 261452353, client.field9067 * 1000006945) + this.field2311.field2604 * -1042691565;
		int var3 = this.field2311.field2603.method4574(this.field2311.field2607 * 1174834713, client.field9068 * 1102381581) + this.field2311.field2608 * 1132067831;
		this.method3957(arg0, var2, var3);
		this.method3955(arg0, var2, var3);
		String var4 = Statics.field6789.method4959();
		if (class153.method5554() - this.field2314 * -2528790337225566571L > 10000L) {
			var4 = var4 + " (" + Statics.field6789.method4960().field3404 * -1918822553 + ")";
		}
		this.field2312.method834(var4, this.field2311.field2602 * 261452353 / 2 + var2, this.field2311.field2610 * -767192831 + this.field2311.field2607 * 1174834713 / 2 + var3 + 4, this.field2311.field2606 * 606695729, -1);
	}

	@ObfuscatedName("gc.u(B)V")
	public void method3936() {
		class603 var1 = class603.method14876(this.field2313, this.field2311.field2609 * -1156991141);
		this.field2312 = Statics.field5187.method712(var1, (class685[]) class125.method2593(this.field2310, this.field2311.field2609 * -1156991141), true);
	}

	@ObfuscatedName("gc.a(I)Z")
	public boolean method3931() {
		boolean var1 = true;
		if (!this.field2310.method5630(this.field2311.field2609 * -1156991141)) {
			var1 = false;
		}
		if (!this.field2313.method5630(this.field2311.field2609 * -1156991141)) {
			var1 = false;
		}
		return var1;
	}

	@ObfuscatedName("gc.z(B)I")
	public int method3956() {
		int var1 = Statics.field6789.method4974();
		int var2 = var1 * 100;
		if (this.field2309 * -133025541 == var1 && var1 != 0) {
			int var3 = Statics.field6789.method4957();
			if (var3 > var1) {
				long var4 = this.field2314 * -2528790337225566571L - Statics.field6789.method4955();
				if (var4 > 0L) {
					long var6 = var4 * 10000L / (long) var1 * (long) (var3 - var1);
					long var8 = (class153.method5554() - this.field2314 * -2528790337225566571L) * 10000L;
					if (var8 < var6) {
						var2 = (int) ((long) (var3 - var1) * var8 * 100L / var6 + (long) (var1 * 100));
					} else {
						var2 = var3 * 100;
					}
				}
			}
		} else {
			this.field2309 = var1 * 1962433075;
			this.field2314 = class153.method5554() * 8688545633496220861L;
		}
		return var2;
	}

	@ObfuscatedName("gc.d(ZIII)V")
	public abstract void method3955(boolean arg0, int arg1, int arg2);

	@ObfuscatedName("gc.f(ZIIS)V")
	public abstract void method3957(boolean arg0, int arg1, int arg2);
}
