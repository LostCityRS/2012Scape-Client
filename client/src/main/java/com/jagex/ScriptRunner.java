package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.ArrayList;

@ObfuscatedName("rb")
public class ScriptRunner {

	@ObfuscatedName("rb.a")
	public static int opCount = 0;

	@ObfuscatedName("rb.s")
	public static int[] result = new int[3];

	@ObfuscatedName("rb.c")
	public static WeightedCache field5207 = new WeightedCache(4);

	@ObfuscatedName("rb.m")
	public static Vector3[] field5204 = new Vector3[2];

	@ObfuscatedName("rb.t")
	public static boolean debugScript = false;

	@ObfuscatedName("rb.l")
	public static String field5202 = null;

	@ObfuscatedName("rb.f")
	public static ArrayList clientScriptStatePool = new ArrayList();

	@ObfuscatedName("rb.d")
	public static int clientScriptStatePoolUsedCount = 0;

	@ObfuscatedName("rb.z")
	public static int field5209 = 0;

	public ScriptRunner() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("qr.u(I)Lrn;")
	public static ClientScriptState createClientScriptState() {
		if (clientScriptStatePoolUsedCount == clientScriptStatePool.size()) {
			clientScriptStatePool.add(new ClientScriptState());
		}

		ClientScriptState state = (ClientScriptState) clientScriptStatePool.get(clientScriptStatePoolUsedCount);
		clientScriptStatePoolUsedCount++;
		return state;
	}

	@ObfuscatedName("fp.j(I)V")
	public static void releaseClientScriptState() {
		clientScriptStatePoolUsedCount--;
	}

	@ObfuscatedName("rw.a(Lady;I)V")
	public static void runHook(HookRequest hook) {
		runHook(hook, 200000);
	}

	@ObfuscatedName("tn.s(I[II)V")
	public static void runOnLoad(int arg0, int[] arg1) {
		if (arg0 != -1 && class165.openInterface(arg0, arg1)) {
			class165[] var2 = Statics.interfaces[arg0].components;
			runOnLoad(var2);
		}
	}

	@ObfuscatedName("tw.c([Lew;I)V")
	public static void runOnLoad(class165[] components) {
		for (int i = 0; i < components.length; i++) {
			class165 com = components[i];
			if (com.onLoad != null) {
				HookRequest hook = new HookRequest();
				hook.component = com;
				hook.onOp = com.onLoad;
				runHook(hook, 2000000);
			}
		}
	}

	@ObfuscatedName("e.m(Lady;IB)V")
	public static void runHook(HookRequest hook, int oplimit) {
		Object[] onOp = hook.onOp;
		int id = (Integer) onOp[0];

		ClientScript script = ClientScriptHelpers.getScript(id);
		if (script == null) {
			return;
		}

		ClientScriptState state = createClientScriptState();

		state.intLocals = new int[script.intLocalCount];
		int intCount = 0;

		state.objectLocals = new String[script.objectLocalCount];
		int objectCount = 0;

		state.longLocals = new long[script.longLocalCount];
		int longCount = 0;

		for (int i = 1; i < onOp.length; i++) {
			if (onOp[i] instanceof Integer) {
				int var10 = (Integer) onOp[i];
				if (var10 == 0x80000001) {
					var10 = hook.mouseX;
				}
				if (var10 == 0x80000002) {
					var10 = hook.mouseY;
				}
				if (var10 == 0x80000003) {
					var10 = hook.component == null ? -1 : hook.component.parentLayer;
				}
				if (var10 == 0x80000004) {
					var10 = hook.opIndex;
				}
				if (var10 == 0x80000005) {
					var10 = hook.component == null ? -1 : hook.component.id;
				}
				if (var10 == 0x80000006) {
					var10 = hook.drop == null ? -1 : hook.drop.parentLayer;
				}
				if (var10 == 0x80000007) {
					var10 = hook.drop == null ? -1 : hook.drop.id;
				}
				if (var10 == 0x80000008) {
					var10 = hook.key;
				}
				if (var10 == 0x80000009) {
					var10 = hook.keyChar;
				}
				state.intLocals[intCount++] = var10;
			} else if (onOp[i] instanceof String) {
				String var11 = (String) onOp[i];
				if (var11.equals("event_opbase")) {
					var11 = hook.opBase;
				}
				state.objectLocals[objectCount++] = var11;
			} else if (onOp[i] instanceof Long) {
				long var12 = (Long) onOp[i];
				state.longLocals[longCount++] = var12;
			}
		}
		state.nestedCount = hook.nestedCount;
		execute(script, oplimit, state);
	}

	@ObfuscatedName("dv.t(Lwy;IILaay;IB)V")
	public static void runPathingEntity(ClientTriggerType trigger, int arg1, int arg2, PathingEntity entity, int arg4) {
		ClientScriptState state = createClientScriptState();
		state.activeEntity = entity;
		state.field5232 = arg4;
		runTrigger(trigger, arg1, arg2, state);
		state.activeEntity = null;
		state.field5232 = -1;
	}

	@ObfuscatedName("ae.l(Lwy;IILca;I)V")
	public static void runLoc(ClientTriggerType trigger, int arg1, int arg2, Location loc) {
		ClientScriptState state = createClientScriptState();
		state.activeLoc = loc;
		runTrigger(trigger, arg1, arg2, state);
		state.activeLoc = null;
	}

	@ObfuscatedName("ob.f(Lwy;IILrq;Lali;I)V")
	public static void runObj(ClientTriggerType trigger, int arg1, int arg2, ObjReference arg3, ObjStackEntity obj) {
		ClientScriptState state = createClientScriptState();
		state.activeObj = obj;
		runTrigger(trigger, arg1, arg2, state);
		state.activeObj = null;
	}

	@ObfuscatedName("n.d(Lwy;III)V")
	public static void runTrigger(ClientTriggerType trigger, int arg1, int arg2) {
		ClientScriptState state = createClientScriptState();
		runTrigger(trigger, arg1, arg2, state);
	}

	@ObfuscatedName("dr.z(Lwy;IILrn;I)V")
	public static void runTrigger(ClientTriggerType trigger, int arg1, int arg2, ClientScriptState state) {
		ClientScript script = ClientScriptHelpers.getByTrigger(trigger, arg1, arg2);
		if (script == null) {
			releaseClientScriptState();
			return;
		}
		state.intLocals = new int[script.intLocalCount];
		state.objectLocals = new Object[script.objectLocalCount];
		if (ClientTriggerType.WORLDMAPELEMENTMOUSEOVER == script.trigger || ClientTriggerType.WORLDMAPELEMENTMOUSEREPEAT == script.trigger || ClientTriggerType.WORLDMAPELEMENTMOUSELEAVE == script.trigger) {
			int var5 = 0;
			int var6 = 0;
			if (Statics.field4960 != null) {
				var5 = Statics.field4960.field1776;
				var6 = Statics.field4960.field1777;
			}
			state.intLocals[0] = Statics.field7136.method7254() - var5;
			state.intLocals[1] = Statics.field7136.method7255() - var6;
		} else if (ClientTriggerType.PROCESS_PLAYER == script.trigger) {
			state.intLocals[0] = state.field5232;
		}
		execute(script, 200000, state);
	}

	@ObfuscatedName("mk.o(Lajg;ILrn;I)V")
	public static void execute(ClientScript script, int opLimit, ClientScriptState state) {
		state.isp = 0;
		state.osp = 0;
		state.pc = -1;
		state.script = script;
		state.instructions = state.script.instructions;
		state.intOperands = state.script.intOperands;
		ClientScriptCommand command = null;
		state.fp = 0;
		try {
			opCount = 0;
			while (true) {
				opCount++;
				if (opCount > opLimit) {
					throw new RuntimeException("slow");
				}
				command = state.instructions[++state.pc];
				if (debugScript && (field5202 == null || state.script.scriptName != null && state.script.scriptName.indexOf(field5202) != -1)) {
					System.out.println("Script " + (state.script.scriptName == null ? state.script.id : state.script.scriptName) + ": Command " + command.id);
				}
				if (state.intOperands[state.pc] == 1) {
					state.secondary = true;
				} else {
					state.secondary = false;
				}
				if (ClientScriptCommand.field5281 == command && state.fp == 0) {
					return;
				}
				executeCommand(command, state);
			}
		} catch (Exception ex) {
			StringBuilder var5 = new StringBuilder(30);
			var5.append("").append(state.script.field4228).append(" ");
			for (int var6 = state.fp - 1; var6 >= 0; var6--) {
				var5.append("").append(state.frames[var6].script.field4228).append(" ");
			}
			var5.append("").append(command.id);
			class983.report(var5.toString(), ex);
		} finally {
			releaseClientScriptState();
		}
	}

