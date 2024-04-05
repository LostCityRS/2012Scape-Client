import deob.ObfuscatedName;

@ObfuscatedName("ahg")
public class PlayerEntity extends PathingEntity {

    @ObfuscatedName("ahg.bo")
    public String name;

    @ObfuscatedName("ahg.bh")
    public String nameUnfiltered;

    @ObfuscatedName("ahg.by")
    public String title;

    @ObfuscatedName("ahg.bu")
    public String field10042;

    @ObfuscatedName("ahg.cl")
    public byte gender = 0;

    @ObfuscatedName("ahg.cq")
    public PlayerModel model;

    @ObfuscatedName("ahg.co")
    public int field10045 = -1;

    @ObfuscatedName("ahg.cb")
    public int field10053 = -1;

    @ObfuscatedName("ahg.cm")
    public int combatLevel = 0;

    @ObfuscatedName("ahg.cw")
    public int field10048 = 0;

    @ObfuscatedName("ahg.cx")
    public int field10049 = -1;

    @ObfuscatedName("ahg.cn")
    public int field10046 = 0;

    @ObfuscatedName("ahg.cf")
    public int field10058 = -1;

    @ObfuscatedName("ahg.cs")
    public boolean field10050 = false;

    @ObfuscatedName("ahg.cr")
    public int field10061 = 0;

    @ObfuscatedName("ahg.cp")
    public int bgsound_player = -1;

    @ObfuscatedName("ahg.ci")
    public int bgsound_crawl_player = -1;

    @ObfuscatedName("ahg.ca")
    public int bgsound_walk_player = -1;

    @ObfuscatedName("ahg.ch")
    public int bgsound_run_player = -1;

    @ObfuscatedName("ahg.cv")
    public boolean field10051 = false;

    @ObfuscatedName("ahg.ck")
    public int bgsound_range = 0;

    @ObfuscatedName("ahg.cd")
    public int bgsound_volume = 255;

    @ObfuscatedName("ahg.ce")
    public int field10068;

    @ObfuscatedName("ahg.ct")
    public boolean field10062 = false;

    @ObfuscatedName("ahg.cu")
    public int field10052;

    @ObfuscatedName("ahg.cc")
    public int field10064;

    @ObfuscatedName("ahg.cg")
    public boolean field10065 = false;

    @ObfuscatedName("ahg.cj")
    public boolean visibility = false;

    @ObfuscatedName("ahg.cy")
    public boolean field10067 = false;

    @ObfuscatedName("ahg.cz")
    public final PlayerVarProvider field10055 = new PlayerVarProvider(16);

    public PlayerEntity(Scene arg0) {
        super(arg0);
    }

