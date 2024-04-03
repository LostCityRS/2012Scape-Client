import deob.ObfuscatedName;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer.Info;
import javax.sound.sampled.SourceDataLine;
import java.awt.*;

@ObfuscatedName("aba")
public class PcmPlayer_Sub1 extends PcmPlayer {

    @ObfuscatedName("aba.an")
    public AudioFormat field8898;

    @ObfuscatedName("aba.ap")
    public SourceDataLine field8897;

    @ObfuscatedName("aba.ag")
    public int field8896;

    @ObfuscatedName("aba.as")
    public boolean field8901 = false;

    @ObfuscatedName("aba.ai")
    public byte[] field8900;

    @ObfuscatedName("aba.ao")
    public boolean field8899 = false;

    @ObfuscatedName("aba.o(Ljava/awt/Component;)V")
    public void method6505(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field8899 = true;
                    }
                }
            }
        }
        this.field8898 = new AudioFormat((float) Statics.field4015, 16, Statics.field4016 ? 2 : 1, true, false);
        this.field8900 = new byte[0x100 << (Statics.field4016 ? 2 : 1)];
    }

    @ObfuscatedName("aba.q(I)V")
    public void method6538(int arg0) throws LineUnavailableException {
        if (this.field8897 != null) {
            if (!this.field8901) {
                throw new IllegalStateException("");
            }
            if (this.field8896 == arg0) {
                this.field8901 = false;
                return;
            }
            if (!this.method14312()) {
                return;
            }
        }
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field8898, arg0 << (Statics.field4016 ? 2 : 1));
            this.field8897 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field8897.open();
            this.field8897.start();
            this.field8896 = arg0;
            this.field8901 = false;
        } catch (LineUnavailableException var4) {
            if (IntMath.method14067(arg0) == 1) {
                this.field8901 = true;
                throw var4;
            } else {
                this.method6538(IntMath.method2839(arg0));
            }
        }
    }

    @ObfuscatedName("aba.p()I")
    public int method6495() {
        return this.field8896 - (this.field8897.available() >> (Statics.field4016 ? 2 : 1));
    }

    @ObfuscatedName("aba.w()V")
    public void method6547() {
        if (this.field8901) {
            return;
        }
        int var1 = 256;
        if (Statics.field4016) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4042[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field8900[var2 * 2] = (byte) (var3 >> 8);
            this.field8900[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field8897.write(this.field8900, 0, var1 << 1);
    }

    @ObfuscatedName("aba.b(Z)V")
    public void method6509(boolean arg0) {
        if (arg0) {
            this.method14312();
            return;
        }
        try {
            this.method6510();
        } catch (LineUnavailableException var3) {
        }
        this.field8901 = true;
    }

    @ObfuscatedName("aba.bg()Z")
    public boolean method14312() {
        boolean var1 = false;
        if (this.field8897 != null) {
            Thread var2 = new Thread(new PcmPlayerStop(this));
            var2.start();
            boolean var8 = false;
            label84:
            {
                try {
                    var8 = true;
                    var2.join(2000L);
                    var8 = false;
                    break label84;
                } catch (InterruptedException var9) {
                    var8 = false;
                } finally {
                    if (var8) {
                        if (this.field8897 != null) {
                            this.field8897 = null;
                            this.method6530();
                        }
                        boolean var5 = true;
                    }
                }
                if (this.field8897 != null) {
                    this.field8897 = null;
                    this.method6530();
                }
                var1 = true;
                return var1;
            }
            if (this.field8897 != null) {
                this.field8897 = null;
                this.method6530();
            }
            var1 = true;
        }
        return var1;
    }

    @ObfuscatedName("aba.x()V")
    public void method6510() throws LineUnavailableException {
        if (this.field8901) {
            return;
        }
        this.field8897.flush();
        if (!this.field8899) {
            return;
        }
        if (!this.method14312()) {
            return;
        }
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.field8898, this.field8896 << (Statics.field4016 ? 2 : 1));
        this.field8897 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field8897.open();
        this.field8897.start();
    }
}
