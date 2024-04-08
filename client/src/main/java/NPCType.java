import deob.ObfuscatedName;

import java.util.Arrays;

@ObfuscatedName("wq")
public class NPCType {

    @ObfuscatedName("wq.j")
    public static short[] field7209 = new short[256];

    @ObfuscatedName("wq.a")
    public NPCTypeList typeList;

    @ObfuscatedName("wq.s")
    public int field7211;

    @ObfuscatedName("wq.c")
    public String name = "null";

    @ObfuscatedName("wq.m")
    public int size = 1;

    @ObfuscatedName("wq.t")
    public int[] model;

    @ObfuscatedName("wq.l")
    public int[] headmodel;

    @ObfuscatedName("wq.f")
    public int[][] modeloffset;

    @ObfuscatedName("wq.d")
    public int bas = -1;

    @ObfuscatedName("wq.z")
    public short[] recol_s;

    @ObfuscatedName("wq.n")
    public short[] recol_d;

    @ObfuscatedName("wq.o")
    public byte[] recol_map;

    @ObfuscatedName("wq.q")
    public short[] retex_s;

    @ObfuscatedName("wq.p")
    public short[] retex_d;

    @ObfuscatedName("wq.w")
    public byte[] recolindex;

    @ObfuscatedName("wq.b")
    public byte[] retexindex;

    @ObfuscatedName("wq.x")
    public byte tiny_hue;

    @ObfuscatedName("wq.i")
    public byte tint_saturation;

    @ObfuscatedName("wq.v")
    public byte tint_lightness;

    @ObfuscatedName("wq.k")
    public byte tint_strength = 0;

    @ObfuscatedName("wq.h")
    public String[] op;

    @ObfuscatedName("wq.r")
    public int[] cursor;

    @ObfuscatedName("wq.g")
    public int attackcursor = -1;

    @ObfuscatedName("wq.y")
    public boolean visonmap = true;

    @ObfuscatedName("wq.e")
    public int vislevel = -1;

    @ObfuscatedName("wq.ay")
    public int resizeh = 128;

    @ObfuscatedName("wq.af")
    public int resizev = 128;

    @ObfuscatedName("wq.ar")
    public boolean drawabove = false;

    @ObfuscatedName("wq.an")
    public boolean drawbelow = false;

    @ObfuscatedName("wq.ap")
    public boolean follower = false;

    @ObfuscatedName("wq.ag")
    public int ambient = 0;

    @ObfuscatedName("wq.as")
    public int contrast = 0;

    @ObfuscatedName("wq.ai")
    public int headicon = -1;

    @ObfuscatedName("wq.ao")
    public int covermarker = -1;

    @ObfuscatedName("wq.al")
    public int turnspeed = 32;

    @ObfuscatedName("wq.at")
    public int[] multinpc;

    @ObfuscatedName("wq.ax")
    public int multivarbit = -1;

    @ObfuscatedName("wq.aw")
    public int multivar = -1;

    @ObfuscatedName("wq.aa")
    public boolean active = true;

    @ObfuscatedName("wq.am")
    public boolean walksmoothing = true;

    @ObfuscatedName("wq.ad")
    public boolean spotshadow = true;

    @ObfuscatedName("wq.az")
    public short spotshadowcolour_1 = 0;

    @ObfuscatedName("wq.ak")
    public short spotshadowcolour_2 = 0;

    @ObfuscatedName("wq.av")
    public byte spotshadowtrans_1 = -96;

    @ObfuscatedName("wq.aj")
    public byte spotshadowtrans_2 = -16;

    @ObfuscatedName("wq.ah")
    public byte walkflags = 0;

    @ObfuscatedName("wq.ac")
    public int bgsound = -1;

    @ObfuscatedName("wq.aq")
    public int bgsound_crawl = -1;

    @ObfuscatedName("wq.ab")
    public int bgsound_walk = -1;

    @ObfuscatedName("wq.bq")
    public int bgsound_run = -1;

    @ObfuscatedName("wq.bz")
    public int bgsound_range = 0;

    @ObfuscatedName("wq.bv")
    public int bgsound_size = 0;

    @ObfuscatedName("wq.bj")
    public int bgsound_volume = 255;

