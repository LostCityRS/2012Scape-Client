package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.util.Arrays;

@ObfuscatedName("vn")
public class class592 implements class464 {

	@ObfuscatedName("vn.m")
	public static short[] field7118 = new short[256];

	@ObfuscatedName("vn.t")
	public class594 field7061;

	@ObfuscatedName("vn.l")
	public int field7062;

	@ObfuscatedName("vn.f")
	public int field7063;

	@ObfuscatedName("vn.d")
	public String field7125 = "null";

	@ObfuscatedName("vn.z")
	public short[] field7103;

	@ObfuscatedName("vn.n")
	public short[] field7066;

	@ObfuscatedName("vn.o")
	public byte[] field7067;

	@ObfuscatedName("vn.q")
	public short[] field7102;

	@ObfuscatedName("vn.p")
	public short[] field7100;

	@ObfuscatedName("vn.w")
	public byte[] field7079;

	@ObfuscatedName("vn.b")
	public byte[] field7071;

	@ObfuscatedName("vn.x")
	public int field7072 = 1175614544;

	@ObfuscatedName("vn.i")
	public int field7073 = 0;

	@ObfuscatedName("vn.v")
	public int field7077 = 0;

	@ObfuscatedName("vn.k")
	public int field7088 = 0;

	@ObfuscatedName("vn.h")
	public int field7076 = 0;

	@ObfuscatedName("vn.r")
	public int field7075 = 0;

	@ObfuscatedName("vn.g")
	public int field7078 = 0;

	@ObfuscatedName("vn.y")
	public int field7068 = 1703964527;

	@ObfuscatedName("vn.e")
	public int field7080 = 1262703379;

	@ObfuscatedName("vn.ay")
	public boolean field7099 = false;

	@ObfuscatedName("vn.af")
	public String[] field7082;

	@ObfuscatedName("vn.ar")
	public String[] field7083;

	@ObfuscatedName("vn.an")
	public int[] field7070;

	@ObfuscatedName("vn.ap")
	public int[] field7110;

	@ObfuscatedName("vn.ag")
	public int field7085 = 2029724067;

	@ObfuscatedName("vn.as")
	public int field7087 = -1898202409;

	@ObfuscatedName("vn.ai")
	public int field7089 = 862109475;

	@ObfuscatedName("vn.ao")
	public int field7081 = -1614237293;

	@ObfuscatedName("vn.al")
	public int field7090 = -1032727937;

	@ObfuscatedName("vn.at")
	public int field7091 = -260147601;

	@ObfuscatedName("vn.ax")
	public int field7092 = 1476902705;

	@ObfuscatedName("vn.aw")
	public int field7093 = 1871060193;

	@ObfuscatedName("vn.aa")
	public int field7119 = 684379289;

	@ObfuscatedName("vn.am")
	public int field7095 = 0;

	@ObfuscatedName("vn.ad")
	public int field7096 = 0;

	@ObfuscatedName("vn.az")
	public int field7094 = 0;

	@ObfuscatedName("vn.ak")
	public int field7098 = 0;

	@ObfuscatedName("vn.av")
	public int field7124 = 0;

	@ObfuscatedName("vn.aj")
	public int field7065 = 0;

	@ObfuscatedName("vn.ah")
	public int field7101 = 1381882401;

	@ObfuscatedName("vn.au")
	public int field7120 = -197158949;

	@ObfuscatedName("vn.ae")
	public int field7111 = 763264689;

	@ObfuscatedName("vn.ac")
	public int field7104 = 353094061;

	@ObfuscatedName("vn.aq")
	public int[] field7105;

	@ObfuscatedName("vn.ab")
	public int[] field7106;

	@ObfuscatedName("vn.bq")
	public int field7107 = -505103763;

	@ObfuscatedName("vn.bz")
	public int field7108 = -2066128347;

	@ObfuscatedName("vn.bv")
	public int field7109 = 2045998141;

	@ObfuscatedName("vn.bj")
	public int field7064 = -863987061;

	@ObfuscatedName("vn.bf")
	public int field7084 = 289502080;

	@ObfuscatedName("vn.bt")
	public int field7112 = 156272512;

	@ObfuscatedName("vn.bg")
	public int field7113 = 421284992;

	@ObfuscatedName("vn.bl")
	public int field7114 = 0;

	@ObfuscatedName("vn.bk")
	public int field7115 = 0;

	@ObfuscatedName("vn.bs")
	public int field7116 = 0;

	@ObfuscatedName("vn.bn")
	public boolean field7117 = false;

	@ObfuscatedName("vn.ba")
	public int field7060 = 0;

	@ObfuscatedName("vn.bd")
	public class565 field7055;

	@ObfuscatedName("vn.bc")
	public int[] field7057;

