import deob.ObfuscatedName;

@ObfuscatedName("ahq")
public class LoadingScreenRelated1 extends LoadingScreenRelated4 {

    public LoadingScreenRelated1(Js5 arg0, Js5 arg1, LoadingScreenRelated1_Sub1 arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("ahq.i(IIIII)V")
    public void method14085(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field8725.method1042();
        int var6 = ((LoadingScreenRelated1_Sub1) this.field2311).field10137 * Loading.method3587() / 10 % var5;
        this.field8725.method2511(arg0 - var5 + var6, arg1, arg2 + var5 - var6, arg3);
    }
}
