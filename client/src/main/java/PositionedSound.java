import deob.ObfuscatedName;

@ObfuscatedName("adg")
public class PositionedSound extends Node {

    @ObfuscatedName("adg.s")
    public int mindelay;

    @ObfuscatedName("adg.m")
    public static IterableQueue field9514 = new IterableQueue();

    @ObfuscatedName("adg.t")
    public static IterableQueue field9528 = new IterableQueue();

    @ObfuscatedName("adg.l")
    public static IterableMap field9516 = new IterableMap(16);

    @ObfuscatedName("adg.f")
    public int level;

    @ObfuscatedName("adg.d")
    public int minX;

    @ObfuscatedName("adg.z")
    public int maxX;

    @ObfuscatedName("adg.n")
    public int minZ;

    @ObfuscatedName("adg.o")
    public int maxZ;

    @ObfuscatedName("adg.q")
    public int size;

    @ObfuscatedName("adg.p")
    public int range;

    @ObfuscatedName("adg.w")
    public int volume;

    @ObfuscatedName("adg.b")
    public LocType loc;

    @ObfuscatedName("adg.x")
    public NpcEntity npc;

    @ObfuscatedName("adg.i")
    public PlayerEntity player;

    @ObfuscatedName("adg.y")
    public int field9534 = 0;

    @ObfuscatedName("adg.e")
    public boolean multi;

    @ObfuscatedName("adg.ay")
    public int minspeed;

    @ObfuscatedName("adg.af")
    public int maxspeed;

    @ObfuscatedName("adg.ar")
    public int sound;

    @ObfuscatedName("adg.an")
    public boolean field9537;

    @ObfuscatedName("adg.ap")
    public VorbisSound field9538;

    @ObfuscatedName("adg.ag")
    public VariableRateSoundPacket field9539;

    @ObfuscatedName("adg.as")
    public SoundAudioBuss field9540;

    @ObfuscatedName("adg.ai")
    public int maxdelay;

    @ObfuscatedName("adg.ao")
    public int[] sounds;

    @ObfuscatedName("adg.al")
    public boolean field9544;

    @ObfuscatedName("adg.at")
    public VorbisSound field9545;

    @ObfuscatedName("adg.ax")
    public VariableRateSoundPacket field9542;

    @ObfuscatedName("adg.aw")
    public int delay;

    @ObfuscatedName("adg.aa")
    public SoundAudioBuss field9548;

    @ObfuscatedName("mp.u(ZI)V")
    public static void method6259(boolean arg0) {
        for (PositionedSound var1 = (PositionedSound) field9514.last(); var1 != null; var1 = (PositionedSound) field9514.prev()) {
            if (var1.field9540 != null) {
                Statics.field4201.method16445(var1.field9540);
                var1.field9540 = null;
            }
            if (var1.field9548 != null) {
                Statics.field4201.method16445(var1.field9548);
                var1.field9548 = null;
            }
            var1.remove();
        }
        if (!arg0) {
            return;
        }
        for (PositionedSound var2 = (PositionedSound) field9528.last(); var2 != null; var2 = (PositionedSound) field9528.prev()) {
            if (var2.field9540 != null) {
                Statics.field4201.method16445(var2.field9540);
                var2.field9540 = null;
            }
            var2.remove();
        }
        for (PositionedSound var3 = (PositionedSound) field9516.method11928(); var3 != null; var3 = (PositionedSound) field9516.method11929()) {
            if (var3.field9540 != null) {
                Statics.field4201.method16445(var3.field9540);
                var3.field9540 = null;
            }
            var3.remove();
        }
    }

    @ObfuscatedName("vf.j(I)V")
    public static void method12174() {
        for (PositionedSound var0 = (PositionedSound) field9514.last(); var0 != null; var0 = (PositionedSound) field9514.prev()) {
            if (var0.multi) {
                var0.computeProperties();
            }
        }
        for (PositionedSound var1 = (PositionedSound) field9528.last(); var1 != null; var1 = (PositionedSound) field9528.prev()) {
            if (var1.multi) {
                var1.computeProperties();
            }
        }
    }

