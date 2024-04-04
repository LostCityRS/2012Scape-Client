import deob.ObfuscatedName;

import java.awt.FontMetrics;
import java.awt.*;
import java.awt.image.PixelGrabber;

@ObfuscatedName("as")
public class WorldMapFont {

    @ObfuscatedName("as.j")
    public static final int field740 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();

    @ObfuscatedName("as.a")
    public static int[] field742 = new int[256];

    @ObfuscatedName("as.s")
    public boolean field743 = false;

    @ObfuscatedName("as.c")
    public Sprite[] field739;

    @ObfuscatedName("as.m")
    public int[] field744;

    @ObfuscatedName("as.t")
    public int field745;

    @ObfuscatedName("as.l")
    public int field746;

    @ObfuscatedName("as.f")
    public int[] field747 = new int[4];

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
            if (var1 == -1) {
                var1 = 74;
            }
            field742[var0] = var1;
        }
    }

    public WorldMapFont(RendererToolkit arg0, int arg1, boolean arg2, java.awt.Component arg3) {
        this.field743 = false;
        this.field739 = new Sprite[256];
        this.field744 = new int[256];
        java.awt.Font var5 = new java.awt.Font("Helvetica", arg2 ? 1 : 0, arg1);
        FontMetrics var6 = arg3.getFontMetrics(var5);
        for (int var7 = 0; var7 < field740; var7++) {
            this.method1744(arg0, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
        }
        if (arg2 && this.field743) {
            this.field743 = false;
            java.awt.Font var8 = new java.awt.Font("Helvetica", 0, arg1);
            FontMetrics var9 = arg3.getFontMetrics(var8);
            for (int var10 = 0; var10 < field740; var10++) {
                this.method1744(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var10), var10, false);
            }
            if (!this.field743) {
                this.field743 = false;
                for (int var11 = 0; var11 < field740; var11++) {
                    this.method1744(arg0, var8, var9, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var11), var11, true);
                }
            }
        }
    }

    @ObfuscatedName("as.u(Lra;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
    public void method1744(RendererToolkit arg0, java.awt.Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
        int var7 = arg2.charWidth(arg3);
        int var8 = var7;
        if (arg5) {
            try {
                if (arg3 == '/') {
                    arg5 = false;
                }
                if (arg3 == 'f' || arg3 == 't' || arg3 == 'w' || arg3 == 'v' || arg3 == 'k' || arg3 == 'x' || arg3 == 'y' || arg3 == 'A' || arg3 == 'V' || arg3 == 'W') {
                    var7++;
                }
            } catch (Exception var25) {
            }
        }
        int var10 = arg2.getMaxAscent();
        int var11 = arg2.getMaxAscent() + arg2.getMaxDescent();
        int var12 = arg2.getHeight();
        Image var13 = Statics.canvas.createImage(var7, var11);
        Graphics var14 = var13.getGraphics();
        var14.setColor(Color.black);
        var14.fillRect(0, 0, var7, var11);
        var14.setColor(Color.white);
        var14.setFont(arg1);
        var14.drawString(arg3 + "", 0, var10);
        if (arg5) {
            var14.drawString(arg3 + "", 1, var10);
        }
        int[] var15 = new int[var7 * var11];
        PixelGrabber var16 = new PixelGrabber(var13, 0, 0, var7, var11, var15, 0, var7);
        try {
            var16.grabPixels();
        } catch (Exception var24) {
        }
        var13.flush();
        Object var18 = null;
        int var19 = 0;
        label64:
        for (int var20 = 0; var20 < var11; var20++) {
            for (int var21 = 0; var21 < var7; var21++) {
                int var22 = var15[var7 * var20 + var21];
                if ((var22 & 0xFFFFFF) != 0) {
                    var19 = var20;
                    break label64;
                }
            }
        }
        for (int var23 = 0; var23 < var15.length; var23++) {
            if ((var15[var23] & 0xFFFFFF) == 0) {
                var15[var23] = 0;
            }
        }
        this.field745 = var10 - var19;
        this.field746 = var12;
        this.field744[arg4] = var8;
        this.field739[arg4] = arg0.method506(var15, 0, var7, var7, var11);
    }

    @ObfuscatedName("as.j()I")
    public int method1762() {
        return this.field745;
    }

    @ObfuscatedName("as.a()I")
    public int method1746() {
        return this.field746 - 1;
    }

    @ObfuscatedName("as.s(Ljava/lang/String;)I")
    public int method1747(String arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            int var4 = field742[arg0.charAt(var3)];
            var2 += this.field744[var4];
        }
        return var2;
    }

    @ObfuscatedName("as.c(Lra;Ljava/lang/String;IIIZ)V")
    public void method1749(RendererToolkit arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = this.method1747(arg1) / 2;
        arg0.qa(this.field747);
        if (arg2 - var7 <= this.field747[2] && (arg2 + var7 >= this.field747[0] && (arg3 - this.field745 <= this.field747[3] && this.field746 + arg3 >= this.field747[1]))) {
            this.method1748(arg0, arg1, this.field747, arg2 - var7, arg3, arg4, arg5);
        }
    }

    @ObfuscatedName("as.m(Lra;Ljava/lang/String;[IIIIZ)V")
    public void method1748(RendererToolkit arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 == 0) {
            arg6 = false;
        }
        int var8 = arg5 | 0xFF000000;
        for (int var9 = 0; var9 < arg1.length(); var9++) {
            int var10 = field742[arg1.charAt(var9)];
            if (arg6) {
                this.field739[var10].method1054(arg3 + 1, arg4 + 1, 0, -16777216, 1);
            }
            this.field739[var10].method1054(arg3, arg4, 0, var8, 1);
            arg3 += this.field744[var10];
        }
    }
}
