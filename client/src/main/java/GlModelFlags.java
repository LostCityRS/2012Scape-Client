import deob.ObfuscatedName;

@ObfuscatedName("bk")
public class GlModelFlags {

    public GlModelFlags() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.u(II)Z")
    public static final boolean method2085(int arg0, int arg1) {
        return (arg0 & 0x21) != 0;
    }

    @ObfuscatedName("bk.j(II)Z")
    public static final boolean method2086(int arg0, int arg1) {
        return (arg0 & 0x22) != 0;
    }

    @ObfuscatedName("bk.a(II)Z")
    public static final boolean method2160(int arg0, int arg1) {
        return (arg0 & 0x34) != 0;
    }

    @ObfuscatedName("bk.s(II)Z")
    public static final boolean method2088(int arg0, int arg1) {
        return (arg0 & 0x37) != 0;
    }

    @ObfuscatedName("bk.c(II)Z")
    public static final boolean method2089(int arg0, int arg1) {
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }

    @ObfuscatedName("bk.m(II)Z")
    public static final boolean method2090(int arg0, int arg1) {
        return (arg0 & 0x84080) != 0;
    }

    @ObfuscatedName("bk.t(II)Z")
    public static final boolean method2091(int arg0, int arg1) {
        return (arg0 & 0x100100) != 0;
    }

    @ObfuscatedName("bk.l(II)Z")
    public static final boolean method2114(int arg0, int arg1) {
        return false;
    }

    @ObfuscatedName("bk.f(II)Z")
    public static final boolean method2093(int arg0, int arg1) {
        return (arg0 & 0x10) != 0;
    }

    @ObfuscatedName("bk.d(II)Z")
    public static final boolean method2094(int arg0, int arg1) {
        return (arg0 & 0x8000) != 0;
    }

    @ObfuscatedName("bk.z(II)Z")
    public static final boolean method2144(int arg0, int arg1) {
        return (arg0 & 0xC580) != 0;
    }

    @ObfuscatedName("bk.n(II)Z")
    public static final boolean method2096(int arg0, int arg1) {
        return (arg0 & 0x10000) != 0;
    }

    @ObfuscatedName("bk.o(II)Z")
    public static final boolean method2097(int arg0, int arg1) {
        return (arg0 & 0x800) != 0;
    }

    @ObfuscatedName("bk.q(II)Z")
    public static final boolean method2098(int arg0, int arg1) {
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @ObfuscatedName("bk.p(II)Z")
    public static final boolean method2161(int arg0, int arg1) {
        return (arg0 & 0x800) != 0;
    }

    @ObfuscatedName("bk.w(II)Z")
    public static final boolean method2099(int arg0, int arg1) {
        return (arg0 & 0x800) != 0;
    }

    @ObfuscatedName("bk.b(II)Z")
    public static final boolean method2179(int arg0, int arg1) {
        return (arg0 & 0x800) != 0;
    }

    @ObfuscatedName("bk.x(II)Z")
    public static final boolean method2124(int arg0, int arg1) {
        return (method2085(arg0, arg1) | method2086(arg0, arg1) | method2160(arg0, arg1)) & method2097(arg0, arg1);
    }

    @ObfuscatedName("bk.i(II)Z")
    public static final boolean method2103(int arg0, int arg1) {
        return ((arg0 & 0x2000) != 0 | method2089(arg0, arg1) | method2096(arg0, arg1)) & method2098(arg0, arg1);
    }

    @ObfuscatedName("bk.v(II)Z")
    public static final boolean method2104(int arg0, int arg1) {
        if (method2161(arg0, arg1)) {
            return (arg0 & 0xB000) != 0 | method2090(arg0, arg1) | method2091(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method2089(arg0, arg1) | method2096(arg0, arg1));
        } else {
            return false;
        }
    }

    @ObfuscatedName("bk.k(II)Z")
    public static final boolean method2105(int arg0, int arg1) {
        return method2114(arg0, arg1) & method2099(arg0, arg1);
    }

    @ObfuscatedName("bk.h(II)Z")
    public static final boolean method2122(int arg0, int arg1) {
        return method2093(arg0, arg1) & method2179(arg0, arg1);
    }

    @ObfuscatedName("bk.r(II)Z")
    public static final boolean method2107(int arg0, int arg1) {
        return (arg0 & 0x70000) != 0 | method2085(arg0, arg1) || method2124(arg0, arg1);
    }

    @ObfuscatedName("bk.g(II)Z")
    public static final boolean method2108(int arg0, int arg1) {
        return (arg0 & 0x70000) != 0 | method2086(arg0, arg1) || method2124(arg0, arg1);
    }

    @ObfuscatedName("bk.y(II)Z")
    public static final boolean method2117(int arg0, int arg1) {
        return (arg0 & 0x70000) != 0 | method2160(arg0, arg1) || method2124(arg0, arg1);
    }

    @ObfuscatedName("bk.e(II)Z")
    public static final boolean method2110(int arg0, int arg1) {
        if ((arg0 & 0x10000) != 0 | method2089(arg0, arg1) || method2103(arg0, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && method2104(arg0, arg1);
        }
    }

    @ObfuscatedName("bk.ay(II)Z")
    public static final boolean method2148(int arg0, int arg1) {
        return method2090(arg0, arg1) || method2104(arg0, arg1);
    }

    @ObfuscatedName("bk.af(II)Z")
    public static final boolean method2112(int arg0, int arg1) {
        return (arg0 & 0x40000) != 0 | method2091(arg0, arg1) || method2104(arg0, arg1);
    }

    @ObfuscatedName("bk.ar(II)Z")
    public static final boolean method2113(int arg0, int arg1) {
        return method2114(arg0, arg1) || method2105(arg0, arg1);
    }

    @ObfuscatedName("bk.an(II)Z")
    public static final boolean method2141(int arg0, int arg1) {
        return (arg0 & 0x180) != 0;
    }

    @ObfuscatedName("bk.ap(II)Z")
    public static final boolean method2115(int arg0, int arg1) {
        return (arg0 & 0x20) != 0;
    }

    @ObfuscatedName("bk.ag(II)Z")
    public static final boolean method2116(int arg0, int arg1) {
        return (arg0 & 0x400) != 0;
    }

    @ObfuscatedName("bk.as(II)Z")
    public static final boolean method2125(int arg0, int arg1) {
        return (arg0 & 0x60000) != 0 | method2093(arg0, arg1) || method2104(arg0, arg1) || method2122(arg0, arg1);
    }

    @ObfuscatedName("bk.ai(II)Z")
    public static final boolean method2101(int arg0, int arg1) {
        return (arg0 & 0x800) != 0 | method2094(arg0, arg1) || method2104(arg0, arg1);
    }
}
