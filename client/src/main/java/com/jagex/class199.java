package com.jagex;

import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("fe")
public abstract class class199 {

	@ObfuscatedName("fe.u")
	public final class190 field2227;

	@ObfuscatedName("fe.j")
	public class193 field2219;

	@ObfuscatedName("fe.a")
	public class194 field2220;

	@ObfuscatedName("fe.s")
	public class188 field2221;

	@ObfuscatedName("fe.c")
	public class546 field2222;

	@ObfuscatedName("fe.m")
	public class191 field2234;

	@ObfuscatedName("fe.t")
	public class216 field2224;

	@ObfuscatedName("fe.l")
	public final class196 field2240;

	@ObfuscatedName("fe.f")
	public class192 field2226;

	@ObfuscatedName("fe.d")
	public int field2238;

	@ObfuscatedName("fe.z")
	public float field2228;

	@ObfuscatedName("fe.n")
	public final class317 field2229 = new class317();

	@ObfuscatedName("fe.o")
	public final class317 field2230 = new class317();

	@ObfuscatedName("fe.p")
	public final class317 field2232 = new class317();

	@ObfuscatedName("fe.w")
	public final class317 field2233 = new class317();

	@ObfuscatedName("fe.b")
	public final class317 field2246 = new class317();

	@ObfuscatedName("fe.x")
	public final class317 field2235 = new class317();

	@ObfuscatedName("fe.i")
	public float field2245;

	@ObfuscatedName("fe.v")
	public float field2237;

	@ObfuscatedName("fe.k")
	public float field2223;

	@ObfuscatedName("fe.h")
	public float field2239;

	@ObfuscatedName("fe.r")
	public float field2218;

	@ObfuscatedName("fe.g")
	public float field2241;

	@ObfuscatedName("fe.y")
	public boolean field2242;

	@ObfuscatedName("fe.e")
	public boolean field2243;

	@ObfuscatedName("fe.ay")
	public int field2244 = 0;

	@ObfuscatedName("fe.af")
	public float field2236 = 1.0F;

	@ObfuscatedName("fe.ar")
	public class565 field2225 = new class565(8);

	public class199(class190 arg0, class196 arg1) {
		this.field2227 = arg0;
		this.field2240 = arg1;
		this.method3688(true);
	}

