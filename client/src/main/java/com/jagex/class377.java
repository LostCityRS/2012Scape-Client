package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("md")
public class class377 {

	@ObfuscatedName("md.u")
	public class334 field4056;

	@ObfuscatedName("md.j")
	public class334 field4053;

	@ObfuscatedName("md.a")
	public IterableMap field4055 = new IterableMap(256);

	@ObfuscatedName("md.s")
	public IterableMap field4057 = new IterableMap(256);

	@ObfuscatedName("md.c")
	public IterableMap field4054 = new IterableMap(256);

	public class377(class334 arg0, class334 arg1) {
		this.field4056 = arg0;
		this.field4053 = arg1;
	}

	@ObfuscatedName("md.u(II[II)Lalu;")
	public class997 method6564(int arg0, int arg1, int[] arg2) {
		int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
		int var5 = var4 | arg0 << 16;
		long var6 = (long) var5;
		class997 var8 = (class997) this.field4054.method11923(var6);
		if (var8 != null) {
			return var8;
		} else if (arg2 == null || arg2[0] > 0) {
			class370 var9 = class370.method6466(this.field4056, arg0, arg1);
			if (var9 == null) {
				return null;
			}
			class997 var10 = var9.method6463();
			this.field4054.pushNode(var10, var6);
			if (arg2 != null) {
				arg2[0] -= var10.field10574.length;
			}
			return var10;
		} else {
			return null;
		}
	}

	@ObfuscatedName("md.j(II[II)Laly;")
	public class996 method6566(int arg0, int arg1, int[] arg2) {
		int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >>> 12);
		int var5 = var4 | arg0 << 16;
		long var6 = (long) var5 ^ 0x100000000L;
		class996 var8 = (class996) this.field4057.method11923(var6);
		if (var8 != null) {
			return var8;
		} else if (arg2 == null || arg2[0] > 0) {
			class796 var9 = (class796) this.field4055.method11923(var6);
			if (var9 == null) {
				var9 = class796.method15065(this.field4053, arg0, arg1);
				if (var9 == null) {
					return null;
				}
				this.field4055.pushNode(var9, var6);
			}
			class996 var10 = var9.method15099();
			if (var10 == null) {
				return null;
			} else {
				var9.method6979();
				this.field4057.pushNode(var10, var6);
				return var10;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("md.a(I[II)Lalu;")
	public class997 method6567(int arg0, int[] arg1) {
		if (this.field4056.method5638() == 1) {
			return this.method6564(0, arg0, arg1);
		} else if (this.field4056.method5637(arg0) == 1) {
			return this.method6564(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("md.s(I[II)Laly;")
	public class996 method6568(int arg0, int[] arg1) {
		if (this.field4053.method5638() == 1) {
			return this.method6566(0, arg0, arg1);
		} else if (this.field4053.method5637(arg0) == 1) {
			return this.method6566(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