    @ObfuscatedName("adg.a(I)V")
    public void computeProperties() {
        int var1 = this.sound;
        boolean var2 = this.field9537;
        if (this.loc != null) {
            LocType var3 = this.loc.getMultiLoc(client.field8988 == 0 ? CutsceneManager.field1538 : Statics.field2669);
            if (var3 == null) {
                this.sound = -1;
                this.field9537 = false;
                this.range = 0;
                this.volume = 0;
                this.mindelay = 0;
                this.maxdelay = 0;
                this.sounds = null;
                this.field9544 = false;
                this.maxspeed = 256;
                this.minspeed = 256;
                this.size = 0;
            } else {
                this.sound = var3.bgsound_sound;
                this.field9537 = var3.field6520;
                this.range = var3.bgsound_range << 9;
                this.volume = var3.bgsound_volume;
                this.mindelay = var3.bgsound_mindelay;
                this.maxdelay = var3.bgsound_maxdelay;
                this.sounds = var3.bgsound_random;
                this.field9544 = var3.field6540;
                this.maxspeed = var3.bgsound_maxrate;
                this.minspeed = var3.bgsound_minrate;
            }
        } else if (this.npc != null) {
            int var4 = method5936(this.npc);
            if (var1 != var4) {
                this.sound = var4;
                NPCType var5 = this.npc.type;
                if (var5.multinpc != null) {
                    var5 = var5.getMultiNPC(Statics.field2669);
                }
                if (var5 == null) {
                    this.size = 0;
                    this.range = 0;
                    this.volume = 0;
                    this.field9537 = this.npc.type.field7264;
                    this.maxspeed = 256;
                    this.minspeed = 256;
                } else {
                    this.range = var5.bgsound_range << 9;
                    this.size = var5.bgsound_size << 9;
                    this.volume = var5.bgsound_volume;
                    this.field9537 = var5.field7264;
                    this.maxspeed = var5.bgsound_maxrate;
                    this.minspeed = var5.bgsound_minrate;
                }
            }
        } else if (this.player != null) {
            this.sound = getPlayerSound(this.player);
            this.field9537 = this.player.field10051;
            this.range = this.player.bgsound_range << 9;
            this.size = 0;
            this.volume = this.player.bgsound_volume;
            this.maxspeed = 256;
            this.minspeed = 256;
        }
        if ((this.sound != var1 || this.field9537 != var2) && this.field9540 != null) {
            Statics.field4201.method16445(this.field9540);
            this.field9540 = null;
            this.field9539 = null;
            this.field9538 = null;
        }
    }

