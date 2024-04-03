import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("vw")
public class IntMath {

    public IntMath() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.u(III)I")
    public static int method1621(int arg0, int arg1) {
        int var2 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var2 = arg0 * var2;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var2;
        } else {
            return var2;
        }
    }

    @ObfuscatedName("ly.j(IIB)I")
    public static int method5734(int arg0, int arg1) {
        if (arg1 > arg0) {
            int var2 = arg0;
            arg0 = arg1;
            arg1 = var2;
        }
        while (arg1 != 0) {
            int var3 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var3;
        }
        return arg0;
    }

    @ObfuscatedName("aag.a(IS)I")
    public static int method14067(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("df.s(II)I")
    public static int method2839(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("aj.c(II)I")
    public static int method1962(int arg0) {
        int var1 = arg0 >>> 1;
        int var2 = var1 | var1 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return arg0 & ~var6;
    }

    @ObfuscatedName("sc.m(II)Z")
    public static boolean method11258(int arg0) {
        return (arg0 & -arg0) == arg0;
    }

    @ObfuscatedName("ct.t(II)I")
    public static int method2540(int arg0) {
        int var1 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var1 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var1 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var1 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var1 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var1++;
        }
        return arg0 + var1;
    }

    @ObfuscatedName("fd.l(III)I")
    public static int method3511(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("lb.d(III)I")
    public static int method5602(int arg0, int arg1) {
        int var2 = arg0 >> 31 & arg1 - 1;
        return ((arg0 >>> 31) + arg0) % arg1 + var2;
    }

    @ObfuscatedName("dz.z(Ljava/util/Random;IB)I")
    public static int method2715(Random arg0, int arg1) {
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (method11258(arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var2 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            int var3;
            do {
                var3 = arg0.nextInt();
            } while (var3 >= var2);
            return method5602(var3, arg1);
        }
    }
}
