import deob.ObfuscatedName;

@ObfuscatedName("t")
public class DefaultSprites {

    public DefaultSprites() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ty.u(Lls;B)V")
    public static void method11376(Js5 arg0) {
        Statics.field551 = arg0.method5688("p11_full");
        Statics.field552 = arg0.method5688("p12_full");
        Statics.field557 = arg0.method5688("b12_full");
    }

    @ObfuscatedName("qs.j(Lls;I)V")
    public static void method8388(Js5 arg0) {
        Statics.field5179 = arg0.method5688("headicons_pk");
        Statics.field553 = arg0.method5688("headicons_prayer");
        Statics.field554 = arg0.method5688("hint_headicons");
        Statics.field3489 = arg0.method5688("hint_mapmarkers");
        Statics.field555 = arg0.method5688("mapflag");
        Statics.field556 = arg0.method5688("cross");
        Statics.field550 = arg0.method5688("mapdots");
        Statics.field6816 = arg0.method5688("name_icons");
        Statics.field3845 = arg0.method5688("floorshadows");
        Statics.field4683 = arg0.method5688("compass");
        Statics.field558 = arg0.method5688("otherlevel");
        Statics.field6648 = arg0.method5688("hint_mapedge");
    }

    @ObfuscatedName("ml.a(I)[I")
    public static int[] method6244() {
        return new int[]{Statics.field551, Statics.field552, Statics.field557};
    }

    @ObfuscatedName("eu.s(Lra;I)V")
    public static void method2931(RendererToolkit arg0) {
        Statics.field2163 = (FontType) Statics.field6784.method4859(client.field8914, Statics.field551, true, true);
        Statics.field559 = Statics.field6784.method4843(client.field8914, Statics.field551);
        Statics.field560 = (FontType) Statics.field6784.method4859(client.field8914, Statics.field552, true, true);
        Statics.field9813 = Statics.field6784.method4843(client.field8914, Statics.field552);
        Statics.field670 = (FontType) Statics.field6784.method4859(client.field8914, Statics.field557, true, true);
        Statics.field2399 = Statics.field6784.method4843(client.field8914, Statics.field557);
    }

    @ObfuscatedName("un.c(Lls;B)I")
    public static int method12092(Js5 arg0) {
        int var1 = 0;
        if (arg0.method5630(Statics.field5179)) {
            var1++;
        }
        if (arg0.method5630(Statics.field553)) {
            var1++;
        }
        if (arg0.method5630(Statics.field554)) {
            var1++;
        }
        if (arg0.method5630(Statics.field3489)) {
            var1++;
        }
        if (arg0.method5630(Statics.field555)) {
            var1++;
        }
        if (arg0.method5630(Statics.field556)) {
            var1++;
        }
        if (arg0.method5630(Statics.field550)) {
            var1++;
        }
        if (arg0.method5630(Statics.field6816)) {
            var1++;
        }
        if (arg0.method5630(Statics.field3845)) {
            var1++;
        }
        if (arg0.method5630(Statics.field4683)) {
            var1++;
        }
        if (arg0.method5630(Statics.field558)) {
            var1++;
        }
        if (arg0.method5630(Statics.field6648)) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("b.m(I)I")
    public static int method1589() {
        return 12;
    }

    @ObfuscatedName("afb.t(Lra;Lls;I)V")
    public static void method15812(RendererToolkit arg0, Js5 arg1) {
        SpriteData[] var2 = SpriteDataProvider.method2591(arg1, Statics.field5179, 0);
        Statics.field2209 = new Sprite[var2.length];
        for (int var3 = 0; var3 < var2.length; var3++) {
            Statics.field2209[var3] = arg0.method517(var2[var3], true);
        }
        SpriteData[] var4 = SpriteDataProvider.method2591(arg1, Statics.field553, 0);
        Statics.field9904 = new Sprite[var4.length];
        for (int var5 = 0; var5 < var4.length; var5++) {
            Statics.field9904[var5] = arg0.method517(var4[var5], true);
        }
        SpriteData[] var6 = SpriteDataProvider.method2591(arg1, Statics.field554, 0);
        Statics.field6361 = new Sprite[var6.length];
        for (int var7 = 0; var7 < var6.length; var7++) {
            Statics.field6361[var7] = arg0.method517(var6[var7], true);
        }
        SpriteData[] var8 = SpriteDataProvider.method2591(arg1, Statics.field3489, 0);
        Statics.field3311 = new Sprite[var8.length];
        for (int var9 = 0; var9 < var8.length; var9++) {
            Statics.field3311[var9] = arg0.method517(var8[var9], true);
        }
        SpriteData[] var10 = SpriteDataProvider.method2591(arg1, Statics.field555, 0);
        Statics.field9826 = new Sprite[var10.length];
        byte var11 = 25;
        for (int var12 = 0; var12 < var10.length; var12++) {
            var10[var12].method2719(-var11 + (int) (Math.random() * (double) var11 * 2.0D), -var11 + (int) (Math.random() * (double) var11 * 2.0D), -var11 + (int) (Math.random() * (double) var11 * 2.0D));
            Statics.field9826[var12] = arg0.method517(var10[var12], true);
        }
        SpriteData[] var13 = SpriteDataProvider.method2591(arg1, Statics.field556, 0);
        Statics.field2618 = new Sprite[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            Statics.field2618[var14] = arg0.method517(var13[var14], true);
        }
        SpriteData[] var15 = SpriteDataProvider.method2591(arg1, Statics.field550, 0);
        Statics.field561 = new Sprite[var15.length];
        byte var16 = 12;
        for (int var17 = 0; var17 < var15.length; var17++) {
            var15[var17].method2719(-var16 + (int) (Math.random() * (double) var16 * 2.0D), -var16 + (int) (Math.random() * (double) var16 * 2.0D), -var16 + (int) (Math.random() * (double) var16 * 2.0D));
            Statics.field561[var17] = arg0.method517(var15[var17], true);
        }
        SpriteData[] var18 = SpriteDataProvider.method2591(arg1, Statics.field6816, 0);
        Statics.field8538 = new Sprite[var18.length];
        byte var19 = 12;
        for (int var20 = 0; var20 < var18.length; var20++) {
            var18[var20].method2719(-var19 + (int) (Math.random() * (double) var19 * 2.0D), -var19 + (int) (Math.random() * (double) var19 * 2.0D), -var19 + (int) (Math.random() * (double) var19 * 2.0D));
            Statics.field8538[var20] = arg0.method517(var18[var20], true);
        }
        Statics.field7290 = arg0.method517(SpriteDataProvider.method2590(arg1, Statics.field4683, 0), true);
        Statics.field6385 = arg0.method517(SpriteDataProvider.method2590(arg1, Statics.field558, 0), true);
        SpriteData[] var21 = SpriteDataProvider.method2591(arg1, Statics.field6648, 0);
        Statics.field4878 = new Sprite[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            Statics.field4878[var22] = arg0.method517(var21[var22], true);
        }
    }

    @ObfuscatedName("ee.l(I)V")
    public static void method3095() {
        Statics.field2163 = null;
        Statics.field560 = null;
        Statics.field670 = null;
        Statics.field2209 = null;
        Statics.field9904 = null;
        Statics.field6361 = null;
        Statics.field3311 = null;
        Statics.field9826 = null;
        Statics.field2618 = null;
        Statics.field561 = null;
        Statics.field8538 = null;
        Statics.field7290 = null;
        Statics.field6385 = null;
        Statics.field4878 = null;
    }
}
