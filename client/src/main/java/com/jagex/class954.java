package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajg")
public class class954 extends class800 {

	@ObfuscatedName("ajg.t")
	public class619 field10388;

	@ObfuscatedName("ajg.l")
	public String field10377;

	@ObfuscatedName("ajg.f")
	public class508[] field10378;

	@ObfuscatedName("ajg.d")
	public int[] field10385;

	@ObfuscatedName("ajg.z")
	public Object[] field10380;

	@ObfuscatedName("ajg.n")
	public long[] field10381;

	@ObfuscatedName("ajg.o")
	public int field10379;

	@ObfuscatedName("ajg.q")
	public int field10387;

	@ObfuscatedName("ajg.p")
	public int field10384;

	@ObfuscatedName("ajg.w")
	public int field10382;

	@ObfuscatedName("ajg.b")
	public int field10386;

	@ObfuscatedName("ajg.x")
	public int field10376;

	@ObfuscatedName("ajg.i")
	public class565[] field10383;

	public class954(class814 arg0) {
		int var2 = this.method16736(arg0);
		int var3 = 0;
		class508[] var4 = class508.method7977();
		while (arg0.field9626 * 803401371 < var2) {
			class508 var5 = this.method16735(arg0, var4);
			this.method16734(arg0, var3, var5);
			var3++;
		}
	}

	@ObfuscatedName("ajg.u(Laet;[Lsd;I)Lsd;")
	public class508 method16735(class814 arg0, class508[] arg1) {
		int var3 = arg0.method15239();
		if (var3 < 0 || var3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[var3];
	}

	@ObfuscatedName("ajg.j(Laet;S)I")
	public int method16736(class814 arg0) {
		arg0.field9626 = (arg0.field9629.length - 2) * -1748220013;
		int var2 = arg0.method15239();
		int var3 = arg0.field9629.length - 2 - var2 - 16;
		arg0.field9626 = var3 * -1748220013;
		int var4 = arg0.method15379();
		this.field10379 = arg0.method15239() * -227934445;
		this.field10387 = arg0.method15239() * 109526681;
		this.field10384 = arg0.method15239() * 1042743371;
		this.field10382 = arg0.method15239() * 84641609;
		this.field10386 = arg0.method15239() * 1035969421;
		this.field10376 = arg0.method15239() * 85578245;
		int var5 = arg0.method15220();
		if (var5 > 0) {
			this.field10383 = new class565[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.method15239();
				class565 var8 = new class565(class595.method2839(var7));
				this.field10383[var6] = var8;
				while (var7-- > 0) {
					int var9 = arg0.method15379();
					int var10 = arg0.method15379();
					var8.method11927(new class802(var10), (long) var9);
				}
			}
		}
		arg0.field9626 = 0;
		this.field10377 = arg0.method15219();
		this.field10378 = new class508[var4];
		return var3;
	}

	@ObfuscatedName("ajg.a(Laet;ILsd;I)V")
	public void method16734(class814 arg0, int arg1, class508 arg2) {
		int var4 = this.field10378.length;
		if (class508.field5271 == arg2) {
			if (this.field10380 == null) {
				this.field10380 = new String[var4];
			}
			this.field10380[arg1] = arg0.method15337().intern();
		} else if (class508.field5337 == arg2) {
			if (this.field10381 == null) {
				this.field10381 = new long[var4];
			}
			this.field10381[arg1] = arg0.method15246();
		} else {
			if (this.field10385 == null) {
				this.field10385 = new int[var4];
			}
			if (arg2.field6315) {
				this.field10385[arg1] = arg0.method15379();
			} else {
				this.field10385[arg1] = arg0.method15220();
			}
		}
		this.field10378[arg1] = arg2;
	}
}
