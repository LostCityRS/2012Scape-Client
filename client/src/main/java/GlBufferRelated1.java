import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaggl.OpenGL;

@ObfuscatedName("bw")
public abstract class GlBufferRelated1 {

    @ObfuscatedName("bw.a")
    public final GlToolkit field1113;

    @ObfuscatedName("bw.s")
    public final int field1108;

    @ObfuscatedName("bw.c")
    public final int field1105;

    @ObfuscatedName("bw.m")
    public int field1110;

    @ObfuscatedName("bw.t")
    public boolean field1111;

    @ObfuscatedName("bw.l")
    public boolean field1107 = false;

    @ObfuscatedName("bw.f")
    public static final int[] field1112 = new int[1];

    public GlBufferRelated1(GlToolkit arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1113 = arg0;
        this.field1108 = arg1;
        this.field1110 = arg3;
        this.field1111 = arg4;
        OpenGL.glGenBuffersARB(1, field1112, 0);
        this.field1105 = field1112[0];
        this.method2249();
        OpenGL.glBufferDataARBub(arg1, this.field1110, arg2, 0, this.field1111 ? 35040 : 35044);
        this.field1113.field8157 += this.field1110;
    }

    public GlBufferRelated1(GlToolkit arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field1113 = arg0;
        this.field1108 = arg1;
        this.field1110 = arg3;
        this.field1111 = arg4;
        OpenGL.glGenBuffersARB(1, field1112, 0);
        this.field1105 = field1112[0];
        this.method2249();
        OpenGL.glBufferDataARBa(arg1, this.field1110, arg2.method32(), this.field1111 ? 35040 : 35044);
        this.field1113.field8157 += this.field1110;
    }

    @ObfuscatedName("bw.q([BI)V")
    public void method2250(byte[] arg0, int arg1) {
        this.method2249();
        if (arg1 > this.field1110) {
            OpenGL.glBufferDataARBub(this.field1108, arg1, arg0, 0, this.field1111 ? 35040 : 35044);
            this.field1113.field8157 += arg1 - this.field1110;
            this.field1110 = arg1;
        } else {
            OpenGL.glBufferSubDataARBub(this.field1108, 0, arg1, arg0, 0);
        }
    }

    public void finalize() throws Throwable {
        if (!this.field1107) {
            this.field1113.method13328(this.field1105, this.field1110);
            this.field1107 = true;
        }
        super.finalize();
    }

    @ObfuscatedName("bw.o()V")
    public abstract void method2249();
}
