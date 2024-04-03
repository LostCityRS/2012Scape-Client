import deob.ObfuscatedName;

@ObfuscatedName("dw")
public class ModelUnlit {

    @ObfuscatedName("dw.u")
    public int field1314 = 12;

    @ObfuscatedName("dw.j")
    public int field1328 = 0;

    @ObfuscatedName("dw.a")
    public int field1315 = 0;

    @ObfuscatedName("dw.s")
    public int[] field1316;

    @ObfuscatedName("dw.c")
    public int[] field1320;

    @ObfuscatedName("dw.m")
    public int[] field1318;

    @ObfuscatedName("dw.t")
    public int[] field1313;

    @ObfuscatedName("dw.l")
    public short[] field1321;

    @ObfuscatedName("dw.f")
    public int field1342 = 0;

    @ObfuscatedName("dw.d")
    public short[] field1322;

    @ObfuscatedName("dw.z")
    public short[] field1323;

    @ObfuscatedName("dw.n")
    public short[] field1324;

    @ObfuscatedName("dw.o")
    public byte[] field1345;

    @ObfuscatedName("dw.q")
    public byte[] field1326;

    @ObfuscatedName("dw.p")
    public byte[] field1332;

    @ObfuscatedName("dw.w")
    public byte[] field1348;

    @ObfuscatedName("dw.b")
    public short[] field1329;

    @ObfuscatedName("dw.x")
    public short[] field1330;

    @ObfuscatedName("dw.i")
    public int[] field1331;

    @ObfuscatedName("dw.v")
    public byte field1319 = 0;

    @ObfuscatedName("dw.k")
    public short[] field1333;

    @ObfuscatedName("dw.h")
    public int field1334 = 0;

    @ObfuscatedName("dw.r")
    public byte[] field1335;

    @ObfuscatedName("dw.g")
    public short[] field1336;

    @ObfuscatedName("dw.y")
    public short[] field1337;

    @ObfuscatedName("dw.e")
    public short[] field1338;

    @ObfuscatedName("dw.ay")
    public int[] field1339;

    @ObfuscatedName("dw.af")
    public int[] field1340;

    @ObfuscatedName("dw.ar")
    public int[] field1341;

    @ObfuscatedName("dw.an")
    public int[] field1317;

    @ObfuscatedName("dw.ap")
    public int[] field1343;

    @ObfuscatedName("dw.ag")
    public int[] field1344;

    @ObfuscatedName("dw.as")
    public byte[] field1327;

    @ObfuscatedName("dw.ai")
    public byte[] field1325;

    @ObfuscatedName("dw.ao")
    public ModelParticleEmitter[] field1347;

    @ObfuscatedName("dw.al")
    public ModelParticleEffector[] field1346;

    @ObfuscatedName("dw.at")
    public ModelBillboard[] field1349;

    @ObfuscatedName("dw.u(Lls;II)Ldw;")
    public static ModelUnlit method2664(Js5 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5627(arg1, arg2);
        return var3 == null ? null : new ModelUnlit(var3);
    }

