import deob.ObfuscatedName;

@ObfuscatedName("acd")
public abstract class GlPostProcessEffect extends Node {

    @ObfuscatedName("acd.s")
    public final GlToolkit field9320;

    @ObfuscatedName("acd.c")
    public boolean field9321;

    public GlPostProcessEffect(GlToolkit arg0) {
        this.field9320 = arg0;
    }

    @ObfuscatedName("acd.t()I")
    public int method14832() {
        return 1;
    }

    @ObfuscatedName("acd.l()Z")
    public boolean method14825() {
        return false;
    }

    @ObfuscatedName("acd.f()Ldz;")
    public DataType method14826() {
        return DataType.field1501;
    }

    @ObfuscatedName("acd.d()Z")
    public boolean method14819() {
        return this.field9321;
    }

    @ObfuscatedName("acd.a()V")
    public abstract void method14820();

    @ObfuscatedName("acd.s(II)V")
    public abstract void method14821(int arg0, int arg1);

    @ObfuscatedName("acd.c(ILxp;Lxp;)V")
    public abstract void method14822(int arg0, GlRelated2 arg1, GlRelated2 arg2);

    @ObfuscatedName("acd.m(I)V")
    public abstract void method14823(int arg0);

    @ObfuscatedName("acd.u()Z")
    public abstract boolean method14840();

    @ObfuscatedName("acd.j()Z")
    public abstract boolean method14844();
}
