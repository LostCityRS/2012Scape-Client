import deob.ObfuscatedName;

@ObfuscatedName("ik")
public class BillboardType {

    @ObfuscatedName("ik.a")
    public static WeightedCache field2660 = new WeightedCache(64);

    @ObfuscatedName("ik.s")
    public int field2661 = -1;

    @ObfuscatedName("ik.c")
    public int field2658 = 64;

    @ObfuscatedName("ik.m")
    public int field2662 = 64;

    @ObfuscatedName("ik.t")
    public int field2664 = 2;

    @ObfuscatedName("ik.l")
    public int field2665 = 1;

    @ObfuscatedName("ik.f")
    public boolean field2666 = false;

    @ObfuscatedName("ik.d")
    public boolean field2667 = false;

    @ObfuscatedName("qg.u(Lls;I)V")
    public static void method8409(Js5 arg0) {
        Statics.field2663 = arg0;
    }

    @ObfuscatedName("fi.j(II)Lik;")
    public static BillboardType method3666(int arg0) {
        BillboardType var1 = (BillboardType) field2660.method7916((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2663.fetchFile(0, arg0);
        BillboardType var3 = new BillboardType();
        if (var2 != null) {
            var3.method4641(new Packet(var2), arg0);
        }
        field2660.method7937(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.a(Laet;II)V")
    public void method4641(Packet arg0, int arg1) {
        while (true) {
            int var3 = arg0.g1();
            if (var3 == 0) {
                return;
            }
            this.method4643(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ik.s(Laet;III)V")
    public void method4643(Packet arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2661 = arg0.g2();
            if (this.field2661 == 65535) {
                this.field2661 = -1;
            }
        } else if (arg1 == 2) {
            this.field2658 = arg0.g2() + 1;
            this.field2662 = arg0.g2() + 1;
        } else if (arg1 == 3) {
            arg0.g1b();
        } else if (arg1 == 4) {
            this.field2664 = arg0.g1();
        } else if (arg1 == 5) {
            this.field2665 = arg0.g1();
        } else if (arg1 == 6) {
            this.field2666 = true;
        } else if (arg1 == 7) {
            this.field2667 = true;
        }
    }
}
