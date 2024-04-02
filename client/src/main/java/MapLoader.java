
import deob.ObfuscatedName;

@ObfuscatedName("lq")
public class MapLoader {

	@ObfuscatedName("lq.u")
	public FloorOverlayTypeList field3692;

	@ObfuscatedName("lq.j")
	public FloorUnderlayTypeList field3668;

	@ObfuscatedName("lq.a")
	public SceneLevelTileFlags field3618;

	@ObfuscatedName("lq.s")
	public int field3688;

	@ObfuscatedName("lq.c")
	public Scene field3619;

	@ObfuscatedName("lq.t")
	public int field3629 = 0;

	@ObfuscatedName("lq.l")
	public boolean field3622 = false;

	@ObfuscatedName("lq.f")
	public boolean field3623 = false;

	@ObfuscatedName("lq.d")
	public boolean field3624 = false;

	@ObfuscatedName("lq.z")
	public boolean field3625 = false;

	@ObfuscatedName("lq.n")
	public final int field3628;

	@ObfuscatedName("lq.o")
	public final int field3627;

	@ObfuscatedName("lq.q")
	public final int field3643;

	@ObfuscatedName("lq.p")
	public final boolean field3644;

	@ObfuscatedName("lq.w")
	public int[][][] field3697;

	@ObfuscatedName("lq.b")
	public byte[][][] field3631;

	@ObfuscatedName("lq.x")
	public boolean field3632;

	@ObfuscatedName("lq.i")
	public byte[][][] field3703;

	@ObfuscatedName("lq.v")
	public byte[][][] field3621;

	@ObfuscatedName("lq.k")
	public byte[][][] field3635;

	@ObfuscatedName("lq.h")
	public byte[][][] field3636;

	@ObfuscatedName("lq.r")
	public int field3626 = 0;

	@ObfuscatedName("lq.g")
	public byte[][][] field3659;

	@ObfuscatedName("lq.y")
	public int[] field3634;

	@ObfuscatedName("lq.e")
	public int[] field3639;

	@ObfuscatedName("lq.ay")
	public int[] field3640;

	@ObfuscatedName("lq.af")
	public int[] field3641;

	@ObfuscatedName("lq.ar")
	public int[] field3642;

