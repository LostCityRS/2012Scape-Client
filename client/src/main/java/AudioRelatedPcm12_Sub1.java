import deob.ObfuscatedName;

@ObfuscatedName("xo")
public class AudioRelatedPcm12_Sub1 extends AudioRelatedPcm12 implements Runnable {

    public void run() {
        this.field4009 = true;
        try {
            while (!this.field4008) {
                for (int var1 = 0; var1 < 2; var1++) {
                    AudioChannel var2 = this.field4010[var1];
                    if (var2 != null) {
                        var2.update();
                    }
                }
                PreciseSleep.method7052(10L);
                GameShell.method1840(null);
            }
        } catch (Exception var7) {
            JagException.method16252(null, var7);
        } finally {
            this.field4009 = false;
        }
    }
}
