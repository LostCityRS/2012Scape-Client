package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("alf")
public class class1010 extends class974 {

	@ObfuscatedName("alf.r")
	public int field10640;

	@ObfuscatedName("alf.g")
	public int field10646 = 0;

	@ObfuscatedName("alf.y")
	public class553 field10642;

	@ObfuscatedName("alf.e")
	public int field10643 = 0;

	@ObfuscatedName("alf.ay")
	public boolean field10644 = true;

	@ObfuscatedName("alf.af")
	public class467 field10641;

	@ObfuscatedName("alf.ar")
	public int field10645 = 0;

	public class1010(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
		super(arg0, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.field10640 = arg1;
		this.field10646 = arg12;
		this.field10645 = arg14;
		class507 var16 = Statics.field4213.method11082(this.field10640);
		int var17 = var16.field5252;
		if (var17 != -1) {
			this.field10642 = new class875(this, false);
			int var18 = var16.field5264 ? 0 : 2;
			if (arg13) {
				var18 = 1;
			}
			this.field10642.method11803(var17, arg2, var18, false);
		}
		this.method15642(1);
	}

	@ObfuscatedName("alf.bn(I)Z")
	public boolean method12807() {
		return false;
	}

	@ObfuscatedName("alf.ba(I)Z")
	public boolean method12808() {
		return this.field10644;
	}

	@ObfuscatedName("alf.bc(I)I")
	public int method12809() {
		return this.field10643;
	}

	@ObfuscatedName("alf.u(B)I")
	public int method17176() {
		return this.field10645;
	}

	@ObfuscatedName("alf.br(Lra;I)Lok;")
	public class429 method12810(class14 arg0) {
		return null;
	}

	@ObfuscatedName("alf.j(II)V")
	public final void method17177(int arg0) {
		if (this.field10642 != null && !this.field10642.method11784()) {
			this.field10642.method11787(arg0);
		}
	}

	@ObfuscatedName("alf.a(B)Z")
	public final boolean method17178() {
		return this.field10642 != null && !this.field10642.method11776();
	}

	@ObfuscatedName("alf.s(I)Z")
	public final boolean method17184() {
		return this.field10642 == null || this.field10642.method11784();
	}

	@ObfuscatedName("alf.c(Lra;III)Lqa;")
	public class13 method17190(class14 arg0, int arg1, int arg2) {
		class507 var4 = Statics.field4213.method11082(arg2);
		class12 var5 = this.field9808.field4527[this.level];
		class12 var6 = this.field9809 < 3 ? this.field9808.field4527[this.field9809 + 1] : null;
		Vector3 var7 = this.method8565().field3464;
		return this.field10642 == null || this.field10642.method11784() ? var4.method11103(arg0, arg1, true, var5, var6, (int) var7.field3475, (int) var7.field3476, (int) var7.field3477, null, (byte) 2) : var4.method11103(arg0, arg1, true, var5, var6, (int) var7.field3475, (int) var7.field3476, (int) var7.field3477, this.field10642, (byte) 2);
	}

	@ObfuscatedName("alf.bi(Lra;B)Loz;")
	public class425 method12812(class14 arg0) {
		class13 var2 = this.method17190(arg0, (this.field10646 == 0 ? 0 : 5) | 0x800, this.field10640);
		if (var2 == null) {
			return null;
		}
		if (this.field10646 != 0) {
			var2.method246(this.field10646 * 2048);
		}
		class314 var3 = this.method8558();
		this.method17185(arg0, var2, var3);
		class425 var4 = class425.method12205(false);
		var2.method271(var3, this.field9811[0], 0);
		if (this.field10641 != null) {
			class128 var5 = this.field10641.method8112();
			arg0.method733(var5);
		}
		this.field10644 = var2.method292();
		this.field10643 = var2.method278();
		var2.method275();
		return var4;
	}

	@ObfuscatedName("alf.bx(Lra;B)V")
	public void method12851(class14 arg0) {
		class13 var2 = this.method17190(arg0, 0, this.field10640);
		if (var2 != null) {
			this.method17185(arg0, var2, this.method8558());
		}
	}

	@ObfuscatedName("alf.m(Lra;Lqa;Lkc;I)V")
	public void method17185(class14 arg0, class13 arg1, class314 arg2) {
		arg1.method294(arg2);
		class134[] var4 = arg1.method276();
		class119[] var5 = arg1.method413();
		if ((this.field10641 == null || this.field10641.field4945) && (var4 != null || var5 != null)) {
			this.field10641 = class467.method8123(client.field9213, true);
		}
		if (this.field10641 != null) {
			this.field10641.method8106(arg0, (long) client.field9213, var4, var5, false);
			this.field10641.method8110(this.level, this.field10510, this.field10508, this.field10509, this.field10511);
		}
	}

	@ObfuscatedName("alf.t(B)V")
	public void method17182() {
		if (this.field10641 != null) {
			this.field10641.method8102();
		}
	}

	@ObfuscatedName("alf.bb(Lra;III)Z")
	public boolean method12814(class14 arg0, int arg1, int arg2) {
		return false;
	}

	@ObfuscatedName("alf.be(I)Z")
	public final boolean method12815() {
		return false;
	}

	@ObfuscatedName("alf.bw(Lra;Laes;IIIZI)V")
	public final void method12816(class14 arg0, class836 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("alf.bo(B)V")
	public final void method12817() {
		throw new IllegalStateException();
	}
}