    @ObfuscatedName("wq.bf")
    public boolean field7264;

    @ObfuscatedName("wq.bt")
    public HashTable params;

    @ObfuscatedName("wq.bg")
    public int overlayheight = -1;

    @ObfuscatedName("wq.bl")
    public CompassPoint respawndir = CompassPoint.field3912;

    @ObfuscatedName("wq.bk")
    public int mapelement = -1;

    @ObfuscatedName("wq.bs")
    public int[] quests;

    @ObfuscatedName("wq.bn")
    public byte oppriority = -1;

    @ObfuscatedName("wq.ba")
    public int picksize = -1;

    @ObfuscatedName("wq.bd")
    public int bgsound_minrate = 256;

    @ObfuscatedName("wq.bc")
    public int bgsound_maxrate = 256;

    @ObfuscatedName("wq.br")
    public int picksizeshift = 0;

    @ObfuscatedName("wq.bp")
    public boolean antimacro = true;

    @ObfuscatedName("wq.u(Laet;I)V")
    public void decode(Packet buf) {
        while (true) {
            int code = buf.g1();
            if (code == 0) {
                return;
            }
            this.decode(buf, code);
        }
    }

    @ObfuscatedName("wq.j(Laet;II)V")
    public void decode(Packet buf, int code) {
        if (code == 1) {
            int count = buf.g1();
            this.model = new int[count];
            for (int i = 0; i < count; i++) {
                this.model[i] = buf.gSmart2or4null();
            }
        } else if (code == 2) {
            this.name = buf.gjstr();
        } else if (code == 12) {
            this.size = buf.g1();
        } else if (code >= 30 && code < 35) {
            this.op[code - 30] = buf.gjstr();
        } else if (code == 40) {
            int count = buf.g1();
            this.recol_s = new short[count];
            this.recol_d = new short[count];
            for (int i = 0; i < count; i++) {
                this.recol_s[i] = (short) buf.g2();
                this.recol_d[i] = (short) buf.g2();
            }
        } else if (code == 41) {
            int count = buf.g1();
            this.retex_s = new short[count];
            this.retex_d = new short[count];
            for (int i = 0; i < count; i++) {
                this.retex_s[i] = (short) buf.g2();
                this.retex_d[i] = (short) buf.g2();
            }
        } else if (code == 42) {
            int count = buf.g1();
            this.recol_map = new byte[count];
            for (int i = 0; i < count; i++) {
                this.recol_map[i] = buf.g1b();
            }
        } else if (code == 44) {
            int packed = buf.g2();
            int count = 0;
            for (int i = packed; i > 0; i >>= 0x1) {
                count++;
            }
            this.recolindex = new byte[count];
            byte indexcount = 0;
            for (int i = 0; i < count; i++) {
                if ((packed & 0x1 << i) > 0) {
                    this.recolindex[i] = indexcount++;
                } else {
                    this.recolindex[i] = -1;
                }
            }
        } else if (code == 45) {
            int packed = buf.g2();
            int count = 0;
            for (int i = packed; i > 0; i >>= 0x1) {
                count++;
            }
            this.retexindex = new byte[count];
            byte indexcount = 0;
            for (int i = 0; i < count; i++) {
                if ((packed & 0x1 << i) > 0) {
                    this.retexindex[i] = indexcount++;
                } else {
                    this.retexindex[i] = -1;
                }
            }
        } else if (code == 60) {
            int count = buf.g1();
            this.headmodel = new int[count];
            for (int i = 0; i < count; i++) {
                this.headmodel[i] = buf.gSmart2or4null();
            }
        } else if (code == 93) {
            this.visonmap = false;
        } else if (code == 95) {
            this.vislevel = buf.g2();
        } else if (code == 97) {
            this.resizeh = buf.g2();
        } else if (code == 98) {
            this.resizev = buf.g2();
        } else if (code == 99) {
            this.drawabove = true;
        } else if (code == 100) {
            this.ambient = buf.g1b();
        } else if (code == 101) {
            this.contrast = buf.g1b();
        } else if (code == 102) {
            this.headicon = buf.g2();
        } else if (code == 103) {
            this.turnspeed = buf.g2();
        } else if (code == 106 || code == 118) {
            this.multivarbit = buf.g2();
            if (this.multivarbit == 65535) {
                this.multivarbit = -1;
            }
            this.multivar = buf.g2();
            if (this.multivar == 65535) {
                this.multivar = -1;
            }
            int defaultvalue = -1;
            if (code == 118) {
                defaultvalue = buf.g2();
                if (defaultvalue == 65535) {
                    defaultvalue = -1;
                }
            }
            int count = buf.g1();
            this.multinpc = new int[count + 2];
            for (int i = 0; i <= count; i++) {
                this.multinpc[i] = buf.g2();
                if (this.multinpc[i] == 65535) {
                    this.multinpc[i] = -1;
                }
            }
            this.multinpc[count + 1] = defaultvalue;
        } else if (code == 107) {
            this.active = false;
        } else if (code == 109) {
            this.walksmoothing = false;
        } else if (code == 111) {
            this.spotshadow = false;
        } else if (code == 113) {
            this.spotshadowcolour_1 = (short) buf.g2();
            this.spotshadowcolour_2 = (short) buf.g2();
        } else if (code == 114) {
            this.spotshadowtrans_1 = buf.g1b();
            this.spotshadowtrans_2 = buf.g1b();
        } else if (code == 119) {
            this.walkflags = buf.g1b();
        } else if (code == 121) {
            this.modeloffset = new int[this.model.length][];
            int count = buf.g1();
            for (int i = 0; i < count; i++) {
                int index = buf.g1();
                int[] data = this.modeloffset[index] = new int[3];
                data[0] = buf.g1b();
                data[1] = buf.g1b();
                data[2] = buf.g1b();
            }
        } else if (code == 123) {
            this.overlayheight = buf.g2();
        } else if (code == 125) {
            this.respawndir = (CompassPoint) SerializableEnums.decode(CompassPoint.values(), buf.g1b());
        } else if (code == 127) {
            this.bas = buf.g2();
        } else if (code == 128) {
            SerializableEnums.decode(MoveSpeed.values(), buf.g1());
        } else if (code == 134) {
            this.bgsound = buf.g2();
            if (this.bgsound == 65535) {
                this.bgsound = -1;
            }
            this.bgsound_crawl = buf.g2();
            if (this.bgsound_crawl == 65535) {
                this.bgsound_crawl = -1;
            }
            this.bgsound_walk = buf.g2();
            if (this.bgsound_walk == 65535) {
                this.bgsound_walk = -1;
            }
            this.bgsound_run = buf.g2();
            if (this.bgsound_run == 65535) {
                this.bgsound_run = -1;
            }
            this.bgsound_range = buf.g1();
        } else if (code == 135 || code == 136) {
            buf.g1();
            buf.g2();
        } else if (code == 137) {
            this.attackcursor = buf.g2();
        } else if (code == 138) {
            this.covermarker = buf.gSmart2or4null();
        } else if (code == 140) {
            this.bgsound_volume = buf.g1();
        } else if (code == 141) {
            this.follower = true;
        } else if (code == 142) {
            this.mapelement = buf.g2();
        } else if (code == 143) {
            this.drawbelow = true;
        } else if (code >= 150 && code < 155) {
            this.op[code - 150] = buf.gjstr();
            if (!this.typeList.members) {
                this.op[code - 150] = null;
            }
        } else if (code == 155) {
            this.tiny_hue = buf.g1b();
            this.tint_saturation = buf.g1b();
            this.tint_lightness = buf.g1b();
            this.tint_strength = buf.g1b();
        } else if (code == 158) {
            this.oppriority = 1;
        } else if (code == 159) {
            this.oppriority = 0;
        } else if (code == 160) {
            int count = buf.g1();
            this.quests = new int[count];
            for (int i = 0; i < count; i++) {
                this.quests[i] = buf.g2();
            }
        } else if (code == 162) {
            this.field7264 = true;
        } else if (code == 163) {
            this.picksize = buf.g1();
        } else if (code == 164) {
            this.bgsound_minrate = buf.g2();
            this.bgsound_maxrate = buf.g2();
        } else if (code == 165) {
            this.picksizeshift = buf.g1();
        } else if (code == 168) {
            this.bgsound_size = buf.g1();
        } else if (code == 169) {
            this.antimacro = false;
        } else if (code >= 170 && code < 176) {
            if (this.cursor == null) {
                this.cursor = new int[6];
                Arrays.fill(this.cursor, -1);
            }
            int var29 = buf.g2();
            if (var29 == 65535) {
                var29 = -1;
            }
            this.cursor[code - 170] = var29;
        } else if (code == 249) {
            int var30 = buf.g1();
            if (this.params == null) {
                int var31 = IntMath.bitceil(var30);
                this.params = new HashTable(var31);
            }
            for (int var32 = 0; var32 < var30; var32++) {
                boolean var33 = buf.g1() == 1;
                int var34 = buf.g3();
                Node var35;
                if (var33) {
                    var35 = new ObjectNode(buf.gjstr());
                } else {
                    var35 = new IntNode(buf.g4s());
                }
                this.params.put(var35, (long) var34);
            }
        }
    }

