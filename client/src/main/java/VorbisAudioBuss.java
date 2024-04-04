import deob.ObfuscatedName;

@ObfuscatedName("aiq")
public class VorbisAudioBuss extends AudioBuss {

    @ObfuscatedName("aiq.f")
    public static PrioritizedCache field10291 = new PrioritizedCache(64, PrioritizedCacheMode.field3710);

    @ObfuscatedName("aiq.d")
    public final int field10282;

    @ObfuscatedName("aiq.z")
    public final IterableQueue field10285 = new IterableQueue();

    @ObfuscatedName("aiq.n")
    public int field10286 = 0;

    @ObfuscatedName("aiq.o")
    public int field10283;

    @ObfuscatedName("aiq.q")
    public int field10288 = 256;

    @ObfuscatedName("aiq.p")
    public int field10289 = 256;

    @ObfuscatedName("aiq.w")
    public boolean field10290;

    @ObfuscatedName("aiq.b")
    public boolean field10284;

    public VorbisAudioBuss(int arg0) {
        this.field10282 = arg0;
    }

    @ObfuscatedName("aiq.an(II)V")
    public void method16466(int arg0) {
        this.field10288 = arg0;
        this.field10289 = arg0;
    }

    @ObfuscatedName("aiq.m([III)V")
    public synchronized void read(int[] arg0, int arg1, int arg2) {
        if (this.field10284) {
            return;
        }
        if (this.method16468() != null) {
            int var4 = arg1 + arg2;
            if (Statics.stereo) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field10282 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                OggVorbisStreamRelated2 var7 = this.method16468();
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field9559;
                while (arg1 < var4 && this.field10283 < var8[0].length) {
                    if (Statics.stereo) {
                        arg0[arg1++] = this.field10288 * var8[var5][this.field10283];
                        arg0[arg1++] = this.field10289 * var8[var6][this.field10283];
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += this.field10289 * var8[var6][this.field10283] + this.field10288 * var8[var5][this.field10283];
                    }
                    this.field10283++;
                }
                if (this.field10283 >= var8[0].length) {
                    this.method16465();
                }
            }
        } else if (this.field10290) {
            this.remove();
            field10291.method5955();
        }
    }

    @ObfuscatedName("aiq.t(I)V")
    public synchronized void skip(int arg0) {
        if (this.field10284) {
            return;
        }
        while (true) {
            OggVorbisStreamRelated2 var2 = this.method16468();
            if (var2 == null) {
                if (this.field10290) {
                    this.remove();
                    field10291.method5955();
                }
                return;
            }
            if (var2.field9559[0].length - this.field10283 > arg0) {
                this.field10283 += arg0;
                return;
            }
            arg0 -= var2.field9559[0].length - this.field10283;
            this.method16465();
        }
    }

    @ObfuscatedName("aiq.ap(I)I")
    public synchronized int method16467() {
        return this.field10286;
    }

    @ObfuscatedName("aiq.ag(B)Ladk;")
    public synchronized OggVorbisStreamRelated2 method16468() {
        return (OggVorbisStreamRelated2) this.field10285.last();
    }

    @ObfuscatedName("aiq.as(B)V")
    public synchronized void method16465() {
        OggVorbisStreamRelated2 var1 = this.method16468();
        if (var1 != null) {
            var1.remove();
            this.field10283 = 0;
            this.field10286--;
            field10291.method5954(var1.method15162(), var1);
        }
    }

    @ObfuscatedName("aiq.ai(ID)Ladk;")
    public OggVorbisStreamRelated2 method16470(int arg0, double arg1) {
        long var4 = (long) (this.field10282 << 32 | arg0);
        OggVorbisStreamRelated2 var6 = (OggVorbisStreamRelated2) field10291.method5949(var4);
        if (var6 == null) {
            var6 = new OggVorbisStreamRelated2(new short[this.field10282][arg0], arg1);
        } else {
            var6.field9560 = arg1;
            field10291.method5960(var4);
        }
        return var6;
    }

    @ObfuscatedName("aiq.ao(Ladk;B)V")
    public synchronized void method16481(OggVorbisStreamRelated2 arg0) {
        while (this.field10286 >= 100) {
            this.field10285.method11560();
            this.field10286--;
        }
        this.field10285.addFirst(arg0);
        this.field10286++;
    }

    @ObfuscatedName("aiq.al(I)D")
    public synchronized double method16492() {
        if (this.field10286 < 1) {
            return -1.0D;
        } else {
            OggVorbisStreamRelated2 var1 = (OggVorbisStreamRelated2) this.field10285.last();
            return var1 == null ? -1.0D : var1.field9560 - (double) ((float) var1.field9559[0].length / (float) Statics.sampleRate);
        }
    }

    @ObfuscatedName("aiq.at(B)V")
    public synchronized void method16472() {
        this.field10290 = true;
    }

    @ObfuscatedName("aiq.ax(ZI)V")
    public synchronized void method16473(boolean arg0) {
        this.field10284 = arg0;
    }

    @ObfuscatedName("aiq.s()I")
    public int method15035() {
        return 1;
    }

    @ObfuscatedName("aiq.a()Ladc;")
    public AudioBuss nextSubStream() {
        return null;
    }

    @ObfuscatedName("aiq.j()Ladc;")
    public AudioBuss firstSubStream() {
        return null;
    }
}