	@ObfuscatedName("fe.u(ZI)V")
	public void method3688(boolean arg0) {
		this.field2220 = class194.field2205;
		this.field2221 = null;
		this.field2222 = null;
		this.field2234 = null;
		this.field2224 = null;
		if (class190.field2188 != this.field2227 && arg0) {
			this.field2219 = class193.field2203;
		} else {
			this.field2219 = class193.field2202;
		}
		this.field2226 = class192.field2197;
		this.field2229.method5373(100.0F, 100.0F, 100.0F);
		this.field2230.method5373(100.0F, 100.0F, 100.0F);
		this.field2228 = 0.05F;
		this.field2232.method5373(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.field2233.method5373(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.field2246.method5373(1.0F, 1.0F, 1.0F);
		this.field2235.method5373(1.0F, 1.0F, 1.0F);
		this.field2245 = 1.1F;
		this.field2237 = 1.1F;
		this.field2223 = 50.0F;
		this.field2239 = 10000.0F;
		this.field2241 = 1.5707964F;
		this.field2218 = 1.5707964F;
		this.field2238 = 5;
		this.field2242 = true;
		this.field2243 = true;
		this.field2244 = 0;
		this.field2236 = 1.0F;
		this.field2225.method11925();
	}

	@ObfuscatedName("fe.j(FLmv;[[[II)V")
	public void method3727(float arg0, class361 arg1, int[][][] arg2) {
		if (this.field2222 != null) {
			this.field2222.method11540(arg0);
		}
		if (this.field2224 != null) {
			this.field2224.method4014(arg0, arg1, arg2);
		}
		Iterator var4 = this.field2225.iterator();
		while (var4.hasNext()) {
			class948 var5 = (class948) var4.next();
			var5.method16667(arg0);
		}
	}

	@ObfuscatedName("fe.a(ZFLko;Lkn;Lko;Lko;I)V")
	public void method3811(boolean arg0, float arg1, class317 arg2, class316 arg3, class317 arg4, class317 arg5) {
		if (class192.field2196 == this.field2226) {
			class437.method7675(arg1, arg2, arg4, arg5, arg0 ? this.field2233 : this.field2232, arg0 ? this.field2230 : this.field2229, (float) this.field2244, this.field2236);
		} else if (class192.field2197 == this.field2226) {
			class438.method1697(arg1, arg2, arg3, arg4, arg5, arg0 ? this.field2233 : this.field2232, arg0 ? this.field2230 : this.field2229, (float) this.field2244, this.field2236);
		} else if (class192.field2199 == this.field2226) {
			class436.method3664(arg1, arg2, arg3, arg4, arg5, arg0 ? this.field2235 : this.field2246, arg0 ? this.field2237 : this.field2245);
		}
	}

	@ObfuscatedName("fe.s(Lfh;I)V")
	public void method3691(class193 arg0) {
		this.field2219 = arg0;
	}

	@ObfuscatedName("fe.c(Lfo;ZI)Ltd;")
	public class546 method3692(class188 arg0, boolean arg1) throws class884 {
		if (class193.field2202 == this.field2219 && !arg1) {
			throw new class884();
		}
		this.field2221 = arg0;
		if (class188.field2165 == arg0) {
			this.field2222 = new class870(this);
		} else if (class188.field2169 == arg0) {
			this.field2222 = new class869(this);
		} else if (class188.field2167 == arg0) {
			this.field2222 = new class868(this);
		} else if (class188.field2164 == arg0) {
			this.field2222 = new class975(this);
		} else if (class188.field2168 == arg0) {
			this.field2222 = new class976(this);
		} else if (class188.field2170 == arg0) {
			this.field2222 = new class872(this);
		}
		return this.field2222;
	}

	@ObfuscatedName("fe.m(Lfg;ZI)Lgo;")
	public class216 method3693(class191 arg0, boolean arg1) throws class884 {
		if (class193.field2202 == this.field2219 && !arg1) {
			throw new class884();
		}
		this.field2234 = arg0;
		if (class191.field2193 == arg0) {
			this.field2224 = new class734(this);
		} else if (class191.field2192 == arg0) {
			this.field2224 = new class733(this);
		} else if (class191.field2191 == arg0) {
			this.field2224 = new class905(this);
		} else if (class191.field2194 == arg0) {
			this.field2224 = new class906(this);
		}
		return this.field2224;
	}

	@ObfuscatedName("fe.t(B)Z")
	public boolean method3715() {
		if (class190.field2188 == this.field2227 && class193.field2202 == this.field2219) {
			return true;
		} else {
			return class190.field2189 == this.field2227 && class193.field2203 == this.field2219;
		}
	}

	@ObfuscatedName("fe.l(FI)V")
	public void method3695(float arg0) throws class884 {
		if (!this.method3715()) {
			throw new class884();
		}
	}

	@ObfuscatedName("fe.f(FB)V")
	public void method3696(float arg0) throws class884 {
		if (!this.method3715()) {
			throw new class884();
		}
		this.field2228 = arg0;
	}

	@ObfuscatedName("fe.d(Lfu;B)V")
	public void method3697(class192 arg0) throws class884 {
		if (!this.method3715()) {
			throw new class884();
		}
		this.field2226 = arg0;
	}

	@ObfuscatedName("fe.z(Lko;I)V")
	public void method3698(class317 arg0) throws class884 {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new class884();
		}
		this.field2232.method5334(arg0);
	}

	@ObfuscatedName("fe.n(Lko;I)V")
	public void method3755(class317 arg0) throws class884 {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new class884();
		}
		this.field2233.method5334(arg0);
	}

