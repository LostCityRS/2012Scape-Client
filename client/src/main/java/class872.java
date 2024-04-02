
import deob.ObfuscatedName;

@ObfuscatedName("agf")
public class class872 extends class546 {

	@ObfuscatedName("agf.j")
	public class322 field9898 = null;

	@ObfuscatedName("agf.a")
	public class735 field9897 = null;

	public class872(class199 arg0) {
		super(arg0);
	}

	@ObfuscatedName("agf.u(FB)V")
	public void method11540(float arg0) {
	}

	@ObfuscatedName("agf.j(I)Z")
	public boolean method11541() {
		return this.field9898 != null && this.field9897 != null && this.field9897.method4030();
	}

	@ObfuscatedName("agf.a(S)Lko;")
	public class317 method11550() {
		return class317.method5290(this.field9898.method5517(this.field9897.method14129()));
	}

	@ObfuscatedName("agf.s(Lfi;Lkc;III)V")
	public void method11543(class195 arg0, class314 arg1, int arg2, int arg3) {
		class317 var5 = class317.method5290(this.field6645.method3720());
		var5.field3475 -= arg2;
		var5.field3477 -= arg3;
		float var6 = this.field9897.method14129();
		class317 var7 = class317.method5290(this.field9898.method5517(var6));
		var7.field3475 -= arg2;
		var7.field3477 -= arg3;
		float var8 = this.field9898.method5519(var6);
		class317 var9 = class317.method5377(var7, var5);
		var9.method5313();
		class316 var10 = new class316();
		var10.method5215(var9, var8);
		class317 var11 = class317.method5294(0.0F, 1.0F, 0.0F);
		class317 var12 = class317.method5308(var9, var11);
		class317 var13 = class317.method5308(var12, var9);
		var13.method5318(var10);
		var5.field3476 *= -1.0F;
		var7.field3476 *= -1.0F;
		arg1.method5103(var5.field3475, var5.field3476, var5.field3477, var7.field3475, var7.field3476, var7.field3477, var13.field3475, var13.field3476, var13.field3477);
		var5.method5291();
		var7.method5291();
		var13.method5291();
	}

	@ObfuscatedName("agf.c(Laet;I)V")
	public void method11542(class814 arg0) {
		this.field9898 = new class322(arg0);
	}
}
