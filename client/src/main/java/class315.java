
import deob.ObfuscatedName;

@ObfuscatedName("kx")
public class class315 {

	@ObfuscatedName("kx.u")
	public class316 field3463 = new class316();

	@ObfuscatedName("kx.j")
	public class317 field3464 = new class317();

	public class315() {
	}

	public class315(class315 arg0) {
		this.method5191(arg0);
	}

	@ObfuscatedName("kx.u(Lkx;)V")
	public void method5191(class315 arg0) {
		this.field3463.method5214(arg0.field3463);
		this.field3464.method5334(arg0.field3464);
	}

	@ObfuscatedName("kx.j()V")
	public final void method5192() {
		this.field3463.method5220();
		this.field3464.method5329();
		this.field3464.method5318(this.field3463);
	}

	@ObfuscatedName("kx.a(Lkx;)V")
	public final void method5190(class315 arg0) {
		this.field3463.method5266(arg0.field3463);
		this.field3464.method5318(arg0.field3463);
		this.field3464.method5299(arg0.field3464);
	}

	public String toString() {
		return "[" + this.field3463.toString() + "|" + this.field3464.toString() + "]";
	}
}
