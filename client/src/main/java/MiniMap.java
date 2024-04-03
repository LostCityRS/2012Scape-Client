import deob.ObfuscatedName;

@ObfuscatedName("ao")
public class MiniMap {

    @ObfuscatedName("ao.u")
    public static boolean field768 = false;

    @ObfuscatedName("ao.j")
    public static boolean field756 = false;

    @ObfuscatedName("ao.a")
    public static int field765 = -1;

    @ObfuscatedName("ao.s")
    public static int field767 = 0;

    @ObfuscatedName("ao.c")
    public static int[] field759 = new int[1006];

    @ObfuscatedName("ao.m")
    public static int[] field757 = new int[1001];

    @ObfuscatedName("ao.t")
    public static int[] field761 = new int[1003];

    @ObfuscatedName("ao.l")
    public static IterableQueue field758 = new IterableQueue();

    @ObfuscatedName("ao.f")
    public static int field763 = -1;

    @ObfuscatedName("ao.d")
    public static int field764 = -1;

    @ObfuscatedName("ao.z")
    public static boolean field766 = true;

    @ObfuscatedName("ao.n")
    public static boolean field755 = false;

    @ObfuscatedName("ao.q")
    public static int field762 = 0;

    public MiniMap() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("og.u(I)V")
    public static void method7163() {
        field762 = 0;
        field765 = -1;
        field763 = -1;
        field764 = -1;
    }

    @ObfuscatedName("v.j(I)V")
    public static void method1202() {
        field762 = 0;
        field763 = -1;
        field764 = -1;
    }

    @ObfuscatedName("pu.a(B)V")
    public static void method7992() {
        Statics.field6357 = null;
        field765 = -1;
    }

    @ObfuscatedName("ff.s(Lra;I)V")
    public static void method3580(RendererToolkit arg0) {
        if (field765 != Statics.field2119.field9807 && client.field8980.method6098() != null) {
            MonotonicTime.method5554();
            if (Statics.method2581(arg0, Statics.field2119.field9807)) {
                field765 = Statics.field2119.field9807;
            }
        }
    }

    @ObfuscatedName("pn.m(IIII)Z")
    public static boolean method7787(int arg0, int arg1, int arg2) {
        Scene var3 = client.field8980.method6098();
        boolean var4 = true;
        Location var5 = (Location) var3.method7433(arg0, arg1, arg2);
        if (var5 != null) {
            var4 &= method16491(var5);
        }
        Location var6 = (Location) var3.method7437(arg0, arg1, arg2, client.field9216);
        if (var6 != null) {
            var4 &= method16491(var6);
        }
        Location var7 = (Location) var3.method7517(arg0, arg1, arg2);
        if (var7 != null) {
            var4 &= method16491(var7);
        }
        return var4;
    }

    @ObfuscatedName("aiq.t(Lca;B)Z")
    public static boolean method16491(Location arg0) {
        LocType var1 = client.field8980.method6103().method11471(arg0.method2401());
        if (var1.field6508 == -1) {
            return true;
        } else {
            MSIType var2 = Statics.field850.method12491(var1.field6508);
            return var2.field7192 == -1 ? true : var2.method12485();
        }
    }

