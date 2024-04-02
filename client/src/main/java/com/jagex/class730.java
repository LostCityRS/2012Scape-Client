package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aal")
public class class730 extends class208 {

	public class730(class334 arg0, class334 arg1, class752 arg2) {
		super(arg0, arg1, arg2);
	}

	@ObfuscatedName("aal.d(ZIII)V")
	public void method3955(boolean arg0, int arg1, int arg2) {
		int var4 = this.method3956() * this.field2311.field2602 * 261452353 / 10000;
		Statics.field5187.method489(arg1, arg2 + 2, var4, this.field2311.field2607 * 1174834713 - 2, ((class752) this.field2311).field8828 * -1208706287, 0);
		Statics.field5187.method489(arg1 + var4, arg2 + 2, this.field2311.field2602 * 261452353 - var4, this.field2311.field2607 * 1174834713 - 2, 0, 0);
	}

	@ObfuscatedName("aal.f(ZIIS)V")
	public void method3957(boolean arg0, int arg1, int arg2) {
		Statics.field5187.method488(arg1 - 2, arg2, this.field2311.field2602 * 261452353 + 4, this.field2311.field2607 * 1174834713 + 2, ((class752) this.field2311).field8827 * 2132990345, 0);
		Statics.field5187.method488(arg1 - 1, arg2 + 1, this.field2311.field2602 * 261452353 + 2, this.field2311.field2607 * 1174834713, 0, 0);
	}
}
