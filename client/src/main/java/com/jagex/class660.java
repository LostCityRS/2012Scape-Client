package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("yc")
public class class660 extends class971 implements Location {

	@ObfuscatedName("yc.z")
	public class541 field7550;

	@ObfuscatedName("yc.n")
	public class13 field7544;

	@ObfuscatedName("yc.o")
	public class30 field7547;

	@ObfuscatedName("yc.q")
	public class429 field7545;

	@ObfuscatedName("yc.p")
	public final int field9810;

	@ObfuscatedName("yc.w")
	public final byte field7549;

	@ObfuscatedName("yc.b")
	public final byte field7546;

	@ObfuscatedName("yc.x")
	public final boolean field7551;

	@ObfuscatedName("yc.i")
	public boolean field7552;

	@ObfuscatedName("yc.v")
	public boolean field7553;

	public class660(class423 arg0, class14 arg1, class541 arg2, class540 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
		this.field7550 = arg2;
		this.field9810 = arg3.field6474;
		this.field7551 = arg9;
		this.field7546 = (byte) arg13;
		this.field7549 = (byte) arg12;
		this.field7552 = arg3.field6493 != 0 && !arg9;
		this.field7553 = arg1.method449() && arg3.field6541 && !this.field7551 && Statics.field4961.field9651.method15747() != 0;
		int var15 = 2048;
		if (arg3.field6472) {
			var15 |= 0x80000;
		}
		class570 var16 = this.method12879(arg1, var15, this.field7553);
		if (var16 != null) {
			this.field7544 = (class13) var16.field6757;
			this.field7547 = (class30) var16.field6756;
			if (arg3.field6472) {
				this.field7544 = this.field7544.method295((byte) 0, var15, false);
				if (arg3.field6472) {
					class357 var17 = client.field8980.method6094();
					this.field7544.method290(var17.field3783, var17.field3782, var17.field3781, var17.field3784);
				}
			}
		}
		this.method15642(1);
	}

	@ObfuscatedName("yc.bn(I)Z")
	public boolean method12807() {
		if (this.field7544 == null) {
			return true;
		} else {
			return !this.field7544.method293();
		}
	}

	@ObfuscatedName("yc.ba(I)Z")
	public boolean method12808() {
		return this.field7544 == null ? false : this.field7544.method292();
	}

	@ObfuscatedName("yc.bc(I)I")
	public int method12809() {
		return this.field7544 == null ? 0 : this.field7544.method278();
	}

	@ObfuscatedName("yc.bd(Lra;IS)Lqa;")
	public class13 method12878(class14 arg0, int arg1) {
		if (this.field7544 != null && arg0.method519(this.field7544.method329(), arg1) == 0) {
			return this.field7544;
		} else {
			class570 var3 = this.method12879(arg0, arg1, false);
			return var3 == null ? null : (class13) var3.field6757;
		}
	}

	@ObfuscatedName("yc.bm(Lra;IZI)Luz;")
	public class570 method12879(class14 arg0, int arg1, boolean arg2) {
		class540 var4 = this.field7550.method11471(this.field9810);
		class12 var5;
		class12 var6;
		if (this.field7551) {
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
		return var4.method11447(arg0, arg1, this.field7549, this.field7546, var5, var6, (int) var7.field3475, (int) var7.field3476, (int) var7.field3477, arg2, null);
	}

	@ObfuscatedName("yc.br(Lra;I)Lok;")
	public class429 method12810(class14 arg0) {
		Vector3 var2 = this.method8565().field3464;
		if (this.field7545 == null) {
			this.field7545 = class836.method15140((int) var2.field3475, (int) var2.field3476, (int) var2.field3477, this.method12878(arg0, 0));
		}
		return this.field7545;
	}

	@ObfuscatedName("yc.bi(Lra;B)Loz;")
	public class425 method12812(class14 arg0) {
		if (this.field7544 == null) {
			return null;
		}
		class314 var2 = arg0.method516();
		var2.method5115(this.method8558());
		var2.method5116((float) this.field10496, 0.0F, (float) this.field10497);
		class425 var3 = class425.method12205(this.field7552);
		this.field7544.method271(var2, this.field9811[0], 0);
		return var3;
	}

	@ObfuscatedName("yc.bx(Lra;B)V")
	public void method12851(class14 arg0) {
	}

	@ObfuscatedName("yc.bb(Lra;III)Z")
	public boolean method12814(class14 arg0, int arg1, int arg2) {
		class13 var4 = this.method12878(arg0, 131072);
		if (var4 == null) {
			return false;
		} else {
			class314 var5 = this.method8558();
			return var4.method272(arg1, arg2, var5, false, 0);
		}
	}

	@ObfuscatedName("yc.u(B)I")
	public int method2401() {
		return this.field9810;
	}

	@ObfuscatedName("yc.j(B)I")
	public int method2390() {
		return this.field7549;
	}

	@ObfuscatedName("yc.a(I)I")
	public int method2391() {
		return this.field7546;
	}

	@ObfuscatedName("yc.s(I)V")
	public void method2409() {
		if (this.field7544 != null) {
			this.field7544.method247();
		}
	}

	@ObfuscatedName("yc.c(I)Z")
	public boolean method2393() {
		return this.field7553;
	}

	@ObfuscatedName("yc.m(Lra;I)V")
	public void method2406(class14 arg0) {
		Object var2 = null;
		class30 var4;
		if (this.field7547 == null && this.field7553) {
			class570 var3 = this.method12879(arg0, 262144, true);
			var4 = (class30) (var3 == null ? null : var3.field6756);
		} else {
			var4 = this.field7547;
			this.field7547 = null;
		}
		Vector3 var5 = this.method8565().field3464;
		if (var4 != null) {
			this.field9808.method7445(var4, this.field9809, (int) var5.field3475, (int) var5.field3477, null);
		}
	}

	@ObfuscatedName("yc.t(Lra;I)V")
	public void method2412(class14 arg0) {
		Object var2 = null;
		class30 var4;
		if (this.field7547 == null && this.field7553) {
			class570 var3 = this.method12879(arg0, 262144, true);
			var4 = (class30) (var3 == null ? null : var3.field6756);
		} else {
			var4 = this.field7547;
			this.field7547 = null;
		}
		Vector3 var5 = this.method8565().field3464;
		if (var4 != null) {
			this.field9808.method7451(var4, this.field9809, (int) var5.field3475, (int) var5.field3477, null);
		}
	}
}
