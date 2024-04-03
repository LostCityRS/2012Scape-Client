import deob.ObfuscatedName;

@ObfuscatedName("aal")
public class LoadingScreenRelated6 extends LoadingScreenProgressDisplay {

    public LoadingScreenRelated6(Js5 arg0, Js5 arg1, LoadingScreenRelated6_Sub1 arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("aal.d(ZIII)V")
    public void method3955(boolean arg0, int arg1, int arg2) {
        int var4 = this.method3956() * this.field2311.field2602 / 10000;
        Statics.field5187.B(arg1, arg2 + 2, var4, this.field2311.field2607 - 2, ((LoadingScreenRelated6_Sub1) this.field2311).field8828, 0);
        Statics.field5187.B(arg1 + var4, arg2 + 2, this.field2311.field2602 - var4, this.field2311.field2607 - 2, 0, 0);
    }

    @ObfuscatedName("aal.f(ZIIS)V")
    public void method3957(boolean arg0, int arg1, int arg2) {
        Statics.field5187.method488(arg1 - 2, arg2, this.field2311.field2602 + 4, this.field2311.field2607 + 2, ((LoadingScreenRelated6_Sub1) this.field2311).field8827, 0);
        Statics.field5187.method488(arg1 - 1, arg2 + 1, this.field2311.field2602 + 2, this.field2311.field2607, 0, 0);
    }
}
