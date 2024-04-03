import deob.ObfuscatedName;

@ObfuscatedName("ag")
public class ReceivePlayerPositions {

    @ObfuscatedName("ag.a")
    public static byte[] field729 = new byte[2048];

    @ObfuscatedName("ag.s")
    public static byte[] field730 = new byte[2048];

    @ObfuscatedName("ag.c")
    public static Packet[] field731 = new Packet[2048];

    @ObfuscatedName("ag.m")
    public static int field732 = 0;

    @ObfuscatedName("ag.t")
    public static int[] field727 = new int[2048];

    @ObfuscatedName("ag.l")
    public static int field736 = 0;

    @ObfuscatedName("ag.f")
    public static int[] field735 = new int[2048];

    @ObfuscatedName("ag.d")
    public static LowResPlayerInfo[] field733 = new LowResPlayerInfo[2048];

    @ObfuscatedName("ag.z")
    public static int field728 = 0;

    @ObfuscatedName("ag.n")
    public static int[] field738 = new int[2048];

    public ReceivePlayerPositions() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ww.u(Lajl;B)V")
    public static final void method12667(PacketBit arg0) {
        arg0.method16862();
        int var1 = client.field9071;
        PlayerEntity var2 = Statics.field2119 = client.field9070[var1] = new PlayerEntity(client.field8980.method6098());
        var2.field8593 = var1;
        int var3 = arg0.method16863(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        CoordGrid var7 = client.field8980.method6214();
        var2.field8642[0] = var5 - var7.field4836;
        var2.field8643[0] = var6 - var7.field4838;
        var2.method8552((float) ((var2.field8642[0] << 9) + (var2.method13954() << 8)), var2.method8545().field3464.field3476, (float) ((var2.field8643[0] << 9) + (var2.method13954() << 8)));
        Statics.field7324 = var2.field9807 = var2.field9809 = var4;
        if (client.field8980.method6100().method5794(var2.field8642[0], var2.field8643[0])) {
            var2.field9809++;
        }
        if (field731[var1] != null) {
            var2.method16116(field731[var1]);
        }
        field732 = 0;
        field727[++field732 - 1] = var1;
        field729[var1] = 0;
        field736 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var1 != var8) {
                int var9 = arg0.method16863(18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                LowResPlayerInfo var13 = field733[var8] = new LowResPlayerInfo();
                var13.field570 = (var10 << 28) + (var11 << 14) + var12;
                var13.field572 = 0;
                var13.field569 = -1;
                var13.field571 = false;
                var13.field568 = false;
                field735[++field736 - 1] = var8;
                field729[var8] = 0;
            }
        }
        arg0.method16881();
    }

    @ObfuscatedName("ao.j(Lajl;II)V")
    public static final void method1805(PacketBit arg0, int arg1) {
        field728 = 0;
        method11491(arg0);
        method15865(arg0);
        if (arg0.field9626 != arg1) {
            throw new RuntimeException(arg0.field9626 + " " + arg1);
        }
    }

