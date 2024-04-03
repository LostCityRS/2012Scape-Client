import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xk")
public class GlColourRemapperRelated1 extends GlTexture {

    @ObfuscatedName("xk.w")
    public final int field7438;

    @ObfuscatedName("xk.b")
    public final int field7437;

    @ObfuscatedName("xk.x")
    public final int field7439;

    public GlColourRemapperRelated1(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5) {
        super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
        this.field7438 = arg3;
        this.field7437 = arg4;
        this.field7439 = arg5;
        this.field1054.method13315(this);
        OpenGL.glTexImage3Dub(this.field1049, 0, GlToolkit.method13335(this.field1050, this.field1051), this.field7438, this.field7437, this.field7439, 0, GlToolkit.method13334(this.field1050), 5121, null, 0);
        this.method2055(true);
    }

    public GlColourRemapperRelated1(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5, byte[] arg6, TextureFormat arg7) {
        super(arg0, 32879, arg1, arg2, arg3 * arg4 * arg5, false);
        this.field7438 = arg3;
        this.field7437 = arg4;
        this.field7439 = arg5;
        this.field1054.method13315(this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(this.field1049, 0, GlToolkit.method13335(this.field1050, this.field1051), this.field7438, this.field7437, this.field7439, 0, GlToolkit.method13334(arg7), 5121, arg6, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2055(true);
    }

    @ObfuscatedName("xk.ag(IIIIIII)V")
    public void method12759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1054.method13315(this);
        OpenGL.glCopyTexSubImage3D(this.field1049, 0, arg0, arg1, arg2, arg5, arg6, arg3, arg4);
        OpenGL.glFlush();
    }
}
