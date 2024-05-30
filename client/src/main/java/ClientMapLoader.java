import deob.ObfuscatedName;

@ObfuscatedName("abo")
public class ClientMapLoader extends MapLoader {

    @ObfuscatedName("abo.cr")
    public static boolean field8895 = false;

    @ObfuscatedName("abo.cp")
    public static boolean field8884 = false;

    @ObfuscatedName("abo.ck")
    public static final int[] field8890 = new int[]{1, 0, -1, 0};

    @ObfuscatedName("abo.cd")
    public static final int[] field8886 = new int[]{0, -1, 0, 1};

    @ObfuscatedName("abo.ce")
    public static final int[] field8891 = new int[]{1, -1, -1, 1};

    @ObfuscatedName("abo.ct")
    public static final int[] field8892 = new int[]{-1, -1, 1, 1};

    @ObfuscatedName("abo.cu")
    public int field8893 = 99;

    @ObfuscatedName("abo.cc")
    public EnvironmentManager field8883;

    @ObfuscatedName("abo.cg")
    public LocTypeList field8894;

    public ClientMapLoader(Scene arg0, LocTypeList arg1, int arg2, int arg3, int arg4, boolean arg5, SceneLevelTileFlags arg6, EnvironmentManager arg7) {
        super(arg0, arg2, arg3, arg4, arg5, Statics.floTypes, Statics.field4450, arg6);
        this.field8894 = arg1;
        this.field8883 = arg7;
    }

