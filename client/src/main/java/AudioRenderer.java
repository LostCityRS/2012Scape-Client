import deob.ObfuscatedName;

@ObfuscatedName("ne")
public class AudioRenderer {

    @ObfuscatedName("ne.l")
    public static int field4202 = -1;

    @ObfuscatedName("ne.f")
    public static boolean field4203 = false;

    @ObfuscatedName("ne.n")
    public static int field4205 = -1;

    @ObfuscatedName("ne.i")
    public static int field4209 = 0;

    @ObfuscatedName("ne.v")
    public static Sound[] field4195 = new Sound[50];

    @ObfuscatedName("ne.k")
    public static SynthSoundRelated13 field4196 = null;

    @ObfuscatedName("ne.h")
    public static SynthSoundRelated13 field4212 = null;

    public AudioRenderer() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mf.j(Laih;I)Laih;")
    public static MixBuss method6082(MixBuss arg0) {
        MixBuss var1 = arg0 == null ? new MixBuss() : new MixBuss(arg0);
        var1.method16283(9, 128);
        return var1;
    }

    @ObfuscatedName("wu.a(I)V")
    public static void method12701() {
        Statics.method12330();
        PcmPlayer.method6512(22050, Statics.field4961.field9676.method15891() == 1, 2);
        Statics.field5198 = PcmPlayer.method6494(Statics.field1231, 0, 22050);
        method3658(true, method6082(null));
        Statics.field3536 = PcmPlayer.method6494(Statics.field1231, 1, 2048);
        Statics.field3536.method6521(Statics.field4201);
    }

    @ObfuscatedName("fz.s(ZLaih;I)V")
    public static void method3658(boolean arg0, MixBuss arg1) {
        Statics.field5198.method6521(arg1);
        if (arg0) {
            Statics.method3612(Statics.field5104, Statics.field3156, Statics.field5197, arg1, Statics.field5198);
        }
    }

    @ObfuscatedName("os.m(I)V")
    public static void method7228() {
        VorbisRelated1.method6640();
        SoundRelated12.method5618();
        method3461();
        method15770();
    }

    @ObfuscatedName("em.t(I)V")
    public static void method3461() {
        if (Statics.field5198 != null) {
            Statics.field5198.method6496();
        }
        if (Statics.field3536 != null) {
            Statics.field3536.method6496();
        }
    }

    @ObfuscatedName("ci.l(B)V")
    public static void method2387() {
        field4195 = new Sound[50];
        field4209 = 0;
    }

