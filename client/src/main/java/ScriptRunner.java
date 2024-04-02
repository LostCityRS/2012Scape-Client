
import deob.ObfuscatedName;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.ArrayList;

@ObfuscatedName("rb")
public final class ScriptRunner {

	@ObfuscatedName("rb.a")
	public static int field5201 = 0;

	@ObfuscatedName("rb.s")
	public static int[] field5200 = new int[3];

	@ObfuscatedName("rb.c")
	public static WeightedCache field5207 = new WeightedCache(4);

	@ObfuscatedName("rb.m")
	public static Vector3[] field5204 = new Vector3[2];

	@ObfuscatedName("rb.t")
	public static boolean field5205 = false;

	@ObfuscatedName("rb.l")
	public static String field5202 = null;

	@ObfuscatedName("rb.f")
	public static ArrayList field5208 = new ArrayList();

	@ObfuscatedName("rb.d")
	public static int field5206 = 0;

	@ObfuscatedName("rb.z")
	public static int field5209 = 0;

	public ScriptRunner() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qr.u(I)Lrn;")
	public static final ClientScriptState method8088() {
		if (field5206 == field5208.size()) {
			field5208.add(new ClientScriptState());
		}
		ClientScriptState var0 = (ClientScriptState) field5208.get(field5206);
		field5206++;
		return var0;
	}

	@ObfuscatedName("fp.j(I)V")
	public static final void method3547() {
		field5206--;
	}

	@ObfuscatedName("rw.a(Lady;I)V")
	public static void method8605(HookRequest arg0) {
		method1670(arg0, 200000);
	}

	@ObfuscatedName("tn.s(I[II)V")
	public static void method11505(int arg0, int[] arg1) {
		if (arg0 != -1 && ComType.method6404(arg0, arg1)) {
			ComType[] var2 = Statics.field1756[arg0].field1732;
			method11374(var2);
		}
	}

