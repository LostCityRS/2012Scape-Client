import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("ml")
public class World {

    @ObfuscatedName("ml.u")
    public boolean asyncRebuilding;

    @ObfuscatedName("ml.j")
    public RebuildType rebuildType;

    @ObfuscatedName("ml.a")
    public RebuildType field3796;

    @ObfuscatedName("ml.s")
    public BuildAreaSize field3792;

    @ObfuscatedName("ml.c")
    public ClientMapLoader field3793;

    @ObfuscatedName("ml.m")
    public ClientMapLoader field3794;

    @ObfuscatedName("ml.t")
    public CoordGrid field3795 = new CoordGrid();

    @ObfuscatedName("ml.l")
    public CoordGrid field3824 = new CoordGrid();

    @ObfuscatedName("ml.f")
    public int field3790;

    @ObfuscatedName("ml.d")
    public int field3798;

    @ObfuscatedName("ml.z")
    public int mapSizeX;

    @ObfuscatedName("ml.n")
    public int mapSizeZ;

    @ObfuscatedName("ml.o")
    public Scene scene;

    @ObfuscatedName("ml.q")
    public EnvironmentManager field3802;

    @ObfuscatedName("ml.p")
    public SceneLevelTileFlags sceneLevelTileFlags;

    @ObfuscatedName("ml.w")
    public int field3804;

    @ObfuscatedName("ml.b")
    public int field3805;

    @ObfuscatedName("ml.x")
    public WorldMapAreaMetadata field3829;

    @ObfuscatedName("ml.i")
    public WorldMapRelated field3806;

    @ObfuscatedName("ml.v")
    public LocTint field3808 = new LocTint(0, 0, 0, 0);

    @ObfuscatedName("ml.k")
    public float field3809;

    @ObfuscatedName("ml.h")
    public LocTypeList field3815;

    @ObfuscatedName("ml.r")
    public CollisionMap[] field3811 = new CollisionMap[4];

    @ObfuscatedName("ml.g")
    public int[][] field3812;

    @ObfuscatedName("ml.y")
    public int[][] field3823;

    @ObfuscatedName("ml.e")
    public byte[][][] field3814;

    @ObfuscatedName("ml.ay")
    public RebuildStage field3834;

    @ObfuscatedName("ml.af")
    public int field3816 = 0;

    @ObfuscatedName("ml.ar")
    public int field3817 = 1;

    @ObfuscatedName("ml.an")
    public int field3818 = 0;

    @ObfuscatedName("ml.ap")
    public int field3819 = 1;

    @ObfuscatedName("ml.ag")
    public int[] field3820;

    @ObfuscatedName("ml.as")
    public int[] field3821;

    @ObfuscatedName("ml.ai")
    public int[] field3822;

    @ObfuscatedName("ml.ao")
    public int[] field3807;

    @ObfuscatedName("ml.al")
    public int[] field3797;

    @ObfuscatedName("ml.at")
    public int[] field3825;

    @ObfuscatedName("ml.ax")
    public int[][] field3831;

    @ObfuscatedName("ml.aw")
    public byte[][] field3800;

    @ObfuscatedName("ml.aa")
    public byte[][] field3828;

    @ObfuscatedName("ml.am")
    public byte[][] field3810;

    @ObfuscatedName("ml.ad")
    public byte[][] field3830;

    @ObfuscatedName("ml.az")
    public byte[][] field3832;

    @ObfuscatedName("ml.ak")
    public int[][][] field3801;

    @ObfuscatedName("ml.av")
    public boolean field3833 = false;

    @ObfuscatedName("ml.aj")
    public long field3789;

    public World(boolean arg0) {
        this.asyncRebuilding = arg0;
    }

    @ObfuscatedName("ml.u(I)Lmp;")
    public RebuildType method6132() {
        return this.rebuildType;
    }

    @ObfuscatedName("ml.j(B)Llf;")
    public RebuildStage method6087() {
        return this.field3834;
    }

    @ObfuscatedName("ml.a(I)I")
    public int method6088() {
        return 100 - this.field3816 * 100 / this.field3817;
    }

    @ObfuscatedName("ml.s(I)I")
    public int method6224() {
        return 100 - this.field3818 * 100 / this.field3819;
    }

    @ObfuscatedName("ml.c(I)Lpz;")
    public CoordGrid getBase() {
        return this.field3795;
    }

    @ObfuscatedName("ml.m(B)I")
    public int getSizeX() {
        return this.mapSizeX;
    }

    @ObfuscatedName("ml.t(S)I")
    public int getSizeZ() {
        return this.mapSizeZ;
    }

    @ObfuscatedName("ml.l(I)Lof;")
    public WorldMapRelated method6093() {
        return this.field3806;
    }

    @ObfuscatedName("ml.f(S)Lmf;")
    public LocTint method6094() {
        return this.field3808;
    }

    @ObfuscatedName("ml.d(B)F")
    public float method6141() {
        return this.field3809;
    }

    @ObfuscatedName("ml.z(B)I")
    public int method6096() {
        return this.field3804;
    }

    @ObfuscatedName("ml.n(I)I")
    public int method6108() {
        return this.field3805;
    }

    @ObfuscatedName("ml.o(B)Loo;")
    public Scene getScene() {
        return this.scene;
    }

    @ObfuscatedName("ml.q(II)[[B")
    public byte[][] method6099(int arg0) {
        return this.field3794 == null || this.field3794.field3631 == null || this.field3794.field3631[arg0] == null ? (byte[][]) null : this.field3794.field3631[arg0];
    }

    @ObfuscatedName("ml.p(B)Llg;")
    public SceneLevelTileFlags getSceneLevelTileFlags() {
        return this.sceneLevelTileFlags;
    }

    @ObfuscatedName("ml.w(II)Lmv;")
    public CollisionMap method6101(int arg0) {
        return this.field3811[arg0];
    }

    @ObfuscatedName("ml.b(I)Lqp;")
    public EnvironmentManager getEnvironmentManager() {
        return this.field3802;
    }

    @ObfuscatedName("ml.x(S)Ltz;")
    public LocTypeList getLocTypeList() {
        return this.field3815;
    }

    @ObfuscatedName("ml.i(B)[[I")
    public int[][] method6133() {
        return this.field3812;
    }

    @ObfuscatedName("ml.v(B)[[I")
    public int[][] method6105() {
        return this.field3823;
    }

    @ObfuscatedName("ml.k(I)[[[B")
    public byte[][][] method6129() {
        return this.field3814;
    }

    @ObfuscatedName("ml.h([[[BI)V")
    public void method6107(byte[][][] arg0) {
        this.field3814 = arg0;
    }

    @ObfuscatedName("ml.r(I)Labo;")
    public ClientMapLoader method6157() {
        return this.field3794;
    }