    @ObfuscatedName("ay.f(I)V")
    public static final void method1677() {
        method16504();
        for (int var0 = 0; var0 < field4209; var0++) {
            Sound var1 = field4195[var0];
            boolean var2 = false;
            if (var1.field4188 == null) {
                var1.field4179--;
                if (var1.field4179 >= (var1.method6878() ? -1500 : -10)) {
                    if (var1.field4186 == 1 && var1.field4176 == null) {
                        var1.field4176 = SynthSound.method6466(Statics.field5197, var1.field4173, 0);
                        if (var1.field4176 == null) {
                            continue;
                        }
                        var1.field4179 += var1.field4176.method6462();
                    } else if (var1.method6878() && (var1.field4184 == null || var1.field4185 == null)) {
                        if (var1.field4184 == null) {
                            var1.field4184 = VorbisSound.method15066(Statics.field3156, var1.field4173);
                        }
                        if (var1.field4184 == null) {
                            continue;
                        }
                        if (var1.field4185 == null) {
                            var1.field4185 = var1.field4184.method15099();
                            if (var1.field4185 == null) {
                                continue;
                            }
                        }
                    }
                    if (var1.field4179 < 0) {
                        int var3 = 8192;
                        int var13;
                        if (var1.field4177 == 0) {
                            var13 = var1.field4181 * (var1.field4186 == 3 ? Statics.field4961.field9653.method15899() : Statics.field4961.field9654.method15899()) >> 2;
                        } else {
                            int var4 = var1.field4177 >> 24 & 0x3;
                            if (Statics.field2119.field9807 == var4) {
                                int var5 = (var1.field4177 & 0xFF) << 9;
                                int var6 = Statics.field2119.method13954() << 8;
                                Vector3 var7 = Statics.field2119.method8565().field3464;
                                int var8 = var1.field4177 >> 16 & 0xFF;
                                int var9 = (var8 << 9) + 256 - (int) var7.field3475 + var6;
                                int var10 = var1.field4177 >> 8 & 0xFF;
                                int var11 = (var10 << 9) + 256 - (int) var7.field3477 + var6;
                                int var12 = Math.abs(var9) + Math.abs(var11) - 512;
                                if (var12 > var5) {
                                    var1.field4179 = -99999;
                                    continue;
                                }
                                if (var12 < 0) {
                                    var12 = 0;
                                }
                                var13 = (var5 - var12) * Statics.field4961.field9672.method15899() * var1.field4181 / var5 >> 2;
                                if (var1.field4180 != -1) {
                                    int var14 = var1.field4180;
                                    int var15 = var1.field4187;
                                }
                                if (var9 != 0 || var11 != 0) {
                                    int var16 = -Statics.field664 - (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) - 4096 & 0x3FFF;
                                    if (var16 > 8192) {
                                        var16 = 16384 - var16;
                                    }
                                    int var17;
                                    if (var12 <= 0) {
                                        var17 = 8192;
                                    } else if (var12 >= 4096) {
                                        var17 = 16384;
                                    } else {
                                        var17 = (8192 - var12) / 4096 + 8192;
                                    }
                                    var3 = (16384 - var17 >> 1) + var16 * var17 / 8192;
                                }
                            } else {
                                var13 = 0;
                            }
                        }
                        if (var13 > 0) {
                            if (var1.field4186 == 1) {
                                Object var18 = null;
                                SynthVariableRateSoundPacket var19 = var1.field4176.method6463().method17108(Statics.field3160);
                                var1.field4188 = var19.method16502(var1.field4182, var13, var3);
                            } else if (var1.method6878()) {
                                var1.field4188 = var1.field4185.method16502(var1.field4182, var13, var3);
                            }
                            var1.field4188.method16384(var1.field4178 - 1);
                            Statics.field4201.method16452(var1.field4188);
                        }
                    }
                } else {
                    var2 = true;
                }
            } else if (!var1.field4188.method6982()) {
                var2 = true;
            }
            if (var2) {
                field4209--;
                for (int var20 = var0; var20 < field4209; var20++) {
                    field4195[var20] = field4195[var20 + 1];
                }
                var0--;
            }
        }
        if (field4203 && !SoundRelated12.method13899()) {
            if (Statics.field4961.field9674.method15899() != 0 && field4202 != -1) {
                if (Statics.field2327 == null) {
                    SoundRelated12.method3986(Statics.field9367, field4202, 0, Statics.field4961.field9674.method15899(), false);
                } else {
                    SoundRelated12.method6359(Statics.field9367, field4202, 0, Statics.field4961.field9674.method15899(), false, Statics.field2327);
                }
            }
            field4203 = false;
            Statics.field2327 = null;
        } else if (Statics.field4961.field9674.method15899() != 0 && field4202 != -1 && !SoundRelated12.method13899()) {
            ClientMessage var21 = ClientMessage.method14781(ClientProt.field2868, client.field8975.field834);
            var21.field9467.p4(field4202);
            client.field8975.method1913(var21);
            field4202 = -1;
        }
    }