    @ObfuscatedName("acn.s(IIIILtg;Lahs;Lahg;I)V")
    public static void add(int arg0, int arg1, int arg2, int arg3, LocType arg4, NpcEntity arg5, PlayerEntity arg6) {
        PositionedSound var7 = new PositionedSound();
        var7.level = arg0;
        var7.minX = arg1 << 9;
        var7.minZ = arg2 << 9;
        if (arg4 != null) {
            var7.loc = arg4;
            int var8 = arg4.width;
            int var9 = arg4.length;
            if (arg3 == 1 || arg3 == 3) {
                var8 = arg4.length;
                var9 = arg4.width;
            }
            var7.maxX = arg1 + var8 << 9;
            var7.maxZ = arg2 + var9 << 9;
            var7.sound = arg4.bgsound_sound;
            var7.field9537 = arg4.field6520;
            var7.range = arg4.bgsound_range << 9;
            var7.volume = arg4.bgsound_volume;
            var7.mindelay = arg4.bgsound_mindelay;
            var7.maxdelay = arg4.bgsound_maxdelay;
            var7.sounds = arg4.bgsound_random;
            var7.field9544 = arg4.field6540;
            var7.maxspeed = arg4.bgsound_maxrate;
            var7.minspeed = arg4.bgsound_minrate;
            var7.size = arg4.bgsound_size << 9;
            if (arg4.multiloc != null) {
                var7.multi = true;
                var7.computeProperties();
            }
            if (var7.sounds != null) {
                var7.delay = var7.mindelay + (int) (Math.random() * (double) (var7.maxdelay - var7.mindelay));
            }
            field9514.addFirst(var7);
        } else if (arg5 != null) {
            var7.npc = arg5;
            NPCType var10 = arg5.type;
            if (var10.multinpc != null) {
                var7.multi = true;
                var10 = var10.getMultiNPC(Statics.field2669);
            }
            if (var10 != null) {
                var7.maxX = var10.field7213 + arg1 << 9;
                var7.maxZ = var10.field7213 + arg2 << 9;
                var7.sound = method5936(arg5);
                var7.field9537 = var10.field7264;
                var7.range = var10.bgsound_range << 9;
                var7.volume = var10.bgsound_volume;
                var7.maxspeed = var10.bgsound_maxrate;
                var7.minspeed = var10.bgsound_minrate;
                var7.size = var10.bgsound_size << 9;
            }
            field9528.addFirst(var7);
        } else if (arg6 != null) {
            var7.player = arg6;
            var7.maxX = arg1 + arg6.size() << 9;
            var7.maxZ = arg2 + arg6.size() << 9;
            var7.sound = getPlayerSound(arg6);
            var7.field9537 = arg6.field10051;
            var7.range = arg6.bgsound_range << 9;
            var7.volume = arg6.bgsound_volume;
            var7.maxspeed = 256;
            var7.minspeed = 256;
            var7.size = 0;
            field9516.put(var7, (long) arg6.localPlayerIndex);
        }
    }

    @ObfuscatedName("z.c(IIILtg;I)V")
    public static void method1370(int arg0, int arg1, int arg2, LocType arg3) {
        for (PositionedSound var4 = (PositionedSound) field9514.last(); var4 != null; var4 = (PositionedSound) field9514.prev()) {
            if (var4.level == arg0 && arg1 << 9 == var4.minX && arg2 << 9 == var4.minZ && var4.loc.field6474 == arg3.field6474) {
                if (var4.field9540 != null) {
                    Statics.field4201.method16445(var4.field9540);
                    var4.field9540 = null;
                }
                if (var4.field9548 != null) {
                    Statics.field4201.method16445(var4.field9548);
                    var4.field9548 = null;
                }
                var4.remove();
                return;
            }
        }
    }

    @ObfuscatedName("cu.m(Lahs;I)V")
    public static void method2547(NpcEntity arg0) {
        for (PositionedSound var1 = (PositionedSound) field9528.last(); var1 != null; var1 = (PositionedSound) field9528.prev()) {
            if (var1.npc == arg0) {
                if (var1.field9540 != null) {
                    Statics.field4201.method16445(var1.field9540);
                    var1.field9540 = null;
                }
                var1.remove();
                return;
            }
        }
    }

    @ObfuscatedName("ot.t(Lahg;S)V")
    public static void method7377(PlayerEntity arg0) {
        PositionedSound var1 = (PositionedSound) field9516.getNode((long) arg0.localPlayerIndex);
        if (var1 == null) {
            return;
        }
        if (var1.field9540 != null) {
            Statics.field4201.method16445(var1.field9540);
            var1.field9540 = null;
        }
        var1.remove();
    }

    @ObfuscatedName("ao.l(Lahg;I)V")
    public static void method1807(PlayerEntity arg0) {
        PositionedSound var1 = (PositionedSound) field9516.getNode((long) arg0.localPlayerIndex);
        if (var1 == null) {
            add(arg0.level, arg0.routeWaypointX[0], arg0.routeWaypointZ[0], 0, null, null, arg0);
        } else {
            var1.computeProperties();
        }
    }

