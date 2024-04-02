
import deob.ObfuscatedName;

@ObfuscatedName("aka")
public class class976 extends class871 {

	@ObfuscatedName("aka.c")
	public float field10514;

	@ObfuscatedName("aka.m")
	public float field10515;

	public class976(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("aka.x(FFFI)F")
	public float method15934(float arg0, float arg1, float arg2) {
		float var4 = this.field9895 / arg0;
		if (var4 < 0.0F) {
			var4 = 0.0F;
		}
		if (var4 > 1.0F) {
			var4 = 1.0F;
		}
		return (this.field10515 - this.field10514) * var4 + this.field10514;
	}
}
