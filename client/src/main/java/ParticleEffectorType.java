import deob.ObfuscatedName;

@ObfuscatedName("ic")
public class ParticleEffectorType {

    @ObfuscatedName("ic.d")
    public static ParticleEffectorType[] field2756 = new ParticleEffectorType[16];

    @ObfuscatedName("ic.z")
    public static int field2764 = 0;

    @ObfuscatedName("ic.n")
    public static IterableMap field2745 = new IterableMap(16);

    @ObfuscatedName("ic.q")
    public static WeightedCache field2758 = new WeightedCache(64);

    @ObfuscatedName("ic.p")
    public int field2748;

    @ObfuscatedName("ic.w")
    public int field2760;

    @ObfuscatedName("ic.b")
    public int field2761;

    @ObfuscatedName("ic.x")
    public int field2754;

    @ObfuscatedName("ic.i")
    public int field2763;

    @ObfuscatedName("ic.v")
    public int field2765;

    @ObfuscatedName("ic.k")
    public int field2759;

    @ObfuscatedName("ic.h")
    public int field2766;

    @ObfuscatedName("ic.r")
    public int field2767 = 0;

    @ObfuscatedName("ic.g")
    public int field2768 = 0;

    @ObfuscatedName("ic.y")
    public boolean field2747 = false;

    @ObfuscatedName("ic.e")
    public int field2770;

    @ObfuscatedName("ic.ay")
    public long field2771;

    @ObfuscatedName("ic.af")
    public int field2772;

    @ObfuscatedName("fo.u(Lls;B)V")
    public static void method3618(Js5 arg0) {
        Statics.field2757 = arg0;
    }

    @ObfuscatedName("eg.j(IS)Lic;")
    public static ParticleEffectorType method2938(int arg0) {
        ParticleEffectorType var1 = (ParticleEffectorType) field2758.method7916((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2757.method5627(1, arg0);
        ParticleEffectorType var3 = new ParticleEffectorType();
        var3.field2748 = arg0;
        if (var2 != null) {
            var3.method4679(new Packet(var2));
        }
        var3.method4675();
        if (var3.field2760 == 2 && field2745.getNode((long) arg0) == null) {
            field2745.put(new IntNode(field2764), (long) arg0);
            field2756[++field2764 - 1] = var3;
        }
        field2758.method7937(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.a(Laet;I)V")
    public void method4679(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method4685(arg0, var2);
        }
    }

    @ObfuscatedName("ic.s(Laet;II)V")
    public void method4685(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field2761 = arg0.g2();
        } else if (arg1 == 2) {
            arg0.g1();
        } else if (arg1 == 3) {
            this.field2754 = arg0.g4s();
            this.field2763 = arg0.g4s();
            this.field2765 = arg0.g4s();
        } else if (arg1 == 4) {
            this.field2759 = arg0.g1();
            this.field2766 = arg0.g4s();
        } else if (arg1 == 6) {
            this.field2760 = arg0.g1();
        } else if (arg1 == 8) {
            this.field2767 = 1;
        } else if (arg1 == 9) {
            this.field2768 = 1;
        } else if (arg1 == 10) {
            this.field2747 = true;
        }
    }

    @ObfuscatedName("ic.c(B)V")
    public void method4675() {
        this.field2772 = Trig1.cos[this.field2761 << 3];
        long var1 = (long) this.field2754;
        long var3 = (long) this.field2763;
        long var5 = (long) this.field2765;
        this.field2770 = (int) Math.sqrt((double) (var5 * var5 + var1 * var1 + var3 * var3));
        if (this.field2766 == 0) {
            this.field2766 = 1;
        }
        if (this.field2759 == 0) {
            this.field2771 = 2147483647L;
        } else if (this.field2759 == 1) {
            this.field2771 = this.field2770 * 8 / this.field2766;
            this.field2771 *= this.field2771;
        } else if (this.field2759 == 2) {
            this.field2771 = this.field2770 * 8 / this.field2766;
        }
        if (this.field2747) {
            this.field2770 *= -1;
        }
    }

    @ObfuscatedName("ph.m(B)V")
    public static void method7882() {
        field2758.method7922();
    }
}
