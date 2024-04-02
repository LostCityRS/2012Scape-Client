package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("nj")
public class class396 {

	@ObfuscatedName("nj.u")
	public static int field4221 = 0;

	@ObfuscatedName("nj.j")
	public final int field4217;

	@ObfuscatedName("nj.a")
	public final int field4218;

	@ObfuscatedName("nj.s")
	public final int[] field4216;

	@ObfuscatedName("nj.c")
	public final int[] field4220;

	@ObfuscatedName("nj.m")
	public LinkedList field4219;

	public class396(class14 arg0, class814 arg1, int arg2) {
		this.field4217 = arg2 * -2024656113;
		this.field4218 = arg1.method15254() * 551061381;
		this.field4216 = new int[this.field4218 * 1465538893];
		this.field4220 = new int[this.field4218 * 1465538893];
		int var4 = arg1.method15239();
		int var5 = arg1.method15239();
		for (int var6 = 0; var6 < this.field4218 * 1465538893; var6++) {
			this.field4216[var6] = var4 + arg1.method15238();
			this.field4220[var6] = var5 + arg1.method15238();
		}
		this.method6950(arg0);
	}

	@ObfuscatedName("nj.u(Lra;S)Lqa;")
	public class13 method6950(class14 arg0) {
		class129 var2 = class129.method2664(Statics.field4560, this.field4217 * 2082757615, 0);
		if (var2 == null) {
			return null;
		} else {
			if (var2.field1314 < 13) {
				var2.method2634(2);
			}
			return arg0.method625(var2, 2048, field4221 * -325333283, 64, 768);
		}
	}

	@ObfuscatedName("nj.j(Loo;I)V")
	public void method6951(class423 arg0) {
		if (arg0 == null || this.field4218 * 1465538893 <= 0) {
			return;
		}
		this.method6953(arg0);
		Iterator var2 = this.field4219.iterator();
		while (var2.hasNext()) {
			class1011 var3 = (class1011) var2.next();
			arg0.method7412(var3, false);
		}
	}

	@ObfuscatedName("nj.a(Loo;S)V")
	public void method6952(class423 arg0) {
		if (arg0 == null || this.field4219 == null) {
			return;
		}
		Iterator var2 = this.field4219.iterator();
		while (var2.hasNext()) {
			class1011 var3 = (class1011) var2.next();
			arg0.method7430(var3.field9807, var3.field10510, var3.field10509, new class397(var3));
		}
	}

	@ObfuscatedName("nj.s(Loo;I)V")
	public void method6953(class423 arg0) {
		this.field4219 = new LinkedList();
		class338 var2 = client.field8980.method6100();
		class453 var3 = client.field8980.method6214();
		class453 var4 = new class453(Statics.field7324 * 589483007, this.field4216[0], this.field4220[0]);
		for (int var5 = 1; var5 < this.field4218 * 1465538893; var5++) {
			class453 var6 = new class453(Statics.field7324 * 589483007, this.field4216[var5], this.field4220[var5]);
			while (var4.field4836 * 401083797 != var6.field4836 * 401083797 || var4.field4838 * -526848045 != var6.field4838 * -526848045) {
				if (var4.field4836 * 401083797 < var6.field4836 * 401083797) {
					var4.field4836 += -1432496707;
				} else if (var4.field4836 * 401083797 > var6.field4836 * 401083797) {
					var4.field4836 -= -1432496707;
				}
				if (var4.field4838 * -526848045 < var6.field4838 * -526848045) {
					var4.field4838 += -52805541;
				} else if (var4.field4838 * -526848045 > var6.field4838 * -526848045) {
					var4.field4838 -= -52805541;
				}
				int var7 = Statics.field7324 * 589483007;
				int var8 = var4.field4836 * 401083797 - var3.field4836 * 401083797;
				int var9 = var4.field4838 * -526848045 - var3.field4838 * -526848045;
				if (var8 >= 0 && var8 < arg0.field4495 * 1336538301 && var9 >= 0 && var9 < arg0.field4496 * 583225963) {
					int var10 = (var8 << 9) + 256;
					int var11 = (var9 << 9) + 256;
					if (var2.method5794(var8, var9)) {
						var7++;
					}
					this.field4219.add(new class1011(arg0, this, Statics.field7324 * 589483007, var7, var10, client.method8663(var10, var11, Statics.field7324 * 589483007), var11));
				}
			}
			var4 = var6;
		}
	}

	@ObfuscatedName("ej.c(IB)V")
	public static void method3109(int arg0) {
		field4221 = arg0 * 2111076725;
	}
}
