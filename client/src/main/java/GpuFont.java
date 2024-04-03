import deob.ObfuscatedName;

import java.nio.ByteBuffer;

@ObfuscatedName("zf")
public class GpuFont extends Font {

    @ObfuscatedName("zf.q")
    public final GpuToolkit field8447;

    @ObfuscatedName("zf.p")
    public final GpuTexture field8445;

    @ObfuscatedName("zf.w")
    public final VertexBuffer field8446;

    @ObfuscatedName("zf.b")
    public byte[] field8448 = new byte[512];

    @ObfuscatedName("zf.x")
    public int field8444;

    @ObfuscatedName("zf.i")
    public int field8449;

    public GpuFont(GpuToolkit arg0, FontMetrics arg1, PalettedSpriteData[] arg2, boolean arg3) {
        super(arg0, arg1);
        this.field8447 = arg0;
        this.field8449 = 0;
        for (int var5 = 0; var5 < 256; var5++) {
            PalettedSpriteData var6 = arg2[var5];
            if (var6.field8409 > this.field8449) {
                this.field8449 = var6.field8409;
            }
            if (var6.field8415 > this.field8449) {
                this.field8449 = var6.field8415;
            }
        }
        this.field8444 = this.field8449 * 16;
        if (arg3) {
            byte[] var7 = new byte[this.field8444 * this.field8444];
            for (int var8 = 0; var8 < 256; var8++) {
                PalettedSpriteData var9 = arg2[var8];
                int var10 = var9.field8409;
                int var11 = var9.field8415;
                int var12 = var8 % 16 * this.field8449;
                int var13 = var8 / 16 * this.field8449;
                int var14 = this.field8444 * var13 + var12;
                int var15 = 0;
                if (var9.field8416 == null) {
                    byte[] var16 = var9.field8408;
                    for (int var17 = 0; var17 < var10; var17++) {
                        for (int var18 = 0; var18 < var11; var18++) {
                            var7[var14++] = (byte) (var16[var15++] == 0 ? 0 : -1);
                        }
                        var14 += this.field8444 - var11;
                    }
                } else {
                    byte[] var19 = var9.field8416;
                    for (int var20 = 0; var20 < var10; var20++) {
                        for (int var21 = 0; var21 < var11; var21++) {
                            var7[var14++] = var19[var15++];
                        }
                        var14 += this.field8444 - var11;
                    }
                }
            }
            int[] var22 = new int[var7.length];
            for (int var23 = 0; var23 < var7.length; var23++) {
                var22[var23] = var7[var23] << 24 | var7[var23] << 16 | var7[var23] << 8 | var7[var23];
            }
            this.field8445 = arg0.method13548(this.field8444, this.field8444, false, var22);
        } else {
            int[] var24 = new int[this.field8444 * this.field8444];
            for (int var25 = 0; var25 < 256; var25++) {
                PalettedSpriteData var26 = arg2[var25];
                int[] var27 = var26.field8410;
                byte[] var28 = var26.field8416;
                byte[] var29 = var26.field8408;
                int var30 = var26.field8409;
                int var31 = var26.field8415;
                int var32 = var25 % 16 * this.field8449;
                int var33 = var25 / 16 * this.field8449;
                int var34 = this.field8444 * var33 + var32;
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
                        var34 += this.field8444 - var31;
                    }
                } else {
                    for (int var36 = 0; var36 < var30; var36++) {
                        for (int var37 = 0; var37 < var31; var37++) {
                            var24[var34++] = var28[var35] << 24 | var27[var29[var35] & 0xFF];
                            var35++;
                        }
                        var34 += this.field8444 - var31;
                    }
                }
            }
            this.field8445 = arg0.method13548(this.field8444, this.field8444, false, var24);
        }
        this.field8445.method4525(GpuTextureRelated.field2502);
        this.field8446 = arg0.method13584(false);
        this.field8446.method4269(20480, 20);
        ByteBuffer var41 = this.field8447.field8244;
        var41.clear();
        float var42 = this.field8445.method4437((float) this.field8444) / (float) this.field8444;
        float var43 = this.field8445.method4439((float) this.field8444) / (float) this.field8444;
        for (int var44 = 0; var44 < 256; var44++) {
            PalettedSpriteData var45 = arg2[var44];
            int var46 = var45.field8409;
            int var47 = var45.field8415;
            int var48 = var45.field8412;
            int var49 = var45.field8413;
            float var50 = (float) (var44 % 16 * this.field8449);
            float var51 = (float) (var44 / 16 * this.field8449);
            float var52 = var42 * var50;
            float var53 = var43 * var51;
            float var54 = ((float) var47 + var50) * var42;
            float var55 = ((float) var46 + var51) * var43;
            var41.putFloat((float) var49);
            var41.putFloat((float) var48);
            var41.putFloat(0.0F);
            var41.putFloat(var52);
            var41.putFloat(var53);
            var41.putFloat((float) var49);
            var41.putFloat((float) (var46 + var48));
            var41.putFloat(0.0F);
            var41.putFloat(var52);
            var41.putFloat(var55);
            var41.putFloat((float) (var47 + var49));
            var41.putFloat((float) (var46 + var48));
            var41.putFloat(0.0F);
            var41.putFloat(var54);
            var41.putFloat(var55);
            var41.putFloat((float) (var47 + var49));
            var41.putFloat((float) var48);
            var41.putFloat(0.0F);
            var41.putFloat(var54);
            var41.putFloat(var53);
        }
        this.field8446.method4452(0, var41.position(), this.field8447.field8245);
        arg0.method13739(12);
        for (int var56 = 0; var56 < 256; var56++) {
            PalettedSpriteData var57 = arg2[var56];
            this.field8448[var56 * 2] = (byte) var57.field8413;
            this.field8448[var56 * 2 + 1] = (byte) var57.field8412;
        }
    }

    @ObfuscatedName("zf.UA(CIIIZ)V")
    public void method848(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field8447.method13508() != GpuImageRelated.field2416) {
            int var6 = this.field8448[arg0 * 2] + arg1;
            int var7 = this.field8448[arg0 * 2 + 1] + arg2;
            this.field8447.field8342.method4497((float) var6, (float) var7, (float) (this.field8449 + var6), (float) (this.field8449 + var7), (float) (arg0 % 16) / 16.0F * this.field8445.method4433(), (float) (arg0 / 16) / 16.0F * this.field8445.method4443(), (float) (arg0 % 16 + 1) / 16.0F * this.field8445.method4433(), (float) (arg0 / 16 + 1) / 16.0F * this.field8445.method4443(), this.field8445, arg3);
            return;
        }
        this.field8447.method13610();
        this.field8447.method13592(1);
        SpriteShader var8 = this.field8447.field8346;
        var8.field2284 = this.field8445;
        var8.method3881(0, arg3);
        float var9 = (float) this.field8447.method457().method921();
        float var10 = (float) this.field8447.method457().method922();
        var8.field2280.method5435(2.0F / var9, 2.0F / var10, 1.0F, 1.0F);
        var8.field2280.field3480[12] = ((float) arg1 + this.field8447.method13750()) * 2.0F / var9 - 1.0F;
        var8.field2280.field3480[13] = ((float) arg2 + this.field8447.method13750()) * 2.0F / var10 - 1.0F;
        var8.field2280.field3480[14] = -1.0F;
        var8.field2281.method5453();
        var8.field2283 = this.field8446;
        var8.field2277 = arg0 * 4;
        var8.field2285 = this.field8447.field8392;
        var8.method3882();
    }

    @ObfuscatedName("zf.b(CIIIZLta;II)V")
    public void method867(char arg0, int arg1, int arg2, int arg3, boolean arg4, GraphicsRelated arg5, int arg6, int arg7) {
    }
}
