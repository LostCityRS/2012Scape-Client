package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hm")
public class class233 {

	@ObfuscatedName("hm.u")
	public final class683 field2447;

	@ObfuscatedName("hm.j")
	public final class16 field2446;

	@ObfuscatedName("hm.a")
	public WeightedCache field2448 = new WeightedCache(6291456, 256);

	public class233(class683 arg0, class16 arg1) {
		this.field2447 = arg0;
		this.field2446 = arg1;
	}

	@ObfuscatedName("hm.u(I)Lhc;")
	public class239 method4359(int arg0) {
		return this.method4349(arg0, -1);
	}

	@ObfuscatedName("hm.j(II)Lhc;")
	public class239 method4349(int arg0, int arg1) {
		long var3 = (long) (arg1 << 16 | arg0);
		class239 var5 = (class239) this.field2448.method7916(var3);
		if (var5 != null) {
			return var5;
		} else if (this.method4350(arg0, arg1)) {
			class120 var6 = this.field2446.method889(arg0);
			if (arg1 == -1) {
				arg1 = var6.field1252;
			}
			class239 var8;
			if (var6.field1245 && this.field2447.method600()) {
				float[] var7 = this.field2446.method888(arg0, 0.7F, arg1, arg1, false);
				var8 = this.field2447.method13697(class124.field1296, arg1, arg1, true, var7);
			} else {
				int[] var9;
				if (class456.field4853 != var6.field1262 && class120.method12638(var6.field1270)) {
					var9 = this.field2446.method886(arg0, 0.7F, arg1, arg1, true);
				} else {
					var9 = this.field2446.method887(arg0, 0.7F, arg1, arg1, false);
				}
				var8 = this.field2447.method13548(arg1, arg1, true, var9);
			}
			var8.method4412(var6.field1273, var6.field1274);
			this.field2448.method7918(var8, var3, arg1 * arg1);
			return var8;
		} else {
			return null;
		}
	}

	@ObfuscatedName("hm.a(II)Z")
	public boolean method4350(int arg0, int arg1) {
		class120 var3 = this.field2446.method889(arg0);
		if (arg1 == -1) {
			arg1 = var3.field1252;
		}
		if (var3.field1245 && this.field2447.method600()) {
			return this.field2446.method898(arg0, class455.field4850, 0.7F, arg1, arg1, false);
		} else if (class456.field4853 != var3.field1262 && class120.method12638(var3.field1270)) {
			return this.field2446.method898(arg0, class455.field4849, 0.7F, arg1, arg1, true);
		} else {
			return this.field2446.method898(arg0, class455.field4848, 0.7F, arg1, arg1, false);
		}
	}

	@ObfuscatedName("hm.s()V")
	public void method4357() {
		this.field2448.method7921(5);
	}

	@ObfuscatedName("hm.c()V")
	public void method4352() {
		this.field2448.method7922();
	}
}
