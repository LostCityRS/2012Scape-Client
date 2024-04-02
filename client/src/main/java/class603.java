
import deob.ObfuscatedName;
import java.awt.Point;

@ObfuscatedName("vm")
public class class603 {

	@ObfuscatedName("vm.u")
	public byte[] field7178;

	@ObfuscatedName("vm.j")
	public byte[][] field7173;

	@ObfuscatedName("vm.a")
	public int field7175;

	@ObfuscatedName("vm.s")
	public int field7176;

	@ObfuscatedName("vm.c")
	public int field7177;

	@ObfuscatedName("vm.m")
	public static String[] field7174 = new String[100];

	@ObfuscatedName("ur.u(Lls;III)Lvm;")
	public static class603 method12156(class334 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.method5627(arg1, arg2);
		return var3 == null ? null : new class603(var3);
	}

	@ObfuscatedName("aco.j(Lls;IB)Lvm;")
	public static class603 method14876(class334 arg0, int arg1) {
		byte[] var2 = arg0.method5635(arg1);
		return var2 == null ? null : new class603(var2);
	}

	public class603(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		int var3 = var2.method15220();
		if (var3 != 0) {
			throw new RuntimeException("");
		}
		boolean var4 = var2.method15220() == 1;
		this.field7178 = new byte[256];
		var2.method15263(this.field7178, 0, 256);
		if (var4) {
			int[] var5 = new int[256];
			int[] var6 = new int[256];
			for (int var7 = 0; var7 < 256; var7++) {
				var5[var7] = var2.method15220();
			}
			for (int var8 = 0; var8 < 256; var8++) {
				var6[var8] = var2.method15220();
			}
			byte[][] var9 = new byte[256][];
			for (int var10 = 0; var10 < 256; var10++) {
				var9[var10] = new byte[var5[var10]];
				byte var11 = 0;
				for (int var12 = 0; var12 < var9[var10].length; var12++) {
					var11 += var2.method15238();
					var9[var10][var12] = var11;
				}
			}
			byte[][] var13 = new byte[256][];
			for (int var14 = 0; var14 < 256; var14++) {
				var13[var14] = new byte[var5[var14]];
				byte var15 = 0;
				for (int var16 = 0; var16 < var13[var14].length; var16++) {
					var15 += var2.method15238();
					var13[var14][var16] = var15;
				}
			}
			this.field7173 = new byte[256][256];
			for (int var17 = 0; var17 < 256; var17++) {
				if (var17 != 32 && var17 != 160) {
					for (int var18 = 0; var18 < 256; var18++) {
						if (var18 != 32 && var18 != 160) {
							this.field7173[var17][var18] = (byte) method3506(var9, var13, var6, this.field7178, var5, var17, var18);
						}
					}
				}
			}
			this.field7175 = var5[32] + var6[32];
		} else {
			this.field7175 = var2.method15220();
		}
		var2.method15220();
		var2.method15220();
		this.field7176 = var2.method15220();
		this.field7177 = var2.method15220();
	}

