import deob.ObfuscatedName;

@ObfuscatedName("rs")
public class Algorithms {

    public Algorithms() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jh.u([Ljava/lang/String;[SB)V")
    public static void method4783(String[] arg0, short[] arg1) {
        method4802(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("js.j([Ljava/lang/String;[SIIB)V")
    public static void method4802(String[] arg0, short[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        String var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        short var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        for (int var8 = arg2; var8 < arg3; var8++) {
            if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
                String var9 = arg0[var8];
                arg0[var8] = arg0[var5];
                arg0[var5] = var9;
                short var10 = arg1[var8];
                arg1[var8] = arg1[var5];
                arg1[var5++] = var10;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method4802(arg0, arg1, arg2, var5 - 1);
        method4802(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("qo.a([Ljava/lang/String;[II)V")
    public static void method8077(String[] arg0, int[] arg1) {
        Statics.method7899(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("jp.c([I[IIIB)V")
    public static void method4811(int[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        int var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        int var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;
        for (int var9 = arg2; var9 < arg3; var9++) {
            if (arg0[var9] < (var9 & var8) + var6) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5++] = var11;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method4811(arg0, arg1, arg2, var5 - 1);
        method4811(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("wx.m([J[II)V")
    public static void method12650(long[] arg0, int[] arg1) {
        method14801(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("ach.t([J[IIIB)V")
    public static void method14801(long[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        long var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        int var8 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var8;
        int var9 = var6 == Long.MAX_VALUE ? 0 : 1;
        for (int var10 = arg2; var10 < arg3; var10++) {
            if (arg0[var10] < (long) (var10 & var9) + var6) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var5];
                arg0[var5] = var11;
                int var13 = arg1[var10];
                arg1[var10] = arg1[var5];
                arg1[var5++] = var13;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var8;
        method14801(arg0, arg1, arg2, var5 - 1);
        method14801(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("afy.l([I[Ljava/lang/Object;B)V")
    public static void method15733(int[] arg0, Object[] arg1) {
        method15811(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("afb.f([I[Ljava/lang/Object;III)V")
    public static void method15811(int[] arg0, Object[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        int var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        Object var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;
        for (int var9 = arg2; var9 < arg3; var9++) {
            if (arg0[var9] < (var9 & var8) + var6) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var5];
                arg0[var5] = var10;
                Object var11 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5++] = var11;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method15811(arg0, arg1, arg2, var5 - 1);
        method15811(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("sf.d([J[Ljava/lang/Object;B)V")
    public static void method11178(long[] arg0, Object[] arg1) {
        method4978(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("kh.z([J[Ljava/lang/Object;IIS)V")
    public static void method4978(long[] arg0, Object[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        long var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        Object var8 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var8;
        int var9 = var6 == Long.MAX_VALUE ? 0 : 1;
        for (int var10 = arg2; var10 < arg3; var10++) {
            if (arg0[var10] < (long) (var10 & var9) + var6) {
                long var11 = arg0[var10];
                arg0[var10] = arg0[var5];
                arg0[var5] = var11;
                Object var13 = arg1[var10];
                arg1[var10] = arg1[var5];
                arg1[var5++] = var13;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var8;
        method4978(arg0, arg1, arg2, var5 - 1);
        method4978(arg0, arg1, var5 + 1, arg3);
    }
}
