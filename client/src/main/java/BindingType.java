import deob.ObfuscatedName;

@ObfuscatedName("pl")
public class BindingType {

    @ObfuscatedName("pl.u")
    public static final BindingType field4820 = new BindingType(0);

    @ObfuscatedName("pl.j")
    public static final BindingType field4818 = new BindingType(1);

    @ObfuscatedName("pl.a")
    public static final BindingType field4819 = new BindingType(2);

    @ObfuscatedName("pl.s")
    public final int field4821;

    @ObfuscatedName("ai.u(I)[Lpl;")
    public static BindingType[] method1773() {
        return new BindingType[]{field4820, field4818, field4819};
    }

    public BindingType(int arg0) {
        this.field4821 = arg0;
    }

    @ObfuscatedName("mn.j(II)Lpl;")
    public static BindingType method6333(int arg0) {
        BindingType[] var1 = method1773();
        for (int var2 = 0; var2 < var1.length; var2++) {
            BindingType var3 = var1[var2];
            if (var3.field4821 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
