package com.jagex;

import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("ps")
public class class439 {

	@ObfuscatedName("ps.u")
	public class440 field4698;

	@ObfuscatedName("ps.j")
	public int field4688 = -1;

	@ObfuscatedName("ps.a")
	public int[] field4689 = null;

	@ObfuscatedName("ps.s")
	public int[] field4690 = null;

	@ObfuscatedName("ps.c")
	public int field4731 = 0;

	@ObfuscatedName("ps.m")
	public int field4691 = -1;

	@ObfuscatedName("ps.t")
	public int field4703 = -1;

	@ObfuscatedName("ps.l")
	public int field4694 = -1;

	@ObfuscatedName("ps.f")
	public int field4695 = -1;

	@ObfuscatedName("ps.d")
	public int field4696 = -1;

	@ObfuscatedName("ps.z")
	public int field4717 = -1;

	@ObfuscatedName("ps.n")
	public int field4710 = -1;

	@ObfuscatedName("ps.o")
	public int field4699 = -1;

	@ObfuscatedName("ps.q")
	public int field4726 = -1;

	@ObfuscatedName("ps.p")
	public int field4701 = -1;

	@ObfuscatedName("ps.w")
	public int field4702 = -1;

	@ObfuscatedName("ps.b")
	public int field4692 = -1;

	@ObfuscatedName("ps.x")
	public int field4697 = -1;

	@ObfuscatedName("ps.i")
	public int field4705 = -1;

	@ObfuscatedName("ps.v")
	public int field4706 = -1;

	@ObfuscatedName("ps.k")
	public int field4707 = -1;

	@ObfuscatedName("ps.h")
	public int field4708 = -1;

	@ObfuscatedName("ps.r")
	public int field4709 = -1;

	@ObfuscatedName("ps.g")
	public int field4693 = -1;

	@ObfuscatedName("ps.y")
	public int field4711 = -1;

	@ObfuscatedName("ps.e")
	public int field4712 = 0;

	@ObfuscatedName("ps.ay")
	public int field4713 = 0;

	@ObfuscatedName("ps.af")
	public int field4700 = 0;

	@ObfuscatedName("ps.ar")
	public int field4715 = 0;

	@ObfuscatedName("ps.an")
	public int[][] field4716;

	@ObfuscatedName("ps.ap")
	public int[][] field4729;

	@ObfuscatedName("ps.ag")
	public class314[] field4718;

	@ObfuscatedName("ps.as")
	public int[] field4719;

	@ObfuscatedName("ps.ai")
	public int[] field4720;

	@ObfuscatedName("ps.ao")
	public int field4723 = 0;

	@ObfuscatedName("ps.al")
	public int field4722 = 0;

	@ObfuscatedName("ps.at")
	public int field4687 = 0;

	@ObfuscatedName("ps.ax")
	public int field4724 = 0;

	@ObfuscatedName("ps.aw")
	public int field4725 = 0;

	@ObfuscatedName("ps.aa")
	public int field4721 = 0;

	@ObfuscatedName("ps.am")
	public int field4727 = 0;

	@ObfuscatedName("ps.ad")
	public int field4728 = 0;

	@ObfuscatedName("ps.az")
	public int field4704 = -1;

	@ObfuscatedName("ps.ak")
	public int field4730 = -1;

	@ObfuscatedName("ps.av")
	public boolean field4714 = true;