	@ObfuscatedName("fe.o(Lko;B)V")
	public void method3700(class317 arg0) throws class884 {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new class884();
		}
		this.field2229.method5334(arg0);
	}

	@ObfuscatedName("fe.q(Lko;B)V")
	public void method3771(class317 arg0) throws class884 {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new class884();
		}
		this.field2230.method5334(arg0);
	}

	@ObfuscatedName("fe.p(Lko;FI)V")
	public void method3702(class317 arg0, float arg1) throws class884 {
		if (!this.method3715() || this.field2226.field2200) {
			throw new class884();
		}
		this.field2246.method5334(arg0);
		this.field2235.method5334(arg0);
		this.field2245 = arg1;
		this.field2237 = arg1;
	}

	@ObfuscatedName("fe.w(Lko;FB)V")
	public void method3768(class317 arg0, float arg1) throws class884 {
		if (!this.method3715() || this.field2226.field2200) {
			throw new class884();
		}
		this.field2246.method5334(arg0);
		this.field2245 = arg1;
	}

	@ObfuscatedName("fe.b(Lko;FI)V")
	public void method3687(class317 arg0, float arg1) throws class884 {
		if (!this.method3715() || this.field2226.field2200) {
			throw new class884();
		}
		this.field2235.method5334(arg0);
		this.field2237 = arg1;
	}

	@ObfuscatedName("fe.x(FFS)V")
	public void method3705(float arg0, float arg1) throws class884 {
		if (!this.method3715()) {
			throw new class884();
		}
		this.field2223 = arg0;
		this.field2239 = arg1;
	}

	@ObfuscatedName("fe.i(FFB)V")
	public void method3739(float arg0, float arg1) throws class884 {
		if (!this.method3715()) {
			throw new class884();
		}
		this.field2218 = arg0;
		this.field2241 = arg1;
	}

	@ObfuscatedName("fe.v(ZZB)V")
	public void method3707(boolean arg0, boolean arg1) throws class884 {
		if (!this.method3715()) {
			throw new class884();
		}
		this.field2242 = arg0;
		this.field2243 = arg1;
	}

	@ObfuscatedName("fe.k(IFI)V")
	public void method3708(int arg0, float arg1) throws class884 {
		if (!this.method3715() || !this.field2226.field2200) {
			throw new class884();
		}
		this.field2244 = arg0;
		this.field2236 = arg1;
	}

	@ObfuscatedName("fe.h(Laja;I)V")
	public void method3709(class948 arg0) {
		this.field2225.method11927(arg0, (long) arg0.field10351);
	}

	@ObfuscatedName("fe.r(II)V")
	public void method3710(int arg0) {
		class948 var2 = (class948) this.field2225.method11923((long) arg0);
		if (var2 != null) {
			var2.method6979();
		}
	}

	@ObfuscatedName("fe.g(IB)Laja;")
	public class948 method3711(int arg0) {
		return (class948) this.field2225.method11923((long) arg0);
	}

	@ObfuscatedName("fe.y(I)V")
	public void method3750() {
		this.field2225.method11925();
	}

	@ObfuscatedName("fe.e(I)Z")
	public boolean method3735() {
		if (this.field2222 == null || this.field2224 == null) {
			return false;
		} else if (this.field2222.method11541()) {
			return this.field2224.method4030();
		} else {
			return false;
		}
	}

	@ObfuscatedName("fe.ay(Lfi;Lkc;Lka;III)V")
	public void method3713(class195 arg0, class314 arg1, class320 arg2, int arg3, int arg4) {
		if (this.field2222 == null || this.field2224 == null) {
			return;
		}
		this.field2222.method11543(arg0, arg1, arg3, arg4);
		this.field2224.method4029(arg0, arg3, arg4);
		if (class194.field2205 == this.field2220) {
			arg2.method5394(this.field2223, this.field2239, this.field2218, this.field2241);
		} else {
			arg2.method5395(this.field2223, this.field2239, (float) this.field2238);
		}
		Iterator var6 = this.field2225.iterator();
		while (var6.hasNext()) {
			class948 var7 = (class948) var6.next();
			var7.method16668(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("fe.af(I)Lfh;")
	public class193 method3764() {
		return this.field2219;
	}

	@ObfuscatedName("fe.ar(I)Lgo;")
	public class216 method3699() {
		return this.field2224;
	}

	@ObfuscatedName("fe.an(I)Ltd;")
	public class546 method3716() {
		return this.field2222;
	}

	@ObfuscatedName("fe.ap(I)Lfb;")
	public class196 method3717() {
		return this.field2240;
	}

	@ObfuscatedName("fe.ag(I)Lfo;")
	public class188 method3751() {
		return this.field2221;
	}

	@ObfuscatedName("fe.as(B)Lfg;")
	public class191 method3719() {
		return this.field2234;
	}

	@ObfuscatedName("fe.ai(I)Lko;")
	public class317 method3720() {
		return this.field2224 == null ? null : this.field2224.method4016();
	}

	@ObfuscatedName("fe.ao(I)Lko;")
	public class317 method3828() {
		return this.field2222 == null ? null : this.field2222.method11550();
	}

	@ObfuscatedName("fe.al(B)Ladu;")
	public class810 method3722() {
		return this.field2224 == null ? null : this.field2224.method4017();
	}

	@ObfuscatedName("fe.at(B)F")
	public float method3723() {
		class317 var1 = this.method3720();
		class317 var2 = this.method3828();
		float var3 = 0.0F;
		if (var1 != null && var2 != null) {
			class317 var4 = class317.method5377(var2, var1);
			float var5 = (float) Math.sqrt((double) (var4.field3477 * var4.field3477 + var4.field3475 * var4.field3475));
			var3 = (float) Math.atan2((double) -var4.field3476, (double) var5);
			var1.method5291();
			var2.method5291();
		}
		return var3;
	}

	@ObfuscatedName("fe.ax(B)F")
	public float method3791() {
		class317 var1 = this.method3720();
		class317 var2 = this.method3828();
		float var3 = 0.0F;
		if (var1 != null && var2 != null) {
			class317 var4 = class317.method5377(var1, var2);
			var4.field3476 = 0.0F;
			var3 = (float) Math.atan2((double) var4.field3475, (double) var4.field3477);
			var1.method5291();
			var2.method5291();
		}
		return (float) (3.141592653589793D - (double) var3);
	}

	@ObfuscatedName("fe.aw(B)F")
	public float method3725() {
		return 0.0F;
	}

	@ObfuscatedName("fe.aa(I)Lkn;")
	public class316 method3726() {
		class316 var1 = class316.method5206();
		var1.method5217(this.method3791(), this.method3723(), this.method3725());
		return var1;
	}

	@ObfuscatedName("fe.am(B)Lko;")
	public class317 method3809() {
		return this.field2232;
	}

	@ObfuscatedName("fe.ad(B)Lko;")
	public class317 method3728() {
		return this.field2233;
	}

	@ObfuscatedName("fe.az(B)F")
	public float method3729() {
		return this.field2228;
	}

	@ObfuscatedName("fe.ak(I)Lko;")
	public class317 method3730() {
		return this.field2229;
	}

	@ObfuscatedName("fe.av(S)Lko;")
	public class317 method3724() {
		return this.field2230;
	}

	@ObfuscatedName("fe.aj(B)F")
	public float method3732() {
		return this.field2223;
	}

	@ObfuscatedName("fe.ah(I)F")
	public float method3778() {
		return this.field2239;
	}

	@ObfuscatedName("fe.au(I)Z")
	public boolean method3734() {
		return this.field2242;
	}

	@ObfuscatedName("fe.ae(I)Z")
	public boolean method3765() {
		return this.field2243;
	}
}
