package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.io.IOException;

@ObfuscatedName("ks")
public class Loading {

	@ObfuscatedName("ks.u")
	public static final int[] field3425 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0 };

	@ObfuscatedName("ks.s")
	public static int field3423 = -1;

	@ObfuscatedName("ks.w")
	public static boolean field3421 = false;

	@ObfuscatedName("ks.i")
	public static int field3424 = -1;

	public Loading() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ta.u(B)V")
	public static void method186() {
		field3421 = true;
		Statics.field6391 = class33.field533;
		Statics.field4814 = class33.field534;
		client.method13897(false);
		Statics.field3420 = null;
		Statics.field3562 = null;
		client.method11307(12);
	}

	@ObfuscatedName("wo.j(I)V")
	public static void method12645() {
		if (Statics.field3420 == null) {
			Statics.field3420 = Statics.method5013();
			Statics.field1208 = Statics.field3420[0];
			Statics.field1931 = class153.method5554();
		}
		if (Statics.field6789 == null) {
			method3460();
		}
		LoadingStage var0 = Statics.field1208;
		int var1 = method1610();
		if (Statics.field1208 == var0) {
			Statics.field2324 = Statics.field1208.field3405.method12206(Statics.field2308);
			if (Statics.field1208.field3406) {
				Statics.field4455 = (Statics.field1208.field3398 - Statics.field1208.field3410) * var1 / 100 + Statics.field1208.field3410;
			}
			if (Statics.field1208.field3409) {
				Statics.field2324 = Statics.field2324 + Statics.field4455 + "%";
			}
		} else if (Statics.field1208 == LoadingStage.field3403) {
			Statics.field6789 = null;
			client.method11307(6);
			if (field3421) {
				field3421 = false;
				class33.method12220(Statics.field6391, Statics.field4814);
			}
		} else {
			Statics.field2324 = var0.field3397.method12206(Statics.field2308);
			if (Statics.field1208.field3409) {
				Statics.field2324 = Statics.field2324 + var0.field3398 + "%";
			}
			Statics.field4455 = var0.field3398;
			if (Statics.field1208.field3406 || var0.field3406) {
				Statics.field1931 = class153.method5554();
			}
		}
		if (Statics.field6789 == null) {
			return;
		}
		Statics.field6789.method4956(Statics.field1931, Statics.field2324, Statics.field4455, Statics.field1208);
		if (Statics.field3422 == null) {
			return;
		}
		for (int var2 = field3423 + 1; var2 < Statics.field3422.length; var2++) {
			if (Statics.field3422[var2].method4981() >= 100 && field3423 == var2 - 1 && client.field8923 != 12 && Statics.field6789.method4954()) {
				try {
					Statics.field3422[var2].method5006();
				} catch (Exception var4) {
					Statics.field3422 = null;
					break;
				}
				Statics.field6789.method4973(Statics.field3422[var2]);
				field3423++;
				if (field3423 >= Statics.field3422.length - 1 && Statics.field3422.length > 1) {
					field3423 = Statics.field7348.method12703() ? 0 : -1;
				}
			}
		}
	}

	@ObfuscatedName("em.a(I)V")
	public static void method3460() {
		if (Statics.field1208 != null) {
			Statics.field6789 = new class305();
			Statics.field6789.method4956(Statics.field1931, Statics.field1208.field3405.method12206(Statics.field2308), Statics.field1208.field3410, Statics.field1208);
			Statics.field2668 = new Thread(Statics.field6789, "");
			Statics.field2668.start();
		}
	}

	@ObfuscatedName("aev.s(ZI)V")
	public static void method15611(boolean arg0) {
		if (Statics.field6789 == null) {
			method3460();
		}
		if (arg0) {
			Statics.field6789.method4969();
		}
	}

	@ObfuscatedName("fx.c(I)I")
	public static int method3587() {
		return Statics.field6789.method4952();
	}

	@ObfuscatedName("fd.m(B)V")
	public static void method3502() {
		if (Statics.field3422 == null) {
			return;
		}
		class310[] var0 = Statics.field3422;
		for (int var1 = 0; var1 < var0.length; var1++) {
			class310 var2 = var0[var1];
			var2.method5006();
		}
	}

	@ObfuscatedName("ji.t(B)I")
	public static int method4789() {
		int var0 = Statics.field1208.field3404;
		if (var0 < Statics.field3420.length - 1) {
			Statics.field1208 = Statics.field3420[var0 + 1];
		}
		return 100;
	}

	@ObfuscatedName("k.l(I)I")
	public static int method1610() {
		if (Statics.field4961.field9669.method15877() == 0) {
			for (int var0 = 0; var0 < client.field8950; var0++) {
				if (client.field8951[var0].method7298() == 's' || client.field8951[var0].method7298() == 'S') {
					Statics.field4961.method15448(Statics.field4961.field9669, 1);
					client.field8912 = true;
					class558.method12023(class628.field7363);
					break;
				}
			}
		}
		if (Statics.field1208 == LoadingStage.field3390) {
			if (Statics.field3562 == null) {
				Statics.field3562 = new class331(Statics.field848, Statics.field1210, class51.field665, class51.field668);
			}
			if (!Statics.field3562.method5587()) {
				return 0;
			}
			client.method11054(0, null, true);
			Statics.field5109 = !class308.method4590();
			Statics.field4761 = client.method7706(Statics.field5109 ? class162.field1700 : class162.field1718, false, 1, true);
			Statics.field1937 = client.method7706(class162.field1719, false, 1, true);
			Statics.field8745 = client.method7706(class162.field1691, false, 1, true);
		}
		if (Statics.field1208 == LoadingStage.field3394) {
			boolean var1 = Statics.field1937.method5662();
			int var2 = Statics.field4456[class162.field1719.method3089()].method14244();
			int var3 = var2 + Statics.field4456[Statics.field5109 ? class162.field1700.method3089() : class162.field1718.method3089()].method14244();
			int var4 = var3 + Statics.field4456[class162.field1691.method3089()].method14244();
			int var5 = var4 + (var1 ? 100 : Statics.field1937.method5634());
			if (var5 != 400) {
				return var5 / 4;
			}
			Statics.field9896 = Statics.field4761.method5622();
			Statics.field1625 = Statics.field1937.method5622();
			class35.method11376(Statics.field4761);
			int var6 = Statics.field4961.field9668.method15859();
			Statics.field7348 = new class631(client.field9163, Statics.field2308, Statics.field1937);
			class633[] var7 = Statics.field7348.method12706(var6);
			if (var7.length == 0) {
				var7 = Statics.field7348.method12706(0);
			}
			class210 var8 = new class210(Statics.field4761, Statics.field8745);
			if (var7.length > 0) {
				Statics.field3422 = new class310[var7.length];
				for (int var9 = 0; var9 < Statics.field3422.length; var9++) {
					Statics.field3422[var9] = new class308(Statics.field7348.method12708(var7[var9].field7396), var7[var9].field7397, var7[var9].field7398, var8);
				}
			}
		}
		if (Statics.field1208 == LoadingStage.field3388) {
			Statics.field6784 = new class292(Statics.field4761, Statics.field8745, class35.method6244());
		}
		if (Statics.field1208 == LoadingStage.field3407) {
			int var10 = Statics.field6784.method4839();
			int var11 = Statics.field6784.method4841();
			if (var10 < var11) {
				return var10 * 100 / var11;
			}
		}
		if (Statics.field1208 == LoadingStage.field3386) {
			if (Statics.field3422 != null && Statics.field3422.length > 0) {
				if (Statics.field3422[0].method4981() < 100) {
					return 0;
				}
				if (Statics.field3422.length > 1 && Statics.field7348.method12703() && Statics.field3422[1].method4981() < 100) {
					return 0;
				}
			}
			Statics.field6784.method4837(client.field8914);
			class35.method2931(Statics.field5187);
			client.method11307(2);
		}
		if (Statics.field1208 == LoadingStage.field3389) {
			Statics.field7387 = client.method7706(class162.field1694, false, 1, false);
			Statics.field7567 = client.method7706(class162.field1708, false, 1, false);
			Statics.field6690 = client.method7706(class162.field1716, false, 1, false);
			Statics.field7435 = client.method7706(class162.field1690, false, 1, true);
			Statics.field2653 = client.method7706(class162.field1689, false, 1, true);
			Statics.field5197 = client.method7706(class162.field1686, false, 1, false);
			Statics.field7343 = client.method7706(class162.field1720, true, 1, false);
			Statics.field9367 = client.method7706(class162.field1692, true, 1, false);
			Statics.field4560 = client.method7706(class162.field1693, false, 1, false);
			Statics.field808 = client.method7706(class162.field1695, true, 1, false);
			Statics.field6435 = client.method7706(class162.field1723, true, 1, false);
			Statics.field3523 = client.method7706(class162.field1696, false, 1, false);
			Statics.field1509 = client.method7706(class162.field1697, false, 1, false);
			Statics.clientScriptsJs5 = client.method7706(class162.field1698, false, 1, true);
			Statics.field3156 = client.method7706(class162.field1688, false, 1, false);
			Statics.field5104 = client.method7706(class162.field1687, false, 1, false);
			Statics.field1565 = client.method7706(class162.field1702, false, 1, true);
			Statics.field6451 = client.method7706(class162.field1703, false, 1, true);
			Statics.field5080 = client.method7706(class162.field1704, false, 1, true);
			Statics.field5130 = client.method7706(class162.field1721, false, 1, true);
			Statics.field3897 = client.method7706(class162.field1706, false, 1, true);
			Statics.field2070 = client.method7706(class162.field1707, false, 1, true);
			Statics.field4229 = client.method7706(class162.field1725, false, 1, true);
			Statics.field4059 = client.method7706(class162.field1709, true, 1, false);
			Statics.field6343 = client.method7706(class162.field1710, false, 1, true);
			Statics.field6712 = client.method7706(class162.field1701, false, 1, true);
			Statics.field7572 = client.method7706(class162.field1712, true, 1, true);
			Statics.field8655 = client.method7706(class162.field1713, false, 1, true);
			Statics.field849 = client.method7706(class162.field1714, true, 1, true);
			Statics.field8734 = client.method7706(class162.field1715, false, 1, true);
			Statics.field4824 = client.method7706(class162.field1705, true, 1, false);
			Statics.field663 = client.method7706(class162.field1711, true, 1, false);
			Statics.field2670 = client.method7706(class162.field1717, true, 1, true);
			Statics.field2117 = client.method7706(class162.field1722, true, 2, false);
		}
		if (Statics.field1208 == LoadingStage.field3392) {
			int var12 = 0;
			for (int var13 = 0; var13 < Statics.field4456.length; var13++) {
				if (Statics.field4456[var13] != null) {
					var12 += Statics.field4456[var13].method14244() * field3425[var13] / 100;
				}
			}
			if (var12 != 100) {
				if (field3424 < 0) {
					field3424 = var12;
				}
				return (var12 - field3424) * 100 / (100 - field3424);
			}
			class35.method8388(Statics.field7387);
			Statics.field6784 = new class292(Statics.field7387, Statics.field8745, class35.method6244());
		}
		if (Statics.field1208 == LoadingStage.field3393) {
			byte[] var14 = Statics.field849.method5635(class491.field5143.field5145);
			if (var14 == null) {
				return 0;
			}
			method3560(var14);
			Statics.method4790();
			client.method11307(10);
		}
		if (Statics.field1208 == LoadingStage.field3391 && Statics.field2137 == null) {
			Statics.field2137 = new class387(Statics.field663);
			class618.method5010(Statics.field2137);
		}
		if (Statics.field1208 == LoadingStage.field3395) {
			int var15 = class326.method6562();
			if (var15 < 100) {
				return var15;
			}
			method7678(Statics.field849.method5635(class491.field5144.field5145));
			Statics.field4825 = new class492(Statics.field849);
			Statics.field5009 = Statics.field4825.field5146;
			Statics.field5010 = Statics.field4825.field5161;
			if (Statics.field4825.field5166 != -1 && Statics.field4825.field5167 != -1) {
				client.field9067 = Statics.field4825.field5166;
				client.field9068 = Statics.field4825.field5167;
			}
			Statics.field3226 = new class493(Statics.field849);
			Statics.field1736 = new class487(Statics.field849);
			Statics.field2190 = new class489(Statics.field849);
		}
		if (Statics.field1208 == LoadingStage.field3396) {
			if (Statics.field4825.field5156 != -1 && !Statics.field4560.method5629(Statics.field4825.field5156, 0)) {
				return 99;
			}
			Statics.field8465 = new class123(Statics.field7572, Statics.field808, Statics.field6435);
			Statics.field4464 = new class614(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field3769 = new class440(client.field9163, Statics.field2308, Statics.field7435, Statics.field3226);
			Statics.field3770 = new class600(client.field9163, Statics.field2308, Statics.field7435, Statics.field7387);
			Statics.field1244 = new class578(client.field9163, Statics.field2308, Statics.field6451);
			Statics.field3615 = new class484(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field4450 = new class563(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field5037 = new class442(client.field9163, Statics.field2308, Statics.field7435, Statics.field7387);
			Statics.field6705 = new class417(client.field9163, Statics.field2308, Statics.field7435, Statics.field7387);
			Statics.field7650 = new class205(client.field9163, Statics.field2308, Statics.field7435, Statics.field4560);
			Statics.field495 = new class623(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field785 = new class606(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field10355 = new class541(client.field9163, Statics.field2308, true, Statics.field1565, Statics.field4560);
			client.field8980.method6159(Statics.field10355);
			Statics.field8656.method6038(new class541(client.field9163, Statics.field2308, true, Statics.field1565, Statics.field4560));
			Statics.field8499 = new class444(client.field9163, Statics.field2308, Statics.field7435, Statics.field7387);
			Statics.field850 = new class609(client.field9163, Statics.field2308, Statics.field7435, Statics.field7387);
			Statics.field3774 = new class612(client.field9163, Statics.field2308, true, Statics.field5080, Statics.field4560);
			Statics.field3492 = new class594(client.field9163, Statics.field2308, true, Statics.field4464, Statics.field5130, Statics.field4560);
			Statics.field4959 = new class480(client.field9163, Statics.field2308, Statics.field7435, true);
			Statics.field566 = new class510(client.field9163, Statics.field2308, Statics.field3897, Statics.field7567, Statics.field6690);
			Statics.field4678 = new class419(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field6360 = new class187(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field4213 = new class506(client.field9163, Statics.field2308, Statics.field2070, Statics.field4560);
			Statics.field4214 = new class601(client.field9163, Statics.field2308, Statics.field7435, true);
			Statics.field8514 = new class621(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field8455 = new class598(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field4645 = new class432(client.field9163, Statics.field2308, Statics.field4229);
			Statics.field6667 = new class294(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field1510 = new class571(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field7196 = new class529(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field7390 = new class626(client.field9163, Statics.field2308, Statics.field7435);
			Statics.field1202 = new class475(client.field9163, Statics.field2308, Statics.field7435);
			Statics.method3529(Statics.field2653, Statics.field4560, Statics.field7387, Statics.field8745);
			class272.method8409(Statics.field8734);
			Statics.field3262 = new class341(Statics.field2308, Statics.field6343, Statics.field6712);
			Statics.field3779 = new class584(Statics.field2308, Statics.field6343, Statics.field6712, new class271());
			Statics.field2669 = new class49();
			client.method13901();
			class553.method6490(Statics.field566);
			class466.method12208(Statics.field8655);
			class366.method12289(Statics.field4560, Statics.field8465);
			class177 var16 = new class177(Statics.field3523.method5645("huffman", ""));
			class178.method15896(var16);
			Statics.field8481 = Statics.method4777();
			Statics.field2305 = new class817(true);
		}
		if (Statics.field1208 == LoadingStage.field3387) {
			int var17 = class35.method12092(Statics.field7387) + Statics.field6784.method4840(true);
			int var18 = class35.method1589() + Statics.field6784.method4841();
			if (var17 < var18) {
				return var17 * 100 / var18;
			}
		}
		if (Statics.field1208 == LoadingStage.field3408) {
			class408.method7080(Statics.field4059, Statics.field3615, Statics.field4450, client.field8980.method6103(), Statics.field8499, Statics.field850, Statics.field2669);
		}
		if (Statics.field1208 == LoadingStage.field3399) {
			Statics.field6666 = new int[Statics.field8455.field7160];
			Statics.field2210 = new boolean[Statics.field8455.field7160];
			Statics.field3498 = new String[Statics.field8514.field7322];
			for (int var19 = 0; var19 < Statics.field8455.field7160; var19++) {
				if (Statics.field8455.method12359(var19).field7156 == 0) {
					Statics.field2210[var19] = true;
					client.field9155++;
				}
				Statics.field6666[var19] = -1;
			}
			method2862();
			Statics.field7343.method5636(false, true);
			Statics.field9367.method5636(true, true);
			Statics.field7387.method5636(true, true);
			Statics.field8745.method5636(true, true);
			Statics.field3523.method5636(true, true);
			client.field8938 = true;
		}
		if (Statics.field1208 == LoadingStage.field3400) {
			if (!class165.openInterface(Statics.field4825.field5162, null)) {
				return 0;
			}
			boolean var20 = true;
			for (int var21 = 0; var21 < Statics.interfaces[Statics.field4825.field5162].components.length; var21++) {
				class165 var22 = Statics.interfaces[Statics.field4825.field5162].components[var21];
				if (var22.type == 5 && var22.field1797 != -1 && !Statics.field7387.method5629(var22.field1797, 0)) {
					var20 = false;
				}
			}
			if (!var20) {
				return 0;
			}
		}
		if (Statics.field1208 == LoadingStage.field3401) {
			client.method12035(true);
		}
		if (Statics.field1208 == LoadingStage.field3402) {
			Statics.field6789.method4975();
			try {
				Statics.field2668.join();
			} catch (InterruptedException var24) {
				return 0;
			}
			Statics.field6789 = null;
			Statics.field2668 = null;
			Statics.field4761 = null;
			Statics.field1937 = null;
			Statics.field7348 = null;
			Statics.field3422 = null;
			class308.method6065();
			client.field8911 = Statics.field4961.field9669.method15877() == 1;
			Statics.field4961.method15448(Statics.field4961.field9669, 1);
			if (client.field8911) {
				Statics.field4961.method15448(Statics.field4961.field9670, 0);
			} else if (Statics.field4961.field9670.field9844 && Statics.field2305.field9703 < 512 && Statics.field2305.field9703 != 0) {
				Statics.field4961.method15448(Statics.field4961.field9670, 0);
			}
			Statics.method1245();
			if (client.field8911) {
				Statics.method5600(0, false);
				if (!client.field8912) {
					class558.method12023(class628.field7356);
				}
			} else {
				Statics.method5600(Statics.field4961.field9670.method15781(), false);
				if (Statics.field4961.field9670.method15781() == 0) {
					class558.method12023(class628.field7364);
				}
			}
			client.method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
			Statics.field6784.method4837(client.field8914);
			class35.method2931(Statics.field5187);
			class35.method15812(Statics.field5187, Statics.field7387);
			class42.method3288(Statics.field8538);
		}
		return method4789();
	}

	@ObfuscatedName("pd.f([BB)V")
	public static void method7678(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		while (true) {
			int var2 = var1.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int[] var3 = Statics.field9860 = new int[6];
				var3[0] = var1.g2();
				var3[1] = var1.g2();
				var3[2] = var1.g2();
				var3[3] = var1.g2();
				var3[4] = var1.g2();
				var3[5] = var1.g2();
			}
		}
	}

	@ObfuscatedName("fn.d([BI)V")
	public static void method3560(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		while (true) {
			int var2 = var1.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int var3 = var1.g2();
				if (class395.field4205 == -1) {
					class395.field4205 = var3;
				}
			}
		}
	}

	@ObfuscatedName("dn.z(I)V")
	public static void method2862() {
		class576 var0 = null;
		try {
			var0 = GameShell.method4031("2", client.field9163.field6404, false);
			byte[] var1 = new byte[(int) var0.method12077()];
			int var3;
			for (int var2 = 0; var2 < var1.length; var2 += var3) {
				var3 = var0.method12078(var1, var2, var1.length - var2);
				if (var3 == -1) {
					throw new IOException();
				}
			}
			method3665(new Packet(var1));
		} catch (Exception var7) {
		}
		try {
			if (var0 != null) {
				var0.method12076();
			}
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("fi.n(Laet;I)V")
	public static void method3665(Packet arg0) {
		if (arg0.data.length - arg0.pos < 1) {
			return;
		}
		int var1 = arg0.g1();
		if (var1 < 0 || var1 > 1 || arg0.data.length - arg0.pos < 2) {
			return;
		}
		int var2 = arg0.g2();
		if (arg0.data.length - arg0.pos < var2 * 6) {
			return;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = arg0.g2();
			int var5 = arg0.g4s();
			if (var4 < Statics.field6666.length && Statics.field2210[var4] && (Statics.field8455.method12359(var4).field7153 != '1' || var5 >= -1 && var5 <= 1)) {
				Statics.field6666[var4] = var5;
			}
		}
	}

	@ObfuscatedName("iu.o(I)I")
	public static int method4671() {
		return Statics.field1625;
	}

	@ObfuscatedName("mv.q(I)I")
	public static int method6307() {
		return Statics.field9896;
	}

	@ObfuscatedName("oq.p(I)V")
	public static void method7247() {
		if (Statics.field6789 != null) {
			Statics.field6789.method4975();
		}
		if (Statics.field2668 == null) {
			return;
		}
		while (true) {
			try {
				Statics.field2668.join();
				break;
			} catch (InterruptedException var1) {
			}
		}
	}
}
