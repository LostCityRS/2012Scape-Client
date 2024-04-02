package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ale")
public class class1000 extends class948 {

	@ObfuscatedName("ale.l")
	public float field10587 = 0.0F;

	public class1000(int arg0, class814 arg1) {
		super(arg0);
		this.field10587 = arg1.method15324();
	}

	public class1000(int arg0, float arg1) {
		super(arg0);
		this.field10587 = arg1;
	}

	@ObfuscatedName("ale.y(FI)V")
	public void method17143(float arg0) {
		this.field10587 = arg0;
	}

	@ObfuscatedName("ale.j(FI)V")
	public void method16667(float arg0) {
	}

	@ObfuscatedName("ale.a(Lfi;Lkc;Lka;B)V")
	public void method16668(class195 arg0, class314 arg1, class320 arg2) {
		arg1.method5178(0.0F, 0.0F, 1.0F, this.field10587);
	}

	@ObfuscatedName("ale.s(Laet;I)V")
	public void method16671(class814 arg0) {
		this.field10587 = arg0.method15324();
	}
}
