package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("adu")
public class class810 extends class399 {

	@ObfuscatedName("adu.s")
	public static class810[] field9596 = new class810[0];

	@ObfuscatedName("adu.m")
	public int field9595;

	@ObfuscatedName("adu.t")
	public int field9594;

	@ObfuscatedName("adu.l")
	public int field9597;

	@ObfuscatedName("adu.f")
	public int field9598;

	@ObfuscatedName("rc.u(IIIIB)Ladu;")
	public static class810 method8611(int arg0, int arg1, int arg2, int arg3) {
		class810[] var4 = field9596;
		synchronized (field9596) {
			if (Statics.field2329 == 0) {
				return new class810(arg0, arg1, arg2, arg3);
			} else {
				field9596[--Statics.field2329].method15212(arg0, arg1, arg2, arg3);
				return field9596[Statics.field2329];
			}
		}
	}

	public class810(int arg0, int arg1, int arg2, int arg3) {
		this.field9595 = arg0;
		this.field9594 = arg1;
		this.field9597 = arg2;
		this.field9598 = arg3;
	}

	@ObfuscatedName("adu.j(IIIII)V")
	public void method15212(int arg0, int arg1, int arg2, int arg3) {
		this.field9595 = arg0;
		this.field9594 = arg1;
		this.field9597 = arg2;
		this.field9598 = arg3;
	}

	@ObfuscatedName("adu.a(I)Lko;")
	public class317 method15209() {
		return new class317((float) this.field9594, (float) this.field9597, (float) this.field9598);
	}

	public String toString() {
		return "Level: " + this.field9595 + " Coord: " + this.field9594 + "," + this.field9597 + "," + this.field9598 + " Coord Split: " + (this.field9594 >> 15) + "," + (this.field9598 >> 15) + "," + (this.field9594 >> 9 & 0x3F) + "," + (this.field9598 >> 9 & 0x3F) + "," + (this.field9594 & 0x1FF) + "," + (this.field9598 & 0x1FF);
	}
}
