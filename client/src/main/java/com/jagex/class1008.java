package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ali")
public class class1008 extends class973 {

	@ObfuscatedName("ali.b")
	public int field10611;

	@ObfuscatedName("ali.x")
	public int field10605;

	@ObfuscatedName("ali.i")
	public int field10607 = -222190617;

	@ObfuscatedName("ali.v")
	public int field10608;

	@ObfuscatedName("ali.k")
	public int field10609 = -482015405;

	@ObfuscatedName("ali.h")
	public int field10610;

	@ObfuscatedName("ali.r")
	public int field10606 = 0;

	@ObfuscatedName("ali.g")
	public int field10612 = 0;

	@ObfuscatedName("ali.y")
	public boolean field10613 = false;

	@ObfuscatedName("ali.e")
	public int field10614;

	@ObfuscatedName("ali.ay")
	public int field10615;

	@ObfuscatedName("ali.af")
	public int field10616;

	@ObfuscatedName("ali.ar")
	public int field10617;

	public class1008(class423 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.method15642(3);
		this.method17149();
	}

	@ObfuscatedName("ali.u(I)V")
	public void method17149() {
		this.field10614 = ((int) (Math.random() * 4.0D) + 32) * 1518330943;
		this.field10615 = ((int) (Math.random() * 2.0D) + 3) * 1379543607;
		this.field10616 = ((int) (Math.random() * 3.0D) + 16) * -1726641155;
		if (Statics.field4961.field9659.method15686() == 1) {
			this.field10617 = (int) (Math.random() * 10.0D) * 1815019877;
		} else {
			this.field10617 = (int) (Math.random() * 20.0D) * 1815019877;
		}
	}

	@ObfuscatedName("ali.bn(I)Z")
	public boolean method12807() {
		return false;
	}

	@ObfuscatedName("ali.ba(I)Z")
	public boolean method12808() {
		return this.field10613;
	}

	@ObfuscatedName("ali.br(Lra;I)Lok;")
	public class429 method12810(class14 arg0) {
		return null;
	}

	@ObfuscatedName("ali.bc(I)I")
	public int method12809() {
		return -10;
	}

	@ObfuscatedName("ali.bi(Lra;B)Loz;")
	public class425 method12812(class14 arg0) {
		class317 var2 = class317.method5290(this.method8565().field3464);
		class430 var3 = this.field9808.method7438(this.field9807, (int) var2.field3475 >> 9, (int) var2.field3477 >> 9);
		class970 var4 = this.field9808.method7517(this.field9807, (int) var2.field3475 >> 9, (int) var2.field3477 >> 9);
		int var5 = 0;
		if (var3 != null && var3.field4642.field10512) {
			var5 = var3.field4642.method12809();
		}
		if (var4 != null && var4.field10495 > -var5) {
			var5 = -var4.field10495;
		}
		if (this.field10606 * 1574278889 != var5) {
			var2.field3476 += var5 - this.field10606 * 1574278889;
			this.method8551(var2);
			this.field10606 = var5 * 208052569;
		}
		class314 var6 = arg0.method516();
		var6.method5157();
		if (this.field10606 * 1574278889 == 0) {
			boolean var7 = false;
			boolean var8 = false;
			boolean var9 = false;
			class12 var10 = this.field9808.field4498[this.field9809];
			int var11 = this.field10612 * 1134817071 << 1;
			int var13 = -var11 / 2;
			int var14 = -var11 / 2;
			int var15 = var10.method196((int) var2.field3475 + var13, (int) var2.field3477 + var14);
			int var16 = var11 / 2;
			int var17 = -var11 / 2;
			int var18 = var10.method196((int) var2.field3475 + var16, (int) var2.field3477 + var17);
			int var19 = -var11 / 2;
			int var20 = var11 / 2;
			int var21 = var10.method196((int) var2.field3475 + var19, (int) var2.field3477 + var20);
			int var22 = var11 / 2;
			int var23 = var11 / 2;
			int var24 = var10.method196((int) var2.field3475 + var22, (int) var2.field3477 + var23);
			int var25 = var15 < var18 ? var15 : var18;
			int var26 = var21 < var24 ? var21 : var24;
			int var27 = var18 < var24 ? var18 : var24;
			int var28 = var15 < var21 ? var15 : var21;
			if (var11 != 0) {
				int var29 = (int) (Math.atan2((double) (var25 - var26), (double) var11) * 2607.5945876176133D) & 0x3FFF;
				if (var29 != 0) {
					var6.method5178(1.0F, 0.0F, 0.0F, class312.method5096(var29));
				}
			}
			if (var11 != 0) {
				int var30 = (int) (Math.atan2((double) (var28 - var27), (double) var11) * 2607.5945876176133D) & 0x3FFF;
				if (var30 != 0) {
					var6.method5178(0.0F, 0.0F, 1.0F, class312.method5096(-var30));
				}
			}
			int var31 = var15 + var24;
			if (var18 + var21 < var31) {
				var31 = var18 + var21;
			}
			int var32 = (var31 >> 1) - (int) var2.field3476;
			if (var32 != 0) {
				var6.method5116(0.0F, (float) var32, 0.0F);
			}
		}
		var2.method5291();
		class317 var33 = this.method8565().field3464;
		var6.method5116(var33.field3475, var33.field3476 - 10.0F, var33.field3477);
		class425 var34 = class425.method12205(true);
		this.field10613 = false;
		this.field10612 = 0;
		if (this.field10609 * 1135160101 != -1) {
			class13 var35 = Statics.field3492.method12316(this.field10609 * 1135160101).method12241(arg0, 526336, this.field10610 * -1142709921, null, null, this.field10614 * 1522142143, this.field10615 * 459778951, this.field10616 * -1322178219, this.field10617 * -340244371);
			if (var35 != null) {
				var35.method271(var6, this.field9811[2], 0);
				this.field10613 |= var35.method292();
				this.field10612 = var35.method275() * -1288063025;
			}
		}
		if (this.field10607 * 428163113 != -1) {
			class13 var36 = Statics.field3492.method12316(this.field10607 * 428163113).method12241(arg0, 526336, this.field10608 * 278636793, null, null, this.field10614 * 1522142143, this.field10615 * 459778951, this.field10616 * -1322178219, this.field10617 * -340244371);
			if (var36 != null) {
				var36.method271(var6, this.field9811[1], 0);
				this.field10613 |= var36.method292();
				if (var36.method275() > this.field10612 * 1134817071) {
					this.field10612 = var36.method275() * -1288063025;
				}
			}
		}
		class13 var37 = Statics.field3492.method12316(this.field10611 * 1389284577).method12241(arg0, 526336, this.field10605 * 1291682069, null, null, this.field10614 * 1522142143, this.field10615 * 459778951, this.field10616 * -1322178219, this.field10617 * -340244371);
		if (var37 != null) {
			var37.method271(var6, this.field9811[0], 0);
			this.field10613 |= var37.method292();
			if (var37.method275() > this.field10612 * 1134817071) {
				this.field10612 = var37.method275() * -1288063025;
			}
		}
		return var34;
	}

