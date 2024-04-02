
import deob.ObfuscatedName;

@ObfuscatedName("gg")
public class class223 {

	public class223() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gg.u(II)Z")
	public static final boolean method4231(int arg0, int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@ObfuscatedName("gg.j(II)Z")
	public static final boolean method4157(int arg0, int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@ObfuscatedName("gg.a(II)Z")
	public static final boolean method4156(int arg0, int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@ObfuscatedName("gg.s(II)Z")
	public static final boolean method4155(int arg0, int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@ObfuscatedName("gg.c(II)Z")
	public static final boolean method4256(int arg0, int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@ObfuscatedName("gg.m(II)Z")
	public static final boolean method4159(int arg0, int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@ObfuscatedName("gg.t(II)Z")
	public static final boolean method4257(int arg0, int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@ObfuscatedName("gg.l(II)Z")
	public static final boolean method4161(int arg0, int arg1) {
		return false;
	}

	@ObfuscatedName("gg.f(II)Z")
	public static final boolean method4249(int arg0, int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@ObfuscatedName("gg.d(II)Z")
	public static final boolean method4163(int arg0, int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@ObfuscatedName("gg.z(II)Z")
	public static final boolean method4164(int arg0, int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@ObfuscatedName("gg.n(II)Z")
	public static final boolean method4165(int arg0, int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@ObfuscatedName("gg.o(II)Z")
	public static final boolean method4166(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@ObfuscatedName("gg.q(II)Z")
	public static final boolean method4167(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@ObfuscatedName("gg.p(II)Z")
	public static final boolean method4233(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@ObfuscatedName("gg.w(II)Z")
	public static final boolean method4169(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@ObfuscatedName("gg.b(II)Z")
	public static final boolean method4179(int arg0, int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@ObfuscatedName("gg.x(II)Z")
	public static final boolean method4171(int arg0, int arg1) {
		return (method4231(arg0, arg1) | method4157(arg0, arg1) | method4156(arg0, arg1)) & method4166(arg0, arg1);
	}

	@ObfuscatedName("gg.i(II)Z")
	public static final boolean method4172(int arg0, int arg1) {
		return method4167(arg0, arg1) & ((arg0 & 0x2000) != 0 | method4256(arg0, arg1) | method4165(arg0, arg1));
	}

	@ObfuscatedName("gg.v(II)Z")
	public static final boolean method4173(int arg0, int arg1) {
		if (method4233(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method4159(arg0, arg1) | method4257(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method4256(arg0, arg1) | method4165(arg0, arg1));
		} else {
			return false;
		}
	}

	@ObfuscatedName("gg.k(II)Z")
	public static final boolean method4224(int arg0, int arg1) {
		return method4161(arg0, arg1) & method4169(arg0, arg1);
	}

	@ObfuscatedName("gg.h(II)Z")
	public static final boolean method4175(int arg0, int arg1) {
		return method4249(arg0, arg1) & method4179(arg0, arg1);
	}

	@ObfuscatedName("gg.r(II)Z")
	public static final boolean method4176(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method4231(arg0, arg1) || method4171(arg0, arg1);
	}

	@ObfuscatedName("gg.g(II)Z")
	public static final boolean method4177(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method4157(arg0, arg1) || method4171(arg0, arg1);
	}

	@ObfuscatedName("gg.y(II)Z")
	public static final boolean method4178(int arg0, int arg1) {
		return (arg0 & 0x70000) != 0 || method4156(arg0, arg1) || method4171(arg0, arg1);
	}

	@ObfuscatedName("gg.e(II)Z")
	public static final boolean method4230(int arg0, int arg1) {
		boolean var2 = (arg1 & 0x37) == 0 ? method4173(arg0, arg1) : method4172(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method4256(arg0, arg1) | var2;
	}

	@ObfuscatedName("gg.ay(II)Z")
	public static final boolean method4180(int arg0, int arg1) {
		return method4159(arg0, arg1) || method4173(arg0, arg1);
	}

	@ObfuscatedName("gg.af(II)Z")
	public static final boolean method4181(int arg0, int arg1) {
		return (arg0 & 0x40000) != 0 | method4257(arg0, arg1) || method4173(arg0, arg1);
	}

	@ObfuscatedName("gg.ar(II)Z")
	public static final boolean method4245(int arg0, int arg1) {
		return method4161(arg0, arg1) || method4224(arg0, arg1);
	}

	@ObfuscatedName("gg.an(II)Z")
	public static final boolean method4183(int arg0, int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@ObfuscatedName("gg.ap(II)Z")
	public static final boolean method4184(int arg0, int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@ObfuscatedName("gg.ag(II)Z")
	public static final boolean method4250(int arg0, int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@ObfuscatedName("gg.as(II)Z")
	public static final boolean method4186(int arg0, int arg1) {
		return (arg0 & 0x60000) != 0 | method4249(arg0, arg1) || method4175(arg0, arg1);
	}

	@ObfuscatedName("gg.ai(II)Z")
	public static final boolean method4187(int arg0, int arg1) {
		return (arg0 & 0x800) != 0 | method4163(arg0, arg1) || method4173(arg0, arg1);
	}
}
