import deob.ObfuscatedName;

@ObfuscatedName("ti")
public final class class549 {

    @ObfuscatedName("ti.u")
    public class766 field6653 = new class766();

    @ObfuscatedName("ti.j")
    public class766 field6652;

    public class549() {
        this.field6653.field9265 = this.field6653;
        this.field6653.field9266 = this.field6653;
    }

    @ObfuscatedName("ti.u(Lacl;I)V")
    public void method11668(class766 arg0) {
        if (arg0.field9266 != null) {
            arg0.method14730();
        }
        arg0.field9266 = this.field6653.field9266;
        arg0.field9265 = this.field6653;
        arg0.field9266.field9265 = arg0;
        arg0.field9265.field9266 = arg0;
    }

    @ObfuscatedName("ti.j(I)Lacl;")
    public class766 method11670() {
        class766 var1 = this.field6653.field9265;
        if (this.field6653 == var1) {
            this.field6652 = null;
            return null;
        } else {
            this.field6652 = var1.field9265;
            return var1;
        }
    }

    @ObfuscatedName("ti.a(I)Lacl;")
    public class766 method11671() {
        class766 var1 = this.field6652;
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
            class766 var1 = this.field6653.field9265;
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
        for (class766 var2 = this.field6653.field9265; var2 != this.field6653; var2 = var2.field9265) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("ti.m(B)Z")
    public boolean method11674() {
        return this.field6653.field9265 == this.field6653;
    }
}