	@ObfuscatedName("ali.bx(Lra;B)V")
	public void method12851(class14 arg0) {
	}

	@ObfuscatedName("ali.fg(I)I")
	public int method15633() {
		class592 var1 = Statics.field3492.method12316(this.field10611 * 1389284577);
		int var2 = var1.field7121 * 121958885;
		if (this.field10607 * 428163113 != -1) {
			class592 var3 = Statics.field3492.method12316(this.field10607 * 428163113);
			if (var3.field7121 * 121958885 > var2) {
				var2 = var3.field7121 * 121958885;
			}
		}
		if (this.field10609 * 1135160101 != -1) {
			class592 var4 = Statics.field3492.method12316(this.field10609 * 1135160101);
			if (var4.field7121 * 121958885 > var2) {
				var2 = var4.field7121 * 121958885;
			}
		}
		return var2;
	}

	@ObfuscatedName("ali.bb(Lra;III)Z")
	public boolean method12814(class14 arg0, int arg1, int arg2) {
		class314 var4 = arg0.method516();
		var4.method5104(this.method8565());
		var4.method5116(0.0F, -10.0F, 0.0F);
		class13 var5 = Statics.field3492.method12316(this.field10611 * 1389284577).method12241(arg0, 131072, this.field10605 * 1291682069, null, null, 0, 0, 0, 0);
		if (var5 != null && var5.method272(arg1, arg2, var4, true, 0)) {
			return true;
		}
		if (this.field10607 * 428163113 != -1) {
			class13 var6 = Statics.field3492.method12316(this.field10607 * 428163113).method12241(arg0, 131072, this.field10608 * 278636793, null, null, 0, 0, 0, 0);
			if (var6 != null && var6.method272(arg1, arg2, var4, true, 0)) {
				return true;
			}
		}
		if (this.field10609 * 1135160101 != -1) {
			class13 var7 = Statics.field3492.method12316(this.field10609 * 1135160101).method12241(arg0, 131072, this.field10610 * -1142709921, null, null, 0, 0, 0, 0);
			if (var7 != null && var7.method272(arg1, arg2, var4, true, 0)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ali.bp(I)I")
	public int method12811() {
		return this.field10606 * 1574278889 - this.method12809();
	}
}
