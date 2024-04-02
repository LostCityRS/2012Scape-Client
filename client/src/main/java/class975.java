
import deob.ObfuscatedName;

@ObfuscatedName("akx")
public class class975 extends LookatSpline {

	public class975(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("akx.x(FFFI)F")
	public float method15934(float arg0, float arg1, float arg2) {
		float var4 = arg0 - this.field9895;
		if (this.field6645.method3809().field3475 == Float.POSITIVE_INFINITY) {
			arg1 = this.field6645.method3730().method5338();
		} else {
			float var5 = arg1 / this.field6645.method3809().method5338();
			float var6 = arg1 / 2.0F * var5;
			if (var6 > var4) {
				arg1 -= this.field6645.method3809().method5338() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.field6645.method3730().method5338()) {
				arg1 += this.field6645.method3809().method5338() * arg2;
				if (arg1 > this.field6645.method3730().method5338()) {
					arg1 = this.field6645.method3730().method5338();
				}
			}
		}
		return arg1;
	}
}
