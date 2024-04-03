import deob.ObfuscatedName;

@ObfuscatedName("mt")
public class SoundEnvelope {

    @ObfuscatedName("mt.u")
    public int field3999 = 2;

    @ObfuscatedName("mt.j")
    public int[] field4007 = new int[2];

    @ObfuscatedName("mt.a")
    public int[] field3997 = new int[2];

    @ObfuscatedName("mt.s")
    public int field4000;

    @ObfuscatedName("mt.c")
    public int field4001;

    @ObfuscatedName("mt.m")
    public int field3998;

    @ObfuscatedName("mt.t")
    public int field4003;

    @ObfuscatedName("mt.l")
    public int field4004;

    @ObfuscatedName("mt.f")
    public int field4005;

    @ObfuscatedName("mt.d")
    public int field4002;

    @ObfuscatedName("mt.z")
    public int field4006;

    public SoundEnvelope() {
        this.field4007[0] = 0;
        this.field4007[1] = 65535;
        this.field3997[0] = 0;
        this.field3997[1] = 65535;
    }

    @ObfuscatedName("mt.u(Laet;)V")
    public final void method6470(Packet arg0) {
        this.field3998 = arg0.method15220();
        this.field4000 = arg0.method15379();
        this.field4001 = arg0.method15379();
        this.method6471(arg0);
    }

    @ObfuscatedName("mt.j(Laet;)V")
    public final void method6471(Packet arg0) {
        this.field3999 = arg0.method15220();
        this.field4007 = new int[this.field3999];
        this.field3997 = new int[this.field3999];
        for (int var2 = 0; var2 < this.field3999; var2++) {
            this.field4007[var2] = arg0.method15239();
            this.field3997[var2] = arg0.method15239();
        }
    }

    @ObfuscatedName("mt.a()V")
    public final void method6472() {
        this.field4003 = 0;
        this.field4004 = 0;
        this.field4005 = 0;
        this.field4002 = 0;
        this.field4006 = 0;
    }

    @ObfuscatedName("mt.s(I)I")
    public final int method6476(int arg0) {
        if (this.field4006 >= this.field4003) {
            this.field4002 = this.field3997[this.field4004++] << 15;
            if (this.field4004 >= this.field3999) {
                this.field4004 = this.field3999 - 1;
            }
            this.field4003 = (int) ((double) this.field4007[this.field4004] / 65536.0D * (double) arg0);
            if (this.field4003 > this.field4006) {
                this.field4005 = ((this.field3997[this.field4004] << 15) - this.field4002) / (this.field4003 - this.field4006);
            }
        }
        this.field4002 += this.field4005;
        this.field4006++;
        return this.field4002 - this.field4005 >> 15;
    }
}
