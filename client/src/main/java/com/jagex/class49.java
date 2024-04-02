package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("e")
public class class49 implements class567 {

	@ObfuscatedName("e.u")
	public static int[] field659 = new int[32];

	@ObfuscatedName("e.m")
	public int[] field657 = new int[Statics.field6667.field3312 * -1952192041];

	@ObfuscatedName("e.t")
	public int[] field661 = new int[Statics.field6667.field3312 * -1952192041];

	@ObfuscatedName("e.l")
	public class565 field662 = new class565(128);

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field659[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("e.u(ZB)I")
	public int method1640(boolean arg0) {
		long var2 = class153.method5554();
		for (class801 var4 = (class801) (arg0 ? this.field662.method11928() : this.field662.method11929()); var4 != null; var4 = (class801) this.field662.method11929()) {
			if ((var4.field9555 * 5491296901837409843L & 0x3FFFFFFFFFFFFFFFL) < var2) {
				if ((var4.field9555 * 5491296901837409843L & 0x4000000000000000L) != 0L) {
					int var5 = (int) (var4.field4228 * 4763964654233859639L);
					this.field661[var5] = this.field657[var5];
					var4.method6979();
					return var5;
				}
				var4.method6979();
			}
		}
		return -1;
	}

	@ObfuscatedName("e.j(B)V")
	public void method1647() {
		for (int var1 = 0; var1 < Statics.field6667.field3312 * -1952192041; var1++) {
			this.field657[var1] = 0;
			this.field661[var1] = 0;
		}
		this.field662 = new class565(128);
	}

	@ObfuscatedName("e.a(III)V")
	public void method1642(int arg0, int arg1) {
		this.field661[arg0] = arg1;
		class801 var3 = (class801) this.field662.method11923((long) arg0);
		if (var3 == null) {
			class801 var4 = new class801(class153.method5554() + 500L);
			this.field662.method11927(var4, (long) arg0);
		} else {
			var3.field9555 = (class153.method5554() + 500L) * -8598623848105059077L;
		}
	}

	@ObfuscatedName("e.s(III)V")
	public void method1643(int arg0, int arg1) {
		this.field657[arg0] = arg1;
		class801 var3 = (class801) this.field662.method11923((long) arg0);
		if (var3 == null) {
			class801 var4 = new class801(4611686018427387905L);
			this.field662.method11927(var4, (long) arg0);
		} else if (var3.field9555 * 5491296901837409843L != 4611686018427387905L) {
			var3.field9555 = (class153.method5554() + 500L | 0x4000000000000000L) * -8598623848105059077L;
		}
	}

	@ObfuscatedName("e.c(IIB)V")
	public void method1644(int arg0, int arg1) {
		class433 var3 = Statics.field4645.method7668(arg0);
		int var4 = var3.field4669 * 868047201;
		int var5 = var3.field4668 * -1557723611;
		int var6 = var3.field4670 * -1739652795;
		int var7 = field659[var6 - var5];
		if (arg1 < 0 || arg1 > var7) {
			arg1 = 0;
		}
		int var8 = var7 << var5;
		this.method1642(var4, this.field661[var4] & ~var8 | arg1 << var5 & var8);
	}

	@ObfuscatedName("e.m(III)V")
	public void method1663(int arg0, int arg1) {
		class433 var3 = Statics.field4645.method7668(arg0);
		int var4 = var3.field4669 * 868047201;
		int var5 = var3.field4668 * -1557723611;
		int var6 = var3.field4670 * -1739652795;
		int var7 = field659[var6 - var5];
		if (arg1 < 0 || arg1 > var7) {
			arg1 = 0;
		}
		int var8 = var7 << var5;
		this.method1643(var4, this.field657[var4] & ~var8 | arg1 << var5 & var8);
	}

	@ObfuscatedName("e.t(II)I")
	public int method1664(int arg0) {
		return this.field661[arg0];
	}

	@ObfuscatedName("e.l(II)I")
	public int method1646(int arg0) {
		class433 var2 = Statics.field4645.method7668(arg0);
		int var3 = var2.field4669 * 868047201;
		int var4 = var2.field4668 * -1557723611;
		int var5 = var2.field4670 * -1739652795;
		int var6 = field659[var5 - var4];
		return this.field661[var3] >> var4 & var6;
	}
}
