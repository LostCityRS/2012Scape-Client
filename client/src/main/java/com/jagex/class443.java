package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pw")
public class class443 {

	@ObfuscatedName("pw.u")
	public class444 field4798;

	@ObfuscatedName("pw.j")
	public int field4763;

	@ObfuscatedName("pw.a")
	public int field4764 = -1;

	@ObfuscatedName("pw.s")
	public int field4769 = -1;

	@ObfuscatedName("pw.c")
	public String field4766;

	@ObfuscatedName("pw.m")
	public int field4767;

	@ObfuscatedName("pw.t")
	public int field4768 = -1;

	@ObfuscatedName("pw.l")
	public int field4777 = 0;

	@ObfuscatedName("pw.n")
	public int field4801;

	@ObfuscatedName("pw.o")
	public int field4782;

	@ObfuscatedName("pw.q")
	public boolean field4797 = true;

	@ObfuscatedName("pw.p")
	public boolean field4776 = false;

	@ObfuscatedName("pw.w")
	public boolean field4774 = true;

	@ObfuscatedName("pw.b")
	public String[] field4778 = new String[5];

	@ObfuscatedName("pw.x")
	public String field4779;

	@ObfuscatedName("pw.i")
	public int field4780 = -1;

	@ObfuscatedName("pw.v")
	public int field4781;

	@ObfuscatedName("pw.k")
	public int field4803;

	@ObfuscatedName("pw.h")
	public int field4783 = -1;

	@ObfuscatedName("pw.r")
	public int field4784 = -1;

	@ObfuscatedName("pw.g")
	public int field4789;

	@ObfuscatedName("pw.y")
	public int field4786;

	@ObfuscatedName("pw.e")
	public int field4787 = -1;

	@ObfuscatedName("pw.ay")
	public int field4765 = -1;

	@ObfuscatedName("pw.af")
	public int[] field4788;

	@ObfuscatedName("pw.ar")
	public int field4790 = Integer.MAX_VALUE;

	@ObfuscatedName("pw.an")
	public int field4791 = Integer.MAX_VALUE;

	@ObfuscatedName("pw.ap")
	public int field4792 = Integer.MIN_VALUE;

	@ObfuscatedName("pw.ag")
	public int field4773 = Integer.MIN_VALUE;

	@ObfuscatedName("pw.as")
	public int field4785;

	@ObfuscatedName("pw.ai")
	public int field4795 = -1;

	@ObfuscatedName("pw.ao")
	public int field4796 = -1;

	@ObfuscatedName("pw.al")
	public int field4794 = -1;

	@ObfuscatedName("pw.at")
	public int field4793;

	@ObfuscatedName("pw.ax")
	public int field4799;

	@ObfuscatedName("pw.aw")
	public int[] field4800;

	@ObfuscatedName("pw.aa")
	public byte[] field4762;

	@ObfuscatedName("pw.am")
	public boolean field4802 = true;

	@ObfuscatedName("pw.ad")
	public int field4775 = -1;

	@ObfuscatedName("pw.az")
	public IterableMap field4804;

