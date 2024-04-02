
import deob.ObfuscatedName;

@ObfuscatedName("ym")
public class PureJavaFloorModel extends FloorModel {

	@ObfuscatedName("ym.z")
	public final PureJavaToolkit field7658;

	@ObfuscatedName("ym.n")
	public final int field7681;

	@ObfuscatedName("ym.o")
	public UnblendedTileData1[][] field7660;

	@ObfuscatedName("ym.q")
	public UnblendedTileData2[][] field7672;

	@ObfuscatedName("ym.p")
	public BlendedUntexturedTileData1[][] field7673;

	@ObfuscatedName("ym.w")
	public BlendedUntexturedTileData2[][] field7685;

	@ObfuscatedName("ym.b")
	public BlendedTexturedTileData[][] field7664;

	@ObfuscatedName("ym.x")
	public float field7665;

	@ObfuscatedName("ym.i")
	public float field7666;

	@ObfuscatedName("ym.v")
	public float field7667;

	@ObfuscatedName("ym.k")
	public float field7668;

	@ObfuscatedName("ym.h")
	public float field7654;

	@ObfuscatedName("ym.r")
	public float field7670;

	@ObfuscatedName("ym.g")
	public float field7663;

	@ObfuscatedName("ym.y")
	public float field7653;

	@ObfuscatedName("ym.e")
	public float field7656;

	@ObfuscatedName("ym.ay")
	public float field7674;

	@ObfuscatedName("ym.af")
	public float field7675;

	@ObfuscatedName("ym.ar")
	public float field7676;

	@ObfuscatedName("ym.an")
	public float field7677;

	@ObfuscatedName("ym.ap")
	public float field7678;

	@ObfuscatedName("ym.ag")
	public float field7669;

	@ObfuscatedName("ym.as")
	public float field7680;

	@ObfuscatedName("ym.ai")
	public byte[][] field7682;

	@ObfuscatedName("ym.ao")
	public byte[][] field7659;

	public PureJavaFloorModel(PureJavaToolkit arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.field7658 = arg0;
		this.field7681 = arg2;
		this.field7682 = new byte[arg3 + 1][arg4 + 1];
		int var9 = this.field7658.field8012 >> 9;
		for (int var10 = 1; var10 < arg4; var10++) {
			for (int var11 = 1; var11 < arg3; var11++) {
				int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
				int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
				int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
				int var16 = (var13 << 8) / var15;
				int var17 = arg7 * -512 / var15;
				int var18 = (var14 << 8) / var15;
				int var19 = (this.field7658.field8014 * var18 + this.field7658.field8021 * var16 + this.field7658.field8009 * var17 >> 17) + var9;
				int var20 = var19 >> 1;
				if (var20 < 2) {
					var20 = 2;
				} else if (var20 > 126) {
					var20 = 126;
				}
				this.field7682[var11][var10] = (byte) var20;
			}
		}
		this.field7659 = new byte[arg3 + 1][arg4 + 1];
	}

	@ObfuscatedName("ym.LA(III)V")
	public void method192(int arg0, int arg1, int arg2) {
		if (this.field7659[arg0][arg1] < arg2) {
			this.field7659[arg0][arg1] = (byte) arg2;
		}
	}

