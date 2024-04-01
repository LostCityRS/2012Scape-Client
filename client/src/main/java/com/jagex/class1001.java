package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("alj")
public class class1001 extends class948 {

	@ObfuscatedName("alj.l")
	public class180 field10590;

	@ObfuscatedName("alj.f")
	public float field10589;

	@ObfuscatedName("alj.d")
	public float field10591;

	@ObfuscatedName("alj.z")
	public float field10588;

	public class1001(int arg0, class180 arg1, float arg2, float arg3) {
		super(arg0);
		this.field10590 = arg1;
		this.field10589 = arg2;
		this.field10591 = arg3;
	}

	public class1001(int arg0, Packet arg1) {
		super(arg0);
		this.field10590 = class180.method7070(arg1.g1());
		this.field10589 = arg1.method15324();
		this.field10591 = arg1.method15324();
	}

	@ObfuscatedName("alj.j(FI)V")
	public void method16667(float arg0) {
		this.field10588 += this.field10591 * arg0;
	}

	@ObfuscatedName("alj.a(Lfi;Lkc;Lka;B)V")
	public void method16668(class195 arg0, class314 arg1, class320 arg2) {
		float var4 = (float) Math.sin((double) this.field10588);
		float var5 = this.field10589 * var4;
		if (class180.field2127 == this.field10590) {
			arg0.field2212 = (int) ((float) arg0.field2212 + var5);
			arg1.method5116(var5, 0.0F, 0.0F);
		} else if (class180.field2125 == this.field10590) {
			arg0.field2211 = (int) ((float) arg0.field2211 + var5);
			arg1.method5116(0.0F, var5, 0.0F);
		} else if (class180.field2130 == this.field10590) {
			arg0.field2213 = (int) ((float) arg0.field2213 + var5);
			arg1.method5116(0.0F, 0.0F, var5);
		} else if (class180.field2126 == this.field10590) {
			arg1.method5178(1.0F, 0.0F, 0.0F, var5);
		} else if (class180.field2128 == this.field10590) {
			arg1.method5178(0.0F, 1.0F, 0.0F, var5);
		} else if (class180.field2129 == this.field10590) {
			arg1.method5178(0.0F, 0.0F, 1.0F, var5);
		}
	}

	@ObfuscatedName("alj.s(Laet;I)V")
	public void method16671(Packet arg0) {
		this.field10590 = class180.method7070(arg0.g1());
		this.field10589 = arg0.method15324();
		this.field10591 = arg0.method15324();
	}
}
