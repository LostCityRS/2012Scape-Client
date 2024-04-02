package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
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
	public BuildAreaSize buildAreaSize;

	@ObfuscatedName("ml.c")
	public ClientMapLoader underwaterMapLoader;

	@ObfuscatedName("ml.m")
	public ClientMapLoader mapLoader;

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
	public EnvironmentManager environmentManager;

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
	public LocTypeList locTypeList;

	@ObfuscatedName("ml.r")
	public class361[] field3811 = new class361[4];

	@ObfuscatedName("ml.g")
	public int[][] field3812;

	@ObfuscatedName("ml.y")
	public int[][] field3823;

	@ObfuscatedName("ml.e")
	public byte[][][] field3814;

	@ObfuscatedName("ml.ay")
	public RebuildStage rebuildStage;

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

	public World(boolean asyncRebuilding) {
		this.asyncRebuilding = asyncRebuilding;
	}

	@ObfuscatedName("ml.u(I)Lmp;")
	public RebuildType getRebuildType() {
		return this.rebuildType;
	}

	@ObfuscatedName("ml.j(B)Llf;")
	public RebuildStage getRebuildStage() {
		return this.rebuildStage;
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
	public CoordGrid method6214() {
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
		return this.mapLoader == null || this.mapLoader.field3631 == null || this.mapLoader.field3631[arg0] == null ? (byte[][]) null : this.mapLoader.field3631[arg0];
	}

	@ObfuscatedName("ml.p(B)Llg;")
	public SceneLevelTileFlags getSceneLevelTileFlags() {
		return this.sceneLevelTileFlags;
	}

	@ObfuscatedName("ml.w(II)Lmv;")
	public class361 method6101(int arg0) {
		return this.field3811[arg0];
	}

	@ObfuscatedName("ml.b(I)Lqp;")
	public EnvironmentManager getEnvironmentManager() {
		return this.environmentManager;
	}

	@ObfuscatedName("ml.x(S)Ltz;")
	public LocTypeList getLocTypeList() {
		return this.locTypeList;
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
	public ClientMapLoader getMapLoader() {
		return this.mapLoader;
	}

	@ObfuscatedName("ml.g(Ltz;I)V")
	public void setLocTytpeList(LocTypeList arg0) {
		this.locTypeList = arg0;
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
			Statics.resetStack();
			this.scene.pickableEntities.method7384();
			this.scene = null;
		}
	}

	@ObfuscatedName("ml.ay(I)V")
	public void method6112() {
		this.rebuildStage = RebuildStage.field3777;
		this.field3816 = 0;
		this.field3817 = 1;
		this.field3818 = 0;
		this.field3819 = 1;
	}

	@ObfuscatedName("ml.af(I)V")
	public void method6086() {
		this.environmentManager = new EnvironmentManager(Statics.toolkit, this.mapSizeX >> 3, this.mapSizeZ >> 3);
	}

	@ObfuscatedName("ml.ar(B)V")
	public void method6235() {
		this.field3804 = 200;
		this.field3805 = (int) ((double) this.mapSizeX * 34.46D);
		this.field3805 <<= 0x2;
		if (Statics.toolkit.method454()) {
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
		this.environmentManager.method8145(arg0.getEnvironmentManager());
	}

	@ObfuscatedName("ml.ap(I)V")
	public void method6102() {
		if (this.asyncRebuilding) {
			this.method6112();
			class822.method7184(true);
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
			this.environmentManager = var1.environmentManager;
			this.field3801 = var1.field3801;
			this.field3804 = var1.field3804;
			this.field3805 = var1.field3805;
			this.field3829 = var1.field3829;
			this.field3806 = var1.field3806;
			this.field3812 = var1.field3812;
			this.field3823 = var1.field3823;
			this.field3814 = var1.field3814;
			this.rebuildType = var1.rebuildType;
			this.buildAreaSize = var1.buildAreaSize;
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
	public void rebuildMap(RebuildRequest request) {
		this.rebuildType = request.field3786;
		if (RebuildType.field3838 == this.rebuildType) {
			this.method6168();
		} else if (RebuildType.REBUILD_NORMAL == this.rebuildType) {
			this.rebuildNormalMap(request.buf);
		} else if (RebuildType.field3839 == this.rebuildType) {
			this.method6121();
		} else if (this.rebuildType.isRegionType()) {
			this.rebuildRegionMap(request.buf);
		}
	}

	@ObfuscatedName("ml.as(I)V")
	public void method6168() {
		this.setBuildAreaSize(BuildAreaSize.get(Statics.preferences.buildArea.getValue()));
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
				this.field3821[var6] = Statics.field7343.method5688(this.getMapGroupName(true, false, var7, var8));
				this.field3822[var6] = Statics.field7343.method5688(this.getMapGroupName(false, false, var7, var8));
				this.field3807[var6] = Statics.field7343.method5688("n" + var7 + '_' + var8);
				this.field3797[var6] = Statics.field7343.method5688(this.getMapGroupName(true, true, var7, var8));
				this.field3825[var6] = Statics.field7343.method5688(this.getMapGroupName(false, true, var7, var8));
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
	public void rebuildNormalMap(PacketBit buf) {
		int size = buf.g1();
		int originZ = buf.g2();
		boolean forceRebuild = buf.g1_alt3() == 1;
		int originX = buf.g2_alt3();
		if (!this.asyncRebuilding) {
			this.method6196();
		}
		this.setBuildAreaSize(BuildAreaSize.get(size));
		int var6 = (buf.data.length - buf.pos) / 16;
		this.field3831 = new int[var6][4];
		for (int var7 = 0; var7 < var6; var7++) {
			for (int var8 = 0; var8 < 4; var8++) {
				this.field3831[var7][var8] = buf.g4s();
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
		int mapSquaresCount = 0;
		for (int var10 = (originX - (this.mapSizeX >> 4)) / 8; var10 <= ((this.mapSizeX >> 4) + originX) / 8; var10++) {
			for (int var11 = (originZ - (this.mapSizeZ >> 4)) / 8; var11 <= ((this.mapSizeZ >> 4) + originZ) / 8; var11++) {
				this.field3820[mapSquaresCount] = (var10 << 8) + var11;
				this.field3821[mapSquaresCount] = Statics.field7343.method5688(this.getMapGroupName(true, false, var10, var11));
				this.field3822[mapSquaresCount] = Statics.field7343.method5688(this.getMapGroupName(false, false, var10, var11));
				this.field3797[mapSquaresCount] = Statics.field7343.method5688(this.getMapGroupName(true, true, var10, var11));
				this.field3825[mapSquaresCount] = Statics.field7343.method5688(this.getMapGroupName(false, true, var10, var11));
				mapSquaresCount++;
			}
		}
		this.method6178(originX, originZ, 16, forceRebuild);
	}

	@ObfuscatedName("ml.ao(Lajl;B)V")
	public void rebuildRegionMap(PacketBit buf) {
		int rebuildType = buf.g1_alt2();
		if (rebuildType == 1) {
			this.rebuildType = RebuildType.REBUILD_REGION;
		} else if (rebuildType == 2) {
			this.rebuildType = RebuildType.field3837;
		} else if (rebuildType == 3) {
			this.rebuildType = RebuildType.field3840;
		} else if (rebuildType == 4) {
			this.rebuildType = RebuildType.field3841;
		}
		int originZ = buf.g2_alt3();
		int info = buf.g1_alt3();
		boolean forceRebuild = (info & 0x1) != 0;
		int size = buf.g1();
		int originX = buf.g2_alt2();
		if (!this.asyncRebuilding) {
			this.method6196();
		}
		this.setBuildAreaSize(BuildAreaSize.get(size));
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
							this.field3821[var15] = Statics.field7343.method5688(this.getMapGroupName(true, false, var24, var25));
							this.field3822[var15] = Statics.field7343.method5688(this.getMapGroupName(false, false, var24, var25));
							this.field3797[var15] = Statics.field7343.method5688(this.getMapGroupName(true, true, var24, var25));
							this.field3825[var15] = Statics.field7343.method5688(this.getMapGroupName(false, true, var24, var25));
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
		for (class781 var4 = (class781) class144.field1534.method11563(); var4 != null; var4 = (class781) class144.field1534.method11567()) {
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
		for (class781 var24 = (class781) class144.field1534.method11563(); var24 != null; var24 = (class781) class144.field1534.method11567()) {
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
				label82: for (int var32 = var26 >>> 3; var32 <= var30; var32++) {
					int var33 = var31 << 8 | var32;
					for (int var34 = 0; var34 < var23; var34++) {
						if (this.field3820[var34] == var33) {
							continue label82;
						}
					}
					this.field3820[var23] = var33;
					this.field3821[var23] = Statics.field7343.method5688(this.getMapGroupName(true, false, var31, var32));
					this.field3822[var23] = Statics.field7343.method5688(this.getMapGroupName(false, false, var31, var32));
					this.field3797[var23] = Statics.field7343.method5688(this.getMapGroupName(true, true, var31, var32));
					this.field3825[var23] = Statics.field7343.method5688(this.getMapGroupName(false, true, var31, var32));
					var23++;
				}
			}
		}
		this.field3831 = Statics.field4561;
		Statics.field4561 = null;
		this.method6178(this.mapSizeX >> 4, this.mapSizeZ >> 4, 16, false);
	}

	@ObfuscatedName("ml.at(ZZIIB)Ljava/lang/String;")
	public String getMapGroupName(boolean mapData, boolean underwater, int x, int z) {
		String prefix = "";
		String name;
		if (mapData) {
			name = prefix + "m" + x + '_' + z;
		} else {
			name = prefix + "l" + x + '_' + z;
		}
		if (underwater) {
			name = 'u' + name;
		}
		return name;
	}

	@ObfuscatedName("ml.ax(Lff;I)V")
	public void setBuildAreaSize(BuildAreaSize buildArea) {
		if (this.buildAreaSize == buildArea) {
			return;
		}
		this.mapSizeX = this.mapSizeZ = buildArea.size;
		this.field3801 = new int[4][this.mapSizeX >> 3][this.mapSizeZ >> 3];
		this.field3812 = new int[this.mapSizeX][this.mapSizeZ];
		this.field3823 = new int[this.mapSizeX][this.mapSizeZ];
		for (int i = 0; i < 4; i++) {
			this.field3811[i] = class361.method4718(this.mapSizeX, this.mapSizeZ);
		}
		this.field3814 = new byte[4][this.mapSizeX][this.mapSizeZ];
		this.sceneLevelTileFlags = new SceneLevelTileFlags(4, this.mapSizeX, this.mapSizeZ);
		this.method6086();
		this.buildAreaSize = buildArea;
	}

	@ObfuscatedName("ml.aw(B)V")
	public void method6196() {
		if (RebuildType.field3839 == this.rebuildType || RebuildType.field3839 == this.field3796) {
			return;
		}
		if (RebuildType.REBUILD_REGION == this.rebuildType || RebuildType.field3840 == this.rebuildType || this.rebuildType != this.field3796 && (RebuildType.REBUILD_NORMAL == this.rebuildType || RebuildType.REBUILD_NORMAL == this.field3796)) {
			client.field9104 = 0;
			client.field8966 = 0;
			client.field8964.method11925();
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
			client.field9059 = -1;
		}
		if (!arg3 && this.field3790 == arg0 && this.field3798 == arg1) {
			return;
		}
		this.field3790 = arg0;
		this.field3798 = arg1;
		if (!this.asyncRebuilding) {
			client.setState(arg2);
			Statics.method2579(class588.field6938.method12206(Statics.field2308), true, Statics.toolkit, Statics.field560, Statics.field9813);
		}
		if (this.field3795 == null) {
			this.field3824 = new CoordGrid(0, 0, 0);
		} else {
			this.field3824 = this.field3795;
		}
		this.field3795 = new CoordGrid(0, (this.field3790 - (this.mapSizeX >> 4)) * 8, (this.field3798 - (this.mapSizeZ >> 4)) * 8);
		this.field3829 = class408.method7084(this.field3795.x, this.field3795.z);
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
				class798 var5 = client.field8965[var4];
				if (var5 != null) {
					class903 var6 = (class903) var5.field9550;
					for (int var7 = 0; var7 < var6.field8642.length; var7++) {
						var6.field8642[var7] -= var2;
						var6.field8643[var7] -= var3;
					}
					Vector3 var8 = Vector3.method5290(var6.method8565().field3464);
					var8.field3475 -= var2 * 512;
					var8.field3477 -= var3 * 512;
					var6.method8551(var8);
					var8.method5291();
				}
			}
		} else {
			boolean var9 = false;
			client.field9104 = 0;
			int var10 = this.mapSizeX * 512 - 512;
			int var11 = this.mapSizeZ * 512 - 512;
			for (int var12 = 0; var12 < client.field8966; var12++) {
				class798 var13 = client.field8965[var12];
				if (var13 != null) {
					class903 var14 = (class903) var13.field9550;
					Vector3 var15 = Vector3.method5290(var14.method8565().field3464);
					var15.field3475 -= var2 * 512;
					var15.field3477 -= var3 * 512;
					var14.method8551(var15);
					if ((int) var15.field3475 >= 0 && (int) var15.field3475 <= var10 && (int) var15.field3477 >= 0 && (int) var15.field3477 <= var11) {
						boolean var16 = true;
						for (int var17 = 0; var17 < var14.field8642.length; var17++) {
							var14.field8642[var17] -= var2;
							var14.field8643[var17] -= var3;
							if (var14.field8642[var17] < 0 || var14.field8642[var17] >= this.mapSizeX || var14.field8643[var17] < 0 || var14.field8643[var17] >= this.mapSizeZ) {
								var16 = false;
							}
						}
						if (var16) {
							client.field9056[++client.field9104 - 1] = var14.field8593;
						} else {
							var14.method16149(null);
							var13.method6979();
							var9 = true;
						}
					} else {
						var14.method16149(null);
						var13.method6979();
						var9 = true;
					}
					var15.method5291();
				}
			}
			if (var9) {
				client.field8966 = client.field8964.method11926();
				int var18 = 0;
				Iterator var19 = client.field8964.iterator();
				while (var19.hasNext()) {
					class798 var20 = (class798) var19.next();
					client.field8965[var18++] = var20;
				}
			}
		}
		for (int var21 = 0; var21 < 2048; var21++) {
			class902 var22 = client.field9070[var21];
			if (var22 != null) {
				for (int var23 = 0; var23 < var22.field8642.length; var23++) {
					var22.field8642[var23] -= var2;
					var22.field8643[var23] -= var3;
				}
				Vector3 var24 = Vector3.method5290(var22.method8565().field3464);
				var24.field3475 -= var2 * 512;
				var24.field3477 -= var3 * 512;
				var22.method8551(var24);
				var24.method5291();
			}
		}
		class60[] var25 = client.hintArrows;
		for (int var26 = 0; var26 < var25.length; var26++) {
			class60 var27 = var25[var26];
			if (var27 != null) {
				var27.field778 -= var2 * 512;
				var27.field777 -= var3 * 512;
			}
		}
		for (class770 var28 = (class770) class770.field9278.method11563(); var28 != null; var28 = (class770) class770.field9278.method11567()) {
			var28.field9291 -= var2;
			var28.field9280 -= var3;
			if (RebuildType.field3841 != this.rebuildType && (var28.field9291 < 0 || var28.field9280 < 0 || var28.field9291 >= this.mapSizeX || var28.field9280 >= this.mapSizeZ)) {
				var28.method6979();
			}
		}
		for (class770 var29 = (class770) class770.field9292.method11563(); var29 != null; var29 = (class770) class770.field9292.method11567()) {
			var29.field9291 -= var2;
			var29.field9280 -= var3;
			if (RebuildType.field3841 != this.rebuildType && (var29.field9291 < 0 || var29.field9280 < 0 || var29.field9291 >= this.mapSizeX || var29.field9280 >= this.mapSizeZ)) {
				var29.method6979();
			}
		}
		for (class774 var30 = (class774) client.field9088.method11928(); var30 != null; var30 = (class774) client.field9088.method11929()) {
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
					var30.method6979();
				}
			}
		}
		if (class58.field763 != 0) {
			class58.field763 -= var2;
			class58.field764 -= var3;
		}
		class395.method2387();
		class797.method6259(false);
		if (arg0 == 16) {
			client.field9154 -= var2 * 512;
			client.field9019 -= var3 * 512;
			Statics.field2297 -= var2 * 512;
			Statics.field6818 -= var3 * 512;
			if (Statics.field2671 != 5) {
				Statics.field2671 = 4;
				Statics.field3308 = -1;
				Statics.field1941 = -1;
			}
		} else {
			Statics.field1577 -= var2 * 512;
			Statics.field2123 -= var3 * 512;
			Statics.field2799 -= var2;
			Statics.field4855 -= var3;
			Statics.cameraX -= var2 * 512;
			Statics.cameraZ -= var3 * 512;
			if (Math.abs(var2) > this.mapSizeX || Math.abs(var3) > this.mapSizeZ) {
				this.environmentManager.method8154();
			}
		}
		class42.method11300();
		class58.method7992();
		client.field9090.method11925();
		client.field9007.method11557();
		client.field9091.method11653();
		Statics.method1638();
	}

	@ObfuscatedName("ml.ad(I)V")
	public void method6127() {
		this.underwaterMapLoader = null;
		this.mapLoader = null;
		for (int var1 = 0; var1 < 4; var1++) {
			if (this.field3811[var1] != null) {
				this.field3811[var1].method6294();
			}
		}
		if (this.sceneLevelTileFlags != null) {
			this.sceneLevelTileFlags.method5799();
		}
		if (this.environmentManager != null) {
			this.environmentManager.method8150();
		}
		if (this.scene != null) {
			this.scene.pickableEntities.method7384();
			this.scene = null;
		}
	}

	@ObfuscatedName("ml.az(I)Z")
	public boolean method6128() {
		if (!this.asyncRebuilding) {
			class356.method8512(false);
		}
		this.field3816 = 0;
		for (int var1 = 0; var1 < this.field3800.length; var1++) {
			if (this.field3821[var1] != -1 && this.field3800[var1] == null) {
				this.field3800[var1] = Statics.field7343.getFile(this.field3821[var1], 0);
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
				this.field3830[var1] = Statics.field7343.getFile(this.field3797[var1], 0);
				if (this.field3830[var1] == null) {
					this.field3816++;
				}
			}
			if (this.field3825[var1] != -1 && this.field3832[var1] == null) {
				this.field3832[var1] = Statics.field7343.getFile(this.field3825[var1], 0);
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
			if (this.field3829 == null || !Statics.field4059.method5680(this.field3829.field10362 + "_staticelements")) {
				this.field3806 = new WorldMapRelated(0);
			} else if (Statics.field4059.method5648(this.field3829.field10362 + "_staticelements")) {
				this.field3806 = WorldMapRelated.method2791(Statics.field4059, this.field3829.field10362 + "_staticelements", client.field9142);
			} else {
				this.field3816++;
			}
		}
		if (this.field3816 > 0) {
			if (this.field3817 < this.field3816) {
				this.field3817 = this.field3816;
			}
			this.rebuildStage = RebuildStage.field3775;
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
				int var6 = ClientMapLoader.method6583(this.locTypeList, var3, var4, var5, this.mapSizeX, this.mapSizeZ);
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
				int var10 = ClientMapLoader.method6583(this.locTypeList, var7, var8, var9, this.mapSizeX, this.mapSizeZ);
				if (var10 > 0) {
					this.field3818 += var10;
				}
			}
		}
		if (this.field3818 > 0) {
			if (this.field3819 < this.field3818) {
				this.field3819 = this.field3818;
			}
			this.rebuildStage = RebuildStage.field3776;
			return false;
		}
		if (!this.asyncRebuilding && RebuildStage.field3777 != this.rebuildStage) {
			Statics.method2579(class588.field6938.method12206(Statics.field2308) + TextUtil.field492 + "(100%)", true, Statics.toolkit, Statics.field560, Statics.field9813);
		}
		this.rebuildStage = RebuildStage.field3778;
		if (!this.asyncRebuilding) {
			class395.method3461();
		}
		if (!this.asyncRebuilding) {
			for (int var11 = 0; var11 < 2048; var11++) {
				class902 var12 = client.field9070[var11];
				if (var12 != null) {
					var12.field9808 = null;
				}
			}
			for (int var13 = 0; var13 < client.field8965.length; var13++) {
				class798 var14 = client.field8965[var13];
				if (var14 != null) {
					((class836) var14.field9550).field9808 = null;
				}
			}
		}
		if (!this.asyncRebuilding) {
			client.method5025(true);
		}
		if (!this.asyncRebuilding) {
			class521.method4743();
		}
		boolean var15 = false;
		if (Statics.preferences.field9666.method15755() == 2) {
			for (int var16 = 0; var16 < this.field3800.length; var16++) {
				if (this.field3832[var16] != null || this.field3830[var16] != null) {
					var15 = true;
					break;
				}
			}
		}
		int var17 = class185.method5012(Statics.preferences.field9644.method15853()).field2149 * 64;
		if (Statics.toolkit.method454()) {
			var17++;
		}
		this.method6235();
		this.method6127();
		this.scene = new Scene(Statics.toolkit, 9, 4, this.mapSizeX, this.mapSizeZ, var17, var15, Statics.toolkit.method768() > 0);
		this.scene.method7404(false);
		this.scene.method7546(client.field8943);
		if (client.field8943 == 0) {
			this.scene.method7403(null);
		} else {
			this.scene.method7403(Statics.field2163);
		}
		this.field3808 = new LocTint();
		this.field3809 = -0.05F + (float) (Math.random() / 10.0D);
		this.mapLoader = new ClientMapLoader(this.scene, this.locTypeList, 4, this.mapSizeX, this.mapSizeZ, false, this.sceneLevelTileFlags, this.environmentManager);
		this.mapLoader.method5834();
		this.mapLoader.field3629 = Statics.preferences.field9651.method15747();
		this.mapLoader.field3622 = Statics.preferences.field9666.method15755() == 2;
		this.mapLoader.field3623 = Statics.preferences.field9650.method15667() == 1;
		this.mapLoader.field3624 = Statics.preferences.field9647.method15843() == 1;
		this.mapLoader.field3625 = Statics.preferences.field9659.method15686() == 1;
		if (this.rebuildType.isRegionType()) {
			this.method6131(this.mapLoader, this.field3800);
		} else {
			this.method6184(this.mapLoader, this.field3800);
		}
		if (this.asyncRebuilding) {
			this.method6174(50);
		}
		this.environmentManager.method8159(this.mapSizeX >> 4, this.mapSizeZ >> 4);
		this.environmentManager.method8144(this);
		if (var15) {
			this.scene.method7404(true);
			this.underwaterMapLoader = new ClientMapLoader(this.scene, this.locTypeList, 1, this.mapSizeX, this.mapSizeZ, true, this.sceneLevelTileFlags, this.environmentManager);
			this.underwaterMapLoader.method5834();
			this.underwaterMapLoader.field3629 = Statics.preferences.field9651.method15747();
			this.underwaterMapLoader.field3622 = Statics.preferences.field9666.method15755() == 2;
			this.underwaterMapLoader.field3623 = Statics.preferences.field9650.method15667() == 1;
			this.underwaterMapLoader.field3624 = Statics.preferences.field9647.method15843() == 1;
			this.underwaterMapLoader.field3625 = Statics.preferences.field9659.method15686() == 1;
			if (this.rebuildType.isRegionType()) {
				this.method6131(this.underwaterMapLoader, this.field3830);
				if (!this.asyncRebuilding) {
					class356.method8512(true);
				}
			} else {
				this.method6184(this.underwaterMapLoader, this.field3830);
				if (!this.asyncRebuilding) {
					class356.method8512(true);
				}
			}
			this.underwaterMapLoader.method5841(0, this.mapLoader.field3697[0]);
			this.underwaterMapLoader.method5842(Statics.toolkit, null, null);
			this.scene.method7404(false);
			if (this.asyncRebuilding) {
				this.method6174(50);
			}
		}
		this.mapLoader.method5842(Statics.toolkit, var15 ? this.underwaterMapLoader.field3697 : (int[][][]) null, this.field3811);
		if (this.rebuildType.isRegionType()) {
			if (!this.asyncRebuilding) {
				class356.method8512(true);
			}
			this.method6209(this.mapLoader, this.field3828);
		} else {
			if (!this.asyncRebuilding) {
				class356.method8512(true);
			}
			this.method6203(this.mapLoader, this.field3828);
			if (this.field3810 != null) {
				this.method6134();
			}
		}
		if (!this.asyncRebuilding) {
			class356.method8512(true);
		}
		this.mapLoader.method5833(Statics.toolkit, var15 ? this.scene.field4502[0] : null, null);
		if (this.asyncRebuilding) {
			this.method6174(75);
		}
		this.mapLoader.method14291(Statics.toolkit, false);
		if (this.asyncRebuilding) {
			this.method6174(75);
		}
		if (!this.asyncRebuilding) {
			class356.method8512(true);
		}
		if (var15) {
			this.scene.method7404(true);
			if (!this.asyncRebuilding) {
				class356.method8512(true);
			}
			if (this.rebuildType.isRegionType()) {
				this.method6209(this.underwaterMapLoader, this.field3832);
			} else {
				this.method6203(this.underwaterMapLoader, this.field3832);
			}
			if (!this.asyncRebuilding) {
				class356.method8512(true);
			}
			this.underwaterMapLoader.method5833(Statics.toolkit, null, this.scene.field4527[0]);
			this.underwaterMapLoader.method14291(Statics.toolkit, true);
			if (!this.asyncRebuilding) {
				class356.method8512(true);
			}
			this.scene.method7404(false);
			if (this.asyncRebuilding) {
				this.method6174(50);
			}
		}
		this.mapLoader.method5888();
		if (this.underwaterMapLoader != null) {
			this.underwaterMapLoader.method5888();
		}
		this.scene.method7405();
		if (this.asyncRebuilding) {
			class153.method5554();
			while (!Statics.toolkit.method495()) {
				this.method6174(1);
			}
		}
		boolean var18 = false;
		if (this.asyncRebuilding) {
			World var19 = client.world;
			this.method6090(var19);
			Statics.field8656.method6041(var19);
			var18 = true;
			class153.method5554();
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
			class395.method3461();
			this.environmentManager.method8173();
			GameShell.method2427();
		}
		for (int var23 = 0; var23 < 4; var23++) {
			for (int var24 = 0; var24 < this.mapSizeX; var24++) {
				for (int var25 = 0; var25 < this.mapSizeZ; var25++) {
					client.method15178(var23, var24, var25);
				}
			}
		}
		for (int var26 = 0; var26 < client.field9044.length; var26++) {
			if (client.field9044[var26] != null) {
				client.field9044[var26].method6951(this.scene);
			}
		}
		Statics.method7076();
		class770.method11709();
		if (Statics.method5937() == class384.field4118 && client.field8975.getStream() != null && client.state == 16) {
			class792 var27 = class792.method14781(class280.field2939, client.field8975.randomOut);
			var27.field9467.p4(1057001181);
			client.field8975.method1913(var27);
		}
		if (!this.rebuildType.isRegionType()) {
			int var28 = (this.field3790 - (this.mapSizeX >> 4)) / 8;
			int var29 = ((this.mapSizeX >> 4) + this.field3790) / 8;
			int var30 = (this.field3798 - (this.mapSizeZ >> 4)) / 8;
			int var31 = ((this.mapSizeZ >> 4) + this.field3798) / 8;
			for (int var32 = var28 - 1; var32 <= var29 + 1; var32++) {
				for (int var33 = var30 - 1; var33 <= var31 + 1; var33++) {
					if (var32 < var28 || var32 > var29 || var33 < var30 || var33 > var31) {
						Statics.field7343.method5649(this.getMapGroupName(true, false, var32, var33));
						Statics.field7343.method5649(this.getMapGroupName(false, false, var32, var33));
						Statics.field7343.method5649(this.getMapGroupName(true, true, var32, var33));
						Statics.field7343.method5649(this.getMapGroupName(false, true, var32, var33));
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
			if (client.field8975.getStream() != null) {
				class792 var34 = class792.method14781(class280.field2913, client.field8975.randomOut);
				client.field8975.method1913(var34);
			}
		}
		class822.method7071();
		if (this.field3833) {
			class62.method1958(Long.toString(class153.method5554() - this.field3789));
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
					class395.method3461();
				}
				arg0.method5838(var6, var9, var10, this.field3795.x, this.field3795.z, this.field3811);
				arg0.method14269(Statics.toolkit, var6, var9, var10);
			}
		}
		for (int var11 = 0; var11 < var3; var11++) {
			int var12 = (this.field3820[var11] >> 8) * 64 - this.field3795.x;
			int var13 = (this.field3820[var11] & 0xFF) * 64 - this.field3795.z;
			byte[] var14 = arg1[var11];
			if (var14 == null && this.field3798 < 800) {
				if (!this.asyncRebuilding) {
					class395.method3461();
				}
				arg0.method5836(var12, var13, 64, 64);
			}
		}
	}

	@ObfuscatedName("ml.aj(Labo;[[BI)V")
	public void method6131(ClientMapLoader arg0, byte[][] arg1) {
		for (int var3 = 0; var3 < arg0.field3628; var3++) {
			if (!this.asyncRebuilding) {
				class395.method3461();
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
									arg0.method14270(Statics.toolkit, var13, var3, var4 * 8, var5 * 8, var7, var9, var10, var8);
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
				class395.method3461();
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
					class395.method3461();
				}
				arg0.method14271(Statics.toolkit, var5, var6, var7, this.field3811);
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
				class395.method3461();
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
									arg0.method14272(Statics.toolkit, arg1[var12], var3, var4 * 8, var5 * 8, var7, (var9 & 0x7) * 8, (var10 & 0x7) * 8, var8, this.field3811);
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
				while (var5.pos < this.field3810[var2].length && var6 < 511 && client.field9104 < 1023) {
					int var7 = var3 | var6++ << 6;
					int var8 = var5.g2();
					int var9 = var8 >> 14;
					int var10 = var8 >> 7 & 0x3F;
					int var11 = var8 & 0x3F;
					int var12 = (this.field3820[var2] >> 8) * 64 - this.field3795.x + var10;
					int var13 = (this.field3820[var2] & 0xFF) * 64 - this.field3795.z + var11;
					class611 var14 = Statics.field3774.method12565(var5.g2());
					class798 var15 = (class798) client.field8964.method11923((long) var7);
					if (var15 == null && (var14.field7220 & 0x1) > 0 && var12 >= 0 && var14.field7213 + var12 < this.mapSizeX && var13 >= 0 && var14.field7213 + var13 < this.mapSizeZ) {
						class903 var16 = new class903(this.scene);
						var16.field8593 = var7;
						class798 var17 = new class798(var16);
						client.field8964.pushNode(var17, (long) var7);
						client.field8965[++client.field8966 - 1] = var17;
						client.field9056[++client.field9104 - 1] = var7;
						var16.field8618 = client.field9213;
						var16.method16149(var14);
						var16.method13979(var16.field10075.field7213);
						var16.field8636 = var16.field10075.field7241 << 3;
						var16.method13946(var16.field10075.field7243.method6342().method6339() << 11 & 0x3FFF, true);
						var16.method16153(var9, var12, var13, true, var16.method13954());
					}
				}
			}
		}
	}
}