	@ObfuscatedName("ym.j(II[I[I[I[I[I[I[I[I[I[I[ILdk;Z)V")
	public void method219(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, class137 arg13, boolean arg14) {
		if (this.field7660 == null) {
			this.field7660 = new UnblendedTileData1[this.field387][this.field386];
			this.field7672 = new UnblendedTileData2[this.field387][this.field386];
		} else if (this.field7673 != null || this.field7664 != null) {
			throw new IllegalStateException();
		}
		boolean var16 = false;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			var16 = true;
			for (int var17 = 1; var17 < 2; var17++) {
				int var18 = arg2[arg6[var17]];
				int var19 = arg4[arg6[var17]];
				if (var18 != 0 && this.field385 != var18 || var19 != 0 && this.field385 != var19) {
					var16 = false;
					break;
				}
			}
		}
		if (!var16) {
			UnblendedTileData2 var20 = new UnblendedTileData2();
			short var21 = (short) arg2.length;
			short var22 = (short) arg9.length;
			var20.field922 = var21;
			var20.field924 = new short[var21];
			var20.field921 = new short[var21];
			var20.field920 = new short[var21];
			var20.field923 = new short[var21];
			for (int var23 = 0; var23 < var21; var23++) {
				int var24 = arg2[var23];
				int var25 = arg4[var23];
				if (var24 == 0 && var25 == 0) {
					var20.field924[var23] = (short) (this.field7682[arg0][arg1] - this.field7659[arg0][arg1]);
				} else if (var24 == 0 && this.field385 == var25) {
					var20.field924[var23] = (short) (this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]);
				} else if (this.field385 == var24 && this.field385 == var25) {
					var20.field924[var23] = (short) (this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]);
				} else if (this.field385 == var24 && var25 == 0) {
					var20.field924[var23] = (short) (this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]);
				} else {
					int var26 = (this.field385 - var24) * (this.field7682[arg0][arg1] - this.field7659[arg0][arg1]) + (this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]) * var24;
					int var27 = (this.field385 - var24) * (this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]) + (this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]) * var24;
					var20.field924[var23] = (short) ((this.field385 - var25) * var26 + var25 * var27 >> this.field388 * 2);
				}
				int var28 = (arg0 << this.field388) + var24;
				int var29 = (arg1 << this.field388) + var25;
				var20.field921[var23] = (short) var24;
				var20.field923[var23] = (short) var25;
				var20.field920[var23] = (short) (this.method196(var28, var29) + (arg3 == null ? 0 : arg3[var23]));
				if (var20.field924[var23] < 2) {
					var20.field924[var23] = 2;
				}
			}
			boolean var30 = false;
			int var31 = 0;
			for (int var32 = 0; var32 < var22; var32++) {
				if (arg9[var32] >= 0 || arg10 != null && arg10[var32] >= 0) {
					var31++;
				}
				int var33 = arg11[var32];
				if (var33 != -1) {
					class120 var34 = this.field7658.field400.method889(var33);
					if (!var34.field1250) {
						var30 = true;
						if (this.method12952(var34.field1270) || var34.field1268 != 0 || var34.field1261 != 0) {
							var20.field930 = (byte) (var20.field930 | 0x4);
						}
					}
				}
			}
			var20.field931 = new int[var31];
			if (arg10 != null) {
				var20.field928 = new int[var31];
			}
			var20.field918 = new short[var31];
			var20.field926 = new short[var31];
			var20.field927 = new short[var31];
			if (var30) {
				var20.field919 = new short[var31];
				var20.field929 = new short[var31];
			}
			for (int var35 = 0; var35 < var22; var35++) {
				if (arg9[var35] >= 0 || arg10 != null && arg10[var35] >= 0) {
					if (arg9[var35] >= 0) {
						var20.field931[var20.field925] = class482.method3444(arg9[var35]);
					} else {
						var20.field931[var20.field925] = -1;
					}
					if (arg10 != null) {
						if (arg10[var35] == -1) {
							var20.field928[var20.field925] = -1;
						} else {
							var20.field928[var20.field925] = class482.method3444(arg10[var35]);
						}
					}
					var20.field918[var20.field925] = (short) arg6[var35];
					var20.field926[var20.field925] = (short) arg7[var35];
					var20.field927[var20.field925] = (short) arg8[var35];
					if (var30) {
						if (arg11[var35] == -1 || this.field7658.field400.method889(arg11[var35]).field1250) {
							var20.field919[var20.field925] = -1;
						} else {
							var20.field919[var20.field925] = (short) arg11[var35];
							var20.field929[var20.field925] = (short) arg12[var35];
						}
					}
					var20.field925++;
				}
			}
			this.field7672[arg0][arg1] = var20;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			UnblendedTileData1 var36 = new UnblendedTileData1();
			int var37 = arg9[0];
			int var38 = arg11[0];
			if (arg10 != null) {
				var36.field967 = class482.method2020(class482.method3444(arg10[0]), this.field7682[arg0][arg1] - this.field7659[arg0][arg1]);
				if (var37 == -1) {
					var36.field971 = (byte) (var36.field971 | 0x2);
				}
			}
			if (this.field389[arg0 + 1][arg1] == this.field389[arg0][arg1] && this.field389[arg0 + 1][arg1 + 1] == this.field389[arg0][arg1] && this.field389[arg0][arg1 + 1] == this.field389[arg0][arg1]) {
				var36.field971 = (byte) (var36.field971 | 0x1);
			}
			class120 var39 = null;
			if (var38 != -1) {
				var39 = this.field7658.field400.method889(var38);
			}
			if (var39 == null || (var36.field971 & 0x2) != 0 || var39.field1250) {
				short var40 = class482.method3444(var37);
				var36.field966 = (short) class482.method2020(var40, this.field7682[arg0][arg1] - this.field7659[arg0][arg1]);
				var36.field968 = (short) class482.method2020(var40, this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]);
				var36.field969 = (short) class482.method2020(var40, this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]);
				var36.field970 = (short) class482.method2020(var40, this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]);
				var36.field972 = -1;
			} else {
				var36.field966 = (short) (this.field7682[arg0][arg1] - this.field7659[arg0][arg1]);
				var36.field968 = (short) (this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]);
				var36.field969 = (short) (this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]);
				var36.field970 = (short) (this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]);
				var36.field972 = (short) var38;
				if (this.method12952(var39.field1270) || var39.field1268 != 0 || var39.field1261 != 0) {
					var36.field971 = (byte) (var36.field971 | 0x4);
				}
			}
			this.field7660[arg0][arg1] = var36;
		}
	}

	@ObfuscatedName("ym.u(II[I[I[I[I[I[I[I[ILdk;Z)V")
	public void method193(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, class137 arg10, boolean arg11) {
		boolean var13 = (this.field7681 & 0x20) == 0;
		if (this.field7673 == null && !var13) {
			this.field7673 = new BlendedUntexturedTileData1[this.field387][this.field386];
			this.field7685 = new BlendedUntexturedTileData2[this.field387][this.field386];
		} else if (this.field7664 == null && var13) {
			this.field7664 = new BlendedTexturedTileData[this.field387][this.field386];
		} else if (this.field7660 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (int var14 = 0; var14 < arg6.length; var14++) {
			if (arg6[var14] == -1) {
				arg6[var14] = 0;
			} else {
				arg6[var14] = Statics.field5083[class482.method3444(arg6[var14]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (int var15 = 0; var15 < arg7.length; var15++) {
				if (arg7[var15] == -1) {
					arg7[var15] = 0;
				} else {
					arg7[var15] = Statics.field5083[class482.method3444(arg7[var15]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		if (var13) {
			BlendedTexturedTileData var16 = new BlendedTexturedTileData();
			var16.field974 = (short) arg2.length;
			var16.field980 = (short) (arg2.length / 3);
			var16.field975 = new short[var16.field974];
			var16.field973 = new short[var16.field974];
			var16.field977 = new short[var16.field974];
			var16.field978 = new int[var16.field974];
			var16.field979 = new short[var16.field974];
			var16.field981 = new short[var16.field974];
			var16.field982 = new byte[var16.field974];
			if (arg5 != null) {
				var16.field976 = new short[var16.field974];
			}
			for (int var17 = 0; var17 < var16.field974; var17++) {
				int var18 = arg2[var17];
				int var19 = arg4[var17];
				boolean var20 = false;
				int var21;
				if (var18 == 0 && var19 == 0) {
					var21 = this.field7682[arg0][arg1] - this.field7659[arg0][arg1];
				} else if (var18 == 0 && this.field385 == var19) {
					var21 = this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1];
				} else if (this.field385 == var18 && this.field385 == var19) {
					var21 = this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1];
				} else if (this.field385 == var18 && var19 == 0) {
					var21 = this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1];
				} else {
					int var22 = (this.field385 - var18) * (this.field7682[arg0][arg1] - this.field7659[arg0][arg1]) + (this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]) * var18;
					int var23 = (this.field385 - var18) * (this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]) + (this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]) * var18;
					var21 = (this.field385 - var19) * var22 + var19 * var23 >> this.field388 * 2;
				}
				int var24 = (arg0 << this.field388) + var18;
				int var25 = (arg1 << this.field388) + var19;
				var16.field975[var17] = (short) var18;
				var16.field977[var17] = (short) var19;
				var16.field973[var17] = (short) (this.method196(var24, var25) + (arg3 == null ? 0 : arg3[var17]));
				if (var21 < 0) {
					var21 = 0;
				}
				if (arg6[var17] == 0) {
					var16.field978[var17] = 0;
					if (arg7 != null) {
						var16.field982[var17] = (byte) var21;
					}
				} else {
					int var26 = 0;
					if (arg5 != null) {
						short var27 = var16.field976[var17] = (short) arg5[var17];
						if (arg10.field1471 != 0) {
							var26 = var27 * 255 / arg10.field1471;
							if (var26 < 0) {
								var26 = 0;
							} else if (var26 > 255) {
								var26 = 255;
							}
						}
					}
					int var28 = -16777216;
					if (arg8[var17] != -1 && this.method12952(this.field7658.field400.method889(arg8[var17]).field1270)) {
						var28 = -1694498816;
					}
					var16.field978[var17] = var28 | class482.method8590(method12948(arg6[var17] >> 8, var21), arg10.field1475, var26);
					if (arg7 != null) {
						var16.field982[var17] = (byte) var21;
					}
				}
				var16.field979[var17] = (short) arg8[var17];
				var16.field981[var17] = (short) arg9[var17];
			}
			if (arg7 != null) {
				var16.field983 = new int[var16.field980];
			}
			for (int var29 = 0; var29 < var16.field980; var29++) {
				int var30 = var29 * 3;
				if (arg7 != null && arg7[var30] != 0) {
					var16.field983[var29] = arg7[var30] >> 8 | 0xFF000000;
				}
			}
			this.field7664[arg0][arg1] = var16;
			return;
		}
		boolean var31 = true;
		int var32 = -1;
		int var33 = -1;
		int var34 = -1;
		int var35 = -1;
		if (arg2.length == 6) {
			for (int var36 = 0; var36 < 6; var36++) {
				if (arg2[var36] == 0 && arg4[var36] == 0) {
					if (var32 != -1 && arg6[var32] != arg6[var36]) {
						var31 = false;
						break;
					}
					var32 = var36;
				} else if (this.field385 == arg2[var36] && arg4[var36] == 0) {
					if (var33 != -1 && arg6[var33] != arg6[var36]) {
						var31 = false;
						break;
					}
					var33 = var36;
				} else if (this.field385 == arg2[var36] && this.field385 == arg4[var36]) {
					if (var34 != -1 && arg6[var34] != arg6[var36]) {
						var31 = false;
						break;
					}
					var34 = var36;
				} else if (arg2[var36] == 0 && this.field385 == arg4[var36]) {
					if (var35 != -1 && arg6[var35] != arg6[var36]) {
						var31 = false;
						break;
					}
					var35 = var36;
				}
			}
			if (var32 == -1 || var33 == -1 || var34 == -1 || var35 == -1) {
				var31 = false;
			}
			if (var31) {
				if (arg3 != null) {
					for (int var37 = 0; var37 < 4; var37++) {
						if (arg3[var37] != 0) {
							var31 = false;
							break;
						}
					}
				}
				if (var31) {
					for (int var38 = 1; var38 < 4; var38++) {
						if (arg2[var38] != arg2[0] && this.field385 + arg2[0] != arg2[var38] && arg2[0] - this.field385 != arg2[var38]) {
							var31 = false;
							break;
						}
						if (arg4[var38] != arg4[0] && this.field385 + arg4[0] != arg4[var38] && arg4[0] - this.field385 != arg4[var38]) {
							var31 = false;
							break;
						}
					}
				}
			}
		} else {
			var31 = false;
		}
		if (!var31) {
			BlendedUntexturedTileData2 var50 = new BlendedUntexturedTileData2();
			var50.field955 = (short) arg2.length;
			var50.field961 = (short) (arg2.length / 3);
			var50.field958 = new short[var50.field955];
			var50.field959 = new short[var50.field955];
			var50.field960 = new short[var50.field955];
			var50.field962 = new int[var50.field955];
			if (arg5 != null) {
				var50.field965 = new short[var50.field955];
			}
			for (int var51 = 0; var51 < var50.field955; var51++) {
				int var52 = arg2[var51];
				int var53 = arg4[var51];
				boolean var54 = false;
				int var55;
				if (var52 == 0 && var53 == 0) {
					var55 = this.field7682[arg0][arg1] - this.field7659[arg0][arg1];
				} else if (var52 == 0 && this.field385 == var53) {
					var55 = this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1];
				} else if (this.field385 == var52 && this.field385 == var53) {
					var55 = this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1];
				} else if (this.field385 == var52 && var53 == 0) {
					var55 = this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1];
				} else {
					int var56 = (this.field385 - var52) * (this.field7682[arg0][arg1] - this.field7659[arg0][arg1]) + (this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]) * var52;
					int var57 = (this.field385 - var52) * (this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]) + (this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]) * var52;
					var55 = (this.field385 - var53) * var56 + var53 * var57 >> this.field388 * 2;
				}
				int var58 = (arg0 << this.field388) + var52;
				int var59 = (arg1 << this.field388) + var53;
				var50.field958[var51] = (short) var52;
				var50.field960[var51] = (short) var53;
				var50.field959[var51] = (short) (this.method196(var58, var59) + (arg3 == null ? 0 : arg3[var51]));
				if (var55 < 0) {
					var55 = 0;
				}
				if (arg6[var51] != 0) {
					int var60 = 0;
					if (arg5 != null) {
						short var61 = var50.field965[var51] = (short) arg5[var51];
						if (arg10.field1471 != 0) {
							var60 = var61 * 255 / arg10.field1471;
							if (var60 < 0) {
								var60 = 0;
							} else if (var60 > 255) {
								var60 = 255;
							}
						}
					}
					var50.field962[var51] = class482.method8590(method12948(arg6[var51] >> 8, var55), arg10.field1475, var60);
					if (arg7 != null) {
						var50.field962[var51] |= var55 << 25;
					}
				} else if (arg7 == null) {
					var50.field962[var51] = 0;
				} else {
					var50.field962[var51] = var55 << 25;
				}
			}
			boolean var62 = false;
			for (int var63 = 0; var63 < var50.field961; var63++) {
				if (arg8[var63 * 3] != -1 && !this.field7658.field400.method889(arg8[var63 * 3]).field1250) {
					var62 = true;
				}
			}
			if (arg7 != null) {
				var50.field964 = new int[var50.field961];
			}
			if (var62) {
				var50.field963 = new short[var50.field961];
				var50.field956 = new short[var50.field961];
			}
			for (int var64 = 0; var64 < var50.field961; var64++) {
				int var65 = var64 * 3;
				if (arg7 != null && arg7[var65] != 0) {
					var50.field964[var64] = arg7[var65] >> 8;
				}
				if (var62) {
					int var66 = var65 + 1;
					int var67 = var66 + 1;
					boolean var68 = false;
					boolean var69 = true;
					int var70 = arg8[var65];
					if (var70 == -1 || this.field7658.field400.method889(var70).field1250) {
						var69 = false;
					} else {
						var68 = true;
					}
					int var71 = arg8[var66];
					if (var71 == -1 || this.field7658.field400.method889(var71).field1250) {
						var69 = false;
					} else {
						var68 = true;
					}
					int var72 = arg8[var67];
					if (var72 == -1 || this.field7658.field400.method889(var72).field1250) {
						var69 = false;
					} else {
						var68 = true;
					}
					if (var69) {
						var50.field963[var64] = (short) var72;
						var50.field956[var64] = (short) arg9[var65];
					} else {
						if (var68) {
							int var73 = arg8[var65];
							if (var73 != -1 && !this.field7658.field400.method889(var73).field1250) {
								var50.field962[var65] = Statics.field5083[class482.method3444(this.field7658.field400.method889(var73).field1260 & 0xFFFF) & 0xFFFF];
							}
							int var74 = arg8[var66];
							if (var74 != -1 && !this.field7658.field400.method889(var74).field1250) {
								var50.field962[var66] = Statics.field5083[class482.method3444(this.field7658.field400.method889(var74).field1260 & 0xFFFF) & 0xFFFF];
							}
							int var75 = arg8[var67];
							if (var75 != -1 && !this.field7658.field400.method889(var75).field1250) {
								var50.field962[var67] = Statics.field5083[class482.method3444(this.field7658.field400.method889(var75).field1260 & 0xFFFF) & 0xFFFF];
							}
						}
						var50.field963[var64] = -1;
					}
				}
			}
			this.field7685[arg0][arg1] = var50;
			return;
		}
		BlendedUntexturedTileData1 var39 = new BlendedUntexturedTileData1();
		int var40 = arg6[0];
		int var41 = arg8[0];
		if (arg7 != null) {
			var39.field953 = arg7[0] >> 8;
			if (var40 == 0) {
				var39.field944 = (byte) (var39.field944 | 0x2);
			}
		} else if (var40 == 0) {
			return;
		}
		if (this.field389[arg0 + 1][arg1] == this.field389[arg0][arg1] && this.field389[arg0 + 1][arg1 + 1] == this.field389[arg0][arg1] && this.field389[arg0][arg1 + 1] == this.field389[arg0][arg1]) {
			var39.field944 = (byte) (var39.field944 | 0x1);
		}
		if (var41 == -1 || (var39.field944 & 0x2) != 0 || this.field7658.field400.method889(var41).field1250) {
			int var46;
			if (arg5 == null || arg10.field1471 == 0) {
				var46 = 0;
			} else {
				var46 = arg5[var32] * 255 / arg10.field1471;
				if (var46 < 0) {
					var46 = 0;
				} else if (var46 > 255) {
					var46 = 255;
				}
			}
			var39.field945 = class482.method8590(method12948(arg6[var32] >> 8, this.field7682[arg0][arg1] - this.field7659[arg0][arg1]), arg10.field1475, var46);
			if (var39.field953 != 0) {
				var39.field945 |= 255 - (this.field7682[arg0][arg1] - this.field7659[arg0][arg1]) << 25;
			}
			int var47;
			if (arg5 == null || arg10.field1471 == 0) {
				var47 = 0;
			} else {
				var47 = arg5[var33] * 255 / arg10.field1471;
				if (var47 < 0) {
					var47 = 0;
				} else if (var47 > 255) {
					var47 = 255;
				}
			}
			var39.field946 = class482.method8590(method12948(arg6[var33] >> 8, this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]), arg10.field1475, var47);
			if (var39.field953 != 0) {
				var39.field946 |= 255 - (this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]) << 25;
			}
			int var48;
			if (arg5 == null || arg10.field1471 == 0) {
				var48 = 0;
			} else {
				var48 = arg5[var34] * 255 / arg10.field1471;
				if (var48 < 0) {
					var48 = 0;
				} else if (var48 > 255) {
					var48 = 255;
				}
			}
			var39.field947 = class482.method8590(method12948(arg6[var34] >> 8, this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]), arg10.field1475, var48);
			if (var39.field953 != 0) {
				var39.field947 |= 255 - (this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]) << 25;
			}
			int var49;
			if (arg5 == null || arg10.field1471 == 0) {
				var49 = 0;
			} else {
				var49 = arg5[var35] * 255 / arg10.field1471;
				if (var49 < 0) {
					var49 = 0;
				} else if (var49 > 255) {
					var49 = 255;
				}
			}
			var39.field951 = class482.method8590(method12948(arg6[var35] >> 8, this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]), arg10.field1475, var49);
			if (var39.field953 != 0) {
				var39.field951 |= 255 - (this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]) << 25;
			}
			var39.field954 = -1;
		} else {
			int var42;
			if (arg5 == null || arg10.field1471 == 0) {
				var42 = 0;
			} else {
				var42 = arg5[var32] * 255 / arg10.field1471;
				if (var42 < 0) {
					var42 = 0;
				} else if (var42 > 255) {
					var42 = 255;
				}
			}
			var39.field945 = class482.method8590(method12948(arg6[var32] >> 8, this.field7682[arg0][arg1] - this.field7659[arg0][arg1]), arg10.field1475, var42);
			if (var39.field953 != 0) {
				var39.field945 |= 255 - (this.field7682[arg0][arg1] - this.field7659[arg0][arg1]) << 25;
			}
			int var43;
			if (arg5 == null || arg10.field1471 == 0) {
				var43 = 0;
			} else {
				var43 = arg5[var33] * 255 / arg10.field1471;
				if (var43 < 0) {
					var43 = 0;
				} else if (var43 > 255) {
					var43 = 255;
				}
			}
			var39.field946 = class482.method8590(method12948(arg6[var33] >> 8, this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]), arg10.field1475, var43);
			if (var39.field953 != 0) {
				var39.field946 |= 255 - (this.field7682[arg0 + 1][arg1] - this.field7659[arg0 + 1][arg1]) << 25;
			}
			int var44;
			if (arg5 == null || arg10.field1471 == 0) {
				var44 = 0;
			} else {
				var44 = arg5[var34] * 255 / arg10.field1471;
				if (var44 < 0) {
					var44 = 0;
				} else if (var44 > 255) {
					var44 = 255;
				}
			}
			var39.field947 = class482.method8590(method12948(arg6[var34] >> 8, this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]), arg10.field1475, var44);
			if (var39.field953 != 0) {
				var39.field947 |= 255 - (this.field7682[arg0 + 1][arg1 + 1] - this.field7659[arg0 + 1][arg1 + 1]) << 25;
			}
			int var45;
			if (arg5 == null || arg10.field1471 == 0) {
				var45 = 0;
			} else {
				var45 = arg5[var35] * 255 / arg10.field1471;
				if (var45 < 0) {
					var45 = 0;
				} else if (var45 > 255) {
					var45 = 255;
				}
			}
			var39.field951 = class482.method8590(method12948(arg6[var35] >> 8, this.field7682[arg0][arg1 + 1] - this.field7659[arg0][arg1 + 1]), arg10.field1475, var45);
			var39.field954 = (short) var41;
		}
		if (arg5 != null) {
			var39.field950 = (short) arg5[var34];
			var39.field952 = (short) arg5[var35];
			var39.field948 = (short) arg5[var33];
			var39.field949 = (short) arg5[var32];
		}
		this.field7673[arg0][arg1] = var39;
	}

	@ObfuscatedName("ym.t(II)I")
	public static int method12948(int arg0, int arg1) {
		int var2 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 253) {
			var2 = 253;
		}
		int var3 = (arg0 & 0xFF00) * arg1 >> 15;
		if (var3 < 2) {
			var3 = 2;
		} else if (var3 > 253) {
			var3 = 253;
		}
		int var4 = (arg0 & 0xFF) * arg1 >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 253) {
			var4 = 253;
		}
		return var2 << 16 | var3 << 8 | var4;
	}

	@ObfuscatedName("ym.SA()V")
	public void method195() {
		this.field7682 = null;
		this.field7659 = null;
	}

	@ObfuscatedName("ym.a(III[[ZZI)V")
	public void method212(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
		if (this.field7658.field8001 == null || this.field7658.field8023 == null) {
			throw new IllegalStateException("");
		}
		Matrix4x4 var7 = this.field7658.field8018;
		this.field7665 = var7.field3480[0];
		this.field7666 = var7.field3480[1];
		this.field7667 = var7.field3480[2];
		this.field7668 = var7.field3480[3];
		this.field7654 = var7.field3480[4];
		this.field7670 = var7.field3480[5];
		this.field7663 = var7.field3480[6];
		this.field7653 = var7.field3480[7];
		this.field7656 = var7.field3480[8];
		this.field7674 = var7.field3480[9];
		this.field7675 = var7.field3480[10];
		this.field7676 = var7.field3480[11];
		this.field7677 = var7.field3480[12];
		this.field7678 = var7.field3480[13];
		this.field7669 = var7.field3480[14];
		this.field7680 = var7.field3480[15];
		for (int var8 = 0; var8 < arg2 + arg2; var8++) {
			for (int var9 = 0; var9 < arg2 + arg2; var9++) {
				if (arg3[var8][var9]) {
					int var10 = arg0 - arg2 + var8;
					int var11 = arg1 - arg2 + var9;
					if (var10 >= 0 && var10 < this.field387 && var11 >= 0 && var11 < this.field386) {
						this.method12949(var10, var11, arg5);
					}
				}
			}
		}
	}

	@ObfuscatedName("ym.x(III)V")
	public void method12949(int arg0, int arg1, int arg2) {
		class66 var4 = this.field7658.method13206(Thread.currentThread());
		var4.field868.field987 = 0;
		if (this.field7673 != null) {
			this.method12950(arg0, arg1, var4.field871, var4, var4.field868, var4.field903, var4.field904, var4.field905, var4.field863, var4.field907, arg2);
		} else if (this.field7660 != null) {
			this.method12972(arg0, arg1, var4.field868, var4.field903, var4.field904, var4.field905, var4.field863, var4.field907, arg2);
		} else if (this.field7664 != null) {
			this.method12951(arg0, arg1, var4.field871, var4, var4.field868, var4.field903, var4.field904, var4.field905, var4.field863, var4.field907, arg2);
		}
	}

	@ObfuscatedName("ym.y(IILbv;[F[F[F[F[FI)V")
	public void method12972(int arg0, int arg1, class77 arg2, float[] arg3, float[] arg4, float[] arg5, float[] arg6, float[] arg7, int arg8) {
		UnblendedTileData1 var10 = this.field7660[arg0][arg1];
		if (var10 == null) {
			UnblendedTileData2 var64 = this.field7672[arg0][arg1];
			if (var64 != null) {
				if (arg8 != 0) {
					if ((var64.field930 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				for (int var65 = 0; var65 < var64.field922; var65++) {
					int var66 = (arg0 << this.field388) + var64.field921[var65];
					short var67 = var64.field920[var65];
					int var68 = (arg1 << this.field388) + var64.field923[var65];
					float var69 = (float) var68 * this.field7675 + (float) var66 * this.field7667 + (float) var67 * this.field7663 + this.field7669;
					float var70 = (float) var68 * this.field7676 + (float) var66 * this.field7668 + (float) var67 * this.field7653 + this.field7680;
					if (var69 < -var70) {
						return;
					}
					float var71 = (float) var68 * this.field7656 + (float) var66 * this.field7665 + (float) var67 * this.field7654 + this.field7677;
					float var72 = (float) var68 * this.field7674 + (float) var66 * this.field7666 + (float) var67 * this.field7670 + this.field7678;
					arg3[var65] = arg2.field992 * var71 / var70 + arg2.field991;
					arg4[var65] = arg2.field990 * var72 / var70 + arg2.field1015;
					arg5[var65] = arg2.field996 * var69 / var70 + arg2.field995;
					arg6[var65] = var70;
				}
				if (var64.field919 == null) {
					for (int var85 = 0; var85 < var64.field925; var85++) {
						short var86 = var64.field918[var85];
						short var87 = var64.field926[var85];
						short var88 = var64.field927[var85];
						float var89 = arg3[var86];
						float var90 = arg3[var87];
						float var91 = arg3[var88];
						float var92 = arg4[var86];
						float var93 = arg4[var87];
						float var94 = arg4[var88];
						if ((var89 - var90) * (var94 - var93) - (var91 - var90) * (var92 - var93) > 0.0F) {
							int var95 = var64.field931[var85];
							if (var95 != -1) {
								arg2.field988 = var89 < 0.0F || var90 < 0.0F || var91 < 0.0F || var89 > (float) (arg2.field1010 * 859149921) || var90 > (float) (arg2.field1010 * 859149921) || var91 > (float) (arg2.field1010 * 859149921);
								arg2.method1987(true, true, false, var92, var93, var94, var89, var90, var91, arg5[var86], arg5[var87], arg5[var88], (float) class482.method2020(var95, var64.field924[var86]), (float) class482.method2020(var95, var64.field924[var87]), (float) class482.method2020(var95, var64.field924[var88]));
							}
						}
					}
				} else {
					for (int var73 = 0; var73 < var64.field925; var73++) {
						short var74 = var64.field918[var73];
						short var75 = var64.field926[var73];
						short var76 = var64.field927[var73];
						float var77 = arg3[var74];
						float var78 = arg3[var75];
						float var79 = arg3[var76];
						float var80 = arg4[var74];
						float var81 = arg4[var75];
						float var82 = arg4[var76];
						if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0.0F) {
							arg2.field988 = var77 < 0.0F || var78 < 0.0F || var79 < 0.0F || var77 > (float) (arg2.field1010 * 859149921) || var78 > (float) (arg2.field1010 * 859149921) || var79 > (float) (arg2.field1010 * 859149921);
							short var83 = var64.field919[var73];
							if (var83 == -1) {
								int var84 = var64.field931[var73];
								if (var84 != -1) {
									arg2.method1987(true, true, false, var80, var81, var82, var77, var78, var79, arg5[var74], arg5[var75], arg5[var76], (float) class482.method2020(var84, var64.field924[var74]), (float) class482.method2020(var84, var64.field924[var75]), (float) class482.method2020(var84, var64.field924[var76]));
								}
							} else {
								arg2.method2015(true, true, false, var80, var81, var82, var77, var78, var79, arg5[var74], arg5[var75], arg5[var76], arg6[var74], arg6[var75], arg6[var76], (float) var64.field921[var74] / (float) this.field385, (float) var64.field921[var75] / (float) this.field385, (float) var64.field921[var76] / (float) this.field385, (float) var64.field923[var74] / (float) this.field385, (float) var64.field923[var75] / (float) this.field385, (float) var64.field923[var76] / (float) this.field385, Statics.field5083[var64.field924[var74] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field5083[var64.field924[var75] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field5083[var64.field924[var76] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var83);
							}
						}
					}
				}
			}
		} else if ((var10.field971 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((var10.field971 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			int var11 = this.field385 * arg0;
			int var12 = this.field385 + var11;
			int var13 = this.field385 * arg1;
			int var14 = this.field385 + var13;
			float var19;
			float var21;
			float var23;
			float var25;
			float var29;
			float var31;
			float var32;
			float var34;
			float var36;
			float var37;
			float var39;
			float var41;
			float var42;
			float var44;
			float var46;
			float var47;
			if ((var10.field971 & 0x1) == 0) {
				int var48 = this.field389[arg0][arg1];
				int var49 = this.field389[arg0 + 1][arg1];
				int var50 = this.field389[arg0 + 1][arg1 + 1];
				int var51 = this.field389[arg0][arg1 + 1];
				float var52 = (float) var13 * this.field7675 + (float) var11 * this.field7667 + (float) var48 * this.field7663 + this.field7669;
				var19 = (float) var13 * this.field7676 + (float) var11 * this.field7668 + (float) var48 * this.field7653 + this.field7680;
				if (var52 < -var19) {
					return;
				}
				float var53 = (float) var13 * this.field7675 + (float) var12 * this.field7667 + (float) var49 * this.field7663 + this.field7669;
				var21 = (float) var13 * this.field7676 + (float) var12 * this.field7668 + (float) var49 * this.field7653 + this.field7680;
				if (var53 < -var21) {
					return;
				}
				float var54 = (float) var14 * this.field7675 + (float) var12 * this.field7667 + (float) var50 * this.field7663 + this.field7669;
				var23 = (float) var14 * this.field7676 + (float) var12 * this.field7668 + (float) var50 * this.field7653 + this.field7680;
				if (var54 < -var23) {
					return;
				}
				float var55 = (float) var14 * this.field7675 + (float) var11 * this.field7667 + (float) var51 * this.field7663 + this.field7669;
				var25 = (float) var14 * this.field7676 + (float) var11 * this.field7668 + (float) var51 * this.field7653 + this.field7680;
				if (var55 < -var25) {
					return;
				}
				float var56 = (float) var13 * this.field7656 + (float) var11 * this.field7665 + (float) var48 * this.field7654 + this.field7677;
				var29 = arg2.field992 * var56 / var19 + arg2.field991;
				float var57 = (float) var13 * this.field7674 + (float) var11 * this.field7666 + (float) var48 * this.field7670 + this.field7678;
				var31 = arg2.field990 * var57 / var19 + arg2.field1015;
				var32 = arg2.field996 * var52 / var19 + arg2.field995;
				float var58 = (float) var13 * this.field7656 + (float) var12 * this.field7665 + (float) var49 * this.field7654 + this.field7677;
				var34 = arg2.field992 * var58 / var21 + arg2.field991;
				float var59 = (float) var13 * this.field7674 + (float) var12 * this.field7666 + (float) var49 * this.field7670 + this.field7678;
				var36 = arg2.field990 * var59 / var21 + arg2.field1015;
				var37 = arg2.field996 * var53 / var21 + arg2.field995;
				float var60 = (float) var14 * this.field7656 + (float) var12 * this.field7665 + (float) var50 * this.field7654 + this.field7677;
				var39 = arg2.field992 * var60 / var23 + arg2.field991;
				float var61 = (float) var14 * this.field7674 + (float) var12 * this.field7666 + (float) var50 * this.field7670 + this.field7678;
				var41 = arg2.field990 * var61 / var23 + arg2.field1015;
				var42 = arg2.field996 * var54 / var23 + arg2.field995;
				float var62 = (float) var14 * this.field7656 + (float) var11 * this.field7665 + (float) var51 * this.field7654 + this.field7677;
				var44 = arg2.field992 * var62 / var25 + arg2.field991;
				float var63 = (float) var14 * this.field7674 + (float) var11 * this.field7666 + (float) var51 * this.field7670 + this.field7678;
				var46 = arg2.field990 * var63 / var25 + arg2.field1015;
				var47 = arg2.field996 * var55 / var25 + arg2.field995;
			} else {
				int var15 = this.field389[arg0][arg1];
				float var16 = (float) var15 * this.field7663;
				float var17 = (float) var15 * this.field7653;
				float var18 = (float) var13 * this.field7675 + (float) var11 * this.field7667 + var16 + this.field7669;
				var19 = (float) var13 * this.field7676 + (float) var11 * this.field7668 + var17 + this.field7680;
				if (var18 < -var19) {
					return;
				}
				float var20 = (float) var13 * this.field7675 + (float) var12 * this.field7667 + var16 + this.field7669;
				var21 = (float) var13 * this.field7676 + (float) var12 * this.field7668 + var17 + this.field7680;
				if (var20 < -var21) {
					return;
				}
				float var22 = (float) var14 * this.field7675 + (float) var12 * this.field7667 + var16 + this.field7669;
				var23 = (float) var14 * this.field7676 + (float) var12 * this.field7668 + var17 + this.field7680;
				if (var22 < -var23) {
					return;
				}
				float var24 = (float) var14 * this.field7675 + (float) var11 * this.field7667 + var16 + this.field7669;
				var25 = (float) var14 * this.field7676 + (float) var11 * this.field7668 + var17 + this.field7680;
				if (var24 < -var25) {
					return;
				}
				float var26 = (float) var15 * this.field7654;
				float var27 = (float) var15 * this.field7670;
				float var28 = (float) var13 * this.field7656 + (float) var11 * this.field7665 + var26 + this.field7677;
				var29 = arg2.field992 * var28 / var19 + arg2.field991;
				float var30 = (float) var13 * this.field7674 + (float) var11 * this.field7666 + var27 + this.field7678;
				var31 = arg2.field990 * var30 / var19 + arg2.field1015;
				var32 = arg2.field996 * var18 / var19 + arg2.field995;
				float var33 = (float) var13 * this.field7656 + (float) var12 * this.field7665 + var26 + this.field7677;
				var34 = arg2.field992 * var33 / var21 + arg2.field991;
				float var35 = (float) var13 * this.field7674 + (float) var12 * this.field7666 + var27 + this.field7678;
				var36 = arg2.field990 * var35 / var21 + arg2.field1015;
				var37 = arg2.field996 * var20 / var21 + arg2.field995;
				float var38 = (float) var14 * this.field7656 + (float) var12 * this.field7665 + var26 + this.field7677;
				var39 = arg2.field992 * var38 / var23 + arg2.field991;
				float var40 = (float) var14 * this.field7674 + (float) var12 * this.field7666 + var27 + this.field7678;
				var41 = arg2.field990 * var40 / var23 + arg2.field1015;
				var42 = arg2.field996 * var22 / var23 + arg2.field995;
				float var43 = (float) var14 * this.field7656 + (float) var11 * this.field7665 + var26 + this.field7677;
				var44 = arg2.field992 * var43 / var25 + arg2.field991;
				float var45 = (float) var14 * this.field7674 + (float) var11 * this.field7666 + var27 + this.field7678;
				var46 = arg2.field990 * var45 / var25 + arg2.field1015;
				var47 = arg2.field996 * var24 / var25 + arg2.field995;
			}
			if ((var36 - var46) * (var39 - var44) - (var34 - var44) * (var41 - var46) > 0.0F) {
				arg2.field988 = var39 < 0.0F || var44 < 0.0F || var34 < 0.0F || var39 > (float) (arg2.field1010 * 859149921) || var44 > (float) (arg2.field1010 * 859149921) || var34 > (float) (arg2.field1010 * 859149921);
				if (var10.field972 >= 0) {
					arg2.method2015(true, true, false, var41, var46, var36, var39, var44, var34, var42, var47, var37, var23, var25, var21, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Statics.field5083[var10.field969 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field5083[var10.field970 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field5083[var10.field968 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var10.field972);
				} else {
					arg2.method1987(true, true, false, var41, var46, var36, var39, var44, var34, var42, var47, var37, (float) (var10.field969 & 0xFFFF), (float) (var10.field970 & 0xFFFF), (float) (var10.field968 & 0xFFFF));
				}
			}
			if ((var29 - var34) * (var46 - var36) - (var31 - var36) * (var44 - var34) > 0.0F) {
				arg2.field988 = var29 < 0.0F || var34 < 0.0F || var44 < 0.0F || var29 > (float) (arg2.field1010 * 859149921) || var34 > (float) (arg2.field1010 * 859149921) || var44 > (float) (arg2.field1010 * 859149921);
				if (var10.field972 >= 0) {
					arg2.method2015(true, true, false, var31, var36, var46, var29, var34, var44, var32, var37, var47, var19, var21, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Statics.field5083[var10.field966 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field5083[var10.field968 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Statics.field5083[var10.field970 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, var10.field972);
				} else {
					arg2.method1987(true, true, false, var31, var36, var46, var29, var34, var44, var32, var37, var47, (float) (var10.field966 & 0xFFFF), (float) (var10.field968 & 0xFFFF), (float) (var10.field970 & 0xFFFF));
				}
			}
		}
	}

	@ObfuscatedName("ym.ad(IIZLak;Lbv;[F[F[F[F[FI)V")
	public void method12950(int arg0, int arg1, boolean arg2, class66 arg3, class77 arg4, float[] arg5, float[] arg6, float[] arg7, float[] arg8, float[] arg9, int arg10) {
		BlendedUntexturedTileData1 var12 = this.field7673[arg0][arg1];
		if (var12 == null) {
			BlendedUntexturedTileData2 var97 = this.field7685[arg0][arg1];
			if (var97 != null) {
				if (arg10 != 0) {
					if ((var97.field957 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				for (int var98 = 0; var98 < var97.field955; var98++) {
					int var99 = (arg0 << this.field388) + var97.field958[var98];
					int var100 = var97.field959[var98];
					int var101 = (arg1 << this.field388) + var97.field960[var98];
					float var102 = (float) var101 * this.field7675 + (float) var99 * this.field7667 + (float) var100 * this.field7663 + this.field7669;
					float var103 = (float) var101 * this.field7676 + (float) var99 * this.field7668 + (float) var100 * this.field7653 + this.field7680;
					if (var102 < -var103) {
						return;
					}
					float var104 = arg4.field996 * var102 / var103 + arg4.field995;
					arg9[var98] = 0.0F;
					if (arg2) {
						float var105 = var102 - arg3.field867;
						if (var105 > 0.0F) {
							float var106 = var105 / arg3.field864;
							if (var106 > 1.0F) {
								var106 = 1.0F;
							}
							arg9[var98] = var106;
							int var107 = (int) ((float) var97.field965[var98] * var106);
							if (var107 > 0) {
								var100 -= var107;
							}
						}
					} else if (arg3.field866) {
						float var108 = var102 - arg3.field867;
						if (var108 > 0.0F) {
							arg9[var98] = var108 / arg3.field864;
							if (arg9[var98] > 1.0F) {
								arg9[var98] = 1.0F;
							}
						}
					}
					float var109 = (float) var101 * this.field7656 + (float) var99 * this.field7665 + (float) var100 * this.field7654 + this.field7677;
					float var110 = (float) var101 * this.field7674 + (float) var99 * this.field7666 + (float) var100 * this.field7670 + this.field7678;
					arg5[var98] = arg4.field992 * var109 / var103 + arg4.field991;
					arg6[var98] = arg4.field990 * var110 / var103 + arg4.field1015;
					arg7[var98] = var104;
					arg8[var98] = var103;
				}
				if (var97.field963 == null) {
					for (int var125 = 0; var125 < var97.field961; var125++) {
						int var126 = var125 * 3;
						int var127 = var126 + 1;
						int var128 = var127 + 1;
						float var129 = arg5[var126];
						float var130 = arg5[var127];
						float var131 = arg5[var128];
						float var132 = arg6[var126];
						float var133 = arg6[var127];
						float var134 = arg6[var128];
						float var135 = arg9[var126] + arg9[var127] + arg9[var128];
						if ((var129 - var130) * (var134 - var133) - (var131 - var130) * (var132 - var133) > 0.0F) {
							arg4.field988 = var129 < 0.0F || var130 < 0.0F || var131 < 0.0F || var129 > (float) (arg4.field1010 * 859149921) || var130 > (float) (arg4.field1010 * 859149921) || var131 > (float) (arg4.field1010 * 859149921);
							if (var135 >= 3.0F) {
								arg4.method1991(true, true, false, var132, var133, var134, var129, var130, var131, arg7[var126], arg7[var127], arg7[var128], arg3.field869);
							} else if (var135 > 0.0F) {
								if ((var97.field962[var126] & 0xFFFFFF) != 0) {
									arg4.method1989(true, true, false, var132, var133, var134, var129, var130, var131, arg7[var126], arg7[var127], arg7[var128], class482.method15824(var97.field962[var126], arg3.field869, arg9[var126] * 255.0F), class482.method15824(var97.field962[var127], arg3.field869, arg9[var127] * 255.0F), class482.method15824(var97.field962[var128], arg3.field869, arg9[var128] * 255.0F));
								}
							} else if ((var97.field962[var126] & 0xFFFFFF) != 0) {
								arg4.method1989(true, true, false, var132, var133, var134, var129, var130, var131, arg7[var126], arg7[var127], arg7[var128], var97.field962[var126], var97.field962[var127], var97.field962[var128]);
							}
						}
					}
				} else {
					for (int var111 = 0; var111 < var97.field961; var111++) {
						int var112 = var111 * 3;
						int var113 = var112 + 1;
						int var114 = var113 + 1;
						float var115 = arg5[var112];
						float var116 = arg5[var113];
						float var117 = arg5[var114];
						float var118 = arg6[var112];
						float var119 = arg6[var113];
						float var120 = arg6[var114];
						float var121 = arg9[var112] + arg9[var113] + arg9[var114];
						if ((var115 - var116) * (var120 - var119) - (var117 - var116) * (var118 - var119) > 0.0F) {
							arg4.field988 = var115 < 0.0F || var116 < 0.0F || var117 < 0.0F || var115 > (float) (arg4.field1010 * 859149921) || var116 > (float) (arg4.field1010 * 859149921) || var117 > (float) (arg4.field1010 * 859149921);
							short var122 = var97.field963[var111];
							if (var121 >= 3.0F) {
								arg4.method1991(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], arg3.field869);
							} else if (var121 > 0.0F) {
								if (var122 != -1) {
									int var123 = -16777216;
									if (var122 != -1 && this.method12952(this.field7658.field400.method889(var122).field1270)) {
										var123 = -1694498816;
									}
									arg4.method2015(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], arg8[var112], arg8[var113], arg8[var114], (float) var97.field958[var112] / (float) this.field385, (float) var97.field958[var113] / (float) this.field385, (float) var97.field958[var114] / (float) this.field385, (float) var97.field960[var112] / (float) this.field385, (float) var97.field960[var113] / (float) this.field385, (float) var97.field960[var114] / (float) this.field385, var123 | var97.field962[var112] & 0xFFFFFF, var123 | var97.field962[var113] & 0xFFFFFF, var123 | var97.field962[var114] & 0xFFFFFF, arg3.field869, arg9[var112] * 255.0F, arg9[var113] * 255.0F, arg9[var114] * 255.0F, var122);
								} else if ((var97.field962[var112] & 0xFFFFFF) != 0) {
									if (var122 != -1 && this.method12952(this.field7658.field400.method889(var122).field1270)) {
										arg4.field987 = -1694498816;
									}
									arg4.method1989(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], class482.method1378(var97.field962[var112], (int) (arg9[var112] * 255.0F) << 24 | arg3.field869), class482.method1378(var97.field962[var113], (int) (arg9[var113] * 255.0F) << 24 | arg3.field869), class482.method1378(var97.field962[var114], (int) (arg9[var114] * 255.0F) << 24 | arg3.field869));
									arg4.field987 = 0;
								}
							} else if (var122 != -1) {
								int var124 = -16777216;
								if (var122 != -1 && this.method12952(this.field7658.field400.method889(var122).field1270)) {
									var124 = -1694498816;
								}
								arg4.method2015(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], arg8[var112], arg8[var113], arg8[var114], (float) var97.field958[var112] / (float) this.field385, (float) var97.field958[var113] / (float) this.field385, (float) var97.field958[var114] / (float) this.field385, (float) var97.field960[var112] / (float) this.field385, (float) var97.field960[var113] / (float) this.field385, (float) var97.field960[var114] / (float) this.field385, var124 | var97.field962[var112] & 0xFFFFFF, var124 | var97.field962[var113] & 0xFFFFFF, var124 | var97.field962[var114] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var122);
							} else if ((var97.field962[var112] & 0xFFFFFF) != 0) {
								if (var122 != -1 && this.method12952(this.field7658.field400.method889(var122).field1270)) {
									arg4.field987 = -1694498816;
								}
								arg4.method1989(true, true, false, var118, var119, var120, var115, var116, var117, arg7[var112], arg7[var113], arg7[var114], var97.field962[var112], var97.field962[var113], var97.field962[var114]);
								arg4.field987 = 0;
							}
						}
					}
				}
			}
		} else if ((var12.field944 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((var12.field944 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			int var13 = this.field385 * arg0;
			int var14 = this.field385 + var13;
			int var15 = this.field385 * arg1;
			int var16 = this.field385 + var15;
			float var17 = 0.0F;
			float var18 = 0.0F;
			float var19 = 0.0F;
			float var20 = 0.0F;
			float var25;
			float var27;
			float var29;
			float var31;
			float var32;
			float var33;
			float var34;
			float var35;
			float var43;
			float var45;
			float var47;
			float var49;
			float var51;
			float var53;
			float var55;
			float var57;
			if ((var12.field944 & 0x1) == 0 || arg2) {
				int var58 = this.field389[arg0][arg1];
				int var59 = this.field389[arg0 + 1][arg1];
				int var60 = this.field389[arg0 + 1][arg1 + 1];
				int var61 = this.field389[arg0][arg1 + 1];
				float var62 = (float) var15 * this.field7675 + (float) var13 * this.field7667 + (float) var58 * this.field7663 + this.field7669;
				var25 = (float) var15 * this.field7676 + (float) var13 * this.field7668 + (float) var58 * this.field7653 + this.field7680;
				if (var62 < -var25) {
					return;
				}
				float var63 = (float) var15 * this.field7675 + (float) var14 * this.field7667 + (float) var59 * this.field7663 + this.field7669;
				var27 = (float) var15 * this.field7676 + (float) var14 * this.field7668 + (float) var59 * this.field7653 + this.field7680;
				if (var63 < -var27) {
					return;
				}
				float var64 = (float) var16 * this.field7675 + (float) var14 * this.field7667 + (float) var60 * this.field7663 + this.field7669;
				var29 = (float) var16 * this.field7676 + (float) var14 * this.field7668 + (float) var60 * this.field7653 + this.field7680;
				if (var64 < -var29) {
					return;
				}
				float var65 = (float) var16 * this.field7675 + (float) var13 * this.field7667 + (float) var61 * this.field7663 + this.field7669;
				var31 = (float) var16 * this.field7676 + (float) var13 * this.field7668 + (float) var61 * this.field7653 + this.field7680;
				if (var65 < -var31) {
					return;
				}
				var32 = arg4.field996 * var62 / var25 + arg4.field995;
				var33 = arg4.field996 * var63 / var27 + arg4.field995;
				var34 = arg4.field996 * var64 / var29 + arg4.field995;
				var35 = arg4.field996 * var65 / var31 + arg4.field995;
				if (arg2) {
					float var66 = var62 - arg3.field867;
					if (var66 > 0.0F) {
						float var67 = var66 / arg3.field864;
						if (var67 > 1.0F) {
							var67 = 1.0F;
						}
						var17 = var67;
						int var68 = (int) ((float) var12.field949 * var67);
						if (var68 > 0) {
							var58 -= var68;
						}
					}
					float var69 = var63 - arg3.field867;
					if (var69 > 0.0F) {
						float var70 = var69 / arg3.field864;
						if (var70 > 1.0F) {
							var70 = 1.0F;
						}
						var18 = var70;
						int var71 = (int) ((float) var12.field948 * var70);
						if (var71 > 0) {
							var59 -= var71;
						}
					}
					float var72 = var64 - arg3.field867;
					if (var72 > 0.0F) {
						float var73 = var72 / arg3.field864;
						if (var73 > 1.0F) {
							var73 = 1.0F;
						}
						var19 = var73;
						int var74 = (int) ((float) var12.field950 * var73);
						if (var74 > 0) {
							var60 -= var74;
						}
					}
					float var75 = var65 - arg3.field867;
					if (var75 > 0.0F) {
						float var76 = var75 / arg3.field864;
						if (var76 > 1.0F) {
							var76 = 1.0F;
						}
						var20 = var76;
						int var77 = (int) ((float) var12.field952 * var76);
						if (var77 > 0) {
							var61 -= var77;
						}
					}
				} else if (arg3.field866) {
					float var78 = var62 - arg3.field867;
					if (var78 > 0.0F) {
						var17 = var78 / arg3.field864;
						if (var17 > 1.0F) {
							var17 = 1.0F;
						}
					}
					float var79 = var63 - arg3.field867;
					if (var79 > 0.0F) {
						var18 = var79 / arg3.field864;
						if (var18 > 1.0F) {
							var18 = 1.0F;
						}
					}
					float var80 = var64 - arg3.field867;
					if (var80 > 0.0F) {
						var19 = var80 / arg3.field864;
						if (var19 > 1.0F) {
							var19 = 1.0F;
						}
					}
					float var81 = var65 - arg3.field867;
					if (var81 > 0.0F) {
						var20 = var81 / arg3.field864;
						if (var20 > 1.0F) {
							var20 = 1.0F;
						}
					}
				}
				float var82 = (float) var15 * this.field7656 + (float) var13 * this.field7665 + (float) var58 * this.field7654 + this.field7677;
				var43 = arg4.field992 * var82 / var25 + arg4.field991;
				float var83 = (float) var15 * this.field7674 + (float) var13 * this.field7666 + (float) var58 * this.field7670 + this.field7678;
				var45 = arg4.field990 * var83 / var25 + arg4.field1015;
				float var84 = (float) var15 * this.field7656 + (float) var14 * this.field7665 + (float) var59 * this.field7654 + this.field7677;
				var47 = arg4.field992 * var84 / var27 + arg4.field991;
				float var85 = (float) var15 * this.field7674 + (float) var14 * this.field7666 + (float) var59 * this.field7670 + this.field7678;
				var49 = arg4.field990 * var85 / var27 + arg4.field1015;
				float var86 = (float) var16 * this.field7656 + (float) var14 * this.field7665 + (float) var60 * this.field7654 + this.field7677;
				var51 = arg4.field992 * var86 / var29 + arg4.field991;
				float var87 = (float) var16 * this.field7674 + (float) var14 * this.field7666 + (float) var60 * this.field7670 + this.field7678;
				var53 = arg4.field990 * var87 / var29 + arg4.field1015;
				float var88 = (float) var16 * this.field7656 + (float) var13 * this.field7665 + (float) var61 * this.field7654 + this.field7677;
				var55 = arg4.field992 * var88 / var31 + arg4.field991;
				float var89 = (float) var16 * this.field7674 + (float) var13 * this.field7666 + (float) var61 * this.field7670 + this.field7678;
				var57 = arg4.field990 * var89 / var31 + arg4.field1015;
			} else {
				int var21 = this.field389[arg0][arg1];
				float var22 = (float) var21 * this.field7663;
				float var23 = (float) var21 * this.field7653;
				float var24 = (float) var15 * this.field7675 + (float) var13 * this.field7667 + var22 + this.field7669;
				var25 = (float) var15 * this.field7676 + (float) var13 * this.field7668 + var23 + this.field7680;
				if (var24 < -var25) {
					return;
				}
				float var26 = (float) var15 * this.field7675 + (float) var14 * this.field7667 + var22 + this.field7669;
				var27 = (float) var15 * this.field7676 + (float) var14 * this.field7668 + var23 + this.field7680;
				if (var26 < -var27) {
					return;
				}
				float var28 = (float) var16 * this.field7675 + (float) var14 * this.field7667 + var22 + this.field7669;
				var29 = (float) var16 * this.field7676 + (float) var14 * this.field7668 + var23 + this.field7680;
				if (var28 < -var29) {
					return;
				}
				float var30 = (float) var16 * this.field7675 + (float) var13 * this.field7667 + var22 + this.field7669;
				var31 = (float) var16 * this.field7676 + (float) var13 * this.field7668 + var23 + this.field7680;
				if (var30 < -var31) {
					return;
				}
				var32 = arg4.field996 * var24 / var25 + arg4.field995;
				var33 = arg4.field996 * var26 / var27 + arg4.field995;
				var34 = arg4.field996 * var28 / var29 + arg4.field995;
				var35 = arg4.field996 * var30 / var31 + arg4.field995;
				if (arg3.field866) {
					float var36 = var24 - arg3.field867;
					if (var36 > 0.0F) {
						var17 = var36 / arg3.field864;
						if (var17 > 1.0F) {
							var17 = 1.0F;
						}
					}
					float var37 = var26 - arg3.field867;
					if (var37 > 0.0F) {
						var18 = var37 / arg3.field864;
						if (var18 > 1.0F) {
							var18 = 1.0F;
						}
					}
					float var38 = var28 - arg3.field867;
					if (var38 > 0.0F) {
						var19 = var38 / arg3.field864;
						if (var19 > 1.0F) {
							var19 = 1.0F;
						}
					}
					float var39 = var30 - arg3.field867;
					if (var39 > 0.0F) {
						var20 = var39 / arg3.field864;
						if (var20 > 1.0F) {
							var20 = 1.0F;
						}
					}
				}
				float var40 = (float) var21 * this.field7654;
				float var41 = (float) var21 * this.field7670;
				float var42 = (float) var15 * this.field7656 + (float) var13 * this.field7665 + var40 + this.field7677;
				var43 = arg4.field992 * var42 / var25 + arg4.field991;
				float var44 = (float) var15 * this.field7674 + (float) var13 * this.field7666 + var41 + this.field7678;
				var45 = arg4.field990 * var44 / var25 + arg4.field1015;
				float var46 = (float) var15 * this.field7656 + (float) var14 * this.field7665 + var40 + this.field7677;
				var47 = arg4.field992 * var46 / var27 + arg4.field991;
				float var48 = (float) var15 * this.field7674 + (float) var14 * this.field7666 + var41 + this.field7678;
				var49 = arg4.field990 * var48 / var27 + arg4.field1015;
				float var50 = (float) var16 * this.field7656 + (float) var14 * this.field7665 + var40 + this.field7677;
				var51 = arg4.field992 * var50 / var29 + arg4.field991;
				float var52 = (float) var16 * this.field7674 + (float) var14 * this.field7666 + var41 + this.field7678;
				var53 = arg4.field990 * var52 / var29 + arg4.field1015;
				float var54 = (float) var16 * this.field7656 + (float) var13 * this.field7665 + var40 + this.field7677;
				var55 = arg4.field992 * var54 / var31 + arg4.field991;
				float var56 = (float) var16 * this.field7674 + (float) var13 * this.field7666 + var41 + this.field7678;
				var57 = arg4.field990 * var56 / var31 + arg4.field1015;
			}
			boolean var90 = var12.field954 != -1 && this.method12952(this.field7658.field400.method889(var12.field954).field1270);
			float var91 = var18 + var19 + var20;
			if ((var49 - var57) * (var51 - var55) - (var47 - var55) * (var53 - var57) > 0.0F) {
				arg4.field988 = var51 < 0.0F || var55 < 0.0F || var47 < 0.0F || var51 > (float) (arg4.field1010 * 859149921) || var55 > (float) (arg4.field1010 * 859149921) || var47 > (float) (arg4.field1010 * 859149921);
				if (var91 >= 3.0F) {
					arg4.method1991(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, arg3.field869);
				} else if (var91 > 0.0F) {
					if (var12.field954 >= 0) {
						int var92 = -16777216;
						if (var90) {
							var92 = -1694498816;
						}
						arg4.method2015(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var92 | var12.field947 & 0xFFFFFF, var92 | var12.field951 & 0xFFFFFF, var92 | var12.field946 & 0xFFFFFF, arg3.field869, var19 * 255.0F, var20 * 255.0F, var18 * 255.0F, var12.field954);
					} else {
						if (var90) {
							arg4.field987 = 100;
						}
						arg4.method1989(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, class482.method1378(var12.field947, (int) (var19 * 255.0F) << 24 | arg3.field869), class482.method1378(var12.field951, (int) (var20 * 255.0F) << 24 | arg3.field869), class482.method1378(var12.field946, (int) (var18 * 255.0F) << 24 | arg3.field869));
						arg4.field987 = 0;
					}
				} else if (var12.field954 >= 0) {
					int var93 = -16777216;
					if (var90) {
						var93 = -1694498816;
					}
					arg4.method2015(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var93 | var12.field947 & 0xFFFFFF, var93 | var12.field951 & 0xFFFFFF, var93 | var12.field946 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var12.field954);
				} else {
					if (var90) {
						arg4.field987 = 100;
					}
					arg4.method1989(true, true, false, var53, var57, var49, var51, var55, var47, var34, var35, var33, var12.field947, var12.field951, var12.field946);
					arg4.field987 = 0;
				}
			}
			float var94 = var17 + var18 + var20;
			if ((var43 - var47) * (var57 - var49) - (var45 - var49) * (var55 - var47) > 0.0F) {
				arg4.field988 = var43 < 0.0F || var47 < 0.0F || var55 < 0.0F || var43 > (float) (arg4.field1010 * 859149921) || var47 > (float) (arg4.field1010 * 859149921) || var55 > (float) (arg4.field1010 * 859149921);
				if (var94 < 3.0F) {
					if (var90) {
						arg4.field987 = -1694498816;
					}
					if (var94 > 0.0F) {
						if (var12.field954 >= 0) {
							int var95 = -16777216;
							if (var90) {
								var95 = -1694498816;
							}
							arg4.method2015(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var95 | var12.field945 & 0xFFFFFF, var95 | var12.field946 & 0xFFFFFF, var95 | var12.field951 & 0xFFFFFF, arg3.field869, var17 * 255.0F, var18 * 255.0F, var20 * 255.0F, var12.field954);
						} else {
							if (var90) {
								arg4.field987 = 100;
							}
							arg4.method1989(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, class482.method1378(var12.field945, (int) (var17 * 255.0F) << 24 | arg3.field869), class482.method1378(var12.field946, (int) (var18 * 255.0F) << 24 | arg3.field869), class482.method1378(var12.field951, (int) (var20 * 255.0F) << 24 | arg3.field869));
							arg4.field987 = 0;
						}
					} else if (var12.field954 >= 0) {
						int var96 = -16777216;
						if (var90) {
							var96 = -1694498816;
						}
						arg4.method2015(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var96 | var12.field945 & 0xFFFFFF, var96 | var12.field946 & 0xFFFFFF, var96 | var12.field951 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, var12.field954);
					} else {
						if (var90) {
							arg4.field987 = 100;
						}
						arg4.method1989(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, var12.field945, var12.field946, var12.field951);
						arg4.field987 = 0;
					}
				} else {
					arg4.method1991(true, true, false, var45, var49, var57, var43, var47, var55, var32, var33, var35, arg3.field869);
				}
			}
		}
	}

	@ObfuscatedName("ym.az(IIZLak;Lbv;[F[F[F[F[FI)V")
	public void method12951(int arg0, int arg1, boolean arg2, class66 arg3, class77 arg4, float[] arg5, float[] arg6, float[] arg7, float[] arg8, float[] arg9, int arg10) {
		BlendedTexturedTileData var12 = this.field7664[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || var12 == null) {
			return;
		}
		for (int var13 = 0; var13 < var12.field974; var13++) {
			int var14 = (arg0 << this.field388) + var12.field975[var13];
			int var15 = var12.field973[var13];
			int var16 = (arg1 << this.field388) + var12.field977[var13];
			float var17 = (float) var16 * this.field7675 + (float) var14 * this.field7667 + (float) var15 * this.field7663 + this.field7669;
			float var18 = (float) var16 * this.field7676 + (float) var14 * this.field7668 + (float) var15 * this.field7653 + this.field7680;
			if (var17 < -var18) {
				return;
			}
			arg9[var13] = 0.0F;
			if (arg2) {
				float var19 = var17 - arg3.field867;
				if (var19 > 0.0F) {
					float var20 = var19 / arg3.field864;
					if (var20 > 1.0F) {
						var20 = 1.0F;
					}
					arg9[var13] = var20;
					int var21 = (int) ((float) var12.field976[var13] * var20);
					if (var21 > 0) {
						var15 -= var21;
					}
				}
			} else if (arg3.field866) {
				float var22 = var17 - arg3.field867;
				if (var22 > 0.0F) {
					arg9[var13] = var22 / arg3.field864;
					if (arg9[var13] > 1.0F) {
						arg9[var13] = 1.0F;
					}
				}
			}
			float var23 = (float) var16 * this.field7656 + (float) var14 * this.field7665 + (float) var15 * this.field7654 + this.field7677;
			float var24 = (float) var16 * this.field7674 + (float) var14 * this.field7666 + (float) var15 * this.field7670 + this.field7678;
			arg5[var13] = arg4.field992 * var23 / var18 + arg4.field991;
			arg6[var13] = arg4.field990 * var24 / var18 + arg4.field1015;
			arg7[var13] = arg4.field996 * var17 / var18 + arg4.field995;
			arg8[var13] = var18;
		}
		float var25 = (float) this.field385;
		for (int var26 = 0; var26 < var12.field980; var26++) {
			int var27 = var26 * 3;
			int var28 = var27 + 1;
			int var29 = var28 + 1;
			float var30 = arg5[var27];
			float var31 = arg5[var28];
			float var32 = arg5[var29];
			float var33 = arg6[var27];
			float var34 = arg6[var28];
			float var35 = arg6[var29];
			if ((var30 - var31) * (var35 - var34) - (var32 - var31) * (var33 - var34) > 0.0F) {
				arg4.field988 = var30 < 0.0F || var31 < 0.0F || var32 < 0.0F || var30 > (float) (arg4.field1010 * 859149921) || var31 > (float) (arg4.field1010 * 859149921) || var32 > (float) (arg4.field1010 * 859149921);
				if (arg9[var27] + arg9[var28] + arg9[var29] < 3.0F) {
					int var36 = arg0 << this.field388;
					int var37 = arg1 << this.field388;
					if ((var12.field978[var27] & 0xFFFFFF) != 0) {
						if (var12.field979[var27] == var12.field979[var28] && var12.field979[var27] == var12.field979[var29] && var12.field981[var27] == var12.field981[var28] && var12.field981[var27] == var12.field981[var29]) {
							arg4.method2015(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg8[var27], arg8[var28], arg8[var29], (float) (var12.field975[var27] + var36) / (float) var12.field981[var27], (float) (var12.field975[var28] + var36) / (float) var12.field981[var28], (float) (var12.field975[var29] + var36) / (float) var12.field981[var29], (float) (var12.field977[var27] + var37) / (float) var12.field981[var27], (float) (var12.field977[var28] + var37) / (float) var12.field981[var28], (float) (var12.field977[var29] + var37) / (float) var12.field981[var29], var12.field978[var27], var12.field978[var28], var12.field978[var29], arg3.field869, arg9[var27] * 255.0F, arg9[var28] * 255.0F, arg9[var29] * 255.0F, var12.field979[var27]);
						} else {
							arg4.method1995(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg8[var27], arg8[var28], arg8[var29], (float) (var12.field975[var27] + var36) / var25, (float) (var12.field975[var28] + var36) / var25, (float) (var12.field975[var29] + var36) / var25, (float) (var12.field977[var27] + var37) / var25, (float) (var12.field977[var28] + var37) / var25, (float) (var12.field977[var29] + var37) / var25, var12.field978[var27], var12.field978[var28], var12.field978[var29], arg3.field869, arg9[var27] * 255.0F, arg9[var28] * 255.0F, arg9[var29] * 255.0F, var12.field979[var27], var25 / (float) var12.field981[var27], var12.field979[var28], var25 / (float) var12.field981[var28], var12.field979[var29], var25 / (float) var12.field981[var29]);
						}
					}
				} else {
					arg4.method1991(true, true, false, var33, var34, var35, var30, var31, var32, arg7[var27], arg7[var28], arg7[var29], arg3.field869);
				}
			}
		}
	}

	@ObfuscatedName("ym.ak(I)Z")
	public boolean method12952(int arg0) {
		if ((this.field7681 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@ObfuscatedName("ym.s(IIIIIII[[Z)V")
	public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
		class66 var9 = this.field7658.method13206(Thread.currentThread());
		class77 var10 = var9.field868;
		var10.field987 = 0;
		var10.field988 = true;
		this.field7658.method13198();
		if (this.field7673 != null || this.field7664 != null) {
			this.method12953(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field903, var9.field904);
		} else if (this.field7660 != null) {
			this.method12961(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field903, var9.field904);
		}
	}

	@ObfuscatedName("ym.av(IIIIIII[[ZLak;Lbv;[F[F)V")
	public void method12961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class66 arg8, class77 arg9, float[] arg10, float[] arg11) {
		int var13 = (arg6 - arg4) * arg2 / 256;
		int var14 = arg2 >> 8;
		boolean var15 = arg8.field874;
		this.field7658.method526(false);
		arg9.field1006 = false;
		arg9.field986 = false;
		int var16 = arg0;
		int var17 = arg1 + var13;
		for (int var18 = arg3; var18 < arg5; var18++) {
			for (int var19 = arg4; var19 < arg6; var19++) {
				if (arg7[var18 - arg3][var19 - arg4]) {
					if (this.field7660[var18][var19] != null) {
						UnblendedTileData1 var20 = this.field7660[var18][var19];
						if (var20.field972 != -1 && (var20.field971 & 0x2) == 0 && var20.field967 == -1) {
							int var21 = this.field7658.method13243(var20.field972);
							arg9.method1987(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class482.method2020(var21, var20.field969 & 0xFFFF), (float) class482.method2020(var21, var20.field970 & 0xFFFF), (float) class482.method2020(var21, var20.field968 & 0xFFFF));
							arg9.method1987(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class482.method2020(var21, var20.field966 & 0xFFFF), (float) class482.method2020(var21, var20.field968 & 0xFFFF), (float) class482.method2020(var21, var20.field970 & 0xFFFF));
						} else if (var20.field967 == -1) {
							arg9.method1987(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field969 & 0xFFFF), (float) (var20.field970 & 0xFFFF), (float) (var20.field968 & 0xFFFF));
							arg9.method1987(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field966 & 0xFFFF), (float) (var20.field968 & 0xFFFF), (float) (var20.field970 & 0xFFFF));
						} else {
							int var22 = var20.field967;
							arg9.method1987(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
							arg9.method1987(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
						}
					} else if (this.field7672[var18][var19] != null) {
						UnblendedTileData2 var23 = this.field7672[var18][var19];
						for (int var24 = 0; var24 < var23.field922; var24++) {
							arg10[var24] = var23.field921[var24] * var14 / this.field385 + var16;
							arg11[var24] = var17 - var23.field923[var24] * var14 / this.field385;
						}
						for (int var25 = 0; var25 < var23.field925; var25++) {
							short var26 = var23.field918[var25];
							short var27 = var23.field926[var25];
							short var28 = var23.field927[var25];
							float var29 = arg10[var26];
							float var30 = arg10[var27];
							float var31 = arg10[var28];
							float var32 = arg11[var26];
							float var33 = arg11[var27];
							float var34 = arg11[var28];
							if (var23.field928 != null && var23.field928[var25] != -1) {
								int var35 = var23.field928[var25];
								arg9.method1987(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float) class482.method2020(var35, var23.field924[var26]), (float) class482.method2020(var35, var23.field924[var27]), (float) class482.method2020(var35, var23.field924[var28]));
							} else if (var23.field919 == null || var23.field919[var25] == -1) {
								int var37 = var23.field931[var25];
								arg9.method1987(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float) class482.method2020(var37, var23.field924[var26]), (float) class482.method2020(var37, var23.field924[var27]), (float) class482.method2020(var37, var23.field924[var28]));
							} else {
								int var36 = this.field7658.method13243(var23.field919[var25]);
								arg9.method1987(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float) class482.method2020(var36, var23.field924[var26]), (float) class482.method2020(var36, var23.field924[var27]), (float) class482.method2020(var36, var23.field924[var28]));
							}
						}
					}
				}
				var17 -= var14;
			}
			var17 = arg1 + var13;
			var16 += var14;
		}
		arg9.field1006 = true;
		this.field7658.method526(var15);
	}

	@ObfuscatedName("ym.aj(IIIIIII[[ZLak;Lbv;[F[F)V")
	public void method12953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class66 arg8, class77 arg9, float[] arg10, float[] arg11) {
		int var13 = (arg6 - arg4) * arg2 / 256;
		int var14 = arg2 >> 8;
		boolean var15 = arg8.field874;
		this.field7658.method526(false);
		arg9.field1006 = false;
		arg9.field986 = false;
		int var16 = arg0;
		int var17 = arg1 + var13;
		for (int var18 = arg3; var18 < arg5; var18++) {
			for (int var19 = arg4; var19 < arg6; var19++) {
				if (arg7[var18 - arg3][var19 - arg4]) {
					if (this.field7673 == null) {
						if (this.field7664[var18][var19] != null) {
							BlendedTexturedTileData var37 = this.field7664[var18][var19];
							for (int var38 = 0; var38 < var37.field974; var38++) {
								arg10[var38] = var37.field975[var38] * var14 / this.field385 + var16;
								arg11[var38] = var17 - var37.field977[var38] * var14 / this.field385;
							}
							for (int var39 = 0; var39 < var37.field980; var39++) {
								int var40 = var39 * 3;
								int var41 = var40 + 1;
								int var42 = var41 + 1;
								float var43 = arg10[var40];
								float var44 = arg10[var41];
								float var45 = arg10[var42];
								float var46 = arg11[var40];
								float var47 = arg11[var41];
								float var48 = arg11[var42];
								if (var37.field983 == null || var37.field983[var39] == 0) {
									arg9.method1989(true, true, false, var46, var47, var48, var43, var44, var45, 100.0F, 100.0F, 100.0F, var37.field978[var40], var37.field978[var41], var37.field978[var42]);
								} else {
									int var49 = var37.field983[var39];
									arg9.method1989(true, true, false, var46, var47, var48, var43, var44, var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
								}
							}
						}
					} else if (this.field7673[var18][var19] != null) {
						BlendedUntexturedTileData1 var20 = this.field7673[var18][var19];
						if (var20.field954 != -1 && (var20.field944 & 0x2) == 0 && var20.field953 == 0) {
							int var21 = this.field7658.method13243(var20.field954);
							arg9.method1987(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class482.method2020(var21, var20.field947), (float) class482.method2020(var21, var20.field951), (float) class482.method2020(var21, var20.field946));
							arg9.method1987(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class482.method2020(var21, var20.field945), (float) class482.method2020(var21, var20.field946), (float) class482.method2020(var21, var20.field951));
						} else if (var20.field953 == 0) {
							arg9.method1989(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field947, var20.field951, var20.field946);
							arg9.method1989(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field945, var20.field946, var20.field951);
						} else {
							int var22 = var20.field953;
							arg9.method1989(true, true, false, (float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class482.method1378(var22, var20.field947 & 0xFF000000), class482.method1378(var22, var20.field951 & 0xFF000000), class482.method1378(var22, var20.field946 & 0xFF000000));
							arg9.method1989(true, true, false, (float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class482.method1378(var22, var20.field945 & 0xFF000000), class482.method1378(var22, var20.field946 & 0xFF000000), class482.method1378(var22, var20.field951 & 0xFF000000));
						}
					} else if (this.field7685[var18][var19] != null) {
						BlendedUntexturedTileData2 var23 = this.field7685[var18][var19];
						for (int var24 = 0; var24 < var23.field955; var24++) {
							arg10[var24] = var23.field958[var24] * var14 / this.field385 + var16;
							arg11[var24] = var17 - var23.field960[var24] * var14 / this.field385;
						}
						for (int var25 = 0; var25 < var23.field961; var25++) {
							int var26 = var25 * 3;
							int var27 = var26 + 1;
							int var28 = var27 + 1;
							float var29 = arg10[var26];
							float var30 = arg10[var27];
							float var31 = arg10[var28];
							float var32 = arg11[var26];
							float var33 = arg11[var27];
							float var34 = arg11[var28];
							if (var23.field964 != null && var23.field964[var25] != 0 && (var23.field963 == null || var23.field963 != null && var23.field963[var25] == -1)) {
								int var35 = var23.field964[var25];
								arg9.method1989(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, class482.method1378(var35, -16777216 - (var23.field962[var26] & -16777216)), class482.method1378(var35, -16777216 - (var23.field962[var27] & -16777216)), class482.method1378(var35, -16777216 - (var23.field962[var28] & -16777216)));
							} else if (var23.field963 == null || var23.field963[var25] == -1) {
								arg9.method1989(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, var23.field962[var26], var23.field962[var27], var23.field962[var28]);
							} else {
								int var36 = this.field7658.method13243(var23.field963[var25]);
								arg9.method1987(true, true, false, var32, var33, var34, var29, var30, var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
							}
						}
					}
				}
				var17 -= var14;
			}
			var17 = arg1 + var13;
			var16 += var14;
		}
		arg9.field1006 = true;
		this.field7658.method526(var15);
	}

	@ObfuscatedName("ym.w(IILna;)Lna;")
	public class30 method200(int arg0, int arg1, class30 arg2) {
		return null;
	}

	@ObfuscatedName("ym.UA(Lna;IIIIZ)V")
	public void method209(class30 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	@ObfuscatedName("ym.l(Lna;IIIIZ)Z")
	public boolean method203(class30 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		return false;
	}

	@ObfuscatedName("ym.NA(Lna;IIIIZ)V")
	public void method194(class30 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
	}

	@ObfuscatedName("ym.f(Lacg;[I)V")
	public void method204(Light arg0, int[] arg1) {
	}
}
