import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("cn")
public class class107 implements GlRelated5 {

    @ObfuscatedName("cn.u")
    public final int field1190;

    @ObfuscatedName("cn.j")
    public final GlRelated2 field1189;

    public class107(GlRelated2 arg0, int arg1) {
        this.field1190 = arg1;
        this.field1189 = arg0;
    }

    @ObfuscatedName("cn.u()I")
    public int method164() {
        return this.field1189.field7440;
    }

    @ObfuscatedName("cn.a()I")
    public int method165() {
        return this.field1189.field7441;
    }

    @ObfuscatedName("cn.j(I)V")
    public void method2260(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.field1189.field1049, this.field1189.field1048, this.field1190);
    }

    @ObfuscatedName("cn.s()V")
    public void method168() {
    }
}
