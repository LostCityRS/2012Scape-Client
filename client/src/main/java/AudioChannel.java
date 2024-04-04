import deob.ObfuscatedName;

import java.util.Arrays;

@ObfuscatedName("mg")
public class AudioChannel {

    @ObfuscatedName("mg.u")
    public static boolean field4041 = false;

    @ObfuscatedName("mg.l")
    public int[] field4042;

    @ObfuscatedName("mg.f")
    public boolean field4035 = false;

    @ObfuscatedName("mg.d")
    public AudioBuss stream;

    @ObfuscatedName("mg.z")
    public int field4026 = 32;

    @ObfuscatedName("mg.n")
    public long time = MonotonicTime.get();

    @ObfuscatedName("mg.o")
    public int bufferCapacity;

    @ObfuscatedName("mg.q")
    public int sampleRate2;

    @ObfuscatedName("mg.p")
    public int field4024;

    @ObfuscatedName("mg.w")
    public long closeUntil = 0L;

    @ObfuscatedName("mg.b")
    public int consumedSamples = 0;

    @ObfuscatedName("mg.x")
    public int prevConsumedSamples = 0;

    @ObfuscatedName("mg.i")
    public int prevBufferSize = 0;

    @ObfuscatedName("mg.v")
    public long calculateConsumptionAt = 0L;

    @ObfuscatedName("mg.k")
    public boolean skipConsumptionCheck = true;

    @ObfuscatedName("mg.ay")
    public int field4040 = 0;

    @ObfuscatedName("mg.af")
    public AudioBuss[] field4018 = new AudioBuss[8];

    @ObfuscatedName("mg.ar")
    public AudioBuss[] field4022 = new AudioBuss[8];

    @ObfuscatedName("mg.u(IZI)V")
    public static final void init(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.sampleRate = arg0;
        Statics.stereo = arg1;
        Statics.field4017 = arg2;
    }

