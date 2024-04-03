import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bg")
public abstract class GlTexture {

    @ObfuscatedName("bg.t")
    public final GlToolkit field1054;

    @ObfuscatedName("bg.l")
    public int field1048;

    @ObfuscatedName("bg.f")
    public final int field1049;

    @ObfuscatedName("bg.d")
    public final TextureFormat field1050;

    @ObfuscatedName("bg.z")
    public final DataType field1051;

    @ObfuscatedName("bg.n")
    public boolean field1047;

    @ObfuscatedName("bg.o")
    public boolean field1042 = false;

    @ObfuscatedName("bg.q")
    public final int field1052;

    @ObfuscatedName("bg.p")
    public static final int[] field1053 = new int[1];

    public GlTexture(GlToolkit arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4, boolean arg5) {
        this.field1054 = arg0;
        this.field1049 = arg1;
        this.field1050 = arg2;
        this.field1051 = arg3;
        this.field1047 = arg5;
        this.field1052 = arg4;
        OpenGL.glGenTextures(1, field1053, 0);
        this.field1048 = field1053[0];
        this.method2051(0);
    }

    @ObfuscatedName("bg.u(Z)V")
    public void method2055(boolean arg0) {
        if (this.field1042 != arg0) {
            this.field1042 = arg0;
            this.method2075();
        }
    }

    @ObfuscatedName("bg.j()V")
    public void method2075() {
        this.field1054.method13315(this);
        if (this.field1042) {
            OpenGL.glTexParameteri(this.field1049, 10241, this.field1047 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1049, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field1049, 10241, this.field1047 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1049, 10240, 9728);
        }
    }

    @ObfuscatedName("bg.a()Z")
    public boolean method2046() {
        if (!this.field1054.field8176) {
            return false;
        }
        int var1 = this.method2052();
        this.field1054.method13315(this);
        OpenGL.glGenerateMipmapEXT(this.field1049);
        this.field1047 = true;
        this.method2075();
        this.method2051(var1);
        return true;
    }

    @ObfuscatedName("bg.s(Z)V")
    public void method2047(boolean arg0) {
        if (this.field1047 != arg0) {
            int var2 = this.method2052();
            this.field1047 = true;
            this.method2075();
            this.method2051(var2);
        }
    }

    @ObfuscatedName("bg.c()V")
    public void method2048() {
        if (this.field1048 > 0) {
            this.field1054.field8096 -= this.method2052();
            int[] var1 = new int[]{this.field1048};
            OpenGL.glDeleteTextures(1, var1, 0);
            this.field1048 = 0;
        }
    }

    @ObfuscatedName("bg.m()V")
    public void method2049() {
        if (this.field1048 > 0) {
            this.field1054.method13329(this.field1048, this.method2052());
            this.field1048 = 0;
        }
    }

    public void finalize() throws Throwable {
        this.method2049();
        super.finalize();
    }

    @ObfuscatedName("bg.t(I)V")
    public void method2051(int arg0) {
        this.field1054.field8096 -= arg0;
        this.field1054.field8096 += this.method2052();
    }

    @ObfuscatedName("bg.l()I")
    public int method2052() {
        int var1 = this.field1051.field1508 * this.field1050.field1306 * this.field1052;
        return this.field1047 ? var1 * 4 / 3 : var1;
    }

