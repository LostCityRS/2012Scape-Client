
import deob.ObfuscatedName;

@ObfuscatedName("ahg")
public class class902 extends class719 {

	@ObfuscatedName("ahg.bo")
	public String field10063;

	@ObfuscatedName("ahg.bh")
	public String field10040;

	@ObfuscatedName("ahg.by")
	public String field10041;

	@ObfuscatedName("ahg.bu")
	public String field10042;

	@ObfuscatedName("ahg.cl")
	public byte field10043 = 0;

	@ObfuscatedName("ahg.cq")
	public class471 field10044;

	@ObfuscatedName("ahg.co")
	public int field10045 = -1;

	@ObfuscatedName("ahg.cb")
	public int field10053 = -1;

	@ObfuscatedName("ahg.cm")
	public int field10047 = 0;

	@ObfuscatedName("ahg.cw")
	public int field10048 = 0;

	@ObfuscatedName("ahg.cx")
	public int field10049 = -1;

	@ObfuscatedName("ahg.cn")
	public int field10046 = 0;

	@ObfuscatedName("ahg.cf")
	public int field10058 = -1;

	@ObfuscatedName("ahg.cs")
	public boolean field10050 = false;

	@ObfuscatedName("ahg.cr")
	public int field10061 = 0;

	@ObfuscatedName("ahg.cp")
	public int field10054 = -1;

	@ObfuscatedName("ahg.ci")
	public int field10059 = -1;

	@ObfuscatedName("ahg.ca")
	public int field10056 = -1;

	@ObfuscatedName("ahg.ch")
	public int field10057 = -1;

	@ObfuscatedName("ahg.cv")
	public boolean field10051 = false;

	@ObfuscatedName("ahg.ck")
	public int field10039 = 0;

	@ObfuscatedName("ahg.cd")
	public int field10060 = 255;

	@ObfuscatedName("ahg.ce")
	public int field10068;

	@ObfuscatedName("ahg.ct")
	public boolean field10062 = false;

	@ObfuscatedName("ahg.cu")
	public int field10052;

	@ObfuscatedName("ahg.cc")
	public int field10064;

	@ObfuscatedName("ahg.cg")
	public boolean field10065 = false;

	@ObfuscatedName("ahg.cj")
	public boolean field10066 = false;

	@ObfuscatedName("ahg.cy")
	public boolean field10067 = false;

	@ObfuscatedName("ahg.cz")
	public final class112 field10055 = new class112(16);

	public class902(class423 arg0) {
		super(arg0);
	}

