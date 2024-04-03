import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("l")
public abstract class Font {

    @ObfuscatedName("l.u")
    public FontMetrics field418;

    @ObfuscatedName("l.j")
    public RendererToolkit field417;

    @ObfuscatedName("l.c")
    public static int field421 = -1;

    @ObfuscatedName("l.m")
    public static int field422 = -1;

    @ObfuscatedName("l.t")
    public static int field423 = 0;

    @ObfuscatedName("l.l")
    public static int field424 = 0;

    @ObfuscatedName("l.f")
    public static int field425 = 0;

    @ObfuscatedName("l.d")
    public static int field426 = 0;

    @ObfuscatedName("l.z")
    public static int field427 = 0;

    @ObfuscatedName("l.n")
    public static int field428 = 0;

    @ObfuscatedName("l.o")
    public static String[] field420 = new String[100];

    public Font(RendererToolkit arg0, FontMetrics arg1) {
        this.field417 = arg0;
        this.field418 = arg1;
    }

    @ObfuscatedName("l.u(Ljava/lang/String;IIIII)V")
    public void method833(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method843(arg3, arg4);
            this.method857(arg0, arg1, arg2, null, null, null, 0, 0);
        }
    }

    @ObfuscatedName("l.j(Ljava/lang/String;IIIII)V")
    public void method862(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method843(arg3, arg4);
            this.method857(arg0, arg1 - this.field418.method12418(arg0), arg2, null, null, null, 0, 0);
        }
    }

    @ObfuscatedName("l.a(Ljava/lang/String;IIIII)V")
    public void method834(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method843(arg3, arg4);
            this.method857(arg0, arg1 - this.field418.method12418(arg0) / 2, arg2, null, null, null, 0, 0);
        }
    }

    @ObfuscatedName("l.s(Ljava/lang/String;IIIIIIIII[Lce;[ILta;IIB)I")
    public int method836(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Sprite[] arg10, int[] arg11, GraphicsRelated arg12, int arg13, int arg14) {
        return this.method832(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14);
    }

    @ObfuscatedName("l.c(Ljava/lang/String;IIIIIIIIII[Lce;[ILta;IIB)I")
    public int method832(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, Sprite[] arg11, int[] arg12, GraphicsRelated arg13, int arg14, int arg15) {
        if (arg0 == null) {
            return 0;
        }
        this.method843(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field418.field7175;
        }
        int[] var17;
        if (arg4 < this.field418.field7177 + this.field418.field7176 + arg9 && arg4 < arg9 + arg9) {
            var17 = null;
        } else {
            var17 = new int[]{arg3};
        }
        int var18 = this.field418.method12398(arg0, var17, field420, arg11);
        if (arg10 == -1) {
            arg10 = arg4 / arg9;
            if (arg10 <= 0) {
                arg10 = 1;
            }
        }
        if (arg10 > 0 && var18 >= arg10) {
            field420[arg10 - 1] = this.field418.method12391(field420[arg10 - 1], arg3, arg11);
            var18 = arg10;
        }
        if (arg8 == 3 && var18 == 1) {
            arg8 = 1;
        }
        int var19;
        if (arg8 == 0) {
            var19 = this.field418.field7176 + arg2;
        } else if (arg8 == 1) {
            var19 = (arg4 - this.field418.field7176 - this.field418.field7177 - (var18 - 1) * arg9) / 2 + this.field418.field7176 + arg2;
        } else if (arg8 == 2) {
            var19 = arg2 + arg4 - this.field418.field7177 - (var18 - 1) * arg9;
        } else {
            int var20 = (arg4 - this.field418.field7176 - this.field418.field7177 - (var18 - 1) * arg9) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = this.field418.field7176 + arg2 + var20;
            arg9 += var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg7 == 0) {
                this.method857(field420[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
            } else if (arg7 == 1) {
                this.method857(field420[var21], arg1 + (arg3 - this.field418.method12418(field420[var21])) / 2, var19, arg11, arg12, arg13, arg14, arg15);
            } else if (arg7 == 2) {
                this.method857(field420[var21], arg1 + arg3 - this.field418.method12418(field420[var21]), var19, arg11, arg12, arg13, arg14, arg15);
            } else if (var18 - 1 == var21) {
                this.method857(field420[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
            } else {
                this.method845(field420[var21], arg3);
                this.method857(field420[var21], arg1, var19, arg11, arg12, arg13, arg14, arg15);
                field427 = 0;
            }
            var19 += arg9;
        }
        return var18;
    }

    @ObfuscatedName("l.m(Ljava/lang/String;IIIIII)V")
    public void method838(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method843(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 2.0D) * 5.0D);
        }
        this.method847(arg0, arg1 - this.field418.method12418(arg0) / 2, arg2, null, null, null, var8);
    }

    @ObfuscatedName("l.t(Ljava/lang/String;IIIIII)V")
    public void method839(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method843(arg3, arg4);
        int var7 = arg0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (int var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 5.0D) * 5.0D);
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 3.0D) * 5.0D);
        }
        this.method847(arg0, arg1 - this.field418.method12418(arg0) / 2, arg2, null, null, var8, var9);
    }

    @ObfuscatedName("l.l(Ljava/lang/String;IIIIIII)V")
    public void method840(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method843(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int var10 = arg0.length();
        int[] var11 = new int[var10];
        for (int var12 = 0; var12 < var10; var12++) {
            var11[var12] = (int) (Math.sin((double) arg5 / 1.0D + (double) var12 / 1.5D) * var8);
        }
        this.method847(arg0, arg1 - this.field418.method12418(arg0) / 2, arg2, null, null, null, var11);
    }

    @ObfuscatedName("l.f(Ljava/lang/String;IIIILjava/util/Random;I[Lce;[II)I")
    public int method841(String arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6, Sprite[] arg7, int[] arg8) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        int var10 = (arg5.nextInt() & 0x1F) + 192;
        this.method843(var10 << 24 | arg3 & 0xFFFFFF, var10 << 24 | arg4 & 0xFFFFFF);
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        int var13 = 0;
        for (int var14 = 0; var14 < var11; var14++) {
            var12[var14] = var13;
            if ((arg5.nextInt() & 0x3) == 0) {
                var13++;
            }
        }
        this.method847(arg0, arg1, arg2, arg7, arg8, var12, null);
        return var13;
    }

    @ObfuscatedName("l.d(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lce;[IB)I")
    public int method842(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int[] arg11, Sprite[] arg12, int[] arg13) {
        if (arg0 == null) {
            return 0;
        }
        arg9.setSeed((long) arg10);
        int var15 = (arg9.nextInt() & 0x1F) + 192;
        this.method843(var15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : var15 << 24 | arg6 & 0xFFFFFF);
        int var16 = arg0.length();
        int[] var17 = new int[var16];
        int var18 = 0;
        for (int var19 = 0; var19 < var16; var19++) {
            var17[var19] = var18;
            if ((arg9.nextInt() & 0x3) == 0) {
                var18++;
            }
        }
        int var20 = arg1;
        int var21 = this.field418.field7176 + arg2;
        int var22 = -1;
        if (arg8 == 1) {
            var21 += (arg4 - this.field418.field7176 - this.field418.field7177) / 2;
        } else if (arg8 == 2) {
            var21 = arg2 + arg4 - this.field418.field7177;
        }
        if (arg7 == 1) {
            var22 = this.field418.method12418(arg0) + var18;
            var20 = (arg3 - var22) / 2 + arg1;
        } else if (arg7 == 2) {
            var22 = this.field418.method12418(arg0) + var18;
            var20 = arg3 - var22 + arg1;
        }
        this.method847(arg0, var20, var21, arg12, arg13, var17, null);
        if (arg11 != null) {
            if (var22 == -1) {
                var22 = this.field418.method12418(arg0) + var18;
            }
            arg11[0] = var20;
            arg11[1] = var21 - this.field418.field7176;
            arg11[2] = var22;
            arg11[3] = this.field418.field7177 + this.field418.field7176;
        }
        return var18;
    }

    @ObfuscatedName("l.z(IIB)V")
    public void method843(int arg0, int arg1) {
        field421 = -1;
        field422 = -1;
        field423 = arg0;
        field424 = arg0;
        field427 = 0;
        field428 = 0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        field425 = arg1;
        field426 = arg1;
    }

    @ObfuscatedName("l.o(Ljava/lang/String;I)V")
    public void method844(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field424 = field424 & 0xFF000000 | StringTools.method4773(arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                field424 = field424 & 0xFF000000 | field423 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                field424 = StringTools.method4773(arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                field424 = field423;
            } else if (arg0.startsWith("str=")) {
                field421 = field424 & 0xFF000000 | StringTools.method4773(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field421 = field424 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                field421 = -1;
            } else if (arg0.startsWith("u=")) {
                field422 = field424 & 0xFF000000 | StringTools.method4773(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field422 = field424 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                field422 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                field426 = 0;
            } else if (arg0.startsWith("shad=")) {
                field426 = field424 & 0xFF000000 | StringTools.method4773(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field426 = field424 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                field426 = field425;
            } else if (arg0.equals("br")) {
                this.method843(field423, field425);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("l.q(Ljava/lang/String;II)V")
    public void method845(String arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.length(); var5++) {
            char var6 = arg0.charAt(var5);
            if (var6 == '<') {
                var4 = true;
            } else if (var6 == '>') {
                var4 = false;
            } else if (!var4 && var6 == ' ') {
                var3++;
            }
        }
        if (var3 > 0) {
            field427 = (arg1 - this.field418.method12418(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("l.p(Ljava/lang/String;II[Lce;[ILta;III)V")
    public void method857(String arg0, int arg1, int arg2, Sprite[] arg3, int[] arg4, GraphicsRelated arg5, int arg6, int arg7) {
        int var9 = arg2 - this.field418.field7175;
        int var10 = -1;
        int var11 = -1;
        int var12 = arg0.length();
        for (int var13 = 0; var13 < var12; var13++) {
            char var14 = (char) (Cp1252.method2474(arg0.charAt(var13)) & 0xFF);
            if (var14 == '<') {
                var10 = var13;
            } else {
                if (var14 == '>' && var10 != -1) {
                    String var15 = arg0.substring(var10 + 1, var13);
                    var10 = -1;
                    if (var15.equals("lt")) {
                        var14 = '<';
                    } else if (var15.equals("gt")) {
                        var14 = '>';
                    } else if (var15.equals("nbsp")) {
                        var14 = 160;
                    } else if (var15.equals("shy")) {
                        var14 = 173;
                    } else if (var15.equals("times")) {
                        var14 = 215;
                    } else if (var15.equals("euro")) {
                        var14 = 8364;
                    } else if (var15.equals("copy")) {
                        var14 = 169;
                    } else {
                        if (!var15.equals("reg")) {
                            if (var15.startsWith("img=")) {
                                try {
                                    int var16 = StringTools.method5598(var15.substring(4));
                                    Sprite var17 = arg3[var16];
                                    int var18 = arg4 == null ? var17.method1047() : arg4[var16];
                                    if ((field424 & -16777216) == -16777216) {
                                        var17.method1054(arg1, this.field418.field7175 + var9 - var18, 1, -1, 1);
                                    } else {
                                        var17.method1054(arg1, this.field418.field7175 + var9 - var18, 0, field424 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg1 += arg3[var16].method1042();
                                    var11 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method844(var15);
                            }
                            continue;
                        }
                        var14 = 174;
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field418.method12387(var11, var14);
                    }
                    if (var14 == ' ') {
                        if (field427 > 0) {
                            field428 += field427;
                            arg1 += field428 >> 8;
                            field428 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((field426 & 0xFF000000) != 0) {
                            this.UA(var14, arg1 + 1, var9 + 1, field426, true);
                        }
                        this.UA(var14, arg1, var9, field424, false);
                    } else {
                        if ((field426 & 0xFF000000) != 0) {
                            this.method867(var14, arg1 + 1, var9 + 1, field426, true, arg5, arg6, arg7);
                        }
                        this.method867(var14, arg1, var9, field424, false, arg5, arg6, arg7);
                    }
                    int var20 = this.field418.method12388(var14);
                    if (field421 != -1) {
                        this.field417.method485(arg1, (int) ((double) this.field418.field7175 * 0.7D) + var9, var20, field421);
                    }
                    if (field422 != -1) {
                        this.field417.method485(arg1, this.field418.field7175 + var9 + 1, var20, field422);
                    }
                    arg1 += var20;
                    var11 = var14;
                }
            }
        }
    }

    @ObfuscatedName("l.w(Ljava/lang/String;II[Lce;[I[I[II)V")
    public void method847(String arg0, int arg1, int arg2, Sprite[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        int var8 = arg2 - this.field418.field7175;
        int var9 = -1;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.length();
        for (int var13 = 0; var13 < var12; var13++) {
            char var14 = (char) (Cp1252.method2474(arg0.charAt(var13)) & 0xFF);
            if (var14 == '<') {
                var9 = var13;
            } else {
                if (var14 == '>' && var9 != -1) {
                    String var15 = arg0.substring(var9 + 1, var13);
                    var9 = -1;
                    if (var15.equals("lt")) {
                        var14 = '<';
                    } else if (var15.equals("gt")) {
                        var14 = '>';
                    } else if (var15.equals("nbsp")) {
                        var14 = 160;
                    } else if (var15.equals("shy")) {
                        var14 = 173;
                    } else if (var15.equals("times")) {
                        var14 = 215;
                    } else if (var15.equals("euro")) {
                        var14 = 8364;
                    } else if (var15.equals("copy")) {
                        var14 = 169;
                    } else {
                        if (!var15.equals("reg")) {
                            if (var15.startsWith("img=")) {
                                try {
                                    int var16;
                                    if (arg5 == null) {
                                        var16 = 0;
                                    } else {
                                        var16 = arg5[var11];
                                    }
                                    int var17;
                                    if (arg6 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg6[var11];
                                    }
                                    var11++;
                                    int var18 = StringTools.method5598(var15.substring(4));
                                    Sprite var19 = arg3[var18];
                                    int var20 = arg4 == null ? var19.method1047() : arg4[var18];
                                    var19.method1054(arg1 + var16, this.field418.field7175 + var8 - var20 + var17, 1, -1, 1);
                                    arg1 += arg3[var18].method1042();
                                    var10 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method844(var15);
                            }
                            continue;
                        }
                        var14 = 174;
                    }
                }
                if (var9 == -1) {
                    if (var10 != -1) {
                        arg1 += this.field418.method12387(var10, var14);
                    }
                    int var22;
                    if (arg5 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg5[var11];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var11];
                    }
                    var11++;
                    if (var14 != ' ') {
                        if ((field426 & 0xFF000000) != 0) {
                            this.UA(var14, arg1 + 1 + var22, var8 + 1 + var23, field426, true);
                        }
                        this.UA(var14, arg1 + var22, var8 + var23, field424, false);
                    } else if (field427 > 0) {
                        field428 += field427;
                        arg1 += field428 >> 8;
                        field428 &= 0xFF;
                    }
                    int var24 = this.field418.method12388(var14);
                    if (field421 != -1) {
                        this.field417.method485(arg1, (int) ((double) this.field418.field7175 * 0.7D) + var8, var24, field421);
                    }
                    if (field422 != -1) {
                        this.field417.method485(arg1, this.field418.field7175 + var8, var24, field422);
                    }
                    arg1 += var24;
                    var10 = var14;
                }
            }
        }
    }

    @ObfuscatedName("l.UA(CIIIZ)V")
    public abstract void UA(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @ObfuscatedName("l.b(CIIIZLta;II)V")
    public abstract void method867(char arg0, int arg1, int arg2, int arg3, boolean arg4, GraphicsRelated arg5, int arg6, int arg7);
}
