import deob.ObfuscatedName;

@ObfuscatedName("ahf")
public class PositionSpline_Sub1 extends PositionSpline {

    public PositionSpline_Sub1(Camera arg0) {
        super(arg0);
    }

    @ObfuscatedName("ahf.v(FFFI)F")
    public float method14121(float arg0, float arg1, float arg2) {
        float var4 = arg0 - this.field8747;
        if (this.field2340.method3728().x == Float.POSITIVE_INFINITY) {
            arg1 = this.field2340.method3724().method5338();
        } else {
            float var5 = arg1 / this.field2340.method3728().method5338();
            float var6 = arg1 / 2.0F * var5;
            if (var6 > var4) {
                arg1 -= this.field2340.method3728().method5338() * arg2;
                if (arg1 < 0.0F) {
                    arg1 = 0.0F;
                }
            } else if (arg1 < this.field2340.method3724().method5338()) {
                arg1 += this.field2340.method3728().method5338() * arg2;
                if (arg1 > this.field2340.method3724().method5338()) {
                    arg1 = this.field2340.method3724().method5338();
                }
            }
        }
        return arg1;
    }
}
