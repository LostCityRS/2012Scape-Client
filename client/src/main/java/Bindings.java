import deob.ObfuscatedName;

@ObfuscatedName("pj")
public class Bindings {

    public Bindings() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("afu.u(Laet;I)Lpr;")
    public static Binding method15895(Packet arg0) {
        BindingType var1 = BindingType.method6333(arg0.method15220());
        if (BindingType.field4820 == var1) {
            return MouseBinding.method1698(arg0);
        } else if (BindingType.field4818 == var1) {
            return KeyBinding.method11866(arg0);
        } else if (BindingType.field4819 == var1) {
            return Statics.method3541(arg0);
        } else {
            return null;
        }
    }
}
