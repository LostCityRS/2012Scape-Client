import deob.ObfuscatedName;

@ObfuscatedName("ag")
public class ReceivePlayerPositions {

    @ObfuscatedName("ag.a")
    public static byte[] nsn = new byte[2048];

    @ObfuscatedName("ag.s")
    public static byte[] field730 = new byte[2048];

    @ObfuscatedName("ag.c")
    public static Packet[] appearances = new Packet[2048];

    @ObfuscatedName("ag.m")
    public static int highResolutionsCount = 0;

    @ObfuscatedName("ag.t")
    public static int[] highResolutionsIndices = new int[2048];

    @ObfuscatedName("ag.l")
    public static int lowResolutionsCount = 0;

    @ObfuscatedName("ag.f")
    public static int[] lowResolutionsIndices = new int[2048];

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
        arg0.bits();
        int var1 = client.currentPlayerUid;
        PlayerEntity var2 = Statics.localPlayerEntity = client.players[var1] = new PlayerEntity(client.world.getScene());
        var2.slot = var1;
        int var3 = arg0.gBit(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        CoordGrid var7 = client.world.getBase();
        var2.routeWaypointX[0] = var5 - var7.x;
        var2.routeWaypointZ[0] = var6 - var7.z;
        var2.method8552((float) ((var2.routeWaypointX[0] << 9) + (var2.size() << 8)), var2.method8545().trans.y, (float) ((var2.routeWaypointZ[0] << 9) + (var2.size() << 8)));
        Statics.currentPlayerLevel = var2.level = var2.field9809 = var4;
        if (client.world.getSceneLevelTileFlags().isLinkBelow(var2.routeWaypointX[0], var2.routeWaypointZ[0])) {
            var2.field9809++;
        }
        if (appearances[var1] != null) {
            var2.getAppearance(appearances[var1]);
        }
        highResolutionsCount = 0;
        highResolutionsIndices[++highResolutionsCount - 1] = var1;
        nsn[var1] = 0;
        lowResolutionsCount = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var1 != var8) {
                int var9 = arg0.gBit(18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                LowResPlayerInfo var13 = field733[var8] = new LowResPlayerInfo();
                var13.coord = (var10 << 28) + (var11 << 14) + var12;
                var13.field572 = 0;
                var13.field569 = -1;
                var13.field571 = false;
                var13.field568 = false;
                lowResolutionsIndices[++lowResolutionsCount - 1] = var8;
                nsn[var8] = 0;
            }
        }
        arg0.bytes();
    }

    @ObfuscatedName("ao.j(Lajl;II)V")
    public static final void update(PacketBit arg0, int arg1) {
        field728 = 0;
        method11491(arg0);
        method15865(arg0);
        if (arg0.pos != arg1) {
            throw new RuntimeException(arg0.pos + " " + arg1);
        }
    }

    @ObfuscatedName("tz.a(Lajl;I)V")
    public static final void method11491(PacketBit arg0) {
        int var1 = 0;
        arg0.bits();
        for (int var2 = 0; var2 < highResolutionsCount; var2++) {
            int var3 = highResolutionsIndices[var2];
            if ((nsn[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    nsn[var3] = (byte) (nsn[var3] | 0x2);
                } else {
                    int var4 = arg0.gBit(1);
                    if (var4 == 0) {
                        var1 = method12094(arg0);
                        nsn[var3] = (byte) (nsn[var3] | 0x2);
                    } else {
                        method7394(arg0, var3);
                    }
                }
            }
        }
        arg0.bytes();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.bits();
        for (int var5 = 0; var5 < highResolutionsCount; var5++) {
            int var6 = highResolutionsIndices[var5];
            if ((nsn[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    nsn[var6] = (byte) (nsn[var6] | 0x2);
                } else {
                    int var7 = arg0.gBit(1);
                    if (var7 == 0) {
                        var1 = method12094(arg0);
                        nsn[var6] = (byte) (nsn[var6] | 0x2);
                    } else {
                        method7394(arg0, var6);
                    }
                }
            }
        }
        arg0.bytes();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.bits();
        for (int var8 = 0; var8 < lowResolutionsCount; var8++) {
            int var9 = lowResolutionsIndices[var8];
            if ((nsn[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    nsn[var9] = (byte) (nsn[var9] | 0x2);
                } else {
                    int var10 = arg0.gBit(1);
                    if (var10 == 0) {
                        var1 = method12094(arg0);
                        nsn[var9] = (byte) (nsn[var9] | 0x2);
                    } else if (method3110(arg0, var9)) {
                        nsn[var9] = (byte) (nsn[var9] | 0x2);
                    }
                }
            }
        }
        arg0.bytes();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.bits();
        for (int var11 = 0; var11 < lowResolutionsCount; var11++) {
            int var12 = lowResolutionsIndices[var11];
            if ((nsn[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    nsn[var12] = (byte) (nsn[var12] | 0x2);
                } else {
                    int var13 = arg0.gBit(1);
                    if (var13 == 0) {
                        var1 = method12094(arg0);
                        nsn[var12] = (byte) (nsn[var12] | 0x2);
                    } else if (method3110(arg0, var12)) {
                        nsn[var12] = (byte) (nsn[var12] | 0x2);
                    }
                }
            }
        }
        arg0.bytes();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        highResolutionsCount = 0;
        lowResolutionsCount = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            nsn[var14] = (byte) (nsn[var14] >> 1);
            PlayerEntity var15 = client.players[var14];
            if (var15 == null) {
                lowResolutionsIndices[++lowResolutionsCount - 1] = var14;
            } else {
                highResolutionsIndices[++highResolutionsCount - 1] = var14;
            }
        }
    }

    @ObfuscatedName("un.s(Lajl;I)I")
    public static int method12094(PacketBit arg0) {
        int var1 = arg0.gBit(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.gBit(5);
        } else if (var1 == 2) {
            var2 = arg0.gBit(8);
        } else {
            var2 = arg0.gBit(11);
        }
        return var2;
    }

    @ObfuscatedName("oy.c(Lajl;IB)V")
    public static void method7394(PacketBit arg0, int arg1) {
        CoordGrid var2 = client.world.getBase();
        boolean var3 = arg0.gBit(1) == 1;
        if (var3) {
            field738[++field728 - 1] = arg1;
        }
        int var4 = arg0.gBit(2);
        PlayerEntity var5 = client.players[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field10062 = false;
            } else if (client.currentPlayerUid == arg1) {
                throw new RuntimeException();
            } else {
                LowResPlayerInfo var6 = field733[arg1] = new LowResPlayerInfo();
                var6.coord = (var2.z + var5.routeWaypointZ[0] >> 6) + (var2.x + var5.routeWaypointX[0] >> 6 << 14) + (var5.level << 28);
                if (var5.field10058 == -1) {
                    var6.field572 = var5.field8638.method1387();
                } else {
                    var6.field572 = var5.field10058;
                }
                var6.field569 = var5.field8624;
                var6.field571 = var5.field10065;
                var6.field568 = var5.field10067;
                if (var5.bgsound_range > 0) {
                    PositionedSound.method7377(var5);
                }
                client.players[arg1] = null;
                if (arg0.gBit(1) != 0) {
                    method3110(arg0, arg1);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.gBit(3);
            int var8 = var5.routeWaypointX[0];
            int var9 = var5.routeWaypointZ[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field10052 = var8;
                var5.field10064 = var9;
                var5.field10062 = true;
            } else {
                var5.method16131(var8, var9, field730[arg1]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.gBit(4);
            int var11 = var5.routeWaypointX[0];
            int var12 = var5.routeWaypointZ[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field10052 = var11;
                var5.field10064 = var12;
                var5.field10062 = true;
            } else {
                var5.method16131(var11, var12, field730[arg1]);
            }
        } else {
            int var13 = arg0.gBit(1);
            if (var13 == 0) {
                int var14 = arg0.gBit(12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.routeWaypointX[0] + var16;
                int var19 = var5.routeWaypointZ[0] + var17;
                if (var3) {
                    var5.field10052 = var18;
                    var5.field10064 = var19;
                    var5.field10062 = true;
                } else {
                    var5.method16131(var18, var19, field730[arg1]);
                }
                var5.level = var5.field9809 = (byte) (var5.level + var15 & 0x3);
                if (client.world.getSceneLevelTileFlags().isLinkBelow(var18, var19)) {
                    var5.field9809++;
                }
                if (client.currentPlayerUid == arg1 && Statics.currentPlayerLevel != var5.level) {
                    Statics.currentPlayerLevel = var5.level;
                }
            } else {
                int var20 = arg0.gBit(30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var2.x + var5.routeWaypointX[0] + var22 & 0x3FFF) - var2.x;
                int var25 = (var2.z + var5.routeWaypointZ[0] + var23 & 0x3FFF) - var2.z;
                if (var3) {
                    var5.field10052 = var24;
                    var5.field10064 = var25;
                    var5.field10062 = true;
                } else {
                    var5.method16131(var24, var25, field730[arg1]);
                }
                var5.level = var5.field9809 = (byte) (var5.level + var21 & 0x3);
                if (client.world.getSceneLevelTileFlags().isLinkBelow(var24, var25)) {
                    var5.field9809++;
                }
                if (client.currentPlayerUid == arg1) {
                    Statics.currentPlayerLevel = var5.level;
                }
            }
        }
    }

    @ObfuscatedName("ej.m(Lajl;II)Z")
    public static boolean method3110(PacketBit arg0, int arg1) {
        int var2 = arg0.gBit(2);
        if (var2 == 0) {
            if (arg0.gBit(1) != 0) {
                method3110(arg0, arg1);
            }
            int var3 = arg0.gBit(6);
            int var4 = arg0.gBit(6);
            boolean var5 = arg0.gBit(1) == 1;
            if (var5) {
                field738[++field728 - 1] = arg1;
            }
            if (client.players[arg1] != null) {
                throw new RuntimeException();
            }
            LowResPlayerInfo var6 = field733[arg1];
            PlayerEntity var7 = client.players[arg1] = new PlayerEntity(client.world.getScene());
            var7.slot = arg1;
            if (appearances[arg1] != null) {
                var7.getAppearance(appearances[arg1]);
            }
            var7.turn(var6.field572, true);
            var7.field8624 = var6.field569;
            int var8 = var6.coord;
            int var9 = var8 >> 28;
            int var10 = var8 >> 14 & 0xFF;
            int var11 = var8 & 0xFF;
            CoordGrid var12 = client.world.getBase();
            int var13 = (var10 << 6) + var3 - var12.x;
            int var14 = (var11 << 6) + var4 - var12.z;
            var7.field10065 = var6.field571;
            var7.field10067 = var6.field568;
            var7.field8645[0] = field730[arg1];
            var7.level = var7.field9809 = (byte) var9;
            if (client.world.getSceneLevelTileFlags().isLinkBelow(var13, var14)) {
                var7.field9809++;
            }
            var7.tele(var13, var14);
            var7.field10062 = false;
            field733[arg1] = null;
            return true;
        } else if (var2 == 1) {
            int var15 = arg0.gBit(2);
            int var16 = field733[arg1].coord;
            field733[arg1].coord = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var17 = arg0.gBit(5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = field733[arg1].coord;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            field733[arg1].coord = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.gBit(18);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = field733[arg1].coord;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            field733[arg1].coord = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @ObfuscatedName("aft.t(Lajl;B)V")
    public static final void method15865(PacketBit arg0) {
        for (int var1 = 0; var1 < field728; var1++) {
            int var2 = field738[var1];
            PlayerEntity var3 = client.players[var2];
            int var4 = arg0.g1();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.g1() << 8;
            }
            if ((var4 & 0x2000) != 0) {
                var4 += arg0.g1() << 16;
            }
            method11159(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("sz.l(Lajl;ILahg;II)V")
    public static final void method11159(PacketBit buf, int arg1, PlayerEntity arg2, int extendedInfo) {
        byte var4 = MoveSpeed.STATIONARY.id;
        if ((extendedInfo & 0x1000) != 0) {
            arg2.field10065 = buf.g1() == 1;
        }
        if ((extendedInfo & 0x8000) != 0) {
            var4 = buf.g1b_alt2();
        }
        if ((extendedInfo & 0x4) != 0) {
            int var5 = buf.g1_alt1();
            if (var5 > 0) {
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = -1;
                    boolean var8 = true;
                    int var9 = -1;
                    int var10 = buf.gSmart1or2();
                    int var11;
                    if (var10 == 32767) {
                        var10 = buf.gSmart1or2();
                        var11 = buf.gSmart1or2();
                        var7 = buf.gSmart1or2();
                        var9 = buf.gSmart1or2();
                    } else if (var10 == 32766) {
                        var10 = -1;
                        var11 = buf.g1_alt3();
                    } else {
                        var11 = buf.gSmart1or2();
                    }
                    int var12 = buf.gSmart1or2();
                    arg2.method13953(var10, var11, var7, var9, client.loopCycle, var12);
                }
            }
            int var13 = buf.g1_alt2();
            if (var13 > 0) {
                for (int var14 = 0; var14 < var13; var14++) {
                    int var15 = buf.gSmart1or2();
                    int var16 = buf.gSmart1or2();
                    if (var16 == 32767) {
                        arg2.method13990(var15);
                    } else {
                        int var17 = buf.gSmart1or2();
                        int var18 = buf.g1_alt2();
                        int var19 = var16 > 0 ? buf.g1_alt1() : var18;
                        arg2.method13944(var15, client.loopCycle, var16, var17, var18, var19);
                    }
                }
            }
        }
        if ((extendedInfo & 0x40000) != 0) {
            arg2.field8596 = buf.g1b_alt2();
            arg2.field8602 = buf.g1b_alt3();
            arg2.field8617 = buf.g1b_alt3();
            arg2.field8631 = (byte) buf.g1_alt2();
            arg2.field8626 = client.loopCycle + buf.g2_alt2();
            arg2.field8632 = client.loopCycle + buf.g2();
        }
        if ((extendedInfo & 0x100000) != 0) {
            int var20 = buf.data[++buf.pos - 1] & 0xFF;
            for (int var21 = 0; var21 < var20; var21++) {
                int var22 = buf.g2_alt3();
                int var23 = buf.g4s();
                arg2.field10055.method2372(var22, var23);
            }
        }
        if ((extendedInfo & 0x10) != 0) {
            int var24 = buf.g2_alt1();
            if (var24 == 65535) {
                var24 = -1;
            }
            arg2.field8624 = var24;
        }
        if ((extendedInfo & 0x40) != 0) {
            int[] var25 = new int[MoveSpeed.values().length];
            for (int var26 = 0; var26 < MoveSpeed.values().length; var26++) {
                var25[var26] = buf.gSmart2or4null();
            }
            int var27 = buf.g1_alt2();
            client.method8263(arg2, var25, var27, false);
        }
        if ((extendedInfo & 0x80000) != 0) {
            arg2.field10055.method2377();
            int var28 = buf.data[++buf.pos - 1] & 0xFF;
            for (int var29 = 0; var29 < var28; var29++) {
                int var30 = buf.g2_alt1();
                int var31 = buf.g4s();
                arg2.field10055.method2372(var30, var31);
            }
        }
        if ((extendedInfo & 0x2) != 0) {
            arg2.field10058 = buf.g2_alt3();
            if (arg2.routeLength == 0) {
                arg2.method14013(arg2.field10058);
                arg2.field10058 = -1;
            }
        }
        if ((extendedInfo & 0x1) != 0) {
            int var32 = buf.g2_alt3();
            int var33 = buf.g4s_alt2();
            if (var32 == 65535) {
                var32 = -1;
            }
            int var34 = buf.g1_alt2();
            int var35 = var34 & 0x7;
            int var36 = var34 >> 3 & 0xF;
            if (var36 == 15) {
                var36 = -1;
            }
            boolean var37 = (var34 >> 7 & 0x1) == 1;
            arg2.method13950(var32, var33, var35, var36, var37, 0);
        }
        if ((extendedInfo & 0x20) != 0) {
            int var38 = buf.g1();
            byte[] var39 = new byte[var38];
            Packet var40 = new Packet(var39);
            buf.gdata_alt3(var39, 0, var38);
            appearances[arg1] = var40;
            arg2.getAppearance(var40);
        }
        if ((extendedInfo & 0x100) != 0) {
            int var41 = buf.g2_alt2();
            int var42 = buf.g4s_alt3();
            if (var41 == 65535) {
                var41 = -1;
            }
            int var43 = buf.g1_alt1();
            int var44 = var43 & 0x7;
            int var45 = var43 >> 3 & 0xF;
            if (var45 == 15) {
                var45 = -1;
            }
            boolean var46 = (var43 >> 7 & 0x1) == 1;
            arg2.method13950(var41, var42, var44, var45, var46, 1);
        }
        if ((extendedInfo & 0x20000) != 0) {
            int var47 = buf.g1();
            int[] var48 = new int[var47];
            int[] var49 = new int[var47];
            for (int var50 = 0; var50 < var47; var50++) {
                int var51 = buf.g2_alt2();
                if ((var51 & 0xC000) == 49152) {
                    int var52 = buf.g2();
                    var48[var50] = var51 << 16 | var52;
                } else {
                    var48[var50] = var51;
                }
                var49[var50] = buf.g2_alt3();
            }
            arg2.method13948(var48, var49);
        }
        if ((extendedInfo & 0x10000) != 0) {
            String var53 = buf.gjstr();
            int var54 = buf.g1_alt3();
            if ((var54 & 0x1) != 0) {
                ChatHistory.addMessage(2, var54, arg2.method16120(true), arg2.method16121(false), arg2.name, var53);
            }
            arg2.method16127(var53, 0, 0);
        }
        if ((extendedInfo & 0x80) != 0) {
            field730[arg1] = buf.g1b_alt1();
        }
        if ((extendedInfo & 0x200) != 0) {
            arg2.exactMoveX0 = buf.g1b();
            arg2.exactMoveZ0 = buf.g1b();
            arg2.exactMoveX1 = buf.g1b_alt1();
            arg2.exactMoveZ1 = buf.g1b();
            arg2.exactMoveT0 = buf.g2_alt3() + client.loopCycle;
            arg2.exactMoveT1 = buf.g2_alt3() + client.loopCycle;
            arg2.exactMoveAngle = buf.g2();
            if (arg2.field10062) {
                arg2.exactMoveX0 = arg2.exactMoveX0 + arg2.field10052;
                arg2.exactMoveZ0 = arg2.exactMoveZ0 + arg2.field10064;
                arg2.exactMoveX1 = arg2.exactMoveX1 + arg2.field10052;
                arg2.exactMoveZ1 = arg2.exactMoveZ1 + arg2.field10064;
                arg2.routeLength = 0;
            } else {
                arg2.exactMoveX0 = arg2.exactMoveX0 + arg2.routeWaypointX[0];
                arg2.exactMoveZ0 = arg2.exactMoveZ0 + arg2.routeWaypointZ[0];
                arg2.exactMoveX1 = arg2.exactMoveX1 + arg2.routeWaypointX[0];
                arg2.exactMoveZ1 = arg2.exactMoveZ1 + arg2.routeWaypointZ[0];
                arg2.routeLength = 1;
            }
            arg2.routeLength3 = 0;
        }
        if ((extendedInfo & 0x4000) != 0) {
            int var55 = buf.g1_alt2();
            int[] var56 = new int[var55];
            int[] var57 = new int[var55];
            int[] var58 = new int[var55];
            for (int var59 = 0; var59 < var55; var59++) {
                var56[var59] = buf.gSmart2or4null();
                var57[var59] = buf.g1_alt3();
                var58[var59] = buf.g2_alt2();
            }
            client.method12477(arg2, var56, var57, var58);
        }
        if ((extendedInfo & 0x800000) != 0) {
            arg2.field10067 = buf.g1_alt3() == 1;
        }
        if ((extendedInfo & 0x400) != 0) {
            String var60 = buf.gjstr();
            if (Statics.localPlayerEntity == arg2) {
                ChatHistory.addMessage(2, 0, arg2.method16120(true), arg2.method16121(false), arg2.name, var60);
            }
            arg2.method16127(var60, 0, 0);
        }
        if ((extendedInfo & 0x200000) != 0) {
            int var61 = buf.g2_alt2();
            int var62 = buf.g4s_alt1();
            if (var61 == 65535) {
                var61 = -1;
            }
            int var63 = buf.g1_alt2();
            int var64 = var63 & 0x7;
            int var65 = var63 >> 3 & 0xF;
            if (var65 == 15) {
                var65 = -1;
            }
            boolean var66 = (var63 >> 7 & 0x1) == 1;
            arg2.method13950(var61, var62, var64, var65, var66, 2);
        }
        if ((extendedInfo & 0x400000) != 0) {
            int var67 = buf.g2_alt1();
            int var68 = buf.g4s();
            if (var67 == 65535) {
                var67 = -1;
            }
            int var69 = buf.g1_alt1();
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
            arg2.tele(arg2.field10052, arg2.field10064);
            return;
        }
        byte var73;
        if (MoveSpeed.STATIONARY.id == var4) {
            var73 = field730[arg1];
        } else {
            var73 = var4;
        }
        client.method12736(arg2, var73);
        arg2.method16131(arg2.field10052, arg2.field10064, var73);
    }

    @ObfuscatedName("afs.f(B)V")
    public static void method15786() {
        highResolutionsCount = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            appearances[var0] = null;
            field730[var0] = MoveSpeed.WALK.id;
            field733[var0] = null;
        }
    }
}
