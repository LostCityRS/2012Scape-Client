import deob.ObfuscatedName;

@ObfuscatedName("ajb")
public abstract class CacheEntry extends SecondaryNode {

    @ObfuscatedName("ajb.t")
    public final int field10374;

    @ObfuscatedName("ajb.l")
    public final CacheKey field10375;

    public CacheEntry(CacheKey arg0, int arg1) {
        this.field10375 = arg0;
        this.field10374 = arg1;
    }

    @ObfuscatedName("ajb.u()Ljava/lang/Object;")
    public abstract Object method16728();

    @ObfuscatedName("ajb.j()Z")
    public abstract boolean method16730();
}
