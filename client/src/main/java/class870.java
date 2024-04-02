
import deob.ObfuscatedName;

@ObfuscatedName("agg")
public class class870 extends class546 {

	@ObfuscatedName("agg.j")
	public class198 field9887;

	@ObfuscatedName("agg.a")
	public final class317 field9888 = new class317();

	@ObfuscatedName("agg.s")
	public boolean field9892;

	@ObfuscatedName("agg.c")
	public final class317 field9890 = new class317(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("agg.m")
	public final class317 field9891 = new class317(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("agg.t")
	public final class317 field9889 = new class317();

	public class870(class199 arg0) {
		super(arg0);
	}

	@ObfuscatedName("agg.b(Lfs;Lko;ZI)V")
	public void method15927(class198 arg0, class317 arg1, boolean arg2) {
		this.field9887 = arg0;
		this.field9888.method5334(arg1);
		this.field9892 = arg2;
		arg0.method3684();
	}

	@ObfuscatedName("agg.u(FB)V")
	public void method11540(float arg0) {
		if (this.field9887 != null) {
			this.field9891.method5334(this.field9887.method3684().method15209());
			this.field6645.method3811(false, arg0, this.field9890, this.field6645.method3726(), this.field9891, this.field9889);
		}
	}

	@ObfuscatedName("agg.j(I)Z")
	public boolean method11541() {
		return !Float.isNaN(this.field9890.field3475);
	}

	@ObfuscatedName("agg.s(Lfi;Lkc;III)V")
	public void method11543(class195 arg0, class314 arg1, int arg2, int arg3) {
		class317 var5 = class317.method5290(this.field6645.method3720());
		var5.field3475 -= arg2;
		var5.field3477 -= arg3;
		var5.field3476 *= -1.0F;
		class317 var6 = this.method11550();
		var6.field3475 -= arg2;
		var6.field3477 -= arg3;
		var6.field3476 *= -1.0F;
		arg1.method5103(var5.field3475, var5.field3476, var5.field3477, var6.field3475, var6.field3476, var6.field3477, 0.0F, 1.0F, 0.0F);
		var5.method5291();
		var6.method5291();
	}

	@ObfuscatedName("agg.a(S)Lko;")
	public class317 method11550() {
		class317 var1 = class317.method5290(this.field9890);
		class317 var2 = class317.method5290(this.field9888);
		if (this.field9892) {
			var2.method5318(this.field9887.method3680());
		}
		var1.method5299(var2);
		var2.method5291();
		return var1;
	}

	@ObfuscatedName("agg.c(Laet;I)V")
	public void method11542(class814 arg0) {
		class197 var2 = class197.method4728(arg0.method15220());
		int var3 = arg0.method15239();
		this.field9887 = this.field6645.method3717().method1355(var2, var3);
		this.field9888.method5292(arg0);
		if (arg0.method15220() == 1) {
			this.field9892 = true;
		} else {
			this.field9892 = false;
		}
	}
}
