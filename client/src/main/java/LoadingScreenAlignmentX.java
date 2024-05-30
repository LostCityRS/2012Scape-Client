import deob.ObfuscatedName;

@ObfuscatedName("id")
public class LoadingScreenAlignmentX {

    @ObfuscatedName("id.u")
    public static final LoadingScreenAlignmentX field2616 = new LoadingScreenAlignmentX();

    @ObfuscatedName("id.j")
    public static final LoadingScreenAlignmentX field2615 = new LoadingScreenAlignmentX();

    @ObfuscatedName("id.a")
    public static final LoadingScreenAlignmentX field2617 = new LoadingScreenAlignmentX();

    @ObfuscatedName("ads.u(B)[Lid;")
    public static LoadingScreenAlignmentX[] method15177() {
        return new LoadingScreenAlignmentX[]{field2616, field2615, field2617};
    }

    @ObfuscatedName("id.j(III)I")
    public int method4586(int arg0, int arg1) {
        int var3 = GameShell.canvasWid > arg1 ? GameShell.canvasWid : arg1;
        if (field2616 == this) {
            return 0;
        } else if (field2617 == this) {
            return var3 - arg0;
        } else if (field2615 == this) {
            return (var3 - arg0) / 2;
        } else {
            return 0;
        }
    }
}