	public class902(class423 arg0, int arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("ahg.gl(Laet;I)V")
	public final void method16116(class814 arg0) {
		arg0.field9626 = 0;
		int var2 = arg0.method15220();
		this.field10043 = (byte) (var2 & 0x1);
		boolean var3 = this.field10051;
		this.field10051 = (var2 & 0x2) != 0;
		boolean var4 = (var2 & 0x4) != 0;
		int var5 = super.method13954();
		this.method13979((var2 >> 3 & 0x7) + 1);
		boolean var6 = (var2 & 0x40) != 0;
		boolean var7 = (var2 & 0x80) != 0;
		class317 var8 = class317.method5290(this.method8565().field3464);
		var8.field3475 += this.method13954() - var5 << 8;
		var8.field3477 += this.method13954() - var5 << 8;
		this.method8551(var8);
		var8.method5291();
		if (var6) {
			this.field10041 = arg0.method15366();
		} else {
			this.field10041 = null;
		}
		if (var7) {
			this.field10042 = arg0.method15366();
		} else {
			this.field10042 = null;
		}
		this.field10045 = arg0.method15238();
		this.field10053 = arg0.method15238();
		this.field10066 = arg0.method15238() == 1;
		if (Statics.field6683 == class515.field6368 && client.field9074 >= 2) {
			this.field10066 = false;
		}
		int var9 = -1;
		this.field10061 = 0;
		int[] var10 = new int[Statics.field3226.field5171.length];
		class593[] var11 = new class593[Statics.field3226.field5171.length];
		class592[] var12 = new class592[Statics.field3226.field5171.length];
		for (int var13 = 0; var13 < Statics.field3226.field5171.length; var13++) {
			if (Statics.field3226.field5171[var13] != 1) {
				int var14 = arg0.method15220();
				if (var14 == 0) {
					var10[var13] = 0;
				} else {
					int var15 = arg0.method15220();
					int var16 = (var14 << 8) + var15;
					if (var13 == 0 && var16 == 65535) {
						var9 = arg0.method15411();
						this.field10061 = arg0.method15220();
						break;
					}
					if (var16 >= 16384) {
						int var17 = var16 - 16384;
						var10[var13] = var17 | 0x40000000;
						var12[var13] = Statics.field3492.method12316(var17);
						int var18 = var12[var13].field7116;
						if (var18 != 0) {
							this.field10061 = var18;
						}
					} else {
						var10[var13] = var16 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (var9 == -1) {
			int var19 = arg0.method15239();
			int var20 = 0;
			for (int var21 = 0; var21 < Statics.field3226.field5171.length; var21++) {
				if (Statics.field3226.field5171[var21] == 0) {
					if ((var19 & 0x1 << var20) != 0) {
						var11[var21] = class593.method15930(var12[var21], arg0);
					}
					var20++;
				}
			}
		}
		int[] var22 = new int[10];
		for (int var23 = 0; var23 < 10; var23++) {
			int var24 = arg0.method15220();
			if (Statics.field5010.length < 1 || var24 < 0 || var24 >= Statics.field5010[var23][0].length) {
				var24 = 0;
			}
			var22[var23] = var24;
		}
		this.field10068 = arg0.method15239();
		this.field10063 = arg0.method15337();
		this.field10040 = this.field10063;
		if (Statics.field2119 == this) {
			Statics.field10527 = this.field10063;
		}
		this.field10047 = arg0.method15220();
		if (var4) {
			this.field10046 = arg0.method15239();
			if (this.field10046 == 65535) {
				this.field10046 = -1;
			}
			this.field10048 = this.field10047;
			this.field10049 = -1;
		} else {
			this.field10046 = 0;
			this.field10048 = arg0.method15220();
			this.field10049 = arg0.method15220();
			if (this.field10049 == 255) {
				this.field10049 = -1;
			}
		}
		int var25 = this.field10039;
		this.field10039 = arg0.method15220();
		if (this.field10039 == 0) {
			class797.method7377(this);
		} else {
			int var26 = this.field10054;
			int var27 = this.field10059;
			int var28 = this.field10056;
			int var29 = this.field10057;
			int var30 = this.field10060;
			this.field10054 = arg0.method15239();
			this.field10059 = arg0.method15239();
			this.field10056 = arg0.method15239();
			this.field10057 = arg0.method15239();
			this.field10060 = arg0.method15220();
			if (this.field10051 != var3 || this.field10039 != var25 || this.field10054 != var26 || this.field10059 != var27 || this.field10056 != var28 || this.field10057 != var29 || this.field10060 != var30) {
				class797.method1807(this);
			}
		}
		if (this.field10044 == null) {
			this.field10044 = new class471();
		}
		int var31 = this.field10044.field5006;
		int[] var32 = this.field10044.field5000;
		this.field10044.method8230(this.method13960(), var10, var11, var22, this.field10043 == 1, var9);
		if (var9 != var31) {
			class317 var33 = class317.method5290(this.method8565().field3464);
			var33.field3475 = (this.field8642[0] << 9) + (this.method13954() << 8);
			var33.field3477 = (this.field8643[0] << 9) + (this.method13954() << 8);
			this.method8551(var33);
			var33.method5291();
		}
		if (client.field9071 == this.field8593 && var32 != null) {
			for (int var34 = 0; var34 < var22.length; var34++) {
				if (var22[var34] != var32[var34]) {
					Statics.field3492.method12297();
					break;
				}
			}
		}
		if (this.field8640 != null) {
			this.field8640.method8100();
		}
		if (!this.field8616.method11767() || !this.field8616.field9899) {
			return;
		}
		class439 var35 = this.method13959();
		if (!var35.method7749(this.field8616.method11812())) {
			this.field8616.method11769(-1);
			this.field8616.field9899 = false;
		}
	}

	@ObfuscatedName("ahg.br(Lra;I)Lok;")
	public class429 method12810(class14 arg0) {
		return null;
	}

	@ObfuscatedName("ahg.bi(Lra;B)Loz;")
	public class425 method12812(class14 arg0) {
		if (this.field10044 == null || !this.method16119(arg0, 2048)) {
			return null;
		}
		class314 var2 = arg0.method516();
		class314 var3 = this.method8558();
		class315 var4 = this.method8565();
		int var5 = this.field8638.method1387();
		class424 var6 = this.field9808.field4497[this.field9807][(int) var4.field3464.field3475 >> 9][(int) var4.field3464.field3477 >> 9];
		if (var6 == null || var6.field4552 == null) {
			this.field8604 = (int) ((float) this.field8604 - (float) this.field8604 / 10.0F);
		} else {
			int var7 = this.field8604 - var6.field4552.field10495;
			this.field8604 = (int) ((float) this.field8604 - (float) var7 / 10.0F);
		}
		var2.method5115(var3);
		var2.method5116(0.0F, (float) (-20 - this.field8604), 0.0F);
		class425 var8 = null;
		this.field8650 = false;
		if (Statics.field4961.field9658.method15709() == 1) {
			class439 var9 = this.method13959();
			if (var9.field4714 && (this.field10044.field5006 == -1 || Statics.field3774.method12565(this.field10044.field5006).field7249)) {
				class553 var10 = this.field8597.method11767() && this.field8597.method11776() ? this.field8597 : null;
				class874 var11 = this.field8616.method11767() && (!this.field8616.field9899 || var10 == null) ? this.field8616 : null;
				class13 var12 = class48.method1417(arg0, var5, this.field8601, this.field8644, this.field8603, 1, this.field8651[0], 0, 0, 160, 240, var11 == null ? var10 : var11);
				if (var12 != null) {
					if (this.field9811 == null || this.field9811.length < this.field8651.length + 1) {
						this.method15642(this.field8651.length + 1);
					}
					var8 = class425.method12205(true);
					this.field8650 = true;
					arg0.method526(false);
					var12.method271(var2, this.field9811[this.field8651.length], 0);
					arg0.method526(true);
				}
			}
		}
		if (Statics.field2119 == this) {
			for (int var13 = client.field8936.length - 1; var13 >= 0; var13--) {
				class60 var14 = client.field8936[var13];
				if (var14 != null && var14.field779 != -1) {
					if (var14.field776 == 1) {
						class798 var15 = (class798) client.field8964.method11923((long) var14.field772);
						if (var15 != null) {
							class903 var16 = (class903) var15.field9550;
							class317 var17 = class317.method5377(var16.method8565().field3464, Statics.field2119.method8565().field3464);
							int var18 = (int) var17.field3475;
							int var19 = (int) var17.field3477;
							this.method16118(arg0, var2, this.field8651[0], (long) var18, (long) var19, var14.field779, 92160000L);
						}
					}
					if (var14.field776 == 2) {
						class317 var20 = Statics.field2119.method8565().field3464;
						long var21 = (long) (var14.field778 * 512 - (int) var20.field3475);
						long var23 = (long) (var14.field777 * 262144 - (int) var20.field3477);
						long var25 = (long) (var14.field780 << 9);
						long var27 = var25 * var25;
						this.method16118(arg0, var2, this.field8651[0], var21, var23, var14.field779, var27);
					}
					if (var14.field776 == 10 && var14.field772 >= 0 && var14.field772 < client.field9070.length) {
						class902 var29 = client.field9070[var14.field772];
						if (var29 != null) {
							class317 var30 = class317.method5377(var29.method8565().field3464, Statics.field2119.method8565().field3464);
							int var31 = (int) var30.field3475;
							int var32 = (int) var30.field3477;
							this.method16118(arg0, var2, this.field8651[0], (long) var31, (long) var32, var14.field779, 92160000L);
						}
					}
				}
			}
		}
		var2.method5115(var3);
		var2.method5116(0.0F, (float) (-5 - this.field8604), 0.0F);
		if (this.field9811 == null || this.field9811.length < this.field8651.length) {
			this.method15642(this.field8651.length);
		}
		if (var8 == null) {
			var8 = class425.method12205(true);
		}
		this.method14023(arg0, this.field8651, var2, false);
		for (int var33 = 0; var33 < this.field8651.length; var33++) {
			if (this.field8651[var33] != null) {
				this.field8651[var33].method271(var2, this.field9811[var33], Statics.field2119 == this ? 1 : 0);
			}
		}
		if (this.field8640 != null) {
			class128 var34 = this.field8640.method8112();
			arg0.method733(var34);
		}
		for (int var35 = 0; var35 < this.field8651.length; var35++) {
			if (this.field8651[var35] != null) {
				this.field8650 |= this.field8651[var35].method292();
			}
			this.field8651[var35] = null;
		}
		this.field9810 = client.field9042;
		return var8;
	}

	@ObfuscatedName("ahg.bx(Lra;B)V")
	public void method12851(class14 arg0) {
		if (this.field10044 == null || !this.field8613 && !this.method16119(arg0, 0)) {
			return;
		}
		class314 var2 = arg0.method516();
		var2.method5104(this.method8565());
		var2.method5116(0.0F, -5.0F, 0.0F);
		this.method14023(arg0, this.field8651, var2, this.field8613);
		for (int var3 = 0; var3 < this.field8651.length; var3++) {
			this.field8651[var3] = null;
		}
	}

	@ObfuscatedName("ahg.gb(Lra;Lkc;Lqa;JJIJ)V")
	public void method16118(class14 arg0, class314 arg1, class13 arg2, long arg3, long arg4, int arg5, long arg6) {
		long var11 = arg3 * arg3 + arg4 * arg4;
		if (var11 < 262144L || var11 > arg6) {
			return;
		}
		int var13 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.field8638.method1387()) & 0x3FFF;
		class13 var14 = class60.method8588(arg0, var13, this.field8601, this.field8644, this.field8603, arg5);
		if (var14 != null) {
			arg0.method526(false);
			var14.method271(arg1, null, 0);
			arg0.method526(true);
		}
	}

	@ObfuscatedName("ahg.go(Lra;II)Z")
	public boolean method16119(class14 arg0, int arg1) {
		int var3 = arg1;
		class439 var4 = this.method13959();
		class553 var5 = this.field8597.method11767() && !this.field8597.method11776() ? this.field8597 : null;
		class874 var6 = !this.field8616.method11767() || this.field10050 || this.field8616.field9899 && var5 != null ? null : this.field8616;
		int var7 = var4.field4712;
		int var8 = var4.field4713;
		if (var7 != 0 || var8 != 0 || var4.field4725 != 0 || var4.field4728 != 0) {
			arg1 |= 0x7;
		}
		int var9 = this.field8638.method1387();
		boolean var10 = this.field8631 != 0 && client.field9213 >= this.field8626 && client.field9213 < this.field8632;
		if (var10) {
			arg1 |= 0x80000;
		}
		class13 var11 = this.field8651[0] = this.field10044.method8244(arg0, arg1, Statics.field3769, Statics.field7650, Statics.field3774, Statics.field3492, Statics.field566, Statics.field2669, var5, var6, this.field8633, this.field8654, var9, true, Statics.field3226);
		int var12 = class471.method3503();
		if (class385.field4152 < 96 && var12 > 50) {
			class59.method16899();
		}
		if (Statics.field6683 != class515.field6368 && var12 < 50) {
			int var13 = 50 - var12;
			while (var13 > client.field8930) {
				Statics.field2391[client.field8930] = new byte[102400];
				client.field8930++;
			}
			while (var13 < client.field8930) {
				client.field8930--;
				Statics.field2391[client.field8930] = null;
			}
		} else if (Statics.field6683 != class515.field6368) {
			Statics.field2391 = new byte[50][];
			client.field8930 = 0;
		}
		if (var11 == null) {
			return false;
		}
		this.field8622 = var11.method278();
		var11.method275();
		this.method13972(var11);
		if (var7 == 0 && var8 == 0) {
			this.method13958(var9, this.method13954() << 9, this.method13954() << 9, 0, 0);
		} else {
			this.method13958(var9, var7, var8, var4.field4700, var4.field4715);
			if (this.field8601 != 0) {
				var11.method397(this.field8601);
			}
			if (this.field8644 != 0) {
				var11.method284(this.field8644);
			}
			if (this.field8603 != 0) {
				var11.method353(0, this.field8603, 0);
			}
		}
		if (var10) {
			var11.method290(this.field8596, this.field8602, this.field8617, this.field8631 & 0xFF);
		}
		if (!this.field10050) {
			this.method13957(arg0, var4, var3, var7, var8, var9);
		}
		return true;
	}

	@ObfuscatedName("ahg.gi(ZI)Ljava/lang/String;")
	public String method16120(boolean arg0) {
		String var2 = "";
		if (this.field10041 != null) {
			var2 = this.field10041;
		}
		String var3;
		if (arg0) {
			var3 = var2 + this.field10063;
		} else {
			var3 = var2 + this.field10040;
		}
		if (this.field10042 != null) {
			var3 = var3 + this.field10042;
		}
		return var3;
	}

	@ObfuscatedName("ahg.ga(ZI)Ljava/lang/String;")
	public String method16121(boolean arg0) {
		return arg0 ? this.field10063 : this.field10040;
	}

	@ObfuscatedName("ahg.gs(IIBB)V")
	public final void method16131(int arg0, int arg1, byte arg2) {
		if (this.field8597.method11767() && this.field8597.method11804().field6330 == 1) {
			this.field8615 = null;
			this.field8597.method11769(-1);
		}
		for (int var4 = 0; var4 < this.field8641.length; var4++) {
			if (this.field8641[var4].field1204 != -1) {
				class507 var5 = Statics.field4213.method11082(this.field8641[var4].field1204);
				if (var5.field5264 && var5.field5252 != -1 && Statics.field566.method11144(var5.field5252).field6330 == 1) {
					this.field8641[var4].field1203.method11769(-1);
					this.field8641[var4].field1204 = -1;
				}
			}
		}
		this.field10058 = -1;
		if (arg0 < 0 || arg0 >= client.field8980.method6220() || arg1 < 0 || arg1 >= client.field8980.method6193()) {
			this.method16123(arg0, arg1);
		} else if (this.field8642[0] >= 0 && this.field8642[0] < client.field8980.method6220() && this.field8643[0] >= 0 && this.field8643[0] < client.field8980.method6193()) {
			if (class365.field3922.field3924 == arg2) {
				client.method6031(this, arg0, arg1, class365.field3922.field3924);
			}
			this.method16124(arg0, arg1, arg2);
		} else {
			this.method16123(arg0, arg1);
		}
	}

	@ObfuscatedName("ahg.gd(IIB)V")
	public void method16123(int arg0, int arg1) {
		this.field8628 = 0;
		this.field8646 = 0;
		this.field8648 = 0;
		this.field8642[0] = arg0;
		this.field8643[0] = arg1;
		int var3 = this.method13954();
		class317 var4 = class317.method5290(this.method8565().field3464);
		var4.field3475 = this.field8642[0] * 512 + var3 * 256;
		var4.field3477 = this.field8643[0] * 512 + var3 * 256;
		this.method8551(var4);
		var4.method5291();
		if (Statics.field2119 == this) {
			client.field8980.method6139().method8154();
		}
		if (this.field8640 != null) {
			this.field8640.method8100();
		}
	}

	@ObfuscatedName("ahg.gj(IIBI)V")
	public final void method16124(int arg0, int arg1, byte arg2) {
		if (this.field8628 < this.field8642.length - 1) {
			this.field8628++;
		}
		for (int var4 = this.field8628; var4 > 0; var4--) {
			this.field8642[var4] = this.field8642[var4 - 1];
			this.field8643[var4] = this.field8643[var4 - 1];
			this.field8645[var4] = this.field8645[var4 - 1];
		}
		this.field8642[0] = arg0;
		this.field8643[0] = arg1;
		this.field8645[0] = arg2;
	}

	@ObfuscatedName("ahg.gu(I)Z")
	public final boolean method16125() {
		return this.field10044 != null;
	}

	@ObfuscatedName("ahg.k(I)I")
	public int method13954() {
		return this.field10044 == null || this.field10044.field5006 == -1 ? super.method13954() : Statics.field3774.method12565(this.field10044.field5006).field7213;
	}

	@ObfuscatedName("ahg.bm(I)I")
	public int method13960() {
		return this.field10068;
	}

	@ObfuscatedName("ahg.cx(I)I")
	public int method13961() {
		return -1;
	}

	@ObfuscatedName("ahg.bb(Lra;III)Z")
	public boolean method12814(class14 arg0, int arg1, int arg2) {
		if (this.field10044 == null || !this.method16119(arg0, 131072)) {
			return false;
		}
		class314 var4 = this.method8558();
		boolean var5 = false;
		for (int var6 = 0; var6 < this.field8651.length; var6++) {
			if (this.field8651[var6] != null && this.field8651[var6].method272(arg1, arg2, var4, true, 0)) {
				var5 = true;
				break;
			}
		}
		for (int var7 = 0; var7 < this.field8651.length; var7++) {
			this.field8651[var7] = null;
		}
		return var5;
	}

	@ObfuscatedName("ahg.be(I)Z")
	public final boolean method12815() {
		return false;
	}

	@ObfuscatedName("ahg.bw(Lra;Laes;IIIZI)V")
	public final void method12816(class14 arg0, class836 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ahg.bo(B)V")
	public final void method12817() {
		throw new IllegalStateException();
	}

	@ObfuscatedName("ahg.cf(I)Z")
	public boolean method13942() {
		return Statics.field4825.field5157;
	}

	@ObfuscatedName("ahg.cs(S)Lcd;")
	public class117 method13963() {
		if (this.field8629 != null) {
			if (this.field8629.field1232 == null) {
				return null;
			}
			if (client.field9177 == 0 || client.field9177 == 3 || client.field9177 == 1 && client.method3546(this.field10040)) {
				return this.field8629;
			}
		}
		return null;
	}

	@ObfuscatedName("ahg.gg(Ljava/lang/String;III)V")
	public void method16127(String arg0, int arg1, int arg2) {
		this.method13998(arg0, arg1, arg2, class385.method2809() * Statics.field4825.field5165);
	}

	@ObfuscatedName("ahg.u(I)Ladu;")
	public class810 method3684() {
		class453 var1 = client.field8980.method6214();
		return class810.method8611(this.field9807, (int) this.method8565().field3464.field3475 + var1.field4836 * 512, -((int) this.method8565().field3464.field3476), (int) this.method8565().field3464.field3477 + var1.field4838 * 512);
	}

	@ObfuscatedName("ahg.j(I)Lkn;")
	public class316 method3680() {
		class316 var1 = class316.method5206();
		var1.method5217(class312.method5096(this.field8638.field574), 0.0F, 0.0F);
		return var1;
	}

	@ObfuscatedName("ahg.a(I)Lko;")
	public class317 method3683() {
		return class317.method5288();
	}

	@ObfuscatedName("ahg.dk(S)I")
	public int method13970() {
		return -this.field8593 - 1;
	}
}