    @ObfuscatedName("qr.l(Lra;IIIIIIII)V")
    public static void method8094(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        Scene var8 = client.field8980.method6098();
        Location var9 = (Location) var8.method7433(arg1, arg2, arg3);
        if (var9 != null) {
            LocType var10 = client.field8980.method6103().method11471(var9.method2401());
            int var11 = var9.method2391() & 0x3;
            int var12 = var9.method2390();
            if (var10.field6508 == -1) {
                int var13 = arg6;
                if (var10.field6493 > 0) {
                    var13 = arg7;
                }
                if (LocShape.field6591.field6590 == var12 || LocShape.field6569.field6590 == var12) {
                    if (var11 == 0) {
                        arg0.method486(arg4, arg5, 4, var13);
                    } else if (var11 == 1) {
                        arg0.method485(arg4, arg5, 4, var13);
                    } else if (var11 == 2) {
                        arg0.method486(arg4 + 3, arg5, 4, var13);
                    } else if (var11 == 3) {
                        arg0.method485(arg4, arg5 + 3, 4, var13);
                    }
                }
                if (LocShape.field6570.field6590 == var12) {
                    if (var11 == 0) {
                        arg0.method496(arg4, arg5, 1, 1, var13);
                    } else if (var11 == 1) {
                        arg0.method496(arg4 + 3, arg5, 1, 1, var13);
                    } else if (var11 == 2) {
                        arg0.method496(arg4 + 3, arg5 + 3, 1, 1, var13);
                    } else if (var11 == 3) {
                        arg0.method496(arg4, arg5 + 3, 1, 1, var13);
                    }
                }
                if (LocShape.field6569.field6590 == var12) {
                    if (var11 == 0) {
                        arg0.method485(arg4, arg5, 4, var13);
                    } else if (var11 == 1) {
                        arg0.method486(arg4 + 3, arg5, 4, var13);
                    } else if (var11 == 2) {
                        arg0.method485(arg4, arg5 + 3, 4, var13);
                    } else if (var11 == 3) {
                        arg0.method486(arg4, arg5, 4, var13);
                    }
                }
            } else {
                method3634(arg0, var10, var11, arg4, arg5);
            }
        }
        Location var14 = (Location) var8.method7437(arg1, arg2, arg3, client.field9216);
        if (var14 != null) {
            LocType var15 = client.field8980.method6103().method11471(var14.method2401());
            int var16 = var14.method2391() & 0x3;
            int var17 = var14.method2390();
            if (var15.field6508 != -1) {
                method3634(arg0, var15, var16, arg4, arg5);
            } else if (LocShape.field6567.field6590 == var17) {
                int var18 = -1118482;
                if (var15.field6493 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method487(arg4, arg5 + 3, arg4 + 3, arg5, var18);
                } else {
                    arg0.method487(arg4, arg5, arg4 + 3, arg5 + 3, var18);
                }
            }
        }
        Location var19 = (Location) var8.method7517(arg1, arg2, arg3);
        if (var19 == null) {
            return;
        }
        LocType var20 = client.field8980.method6103().method11471(var19.method2401());
        int var21 = var19.method2391() & 0x3;
        if (var20.field6508 != -1) {
            method3634(arg0, var20, var21, arg4, arg5);
        }
    }

    @ObfuscatedName("fk.f(Lra;Ltg;IIII)V")
    public static void method3634(RendererToolkit arg0, LocType arg1, int arg2, int arg3, int arg4) {
        MSIType var5 = Statics.field850.method12491(arg1.field6508);
        if (var5.field7192 == -1) {
            return;
        }
        int var7;
        if (arg1.field6509) {
            int var6 = arg1.field6525 + arg2;
            var7 = var6 & 0x3;
        } else {
            var7 = 0;
        }
        Sprite var8 = var5.method12484(arg0, var7, arg1.field6511);
        if (var8 == null) {
            return;
        }
        int var9 = arg1.field6489;
        int var10 = arg1.field6503;
        if ((var7 & 0x1) == 1) {
            var9 = arg1.field6503;
            var10 = arg1.field6489;
        }
        int var11 = var8.method1042();
        int var12 = var8.method1047();
        if (var5.field7195) {
            var11 = var9 * 4;
            var12 = var10 * 4;
        }
        if (var5.field7194 == 0) {
            var8.method2513(arg3, arg4 - (var10 - 1) * 4, var11, var12);
        } else {
            var8.method2502(arg3, arg4 - (var10 - 1) * 4, var11, var12, 0, var5.field7194 | 0xFF000000, 1);
        }
    }

