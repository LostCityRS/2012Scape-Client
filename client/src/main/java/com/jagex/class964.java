package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajl")
public class class964 extends class814 {

	@ObfuscatedName("ajl.n")
	public class568 field10473;

	@ObfuscatedName("ajl.o")
	public static final int[] field10474 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("ajl.q")
	public int field10475;

	public class964(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("ajl.ir(Lue;I)V")
	public void method16876(class568 arg0) {
		this.field10473 = arg0;
	}

	@ObfuscatedName("ajl.ie(II)V")
	public void method16864(int arg0) {
		this.field9629[++this.field9626 - 1] = (byte) (arg0 + this.field10473.method11968());
	}

	@ObfuscatedName("ajl.ii(I)Z")
	public boolean method16859() {
		int var1 = this.field9629[this.field9626] - this.field10473.method11963() & 0xFF;
		return var1 >= 128;
	}

	@ObfuscatedName("ajl.in(I)I")
	public int method16883() {
		int var1 = this.field9629[++this.field9626 - 1] - this.field10473.method11968() & 0xFF;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field9629[++this.field9626 - 1] - this.field10473.method11968() & 0xFF);
	}

	@ObfuscatedName("ajl.ih([BIIB)V")
	public void method16861(byte[] arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < arg2; var4++) {
			arg0[arg1 + var4] = (byte) (this.field9629[++this.field9626 - 1] - this.field10473.method11968());
		}
	}

	@ObfuscatedName("ajl.ig(I)V")
	public void method16862() {
		this.field10475 = this.field9626 * 8;
	}

	@ObfuscatedName("ajl.ia(II)I")
	public int method16863(int arg0) {
		int var2 = this.field10475 >> 3;
		int var3 = 8 - (this.field10475 & 0x7);
		int var4 = 0;
		this.field10475 += arg0;
		while (arg0 > var3) {
			var4 += (this.field9629[var2++] & field10474[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = (this.field9629[var2] & field10474[var3]) + var4;
		} else {
			var5 = (this.field9629[var2] >> var3 - arg0 & field10474[arg0]) + var4;
		}
		return var5;
	}

	@ObfuscatedName("ajl.iw(I)V")
	public void method16881() {
		this.field9626 = (this.field10475 + 7) / 8;
	}

	@ObfuscatedName("ajl.iq(II)I")
	public int method16865(int arg0) {
		return arg0 * 8 - this.field10475;
	}
}