    @ObfuscatedName("abo.cd(Lra;Laet;IIB)V")
    public final void method14269(RendererToolkit arg0, Packet arg1, int arg2, int arg3) {
        if (this.field3644) {
            return;
        }
        boolean var5 = false;
        Environment var6 = null;
        while (true) {
            while (arg1.pos < arg1.data.length) {
                int var7 = arg1.g1();
                if (var7 == 0) {
                    if (var6 == null) {
                        var6 = new Environment(arg1, this.field8883);
                    } else {
                        var6.method8205(arg1, this.field8883);
                    }
                } else if (var7 == 1) {
                    int var8 = arg1.g1();
                    if (var8 > 0) {
                        for (int var9 = 0; var9 < var8; var9++) {
                            StaticPointLight var10 = new StaticPointLight(arg0, this.field3619.field4510, arg1, 2);
                            if (var10.field4594 == 31) {
                                LightType var11 = Statics.field785.method12453(arg1.g2());
                                var10.method7577(var11.field7188, var11.field7191, var11.field7189, var11.field7190);
                            }
                            if (arg0.method768() > 0) {
                                Light var12 = var10.field4588;
                                int var13 = var12.method14888() + (arg2 << 9);
                                int var14 = var12.method14879() + (arg3 << 9);
                                int var15 = var13 >> 9;
                                int var16 = var14 >> 9;
                                if (var15 >= 0 && var16 >= 0 && var15 < this.field3627 && var16 < this.field3643) {
                                    var12.method14884(var13, this.field3697[var10.field4592][var15][var16] - var12.method14882(), var14);
                                    this.field3619.method7454(var10);
                                }
                            }
                        }
                    }
                } else if (var7 == 2) {
                    if (var6 == null) {
                        var6 = new Environment();
                    }
                    var6.method8206(arg1);
                } else if (var7 == 128) {
                    if (var6 == null) {
                        var6 = new Environment();
                    }
                    var6.method8207(arg1, this.field8883);
                } else if (var7 == 129) {
                    if (this.field3631 == null) {
                        this.field3631 = new byte[4][][];
                    }
                    for (int var17 = 0; var17 < 4; var17++) {
                        byte var18 = arg1.g1b();
                        if (var18 == 0 && this.field3631[var17] != null) {
                            int var19 = arg2;
                            int var20 = arg2 + 64;
                            int var21 = arg3;
                            int var22 = arg3 + 64;
                            if (arg2 < 0) {
                                var19 = 0;
                            } else if (arg2 >= this.field3627) {
                                var19 = this.field3627;
                            }
                            if (var20 < 0) {
                                var20 = 0;
                            } else if (var20 >= this.field3627) {
                                var20 = this.field3627;
                            }
                            if (arg3 < 0) {
                                var21 = 0;
                            } else if (arg3 >= this.field3643) {
                                var21 = this.field3643;
                            }
                            if (var22 < 0) {
                                var22 = 0;
                            } else if (var22 >= this.field3643) {
                                var22 = this.field3643;
                            }
                            while (var19 < var20) {
                                while (var21 < var22) {
                                    this.field3631[var17][var19][var21] = 0;
                                    var21++;
                                }
                                var19++;
                            }
                        } else if (var18 == 1) {
                            if (this.field3631[var17] == null) {
                                this.field3631[var17] = new byte[this.field3627 + 1][this.field3643 + 1];
                            }
                            for (int var23 = 0; var23 < 64; var23 += 4) {
                                for (int var24 = 0; var24 < 64; var24 += 4) {
                                    byte var25 = arg1.g1b();
                                    for (int var26 = arg2 + var23; var26 < arg2 + var23 + 4; var26++) {
                                        for (int var27 = arg3 + var24; var27 < arg3 + var24 + 4; var27++) {
                                            if (var26 >= 0 && var26 < this.field3627 && var27 >= 0 && var27 < this.field3643) {
                                                this.field3631[var17][var26][var27] = var25;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var18 == 2) {
                            if (this.field3631[var17] == null) {
                                this.field3631[var17] = new byte[this.field3627 + 1][this.field3643 + 1];
                            }
                            if (var17 > 0) {
                                int var28 = arg2;
                                int var29 = arg2 + 64;
                                int var30 = arg3;
                                int var31 = arg3 + 64;
                                if (arg2 < 0) {
                                    var28 = 0;
                                } else if (arg2 >= this.field3627) {
                                    var28 = this.field3627;
                                }
                                if (var29 < 0) {
                                    var29 = 0;
                                } else if (var29 >= this.field3627) {
                                    var29 = this.field3627;
                                }
                                if (arg3 < 0) {
                                    var30 = 0;
                                } else if (arg3 >= this.field3643) {
                                    var30 = this.field3643;
                                }
                                if (var31 < 0) {
                                    var31 = 0;
                                } else if (var31 >= this.field3643) {
                                    var31 = this.field3643;
                                }
                                while (var28 < var29) {
                                    while (var30 < var31) {
                                        this.field3631[var17][var28][var30] = this.field3631[var17 - 1][var28][var30];
                                        var30++;
                                    }
                                    var28++;
                                }
                            }
                        }
                    }
                    var5 = true;
                } else {
                    throw new IllegalStateException("");
                }
            }
            if (var6 != null) {
                for (int var32 = 0; var32 < 8; var32++) {
                    for (int var33 = 0; var33 < 8; var33++) {
                        int var34 = (arg2 >> 3) + var32;
                        int var35 = (arg3 >> 3) + var33;
                        if (var34 >= 0 && var34 < this.field3627 >> 3 && var35 >= 0 && var35 < this.field3643 >> 3) {
                            this.field8883.method8149(var34, var35, var6);
                        }
                    }
                }
            }
            if (!var5 && this.field3631 != null) {
                for (int var36 = 0; var36 < 4; var36++) {
                    if (this.field3631[var36] != null) {
                        for (int var37 = 0; var37 < 16; var37++) {
                            for (int var38 = 0; var38 < 16; var38++) {
                                int var39 = (arg2 >> 2) + var37;
                                int var40 = (arg3 >> 2) + var38;
                                if (var39 >= 0 && var39 < 26 && var40 >= 0 && var40 < 26) {
                                    this.field3631[var36][var39][var40] = 0;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @ObfuscatedName("abo.ce(Lra;Laet;IIIIIIII)V")
    public final void method14270(RendererToolkit arg0, Packet arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field3644) {
            return;
        }
        boolean var10 = false;
        Environment var11 = null;
        int var12 = (arg6 & 0x7) * 8;
        int var13 = (arg7 & 0x7) * 8;
        while (true) {
            while (arg1.pos < arg1.data.length) {
                int var14 = arg1.g1();
                if (var14 == 0) {
                    if (var11 == null) {
                        var11 = new Environment(arg1, this.field8883);
                    } else {
                        var11.method8205(arg1, this.field8883);
                    }
                } else if (var14 == 1) {
                    int var15 = arg1.g1();
                    if (var15 > 0) {
                        for (int var16 = 0; var16 < var15; var16++) {
                            StaticPointLight var17 = new StaticPointLight(arg0, this.field3619.field4510, arg1, 2);
                            if (var17.field4594 == 31) {
                                LightType var18 = Statics.field785.method12453(arg1.g2());
                                var17.method7577(var18.field7188, var18.field7191, var18.field7189, var18.field7190);
                            }
                            if (arg0.method768() > 0) {
                                Light var19 = var17.field4588;
                                int var20 = var19.method14888() >> 9;
                                int var21 = var19.method14879() >> 9;
                                if (var17.field4592 == arg5 && var20 >= var12 && var20 < var12 + 8 && var21 >= var13 && var21 < var13 + 8) {
                                    int var22 = (arg3 << 9) + MapCoordUtil.method2537(var19.method14888() & 0xFFF, var19.method14879() & 0xFFF, arg8);
                                    int var23 = (arg4 << 9) + MapCoordUtil.method3578(var19.method14888() & 0xFFF, var19.method14879() & 0xFFF, arg8);
                                    int var24 = var22 >> 9;
                                    int var25 = var23 >> 9;
                                    if (var24 >= 0 && var25 >= 0 && var24 < this.field3627 && var25 < this.field3643) {
                                        var19.method14884(var22, this.field3697[arg5][var24][var25] - var19.method14882(), var23);
                                        this.field3619.method7454(var17);
                                    }
                                }
                            }
                        }
                    }
                } else if (var14 == 2) {
                    if (var11 == null) {
                        var11 = new Environment();
                    }
                    var11.method8206(arg1);
                } else if (var14 == 128) {
                    if (var11 == null) {
                        var11 = new Environment();
                    }
                    var11.method8207(arg1, this.field8883);
                } else if (var14 == 129) {
                    if (this.field3631 == null) {
                        this.field3631 = new byte[4][][];
                    }
                    for (int var26 = 0; var26 < 4; var26++) {
                        byte var27 = arg1.g1b();
                        if (var27 == 0 && this.field3631[arg2] != null) {
                            if (var26 <= arg5) {
                                int var28 = arg3;
                                int var29 = arg3 + 7;
                                int var30 = arg4;
                                int var31 = arg4 + 7;
                                if (arg3 < 0) {
                                    var28 = 0;
                                } else if (arg3 >= this.field3627) {
                                    var28 = this.field3627;
                                }
                                if (var29 < 0) {
                                    var29 = 0;
                                } else if (var29 >= this.field3627) {
                                    var29 = this.field3627;
                                }
                                if (arg4 < 0) {
                                    var30 = 0;
                                } else if (arg4 >= this.field3643) {
                                    var30 = this.field3643;
                                }
                                if (var31 < 0) {
                                    var31 = 0;
                                } else if (var31 >= this.field3643) {
                                    var31 = this.field3643;
                                }
                                while (var28 < var29) {
                                    while (var30 < var31) {
                                        this.field3631[arg2][var28][var30] = 0;
                                        var30++;
                                    }
                                    var28++;
                                }
                            }
                        } else if (var27 == 1) {
                            if (this.field3631[arg2] == null) {
                                this.field3631[arg2] = new byte[this.field3627 + 1][this.field3643 + 1];
                            }
                            for (int var32 = 0; var32 < 64; var32 += 4) {
                                for (int var33 = 0; var33 < 64; var33 += 4) {
                                    byte var34 = arg1.g1b();
                                    if (var26 <= arg5) {
                                        for (int var35 = var32; var35 < var32 + 4; var35++) {
                                            for (int var36 = var33; var36 < var33 + 4; var36++) {
                                                if (var35 >= var12 && var35 < var12 + 8 && var36 >= var13 && var36 < var13 + 8) {
                                                    int var37 = arg3 + MapCoordUtil.method1725(var35 & 0x7, var36 & 0x7, arg8);
                                                    int var38 = arg4 + MapCoordUtil.method4739(var35 & 0x7, var36 & 0x7, arg8);
                                                    if (var37 >= 0 && var37 < this.field3627 && var38 >= 0 && var38 < this.field3643) {
                                                        this.field3631[arg2][var37][var38] = var34;
                                                        var10 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var27 == 2) {
                        }
                    }
                } else {
                    throw new IllegalStateException("");
                }
            }
            if (var11 != null) {
                this.field8883.method8149(arg3 >> 3, arg4 >> 3, var11);
            }
            if (!var10 && this.field3631 != null && this.field3631[arg2] != null) {
                int var39 = arg3 + 7;
                int var40 = arg4 + 7;
                for (int var41 = arg3; var41 < var39; var41++) {
                    for (int var42 = arg4; var42 < var40; var42++) {
                        this.field3631[arg2][var41][var42] = 0;
                    }
                }
            }
            return;
        }
    }

    @ObfuscatedName("md.ct(Ltz;[BIIIIB)I")
    public static final int decodeLocs(LocTypeList arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        Packet var7 = new Packet(arg1);
        int var8 = -1;
        label57:
        while (true) {
            int var9 = var7.gExtended1or2();
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.gSmart1or2();
                    if (var13 == 0) {
                        continue label57;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.g1() >> 2;
                    int var17 = arg2 + var15;
                    int var18 = arg3 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg4 - 1 && var18 < arg5 - 1) {
                        LocType var19 = arg0.get(var8);
                        if (LocShape.field6589.field6590 != var16 || client.options.groundDecor.method15725() != 0 || var19.active != 0 || var19.field6491 == 1 || var19.field6523) {
                            if (!var19.method11442()) {
                                var6++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.gSmart1or2();
                if (var12 == 0) {
                    break;
                }
                var7.g1();
            }
        }
    }

    @ObfuscatedName("rj.cu(Ltz;III)Z")
    public static final boolean method8598(LocTypeList arg0, int arg1, int arg2) {
        LocType var3 = arg0.get(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method11411(arg2);
    }

    @ObfuscatedName("abo.cc(Lra;[BII[Lmv;B)V")
    public final void decodeLocs(RendererToolkit arg0, byte[] src, int arg2, int arg3, CollisionMap[] collision) {
        Packet buf = new Packet(src);
        int var7 = -1;
        while (true) {
            int var8 = buf.gExtended1or2();
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = buf.gSmart1or2();
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = buf.g1();
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg2 + var12;
                int var18 = arg3 + var11;
                if (var17 > 0 && var18 > 0 && var17 < this.field3627 - 1 && var18 < this.field3643 - 1) {
                    CollisionMap var19 = null;
                    if (!this.field3644) {
                        int var20 = var13;
                        if ((this.field3618.levelTileFlags[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = collision[var20];
                        }
                    }
                    this.method14304(arg0, var13, var13, var17, var18, var7, var16, var15, var19, -1);
                }
            }
        }
    }

    @ObfuscatedName("abo.cg(Lra;[BIIIIIII[Lmv;I)V")
    public final void decodeLocs(RendererToolkit arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, CollisionMap[] arg9) {
        Packet var11 = new Packet(arg1);
        int var12 = -1;
        while (true) {
            int var13 = var11.gExtended1or2();
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.gSmart1or2();
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.g1();
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg5 == var18 && var17 >= arg6 && var17 < arg6 + 8 && var16 >= arg7 && var16 < arg7 + 8) {
                    LocType var22 = this.field8894.get(var12);
                    int var23 = arg3 + MapCoordUtil.method14717(var17 & 0x7, var16 & 0x7, arg8, var22.width, var22.length, var21);
                    int var24 = arg4 + MapCoordUtil.method7051(var17 & 0x7, var16 & 0x7, arg8, var22.width, var22.length, var21);
                    if (var23 > 0 && var24 > 0 && var23 < this.field3627 - 1 && var24 < this.field3643 - 1) {
                        CollisionMap var25 = null;
                        if (!this.field3644) {
                            int var26 = arg2;
                            if ((this.field3618.levelTileFlags[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg9[var26];
                            }
                        }
                        this.method14304(arg0, arg2, arg2, var23, var24, var12, arg8 + var21 & 0x3, var20, var25, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("abo.cj(Lra;IIIIIIILmv;IB)V")
    public final void method14304(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, CollisionMap arg8, int arg9) {
        if (arg2 < this.field8893) {
            this.field8893 = arg2;
        }
        LocType var11 = this.field8894.get(arg5);
        if (client.options.texturing.getValue() == 0 && var11.field6522) {
            return;
        }
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var12 = var11.length;
            var13 = var11.width;
        } else {
            var12 = var11.width;
            var13 = var11.length;
        }
        int var14;
        int var15;
        if (arg3 + var12 <= this.field3627) {
            var14 = (var12 >> 1) + arg3;
            var15 = (var12 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int var16;
        int var17;
        if (arg4 + var13 <= this.field3643) {
            var16 = (var13 >> 1) + arg4;
            var17 = (var13 + 1 >> 1) + arg4;
        } else {
            var16 = arg4;
            var17 = arg4 + 1;
        }
        FloorModel var18 = this.field3619.field4498[arg1];
        int var19 = var18.method199(var14, var16) + var18.method199(var15, var16) + var18.method199(var14, var17) + var18.method199(var15, var17) >> 2;
        int var20 = (arg3 << 9) + (var12 << 8);
        int var21 = (arg4 << 9) + (var13 << 8);
        boolean var22 = this.field3632 && !this.field3644 && var11.field6496;
        if (var11.method11443()) {
            PositionedSound.add(arg2, arg3, arg4, arg6, var11, null, null);
        }
        boolean var23 = arg9 == -1 && !var11.method11409() && var11.multiloc == null && !var11.field6544 && !var11.field6548;
        if (field8895 && (LocShape.method2616(arg7) && var11.field6497 != 1 || !(!LocShape.method11327(arg7) || var11.field6497 != 0))) {
            return;
        }
        if (LocShape.field6589.field6590 == arg7) {
            if (client.options.groundDecor.method15725() != 0 || var11.active != 0 || var11.field6491 == 1 || var11.field6523) {
                GroundDecorLayerEntity var25;
                if (var23) {
                    StaticGroundDecorEntity var24 = new StaticGroundDecorEntity(this.field3619, arg0, this.field8894, var11, arg2, arg1, var20, var19, var21, this.field3644, arg6, var22);
                    if (var24.method2393()) {
                        var24.method2406(arg0);
                    }
                    var25 = var24;
                } else {
                    var25 = new DynamicGroundDecorEntity(this.field3619, arg0, this.field8894, var11, arg2, arg1, var20, var19, var21, this.field3644, arg6, arg9);
                }
                this.field3619.method7512(arg2, arg3, arg4, var25);
                if (var11.field6491 == 1 && arg8 != null) {
                    arg8.method6266(arg3, arg4);
                }
            }
        } else if (LocShape.field6572.field6590 == arg7 || LocShape.field6588.field6590 == arg7) {
            StaticSceneryEntity var28 = null;
            int var30;
            PrimaryLayerEntity var31;
            if (var23) {
                StaticSceneryEntity var29 = new StaticSceneryEntity(this.field3619, arg0, this.field8894, var11, arg2, arg1, var20, var19, var21, this.field3644, arg3, arg3 + var12 - 1, arg4, arg4 + var13 - 1, arg7, arg6, var22);
                var30 = var29.method12865();
                var31 = var29;
                var28 = var29;
            } else {
                var31 = new DynamicSceneryEntity(this.field3619, arg0, this.field8894, var11, arg2, arg1, var20, var19, var21, this.field3644, arg3, arg3 + var12 - 1, arg4, arg4 + var13 - 1, arg7, arg6, arg9);
                var30 = 15;
            }
            if (this.field3619.method7412(var31, false)) {
                if (var28 != null && var28.method2393()) {
                    var28.method2406(arg0);
                }
                if (var11.field6513 && this.field3632) {
                    if (var30 > 30) {
                        var30 = 30;
                    }
                    for (int var32 = 0; var32 <= var12; var32++) {
                        for (int var33 = 0; var33 <= var13; var33++) {
                            var18.LA(arg3 + var32, arg4 + var33, var30);
                        }
                    }
                }
            }
            if (var11.field6491 != 0 && arg8 != null) {
                arg8.method6264(arg3, arg4, var12, var13, var11.field6492, !var11.field6481);
            }
        } else if (LocShape.method11327(arg7) || LocShape.method11666(arg7)) {
            PrimaryLayerEntity var27;
            if (var23) {
                StaticSceneryEntity var26 = new StaticSceneryEntity(this.field3619, arg0, this.field8894, var11, arg2, arg1, var20, var19, var21, this.field3644, arg3, arg3 + var12 - 1, arg4, arg4 + var13 - 1, arg7, arg6, var22);
                if (var26.method2393()) {
                    var26.method2406(arg0);
                }
                var27 = var26;
            } else {
                var27 = new DynamicSceneryEntity(this.field3619, arg0, this.field8894, var11, arg2, arg1, var20, var19, var21, this.field3644, arg3, arg3 + var12 - 1, arg4, arg4 + var13 - 1, arg7, arg6, arg9);
            }
            this.field3619.method7412(var27, false);
            if (this.field3632 && !this.field3644 && LocShape.method11327(arg7) && LocShape.field6568.field6590 != arg7 && arg2 > 0 && var11.field6497 != 0) {
                this.field3659[arg2][arg3][arg4] = (byte) (this.field3659[arg2][arg3][arg4] | 0x4);
            }
            if (var11.field6491 != 0 && arg8 != null) {
                arg8.method6264(arg3, arg4, var12, var13, var11.field6492, !var11.field6481);
            }
        } else if (!this.method14285(arg0, arg7, arg6, var23, var11, arg9, arg2, arg1, var20, var19, var21, arg3, arg4, var22, var18, arg8, var12, var13) && !this.method14275(arg0, arg7, arg6, var23, var11, arg9, arg2, arg1, var20, var19, var21, arg3, arg4)) {
            ;
        }
    }

    @ObfuscatedName("abo.cy(Lra;IIZLtg;IIIIIIIIZLxa;Lmv;III)Z")
    public boolean method14285(RendererToolkit arg0, int arg1, int arg2, boolean arg3, LocType arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, FloorModel arg14, CollisionMap arg15, int arg16, int arg17) {
        if (LocShape.field6591.field6590 == arg1) {
            int var19 = arg4.field6497;
            if (field8884 && arg4.field6497 == -1) {
                var19 = 1;
            }
            WallLayerEntity var21;
            if (arg3) {
                StaticWallEntity var20 = new StaticWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, arg2, arg13);
                if (var20.method2393()) {
                    var20.method2406(arg0);
                }
                var21 = var20;
            } else {
                var21 = new DynamicWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, arg2, arg5);
            }
            this.field3619.method7402(arg6, arg11, arg12, var21, null);
            if (arg2 == 0) {
                if (this.field3632 && arg4.field6513) {
                    arg14.LA(arg11, arg12, 50);
                    arg14.LA(arg11, arg12 + 1, 50);
                }
                if (var19 == 1 && !this.field3644) {
                    this.field3619.field4493.method7615(1, arg6, arg11, arg12, arg4.field6535, arg4.field6499);
                }
            } else if (arg2 == 1) {
                if (this.field3632 && arg4.field6513) {
                    arg14.LA(arg11, arg12 + 1, 50);
                    arg14.LA(arg11 + 1, arg12 + 1, 50);
                }
                if (var19 == 1 && !this.field3644) {
                    this.field3619.field4493.method7615(2, arg6, arg11, arg12 + 1, arg4.field6535, -arg4.field6499);
                }
            } else if (arg2 == 2) {
                if (this.field3632 && arg4.field6513) {
                    arg14.LA(arg11 + 1, arg12, 50);
                    arg14.LA(arg11 + 1, arg12 + 1, 50);
                }
                if (var19 == 1 && !this.field3644) {
                    this.field3619.field4493.method7615(1, arg6, arg11 + 1, arg12, arg4.field6535, -arg4.field6499);
                }
            } else if (arg2 == 3) {
                if (this.field3632 && arg4.field6513) {
                    arg14.LA(arg11, arg12, 50);
                    arg14.LA(arg11 + 1, arg12, 50);
                }
                if (var19 == 1 && !this.field3644) {
                    this.field3619.field4493.method7615(2, arg6, arg11, arg12, arg4.field6535, arg4.field6499);
                }
            }
            if (arg4.field6491 != 0 && arg15 != null) {
                arg15.method6296(arg11, arg12, arg1, arg2, arg4.field6492, !arg4.field6481);
            }
            if (arg4.field6502 != 64) {
                this.field3619.method7422(arg6, arg11, arg12, arg4.field6502);
            }
            return true;
        } else if (LocShape.field6575.field6590 == arg1) {
            WallLayerEntity var23;
            if (arg3) {
                StaticWallEntity var22 = new StaticWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, arg2, arg13);
                if (var22.method2393()) {
                    var22.method2406(arg0);
                }
                var23 = var22;
            } else {
                var23 = new DynamicWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, arg2, arg5);
            }
            this.field3619.method7402(arg6, arg11, arg12, var23, null);
            if (arg4.field6513 && this.field3632) {
                if (arg2 == 0) {
                    arg14.LA(arg11, arg12 + 1, 50);
                } else if (arg2 == 1) {
                    arg14.LA(arg11 + 1, arg12 + 1, 50);
                } else if (arg2 == 2) {
                    arg14.LA(arg11 + 1, arg12, 50);
                } else if (arg2 == 3) {
                    arg14.LA(arg11, arg12, 50);
                }
            }
            if (arg4.field6491 != 0 && arg15 != null) {
                arg15.method6296(arg11, arg12, arg1, arg2, arg4.field6492, !arg4.field6481);
            }
            return true;
        } else if (LocShape.field6569.field6590 == arg1) {
            int var24 = arg2 + 1 & 0x3;
            WallLayerEntity var27;
            WallLayerEntity var28;
            if (arg3) {
                StaticWallEntity var25 = new StaticWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, arg2 + 4, arg13);
                StaticWallEntity var26 = new StaticWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, var24, arg13);
                if (var25.method2393()) {
                    var25.method2406(arg0);
                }
                if (var26.method2393()) {
                    var26.method2406(arg0);
                }
                var27 = var25;
                var28 = var26;
            } else {
                var27 = new DynamicWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, arg2 + 4, arg5);
                var28 = new DynamicWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, var24, arg5);
            }
            this.field3619.method7402(arg6, arg11, arg12, var27, var28);
            if ((arg4.field6497 == 1 || field8884 && arg4.field6497 == -1) && !this.field3644) {
                if (arg2 == 0) {
                    this.field3619.field4493.method7615(1, arg6, arg11, arg12, arg4.field6535, arg4.field6499);
                    this.field3619.field4493.method7615(2, arg6, arg11, arg12 + 1, arg4.field6535, arg4.field6499);
                } else if (arg2 == 1) {
                    this.field3619.field4493.method7615(1, arg6, arg11 + 1, arg12, arg4.field6535, arg4.field6499);
                    this.field3619.field4493.method7615(2, arg6, arg11, arg12 + 1, arg4.field6535, arg4.field6499);
                } else if (arg2 == 2) {
                    this.field3619.field4493.method7615(1, arg6, arg11 + 1, arg12, arg4.field6535, arg4.field6499);
                    this.field3619.field4493.method7615(2, arg6, arg11, arg12, arg4.field6535, arg4.field6499);
                } else if (arg2 == 3) {
                    this.field3619.field4493.method7615(1, arg6, arg11, arg12, arg4.field6535, arg4.field6499);
                    this.field3619.field4493.method7615(2, arg6, arg11, arg12, arg4.field6535, arg4.field6499);
                }
            }
            if (arg4.field6491 != 0 && arg15 != null) {
                arg15.method6296(arg11, arg12, arg1, arg2, arg4.field6492, !arg4.field6481);
            }
            if (arg4.field6502 != 64) {
                this.field3619.method7422(arg6, arg11, arg12, arg4.field6502);
            }
            return true;
        } else if (LocShape.field6570.field6590 == arg1) {
            WallLayerEntity var30;
            if (arg3) {
                StaticWallEntity var29 = new StaticWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, arg2, arg13);
                if (var29.method2393()) {
                    var29.method2406(arg0);
                }
                var30 = var29;
            } else {
                var30 = new DynamicWallEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg1, arg2, arg5);
            }
            this.field3619.method7402(arg6, arg11, arg12, var30, null);
            if (arg4.field6513 && this.field3632) {
                if (arg2 == 0) {
                    arg14.LA(arg11, arg12 + 1, 50);
                } else if (arg2 == 1) {
                    arg14.LA(arg11 + 1, arg12 + 1, 50);
                } else if (arg2 == 2) {
                    arg14.LA(arg11 + 1, arg12, 50);
                } else if (arg2 == 3) {
                    arg14.LA(arg11, arg12, 50);
                }
            }
            if (arg4.field6491 != 0 && arg15 != null) {
                arg15.method6296(arg11, arg12, arg1, arg2, arg4.field6492, !arg4.field6481);
            }
            return true;
        } else if (LocShape.field6567.field6590 == arg1) {
            PrimaryLayerEntity var32;
            if (arg3) {
                StaticSceneryEntity var31 = new StaticSceneryEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg11, arg11, arg12, arg12, arg1, arg2, arg13);
                if (var31.method2393()) {
                    var31.method2406(arg0);
                }
                var32 = var31;
            } else {
                var32 = new DynamicSceneryEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, arg11, arg11 + arg16 - 1, arg12, arg12 + arg17 - 1, arg1, arg2, arg5);
            }
            this.field3619.method7412(var32, false);
            if (arg4.field6497 == 1 && !this.field3644) {
                byte var33;
                if ((arg2 & 0x1) == 0) {
                    var33 = 8;
                } else {
                    var33 = 16;
                }
                this.field3619.field4493.method7615(var33, arg6, arg11, arg12, arg4.field6535, 0);
            }
            if (arg4.field6491 != 0 && arg15 != null) {
                arg15.method6264(arg11, arg12, arg16, arg17, arg4.field6492, !arg4.field6481);
            }
            if (arg4.field6502 != 64) {
                this.field3619.method7422(arg6, arg11, arg12, arg4.field6502);
            }
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("abo.cz(Lra;IIZLtg;IIIIIIIIB)Z")
    public boolean method14275(RendererToolkit arg0, int arg1, int arg2, boolean arg3, LocType arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (LocShape.field6577.field6590 == arg1) {
            WallDecorLayerEntity var15;
            if (arg3) {
                StaticWallDecorLayerEntity var14 = new StaticWallDecorLayerEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, 0, 0, arg1, arg2);
                if (var14.method2393()) {
                    var14.method2406(arg0);
                }
                var15 = var14;
            } else {
                var15 = new DynamicWallDecorEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, 0, 0, arg1, arg2, arg5);
            }
            this.field3619.method7420(arg6, arg11, arg12, var15, null);
            return true;
        } else if (LocShape.field6573.field6590 == arg1) {
            int var16 = 65;
            Location var17 = (Location) this.field3619.method7433(arg6, arg11, arg12);
            if (var17 != null) {
                var16 = this.field8894.get(var17.getType()).field6502 + 1;
            }
            WallDecorLayerEntity var19;
            if (arg3) {
                StaticWallDecorLayerEntity var18 = new StaticWallDecorLayerEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, field8890[arg2] * var16, field8886[arg2] * var16, arg1, arg2);
                if (var18.method2393()) {
                    var18.method2406(arg0);
                }
                var19 = var18;
            } else {
                var19 = new DynamicWallDecorEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, field8890[arg2] * var16, field8886[arg2] * var16, arg1, arg2, arg5);
            }
            this.field3619.method7420(arg6, arg11, arg12, var19, null);
            return true;
        } else if (LocShape.field6574.field6590 == arg1) {
            int var20 = 33;
            Location var21 = (Location) this.field3619.method7433(arg6, arg11, arg12);
            if (var21 != null) {
                var20 = this.field8894.get(var21.getType()).field6502 / 2 + 1;
            }
            WallDecorLayerEntity var23;
            if (arg3) {
                StaticWallDecorLayerEntity var22 = new StaticWallDecorLayerEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, field8890[arg2] * var20, field8886[arg2] * var20, arg1, arg2 + 4);
                if (var22.method2393()) {
                    var22.method2406(arg0);
                }
                var23 = var22;
            } else {
                var23 = new DynamicWallDecorEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, field8891[arg2] * var20, field8892[arg2] * var20, arg1, arg2 + 4, arg5);
            }
            this.field3619.method7420(arg6, arg11, arg12, var23, null);
            return true;
        } else if (LocShape.field6581.field6590 == arg1) {
            int var24 = arg2 + 2 & 0x3;
            WallDecorLayerEntity var26;
            if (arg3) {
                StaticWallDecorLayerEntity var25 = new StaticWallDecorLayerEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, 0, 0, arg1, var24 + 4);
                if (var25.method2393()) {
                    var25.method2406(arg0);
                }
                var26 = var25;
            } else {
                var26 = new DynamicWallDecorEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, 0, 0, arg1, var24 + 4, arg5);
            }
            this.field3619.method7420(arg6, arg11, arg12, var26, null);
            return true;
        } else if (LocShape.field6576.field6590 == arg1) {
            int var27 = arg2 + 2 & 0x3;
            int var28 = 33;
            Location var29 = (Location) this.field3619.method7433(arg6, arg11, arg12);
            if (var29 != null) {
                var28 = this.field8894.get(var29.getType()).field6502 / 2 + 1;
            }
            WallDecorLayerEntity var32;
            WallDecorLayerEntity var33;
            if (arg3) {
                StaticWallDecorLayerEntity var30 = new StaticWallDecorLayerEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, field8891[arg2] * var28, field8892[arg2] * var28, arg1, arg2 + 4);
                StaticWallDecorLayerEntity var31 = new StaticWallDecorLayerEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, 0, 0, arg1, var27 + 4);
                if (var30.method2393()) {
                    var30.method2406(arg0);
                }
                if (var31.method2393()) {
                    var31.method2406(arg0);
                }
                var32 = var30;
                var33 = var31;
            } else {
                DynamicWallDecorEntity var34 = new DynamicWallDecorEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, field8891[arg2] * var28, field8892[arg2] * var28, arg1, arg2 + 4, arg5);
                DynamicWallDecorEntity var35 = new DynamicWallDecorEntity(this.field3619, arg0, this.field8894, arg4, arg6, arg7, arg8, arg9, arg10, this.field3644, 0, 0, arg1, var27 + 4, arg5);
                var32 = var34;
                var33 = var35;
            }
            this.field3619.method7420(arg6, arg11, arg12, var32, var33);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("abo.dl(Lra;IIIILmv;B)V")
    public void method14280(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, CollisionMap arg5) {
        Location var7 = this.method14289(arg1, arg2, arg3, arg4);
        if (var7 == null) {
            return;
        }
        LocType var8 = this.field8894.get(var7.getType());
        int var9 = var7.method2390();
        int var10 = var7.method2391();
        if (var8.method11443()) {
            PositionedSound.method1370(arg1, arg3, arg4, var8);
        }
        if (var7.method2393()) {
            var7.method2412(arg0);
        }
        if (arg2 == 0) {
            this.field3619.method7462(arg1, arg3, arg4);
            this.field3619.method7425(arg1, arg3, arg4);
            if (var8.field6491 != 0) {
                arg5.method6263(arg3, arg4, var9, var10, var8.field6492, !var8.field6481);
            }
            if (var8.field6497 == 1) {
                if (var10 == 0) {
                    this.field3619.field4493.method7601(1, arg1, arg3, arg4);
                } else if (var10 == 1) {
                    this.field3619.field4493.method7601(2, arg1, arg3, arg4 + 1);
                } else if (var10 == 2) {
                    this.field3619.field4493.method7601(1, arg1, arg3 + 1, arg4);
                } else if (var10 == 3) {
                    this.field3619.field4493.method7601(2, arg1, arg3, arg4);
                }
            }
        } else if (arg2 == 1) {
            this.field3619.method7426(arg1, arg3, arg4);
            this.field3619.method7461(arg1, arg3, arg4);
        } else if (arg2 == 2) {
            this.field3619.method7430(arg1, arg3, arg4, client.field9216);
            if (var8.field6491 != 0 && var8.width + arg3 < this.field3627 && var8.width + arg4 < this.field3643 && var8.length + arg3 < this.field3627 && var8.length + arg4 < this.field3643) {
                arg5.method6269(arg3, arg4, var8.width, var8.length, var10, var8.field6492, !var8.field6481);
            }
            if (LocShape.field6567.field6590 == var9) {
                if ((var10 & 0x1) == 0) {
                    this.field3619.field4493.method7601(8, arg1, arg3, arg4);
                } else {
                    this.field3619.field4493.method7601(16, arg1, arg3, arg4);
                }
            }
        } else if (arg2 == 3) {
            this.field3619.method7428(arg1, arg3, arg4);
            if (var8.field6491 == 1) {
                arg5.method6272(arg3, arg4);
            }
        }
    }

    @ObfuscatedName("abo.dj(IIIII)Lca;")
    public Location method14289(int arg0, int arg1, int arg2, int arg3) {
        Location var5 = null;
        if (arg1 == 0) {
            var5 = (Location) this.field3619.method7433(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var5 = (Location) this.field3619.method7435(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var5 = (Location) this.field3619.method7437(arg0, arg2, arg3, client.field9216);
        }
        if (arg1 == 3) {
            var5 = (Location) this.field3619.method7517(arg0, arg2, arg3);
        }
        return var5;
    }

    @ObfuscatedName("abo.dp(Lra;ZI)V")
    public final void method14291(RendererToolkit arg0, boolean arg1) {
        this.field3619.method7440();
        if (!arg1) {
            if (this.field3628 > 1) {
                for (int var3 = 0; var3 < this.field3627; var3++) {
                    for (int var4 = 0; var4 < this.field3643; var4++) {
                        if ((this.field3618.levelTileFlags[1][var3][var4] & 0x2) == 2) {
                            this.field3619.method7466(var3, var4);
                        }
                    }
                }
            }
            for (int var5 = 0; var5 < this.field3628; var5++) {
                for (int var6 = 0; var6 <= this.field3643; var6++) {
                    for (int var7 = 0; var7 <= this.field3627; var7++) {
                        if ((this.field3659[var5][var7][var6] & 0x4) != 0) {
                            int var8 = var7;
                            int var9 = var7;
                            int var10 = var6;
                            int var11 = var6;
                            while (var10 > 0 && (this.field3659[var5][var7][var10 - 1] & 0x4) != 0 && var11 - var10 < 10) {
                                var10--;
                            }
                            while (var11 < this.field3643 && (this.field3659[var5][var7][var11 + 1] & 0x4) != 0 && var11 - var10 < 10) {
                                var11++;
                            }
                            label108:
                            while (var8 > 0 && var9 - var8 < 10) {
                                for (int var12 = var10; var12 <= var11; var12++) {
                                    if ((this.field3659[var5][var8 - 1][var12] & 0x4) == 0) {
                                        break label108;
                                    }
                                }
                                var8--;
                            }
                            label95:
                            while (var9 < this.field3627 && var9 - var8 < 10) {
                                for (int var13 = var10; var13 <= var11; var13++) {
                                    if ((this.field3659[var5][var9 + 1][var13] & 0x4) == 0) {
                                        break label95;
                                    }
                                }
                                var9++;
                            }
                            if ((var9 - var8 + 1) * (var11 - var10 + 1) >= 4) {
                                int var14 = this.field3697[var5][var8][var10];
                                this.field3619.field4493.method7594(4, var5, var8 << 9, (var9 << 9) + 512, var10 << 9, (var11 << 9) + 512, var14, var14);
                                for (int var15 = var8; var15 <= var9; var15++) {
                                    for (int var16 = var10; var16 <= var11; var16++) {
                                        this.field3659[var5][var15][var16] &= 0xFFFFFFFB;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.field3619.field4493.method7627();
        }
        this.field3659 = null;
    }
}
