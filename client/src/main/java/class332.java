
import deob.ObfuscatedName;

@ObfuscatedName("lb")
public class class332 {

	@ObfuscatedName("lb.j")
	public int field3546;

	@ObfuscatedName("lb.a")
	public byte[] field3550;

	@ObfuscatedName("lb.s")
	public int field3547;

	@ObfuscatedName("lb.c")
	public int field3549;

	@ObfuscatedName("lb.m")
	public int[] field3554;

	@ObfuscatedName("lb.t")
	public int[] field3551;

	@ObfuscatedName("lb.l")
	public class183 field3560;

	@ObfuscatedName("lb.f")
	public int field3553;

	@ObfuscatedName("lb.d")
	public int[] field3548;

	@ObfuscatedName("lb.z")
	public byte[][] field3555;

	@ObfuscatedName("lb.n")
	public int[] field3545;

	@ObfuscatedName("lb.o")
	public int[] field3557;

	@ObfuscatedName("lb.q")
	public int[][] field3556;

	@ObfuscatedName("lb.p")
	public int[][] field3559;

	@ObfuscatedName("lb.w")
	public class183[] field3558;

	@ObfuscatedName("lb.b")
	public int[] field3561;

	public class332(byte[] arg0, int arg1, byte[] arg2) {
		this.field3546 = class814.method7834(arg0, arg0.length);
		if (this.field3546 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.field3550 = class569.method2920(arg0, 0, arg0.length);
			for (int var4 = 0; var4 < 64; var4++) {
				if (this.field3550[var4] != arg2[var4]) {
					throw new RuntimeException();
				}
			}
		}
		this.method5594(arg0);
	}

	@ObfuscatedName("lb.u([BI)V")
	public void method5594(byte[] arg0) {
		class814 var2 = new class814(Statics.method1598(arg0));
		int var3 = var2.method15220();
		if (var3 < 5 || var3 > 7) {
			throw new RuntimeException();
		}
		if (var3 >= 6) {
			this.field3547 = var2.method15379();
		} else {
			this.field3547 = 0;
		}
		int var4 = var2.method15220();
		boolean var5 = (var4 & 0x1) != 0;
		boolean var6 = (var4 & 0x2) != 0;
		if (var3 >= 7) {
			this.field3549 = var2.method15259();
		} else {
			this.field3549 = var2.method15239();
		}
		int var7 = 0;
		int var8 = -1;
		this.field3554 = new int[this.field3549];
		if (var3 >= 7) {
			for (int var9 = 0; var9 < this.field3549; var9++) {
				this.field3554[var9] = var7 += var2.method15259();
				if (this.field3554[var9] > var8) {
					var8 = this.field3554[var9];
				}
			}
		} else {
			for (int var10 = 0; var10 < this.field3549; var10++) {
				this.field3554[var10] = var7 += var2.method15239();
				if (this.field3554[var10] > var8) {
					var8 = this.field3554[var10];
				}
			}
		}
		this.field3553 = var8 + 1;
		this.field3548 = new int[this.field3553];
		if (var6) {
			this.field3555 = new byte[this.field3553][];
		}
		this.field3545 = new int[this.field3553];
		this.field3557 = new int[this.field3553];
		this.field3556 = new int[this.field3553][];
		this.field3561 = new int[this.field3553];
		if (var5) {
			this.field3551 = new int[this.field3553];
			for (int var11 = 0; var11 < this.field3553; var11++) {
				this.field3551[var11] = -1;
			}
			for (int var12 = 0; var12 < this.field3549; var12++) {
				this.field3551[this.field3554[var12]] = var2.method15379();
			}
			this.field3560 = new class183(this.field3551);
		}
		for (int var13 = 0; var13 < this.field3549; var13++) {
			this.field3548[this.field3554[var13]] = var2.method15379();
		}
		if (var6) {
			for (int var14 = 0; var14 < this.field3549; var14++) {
				byte[] var15 = new byte[64];
				var2.method15263(var15, 0, 64);
				this.field3555[this.field3554[var14]] = var15;
			}
		}
		for (int var16 = 0; var16 < this.field3549; var16++) {
			this.field3545[this.field3554[var16]] = var2.method15379();
		}
		if (var3 >= 7) {
			for (int var17 = 0; var17 < this.field3549; var17++) {
				this.field3557[this.field3554[var17]] = var2.method15259();
			}
			for (int var18 = 0; var18 < this.field3549; var18++) {
				int var19 = this.field3554[var18];
				int var20 = this.field3557[var19];
				int var21 = 0;
				int var22 = -1;
				this.field3556[var19] = new int[var20];
				for (int var23 = 0; var23 < var20; var23++) {
					int var24 = this.field3556[var19][var23] = var21 += var2.method15259();
					if (var24 > var22) {
						var22 = var24;
					}
				}
				this.field3561[var19] = var22 + 1;
				if (var22 + 1 == var20) {
					this.field3556[var19] = null;
				}
			}
		} else {
			for (int var25 = 0; var25 < this.field3549; var25++) {
				this.field3557[this.field3554[var25]] = var2.method15239();
			}
			for (int var26 = 0; var26 < this.field3549; var26++) {
				int var27 = this.field3554[var26];
				int var28 = this.field3557[var27];
				int var29 = 0;
				int var30 = -1;
				this.field3556[var27] = new int[var28];
				for (int var31 = 0; var31 < var28; var31++) {
					int var32 = this.field3556[var27][var31] = var29 += var2.method15239();
					if (var32 > var30) {
						var30 = var32;
					}
				}
				this.field3561[var27] = var30 + 1;
				if (var30 + 1 == var28) {
					this.field3556[var27] = null;
				}
			}
		}
		if (!var5) {
			return;
		}
		this.field3559 = new int[var8 + 1][];
		this.field3558 = new class183[var8 + 1];
		for (int var33 = 0; var33 < this.field3549; var33++) {
			int var34 = this.field3554[var33];
			int var35 = this.field3557[var34];
			this.field3559[var34] = new int[this.field3561[var34]];
			for (int var36 = 0; var36 < this.field3561[var34]; var36++) {
				this.field3559[var34][var36] = -1;
			}
			for (int var37 = 0; var37 < var35; var37++) {
				int var38;
				if (this.field3556[var34] == null) {
					var38 = var37;
				} else {
					var38 = this.field3556[var34][var37];
				}
				this.field3559[var34][var38] = var2.method15379();
			}
			this.field3558[var34] = new class183(this.field3559[var34]);
		}
	}
}
