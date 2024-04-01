package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vx")
public class class584 {

	@ObfuscatedName("vx.u")
	public final class334 field6827;

	@ObfuscatedName("vx.j")
	public final class334 field6826;

	@ObfuscatedName("vx.a")
	public int field6825 = 0;

	@ObfuscatedName("vx.s")
	public int field6832 = 0;

	@ObfuscatedName("vx.c")
	public final WeightedCache field6829 = new WeightedCache(64);

	@ObfuscatedName("vx.l")
	public class472 field6830 = null;

	public class584(class519 arg0, class334 arg1, class334 arg2, class472 arg3) {
		this.field6827 = arg1;
		this.field6826 = arg2;
		this.field6830 = arg3;
		if (this.field6827 != null) {
			this.field6825 = this.field6827.method5637(1);
		}
		if (this.field6826 != null) {
			this.field6832 = this.field6826.method5637(1);
		}
	}

	@ObfuscatedName("vx.u(II)Lajt;")
	public class955 method12176(int arg0) {
		class955 var2 = (class955) this.field6829.method7916((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3;
		if (arg0 >= 32768) {
			var3 = this.field6826.getFile(1, arg0 & 0x7FFF);
		} else {
			var3 = this.field6827.getFile(1, arg0);
		}
		class955 var4 = new class955();
		var4.field10394 = this;
		if (var3 != null) {
			var4.method16746(new Packet(var3));
		}
		if (arg0 >= 32768) {
			var4.method16754();
		}
		this.field6829.method7937(var4, (long) arg0);
		return var4;
	}

	@ObfuscatedName("vx.j(Lqz;[IJ)Ljava/lang/String;")
	public String method12175(class473 arg0, int[] arg1, long arg2) {
		if (this.field6830 != null) {
			String var5 = this.field6830.method4638(arg0, arg1, arg2);
			if (var5 != null) {
				return var5;
			}
		}
		return Long.toString(arg2);
	}
}