    @ObfuscatedName("tz.a(Lajl;I)V")
    public static final void method11491(PacketBit arg0) {
        int var1 = 0;
        arg0.method16862();
        for (int var2 = 0; var2 < field732; var2++) {
            int var3 = field727[var2];
            if ((field729[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field729[var3] = (byte) (field729[var3] | 0x2);
                } else {
                    int var4 = arg0.method16863(1);
                    if (var4 == 0) {
                        var1 = method12094(arg0);
                        field729[var3] = (byte) (field729[var3] | 0x2);
                    } else {
                        Statics.method7394(arg0, var3);
                    }
                }
            }
        }
        arg0.method16881();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method16862();
        for (int var5 = 0; var5 < field732; var5++) {
            int var6 = field727[var5];
            if ((field729[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field729[var6] = (byte) (field729[var6] | 0x2);
                } else {
                    int var7 = arg0.method16863(1);
                    if (var7 == 0) {
                        var1 = method12094(arg0);
                        field729[var6] = (byte) (field729[var6] | 0x2);
                    } else {
                        Statics.method7394(arg0, var6);
                    }
                }
            }
        }
        arg0.method16881();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method16862();
        for (int var8 = 0; var8 < field736; var8++) {
            int var9 = field735[var8];
            if ((field729[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field729[var9] = (byte) (field729[var9] | 0x2);
                } else {
                    int var10 = arg0.method16863(1);
                    if (var10 == 0) {
                        var1 = method12094(arg0);
                        field729[var9] = (byte) (field729[var9] | 0x2);
                    } else if (Statics.method3110(arg0, var9)) {
                        field729[var9] = (byte) (field729[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method16881();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method16862();
        for (int var11 = 0; var11 < field736; var11++) {
            int var12 = field735[var11];
            if ((field729[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field729[var12] = (byte) (field729[var12] | 0x2);
                } else {
                    int var13 = arg0.method16863(1);
                    if (var13 == 0) {
                        var1 = method12094(arg0);
                        field729[var12] = (byte) (field729[var12] | 0x2);
                    } else if (Statics.method3110(arg0, var12)) {
                        field729[var12] = (byte) (field729[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method16881();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field732 = 0;
        field736 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field729[var14] = (byte) (field729[var14] >> 1);
            PlayerEntity var15 = client.field9070[var14];
            if (var15 == null) {
                field735[++field736 - 1] = var14;
            } else {
                field727[++field732 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("un.s(Lajl;I)I")
    public static int method12094(PacketBit arg0) {
        int var1 = arg0.method16863(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method16863(5);
        } else if (var1 == 2) {
            var2 = arg0.method16863(8);
        } else {
            var2 = arg0.method16863(11);
        }
        return var2;
    }

    @ObfuscatedName("aft.t(Lajl;B)V")
    public static final void method15865(PacketBit arg0) {
        for (int var1 = 0; var1 < field728; var1++) {
            int var2 = field738[var1];
            PlayerEntity var3 = client.field9070[var2];
            int var4 = arg0.method15220();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.method15220() << 8;
            }
            if ((var4 & 0x2000) != 0) {
                var4 += arg0.method15220() << 16;
            }
            method11159(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("sz.l(Lajl;ILahg;II)V")
    public static final void method11159(PacketBit arg0, int arg1, PlayerEntity arg2, int arg3) {
        byte var4 = MoveSpeed.field3923.field3924;
        if ((arg3 & 0x1000) != 0) {
            arg2.field10065 = arg0.method15220() == 1;
        }
        if ((arg3 & 0x8000) != 0) {
            var4 = arg0.method15275();
        }
        if ((arg3 & 0x4) != 0) {
            int var5 = arg0.method15271();
            if (var5 > 0) {
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = -1;
                    boolean var8 = true;
                    int var9 = -1;
                    int var10 = arg0.method15277();
                    int var11;
                    if (var10 == 32767) {
                        var10 = arg0.method15277();
                        var11 = arg0.method15277();
                        var7 = arg0.method15277();
                        var9 = arg0.method15277();
                    } else if (var10 == 32766) {
                        var10 = -1;
                        var11 = arg0.method15273();
                    } else {
                        var11 = arg0.method15277();
                    }
                    int var12 = arg0.method15277();
                    arg2.method13953(var10, var11, var7, var9, client.field9213, var12);
                }
            }
            int var13 = arg0.method15272();
            if (var13 > 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    int var15 = arg0.method15277();
                    int var16 = arg0.method15277();
                    if (var16 == 32767) {
                        arg2.method13990(var15);
                    } else {
                        int var17 = arg0.method15277();
                        int var18 = arg0.method15272();
                        int var19 = var16 > 0 ? arg0.method15271() : var18;
                        arg2.method13944(var15, client.field9213, var16, var17, var18, var19);
                    }
                }
            }
        }
        if ((arg3 & 0x40000) != 0) {
            arg2.field8596 = arg0.method15275();
            arg2.field8602 = arg0.method15329();
            arg2.field8617 = arg0.method15329();
            arg2.field8631 = (byte) arg0.method15272();
            arg2.field8626 = client.field9213 + arg0.method15281();
            arg2.field8632 = client.field9213 + arg0.method15239();
        }
        if ((arg3 & 0x100000) != 0) {
            int var20 = arg0.field9629[++arg0.field9626 - 1] & 0xFF;
            for (int var21 = 0; var21 < var20; var21++) {
                int var22 = arg0.method15391();
                int var23 = arg0.method15379();
                arg2.field10055.method2372(var22, var23);
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var24 = arg0.method15248();
            if (var24 == 65535) {
                var24 = -1;
            }
            arg2.field8624 = var24;
        }
        if ((arg3 & 0x40) != 0) {
            int[] var25 = new int[MoveSpeed.method2553().length];
            for (int var26 = 0; var26 < MoveSpeed.method2553().length; var26++) {
                var25[var26] = arg0.method15411();
            }
            int var27 = arg0.method15272();
            client.method8263(arg2, var25, var27, false);
        }
        if ((arg3 & 0x80000) != 0) {
            arg2.field10055.method2377();
            int var28 = arg0.field9629[++arg0.field9626 - 1] & 0xFF;
            for (int var29 = 0; var29 < var28; var29++) {
                int var30 = arg0.method15248();
                int var31 = arg0.method15379();
                arg2.field10055.method2372(var30, var31);
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field10058 = arg0.method15391();
            if (arg2.field8628 == 0) {
                arg2.method14013(arg2.field10058);
                arg2.field10058 = -1;
            }
        }
        if ((arg3 & 0x1) != 0) {
            int var32 = arg0.method15391();
            int var33 = arg0.method15342();
            if (var32 == 65535) {
                var32 = -1;
            }
            int var34 = arg0.method15272();
            int var35 = var34 & 0x7;
            int var36 = var34 >> 3 & 0xF;
            if (var36 == 15) {
                var36 = -1;
            }
            boolean var37 = (var34 >> 7 & 0x1) == 1;
            arg2.method13950(var32, var33, var35, var36, var37, 0);
        }
        if ((arg3 & 0x20) != 0) {
            int var38 = arg0.method15220();
            byte[] var39 = new byte[var38];
            Packet var40 = new Packet(var39);
            arg0.method15292(var39, 0, var38);
            field731[arg1] = var40;
            arg2.method16116(var40);
        }
        if ((arg3 & 0x100) != 0) {
            int var41 = arg0.method15281();
            int var42 = arg0.method15311();
            if (var41 == 65535) {
                var41 = -1;
            }
            int var43 = arg0.method15271();
            int var44 = var43 & 0x7;
            int var45 = var43 >> 3 & 0xF;
            if (var45 == 15) {
                var45 = -1;
            }
            boolean var46 = (var43 >> 7 & 0x1) == 1;
            arg2.method13950(var41, var42, var44, var45, var46, 1);
        }
        if ((arg3 & 0x20000) != 0) {
            int var47 = arg0.method15220();
            int[] var48 = new int[var47];
            int[] var49 = new int[var47];
            for (int var50 = 0; var50 < var47; var50++) {
                int var51 = arg0.method15281();
                if ((var51 & 0xC000) == 49152) {
                    int var52 = arg0.method15239();
                    var48[var50] = var51 << 16 | var52;
                } else {
                    var48[var50] = var51;
                }
                var49[var50] = arg0.method15391();
            }
            arg2.method13948(var48, var49);
        }
        if ((arg3 & 0x10000) != 0) {
            String var53 = arg0.method15337();
            int var54 = arg0.method15273();
            if ((var54 & 0x1) != 0) {
                ChatHistory.method3943(2, var54, arg2.method16120(true), arg2.method16121(false), arg2.field10063, var53);
            }
            arg2.method16127(var53, 0, 0);
        }
        if ((arg3 & 0x80) != 0) {
            field730[arg1] = arg0.method15392();
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field8619 = arg0.method15238() * 262144;
            arg2.field8621 = arg0.method15238() * 262144;
            arg2.field8591 = arg0.method15392() * 262144;
            arg2.field8605 = arg0.method15238() * 262144;
            arg2.field8649 = arg0.method15391() + client.field9213;
            arg2.field8620 = arg0.method15391() + client.field9213;
            arg2.field8625 = arg0.method15239();
            if (arg2.field10062) {
                arg2.field8619 = arg2.field8619 * 262144 + arg2.field10052 * 262144;
                arg2.field8621 = arg2.field8621 * 262144 + arg2.field10064 * 262144;
                arg2.field8591 = arg2.field8591 * 262144 + arg2.field10052 * 262144;
                arg2.field8605 = arg2.field8605 * 262144 + arg2.field10064 * 262144;
                arg2.field8628 = 0;
            } else {
                arg2.field8619 = arg2.field8619 * 262144 + arg2.field8642[0] * 262144;
                arg2.field8621 = arg2.field8621 * 262144 + arg2.field8643[0] * 262144;
                arg2.field8591 = arg2.field8591 * 262144 + arg2.field8642[0] * 262144;
                arg2.field8605 = arg2.field8605 * 262144 + arg2.field8643[0] * 262144;
                arg2.field8628 = 1;
            }
            arg2.field8646 = 0;
        }
        if ((arg3 & 0x4000) != 0) {
            int var55 = arg0.method15272();
            int[] var56 = new int[var55];
            int[] var57 = new int[var55];
            int[] var58 = new int[var55];
            for (int var59 = 0; var59 < var55; var59++) {
                var56[var59] = arg0.method15411();
                var57[var59] = arg0.method15273();
                var58[var59] = arg0.method15281();
            }
            client.method12477(arg2, var56, var57, var58);
        }
        if ((arg3 & 0x800000) != 0) {
            arg2.field10067 = arg0.method15273() == 1;
        }
        if ((arg3 & 0x400) != 0) {
            String var60 = arg0.method15337();
            if (Statics.field2119 == arg2) {
                ChatHistory.method3943(2, 0, arg2.method16120(true), arg2.method16121(false), arg2.field10063, var60);
            }
            arg2.method16127(var60, 0, 0);
        }
        if ((arg3 & 0x200000) != 0) {
            int var61 = arg0.method15281();
            int var62 = arg0.method15331();
            if (var61 == 65535) {
                var61 = -1;
            }
            int var63 = arg0.method15272();
            int var64 = var63 & 0x7;
            int var65 = var63 >> 3 & 0xF;
            if (var65 == 15) {
                var65 = -1;
            }
            boolean var66 = (var63 >> 7 & 0x1) == 1;
            arg2.method13950(var61, var62, var64, var65, var66, 2);
        }
        if ((arg3 & 0x400000) != 0) {
            int var67 = arg0.method15391();
            int var68 = arg0.method15379();
            if (var67 == 65535) {
                var67 = -1;
            }
            int var69 = arg0.method15272();
            int var70 = var69 & 0x7;
            int var71 = var69 >> 3 & 0xF;
            if (var71 == 15) {
                var71 = -1;
            }
            boolean var72 = (var69 >> 7 & 0x1) == 1;
            arg2.method13950(var67, var68, var70, var71, var72, 3);
        }
        if (!arg2.field10062) {
            return;
        }
        if (var4 == 127) {
            arg2.method16123(arg2.field10052, arg2.field10064);
            return;
        }
        byte var73;
        if (MoveSpeed.field3923.field3924 == var4) {
            var73 = field730[arg1];
        } else {
            var73 = var4;
        }
        client.method12736(arg2, var73);
        arg2.method16131(arg2.field10052, arg2.field10064, var73);
    }

    @ObfuscatedName("afs.f(B)V")
    public static void method15786() {
        field732 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field731[var0] = null;
            field730[var0] = MoveSpeed.field3921.field3924;
            field733[var0] = null;
        }
    }
}