    @ObfuscatedName("bg.f(IIIIII[I)V")
    public static void method2053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 > 0 && !IntMath.method11258(arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !IntMath.method11258(arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 == 32993) {
            int var7 = 0;
            int var8 = arg2 < arg3 ? arg2 : arg3;
            int var9 = arg2 >> 1;
            int var10 = arg3 >> 1;
            int[] var11 = arg6;
            int[] var12 = new int[var9 * var10];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var7, arg1, arg2, arg3, 0, arg4, arg5, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = 0;
                int var14 = 0;
                int var15 = arg2 + var14;
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var9; var17++) {
                        int var18 = var11[var14++];
                        int var19 = var11[var14++];
                        int var20 = var11[var15++];
                        int var21 = var11[var15++];
                        int var22 = var18 >> 24 & 0xFF;
                        int var23 = var18 >> 16 & 0xFF;
                        int var24 = var18 >> 8 & 0xFF;
                        int var25 = var18 & 0xFF;
                        int var26 = (var19 >> 24 & 0xFF) + var22;
                        int var27 = (var19 >> 16 & 0xFF) + var23;
                        int var28 = (var19 >> 8 & 0xFF) + var24;
                        int var29 = (var19 & 0xFF) + var25;
                        int var30 = (var20 >> 24 & 0xFF) + var26;
                        int var31 = (var20 >> 16 & 0xFF) + var27;
                        int var32 = (var20 >> 8 & 0xFF) + var28;
                        int var33 = (var20 & 0xFF) + var29;
                        int var34 = (var21 >> 24 & 0xFF) + var30;
                        int var35 = (var21 >> 16 & 0xFF) + var31;
                        int var36 = (var21 >> 8 & 0xFF) + var32;
                        int var37 = (var21 & 0xFF) + var33;
                        var12[var13++] = (var34 & 0x3FC) << 22 | (var35 & 0x3FC) << 14 | (var36 & 0x3FC) << 6 | var37 >> 2 & 0xFF;
                    }
                    var14 += arg2;
                    var15 += arg2;
                }
                int[] var38 = var12;
                var12 = var11;
                var11 = var38;
                arg2 = var9;
                arg3 = var10;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @ObfuscatedName("bg.d(IIIILcy;[B)V")
    public static void method2054(int arg0, int arg1, int arg2, int arg3, TextureFormat arg4, byte[] arg5) {
        if (arg2 > 0 && !IntMath.method11258(arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || IntMath.method11258(arg3)) {
            int var6 = arg4.field1306;
            int var7 = 0;
            int var8 = arg2 < arg3 ? arg2 : arg3;
            int var9 = arg2 >> 1;
            int var10 = arg3 >> 1;
            byte[] var11 = arg5;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg0, var7, arg1, arg2, arg3, 0, GlToolkit.method13334(arg4), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var14;
                    int var16 = var14;
                    int var17 = var13 + var14;
                    for (int var18 = 0; var18 < var10; var18++) {
                        for (int var19 = 0; var19 < var9; var19++) {
                            byte var20 = var11[var16];
                            int var21 = var6 + var16;
                            int var22 = var11[var21] + var20;
                            var16 = var6 + var21;
                            int var23 = var11[var17] + var22;
                            int var24 = var6 + var17;
                            int var25 = var11[var24] + var23;
                            var17 = var6 + var24;
                            var12[var15] = (byte) (var25 >> 2);
                            var15 += var6;
                        }
                        var16 += var13;
                        var17 += var13;
                    }
                }
                byte[] var26 = var12;
                var12 = var11;
                var11 = var26;
                arg2 = var9;
                arg3 = var10;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @ObfuscatedName("bg.z(IIIILcy;[F)V")
    public static void method2059(int arg0, int arg1, int arg2, int arg3, TextureFormat arg4, float[] arg5) {
        if (arg2 > 0 && !IntMath.method11258(arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || IntMath.method11258(arg3)) {
            int var6 = arg4.field1306;
            int var7 = 0;
            int var8 = arg2 < arg3 ? arg2 : arg3;
            int var9 = arg2 >> 1;
            int var10 = arg3 >> 1;
            float[] var11 = arg5;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var7, arg1, arg2, arg3, 0, GlToolkit.method13334(arg4), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var15 = var14;
                    int var16 = var14;
                    int var17 = var13 + var14;
                    for (int var18 = 0; var18 < var10; var18++) {
                        for (int var19 = 0; var19 < var9; var19++) {
                            float var20 = var11[var16];
                            int var21 = var6 + var16;
                            float var22 = var11[var21] + var20;
                            var16 = var6 + var21;
                            float var23 = var11[var17] + var22;
                            int var24 = var6 + var17;
                            float var25 = var11[var24] + var23;
                            var17 = var6 + var24;
                            var12[var15] = var25 * 0.25F;
                            var15 += var6;
                        }
                        var16 += var13;
                        var17 += var13;
                    }
                }
                float[] var26 = var12;
                var12 = var11;
                var11 = var26;
                arg2 = var9;
                arg3 = var10;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