    @ObfuscatedName("ml.g(Ltz;I)V")
    public void method6159(LocTypeList arg0) {
        this.field3815 = arg0;
    }

    @ObfuscatedName("ml.y(B)V")
    public void method6110() {
        this.field3795 = new CoordGrid();
        this.field3798 = 0;
        this.field3790 = 0;
    }

    @ObfuscatedName("ml.e(B)V")
    public void method6111() {
        if (this.scene != null) {
            Statics.method3616();
            this.scene.pickableEntities.method7384();
            this.scene = null;
        }
    }

    @ObfuscatedName("ml.ay(I)V")
    public void method6112() {
        this.field3834 = RebuildStage.field3777;
        this.field3816 = 0;
        this.field3817 = 1;
        this.field3818 = 0;
        this.field3819 = 1;
    }

    @ObfuscatedName("ml.af(I)V")
    public void method6086() {
        this.field3802 = new EnvironmentManager(Statics.renderer, this.mapSizeX >> 3, this.mapSizeZ >> 3);
    }

    @ObfuscatedName("ml.ar(B)V")
    public void method6235() {
        this.field3804 = 200;
        this.field3805 = (int) ((double) this.mapSizeX * 34.46D);
        this.field3805 <<= 0x2;
        if (Statics.renderer.method454()) {
            this.field3805 += 512;
        }
    }

    @ObfuscatedName("ml.an(Lml;B)V")
    public void method6090(World arg0) {
        boolean var2 = arg0.asyncRebuilding;
        arg0.asyncRebuilding = this.asyncRebuilding;
        this.asyncRebuilding = var2;
        RebuildType var3 = arg0.field3796;
        arg0.field3796 = this.field3796;
        this.field3796 = var3;
        arg0.field3824 = this.field3795;
        this.field3824 = arg0.field3795;
        this.field3802.method8145(arg0.getEnvironmentManager());
    }

    @ObfuscatedName("ml.ap(I)V")
    public void method6102() {
        if (this.asyncRebuilding) {
            this.method6112();
            ClientWorldMap.reset(true);
            World var1 = client.world;
            this.field3820 = var1.field3820;
            this.field3821 = var1.field3821;
            this.field3822 = var1.field3822;
            this.field3807 = var1.field3807;
            this.field3797 = var1.field3797;
            this.field3825 = var1.field3825;
            this.field3831 = var1.field3831;
            this.field3800 = var1.field3800;
            this.field3828 = var1.field3828;
            this.field3810 = var1.field3810;
            this.field3830 = var1.field3830;
            this.field3832 = var1.field3832;
            this.field3811 = var1.field3811;
            this.sceneLevelTileFlags = var1.sceneLevelTileFlags;
            this.field3802 = var1.field3802;
            this.field3801 = var1.field3801;
            this.field3804 = var1.field3804;
            this.field3805 = var1.field3805;
            this.field3829 = var1.field3829;
            this.field3806 = var1.field3806;
            this.field3812 = var1.field3812;
            this.field3823 = var1.field3823;
            this.field3814 = var1.field3814;
            this.rebuildType = var1.rebuildType;
            this.field3792 = var1.field3792;
            this.field3795 = var1.field3795;
            this.field3824 = var1.field3824;
            this.field3790 = var1.field3790;
            this.field3798 = var1.field3798;
            this.mapSizeX = var1.mapSizeX;
            this.mapSizeZ = var1.mapSizeZ;
        } else if (client.state == 6) {
            client.setState(5);
        } else if (client.state == 15) {
            client.setState(19);
        } else if (client.state == 11) {
            client.setState(7);
        } else if (client.state == 1) {
            client.setState(16);
        } else if (client.state == 14) {
            client.setState(17);
        }
    }

    @ObfuscatedName("ml.ag(Lmo;I)V")
    public void method6135(RebuildRequest arg0) {
        this.rebuildType = arg0.rebuildType;
        if (RebuildType.field3838 == this.rebuildType) {
            this.method6168();
        } else if (RebuildType.REBUILD_NORMAL == this.rebuildType) {
            this.rebuildNormalMap(arg0.buf);
        } else if (RebuildType.field3839 == this.rebuildType) {
            this.method6121();
        } else if (this.rebuildType.isRegionType()) {
            this.rebuildRegionMap(arg0.buf);
        }
    }

    @ObfuscatedName("ml.as(I)V")
    public void method6168() {
        this.setBuildAreaSize(BuildAreaSize.forId(Statics.options.buildArea.getValue()));
        int var1 = this.field3795.x;
        int var2 = this.field3795.z;
        int var3 = (Statics.cameraX >> 12) + (var1 >> 3);
        int var4 = (Statics.cameraZ >> 12) + (var2 >> 3);
        Statics.localPlayerEntity.level = 0;
        Statics.currentPlayerLevel = 0;
        Statics.localPlayerEntity.tele(8, 8);
        byte var5 = 18;
        this.field3831 = new int[var5][4];
        this.field3820 = new int[var5];
        this.field3821 = new int[var5];
        this.field3822 = new int[var5];
        this.field3807 = new int[var5];
        this.field3800 = new byte[var5][];
        this.field3828 = new byte[var5][];
        this.field3810 = new byte[var5][];
        this.field3797 = new int[var5];
        this.field3825 = new int[var5];
        this.field3830 = new byte[var5][];
        this.field3832 = new byte[var5][];
        int var6 = 0;
        for (int var7 = (var3 - (this.mapSizeX >> 4)) / 8; var7 <= ((this.mapSizeX >> 4) + var3) / 8; var7++) {
            for (int var8 = (var4 - (this.mapSizeZ >> 4)) / 8; var8 <= ((this.mapSizeZ >> 4) + var4) / 8; var8++) {
                int var9 = (var7 << 8) + var8;
                this.field3820[var6] = var9;
                this.field3821[var6] = Statics.field7343.method5688(this.method6208(true, false, var7, var8));
                this.field3822[var6] = Statics.field7343.method5688(this.method6208(false, false, var7, var8));
                this.field3807[var6] = Statics.field7343.method5688("n" + var7 + '_' + var8);
                this.field3797[var6] = Statics.field7343.method5688(this.method6208(true, true, var7, var8));
                this.field3825[var6] = Statics.field7343.method5688(this.method6208(false, true, var7, var8));
                if (this.field3807[var6] == -1) {
                    this.field3821[var6] = -1;
                    this.field3822[var6] = -1;
                    this.field3797[var6] = -1;
                    this.field3825[var6] = -1;
                }
                var6++;
            }
        }
        for (int var10 = var6; var10 < this.field3807.length; var10++) {
            this.field3807[var10] = -1;
            this.field3821[var10] = -1;
            this.field3822[var10] = -1;
            this.field3797[var10] = -1;
            this.field3825[var10] = -1;
        }
        byte var11;
        if (client.state == 6) {
            var11 = 5;
        } else if (client.state == 11) {
            var11 = 7;
        } else if (client.state == 15) {
            var11 = 19;
        } else if (client.state == 14) {
            var11 = 17;
        } else {
            throw new RuntimeException("" + client.state);
        }
        this.method6178(var3, var4, var11, false);
    }

