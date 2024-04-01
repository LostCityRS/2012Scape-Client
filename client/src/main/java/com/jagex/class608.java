package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vc")
public class class608 {

	@ObfuscatedName("vc.u")
	public class609 field7193;

	@ObfuscatedName("vc.j")
	public int field7192;

	@ObfuscatedName("vc.a")
	public int field7194;

	@ObfuscatedName("vc.s")
	public boolean field7195 = false;

	@ObfuscatedName("vc.u(Laet;B)V")
	public void method12486(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method12483(arg0, var2);
		}
	}

	@ObfuscatedName("vc.j(Laet;II)V")
	public void method12483(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field7192 = arg0.method15411();
		} else if (arg1 == 2) {
			this.field7194 = arg0.method15241();
		} else if (arg1 == 3) {
			this.field7195 = true;
		} else if (arg1 == 4) {
			this.field7192 = -1;
		}
	}

	@ObfuscatedName("vc.a(Lra;IZI)Lce;")
	public class118 method12484(class14 arg0, int arg1, boolean arg2) {
		long var4 = (long) (this.field7192 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.field397 << 19);
		class118 var6 = (class118) this.field7193.field7202.method7916(var4);
		if (var6 != null) {
			return var6;
		} else if (this.field7193.field7199.method5630(this.field7192)) {
			class140 var7 = class125.method2590(this.field7193.field7199, this.field7192, 0);
			if (var7 != null) {
				var7.method2776();
				if (arg2) {
					var7.method2778();
				}
				for (int var8 = 0; var8 < arg1; var8++) {
					var7.method2733();
				}
			}
			class118 var9 = arg0.method517(var7, true);
			if (var9 != null) {
				this.field7193.field7202.method7937(var9, var4);
			}
			return var9;
		} else {
			return null;
		}
	}

	@ObfuscatedName("vc.s(B)Z")
	public boolean method12485() {
		return this.field7193.field7199.method5630(this.field7192);
	}
}
