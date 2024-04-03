import deob.ObfuscatedName;

@ObfuscatedName("ags")
public class RendererException extends Exception {

    @ObfuscatedName("ags.u")
    public final int field9908;

    public RendererException(int arg0) {
        super("" + arg0);
        this.field9908 = arg0;
    }

    @ObfuscatedName("ags.u(I)I")
    public int method15970() {
        return this.field9908;
    }
}
