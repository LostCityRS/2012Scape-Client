import deob.ObfuscatedName;

@ObfuscatedName("adg")
public class PositionedSound extends Node {

    @ObfuscatedName("adg.s")
    public int field9520;

    @ObfuscatedName("adg.m")
    public static IterableQueue field9514 = new IterableQueue();

    @ObfuscatedName("adg.t")
    public static IterableQueue field9528 = new IterableQueue();

    @ObfuscatedName("adg.l")
    public static IterableMap field9516 = new IterableMap(16);

    @ObfuscatedName("adg.f")
    public int field9517;

    @ObfuscatedName("adg.d")
    public int field9518;

    @ObfuscatedName("adg.z")
    public int field9547;

    @ObfuscatedName("adg.n")
    public int field9519;

    @ObfuscatedName("adg.o")
    public int field9521;

    @ObfuscatedName("adg.q")
    public int field9522;

    @ObfuscatedName("adg.p")
    public int field9523;

    @ObfuscatedName("adg.w")
    public int field9546;

    @ObfuscatedName("adg.b")
    public LocType field9525;

    @ObfuscatedName("adg.x")
    public NpcEntity field9527;

    @ObfuscatedName("adg.i")
    public PlayerEntity field9513;

    @ObfuscatedName("adg.y")
    public int field9534 = 0;

    @ObfuscatedName("adg.e")
    public boolean field9530;

    @ObfuscatedName("adg.ay")
    public int field9524;

    @ObfuscatedName("adg.af")
    public int field9532;

    @ObfuscatedName("adg.ar")
    public int field9536;

    @ObfuscatedName("adg.an")
    public boolean field9537;

    @ObfuscatedName("adg.ap")
    public VorbisSound field9538;

    @ObfuscatedName("adg.ag")
    public VariableRateSoundPacket field9539;

    @ObfuscatedName("adg.as")
    public SoundStream field9540;

    @ObfuscatedName("adg.ai")
    public int field9535;

    @ObfuscatedName("adg.ao")
    public int[] field9543;

    @ObfuscatedName("adg.al")
    public boolean field9544;

    @ObfuscatedName("adg.at")
    public VorbisSound field9545;

    @ObfuscatedName("adg.ax")
    public VariableRateSoundPacket field9542;

    @ObfuscatedName("adg.aw")
    public int field9526;

    @ObfuscatedName("adg.aa")
    public SoundStream field9548;

    @ObfuscatedName("mp.u(ZI)V")
    public static void method6259(boolean arg0) {
        for (PositionedSound var1 = (PositionedSound) field9514.method11563(); var1 != null; var1 = (PositionedSound) field9514.method11567()) {
            if (var1.field9540 != null) {
                Statics.field4201.method16445(var1.field9540);
                var1.field9540 = null;
            }
            if (var1.field9548 != null) {
                Statics.field4201.method16445(var1.field9548);
                var1.field9548 = null;
            }
            var1.method6979();
        }
        if (!arg0) {
            return;
        }
        for (PositionedSound var2 = (PositionedSound) field9528.method11563(); var2 != null; var2 = (PositionedSound) field9528.method11567()) {
            if (var2.field9540 != null) {
                Statics.field4201.method16445(var2.field9540);
                var2.field9540 = null;
            }
            var2.method6979();
        }
        for (PositionedSound var3 = (PositionedSound) field9516.method11928(); var3 != null; var3 = (PositionedSound) field9516.method11929()) {
            if (var3.field9540 != null) {
                Statics.field4201.method16445(var3.field9540);
                var3.field9540 = null;
            }
            var3.method6979();
        }
    }

    @ObfuscatedName("vf.j(I)V")
    public static void method12174() {
        for (PositionedSound var0 = (PositionedSound) field9514.method11563(); var0 != null; var0 = (PositionedSound) field9514.method11567()) {
            if (var0.field9530) {
                var0.method15106();
            }
        }
        for (PositionedSound var1 = (PositionedSound) field9528.method11563(); var1 != null; var1 = (PositionedSound) field9528.method11567()) {
            if (var1.field9530) {
                var1.method15106();
            }
        }
    }