	@ObfuscatedName("lq.ak")
	public static final int[] field3657 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@ObfuscatedName("lq.av")
	public static final int[] field3658 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@ObfuscatedName("lq.aj")
	public static final int[] field3699 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@ObfuscatedName("lq.ah")
	public static final int[] field3660 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@ObfuscatedName("lq.au")
	public static final int[] field3661 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@ObfuscatedName("lq.ae")
	public static final int[] field3662 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@ObfuscatedName("lq.ac")
	public static final int[] field3663 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@ObfuscatedName("lq.aq")
	public static final int[] field3664 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@ObfuscatedName("lq.ab")
	public static final boolean[][] field3665 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } };

	@ObfuscatedName("lq.bq")
	public static final boolean[][] field3666 = new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@ObfuscatedName("lq.bz")
	public static final int[][] field3667 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@ObfuscatedName("lq.bv")
	public static final int[][] field3673 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@ObfuscatedName("lq.bj")
	public static final int[][] field3651 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@ObfuscatedName("lq.bf")
	public static final boolean[][] field3670 = new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } };

	@ObfuscatedName("lq.bt")
	public static final int[][] field3671 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@ObfuscatedName("lq.bg")
	public static final int[][] field3637 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@ObfuscatedName("lq.bl")
	public static final int[][] field3616 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@ObfuscatedName("lq.bk")
	public static final int[][] field3674 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@ObfuscatedName("lq.bs")
	public static final boolean[][] field3675 = new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } };

	@ObfuscatedName("lq.bn")
	public static final int[][] field3676 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@ObfuscatedName("lq.ba")
	public static final int[][] field3677 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@ObfuscatedName("lq.bd")
	public static final int[][] field3687 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@ObfuscatedName("lq.bc")
	public static final int[][] field3679 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@ObfuscatedName("lq.br")
	public final int[] field3680 = new int[6];

	@ObfuscatedName("lq.bp")
	public final int[] field3689 = new int[13];

	@ObfuscatedName("lq.bi")
	public final int[] field3682 = new int[13];

	@ObfuscatedName("lq.bx")
	public final int[] field3696 = new int[13];

	@ObfuscatedName("lq.bm")
	public final int[] field3684 = new int[13];

	@ObfuscatedName("lq.bb")
	public final int[] field3648 = new int[13];

	@ObfuscatedName("lq.be")
	public final int[] field3686 = new int[13];

	@ObfuscatedName("lq.bw")
	public int field3669;

	@ObfuscatedName("lq.bo")
	public int field3690 = 0;

	@ObfuscatedName("lq.bh")
	public int field3691;

	@ObfuscatedName("lq.by")
	public int field3617;

	@ObfuscatedName("lq.bu")
	public int field3633;

	@ObfuscatedName("lq.cl")
	public boolean field3694;

	@ObfuscatedName("lq.cq")
	public boolean field3695;

	@ObfuscatedName("lq.co")
	public boolean field3678;

	@ObfuscatedName("lq.cb")
	public boolean field3685;

	@ObfuscatedName("lq.cm")
	public int field3698;

	@ObfuscatedName("lq.cw")
	public int field3681;

	@ObfuscatedName("lq.cx")
	public int[] field3700;

	@ObfuscatedName("lq.cn")
	public int[] field3638;

	@ObfuscatedName("lq.cf")
	public int[] field3702;

	@ObfuscatedName("lq.cs")
	public int[] field3693 = null;

	public MapLoader(Scene arg0, int arg1, int arg2, int arg3, boolean arg4, FloorOverlayTypeList arg5, FloorUnderlayTypeList arg6, SceneLevelTileFlags arg7) {
		this.field3619 = arg0;
		this.field3628 = arg1;
		this.field3627 = arg2;
		this.field3643 = arg3;
		this.field3644 = arg4;
		this.field3692 = arg5;
		this.field3668 = arg6;
		this.field3618 = arg7;
		this.field3635 = new byte[this.field3628][this.field3627][this.field3643];
		this.field3636 = new byte[this.field3628][this.field3627][this.field3643];
		this.field3703 = new byte[this.field3628][this.field3627][this.field3643];
		this.field3621 = new byte[this.field3628][this.field3627][this.field3643];
		this.field3697 = new int[this.field3628][this.field3627 + 1][this.field3643 + 1];
		this.field3659 = new byte[this.field3628][this.field3627 + 1][this.field3643 + 1];
	}

	@ObfuscatedName("lq.u(I)V")
	public void method5834() {
		this.field3632 = true;
	}

	@ObfuscatedName("lq.j(B)V")
	public void method5888() {
		this.field3634 = null;
		this.field3639 = null;
		this.field3640 = null;
		this.field3641 = null;
		this.field3642 = null;
		this.field3632 = false;
	}

	@ObfuscatedName("lq.a(IIIII)V")
	public final void method5836(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field3628; var5++) {
			this.method5837(var5, arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("lq.s(IIIIIB)V")
	public final void method5837(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = arg2; var6 < arg2 + arg4; var6++) {
			for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
				if (var7 >= 0 && var7 < this.field3627 && var6 >= 0 && var6 < this.field3643) {
					this.field3697[arg0][var7][var6] = arg0 > 0 ? this.field3697[arg0 - 1][var7][var6] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.field3627) {
			for (int var8 = arg2 + 1; var8 < arg2 + arg4; var8++) {
				if (var8 >= 0 && var8 < this.field3643) {
					this.field3697[arg0][arg1][var8] = this.field3697[arg0][arg1 - 1][var8];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.field3643) {
			for (int var9 = arg1 + 1; var9 < arg1 + arg3; var9++) {
				if (var9 >= 0 && var9 < this.field3627) {
					this.field3697[arg0][var9][arg2] = this.field3697[arg0][var9][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || arg1 >= this.field3627 || arg2 >= this.field3643) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && this.field3697[arg0][arg1 - 1][arg2] != 0) {
				this.field3697[arg0][arg1][arg2] = this.field3697[arg0][arg1 - 1][arg2];
			} else if (arg2 > 0 && this.field3697[arg0][arg1][arg2 - 1] != 0) {
				this.field3697[arg0][arg1][arg2] = this.field3697[arg0][arg1][arg2 - 1];
			} else if (arg1 > 0 && arg2 > 0 && this.field3697[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.field3697[arg0][arg1][arg2] = this.field3697[arg0][arg1 - 1][arg2 - 1];
			}
		} else if (arg1 > 0 && this.field3697[arg0 - 1][arg1 - 1][arg2] != this.field3697[arg0][arg1 - 1][arg2]) {
			this.field3697[arg0][arg1][arg2] = this.field3697[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && this.field3697[arg0 - 1][arg1][arg2 - 1] != this.field3697[arg0][arg1][arg2 - 1]) {
			this.field3697[arg0][arg1][arg2] = this.field3697[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && this.field3697[arg0 - 1][arg1 - 1][arg2 - 1] != this.field3697[arg0][arg1 - 1][arg2 - 1]) {
			this.field3697[arg0][arg1][arg2] = this.field3697[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("lq.c(Laet;IIII[Lmv;I)V")
	public final void method5838(Packet arg0, int arg1, int arg2, int arg3, int arg4, class361[] arg5) {
		if (!this.field3644) {
			for (int var7 = 0; var7 < 4; var7++) {
				class361 var8 = arg5[var7];
				for (int var9 = 0; var9 < 64; var9++) {
					for (int var10 = 0; var10 < 64; var10++) {
						int var11 = arg1 + var9;
						int var12 = arg2 + var10;
						if (var11 >= 0 && var11 < this.field3627 && var12 >= 0 && var12 < this.field3643) {
							var8.method6271(var11, var12);
						}
					}
				}
			}
		}
		int var13 = arg1 + arg3;
		int var14 = arg2 + arg4;
		for (int var15 = 0; var15 < this.field3628; var15++) {
			for (int var16 = 0; var16 < 64; var16++) {
				for (int var17 = 0; var17 < 64; var17++) {
					this.method5843(arg0, var15, arg1 + var16, arg2 + var17, 0, 0, var13 + var16, var14 + var17, 0, false);
				}
			}
		}
	}

	@ObfuscatedName("lq.m(Laet;IIIIIII[Lmv;B)V")
	public final void method5839(Packet arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class361[] arg8) {
		int var10 = (arg5 & 0x7) * 8;
		int var11 = (arg6 & 0x7) * 8;
		if (!this.field3644) {
			class361 var12 = arg8[arg1];
			for (int var13 = 0; var13 < 8; var13++) {
				for (int var14 = 0; var14 < 8; var14++) {
					int var15 = arg2 + class339.method1725(var13 & 0x7, var14 & 0x7, arg7);
					int var16 = arg3 + class339.method4739(var13 & 0x7, var14 & 0x7, arg7);
					if (var15 > 0 && var15 < this.field3627 - 1 && var16 > 0 && var16 < this.field3643 - 1) {
						var12.method6271(var15, var16);
					}
				}
			}
		}
		int var17 = (arg5 & 0xFFFFFFF8) << 3;
		int var18 = (arg6 & 0xFFFFFFF8) << 3;
		byte var19 = 0;
		byte var20 = 0;
		if (arg7 == 1) {
			var20 = 1;
		} else if (arg7 == 2) {
			var19 = 1;
			var20 = 1;
		} else if (arg7 == 3) {
			var19 = 1;
		}
		for (int var21 = 0; var21 < this.field3628; var21++) {
			for (int var22 = 0; var22 < 64; var22++) {
				for (int var23 = 0; var23 < 64; var23++) {
					if (arg4 == var21 && var22 >= var10 && var22 <= var10 + 8 && var23 >= var11 && var23 <= var11 + 8) {
						int var24;
						int var25;
						if (var10 + 8 == var22 || var11 + 8 == var23) {
							if (arg7 == 0) {
								var24 = var22 - var10 + arg2;
								var25 = var23 - var11 + arg3;
							} else if (arg7 == 1) {
								var24 = var23 - var11 + arg2;
								var25 = arg3 + 8 - (var22 - var10);
							} else if (arg7 == 2) {
								var24 = arg2 + 8 - (var22 - var10);
								var25 = arg3 + 8 - (var23 - var11);
							} else {
								var24 = arg2 + 8 - (var23 - var11);
								var25 = var22 - var10 + arg3;
							}
							this.method5843(arg0, arg1, var24, var25, 0, 0, var17 + var22, var18 + var23, 0, true);
						} else {
							var24 = arg2 + class339.method1725(var22 & 0x7, var23 & 0x7, arg7);
							var25 = arg3 + class339.method4739(var22 & 0x7, var23 & 0x7, arg7);
							this.method5843(arg0, arg1, var24, var25, var19, var20, var17 + var22, var18 + var23, arg7, false);
						}
						if (var22 == 63 || var23 == 63) {
							byte var26 = 1;
							if (var22 == 63 && var23 == 63) {
								var26 = 3;
							}
							for (int var27 = 0; var27 < var26; var27++) {
								int var28 = var22;
								int var29 = var23;
								if (var27 == 0) {
									var28 = var22 == 63 ? 64 : var22;
									var29 = var23 == 63 ? 64 : var23;
								} else if (var27 == 1) {
									var28 = 64;
								} else if (var27 == 2) {
									var29 = 64;
								}
								int var30;
								int var31;
								if (arg7 == 0) {
									var30 = var28 - var10 + arg2;
									var31 = var29 - var11 + arg3;
								} else if (arg7 == 1) {
									var30 = var29 - var11 + arg2;
									var31 = arg3 + 8 - (var28 - var10);
								} else if (arg7 == 2) {
									var30 = arg2 + 8 - (var28 - var10);
									var31 = arg3 + 8 - (var29 - var11);
								} else {
									var30 = arg2 + 8 - (var29 - var11);
									var31 = var28 - var10 + arg3;
								}
								if (var30 >= 0 && var30 < this.field3627 && var31 >= 0 && var31 < this.field3643) {
									this.field3697[arg1][var30][var31] = this.field3697[arg1][var19 + var24][var20 + var25];
								}
							}
						}
					} else {
						this.method5843(arg0, 0, -1, -1, 0, 0, 0, 0, 0, false);
					}
				}
			}
		}
	}

	@ObfuscatedName("lq.t(Laet;IIIIIIIIZB)V")
	public final void method5843(Packet arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
		if (arg8 == 1) {
			arg5 = 1;
		} else if (arg8 == 2) {
			arg4 = 1;
			arg5 = 1;
		} else if (arg8 == 3) {
			arg4 = 1;
		}
		if (arg2 < 0 || arg2 >= this.field3627 || arg3 < 0 || arg3 >= this.field3643) {
			while (true) {
				int var13 = arg0.method15220();
				if (var13 == 0) {
					break;
				}
				if (var13 == 1) {
					arg0.method15220();
					break;
				}
				if (var13 <= 49) {
					arg0.method15220();
				}
			}
			return;
		}
		if (!this.field3644 && !arg9) {
			this.field3618.field3606[arg1][arg2][arg3] = 0;
		}
		while (true) {
			int var11 = arg0.method15220();
			if (var11 == 0) {
				if (this.field3644) {
					this.field3697[0][arg2 + arg4][arg3 + arg5] = 0;
				} else if (arg1 == 0) {
					this.field3697[0][arg2 + arg4][arg3 + arg5] = -method3069(arg6 + 932731, arg7 + 556238) * 8 << 2;
				} else {
					this.field3697[arg1][arg2 + arg4][arg3 + arg5] = this.field3697[arg1 - 1][arg2 + arg4][arg3 + arg5] - 960;
				}
				break;
			}
			if (var11 == 1) {
				int var12 = arg0.method15220();
				if (this.field3644) {
					this.field3697[0][arg2 + arg4][arg3 + arg5] = var12 * 8 << 2;
				} else {
					if (var12 == 1) {
						var12 = 0;
					}
					if (arg1 == 0) {
						this.field3697[0][arg2 + arg4][arg3 + arg5] = -var12 * 8 << 2;
					} else {
						this.field3697[arg1][arg2 + arg4][arg3 + arg5] = this.field3697[arg1 - 1][arg2 + arg4][arg3 + arg5] - (var12 * 8 << 2);
					}
				}
				break;
			}
			if (var11 <= 49) {
				if (arg9) {
					arg0.method15220();
				} else {
					this.field3636[arg1][arg2][arg3] = arg0.method15238();
					this.field3703[arg1][arg2][arg3] = (byte) ((var11 - 2) / 4);
					this.field3621[arg1][arg2][arg3] = (byte) (var11 - 2 + arg8 & 0x3);
				}
			} else if (var11 <= 81) {
				if (!this.field3644 && !arg9) {
					this.field3618.field3606[arg1][arg2][arg3] = (byte) (var11 - 49);
				}
			} else if (!arg9) {
				this.field3635[arg1][arg2][arg3] = (byte) (var11 - 81);
			}
		}
	}

	@ObfuscatedName("lq.l(I[[II)V")
	public final void method5841(int arg0, int[][] arg1) {
		int[][] var3 = this.field3697[arg0];
		for (int var4 = 0; var4 < this.field3627 + 1; var4++) {
			for (int var5 = 0; var5 < this.field3643 + 1; var5++) {
				var3[var4][var5] += arg1[var4][var5];
			}
		}
	}

	@ObfuscatedName("lq.f(Lra;[[[I[Lmv;S)V")
	public void method5842(RendererToolkit arg0, int[][][] arg1, class361[] arg2) {
		if (!this.field3644) {
			for (int var4 = 0; var4 < 4; var4++) {
				for (int var5 = 0; var5 < this.field3627; var5++) {
					for (int var6 = 0; var6 < this.field3643; var6++) {
						if ((this.field3618.field3606[var4][var5][var6] & 0x1) != 0) {
							int var7 = var4;
							if ((this.field3618.field3606[1][var5][var6] & 0x2) != 0) {
								var7 = var4 - 1;
							}
							if (var7 >= 0) {
								arg2[var7].method6274(var5, var6);
							}
						}
					}
				}
			}
		}
		for (int var8 = 0; var8 < this.field3628; var8++) {
			int var9 = 0;
			int var10 = 0;
			if (!this.field3644) {
				if (this.field3622) {
					var10 |= 0x8;
				}
				if (this.field3623) {
					var9 |= 0x2;
				}
				if (this.field3629 != 0) {
					var9 |= 0x1;
					var10 |= 0x10;
				}
			}
			if (this.field3623) {
				var10 |= 0x7;
			}
			if (!this.field3625) {
				var10 |= 0x20;
			}
			int[][] var11 = arg1 == null || var8 >= arg1.length ? this.field3697[var8] : arg1[var8];
			this.field3619.method7409(var8, arg0.method521(this.field3627, this.field3643, this.field3697[var8], var11, 512, var9, var10));
		}
	}

	@ObfuscatedName("lq.d(Lra;Lxa;Lxa;B)V")
	public final void method5833(RendererToolkit arg0, FloorModel arg1, FloorModel arg2) {
		int[][] var4 = new int[this.field3627][this.field3643];
		if (this.field3634 == null || this.field3643 != this.field3634.length) {
			this.field3634 = new int[this.field3643];
			this.field3639 = new int[this.field3643];
			this.field3640 = new int[this.field3643];
			this.field3641 = new int[this.field3643];
			this.field3642 = new int[this.field3643];
		}
		for (int var5 = 0; var5 < this.field3628; var5++) {
			for (int var6 = 0; var6 < this.field3643; var6++) {
				this.field3634[var6] = 0;
				this.field3639[var6] = 0;
				this.field3640[var6] = 0;
				this.field3641[var6] = 0;
				this.field3642[var6] = 0;
			}
			for (int var7 = -5; var7 < this.field3627; var7++) {
				for (int var8 = 0; var8 < this.field3643; var8++) {
					int var9 = var7 + 5;
					int var10002;
					if (var9 < this.field3627) {
						int var10 = this.field3635[var5][var9][var8] & 0xFF;
						if (var10 > 0) {
							FloorUnderlayType var11 = this.field3668.method11895(var10 - 1);
							this.field3634[var8] += var11.field6718;
							this.field3639[var8] += var11.field6714;
							this.field3640[var8] += var11.field6720;
							this.field3641[var8] += var11.field6721;
							var10002 = this.field3642[var8]++;
						}
					}
					int var12 = var7 - 5;
					if (var12 >= 0) {
						int var13 = this.field3635[var5][var12][var8] & 0xFF;
						if (var13 > 0) {
							FloorUnderlayType var14 = this.field3668.method11895(var13 - 1);
							this.field3634[var8] -= var14.field6718;
							this.field3639[var8] -= var14.field6714;
							this.field3640[var8] -= var14.field6720;
							this.field3641[var8] -= var14.field6721;
							var10002 = this.field3642[var8]--;
						}
					}
				}
				if (var7 >= 0) {
					int var15 = 0;
					int var16 = 0;
					int var17 = 0;
					int var18 = 0;
					int var19 = 0;
					for (int var20 = -5; var20 < this.field3643; var20++) {
						int var21 = var20 + 5;
						if (var21 < this.field3643) {
							var15 += this.field3634[var21];
							var16 += this.field3639[var21];
							var17 += this.field3640[var21];
							var18 += this.field3641[var21];
							var19 += this.field3642[var21];
						}
						int var22 = var20 - 5;
						if (var22 >= 0) {
							var15 -= this.field3634[var22];
							var16 -= this.field3639[var22];
							var17 -= this.field3640[var22];
							var18 -= this.field3641[var22];
							var19 -= this.field3642[var22];
						}
						if (var20 >= 0 && var18 > 0 && var19 > 0) {
							var4[var7][var20] = ColourUtils.method6323(var15 * 256 / var18, var16 / var19, var17 / var19);
						}
					}
				}
			}
			if (this.field3624) {
				this.method5845(arg0, this.field3619.field4498[var5], var5, var4, var5 == 0 ? arg1 : null, var5 == 0 ? arg2 : null);
			} else {
				this.method5897(arg0, this.field3619.field4498[var5], var5, var4, var5 == 0 ? arg1 : null, var5 == 0 ? arg2 : null);
			}
			this.field3635[var5] = null;
			this.field3636[var5] = null;
			this.field3703[var5] = null;
			this.field3621[var5] = null;
		}
		if (!this.field3644) {
			if (this.field3629 != 0) {
				this.field3619.method7453();
			}
			if (this.field3623) {
				this.field3619.method7455();
			}
		}
		for (int var23 = 0; var23 < this.field3628; var23++) {
			this.field3619.field4498[var23].method195();
		}
	}

	@ObfuscatedName("lq.z(Lra;Lxa;I[[ILxa;Lxa;B)V")
	public void method5897(RendererToolkit arg0, FloorModel arg1, int arg2, int[][] arg3, FloorModel arg4, FloorModel arg5) {
		for (int var7 = 0; var7 < this.field3627; var7++) {
			for (int var8 = 0; var8 < this.field3643; var8++) {
				byte var9 = this.field3703[arg2][var7][var8];
				byte var10 = this.field3621[arg2][var7][var8];
				int var11 = this.field3636[arg2][var7][var8] & 0xFF;
				int var12 = this.field3635[arg2][var7][var8] & 0xFF;
				FloorOverlayType var13 = var11 == 0 ? null : this.field3692.method8503(var11 - 1);
				FloorUnderlayType var14 = var12 == 0 ? null : this.field3668.method11895(var12 - 1);
				if (var9 == 0 && var13 == null) {
					var9 = 12;
				}
				FloorOverlayType var15 = var13;
				if (var13 != null && var13.field5094 == -1 && var13.field5091 == -1) {
					var15 = var13;
					var13 = null;
				}
				if (var13 != null || var14 != null) {
					this.field3698 = field3658[var9];
					this.field3681 = field3657[var9];
					int var16 = (var14 == null ? 0 : this.field3698) + (var13 == null ? 0 : this.field3681);
					int var17 = 0;
					this.field3688 = 0;
					this.field3691 = var13 == null ? -1 : var13.field5092;
					int var18 = var14 == null ? -1 : var14.field6713;
					int[] var19 = new int[var16];
					int[] var20 = new int[var16];
					int[] var21 = new int[var16];
					int[] var22 = new int[var16];
					int[] var23 = new int[var16];
					int[] var24 = new int[var16];
					int[] var25 = var13 == null || var13.field5091 == -1 ? null : new int[var16];
					if (var13 == null) {
						this.field3688 += this.field3681;
					} else {
						for (int var26 = 0; var26 < this.field3681; var26++) {
							var19[var17] = field3667[var9][this.field3688];
							var20[var17] = field3673[var9][this.field3688];
							var21[var17] = field3651[var9][this.field3688];
							var23[var17] = this.field3691;
							var24[var17] = var13.field5087;
							var22[var17] = var13.field5094;
							if (var25 != null) {
								var25[var17] = var13.field5091;
							}
							var17++;
							this.field3688++;
						}
						if (!this.field3644 && arg2 == 0) {
							this.field3619.method7416(var7, var8, var13.field5102, var13.field5099 * 1322381256, var13.field5100, var13.field5101, var13.field5090, var13.field5098);
						}
					}
					if (var14 != null) {
						for (int var27 = 0; var27 < this.field3698; var27++) {
							var19[var17] = field3667[var9][this.field3688];
							var20[var17] = field3673[var9][this.field3688];
							var21[var17] = field3651[var9][this.field3688];
							var23[var17] = var18;
							var24[var17] = var14.field6715;
							var22[var17] = arg3[var7][var8];
							if (var25 != null) {
								var25[var17] = var22[var17];
							}
							var17++;
							this.field3688++;
						}
					}
					int var28 = field3663.length;
					int[] var29 = new int[var28];
					int[] var30 = new int[var28];
					int[] var31 = arg5 == null ? null : new int[var28];
					int[] var32 = arg5 == null && arg4 == null ? null : new int[var28];
					for (int var33 = 0; var33 < var28; var33++) {
						int var34 = field3663[var33];
						int var35 = field3664[var33];
						if (var10 == 0) {
							var29[var33] = var34;
							var30[var33] = var35;
						} else if (var10 == 1) {
							var29[var33] = var35;
							var30[var33] = 512 - var34;
						} else if (var10 == 2) {
							var29[var33] = 512 - var34;
							var30[var33] = 512 - var35;
						} else if (var10 == 3) {
							var29[var33] = 512 - var35;
							var30[var33] = var34;
						}
						if (var31 != null && field3665[var9][var33]) {
							int var38 = (var7 << 9) + var29[var33];
							int var39 = (var8 << 9) + var30[var33];
							var31[var33] = arg5.method196(var38, var39) - arg1.method196(var38, var39);
						}
						if (var32 != null) {
							if (arg5 != null && !field3665[var9][var33]) {
								int var40 = (var7 << 9) + var29[var33];
								int var41 = (var8 << 9) + var30[var33];
								var32[var33] = arg1.method196(var40, var41) - arg5.method196(var40, var41);
							} else if (arg4 != null && !field3666[var9][var33]) {
								int var42 = (var7 << 9) + var29[var33];
								int var43 = (var8 << 9) + var30[var33];
								var32[var33] = arg4.method196(var42, var43) - arg1.method196(var42, var43);
							}
						}
					}
					int var44 = arg1.method199(var7, var8);
					int var45 = arg1.method199(var7 + 1, var8);
					int var46 = arg1.method199(var7 + 1, var8 + 1);
					int var47 = arg1.method199(var7, var8 + 1);
					boolean var48 = this.field3618.method5794(var7, var8);
					if (var48 && arg2 > 1 || !var48 && arg2 > 0) {
						boolean var49 = true;
						if (var14 != null && !var14.field6717) {
							var49 = false;
						} else if (var12 == 0 && var9 != 0) {
							var49 = false;
						} else if (var11 > 0 && var15 != null && !var15.field5103) {
							var49 = false;
						}
						if (var49 && var44 == var45 && var44 == var46 && var44 == var47) {
							this.field3659[arg2][var7][var8] = (byte) (this.field3659[arg2][var7][var8] | 0x4);
						}
					}
					WaterFogData var50 = new WaterFogData();
					if (this.field3644) {
						var50.field1475 = this.field3619.method7411(var7, var8);
						var50.field1471 = this.field3619.method7410(var7, var8);
						var50.field1474 = this.field3619.method7489(var7, var8);
						var50.field1470 = this.field3619.method7413(var7, var8);
						var50.field1476 = this.field3619.method7505(var7, var8);
						var50.field1472 = this.field3619.method7501(var7, var8);
					}
					arg1.method219(var7, var8, var29, var31, var30, var32, var19, var20, var21, var22, var25, var23, var24, var50, false);
					this.field3619.method7408(arg2, var7, var8);
				}
			}
		}
	}

	@ObfuscatedName("lq.n(Lra;Lxa;I[[ILxa;Lxa;B)V")
	public void method5845(RendererToolkit arg0, FloorModel arg1, int arg2, int[][] arg3, FloorModel arg4, FloorModel arg5) {
		byte[][] var7 = this.field3703[arg2];
		byte[][] var8 = this.field3621[arg2];
		byte[][] var9 = this.field3635[arg2];
		byte[][] var10 = this.field3636[arg2];
		boolean[] var11 = new boolean[4];
		for (int var12 = 0; var12 < this.field3627; var12++) {
			int var13 = var12 < this.field3627 - 1 ? var12 + 1 : var12;
			for (int var14 = 0; var14 < this.field3643; var14++) {
				int var15 = var14 < this.field3643 - 1 ? var14 + 1 : var14;
				this.field3669 = var7[var12][var14];
				this.field3688 = var8[var12][var14];
				int var16 = var10[var12][var14] & 0xFF;
				int var17 = var9[var12][var14] & 0xFF;
				if (var16 != 0 || var17 != 0) {
					FloorOverlayType var18 = var16 == 0 ? null : this.field3692.method8503(var16 - 1);
					FloorUnderlayType var19 = var17 == 0 ? null : this.field3668.method11895(var17 - 1);
					if (this.field3669 == 0 && var18 == null) {
						this.field3669 = 12;
					}
					this.field3694 = false;
					this.field3695 = false;
					var11[3] = false;
					var11[2] = false;
					var11[1] = false;
					var11[0] = false;
					FloorOverlayType var23 = var18;
					if (var18 != null) {
						if (var18.field5094 == -1 && var18.field5091 == -1) {
							var23 = var18;
							var18 = null;
						} else if (var19 != null && this.field3669 != 0) {
							this.field3695 = var18.field5097;
						}
					}
					this.field3688 = this.method5905(var17, var12, var14, var13, var15, arg1, var9);
					for (int var24 = 0; var24 < 13; var24++) {
						this.field3648[var24] = -1;
						this.field3686[var24] = 1;
					}
					this.method5835(arg0, var18, var19, var12, var14, var7, var8, var10, var11);
					this.field3678 = !this.field3695 && !var11[0] && !var11[2] && !var11[1] && !var11[3];
					this.method5872(var18, var19);
					int var25 = this.field3698 + this.field3681;
					if (var25 <= 0) {
						this.field3619.method7408(arg2, var12, var14);
					} else {
						if (var11[0]) {
							var25++;
						}
						if (var11[2]) {
							var25++;
						}
						if (var11[1]) {
							var25++;
						}
						if (var11[3]) {
							var25++;
						}
						this.field3626 = 0;
						this.field3690 = 0;
						int var26 = var25 * 3;
						int[] var27 = this.field3685 ? new int[var26] : null;
						int[] var28 = new int[var26];
						int[] var29 = new int[var26];
						int[] var30 = new int[var26];
						int[] var31 = new int[var26];
						int[] var32 = new int[var26];
						int[] var33 = arg5 == null ? null : new int[var26];
						int[] var34 = arg5 == null && arg4 == null ? null : new int[var26];
						this.method5849(arg0, arg2, var12, var14, var18, var11, var27, var28, var29, var30, var31, var32, var33, var34, arg1, arg5, arg4);
						int var35 = var9[var12][var15] & 0xFF;
						int var36 = var9[var13][var15] & 0xFF;
						int var37 = var9[var13][var14] & 0xFF;
						this.method5867(arg0, arg2, var12, var14, var13, var15, var19, var17, var35, var36, var37, var11, var27, var28, var29, var30, var31, var32, var33, var34, arg3, arg1, arg5, arg4);
						this.method5894(arg1, var19, var23, arg2, var12, var14, var13, var15, var17, var16);
						WaterFogData var38 = new WaterFogData();
						if (this.field3644) {
							var38.field1475 = this.field3619.method7411(var12, var14);
							var38.field1471 = this.field3619.method7410(var12, var14);
							var38.field1474 = this.field3619.method7489(var12, var14);
							var38.field1470 = this.field3619.method7413(var12, var14);
							var38.field1476 = this.field3619.method7505(var12, var14);
							var38.field1472 = this.field3619.method7501(var12, var14);
						}
						arg1.method193(var12, var14, var28, var33, var29, var34, var30, var27, var31, var32, var38, this.field3694);
						this.field3619.method7408(arg2, var12, var14);
					}
				}
			}
		}
	}

	@ObfuscatedName("lq.o(IIIIILxa;[[BB)I")
	public int method5905(int arg0, int arg1, int arg2, int arg3, int arg4, FloorModel arg5, byte[][] arg6) {
		if (this.field3669 != 0 && this.field3669 != 12 || arg1 <= 0 || arg2 <= 0 || arg1 >= this.field3627 || arg2 >= this.field3643) {
			return this.field3688;
		}
		byte var8 = 0;
		byte var9 = 0;
		byte var10 = 0;
		byte var11 = 0;
		int var12 = var8 + (arg6[arg1 - 1][arg2 - 1] == arg0 ? 1 : -1);
		int var13 = var9 + (arg6[arg3][arg2 - 1] == arg0 ? 1 : -1);
		int var14 = var10 + (arg6[arg3][arg4] == arg0 ? 1 : -1);
		int var15 = var11 + (arg6[arg1 - 1][arg4] == arg0 ? 1 : -1);
		if (arg6[arg1][arg2 - 1] == arg0) {
			var12++;
			var13++;
		} else {
			var12--;
			var13--;
		}
		if (arg6[arg3][arg2] == arg0) {
			var13++;
			var14++;
		} else {
			var13--;
			var14--;
		}
		if (arg6[arg1][arg4] == arg0) {
			var14++;
			var15++;
		} else {
			var14--;
			var15--;
		}
		if (arg6[arg1 - 1][arg2] == arg0) {
			var15++;
			var12++;
		} else {
			var15--;
			var12--;
		}
		int var16 = var12 - var14;
		if (var16 < 0) {
			var16 = -var16;
		}
		int var17 = var13 - var15;
		if (var17 < 0) {
			var17 = -var17;
		}
		if (var16 == var17) {
			var16 = arg5.method199(arg1, arg2) - arg5.method199(arg3, arg4);
			if (var16 < 0) {
				var16 = -var16;
			}
			var17 = arg5.method199(arg3, arg2) - arg5.method199(arg1, arg4);
			if (var17 < 0) {
				var17 = -var17;
			}
		}
		return var16 < var17 ? 1 : 0;
	}

	@ObfuscatedName("lq.q(Lra;Lry;Luc;II[[B[[B[[B[ZI)V")
	public void method5835(RendererToolkit arg0, FloorOverlayType arg1, FloorUnderlayType arg2, int arg3, int arg4, byte[][] arg5, byte[][] arg6, byte[][] arg7, boolean[] arg8) {
		boolean[] var10 = arg1 != null && arg1.field5097 ? field3675[this.field3669] : field3670[this.field3669];
		this.method5851(arg0, arg1, arg2, arg3, arg4, this.field3627, this.field3643, arg7, arg5, arg6, arg8);
		this.field3685 = arg1 != null && arg1.field5094 != arg1.field5091;
		if (!this.field3685) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (this.field3648[var11] >= 0 && this.field3689[var11] != this.field3682[var11]) {
					this.field3685 = true;
					break;
				}
			}
		}
		if (!var10[this.field3688 + 1 & 0x3]) {
			arg8[1] |= (this.field3686[2] & this.field3686[4]) == 0;
		}
		if (!var10[this.field3688 + 3 & 0x3]) {
			arg8[3] |= (this.field3686[6] & this.field3686[0]) == 0;
		}
		if (!var10[this.field3688 & 0x3]) {
			arg8[0] |= (this.field3686[0] & this.field3686[2]) == 0;
		}
		if (!var10[this.field3688 + 2 & 0x3]) {
			arg8[2] |= (this.field3686[4] & this.field3686[6]) == 0;
		}
		if (this.field3695 || this.field3669 != 0 && this.field3669 != 12) {
			return;
		}
		if (arg8[0] && !arg8[1] && !arg8[2] && arg8[3]) {
			arg8[3] = false;
			arg8[0] = false;
			this.field3669 = this.field3669 == 0 ? 13 : 14;
			this.field3688 = 0;
		} else if (arg8[0] && arg8[1] && !arg8[2] && !arg8[3]) {
			arg8[1] = false;
			arg8[0] = false;
			this.field3669 = this.field3669 == 0 ? 13 : 14;
			this.field3688 = 3;
		} else if (!arg8[0] && arg8[1] && arg8[2] && !arg8[3]) {
			arg8[2] = false;
			arg8[1] = false;
			this.field3669 = this.field3669 == 0 ? 13 : 14;
			this.field3688 = 2;
		} else if (!arg8[0] && !arg8[1] && arg8[2] && arg8[3]) {
			arg8[3] = false;
			arg8[2] = false;
			this.field3669 = this.field3669 == 0 ? 13 : 14;
			this.field3688 = 1;
		}
	}

	@ObfuscatedName("lq.p(Lry;Luc;I)V")
	public void method5872(FloorOverlayType arg0, FloorUnderlayType arg1) {
		if (this.field3678) {
			this.field3700 = field3667[this.field3669];
			this.field3638 = field3673[this.field3669];
			this.field3702 = field3651[this.field3669];
			this.field3681 = arg0 == null ? 0 : field3657[this.field3669];
			this.field3698 = arg1 == null ? 0 : field3658[this.field3669];
		} else if (this.field3695) {
			this.field3700 = field3677[this.field3669];
			this.field3638 = field3687[this.field3669];
			this.field3702 = field3679[this.field3669];
			this.field3681 = arg0 == null ? 0 : field3661[this.field3669];
			this.field3698 = arg1 == null ? 0 : field3662[this.field3669];
			this.field3693 = field3676[this.field3669];
		} else {
			this.field3700 = field3637[this.field3669];
			this.field3638 = field3616[this.field3669];
			this.field3702 = field3674[this.field3669];
			this.field3681 = arg0 == null ? 0 : field3699[this.field3669];
			this.field3698 = arg1 == null ? 0 : field3660[this.field3669];
			this.field3693 = field3671[this.field3669];
		}
	}

	@ObfuscatedName("lq.w(Lra;IIILry;[Z[I[I[I[I[I[I[I[ILxa;Lxa;Lxa;I)V")
	public void method5849(RendererToolkit arg0, int arg1, int arg2, int arg3, FloorOverlayType arg4, boolean[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, FloorModel arg14, FloorModel arg15, FloorModel arg16) {
		this.field3633 = -1;
		this.field3691 = -1;
		this.field3617 = 256;
		if (arg4 != null) {
			this.field3633 = arg4.field5094;
			this.field3691 = arg4.field5092;
			this.field3617 = arg4.field5087;
			int var18 = method5549(arg0, arg4);
			for (int var19 = 0; var19 < this.field3681; var19++) {
				boolean var20 = false;
				byte var21;
				if (arg5[-this.field3688 & 0x3] && this.field3626 == this.field3693[0]) {
					this.field3680[0] = this.field3700[this.field3626];
					this.field3680[1] = 1;
					this.field3680[2] = this.field3702[this.field3626];
					this.field3680[3] = 1;
					this.field3680[4] = this.field3638[this.field3626];
					this.field3680[5] = this.field3702[this.field3626];
					var21 = 6;
				} else if (arg5[2 - this.field3688 & 0x3] && this.field3626 == this.field3693[2]) {
					this.field3680[0] = this.field3700[this.field3626];
					this.field3680[1] = 5;
					this.field3680[2] = this.field3702[this.field3626];
					this.field3680[3] = 5;
					this.field3680[4] = this.field3638[this.field3626];
					this.field3680[5] = this.field3702[this.field3626];
					var21 = 6;
				} else if (arg5[1 - this.field3688 & 0x3] && this.field3626 == this.field3693[1]) {
					this.field3680[0] = this.field3700[this.field3626];
					this.field3680[1] = 3;
					this.field3680[2] = this.field3702[this.field3626];
					this.field3680[3] = 3;
					this.field3680[4] = this.field3638[this.field3626];
					this.field3680[5] = this.field3702[this.field3626];
					var21 = 6;
				} else if (arg5[3 - this.field3688 & 0x3] && this.field3626 == this.field3693[3]) {
					this.field3680[0] = this.field3700[this.field3626];
					this.field3680[1] = 7;
					this.field3680[2] = this.field3702[this.field3626];
					this.field3680[3] = 7;
					this.field3680[4] = this.field3638[this.field3626];
					this.field3680[5] = this.field3702[this.field3626];
					var21 = 6;
				} else {
					this.field3680[0] = this.field3700[this.field3626];
					this.field3680[1] = this.field3638[this.field3626];
					this.field3680[2] = this.field3702[this.field3626];
					var21 = 3;
				}
				for (int var22 = 0; var22 < var21; var22++) {
					int var23 = this.field3680[var22];
					int var24 = var23 - this.field3688 * 2 & 0x7;
					int var25 = field3663[var23];
					int var26 = field3664[var23];
					int var27;
					int var28;
					if (this.field3688 == 1) {
						var27 = var26;
						var28 = 512 - var25;
					} else if (this.field3688 == 2) {
						var27 = 512 - var25;
						var28 = 512 - var26;
					} else if (this.field3688 == 3) {
						var27 = 512 - var26;
						var28 = var25;
					} else {
						var27 = var25;
						var28 = var26;
					}
					arg7[this.field3690] = var27;
					arg8[this.field3690] = var28;
					if (arg12 != null && field3665[this.field3669][var23]) {
						int var29 = (arg2 << 9) + var27;
						int var30 = (arg3 << 9) + var28;
						arg12[this.field3690] = arg15.method196(var29, var30) - arg14.method196(var29, var30);
					}
					if (arg13 != null) {
						if (arg15 != null && !field3665[this.field3669][var23]) {
							int var31 = (arg2 << 9) + var27;
							int var32 = (arg3 << 9) + var28;
							arg13[this.field3690] = arg14.method196(var31, var32) - arg15.method196(var31, var32);
						} else if (arg16 != null && !field3666[this.field3669][var23]) {
							int var33 = (arg2 << 9) + var27;
							int var34 = (arg3 << 9) + var28;
							arg13[this.field3690] = arg16.method196(var33, var34) - arg14.method196(var33, var34);
						}
					}
					if (var23 < 8 && this.field3648[var24] > arg4.field5096) {
						if (arg6 != null) {
							arg6[this.field3690] = this.field3682[var24];
						}
						arg11[this.field3690] = this.field3684[var24];
						arg10[this.field3690] = this.field3696[var24];
						arg9[this.field3690] = this.field3689[var24];
					} else {
						if (arg6 != null) {
							arg6[this.field3690] = var18;
						}
						arg10[this.field3690] = arg4.field5092;
						arg11[this.field3690] = arg4.field5087;
						arg9[this.field3690] = this.field3633;
					}
					this.field3690++;
				}
				this.field3626++;
			}
			if (!this.field3644 && arg1 == 0) {
				this.field3619.method7416(arg2, arg3, arg4.field5102, arg4.field5099 * 1322381256, arg4.field5100, arg4.field5101, arg4.field5090, arg4.field5098);
			}
			if (this.field3669 != 12 && arg4.field5094 != -1 && arg4.field5095) {
				this.field3694 = true;
			}
		} else if (this.field3678) {
			this.field3626 += field3657[this.field3669];
		} else if (this.field3695) {
			this.field3626 += field3661[this.field3669];
		} else {
			this.field3626 += field3699[this.field3669];
		}
	}

	@ObfuscatedName("lq.b(Lra;IIIIILuc;IIII[Z[I[I[I[I[I[I[I[I[[ILxa;Lxa;Lxa;B)V")
	public void method5867(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, FloorUnderlayType arg6, int arg7, int arg8, int arg9, int arg10, boolean[] arg11, int[] arg12, int[] arg13, int[] arg14, int[] arg15, int[] arg16, int[] arg17, int[] arg18, int[] arg19, int[][] arg20, FloorModel arg21, FloorModel arg22, FloorModel arg23) {
		if (arg6 == null) {
			return;
		}
		if (arg8 == 0) {
			arg8 = arg7;
		}
		if (arg9 == 0) {
			arg9 = arg7;
		}
		if (arg10 == 0) {
			arg10 = arg7;
		}
		FloorUnderlayType var25 = this.field3668.method11895(arg7 - 1);
		FloorUnderlayType var26 = this.field3668.method11895(arg8 - 1);
		FloorUnderlayType var27 = this.field3668.method11895(arg9 - 1);
		FloorUnderlayType var28 = this.field3668.method11895(arg10 - 1);
		for (int var29 = 0; var29 < this.field3698; var29++) {
			boolean var30 = false;
			byte var31;
			if (arg11[-this.field3688 & 0x3] && this.field3626 == this.field3693[0]) {
				this.field3680[0] = this.field3700[this.field3626];
				this.field3680[1] = 1;
				this.field3680[2] = this.field3702[this.field3626];
				this.field3680[3] = 1;
				this.field3680[4] = this.field3638[this.field3626];
				this.field3680[5] = this.field3702[this.field3626];
				var31 = 6;
			} else if (arg11[2 - this.field3688 & 0x3] && this.field3626 == this.field3693[2]) {
				this.field3680[0] = this.field3700[this.field3626];
				this.field3680[1] = 5;
				this.field3680[2] = this.field3702[this.field3626];
				this.field3680[3] = 5;
				this.field3680[4] = this.field3638[this.field3626];
				this.field3680[5] = this.field3702[this.field3626];
				var31 = 6;
			} else if (arg11[1 - this.field3688 & 0x3] && this.field3626 == this.field3693[1]) {
				this.field3680[0] = this.field3700[this.field3626];
				this.field3680[1] = 3;
				this.field3680[2] = this.field3702[this.field3626];
				this.field3680[3] = 3;
				this.field3680[4] = this.field3638[this.field3626];
				this.field3680[5] = this.field3702[this.field3626];
				var31 = 6;
			} else if (arg11[3 - this.field3688 & 0x3] && this.field3626 == this.field3693[3]) {
				this.field3680[0] = this.field3700[this.field3626];
				this.field3680[1] = 7;
				this.field3680[2] = this.field3702[this.field3626];
				this.field3680[3] = 7;
				this.field3680[4] = this.field3638[this.field3626];
				this.field3680[5] = this.field3702[this.field3626];
				var31 = 6;
			} else {
				this.field3680[0] = this.field3700[this.field3626];
				this.field3680[1] = this.field3638[this.field3626];
				this.field3680[2] = this.field3702[this.field3626];
				var31 = 3;
			}
			for (int var32 = 0; var32 < var31; var32++) {
				int var33 = this.field3680[var32];
				int var34 = var33 - this.field3688 * 2 & 0x7;
				int var35 = field3663[var33];
				int var36 = field3664[var33];
				int var37;
				int var38;
				if (this.field3688 == 1) {
					var37 = var36;
					var38 = 512 - var35;
				} else if (this.field3688 == 2) {
					var37 = 512 - var35;
					var38 = 512 - var36;
				} else if (this.field3688 == 3) {
					var37 = 512 - var36;
					var38 = var35;
				} else {
					var37 = var35;
					var38 = var36;
				}
				arg13[this.field3690] = var37;
				arg14[this.field3690] = var38;
				if (arg18 != null && field3665[this.field3669][var33]) {
					int var39 = (arg2 << 9) + var37;
					int var40 = (arg3 << 9) + var38;
					arg18[this.field3690] = arg22.method196(var39, var40) - arg21.method196(var39, var40);
				}
				if (arg19 != null) {
					if (arg22 != null && !field3665[this.field3669][var33]) {
						int var41 = (arg2 << 9) + var37;
						int var42 = (arg3 << 9) + var38;
						arg19[this.field3690] = arg21.method196(var41, var42) - arg22.method196(var41, var42);
					} else if (arg23 != null && !field3666[this.field3669][var33]) {
						int var43 = (arg2 << 9) + var37;
						int var44 = (arg3 << 9) + var38;
						arg19[this.field3690] = arg23.method196(var43, var44) - arg21.method196(var43, var44);
					}
				}
				if (var33 < 8 && this.field3648[var34] >= 0) {
					if (arg12 != null) {
						arg12[this.field3690] = this.field3682[var34];
					}
					arg17[this.field3690] = this.field3684[var34];
					arg16[this.field3690] = this.field3696[var34];
					arg15[this.field3690] = this.field3689[var34];
				} else {
					if (this.field3695 && field3665[this.field3669][var33]) {
						arg16[this.field3690] = this.field3691;
						arg17[this.field3690] = this.field3617;
						arg15[this.field3690] = this.field3633;
					} else if (var37 == 0 && var38 == 0) {
						arg15[this.field3690] = arg20[arg2][arg3];
						arg16[this.field3690] = var25.field6713;
						arg17[this.field3690] = var25.field6715;
					} else if (var37 == 0 && var38 == 512) {
						arg15[this.field3690] = arg20[arg2][arg5];
						arg16[this.field3690] = var26.field6713;
						arg17[this.field3690] = var26.field6715;
					} else if (var37 == 512 && var38 == 512) {
						arg15[this.field3690] = arg20[arg4][arg5];
						arg16[this.field3690] = var27.field6713;
						arg17[this.field3690] = var27.field6715;
					} else if (var37 == 512 && var38 == 0) {
						arg15[this.field3690] = arg20[arg4][arg3];
						arg16[this.field3690] = var28.field6713;
						arg17[this.field3690] = var28.field6715;
					} else {
						if (var37 < 256) {
							if (var38 < 256) {
								arg16[this.field3690] = var25.field6713;
								arg17[this.field3690] = var25.field6715;
							} else {
								arg16[this.field3690] = var26.field6713;
								arg17[this.field3690] = var26.field6715;
							}
						} else if (var38 < 256) {
							arg16[this.field3690] = var28.field6713;
							arg17[this.field3690] = var28.field6715;
						} else {
							arg16[this.field3690] = var27.field6713;
							arg17[this.field3690] = var27.field6715;
						}
						int var45 = method5029(arg20[arg2][arg3], arg20[arg4][arg3], var37 << 7 >> 9);
						int var46 = method5029(arg20[arg2][arg5], arg20[arg4][arg5], var37 << 7 >> 9);
						arg15[this.field3690] = method5029(var45, var46, var38 << 7 >> 9);
					}
					if (arg12 != null) {
						arg12[this.field3690] = arg15[this.field3690];
					}
				}
				this.field3690++;
			}
			this.field3626++;
		}
		if (this.field3669 != 0 && arg6.field6719) {
			this.field3694 = true;
		}
	}

	@ObfuscatedName("lq.x(Lxa;Luc;Lry;IIIIIIII)V")
	public void method5894(FloorModel arg0, FloorUnderlayType arg1, FloorOverlayType arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = arg0.method199(arg4, arg5);
		int var12 = arg0.method199(arg6, arg5);
		int var13 = arg0.method199(arg6, arg7);
		int var14 = arg0.method199(arg4, arg7);
		boolean var15 = this.field3618.method5794(arg4, arg5);
		if ((!var15 || arg3 <= 1) && (var15 || arg3 <= 0)) {
			return;
		}
		boolean var16 = true;
		if (arg1 != null && !arg1.field6717) {
			var16 = false;
		} else if (arg8 == 0 && this.field3669 != 0) {
			var16 = false;
		} else if (arg9 > 0 && arg2 != null && !arg2.field5103) {
			var16 = false;
		}
		if (var16 && var11 == var12 && var11 == var13 && var11 == var14) {
			this.field3659[arg3][arg4][arg5] = (byte) (this.field3659[arg3][arg4][arg5] | 0x4);
		}
	}

	@ObfuscatedName("lq.i(Lra;Lry;Luc;IIII[[B[[B[[B[ZI)V")
	public final void method5851(RendererToolkit arg0, FloorOverlayType arg1, FloorUnderlayType arg2, int arg3, int arg4, int arg5, int arg6, byte[][] arg7, byte[][] arg8, byte[][] arg9, boolean[] arg10) {
		boolean[] var12 = arg1 != null && arg1.field5097 ? field3675[this.field3669] : field3670[this.field3669];
		if (arg4 > 0) {
			if (arg3 > 0) {
				int var13 = arg7[arg3 - 1][arg4 - 1] & 0xFF;
				if (var13 > 0) {
					FloorOverlayType var14 = this.field3692.method8503(var13 - 1);
					if (var14.field5094 != -1 && var14.field5097) {
						byte var15 = arg8[arg3 - 1][arg4 - 1];
						int var16 = arg9[arg3 - 1][arg4 - 1] * 2 + 4 & 0x7;
						int var17 = method5549(arg0, var14);
						if (field3665[var15][var16]) {
							this.field3689[0] = var14.field5094;
							this.field3682[0] = var17;
							this.field3696[0] = var14.field5092;
							this.field3684[0] = var14.field5087;
							this.field3648[0] = var14.field5096;
							this.field3686[0] = 256;
						}
					}
				}
			}
			if (arg3 < arg5 - 1) {
				int var18 = arg7[arg3 + 1][arg4 - 1] & 0xFF;
				if (var18 > 0) {
					FloorOverlayType var19 = this.field3692.method8503(var18 - 1);
					if (var19.field5094 != -1 && var19.field5097) {
						byte var20 = arg8[arg3 + 1][arg4 - 1];
						int var21 = arg9[arg3 + 1][arg4 - 1] * 2 + 6 & 0x7;
						int var22 = method5549(arg0, var19);
						if (field3665[var20][var21]) {
							this.field3689[2] = var19.field5094;
							this.field3682[2] = var22;
							this.field3696[2] = var19.field5092;
							this.field3684[2] = var19.field5087;
							this.field3648[2] = var19.field5096;
							this.field3686[2] = 512;
						}
					}
				}
			}
		}
		if (arg4 < arg6 - 1) {
			if (arg3 > 0) {
				int var23 = arg7[arg3 - 1][arg4 + 1] & 0xFF;
				if (var23 > 0) {
					FloorOverlayType var24 = this.field3692.method8503(var23 - 1);
					if (var24.field5094 != -1 && var24.field5097) {
						byte var25 = arg8[arg3 - 1][arg4 + 1];
						int var26 = arg9[arg3 - 1][arg4 + 1] * 2 + 2 & 0x7;
						int var27 = method5549(arg0, var24);
						if (field3665[var25][var26]) {
							this.field3689[6] = var24.field5094;
							this.field3682[6] = var27;
							this.field3696[6] = var24.field5092;
							this.field3684[6] = var24.field5087;
							this.field3648[6] = var24.field5096;
							this.field3686[6] = 64;
						}
					}
				}
			}
			if (arg3 < arg5 - 1) {
				int var28 = arg7[arg3 + 1][arg4 + 1] & 0xFF;
				if (var28 > 0) {
					FloorOverlayType var29 = this.field3692.method8503(var28 - 1);
					if (var29.field5094 != -1 && var29.field5097) {
						byte var30 = arg8[arg3 + 1][arg4 + 1];
						int var31 = arg9[arg3 + 1][arg4 + 1] * 2 & 0x7;
						int var32 = method5549(arg0, var29);
						if (field3665[var30][var31]) {
							this.field3689[4] = var29.field5094;
							this.field3682[4] = var32;
							this.field3696[4] = var29.field5092;
							this.field3684[4] = var29.field5087;
							this.field3648[4] = var29.field5096;
							this.field3686[4] = 128;
						}
					}
				}
			}
		}
		if (arg4 > 0) {
			int var33 = arg7[arg3][arg4 - 1] & 0xFF;
			if (var33 > 0) {
				FloorOverlayType var34 = this.field3692.method8503(var33 - 1);
				if (var34.field5094 != -1) {
					byte var35 = arg8[arg3][arg4 - 1];
					byte var36 = arg9[arg3][arg4 - 1];
					if (var34.field5097) {
						int var37 = 2;
						int var38 = var36 * 2 + 4;
						int var39 = method5549(arg0, var34);
						for (int var40 = 0; var40 < 3; var40++) {
							var38 &= 0x7;
							var37 &= 0x7;
							if (field3665[var35][var38] && this.field3648[var37] <= var34.field5096) {
								this.field3689[var37] = var34.field5094;
								this.field3682[var37] = var39;
								this.field3696[var37] = var34.field5092;
								this.field3684[var37] = var34.field5087;
								if (var34.field5096 == this.field3648[var37]) {
									this.field3686[var37] |= 0x20;
								} else {
									this.field3686[var37] = 32;
								}
								this.field3648[var37] = var34.field5096;
							}
							var38++;
							var37--;
						}
						if (!var12[this.field3688 & 0x3]) {
							arg10[0] = field3675[var35][var36 + 2 & 0x3];
						}
					} else if (!var12[this.field3688 & 0x3]) {
						arg10[0] = field3670[var35][var36 + 2 & 0x3];
					}
				}
			}
		}
		if (arg4 < arg6 - 1) {
			int var41 = arg7[arg3][arg4 + 1] & 0xFF;
			if (var41 > 0) {
				FloorOverlayType var42 = this.field3692.method8503(var41 - 1);
				if (var42.field5094 != -1) {
					byte var43 = arg8[arg3][arg4 + 1];
					byte var44 = arg9[arg3][arg4 + 1];
					if (var42.field5097) {
						int var45 = 4;
						int var46 = var44 * 2 + 2;
						int var47 = method5549(arg0, var42);
						for (int var48 = 0; var48 < 3; var48++) {
							var46 &= 0x7;
							var45 &= 0x7;
							if (field3665[var43][var46] && this.field3648[var45] <= var42.field5096) {
								this.field3689[var45] = var42.field5094;
								this.field3682[var45] = var47;
								this.field3696[var45] = var42.field5092;
								this.field3684[var45] = var42.field5087;
								if (var42.field5096 == this.field3648[var45]) {
									this.field3686[var45] |= 0x10;
								} else {
									this.field3686[var45] = 16;
								}
								this.field3648[var45] = var42.field5096;
							}
							var46--;
							var45++;
						}
						if (!var12[this.field3688 + 2 & 0x3]) {
							arg10[2] = field3675[var43][var44 & 0x3];
						}
					} else if (!var12[this.field3688 + 2 & 0x3]) {
						arg10[2] = field3670[var43][var44 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			int var49 = arg7[arg3 - 1][arg4] & 0xFF;
			if (var49 > 0) {
				FloorOverlayType var50 = this.field3692.method8503(var49 - 1);
				if (var50.field5094 != -1) {
					byte var51 = arg8[arg3 - 1][arg4];
					byte var52 = arg9[arg3 - 1][arg4];
					if (var50.field5097) {
						int var53 = 6;
						int var54 = var52 * 2 + 4;
						int var55 = method5549(arg0, var50);
						for (int var56 = 0; var56 < 3; var56++) {
							var54 &= 0x7;
							var53 &= 0x7;
							if (field3665[var51][var54] && this.field3648[var53] <= var50.field5096) {
								this.field3689[var53] = var50.field5094;
								this.field3682[var53] = var55;
								this.field3696[var53] = var50.field5092;
								this.field3684[var53] = var50.field5087;
								if (var50.field5096 == this.field3648[var53]) {
									this.field3686[var53] |= 0x8;
								} else {
									this.field3686[var53] = 8;
								}
								this.field3648[var53] = var50.field5096;
							}
							var54--;
							var53++;
						}
						if (!var12[this.field3688 + 3 & 0x3]) {
							arg10[3] = field3675[var51][var52 + 1 & 0x3];
						}
					} else if (!var12[this.field3688 + 3 & 0x3]) {
						arg10[3] = field3670[var51][var52 + 1 & 0x3];
					}
				}
			}
		}
		if (arg3 < arg5 - 1) {
			int var57 = arg7[arg3 + 1][arg4] & 0xFF;
			if (var57 > 0) {
				FloorOverlayType var58 = this.field3692.method8503(var57 - 1);
				if (var58.field5094 != -1) {
					byte var59 = arg8[arg3 + 1][arg4];
					byte var60 = arg9[arg3 + 1][arg4];
					if (var58.field5097) {
						int var61 = 4;
						int var62 = var60 * 2 + 6;
						int var63 = method5549(arg0, var58);
						for (int var64 = 0; var64 < 3; var64++) {
							var62 &= 0x7;
							var61 &= 0x7;
							if (field3665[var59][var62] && this.field3648[var61] <= var58.field5096) {
								this.field3689[var61] = var58.field5094;
								this.field3682[var61] = var63;
								this.field3696[var61] = var58.field5092;
								this.field3684[var61] = var58.field5087;
								if (var58.field5096 == this.field3648[var61]) {
									this.field3686[var61] |= 0x4;
								} else {
									this.field3686[var61] = 4;
								}
								this.field3648[var61] = var58.field5096;
							}
							var62++;
							var61--;
						}
						if (!var12[this.field3688 + 1 & 0x3]) {
							arg10[1] = field3675[var59][var60 + 3 & 0x3];
						}
					} else if (!var12[this.field3688 + 1 & 0x3]) {
						arg10[1] = field3670[var59][var60 + 3 & 0x3];
					}
				}
			}
		}
		if (arg1 == null || !arg1.field5097) {
			return;
		}
		int var65 = method5549(arg0, arg1);
		for (int var66 = 0; var66 < 8; var66++) {
			int var67 = var66 - this.field3688 * 2 & 0x7;
			if (field3665[this.field3669][var66] && this.field3648[var67] <= arg1.field5096) {
				this.field3689[var67] = arg1.field5094;
				this.field3682[var67] = var65;
				this.field3696[var67] = arg1.field5092;
				this.field3684[var67] = arg1.field5087;
				if (arg1.field5096 == this.field3648[var67]) {
					this.field3686[var67] |= 0x2;
				} else {
					this.field3686[var67] = 2;
				}
				this.field3648[var67] = arg1.field5096;
			}
		}
	}

	@ObfuscatedName("kj.v(Lra;Lry;I)I")
	public static final int method5549(RendererToolkit arg0, FloorOverlayType arg1) {
		if (arg1.field5091 != -1) {
			return arg1.field5091;
		}
		if (arg1.field5092 != -1) {
			Material var2 = arg0.field400.method889(arg1.field5092);
			if (!var2.field1250) {
				return var2.field1260;
			}
		}
		return arg1.field5094;
	}

	@ObfuscatedName("ki.k(IIII)I")
	public static final int method5029(int arg0, int arg1, int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		int var3 = 128 - arg2;
		int var4 = (arg0 & 0x7F) * var3 + (arg1 & 0x7F) * arg2 >> 7;
		int var5 = (arg0 & 0x380) * var3 + (arg1 & 0x380) * arg2 >> 7;
		int var6 = (arg0 & 0xFC00) * var3 + (arg1 & 0xFC00) * arg2 >> 7;
		return var6 & 0xFC00 | var5 & 0x380 | var4 & 0x7F;
	}

	@ObfuscatedName("eh.h(IIB)I")
	public static final int method3069(int arg0, int arg1) {
		int var2 = method12756(arg0 + 45365, arg1 + 91923, 4) - 128 + (method12756(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method12756(arg0, arg1, 1) - 128 >> 2);
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("xy.r(IIIB)I")
	public static final int method12756(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method7733(var3, var5);
		int var8 = method7733(var3 + 1, var5);
		int var9 = method7733(var3, var5 + 1);
		int var10 = method7733(var3 + 1, var5 + 1);
		int var11 = method6029(var7, var8, var4, arg2);
		int var12 = method6029(var9, var10, var4, arg2);
		return method6029(var11, var12, var6, arg2);
	}

	@ObfuscatedName("lp.g(IIIII)I")
	public static final int method6029(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Trig1.field3447[arg2 * 8192 / arg3] >> 1;
		return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("pt.y(III)I")
	public static final int method7733(int arg0, int arg1) {
		int var2 = method2429(arg0 - 1, arg1 - 1) + method2429(arg0 + 1, arg1 - 1) + method2429(arg0 - 1, arg1 + 1) + method2429(arg0 + 1, arg1 + 1);
		int var3 = method2429(arg0 - 1, arg1) + method2429(arg0 + 1, arg1) + method2429(arg0, arg1 - 1) + method2429(arg0, arg1 + 1);
		int var4 = method2429(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("cv.e(IIS)I")
	public static final int method2429(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		int var3 = var2 << 13 ^ var2;
		int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}
}