    @ObfuscatedName("ml.ai(Lajl;I)V")
    public void rebuildNormalMap(PacketBit arg0) {
        int size = arg0.g1_alt1();
        int originX = arg0.g2();
        boolean forceRebuild = arg0.g1_alt1() == 1;
        int originZ = arg0.g2_alt2();
        if (!this.asyncRebuilding) {
            this.method6196();
        }
        this.setBuildAreaSize(BuildAreaSize.forId(size));
        int var6 = (arg0.data.length - arg0.pos) / 16;
        this.field3831 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var8 = 0; var8 < 4; var8++) {
                this.field3831[var7][var8] = arg0.g4s();
            }
        }
        this.field3820 = new int[var6];
        this.field3821 = new int[var6];
        this.field3822 = new int[var6];
        this.field3807 = null;
        this.field3800 = new byte[var6][];
        this.field3828 = new byte[var6][];
        this.field3810 = null;
        this.field3797 = new int[var6];
        this.field3825 = new int[var6];
        this.field3830 = new byte[var6][];
        this.field3832 = new byte[var6][];
        int var9 = 0;
        for (int var10 = (originX - (this.mapSizeX >> 4)) / 8; var10 <= ((this.mapSizeX >> 4) + originX) / 8; var10++) {
            for (int var11 = (originZ - (this.mapSizeZ >> 4)) / 8; var11 <= ((this.mapSizeZ >> 4) + originZ) / 8; var11++) {
                this.field3820[var9] = (var10 << 8) + var11;
                this.field3821[var9] = Statics.field7343.method5688(this.method6208(true, false, var10, var11));
                this.field3822[var9] = Statics.field7343.method5688(this.method6208(false, false, var10, var11));
                this.field3797[var9] = Statics.field7343.method5688(this.method6208(true, true, var10, var11));
                this.field3825[var9] = Statics.field7343.method5688(this.method6208(false, true, var10, var11));
                var9++;
            }
        }
        this.method6178(originX, originZ, 16, forceRebuild);
    }

    @ObfuscatedName("ml.ao(Lajl;B)V")
    public void rebuildRegionMap(PacketBit buf) {
        int originZ = buf.g2_alt2();
        int info = buf.g1();
        boolean forceRebuild = (info & 0x1) != 0;
        int originX = buf.g2();
        int size = buf.g1();
        int type = buf.g1_alt2();
        if (type == 1) {
            this.rebuildType = RebuildType.REBUILD_REGION;
        } else if (type == 2) {
            this.rebuildType = RebuildType.field3837;
        } else if (type == 3) {
            this.rebuildType = RebuildType.field3840;
        } else if (type == 4) {
            this.rebuildType = RebuildType.field3841;
        }
        if (!this.asyncRebuilding) {
            this.method6196();
        }
        this.setBuildAreaSize(BuildAreaSize.forId(size));
        buf.bits();
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < this.mapSizeX >> 3; var9++) {
                for (int var10 = 0; var10 < this.mapSizeZ >> 3; var10++) {
                    int var11 = buf.gBit(1);
                    if (var11 == 1) {
                        this.field3801[var8][var9][var10] = buf.gBit(26);
                    } else {
                        this.field3801[var8][var9][var10] = -1;
                    }
                }
            }
        }
        buf.bytes();
        int var12 = (buf.data.length - buf.pos) / 16;
        this.field3831 = new int[var12][4];
        for (int var13 = 0; var13 < var12; var13++) {
            for (int var14 = 0; var14 < 4; var14++) {
                this.field3831[var13][var14] = buf.g4s();
            }
        }
        this.field3820 = new int[var12];
        this.field3821 = new int[var12];
        this.field3822 = new int[var12];
        this.field3807 = null;
        this.field3800 = new byte[var12][];
        this.field3828 = new byte[var12][];
        this.field3810 = null;
        this.field3797 = new int[var12];
        this.field3825 = new int[var12];
        this.field3830 = new byte[var12][];
        this.field3832 = new byte[var12][];
        int var15 = 0;
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < this.mapSizeX >> 3; var17++) {
                for (int var18 = 0; var18 < this.mapSizeZ >> 3; var18++) {
                    int var19 = this.field3801[var16][var17][var18];
                    if (var19 != -1) {
                        int var20 = var19 >> 14 & 0x3FF;
                        int var21 = var19 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < var15; var23++) {
                            if (this.field3820[var23] == var22) {
                                var22 = -1;
                                break;
                            }
                        }
                        if (var22 != -1) {
                            this.field3820[var15] = var22;
                            int var24 = var22 >> 8 & 0xFF;
                            int var25 = var22 & 0xFF;
                            this.field3821[var15] = Statics.field7343.method5688(this.method6208(true, false, var24, var25));
                            this.field3822[var15] = Statics.field7343.method5688(this.method6208(false, false, var24, var25));
                            this.field3797[var15] = Statics.field7343.method5688(this.method6208(true, true, var24, var25));
                            this.field3825[var15] = Statics.field7343.method5688(this.method6208(false, true, var24, var25));
                            var15++;
                        }
                    }
                }
            }
        }
        this.method6178(originX, originZ, 16, forceRebuild);
    }

    @ObfuscatedName("ml.al(I)V")
    public void method6121() {
        this.field3796 = this.rebuildType;
        this.setBuildAreaSize(BuildAreaSize.field2139);
        for (int var1 = 0; var1 < 4; var1++) {
            for (int var2 = 0; var2 < this.mapSizeX >> 3; var2++) {
                for (int var3 = 0; var3 < this.mapSizeZ >> 3; var3++) {
                    this.field3801[var1][var2][var3] = -1;
                }
            }
        }
        for (CutsceneTemplate var4 = (CutsceneTemplate) CutsceneManager.field1534.head(); var4 != null; var4 = (CutsceneTemplate) CutsceneManager.field1534.next()) {
            int var5 = var4.field9380;
            boolean var6 = (var5 & 0x1) == 1;
            int var7 = var4.field9373 >> 3;
            int var8 = var4.field9374 >> 3;
            int var9 = var4.field9376;
            int var10 = var4.field9372;
            int var11 = var4.field9379;
            int var12 = var4.field9375;
            int var13 = var4.field9378;
            int var14 = var4.field9377;
            int var15 = 0;
            int var16 = 0;
            byte var17 = 1;
            byte var18 = 1;
            if (var5 == 1) {
                var16 = var13 - 1;
                var17 = -1;
            } else if (var5 == 2) {
                var16 = var13 - 1;
                var15 = var14 - 1;
                var17 = -1;
                var18 = -1;
            } else if (var5 == 3) {
                var15 = var14 - 1;
                var17 = 1;
                var18 = -1;
            }
            int var19 = var8;
            while (var19 < var8 + var14) {
                int var20 = var16;
                int var21 = var7;
                while (var21 < var7 + var13) {
                    if (var6) {
                        this.field3801[var12][var9 + var15][var10 + var20] = (var5 << 1) + (var19 << 3) + (var11 << 24) + (var21 << 14);
                    } else {
                        this.field3801[var12][var9 + var20][var10 + var15] = (var5 << 1) + (var19 << 3) + (var11 << 24) + (var21 << 14);
                    }
                    var21++;
                    var20 += var17;
                }
                var19++;
                var15 += var18;
            }
        }
        int var22 = Statics.field4561.length;
        this.field3820 = new int[var22];
        this.field3821 = new int[var22];
        this.field3822 = new int[var22];
        this.field3807 = null;
        this.field3800 = new byte[var22][];
        this.field3828 = new byte[var22][];
        this.field3810 = null;
        this.field3797 = new int[var22];
        this.field3825 = new int[var22];
        this.field3830 = new byte[var22][];
        this.field3832 = new byte[var22][];
        int var23 = 0;
        for (CutsceneTemplate var24 = (CutsceneTemplate) CutsceneManager.field1534.head(); var24 != null; var24 = (CutsceneTemplate) CutsceneManager.field1534.next()) {
            int var25 = var24.field9373 >>> 3;
            int var26 = var24.field9374 >>> 3;
            int var27 = var24.field9378 + var25;
            if ((var27 & 0x7) == 0) {
                var27--;
            }
            int var28 = var27 >>> 3;
            int var29 = var24.field9377 + var26;
            if ((var29 & 0x7) == 0) {
                var29--;
            }
            int var30 = var29 >>> 3;
            for (int var31 = var25 >>> 3; var31 <= var28; var31++) {
                label82:
                for (int var32 = var26 >>> 3; var32 <= var30; var32++) {
                    int var33 = var31 << 8 | var32;
                    for (int var34 = 0; var34 < var23; var34++) {
                        if (this.field3820[var34] == var33) {
                            continue label82;
                        }
                    }
                    this.field3820[var23] = var33;
                    this.field3821[var23] = Statics.field7343.method5688(this.method6208(true, false, var31, var32));
                    this.field3822[var23] = Statics.field7343.method5688(this.method6208(false, false, var31, var32));
                    this.field3797[var23] = Statics.field7343.method5688(this.method6208(true, true, var31, var32));
                    this.field3825[var23] = Statics.field7343.method5688(this.method6208(false, true, var31, var32));
                    var23++;
                }
            }
        }
        this.field3831 = Statics.field4561;
        Statics.field4561 = null;
        this.method6178(this.mapSizeX >> 4, this.mapSizeZ >> 4, 16, false);
    }

    @ObfuscatedName("ml.at(ZZIIB)Ljava/lang/String;")
    public String method6208(boolean arg0, boolean arg1, int arg2, int arg3) {
        String var5 = "";
        String var6;
        if (arg0) {
            var6 = var5 + "m" + arg2 + '_' + arg3;
        } else {
            var6 = var5 + "l" + arg2 + '_' + arg3;
        }
        if (arg1) {
            var6 = 'u' + var6;
        }
        return var6;
    }

    @ObfuscatedName("ml.ax(Lff;I)V")
    public void setBuildAreaSize(BuildAreaSize arg0) {
        if (this.field3792 == arg0) {
            return;
        }
        this.mapSizeX = this.mapSizeZ = arg0.field2144;
        this.field3801 = new int[4][this.mapSizeX >> 3][this.mapSizeZ >> 3];
        this.field3812 = new int[this.mapSizeX][this.mapSizeZ];
        this.field3823 = new int[this.mapSizeX][this.mapSizeZ];
        for (int var2 = 0; var2 < 4; var2++) {
            this.field3811[var2] = CollisionMap.method4718(this.mapSizeX, this.mapSizeZ);
        }
        this.field3814 = new byte[4][this.mapSizeX][this.mapSizeZ];
        this.sceneLevelTileFlags = new SceneLevelTileFlags(4, this.mapSizeX, this.mapSizeZ);
        this.method6086();
        this.field3792 = arg0;
    }

    @ObfuscatedName("ml.aw(B)V")
    public void method6196() {
        if (RebuildType.field3839 == this.rebuildType || RebuildType.field3839 == this.field3796) {
            return;
        }
        if (RebuildType.REBUILD_REGION == this.rebuildType || RebuildType.field3840 == this.rebuildType || this.rebuildType != this.field3796 && (RebuildType.REBUILD_NORMAL == this.rebuildType || RebuildType.REBUILD_NORMAL == this.field3796)) {
            client.npcCount = 0;
            client.field8966 = 0;
            client.npcs.clear();
        }
        this.field3796 = this.rebuildType;
    }

    @ObfuscatedName("ml.aa(IIIZI)V")
    public void method6178(int arg0, int arg1, int arg2, boolean arg3) {
        if (client.field8988 == 1) {
            if (this.asyncRebuilding) {
                throw new IllegalStateException();
            }
            client.field8988 = 2;
            client.cutsceneId = -1;
        }
        if (!arg3 && this.field3790 == arg0 && this.field3798 == arg1) {
            return;
        }
        this.field3790 = arg0;
        this.field3798 = arg1;
        if (!this.asyncRebuilding) {
            client.setState(arg2);
            Statics.method2579(LocalisedText.field6938.get(Statics.language), true, Statics.renderer, Statics.field560, Statics.field9813);
        }
        if (this.field3795 == null) {
            this.field3824 = new CoordGrid(0, 0, 0);
        } else {
            this.field3824 = this.field3795;
        }
        this.field3795 = new CoordGrid(0, (this.field3790 - (this.mapSizeX >> 4)) * 8, (this.field3798 - (this.mapSizeZ >> 4)) * 8);
        this.field3829 = WorldMap.method7084(this.field3795.x, this.field3795.z);
        this.field3806 = null;
        if (!this.asyncRebuilding) {
            this.method6126(arg2);
        }
    }

    @ObfuscatedName("ml.am(IB)V")
    public void method6126(int arg0) {
        int var2 = this.field3795.x - this.field3824.x;
        int var3 = this.field3795.z - this.field3824.z;
        if (arg0 == 16) {
            for (int var4 = 0; var4 < client.field8966; var4++) {
                ObjectNode var5 = client.field8965[var4];
                if (var5 != null) {
                    NpcEntity var6 = (NpcEntity) var5.value;
                    for (int var7 = 0; var7 < var6.routeWaypointX.length; var7++) {
                        var6.routeWaypointX[var7] -= var2;
                        var6.routeWaypointZ[var7] -= var3;
                    }
                    Vector3 var8 = Vector3.create(var6.getTransform().trans);
                    var8.x -= var2 * 512;
                    var8.z -= var3 * 512;
                    var6.method8551(var8);
                    var8.release();
                }
            }
        } else {
            boolean var9 = false;
            client.npcCount = 0;
            int var10 = this.mapSizeX - 512;
            int var11 = this.mapSizeZ - 512;
            for (int var12 = 0; var12 < client.field8966; var12++) {
                ObjectNode var13 = client.field8965[var12];
                if (var13 != null) {
                    NpcEntity var14 = (NpcEntity) var13.value;
                    Vector3 var15 = Vector3.create(var14.getTransform().trans);
                    var15.x -= var2 * 512;
                    var15.z -= var3 * 512;
                    var14.method8551(var15);
                    if ((int) var15.x >= 0 && (int) var15.x <= var10 && (int) var15.z >= 0 && (int) var15.z <= var11) {
                        boolean var16 = true;
                        for (int var17 = 0; var17 < var14.routeWaypointX.length; var17++) {
                            var14.routeWaypointX[var17] -= var2;
                            var14.routeWaypointZ[var17] -= var3;
                            if (var14.routeWaypointX[var17] < 0 || var14.routeWaypointX[var17] >= this.mapSizeX || var14.routeWaypointZ[var17] < 0 || var14.routeWaypointZ[var17] >= this.mapSizeZ) {
                                var16 = false;
                            }
                        }
                        if (var16) {
                            client.field9056[++client.npcCount - 1] = var14.localPlayerIndex;
                        } else {
                            var14.method16149(null);
                            var13.unlink();
                            var9 = true;
                        }
                    } else {
                        var14.method16149(null);
                        var13.unlink();
                        var9 = true;
                    }
                    var15.release();
                }
            }
            if (var9) {
                client.field8966 = client.npcs.length();
                int var18 = 0;
                Iterator var19 = client.npcs.iterator();
                while (var19.hasNext()) {
                    ObjectNode var20 = (ObjectNode) var19.next();
                    client.field8965[var18++] = var20;
                }
            }
        }
        for (int var21 = 0; var21 < 2048; var21++) {
            PlayerEntity var22 = client.players[var21];
            if (var22 != null) {
                for (int var23 = 0; var23 < var22.routeWaypointX.length; var23++) {
                    var22.routeWaypointX[var23] -= var2;
                    var22.routeWaypointZ[var23] -= var3;
                }
                Vector3 var24 = Vector3.create(var22.getTransform().trans);
                var24.x -= var2 * 512;
                var24.z -= var3 * 512;
                var22.method8551(var24);
                var24.release();
            }
        }
        HintArrow[] var25 = client.field8936;
        for (int var26 = 0; var26 < var25.length; var26++) {
            HintArrow var27 = var25[var26];
            if (var27 != null) {
                var27.field778 -= var2 * 512;
                var27.field777 -= var3 * 512;
            }
        }
        for (ChangeLocationRequest var28 = (ChangeLocationRequest) ChangeLocationRequest.field9278.head(); var28 != null; var28 = (ChangeLocationRequest) ChangeLocationRequest.field9278.next()) {
            var28.field9291 -= var2;
            var28.field9280 -= var3;
            if (RebuildType.field3841 != this.rebuildType && (var28.field9291 < 0 || var28.field9280 < 0 || var28.field9291 >= this.mapSizeX || var28.field9280 >= this.mapSizeZ)) {
                var28.unlink();
            }
        }
        for (ChangeLocationRequest var29 = (ChangeLocationRequest) ChangeLocationRequest.field9292.head(); var29 != null; var29 = (ChangeLocationRequest) ChangeLocationRequest.field9292.next()) {
            var29.field9291 -= var2;
            var29.field9280 -= var3;
            if (RebuildType.field3841 != this.rebuildType && (var29.field9291 < 0 || var29.field9280 < 0 || var29.field9291 >= this.mapSizeX || var29.field9280 >= this.mapSizeZ)) {
                var29.unlink();
            }
        }
        for (ObjStackList var30 = (ObjStackList) client.field9088.method11928(); var30 != null; var30 = (ObjStackList) client.field9088.method11929()) {
            int var31 = (int) (var30.field4228 >> 28 & 0x3L);
            int var32 = (int) (var30.field4228 & 0x3FFFL);
            int var33 = var32 - this.field3795.x;
            int var34 = (int) (var30.field4228 >> 14 & 0x3FFFL);
            int var35 = var34 - this.field3795.z;
            if (this.scene != null) {
                if (var33 >= 0 && var35 >= 0 && var33 < this.mapSizeX && var35 < this.mapSizeZ && var33 < this.scene.field4495 && var35 < this.scene.field4496) {
                    if (this.scene.field4497 != null) {
                        this.scene.method7429(var31, var33, var35);
                    }
                } else if (RebuildType.field3841 != this.rebuildType) {
                    var30.unlink();
                }
            }
        }
        if (MiniMap.mapFlagX != 0) {
            MiniMap.mapFlagX -= var2;
            MiniMap.mapFlagZ -= var3;
        }
        AudioRenderer.method2387();
        PositionedSound.method6259(false);
        if (arg0 == 16) {
            client.field9154 -= var2 * 512;
            client.field9019 -= var3 * 512;
            Statics.cameraOrbitX -= var2 * 512;
            Statics.cameraOrbitZ -= var3 * 512;
            if (Statics.cameraState != 5) {
                Statics.cameraState = 4;
                Statics.field3308 = -1;
                Statics.field1941 = -1;
            }
        } else {
            Statics.cameraMoveToX -= var2;
            Statics.cameraMoveToZ -= var3;
            Statics.cameraLookX -= var2;
            Statics.cameraLookZ -= var3;
            Statics.cameraX -= var2 * 512;
            Statics.cameraZ -= var3 * 512;
            if (Math.abs(var2) > this.mapSizeX || Math.abs(var3) > this.mapSizeZ) {
                this.field3802.method8154();
            }
        }
        MiniMenu.method11300();
        MiniMap.method7992();
        client.field9090.clear();
        client.field9007.clearBridged();
        client.field9091.method11653();
        Statics.method1638();
    }

    @ObfuscatedName("ml.ad(I)V")
    public void method6127() {
        this.field3793 = null;
        this.field3794 = null;
        for (int var1 = 0; var1 < 4; var1++) {
            if (this.field3811[var1] != null) {
                this.field3811[var1].method6294();
            }
        }
        if (this.sceneLevelTileFlags != null) {
            this.sceneLevelTileFlags.method5799();
        }
        if (this.field3802 != null) {
            this.field3802.method8150();
        }
        if (this.scene != null) {
            this.scene.pickableEntities.method7384();
            this.scene = null;
        }
    }

    @ObfuscatedName("ml.az(I)Z")
    public boolean method6128() {
        if (!this.asyncRebuilding) {
            MapLogicRelated.method8512(false);
        }
        this.field3816 = 0;
        for (int var1 = 0; var1 < this.field3800.length; var1++) {
            if (this.field3821[var1] != -1 && this.field3800[var1] == null) {
                this.field3800[var1] = Statics.field7343.fetchFile(this.field3821[var1], 0);
                if (this.field3800[var1] == null) {
                    this.field3816++;
                }
            }
            if (this.field3822[var1] != -1 && this.field3828[var1] == null) {
                this.field3828[var1] = Statics.field7343.method5699(this.field3822[var1], 0, this.field3831[var1]);
                if (this.field3828[var1] == null) {
                    this.field3816++;
                }
            }
            if (this.field3797[var1] != -1 && this.field3830[var1] == null) {
                this.field3830[var1] = Statics.field7343.fetchFile(this.field3797[var1], 0);
                if (this.field3830[var1] == null) {
                    this.field3816++;
                }
            }
            if (this.field3825[var1] != -1 && this.field3832[var1] == null) {
                this.field3832[var1] = Statics.field7343.fetchFile(this.field3825[var1], 0);
                if (this.field3832[var1] == null) {
                    this.field3816++;
                }
            }
            if (this.field3807 != null && this.field3810[var1] == null && this.field3807[var1] != -1) {
                this.field3810[var1] = Statics.field7343.method5699(this.field3807[var1], 0, this.field3831[var1]);
                if (this.field3810[var1] == null) {
                    this.field3816++;
                }
            }
        }
        if (this.field3806 == null) {
            if (this.field3829 == null || !Statics.field4059.method5680(this.field3829.debugname + "_staticelements")) {
                this.field3806 = new WorldMapRelated(0);
            } else if (Statics.field4059.method5648(this.field3829.debugname + "_staticelements")) {
                this.field3806 = WorldMapRelated.method2791(Statics.field4059, this.field3829.debugname + "_staticelements", client.field9142);
            } else {
                this.field3816++;
            }
        }
        if (this.field3816 > 0) {
            if (this.field3817 < this.field3816) {
                this.field3817 = this.field3816;
            }
            this.field3834 = RebuildStage.field3775;
            return false;
        }
        this.field3818 = 0;
        for (int var2 = 0; var2 < this.field3800.length; var2++) {
            byte[] var3 = this.field3828[var2];
            if (var3 != null) {
                int var4 = (this.field3820[var2] >> 8) * 64 - this.field3795.x;
                int var5 = (this.field3820[var2] & 0xFF) * 64 - this.field3795.z;
                if (this.rebuildType.isRegionType()) {
                    var4 = 10;
                    var5 = 10;
                }
                int var6 = ClientMapLoader.method6583(this.field3815, var3, var4, var5, this.mapSizeX, this.mapSizeZ);
                if (var6 > 0) {
                    this.field3818 += var6;
                }
            }
            byte[] var7 = this.field3832[var2];
            if (var7 != null) {
                int var8 = (this.field3820[var2] >> 8) * 64 - this.field3795.x;
                int var9 = (this.field3820[var2] & 0xFF) * 64 - this.field3795.z;
                if (this.rebuildType.isRegionType()) {
                    var8 = 10;
                    var9 = 10;
                }
                int var10 = ClientMapLoader.method6583(this.field3815, var7, var8, var9, this.mapSizeX, this.mapSizeZ);
                if (var10 > 0) {
                    this.field3818 += var10;
                }
            }
        }
        if (this.field3818 > 0) {
            if (this.field3819 < this.field3818) {
                this.field3819 = this.field3818;
            }
            this.field3834 = RebuildStage.field3776;
            return false;
        }
        if (!this.asyncRebuilding && RebuildStage.field3777 != this.field3834) {
            Statics.method2579(LocalisedText.field6938.get(Statics.language) + TextUtil.field492 + "(100%)", true, Statics.renderer, Statics.field560, Statics.field9813);
        }
        this.field3834 = RebuildStage.field3778;
        if (!this.asyncRebuilding) {
            AudioRenderer.method3461();
        }
        if (!this.asyncRebuilding) {
            for (int var11 = 0; var11 < 2048; var11++) {
                PlayerEntity var12 = client.players[var11];
                if (var12 != null) {
                    var12.field9808 = null;
                }
            }
            for (int var13 = 0; var13 < client.field8965.length; var13++) {
                ObjectNode var14 = client.field8965[var13];
                if (var14 != null) {
                    ((GraphEntity) var14.value).field9808 = null;
                }
            }
        }
        if (!this.asyncRebuilding) {
            client.method5025(true);
        }
        if (!this.asyncRebuilding) {
            VideoTypeList.method4743();
        }
        boolean var15 = false;
        if (Statics.options.waterDetail.method15755() == 2) {
            for (int var16 = 0; var16 < this.field3800.length; var16++) {
                if (this.field3832[var16] != null || this.field3830[var16] != null) {
                    var15 = true;
                    break;
                }
            }
        }
        int var17 = DrawDistance.method5012(Statics.options.drawDistance.method15853()).field2149 * 64;
        if (Statics.renderer.method454()) {
            var17++;
        }
        this.method6235();
        this.method6127();
        this.scene = new Scene(Statics.renderer, 9, 4, this.mapSizeX, this.mapSizeZ, var17, var15, Statics.renderer.method768() > 0);
        this.scene.method7404(false);
        this.scene.method7546(client.field8943);
        if (client.field8943 == 0) {
            this.scene.method7403(null);
        } else {
            this.scene.method7403(Statics.field2163);
        }
        this.field3808 = new LocTint();
        this.field3809 = -0.05F + (float) (Math.random() / 10.0D);
        this.field3794 = new ClientMapLoader(this.scene, this.field3815, 4, this.mapSizeX, this.mapSizeZ, false, this.sceneLevelTileFlags, this.field3802);
        this.field3794.method5834();
        this.field3794.field3629 = Statics.options.sceneryShadows.method15747();
        this.field3794.field3622 = Statics.options.waterDetail.method15755() == 2;
        this.field3794.field3623 = Statics.options.lightDetail.method15667() == 1;
        this.field3794.field3624 = Statics.options.groundBlending.method15843() == 1;
        this.field3794.field3625 = Statics.options.texturing.method15686() == 1;
        if (this.rebuildType.isRegionType()) {
            this.method6131(this.field3794, this.field3800);
        } else {
            this.method6184(this.field3794, this.field3800);
        }
        if (this.asyncRebuilding) {
            this.method6174(50);
        }
        this.field3802.method8159(this.mapSizeX >> 4, this.mapSizeZ >> 4);
        this.field3802.method8144(this);
        if (var15) {
            this.scene.method7404(true);
            this.field3793 = new ClientMapLoader(this.scene, this.field3815, 1, this.mapSizeX, this.mapSizeZ, true, this.sceneLevelTileFlags, this.field3802);
            this.field3793.method5834();
            this.field3793.field3629 = Statics.options.sceneryShadows.method15747();
            this.field3793.field3622 = Statics.options.waterDetail.method15755() == 2;
            this.field3793.field3623 = Statics.options.lightDetail.method15667() == 1;
            this.field3793.field3624 = Statics.options.groundBlending.method15843() == 1;
            this.field3793.field3625 = Statics.options.texturing.method15686() == 1;
            if (this.rebuildType.isRegionType()) {
                this.method6131(this.field3793, this.field3830);
                if (!this.asyncRebuilding) {
                    MapLogicRelated.method8512(true);
                }
            } else {
                this.method6184(this.field3793, this.field3830);
                if (!this.asyncRebuilding) {
                    MapLogicRelated.method8512(true);
                }
            }
            this.field3793.method5841(0, this.field3794.field3697[0]);
            this.field3793.method5842(Statics.renderer, null, null);
            this.scene.method7404(false);
            if (this.asyncRebuilding) {
                this.method6174(50);
            }
        }
        this.field3794.method5842(Statics.renderer, var15 ? this.field3793.field3697 : (int[][][]) null, this.field3811);
        if (this.rebuildType.isRegionType()) {
            if (!this.asyncRebuilding) {
                MapLogicRelated.method8512(true);
            }
            this.method6209(this.field3794, this.field3828);
        } else {
            if (!this.asyncRebuilding) {
                MapLogicRelated.method8512(true);
            }
            this.method6203(this.field3794, this.field3828);
            if (this.field3810 != null) {
                this.method6134();
            }
        }
        if (!this.asyncRebuilding) {
            MapLogicRelated.method8512(true);
        }
        this.field3794.method5833(Statics.renderer, var15 ? this.scene.field4502[0] : null, null);
        if (this.asyncRebuilding) {
            this.method6174(75);
        }
        this.field3794.method14291(Statics.renderer, false);
        if (this.asyncRebuilding) {
            this.method6174(75);
        }
        if (!this.asyncRebuilding) {
            MapLogicRelated.method8512(true);
        }
        if (var15) {
            this.scene.method7404(true);
            if (!this.asyncRebuilding) {
                MapLogicRelated.method8512(true);
            }
            if (this.rebuildType.isRegionType()) {
                this.method6209(this.field3793, this.field3832);
            } else {
                this.method6203(this.field3793, this.field3832);
            }
            if (!this.asyncRebuilding) {
                MapLogicRelated.method8512(true);
            }
            this.field3793.method5833(Statics.renderer, null, this.scene.field4527[0]);
            this.field3793.method14291(Statics.renderer, true);
            if (!this.asyncRebuilding) {
                MapLogicRelated.method8512(true);
            }
            this.scene.method7404(false);
            if (this.asyncRebuilding) {
                this.method6174(50);
            }
        }
        this.field3794.method5888();
        if (this.field3793 != null) {
            this.field3793.method5888();
        }
        this.scene.method7405();
        if (this.asyncRebuilding) {
            MonotonicTime.get();
            while (!Statics.renderer.method495()) {
                this.method6174(1);
            }
        }
        boolean var18 = false;
        if (this.asyncRebuilding) {
            World var19 = client.world;
            this.method6090(var19);
            Statics.asyncRebuild.method6041(var19);
            var18 = true;
            MonotonicTime.get();
            Object var20 = client.field8983;
            synchronized (client.field8983) {
                client.field8981 = true;
                try {
                    client.field8983.wait();
                } catch (InterruptedException var38) {
                }
            }
            client.world = this;
            var19.method6127();
            this.method6126(16);
            this.method6196();
        } else {
            AudioRenderer.method3461();
            this.field3802.method8173();
            GameShell.method2427();
        }
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < this.mapSizeX; var24++) {
                for (int var25 = 0; var25 < this.mapSizeZ; var25++) {
                    client.sortObjStacks(var23, var24, var25);
                }
            }
        }
        for (int var26 = 0; var26 < client.field9044.length; var26++) {
            if (client.field9044[var26] != null) {
                client.field9044[var26].method6951(this.scene);
            }
        }
        Statics.method7076();
        ChangeLocationRequest.method11709();
        if (Statics.getEnvironment() == GameShellEnvironment.APPLICATION && client.gameConnection.getStream() != null && client.state == 16) {
            ClientMessage var27 = ClientMessage.createMessage(ClientProt.DETECT_MODIFIED_CLIENT, client.gameConnection.randomOut);
            var27.buf.p4(1057001181);
            client.gameConnection.queue(var27);
        }
        if (!this.rebuildType.isRegionType()) {
            int var28 = (this.field3790 - (this.mapSizeX >> 4)) / 8;
            int var29 = ((this.mapSizeX >> 4) + this.field3790) / 8;
            int var30 = (this.field3798 - (this.mapSizeZ >> 4)) / 8;
            int var31 = ((this.mapSizeZ >> 4) + this.field3798) / 8;
            for (int var32 = var28 - 1; var32 <= var29 + 1; var32++) {
                for (int var33 = var30 - 1; var33 <= var31 + 1; var33++) {
                    if (var32 < var28 || var32 > var29 || var33 < var30 || var33 > var31) {
                        Statics.field7343.method5649(this.method6208(true, false, var32, var33));
                        Statics.field7343.method5649(this.method6208(false, false, var32, var33));
                        Statics.field7343.method5649(this.method6208(true, true, var32, var33));
                        Statics.field7343.method5649(this.method6208(false, true, var32, var33));
                    }
                }
            }
        }
        if (client.state == 5) {
            client.setState(6);
        } else if (client.state == 19) {
            client.setState(15);
        } else if (client.state == 7) {
            client.setState(11);
        } else if (client.state == 17) {
            client.setState(14);
        } else {
            client.setState(1);
            if (client.gameConnection.getStream() != null) {
                ClientMessage var34 = ClientMessage.createMessage(ClientProt.MAP_BUILD_COMPLETE, client.gameConnection.randomOut);
                client.gameConnection.queue(var34);
            }
        }
        ClientWorldMap.method7071();
        if (this.field3833) {
            DeveloperConsole.addLine(Long.toString(MonotonicTime.get() - this.field3789));
            this.field3833 = false;
        }
        if (var18) {
            Object var35 = client.field8982;
            synchronized (client.field8982) {
                client.field8982.notify();
            }
        }
        return true;
    }

    @ObfuscatedName("ml.ak(II)V")
    public void method6174(int arg0) {
        try {
            Thread.sleep((long) arg0);
        } catch (InterruptedException var3) {
        }
    }

    @ObfuscatedName("ml.av(Labo;[[BI)V")
    public void method6184(ClientMapLoader arg0, byte[][] arg1) {
        int var3 = arg1.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                Packet var6 = new Packet(var5);
                int var7 = this.field3820[var4] >> 8;
                int var8 = this.field3820[var4] & 0xFF;
                int var9 = var7 * 64 - this.field3795.x;
                int var10 = var8 * 64 - this.field3795.z;
                if (!this.asyncRebuilding) {
                    AudioRenderer.method3461();
                }
                arg0.method5838(var6, var9, var10, this.field3795.x, this.field3795.z, this.field3811);
                arg0.method14269(Statics.renderer, var6, var9, var10);
            }
        }
        for (int var11 = 0; var11 < var3; var11++) {
            int var12 = (this.field3820[var11] >> 8) * 64 - this.field3795.x;
            int var13 = (this.field3820[var11] & 0xFF) * 64 - this.field3795.z;
            byte[] var14 = arg1[var11];
            if (var14 == null && this.field3798 < 800) {
                if (!this.asyncRebuilding) {
                    AudioRenderer.method3461();
                }
                arg0.method5836(var12, var13, 64, 64);
            }
        }
    }

    @ObfuscatedName("ml.aj(Labo;[[BI)V")
    public void method6131(ClientMapLoader arg0, byte[][] arg1) {
        for (int var3 = 0; var3 < arg0.field3628; var3++) {
            if (!this.asyncRebuilding) {
                AudioRenderer.method3461();
            }
            for (int var4 = 0; var4 < this.mapSizeX >> 3; var4++) {
                for (int var5 = 0; var5 < this.mapSizeZ >> 3; var5++) {
                    int var6 = this.field3801[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field3644 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < this.field3820.length; var12++) {
                                if (this.field3820[var12] == var11 && arg1[var12] != null) {
                                    Packet var13 = new Packet(arg1[var12]);
                                    arg0.method5839(var13, var3, var4 * 8, var5 * 8, var7, var9, var10, var8, this.field3811);
                                    arg0.method14270(Statics.renderer, var13, var3, var4 * 8, var5 * 8, var7, var9, var10, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var14 = 0; var14 < arg0.field3628; var14++) {
            if (!this.asyncRebuilding) {
                AudioRenderer.method3461();
            }
            for (int var15 = 0; var15 < this.mapSizeX >> 3; var15++) {
                for (int var16 = 0; var16 < this.mapSizeZ >> 3; var16++) {
                    int var17 = this.field3801[var14][var15][var16];
                    if (var17 == -1) {
                        arg0.method5837(var14, var15 * 8, var16 * 8, 8, 8);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ml.ah(Labo;[[BI)V")
    public void method6203(ClientMapLoader arg0, byte[][] arg1) {
        int var3 = this.field3800.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (this.field3820[var4] >> 8) * 64 - this.field3795.x;
                int var7 = (this.field3820[var4] & 0xFF) * 64 - this.field3795.z;
                if (!this.asyncRebuilding) {
                    AudioRenderer.method3461();
                }
                arg0.method14271(Statics.renderer, var5, var6, var7, this.field3811);
                if (this.asyncRebuilding) {
                    this.method6174(10);
                }
            }
        }
    }

    @ObfuscatedName("ml.au(Labo;[[BI)V")
    public void method6209(ClientMapLoader arg0, byte[][] arg1) {
        for (int var3 = 0; var3 < arg0.field3628; var3++) {
            if (!this.asyncRebuilding) {
                AudioRenderer.method3461();
            }
            for (int var4 = 0; var4 < this.mapSizeX >> 3; var4++) {
                for (int var5 = 0; var5 < this.mapSizeZ >> 3; var5++) {
                    int var6 = this.field3801[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field3644 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < this.field3820.length; var12++) {
                                if (this.field3820[var12] == var11 && arg1[var12] != null) {
                                    arg0.method14272(Statics.renderer, arg1[var12], var3, var4 * 8, var5 * 8, var7, (var9 & 0x7) * 8, (var10 & 0x7) * 8, var8, this.field3811);
                                    break;
                                }
                            }
                        }
                    }
                    if (this.asyncRebuilding) {
                        this.method6174(5);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ml.ae(I)V")
    public void method6134() {
        int var1 = this.field3810.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3810[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < client.field8985; var4++) {
                    if (client.field8984[var4] == this.field3820[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    client.field8984[client.field8985] = this.field3820[var2];
                    var3 = ++client.field8985 - 1;
                }
                Packet var5 = new Packet(this.field3810[var2]);
                int var6 = 0;
                while (var5.pos < this.field3810[var2].length && var6 < 511 && client.npcCount < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.g2();
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (this.field3820[var2] >> 8) * 64 - this.field3795.x + var10;
                    int var13 = (this.field3820[var2] & 0xFF) * 64 - this.field3795.z + var11;
                    NPCType var14 = Statics.field3774.method12565(var5.g2());
                    ObjectNode var15 = (ObjectNode) client.npcs.getNode((long) var7);
                    if (var15 == null && (var14.field7220 & 0x1) > 0 && var12 >= 0 && var14.field7213 + var12 < this.mapSizeX && var13 >= 0 && var14.field7213 + var13 < this.mapSizeZ) {
                        NpcEntity var16 = new NpcEntity(this.scene);
                        var16.localPlayerIndex = var7;
                        ObjectNode var17 = new ObjectNode(var16);
                        client.npcs.put(var17, (long) var7);
                        client.field8965[++client.field8966 - 1] = var17;
                        client.field9056[++client.npcCount - 1] = var7;
                        var16.field8618 = client.loopCycle;
                        var16.method16149(var14);
                        var16.setSize(var16.type.field7213);
                        var16.field8636 = var16.type.field7241 << 3;
                        var16.method13946(var16.type.field7243.method6342().getId() << 11 & 0x3FFF, true);
                        var16.method16153(var9, var12, var13, true, var16.size());
                    }
                }
            }
        }
    }
}