    public PlayerEntity(Scene arg0, int arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("ahg.gl(Laet;I)V")
    public final void getAppearance(Packet buf) {
        buf.pos = 0;
        int info = buf.g1();
        this.gender = (byte) (info & 0x1);
        boolean var3 = this.field10051;
        this.field10051 = (info & 0x2) != 0;
        boolean var4 = (info & 0x4) != 0;
        int size = super.size();
        this.setSize((info >> 3 & 0x7) + 1);
        boolean showTitle = (info & 0x40) != 0;
        boolean var7 = (info & 0x80) != 0;
        Vector3 var8 = Vector3.create(this.getTransform().trans);
        var8.x += this.size() - size << 8;
        var8.z += this.size() - size << 8;
        this.method8551(var8);
        var8.release();
        if (showTitle) {
            this.title = buf.gjstr2();
        } else {
            this.title = null;
        }
        if (var7) {
            this.field10042 = buf.gjstr2();
        } else {
            this.field10042 = null;
        }
        this.field10045 = buf.g1b();
        this.field10053 = buf.g1b();
        this.visibility = buf.g1b() == 1;
        if (Statics.field6683 == ModeWhere.LIVE && client.userStaffModLevel >= 2) {
            this.visibility = false;
        }
        int var9 = -1;
        this.field10061 = 0;
        int[] var10 = new int[Statics.wearposDefaults.field5171.length];
        ObjTypeCustomisation[] var11 = new ObjTypeCustomisation[Statics.wearposDefaults.field5171.length];
        ObjType[] var12 = new ObjType[Statics.wearposDefaults.field5171.length];
        for (int var13 = 0; var13 < Statics.wearposDefaults.field5171.length; var13++) {
            if (Statics.wearposDefaults.field5171[var13] != 1) {
                int var14 = buf.g1();
                if (var14 == 0) {
                    var10[var13] = 0;
                } else {
                    int var15 = buf.g1();
                    int var16 = (var14 << 8) + var15;
                    if (var13 == 0 && var16 == 65535) {
                        var9 = buf.gSmart2or4null();
                        this.field10061 = buf.g1();
                        break;
                    }
                    if (var16 >= 16384) {
                        int var17 = var16 - 16384;
                        var10[var13] = var17 | 0x40000000;
                        var12[var13] = Statics.objTypes.get(var17);
                        int var18 = var12[var13].field7116;
                        if (var18 != 0) {
                            this.field10061 = var18;
                        }
                    } else {
                        var10[var13] = var16 - 256 | Integer.MIN_VALUE;
                    }
                }
            }
        }
        if (var9 == -1) {
            int var19 = buf.g2();
            int var20 = 0;
            for (int var21 = 0; var21 < Statics.wearposDefaults.field5171.length; var21++) {
                if (Statics.wearposDefaults.field5171[var21] == 0) {
                    if ((var19 & 0x1 << var20) != 0) {
                        var11[var21] = ObjTypeCustomisation.method15930(var12[var21], buf);
                    }
                    var20++;
                }
            }
        }
        int[] var22 = new int[10];
        for (int var23 = 0; var23 < 10; var23++) {
            int var24 = buf.g1();
            if (Statics.field5010.length < 1 || var24 < 0 || var24 >= Statics.field5010[var23][0].length) {
                var24 = 0;
            }
            var22[var23] = var24;
        }
        this.field10068 = buf.g2();
        this.name = buf.gjstr();
        this.nameUnfiltered = this.name;
        if (Statics.localPlayerEntity == this) {
            Statics.user = this.name;
        }
        this.combatLevel = buf.g1();
        if (var4) {
            this.field10046 = buf.g2();
            if (this.field10046 == 65535) {
                this.field10046 = -1;
            }
            this.field10048 = this.combatLevel;
            this.field10049 = -1;
        } else {
            this.field10046 = 0;
            this.field10048 = buf.g1();
            this.field10049 = buf.g1();
            if (this.field10049 == 255) {
                this.field10049 = -1;
            }
        }
        int bgsound_range = this.bgsound_range;
        this.bgsound_range = buf.g1();
        if (this.bgsound_range == 0) {
            PositionedSound.method7377(this);
        } else {
            int var26 = this.bgsound_player;
            int var27 = this.bgsound_crawl_player;
            int var28 = this.bgsound_walk_player;
            int var29 = this.bgsound_run_player;
            int var30 = this.bgsound_volume;
            this.bgsound_player = buf.g2();
            this.bgsound_crawl_player = buf.g2();
            this.bgsound_walk_player = buf.g2();
            this.bgsound_run_player = buf.g2();
            this.bgsound_volume = buf.g1();
            if (this.field10051 != var3 || this.bgsound_range != bgsound_range || this.bgsound_player != var26 || this.bgsound_crawl_player != var27 || this.bgsound_walk_player != var28 || this.bgsound_run_player != var29 || this.bgsound_volume != var30) {
                PositionedSound.method1807(this);
            }
        }
        if (this.model == null) {
            this.model = new PlayerModel();
        }
        int var31 = this.model.field5006;
        int[] var32 = this.model.field5000;
        this.model.method8230(this.method13960(), var10, var11, var22, this.gender == 1, var9);
        if (var9 != var31) {
            Vector3 var33 = Vector3.create(this.getTransform().trans);
            var33.x = (this.routeWaypointX[0] << 9) + (this.size() << 8);
            var33.z = (this.routeWaypointZ[0] << 9) + (this.size() << 8);
            this.method8551(var33);
            var33.release();
        }
        if (client.currentPlayerUid == this.slot && var32 != null) {
            for (int var34 = 0; var34 < var22.length; var34++) {
                if (var22[var34] != var32[var34]) {
                    Statics.objTypes.method12297();
                    break;
                }
            }
        }
        if (this.field8640 != null) {
            this.field8640.method8100();
        }
        if (!this.field8616.method11767() || !this.field8616.field9899) {
            return;
        }
        BASType var35 = this.getBASType();
        if (!var35.method7749(this.field8616.getSeqTypeId())) {
            this.field8616.method11769(-1);
            this.field8616.field9899 = false;
        }
    }

    @ObfuscatedName("ahg.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        return null;
    }

    @ObfuscatedName("ahg.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        if (this.model == null || !this.method16119(arg0, 2048)) {
            return null;
        }
        Matrix4x3 var2 = arg0.method516();
        Matrix4x3 var3 = this.method8558();
        ScaleRotTrans var4 = this.getTransform();
        int var5 = this.field8638.method1387();
        Tile var6 = this.field9808.field4497[this.level][(int) var4.trans.x >> 9][(int) var4.trans.z >> 9];
        if (var6 == null || var6.field4552 == null) {
            this.field8604 = (int) ((float) this.field8604 - (float) this.field8604 / 10.0F);
        } else {
            int var7 = this.field8604 - var6.field4552.field10495;
            this.field8604 = (int) ((float) this.field8604 - (float) var7 / 10.0F);
        }
        var2.method5115(var3);
        var2.method5116(0.0F, (float) (-20 - this.field8604), 0.0F);
        PickableEntity var8 = null;
        this.field8650 = false;
        if (Statics.options.characterShadows.method15709() == 1) {
            BASType var9 = this.getBASType();
            if (var9.field4714 && (this.model.field5006 == -1 || Statics.npcTypes.get(this.model.field5006).field7249)) {
                AnimationNode var10 = this.field8597.method11767() && this.field8597.method11776() ? this.field8597 : null;
                EntityWalkAnimationNode var11 = this.field8616.method11767() && (!this.field8616.field9899 || var10 == null) ? this.field8616 : null;
                Model var12 = SpotShadowFactory.method1417(arg0, var5, this.field8601, this.field8644, this.field8603, 1, this.field8651[0], 0, 0, 160, 240, var11 == null ? var10 : var11);
                if (var12 != null) {
                    if (this.field9811 == null || this.field9811.length < this.field8651.length + 1) {
                        this.method15642(this.field8651.length + 1);
                    }
                    var8 = PickableEntity.method12205(true);
                    this.field8650 = true;
                    arg0.RA(false);
                    var12.method271(var2, this.field9811[this.field8651.length], 0);
                    arg0.RA(true);
                }
            }
        }
        if (Statics.localPlayerEntity == this) {
            for (int var13 = client.field8936.length - 1; var13 >= 0; var13--) {
                HintArrow var14 = client.field8936[var13];
                if (var14 != null && var14.field779 != -1) {
                    if (var14.field776 == 1) {
                        ObjectNode var15 = (ObjectNode) client.npcEntities.get((long) var14.field772);
                        if (var15 != null) {
                            NpcEntity var16 = (NpcEntity) var15.value;
                            Vector3 var17 = Vector3.method5377(var16.getTransform().trans, Statics.localPlayerEntity.getTransform().trans);
                            int var18 = (int) var17.x;
                            int var19 = (int) var17.z;
                            this.method16118(arg0, var2, this.field8651[0], (long) var18, (long) var19, var14.field779, 92160000L);
                        }
                    }
                    if (var14.field776 == 2) {
                        Vector3 var20 = Statics.localPlayerEntity.getTransform().trans;
                        long var21 = (long) (var14.field778 * 512 - (int) var20.x);
                        long var23 = (long) (var14.field777 * 512 - (int) var20.z);
                        long var25 = (long) (var14.field780 << 9);
                        long var27 = var25 * var25;
                        this.method16118(arg0, var2, this.field8651[0], var21, var23, var14.field779, var27);
                    }
                    if (var14.field776 == 10 && var14.field772 >= 0 && var14.field772 < client.players.length) {
                        PlayerEntity var29 = client.players[var14.field772];
                        if (var29 != null) {
                            Vector3 var30 = Vector3.method5377(var29.getTransform().trans, Statics.localPlayerEntity.getTransform().trans);
                            int var31 = (int) var30.x;
                            int var32 = (int) var30.z;
                            this.method16118(arg0, var2, this.field8651[0], (long) var31, (long) var32, var14.field779, 92160000L);
                        }
                    }
                }
            }
        }
        var2.method5115(var3);
        var2.method5116(0.0F, (float) (-5 - this.field8604), 0.0F);
        if (this.field9811 == null || this.field9811.length < this.field8651.length) {
            this.method15642(this.field8651.length);
        }
        if (var8 == null) {
            var8 = PickableEntity.method12205(true);
        }
        this.method14023(arg0, this.field8651, var2, false);
        for (int var33 = 0; var33 < this.field8651.length; var33++) {
            if (this.field8651[var33] != null) {
                this.field8651[var33].method271(var2, this.field9811[var33], Statics.localPlayerEntity == this ? 1 : 0);
            }
        }
        if (this.field8640 != null) {
            ParticleList var34 = this.field8640.method8112();
            arg0.method733(var34);
        }
        for (int var35 = 0; var35 < this.field8651.length; var35++) {
            if (this.field8651[var35] != null) {
                this.field8650 |= this.field8651[var35].i();
            }
            this.field8651[var35] = null;
        }
        this.field9810 = client.field9042;
        return var8;
    }

