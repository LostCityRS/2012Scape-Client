package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jaclib.ping.Ping;

@ObfuscatedName("ke")
public class class326 {

	@ObfuscatedName("ke.j")
	public static int field3495 = 0;

	@ObfuscatedName("ke.a")
	public static int field3494 = 0;

	public class326() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("me.u(I)I")
	public static int method6562() {
		if (field3495 * 30714907 == 0) {
			class587.field6838.method12193(new class327("jaclib"));
			if (class587.field6838.method12192().method5533() != 100) {
				return 1;
			}
			if (!((class327) class587.field6838.method12192()).method5557()) {
				Statics.field1543.method6676();
				class477.method13902();
				try {
					Ping.init();
				} catch (Throwable var19) {
				}
			}
			field3495 = -523940333;
		}
		if (field3495 * 30714907 == 1) {
			Statics.field3496 = class587.method12194();
			class587.field6859.method12193(new class324(Statics.field849));
			class587.field6839.method12193(new class327("jaggl"));
			class587.field6840.method12193(new class327("jagdx"));
			class587.field6841.method12193(new class327("sw3d"));
			class587.field6842.method12193(new class327("hw3d"));
			class587.field6843.method12193(new class327("jagtheora"));
			class587.field6844.method12193(new class324(Statics.field2670));
			class587.field6862.method12193(new class324(Statics.field7572));
			class587.field6837.method12193(new class324(Statics.field7435));
			class587.field6847.method12193(new class324(Statics.field1565));
			class587.field6864.method12193(new class324(Statics.field6451));
			class587.field6858.method12193(new class324(Statics.field5080));
			class587.field6850.method12193(new class324(Statics.field5130));
			class587.field6851.method12193(new class324(Statics.field3897));
			class587.field6852.method12193(new class324(Statics.field2070));
			class587.field6853.method12193(new class324(Statics.field4229));
			class587.field6848.method12193(new class324(Statics.field6343));
			class587.field6855.method12193(new class324(Statics.field6712));
			class587.field6845.method12193(new class324(Statics.field8655));
			class587.field6857.method12193(new class324(Statics.field8734));
			class587.field6854.method12193(new class323(Statics.field3523, "huffman"));
			class587.field6846.method12193(new class324(Statics.field2653));
			class587.field6860.method12193(new class324(Statics.field6651));
			class587.field6861.method12193(new class324(Statics.field8745));
			class587.field6849.method12193(new class325(Statics.field4059, "details"));
			for (int var1 = 0; var1 < Statics.field3496.length; var1++) {
				if (Statics.field3496[var1].method12192() == null) {
					throw new RuntimeException();
				}
			}
			int var2 = 0;
			class587[] var3 = Statics.field3496;
			for (int var4 = 0; var4 < var3.length; var4++) {
				class587 var5 = var3[var4];
				int var6 = var5.method12190();
				int var7 = var5.method12192().method5533();
				var2 += var6 * var7 / 100;
			}
			field3494 = var2 * 1265869975;
			field3495 = -1047880666;
		}
		if (Statics.field3496 == null) {
			return 100;
		}
		int var8 = 0;
		int var9 = 0;
		boolean var10 = true;
		class587[] var11 = Statics.field3496;
		for (int var12 = 0; var12 < var11.length; var12++) {
			class587 var13 = var11[var12];
			int var14 = var13.method12190();
			int var15 = var13.method12192().method5533();
			if (var15 < 100) {
				var10 = false;
			}
			var8 += var14;
			var9 += var14 * var15 / 100;
		}
		if (var10) {
			if (!((class327) class587.field6843.method12192()).method5557()) {
				client.field8944 = Statics.field1543.method6677();
			}
			Statics.field3496 = null;
		}
		int var16 = var9 - field3494 * -1410720985;
		int var17 = var8 - field3494 * -1410720985;
		int var18 = var17 > 0 ? var16 * 100 / var17 : 100;
		if (!var10 && var18 > 99) {
			var18 = 99;
		}
		return var18;
	}
}
