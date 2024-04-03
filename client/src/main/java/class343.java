import deob.ObfuscatedName;

@ObfuscatedName("lw")
public final class class343 implements Comparable {

    @ObfuscatedName("lw.u")
    public Object field3715;

    @ObfuscatedName("lw.j")
    public Object field3713;

    @ObfuscatedName("lw.a")
    public long field3714;

    @ObfuscatedName("lw.s")
    public long field3712;

    public class343(Object arg0, Object arg1) {
        this.field3715 = arg0;
        this.field3713 = arg1;
    }

    @ObfuscatedName("lw.u(Llw;I)I")
    public int method5940(class343 arg0) {
        if (this.field3712 < arg0.field3712) {
            return -1;
        } else if (this.field3712 > arg0.field3712) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class343)) {
            throw new IllegalArgumentException();
        }
        return this.field3713.equals(((class343) arg0).field3713);
    }

    public int compareTo(Object arg0) {
        return this.method5940((class343) arg0);
    }
}
