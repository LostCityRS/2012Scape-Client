import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xw")
public class GlReflectionEffect extends GlEffect {

    @ObfuscatedName("xw.s")
    public GlRenderList field7462;

    @ObfuscatedName("xw.c")
    public boolean field7463 = false;

    public GlReflectionEffect(GlToolkit arg0) {
        super(arg0);
        if (arg0.field8206) {
            this.field7462 = new GlRenderList(arg0, 2);
            this.field7462.method2182(0);
            this.field1062.method13314(1);
            this.field1062.method13271(34165, 7681);
            this.field1062.method13318(2, 34168, 770);
            this.field1062.method13267(0, 34167, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            this.field1062.method13314(0);
            this.field7462.method2183();
            this.field7462.method2182(1);
            this.field1062.method13314(1);
            this.field1062.method13271(8448, 8448);
            this.field1062.method13318(2, 34166, 770);
            this.field1062.method13267(0, 5890, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field1062.method13314(0);
            this.field7462.method2183();
        }
    }

    @ObfuscatedName("xw.u()Z")
    public boolean method2190() {
        return true;
    }

    @ObfuscatedName("xw.j(Z)V")
    public void method2189(boolean arg0) {
        GlCubeTexture var2 = this.field1062.method13297();
        if (this.field7462 == null || var2 == null || !arg0) {
            this.field1062.method13267(0, 34168, 770);
            return;
        }
        this.field7462.method2188('\u0000');
        this.field1062.method13314(1);
        this.field1062.method13315(var2);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadMatrixf(this.field1062.field8117.method5409(this.field1062.field8134), 0);
        OpenGL.glScalef(-1.0F, -1.0F, -1.0F);
        OpenGL.glMatrixMode(5888);
        this.field1062.method13314(0);
        this.field7463 = true;
    }

    @ObfuscatedName("xw.a(Z)V")
    public void method2191(boolean arg0) {
        this.field1062.method13271(8448, 7681);
    }

    @ObfuscatedName("xw.s()V")
    public void method2192() {
        if (this.field7463) {
            this.field7462.method2188('\u0001');
            this.field1062.method13314(1);
            this.field1062.method13315(null);
            this.field1062.method13314(0);
        } else {
            this.field1062.method13267(0, 5890, 770);
        }
        this.field1062.method13271(8448, 8448);
        this.field7463 = false;
    }

    @ObfuscatedName("xw.c(II)V")
    public void method2193(int arg0, int arg1) {
    }

    @ObfuscatedName("xw.m(Lbg;I)V")
    public void method2208(GlTexture arg0, int arg1) {
        this.field1062.method13315(arg0);
        this.field1062.method13316(arg1);
    }
}