    @ObfuscatedName("aat.n(IIIIIB)Lnp;")
    public static Sound method14082(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field4961.field9654.method15899() == 0 || arg1 == 0 || field4209 >= 50 || arg0 == -1) {
            return null;
        } else {
            Sound var5 = new Sound((byte) 1, arg0, arg1, arg2, arg3, 0, arg4, null);
            field4195[++field4209 - 1] = var5;
            return var5;
        }
    }

    @ObfuscatedName("d.o(IIIIIIB)Lnp;")
    public static Sound method1356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field4961.field9654.method15899() == 0 || arg1 == 0 || field4209 >= 50 || arg0 == -1) {
            return null;
        } else {
            Sound var6 = new Sound((byte) 1, arg0, arg1, arg2, arg3, arg4, arg5, null);
            field4195[++field4209 - 1] = var6;
            return var6;
        }
    }

    @ObfuscatedName("an.q(IIIIZII)Lnp;")
    public static Sound method1717(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if ((arg4 ? Statics.field4961.field9653.method15899() : Statics.field4961.field9654.method15899()) == 0 || arg1 == 0 || field4209 >= 50 || arg0 == -1) {
            return null;
        } else {
            Sound var6 = new Sound((byte) (arg4 ? 3 : 2), arg0, arg1, arg2, arg3, 0, arg5, null);
            field4195[++field4209 - 1] = var6;
            return var6;
        }
    }

    @ObfuscatedName("xh.p(IIIIIZIB)Lnp;")
    public static Sound method12739(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if ((arg5 ? Statics.field4961.field9653.method15899() : Statics.field4961.field9654.method15899()) == 0 || arg1 == 0 || field4209 >= 50 || arg0 == -1) {
            return null;
        } else {
            Sound var7 = new Sound((byte) (arg5 ? 3 : 2), arg0, arg1, arg2, arg3, arg4, arg6, null);
            field4195[++field4209 - 1] = var7;
            return var7;
        }
    }

    @ObfuscatedName("agj.w(IIIIIIII)V")
    public static void method15962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method11057(arg5, arg6, 100);
        field4212 = new SynthSoundRelated13(arg0, arg1 << 9, arg2 << 9, arg3 << 8, arg4 * 8);
    }

    @ObfuscatedName("afo.b(B)V")
    public static void method15770() {
        if (field4196 == null) {
            return;
        }
        Vector3 var0 = Vector3.method5290(Statics.field2119.method8565().field3464);
        CoordGrid var1 = client.field8980.method6214();
        var0.field3475 += var1.field4836 << 9;
        var0.field3477 += var1.field4838 << 9;
        var0.method5346((float) field4196.field4190, var0.field3476, (float) field4196.field4189);
        float var2 = var0.method5338();
        var0.method5291();
        float var3 = 0.0F;
        float var4;
        if (var2 < (float) field4196.field4191) {
            var4 = 1.0F;
        } else if (var2 > (float) field4196.field4192) {
            var4 = 0.0F;
        } else {
            float var5 = var2 - (float) field4196.field4191;
            var4 = 1.0F - var5 / (float) field4196.field4193;
        }
        SoundRelated12.method4553((int) (var4 * 256.0F));
    }

    @ObfuscatedName("ei.x(I)V")
    public static void method3225() {
        if (field4196 != null) {
            field4196 = null;
            SoundRelated12.method4553(256);
        }
    }

    @ObfuscatedName("rb.i(IIIB)V")
    public static void method11057(int arg0, int arg1, int arg2) {
        if (Statics.field4206 != null && Statics.field4206.method3000() && Statics.field4206.field1591 == arg0) {
            method4800(Statics.field4206, arg1);
            field4202 = arg0;
            Statics.field4206 = null;
            Statics.field2327 = null;
            ClientMessage var3 = ClientMessage.method14781(ClientProt.field2881, client.field8975.field834);
            var3.field9467.p4(-1);
            client.field8975.method1913(var3);
            return;
        }
        int var4 = arg1 * Statics.field4961.field9674.method15899() >> 8;
        if (arg0 == -1 && !field4203) {
            SoundRelated12.method8662();
        } else if (arg0 != -1 && (field4202 != arg0 || !SoundRelated12.method13899()) && var4 != 0 && !field4203) {
            SoundRelated12.method16250(arg2, Statics.field9367, arg0, 0, var4, false, new SoundRelated30());
            method2572();
        }
        if (field4202 != arg0) {
            Statics.field2327 = null;
        }
        field4202 = arg0;
        field4212 = null;
    }

    @ObfuscatedName("js.v(Leq;IB)V")
    public static void method4800(SoundRelated14 arg0, int arg1) {
        int var2 = arg1 * Statics.field4961.field9674.method15899() >> 8;
        if (arg0 == null) {
            SoundRelated12.method8662();
        } else {
            SoundRelated12.method7908(arg0, var2);
            method3225();
        }
    }

    @ObfuscatedName("lb.k(IIIB)V")
    public static void method5596(int arg0, int arg1, int arg2) {
        int var3 = arg2 * Statics.field4961.field9674.method15899() >> 8;
        if (var3 == 0 || arg0 == -1) {
            return;
        }
        if (!field4203 && field4202 != -1 && SoundRelated12.method13899() && !SoundRelated12.method15138()) {
            Statics.field2327 = SoundRelated12.method7705();
            method3225();
            MixBuss var4 = method6082(Statics.field2327);
            method3658(true, var4);
        }
        SoundRelated12.method3986(Statics.field1509, arg0, 0, var3, false);
        SoundRelated12.method11835(-1, 255);
        field4203 = true;
    }

    @ObfuscatedName("ic.h(IIB)I")
    public static int method4688(int arg0, int arg1) {
        double var2 = Math.log((double) arg1) / Math.log(2.0D);
        double var4 = Math.log((double) arg0) / Math.log(2.0D);
        double var6 = Math.random() * (var2 - var4) + var4;
        return (int) (Math.pow(2.0D, var6) + 0.5D);
    }

    @ObfuscatedName("nc.r(B)V")
    public static void method6849() {
        for (int var0 = 0; var0 < field4209; var0++) {
            Sound var1 = field4195[var0];
            if (var1.field4186 == 3) {
                Statics.method15704(var1);
            }
        }
    }

    @ObfuscatedName("cj.y(I)V")
    public static void method2572() {
        SoundRelated12.method11835(-1, 255);
    }

    @ObfuscatedName("t.e(IIB)V")
    public static void method1349(int arg0, int arg1) {
        SoundRelated12.method11835(arg0, arg1);
    }

    @ObfuscatedName("ls.ay(II)V")
    public static void method5712(int arg0) {
        ClientMessage var1 = ClientMessage.method14781(ClientProt.field2881, client.field8975.field834);
        var1.field9467.p4(-1);
        client.field8975.method1913(var1);
        Statics.field4206 = new SoundRelated14(Statics.field9367, arg0);
    }

    @ObfuscatedName("aip.af(I)V")
    public static void method16504() {
        if (Statics.field4206 != null && !Statics.field4206.method3000() && Statics.field4206.method2999()) {
            ClientMessage var0 = ClientMessage.method14781(ClientProt.field2881, client.field8975.field834);
            var0.field9467.p4(Statics.field4206.field1591);
            client.field8975.method1913(var0);
        }
    }
}
