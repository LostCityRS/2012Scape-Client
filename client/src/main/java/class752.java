
import deob.ObfuscatedName;

@ObfuscatedName("abv")
public class class752 extends class262 {

	@ObfuscatedName("abv.d")
	public final int field8828;

	@ObfuscatedName("abv.z")
	public final int field8827;

	public class752(class265 arg0, class263 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.field8828 = arg9;
		this.field8827 = arg10;
	}

	@ObfuscatedName("ur.s(Laet;I)Liq;")
	public static class262 method12157(Packet arg0) {
		class262 var1 = class262.method2603(arg0);
		int var2 = arg0.method15379();
		int var3 = arg0.method15379();
		return new class752(var1.field2605, var1.field2603, var1.field2604, var1.field2608, var1.field2602, var1.field2607, var1.field2610, var1.field2609, var1.field2606, var2, var3);
	}

	@ObfuscatedName("abv.j(I)Lio;")
	public class266 method4543() {
		return class266.field2620;
	}
}