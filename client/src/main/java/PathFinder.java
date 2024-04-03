import deob.ObfuscatedName;

@ObfuscatedName("mn")
public final class PathFinder {

    @ObfuscatedName("mn.a")
    public static int[][] field3903 = new int[128][128];

    @ObfuscatedName("mn.s")
    public static int[][] field3901 = new int[128][128];

    @ObfuscatedName("mn.l")
    public static int[] field3905 = new int[4096];

    @ObfuscatedName("mn.f")
    public static int[] field3900 = new int[4096];

    public PathFinder() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aez.u(IIILpq;Lmv;Z[I[II)I")
    public static int method15625(int arg0, int arg1, int arg2, PathFinderEntitySize arg3, CollisionMap arg4, boolean arg5, int[] arg6, int[] arg7) {
        for (int var8 = 0; var8 < 128; var8++) {
            for (int var9 = 0; var9 < 128; var9++) {
                field3903[var8][var9] = 0;
                field3901[var8][var9] = 99999999;
            }
        }
        boolean var10;
        if (arg2 == 1) {
            var10 = method1665(arg0, arg1, arg3, arg4);
        } else if (arg2 == 2) {
            var10 = method1980(arg0, arg1, arg3, arg4);
        } else {
            var10 = method8514(arg0, arg1, arg2, arg3, arg4);
        }
        int var11 = arg0 - 64;
        int var12 = arg1 - 64;
        int var13 = Statics.field3902;
        int var14 = Statics.field3898;
        if (!var10) {
            if (!arg5) {
                return -1;
            }
            int var15 = Integer.MAX_VALUE;
            int var16 = Integer.MAX_VALUE;
            byte var17 = 10;
            int var18 = arg3.field4682;
            int var19 = arg3.field4680;
            int var20 = arg3.field4681;
            int var21 = arg3.field4679;
            for (int var22 = var18 - var17; var22 <= var17 + var18; var22++) {
                for (int var23 = var19 - var17; var23 <= var17 + var19; var23++) {
                    int var24 = var22 - var11;
                    int var25 = var23 - var12;
                    if (var24 >= 0 && var25 >= 0 && var24 < 128 && var25 < 128 && field3901[var24][var25] < 100) {
                        int var26 = 0;
                        if (var22 < var18) {
                            var26 = var18 - var22;
                        } else if (var22 > var18 + var20 - 1) {
                            var26 = var22 - (var18 + var20 - 1);
                        }
                        int var27 = 0;
                        if (var23 < var19) {
                            var27 = var19 - var23;
                        } else if (var23 > var19 + var21 - 1) {
                            var27 = var23 - (var19 + var21 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var15 || var15 == var28 && field3901[var24][var25] < var16) {
                            var15 = var28;
                            var16 = field3901[var24][var25];
                            var13 = var22;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var15 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg0 == var13 && arg1 == var14) {
            return 0;
        }
        byte var29 = 0;
        field3905[var29] = var13;
        int var34 = var29 + 1;
        field3900[var29] = var14;
        int var30;
        int var31 = var30 = field3903[var13 - var11][var14 - var12];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field3905[var34] = var13;
                field3900[var34++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = field3903[var13 - var11][var14 - var12];
        }
        int var32 = 0;
        while (var34-- > 0) {
            arg6[var32] = field3905[var34];
            arg7[var32++] = field3900[var34];
            if (var32 >= arg6.length) {
                break;
            }
        }
        return var32;
    }

    @ObfuscatedName("e.j(IILpq;Lmv;S)Z")
    public static final boolean method1665(int arg0, int arg1, PathFinderEntitySize arg2, CollisionMap arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field3903[var6][var7] = 99;
        field3901[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field3905[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field3900[var10001] = arg1;
        int[][] var12 = arg3.field3896;
        while (var18 != var11) {
            var4 = field3905[var11];
            var5 = field3900[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field3857;
            int var16 = var5 - arg3.field3893;
            if (arg2.method7708(1, var4, var5, arg3)) {
                Statics.field3902 = var4;
                Statics.field3898 = var5;
                return true;
            }
            int var17 = field3901[var13][var14] + 1;
            if (var13 > 0 && field3903[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x42240000) == 0) {
                field3905[var18] = var4 - 1;
                field3900[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 - 1][var14] = 2;
                field3901[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && field3903[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x60240000) == 0) {
                field3905[var18] = var4 + 1;
                field3900[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 + 1][var14] = 8;
                field3901[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field3903[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x40A40000) == 0) {
                field3905[var18] = var4;
                field3900[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13][var14 - 1] = 1;
                field3901[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && field3903[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x48240000) == 0) {
                field3905[var18] = var4;
                field3900[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13][var14 + 1] = 4;
                field3901[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field3903[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x43A40000) == 0 && (var12[var15 - 1][var16] & 0x42240000) == 0 && (var12[var15][var16 - 1] & 0x40A40000) == 0) {
                field3905[var18] = var4 - 1;
                field3900[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 - 1][var14 - 1] = 3;
                field3901[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && field3903[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x60E40000) == 0 && (var12[var15 + 1][var16] & 0x60240000) == 0 && (var12[var15][var16 - 1] & 0x40A40000) == 0) {
                field3905[var18] = var4 + 1;
                field3900[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 + 1][var14 - 1] = 9;
                field3901[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && field3903[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x4E240000) == 0 && (var12[var15 - 1][var16] & 0x42240000) == 0 && (var12[var15][var16 + 1] & 0x48240000) == 0) {
                field3905[var18] = var4 - 1;
                field3900[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 - 1][var14 + 1] = 6;
                field3901[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && field3903[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x78240000) == 0 && (var12[var15 + 1][var16] & 0x60240000) == 0 && (var12[var15][var16 + 1] & 0x48240000) == 0) {
                field3905[var18] = var4 + 1;
                field3900[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 + 1][var14 + 1] = 12;
                field3901[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field3902 = var4;
        Statics.field3898 = var5;
        return false;
    }

    @ObfuscatedName("ac.a(IILpq;Lmv;I)Z")
    public static final boolean method1980(int arg0, int arg1, PathFinderEntitySize arg2, CollisionMap arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        field3903[var6][var7] = 99;
        field3901[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        field3905[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        field3900[var10001] = arg1;
        int[][] var12 = arg3.field3896;
        while (var18 != var11) {
            var4 = field3905[var11];
            var5 = field3900[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field3857;
            int var16 = var5 - arg3.field3893;
            if (arg2.method7708(2, var4, var5, arg3)) {
                Statics.field3902 = var4;
                Statics.field3898 = var5;
                return true;
            }
            int var17 = field3901[var13][var14] + 1;
            if (var13 > 0 && field3903[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x43A40000) == 0 && (var12[var15 - 1][var16 + 1] & 0x4E240000) == 0) {
                field3905[var18] = var4 - 1;
                field3900[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 - 1][var14] = 2;
                field3901[var13 - 1][var14] = var17;
            }
            if (var13 < 126 && field3903[var13 + 1][var14] == 0 && (var12[var15 + 2][var16] & 0x60E40000) == 0 && (var12[var15 + 2][var16 + 1] & 0x78240000) == 0) {
                field3905[var18] = var4 + 1;
                field3900[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 + 1][var14] = 8;
                field3901[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && field3903[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x43A40000) == 0 && (var12[var15 + 1][var16 - 1] & 0x60E40000) == 0) {
                field3905[var18] = var4;
                field3900[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13][var14 - 1] = 1;
                field3901[var13][var14 - 1] = var17;
            }
            if (var14 < 126 && field3903[var13][var14 + 1] == 0 && (var12[var15][var16 + 2] & 0x4E240000) == 0 && (var12[var15 + 1][var16 + 2] & 0x78240000) == 0) {
                field3905[var18] = var4;
                field3900[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13][var14 + 1] = 4;
                field3901[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && field3903[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16] & 0x4FA40000) == 0 && (var12[var15 - 1][var16 - 1] & 0x43A40000) == 0 && (var12[var15][var16 - 1] & 0x63E40000) == 0) {
                field3905[var18] = var4 - 1;
                field3900[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 - 1][var14 - 1] = 3;
                field3901[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 126 && var14 > 0 && field3903[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x63E40000) == 0 && (var12[var15 + 2][var16 - 1] & 0x60E40000) == 0 && (var12[var15 + 2][var16] & 0x78E40000) == 0) {
                field3905[var18] = var4 + 1;
                field3900[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 + 1][var14 - 1] = 9;
                field3901[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 126 && field3903[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x4FA40000) == 0 && (var12[var15 - 1][var16 + 2] & 0x4E240000) == 0 && (var12[var15][var16 + 2] & 0x7E240000) == 0) {
                field3905[var18] = var4 - 1;
                field3900[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 - 1][var14 + 1] = 6;
                field3901[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 126 && var14 < 126 && field3903[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 2] & 0x7E240000) == 0 && (var12[var15 + 2][var16 + 2] & 0x78240000) == 0 && (var12[var15 + 2][var16 + 1] & 0x78E40000) == 0) {
                field3905[var18] = var4 + 1;
                field3900[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                field3903[var13 + 1][var14 + 1] = 12;
                field3901[var13 + 1][var14 + 1] = var17;
            }
        }
        Statics.field3902 = var4;
        Statics.field3898 = var5;
        return false;
    }

    @ObfuscatedName("rd.s(IIILpq;Lmv;I)Z")
    public static final boolean method8514(int arg0, int arg1, int arg2, PathFinderEntitySize arg3, CollisionMap arg4) {
        int var5 = arg0;
        int var6 = arg1;
        byte var7 = 64;
        byte var8 = 64;
        int var9 = arg0 - var7;
        int var10 = arg1 - var8;
        field3903[var7][var8] = 99;
        field3901[var7][var8] = 0;
        byte var11 = 0;
        int var12 = 0;
        field3905[var11] = arg0;
        int var27 = var11 + 1;
        field3900[var11] = arg1;
        int[][] var13 = arg4.field3896;
        while (true) {
            label265:
            while (true) {
                int var14;
                int var15;
                int var16;
                int var17;
                int var18;
                do {
                    do {
                        do {
                            label242:
                            do {
                                if (var27 == var12) {
                                    Statics.field3902 = var5;
                                    Statics.field3898 = var6;
                                    return false;
                                }
                                var5 = field3905[var12];
                                var6 = field3900[var12];
                                var12 = var12 + 1 & 0xFFF;
                                var14 = var5 - var9;
                                var15 = var6 - var10;
                                var16 = var5 - arg4.field3857;
                                var17 = var6 - arg4.field3893;
                                if (arg3.method7708(arg2, var5, var6, arg4)) {
                                    Statics.field3902 = var5;
                                    Statics.field3898 = var6;
                                    return true;
                                }
                                var18 = field3901[var14][var15] + 1;
                                if (var14 > 0 && field3903[var14 - 1][var15] == 0 && (var13[var16 - 1][var17] & 0x43A40000) == 0 && (var13[var16 - 1][arg2 + var17 - 1] & 0x4E240000) == 0) {
                                    int var19 = 1;
                                    while (true) {
                                        if (var19 >= arg2 - 1) {
                                            field3905[var27] = var5 - 1;
                                            field3900[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field3903[var14 - 1][var15] = 2;
                                            field3901[var14 - 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 + var19] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var19++;
                                    }
                                }
                                if (var14 < 128 - arg2 && field3903[var14 + 1][var15] == 0 && (var13[arg2 + var16][var17] & 0x60E40000) == 0 && (var13[arg2 + var16][arg2 + var17 - 1] & 0x78240000) == 0) {
                                    int var20 = 1;
                                    while (true) {
                                        if (var20 >= arg2 - 1) {
                                            field3905[var27] = var5 + 1;
                                            field3900[var27] = var6;
                                            var27 = var27 + 1 & 0xFFF;
                                            field3903[var14 + 1][var15] = 8;
                                            field3901[var14 + 1][var15] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 + var20] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var20++;
                                    }
                                }
                                if (var15 > 0 && field3903[var14][var15 - 1] == 0 && (var13[var16][var17 - 1] & 0x43A40000) == 0 && (var13[arg2 + var16 - 1][var17 - 1] & 0x60E40000) == 0) {
                                    int var21 = 1;
                                    while (true) {
                                        if (var21 >= arg2 - 1) {
                                            field3905[var27] = var5;
                                            field3900[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field3903[var14][var15 - 1] = 1;
                                            field3901[var14][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var21][var17 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var21++;
                                    }
                                }
                                if (var15 < 128 - arg2 && field3903[var14][var15 + 1] == 0 && (var13[var16][arg2 + var17] & 0x4E240000) == 0 && (var13[arg2 + var16 - 1][arg2 + var17] & 0x78240000) == 0) {
                                    int var22 = 1;
                                    while (true) {
                                        if (var22 >= arg2 - 1) {
                                            field3905[var27] = var5;
                                            field3900[var27] = var6 + 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field3903[var14][var15 + 1] = 4;
                                            field3901[var14][var15 + 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 + var22][arg2 + var17] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var22++;
                                    }
                                }
                                if (var14 > 0 && var15 > 0 && field3903[var14 - 1][var15 - 1] == 0 && (var13[var16 - 1][var17 - 1] & 0x43A40000) == 0) {
                                    int var23 = 1;
                                    while (true) {
                                        if (var23 >= arg2) {
                                            field3905[var27] = var5 - 1;
                                            field3900[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field3903[var14 - 1][var15 - 1] = 3;
                                            field3901[var14 - 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[var16 - 1][var17 - 1 + var23] & 0x4FA40000) != 0 || (var13[var16 - 1 + var23][var17 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var23++;
                                    }
                                }
                                if (var14 < 128 - arg2 && var15 > 0 && field3903[var14 + 1][var15 - 1] == 0 && (var13[arg2 + var16][var17 - 1] & 0x60E40000) == 0) {
                                    int var24 = 1;
                                    while (true) {
                                        if (var24 >= arg2) {
                                            field3905[var27] = var5 + 1;
                                            field3900[var27] = var6 - 1;
                                            var27 = var27 + 1 & 0xFFF;
                                            field3903[var14 + 1][var15 - 1] = 9;
                                            field3901[var14 + 1][var15 - 1] = var18;
                                            break;
                                        }
                                        if ((var13[arg2 + var16][var17 - 1 + var24] & 0x78E40000) != 0 || (var13[var16 + var24][var17 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var24++;
                                    }
                                }
                                if (var14 > 0 && var15 < 128 - arg2 && field3903[var14 - 1][var15 + 1] == 0 && (var13[var16 - 1][arg2 + var17] & 0x4E240000) == 0) {
                                    for (int var25 = 1; var25 < arg2; var25++) {
                                        if ((var13[var16 - 1][var17 + var25] & 0x4FA40000) != 0 || (var13[var16 - 1 + var25][arg2 + var17] & 0x7E240000) != 0) {
                                            continue label242;
                                        }
                                    }
                                    field3905[var27] = var5 - 1;
                                    field3900[var27] = var6 + 1;
                                    var27 = var27 + 1 & 0xFFF;
                                    field3903[var14 - 1][var15 + 1] = 6;
                                    field3901[var14 - 1][var15 + 1] = var18;
                                }
                            } while (var14 >= 128 - arg2);
                        } while (var15 >= 128 - arg2);
                    } while (field3903[var14 + 1][var15 + 1] != 0);
                } while ((var13[arg2 + var16][arg2 + var17] & 0x78240000) != 0);
                for (int var26 = 1; var26 < arg2; var26++) {
                    if ((var13[var16 + var26][arg2 + var17] & 0x7E240000) != 0 || (var13[arg2 + var16][var17 + var26] & 0x78E40000) != 0) {
                        continue label265;
                    }
                }
                field3905[var27] = var5 + 1;
                field3900[var27] = var6 + 1;
                var27 = var27 + 1 & 0xFFF;
                field3903[var14 + 1][var15 + 1] = 12;
                field3901[var14 + 1][var15 + 1] = var18;
            }
        }
    }
}