	@ObfuscatedName("fd.a([[B[[B[I[B[IIII)I")
	public static int method3506(byte[][] arg0, byte[][] arg1, int[] arg2, byte[] arg3, int[] arg4, int arg5, int arg6) {
		int var7 = arg2[arg5];
		int var8 = arg4[arg5] + var7;
		int var9 = arg2[arg6];
		int var10 = arg4[arg6] + var9;
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}
		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}
		int var13 = arg3[arg5] & 0xFF;
		if ((arg3[arg6] & 0xFF) < var13) {
			var13 = arg3[arg6] & 0xFF;
		}
		byte[] var14 = arg1[arg5];
		byte[] var15 = arg0[arg6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;
		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}
		return -var13;
	}

	@ObfuscatedName("vm.s(ICB)I")
	public int method12387(int arg0, char arg1) {
		return this.field7173 == null ? 0 : this.field7173[arg0][arg1];
	}

	@ObfuscatedName("vm.c(IB)I")
	public int method12388(int arg0) {
		return this.field7178[arg0] & 0xFF;
	}

	@ObfuscatedName("vm.m(Ljava/lang/String;I)I")
	public int method12418(String arg0) {
		return this.method12390(arg0, null);
	}

	@ObfuscatedName("vm.t(Ljava/lang/String;[Lvd;B)I")
	public int method12390(String arg0, class602[] arg1) {
		if (arg0 == null) {
			return 0;
		}
		int var3 = -1;
		int var4 = -1;
		int var5 = 0;
		int var6 = arg0.length();
		for (int var7 = 0; var7 < var6; var7++) {
			char var8 = arg0.charAt(var7);
			if (var8 == '<') {
				var3 = var7;
			} else {
				if (var8 == '>' && var3 != -1) {
					String var9 = arg0.substring(var3 + 1, var7);
					var3 = -1;
					if (var9.equals("lt")) {
						var8 = '<';
					} else if (var9.equals("gt")) {
						var8 = '>';
					} else if (var9.equals("nbsp")) {
						var8 = 160;
					} else if (var9.equals("shy")) {
						var8 = 173;
					} else if (var9.equals("times")) {
						var8 = 215;
					} else if (var9.equals("euro")) {
						var8 = 8364;
					} else if (var9.equals("copy")) {
						var8 = 169;
					} else {
						if (!var9.equals("reg")) {
							if (var9.startsWith("img=") && arg1 != null) {
								try {
									int var10 = StringTools.method5598(var9.substring(4));
									var5 += arg1[var10].method1042();
									var4 = -1;
								} catch (Exception var12) {
								}
							}
							continue;
						}
						var8 = 174;
					}
				}
				if (var3 == -1) {
					var5 += this.field7178[Cp1252.method2474(var8) & 0xFF] & 0xFF;
					if (this.field7173 != null && var4 != -1) {
						var5 += this.field7173[var4][var8];
					}
					var4 = var8;
				}
			}
		}
		return var5;
	}

	@ObfuscatedName("vm.l(Ljava/lang/String;I[Lvd;I)Ljava/lang/String;")
	public String method12391(String arg0, int arg1, class602[] arg2) {
		if (this.method12390(arg0, arg2) <= arg1) {
			return arg0;
		}
		int var4 = arg1 - this.method12390("...", null);
		int var5 = -1;
		int var6 = -1;
		int var7 = 0;
		int var8 = arg0.length();
		String var9 = "";
		for (int var10 = 0; var10 < var8; var10++) {
			char var11 = arg0.charAt(var10);
			if (var11 == '<') {
				var5 = var10;
			} else {
				if (var11 == '>' && var5 != -1) {
					String var12 = arg0.substring(var5 + 1, var10);
					var5 = -1;
					if (var12.equals("lt")) {
						var11 = '<';
					} else if (var12.equals("gt")) {
						var11 = '>';
					} else if (var12.equals("nbsp")) {
						var11 = 160;
					} else if (var12.equals("shy")) {
						var11 = 173;
					} else if (var12.equals("times")) {
						var11 = 215;
					} else if (var12.equals("euro")) {
						var11 = 8364;
					} else if (var12.equals("copy")) {
						var11 = 169;
					} else {
						if (!var12.equals("reg")) {
							if (var12.startsWith("img=") && arg2 != null) {
								try {
									int var13 = StringTools.method5598(var12.substring(4));
									var7 += arg2[var13].method1042();
									var6 = -1;
									if (var7 > var4) {
										return var9 + "...";
									}
									var9 = arg0.substring(0, var10 + 1);
								} catch (Exception var16) {
								}
							}
							continue;
						}
						var11 = 174;
					}
				}
				if (var5 == -1) {
					var7 += this.field7178[Cp1252.method2474(var11) & 0xFF] & 0xFF;
					if (this.field7173 != null && var6 != -1) {
						var7 += this.field7173[var6][var11];
					}
					var6 = var11;
					int var15 = var7;
					if (this.field7173 != null) {
						var15 = this.field7173[var11][46] + var7;
					}
					if (var15 > var4) {
						return var9 + "...";
					}
					var9 = arg0.substring(0, var10 + 1);
				}
			}
		}
		return arg0;
	}

	@ObfuscatedName("vm.f(Ljava/lang/String;[I[Ljava/lang/String;[Lvd;I)I")
	public int method12398(String arg0, int[] arg1, String[] arg2, class602[] arg3) {
		return this.method12392(arg0, arg1, arg2, arg3, true);
	}

	@ObfuscatedName("vm.d(Ljava/lang/String;[I[Ljava/lang/String;[Lvd;ZB)I")
	public int method12392(String arg0, int[] arg1, String[] arg2, class602[] arg3, boolean arg4) {
		if (arg0 == null) {
			return 0;
		}
		int var6 = 0;
		int var7 = 0;
		int var8 = -1;
		int var9 = 0;
		int var10 = 0;
		int var11 = -1;
		int var12 = -1;
		int var13 = 0;
		int var14 = arg0.length();
		for (int var15 = 0; var15 < var14; var15++) {
			int var16 = Cp1252.method2474(arg0.charAt(var15)) & 0xFF;
			int var17 = 0;
			if (var16 == 60) {
				var11 = var15;
			} else {
				int var18;
				if (var11 == -1) {
					var18 = var15;
					var17 += this.method12388(var16);
					if (this.field7173 != null && var12 != -1) {
						var17 += this.field7173[var12][var16];
					}
					var12 = var16;
				} else {
					if (var16 != 62) {
						continue;
					}
					var18 = var11;
					String var19 = arg0.substring(var11 + 1, var15);
					var11 = -1;
					if (var19.equals("br")) {
						arg2[var13] = arg0.substring(var7, var15 + 1);
						var13++;
						if (var13 >= arg2.length) {
							return 0;
						}
						var7 = var15 + 1;
						var6 = 0;
						var8 = -1;
						var12 = -1;
						continue;
					}
					if (var19.equals("lt")) {
						var17 += this.method12388(60);
						if (this.field7173 != null && var12 != -1) {
							var17 += this.field7173[var12][60];
						}
						var12 = 60;
					} else if (var19.equals("gt")) {
						var17 += this.method12388(62);
						if (this.field7173 != null && var12 != -1) {
							var17 += this.field7173[var12][62];
						}
						var12 = 62;
					} else if (var19.equals("nbsp")) {
						var17 += this.method12388(160);
						if (this.field7173 != null && var12 != -1) {
							var17 += this.field7173[var12][160];
						}
						var12 = 160;
					} else if (var19.equals("shy")) {
						var17 += this.method12388(173);
						if (this.field7173 != null && var12 != -1) {
							var17 += this.field7173[var12][173];
						}
						var12 = 173;
					} else if (var19.equals("times")) {
						var17 += this.method12388(215);
						if (this.field7173 != null && var12 != -1) {
							var17 += this.field7173[var12][215];
						}
						var12 = 215;
					} else if (var19.equals("euro")) {
						var17 += this.method12388(8364);
						if (this.field7173 != null && var12 != -1) {
							var17 += this.field7173[var12][8364];
						}
						var12 = 8364;
					} else if (var19.equals("copy")) {
						var17 += this.method12388(169);
						if (this.field7173 != null && var12 != -1) {
							var17 += this.field7173[var12][169];
						}
						var12 = 169;
					} else if (var19.equals("reg")) {
						var17 += this.method12388(174);
						if (this.field7173 != null && var12 != -1) {
							var17 += this.field7173[var12][174];
						}
						var12 = 174;
					} else if (var19.startsWith("img=") && arg3 != null) {
						try {
							int var20 = StringTools.method5598(var19.substring(4));
							var17 += arg3[var20].method1042();
							var12 = -1;
						} catch (Exception var22) {
						}
					}
					var16 = -1;
				}
				if (var17 > 0) {
					var6 += var17;
					if (arg1 != null) {
						if (var16 == 32) {
							var8 = var15;
							var9 = var6;
							var10 = arg4 ? 1 : 0;
						}
						if (var6 > arg1[var13 < arg1.length ? var13 : arg1.length - 1]) {
							if (var8 >= 0) {
								arg2[var13] = arg0.substring(var7, var8 + 1 - var10);
								var13++;
								if (var13 >= arg2.length) {
									return 0;
								}
								var7 = var8 + 1;
								var8 = -1;
								var6 -= var9;
								var12 = -1;
							} else {
								arg2[var13] = arg0.substring(var7, var18);
								var13++;
								if (var13 >= arg2.length) {
									return 0;
								}
								var7 = var18;
								var8 = -1;
								var6 = var17;
								var12 = -1;
							}
						}
						if (var16 == 45) {
							var8 = var15;
							var9 = var6;
							var10 = 0;
						}
					}
				}
			}
		}
		if (arg0.length() > var7) {
			arg2[var13] = arg0.substring(var7, arg0.length());
			var13++;
		}
		return var13;
	}

	@ObfuscatedName("vm.z(Ljava/lang/String;I[Lvd;B)I")
	public int method12393(String arg0, int arg1, class602[] arg2) {
		int var4 = this.method12398(arg0, new int[] { arg1 }, field7174, arg2);
		int var5 = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.method12390(field7174[var6], arg2);
			if (var7 > var5) {
				var5 = var7;
			}
		}
		return var5;
	}

	@ObfuscatedName("vm.n(Ljava/lang/String;I[Lvd;B)I")
	public int method12394(String arg0, int arg1, class602[] arg2) {
		return this.method12398(arg0, new int[] { arg1 }, field7174, arg2);
	}

	@ObfuscatedName("vm.o(Ljava/lang/String;II[Lvd;I)I")
	public int method12395(String arg0, int arg1, int arg2, class602[] arg3) {
		if (arg2 == 0) {
			arg2 = this.field7175;
		}
		int var5 = this.method12398(arg0, new int[] { arg1 }, field7174, arg3);
		int var6 = (var5 - 1) * arg2;
		return this.field7177 + this.field7176 + var6;
	}

	@ObfuscatedName("vm.q(Ljava/lang/String;III[Lvd;I)Ljava/awt/Point;")
	public Point method12396(String arg0, int arg1, int arg2, int arg3, class602[] arg4) {
		if (arg3 <= 0) {
			return new Point(0, this.field7176 + arg2);
		}
		if (arg3 > arg0.length()) {
			arg3 = arg0.length();
		}
		if (arg2 == 0) {
			arg2 = this.field7175;
		}
		int var6 = this.method12392(arg0, new int[] { arg1 }, field7174, arg4, false);
		int var7 = 0;
		for (int var8 = 0; var8 < var6; var8++) {
			int var9 = field7174[var8].length();
			if (var7 + var9 > arg3 || var6 - 1 == var8 && arg3 == arg0.length()) {
				String var10 = arg0.substring(var7, arg3);
				if (var10.endsWith("<br>")) {
					var10 = "";
					int var10000 = var7 + var9;
					var8++;
				}
				int var12 = this.method12390(var10, arg4);
				int var13 = this.field7176 + arg2 * var8;
				return new Point(var12, var13);
			}
			var7 += var9;
		}
		return null;
	}

	@ObfuscatedName("vm.p(Ljava/lang/String;IIII[Lvd;B)I")
	public int method12410(String arg0, int arg1, int arg2, int arg3, int arg4, class602[] arg5) {
		if (arg2 == 0) {
			arg2 = this.field7175;
		}
		int var7 = this.method12398(arg0, new int[] { arg1 }, field7174, arg5);
		if (var7 == 0) {
			return 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		int var8 = arg4 / arg2;
		if (var8 >= var7) {
			var8 = var7 - 1;
		}
		String var9 = field7174[var8];
		int var10 = 0;
		int var11 = 0;
		int var12;
		for (var12 = 0; var12 < arg3 && var10 < var9.length(); var12 = this.method12390(var9.substring(0, var10), arg5)) {
			var11 = var12;
			var10++;
		}
		if (var10 == var9.length() && var9.endsWith("<br>")) {
			var10 -= 4;
		}
		if (arg3 - var11 < var12 - arg3) {
			var10--;
		}
		for (int var13 = 0; var13 < var8; var13++) {
			var10 += field7174[var13].length();
		}
		return var10;
	}
}
