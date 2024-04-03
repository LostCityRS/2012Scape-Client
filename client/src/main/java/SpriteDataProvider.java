import deob.ObfuscatedName;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

@ObfuscatedName("cz")
public class SpriteDataProvider {

    public SpriteDataProvider() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.u(Lls;II)Lds;")
    public static SpriteData method2590(Js5 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5627(arg1, arg2);
        return var3 == null ? null : method2594(var3)[0];
    }

    @ObfuscatedName("cz.j(Lls;I)Lds;")
    public static SpriteData method2598(Js5 arg0, int arg1) {
        byte[] var2 = arg0.method5635(arg1);
        return var2 == null ? null : method2594(var2)[0];
    }

    @ObfuscatedName("cz.a(Lls;II)[Lds;")
    public static SpriteData[] method2591(Js5 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method5627(arg1, arg2);
        return var3 == null ? null : method2594(var3);
    }

    @ObfuscatedName("cz.s(Lls;I)[Lds;")
    public static SpriteData[] method2593(Js5 arg0, int arg1) {
        byte[] var2 = arg0.method5635(arg1);
        return var2 == null ? null : method2594(var2);
    }

    @ObfuscatedName("cz.c([B)[Lds;")
    public static SpriteData[] method2594(byte[] arg0) {
        Packet var1 = new Packet(arg0);
        var1.field9626 = arg0.length - 2;
        int var2 = var1.method15239();
        if (var2 != 65535) {
            PalettedSpriteData[] var3 = new PalettedSpriteData[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = new PalettedSpriteData();
            }
            var1.field9626 = arg0.length - 7 - var2 * 8;
            int var5 = var1.method15239();
            int var6 = var1.method15239();
            int var7 = (var1.method15220() & 0xFF) + 1;
            for (int var8 = 0; var8 < var2; var8++) {
                var3[var8].field8413 = var1.method15239();
            }
            for (int var9 = 0; var9 < var2; var9++) {
                var3[var9].field8412 = var1.method15239();
            }
            for (int var10 = 0; var10 < var2; var10++) {
                var3[var10].field8415 = var1.method15239();
            }
            for (int var11 = 0; var11 < var2; var11++) {
                var3[var11].field8409 = var1.method15239();
            }
            for (int var12 = 0; var12 < var2; var12++) {
                PalettedSpriteData var13 = var3[var12];
                var13.field8411 = var5 - var13.field8415 - var13.field8413;
                var13.field8414 = var6 - var13.field8409 - var13.field8412;
            }
            var1.field9626 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
            int[] var14 = new int[var7];
            for (int var15 = 1; var15 < var7; var15++) {
                var14[var15] = var1.method15241();
                if (var14[var15] == 0) {
                    var14[var15] = 1;
                }
            }
            for (int var16 = 0; var16 < var2; var16++) {
                var3[var16].field8410 = var14;
            }
            var1.field9626 = 0;
            for (int var17 = 0; var17 < var2; var17++) {
                PalettedSpriteData var18 = var3[var17];
                int var19 = var18.field8415 * var18.field8409;
                var18.field8408 = new byte[var19];
                int var20 = var1.method15220();
                if ((var20 & 0x2) != 0) {
                    boolean var24 = false;
                    var18.field8416 = new byte[var19];
                    if ((var20 & 0x1) == 0) {
                        for (int var25 = 0; var25 < var19; var25++) {
                            var18.field8408[var25] = var1.method15238();
                        }
                        for (int var26 = 0; var26 < var19; var26++) {
                            byte var27 = var18.field8416[var26] = var1.method15238();
                            var24 |= var27 != -1;
                        }
                    } else {
                        for (int var28 = 0; var28 < var18.field8415; var28++) {
                            for (int var29 = 0; var29 < var18.field8409; var29++) {
                                var18.field8408[var18.field8415 * var29 + var28] = var1.method15238();
                            }
                        }
                        for (int var30 = 0; var30 < var18.field8415; var30++) {
                            for (int var31 = 0; var31 < var18.field8409; var31++) {
                                byte var32 = var18.field8416[var18.field8415 * var31 + var30] = var1.method15238();
                                var24 |= var32 != -1;
                            }
                        }
                    }
                    if (!var24) {
                        var18.field8416 = null;
                    }
                } else if ((var20 & 0x1) == 0) {
                    for (int var21 = 0; var21 < var19; var21++) {
                        var18.field8408[var21] = var1.method15238();
                    }
                } else {
                    for (int var22 = 0; var22 < var18.field8415; var22++) {
                        for (int var23 = 0; var23 < var18.field8409; var23++) {
                            var18.field8408[var18.field8415 * var23 + var22] = var1.method15238();
                        }
                    }
                }
            }
            return var3;
        }
        var1.field9626 = 0;
        int var33 = var1.method15220();
        if (var33 == 0) {
            boolean var34 = var1.method15220() == 1;
            int var35 = var1.method15239();
            int var36 = var1.method15239();
            int[] var37 = new int[var35 * var36];
            for (int var38 = 0; var38 < var35 * var36; var38++) {
                var37[var38] = var1.method15241() | 0xFF000000;
            }
            if (var34) {
                for (int var39 = 0; var39 < var35 * var36; var39++) {
                    var37[var39] &= 0xFFFFFF;
                    var37[var39] |= var1.method15220() << 24;
                }
            }
            FullSpriteData var40 = new FullSpriteData(var35, var36, var37);
            return new SpriteData[]{var40};
        } else if (var33 == 1) {
            try {
                BufferedImage var41 = ImageIO.read(new ByteArrayInputStream(var1.field9629, var1.field9626, var1.field9629.length - var1.field9626));
                int var42 = var41.getWidth();
                int var43 = var41.getHeight();
                FullSpriteData var44 = new FullSpriteData(var42, var43, var41.getData().getPixels(0, 0, var42, var43, new int[var42 * var43]));
                return new SpriteData[]{var44};
            } catch (IOException var46) {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }
}
