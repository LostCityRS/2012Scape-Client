package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("np")
public class class393 {

	@ObfuscatedName("np.s")
	public byte field4186;

	@ObfuscatedName("np.c")
	public int field4173;

	@ObfuscatedName("np.m")
	public int field4178;

	@ObfuscatedName("np.t")
	public int field4179;

	@ObfuscatedName("np.l")
	public int field4177;

	@ObfuscatedName("np.f")
	public int field4181;

	@ObfuscatedName("np.d")
	public int field4182;

	@ObfuscatedName("np.z")
	public class370 field4176;

	@ObfuscatedName("np.n")
	public class796 field4184;

	@ObfuscatedName("np.o")
	public class996 field4185;

	@ObfuscatedName("np.q")
	public class938 field4188;

	@ObfuscatedName("np.p")
	public int field4180 = -1;

	@ObfuscatedName("np.w")
	public int field4187 = -1;

	public class393(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class836 arg7) {
		this.field4186 = arg0;
		this.field4173 = arg1;
		this.field4178 = arg2;
		this.field4179 = arg3;
		this.field4181 = arg4;
		this.field4177 = arg5;
		this.field4182 = arg6;
		if (arg7 != null && arg7 instanceof class974) {
			class974 var9 = (class974) arg7;
			this.field4180 = var9.field10510;
			this.field4187 = var9.field10509;
		}
	}

	@ObfuscatedName("np.u(I)Z")
	public boolean method6878() {
		return this.field4186 == 2 || this.field4186 == 3;
	}
}
