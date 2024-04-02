package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("yw")
public class class664 extends class970 implements class113 {

	@ObfuscatedName("yw.z")
	public class541 field7588;

	@ObfuscatedName("yw.n")
	public class13 field7580;

	@ObfuscatedName("yw.o")
	public class30 field7581;

	@ObfuscatedName("yw.q")
	public class429 field7582;

	@ObfuscatedName("yw.p")
	public final int field9810;

	@ObfuscatedName("yw.w")
	public final byte field7584;

	@ObfuscatedName("yw.b")
	public final boolean field7585;

	@ObfuscatedName("yw.x")
	public boolean field7579;

	@ObfuscatedName("yw.i")
	public boolean field7587;

	@ObfuscatedName("yw.v")
	public boolean field7586;

	public class664(class423 arg0, class14 arg1, class541 arg2, class540 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, boolean arg11) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field6477);
		this.field7588 = arg2;
		this.field9810 = arg3.field6474;
		this.field7585 = arg9;
		this.field7584 = (byte) arg10;
		this.field7579 = arg3.field6493 != 0 && !arg9;
		this.field7587 = arg11;
		this.field7586 = arg1.method449() && arg3.field6541 && !this.field7585 && Statics.field4961.field9651.method15747() != 0;
		int var13 = 2048;
		if (this.field7587) {
			var13 |= 0x10000;
		}
		if (arg3.field6472) {
			var13 |= 0x80000;
		}
		class570 var14 = this.method12906(arg1, var13, this.field7586);
		if (var14 != null) {
			this.field7580 = (class13) var14.field6757;
			this.field7581 = (class30) var14.field6756;
			if (this.field7587 || arg3.field6472) {
				this.field7580 = this.field7580.method295((byte) 0, var13, false);
				if (arg3.field6472) {
					class357 var15 = client.field8980.method6094();
					this.field7580.method290(var15.field3783, var15.field3782, var15.field3781, var15.field3784);
				}
			}
		}
		this.method15642(1);
	}

	@ObfuscatedName("yw.bn(I)Z")
	public boolean method12807() {
		if (this.field7580 == null) {
			return true;
		} else {
			return !this.field7580.method293();
		}
	}

	@ObfuscatedName("yw.ba(I)Z")
	public boolean method12808() {
		return this.field7580 == null ? false : this.field7580.method292();
	}

	@ObfuscatedName("yw.bc(I)I")
	public int method12809() {
		return this.field7580 == null ? 0 : this.field7580.method278();
	}

	@ObfuscatedName("yw.bd(Lra;II)Lqa;")
	public class13 method12905(class14 arg0, int arg1) {
		if (this.field7580 != null && arg0.method519(this.field7580.method329(), arg1) == 0) {
			return this.field7580;
		} else {
			class570 var3 = this.method12906(arg0, arg1, false);
			return var3 == null ? null : (class13) var3.field6757;
		}
	}

	@ObfuscatedName("yw.bm(Lra;IZI)Luz;")
	public class570 method12906(class14 arg0, int arg1, boolean arg2) {
		class540 var4 = this.field7588.method11471(this.field9810);
		class12 var5;
		class12 var6;
		if (this.field7585) {
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
		class317 var7 = this.method8565().field3464;
		return var4.method11447(arg0, arg1, class542.field6589.field6590, this.field7584, var5, var6, (int) var7.field3475, (int) var7.field3476, (int) var7.field3477, arg2, null);
	}

	@ObfuscatedName("yw.br(Lra;I)Lok;")
	public class429 method12810(class14 arg0) {
		class317 var2 = this.method8565().field3464;
		if (this.field7582 == null) {
			this.field7582 = class836.method15140((int) var2.field3475, (int) var2.field3476, (int) var2.field3477, this.method12905(arg0, 0));
		}
		return this.field7582;
	}

	@ObfuscatedName("yw.bi(Lra;B)Loz;")
	public class425 method12812(class14 arg0) {
		if (this.field7580 == null) {
			return null;
		} else {
			class314 var2 = this.method8558();
			class425 var3 = class425.method12205(this.field7579);
			this.field7580.method271(var2, this.field9811[0], 0);
			return var3;
		}
	}

	@ObfuscatedName("yw.bx(Lra;B)V")
	public void method12851(class14 arg0) {
	}

	@ObfuscatedName("yw.bb(Lra;III)Z")
	public boolean method12814(class14 arg0, int arg1, int arg2) {
		class13 var4 = this.method12905(arg0, 131072);
		if (var4 == null) {
			return false;
		} else {
			class314 var5 = this.method8558();
			return var4.method272(arg1, arg2, var5, false, 0);
		}
	}

	@ObfuscatedName("yw.be(I)Z")
	public boolean method12815() {
		return this.field7587;
	}

	@ObfuscatedName("yw.bw(Lra;Laes;IIIZI)V")
	public void method12816(class14 arg0, class836 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 instanceof class664) {
			class664 var7 = (class664) arg1;
			if (this.field7580 != null && var7.field7580 != null) {
				this.field7580.method297(var7.field7580, arg2, arg3, arg4, arg5);
			}
		}
	}

	@ObfuscatedName("yw.bo(B)V")
	public void method12817() {
		this.field7587 = false;
		if (this.field7580 != null) {
			this.field7580.method252(this.field7580.method329() & 0xFFFEFFFF);
		}
	}

	@ObfuscatedName("yw.u(B)I")
	public int method2401() {
		return this.field9810;
	}

	@ObfuscatedName("yw.j(B)I")
	public int method2390() {
		return class542.field6589.field6590;
	}

	@ObfuscatedName("yw.a(I)I")
	public int method2391() {
		return this.field7584;
	}

	@ObfuscatedName("yw.s(I)V")
	public void method2409() {
		if (this.field7580 != null) {
			this.field7580.method247();
		}
	}

	@ObfuscatedName("yw.c(I)Z")
	public boolean method2393() {
		return this.field7586;
	}

	@ObfuscatedName("yw.m(Lra;I)V")
	public void method2406(class14 arg0) {
		Object var2 = null;
		class30 var4;
		if (this.field7581 == null && this.field7586) {
			class570 var3 = this.method12906(arg0, 262144, true);
			var4 = (class30) (var3 == null ? null : var3.field6756);
		} else {
			var4 = this.field7581;
			this.field7581 = null;
		}
		class317 var5 = this.method8565().field3464;
		if (var4 != null) {
			this.field9808.method7445(var4, this.field9809, (int) var5.field3475, (int) var5.field3477, null);
		}
	}

	@ObfuscatedName("yw.t(Lra;I)V")
	public void method2412(class14 arg0) {
		Object var2 = null;
		class30 var4;
		if (this.field7581 == null && this.field7586) {
			class570 var3 = this.method12906(arg0, 262144, true);
			var4 = (class30) (var3 == null ? null : var3.field6756);
		} else {
			var4 = this.field7581;
			this.field7581 = null;
		}
		class317 var5 = this.method8565().field3464;
		if (var4 != null) {
			this.field9808.method7451(var4, this.field9809, (int) var5.field3475, (int) var5.field3477, null);
		}
	}
}
