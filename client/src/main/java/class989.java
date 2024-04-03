import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

@ObfuscatedName("akl")
public final class class989 extends class892 {

    @ObfuscatedName("akl.l")
    public Image field10552;

    public class989(PureJavaToolkit arg0, Canvas arg1, int arg2, int arg3) {
        super(arg0, arg1, arg2, arg3);
        new Rectangle();
        this.method16008();
    }

    @ObfuscatedName("akl.x(I)V")
    public void method16008() {
        super.method16008();
        DataBufferInt var1 = new DataBufferInt(this.field9938, this.field9938.length);
        DirectColorModel var2 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var3 = Raster.createWritableRaster(var2.createCompatibleSampleModel(this.field9936, this.field9940), var1, null);
        this.field10552 = new BufferedImage(var2, var3, false, new Hashtable());
    }

    @ObfuscatedName("akl.ay()I")
    public int method918() {
        return this.method919(0, 0);
    }

    @ObfuscatedName("akl.af(II)I")
    public final int method919(int arg0, int arg1) {
        Graphics var3 = this.field9935.getGraphics();
        if (var3 == null) {
            return 0;
        } else {
            var3.drawImage(this.field10552, arg0, arg1, this.field9935);
            return 0;
        }
    }

    @ObfuscatedName("akl.a()V")
    public void method944() {
    }
}