	@ObfuscatedName("tw.c([Lew;I)V")
	public static void method11374(ComType[] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			ComType var2 = arg0[var1];
			if (var2.field1862 != null) {
				HookRequest var3 = new HookRequest();
				var3.field9609 = var2;
				var3.field9613 = var2.field1862;
				method1670(var3, 2000000);
			}
		}
	}

	@ObfuscatedName("e.m(Lady;IB)V")
	public static void method1670(HookRequest arg0, int arg1) {
		Object[] var2 = arg0.field9613;
		int var3 = (Integer) var2[0];
		ClientScript var4 = ClientScriptHelpers.method4892(var3);
		if (var4 == null) {
			return;
		}
		ClientScriptState var5 = method8088();
		var5.field5235 = new int[var4.field10379];
		int var6 = 0;
		var5.field5211 = new String[var4.field10387];
		int var7 = 0;
		var5.field5212 = new long[var4.field10384];
		int var8 = 0;
		for (int var9 = 1; var9 < var2.length; var9++) {
			if (var2[var9] instanceof Integer) {
				int var10 = (Integer) var2[var9];
				if (var10 == -2147483647) {
					var10 = arg0.field9610;
				}
				if (var10 == -2147483646) {
					var10 = arg0.field9617;
				}
				if (var10 == -2147483645) {
					var10 = arg0.field9609 == null ? -1 : arg0.field9609.field1764;
				}
				if (var10 == -2147483644) {
					var10 = arg0.field9612;
				}
				if (var10 == -2147483643) {
					var10 = arg0.field9609 == null ? -1 : arg0.field9609.field1765;
				}
				if (var10 == -2147483642) {
					var10 = arg0.field9607 == null ? -1 : arg0.field9607.field1764;
				}
				if (var10 == -2147483641) {
					var10 = arg0.field9607 == null ? -1 : arg0.field9607.field1765;
				}
				if (var10 == -2147483640) {
					var10 = arg0.field9611;
				}
				if (var10 == -2147483639) {
					var10 = arg0.field9614;
				}
				var5.field5235[var6++] = var10;
			} else if (var2[var9] instanceof String) {
				String var11 = (String) var2[var9];
				if (var11.equals("event_opbase")) {
					var11 = arg0.field9616;
				}
				var5.field5211[var7++] = var11;
			} else if (var2[var9] instanceof Long) {
				long var12 = (Long) var2[var9];
				var5.field5212[var8++] = var12;
			}
		}
		var5.field5231 = arg0.field9615;
		method6355(var4, arg1, var5);
	}

	@ObfuscatedName("dv.t(Lwy;IILaay;IB)V")
	public static void method2842(ClientTriggerType arg0, int arg1, int arg2, PathingEntity arg3, int arg4) {
		ClientScriptState var5 = method8088();
		var5.field5228 = arg3;
		var5.field5232 = arg4;
		method2826(arg0, arg1, arg2, var5);
		var5.field5228 = null;
		var5.field5232 = -1;
	}

	@ObfuscatedName("ae.l(Lwy;IILca;I)V")
	public static void method1972(ClientTriggerType arg0, int arg1, int arg2, Location arg3) {
		ClientScriptState var4 = method8088();
		var4.field5229 = arg3;
		method2826(arg0, arg1, arg2, var4);
		var4.field5229 = null;
	}

	@ObfuscatedName("ob.f(Lwy;IILrq;Lali;I)V")
	public static void method7276(ClientTriggerType arg0, int arg1, int arg2, ObjReference arg3, ObjStackEntity arg4) {
		ClientScriptState var5 = method8088();
		var5.field5234 = arg4;
		method2826(arg0, arg1, arg2, var5);
		var5.field5234 = null;
	}

	@ObfuscatedName("n.d(Lwy;III)V")
	public static void method1372(ClientTriggerType arg0, int arg1, int arg2) {
		ClientScriptState var3 = method8088();
		method2826(arg0, arg1, arg2, var3);
	}

	@ObfuscatedName("dr.z(Lwy;IILrn;I)V")
	public static void method2826(ClientTriggerType arg0, int arg1, int arg2, ClientScriptState arg3) {
		ClientScript var4 = ClientScriptHelpers.method15968(arg0, arg1, arg2);
		if (var4 == null) {
			method3547();
			return;
		}
		arg3.field5235 = new int[var4.field10379];
		arg3.field5211 = new Object[var4.field10387];
		if (ClientTriggerType.field7304 == var4.field10388 || ClientTriggerType.field7311 == var4.field10388 || ClientTriggerType.field7319 == var4.field10388) {
			int var5 = 0;
			int var6 = 0;
			if (Statics.field4960 != null) {
				var5 = Statics.field4960.field1776;
				var6 = Statics.field4960.field1777;
			}
			arg3.field5235[0] = Statics.field7136.method7254() - var5;
			arg3.field5235[1] = Statics.field7136.method7255() - var6;
		} else if (ClientTriggerType.field7300 == var4.field10388) {
			arg3.field5235[0] = arg3.field5232;
		}
		method6355(var4, 200000, arg3);
	}

	@ObfuscatedName("mk.o(Lajg;ILrn;I)V")
	public static void method6355(ClientScript arg0, int arg1, ClientScriptState arg2) {
		arg2.field5216 = 0;
		arg2.field5230 = 0;
		arg2.field5236 = -1;
		arg2.field5218 = arg0;
		arg2.field5214 = arg2.field5218.field10378;
		arg2.field5227 = arg2.field5218.field10385;
		ClientScriptCommand var3 = null;
		arg2.field5221 = 0;
		try {
			field5201 = 0;
			while (true) {
				field5201++;
				if (field5201 > arg1) {
					throw new RuntimeException("");
				}
				var3 = arg2.field5214[++arg2.field5236];
				if (field5205 && (field5202 == null || arg2.field5218.field10377 != null && arg2.field5218.field10377.indexOf(field5202) != -1)) {
					System.out.println(arg2.field5218.field10377 + ": " + var3);
				}
				if (arg2.field5227[arg2.field5236] == 1) {
					arg2.field5238 = true;
				} else {
					arg2.field5238 = false;
				}
				if (ClientScriptCommand.field5281 == var3 && arg2.field5221 == 0) {
					return;
				}
				method6241(var3, arg2);
			}
		} catch (Exception var10) {
			StringBuilder var5 = new StringBuilder(30);
			var5.append("").append(arg2.field5218.field4228).append(" ");
			for (int var6 = arg2.field5221 - 1; var6 >= 0; var6--) {
				var5.append("").append(arg2.field5225[var6].field5191.field4228).append(" ");
			}
			var5.append("").append(var3.field6283);
			JagException.method16252(var5.toString(), var10);
		} finally {
			method3547();
		}
	}

	@ObfuscatedName("n.q(Lej;IIIZLrn;I)V")
	public static void method1373(IfType arg0, int arg1, int arg2, int arg3, boolean arg4, ClientScriptState arg5) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		ComType var6 = arg0.field1732[arg1];
		if (var6.field1915 == null) {
			var6.field1915 = new ComType[arg3 + 1];
			var6.field1918 = var6.field1915;
		}
		if (var6.field1915.length <= arg3) {
			if (var6.field1918 == var6.field1915) {
				ComType[] var7 = new ComType[arg3 + 1];
				for (int var8 = 0; var8 < var6.field1915.length; var8++) {
					var7[var8] = var6.field1915[var8];
				}
				var6.field1915 = var6.field1918 = var7;
			} else {
				ComType[] var9 = new ComType[arg3 + 1];
				ComType[] var10 = new ComType[arg3 + 1];
				for (int var11 = 0; var11 < var6.field1915.length; var11++) {
					var9[var11] = var6.field1915[var11];
					var10[var11] = var6.field1918[var11];
				}
				var6.field1915 = var9;
				var6.field1918 = var10;
			}
		}
		if (arg3 > 0 && var6.field1915[arg3 - 1] == null) {
			throw new RuntimeException("" + (arg3 - 1));
		}
		ComType var12 = new ComType();
		var12.field1766 = arg2;
		var12.field1886 = var12.field1764 = var6.field1764;
		var12.field1765 = arg3;
		var6.field1915[arg3] = var12;
		if (var6.field1918 != var6.field1915) {
			var6.field1918[arg3] = var12;
		}
		ActiveComponent var13;
		if (arg4) {
			var13 = arg5.field5210;
		} else {
			var13 = arg5.field5223;
		}
		var13.field5239 = arg0;
		var13.field5240 = var12;
		client.method12939(var6);
	}

	@ObfuscatedName("df.p(Lej;Lew;I)V")
	public static void method2840(IfType arg0, ComType arg1) {
		if (arg1 == null) {
			return;
		}
		if (arg1.field1765 == -1) {
			ComType[] var5 = arg0.method3105();
			int var6;
			for (var6 = 0; var6 < var5.length && var5[var6] != arg1; var6++) {
			}
			if (var6 >= var5.length) {
				return;
			}
			ArrayUtil.method11338(var5, var6 + 1, var5, var6, var5.length - var6 - 1);
			var5[var5.length - 1] = arg1;
			return;
		}
		ComType var2 = arg0.method3108(arg1.field1886);
		if (var2 == null) {
			return;
		}
		if (var2.field1918 == var2.field1915) {
			var2.field1918 = new ComType[var2.field1915.length];
			var2.field1918[var2.field1918.length - 1] = arg1;
			ArrayUtil.method11338(var2.field1915, 0, var2.field1918, 0, arg1.field1765);
			ArrayUtil.method11338(var2.field1915, arg1.field1765 + 1, var2.field1918, arg1.field1765, var2.field1915.length - arg1.field1765 - 1);
			return;
		}
		int var3 = 0;
		ComType[] var4 = var2.field1918;
		while (var3 < var4.length && var4[var3] != arg1) {
			var3++;
		}
		if (var3 >= var4.length) {
			return;
		}
		ArrayUtil.method11338(var4, var3 + 1, var4, var3, var4.length - var3 - 1);
		var4[var2.field1918.length - 1] = arg1;
	}

	@ObfuscatedName("agh.w(Lej;Lew;I)V")
	public static void method15937(IfType arg0, ComType arg1) {
		if (arg1 == null) {
			return;
		}
		if (arg1.field1765 == -1) {
			ComType[] var5 = arg0.method3105();
			int var6;
			for (var6 = 0; var6 < var5.length && var5[var6] != arg1; var6++) {
			}
			if (var6 >= var5.length) {
				return;
			}
			ArrayUtil.method11338(var5, 0, var5, 1, var6);
			var5[0] = arg1;
			return;
		}
		ComType var2 = arg0.field1732[arg1.field1886 & 0xFFFF];
		if (var2 == null) {
			return;
		}
		if (var2.field1918 == var2.field1915) {
			var2.field1918 = new ComType[var2.field1915.length];
			var2.field1918[0] = arg1;
			ArrayUtil.method11338(var2.field1915, 0, var2.field1918, 1, arg1.field1765);
			ArrayUtil.method11338(var2.field1915, arg1.field1765 + 1, var2.field1918, arg1.field1765 + 1, var2.field1915.length - arg1.field1765 - 1);
			return;
		}
		int var3 = 0;
		ComType[] var4 = var2.field1918;
		while (var3 < var4.length && var4[var3] != arg1) {
			var3++;
		}
		if (var3 >= var4.length) {
			return;
		}
		ArrayUtil.method11338(var4, 0, var4, 1, var3);
		var4[0] = arg1;
	}

	@ObfuscatedName("aaq.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V")
	public static void method14095(String arg0, String arg1, String arg2, boolean arg3, boolean arg4) {
		ServerConnection var5 = client.method4104();
		if (var5.method1927() == null) {
			return;
		}
		ClientMessage var6 = ClientMessage.method14781(ClientProt.field2860, var5.field834);
		var6.field9467.method15287(Statics.method1724(arg0) + Statics.method1724(arg1) + Statics.method1724(arg2) + 1);
		var6.field9467.method15228(arg0);
		var6.field9467.method15228(arg1);
		var6.field9467.method15228(arg2);
		int var7 = 0;
		if (arg3) {
			var7 |= 0x1;
		}
		if (arg4) {
			var7 |= 0x2;
		}
		var6.field9467.method15308(var7);
		var5.method1913(var6);
	}

	@ObfuscatedName("ck.x(Lajs;Lrn;I)V")
	public static final void method2473(MiniMenuEntry arg0, ClientScriptState arg1) {
		arg1.field5215[++arg1.field5216 - 1] = MiniMenu.method11220(arg0);
		arg1.field5222[++arg1.field5230 - 1] = Statics.method1246(arg0);
		arg1.field5222[++arg1.field5230 - 1] = MiniMenu.method3629(arg0);
		arg1.field5222[++arg1.field5230 - 1] = MiniMenu.method6256(arg0);
	}

	@ObfuscatedName("ml.i(Lsd;Lrn;I)V")
	public static final void method6241(ClientScriptCommand arg0, ClientScriptState arg1) throws CameraException {
		switch(arg0.field6283) {
			case 0:
				method4561(arg1);
				return;
			case 1:
				method1559(arg1);
				return;
			case 2:
				method6789(arg1);
				return;
			case 3:
				method6337(arg1);
				return;
			case 4:
				Statics.method1954(arg1);
				return;
			case 5:
				method2810(arg1);
				return;
			case 6:
				method1620(arg1);
				return;
			case 7:
				Statics.method2823(arg1);
				return;
			case 8:
				method2887(arg1);
				return;
			case 9:
				method4572(arg1);
				return;
			case 10:
				method3080(arg1);
				return;
			case 11:
				method6348(arg1);
				return;
			case 12:
				method4696(arg1);
				return;
			case 13:
				method15920(arg1);
				return;
			case 14:
				method1678(arg1);
				return;
			case 15:
				method6310(arg1);
				return;
			case 16:
				method15676(arg1);
				return;
			case 17:
				method6819(arg1);
				return;
			case 18:
				method4751(arg1);
				return;
			case 19:
				method7729(arg1);
				return;
			case 20:
				method11158(arg1);
				return;
			case 21:
				method15216(arg1);
				return;
			case 22:
				method3952(arg1);
				return;
			case 23:
				method6977(arg1);
				return;
			case 24:
				method3968(arg1);
				return;
			case 25:
				Statics.method12748(arg1);
				return;
			case 26:
				method12344(arg1);
				return;
			case 27:
				Statics.method7981(arg1);
				return;
			case 28:
				method11080(arg1);
				return;
			case 29:
				Statics.method12369(arg1);
				return;
			case 30:
				method12726(arg1);
				return;
			case 31:
				Statics.method7676(arg1);
				return;
			case 32:
				Statics.method4729(arg1);
				return;
			case 33:
				method3508(arg1);
				return;
			case 34:
				method1247(arg1);
				return;
			case 35:
				Statics.method7693(arg1);
				return;
			case 36:
				method1561(arg1);
				return;
			case 37:
				method6580(arg1);
				return;
			case 38:
				method1375(arg1);
				return;
			case 39:
				method5788(arg1);
				return;
			case 40:
				method11865(arg1);
				return;
			case 41:
				method6314(arg1);
				return;
			case 42:
				method12651(arg1);
				return;
			case 43:
				method7896(arg1);
				return;
			case 44:
				method2584(arg1);
				return;
			case 45:
				method7279(arg1);
				return;
			case 46:
				method12115(arg1);
				return;
			case 47:
				method8273(arg1);
				return;
			case 48:
				method7382(arg1);
				return;
			case 49:
				method4611(arg1);
				return;
			case 50:
				method12691(arg1);
				return;
			case 51:
				method2811(arg1);
				return;
			case 52:
				method6022(arg1);
				return;
			case 53:
				method2022(arg1);
				return;
			case 54:
				method2846(arg1);
				return;
			case 55:
				method4566(arg1);
				return;
			case 56:
				method5588(arg1);
				return;
			case 57:
				method8632(arg1);
				return;
			case 58:
				method3086(arg1);
				return;
			case 59:
				method1396(arg1);
				return;
			case 60:
				method2863(arg1);
				return;
			case 61:
				method7990(arg1);
				return;
			case 62:
				method13910(arg1);
				return;
			case 63:
				Statics.method3585(arg1);
				return;
			case 64:
				method3214(arg1);
				return;
			case 65:
				method6477(arg1);
				return;
			case 66:
				method12503(arg1);
				return;
			case 67:
				method15675(arg1);
				return;
			case 68:
				method6079(arg1);
				return;
			case 69:
				method4559(arg1);
				return;
			case 70:
				method7812(arg1);
				return;
			case 71:
				method13879(arg1);
				return;
			case 72:
				method5559(arg1);
				return;
			case 73:
				method7278(arg1);
				return;
			case 74:
				method3212(arg1);
				return;
			case 75:
				method8593(arg1);
				return;
			case 76:
				method1590(arg1);
				return;
			case 77:
				method6077(arg1);
				return;
			case 78:
				method6883(arg1);
				return;
			case 79:
				class500.method12290(arg1);
				return;
			case 80:
				method15856(arg1);
				return;
			case 81:
				method12345(arg1);
				return;
			case 82:
				method1772(arg1);
				return;
			case 83:
				method4726(arg1);
				return;
			case 84:
				method7077(arg1);
				return;
			case 85:
				method5791(arg1);
				return;
			case 86:
				method11328(arg1);
				return;
			case 87:
				method13888(arg1);
				return;
			case 88:
				class500.method4578(arg1);
				return;
			case 89:
				method3841(arg1);
				return;
			case 90:
				method2583(arg1);
				return;
			case 91:
				method7721(arg1);
				return;
			case 92:
				method3476(arg1);
				return;
			case 93:
				method1684(false, arg1);
				return;
			case 94:
				method1908(arg1);
				return;
			case 95:
				method15146(arg1);
				return;
			case 96:
				method11872(arg1);
				return;
			case 97:
				method11142(arg1);
				return;
			case 98:
				class500.method8606(arg1);
				return;
			case 99:
				method6851(arg1);
				return;
			case 100:
				method3632(arg1);
				return;
			case 101:
				method11688(arg1);
				return;
			case 102:
				method1806(arg1);
				return;
			case 103:
				method3570(arg1);
				return;
			case 104:
				method4598(arg1);
				return;
			case 105:
				method1699(arg1);
				return;
			case 106:
				method4556(arg1);
				return;
			case 107:
				method5616(arg1);
				return;
			case 108:
				Statics.method6035(arg1);
				return;
			case 109:
				method11155(arg1);
				return;
			case 110:
				method7372(arg1);
				return;
			case 111:
				method8081(arg1);
				return;
			case 112:
				method5922(arg1);
				return;
			case 113:
				method6850(arg1);
				return;
			case 114:
				method11907(arg1);
				return;
			case 115:
				method8030(arg1);
				return;
			case 116:
				method12505(arg1);
				return;
			case 117:
				method3215(arg1);
				return;
			case 118:
				method4106(arg1);
				return;
			case 119:
				method3301(arg1);
				return;
			case 120:
				method3528(arg1);
				return;
			case 121:
				method11166(arg1);
				return;
			case 122:
				method7178(arg1);
				return;
			case 123:
				Statics.method7744(arg1);
				return;
			case 124:
				method8604(arg1);
				return;
			case 125:
				method4737(arg1);
				return;
			case 126:
				method3507(arg1);
				return;
			case 127:
				method12384(arg1);
				return;
			case 128:
				method5709(arg1);
				return;
			case 129:
				method1602(arg1);
				return;
			case 130:
				method14120(arg1);
				return;
			case 131:
				method7969(arg1);
				return;
			case 132:
				class500.method12348(arg1);
				return;
			case 133:
				method8648(arg1);
				return;
			case 134:
				method1328(arg1);
				return;
			case 135:
				method6852(arg1);
				return;
			case 136:
				method3525(arg1);
				return;
			case 137:
				class500.method5926(arg1);
				return;
			case 138:
				method2814(arg1);
				return;
			case 139:
				Statics.method12909(arg1);
				return;
			case 140:
				method12182(arg1);
				return;
			case 141:
				method1961(arg1);
				return;
			case 142:
				method1369(arg1);
				return;
			case 143:
				Statics.method2843(arg1);
				return;
			case 144:
				method12940(arg1);
				return;
			case 145:
				method6255(arg1);
				return;
			case 146:
				method7395(arg1);
				return;
			case 147:
				Statics.method4697(arg1);
				return;
			case 148:
				class500.method1982(arg1);
				return;
			case 149:
				method4005(arg1);
				return;
			case 150:
				method1809(arg1);
				return;
			case 151:
				method13863(arg1);
				return;
			case 152:
				method3221(arg1);
				return;
			case 153:
				method4032(arg1);
				return;
			case 154:
				method11948(arg1);
				return;
			case 155:
				Statics.method7879(arg1);
				return;
			case 156:
				method1959(arg1);
				return;
			case 157:
				method4563(arg1);
				return;
			case 158:
				method4874(arg1);
				return;
			case 159:
				method1220(arg1);
				return;
			case 160:
				method2469(arg1);
				return;
			case 161:
				method4616(arg1);
				return;
			case 162:
				method7728(arg1);
				return;
			case 163:
				method13887(arg1);
				return;
			case 164:
				method7162(arg1);
				return;
			case 165:
				method14716(arg1);
				return;
			case 166:
				Statics.method4711(arg1);
				return;
			case 167:
				method5790(arg1);
				return;
			case 168:
				method8093(arg1);
				return;
			case 169:
				method12877(arg1);
				return;
			case 170:
				class500.method11880(arg1);
				return;
			case 171:
				method4605(arg1);
				return;
			case 172:
				method12158(arg1);
				return;
			case 173:
				method6080(arg1);
				return;
			case 174:
				method2866(arg1);
				return;
			case 175:
				method7215(arg1);
				return;
			case 176:
				method3067(arg1);
				return;
			case 177:
				method14048(arg1);
				return;
			case 178:
				method6030(arg1);
				return;
			case 179:
				method5923(arg1);
				return;
			case 180:
				Statics.method4654(arg1);
				return;
			case 181:
				Statics.method3571(arg1);
				return;
			case 182:
				Statics.method2426(arg1);
				return;
			case 183:
				method11056(arg1);
				return;
			case 184:
				Statics.method3542(arg1);
				return;
			case 185:
				method6345(arg1);
				return;
			case 186:
				method8270(arg1);
				return;
			case 187:
				Statics.method3622(arg1);
				return;
			case 188:
				Statics.method4615(arg1);
				return;
			case 189:
				method6063(arg1);
				return;
			case 190:
				method1701(arg1);
				return;
			case 191:
				Statics.method12702(arg1);
				return;
			case 192:
				method5968(arg1);
				return;
			case 193:
				method7072(arg1);
				return;
			case 194:
				method3644(arg1);
				return;
			case 195:
				method4582(arg1);
				return;
			case 196:
				method2493(arg1);
				return;
			case 197:
				Statics.method2894(arg1);
				return;
			case 198:
				method1683(arg1);
				return;
			case 199:
				method6488(arg1);
				return;
			case 200:
				Statics.method5827(arg1);
				return;
			case 201:
				method6028(arg1);
				return;
			case 202:
				method2555(arg1);
				return;
			case 203:
				method1836(arg1);
				return;
			case 204:
				method4632(arg1);
				return;
			case 205:
				method6021(arg1);
				return;
			case 206:
				Statics.method8398(arg1);
				return;
			case 207:
				method15179(arg1);
				return;
			case 208:
				method5561(arg1);
				return;
			case 209:
				method883(arg1);
				return;
			case 210:
				method8348(arg1);
				return;
			case 211:
				method6827(arg1);
				return;
			case 212:
				method7347(arg1);
				return;
			case 213:
				method2838(arg1);
				return;
			case 214:
				method8031(arg1);
				return;
			case 215:
				method15810(arg1);
				return;
			case 216:
				method11114(arg1);
				return;
			case 217:
				method3940(arg1);
				return;
			case 218:
				method4035(arg1);
				return;
			case 219:
				Statics.method6876(arg1);
				return;
			case 220:
				Statics.method8728(arg1);
				return;
			case 221:
				method3906(arg1);
				return;
			case 222:
				method14924(arg1);
				return;
			case 223:
				method8300(arg1);
				return;
			case 224:
				class500.method3220(arg1);
				return;
			case 225:
				method1953(arg1);
				return;
			case 226:
				method4639(arg1);
				return;
			case 227:
				method15442(arg1);
				return;
			case 228:
				Statics.method16476(arg1);
				return;
			case 229:
				method13880(arg1);
				return;
			case 230:
				method14132(arg1);
				return;
			case 231:
				method7980(arg1);
				return;
			case 232:
				method7321(arg1);
				return;
			case 233:
				method2538(arg1);
				return;
			case 234:
				method2490(arg1);
				return;
			case 235:
				method3663(arg1);
				return;
			case 236:
				method4770(arg1);
				return;
			case 237:
				method2889(arg1);
				return;
			case 238:
				method1418(arg1);
				return;
			case 239:
				Statics.method7975(arg1);
				return;
			case 240:
				method5566(arg1);
				return;
			case 241:
				method1344(arg1);
				return;
			case 242:
				method16886(arg1);
				return;
			case 243:
				method3677(arg1);
				return;
			case 244:
				method6083(arg1);
				return;
			case 245:
				method7978(arg1);
				return;
			case 246:
				method5828(arg1);
				return;
			case 247:
				method3454(arg1);
				return;
			case 248:
				method6027(arg1);
				return;
			case 249:
				method13864(arg1);
				return;
			case 250:
				method7713(arg1);
				return;
			case 251:
				method8623(arg1);
				return;
			case 252:
				method4725(arg1);
				return;
			case 253:
				Statics.method7814(arg1);
				return;
			case 254:
				method1820(arg1);
				return;
			case 255:
				method12189(arg1);
				return;
			case 256:
				method4775(arg1);
				return;
			case 257:
				method4626(arg1);
				return;
			case 258:
				method2864(arg1);
				return;
			case 259:
				method4791(arg1);
				return;
			case 260:
				method4009(arg1);
				return;
			case 261:
				method12368(arg1);
				return;
			case 262:
				method3621(arg1);
				return;
			case 263:
				method11996(arg1);
				return;
			case 264:
				method2588(arg1);
				return;
			case 265:
				method1415(arg1);
				return;
			case 266:
				method8089(arg1);
				return;
			case 267:
				method7073(arg1);
				return;
			case 268:
				method14066(arg1);
				return;
			case 269:
				method4894(arg1);
				return;
			case 270:
				method2921(arg1);
				return;
			case 271:
				method12886(arg1);
				return;
			case 272:
				method1975(arg1);
				return;
			case 273:
				method2574(arg1);
				return;
			case 274:
				method1324(arg1);
				return;
			case 275:
				class500.method8541(arg1);
				return;
			case 276:
				method6313(arg1);
				return;
			case 277:
				method8285(arg1);
				return;
			case 278:
				method1904(arg1);
				return;
			case 279:
				method1666(arg1);
				return;
			case 280:
				method1377(arg1);
				return;
			case 281:
				method11711(arg1);
				return;
			case 282:
				method7067(arg1);
				return;
			case 283:
				Statics.method8660(arg1);
				return;
			case 284:
				method827(arg1);
				return;
			case 285:
				method1669(arg1);
				return;
			case 286:
				method5966(arg1);
				return;
			case 287:
				method14962(arg1);
				return;
			case 288:
				method4570(arg1);
				return;
			case 289:
				method7743(arg1);
				return;
			case 290:
				method11075(arg1);
				return;
			case 291:
				class500.method1348(arg1);
				return;
			case 292:
				method14810(arg1);
				return;
			case 293:
				method14812(arg1);
				return;
			case 294:
				method2708(arg1);
				return;
			case 295:
				method4640(arg1);
				return;
			case 296:
				method3584(arg1);
				return;
			case 297:
				method8616(arg1);
				return;
			case 298:
				method3653(arg1);
				return;
			case 299:
				class500.method14068(arg1);
				return;
			case 300:
				method1816(arg1);
				return;
			case 301:
				method12740(arg1);
				return;
			case 302:
				method3675(arg1);
				return;
			case 303:
				method8079(arg1);
				return;
			case 304:
				method6025(arg1);
				return;
			case 305:
				method4722(arg1);
				return;
			case 306:
				method8608(arg1);
				return;
			case 307:
				Statics.method2717(arg1);
				return;
			case 308:
				method3970(arg1);
				return;
			case 309:
				method1713(arg1);
				return;
			case 310:
				method6971(arg1);
				return;
			case 311:
				method3317(arg1);
				return;
			case 312:
				class500.method7657(arg1);
				return;
			case 313:
				Statics.method11055(arg1);
				return;
			case 314:
				method6487(arg1);
				return;
			case 315:
				Statics.method8622(arg1);
				return;
			case 316:
				method6877(arg1);
				return;
			case 317:
				method15609(arg1);
				return;
			case 318:
				Statics.method6879(arg1);
				return;
			case 319:
				method7346(arg1);
				return;
			case 320:
				method1971(arg1);
				return;
			case 321:
				method7979(arg1);
				return;
			case 322:
				method3474(arg1);
				return;
			case 323:
				method3966(arg1);
				return;
			case 324:
				method2985(arg1);
				return;
			case 325:
				method7064(arg1);
				return;
			case 326:
				method826(arg1);
				return;
			case 327:
				method2558(arg1);
				return;
			case 328:
				method16249(arg1);
				return;
			case 329:
				method4785(arg1);
				return;
			case 330:
				method3923(arg1);
				return;
			case 331:
				method7281(arg1);
				return;
			case 332:
				method3316(arg1);
				return;
			case 333:
				method4730(arg1);
				return;
			case 334:
				method3447(arg1);
				return;
			case 335:
				method12225(arg1);
				return;
			case 336:
				method12635(arg1);
				return;
			case 337:
				method6791(arg1);
				return;
			case 338:
				method4603(arg1);
				return;
			case 339:
				method4734(arg1);
				return;
			case 340:
				method1560(arg1);
				return;
			case 341:
				method3568(arg1);
				return;
			case 342:
				Statics.method7717(arg1);
				return;
			case 343:
				method3651(arg1);
				return;
			case 344:
				method3650(arg1);
				return;
			case 345:
				method5569(arg1);
				return;
			case 346:
				method15938(arg1);
				return;
			case 347:
				method15893(arg1);
				return;
			case 348:
				method11876(arg1);
				return;
			case 349:
				method2836(arg1);
				return;
			case 350:
				method1808(arg1);
				return;
			case 351:
				method5015(arg1);
				return;
			case 352:
				method2582(arg1);
				return;
			case 353:
				method7892(arg1);
				return;
			case 354:
				method2899(arg1);
				return;
			case 355:
				method1353(arg1);
				return;
			case 356:
				method4001(arg1);
				return;
			case 357:
				method4101(arg1);
				return;
			case 358:
				method7730(arg1);
				return;
			case 359:
				method1222(arg1);
				return;
			case 360:
				method6346(arg1);
				return;
			case 361:
				method8045(arg1);
				return;
			case 362:
				Statics.method3967(arg1);
				return;
			case 363:
				method12478(arg1);
				return;
			case 364:
				method8496(arg1);
				return;
			case 365:
				method8617(arg1);
				return;
			case 366:
				Statics.method7074(arg1);
				return;
			case 367:
				Statics.method8597(arg1);
				return;
			case 368:
				method1679(arg1);
				return;
			case 369:
				method15482(arg1);
				return;
			case 370:
				method7571(arg1);
				return;
			case 371:
				method8665(arg1);
				return;
			case 372:
				method1622(arg1);
				return;
			case 373:
				method8603(arg1);
				return;
			case 374:
				method4976(arg1);
				return;
			case 375:
				method12162(arg1);
				return;
			case 376:
				method4002(arg1);
				return;
			case 377:
				Statics.method3638(arg1);
				return;
			case 378:
				method2987(arg1);
				return;
			case 379:
				method11198(arg1);
				return;
			case 380:
				method3661(arg1);
				return;
			case 381:
				method2428(arg1);
				return;
			case 382:
				method3673(arg1);
				return;
			case 383:
				method5829(arg1);
				return;
			case 384:
				method4780(arg1);
				return;
			case 385:
				method11163(arg1);
				return;
			case 386:
				method6067(arg1);
				return;
			case 387:
				method14743(arg1);
				return;
			case 388:
				method12636(arg1);
				return;
			case 389:
				method11707(arg1);
				return;
			case 390:
				method11762(arg1);
				return;
			case 391:
				method5024(arg1);
				return;
			case 392:
				Statics.method1605(arg1);
				return;
			case 393:
				method4736(arg1);
				return;
			case 394:
				method11960(arg1);
				return;
			case 395:
				Statics.method16113(arg1);
				return;
			case 396:
				Statics.method8406(arg1);
				return;
			case 397:
				method6826(arg1);
				return;
			case 398:
				method3446(arg1);
				return;
			case 399:
				method7888(arg1);
				return;
			case 400:
				class500.method3566(arg1);
				return;
			case 401:
				method15787(arg1);
				return;
			case 402:
				method15613(arg1);
				return;
			case 403:
				method4622(arg1);
				return;
			case 404:
				method7554(arg1);
				return;
			case 405:
				method6258(arg1);
				return;
			case 406:
				method2354(arg1);
				return;
			case 407:
				method5071(arg1);
				return;
			case 408:
				method8589(arg1);
				return;
			case 409:
				method16682(arg1);
				return;
			case 410:
				Statics.method12185(arg1);
				return;
			case 411:
				method8080(arg1);
				return;
			case 412:
				method8387(arg1);
				return;
			case 413:
				method8197(arg1);
				return;
			case 414:
				method3323(arg1);
				return;
			case 415:
				method7686(arg1);
				return;
			case 416:
				Statics.method3907(arg1);
				return;
			case 417:
				method2871(arg1);
				return;
			case 418:
				method3544(arg1);
				return;
			case 419:
				Statics.method6647(arg1);
				return;
			case 420:
				method7374(arg1);
				return;
			case 421:
				method5619(arg1);
				return;
			case 422:
				method1413(arg1);
				return;
			case 423:
				method4695(arg1);
				return;
			case 424:
				method11537(arg1);
				return;
			case 425:
				method8408(arg1);
				return;
			case 426:
				method4690(arg1);
				return;
			case 427:
				method2869(arg1);
				return;
			case 428:
				method2589(arg1);
				return;
			case 429:
				method1203(arg1);
				return;
			case 430:
				method233(arg1);
				return;
			case 431:
				method11489(arg1);
				return;
			case 432:
				method7714(arg1);
				return;
			case 433:
				method1326(arg1);
				return;
			case 434:
				Statics.method6069(arg1);
				return;
			case 435:
				method14131(arg1);
				return;
			case 436:
				Statics.method2611(arg1);
				return;
			case 437:
				method5545(arg1);
				return;
			case 438:
				Statics.method13912(arg1);
				return;
			case 439:
				method16790(arg1);
				return;
			case 440:
				method1719(arg1);
				return;
			case 441:
				Statics.method16642(false, arg1);
				return;
			case 442:
				method6820(arg1);
				return;
			case 443:
				method3844(arg1);
				return;
			case 444:
				method2023(arg1);
				return;
			case 445:
				method8456(arg1);
				return;
			case 446:
				method1240(arg1);
				return;
			case 447:
				method1316(arg1);
				return;
			case 448:
				method3631(arg1);
				return;
			case 449:
				method3291(arg1);
				return;
			case 450:
				method1318(arg1);
				return;
			case 451:
				method2917(arg1);
				return;
			case 452:
				method8385(arg1);
				return;
			case 453:
				method7349(arg1);
				return;
			case 454:
				method3543(arg1);
				return;
			case 455:
				method14260(arg1);
				return;
			case 456:
				method7378(arg1);
				return;
			case 457:
				method3533(arg1);
				return;
			case 458:
				method5733(arg1);
				return;
			case 459:
				method1684(true, arg1);
				return;
			case 460:
				method14811(arg1);
				return;
			case 461:
				method8284(arg1);
				return;
			case 462:
				method6887(arg1);
				return;
			case 463:
				method2815(arg1);
				return;
			case 464:
				method3660(arg1);
				return;
			case 465:
				method1815(arg1);
				return;
			case 466:
				method1964(arg1);
				return;
			case 467:
				method1817(arg1);
				return;
			case 468:
				method4003(arg1);
				return;
			case 469:
				method6985(arg1);
				return;
			case 470:
				method3453(arg1);
				return;
			case 471:
				method11309(arg1);
				return;
			case 472:
				method4034(arg1);
				return;
			case 473:
				method7858(arg1);
				return;
			case 474:
				method235(arg1);
				return;
			case 475:
				method7180(arg1);
				return;
			case 476:
				method2492(arg1);
				return;
			case 477:
				Statics.method14062(arg1);
				return;
			case 478:
				method6972(arg1);
				return;
			case 479:
				method5921(arg1);
				return;
			case 480:
				method5808(arg1);
				return;
			case 481:
				method1963(arg1);
				return;
			case 482:
				method880(arg1);
				return;
			case 483:
				method5789(arg1);
				return;
			case 484:
				method6358(arg1);
				return;
			case 485:
				method15592(arg1);
				return;
			case 486:
				method8407(arg1);
				return;
			case 487:
				method1374(arg1);
				return;
			case 488:
				method11378(arg1);
				return;
			case 489:
				Statics.method13892(arg1);
				return;
			case 490:
				method3524(arg1);
				return;
			case 491:
				method11242(arg1);
				return;
			case 492:
				Statics.method3531(arg1);
				return;
			case 493:
				method3846(arg1);
				return;
			case 494:
				method2489(arg1);
				return;
			case 495:
				method3659(arg1);
				return;
			case 496:
				method14747(arg1);
				return;
			case 497:
				method13894(arg1);
				return;
			case 498:
				method5927(arg1);
				return;
			case 499:
				method2983(arg1);
				return;
			case 500:
				method2827(arg1);
				return;
			case 501:
				method3061(arg1);
				return;
			case 502:
				method4808(arg1);
				return;
			case 503:
				method7277(arg1);
				return;
			case 504:
				method8199(arg1);
				return;
			case 505:
				method5028(arg1);
				return;
			case 506:
				method15785(arg1);
				return;
			case 507:
				Statics.method8303(arg1);
				return;
			case 508:
				method4691(arg1);
				return;
			case 509:
				Statics.method11255(arg1);
				return;
			case 510:
				method6064(arg1);
				return;
			case 511:
				method3062(arg1);
				return;
			case 512:
				method2541(arg1);
				return;
			case 513:
				method11665(arg1);
				return;
			case 514:
				method8386(arg1);
				return;
			case 515:
				class500.method2707(arg1);
				return;
			case 516:
				method4655(arg1);
				return;
			case 517:
				method7722(arg1);
				return;
			case 518:
				method1770(arg1);
				return;
			case 519:
				method3562(arg1);
				return;
			case 520:
				method15655(arg1);
				return;
			case 521:
				method13895(arg1);
				return;
			case 522:
				method2984(arg1);
				return;
			case 523:
				method4809(arg1);
				return;
			case 524:
				method13913(arg1);
				return;
			case 525:
				method11506(arg1);
				return;
			case 526:
				method6818(arg1);
				return;
			case 527:
				method12204(arg1);
				return;
			case 528:
				method2922(arg1);
				return;
			case 529:
				method8317(arg1);
				return;
			case 530:
				method3204(arg1);
				return;
			case 531:
				method16720(arg1);
				return;
			case 532:
				method2557(arg1);
				return;
			case 533:
				method5026(arg1);
				return;
			case 534:
				method4617(arg1);
				return;
			case 535:
				method14311(arg1);
				return;
			case 536:
				method15628(arg1);
				return;
			case 537:
				method15137(arg1);
				return;
			case 538:
				method3976(arg1);
				return;
			case 539:
				method1976(arg1);
				return;
			case 540:
				method7690(arg1);
				return;
			case 541:
				method8583(arg1);
				return;
			case 542:
				method11193(arg1);
				return;
			case 543:
				method3627(arg1);
				return;
			case 544:
				Statics.method7831(arg1);
				return;
			case 545:
				method5542(arg1);
				return;
			case 546:
				method6074(arg1);
				return;
			case 547:
				method12553(arg1);
				return;
			case 548:
				Statics.method3944(arg1);
				return;
			case 549:
				method13853(arg1);
				return;
			case 550:
				method4792(arg1);
				return;
			case 551:
				method8610(arg1);
				return;
			case 552:
				method12072(arg1);
				return;
			case 553:
				method15674(arg1);
				return;
			case 554:
				method1909(arg1);
				return;
			case 555:
				method7062(arg1);
				return;
			case 556:
				method7381(arg1);
				return;
			case 557:
				method3652(arg1);
				return;
			case 558:
				Statics.method2820(arg1);
				return;
			case 559:
				method12679(arg1);
				return;
			case 560:
				method11397(arg1);
				return;
			case 561:
				method2919(arg1);
				return;
			case 562:
				method4579(arg1);
				return;
			case 563:
				method7352(arg1);
				return;
			case 564:
				method2470(arg1);
				return;
			case 565:
				method2021(arg1);
				return;
			case 566:
				method15164(arg1);
				return;
			case 567:
				method7903(arg1);
				return;
			case 568:
				method6886(arg1);
				return;
			case 569:
				method1945(arg1);
				return;
			case 570:
				method15480(arg1);
				return;
			case 571:
				method11256(arg1);
				return;
			case 572:
				Statics.method15610(arg1);
				return;
			case 573:
				method7741(arg1);
				return;
			case 574:
				method1346(arg1);
				return;
			case 575:
				method7742(arg1);
				return;
			case 576:
				method1881(arg1);
				return;
			case 577:
				method2556(arg1);
				return;
			case 578:
				Statics.method11851(arg1);
				return;
			case 579:
				method8455(arg1);
				return;
			case 580:
				method6246(arg1);
				return;
			case 581:
				method2430(arg1);
				return;
			case 582:
				Statics.method3939(arg1);
				return;
			case 583:
				Statics.method16642(true, arg1);
				return;
			case 584:
				method4558(arg1);
				return;
			case 585:
				method4008(arg1);
				return;
			case 586:
				method15591(arg1);
				return;
			case 587:
				method3842(arg1);
				return;
			case 588:
				method4565(arg1);
				return;
			case 589:
				Statics.method1977(arg1);
				return;
			case 590:
				Statics.method2576(arg1);
				return;
			case 591:
				method3473(arg1);
				return;
			case 592:
				method7907(arg1);
				return;
			case 593:
				method1883(arg1);
				return;
			case 594:
				method7716(arg1);
				return;
			case 595:
				method15931(arg1);
				return;
			case 596:
				method6828(arg1);
				return;
			case 597:
				method12233(arg1);
				return;
			case 598:
				method4102(arg1);
				return;
			case 599:
				Statics.method12728(arg1);
				return;
			case 600:
				method11296(arg1);
				return;
			case 601:
				method2837(arg1);
				return;
			case 602:
				method8482(arg1);
				return;
			case 603:
				method8200(arg1);
				return;
			case 604:
				method6242(arg1);
				return;
			case 605:
				method12724(arg1);
				return;
			case 606:
				method8228(arg1);
				return;
			case 607:
				method16115(arg1);
				return;
			case 608:
				method14266(arg1);
				return;
			case 609:
				method8584(arg1);
				return;
			case 610:
				method6075(arg1);
				return;
			case 611:
				method5708(arg1);
				return;
			case 612:
				method11758(arg1);
				return;
			case 613:
				method6969(arg1);
				return;
			case 614:
				class207.add(arg1, (byte) -95);
				return;
			case 615:
				method6817(arg1);
				return;
			case 616:
				method4004(arg1);
				return;
			case 617:
				method3639(arg1);
				return;
			case 618:
				method2992(arg1);
				return;
			case 619:
				method4653(arg1);
				return;
			case 620:
				method2605(arg1);
				return;
			case 621:
				method4784(arg1);
				return;
			case 622:
				method5826(arg1);
				return;
			case 623:
				method4580(arg1);
				return;
			case 624:
				method1837(arg1);
				return;
			case 625:
				method7555(arg1);
				return;
			case 626:
				method7911(arg1);
				return;
			case 627:
				method12346(arg1);
				return;
			case 628:
				method8090(arg1);
				return;
			case 629:
				method4755(arg1);
				return;
			case 630:
				method6243(arg1);
				return;
			case 631:
				method3535(arg1);
				return;
			case 632:
				method7878(arg1);
				return;
			case 633:
				method11324(arg1);
				return;
			case 634:
				method2585(arg1);
				return;
			case 635:
				method7181(arg1);
				return;
			case 636:
				Statics.method7991(arg1);
				return;
			case 637:
				method8287(arg1);
				return;
			case 638:
				method4803(arg1);
				return;
			case 639:
				method7786(arg1);
				return;
			case 640:
				method1376(arg1);
				return;
			case 641:
				method7718(arg1);
				return;
			case 642:
				method7371(arg1);
				return;
			case 643:
				method1685(arg1);
				return;
			case 644:
				method15964(arg1);
				return;
			case 645:
				method2578(arg1);
				return;
			case 646:
				method6402(arg1);
				return;
			case 647:
				method3620(arg1);
				return;
			case 648:
				method3563(arg1);
				return;
			case 649:
				method11853(arg1);
				return;
			case 650:
				method828(arg1);
				return;
			case 651:
				Statics.method3642(arg1);
				return;
			case 652:
				method15467(arg1);
				return;
			case 653:
				method8607(arg1);
				return;
			case 654:
				method12646(arg1);
				return;
			case 655:
				class500.method1248(arg1);
				return;
			case 656:
				method3908(arg1);
				return;
			case 657:
				method1668(arg1);
				return;
			case 658:
				class500.method3307(arg1);
				return;
			case 659:
				method3628(arg1);
				return;
			case 660:
				method4715(arg1);
				return;
			case 661:
				method7229(arg1);
				return;
			case 662:
				method7736(arg1);
				return;
			case 663:
				method2580(arg1);
				return;
			case 664:
				Statics.method5615(arg1);
				return;
			case 665:
				Statics.method6081(arg1);
				return;
			case 666:
				method8483(arg1);
				return;
			case 667:
				method16789(arg1);
				return;
			case 668:
				method12222(arg1);
				return;
			case 669:
				method3083(arg1);
				return;
			case 670:
				method11183(arg1);
				return;
			case 671:
				method7182(arg1);
				return;
			case 672:
				method3094(arg1);
				return;
			case 673:
				method6489(arg1);
				return;
			case 674:
				method2939(arg1);
				return;
			case 675:
				Statics.method7955(arg1);
				return;
			case 676:
				method3068(arg1);
				return;
			case 677:
				method3545(arg1);
				return;
			case 678:
				method4120(arg1);
				return;
			case 679:
				Statics.method2932(arg1);
				return;
			case 680:
				Statics.method5938(arg1);
				return;
			case 681:
				Statics.method2549(arg1);
				return;
			case 682:
				method2844(arg1);
				return;
			case 683:
				method4121(arg1);
				return;
			case 684:
				method12738(arg1);
				return;
			case 685:
				method2825(arg1);
				return;
			case 686:
				method7572(arg1);
				return;
			case 687:
				Statics.method12465(arg1);
				return;
			case 688:
				method5941(arg1);
				return;
			case 689:
				method5832(arg1);
				return;
			case 690:
				method14088(arg1);
				return;
			case 691:
				Statics.method2577(arg1);
				return;
			case 692:
				method5573(arg1);
				return;
			case 693:
				Statics.method4895(arg1);
				return;
			case 694:
				method4747(arg1);
				return;
			case 695:
				method7345(arg1);
				return;
			case 696:
				method3498(arg1);
				return;
			case 697:
				method12355(arg1);
				return;
			case 698:
				Statics.method1822(arg1);
				return;
			case 699:
				method4738(arg1);
				return;
			case 700:
				method4108(arg1);
				return;
			case 701:
				method3448(arg1);
				return;
			case 702:
				method1204(arg1);
				return;
			case 703:
				method7183(arg1);
				return;
			case 704:
				method5710(arg1);
				return;
			case 705:
				method4670(arg1);
				return;
			case 706:
				method4709(arg1);
				return;
			case 707:
				method1607(arg1);
				return;
			case 708:
				method4804(arg1);
				return;
			case 709:
				method3466(arg1);
				return;
			case 710:
				Statics.method4893(arg1);
				return;
			case 711:
				method882(arg1);
				return;
			case 712:
				method12856(arg1);
				return;
			case 713:
				Statics.method6829(arg1);
				return;
			case 714:
				class500.method4614(arg1);
				return;
			case 715:
				method2716(arg1);
				return;
			case 716:
				method1398(arg1);
				return;
			case 717:
				method5027(arg1);
				return;
			case 718:
				method6793(arg1);
				return;
			case 719:
				method12750(arg1);
				return;
			case 720:
				method3636(arg1);
				return;
			case 721:
				method4716(arg1);
				return;
			case 722:
				method1591(arg1);
				return;
			case 723:
				method3938(arg1);
				return;
			case 724:
				method2928(arg1);
				return;
			case 725:
				method15165(arg1);
				return;
			case 726:
				Statics.method13893(arg1);
				return;
			case 727:
				method7375(arg1);
				return;
			case 728:
				method6984(arg1);
				return;
			case 729:
				method6642(arg1);
				return;
			case 730:
				method11299(arg1);
				return;
			case 731:
				method15669(arg1);
				return;
			case 732:
				method2819(arg1);
				return;
			case 733:
				method2824(arg1);
				return;
			case 734:
				method1239(arg1);
				return;
			case 735:
				method11184(arg1);
				return;
			case 736:
				method5787(arg1);
				return;
			case 737:
				method12164(arg1);
				return;
			case 738:
				method6794(arg1);
				return;
			case 739:
				method7556(arg1);
				return;
			case 740:
				method2927(arg1);
				return;
			case 741:
				method14723(arg1);
				return;
			case 742:
				method3081(arg1);
				return;
			case 743:
				Statics.method7988(arg1);
				return;
			case 744:
				method16254(arg1);
				return;
			case 745:
				method3464(arg1);
				return;
			case 746:
				method11845(arg1);
				return;
			case 747:
				method3539(arg1);
				return;
			case 748:
				method2610(arg1);
				return;
			case 749:
				method6847(arg1);
				return;
			case 750:
				method8615(arg1);
				return;
			case 751:
				method3206(arg1);
				return;
			case 752:
				method4557(arg1);
				return;
			case 753:
				method7813(arg1);
				return;
			case 754:
				class500.method5565(arg1);
				return;
			case 755:
				method4779(arg1);
				return;
			case 756:
				method1221(arg1);
				return;
			case 757:
				method7989(arg1);
				return;
			case 758:
				Statics.method6790(arg1);
				return;
			case 759:
				method2817(arg1);
				return;
			case 760:
				method8513(arg1);
				return;
			case 761:
				method7246(arg1);
				return;
			case 762:
				method16940(arg1);
				return;
			case 763:
				method12207(arg1);
				return;
			case 764:
				method3523(arg1);
				return;
			case 765:
				method7689(arg1);
				return;
			case 766:
				method5570(arg1);
				return;
			case 767:
				method4708(arg1);
				return;
			case 768:
				method11536(arg1);
				return;
			case 769:
				method12680(arg1);
				return;
			case 770:
				method5592(arg1);
				return;
			case 771:
				method15141(arg1);
				return;
			case 772:
				method8619(arg1);
				return;
			case 773:
				method3624(arg1);
				return;
			case 774:
				method6581(arg1);
				return;
			case 775:
				method5070(arg1);
				return;
			case 776:
				method2924(arg1);
				return;
			case 777:
				method4753(arg1);
				return;
			case 778:
				method8141(arg1);
				return;
			case 779:
				method12900(arg1);
				return;
			case 780:
				Statics.method5810(arg1);
				return;
			case 781:
				method7715(arg1);
				return;
			case 782:
				method15949(arg1);
				return;
			case 783:
				method3290(arg1);
				return;
			case 784:
				method1978(arg1);
				return;
			case 785:
				method3308(arg1);
				return;
			case 786:
				method7078(arg1);
				return;
			case 787:
				method3567(arg1);
				return;
			case 788:
				method8046(arg1);
				return;
			case 789:
				method7393(arg1);
				return;
			case 790:
				Statics.method3207(arg1);
				return;
			case 791:
				method15732(arg1);
				return;
			case 792:
				class500.method14038(arg1);
				return;
			case 793:
				Statics.method7050(arg1);
				return;
			case 794:
				method2495(arg1);
				return;
			case 795:
				method7901(arg1);
				return;
			case 796:
				method8484(arg1);
				return;
			case 797:
				method3640(arg1);
				return;
			case 798:
				method12145(arg1);
				return;
			case 799:
				method4810(arg1);
				return;
			case 800:
				method1960(arg1);
				return;
			case 801:
				method7889(arg1);
				return;
			case 802:
				method15825(arg1);
				return;
			case 803:
				method16190(arg1);
				return;
			case 804:
				method8065(arg1);
				return;
			case 805:
				method8627(arg1);
				return;
			case 806:
				method1882(arg1);
				return;
			case 807:
				Statics.method1905(arg1);
				return;
			case 808:
				method1722(arg1);
				return;
			case 809:
				method1686(arg1);
				return;
			case 810:
				method3203(arg1);
				return;
			case 811:
				method12036(arg1);
				return;
			case 812:
				method14904(arg1);
				return;
			case 813:
				method7976(arg1);
				return;
			case 814:
				method1558(arg1);
				return;
			case 815:
				method1818(arg1);
				return;
			case 816:
				method6639(arg1);
				return;
			case 817:
				method4806(arg1);
				return;
			case 818:
				method4878(arg1);
				return;
			case 819:
				method4875(arg1);
				return;
			case 820:
				method6084(arg1);
				return;
			case 821:
				Statics.method5571(arg1);
				return;
			case 822:
				method4721(arg1);
				return;
			case 823:
				method6968(arg1);
				return;
			case 824:
				method3227(arg1);
				return;
			case 825:
				method4594(arg1);
				return;
			case 826:
				method5014(arg1);
				return;
			case 827:
				method7832(arg1);
				return;
			case 828:
				method6845(arg1);
				return;
			case 829:
				method3084(arg1);
				return;
			case 830:
				method6491(arg1);
				return;
			case 831:
				method16721(arg1);
				return;
			case 832:
				method13885(arg1);
				return;
			case 833:
				method1414(arg1);
				return;
			case 834:
				method11196(arg1);
				return;
			case 835:
				method6311(arg1);
				return;
			case 836:
				method1819(arg1);
				return;
			case 837:
				method2386(arg1);
				return;
			case 838:
				method7553(arg1);
				return;
			case 839:
				method14210(arg1);
				return;
			case 840:
				method2706(arg1);
				return;
			case 841:
				method3085(arg1);
				return;
			case 842:
				method1352(arg1);
				return;
			case 843:
				method3924(arg1);
				return;
			case 844:
				method7974(arg1);
				return;
			case 845:
				method1317(arg1);
				return;
			case 846:
				Statics.method6646(arg1);
				return;
			case 847:
				method1973(arg1);
				return;
			case 848:
				method1769(arg1);
				return;
			case 849:
				method3977(arg1);
				return;
			case 850:
				method1967(arg1);
				return;
			case 851:
				method1593(arg1);
				return;
			case 852:
				method2353(arg1);
				return;
			case 853:
				method2713(arg1);
				return;
			case 854:
				method12727(arg1);
				return;
			case 855:
				method3509(arg1);
				return;
			case 856:
				method7063(arg1);
				return;
			case 857:
				method15823(arg1);
				return;
			case 858:
				method3672(arg1);
				return;
			case 859:
				method2812(arg1);
				return;
			case 860:
				method6023(arg1);
				return;
			case 861:
				method7894(arg1);
				return;
			case 862:
				method1700(arg1);
				return;
			case 863:
				method3845(arg1);
				return;
			case 864:
				method14748(arg1);
				return;
			case 865:
				method6356(arg1);
				return;
			case 866:
				method2993(arg1);
				return;
			case 867:
				method2886(arg1);
				return;
			case 868:
				method4776(arg1);
				return;
			case 869:
				method6479(arg1);
				return;
			case 870:
				method2895(arg1);
				return;
			case 871:
				method8347(arg1);
				return;
			case 872:
				method4636(arg1);
				return;
			case 873:
				method6948(arg1);
				return;
			case 874:
				method11763(arg1);
				return;
			case 875:
				method1715(arg1);
				return;
			case 876:
				method1345(arg1);
				return;
			case 877:
				Statics.method8720(arg1);
				return;
			case 878:
				method3646(arg1);
				return;
			case 879:
				method2705(arg1);
				return;
			case 880:
				method2586(arg1);
				return;
			case 881:
				method12649(arg1);
				return;
			case 882:
				class500.method8480(arg1);
				return;
			case 883:
				method7214(arg1);
				return;
			case 884:
				method8661(arg1);
				return;
			case 885:
				method2491(arg1);
				return;
			case 886:
				method6073(arg1);
				return;
			case 887:
				method14089(arg1);
				return;
			case 888:
				method8138(arg1);
				return;
			case 889:
				method7687(arg1);
				return;
			case 890:
				method4604(arg1);
				return;
			case 891:
				method7771(arg1);
				return;
			case 892:
				method3452(arg1);
				return;
			case 893:
				method2850(arg1);
				return;
			case 894:
				method4863(arg1);
				return;
			case 895:
				Statics.method12325(arg1);
				return;
			case 896:
				method14218(arg1);
				return;
			case 897:
				method5551(arg1);
				return;
			case 898:
				method6649(arg1);
				return;
			case 899:
				Statics.method7968(arg1);
				return;
			case 900:
				method14217(arg1);
				return;
			case 901:
				method2986(arg1);
				return;
			case 902:
				Statics.method234(arg1);
				return;
			case 903:
				method7902(arg1);
				return;
			case 904:
				method8286(arg1);
				return;
			case 905:
				Statics.method4706(arg1);
				return;
			case 906:
				class500.method4601(arg1);
				return;
			case 907:
				method5809(arg1);
				return;
			case 908:
				method12328(arg1);
				return;
			case 909:
				method11199(arg1);
				return;
			case 910:
				method1714(arg1);
				return;
			case 911:
				method11976(arg1);
				return;
			case 912:
				method4007(arg1);
				return;
			case 913:
				method1907(arg1);
				return;
			case 914:
				method8657(arg1);
				return;
			case 915:
				method2897(arg1);
				return;
			case 916:
				method13905(arg1);
				return;
			case 917:
				Statics.method4599(arg1);
				return;
			case 918:
				method5543(arg1);
				return;
			case 919:
				method12729(arg1);
				return;
			case 920:
				method8602(arg1);
				return;
			case 921:
				method11490(arg1);
				return;
			case 922:
				method15803(arg1);
				return;
			case 923:
				method6403(arg1);
				return;
			case 924:
				method2606(arg1);
				return;
			case 925:
				Statics.method11638(arg1);
				return;
			case 926:
				Statics.method13908(arg1);
				return;
			case 927:
				method4592(arg1);
				return;
			case 928:
				method8631(arg1);
				return;
			case 929:
				Statics.method4771(arg1);
				return;
			case 930:
				method11165(arg1);
				return;
			case 931:
				Statics.method12700(arg1);
				return;
			case 932:
				method3984(arg1);
				return;
			case 933:
				method16503(arg1);
				return;
			case 934:
				method7677(arg1);
				return;
			case 935:
				Statics.method12749(arg1);
				return;
			case 936:
				method3569(arg1);
				return;
			case 937:
				method236(arg1);
				return;
			case 938:
				Statics.method8091(arg1);
				return;
			case 939:
				method2885(arg1);
				return;
			case 940:
				class500.method8349(arg1);
				return;
			case 941:
				method2890(arg1);
				return;
			case 942:
				method3843(arg1);
				return;
			case 943:
				method8274(arg1);
				return;
			case 944:
				method7857(arg1);
				return;
			case 945:
				method2614(arg1);
				return;
			case 946:
				method3445(arg1);
				return;
			case 947:
				Statics.method4555(arg1);
				return;
			case 948:
				method12998(arg1);
				return;
			case 949:
				method7570(arg1);
				return;
			case 950:
				method1887(arg1);
				return;
			case 951:
				method14059(arg1);
				return;
			case 952:
				method5965(arg1);
				return;
			case 953:
				Statics.method14199(arg1);
				return;
			case 954:
				method14119(arg1);
				return;
			case 955:
				Statics.method14037(arg1);
				return;
			case 956:
				method2849(arg1);
				return;
			case 957:
				method6357(arg1);
				return;
			case 958:
				method8139(arg1);
				return;
			case 959:
				method5589(arg1);
				return;
			case 960:
				method5591(arg1);
				return;
			case 961:
				method6885(arg1);
				return;
			case 962:
				Statics.method3922(arg1);
				return;
			case 963:
				Statics.method4793(arg1);
				return;
			case 964:
				Statics.method7053(arg1);
				return;
			case 965:
				method2865(arg1);
				return;
			case 966:
				method1771(arg1);
				return;
			case 967:
				method12071(arg1);
				return;
			case 968:
				method8727(arg1);
				return;
			case 969:
				method11403(arg1);
				return;
			case 970:
				method7392(arg1);
				return;
			case 971:
				method14741(arg1);
				return;
			case 972:
				Statics.method3532(arg1);
				return;
			case 973:
				method6338(arg1);
				return;
			case 974:
				method4595(arg1);
				return;
			case 975:
				method1325(arg1);
				return;
			case 976:
				method3082(arg1);
				return;
			case 977:
				method12451(arg1);
				return;
			case 978:
				method13881(arg1);
				return;
			case 979:
				method7283(arg1);
				return;
			case 980:
				method8630(arg1);
				return;
			case 981:
				method3951(arg1);
				return;
			case 982:
				method4112(arg1);
				return;
			case 983:
				method6584(arg1);
				return;
			case 984:
				method6884(arg1);
				return;
			case 985:
				method3985(arg1);
				return;
			case 986:
				Statics.method12347(arg1);
				return;
			case 987:
				method3462(arg1);
				return;
			case 988:
				method12758(arg1);
				return;
			case 989:
				Statics.method3945(arg1);
				return;
			case 990:
				method4772(arg1);
				return;
			case 991:
				method11637(arg1);
				return;
			case 992:
				method6347(arg1);
				return;
			case 993:
				method5711(arg1);
				return;
			case 994:
				method4607(arg1);
				return;
			case 995:
				method4735(arg1);
				return;
			case 996:
				method5593(arg1);
				return;
			case 997:
				method4564(arg1);
				return;
			case 998:
				method3205(arg1);
				return;
			case 999:
				method7982(arg1);
				return;
			case 1000:
				method12211(arg1);
				return;
			case 1001:
				method2496(arg1);
				return;
			case 1002:
				method6641(arg1);
				return;
			case 1003:
				method3654(arg1);
				return;
			case 1004:
				method4672(arg1);
				return;
			case 1005:
				method4723(arg1);
				return;
			case 1006:
				method14084(arg1);
				return;
			case 1007:
				method4787(arg1);
				return;
			case 1008:
				method5929(arg1);
				return;
			case 1009:
				method2424(arg1);
				return;
			case 1010:
				Statics.method4795(arg1);
				return;
			case 1011:
				method12223(arg1);
				return;
			case 1012:
				method3579(arg1);
				return;
			case 1013:
				method8543(arg1);
				return;
			case 1014:
				method7833(arg1);
				return;
			case 1015:
				method15784(arg1);
				return;
			case 1016:
				method6336(arg1);
				return;
			case 1017:
				method6072(arg1);
				return;
			case 1018:
				method4720(arg1);
				return;
			case 1019:
				method1359(arg1);
				return;
			case 1020:
				method4805(arg1);
				return;
			case 1021:
				method15149(arg1);
				return;
			case 1022:
				method12224(arg1);
				return;
			case 1023:
				method4105(arg1);
				return;
			case 1024:
				method1606(arg1);
				return;
			case 1025:
				method2539(arg1);
				return;
			case 1026:
				method1357(arg1);
				return;
			case 1027:
				method3671(arg1);
				return;
			case 1028:
				method3597(arg1);
				return;
			case 1029:
				method7373(arg1);
				return;
			case 1030:
				method12718(arg1);
				return;
			case 1031:
				method2918(arg1);
				return;
			case 1032:
				method8302(arg1);
				return;
			case 1033:
				Statics.method1821(arg1);
				return;
			case 1034:
				method3625(arg1);
				return;
			case 1035:
				method5924(arg1);
				return;
			case 1036:
				method1667(arg1);
				return;
			case 1037:
				method6344(arg1);
				return;
			case 1038:
				method8346(arg1);
				return;
			case 1039:
				method7909(arg1);
				return;
			case 1040:
				method5572(arg1);
				return;
			case 1041:
				method14994(arg1);
				return;
			case 1042:
				method8719(arg1);
				return;
			case 1043:
				method4717(arg1);
				return;
			case 1044:
				method6880(arg1);
				return;
			case 1045:
				method2870(arg1);
				return;
			default:
				throw new RuntimeException();
		}
	}

	@ObfuscatedName("em.v(Lrn;S)V")
	public static final void method3464(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5227[arg0.field5236];
	}

	@ObfuscatedName("nd.k(Lrn;I)V")
	public static final void method7064(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2669.field661[var1];
	}

	@ObfuscatedName("adl.h(Lrn;B)V")
	public static final void method15179(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		Statics.field2669.method1642(var1, arg0.field5215[--arg0.field5216]);
	}

	@ObfuscatedName("fn.r(Lrn;I)V")
	public static final void method3562(ClientScriptState arg0) {
		arg0.field5222[++arg0.field5230 - 1] = arg0.field5218.field10380[arg0.field5236];
	}

	@ObfuscatedName("tl.g(Lrn;I)V")
	public static final void method11853(ClientScriptState arg0) {
		arg0.field5236 += arg0.field5227[arg0.field5236];
	}

	@ObfuscatedName("on.e(Lrn;I)V")
	public static final void method7178(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		if (arg0.field5215[arg0.field5216] == arg0.field5215[arg0.field5216 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("ar.ay(Lrn;B)V")
	public static final void method1699(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		if (arg0.field5215[arg0.field5216] < arg0.field5215[arg0.field5216 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("ai.af(Lrn;I)V")
	public static final void method1769(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		if (arg0.field5215[arg0.field5216] > arg0.field5215[arg0.field5216 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("adg.ar(Lrn;S)V")
	public static final void method15137(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		arg0.field5215[++arg0.field5216 - 1] = ((PlayerEntity) arg0.field5228).field10055.method2373(var1);
	}

	@ObfuscatedName("aju.an(Lrn;I)V")
	public static final void method16789(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		arg0.field5215[++arg0.field5216 - 1] = ((PlayerEntity) arg0.field5228).field10055.method2375(var1);
	}

	@ObfuscatedName("wz.ap(Lrn;B)V")
	public static final void method12679(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		arg0.field5215[++arg0.field5216 - 1] = ((NpcEntity) arg0.field5228).field10078.method2416(var1);
	}

	@ObfuscatedName("aed.ag(Lrn;I)V")
	public static final void method15676(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		arg0.field5215[++arg0.field5216 - 1] = ((NpcEntity) arg0.field5228).field10078.method2417(var1);
	}

	@ObfuscatedName("em.ai(Lrn;I)V")
	public static final void method3462(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2669.method1646(var1);
	}

	@ObfuscatedName("pa.al(Lrn;I)V")
	public static final void method7741(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		if (arg0.field5215[arg0.field5216] <= arg0.field5215[arg0.field5216 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("sq.at(Lrn;I)V")
	public static final void method11242(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		if (arg0.field5215[arg0.field5216] >= arg0.field5215[arg0.field5216 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("li.ax(Lrn;I)V")
	public static final void method5588(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5235[arg0.field5227[arg0.field5236]];
	}

	@ObfuscatedName("ow.aw(Lrn;B)V")
	public static final void method7352(ClientScriptState arg0) {
		arg0.field5235[arg0.field5227[arg0.field5236]] = arg0.field5215[--arg0.field5216];
	}

	@ObfuscatedName("sm.aa(Lrn;I)V")
	public static final void method11183(ClientScriptState arg0) {
		arg0.field5222[++arg0.field5230 - 1] = arg0.field5211[arg0.field5227[arg0.field5236]];
	}

	@ObfuscatedName("cy.am(Lrn;B)V")
	public static final void method2582(ClientScriptState arg0) {
		arg0.field5211[arg0.field5227[arg0.field5236]] = arg0.field5222[--arg0.field5230];
	}

	@ObfuscatedName("aj.az(Lrn;I)V")
	public static final void method1963(ClientScriptState arg0) {
		arg0.field5216--;
	}

	@ObfuscatedName("aac.ak(Lrn;I)V")
	public static final void method14084(ClientScriptState arg0) {
		arg0.field5230--;
	}

	@ObfuscatedName("jj.av(Lrn;B)V")
	public static final void method4776(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		ClientScript var2 = ClientScriptHelpers.method4892(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		int[] var3 = new int[var2.field10379];
		Object[] var4 = new Object[var2.field10387];
		long[] var5 = new long[var2.field10384];
		for (int var6 = 0; var6 < var2.field10382; var6++) {
			var3[var6] = arg0.field5215[arg0.field5216 - var2.field10382 + var6];
		}
		for (int var7 = 0; var7 < var2.field10386; var7++) {
			var4[var7] = arg0.field5222[arg0.field5230 - var2.field10386 + var7];
		}
		for (int var8 = 0; var8 < var2.field10376; var8++) {
			var5[var8] = arg0.field5219[arg0.field5220 - var2.field10376 + var8];
		}
		arg0.field5216 -= var2.field10382;
		arg0.field5230 -= var2.field10386;
		arg0.field5220 -= var2.field10376;
		class499 var9 = new class499();
		var9.field5191 = arg0.field5218;
		var9.field5189 = arg0.field5236;
		var9.field5188 = arg0.field5235;
		var9.field5190 = arg0.field5211;
		var9.field5192 = arg0.field5212;
		if (arg0.field5221 >= arg0.field5225.length) {
			throw new RuntimeException();
		}
		arg0.field5225[++arg0.field5221 - 1] = var9;
		arg0.field5218 = var2;
		arg0.field5214 = arg0.field5218.field10378;
		arg0.field5227 = arg0.field5218.field10385;
		arg0.field5236 = -1;
		arg0.field5235 = var3;
		arg0.field5211 = var4;
		arg0.field5212 = var5;
	}

	@ObfuscatedName("oz.aj(Lrn;B)V")
	public static final void method7570(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field6666[arg0.field5227[arg0.field5236]];
	}

	@ObfuscatedName("qv.ah(Lrn;I)V")
	public static final void method8300(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		Statics.field6666[var1] = arg0.field5215[--arg0.field5216];
		DelayedStateChange.method5553(var1);
		client.field9156 |= Statics.field2210[var1];
	}

	@ObfuscatedName("oc.au(Lrn;I)V")
	public static final void method7378(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236] >> 16;
		int var2 = arg0.field5227[arg0.field5236] & 0xFFFF;
		int var3 = arg0.field5215[--arg0.field5216];
		if (var3 < 0 || var3 > 5000) {
			throw new RuntimeException();
		}
		arg0.field5237[var1] = var3;
		byte var4 = -1;
		if (var2 == 105) {
			var4 = 0;
		}
		for (int var5 = 0; var5 < var3; var5++) {
			arg0.field5224[var1][var5] = var4;
		}
	}

	@ObfuscatedName("qh.ae(Lrn;B)V")
	public static final void method8284(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		int var2 = arg0.field5215[--arg0.field5216];
		if (var2 < 0 || var2 >= arg0.field5237[var1]) {
			throw new RuntimeException();
		}
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5224[var1][var2];
	}

	@ObfuscatedName("gf.ac(Lrn;B)V")
	public static final void method4001(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		arg0.field5216 -= 2;
		int var2 = arg0.field5215[arg0.field5216];
		if (var2 < 0 || var2 >= arg0.field5237[var1]) {
			throw new RuntimeException();
		}
		arg0.field5224[var1][var2] = arg0.field5215[arg0.field5216 + 1];
	}

	@ObfuscatedName("li.aq(Lrn;B)V")
	public static final void method5589(ClientScriptState arg0) {
		String var1 = Statics.field3498[arg0.field5227[arg0.field5236]];
		if (var1 == null) {
			var1 = "";
		}
		arg0.field5222[++arg0.field5230 - 1] = var1;
	}

	@ObfuscatedName("am.ab(Lrn;I)V")
	public static final void method1908(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		Statics.field3498[var1] = (String) arg0.field5222[--arg0.field5230];
		DelayedStateChange.method12064(var1);
	}

	@ObfuscatedName("lv.bv(Lrn;I)V")
	public static final void method5619(ClientScriptState arg0) {
		arg0.field5220--;
	}

	@ObfuscatedName("aaj.bj(Lrn;B)V")
	public static final void method14132(ClientScriptState arg0) {
		arg0.field5219[++arg0.field5220 - 1] = arg0.field5212[arg0.field5227[arg0.field5236]];
	}

	@ObfuscatedName("client.bf(Lrn;I)V")
	public static final void method14716(ClientScriptState arg0) {
		arg0.field5212[arg0.field5227[arg0.field5236]] = arg0.field5219[--arg0.field5220];
	}

	@ObfuscatedName("ql.bt(Lrn;I)V")
	public static final void method8141(ClientScriptState arg0) {
		arg0.field5220 -= 2;
		if (arg0.field5219[arg0.field5220] != arg0.field5219[arg0.field5220 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("iu.bl(Lrn;I)V")
	public static final void method4672(ClientScriptState arg0) {
		arg0.field5220 -= 2;
		if (arg0.field5219[arg0.field5220] < arg0.field5219[arg0.field5220 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("ct.bk(Lrn;I)V")
	public static final void method2541(ClientScriptState arg0) {
		arg0.field5220 -= 2;
		if (arg0.field5219[arg0.field5220] > arg0.field5219[arg0.field5220 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("afn.bs(Lrn;B)V")
	public static final void method15803(ClientScriptState arg0) {
		arg0.field5220 -= 2;
		if (arg0.field5219[arg0.field5220] <= arg0.field5219[arg0.field5220 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("am.bn(Lrn;I)V")
	public static final void method1904(ClientScriptState arg0) {
		arg0.field5220 -= 2;
		if (arg0.field5219[arg0.field5220] >= arg0.field5219[arg0.field5220 + 1]) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("lp.ba(Lrn;S)V")
	public static final void method6028(ClientScriptState arg0) {
		if (arg0.field5215[--arg0.field5216] == 1) {
			arg0.field5236 += arg0.field5227[arg0.field5236];
		}
	}

	@ObfuscatedName("iy.bc(Lrn;I)V")
	public static final void method4695(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		Integer var2 = (Integer) Statics.field5051[var1];
		if (var2 != null) {
			arg0.field5215[++arg0.field5216 - 1] = var2;
			return;
		}
		class627 var3 = Statics.field7390.method12669(var1);
		if (var3.field7350 == 'i' || var3.field7350 == '1') {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		}
	}

	@ObfuscatedName("lp.br(Lrn;I)V")
	public static final void method6021(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		class627 var2 = Statics.field7390.method12669(var1);
		if (var2.field7350 != 1) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
		Integer var3 = (Integer) Statics.field5051[var2.field7352];
		if (var3 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			int var4 = var2.field7349 == 31 ? -1 : (0x1 << var2.field7349 + 1) - 1;
			arg0.field5215[++arg0.field5216 - 1] = (var3 & var4) >>> var2.field7351;
		}
	}

	@ObfuscatedName("kj.bp(Lrn;I)V")
	public static final void method5543(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		Long var2 = (Long) Statics.field5051[var1];
		if (var2 == null) {
			arg0.field5219[++arg0.field5220 - 1] = -1L;
		} else {
			arg0.field5219[++arg0.field5220 - 1] = var2;
		}
	}

	@ObfuscatedName("ps.bi(Lrn;I)V")
	public static final void method7771(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		String var2 = (String) Statics.field5051[var1];
		if (var2 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2;
		}
	}

	@ObfuscatedName("fd.bx(Lrn;I)V")
	public static final void method3507(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		class474 var2 = Statics.field1202.method8290(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Integer var3 = arg0.field5226.method4043(client.field9163.field6408 << 16 | var1);
		int var4;
		if (var3 != null) {
			var4 = var3;
		} else if (var2.field5036 == 'i' || var2.field5036 == '1') {
			var4 = 0;
		} else {
			var4 = -1;
		}
		arg0.field5215[++arg0.field5216 - 1] = var4;
	}

	@ObfuscatedName("ez.bb(Lrn;I)V")
	public static final void method3061(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		Long var2 = arg0.field5226.method4045(client.field9163.field6408 << 16 | var1);
		long var3;
		if (var2 == null) {
			var3 = -1L;
		} else {
			var3 = var2;
		}
		arg0.field5219[++arg0.field5220 - 1] = var3;
	}

	@ObfuscatedName("qg.be(Lrn;I)V")
	public static final void method8408(ClientScriptState arg0) {
		int var1 = arg0.field5227[arg0.field5236];
		String var2 = arg0.field5226.method4071(client.field9163.field6408 << 16 | var1);
		String var3;
		if (var2 == null) {
			var3 = "";
		} else {
			var3 = var2;
		}
		arg0.field5222[++arg0.field5230 - 1] = var3;
	}

	@ObfuscatedName("cv.bw(Lrn;B)V")
	public static final void method2428(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		ComType.method11381(var1);
		method1373(Statics.field1756[var1 >>> 16], var1 & 0xFFFF, var2, var3, arg0.field5238, arg0);
	}

	@ObfuscatedName("q.bo(Lrn;I)V")
	public static final void method1398(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		if (var1.field5240.field1765 != -1) {
			ComType var2 = var1.method11061();
			var2.field1915[var1.field5240.field1765] = null;
			client.method12939(var2);
		} else if (arg0.field5238) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("afl.bh(Lrn;I)V")
	public static final void method15825(ClientScriptState arg0) {
		ComType var1 = ComType.method11381(arg0.field5215[--arg0.field5216]);
		var1.field1915 = null;
		var1.field1918 = null;
		client.method12939(var1);
	}

	@ObfuscatedName("ge.by(Lrn;I)V")
	public static final void method3985(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ActiveComponent var3;
		if (arg0.field5238) {
			var3 = arg0.field5210;
		} else {
			var3 = arg0.field5223;
		}
		arg0.field5215[++arg0.field5216 - 1] = var2 != -1 && var3.method11062(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("ns.bu(Lrn;I)V")
	public static final void method6972(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ActiveComponent var2;
		if (arg0.field5238) {
			var2 = arg0.field5210;
		} else {
			var2 = arg0.field5223;
		}
		arg0.field5215[++arg0.field5216 - 1] = var2.method11062(var1, -1) ? 1 : 0;
	}

	@ObfuscatedName("af.cq(ZLrn;I)V")
	public static final void method1684(boolean arg0, ClientScriptState arg1) {
		ActiveComponent var2 = arg1.field5238 ? arg1.field5210 : arg1.field5223;
		ComType var3 = var2.field5240;
		IfType var4 = var2.field5239;
		if (arg0) {
			method2840(var4, var3);
		} else {
			method15937(var4, var3);
		}
	}

	@ObfuscatedName("ae.co(Lrn;B)V")
	public static final void method1964(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		Statics.method3983(var2, arg0);
	}

	@ObfuscatedName("gm.cb(Lrn;I)V")
	public static final void method3970(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		Statics.method3983(var2, arg0);
	}

	@ObfuscatedName("ga.cw(Lrn;B)V")
	public static final void method4101(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (Statics.field2119.field10044 == null) {
			return;
		}
		for (int var3 = 0; var3 < IDKType.field2295.length; var3++) {
			if (IDKType.field2295[var3] == var1) {
				Statics.field2119.field10044.method8231(var3, var2, Statics.field7650);
				return;
			}
		}
		for (int var4 = 0; var4 < IDKType.field2289.length; var4++) {
			if (IDKType.field2289[var4] == var1) {
				Statics.field2119.field10044.method8231(var4, var2, Statics.field7650);
				return;
			}
		}
	}

	@ObfuscatedName("ql.cx(Lrn;B)V")
	public static final void method8138(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (Statics.field2119.field10044 != null) {
			Statics.field2119.field10044.method8260(var1, var2);
		}
	}

	@ObfuscatedName("is.cn(Lrn;I)V")
	public static final void method4632(ClientScriptState arg0) {
		boolean var1 = arg0.field5215[--arg0.field5216] != 0;
		if (Statics.field2119.field10044 != null) {
			Statics.field2119.field10044.method8233(var1);
		}
	}

	@ObfuscatedName("fk.cf(Lrn;B)V")
	public static final void method3631(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (Statics.field2119.field10044 != null) {
			Statics.field2119.field10044.method8234(var1, var2, Statics.field3492);
		}
	}

	@ObfuscatedName("mn.cs(Lew;Lej;Lrn;I)V")
	public static final void method6334(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 4;
		arg0.field1772 = arg2.field5215[arg2.field5216];
		arg0.field1774 = arg2.field5215[arg2.field5216 + 1];
		int var3 = arg2.field5215[arg2.field5216 + 2];
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 5) {
			var3 = 5;
		}
		int var4 = arg2.field5215[arg2.field5216 + 3];
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 5) {
			var4 = 5;
		}
		arg0.field1829 = (byte) var3;
		arg0.field1769 = (byte) var4;
		client.method12939(arg0);
		client.method3293(arg1, arg0);
		if (arg0.field1766 == 0) {
			client.method12722(arg1, arg0, false);
		}
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method7185(arg0.field1764);
		}
	}

	@ObfuscatedName("md.cr(Lrn;I)V")
	public static final void method6580(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6334(var2, var3, arg0);
	}

	@ObfuscatedName("nf.cp(Lrn;I)V")
	public static final void method6641(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method6334(var2, var3, arg0);
	}

	@ObfuscatedName("ki.ci(Lew;Lej;Lrn;I)V")
	public static final void method5023(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 4;
		arg0.field1910 = arg2.field5215[arg2.field5216];
		arg0.field1775 = arg2.field5215[arg2.field5216 + 1];
		arg0.field1819 = 0;
		arg0.field1895 = 0;
		int var3 = arg2.field5215[arg2.field5216 + 2];
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 4) {
			var3 = 4;
		}
		int var4 = arg2.field5215[arg2.field5216 + 3];
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 4) {
			var4 = 4;
		}
		arg0.field1856 = (byte) var3;
		arg0.field1771 = (byte) var4;
		client.method12939(arg0);
		client.method3293(arg1, arg0);
		if (arg0.field1766 == 0) {
			client.method12722(arg1, arg0, false);
		}
	}

	@ObfuscatedName("ci.ca(Lrn;B)V")
	public static final void method2386(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method5023(var2, var3, arg0);
	}

	@ObfuscatedName("tz.ch(Lrn;B)V")
	public static final void method11489(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method5023(var2, var3, arg0);
	}

	@ObfuscatedName("jh.cv(Lew;Lej;Lrn;I)V")
	public static final void method4788(ComType arg0, IfType arg1, ClientScriptState arg2) {
		boolean var3 = arg2.field5215[--arg2.field5216] == 1;
		if (arg0.field1807 != var3) {
			arg0.field1807 = var3;
			client.method12939(arg0);
		}
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method3097(arg0.field1764);
		}
	}

	@ObfuscatedName("wx.ck(Lrn;I)V")
	public static final void method12651(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method4788(var2, var3, arg0);
	}

	@ObfuscatedName("sp.cd(Lrn;I)V")
	public static final void method11256(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method4788(var2, var3, arg0);
	}

	@ObfuscatedName("oc.ce(Lew;Lej;Lrn;B)V")
	public static final void method7379(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 2;
		arg0.field1923 = arg2.field5215[arg2.field5216];
		arg0.field1781 = arg2.field5215[arg2.field5216 + 1];
		client.method12939(arg0);
		client.method3293(arg1, arg0);
		if (arg0.field1766 == 0) {
			client.method12722(arg1, arg0, false);
		}
	}

	@ObfuscatedName("ki.ct(Lrn;I)V")
	public static final void method5024(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7379(var2, var3, arg0);
	}

	@ObfuscatedName("em.cu(Lrn;I)V")
	public static final void method3466(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7379(var2, var3, arg0);
	}

	@ObfuscatedName("n.cc(Lew;Lej;Lrn;I)V")
	public static final void method1381(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1787 = arg2.field5215[--arg2.field5216] == 1;
	}

	@ObfuscatedName("b.cg(Lrn;S)V")
	public static final void method1590(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1381(var2, var3, arg0);
	}

	@ObfuscatedName("aav.cj(Lrn;I)V")
	public static final void method14120(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1381(var2, var3, arg0);
	}

	@ObfuscatedName("nv.cy(Lew;Lej;Lrn;B)V")
	public static final void method6792(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 2;
		arg0.field1857 = arg2.field5215[arg2.field5216];
		if (arg0.field1857 > arg0.field1790 - arg0.field1863) {
			arg0.field1857 = arg0.field1790 - arg0.field1863;
		}
		if (arg0.field1857 < 0) {
			arg0.field1857 = 0;
		}
		arg0.field1739 = arg2.field5215[arg2.field5216 + 1];
		if (arg0.field1739 > arg0.field1894 - arg0.field1929) {
			arg0.field1739 = arg0.field1894 - arg0.field1929;
		}
		if (arg0.field1739 < 0) {
			arg0.field1739 = 0;
		}
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method15881(arg0.field1764);
		}
	}

	@ObfuscatedName("lp.cz(Lrn;I)V")
	public static final void method6027(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6792(var2, var3, arg0);
	}

	@ObfuscatedName("cd.dl(Lrn;I)V")
	public static final void method2495(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method6792(var2, var3, arg0);
	}

	@ObfuscatedName("pf.dj(Lew;Lej;Lrn;I)V")
	public static final void method7912(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1792 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method15629(arg0.field1764);
		}
	}

	@ObfuscatedName("lg.dw(Lrn;I)V")
	public static final void method5808(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7912(var2, var3, arg0);
	}

	@ObfuscatedName("abm.dg(Lrn;B)V")
	public static final void method14210(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method15567(var2, var3, arg0);
	}

	@ObfuscatedName("aju.do(Lrn;B)V")
	public static final void method16790(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method15567(var2, var3, arg0);
	}

	@ObfuscatedName("ez.db(Lew;Lej;Lrn;B)V")
	public static final void method3060(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1794 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
	}

	@ObfuscatedName("gk.dx(Lrn;B)V")
	public static final void method3951(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3060(var2, var3, arg0);
	}

	@ObfuscatedName("li.de(Lew;Lej;Lrn;I)V")
	public static final void method5590(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1791 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
	}

	@ObfuscatedName("dv.dk(Lrn;I)V")
	public static final void method2846(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method5590(var2, var3, arg0);
	}

	@ObfuscatedName("cy.du(Lrn;S)V")
	public static final void method2583(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method5590(var2, var3, arg0);
	}

	@ObfuscatedName("ck.dz(Lew;Lej;Lrn;B)V")
	public static final void method2475(ComType arg0, IfType arg1, ClientScriptState arg2) {
		int var3 = arg2.field5215[--arg2.field5216];
		if (arg0.field1797 != var3) {
			arg0.field1797 = var3;
			client.method12939(arg0);
		}
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method15683(arg0.field1764);
		}
	}

	@ObfuscatedName("agp.ds(Lrn;I)V")
	public static final void method15949(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method2475(var2, var3, arg0);
	}

	@ObfuscatedName("qy.dc(Lrn;I)V")
	public static final void method8346(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method2475(var2, var3, arg0);
	}

	@ObfuscatedName("q.dy(Lew;Lej;Lrn;B)V")
	public static final void method1400(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1783 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
	}

	@ObfuscatedName("dd.dt(Lrn;I)V")
	public static final void method2810(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1400(var2, var3, arg0);
	}

	@ObfuscatedName("nk.dd(Lrn;B)V")
	public static final void method6847(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1400(var2, var3, arg0);
	}

	@ObfuscatedName("mv.da(Lew;Lej;Lrn;I)V")
	public static final void method6308(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1799 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
	}

	@ObfuscatedName("gf.dr(Lrn;B)V")
	public static final void method4002(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6308(var2, var3, arg0);
	}

	@ObfuscatedName("p.dv(Lew;Lej;Lrn;I)V")
	public static final void method1412(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1806 = 1;
		arg0.field1838 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			Statics.method4107(arg0.field1764);
		}
	}

	@ObfuscatedName("fz.dn(Lrn;I)V")
	public static final void method3660(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1412(var2, var3, arg0);
	}

	@ObfuscatedName("al.dm(Lrn;B)V")
	public static final void method1815(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1412(var2, var3, arg0);
	}

	@ObfuscatedName("acp.dq(Lew;Lej;Lrn;I)V")
	public static final void method14729(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 6;
		arg0.field1810 = arg2.field5215[arg2.field5216];
		arg0.field1824 = arg2.field5215[arg2.field5216 + 1];
		arg0.field1812 = arg2.field5215[arg2.field5216 + 2];
		arg0.field1813 = arg2.field5215[arg2.field5216 + 3];
		arg0.field1814 = arg2.field5215[arg2.field5216 + 4];
		arg0.field1818 = arg2.field5215[arg2.field5216 + 5];
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method8721(arg0.field1764);
			DelayedStateChange.method12329(arg0.field1764);
		}
	}

	@ObfuscatedName("n.et(Lrn;S)V")
	public static final void method1374(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method14729(var2, var3, arg0);
	}

	@ObfuscatedName("et.eu(Lrn;I)V")
	public static final void method2924(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method14729(var2, var3, arg0);
	}

	@ObfuscatedName("ra.eg(Lew;Lej;Lrn;I)V")
	public static final void method829(ComType arg0, IfType arg1, ClientScriptState arg2) {
		int var3 = arg2.field5215[--arg2.field5216];
		if (arg0.field1747 != var3) {
			if (var3 == -1) {
				arg0.field1789 = null;
			} else {
				if (arg0.field1789 == null) {
					arg0.field1789 = new InterfaceAnimationNode();
				}
				arg0.field1789.method11769(var3);
			}
			arg0.field1747 = var3;
			client.method12939(arg0);
		}
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method7890(arg0.field1764);
		}
	}

	@ObfuscatedName("ady.ev(Lrn;I)V")
	public static final void method15216(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method829(var2, var3, arg0);
	}

	@ObfuscatedName("cy.er(Lrn;I)V")
	public static final void method2584(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method829(var2, var3, arg0);
	}

	@ObfuscatedName("ee.eq(Lew;Lej;Lrn;B)V")
	public static final void method3098(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1821 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
	}

	@ObfuscatedName("mz.en(Lrn;I)V")
	public static final void method6347(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3098(var2, var3, arg0);
	}

	@ObfuscatedName("abh.ez(Lrn;I)V")
	public static final void method14217(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3098(var2, var3, arg0);
	}

	@ObfuscatedName("ga.eh(Lew;Lej;Lrn;I)V")
	public static final void method4103(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 4;
		arg0.field1828 = arg2.field5215[arg2.field5216];
		arg0.field1809 = arg2.field5215[arg2.field5216 + 1];
		arg0.field1830 = arg2.field5215[arg2.field5216 + 2];
		arg0.field1831 = arg2.field5215[arg2.field5216 + 3];
		client.method12939(arg0);
	}

	@ObfuscatedName("po.ed(Lrn;I)V")
	public static final void method7812(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method4103(var2, var3, arg0);
	}

	@ObfuscatedName("qq.es(Lew;Lej;Lrn;I)V")
	public static final void method8067(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (!var3.equals(arg0.field1825)) {
			arg0.field1825 = var3;
			client.method12939(arg0);
		}
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method3929(arg0.field1764);
		}
	}

	@ObfuscatedName("cd.ej(Lrn;B)V")
	public static final void method2489(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method8067(var2, var3, arg0);
	}

	@ObfuscatedName("pw.ew(Lrn;I)V")
	public static final void method7858(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method8067(var2, var3, arg0);
	}

	@ObfuscatedName("ge.el(Lew;Lej;Lrn;B)V")
	public static final void method3981(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1793 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method11667(arg0.field1764);
		}
	}

	@ObfuscatedName("qo.ei(Lrn;I)V")
	public static final void method8080(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3981(var2, var3, arg0);
	}

	@ObfuscatedName("ga.eo(Lrn;S)V")
	public static final void method4102(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3981(var2, var3, arg0);
	}

	@ObfuscatedName("qz.ef(Lew;Lej;Lrn;I)V")
	public static final void method8269(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 3;
		arg0.field1836 = arg2.field5215[arg2.field5216];
		arg0.field1837 = arg2.field5215[arg2.field5216 + 1];
		arg0.field1835 = arg2.field5215[arg2.field5216 + 2];
		client.method12939(arg0);
	}

	@ObfuscatedName("pb.ex(Lrn;I)V")
	public static final void method7833(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method8269(var2, var3, arg0);
	}

	@ObfuscatedName("io.eb(Lrn;I)V")
	public static final void method4598(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method8269(var2, var3, arg0);
	}

	@ObfuscatedName("em.ec(Lew;Lej;Lrn;I)V")
	public static final void method3463(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1901 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
	}

	@ObfuscatedName("jv.em(Lrn;I)V")
	public static final void method4720(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3463(var2, var3, arg0);
	}

	@ObfuscatedName("ae.ey(Lew;Lej;Lrn;B)V")
	public static final void method1965(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1860 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method1382(arg0.field1764);
		}
	}

	@ObfuscatedName("dz.ek(Lrn;I)V")
	public static final void method2716(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1965(var2, var3, arg0);
	}

	@ObfuscatedName("da.ep(Lrn;B)V")
	public static final void method2814(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1965(var2, var3, arg0);
	}

	@ObfuscatedName("fg.fd(Lew;Lej;Lrn;I)V")
	public static final void method3641(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1800 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
	}

	@ObfuscatedName("pj.fr(Lrn;I)V")
	public static final void method7892(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3641(var2, var3, arg0);
	}

	@ObfuscatedName("ck.fa(Lrn;I)V")
	public static final void method2469(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3641(var2, var3, arg0);
	}

	@ObfuscatedName("dc.fc(Lew;Lej;Lrn;I)V")
	public static final void method2787(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1801 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
	}

	@ObfuscatedName("et.fn(Lew;Lej;Lrn;I)V")
	public static final void method2916(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1770 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
	}

	@ObfuscatedName("ed.fl(Lrn;I)V")
	public static final void method3080(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method2916(var2, var3, arg0);
	}

	@ObfuscatedName("aaf.ff(Lrn;I)V")
	public static final void method14059(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method2916(var2, var3, arg0);
	}

	@ObfuscatedName("g.fx(Lew;Lej;Lrn;I)V")
	public static final void method1626(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1803 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
	}

	@ObfuscatedName("kk.fj(Lrn;B)V")
	public static final void method5566(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1626(var2, var3, arg0);
	}

	@ObfuscatedName("oz.fo(Lew;Lej;Lrn;B)V")
	public static final void method7574(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 2;
		arg0.field1790 = arg2.field5215[arg2.field5216];
		arg0.field1894 = arg2.field5215[arg2.field5216 + 1];
		client.method12939(arg0);
		if (arg0.field1766 == 0) {
			client.method12722(arg1, arg0, false);
		}
	}

	@ObfuscatedName("lk.fm(Lrn;I)V")
	public static final void method5573(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7574(var2, var3, arg0);
	}

	@ObfuscatedName("rr.fk(Lrn;B)V")
	public static final void method11075(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7574(var2, var3, arg0);
	}

	@ObfuscatedName("vi.fu(Lrn;I)V")
	public static final void method12384(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method12994(var2, var3, arg0);
	}

	@ObfuscatedName("pe.fh(Lrn;I)V")
	public static final void method7686(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method12994(var2, var3, arg0);
	}

	@ObfuscatedName("dl.fz(Lew;Lej;Lrn;B)V")
	public static final void method2604(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1818 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method8721(arg0.field1764);
		}
	}

	@ObfuscatedName("nt.fi(Lrn;I)V")
	public static final void method6649(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method2604(var2, var3, arg0);
	}

	@ObfuscatedName("rk.fw(Lew;Lej;Lrn;I)V")
	public static final void method8485(ComType arg0, IfType arg1, ClientScriptState arg2) {
		int var3 = arg2.field5215[--arg2.field5216];
		arg0.field1796 = var3 == 1;
		client.method12939(arg0);
	}

	@ObfuscatedName("cj.fs(Lrn;I)V")
	public static final void method2574(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method8485(var2, var3, arg0);
	}

	@ObfuscatedName("aai.fq(Lew;Lej;Lrn;I)V")
	public static final void method14086(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 2;
		arg0.field1811 = arg2.field5215[arg2.field5216];
		arg0.field1916 = arg2.field5215[arg2.field5216 + 1];
		client.method12939(arg0);
	}

	@ObfuscatedName("p.ft(Lrn;B)V")
	public static final void method1413(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method14086(var2, var3, arg0);
	}

	@ObfuscatedName("iy.gw(Lrn;I)V")
	public static final void method4696(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method14086(var2, var3, arg0);
	}

	@ObfuscatedName("y.gn(Lew;Lej;Lrn;S)V")
	public static final void method1637(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1839 = arg2.field5215[--arg2.field5216];
		client.method12939(arg0);
	}

	@ObfuscatedName("fh.gp(Lrn;I)V")
	public static final void method3654(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1637(var2, var3, arg0);
	}

	@ObfuscatedName("ev.gq(Lrn;B)V")
	public static final void method2986(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1637(var2, var3, arg0);
	}

	@ObfuscatedName("ack.gk(Lrn;I)V")
	public static final void method14904(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method7967(var2, var3, arg0);
	}

	@ObfuscatedName("tj.gm(Lew;Lej;Lrn;I)V")
	public static final void method11850(ComType arg0, IfType arg1, ClientScriptState arg2) {
		int var3 = arg2.field5215[--arg2.field5216];
		String var4 = (String) arg2.field5222[--arg2.field5230];
		ParamType var5 = Statics.field4464.method12600(var3);
		if (var5.field7288.equals(var4)) {
			arg0.method3129(var3);
		} else {
			arg0.method3128(var3, var4);
		}
	}

	@ObfuscatedName("sj.gh(Lrn;I)V")
	public static final void method11309(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method11850(var2, var3, arg0);
	}

	@ObfuscatedName("w.ge(Lrn;B)V")
	public static final void method1559(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method11850(var2, var3, arg0);
	}

	@ObfuscatedName("sc.gr(Lew;Lej;Lrn;I)V")
	public static final void method11259(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 3;
		int var3 = arg2.field5215[arg2.field5216];
		short var4 = (short) arg2.field5215[arg2.field5216 + 1];
		short var5 = (short) arg2.field5215[arg2.field5216 + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.method3158(var3, var4, var5);
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method1981(arg0.field1764, var3);
		}
	}

	@ObfuscatedName("jc.gf(Lrn;I)V")
	public static final void method4737(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method11259(var2, var3, arg0);
	}

	@ObfuscatedName("jr.gl(Lrn;I)V")
	public static final void method4779(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method11259(var2, var3, arg0);
	}

	@ObfuscatedName("rk.gb(Lew;Lej;Lrn;B)V")
	public static final void method8481(ComType arg0, IfType arg1, ClientScriptState arg2) {
		int var3 = arg2.field5215[--arg2.field5216];
		if (arg0.field1737 != var3) {
			arg0.field1737 = var3;
			client.method12939(arg0);
		}
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method5601(arg0.field1764);
		}
	}

	@ObfuscatedName("sg.go(Lew;Lej;Lrn;I)V")
	public static final void method11368(ComType arg0, IfType arg1, ClientScriptState arg2) {
		if (arg0.field1766 == 5) {
			method8481(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("nx.gi(Lrn;I)V")
	public static final void method6827(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method11368(var2, var3, arg0);
	}

	@ObfuscatedName("js.ga(Lrn;I)V")
	public static final void method4803(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method11368(var2, var3, arg0);
	}

	@ObfuscatedName("tb.gd(Lrn;I)V")
	public static final void method11397(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method7179(var2, var3, arg0);
	}

	@ObfuscatedName("qi.gj(Lrn;I)V")
	public static final void method8045(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method7179(var2, var3, arg0);
	}

	@ObfuscatedName("pp.gu(Lew;Lej;Lrn;I)V")
	public static final void method7703(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 3;
		int var3 = arg2.field5215[arg2.field5216];
		short var4 = (short) arg2.field5215[arg2.field5216 + 1];
		short var5 = (short) arg2.field5215[arg2.field5216 + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.method3131(var3, var4, var5);
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method12693(arg0.field1764, var3);
		}
	}

	@ObfuscatedName("eu.gg(Lrn;B)V")
	public static final void method2927(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7703(var2, var3, arg0);
	}

	@ObfuscatedName("pg.gy(Lrn;B)V")
	public static final void method7978(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7703(var2, var3, arg0);
	}

	@ObfuscatedName("rz.gt(Lew;Lej;Lrn;I)V")
	public static final void method8656(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1833 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method13906(arg0.field1764);
		}
	}

	@ObfuscatedName("py.gx(Lrn;B)V")
	public static final void method7980(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method8656(var2, var3, arg0);
	}

	@ObfuscatedName("ul.gv(Lrn;I)V")
	public static final void method11865(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method8656(var2, var3, arg0);
	}

	@ObfuscatedName("ck.hk(Lew;Lej;Lrn;B)V")
	public static final void method2471(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1805 = arg2.field5215[--arg2.field5216] == 1;
		client.method12939(arg0);
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method4568(arg0.field1764);
		}
	}

	@ObfuscatedName("jv.hy(Lrn;I)V")
	public static final void method4725(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method2471(var2, var3, arg0);
	}

	@ObfuscatedName("nb.hq(Lrn;B)V")
	public static final void method6818(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method2471(var2, var3, arg0);
	}

	@ObfuscatedName("aju.hx(Lew;Lej;Lrn;I)V")
	public static final void method16788(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1806 = 2;
		arg0.field1930 = null;
		arg0.field1838 = arg2.field5215[--arg2.field5216];
		if (arg0.field1765 == -1 && !arg1.field1734) {
			Statics.method4107(arg0.field1764);
		}
	}

	@ObfuscatedName("tz.hs(Lrn;I)V")
	public static final void method11490(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method16788(var2, var3, arg0);
	}

	@ObfuscatedName("pw.ha(Lrn;B)V")
	public static final void method7857(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method16788(var2, var3, arg0);
	}

	@ObfuscatedName("vu.hc(Lrn;I)V")
	public static final void method12204(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method8049(var2, var3, arg0);
	}

	@ObfuscatedName("ap.hn(Lrn;B)V")
	public static final void method1722(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method8049(var2, var3, arg0);
	}

	@ObfuscatedName("oh.hd(Lew;Lej;ZILrn;B)V")
	public static final void method7651(ComType arg0, IfType arg1, boolean arg2, int arg3, ClientScriptState arg4) {
		arg4.field5216 -= 2;
		int var5 = arg4.field5215[arg4.field5216];
		int var6 = arg4.field5215[arg4.field5216 + 1];
		if (arg0.field1765 == -1 && !arg1.field1734) {
			DelayedStateChange.method6563(arg0.field1764);
			DelayedStateChange.method8721(arg0.field1764);
			DelayedStateChange.method12329(arg0.field1764);
		}
		if (var5 == -1) {
			arg0.field1806 = 1;
			arg0.field1838 = -1;
			arg0.field1903 = -1;
			return;
		}
		arg0.field1903 = var5;
		arg0.field1904 = var6;
		arg0.field1913 = arg2;
		ObjType var7 = Statics.field3492.method12316(var5);
		arg0.field1812 = var7.field7073;
		arg0.field1813 = var7.field7077;
		arg0.field1814 = var7.field7088;
		arg0.field1810 = var7.field7076;
		arg0.field1824 = var7.field7075;
		arg0.field1818 = var7.field7072;
		arg0.field1823 = arg3;
		if (arg0.field1819 > 0) {
			arg0.field1818 = arg0.field1818 * 32 / arg0.field1819;
		} else if (arg0.field1910 > 0) {
			arg0.field1818 = arg0.field1818 * 32 / arg0.field1910;
		}
	}

	@ObfuscatedName("acm.hw(Lrn;I)V")
	public static final void method14743(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7651(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("zz.hu(Lrn;I)V")
	public static final void method13880(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7651(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("fy.ht(Lrn;I)V")
	public static final void method3597(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7651(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("ar.hl(Lrn;I)V")
	public static final void method1701(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7651(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("on.hj(Lrn;I)V")
	public static final void method7180(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7651(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("s.hf(Lrn;I)V")
	public static final void method1316(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7651(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("aeb.hz(Lrn;I)V")
	public static final void method15480(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7651(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("mq.hr(Lrn;I)V")
	public static final void method6403(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7651(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("qf.hv(Lrn;I)V")
	public static final void method8228(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7651(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("iv.hg(Lrn;S)V")
	public static final void method4579(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7651(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("aw.hi(Lrn;I)V")
	public static final void method1881(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7651(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("rx.ip(Lew;Lej;Lrn;I)V")
	public static final void method8585(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1806 = 6;
		arg0.field1930 = null;
		arg0.field1838 = arg2.field5215[--arg2.field5216];
		if (arg0.field1765 == -1 && !arg1.field1734) {
			Statics.method4107(arg0.field1764);
		}
	}

	@ObfuscatedName("pq.ir(Lrn;B)V")
	public static final void method7718(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method8585(var2, var3, arg0);
	}

	@ObfuscatedName("dp.ie(Lrn;I)V")
	public static final void method2614(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method8585(var2, var3, arg0);
	}

	@ObfuscatedName("st.in(Lrn;B)V")
	public static final void method11155(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method6788(var2, var3, arg0);
	}

	@ObfuscatedName("rq.ih(Lrn;I)V")
	public static final void method11080(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method6788(var2, var3, arg0);
	}

	@ObfuscatedName("ph.ig(Lew;Lej;Lrn;I)V")
	public static final void method7880(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 4;
		arg0.field1906 = arg2.field5215[arg2.field5216];
		arg0.field1909 = arg2.field5215[arg2.field5216 + 1];
		arg0.field1785 = arg2.field5215[arg2.field5216 + 2];
		arg0.field1911 = arg2.field5215[arg2.field5216 + 3];
		client.method12939(arg0);
	}

	@ObfuscatedName("ao.ia(Lrn;I)V")
	public static final void method1809(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7880(var2, var3, arg0);
	}

	@ObfuscatedName("jj.iw(Lrn;I)V")
	public static final void method4775(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7880(var2, var3, arg0);
	}

	@ObfuscatedName("acg.iq(Lew;Lej;Lrn;I)V")
	public static final void method14903(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 2;
		arg0.field1907 = arg2.field5215[arg2.field5216];
		arg0.field1908 = arg2.field5215[arg2.field5216 + 1];
		client.method12939(arg0);
	}

	@ObfuscatedName("px.ij(Lrn;I)V")
	public static final void method7722(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method14903(var2, var3, arg0);
	}

	@ObfuscatedName("iq.id(Lew;Lej;Lrn;I)V")
	public static final void method4571(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 4;
		arg0.field1838 = arg2.field5215[arg2.field5216];
		arg0.field1832 = arg2.field5215[arg2.field5216 + 1];
		if (arg2.field5215[arg2.field5216 + 2] == 1) {
			arg0.field1806 = 9;
		} else {
			arg0.field1806 = 8;
		}
		if (arg2.field5215[arg2.field5216 + 3] == 1) {
			arg0.field1913 = true;
		} else {
			arg0.field1913 = false;
		}
		if (arg0.field1765 == -1 && !arg1.field1734) {
			Statics.method4107(arg0.field1764);
		}
	}

	@ObfuscatedName("na.io(Lrn;I)V")
	public static final void method1221(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method4571(var2, var3, arg0);
	}

	@ObfuscatedName("xa.ib(Lrn;S)V")
	public static final void method236(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method4571(var2, var3, arg0);
	}

	@ObfuscatedName("ar.ix(Lew;Lej;Lrn;B)V")
	public static final void method1702(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1806 = 5;
		arg0.field1838 = client.field9071;
		arg0.field1832 = 0;
		if (arg0.field1765 == -1 && !arg1.field1734) {
			Statics.method4107(arg0.field1764);
		}
	}

	@ObfuscatedName("pq.iz(Lrn;I)V")
	public static final void method7713(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1702(var2, var3, arg0);
	}

	@ObfuscatedName("pt.is(Lrn;I)V")
	public static final void method7728(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1702(var2, var3, arg0);
	}

	@ObfuscatedName("abo.im(Lew;Lej;Lrn;I)V")
	public static final void method14310(ComType arg0, IfType arg1, ClientScriptState arg2) {
		int var3 = arg2.field5215[--arg2.field5216] - 1;
		if (var3 >= 0 && var3 <= 9) {
			arg0.method3166(var3, (String) arg2.field5222[--arg2.field5230]);
		} else {
			arg2.field5230--;
		}
	}

	@ObfuscatedName("eb.ik(Lrn;I)V")
	public static final void method3323(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method14310(var2, var3, arg0);
	}

	@ObfuscatedName("an.iu(Lrn;I)V")
	public static final void method1713(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method14310(var2, var3, arg0);
	}

	@ObfuscatedName("kj.ic(Lew;Lej;Lrn;I)V")
	public static final void method5544(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 2;
		int var3 = arg2.field5215[arg2.field5216];
		int var4 = arg2.field5215[arg2.field5216 + 1];
		if (var3 == -1 && var4 == -1) {
			arg0.field1759 = null;
		} else {
			arg0.field1759 = ComType.method15145(var3, var4);
		}
	}

	@ObfuscatedName("lc.iy(Lrn;I)V")
	public static final void method5965(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method5544(var2, var3, arg0);
	}

	@ObfuscatedName("qz.if(Lrn;I)V")
	public static final void method8270(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method5544(var2, var3, arg0);
	}

	@ObfuscatedName("aar.il(Lew;Lej;Lrn;I)V")
	public static final void method13907(ComType arg0, IfType arg1, ClientScriptState arg2) {
		int var3 = arg2.field5215[--arg2.field5216];
		if (ComType.field1808 == var3 || ComType.field1738 == var3 || ComType.field1921 == var3) {
			arg0.field1859 = var3;
		}
	}

	@ObfuscatedName("nc.it(Lrn;I)V")
	public static final void method6850(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method13907(var2, var3, arg0);
	}

	@ObfuscatedName("aeo.jv(Lrn;I)V")
	public static final void method15609(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method13907(var2, var3, arg0);
	}

	@ObfuscatedName("ew.jm(Lew;Lej;Lrn;B)V")
	public static final void method3202(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1848 = arg2.field5215[--arg2.field5216];
	}

	@ObfuscatedName("th.jc(Lrn;B)V")
	public static final void method11711(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3202(var2, var3, arg0);
	}

	@ObfuscatedName("rk.jf(Lrn;B)V")
	public static final void method8482(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3202(var2, var3, arg0);
	}

	@ObfuscatedName("ra.jx(Lew;Lej;Lrn;I)V")
	public static final void method830(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1870 = arg2.field5215[--arg2.field5216];
	}

	@ObfuscatedName("cy.jj(Lrn;I)V")
	public static final void method2588(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method830(var2, var3, arg0);
	}

	@ObfuscatedName("ct.jr(Lrn;B)V")
	public static final void method2538(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method830(var2, var3, arg0);
	}

	@ObfuscatedName("ux.jh(Lew;Lej;Lrn;I)V")
	public static final void method11906(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1795 = (String) arg2.field5222[--arg2.field5230];
	}

	@ObfuscatedName("ac.js(Lrn;I)V")
	public static final void method1975(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method11906(var2, var3, arg0);
	}

	@ObfuscatedName("fd.ja(Lew;Lej;Lrn;I)V")
	public static final void method3504(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1914 = (String) arg2.field5222[--arg2.field5230];
	}

	@ObfuscatedName("ee.jp(Lrn;B)V")
	public static final void method3094(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3504(var2, var3, arg0);
	}

	@ObfuscatedName("eu.jo(Lrn;I)V")
	public static final void method2928(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3504(var2, var3, arg0);
	}

	@ObfuscatedName("fh.je(Lrn;B)V")
	public static final void method3650(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method3319(var2, var3, arg0);
	}

	@ObfuscatedName("nj.ju(Lrn;I)V")
	public static final void method6968(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method3319(var2, var3, arg0);
	}

	@ObfuscatedName("ae.jw(Lew;Lej;Lrn;B)V")
	public static final void method1966(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1763 = arg2.field5215[--arg2.field5216];
		arg0.field1827 = arg2.field5215[--arg2.field5216];
	}

	@ObfuscatedName("mv.jg(Lrn;B)V")
	public static final void method6314(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1966(var2, var3, arg0);
	}

	@ObfuscatedName("rs.jt(Lrn;B)V")
	public static final void method8543(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1966(var2, var3, arg0);
	}

	@ObfuscatedName("ax.jy(Lew;Lej;Lrn;I)V")
	public static final void method1841(ComType arg0, IfType arg1, ClientScriptState arg2) {
		int var3 = arg2.field5215[--arg2.field5216];
		int var4 = arg2.field5215[--arg2.field5216];
		if (var4 >= 1 && var4 <= 10) {
			arg0.method3123(var4 - 1, var3);
		}
	}

	@ObfuscatedName("gd.jz(Lrn;I)V")
	public static final void method4120(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1841(var2, var3, arg0);
	}

	@ObfuscatedName("fr.jn(Lrn;I)V")
	public static final void method3523(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1841(var2, var3, arg0);
	}

	@ObfuscatedName("it.jq(Lew;Lej;Lrn;I)V")
	public static final void method4712(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.field1853 = (String) arg2.field5222[--arg2.field5230];
	}

	@ObfuscatedName("pg.jk(Lrn;I)V")
	public static final void method7974(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method4712(var2, var3, arg0);
	}

	@ObfuscatedName("ao.jb(Lrn;I)V")
	public static final void method1808(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method4712(var2, var3, arg0);
	}

	@ObfuscatedName("aau.kr(Lrn;I)V")
	public static final void method14088(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method5069(var2, var3, arg0);
	}

	@ObfuscatedName("p.kh(Lrn;B)V")
	public static final void method1418(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method5069(var2, var3, arg0);
	}

	@ObfuscatedName("an.kb(Lew;IILrn;B)V")
	public static final void method1718(ComType arg0, int arg1, int arg2, ClientScriptState arg3) {
		if (arg0.field1846 == null) {
			if (arg2 <= 0) {
				return;
			}
			arg0.field1905 = new byte[11][];
			arg0.field1844 = new byte[11][];
			arg0.field1845 = new int[11];
			arg0.field1846 = new int[11];
		}
		arg0.field1846[arg1] = arg2;
		if (arg2 > 0) {
			arg0.field1842 = true;
			return;
		}
		arg0.field1842 = false;
		for (int var4 = 0; var4 < arg0.field1905.length; var4++) {
			if (arg0.field1905[var4] != null || arg0.field1846[var4] > 0) {
				arg0.field1842 = true;
				break;
			}
		}
	}

	@ObfuscatedName("rh.ky(Lew;Lrn;B)V")
	public static final void method8614(ComType arg0, ClientScriptState arg1) {
		arg1.field5216 -= 2;
		int var2 = arg1.field5215[arg1.field5216] - 1;
		int var3 = arg1.field5215[arg1.field5216 + 1];
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		method1718(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("vw.ks(Lrn;I)V")
	public static final void method12345(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		method8614(var2, arg0);
	}

	@ObfuscatedName("nw.kv(Lew;Lrn;I)V")
	public static final void method7054(ComType arg0, ClientScriptState arg1) {
		byte var2 = 10;
		int var3 = arg1.field5215[--arg1.field5216];
		method1718(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("pd.ku(Lrn;B)V")
	public static final void method7677(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		method7054(var2, arg0);
	}

	@ObfuscatedName("z.kq(Lew;I[B[BLrn;I)V")
	public static final void method1368(ComType arg0, int arg1, byte[] arg2, byte[] arg3, ClientScriptState arg4) {
		if (arg0.field1905 == null) {
			if (arg2 == null) {
				return;
			}
			arg0.field1905 = new byte[11][];
			arg0.field1844 = new byte[11][];
			arg0.field1845 = new int[11];
			arg0.field1846 = new int[11];
		}
		arg0.field1905[arg1] = arg2;
		if (arg2 == null) {
			arg0.field1842 = false;
			for (int var5 = 0; var5 < arg0.field1905.length; var5++) {
				if (arg0.field1905[var5] != null || arg0.field1846[var5] > 0) {
					arg0.field1842 = true;
					break;
				}
			}
		} else {
			arg0.field1842 = true;
		}
		arg0.field1844[arg1] = arg3;
	}

	@ObfuscatedName("dd.kc(Lew;[B[BLrn;I)V")
	public static final void method2813(ComType arg0, byte[] arg1, byte[] arg2, ClientScriptState arg3) {
		int var4 = arg3.field5215[--arg3.field5216] - 1;
		if (var4 < 0 || var4 > 9) {
			throw new RuntimeException();
		}
		method1368(arg0, var4, arg1, arg2, arg3);
	}

	@ObfuscatedName("fg.kn(Lrn;I)V")
	public static final void method3639(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5216 -= 10;
		byte[] var3 = null;
		byte[] var4 = null;
		int var5;
		for (var5 = 0; var5 < 10 && arg0.field5215[arg0.field5216 + var5] >= 0; var5 += 2) {
		}
		if (var5 > 0) {
			var3 = new byte[var5 / 2];
			var4 = new byte[var5 / 2];
			for (var5 -= 2; var5 >= 0; var5 -= 2) {
				var3[var5 / 2] = (byte) arg0.field5215[arg0.field5216 + var5];
				var4[var5 / 2] = (byte) arg0.field5215[arg0.field5216 + var5 + 1];
			}
		}
		method2813(var2, var3, var4, arg0);
	}

	@ObfuscatedName("iz.ko(Lew;Lej;Lrn;I)V")
	public static final void method4625(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg2.field5216 -= 2;
		byte var3 = 10;
		byte[] var4 = new byte[] { (byte) arg2.field5215[arg2.field5216] };
		byte[] var5 = new byte[] { (byte) arg2.field5215[arg2.field5216 + 1] };
		method1368(arg0, var3, var4, var5, arg2);
	}

	@ObfuscatedName("ez.kt(Lrn;I)V")
	public static final void method3062(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method4625(var2, var3, arg0);
	}

	@ObfuscatedName("qz.kl(Lrn;I)V")
	public static final void method8273(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method4625(var2, var3, arg0);
	}

	@ObfuscatedName("oy.kd(Lrn;B)V")
	public static final void method7395(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method7900(var2, var3, arg0);
	}

	@ObfuscatedName("dm.kz(Lrn;I)V")
	public static final void method2885(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method7900(var2, var3, arg0);
	}

	@ObfuscatedName("ns.kf(Lew;Lej;Lrn;I)V")
	public static final void method6973(ComType arg0, IfType arg1, ClientScriptState arg2) {
		arg0.method3156();
	}

	@ObfuscatedName("aja.kw(Lrn;I)V")
	public static final void method16682(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6973(var2, var3, arg0);
	}

	@ObfuscatedName("fi.ke(Ljava/lang/String;Lrn;B)[I")
	public static final int[] method3662(String arg0, ClientScriptState arg1) {
		int[] var2 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			int var3 = arg1.field5215[--arg1.field5216];
			if (var3 > 0) {
				var2 = new int[var3];
				while (var3-- > 0) {
					var2[var3] = arg1.field5215[--arg1.field5216];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("ql.km(Ljava/lang/String;Lrn;I)[Ljava/lang/Object;")
	public static final Object[] method8142(String arg0, ClientScriptState arg1) {
		Object[] var2 = new Object[arg0.length() + 1];
		for (int var3 = var2.length - 1; var3 >= 1; var3--) {
			if (arg0.charAt(var3 - 1) == 's') {
				var2[var3] = arg1.field5222[--arg1.field5230];
			} else if (arg0.charAt(var3 - 1) == 167) {
				var2[var3] = Long.valueOf(arg1.field5219[--arg1.field5220]);
			} else {
				var2[var3] = Integer.valueOf(arg1.field5215[--arg1.field5216]);
			}
		}
		int var4 = arg1.field5215[--arg1.field5216];
		if (var4 == -1) {
			var2 = null;
		} else {
			var2[0] = Integer.valueOf(var4);
		}
		return var2;
	}

	@ObfuscatedName("an.kg(Lew;Lej;Lrn;I)V")
	public static final void method1720(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1912 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("zy.kk(Lrn;I)V")
	public static final void method13887(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1720(var2, var3, arg0);
	}

	@ObfuscatedName("ky.lk(Lrn;B)V")
	public static final void method5014(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1720(var2, var3, arg0);
	}

	@ObfuscatedName("c.li(Lew;Lej;Lrn;B)V")
	public static final void method1327(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1866 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("up.lb(Lrn;I)V")
	public static final void method11872(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1327(var2, var3, arg0);
	}

	@ObfuscatedName("vt.lv(Lrn;I)V")
	public static final void method12207(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1327(var2, var3, arg0);
	}

	@ObfuscatedName("mv.ls(Lew;Lej;Lrn;B)V")
	public static final void method6309(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1773 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("it.lh(Lrn;B)V")
	public static final void method4716(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6309(var2, var3, arg0);
	}

	@ObfuscatedName("ado.ly(Lrn;I)V")
	public static final void method15149(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method6309(var2, var3, arg0);
	}

	@ObfuscatedName("vt.lo(Lew;Lej;Lrn;I)V")
	public static final void method12210(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1867 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("zl.lg(Lrn;S)V")
	public static final void method13894(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method12210(var2, var3, arg0);
	}

	@ObfuscatedName("ik.lu(Lrn;B)V")
	public static final void method4653(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method12210(var2, var3, arg0);
	}

	@ObfuscatedName("uw.lq(Lew;Lej;Lrn;B)V")
	public static final void method11881(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1888 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("jj.lt(Lrn;I)V")
	public static final void method4770(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method11881(var2, var3, arg0);
	}

	@ObfuscatedName("cd.ln(Lrn;I)V")
	public static final void method2490(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method11881(var2, var3, arg0);
	}

	@ObfuscatedName("ry.lw(Lew;Lej;Lrn;I)V")
	public static final void method8498(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1750 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("sz.lc(Lrn;I)V")
	public static final void method11158(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method8498(var2, var3, arg0);
	}

	@ObfuscatedName("ks.ld(Lrn;I)V")
	public static final void method5070(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method8498(var2, var3, arg0);
	}

	@ObfuscatedName("ph.lm(Lrn;I)V")
	public static final void method7878(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method4583(var2, var3, arg0);
	}

	@ObfuscatedName("rw.lj(Lrn;I)V")
	public static final void method8604(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method4583(var2, var3, arg0);
	}

	@ObfuscatedName("mx.lz(Lrn;B)V")
	public static final void method6077(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method15654(var2, var3, arg0);
	}

	@ObfuscatedName("ec.lx(Lrn;S)V")
	public static final void method3452(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method15654(var2, var3, arg0);
	}

	@ObfuscatedName("fk.lr(Lrn;I)V")
	public static final void method3632(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method3070(var2, var3, arg0);
	}

	@ObfuscatedName("nc.la(Lrn;I)V")
	public static final void method6851(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method3070(var2, var3, arg0);
	}

	@ObfuscatedName("mn.lf(Lew;Lej;Lrn;S)V")
	public static final void method6335(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1887 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("nz.mx(Lrn;S)V")
	public static final void method6984(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6335(var2, var3, arg0);
	}

	@ObfuscatedName("fm.mf(Lrn;B)V")
	public static final void method3627(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method6335(var2, var3, arg0);
	}

	@ObfuscatedName("lk.mo(Lew;Lej;Lrn;I)V")
	public static final void method5574(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1871 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("mn.ml(Lrn;I)V")
	public static final void method6336(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method5574(var2, var3, arg0);
	}

	@ObfuscatedName("ig.mp(Lrn;I)V")
	public static final void method4556(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method5574(var2, var3, arg0);
	}

	@ObfuscatedName("rx.mv(Lew;Lej;Lrn;I)V")
	public static final void method8586(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1864 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("lp.mj(Lrn;I)V")
	public static final void method6022(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method8586(var2, var3, arg0);
	}

	@ObfuscatedName("dn.mn(Lrn;I)V")
	public static final void method2871(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method8586(var2, var3, arg0);
	}

	@ObfuscatedName("fu.mz(Lew;Lej;Lrn;B)V")
	public static final void method3648(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1868 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("qy.mk(Lrn;I)V")
	public static final void method8347(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3648(var2, var3, arg0);
	}

	@ObfuscatedName("ew.mq(Lrn;B)V")
	public static final void method3203(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3648(var2, var3, arg0);
	}

	@ObfuscatedName("ju.mh(Lew;Lej;Lrn;I)V")
	public static final void method4873(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		int[] var4 = method3662(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1876 = method8142(var3, arg2);
		arg0.field1877 = var4;
		arg0.field1861 = true;
	}

	@ObfuscatedName("acr.mw(Lrn;I)V")
	public static final void method14747(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method4873(var2, var3, arg0);
	}

	@ObfuscatedName("ue.mi(Lrn;I)V")
	public static final void method11976(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method4873(var2, var3, arg0);
	}

	@ObfuscatedName("ge.mr(Lew;Lej;Lrn;B)V")
	public static final void method3982(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		int[] var4 = method3662(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1878 = method8142(var3, arg2);
		arg0.field1879 = var4;
		arg0.field1861 = true;
	}

	@ObfuscatedName("jw.mt(Lrn;I)V")
	public static final void method4894(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3982(var2, var3, arg0);
	}

	@ObfuscatedName("oz.mb(Lrn;B)V")
	public static final void method7571(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3982(var2, var3, arg0);
	}

	@ObfuscatedName("mj.ms(Lew;Lej;Lrn;I)V")
	public static final void method6322(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1872 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("rc.mg(Lrn;B)V")
	public static final void method8610(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6322(var2, var3, arg0);
	}

	@ObfuscatedName("nc.me(Lrn;I)V")
	public static final void method6852(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method6322(var2, var3, arg0);
	}

	@ObfuscatedName("ep.ma(Lew;Lej;Lrn;B)V")
	public static final void method3497(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1889 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("zg.mm(Lrn;I)V")
	public static final void method13905(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3497(var2, var3, arg0);
	}

	@ObfuscatedName("adq.mc(Lew;Lej;Lrn;I)V")
	public static final void method15147(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1890 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("p.my(Lrn;B)V")
	public static final void method1414(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method15147(var2, var3, arg0);
	}

	@ObfuscatedName("fe.mu(Lrn;I)V")
	public static final void method3846(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method15147(var2, var3, arg0);
	}

	@ObfuscatedName("ne.ng(Lew;Lej;Lrn;I)V")
	public static final void method6947(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1891 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("vy.ni(Lrn;I)V")
	public static final void method12478(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6947(var2, var3, arg0);
	}

	@ObfuscatedName("lr.nf(Lrn;I)V")
	public static final void method6030(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method6947(var2, var3, arg0);
	}

	@ObfuscatedName("gq.nt(Lew;Lej;Lrn;B)V")
	public static final void method3927(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1892 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("ot.nv(Lrn;I)V")
	public static final void method7371(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3927(var2, var3, arg0);
	}

	@ObfuscatedName("pe.ny(Lrn;I)V")
	public static final void method7687(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3927(var2, var3, arg0);
	}

	@ObfuscatedName("pe.nb(Lew;Lej;Lrn;I)V")
	public static final void method7688(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1893 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("jc.nu(Lrn;S)V")
	public static final void method4734(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7688(var2, var3, arg0);
	}

	@ObfuscatedName("ry.nx(Lrn;I)V")
	public static final void method8496(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7688(var2, var3, arg0);
	}

	@ObfuscatedName("tu.nc(Lrn;I)V")
	public static final void method11845(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		Statics.method2929(var2, var3, arg0);
	}

	@ObfuscatedName("am.na(Lrn;I)V")
	public static final void method1907(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		Statics.method2929(var2, var3, arg0);
	}

	@ObfuscatedName("nk.nh(Lew;Lej;Lrn;I)V")
	public static final void method6844(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1898 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("vx.np(Lrn;B)V")
	public static final void method12182(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method6844(var2, var3, arg0);
	}

	@ObfuscatedName("pt.nn(Lrn;I)V")
	public static final void method7729(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method6844(var2, var3, arg0);
	}

	@ObfuscatedName("af.ne(Lew;Lej;Lrn;I)V")
	public static final void method1687(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1782 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("rm.nj(Lrn;I)V")
	public static final void method8589(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1687(var2, var3, arg0);
	}

	@ObfuscatedName("jx.ns(Lrn;I)V")
	public static final void method4753(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1687(var2, var3, arg0);
	}

	@ObfuscatedName("qb.nq(Lew;Lej;Lrn;I)V")
	public static final void method8454(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1897 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("mv.no(Lrn;I)V")
	public static final void method6313(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method8454(var2, var3, arg0);
	}

	@ObfuscatedName("oh.nm(Lew;Lej;Lrn;I)V")
	public static final void method7653(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1900 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("pt.nl(Lrn;I)V")
	public static final void method7730(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7653(var2, var3, arg0);
	}

	@ObfuscatedName("gh.nw(Lrn;B)V")
	public static final void method3976(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7653(var2, var3, arg0);
	}

	@ObfuscatedName("vg.nd(Lew;Lej;Lrn;I)V")
	public static final void method12221(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1778 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("li.oa(Lrn;B)V")
	public static final void method5593(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method12221(var2, var3, arg0);
	}

	@ObfuscatedName("fj.os(Lew;Lej;Lrn;I)V")
	public static final void method3614(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		int[] var4 = method3662(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1880 = method8142(var3, arg2);
		arg0.field1843 = var4;
		arg0.field1861 = true;
	}

	@ObfuscatedName("lo.oq(Lrn;I)V")
	public static final void method5791(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method3614(var2, var3, arg0);
	}

	@ObfuscatedName("fo.ob(Lrn;S)V")
	public static final void method3620(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method3614(var2, var3, arg0);
	}

	@ObfuscatedName("ou.ox(Lew;Lej;Lrn;I)V")
	public static final void method7560(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		int[] var4 = method3662(var3, arg2);
		if (var4 != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1882 = method8142(var3, arg2);
		arg0.field1883 = var4;
		arg0.field1861 = true;
	}

	@ObfuscatedName("er.oe(Lrn;B)V")
	public static final void method2992(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method7560(var2, var3, arg0);
	}

	@ObfuscatedName("n.ow(Lrn;I)V")
	public static final void method1375(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method7560(var2, var3, arg0);
	}

	@ObfuscatedName("aaw.oi(Lew;Lej;Lrn;B)V")
	public static final void method13914(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1788 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("aw.ot(Lrn;I)V")
	public static final void method1887(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method13914(var2, var3, arg0);
	}

	@ObfuscatedName("e.oc(Lrn;B)V")
	public static final void method1666(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method13914(var2, var3, arg0);
	}

	@ObfuscatedName("x.oy(Lew;Lej;Lrn;I)V")
	public static final void method1600(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1758 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("xa.op(Lrn;I)V")
	public static final void method233(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1600(var2, var3, arg0);
	}

	@ObfuscatedName("ajd.oo(Lrn;I)V")
	public static final void method16886(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1600(var2, var3, arg0);
	}

	@ObfuscatedName("abm.ou(Lew;Lej;Lrn;B)V")
	public static final void method14207(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1881 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("vw.oz(Lrn;I)V")
	public static final void method12344(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method14207(var2, var3, arg0);
	}

	@ObfuscatedName("ra.oj(Lrn;B)V")
	public static final void method826(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method14207(var2, var3, arg0);
	}

	@ObfuscatedName("am.od(Lew;Lej;Lrn;I)V")
	public static final void method1906(ComType arg0, IfType arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.field5222[--arg2.field5230];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1884 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("abo.ok(Lrn;B)V")
	public static final void method14311(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >> 16];
		method1906(var2, var3, arg0);
	}

	@ObfuscatedName("uf.oh(Lrn;I)V")
	public static final void method12036(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		method1906(var2, var3, arg0);
	}

	@ObfuscatedName("jp.pv(Lrn;B)V")
	public static final void method4808(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1776;
	}

	@ObfuscatedName("gi.pd(Lrn;I)V")
	public static final void method4035(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1777;
	}

	@ObfuscatedName("gp.pe(Lrn;I)V")
	public static final void method3906(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1863;
	}

	@ObfuscatedName("ki.pp(Lrn;I)V")
	public static final void method5026(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1929;
	}

	@ObfuscatedName("da.pq(Lrn;S)V")
	public static final void method2815(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1807 ? 1 : 0;
	}

	@ObfuscatedName("ol.px(Lrn;B)V")
	public static final void method7078(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1886;
	}

	@ObfuscatedName("na.pt(Lrn;B)V")
	public static final void method1220(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		IfType var3 = var1.field5239;
		ComType var4 = client.method4752(var3, var2);
		arg0.field5215[++arg0.field5216 - 1] = var4 == null ? -1 : var4.field1764;
	}

	@ObfuscatedName("aid.pa(Lrn;B)V")
	public static final void method16503(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1792;
	}

	@ObfuscatedName("mk.ps(Lrn;I)V")
	public static final void method6356(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1857;
	}

	@ObfuscatedName("fl.pn(Lrn;B)V")
	public static final void method3567(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1739;
	}

	@ObfuscatedName("rh.po(Lrn;B)V")
	public static final void method8619(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5222[++arg0.field5230 - 1] = var2.field1825;
	}

	@ObfuscatedName("ac.pb(Lrn;B)V")
	public static final void method1976(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1790;
	}

	@ObfuscatedName("la.pw(Lrn;I)V")
	public static final void method6067(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1894;
	}

	@ObfuscatedName("fl.ph(Lrn;I)V")
	public static final void method3570(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1818;
	}

	@ObfuscatedName("fz.pr(Lrn;I)V")
	public static final void method3661(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1812;
	}

	@ObfuscatedName("d.pc(Lrn;I)V")
	public static final void method1357(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1814;
	}

	@ObfuscatedName("nv.pj(Lrn;B)V")
	public static final void method6789(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1813;
	}

	@ObfuscatedName("lk.pi(Lrn;I)V")
	public static final void method5572(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1794;
	}

	@ObfuscatedName("nk.pl(Lrn;B)V")
	public static final void method6845(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1810;
	}

	@ObfuscatedName("la.pf(Lrn;I)V")
	public static final void method6063(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1824;
	}

	@ObfuscatedName("nf.pm(Lrn;I)V")
	public static final void method6639(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1797;
	}

	@ObfuscatedName("dr.pk(Lrn;I)V")
	public static final void method2827(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		int var3 = arg0.field5215[--arg0.field5216];
		ParamType var4 = Statics.field4464.method12600(var3);
		if (var4.method12586()) {
			arg0.field5222[++arg0.field5230 - 1] = var2.method3126(var3, var4.field7288);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.method3132(var3, var4.field7287);
		}
	}

	@ObfuscatedName("sr.pz(Lrn;I)V")
	public static final void method11324(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1783;
	}

	@ObfuscatedName("aeg.pg(Lrn;I)V")
	public static final void method15467(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1806 == 1 ? var2.field1838 : -1;
	}

	@ObfuscatedName("iz.py(Lrn;I)V")
	public static final void method4626(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = var2.field1793;
	}

	@ObfuscatedName("adf.pu(Lrn;B)V")
	public static final void method14994(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		int var3 = -1;
		int var4 = -1;
		Graphic var5 = var2.method3124(Statics.field5187);
		if (var5 != null) {
			var3 = var5.field1728;
			var4 = var5.field1727;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
		arg0.field5215[++arg0.field5216 - 1] = var4;
	}

	@ObfuscatedName("aet.qm(Lrn;I)V")
	public static final void method15442(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		if (var2.field1903 == -1) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.field1904;
		}
	}

	@ObfuscatedName("ov.qx(Lrn;I)V")
	public static final void method7214(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		arg0.field5215[++arg0.field5216 - 1] = client.method14331(var2).method14928();
	}

	@ObfuscatedName("dq.qq(Lrn;B)V")
	public static final void method2899(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		int var3 = arg0.field5215[--arg0.field5216];
		int var4 = var3 - 1;
		if (var2.field1852 == null || var4 >= var2.field1852.length || var2.field1852[var4] == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2.field1852[var4];
		}
	}

	@ObfuscatedName("adj.qn(Lrn;I)V")
	public static final void method15141(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		if (var2.field1795 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2.field1795;
		}
	}

	@ObfuscatedName("cc.qt(Lew;Lrn;B)V")
	public static final void method2552(ComType arg0, ClientScriptState arg1) {
		if (arg1.field5231 >= 10) {
			throw new RuntimeException();
		} else if (arg0.field1778 != null) {
			HookRequest var2 = new HookRequest();
			var2.field9609 = arg0;
			var2.field9613 = arg0.field1778;
			var2.field9615 = arg1.field5231 + 1;
			client.field9089.method11558(var2);
		}
	}

	@ObfuscatedName("dn.qo(Lrn;I)V")
	public static final void method2870(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		method2552(var2, arg0);
	}

	@ObfuscatedName("ev.qr(Lrn;I)V")
	public static final void method2983(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		method2552(var2, arg0);
	}

	@ObfuscatedName("da.qw(Lew;Lrn;B)V")
	public static final void method2816(ComType arg0, ClientScriptState arg1) {
		FontMetrics var2 = arg0.method3188(Statics.field6784, client.field8914);
		int var3 = arg1.field5215[--arg1.field5216];
		int var4 = arg1.field5215[--arg1.field5216];
		int var5 = var2.method12410(arg0.field1825, arg0.field1863, arg0.field1835, var4, var3, Statics.field8538);
		arg1.field5215[++arg1.field5216 - 1] = var5;
	}

	@ObfuscatedName("mn.ql(Lrn;I)V")
	public static final void method6338(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		method2816(var2, arg0);
	}

	@ObfuscatedName("lw.qf(Lew;Lrn;B)V")
	public static final void method5942(ComType arg0, ClientScriptState arg1) {
		FontMetrics var2 = arg0.method3188(Statics.field6784, client.field8914);
		int var3 = arg1.field5215[--arg1.field5216];
		Point var4 = var2.method12396(arg0.field1825, arg0.field1863, arg0.field1835, var3, Statics.field8538);
		arg1.field5215[++arg1.field5216 - 1] = var4.x;
		arg1.field5215[++arg1.field5216 - 1] = var4.y;
	}

	@ObfuscatedName("lk.qc(Lrn;I)V")
	public static final void method5569(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		method5942(var2, arg0);
	}

	@ObfuscatedName("pg.qa(Lrn;I)V")
	public static final void method7976(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		method5942(var2, arg0);
	}

	@ObfuscatedName("fc.qj(S)J")
	public static final long method3530() {
		return (long) (++field5209 - 1) << 32 | 0xFFFFFFFFL;
	}

	@ObfuscatedName("nk.qz(Lew;Lrn;I)V")
	public static final void method6846(ComType arg0, ClientScriptState arg1) {
		int var2 = arg1.field5215[--arg1.field5216];
		int var3 = arg1.field5215[--arg1.field5216] - 1;
		if (arg0.field1806 != 6) {
			throw new RuntimeException("");
		}
		NPCType var4 = Statics.field3774.method12565(arg0.field1838);
		if (arg0.field1930 == null) {
			arg0.field1930 = new class610(var4, true);
		}
		arg0.field1930.field7203 = method3530();
		if (var3 < 0 || var3 >= var4.field7214.length) {
			throw new RuntimeException("" + var3);
		}
		arg0.field1930.field7204[var3] = var2;
		client.method12939(arg0);
	}

	@ObfuscatedName("qh.qh(Lrn;I)V")
	public static final void method8285(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		method6846(var2, arg0);
	}

	@ObfuscatedName("iv.qv(Lrn;I)V")
	public static final void method4580(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		method6846(var2, arg0);
	}

	@ObfuscatedName("nj.qy(Lrn;I)V")
	public static final void method6971(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		Statics.method5714(var2, arg0);
	}

	@ObfuscatedName("agh.qs(Lrn;I)V")
	public static final void method15938(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		Statics.method5714(var2, arg0);
	}

	@ObfuscatedName("iv.qk(Lew;Lrn;I)V")
	public static final void method4581(ComType arg0, ClientScriptState arg1) {
		int var2 = arg1.field5215[--arg1.field5216];
		int var3 = arg1.field5215[--arg1.field5216] - 1;
		int var4 = var3;
		if (arg0.field1806 != 6 && arg0.field1806 != 2) {
			throw new RuntimeException("");
		}
		NPCType var5 = Statics.field3774.method12565(arg0.field1838);
		if (arg0.field1930 == null) {
			arg0.field1930 = new class610(var5, arg0.field1806 == 6);
		}
		arg0.field1930.field7203 = method3530();
		if (var5.field7221 != null) {
			if (var3 < 0 || var3 >= var5.field7221.length) {
				throw new RuntimeException("");
			}
			var4 = var5.field7221[var3];
		}
		if (var5.field7267 == null || var4 < 0 || var4 >= var5.field7267.length) {
			throw new RuntimeException("");
		}
		arg0.field1930.field7205[var4] = (short) var2;
		client.method12939(arg0);
	}

	@ObfuscatedName("c.qg(Lrn;B)V")
	public static final void method1328(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		method4581(var2, arg0);
	}

	@ObfuscatedName("v.qb(Lrn;I)V")
	public static final void method1203(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		method4581(var2, arg0);
	}

	@ObfuscatedName("cj.rk(Lew;Lrn;B)V")
	public static final void method2575(ComType arg0, ClientScriptState arg1) {
		int var2 = arg1.field5215[--arg1.field5216];
		int var3 = arg1.field5215[--arg1.field5216] - 1;
		int var4 = var3;
		if (arg0.field1806 != 6 && arg0.field1806 != 2) {
			throw new RuntimeException("");
		}
		NPCType var5 = Statics.field3774.method12565(arg0.field1838);
		if (arg0.field1930 == null) {
			arg0.field1930 = new class610(var5, arg0.field1806 == 6);
		}
		arg0.field1930.field7203 = method3530();
		if (var5.field7224 != null) {
			if (var3 < 0 || var3 >= var5.field7224.length) {
				throw new RuntimeException("");
			}
			var4 = var5.field7224[var3];
		}
		if (var5.field7270 == null || var4 < 0 || var4 >= var5.field7270.length) {
			throw new RuntimeException("");
		}
		arg0.field1930.field7206[var4] = (short) var2;
		client.method12939(arg0);
	}

	@ObfuscatedName("vz.ry(Lrn;I)V")
	public static final void method12233(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		method2575(var2, arg0);
	}

	@ObfuscatedName("mx.rd(Lrn;I)V")
	public static final void method6079(ClientScriptState arg0) {
		ActiveComponent var1 = arg0.field5238 ? arg0.field5210 : arg0.field5223;
		ComType var2 = var1.field5240;
		method2575(var2, arg0);
	}

	@ObfuscatedName("oq.rs(Lrn;I)V")
	public static final void method7246(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1776;
	}

	@ObfuscatedName("lq.ri(Lrn;I)V")
	public static final void method5929(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1777;
	}

	@ObfuscatedName("ic.rx(Lrn;B)V")
	public static final void method4690(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1863;
	}

	@ObfuscatedName("ls.rm(Lrn;S)V")
	public static final void method5708(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1929;
	}

	@ObfuscatedName("acu.rj(Lrn;I)V")
	public static final void method14924(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1807 ? 1 : 0;
	}

	@ObfuscatedName("iz.rw(Lrn;I)V")
	public static final void method4622(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1886;
	}

	@ObfuscatedName("vl.rc(Lrn;I)V")
	public static final void method12451(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		IfType var3 = Statics.field1756[var1 >>> 16];
		ComType var4 = client.method4752(var3, var2);
		arg0.field5215[++arg0.field5216 - 1] = var4 == null ? -1 : var4.field1764;
	}

	@ObfuscatedName("uk.rh(Lrn;I)V")
	public static final void method11960(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1792;
	}

	@ObfuscatedName("al.rt(Lrn;I)V")
	public static final void method1816(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1857;
	}

	@ObfuscatedName("adq.ru(Lrn;B)V")
	public static final void method15146(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5222[++arg0.field5230 - 1] = var2.field1825;
	}

	@ObfuscatedName("fm.ra(Lrn;B)V")
	public static final void method3624(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1790;
	}

	@ObfuscatedName("ak.rf(Lrn;I)V")
	public static final void method1953(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1894;
	}

	@ObfuscatedName("cd.rl(Lrn;I)V")
	public static final void method2496(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1818;
	}

	@ObfuscatedName("fw.rz(Lrn;I)V")
	public static final void method3671(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1812;
	}

	@ObfuscatedName("aab.re(Lrn;I)V")
	public static final void method13910(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1814;
	}

	@ObfuscatedName("an.rg(Lrn;B)V")
	public static final void method1719(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1813;
	}

	@ObfuscatedName("rd.ro(Lrn;S)V")
	public static final void method8513(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1794;
	}

	@ObfuscatedName("fu.rb(Lrn;I)V")
	public static final void method3644(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1810;
	}

	@ObfuscatedName("je.rn(Lrn;I)V")
	public static final void method4863(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1824;
	}

	@ObfuscatedName("ev.rr(Lrn;I)V")
	public static final void method2987(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1797;
	}

	@ObfuscatedName("rh.rv(Lrn;I)V")
	public static final void method8615(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1806 == 1 ? var2.field1838 : -1;
	}

	@ObfuscatedName("rg.se(Lrn;B)V")
	public static final void method8719(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1793;
	}

	@ObfuscatedName("ig.sd(Lrn;I)V")
	public static final void method4557(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		int var3 = -1;
		int var4 = -1;
		Graphic var5 = var2.method3124(Statics.field5187);
		if (var5 != null) {
			var3 = var5.field1728;
			var4 = var5.field1727;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
		arg0.field5215[++arg0.field5216 - 1] = var4;
	}

	@ObfuscatedName("nq.so(Lrn;B)V")
	public static final void method6977(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field1793;
	}

	@ObfuscatedName("cy.sz(Lrn;I)V")
	public static final void method2585(ClientScriptState arg0) {
		ComType var1 = ComType.method11381(arg0.field5215[--arg0.field5216]);
		if (var1.field1903 == -1) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var1.field1904;
		}
	}

	@ObfuscatedName("dr.sb(Lrn;I)V")
	public static final void method2824(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		SubIfType var2 = (SubIfType) client.field9075.method11923((long) var1);
		if (var2 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		}
	}

	@ObfuscatedName("uv.sa(Lrn;I)V")
	public static final void method12162(ClientScriptState arg0) {
		ComType var1 = ComType.method11381(arg0.field5215[--arg0.field5216]);
		if (var1.field1915 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
			return;
		}
		int var2 = var1.field1915.length;
		for (int var3 = 0; var3 < var1.field1915.length; var3++) {
			if (var1.field1915[var3] == null) {
				var2 = var3;
				break;
			}
		}
		arg0.field5215[++arg0.field5216 - 1] = var2;
	}

	@ObfuscatedName("qe.sl(Lrn;I)V")
	public static final void method8316(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		SubIfType var3 = (SubIfType) client.field9075.method11923((long) var1);
		if (var3 != null && var3.field9679 == var2) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("et.sf(Lrn;I)V")
	public static final void method2917(ClientScriptState arg0) {
		method8316(arg0);
	}

	@ObfuscatedName("xa.sw(Lrn;I)V")
	public static final void method235(ClientScriptState arg0) {
		method8316(arg0);
	}

	@ObfuscatedName("abt.sy(Lrn;I)V")
	public static final void method14260(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		arg0.field5215[++arg0.field5216 - 1] = client.method14331(var2).method14928();
	}

	@ObfuscatedName("ae.sm(Lrn;I)V")
	public static final void method1971(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		int var3 = arg0.field5215[--arg0.field5216];
		int var4 = var3 - 1;
		if (var2.field1852 == null || var4 >= var2.field1852.length || var2.field1852[var4] == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2.field1852[var4];
		}
	}

	@ObfuscatedName("lk.sn(Lrn;B)V")
	public static final void method5570(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ComType var2 = ComType.method11381(var1);
		if (var2.field1795 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2.field1795;
		}
	}

	@ObfuscatedName("aw.su(Lrn;B)V")
	public static final void method1882(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		Statics.method7348(var1);
	}

	@ObfuscatedName("id.sh(Lrn;B)V")
	public static final void method4595(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		Statics.method11308(Statics.field2119, arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1]);
	}

	@ObfuscatedName("jh.ss(Lrn;I)V")
	public static final void method4784(ClientScriptState arg0) {
		client.method8618(true);
	}

	@ObfuscatedName("gh.sq(Lrn;I)V")
	public static final void method3977(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		int var2 = 0;
		if (StringTools.method7735(var1)) {
			var2 = StringTools.method5598(var1);
		}
		ClientMessage var3 = ClientMessage.method14781(ClientProt.field2914, client.field8975.field834);
		var3.field9467.method15223(var2);
		client.field8975.method1913(var3);
	}

	@ObfuscatedName("wk.sp(Lrn;I)V")
	public static final void method12718(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2849, client.field8975.field834);
		var2.field9467.method15308(var1.length() + 1);
		var2.field9467.method15228(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("xx.sc(Lrn;I)V")
	public static final void method12738(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2870, client.field8975.field834);
		var2.field9467.method15308(var1.length() + 1);
		var2.field9467.method15228(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("mv.sx(Lrn;I)V")
	public static final void method6310(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		String var2 = (String) arg0.field5222[--arg0.field5230];
		Statics.method8062(var1, var2);
	}

	@ObfuscatedName("gb.sv(Lrn;B)V")
	public static final void method4007(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		ComType var4 = ComType.method11381(var3);
		client.method8390(var4, var1, var2);
	}

	@ObfuscatedName("fx.sr(Lrn;B)V")
	public static final void method3584(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2954, client.field8975.field834);
		var2.field9467.method15287(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("pl.sk(Lrn;I)V")
	public static final void method7907(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		client.method3589(var1, new SubIfType(var2, 3), null, true);
	}

	@ObfuscatedName("na.si(Lrn;B)V")
	public static final void method1222(ClientScriptState arg0) {
		arg0.field5216--;
		int var1 = arg0.field5215[arg0.field5216];
		SubIfType var2 = (SubIfType) client.field9075.method11923((long) var1);
		if (var2 != null && var2.field9678 == 3) {
			client.method7069(var2, true, true);
		}
	}

	@ObfuscatedName("ml.sg(Lrn;B)V")
	public static final void method6246(ClientScriptState arg0) {
		client.method7323((String) arg0.field5222[--arg0.field5230]);
	}

	@ObfuscatedName("ch.tw(Lrn;I)V")
	public static final void method2424(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		String var3 = (String) arg0.field5222[--arg0.field5230];
		if (var1 == 99) {
			class62.method1958(var3);
		} else if (var1 == 98) {
			class62.method11224(var3);
		} else {
			ChatHistory.method3943(var1, var2, "", "", "", var3);
		}
	}

	@ObfuscatedName("fo.ty(Lrn;I)V")
	public static final void method3621(ClientScriptState arg0) {
		arg0.field5216 -= 11;
		class265[] var1 = class265.method15177();
		class263[] var2 = class263.method3623();
		class57.method1884(var1[arg0.field5215[arg0.field5216]], var2[arg0.field5215[arg0.field5216 + 1]], arg0.field5215[arg0.field5216 + 2], arg0.field5215[arg0.field5216 + 3], arg0.field5215[arg0.field5216 + 4], arg0.field5215[arg0.field5216 + 5], arg0.field5215[arg0.field5216 + 6], arg0.field5215[arg0.field5216 + 7], arg0.field5215[arg0.field5216 + 8], arg0.field5215[arg0.field5216 + 9], arg0.field5215[arg0.field5216 + 10]);
	}

	@ObfuscatedName("te.tk(Lrn;I)V")
	public static final void method11536(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2854, client.field8975.field834);
		var2.field9467.method15287(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("ob.tb(Lrn;I)V")
	public static final void method7277(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		class395.method14082(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], arg0.field5215[arg0.field5216 + 2], 255, 256);
	}

	@ObfuscatedName("qp.tr(Lrn;I)V")
	public static final void method8200(ClientScriptState arg0) {
		class395.method11057(arg0.field5215[--arg0.field5216], 255, 50);
	}

	@ObfuscatedName("lu.to(Lrn;B)V")
	public static final void method5826(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		class395.method5596(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], 255);
	}

	@ObfuscatedName("ob.tg(Lrn;B)V")
	public static final void method7278(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		class395.method14082(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], arg0.field5215[arg0.field5216 + 2], arg0.field5215[arg0.field5216 + 3], 256);
	}

	@ObfuscatedName("fc.ta(Lrn;I)V")
	public static final void method3535(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		class395.method11057(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], arg0.field5215[arg0.field5216 + 2]);
	}

	@ObfuscatedName("cy.tz(Lrn;B)V")
	public static final void method2586(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		class395.method5596(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], arg0.field5215[arg0.field5216 + 2]);
	}

	@ObfuscatedName("lo.tm(Lrn;B)V")
	public static final void method5787(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		class395.method1717(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], arg0.field5215[arg0.field5216 + 2], arg0.field5215[arg0.field5216 + 3], true, 256);
	}

	@ObfuscatedName("pi.tx(Lrn;I)V")
	public static final void method7901(ClientScriptState arg0) {
		arg0.field5216 -= 5;
		class395.method14082(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], arg0.field5215[arg0.field5216 + 2], arg0.field5215[arg0.field5216 + 3], arg0.field5215[arg0.field5216 + 4]);
	}

	@ObfuscatedName("jc.te(Lrn;S)V")
	public static final void method4735(ClientScriptState arg0) {
		arg0.field5216 -= 5;
		class395.method1717(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], arg0.field5215[arg0.field5216 + 2], arg0.field5215[arg0.field5216 + 3], false, arg0.field5215[arg0.field5216 + 4]);
	}

	@ObfuscatedName("gb.td(Lrn;I)V")
	public static final void method4008(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9213;
	}

	@ObfuscatedName("ix.tq(Lrn;B)V")
	public static final void method4616(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method12480(var1, var2, false);
	}

	@ObfuscatedName("qm.tf(Lrn;B)V")
	public static final void method8031(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method15887(var1, var2, false);
	}

	@ObfuscatedName("la.ti(Lrn;I)V")
	public static final void method6064(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method12715(var1, var2, false);
	}

	@ObfuscatedName("cg.th(Lrn;I)V")
	public static final void method2556(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field495.method12644(var1).field9802;
	}

	@ObfuscatedName("dq.tp(Lrn;I)V")
	public static final void method2897(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		InvType var1 = Statics.field495.method12644(arg0.field5215[arg0.field5216]);
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = -1;
		for (int var4 = 0; var4 < var1.field9804; var4++) {
			if (var1.field9801[var4] == var2) {
				var3 = var1.field9803[var4];
				break;
			}
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("ec.tv(Lrn;I)V")
	public static final void method3454(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9092[var1];
	}

	@ObfuscatedName("et.tu(Lrn;S)V")
	public static final void method2922(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9094[var1];
	}

	@ObfuscatedName("pa.tj(Lrn;B)V")
	public static final void method7743(ClientScriptState arg0) {
		byte var1 = Statics.field2119.field9807;
		Vector3 var2 = Statics.field2119.method8565().field3464;
		CoordGrid var3 = client.field8980.method6214();
		int var4 = ((int) var2.field3475 >> 9) + var3.field4836;
		int var5 = ((int) var2.field3477 >> 9) + var3.field4838;
		arg0.field5215[++arg0.field5216 - 1] = (var1 << 28) + (var4 << 14) + var5;
	}

	@ObfuscatedName("jp.ts(Lrn;I)V")
	public static final void method4810(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = var1 >> 28;
	}

	@ObfuscatedName("ff.ul(Lrn;I)V")
	public static final void method3579(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = var1 & 0x3FFF;
	}

	@ObfuscatedName("gz.up(Lrn;I)V")
	public static final void method3938(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9142 ? 1 : 0;
	}

	@ObfuscatedName("fc.uw(Lrn;B)V")
	public static final void method3539(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method12480(var1, var2, true);
	}

	@ObfuscatedName("dx.ub(Lrn;I)V")
	public static final void method2705(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method15887(var1, var2, true);
	}

	@ObfuscatedName("cj.us(Lrn;I)V")
	public static final void method2578(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method12715(var1, var2, true);
	}

	@ObfuscatedName("rc.ux(Lrn;I)V")
	public static final void method8607(ClientScriptState arg0) {
		if (client.field9074 >= 2) {
			arg0.field5215[++arg0.field5216 - 1] = client.field9074;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("sa.uc(Lrn;B)V")
	public static final void method11165(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8935;
	}

	@ObfuscatedName("acz.uk(Lrn;I)V")
	public static final void method14810(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9109;
	}

	@ObfuscatedName("dk.ug(Lrn;I)V")
	public static final void method2713(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8905;
	}

	@ObfuscatedName("gm.uj(Lrn;I)V")
	public static final void method3966(ClientScriptState arg0) {
		if (client.field8916 >= 5 && client.field8916 <= 9) {
			arg0.field5215[++arg0.field5216 - 1] = client.field8916;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("py.uz(Lrn;B)V")
	public static final void method7982(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8998 ? 1 : 0;
	}

	@ObfuscatedName("ju.ua(Lrn;I)V")
	public static final void method4874(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2119.field10047;
	}

	@ObfuscatedName("ay.ui(Lrn;I)V")
	public static final void method1678(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2119.field10044 != null && Statics.field2119.field10044.field5005 ? 1 : 0;
	}

	@ObfuscatedName("w.uh(Lrn;B)V")
	public static final void method1558(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9081 ? 1 : 0;
	}

	@ObfuscatedName("dm.uf(Lrn;I)V")
	public static final void method2887(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method11844(var1, false);
	}

	@ObfuscatedName("ls.uu(Lrn;I)V")
	public static final void method5709(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method1946(var1, var2, false, false);
	}

	@ObfuscatedName("pb.ut(Lrn;B)V")
	public static final void method7832(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = ClientInvCache.method1946(var1, var2, true, false);
	}

	@ObfuscatedName("aed.un(Lrn;I)V")
	public static final void method15674(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2308.method6339();
	}

	@ObfuscatedName("wb.um(Lrn;I)V")
	public static final void method12726(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		int var5 = (var2 << 14) + var1;
		int var6 = (var3 << 28) + var5;
		int var7 = var4 + var6;
		arg0.field5215[++arg0.field5216 - 1] = var7;
	}

	@ObfuscatedName("adk.uq(Lrn;I)V")
	public static final void method15164(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9043;
	}

	@ObfuscatedName("cj.ud(Lrn;B)V")
	public static final void method2580(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = class50.method4552();
	}

	@ObfuscatedName("t.ur(Lrn;I)V")
	public static final void method1344(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = 0;
	}

	@ObfuscatedName("og.uv(Lrn;B)V")
	public static final void method7162(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field578 ? 1 : 0;
	}

	@ObfuscatedName("wb.uy(Lrn;I)V")
	public static final void method12729(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9004 ? 1 : 0;
	}

	@ObfuscatedName("wb.vf(Lrn;I)V")
	public static final void method12727(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field7136.method7254();
	}

	@ObfuscatedName("tr.va(Lrn;I)V")
	public static final void method11403(ClientScriptState arg0) {
		method2473(MiniMenu.method11098(), arg0);
	}

	@ObfuscatedName("mo.ve(Lrn;S)V")
	public static final void method6083(ClientScriptState arg0) {
		method2473(MiniMenu.method7326(), arg0);
	}

	@ObfuscatedName("jp.vu(Lrn;I)V")
	public static final void method4809(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = MiniMenu.field588;
		arg0.field5215[++arg0.field5216 - 1] = MiniMenu.field594;
	}

	@ObfuscatedName("et.vt(Lrn;I)V")
	public static final void method2918(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9018;
	}

	@ObfuscatedName("rh.vg(Lrn;I)V")
	public static final void method8617(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2119.field8638.method1387() >> 3;
	}

	@ObfuscatedName("eg.vo(Lrn;I)V")
	public static final void method2939(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (Statics.field4685 != null && Statics.field4685.equalsIgnoreCase(var1)) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("qh.vz(Lrn;B)V")
	public static final void method8286(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field7136.method7250() ? 1 : 0;
		arg0.field5215[++arg0.field5216 - 1] = Statics.field7136.method7251() ? 1 : 0;
		arg0.field5215[++arg0.field5216 - 1] = Statics.field7136.method7252() ? 1 : 0;
	}

	@ObfuscatedName("nd.vn(Lrn;B)V")
	public static final void method7062(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9071;
	}

	@ObfuscatedName("fp.vq(Lrn;S)V")
	public static final void method3543(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9117 ? 1 : 0;
		arg0.field5222[++arg0.field5230 - 1] = client.field9151 == null ? "" : client.field9151;
		arg0.field5222[++arg0.field5230 - 1] = client.field9103 == null ? "" : client.field9103;
	}

	@ObfuscatedName("pe.vj(Lrn;I)V")
	public static final void method7689(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		EnumType var3 = Statics.field1244.method12116(var1);
		if (var3.field6806 != 's') {
		}
		arg0.field5222[++arg0.field5230 - 1] = var3.method12120(var2);
	}

	@ObfuscatedName("uo.vw(Lrn;I)V")
	public static final void method11948(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		EnumType var5 = Statics.field1244.method12116(var3);
		if (var5.field6807 != var1 || var5.field6806 != var2) {
			throw new RuntimeException(var3 + " " + var4);
		} else if (var2 == 115) {
			arg0.field5222[++arg0.field5230 - 1] = var5.method12120(var4);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var5.method12123(var4);
		}
	}

	@ObfuscatedName("aah.vs(Lrn;I)V")
	public static final void method13913(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var4 = Statics.field1244.method12116(var2);
		if (var4.field6806 != var1) {
			throw new RuntimeException();
		}
		arg0.field5215[++arg0.field5216 - 1] = var4.method12127(var3) ? 1 : 0;
	}

	@ObfuscatedName("tk.vr(Lrn;I)V")
	public static final void method11378(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		String var2 = (String) arg0.field5222[--arg0.field5230];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		EnumType var3 = Statics.field1244.method12116(var1);
		if (var3.field6806 != 's') {
			throw new RuntimeException();
		}
		arg0.field5215[++arg0.field5216 - 1] = var3.method12127(var2) ? 1 : 0;
	}

	@ObfuscatedName("io.vb(Lrn;I)V")
	public static final void method4604(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		EnumType var2 = Statics.field1244.method12116(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.method12128();
	}

	@ObfuscatedName("id.vk(Lrn;I)V")
	public static final void method4592(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		String var2 = (String) arg0.field5222[--arg0.field5230];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		EnumType var3 = Statics.field1244.method12116(var1);
		if (var3.field6806 != 's') {
			throw new RuntimeException();
		}
		int[] var4 = var3.method12141(var2);
		int var5 = 0;
		if (var4 != null) {
			var5 = var4.length;
		}
		arg0.field5215[++arg0.field5216 - 1] = var5;
	}

	@ObfuscatedName("gq.vi(Lrn;I)V")
	public static final void method3923(ClientScriptState arg0) {
		arg0.field5216 -= 5;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		int var5 = arg0.field5215[arg0.field5216 + 4];
		if (var3 == -1) {
			throw new RuntimeException();
		}
		EnumType var6 = Statics.field1244.method12116(var3);
		if (var6.field6807 != var2) {
			throw new RuntimeException();
		} else if (var6.field6806 == var1) {
			int[] var7 = var6.method12141(var4);
			if (var5 < 0 || var7 == null || var7.length <= var5) {
				throw new RuntimeException();
			}
			arg0.field5215[++arg0.field5216 - 1] = var7[var5];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ot.vd(Lrn;B)V")
	public static final void method7372(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		String var4 = (String) arg0.field5222[--arg0.field5230];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		EnumType var5 = Statics.field1244.method12116(var2);
		if (var5.field6807 != var1) {
			throw new RuntimeException();
		} else if (var5.field6806 == 's') {
			int[] var6 = var5.method12141(var4);
			if (var3 < 0 || var6 == null || var6.length <= var3) {
				throw new RuntimeException();
			}
			arg0.field5215[++arg0.field5216 - 1] = var6[var3];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ai.vm(Lrn;I)V")
	public static final void method1770(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2950, client.field8959.field834);
		var2.field9467.method15308(Statics.method1724(var1));
		var2.field9467.method15228(var1);
		client.field8959.method1913(var2);
	}

	@ObfuscatedName("ut.vl(Lrn;I)V")
	public static final void method12071(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		String var2 = (String) arg0.field5222[--arg0.field5230];
		ClientMessage var3 = ClientMessage.method14781(ClientProt.field2958, client.field8959.field834);
		var3.field9467.method15287(Statics.method1724(var1) + Statics.method1724(var2));
		var3.field9467.method15228(var1);
		var3.field9467.method15228(var2);
		client.field8959.method1913(var3);
	}

	@ObfuscatedName("mx.vh(Lrn;I)V")
	public static final void method6072(ClientScriptState arg0) {
		arg0.field5230--;
		arg0.field5216 -= 3;
		String var1 = (String) arg0.field5222[arg0.field5230];
		boolean var2 = arg0.field5215[arg0.field5216] == 1;
		boolean var3 = arg0.field5215[arg0.field5216 + 1] == 1;
		boolean var4 = arg0.field5215[arg0.field5216 + 2] == 1;
		ClientMessage var5 = ClientMessage.method14781(ClientProt.field2944, client.field8959.field834);
		var5.field9467.method15287(Statics.method1724(var1) + 1);
		var5.field9467.method15228(var1);
		int var6 = 0;
		if (var2) {
			var6 |= 0x1;
		}
		if (var3) {
			var6 |= 0x2;
		}
		if (var4) {
			var6 |= 0x4;
		}
		var5.field9467.method15308(var6);
		client.field8959.method1913(var5);
	}

	@ObfuscatedName("lp.vp(Lrn;I)V")
	public static final void method6023(ClientScriptState arg0) {
		if (client.field9121 == 0) {
			arg0.field5215[++arg0.field5216 - 1] = -2;
		} else if (client.field9121 == 1) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = client.field9206;
		}
	}

	@ObfuscatedName("oc.vy(Lrn;I)V")
	public static final void method7382(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 != 2 || var1 >= client.field9206) {
			arg0.field5222[++arg0.field5230 - 1] = "";
			arg0.field5222[++arg0.field5230 - 1] = "";
			return;
		}
		Friend var2 = client.field9209[var1];
		arg0.field5222[++arg0.field5230 - 1] = var2.field649;
		if (var2.field646 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2.field646;
		}
	}

	@ObfuscatedName("fr.vc(Lrn;I)V")
	public static final void method3524(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.field5215[++arg0.field5216 - 1] = client.field9209[var1].field647;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("ay.wf(Lrn;B)V")
	public static final void method1679(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.field5215[++arg0.field5216 - 1] = client.field9209[var1].field652;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("lg.wq(Lrn;I)V")
	public static final void method5809(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		int var2 = arg0.field5215[--arg0.field5216];
		client.method6257(var1, var2);
	}

	@ObfuscatedName("qx.wi(Lrn;I)V")
	public static final void method8065(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		client.method2940(var1);
	}

	@ObfuscatedName("v.wv(Lrn;I)V")
	public static final void method1204(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		Statics.method12716(var1);
	}

	@ObfuscatedName("ga.ws(Lrn;I)V")
	public static final void method4108(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		Statics.method11369(var1);
	}

	@ObfuscatedName("dd.wc(Lrn;I)V")
	public static final void method2811(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (var1.startsWith(TextUtil.method6076(0)) || var1.startsWith(TextUtil.method6076(1))) {
			var1 = var1.substring(7);
		}
		arg0.field5215[++arg0.field5216 - 1] = client.method3546(var1) ? 1 : 0;
	}

	@ObfuscatedName("df.wr(Lrn;I)V")
	public static final void method2836(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.field5222[++arg0.field5230 - 1] = client.field9209[var1].field648;
		} else {
			arg0.field5222[++arg0.field5230 - 1] = "";
		}
	}

	@ObfuscatedName("c.wl(Lrn;I)V")
	public static final void method1324(ClientScriptState arg0) {
		if (client.field9182 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = Base37.method3633(client.field9182);
		}
	}

	@ObfuscatedName("zu.wy(Lrn;I)V")
	public static final void method13853(ClientScriptState arg0) {
		if (client.field9182 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field7045;
		}
	}

	@ObfuscatedName("c.wn(Lrn;B)V")
	public static final void method1325(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = Statics.field5180[var1].field791;
		}
	}

	@ObfuscatedName("nv.wg(Lrn;I)V")
	public static final void method6791(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field5180[var1].field789;
		}
	}

	@ObfuscatedName("abs.wa(Lrn;B)V")
	public static final void method14266(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field5180[var1].field788;
		}
	}

	@ObfuscatedName("lq.wj(Lrn;I)V")
	public static final void method5924(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4311;
	}

	@ObfuscatedName("kj.wo(Lrn;I)V")
	public static final void method5545(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		client.method12449(var1);
	}

	@ObfuscatedName("afu.wx(Lrn;I)V")
	public static final void method15893(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field7353;
	}

	@ObfuscatedName("dl.ww(Lrn;I)V")
	public static final void method2605(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		client.method3925(var1);
	}

	@ObfuscatedName("ji.wz(Lrn;I)V")
	public static final void method4791(ClientScriptState arg0) {
		client.method3979();
	}

	@ObfuscatedName("ec.we(Lrn;S)V")
	public static final void method3448(ClientScriptState arg0) {
		if (client.field9121 == 0) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = client.field9211;
		}
	}

	@ObfuscatedName("fm.wu(Lrn;B)V")
	public static final void method3628(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (var1.startsWith(TextUtil.method6076(0)) || var1.startsWith(TextUtil.method6076(1))) {
			var1 = var1.substring(7);
		}
		arg0.field5215[++arg0.field5216 - 1] = client.method11167(var1) ? 1 : 0;
	}

	@ObfuscatedName("j.wm(Lrn;I)V")
	public static final void method1247(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (Statics.field5180 == null || var1 >= Statics.field7045 || !Statics.field5180[var1].field786.equalsIgnoreCase(Statics.field2119.field10040)) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		}
	}

	@ObfuscatedName("jx.wk(Lrn;B)V")
	public static final void method4751(ClientScriptState arg0) {
		if (client.field9220 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = client.field9220;
		}
	}

	@ObfuscatedName("pu.wb(Lrn;I)V")
	public static final void method7989(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = Statics.field5180[var1].field790;
		}
	}

	@ObfuscatedName("ct.xa(Lrn;B)V")
	public static final void method2539(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (var1.startsWith(TextUtil.method6076(0)) || var1.startsWith(TextUtil.method6076(1))) {
			var1 = var1.substring(7);
		}
		arg0.field5215[++arg0.field5216 - 1] = client.method8729(var1);
	}

	@ObfuscatedName("wd.xx(Lrn;I)V")
	public static final void method12503(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (var1.startsWith(TextUtil.method6076(0)) || var1.startsWith(TextUtil.method6076(1))) {
			var1 = var1.substring(7);
		}
		arg0.field5215[++arg0.field5216 - 1] = client.method11161(var1);
	}

	@ObfuscatedName("al.xh(Lrn;B)V")
	public static final void method1817(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field7046;
	}

	@ObfuscatedName("vv.xb(Lrn;I)V")
	public static final void method12368(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		client.method13904(var1, true);
	}

	@ObfuscatedName("io.xo(Lrn;I)V")
	public static final void method4603(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = Statics.field5180[var1].field786;
		}
	}

	@ObfuscatedName("cr.xk(Lrn;I)V")
	public static final void method2353(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 == 0 || var1 >= client.field9211) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = client.field8999[var1].field639;
		}
	}

	@ObfuscatedName("mk.xp(Lrn;I)V")
	public static final void method6357(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.field5215[++arg0.field5216 - 1] = client.field9209[var1].field651 ? 1 : 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("jf.xl(Lrn;B)V")
	public static final void method4747(ClientScriptState arg0) {
		if (Statics.field913 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 1;
			arg0.field5226 = Statics.field913;
		}
	}

	@ObfuscatedName("it.xe(Lrn;B)V")
	public static final void method4709(ClientScriptState arg0) {
		if (Statics.field2972 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 1;
			arg0.field5226 = Statics.field2972;
		}
	}

	@ObfuscatedName("sv.xf(Lrn;S)V")
	public static final void method11299(ClientScriptState arg0) {
		arg0.field5222[++arg0.field5230 - 1] = arg0.field5226.field2349;
	}

	@ObfuscatedName("rb.xw(Lrn;I)V")
	public static final void method11056(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2366 ? 1 : 0;
	}

	@ObfuscatedName("px.xu(Lrn;I)V")
	public static final void method7721(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2352;
	}

	@ObfuscatedName("iw.xd(Lrn;I)V")
	public static final void method4563(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2353;
	}

	@ObfuscatedName("rk.xr(Lrn;I)V")
	public static final void method8483(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2350;
	}

	@ObfuscatedName("jx.xv(Lrn;I)V")
	public static final void method4755(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2346;
	}

	@ObfuscatedName("fi.xs(Lrn;S)V")
	public static final void method3663(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = arg0.field5226.field2355[var1];
	}

	@ObfuscatedName("ge.xt(Lrn;B)V")
	public static final void method3984(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2358[var1];
	}

	@ObfuscatedName("on.xg(Lrn;B)V")
	public static final void method7181(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2356;
	}

	@ObfuscatedName("qb.xi(Lrn;I)V")
	public static final void method8455(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = arg0.field5226.field2367[var1];
	}

	@ObfuscatedName("ix.xj(Lrn;I)V")
	public static final void method4617(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.method4042(var1, var2, var3);
	}

	@ObfuscatedName("lu.xn(Lrn;I)V")
	public static final void method5832(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2364;
	}

	@ObfuscatedName("af.xc(Lrn;I)V")
	public static final void method1685(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2363;
	}

	@ObfuscatedName("im.xz(Lrn;I)V")
	public static final void method4639(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.method4041((String) arg0.field5222[--arg0.field5230]);
	}

	@ObfuscatedName("iv.xm(Lrn;I)V")
	public static final void method4582(ClientScriptState arg0) {
		arg0.field5215[arg0.field5216 - 1] = arg0.field5226.method4047()[arg0.field5215[arg0.field5216 - 1]];
	}

	@ObfuscatedName("mx.yp(Lrn;I)V")
	public static final void method6073(ClientScriptState arg0) {
		client.method8064(arg0.field5215[--arg0.field5216]);
	}

	@ObfuscatedName("e.yc(Lrn;I)V")
	public static final void method1667(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5226.field2361[var1];
	}

	@ObfuscatedName("iw.ye(Lrn;I)V")
	public static final void method4565(ClientScriptState arg0) {
		if (Statics.field1515 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 1;
			arg0.field5217 = Statics.field1515;
		}
	}

	@ObfuscatedName("nn.yh(Lrn;I)V")
	public static final void method6883(ClientScriptState arg0) {
		if (Statics.field8458 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 1;
			arg0.field5217 = Statics.field8458;
		}
	}

	@ObfuscatedName("nv.yf(Lrn;I)V")
	public static final void method6793(ClientScriptState arg0) {
		arg0.field5222[++arg0.field5230 - 1] = arg0.field5217.field9427;
	}

	@ObfuscatedName("wy.yw(Lrn;I)V")
	public static final void method12635(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5217.field9432;
	}

	@ObfuscatedName("ow.yd(Lrn;I)V")
	public static final void method7345(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5217.field9434;
	}

	@ObfuscatedName("gp.yl(Lrn;B)V")
	public static final void method3908(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5217.field9430;
	}

	@ObfuscatedName("fh.yy(Lrn;I)V")
	public static final void method3653(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5217.field9429[var1].field2342;
	}

	@ObfuscatedName("xo.ys(Lrn;I)V")
	public static final void method12758(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5217.field9429[var1].field2341;
	}

	@ObfuscatedName("oe.ym(Lrn;I)V")
	public static final void method7321(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5217.method14963((String) arg0.field5222[--arg0.field5230]);
	}

	@ObfuscatedName("bj.yj(Lrn;I)V")
	public static final void method2021(ClientScriptState arg0) {
		arg0.field5215[arg0.field5216 - 1] = arg0.field5217.method14965()[arg0.field5215[arg0.field5216 - 1]];
	}

	@ObfuscatedName("aaj.yn(Lrn;B)V")
	public static final void method14131(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field5051 == null ? 0 : 1;
	}

	@ObfuscatedName("mf.yu(Lrn;B)V")
	public static final void method6080(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9184[var1].method6020();
	}

	@ObfuscatedName("qb.ya(Lrn;B)V")
	public static final void method8456(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9184[var1].field3758;
	}

	@ObfuscatedName("cd.yx(Lrn;I)V")
	public static final void method2491(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9184[var1].field3762;
	}

	@ObfuscatedName("qo.yz(Lrn;I)V")
	public static final void method8079(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9184[var1].field3761;
	}

	@ObfuscatedName("sa.yg(Lrn;B)V")
	public static final void method11166(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9184[var1].field3760;
	}

	@ObfuscatedName("fk.yb(Lrn;I)V")
	public static final void method3636(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = client.field9184[var1].field3763;
	}

	@ObfuscatedName("ed.yr(Lrn;B)V")
	public static final void method3081(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		int var2 = client.field9184[var1].method6017();
		arg0.field5215[++arg0.field5216 - 1] = var2 == 0 ? 1 : 0;
	}

	@ObfuscatedName("mk.yt(Lrn;I)V")
	public static final void method6358(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		int var2 = client.field9184[var1].method6017();
		arg0.field5215[++arg0.field5216 - 1] = var2 == 2 ? 1 : 0;
	}

	@ObfuscatedName("an.yq(Lrn;B)V")
	public static final void method1714(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		int var2 = client.field9184[var1].method6017();
		arg0.field5215[++arg0.field5216 - 1] = var2 == 5 ? 1 : 0;
	}

	@ObfuscatedName("vj.yk(Lrn;I)V")
	public static final void method12328(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		int var2 = client.field9184[var1].method6017();
		arg0.field5215[++arg0.field5216 - 1] = var2 == 1 ? 1 : 0;
	}

	@ObfuscatedName("act.zv(Lrn;I)V")
	public static final void method14812(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 - var2;
	}

	@ObfuscatedName("fe.zu(Lrn;B)V")
	public static final void method3841(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 * var2;
	}

	@ObfuscatedName("e.zw(Lrn;B)V")
	public static final void method1668(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 / var2;
	}

	@ObfuscatedName("aj.zb(Lrn;I)V")
	public static final void method1961(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = (int) (Math.random() * (double) var1);
	}

	@ObfuscatedName("ei.zc(Lrn;I)V")
	public static final void method3227(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = (int) (Math.random() * (double) (var1 + 1));
	}

	@ObfuscatedName("nh.zf(Lrn;I)V")
	public static final void method6877(ClientScriptState arg0) {
		arg0.field5216 -= 5;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		int var5 = arg0.field5215[arg0.field5216 + 4];
		arg0.field5215[++arg0.field5216 - 1] = (var2 - var1) * (var5 - var3) / (var4 - var3) + var1;
	}

	@ObfuscatedName("ob.ze(Lrn;I)V")
	public static final void method7279(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		long var1 = (long) arg0.field5215[arg0.field5216];
		long var3 = (long) arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = (int) (var1 * var3 / 100L + var1);
	}

	@ObfuscatedName("pc.zz(Lrn;B)V")
	public static final void method7888(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 & -1 - (0x1 << var2);
	}

	@ObfuscatedName("vt.zi(Lrn;B)V")
	public static final void method12211(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = (var1 & 0x1 << var2) == 0 ? 0 : 1;
	}

	@ObfuscatedName("zs.zt(Lrn;B)V")
	public static final void method13888(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 % var2;
	}

	@ObfuscatedName("k.zy(Lrn;B)V")
	public static final void method1606(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (var1 == 0) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = (int) Math.pow((double) var1, (double) var2);
		}
	}

	@ObfuscatedName("bj.zs(Lrn;I)V")
	public static final void method2022(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (var1 == 0) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else if (var2 == 0) {
			arg0.field5215[++arg0.field5216 - 1] = Integer.MAX_VALUE;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = (int) Math.pow((double) var1, 1.0D / (double) var2);
		}
	}

	@ObfuscatedName("sx.zr(Lrn;I)V")
	public static final void method11296(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 & var2;
	}

	@ObfuscatedName("ey.zm(Lrn;I)V")
	public static final void method3474(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 | var2;
	}

	@ObfuscatedName("aes.or(Lrn;I)V")
	public static final void method15655(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 < var2 ? var1 : var2;
	}

	@ObfuscatedName("qr.zl(Lrn;I)V")
	public static final void method8089(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1 > var2 ? var1 : var2;
	}

	@ObfuscatedName("zz.zq(Lrn;B)V")
	public static final void method13879(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		long var1 = (long) arg0.field5215[arg0.field5216];
		long var3 = (long) arg0.field5215[arg0.field5216 + 1];
		long var5 = (long) arg0.field5215[arg0.field5216 + 2];
		arg0.field5215[++arg0.field5216 - 1] = (int) (var1 * var5 / var3);
	}

	@ObfuscatedName("ae.zh(Lrn;B)V")
	public static final void method1973(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (var1 > 700 || var2 > 700) {
			arg0.field5215[++arg0.field5216 - 1] = 256;
		}
		double var3 = (Math.random() * (double) (var1 + var2) - (double) var1 + 800.0D) / 100.0D;
		arg0.field5215[++arg0.field5216 - 1] = (int) (Math.pow(2.0D, var3) + 0.5D);
	}

	@ObfuscatedName("pu.zp(Lrn;I)V")
	public static final void method7990(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field5083[ColourUtils.method3444(var1) & 0xFFFF];
	}

	@ObfuscatedName("pl.zo(Lrn;I)V")
	public static final void method7909(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		int var2 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = var1 + var2;
	}

	@ObfuscatedName("fw.zx(Lrn;B)V")
	public static final void method3672(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		String var2 = (String) arg0.field5222[arg0.field5230 + 1];
		arg0.field5222[++arg0.field5230 - 1] = var1 + var2;
	}

	@ObfuscatedName("fl.zj(Lrn;B)V")
	public static final void method3568(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		int var2 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = var1 + StringTools.method1601(var2, true);
	}

	@ObfuscatedName("et.zd(Lrn;I)V")
	public static final void method2919(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = TextUtil.method3978(var1);
	}

	@ObfuscatedName("oo.zg(Lrn;B)V")
	public static final void method7553(ClientScriptState arg0) {
		arg0.field5222[++arg0.field5230 - 1] = class604.method11921(Statics.method5541(arg0.field5215[--arg0.field5216]), Statics.field2308.method6339());
	}

	@ObfuscatedName("md.aar(Lrn;I)V")
	public static final void method6581(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		String var2 = (String) arg0.field5222[arg0.field5230 + 1];
		if (Statics.field2119.field10044 != null && Statics.field2119.field10044.field5005) {
			arg0.field5222[++arg0.field5230 - 1] = var2;
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var1;
		}
	}

	@ObfuscatedName("gq.aak(Lrn;I)V")
	public static final void method3924(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = Integer.toString(var1);
	}

	@ObfuscatedName("fe.aab(Lrn;I)V")
	public static final void method3842(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		arg0.field5215[++arg0.field5216 - 1] = StringComparator.method4794((String) arg0.field5222[arg0.field5230], (String) arg0.field5222[arg0.field5230 + 1], Statics.field2308);
	}

	@ObfuscatedName("iq.aah(Lrn;I)V")
	public static final void method4572(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		arg0.field5216 -= 2;
		int var2 = arg0.field5215[arg0.field5216];
		int var3 = arg0.field5215[arg0.field5216 + 1];
		FontMetrics var4 = FontMetrics.method12156(Statics.field8745, var3, 0);
		arg0.field5215[++arg0.field5216 - 1] = var4.method12394(var1, var2, Statics.field8538);
	}

	@ObfuscatedName("vg.aaw(Lrn;I)V")
	public static final void method12224(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		arg0.field5216 -= 2;
		int var2 = arg0.field5215[arg0.field5216];
		int var3 = arg0.field5215[arg0.field5216 + 1];
		FontMetrics var4 = FontMetrics.method12156(Statics.field8745, var3, 0);
		arg0.field5215[++arg0.field5216 - 1] = var4.method12393(var1, var2, Statics.field8538);
	}

	@ObfuscatedName("zz.aae(Lrn;I)V")
	public static final void method13881(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		String var2 = (String) arg0.field5222[arg0.field5230 + 1];
		if (arg0.field5215[--arg0.field5216] == 1) {
			arg0.field5222[++arg0.field5230 - 1] = var1;
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2;
		}
	}

	@ObfuscatedName("iu.aan(Lrn;B)V")
	public static final void method4670(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		arg0.field5222[++arg0.field5230 - 1] = class121.method4597(var1);
	}

	@ObfuscatedName("oy.aaz(Lrn;I)V")
	public static final void method7393(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		int var2 = arg0.field5215[--arg0.field5216];
		if (var2 == -1) {
			throw new RuntimeException("");
		}
		arg0.field5222[++arg0.field5230 - 1] = var1 + (char) var2;
	}

	@ObfuscatedName("ec.aap(Lrn;S)V")
	public static final void method3445(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = StringTools.method6078((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("b.aax(Lrn;I)V")
	public static final void method1593(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.method12993((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("mp.aad(Lrn;I)V")
	public static final void method6255(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = StringTools.method14808((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("dm.aao(Lrn;B)V")
	public static final void method2886(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		arg0.field5216 -= 2;
		int var2 = arg0.field5215[arg0.field5216];
		int var3 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5222[++arg0.field5230 - 1] = var1.substring(var2, var3);
	}

	@ObfuscatedName("ot.aaf(Lrn;B)V")
	public static final void method7373(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		StringBuilder var2 = new StringBuilder(var1.length());
		boolean var3 = false;
		for (int var4 = 0; var4 < var1.length(); var4++) {
			char var5 = var1.charAt(var4);
			if (var5 == '<') {
				var3 = true;
			} else if (var5 == '>') {
				var3 = false;
			} else if (!var3) {
				var2.append(var5);
			}
		}
		arg0.field5222[++arg0.field5230 - 1] = var2.toString();
	}

	@ObfuscatedName("md.aas(Lrn;I)V")
	public static final void method6584(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		arg0.field5216 -= 2;
		int var2 = arg0.field5215[arg0.field5216];
		int var3 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("dh.aag(Lrn;B)V")
	public static final void method2708(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		String var2 = (String) arg0.field5222[arg0.field5230 + 1];
		int var3 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("qr.aaa(Lrn;B)V")
	public static final void method8090(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Character.toLowerCase((char) var1);
	}

	@ObfuscatedName("tv.aac(Lrn;B)V")
	public static final void method11758(ClientScriptState arg0) {
		boolean var1 = arg0.field5215[--arg0.field5216] != 0;
		int var2 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = StringComparator.method11664((long) var2, 0, var1, Statics.field2308);
	}

	@ObfuscatedName("jh.aal(Lrn;I)V")
	public static final void method4787(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		int var2 = arg0.field5215[--arg0.field5216];
		FontMetrics var3 = FontMetrics.method12156(Statics.field8745, var2, 0);
		arg0.field5215[++arg0.field5216 - 1] = var3.method12390(var1, Statics.field8538);
	}

	@ObfuscatedName("fz.aai(Lrn;I)V")
	public static final void method3659(ClientScriptState arg0) {
		arg0.field5222[++arg0.field5230 - 1] = class604.method6888((long) arg0.field5215[--arg0.field5216] * 60000L, Statics.field2308.method6339(), true) + " UTC";
	}

	@ObfuscatedName("al.aau(Lrn;B)V")
	public static final void method1818(ClientScriptState arg0) {
		long var1 = arg0.field5219[--arg0.field5220];
		arg0.field5222[++arg0.field5230 - 1] = var1 == -1L ? "" : Long.toString(var1, 36).toUpperCase();
	}

	@ObfuscatedName("zl.aaq(Lrn;I)V")
	public static final void method13895(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = Statics.field3492.method12316(var1).field7125;
	}

	@ObfuscatedName("fr.aav(Lrn;I)V")
	public static final void method3528(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ObjType var3 = Statics.field3492.method12316(var1);
		if (var2 < 1 || var2 > 5 || var3.field7082[var2 - 1] == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var3.field7082[var2 - 1];
		}
	}

	@ObfuscatedName("yf.aaj(Lrn;B)V")
	public static final void method12900(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ObjType var3 = Statics.field3492.method12316(var1);
		if (var2 < 1 || var2 > 5 || var3.field7083[var2 - 1] == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var3.field7083[var2 - 1];
		}
	}

	@ObfuscatedName("acy.abf(Lrn;B)V")
	public static final void method14962(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3492.method12316(var1).field7080;
	}

	@ObfuscatedName("cy.abx(Lrn;I)V")
	public static final void method2589(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ObjType var2 = Statics.field3492.method12316(var1);
		if (var2.field7108 >= 0 && var2.field7107 >= 0) {
			arg0.field5215[++arg0.field5216 - 1] = var2.field7107;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var1;
		}
	}

	@ObfuscatedName("io.abn(Lrn;I)V")
	public static final void method4605(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3492.method12316(var1).field7087;
	}

	@ObfuscatedName("rw.abr(Lrn;I)V")
	public static final void method8603(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3492.method12316(var1).field7089;
	}

	@ObfuscatedName("qe.abu(Lrn;I)V")
	public static final void method8317(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3492.method12316(var1).field7099 ? 1 : 0;
	}

	@ObfuscatedName("dn.abw(Lrn;I)V")
	public static final void method2863(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ParamType var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.field5222[++arg0.field5230 - 1] = Statics.field3492.method12316(var1).method12248(var2, var3.field7288);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field3492.method12316(var1).method12250(var2, var3.field7287);
		}
	}

	@ObfuscatedName("aau.abb(Lrn;B)V")
	public static final void method14089(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1] - 1;
		ObjType var3 = Statics.field3492.method12316(var1);
		arg0.field5215[++arg0.field5216 - 1] = var3.method12252(var2);
	}

	@ObfuscatedName("gf.abl(Lrn;I)V")
	public static final void method4005(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		int var2 = arg0.field5215[--arg0.field5216];
		client.method13898(var1, var2 == 1);
		arg0.field5215[++arg0.field5216 - 1] = Statics.field1539;
	}

	@ObfuscatedName("zt.abc(Lrn;I)V")
	public static final void method13885(ClientScriptState arg0) {
		if (Statics.field579 == null || Statics.field8729 >= Statics.field1539) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field579[++Statics.field8729 - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("afs.abi(Lrn;I)V")
	public static final void method15784(ClientScriptState arg0) {
		Statics.field8729 = 0;
	}

	@ObfuscatedName("ar.abq(Lrn;I)V")
	public static final void method1700(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		arg0.field5216 -= 3;
		int var2 = arg0.field5215[arg0.field5216];
		int var3 = arg0.field5215[arg0.field5216 + 1];
		int var4 = arg0.field5215[arg0.field5216 + 2];
		client.method11081(var1, var2 == 1, var3, var4);
		arg0.field5215[++arg0.field5216 - 1] = Statics.field1539;
	}

	@ObfuscatedName("lu.abm(Lrn;I)V")
	public static final void method5828(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		arg0.field5216 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		int var2 = arg0.field5215[arg0.field5216];
		int var3 = arg0.field5215[arg0.field5216 + 1];
		String var4 = (String) arg0.field5222[arg0.field5230 + 1];
		client.method1379(var1, var2 == 1, var3, var4);
		arg0.field5215[++arg0.field5216 - 1] = Statics.field1539;
	}

	@ObfuscatedName("su.abv(Lrn;I)V")
	public static final void method11199(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ObjType var2 = Statics.field3492.method12316(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field7086 ? 1 : 0;
	}

	@ObfuscatedName("aw.abh(Lrn;I)V")
	public static final void method1883(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ObjType var2 = Statics.field3492.method12316(var1);
		int var3;
		if (var2.field7086) {
			var3 = var2.field7097;
		} else if (var2.field7099) {
			var3 = Statics.field1736.field5127;
		} else {
			var3 = Statics.field1736.field5128;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("uv.abe(Lrn;I)V")
	public static final void method12164(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ParamType var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.field5222[++arg0.field5230 - 1] = Statics.field3774.method12565(var1).method12515(var2, var3.field7288);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field3774.method12565(var1).method12514(var2, var3.field7287);
		}
	}

	@ObfuscatedName("lo.abd(Lrn;S)V")
	public static final void method5788(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ParamType var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.field5222[++arg0.field5230 - 1] = client.field8980.method6103().method11471(var1).method11417(var2, var3.field7288);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = client.field8980.method6103().method11471(var1).method11444(var2, var3.field7287);
		}
	}

	@ObfuscatedName("ow.abg(Lrn;I)V")
	public static final void method7346(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ParamType var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.field5222[++arg0.field5230 - 1] = Statics.field4214.method12383(var1).method16782(var2, var3.field7288);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field4214.method12383(var1).method16777(var2, var3.field7287);
		}
	}

	@ObfuscatedName("ahr.abt(Lrn;B)V")
	public static final void method16115(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ParamType var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.field5222[++arg0.field5230 - 1] = Statics.field566.method11144(var1).method11127(var2, var3.field7288);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field566.method11144(var1).method11121(var2, var3.field7287);
		}
	}

	@ObfuscatedName("dn.abs(Lrn;I)V")
	public static final void method2869(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		BASType var2 = Statics.field3769.method7784(var1);
		if (var2.field4689 == null || var2.field4689.length <= 0) {
			arg0.field5215[++arg0.field5216 - 1] = var2.field4688;
			return;
		}
		int var3 = 0;
		int var4 = var2.field4690[0];
		for (int var5 = 1; var5 < var2.field4689.length; var5++) {
			if (var2.field4690[var5] > var4) {
				var3 = var5;
				var4 = var2.field4690[var5];
			}
		}
		arg0.field5215[++arg0.field5216 - 1] = var2.field4689[var3];
	}

	@ObfuscatedName("nj.abo(Lrn;I)V")
	public static final void method6969(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9079 ? 1 : 0;
	}

	@ObfuscatedName("c.aba(Lrn;I)V")
	public static final void method1326(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (client.field8923 != 15 || Statics.method16489()) {
			client.field9030 = -5;
		} else if (var1.length() > 20) {
			client.field9030 = -4;
		} else {
			client.field9030 = -1;
			ClientMessage var2 = ClientMessage.method14781(ClientProt.field2861, client.field8959.field834);
			var2.field9467.method15308(0);
			int var3 = var2.field9467.field9626;
			var2.field9467.method15228(var1);
			var2.field9467.method15251(var2.field9467.field9626 - var3);
			client.field8959.method1913(var2);
		}
	}

	@ObfuscatedName("qy.abz(Lrn;B)V")
	public static final void method8348(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9030;
		if (client.field9030 != -1) {
			client.field9030 = -6;
		}
	}

	@ObfuscatedName("ey.acc(Lrn;B)V")
	public static final void method3476(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9177;
	}

	@ObfuscatedName("pq.acp(Lrn;I)V")
	public static final void method7714(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		client.field9177 = arg0.field5215[arg0.field5216];
		Statics.field769 = class559.method11235(arg0.field5215[arg0.field5216 + 1]);
		if (Statics.field769 == null) {
			Statics.field769 = class559.field6697;
		}
		client.field9178 = arg0.field5215[arg0.field5216 + 2];
		ServerConnection var1 = client.method4104();
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2922, var1.field834);
		var2.field9467.method15308(client.field9177);
		var2.field9467.method15308(Statics.field769.field6699);
		var2.field9467.method15308(client.field9178);
		var1.method1913(var2);
	}

	@ObfuscatedName("os.aca(Lrn;S)V")
	public static final void method7229(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		String var2 = (String) arg0.field5222[arg0.field5230 + 1];
		arg0.field5216 -= 2;
		int var3 = arg0.field5215[arg0.field5216];
		int var4 = arg0.field5215[arg0.field5216 + 1];
		if (var2 == null) {
			var2 = "";
		}
		if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}
		ServerConnection var5 = client.method4104();
		ClientMessage var6 = ClientMessage.method14781(ClientProt.field2926, var5.field834);
		var6.field9467.method15308(Statics.method1724(var1) + 2 + Statics.method1724(var2));
		var6.field9467.method15228(var1);
		var6.field9467.method15308(var3 - 1);
		var6.field9467.method15308(var4);
		var6.field9467.method15228(var2);
		var5.method1913(var6);
	}

	@ObfuscatedName("mb.acv(Lrn;I)V")
	public static final void method6477(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2110 != null) {
			var3 = var2.field2110;
		}
		arg0.field5222[++arg0.field5230 - 1] = var3;
	}

	@ObfuscatedName("da.acl(Lrn;B)V")
	public static final void method2817(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		int var3 = -1;
		if (var2 != null) {
			var3 = var2.field2104;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("xz.acr(Lrn;I)V")
	public static final void method12856(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ServerConnection var2 = client.method4104();
		ClientMessage var3 = ClientMessage.method14781(ClientProt.field2862, var2.field834);
		var3.field9467.method15308(var1);
		var2.method1913(var3);
	}

	@ObfuscatedName("gf.ach(Lrn;B)V")
	public static final void method4003(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		String var2 = (String) arg0.field5222[arg0.field5230 + 1];
		if (client.field9074 == 0 && (client.field9054 && !client.field9077 || client.field9081)) {
			return;
		}
		ServerConnection var3 = client.method4104();
		ClientMessage var4 = ClientMessage.method14781(ClientProt.field2919, var3.field834);
		var4.field9467.method15287(0);
		int var5 = var4.field9467.field9626;
		var4.field9467.method15228(var1);
		class178.method14081(var4.field9467, var2);
		var4.field9467.method15233(var4.field9467.field9626 - var5);
		var3.method1913(var4);
	}

	@ObfuscatedName("rz.acz(Lrn;B)V")
	public static final void method8657(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2106 != null) {
			var3 = var2.field2106;
		}
		arg0.field5222[++arg0.field5230 - 1] = var3;
	}

	@ObfuscatedName("fg.acb(Lrn;B)V")
	public static final void method3640(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2109 != null) {
			var3 = var2.field2109;
		}
		arg0.field5222[++arg0.field5230 - 1] = var3;
	}

	@ObfuscatedName("pq.act(Lrn;I)V")
	public static final void method7715(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		int var3 = -1;
		if (var2 != null) {
			var3 = var2.field2102;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("az.acj(Lrn;I)V")
	public static final void method1945(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9178;
	}

	@ObfuscatedName("fd.acd(Lrn;B)V")
	public static final void method3508(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = ChatHistory.method7655();
	}

	@ObfuscatedName("rx.acq(Lrn;B)V")
	public static final void method8583(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		int var3 = 0;
		if (var2 != null) {
			var3 = var2.field2111;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("sm.acs(Lrn;I)V")
	public static final void method11184(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2107 != null) {
			var3 = var2.field2107;
		}
		arg0.field5222[++arg0.field5230 - 1] = var3;
	}

	@ObfuscatedName("cg.aco(Lrn;I)V")
	public static final void method2555(ClientScriptState arg0) {
		String var1;
		if (Statics.field2119 == null || Statics.field2119.field10063 == null) {
			var1 = "";
		} else {
			var1 = Statics.field2119.method16121(false);
		}
		arg0.field5222[++arg0.field5230 - 1] = var1;
	}

	@ObfuscatedName("lc.acg(Lrn;I)V")
	public static final void method5966(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		int var3 = -1;
		if (var2 != null) {
			var3 = var2.field2105;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("aj.ack(Lrn;B)V")
	public static final void method1959(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		int var3 = -1;
		if (var2 != null) {
			var3 = var2.field2103;
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("fl.acw(Lrn;I)V")
	public static final void method3569(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ChatLine var2 = ChatHistory.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2108 != null) {
			var3 = var2.field2108;
		}
		arg0.field5222[++arg0.field5230 - 1] = var3;
	}

	@ObfuscatedName("afv.aci(Lrn;I)V")
	public static final void method15856(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = Statics.field3262.method5933(var1).field10357;
	}

	@ObfuscatedName("ae.acu(Lrn;I)V")
	public static final void method1967(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		QuickChatCatType var2 = Statics.field3262.method5933(var1);
		if (var2.field10359 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.field10359.length;
		}
	}

	@ObfuscatedName("fe.ace(Lrn;I)V")
	public static final void method3845(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		QuickChatCatType var3 = Statics.field3262.method5933(var1);
		int var4 = var3.field10359[var2];
		arg0.field5215[++arg0.field5216 - 1] = var4;
	}

	@ObfuscatedName("np.acn(Lrn;I)V")
	public static final void method6880(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		QuickChatCatType var2 = Statics.field3262.method5933(var1);
		if (var2.field10356 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.field10356.length;
		}
	}

	@ObfuscatedName("ew.acy(Lrn;I)V")
	public static final void method3205(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3262.method5933(var1).field10356[var2];
	}

	@ObfuscatedName("ed.adh(Lrn;I)V")
	public static final void method3082(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5222[++arg0.field5230 - 1] = Statics.field3779.method12176(var1).method16750();
	}

	@ObfuscatedName("ow.adf(Lrn;I)V")
	public static final void method7347(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		QuickChatPhraseType var2 = Statics.field3779.method12176(var1);
		if (var2.field10393 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.field10393.length;
		}
	}

	@ObfuscatedName("ed.adn(Lrn;I)V")
	public static final void method3085(ClientScriptState arg0) {
		arg0.field5213 = new class270();
		arg0.field5213.field2655 = arg0.field5215[--arg0.field5216];
		arg0.field5213.field2656 = Statics.field3779.method12176(arg0.field5213.field2655);
		arg0.field5213.field2657 = new int[arg0.field5213.field2656.method16751()];
	}

	@ObfuscatedName("d.ada(Lrn;I)V")
	public static final void method1359(ClientScriptState arg0) {
		ServerConnection var1 = client.method4104();
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2936, var1.field834);
		var2.field9467.method15308(0);
		int var3 = var2.field9467.field9626;
		var2.field9467.method15308(0);
		var2.field9467.method15287(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var2.field9467, arg0.field5213.field2657);
		var2.field9467.method15251(var2.field9467.field9626 - var3);
		var1.method1913(var2);
	}

	@ObfuscatedName("ga.adc(Lrn;B)V")
	public static final void method4105(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		ServerConnection var2 = client.method4104();
		ClientMessage var3 = ClientMessage.method14781(ClientProt.field2901, var2.field834);
		var3.field9467.method15308(0);
		int var4 = var3.field9467.field9626;
		var3.field9467.method15228(var1);
		var3.field9467.method15287(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var3.field9467, arg0.field5213.field2657);
		var3.field9467.method15251(var3.field9467.field9626 - var4);
		var2.method1913(var3);
	}

	@ObfuscatedName("ga.ade(Lrn;I)V")
	public static final void method4106(ClientScriptState arg0) {
		ServerConnection var1 = client.method4104();
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2936, var1.field834);
		var2.field9467.method15308(0);
		int var3 = var2.field9467.field9626;
		var2.field9467.method15308(1);
		var2.field9467.method15287(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var2.field9467, arg0.field5213.field2657);
		var2.field9467.method15251(var2.field9467.field9626 - var3);
		var1.method1913(var2);
	}

	@ObfuscatedName("pi.adm(Lrn;I)V")
	public static final void method7903(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3262.method5933(var1).field10358[var2];
	}

	@ObfuscatedName("ex.adr(Lrn;I)V")
	public static final void method3308(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3262.method5933(var1).field10360[var2];
	}

	@ObfuscatedName("dq.adg(Lrn;B)V")
	public static final void method2895(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (var2 == -1) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field3262.method5933(var1).method16692((char) var2);
		}
	}

	@ObfuscatedName("nx.adt(Lrn;I)V")
	public static final void method6828(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (var2 == -1) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field3262.method5933(var1).method16699((char) var2);
		}
	}

	@ObfuscatedName("ao.adj(Lrn;I)V")
	public static final void method1806(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3779.method12176(var1).method16751();
	}

	@ObfuscatedName("dj.adq(Lrn;I)V")
	public static final void method2610(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5213.field2657[var1] = var2;
	}

	@ObfuscatedName("k.ado(Lrn;I)V")
	public static final void method1607(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5213.field2657[var1] = var2;
	}

	@ObfuscatedName("aei.adp(Lrn;B)V")
	public static final void method15613(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		QuickChatPhraseType var4 = Statics.field3779.method12176(var1);
		if (var4.method16752(var2).field5029 != 0) {
			throw new RuntimeException("");
		}
		arg0.field5215[++arg0.field5216 - 1] = var4.method16757(var2, var3);
	}

	@ObfuscatedName("an.adk(Lrn;I)V")
	public static final void method1715(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		boolean var2 = arg0.field5215[--arg0.field5216] == 1;
		client.method12143(var1, var2);
		arg0.field5215[++arg0.field5216 - 1] = Statics.field1539;
	}

	@ObfuscatedName("ev.adx(Lrn;I)V")
	public static final void method2984(ClientScriptState arg0) {
		if (Statics.field579 == null || Statics.field8729 >= Statics.field1539) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field579[++Statics.field8729 - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("fn.adw(Lrn;B)V")
	public static final void method3563(ClientScriptState arg0) {
		Statics.field8729 = 0;
	}

	@ObfuscatedName("nz.adl(Lrn;B)V")
	public static final void method6985(ClientScriptState arg0) {
		ServerConnection var1 = client.method4104();
		ClientMessage var2 = ClientMessage.method14781(ClientProt.field2936, var1.field834);
		var2.field9467.method15308(0);
		int var3 = var2.field9467.field9626;
		var2.field9467.method15308(3);
		var2.field9467.method15287(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var2.field9467, arg0.field5213.field2657);
		var2.field9467.method15251(var2.field9467.field9626 - var3);
		var1.method1913(var2);
	}

	@ObfuscatedName("rf.adv(Lrn;B)V")
	public static final void method8630(ClientScriptState arg0) {
		if (Statics.field2131.method7243(86)) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("fh.adu(Lrn;I)V")
	public static final void method3651(ClientScriptState arg0) {
		if (Statics.field2131.method7243(82)) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("qs.adb(Lrn;S)V")
	public static final void method8385(ClientScriptState arg0) {
		if (Statics.field2131.method7243(81)) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("se.ady(Lrn;I)V")
	public static final void method11114(ClientScriptState arg0) {
		ClientWorldMap.method12903(arg0.field5215[--arg0.field5216]);
	}

	@ObfuscatedName("ew.adz(Lrn;I)V")
	public static final void method3204(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = ClientWorldMap.method1603();
	}

	@ObfuscatedName("eh.aet(Lrn;I)V")
	public static final void method3067(ClientScriptState arg0) {
		ClientWorldMap.method8626(arg0.field5215[--arg0.field5216], -1, -1, false);
	}

	@ObfuscatedName("gd.aeg(Lrn;I)V")
	public static final void method4121(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		WorldMapAreaMetadata var2 = class408.method7084(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		if (var2 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.field10370;
		}
	}

	@ObfuscatedName("eb.aep(Lrn;I)V")
	public static final void method3316(ClientScriptState arg0) {
		WorldMapAreaMetadata var1 = class408.method7117(arg0.field5215[--arg0.field5216]);
		if (var1 == null || var1.field10372 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var1.field10372;
		}
	}

	@ObfuscatedName("kg.aeb(Lrn;I)V")
	public static final void method5561(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field6423;
		arg0.field5215[++arg0.field5216 - 1] = Statics.field6344;
	}

	@ObfuscatedName("b.aej(Lrn;I)V")
	public static final void method1591(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4465 + Statics.field4283;
		arg0.field5215[++arg0.field5216 - 1] = Statics.field6770 + Statics.field4284;
	}

	@ObfuscatedName("ib.aek(Lrn;I)V")
	public static final void method4607(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		WorldMapAreaMetadata var2 = class408.method7117(var1);
		if (var2 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.field10365 >> 14 & 0x3FFF;
			arg0.field5215[++arg0.field5216 - 1] = var2.field10365 & 0x3FFF;
		}
	}

	@ObfuscatedName("up.aee(Lrn;I)V")
	public static final void method11876(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		WorldMapAreaMetadata var2 = class408.method7117(var1);
		if (var2 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.field10369 - var2.field10368;
			arg0.field5215[++arg0.field5216 - 1] = var2.field10371 - var2.field10364;
		}
	}

	@ObfuscatedName("iq.aeh(Lrn;I)V")
	public static final void method4570(ClientScriptState arg0) {
		class806 var1 = ClientWorldMap.method12725();
		if (var1 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var1.field9564;
			int var2 = var1.field9565 << 28 | var1.field9566 + Statics.field4283 << 14 | var1.field9567 + Statics.field4284;
			arg0.field5215[++arg0.field5216 - 1] = var2;
		}
	}

	@ObfuscatedName("nx.aeq(Lrn;I)V")
	public static final void method6826(ClientScriptState arg0) {
		class806 var1 = ClientWorldMap.method11468();
		if (var1 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var1.field9564;
			int var2 = var1.field9565 << 28 | var1.field9566 + Statics.field4283 << 14 | var1.field9567 + Statics.field4284;
			arg0.field5215[++arg0.field5216 - 1] = var2;
		}
	}

	@ObfuscatedName("aem.aey(Lrn;I)V")
	public static final void method15591(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		WorldMapAreaMetadata var2 = ClientWorldMap.method12024();
		if (var2 != null) {
			boolean var3 = var2.method16705(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field5200);
			if (var3) {
				ClientWorldMap.method12730(field5200[1], field5200[2]);
			}
		}
	}

	@ObfuscatedName("qp.aem(Lrn;I)V")
	public static final void method8197(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		DualIterableQueue var3 = class408.method7086(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		boolean var4 = false;
		for (WorldMapAreaMetadata var5 = (WorldMapAreaMetadata) var3.method11756(); var5 != null; var5 = (WorldMapAreaMetadata) var3.method11744()) {
			if (var5.field10370 == var2) {
				var4 = true;
				break;
			}
		}
		if (var4) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("wb.aeo(Lrn;I)V")
	public static final void method12724(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		WorldMapAreaMetadata var2 = class408.method7117(var1);
		if (var2 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = var2.field10367;
		}
	}

	@ObfuscatedName("ey.aen(Lrn;I)V")
	public static final void method3473(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ClientWorldMap.method8626(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, false);
	}

	@ObfuscatedName("ik.aei(Lrn;I)V")
	public static final void method4655(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		WorldMapAreaMetadata var2 = ClientWorldMap.method12024();
		if (var2 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = -1;
			return;
		}
		boolean var3 = var2.method16705(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field5200);
		if (var3) {
			arg0.field5215[++arg0.field5216 - 1] = field5200[1];
			arg0.field5215[++arg0.field5216 - 1] = field5200[2];
		} else {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = -1;
		}
	}

	@ObfuscatedName("pn.aeu(Lrn;B)V")
	public static final void method7786(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		WorldMapAreaMetadata var2 = ClientWorldMap.method12024();
		if (var2 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = -1;
			return;
		}
		boolean var3 = var2.method16707(var1 >> 14 & 0x3FFF, var1 & 0x3FFF, field5200);
		if (var3) {
			arg0.field5215[++arg0.field5216 - 1] = field5200[1];
			arg0.field5215[++arg0.field5216 - 1] = field5200[2];
		} else {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = -1;
		}
	}

	@ObfuscatedName("ly.aex(Lrn;I)V")
	public static final void method5733(ClientScriptState arg0) {
		ClientWorldMap.method11236(arg0.field5215[--arg0.field5216]);
	}

	@ObfuscatedName("qm.aez(Lrn;B)V")
	public static final void method8030(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ClientWorldMap.method8626(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, true);
	}

	@ObfuscatedName("gi.aec(Lrn;I)V")
	public static final void method4034(ClientScriptState arg0) {
		ClientWorldMap.field9758 = arg0.field5215[--arg0.field5216] == 1;
	}

	@ObfuscatedName("qi.ael(Lrn;B)V")
	public static final void method8046(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = ClientWorldMap.field9758 ? 1 : 0;
	}

	@ObfuscatedName("ms.aes(Lrn;I)V")
	public static final void method6487(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ClientWorldMap.method3087(var1);
	}

	@ObfuscatedName("ajo.aer(Lrn;I)V")
	public static final void method16720(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		boolean var2 = arg0.field5215[arg0.field5216 + 1] == 1;
		if (ClientWorldMap.field9766 == null) {
			return;
		}
		Node var3 = ClientWorldMap.field9766.method11923((long) var1);
		if (var3 != null && !var2) {
			var3.method6979();
		} else if (var3 == null && var2) {
			Node var4 = new Node();
			ClientWorldMap.field9766.method11927(var4, (long) var1);
		}
	}

	@ObfuscatedName("iw.aea(Lrn;B)V")
	public static final void method4566(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (ClientWorldMap.field9766 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			Node var2 = ClientWorldMap.field9766.method11923((long) var1);
			arg0.field5215[++arg0.field5216 - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("po.aed(Lrn;B)V")
	public static final void method7813(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		boolean var2 = arg0.field5215[arg0.field5216 + 1] == 1;
		if (ClientWorldMap.field9765 == null) {
			return;
		}
		Node var3 = ClientWorldMap.field9765.method11923((long) var1);
		if (var3 != null && !var2) {
			var3.method6979();
		} else if (var3 == null && var2) {
			Node var4 = new Node();
			ClientWorldMap.field9765.method11927(var4, (long) var1);
		}
	}

	@ObfuscatedName("er.afp(Lrn;I)V")
	public static final void method2993(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (ClientWorldMap.field9765 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			Node var2 = ClientWorldMap.field9765.method11923((long) var1);
			arg0.field5215[++arg0.field5216 - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("qp.afg(Lrn;B)V")
	public static final void method8199(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4292 == null ? -1 : Statics.field4292.field10370;
	}

	@ObfuscatedName("id.afx(Lrn;I)V")
	public static final void method4594(ClientScriptState arg0) {
		client.method7983();
	}

	@ObfuscatedName("al.afa(Lrn;I)V")
	public static final void method1819(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (Fullscreen.field6700) {
			client.method7282(3, var1, var2, false);
			arg0.field5215[++arg0.field5216 - 1] = Statics.field1587 == null ? 0 : 1;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("qr.afy(Lrn;B)V")
	public static final void method8093(ClientScriptState arg0) {
		if (Fullscreen.field6700 && Statics.field1587 != null) {
			client.method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
		}
	}

	@ObfuscatedName("acb.afh(Lrn;B)V")
	public static final void method14811(ClientScriptState arg0) {
		if (Fullscreen.field6700) {
			class562[] var1 = client.method1671();
			arg0.field5215[++arg0.field5216 - 1] = var1.length;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("ay.afc(Lrn;I)V")
	public static final void method1683(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (Fullscreen.field6700) {
			class562[] var2 = client.method1671();
			arg0.field5215[++arg0.field5216 - 1] = var2[var1].field6709;
			arg0.field5215[++arg0.field5216 - 1] = var2[var1].field6707;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("rc.afz(Lrn;I)V")
	public static final void method8608(ClientScriptState arg0) {
		int var1 = Statics.field6693;
		int var2 = Statics.field3315;
		int var3 = -1;
		if (Fullscreen.field6700) {
			class562[] var4 = client.method1671();
			for (int var5 = 0; var5 < var4.length; var5++) {
				class562 var6 = var4[var5];
				if (var6.field6709 == var1 && var6.field6707 == var2) {
					var3 = var5;
					break;
				}
			}
		}
		arg0.field5215[++arg0.field5216 - 1] = var3;
	}

	@ObfuscatedName("dm.afo(Lrn;I)V")
	public static final void method2890(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 >= 1 && var1 <= 2) {
			client.method7282(var1, -1, -1, false);
		}
	}

	@ObfuscatedName("iw.afs(Lrn;I)V")
	public static final void method4564(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9663.method15766();
	}

	@ObfuscatedName("lo.afk(Lrn;B)V")
	public static final void method5789(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 >= 1 && var1 <= 2) {
			Statics.field4961.method15448(Statics.field4961.field9663, var1);
			Statics.field4961.method15448(Statics.field4961.field9664, var1);
			Statics.method1245();
		}
	}

	@ObfuscatedName("js.afn(Lrn;B)V")
	public static final void method4804(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		method14095((String) arg0.field5222[arg0.field5230], (String) arg0.field5222[arg0.field5230 + 1], "", arg0.field5215[--arg0.field5216] == 1, false);
	}

	@ObfuscatedName("cv.afb(Lrn;I)V")
	public static final void method2430(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		Statics.field2744[arg0.field5215[arg0.field5216]] = (short) ColourUtils.method16884(arg0.field5215[arg0.field5216 + 1]);
		Statics.field3492.method12298();
		Statics.field3492.method12297();
		Statics.field3774.method12559();
		client.method1703();
	}

	@ObfuscatedName("at.afl(Lrn;I)V")
	public static final void method1836(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (var1 >= 0 && var1 < 2) {
			client.field9076[var1] = new int[var2 << 1][4];
		}
	}

	@ObfuscatedName("fw.afj(Lrn;B)V")
	public static final void method3673(ClientScriptState arg0) {
		if (Fullscreen.field6700 && Statics.field1587 != null) {
			client.method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
		}
		if (Statics.method5937() == GameShellEnvironment.field4118) {
			client.method831();
			System.exit(0);
		} else {
			client.method4010();
		}
	}

	@ObfuscatedName("um.afv(Lrn;B)V")
	public static final void method12115(ClientScriptState arg0) {
		String var1 = null;
		if (Statics.field771 != null) {
			var1 = Statics.field771.method1594();
		}
		if (var1 == null) {
			var1 = "";
		}
		arg0.field5222[++arg0.field5230 - 1] = var1;
	}

	@ObfuscatedName("ot.aft(Lrn;I)V")
	public static final void method7374(ClientScriptState arg0) {
		if (Fullscreen.field6700 && Statics.field1587 != null) {
			client.method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
		}
		String var1 = (String) arg0.field5222[--arg0.field5230];
		boolean var2 = arg0.field5215[--arg0.field5216] == 1;
		String var3 = client.method11406() + var1;
		class383.method3613(var3, var2, Statics.field4961.field9661.method15781() == 5, client.field8915, client.field9218);
	}

	@ObfuscatedName("el.afi(Lrn;I)V")
	public static final void method3212(ClientScriptState arg0) {
		System.out.println(arg0.field5222[--arg0.field5230]);
	}

	@ObfuscatedName("aga.aff(Lrn;I)V")
	public static final void method15920(ClientScriptState arg0) {
		arg0.field5216 -= 12;
		MiniMenu.method3561();
		MiniMenu.method13886();
		Statics.field9426 = arg0.field5215[arg0.field5216];
		Statics.field6566 = arg0.field5215[arg0.field5216 + 1];
		Statics.field1477 = arg0.field5215[arg0.field5216 + 2];
		Statics.field5052 = arg0.field5215[arg0.field5216 + 3];
		Statics.field8531 = arg0.field5215[arg0.field5216 + 4];
		Statics.field6372 = arg0.field5215[arg0.field5216 + 5];
		Statics.field2333 = arg0.field5215[arg0.field5216 + 6];
		Statics.field617 = arg0.field5215[arg0.field5216 + 7];
		Statics.field2338 = arg0.field5215[arg0.field5216 + 8];
		Statics.field8718 = arg0.field5215[arg0.field5216 + 9];
		Statics.field5086 = arg0.field5215[arg0.field5216 + 10];
		Statics.field1387 = arg0.field5215[arg0.field5216 + 11];
		Statics.field7387.method5630(Statics.field8531);
		Statics.field7387.method5630(Statics.field6372);
		Statics.field7387.method5630(Statics.field2333);
		Statics.field7387.method5630(Statics.field617);
		Statics.field7387.method5630(Statics.field2338);
		Statics.field7387.method5630(Statics.field1387);
		Statics.field8745.method5630(Statics.field1387);
		Statics.field8519 = null;
		Statics.field3411 = null;
		Statics.field3925 = null;
		Statics.field1557 = null;
		Statics.field8491 = null;
		Statics.field2652 = null;
		Statics.field6819 = null;
		Statics.field6392 = null;
		MiniMenu.field613 = true;
	}

	@ObfuscatedName("jv.afw(Lrn;B)V")
	public static final void method4726(ClientScriptState arg0) {
		MiniMenu.method3963();
		MiniMenu.field613 = false;
	}

	@ObfuscatedName("acm.afu(Lrn;I)V")
	public static final void method14741(ClientScriptState arg0) {
		arg0.field5216 -= 2;
	}

	@ObfuscatedName("ru.agi(Lrn;I)V")
	public static final void method8623(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		arg0.field5215[++arg0.field5216 - 1] = MiniMenu.method8097(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("aie.agd(Lrn;I)V")
	public static final void method16249(ClientScriptState arg0) {
		class62.method7065((String) arg0.field5222[--arg0.field5230], false, false);
	}

	@ObfuscatedName("rj.aga(Lrn;B)V")
	public static final void method8602(ClientScriptState arg0) {
		JavascriptFunction.field3142.method4761();
	}

	@ObfuscatedName("el.ago(Lrn;I)V")
	public static final void method3215(ClientScriptState arg0) {
		JavascriptFunction.field3140.method4761();
	}

	@ObfuscatedName("air.agg(Lrn;I)V")
	public static final void method16254(ClientScriptState arg0) {
		String var1 = "";
		if (Statics.field8726 != null) {
			Transferable var2 = Statics.field8726.getContents(null);
			if (var2 != null) {
				try {
					var1 = (String) var2.getTransferData(DataFlavor.stringFlavor);
					if (var1 == null) {
						var1 = "";
					}
				} catch (Exception var4) {
				}
			}
		}
		arg0.field5222[++arg0.field5230 - 1] = var1;
	}

	@ObfuscatedName("ra.agw(Lrn;I)V")
	public static final void method828(ClientScriptState arg0) {
		MiniMenu.field616 = arg0.field5215[--arg0.field5216];
	}

	@ObfuscatedName("eo.agf(Lrn;B)V")
	public static final void method3290(ClientScriptState arg0) {
		arg0.field5230 -= 3;
		method14095((String) arg0.field5222[arg0.field5230], (String) arg0.field5222[arg0.field5230 + 1], (String) arg0.field5222[arg0.field5230 + 2], arg0.field5215[--arg0.field5216] == 1, true);
	}

	@ObfuscatedName("jv.agl(Lrn;I)V")
	public static final void method4721(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8903 ? 1 : 0;
	}

	@ObfuscatedName("ig.agh(Lrn;I)V")
	public static final void method4558(ClientScriptState arg0) {
		if (Statics.field2305.field9707 < 6) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else if (Statics.field2305.field9707 == 6 && Statics.field2305.field9701 < 10) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		}
	}

	@ObfuscatedName("qo.agn(Lrn;I)V")
	public static final void method8081(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.method1608(client.field8923) ? 1 : 0;
	}

	@ObfuscatedName("nn.agp(Lrn;I)V")
	public static final void method6884(ClientScriptState arg0) {
		arg0.field5222[++arg0.field5230 - 1] = GameShell.method4634().toString();
	}

	@ObfuscatedName("pk.agm(Lrn;I)V")
	public static final void method7969(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		arg0.field5233 = new class53(var1, true);
	}

	@ObfuscatedName("u.agb(Lrn;I)V")
	public static final void method1240(ClientScriptState arg0) {
		boolean var1 = false;
		String var2 = "";
		if (arg0.field5233 != null && arg0.field5233.method1706()) {
			File var3 = arg0.field5233.method1705();
			if (var3 != null) {
				var2 = var3.getPath();
				if (var2 == null) {
					var2 = "";
				}
			}
			var1 = true;
			arg0.field5233 = null;
		}
		arg0.field5215[++arg0.field5216 - 1] = var1 ? 1 : 0;
		arg0.field5222[++arg0.field5230 - 1] = var2;
	}

	@ObfuscatedName("lq.agj(Lrn;I)V")
	public static final void method5921(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		boolean var2 = Statics.field1543.method6653(new File(var1));
		arg0.field5215[++arg0.field5216 - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("is.agt(Lrn;I)V")
	public static final void method4636(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		CoordGrid var5 = client.field8980.method6214();
		client.method8600((var1 >> 14 & 0x3FFF) - var5.field4836, (var1 & 0x3FFF) - var5.field4838, var2 << 2, var3, var4, false);
	}

	@ObfuscatedName("ux.ags(Lrn;B)V")
	public static final void method11907(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		CoordGrid var5 = client.field8980.method6214();
		client.method8271((var1 >> 14 & 0x3FFF) - var5.field4836, (var1 & 0x3FFF) - var5.field4838, var2 << 2, var3, var4);
	}

	@ObfuscatedName("am.agz(Lrn;I)V")
	public static final void method1909(ClientScriptState arg0) {
		arg0.field5216 -= 6;
		int var1 = arg0.field5215[arg0.field5216];
		if (var1 >= 2) {
			throw new RuntimeException();
		}
		client.field9033 = var1;
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (var2 + 1 >= client.field9076[client.field9033].length >> 1) {
			throw new RuntimeException();
		}
		client.field9035 = var2 * 4;
		client.field9219 = 0;
		client.field9038 = arg0.field5215[arg0.field5216 + 2];
		client.field9039 = arg0.field5215[arg0.field5216 + 3];
		int var3 = arg0.field5215[arg0.field5216 + 4];
		if (var3 >= 2) {
			throw new RuntimeException();
		}
		client.field9034 = var3;
		int var4 = arg0.field5215[arg0.field5216 + 5];
		if (var4 + 1 >= client.field9076[client.field9034].length >> 1) {
			throw new RuntimeException();
		}
		client.field8995 = var4 * 4;
		Statics.field2671 = 1;
		Statics.field3308 = -1;
		Statics.field1941 = -1;
	}

	@ObfuscatedName("il.agv(Lrn;B)V")
	public static final void method4708(ClientScriptState arg0) {
		client.method14029();
	}

	@ObfuscatedName("fm.agu(Lrn;I)V")
	public static final void method3625(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		client.method8486(arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1], 0);
	}

	@ObfuscatedName("fr.agk(Lrn;I)V")
	public static final void method3525(ClientScriptState arg0) {
		if (Statics.field2671 == 2) {
			arg0.field5215[++arg0.field5216 - 1] = (int) ((double) Statics.field1307.method3791() * 2607.5945876176133D) >> 3;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = (int) client.field9021 >> 3;
		}
	}

	@ObfuscatedName("te.agy(Lrn;I)V")
	public static final void method11537(ClientScriptState arg0) {
		Statics.method12381();
	}

	@ObfuscatedName("we.agr(Lrn;B)V")
	public static final void method12691(ClientScriptState arg0) {
		client.method3224();
	}

	@ObfuscatedName("dx.age(Lrn;I)V")
	public static final void method2706(ClientScriptState arg0) {
		client.method8624();
	}

	@ObfuscatedName("ig.agc(Lrn;B)V")
	public static final void method4561(ClientScriptState arg0) {
		client.method2613();
	}

	@ObfuscatedName("nb.agq(Lrn;I)V")
	public static final void method6819(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 < 0) {
			var1 = 0;
		}
		client.field9027 = client.field9026 * 784 + var1;
	}

	@ObfuscatedName("kw.ahd(Lrn;B)V")
	public static final void method5551(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9027 - client.field9026 * 784;
	}

	@ObfuscatedName("p.ahz(Lrn;I)V")
	public static final void method1415(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		CoordGrid var4 = client.field8980.method6214();
		int var5 = var2 - var4.field4836;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 >= client.field8980.method6220()) {
			var5 = client.field8980.method6220();
		}
		int var6 = var3 - var4.field4838;
		if (var6 < 0) {
			var6 = 0;
		} else if (var6 >= client.field8980.method6193()) {
			var6 = client.field8980.method6193();
		}
		client.field9154 = (var5 << 9) + 256;
		client.field9019 = (var6 << 9) + 256;
		Statics.field2671 = 5;
		Statics.field3308 = -1;
		Statics.field1941 = -1;
	}

	@ObfuscatedName("tv.ahe(Lrn;B)V")
	public static final void method11762(ClientScriptState arg0) {
		client.method12690();
	}

	@ObfuscatedName("ow.ahy(Lrn;B)V")
	public static final void method7349(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 != -1) {
			Statics.field1941 = -1;
			Statics.field3308 = -1;
			return;
		}
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		CoordGrid var4 = client.field8980.method6214();
		int var5 = var2 - var4.field4836;
		if (var5 < 0) {
			var5 = 0;
		} else if (var5 >= client.field8980.method6220()) {
			var5 = client.field8980.method6220();
		}
		int var6 = var3 - var4.field4838;
		if (var6 < 0) {
			var6 = 0;
		} else if (var6 >= client.field8980.method6193()) {
			var6 = client.field8980.method6193();
		}
		Statics.field1941 = (var5 << 9) + 256;
		Statics.field3308 = (var6 << 9) + 256;
	}

	@ObfuscatedName("vr.ahk(Lrn;I)V")
	public static final void method12355(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2671 == 4 ? 1 : 0;
	}

	@ObfuscatedName("lo.aht(Lrn;B)V")
	public static final void method5790(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		String var2 = (String) arg0.field5222[arg0.field5230 + 1];
		LoginManager.method12220(var1, var2);
	}

	@ObfuscatedName("kh.ahh(Lrn;S)V")
	public static final void method4976(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.field5215[--arg0.field5216];
		Statics.field1307.method3692(LookatMode.method12904(var1), true);
	}

	@ObfuscatedName("ac.ahv(Lrn;I)V")
	public static final void method1978(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.field5215[--arg0.field5216];
		Statics.field1307.method3693(PositionMode.method3450(var1), true);
	}

	@ObfuscatedName("ls.ahj(Lrn;I)V")
	public static final void method5711(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		Vector3 var3 = Vector3.method5294((float) var1, (float) var1, (float) var1);
		if (var3.field3475 == -1.0F) {
			var3.field3475 = Float.POSITIVE_INFINITY;
		}
		if (var3.field3476 == -1.0F) {
			var3.field3476 = Float.POSITIVE_INFINITY;
		}
		if (var3.field3477 == -1.0F) {
			var3.field3477 = Float.POSITIVE_INFINITY;
		}
		Statics.field1307.method3698(var3);
		Statics.field1307.method3695((float) var2 / 1000.0F);
		var3.method5291();
	}

	@ObfuscatedName("pe.ahr(Lrn;B)V")
	public static final void method7690(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		Vector3 var3 = Vector3.method5294((float) var1, (float) var1, (float) var1);
		if (var3.field3475 == -1.0F) {
			var3.field3475 = Float.POSITIVE_INFINITY;
		}
		if (var3.field3476 == -1.0F) {
			var3.field3476 = Float.POSITIVE_INFINITY;
		}
		if (var3.field3477 == -1.0F) {
			var3.field3477 = Float.POSITIVE_INFINITY;
		}
		Statics.field1307.method3755(var3);
		Statics.field1307.method3696((float) var2 / 1000.0F);
		var3.method5291();
	}

	@ObfuscatedName("akn.ahg(Lrn;B)V")
	public static final void method16940(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		Vector3 var2 = Vector3.method5294((float) var1, (float) var1, (float) var1);
		Statics.field1307.method3700(var2);
		var2.method5291();
	}

	@ObfuscatedName("gz.ahs(Lrn;I)V")
	public static final void method3940(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		Vector3 var2 = Vector3.method5294((float) var1, (float) var1, (float) var1);
		Statics.field1307.method3771(var2);
		var2.method5291();
	}

	@ObfuscatedName("rx.ahq(Lrn;I)V")
	public static final void method8584(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		Statics.field1307.method3705((float) var1, (float) var2);
	}

	@ObfuscatedName("gs.ahf(Lrn;I)V")
	public static final void method4112(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		Statics.field1307.method3739((float) ((double) var1 * 3.141592653589793D * 2.0D / 16384.0D), (float) ((double) var2 * 3.141592653589793D * 2.0D / 16384.0D));
	}

	@ObfuscatedName("w.aha(Lrn;I)V")
	public static final void method1560(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field5222[--arg0.field5230];
		if (Statics.field1307.method3751() != LookatMode.field2167) {
			throw new RuntimeException();
		}
		LookatPoint var2 = (LookatPoint) Statics.field1307.method3716();
		var2.method15915(var1);
	}

	@ObfuscatedName("l.ahn(Lrn;B)V")
	public static final void method882(ClientScriptState arg0) {
		CoordFine var1 = (CoordFine) arg0.field5222[--arg0.field5230];
		if (Statics.field1307.method3719() != PositionMode.field2192) {
			throw new RuntimeException();
		}
		PositionPoint var2 = (PositionPoint) Statics.field1307.method3699();
		var2.method14091(var1);
	}

	@ObfuscatedName("w.ahw(Lrn;I)V")
	public static final void method1561(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		boolean var4 = arg0.field5215[arg0.field5216 + 3] == 1;
		if (Statics.field1307.method3751() != LookatMode.field2165) {
			throw new RuntimeException();
		}
		LookatEntity var5 = (LookatEntity) Statics.field1307.method3716();
		PlayerEntity var6 = Statics.field2119;
		if (var6 != null) {
			var5.method15927(var6, new Vector3((float) var1, (float) var2, (float) var3), var4);
		}
	}

	@ObfuscatedName("abz.aho(Lrn;I)V")
	public static final void method14723(ClientScriptState arg0) {
		arg0.field5216 -= 7;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		int var5 = arg0.field5215[arg0.field5216 + 4];
		boolean var6 = arg0.field5215[arg0.field5216 + 5] == 1;
		int var7 = arg0.field5215[arg0.field5216 + 6];
		if (Statics.field1307.method3719() != PositionMode.field2193) {
			throw new RuntimeException();
		}
		PositionEntity var8 = (PositionEntity) Statics.field1307.method3699();
		Quaternion var9 = new Quaternion();
		Quaternion var10 = new Quaternion();
		var9.method5216(0.0F, 1.0F, 0.0F, (float) ((double) var5 * 3.141592653589793D * 2.0D / 16384.0D));
		Vector3 var11 = new Vector3(1.0F, 0.0F, 0.0F);
		var11.method5318(var9);
		var11.method5329();
		var10.method5215(var11, (float) ((double) var4 * 3.141592653589793D * 2.0D / 16384.0D));
		var9.method5266(var10);
		PlayerEntity var12 = Statics.field2119;
		if (var12 != null) {
			var8.method14097(var12, new Vector3((float) var1, (float) var2, (float) var3), var9, var6, var7, client.field8980.method6101(Statics.field7324), client.field8980.method6157().field3697);
		}
	}

	@ObfuscatedName("mz.ahm(Lrn;I)V")
	public static final void method6348(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		float var4 = (float) (Math.atan((double) ((float) var1 / 2.0F / (float) var3)) * 2.0D);
		float var5 = (float) (Math.atan((double) ((float) var2 / 2.0F / (float) var3)) * 2.0D);
		Statics.field1307.method3739(var4, var5);
	}

	@ObfuscatedName("uj.ahx(Lrn;I)V")
	public static final void method11996(ClientScriptState arg0) {
		if (Statics.field1307.method3719() != PositionMode.field2191) {
			throw new RuntimeException();
		}
		PositionSpline var1 = (PositionSpline) Statics.field1307.method3699();
		var1.method14126(Statics.field909, -1);
	}

	@ObfuscatedName("jc.ahi(Lrn;I)V")
	public static final void method4736(ClientScriptState arg0) {
		if (Statics.field1307.method3751() != LookatMode.field2164) {
			throw new RuntimeException();
		}
		LookatSpline var1 = (LookatSpline) Statics.field1307.method3716();
		var1.method15935(Statics.field909, -1);
	}

	@ObfuscatedName("dn.ahc(Lrn;I)V")
	public static final void method2864(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field1307.method3764().field2201;
	}

	@ObfuscatedName("ed.ahl(Lrn;I)V")
	public static final void method3083(ClientScriptState arg0) {
		if (Statics.field1307.method3719() != PositionMode.field2193) {
			throw new RuntimeException();
		}
		PositionEntity var1 = (PositionEntity) Statics.field1307.method3699();
		arg0.field5215[++arg0.field5216 - 1] = (int) ((double) var1.method14116() * 2607.5945876176133D) & 0x3FFF;
		arg0.field5215[++arg0.field5216 - 1] = (int) ((double) var1.method14103() * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("mo.ahu(Lrn;B)V")
	public static final void method6084(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		ShakeMode var4 = ShakeMode.method7070(var1);
		float var5 = (float) var2;
		if (ShakeMode.field2126 == var4 || ShakeMode.field2128 == var4 || ShakeMode.field2129 == var4) {
			var5 = Trig1.method5096(var2);
		}
		Shake var6 = new Shake(Statics.field1307.method14032(), var4, var5, (float) var3 / 1000.0F);
		Statics.field1307.method3709(var6);
		arg0.field5215[++arg0.field5216 - 1] = var6.field10351;
	}

	@ObfuscatedName("nf.ahb(Lrn;B)V")
	public static final void method6642(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		Statics.field1307.method3710(var1);
	}

	@ObfuscatedName("afs.ahp(Lrn;B)V")
	public static final void method15787(ClientScriptState arg0) {
		Statics.field1307.method3750();
	}

	@ObfuscatedName("ai.aig(Lrn;I)V")
	public static final void method1771(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		Vector3 var5 = Vector3.method5294((float) var1, (float) var2, (float) var3);
		if (var5.field3475 == -1.0F) {
			var5.field3475 = Float.POSITIVE_INFINITY;
		}
		if (var5.field3476 == -1.0F) {
			var5.field3476 = Float.POSITIVE_INFINITY;
		}
		if (var5.field3477 == -1.0F) {
			var5.field3477 = Float.POSITIVE_INFINITY;
		}
		Statics.field1307.method3698(var5);
		Statics.field1307.method3695((float) var4 / 1000.0F);
		var5.method5291();
	}

	@ObfuscatedName("qg.aim(Lrn;B)V")
	public static final void method8407(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		int var4 = arg0.field5215[arg0.field5216 + 3];
		Vector3 var5 = Vector3.method5294((float) var1, (float) var2, (float) var3);
		if (var5.field3475 == -1.0F) {
			var5.field3475 = Float.POSITIVE_INFINITY;
		}
		if (var5.field3476 == -1.0F) {
			var5.field3476 = Float.POSITIVE_INFINITY;
		}
		if (var5.field3477 == -1.0F) {
			var5.field3477 = Float.POSITIVE_INFINITY;
		}
		Statics.field1307.method3755(var5);
		Statics.field1307.method3696((float) var4 / 1000.0F);
		var5.method5291();
	}

	@ObfuscatedName("fc.aie(Lrn;I)V")
	public static final void method3533(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		Vector3 var4 = Vector3.method5294((float) var1, (float) var2, (float) var3);
		Statics.field1307.method3700(var4);
		var4.method5291();
	}

	@ObfuscatedName("eh.aiz(Lrn;I)V")
	public static final void method3068(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		Vector3 var4 = Vector3.method5294((float) var1, (float) var2, (float) var3);
		Statics.field1307.method3771(var4);
		var4.method5291();
	}

	@ObfuscatedName("fp.ais(Lrn;S)V")
	public static final void method3544(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (Statics.field1307.method3719() != PositionMode.field2193 || Statics.field1307.method3751() != LookatMode.field2165) {
			throw new RuntimeException();
		}
		PositionEntity var2 = (PositionEntity) Statics.field1307.method3699();
		LookatEntity var3 = (LookatEntity) Statics.field1307.method3716();
		Vector3 var4 = var2.method14100();
		Vector3 var5 = Vector3.method5290(var4);
		var5.field3476 += var1;
		Vector3 var6 = Vector3.method5377(var3.method11550(), var5);
		var6.method5313();
		float var7 = var2.method14101().method5338();
		RayTracing.method5379(var3.method11550(), var6, var4, var7, field5204);
		Object var8 = null;
		if (field5204[0] == null) {
			throw new RuntimeException("");
		}
		Vector3 var9;
		if (field5204[1] == null) {
			var9 = field5204[0];
		} else if (Vector3.method5377(var3.method11550(), field5204[0]).method5338() < Vector3.method5377(var3.method11550(), field5204[1]).method5338()) {
			var9 = field5204[1];
		} else {
			var9 = field5204[0];
		}
		float var10 = CameraHelpers.method4037(var4.field3475 - var9.field3475, var4.field3477 - var9.field3477);
		arg0.field5215[++arg0.field5216 - 1] = 0;
		arg0.field5215[++arg0.field5216 - 1] = (int) ((double) var10 * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("rh.aic(Lrn;I)V")
	public static final void method8616(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 2;
		boolean var1 = arg0.field5215[arg0.field5216] == 1;
		boolean var2 = arg0.field5215[arg0.field5216 + 1] == 1;
		Statics.field1307.method3707(var1, var2);
	}

	@ObfuscatedName("abh.aia(Lrn;I)V")
	public static final void method14218(ClientScriptState arg0) {
		float var1 = Trig1.method5096(arg0.field5215[--arg0.field5216]);
		ZTilt var2 = new ZTilt(Statics.field1307.method14032(), var1);
		Statics.field1307.method3709(var2);
		arg0.field5215[++arg0.field5216 - 1] = var2.field10351;
	}

	@ObfuscatedName("al.aix(Lrn;I)V")
	public static final void method1820(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		float var2 = Trig1.method5096(arg0.field5215[arg0.field5216 + 1]);
		CameraEffect var3 = Statics.field1307.method3711(var1);
		if (var3 == null) {
			throw new RuntimeException("");
		} else if (var3 instanceof ZTilt) {
			((ZTilt) var3).method17143(var2);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ks.aii(Lrn;S)V")
	public static final void method5071(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		float var2 = (float) arg0.field5215[arg0.field5216 + 1] / 1000.0F;
		Statics.field1307.method3708(var1, var2);
	}

	@ObfuscatedName("nb.aik(Lrn;I)V")
	public static final void method6820(ClientScriptState arg0) throws CameraException {
		int var1 = arg0.field5215[--arg0.field5216];
		CameraLinearMovementMode var2 = CameraLinearMovementMode.method1955(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Statics.field1307.method3697(var2);
	}

	@ObfuscatedName("x.aiv(Lrn;B)V")
	public static final void method1602(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 4;
		float var1 = (float) arg0.field5215[arg0.field5216];
		float var2 = (float) arg0.field5215[arg0.field5216 + 1];
		float var3 = (float) arg0.field5215[arg0.field5216 + 2];
		float var4 = (float) arg0.field5215[arg0.field5216 + 3] / 1000.0F;
		Statics.field1307.method3702(Vector3.method5294(var1, var2, var3), var4);
	}

	@ObfuscatedName("dm.ait(Lrn;I)V")
	public static final void method2889(ClientScriptState arg0) throws CameraException {
		Statics.field1307.method3695((float) arg0.field5215[--arg0.field5216] / 1000.0F);
	}

	@ObfuscatedName("mz.aiw(Lrn;S)V")
	public static final void method6344(ClientScriptState arg0) throws CameraException {
		arg0.field5216 -= 4;
		float var1 = (float) arg0.field5215[arg0.field5216];
		float var2 = (float) arg0.field5215[arg0.field5216 + 1];
		float var3 = (float) arg0.field5215[arg0.field5216 + 2];
		float var4 = (float) arg0.field5215[arg0.field5216 + 3] / 1000.0F;
		Statics.field1307.method3687(Vector3.method5294(var1, var2, var3), var4);
	}

	@ObfuscatedName("ru.ail(Lrn;B)V")
	public static final void method8627(ClientScriptState arg0) {
		boolean var1 = arg0.field5215[--arg0.field5216] == 1;
		if (var1) {
			Statics.field2671 = 2;
		} else {
			client.method14029();
		}
	}

	@ObfuscatedName("on.air(Lrn;B)V")
	public static final void method7182(ClientScriptState arg0) {
		if (!Statics.method16489()) {
			LoginManager.method14090();
		}
	}

	@ObfuscatedName("r.aij(Lrn;I)V")
	public static final void method1622(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		AccountCreationManager.method12448(var1);
	}

	@ObfuscatedName("eo.aih(Lrn;I)V")
	public static final void method3291(ClientScriptState arg0) {
		Statics.method6024();
	}

	@ObfuscatedName("ob.aib(Lrn;B)V")
	public static final void method7281(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		arg0.field5216 -= 2;
		Statics.method7789((String) arg0.field5222[arg0.field5230], (String) arg0.field5222[arg0.field5230 + 1], arg0.field5215[arg0.field5216], arg0.field5215[arg0.field5216 + 1] == 1);
	}

	@ObfuscatedName("tf.aiu(Lrn;S)V")
	public static final void method11665(ClientScriptState arg0) {
		AccountCreationManager.method3942(arg0.field5215[--arg0.field5216]);
	}

	@ObfuscatedName("jj.aiq(Lrn;B)V")
	public static final void method4772(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field538;
	}

	@ObfuscatedName("dd.aid(Lrn;S)V")
	public static final void method2812(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field526 * 2500;
	}

	@ObfuscatedName("ut.aif(Lrn;B)V")
	public static final void method12072(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = AccountCreationManager.method8659().method6339();
	}

	@ObfuscatedName("ne.ajs(Lrn;I)V")
	public static final void method6948(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = AccountCreationManager.method11157().method6339();
	}

	@ObfuscatedName("oy.ajk(Lrn;B)V")
	public static final void method7392(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = AccountCreationManager.method3012().method6339();
	}

	@ObfuscatedName("mp.ajz(Lrn;B)V")
	public static final void method6258(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field509;
	}

	@ObfuscatedName("agg.aje(Lrn;B)V")
	public static final void method15931(ClientScriptState arg0) {
		Statics.method13891();
	}

	@ObfuscatedName("u.aja(Lrn;B)V")
	public static final void method1239(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field538;
	}

	@ObfuscatedName("it.ajf(Lrn;I)V")
	public static final void method4717(ClientScriptState arg0) {
		arg0.field5230 -= 2;
		String var1 = (String) arg0.field5222[arg0.field5230];
		String var2 = (String) arg0.field5222[arg0.field5230 + 1];
		LoginManager.method14208(var1, var2);
	}

	@ObfuscatedName("jr.ajx(Lrn;I)V")
	public static final void method4780(ClientScriptState arg0) {
		client.method13897(false);
	}

	@ObfuscatedName("mz.ajo(Lrn;B)V")
	public static final void method6345(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field537;
	}

	@ObfuscatedName("mb.ajb(Lrn;B)V")
	public static final void method6479(ClientScriptState arg0) {
		if (client.field8909 == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		}
	}

	@ObfuscatedName("gb.ajg(Lrn;B)V")
	public static final void method4009(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = (int) (client.field8910 >> 32);
		arg0.field5215[++arg0.field5216 - 1] = (int) (client.field8910 & 0xFFFFFFFFFFFFFFFFL);
	}

	@ObfuscatedName("fe.aju(Lrn;I)V")
	public static final void method3843(ClientScriptState arg0) {
		client.field8946 = true;
		client.method8095();
	}

	@ObfuscatedName("ed.ajp(Lrn;I)V")
	public static final void method3084(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field547;
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field546;
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field540;
		LoginManager.field547 = -2;
		LoginManager.field546 = -1;
		LoginManager.field540 = -1;
	}

	@ObfuscatedName("jc.ajv(Lrn;I)V")
	public static final void method4738(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.method16489() ? 1 : 0;
	}

	@ObfuscatedName("aej.ajm(Lrn;I)V")
	public static final void method15482(ClientScriptState arg0) {
		LoginManager.method6066();
	}

	@ObfuscatedName("xh.ajn(Lrn;B)V")
	public static final void method12740(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		Statics.method11170(var1);
	}

	@ObfuscatedName("agj.ajy(Lrn;I)V")
	public static final void method15964(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = LoginManager.field543;
	}

	@ObfuscatedName("vg.ajl(Lrn;S)V")
	public static final void method12222(ClientScriptState arg0) {
		if (client.field8922 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = client.field8922;
		}
	}

	@ObfuscatedName("ajo.aji(Lrn;I)V")
	public static final void method16721(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		Statics.field4961.method15448(Statics.field4961.field9642, var1);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("aj.ajq(Lrn;I)V")
	public static final void method1960(ClientScriptState arg0) {
		boolean var1 = arg0.field5215[--arg0.field5216] == 1;
		Statics.field4961.method15448(Statics.field4961.field9660, var1 ? 2 : 1);
		Statics.field4961.method15448(Statics.field4961.field9655, var1 ? 2 : 1);
		Statics.method7076();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("vg.ajd(Lrn;I)V")
	public static final void method12223(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9671, arg0.field5215[--arg0.field5216] == 1 ? 1 : 0);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("r.ajh(Lrn;B)V")
	public static final void method1620(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9649, arg0.field5215[--arg0.field5216]);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("nn.ajj(Lrn;I)V")
	public static final void method6885(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9645, arg0.field5215[--arg0.field5216] == 1 ? 1 : 0);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("nd.akm(Lrn;I)V")
	public static final void method7063(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9658, arg0.field5215[--arg0.field5216] == 1 ? 1 : 0);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("cd.akv(Lrn;B)V")
	public static final void method2492(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9651, arg0.field5215[--arg0.field5216]);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("on.akr(Lrn;B)V")
	public static final void method7183(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9650, arg0.field5215[--arg0.field5216] == 1 ? 1 : 0);
		client.method13901();
		client.field8980.method6139().method8154();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("pj.akb(Lrn;B)V")
	public static final void method7896(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9666, arg0.field5215[--arg0.field5216] == 1 ? 2 : 0);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("lq.aku(Lrn;B)V")
	public static final void method5922(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9646, arg0.field5215[--arg0.field5216] == 1 ? 1 : 0);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("jv.akx(Lrn;I)V")
	public static final void method4723(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9665, arg0.field5215[--arg0.field5216]);
		Statics.method5600(Statics.field4961.field9661.method15781(), false);
		Statics.method1245();
	}

	@ObfuscatedName("ef.aka(Lrn;I)V")
	public static final void method3301(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9676, arg0.field5215[--arg0.field5216] == 1 ? 1 : 0);
		class395.method12701();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("s.akq(Lrn;I)V")
	public static final void method1317(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9654, arg0.field5215[--arg0.field5216]);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("df.akk(Lrn;I)V")
	public static final void method2837(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		int var2 = Statics.field4961.field9674.method15899();
		if (var1 == var2) {
			return;
		}
		if (client.method1608(client.field8923)) {
			if (var2 == 0 && class395.field4202 != -1) {
				class155.method3986(Statics.field9367, class395.field4202, 0, var1, false);
				class395.method2572();
				class395.field4203 = false;
			} else if (var1 == 0) {
				class155.method8662();
				class395.field4203 = false;
			} else {
				class155.method1315(var1);
			}
		}
		Statics.field4961.method15448(Statics.field4961.field9674, var1);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("ml.akz(Lrn;I)V")
	public static final void method6242(ClientScriptState arg0) {
		int var1 = Statics.field4961.field9660.method15735();
		Statics.field4961.method15448(Statics.field4961.field9655, arg0.field5215[--arg0.field5216] == 1 ? 0 : var1);
		Statics.method7076();
	}

	@ObfuscatedName("nv.ako(Lrn;I)V")
	public static final void method6794(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		Statics.field4961.method15448(Statics.field4961.field9648, var1);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("eb.aky(Lrn;I)V")
	public static final void method3317(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9637, arg0.field5215[--arg0.field5216]);
		Statics.method1245();
	}

	@ObfuscatedName("ml.aki(Lrn;B)V")
	public static final void method6243(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 < 0 || var1 > 1) {
			var1 = 0;
		}
		client.method1741(var1 == 1);
	}

	@ObfuscatedName("aha.akn(Lrn;I)V")
	public static final void method16190(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9640, arg0.field5215[--arg0.field5216] == 0 ? 0 : 1);
		Statics.method1245();
	}

	@ObfuscatedName("sk.akd(Lrn;I)V")
	public static final void method11328(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9649, arg0.field5215[--arg0.field5216]);
		Statics.method1245();
	}

	@ObfuscatedName("tn.akh(Lrn;I)V")
	public static final void method11506(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9647, arg0.field5215[--arg0.field5216] == 0 ? 0 : 1);
		Statics.method1245();
		client.field8980.method6102();
	}

	@ObfuscatedName("sb.akc(Lrn;I)V")
	public static final void method11163(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 < 0 || var1 > 5) {
			var1 = 2;
		}
		Statics.method5600(var1, false);
	}

	@ObfuscatedName("dr.ake(Lrn;I)V")
	public static final void method2825(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9652, arg0.field5215[--arg0.field5216]);
		Statics.method1245();
	}

	@ObfuscatedName("t.akp(Lrn;I)V")
	public static final void method1345(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9659, arg0.field5215[--arg0.field5216] == 1 ? 1 : 0);
		Statics.method1245();
		client.method13901();
		client.field8932 = false;
	}

	@ObfuscatedName("of.akg(Lrn;B)V")
	public static final void method7072(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9677, arg0.field5215[--arg0.field5216]);
		Statics.method1245();
		client.field9165 = true;
	}

	@ObfuscatedName("lw.akj(Lrn;S)V")
	public static final void method5941(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9653, arg0.field5215[--arg0.field5216]);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("fw.akw(Lrn;I)V")
	public static final void method3675(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		int var2 = Statics.field4961.field9675.method15899();
		if (var1 == var2 || class395.field4205 != class395.field4202) {
			return;
		}
		if (!client.method1608(client.field8923)) {
			if (var2 == 0) {
				class155.method3986(Statics.field9367, class395.field4202, 0, var1, false);
				class395.method2572();
				class395.field4203 = false;
			} else if (var1 == 0) {
				class155.method8662();
				class395.field4203 = false;
			} else {
				class155.method1315(var1);
			}
		}
		Statics.field4961.method15448(Statics.field4961.field9675, var1);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("yp.aks(Lrn;I)V")
	public static final void method12877(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 > 255 || var1 < 0) {
			var1 = 0;
		}
		if (var1 != Statics.field4961.field9668.method15859()) {
			Statics.field4961.method15448(Statics.field4961.field9668, var1);
			Statics.method1245();
			client.field8932 = false;
		}
	}

	@ObfuscatedName("dn.aly(Lrn;I)V")
	public static final void method2865(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 != Statics.field4961.field9657.method15807()) {
			Statics.field4961.method15448(Statics.field4961.field9657, var1);
			Statics.method1245();
			client.field8932 = false;
		}
	}

	@ObfuscatedName("ew.alu(Lrn;B)V")
	public static final void method3206(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9642.method15672();
	}

	@ObfuscatedName("ob.alk(Lrn;B)V")
	public static final void method7283(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9671.method15725() == 1 ? 1 : 0;
	}

	@ObfuscatedName("li.ale(Lrn;I)V")
	public static final void method5591(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9649.method15837();
	}

	@ObfuscatedName("go.alj(Lrn;B)V")
	public static final void method4032(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9645.method15679() == 1 ? 1 : 0;
	}

	@ObfuscatedName("lc.alx(Lrn;I)V")
	public static final void method5968(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9658.method15709() == 1 ? 1 : 0;
	}

	@ObfuscatedName("aem.alp(Lrn;B)V")
	public static final void method15592(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9651.method15747();
	}

	@ObfuscatedName("afl.alq(Lrn;I)V")
	public static final void method15823(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9650.method15667() == 1 ? 1 : 0;
	}

	@ObfuscatedName("z.alz(Lrn;I)V")
	public static final void method1369(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9666.method15755() == 2 ? 1 : 0;
	}

	@ObfuscatedName("qv.alr(Lrn;I)V")
	public static final void method8302(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9646.method15696() == 1 ? 1 : 0;
	}

	@ObfuscatedName("vu.alg(Lrn;I)V")
	public static final void method12189(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9665.method15829();
	}

	@ObfuscatedName("zw.alv(Lrn;B)V")
	public static final void method13864(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9654.method15899();
	}

	@ObfuscatedName("vw.alb(Lrn;B)V")
	public static final void method12346(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9672.method15899();
	}

	@ObfuscatedName("jh.als(Lrn;I)V")
	public static final void method4785(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.method3102();
	}

	@ObfuscatedName("ra.alw(Lrn;B)V")
	public static final void method827(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9637.method15829();
	}

	@ObfuscatedName("sn.alh(Lrn;I)V")
	public static final void method11193(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9643.method15792();
	}

	@ObfuscatedName("ql.alc(Lrn;B)V")
	public static final void method8139(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9673.method15816() == 1 ? 1 : 0;
	}

	@ObfuscatedName("aea.alt(Lrn;I)V")
	public static final void method15669(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9640.method15908() == 1 ? 1 : 0;
	}

	@ObfuscatedName("pc.ald(Lrn;I)V")
	public static final void method7889(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9649.method15837();
	}

	@ObfuscatedName("ms.alo(Lrn;I)V")
	public static final void method6491(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9647.method15843() == 1 ? 1 : 0;
	}

	@ObfuscatedName("yy.all(Lrn;S)V")
	public static final void method12940(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9661.method15781();
	}

	@ObfuscatedName("tv.ala(Lrn;B)V")
	public static final void method11763(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9670.method15781();
	}

	@ObfuscatedName("ed.alm(Lrn;B)V")
	public static final void method3086(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9652.method15874();
	}

	@ObfuscatedName("pa.ams(Lrn;S)V")
	public static final void method7742(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9659.method15686() == 1 ? 1 : 0;
	}

	@ObfuscatedName("ms.amy(Lrn;I)V")
	public static final void method6488(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.method1380(Statics.field4961.field9661.method15781(), 200);
	}

	@ObfuscatedName("js.ame(Lrn;B)V")
	public static final void method4806(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9677.method15794();
	}

	@ObfuscatedName("ud.amb(Lrn;I)V")
	public static final void method12145(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9653.method15899();
	}

	@ObfuscatedName("jv.amw(Lrn;I)V")
	public static final void method4722(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9675.method15899();
	}

	@ObfuscatedName("l.amm(Lrn;B)V")
	public static final void method883(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8911 ? 1 : 0;
	}

	@ObfuscatedName("ov.amp(Lrn;I)V")
	public static final void method7215(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9668.method15859();
	}

	@ObfuscatedName("dv.ami(Lrn;I)V")
	public static final void method2844(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9641.method15741();
	}

	@ObfuscatedName("rm.amn(Lrn;I)V")
	public static final void method8593(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2305.field9703 < 512 || client.field8911 || client.field8928 ? 1 : 0;
	}

	@ObfuscatedName("lu.amh(Lrn;I)V")
	public static final void method5829(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8912 ? 1 : 0;
	}

	@ObfuscatedName("f.amj(Lrn;I)V")
	public static final void method1352(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9657.method15807();
	}

	@ObfuscatedName("mn.amv(Lrn;B)V")
	public static final void method6337(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		client.field8904 = (short) arg0.field5215[arg0.field5216];
		if (client.field8904 <= 0) {
			client.field8904 = 256;
		}
		client.field9194 = (short) arg0.field5215[arg0.field5216 + 1];
		if (client.field9194 <= 0) {
			client.field9194 = 205;
		}
	}

	@ObfuscatedName("lq.amk(Lrn;I)V")
	public static final void method5927(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		client.field9195 = (short) arg0.field5215[arg0.field5216];
		if (client.field9195 <= 0) {
			client.field9195 = 256;
		}
		client.field9196 = (short) arg0.field5215[arg0.field5216 + 1];
		if (client.field9196 <= 0) {
			client.field9196 = 320;
		}
	}

	@ObfuscatedName("lp.amo(Lrn;I)V")
	public static final void method6025(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		client.field9197 = (short) arg0.field5215[arg0.field5216];
		if (client.field9197 <= 0) {
			client.field9197 = 1;
		}
		client.field9188 = (short) arg0.field5215[arg0.field5216 + 1];
		if (client.field9188 <= 0) {
			client.field9188 = 32767;
		} else if (client.field9188 < client.field9197) {
			client.field9188 = client.field9197;
		}
		client.field9199 = (short) arg0.field5215[arg0.field5216 + 2];
		if (client.field9199 <= 0) {
			client.field9199 = 1;
		}
		client.field9200 = (short) arg0.field5215[arg0.field5216 + 3];
		if (client.field9200 <= 0) {
			client.field9200 = 32767;
		} else if (client.field9200 < client.field9199) {
			client.field9200 = client.field9199;
		}
	}

	@ObfuscatedName("pq.ama(Lrn;I)V")
	public static final void method7716(ClientScriptState arg0) {
		Statics.method11240(0, 0, client.field9113.field1863, client.field9113.field1929, false);
		arg0.field5215[++arg0.field5216 - 1] = client.field9025;
		arg0.field5215[++arg0.field5216 - 1] = client.field9168;
	}

	@ObfuscatedName("ep.amr(Lrn;I)V")
	public static final void method3498(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9195;
		arg0.field5215[++arg0.field5216 - 1] = client.field9196;
	}

	@ObfuscatedName("ji.amx(Lrn;I)V")
	public static final void method4792(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8904;
		arg0.field5215[++arg0.field5216 - 1] = client.field9194;
	}

	@ObfuscatedName("ol.amg(Lrn;B)V")
	public static final void method7073(ClientScriptState arg0) {
		long var1 = MonotonicTime.method5554();
		arg0.field5215[++arg0.field5216 - 1] = (int) (var1 / 60000L);
	}

	@ObfuscatedName("th.amu(Lrn;B)V")
	public static final void method11707(ClientScriptState arg0) {
		long var1 = MonotonicTime.method5554();
		arg0.field5215[++arg0.field5216 - 1] = (int) (var1 / 86400000L) - 11745;
	}

	@ObfuscatedName("af.amd(Lrn;B)V")
	public static final void method1686(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		long var4 = Statics.method11488(0, 0, 12, var1, var2, var3);
		int var6 = class604.method12062(var4);
		if (var3 < 1970) {
			var6--;
		}
		arg0.field5215[++arg0.field5216 - 1] = var6;
	}

	@ObfuscatedName("zw.amq(Lrn;I)V")
	public static final void method13863(ClientScriptState arg0) {
		long var1 = MonotonicTime.method5554();
		arg0.field5215[++arg0.field5216 - 1] = class604.method11221(var1);
	}

	@ObfuscatedName("pt.aml(Lrn;I)V")
	public static final void method7736(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		boolean var2 = true;
		if (var1 < 0) {
			var2 = (var1 + 1) % 4 == 0;
		} else if (var1 < 1582) {
			var2 = var1 % 4 == 0;
		} else if (var1 % 4 != 0) {
			var2 = false;
		} else if (var1 % 100 != 0) {
			var2 = true;
		} else if (var1 % 400 != 0) {
			var2 = false;
		}
		arg0.field5215[++arg0.field5216 - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("ax.amf(Lrn;I)V")
	public static final void method1837(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		int[] var2 = class604.method3586(var1);
		ArrayUtil.method11351(var2, 0, arg0.field5215, arg0.field5216, 3);
		arg0.field5216 += 3;
	}

	@ObfuscatedName("q.amz(Lrn;I)V")
	public static final void method1396(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = (int) (Statics.method5541(var1) / 60000L);
	}

	@ObfuscatedName("afs.amt(Lrn;B)V")
	public static final void method15785(ClientScriptState arg0) {
		if (client.field8923 != 15 || Statics.method16489()) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else if (WorldSwitcher.field6777) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else if (Statics.field6356 > MonotonicTime.method5554() - 1000L) {
			arg0.field5215[++arg0.field5216 - 1] = 1;
		} else {
			WorldSwitcher.field6777 = true;
			ClientMessage var1 = ClientMessage.method14781(ClientProt.field2927, client.field8959.field834);
			var1.field9467.method15223(Statics.field575);
			client.field8959.method1913(var1);
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("ig.amc(Lrn;I)V")
	public static final void method4559(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method6582();
		if (var1 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5222[++arg0.field5230 - 1] = "";
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5222[++arg0.field5230 - 1] = "";
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5222[++arg0.field5230 - 1] = "";
			return;
		}
		arg0.field5215[++arg0.field5216 - 1] = var1.field9799;
		arg0.field5215[++arg0.field5216 - 1] = var1.field4866;
		arg0.field5222[++arg0.field5230 - 1] = var1.field9798;
		GWCLocation var2 = var1.method15615();
		arg0.field5215[++arg0.field5216 - 1] = var2.field4861;
		arg0.field5222[++arg0.field5230 - 1] = var2.field4860;
		arg0.field5215[++arg0.field5216 - 1] = var1.field4868;
		arg0.field5215[++arg0.field5216 - 1] = var1.field9800;
		arg0.field5222[++arg0.field5230 - 1] = var1.field9797;
	}

	@ObfuscatedName("so.anu(Lrn;I)V")
	public static final void method11142(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method3647();
		if (var1 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5222[++arg0.field5230 - 1] = "";
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5222[++arg0.field5230 - 1] = "";
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5222[++arg0.field5230 - 1] = "";
			return;
		}
		arg0.field5215[++arg0.field5216 - 1] = var1.field9799;
		arg0.field5215[++arg0.field5216 - 1] = var1.field4866;
		arg0.field5222[++arg0.field5230 - 1] = var1.field9798;
		GWCLocation var2 = var1.method15615();
		arg0.field5215[++arg0.field5216 - 1] = var2.field4861;
		arg0.field5222[++arg0.field5230 - 1] = var2.field4860;
		arg0.field5215[++arg0.field5216 - 1] = var1.field4868;
		arg0.field5215[++arg0.field5216 - 1] = var1.field9800;
		arg0.field5222[++arg0.field5230 - 1] = var1.field9797;
	}

	@ObfuscatedName("aag.anp(Lrn;I)V")
	public static final void method14066(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		String var2 = (String) arg0.field5222[--arg0.field5230];
		if (client.field8923 == 15 && !Statics.method16489()) {
			arg0.field5215[++arg0.field5216 - 1] = WorldSwitcher.method8621(var1, var2) ? 1 : 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		}
	}

	@ObfuscatedName("ol.ang(Lrn;I)V")
	public static final void method7077(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		GWCWorld var2 = GWC.method3630(var1);
		if (var2 == null) {
			arg0.field5215[++arg0.field5216 - 1] = -1;
			arg0.field5222[++arg0.field5230 - 1] = "";
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5222[++arg0.field5230 - 1] = "";
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5215[++arg0.field5216 - 1] = 0;
			arg0.field5222[++arg0.field5230 - 1] = "";
			return;
		}
		arg0.field5215[++arg0.field5216 - 1] = var2.field4866;
		arg0.field5222[++arg0.field5230 - 1] = var2.field9798;
		GWCLocation var3 = var2.method15615();
		arg0.field5215[++arg0.field5216 - 1] = var3.field4861;
		arg0.field5222[++arg0.field5230 - 1] = var3.field4860;
		arg0.field5215[++arg0.field5216 - 1] = var2.field4868;
		arg0.field5215[++arg0.field5216 - 1] = var2.field9800;
		arg0.field5222[++arg0.field5230 - 1] = var2.field9797;
	}

	@ObfuscatedName("qh.ant(Lrn;B)V")
	public static final void method8287(ClientScriptState arg0) {
		arg0.field5216 -= 4;
		int var1 = arg0.field5215[arg0.field5216];
		boolean var2 = arg0.field5215[arg0.field5216 + 1] == 1;
		int var3 = arg0.field5215[arg0.field5216 + 2];
		boolean var4 = arg0.field5215[arg0.field5216 + 3] == 1;
		WorldSwitcher.method4774(var1, var2, var3, var4);
	}

	@ObfuscatedName("cr.anc(Lrn;I)V")
	public static final void method2354(ClientScriptState arg0) {
		if (client.field8923 == 15) {
			WorldSwitcher.field6774 = arg0.field5215[--arg0.field5216] == 1;
		}
	}

	@ObfuscatedName("wq.anz(Lrn;I)V")
	public static final void method12553(ClientScriptState arg0) {
		GWCWorld var1 = WorldSwitcher.method8609();
		arg0.field5215[++arg0.field5216 - 1] = var1 == null ? 0 : var1.field4866;
	}

	@ObfuscatedName("kf.ana(Lrn;I)V")
	public static final void method5542(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8941;
	}

	@ObfuscatedName("wf.ank(Lrn;I)V")
	public static final void method12505(ClientScriptState arg0) {
		int var1 = client.field9075.method11926();
		if (client.field8941 != -1) {
			var1++;
		}
		arg0.field5215[++arg0.field5216 - 1] = var1;
	}

	@ObfuscatedName("mq.ann(Lrn;I)V")
	public static final void method6402(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (client.field8941 != -1) {
			if (var1 == 0) {
				arg0.field5215[++arg0.field5216 - 1] = client.field8941;
				return;
			}
			var1--;
		}
		SubIfType var2 = (SubIfType) client.field9075.method11928();
		while (var1-- > 0) {
			var2 = (SubIfType) client.field9075.method11929();
		}
		arg0.field5215[++arg0.field5216 - 1] = var2.field9679;
	}

	@ObfuscatedName("fp.anl(Lrn;B)V")
	public static final void method3545(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (Statics.field1756[var1] == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
			return;
		}
		String var2 = Statics.field1756[var1].field1732[0].field1762;
		if (var2 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2.substring(0, var2.indexOf(58));
		}
	}

	@ObfuscatedName("wg.anf(Lrn;B)V")
	public static final void method12636(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (Statics.field1756[var1] == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field1756[var1].field1732.length;
		}
	}

	@ObfuscatedName("da.anv(Lrn;I)V")
	public static final void method2819(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (Statics.field1756[var1] == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
			return;
		}
		String var3 = Statics.field1756[var1].field1732[var2].field1762;
		if (var3 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var3;
		}
	}

	@ObfuscatedName("rl.anm(Lrn;I)V")
	public static final void method8648(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (Statics.field1756[var1] == null) {
			arg0.field5215[++arg0.field5216 - 1] = 0;
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field1756[var1].field1732[var2].field1850;
		}
	}

	@ObfuscatedName("l.anj(Lrn;I)V")
	public static final void method880(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(1, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("km.any(Lrn;I)V")
	public static final void method5559(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(2, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("ls.anh(Lrn;I)V")
	public static final void method5710(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(3, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("qs.anw(Lrn;I)V")
	public static final void method8387(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(4, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("tq.ans(Lrn;I)V")
	public static final void method11637(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(5, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("dl.anr(Lrn;I)V")
	public static final void method2606(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(6, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("su.anq(Lrn;I)V")
	public static final void method11198(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(7, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("dv.ane(Lrn;B)V")
	public static final void method2849(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(8, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("pg.anb(Lrn;I)V")
	public static final void method7979(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(9, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("ky.and(Lrn;I)V")
	public static final void method5015(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		client.method5716(10, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("qs.anx(Lrn;I)V")
	public static final void method8386(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		ComType var4 = ComType.method15145(var1 << 16 | var2, var3);
		client.method11223();
		ServerKeyProperties var5 = client.method14331(var4);
		Statics.method11974(var4, var5.method14928(), var5.field9423);
	}

	@ObfuscatedName("ai.aoe(Lrn;I)V")
	public static final void method1772(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = field5201;
	}

	@ObfuscatedName("aed.aoa(Lrn;I)V")
	public static final void method15675(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		MapElementType var2 = Statics.field8499.method7862(var1);
		if (var2.field4766 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var2.field4766;
		}
	}

	@ObfuscatedName("re.aov(Lrn;I)V")
	public static final void method8665(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		MapElementType var2 = Statics.field8499.method7862(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field4764;
	}

	@ObfuscatedName("li.aox(Lrn;I)V")
	public static final void method5592(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		MapElementType var2 = Statics.field8499.method7862(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field4777;
	}

	@ObfuscatedName("cg.aoi(Lrn;I)V")
	public static final void method2558(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		MapElementType var2 = Statics.field8499.method7862(var1);
		arg0.field5215[++arg0.field5216 - 1] = var2.field4775;
	}

	@ObfuscatedName("yc.aop(Lrn;I)V")
	public static final void method12886(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		ParamType var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.field5222[++arg0.field5230 - 1] = Statics.field8499.method7862(var1).method7840(var2, var3.field7288);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field8499.method7862(var1).method7842(var2, var3.field7287);
		}
	}

	@ObfuscatedName("mv.aoo(Lrn;I)V")
	public static final void method6311(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9054 && !client.field9077 ? 1 : 0;
	}

	@ObfuscatedName("fd.aof(Lrn;B)V")
	public static final void method3509(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3585;
	}

	@ObfuscatedName("qz.aot(Lrn;I)V")
	public static final void method8274(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field5056;
	}

	@ObfuscatedName("fw.aos(Lrn;I)V")
	public static final void method3677(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4225;
	}

	@ObfuscatedName("ju.aoj(Lrn;I)V")
	public static final void method4875(ClientScriptState arg0) {
		String var1 = null;
		if (Statics.field771 != null) {
			var1 = Statics.field771.method1594();
		}
		if (var1 == null) {
			var1 = "";
		}
		arg0.field5222[++arg0.field5230 - 1] = var1;
	}

	@ObfuscatedName("ec.aor(Lrn;I)V")
	public static final void method3446(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field1685;
	}

	@ObfuscatedName("rf.aog(Lrn;I)V")
	public static final void method8631(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field1599;
	}

	@ObfuscatedName("ec.aol(Lrn;B)V")
	public static final void method3453(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field7157;
	}

	@ObfuscatedName("dv.aoz(Lrn;I)V")
	public static final void method2850(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field8432 ? 1 : 0;
	}

	@ObfuscatedName("ki.aoq(Lrn;I)V")
	public static final void method5028(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field8469;
	}

	@ObfuscatedName("ev.aow(Lrn;I)V")
	public static final void method2985(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field563;
	}

	@ObfuscatedName("oo.aoy(Lrn;I)V")
	public static final void method7554(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field8537;
	}

	@ObfuscatedName("ki.aob(Lrn;B)V")
	public static final void method5027(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3210;
	}

	@ObfuscatedName("js.aon(Lrn;I)V")
	public static final void method4805(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3497 ? 1 : 0;
	}

	@ObfuscatedName("pf.aoc(Lrn;I)V")
	public static final void method7911(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field3584;
	}

	@ObfuscatedName("pj.aoh(Lrn;I)V")
	public static final void method7894(ClientScriptState arg0) {
		int var1 = class63.method12606();
		arg0.field5215[++arg0.field5216 - 1] = Statics.field6658 = Statics.field4961.field9661.method15781();
		arg0.field5215[++arg0.field5216 - 1] = var1;
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("ju.aou(Lrn;I)V")
	public static final void method4878(ClientScriptState arg0) {
		class63.method5717();
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("mx.aom(Lrn;I)V")
	public static final void method6074(ClientScriptState arg0) {
		class63.method5928();
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("vg.aod(Lrn;B)V")
	public static final void method12225(ClientScriptState arg0) {
		class63.method7359();
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("it.apl(Lrn;I)V")
	public static final void method4715(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9633, 0);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("ya.apa(Lrn;I)V")
	public static final void method12998(ClientScriptState arg0) {
		if (Statics.field6658 == 2) {
			class63.field823 = true;
		} else if (Statics.field6658 == 1) {
			class63.field824 = true;
		} else if (Statics.field6658 == 3) {
			class63.field812 = true;
		}
	}

	@ObfuscatedName("wx.apv(Lrn;B)V")
	public static final void method12649(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9633.method15868();
	}

	@ObfuscatedName("s.aps(Lrn;B)V")
	public static final void method1318(ClientScriptState arg0) {
		arg0.field5216 -= 2;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		if (var1 == -1) {
			return;
		}
		if (var2 > 255) {
			var2 = 255;
		} else if (var2 < 0) {
			var2 = 0;
		}
		class521.method7358(var1, var2, false);
	}

	@ObfuscatedName("t.apj(Lrn;I)V")
	public static final void method1346(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 != -1) {
			class521.method2930(var1);
		}
	}

	@ObfuscatedName("nn.apt(Lrn;B)V")
	public static final void method6886(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (var1 != -1) {
			class521.method11689(var1);
		}
	}

	@ObfuscatedName("rf.apf(Lrn;B)V")
	public static final void method8632(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field2137.method6799("jagtheora") ? 1 : 0;
	}

	@ObfuscatedName("sn.aph(Lrn;B)V")
	public static final void method11196(ClientScriptState arg0) {
		boolean var1 = false;
		if (client.field8903) {
			try {
				Object var2 = JavascriptFunction.field3153.method4758(new Object[] { Statics.field8469, Statics.field2119.field10043 == 1, arg0.field5215[--arg0.field5216] });
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.field5215[++arg0.field5216 - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("afy.apu(Lrn;I)V")
	public static final void method15732(ClientScriptState arg0) {
		if (client.field8903) {
			JavascriptFunction.field3145.method4761();
		}
	}

	@ObfuscatedName("aec.apk(Lrn;B)V")
	public static final void method15628(ClientScriptState arg0) {
		if (client.field8903) {
			JavascriptFunction.field3147.method4761();
		}
	}

	@ObfuscatedName("acr.apm(Lrn;I)V")
	public static final void method14748(ClientScriptState arg0) {
		boolean var1 = true;
		String var2 = (String) arg0.field5222[--arg0.field5230];
		if (client.field8903) {
			try {
				Object var3 = JavascriptFunction.field3149.method4758(new Object[] { var2 });
				if (var3 != null) {
					var1 = (Boolean) var3;
				}
			} catch (Throwable var5) {
			}
		}
		arg0.field5215[++arg0.field5216 - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("df.apg(Lrn;B)V")
	public static final void method2838(ClientScriptState arg0) {
		boolean var1 = false;
		String var2 = (String) arg0.field5222[--arg0.field5230];
		if (client.field8903) {
			try {
				Object var3 = JavascriptFunction.field3146.method4758(new Object[] { var2 });
				if (var3 != null) {
					var1 = (Boolean) var3;
				}
			} catch (Throwable var5) {
			}
		}
		arg0.field5215[++arg0.field5216 - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("f.apn(Lrn;B)V")
	public static final void method1353(ClientScriptState arg0) {
		String var1 = (String) arg0.field5222[--arg0.field5230];
		if (client.field8903) {
			try {
				JavascriptFunction.field3154.method4758(new Object[] { var1 });
			} catch (Throwable var3) {
			}
		}
	}

	@ObfuscatedName("ic.apw(Lrn;I)V")
	public static final void method4691(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9671.method15724() ? 1 : 0;
	}

	@ObfuscatedName("cg.apy(Lrn;I)V")
	public static final void method2557(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9658.method15707() ? 1 : 0;
	}

	@ObfuscatedName("ck.apo(Lrn;B)V")
	public static final void method2470(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9651.method15750() ? 1 : 0;
	}

	@ObfuscatedName("nb.apq(Lrn;I)V")
	public static final void method6817(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9666.method15757() ? 1 : 0;
	}

	@ObfuscatedName("mx.ape(Lrn;I)V")
	public static final void method6075(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9637.method15828() && Statics.field5187.method452() ? 1 : 0;
	}

	@ObfuscatedName("xb.app(Lrn;B)V")
	public static final void method12750(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9648.method15717() ? 1 : 0;
	}

	@ObfuscatedName("ro.apc(Lrn;B)V")
	public static final void method8727(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9643.method15790() ? 1 : 0;
	}

	@ObfuscatedName("cd.apr(Lrn;B)V")
	public static final void method2493(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9673.method15815() && Statics.field5187.method450() ? 1 : 0;
	}

	@ObfuscatedName("fe.apd(Lrn;B)V")
	public static final void method3844(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9647.method15842() ? 1 : 0;
	}

	@ObfuscatedName("oo.apx(Lrn;S)V")
	public static final void method7555(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9659.method15687() ? 1 : 0;
	}

	@ObfuscatedName("bj.apz(Lrn;I)V")
	public static final void method2023(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9677.method15795() ? 1 : 0;
	}

	@ObfuscatedName("fu.aqs(Lrn;I)V")
	public static final void method3646(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9646.method15698() ? 1 : 0;
	}

	@ObfuscatedName("nn.aqv(Lrn;I)V")
	public static final void method6887(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9641.method15740() ? 1 : 0;
	}

	@ObfuscatedName("ot.aqn(Lrn;B)V")
	public static final void method7375(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9670.method15775() ? 1 : 0;
	}

	@ObfuscatedName("n.aqq(Lrn;B)V")
	public static final void method1376(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9657.method15806() ? 1 : 0;
	}

	@ObfuscatedName("ei.aqr(Lrn;I)V")
	public static final void method3221(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9671.method11387(var1);
	}

	@ObfuscatedName("gm.aqz(Lrn;I)V")
	public static final void method3968(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9658.method11387(var1);
	}

	@ObfuscatedName("oo.aqg(Lrn;I)V")
	public static final void method7556(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9666.method11387(var1);
	}

	@ObfuscatedName("fh.aql(Lrn;B)V")
	public static final void method3652(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (Statics.field5187.method452()) {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9637.method11387(var1);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 3;
		}
	}

	@ObfuscatedName("gk.aqj(Lrn;I)V")
	public static final void method3952(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9648.method11387(var1);
	}

	@ObfuscatedName("oc.aqc(Lrn;S)V")
	public static final void method7381(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9643.method11387(var1);
	}

	@ObfuscatedName("mz.aqo(Lrn;I)V")
	public static final void method6346(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		if (Statics.field5187.method450()) {
			arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9673.method11387(var1);
		} else {
			arg0.field5215[++arg0.field5216 - 1] = 3;
		}
	}

	@ObfuscatedName("adw.aqe(Lrn;I)V")
	public static final void method15165(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9647.method11387(var1);
	}

	@ObfuscatedName("ur.aqu(Lrn;I)V")
	public static final void method12158(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9646.method11387(var1);
	}

	@ObfuscatedName("ti.aqw(Lrn;S)V")
	public static final void method11688(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9670.method11387(var1);
	}

	@ObfuscatedName("ib.aqp(Lrn;I)V")
	public static final void method4611(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5215[++arg0.field5216 - 1] = Statics.field4961.field9657.method11387(var1);
	}

	@ObfuscatedName("ec.aqd(Lrn;I)V")
	public static final void method3447(ClientScriptState arg0) {
		arg0.field5228.method13965(arg0.field5215[--arg0.field5216]);
	}

	@ObfuscatedName("e.aqy(Lrn;I)V")
	public static final void method1669(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5228.field8653;
	}

	@ObfuscatedName("aav.aqa(Lrn;I)V")
	public static final void method14119(ClientScriptState arg0) {
		EntityChatLine var1 = arg0.field5228.method13963();
		if (var1 == null) {
			arg0.field5222[++arg0.field5230 - 1] = "";
		} else {
			arg0.field5222[++arg0.field5230 - 1] = var1.method2477();
		}
	}

	@ObfuscatedName("dn.aqx(Lrn;B)V")
	public static final void method2866(ClientScriptState arg0) {
		arg0.field5222[++arg0.field5230 - 1] = ((PlayerEntity) arg0.field5228).method16120(true);
	}

	@ObfuscatedName("oz.aqh(Lrn;B)V")
	public static final void method7572(ClientScriptState arg0) {
		arg0.field5216 -= 3;
		int var1 = arg0.field5215[arg0.field5216];
		int var2 = arg0.field5215[arg0.field5216 + 1];
		int var3 = arg0.field5215[arg0.field5216 + 2];
		method1373(arg0.field5228.field8652, var1 & 0xFFFF, var2, var3, arg0.field5238, arg0);
	}

	@ObfuscatedName("jm.aqt(Lrn;B)V")
	public static final void method4730(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field5228;
		String var2 = var1.field10077;
		NPCType var3 = var1.field10075;
		if (var3.field7244 != null) {
			NPCType var4 = var3.method12516(Statics.field2669);
			if (var4 == null) {
				var2 = "";
			} else {
				var2 = var4.field7212;
			}
		}
		if (var2 == null) {
			var2 = "";
		}
		arg0.field5222[++arg0.field5230 - 1] = var2;
	}

	@ObfuscatedName("n.arv(Lrn;I)V")
	public static final void method1377(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		ActiveComponent var2;
		if (arg0.field5238) {
			var2 = arg0.field5210;
		} else {
			var2 = arg0.field5223;
		}
		arg0.field5215[++arg0.field5216 - 1] = var2.method11066(arg0.field5228.field8652, var1, -1) ? 1 : 0;
	}

	@ObfuscatedName("re.arr(Lrn;I)V")
	public static final void method8661(ClientScriptState arg0) {
		client.method7883(arg0.field5228, arg0.field5215[--arg0.field5216]);
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[0];
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[1];
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[2];
	}

	@ObfuscatedName("wz.arm(Lrn;I)V")
	public static final void method12680(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field9113 == null ? -1 : client.field9113.field1764;
	}

	@ObfuscatedName("lv.arl(Lrn;I)V")
	public static final void method5616(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5228.method12811();
	}

	@ObfuscatedName("lq.ard(Lrn;I)V")
	public static final void method5923(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		NpcEntity var2 = (NpcEntity) arg0.field5228;
		int var3 = var2.method16156(var1);
		int var4 = var2.method16157(var1);
		arg0.field5215[++arg0.field5216 - 1] = var3;
		arg0.field5215[++arg0.field5216 - 1] = var4;
	}

	@ObfuscatedName("afb.art(Lrn;I)V")
	public static final void method15810(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field5228;
		boolean var2 = false;
		NPCType var3 = var1.field10075;
		if (var3.field7244 != null) {
			var3 = var3.method12516(Statics.field2669);
		}
		if (var3 != null) {
			var2 = var3.field7271;
		}
		arg0.field5215[++arg0.field5216 - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("ms.arq(Lrn;I)V")
	public static final void method6489(ClientScriptState arg0) {
		NpcEntity var1 = (NpcEntity) arg0.field5228;
		NPCType var2 = var1.field10075;
		if (var2.field7244 != null) {
			var2 = var2.method12516(Statics.field2669);
		}
		arg0.field5215[++arg0.field5216 - 1] = var2 == null ? 0 : 1;
	}

	@ObfuscatedName("aam.arx(Lrn;B)V")
	public static final void method14048(ClientScriptState arg0) {
		ComType var1 = arg0.field5228.field8652.method3108(arg0.field5215[--arg0.field5216]);
		var1.field1915 = null;
		var1.field1918 = null;
		client.method12939(var1);
	}

	@ObfuscatedName("im.arz(Lrn;I)V")
	public static final void method4640(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = client.field8919 == arg0.field5228.method13970() ? 1 : 0;
	}

	@ObfuscatedName("wo.aru(Lrn;I)V")
	public static final void method12646(ClientScriptState arg0) {
		client.method7883((GraphEntity) arg0.field5229, arg0.field5215[--arg0.field5216]);
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[0];
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[1];
		arg0.field5215[++arg0.field5216 - 1] = (int) client.field9048[2];
	}

	@ObfuscatedName("rk.ary(Lrn;I)V")
	public static final void method8484(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = ((GraphEntity) arg0.field5229).method12811();
	}

	@ObfuscatedName("pi.arc(Lrn;I)V")
	public static final void method7902(ClientScriptState arg0) {
		arg0.field5215[++arg0.field5216 - 1] = arg0.field5234.method12811();
	}

	@ObfuscatedName("ay.arh(Laes;Lrn;I)V")
	public static final void method1680(GraphEntity arg0, ClientScriptState arg1) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		if (arg0.field9811 != null) {
			for (int var7 = 0; var7 < arg0.field9811.length; var7++) {
				ScreenBoundingBox var8 = arg0.field9811[var7];
				if (var8.field1521) {
					int var9;
					int var10;
					if (var8.field1519 < var8.field1516) {
						var9 = var8.field1519 - var8.field1517;
						var10 = var8.field1517 + var8.field1516;
					} else {
						var9 = var8.field1516 - var8.field1517;
						var10 = var8.field1519 + var8.field1517;
					}
					int var11;
					int var12;
					if (var8.field1520 < var8.field1518) {
						var11 = var8.field1520 - var8.field1517;
						var12 = var8.field1518 + var8.field1517;
					} else {
						var11 = var8.field1518 - var8.field1517;
						var12 = var8.field1520 + var8.field1517;
					}
					if (!var2 || var9 < var3) {
						var3 = var9;
					}
					if (!var2 || var11 < var4) {
						var4 = var11;
					}
					if (!var2 || var10 > var5) {
						var5 = var10;
					}
					if (!var2 || var12 > var6) {
						var6 = var12;
					}
					var2 = true;
				}
			}
		}
		arg1.field5215[++arg1.field5216 - 1] = var2 ? 1 : 0;
		arg1.field5215[++arg1.field5216 - 1] = var3;
		arg1.field5215[++arg1.field5216 - 1] = var4;
		arg1.field5215[++arg1.field5216 - 1] = var5;
		arg1.field5215[++arg1.field5216 - 1] = var6;
	}

	@ObfuscatedName("of.ari(Lrn;B)V")
	public static final void method7067(ClientScriptState arg0) {
		method1680((GraphEntity) arg0.field5229, arg0);
	}

	@ObfuscatedName("et.ars(Lrn;B)V")
	public static final void method2921(ClientScriptState arg0) {
		method1680(arg0.field5234, arg0);
	}

	@ObfuscatedName("el.arj(Lrn;I)V")
	public static final void method3214(ClientScriptState arg0) {
		int var1 = arg0.field5215[--arg0.field5216];
		arg0.field5230 -= 2;
		String var2 = (String) arg0.field5222[arg0.field5230];
		String var3 = (String) arg0.field5222[arg0.field5230 + 1];
		if (var2.length() <= 500 && var3.length() <= 500) {
			method5546(var1, var2, var3);
		}
	}

	@ObfuscatedName("kj.arn(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method5546(int arg0, String arg1, String arg2) {
		if (client.field8975 == null) {
			return;
		}
		ClientMessage var3 = ClientMessage.method14781(ClientProt.field2946, client.field8975.field834);
		var3.field9467.method15287(Packet.method13882(arg1) + 1 + Packet.method13882(arg2));
		var3.field9467.method15229(arg2);
		var3.field9467.method15229(arg1);
		var3.field9467.method15268(arg0);
		client.field8975.method1913(var3);
	}

	@ObfuscatedName("gf.are(Lrn;B)V")
	public static void method4004(ClientScriptState arg0) {
		int var1 = arg0.field5215[arg0.field5216 - 3];
		int var2 = arg0.field5215[arg0.field5216 - 2];
		int var3 = arg0.field5215[arg0.field5216 - 1];
		arg0.field5216 -= 3;
		if (var1 > arg0.field5237[var2]) {
			throw new RuntimeException();
		} else if (var1 > arg0.field5237[var3]) {
			throw new RuntimeException();
		} else if (var2 == var3) {
			throw new RuntimeException();
		} else {
			Algorithms.method4811(arg0.field5224[var2], arg0.field5224[var3], 0, var1 - 1);
		}
	}
}