	@ObfuscatedName("pw.u(Laet;I)V")
	public void method7836(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method7837(arg0, var2);
		}
	}

	@ObfuscatedName("pw.j(Laet;II)V")
	public void method7837(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field4764 = arg0.method15411();
		} else if (arg1 == 2) {
			this.field4769 = arg0.method15411();
		} else if (arg1 == 3) {
			this.field4766 = arg0.gjstr();
		} else if (arg1 == 4) {
			this.field4767 = arg0.method15241();
		} else if (arg1 == 5) {
			this.field4768 = arg0.method15241();
		} else if (arg1 == 6) {
			this.field4777 = arg0.g1();
		} else if (arg1 == 7) {
			int var3 = arg0.g1();
			if ((var3 & 0x1) == 0) {
				this.field4797 = false;
			}
			if ((var3 & 0x2) == 2) {
				this.field4776 = true;
			}
		} else if (arg1 == 8) {
			this.field4774 = arg0.g1() == 1;
		} else if (arg1 == 9) {
			this.field4783 = arg0.g2();
			if (this.field4783 == 65535) {
				this.field4783 = -1;
			}
			this.field4784 = arg0.g2();
			if (this.field4784 == 65535) {
				this.field4784 = -1;
			}
			this.field4781 = arg0.g4s();
			this.field4803 = arg0.g4s();
		} else if (arg1 >= 10 && arg1 <= 14) {
			this.field4778[arg1 - 10] = arg0.gjstr();
		} else if (arg1 == 15) {
			int var4 = arg0.g1();
			this.field4788 = new int[var4 * 2];
			for (int var5 = 0; var5 < var4 * 2; var5++) {
				this.field4788[var5] = arg0.method15240();
			}
			this.field4785 = arg0.g4s();
			int var6 = arg0.g1();
			this.field4800 = new int[var6];
			for (int var7 = 0; var7 < this.field4800.length; var7++) {
				this.field4800[var7] = arg0.g4s();
			}
			this.field4762 = new byte[var4];
			for (int var8 = 0; var8 < var4; var8++) {
				this.field4762[var8] = arg0.method15238();
			}
		} else if (arg1 == 16) {
			this.field4802 = false;
		} else if (arg1 == 17) {
			this.field4779 = arg0.gjstr();
		} else if (arg1 == 18) {
			this.field4780 = arg0.method15411();
		} else if (arg1 == 19) {
			this.field4775 = arg0.g2();
		} else if (arg1 == 20) {
			this.field4787 = arg0.g2();
			if (this.field4787 == 65535) {
				this.field4787 = -1;
			}
			this.field4765 = arg0.g2();
			if (this.field4765 == 65535) {
				this.field4765 = -1;
			}
			this.field4789 = arg0.g4s();
			this.field4786 = arg0.g4s();
		} else if (arg1 == 21) {
			this.field4782 = arg0.g4s();
		} else if (arg1 == 22) {
			this.field4801 = arg0.g4s();
		} else if (arg1 == 23) {
			this.field4795 = arg0.g1();
			this.field4796 = arg0.g1();
			this.field4794 = arg0.g1();
		} else if (arg1 == 24) {
			this.field4793 = arg0.method15240();
			this.field4799 = arg0.method15240();
		} else if (arg1 == 249) {
			int var9 = arg0.g1();
			if (this.field4804 == null) {
				int var10 = IntMath.bitceil(var9);
				this.field4804 = new IterableMap(var10);
			}
			for (int var11 = 0; var11 < var9; var11++) {
				boolean var12 = arg0.g1() == 1;
				int var13 = arg0.method15241();
				class399 var14;
				if (var12) {
					var14 = new class798(arg0.gjstr());
				} else {
					var14 = new IntNode(arg0.g4s());
				}
				this.field4804.pushNode(var14, (long) var13);
			}
		}
	}

	@ObfuscatedName("pw.a(B)V")
	public void method7853() {
		if (this.field4788 == null) {
			return;
		}
		for (int var1 = 0; var1 < this.field4788.length; var1 += 2) {
			if (this.field4788[var1] < this.field4790) {
				this.field4790 = this.field4788[var1];
			} else if (this.field4788[var1] > this.field4792) {
				this.field4792 = this.field4788[var1];
			}
			if (this.field4788[var1 + 1] < this.field4791) {
				this.field4791 = this.field4788[var1 + 1];
			} else if (this.field4788[var1 + 1] > this.field4773) {
				this.field4773 = this.field4788[var1 + 1];
			}
		}
	}

	@ObfuscatedName("pw.s(Lug;B)Z")
	public boolean method7835(class567 arg0) {
		int var2;
		if (this.field4784 == -1) {
			if (this.field4783 == -1) {
				return true;
			}
			var2 = arg0.method1646(this.field4783);
		} else {
			var2 = arg0.method1664(this.field4784);
		}
		if (var2 < this.field4781 || var2 > this.field4803) {
			return false;
		}
		boolean var3 = false;
		int var4;
		if (this.field4765 == -1) {
			if (this.field4787 == -1) {
				return true;
			}
			var4 = arg0.method1646(this.field4787);
		} else {
			var4 = arg0.method1664(this.field4765);
		}
		return var4 >= this.field4789 && var4 <= this.field4786;
	}

	@ObfuscatedName("pw.c(Lra;ZI)Lce;")
	public class118 method7847(class14 arg0, boolean arg1) {
		int var3 = arg1 ? this.field4769 : this.field4764;
		int var4 = var3 | arg0.field397 << 29;
		class118 var5 = (class118) this.field4798.field4810.method7916((long) var4);
		if (var5 != null) {
			return var5;
		} else if (this.field4798.field4806.method5630(var3)) {
			class140 var6 = class125.method2590(this.field4798.field4806, var3, 0);
			if (var6 != null) {
				var5 = arg0.method517(var6, true);
				this.field4798.field4810.method7937(var5, (long) var4);
			}
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("pw.m(Lra;B)Lce;")
	public class118 method7841(class14 arg0) {
		class118 var2 = (class118) this.field4798.field4810.method7916((long) (this.field4780 | 0x20000 | arg0.field397 << 29));
		if (var2 != null) {
			return var2;
		}
		this.field4798.field4806.method5630(this.field4780);
		class140 var3 = class125.method2590(this.field4798.field4806, this.field4780, 0);
		if (var3 != null) {
			var2 = arg0.method517(var3, true);
			this.field4798.field4810.method7937(var2, (long) (this.field4780 | 0x20000 | arg0.field397 << 29));
		}
		return var2;
	}

	@ObfuscatedName("pw.t(III)I")
	public int method7842(int arg0, int arg1) {
		if (this.field4804 == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.field4804.method11923((long) arg0);
			return var3 == null ? arg1 : var3.field9556;
		}
	}

	@ObfuscatedName("pw.l(ILjava/lang/String;B)Ljava/lang/String;")
	public String method7840(int arg0, String arg1) {
		if (this.field4804 == null) {
			return arg1;
		} else {
			class798 var3 = (class798) this.field4804.method11923((long) arg0);
			return var3 == null ? arg1 : (String) var3.field9550;
		}
	}
}
