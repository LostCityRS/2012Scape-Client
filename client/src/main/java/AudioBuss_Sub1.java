import deob.ObfuscatedName;

@ObfuscatedName("aiu")
public class AudioBuss_Sub1 extends AudioBuss {

    @ObfuscatedName("aiu.l")
    public IterableQueue field10280 = new IterableQueue();

    @ObfuscatedName("aiu.f")
    public IterableQueue field10279 = new IterableQueue();

    @ObfuscatedName("aiu.d")
    public int field10278 = 0;

    @ObfuscatedName("aiu.z")
    public int field10281 = -1;

    @ObfuscatedName("aiu.an(Ladc;)V")
    public final synchronized void method16452(AudioBuss arg0) {
        this.field10280.method11559(arg0);
    }

    @ObfuscatedName("aiu.ap(Ladc;)V")
    public final synchronized void method16445(AudioBuss arg0) {
        arg0.method6979();
    }

    @ObfuscatedName("aiu.ag()V")
    public void method16446() {
        if (this.field10278 <= 0) {
            return;
        }
        for (AudioBuss_Sub1Related var1 = (AudioBuss_Sub1Related) this.field10279.method11563(); var1 != null; var1 = (AudioBuss_Sub1Related) this.field10279.method11567()) {
            var1.field9476 -= this.field10278;
        }
        this.field10281 -= this.field10278;
        this.field10278 = 0;
    }

    @ObfuscatedName("aiu.as(Lnz;Lade;)V")
    public void method16448(Node arg0, AudioBuss_Sub1Related arg1) {
        while (this.field10279.field6647 != arg0 && ((AudioBuss_Sub1Related) arg0).field9476 <= arg1.field9476) {
            arg0 = arg0.field4226;
        }
        IterableQueue.method2546(arg1, arg0);
        this.field10281 = ((AudioBuss_Sub1Related) this.field10279.field6647.field4226).field9476;
    }

    @ObfuscatedName("aiu.ai(Lade;)V")
    public void method16447(AudioBuss_Sub1Related arg0) {
        arg0.method6979();
        arg0.method15053();
        Node var2 = this.field10279.field6647.field4226;
        if (this.field10279.field6647 == var2) {
            this.field10281 = -1;
        } else {
            this.field10281 = ((AudioBuss_Sub1Related) var2).field9476;
        }
    }

    @ObfuscatedName("aiu.j()Ladc;")
    public AudioBuss method15031() {
        return (AudioBuss) this.field10280.method11563();
    }

    @ObfuscatedName("aiu.a()Ladc;")
    public AudioBuss method15032() {
        return (AudioBuss) this.field10280.method11567();
    }

    @ObfuscatedName("aiu.s()I")
    public int method15035() {
        return 0;
    }

    @ObfuscatedName("aiu.m([III)V")
    public final synchronized void method15034(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field10281 < 0) {
                this.method16444(arg0, arg1, arg2);
                return;
            }
            if (this.field10278 + arg2 < this.field10281) {
                this.field10278 += arg2;
                this.method16444(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field10281 - this.field10278;
            this.method16444(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field10278 += var4;
            this.method16446();
            AudioBuss_Sub1Related var5 = (AudioBuss_Sub1Related) this.field10279.method11563();
            synchronized (var5) {
                int var7 = var5.method15054(this);
                if (var7 < 0) {
                    var5.field9476 = 0;
                    this.method16447(var5);
                } else {
                    var5.field9476 = var7;
                    this.method16448(var5.field4226, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aiu.ao([III)V")
    public void method16444(int[] arg0, int arg1, int arg2) {
        for (AudioBuss var4 = (AudioBuss) this.field10280.method11563(); var4 != null; var4 = (AudioBuss) this.field10280.method11567()) {
            var4.method15033(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aiu.t(I)V")
    public final synchronized void method15046(int arg0) {
        do {
            if (this.field10281 < 0) {
                this.method16449(arg0);
                return;
            }
            if (this.field10278 + arg0 < this.field10281) {
                this.field10278 += arg0;
                this.method16449(arg0);
                return;
            }
            int var2 = this.field10281 - this.field10278;
            this.method16449(var2);
            arg0 -= var2;
            this.field10278 += var2;
            this.method16446();
            AudioBuss_Sub1Related var3 = (AudioBuss_Sub1Related) this.field10279.method11563();
            synchronized (var3) {
                int var5 = var3.method15054(this);
                if (var5 < 0) {
                    var3.field9476 = 0;
                    this.method16447(var3);
                } else {
                    var3.field9476 = var5;
                    this.method16448(var3.field4226, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aiu.al(I)V")
    public void method16449(int arg0) {
        for (AudioBuss var2 = (AudioBuss) this.field10280.method11563(); var2 != null; var2 = (AudioBuss) this.field10280.method11567()) {
            var2.method15046(arg0);
        }
    }
}