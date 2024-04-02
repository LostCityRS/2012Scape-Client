package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aau")
public class class732 extends class208 {

	@ObfuscatedName("aau.t")
	public class118 field8728;

	public class732(class334 arg0, class334 arg1, class751 arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("aau.u(B)V")
	public void method3936() {
		super.method3936();
		this.field8728 = class308.method1624(this.field2310, ((class751) this.field2311).field8826 * 144470225);
	}

	@ObfuscatedName("aau.d(ZIII)V")
	public void method3955(boolean arg0, int arg1, int arg2) {
		int var4 = this.method3956() * this.field2311.field2602 * 261452353 / 10000;
		int[] var5 = new int[4];
		Statics.field5187.method453(var5);
		Statics.field5187.method659(arg1, arg2 + 2, arg1 + var4, this.field2311.field2607 * 1174834713 + arg2);
		this.field8728.method2511(arg1, arg2 + 2, this.field2311.field2602 * 261452353, this.field2311.field2607 * 1174834713);
		Statics.field5187.method659(var5[0], var5[1], var5[2], var5[3]);
	}

	@ObfuscatedName("aau.f(ZIIS)V")
	public void method3957(boolean arg0, int arg1, int arg2) {
		Statics.field5187.method488(arg1 - 2, arg2, this.field2311.field2602 * 261452353 + 4, this.field2311.field2607 * 1174834713 + 2, ((class751) this.field2311).field8825 * 562185493, 0);
		Statics.field5187.method488(arg1 - 1, arg2 + 1, this.field2311.field2602 * 261452353 + 2, this.field2311.field2607 * 1174834713, 0, 0);
	}

	@ObfuscatedName("aau.a(I)Z")
	public boolean method3931() {
		return super.method3931() ? this.field2310.method5630(((class751) this.field2311).field8826 * 144470225) : false;
	}
}
