import deob.ObfuscatedName;
import jaclib.memory.Stream;

@ObfuscatedName("ajy")
public class GpuPacket extends Packet {

    public GpuPacket(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ajy.ir(F)V")
    public void method16851(float arg0) {
        int var2 = Stream.floatToRawIntBits(arg0);
        this.field9629[++this.field9626 - 1] = (byte) (var2 >> 24);
        this.field9629[++this.field9626 - 1] = (byte) (var2 >> 16);
        this.field9629[++this.field9626 - 1] = (byte) (var2 >> 8);
        this.field9629[++this.field9626 - 1] = (byte) var2;
    }

    @ObfuscatedName("ajy.ie(F)V")
    public void method16855(float arg0) {
        int var2 = Stream.floatToRawIntBits(arg0);
        this.field9629[++this.field9626 - 1] = (byte) var2;
        this.field9629[++this.field9626 - 1] = (byte) (var2 >> 8);
        this.field9629[++this.field9626 - 1] = (byte) (var2 >> 16);
        this.field9629[++this.field9626 - 1] = (byte) (var2 >> 24);
    }
}
