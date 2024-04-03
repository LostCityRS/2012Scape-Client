import deob.ObfuscatedName;

@ObfuscatedName("kw")
public class Js5GroupResourceLoader implements ResourceLoader {

    @ObfuscatedName("kw.u")
    public final Js5 field3490;

    @ObfuscatedName("kw.j")
    public final String field3491;

    public Js5GroupResourceLoader(Js5 arg0, String arg1) {
        this.field3490 = arg0;
        this.field3491 = arg1;
    }

    @ObfuscatedName("kw.u(I)I")
    public int method5533() {
        return this.field3490.method5648(this.field3491) ? 100 : this.field3490.method5650(this.field3491);
    }

    @ObfuscatedName("kw.j(I)Lva;")
    public LoadableResourceType method5534() {
        return LoadableResourceType.field6836;
    }
}
