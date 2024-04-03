import deob.ObfuscatedName;

@ObfuscatedName("bx")
public class GlModelRelated7 {

    @ObfuscatedName("bx.u")
    public int field1090;

    @ObfuscatedName("bx.j")
    public int field1091 = 128;

    @ObfuscatedName("bx.a")
    public int field1095 = 128;

    @ObfuscatedName("bx.s")
    public int field1092;

    @ObfuscatedName("bx.c")
    public int field1094;

    @ObfuscatedName("bx.m")
    public int field1093;

    public GlModelRelated7(int arg0) {
        this.field1090 = arg0;
    }

    public GlModelRelated7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1090 = arg0;
        this.field1091 = arg1;
        this.field1095 = arg2;
        this.field1092 = arg3;
        this.field1094 = arg4;
        this.field1093 = arg5;
    }

    @ObfuscatedName("bx.u()Lbx;")
    public GlModelRelated7 method2244() {
        return new GlModelRelated7(this.field1090, this.field1091, this.field1095, this.field1092, this.field1094, this.field1093);
    }

    @ObfuscatedName("bx.j(Lbx;)V")
    public void method2245(GlModelRelated7 arg0) {
        this.field1091 = arg0.field1091;
        this.field1095 = arg0.field1095;
        this.field1092 = arg0.field1092;
        this.field1094 = arg0.field1094;
        this.field1090 = arg0.field1090;
        this.field1093 = arg0.field1093;
    }
}
