package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("dm")
public abstract class class150 {

	@ObfuscatedName("dm.u")
	public final int field1566;

	public class150(Packet arg0) {
		this.field1566 = arg0.g2();
	}

	@ObfuscatedName("gq.u(Laet;I)Ldm;")
	public static class150 method3928(Packet arg0) {
		int var1 = arg0.g1();
		class634 var2 = class634.method12118(var1);
		class150 var3 = null;
		switch(var2.field7412) {
			case 0:
				var3 = new class709(arg0);
				break;
			case 1:
				var3 = new class695(arg0);
				break;
			case 2:
				var3 = new class707(arg0);
				break;
			case 3:
				var3 = new class704(arg0);
				break;
			case 4:
				var3 = new class702(arg0);
				break;
			case 5:
				var3 = new class693(arg0);
				break;
			case 6:
				var3 = new class691(arg0);
				break;
			case 7:
				var3 = new class706(arg0);
				break;
			case 8:
				var3 = new class712(arg0);
				break;
			case 9:
				var3 = new class710(arg0);
				break;
			case 10:
				var3 = new class701(arg0);
				break;
			case 11:
				var3 = new class713(arg0, 0, 1);
				break;
			case 12:
				var3 = new class901(arg0);
				break;
			case 13:
				var3 = new class900(arg0);
				break;
			case 14:
				var3 = new class696(arg0);
				break;
			case 15:
				var3 = new class698(arg0);
				break;
			case 16:
				var3 = new class713(arg0, 1, 0);
				break;
			case 17:
				var3 = new class699(arg0, true);
			case 18:
			case 20:
			case 24:
			default:
				break;
			case 19:
				var3 = new class697(arg0);
				break;
			case 21:
				var3 = new class708(arg0);
				break;
			case 22:
				var3 = new class700(arg0);
				break;
			case 23:
				var3 = new class711(arg0);
				break;
			case 25:
				var3 = new class705(arg0);
				break;
			case 26:
				var3 = new class699(arg0, false);
				break;
			case 27:
				var3 = new class713(arg0, 0, 0);
				break;
			case 28:
				var3 = new class692(arg0);
				break;
			case 29:
				var3 = new class713(arg0, 1, 1);
				break;
			case 30:
				var3 = new class694(arg0);
		}
		return var3;
	}

	@ObfuscatedName("dm.a(B)V")
	public void method2874() {
	}

	@ObfuscatedName("dm.s(B)Z")
	public boolean method2883() {
		return true;
	}

	@ObfuscatedName("dm.j(I)V")
	public abstract void method2873();
}
