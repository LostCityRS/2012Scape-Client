import deob.ObfuscatedName;

@ObfuscatedName("acb")
public class ObjIconRequest extends Node {

    @ObfuscatedName("acb.s")
    public int object;

    @ObfuscatedName("acb.c")
    public int count;

    @ObfuscatedName("acb.m")
    public int outline;

    @ObfuscatedName("acb.t")
    public int shadow;

    @ObfuscatedName("acb.l")
    public int countvis;

    @ObfuscatedName("acb.f")
    public boolean wearcol;

    public ObjIconRequest(int object, int count, int outline, int shadow, int countvis, boolean wearcol) {
        this.object = object;
        this.count = count;
        this.outline = outline;
        this.shadow = shadow;
        this.countvis = countvis;
        this.wearcol = wearcol;
    }
}
