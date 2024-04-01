package com.jagex;

import deob.ObfuscatedName;
import java.lang.ref.SoftReference;

@ObfuscatedName("alg")
public class class1007 extends class953 {

	@ObfuscatedName("alg.f")
	public SoftReference field10604;

	public class1007(class457 arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.field10604 = new SoftReference(arg1);
	}

	@ObfuscatedName("alg.u()Ljava/lang/Object;")
	public Object method16728() {
		return this.field10604.get();
	}

	@ObfuscatedName("alg.j()Z")
	public boolean method16730() {
		return true;
	}
}
