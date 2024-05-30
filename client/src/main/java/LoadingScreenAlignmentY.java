import deob.ObfuscatedName;

@ObfuscatedName("iv")
public class LoadingScreenAlignmentY {

    @ObfuscatedName("iv.u")
    public static final LoadingScreenAlignmentY field2612 = new LoadingScreenAlignmentY();

    @ObfuscatedName("iv.j")
    public static final LoadingScreenAlignmentY field2613 = new LoadingScreenAlignmentY();

    @ObfuscatedName("iv.a")
    public static final LoadingScreenAlignmentY field2614 = new LoadingScreenAlignmentY();

    @ObfuscatedName("fm.u(I)[Liv;")
    public static LoadingScreenAlignmentY[] method3623() {
        return new LoadingScreenAlignmentY[]{field2612, field2613, field2614};
    }

    @ObfuscatedName("iv.j(III)I")
    public int method4574(int arg0, int arg1) {
        int var3 = GameShell.canvasHei > arg1 ? GameShell.canvasHei : arg1;
        if (field2612 == this) {
            return 0;
        } else if (field2614 == this) {
            return var3 - arg0;
        } else if (field2613 == this) {
            return (var3 - arg0) / 2;
        } else {
            return 0;
        }
    }
}
