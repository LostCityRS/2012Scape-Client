import deob.ObfuscatedName;

@ObfuscatedName("iu")
public class ParticleEmitterType {

    @ObfuscatedName("iu.c")
    public static WeightedCache field2676 = new WeightedCache(64);

    @ObfuscatedName("iu.m")
    public short field2677;

    @ObfuscatedName("iu.t")
    public short field2678;

    @ObfuscatedName("iu.l")
    public short field2714;

    @ObfuscatedName("iu.f")
    public short field2737;

    @ObfuscatedName("iu.d")
    public int field2681;

    @ObfuscatedName("iu.z")
    public int field2682;

    @ObfuscatedName("iu.n")
    public int field2683 = 0;

    @ObfuscatedName("iu.o")
    public int field2684;

    @ObfuscatedName("iu.q")
    public int field2685 = -1;

    @ObfuscatedName("iu.p")
    public int field2717 = 100;

    @ObfuscatedName("iu.w")
    public int field2716;

    @ObfuscatedName("iu.b")
    public int field2688;

    @ObfuscatedName("iu.x")
    public int field2689 = -1;

    @ObfuscatedName("iu.i")
    public int field2690 = 100;

    @ObfuscatedName("iu.v")
    public int field2691;

    @ObfuscatedName("iu.k")
    public int field2730;

    @ObfuscatedName("iu.h")
    public boolean field2693 = true;

    @ObfuscatedName("iu.r")
    public int field2712;

    @ObfuscatedName("iu.g")
    public int field2695 = 100;

    @ObfuscatedName("iu.y")
    public int field2696 = 100;

    @ObfuscatedName("iu.e")
    public int field2697 = -1;

    @ObfuscatedName("iu.ay")
    public int field2680;

    @ObfuscatedName("iu.af")
    public int field2699;

    @ObfuscatedName("iu.ar")
    public int field2700;

    @ObfuscatedName("iu.an")
    public int field2679;

    @ObfuscatedName("iu.ap")
    public int[] field2702;

    @ObfuscatedName("iu.ag")
    public int[] field2674;

    @ObfuscatedName("iu.as")
    public int[] field2698;

    @ObfuscatedName("iu.ai")
    public int[] field2705;

    @ObfuscatedName("iu.al")
    public int field2707 = -2;

    @ObfuscatedName("iu.at")
    public int field2708 = -2;

    @ObfuscatedName("iu.ax")
    public int field2709 = 0;

    @ObfuscatedName("iu.aw")
    public boolean field2743 = true;

    @ObfuscatedName("iu.aa")
    public boolean field2711 = true;

    @ObfuscatedName("iu.am")
    public int field2742 = -1;

    @ObfuscatedName("iu.ad")
    public int field2713 = -1;

    @ObfuscatedName("iu.az")
    public int field2722 = 0;

    @ObfuscatedName("iu.ak")
    public boolean field2715 = true;

    @ObfuscatedName("iu.av")
    public int field2672 = -1;

    @ObfuscatedName("iu.aj")
    public boolean field2694 = false;

    @ObfuscatedName("iu.ah")
    public boolean field2718 = true;

    @ObfuscatedName("iu.au")
    public boolean field2719 = false;

    @ObfuscatedName("iu.ae")
    public boolean field2701 = true;

    @ObfuscatedName("iu.ac")
    public boolean field2721 = false;

    @ObfuscatedName("iu.aq")
    public int field2731;

    @ObfuscatedName("iu.ab")
    public int field2723;

    @ObfuscatedName("iu.bq")
    public int field2724;

    @ObfuscatedName("iu.bz")
    public int field2725;

    @ObfuscatedName("iu.bv")
    public int field2726;

    @ObfuscatedName("iu.bj")
    public int field2727;

    @ObfuscatedName("iu.bf")
    public int field2728;

    @ObfuscatedName("iu.bt")
    public int field2732;

    @ObfuscatedName("iu.bg")
    public int field2720;

    @ObfuscatedName("iu.bl")
    public int field2687;

