import deob.ObfuscatedName;

@ObfuscatedName("rx")
public class MiniMenuDefaults {

    @ObfuscatedName("rx.u")
    public Binding field5120;

    @ObfuscatedName("rx.j")
    public Binding field5121;

    @ObfuscatedName("rx.a")
    public Binding field5122;

    @ObfuscatedName("rx.s")
    public Binding field5123;

    @ObfuscatedName("rx.c")
    public KeyHeldBinding field5125;

    @ObfuscatedName("rx.m")
    public KeyHeldBinding ctrlrunning;

    @ObfuscatedName("rx.t")
    public KeyHeldBinding field5126;

    @ObfuscatedName("rx.l")
    public int field5127;

    @ObfuscatedName("rx.f")
    public int field5128;

    @ObfuscatedName("rx.d")
    public boolean field5124;

    public MiniMenuDefaults(Js5 arg0) {
        byte[] var2 = arg0.method5635(DefaultsGroup.field5137.field5145);
        this.method8582(new Packet(var2));
    }

    @ObfuscatedName("rx.u(Laet;I)V")
    public void method8582(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            if (var2 == 1) {
                this.field5120 = Bindings.method15895(arg0);
            } else if (var2 == 2) {
                this.field5121 = Bindings.method15895(arg0);
            } else if (var2 == 3) {
                this.field5122 = Bindings.method15895(arg0);
            } else if (var2 == 4) {
                this.field5123 = Bindings.method15895(arg0);
            } else if (var2 == 5) {
                this.field5125 = Statics.method3541(arg0);
            } else if (var2 == 6) {
                this.ctrlrunning = Statics.method3541(arg0);
            } else if (var2 == 7) {
                this.field5126 = Statics.method3541(arg0);
            } else if (var2 == 8) {
                Bindings.method15895(arg0);
            } else if (var2 == 9) {
                Bindings.method15895(arg0);
            } else if (var2 == 10) {
                Bindings.method15895(arg0);
            } else if (var2 == 11) {
                this.field5124 = true;
            } else if (var2 == 12) {
                this.field5127 = arg0.g4s();
            } else if (var2 == 13) {
                this.field5128 = arg0.g4s();
            }
        }
    }
}
