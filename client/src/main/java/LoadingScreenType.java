import deob.ObfuscatedName;

@ObfuscatedName("wb")
public class LoadingScreenType {

    @ObfuscatedName("wb.u")
    public LoadingScreenElementConfig[] field7395;

    @ObfuscatedName("wb.u(Laet;I)V")
    public void method12719(Packet arg0) {
        this.field7395 = new LoadingScreenElementConfig[arg0.method15220()];
        LoadingScreenElementType[] var2 = LoadingScreenElementType.method8288();
        for (int var3 = 0; var3 < this.field7395.length; var3++) {
            this.field7395[var3] = this.method12720(arg0, var2[arg0.method15220()]);
        }
    }

    @ObfuscatedName("wb.j(Laet;Lio;B)Lij;")
    public LoadingScreenElementConfig method12720(Packet arg0, LoadingScreenElementType arg1) {
        if (LoadingScreenElementType.field2623 == arg1) {
            return LoadingScreenClearConfig.method11849(arg0);
        } else if (LoadingScreenElementType.field2620 == arg1) {
            return LoadingScreenRelated6_Sub1.method12157(arg0);
        } else if (LoadingScreenElementType.field2626 == arg1) {
            return LoadingScreenNewsDisplayConfig.method2548(arg0);
        } else if (LoadingScreenElementType.field2622 == arg1) {
            return LoadingScreenRelated8_Sub1.method12717(arg0);
        } else if (LoadingScreenElementType.field2624 == arg1) {
            return LoadingScreenSpriteConfig.method7324(arg0);
        } else if (LoadingScreenElementType.field2621 == arg1) {
            return LoadingScreenRelated5_Sub1.method2607(arg0);
        } else if (LoadingScreenElementType.field2625 == arg1) {
            return LoadingScreenRelated4_Sub1.method4623(arg0);
        } else if (LoadingScreenElementType.field2619 == arg1) {
            return LoadingScreenRelated3_Sub1.method2822(arg0);
        } else if (LoadingScreenElementType.field2627 == arg1) {
            return LoadingScreenRelated2_Sub1.method3522(arg0);
        } else if (LoadingScreenElementType.field2628 == arg1) {
            return LoadingScreenRelated1_Sub1.method15894(arg0);
        } else {
            return null;
        }
    }
}