    @ObfuscatedName("adg.a(I)V")
    public void method15106() {
        int var1 = this.field9536;
        boolean var2 = this.field9537;
        if (this.field9525 != null) {
            LocType var3 = this.field9525.method11431(client.field8988 == 0 ? CutsceneManager.field1538 : Statics.field2669);
            if (var3 == null) {
                this.field9536 = -1;
                this.field9537 = false;
                this.field9523 = 0;
                this.field9546 = 0;
                this.field9520 = 0;
                this.field9535 = 0;
                this.field9543 = null;
                this.field9544 = false;
                this.field9532 = 256;
                this.field9524 = 256;
                this.field9522 = 0;
            } else {
                this.field9536 = var3.field6547;
                this.field9537 = var3.field6520;
                this.field9523 = var3.field6531 << 9;
                this.field9546 = var3.bgsound_volume;
                this.field9520 = var3.field6476;
                this.field9535 = var3.field6536;
                this.field9543 = var3.field6484;
                this.field9544 = var3.field6540;
                this.field9532 = var3.field6507;
                this.field9524 = var3.field6546;
            }
        } else if (this.field9527 != null) {
            int var4 = method5936(this.field9527);
            if (var1 != var4) {
                this.field9536 = var4;
                NPCType var5 = this.field9527.field10075;
                if (var5.field7244 != null) {
                    var5 = var5.method12516(Statics.field2669);
                }
                if (var5 == null) {
                    this.field9522 = 0;
                    this.field9523 = 0;
                    this.field9546 = 0;
                    this.field9537 = this.field9527.field10075.field7264;
                    this.field9532 = 256;
                    this.field9524 = 256;
                } else {
                    this.field9523 = var5.field7261 << 9;
                    this.field9522 = var5.field7262 << 9;
                    this.field9546 = var5.bgsound_volume;
                    this.field9537 = var5.field7264;
                    this.field9532 = var5.field7273;
                    this.field9524 = var5.field7250;
                }
            }
        } else if (this.field9513 != null) {
            this.field9536 = method11761(this.field9513);
            this.field9537 = this.field9513.field10051;
            this.field9523 = this.field9513.field10039 << 9;
            this.field9522 = 0;
            this.field9546 = this.field9513.bgsound_volume;
            this.field9532 = 256;
            this.field9524 = 256;
        }
        if ((this.field9536 != var1 || this.field9537 != var2) && this.field9540 != null) {
            Statics.field4201.method16445(this.field9540);
            this.field9540 = null;
            this.field9539 = null;
            this.field9538 = null;
        }
    }

    @ObfuscatedName("acn.s(IIIILtg;Lahs;Lahg;I)V")
    public static void method14954(int arg0, int arg1, int arg2, int arg3, LocType arg4, NpcEntity arg5, PlayerEntity arg6) {
        PositionedSound var7 = new PositionedSound();
        var7.field9517 = arg0;
        var7.field9518 = arg1 << 9;
        var7.field9519 = arg2 << 9;
        if (arg4 != null) {
            var7.field9525 = arg4;
            int var8 = arg4.field6489;
            int var9 = arg4.field6503;
            if (arg3 == 1 || arg3 == 3) {
                var8 = arg4.field6503;
                var9 = arg4.field6489;
            }
            var7.field9547 = arg1 + var8 << 9;
            var7.field9521 = arg2 + var9 << 9;
            var7.field9536 = arg4.field6547;
            var7.field9537 = arg4.field6520;
            var7.field9523 = arg4.field6531 << 9;
            var7.field9546 = arg4.bgsound_volume;
            var7.field9520 = arg4.field6476;
            var7.field9535 = arg4.field6536;
            var7.field9543 = arg4.field6484;
            var7.field9544 = arg4.field6540;
            var7.field9532 = arg4.field6507;
            var7.field9524 = arg4.field6546;
            var7.field9522 = arg4.field6532 << 9;
            if (arg4.field6534 != null) {
                var7.field9530 = true;
                var7.method15106();
            }
            if (var7.field9543 != null) {
                var7.field9526 = var7.field9520 + (int) (Math.random() * (double) (var7.field9535 - var7.field9520));
            }
            field9514.method11558(var7);
        } else if (arg5 != null) {
            var7.field9527 = arg5;
            NPCType var10 = arg5.field10075;
            if (var10.field7244 != null) {
                var7.field9530 = true;
                var10 = var10.method12516(Statics.field2669);
            }
            if (var10 != null) {
                var7.field9547 = var10.field7213 + arg1 << 9;
                var7.field9521 = var10.field7213 + arg2 << 9;
                var7.field9536 = method5936(arg5);
                var7.field9537 = var10.field7264;
                var7.field9523 = var10.field7261 << 9;
                var7.field9546 = var10.bgsound_volume;
                var7.field9532 = var10.field7273;
                var7.field9524 = var10.field7250;
                var7.field9522 = var10.field7262 << 9;
            }
            field9528.method11558(var7);
        } else if (arg6 != null) {
            var7.field9513 = arg6;
            var7.field9547 = arg1 + arg6.method13954() << 9;
            var7.field9521 = arg2 + arg6.method13954() << 9;
            var7.field9536 = method11761(arg6);
            var7.field9537 = arg6.field10051;
            var7.field9523 = arg6.field10039 << 9;
            var7.field9546 = arg6.bgsound_volume;
            var7.field9532 = 256;
            var7.field9524 = 256;
            var7.field9522 = 0;
            field9516.method11927(var7, (long) arg6.localPlayerIndex);
        }
    }