    @ObfuscatedName("fh.d(Lra;Lew;III)V")
    public static void method3655(RendererToolkit arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2119 == null) {
            return;
        }
        arg0.method509();
        Graphic var4 = arg1.method3124(arg0);
        if (var4 == null) {
            return;
        }
        GraphicsRelated var5 = var4.field1730;
        arg0.r(arg2, arg3, arg1.field1863 + arg2, arg1.field1929 + arg3);
        if (arg1.field1863 != var4.field1728 || arg1.field1929 != var4.field1727) {
            throw new IllegalStateException("");
        } else if (field762 == 2 || field762 == 5 || Statics.field6357 == null) {
            arg0.DA(-16777216, var5, arg2, arg3);
        } else {
            CoordGrid var6 = client.field8980.method6214();
            int var7;
            int var8;
            int var9;
            int var10;
            if (Statics.field2671 == 5) {
                var7 = client.field9154;
                var8 = client.field9019;
                var9 = (int) -client.field9021 & 0x3FFF;
                var10 = 4096;
            } else {
                Vector3 var11 = Statics.field2119.method8565().field3464;
                var7 = (int) var11.field3475;
                var8 = (int) var11.field3477;
                var9 = client.field9087 + (int) -client.field9021 & 0x3FFF;
                var10 = 4096 - client.field8976 * 16;
            }
            int var12 = var7 / 128 + 48;
            int var13 = client.field8980.method6193() * 4 + 48 - var8 / 128;
            Statics.field6357.method2512((float) arg1.field1863 / 2.0F + (float) arg2, (float) arg1.field1929 / 2.0F + (float) arg3, (float) var12, (float) var13, var10, var9 << 2, var5, arg2, arg3);
            WorldMapRelated var14 = client.field8980.method6093();
            for (IntNode var15 = (IntNode) field758.method11563(); var15 != null; var15 = (IntNode) field758.method11567()) {
                int var16 = var15.field9556;
                int var17 = (var14.field4254[var16] >> 14 & 0x3FFF) - var6.field4836;
                int var18 = (var14.field4254[var16] & 0x3FFF) - var6.field4838;
                int var19 = var17 * 4 + 2 - var7 / 128;
                int var20 = var18 * 4 + 2 - var8 / 128;
                method1712(arg0, var5, arg1, arg2, arg3, var19, var20, var14.field4253[var16]);
            }
            for (int var21 = 0; var21 < field767; var21++) {
                int var22 = field759[var21] * 4 + 2 - var7 / 128;
                int var23 = field757[var21] * 4 + 2 - var8 / 128;
                LocType var24 = client.field8980.method6103().method11471(field761[var21]);
                if (var24.field6534 != null) {
                    var24 = var24.method11431(Statics.field2669);
                    if (var24 == null || var24.field6495 == -1) {
                        continue;
                    }
                }
                method1712(arg0, var5, arg1, arg2, arg3, var22, var23, var24.field6495);
            }
            for (ObjStackList var25 = (ObjStackList) client.field9088.method11928(); var25 != null; var25 = (ObjStackList) client.field9088.method11929()) {
                int var26 = (int) (var25.field4228 >> 28 & 0x3L);
                if (field765 == var26) {
                    int var27 = (int) (var25.field4228 & 0x3FFFL) - var6.field4836;
                    int var28 = (int) (var25.field4228 >> 14 & 0x3FFFL) - var6.field4838;
                    int var29 = var27 * 4 + 2 - var7 / 128;
                    int var30 = var28 * 4 + 2 - var8 / 128;
                    Statics.method12552(arg1, var5, arg2, arg3, var29, var30, Statics.field561[0]);
                }
            }
            method2388(arg0, var7, var8, arg1, var5, arg2, arg3);
            method1592(var7, var8, arg1, var5, arg2, arg3);
            method2472(var7, var8, arg1, var4, arg2, arg3);
            if (Statics.field2671 != 5) {
                if (field763 != 0) {
                    int var31 = field763 * 4 + 2 - var7 / 128 + (Statics.field2119.method13954() - 1) * 2;
                    int var32 = field764 * 4 + 2 - var8 / 128 + (Statics.field2119.method13954() - 1) * 2;
                    Statics.method12552(arg1, var5, arg2, arg3, var31, var32, Statics.field9826[field766 ? 1 : 0]);
                }
                if (!Statics.field2119.field10066) {
                    arg0.method496(arg1.field1863 / 2 + arg2 - 1, arg1.field1929 / 2 + arg3 - 1, 3, 3, -1);
                }
            }
        }
    }

    @ObfuscatedName("ci.z(Lra;IILew;Lta;III)V")
    public static void method2388(RendererToolkit arg0, int arg1, int arg2, Component arg3, GraphicsRelated arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < client.field9104; var7++) {
            ObjectNode var8 = (ObjectNode) client.field8964.method11923((long) client.field9056[var7]);
            if (var8 != null) {
                NpcEntity var9 = (NpcEntity) var8.field9550;
                if (var9.method16154() && Statics.field2119.field9807 == var9.field9807) {
                    NPCType var10 = var9.field10075;
                    if (var10 != null && var10.field7244 != null) {
                        var10 = var10.method12516(Statics.field2669);
                    }
                    if (var10 != null && var10.field7232 && var10.field7271) {
                        Vector3 var11 = var9.method8565().field3464;
                        int var12 = (int) var11.field3475 / 128 - arg1 / 128;
                        int var13 = (int) var11.field3477 / 128 - arg2 / 128;
                        if (var10.field7268 == -1) {
                            Statics.method12552(arg3, arg4, arg5, arg6, var12, var13, Statics.field561[1]);
                        } else {
                            method1712(arg0, arg4, arg3, arg5, arg6, var12, var13, var10.field7268);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.n(IILew;Lta;III)V")
    public static void method1592(int arg0, int arg1, Component arg2, GraphicsRelated arg3, int arg4, int arg5) {
        int var6 = ReceivePlayerPositions.field732;
        int[] var7 = ReceivePlayerPositions.field727;
        for (int var8 = 0; var8 < var6; var8++) {
            PlayerEntity var9 = client.field9070[var7[var8]];
            if (var9 != null && var9.method16125() && !var9.field10066 && Statics.field2119 != var9 && Statics.field2119.field9807 == var9.field9807) {
                Vector3 var10 = var9.method8565().field3464;
                int var11 = (int) var10.field3475 / 128 - arg0 / 128;
                int var12 = (int) var10.field3477 / 128 - arg1 / 128;
                boolean var13 = false;
                for (int var14 = 0; var14 < client.field9206; var14++) {
                    Friend var15 = client.field9209[var14];
                    if (var9.field10040.equals(var15.field649) && var15.field647 != 0) {
                        var13 = true;
                        break;
                    }
                }
                boolean var16 = false;
                for (int var17 = 0; var17 < Statics.field7045; var17++) {
                    if (var9.field10040.equals(Statics.field5180[var17].field786)) {
                        var16 = true;
                        break;
                    }
                }
                boolean var18 = false;
                if (Statics.field2119.field10061 != 0 && var9.field10061 != 0 && Statics.field2119.field10061 == var9.field10061) {
                    var18 = true;
                }
                if (var9.field10065) {
                    Statics.method12552(arg2, arg3, arg4, arg5, var11, var12, Statics.field561[6]);
                } else if (var18) {
                    Statics.method12552(arg2, arg3, arg4, arg5, var11, var12, Statics.field561[4]);
                } else if (var9.field10067) {
                    Statics.method12552(arg2, arg3, arg4, arg5, var11, var12, Statics.field561[7]);
                } else if (var13) {
                    Statics.method12552(arg2, arg3, arg4, arg5, var11, var12, Statics.field561[3]);
                } else if (var16) {
                    Statics.method12552(arg2, arg3, arg4, arg5, var11, var12, Statics.field561[5]);
                } else {
                    Statics.method12552(arg2, arg3, arg4, arg5, var11, var12, Statics.field561[2]);
                }
            }
        }
    }

    @ObfuscatedName("ck.o(IILew;Les;IIB)V")
    public static void method2472(int arg0, int arg1, Component arg2, Graphic arg3, int arg4, int arg5) {
        HintArrow[] var6 = client.field8936;
        for (int var7 = 0; var7 < var6.length; var7++) {
            HintArrow var8 = var6[var7];
            if (var8 != null && var8.field776 != 0 && client.field9213 % 20 < 10) {
                if (var8.field776 == 1) {
                    ObjectNode var9 = (ObjectNode) client.field8964.method11923((long) var8.field772);
                    if (var9 != null) {
                        NpcEntity var10 = (NpcEntity) var9.field9550;
                        Vector3 var11 = var10.method8565().field3464;
                        int var12 = (int) var11.field3475 / 128 - arg0 / 128;
                        int var13 = (int) var11.field3477 / 128 - arg1 / 128;
                        method4656(arg2, arg3, arg4, arg5, var12, var13, var8.field773, 360000L);
                    }
                }
                if (var8.field776 == 2) {
                    int var14 = var8.field778 * 512 / 128 - arg0 / 128;
                    int var15 = var8.field777 * 262144 / 128 - arg1 / 128;
                    long var16 = (long) (var8.field780 << 7);
                    long var18 = var16 * var16;
                    method4656(arg2, arg3, arg4, arg5, var14, var15, var8.field773, var18);
                }
                if (var8.field776 == 10 && var8.field772 >= 0 && var8.field772 < client.field9070.length) {
                    PlayerEntity var20 = client.field9070[var8.field772];
                    if (var20 != null) {
                        Vector3 var21 = var20.method8565().field3464;
                        int var22 = (int) var21.field3475 / 128 - arg0 / 128;
                        int var23 = (int) var21.field3477 / 128 - arg1 / 128;
                        method4656(arg2, arg3, arg4, arg5, var22, var23, var8.field773, 360000L);
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.q(Lra;Lta;Lew;IIIIII)V")
    public static void method1712(RendererToolkit arg0, GraphicsRelated arg1, Component arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        MapElementType var8 = Statics.field8499.method7862(arg7);
        if (var8 == null || !var8.field4776 || !var8.method7835(Statics.field2669)) {
            return;
        }
        if (var8.field4788 != null) {
            int[] var9 = new int[var8.field4788.length];
            for (int var10 = 0; var10 < var9.length / 2; var10++) {
                int var11;
                if (Statics.field2671 == 5) {
                    var11 = (int) client.field9021 & 0x3FFF;
                } else {
                    var11 = client.field9087 + (int) client.field9021 & 0x3FFF;
                }
                int var12 = Trig1.field3439[var11];
                int var13 = Trig1.field3447[var11];
                if (Statics.field2671 != 5) {
                    var12 = var12 * 256 / (client.field8976 + 256);
                    var13 = var13 * 256 / (client.field8976 + 256);
                }
                var9[var10 * 2] = ((var8.field4788[var10 * 2] * 4 + arg5) * var13 + (var8.field4788[var10 * 2 + 1] * 4 + arg6) * var12 >> 14) + arg2.field1863 / 2 + arg3;
                var9[var10 * 2 + 1] = arg2.field1929 / 2 + arg4 - ((var8.field4788[var10 * 2 + 1] * 4 + arg6) * var13 - (var8.field4788[var10 * 2] * 4 + arg5) * var12 >> 14);
            }
            Graphic var14 = arg2.method3124(arg0);
            if (var14 != null) {
                WorldMapRelated2.method2679(arg0, var9, var8.field4785, var14.field1729, var14.field1726);
            }
            if (var8.field4795 > 0) {
                for (int var15 = 0; var15 < var9.length / 2 - 1; var15++) {
                    int var16 = var9[var15 * 2];
                    int var17 = var9[var15 * 2 + 1];
                    int var18 = var9[(var15 + 1) * 2];
                    int var19 = var9[(var15 + 1) * 2 + 1];
                    if (var18 < var16) {
                        int var20 = var16;
                        int var21 = var17;
                        var16 = var18;
                        var17 = var19;
                        var18 = var20;
                        var19 = var21;
                    } else if (var16 == var18 && var19 < var17) {
                        int var22 = var17;
                        var17 = var19;
                        var19 = var22;
                    }
                    arg0.method498(var16, var17, var18, var19, var8.field4800[var8.field4762[var15] & 0xFF], 1, arg1, arg3, arg4, var8.field4795, var8.field4796, var8.field4794);
                }
                int var23 = var9[var9.length - 2];
                int var24 = var9[var9.length - 1];
                int var25 = var9[0];
                int var26 = var9[1];
                if (var25 < var23) {
                    int var27 = var23;
                    int var28 = var24;
                    var23 = var25;
                    var24 = var26;
                    var25 = var27;
                    var26 = var28;
                } else if (var23 == var25 && var26 < var24) {
                    int var29 = var24;
                    var24 = var26;
                    var26 = var29;
                }
                arg0.method498(var23, var24, var25, var26, var8.field4800[var8.field4762[var8.field4762.length - 1] & 0xFF], 1, arg1, arg3, arg4, var8.field4795, var8.field4796, var8.field4794);
            } else {
                for (int var30 = 0; var30 < var9.length / 2 - 1; var30++) {
                    arg0.method440(var9[var30 * 2], var9[var30 * 2 + 1], var9[(var30 + 1) * 2], var9[(var30 + 1) * 2 + 1], var8.field4800[var8.field4762[var30] & 0xFF], 1, arg1, arg3, arg4);
                }
                arg0.method440(var9[var9.length - 2], var9[var9.length - 1], var9[0], var9[1], var8.field4800[var8.field4762[var8.field4762.length - 1] & 0xFF], 1, arg1, arg3, arg4);
            }
        }
        Sprite var31 = null;
        if (var8.field4764 != -1) {
            var31 = var8.method7847(arg0, false);
            if (var31 != null) {
                Statics.method12552(arg2, arg1, arg3, arg4, arg5, arg6, var31);
            }
        }
        if (var8.field4766 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method1045();
        }
        Font var33 = Statics.field2163;
        FontMetrics var34 = Statics.field559;
        if (var8.field4777 == 1) {
            var33 = Statics.field560;
            var34 = Statics.field9813;
        }
        if (var8.field4777 == 2) {
            var33 = Statics.field670;
            var34 = Statics.field2399;
        }
        method14046(arg2, arg1, arg3, arg4, arg5, arg6, var32, var8.field4766, var33, var34, var8.field4767);
    }

    @ObfuscatedName("ik.p(Lew;Les;IIIIIJ)V")
    public static void method4656(Component arg0, Graphic arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        int var9 = arg4 * arg4 + arg5 * arg5;
        if ((long) var9 > arg7) {
            return;
        }
        int var10;
        if (Statics.field2671 == 5) {
            var10 = (int) client.field9021 & 0x3FFF;
        } else {
            var10 = client.field9087 + (int) client.field9021 & 0x3FFF;
        }
        int var11 = Trig1.field3439[var10];
        int var12 = Trig1.field3447[var10];
        if (Statics.field2671 != 5) {
            var11 = var11 * 256 / (client.field8976 + 256);
            var12 = var12 * 256 / (client.field8976 + 256);
        }
        int var13 = arg4 * var12 + arg5 * var11 >> 14;
        int var14 = arg5 * var12 - arg4 * var11 >> 14;
        Sprite var15 = Statics.field3311[arg6];
        int var16 = var15.method1061();
        int var17 = var15.method1045();
        int var18 = arg0.field1863 / 2 + var13 - var16 / 2;
        int var19 = var16 + var18;
        int var20 = arg0.field1929 / 2 + -var14 - var17;
        int var21 = var17 + var20;
        if (arg1.method3099(var18, var20) && arg1.method3099(var19, var20) && arg1.method3099(var18, var21) && arg1.method3099(var19, var21)) {
            var15.method1056(arg2 + var18, arg3 + var20, arg1.field1730, arg2, arg3);
            return;
        }
        double var22 = Math.atan2((double) var13, (double) var14);
        int var24 = Math.min(arg0.field1863 / 2, arg0.field1929 / 2);
        int var27 = var24 - 6;
        int var25 = (int) (Math.sin(var22) * (double) var27);
        int var26 = (int) (Math.cos(var22) * (double) var27);
        Statics.field4878[arg6].method2503((float) arg0.field1863 / 2.0F + (float) arg2 + (float) var25, (float) arg0.field1929 / 2.0F + (float) arg3 - (float) var26, 4096, (int) (-var22 / 6.283185307179586D * 65535.0D));
    }

    @ObfuscatedName("aam.b(Lew;Lta;IIIIILjava/lang/String;Ll;Lvm;II)V")
    public static void method14046(Component arg0, GraphicsRelated arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7, Font arg8, FontMetrics arg9, int arg10) {
        int var11;
        if (Statics.field2671 == 5) {
            var11 = (int) client.field9021 & 0x3FFF;
        } else {
            var11 = client.field9087 + (int) client.field9021 & 0x3FFF;
        }
        int var12 = Math.max(arg0.field1863 / 2, arg0.field1929 / 2) + 10;
        int var13 = arg4 * arg4 + arg5 * arg5;
        if (var13 > var12 * var12) {
            return;
        }
        int var14 = Trig1.field3439[var11];
        int var15 = Trig1.field3447[var11];
        if (Statics.field2671 != 5) {
            var14 = var14 * 256 / (client.field8976 + 256);
            var15 = var15 * 256 / (client.field8976 + 256);
        }
        int var16 = arg4 * var15 + arg5 * var14 >> 14;
        int var17 = arg5 * var15 - arg4 * var14 >> 14;
        int var18 = arg9.method12393(arg7, 100, null);
        int var19 = arg9.method12395(arg7, 100, 0, null);
        int var20 = var16 - var18 / 2;
        if (var20 >= -arg0.field1863 && var20 <= arg0.field1863 && var17 >= -arg0.field1929 && var17 <= arg0.field1929) {
            arg8.method836(arg7, arg0.field1863 / 2 + arg2 + var20, arg0.field1929 / 2 + arg3 - var17 - arg6 - var19, var18, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
        }
    }
}
