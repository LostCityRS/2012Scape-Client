
import deob.ObfuscatedName;

@ObfuscatedName("dm")
public abstract class CutsceneAction {

	@ObfuscatedName("dm.u")
	public final int field1566;

	public CutsceneAction(Packet arg0) {
		this.field1566 = arg0.method15239();
	}

	@ObfuscatedName("gq.u(Laet;I)Ldm;")
	public static CutsceneAction method3928(Packet arg0) {
		int var1 = arg0.method15220();
		CutsceneCommand var2 = CutsceneCommand.method12118(var1);
		CutsceneAction var3 = null;
		switch(var2.field7412) {
			case 0:
				var3 = new CutsceneAction_Sub1(arg0);
				break;
			case 1:
				var3 = new CutsceneAction_Sub2(arg0);
				break;
			case 2:
				var3 = new CutsceneAction_Sub3(arg0);
				break;
			case 3:
				var3 = new CutsceneAction_Sub4(arg0);
				break;
			case 4:
				var3 = new CutsceneAction_Sub5(arg0);
				break;
			case 5:
				var3 = new CutsceneAction_Sub6(arg0);
				break;
			case 6:
				var3 = new CutsceneAction_Sub7(arg0);
				break;
			case 7:
				var3 = new CutsceneAction_Sub8(arg0);
				break;
			case 8:
				var3 = new CutsceneAction_Sub9(arg0);
				break;
			case 9:
				var3 = new CutsceneAction_Sub10(arg0);
				break;
			case 10:
				var3 = new CutsceneAction_Sub11(arg0);
				break;
			case 11:
				var3 = new CutsceneAction_Sub12(arg0, 0, 1);
				break;
			case 12:
				var3 = new CutsceneAction_Sub13(arg0);
				break;
			case 13:
				var3 = new CutsceneAction_Sub14(arg0);
				break;
			case 14:
				var3 = new CutsceneAction_Sub15(arg0);
				break;
			case 15:
				var3 = new CutsceneAction_Sub16(arg0);
				break;
			case 16:
				var3 = new CutsceneAction_Sub12(arg0, 1, 0);
				break;
			case 17:
				var3 = new CutsceneAction_Sub17(arg0, true);
			case 18:
			case 20:
			case 24:
			default:
				break;
			case 19:
				var3 = new CutsceneAction_Sub18(arg0);
				break;
			case 21:
				var3 = new CutsceneAction_Sub19(arg0);
				break;
			case 22:
				var3 = new CutsceneAction_Sub20(arg0);
				break;
			case 23:
				var3 = new CutsceneAction_Sub21(arg0);
				break;
			case 25:
				var3 = new CutsceneAction_Sub22(arg0);
				break;
			case 26:
				var3 = new CutsceneAction_Sub17(arg0, false);
				break;
			case 27:
				var3 = new CutsceneAction_Sub12(arg0, 0, 0);
				break;
			case 28:
				var3 = new CutsceneAction_Sub23(arg0);
				break;
			case 29:
				var3 = new CutsceneAction_Sub12(arg0, 1, 1);
				break;
			case 30:
				var3 = new CutsceneAction_Sub24(arg0);
		}
		return var3;
	}

	@ObfuscatedName("dm.a(B)V")
	public void method2874() {
	}

	@ObfuscatedName("dm.s(B)Z")
	public boolean method2883() {
		return true;
	}

	@ObfuscatedName("dm.j(I)V")
	public abstract void method2873();
}
