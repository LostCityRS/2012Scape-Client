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

    @ObfuscatedName("fj.u(Lls;Lls;Lls;Laih;Lmg;I)Z")
    public static boolean method3612(Js5 midiInstruments, Js5 vorbis, Js5 synthSounds, MidiAudioBuss arg3, AudioChannel musicChannel) {
        Statics.field1586 = midiInstruments;
        Statics.field1580 = vorbis;
        Statics.field1581 = synthSounds;
        Statics.field1735 = arg3;
        Statics.field4165 = musicChannel;
        Statics.field4559 = new int[16];
        for (int var5 = 0; var5 < 16; var5++) {
            Statics.field4559[var5] = 255;
        }
        return true;
    }

    @ObfuscatedName("mf.j(Laih;I)Laih;")
    public static MidiAudioBuss method6082(MidiAudioBuss arg0) {
        MidiAudioBuss var1 = arg0 == null ? new MidiAudioBuss() : new MidiAudioBuss(arg0);
        var1.method16283(9, 128);
        return var1;
    }

    @ObfuscatedName("wu.a(I)V")
    public static void method12701() {
        Statics.method12330();
        AudioChannel.init(22050, client.options.stereo.getValue() == 1, 2);
        Statics.musicChannel = AudioChannel.create(GameShell.canvas, 0, 22050);
        method3658(true, method6082(null));
        Statics.soundChannel = AudioChannel.create(GameShell.canvas, 1, 2048);
        Statics.soundChannel.setStream(Statics.soundStream);
    }

    @ObfuscatedName("fz.s(ZLaih;I)V")
    public static void method3658(boolean arg0, MidiAudioBuss arg1) {
        Statics.musicChannel.setStream(arg1);
        if (arg0) {
            method3612(Statics.midiInstruments, Statics.vorbis, Statics.synthSounds, arg1, Statics.musicChannel);
        }
    }

    @ObfuscatedName("os.m(I)V")
    public static void method7228() {
        VorbisPlayer.loop();
        MidiPlayer.loop();
        method3461();
        method15770();
    }

    @ObfuscatedName("em.t(I)V")
    public static void method3461() {
        if (Statics.musicChannel != null) {
            Statics.musicChannel.update();
        }
        if (Statics.soundChannel != null) {
            Statics.soundChannel.update();
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
                        var1.field4176 = SynthSound.method6466(Statics.synthSounds, var1.field4173, 0);
                        if (var1.field4176 == null) {
                            continue;
                        }
                        var1.field4179 += var1.field4176.getStart();
                    } else if (var1.method6878() && (var1.field4184 == null || var1.field4185 == null)) {
                        if (var1.field4184 == null) {
                            var1.field4184 = VorbisSound.method15066(Statics.vorbis, var1.field4173);
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
                            var13 = var1.field4181 * (var1.field4186 == 3 ? client.options.volumeSpeech.getValue() : client.options.volumeMainEffects.getValue()) >> 2;
                        } else {
                            int var4 = var1.field4177 >> 24 & 0x3;
                            if (Statics.localPlayerEntity.level == var4) {
                                int var5 = (var1.field4177 & 0xFF) << 9;
                                int var6 = Statics.localPlayerEntity.size() << 8;
                                Vector3 var7 = Statics.localPlayerEntity.getTransform().trans;
                                int var8 = var1.field4177 >> 16 & 0xFF;
                                int var9 = (var8 << 9) + 256 - (int) var7.x + var6;
                                int var10 = var1.field4177 >> 8 & 0xFF;
                                int var11 = (var10 << 9) + 256 - (int) var7.z + var6;
                                int var12 = Math.abs(var9) + Math.abs(var11) - 512;
                                if (var12 > var5) {
                                    var1.field4179 = -99999;
                                    continue;
                                }
                                if (var12 < 0) {
                                    var12 = 0;
                                }
                                var13 = (var5 - var12) * client.options.volumeBackgroundEffects.getValue() * var1.field4181 / var5 >> 2;
                                if (var1.field4180 != -1) {
                                    int var14 = var1.field4180;
                                    int var15 = var1.field4187;
                                }
                                if (var9 != 0 || var11 != 0) {
                                    int var16 = -client.cameraYaw - (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) - 4096 & 0x3FFF;
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
                                SynthSoundPacket var19 = var1.field4176.toSoundPacket().method17108(Statics.field3160);
                                var1.field4188 = var19.create(var1.field4182, var13, var3);
                            } else if (var1.method6878()) {
                                var1.field4188 = var1.field4185.create(var1.field4182, var13, var3);
                            }
                            var1.field4188.setLoops(var1.field4178 - 1);
                            Statics.soundStream.addSubStream(var1.field4188);
                        }
                    }
                } else {
                    var2 = true;
                }
            } else if (!var1.field4188.isLinked()) {
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
        if (field4203 && !MidiPlayer.method13899()) {
            if (client.options.volumeMainMusic.getValue() != 0 && field4202 != -1) {
                if (Statics.field2327 == null) {
                    MidiPlayer.method3986(Statics.midiSongs, field4202, 0, client.options.volumeMainMusic.getValue(), false);
                } else {
                    MidiPlayer.method6359(Statics.midiSongs, field4202, 0, client.options.volumeMainMusic.getValue(), false, Statics.field2327);
                }
            }
            field4203 = false;
            Statics.field2327 = null;
        } else if (client.options.volumeMainMusic.getValue() != 0 && field4202 != -1 && !MidiPlayer.method13899()) {
            ClientMessage var21 = ClientMessage.createMessage(ClientProt.field2868, client.gameConnection.randomOut);
            var21.buf.p4(field4202);
            client.gameConnection.queue(var21);
            field4202 = -1;
        }
    }

    @ObfuscatedName("aat.n(IIIIIB)Lnp;")
    public static Sound method14082(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (client.options.volumeMainEffects.getValue() == 0 || arg1 == 0 || field4209 >= 50 || arg0 == -1) {
            return null;
        } else {
            Sound var5 = new Sound((byte) 1, arg0, arg1, arg2, arg3, 0, arg4, null);
            field4195[++field4209 - 1] = var5;
            return var5;
        }
    }

    @ObfuscatedName("d.o(IIIIIIB)Lnp;")
    public static Sound method1356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (client.options.volumeMainEffects.getValue() == 0 || arg1 == 0 || field4209 >= 50 || arg0 == -1) {
            return null;
        } else {
            Sound var6 = new Sound((byte) 1, arg0, arg1, arg2, arg3, arg4, arg5, null);
            field4195[++field4209 - 1] = var6;
            return var6;
        }
    }

    @ObfuscatedName("an.q(IIIIZII)Lnp;")
    public static Sound method1717(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if ((arg4 ? client.options.volumeSpeech.getValue() : client.options.volumeMainEffects.getValue()) == 0 || arg1 == 0 || field4209 >= 50 || arg0 == -1) {
            return null;
        } else {
            Sound var6 = new Sound((byte) (arg4 ? 3 : 2), arg0, arg1, arg2, arg3, 0, arg5, null);
            field4195[++field4209 - 1] = var6;
            return var6;
        }
    }

    @ObfuscatedName("xh.p(IIIIIZIB)Lnp;")
    public static Sound method12739(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if ((arg5 ? client.options.volumeSpeech.getValue() : client.options.volumeMainEffects.getValue()) == 0 || arg1 == 0 || field4209 >= 50 || arg0 == -1) {
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
        Vector3 var0 = Vector3.create(Statics.localPlayerEntity.getTransform().trans);
        CoordGrid var1 = client.world.getBase();
        var0.x += var1.x << 9;
        var0.z += var1.z << 9;
        var0.method5346((float) field4196.field4190, var0.y, (float) field4196.field4189);
        float var2 = var0.method5338();
        var0.release();
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
        MidiPlayer.method4553((int) (var4 * 256.0F));
    }

    @ObfuscatedName("ei.x(I)V")
    public static void method3225() {
        if (field4196 != null) {
            field4196 = null;
            MidiPlayer.method4553(256);
        }
    }

    @ObfuscatedName("rb.i(IIIB)V")
    public static void method11057(int arg0, int arg1, int arg2) {
        if (Statics.field4206 != null && Statics.field4206.method3000() && Statics.field4206.field1591 == arg0) {
            method4800(Statics.field4206, arg1);
            field4202 = arg0;
            Statics.field4206 = null;
            Statics.field2327 = null;
            ClientMessage var3 = ClientMessage.createMessage(ClientProt.field2881, client.gameConnection.randomOut);
            var3.buf.p4(-1);
            client.gameConnection.queue(var3);
        } else {
            int var4 = arg1 * client.options.volumeMainMusic.getValue() >> 8;
            if (arg0 == -1 && !field4203) {
                MidiPlayer.method8662();
            } else if (arg0 != -1 && (field4202 != arg0 || !MidiPlayer.method13899()) && var4 != 0 && !field4203) {
                MidiPlayer.method16250(arg2, Statics.midiSongs, arg0, 0, var4, false, new MidiSoundRelated3_Sub1());
                method2572();
            }
            if (field4202 != arg0) {
                Statics.field2327 = null;
            }
            field4202 = arg0;
            field4212 = null;
        }
    }

    @ObfuscatedName("js.v(Leq;IB)V")
    public static void method4800(MidiSoundRelated4 arg0, int arg1) {
        int var2 = arg1 * client.options.volumeMainMusic.getValue() >> 8;
        if (arg0 == null) {
            MidiPlayer.method8662();
        } else {
            MidiPlayer.method7908(arg0, var2);
            method3225();
        }
    }

    @ObfuscatedName("lb.k(IIIB)V")
    public static void method5596(int arg0, int arg1, int arg2) {
        int var3 = arg2 * client.options.volumeMainMusic.getValue() >> 8;
        if (var3 == 0 || arg0 == -1) {
            return;
        }
        if (!field4203 && field4202 != -1 && MidiPlayer.method13899() && !MidiPlayer.method15138()) {
            Statics.field2327 = MidiPlayer.method7705();
            method3225();
            MidiAudioBuss var4 = method6082(Statics.field2327);
            method3658(true, var4);
        }
        MidiPlayer.method3986(Statics.field1509, arg0, 0, var3, false);
        MidiPlayer.method11835(-1, 255);
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
        MidiPlayer.method11835(-1, 255);
    }

    @ObfuscatedName("t.e(IIB)V")
    public static void method1349(int arg0, int arg1) {
        MidiPlayer.method11835(arg0, arg1);
    }

    @ObfuscatedName("ls.ay(II)V")
    public static void method5712(int arg0) {
        ClientMessage var1 = ClientMessage.createMessage(ClientProt.field2881, client.gameConnection.randomOut);
        var1.buf.p4(-1);
        client.gameConnection.queue(var1);
        Statics.field4206 = new MidiSoundRelated4(Statics.midiSongs, arg0);
    }

    @ObfuscatedName("aip.af(I)V")
    public static void method16504() {
        if (Statics.field4206 != null && !Statics.field4206.method3000() && Statics.field4206.method2999()) {
            ClientMessage var0 = ClientMessage.createMessage(ClientProt.field2881, client.gameConnection.randomOut);
            var0.buf.p4(Statics.field4206.field1591);
            client.gameConnection.queue(var0);
        }
    }
}
