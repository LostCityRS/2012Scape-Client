import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("zc")
public class GlFont extends Font {

    @ObfuscatedName("zc.q")
    public final GlToolkit field8440;

    @ObfuscatedName("zc.p")
    public final GlGraphicRelated field8441;

    @ObfuscatedName("zc.w")
    public final GlRenderList field8442;

    @ObfuscatedName("zc.b")
    public final boolean field8443;

    public GlFont(GlToolkit arg0, FontMetrics arg1, PalettedSpriteData[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8440 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < 256; var6++) {
            PalettedSpriteData var7 = arg2[var6];
            if (var7.field8409 > var5) {
                var5 = var7.field8409;
            }
            if (var7.field8415 > var5) {
                var5 = var7.field8415;
            }
        }
        int var8 = var5 * 16;
        if (arg3) {
            byte[] var9 = new byte[var8 * var8];
            for (int var10 = 0; var10 < 256; var10++) {
                PalettedSpriteData var11 = arg2[var10];
                int var12 = var11.field8409;
                int var13 = var11.field8415;
                int var14 = var10 % 16 * var5;
                int var15 = var10 / 16 * var5;
                int var16 = var8 * var15 + var14;
                int var17 = 0;
                if (var11.field8416 == null) {
                    byte[] var18 = var11.field8408;
                    for (int var19 = 0; var19 < var12; var19++) {
                        for (int var20 = 0; var20 < var13; var20++) {
                            var9[var16++] = (byte) (var18[var17++] == 0 ? 0 : -1);
                        }
                        var16 += var8 - var13;
                    }
                } else {
                    byte[] var21 = var11.field8416;
                    for (int var22 = 0; var22 < var12; var22++) {
                        for (int var23 = 0; var23 < var13; var23++) {
                            var9[var16++] = var21[var17++];
                        }
                        var16 += var8 - var13;
                    }
                }
            }
            this.field8441 = GlGraphicRelated.method15975(arg0, TextureFormat.field1297, DataType.field1501, var8, var8, false, var9, TextureFormat.field1297);
            this.field8443 = true;
        } else {
            int[] var24 = new int[var8 * var8];
            for (int var25 = 0; var25 < 256; var25++) {
                PalettedSpriteData var26 = arg2[var25];
                int[] var27 = var26.field8410;
                byte[] var28 = var26.field8416;
                byte[] var29 = var26.field8408;
                int var30 = var26.field8409;
                int var31 = var26.field8415;
                int var32 = var25 % 16 * var5;
                int var33 = var25 / 16 * var5;
                int var34 = var8 * var33 + var32;
                int var35 = 0;
                if (var28 == null) {
                    for (int var38 = 0; var38 < var30; var38++) {
                        for (int var39 = 0; var39 < var31; var39++) {
                            byte var40;
                            if ((var40 = var29[var35++]) == 0) {
                                var34++;
                            } else {
                                var24[var34++] = var27[var40 & 0xFF] | 0xFF000000;
                            }
                        }
                        var34 += var8 - var31;
                    }
                } else {
                    for (int var36 = 0; var36 < var30; var36++) {
                        for (int var37 = 0; var37 < var31; var37++) {
                            var24[var34++] = var28[var35] << 24 | var27[var29[var35] & 0xFF];
                            var35++;
                        }
                        var34 += var8 - var31;
                    }
                }
            }
            this.field8441 = GlGraphicRelated.method15974(arg0, var8, var8, false, var24, 0, 0);
            this.field8443 = false;
        }
        this.field8441.method2055(false);
        this.field8442 = new GlRenderList(arg0, 256);
        float var41 = this.field8441.field9912 / (float) this.field8441.field9910;
        float var42 = this.field8441.field9911 / (float) this.field8441.field9909;
        for (int var43 = 0; var43 < 256; var43++) {
            PalettedSpriteData var44 = arg2[var43];
            int var45 = var44.field8409;
            int var46 = var44.field8415;
            int var47 = var44.field8412;
            int var48 = var44.field8413;
            float var49 = (float) (var43 % 16 * var5);
            float var50 = (float) (var43 / 16 * var5);
            float var51 = var41 * var49;
            float var52 = var42 * var50;
            float var53 = ((float) var46 + var49) * var41;
            float var54 = ((float) var45 + var50) * var42;
            this.field8442.method2182(var43);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(var51, this.field8441.field9911 - var52);
            OpenGL.glVertex2i(var48, var47);
            OpenGL.glTexCoord2f(var51, this.field8441.field9911 - var54);
            OpenGL.glVertex2i(var48, var45 + var47);
            OpenGL.glTexCoord2f(var53, this.field8441.field9911 - var54);
            OpenGL.glVertex2i(var46 + var48, var45 + var47);
            OpenGL.glTexCoord2f(var53, this.field8441.field9911 - var52);
            OpenGL.glVertex2i(var46 + var48, var47);
            OpenGL.glEnd();
            this.field8442.method2183();
        }
    }

    @ObfuscatedName("zc.UA(CIIIZ)V")
    public void method848(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8440.method13341();
        this.field8440.method13315(this.field8441);
        if (this.field8443 || arg4) {
            this.field8440.method13271(7681, 8448);
            this.field8440.method13318(0, 34168, 768);
        } else {
            this.field8440.method13271(7681, 7681);
        }
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8442.method2188(arg0);
        OpenGL.glLoadIdentity();
        if (this.field8443 || arg4) {
            this.field8440.method13318(0, 5890, 768);
        }
    }

    @ObfuscatedName("zc.b(CIIIZLta;II)V")
    public void method867(char arg0, int arg1, int arg2, int arg3, boolean arg4, GraphicsRelated arg5, int arg6, int arg7) {
        GlGraphicRelated2 var9 = (GlGraphicRelated2) arg5;
        GlGraphicRelated var10 = var9.field7651;
        this.field8440.method13341();
        this.field8440.method13315(this.field8441);
        if (this.field8443 || arg4) {
            this.field8440.method13271(7681, 8448);
            this.field8440.method13318(0, 34168, 768);
        } else {
            this.field8440.method13271(7681, 7681);
        }
        this.field8440.method13314(1);
        this.field8440.method13315(var10);
        this.field8440.method13271(7681, 8448);
        this.field8440.method13318(0, 34168, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        float var11 = var10.field9912 / (float) var10.field9910;
        float var12 = var10.field9911 / (float) var10.field9909;
        OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float) -arg6 * var11}, 0);
        OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float) -arg7 * var12}, 0);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
        this.field8442.method2188(arg0);
        OpenGL.glLoadIdentity();
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        this.field8440.method13318(0, 5890, 768);
        this.field8440.method13271(8448, 8448);
        this.field8440.method13315(null);
        this.field8440.method13314(0);
        if (this.field8443 || arg4) {
            this.field8440.method13318(0, 5890, 768);
        }
    }
}
