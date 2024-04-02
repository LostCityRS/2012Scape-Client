
import deob.ObfuscatedName;

@ObfuscatedName("aaq")
public class class733 extends class216 {

	@ObfuscatedName("aaq.j")
	public int field8731;

	@ObfuscatedName("aaq.a")
	public final class317 field8730 = new class317(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("aaq.s")
	public final class317 field8732 = new class317(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("aaq.c")
	public final class317 field8733 = new class317();

	public class733(class199 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aaq.i(Ladu;I)V")
	public void method14091(class810 arg0) {
		this.field8732.field3475 = arg0.field9594;
		this.field8732.field3476 = arg0.field9597;
		this.field8732.field3477 = arg0.field9598;
		if (Float.isNaN(this.field8730.field3475)) {
			this.field8730.method5334(this.field8732);
			this.field8733.method5370();
		}
		this.field8731 = arg0.field9595;
	}

	@ObfuscatedName("aaq.u(FLmv;[[[IB)V")
	public void method4014(float arg0, class361 arg1, int[][][] arg2) {
		this.field2340.method3811(true, arg0, this.field8730, this.field2340.method3726(), this.field8732, this.field8733);
	}

	@ObfuscatedName("aaq.j(B)Z")
	public boolean method4030() {
		return !Float.isNaN(this.field8730.field3475);
	}

	@ObfuscatedName("aaq.a(I)Lko;")
	public class317 method4016() {
		return class317.method5290(this.field8730);
	}

	@ObfuscatedName("aaq.s(B)Ladu;")
	public class810 method4017() {
		return new class810(this.field8731, (int) this.field8730.field3475, (int) this.field8730.field3476, (int) this.field8730.field3477);
	}

	@ObfuscatedName("aaq.c(Lfi;III)V")
	public void method4029(class195 arg0, int arg1, int arg2) {
		arg0.field2212 = (int) this.field8730.field3475 - arg1;
		arg0.field2211 = (int) -this.field8730.field3476;
		arg0.field2213 = (int) this.field8730.field3477 - arg2;
	}

	@ObfuscatedName("aaq.m(Laet;B)V")
	public void method4018(class814 arg0) {
		this.field8732.method5292(arg0);
	}
}