	@ObfuscatedName("ps.u(Laet;I)V")
	public void method7752(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method7762(arg0, var2);
		}
	}

	@ObfuscatedName("ps.j(Laet;II)V")
	public void method7762(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field4688 = arg0.method15411();
			this.field4694 = arg0.method15411();
		} else if (arg1 == 2) {
			this.field4702 = arg0.method15411();
		} else if (arg1 == 3) {
			this.field4692 = arg0.method15411();
		} else if (arg1 == 4) {
			this.field4697 = arg0.method15411();
		} else if (arg1 == 5) {
			this.field4705 = arg0.method15411();
		} else if (arg1 == 6) {
			this.field4710 = arg0.method15411();
		} else if (arg1 == 7) {
			this.field4699 = arg0.method15411();
		} else if (arg1 == 8) {
			this.field4726 = arg0.method15411();
		} else if (arg1 == 9) {
			this.field4701 = arg0.method15411();
		} else if (arg1 == 26) {
			this.field4712 = (short) (arg0.g1() * 4);
			this.field4713 = (short) (arg0.g1() * 4);
		} else if (arg1 == 27) {
			if (this.field4716 == null) {
				this.field4716 = new int[this.field4698.field4735.field5171.length][];
			}
			int var3 = arg0.g1();
			this.field4716[var3] = new int[6];
			for (int var4 = 0; var4 < 6; var4++) {
				this.field4716[var3][var4] = arg0.method15240();
			}
		} else if (arg1 == 28) {
			int var5 = arg0.g1();
			this.field4720 = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field4720[var6] = arg0.g1();
				if (this.field4720[var6] == 255) {
					this.field4720[var6] = -1;
				}
			}
		} else if (arg1 == 29) {
			this.field4723 = arg0.g1();
		} else if (arg1 == 30) {
			this.field4722 = arg0.g2();
		} else if (arg1 == 31) {
			this.field4687 = arg0.g1();
		} else if (arg1 == 32) {
			this.field4724 = arg0.g2();
		} else if (arg1 == 33) {
			this.field4725 = arg0.method15240();
		} else if (arg1 == 34) {
			this.field4721 = arg0.g1();
		} else if (arg1 == 35) {
			this.field4727 = arg0.g2();
		} else if (arg1 == 36) {
			this.field4728 = arg0.method15240();
		} else if (arg1 == 37) {
			this.field4704 = arg0.g1();
		} else if (arg1 == 38) {
			this.field4691 = arg0.method15411();
		} else if (arg1 == 39) {
			this.field4703 = arg0.method15411();
		} else if (arg1 == 40) {
			this.field4695 = arg0.method15411();
		} else if (arg1 == 41) {
			this.field4696 = arg0.method15411();
		} else if (arg1 == 42) {
			this.field4717 = arg0.method15411();
		} else if (arg1 == 43) {
			arg0.g2();
		} else if (arg1 == 44) {
			arg0.g2();
		} else if (arg1 == 45) {
			this.field4730 = arg0.g2();
		} else if (arg1 == 46) {
			this.field4706 = arg0.method15411();
		} else if (arg1 == 47) {
			this.field4707 = arg0.method15411();
		} else if (arg1 == 48) {
			this.field4708 = arg0.method15411();
		} else if (arg1 == 49) {
			this.field4709 = arg0.method15411();
		} else if (arg1 == 50) {
			this.field4693 = arg0.method15411();
		} else if (arg1 == 51) {
			this.field4711 = arg0.method15411();
		} else if (arg1 == 52) {
			int var7 = arg0.g1();
			this.field4689 = new int[var7];
			this.field4690 = new int[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field4689[var8] = arg0.method15411();
				int var9 = arg0.g1();
				this.field4690[var8] = var9;
				this.field4731 += var9;
			}
		} else if (arg1 == 53) {
			this.field4714 = false;
		} else if (arg1 == 54) {
			this.field4700 = arg0.g1() << 6;
			this.field4715 = arg0.g1() << 6;
		} else if (arg1 == 55) {
			if (this.field4719 == null) {
				this.field4719 = new int[this.field4698.field4735.field5171.length];
			}
			int var10 = arg0.g1();
			this.field4719[var10] = arg0.g2();
		} else if (arg1 == 56) {
			if (this.field4729 == null) {
				this.field4729 = new int[this.field4698.field4735.field5171.length][];
			}
			int var11 = arg0.g1();
			this.field4729[var11] = new int[3];
			for (int var12 = 0; var12 < 3; var12++) {
				this.field4729[var11][var12] = arg0.method15240();
			}
		}
	}

	@ObfuscatedName("ps.a(I)I")
	public int method7748() {
		if (this.field4688 != -1) {
			return this.field4688;
		} else if (this.field4689 == null) {
			return -1;
		} else {
			int var1 = (int) (Math.random() * (double) this.field4731);
			int var2;
			for (var2 = 0; var1 >= this.field4690[var2]; var2++) {
				var1 -= this.field4690[var2];
			}
			return this.field4689[var2];
		}
	}

	@ObfuscatedName("ps.s(II)Z")
	public boolean method7749(int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.field4688 == arg0) {
			return true;
		} else {
			if (this.field4689 != null) {
				for (int var2 = 0; var2 < this.field4689.length; var2++) {
					if (this.field4689[var2] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@ObfuscatedName("ps.c(I)[Lkc;")
	public class314[] method7750() {
		if (this.field4718 != null) {
			return this.field4718;
		} else if (this.field4716 == null) {
			return null;
		} else {
			this.field4718 = new class314[this.field4716.length];
			for (int var1 = 0; var1 < this.field4716.length; var1++) {
				int var2 = 0;
				int var3 = 0;
				int var4 = 0;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				if (this.field4716[var1] != null) {
					var2 = this.field4716[var1][0];
					var3 = this.field4716[var1][1];
					var4 = this.field4716[var1][2];
					var5 = this.field4716[var1][3] << 3;
					var6 = this.field4716[var1][4] << 3;
					var7 = this.field4716[var1][5] << 3;
				}
				if (var2 != 0 || var3 != 0 || var4 != 0 || var5 != 0 || var6 != 0 || var7 != 0) {
					class314 var8 = this.field4718[var1] = new class314();
					if (var7 != 0) {
						var8.method5178(0.0F, 0.0F, 1.0F, class312.method5096(var7));
					}
					if (var5 != 0) {
						var8.method5178(1.0F, 0.0F, 0.0F, class312.method5096(var5));
					}
					if (var6 != 0) {
						var8.method5178(0.0F, 1.0F, 0.0F, class312.method5096(var6));
					}
					var8.method5116((float) var2, (float) var3, (float) var4);
				}
			}
			return this.field4718;
		}
	}

	@ObfuscatedName("ps.m(B)[I")
	public int[] method7754() {
		IterableMap var1 = new IterableMap(16);
		method12356(this.field4688, var1);
		if (this.field4689 != null) {
			int[] var2 = this.field4689;
			for (int var3 = 0; var3 < var2.length; var3++) {
				int var4 = var2[var3];
				method12356(var4, var1);
			}
		}
		method12356(this.field4691, var1);
		method12356(this.field4703, var1);
		method12356(this.field4694, var1);
		method12356(this.field4695, var1);
		method12356(this.field4696, var1);
		method12356(this.field4717, var1);
		method12356(this.field4710, var1);
		method12356(this.field4699, var1);
		method12356(this.field4726, var1);
		method12356(this.field4701, var1);
		method12356(this.field4702, var1);
		method12356(this.field4692, var1);
		method12356(this.field4697, var1);
		method12356(this.field4705, var1);
		method12356(this.field4706, var1);
		method12356(this.field4707, var1);
		method12356(this.field4708, var1);
		method12356(this.field4709, var1);
		method12356(this.field4693, var1);
		method12356(this.field4711, var1);
		int[] var5 = new int[var1.method11926()];
		int var6 = 0;
		Iterator var7 = var1.iterator();
		while (var7.hasNext()) {
			class399 var8 = (class399) var7.next();
			var5[var6++] = (int) var8.field4228;
		}
		return var5;
	}

	@ObfuscatedName("vr.t(ILuo;I)V")
	public static final void method12356(int arg0, IterableMap arg1) {
		if (arg0 != -1 && arg1.method11923((long) arg0) == null) {
			arg1.pushNode(new class399(), (long) arg0);
		}
	}
}
