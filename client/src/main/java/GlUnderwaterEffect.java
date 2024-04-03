import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xq")
public class GlUnderwaterEffect extends GlEffect {

    @ObfuscatedName("xq.s")
    public final GlWaterRelated field7471;

    @ObfuscatedName("xq.c")
    public GlRenderList field7472;

    @ObfuscatedName("xq.m")
    public class642 field7474;

    @ObfuscatedName("xq.t")
    public static final float[] field7469 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};

    public GlUnderwaterEffect(GlToolkit arg0, GlWaterRelated arg1) {
        super(arg0);
        this.field7471 = arg1;
        this.method12791();
        this.field7474 = new class642(this.field1062, TextureFormat.field1297, DataType.field1501, 2, new byte[]{0, -1}, TextureFormat.field1297);
        this.field7474.method12783(false);
    }

    @ObfuscatedName("xq.u()Z")
    public boolean method2190() {
        return true;
    }

    @ObfuscatedName("xq.j(Z)V")
    public void method2189(boolean arg0) {
        if (this.field1062.field8168 > 0) {
            float var2 = -0.5F / (float) this.field1062.field8168;
            this.field1062.method13314(1);
            field7469[0] = 0.0F;
            field7469[1] = 0.0F;
            field7469[2] = var2;
            field7469[3] = this.field1062.field8142 * var2 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, field7469, 0);
            OpenGL.glPopMatrix();
            this.field1062.method13292(0.5F, (float) this.field1062.field8168);
            this.field1062.method13315(this.field7474);
            this.field1062.method13314(0);
        }
        this.field7472.method2188('\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @ObfuscatedName("xq.a(Z)V")
    public void method2191(boolean arg0) {
        this.field1062.method13271(260, 8448);
    }

    @ObfuscatedName("xq.s()V")
    public void method2192() {
        this.field7472.method2188('\u0001');
        if (this.field1062.field8168 > 0) {
            this.field1062.method13314(1);
            this.field1062.method13315(null);
            this.field1062.method13292(1.0F, 0.0F);
            this.field1062.method13314(0);
        }
        this.field1062.method13271(8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @ObfuscatedName("xq.c(II)V")
    public void method2193(int arg0, int arg1) {
        if ((arg0 & 0x1) == 1) {
            if (this.field7471.field1084) {
                this.field1062.method13315(this.field7471.field1078);
                field7469[0] = 0.0F;
                field7469[1] = 0.0F;
                field7469[2] = 0.0F;
                field7469[3] = (float) (this.field1062.field8109 % 4000) / 4000.0F;
                OpenGL.glTexGenfv(8194, 9473, field7469, 0);
            } else {
                int var3 = this.field1062.field8109 % 4000 * 16 / 4000;
                this.field1062.method13315(this.field7471.field1082[var3]);
            }
        } else if (this.field7471.field1084) {
            this.field1062.method13315(this.field7471.field1078);
            field7469[0] = 0.0F;
            field7469[1] = 0.0F;
            field7469[2] = 0.0F;
            field7469[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, field7469, 0);
        } else {
            this.field1062.method13315(this.field7471.field1082[0]);
        }
    }

    @ObfuscatedName("xq.m(Lbg;I)V")
    public void method2208(GlTexture arg0, int arg1) {
    }

    @ObfuscatedName("xq.y()V")
    public void method12791() {
        this.field7472 = new GlRenderList(this.field1062, 2);
        this.field7472.method2182(0);
        this.field1062.method13314(1);
        this.field1062.method13271(7681, 260);
        this.field1062.method13318(0, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        this.field1062.method13314(0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field7471.field1084) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field7472.method2183();
        this.field7472.method2182(1);
        this.field1062.method13314(1);
        this.field1062.method13271(8448, 8448);
        this.field1062.method13318(0, 5890, 768);
        OpenGL.glDisable(3168);
        this.field1062.method13314(0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field7471.field1084) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field7472.method2183();
    }
}
