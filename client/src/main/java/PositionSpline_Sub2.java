import deob.ObfuscatedName;

@ObfuscatedName("aha")
public class PositionSpline_Sub2 extends PositionSpline {

    @ObfuscatedName("aha.c")
    public float field10085;

    @ObfuscatedName("aha.m")
    public float field10086;

    public PositionSpline_Sub2(Camera arg0) {
        super(arg0);
    }

    @ObfuscatedName("aha.v(FFFI)F")
    public float method14121(float arg0, float arg1, float arg2) {
        float var4 = this.field8747 / arg0;
        if (var4 < 0.0F) {
            var4 = 0.0F;
        }
        if (var4 > 1.0F) {
            var4 = 1.0F;
        }
        return (this.field10086 - this.field10085) * var4 + this.field10085;
    }
}
