
import deob.ObfuscatedName;

@ObfuscatedName("dv")
public final class CutsceneVarDomain implements VarIntDomain {

	@ObfuscatedName("dv.l(II)I")
	public int method1646(int arg0) {
		IntNode var2 = (IntNode) CutsceneManager.field1529.method11923((long) arg0 | 0x100000000L);
		return var2 == null ? Statics.field2669.method1646(arg0) : var2.field9556;
	}

	@ObfuscatedName("dv.t(II)I")
	public int method1664(int arg0) {
		IntNode var2 = (IntNode) CutsceneManager.field1529.method11923((long) arg0);
		return var2 == null ? Statics.field2669.method1664(arg0) : var2.field9556;
	}
}