    @ObfuscatedName("iu.bk")
    public int field2692;

    @ObfuscatedName("iu.bs")
    public int field2733;

    @ObfuscatedName("iu.bn")
    public int field2734;

    @ObfuscatedName("iu.ba")
    public int field2735;

    @ObfuscatedName("iu.bd")
    public int field2736;

    @ObfuscatedName("iu.bc")
    public int field2686;

    @ObfuscatedName("iu.br")
    public int field2738;

    @ObfuscatedName("iu.bp")
    public int field2739;

    @ObfuscatedName("iu.bi")
    public int field2740;

    @ObfuscatedName("iu.bx")
    public int field2741;

    @ObfuscatedName("iu.bm")
    public int field2710;

    @ObfuscatedName("iu.bb")
    public int field2729;

    @ObfuscatedName("pp.u(Lls;I)V")
    public static void method7704(Js5 arg0) {
        Statics.field2675 = arg0;
    }

    @ObfuscatedName("df.j(IB)Liu;")
    public static ParticleEmitterType method2841(int arg0) {
        ParticleEmitterType var1 = (ParticleEmitterType) field2676.method7916((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2675.method5627(0, arg0);
        ParticleEmitterType var3 = new ParticleEmitterType();
        if (var2 != null) {
            var3.method4657(new Packet(var2));
        }
        var3.method4660();
        field2676.method7937(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.a(Laet;B)V")
    public void method4657(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method4659(arg0, var2);
        }
    }

    @ObfuscatedName("iu.s(Laet;II)V")
    public void method4659(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field2677 = (short) arg0.g2();
            this.field2678 = (short) arg0.g2();
            this.field2714 = (short) arg0.g2();
            this.field2737 = (short) arg0.g2();
            byte var3 = 3;
            this.field2677 = (short) (this.field2677 << var3);
            this.field2678 = (short) (this.field2678 << var3);
            this.field2714 = (short) (this.field2714 << var3);
            this.field2737 = (short) (this.field2737 << var3);
        } else if (arg1 == 2) {
            arg0.g1();
        } else if (arg1 == 3) {
            this.field2681 = arg0.g4s();
            this.field2682 = arg0.g4s();
        } else if (arg1 == 4) {
            this.field2683 = arg0.g1();
            this.field2684 = arg0.g1b();
        } else if (arg1 == 5) {
            this.field2716 = this.field2688 = arg0.g2() << 12 << 2;
        } else if (arg1 == 6) {
            this.field2691 = arg0.g4s();
            this.field2730 = arg0.g4s();
        } else if (arg1 == 7) {
            this.field2680 = arg0.g2();
            this.field2699 = arg0.g2();
        } else if (arg1 == 8) {
            this.field2700 = arg0.g2();
            this.field2679 = arg0.g2();
        } else if (arg1 == 9) {
            int var4 = arg0.g1();
            this.field2702 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2702[var5] = arg0.g2();
            }
        } else if (arg1 == 10) {
            int var6 = arg0.g1();
            this.field2698 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2698[var7] = arg0.g2();
            }
        } else if (arg1 == 12) {
            this.field2707 = arg0.g1b();
        } else if (arg1 == 13) {
            this.field2708 = arg0.g1b();
        } else if (arg1 == 14) {
            this.field2709 = arg0.g2();
        } else if (arg1 == 15) {
            this.field2697 = arg0.g2();
        } else if (arg1 == 16) {
            this.field2743 = arg0.g1() == 1;
            this.field2742 = arg0.g2();
            this.field2713 = arg0.g2();
            this.field2711 = arg0.g1() == 1;
        } else if (arg1 == 17) {
            this.field2672 = arg0.g2();
        } else if (arg1 == 18) {
            this.field2712 = arg0.g4s();
        } else if (arg1 == 19) {
            this.field2722 = arg0.g1();
        } else if (arg1 == 20) {
            this.field2695 = arg0.g1();
        } else if (arg1 == 21) {
            this.field2696 = arg0.g1();
        } else if (arg1 == 22) {
            this.field2685 = arg0.g4s();
        } else if (arg1 == 23) {
            this.field2717 = arg0.g1();
        } else if (arg1 == 24) {
            this.field2693 = false;
        } else if (arg1 == 25) {
            int var8 = arg0.g1();
            this.field2674 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2674[var9] = arg0.g2();
            }
        } else if (arg1 == 26) {
            this.field2715 = false;
        } else if (arg1 == 27) {
            this.field2689 = arg0.g2() << 12 << 2;
        } else if (arg1 == 28) {
            this.field2690 = arg0.g1();
        } else if (arg1 == 29) {
            arg0.g2s();
        } else if (arg1 == 30) {
            this.field2694 = true;
        } else if (arg1 == 31) {
            this.field2716 = arg0.g2() << 12 << 2;
            this.field2688 = arg0.g2() << 12 << 2;
        } else if (arg1 == 32) {
            this.field2718 = false;
        } else if (arg1 == 33) {
            this.field2719 = true;
        } else if (arg1 == 34) {
            this.field2701 = false;
        }
    }

    @ObfuscatedName("iu.c(I)V")
    public void method4660() {
        if (this.field2707 > -2 || this.field2708 > -2) {
            this.field2721 = true;
        }
        this.field2731 = this.field2691 >> 16 & 0xFF;
        this.field2723 = this.field2730 >> 16 & 0xFF;
        this.field2724 = this.field2723 - this.field2731;
        this.field2725 = this.field2691 >> 8 & 0xFF;
        this.field2726 = this.field2730 >> 8 & 0xFF;
        this.field2727 = this.field2726 - this.field2725;
        this.field2728 = this.field2691 & 0xFF;
        this.field2732 = this.field2730 & 0xFF;
        this.field2720 = this.field2732 - this.field2728;
        this.field2687 = this.field2691 >> 24 & 0xFF;
        this.field2692 = this.field2730 >> 24 & 0xFF;
        this.field2733 = this.field2692 - this.field2687;
        if (this.field2712 != 0) {
            this.field2734 = this.field2699 * this.field2695 / 100;
            this.field2735 = this.field2699 * this.field2696 / 100;
            if (this.field2734 == 0) {
                this.field2734 = 1;
            }
            this.field2736 = ((this.field2712 >> 16 & 0xFF) - (this.field2724 / 2 + this.field2731) << 8) / this.field2734;
            this.field2686 = ((this.field2712 >> 8 & 0xFF) - (this.field2727 / 2 + this.field2725) << 8) / this.field2734;
            this.field2738 = ((this.field2712 & 0xFF) - (this.field2720 / 2 + this.field2728) << 8) / this.field2734;
            if (this.field2735 == 0) {
                this.field2735 = 1;
            }
            this.field2739 = ((this.field2712 >> 24 & 0xFF) - (this.field2733 / 2 + this.field2687) << 8) / this.field2735;
            this.field2736 += this.field2736 > 0 ? -4 : 4;
            this.field2686 += this.field2686 > 0 ? -4 : 4;
            this.field2738 += this.field2738 > 0 ? -4 : 4;
            this.field2739 += this.field2739 > 0 ? -4 : 4;
        }
        if (this.field2685 != -1) {
            this.field2740 = this.field2717 * this.field2699 / 100;
            if (this.field2740 == 0) {
                this.field2740 = 1;
            }
            this.field2741 = (this.field2685 - ((this.field2682 - this.field2681) / 2 + this.field2681)) / this.field2740;
        }
        if (this.field2689 == -1) {
            return;
        }
        this.field2710 = this.field2699 * this.field2690 / 100;
        if (this.field2710 == 0) {
            this.field2710 = 1;
        }
        this.field2729 = (this.field2689 - ((this.field2688 - this.field2716) / 2 + this.field2716)) / this.field2710;
    }

    @ObfuscatedName("jp.m(B)V")
    public static void method4807() {
        field2676.method7922();
    }
}
