package com.jagex;

import deob.ObfuscatedName;
import java.awt.Canvas;

@ObfuscatedName("yt")
public class class681 extends class14 {

	@ObfuscatedName("yt.y")
	public boolean field8025;

	@ObfuscatedName("yt.e")
	public int field7999;

	@ObfuscatedName("yt.ay")
	public boolean field8000;

	@ObfuscatedName("yt.af")
	public int[] field8001;

	@ObfuscatedName("yt.ar")
	public int field8002;

	@ObfuscatedName("yt.an")
	public int field8003;

	@ObfuscatedName("yt.ap")
	public float[] field8023;

	@ObfuscatedName("yt.ag")
	public int field8005;

	@ObfuscatedName("yt.as")
	public int field8024;

	@ObfuscatedName("yt.ai")
	public int field8027;

	@ObfuscatedName("yt.ao")
	public int field8008;

	@ObfuscatedName("yt.al")
	public int field8021;

	@ObfuscatedName("yt.at")
	public int field8009;

	@ObfuscatedName("yt.ax")
	public int field8014;

	@ObfuscatedName("yt.aw")
	public int field7998;

	@ObfuscatedName("yt.aa")
	public int field8013;

	@ObfuscatedName("yt.am")
	public int field8012;

	@ObfuscatedName("yt.ad")
	public class314 field8029;

	@ObfuscatedName("yt.az")
	public class320 field8016;

	@ObfuscatedName("yt.ak")
	public class320 field8017;

	@ObfuscatedName("yt.av")
	public class320 field8018;

	@ObfuscatedName("yt.aj")
	public float[][] field8019;

	@ObfuscatedName("yt.ah")
	public int field8020;

	@ObfuscatedName("yt.au")
	public int field8004;

	@ObfuscatedName("yt.ae")
	public int field8022;

	@ObfuscatedName("yt.ac")
	public int field8015;

	@ObfuscatedName("yt.aq")
	public float field8011;

	@ObfuscatedName("yt.ab")
	public float field8007;

	@ObfuscatedName("yt.bq")
	public float field8026;

	@ObfuscatedName("yt.bz")
	public float field8010;

	@ObfuscatedName("yt.bv")
	public float field8028;

	@ObfuscatedName("yt.bj")
	public float field8006;

	@ObfuscatedName("yt.bf")
	public int field8030;

	@ObfuscatedName("yt.bt")
	public class66[] field8031;

	@ObfuscatedName("yt.bg")
	public class451 field8032;

	@ObfuscatedName("yt.bl")
	public class451 field8033;

	@ObfuscatedName("yt.bk")
	public class118 field8034;

	@ObfuscatedName("yt.bs")
	public int field8035;

	public class681(class16 arg0) {
		super(arg0);
		this.field8025 = false;
		this.field8000 = false;
		this.field8005 = 0;
		this.field8024 = 0;
		this.field8027 = 0;
		this.field8008 = 0;
		this.field7998 = 1531490641;
		this.field8013 = 626657198;
		this.field8012 = 1285728826;
		this.field8019 = new float[6][4];
		this.field8028 = 1.0F;
		this.field8006 = 0.0F;
		this.field8033 = new class451(16);
		this.field8035 = -1389806507;
		try {
			this.field8032 = new class451(6291456, 256);
			this.field8029 = new class314();
			this.field8016 = new class320();
			this.field8017 = new class320();
			this.field8018 = new class320();
			this.method13205(1);
			this.method13204(0);
			class482.method8092(true, true);
			this.field8000 = true;
			this.field7999 = (int) class153.method5554() * 1471965805;
		} catch (Throwable var3) {
			var3.printStackTrace();
			this.method442();
			throw new RuntimeException("");
		}
	}

