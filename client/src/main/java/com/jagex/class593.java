package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vq")
public class class593 {

	@ObfuscatedName("vq.c")
	public int[] field7130 = new int[3];

	@ObfuscatedName("vq.m")
	public int[] field7128 = new int[3];

	@ObfuscatedName("vq.t")
	public int[] field7132 = new int[2];

	@ObfuscatedName("vq.l")
	public int[] field7126 = new int[2];

	@ObfuscatedName("vq.f")
	public short[] field7134;

	@ObfuscatedName("vq.d")
	public short[] field7135;

	public class593(class592 arg0) {
		this.field7130[0] = arg0.field7081 * 1542515557;
		this.field7130[1] = arg0.field7090 * -534244735;
		this.field7130[2] = arg0.field7093 * 1957681375;
		this.field7128[0] = arg0.field7091 * 670193521;
		this.field7128[1] = arg0.field7092 * -17512913;
		this.field7128[2] = arg0.field7119 * 1909143639;
		this.field7132[0] = arg0.field7101 * -1762929121;
		this.field7132[1] = arg0.field7120 * 1142780845;
		this.field7126[0] = arg0.field7111 * -305597009;
		this.field7126[1] = arg0.field7104 * 1129676251;
		if (arg0.field7066 != null) {
			this.field7134 = new short[arg0.field7066.length];
			System.arraycopy(arg0.field7066, 0, this.field7134, 0, this.field7134.length);
		}
		if (arg0.field7100 != null) {
			this.field7135 = new short[arg0.field7100.length];
			System.arraycopy(arg0.field7100, 0, this.field7135, 0, this.field7135.length);
		}
	}

	@ObfuscatedName("agg.u(Lvn;Laet;S)Lvq;")
	public static class593 method15930(class592 arg0, class814 arg1) {
		class593 var2 = new class593(arg0);
		int var3 = arg1.method15220();
		boolean var4 = (var3 & 0x1) != 0;
		boolean var5 = (var3 & 0x2) != 0;
		boolean var6 = (var3 & 0x4) != 0;
		boolean var7 = (var3 & 0x8) != 0;
		if (var4) {
			var2.field7130[0] = arg1.method15411();
			var2.field7128[0] = arg1.method15411();
			if (arg0.field7090 * -534244735 != -1 || arg0.field7092 * -17512913 != -1) {
				var2.field7130[1] = arg1.method15411();
				var2.field7128[1] = arg1.method15411();
			}
			if (arg0.field7093 * 1957681375 != -1 || arg0.field7119 * 1909143639 != -1) {
				var2.field7130[2] = arg1.method15411();
				var2.field7128[2] = arg1.method15411();
			}
		}
		if (var5) {
			var2.field7132[0] = arg1.method15411();
			var2.field7126[0] = arg1.method15411();
			if (arg0.field7120 * 1142780845 != -1 || arg0.field7104 * 1129676251 != -1) {
				var2.field7132[1] = arg1.method15411();
				var2.field7126[1] = arg1.method15411();
			}
		}
		if (var6) {
			int var8 = arg1.method15239();
			int[] var9 = new int[] { var8 & 0xF, var8 >> 4 & 0xF, var8 >> 8 & 0xF, var8 >> 12 & 0xF };
			for (int var10 = 0; var10 < 4; var10++) {
				if (var9[var10] != 15) {
					var2.field7134[var9[var10]] = (short) arg1.method15239();
				}
			}
		}
		if (var7) {
			int var11 = arg1.method15220();
			int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
			for (int var13 = 0; var13 < 2; var13++) {
				if (var12[var13] != 15) {
					var2.field7135[var12[var13]] = (short) arg1.method15239();
				}
			}
		}
		return var2;
	}
}
