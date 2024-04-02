package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("uj")
public class class569 {

	@ObfuscatedName("uj.c")
	public static long[][] field6745 = new long[8][256];

	@ObfuscatedName("uj.m")
	public static long[] field6750 = new long[11];

	@ObfuscatedName("uj.t")
	public byte[] field6747 = new byte[32];

	@ObfuscatedName("uj.l")
	public byte[] field6748 = new byte[64];

	@ObfuscatedName("uj.f")
	public int field6749 = 0;

	@ObfuscatedName("uj.d")
	public int field6752 = 0;

	@ObfuscatedName("uj.z")
	public long[] field6751 = new long[8];

	@ObfuscatedName("uj.n")
	public long[] field6744 = new long[8];

	@ObfuscatedName("uj.o")
	public long[] field6753 = new long[8];

	@ObfuscatedName("uj.q")
	public long[] field6746 = new long[8];

	@ObfuscatedName("uj.p")
	public long[] field6755 = new long[8];

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			char var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
			long var2 = (var0 & 0x1) == 0 ? (long) (var1 >>> 8) : (long) (var1 & 0xFF);
			long var4 = var2 << 1;
			if (var4 >= 256L) {
				var4 ^= 0x11DL;
			}
			long var6 = var4 << 1;
			if (var6 >= 256L) {
				var6 ^= 0x11DL;
			}
			long var8 = var6 ^ var2;
			long var10 = var6 << 1;
			if (var10 >= 256L) {
				var10 ^= 0x11DL;
			}
			long var12 = var10 ^ var2;
			field6745[0][var0] = var2 << 56 | var2 << 48 | var6 << 40 | var2 << 32 | var10 << 24 | var8 << 16 | var4 << 8 | var12;
			for (int var14 = 1; var14 < 8; var14++) {
				field6745[var14][var0] = field6745[var14 - 1][var0] >>> 8 | field6745[var14 - 1][var0] << 56;
			}
		}
		field6750[0] = 0L;
		for (int var15 = 1; var15 <= 10; var15++) {
			int var16 = (var15 - 1) * 8;
			field6750[var15] = field6745[0][var16] & 0xFF00000000000000L ^ field6745[1][var16 + 1] & 0xFF000000000000L ^ field6745[2][var16 + 2] & 0xFF0000000000L ^ field6745[3][var16 + 3] & 0xFF00000000L ^ field6745[4][var16 + 4] & 0xFF000000L ^ field6745[5][var16 + 5] & 0xFF0000L ^ field6745[6][var16 + 6] & 0xFF00L ^ field6745[7][var16 + 7] & 0xFFL;
		}
	}

	@ObfuscatedName("uj.u(I)V")
	public void method11993() {
		int var1 = 0;
		int var2 = 0;
		while (var1 < 8) {
			this.field6746[var1] = (long) this.field6748[var2] << 56 ^ ((long) this.field6748[var2 + 1] & 0xFFL) << 48 ^ ((long) this.field6748[var2 + 2] & 0xFFL) << 40 ^ ((long) this.field6748[var2 + 3] & 0xFFL) << 32 ^ ((long) this.field6748[var2 + 4] & 0xFFL) << 24 ^ ((long) this.field6748[var2 + 5] & 0xFFL) << 16 ^ ((long) this.field6748[var2 + 6] & 0xFFL) << 8 ^ (long) this.field6748[var2 + 7] & 0xFFL;
			var1++;
			var2 += 8;
		}
		for (int var3 = 0; var3 < 8; var3++) {
			this.field6755[var3] = this.field6746[var3] ^ (this.field6744[var3] = this.field6751[var3]);
		}
		for (int var4 = 1; var4 <= 10; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				this.field6753[var5] = 0L;
				int var6 = 0;
				int var7 = 56;
				while (var6 < 8) {
					this.field6753[var5] ^= field6745[var6][(int) (this.field6744[var5 - var6 & 0x7] >>> var7) & 0xFF];
					var6++;
					var7 -= 8;
				}
			}
			for (int var8 = 0; var8 < 8; var8++) {
				this.field6744[var8] = this.field6753[var8];
			}
			this.field6744[0] ^= field6750[var4];
			for (int var9 = 0; var9 < 8; var9++) {
				this.field6753[var9] = this.field6744[var9];
				int var10 = 0;
				int var11 = 56;
				while (var10 < 8) {
					this.field6753[var9] ^= field6745[var10][(int) (this.field6755[var9 - var10 & 0x7] >>> var11) & 0xFF];
					var10++;
					var11 -= 8;
				}
			}
			for (int var12 = 0; var12 < 8; var12++) {
				this.field6755[var12] = this.field6753[var12];
			}
		}
		for (int var13 = 0; var13 < 8; var13++) {
			this.field6751[var13] ^= this.field6755[var13] ^ this.field6746[var13];
		}
	}

	@ObfuscatedName("uj.j(I)V")
	public void method11979() {
		for (int var1 = 0; var1 < 32; var1++) {
			this.field6747[var1] = 0;
		}
		this.field6752 = 0;
		this.field6749 = 0;
		this.field6748[0] = 0;
		for (int var2 = 0; var2 < 8; var2++) {
			this.field6751[var2] = 0L;
		}
	}

	@ObfuscatedName("uj.a([BJ)V")
	public void method11980(byte[] arg0, long arg1) {
		int var4 = 0;
		int var5 = 8 - ((int) arg1 & 0x7) & 0x7;
		int var6 = this.field6749 * 310021735 & 0x7;
		long var7 = arg1;
		int var9 = 31;
		int var10 = 0;
		while (var9 >= 0) {
			int var11 = (this.field6747[var9] & 0xFF) + ((int) var7 & 0xFF) + var10;
			this.field6747[var9] = (byte) var11;
			var10 = var11 >>> 8;
			var7 >>>= 0x8;
			var9--;
		}
		while (arg1 > 8L) {
			int var12 = arg0[var4] << var5 & 0xFF | (arg0[var4 + 1] & 0xFF) >>> 8 - var5;
			if (var12 < 0 || var12 >= 256) {
				throw new RuntimeException();
			}
			this.field6748[this.field6752 * 587723285] = (byte) (this.field6748[this.field6752 * 587723285] | var12 >>> var6);
			this.field6752 += -1746973379;
			this.field6749 += (8 - var6) * 2050141527;
			if (this.field6749 * 310021735 == 512) {
				this.method11993();
				this.field6752 = 0;
				this.field6749 = 0;
			}
			this.field6748[this.field6752 * 587723285] = (byte) (var12 << 8 - var6 & 0xFF);
			this.field6749 += var6 * 2050141527;
			arg1 -= 8L;
			var4++;
		}
		int var13;
		if (arg1 > 0L) {
			var13 = arg0[var4] << var5 & 0xFF;
			this.field6748[this.field6752 * 587723285] = (byte) (this.field6748[this.field6752 * 587723285] | var13 >>> var6);
		} else {
			var13 = 0;
		}
		if ((long) var6 + arg1 < 8L) {
			this.field6749 = (int) ((long) this.field6749 + arg1 * 2050141527L);
			return;
		}
		this.field6752 += -1746973379;
		this.field6749 += (8 - var6) * 2050141527;
		long var14 = arg1 - (long) (8 - var6);
		if (this.field6749 * 310021735 == 512) {
			this.method11993();
			this.field6752 = 0;
			this.field6749 = 0;
		}
		this.field6748[this.field6752 * 587723285] = (byte) (var13 << 8 - var6 & 0xFF);
		this.field6749 += (int) var14 * 2050141527;
	}

	@ObfuscatedName("uj.s([BIB)V")
	public void method11981(byte[] arg0, int arg1) {
		this.field6748[this.field6752 * 587723285] = (byte) (this.field6748[this.field6752 * 587723285] | 0x80 >>> (this.field6749 * 310021735 & 0x7));
		this.field6752 += -1746973379;
		if (this.field6752 * 587723285 > 32) {
			while (true) {
				if (this.field6752 * 587723285 >= 64) {
					this.method11993();
					this.field6752 = 0;
					break;
				}
				this.field6748[(this.field6752 += -1746973379) * 587723285 - 1] = 0;
			}
		}
		while (this.field6752 * 587723285 < 32) {
			this.field6748[(this.field6752 += -1746973379) * 587723285 - 1] = 0;
		}
		System.arraycopy(this.field6747, 0, this.field6748, 32, 32);
		this.method11993();
		int var3 = 0;
		int var4 = arg1;
		while (var3 < 8) {
			long var5 = this.field6751[var3];
			arg0[var4] = (byte) (var5 >>> 56);
			arg0[var4 + 1] = (byte) (var5 >>> 48);
			arg0[var4 + 2] = (byte) (var5 >>> 40);
			arg0[var4 + 3] = (byte) (var5 >>> 32);
			arg0[var4 + 4] = (byte) (var5 >>> 24);
			arg0[var4 + 5] = (byte) (var5 >>> 16);
			arg0[var4 + 6] = (byte) (var5 >>> 8);
			arg0[var4 + 7] = (byte) var5;
			var3++;
			var4 += 8;
		}
	}

	@ObfuscatedName("et.c([BIII)[B")
	public static byte[] method2920(byte[] arg0, int arg1, int arg2) {
		byte[] var3;
		if (arg1 > 0) {
			var3 = new byte[arg2];
			for (int var4 = 0; var4 < arg2; var4++) {
				var3[var4] = arg0[arg1 + var4];
			}
		} else {
			var3 = arg0;
		}
		class569 var5 = new class569();
		var5.method11979();
		var5.method11980(var3, (long) (arg2 * 8));
		byte[] var6 = new byte[64];
		var5.method11981(var6, 0);
		return var6;
	}
}
