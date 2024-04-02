
import deob.ObfuscatedName;

@ObfuscatedName("ago")
public class class869 extends class546 {

	@ObfuscatedName("ago.j")
	public final class316 field9886 = new class316();

	@ObfuscatedName("ago.a")
	public final class316 field9885 = new class316(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

	public class869(class199 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ago.b(Lkn;I)V")
	public void method15923(class316 arg0) {
		this.field9885.field3465 = arg0.field3465;
		this.field9885.field3469 = arg0.field3469;
		this.field9885.field3470 = arg0.field3470;
		this.field9885.field3471 = arg0.field3471;
		this.field9886.method5214(this.field9885);
	}

	@ObfuscatedName("ago.a(S)Lko;")
	public class317 method11550() {
		class317 var1 = new class317(0.0F, 0.0F, 1000.0F);
		var1.method5318(class316.method5221(this.field9886));
		var1.field3476 *= -1.0F;
		var1.method5299(this.field6645.method3720());
		return var1;
	}

	@ObfuscatedName("ago.u(FB)V")
	public void method11540(float arg0) {
		this.field9886.method5214(this.field9885);
	}

	@ObfuscatedName("ago.j(I)Z")
	public boolean method11541() {
		return !Float.isNaN(this.field9886.field3465);
	}

	@ObfuscatedName("ago.x(I)Lkn;")
	public class316 method15921() {
		return new class316(this.field9886);
	}

	@ObfuscatedName("ago.s(Lfi;Lkc;III)V")
	public void method11543(class195 arg0, class314 arg1, int arg2, int arg3) {
		class317 var5 = class317.method5290(this.field6645.method3720());
		var5.field3475 -= arg2;
		var5.field3477 -= arg3;
		var5.field3476 *= -1.0F;
		arg1.method5109(class316.method5221(this.field9886));
		arg1.method5127(var5);
		arg1.method5102();
		var5.method5291();
	}

	@ObfuscatedName("ago.c(Laet;I)V")
	public void method11542(class814 arg0) {
		this.field9885.method5245(arg0);
	}
}