	public class681(Canvas arg0, class16 arg1, int arg2, int arg3) {
		this(arg1);
		try {
			this.method459(arg0, arg2, arg3);
			this.method462(arg0);
		} catch (Throwable var6) {
			var6.printStackTrace();
			this.method442();
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("yt.t()Lcg;")
	public class122 method456() {
		return new class122(0, "Pure Java", 1, "CPU", 0L);
	}

	@ObfuscatedName("yt.f(II)V")
	public void method653(int arg0, int arg1) throws class881 {
		this.field415.method919(arg0, arg1);
		if (this.field400 != null) {
			this.field400.method890();
		}
	}

	@ObfuscatedName("yt.z()V")
	public void method441() {
	}

	@ObfuscatedName("yt.w()V")
	public void method443() {
		if (this.field8000) {
			class482.method2790(true, false);
			this.field8000 = false;
		}
		this.field8025 = true;
	}

	@ObfuscatedName("yt.b(I)V")
	public void method444(int arg0) {
		int var2 = arg0 - this.field7999 * 60829541;
		for (class775 var3 = (class775) this.field8032.method7931(); var3 != null; var3 = (class775) this.field8032.method7949()) {
			if (var3.field9317) {
				var3.field9316 += var2;
				int var4 = var3.field9316 / 50;
				if (var4 > 0) {
					class120 var5 = this.field400.method889(var3.field9314);
					float var6 = (float) (var5.field1252 * 424629663);
					var3.method14815((int) ((float) var2 / 1000.0F * (float) var5.field1268 / 64.0F * var6), (int) ((float) var2 / 1000.0F * (float) var5.field1261 / 64.0F * var6));
					var3.field9316 -= var4 * 50;
				}
				var3.field9317 = false;
			}
		}
		this.field7999 = arg0 * 1471965805;
		this.field8033.method7921(5);
		this.field8032.method7921(5);
	}

	@ObfuscatedName("yt.za()I")
	public int method552() {
		return 0;
	}

	@ObfuscatedName("yt.d()Z")
	public boolean method13191() {
		return this.field8025;
	}

	@ObfuscatedName("yt.n(I)[I")
	public int[] method13241(int arg0) {
		class451 var2 = this.field8032;
		class775 var3;
		synchronized (this.field8032) {
			var3 = (class775) this.field8032.method7916((long) arg0 | Long.MIN_VALUE);
			if (var3 == null) {
				class120 var4 = this.field400.method889(arg0);
				int var5 = var4.field1252 * 424629663;
				if (!this.field400.method898(arg0, class455.field4848, 0.7F, var5, var5, true)) {
					return null;
				}
				int[] var6;
				if (class456.field4853 == var4.field1262) {
					var6 = this.field400.method887(arg0, 0.7F, var5, var5, true);
				} else {
					var6 = this.field400.method886(arg0, 0.7F, var5, var5, true);
				}
				var3 = new class775(arg0, var5, var6, class456.field4852 != var4.field1262);
				this.field8032.method7918(var3, (long) arg0 | Long.MIN_VALUE, var5 * var5);
			}
		}
		var3.field9317 = true;
		return var3.method14814();
	}

	@ObfuscatedName("yt.q(I)Z")
	public boolean method13192(int arg0) {
		class120 var2 = this.field400.method889(arg0);
		return this.field400.method898(arg0, class455.field4848, 0.7F, var2.field1252 * 424629663, var2.field1252 * 424629663, true);
	}

	@ObfuscatedName("yt.x(I)I")
	public int method13231(int arg0) {
		return this.field400.method889(arg0).field1252 * 424629663;
	}

	@ObfuscatedName("yt.k(I)Lpu;")
	public class456 method13194(int arg0) {
		return this.field400.method889(arg0).field1262;
	}

	@ObfuscatedName("yt.h(I)I")
	public int method13243(int arg0) {
		return this.field400.method889(arg0).field1260 & 0xFFFF;
	}

	@ObfuscatedName("yt.y(I)Z")
	public boolean method13195(int arg0) {
		return this.field400.method889(arg0).field1273 || this.field400.method889(arg0).field1274;
	}

	@ObfuscatedName("yt.i()Z")
	public boolean method629() {
		return false;
	}

	@ObfuscatedName("yt.v()Z")
	public boolean method447() {
		return false;
	}

	@ObfuscatedName("yt.g()Z")
	public boolean method448() {
		return true;
	}

	@ObfuscatedName("yt.ay()Z")
	public boolean method450() {
		return false;
	}

	@ObfuscatedName("yt.af()Z")
	public boolean method451() {
		return false;
	}

	@ObfuscatedName("yt.e()Z")
	public boolean method449() {
		return false;
	}

	@ObfuscatedName("yt.ar()Z")
	public boolean method452() {
		return false;
	}

	@ObfuscatedName("yt.an()Z")
	public boolean method765() {
		return false;
	}

	@ObfuscatedName("yt.ap()Z")
	public boolean method454() {
		return false;
	}

	@ObfuscatedName("yt.ag()Z")
	public boolean method455() {
		return true;
	}

	@ObfuscatedName("yt.db(Z)V")
	public void method471(boolean arg0) {
	}

	@ObfuscatedName("yt.ak(Ljava/awt/Canvas;II)Lya;")
	public class675 method735(Canvas arg0, int arg1, int arg2) {
		return class892.method1885(this, arg0, arg1, arg2);
	}

	@ObfuscatedName("yt.da(II[I[F)V")
	public void method13197(int arg0, int arg1, int[] arg2, float[] arg3) {
		this.field8002 = arg0 * 884758881;
		this.field8003 = arg1 * -1059959789;
		this.field8001 = arg2;
		this.field8023 = arg3;
		for (int var5 = 0; var5 < this.field8030 * -1969773887; var5++) {
			this.field8031[var5].method1948();
		}
		this.method753();
		this.method490();
	}

	@ObfuscatedName("yt.ae(IIII)[I")
	public int[] method691(int arg0, int arg1, int arg2, int arg3) {
		if (this.field8001 == null) {
			throw new IllegalStateException("");
		}
		int[] var5 = new int[arg2 * arg3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg3; var7++) {
			int var8 = this.field8002 * 1322125985 * (arg1 + var7) + arg0;
			for (int var9 = 0; var9 < arg2; var9++) {
				var5[var6++] = this.field8001[var8 + var9];
			}
		}
		return var5;
	}

	@ObfuscatedName("yt.ac()V")
	public void method587() {
	}

	@ObfuscatedName("yt.ai([I)V")
	public void method703(int[] arg0) {
		arg0[0] = this.field8002 * 1322125985;
		arg0[1] = this.field8003 * 1559322139;
	}

	@ObfuscatedName("yt.ma()V")
	public void method13198() {
		if (this.field8023 == null) {
			return;
		}
		if (this.field8005 * 964411091 == 0 && this.field8024 * 1625022069 == this.field8002 * 1322125985 && this.field8027 * -573330681 == 0 && this.field8008 * -1468773707 == this.field8003 * 1559322139) {
			int var1 = this.field8023.length;
			int var2 = var1 - (var1 & 0x7);
			int var3 = 0;
			while (var3 < var2) {
				this.field8023[var3++] = 2.14748365E9F;
				this.field8023[var3++] = 2.14748365E9F;
				this.field8023[var3++] = 2.14748365E9F;
				this.field8023[var3++] = 2.14748365E9F;
				this.field8023[var3++] = 2.14748365E9F;
				this.field8023[var3++] = 2.14748365E9F;
				this.field8023[var3++] = 2.14748365E9F;
				this.field8023[var3++] = 2.14748365E9F;
			}
			while (var3 < var1) {
				this.field8023[var3++] = 2.14748365E9F;
			}
			return;
		}
		int var4 = this.field8024 * 1625022069 - this.field8005 * 964411091;
		int var5 = this.field8008 * -1468773707 - this.field8027 * -573330681;
		int var6 = this.field8002 * 1322125985 - var4;
		int var7 = this.field8027 * -573330681 * this.field8002 * 1322125985 + this.field8005 * 964411091;
		int var8 = var4 >> 3;
		int var9 = var4 & 0x7;
		int var10 = var7 - 1;
		for (int var11 = -var5; var11 < 0; var11++) {
			if (var8 > 0) {
				int var12 = var8;
				do {
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var12--;
				} while (var12 > 0);
			}
			if (var9 > 0) {
				int var13 = var9;
				do {
					var10++;
					this.field8023[var10] = 2.14748365E9F;
					var13--;
				} while (var13 > 0);
			}
			var10 += var6;
		}
	}

	@ObfuscatedName("yt.RA(Z)V")
	public void method526(boolean arg0) {
		class66 var2 = this.method13206(Thread.currentThread());
		var2.field874 = arg0;
	}

	@ObfuscatedName("yt.aq()V")
	public void method490() {
		this.field8020 = 0;
		this.field8004 = 0;
		this.field8022 = this.field8002 * -304170151;
		this.field8015 = this.field8003 * -1415581949;
		this.method13199();
	}

	@ObfuscatedName("yt.ab(IIII)V")
	public void method474(int arg0, int arg1, int arg2, int arg3) {
		this.field8020 = arg0 * -974080495;
		this.field8004 = arg1 * 1594334871;
		this.field8022 = arg2 * 971173305;
		this.field8015 = arg3 * -2008440519;
		this.method13199();
	}

	@ObfuscatedName("yt.GA(FF)V")
	public void method475(float arg0, float arg1) {
		this.field8028 = arg1 - arg0;
		this.field8006 = arg0 + arg1 - 1.0F;
		for (int var3 = 0; var3 < this.field8030 * -1969773887; var3++) {
			class66 var4 = this.field8031[var3];
			class77 var5 = var4.field868;
			var5.field996 = this.field8028;
			var5.field995 = this.field8006;
		}
	}

	@ObfuscatedName("yt.of()V")
	public void method13199() {
		int var1 = this.field8024 * 1625022069 - this.field8005 * 964411091;
		int var2 = this.field8008 * -1468773707 - this.field8027 * -573330681;
		float var3 = this.field8011 = (float) (this.field8022 * 2007566473) / 2.0F;
		float var4 = this.field8026 = (float) (this.field8015 * -1112212215) / 2.0F;
		this.field8007 = (float) (this.field8020 * 890829553) + var3;
		this.field8010 = (float) (this.field8004 * -489570009) + var4;
		for (int var5 = 0; var5 < this.field8030 * -1969773887; var5++) {
			class66 var6 = this.field8031[var5];
			class77 var7 = var6.field868;
			var7.field992 = var3;
			var7.field990 = var4;
			var7.field991 = this.field8007 - (float) (this.field8005 * 964411091);
			var7.field1015 = this.field8010 - (float) (this.field8027 * -573330681);
			var7.field1010 = var1;
			var7.field994 = var2;
		}
		int var8 = this.field8027 * -573330681 * this.field8002 * 1322125985 + this.field8005 * 964411091;
		for (int var9 = this.field8027 * -573330681; var9 < this.field8008 * -1468773707; var9++) {
			for (int var10 = 0; var10 < this.field8030 * -1969773887; var10++) {
				this.field8031[var10].field868.field1017[var9 - this.field8027 * -573330681] = var8;
			}
			var8 += this.field8002 * 1322125985;
		}
	}

	@ObfuscatedName("yt.L()V")
	public void method753() {
		this.field8005 = 0;
		this.field8027 = 0;
		this.field8024 = this.field8002 * 1710378493;
		this.field8008 = this.field8003 * 632027023;
		this.method13199();
	}

	@ObfuscatedName("yt.r(IIII)V")
	public void method659(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.field8002 * 1322125985) {
			arg2 = this.field8002 * 1322125985;
		}
		if (arg3 > this.field8003 * 1559322139) {
			arg3 = this.field8003 * 1559322139;
		}
		this.field8005 = arg0 * 342051163;
		this.field8024 = arg2 * -2017951267;
		this.field8027 = arg1 * 1060360887;
		this.field8008 = arg3 * 747623325;
		this.method13199();
	}

	@ObfuscatedName("yt.o(IIII)V")
	public void method478(int arg0, int arg1, int arg2, int arg3) {
		if (this.field8005 * 964411091 < arg0) {
			this.field8005 = arg0 * 342051163;
		}
		if (this.field8027 * -573330681 < arg1) {
			this.field8027 = arg1 * 1060360887;
		}
		if (this.field8024 * 1625022069 > arg2) {
			this.field8024 = arg2 * -2017951267;
		}
		if (this.field8008 * -1468773707 > arg3) {
			this.field8008 = arg3 * 747623325;
		}
		this.method13199();
	}

	@ObfuscatedName("yt.qa([I)V")
	public void method453(int[] arg0) {
		arg0[0] = this.field8005 * 964411091;
		arg0[1] = this.field8027 * -573330681;
		arg0[2] = this.field8024 * 1625022069;
		arg0[3] = this.field8008 * -1468773707;
	}

	@ObfuscatedName("yt.ba(II)V")
	public void method505(int arg0, int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.method489(0, 0, this.field8002 * 1322125985, this.field8003 * 1559322139, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method13198();
		}
	}

	@ObfuscatedName("yt.bl(IIIIII)V")
	public void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.method493(arg0, arg1, arg2, arg4, arg5);
		this.method493(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method494(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method494(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@ObfuscatedName("yt.B(IIIIII)V")
	public void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.field8001 == null) {
			return;
		}
		if (arg0 < this.field8005 * 964411091) {
			arg2 -= this.field8005 * 964411091 - arg0;
			arg0 = this.field8005 * 964411091;
		}
		if (arg1 < this.field8027 * -573330681) {
			arg3 -= this.field8027 * -573330681 - arg1;
			arg1 = this.field8027 * -573330681;
		}
		if (arg0 + arg2 > this.field8024 * 1625022069) {
			arg2 = this.field8024 * 1625022069 - arg0;
		}
		if (arg1 + arg3 > this.field8008 * -1468773707) {
			arg3 = this.field8008 * -1468773707 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.field8024 * 1625022069 || arg1 > this.field8008 * -1468773707) {
			return;
		}
		int var7 = this.field8002 * 1322125985 - arg2;
		int var8 = this.field8002 * 1322125985 * arg1 + arg0;
		int var9 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && var9 == 255) {
			int var22 = arg2 >> 3;
			int var23 = arg2 & 0x7;
			int var24 = var8 - 1;
			for (int var25 = -arg3; var25 < 0; var25++) {
				if (var22 > 0) {
					int var26 = var22;
					do {
						var24++;
						this.field8001[var24] = arg4;
						var24++;
						this.field8001[var24] = arg4;
						var24++;
						this.field8001[var24] = arg4;
						var24++;
						this.field8001[var24] = arg4;
						var24++;
						this.field8001[var24] = arg4;
						var24++;
						this.field8001[var24] = arg4;
						var24++;
						this.field8001[var24] = arg4;
						var24++;
						this.field8001[var24] = arg4;
						var26--;
					} while (var26 > 0);
				}
				if (var23 > 0) {
					int var27 = var23;
					do {
						var24++;
						this.field8001[var24] = arg4;
						var27--;
					} while (var27 > 0);
				}
				var24 += var7;
			}
		} else if (arg5 == 1) {
			int var10 = ((arg4 & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * var9 & 0xFF00FF00);
			int var11 = 256 - var9;
			for (int var12 = 0; var12 < arg3; var12++) {
				for (int var13 = -arg2; var13 < 0; var13++) {
					int var14 = this.field8001[var8];
					int var15 = ((var14 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + (((var14 & 0xFF00FF00) >>> 8) * var11 & 0xFF00FF00);
					this.field8001[var8++] = var10 + var15;
				}
				var8 += var7;
			}
		} else if (arg5 == 2) {
			for (int var16 = 0; var16 < arg3; var16++) {
				for (int var17 = -arg2; var17 < 0; var17++) {
					int var18 = this.field8001[var8];
					int var19 = arg4 + var18;
					int var20 = (arg4 & 0xFF00FF) + (var18 & 0xFF00FF);
					int var21 = (var19 - var20 & 0x10000) + (var20 & 0x1000100);
					this.field8001[var8++] = var19 - var21 | var21 - (var21 >>> 8);
				}
				var8 += var7;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.N(IIIIII[BII)V")
	public void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		if (this.field8001 == null || (arg2 <= 0 || arg3 <= 0)) {
			return;
		}
		int var10 = 0;
		int var11 = 0;
		int var12 = (arg7 << 16) / arg2;
		int var13 = (arg6.length / arg7 << 16) / arg3;
		int var14 = this.field8002 * 1322125985 * arg1 + arg0;
		int var15 = this.field8002 * 1322125985 - arg2;
		if (arg1 + arg3 > this.field8008 * -1468773707) {
			arg3 -= arg1 + arg3 - this.field8008 * -1468773707;
		}
		if (arg1 < this.field8027 * -573330681) {
			int var16 = this.field8027 * -573330681 - arg1;
			arg3 -= var16;
			var14 += this.field8002 * 1322125985 * var16;
			var11 += var13 * var16;
		}
		if (arg0 + arg2 > this.field8024 * 1625022069) {
			int var17 = arg0 + arg2 - this.field8024 * 1625022069;
			arg2 -= var17;
			var15 += var17;
		}
		if (arg0 < this.field8005 * 964411091) {
			int var18 = this.field8005 * 964411091 - arg0;
			arg2 -= var18;
			var14 += var18;
			var10 += var12 * var18;
			var15 += var18;
		}
		int var19 = arg4 >>> 24;
		int var20 = arg5 >>> 24;
		if (arg8 == 0 || arg8 == 1 && var19 == 255 && var20 == 255) {
			int var38 = var10;
			for (int var39 = -arg3; var39 < 0; var39++) {
				int var40 = (var11 >> 16) * arg7;
				for (int var41 = -arg2; var41 < 0; var41++) {
					if (arg6[(var10 >> 16) + var40] == 0) {
						this.field8001[var14++] = arg4;
					} else {
						this.field8001[var14++] = arg5;
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var38;
				var14 += var15;
			}
		} else if (arg8 == 1) {
			int var21 = var10;
			for (int var22 = -arg3; var22 < 0; var22++) {
				int var23 = (var11 >> 16) * arg7;
				for (int var24 = -arg2; var24 < 0; var24++) {
					int var25 = arg4;
					if (arg6[(var10 >> 16) + var23] != 0) {
						var25 = arg5;
					}
					int var26 = var25 >>> 24;
					int var27 = 255 - var26;
					int var28 = this.field8001[var14];
					this.field8001[var14++] = ((var25 & 0xFF00FF) * var26 + (var28 & 0xFF00FF) * var27 & 0xFF00FF00) + ((var25 & 0xFF00) * var26 + (var28 & 0xFF00) * var27 & 0xFF0000) >> 8;
					var10 += var12;
				}
				var11 += var13;
				var10 = var21;
				var14 += var15;
			}
		} else if (arg8 == 2) {
			int var29 = var10;
			for (int var30 = -arg3; var30 < 0; var30++) {
				int var31 = (var11 >> 16) * arg7;
				for (int var32 = -arg2; var32 < 0; var32++) {
					int var33 = arg4;
					if (arg6[(var10 >> 16) + var31] != 0) {
						var33 = arg5;
					}
					if (var33 == 0) {
						var14++;
					} else {
						int var34 = this.field8001[var14];
						int var35 = var33 + var34;
						int var36 = (var33 & 0xFF00FF) + (var34 & 0xFF00FF);
						int var37 = (var35 - var36 & 0x10000) + (var36 & 0x1000100);
						this.field8001[var14++] = var35 - var37 | var37 - (var37 >>> 8);
					}
					var10 += var12;
				}
				var11 += var13;
				var10 = var29;
				var14 += var15;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.CA(IIIII)V")
	public void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field8001 == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		int var6 = arg1 - arg2;
		if (var6 < this.field8027 * -573330681) {
			var6 = this.field8027 * -573330681;
		}
		int var7 = arg1 + arg2 + 1;
		if (var7 > this.field8008 * -1468773707) {
			var7 = this.field8008 * -1468773707;
		}
		int var8 = var6;
		int var9 = arg2 * arg2;
		int var10 = 0;
		int var11 = arg1 - var6;
		int var12 = var11 * var11;
		int var13 = var12 - var11;
		if (arg1 > var7) {
			arg1 = var7;
		}
		int var14 = arg3 >>> 24;
		if (arg4 == 0 || arg4 == 1 && var14 == 255) {
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				int var55 = arg0 - var10 + 1;
				if (var55 < this.field8005 * 964411091) {
					var55 = this.field8005 * 964411091;
				}
				int var56 = arg0 + var10;
				if (var56 > this.field8024 * 1625022069) {
					var56 = this.field8024 * 1625022069;
				}
				int var57 = this.field8002 * 1322125985 * var8 + var55;
				for (int var58 = var55; var58 < var56; var58++) {
					this.field8001[var57++] = arg3;
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			int var59 = arg2;
			int var60 = var8 - arg1;
			int var61 = var60 * var60 + var9;
			int var62 = var61 - arg2;
			int var63 = var61 - var60;
			while (var8 < var7) {
				while (var63 > var9 && var62 > var9) {
					var63 -= var59-- + var59;
					var62 -= var59 + var59;
				}
				int var64 = arg0 - var59;
				if (var64 < this.field8005 * 964411091) {
					var64 = this.field8005 * 964411091;
				}
				int var65 = arg0 + var59;
				if (var65 > this.field8024 * 1625022069 - 1) {
					var65 = this.field8024 * 1625022069 - 1;
				}
				int var66 = this.field8002 * 1322125985 * var8 + var64;
				for (int var67 = var64; var67 <= var65; var67++) {
					this.field8001[var66++] = arg3;
				}
				var8++;
				var63 += var60 + var60;
				var62 += var60++ + var60;
			}
			return;
		} else if (arg4 == 1) {
			int var15 = (var14 << 24) + ((arg3 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var14 >> 8 & 0xFF00);
			int var16 = 256 - var14;
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				int var17 = arg0 - var10 + 1;
				if (var17 < this.field8005 * 964411091) {
					var17 = this.field8005 * 964411091;
				}
				int var18 = arg0 + var10;
				if (var18 > this.field8024 * 1625022069) {
					var18 = this.field8024 * 1625022069;
				}
				int var19 = this.field8002 * 1322125985 * var8 + var17;
				for (int var20 = var17; var20 < var18; var20++) {
					int var21 = this.field8001[var19];
					int var22 = ((var21 & 0xFF00) * var16 >> 8 & 0xFF00) + ((var21 & 0xFF00FF) * var16 >> 8 & 0xFF00FF);
					this.field8001[var19++] = var15 + var22;
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			int var23 = arg2;
			int var24 = -var11;
			int var25 = var24 * var24 + var9;
			int var26 = var25 - arg2;
			int var27 = var25 - var24;
			while (var8 < var7) {
				while (var27 > var9 && var26 > var9) {
					var27 -= var23-- + var23;
					var26 -= var23 + var23;
				}
				int var28 = arg0 - var23;
				if (var28 < this.field8005 * 964411091) {
					var28 = this.field8005 * 964411091;
				}
				int var29 = arg0 + var23;
				if (var29 > this.field8024 * 1625022069 - 1) {
					var29 = this.field8024 * 1625022069 - 1;
				}
				int var30 = this.field8002 * 1322125985 * var8 + var28;
				for (int var31 = var28; var31 <= var29; var31++) {
					int var32 = this.field8001[var30];
					int var33 = ((var32 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var32 & 0xFF00) * var16 >> 8 & 0xFF00);
					this.field8001[var30++] = var15 + var33;
				}
				var8++;
				var27 += var24 + var24;
				var26 += var24++ + var24;
			}
		} else if (arg4 == 2) {
			while (var8 < arg1) {
				while (var13 <= var9 || var12 <= var9) {
					var12 += var10 + var10;
					var13 += var10++ + var10;
				}
				int var34 = arg0 - var10 + 1;
				if (var34 < this.field8005 * 964411091) {
					var34 = this.field8005 * 964411091;
				}
				int var35 = arg0 + var10;
				if (var35 > this.field8024 * 1625022069) {
					var35 = this.field8024 * 1625022069;
				}
				int var36 = this.field8002 * 1322125985 * var8 + var34;
				for (int var37 = var34; var37 < var35; var37++) {
					int var38 = this.field8001[var36];
					int var39 = arg3 + var38;
					int var40 = (arg3 & 0xFF00FF) + (var38 & 0xFF00FF);
					int var41 = (var39 - var40 & 0x10000) + (var40 & 0x1000100);
					this.field8001[var36++] = var39 - var41 | var41 - (var41 >>> 8);
				}
				var8++;
				var12 -= var11-- + var11;
				var13 -= var11 + var11;
			}
			int var42 = arg2;
			int var43 = -var11;
			int var44 = var43 * var43 + var9;
			int var45 = var44 - arg2;
			int var46 = var44 - var43;
			while (var8 < var7) {
				while (var46 > var9 && var45 > var9) {
					var46 -= var42-- + var42;
					var45 -= var42 + var42;
				}
				int var47 = arg0 - var42;
				if (var47 < this.field8005 * 964411091) {
					var47 = this.field8005 * 964411091;
				}
				int var48 = arg0 + var42;
				if (var48 > this.field8024 * 1625022069 - 1) {
					var48 = this.field8024 * 1625022069 - 1;
				}
				int var49 = this.field8002 * 1322125985 * var8 + var47;
				for (int var50 = var47; var50 <= var48; var50++) {
					int var51 = this.field8001[var49];
					int var52 = arg3 + var51;
					int var53 = (arg3 & 0xFF00FF) + (var51 & 0xFF00FF);
					int var54 = (var52 - var53 & 0x10000) + (var53 & 0x1000100);
					this.field8001[var49++] = var52 - var54 | var54 - (var54 >>> 8);
				}
				var8++;
				var46 += var43 + var43;
				var45 += var43++ + var43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.XA(IIIII)V")
	public void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field8001 == null || (arg1 < this.field8027 * -573330681 || arg1 >= this.field8008 * -1468773707)) {
			return;
		}
		if (arg0 < this.field8005 * 964411091) {
			arg2 -= this.field8005 * 964411091 - arg0;
			arg0 = this.field8005 * 964411091;
		}
		if (arg0 + arg2 > this.field8024 * 1625022069) {
			arg2 = this.field8024 * 1625022069 - arg0;
		}
		int var6 = this.field8002 * 1322125985 * arg1 + arg0;
		int var7 = arg3 >>> 24;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (int var18 = 0; var18 < arg2; var18++) {
				this.field8001[var6 + var18] = arg3;
			}
		} else if (arg4 == 1) {
			int var8 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var7 >> 8 & 0xFF00);
			int var9 = 256 - var7;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = this.field8001[var6 + var10];
				int var12 = ((var11 & 0xFF00) * var9 >> 8 & 0xFF00) + ((var11 & 0xFF00FF) * var9 >> 8 & 0xFF00FF);
				this.field8001[var6 + var10] = var8 + var12;
			}
		} else if (arg4 == 2) {
			for (int var13 = 0; var13 < arg2; var13++) {
				int var14 = this.field8001[var6 + var13];
				int var15 = arg3 + var14;
				int var16 = (arg3 & 0xFF00FF) + (var14 & 0xFF00FF);
				int var17 = (var15 - var16 & 0x10000) + (var16 & 0x1000100);
				this.field8001[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.oa(IIIIIIII)V")
	public void method13230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.field8001 == null || (arg1 < this.field8027 * -573330681 || arg1 >= this.field8008 * -1468773707)) {
			return;
		}
		int var9 = this.field8002 * 1322125985 * arg1 + arg0;
		int var10 = arg3 >>> 24;
		int var11 = arg5 + arg6;
		int var12 = arg7 % var11;
		if (arg4 == 0 || arg4 == 1 && var10 == 255) {
			int var23 = 0;
			while (var23 < arg2) {
				if (arg0 + var23 >= this.field8005 * 964411091 && arg0 + var23 < this.field8024 * 1625022069 && var12 < arg5) {
					this.field8001[var9 + var23] = arg3;
				}
				var23++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 1) {
			int var13 = (var10 << 24) + ((arg3 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var10 >> 8 & 0xFF00);
			int var14 = 256 - var10;
			int var15 = 0;
			while (var15 < arg2) {
				if (arg0 + var15 >= this.field8005 * 964411091 && arg0 + var15 < this.field8024 * 1625022069 && var12 < arg5) {
					int var16 = this.field8001[var9 + var15];
					int var17 = ((var16 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var14 >> 8 & 0xFF00);
					this.field8001[var9 + var15] = var13 + var17;
				}
				var15++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 2) {
			int var18 = 0;
			while (var18 < arg2) {
				if (arg0 + var18 >= this.field8005 * 964411091 && arg0 + var18 < this.field8024 * 1625022069 && var12 < arg5) {
					int var19 = this.field8001[var9 + var18];
					int var20 = arg3 + var19;
					int var21 = (arg3 & 0xFF00FF) + (var19 & 0xFF00FF);
					int var22 = (var20 - var21 & 0x10000) + (var21 & 0x1000100);
					this.field8001[var9 + var18] = var20 - var22 | var22 - (var22 >>> 8);
				}
				var18++;
				var12++;
				var12 %= var11;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.G(IIIII)V")
	public void method494(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (this.field8001 == null || (arg0 < this.field8005 * 964411091 || arg0 >= this.field8024 * 1625022069)) {
			return;
		}
		if (arg1 < this.field8027 * -573330681) {
			arg2 -= this.field8027 * -573330681 - arg1;
			arg1 = this.field8027 * -573330681;
		}
		if (arg1 + arg2 > this.field8008 * -1468773707) {
			arg2 = this.field8008 * -1468773707 - arg1;
		}
		int var6 = this.field8002 * 1322125985 * arg1 + arg0;
		int var7 = arg3 >>> 24;
		if (arg4 == 0 || arg4 == 1 && var7 == 255) {
			for (int var20 = 0; var20 < arg2; var20++) {
				this.field8001[this.field8002 * 1322125985 * var20 + var6] = arg3;
			}
		} else if (arg4 == 1) {
			int var8 = (var7 << 24) + ((arg3 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var7 >> 8 & 0xFF00);
			int var9 = 256 - var7;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = this.field8002 * 1322125985 * var10 + var6;
				int var12 = this.field8001[var11];
				int var13 = ((var12 & 0xFF00) * var9 >> 8 & 0xFF00) + ((var12 & 0xFF00FF) * var9 >> 8 & 0xFF00FF);
				this.field8001[var11] = var8 + var13;
			}
		} else if (arg4 == 2) {
			for (int var14 = 0; var14 < arg2; var14++) {
				int var15 = this.field8002 * 1322125985 * var14 + var6;
				int var16 = this.field8001[var15];
				int var17 = arg3 + var16;
				int var18 = (arg3 & 0xFF00FF) + (var16 & 0xFF00FF);
				int var19 = (var17 - var18 & 0x10000) + (var18 & 0x1000100);
				this.field8001[var15] = var17 - var19 | var19 - (var19 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.os(IIIIIIII)V")
	public void method13193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.field8001 == null || (arg0 < this.field8005 * 964411091 || arg0 >= this.field8024 * 1625022069)) {
			return;
		}
		int var9 = this.field8002 * 1322125985 * arg1 + arg0;
		int var10 = arg3 >>> 24;
		int var11 = arg5 + arg6;
		int var12 = arg7 % var11;
		if (arg4 == 0 || arg4 == 1 && var10 == 255) {
			int var25 = 0;
			while (var25 < arg2) {
				if (arg1 + var25 >= this.field8027 * -573330681 && arg1 + var25 < this.field8008 * -1468773707 && var12 < arg5) {
					this.field8001[this.field8002 * 1322125985 * var25 + var9] = arg3;
				}
				var25++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 1) {
			int var13 = (var10 << 24) + ((arg3 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * var10 >> 8 & 0xFF00);
			int var14 = 256 - var10;
			int var15 = 0;
			while (var15 < arg2) {
				if (arg1 + var15 >= this.field8027 * -573330681 && arg1 + var15 < this.field8008 * -1468773707 && var12 < arg5) {
					int var16 = this.field8002 * 1322125985 * var15 + var9;
					int var17 = this.field8001[var16];
					int var18 = ((var17 & 0xFF00) * var14 >> 8 & 0xFF00) + ((var17 & 0xFF00FF) * var14 >> 8 & 0xFF00FF);
					this.field8001[var16] = var13 + var18;
				}
				var15++;
				var12++;
				var12 %= var11;
			}
		} else if (arg4 == 2) {
			int var19 = 0;
			while (var19 < arg2) {
				if (arg1 + var19 >= this.field8027 * -573330681 && arg1 + var19 < this.field8008 * -1468773707 && var12 < arg5) {
					int var20 = this.field8002 * 1322125985 * var19 + var9;
					int var21 = this.field8001[var20];
					int var22 = arg3 + var21;
					int var23 = (arg3 & 0xFF00FF) + (var21 & 0xFF00FF);
					int var24 = (var22 - var23 & 0x10000) + (var23 & 0x1000100);
					this.field8001[var20] = var22 - var24 | var24 - (var24 >>> 8);
				}
				var19++;
				var12++;
				var12 %= var11;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.bs(IIIIII)V")
	public void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (this.field8001 == null) {
			return;
		}
		int var7 = arg2 - arg0;
		int var8 = arg3 - arg1;
		if (var8 == 0) {
			if (var7 >= 0) {
				this.method493(arg0, arg1, var7 + 1, arg4, arg5);
			} else {
				this.method493(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
			}
		} else if (var7 != 0) {
			if (var7 + var8 < 0) {
				arg0 += var7;
				var7 = -var7;
				arg1 += var8;
				var8 = -var8;
			}
			if (var7 > var8) {
				int var9 = arg1 << 16;
				int var10 = var9 + 32768;
				int var11 = var8 << 16;
				int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
				int var13 = arg0 + var7;
				if (arg0 < this.field8005 * 964411091) {
					var10 += (this.field8005 * 964411091 - arg0) * var12;
					arg0 = this.field8005 * 964411091;
				}
				if (var13 >= this.field8024 * 1625022069) {
					var13 = this.field8024 * 1625022069 - 1;
				}
				int var14 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && var14 == 255) {
					while (arg0 <= var13) {
						int var27 = var10 >> 16;
						if (var27 >= this.field8027 * -573330681 && var27 < this.field8008 * -1468773707) {
							this.field8001[this.field8002 * 1322125985 * var27 + arg0] = arg4;
						}
						var10 += var12;
						arg0++;
					}
				} else if (arg5 == 1) {
					int var15 = (var14 << 24) + ((arg4 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var14 >> 8 & 0xFF00);
					int var16 = 256 - var14;
					while (arg0 <= var13) {
						int var17 = var10 >> 16;
						if (var17 >= this.field8027 * -573330681 && var17 < this.field8008 * -1468773707) {
							int var18 = this.field8002 * 1322125985 * var17 + arg0;
							int var19 = this.field8001[var18];
							int var20 = ((var19 & 0xFF00FF) * var16 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var16 >> 8 & 0xFF00);
							this.field8001[var18] = var15 + var20;
						}
						var10 += var12;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= var13) {
						int var21 = var10 >> 16;
						if (var21 >= this.field8027 * -573330681 && var21 < this.field8008 * -1468773707) {
							int var22 = this.field8002 * 1322125985 * var21 + arg0;
							int var23 = this.field8001[var22];
							int var24 = arg4 + var23;
							int var25 = (arg4 & 0xFF00FF) + (var23 & 0xFF00FF);
							int var26 = (var24 - var25 & 0x10000) + (var25 & 0x1000100);
							this.field8001[var22] = var24 - var26 | var26 - (var26 >>> 8);
						}
						var10 += var12;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				int var28 = arg0 << 16;
				int var29 = var28 + 32768;
				int var30 = var7 << 16;
				int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
				int var32 = arg1 + var8;
				if (arg1 < this.field8027 * -573330681) {
					var29 += (this.field8027 * -573330681 - arg1) * var31;
					arg1 = this.field8027 * -573330681;
				}
				if (var32 >= this.field8008 * -1468773707) {
					var32 = this.field8008 * -1468773707 - 1;
				}
				int var33 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && var33 == 255) {
					while (arg1 <= var32) {
						int var46 = var29 >> 16;
						if (var46 >= this.field8005 * 964411091 && var46 < this.field8024 * 1625022069) {
							this.field8001[this.field8002 * 1322125985 * arg1 + var46] = arg4;
						}
						var29 += var31;
						arg1++;
					}
				} else if (arg5 == 1) {
					int var34 = (var33 << 24) + ((arg4 & 0xFF00) * var33 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var33 >> 8 & 0xFF00FF);
					int var35 = 256 - var33;
					while (arg1 <= var32) {
						int var36 = var29 >> 16;
						if (var36 >= this.field8005 * 964411091 && var36 < this.field8024 * 1625022069) {
							int var37 = this.field8002 * 1322125985 * arg1 + var36;
							int var38 = this.field8001[var37];
							int var39 = ((var38 & 0xFF00FF) * var35 >> 8 & 0xFF00FF) + ((var38 & 0xFF00) * var35 >> 8 & 0xFF00);
							this.field8001[this.field8002 * 1322125985 * arg1 + var36] = var34 + var39;
						}
						var29 += var31;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= var32) {
						int var40 = var29 >> 16;
						if (var40 >= this.field8005 * 964411091 && var40 < this.field8024 * 1625022069) {
							int var41 = this.field8002 * 1322125985 * arg1 + var40;
							int var42 = this.field8001[var41];
							int var43 = arg4 + var42;
							int var44 = (arg4 & 0xFF00FF) + (var42 & 0xFF00FF);
							int var45 = (var43 - var44 & 0x10000) + (var44 & 0x1000100);
							this.field8001[var41] = var43 - var45 | var45 - (var45 >>> 8);
						}
						var29 += var31;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (var8 >= 0) {
			this.method494(arg0, arg1, var8 + 1, arg4, arg5);
		} else {
			this.method494(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
		}
	}

	@ObfuscatedName("yt.bd(IIIIIIIII)V")
	public void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.field8001 == null) {
			return;
		}
		int var10 = arg2 - arg0;
		int var11 = arg3 - arg1;
		if (var11 == 0) {
			if (var10 >= 0) {
				this.method13230(arg0, arg1, var10 + 1, arg4, arg5, arg6, arg7, arg8);
			} else {
				int var12 = arg6 + arg7;
				int var13 = arg8 % var12;
				int var14 = arg6 + var12 - var13 - (-var10 + 1) % var12;
				int var15 = var14 % var12;
				if (var15 < 0) {
					var15 += var12;
				}
				this.method13230(arg0 + var10, arg1, -var10 + 1, arg4, arg5, arg6, arg7, var15);
			}
		} else if (var10 != 0) {
			int var20 = arg8 << 8;
			int var21 = arg6 << 8;
			int var22 = arg7 << 8;
			int var23 = var21 + var22;
			int var24 = var20 % var23;
			if (var10 + var11 < 0) {
				int var25 = (int) (Math.sqrt((double) (var10 * var10 + var11 * var11)) * 256.0D);
				int var26 = var25 % var23;
				int var27 = var21 + var23 - var24 - var26;
				var24 = var27 % var23;
				if (var24 < 0) {
					var24 += var23;
				}
				arg0 += var10;
				var10 = -var10;
				arg1 += var11;
				var11 = -var11;
			}
			if (var10 > var11) {
				int var28 = arg1 << 16;
				int var29 = var28 + 32768;
				int var30 = var11 << 16;
				int var31 = (int) Math.floor((double) var30 / (double) var10 + 0.5D);
				int var32 = arg0 + var10;
				int var33 = arg4 >>> 24;
				int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && var33 == 255) {
					while (arg0 <= var32) {
						int var49 = var29 >> 16;
						if (arg0 >= this.field8005 * 964411091 && arg0 < this.field8024 * 1625022069 && var49 >= this.field8027 * -573330681 && var49 < this.field8008 * -1468773707 && var24 < var21) {
							this.field8001[this.field8002 * 1322125985 * var49 + arg0] = arg4;
						}
						var29 += var31;
						arg0++;
						int var50 = var24 + var34;
						var24 = var50 % var23;
					}
				} else if (arg5 == 1) {
					int var35 = (var33 << 24) + ((arg4 & 0xFF00) * var33 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var33 >> 8 & 0xFF00FF);
					int var36 = 256 - var33;
					while (arg0 <= var32) {
						int var37 = var29 >> 16;
						if (arg0 >= this.field8005 * 964411091 && arg0 < this.field8024 * 1625022069 && var37 >= this.field8027 * -573330681 && var37 < this.field8008 * -1468773707 && var24 < var21) {
							int var38 = this.field8002 * 1322125985 * var37 + arg0;
							int var39 = this.field8001[var38];
							int var40 = ((var39 & 0xFF00) * var36 >> 8 & 0xFF00) + ((var39 & 0xFF00FF) * var36 >> 8 & 0xFF00FF);
							this.field8001[var38] = var35 + var40;
						}
						var29 += var31;
						arg0++;
						int var41 = var24 + var34;
						var24 = var41 % var23;
					}
				} else if (arg5 == 2) {
					while (arg0 <= var32) {
						int var42 = var29 >> 16;
						if (arg0 >= this.field8005 * 964411091 && arg0 < this.field8024 * 1625022069 && var42 >= this.field8027 * -573330681 && var42 < this.field8008 * -1468773707 && var24 < var21) {
							int var43 = this.field8002 * 1322125985 * var42 + arg0;
							int var44 = this.field8001[var43];
							int var45 = arg4 + var44;
							int var46 = (arg4 & 0xFF00FF) + (var44 & 0xFF00FF);
							int var47 = (var45 - var46 & 0x10000) + (var46 & 0x1000100);
							this.field8001[var43] = var45 - var47 | var47 - (var47 >>> 8);
						}
						var29 += var31;
						arg0++;
						int var48 = var24 + var34;
						var24 = var48 % var23;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				int var51 = arg0 << 16;
				int var52 = var51 + 32768;
				int var53 = var10 << 16;
				int var54 = (int) Math.floor((double) var53 / (double) var11 + 0.5D);
				int var55 = arg1 + var11;
				int var56 = arg4 >>> 24;
				int var57 = (int) Math.sqrt((double) ((var54 >> 8) * (var54 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && var56 == 255) {
					while (arg1 <= var55) {
						int var72 = var52 >> 16;
						if (arg1 >= this.field8027 * -573330681 && arg1 < this.field8008 * -1468773707 && var72 >= this.field8005 * 964411091 && var72 < this.field8024 * 1625022069 && var24 < var21) {
							this.field8001[this.field8002 * 1322125985 * arg1 + var72] = arg4;
						}
						var52 += var54;
						arg1++;
						int var73 = var24 + var57;
						var24 = var73 % var23;
					}
				} else if (arg5 == 1) {
					int var58 = (var56 << 24) + ((arg4 & 0xFF00) * var56 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var56 >> 8 & 0xFF00FF);
					int var59 = 256 - var56;
					while (arg1 <= var55) {
						int var60 = var52 >> 16;
						if (arg1 >= this.field8027 * -573330681 && arg1 < this.field8008 * -1468773707 && var60 >= this.field8005 * 964411091 && var60 < this.field8024 * 1625022069 && var24 < var21) {
							int var61 = this.field8002 * 1322125985 * arg1 + var60;
							int var62 = this.field8001[var61];
							int var63 = ((var62 & 0xFF00FF) * var59 >> 8 & 0xFF00FF) + ((var62 & 0xFF00) * var59 >> 8 & 0xFF00);
							this.field8001[this.field8002 * 1322125985 * arg1 + var60] = var58 + var63;
						}
						var52 += var54;
						arg1++;
						int var64 = var24 + var57;
						var24 = var64 % var23;
					}
				} else if (arg5 == 2) {
					while (arg1 <= var55) {
						int var65 = var52 >> 16;
						if (arg1 >= this.field8027 * -573330681 && arg1 < this.field8008 * -1468773707 && var65 >= this.field8005 * 964411091 && var65 < this.field8024 * 1625022069 && var24 < var21) {
							int var66 = this.field8002 * 1322125985 * arg1 + var65;
							int var67 = this.field8001[var66];
							int var68 = arg4 + var67;
							int var69 = (arg4 & 0xFF00FF) + (var67 & 0xFF00FF);
							int var70 = (var68 - var69 & 0x10000) + (var69 & 0x1000100);
							this.field8001[var66] = var68 - var70 | var70 - (var70 >>> 8);
						}
						var52 += var54;
						arg1++;
						int var71 = var24 + var57;
						var24 = var71 % var23;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (var11 >= 0) {
			this.method13193(arg0, arg1, var11 + 1, arg4, arg5, arg6, arg7, arg8);
		} else {
			int var16 = arg6 + arg7;
			int var17 = arg8 % var16;
			int var18 = arg6 + var16 - var17 - (-var11 + 1) % var16;
			int var19 = var18 % var16;
			if (var19 < 0) {
				var19 += var16;
			}
			this.method13193(arg0, arg1 + var11, -var11 + 1, arg4, arg5, arg6, arg7, var19);
		}
	}

	@ObfuscatedName("yt.bn(IIIIIILta;II)V")
	public void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8) {
		if (this.field8001 == null) {
			return;
		}
		class668 var10 = (class668) arg6;
		int[] var11 = var10.field7648;
		int[] var12 = var10.field7649;
		int var13 = this.field8027 * -573330681 > arg8 ? this.field8027 * -573330681 : arg8;
		int var14 = this.field8008 * -1468773707 < var11.length + arg8 ? this.field8008 * -1468773707 : var11.length + arg8;
		int var15 = arg2 - arg0;
		int var16 = arg3 - arg1;
		if (var15 + var16 < 0) {
			arg0 += var15;
			var15 = -var15;
			arg1 += var16;
			var16 = -var16;
		}
		if (var15 <= var16) {
			int var42 = arg0 << 16;
			int var43 = var42 + 32768;
			int var44 = var15 << 16;
			int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
			int var46 = arg1 + var16;
			if (arg1 < var13) {
				var43 += (var13 - arg1) * var45;
				arg1 = var13;
			}
			if (var46 >= var14) {
				var46 = var14 - 1;
			}
			int var47 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var47 == 255) {
				while (arg1 <= var46) {
					int var64 = var43 >> 16;
					int var65 = arg1 - arg8;
					int var66 = var11[var65] + arg7;
					if (var64 >= this.field8005 * 964411091 && var64 < this.field8024 * 1625022069 && var64 >= var66 && var64 < var12[var65] + var66) {
						this.field8001[this.field8002 * 1322125985 * arg1 + var64] = arg4;
					}
					var43 += var45;
					arg1++;
				}
			} else if (arg5 == 1) {
				int var48 = (var47 << 24) + ((arg4 & 0xFF00) * var47 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var47 >> 8 & 0xFF00FF);
				int var49 = 256 - var47;
				while (arg1 <= var46) {
					int var50 = var43 >> 16;
					int var51 = arg1 - arg8;
					int var52 = var11[var51] + arg7;
					if (var50 >= this.field8005 * 964411091 && var50 < this.field8024 * 1625022069 && var50 >= var52 && var50 < var12[var51] + var52) {
						int var53 = this.field8002 * 1322125985 * arg1 + var50;
						int var54 = this.field8001[var53];
						int var55 = ((var54 & 0xFF00) * var49 >> 8 & 0xFF00) + ((var54 & 0xFF00FF) * var49 >> 8 & 0xFF00FF);
						this.field8001[this.field8002 * 1322125985 * arg1 + var50] = var48 + var55;
					}
					var43 += var45;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= var46) {
					int var56 = var43 >> 16;
					int var57 = arg1 - arg8;
					int var58 = var11[var57] + arg7;
					if (var56 >= this.field8005 * 964411091 && var56 < this.field8024 * 1625022069 && var56 >= var58 && var56 < var12[var57] + var58) {
						int var59 = this.field8002 * 1322125985 * arg1 + var56;
						int var60 = this.field8001[var59];
						int var61 = arg4 + var60;
						int var62 = (arg4 & 0xFF00FF) + (var60 & 0xFF00FF);
						int var63 = (var61 - var62 & 0x10000) + (var62 & 0x1000100);
						this.field8001[var59] = var61 - var63 | var63 - (var63 >>> 8);
					}
					var43 += var45;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		int var17 = arg1 << 16;
		int var18 = var17 + 32768;
		int var19 = var16 << 16;
		int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
		int var21 = arg0 + var15;
		if (arg0 < this.field8005 * 964411091) {
			var18 += (this.field8005 * 964411091 - arg0) * var20;
			arg0 = this.field8005 * 964411091;
		}
		if (var21 >= this.field8024 * 1625022069) {
			var21 = this.field8024 * 1625022069 - 1;
		}
		int var22 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && var22 == 255) {
			while (arg0 <= var21) {
				int var39 = var18 >> 16;
				int var40 = var39 - arg8;
				if (var39 >= var13 && var39 < var14) {
					int var41 = var11[var40] + arg7;
					if (arg0 >= var41 && arg0 < var12[var40] + var41) {
						this.field8001[this.field8002 * 1322125985 * var39 + arg0] = arg4;
					}
				}
				var18 += var20;
				arg0++;
			}
		} else if (arg5 == 1) {
			int var23 = (var22 << 24) + ((arg4 & 0xFF00) * var22 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var22 >> 8 & 0xFF00FF);
			int var24 = 256 - var22;
			while (arg0 <= var21) {
				int var25 = var18 >> 16;
				int var26 = var25 - arg8;
				if (var25 >= var13 && var25 < var14) {
					int var27 = var11[var26] + arg7;
					if (arg0 >= var27 && arg0 < var12[var26] + var27) {
						int var28 = this.field8002 * 1322125985 * var25 + arg0;
						int var29 = this.field8001[var28];
						int var30 = ((var29 & 0xFF00FF) * var24 >> 8 & 0xFF00FF) + ((var29 & 0xFF00) * var24 >> 8 & 0xFF00);
						this.field8001[var28] = var23 + var30;
					}
				}
				var18 += var20;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= var21) {
				int var31 = var18 >> 16;
				int var32 = var31 - arg8;
				if (var31 >= var13 && var31 < var14) {
					int var33 = var11[var32] + arg7;
					if (arg0 >= var33 && arg0 < var12[var32] + var33) {
						int var34 = this.field8002 * 1322125985 * var31 + arg0;
						int var35 = this.field8001[var34];
						int var36 = arg4 + var35;
						int var37 = (arg4 & 0xFF00FF) + (var35 & 0xFF00FF);
						int var38 = (var36 - var37 & 0x10000) + (var37 & 0x1000100);
						this.field8001[var34] = var36 - var38 | var38 - (var38 >>> 8);
					}
				}
				var18 += var20;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.bc(IIIIIILta;IIIII)V")
	public void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (this.field8001 == null) {
			return;
		}
		class668 var13 = (class668) arg6;
		int[] var14 = var13.field7648;
		int[] var15 = var13.field7649;
		int var16 = this.field8027 * -573330681 > arg8 ? this.field8027 * -573330681 : arg8;
		int var17 = this.field8008 * -1468773707 < var14.length + arg8 ? this.field8008 * -1468773707 : var14.length + arg8;
		int var18 = arg11 << 8;
		int var19 = arg9 << 8;
		int var20 = arg10 << 8;
		int var21 = var19 + var20;
		int var22 = var18 % var21;
		int var23 = arg2 - arg0;
		int var24 = arg3 - arg1;
		if (var23 + var24 < 0) {
			int var25 = (int) (Math.sqrt((double) (var23 * var23 + var24 * var24)) * 256.0D);
			int var26 = var25 % var21;
			int var27 = var19 + var21 - var22 - var26;
			var22 = var27 % var21;
			if (var22 < 0) {
				var22 += var21;
			}
			arg0 += var23;
			var23 = -var23;
			arg1 += var24;
			var24 = -var24;
		}
		if (var23 <= var24) {
			int var57 = arg0 << 16;
			int var58 = var57 + 32768;
			int var59 = var23 << 16;
			int var60 = (int) Math.floor((double) var59 / (double) var24 + 0.5D);
			int var61 = (int) Math.sqrt((double) ((var60 >> 8) * (var60 >> 8) + 65536));
			int var62 = arg1 + var24;
			int var63 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && var63 == 255) {
				while (arg1 <= var62) {
					int var80 = var58 >> 16;
					int var81 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var80 >= this.field8005 * 964411091 && var80 < this.field8024 * 1625022069 && var22 < var19 && var80 >= var14[var81] + arg7 && var80 < var14[var81] + arg7 + var15[var81]) {
						this.field8001[this.field8002 * 1322125985 * arg1 + var80] = arg4;
					}
					var58 += var60;
					arg1++;
					int var82 = var22 + var61;
					var22 = var82 % var21;
				}
			} else if (arg5 == 1) {
				int var64 = (var63 << 24) + ((arg4 & 0xFF00) * var63 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * var63 >> 8 & 0xFF00FF);
				int var65 = 256 - var63;
				while (arg1 <= var62) {
					int var66 = var58 >> 16;
					int var67 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var66 >= this.field8005 * 964411091 && var66 < this.field8024 * 1625022069 && var22 < var19 && var66 >= var14[var67] + arg7 && var66 < var14[var67] + arg7 + var15[var67]) {
						int var68 = this.field8002 * 1322125985 * arg1 + var66;
						int var69 = this.field8001[var68];
						int var70 = ((var69 & 0xFF00) * var65 >> 8 & 0xFF00) + ((var69 & 0xFF00FF) * var65 >> 8 & 0xFF00FF);
						this.field8001[this.field8002 * 1322125985 * arg1 + var66] = var64 + var70;
					}
					var58 += var60;
					arg1++;
					int var71 = var22 + var61;
					var22 = var71 % var21;
				}
			} else if (arg5 == 2) {
				while (arg1 <= var62) {
					int var72 = var58 >> 16;
					int var73 = arg1 - arg8;
					if (arg1 >= var16 && arg1 < var17 && var72 >= this.field8005 * 964411091 && var72 < this.field8024 * 1625022069 && var22 < var19 && var72 >= var14[var73] + arg7 && var72 < var14[var73] + arg7 + var15[var73]) {
						int var74 = this.field8002 * 1322125985 * arg1 + var72;
						int var75 = this.field8001[var74];
						int var76 = arg4 + var75;
						int var77 = (arg4 & 0xFF00FF) + (var75 & 0xFF00FF);
						int var78 = (var76 - var77 & 0x10000) + (var77 & 0x1000100);
						this.field8001[var74] = var76 - var78 | var78 - (var78 >>> 8);
					}
					var58 += var60;
					arg1++;
					int var79 = var22 + var61;
					var22 = var79 % var21;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		int var28 = arg1 << 16;
		int var29 = var28 + 32768;
		int var30 = var24 << 16;
		int var31 = (int) Math.floor((double) var30 / (double) var23 + 0.5D);
		int var32 = arg0 + var23;
		int var33 = arg4 >>> 24;
		int var34 = (int) Math.sqrt((double) ((var31 >> 8) * (var31 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && var33 == 255) {
			while (arg0 <= var32) {
				int var53 = var29 >> 16;
				int var54 = var53 - arg8;
				if (arg0 >= this.field8005 * 964411091 && arg0 < this.field8024 * 1625022069 && var53 >= var16 && var53 < var17 && var22 < var19) {
					int var55 = var14[var54] + arg7;
					if (arg0 >= var55 && arg0 < var15[var54] + var55) {
						this.field8001[this.field8002 * 1322125985 * var53 + arg0] = arg4;
					}
				}
				var29 += var31;
				arg0++;
				int var56 = var22 + var34;
				var22 = var56 % var21;
			}
		} else if (arg5 == 1) {
			int var35 = (var33 << 24) + ((arg4 & 0xFF00FF) * var33 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * var33 >> 8 & 0xFF00);
			int var36 = 256 - var33;
			while (arg0 <= var32) {
				int var37 = var29 >> 16;
				int var38 = var37 - arg8;
				if (arg0 >= this.field8005 * 964411091 && arg0 < this.field8024 * 1625022069 && var37 >= var16 && var37 < var17 && var22 < var19) {
					int var39 = var14[var38] + arg7;
					if (arg0 >= var39 && arg0 < var15[var38] + var39) {
						int var40 = this.field8002 * 1322125985 * var37 + arg0;
						int var41 = this.field8001[var40];
						int var42 = ((var41 & 0xFF00FF) * var36 >> 8 & 0xFF00FF) + ((var41 & 0xFF00) * var36 >> 8 & 0xFF00);
						this.field8001[var40] = var35 + var42;
					}
				}
				var29 += var31;
				arg0++;
				int var43 = var22 + var34;
				var22 = var43 % var21;
			}
		} else if (arg5 == 2) {
			while (arg0 <= var32) {
				int var44 = var29 >> 16;
				int var45 = var44 - arg8;
				if (arg0 >= this.field8005 * 964411091 && arg0 < this.field8024 * 1625022069 && var44 >= var16 && var44 < var17 && var22 < var19) {
					int var46 = var14[var45] + arg7;
					if (arg0 >= var46 && arg0 < var15[var45] + var46) {
						int var47 = this.field8002 * 1322125985 * var44 + arg0;
						int var48 = this.field8001[var47];
						int var49 = arg4 + var48;
						int var50 = (arg4 & 0xFF00FF) + (var48 & 0xFF00FF);
						int var51 = (var49 - var50 & 0x10000) + (var50 & 0x1000100);
						this.field8001[var47] = var49 - var51 | var51 - (var51 >>> 8);
					}
				}
				var29 += var31;
				arg0++;
				int var52 = var22 + var34;
				var22 = var52 % var21;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.br(IIIIIII)V")
	public void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (this.field8001 == null) {
			return;
		}
		class66 var8 = this.method13206(Thread.currentThread());
		class77 var9 = var8.field868;
		int var10 = arg2 - arg0;
		int var11 = arg3 - arg1;
		int var12 = var10 >= 0 ? var10 : -var10;
		int var13 = var11 >= 0 ? var11 : -var11;
		int var14 = var12;
		if (var12 < var13) {
			var14 = var13;
		}
		if (var14 == 0) {
			return;
		}
		int var15 = (var10 << 16) / var14;
		int var16 = (var11 << 16) / var14;
		int var17 = (var15 >> 16) + var10;
		int var18 = (var16 >> 16) + var11;
		if (var16 <= var15) {
			var15 = -var15;
		} else {
			var16 = -var16;
		}
		int var19 = arg5 * var16 >> 17;
		int var20 = arg5 * var16 + 1 >> 17;
		int var21 = arg5 * var15 >> 17;
		int var22 = arg5 * var15 + 1 >> 17;
		int var23 = arg0 - var9.method1985();
		int var24 = arg1 - var9.method2002();
		int var25 = var19 + var23;
		int var26 = var23 - var20;
		int var27 = var17 + var23 - var20;
		int var28 = var17 + var23 + var19;
		int var29 = var21 + var24;
		int var30 = var24 - var22;
		int var31 = var18 + var24 - var22;
		int var32 = var18 + var24 + var21;
		if (arg6 == 0) {
			var9.field987 = 0;
		} else if (arg6 == 1) {
			var9.field987 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method526(false);
		var9.field988 = var25 < 0 || var25 > var9.field1010 || var26 < 0 || var26 > var9.field1010 || var27 < 0 || var27 > var9.field1010;
		var9.method1991(true, false, false, (float) var29, (float) var30, (float) var31, (float) var25, (float) var26, (float) var27, 100.0F, 100.0F, 100.0F, arg4);
		var9.field988 = var25 < 0 || var25 > var9.field1010 || var27 < 0 || var27 > var9.field1010 || var28 < 0 || var28 > var9.field1010;
		var9.method1991(true, false, false, (float) var29, (float) var31, (float) var32, (float) var25, (float) var27, (float) var28, 100.0F, 100.0F, 100.0F, arg4);
		this.method526(true);
	}

	@ObfuscatedName("yt.bp(IIIIII)I")
	public int method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 0;
		float var8 = this.field8018.field3480[10] * (float) arg2 + this.field8018.field3480[6] * (float) arg1 + this.field8018.field3480[2] * (float) arg0 + this.field8018.field3480[14];
		float var9 = this.field8018.field3480[10] * (float) arg5 + this.field8018.field3480[6] * (float) arg4 + this.field8018.field3480[2] * (float) arg3 + this.field8018.field3480[14];
		float var10 = this.field8018.field3480[11] * (float) arg2 + this.field8018.field3480[7] * (float) arg1 + this.field8018.field3480[3] * (float) arg0 + this.field8018.field3480[15];
		float var11 = this.field8018.field3480[11] * (float) arg5 + this.field8018.field3480[7] * (float) arg4 + this.field8018.field3480[3] * (float) arg3 + this.field8018.field3480[15];
		if (var8 < -var10 && var9 < -var11) {
			var7 |= 0x10;
		} else if (var8 > var10 && var9 > var11) {
			var7 |= 0x20;
		}
		float var12 = this.field8018.field3480[8] * (float) arg2 + this.field8018.field3480[4] * (float) arg1 + this.field8018.field3480[0] * (float) arg0 + this.field8018.field3480[12];
		float var13 = this.field8018.field3480[8] * (float) arg5 + this.field8018.field3480[4] * (float) arg4 + this.field8018.field3480[0] * (float) arg3 + this.field8018.field3480[12];
		if (var12 < -var10 && var13 < -var11) {
			var7 |= 0x1;
		}
		if (var12 > var10 && var13 > var11) {
			var7 |= 0x2;
		}
		float var14 = this.field8018.field3480[9] * (float) arg2 + this.field8018.field3480[5] * (float) arg1 + this.field8018.field3480[1] * (float) arg0 + this.field8018.field3480[13];
		float var15 = this.field8018.field3480[9] * (float) arg5 + this.field8018.field3480[5] * (float) arg4 + this.field8018.field3480[1] * (float) arg3 + this.field8018.field3480[13];
		if (var14 < -var10 && var15 < -var11) {
			var7 |= 0x4;
		}
		if (var14 > var10 && var15 > var11) {
			var7 |= 0x8;
		}
		return var7;
	}

	@ObfuscatedName("yt.bi(I)Lv;")
	public class28 method593(int arg0) {
		return null;
	}

	@ObfuscatedName("yt.bx(Lv;)V")
	public void method502(class28 arg0) {
	}

	@ObfuscatedName("yt.bb(IIZZ)Lce;")
	public class118 method658(int arg0, int arg1, boolean arg2, boolean arg3) {
		return arg2 ? new class887(this, arg0, arg1) : new class886(this, arg0, arg1);
	}

	@ObfuscatedName("yt.be([IIIIIZ)Lce;")
	public class118 method513(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		boolean var7 = false;
		int var8 = arg1;
		for (int var9 = 0; var9 < arg4; var9++) {
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = arg0[var8++] >>> 24;
				if (var11 != 0 && var11 != 255) {
					var7 = true;
					return var7 ? new class887(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class886(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return var7 ? new class887(this, arg0, arg1, arg2, arg3, arg4, arg5) : new class886(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("yt.bo(Lds;Z)Lce;")
	public class118 method517(class140 arg0, boolean arg1) {
		int var3 = arg0.method2721();
		int var4 = arg0.method2763();
		class665 var12;
		if (arg1 && !arg0.method2720() && arg0.method2749()) {
			class685 var5 = (class685) arg0;
			int[] var6 = new int[var5.field8410.length];
			byte[] var7 = new byte[var3 * var4];
			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = var3 * var8;
				for (int var10 = 0; var10 < var3; var10++) {
					var7[var9 + var10] = var5.field8408[var9 + var10];
				}
			}
			for (int var11 = 0; var11 < var5.field8410.length; var11++) {
				var6[var11] = var5.field8410[var11];
			}
			var12 = new class888(this, var7, var6, var3, var4);
		} else {
			int[] var13 = arg0.method2735(false);
			if (arg0.method2720()) {
				var12 = new class887(this, var13, var3, var4);
			} else {
				var12 = new class886(this, var13, var3, var4);
			}
		}
		var12.method1036(arg0.method2722(), arg0.method2724(), arg0.method2732(), arg0.method2734());
		return var12;
	}

	@ObfuscatedName("yt.bh(IIIIZ)Lce;")
	public class118 method508(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		if (this.field8001 == null) {
			throw new IllegalStateException("");
		}
		int[] var6 = new int[arg2 * arg3];
		int var7 = this.field8002 * 1322125985 * arg1 + arg0;
		int var8 = this.field8002 * 1322125985 - arg2;
		for (int var9 = 0; var9 < arg3; var9++) {
			int var10 = arg2 * var9;
			for (int var11 = 0; var11 < arg2; var11++) {
				var6[var10 + var11] = this.field8001[var7++];
			}
			var7 += var8;
		}
		if (arg4) {
			return new class887(this, var6, arg2, arg3);
		} else {
			return new class886(this, var6, arg2, arg3);
		}
	}

	@ObfuscatedName("yt.cq(II[I[I)Lta;")
	public class11 method571(int arg0, int arg1, int[] arg2, int[] arg3) {
		return new class668(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("yt.DA(ILta;II)V")
	public void method684(int arg0, class11 arg1, int arg2, int arg3) {
		if (this.field8001 == null) {
			return;
		}
		class668 var5 = (class668) arg1;
		int[] var6 = var5.field7648;
		int[] var7 = var5.field7649;
		int var8;
		if (this.field8008 * -1468773707 < var6.length + arg3) {
			var8 = this.field8008 * -1468773707 - arg3;
		} else {
			var8 = var6.length;
		}
		int var9;
		if (this.field8027 * -573330681 > arg3) {
			var9 = this.field8027 * -573330681 - arg3;
			arg3 = this.field8027 * -573330681;
		} else {
			var9 = 0;
		}
		if (var8 - var9 <= 0) {
			return;
		}
		int var10 = this.field8002 * 1322125985 * arg3;
		for (int var11 = var9; var11 < var8; var11++) {
			int var12 = var6[var11] + arg2;
			int var13 = var7[var11];
			if (this.field8005 * 964411091 > var12) {
				var13 -= this.field8005 * 964411091 - var12;
				var12 = this.field8005 * 964411091;
			}
			if (this.field8024 * 1625022069 < var12 + var13) {
				var13 = this.field8024 * 1625022069 - var12;
			}
			int var14 = var10 + var12;
			for (int var15 = -var13; var15 < 0; var15++) {
				this.field8001[var14++] = arg0;
			}
			var10 += this.field8002 * 1322125985;
		}
	}

	@ObfuscatedName("yt.co(Lvm;[Lzv;Z)Ll;")
	public class15 method712(class603 arg0, class685[] arg1, boolean arg2) {
		int[] var4 = new int[arg1.length];
		int[] var5 = new int[arg1.length];
		boolean var6 = false;
		for (int var7 = 0; var7 < arg1.length; var7++) {
			var4[var7] = arg1[var7].method2721();
			var5[var7] = arg1[var7].method2763();
			if (arg1[var7].method2720()) {
				var6 = true;
			}
		}
		if (arg2) {
			if (var6) {
				return new class686(this, arg0, arg1, var4, var5);
			} else {
				return new class688(this, arg0, arg1, var4, var5);
			}
		} else if (var6) {
			throw new IllegalArgumentException("");
		} else {
			return new class687(this, arg0, arg1, var4, var5);
		}
	}

	@ObfuscatedName("yt.cw(I)V")
	public void method673(int arg0) {
		class676.field7823 = arg0;
		class676.field7832 = arg0;
		if (this.field8030 * -1969773887 > 1) {
			throw new IllegalStateException();
		}
		this.method13205(this.field8030 * -1969773887);
		this.method13204(0);
	}

	@ObfuscatedName("yt.cx(Ldw;IIII)Lqa;")
	public class13 method625(class129 arg0, int arg1, int arg2, int arg3, int arg4) {
		return new class676(this, arg0, arg1, arg3, arg4, arg2);
	}

	@ObfuscatedName("yt.cn(II)I")
	public int method519(int arg0, int arg1) {
		int var3 = arg0 | 0x20800;
		return var3 & arg1 ^ arg1;
	}

	@ObfuscatedName("yt.cf(II)I")
	public int method520(int arg0, int arg1) {
		return arg0 | arg1;
	}

	@ObfuscatedName("yt.cs(II[[I[[IIII)Lxa;")
	public class12 method521(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		return new class671(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("yt.cb()Lka;")
	public class320 method781() {
		class66 var1 = this.method13206(Thread.currentThread());
		return var1.field875;
	}

	@ObfuscatedName("yt.cm()Lkc;")
	public class314 method516() {
		class66 var1 = this.method13206(Thread.currentThread());
		return var1.field877;
	}

	@ObfuscatedName("yt.ck()I")
	public int method768() {
		return 0;
	}

	@ObfuscatedName("yt.cd(IIIIIF)Lacg;")
	public class780 method534(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		return null;
	}

	@ObfuscatedName("yt.ce(I[Lacg;)V")
	public void method535(int arg0, class780[] arg1) {
	}

	@ObfuscatedName("yt.oq(I)V")
	public void method13204(int arg0) {
		this.field8031[arg0].method1949(Thread.currentThread());
	}

	@ObfuscatedName("yt.ob(I)V")
	public void method13205(int arg0) {
		this.field8030 = arg0 * 965995841;
		this.field8031 = new class66[this.field8030 * -1969773887];
		for (int var2 = 0; var2 < this.field8030 * -1969773887; var2++) {
			this.field8031[var2] = new class66(this);
		}
	}

	@ObfuscatedName("yt.ox(Ljava/lang/Runnable;)Lak;")
	public class66 method13206(Runnable arg0) {
		for (int var2 = 0; var2 < this.field8030 * -1969773887; var2++) {
			if (this.field8031[var2].field897 == arg0) {
				return this.field8031[var2];
			}
		}
		return null;
	}

	@ObfuscatedName("yt.cp(Ldp;)V")
	public void method733(class128 arg0) {
		this.method13207(this.field8001 != null, this.field8023 != null, false, arg0);
	}

	@ObfuscatedName("yt.oe(ZZZLdp;)V")
	public void method13207(boolean arg0, boolean arg1, boolean arg2, class128 arg3) {
		class66 var5 = this.method13206(Thread.currentThread());
		for (class914 var6 = (class914) arg3.field1311.method11670(); var6 != null; var6 = (class914) arg3.field1311.method11671()) {
			int var7 = var6.field10145 >> 12;
			int var8 = var6.field10146 >> 12;
			int var9 = var6.field10147 >> 12;
			float var10 = this.field8018.field3480[10] * (float) var9 + this.field8018.field3480[2] * (float) var7 + this.field8018.field3480[6] * (float) var8 + this.field8018.field3480[14];
			float var11 = this.field8018.field3480[11] * (float) var9 + this.field8018.field3480[3] * (float) var7 + this.field8018.field3480[7] * (float) var8 + this.field8018.field3480[15];
			if (!(var10 < -var11)) {
				float var12 = this.field8028 * var10 / var11 + this.field8006;
				if (!(var10 > var5.field867)) {
					float var13 = this.field8018.field3480[8] * (float) var9 + this.field8018.field3480[4] * (float) var8 + this.field8018.field3480[0] * (float) var7 + this.field8018.field3480[12];
					float var14 = this.field8018.field3480[9] * (float) var9 + this.field8018.field3480[1] * (float) var7 + this.field8018.field3480[5] * (float) var8 + this.field8018.field3480[13];
					if (!(var13 < -var11) && !(var13 > var11) && !(var14 < -var11) && !(var14 > var11)) {
						float var15 = (float) var6.field10148 / 4096.0F;
						float var16 = this.field8017.field3480[0] * var15 + var13;
						float var17 = this.field8017.field3480[3] * var15 + var11;
						float var18 = this.field8011 * var13 / var11 + this.field8007;
						float var19 = this.field8026 * var14 / var11 + this.field8010;
						float var20 = this.field8011 * var16 / var17 + this.field8007;
						this.method13208(arg0, arg1, arg2, var6, (int) var18, (int) var19, var12, (int) (var20 < var18 ? var18 - var20 : var20 - var18));
					}
				}
			}
		}
	}

	@ObfuscatedName("yt.ow(ZZZLahl;IIFI)V")
	public void method13208(boolean arg0, boolean arg1, boolean arg2, class914 arg3, int arg4, int arg5, float arg6, int arg7) {
		int var9 = arg3.field10149;
		int var11 = arg7 << 1;
		if (var9 == -1) {
			this.method13210(arg1, arg4, arg5, arg6, arg7, arg3.field10144, 1);
			return;
		}
		if (this.field8035 * -2023874813 != var9) {
			class118 var12 = (class118) this.field8033.method7916((long) var9);
			if (var12 == null) {
				int[] var13 = this.method13241(var9);
				if (var13 == null) {
					return;
				}
				int var14 = this.field400.method889(var9).field1252 * 424629663;
				var12 = this.method506(var13, 0, var14, var14, var14);
				this.field8033.method7937(var12, (long) var9);
			}
			this.field8035 = var9 * 1389806507;
			this.field8034 = var12;
		}
		var11++;
		((class665) this.field8034).method12923(arg0, arg1, arg2, arg4 - arg7, arg5 - arg7, arg6, var11, var11, 0, arg3.field10144, 1, 1, false);
	}

	@ObfuscatedName("yt.oi(ZZZIIFIIIIII)V")
	public void method13209(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != 65535) {
			class120 var13 = this.field400.method889(arg8);
			if (!var13.field1250) {
				if (this.field8035 * -2023874813 != arg8) {
					class118 var14 = (class118) this.field8033.method7916((long) arg8);
					if (var14 == null) {
						int[] var15 = this.method13241(arg8);
						if (var15 == null) {
							return;
						}
						int var16 = this.field400.method889(arg8).field1252 * 424629663;
						var14 = this.method506(var15, 0, var16, var16, var16);
						this.field8033.method7937(var14, (long) arg8);
					}
					this.field8035 = arg8 * 1389806507;
					this.field8034 = var14;
				}
				((class665) this.field8034).method12923(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, 1, class456.field4853 != var13.field1262);
				return;
			}
		}
		this.method13210(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@ObfuscatedName("yt.ot(ZIIFIII)V")
	public void method13210(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6) {
		if (this.field8001 == null) {
			return;
		}
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		int var8 = arg2 - arg4;
		if (var8 < this.field8027 * -573330681) {
			var8 = this.field8027 * -573330681;
		}
		int var9 = arg2 + arg4 + 1;
		if (var9 > this.field8008 * -1468773707) {
			var9 = this.field8008 * -1468773707;
		}
		int var10 = var8;
		int var11 = arg4 * arg4;
		int var12 = 0;
		int var13 = arg2 - var8;
		int var14 = var13 * var13;
		int var15 = var14 - var13;
		if (arg2 > var9) {
			arg2 = var9;
		}
		int var16 = arg5 >>> 24;
		if (arg6 == 0 || arg6 == 1 && var16 == 255) {
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				int var57 = arg1 - var12 + 1;
				if (var57 < this.field8005 * 964411091) {
					var57 = this.field8005 * 964411091;
				}
				int var58 = arg1 + var12;
				if (var58 > this.field8024 * 1625022069) {
					var58 = this.field8024 * 1625022069;
				}
				int var59 = this.field8002 * 1322125985 * var10 + var57;
				for (int var60 = var57; var60 < var58; var60++) {
					if (!arg0 || arg3 < this.field8023[var59]) {
						this.field8001[var59] = arg5;
					}
					var59++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			int var61 = arg4;
			int var62 = var10 - arg2;
			int var63 = var62 * var62 + var11;
			int var64 = var63 - arg4;
			int var65 = var63 - var62;
			while (var10 < var9) {
				while (var65 > var11 && var64 > var11) {
					var65 -= var61-- + var61;
					var64 -= var61 + var61;
				}
				int var66 = arg1 - var61;
				if (var66 < this.field8005 * 964411091) {
					var66 = this.field8005 * 964411091;
				}
				int var67 = arg1 + var61;
				if (var67 > this.field8024 * 1625022069 - 1) {
					var67 = this.field8024 * 1625022069 - 1;
				}
				int var68 = this.field8002 * 1322125985 * var10 + var66;
				for (int var69 = var66; var69 <= var67; var69++) {
					if (!arg0 || arg3 < this.field8023[var68]) {
						this.field8001[var68] = arg5;
					}
					var68++;
				}
				var10++;
				var65 += var62 + var62;
				var64 += var62++ + var62;
			}
			return;
		} else if (arg6 == 1) {
			int var17 = (var16 << 24) + ((arg5 & 0xFF00) * var16 >> 8 & 0xFF00) + ((arg5 & 0xFF00FF) * var16 >> 8 & 0xFF00FF);
			int var18 = 256 - var16;
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				int var19 = arg1 - var12 + 1;
				if (var19 < this.field8005 * 964411091) {
					var19 = this.field8005 * 964411091;
				}
				int var20 = arg1 + var12;
				if (var20 > this.field8024 * 1625022069) {
					var20 = this.field8024 * 1625022069;
				}
				int var21 = this.field8002 * 1322125985 * var10 + var19;
				for (int var22 = var19; var22 < var20; var22++) {
					if (!arg0 || arg3 < this.field8023[var21]) {
						int var23 = this.field8001[var21];
						int var24 = ((var23 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((var23 & 0xFF00) * var18 >> 8 & 0xFF00);
						this.field8001[var21] = var17 + var24;
					}
					var21++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			int var25 = arg4;
			int var26 = -var13;
			int var27 = var26 * var26 + var11;
			int var28 = var27 - arg4;
			int var29 = var27 - var26;
			while (var10 < var9) {
				while (var29 > var11 && var28 > var11) {
					var29 -= var25-- + var25;
					var28 -= var25 + var25;
				}
				int var30 = arg1 - var25;
				if (var30 < this.field8005 * 964411091) {
					var30 = this.field8005 * 964411091;
				}
				int var31 = arg1 + var25;
				if (var31 > this.field8024 * 1625022069 - 1) {
					var31 = this.field8024 * 1625022069 - 1;
				}
				int var32 = this.field8002 * 1322125985 * var10 + var30;
				for (int var33 = var30; var33 <= var31; var33++) {
					if (!arg0 || arg3 < this.field8023[var32]) {
						int var34 = this.field8001[var32];
						int var35 = ((var34 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var34 & 0xFF00FF) * var18 >> 8 & 0xFF00FF);
						this.field8001[var32] = var17 + var35;
					}
					var32++;
				}
				var10++;
				var29 += var26 + var26;
				var28 += var26++ + var26;
			}
		} else if (arg6 == 2) {
			while (var10 < arg2) {
				while (var15 <= var11 || var14 <= var11) {
					var14 += var12 + var12;
					var15 += var12++ + var12;
				}
				int var36 = arg1 - var12 + 1;
				if (var36 < this.field8005 * 964411091) {
					var36 = this.field8005 * 964411091;
				}
				int var37 = arg1 + var12;
				if (var37 > this.field8024 * 1625022069) {
					var37 = this.field8024 * 1625022069;
				}
				int var38 = this.field8002 * 1322125985 * var10 + var36;
				for (int var39 = var36; var39 < var37; var39++) {
					if (!arg0 || arg3 < this.field8023[var38]) {
						int var40 = this.field8001[var38];
						int var41 = arg5 + var40;
						int var42 = (arg5 & 0xFF00FF) + (var40 & 0xFF00FF);
						int var43 = (var41 - var42 & 0x10000) + (var42 & 0x1000100);
						this.field8001[var38] = var41 - var43 | var43 - (var43 >>> 8);
					}
					var38++;
				}
				var10++;
				var14 -= var13-- + var13;
				var15 -= var13 + var13;
			}
			int var44 = arg4;
			int var45 = -var13;
			int var46 = var45 * var45 + var11;
			int var47 = var46 - arg4;
			int var48 = var46 - var45;
			while (var10 < var9) {
				while (var48 > var11 && var47 > var11) {
					var48 -= var44-- + var44;
					var47 -= var44 + var44;
				}
				int var49 = arg1 - var44;
				if (var49 < this.field8005 * 964411091) {
					var49 = this.field8005 * 964411091;
				}
				int var50 = arg1 + var44;
				if (var50 > this.field8024 * 1625022069 - 1) {
					var50 = this.field8024 * 1625022069 - 1;
				}
				int var51 = this.field8002 * 1322125985 * var10 + var49;
				for (int var52 = var49; var52 <= var50; var52++) {
					if (!arg0 || arg3 < this.field8023[var51]) {
						int var53 = this.field8001[var51];
						int var54 = arg5 + var53;
						int var55 = (arg5 & 0xFF00FF) + (var53 & 0xFF00FF);
						int var56 = (var54 - var55 & 0x10000) + (var55 & 0x1000100);
						this.field8001[var51] = var54 - var56 | var56 - (var56 >>> 8);
					}
					var51++;
				}
				var10++;
				var48 += var45 + var45;
				var47 += var45++ + var45;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("yt.ci(Lkc;)V")
	public void method524(class314 arg0) {
		this.field8029 = arg0;
		this.method13211();
	}

	@ObfuscatedName("yt.ca()Lkc;")
	public class314 method525() {
		return new class314(this.field8029);
	}

	@ObfuscatedName("yt.ch(Lka;)V")
	public void method784(class320 arg0) {
		this.field8017.method5412(arg0);
		this.method13211();
	}

	@ObfuscatedName("yt.cv()Lka;")
	public class320 method528() {
		return new class320(this.field8017);
	}

	@ObfuscatedName("yt.IA(F)V")
	public void method529(float arg0) {
		this.field8012 = (int) (arg0 * 65535.0F) * 1408316771;
	}

	@ObfuscatedName("yt.m(IFFFFF)V")
	public void method530(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
		this.field7998 = (int) (arg1 * 65535.0F) * -1027429457;
		this.field8013 = (int) (arg2 * 65535.0F) * -629584145;
		float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
		this.field8021 = (int) (arg3 * 65535.0F / var7) * 749697617;
		this.field8009 = (int) (arg4 * 65535.0F / var7) * -561653499;
		this.field8014 = (int) (arg5 * 65535.0F / var7) * 324006949;
	}

	@ObfuscatedName("yt.J(I)V")
	public void method531(int arg0) {
	}

	@ObfuscatedName("yt.c(III)V")
	public void method532(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field8031.length; var4++) {
			class66 var5 = this.field8031[var4];
			var5.field869 = (arg0 & 0xFFFFFF) * 8600539;
			int var6 = var5.field869 * 658131027 >>> 16 & 0xFF;
			if (var6 < 2) {
				var6 = 2;
			}
			int var7 = var5.field869 * 658131027 >> 8 & 0xFF;
			if (var7 < 2) {
				var7 = 2;
			}
			int var8 = var5.field869 * 658131027 & 0xFF;
			if (var8 < 2) {
				var8 = 2;
			}
			var5.field869 = (var6 << 16 | var7 << 8 | var8) * 8600539;
			if (arg1 < 0) {
				var5.field866 = false;
			} else {
				var5.field866 = true;
			}
		}
	}

	@ObfuscatedName("yt.oc()V")
	public void method13211() {
		this.field8016.method5385(this.field8029);
		this.field8018.method5412(this.field8016);
		this.field8018.method5384(this.field8017);
		this.field8018.method5405(this.field8019[0]);
		this.field8018.method5460(this.field8019[1]);
		this.field8018.method5401(this.field8019[2]);
		this.field8018.method5434(this.field8019[3]);
		this.field8018.method5403(this.field8019[4]);
		this.field8018.method5459(this.field8019[5]);
		float var1 = this.field8017.method5400();
		float var2 = (var1 - 255.0F) * this.field8017.field3480[10] + this.field8017.field3480[14];
		float var3 = this.field8017.field3480[10] * var1 + this.field8017.field3480[14];
		float var4 = var3 - var2;
		for (int var5 = 0; var5 < this.field8030 * -1969773887; var5++) {
			class66 var6 = this.field8031[var5];
			var6.field867 = var2;
			var6.field864 = var4;
		}
	}

	@ObfuscatedName("yt.ct(IIIIII)Ldj;")
	public class127 method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return null;
	}

	@ObfuscatedName("yt.cu(Ldj;Ldj;FLdj;)Ldj;")
	public class127 method537(class127 arg0, class127 arg1, float arg2, class127 arg3) {
		return null;
	}

	@ObfuscatedName("yt.cc(Ldj;)V")
	public void method549(class127 arg0) {
	}

	@ObfuscatedName("yt.cg()Z")
	public boolean method539() {
		return false;
	}

	@ObfuscatedName("yt.cj()V")
	public void method558() {
	}

	@ObfuscatedName("yt.cy()Z")
	public boolean method600() {
		return false;
	}

	@ObfuscatedName("yt.dl(FFFFFF)V")
	public void method543(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
	}

	@ObfuscatedName("yt.dj(IIII)V")
	public void method514(int arg0, int arg1, int arg2, int arg3) {
	}

	@ObfuscatedName("yt.dp()V")
	public void method545() {
	}

	@ObfuscatedName("yt.dw(ILdk;)V")
	public void method503(int arg0, class137 arg1) {
		for (int var3 = 0; var3 < this.field8031.length; var3++) {
			this.field8031[var3].field870 = this.field8031[var3].field869 * 1465810141;
			this.field8031[var3].field872 = arg0 * -731450523;
			this.field8031[var3].field869 = arg1.field1475 * 730346649;
			this.field8031[var3].field873 = arg1.field1471 * -184445827;
			this.field8031[var3].field871 = true;
		}
	}

	@ObfuscatedName("yt.di(ILdk;)V")
	public void method547(int arg0, class137 arg1) {
		class66 var3 = this.method13206(Thread.currentThread());
		var3.field872 = arg0 * -731450523;
		var3.field869 = arg1.field1475 * 730346649;
		var3.field873 = arg1.field1471 * -184445827;
	}

	@ObfuscatedName("yt.O()V")
	public void method548() {
		for (int var1 = 0; var1 < this.field8031.length; var1++) {
			this.field8031[var1].field869 = this.field8031[var1].field870 * -1718469771;
			this.field8031[var1].field871 = false;
		}
	}

	@ObfuscatedName("yt.bk(IIFIIFIIFIIII)V")
	public void method491(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
		boolean var14 = this.field8001 != null;
		boolean var15 = this.field8023 != null;
		if (!var14 && !var15) {
			return;
		}
		class66 var16 = this.method13206(Thread.currentThread());
		class77 var17 = var16.field868;
		var17.field1006 = false;
		int var18 = arg0 - this.field8005 * 964411091;
		int var19 = arg3 - this.field8005 * 964411091;
		int var20 = arg6 - this.field8005 * 964411091;
		int var21 = arg1 - this.field8027 * -573330681;
		int var22 = arg4 - this.field8027 * -573330681;
		int var23 = arg7 - this.field8027 * -573330681;
		var17.field988 = var18 < 0 || var18 > var17.field1010 || var19 < 0 || var19 > var17.field1010 || var20 < 0 || var20 > var17.field1010;
		int var24 = arg9 >>> 24;
		if (arg12 == 0 || arg12 == 1 && var24 == 255) {
			var17.field987 = 0;
			var17.field986 = false;
			var17.method1989(var14, var15, false, (float) var21, (float) var22, (float) var23, (float) var18, (float) var19, (float) var20, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 1) {
			var17.field987 = 255 - var24;
			var17.field986 = false;
			var17.method1989(var14, var15, false, (float) var21, (float) var22, (float) var23, (float) var18, (float) var19, (float) var20, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 2) {
			var17.field987 = 128;
			var17.field986 = true;
			var17.method1989(var14, var15, false, (float) var21, (float) var22, (float) var23, (float) var18, (float) var19, (float) var20, arg2, arg5, arg8, arg9, arg10, arg11);
		} else {
			throw new IllegalArgumentException();
		}
		var17.field1006 = true;
	}

	@ObfuscatedName("yt.do(FFF[F)V")
	public void method550(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field8018.field3480[11] * arg2 + this.field8018.field3480[7] * arg1 + this.field8018.field3480[3] * arg0 + this.field8018.field3480[15];
		float var6 = this.field8018.field3480[8] * arg2 + this.field8018.field3480[4] * arg1 + this.field8018.field3480[0] * arg0 + this.field8018.field3480[12];
		float var7 = this.field8018.field3480[9] * arg2 + this.field8018.field3480[5] * arg1 + this.field8018.field3480[1] * arg0 + this.field8018.field3480[13];
		float var8 = this.field8016.field3480[10] * arg2 + this.field8016.field3480[6] * arg1 + this.field8016.field3480[2] * arg0 + this.field8016.field3480[14];
		arg3[0] = this.field8011 * var6 / var5 + this.field8007;
		arg3[1] = this.field8026 * var7 / var5 + this.field8010;
		arg3[2] = var8;
	}

	@ObfuscatedName("yt.dg(FFF[F)V")
	public void method567(float arg0, float arg1, float arg2, float[] arg3) {
		float var5 = this.field8018.field3480[10] * arg2 + this.field8018.field3480[6] * arg1 + this.field8018.field3480[2] * arg0 + this.field8018.field3480[14];
		float var6 = this.field8018.field3480[11] * arg2 + this.field8018.field3480[7] * arg1 + this.field8018.field3480[3] * arg0 + this.field8018.field3480[15];
		if (var5 < -var6 || var5 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var7 = this.field8018.field3480[8] * arg2 + this.field8018.field3480[4] * arg1 + this.field8018.field3480[0] * arg0 + this.field8018.field3480[12];
		if (var7 < -var6 || var7 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		float var8 = this.field8018.field3480[9] * arg2 + this.field8018.field3480[5] * arg1 + this.field8018.field3480[1] * arg0 + this.field8018.field3480[13];
		if (var8 < -var6 || var8 > var6) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			float var9 = this.field8016.field3480[10] * arg2 + this.field8016.field3480[6] * arg1 + this.field8016.field3480[2] * arg0 + this.field8016.field3480[14];
			arg3[0] = this.field8011 * var7 / var6 + this.field8007;
			arg3[1] = this.field8026 * var8 / var6 + this.field8010;
			arg3[2] = var9;
		}
	}

	@ObfuscatedName("yt.av()Lyu;")
	public class674 method467() {
		return new class889(this);
	}

	@ObfuscatedName("yt.oy(II)Lde;")
	public class136 method13212(int arg0, int arg1) {
		return new class71(arg0, arg1);
	}

	@ObfuscatedName("yt.aj(IILcy;Ldz;I)Lde;")
	public class136 method468(int arg0, int arg1, class124 arg2, class139 arg3, int arg4) {
		return this.method13212(arg0, arg1);
	}

	@ObfuscatedName("yt.ah(II)Ldo;")
	public class132 method637(int arg0, int arg1) {
		return new class78(arg0, arg1);
	}

	@ObfuscatedName("yt.au(III)Ldo;")
	public class132 method541(int arg0, int arg1, int arg2) {
		return new class78(arg0, arg1);
	}
}
