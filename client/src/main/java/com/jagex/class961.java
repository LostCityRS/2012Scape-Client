package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ajw")
public final class class961 extends class809 {

	@ObfuscatedName("ajw.n")
	public static class961[] field10435 = new class961[0];

	@ObfuscatedName("ajw.p")
	public int field10436;

	@ObfuscatedName("ajw.w")
	public int field10434;

	@ObfuscatedName("ajw.b")
	public int field10431;

	@ObfuscatedName("ajw.x")
	public long field10433;

	@ObfuscatedName("ajw.i")
	public int field10437;

	@ObfuscatedName("t.ar(II)V")
	public static void method1351(int arg0) {
		Statics.field10432 = arg0;
		field10435 = new class961[arg0];
		Statics.field497 = 0;
	}

	@ObfuscatedName("oo.an(IIIJII)Lajw;")
	public static class961 method7559(int arg0, int arg1, int arg2, long arg3, int arg4) {
		class961[] var6 = field10435;
		synchronized (field10435) {
			class961 var7;
			if (Statics.field497 == 0) {
				var7 = new class961();
			} else {
				var7 = field10435[--Statics.field497];
			}
			var7.field10436 = arg0;
			var7.field10434 = arg1;
			var7.field10431 = arg2;
			var7.field10433 = arg3;
			var7.field10437 = arg4;
			return var7;
		}
	}

	@ObfuscatedName("ajw.u(I)I")
	public int method15181() {
		return this.field10436;
	}

	@ObfuscatedName("ajw.j(B)I")
	public int method15182() {
		return this.field10434;
	}

	@ObfuscatedName("ajw.a(I)I")
	public int method15183() {
		return this.field10431;
	}

	@ObfuscatedName("ajw.c(B)J")
	public long method15185() {
		return this.field10433;
	}

	@ObfuscatedName("ajw.s(I)I")
	public int method15184() {
		return this.field10437;
	}

	@ObfuscatedName("ajw.t(I)V")
	public void method15186() {
		class961[] var1 = field10435;
		synchronized (field10435) {
			if (Statics.field497 < Statics.field10432 - 1) {
				field10435[++Statics.field497 - 1] = this;
			}
		}
	}
}
