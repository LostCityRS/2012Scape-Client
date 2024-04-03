import deob.ObfuscatedName;

@ObfuscatedName("ti")
public final class DualLinkQueue {

    @ObfuscatedName("ti.u")
    public DualLink field6653 = new DualLink();

    @ObfuscatedName("ti.j")
    public DualLink field6652;

    public DualLinkQueue() {
        this.field6653.field9265 = this.field6653;
        this.field6653.field9266 = this.field6653;
    }

    @ObfuscatedName("ti.u(Lacl;I)V")
    public void method11668(DualLink arg0) {
        if (arg0.field9266 != null) {
            arg0.method14730();
        }
        arg0.field9266 = this.field6653.field9266;
        arg0.field9265 = this.field6653;
        arg0.field9266.field9265 = arg0;
        arg0.field9265.field9266 = arg0;
    }

    @ObfuscatedName("ti.j(I)Lacl;")
    public DualLink method11670() {
        DualLink var1 = this.field6653.field9265;
        if (this.field6653 == var1) {
            this.field6652 = null;
            return null;
        } else {
            this.field6652 = var1.field9265;
            return var1;
        }
    }

    @ObfuscatedName("ti.a(I)Lacl;")
    public DualLink method11671() {
        DualLink var1 = this.field6652;
        if (this.field6653 == var1) {
            this.field6652 = null;
            return null;
        } else {
            this.field6652 = var1.field9265;
            return var1;
        }
    }

    @ObfuscatedName("ti.s(I)V")
    public void method11676() {
        while (true) {
            DualLink var1 = this.field6653.field9265;
            if (this.field6653 == var1) {
                this.field6652 = null;
                return;
            }
            var1.method14730();
        }
    }

    @ObfuscatedName("ti.c(B)I")
    public int method11681() {
        int var1 = 0;
        for (DualLink var2 = this.field6653.field9265; var2 != this.field6653; var2 = var2.field9265) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ti.m(B)Z")
    public boolean method11674() {
        return this.field6653.field9265 == this.field6653;
    }
}
