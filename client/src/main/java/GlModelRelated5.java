import deob.ObfuscatedName;

@ObfuscatedName("hs")
public class GlModelRelated5 {

    @ObfuscatedName("hs.u")
    public int field2477;

    @ObfuscatedName("hs.j")
    public int field2474 = 128;

    @ObfuscatedName("hs.a")
    public int field2475 = 128;

    @ObfuscatedName("hs.s")
    public int field2476;

    @ObfuscatedName("hs.c")
    public int field2473;

    @ObfuscatedName("hs.m")
    public int field2478;

    public GlModelRelated5(int arg0) {
        this.field2477 = arg0;
    }

    public GlModelRelated5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2477 = arg0;
        this.field2474 = arg1;
        this.field2475 = arg2;
        this.field2476 = arg3;
        this.field2473 = arg4;
        this.field2478 = arg5;
    }

    @ObfuscatedName("hs.u()Lhs;")
    public GlModelRelated5 method4403() {
        return new GlModelRelated5(this.field2477, this.field2474, this.field2475, this.field2476, this.field2473, this.field2478);
    }

    @ObfuscatedName("hs.j(Lhs;)V")
    public void method4402(GlModelRelated5 arg0) {
        this.field2474 = arg0.field2474;
        this.field2475 = arg0.field2475;
        this.field2476 = arg0.field2476;
        this.field2473 = arg0.field2473;
        this.field2477 = arg0.field2477;
        this.field2478 = arg0.field2478;
    }
}