    @ObfuscatedName("lt.f(Lahs;I)I")
    public static int method5936(NpcEntity arg0) {
        NPCType var1 = arg0.type;
        if (var1.multinpc != null) {
            var1 = var1.getMultiNPC(Statics.field2669);
            if (var1 == null) {
                return -1;
            }
        }
        int var2 = var1.bgsound_walk;
        BASType var3 = arg0.getBASType();
        int var4 = arg0.field8616.getSeqTypeId();
        if (var4 == -1 || arg0.field8616.field9899) {
            var2 = var1.bgsound;
        } else if (var3.field4710 == var4 || var3.field4699 == var4 || var3.field4701 == var4 || var3.field4726 == var4) {
            var2 = var1.bgsound_run;
        } else if (var3.field4702 == var4 || var3.field4692 == var4 || var3.field4705 == var4 || var3.field4697 == var4) {
            var2 = var1.bgsound_crawl;
        }
        return var2;
    }

    @ObfuscatedName("tv.d(Lahg;I)I")
    public static int getPlayerSound(PlayerEntity arg0) {
        int var1 = arg0.bgsound_walk_player;
        BASType var2 = arg0.getBASType();
        int var3 = arg0.field8616.getSeqTypeId();
        if (var3 == -1 || arg0.field8616.field9899) {
            var1 = arg0.bgsound_player;
        } else if (var2.field4710 == var3 || var2.field4699 == var3 || var2.field4701 == var3 || var2.field4726 == var3) {
            var1 = arg0.bgsound_run_player;
        } else if (var2.field4702 == var3 || var2.field4692 == var3 || var2.field4705 == var3 || var2.field4697 == var3) {
            var1 = arg0.bgsound_crawl_player;
        }
        return var1;
    }

