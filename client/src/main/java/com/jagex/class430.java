package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("oh")
public class class430 {

	@ObfuscatedName("oh.u")
	public class974 field4642;

	@ObfuscatedName("oh.j")
	public class430 field4641;

	@ObfuscatedName("oh.a")
	public static int field4643 = 0;

	@ObfuscatedName("up.u(Laku;I)Loh;")
	public static class430 method11871(class974 arg0) {
		class430 var1;
		if (Statics.field4644 == null) {
			var1 = new class430();
		} else {
			var1 = Statics.field4644;
			Statics.field4644 = Statics.field4644.field4641;
			var1.field4641 = null;
			field4643--;
		}
		var1.field4642 = arg0;
		return var1;
	}

	@ObfuscatedName("oh.j(I)V")
	public void method7646() {
		if (field4643 < 500) {
			this.field4642 = null;
			this.field4641 = Statics.field4644;
			Statics.field4644 = this;
			field4643++;
		}
	}
}
