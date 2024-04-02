package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("yp")
public class class659 extends class974 implements Location {

	@ObfuscatedName("yp.z")
	public LocTypeList field7540;

	@ObfuscatedName("yp.n")
	public class13 field7537;

	@ObfuscatedName("yp.o")
	public class30 field7534;

	@ObfuscatedName("yp.q")
	public class429 field7535;

	@ObfuscatedName("yp.p")
	public final int field9810;

	@ObfuscatedName("yp.w")
	public final byte field7541;

	@ObfuscatedName("yp.b")
	public final byte field7538;

	@ObfuscatedName("yp.x")
	public final boolean field7539;

	@ObfuscatedName("yp.i")
	public boolean field7536;

	@ObfuscatedName("yp.v")
	public boolean field7533;

	@ObfuscatedName("yp.k")
	public boolean field10512;

	public class659(Scene arg0, class14 arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, boolean arg16) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.field6527 == 1, method1416(arg14, arg15));
		this.field7540 = arg2;
		this.field9810 = arg3.field6474;
		this.field9809 = (byte) arg5;
		this.field7539 = arg9;
		this.field7541 = (byte) arg14;
		this.field7538 = (byte) arg15;
		this.field7536 = arg3.field6493 != 0 && !arg9;
		this.field7533 = arg16;
		this.field10512 = arg1.method449() && arg3.field6541 && !this.field7539 && Statics.preferences.field9651.method15747() != 0;
		int var18 = 2048;
		if (this.field7533) {
			var18 |= 0x10000;
		}
		if (arg3.field6472) {
			var18 |= 0x80000;
		}
		class570 var19 = this.method12864(arg1, var18, this.field10512);
		if (var19 != null) {
			this.field7537 = (class13) var19.field6757;
			this.field7534 = (class30) var19.field6756;
			if (this.field7533 || arg3.field6472) {
				this.field7537 = this.field7537.method295((byte) 0, var18, false);
				if (arg3.field6472) {
					LocTint var20 = client.world.method6094();
					this.field7537.method290(var20.field3783, var20.field3782, var20.field3781, var20.field3784);
				}
			}
		}
		this.method15642(1);
	}

	@ObfuscatedName("yp.bn(I)Z")
	public boolean method12807() {
		if (this.field7537 == null) {
			return true;
		} else {
			return !this.field7537.method293();
		}
	}

	@ObfuscatedName("yp.ba(I)Z")
	public boolean method12808() {
		return this.field7537 == null ? false : this.field7537.method292();
	}

	@ObfuscatedName("p.bd(III)B")
	public static byte method1416(int arg0, int arg1) {
		if (class542.field6567.field6590 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@ObfuscatedName("yp.bc(I)I")
	public int method12809() {
		return this.field7537 == null ? 0 : this.field7537.method278();
	}

	@ObfuscatedName("yp.bm(Lra;IB)Lqa;")
	public class13 method12863(class14 arg0, int arg1) {
		if (this.field7537 != null && arg0.method519(this.field7537.method329(), arg1) == 0) {
			return this.field7537;
		} else {
			class570 var3 = this.method12864(arg0, arg1, false);
			return var3 == null ? null : (class13) var3.field6757;
		}
	}

	@ObfuscatedName("yp.cx(Lra;IZI)Luz;")
	public class570 method12864(class14 arg0, int arg1, boolean arg2) {
		LocType var4 = this.field7540.method11471(this.field9810);
		class12 var5;
		class12 var6;
		if (this.field7539) {
			var5 = this.field9808.field4502[this.field9809];
			var6 = this.field9808.field4527[0];
		} else {
			var5 = this.field9808.field4527[this.field9809];
			if (this.field9809 < 3) {
				var6 = this.field9808.field4527[this.field9809 + 1];
			} else {
				var6 = null;
			}
		}
		Vector3 var7 = this.method8565().field3464;
		return var4.method11447(arg0, arg1, class542.field6588.field6590 == this.field7541 ? class542.field6572.field6590 : this.field7541, class542.field6588.field6590 == this.field7541 ? this.field7538 + 4 : this.field7538, var5, var6, (int) var7.field3475, (int) var7.field3476, (int) var7.field3477, arg2, null);
	}

	@ObfuscatedName("yp.br(Lra;I)Lok;")
	public class429 method12810(class14 arg0) {
		Vector3 var2 = this.method8565().field3464;
		if (this.field7535 == null) {
			this.field7535 = class836.method15140((int) var2.field3475, (int) var2.field3476, (int) var2.field3477, this.method12863(arg0, 0));
		}
		return this.field7535;
	}

	@ObfuscatedName("yp.bi(Lra;B)Loz;")
	public class425 method12812(class14 arg0) {
		if (this.field7537 == null) {
			return null;
		} else {
			class314 var2 = this.method8558();
			class425 var3 = class425.method12205(this.field7536);
			this.field7537.method271(var2, this.field9811[0], 0);
			return var3;
		}
	}

	@ObfuscatedName("yp.bx(Lra;B)V")
	public void method12851(class14 arg0) {
	}

	@ObfuscatedName("yp.bb(Lra;III)Z")
	public boolean method12814(class14 arg0, int arg1, int arg2) {
		class13 var4 = this.method12863(arg0, 131072);
		if (var4 == null) {
			return false;
		} else {
			class314 var5 = this.method8558();
			return var4.method272(arg1, arg2, var5, false, 0);
		}
	}

	@ObfuscatedName("yp.be(I)Z")
	public boolean method12815() {
		return this.field7533;
	}

	@ObfuscatedName("yp.bw(Lra;Laes;IIIZI)V")
	public void method12816(class14 arg0, class836 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof class661) {
			class661 var7 = (class661) arg1;
			if (this.field7537 != null && var7.field7557 != null) {
				this.field7537.method297(var7.field7557, arg2, arg3, arg4, arg5);
			}
		} else if (arg1 instanceof class659) {
			class659 var8 = (class659) arg1;
			if (this.field7537 != null && var8.field7537 != null) {
				this.field7537.method297(var8.field7537, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("yp.bo(B)V")
	public void method12817() {
		this.field7533 = false;
		if (this.field7537 != null) {
			this.field7537.method252(this.field7537.method329() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("yp.u(B)I")
	public int method2401() {
		return this.field9810;
	}

	@ObfuscatedName("yp.j(B)I")
	public int method2390() {
		return this.field7541;
	}

	@ObfuscatedName("yp.a(I)I")
	public int method2391() {
		return this.field7538;
	}

	@ObfuscatedName("yp.s(I)V")
	public void method2409() {
		if (this.field7537 != null) {
			this.field7537.method247();
		}
	}

	@ObfuscatedName("yp.c(I)Z")
	public boolean method2393() {
		return this.field10512;
	}

	@ObfuscatedName("yp.m(Lra;I)V")
	public void method2406(class14 arg0) {
		Object var2 = null;
		class30 var4;
		if (this.field7534 == null && this.field10512) {
			class570 var3 = this.method12864(arg0, 262144, true);
			var4 = (class30) (var3 == null ? null : var3.field6756);
		} else {
			var4 = this.field7534;
			this.field7534 = null;
		}
		Vector3 var5 = this.method8565().field3464;
		if (var4 != null) {
			this.field9808.method7445(var4, this.field9809, (int) var5.field3475, (int) var5.field3477, null);
		}
	}

	@ObfuscatedName("yp.t(Lra;I)V")
	public void method2412(class14 arg0) {
		Object var2 = null;
		class30 var4;
		if (this.field7534 == null && this.field10512) {
			class570 var3 = this.method12864(arg0, 262144, true);
			var4 = (class30) (var3 == null ? null : var3.field6756);
		} else {
			var4 = this.field7534;
			this.field7534 = null;
		}
		Vector3 var5 = this.method8565().field3464;
		if (var4 != null) {
			this.field9808.method7451(var4, this.field9809, (int) var5.field3475, (int) var5.field3477, null);
		}
	}

	@ObfuscatedName("yp.cn(B)I")
	public int method12865() {
		return this.field7537 == null ? 15 : this.field7537.method274() / 4;
	}
}
