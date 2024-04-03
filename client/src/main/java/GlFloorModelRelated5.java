import deob.ObfuscatedName;
import jaclib.memory.Buffer;

@ObfuscatedName("bo")
public class GlFloorModelRelated5 {

    @ObfuscatedName("bo.u")
    public final GlToolkit field1115;

    @ObfuscatedName("bo.j")
    public Buffer field1114;

    public GlFloorModelRelated5(GlToolkit arg0, byte[] arg1, int arg2) {
        this.field1115 = arg0;
        this.field1114 = this.field1115.field8094.method70(arg2, false);
        if (arg1 != null) {
            this.field1114.method13(arg1, 0, 0, arg2);
        }
    }

    public GlFloorModelRelated5(GlToolkit arg0, Buffer arg1) {
        this.field1115 = arg0;
        this.field1114 = arg1;
    }

    @ObfuscatedName("bo.o([BI)V")
    public void method2257(byte[] arg0, int arg1) {
        if (this.field1114 == null || this.field1114.method31() < arg1) {
            this.field1114 = this.field1115.field8094.method70(arg1, false);
        }
        this.field1114.method13(arg0, 0, 0, arg1);
    }
}
