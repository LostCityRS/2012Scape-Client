package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ci")
public final class class112 {

	@ObfuscatedName("ci.u")
	public class565 field1196;

	@ObfuscatedName("ci.j")
	public final int field1195;

	public class112(int arg0) {
		this.field1195 = arg0;
	}

	@ObfuscatedName("ci.u(I)V")
	public void method2377() {
		if (this.field1196 != null) {
			this.field1196.method11925();
		}
	}

	@ObfuscatedName("ci.j(III)V")
	public void method2372(int arg0, int arg1) {
		if (this.field1196 == null) {
			this.field1196 = new class565(this.field1195);
		}
		class802 var3 = (class802) this.field1196.method11923((long) arg0);
		if (var3 == null) {
			class802 var4 = new class802(arg1);
			this.field1196.method11927(var4, (long) arg0);
		} else {
			var3.field9556 = arg1;
		}
	}

	@ObfuscatedName("ci.a(II)I")
	public int method2373(int arg0) {
		class802 var2 = (class802) this.field1196.method11923((long) arg0);
		if (var2 == null) {
			class293 var3 = Statics.field6667.method4890(arg0);
			return var3.field3309 == 'i' ? 0 : -1;
		} else {
			return var2.field9556;
		}
	}

	@ObfuscatedName("ci.s(II)I")
	public int method2375(int arg0) {
		class433 var2 = Statics.field4645.method7668(arg0);
		int var3 = var2.field4669;
		int var4 = var2.field4670 == 31 ? -1 : (0x1 << var2.field4670 + 1) - 1;
		return (this.method2373(var3) & var4) >>> var2.field4668;
	}
}
