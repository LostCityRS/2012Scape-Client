import deob.ObfuscatedName;
import jaclib.memory.Buffer;

@ObfuscatedName("xg")
public class class652 extends GlFloorModelRelated5 implements GlInterfaceRelated {

    @ObfuscatedName("xg.a")
    public int field7514;

    public class652(GlToolkit arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7514 = arg1;
    }

    public class652(GlToolkit arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field7514 = arg1;
    }

    @ObfuscatedName("xg.u()I")
    public int method2231() {
        return 0;
    }

    @ObfuscatedName("xg.j()I")
    public int method2239() {
        return this.field7514;
    }

    @ObfuscatedName("xg.a()J")
    public long method2233() {
        return this.field1114.method32();
    }

    @ObfuscatedName("xg.s(I[BI)V")
    public void method2234(int arg0, byte[] arg1, int arg2) {
        this.method2257(arg1, arg2);
        this.field7514 = arg0;
    }
}
