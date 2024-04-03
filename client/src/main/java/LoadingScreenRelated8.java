import deob.ObfuscatedName;

@ObfuscatedName("aac")
public class LoadingScreenRelated8 extends LoadingScreenSprite {

    @ObfuscatedName("aac.s")
    public int field8717 = 0;

    public LoadingScreenRelated8(Js5 arg0, LoadingScreenRelated8_Sub1 arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("aac.j(ZI)V")
    public void method3932(boolean arg0) {
        int var2 = this.field2303.field2651.method4586(this.field2301.method1042(), client.field9067) + this.field2303.field2650;
        int var3 = this.field2303.field2649.method4574(this.field2301.method1047(), client.field9068) + this.field2303.field2647;
        this.field2301.method2503((float) (var2 + this.field2301.method1042() / 2), (float) (var3 + this.field2301.method1047() / 2), 4096, this.field8717);
        this.field8717 += ((LoadingScreenRelated8_Sub1) this.field2303).field8829;
    }
}
