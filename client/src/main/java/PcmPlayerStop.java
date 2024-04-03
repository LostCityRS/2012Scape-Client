import deob.ObfuscatedName;

@ObfuscatedName("mi")
public class PcmPlayerStop implements Runnable {

    // $FF: synthetic field
    public final PcmPlayer_Sub1 this$0;

    public PcmPlayerStop(PcmPlayer_Sub1 arg0) {
        this.this$0 = arg0;
    }

    public void run() {
        this.this$0.field8897.close();
        this.this$0.field8897 = null;
    }
}
