
import deob.ObfuscatedName;

@ObfuscatedName("adi")
public class class800 extends class399 {

	@ObfuscatedName("adi.s")
	public long field9554;

	@ObfuscatedName("adi.c")
	public class800 field9552;

	@ObfuscatedName("adi.m")
	public class800 field9553;

	@ObfuscatedName("adi.r(B)V")
	public void method15142() {
		if (this.field9553 != null) {
			this.field9553.field9552 = this.field9552;
			this.field9552.field9553 = this.field9553;
			this.field9552 = null;
			this.field9553 = null;
		}
	}
}