    @ObfuscatedName("ahg.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
        if (this.model == null || !this.field8613 && !this.method16119(arg0, 0)) {
            return;
        }
        Matrix4x3 var2 = arg0.method516();
        var2.method5104(this.getTransform());
        var2.method5116(0.0F, -5.0F, 0.0F);
        this.method14023(arg0, this.field8651, var2, this.field8613);
        for (int var3 = 0; var3 < this.field8651.length; var3++) {
            this.field8651[var3] = null;
        }
    }

    @ObfuscatedName("ahg.gb(Lra;Lkc;Lqa;JJIJ)V")
    public void method16118(RendererToolkit arg0, Matrix4x3 arg1, Model arg2, long arg3, long arg4, int arg5, long arg6) {
        long var11 = arg3 * arg3 + arg4 * arg4;
        if (var11 < 262144L || var11 > arg6) {
            return;
        }
        int var13 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.field8638.method1387()) & 0x3FFF;
        Model var14 = HintArrow.method8588(arg0, var13, this.field8601, this.field8644, this.field8603, arg5);
        if (var14 != null) {
            arg0.RA(false);
            var14.method271(arg1, null, 0);
            arg0.RA(true);
        }
    }

    @ObfuscatedName("ahg.go(Lra;II)Z")
    public boolean method16119(RendererToolkit arg0, int arg1) {
        int var3 = arg1;
        BASType var4 = this.getBASType();
        AnimationNode var5 = this.field8597.method11767() && !this.field8597.method11776() ? this.field8597 : null;
        EntityWalkAnimationNode var6 = !this.field8616.method11767() || this.field10050 || this.field8616.field9899 && var5 != null ? null : this.field8616;
        int var7 = var4.field4712;
        int var8 = var4.field4713;
        if (var7 != 0 || var8 != 0 || var4.field4725 != 0 || var4.field4728 != 0) {
            arg1 |= 0x7;
        }
        int var9 = this.field8638.method1387();
        boolean var10 = this.field8631 != 0 && client.loopCycle >= this.field8626 && client.loopCycle < this.field8632;
        if (var10) {
            arg1 |= 0x80000;
        }
        Model var11 = this.field8651[0] = this.model.method8244(arg0, arg1, Statics.field3769, Statics.field7650, Statics.npcTypes, Statics.objTypes, Statics.field566, Statics.field2669, var5, var6, this.field8633, this.field8654, var9, true, Statics.wearposDefaults);
        int var12 = PlayerModel.method3503();
        if (GameShell.field4152 < 96 && var12 > 50) {
            SceneManager.method16899();
        }
        if (Statics.field6683 != ModeWhere.LIVE && var12 < 50) {
            int var13 = 50 - var12;
            while (var13 > client.field8930) {
                Statics.field2391[client.field8930] = new byte[102400];
                client.field8930++;
            }
            while (var13 < client.field8930) {
                client.field8930--;
                Statics.field2391[client.field8930] = null;
            }
        } else if (Statics.field6683 != ModeWhere.LIVE) {
            Statics.field2391 = new byte[50][];
            client.field8930 = 0;
        }
        if (var11 == null) {
            return false;
        }
        this.field8622 = var11.YA();
        var11.n();
        this.method13972(var11);
        if (var7 == 0 && var8 == 0) {
            this.method13958(var9, this.size() << 9, this.size() << 9, 0, 0);
        } else {
            this.method13958(var9, var7, var8, var4.field4700, var4.field4715);
            if (this.field8601 != 0) {
                var11.t(this.field8601);
            }
            if (this.field8644 != 0) {
                var11.EA(this.field8644);
            }
            if (this.field8603 != 0) {
                var11.ia(0, this.field8603, 0);
            }
        }
        if (var10) {
            var11.PA(this.field8596, this.field8602, this.field8617, this.field8631 & 0xFF);
        }
        if (!this.field10050) {
            this.method13957(arg0, var4, var3, var7, var8, var9);
        }
        return true;
    }

    @ObfuscatedName("ahg.gi(ZI)Ljava/lang/String;")
    public String method16120(boolean arg0) {
        String var2 = "";
        if (this.title != null) {
            var2 = this.title;
        }
        String var3;
        if (arg0) {
            var3 = var2 + this.name;
        } else {
            var3 = var2 + this.nameUnfiltered;
        }
        if (this.field10042 != null) {
            var3 = var3 + this.field10042;
        }
        return var3;
    }

    @ObfuscatedName("ahg.ga(ZI)Ljava/lang/String;")
    public String method16121(boolean arg0) {
        return arg0 ? this.name : this.nameUnfiltered;
    }

    @ObfuscatedName("ahg.gs(IIBB)V")
    public final void method16131(int arg0, int arg1, byte arg2) {
        if (this.field8597.method11767() && this.field8597.method11804().field6330 == 1) {
            this.field8615 = null;
            this.field8597.method11769(-1);
        }
        for (int var4 = 0; var4 < this.spotAnims.length; var4++) {
            if (this.spotAnims[var4].field1204 != -1) {
                EffectAnimType var5 = Statics.field4213.method11082(this.spotAnims[var4].field1204);
                if (var5.field5264 && var5.field5252 != -1 && Statics.field566.method11144(var5.field5252).field6330 == 1) {
                    this.spotAnims[var4].field1203.method11769(-1);
                    this.spotAnims[var4].field1204 = -1;
                }
            }
        }
        this.field10058 = -1;
        if (arg0 < 0 || arg0 >= client.world.getSizeX() || arg1 < 0 || arg1 >= client.world.getSizeZ()) {
            this.tele(arg0, arg1);
        } else if (this.routeWaypointX[0] >= 0 && this.routeWaypointX[0] < client.world.getSizeX() && this.routeWaypointZ[0] >= 0 && this.routeWaypointZ[0] < client.world.getSizeZ()) {
            if (MoveSpeed.RUN.id == arg2) {
                client.method6031(this, arg0, arg1, MoveSpeed.RUN.id);
            }
            this.method16124(arg0, arg1, arg2);
        } else {
            this.tele(arg0, arg1);
        }
    }

    @ObfuscatedName("ahg.gd(IIB)V")
    public void tele(int arg0, int arg1) {
        this.routeLength = 0;
        this.routeLength3 = 0;
        this.field8648 = 0;
        this.routeWaypointX[0] = arg0;
        this.routeWaypointZ[0] = arg1;
        int var3 = this.size();
        Vector3 var4 = Vector3.create(this.getTransform().trans);
        var4.x = this.routeWaypointX[0] * 512 + var3 * 256;
        var4.z = this.routeWaypointZ[0] * 512 + var3 * 256;
        this.method8551(var4);
        var4.release();
        if (Statics.localPlayerEntity == this) {
            client.world.getEnvironmentManager().method8154();
        }
        if (this.field8640 != null) {
            this.field8640.method8100();
        }
    }

    @ObfuscatedName("ahg.gj(IIBI)V")
    public final void method16124(int arg0, int arg1, byte arg2) {
        if (this.routeLength < this.routeWaypointX.length - 1) {
            this.routeLength++;
        }
        for (int var4 = this.routeLength; var4 > 0; var4--) {
            this.routeWaypointX[var4] = this.routeWaypointX[var4 - 1];
            this.routeWaypointZ[var4] = this.routeWaypointZ[var4 - 1];
            this.field8645[var4] = this.field8645[var4 - 1];
        }
        this.routeWaypointX[0] = arg0;
        this.routeWaypointZ[0] = arg1;
        this.field8645[0] = arg2;
    }

    @ObfuscatedName("ahg.gu(I)Z")
    public final boolean method16125() {
        return this.model != null;
    }

    @ObfuscatedName("ahg.k(I)I")
    public int size() {
        return this.model == null || this.model.field5006 == -1 ? super.size() : Statics.npcTypes.get(this.model.field5006).size;
    }

    @ObfuscatedName("ahg.bm(I)I")
    public int method13960() {
        return this.field10068;
    }

    @ObfuscatedName("ahg.cx(I)I")
    public int method13961() {
        return -1;
    }

    @ObfuscatedName("ahg.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        if (this.model == null || !this.method16119(arg0, 131072)) {
            return false;
        }
        Matrix4x3 var4 = this.method8558();
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field8651.length; var6++) {
            if (this.field8651[var6] != null && this.field8651[var6].method272(arg1, arg2, var4, true, 0)) {
                var5 = true;
                break;
            }
        }
        for (int var7 = 0; var7 < this.field8651.length; var7++) {
            this.field8651[var7] = null;
        }
        return var5;
    }

    @ObfuscatedName("ahg.be(I)Z")
    public final boolean method12815() {
        return false;
    }

    @ObfuscatedName("ahg.bw(Lra;Laes;IIIZI)V")
    public final void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
        throw new IllegalStateException();
    }

    @ObfuscatedName("ahg.bo(B)V")
    public final void method12817() {
        throw new IllegalStateException();
    }

    @ObfuscatedName("ahg.cf(I)Z")
    public boolean method13942() {
        return Statics.field4825.field5157;
    }

    @ObfuscatedName("ahg.cs(S)Lcd;")
    public EntityChatLine method13963() {
        if (this.field8629 != null) {
            if (this.field8629.field1232 == null) {
                return null;
            }
            if (client.publicChatFilter == 0 || client.publicChatFilter == 3 || client.publicChatFilter == 1 && client.method3546(this.nameUnfiltered)) {
                return this.field8629;
            }
        }
        return null;
    }

    @ObfuscatedName("ahg.gg(Ljava/lang/String;III)V")
    public void method16127(String arg0, int arg1, int arg2) {
        this.method13998(arg0, arg1, arg2, GameShell.method2809() * Statics.field4825.field5165);
    }

    @ObfuscatedName("ahg.u(I)Ladu;")
    public CoordFine method3684() {
        CoordGrid var1 = client.world.getBase();
        return CoordFine.method8611(this.level, (int) this.getTransform().trans.x + var1.x * 512, -((int) this.getTransform().trans.y), (int) this.getTransform().trans.z + var1.z * 512);
    }

    @ObfuscatedName("ahg.j(I)Lkn;")
    public Quaternion method3680() {
        Quaternion var1 = Quaternion.method5206();
        var1.method5217(Trig1.method5096(this.field8638.field574), 0.0F, 0.0F);
        return var1;
    }

    @ObfuscatedName("ahg.a(I)Lko;")
    public Vector3 method3683() {
        return Vector3.create();
    }

    @ObfuscatedName("ahg.dk(S)I")
    public int method13970() {
        return -this.slot - 1;
    }
}