    public ModelUnlit(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2621(arg0);
        } else {
            this.method2624(arg0);
        }
    }

    public ModelUnlit(int arg0, int arg1, int arg2) {
        this.field1316 = new int[arg0];
        this.field1320 = new int[arg0];
        this.field1318 = new int[arg0];
        this.field1313 = new int[arg0];
        this.field1322 = new short[arg1];
        this.field1323 = new short[arg1];
        this.field1324 = new short[arg1];
        this.field1345 = new byte[arg1];
        this.field1326 = new byte[arg1];
        this.field1332 = new byte[arg1];
        this.field1348 = new byte[arg1];
        this.field1329 = new short[arg1];
        this.field1330 = new short[arg1];
        this.field1331 = new int[arg1];
        if (arg2 > 0) {
            this.field1335 = new byte[arg2];
            this.field1336 = new short[arg2];
            this.field1337 = new short[arg2];
            this.field1338 = new short[arg2];
            this.field1339 = new int[arg2];
            this.field1340 = new int[arg2];
            this.field1341 = new int[arg2];
            this.field1327 = new byte[arg2];
            this.field1325 = new byte[arg2];
            this.field1317 = new int[arg2];
            this.field1343 = new int[arg2];
            this.field1344 = new int[arg2];
        }
    }

    public ModelUnlit(ModelUnlit[] arg0, int arg1) {
        this.field1328 = 0;
        this.field1342 = 0;
        this.field1334 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        this.field1319 = -1;
        for (int var12 = 0; var12 < arg1; var12++) {
            ModelUnlit var13 = arg0[var12];
            if (var13 != null) {
                this.field1328 += var13.field1328;
                this.field1342 += var13.field1342;
                this.field1334 += var13.field1334;
                if (var13.field1347 != null) {
                    var3 += var13.field1347.length;
                }
                if (var13.field1346 != null) {
                    var4 += var13.field1346.length;
                }
                if (var13.field1349 != null) {
                    var5 += var13.field1349.length;
                }
                var6 |= var13.field1345 != null;
                if (var13.field1326 == null) {
                    if (this.field1319 == -1) {
                        this.field1319 = var13.field1319;
                    }
                    if (this.field1319 != var13.field1319) {
                        var7 = true;
                    }
                } else {
                    var7 = true;
                }
                var8 |= var13.field1332 != null;
                var9 |= var13.field1348 != null;
                var10 |= var13.field1330 != null;
                var11 |= var13.field1331 != null;
            }
        }
        this.field1316 = new int[this.field1328];
        this.field1320 = new int[this.field1328];
        this.field1318 = new int[this.field1328];
        this.field1313 = new int[this.field1328];
        this.field1321 = new short[this.field1328];
        this.field1322 = new short[this.field1342];
        this.field1323 = new short[this.field1342];
        this.field1324 = new short[this.field1342];
        if (var6) {
            this.field1345 = new byte[this.field1342];
        }
        if (var7) {
            this.field1326 = new byte[this.field1342];
        }
        if (var8) {
            this.field1332 = new byte[this.field1342];
        }
        if (var9) {
            this.field1348 = new byte[this.field1342];
        }
        this.field1329 = new short[this.field1342];
        if (var10) {
            this.field1330 = new short[this.field1342];
        }
        if (var11) {
            this.field1331 = new int[this.field1342];
        }
        this.field1333 = new short[this.field1342];
        if (this.field1334 > 0) {
            this.field1335 = new byte[this.field1334];
            this.field1336 = new short[this.field1334];
            this.field1337 = new short[this.field1334];
            this.field1338 = new short[this.field1334];
            this.field1339 = new int[this.field1334];
            this.field1340 = new int[this.field1334];
            this.field1341 = new int[this.field1334];
            this.field1327 = new byte[this.field1334];
            this.field1325 = new byte[this.field1334];
            this.field1317 = new int[this.field1334];
            this.field1343 = new int[this.field1334];
            this.field1344 = new int[this.field1334];
        }
        if (var5 > 0) {
            this.field1349 = new ModelBillboard[var5];
        }
        if (var3 > 0) {
            this.field1347 = new ModelParticleEmitter[var3];
        }
        if (var4 > 0) {
            this.field1346 = new ModelParticleEffector[var4];
        }
        this.field1328 = 0;
        this.field1342 = 0;
        this.field1334 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        for (int var17 = 0; var17 < arg1; var17++) {
            short var18 = (short) (0x1 << var17);
            ModelUnlit var19 = arg0[var17];
            if (var19 != null) {
                if (var19.field1349 != null) {
                    for (int var20 = 0; var20 < var19.field1349.length; var20++) {
                        ModelBillboard var21 = var19.field1349[var20];
                        this.field1349[var16++] = var21.method2784(var21.field1513 + this.field1342);
                    }
                }
                for (int var22 = 0; var22 < var19.field1342; var22++) {
                    if (var6 && var19.field1345 != null) {
                        this.field1345[this.field1342] = var19.field1345[var22];
                    }
                    if (var7) {
                        if (var19.field1326 == null) {
                            this.field1326[this.field1342] = var19.field1319;
                        } else {
                            this.field1326[this.field1342] = var19.field1326[var22];
                        }
                    }
                    if (var8 && var19.field1332 != null) {
                        this.field1332[this.field1342] = var19.field1332[var22];
                    }
                    if (var10) {
                        if (var19.field1330 == null) {
                            this.field1330[this.field1342] = -1;
                        } else {
                            this.field1330[this.field1342] = var19.field1330[var22];
                        }
                    }
                    if (var11) {
                        if (var19.field1331 == null) {
                            this.field1331[this.field1342] = -1;
                        } else {
                            this.field1331[this.field1342] = var19.field1331[var22];
                        }
                    }
                    this.field1322[this.field1342] = (short) this.method2620(var19, var19.field1322[var22], var18);
                    this.field1323[this.field1342] = (short) this.method2620(var19, var19.field1323[var22], var18);
                    this.field1324[this.field1342] = (short) this.method2620(var19, var19.field1324[var22], var18);
                    this.field1333[this.field1342] = var18;
                    this.field1329[this.field1342] = var19.field1329[var22];
                    this.field1342++;
                }
                if (var19.field1347 != null) {
                    for (int var23 = 0; var23 < var19.field1347.length; var23++) {
                        int var24 = this.method2620(var19, var19.field1347[var23].field1374, var18);
                        int var25 = this.method2620(var19, var19.field1347[var23].field1375, var18);
                        int var26 = this.method2620(var19, var19.field1347[var23].field1376, var18);
                        this.field1347[var14] = var19.field1347[var23].method2701(var24, var25, var26);
                        var14++;
                    }
                }
                if (var19.field1346 != null) {
                    for (int var27 = 0; var27 < var19.field1346.length; var27++) {
                        int var28 = this.method2620(var19, var19.field1346[var27].field1239, var18);
                        this.field1346[var15] = var19.field1346[var27].method2536(var28);
                        var15++;
                    }
                }
            }
        }
        int var29 = 0;
        this.field1315 = this.field1328;
        for (int var30 = 0; var30 < arg1; var30++) {
            short var31 = (short) (0x1 << var30);
            ModelUnlit var32 = arg0[var30];
            if (var32 != null) {
                for (int var33 = 0; var33 < var32.field1342; var33++) {
                    if (var9) {
                        this.field1348[var29++] = (byte) (var32.field1348 == null || var32.field1348[var33] == -1 ? -1 : var32.field1348[var33] + this.field1334);
                    }
                }
                for (int var34 = 0; var34 < var32.field1334; var34++) {
                    byte var35 = this.field1335[this.field1334] = var32.field1335[var34];
                    if (var35 == 0) {
                        this.field1336[this.field1334] = (short) this.method2620(var32, var32.field1336[var34], var31);
                        this.field1337[this.field1334] = (short) this.method2620(var32, var32.field1337[var34], var31);
                        this.field1338[this.field1334] = (short) this.method2620(var32, var32.field1338[var34], var31);
                    }
                    if (var35 >= 1 && var35 <= 3) {
                        this.field1336[this.field1334] = var32.field1336[var34];
                        this.field1337[this.field1334] = var32.field1337[var34];
                        this.field1338[this.field1334] = var32.field1338[var34];
                        this.field1339[this.field1334] = var32.field1339[var34];
                        this.field1340[this.field1334] = var32.field1340[var34];
                        this.field1341[this.field1334] = var32.field1341[var34];
                        this.field1327[this.field1334] = var32.field1327[var34];
                        this.field1325[this.field1334] = var32.field1325[var34];
                        this.field1317[this.field1334] = var32.field1317[var34];
                    }
                    if (var35 == 2) {
                        this.field1343[this.field1334] = var32.field1343[var34];
                        this.field1344[this.field1334] = var32.field1344[var34];
                    }
                    this.field1334++;
                }
            }
        }
    }

    @ObfuscatedName("dw.j(Ldw;IS)I")
    public final int method2620(ModelUnlit arg0, int arg1, short arg2) {
        int var4 = arg0.field1316[arg1];
        int var5 = arg0.field1320[arg1];
        int var6 = arg0.field1318[arg1];
        for (int var7 = 0; var7 < this.field1328; var7++) {
            if (this.field1316[var7] == var4 && this.field1320[var7] == var5 && this.field1318[var7] == var6) {
                this.field1321[var7] |= arg2;
                return var7;
            }
        }
        this.field1316[this.field1328] = var4;
        this.field1320[this.field1328] = var5;
        this.field1318[this.field1328] = var6;
        this.field1321[this.field1328] = arg2;
        this.field1313[this.field1328] = arg0.field1313 == null ? -1 : arg0.field1313[arg1];
        return this.field1328++;
    }

    @ObfuscatedName("dw.a([B)V")
    public void method2621(byte[] arg0) {
        Packet var2 = new Packet(arg0);
        Packet var3 = new Packet(arg0);
        Packet var4 = new Packet(arg0);
        Packet var5 = new Packet(arg0);
        Packet var6 = new Packet(arg0);
        Packet var7 = new Packet(arg0);
        Packet var8 = new Packet(arg0);
        var2.field9626 = arg0.length - 23;
        this.field1328 = var2.method15239();
        this.field1342 = var2.method15239();
        this.field1334 = var2.method15220();
        int var9 = var2.method15220();
        boolean var10 = (var9 & 0x1) == 1;
        boolean var11 = (var9 & 0x2) == 2;
        boolean var12 = (var9 & 0x4) == 4;
        boolean var13 = (var9 & 0x8) == 8;
        boolean var14 = (var9 & 0x10) == 16;
        boolean var15 = (var9 & 0x20) == 32;
        boolean var16 = (var9 & 0x40) == 64;
        if (var13) {
            var2.field9626 -= 7;
            this.field1314 = var2.method15220();
            var2.field9626 += 6;
        }
        int var17 = var2.method15220();
        int var18 = var2.method15220();
        int var19 = var2.method15220();
        int var20 = var2.method15220();
        int var21 = var2.method15220();
        int var22 = var2.method15239();
        int var23 = var2.method15239();
        int var24 = var2.method15239();
        int var25 = var2.method15239();
        int var26 = var2.method15239();
        int var27;
        if (var14) {
            var27 = var2.method15239();
        } else if (var21 == 1) {
            var27 = this.field1328;
        } else {
            var27 = 0;
        }
        int var28;
        if (var15) {
            var28 = var2.method15239();
        } else if (var19 == 1) {
            var28 = this.field1342;
        } else {
            var28 = 0;
        }
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        if (this.field1334 > 0) {
            this.field1335 = new byte[this.field1334];
            var2.field9626 = 0;
            for (int var32 = 0; var32 < this.field1334; var32++) {
                byte var33 = this.field1335[var32] = var2.method15238();
                if (var33 == 0) {
                    var29++;
                }
                if (var33 >= 1 && var33 <= 3) {
                    var30++;
                }
                if (var33 == 2) {
                    var31++;
                }
            }
        }
        int var34 = this.field1334;
        int var36 = this.field1328 + var34;
        int var37 = var36;
        if (var10) {
            var36 += this.field1342;
        }
        int var39 = this.field1342 + var36;
        int var40 = var39;
        if (var17 == 255) {
            var39 += this.field1342;
        }
        int var42 = var28 + var39;
        int var44 = var27 + var42;
        int var45 = var44;
        if (var18 == 1) {
            var44 += this.field1342;
        }
        int var47 = var25 + var44;
        int var48 = var47;
        if (var20 == 1) {
            var47 += this.field1342 * 2;
        }
        int var50 = var26 + var47;
        int var52 = this.field1342 * 2 + var50;
        int var54 = var22 + var52;
        int var56 = var23 + var54;
        int var58 = var24 + var56;
        int var60 = var29 * 6 + var58;
        int var62 = var30 * 6 + var60;
        byte var63 = 6;
        if (this.field1314 == 14) {
            var63 = 7;
        } else if (this.field1314 >= 15) {
            var63 = 9;
        }
        int var65 = var30 * var63 + var62;
        int var67 = var30 + var65;
        int var69 = var30 + var67;
        int var71 = var31 * 2 + var30 + var69;
        this.field1316 = new int[this.field1328];
        this.field1320 = new int[this.field1328];
        this.field1318 = new int[this.field1328];
        this.field1322 = new short[this.field1342];
        this.field1323 = new short[this.field1342];
        this.field1324 = new short[this.field1342];
        if (var21 == 1) {
            this.field1313 = new int[this.field1328];
        }
        if (var10) {
            this.field1345 = new byte[this.field1342];
        }
        if (var17 == 255) {
            this.field1326 = new byte[this.field1342];
        } else {
            this.field1319 = (byte) var17;
        }
        if (var18 == 1) {
            this.field1332 = new byte[this.field1342];
        }
        if (var19 == 1) {
            this.field1331 = new int[this.field1342];
        }
        if (var20 == 1) {
            this.field1330 = new short[this.field1342];
        }
        if (var20 == 1 && this.field1334 > 0) {
            this.field1348 = new byte[this.field1342];
        }
        this.field1329 = new short[this.field1342];
        if (this.field1334 > 0) {
            this.field1336 = new short[this.field1334];
            this.field1337 = new short[this.field1334];
            this.field1338 = new short[this.field1334];
            if (var30 > 0) {
                this.field1339 = new int[var30];
                this.field1340 = new int[var30];
                this.field1341 = new int[var30];
                this.field1327 = new byte[var30];
                this.field1325 = new byte[var30];
                this.field1317 = new int[var30];
            }
            if (var31 > 0) {
                this.field1343 = new int[var31];
                this.field1344 = new int[var31];
            }
        }
        var2.field9626 = var34;
        var3.field9626 = var52;
        var4.field9626 = var54;
        var5.field9626 = var56;
        var6.field9626 = var42;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < this.field1328; var76++) {
            int var77 = var2.method15220();
            int var78 = 0;
            if ((var77 & 0x1) != 0) {
                var78 = var3.method15254();
            }
            int var79 = 0;
            if ((var77 & 0x2) != 0) {
                var79 = var4.method15254();
            }
            int var80 = 0;
            if ((var77 & 0x4) != 0) {
                var80 = var5.method15254();
            }
            this.field1316[var76] = var73 + var78;
            this.field1320[var76] = var74 + var79;
            this.field1318[var76] = var75 + var80;
            var73 = this.field1316[var76];
            var74 = this.field1320[var76];
            var75 = this.field1318[var76];
            if (var21 == 1) {
                if (var14) {
                    this.field1313[var76] = var6.method15355();
                } else {
                    this.field1313[var76] = var6.method15220();
                    if (this.field1313[var76] == 255) {
                        this.field1313[var76] = -1;
                    }
                }
            }
        }
        var2.field9626 = var50;
        var3.field9626 = var37;
        var4.field9626 = var40;
        var5.field9626 = var45;
        var6.field9626 = var39;
        var7.field9626 = var48;
        var8.field9626 = var47;
        for (int var81 = 0; var81 < this.field1342; var81++) {
            this.field1329[var81] = (short) var2.method15239();
            if (var10) {
                this.field1345[var81] = var3.method15238();
            }
            if (var17 == 255) {
                this.field1326[var81] = var4.method15238();
            }
            if (var18 == 1) {
                this.field1332[var81] = var5.method15238();
            }
            if (var19 == 1) {
                if (var15) {
                    this.field1331[var81] = var6.method15355();
                } else {
                    this.field1331[var81] = var6.method15220();
                    if (this.field1331[var81] == 255) {
                        this.field1331[var81] = -1;
                    }
                }
            }
            if (var20 == 1) {
                this.field1330[var81] = (short) (var7.method15239() - 1);
            }
            if (this.field1348 != null) {
                if (this.field1330[var81] == -1) {
                    this.field1348[var81] = -1;
                } else {
                    this.field1348[var81] = (byte) (var8.method15220() - 1);
                }
            }
        }
        this.field1315 = -1;
        var2.field9626 = var44;
        var3.field9626 = var36;
        this.method2622(var2, var3);
        var2.field9626 = var58;
        var3.field9626 = var60;
        var4.field9626 = var62;
        var5.field9626 = var65;
        var6.field9626 = var67;
        var7.field9626 = var69;
        this.method2628(var2, var3, var4, var5, var6, var7);
        var2.field9626 = var71;
        if (var11) {
            int var82 = var2.method15220();
            if (var82 > 0) {
                this.field1347 = new ModelParticleEmitter[var82];
                for (int var83 = 0; var83 < var82; var83++) {
                    int var84 = var2.method15239();
                    int var85 = var2.method15239();
                    byte var86;
                    if (var17 == 255) {
                        var86 = this.field1326[var85];
                    } else {
                        var86 = (byte) var17;
                    }
                    this.field1347[var83] = new ModelParticleEmitter(var84, this.field1322[var85], this.field1323[var85], this.field1324[var85], var86);
                }
            }
            int var87 = var2.method15220();
            if (var87 > 0) {
                this.field1346 = new ModelParticleEffector[var87];
                for (int var88 = 0; var88 < var87; var88++) {
                    int var89 = var2.method15239();
                    int var90 = var2.method15239();
                    this.field1346[var88] = new ModelParticleEffector(var89, var90);
                }
            }
        }
        if (!var12) {
            return;
        }
        int var91 = var2.method15220();
        if (var91 <= 0) {
            return;
        }
        this.field1349 = new ModelBillboard[var91];
        for (int var92 = 0; var92 < var91; var92++) {
            int var93 = var2.method15239();
            int var94 = var2.method15239();
            int var95;
            if (var16) {
                var95 = var2.method15355();
            } else {
                var95 = var2.method15220();
                if (var95 == 255) {
                    var95 = -1;
                }
            }
            byte var96 = var2.method15238();
            this.field1349[var92] = new ModelBillboard(var93, var94, var95, var96);
        }
    }

    @ObfuscatedName("dw.s(Laet;Laet;)V")
    public void method2622(Packet arg0, Packet arg1) {
        short var3 = 0;
        short var4 = 0;
        short var5 = 0;
        short var6 = 0;
        for (int var7 = 0; var7 < this.field1342; var7++) {
            int var8 = arg1.method15220();
            if (var8 == 1) {
                var3 = (short) (arg0.method15254() + var6);
                var4 = (short) (arg0.method15254() + var3);
                var5 = (short) (arg0.method15254() + var4);
                var6 = var5;
                this.field1322[var7] = var3;
                this.field1323[var7] = var4;
                this.field1324[var7] = var5;
                if (var3 > this.field1315) {
                    this.field1315 = var3;
                }
                if (var4 > this.field1315) {
                    this.field1315 = var4;
                }
                if (var5 > this.field1315) {
                    this.field1315 = var5;
                }
            }
            if (var8 == 2) {
                var4 = var5;
                var5 = (short) (arg0.method15254() + var6);
                var6 = var5;
                this.field1322[var7] = var3;
                this.field1323[var7] = var4;
                this.field1324[var7] = var5;
                if (var5 > this.field1315) {
                    this.field1315 = var5;
                }
            }
            if (var8 == 3) {
                var3 = var5;
                var5 = (short) (arg0.method15254() + var6);
                var6 = var5;
                this.field1322[var7] = var3;
                this.field1323[var7] = var4;
                this.field1324[var7] = var5;
                if (var5 > this.field1315) {
                    this.field1315 = var5;
                }
            }
            if (var8 == 4) {
                short var11 = var3;
                var3 = var4;
                var4 = var11;
                var5 = (short) (arg0.method15254() + var6);
                var6 = var5;
                this.field1322[var7] = var3;
                this.field1323[var7] = var11;
                this.field1324[var7] = var5;
                if (var5 > this.field1315) {
                    this.field1315 = var5;
                }
            }
        }
        this.field1315++;
    }

    @ObfuscatedName("dw.c(Laet;Laet;Laet;Laet;Laet;Laet;)V")
    public void method2628(Packet arg0, Packet arg1, Packet arg2, Packet arg3, Packet arg4, Packet arg5) {
        for (int var7 = 0; var7 < this.field1334; var7++) {
            int var8 = this.field1335[var7] & 0xFF;
            if (var8 == 0) {
                this.field1336[var7] = (short) arg0.method15239();
                this.field1337[var7] = (short) arg0.method15239();
                this.field1338[var7] = (short) arg0.method15239();
            }
            if (var8 == 1) {
                this.field1336[var7] = (short) arg1.method15239();
                this.field1337[var7] = (short) arg1.method15239();
                this.field1338[var7] = (short) arg1.method15239();
                if (this.field1314 < 15) {
                    this.field1339[var7] = arg2.method15239();
                    if (this.field1314 < 14) {
                        this.field1340[var7] = arg2.method15239();
                    } else {
                        this.field1340[var7] = arg2.method15241();
                    }
                    this.field1341[var7] = arg2.method15239();
                } else {
                    this.field1339[var7] = arg2.method15241();
                    this.field1340[var7] = arg2.method15241();
                    this.field1341[var7] = arg2.method15241();
                }
                this.field1327[var7] = arg3.method15238();
                this.field1325[var7] = arg4.method15238();
                this.field1317[var7] = arg5.method15238();
            }
            if (var8 == 2) {
                this.field1336[var7] = (short) arg1.method15239();
                this.field1337[var7] = (short) arg1.method15239();
                this.field1338[var7] = (short) arg1.method15239();
                if (this.field1314 < 15) {
                    this.field1339[var7] = arg2.method15239();
                    if (this.field1314 < 14) {
                        this.field1340[var7] = arg2.method15239();
                    } else {
                        this.field1340[var7] = arg2.method15241();
                    }
                    this.field1341[var7] = arg2.method15239();
                } else {
                    this.field1339[var7] = arg2.method15241();
                    this.field1340[var7] = arg2.method15241();
                    this.field1341[var7] = arg2.method15241();
                }
                this.field1327[var7] = arg3.method15238();
                this.field1325[var7] = arg4.method15238();
                this.field1317[var7] = arg5.method15238();
                this.field1343[var7] = arg5.method15238();
                this.field1344[var7] = arg5.method15238();
            }
            if (var8 == 3) {
                this.field1336[var7] = (short) arg1.method15239();
                this.field1337[var7] = (short) arg1.method15239();
                this.field1338[var7] = (short) arg1.method15239();
                if (this.field1314 < 15) {
                    this.field1339[var7] = arg2.method15239();
                    if (this.field1314 < 14) {
                        this.field1340[var7] = arg2.method15239();
                    } else {
                        this.field1340[var7] = arg2.method15241();
                    }
                    this.field1341[var7] = arg2.method15239();
                } else {
                    this.field1339[var7] = arg2.method15241();
                    this.field1340[var7] = arg2.method15241();
                    this.field1341[var7] = arg2.method15241();
                }
                this.field1327[var7] = arg3.method15238();
                this.field1325[var7] = arg4.method15238();
                this.field1317[var7] = arg5.method15238();
            }
        }
    }

    @ObfuscatedName("dw.m([B)V")
    public void method2624(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        Packet var4 = new Packet(arg0);
        Packet var5 = new Packet(arg0);
        Packet var6 = new Packet(arg0);
        Packet var7 = new Packet(arg0);
        Packet var8 = new Packet(arg0);
        var4.field9626 = arg0.length - 18;
        this.field1328 = var4.method15239();
        this.field1342 = var4.method15239();
        this.field1334 = var4.method15220();
        int var9 = var4.method15220();
        int var10 = var4.method15220();
        int var11 = var4.method15220();
        int var12 = var4.method15220();
        int var13 = var4.method15220();
        int var14 = var4.method15239();
        int var15 = var4.method15239();
        int var16 = var4.method15239();
        int var17 = var4.method15239();
        byte var18 = 0;
        int var20 = this.field1328 + var18;
        int var22 = this.field1342 + var20;
        int var23 = var22;
        if (var10 == 255) {
            var22 += this.field1342;
        }
        int var24 = var22;
        if (var12 == 1) {
            var22 += this.field1342;
        }
        int var25 = var22;
        if (var9 == 1) {
            var22 += this.field1342;
        }
        int var26 = var22;
        if (var13 == 1) {
            var22 += this.field1328;
        }
        int var27 = var22;
        if (var11 == 1) {
            var22 += this.field1342;
        }
        int var29 = var17 + var22;
        int var31 = this.field1342 * 2 + var29;
        int var33 = this.field1334 * 6 + var31;
        int var35 = var14 + var33;
        int var37 = var15 + var35;
        int var10000 = var16 + var37;
        this.field1316 = new int[this.field1328];
        this.field1320 = new int[this.field1328];
        this.field1318 = new int[this.field1328];
        this.field1322 = new short[this.field1342];
        this.field1323 = new short[this.field1342];
        this.field1324 = new short[this.field1342];
        if (this.field1334 > 0) {
            this.field1335 = new byte[this.field1334];
            this.field1336 = new short[this.field1334];
            this.field1337 = new short[this.field1334];
            this.field1338 = new short[this.field1334];
        }
        if (var13 == 1) {
            this.field1313 = new int[this.field1328];
        }
        if (var9 == 1) {
            this.field1345 = new byte[this.field1342];
            this.field1348 = new byte[this.field1342];
            this.field1330 = new short[this.field1342];
        }
        if (var10 == 255) {
            this.field1326 = new byte[this.field1342];
        } else {
            this.field1319 = (byte) var10;
        }
        if (var11 == 1) {
            this.field1332 = new byte[this.field1342];
        }
        if (var12 == 1) {
            this.field1331 = new int[this.field1342];
        }
        this.field1329 = new short[this.field1342];
        var4.field9626 = var18;
        var5.field9626 = var33;
        var6.field9626 = var35;
        var7.field9626 = var37;
        var8.field9626 = var26;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < this.field1328; var43++) {
            int var44 = var4.method15220();
            int var45 = 0;
            if ((var44 & 0x1) != 0) {
                var45 = var5.method15254();
            }
            int var46 = 0;
            if ((var44 & 0x2) != 0) {
                var46 = var6.method15254();
            }
            int var47 = 0;
            if ((var44 & 0x4) != 0) {
                var47 = var7.method15254();
            }
            this.field1316[var43] = var40 + var45;
            this.field1320[var43] = var41 + var46;
            this.field1318[var43] = var42 + var47;
            var40 = this.field1316[var43];
            var41 = this.field1320[var43];
            var42 = this.field1318[var43];
            if (var13 == 1) {
                this.field1313[var43] = var8.method15220();
            }
        }
        var4.field9626 = var29;
        var5.field9626 = var25;
        var6.field9626 = var23;
        var7.field9626 = var27;
        var8.field9626 = var24;
        for (int var48 = 0; var48 < this.field1342; var48++) {
            this.field1329[var48] = (short) var4.method15239();
            if (var9 == 1) {
                int var49 = var5.method15220();
                if ((var49 & 0x1) == 1) {
                    this.field1345[var48] = 1;
                    var2 = true;
                } else {
                    this.field1345[var48] = 0;
                }
                if ((var49 & 0x2) == 2) {
                    this.field1348[var48] = (byte) (var49 >> 2);
                    this.field1330[var48] = this.field1329[var48];
                    this.field1329[var48] = 127;
                    if (this.field1330[var48] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1348[var48] = -1;
                    this.field1330[var48] = -1;
                }
            }
            if (var10 == 255) {
                this.field1326[var48] = var6.method15238();
            }
            if (var11 == 1) {
                this.field1332[var48] = var7.method15238();
            }
            if (var12 == 1) {
                this.field1331[var48] = var8.method15220();
            }
        }
        this.field1315 = -1;
        var4.field9626 = var22;
        var5.field9626 = var20;
        short var50 = 0;
        short var51 = 0;
        short var52 = 0;
        short var53 = 0;
        for (int var54 = 0; var54 < this.field1342; var54++) {
            int var55 = var5.method15220();
            if (var55 == 1) {
                var50 = (short) (var4.method15254() + var53);
                var51 = (short) (var4.method15254() + var50);
                var52 = (short) (var4.method15254() + var51);
                var53 = var52;
                this.field1322[var54] = var50;
                this.field1323[var54] = var51;
                this.field1324[var54] = var52;
                if (var50 > this.field1315) {
                    this.field1315 = var50;
                }
                if (var51 > this.field1315) {
                    this.field1315 = var51;
                }
                if (var52 > this.field1315) {
                    this.field1315 = var52;
                }
            }
            if (var55 == 2) {
                var51 = var52;
                var52 = (short) (var4.method15254() + var53);
                var53 = var52;
                this.field1322[var54] = var50;
                this.field1323[var54] = var51;
                this.field1324[var54] = var52;
                if (var52 > this.field1315) {
                    this.field1315 = var52;
                }
            }
            if (var55 == 3) {
                var50 = var52;
                var52 = (short) (var4.method15254() + var53);
                var53 = var52;
                this.field1322[var54] = var50;
                this.field1323[var54] = var51;
                this.field1324[var54] = var52;
                if (var52 > this.field1315) {
                    this.field1315 = var52;
                }
            }
            if (var55 == 4) {
                short var58 = var50;
                var50 = var51;
                var51 = var58;
                var52 = (short) (var4.method15254() + var53);
                var53 = var52;
                this.field1322[var54] = var50;
                this.field1323[var54] = var58;
                this.field1324[var54] = var52;
                if (var52 > this.field1315) {
                    this.field1315 = var52;
                }
            }
        }
        this.field1315++;
        var4.field9626 = var31;
        for (int var59 = 0; var59 < this.field1334; var59++) {
            this.field1335[var59] = 0;
            this.field1336[var59] = (short) var4.method15239();
            this.field1337[var59] = (short) var4.method15239();
            this.field1338[var59] = (short) var4.method15239();
        }
        if (this.field1348 != null) {
            boolean var60 = false;
            for (int var61 = 0; var61 < this.field1342; var61++) {
                int var62 = this.field1348[var61] & 0xFF;
                if (var62 != 255) {
                    if ((this.field1336[var62] & 0xFFFF) == this.field1322[var61] && (this.field1337[var62] & 0xFFFF) == this.field1323[var61] && (this.field1338[var62] & 0xFFFF) == this.field1324[var61]) {
                        this.field1348[var61] = -1;
                    } else {
                        var60 = true;
                    }
                }
            }
            if (!var60) {
                this.field1348 = null;
            }
        }
        if (!var3) {
            this.field1330 = null;
        }
        if (!var2) {
            this.field1345 = null;
        }
    }

    @ObfuscatedName("dw.t(III)I")
    public int method2625(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1328; var4++) {
            if (this.field1316[var4] == arg0 && this.field1320[var4] == arg1 && this.field1318[var4] == arg2) {
                return var4;
            }
        }
        this.field1316[this.field1328] = arg0;
        this.field1320[this.field1328] = arg1;
        this.field1318[this.field1328] = arg2;
        this.field1315 = this.field1328 + 1;
        return this.field1328++;
    }

    @ObfuscatedName("dw.l(IIIBBSBS)I")
    public int method2626(int arg0, int arg1, int arg2, byte arg3, byte arg4, short arg5, byte arg6, short arg7) {
        this.field1322[this.field1342] = (short) arg0;
        this.field1323[this.field1342] = (short) arg1;
        this.field1324[this.field1342] = (short) arg2;
        this.field1345[this.field1342] = arg3;
        this.field1348[this.field1342] = arg4;
        this.field1329[this.field1342] = arg5;
        this.field1332[this.field1342] = arg6;
        this.field1330[this.field1342] = arg7;
        return this.field1342++;
    }

    @ObfuscatedName("dw.f(SSSSSSBBB)B")
    public byte method2653(short arg0, short arg1, short arg2, short arg3, short arg4, short arg5, byte arg6, byte arg7, byte arg8) {
        if (this.field1334 >= 255) {
            throw new IllegalStateException();
        }
        this.field1335[this.field1334] = 3;
        this.field1336[this.field1334] = arg0;
        this.field1337[this.field1334] = arg1;
        this.field1338[this.field1334] = arg2;
        this.field1339[this.field1334] = arg3;
        this.field1340[this.field1334] = arg4;
        this.field1341[this.field1334] = arg5;
        this.field1327[this.field1334] = arg6;
        this.field1325[this.field1334] = arg7;
        this.field1317[this.field1334] = arg8;
        return (byte) this.field1334++;
    }

    @ObfuscatedName("dw.d(Z)[[I")
    public int[][] method2649(boolean arg0) {
        int[] var2 = new int[256];
        int var3 = 0;
        int var4 = arg0 ? this.field1328 : this.field1315;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field1313[var5];
            if (var6 >= 0) {
                int var10002 = var2[var6]++;
                if (var6 > var3) {
                    var3 = var6;
                }
            }
        }
        int[][] var7 = new int[var3 + 1][];
        for (int var8 = 0; var8 <= var3; var8++) {
            var7[var8] = new int[var2[var8]];
            var2[var8] = 0;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = this.field1313[var9];
            if (var10 >= 0) {
                var7[var10][var2[var10]++] = var9;
            }
        }
        return var7;
    }

    @ObfuscatedName("dw.z()[[I")
    public int[][] method2671() {
        int[] var1 = new int[256];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1342; var3++) {
            int var4 = this.field1331[var3];
            if (var4 >= 0) {
                int var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
        }
        int[][] var5 = new int[var2 + 1][];
        for (int var6 = 0; var6 <= var2; var6++) {
            var5[var6] = new int[var1[var6]];
            var1[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field1342; var7++) {
            int var8 = this.field1331[var7];
            if (var8 >= 0) {
                var5[var8][var1[var8]++] = var7;
            }
        }
        return var5;
    }

    @ObfuscatedName("dw.n()[[I")
    public int[][] method2629() {
        int[] var1 = new int[256];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1349.length; var3++) {
            int var4 = this.field1349[var3].field1511;
            if (var4 >= 0) {
                int var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
        }
        int[][] var5 = new int[var2 + 1][];
        for (int var6 = 0; var6 <= var2; var6++) {
            var5[var6] = new int[var1[var6]];
            var1[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field1349.length; var7++) {
            int var8 = this.field1349[var7].field1511;
            if (var8 >= 0) {
                var5[var8][var1[var8]++] = var7;
            }
        }
        return var5;
    }

    @ObfuscatedName("dw.o(SS)V")
    public void method2661(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1342; var3++) {
            if (this.field1329[var3] == arg0) {
                this.field1329[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dw.q(SS)V")
    public void method2656(short arg0, short arg1) {
        if (this.field1330 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1342; var3++) {
            if (this.field1330[var3] == arg0) {
                this.field1330[var3] = arg1;
            }
        }
    }

    @ObfuscatedName("dw.p(III)V")
    public void method2630(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1328; var4++) {
            this.field1316[var4] += arg0;
            this.field1320[var4] += arg1;
            this.field1318[var4] += arg2;
        }
    }

    @ObfuscatedName("dw.w(III)V")
    public void method2633(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = Trig1.field3439[arg2];
            int var5 = Trig1.field3447[arg2];
            for (int var6 = 0; var6 < this.field1328; var6++) {
                int var7 = this.field1320[var6] * var4 + this.field1316[var6] * var5 >> 14;
                this.field1320[var6] = this.field1320[var6] * var5 - this.field1316[var6] * var4 >> 14;
                this.field1316[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = Trig1.field3439[arg0];
            int var9 = Trig1.field3447[arg0];
            for (int var10 = 0; var10 < this.field1328; var10++) {
                int var11 = this.field1320[var10] * var9 - this.field1318[var10] * var8 >> 14;
                this.field1318[var10] = this.field1320[var10] * var8 + this.field1318[var10] * var9 >> 14;
                this.field1320[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = Trig1.field3439[arg1];
        int var13 = Trig1.field3447[arg1];
        for (int var14 = 0; var14 < this.field1328; var14++) {
            int var15 = this.field1318[var14] * var12 + this.field1316[var14] * var13 >> 14;
            this.field1318[var14] = this.field1318[var14] * var13 - this.field1316[var14] * var12 >> 14;
            this.field1316[var14] = var15;
        }
    }

    @ObfuscatedName("dw.b(I)V")
    public void method2634(int arg0) {
        for (int var2 = 0; var2 < this.field1328; var2++) {
            this.field1316[var2] <<= arg0;
            this.field1320[var2] <<= arg0;
            this.field1318[var2] <<= arg0;
        }
        if (this.field1334 <= 0 || this.field1339 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1339.length; var3++) {
            this.field1339[var3] <<= arg0;
            this.field1340[var3] <<= arg0;
            if (this.field1335[var3] != 1) {
                this.field1341[var3] <<= arg0;
            }
        }
    }
}