    @ObfuscatedName("lr.z(IIIII)V")
    public static void method6033(int arg0, int arg1, int arg2, int arg3) {
        for (PositionedSound var4 = (PositionedSound) field9514.last(); var4 != null; var4 = (PositionedSound) field9514.prev()) {
            method4977(var4, arg0, arg1, arg2, arg3);
        }
        for (PositionedSound var5 = (PositionedSound) field9528.last(); var5 != null; var5 = (PositionedSound) field9528.prev()) {
            byte var6 = 1;
            BASType var7 = var5.npc.getBASType();
            int var8 = var5.npc.field8616.getSeqTypeId();
            if (var8 == -1 || var5.npc.field8616.field9899) {
                var6 = 0;
            } else if (var7.field4710 == var8 || var7.field4699 == var8 || var7.field4701 == var8 || var7.field4726 == var8) {
                var6 = 2;
            } else if (var7.field4702 == var8 || var7.field4692 == var8 || var7.field4705 == var8 || var7.field4697 == var8) {
                var6 = 3;
            }
            if (var5.field9534 != var6) {
                int var9 = method5936(var5.npc);
                NPCType var10 = var5.npc.type;
                if (var10.multinpc != null) {
                    var10 = var10.getMultiNPC(Statics.field2669);
                }
                if (var10 == null || var9 == -1) {
                    var5.sound = -1;
                    var5.field9537 = false;
                    var5.field9534 = var6;
                } else if (var5.sound == var9 && var5.field9537 == var10.field7264) {
                    var5.field9534 = var6;
                    var5.volume = var10.bgsound_volume;
                } else {
                    boolean var11 = false;
                    if (var5.field9540 == null) {
                        var11 = true;
                    } else {
                        var5.volume -= 512;
                        if (var5.volume <= 0) {
                            Statics.field4201.method16445(var5.field9540);
                            var5.field9540 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var5.volume = var10.bgsound_volume;
                        var5.field9539 = null;
                        var5.field9538 = null;
                        var5.sound = var9;
                        var5.field9537 = var10.field7264;
                        var5.field9534 = var6;
                    }
                }
            }
            Vector3 var12 = var5.npc.getTransform().trans;
            var5.minX = (int) var12.x;
            var5.maxX = (int) var12.x + (var5.npc.size() << 8);
            var5.minZ = (int) var12.z;
            var5.maxZ = (int) var12.z + (var5.npc.size() << 8);
            var5.level = var5.npc.level;
            method4977(var5, arg0, arg1, arg2, arg3);
        }
        for (PositionedSound var13 = (PositionedSound) field9516.method11928(); var13 != null; var13 = (PositionedSound) field9516.method11929()) {
            byte var14 = 1;
            BASType var15 = var13.player.getBASType();
            int var16 = var13.player.field8616.getSeqTypeId();
            if (var16 == -1 || var13.player.field8616.field9899) {
                var14 = 0;
            } else if (var15.field4710 == var16 || var15.field4699 == var16 || var15.field4701 == var16 || var15.field4726 == var16) {
                var14 = 2;
            } else if (var15.field4702 == var16 || var15.field4692 == var16 || var15.field4705 == var16 || var15.field4697 == var16) {
                var14 = 3;
            }
            if (var13.field9534 != var14) {
                int var17 = getPlayerSound(var13.player);
                if (var13.sound == var17 && var13.player.field10051 == var13.field9537) {
                    var13.volume = var13.player.bgsound_volume;
                    var13.field9534 = var14;
                } else {
                    boolean var18 = false;
                    if (var13.field9540 == null) {
                        var18 = true;
                    } else {
                        var13.volume -= 512;
                        if (var13.volume <= 0) {
                            Statics.field4201.method16445(var13.field9540);
                            var13.field9540 = null;
                            var18 = true;
                        }
                    }
                    if (var18) {
                        var13.volume = var13.player.bgsound_volume;
                        var13.field9539 = null;
                        var13.field9538 = null;
                        var13.sound = var17;
                        var13.field9537 = var13.player.field10051;
                        var13.field9534 = var14;
                    }
                }
            }
            Vector3 var19 = var13.player.getTransform().trans;
            var13.minX = (int) var19.x;
            var13.maxX = (int) var19.x + (var13.player.size() << 8);
            var13.minZ = (int) var19.z;
            var13.maxZ = (int) var19.z + (var13.player.size() << 8);
            var13.level = var13.player.level;
            method4977(var13, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("kh.n(Ladg;IIIII)V")
    public static void method4977(PositionedSound arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.sound == -1 && arg0.sounds == null) {
            return;
        }
        int var5 = 0;
        int var6 = arg0.volume * 512 * Statics.options.field9672.method15899() >> 8;
        if (arg2 > arg0.maxX) {
            var5 += arg2 - arg0.maxX;
        } else if (arg2 < arg0.minX) {
            var5 += arg0.minX - arg2;
        }
        if (arg3 > arg0.maxZ) {
            var5 += arg3 - arg0.maxZ;
        } else if (arg3 < arg0.minZ) {
            var5 += arg0.minZ - arg3;
        }
        if (arg0.range == 0 || var5 - 256 > arg0.range || Statics.options.field9672.method15899() == 0 || arg0.level != arg1) {
            if (arg0.field9540 != null) {
                Statics.field4201.method16445(arg0.field9540);
                arg0.field9540 = null;
                arg0.field9539 = null;
                arg0.field9538 = null;
            }
            if (arg0.field9548 != null) {
                Statics.field4201.method16445(arg0.field9548);
                arg0.field9548 = null;
                arg0.field9545 = null;
                arg0.field9542 = null;
            }
            return;
        }
        var5 -= 256;
        if (var5 < 0) {
            var5 = 0;
        }
        int var7 = arg0.range - arg0.size;
        if (var7 < 0) {
            var7 = arg0.range;
        }
        int var8 = var6;
        int var9 = var5 - arg0.size;
        if (var9 > 0 && var7 > 0) {
            var8 = (var7 - var9) * var6 / var7;
        }
        Statics.localPlayerEntity.size();
        int var10 = 8192;
        int var11 = (arg0.maxX + arg0.minX) / 2 - arg2;
        int var12 = (arg0.maxZ + arg0.minZ) / 2 - arg3;
        if (var11 != 0 || var12 != 0) {
            int var13 = -Statics.cameraYaw - (int) (Math.atan2((double) var11, (double) var12) * 2607.5945876176133D) - 4096 & 0x3FFF;
            if (var13 > 8192) {
                var13 = 16384 - var13;
            }
            int var14;
            if (var5 <= 0) {
                var14 = 8192;
            } else if (var5 >= 4096) {
                var14 = 16384;
            } else {
                var14 = var5 * 8192 / 4096 + 8192;
            }
            var10 = (16384 - var14 >> 1) + var13 * var14 / 8192;
        }
        if (arg0.field9540 != null) {
            arg0.field9540.method16402(var8);
            arg0.field9540.method16387(var10);
        } else if (arg0.sound >= 0) {
            int var15 = arg0.maxspeed == 256 && arg0.minspeed == 256 ? 256 : AudioRenderer.method4688(arg0.minspeed, arg0.maxspeed);
            if (arg0.field9537) {
                if (arg0.field9538 == null) {
                    arg0.field9538 = VorbisSound.method15066(Statics.field3156, arg0.sound);
                }
                if (arg0.field9538 != null) {
                    if (arg0.field9539 == null) {
                        arg0.field9539 = arg0.field9538.method15099();
                    }
                    if (arg0.field9539 != null) {
                        VariableRateSoundStream var16 = (VariableRateSoundStream) arg0.field9539.create(var15, var8 << 6, var10);
                        var16.setLoops(-1);
                        Statics.field4201.method16452(var16);
                        arg0.field9540 = var16;
                    }
                }
            } else {
                SynthSound var17 = SynthSound.method6466(Statics.field5197, arg0.sound, 0);
                if (var17 != null) {
                    SynthVariableRateSoundPacket var18 = var17.toSoundPacket().method17108(Statics.field3160);
                    SoundAudioBus_Sub1 var19 = (SoundAudioBus_Sub1) var18.create(var15, var8 << 6, var10);
                    var19.setLoops(-1);
                    Statics.field4201.method16452(var19);
                    arg0.field9540 = var19;
                }
            }
        }
        if (arg0.field9548 != null) {
            arg0.field9548.method16402(var8);
            arg0.field9548.method16387(var10);
            if (!arg0.field9548.method6982()) {
                arg0.field9548 = null;
                arg0.field9545 = null;
                arg0.field9542 = null;
            }
        } else if (arg0.sounds != null && (arg0.delay -= arg4) <= 0) {
            int var20 = arg0.maxspeed == 256 && arg0.minspeed == 256 ? 256 : (int) (Math.random() * (double) (arg0.maxspeed - arg0.minspeed)) + arg0.minspeed;
            if (arg0.field9544) {
                if (arg0.field9545 == null) {
                    int var21 = (int) (Math.random() * (double) arg0.sounds.length);
                    arg0.field9545 = VorbisSound.method15066(Statics.field3156, arg0.sounds[var21]);
                }
                if (arg0.field9545 != null) {
                    if (arg0.field9542 == null) {
                        arg0.field9542 = arg0.field9545.method15099();
                    }
                    if (arg0.field9542 != null) {
                        VariableRateSoundStream var22 = (VariableRateSoundStream) arg0.field9542.create(var20, var8 << 6, var10);
                        var22.setLoops(0);
                        Statics.field4201.method16452(var22);
                        arg0.field9548 = var22;
                        arg0.delay = arg0.mindelay + (int) (Math.random() * (double) (arg0.maxdelay - arg0.mindelay));
                    }
                }
            } else {
                int var23 = (int) (Math.random() * (double) arg0.sounds.length);
                SynthSound var24 = SynthSound.method6466(Statics.field5197, arg0.sounds[var23], 0);
                if (var24 != null) {
                    SynthVariableRateSoundPacket var25 = var24.toSoundPacket().method17108(Statics.field3160);
                    SoundAudioBus_Sub1 var26 = (SoundAudioBus_Sub1) var25.create(var20, var8 << 6, var10);
                    var26.setLoops(0);
                    Statics.field4201.method16452(var26);
                    arg0.field9548 = var26;
                    arg0.delay = arg0.mindelay + (int) (Math.random() * (double) (arg0.maxdelay - arg0.mindelay));
                }
            }
        }
    }
}
