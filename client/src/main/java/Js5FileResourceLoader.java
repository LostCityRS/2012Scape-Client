import deob.ObfuscatedName;

@ObfuscatedName("kf")
public class Js5FileResourceLoader implements ResourceLoader {

    @ObfuscatedName("kf.u")
    public final Js5 field3486;

    @ObfuscatedName("kf.j")
    public final String field3487;

    public Js5FileResourceLoader(Js5 arg0, String arg1) {
        this.field3486 = arg0;
        this.field3487 = arg1;
    }

    @ObfuscatedName("kf.u(I)I")
    public int method5533() {
        return this.field3486.method5647(this.field3487) ? 100 : 0;
    }

    @ObfuscatedName("kf.j(I)Lva;")
    public LoadableResourceType method5534() {
        return LoadableResourceType.field6834;
    }
}