    @ObfuscatedName("z.c(IIILtg;I)V")
    public static void method1370(int arg0, int arg1, int arg2, LocType arg3) {
        for (PositionedSound var4 = (PositionedSound) field9514.method11563(); var4 != null; var4 = (PositionedSound) field9514.method11567()) {
            if (var4.field9517 == arg0 && arg1 << 9 == var4.field9518 && arg2 << 9 == var4.field9519 && var4.field9525.field6474 == arg3.field6474) {
                if (var4.field9540 != null) {
                    Statics.field4201.method16445(var4.field9540);
                    var4.field9540 = null;
                }
                if (var4.field9548 != null) {
                    Statics.field4201.method16445(var4.field9548);
                    var4.field9548 = null;
                }
                var4.method6979();
                return;
            }
        }
    }

    @ObfuscatedName("cu.m(Lahs;I)V")
    public static void method2547(NpcEntity arg0) {
        for (PositionedSound var1 = (PositionedSound) field9528.method11563(); var1 != null; var1 = (PositionedSound) field9528.method11567()) {
            if (var1.field9527 == arg0) {
                if (var1.field9540 != null) {
                    Statics.field4201.method16445(var1.field9540);
                    var1.field9540 = null;
                }
                var1.method6979();
                return;
            }
        }
    }

    @ObfuscatedName("ot.t(Lahg;S)V")
    public static void method7377(PlayerEntity arg0) {
        PositionedSound var1 = (PositionedSound) field9516.method11923((long) arg0.localPlayerIndex);
        if (var1 == null) {
            return;
        }
        if (var1.field9540 != null) {
            Statics.field4201.method16445(var1.field9540);
            var1.field9540 = null;
        }
        var1.method6979();
    }

    @ObfuscatedName("ao.l(Lahg;I)V")
    public static void method1807(PlayerEntity arg0) {
        PositionedSound var1 = (PositionedSound) field9516.method11923((long) arg0.localPlayerIndex);
        if (var1 == null) {
            method14954(arg0.level, arg0.routeWaypointX[0], arg0.routeWaypointZ[0], 0, null, null, arg0);
        } else {
            var1.method15106();
        }
    }

    @ObfuscatedName("lt.f(Lahs;I)I")
    public static int method5936(NpcEntity arg0) {
        NPCType var1 = arg0.field10075;
        if (var1.field7244 != null) {
            var1 = var1.method12516(Statics.field2669);
            if (var1 == null) {
                return -1;
            }
        }
        int var2 = var1.field7223;
        BASType var3 = arg0.method13959();
        int var4 = arg0.field8616.method11812();
        if (var4 == -1 || arg0.field8616.field9899) {
            var2 = var1.field7257;
        } else if (var3.field4710 == var4 || var3.field4699 == var4 || var3.field4701 == var4 || var3.field4726 == var4) {
            var2 = var1.field7260;
        } else if (var3.field4702 == var4 || var3.field4692 == var4 || var3.field4705 == var4 || var3.field4697 == var4) {
            var2 = var1.field7258;
        }
        return var2;
    }

    @ObfuscatedName("tv.d(Lahg;I)I")
    public static int method11761(PlayerEntity arg0) {
        int var1 = arg0.field10056;
        BASType var2 = arg0.method13959();
        int var3 = arg0.field8616.method11812();
        if (var3 == -1 || arg0.field8616.field9899) {
            var1 = arg0.field10054;
        } else if (var2.field4710 == var3 || var2.field4699 == var3 || var2.field4701 == var3 || var2.field4726 == var3) {
            var1 = arg0.field10057;
        } else if (var2.field4702 == var3 || var2.field4692 == var3 || var2.field4705 == var3 || var2.field4697 == var3) {
            var1 = arg0.field10059;
        }
        return var1;
    }

