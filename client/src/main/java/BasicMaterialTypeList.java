import deob.ObfuscatedName;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("cj")
public class BasicMaterialTypeList implements MaterialTypeList {

    @ObfuscatedName("cj.u")
    public Js5 field1292;

    @ObfuscatedName("cj.j")
    public Js5 field1293;

    @ObfuscatedName("cj.a")
    public Material[] materials;

    @ObfuscatedName("cj.s")
    public int count;

    public BasicMaterialTypeList(Js5 arg0, Js5 arg1, Js5 arg2) {
        this.field1292 = arg1;
        this.field1293 = arg2;
        Packet var4 = new Packet(arg0.fetchFile(0, 0));
        this.count = var4.g2();
        this.materials = new Material[this.count];
        for (int var5 = 0; var5 < this.count; var5++) {
            if (var4.g1() == 1) {
                this.materials[var5] = new Material();
            }
        }
        for (int var6 = 0; var6 < this.count; var6++) {
            if (this.materials[var6] != null) {
                this.materials[var6].field1250 = var4.g1() == 0;
            }
        }
        for (int var7 = 0; var7 < this.count; var7++) {
            if (this.materials[var7] != null) {
                this.materials[var7].field1252 = Material.method1839(var4.g1());
            }
        }
        for (int var8 = 0; var8 < this.count; var8++) {
            if (this.materials[var8] != null) {
                this.materials[var8].field1265 = var4.g1() == 1;
            }
        }
        for (int var9 = 0; var9 < this.count; var9++) {
            if (this.materials[var9] != null) {
                this.materials[var9].field1267 = var4.g1b();
            }
        }
        for (int var10 = 0; var10 < this.count; var10++) {
            if (this.materials[var10] != null) {
                this.materials[var10].field1266 = var4.g1b();
            }
        }
        for (int var11 = 0; var11 < this.count; var11++) {
            if (this.materials[var11] != null) {
                this.materials[var11].field1270 = var4.g1b();
            }
        }
        for (int var12 = 0; var12 < this.count; var12++) {
            if (this.materials[var12] != null) {
                this.materials[var12].field1248 = var4.g1b();
            }
        }
        for (int var13 = 0; var13 < this.count; var13++) {
            if (this.materials[var13] != null) {
                this.materials[var13].field1260 = (short) var4.g2();
            }
        }
        for (int var14 = 0; var14 < this.count; var14++) {
            if (this.materials[var14] != null) {
                this.materials[var14].field1268 = var4.g1b();
            }
        }
        for (int var15 = 0; var15 < this.count; var15++) {
            if (this.materials[var15] != null) {
                this.materials[var15].field1261 = var4.g1b();
            }
        }
        for (int var16 = 0; var16 < this.count; var16++) {
            if (this.materials[var16] != null) {
                this.materials[var16].field1276 = var4.g1() == 1;
            }
        }
        for (int var17 = 0; var17 < this.count; var17++) {
            if (this.materials[var17] != null) {
                this.materials[var17].field1277 = var4.g1() == 1;
            }
        }
        for (int var18 = 0; var18 < this.count; var18++) {
            if (this.materials[var18] != null) {
                this.materials[var18].field1275 = var4.g1b();
            }
        }
        for (int var19 = 0; var19 < this.count; var19++) {
            if (this.materials[var19] != null) {
                this.materials[var19].field1273 = var4.g1() == 1;
            }
        }
        for (int var20 = 0; var20 < this.count; var20++) {
            if (this.materials[var20] != null) {
                this.materials[var20].field1274 = var4.g1() == 1;
            }
        }
        for (int var21 = 0; var21 < this.count; var21++) {
            if (this.materials[var21] != null) {
                this.materials[var21].field1245 = var4.g1() == 1;
            }
        }
        for (int var22 = 0; var22 < this.count; var22++) {
            if (this.materials[var22] != null) {
                this.materials[var22].field1278 = var4.g1();
            }
        }
        for (int var23 = 0; var23 < this.count; var23++) {
            if (this.materials[var23] != null) {
                this.materials[var23].field1264 = var4.g4s();
            }
        }
        for (int var24 = 0; var24 < this.count; var24++) {
            if (this.materials[var24] != null) {
                this.materials[var24].field1262 = (MaterialAlphaMode) SerializableEnums.decode(MaterialAlphaMode.method7322(), var4.g1());
            }
        }
    }