	@ObfuscatedName("n.q(Lej;IIIZLrn;I)V")
	public static void cc_create_inner(class164 arg0, int arg1, int arg2, int arg3, boolean arg4, ClientScriptState arg5) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		class165 var6 = arg0.components[arg1];
		if (var6.subcomponents == null) {
			var6.subcomponents = new class165[arg3 + 1];
			var6.sortedsubcomponents = var6.subcomponents;
		}
		if (var6.subcomponents.length <= arg3) {
			if (var6.sortedsubcomponents == var6.subcomponents) {
				class165[] var7 = new class165[arg3 + 1];
				for (int var8 = 0; var8 < var6.subcomponents.length; var8++) {
					var7[var8] = var6.subcomponents[var8];
				}
				var6.subcomponents = var6.sortedsubcomponents = var7;
			} else {
				class165[] var9 = new class165[arg3 + 1];
				class165[] var10 = new class165[arg3 + 1];
				for (int var11 = 0; var11 < var6.subcomponents.length; var11++) {
					var9[var11] = var6.subcomponents[var11];
					var10[var11] = var6.sortedsubcomponents[var11];
				}
				var6.subcomponents = var9;
				var6.sortedsubcomponents = var10;
			}
		}
		if (arg3 > 0 && var6.subcomponents[arg3 - 1] == null) {
			throw new RuntimeException("Gap at:" + (arg3 - 1));
		}
		class165 var12 = new class165();
		var12.type = arg2;
		var12.layer = var12.parentLayer = var6.parentLayer;
		var12.id = arg3;
		var6.subcomponents[arg3] = var12;
		if (var6.sortedsubcomponents != var6.subcomponents) {
			var6.sortedsubcomponents[arg3] = var12;
		}
		class504 var13;
		if (arg4) {
			var13 = arg5.activeComponent2;
		} else {
			var13 = arg5.activeComponent;
		}
		var13.itf = arg0;
		var13.com = var12;
		client.requestRedrawComponent(var6);
	}

	@ObfuscatedName("df.p(Lej;Lew;I)V")
	public static void method2840(class164 arg0, class165 arg1) {
		if (arg1 == null) {
			return;
		}
		if (arg1.id == -1) {
			class165[] var5 = arg0.method3105();
			int var6;
			for (var6 = 0; var6 < var5.length && var5[var6] != arg1; var6++) {
			}
			if (var6 >= var5.length) {
				return;
			}
			class531.method11338(var5, var6 + 1, var5, var6, var5.length - var6 - 1);
			var5[var5.length - 1] = arg1;
			return;
		}
		class165 var2 = arg0.method3108(arg1.layer);
		if (var2 == null) {
			return;
		}
		if (var2.sortedsubcomponents == var2.subcomponents) {
			var2.sortedsubcomponents = new class165[var2.subcomponents.length];
			var2.sortedsubcomponents[var2.sortedsubcomponents.length - 1] = arg1;
			class531.method11338(var2.subcomponents, 0, var2.sortedsubcomponents, 0, arg1.id);
			class531.method11338(var2.subcomponents, arg1.id + 1, var2.sortedsubcomponents, arg1.id, var2.subcomponents.length - arg1.id - 1);
			return;
		}
		int var3 = 0;
		class165[] var4 = var2.sortedsubcomponents;
		while (var3 < var4.length && var4[var3] != arg1) {
			var3++;
		}
		if (var3 >= var4.length) {
			return;
		}
		class531.method11338(var4, var3 + 1, var4, var3, var4.length - var3 - 1);
		var4[var2.sortedsubcomponents.length - 1] = arg1;
	}

	@ObfuscatedName("agh.w(Lej;Lew;I)V")
	public static void method15937(class164 arg0, class165 arg1) {
		if (arg1 == null) {
			return;
		}
		if (arg1.id == -1) {
			class165[] var5 = arg0.method3105();
			int var6;
			for (var6 = 0; var6 < var5.length && var5[var6] != arg1; var6++) {
			}
			if (var6 >= var5.length) {
				return;
			}
			class531.method11338(var5, 0, var5, 1, var6);
			var5[0] = arg1;
			return;
		}
		class165 var2 = arg0.components[arg1.layer & 0xFFFF];
		if (var2 == null) {
			return;
		}
		if (var2.sortedsubcomponents == var2.subcomponents) {
			var2.sortedsubcomponents = new class165[var2.subcomponents.length];
			var2.sortedsubcomponents[0] = arg1;
			class531.method11338(var2.subcomponents, 0, var2.sortedsubcomponents, 1, arg1.id);
			class531.method11338(var2.subcomponents, arg1.id + 1, var2.sortedsubcomponents, arg1.id + 1, var2.subcomponents.length - arg1.id - 1);
			return;
		}
		int var3 = 0;
		class165[] var4 = var2.sortedsubcomponents;
		while (var3 < var4.length && var4[var3] != arg1) {
			var3++;
		}
		if (var3 >= var4.length) {
			return;
		}
		class531.method11338(var4, 0, var4, 1, var3);
		var4[0] = arg1;
	}

	@ObfuscatedName("aaq.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V")
	public static void method14095(String arg0, String arg1, String arg2, boolean arg3, boolean arg4) {
		class64 var5 = client.method4104();
		if (var5.method1927() == null) {
			return;
		}
		class792 var6 = class792.method14781(class280.field2860, var5.field834);
		var6.field9467.p2(Statics.method1724(arg0) + Statics.method1724(arg1) + Statics.method1724(arg2) + 1);
		var6.field9467.pjstr(arg0);
		var6.field9467.pjstr(arg1);
		var6.field9467.pjstr(arg2);
		int var7 = 0;
		if (arg3) {
			var7 |= 0x1;
		}
		if (arg4) {
			var7 |= 0x2;
		}
		var6.field9467.p1(var7);
		var5.method1913(var6);
	}

	@ObfuscatedName("ck.x(Lajs;Lrn;I)V")
	public static final void method2473(class944 arg0, ClientScriptState arg1) {
		arg1.intStack[++arg1.isp - 1] = class42.method11220(arg0);
		arg1.objectStack[++arg1.osp - 1] = Statics.method1246(arg0);
		arg1.objectStack[++arg1.osp - 1] = class42.method3629(arg0);
		arg1.objectStack[++arg1.osp - 1] = class42.method6256(arg0);
	}

	@ObfuscatedName("ml.i(Lsd;Lrn;I)V")
	public static final void executeCommand(ClientScriptCommand command, ClientScriptState state) throws class884 {
		switch (command.id) {
			case 1022:
				method4561(state);
				return;
			case 537:
				method1559(state);
				return;
			case 964:
				method6789(state);
				return;
			case 884:
				viewport_setfov(state);
				return;
			case 581:
				Statics.method1954(state);
				return;
			case 408:
				method2810(state);
				return;
			case 965:
				method1620(state);
				return;
			case 551:
				Statics.method2823(state);
				return;
			case 660:
				method2887(state);
				return;
			case 944:
				method4572(state);
				return;
			case 702:
				method3080(state);
				return;
			case 438:
				method6348(state);
				return;
			case 75:
				method4696(state);
				return;
			case 295:
				method15920(state);
				return;
			case 464:
				method1678(state);
				return;
			case 676:
				method6310(state);
				return;
			case 1000:
				method15676(state);
				return;
			case 781:
				method6819(state);
				return;
			case 877:
				method4751(state);
				return;
			case 957:
				method7729(state);
				return;
			case 900:
				method11158(state);
				return;
			case 970:
				method15216(state);
				return;
			case 456:
				method3952(state);
				return;
			case 248:
				method6977(state);
				return;
			case 612:
				method3968(state);
				return;
			case 504:
				Statics.method12748(state);
				return;
			case 1030:
				method12344(state);
				return;
			case 471:
				Statics.method7981(state);
				return;
			case 582:
				method11080(state);
				return;
			case 49:
				Statics.method12369(state);
				return;
			case 166:
				method12726(state);
				return;
			case 580:
				Statics.method7676(state);
				return;
			case 623:
				Statics.method4729(state);
				return;
			case 666:
				method3508(state);
				return;
			case 912:
				method1247(state);
				return;
			case 716:
				Statics.method7693(state);
				return;
			case 669:
				method1561(state);
				return;
			case 843:
				method6580(state);
				return;
			case 424:
				method1375(state);
				return;
			case 242:
				method5788(state);
				return;
			case 173:
				method11865(state);
				return;
			case 876:
				method6314(state);
				return;
			case 902:
				method12651(state);
				return;
			case 637:
				method7896(state);
				return;
			case 972:
				method2584(state);
				return;
			case 397:
				method7279(state);
				return;
			case 290:
				method12115(state);
				return;
			case 602:
				method8273(state);
				return;
			case 714:
				method7382(state);
				return;
			case 52:
				method4611(state);
				return;
			case 243:
				method12691(state);
				return;
			case 806:
				method2811(state);
				return;
			case 994:
				method6022(state);
				return;
			case 128:
				method2022(state);
				return;
			case 931:
				method2846(state);
				return;
			case 51:
				method4566(state);
				return;
			case 611:
				push_int_local(state);
				return;
			case 1020:
				method8632(state);
				return;
			case 908:
				method3086(state);
				return;
			case 742:
				method1396(state);
				return;
			case 455:
				method2863(state);
				return;
			case 114:
				method7990(state);
				return;
			case 949:
				method13910(state);
				return;
			case 592:
				Statics.method3585(state);
				return;
			case 771:
				method3214(state);
				return;
			case 622:
				method6477(state);
				return;
			case 815:
				method12503(state);
				return;
			case 894:
				method15675(state);
				return;
			case 415:
				method6079(state);
				return;
			case 13:
				method4559(state);
				return;
			case 700:
				method7812(state);
				return;
			case 309:
				method13879(state);
				return;
			case 615:
				method5559(state);
				return;
			case 770:
				method7278(state);
				return;
			case 1024:
				method3212(state);
				return;
			case 684:
				method8593(state);
				return;
			case 12:
				method1590(state);
				return;
			case 1016:
				method6077(state);
				return;
			case 380:
				method6883(state);
				return;
			case 1017:
				class500.method12290(state);
				return;
			case 34:
				method15856(state);
				return;
			case 575:
				method12345(state);
				return;
			case 977:
				method1772(state);
				return;
			case 421:
				method4726(state);
				return;
			case 157:
				method7077(state);
				return;
			case 459:
				method5791(state);
				return;
			case 132:
				method11328(state);
				return;
			case 752:
				method13888(state);
				return;
			case 583:
				class500.method4578(state);
				return;
			case 870:
				method3841(state);
				return;
			case 672:
				method2583(state);
				return;
			case 249:
				method7721(state);
				return;
			case 254:
				method3476(state);
				return;
			case 636:
				method1684(false, state);
				return;
			case 671:
				method1908(state);
				return;
			case 336:
				method15146(state);
				return;
			case 893:
				method11872(state);
				return;
			case 80:
				method11142(state);
				return;
			case 625:
				class500.method8606(state);
				return;
			case 88:
				method6851(state);
				return;
			case 328:
				method3632(state);
				return;
			case 631:
				method11688(state);
				return;
			case 412:
				method1806(state);
				return;
			case 461:
				method3570(state);
				return;
			case 435:
				method4598(state);
				return;
			case 588:
				branch_less_than(state);
				return;
			case 250:
				method4556(state);
				return;
			case 27:
				method5616(state);
				return;
			case 233:
				Statics.method6035(state);
				return;
			case 224:
				method11155(state);
				return;
			case 787:
				method7372(state);
				return;
			case 388:
				method8081(state);
				return;
			case 131:
				method5922(state);
				return;
			case 85:
				method6850(state);
				return;
			case 565:
				method11907(state);
				return;
			case 591:
				method8030(state);
				return;
			case 179:
				method12505(state);
				return;
			case 996:
				method3215(state);
				return;
			case 1039:
				method4106(state);
				return;
			case 850:
				method3301(state);
				return;
			case 722:
				method3528(state);
				return;
			case 155:
				method11166(state);
				return;
			case 703:
				branch_equals(state);
				return;
			case 566:
				Statics.method7744(state);
				return;
			case 647:
				method8604(state);
				return;
			case 987:
				method4737(state);
				return;
			case 639:
				method3507(state);
				return;
			case 845:
				method12384(state);
				return;
			case 774:
				method5709(state);
				return;
			case 757:
				method1602(state);
				return;
			case 511:
				method14120(state);
				return;
			case 809:
				method7969(state);
				return;
			case 578:
				class500.method12348(state);
				return;
			case 500:
				method8648(state);
				return;
			case 96:
				method1328(state);
				return;
			case 899:
				method6852(state);
				return;
			case 301:
				method3525(state);
				return;
			case 650:
				class500.method5926(state);
				return;
			case 476:
				method2814(state);
				return;
			case 343:
				Statics.method12909(state);
				return;
			case 614:
				method12182(state);
				return;
			case 909:
				method1961(state);
				return;
			case 892:
				method1369(state);
				return;
			case 165:
				Statics.method2843(state);
				return;
			case 807:
				method12940(state);
				return;
			case 896:
				method6255(state);
				return;
			case 826:
				method7395(state);
				return;
			case 367:
				Statics.method4697(state);
				return;
			case 86:
				class500.method1982(state);
				return;
			case 658:
				method4005(state);
				return;
			case 737:
				method1809(state);
				return;
			case 783:
				method13863(state);
				return;
			case 293:
				method3221(state);
				return;
			case 167:
				method4032(state);
				return;
			case 467:
				method11948(state);
				return;
			case 962:
				Statics.method7879(state);
				return;
			case 535:
				method1959(state);
				return;
			case 352:
				method4563(state);
				return;
			case 681:
				method4874(state);
				return;
			case 183:
				method1220(state);
				return;
			case 1021:
				method2469(state);
				return;
			case 287:
				method4616(state);
				return;
			case 347:
				method7728(state);
				return;
			case 777:
				method13887(state);
				return;
			case 146:
				method7162(state);
				return;
			case 99:
				method14716(state);
				return;
			case 866:
				Statics.method4711(state);
				return;
			case 555:
				method5790(state);
				return;
			case 934:
				method8093(state);
				return;
			case 175:
				method12877(state);
				return;
			case 743:
				class500.method11880(state);
				return;
			case 185:
				method4605(state);
				return;
			case 360:
				method12158(state);
				return;
			case 490:
				method6080(state);
				return;
			case 463:
				method2866(state);
				return;
			case 760:
				method7215(state);
				return;
			case 354:
				method3067(state);
				return;
			case 28:
				method14048(state);
				return;
			case 805:
				method6030(state);
				return;
			case 919:
				method5923(state);
				return;
			case 1009:
				Statics.method4654(state);
				return;
			case 379:
				Statics.method3571(state);
				return;
			case 999:
				Statics.method2426(state);
				return;
			case 349:
				method11056(state);
				return;
			case 562:
				Statics.method3542(state);
				return;
			case 279:
				method6345(state);
				return;
			case 665:
				method8270(state);
				return;
			case 168:
				Statics.method3622(state);
				return;
			case 140:
				Statics.method4615(state);
				return;
			case 797:
				method6063(state);
				return;
			case 502:
				method1701(state);
				return;
			case 292:
				Statics.method12702(state);
				return;
			case 11:
				method5968(state);
				return;
			case 521:
				method7072(state);
				return;
			case 929:
				method3644(state);
				return;
			case 685:
				method4582(state);
				return;
			case 916:
				method2493(state);
				return;
			case 321:
				Statics.method2894(state);
				return;
			case 955:
				method1683(state);
				return;
			case 35:
				method6488(state);
				return;
			case 331:
				Statics.method5827(state);
				return;
			case 692:
				method6028(state);
				return;
			case 988:
				method2555(state);
				return;
			case 402:
				method1836(state);
				return;
			case 911:
				method4632(state);
				return;
			case 522:
				method6021(state);
				return;
			case 178:
				Statics.method8398(state);
				return;
			case 122:
				method15179(state);
				return;
			case 533:
				method5561(state);
				return;
			case 596:
				method883(state);
				return;
			case 10:
				method8348(state);
				return;
			case 479:
				method6827(state);
				return;
			case 597:
				method7347(state);
				return;
			case 258:
				method2838(state);
				return;
			case 142:
				method8031(state);
				return;
			case 643:
				method15810(state);
				return;
			case 383:
				method11114(state);
				return;
			case 231:
				method3940(state);
				return;
			case 147:
				method4035(state);
				return;
			case 680:
				Statics.method6876(state);
				return;
			case 296:
				Statics.method8728(state);
				return;
			case 868:
				method3906(state);
				return;
			case 391:
				method14924(state);
				return;
			case 874:
				method8300(state);
				return;
			case 853:
				class500.method3220(state);
				return;
			case 406:
				method1953(state);
				return;
			case 980:
				method4639(state);
				return;
			case 148:
				method15442(state);
				return;
			case 1018:
				Statics.method16476(state);
				return;
			case 462:
				method13880(state);
				return;
			case 9:
				method14132(state);
				return;
			case 364:
				method7980(state);
				return;
			case 214:
				method7321(state);
				return;
			case 187:
				method2538(state);
				return;
			case 621:
				method2490(state);
				return;
			case 607:
				method3663(state);
				return;
			case 942:
				method4770(state);
				return;
			case 56:
				method2889(state);
				return;
			case 232:
				method1418(state);
				return;
			case 332:
				Statics.method7975(state);
				return;
			case 273:
				method5566(state);
				return;
			case 670:
				method1344(state);
				return;
			case 1025:
				method16886(state);
				return;
			case 811:
				method3677(state);
				return;
			case 546:
				method6083(state);
				return;
			case 414:
				method7978(state);
				return;
			case 959:
				method5828(state);
				return;
			case 690:
				method3454(state);
				return;
			case 841:
				method6027(state);
				return;
			case 879:
				method13864(state);
				return;
			case 997:
				method7713(state);
				return;
			case 208:
				method8623(state);
				return;
			case 439:
				method4725(state);
				return;
			case 326:
				Statics.method7814(state);
				return;
			case 858:
				method1820(state);
				return;
			case 506:
				method12189(state);
				return;
			case 840:
				method4775(state);
				return;
			case 976:
				method4626(state);
				return;
			case 335:
				method2864(state);
				return;
			case 986:
				method4791(state);
				return;
			case 369:
				method4009(state);
				return;
			case 53:
				method12368(state);
				return;
			case 539:
				method3621(state);
				return;
			case 247:
				method11996(state);
				return;
			case 839:
				method2588(state);
				return;
			case 978:
				method1415(state);
				return;
			case 384:
				method8089(state);
				return;
			case 164:
				method7073(state);
				return;
			case 117:
				method14066(state);
				return;
			case 935:
				method4894(state);
				return;
			case 492:
				method2921(state);
				return;
			case 856:
				method12886(state);
				return;
			case 1036:
				method1975(state);
				return;
			case 735:
				method2574(state);
				return;
			case 712:
				method1324(state);
				return;
			case 793:
				class500.method8541(state);
				return;
			case 928:
				method6313(state);
				return;
			case 396:
				method8285(state);
				return;
			case 118:
				method1904(state);
				return;
			case 878:
				method1666(state);
				return;
			case 454:
				method1377(state);
				return;
			case 610:
				method11711(state);
				return;
			case 963:
				method7067(state);
				return;
			case 89:
				Statics.method8660(state);
				return;
			case 534:
				method827(state);
				return;
			case 1004:
				method1669(state);
				return;
			case 646:
				method5966(state);
				return;
			case 921:
				method14962(state);
				return;
			case 60:
				method4570(state);
				return;
			case 365:
				method7743(state);
				return;
			case 633:
				method11075(state);
				return;
			case 253:
				class500.method1348(state);
				return;
			case 84:
				method14810(state);
				return;
			case 212:
				method14812(state);
				return;
			case 137:
				method2708(state);
				return;
			case 192:
				method4640(state);
				return;
			case 694:
				method3584(state);
				return;
			case 903:
				method8616(state);
				return;
			case 430:
				method3653(state);
				return;
			case 719:
				class500.method14068(state);
				return;
			case 554:
				method1816(state);
				return;
			case 39:
				method12740(state);
				return;
			case 227:
				method3675(state);
				return;
			case 491:
				method8079(state);
				return;
			case 630:
				viewport_clampfov(state);
				return;
			case 651:
				method4722(state);
				return;
			case 348:
				method8608(state);
				return;
			case 552:
				Statics.method2717(state);
				return;
			case 202:
				method3970(state);
				return;
			case 163:
				method1713(state);
				return;
			case 220:
				method6971(state);
				return;
			case 197:
				method3317(state);
				return;
			case 724:
				class500.method7657(state);
				return;
			case 149:
				Statics.method11055(state);
				return;
			case 272:
				method6487(state);
				return;
			case 529:
				Statics.method8622(state);
				return;
			case 110:
				method6877(state);
				return;
			case 275:
				method15609(state);
				return;
			case 758:
				Statics.method6879(state);
				return;
			case 235:
				method7346(state);
				return;
			case 423:
				method1971(state);
				return;
			case 867:
				method7979(state);
				return;
			case 283:
				method3474(state);
				return;
			case 451:
				method3966(state);
				return;
			case 199:
				method2985(state);
				return;
			case 1044:
				method7064(state);
				return;
			case 54:
				method826(state);
				return;
			case 264:
				method2558(state);
				return;
			case 76:
				method16249(state);
				return;
			case 1002:
				method4785(state);
				return;
			case 981:
				method3923(state);
				return;
			case 803:
				method7281(state);
				return;
			case 772:
				method3316(state);
				return;
			case 956:
				method4730(state);
				return;
			case 778:
				method3447(state);
				return;
			case 276:
				method12225(state);
				return;
			case 644:
				method12635(state);
				return;
			case 790:
				method6791(state);
				return;
			case 827:
				method4603(state);
				return;
			case 325:
				method4734(state);
				return;
			case 833:
				method1560(state);
				return;
			case 801:
				method3568(state);
				return;
			case 314:
				Statics.method7717(state);
				return;
			case 375:
				method3651(state);
				return;
			case 593:
				method3650(state);
				return;
			case 620:
				method5569(state);
				return;
			case 717:
				method15938(state);
				return;
			case 817:
				method15893(state);
				return;
			case 64:
				method11876(state);
				return;
			case 193:
				method2836(state);
				return;
			case 629:
				method1808(state);
				return;
			case 58:
				method5015(state);
				return;
			case 568:
				method2582(state);
				return;
			case 846:
				method7892(state);
				return;
			case 603:
				method2899(state);
				return;
			case 65:
				method1353(state);
				return;
			case 260:
				method4001(state);
				return;
			case 240:
				method4101(state);
				return;
			case 94:
				method7730(state);
				return;
			case 92:
				method1222(state);
				return;
			case 642:
				method6346(state);
				return;
			case 544:
				method8045(state);
				return;
			case 203:
				Statics.method3967(state);
				return;
			case 448:
				method12478(state);
				return;
			case 170:
				method8496(state);
				return;
			case 821:
				method8617(state);
				return;
			case 553:
				Statics.method7074(state);
				return;
			case 297:
				Statics.method8597(state);
				return;
			case 441:
				method1679(state);
				return;
			case 256:
				method15482(state);
				return;
			case 111:
				method7571(state);
				return;
			case 8:
				method8665(state);
				return;
			case 755:
				method1622(state);
				return;
			case 730:
				method8603(state);
				return;
			case 392:
				method4976(state);
				return;
			case 1028:
				method12162(state);
				return;
			case 419:
				method4002(state);
				return;
			case 465:
				Statics.method3638(state);
				return;
			case 1006:
				method2987(state);
				return;
			case 947:
				method11198(state);
				return;
			case 559:
				method3661(state);
				return;
			case 512:
				method2428(state);
				return;
			case 378:
				method3673(state);
				return;
			case 707:
				method5829(state);
				return;
			case 749:
				method4780(state);
				return;
			case 313:
				method11163(state);
				return;
			case 244:
				method6067(state);
				return;
			case 251:
				method14743(state);
				return;
			case 426:
				method12636(state);
				return;
			case 386:
				method11707(state);
				return;
			case 721:
				method11762(state);
				return;
			case 1011:
				method5024(state);
				return;
			case 1038:
				Statics.method1605(state);
				return;
			case 547:
				method4736(state);
				return;
			case 824:
				method11960(state);
				return;
			case 25:
				Statics.method16113(state);
				return;
			case 705:
				Statics.method8406(state);
				return;
			case 91:
				method6826(state);
				return;
			case 45:
				method3446(state);
				return;
			case 882:
				method7888(state);
				return;
			case 945:
				class500.method3566(state);
				return;
			case 307:
				method15787(state);
				return;
			case 73:
				method15613(state);
				return;
			case 422:
				method4622(state);
				return;
			case 409:
				method7554(state);
				return;
			case 595:
				method6258(state);
				return;
			case 675:
				method2354(state);
				return;
			case 499:
				method5071(state);
				return;
			case 274:
				method8589(state);
				return;
			case 548:
				method16682(state);
				return;
			case 182:
				Statics.method12185(state);
				return;
			case 308:
				method8080(state);
				return;
			case 229:
				method8387(state);
				return;
			case 263:
				method8197(state);
				return;
			case 641:
				method3323(state);
				return;
			case 446:
				method7686(state);
				return;
			case 998:
				Statics.method3907(state);
				return;
			case 134:
				method2871(state);
				return;
			case 97:
				method3544(state);
				return;
			case 645:
				Statics.method6647(state);
				return;
			case 485:
				method7374(state);
				return;
			case 285:
				method5619(state);
				return;
			case 895:
				method1413(state);
				return;
			case 282:
				method4695(state);
				return;
			case 338:
				method11537(state);
				return;
			case 556:
				method8408(state);
				return;
			case 452:
				method4690(state);
				return;
			case 720:
				method2869(state);
				return;
			case 974:
				method2589(state);
				return;
			case 101:
				method1203(state);
				return;
			case 71:
				method233(state);
				return;
			case 885:
				method11489(state);
				return;
			case 42:
				method7714(state);
				return;
			case 857:
				method1326(state);
				return;
			case 886:
				Statics.method6069(state);
				return;
			case 239:
				method14131(state);
				return;
			case 517:
				Statics.method2611(state);
				return;
			case 259:
				method5545(state);
				return;
			case 576:
				Statics.method13912(state);
				return;
			case 638:
				method16790(state);
				return;
			case 334:
				method1719(state);
				return;
			case 599:
				Statics.method16642(false, state);
				return;
			case 954:
				method6820(state);
				return;
			case 635:
				method3844(state);
				return;
			case 655:
				method2023(state);
				return;
			case 545:
				method8456(state);
				return;
			case 115:
				method1240(state);
				return;
			case 848:
				method1316(state);
				return;
			case 47:
				method3631(state);
				return;
			case 697:
				method3291(state);
				return;
			case 98:
				method1318(state);
				return;
			case 887:
				method2917(state);
				return;
			case 55:
				method8385(state);
				return;
			case 933:
				method7349(state);
				return;
			case 37:
				method3543(state);
				return;
			case 810:
				method14260(state);
				return;
			case 960:
				method7378(state);
				return;
			case 791:
				method3533(state);
				return;
			case 17:
				method5733(state);
				return;
			case 1045:
				method1684(true, state);
				return;
			case 969:
				method14811(state);
				return;
			case 32:
				method8284(state);
				return;
			case 872:
				method6887(state);
				return;
			case 851:
				method2815(state);
				return;
			case 520:
				method3660(state);
				return;
			case 788:
				method1815(state);
				return;
			case 632:
				method1964(state);
				return;
			case 151:
				method1817(state);
				return;
			case 880:
				method4003(state);
				return;
			case 756:
				method6985(state);
				return;
			case 540:
				method3453(state);
				return;
			case 269:
				method11309(state);
				return;
			case 44:
				method4034(state);
				return;
			case 370:
				method7858(state);
				return;
			case 356:
				method235(state);
				return;
			case 820:
				method7180(state);
				return;
			case 330:
				method2492(state);
				return;
			case 901:
				Statics.method14062(state);
				return;
			case 371:
				method6972(state);
				return;
			case 984:
				method5921(state);
				return;
			case 704:
				method5808(state);
				return;
			case 1037:
				pop_int_discard(state);
				return;
			case 340:
				method880(state);
				return;
			case 162:
				method5789(state);
				return;
			case 252:
				method6358(state);
				return;
			case 407:
				method15592(state);
				return;
			case 663:
				method8407(state);
				return;
			case 156:
				method1374(state);
				return;
			case 628:
				method11378(state);
				return;
			case 608:
				Statics.method13892(state);
				return;
			case 281:
				method3524(state);
				return;
			case 1019:
				method11242(state);
				return;
			case 159:
				Statics.method3531(state);
				return;
			case 436:
				method3846(state);
				return;
			case 445:
				method2489(state);
				return;
			case 405:
				method3659(state);
				return;
			case 398:
				method14747(state);
				return;
			case 816:
				method13894(state);
				return;
			case 834:
				viewport_setzoom(state);
				return;
			case 594:
				method2983(state);
				return;
			case 350:
				method2827(state);
				return;
			case 95:
				method3061(state);
				return;
			case 401:
				method4808(state);
				return;
			case 943:
				method7277(state);
				return;
			case 799:
				method8199(state);
				return;
			case 6:
				method5028(state);
				return;
			case 70:
				method15785(state);
				return;
			case 135:
				Statics.method8303(state);
				return;
			case 975:
				method4691(state);
				return;
			case 753:
				Statics.method11255(state);
				return;
			case 206:
				method6064(state);
				return;
			case 852:
				method3062(state);
				return;
			case 141:
				method2541(state);
				return;
			case 404:
				method11665(state);
				return;
			case 150:
				method8386(state);
				return;
			case 971:
				class500.method2707(state);
				return;
			case 109:
				method4655(state);
				return;
			case 300:
				method7722(state);
				return;
			case 429:
				method1770(state);
				return;
			case 145:
				push_constant_string(state);
				return;
			case 477:
				method15655(state);
				return;
			case 304:
				method13895(state);
				return;
			case 600:
				method2984(state);
				return;
			case 268:
				method4809(state);
				return;
			case 57:
				method13913(state);
				return;
			case 948:
				method11506(state);
				return;
			case 802:
				method6818(state);
				return;
			case 211:
				method12204(state);
				return;
			case 961:
				method2922(state);
				return;
			case 842:
				method8317(state);
				return;
			case 473:
				method3204(state);
				return;
			case 278:
				method16720(state);
				return;
			case 989:
				method2557(state);
				return;
			case 127:
				method5026(state);
				return;
			case 339:
				method4617(state);
				return;
			case 927:
				method14311(state);
				return;
			case 77:
				method15628(state);
				return;
			case 728:
				method15137(state);
				return;
			case 930:
				method3976(state);
				return;
			case 792:
				method1976(state);
				return;
			case 950:
				method7690(state);
				return;
			case 372:
				method8583(state);
				return;
			case 795:
				method11193(state);
				return;
			case 294:
				method3627(state);
				return;
			case 657:
				Statics.method7831(state);
				return;
			case 322:
				method5542(state);
				return;
			case 531:
				method6074(state);
				return;
			case 710:
				method12553(state);
				return;
			case 871:
				Statics.method3944(state);
				return;
			case 324:
				method13853(state);
				return;
			case 738:
				method4792(state);
				return;
			case 946:
				method8610(state);
				return;
			case 662:
				method12072(state);
				return;
			case 346:
				method15674(state);
				return;
			case 695:
				method1909(state);
				return;
			case 678:
				method7062(state);
				return;
			case 418:
				method7381(state);
				return;
			case 873:
				method3652(state);
				return;
			case 731:
				Statics.method2820(state);
				return;
			case 480:
				method12679(state);
				return;
			case 800:
				method11397(state);
				return;
			case 271:
				method2919(state);
				return;
			case 180:
				method4579(state);
				return;
			case 497:
				pop_int_local(state);
				return;
			case 995:
				method2470(state);
				return;
			case 449:
				method2021(state);
				return;
			case 112:
				method15164(state);
				return;
			case 428:
				method7903(state);
				return;
			case 488:
				method6886(state);
				return;
			case 72:
				method1945(state);
				return;
			case 525:
				method15480(state);
				return;
			case 812:
				method11256(state);
				return;
			case 968:
				Statics.method15610(state);
				return;
			case 443:
				method7741(state);
				return;
			case 230:
				method1346(state);
				return;
			case 210:
				method7742(state);
				return;
			case 359:
				method1881(state);
				return;
			case 189:
				method2556(state);
				return;
			case 41:
				Statics.method11851(state);
				return;
			case 503:
				method8455(state);
				return;
			case 357:
				method6246(state);
				return;
			case 20:
				method2430(state);
				return;
			case 626:
				Statics.method3939(state);
				return;
			case 574:
				Statics.method16642(true, state);
				return;
			case 701:
				method4558(state);
				return;
			case 59:
				method4008(state);
				return;
			case 768:
				method15591(state);
				return;
			case 130:
				method3842(state);
				return;
			case 389:
				method4565(state);
				return;
			case 31:
				Statics.method1977(state);
				return;
			case 736:
				Statics.method2576(state);
				return;
			case 831:
				method3473(state);
				return;
			case 81:
				method7907(state);
				return;
			case 433:
				method1883(state);
				return;
			case 990:
				method7716(state);
				return;
			case 188:
				method15931(state);
				return;
			case 266:
				method6828(state);
				return;
			case 280:
				method12233(state);
				return;
			case 829:
				method4102(state);
				return;
			case 453:
				Statics.method12728(state);
				return;
			case 1040:
				method11296(state);
				return;
			case 780:
				method2837(state);
				return;
			case 223:
				method8482(state);
				return;
			case 649:
				method8200(state);
				return;
			case 376:
				method6242(state);
				return;
			case 387:
				method12724(state);
				return;
			case 226:
				method8228(state);
				return;
			case 363:
				method16115(state);
				return;
			case 875:
				method14266(state);
				return;
			case 952:
				method8584(state);
				return;
			case 184:
				method6075(state);
				return;
			case 470:
				method5708(state);
				return;
			case 682:
				method11758(state);
				return;
			case 312:
				method6969(state);
				return;
			case 368:
				class207.add(state, (byte) -95);
				return;
			case 486:
				method6817(state);
				return;
			case 767:
				method4004(state);
				return;
			case 425:
				method3639(state);
				return;
			case 241:
				method2992(state);
				return;
			case 143:
				method4653(state);
				return;
			case 861:
				method2605(state);
				return;
			case 496:
				method4784(state);
				return;
			case 403:
				method5826(state);
				return;
			case 693:
				method4580(state);
				return;
			case 265:
				method1837(state);
				return;
			case 687:
				method7555(state);
				return;
			case 299:
				method7911(state);
				return;
			case 549:
				method12346(state);
				return;
			case 315:
				method8090(state);
				return;
			case 586:
				method4755(state);
				return;
			case 1031:
				method6243(state);
				return;
			case 813:
				method3535(state);
				return;
			case 706:
				method7878(state);
				return;
			case 590:
				method11324(state);
				return;
			case 107:
				method2585(state);
				return;
			case 932:
				method7181(state);
				return;
			case 413:
				Statics.method7991(state);
				return;
			case 542:
				method8287(state);
				return;
			case 609:
				method4803(state);
				return;
			case 46:
				method7786(state);
				return;
			case 982:
				method1376(state);
				return;
			case 698:
				method7718(state);
				return;
			case 561:
				method7371(state);
				return;
			case 317:
				method1685(state);
				return;
			case 200:
				method15964(state);
				return;
			case 104:
				method2578(state);
				return;
			case 303:
				method6402(state);
				return;
			case 437:
				method3620(state);
				return;
			case 746:
				method3563(state);
				return;
			case 323:
				branch(state);
				return;
			case 587:
				method828(state);
				return;
			case 750:
				Statics.method3642(state);
				return;
			case 40:
				method15467(state);
				return;
			case 664:
				method8607(state);
				return;
			case 668:
				method12646(state);
				return;
			case 618:
				class500.method1248(state);
				return;
			case 898:
				method3908(state);
				return;
			case 487:
				method1668(state);
				return;
			case 291:
				class500.method3307(state);
				return;
			case 688:
				method3628(state);
				return;
			case 926:
				method4715(state);
				return;
			case 718:
				method7229(state);
				return;
			case 113:
				method7736(state);
				return;
			case 0:
				method2580(state);
				return;
			case 1032:
				Statics.method5615(state);
				return;
			case 939:
				Statics.method6081(state);
				return;
			case 225:
				method8483(state);
				return;
			case 527:
				method16789(state);
				return;
			case 345:
				method12222(state);
				return;
			case 571:
				method3083(state);
				return;
			case 320:
				method11183(state);
				return;
			case 341:
				method7182(state);
				return;
			case 915:
				method3094(state);
				return;
			case 217:
				method6489(state);
				return;
			case 627:
				method2939(state);
				return;
			case 154:
				Statics.method7955(state);
				return;
			case 855:
				method3068(state);
				return;
			case 205:
				method3545(state);
				return;
			case 510:
				method4120(state);
				return;
			case 5:
				Statics.method2932(state);
				return;
			case 654:
				Statics.method5938(state);
				return;
			case 66:
				Statics.method2549(state);
				return;
			case 906:
				method2844(state);
				return;
			case 605:
				method4121(state);
				return;
			case 673:
				method12738(state);
				return;
			case 78:
				method2825(state);
				return;
			case 572:
				method7572(state);
				return;
			case 634:
				Statics.method12465(state);
				return;
			case 344:
				method5941(state);
				return;
			case 411:
				method5832(state);
				return;
			case 288:
				method14088(state);
				return;
			case 699:
				Statics.method2577(state);
				return;
			case 316:
				method5573(state);
				return;
			case 353:
				Statics.method4895(state);
				return;
			case 216:
				method4747(state);
				return;
			case 640:
				method7345(state);
				return;
			case 245:
				method3498(state);
				return;
			case 524:
				method12355(state);
				return;
			case 121:
				Statics.method1822(state);
				return;
			case 102:
				method4738(state);
				return;
			case 733:
				method4108(state);
				return;
			case 172:
				method3448(state);
				return;
			case 1014:
				method1204(state);
				return;
			case 667:
				method7183(state);
				return;
			case 120:
				method5710(state);
				return;
			case 218:
				method4670(state);
				return;
			case 219:
				method4709(state);
				return;
			case 319:
				method1607(state);
				return;
			case 129:
				method4804(state);
				return;
			case 431:
				method3466(state);
				return;
			case 63:
				Statics.method4893(state);
				return;
			case 440:
				method882(state);
				return;
			case 940:
				method12856(state);
				return;
			case 1007:
				Statics.method6829(state);
				return;
			case 119:
				class500.method4614(state);
				return;
			case 744:
				method2716(state);
				return;
			case 82:
				method1398(state);
				return;
			case 683:
				method5027(state);
				return;
			case 361:
				method6793(state);
				return;
			case 967:
				method12750(state);
				return;
			case 381:
				method3636(state);
				return;
			case 564:
				method4716(state);
				return;
			case 395:
				method1591(state);
				return;
			case 123:
				method3938(state);
				return;
			case 1008:
				method2928(state);
				return;
			case 24:
				method15165(state);
				return;
			case 739:
				Statics.method13893(state);
				return;
			case 723:
				method7375(state);
				return;
			case 191:
				method6984(state);
				return;
			case 825:
				method6642(state);
				return;
			case 745:
				method11299(state);
				return;
			case 1034:
				method15669(state);
				return;
			case 653:
				method2819(state);
				return;
			case 1001:
				method2824(state);
				return;
			case 410:
				method1239(state);
				return;
			case 257:
				method11184(state);
				return;
			case 691:
				method5787(state);
				return;
			case 270:
				method12164(state);
				return;
			case 523:
				method6794(state);
				return;
			case 891:
				method7556(state);
				return;
			case 204:
				method2927(state);
				return;
			case 696:
				method14723(state);
				return;
			case 215:
				method3081(state);
				return;
			case 818:
				Statics.method7988(state);
				return;
			case 93:
				method16254(state);
				return;
			case 606:
				push_constant_int(state);
				return;
			case 394:
				method11845(state);
				return;
			case 489:
				method3539(state);
				return;
			case 1035:
				method2610(state);
				return;
			case 689:
				method6847(state);
				return;
			case 859:
				method8615(state);
				return;
			case 382:
				method3206(state);
				return;
			case 652:
				method4557(state);
				return;
			case 1023:
				method7813(state);
				return;
			case 444:
				class500.method5565(state);
				return;
			case 427:
				method4779(state);
				return;
			case 19:
				method1221(state);
				return;
			case 68:
				method7989(state);
				return;
			case 169:
				Statics.method6790(state);
				return;
			case 481:
				method2817(state);
				return;
			case 194:
				method8513(state);
				return;
			case 213:
				method7246(state);
				return;
			case 865:
				method16940(state);
				return;
			case 530:
				method12207(state);
				return;
			case 475:
				method3523(state);
				return;
			case 14:
				method7689(state);
				return;
			case 765:
				method5570(state);
				return;
			case 478:
				method4708(state);
				return;
			case 604:
				method11536(state);
				return;
			case 385:
				method12680(state);
				return;
			case 759:
				method5592(state);
				return;
			case 469:
				method15141(state);
				return;
			case 87:
				method8619(state);
				return;
			case 333:
				method3624(state);
				return;
			case 79:
				method6581(state);
				return;
			case 889:
				method5070(state);
				return;
			case 951:
				method2924(state);
				return;
			case 1041:
				method4753(state);
				return;
			case 138:
				method8141(state);
				return;
			case 513:
				method12900(state);
				return;
			case 74:
				Statics.method5810(state);
				return;
			case 924:
				method7715(state);
				return;
			case 18:
				method15949(state);
				return;
			case 838:
				method3290(state);
				return;
			case 125:
				method1978(state);
				return;
			case 198:
				method3308(state);
				return;
			case 823:
				method7078(state);
				return;
			case 1010:
				method3567(state);
				return;
			case 519:
				method8046(state);
				return;
			case 1026:
				method7393(state);
				return;
			case 567:
				Statics.method3207(state);
				return;
			case 116:
				method15732(state);
				return;
			case 822:
				class500.method14038(state);
				return;
			case 90:
				Statics.method7050(state);
				return;
			case 327:
				method2495(state);
				return;
			case 393:
				method7901(state);
				return;
			case 937:
				method8484(state);
				return;
			case 923:
				method3640(state);
				return;
			case 67:
				method12145(state);
				return;
			case 174:
				method4810(state);
				return;
			case 536:
				method1960(state);
				return;
			case 941:
				method7889(state);
				return;
			case 528:
				method15825(state);
				return;
			case 740:
				method16190(state);
				return;
			case 43:
				method8065(state);
				return;
			case 860:
				method8627(state);
				return;
			case 420:
				method1882(state);
				return;
			case 318:
				Statics.method1905(state);
				return;
			case 450:
				method1722(state);
				return;
			case 374:
				method1686(state);
				return;
			case 26:
				method3203(state);
				return;
			case 277:
				method12036(state);
				return;
			case 355:
				method14904(state);
				return;
			case 589:
				method7976(state);
				return;
			case 237:
				method1558(state);
				return;
			case 953:
				method1818(state);
				return;
			case 1:
				method6639(state);
				return;
			case 557:
				method4806(state);
				return;
			case 985:
				method4878(state);
				return;
			case 447:
				method4875(state);
				return;
			case 33:
				method6084(state);
				return;
			case 798:
				Statics.method5571(state);
				return;
			case 136:
				method4721(state);
				return;
			case 677:
				method6968(state);
				return;
			case 1015:
				method3227(state);
				return;
			case 828:
				method4594(state);
				return;
			case 246:
				method5014(state);
				return;
			case 186:
				method7832(state);
				return;
			case 289:
				method6845(state);
				return;
			case 616:
				method3084(state);
				return;
			case 748:
				method6491(state);
				return;
			case 734:
				method16721(state);
				return;
			case 910:
				method13885(state);
				return;
			case 741:
				method1414(state);
				return;
			case 518:
				method11196(state);
				return;
			case 1029:
				method6311(state);
				return;
			case 729:
				method1819(state);
				return;
			case 617:
				method2386(state);
				return;
			case 221:
				method7553(state);
				return;
			case 761:
				method14210(state);
				return;
			case 144:
				method2706(state);
				return;
			case 417:
				method3085(state);
				return;
			case 306:
				detailget_animdetail(state);
				return;
			case 819:
				method3924(state);
				return;
			case 674:
				method7974(state);
				return;
			case 50:
				method1317(state);
				return;
			case 366:
				Statics.method6646(state);
				return;
			case 764:
				method1973(state);
				return;
			case 573:
				branch_greater_than(state);
				return;
			case 727:
				method3977(state);
				return;
			case 979:
				method1967(state);
				return;
			case 228:
				method1593(state);
				return;
			case 495:
				method2353(state);
				return;
			case 854:
				method2713(state);
				return;
			case 938:
				method12727(state);
				return;
			case 124:
				method3509(state);
				return;
			case 342:
				method7063(state);
				return;
			case 804:
				method15823(state);
				return;
			case 715:
				method3672(state);
				return;
			case 904:
				method2812(state);
				return;
			case 601:
				method6023(state);
				return;
			case 708:
				method7894(state);
				return;
			case 918:
				method1700(state);
				return;
			case 416:
				method3845(state);
				return;
			case 920:
				method14748(state);
				return;
			case 483:
				method6356(state);
				return;
			case 849:
				method2993(state);
				return;
			case 579:
				method2886(state);
				return;
			case 3:
				gosub_with_params(state);
				return;
			case 195:
				method6479(state);
				return;
			case 863:
				method2895(state);
				return;
			case 472:
				method8347(state);
				return;
			case 713:
				method4636(state);
				return;
			case 432:
				method6948(state);
				return;
			case 936:
				method11763(state);
				return;
			case 106:
				method1715(state);
				return;
			case 773:
				method1345(state);
				return;
			case 2:
				Statics.method8720(state);
				return;
			case 358:
				method3646(state);
				return;
			case 377:
				method2705(state);
				return;
			case 769:
				method2586(state);
				return;
			case 474:
				method12649(state);
				return;
			case 782:
				class500.method8480(state);
				return;
			case 161:
				method7214(state);
				return;
			case 711:
				method8661(state);
				return;
			case 466:
				method2491(state);
				return;
			case 498:
				method6073(state);
				return;
			case 1005:
				method14089(state);
				return;
			case 22:
				method8138(state);
				return;
			case 830:
				method7687(state);
				return;
			case 779:
				method4604(state);
				return;
			case 310:
				method7771(state);
				return;
			case 108:
				method3452(state);
				return;
			case 796:
				method2850(state);
				return;
			case 732:
				method4863(state);
				return;
			case 29:
				Statics.method12325(state);
				return;
			case 659:
				method14218(state);
				return;
			case 434:
				method5551(state);
				return;
			case 1027:
				method6649(state);
				return;
			case 7:
				Statics.method7968(state);
				return;
			case 160:
				method14217(state);
				return;
			case 907:
				method2986(state);
				return;
			case 784:
				Statics.method234(state);
				return;
			case 267:
				method7902(state);
				return;
			case 847:
				method8286(state);
				return;
			case 1012:
				Statics.method4706(state);
				return;
			case 400:
				class500.method4601(state);
				return;
			case 526:
				method5809(state);
				return;
			case 181:
				method12328(state);
				return;
			case 917:
				method11199(state);
				return;
			case 298:
				method1714(state);
				return;
			case 1043:
				method11976(state);
				return;
			case 390:
				method4007(state);
				return;
			case 584:
				method1907(state);
				return;
			case 61:
				method8657(state);
				return;
			case 457:
				method2897(state);
				return;
			case 905:
				method13905(state);
				return;
			case 468:
				Statics.method4599(state);
				return;
			case 794:
				method5543(state);
				return;
			case 862:
				method12729(state);
				return;
			case 38:
				method8602(state);
				return;
			case 48:
				method11490(state);
				return;
			case 30:
				method15803(state);
				return;
			case 619:
				method6403(state);
				return;
			case 538:
				method2606(state);
				return;
			case 1003:
				Statics.method11638(state);
				return;
			case 585:
				Statics.method13908(state);
				return;
			case 550:
				method4592(state);
				return;
			case 726:
				method8631(state);
				return;
			case 1042:
				Statics.method4771(state);
				return;
			case 158:
				method11165(state);
				return;
			case 832:
				Statics.method12700(state);
				return;
			case 914:
				method3984(state);
				return;
			case 835:
				method16503(state);
				return;
			case 864:
				method7677(state);
				return;
			case 458:
				Statics.method12749(state);
				return;
			case 262:
				method3569(state);
				return;
			case 337:
				method236(state);
				return;
			case 329:
				Statics.method8091(state);
				return;
			case 766:
				method2885(state);
				return;
			case 570:
				class500.method8349(state);
				return;
			case 725:
				method2890(state);
				return;
			case 351:
				method3843(state);
				return;
			case 1033:
				method8274(state);
				return;
			case 837:
				method7857(state);
				return;
			case 509:
				method2614(state);
				return;
			case 686:
				method3445(state);
				return;
			case 139:
				Statics.method4555(state);
				return;
			case 21:
				method12998(state);
				return;
			case 176:
				method7570(state);
				return;
			case 507:
				method1887(state);
				return;
			case 754:
				method14059(state);
				return;
			case 993:
				method5965(state);
				return;
			case 484:
				Statics.method14199(state);
				return;
			case 598:
				method14119(state);
				return;
			case 362:
				Statics.method14037(state);
				return;
			case 966:
				method2849(state);
				return;
			case 460:
				method6357(state);
				return;
			case 505:
				method8139(state);
				return;
			case 679:
				method5589(state);
				return;
			case 284:
				method5591(state);
				return;
			case 133:
				method6885(state);
				return;
			case 493:
				Statics.method3922(state);
				return;
			case 153:
				Statics.method4793(state);
				return;
			case 236:
				Statics.method7053(state);
				return;
			case 709:
				method2865(state);
				return;
			case 883:
				method1771(state);
				return;
			case 171:
				method12071(state);
				return;
			case 751:
				method8727(state);
				return;
			case 311:
				method11403(state);
				return;
			case 613:
				method7392(state);
				return;
			case 69:
				method14741(state);
				return;
			case 514:
				Statics.method3532(state);
				return;
			case 515:
				method6338(state);
				return;
			case 36:
				method4595(state);
				return;
			case 814:
				method1325(state);
				return;
			case 222:
				method3082(state);
				return;
			case 543:
				method12451(state);
				return;
			case 958:
				method13881(state);
				return;
			case 624:
				method7283(state);
				return;
			case 501:
				method8630(state);
				return;
			case 302:
				method3951(state);
				return;
			case 4:
				method4112(state);
				return;
			case 563:
				method6584(state);
				return;
			case 888:
				method6884(state);
				return;
			case 532:
				method3985(state);
				return;
			case 152:
				Statics.method12347(state);
				return;
			case 541:
				method3462(state);
				return;
			case 373:
				method12758(state);
				return;
			case 881:
				Statics.method3945(state);
				return;
			case 656:
				method4772(state);
				return;
			case 973:
				method11637(state);
				return;
			case 286:
				method6347(state);
				return;
			case 100:
				method5711(state);
				return;
			case 261:
				method4607(state);
				return;
			case 201:
				method4735(state);
				return;
			case 983:
				method5593(state);
				return;
			case 1013:
				method4564(state);
				return;
			case 785:
				method3205(state);
				return;
			case 776:
				method7982(state);
				return;
			case 207:
				method12211(state);
				return;
			case 577:
				method2496(state);
				return;
			case 925:
				method6641(state);
				return;
			case 238:
				method3654(state);
				return;
			case 558:
				method4672(state);
				return;
			case 234:
				method4723(state);
				return;
			case 16:
				pop_string_discard(state);
				return;
			case 869:
				method4787(state);
				return;
			case 775:
				method5929(state);
				return;
			case 661:
				method2424(state);
				return;
			case 105:
				Statics.method4795(state);
				return;
			case 569:
				method12223(state);
				return;
			case 190:
				method3579(state);
				return;
			case 177:
				method8543(state);
				return;
			case 913:
				method7833(state);
				return;
			case 560:
				method15784(state);
				return;
			case 648:
				method6336(state);
				return;
			case 126:
				method6072(state);
				return;
			case 789:
				method4720(state);
				return;
			case 508:
				method1359(state);
				return;
			case 836:
				method4805(state);
				return;
			case 442:
				method15149(state);
				return;
			case 255:
				method12224(state);
				return;
			case 762:
				method4105(state);
				return;
			case 897:
				method1606(state);
				return;
			case 83:
				method2539(state);
				return;
			case 844:
				method1357(state);
				return;
			case 23:
				method3671(state);
				return;
			case 482:
				method3597(state);
				return;
			case 399:
				method7373(state);
				return;
			case 305:
				method12718(state);
				return;
			case 808:
				method2918(state);
				return;
			case 922:
				method8302(state);
				return;
			case 516:
				Statics.method1821(state);
				return;
			case 209:
				method3625(state);
				return;
			case 196:
				method5924(state);
				return;
			case 992:
				method1667(state);
				return;
			case 890:
				method6344(state);
				return;
			case 494:
				method8346(state);
				return;
			case 991:
				method7909(state);
				return;
			case 15:
				method5572(state);
				return;
			case 747:
				method14994(state);
				return;
			case 786:
				method8719(state);
				return;
			case 763:
				method4717(state);
				return;
			case 62:
				method6880(state);
				return;
			case 103:
				method2870(state);
				return;
			default:
				throw new RuntimeException();
		}
	}

	@ObfuscatedName("em.v(Lrn;S)V")
	public static final void push_constant_int(ClientScriptState state) {
		state.intStack[++state.isp - 1] = state.intOperands[state.pc];
	}

	@ObfuscatedName("nd.k(Lrn;I)V")
	public static final void method7064(ClientScriptState state) {
		int var1 = state.intOperands[state.pc];
		state.intStack[++state.isp - 1] = Statics.field2669.field661[var1];
	}

	@ObfuscatedName("adl.h(Lrn;B)V")
	public static final void method15179(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		Statics.field2669.method1642(var1, arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("fn.r(Lrn;I)V")
	public static final void push_constant_string(ClientScriptState state) {
		state.objectStack[++state.osp - 1] = state.script.objectOperands[state.pc];
	}

	@ObfuscatedName("tl.g(Lrn;I)V")
	public static final void branch(ClientScriptState state) {
		state.pc += state.intOperands[state.pc];
	}

	@ObfuscatedName("on.e(Lrn;I)V")
	public static final void branch_equals(ClientScriptState state) {
		state.isp -= 2;
		if (state.intStack[state.isp] == state.intStack[state.isp + 1]) {
			state.pc += state.intOperands[state.pc];
		}
	}

	@ObfuscatedName("ar.ay(Lrn;B)V")
	public static final void branch_less_than(ClientScriptState state) {
		state.isp -= 2;
		if (state.intStack[state.isp] < state.intStack[state.isp + 1]) {
			state.pc += state.intOperands[state.pc];
		}
	}

	@ObfuscatedName("ai.af(Lrn;I)V")
	public static final void branch_greater_than(ClientScriptState state) {
		state.isp -= 2;
		if (state.intStack[state.isp] > state.intStack[state.isp + 1]) {
			state.pc += state.intOperands[state.pc];
		}
	}

	@ObfuscatedName("adg.ar(Lrn;S)V")
	public static final void method15137(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		arg0.intStack[++arg0.isp - 1] = ((class902) arg0.activeEntity).field10055.method2373(var1);
	}

	@ObfuscatedName("aju.an(Lrn;I)V")
	public static final void method16789(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		arg0.intStack[++arg0.isp - 1] = ((class902) arg0.activeEntity).field10055.method2375(var1);
	}

	@ObfuscatedName("wz.ap(Lrn;B)V")
	public static final void method12679(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		arg0.intStack[++arg0.isp - 1] = ((class903) arg0.activeEntity).field10078.method2416(var1);
	}

	@ObfuscatedName("aed.ag(Lrn;I)V")
	public static final void method15676(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		arg0.intStack[++arg0.isp - 1] = ((class903) arg0.activeEntity).field10078.method2417(var1);
	}

	@ObfuscatedName("em.ai(Lrn;I)V")
	public static final void method3462(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		arg0.intStack[++arg0.isp - 1] = Statics.field2669.method1646(var1);
	}

	@ObfuscatedName("pa.al(Lrn;I)V")
	public static final void method7741(ClientScriptState arg0) {
		arg0.isp -= 2;
		if (arg0.intStack[arg0.isp] <= arg0.intStack[arg0.isp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("sq.at(Lrn;I)V")
	public static final void method11242(ClientScriptState arg0) {
		arg0.isp -= 2;
		if (arg0.intStack[arg0.isp] >= arg0.intStack[arg0.isp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("li.ax(Lrn;I)V")
	public static final void push_int_local(ClientScriptState state) {
		state.intStack[++state.isp - 1] = state.intLocals[state.intOperands[state.pc]];
	}

	@ObfuscatedName("ow.aw(Lrn;B)V")
	public static final void pop_int_local(ClientScriptState state) {
		state.intLocals[state.intOperands[state.pc]] = state.intStack[--state.isp];
	}

	@ObfuscatedName("sm.aa(Lrn;I)V")
	public static final void method11183(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = arg0.objectLocals[arg0.intOperands[arg0.pc]];
	}

	@ObfuscatedName("cy.am(Lrn;B)V")
	public static final void method2582(ClientScriptState arg0) {
		arg0.objectLocals[arg0.intOperands[arg0.pc]] = arg0.objectStack[--arg0.osp];
	}

	@ObfuscatedName("aj.az(Lrn;I)V")
	public static final void pop_int_discard(ClientScriptState state) {
		state.isp--;
	}

	@ObfuscatedName("aac.ak(Lrn;I)V")
	public static final void pop_string_discard(ClientScriptState state) {
		state.osp--;
	}

	@ObfuscatedName("jj.av(Lrn;B)V")
	public static final void gosub_with_params(ClientScriptState state) {
		int scriptId = state.intOperands[state.pc];
		ClientScript script = ClientScriptHelpers.getScript(scriptId);
		if (script == null) {
			throw new RuntimeException();
		}
		if (debugScript) {
			// custom!
			System.out.println("Calling script: " + scriptId);
		}
		int[] intLocals = new int[script.intLocalCount];
		Object[] objectLocals = new Object[script.objectLocalCount];
		long[] longLocals = new long[script.longLocalCount];
		for (int i = 0; i < script.intArgCount; i++) {
			intLocals[i] = state.intStack[state.isp - script.intArgCount + i];
		}
		for (int i = 0; i < script.objectArgCount; i++) {
			objectLocals[i] = state.objectStack[state.osp - script.objectArgCount + i];
		}
		for (int i = 0; i < script.longArgCount; i++) {
			longLocals[i] = state.longStack[state.lsp - script.longArgCount + i];
		}
		state.isp -= script.intArgCount;
		state.osp -= script.objectArgCount;
		state.lsp -= script.longArgCount;
		ScriptFrame frame = new ScriptFrame();
		frame.script = state.script;
		frame.pc = state.pc;
		frame.intLocals = state.intLocals;
		frame.objectLocals = state.objectLocals;
		frame.longLocals = state.longLocals;
		if (state.fp >= state.frames.length) {
			throw new RuntimeException();
		}
		state.frames[++state.fp - 1] = frame;
		state.script = script;
		state.instructions = state.script.instructions;
		state.intOperands = state.script.intOperands;
		state.pc = -1;
		state.intLocals = intLocals;
		state.objectLocals = objectLocals;
		state.longLocals = longLocals;
	}

	@ObfuscatedName("oz.aj(Lrn;B)V")
	public static final void method7570(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field6666[arg0.intOperands[arg0.pc]];
	}

	@ObfuscatedName("qv.ah(Lrn;I)V")
	public static final void method8300(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		Statics.field6666[var1] = arg0.intStack[--arg0.isp];
		class943.method5553(var1);
		client.field9156 |= Statics.field2210[var1];
	}

	@ObfuscatedName("oc.au(Lrn;I)V")
	public static final void method7378(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc] >> 16;
		int var2 = arg0.intOperands[arg0.pc] & 0xFFFF;
		int var3 = arg0.intStack[--arg0.isp];
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
		int var1 = arg0.intOperands[arg0.pc];
		int var2 = arg0.intStack[--arg0.isp];
		if (var2 < 0 || var2 >= arg0.field5237[var1]) {
			throw new RuntimeException();
		}
		arg0.intStack[++arg0.isp - 1] = arg0.field5224[var1][var2];
	}

	@ObfuscatedName("gf.ac(Lrn;B)V")
	public static final void method4001(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		if (var2 < 0 || var2 >= arg0.field5237[var1]) {
			throw new RuntimeException();
		}
		arg0.field5224[var1][var2] = arg0.intStack[arg0.isp + 1];
	}

	@ObfuscatedName("li.aq(Lrn;B)V")
	public static final void method5589(ClientScriptState arg0) {
		String var1 = Statics.field3498[arg0.intOperands[arg0.pc]];
		if (var1 == null) {
			var1 = "";
		}
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("am.ab(Lrn;I)V")
	public static final void method1908(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		Statics.field3498[var1] = (String) arg0.objectStack[--arg0.osp];
		class943.method12064(var1);
	}

	@ObfuscatedName("lv.bv(Lrn;I)V")
	public static final void method5619(ClientScriptState arg0) {
		arg0.lsp--;
	}

	@ObfuscatedName("aaj.bj(Lrn;B)V")
	public static final void method14132(ClientScriptState arg0) {
		arg0.longStack[++arg0.lsp - 1] = arg0.longLocals[arg0.intOperands[arg0.pc]];
	}

	@ObfuscatedName("client.bf(Lrn;I)V")
	public static final void method14716(ClientScriptState arg0) {
		arg0.longLocals[arg0.intOperands[arg0.pc]] = arg0.longStack[--arg0.lsp];
	}

	@ObfuscatedName("ql.bt(Lrn;I)V")
	public static final void method8141(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] != arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("iu.bl(Lrn;I)V")
	public static final void method4672(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] < arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("ct.bk(Lrn;I)V")
	public static final void method2541(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] > arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("afn.bs(Lrn;B)V")
	public static final void method15803(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] <= arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("am.bn(Lrn;I)V")
	public static final void method1904(ClientScriptState arg0) {
		arg0.lsp -= 2;
		if (arg0.longStack[arg0.lsp] >= arg0.longStack[arg0.lsp + 1]) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("lp.ba(Lrn;S)V")
	public static final void method6028(ClientScriptState arg0) {
		if (arg0.intStack[--arg0.isp] == 1) {
			arg0.pc += arg0.intOperands[arg0.pc];
		}
	}

	@ObfuscatedName("iy.bc(Lrn;I)V")
	public static final void method4695(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		Integer var2 = (Integer) Statics.field5051[var1];
		if (var2 != null) {
			arg0.intStack[++arg0.isp - 1] = var2;
			return;
		}
		class627 var3 = Statics.field7390.method12669(var1);
		if (var3.field7350 == 'i' || var3.field7350 == '1') {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = -1;
		}
	}

	@ObfuscatedName("lp.br(Lrn;I)V")
	public static final void method6021(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		class627 var2 = Statics.field7390.method12669(var1);
		if (var2.field7350 != 1) {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
		Integer var3 = (Integer) Statics.field5051[var2.field7352];
		if (var3 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			int var4 = var2.field7349 == 31 ? -1 : (0x1 << var2.field7349 + 1) - 1;
			arg0.intStack[++arg0.isp - 1] = (var3 & var4) >>> var2.field7351;
		}
	}

	@ObfuscatedName("kj.bp(Lrn;I)V")
	public static final void method5543(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		Long var2 = (Long) Statics.field5051[var1];
		if (var2 == null) {
			arg0.longStack[++arg0.lsp - 1] = -1L;
		} else {
			arg0.longStack[++arg0.lsp - 1] = var2;
		}
	}

	@ObfuscatedName("ps.bi(Lrn;I)V")
	public static final void method7771(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		String var2 = (String) Statics.field5051[var1];
		if (var2 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2;
		}
	}

	@ObfuscatedName("fd.bx(Lrn;I)V")
	public static final void method3507(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
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
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("ez.bb(Lrn;I)V")
	public static final void method3061(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		Long var2 = arg0.field5226.method4045(client.field9163.field6408 << 16 | var1);
		long var3;
		if (var2 == null) {
			var3 = -1L;
		} else {
			var3 = var2;
		}
		arg0.longStack[++arg0.lsp - 1] = var3;
	}

	@ObfuscatedName("qg.be(Lrn;I)V")
	public static final void method8408(ClientScriptState arg0) {
		int var1 = arg0.intOperands[arg0.pc];
		String var2 = arg0.field5226.method4071(client.field9163.field6408 << 16 | var1);
		String var3;
		if (var2 == null) {
			var3 = "";
		} else {
			var3 = var2;
		}
		arg0.objectStack[++arg0.osp - 1] = var3;
	}

	@ObfuscatedName("cv.bw(Lrn;B)V")
	public static final void method2428(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		class165.method11381(var1);
		cc_create_inner(Statics.interfaces[var1 >>> 16], var1 & 0xFFFF, var2, var3, arg0.secondary, arg0);
	}

	@ObfuscatedName("q.bo(Lrn;I)V")
	public static final void method1398(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		if (var1.com.id != -1) {
			class165 var2 = var1.method11061();
			var2.subcomponents[var1.com.id] = null;
			client.requestRedrawComponent(var2);
		} else if (arg0.secondary) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("afl.bh(Lrn;I)V")
	public static final void method15825(ClientScriptState arg0) {
		class165 var1 = class165.method11381(arg0.intStack[--arg0.isp]);
		var1.subcomponents = null;
		var1.sortedsubcomponents = null;
		client.requestRedrawComponent(var1);
	}

	@ObfuscatedName("ge.by(Lrn;I)V")
	public static final void method3985(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class504 var3;
		if (arg0.secondary) {
			var3 = arg0.activeComponent2;
		} else {
			var3 = arg0.activeComponent;
		}
		arg0.intStack[++arg0.isp - 1] = var2 != -1 && var3.method11062(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("ns.bu(Lrn;I)V")
	public static final void method6972(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class504 var2;
		if (arg0.secondary) {
			var2 = arg0.activeComponent2;
		} else {
			var2 = arg0.activeComponent;
		}
		arg0.intStack[++arg0.isp - 1] = var2.method11062(var1, -1) ? 1 : 0;
	}

	@ObfuscatedName("af.cq(ZLrn;I)V")
	public static final void method1684(boolean arg0, ClientScriptState arg1) {
		class504 var2 = arg1.secondary ? arg1.activeComponent2 : arg1.activeComponent;
		class165 var3 = var2.com;
		class164 var4 = var2.itf;
		if (arg0) {
			method2840(var4, var3);
		} else {
			method15937(var4, var3);
		}
	}

	@ObfuscatedName("ae.co(Lrn;B)V")
	public static final void method1964(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		Statics.method3983(var2, arg0);
	}

	@ObfuscatedName("gm.cb(Lrn;I)V")
	public static final void method3970(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		Statics.method3983(var2, arg0);
	}

	@ObfuscatedName("ga.cw(Lrn;B)V")
	public static final void method4101(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Statics.field2119.field10044 == null) {
			return;
		}
		for (int var3 = 0; var3 < class204.field2295.length; var3++) {
			if (class204.field2295[var3] == var1) {
				Statics.field2119.field10044.method8231(var3, var2, Statics.field7650);
				return;
			}
		}
		for (int var4 = 0; var4 < class204.field2289.length; var4++) {
			if (class204.field2289[var4] == var1) {
				Statics.field2119.field10044.method8231(var4, var2, Statics.field7650);
				return;
			}
		}
	}

	@ObfuscatedName("ql.cx(Lrn;B)V")
	public static final void method8138(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Statics.field2119.field10044 != null) {
			Statics.field2119.field10044.method8260(var1, var2);
		}
	}

	@ObfuscatedName("is.cn(Lrn;I)V")
	public static final void method4632(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] != 0;
		if (Statics.field2119.field10044 != null) {
			Statics.field2119.field10044.method8233(var1);
		}
	}

	@ObfuscatedName("fk.cf(Lrn;B)V")
	public static final void method3631(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Statics.field2119.field10044 != null) {
			Statics.field2119.field10044.method8234(var1, var2, Statics.field3492);
		}
	}

	@ObfuscatedName("mn.cs(Lew;Lej;Lrn;I)V")
	public static final void method6334(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 4;
		arg0.field1772 = arg2.intStack[arg2.isp];
		arg0.field1774 = arg2.intStack[arg2.isp + 1];
		int var3 = arg2.intStack[arg2.isp + 2];
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 5) {
			var3 = 5;
		}
		int var4 = arg2.intStack[arg2.isp + 3];
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 5) {
			var4 = 5;
		}
		arg0.field1829 = (byte) var3;
		arg0.field1769 = (byte) var4;
		client.requestRedrawComponent(arg0);
		client.method3293(arg1, arg0);
		if (arg0.type == 0) {
			client.method12722(arg1, arg0, false);
		}
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method7185(arg0.parentLayer);
		}
	}

	@ObfuscatedName("md.cr(Lrn;I)V")
	public static final void method6580(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6334(var2, var3, arg0);
	}

	@ObfuscatedName("nf.cp(Lrn;I)V")
	public static final void method6641(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method6334(var2, var3, arg0);
	}

	@ObfuscatedName("ki.ci(Lew;Lej;Lrn;I)V")
	public static final void method5023(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 4;
		arg0.field1910 = arg2.intStack[arg2.isp];
		arg0.field1775 = arg2.intStack[arg2.isp + 1];
		arg0.field1819 = 0;
		arg0.field1895 = 0;
		int var3 = arg2.intStack[arg2.isp + 2];
		if (var3 < 0) {
			var3 = 0;
		} else if (var3 > 4) {
			var3 = 4;
		}
		int var4 = arg2.intStack[arg2.isp + 3];
		if (var4 < 0) {
			var4 = 0;
		} else if (var4 > 4) {
			var4 = 4;
		}
		arg0.field1856 = (byte) var3;
		arg0.field1771 = (byte) var4;
		client.requestRedrawComponent(arg0);
		client.method3293(arg1, arg0);
		if (arg0.type == 0) {
			client.method12722(arg1, arg0, false);
		}
	}

	@ObfuscatedName("ci.ca(Lrn;B)V")
	public static final void method2386(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method5023(var2, var3, arg0);
	}

	@ObfuscatedName("tz.ch(Lrn;B)V")
	public static final void method11489(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method5023(var2, var3, arg0);
	}

	@ObfuscatedName("jh.cv(Lew;Lej;Lrn;I)V")
	public static final void method4788(class165 arg0, class164 arg1, ClientScriptState arg2) {
		boolean var3 = arg2.intStack[--arg2.isp] == 1;
		if (arg0.field1807 != var3) {
			arg0.field1807 = var3;
			client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method3097(arg0.parentLayer);
		}
	}

	@ObfuscatedName("wx.ck(Lrn;I)V")
	public static final void method12651(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method4788(var2, var3, arg0);
	}

	@ObfuscatedName("sp.cd(Lrn;I)V")
	public static final void method11256(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method4788(var2, var3, arg0);
	}

	@ObfuscatedName("oc.ce(Lew;Lej;Lrn;B)V")
	public static final void method7379(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.field1923 = arg2.intStack[arg2.isp];
		arg0.field1781 = arg2.intStack[arg2.isp + 1];
		client.requestRedrawComponent(arg0);
		client.method3293(arg1, arg0);
		if (arg0.type == 0) {
			client.method12722(arg1, arg0, false);
		}
	}

	@ObfuscatedName("ki.ct(Lrn;I)V")
	public static final void method5024(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7379(var2, var3, arg0);
	}

	@ObfuscatedName("em.cu(Lrn;I)V")
	public static final void method3466(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7379(var2, var3, arg0);
	}

	@ObfuscatedName("n.cc(Lew;Lej;Lrn;I)V")
	public static final void method1381(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1787 = arg2.intStack[--arg2.isp] == 1;
	}

	@ObfuscatedName("b.cg(Lrn;S)V")
	public static final void method1590(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1381(var2, var3, arg0);
	}

	@ObfuscatedName("aav.cj(Lrn;I)V")
	public static final void method14120(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1381(var2, var3, arg0);
	}

	@ObfuscatedName("nv.cy(Lew;Lej;Lrn;B)V")
	public static final void method6792(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.field1857 = arg2.intStack[arg2.isp];
		if (arg0.field1857 > arg0.field1790 - arg0.field1863) {
			arg0.field1857 = arg0.field1790 - arg0.field1863;
		}
		if (arg0.field1857 < 0) {
			arg0.field1857 = 0;
		}
		arg0.field1739 = arg2.intStack[arg2.isp + 1];
		if (arg0.field1739 > arg0.field1894 - arg0.field1929) {
			arg0.field1739 = arg0.field1894 - arg0.field1929;
		}
		if (arg0.field1739 < 0) {
			arg0.field1739 = 0;
		}
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method15881(arg0.parentLayer);
		}
	}

	@ObfuscatedName("lp.cz(Lrn;I)V")
	public static final void method6027(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6792(var2, var3, arg0);
	}

	@ObfuscatedName("cd.dl(Lrn;I)V")
	public static final void method2495(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method6792(var2, var3, arg0);
	}

	@ObfuscatedName("pf.dj(Lew;Lej;Lrn;I)V")
	public static final void method7912(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1792 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method15629(arg0.parentLayer);
		}
	}

	@ObfuscatedName("lg.dw(Lrn;I)V")
	public static final void method5808(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7912(var2, var3, arg0);
	}

	@ObfuscatedName("abm.dg(Lrn;B)V")
	public static final void method14210(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method15567(var2, var3, arg0);
	}

	@ObfuscatedName("aju.do(Lrn;B)V")
	public static final void method16790(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method15567(var2, var3, arg0);
	}

	@ObfuscatedName("ez.db(Lew;Lej;Lrn;B)V")
	public static final void method3060(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1794 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("gk.dx(Lrn;B)V")
	public static final void method3951(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3060(var2, var3, arg0);
	}

	@ObfuscatedName("li.de(Lew;Lej;Lrn;I)V")
	public static final void method5590(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1791 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("dv.dk(Lrn;I)V")
	public static final void method2846(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method5590(var2, var3, arg0);
	}

	@ObfuscatedName("cy.du(Lrn;S)V")
	public static final void method2583(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method5590(var2, var3, arg0);
	}

	@ObfuscatedName("ck.dz(Lew;Lej;Lrn;B)V")
	public static final void method2475(class165 arg0, class164 arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		if (arg0.field1797 != var3) {
			arg0.field1797 = var3;
			client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method15683(arg0.parentLayer);
		}
	}

	@ObfuscatedName("agp.ds(Lrn;I)V")
	public static final void method15949(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method2475(var2, var3, arg0);
	}

	@ObfuscatedName("qy.dc(Lrn;I)V")
	public static final void method8346(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method2475(var2, var3, arg0);
	}

	@ObfuscatedName("q.dy(Lew;Lej;Lrn;B)V")
	public static final void method1400(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1783 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("dd.dt(Lrn;I)V")
	public static final void method2810(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1400(var2, var3, arg0);
	}

	@ObfuscatedName("nk.dd(Lrn;B)V")
	public static final void method6847(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1400(var2, var3, arg0);
	}

	@ObfuscatedName("mv.da(Lew;Lej;Lrn;I)V")
	public static final void method6308(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1799 = arg2.intStack[--arg2.isp] == 1;
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("gf.dr(Lrn;B)V")
	public static final void method4002(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6308(var2, var3, arg0);
	}

	@ObfuscatedName("p.dv(Lew;Lej;Lrn;I)V")
	public static final void method1412(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1806 = 1;
		arg0.field1838 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			Statics.method4107(arg0.parentLayer);
		}
	}

	@ObfuscatedName("fz.dn(Lrn;I)V")
	public static final void method3660(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1412(var2, var3, arg0);
	}

	@ObfuscatedName("al.dm(Lrn;B)V")
	public static final void method1815(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1412(var2, var3, arg0);
	}

	@ObfuscatedName("acp.dq(Lew;Lej;Lrn;I)V")
	public static final void method14729(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 6;
		arg0.field1810 = arg2.intStack[arg2.isp];
		arg0.field1824 = arg2.intStack[arg2.isp + 1];
		arg0.field1812 = arg2.intStack[arg2.isp + 2];
		arg0.field1813 = arg2.intStack[arg2.isp + 3];
		arg0.field1814 = arg2.intStack[arg2.isp + 4];
		arg0.field1818 = arg2.intStack[arg2.isp + 5];
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method8721(arg0.parentLayer);
			class943.method12329(arg0.parentLayer);
		}
	}

	@ObfuscatedName("n.et(Lrn;S)V")
	public static final void method1374(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method14729(var2, var3, arg0);
	}

	@ObfuscatedName("et.eu(Lrn;I)V")
	public static final void method2924(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method14729(var2, var3, arg0);
	}

	@ObfuscatedName("ra.eg(Lew;Lej;Lrn;I)V")
	public static final void method829(class165 arg0, class164 arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		if (arg0.field1747 != var3) {
			if (var3 == -1) {
				arg0.field1789 = null;
			} else {
				if (arg0.field1789 == null) {
					arg0.field1789 = new class873();
				}
				arg0.field1789.method11769(var3);
			}
			arg0.field1747 = var3;
			client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method7890(arg0.parentLayer);
		}
	}

	@ObfuscatedName("ady.ev(Lrn;I)V")
	public static final void method15216(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method829(var2, var3, arg0);
	}

	@ObfuscatedName("cy.er(Lrn;I)V")
	public static final void method2584(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method829(var2, var3, arg0);
	}

	@ObfuscatedName("ee.eq(Lew;Lej;Lrn;B)V")
	public static final void method3098(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1821 = arg2.intStack[--arg2.isp] == 1;
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("mz.en(Lrn;I)V")
	public static final void method6347(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3098(var2, var3, arg0);
	}

	@ObfuscatedName("abh.ez(Lrn;I)V")
	public static final void method14217(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3098(var2, var3, arg0);
	}

	@ObfuscatedName("ga.eh(Lew;Lej;Lrn;I)V")
	public static final void method4103(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 4;
		arg0.field1828 = arg2.intStack[arg2.isp];
		arg0.field1809 = arg2.intStack[arg2.isp + 1];
		arg0.field1830 = arg2.intStack[arg2.isp + 2];
		arg0.field1831 = arg2.intStack[arg2.isp + 3];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("po.ed(Lrn;I)V")
	public static final void method7812(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method4103(var2, var3, arg0);
	}

	@ObfuscatedName("qq.es(Lew;Lej;Lrn;I)V")
	public static final void method8067(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (!var3.equals(arg0.field1825)) {
			arg0.field1825 = var3;
			client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method3929(arg0.parentLayer);
		}
	}

	@ObfuscatedName("cd.ej(Lrn;B)V")
	public static final void method2489(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method8067(var2, var3, arg0);
	}

	@ObfuscatedName("pw.ew(Lrn;I)V")
	public static final void method7858(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method8067(var2, var3, arg0);
	}

	@ObfuscatedName("ge.el(Lew;Lej;Lrn;B)V")
	public static final void method3981(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1793 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method11667(arg0.parentLayer);
		}
	}

	@ObfuscatedName("qo.ei(Lrn;I)V")
	public static final void method8080(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3981(var2, var3, arg0);
	}

	@ObfuscatedName("ga.eo(Lrn;S)V")
	public static final void method4102(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3981(var2, var3, arg0);
	}

	@ObfuscatedName("qz.ef(Lew;Lej;Lrn;I)V")
	public static final void method8269(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 3;
		arg0.field1836 = arg2.intStack[arg2.isp];
		arg0.field1837 = arg2.intStack[arg2.isp + 1];
		arg0.field1835 = arg2.intStack[arg2.isp + 2];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("pb.ex(Lrn;I)V")
	public static final void method7833(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method8269(var2, var3, arg0);
	}

	@ObfuscatedName("io.eb(Lrn;I)V")
	public static final void method4598(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method8269(var2, var3, arg0);
	}

	@ObfuscatedName("em.ec(Lew;Lej;Lrn;I)V")
	public static final void method3463(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1901 = arg2.intStack[--arg2.isp] == 1;
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("jv.em(Lrn;I)V")
	public static final void method4720(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3463(var2, var3, arg0);
	}

	@ObfuscatedName("ae.ey(Lew;Lej;Lrn;B)V")
	public static final void method1965(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1860 = arg2.intStack[--arg2.isp] == 1;
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method1382(arg0.parentLayer);
		}
	}

	@ObfuscatedName("dz.ek(Lrn;I)V")
	public static final void method2716(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1965(var2, var3, arg0);
	}

	@ObfuscatedName("da.ep(Lrn;B)V")
	public static final void method2814(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1965(var2, var3, arg0);
	}

	@ObfuscatedName("fg.fd(Lew;Lej;Lrn;I)V")
	public static final void method3641(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1800 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("pj.fr(Lrn;I)V")
	public static final void method7892(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3641(var2, var3, arg0);
	}

	@ObfuscatedName("ck.fa(Lrn;I)V")
	public static final void method2469(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3641(var2, var3, arg0);
	}

	@ObfuscatedName("dc.fc(Lew;Lej;Lrn;I)V")
	public static final void method2787(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1801 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("et.fn(Lew;Lej;Lrn;I)V")
	public static final void method2916(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1770 = arg2.intStack[--arg2.isp] == 1;
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("ed.fl(Lrn;I)V")
	public static final void method3080(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method2916(var2, var3, arg0);
	}

	@ObfuscatedName("aaf.ff(Lrn;I)V")
	public static final void method14059(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method2916(var2, var3, arg0);
	}

	@ObfuscatedName("g.fx(Lew;Lej;Lrn;I)V")
	public static final void method1626(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1803 = arg2.intStack[--arg2.isp] == 1;
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("kk.fj(Lrn;B)V")
	public static final void method5566(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1626(var2, var3, arg0);
	}

	@ObfuscatedName("oz.fo(Lew;Lej;Lrn;B)V")
	public static final void method7574(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.field1790 = arg2.intStack[arg2.isp];
		arg0.field1894 = arg2.intStack[arg2.isp + 1];
		client.requestRedrawComponent(arg0);
		if (arg0.type == 0) {
			client.method12722(arg1, arg0, false);
		}
	}

	@ObfuscatedName("lk.fm(Lrn;I)V")
	public static final void method5573(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7574(var2, var3, arg0);
	}

	@ObfuscatedName("rr.fk(Lrn;B)V")
	public static final void method11075(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7574(var2, var3, arg0);
	}

	@ObfuscatedName("vi.fu(Lrn;I)V")
	public static final void method12384(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method12994(var2, var3, arg0);
	}

	@ObfuscatedName("pe.fh(Lrn;I)V")
	public static final void method7686(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method12994(var2, var3, arg0);
	}

	@ObfuscatedName("dl.fz(Lew;Lej;Lrn;B)V")
	public static final void method2604(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1818 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method8721(arg0.parentLayer);
		}
	}

	@ObfuscatedName("nt.fi(Lrn;I)V")
	public static final void method6649(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method2604(var2, var3, arg0);
	}

	@ObfuscatedName("rk.fw(Lew;Lej;Lrn;I)V")
	public static final void method8485(class165 arg0, class164 arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		arg0.field1796 = var3 == 1;
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("cj.fs(Lrn;I)V")
	public static final void method2574(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method8485(var2, var3, arg0);
	}

	@ObfuscatedName("aai.fq(Lew;Lej;Lrn;I)V")
	public static final void method14086(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.field1811 = arg2.intStack[arg2.isp];
		arg0.field1916 = arg2.intStack[arg2.isp + 1];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("p.ft(Lrn;B)V")
	public static final void method1413(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method14086(var2, var3, arg0);
	}

	@ObfuscatedName("iy.gw(Lrn;I)V")
	public static final void method4696(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method14086(var2, var3, arg0);
	}

	@ObfuscatedName("y.gn(Lew;Lej;Lrn;S)V")
	public static final void method1637(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1839 = arg2.intStack[--arg2.isp];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("fh.gp(Lrn;I)V")
	public static final void method3654(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1637(var2, var3, arg0);
	}

	@ObfuscatedName("ev.gq(Lrn;B)V")
	public static final void method2986(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1637(var2, var3, arg0);
	}

	@ObfuscatedName("ack.gk(Lrn;I)V")
	public static final void method14904(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method7967(var2, var3, arg0);
	}

	@ObfuscatedName("tj.gm(Lew;Lej;Lrn;I)V")
	public static final void method11850(class165 arg0, class164 arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		String var4 = (String) arg2.objectStack[--arg2.osp];
		class613 var5 = Statics.field4464.method12600(var3);
		if (var5.field7288.equals(var4)) {
			arg0.method3129(var3);
		} else {
			arg0.method3128(var3, var4);
		}
	}

	@ObfuscatedName("sj.gh(Lrn;I)V")
	public static final void method11309(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method11850(var2, var3, arg0);
	}

	@ObfuscatedName("w.ge(Lrn;B)V")
	public static final void method1559(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method11850(var2, var3, arg0);
	}

	@ObfuscatedName("sc.gr(Lew;Lej;Lrn;I)V")
	public static final void method11259(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 3;
		int var3 = arg2.intStack[arg2.isp];
		short var4 = (short) arg2.intStack[arg2.isp + 1];
		short var5 = (short) arg2.intStack[arg2.isp + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.method3158(var3, var4, var5);
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method1981(arg0.parentLayer, var3);
		}
	}

	@ObfuscatedName("jc.gf(Lrn;I)V")
	public static final void method4737(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method11259(var2, var3, arg0);
	}

	@ObfuscatedName("jr.gl(Lrn;I)V")
	public static final void method4779(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method11259(var2, var3, arg0);
	}

	@ObfuscatedName("rk.gb(Lew;Lej;Lrn;B)V")
	public static final void method8481(class165 arg0, class164 arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		if (arg0.field1737 != var3) {
			arg0.field1737 = var3;
			client.requestRedrawComponent(arg0);
		}
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method5601(arg0.parentLayer);
		}
	}

	@ObfuscatedName("sg.go(Lew;Lej;Lrn;I)V")
	public static final void method11368(class165 arg0, class164 arg1, ClientScriptState arg2) {
		if (arg0.type == 5) {
			method8481(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("nx.gi(Lrn;I)V")
	public static final void method6827(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method11368(var2, var3, arg0);
	}

	@ObfuscatedName("js.ga(Lrn;I)V")
	public static final void method4803(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method11368(var2, var3, arg0);
	}

	@ObfuscatedName("tb.gd(Lrn;I)V")
	public static final void method11397(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method7179(var2, var3, arg0);
	}

	@ObfuscatedName("qi.gj(Lrn;I)V")
	public static final void method8045(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method7179(var2, var3, arg0);
	}

	@ObfuscatedName("pp.gu(Lew;Lej;Lrn;I)V")
	public static final void method7703(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 3;
		int var3 = arg2.intStack[arg2.isp];
		short var4 = (short) arg2.intStack[arg2.isp + 1];
		short var5 = (short) arg2.intStack[arg2.isp + 2];
		if (var3 < 0 || var3 >= 5) {
			return;
		}
		arg0.method3131(var3, var4, var5);
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method12693(arg0.parentLayer, var3);
		}
	}

	@ObfuscatedName("eu.gg(Lrn;B)V")
	public static final void method2927(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7703(var2, var3, arg0);
	}

	@ObfuscatedName("pg.gy(Lrn;B)V")
	public static final void method7978(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7703(var2, var3, arg0);
	}

	@ObfuscatedName("rz.gt(Lew;Lej;Lrn;I)V")
	public static final void method8656(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1833 = arg2.intStack[--arg2.isp] == 1;
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method13906(arg0.parentLayer);
		}
	}

	@ObfuscatedName("py.gx(Lrn;B)V")
	public static final void method7980(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method8656(var2, var3, arg0);
	}

	@ObfuscatedName("ul.gv(Lrn;I)V")
	public static final void method11865(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method8656(var2, var3, arg0);
	}

	@ObfuscatedName("ck.hk(Lew;Lej;Lrn;B)V")
	public static final void method2471(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1805 = arg2.intStack[--arg2.isp] == 1;
		client.requestRedrawComponent(arg0);
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method4568(arg0.parentLayer);
		}
	}

	@ObfuscatedName("jv.hy(Lrn;I)V")
	public static final void method4725(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method2471(var2, var3, arg0);
	}

	@ObfuscatedName("nb.hq(Lrn;B)V")
	public static final void method6818(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method2471(var2, var3, arg0);
	}

	@ObfuscatedName("aju.hx(Lew;Lej;Lrn;I)V")
	public static final void method16788(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1806 = 2;
		arg0.field1930 = null;
		arg0.field1838 = arg2.intStack[--arg2.isp];
		if (arg0.id == -1 && !arg1.field1734) {
			Statics.method4107(arg0.parentLayer);
		}
	}

	@ObfuscatedName("tz.hs(Lrn;I)V")
	public static final void method11490(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method16788(var2, var3, arg0);
	}

	@ObfuscatedName("pw.ha(Lrn;B)V")
	public static final void method7857(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method16788(var2, var3, arg0);
	}

	@ObfuscatedName("vu.hc(Lrn;I)V")
	public static final void method12204(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method8049(var2, var3, arg0);
	}

	@ObfuscatedName("ap.hn(Lrn;B)V")
	public static final void method1722(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method8049(var2, var3, arg0);
	}

	@ObfuscatedName("oh.hd(Lew;Lej;ZILrn;B)V")
	public static final void method7651(class165 arg0, class164 arg1, boolean arg2, int arg3, ClientScriptState arg4) {
		arg4.isp -= 2;
		int var5 = arg4.intStack[arg4.isp];
		int var6 = arg4.intStack[arg4.isp + 1];
		if (arg0.id == -1 && !arg1.field1734) {
			class943.method6563(arg0.parentLayer);
			class943.method8721(arg0.parentLayer);
			class943.method12329(arg0.parentLayer);
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
		class592 var7 = Statics.field3492.method12316(var5);
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
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7651(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("zz.hu(Lrn;I)V")
	public static final void method13880(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7651(var2, var3, false, 2, arg0);
	}

	@ObfuscatedName("fy.ht(Lrn;I)V")
	public static final void method3597(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7651(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("ar.hl(Lrn;I)V")
	public static final void method1701(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7651(var2, var3, false, 0, arg0);
	}

	@ObfuscatedName("on.hj(Lrn;I)V")
	public static final void method7180(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7651(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("s.hf(Lrn;I)V")
	public static final void method1316(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7651(var2, var3, true, 2, arg0);
	}

	@ObfuscatedName("aeb.hz(Lrn;I)V")
	public static final void method15480(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7651(var2, var3, true, 0, arg0);
	}

	@ObfuscatedName("mq.hr(Lrn;I)V")
	public static final void method6403(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7651(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("qf.hv(Lrn;I)V")
	public static final void method8228(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7651(var2, var3, false, 1, arg0);
	}

	@ObfuscatedName("iv.hg(Lrn;S)V")
	public static final void method4579(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7651(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("aw.hi(Lrn;I)V")
	public static final void method1881(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7651(var2, var3, true, 1, arg0);
	}

	@ObfuscatedName("rx.ip(Lew;Lej;Lrn;I)V")
	public static final void method8585(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1806 = 6;
		arg0.field1930 = null;
		arg0.field1838 = arg2.intStack[--arg2.isp];
		if (arg0.id == -1 && !arg1.field1734) {
			Statics.method4107(arg0.parentLayer);
		}
	}

	@ObfuscatedName("pq.ir(Lrn;B)V")
	public static final void method7718(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method8585(var2, var3, arg0);
	}

	@ObfuscatedName("dp.ie(Lrn;I)V")
	public static final void method2614(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method8585(var2, var3, arg0);
	}

	@ObfuscatedName("st.in(Lrn;B)V")
	public static final void method11155(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method6788(var2, var3, arg0);
	}

	@ObfuscatedName("rq.ih(Lrn;I)V")
	public static final void method11080(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method6788(var2, var3, arg0);
	}

	@ObfuscatedName("ph.ig(Lew;Lej;Lrn;I)V")
	public static final void method7880(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 4;
		arg0.field1906 = arg2.intStack[arg2.isp];
		arg0.field1909 = arg2.intStack[arg2.isp + 1];
		arg0.field1785 = arg2.intStack[arg2.isp + 2];
		arg0.field1911 = arg2.intStack[arg2.isp + 3];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("ao.ia(Lrn;I)V")
	public static final void method1809(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7880(var2, var3, arg0);
	}

	@ObfuscatedName("jj.iw(Lrn;I)V")
	public static final void method4775(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7880(var2, var3, arg0);
	}

	@ObfuscatedName("acg.iq(Lew;Lej;Lrn;I)V")
	public static final void method14903(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		arg0.field1907 = arg2.intStack[arg2.isp];
		arg0.field1908 = arg2.intStack[arg2.isp + 1];
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("px.ij(Lrn;I)V")
	public static final void method7722(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method14903(var2, var3, arg0);
	}

	@ObfuscatedName("iq.id(Lew;Lej;Lrn;I)V")
	public static final void method4571(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 4;
		arg0.field1838 = arg2.intStack[arg2.isp];
		arg0.field1832 = arg2.intStack[arg2.isp + 1];
		if (arg2.intStack[arg2.isp + 2] == 1) {
			arg0.field1806 = 9;
		} else {
			arg0.field1806 = 8;
		}
		if (arg2.intStack[arg2.isp + 3] == 1) {
			arg0.field1913 = true;
		} else {
			arg0.field1913 = false;
		}
		if (arg0.id == -1 && !arg1.field1734) {
			Statics.method4107(arg0.parentLayer);
		}
	}

	@ObfuscatedName("na.io(Lrn;I)V")
	public static final void method1221(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method4571(var2, var3, arg0);
	}

	@ObfuscatedName("xa.ib(Lrn;S)V")
	public static final void method236(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method4571(var2, var3, arg0);
	}

	@ObfuscatedName("ar.ix(Lew;Lej;Lrn;B)V")
	public static final void method1702(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1806 = 5;
		arg0.field1838 = client.field9071;
		arg0.field1832 = 0;
		if (arg0.id == -1 && !arg1.field1734) {
			Statics.method4107(arg0.parentLayer);
		}
	}

	@ObfuscatedName("pq.iz(Lrn;I)V")
	public static final void method7713(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1702(var2, var3, arg0);
	}

	@ObfuscatedName("pt.is(Lrn;I)V")
	public static final void method7728(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1702(var2, var3, arg0);
	}

	@ObfuscatedName("abo.im(Lew;Lej;Lrn;I)V")
	public static final void method14310(class165 arg0, class164 arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp] - 1;
		if (var3 >= 0 && var3 <= 9) {
			arg0.method3166(var3, (String) arg2.objectStack[--arg2.osp]);
		} else {
			arg2.osp--;
		}
	}

	@ObfuscatedName("eb.ik(Lrn;I)V")
	public static final void method3323(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method14310(var2, var3, arg0);
	}

	@ObfuscatedName("an.iu(Lrn;I)V")
	public static final void method1713(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method14310(var2, var3, arg0);
	}

	@ObfuscatedName("kj.ic(Lew;Lej;Lrn;I)V")
	public static final void method5544(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		int var3 = arg2.intStack[arg2.isp];
		int var4 = arg2.intStack[arg2.isp + 1];
		if (var3 == -1 && var4 == -1) {
			arg0.field1759 = null;
		} else {
			arg0.field1759 = class165.method15145(var3, var4);
		}
	}

	@ObfuscatedName("lc.iy(Lrn;I)V")
	public static final void method5965(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method5544(var2, var3, arg0);
	}

	@ObfuscatedName("qz.if(Lrn;I)V")
	public static final void method8270(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method5544(var2, var3, arg0);
	}

	@ObfuscatedName("aar.il(Lew;Lej;Lrn;I)V")
	public static final void method13907(class165 arg0, class164 arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		if (class165.field1808 == var3 || class165.field1738 == var3 || class165.field1921 == var3) {
			arg0.field1859 = var3;
		}
	}

	@ObfuscatedName("nc.it(Lrn;I)V")
	public static final void method6850(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method13907(var2, var3, arg0);
	}

	@ObfuscatedName("aeo.jv(Lrn;I)V")
	public static final void method15609(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method13907(var2, var3, arg0);
	}

	@ObfuscatedName("ew.jm(Lew;Lej;Lrn;B)V")
	public static final void method3202(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1848 = arg2.intStack[--arg2.isp];
	}

	@ObfuscatedName("th.jc(Lrn;B)V")
	public static final void method11711(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3202(var2, var3, arg0);
	}

	@ObfuscatedName("rk.jf(Lrn;B)V")
	public static final void method8482(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3202(var2, var3, arg0);
	}

	@ObfuscatedName("ra.jx(Lew;Lej;Lrn;I)V")
	public static final void method830(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1870 = arg2.intStack[--arg2.isp];
	}

	@ObfuscatedName("cy.jj(Lrn;I)V")
	public static final void method2588(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method830(var2, var3, arg0);
	}

	@ObfuscatedName("ct.jr(Lrn;B)V")
	public static final void method2538(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method830(var2, var3, arg0);
	}

	@ObfuscatedName("ux.jh(Lew;Lej;Lrn;I)V")
	public static final void method11906(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1795 = (String) arg2.objectStack[--arg2.osp];
	}

	@ObfuscatedName("ac.js(Lrn;I)V")
	public static final void method1975(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method11906(var2, var3, arg0);
	}

	@ObfuscatedName("fd.ja(Lew;Lej;Lrn;I)V")
	public static final void method3504(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1914 = (String) arg2.objectStack[--arg2.osp];
	}

	@ObfuscatedName("ee.jp(Lrn;B)V")
	public static final void method3094(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3504(var2, var3, arg0);
	}

	@ObfuscatedName("eu.jo(Lrn;I)V")
	public static final void method2928(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3504(var2, var3, arg0);
	}

	@ObfuscatedName("fh.je(Lrn;B)V")
	public static final void method3650(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method3319(var2, var3, arg0);
	}

	@ObfuscatedName("nj.ju(Lrn;I)V")
	public static final void method6968(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method3319(var2, var3, arg0);
	}

	@ObfuscatedName("ae.jw(Lew;Lej;Lrn;B)V")
	public static final void method1966(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1763 = arg2.intStack[--arg2.isp];
		arg0.field1827 = arg2.intStack[--arg2.isp];
	}

	@ObfuscatedName("mv.jg(Lrn;B)V")
	public static final void method6314(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1966(var2, var3, arg0);
	}

	@ObfuscatedName("rs.jt(Lrn;B)V")
	public static final void method8543(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1966(var2, var3, arg0);
	}

	@ObfuscatedName("ax.jy(Lew;Lej;Lrn;I)V")
	public static final void method1841(class165 arg0, class164 arg1, ClientScriptState arg2) {
		int var3 = arg2.intStack[--arg2.isp];
		int var4 = arg2.intStack[--arg2.isp];
		if (var4 >= 1 && var4 <= 10) {
			arg0.method3123(var4 - 1, var3);
		}
	}

	@ObfuscatedName("gd.jz(Lrn;I)V")
	public static final void method4120(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1841(var2, var3, arg0);
	}

	@ObfuscatedName("fr.jn(Lrn;I)V")
	public static final void method3523(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1841(var2, var3, arg0);
	}

	@ObfuscatedName("it.jq(Lew;Lej;Lrn;I)V")
	public static final void method4712(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.field1853 = (String) arg2.objectStack[--arg2.osp];
	}

	@ObfuscatedName("pg.jk(Lrn;I)V")
	public static final void method7974(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method4712(var2, var3, arg0);
	}

	@ObfuscatedName("ao.jb(Lrn;I)V")
	public static final void method1808(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method4712(var2, var3, arg0);
	}

	@ObfuscatedName("aau.kr(Lrn;I)V")
	public static final void method14088(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method5069(var2, var3, arg0);
	}

	@ObfuscatedName("p.kh(Lrn;B)V")
	public static final void method1418(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method5069(var2, var3, arg0);
	}

	@ObfuscatedName("an.kb(Lew;IILrn;B)V")
	public static final void method1718(class165 arg0, int arg1, int arg2, ClientScriptState arg3) {
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
	public static final void method8614(class165 arg0, ClientScriptState arg1) {
		arg1.isp -= 2;
		int var2 = arg1.intStack[arg1.isp] - 1;
		int var3 = arg1.intStack[arg1.isp + 1];
		if (var2 < 0 || var2 > 9) {
			throw new RuntimeException();
		}
		method1718(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("vw.ks(Lrn;I)V")
	public static final void method12345(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		method8614(var2, arg0);
	}

	@ObfuscatedName("nw.kv(Lew;Lrn;I)V")
	public static final void method7054(class165 arg0, ClientScriptState arg1) {
		byte var2 = 10;
		int var3 = arg1.intStack[--arg1.isp];
		method1718(arg0, var2, var3, arg1);
	}

	@ObfuscatedName("pd.ku(Lrn;B)V")
	public static final void method7677(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		method7054(var2, arg0);
	}

	@ObfuscatedName("z.kq(Lew;I[B[BLrn;I)V")
	public static final void method1368(class165 arg0, int arg1, byte[] arg2, byte[] arg3, ClientScriptState arg4) {
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
	public static final void method2813(class165 arg0, byte[] arg1, byte[] arg2, ClientScriptState arg3) {
		int var4 = arg3.intStack[--arg3.isp] - 1;
		if (var4 < 0 || var4 > 9) {
			throw new RuntimeException();
		}
		method1368(arg0, var4, arg1, arg2, arg3);
	}

	@ObfuscatedName("fg.kn(Lrn;I)V")
	public static final void method3639(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.isp -= 10;
		byte[] var3 = null;
		byte[] var4 = null;
		int var5;
		for (var5 = 0; var5 < 10 && arg0.intStack[arg0.isp + var5] >= 0; var5 += 2) {
		}
		if (var5 > 0) {
			var3 = new byte[var5 / 2];
			var4 = new byte[var5 / 2];
			for (var5 -= 2; var5 >= 0; var5 -= 2) {
				var3[var5 / 2] = (byte) arg0.intStack[arg0.isp + var5];
				var4[var5 / 2] = (byte) arg0.intStack[arg0.isp + var5 + 1];
			}
		}
		method2813(var2, var3, var4, arg0);
	}

	@ObfuscatedName("iz.ko(Lew;Lej;Lrn;I)V")
	public static final void method4625(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg2.isp -= 2;
		byte var3 = 10;
		byte[] var4 = new byte[] { (byte) arg2.intStack[arg2.isp] };
		byte[] var5 = new byte[] { (byte) arg2.intStack[arg2.isp + 1] };
		method1368(arg0, var3, var4, var5, arg2);
	}

	@ObfuscatedName("ez.kt(Lrn;I)V")
	public static final void method3062(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method4625(var2, var3, arg0);
	}

	@ObfuscatedName("qz.kl(Lrn;I)V")
	public static final void method8273(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method4625(var2, var3, arg0);
	}

	@ObfuscatedName("oy.kd(Lrn;B)V")
	public static final void method7395(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method7900(var2, var3, arg0);
	}

	@ObfuscatedName("dm.kz(Lrn;I)V")
	public static final void method2885(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method7900(var2, var3, arg0);
	}

	@ObfuscatedName("ns.kf(Lew;Lej;Lrn;I)V")
	public static final void method6973(class165 arg0, class164 arg1, ClientScriptState arg2) {
		arg0.method3156();
	}

	@ObfuscatedName("aja.kw(Lrn;I)V")
	public static final void method16682(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6973(var2, var3, arg0);
	}

	@ObfuscatedName("fi.ke(Ljava/lang/String;Lrn;B)[I")
	public static final int[] method3662(String arg0, ClientScriptState arg1) {
		int[] var2 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			int var3 = arg1.intStack[--arg1.isp];
			if (var3 > 0) {
				var2 = new int[var3];
				while (var3-- > 0) {
					var2[var3] = arg1.intStack[--arg1.isp];
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
				var2[var3] = arg1.objectStack[--arg1.osp];
			} else if (arg0.charAt(var3 - 1) == 167) {
				var2[var3] = Long.valueOf(arg1.longStack[--arg1.lsp]);
			} else {
				var2[var3] = Integer.valueOf(arg1.intStack[--arg1.isp]);
			}
		}
		int var4 = arg1.intStack[--arg1.isp];
		if (var4 == -1) {
			var2 = null;
		} else {
			var2[0] = Integer.valueOf(var4);
		}
		return var2;
	}

	@ObfuscatedName("an.kg(Lew;Lej;Lrn;I)V")
	public static final void method1720(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1912 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("zy.kk(Lrn;I)V")
	public static final void method13887(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1720(var2, var3, arg0);
	}

	@ObfuscatedName("ky.lk(Lrn;B)V")
	public static final void method5014(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1720(var2, var3, arg0);
	}

	@ObfuscatedName("c.li(Lew;Lej;Lrn;B)V")
	public static final void method1327(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1866 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("up.lb(Lrn;I)V")
	public static final void method11872(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1327(var2, var3, arg0);
	}

	@ObfuscatedName("vt.lv(Lrn;I)V")
	public static final void method12207(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1327(var2, var3, arg0);
	}

	@ObfuscatedName("mv.ls(Lew;Lej;Lrn;B)V")
	public static final void method6309(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1773 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("it.lh(Lrn;B)V")
	public static final void method4716(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6309(var2, var3, arg0);
	}

	@ObfuscatedName("ado.ly(Lrn;I)V")
	public static final void method15149(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method6309(var2, var3, arg0);
	}

	@ObfuscatedName("vt.lo(Lew;Lej;Lrn;I)V")
	public static final void method12210(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1867 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("zl.lg(Lrn;S)V")
	public static final void method13894(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method12210(var2, var3, arg0);
	}

	@ObfuscatedName("ik.lu(Lrn;B)V")
	public static final void method4653(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method12210(var2, var3, arg0);
	}

	@ObfuscatedName("uw.lq(Lew;Lej;Lrn;B)V")
	public static final void method11881(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1888 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("jj.lt(Lrn;I)V")
	public static final void method4770(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method11881(var2, var3, arg0);
	}

	@ObfuscatedName("cd.ln(Lrn;I)V")
	public static final void method2490(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method11881(var2, var3, arg0);
	}

	@ObfuscatedName("ry.lw(Lew;Lej;Lrn;I)V")
	public static final void method8498(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1750 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("sz.lc(Lrn;I)V")
	public static final void method11158(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method8498(var2, var3, arg0);
	}

	@ObfuscatedName("ks.ld(Lrn;I)V")
	public static final void method5070(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method8498(var2, var3, arg0);
	}

	@ObfuscatedName("ph.lm(Lrn;I)V")
	public static final void method7878(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method4583(var2, var3, arg0);
	}

	@ObfuscatedName("rw.lj(Lrn;I)V")
	public static final void method8604(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method4583(var2, var3, arg0);
	}

	@ObfuscatedName("mx.lz(Lrn;B)V")
	public static final void method6077(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method15654(var2, var3, arg0);
	}

	@ObfuscatedName("ec.lx(Lrn;S)V")
	public static final void method3452(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method15654(var2, var3, arg0);
	}

	@ObfuscatedName("fk.lr(Lrn;I)V")
	public static final void method3632(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method3070(var2, var3, arg0);
	}

	@ObfuscatedName("nc.la(Lrn;I)V")
	public static final void method6851(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method3070(var2, var3, arg0);
	}

	@ObfuscatedName("mn.lf(Lew;Lej;Lrn;S)V")
	public static final void method6335(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1887 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("nz.mx(Lrn;S)V")
	public static final void method6984(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6335(var2, var3, arg0);
	}

	@ObfuscatedName("fm.mf(Lrn;B)V")
	public static final void method3627(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method6335(var2, var3, arg0);
	}

	@ObfuscatedName("lk.mo(Lew;Lej;Lrn;I)V")
	public static final void method5574(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1871 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("mn.ml(Lrn;I)V")
	public static final void method6336(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method5574(var2, var3, arg0);
	}

	@ObfuscatedName("ig.mp(Lrn;I)V")
	public static final void method4556(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method5574(var2, var3, arg0);
	}

	@ObfuscatedName("rx.mv(Lew;Lej;Lrn;I)V")
	public static final void method8586(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1864 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("lp.mj(Lrn;I)V")
	public static final void method6022(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method8586(var2, var3, arg0);
	}

	@ObfuscatedName("dn.mn(Lrn;I)V")
	public static final void method2871(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method8586(var2, var3, arg0);
	}

	@ObfuscatedName("fu.mz(Lew;Lej;Lrn;B)V")
	public static final void method3648(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1868 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("qy.mk(Lrn;I)V")
	public static final void method8347(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3648(var2, var3, arg0);
	}

	@ObfuscatedName("ew.mq(Lrn;B)V")
	public static final void method3203(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3648(var2, var3, arg0);
	}

	@ObfuscatedName("ju.mh(Lew;Lej;Lrn;I)V")
	public static final void method4873(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
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
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method4873(var2, var3, arg0);
	}

	@ObfuscatedName("ue.mi(Lrn;I)V")
	public static final void method11976(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method4873(var2, var3, arg0);
	}

	@ObfuscatedName("ge.mr(Lew;Lej;Lrn;B)V")
	public static final void method3982(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
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
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3982(var2, var3, arg0);
	}

	@ObfuscatedName("oz.mb(Lrn;B)V")
	public static final void method7571(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3982(var2, var3, arg0);
	}

	@ObfuscatedName("mj.ms(Lew;Lej;Lrn;I)V")
	public static final void method6322(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1872 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("rc.mg(Lrn;B)V")
	public static final void method8610(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6322(var2, var3, arg0);
	}

	@ObfuscatedName("nc.me(Lrn;I)V")
	public static final void method6852(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method6322(var2, var3, arg0);
	}

	@ObfuscatedName("ep.ma(Lew;Lej;Lrn;B)V")
	public static final void method3497(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1889 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("zg.mm(Lrn;I)V")
	public static final void method13905(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3497(var2, var3, arg0);
	}

	@ObfuscatedName("adq.mc(Lew;Lej;Lrn;I)V")
	public static final void method15147(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1890 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("p.my(Lrn;B)V")
	public static final void method1414(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method15147(var2, var3, arg0);
	}

	@ObfuscatedName("fe.mu(Lrn;I)V")
	public static final void method3846(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method15147(var2, var3, arg0);
	}

	@ObfuscatedName("ne.ng(Lew;Lej;Lrn;I)V")
	public static final void method6947(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1891 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("vy.ni(Lrn;I)V")
	public static final void method12478(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6947(var2, var3, arg0);
	}

	@ObfuscatedName("lr.nf(Lrn;I)V")
	public static final void method6030(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method6947(var2, var3, arg0);
	}

	@ObfuscatedName("gq.nt(Lew;Lej;Lrn;B)V")
	public static final void method3927(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1892 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("ot.nv(Lrn;I)V")
	public static final void method7371(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3927(var2, var3, arg0);
	}

	@ObfuscatedName("pe.ny(Lrn;I)V")
	public static final void method7687(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3927(var2, var3, arg0);
	}

	@ObfuscatedName("pe.nb(Lew;Lej;Lrn;I)V")
	public static final void method7688(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1893 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("jc.nu(Lrn;S)V")
	public static final void method4734(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7688(var2, var3, arg0);
	}

	@ObfuscatedName("ry.nx(Lrn;I)V")
	public static final void method8496(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7688(var2, var3, arg0);
	}

	@ObfuscatedName("tu.nc(Lrn;I)V")
	public static final void method11845(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		Statics.method2929(var2, var3, arg0);
	}

	@ObfuscatedName("am.na(Lrn;I)V")
	public static final void method1907(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		Statics.method2929(var2, var3, arg0);
	}

	@ObfuscatedName("nk.nh(Lew;Lej;Lrn;I)V")
	public static final void method6844(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1898 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("vx.np(Lrn;B)V")
	public static final void method12182(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method6844(var2, var3, arg0);
	}

	@ObfuscatedName("pt.nn(Lrn;I)V")
	public static final void method7729(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method6844(var2, var3, arg0);
	}

	@ObfuscatedName("af.ne(Lew;Lej;Lrn;I)V")
	public static final void method1687(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1782 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("rm.nj(Lrn;I)V")
	public static final void method8589(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1687(var2, var3, arg0);
	}

	@ObfuscatedName("jx.ns(Lrn;I)V")
	public static final void method4753(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1687(var2, var3, arg0);
	}

	@ObfuscatedName("qb.nq(Lew;Lej;Lrn;I)V")
	public static final void method8454(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1897 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("mv.no(Lrn;I)V")
	public static final void method6313(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method8454(var2, var3, arg0);
	}

	@ObfuscatedName("oh.nm(Lew;Lej;Lrn;I)V")
	public static final void method7653(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1900 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("pt.nl(Lrn;I)V")
	public static final void method7730(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7653(var2, var3, arg0);
	}

	@ObfuscatedName("gh.nw(Lrn;B)V")
	public static final void method3976(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7653(var2, var3, arg0);
	}

	@ObfuscatedName("vg.nd(Lew;Lej;Lrn;I)V")
	public static final void method12221(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1778 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("li.oa(Lrn;B)V")
	public static final void method5593(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method12221(var2, var3, arg0);
	}

	@ObfuscatedName("fj.os(Lew;Lej;Lrn;I)V")
	public static final void method3614(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
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
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method3614(var2, var3, arg0);
	}

	@ObfuscatedName("fo.ob(Lrn;S)V")
	public static final void method3620(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method3614(var2, var3, arg0);
	}

	@ObfuscatedName("ou.ox(Lew;Lej;Lrn;I)V")
	public static final void method7560(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
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
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method7560(var2, var3, arg0);
	}

	@ObfuscatedName("n.ow(Lrn;I)V")
	public static final void method1375(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method7560(var2, var3, arg0);
	}

	@ObfuscatedName("aaw.oi(Lew;Lej;Lrn;B)V")
	public static final void method13914(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1788 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("aw.ot(Lrn;I)V")
	public static final void method1887(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method13914(var2, var3, arg0);
	}

	@ObfuscatedName("e.oc(Lrn;B)V")
	public static final void method1666(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method13914(var2, var3, arg0);
	}

	@ObfuscatedName("x.oy(Lew;Lej;Lrn;I)V")
	public static final void method1600(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1758 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("xa.op(Lrn;I)V")
	public static final void method233(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1600(var2, var3, arg0);
	}

	@ObfuscatedName("ajd.oo(Lrn;I)V")
	public static final void method16886(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1600(var2, var3, arg0);
	}

	@ObfuscatedName("abm.ou(Lew;Lej;Lrn;B)V")
	public static final void method14207(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1881 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("vw.oz(Lrn;I)V")
	public static final void method12344(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method14207(var2, var3, arg0);
	}

	@ObfuscatedName("ra.oj(Lrn;B)V")
	public static final void method826(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method14207(var2, var3, arg0);
	}

	@ObfuscatedName("am.od(Lew;Lej;Lrn;I)V")
	public static final void method1906(class165 arg0, class164 arg1, ClientScriptState arg2) {
		String var3 = (String) arg2.objectStack[--arg2.osp];
		if (method3662(var3, arg2) != null) {
			var3 = var3.substring(0, var3.length() - 1);
		}
		arg0.field1884 = method8142(var3, arg2);
		arg0.field1861 = true;
	}

	@ObfuscatedName("abo.ok(Lrn;B)V")
	public static final void method14311(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >> 16];
		method1906(var2, var3, arg0);
	}

	@ObfuscatedName("uf.oh(Lrn;I)V")
	public static final void method12036(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		method1906(var2, var3, arg0);
	}

	@ObfuscatedName("jp.pv(Lrn;B)V")
	public static final void method4808(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1776;
	}

	@ObfuscatedName("gi.pd(Lrn;I)V")
	public static final void method4035(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1777;
	}

	@ObfuscatedName("gp.pe(Lrn;I)V")
	public static final void method3906(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1863;
	}

	@ObfuscatedName("ki.pp(Lrn;I)V")
	public static final void method5026(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1929;
	}

	@ObfuscatedName("da.pq(Lrn;S)V")
	public static final void method2815(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1807 ? 1 : 0;
	}

	@ObfuscatedName("ol.px(Lrn;B)V")
	public static final void method7078(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.layer;
	}

	@ObfuscatedName("na.pt(Lrn;B)V")
	public static final void method1220(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		class164 var3 = var1.itf;
		class165 var4 = client.method4752(var3, var2);
		arg0.intStack[++arg0.isp - 1] = var4 == null ? -1 : var4.parentLayer;
	}

	@ObfuscatedName("aid.pa(Lrn;B)V")
	public static final void method16503(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1792;
	}

	@ObfuscatedName("mk.ps(Lrn;I)V")
	public static final void method6356(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1857;
	}

	@ObfuscatedName("fl.pn(Lrn;B)V")
	public static final void method3567(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1739;
	}

	@ObfuscatedName("rh.po(Lrn;B)V")
	public static final void method8619(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.objectStack[++arg0.osp - 1] = var2.field1825;
	}

	@ObfuscatedName("ac.pb(Lrn;B)V")
	public static final void method1976(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1790;
	}

	@ObfuscatedName("la.pw(Lrn;I)V")
	public static final void method6067(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1894;
	}

	@ObfuscatedName("fl.ph(Lrn;I)V")
	public static final void method3570(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1818;
	}

	@ObfuscatedName("fz.pr(Lrn;I)V")
	public static final void method3661(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1812;
	}

	@ObfuscatedName("d.pc(Lrn;I)V")
	public static final void method1357(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1814;
	}

	@ObfuscatedName("nv.pj(Lrn;B)V")
	public static final void method6789(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1813;
	}

	@ObfuscatedName("lk.pi(Lrn;I)V")
	public static final void method5572(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1794;
	}

	@ObfuscatedName("nk.pl(Lrn;B)V")
	public static final void method6845(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1810;
	}

	@ObfuscatedName("la.pf(Lrn;I)V")
	public static final void method6063(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1824;
	}

	@ObfuscatedName("nf.pm(Lrn;I)V")
	public static final void method6639(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1797;
	}

	@ObfuscatedName("dr.pk(Lrn;I)V")
	public static final void method2827(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		int var3 = arg0.intStack[--arg0.isp];
		class613 var4 = Statics.field4464.method12600(var3);
		if (var4.method12586()) {
			arg0.objectStack[++arg0.osp - 1] = var2.method3126(var3, var4.field7288);
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.method3132(var3, var4.field7287);
		}
	}

	@ObfuscatedName("sr.pz(Lrn;I)V")
	public static final void method11324(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1783;
	}

	@ObfuscatedName("aeg.pg(Lrn;I)V")
	public static final void method15467(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1806 == 1 ? var2.field1838 : -1;
	}

	@ObfuscatedName("iz.py(Lrn;I)V")
	public static final void method4626(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = var2.field1793;
	}

	@ObfuscatedName("adf.pu(Lrn;B)V")
	public static final void method14994(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		int var3 = -1;
		int var4 = -1;
		class163 var5 = var2.method3124(Statics.field5187);
		if (var5 != null) {
			var3 = var5.field1728;
			var4 = var5.field1727;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("aet.qm(Lrn;I)V")
	public static final void method15442(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		if (var2.field1903 == -1) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field1904;
		}
	}

	@ObfuscatedName("ov.qx(Lrn;I)V")
	public static final void method7214(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		arg0.intStack[++arg0.isp - 1] = client.method14331(var2).method14928();
	}

	@ObfuscatedName("dq.qq(Lrn;B)V")
	public static final void method2899(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		int var3 = arg0.intStack[--arg0.isp];
		int var4 = var3 - 1;
		if (var2.field1852 == null || var4 >= var2.field1852.length || var2.field1852[var4] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.field1852[var4];
		}
	}

	@ObfuscatedName("adj.qn(Lrn;I)V")
	public static final void method15141(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		if (var2.field1795 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.field1795;
		}
	}

	@ObfuscatedName("cc.qt(Lew;Lrn;B)V")
	public static final void method2552(class165 arg0, ClientScriptState arg1) {
		if (arg1.nestedCount >= 10) {
			throw new RuntimeException();
		} else if (arg0.field1778 != null) {
			HookRequest var2 = new HookRequest();
			var2.component = arg0;
			var2.onOp = arg0.field1778;
			var2.nestedCount = arg1.nestedCount + 1;
			client.field9089.method11558(var2);
		}
	}

	@ObfuscatedName("dn.qo(Lrn;I)V")
	public static final void method2870(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		method2552(var2, arg0);
	}

	@ObfuscatedName("ev.qr(Lrn;I)V")
	public static final void method2983(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		method2552(var2, arg0);
	}

	@ObfuscatedName("da.qw(Lew;Lrn;B)V")
	public static final void method2816(class165 arg0, ClientScriptState arg1) {
		class603 var2 = arg0.method3188(Statics.field6784, client.field8914);
		int var3 = arg1.intStack[--arg1.isp];
		int var4 = arg1.intStack[--arg1.isp];
		int var5 = var2.method12410(arg0.field1825, arg0.field1863, arg0.field1835, var4, var3, Statics.field8538);
		arg1.intStack[++arg1.isp - 1] = var5;
	}

	@ObfuscatedName("mn.ql(Lrn;I)V")
	public static final void method6338(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		method2816(var2, arg0);
	}

	@ObfuscatedName("lw.qf(Lew;Lrn;B)V")
	public static final void method5942(class165 arg0, ClientScriptState arg1) {
		class603 var2 = arg0.method3188(Statics.field6784, client.field8914);
		int var3 = arg1.intStack[--arg1.isp];
		Point var4 = var2.method12396(arg0.field1825, arg0.field1863, arg0.field1835, var3, Statics.field8538);
		arg1.intStack[++arg1.isp - 1] = var4.x;
		arg1.intStack[++arg1.isp - 1] = var4.y;
	}

	@ObfuscatedName("lk.qc(Lrn;I)V")
	public static final void method5569(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		method5942(var2, arg0);
	}

	@ObfuscatedName("pg.qa(Lrn;I)V")
	public static final void method7976(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		method5942(var2, arg0);
	}

	@ObfuscatedName("fc.qj(S)J")
	public static final long method3530() {
		return (long) (++field5209 - 1) << 32 | 0xFFFFFFFFL;
	}

	@ObfuscatedName("nk.qz(Lew;Lrn;I)V")
	public static final void method6846(class165 arg0, ClientScriptState arg1) {
		int var2 = arg1.intStack[--arg1.isp];
		int var3 = arg1.intStack[--arg1.isp] - 1;
		if (arg0.field1806 != 6) {
			throw new RuntimeException("");
		}
		class611 var4 = Statics.field3774.method12565(arg0.field1838);
		if (arg0.field1930 == null) {
			arg0.field1930 = new class610(var4, true);
		}
		arg0.field1930.field7203 = method3530();
		if (var3 < 0 || var3 >= var4.field7214.length) {
			throw new RuntimeException("" + var3);
		}
		arg0.field1930.field7204[var3] = var2;
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("qh.qh(Lrn;I)V")
	public static final void method8285(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		method6846(var2, arg0);
	}

	@ObfuscatedName("iv.qv(Lrn;I)V")
	public static final void method4580(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		method6846(var2, arg0);
	}

	@ObfuscatedName("nj.qy(Lrn;I)V")
	public static final void method6971(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		Statics.method5714(var2, arg0);
	}

	@ObfuscatedName("agh.qs(Lrn;I)V")
	public static final void method15938(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		Statics.method5714(var2, arg0);
	}

	@ObfuscatedName("iv.qk(Lew;Lrn;I)V")
	public static final void method4581(class165 arg0, ClientScriptState arg1) {
		int var2 = arg1.intStack[--arg1.isp];
		int var3 = arg1.intStack[--arg1.isp] - 1;
		int var4 = var3;
		if (arg0.field1806 != 6 && arg0.field1806 != 2) {
			throw new RuntimeException("");
		}
		class611 var5 = Statics.field3774.method12565(arg0.field1838);
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
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("c.qg(Lrn;B)V")
	public static final void method1328(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		method4581(var2, arg0);
	}

	@ObfuscatedName("v.qb(Lrn;I)V")
	public static final void method1203(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		method4581(var2, arg0);
	}

	@ObfuscatedName("cj.rk(Lew;Lrn;B)V")
	public static final void method2575(class165 arg0, ClientScriptState arg1) {
		int var2 = arg1.intStack[--arg1.isp];
		int var3 = arg1.intStack[--arg1.isp] - 1;
		int var4 = var3;
		if (arg0.field1806 != 6 && arg0.field1806 != 2) {
			throw new RuntimeException("");
		}
		class611 var5 = Statics.field3774.method12565(arg0.field1838);
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
		client.requestRedrawComponent(arg0);
	}

	@ObfuscatedName("vz.ry(Lrn;I)V")
	public static final void method12233(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		method2575(var2, arg0);
	}

	@ObfuscatedName("mx.rd(Lrn;I)V")
	public static final void method6079(ClientScriptState arg0) {
		class504 var1 = arg0.secondary ? arg0.activeComponent2 : arg0.activeComponent;
		class165 var2 = var1.com;
		method2575(var2, arg0);
	}

	@ObfuscatedName("oq.rs(Lrn;I)V")
	public static final void method7246(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1776;
	}

	@ObfuscatedName("lq.ri(Lrn;I)V")
	public static final void method5929(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1777;
	}

	@ObfuscatedName("ic.rx(Lrn;B)V")
	public static final void method4690(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1863;
	}

	@ObfuscatedName("ls.rm(Lrn;S)V")
	public static final void method5708(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1929;
	}

	@ObfuscatedName("acu.rj(Lrn;I)V")
	public static final void method14924(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1807 ? 1 : 0;
	}

	@ObfuscatedName("iz.rw(Lrn;I)V")
	public static final void method4622(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.layer;
	}

	@ObfuscatedName("vl.rc(Lrn;I)V")
	public static final void method12451(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		class164 var3 = Statics.interfaces[var1 >>> 16];
		class165 var4 = client.method4752(var3, var2);
		arg0.intStack[++arg0.isp - 1] = var4 == null ? -1 : var4.parentLayer;
	}

	@ObfuscatedName("uk.rh(Lrn;I)V")
	public static final void method11960(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1792;
	}

	@ObfuscatedName("al.rt(Lrn;I)V")
	public static final void method1816(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1857;
	}

	@ObfuscatedName("adq.ru(Lrn;B)V")
	public static final void method15146(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.objectStack[++arg0.osp - 1] = var2.field1825;
	}

	@ObfuscatedName("fm.ra(Lrn;B)V")
	public static final void method3624(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1790;
	}

	@ObfuscatedName("ak.rf(Lrn;I)V")
	public static final void method1953(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1894;
	}

	@ObfuscatedName("cd.rl(Lrn;I)V")
	public static final void method2496(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1818;
	}

	@ObfuscatedName("fw.rz(Lrn;I)V")
	public static final void method3671(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1812;
	}

	@ObfuscatedName("aab.re(Lrn;I)V")
	public static final void method13910(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1814;
	}

	@ObfuscatedName("an.rg(Lrn;B)V")
	public static final void method1719(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1813;
	}

	@ObfuscatedName("rd.ro(Lrn;S)V")
	public static final void method8513(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1794;
	}

	@ObfuscatedName("fu.rb(Lrn;I)V")
	public static final void method3644(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1810;
	}

	@ObfuscatedName("je.rn(Lrn;I)V")
	public static final void method4863(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1824;
	}

	@ObfuscatedName("ev.rr(Lrn;I)V")
	public static final void method2987(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1797;
	}

	@ObfuscatedName("rh.rv(Lrn;I)V")
	public static final void method8615(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1806 == 1 ? var2.field1838 : -1;
	}

	@ObfuscatedName("rg.se(Lrn;B)V")
	public static final void method8719(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1793;
	}

	@ObfuscatedName("ig.sd(Lrn;I)V")
	public static final void method4557(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		int var3 = -1;
		int var4 = -1;
		class163 var5 = var2.method3124(Statics.field5187);
		if (var5 != null) {
			var3 = var5.field1728;
			var4 = var5.field1727;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("nq.so(Lrn;B)V")
	public static final void method6977(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field1793;
	}

	@ObfuscatedName("cy.sz(Lrn;I)V")
	public static final void method2585(ClientScriptState arg0) {
		class165 var1 = class165.method11381(arg0.intStack[--arg0.isp]);
		if (var1.field1903 == -1) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1.field1904;
		}
	}

	@ObfuscatedName("dr.sb(Lrn;I)V")
	public static final void method2824(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class816 var2 = (class816) client.openedSubInterfaces.method11923((long) var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
		}
	}

	@ObfuscatedName("uv.sa(Lrn;I)V")
	public static final void method12162(ClientScriptState arg0) {
		class165 var1 = class165.method11381(arg0.intStack[--arg0.isp]);
		if (var1.subcomponents == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
			return;
		}
		int var2 = var1.subcomponents.length;
		for (int var3 = 0; var3 < var1.subcomponents.length; var3++) {
			if (var1.subcomponents[var3] == null) {
				var2 = var3;
				break;
			}
		}
		arg0.intStack[++arg0.isp - 1] = var2;
	}

	@ObfuscatedName("qe.sl(Lrn;I)V")
	public static final void method8316(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class816 var3 = (class816) client.openedSubInterfaces.method11923((long) var1);
		if (var3 != null && var3.field9679 == var2) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
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
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		arg0.intStack[++arg0.isp - 1] = client.method14331(var2).method14928();
	}

	@ObfuscatedName("ae.sm(Lrn;I)V")
	public static final void method1971(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		int var3 = arg0.intStack[--arg0.isp];
		int var4 = var3 - 1;
		if (var2.field1852 == null || var4 >= var2.field1852.length || var2.field1852[var4] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.field1852[var4];
		}
	}

	@ObfuscatedName("lk.sn(Lrn;B)V")
	public static final void method5570(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class165 var2 = class165.method11381(var1);
		if (var2.field1795 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.field1795;
		}
	}

	@ObfuscatedName("aw.su(Lrn;B)V")
	public static final void method1882(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Statics.method7348(var1);
	}

	@ObfuscatedName("id.sh(Lrn;B)V")
	public static final void method4595(ClientScriptState arg0) {
		arg0.isp -= 2;
		Statics.method11308(Statics.field2119, arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1]);
	}

	@ObfuscatedName("jh.ss(Lrn;I)V")
	public static final void method4784(ClientScriptState arg0) {
		client.method8618(true);
	}

	@ObfuscatedName("gh.sq(Lrn;I)V")
	public static final void method3977(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = 0;
		if (class526.method7735(var1)) {
			var2 = class526.method5598(var1);
		}
		class792 var3 = class792.method14781(class280.field2914, client.field8975.field834);
		var3.field9467.p4(var2);
		client.field8975.method1913(var3);
	}

	@ObfuscatedName("wk.sp(Lrn;I)V")
	public static final void method12718(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		class792 var2 = class792.method14781(class280.field2849, client.field8975.field834);
		var2.field9467.p1(var1.length() + 1);
		var2.field9467.pjstr(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("xx.sc(Lrn;I)V")
	public static final void method12738(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		class792 var2 = class792.method14781(class280.field2870, client.field8975.field834);
		var2.field9467.p1(var1.length() + 1);
		var2.field9467.pjstr(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("mv.sx(Lrn;I)V")
	public static final void method6310(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		Statics.method8062(var1, var2);
	}

	@ObfuscatedName("gb.sv(Lrn;B)V")
	public static final void method4007(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		class165 var4 = class165.method11381(var3);
		client.method8390(var4, var1, var2);
	}

	@ObfuscatedName("fx.sr(Lrn;B)V")
	public static final void method3584(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class792 var2 = class792.method14781(class280.field2954, client.field8975.field834);
		var2.field9467.p2(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("pl.sk(Lrn;I)V")
	public static final void method7907(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		client.method3589(var1, new class816(var2, 3), null, true);
	}

	@ObfuscatedName("na.si(Lrn;B)V")
	public static final void method1222(ClientScriptState arg0) {
		arg0.isp--;
		int var1 = arg0.intStack[arg0.isp];
		class816 var2 = (class816) client.openedSubInterfaces.method11923((long) var1);
		if (var2 != null && var2.field9678 == 3) {
			client.method7069(var2, true, true);
		}
	}

	@ObfuscatedName("ml.sg(Lrn;B)V")
	public static final void method6246(ClientScriptState arg0) {
		client.method7323((String) arg0.objectStack[--arg0.osp]);
	}

	@ObfuscatedName("ch.tw(Lrn;I)V")
	public static final void method2424(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		String var3 = (String) arg0.objectStack[--arg0.osp];
		if (var1 == 99) {
			class62.method1958(var3);
		} else if (var1 == 98) {
			class62.method11224(var3);
		} else {
			class175.method3943(var1, var2, "", "", "", var3);
		}
	}

	@ObfuscatedName("fo.ty(Lrn;I)V")
	public static final void method3621(ClientScriptState arg0) {
		arg0.isp -= 11;
		class265[] var1 = class265.method15177();
		class263[] var2 = class263.method3623();
		class57.method1884(var1[arg0.intStack[arg0.isp]], var2[arg0.intStack[arg0.isp + 1]], arg0.intStack[arg0.isp + 2], arg0.intStack[arg0.isp + 3], arg0.intStack[arg0.isp + 4], arg0.intStack[arg0.isp + 5], arg0.intStack[arg0.isp + 6], arg0.intStack[arg0.isp + 7], arg0.intStack[arg0.isp + 8], arg0.intStack[arg0.isp + 9], arg0.intStack[arg0.isp + 10]);
	}

	@ObfuscatedName("te.tk(Lrn;I)V")
	public static final void method11536(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class792 var2 = class792.method14781(class280.field2854, client.field8975.field834);
		var2.field9467.p2(var1);
		client.field8975.method1913(var2);
	}

	@ObfuscatedName("ob.tb(Lrn;I)V")
	public static final void method7277(ClientScriptState arg0) {
		arg0.isp -= 3;
		class395.method14082(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2], 255, 256);
	}

	@ObfuscatedName("qp.tr(Lrn;I)V")
	public static final void method8200(ClientScriptState arg0) {
		class395.method11057(arg0.intStack[--arg0.isp], 255, 50);
	}

	@ObfuscatedName("lu.to(Lrn;B)V")
	public static final void method5826(ClientScriptState arg0) {
		arg0.isp -= 2;
		class395.method5596(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], 255);
	}

	@ObfuscatedName("ob.tg(Lrn;B)V")
	public static final void method7278(ClientScriptState arg0) {
		arg0.isp -= 4;
		class395.method14082(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2], arg0.intStack[arg0.isp + 3], 256);
	}

	@ObfuscatedName("fc.ta(Lrn;I)V")
	public static final void method3535(ClientScriptState arg0) {
		arg0.isp -= 3;
		class395.method11057(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2]);
	}

	@ObfuscatedName("cy.tz(Lrn;B)V")
	public static final void method2586(ClientScriptState arg0) {
		arg0.isp -= 3;
		class395.method5596(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2]);
	}

	@ObfuscatedName("lo.tm(Lrn;B)V")
	public static final void method5787(ClientScriptState arg0) {
		arg0.isp -= 4;
		class395.method1717(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2], arg0.intStack[arg0.isp + 3], true, 256);
	}

	@ObfuscatedName("pi.tx(Lrn;I)V")
	public static final void method7901(ClientScriptState arg0) {
		arg0.isp -= 5;
		class395.method14082(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2], arg0.intStack[arg0.isp + 3], arg0.intStack[arg0.isp + 4]);
	}

	@ObfuscatedName("jc.te(Lrn;S)V")
	public static final void method4735(ClientScriptState arg0) {
		arg0.isp -= 5;
		class395.method1717(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], arg0.intStack[arg0.isp + 2], arg0.intStack[arg0.isp + 3], false, arg0.intStack[arg0.isp + 4]);
	}

	@ObfuscatedName("gb.td(Lrn;I)V")
	public static final void method4008(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9213;
	}

	@ObfuscatedName("ix.tq(Lrn;B)V")
	public static final void method4616(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class769.method12480(var1, var2, false);
	}

	@ObfuscatedName("qm.tf(Lrn;B)V")
	public static final void method8031(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class769.method15887(var1, var2, false);
	}

	@ObfuscatedName("la.ti(Lrn;I)V")
	public static final void method6064(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class769.method12715(var1, var2, false);
	}

	@ObfuscatedName("cg.th(Lrn;I)V")
	public static final void method2556(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field495.method12644(var1).field9802;
	}

	@ObfuscatedName("dq.tp(Lrn;I)V")
	public static final void method2897(ClientScriptState arg0) {
		arg0.isp -= 2;
		class833 var1 = Statics.field495.method12644(arg0.intStack[arg0.isp]);
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = -1;
		for (int var4 = 0; var4 < var1.field9804; var4++) {
			if (var1.field9801[var4] == var2) {
				var3 = var1.field9803[var4];
				break;
			}
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("ec.tv(Lrn;I)V")
	public static final void method3454(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = client.field9092[var1];
	}

	@ObfuscatedName("et.tu(Lrn;S)V")
	public static final void method2922(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = client.field9094[var1];
	}

	@ObfuscatedName("pa.tj(Lrn;B)V")
	public static final void method7743(ClientScriptState arg0) {
		byte var1 = Statics.field2119.field9807;
		Vector3 var2 = Statics.field2119.method8565().field3464;
		class453 var3 = client.field8980.method6214();
		int var4 = ((int) var2.field3475 >> 9) + var3.field4836;
		int var5 = ((int) var2.field3477 >> 9) + var3.field4838;
		arg0.intStack[++arg0.isp - 1] = (var1 << 28) + (var4 << 14) + var5;
	}

	@ObfuscatedName("jp.ts(Lrn;I)V")
	public static final void method4810(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = var1 >> 28;
	}

	@ObfuscatedName("ff.ul(Lrn;I)V")
	public static final void method3579(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = var1 & 0x3FFF;
	}

	@ObfuscatedName("gz.up(Lrn;I)V")
	public static final void method3938(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9142 ? 1 : 0;
	}

	@ObfuscatedName("fc.uw(Lrn;B)V")
	public static final void method3539(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class769.method12480(var1, var2, true);
	}

	@ObfuscatedName("dx.ub(Lrn;I)V")
	public static final void method2705(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class769.method15887(var1, var2, true);
	}

	@ObfuscatedName("cj.us(Lrn;I)V")
	public static final void method2578(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class769.method12715(var1, var2, true);
	}

	@ObfuscatedName("rc.ux(Lrn;I)V")
	public static final void method8607(ClientScriptState arg0) {
		if (client.field9074 >= 2) {
			arg0.intStack[++arg0.isp - 1] = client.field9074;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("sa.uc(Lrn;B)V")
	public static final void method11165(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field8935;
	}

	@ObfuscatedName("acz.uk(Lrn;I)V")
	public static final void method14810(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9109;
	}

	@ObfuscatedName("dk.ug(Lrn;I)V")
	public static final void method2713(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field8905;
	}

	@ObfuscatedName("gm.uj(Lrn;I)V")
	public static final void method3966(ClientScriptState arg0) {
		if (client.field8916 >= 5 && client.field8916 <= 9) {
			arg0.intStack[++arg0.isp - 1] = client.field8916;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("py.uz(Lrn;B)V")
	public static final void method7982(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field8998 ? 1 : 0;
	}

	@ObfuscatedName("ju.ua(Lrn;I)V")
	public static final void method4874(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field2119.field10047;
	}

	@ObfuscatedName("ay.ui(Lrn;I)V")
	public static final void method1678(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field2119.field10044 != null && Statics.field2119.field10044.field5005 ? 1 : 0;
	}

	@ObfuscatedName("w.uh(Lrn;B)V")
	public static final void method1558(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9081 ? 1 : 0;
	}

	@ObfuscatedName("dm.uf(Lrn;I)V")
	public static final void method2887(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = class769.method11844(var1, false);
	}

	@ObfuscatedName("ls.uu(Lrn;I)V")
	public static final void method5709(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class769.method1946(var1, var2, false, false);
	}

	@ObfuscatedName("pb.ut(Lrn;B)V")
	public static final void method7832(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class769.method1946(var1, var2, true, false);
	}

	@ObfuscatedName("aed.un(Lrn;I)V")
	public static final void method15674(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field2308.method6339();
	}

	@ObfuscatedName("wb.um(Lrn;I)V")
	public static final void method12726(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = (var2 << 14) + var1;
		int var6 = (var3 << 28) + var5;
		int var7 = var4 + var6;
		arg0.intStack[++arg0.isp - 1] = var7;
	}

	@ObfuscatedName("adk.uq(Lrn;I)V")
	public static final void method15164(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9043;
	}

	@ObfuscatedName("cj.ud(Lrn;B)V")
	public static final void method2580(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class50.method4552();
	}

	@ObfuscatedName("t.ur(Lrn;I)V")
	public static final void method1344(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = 0;
	}

	@ObfuscatedName("og.uv(Lrn;B)V")
	public static final void method7162(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field578 ? 1 : 0;
	}

	@ObfuscatedName("wb.uy(Lrn;I)V")
	public static final void method12729(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9004 ? 1 : 0;
	}

	@ObfuscatedName("wb.vf(Lrn;I)V")
	public static final void method12727(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field7136.method7254();
	}

	@ObfuscatedName("tr.va(Lrn;I)V")
	public static final void method11403(ClientScriptState arg0) {
		method2473(class42.method11098(), arg0);
	}

	@ObfuscatedName("mo.ve(Lrn;S)V")
	public static final void method6083(ClientScriptState arg0) {
		method2473(class42.method7326(), arg0);
	}

	@ObfuscatedName("jp.vu(Lrn;I)V")
	public static final void method4809(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class42.field588;
		arg0.intStack[++arg0.isp - 1] = class42.field594;
	}

	@ObfuscatedName("et.vt(Lrn;I)V")
	public static final void method2918(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9018;
	}

	@ObfuscatedName("rh.vg(Lrn;I)V")
	public static final void method8617(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field2119.field8638.method1387() >> 3;
	}

	@ObfuscatedName("eg.vo(Lrn;I)V")
	public static final void method2939(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (Statics.field4685 != null && Statics.field4685.equalsIgnoreCase(var1)) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("qh.vz(Lrn;B)V")
	public static final void method8286(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field7136.method7250() ? 1 : 0;
		arg0.intStack[++arg0.isp - 1] = Statics.field7136.method7251() ? 1 : 0;
		arg0.intStack[++arg0.isp - 1] = Statics.field7136.method7252() ? 1 : 0;
	}

	@ObfuscatedName("nd.vn(Lrn;B)V")
	public static final void method7062(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9071;
	}

	@ObfuscatedName("fp.vq(Lrn;S)V")
	public static final void method3543(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9117 ? 1 : 0;
		arg0.objectStack[++arg0.osp - 1] = client.field9151 == null ? "" : client.field9151;
		arg0.objectStack[++arg0.osp - 1] = client.field9103 == null ? "" : client.field9103;
	}

	@ObfuscatedName("pe.vj(Lrn;I)V")
	public static final void method7689(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class579 var3 = Statics.field1244.method12116(var1);
		if (var3.field6806 != 's') {
		}
		arg0.objectStack[++arg0.osp - 1] = var3.method12120(var2);
	}

	@ObfuscatedName("uo.vw(Lrn;I)V")
	public static final void method11948(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		class579 var5 = Statics.field1244.method12116(var3);
		if (var5.field6807 != var1 || var5.field6806 != var2) {
			throw new RuntimeException(var3 + " " + var4);
		} else if (var2 == 115) {
			arg0.objectStack[++arg0.osp - 1] = var5.method12120(var4);
		} else {
			arg0.intStack[++arg0.isp - 1] = var5.method12123(var4);
		}
	}

	@ObfuscatedName("aah.vs(Lrn;I)V")
	public static final void method13913(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		class579 var4 = Statics.field1244.method12116(var2);
		if (var4.field6806 != var1) {
			throw new RuntimeException();
		}
		arg0.intStack[++arg0.isp - 1] = var4.method12127(var3) ? 1 : 0;
	}

	@ObfuscatedName("tk.vr(Lrn;I)V")
	public static final void method11378(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		class579 var3 = Statics.field1244.method12116(var1);
		if (var3.field6806 != 's') {
			throw new RuntimeException();
		}
		arg0.intStack[++arg0.isp - 1] = var3.method12127(var2) ? 1 : 0;
	}

	@ObfuscatedName("io.vb(Lrn;I)V")
	public static final void method4604(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class579 var2 = Statics.field1244.method12116(var1);
		arg0.intStack[++arg0.isp - 1] = var2.method12128();
	}

	@ObfuscatedName("id.vk(Lrn;I)V")
	public static final void method4592(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		if (var1 == -1) {
			throw new RuntimeException();
		}
		class579 var3 = Statics.field1244.method12116(var1);
		if (var3.field6806 != 's') {
			throw new RuntimeException();
		}
		int[] var4 = var3.method12141(var2);
		int var5 = 0;
		if (var4 != null) {
			var5 = var4.length;
		}
		arg0.intStack[++arg0.isp - 1] = var5;
	}

	@ObfuscatedName("gq.vi(Lrn;I)V")
	public static final void method3923(ClientScriptState arg0) {
		arg0.isp -= 5;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		if (var3 == -1) {
			throw new RuntimeException();
		}
		class579 var6 = Statics.field1244.method12116(var3);
		if (var6.field6807 != var2) {
			throw new RuntimeException();
		} else if (var6.field6806 == var1) {
			int[] var7 = var6.method12141(var4);
			if (var5 < 0 || var7 == null || var7.length <= var5) {
				throw new RuntimeException();
			}
			arg0.intStack[++arg0.isp - 1] = var7[var5];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ot.vd(Lrn;B)V")
	public static final void method7372(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		String var4 = (String) arg0.objectStack[--arg0.osp];
		if (var2 == -1) {
			throw new RuntimeException();
		}
		class579 var5 = Statics.field1244.method12116(var2);
		if (var5.field6807 != var1) {
			throw new RuntimeException();
		} else if (var5.field6806 == 's') {
			int[] var6 = var5.method12141(var4);
			if (var3 < 0 || var6 == null || var6.length <= var3) {
				throw new RuntimeException();
			}
			arg0.intStack[++arg0.isp - 1] = var6[var3];
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ai.vm(Lrn;I)V")
	public static final void method1770(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		class792 var2 = class792.method14781(class280.field2950, client.field8959.field834);
		var2.field9467.p1(Statics.method1724(var1));
		var2.field9467.pjstr(var1);
		client.field8959.method1913(var2);
	}

	@ObfuscatedName("ut.vl(Lrn;I)V")
	public static final void method12071(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		class792 var3 = class792.method14781(class280.field2958, client.field8959.field834);
		var3.field9467.p2(Statics.method1724(var1) + Statics.method1724(var2));
		var3.field9467.pjstr(var1);
		var3.field9467.pjstr(var2);
		client.field8959.method1913(var3);
	}

	@ObfuscatedName("mx.vh(Lrn;I)V")
	public static final void method6072(ClientScriptState arg0) {
		arg0.osp--;
		arg0.isp -= 3;
		String var1 = (String) arg0.objectStack[arg0.osp];
		boolean var2 = arg0.intStack[arg0.isp] == 1;
		boolean var3 = arg0.intStack[arg0.isp + 1] == 1;
		boolean var4 = arg0.intStack[arg0.isp + 2] == 1;
		class792 var5 = class792.method14781(class280.field2944, client.field8959.field834);
		var5.field9467.p2(Statics.method1724(var1) + 1);
		var5.field9467.pjstr(var1);
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
		var5.field9467.p1(var6);
		client.field8959.method1913(var5);
	}

	@ObfuscatedName("lp.vp(Lrn;I)V")
	public static final void method6023(ClientScriptState arg0) {
		if (client.field9121 == 0) {
			arg0.intStack[++arg0.isp - 1] = -2;
		} else if (client.field9121 == 1) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = client.field9206;
		}
	}

	@ObfuscatedName("oc.vy(Lrn;I)V")
	public static final void method7382(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9121 != 2 || var1 >= client.field9206) {
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		class47 var2 = client.field9209[var1];
		arg0.objectStack[++arg0.osp - 1] = var2.field649;
		if (var2.field646 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.field646;
		}
	}

	@ObfuscatedName("fr.vc(Lrn;I)V")
	public static final void method3524(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.intStack[++arg0.isp - 1] = client.field9209[var1].field647;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("ay.wf(Lrn;B)V")
	public static final void method1679(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.intStack[++arg0.isp - 1] = client.field9209[var1].field652;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("lg.wq(Lrn;I)V")
	public static final void method5809(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		client.method6257(var1, var2);
	}

	@ObfuscatedName("qx.wi(Lrn;I)V")
	public static final void method8065(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		client.method2940(var1);
	}

	@ObfuscatedName("v.wv(Lrn;I)V")
	public static final void method1204(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Statics.method12716(var1);
	}

	@ObfuscatedName("ga.ws(Lrn;I)V")
	public static final void method4108(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		Statics.method11369(var1);
	}

	@ObfuscatedName("dd.wc(Lrn;I)V")
	public static final void method2811(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1.startsWith(class32.method6076(0)) || var1.startsWith(class32.method6076(1))) {
			var1 = var1.substring(7);
		}
		arg0.intStack[++arg0.isp - 1] = client.method3546(var1) ? 1 : 0;
	}

	@ObfuscatedName("df.wr(Lrn;I)V")
	public static final void method2836(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.objectStack[++arg0.osp - 1] = client.field9209[var1].field648;
		} else {
			arg0.objectStack[++arg0.osp - 1] = "";
		}
	}

	@ObfuscatedName("c.wl(Lrn;I)V")
	public static final void method1324(ClientScriptState arg0) {
		if (client.field9182 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = class523.method3633(client.field9182);
		}
	}

	@ObfuscatedName("zu.wy(Lrn;I)V")
	public static final void method13853(ClientScriptState arg0) {
		if (client.field9182 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field7045;
		}
	}

	@ObfuscatedName("c.wn(Lrn;B)V")
	public static final void method1325(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Statics.field5180[var1].field791;
		}
	}

	@ObfuscatedName("nv.wg(Lrn;I)V")
	public static final void method6791(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field5180[var1].field789;
		}
	}

	@ObfuscatedName("abs.wa(Lrn;B)V")
	public static final void method14266(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field5180[var1].field788;
		}
	}

	@ObfuscatedName("lq.wj(Lrn;I)V")
	public static final void method5924(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4311;
	}

	@ObfuscatedName("kj.wo(Lrn;I)V")
	public static final void method5545(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		client.method12449(var1);
	}

	@ObfuscatedName("afu.wx(Lrn;I)V")
	public static final void method15893(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field7353;
	}

	@ObfuscatedName("dl.ww(Lrn;I)V")
	public static final void method2605(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		client.method3925(var1);
	}

	@ObfuscatedName("ji.wz(Lrn;I)V")
	public static final void method4791(ClientScriptState arg0) {
		client.method3979();
	}

	@ObfuscatedName("ec.we(Lrn;S)V")
	public static final void method3448(ClientScriptState arg0) {
		if (client.field9121 == 0) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = client.field9211;
		}
	}

	@ObfuscatedName("fm.wu(Lrn;B)V")
	public static final void method3628(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1.startsWith(class32.method6076(0)) || var1.startsWith(class32.method6076(1))) {
			var1 = var1.substring(7);
		}
		arg0.intStack[++arg0.isp - 1] = client.method11167(var1) ? 1 : 0;
	}

	@ObfuscatedName("j.wm(Lrn;I)V")
	public static final void method1247(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Statics.field5180 == null || var1 >= Statics.field7045 || !Statics.field5180[var1].field786.equalsIgnoreCase(Statics.field2119.field10040)) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
		}
	}

	@ObfuscatedName("jx.wk(Lrn;B)V")
	public static final void method4751(ClientScriptState arg0) {
		if (client.field9220 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = client.field9220;
		}
	}

	@ObfuscatedName("pu.wb(Lrn;I)V")
	public static final void method7989(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Statics.field5180[var1].field790;
		}
	}

	@ObfuscatedName("ct.xa(Lrn;B)V")
	public static final void method2539(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1.startsWith(class32.method6076(0)) || var1.startsWith(class32.method6076(1))) {
			var1 = var1.substring(7);
		}
		arg0.intStack[++arg0.isp - 1] = client.method8729(var1);
	}

	@ObfuscatedName("wd.xx(Lrn;I)V")
	public static final void method12503(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (var1.startsWith(class32.method6076(0)) || var1.startsWith(class32.method6076(1))) {
			var1 = var1.substring(7);
		}
		arg0.intStack[++arg0.isp - 1] = client.method11161(var1);
	}

	@ObfuscatedName("al.xh(Lrn;B)V")
	public static final void method1817(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field7046;
	}

	@ObfuscatedName("vv.xb(Lrn;I)V")
	public static final void method12368(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		client.method13904(var1, true);
	}

	@ObfuscatedName("io.xo(Lrn;I)V")
	public static final void method4603(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9182 == null || var1 >= Statics.field7045) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = Statics.field5180[var1].field786;
		}
	}

	@ObfuscatedName("cr.xk(Lrn;I)V")
	public static final void method2353(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9121 == 0 || var1 >= client.field9211) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = client.field8999[var1].field639;
		}
	}

	@ObfuscatedName("mk.xp(Lrn;I)V")
	public static final void method6357(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.field9121 == 2 && var1 < client.field9206) {
			arg0.intStack[++arg0.isp - 1] = client.field9209[var1].field651 ? 1 : 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("jf.xl(Lrn;B)V")
	public static final void method4747(ClientScriptState arg0) {
		if (Statics.field913 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
			arg0.field5226 = Statics.field913;
		}
	}

	@ObfuscatedName("it.xe(Lrn;B)V")
	public static final void method4709(ClientScriptState arg0) {
		if (Statics.field2972 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
			arg0.field5226 = Statics.field2972;
		}
	}

	@ObfuscatedName("sv.xf(Lrn;S)V")
	public static final void method11299(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = arg0.field5226.field2349;
	}

	@ObfuscatedName("rb.xw(Lrn;I)V")
	public static final void method11056(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2366 ? 1 : 0;
	}

	@ObfuscatedName("px.xu(Lrn;I)V")
	public static final void method7721(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2352;
	}

	@ObfuscatedName("iw.xd(Lrn;I)V")
	public static final void method4563(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2353;
	}

	@ObfuscatedName("rk.xr(Lrn;I)V")
	public static final void method8483(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2350;
	}

	@ObfuscatedName("jx.xv(Lrn;I)V")
	public static final void method4755(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2346;
	}

	@ObfuscatedName("fi.xs(Lrn;S)V")
	public static final void method3663(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = arg0.field5226.field2355[var1];
	}

	@ObfuscatedName("ge.xt(Lrn;B)V")
	public static final void method3984(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2358[var1];
	}

	@ObfuscatedName("on.xg(Lrn;B)V")
	public static final void method7181(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2356;
	}

	@ObfuscatedName("qb.xi(Lrn;I)V")
	public static final void method8455(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = arg0.field5226.field2367[var1];
	}

	@ObfuscatedName("ix.xj(Lrn;I)V")
	public static final void method4617(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.method4042(var1, var2, var3);
	}

	@ObfuscatedName("lu.xn(Lrn;I)V")
	public static final void method5832(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2364;
	}

	@ObfuscatedName("af.xc(Lrn;I)V")
	public static final void method1685(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2363;
	}

	@ObfuscatedName("im.xz(Lrn;I)V")
	public static final void method4639(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.method4041((String) arg0.objectStack[--arg0.osp]);
	}

	@ObfuscatedName("iv.xm(Lrn;I)V")
	public static final void method4582(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = arg0.field5226.method4047()[arg0.intStack[arg0.isp - 1]];
	}

	@ObfuscatedName("mx.yp(Lrn;I)V")
	public static final void method6073(ClientScriptState arg0) {
		client.method8064(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("e.yc(Lrn;I)V")
	public static final void method1667(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.field5226.field2361[var1];
	}

	@ObfuscatedName("iw.ye(Lrn;I)V")
	public static final void method4565(ClientScriptState arg0) {
		if (Statics.field1515 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
			arg0.field5217 = Statics.field1515;
		}
	}

	@ObfuscatedName("nn.yh(Lrn;I)V")
	public static final void method6883(ClientScriptState arg0) {
		if (Statics.field8458 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
			arg0.field5217 = Statics.field8458;
		}
	}

	@ObfuscatedName("nv.yf(Lrn;I)V")
	public static final void method6793(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = arg0.field5217.field9427;
	}

	@ObfuscatedName("wy.yw(Lrn;I)V")
	public static final void method12635(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5217.field9432;
	}

	@ObfuscatedName("ow.yd(Lrn;I)V")
	public static final void method7345(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5217.field9434;
	}

	@ObfuscatedName("gp.yl(Lrn;B)V")
	public static final void method3908(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5217.field9430;
	}

	@ObfuscatedName("fh.yy(Lrn;I)V")
	public static final void method3653(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.field5217.field9429[var1].field2342;
	}

	@ObfuscatedName("xo.ys(Lrn;I)V")
	public static final void method12758(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = arg0.field5217.field9429[var1].field2341;
	}

	@ObfuscatedName("oe.ym(Lrn;I)V")
	public static final void method7321(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.field5217.method14963((String) arg0.objectStack[--arg0.osp]);
	}

	@ObfuscatedName("bj.yj(Lrn;I)V")
	public static final void method2021(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = arg0.field5217.method14965()[arg0.intStack[arg0.isp - 1]];
	}

	@ObfuscatedName("aaj.yn(Lrn;B)V")
	public static final void method14131(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field5051 == null ? 0 : 1;
	}

	@ObfuscatedName("mf.yu(Lrn;B)V")
	public static final void method6080(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = client.field9184[var1].method6020();
	}

	@ObfuscatedName("qb.ya(Lrn;B)V")
	public static final void method8456(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = client.field9184[var1].field3758;
	}

	@ObfuscatedName("cd.yx(Lrn;I)V")
	public static final void method2491(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = client.field9184[var1].field3762;
	}

	@ObfuscatedName("qo.yz(Lrn;I)V")
	public static final void method8079(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = client.field9184[var1].field3761;
	}

	@ObfuscatedName("sa.yg(Lrn;B)V")
	public static final void method11166(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = client.field9184[var1].field3760;
	}

	@ObfuscatedName("fk.yb(Lrn;I)V")
	public static final void method3636(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = client.field9184[var1].field3763;
	}

	@ObfuscatedName("ed.yr(Lrn;B)V")
	public static final void method3081(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = client.field9184[var1].method6017();
		arg0.intStack[++arg0.isp - 1] = var2 == 0 ? 1 : 0;
	}

	@ObfuscatedName("mk.yt(Lrn;I)V")
	public static final void method6358(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = client.field9184[var1].method6017();
		arg0.intStack[++arg0.isp - 1] = var2 == 2 ? 1 : 0;
	}

	@ObfuscatedName("an.yq(Lrn;B)V")
	public static final void method1714(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = client.field9184[var1].method6017();
		arg0.intStack[++arg0.isp - 1] = var2 == 5 ? 1 : 0;
	}

	@ObfuscatedName("vj.yk(Lrn;I)V")
	public static final void method12328(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = client.field9184[var1].method6017();
		arg0.intStack[++arg0.isp - 1] = var2 == 1 ? 1 : 0;
	}

	@ObfuscatedName("act.zv(Lrn;I)V")
	public static final void method14812(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 - var2;
	}

	@ObfuscatedName("fe.zu(Lrn;B)V")
	public static final void method3841(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 * var2;
	}

	@ObfuscatedName("e.zw(Lrn;B)V")
	public static final void method1668(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 / var2;
	}

	@ObfuscatedName("aj.zb(Lrn;I)V")
	public static final void method1961(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = (int) (Math.random() * (double) var1);
	}

	@ObfuscatedName("ei.zc(Lrn;I)V")
	public static final void method3227(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = (int) (Math.random() * (double) (var1 + 1));
	}

	@ObfuscatedName("nh.zf(Lrn;I)V")
	public static final void method6877(ClientScriptState arg0) {
		arg0.isp -= 5;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		arg0.intStack[++arg0.isp - 1] = (var2 - var1) * (var5 - var3) / (var4 - var3) + var1;
	}

	@ObfuscatedName("ob.ze(Lrn;I)V")
	public static final void method7279(ClientScriptState arg0) {
		arg0.isp -= 2;
		long var1 = (long) arg0.intStack[arg0.isp];
		long var3 = (long) arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = (int) (var1 * var3 / 100L + var1);
	}

	@ObfuscatedName("pc.zz(Lrn;B)V")
	public static final void method7888(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 & -1 - (0x1 << var2);
	}

	@ObfuscatedName("vt.zi(Lrn;B)V")
	public static final void method12211(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = (var1 & 0x1 << var2) == 0 ? 0 : 1;
	}

	@ObfuscatedName("zs.zt(Lrn;B)V")
	public static final void method13888(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 % var2;
	}

	@ObfuscatedName("k.zy(Lrn;B)V")
	public static final void method1606(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var1 == 0) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = (int) Math.pow((double) var1, (double) var2);
		}
	}

	@ObfuscatedName("bj.zs(Lrn;I)V")
	public static final void method2022(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var1 == 0) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else if (var2 == 0) {
			arg0.intStack[++arg0.isp - 1] = Integer.MAX_VALUE;
		} else {
			arg0.intStack[++arg0.isp - 1] = (int) Math.pow((double) var1, 1.0D / (double) var2);
		}
	}

	@ObfuscatedName("sx.zr(Lrn;I)V")
	public static final void method11296(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 & var2;
	}

	@ObfuscatedName("ey.zm(Lrn;I)V")
	public static final void method3474(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 | var2;
	}

	@ObfuscatedName("aes.or(Lrn;I)V")
	public static final void method15655(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 < var2 ? var1 : var2;
	}

	@ObfuscatedName("qr.zl(Lrn;I)V")
	public static final void method8089(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1 > var2 ? var1 : var2;
	}

	@ObfuscatedName("zz.zq(Lrn;B)V")
	public static final void method13879(ClientScriptState arg0) {
		arg0.isp -= 3;
		long var1 = (long) arg0.intStack[arg0.isp];
		long var3 = (long) arg0.intStack[arg0.isp + 1];
		long var5 = (long) arg0.intStack[arg0.isp + 2];
		arg0.intStack[++arg0.isp - 1] = (int) (var1 * var5 / var3);
	}

	@ObfuscatedName("ae.zh(Lrn;B)V")
	public static final void method1973(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var1 > 700 || var2 > 700) {
			arg0.intStack[++arg0.isp - 1] = 256;
		}
		double var3 = (Math.random() * (double) (var1 + var2) - (double) var1 + 800.0D) / 100.0D;
		arg0.intStack[++arg0.isp - 1] = (int) (Math.pow(2.0D, var3) + 0.5D);
	}

	@ObfuscatedName("pu.zp(Lrn;I)V")
	public static final void method7990(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field5083[class482.method3444(var1) & 0xFFFF];
	}

	@ObfuscatedName("pl.zo(Lrn;I)V")
	public static final void method7909(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = var1 + var2;
	}

	@ObfuscatedName("fw.zx(Lrn;B)V")
	public static final void method3672(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		arg0.objectStack[++arg0.osp - 1] = var1 + var2;
	}

	@ObfuscatedName("fl.zj(Lrn;B)V")
	public static final void method3568(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = var1 + class526.method1601(var2, true);
	}

	@ObfuscatedName("et.zd(Lrn;I)V")
	public static final void method2919(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = class32.method3978(var1);
	}

	@ObfuscatedName("oo.zg(Lrn;B)V")
	public static final void method7553(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = class604.method11921(Statics.method5541(arg0.intStack[--arg0.isp]), Statics.field2308.method6339());
	}

	@ObfuscatedName("md.aar(Lrn;I)V")
	public static final void method6581(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		if (Statics.field2119.field10044 != null && Statics.field2119.field10044.field5005) {
			arg0.objectStack[++arg0.osp - 1] = var2;
		} else {
			arg0.objectStack[++arg0.osp - 1] = var1;
		}
	}

	@ObfuscatedName("gq.aak(Lrn;I)V")
	public static final void method3924(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = Integer.toString(var1);
	}

	@ObfuscatedName("fe.aab(Lrn;I)V")
	public static final void method3842(ClientScriptState arg0) {
		arg0.osp -= 2;
		arg0.intStack[++arg0.isp - 1] = class522.method4794((String) arg0.objectStack[arg0.osp], (String) arg0.objectStack[arg0.osp + 1], Statics.field2308);
	}

	@ObfuscatedName("iq.aah(Lrn;I)V")
	public static final void method4572(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		class603 var4 = class603.method12156(Statics.field8745, var3, 0);
		arg0.intStack[++arg0.isp - 1] = var4.method12394(var1, var2, Statics.field8538);
	}

	@ObfuscatedName("vg.aaw(Lrn;I)V")
	public static final void method12224(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		class603 var4 = class603.method12156(Statics.field8745, var3, 0);
		arg0.intStack[++arg0.isp - 1] = var4.method12393(var1, var2, Statics.field8538);
	}

	@ObfuscatedName("zz.aae(Lrn;I)V")
	public static final void method13881(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		if (arg0.intStack[--arg0.isp] == 1) {
			arg0.objectStack[++arg0.osp - 1] = var1;
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2;
		}
	}

	@ObfuscatedName("iu.aan(Lrn;B)V")
	public static final void method4670(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.objectStack[++arg0.osp - 1] = class121.method4597(var1);
	}

	@ObfuscatedName("oy.aaz(Lrn;I)V")
	public static final void method7393(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		if (var2 == -1) {
			throw new RuntimeException("");
		}
		arg0.objectStack[++arg0.osp - 1] = var1 + (char) var2;
	}

	@ObfuscatedName("ec.aap(Lrn;S)V")
	public static final void method3445(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = class526.method6078((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("b.aax(Lrn;I)V")
	public static final void method1593(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.method12993((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("mp.aad(Lrn;I)V")
	public static final void method6255(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = class526.method14808((char) var1) ? 1 : 0;
	}

	@ObfuscatedName("dm.aao(Lrn;B)V")
	public static final void method2886(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		arg0.objectStack[++arg0.osp - 1] = var1.substring(var2, var3);
	}

	@ObfuscatedName("ot.aaf(Lrn;B)V")
	public static final void method7373(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
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
		arg0.objectStack[++arg0.osp - 1] = var2.toString();
	}

	@ObfuscatedName("md.aas(Lrn;I)V")
	public static final void method6584(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 2;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("dh.aag(Lrn;B)V")
	public static final void method2708(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		int var3 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = var1.indexOf(var2, var3);
	}

	@ObfuscatedName("qr.aaa(Lrn;B)V")
	public static final void method8090(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Character.toLowerCase((char) var1);
	}

	@ObfuscatedName("tv.aac(Lrn;B)V")
	public static final void method11758(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] != 0;
		int var2 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = class522.method11664((long) var2, 0, var1, Statics.field2308);
	}

	@ObfuscatedName("jh.aal(Lrn;I)V")
	public static final void method4787(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		class603 var3 = class603.method12156(Statics.field8745, var2, 0);
		arg0.intStack[++arg0.isp - 1] = var3.method12390(var1, Statics.field8538);
	}

	@ObfuscatedName("fz.aai(Lrn;I)V")
	public static final void method3659(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = class604.method6888((long) arg0.intStack[--arg0.isp] * 60000L, Statics.field2308.method6339(), true) + " UTC";
	}

	@ObfuscatedName("al.aau(Lrn;B)V")
	public static final void method1818(ClientScriptState arg0) {
		long var1 = arg0.longStack[--arg0.lsp];
		arg0.objectStack[++arg0.osp - 1] = var1 == -1L ? "" : Long.toString(var1, 36).toUpperCase();
	}

	@ObfuscatedName("zl.aaq(Lrn;I)V")
	public static final void method13895(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = Statics.field3492.method12316(var1).field7125;
	}

	@ObfuscatedName("fr.aav(Lrn;I)V")
	public static final void method3528(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class592 var3 = Statics.field3492.method12316(var1);
		if (var2 < 1 || var2 > 5 || var3.field7082[var2 - 1] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var3.field7082[var2 - 1];
		}
	}

	@ObfuscatedName("yf.aaj(Lrn;B)V")
	public static final void method12900(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class592 var3 = Statics.field3492.method12316(var1);
		if (var2 < 1 || var2 > 5 || var3.field7083[var2 - 1] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var3.field7083[var2 - 1];
		}
	}

	@ObfuscatedName("acy.abf(Lrn;B)V")
	public static final void method14962(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field3492.method12316(var1).field7080;
	}

	@ObfuscatedName("cy.abx(Lrn;I)V")
	public static final void method2589(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class592 var2 = Statics.field3492.method12316(var1);
		if (var2.field7108 >= 0 && var2.field7107 >= 0) {
			arg0.intStack[++arg0.isp - 1] = var2.field7107;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1;
		}
	}

	@ObfuscatedName("io.abn(Lrn;I)V")
	public static final void method4605(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field3492.method12316(var1).field7087;
	}

	@ObfuscatedName("rw.abr(Lrn;I)V")
	public static final void method8603(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field3492.method12316(var1).field7089;
	}

	@ObfuscatedName("qe.abu(Lrn;I)V")
	public static final void method8317(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field3492.method12316(var1).field7099 ? 1 : 0;
	}

	@ObfuscatedName("dn.abw(Lrn;I)V")
	public static final void method2863(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class613 var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.objectStack[++arg0.osp - 1] = Statics.field3492.method12316(var1).method12248(var2, var3.field7288);
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field3492.method12316(var1).method12250(var2, var3.field7287);
		}
	}

	@ObfuscatedName("aau.abb(Lrn;B)V")
	public static final void method14089(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1] - 1;
		class592 var3 = Statics.field3492.method12316(var1);
		arg0.intStack[++arg0.isp - 1] = var3.method12252(var2);
	}

	@ObfuscatedName("gf.abl(Lrn;I)V")
	public static final void method4005(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		int var2 = arg0.intStack[--arg0.isp];
		client.method13898(var1, var2 == 1);
		arg0.intStack[++arg0.isp - 1] = Statics.field1539;
	}

	@ObfuscatedName("zt.abc(Lrn;I)V")
	public static final void method13885(ClientScriptState arg0) {
		if (Statics.field579 == null || Statics.field8729 >= Statics.field1539) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field579[++Statics.field8729 - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("afs.abi(Lrn;I)V")
	public static final void method15784(ClientScriptState arg0) {
		Statics.field8729 = 0;
	}

	@ObfuscatedName("ar.abq(Lrn;I)V")
	public static final void method1700(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		arg0.isp -= 3;
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		int var4 = arg0.intStack[arg0.isp + 2];
		client.method11081(var1, var2 == 1, var3, var4);
		arg0.intStack[++arg0.isp - 1] = Statics.field1539;
	}

	@ObfuscatedName("lu.abm(Lrn;I)V")
	public static final void method5828(ClientScriptState arg0) {
		arg0.osp -= 2;
		arg0.isp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		int var2 = arg0.intStack[arg0.isp];
		int var3 = arg0.intStack[arg0.isp + 1];
		String var4 = (String) arg0.objectStack[arg0.osp + 1];
		client.method1379(var1, var2 == 1, var3, var4);
		arg0.intStack[++arg0.isp - 1] = Statics.field1539;
	}

	@ObfuscatedName("su.abv(Lrn;I)V")
	public static final void method11199(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class592 var2 = Statics.field3492.method12316(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field7086 ? 1 : 0;
	}

	@ObfuscatedName("aw.abh(Lrn;I)V")
	public static final void method1883(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class592 var2 = Statics.field3492.method12316(var1);
		int var3;
		if (var2.field7086) {
			var3 = var2.field7097;
		} else if (var2.field7099) {
			var3 = Statics.field1736.field5127;
		} else {
			var3 = Statics.field1736.field5128;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("uv.abe(Lrn;I)V")
	public static final void method12164(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class613 var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.objectStack[++arg0.osp - 1] = Statics.field3774.method12565(var1).method12515(var2, var3.field7288);
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field3774.method12565(var1).method12514(var2, var3.field7287);
		}
	}

	@ObfuscatedName("lo.abd(Lrn;S)V")
	public static final void method5788(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class613 var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.objectStack[++arg0.osp - 1] = client.field8980.method6103().method11471(var1).method11417(var2, var3.field7288);
		} else {
			arg0.intStack[++arg0.isp - 1] = client.field8980.method6103().method11471(var1).method11444(var2, var3.field7287);
		}
	}

	@ObfuscatedName("ow.abg(Lrn;I)V")
	public static final void method7346(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class613 var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.objectStack[++arg0.osp - 1] = Statics.field4214.method12383(var1).method16782(var2, var3.field7288);
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field4214.method12383(var1).method16777(var2, var3.field7287);
		}
	}

	@ObfuscatedName("ahr.abt(Lrn;B)V")
	public static final void method16115(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class613 var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.objectStack[++arg0.osp - 1] = Statics.field566.method11144(var1).method11127(var2, var3.field7288);
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field566.method11144(var1).method11121(var2, var3.field7287);
		}
	}

	@ObfuscatedName("dn.abs(Lrn;I)V")
	public static final void method2869(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class439 var2 = Statics.field3769.method7784(var1);
		if (var2.field4689 == null || var2.field4689.length <= 0) {
			arg0.intStack[++arg0.isp - 1] = var2.field4688;
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
		arg0.intStack[++arg0.isp - 1] = var2.field4689[var3];
	}

	@ObfuscatedName("nj.abo(Lrn;I)V")
	public static final void method6969(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9079 ? 1 : 0;
	}

	@ObfuscatedName("c.aba(Lrn;I)V")
	public static final void method1326(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (client.state != 15 || Statics.method16489()) {
			client.field9030 = -5;
		} else if (var1.length() > 20) {
			client.field9030 = -4;
		} else {
			client.field9030 = -1;
			class792 var2 = class792.method14781(class280.field2861, client.field8959.field834);
			var2.field9467.p1(0);
			int var3 = var2.field9467.pos;
			var2.field9467.pjstr(var1);
			var2.field9467.method15251(var2.field9467.pos - var3);
			client.field8959.method1913(var2);
		}
	}

	@ObfuscatedName("qy.abz(Lrn;B)V")
	public static final void method8348(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9030;
		if (client.field9030 != -1) {
			client.field9030 = -6;
		}
	}

	@ObfuscatedName("ey.acc(Lrn;B)V")
	public static final void method3476(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9177;
	}

	@ObfuscatedName("pq.acp(Lrn;I)V")
	public static final void method7714(ClientScriptState arg0) {
		arg0.isp -= 3;
		client.field9177 = arg0.intStack[arg0.isp];
		Statics.field769 = class559.method11235(arg0.intStack[arg0.isp + 1]);
		if (Statics.field769 == null) {
			Statics.field769 = class559.field6697;
		}
		client.field9178 = arg0.intStack[arg0.isp + 2];
		class64 var1 = client.method4104();
		class792 var2 = class792.method14781(class280.field2922, var1.field834);
		var2.field9467.p1(client.field9177);
		var2.field9467.p1(Statics.field769.field6699);
		var2.field9467.p1(client.field9178);
		var1.method1913(var2);
	}

	@ObfuscatedName("os.aca(Lrn;S)V")
	public static final void method7229(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		arg0.isp -= 2;
		int var3 = arg0.intStack[arg0.isp];
		int var4 = arg0.intStack[arg0.isp + 1];
		if (var2 == null) {
			var2 = "";
		}
		if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}
		class64 var5 = client.method4104();
		class792 var6 = class792.method14781(class280.field2926, var5.field834);
		var6.field9467.p1(Statics.method1724(var1) + 2 + Statics.method1724(var2));
		var6.field9467.pjstr(var1);
		var6.field9467.p1(var3 - 1);
		var6.field9467.p1(var4);
		var6.field9467.pjstr(var2);
		var5.method1913(var6);
	}

	@ObfuscatedName("mb.acv(Lrn;I)V")
	public static final void method6477(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2110 != null) {
			var3 = var2.field2110;
		}
		arg0.objectStack[++arg0.osp - 1] = var3;
	}

	@ObfuscatedName("da.acl(Lrn;B)V")
	public static final void method2817(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		int var3 = -1;
		if (var2 != null) {
			var3 = var2.field2104;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("xz.acr(Lrn;I)V")
	public static final void method12856(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class64 var2 = client.method4104();
		class792 var3 = class792.method14781(class280.field2862, var2.field834);
		var3.field9467.p1(var1);
		var2.method1913(var3);
	}

	@ObfuscatedName("gf.ach(Lrn;B)V")
	public static final void method4003(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		if (client.field9074 == 0 && (client.field9054 && !client.field9077 || client.field9081)) {
			return;
		}
		class64 var3 = client.method4104();
		class792 var4 = class792.method14781(class280.field2919, var3.field834);
		var4.field9467.p2(0);
		int var5 = var4.field9467.pos;
		var4.field9467.pjstr(var1);
		class178.method14081(var4.field9467, var2);
		var4.field9467.psize2(var4.field9467.pos - var5);
		var3.method1913(var4);
	}

	@ObfuscatedName("rz.acz(Lrn;B)V")
	public static final void method8657(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2106 != null) {
			var3 = var2.field2106;
		}
		arg0.objectStack[++arg0.osp - 1] = var3;
	}

	@ObfuscatedName("fg.acb(Lrn;B)V")
	public static final void method3640(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2109 != null) {
			var3 = var2.field2109;
		}
		arg0.objectStack[++arg0.osp - 1] = var3;
	}

	@ObfuscatedName("pq.act(Lrn;I)V")
	public static final void method7715(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		int var3 = -1;
		if (var2 != null) {
			var3 = var2.field2102;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("az.acj(Lrn;I)V")
	public static final void method1945(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9178;
	}

	@ObfuscatedName("fd.acd(Lrn;B)V")
	public static final void method3508(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class175.method7655();
	}

	@ObfuscatedName("rx.acq(Lrn;B)V")
	public static final void method8583(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		int var3 = 0;
		if (var2 != null) {
			var3 = var2.field2111;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("sm.acs(Lrn;I)V")
	public static final void method11184(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2107 != null) {
			var3 = var2.field2107;
		}
		arg0.objectStack[++arg0.osp - 1] = var3;
	}

	@ObfuscatedName("cg.aco(Lrn;I)V")
	public static final void method2555(ClientScriptState arg0) {
		String var1;
		if (Statics.field2119 == null || Statics.field2119.field10063 == null) {
			var1 = "";
		} else {
			var1 = Statics.field2119.method16121(false);
		}
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("lc.acg(Lrn;I)V")
	public static final void method5966(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		int var3 = -1;
		if (var2 != null) {
			var3 = var2.field2105;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("aj.ack(Lrn;B)V")
	public static final void method1959(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		int var3 = -1;
		if (var2 != null) {
			var3 = var2.field2103;
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("fl.acw(Lrn;I)V")
	public static final void method3569(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class176 var2 = class175.method3941(var1);
		String var3 = "";
		if (var2 != null && var2.field2108 != null) {
			var3 = var2.field2108;
		}
		arg0.objectStack[++arg0.osp - 1] = var3;
	}

	@ObfuscatedName("afv.aci(Lrn;I)V")
	public static final void method15856(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = Statics.field3262.method5933(var1).field10357;
	}

	@ObfuscatedName("ae.acu(Lrn;I)V")
	public static final void method1967(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class950 var2 = Statics.field3262.method5933(var1);
		if (var2.field10359 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field10359.length;
		}
	}

	@ObfuscatedName("fe.ace(Lrn;I)V")
	public static final void method3845(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class950 var3 = Statics.field3262.method5933(var1);
		int var4 = var3.field10359[var2];
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("np.acn(Lrn;I)V")
	public static final void method6880(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class950 var2 = Statics.field3262.method5933(var1);
		if (var2.field10356 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field10356.length;
		}
	}

	@ObfuscatedName("ew.acy(Lrn;I)V")
	public static final void method3205(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Statics.field3262.method5933(var1).field10356[var2];
	}

	@ObfuscatedName("ed.adh(Lrn;I)V")
	public static final void method3082(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.objectStack[++arg0.osp - 1] = Statics.field3779.method12176(var1).method16750();
	}

	@ObfuscatedName("ow.adf(Lrn;I)V")
	public static final void method7347(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class955 var2 = Statics.field3779.method12176(var1);
		if (var2.field10393 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field10393.length;
		}
	}

	@ObfuscatedName("ed.adn(Lrn;I)V")
	public static final void method3085(ClientScriptState arg0) {
		arg0.field5213 = new class270();
		arg0.field5213.field2655 = arg0.intStack[--arg0.isp];
		arg0.field5213.field2656 = Statics.field3779.method12176(arg0.field5213.field2655);
		arg0.field5213.field2657 = new int[arg0.field5213.field2656.method16751()];
	}

	@ObfuscatedName("d.ada(Lrn;I)V")
	public static final void method1359(ClientScriptState arg0) {
		class64 var1 = client.method4104();
		class792 var2 = class792.method14781(class280.field2936, var1.field834);
		var2.field9467.p1(0);
		int var3 = var2.field9467.pos;
		var2.field9467.p1(0);
		var2.field9467.p2(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var2.field9467, arg0.field5213.field2657);
		var2.field9467.method15251(var2.field9467.pos - var3);
		var1.method1913(var2);
	}

	@ObfuscatedName("ga.adc(Lrn;B)V")
	public static final void method4105(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		class64 var2 = client.method4104();
		class792 var3 = class792.method14781(class280.field2901, var2.field834);
		var3.field9467.p1(0);
		int var4 = var3.field9467.pos;
		var3.field9467.pjstr(var1);
		var3.field9467.p2(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var3.field9467, arg0.field5213.field2657);
		var3.field9467.method15251(var3.field9467.pos - var4);
		var2.method1913(var3);
	}

	@ObfuscatedName("ga.ade(Lrn;I)V")
	public static final void method4106(ClientScriptState arg0) {
		class64 var1 = client.method4104();
		class792 var2 = class792.method14781(class280.field2936, var1.field834);
		var2.field9467.p1(0);
		int var3 = var2.field9467.pos;
		var2.field9467.p1(1);
		var2.field9467.p2(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var2.field9467, arg0.field5213.field2657);
		var2.field9467.method15251(var2.field9467.pos - var3);
		var1.method1913(var2);
	}

	@ObfuscatedName("pi.adm(Lrn;I)V")
	public static final void method7903(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Statics.field3262.method5933(var1).field10358[var2];
	}

	@ObfuscatedName("ex.adr(Lrn;I)V")
	public static final void method3308(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = Statics.field3262.method5933(var1).field10360[var2];
	}

	@ObfuscatedName("dq.adg(Lrn;B)V")
	public static final void method2895(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var2 == -1) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field3262.method5933(var1).method16692((char) var2);
		}
	}

	@ObfuscatedName("nx.adt(Lrn;I)V")
	public static final void method6828(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var2 == -1) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field3262.method5933(var1).method16699((char) var2);
		}
	}

	@ObfuscatedName("ao.adj(Lrn;I)V")
	public static final void method1806(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field3779.method12176(var1).method16751();
	}

	@ObfuscatedName("dj.adq(Lrn;I)V")
	public static final void method2610(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.field5213.field2657[var1] = var2;
	}

	@ObfuscatedName("k.ado(Lrn;I)V")
	public static final void method1607(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.field5213.field2657[var1] = var2;
	}

	@ObfuscatedName("aei.adp(Lrn;B)V")
	public static final void method15613(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		class955 var4 = Statics.field3779.method12176(var1);
		if (var4.method16752(var2).field5029 != 0) {
			throw new RuntimeException("");
		}
		arg0.intStack[++arg0.isp - 1] = var4.method16757(var2, var3);
	}

	@ObfuscatedName("an.adk(Lrn;I)V")
	public static final void method1715(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		boolean var2 = arg0.intStack[--arg0.isp] == 1;
		client.method12143(var1, var2);
		arg0.intStack[++arg0.isp - 1] = Statics.field1539;
	}

	@ObfuscatedName("ev.adx(Lrn;I)V")
	public static final void method2984(ClientScriptState arg0) {
		if (Statics.field579 == null || Statics.field8729 >= Statics.field1539) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field579[++Statics.field8729 - 1] & 0xFFFF;
		}
	}

	@ObfuscatedName("fn.adw(Lrn;B)V")
	public static final void method3563(ClientScriptState arg0) {
		Statics.field8729 = 0;
	}

	@ObfuscatedName("nz.adl(Lrn;B)V")
	public static final void method6985(ClientScriptState arg0) {
		class64 var1 = client.method4104();
		class792 var2 = class792.method14781(class280.field2936, var1.field834);
		var2.field9467.p1(0);
		int var3 = var2.field9467.pos;
		var2.field9467.p1(3);
		var2.field9467.p2(arg0.field5213.field2655);
		arg0.field5213.field2656.method16748(var2.field9467, arg0.field5213.field2657);
		var2.field9467.method15251(var2.field9467.pos - var3);
		var1.method1913(var2);
	}

	@ObfuscatedName("rf.adv(Lrn;B)V")
	public static final void method8630(ClientScriptState arg0) {
		if (Statics.field2131.method7243(86)) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("fh.adu(Lrn;I)V")
	public static final void method3651(ClientScriptState arg0) {
		if (Statics.field2131.method7243(82)) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("qs.adb(Lrn;S)V")
	public static final void method8385(ClientScriptState arg0) {
		if (Statics.field2131.method7243(81)) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("se.ady(Lrn;I)V")
	public static final void method11114(ClientScriptState arg0) {
		class822.method12903(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("ew.adz(Lrn;I)V")
	public static final void method3204(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class822.method1603();
	}

	@ObfuscatedName("eh.aet(Lrn;I)V")
	public static final void method3067(ClientScriptState arg0) {
		class822.method8626(arg0.intStack[--arg0.isp], -1, -1, false);
	}

	@ObfuscatedName("gd.aeg(Lrn;I)V")
	public static final void method4121(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class951 var2 = class408.method7084(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field10370;
		}
	}

	@ObfuscatedName("eb.aep(Lrn;I)V")
	public static final void method3316(ClientScriptState arg0) {
		class951 var1 = class408.method7117(arg0.intStack[--arg0.isp]);
		if (var1 == null || var1.field10372 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var1.field10372;
		}
	}

	@ObfuscatedName("kg.aeb(Lrn;I)V")
	public static final void method5561(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field6423;
		arg0.intStack[++arg0.isp - 1] = Statics.field6344;
	}

	@ObfuscatedName("b.aej(Lrn;I)V")
	public static final void method1591(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4465 + Statics.field4283;
		arg0.intStack[++arg0.isp - 1] = Statics.field6770 + Statics.field4284;
	}

	@ObfuscatedName("ib.aek(Lrn;I)V")
	public static final void method4607(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class951 var2 = class408.method7117(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field10365 >> 14 & 0x3FFF;
			arg0.intStack[++arg0.isp - 1] = var2.field10365 & 0x3FFF;
		}
	}

	@ObfuscatedName("up.aee(Lrn;I)V")
	public static final void method11876(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class951 var2 = class408.method7117(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field10369 - var2.field10368;
			arg0.intStack[++arg0.isp - 1] = var2.field10371 - var2.field10364;
		}
	}

	@ObfuscatedName("iq.aeh(Lrn;I)V")
	public static final void method4570(ClientScriptState arg0) {
		class806 var1 = class822.method12725();
		if (var1 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1.field9564;
			int var2 = var1.field9565 << 28 | var1.field9566 + Statics.field4283 << 14 | var1.field9567 + Statics.field4284;
			arg0.intStack[++arg0.isp - 1] = var2;
		}
	}

	@ObfuscatedName("nx.aeq(Lrn;I)V")
	public static final void method6826(ClientScriptState arg0) {
		class806 var1 = class822.method11468();
		if (var1 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var1.field9564;
			int var2 = var1.field9565 << 28 | var1.field9566 + Statics.field4283 << 14 | var1.field9567 + Statics.field4284;
			arg0.intStack[++arg0.isp - 1] = var2;
		}
	}

	@ObfuscatedName("aem.aey(Lrn;I)V")
	public static final void method15591(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class951 var2 = class822.method12024();
		if (var2 != null) {
			boolean var3 = var2.method16705(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, result);
			if (var3) {
				class822.method12730(result[1], result[2]);
			}
		}
	}

	@ObfuscatedName("qp.aem(Lrn;I)V")
	public static final void method8197(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class552 var3 = class408.method7086(var1 >> 14 & 0x3FFF, var1 & 0x3FFF);
		boolean var4 = false;
		for (class951 var5 = (class951) var3.method11756(); var5 != null; var5 = (class951) var3.method11744()) {
			if (var5.field10370 == var2) {
				var4 = true;
				break;
			}
		}
		if (var4) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("wb.aeo(Lrn;I)V")
	public static final void method12724(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class951 var2 = class408.method7117(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
		} else {
			arg0.intStack[++arg0.isp - 1] = var2.field10367;
		}
	}

	@ObfuscatedName("ey.aen(Lrn;I)V")
	public static final void method3473(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class822.method8626(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, false);
	}

	@ObfuscatedName("ik.aei(Lrn;I)V")
	public static final void method4655(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class951 var2 = class822.method12024();
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
			return;
		}
		boolean var3 = var2.method16705(var1 >> 28 & 0x3, var1 >> 14 & 0x3FFF, var1 & 0x3FFF, result);
		if (var3) {
			arg0.intStack[++arg0.isp - 1] = result[1];
			arg0.intStack[++arg0.isp - 1] = result[2];
		} else {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		}
	}

	@ObfuscatedName("pn.aeu(Lrn;B)V")
	public static final void method7786(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class951 var2 = class822.method12024();
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
			return;
		}
		boolean var3 = var2.method16707(var1 >> 14 & 0x3FFF, var1 & 0x3FFF, result);
		if (var3) {
			arg0.intStack[++arg0.isp - 1] = result[1];
			arg0.intStack[++arg0.isp - 1] = result[2];
		} else {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = -1;
		}
	}

	@ObfuscatedName("ly.aex(Lrn;I)V")
	public static final void method5733(ClientScriptState arg0) {
		class822.method11236(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("qm.aez(Lrn;B)V")
	public static final void method8030(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class822.method8626(var1, var2 >> 14 & 0x3FFF, var2 & 0x3FFF, true);
	}

	@ObfuscatedName("gi.aec(Lrn;I)V")
	public static final void method4034(ClientScriptState arg0) {
		class822.field9758 = arg0.intStack[--arg0.isp] == 1;
	}

	@ObfuscatedName("qi.ael(Lrn;B)V")
	public static final void method8046(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class822.field9758 ? 1 : 0;
	}

	@ObfuscatedName("ms.aes(Lrn;I)V")
	public static final void method6487(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class822.method3087(var1);
	}

	@ObfuscatedName("ajo.aer(Lrn;I)V")
	public static final void method16720(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		if (class822.field9766 == null) {
			return;
		}
		class399 var3 = class822.field9766.method11923((long) var1);
		if (var3 != null && !var2) {
			var3.method6979();
		} else if (var3 == null && var2) {
			class399 var4 = new class399();
			class822.field9766.pushNode(var4, (long) var1);
		}
	}

	@ObfuscatedName("iw.aea(Lrn;B)V")
	public static final void method4566(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (class822.field9766 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			class399 var2 = class822.field9766.method11923((long) var1);
			arg0.intStack[++arg0.isp - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("po.aed(Lrn;B)V")
	public static final void method7813(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		if (class822.field9765 == null) {
			return;
		}
		class399 var3 = class822.field9765.method11923((long) var1);
		if (var3 != null && !var2) {
			var3.method6979();
		} else if (var3 == null && var2) {
			class399 var4 = new class399();
			class822.field9765.pushNode(var4, (long) var1);
		}
	}

	@ObfuscatedName("er.afp(Lrn;I)V")
	public static final void method2993(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (class822.field9765 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			class399 var2 = class822.field9765.method11923((long) var1);
			arg0.intStack[++arg0.isp - 1] = var2 == null ? 0 : 1;
		}
	}

	@ObfuscatedName("qp.afg(Lrn;B)V")
	public static final void method8199(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4292 == null ? -1 : Statics.field4292.field10370;
	}

	@ObfuscatedName("id.afx(Lrn;I)V")
	public static final void method4594(ClientScriptState arg0) {
		client.method7983();
	}

	@ObfuscatedName("al.afa(Lrn;I)V")
	public static final void method1819(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (class560.field6700) {
			client.method7282(3, var1, var2, false);
			arg0.intStack[++arg0.isp - 1] = Statics.field1587 == null ? 0 : 1;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("qr.afy(Lrn;B)V")
	public static final void method8093(ClientScriptState arg0) {
		if (class560.field6700 && Statics.field1587 != null) {
			client.method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
		}
	}

	@ObfuscatedName("acb.afh(Lrn;B)V")
	public static final void method14811(ClientScriptState arg0) {
		if (class560.field6700) {
			class562[] var1 = client.method1671();
			arg0.intStack[++arg0.isp - 1] = var1.length;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("ay.afc(Lrn;I)V")
	public static final void method1683(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (class560.field6700) {
			class562[] var2 = client.method1671();
			arg0.intStack[++arg0.isp - 1] = var2[var1].field6709;
			arg0.intStack[++arg0.isp - 1] = var2[var1].field6707;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("rc.afz(Lrn;I)V")
	public static final void method8608(ClientScriptState arg0) {
		int var1 = Statics.field6693;
		int var2 = Statics.field3315;
		int var3 = -1;
		if (class560.field6700) {
			class562[] var4 = client.method1671();
			for (int var5 = 0; var5 < var4.length; var5++) {
				class562 var6 = var4[var5];
				if (var6.field6709 == var1 && var6.field6707 == var2) {
					var3 = var5;
					break;
				}
			}
		}
		arg0.intStack[++arg0.isp - 1] = var3;
	}

	@ObfuscatedName("dm.afo(Lrn;I)V")
	public static final void method2890(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 >= 1 && var1 <= 2) {
			client.method7282(var1, -1, -1, false);
		}
	}

	@ObfuscatedName("iw.afs(Lrn;I)V")
	public static final void method4564(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9663.method15766();
	}

	@ObfuscatedName("lo.afk(Lrn;B)V")
	public static final void method5789(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 >= 1 && var1 <= 2) {
			Statics.field4961.method15448(Statics.field4961.field9663, var1);
			Statics.field4961.method15448(Statics.field4961.field9664, var1);
			Statics.method1245();
		}
	}

	@ObfuscatedName("js.afn(Lrn;B)V")
	public static final void method4804(ClientScriptState arg0) {
		arg0.osp -= 2;
		method14095((String) arg0.objectStack[arg0.osp], (String) arg0.objectStack[arg0.osp + 1], "", arg0.intStack[--arg0.isp] == 1, false);
	}

	@ObfuscatedName("cv.afb(Lrn;I)V")
	public static final void method2430(ClientScriptState arg0) {
		arg0.isp -= 2;
		Statics.field2744[arg0.intStack[arg0.isp]] = (short) class482.method16884(arg0.intStack[arg0.isp + 1]);
		Statics.field3492.method12298();
		Statics.field3492.method12297();
		Statics.field3774.method12559();
		client.method1703();
	}

	@ObfuscatedName("at.afl(Lrn;I)V")
	public static final void method1836(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var1 >= 0 && var1 < 2) {
			client.field9076[var1] = new int[var2 << 1][4];
		}
	}

	@ObfuscatedName("fw.afj(Lrn;B)V")
	public static final void method3673(ClientScriptState arg0) {
		if (class560.field6700 && Statics.field1587 != null) {
			client.method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
		}
		if (Statics.method5937() == class384.field4118) {
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
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("ot.aft(Lrn;I)V")
	public static final void method7374(ClientScriptState arg0) {
		if (class560.field6700 && Statics.field1587 != null) {
			client.method7282(Statics.field4961.field9663.method15766(), -1, -1, false);
		}
		String var1 = (String) arg0.objectStack[--arg0.osp];
		boolean var2 = arg0.intStack[--arg0.isp] == 1;
		String var3 = client.method11406() + var1;
		class383.method3613(var3, var2, Statics.field4961.field9661.method15781() == 5, client.field8915, client.field9218);
	}

	@ObfuscatedName("el.afi(Lrn;I)V")
	public static final void method3212(ClientScriptState arg0) {
		System.out.println(arg0.objectStack[--arg0.osp]);
	}

	@ObfuscatedName("aga.aff(Lrn;I)V")
	public static final void method15920(ClientScriptState arg0) {
		arg0.isp -= 12;
		class42.method3561();
		class42.method13886();
		Statics.field9426 = arg0.intStack[arg0.isp];
		Statics.field6566 = arg0.intStack[arg0.isp + 1];
		Statics.field1477 = arg0.intStack[arg0.isp + 2];
		Statics.field5052 = arg0.intStack[arg0.isp + 3];
		Statics.field8531 = arg0.intStack[arg0.isp + 4];
		Statics.field6372 = arg0.intStack[arg0.isp + 5];
		Statics.field2333 = arg0.intStack[arg0.isp + 6];
		Statics.field617 = arg0.intStack[arg0.isp + 7];
		Statics.field2338 = arg0.intStack[arg0.isp + 8];
		Statics.field8718 = arg0.intStack[arg0.isp + 9];
		Statics.field5086 = arg0.intStack[arg0.isp + 10];
		Statics.field1387 = arg0.intStack[arg0.isp + 11];
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
		class42.field613 = true;
	}

	@ObfuscatedName("jv.afw(Lrn;B)V")
	public static final void method4726(ClientScriptState arg0) {
		class42.method3963();
		class42.field613 = false;
	}

	@ObfuscatedName("acm.afu(Lrn;I)V")
	public static final void method14741(ClientScriptState arg0) {
		arg0.isp -= 2;
	}

	@ObfuscatedName("ru.agi(Lrn;I)V")
	public static final void method8623(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		arg0.intStack[++arg0.isp - 1] = class42.method8097(var1, var2) ? 1 : 0;
	}

	@ObfuscatedName("aie.agd(Lrn;I)V")
	public static final void method16249(ClientScriptState arg0) {
		class62.method7065((String) arg0.objectStack[--arg0.osp], false, false);
	}

	@ObfuscatedName("rj.aga(Lrn;B)V")
	public static final void method8602(ClientScriptState arg0) {
		class284.field3142.method4761();
	}

	@ObfuscatedName("el.ago(Lrn;I)V")
	public static final void method3215(ClientScriptState arg0) {
		class284.field3140.method4761();
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
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("ra.agw(Lrn;I)V")
	public static final void method828(ClientScriptState arg0) {
		class42.field616 = arg0.intStack[--arg0.isp];
	}

	@ObfuscatedName("eo.agf(Lrn;B)V")
	public static final void method3290(ClientScriptState arg0) {
		arg0.osp -= 3;
		method14095((String) arg0.objectStack[arg0.osp], (String) arg0.objectStack[arg0.osp + 1], (String) arg0.objectStack[arg0.osp + 2], arg0.intStack[--arg0.isp] == 1, true);
	}

	@ObfuscatedName("jv.agl(Lrn;I)V")
	public static final void method4721(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field8903 ? 1 : 0;
	}

	@ObfuscatedName("ig.agh(Lrn;I)V")
	public static final void method4558(ClientScriptState arg0) {
		if (Statics.field2305.field9707 < 6) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else if (Statics.field2305.field9707 == 6 && Statics.field2305.field9701 < 10) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
		}
	}

	@ObfuscatedName("qo.agn(Lrn;I)V")
	public static final void method8081(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.method1608(client.state) ? 1 : 0;
	}

	@ObfuscatedName("nn.agp(Lrn;I)V")
	public static final void method6884(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = GameShell.method4634().toString();
	}

	@ObfuscatedName("pk.agm(Lrn;I)V")
	public static final void method7969(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
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
		arg0.intStack[++arg0.isp - 1] = var1 ? 1 : 0;
		arg0.objectStack[++arg0.osp - 1] = var2;
	}

	@ObfuscatedName("lq.agj(Lrn;I)V")
	public static final void method5921(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		boolean var2 = Statics.field1543.method6653(new File(var1));
		arg0.intStack[++arg0.isp - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("is.agt(Lrn;I)V")
	public static final void method4636(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		class453 var5 = client.field8980.method6214();
		client.method8600((var1 >> 14 & 0x3FFF) - var5.field4836, (var1 & 0x3FFF) - var5.field4838, var2 << 2, var3, var4, false);
	}

	@ObfuscatedName("ux.ags(Lrn;B)V")
	public static final void method11907(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		class453 var5 = client.field8980.method6214();
		client.method8271((var1 >> 14 & 0x3FFF) - var5.field4836, (var1 & 0x3FFF) - var5.field4838, var2 << 2, var3, var4);
	}

	@ObfuscatedName("am.agz(Lrn;I)V")
	public static final void method1909(ClientScriptState arg0) {
		arg0.isp -= 6;
		int var1 = arg0.intStack[arg0.isp];
		if (var1 >= 2) {
			throw new RuntimeException();
		}
		client.field9033 = var1;
		int var2 = arg0.intStack[arg0.isp + 1];
		if (var2 + 1 >= client.field9076[client.field9033].length >> 1) {
			throw new RuntimeException();
		}
		client.field9035 = var2 * 4;
		client.field9219 = 0;
		client.field9038 = arg0.intStack[arg0.isp + 2];
		client.field9039 = arg0.intStack[arg0.isp + 3];
		int var3 = arg0.intStack[arg0.isp + 4];
		if (var3 >= 2) {
			throw new RuntimeException();
		}
		client.field9034 = var3;
		int var4 = arg0.intStack[arg0.isp + 5];
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
		arg0.isp -= 2;
		client.method8486(arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1], 0);
	}

	@ObfuscatedName("fr.agk(Lrn;I)V")
	public static final void method3525(ClientScriptState arg0) {
		if (Statics.field2671 == 2) {
			arg0.intStack[++arg0.isp - 1] = (int) ((double) Statics.field1307.method3791() * 2607.5945876176133D) >> 3;
		} else {
			arg0.intStack[++arg0.isp - 1] = (int) client.field9021 >> 3;
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
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 < 0) {
			var1 = 0;
		}
		client.field9027 = client.field9026 * 784 + var1;
	}

	@ObfuscatedName("kw.ahd(Lrn;B)V")
	public static final void method5551(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9027 - client.field9026 * 784;
	}

	@ObfuscatedName("p.ahz(Lrn;I)V")
	public static final void method1415(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		class453 var4 = client.field8980.method6214();
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
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 != -1) {
			Statics.field1941 = -1;
			Statics.field3308 = -1;
			return;
		}
		int var2 = var1 >> 14 & 0x3FFF;
		int var3 = var1 & 0x3FFF;
		class453 var4 = client.field8980.method6214();
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
		arg0.intStack[++arg0.isp - 1] = Statics.field2671 == 4 ? 1 : 0;
	}

	@ObfuscatedName("lo.aht(Lrn;B)V")
	public static final void method5790(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		class33.method12220(var1, var2);
	}

	@ObfuscatedName("kh.ahh(Lrn;S)V")
	public static final void method4976(ClientScriptState arg0) throws class884 {
		int var1 = arg0.intStack[--arg0.isp];
		Statics.field1307.method3692(class188.method12904(var1), true);
	}

	@ObfuscatedName("ac.ahv(Lrn;I)V")
	public static final void method1978(ClientScriptState arg0) throws class884 {
		int var1 = arg0.intStack[--arg0.isp];
		Statics.field1307.method3693(class191.method3450(var1), true);
	}

	@ObfuscatedName("ls.ahj(Lrn;I)V")
	public static final void method5711(ClientScriptState arg0) throws class884 {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
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
	public static final void method7690(ClientScriptState arg0) throws class884 {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
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
	public static final void method16940(ClientScriptState arg0) throws class884 {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		Vector3 var2 = Vector3.method5294((float) var1, (float) var1, (float) var1);
		Statics.field1307.method3700(var2);
		var2.method5291();
	}

	@ObfuscatedName("gz.ahs(Lrn;I)V")
	public static final void method3940(ClientScriptState arg0) throws class884 {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		Vector3 var2 = Vector3.method5294((float) var1, (float) var1, (float) var1);
		Statics.field1307.method3771(var2);
		var2.method5291();
	}

	@ObfuscatedName("rx.ahq(Lrn;I)V")
	public static final void method8584(ClientScriptState arg0) throws class884 {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Statics.field1307.method3705((float) var1, (float) var2);
	}

	@ObfuscatedName("gs.ahf(Lrn;I)V")
	public static final void method4112(ClientScriptState arg0) throws class884 {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		Statics.field1307.method3739((float) ((double) var1 * 3.141592653589793D * 2.0D / 16384.0D), (float) ((double) var2 * 3.141592653589793D * 2.0D / 16384.0D));
	}

	@ObfuscatedName("w.aha(Lrn;I)V")
	public static final void method1560(ClientScriptState arg0) {
		class810 var1 = (class810) arg0.objectStack[--arg0.osp];
		if (Statics.field1307.method3751() != class188.field2167) {
			throw new RuntimeException();
		}
		class868 var2 = (class868) Statics.field1307.method3716();
		var2.method15915(var1);
	}

	@ObfuscatedName("l.ahn(Lrn;B)V")
	public static final void method882(ClientScriptState arg0) {
		class810 var1 = (class810) arg0.objectStack[--arg0.osp];
		if (Statics.field1307.method3719() != class191.field2192) {
			throw new RuntimeException();
		}
		class733 var2 = (class733) Statics.field1307.method3699();
		var2.method14091(var1);
	}

	@ObfuscatedName("w.ahw(Lrn;I)V")
	public static final void method1561(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		boolean var4 = arg0.intStack[arg0.isp + 3] == 1;
		if (Statics.field1307.method3751() != class188.field2165) {
			throw new RuntimeException();
		}
		class870 var5 = (class870) Statics.field1307.method3716();
		class902 var6 = Statics.field2119;
		if (var6 != null) {
			var5.method15927(var6, new Vector3((float) var1, (float) var2, (float) var3), var4);
		}
	}

	@ObfuscatedName("abz.aho(Lrn;I)V")
	public static final void method14723(ClientScriptState arg0) {
		arg0.isp -= 7;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
		int var5 = arg0.intStack[arg0.isp + 4];
		boolean var6 = arg0.intStack[arg0.isp + 5] == 1;
		int var7 = arg0.intStack[arg0.isp + 6];
		if (Statics.field1307.method3719() != class191.field2193) {
			throw new RuntimeException();
		}
		class734 var8 = (class734) Statics.field1307.method3699();
		class316 var9 = new class316();
		class316 var10 = new class316();
		var9.method5216(0.0F, 1.0F, 0.0F, (float) ((double) var5 * 3.141592653589793D * 2.0D / 16384.0D));
		Vector3 var11 = new Vector3(1.0F, 0.0F, 0.0F);
		var11.method5318(var9);
		var11.method5329();
		var10.method5215(var11, (float) ((double) var4 * 3.141592653589793D * 2.0D / 16384.0D));
		var9.method5266(var10);
		class902 var12 = Statics.field2119;
		if (var12 != null) {
			var8.method14097(var12, new Vector3((float) var1, (float) var2, (float) var3), var9, var6, var7, client.field8980.method6101(Statics.field7324), client.field8980.method6157().field3697);
		}
	}

	@ObfuscatedName("mz.ahm(Lrn;I)V")
	public static final void method6348(ClientScriptState arg0) throws class884 {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		float var4 = (float) (Math.atan((double) ((float) var1 / 2.0F / (float) var3)) * 2.0D);
		float var5 = (float) (Math.atan((double) ((float) var2 / 2.0F / (float) var3)) * 2.0D);
		Statics.field1307.method3739(var4, var5);
	}

	@ObfuscatedName("uj.ahx(Lrn;I)V")
	public static final void method11996(ClientScriptState arg0) {
		if (Statics.field1307.method3719() != class191.field2191) {
			throw new RuntimeException();
		}
		class735 var1 = (class735) Statics.field1307.method3699();
		var1.method14126(Statics.field909, -1);
	}

	@ObfuscatedName("jc.ahi(Lrn;I)V")
	public static final void method4736(ClientScriptState arg0) {
		if (Statics.field1307.method3751() != class188.field2164) {
			throw new RuntimeException();
		}
		class871 var1 = (class871) Statics.field1307.method3716();
		var1.method15935(Statics.field909, -1);
	}

	@ObfuscatedName("dn.ahc(Lrn;I)V")
	public static final void method2864(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field1307.method3764().field2201;
	}

	@ObfuscatedName("ed.ahl(Lrn;I)V")
	public static final void method3083(ClientScriptState arg0) {
		if (Statics.field1307.method3719() != class191.field2193) {
			throw new RuntimeException();
		}
		class734 var1 = (class734) Statics.field1307.method3699();
		arg0.intStack[++arg0.isp - 1] = (int) ((double) var1.method14116() * 2607.5945876176133D) & 0x3FFF;
		arg0.intStack[++arg0.isp - 1] = (int) ((double) var1.method14103() * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("mo.ahu(Lrn;B)V")
	public static final void method6084(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		class180 var4 = class180.method7070(var1);
		float var5 = (float) var2;
		if (class180.field2126 == var4 || class180.field2128 == var4 || class180.field2129 == var4) {
			var5 = class312.method5096(var2);
		}
		class1001 var6 = new class1001(Statics.field1307.method14032(), var4, var5, (float) var3 / 1000.0F);
		Statics.field1307.method3709(var6);
		arg0.intStack[++arg0.isp - 1] = var6.field10351;
	}

	@ObfuscatedName("nf.ahb(Lrn;B)V")
	public static final void method6642(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Statics.field1307.method3710(var1);
	}

	@ObfuscatedName("afs.ahp(Lrn;B)V")
	public static final void method15787(ClientScriptState arg0) {
		Statics.field1307.method3750();
	}

	@ObfuscatedName("ai.aig(Lrn;I)V")
	public static final void method1771(ClientScriptState arg0) throws class884 {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
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
	public static final void method8407(ClientScriptState arg0) throws class884 {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		int var4 = arg0.intStack[arg0.isp + 3];
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
	public static final void method3533(ClientScriptState arg0) throws class884 {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		Vector3 var4 = Vector3.method5294((float) var1, (float) var2, (float) var3);
		Statics.field1307.method3700(var4);
		var4.method5291();
	}

	@ObfuscatedName("eh.aiz(Lrn;I)V")
	public static final void method3068(ClientScriptState arg0) throws class884 {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		Vector3 var4 = Vector3.method5294((float) var1, (float) var2, (float) var3);
		Statics.field1307.method3771(var4);
		var4.method5291();
	}

	@ObfuscatedName("fp.ais(Lrn;S)V")
	public static final void method3544(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Statics.field1307.method3719() != class191.field2193 || Statics.field1307.method3751() != class188.field2165) {
			throw new RuntimeException();
		}
		class734 var2 = (class734) Statics.field1307.method3699();
		class870 var3 = (class870) Statics.field1307.method3716();
		Vector3 var4 = var2.method14100();
		Vector3 var5 = Vector3.method5290(var4);
		var5.field3476 += var1;
		Vector3 var6 = Vector3.method5377(var3.method11550(), var5);
		var6.method5313();
		float var7 = var2.method14101().method5338();
		class318.method5379(var3.method11550(), var6, var4, var7, field5204);
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
		float var10 = class362.method4037(var4.field3475 - var9.field3475, var4.field3477 - var9.field3477);
		arg0.intStack[++arg0.isp - 1] = 0;
		arg0.intStack[++arg0.isp - 1] = (int) ((double) var10 * 2607.5945876176133D) & 0x3FFF;
	}

	@ObfuscatedName("rh.aic(Lrn;I)V")
	public static final void method8616(ClientScriptState arg0) throws class884 {
		arg0.isp -= 2;
		boolean var1 = arg0.intStack[arg0.isp] == 1;
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		Statics.field1307.method3707(var1, var2);
	}

	@ObfuscatedName("abh.aia(Lrn;I)V")
	public static final void method14218(ClientScriptState arg0) {
		float var1 = class312.method5096(arg0.intStack[--arg0.isp]);
		class1000 var2 = new class1000(Statics.field1307.method14032(), var1);
		Statics.field1307.method3709(var2);
		arg0.intStack[++arg0.isp - 1] = var2.field10351;
	}

	@ObfuscatedName("al.aix(Lrn;I)V")
	public static final void method1820(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		float var2 = class312.method5096(arg0.intStack[arg0.isp + 1]);
		class948 var3 = Statics.field1307.method3711(var1);
		if (var3 == null) {
			throw new RuntimeException("");
		} else if (var3 instanceof class1000) {
			((class1000) var3).method17143(var2);
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ks.aii(Lrn;S)V")
	public static final void method5071(ClientScriptState arg0) throws class884 {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		float var2 = (float) arg0.intStack[arg0.isp + 1] / 1000.0F;
		Statics.field1307.method3708(var1, var2);
	}

	@ObfuscatedName("nb.aik(Lrn;I)V")
	public static final void method6820(ClientScriptState arg0) throws class884 {
		int var1 = arg0.intStack[--arg0.isp];
		class192 var2 = class192.method1955(var1);
		if (var2 == null) {
			throw new RuntimeException();
		}
		Statics.field1307.method3697(var2);
	}

	@ObfuscatedName("x.aiv(Lrn;B)V")
	public static final void method1602(ClientScriptState arg0) throws class884 {
		arg0.isp -= 4;
		float var1 = (float) arg0.intStack[arg0.isp];
		float var2 = (float) arg0.intStack[arg0.isp + 1];
		float var3 = (float) arg0.intStack[arg0.isp + 2];
		float var4 = (float) arg0.intStack[arg0.isp + 3] / 1000.0F;
		Statics.field1307.method3702(Vector3.method5294(var1, var2, var3), var4);
	}

	@ObfuscatedName("dm.ait(Lrn;I)V")
	public static final void method2889(ClientScriptState arg0) throws class884 {
		Statics.field1307.method3695((float) arg0.intStack[--arg0.isp] / 1000.0F);
	}

	@ObfuscatedName("mz.aiw(Lrn;S)V")
	public static final void method6344(ClientScriptState arg0) throws class884 {
		arg0.isp -= 4;
		float var1 = (float) arg0.intStack[arg0.isp];
		float var2 = (float) arg0.intStack[arg0.isp + 1];
		float var3 = (float) arg0.intStack[arg0.isp + 2];
		float var4 = (float) arg0.intStack[arg0.isp + 3] / 1000.0F;
		Statics.field1307.method3687(Vector3.method5294(var1, var2, var3), var4);
	}

	@ObfuscatedName("ru.ail(Lrn;B)V")
	public static final void method8627(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] == 1;
		if (var1) {
			Statics.field2671 = 2;
		} else {
			client.method14029();
		}
	}

	@ObfuscatedName("on.air(Lrn;B)V")
	public static final void method7182(ClientScriptState arg0) {
		if (!Statics.method16489()) {
			class33.resetLoginState();
		}
	}

	@ObfuscatedName("r.aij(Lrn;I)V")
	public static final void method1622(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		class43.method12448(var1);
	}

	@ObfuscatedName("eo.aih(Lrn;I)V")
	public static final void method3291(ClientScriptState arg0) {
		Statics.method6024();
	}

	@ObfuscatedName("ob.aib(Lrn;B)V")
	public static final void method7281(ClientScriptState arg0) {
		arg0.osp -= 2;
		arg0.isp -= 2;
		Statics.method7789((String) arg0.objectStack[arg0.osp], (String) arg0.objectStack[arg0.osp + 1], arg0.intStack[arg0.isp], arg0.intStack[arg0.isp + 1] == 1);
	}

	@ObfuscatedName("tf.aiu(Lrn;S)V")
	public static final void method11665(ClientScriptState arg0) {
		class43.method3942(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("jj.aiq(Lrn;B)V")
	public static final void method4772(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class33.enterGameReply;
	}

	@ObfuscatedName("dd.aid(Lrn;S)V")
	public static final void method2812(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class33.field526 * 2500;
	}

	@ObfuscatedName("ut.aif(Lrn;B)V")
	public static final void method12072(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class43.method8659().method6339();
	}

	@ObfuscatedName("ne.ajs(Lrn;I)V")
	public static final void method6948(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class43.method11157().method6339();
	}

	@ObfuscatedName("oy.ajk(Lrn;B)V")
	public static final void method7392(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class43.method3012().method6339();
	}

	@ObfuscatedName("mp.ajz(Lrn;B)V")
	public static final void method6258(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class33.field509;
	}

	@ObfuscatedName("agg.aje(Lrn;B)V")
	public static final void method15931(ClientScriptState arg0) {
		Statics.method13891();
	}

	@ObfuscatedName("u.aja(Lrn;B)V")
	public static final void method1239(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class33.enterGameReply;
	}

	@ObfuscatedName("it.ajf(Lrn;I)V")
	public static final void method4717(ClientScriptState arg0) {
		arg0.osp -= 2;
		String var1 = (String) arg0.objectStack[arg0.osp];
		String var2 = (String) arg0.objectStack[arg0.osp + 1];
		class33.method14208(var1, var2);
	}

	@ObfuscatedName("jr.ajx(Lrn;I)V")
	public static final void method4780(ClientScriptState arg0) {
		client.method13897(false);
	}

	@ObfuscatedName("mz.ajo(Lrn;B)V")
	public static final void method6345(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class33.enterLobbyReply;
	}

	@ObfuscatedName("mb.ajb(Lrn;B)V")
	public static final void method6479(ClientScriptState arg0) {
		if (client.field8909 == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 1;
		}
	}

	@ObfuscatedName("gb.ajg(Lrn;B)V")
	public static final void method4009(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = (int) (client.field8910 >> 32);
		arg0.intStack[++arg0.isp - 1] = (int) (client.field8910 & 0xFFFFFFFFFFFFFFFFL);
	}

	@ObfuscatedName("fe.aju(Lrn;I)V")
	public static final void method3843(ClientScriptState arg0) {
		client.field8946 = true;
		client.method8095();
	}

	@ObfuscatedName("ed.ajp(Lrn;I)V")
	public static final void method3084(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class33.field547;
		arg0.intStack[++arg0.isp - 1] = class33.field546;
		arg0.intStack[++arg0.isp - 1] = class33.field540;
		class33.field547 = -2;
		class33.field546 = -1;
		class33.field540 = -1;
	}

	@ObfuscatedName("jc.ajv(Lrn;I)V")
	public static final void method4738(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.method16489() ? 1 : 0;
	}

	@ObfuscatedName("aej.ajm(Lrn;I)V")
	public static final void method15482(ClientScriptState arg0) {
		class33.cancelLogin();
	}

	@ObfuscatedName("xh.ajn(Lrn;B)V")
	public static final void method12740(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Statics.method11170(var1);
	}

	@ObfuscatedName("agj.ajy(Lrn;I)V")
	public static final void method15964(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = class33.field543;
	}

	@ObfuscatedName("vg.ajl(Lrn;S)V")
	public static final void method12222(ClientScriptState arg0) {
		if (client.field8922 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = client.field8922;
		}
	}

	@ObfuscatedName("ajo.aji(Lrn;I)V")
	public static final void method16721(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Statics.field4961.method15448(Statics.field4961.field9642, var1);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("aj.ajq(Lrn;I)V")
	public static final void method1960(ClientScriptState arg0) {
		boolean var1 = arg0.intStack[--arg0.isp] == 1;
		Statics.field4961.method15448(Statics.field4961.field9660, var1 ? 2 : 1);
		Statics.field4961.method15448(Statics.field4961.field9655, var1 ? 2 : 1);
		Statics.method7076();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("vg.ajd(Lrn;I)V")
	public static final void method12223(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9671, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("r.ajh(Lrn;B)V")
	public static final void method1620(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9649, arg0.intStack[--arg0.isp]);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("nn.ajj(Lrn;I)V")
	public static final void method6885(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9645, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("nd.akm(Lrn;I)V")
	public static final void method7063(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9658, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("cd.akv(Lrn;B)V")
	public static final void method2492(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9651, arg0.intStack[--arg0.isp]);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("on.akr(Lrn;B)V")
	public static final void method7183(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9650, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		client.method13901();
		client.field8980.method6139().method8154();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("pj.akb(Lrn;B)V")
	public static final void method7896(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9666, arg0.intStack[--arg0.isp] == 1 ? 2 : 0);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("lq.aku(Lrn;B)V")
	public static final void method5922(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9646, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		client.field8980.method6102();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("jv.akx(Lrn;I)V")
	public static final void method4723(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9665, arg0.intStack[--arg0.isp]);
		Statics.method5600(Statics.field4961.field9661.method15781(), false);
		Statics.method1245();
	}

	@ObfuscatedName("ef.aka(Lrn;I)V")
	public static final void method3301(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9676, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		class395.method12701();
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("s.akq(Lrn;I)V")
	public static final void method1317(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9654, arg0.intStack[--arg0.isp]);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("df.akk(Lrn;I)V")
	public static final void method2837(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = Statics.field4961.field9674.method15899();
		if (var1 == var2) {
			return;
		}
		if (client.method1608(client.state)) {
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
		Statics.field4961.method15448(Statics.field4961.field9655, arg0.intStack[--arg0.isp] == 1 ? 0 : var1);
		Statics.method7076();
	}

	@ObfuscatedName("nv.ako(Lrn;I)V")
	public static final void method6794(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		Statics.field4961.method15448(Statics.field4961.field9648, var1);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("eb.aky(Lrn;I)V")
	public static final void method3317(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9637, arg0.intStack[--arg0.isp]);
		Statics.method1245();
	}

	@ObfuscatedName("ml.aki(Lrn;B)V")
	public static final void method6243(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 < 0 || var1 > 1) {
			var1 = 0;
		}
		client.method1741(var1 == 1);
	}

	@ObfuscatedName("aha.akn(Lrn;I)V")
	public static final void method16190(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9640, arg0.intStack[--arg0.isp] == 0 ? 0 : 1);
		Statics.method1245();
	}

	@ObfuscatedName("sk.akd(Lrn;I)V")
	public static final void method11328(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9649, arg0.intStack[--arg0.isp]);
		Statics.method1245();
	}

	@ObfuscatedName("tn.akh(Lrn;I)V")
	public static final void method11506(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9647, arg0.intStack[--arg0.isp] == 0 ? 0 : 1);
		Statics.method1245();
		client.field8980.method6102();
	}

	@ObfuscatedName("sb.akc(Lrn;I)V")
	public static final void method11163(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 < 0 || var1 > 5) {
			var1 = 2;
		}
		Statics.method5600(var1, false);
	}

	@ObfuscatedName("dr.ake(Lrn;I)V")
	public static final void method2825(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9652, arg0.intStack[--arg0.isp]);
		Statics.method1245();
	}

	@ObfuscatedName("t.akp(Lrn;I)V")
	public static final void method1345(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9659, arg0.intStack[--arg0.isp] == 1 ? 1 : 0);
		Statics.method1245();
		client.method13901();
		client.field8932 = false;
	}

	@ObfuscatedName("of.akg(Lrn;B)V")
	public static final void method7072(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9677, arg0.intStack[--arg0.isp]);
		Statics.method1245();
		client.field9165 = true;
	}

	@ObfuscatedName("lw.akj(Lrn;S)V")
	public static final void method5941(ClientScriptState arg0) {
		Statics.field4961.method15448(Statics.field4961.field9653, arg0.intStack[--arg0.isp]);
		Statics.method1245();
		client.field8932 = false;
	}

	@ObfuscatedName("fw.akw(Lrn;I)V")
	public static final void method3675(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int var2 = Statics.field4961.field9675.method15899();
		if (var1 == var2 || class395.field4205 != class395.field4202) {
			return;
		}
		if (!client.method1608(client.state)) {
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
		int var1 = arg0.intStack[--arg0.isp];
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
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 != Statics.field4961.field9657.method15807()) {
			Statics.field4961.method15448(Statics.field4961.field9657, var1);
			Statics.method1245();
			client.field8932 = false;
		}
	}

	@ObfuscatedName("ew.alu(Lrn;B)V")
	public static final void method3206(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9642.method15672();
	}

	@ObfuscatedName("ob.alk(Lrn;B)V")
	public static final void method7283(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9671.method15725() == 1 ? 1 : 0;
	}

	@ObfuscatedName("li.ale(Lrn;I)V")
	public static final void method5591(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9649.method15837();
	}

	@ObfuscatedName("go.alj(Lrn;B)V")
	public static final void method4032(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9645.method15679() == 1 ? 1 : 0;
	}

	@ObfuscatedName("lc.alx(Lrn;I)V")
	public static final void method5968(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9658.method15709() == 1 ? 1 : 0;
	}

	@ObfuscatedName("aem.alp(Lrn;B)V")
	public static final void method15592(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9651.method15747();
	}

	@ObfuscatedName("afl.alq(Lrn;I)V")
	public static final void method15823(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9650.method15667() == 1 ? 1 : 0;
	}

	@ObfuscatedName("z.alz(Lrn;I)V")
	public static final void method1369(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9666.method15755() == 2 ? 1 : 0;
	}

	@ObfuscatedName("qv.alr(Lrn;I)V")
	public static final void method8302(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9646.method15696() == 1 ? 1 : 0;
	}

	@ObfuscatedName("vu.alg(Lrn;I)V")
	public static final void method12189(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9665.method15829();
	}

	@ObfuscatedName("zw.alv(Lrn;B)V")
	public static final void method13864(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9654.method15899();
	}

	@ObfuscatedName("vw.alb(Lrn;B)V")
	public static final void method12346(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9672.method15899();
	}

	@ObfuscatedName("jh.als(Lrn;I)V")
	public static final void method4785(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.method3102();
	}

	@ObfuscatedName("ra.alw(Lrn;B)V")
	public static final void method827(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9637.method15829();
	}

	@ObfuscatedName("sn.alh(Lrn;I)V")
	public static final void method11193(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9643.method15792();
	}

	@ObfuscatedName("ql.alc(Lrn;B)V")
	public static final void method8139(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9673.method15816() == 1 ? 1 : 0;
	}

	@ObfuscatedName("aea.alt(Lrn;I)V")
	public static final void method15669(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9640.method15908() == 1 ? 1 : 0;
	}

	@ObfuscatedName("pc.ald(Lrn;I)V")
	public static final void method7889(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9649.method15837();
	}

	@ObfuscatedName("ms.alo(Lrn;I)V")
	public static final void method6491(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9647.method15843() == 1 ? 1 : 0;
	}

	@ObfuscatedName("yy.all(Lrn;S)V")
	public static final void method12940(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9661.method15781();
	}

	@ObfuscatedName("tv.ala(Lrn;B)V")
	public static final void method11763(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9670.method15781();
	}

	@ObfuscatedName("ed.alm(Lrn;B)V")
	public static final void method3086(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9652.method15874();
	}

	@ObfuscatedName("pa.ams(Lrn;S)V")
	public static final void method7742(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9659.method15686() == 1 ? 1 : 0;
	}

	@ObfuscatedName("ms.amy(Lrn;I)V")
	public static final void method6488(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.method1380(Statics.field4961.field9661.method15781(), 200);
	}

	@ObfuscatedName("js.ame(Lrn;B)V")
	public static final void method4806(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9677.method15794();
	}

	@ObfuscatedName("ud.amb(Lrn;I)V")
	public static final void method12145(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9653.method15899();
	}

	@ObfuscatedName("jv.amw(Lrn;I)V")
	public static final void method4722(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9675.method15899();
	}

	@ObfuscatedName("l.amm(Lrn;B)V")
	public static final void method883(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field8911 ? 1 : 0;
	}

	@ObfuscatedName("ov.amp(Lrn;I)V")
	public static final void method7215(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9668.method15859();
	}

	@ObfuscatedName("dv.ami(Lrn;I)V")
	public static final void method2844(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9641.method15741();
	}

	@ObfuscatedName("rm.amn(Lrn;I)V")
	public static final void method8593(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field2305.field9703 < 512 || client.field8911 || client.field8928 ? 1 : 0;
	}

	@ObfuscatedName("lu.amh(Lrn;I)V")
	public static final void method5829(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field8912 ? 1 : 0;
	}

	@ObfuscatedName("f.amj(Lrn;I)V")
	public static final void detailget_animdetail(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9657.method15807();
	}

	@ObfuscatedName("mn.amv(Lrn;B)V")
	public static final void viewport_setfov(ClientScriptState state) {
		state.isp -= 2;
		client.field8904 = (short) state.intStack[state.isp];
		if (client.field8904 <= 0) {
			client.field8904 = 256;
		}
		client.field9194 = (short) state.intStack[state.isp + 1];
		if (client.field9194 <= 0) {
			client.field9194 = 205;
		}
	}

	@ObfuscatedName("lq.amk(Lrn;I)V")
	public static final void viewport_setzoom(ClientScriptState arg0) {
		arg0.isp -= 2;
		client.field9195 = (short) arg0.intStack[arg0.isp];
		if (client.field9195 <= 0) {
			client.field9195 = 256;
		}
		client.field9196 = (short) arg0.intStack[arg0.isp + 1];
		if (client.field9196 <= 0) {
			client.field9196 = 320;
		}
	}

	@ObfuscatedName("lp.amo(Lrn;I)V")
	public static final void viewport_clampfov(ClientScriptState arg0) {
		arg0.isp -= 4;
		client.field9197 = (short) arg0.intStack[arg0.isp];
		if (client.field9197 <= 0) {
			client.field9197 = 1;
		}
		client.field9188 = (short) arg0.intStack[arg0.isp + 1];
		if (client.field9188 <= 0) {
			client.field9188 = 32767;
		} else if (client.field9188 < client.field9197) {
			client.field9188 = client.field9197;
		}
		client.field9199 = (short) arg0.intStack[arg0.isp + 2];
		if (client.field9199 <= 0) {
			client.field9199 = 1;
		}
		client.field9200 = (short) arg0.intStack[arg0.isp + 3];
		if (client.field9200 <= 0) {
			client.field9200 = 32767;
		} else if (client.field9200 < client.field9199) {
			client.field9200 = client.field9199;
		}
	}

	@ObfuscatedName("pq.ama(Lrn;I)V")
	public static final void method7716(ClientScriptState arg0) {
		Statics.method11240(0, 0, client.field9113.field1863, client.field9113.field1929, false);
		arg0.intStack[++arg0.isp - 1] = client.field9025;
		arg0.intStack[++arg0.isp - 1] = client.field9168;
	}

	@ObfuscatedName("ep.amr(Lrn;I)V")
	public static final void method3498(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9195;
		arg0.intStack[++arg0.isp - 1] = client.field9196;
	}

	@ObfuscatedName("ji.amx(Lrn;I)V")
	public static final void method4792(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field8904;
		arg0.intStack[++arg0.isp - 1] = client.field9194;
	}

	@ObfuscatedName("ol.amg(Lrn;B)V")
	public static final void method7073(ClientScriptState arg0) {
		long var1 = class153.method5554();
		arg0.intStack[++arg0.isp - 1] = (int) (var1 / 60000L);
	}

	@ObfuscatedName("th.amu(Lrn;B)V")
	public static final void method11707(ClientScriptState arg0) {
		long var1 = class153.method5554();
		arg0.intStack[++arg0.isp - 1] = (int) (var1 / 86400000L) - 11745;
	}

	@ObfuscatedName("af.amd(Lrn;B)V")
	public static final void method1686(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		long var4 = Statics.method11488(0, 0, 12, var1, var2, var3);
		int var6 = class604.method12062(var4);
		if (var3 < 1970) {
			var6--;
		}
		arg0.intStack[++arg0.isp - 1] = var6;
	}

	@ObfuscatedName("zw.amq(Lrn;I)V")
	public static final void method13863(ClientScriptState arg0) {
		long var1 = class153.method5554();
		arg0.intStack[++arg0.isp - 1] = class604.method11221(var1);
	}

	@ObfuscatedName("pt.aml(Lrn;I)V")
	public static final void method7736(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
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
		arg0.intStack[++arg0.isp - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("ax.amf(Lrn;I)V")
	public static final void method1837(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		int[] var2 = class604.method3586(var1);
		class531.method11351(var2, 0, arg0.intStack, arg0.isp, 3);
		arg0.isp += 3;
	}

	@ObfuscatedName("q.amz(Lrn;I)V")
	public static final void method1396(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = (int) (Statics.method5541(var1) / 60000L);
	}

	@ObfuscatedName("afs.amt(Lrn;B)V")
	public static final void method15785(ClientScriptState arg0) {
		if (client.state != 15 || Statics.method16489()) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else if (class574.field6777) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else if (Statics.field6356 > class153.method5554() - 1000L) {
			arg0.intStack[++arg0.isp - 1] = 1;
		} else {
			class574.field6777 = true;
			class792 var1 = class792.method14781(class280.field2927, client.field8959.field834);
			var1.field9467.p4(Statics.field575);
			client.field8959.method1913(var1);
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("ig.amc(Lrn;I)V")
	public static final void method4559(ClientScriptState arg0) {
		class832 var1 = class574.method6582();
		if (var1 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		arg0.intStack[++arg0.isp - 1] = var1.field9799;
		arg0.intStack[++arg0.isp - 1] = var1.field4866;
		arg0.objectStack[++arg0.osp - 1] = var1.field9798;
		class459 var2 = var1.method15615();
		arg0.intStack[++arg0.isp - 1] = var2.field4861;
		arg0.objectStack[++arg0.osp - 1] = var2.field4860;
		arg0.intStack[++arg0.isp - 1] = var1.field4868;
		arg0.intStack[++arg0.isp - 1] = var1.field9800;
		arg0.objectStack[++arg0.osp - 1] = var1.field9797;
	}

	@ObfuscatedName("so.anu(Lrn;I)V")
	public static final void method11142(ClientScriptState arg0) {
		class832 var1 = class574.method3647();
		if (var1 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		arg0.intStack[++arg0.isp - 1] = var1.field9799;
		arg0.intStack[++arg0.isp - 1] = var1.field4866;
		arg0.objectStack[++arg0.osp - 1] = var1.field9798;
		class459 var2 = var1.method15615();
		arg0.intStack[++arg0.isp - 1] = var2.field4861;
		arg0.objectStack[++arg0.osp - 1] = var2.field4860;
		arg0.intStack[++arg0.isp - 1] = var1.field4868;
		arg0.intStack[++arg0.isp - 1] = var1.field9800;
		arg0.objectStack[++arg0.osp - 1] = var1.field9797;
	}

	@ObfuscatedName("aag.anp(Lrn;I)V")
	public static final void method14066(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		String var2 = (String) arg0.objectStack[--arg0.osp];
		if (client.state == 15 && !Statics.method16489()) {
			arg0.intStack[++arg0.isp - 1] = class574.method8621(var1, var2) ? 1 : 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = 0;
		}
	}

	@ObfuscatedName("ol.ang(Lrn;I)V")
	public static final void method7077(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class832 var2 = class461.method3630(var1);
		if (var2 == null) {
			arg0.intStack[++arg0.isp - 1] = -1;
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.objectStack[++arg0.osp - 1] = "";
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.intStack[++arg0.isp - 1] = 0;
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		arg0.intStack[++arg0.isp - 1] = var2.field4866;
		arg0.objectStack[++arg0.osp - 1] = var2.field9798;
		class459 var3 = var2.method15615();
		arg0.intStack[++arg0.isp - 1] = var3.field4861;
		arg0.objectStack[++arg0.osp - 1] = var3.field4860;
		arg0.intStack[++arg0.isp - 1] = var2.field4868;
		arg0.intStack[++arg0.isp - 1] = var2.field9800;
		arg0.objectStack[++arg0.osp - 1] = var2.field9797;
	}

	@ObfuscatedName("qh.ant(Lrn;B)V")
	public static final void method8287(ClientScriptState arg0) {
		arg0.isp -= 4;
		int var1 = arg0.intStack[arg0.isp];
		boolean var2 = arg0.intStack[arg0.isp + 1] == 1;
		int var3 = arg0.intStack[arg0.isp + 2];
		boolean var4 = arg0.intStack[arg0.isp + 3] == 1;
		class574.method4774(var1, var2, var3, var4);
	}

	@ObfuscatedName("cr.anc(Lrn;I)V")
	public static final void method2354(ClientScriptState arg0) {
		if (client.state == 15) {
			class574.field6774 = arg0.intStack[--arg0.isp] == 1;
		}
	}

	@ObfuscatedName("wq.anz(Lrn;I)V")
	public static final void method12553(ClientScriptState arg0) {
		class832 var1 = class574.method8609();
		arg0.intStack[++arg0.isp - 1] = var1 == null ? 0 : var1.field4866;
	}

	@ObfuscatedName("kf.ana(Lrn;I)V")
	public static final void method5542(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.openedTopInterface;
	}

	@ObfuscatedName("wf.ank(Lrn;I)V")
	public static final void method12505(ClientScriptState arg0) {
		int var1 = client.openedSubInterfaces.method11926();
		if (client.openedTopInterface != -1) {
			var1++;
		}
		arg0.intStack[++arg0.isp - 1] = var1;
	}

	@ObfuscatedName("mq.ann(Lrn;I)V")
	public static final void method6402(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (client.openedTopInterface != -1) {
			if (var1 == 0) {
				arg0.intStack[++arg0.isp - 1] = client.openedTopInterface;
				return;
			}
			var1--;
		}
		class816 var2 = (class816) client.openedSubInterfaces.method11928();
		while (var1-- > 0) {
			var2 = (class816) client.openedSubInterfaces.method11929();
		}
		arg0.intStack[++arg0.isp - 1] = var2.field9679;
	}

	@ObfuscatedName("fp.anl(Lrn;B)V")
	public static final void method3545(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Statics.interfaces[var1] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		String var2 = Statics.interfaces[var1].components[0].field1762;
		if (var2 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.substring(0, var2.indexOf(58));
		}
	}

	@ObfuscatedName("wg.anf(Lrn;B)V")
	public static final void method12636(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Statics.interfaces[var1] == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.interfaces[var1].components.length;
		}
	}

	@ObfuscatedName("da.anv(Lrn;I)V")
	public static final void method2819(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Statics.interfaces[var1] == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
			return;
		}
		String var3 = Statics.interfaces[var1].components[var2].field1762;
		if (var3 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var3;
		}
	}

	@ObfuscatedName("rl.anm(Lrn;I)V")
	public static final void method8648(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		if (Statics.interfaces[var1] == null) {
			arg0.intStack[++arg0.isp - 1] = 0;
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.interfaces[var1].components[var2].field1850;
		}
	}

	@ObfuscatedName("l.anj(Lrn;I)V")
	public static final void method880(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(1, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("km.any(Lrn;I)V")
	public static final void method5559(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(2, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("ls.anh(Lrn;I)V")
	public static final void method5710(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(3, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("qs.anw(Lrn;I)V")
	public static final void method8387(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(4, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("tq.ans(Lrn;I)V")
	public static final void method11637(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(5, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("dl.anr(Lrn;I)V")
	public static final void method2606(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(6, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("su.anq(Lrn;I)V")
	public static final void method11198(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(7, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("dv.ane(Lrn;B)V")
	public static final void method2849(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(8, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("pg.anb(Lrn;I)V")
	public static final void method7979(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(9, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("ky.and(Lrn;I)V")
	public static final void method5015(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		client.method5716(10, var1 << 16 | var2, var3, "");
	}

	@ObfuscatedName("qs.anx(Lrn;I)V")
	public static final void method8386(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		class165 var4 = class165.method15145(var1 << 16 | var2, var3);
		client.method11223();
		class785 var5 = client.method14331(var4);
		Statics.method11974(var4, var5.method14928(), var5.field9423);
	}

	@ObfuscatedName("ai.aoe(Lrn;I)V")
	public static final void method1772(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = opCount;
	}

	@ObfuscatedName("aed.aoa(Lrn;I)V")
	public static final void method15675(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class443 var2 = Statics.field8499.method7862(var1);
		if (var2.field4766 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var2.field4766;
		}
	}

	@ObfuscatedName("re.aov(Lrn;I)V")
	public static final void method8665(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class443 var2 = Statics.field8499.method7862(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field4764;
	}

	@ObfuscatedName("li.aox(Lrn;I)V")
	public static final void method5592(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class443 var2 = Statics.field8499.method7862(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field4777;
	}

	@ObfuscatedName("cg.aoi(Lrn;I)V")
	public static final void method2558(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class443 var2 = Statics.field8499.method7862(var1);
		arg0.intStack[++arg0.isp - 1] = var2.field4775;
	}

	@ObfuscatedName("yc.aop(Lrn;I)V")
	public static final void method12886(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		class613 var3 = Statics.field4464.method12600(var2);
		if (var3.method12586()) {
			arg0.objectStack[++arg0.osp - 1] = Statics.field8499.method7862(var1).method7840(var2, var3.field7288);
		} else {
			arg0.intStack[++arg0.isp - 1] = Statics.field8499.method7862(var1).method7842(var2, var3.field7287);
		}
	}

	@ObfuscatedName("mv.aoo(Lrn;I)V")
	public static final void method6311(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9054 && !client.field9077 ? 1 : 0;
	}

	@ObfuscatedName("fd.aof(Lrn;B)V")
	public static final void method3509(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field3585;
	}

	@ObfuscatedName("qz.aot(Lrn;I)V")
	public static final void method8274(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field5056;
	}

	@ObfuscatedName("fw.aos(Lrn;I)V")
	public static final void method3677(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4225;
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
		arg0.objectStack[++arg0.osp - 1] = var1;
	}

	@ObfuscatedName("ec.aor(Lrn;I)V")
	public static final void method3446(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field1685;
	}

	@ObfuscatedName("rf.aog(Lrn;I)V")
	public static final void method8631(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field1599;
	}

	@ObfuscatedName("ec.aol(Lrn;B)V")
	public static final void method3453(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field7157;
	}

	@ObfuscatedName("dv.aoz(Lrn;I)V")
	public static final void method2850(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field8432 ? 1 : 0;
	}

	@ObfuscatedName("ki.aoq(Lrn;I)V")
	public static final void method5028(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field8469;
	}

	@ObfuscatedName("ev.aow(Lrn;I)V")
	public static final void method2985(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field563;
	}

	@ObfuscatedName("oo.aoy(Lrn;I)V")
	public static final void method7554(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field8537;
	}

	@ObfuscatedName("ki.aob(Lrn;B)V")
	public static final void method5027(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field3210;
	}

	@ObfuscatedName("js.aon(Lrn;I)V")
	public static final void method4805(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field3497 ? 1 : 0;
	}

	@ObfuscatedName("pf.aoc(Lrn;I)V")
	public static final void method7911(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field3584;
	}

	@ObfuscatedName("pj.aoh(Lrn;I)V")
	public static final void method7894(ClientScriptState arg0) {
		int var1 = class63.method12606();
		arg0.intStack[++arg0.isp - 1] = Statics.field6658 = Statics.field4961.field9661.method15781();
		arg0.intStack[++arg0.isp - 1] = var1;
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
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9633.method15868();
	}

	@ObfuscatedName("s.aps(Lrn;B)V")
	public static final void method1318(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
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
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 != -1) {
			class521.method2930(var1);
		}
	}

	@ObfuscatedName("nn.apt(Lrn;B)V")
	public static final void method6886(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (var1 != -1) {
			class521.method11689(var1);
		}
	}

	@ObfuscatedName("rf.apf(Lrn;B)V")
	public static final void method8632(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field2137.method6799("jagtheora") ? 1 : 0;
	}

	@ObfuscatedName("sn.aph(Lrn;B)V")
	public static final void method11196(ClientScriptState arg0) {
		boolean var1 = false;
		if (client.field8903) {
			try {
				Object var2 = class284.field3153.method4758(new Object[] { Statics.field8469, Statics.field2119.field10043 == 1, arg0.intStack[--arg0.isp] });
				if (var2 != null) {
					var1 = (Boolean) var2;
				}
			} catch (Throwable var4) {
			}
		}
		arg0.intStack[++arg0.isp - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("afy.apu(Lrn;I)V")
	public static final void method15732(ClientScriptState arg0) {
		if (client.field8903) {
			class284.field3145.method4761();
		}
	}

	@ObfuscatedName("aec.apk(Lrn;B)V")
	public static final void method15628(ClientScriptState arg0) {
		if (client.field8903) {
			class284.field3147.method4761();
		}
	}

	@ObfuscatedName("acr.apm(Lrn;I)V")
	public static final void method14748(ClientScriptState arg0) {
		boolean var1 = true;
		String var2 = (String) arg0.objectStack[--arg0.osp];
		if (client.field8903) {
			try {
				Object var3 = class284.field3149.method4758(new Object[] { var2 });
				if (var3 != null) {
					var1 = (Boolean) var3;
				}
			} catch (Throwable var5) {
			}
		}
		arg0.intStack[++arg0.isp - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("df.apg(Lrn;B)V")
	public static final void method2838(ClientScriptState arg0) {
		boolean var1 = false;
		String var2 = (String) arg0.objectStack[--arg0.osp];
		if (client.field8903) {
			try {
				Object var3 = class284.field3146.method4758(new Object[] { var2 });
				if (var3 != null) {
					var1 = (Boolean) var3;
				}
			} catch (Throwable var5) {
			}
		}
		arg0.intStack[++arg0.isp - 1] = var1 ? 1 : 0;
	}

	@ObfuscatedName("f.apn(Lrn;B)V")
	public static final void method1353(ClientScriptState arg0) {
		String var1 = (String) arg0.objectStack[--arg0.osp];
		if (client.field8903) {
			try {
				class284.field3154.method4758(new Object[] { var1 });
			} catch (Throwable var3) {
			}
		}
	}

	@ObfuscatedName("ic.apw(Lrn;I)V")
	public static final void method4691(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9671.method15724() ? 1 : 0;
	}

	@ObfuscatedName("cg.apy(Lrn;I)V")
	public static final void method2557(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9658.method15707() ? 1 : 0;
	}

	@ObfuscatedName("ck.apo(Lrn;B)V")
	public static final void method2470(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9651.method15750() ? 1 : 0;
	}

	@ObfuscatedName("nb.apq(Lrn;I)V")
	public static final void method6817(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9666.method15757() ? 1 : 0;
	}

	@ObfuscatedName("mx.ape(Lrn;I)V")
	public static final void method6075(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9637.method15828() && Statics.field5187.method452() ? 1 : 0;
	}

	@ObfuscatedName("xb.app(Lrn;B)V")
	public static final void method12750(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9648.method15717() ? 1 : 0;
	}

	@ObfuscatedName("ro.apc(Lrn;B)V")
	public static final void method8727(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9643.method15790() ? 1 : 0;
	}

	@ObfuscatedName("cd.apr(Lrn;B)V")
	public static final void method2493(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9673.method15815() && Statics.field5187.method450() ? 1 : 0;
	}

	@ObfuscatedName("fe.apd(Lrn;B)V")
	public static final void method3844(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9647.method15842() ? 1 : 0;
	}

	@ObfuscatedName("oo.apx(Lrn;S)V")
	public static final void method7555(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9659.method15687() ? 1 : 0;
	}

	@ObfuscatedName("bj.apz(Lrn;I)V")
	public static final void method2023(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9677.method15795() ? 1 : 0;
	}

	@ObfuscatedName("fu.aqs(Lrn;I)V")
	public static final void method3646(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9646.method15698() ? 1 : 0;
	}

	@ObfuscatedName("nn.aqv(Lrn;I)V")
	public static final void method6887(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9641.method15740() ? 1 : 0;
	}

	@ObfuscatedName("ot.aqn(Lrn;B)V")
	public static final void method7375(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9670.method15775() ? 1 : 0;
	}

	@ObfuscatedName("n.aqq(Lrn;B)V")
	public static final void method1376(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9657.method15806() ? 1 : 0;
	}

	@ObfuscatedName("ei.aqr(Lrn;I)V")
	public static final void method3221(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9671.method11387(var1);
	}

	@ObfuscatedName("gm.aqz(Lrn;I)V")
	public static final void method3968(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9658.method11387(var1);
	}

	@ObfuscatedName("oo.aqg(Lrn;I)V")
	public static final void method7556(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9666.method11387(var1);
	}

	@ObfuscatedName("fh.aql(Lrn;B)V")
	public static final void method3652(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Statics.field5187.method452()) {
			arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9637.method11387(var1);
		} else {
			arg0.intStack[++arg0.isp - 1] = 3;
		}
	}

	@ObfuscatedName("gk.aqj(Lrn;I)V")
	public static final void method3952(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9648.method11387(var1);
	}

	@ObfuscatedName("oc.aqc(Lrn;S)V")
	public static final void method7381(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9643.method11387(var1);
	}

	@ObfuscatedName("mz.aqo(Lrn;I)V")
	public static final void method6346(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		if (Statics.field5187.method450()) {
			arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9673.method11387(var1);
		} else {
			arg0.intStack[++arg0.isp - 1] = 3;
		}
	}

	@ObfuscatedName("adw.aqe(Lrn;I)V")
	public static final void method15165(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9647.method11387(var1);
	}

	@ObfuscatedName("ur.aqu(Lrn;I)V")
	public static final void method12158(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9646.method11387(var1);
	}

	@ObfuscatedName("ti.aqw(Lrn;S)V")
	public static final void method11688(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9670.method11387(var1);
	}

	@ObfuscatedName("ib.aqp(Lrn;I)V")
	public static final void method4611(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.intStack[++arg0.isp - 1] = Statics.field4961.field9657.method11387(var1);
	}

	@ObfuscatedName("ec.aqd(Lrn;I)V")
	public static final void method3447(ClientScriptState arg0) {
		arg0.activeEntity.method13965(arg0.intStack[--arg0.isp]);
	}

	@ObfuscatedName("e.aqy(Lrn;I)V")
	public static final void method1669(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeEntity.field8653;
	}

	@ObfuscatedName("aav.aqa(Lrn;I)V")
	public static final void method14119(ClientScriptState arg0) {
		class117 var1 = arg0.activeEntity.method13963();
		if (var1 == null) {
			arg0.objectStack[++arg0.osp - 1] = "";
		} else {
			arg0.objectStack[++arg0.osp - 1] = var1.method2477();
		}
	}

	@ObfuscatedName("dn.aqx(Lrn;B)V")
	public static final void method2866(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = ((class902) arg0.activeEntity).method16120(true);
	}

	@ObfuscatedName("oz.aqh(Lrn;B)V")
	public static final void method7572(ClientScriptState arg0) {
		arg0.isp -= 3;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		int var3 = arg0.intStack[arg0.isp + 2];
		cc_create_inner(arg0.activeEntity.field8652, var1 & 0xFFFF, var2, var3, arg0.secondary, arg0);
	}

	@ObfuscatedName("jm.aqt(Lrn;B)V")
	public static final void method4730(ClientScriptState arg0) {
		class903 var1 = (class903) arg0.activeEntity;
		String var2 = var1.field10077;
		class611 var3 = var1.field10075;
		if (var3.field7244 != null) {
			class611 var4 = var3.method12516(Statics.field2669);
			if (var4 == null) {
				var2 = "";
			} else {
				var2 = var4.field7212;
			}
		}
		if (var2 == null) {
			var2 = "";
		}
		arg0.objectStack[++arg0.osp - 1] = var2;
	}

	@ObfuscatedName("n.arv(Lrn;I)V")
	public static final void method1377(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class504 var2;
		if (arg0.secondary) {
			var2 = arg0.activeComponent2;
		} else {
			var2 = arg0.activeComponent;
		}
		arg0.intStack[++arg0.isp - 1] = var2.method11066(arg0.activeEntity.field8652, var1, -1) ? 1 : 0;
	}

	@ObfuscatedName("re.arr(Lrn;I)V")
	public static final void method8661(ClientScriptState arg0) {
		client.method7883(arg0.activeEntity, arg0.intStack[--arg0.isp]);
		arg0.intStack[++arg0.isp - 1] = (int) client.field9048[0];
		arg0.intStack[++arg0.isp - 1] = (int) client.field9048[1];
		arg0.intStack[++arg0.isp - 1] = (int) client.field9048[2];
	}

	@ObfuscatedName("wz.arm(Lrn;I)V")
	public static final void method12680(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field9113 == null ? -1 : client.field9113.parentLayer;
	}

	@ObfuscatedName("lv.arl(Lrn;I)V")
	public static final void method5616(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeEntity.method12811();
	}

	@ObfuscatedName("lq.ard(Lrn;I)V")
	public static final void method5923(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		class903 var2 = (class903) arg0.activeEntity;
		int var3 = var2.method16156(var1);
		int var4 = var2.method16157(var1);
		arg0.intStack[++arg0.isp - 1] = var3;
		arg0.intStack[++arg0.isp - 1] = var4;
	}

	@ObfuscatedName("afb.art(Lrn;I)V")
	public static final void method15810(ClientScriptState arg0) {
		class903 var1 = (class903) arg0.activeEntity;
		boolean var2 = false;
		class611 var3 = var1.field10075;
		if (var3.field7244 != null) {
			var3 = var3.method12516(Statics.field2669);
		}
		if (var3 != null) {
			var2 = var3.field7271;
		}
		arg0.intStack[++arg0.isp - 1] = var2 ? 1 : 0;
	}

	@ObfuscatedName("ms.arq(Lrn;I)V")
	public static final void method6489(ClientScriptState arg0) {
		class903 var1 = (class903) arg0.activeEntity;
		class611 var2 = var1.field10075;
		if (var2.field7244 != null) {
			var2 = var2.method12516(Statics.field2669);
		}
		arg0.intStack[++arg0.isp - 1] = var2 == null ? 0 : 1;
	}

	@ObfuscatedName("aam.arx(Lrn;B)V")
	public static final void method14048(ClientScriptState arg0) {
		class165 var1 = arg0.activeEntity.field8652.method3108(arg0.intStack[--arg0.isp]);
		var1.subcomponents = null;
		var1.sortedsubcomponents = null;
		client.requestRedrawComponent(var1);
	}

	@ObfuscatedName("im.arz(Lrn;I)V")
	public static final void method4640(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = client.field8919 == arg0.activeEntity.method13970() ? 1 : 0;
	}

	@ObfuscatedName("wo.aru(Lrn;I)V")
	public static final void method12646(ClientScriptState arg0) {
		client.method7883((class836) arg0.activeLoc, arg0.intStack[--arg0.isp]);
		arg0.intStack[++arg0.isp - 1] = (int) client.field9048[0];
		arg0.intStack[++arg0.isp - 1] = (int) client.field9048[1];
		arg0.intStack[++arg0.isp - 1] = (int) client.field9048[2];
	}

	@ObfuscatedName("rk.ary(Lrn;I)V")
	public static final void method8484(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = ((class836) arg0.activeLoc).method12811();
	}

	@ObfuscatedName("pi.arc(Lrn;I)V")
	public static final void method7902(ClientScriptState arg0) {
		arg0.intStack[++arg0.isp - 1] = arg0.activeObj.method12811();
	}

	@ObfuscatedName("ay.arh(Laes;Lrn;I)V")
	public static final void method1680(class836 arg0, ClientScriptState arg1) {
		boolean var2 = false;
		int var3 = 0;
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;
		if (arg0.field9811 != null) {
			for (int var7 = 0; var7 < arg0.field9811.length; var7++) {
				class142 var8 = arg0.field9811[var7];
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
		arg1.intStack[++arg1.isp - 1] = var2 ? 1 : 0;
		arg1.intStack[++arg1.isp - 1] = var3;
		arg1.intStack[++arg1.isp - 1] = var4;
		arg1.intStack[++arg1.isp - 1] = var5;
		arg1.intStack[++arg1.isp - 1] = var6;
	}

	@ObfuscatedName("of.ari(Lrn;B)V")
	public static final void method7067(ClientScriptState arg0) {
		method1680((class836) arg0.activeLoc, arg0);
	}

	@ObfuscatedName("et.ars(Lrn;B)V")
	public static final void method2921(ClientScriptState arg0) {
		method1680(arg0.activeObj, arg0);
	}

	@ObfuscatedName("el.arj(Lrn;I)V")
	public static final void method3214(ClientScriptState arg0) {
		int var1 = arg0.intStack[--arg0.isp];
		arg0.osp -= 2;
		String var2 = (String) arg0.objectStack[arg0.osp];
		String var3 = (String) arg0.objectStack[arg0.osp + 1];
		if (var2.length() <= 500 && var3.length() <= 500) {
			method5546(var1, var2, var3);
		}
	}

	@ObfuscatedName("kj.arn(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method5546(int arg0, String arg1, String arg2) {
		if (client.field8975 == null) {
			return;
		}
		class792 var3 = class792.method14781(class280.field2946, client.field8975.field834);
		var3.field9467.p2(Packet.pjstr2len(arg1) + 1 + Packet.pjstr2len(arg2));
		var3.field9467.pjstr2(arg2);
		var3.field9467.pjstr2(arg1);
		var3.field9467.method15268(arg0);
		client.field8975.method1913(var3);
	}

	@ObfuscatedName("gf.are(Lrn;B)V")
	public static void method4004(ClientScriptState arg0) {
		int var1 = arg0.intStack[arg0.isp - 3];
		int var2 = arg0.intStack[arg0.isp - 2];
		int var3 = arg0.intStack[arg0.isp - 1];
		arg0.isp -= 3;
		if (var1 > arg0.field5237[var2]) {
			throw new RuntimeException();
		} else if (var1 > arg0.field5237[var3]) {
			throw new RuntimeException();
		} else if (var2 == var3) {
			throw new RuntimeException();
		} else {
			class485.method4811(arg0.field5224[var2], arg0.field5224[var3], 0, var1 - 1);
		}
	}
}
