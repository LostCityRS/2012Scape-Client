import deob.ObfuscatedName;

@ObfuscatedName("gh")
public class LoadingScreenElementFactory {

    @ObfuscatedName("gh.u")
    public final Js5 field2320;

    @ObfuscatedName("gh.j")
    public final Js5 field2318;

    @ObfuscatedName("gh.a")
    public LoadingScreenNewsManager field2319;

    public LoadingScreenElementFactory(Js5 arg0, Js5 arg1) {
        this.field2320 = arg0;
        this.field2318 = arg1;
    }

    @ObfuscatedName("gh.u(Lij;B)Lgl;")
    public LoadingScreenElement method3973(LoadingScreenElementConfig arg0) {
        if (arg0 == null) {
            return null;
        }
        LoadingScreenElementType var2 = arg0.method4543();
        if (LoadingScreenElementType.field2623 == var2) {
            return new LoadingScreenClear((LoadingScreenClearConfig) arg0);
        } else if (LoadingScreenElementType.field2626 == var2) {
            return new LoadingScreenNewsDisplay(this.method3974(), (LoadingScreenNewsDisplayConfig) arg0);
        } else if (LoadingScreenElementType.field2624 == var2) {
            return new LoadingScreenSprite(this.field2320, (LoadingScreenSpriteConfig) arg0);
        } else if (LoadingScreenElementType.field2622 == var2) {
            return new LoadingScreenRelated8(this.field2320, (LoadingScreenRelated8_Sub1) arg0);
        } else if (LoadingScreenElementType.field2620 == var2) {
            return new LoadingScreenRelated6(this.field2320, this.field2318, (LoadingScreenRelated6_Sub1) arg0);
        } else if (LoadingScreenElementType.field2621 == var2) {
            return new LoadingScreenRelated5(this.field2320, this.field2318, (LoadingScreenRelated5_Sub1) arg0);
        } else if (LoadingScreenElementType.field2625 == var2) {
            return new LoadingScreenRelated4(this.field2320, this.field2318, (LoadingScreenRelated4_Sub1) arg0);
        } else if (LoadingScreenElementType.field2619 == var2) {
            return new LoadingScreenRelated3(this.field2320, this.field2318, (LoadingScreenRelated3_Sub1) arg0);
        } else if (LoadingScreenElementType.field2627 == var2) {
            return new LoadingScreenRelated2(this.field2320, (LoadingScreenRelated2_Sub1) arg0);
        } else if (LoadingScreenElementType.field2628 == var2) {
            return new LoadingScreenRelated1(this.field2320, this.field2318, (LoadingScreenRelated1_Sub1) arg0);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gh.j(I)Lgf;")
    public LoadingScreenNewsManager method3974() {
        if (this.field2319 == null) {
            this.field2319 = new LoadingScreenNewsManager();
        }
        return this.field2319;
    }
}
