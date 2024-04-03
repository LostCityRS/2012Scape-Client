import deob.ObfuscatedName;

@ObfuscatedName("mm")
public class class376 {

    @ObfuscatedName("mm.u")
    public int field4050;

    @ObfuscatedName("mm.j")
    public int field4051;

    @ObfuscatedName("mm.a")
    public int[] field4049;

    @ObfuscatedName("mm.s")
    public int[] field4052;

    public class376() {
        class796.method15060(16);
        this.field4050 = class796.method15084() == 0 ? 1 : class796.method15060(4) + 1;
        if (class796.method15084() != 0) {
            class796.method15060(8);
        }
        class796.method15060(2);
        if (this.field4050 > 1) {
            this.field4051 = class796.method15060(4);
        }
        this.field4049 = new int[this.field4050];
        this.field4052 = new int[this.field4050];
        for (int var1 = 0; var1 < this.field4050; var1++) {
            class796.method15060(8);
            this.field4049[var1] = class796.method15060(8);
            this.field4052[var1] = class796.method15060(8);
        }
    }
}