    @ObfuscatedName("mg.j(Ljava/awt/Component;II)Lmg;")
    public static final AudioChannel create(java.awt.Component arg0, int arg1, int arg2) {
        if (Statics.sampleRate == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            int var3 = arg2;
            if (arg2 < 256) {
                var3 = 256;
            }
            if (!field4041) {
                try {
                    PcmPlayer_Sub1 var4 = new PcmPlayer_Sub1();
                    var4.field4042 = new int[(Statics.stereo ? 2 : 1) * 256];
                    var4.sampleRate2 = var3;
                    var4.method6505(arg0);
                    var4.bufferCapacity = (var3 & 0xFFFFFC00) + 1024;
                    if (var4.bufferCapacity > 16384) {
                        var4.bufferCapacity = 16384;
                    }
                    var4.open(var4.bufferCapacity);
                    if (Statics.field4017 > 0 && Statics.field4027 == null) {
                        Statics.field4027 = new AudioRelatedPcm12_Sub1();
                        Thread var5 = new Thread(Statics.field4027);
                        var5.setDaemon(true);
                        var5.start();
                        var5.setPriority(Statics.field4017);
                    }
                    if (Statics.field4027 != null) {
                        if (Statics.field4027.field4010[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field4027.field4010[arg1] = var4;
                    }
                    return var4;
                } catch (Throwable var7) {
                }
            }
            return new AudioChannel();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("mg.a(Ladc;)V")
    public final synchronized void setStream(AudioBuss arg0) {
        this.stream = arg0;
    }

    @ObfuscatedName("mg.s()V")
    public final synchronized void update() {
        if (this.field4035) {
            return;
        }
        long var1 = MonotonicTime.get();
        try {
            if (var1 > this.time + 6000L) {
                this.time = var1 - 6000L;
            }
            while (var1 > this.time + 5000L) {
                this.skip(256);
                this.time += 256000 / Statics.sampleRate;
                var1 = MonotonicTime.get();
            }
        } catch (Exception var8) {
            this.time = var1;
        }
        if (this.field4042 == null) {
            return;
        }
        try {
            if (this.closeUntil != 0L) {
                if (var1 < this.closeUntil) {
                    return;
                }
                this.open(this.bufferCapacity);
                this.closeUntil = 0L;
                this.skipConsumptionCheck = true;
            }
            int var4 = this.getBufferSize();
            if (this.prevBufferSize - var4 > this.consumedSamples) {
                this.consumedSamples = this.prevBufferSize - var4;
            }
            int var5 = this.field4024 + this.sampleRate2;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.bufferCapacity) {
                this.bufferCapacity += 1024;
                if (this.bufferCapacity > 16384) {
                    this.bufferCapacity = 16384;
                }
                this.flush(false);
                this.open(this.bufferCapacity);
                var4 = 0;
                this.skipConsumptionCheck = true;
                if (var5 + 256 > this.bufferCapacity) {
                    var5 = this.bufferCapacity - 256;
                    this.field4024 = var5 - this.sampleRate2;
                }
            }
            while (var4 < var5) {
                this.read(this.field4042, 256);
                this.write();
                var4 += 256;
            }
            if (var1 > this.calculateConsumptionAt) {
                if (this.skipConsumptionCheck) {
                    this.skipConsumptionCheck = false;
                } else if (this.consumedSamples == 0 && this.prevConsumedSamples == 0) {
                    this.flush(false);
                    this.closeUntil = var1 + 2000L;
                    return;
                } else {
                    this.field4024 = Math.min(this.prevConsumedSamples, this.consumedSamples);
                    this.prevConsumedSamples = this.consumedSamples;
                }
                this.consumedSamples = 0;
                this.calculateConsumptionAt = var1 + 2000L;
            }
            this.prevBufferSize = var4;
        } catch (Exception var7) {
            this.flush(false);
            this.closeUntil = var1 + 2000L;
        }
    }

    @ObfuscatedName("mg.c()V")
    public final synchronized void method6497() {
        this.skipConsumptionCheck = true;
        try {
            this.method6510();
        } catch (Exception var2) {
            this.flush(false);
            this.closeUntil = MonotonicTime.get() + 2000L;
        }
    }

    @ObfuscatedName("mg.m()V")
    public final synchronized void method6498() {
        this.method6499(false);
        this.flush(true);
        this.field4042 = null;
        this.field4035 = true;
    }

    @ObfuscatedName("mg.t(Z)V")
    public final synchronized void method6499(boolean arg0) {
        if (Statics.field4027 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 2; var3++) {
            if (arg0 || Statics.field4027.field4010[var3] == this) {
                Statics.field4027.field4010[var3] = null;
            }
            if (Statics.field4027.field4010[var3] != null) {
                var2 = false;
            }
        }
        if (!var2) {
            return;
        }
        Statics.field4027.field4008 = true;
        while (Statics.field4027.field4009) {
            PreciseSleep.method7052(50L);
        }
        Statics.field4027 = null;
    }

    @ObfuscatedName("mg.l()V")
    public void method6530() {
        this.method6499(true);
        this.field4042 = null;
        this.field4035 = true;
        field4041 = true;
    }

    @ObfuscatedName("mg.f(I)V")
    public final void skip(int arg0) {
        this.field4040 -= arg0;
        if (this.field4040 < 0) {
            this.field4040 = 0;
        }
        if (this.stream != null) {
            this.stream.skip(arg0);
        }
    }

    @ObfuscatedName("mg.d([II)V")
    public final void read(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.stereo) {
            var3 = arg1 << 1;
        }
        Arrays.fill(arg0, 0, var3, 0);
        this.field4040 -= arg1;
        if (this.stream != null && this.field4040 <= 0) {
            this.field4040 += Statics.sampleRate >> 4;
            setInactive(this.stream);
            this.method6504(this.stream, this.stream.method15049());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105:
            while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        AudioBuss var10 = null;
                        AudioBuss var11 = this.field4018[var7];
                        label99:
                        while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                SoundPacket var12 = var11.sound;
                                if (var12 == null || var12.position <= var8) {
                                    var11.active = true;
                                    int var13 = var11.method15035();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.position += var13;
                                    }
                                    if (var4 >= this.field4026) {
                                        break label105;
                                    }
                                    AudioBuss var14 = var11.firstSubStream();
                                    if (var14 != null) {
                                        int var15 = var11.field9475;
                                        while (var14 != null) {
                                            this.method6504(var14, var15 * var14.method15049() >> 8);
                                            var14 = var11.nextSubStream();
                                        }
                                    }
                                    AudioBuss var16 = var11.field9473;
                                    var11.field9473 = null;
                                    if (var10 == null) {
                                        this.field4018[var7] = var16;
                                    } else {
                                        var10.field9473 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4022[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field9473;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                AudioBuss var18 = this.field4018[var17];
                AudioBuss[] var19 = this.field4018;
                this.field4022[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    AudioBuss var21 = var18.field9473;
                    var18.field9473 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field4040 < 0) {
            this.field4040 = 0;
        }
        if (this.stream != null) {
            this.stream.read(arg0, 0, arg1);
        }
        this.time = MonotonicTime.get();
    }

    @ObfuscatedName("mg.z(Ladc;)V")
    public static final void setInactive(AudioBuss arg0) {
        arg0.active = false;
        if (arg0.sound != null) {
            arg0.sound.position = 0;
        }
        for (AudioBuss var1 = arg0.firstSubStream(); var1 != null; var1 = arg0.nextSubStream()) {
            setInactive(var1);
        }
    }

    @ObfuscatedName("mg.n(Ladc;I)V")
    public final void method6504(AudioBuss arg0, int arg1) {
        int var3 = arg1 >> 5;
        AudioBuss var4 = this.field4022[var3];
        if (var4 == null) {
            this.field4018[var3] = arg0;
        } else {
            var4.field9473 = arg0;
        }
        this.field4022[var3] = arg0;
        arg0.field9475 = arg1;
    }

    @ObfuscatedName("mg.o(Ljava/awt/Component;)V")
    public void method6505(Component arg0) throws Exception {
    }

    @ObfuscatedName("mg.q(I)V")
    public void open(int arg0) throws Exception {
    }

    @ObfuscatedName("mg.p()I")
    public int getBufferSize() throws Exception {
        return this.bufferCapacity;
    }

    @ObfuscatedName("mg.w()V")
    public void write() throws Exception {
    }

    @ObfuscatedName("mg.b(Z)V")
    public void flush(boolean arg0) {
    }

    @ObfuscatedName("mg.x()V")
    public void method6510() throws Exception {
    }
}
