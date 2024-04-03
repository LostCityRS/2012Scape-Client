import deob.ObfuscatedName;

@ObfuscatedName("acx")
public class ClientInvCache extends Node {

    @ObfuscatedName("acx.s")
    public static final IterableMap field9273 = new IterableMap(32);

    @ObfuscatedName("acx.c")
    public static final WeightedCache field9274 = new WeightedCache(10);

    @ObfuscatedName("acx.t")
    public int[] field9276 = new int[]{-1};

    @ObfuscatedName("acx.l")
    public int[] field9275 = new int[]{0};

    @ObfuscatedName("vy.u(IIZI)I")
    public static int method12480(int arg0, int arg1, boolean arg2) {
        ClientInvCache var3 = method11708(arg0, arg2);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field9276.length) {
            return var3.field9276[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("afe.j(IIZI)I")
    public static int method15887(int arg0, int arg1, boolean arg2) {
        ClientInvCache var3 = method11708(arg0, arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field9275.length) {
            return var3.field9275[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("wk.a(IIZI)I")
    public static int method12715(int arg0, int arg1, boolean arg2) {
        ClientInvCache var3 = method11708(arg0, arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field9275.length; var5++) {
                if (var3.field9276[var5] == arg1) {
                    var4 += var3.field9275[var5];
                }
            }
            return var4;
        }
    }

    @ObfuscatedName("az.s(IIZZI)I")
    public static int method1946(int arg0, int arg1, boolean arg2, boolean arg3) {
        ClientInvCache var4 = method11708(arg0, arg3);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field9276.length; var6++) {
            if (var4.field9276[var6] >= 0 && var4.field9276[var6] < Statics.field3492.field7144) {
                ObjType var7 = Statics.field3492.method12316(var4.field9276[var6]);
                int var8 = var7.method12250(arg1, Statics.field4464.method12600(arg1).field7287);
                if (arg2) {
                    var5 += var4.field9275[var6] * var8;
                } else {
                    var5 += var8;
                }
            }
        }
        return var5;
    }

    @ObfuscatedName("tu.c(IZB)I")
    public static int method11844(int arg0, boolean arg1) {
        if (arg1) {
            return 0;
        }
        ClientInvCache var2 = method11708(arg0, arg1);
        if (var2 == null) {
            return Statics.field495.method12644(arg0).field9802;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field9276.length; var4++) {
            if (var2.field9276[var4] == -1) {
                var3++;
            }
        }
        return var3 + (Statics.field495.method12644(arg0).field9802 - var2.field9276.length);
    }

    @ObfuscatedName("th.m(IZB)Lacx;")
    public static ClientInvCache method11708(int arg0, boolean arg1) {
        long var2 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
        return (ClientInvCache) field9273.method11923(var2);
    }

    @ObfuscatedName("acp.t(IIIIZI)V")
    public static void method14728(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = (long) (arg0 | (arg4 ? Integer.MIN_VALUE : 0));
        ClientInvCache var7 = (ClientInvCache) field9273.method11923(var5);
        if (var7 == null) {
            var7 = new ClientInvCache();
            field9273.method11927(var7, var5);
        }
        if (var7.field9276.length <= arg1) {
            int[] var8 = new int[arg1 + 1];
            int[] var9 = new int[arg1 + 1];
            for (int var10 = 0; var10 < var7.field9276.length; var10++) {
                var8[var10] = var7.field9276[var10];
                var9[var10] = var7.field9275[var10];
            }
            for (int var11 = var7.field9276.length; var11 < arg1; var11++) {
                var8[var11] = -1;
                var9[var11] = 0;
            }
            var7.field9276 = var8;
            var7.field9275 = var9;
        }
        var7.field9276[arg1] = arg2;
        var7.field9275[arg1] = arg3;
    }

    @ObfuscatedName("yf.l(IZI)V")
    public static void method12901(int arg0, boolean arg1) {
        ClientInvCache var2 = method11708(arg0, arg1);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field9276.length; var3++) {
                var2.field9276[var3] = -1;
                var2.field9275[var3] = 0;
            }
        }
    }

    @ObfuscatedName("kk.f(IZI)V")
    public static void method5568(int arg0, boolean arg1) {
        ClientInvCache var2 = method11708(arg0, arg1);
        if (var2 != null) {
            var2.method6979();
        }
    }

    @ObfuscatedName("qi.d(B)V")
    public static void method8048() {
        field9273.method11925();
    }

    @ObfuscatedName("acx.z([II[IZI)J")
    public long method14760(int[] arg0, int arg1, int[] arg2, boolean arg3) {
        long[] var5 = Packet.crc64table;
        long var6 = -1L;
        long var8 = var6 >>> 8 ^ var5[(int) ((var6 ^ (long) (arg1 >> 8)) & 0xFFL)];
        long var10 = var8 >>> 8 ^ var5[(int) ((var8 ^ (long) arg1) & 0xFFL)];
        for (int var12 = 0; var12 < arg0.length; var12++) {
            long var13 = var10 >>> 8 ^ var5[(int) ((var10 ^ (long) (arg0[var12] >> 24)) & 0xFFL)];
            long var15 = var13 >>> 8 ^ var5[(int) ((var13 ^ (long) (arg0[var12] >> 16)) & 0xFFL)];
            long var17 = var15 >>> 8 ^ var5[(int) ((var15 ^ (long) (arg0[var12] >> 8)) & 0xFFL)];
            var10 = var17 >>> 8 ^ var5[(int) ((var17 ^ (long) arg0[var12]) & 0xFFL)];
        }
        if (arg2 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                var10 = var10 >>> 8 ^ var5[(int) ((var10 ^ (long) arg2[var19]) & 0xFFL)];
            }
        }
        return var10 >>> 8 ^ var5[(int) ((var10 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }

    @ObfuscatedName("acx.n(Lra;ILtt;IZLqc;B)Lqa;")
    public final Model method14751(RendererToolkit arg0, int arg1, AnimationNode arg2, int arg3, boolean arg4, PlayerModel arg5) {
        Model var7 = null;
        int var8 = arg1;
        BASType var9 = null;
        if (arg3 != -1) {
            var9 = Statics.field3769.method7784(arg3);
        }
        int[] var10 = this.field9276;
        if (var9 != null && var9.field4720 != null) {
            var10 = new int[var9.field4720.length];
            for (int var11 = 0; var11 < var9.field4720.length; var11++) {
                int var12 = var9.field4720[var11];
                if (var12 >= 0 && var12 < this.field9276.length) {
                    var10[var11] = this.field9276[var12];
                } else {
                    var10[var11] = -1;
                }
            }
        }
        if (arg2 != null) {
            var8 = arg1 | arg2.method11779();
        }
        long var13 = this.method14760(var10, arg3, arg5 == null ? null : arg5.field5000, arg4);
        if (field9274 != null) {
            var7 = (Model) field9274.method7916(var13);
        }
        if (var7 == null || arg0.method519(var7.method329(), var8) != 0) {
            if (var7 != null) {
                var8 = arg0.method520(var8, var7.method329());
            }
            int var15 = var8;
            boolean var16 = false;
            for (int var17 = 0; var17 < var10.length; var17++) {
                if (var10[var17] != -1 && !Statics.field3492.method12316(var10[var17]).method12246(arg4, null)) {
                    var16 = true;
                }
            }
            if (var16) {
                return null;
            }
            ModelUnlit[] var18 = new ModelUnlit[var10.length];
            for (int var19 = 0; var19 < var10.length; var19++) {
                if (var10[var19] != -1) {
                    var18[var19] = Statics.field3492.method12316(var10[var19]).method12245(arg4, null);
                }
            }
            if (var9 != null && var9.field4716 != null) {
                for (int var20 = 0; var20 < var9.field4716.length; var20++) {
                    if (var9.field4716[var20] != null && var18[var20] != null) {
                        int var21 = var9.field4716[var20][0];
                        int var22 = var9.field4716[var20][1];
                        int var23 = var9.field4716[var20][2];
                        int var24 = var9.field4716[var20][3];
                        int var25 = var9.field4716[var20][4];
                        int var26 = var9.field4716[var20][5];
                        if (var24 != 0 || var25 != 0 || var26 != 0) {
                            var18[var20].method2633(var24, var25, var26);
                        }
                        if (var21 != 0 || var22 != 0 || var23 != 0) {
                            var18[var20].method2630(var21, var22, var23);
                        }
                    }
                }
            }
            ModelUnlit var27 = new ModelUnlit(var18, var18.length);
            if (arg5 != null) {
                var15 = var8 | 0x4000;
            }
            var7 = arg0.method625(var27, var15, Statics.field2101, 65, 855);
            if (arg5 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    for (int var29 = 0; var29 < Statics.field5009[var28].length; var29++) {
                        if (arg5.field5000[var28] < Statics.field5010[var28][var29].length) {
                            var7.method287(Statics.field5009[var28][var29], Statics.field5010[var28][var29][arg5.field5000[var28]]);
                        }
                    }
                }
            }
            if (field9274 != null) {
                var7.method252(var8);
                field9274.method7937(var7, var13);
            }
        }
        if (arg2 == null) {
            return var7;
        } else {
            Model var30 = var7.method295((byte) 1, var8, true);
            arg2.method11780(var30, 0);
            return var30;
        }
    }

    @ObfuscatedName("s.o(II)V")
    public static void method1319(int arg0) {
        Statics.field2101 = arg0;
        field9274.method7922();
    }

    @ObfuscatedName("nj.q(I)V")
    public static void method6970() {
        field9274.method7922();
    }
}
