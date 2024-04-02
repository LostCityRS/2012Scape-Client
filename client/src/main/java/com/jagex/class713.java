package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aah")
public class class713 extends class150 {

	@ObfuscatedName("aah.s")
	public final int field8547;

	@ObfuscatedName("aah.c")
	public final int field8539;

	@ObfuscatedName("aah.m")
	public final int field8543;

	@ObfuscatedName("aah.t")
	public final int field8551;

	@ObfuscatedName("aah.l")
	public final int field8544;

	@ObfuscatedName("aah.f")
	public final int field8541;

	@ObfuscatedName("aah.d")
	public final int field8546;

	@ObfuscatedName("aah.z")
	public final int field8548;

	@ObfuscatedName("aah.n")
	public final int field8549;

	@ObfuscatedName("aah.o")
	public final int field8550;

	@ObfuscatedName("aah.q")
	public final int field8542;

	@ObfuscatedName("aah.p")
	public final int field8552;

	@ObfuscatedName("aah.w")
	public final int field8553;

	public class713(class814 arg0, int arg1, int arg2) {
		super(arg0);
		if (arg1 == 0) {
			int var4 = arg0.method15379();
			this.field8543 = (var4 >>> 16) * 1514830391;
			this.field8551 = (var4 & 0xFFFF) * -1464095753;
			this.field8539 = 1701651637;
		} else {
			this.field8543 = -1514830391;
			this.field8551 = 1464095753;
			this.field8539 = arg0.method15239() * -1701651637;
		}
		if (arg2 == 0) {
			int var5 = arg0.method15379();
			this.field8546 = (var5 >>> 16) * 890136331;
			this.field8548 = (var5 & 0xFFFF) * -1176868741;
			this.field8541 = -1454588401;
		} else {
			this.field8546 = -890136331;
			this.field8548 = 1176868741;
			this.field8541 = arg0.method15239() * 1454588401;
		}
		if (arg1 == 0 && arg2 == 0) {
			this.field8547 = arg0.method15220() * 2044944439;
		} else {
			this.field8547 = -2044944439;
		}
		this.field8550 = arg0.method15239() * -641340505;
		this.field8544 = arg0.method15220() * 378024481;
		this.field8549 = arg0.method15220() * -2093831575;
		this.field8542 = arg0.method15241() * 389995515;
		this.field8552 = arg0.method15239() * -190484265;
		this.field8553 = arg0.method15220() * 1687494629;
	}

	@ObfuscatedName("aah.j(I)V")
	public void method2873() {
		int var1;
		int var2;
		int var3;
		if (this.field8543 * -1661445241 >= 0) {
			var1 = this.field8543 * -256438784 + 256;
			var2 = this.field8551 * -720663040 + 256;
			var3 = this.field8547 * 1208636807;
		} else {
			class719 var4 = Statics.field1537[this.field8539 * 1516131939].method2854();
			class317 var5 = var4.method8565().field3464;
			var1 = (int) var5.field3475;
			var2 = (int) var5.field3477;
			var3 = var4.field9807;
		}
		int var6;
		int var7;
		if (this.field8551 * -1964341817 >= 0) {
			var6 = this.field8546 * -682015232 + 256;
			var7 = this.field8548 * 443377152 + 256;
		} else {
			class719 var8 = Statics.field1537[this.field8541 * 1299418897].method2854();
			class317 var9 = var8.method8565().field3464;
			var6 = (int) var9.field3475;
			var7 = (int) var9.field3477;
			if (var3 < 0) {
				var3 = var8.field9807;
			}
		}
		int var10 = this.field8553 * 2112488941 << 2;
		class1009 var11 = new class1009(client.field8980.method6098(), this.field8550 * -1410069481, var3, var3, var1, var2, this.field8544 * -1015033375 << 2, client.field9213 * 1194705519, client.field9213 * 1194705519 + this.field8542 * -1597901005, this.field8552 * 1889960679, var10, this.field8539 * 1516131939 + 1, this.field8541 * 1299418897 + 1, this.field8549 * 1757251033 << 2, false, 0, 0);
		var11.method17162(var6, var7, this.field8549 * 1757251033 << 2, client.field9213 * 1194705519 + this.field8542 * -1597901005);
		client.field9007.method11558(new class945(var11));
	}

	@ObfuscatedName("aah.s(B)Z")
	public boolean method2883() {
		class507 var1 = Statics.field4213.method11082(this.field8550 * -1410069481);
		boolean var2 = var1.method11104();
		class509 var3 = Statics.field566.method11144(var1.field5252 * 627575481);
		return var2 & var3.method11129();
	}
}
