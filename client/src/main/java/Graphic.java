import deob.ObfuscatedName;

@ObfuscatedName("es")
public class Graphic {

    @ObfuscatedName("es.u")
    public final int field1728;

    @ObfuscatedName("es.j")
    public final int field1727;

    @ObfuscatedName("es.a")
    public final int[] field1726;

    @ObfuscatedName("es.s")
    public final int[] field1729;

    @ObfuscatedName("es.c")
    public final class11 field1730;

    @ObfuscatedName("es.m")
    public final int field1731;

    public Graphic(int arg0, int arg1, int[] arg2, int[] arg3, class11 arg4, int arg5) {
        this.field1728 = arg0;
        this.field1727 = arg1;
        this.field1726 = arg2;
        this.field1729 = arg3;
        this.field1730 = arg4;
        this.field1731 = arg5;
    }

    @ObfuscatedName("es.u(III)Z")
    public boolean method3099(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field1729.length) {
            int var3 = this.field1729[arg1];
            if (arg0 >= var3 && arg0 <= this.field1726[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