    @ObfuscatedName("cj.u(I)I")
    public int method894() {
        return this.count;
    }

    @ObfuscatedName("cj.j(ILpy;FIIZI)Z")
    public boolean method898(int arg0, TextureRelated2 arg1, float arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = true;
        if (this.materials[arg0].field1245) {
            var7 = this.field1293.method5630(arg0);
        }
        return var7 & this.field1292.method5630(arg0);
    }

    @ObfuscatedName("cj.a(II)[I")
    public int[] method2559(int arg0) {
        int[] var2 = this.method2570(arg0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if ((var2[var3] & 0xFFFFFF) == 0) {
                var2[var3] &= 0xFFFFFF;
            } else {
                var2[var3] |= 0xFF000000;
            }
        }
        return var2;
    }

    @ObfuscatedName("cj.s(II)[I")
    public int[] method2570(int arg0) {
        byte[] var2 = this.field1292.method5635(arg0);
        if (var2 == null) {
            return null;
        }
        try {
            return this.method2562(var2);
        } catch (IOException var5) {
            return null;
        }
    }

    @ObfuscatedName("cj.c(II)[F")
    public float[] method2560(int arg0) {
        int[] var2 = this.method2570(arg0);
        if (var2 == null) {
            return null;
        }
        int[] var3 = null;
        int var4 = this.materials[arg0].field1252;
        if (this.materials[arg0].field1245) {
            byte[] var5 = this.field1293.method5635(arg0);
            if (var5 != null) {
                try {
                    var3 = this.method2562(var5);
                    for (int var6 = 0; var6 < var3.length; var6++) {
                        var3[var6] &= 0xFFF;
                    }
                } catch (IOException var17) {
                }
            }
        }
        if (var3 == null) {
            var3 = new int[var4 * var4];
        }
        float[] var8 = new float[var2.length * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < var2.length; var10++) {
            int var11 = var2[var10];
            int var12 = var11 >>> 24;
            int var13 = var11 >> 16 & 0xFF;
            int var14 = var11 >> 8 & 0xFF;
            int var15 = var11 & 0xFF;
            float var16 = (float) var3[var10] * 31.0F / 4096.0F + 1.0F;
            var8[var9++] = (float) var13 * var16 / 255.0F;
            var8[var9++] = (float) var14 * var16 / 255.0F;
            var8[var9++] = (float) var15 * var16 / 255.0F;
            var8[var9++] = (float) var12 / 255.0F;
        }
        return var8;
    }

    @ObfuscatedName("cj.m(II)Lcu;")
    public Material method889(int arg0) {
        return this.materials[arg0];
    }

    @ObfuscatedName("cj.t(B)V")
    public void method890() {
    }

    @ObfuscatedName("cj.l(IFIIZB)[I")
    public int[] method886(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
        return this.method2559(arg0);
    }

    @ObfuscatedName("cj.f(IFIIZI)[I")
    public int[] method887(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
        return this.method2570(arg0);
    }

    @ObfuscatedName("cj.d(IFIIZI)[F")
    public float[] method888(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
        return this.method2560(arg0);
    }

    @ObfuscatedName("cj.z([BI)[I")
    public int[] method2562(byte[] arg0) throws IOException {
        BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
        if (var2.getType() != 10 && var2.getType() != 0) {
            return var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), null, 0, var2.getWidth());
        }
        Object var3 = null;
        int[] var4 = var2.getRaster().getPixels(0, 0, var2.getWidth(), var2.getHeight(), (int[]) var3);
        int[] var5 = new int[var2.getWidth() * var2.getHeight()];
        if (var2.getType() == 10) {
            for (int var6 = 0; var6 < var5.length; var6++) {
                var5[var6] = (var4[var6] << 8) + (var4[var6] << 16) + var4[var6] + 0xff000000;
            }
        } else {
            for (int var7 = 0; var7 < var5.length; var7++) {
                int var8 = var7 * 2;
                var5[var7] = (var4[var8 + 1] << 24) + var4[var8] + (var4[var8] << 16) + (var4[var8] << 8);
            }
        }
        return var5;
    }
}
