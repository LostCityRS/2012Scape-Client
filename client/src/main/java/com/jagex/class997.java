package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("alu")
public class class997 extends class941 {

	@ObfuscatedName("alu.f")
	public byte[] field10574;

	public class997(int arg0, byte[] arg1, int arg2, int arg3) {
		this.field10295 = arg0;
		this.field10574 = arg1;
		this.field10294 = arg2;
		this.field10292 = arg3;
	}

	@ObfuscatedName("alu.f(Lme;)Lalu;")
	public class997 method17108(class375 arg0) {
		this.field10574 = arg0.method6555(this.field10574);
		this.field10295 = arg0.method6552(this.field10295);
		if (this.field10294 == this.field10292) {
			this.field10294 = this.field10292 = arg0.method6553(this.field10294);
		} else {
			this.field10294 = arg0.method6553(this.field10294);
			this.field10292 = arg0.method6553(this.field10292);
			if (this.field10294 == this.field10292) {
				this.field10294--;
			}
		}
		return this;
	}

	@ObfuscatedName("alu.u()I")
	public int method16496() {
		return this.field10574.length;
	}

	@ObfuscatedName("alu.j(III)Laib;")
	public class938 method16502(int arg0, int arg1, int arg2) {
		return this.field10574 == null || this.field10574.length == 0 ? null : new class994(this, arg0, arg1, arg2);
	}
}