    @ObfuscatedName("wq.a(I)V")
    public void postDecode() {
        if (this.model == null) {
            this.model = new int[0];
        }
        if (this.oppriority != -1) {
            return;
        }
        if (ModeGame.RUNESCAPE == this.typeList.game) {
            this.oppriority = 1;
        } else {
            this.oppriority = 0;
        }
    }

    @ObfuscatedName("wq.s(Lra;ILpn;Lug;Ltt;Ltt;[Ltt;[IILwf;I)Lqa;")
    public final Model getBodyModel(RendererToolkit arg0, int arg1, BASTypeList arg2, VarIntDomain arg3, AnimationNode arg4, AnimationNode arg5, AnimationNode[] arg6, int[] arg7, int arg8, NPCTypeCustomisation arg9) {
        return this.getBodyModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.bas, true);
    }

    @ObfuscatedName("wq.c(Lra;ILpn;Lug;Ltt;Ltt;[Ltt;[IILwf;IZB)Lqa;")
    public final Model getBodyModel(RendererToolkit arg0, int arg1, BASTypeList arg2, VarIntDomain arg3, AnimationNode arg4, AnimationNode arg5, AnimationNode[] arg6, int[] arg7, int arg8, NPCTypeCustomisation arg9, int arg10, boolean arg11) {
        if (this.multinpc != null) {
            NPCType var13 = this.getMultiNPC(arg3);
            return var13 == null ? null : var13.getBodyModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
        }
        int var14 = arg1;
        if (this.resizev != 128) {
            var14 = arg1 | 0x2;
        }
        if (this.resizeh != 128) {
            var14 |= 0x5;
        }
        boolean var15 = false;
        int var16 = arg6 == null ? 0 : arg6.length;
        for (int var17 = 0; var17 < var16; var17++) {
            if (arg6[var17] != null) {
                var14 |= arg6[var17].method11779();
                var15 = true;
            }
        }
        if (arg4 != null) {
            var14 |= arg4.method11779();
            var15 = true;
        }
        if (arg5 != null) {
            var14 |= arg5.method11779();
            var15 = true;
        }
        long var18 = (long) (this.field7211 | arg0.field397 << 16);
        if (arg9 != null) {
            var18 |= arg9.uid << 24;
        }
        SoftLruHashTable var20 = this.typeList.field7285;
        Model var21;
        synchronized (this.typeList.field7285) {
            var21 = (Model) this.typeList.field7285.get(var18);
        }
        BASType var23 = null;
        if (!arg11 && arg10 != -1) {
            var23 = arg2.method7784(arg10);
        } else if (this.bas != -1) {
            var23 = arg2.method7784(this.bas);
        }
        if (var21 == null || (var21.m() & var14) != var14) {
            if (var21 != null) {
                var14 |= var21.m();
            }
            int var24 = var14;
            if (this.recol_s != null) {
                var24 = var14 | 0x4000;
            }
            if (this.retex_s != null) {
                var24 |= 0x8000;
            }
            if (this.tint_strength != 0) {
                var24 |= 0x80000;
            }
            int[] var25 = arg9 == null || arg9.models == null ? this.model : arg9.models;
            boolean var26 = false;
            Js5 var27 = this.typeList.configNpcArchive;
            synchronized (this.typeList.configNpcArchive) {
                for (int var28 = 0; var28 < var25.length; var28++) {
                    if (var25[var28] != -1 && !this.typeList.configNpcArchive.loadFile(var25[var28], 0)) {
                        var26 = true;
                    }
                }
            }
            if (var26) {
                return null;
            }
            ModelUnlit[] var30 = new ModelUnlit[var25.length];
            for (int var31 = 0; var31 < var25.length; var31++) {
                if (var25[var31] != -1) {
                    Js5 var32 = this.typeList.configNpcArchive;
                    synchronized (this.typeList.configNpcArchive) {
                        var30[var31] = ModelUnlit.method2664(this.typeList.configNpcArchive, var25[var31], 0);
                    }
                    if (var30[var31] != null) {
                        if (var30[var31].field1314 < 13) {
                            var30[var31].method2634(2);
                        }
                        if (this.modeloffset != null && this.modeloffset[var31] != null) {
                            var30[var31].method2630(this.modeloffset[var31][0], this.modeloffset[var31][1], this.modeloffset[var31][2]);
                        }
                    }
                }
            }
            if (var23 != null && var23.field4716 != null) {
                for (int var34 = 0; var34 < var23.field4716.length; var34++) {
                    if (var34 < var30.length && var30[var34] != null) {
                        int var35 = 0;
                        int var36 = 0;
                        int var37 = 0;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        if (var23.field4716[var34] != null) {
                            var35 = var23.field4716[var34][0];
                            var36 = var23.field4716[var34][1];
                            var37 = var23.field4716[var34][2];
                            var38 = var23.field4716[var34][3] << 3;
                            var39 = var23.field4716[var34][4] << 3;
                            var40 = var23.field4716[var34][5] << 3;
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var30[var34].method2633(var38, var39, var40);
                        }
                        if (var35 != 0 || var36 != 0 || var37 != 0) {
                            var30[var34].method2630(var35, var36, var37);
                        }
                    }
                }
            }
            ModelUnlit var41;
            if (var30.length == 1) {
                var41 = var30[0];
            } else {
                var41 = new ModelUnlit(var30, var30.length);
            }
            var21 = arg0.createModel(var41, var24, this.typeList.field7276, this.ambient + 64, this.contrast * 5 + 850);
            if (this.recol_s != null) {
                short[] var42;
                if (arg9 == null || arg9.recol == null) {
                    var42 = this.recol_d;
                } else {
                    var42 = arg9.recol;
                }
                for (int var43 = 0; var43 < this.recol_s.length; var43++) {
                    if (this.recol_map == null || var43 >= this.recol_map.length) {
                        var21.X(this.recol_s[var43], var42[var43]);
                    } else {
                        var21.X(this.recol_s[var43], field7209[this.recol_map[var43] & 0xFF]);
                    }
                }
            }
            if (this.retex_s != null) {
                short[] var44;
                if (arg9 == null || arg9.retex == null) {
                    var44 = this.retex_d;
                } else {
                    var44 = arg9.retex;
                }
                for (int var45 = 0; var45 < this.retex_s.length; var45++) {
                    var21.W(this.retex_s[var45], var44[var45]);
                }
            }
            if (this.tint_strength != 0) {
                var21.PA(this.tiny_hue, this.tint_saturation, this.tint_lightness, this.tint_strength & 0xFF);
            }
            var21.KA(var14);
            synchronized (this.typeList.field7285) {
                this.typeList.field7285.method7937(var21, var18);
            }
        }
        Model var48 = var21.copy((byte) 4, var14, true);
        boolean var49 = false;
        if (arg7 != null) {
            for (int var50 = 0; var50 < 12; var50++) {
                if (arg7[var50] != -1) {
                    var49 = true;
                }
            }
        }
        if (!var15 && !var49) {
            return var48;
        }
        Matrix4x3[] var51 = null;
        if (var23 != null) {
            var51 = var23.method7750();
        }
        if (var49 && var51 != null) {
            for (int var52 = 0; var52 < 12; var52++) {
                if (var51[var52] != null) {
                    var48.method239(var51[var52], 0x1 << var52, true);
                }
            }
        }
        int var53 = 0;
        int var54 = 1;
        while (var53 < var16) {
            if (arg6[var53] != null) {
                arg6[var53].method11765(var48, 0, var54);
            }
            var53++;
            var54 <<= 0x1;
        }
        if (var49) {
            for (int var55 = 0; var55 < 12; var55++) {
                if (arg7[var55] != -1) {
                    int var56 = arg7[var55] - arg8;
                    int var57 = var56 & 0x3FFF;
                    Matrix4x3 var58 = new Matrix4x3();
                    var58.setToRotation(0.0F, 1.0F, 0.0F, Trig1.method5096(var57));
                    var48.method239(var58, 0x1 << var55, false);
                }
            }
        }
        if (var49 && var51 != null) {
            for (int var59 = 0; var59 < 12; var59++) {
                if (var51[var59] != null) {
                    var48.method239(var51[var59], 0x1 << var59, false);
                }
            }
        }
        if (arg4 != null && arg5 != null) {
            AnimationNode.method3537(var48, arg4, arg5);
        } else if (arg4 != null) {
            arg4.method11780(var48, 0);
        } else if (arg5 != null) {
            arg5.method11780(var48, 0);
        }
        if (this.resizeh != 128 || this.resizev != 128) {
            var48.oa(this.resizeh, this.resizev, this.resizeh);
        }
        var48.KA(arg1);
        return var48;
    }

    @ObfuscatedName("wq.m(Lra;ILug;Ltt;Lwf;B)Lqa;")
    public final Model getHeadModel(RendererToolkit arg0, int arg1, VarIntDomain arg2, AnimationNode arg3, NPCTypeCustomisation arg4) {
        if (this.multinpc != null) {
            NPCType var6 = this.getMultiNPC(arg2);
            return var6 == null ? null : var6.getHeadModel(arg0, arg1, arg2, arg3, arg4);
        }

        if (this.headmodel == null && (arg4 == null || arg4.models == null)) {
            return null;
        }

        int var7 = arg1;
        if (arg3 != null) {
            var7 = arg1 | arg3.method11779();
        }

        long var8 = (long) (this.field7211 | arg0.field397 << 16);
        if (arg4 != null) {
            var8 |= arg4.uid << 24;
        }

        Model var11;
        synchronized (this.typeList.field7283) {
            var11 = (Model) this.typeList.field7283.get(var8);
        }

        if (var11 == null || (var11.m() & var7) != var7) {
            if (var11 != null) {
                var7 |= var11.m();
            }

            int var13 = var7;
            if (this.recol_s != null) {
                var13 = var7 | 0x4000;
            }

            if (this.retex_s != null) {
                var13 |= 0x8000;
            }

            if (this.tint_strength != 0) {
                var13 |= 0x80000;
            }

            int[] var14 = arg4 == null || arg4.models == null ? this.headmodel : arg4.models;
            boolean var15 = false;
            synchronized (this.typeList.configNpcArchive) {
                int var17 = 0;
                while (true) {
                    if (var17 >= var14.length) {
                        break;
                    }
                    if (!this.typeList.configNpcArchive.loadFile(var14[var17], 0)) {
                        var15 = true;
                    }
                    var17++;
                }
            }

            if (var15) {
                return null;
            }

            ModelUnlit[] var19 = new ModelUnlit[var14.length];
            synchronized (this.typeList.configNpcArchive) {
                for (int var21 = 0; var21 < var14.length; var21++) {
                    var19[var21] = ModelUnlit.method2664(this.typeList.configNpcArchive, var14[var21], 0);
                }
            }

            for (int var23 = 0; var23 < var14.length; var23++) {
                if (var19[var23] != null && var19[var23].field1314 < 13) {
                    var19[var23].method2634(2);
                }
            }

            ModelUnlit var24;
            if (var19.length == 1) {
                var24 = var19[0];
            } else {
                var24 = new ModelUnlit(var19, var19.length);
            }

            var11 = arg0.createModel(var24, var13, this.typeList.field7276, 64, 768);
            if (this.recol_s != null) {
                short[] var25;
                if (arg4 == null || arg4.recol == null) {
                    var25 = this.recol_d;
                } else {
                    var25 = arg4.recol;
                }
                for (int var26 = 0; var26 < this.recol_s.length; var26++) {
                    if (this.recol_map == null || var26 >= this.recol_map.length) {
                        var11.X(this.recol_s[var26], var25[var26]);
                    } else {
                        var11.X(this.recol_s[var26], field7209[this.recol_map[var26] & 0xFF]);
                    }
                }
            }

            if (this.retex_s != null) {
                short[] var27;
                if (arg4 == null || arg4.retex == null) {
                    var27 = this.retex_d;
                } else {
                    var27 = arg4.retex;
                }

                for (int var28 = 0; var28 < this.retex_s.length; var28++) {
                    var11.W(this.retex_s[var28], var27[var28]);
                }
            }

            if (this.tint_strength != 0) {
                var11.PA(this.tiny_hue, this.tint_saturation, this.tint_lightness, this.tint_strength & 0xFF);
            }

            var11.KA(var7);
            synchronized (this.typeList.field7283) {
                this.typeList.field7283.method7937(var11, var8);
            }
        }

        if (arg3 != null) {
            var11 = var11.copy((byte) 1, var7, true);
            arg3.method11780(var11, 0);
        }

        var11.KA(arg1);
        return var11;
    }

    @ObfuscatedName("wq.t(I)Z")
    public final boolean method12513() {
        if (this.model == null) {
            return true;
        }
        boolean var1 = true;
        int[] var2 = this.model;
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var2[var3];
            if (!this.typeList.configNpcArchive.loadFile(var4, 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("wq.l(III)I")
    public int getIntParam(int arg0, int arg1) {
        if (this.params == null) {
            return arg1;
        } else {
            IntNode var3 = (IntNode) this.params.get((long) arg0);
            return var3 == null ? arg1 : var3.value;
        }
    }

    @ObfuscatedName("wq.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String getStringParam(int arg0, String arg1) {
        if (this.params == null) {
            return arg1;
        } else {
            ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
            return var3 == null ? arg1 : (String) var3.value;
        }
    }

    @ObfuscatedName("wq.d(Lug;I)Lwq;")
    public final NPCType getMultiNPC(VarIntDomain arg0) {
        int var2 = -1;
        if (this.multivarbit != -1) {
            var2 = arg0.getVarBit(this.multivarbit);
        } else if (this.multivar != -1) {
            var2 = arg0.garVarInt(this.multivar);
        }
        if (var2 >= 0 && var2 < this.multinpc.length - 1) {
            return this.multinpc[var2] == -1 ? null : this.typeList.get(this.multinpc[var2]);
        } else {
            int var3 = this.multinpc[this.multinpc.length - 1];
            return var3 == -1 ? null : this.typeList.get(var3);
        }
    }

    @ObfuscatedName("wq.z(Lug;B)Z")
    public boolean method12517(VarIntDomain arg0) {
        if (this.multinpc == null) {
            return true;
        }
        int var2 = -1;
        if (this.multivarbit != -1) {
            var2 = arg0.getVarBit(this.multivarbit);
        } else if (this.multivar != -1) {
            var2 = arg0.garVarInt(this.multivar);
        }
        if (var2 >= 0 && var2 < this.multinpc.length - 1) {
            return this.multinpc[var2] != -1;
        } else {
            int var3 = this.multinpc[this.multinpc.length - 1];
            return var3 != -1;
        }
    }

    @ObfuscatedName("wq.n(B)Z")
    public boolean hasSound() {
        if (this.multinpc == null) {
            return this.bgsound != -1 || this.bgsound_walk != -1 || this.bgsound_run != -1;
        }
        for (int var1 = 0; var1 < this.multinpc.length; var1++) {
            if (this.multinpc[var1] != -1) {
                NPCType var2 = this.typeList.get(this.multinpc[var1]);
                if (var2.bgsound != -1 || var2.bgsound_walk != -1 || var2.bgsound_run != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("wq.o(II)I")
    public int getCursor(int arg0) {
        return this.cursor == null ? -1 : this.cursor[arg0];
    }
}