	@ObfuscatedName("vn.br")
	public int field7121 = 0;

	@ObfuscatedName("vn.bp")
	public int field7122 = 1585551355;

	@ObfuscatedName("vn.bi")
	public int field7123 = -700322527;

	@ObfuscatedName("vn.bx")
	public boolean field7086 = false;

	@ObfuscatedName("vn.bm")
	public int field7097;

	@ObfuscatedName("vn.u(I)V")
	public void method12235() {
	}

	@ObfuscatedName("vn.j(Laet;I)V")
	public void method12236(class814 arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			this.method12237(arg0, var2);
		}
	}

	@ObfuscatedName("vn.a(Laet;II)V")
	public void method12237(class814 arg0, int arg1) {
		if (arg1 == 1) {
			this.field7063 = arg0.method15411() * 1798512489;
		} else if (arg1 == 2) {
			this.field7125 = arg0.method15337();
		} else if (arg1 == 4) {
			this.field7072 = arg0.method15239() * 722142313;
		} else if (arg1 == 5) {
			this.field7073 = arg0.method15239() * -1064778545;
		} else if (arg1 == 6) {
			this.field7077 = arg0.method15239() * -450069685;
		} else if (arg1 == 7) {
			this.field7076 = arg0.method15239() * -1420392839;
			if (this.field7076 * -1239088183 > 32767) {
				this.field7076 -= -2038890496;
			}
		} else if (arg1 == 8) {
			this.field7075 = arg0.method15239() * -963077033;
			if (this.field7075 * 1846546279 > 32767) {
				this.field7075 -= -1672019968;
			}
		} else if (arg1 == 11) {
			this.field7078 = -758453543;
		} else if (arg1 == 12) {
			this.field7080 = arg0.method15379() * 1262703379;
		} else if (arg1 == 13) {
			this.field7085 = arg0.method15220() * -2029724067;
		} else if (arg1 == 14) {
			this.field7087 = arg0.method15220() * 1898202409;
		} else if (arg1 == 16) {
			this.field7099 = true;
		} else if (arg1 == 18) {
			this.field7068 = arg0.method15239() * -1703964527;
		} else if (arg1 == 23) {
			this.field7081 = arg0.method15411() * 1614237293;
		} else if (arg1 == 24) {
			this.field7090 = arg0.method15411() * 1032727937;
		} else if (arg1 == 25) {
			this.field7091 = arg0.method15411() * 260147601;
		} else if (arg1 == 26) {
			this.field7092 = arg0.method15411() * -1476902705;
		} else if (arg1 == 27) {
			this.field7089 = arg0.method15220() * -862109475;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.field7082[arg1 - 30] = arg0.method15337();
		} else if (arg1 >= 35 && arg1 < 40) {
			this.field7083[arg1 - 35] = arg0.method15337();
		} else if (arg1 == 40) {
			int var3 = arg0.method15220();
			this.field7103 = new short[var3];
			this.field7066 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field7103[var4] = (short) arg0.method15239();
				this.field7066[var4] = (short) arg0.method15239();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.method15220();
			this.field7102 = new short[var5];
			this.field7100 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field7102[var6] = (short) arg0.method15239();
				this.field7100[var6] = (short) arg0.method15239();
			}
		} else if (arg1 == 42) {
			int var7 = arg0.method15220();
			this.field7067 = new byte[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field7067[var8] = arg0.method15238();
			}
		} else if (arg1 == 43) {
			this.field7097 = arg0.method15379() * -408043577;
			this.field7086 = true;
		} else if (arg1 == 44) {
			int var9 = arg0.method15239();
			int var10 = 0;
			for (int var11 = var9; var11 > 0; var11 >>= 0x1) {
				var10++;
			}
			this.field7079 = new byte[var10];
			byte var12 = 0;
			for (int var13 = 0; var13 < var10; var13++) {
				if ((var9 & 0x1 << var13) > 0) {
					this.field7079[var13] = var12++;
				} else {
					this.field7079[var13] = -1;
				}
			}
		} else if (arg1 == 45) {
			int var14 = arg0.method15239();
			int var15 = 0;
			for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
				var15++;
			}
			this.field7071 = new byte[var15];
			byte var17 = 0;
			for (int var18 = 0; var18 < var15; var18++) {
				if ((var14 & 0x1 << var18) > 0) {
					this.field7071[var18] = var17++;
				} else {
					this.field7071[var18] = -1;
				}
			}
		} else if (arg1 == 65) {
			this.field7117 = true;
		} else if (arg1 == 78) {
			this.field7093 = arg0.method15411() * -1871060193;
		} else if (arg1 == 79) {
			this.field7119 = arg0.method15411() * -684379289;
		} else if (arg1 == 90) {
			this.field7101 = arg0.method15411() * -1381882401;
		} else if (arg1 == 91) {
			this.field7111 = arg0.method15411() * -763264689;
		} else if (arg1 == 92) {
			this.field7120 = arg0.method15411() * 197158949;
		} else if (arg1 == 93) {
			this.field7104 = arg0.method15411() * -353094061;
		} else if (arg1 == 95) {
			this.field7088 = arg0.method15239() * 1673074779;
		} else if (arg1 == 96) {
			this.field7060 = arg0.method15220() * -725937537;
		} else if (arg1 == 97) {
			this.field7107 = arg0.method15239() * 505103763;
		} else if (arg1 == 98) {
			this.field7108 = arg0.method15239() * 2066128347;
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.field7105 == null) {
				this.field7105 = new int[10];
				this.field7106 = new int[10];
			}
			this.field7105[arg1 - 100] = arg0.method15239();
			this.field7106[arg1 - 100] = arg0.method15239();
		} else if (arg1 == 110) {
			this.field7084 = arg0.method15239() * -1306361113;
		} else if (arg1 == 111) {
			this.field7112 = arg0.method15239() * 1074962703;
		} else if (arg1 == 112) {
			this.field7113 = arg0.method15239() * 1009924249;
		} else if (arg1 == 113) {
			this.field7114 = arg0.method15238() * -1397201639;
		} else if (arg1 == 114) {
			this.field7115 = arg0.method15238() * -1655117949;
		} else if (arg1 == 115) {
			this.field7116 = arg0.method15220() * -1265243651;
		} else if (arg1 == 121) {
			this.field7109 = arg0.method15239() * -2045998141;
		} else if (arg1 == 122) {
			this.field7064 = arg0.method15239() * 863987061;
		} else if (arg1 == 125) {
			this.field7095 = (arg0.method15238() << 2) * -1573601269;
			this.field7094 = (arg0.method15238() << 2) * -1974408539;
			this.field7124 = (arg0.method15238() << 2) * 466348469;
		} else if (arg1 == 126) {
			this.field7096 = (arg0.method15238() << 2) * 1925290817;
			this.field7098 = (arg0.method15238() << 2) * 1579875641;
			this.field7065 = (arg0.method15238() << 2) * -821103923;
		} else if (arg1 == 127 || arg1 == 128 || arg1 == 129 || arg1 == 130) {
			arg0.method15220();
			arg0.method15239();
		} else if (arg1 == 132) {
			int var19 = arg0.method15220();
			this.field7057 = new int[var19];
			for (int var20 = 0; var20 < var19; var20++) {
				this.field7057[var20] = arg0.method15239();
			}
		} else if (arg1 == 134) {
			this.field7121 = arg0.method15220() * 1695998957;
		} else if (arg1 == 139) {
			this.field7122 = arg0.method15239() * -1585551355;
		} else if (arg1 == 140) {
			this.field7123 = arg0.method15239() * 700322527;
		} else if (arg1 >= 142 && arg1 < 147) {
			if (this.field7070 == null) {
				this.field7070 = new int[6];
				Arrays.fill(this.field7070, -1);
			}
			this.field7070[arg1 - 142] = arg0.method15239();
		} else if (arg1 >= 150 && arg1 < 155) {
			if (this.field7110 == null) {
				this.field7110 = new int[5];
				Arrays.fill(this.field7110, -1);
			}
			this.field7110[arg1 - 150] = arg0.method15239();
		} else if (arg1 == 249) {
			int var21 = arg0.method15220();
			if (this.field7055 == null) {
				int var22 = class595.method2839(var21);
				this.field7055 = new class565(var22);
			}
			for (int var23 = 0; var23 < var21; var23++) {
				boolean var24 = arg0.method15220() == 1;
				int var25 = arg0.method15241();
				class399 var26;
				if (var24) {
					var26 = new class798(arg0.method15337());
				} else {
					var26 = new class802(arg0.method15379());
				}
				this.field7055.method11927(var26, (long) var25);
			}
		}
	}

	@ObfuscatedName("vn.s(Lvn;Lvn;I)V")
	public void method12238(class592 arg0, class592 arg1) {
		this.field7063 = arg0.field7063;
		this.field7072 = arg0.field7072;
		this.field7073 = arg0.field7073;
		this.field7077 = arg0.field7077;
		this.field7088 = arg0.field7088;
		this.field7076 = arg0.field7076;
		this.field7075 = arg0.field7075;
		this.field7103 = arg0.field7103;
		this.field7066 = arg0.field7066;
		this.field7067 = arg0.field7067;
		this.field7102 = arg0.field7102;
		this.field7100 = arg0.field7100;
		this.field7125 = arg1.field7125;
		this.field7099 = arg1.field7099;
		this.field7080 = arg1.field7080;
		this.field7078 = -758453543;
	}

	@ObfuscatedName("vn.c(Lvn;Lvn;I)V")
	public void method12258(class592 arg0, class592 arg1) {
		this.field7080 = 0;
		this.field7063 = arg0.field7063;
		this.field7072 = arg0.field7072;
		this.field7073 = arg0.field7073;
		this.field7077 = arg0.field7077;
		this.field7088 = arg0.field7088;
		this.field7076 = arg0.field7076;
		this.field7075 = arg0.field7075;
		this.field7103 = arg1.field7103;
		this.field7066 = arg1.field7066;
		this.field7067 = arg1.field7067;
		this.field7102 = arg1.field7102;
		this.field7100 = arg1.field7100;
		this.field7125 = arg1.field7125;
		this.field7099 = arg1.field7099;
		this.field7085 = arg1.field7085;
		this.field7087 = arg1.field7087;
		this.field7089 = arg1.field7089;
		this.field7081 = arg1.field7081;
		this.field7090 = arg1.field7090;
		this.field7093 = arg1.field7093;
		this.field7091 = arg1.field7091;
		this.field7092 = arg1.field7092;
		this.field7119 = arg1.field7119;
		this.field7095 = arg1.field7095;
		this.field7096 = arg1.field7096;
		this.field7094 = arg1.field7094;
		this.field7098 = arg1.field7098;
		this.field7124 = arg1.field7124;
		this.field7065 = arg1.field7065;
		this.field7101 = arg1.field7101;
		this.field7120 = arg1.field7120;
		this.field7111 = arg1.field7111;
		this.field7104 = arg1.field7104;
		this.field7116 = arg1.field7116;
		this.field7082 = arg1.field7082;
		this.field7055 = arg1.field7055;
		this.field7083 = new String[5];
		if (arg1.field7083 != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.field7083[var3] = arg1.field7083[var3];
			}
		}
		this.field7083[4] = class588.field6931.method12206(this.field7061.field7140);
	}

	@ObfuscatedName("vn.m(Lvn;Lvn;B)V")
	public void method12240(class592 arg0, class592 arg1) {
		this.field7080 = 0;
		this.field7063 = arg0.field7063;
		this.field7072 = arg0.field7072;
		this.field7073 = arg0.field7073;
		this.field7077 = arg0.field7077;
		this.field7088 = arg0.field7088;
		this.field7076 = arg0.field7076;
		this.field7075 = arg0.field7075;
		this.field7103 = arg1.field7103;
		this.field7066 = arg1.field7066;
		this.field7067 = arg1.field7067;
		this.field7102 = arg1.field7102;
		this.field7100 = arg1.field7100;
		this.field7125 = arg1.field7125;
		this.field7099 = arg1.field7099;
		this.field7085 = arg1.field7085;
		this.field7087 = arg1.field7087;
		this.field7089 = arg1.field7089;
		this.field7081 = arg1.field7081;
		this.field7090 = arg1.field7090;
		this.field7093 = arg1.field7093;
		this.field7091 = arg1.field7091;
		this.field7092 = arg1.field7092;
		this.field7119 = arg1.field7119;
		this.field7095 = arg1.field7095;
		this.field7096 = arg1.field7096;
		this.field7094 = arg1.field7094;
		this.field7098 = arg1.field7098;
		this.field7124 = arg1.field7124;
		this.field7065 = arg1.field7065;
		this.field7101 = arg1.field7101;
		this.field7120 = arg1.field7120;
		this.field7111 = arg1.field7111;
		this.field7104 = arg1.field7104;
		this.field7116 = arg1.field7116;
		this.field7082 = arg1.field7082;
		this.field7055 = arg1.field7055;
		this.field7078 = arg1.field7078;
		this.field7083 = new String[5];
		if (arg1.field7083 != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.field7083[var3] = arg1.field7083[var3];
			}
		}
		this.field7083[4] = class588.field6879.method12206(this.field7061.field7140);
	}

	@ObfuscatedName("vn.t(Lra;IILqc;Ltt;IIIII)Lqa;")
	public final class13 method12241(class14 arg0, int arg1, int arg2, class471 arg3, class553 arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.field7105 != null && arg2 > 1) {
			int var10 = -1;
			for (int var11 = 0; var11 < 10; var11++) {
				if (arg2 >= this.field7106[var11] && this.field7106[var11] != 0) {
					var10 = this.field7105[var11];
				}
			}
			if (var10 != -1) {
				return this.field7061.method12316(var10).method12241(arg0, arg1, 1, arg3, arg4, arg5, arg6, arg7, arg8);
			}
		}
		int var12 = arg1;
		if (arg4 != null) {
			var12 = arg1 | arg4.method11779();
		}
		class451 var13 = this.field7061.field7146;
		class13 var14;
		synchronized (this.field7061.field7146) {
			var14 = (class13) this.field7061.field7146.method7916((long) (this.field7062 * -2136968605 | arg0.field397 * 1002839359 << 29));
		}
		if (var14 == null || arg0.method519(var14.method329(), var12) != 0) {
			if (var14 != null) {
				var12 = arg0.method520(var12, var14.method329());
			}
			int var16 = var12;
			if (this.field7102 != null) {
				var16 = var12 | 0x8000;
			}
			if (this.field7103 != null || arg3 != null) {
				var16 |= 0x4000;
			}
			if (this.field7084 * 761884887 != 128) {
				var16 |= 0x1;
			}
			if (this.field7084 * 761884887 != 128) {
				var16 |= 0x2;
			}
			if (this.field7084 * 761884887 != 128) {
				var16 |= 0x4;
			}
			class129 var17 = class129.method2664(this.field7061.field7149, this.field7063 * -1922342695, 0);
			if (var17 == null) {
				return null;
			}
			if (var17.field1314 < 13) {
				var17.method2634(2);
			}
			var14 = arg0.method625(var17, var16, this.field7061.field7150 * -129228099, this.field7114 * -1330043095 + 64, this.field7115 * 2007915479 + 850);
			if (this.field7084 * 761884887 != 128 || this.field7112 * 989081071 != 128 || this.field7113 * -407594071 != 128) {
				var14.method245(this.field7084 * 761884887, this.field7112 * 989081071, this.field7113 * -407594071);
			}
			if (this.field7103 != null) {
				for (int var18 = 0; var18 < this.field7103.length; var18++) {
					if (this.field7067 == null || var18 >= this.field7067.length) {
						var14.method287(this.field7103[var18], this.field7066[var18]);
					} else {
						var14.method287(this.field7103[var18], field7118[this.field7067[var18] & 0xFF]);
					}
				}
			}
			if (this.field7102 != null) {
				for (int var19 = 0; var19 < this.field7102.length; var19++) {
					var14.method289(this.field7102[var19], this.field7100[var19]);
				}
			}
			if (arg3 != null) {
				for (int var20 = 0; var20 < 10; var20++) {
					for (int var21 = 0; var21 < Statics.field5009[var20].length; var21++) {
						if (arg3.field5000[var20] < Statics.field5010[var20][var21].length) {
							var14.method287(Statics.field5009[var20][var21], Statics.field5010[var20][var21][arg3.field5000[var20]]);
						}
					}
				}
			}
			var14.method252(var12);
			class451 var22 = this.field7061.field7146;
			synchronized (this.field7061.field7146) {
				this.field7061.field7146.method7937(var14, (long) (this.field7062 * -2136968605 | arg0.field397 * 1002839359 << 29));
			}
		}
		if (arg4 != null || arg8 != 0) {
			var14 = var14.method295((byte) 1, var12, true);
			if (arg4 != null) {
				arg4.method11780(var14, 0);
			}
			if (arg8 != 0) {
				var14.method290(arg5, arg6, arg7, arg8);
			}
		}
		var14.method252(arg1);
		return var14;
	}

	@ObfuscatedName("vn.l(II)Lvn;")
	public class592 method12242(int arg0) {
		if (this.field7105 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field7106[var3] && this.field7106[var3] != 0) {
					var2 = this.field7105[var3];
				}
			}
			if (var2 != -1) {
				return this.field7061.method12316(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("vn.f(Lra;Lra;IIIZILl;Lqc;B)[I")
	public int[] method12276(class14 arg0, class14 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class15 arg7, class471 arg8) {
		class129 var10 = class129.method2664(this.field7061.field7149, this.field7063 * -1922342695, 0);
		if (var10 == null) {
			return null;
		}
		if (var10.field1314 < 13) {
			var10.method2634(2);
		}
		if (this.field7103 != null) {
			for (int var11 = 0; var11 < this.field7103.length; var11++) {
				if (this.field7067 == null || var11 >= this.field7067.length) {
					var10.method2661(this.field7103[var11], this.field7066[var11]);
				} else {
					var10.method2661(this.field7103[var11], field7118[this.field7067[var11] & 0xFF]);
				}
			}
		}
		if (this.field7102 != null) {
			for (int var12 = 0; var12 < this.field7102.length; var12++) {
				var10.method2656(this.field7102[var12], this.field7100[var12]);
			}
		}
		if (arg8 != null) {
			for (int var13 = 0; var13 < 10; var13++) {
				for (int var14 = 0; var14 < Statics.field5009[var13].length; var14++) {
					if (arg8.field5000[var13] < Statics.field5010[var13][var14].length) {
						var10.method2661(Statics.field5009[var13][var14], Statics.field5010[var13][var14][arg8.field5000[var13]]);
					}
				}
			}
		}
		int var15 = 2048;
		boolean var16 = false;
		if (this.field7084 * 761884887 != 128 || this.field7112 * 989081071 != 128 || this.field7113 * -407594071 != 128) {
			var16 = true;
			var15 |= 0x7;
		}
		class13 var17 = arg0.method625(var10, var15, 64, this.field7114 * -1330043095 + 64, this.field7115 * 2007915479 + 768);
		if (!var17.method291()) {
			return null;
		}
		if (var16) {
			var17.method245(this.field7084 * 761884887, this.field7112 * 989081071, this.field7113 * -407594071);
		}
		class118 var18 = null;
		if (this.field7108 * -1478617517 != -1) {
			var18 = this.field7061.method12294(arg0, arg1, this.field7107 * 1050386587, 10, 1, 0, true, true, 0, arg7, arg8);
			if (var18 == null) {
				return null;
			}
		} else if (this.field7064 * -1014988067 != -1) {
			var18 = this.field7061.method12294(arg0, arg1, this.field7109 * 767442155, arg2, arg3, arg4, false, true, 0, arg7, arg8);
			if (var18 == null) {
				return null;
			}
		} else if (this.field7123 * 63580447 != -1) {
			var18 = this.field7061.method12294(arg0, arg1, this.field7122 * 1903043789, arg2, arg3, arg4, false, true, 0, arg7, arg8);
			if (var18 == null) {
				return null;
			}
		}
		int var19;
		if (arg5) {
			var19 = (int) ((double) (this.field7072 * 547015641) * 1.5D) << 2;
		} else if (arg3 == 2) {
			var19 = (int) ((double) (this.field7072 * 547015641) * 1.04D) << 2;
		} else {
			var19 = this.field7072 * 547015641 << 2;
		}
		class320 var20 = arg0.method528();
		class320 var21 = arg0.method781();
		var21.method5397(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) arg0.method457().method921(), (float) arg0.method457().method922());
		arg0.method784(var21);
		arg0.method474(0, 0, arg0.method457().method921(), arg0.method457().method922());
		class314 var22 = new class314();
		arg0.method524(var22);
		arg0.method529((float) (Math.random() / 10.0D) + 0.95F);
		arg0.method530(16777215, (float) (Math.random() / 10.0D) + 0.95F, (float) (Math.random() / 10.0D) + 0.95F, -50.0F, -10.0F, -50.0F);
		class314 var23 = arg0.method516();
		var23.method5106(0.0F, 0.0F, 1.0F, class312.method5096(-(this.field7088 * -845260845) << 3));
		var23.method5178(0.0F, 1.0F, 0.0F, class312.method5096(this.field7077 * -1672497565 << 3));
		var23.method5116((float) (this.field7076 * -1239088183 << 2), (float) ((class312.field3439[this.field7073 * 269599279 << 3] * var19 >> 14) - var17.method278() / 2 + (this.field7075 * 1846546279 << 2)), (float) ((this.field7075 * 1846546279 << 2) + (class312.field3447[this.field7073 * 269599279 << 3] * var19 >> 14)));
		var23.method5178(1.0F, 0.0F, 0.0F, class312.method5096(this.field7073 * 269599279 << 3));
		arg0.method659(0, 0, 36, 32);
		arg0.method505(2, 0);
		arg0.method489(0, 0, 36, 32, 0, 0);
		arg0.method532(0, -1, 0);
		var17.method271(var23, null, 1);
		arg0.method784(var20);
		int[] var24 = arg0.method691(0, 0, 36, 32);
		if (arg3 >= 1) {
			var24 = this.method12244(var24, -16777214);
			if (arg3 >= 2) {
				var24 = this.method12244(var24, -1);
			}
		}
		if (arg4 != 0) {
			this.method12282(var24, arg4);
		}
		if (this.field7064 * -1014988067 != -1) {
			var18.method2500(0, 0);
		} else if (this.field7123 * 63580447 != -1) {
			var18.method2500(0, 0);
		}
		arg0.method506(var24, 0, 36, 36, 32).method2500(0, 0);
		if (this.field7108 * -1478617517 != -1) {
			var18.method2500(0, 0);
		}
		if (arg6 == 1 || arg6 == 2 && (this.field7078 * -307956375 == 1 || arg2 != 1) && arg2 != -1) {
			arg7.method833(method11975(arg2, this.field7061.field7140), 0, 9, -256, -16777215);
		}
		int[] var25 = arg0.method691(0, 0, 36, 32);
		for (int var26 = 0; var26 < var25.length; var26++) {
			if ((var25[var26] & 0xFFFFFF) == 0) {
				var25[var26] = 0;
			} else {
				var25[var26] |= 0xFF000000;
			}
		}
		return var25;
	}

	@ObfuscatedName("vn.d([III)[I")
	public int[] method12244(int[] arg0, int arg1) {
		int[] var3 = new int[1152];
		int var4 = 0;
		for (int var5 = 0; var5 < 32; var5++) {
			for (int var6 = 0; var6 < 36; var6++) {
				int var7 = arg0[var4];
				if (var7 == 0) {
					if (var6 > 0 && arg0[var4 - 1] != 0) {
						var7 = arg1;
					} else if (var5 > 0 && arg0[var4 - 36] != 0) {
						var7 = arg1;
					} else if (var6 < 35 && arg0[var4 + 1] != 0) {
						var7 = arg1;
					} else if (var5 < 31 && arg0[var4 + 36] != 0) {
						var7 = arg1;
					}
				}
				var3[var4++] = var7;
			}
		}
		return var3;
	}

	@ObfuscatedName("vn.z([IIB)V")
	public void method12282(int[] arg0, int arg1) {
		for (int var3 = 31; var3 > 0; var3--) {
			int var4 = var3 * 36;
			for (int var5 = 35; var5 > 0; var5--) {
				if (arg0[var4 + var5] == 0 && arg0[var4 + var5 - 1 - 36] != 0) {
					arg0[var4 + var5] = arg1;
				}
			}
		}
	}

	@ObfuscatedName("ue.n(ILsn;I)Ljava/lang/String;")
	public static String method11975(int arg0, class519 arg1) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + class588.field7005.method12206(arg1) + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + class588.field7001.method12206(arg1) + "</col>";
		}
	}

	@ObfuscatedName("vn.o(ZLvq;B)Z")
	public final boolean method12246(boolean arg0, class593 arg1) {
		int var3;
		int var4;
		int var5;
		if (arg0) {
			if (arg1 == null || arg1.field7128 == null) {
				var3 = this.field7091 * 670193521;
				var4 = this.field7092 * -17512913;
				var5 = this.field7119 * 1909143639;
			} else {
				var3 = arg1.field7128[0];
				var4 = arg1.field7128[1];
				var5 = arg1.field7128[2];
			}
		} else if (arg1 == null || arg1.field7130 == null) {
			var3 = this.field7081 * 1542515557;
			var4 = this.field7090 * -534244735;
			var5 = this.field7093 * 1957681375;
		} else {
			var3 = arg1.field7130[0];
			var4 = arg1.field7130[1];
			var5 = arg1.field7130[2];
		}
		if (var3 == -1) {
			return true;
		}
		boolean var6 = true;
		if (!this.field7061.field7149.method5629(var3, 0)) {
			var6 = false;
		}
		if (var4 != -1 && !this.field7061.field7149.method5629(var4, 0)) {
			var6 = false;
		}
		if (var5 != -1 && !this.field7061.field7149.method5629(var5, 0)) {
			var6 = false;
		}
		return var6;
	}

	@ObfuscatedName("vn.q(ZLvq;I)Ldw;")
	public final class129 method12245(boolean arg0, class593 arg1) {
		int var3;
		int var4;
		int var5;
		if (arg0) {
			if (arg1 == null || arg1.field7128 == null) {
				var3 = this.field7091 * 670193521;
				var4 = this.field7092 * -17512913;
				var5 = this.field7119 * 1909143639;
			} else {
				var3 = arg1.field7128[0];
				var4 = arg1.field7128[1];
				var5 = arg1.field7128[2];
			}
		} else if (arg1 == null || arg1.field7130 == null) {
			var3 = this.field7081 * 1542515557;
			var4 = this.field7090 * -534244735;
			var5 = this.field7093 * 1957681375;
		} else {
			var3 = arg1.field7130[0];
			var4 = arg1.field7130[1];
			var5 = arg1.field7130[2];
		}
		if (var3 == -1) {
			return null;
		}
		class129 var6 = class129.method2664(this.field7061.field7149, var3, 0);
		if (var6 == null) {
			return null;
		}
		if (var6.field1314 < 13) {
			var6.method2634(2);
		}
		if (var4 != -1) {
			class129 var7 = class129.method2664(this.field7061.field7149, var4, 0);
			if (var7.field1314 < 13) {
				var7.method2634(2);
			}
			if (var5 == -1) {
				class129[] var10 = new class129[] { var6, var7 };
				var6 = new class129(var10, 2);
			} else {
				class129 var8 = class129.method2664(this.field7061.field7149, var5, 0);
				if (var8.field1314 < 13) {
					var8.method2634(2);
				}
				class129[] var9 = new class129[] { var6, var7, var8 };
				var6 = new class129(var9, 3);
			}
		}
		if (!arg0 && (this.field7095 * 1812188067 != 0 || this.field7094 * -2103644883 != 0 || this.field7124 * -1299809123 != 0)) {
			var6.method2630(this.field7095 * 1812188067, this.field7094 * -2103644883, this.field7124 * -1299809123);
		}
		if (arg0 && (this.field7096 * 1074853057 != 0 || this.field7098 * 1432281353 != 0 || this.field7065 * -392279547 != 0)) {
			var6.method2630(this.field7096 * 1074853057, this.field7098 * 1432281353, this.field7065 * -392279547);
		}
		if (this.field7103 != null) {
			short[] var11;
			if (arg1 == null || arg1.field7134 == null) {
				var11 = this.field7066;
			} else {
				var11 = arg1.field7134;
			}
			for (int var12 = 0; var12 < this.field7103.length; var12++) {
				var6.method2661(this.field7103[var12], var11[var12]);
			}
		}
		if (this.field7102 != null) {
			short[] var13;
			if (arg1 == null || arg1.field7135 == null) {
				var13 = this.field7100;
			} else {
				var13 = arg1.field7135;
			}
			for (int var14 = 0; var14 < this.field7102.length; var14++) {
				var6.method2656(this.field7102[var14], var13[var14]);
			}
		}
		return var6;
	}

	@ObfuscatedName("vn.p(ZLvq;B)Z")
	public final boolean method12275(boolean arg0, class593 arg1) {
		int var3;
		int var4;
		if (arg0) {
			if (arg1 == null || arg1.field7126 == null) {
				var3 = this.field7111 * -305597009;
				var4 = this.field7104 * 1129676251;
			} else {
				var3 = arg1.field7126[0];
				var4 = arg1.field7126[1];
			}
		} else if (arg1 == null || arg1.field7132 == null) {
			var3 = this.field7101 * -1762929121;
			var4 = this.field7120 * 1142780845;
		} else {
			var3 = arg1.field7132[0];
			var4 = arg1.field7132[1];
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!this.field7061.field7149.method5629(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !this.field7061.field7149.method5629(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("vn.w(ZLvq;I)Ldw;")
	public final class129 method12249(boolean arg0, class593 arg1) {
		int var3;
		int var4;
		if (arg0) {
			if (arg1 == null || arg1.field7126 == null) {
				var3 = this.field7111 * -305597009;
				var4 = this.field7104 * 1129676251;
			} else {
				var3 = arg1.field7126[0];
				var4 = arg1.field7126[1];
			}
		} else if (arg1 == null || arg1.field7132 == null) {
			var3 = this.field7101 * -1762929121;
			var4 = this.field7120 * 1142780845;
		} else {
			var3 = arg1.field7132[0];
			var4 = arg1.field7132[1];
		}
		if (var3 == -1) {
			return null;
		}
		class129 var5 = class129.method2664(this.field7061.field7149, var3, 0);
		if (var5.field1314 < 13) {
			var5.method2634(2);
		}
		if (var4 != -1) {
			class129 var6 = class129.method2664(this.field7061.field7149, var4, 0);
			if (var6.field1314 < 13) {
				var6.method2634(2);
			}
			class129[] var7 = new class129[] { var5, var6 };
			var5 = new class129(var7, 2);
		}
		if (this.field7103 != null) {
			short[] var8;
			if (arg1 == null || arg1.field7134 == null) {
				var8 = this.field7066;
			} else {
				var8 = arg1.field7134;
			}
			for (int var9 = 0; var9 < this.field7103.length; var9++) {
				var5.method2661(this.field7103[var9], var8[var9]);
			}
		}
		if (this.field7102 != null) {
			short[] var10;
			if (arg1 == null || arg1.field7135 == null) {
				var10 = this.field7100;
			} else {
				var10 = arg1.field7135;
			}
			for (int var11 = 0; var11 < this.field7102.length; var11++) {
				var5.method2656(this.field7102[var11], var10[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("vn.b(III)I")
	public int method12250(int arg0, int arg1) {
		if (this.field7055 == null) {
			return arg1;
		} else {
			class802 var3 = (class802) this.field7055.method11923((long) arg0);
			return var3 == null ? arg1 : var3.field9556 * 1720545541;
		}
	}

	@ObfuscatedName("vn.x(ILjava/lang/String;B)Ljava/lang/String;")
	public String method12248(int arg0, String arg1) {
		if (this.field7055 == null) {
			return arg1;
		} else {
			class798 var3 = (class798) this.field7055.method11923((long) arg0);
			return var3 == null ? arg1 : (String) var3.field9550;
		}
	}

	@ObfuscatedName("vn.i(II)I")
	public int method12251(int arg0) {
		return this.field7070 == null ? -1 : this.field7070[arg0];
	}

	@ObfuscatedName("vn.v(II)I")
	public int method12252(int arg0) {
		return this.field7110 == null ? -1 : this.field7110[arg0];
	}
}
