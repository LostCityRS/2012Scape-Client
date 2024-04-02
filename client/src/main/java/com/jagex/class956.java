package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aju")
public class class956 extends class800 {

	@ObfuscatedName("aju.t")
	public class565 field10396;

	@ObfuscatedName("aju.u(Laet;I)V")
	public void method16778(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method16779(arg0, var2);
		}
	}

	@ObfuscatedName("aju.j(Laet;II)V")
	public void method16779(class814 arg0, int arg1) {
		if (arg1 != 249) {
			return;
		}
		int var3 = arg0.method15220();
		if (this.field10396 == null) {
			int var4 = class595.method2839(var3);
			this.field10396 = new class565(var4);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = arg0.method15220() == 1;
			int var7 = arg0.method15241();
			class399 var8;
			if (var6) {
				var8 = new class798(arg0.method15337());
			} else {
				var8 = new class802(arg0.method15379());
			}
			this.field10396.method11927(var8, (long) var7);
		}
	}

	@ObfuscatedName("aju.a(IIB)I")
	public int method16777(int arg0, int arg1) {
		if (this.field10396 == null) {
			return arg1;
		} else {
			class802 var3 = (class802) this.field10396.method11923((long) arg0);
			return var3 == null ? arg1 : var3.field9556 * 1720545541;
		}
	}

	@ObfuscatedName("aju.s(ILjava/lang/String;I)Ljava/lang/String;")
	public String method16782(int arg0, String arg1) {
		if (this.field10396 == null) {
			return arg1;
		} else {
			class798 var3 = (class798) this.field10396.method11923((long) arg0);
			return var3 == null ? arg1 : (String) var3.field9550;
		}
	}
}