    @ObfuscatedName("lr.z(IIIII)V")
    public static void method6033(int arg0, int arg1, int arg2, int arg3) {
        for (PositionedSound var4 = (PositionedSound) field9514.method11563(); var4 != null; var4 = (PositionedSound) field9514.method11567()) {
            method4977(var4, arg0, arg1, arg2, arg3);
        }
        for (PositionedSound var5 = (PositionedSound) field9528.method11563(); var5 != null; var5 = (PositionedSound) field9528.method11567()) {
            byte var6 = 1;
            BASType var7 = var5.field9527.method13959();
            int var8 = var5.field9527.field8616.method11812();
            if (var8 == -1 || var5.field9527.field8616.field9899) {
                var6 = 0;
            } else if (var7.field4710 == var8 || var7.field4699 == var8 || var7.field4701 == var8 || var7.field4726 == var8) {
                var6 = 2;
            } else if (var7.field4702 == var8 || var7.field4692 == var8 || var7.field4705 == var8 || var7.field4697 == var8) {
                var6 = 3;
            }
            if (var5.field9534 != var6) {
                int var9 = method5936(var5.field9527);
                NPCType var10 = var5.field9527.field10075;
                if (var10.field7244 != null) {
                    var10 = var10.method12516(Statics.field2669);
                }
                if (var10 == null || var9 == -1) {
                    var5.field9536 = -1;
                    var5.field9537 = false;
                    var5.field9534 = var6;
                } else if (var5.field9536 == var9 && var5.field9537 == var10.field7264) {
                    var5.field9534 = var6;
                    var5.field9546 = var10.bgsound_volume;
                } else {
                    boolean var11 = false;
                    if (var5.field9540 == null) {
                        var11 = true;
                    } else {
                        var5.field9546 -= 512;
                        if (var5.field9546 <= 0) {
                            Statics.field4201.method16445(var5.field9540);
                            var5.field9540 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var5.field9546 = var10.bgsound_volume;
                        var5.field9539 = null;
                        var5.field9538 = null;
                        var5.field9536 = var9;
                        var5.field9537 = var10.field7264;
                        var5.field9534 = var6;
                    }
                }
            }
            Vector3 var12 = var5.field9527.getTransform().trans;
            var5.field9518 = (int) var12.x;
            var5.field9547 = (int) var12.x + (var5.field9527.method13954() << 8);
            var5.field9519 = (int) var12.z;
            var5.field9521 = (int) var12.z + (var5.field9527.method13954() << 8);
            var5.field9517 = var5.field9527.level;
            method4977(var5, arg0, arg1, arg2, arg3);
        }
        for (PositionedSound var13 = (PositionedSound) field9516.method11928(); var13 != null; var13 = (PositionedSound) field9516.method11929()) {
            byte var14 = 1;
            BASType var15 = var13.field9513.method13959();
            int var16 = var13.field9513.field8616.method11812();
            if (var16 == -1 || var13.field9513.field8616.field9899) {
                var14 = 0;
            } else if (var15.field4710 == var16 || var15.field4699 == var16 || var15.field4701 == var16 || var15.field4726 == var16) {
                var14 = 2;
            } else if (var15.field4702 == var16 || var15.field4692 == var16 || var15.field4705 == var16 || var15.field4697 == var16) {
                var14 = 3;
            }
            if (var13.field9534 != var14) {
                int var17 = method11761(var13.field9513);
                if (var13.field9536 == var17 && var13.field9513.field10051 == var13.field9537) {
                    var13.field9546 = var13.field9513.bgsound_volume;
                    var13.field9534 = var14;
                } else {
                    boolean var18 = false;
                    if (var13.field9540 == null) {
                        var18 = true;
                    } else {
                        var13.field9546 -= 512;
                        if (var13.field9546 <= 0) {
                            Statics.field4201.method16445(var13.field9540);
                            var13.field9540 = null;
                            var18 = true;
                        }
                    }
                    if (var18) {
                        var13.field9546 = var13.field9513.bgsound_volume;
                        var13.field9539 = null;
                        var13.field9538 = null;
                        var13.field9536 = var17;
                        var13.field9537 = var13.field9513.field10051;
                        var13.field9534 = var14;
                    }
                }
            }
            Vector3 var19 = var13.field9513.getTransform().trans;
            var13.field9518 = (int) var19.x;
            var13.field9547 = (int) var19.x + (var13.field9513.method13954() << 8);
            var13.field9519 = (int) var19.z;
            var13.field9521 = (int) var19.z + (var13.field9513.method13954() << 8);
            var13.field9517 = var13.field9513.level;
            method4977(var13, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("kh.n(Ladg;IIIII)V")
    public static void method4977(PositionedSound arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field9536 == -1 && arg0.field9543 == null) {
            return;
        }
        int var5 = 0;
        int var6 = arg0.field9546 * 512 * Statics.clientOptions.field9672.method15899() >> 8;
        if (arg2 > arg0.field9547) {
            var5 += arg2 - arg0.field9547;
        } else if (arg2 < arg0.field9518) {
            var5 += arg0.field9518 - arg2;
        }
        if (arg3 > arg0.field9521) {
            var5 += arg3 - arg0.field9521;
        } else if (arg3 < arg0.field9519) {
            var5 += arg0.field9519 - arg3;
        }
        if (arg0.field9523 == 0 || var5 - 256 > arg0.field9523 || Statics.clientOptions.field9672.method15899() == 0 || arg0.field9517 != arg1) {
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
        int var7 = arg0.field9523 - arg0.field9522;
        if (var7 < 0) {
            var7 = arg0.field9523;
        }
        int var8 = var6;
        int var9 = var5 - arg0.field9522;
        if (var9 > 0 && var7 > 0) {
            var8 = (var7 - var9) * var6 / var7;
        }
        Statics.localPlayerEntity.method13954();
        int var10 = 8192;
        int var11 = (arg0.field9547 + arg0.field9518) / 2 - arg2;
        int var12 = (arg0.field9521 + arg0.field9519) / 2 - arg3;
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
        } else if (arg0.field9536 >= 0) {
            int var15 = arg0.field9532 == 256 && arg0.field9524 == 256 ? 256 : AudioRenderer.method4688(arg0.field9524, arg0.field9532);
            if (arg0.field9537) {
                if (arg0.field9538 == null) {
                    arg0.field9538 = VorbisSound.method15066(Statics.field3156, arg0.field9536);
                }
                if (arg0.field9538 != null) {
                    if (arg0.field9539 == null) {
                        arg0.field9539 = arg0.field9538.method15099();
                    }
                    if (arg0.field9539 != null) {
                        VariableRateSoundStream var16 = (VariableRateSoundStream) arg0.field9539.method16502(var15, var8 << 6, var10);
                        var16.method16384(-1);
                        Statics.field4201.method16452(var16);
                        arg0.field9540 = var16;
                    }
                }
            } else {
                SynthSound var17 = SynthSound.method6466(Statics.field5197, arg0.field9536, 0);
                if (var17 != null) {
                    SynthVariableRateSoundPacket var18 = var17.method6463().method17108(Statics.field3160);
                    SoundStreamRelated1 var19 = (SoundStreamRelated1) var18.method16502(var15, var8 << 6, var10);
                    var19.method16384(-1);
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
        } else if (arg0.field9543 != null && (arg0.field9526 -= arg4) <= 0) {
            int var20 = arg0.field9532 == 256 && arg0.field9524 == 256 ? 256 : (int) (Math.random() * (double) (arg0.field9532 - arg0.field9524)) + arg0.field9524;
            if (arg0.field9544) {
                if (arg0.field9545 == null) {
                    int var21 = (int) (Math.random() * (double) arg0.field9543.length);
                    arg0.field9545 = VorbisSound.method15066(Statics.field3156, arg0.field9543[var21]);
                }
                if (arg0.field9545 != null) {
                    if (arg0.field9542 == null) {
                        arg0.field9542 = arg0.field9545.method15099();
                    }
                    if (arg0.field9542 != null) {
                        VariableRateSoundStream var22 = (VariableRateSoundStream) arg0.field9542.method16502(var20, var8 << 6, var10);
                        var22.method16384(0);
                        Statics.field4201.method16452(var22);
                        arg0.field9548 = var22;
                        arg0.field9526 = arg0.field9520 + (int) (Math.random() * (double) (arg0.field9535 - arg0.field9520));
                    }
                }
            } else {
                int var23 = (int) (Math.random() * (double) arg0.field9543.length);
                SynthSound var24 = SynthSound.method6466(Statics.field5197, arg0.field9543[var23], 0);
                if (var24 != null) {
                    SynthVariableRateSoundPacket var25 = var24.method6463().method17108(Statics.field3160);
                    SoundStreamRelated1 var26 = (SoundStreamRelated1) var25.method16502(var20, var8 << 6, var10);
                    var26.method16384(0);
                    Statics.field4201.method16452(var26);
                    arg0.field9548 = var26;
                    arg0.field9526 = arg0.field9520 + (int) (Math.random() * (double) (arg0.field9535 - arg0.field9520));
                }
            }
        }
    }
}
