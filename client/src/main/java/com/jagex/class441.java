package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("po")
public class class441 {

	@ObfuscatedName("po.u")
	public class442 field4754;

	@ObfuscatedName("po.t")
	public boolean field4742 = false;

	@ObfuscatedName("po.l")
	public int field4744 = -1041314717;

	@ObfuscatedName("po.f")
	public int field4736 = -1795803525;

	@ObfuscatedName("po.d")
	public int field4750 = -18495690;

	@ObfuscatedName("po.z")
	public int field4746 = 1113388541;

	@ObfuscatedName("po.n")
	public int field4747 = -160003401;

	@ObfuscatedName("po.o")
	public int field4748 = 1704537633;

	@ObfuscatedName("po.q")
	public int field4749 = 1773922325;

	@ObfuscatedName("po.p")
	public int field4738 = 0;

	@ObfuscatedName("po.w")
	public int field4751 = 0;

	@ObfuscatedName("po.b")
	public int field4752 = -872229639;

	@ObfuscatedName("po.x")
	public String field4753 = "";

	@ObfuscatedName("po.i")
	public int field4743 = -340406195;

	@ObfuscatedName("po.v")
	public int field4755 = 0;

	@ObfuscatedName("po.u(Laet;I)V")
	public void method7791(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method7792(arg0, var2);
		}
	}

	@ObfuscatedName("po.j(Laet;II)V")
	public void method7792(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field4744 = arg0.method15411() * 1041314717;
		} else if (arg1 == 2) {
			this.field4736 = arg0.method15241() * -267794043;
			this.field4742 = true;
		} else if (arg1 == 3) {
			this.field4746 = arg0.method15411() * -1113388541;
		} else if (arg1 == 4) {
			this.field4748 = arg0.method15411() * -1704537633;
		} else if (arg1 == 5) {
			this.field4747 = arg0.method15411() * 160003401;
		} else if (arg1 == 6) {
			this.field4749 = arg0.method15411() * -1773922325;
		} else if (arg1 == 7) {
			this.field4738 = arg0.method15240() * -1886499025;
		} else if (arg1 == 8) {
			this.field4753 = arg0.method15366();
		} else if (arg1 == 9) {
			this.field4750 = arg0.method15239() * 1226869289;
		} else if (arg1 == 10) {
			this.field4751 = arg0.method15240() * -1620915695;
		} else if (arg1 == 11) {
			this.field4752 = 0;
		} else if (arg1 == 12) {
			this.field4743 = arg0.method15220() * 340406195;
		} else if (arg1 == 13) {
			this.field4755 = arg0.method15240() * -274213637;
		} else if (arg1 == 14) {
			this.field4752 = arg0.method15239() * 872229639;
		}
	}

	@ObfuscatedName("po.a(II)Ljava/lang/String;")
	public String method7793(int arg0) {
		String var2 = this.field4753;
		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}
			var2 = var2.substring(0, var3) + class526.method1601(arg0, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("po.s(Lra;B)Lce;")
	public class118 method7794(class14 arg0) {
		if (this.field4746 * -549621589 < 0) {
			return null;
		}
		class118 var2 = (class118) this.field4754.field4759.method7916((long) (this.field4746 * -549621589));
		if (var2 == null) {
			this.method7798(arg0);
			var2 = (class118) this.field4754.field4759.method7916((long) (this.field4746 * -549621589));
		}
		return var2;
	}

	@ObfuscatedName("po.c(Lra;B)Lce;")
	public class118 method7796(class14 arg0) {
		if (this.field4747 * -1193177863 < 0) {
			return null;
		}
		class118 var2 = (class118) this.field4754.field4759.method7916((long) (this.field4747 * -1193177863));
		if (var2 == null) {
			this.method7798(arg0);
			var2 = (class118) this.field4754.field4759.method7916((long) (this.field4747 * -1193177863));
		}
		return var2;
	}

	@ObfuscatedName("po.m(Lra;I)Lce;")
	public class118 method7797(class14 arg0) {
		if (this.field4748 * 1621240351 < 0) {
			return null;
		}
		class118 var2 = (class118) this.field4754.field4759.method7916((long) (this.field4748 * 1621240351));
		if (var2 == null) {
			this.method7798(arg0);
			var2 = (class118) this.field4754.field4759.method7916((long) (this.field4748 * 1621240351));
		}
		return var2;
	}

	@ObfuscatedName("po.t(Lra;B)Lce;")
	public class118 method7804(class14 arg0) {
		if (this.field4749 * -327460669 < 0) {
			return null;
		}
		class118 var2 = (class118) this.field4754.field4759.method7916((long) (this.field4749 * -327460669));
		if (var2 == null) {
			this.method7798(arg0);
			var2 = (class118) this.field4754.field4759.method7916((long) (this.field4749 * -327460669));
		}
		return var2;
	}

	@ObfuscatedName("po.l(Lra;I)V")
	public void method7798(class14 arg0) {
		class334 var2 = this.field4754.field4757;
		if (this.field4746 * -549621589 >= 0 && this.field4754.field4759.method7916((long) (this.field4746 * -549621589)) == null && var2.method5630(this.field4746 * -549621589)) {
			class140 var3 = class125.method2598(var2, this.field4746 * -549621589);
			this.field4754.field4759.method7937(arg0.method517(var3, true), (long) (this.field4746 * -549621589));
		}
		if (this.field4747 * -1193177863 >= 0 && this.field4754.field4759.method7916((long) (this.field4747 * -1193177863)) == null && var2.method5630(this.field4747 * -1193177863)) {
			class140 var4 = class125.method2598(var2, this.field4747 * -1193177863);
			this.field4754.field4759.method7937(arg0.method517(var4, true), (long) (this.field4747 * -1193177863));
		}
		if (this.field4748 * 1621240351 >= 0 && this.field4754.field4759.method7916((long) (this.field4748 * 1621240351)) == null && var2.method5630(this.field4748 * 1621240351)) {
			class140 var5 = class125.method2598(var2, this.field4748 * 1621240351);
			this.field4754.field4759.method7937(arg0.method517(var5, true), (long) (this.field4748 * 1621240351));
		}
		if (this.field4749 * -327460669 >= 0 && this.field4754.field4759.method7916((long) (this.field4749 * -327460669)) == null && var2.method5630(this.field4749 * -327460669)) {
			class140 var6 = class125.method2598(var2, this.field4749 * -327460669);
			this.field4754.field4759.method7937(arg0.method517(var6, true), (long) (this.field4749 * -327460669));
		}
	}
}
