import deob.ObfuscatedName;

@ObfuscatedName("ahs")
public class NpcEntity extends PathingEntity {

    @ObfuscatedName("ahs.bo")
    public NPCType type;

    @ObfuscatedName("ahs.bh")
    public int field10080 = -1;

    @ObfuscatedName("ahs.by")
    public int field10070 = -1;

    @ObfuscatedName("ahs.bu")
    public NPCTypeCustomisation field10073;

    @ObfuscatedName("ahs.cl")
    public static int field10076 = 1;

    @ObfuscatedName("ahs.cq")
    public static int field10074 = 1;

    @ObfuscatedName("ahs.co")
    public int field10069 = -1;

    @ObfuscatedName("ahs.cb")
    public int vislevel;

    @ObfuscatedName("ahs.cm")
    public String name;

    @ObfuscatedName("ahs.cw")
    public final NpcVarProvider field10078 = new NpcVarProvider(32);

    @ObfuscatedName("ahs.cx")
    public int[] field10079 = new int[6];

    @ObfuscatedName("ahs.cn")
    public int[] field10071 = new int[6];

    @ObfuscatedName("ahs.cf")
    public int field10081;

    @ObfuscatedName("ahs.cs")
    public int field10082;

    @ObfuscatedName("ahs.cr")
    public int field10083;

    @ObfuscatedName("ahs.cp")
    public int field10084;

    public NpcEntity(Scene arg0) {
        super(arg0);
        this.method16160();
    }

    public NpcEntity(Scene arg0, int arg1) {
        super(arg0, arg1);
        this.method16160();
    }

    @ObfuscatedName("ahs.gl(I)V")
    public void method16160() {
        this.field10081 = (int) (Math.random() * 4.0D) + 32;
        this.field10082 = (int) (Math.random() * 2.0D) + 3;
        this.field10083 = (int) (Math.random() * 3.0D) + 16;
        if (Statics.options.field9659.method15686() == 1) {
            this.field10084 = (int) (Math.random() * 6.0D);
        } else {
            this.field10084 = (int) (Math.random() * 12.0D);
        }
    }

    @ObfuscatedName("ahs.gb(Lwq;I)V")
    public void method16149(NPCType arg0) {
        if (this.type != arg0 && MiniMenu.open && MiniMenu.method11169(this.localPlayerIndex)) {
            MiniMenu.close();
        }
        this.type = arg0;
        if (this.type != null) {
            this.name = this.type.name;
            this.vislevel = this.type.field7233;
        }
        if (this.field8640 != null) {
            this.field8640.method8100();
        }
    }

    @ObfuscatedName("ahs.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        return null;
    }

    @ObfuscatedName("ahs.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        if (this.type == null || !this.method16151(arg0, 526336)) {
            return null;
        }
        Matrix4x3 var2 = this.method8558();
        ScaleRotTrans var3 = this.getTransform();
        Matrix4x3 var4 = arg0.method516();
        int var5 = this.field8638.method1387();
        Tile var6 = this.field9808.field4497[this.level][(int) var3.trans.x >> 9][(int) var3.trans.z >> 9];
        if (var6 == null || var6.field4552 == null) {
            this.field8604 = (int) ((float) this.field8604 - (float) this.field8604 / 10.0F);
        } else {
            int var7 = this.field8604 - var6.field4552.field10495;
            this.field8604 = (int) ((float) this.field8604 - (float) var7 / 10.0F);
        }
        var4.method5115(var2);
        var4.method5116(0.0F, (float) (-20 - this.field8604), 0.0F);
        BASType var8 = this.getBASType();
        NPCType var9 = this.type.multinpc == null ? this.type : this.type.getMultiNPC(Statics.field2669);
        this.field8650 = false;
        PickableEntity var10 = null;
        if (Statics.options.field9658.method15709() == 1 && var9.field7249 && var8.field4714) {
            AnimationNode var11 = this.field8597.method11767() && this.field8597.method11776() ? this.field8597 : null;
            EntityWalkAnimationNode var12 = this.field8616.method11767() && (!this.field8616.field9899 || var11 == null) ? this.field8616 : null;
            Model var13 = SpotShadowFactory.method1417(arg0, var5, this.field8601, this.field8644, this.field8603, this.type.field7213, this.field8651[0], this.type.field7236 & 0xFFFF, this.type.field7251 & 0xFFFF, this.type.field7252 & 0xFF, this.type.field7253 & 0xFF, var12 == null ? var11 : var12);
            if (var13 != null) {
                if (this.field9811 == null || this.field9811.length < this.field8651.length + 1) {
                    this.method15642(this.field8651.length + 1);
                }
                var10 = PickableEntity.method12205(this.method16155());
                this.field8650 = true;
                arg0.RA(false);
                var13.method271(var4, this.field9811[this.field8651.length], 0);
                arg0.RA(true);
            }
        }
        if (this.field9811 == null || this.field9811.length < this.field8651.length) {
            this.method15642(this.field8651.length);
        }
        if (var10 == null) {
            var10 = PickableEntity.method12205(this.method16155());
        }
        this.method14023(arg0, this.field8651, var4, false);
        for (int var14 = 0; var14 < this.field8651.length; var14++) {
            if (this.field8651[var14] != null) {
                if (this.type.field7275) {
                    this.field8651[var14].PA(this.field10081, this.field10082, this.field10083, this.field10084);
                }
                this.field8651[var14].method271(var4, this.field9811[var14], 0);
            }
        }
        if (this.field8640 != null) {
            ParticleList var15 = this.field8640.method8112();
            arg0.method733(var15);
        }
        for (int var16 = 0; var16 < this.field8651.length; var16++) {
            if (this.field8651[var16] != null) {
                this.field8650 |= this.field8651[var16].i();
            }
            this.field8651[var16] = null;
        }
        this.field9810 = client.field9042;
        return var10;
    }

    @ObfuscatedName("ahs.go(Lra;II)Z")
    public boolean method16151(RendererToolkit arg0, int arg1) {
        int var3 = arg1;
        BASType var4 = this.getBASType();
        AnimationNode var5 = this.field8597.method11767() && !this.field8597.method11776() ? this.field8597 : null;
        EntityWalkAnimationNode var6 = this.field8616.method11767() && (!this.field8616.field9899 || var5 == null) ? this.field8616 : null;
        int var7 = var4.field4712;
        int var8 = var4.field4713;
        if (var7 != 0 || var8 != 0 || var4.field4725 != 0 || var4.field4728 != 0) {
            arg1 |= 0x7;
        }
        boolean var9 = this.field8631 != 0 && client.loopCycle >= this.field8626 && client.loopCycle < this.field8632;
        if (var9) {
            arg1 |= 0x80000;
        }
        int var10 = this.field8638.method1387();
        Model var11 = this.field8651[0] = this.type.method12541(arg0, arg1, Statics.field3769, Statics.field2669, var5, var6, this.field8633, this.field8654, var10, this.field10073, this.method13960(), false);
        if (var11 == null) {
            return false;
        }
        this.field8622 = var11.YA();
        var11.n();
        this.method13972(var11);
        if (var7 == 0 && var8 == 0) {
            this.method13958(var10, this.size() << 9, this.size() << 9, 0, 0);
        } else {
            this.method13958(var10, var7, var8, var4.field4700, var4.field4715);
            if (this.field8601 != 0) {
                this.field8651[0].t(this.field8601);
            }
            if (this.field8644 != 0) {
                this.field8651[0].EA(this.field8644);
            }
            if (this.field8603 != 0) {
                this.field8651[0].ia(0, this.field8603, 0);
            }
        }
        if (var9) {
            var11.PA(this.field8596, this.field8602, this.field8617, this.field8631 & 0xFF);
        }
        this.method13957(arg0, var4, var3, var7, var8, var10);
        return true;
    }

    @ObfuscatedName("ahs.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
        if (this.type == null || !this.field8613 && !this.method16151(arg0, 0)) {
            return;
        }
        Matrix4x3 var2 = arg0.method516();
        var2.method5115(this.method8558());
        var2.method5116(0.0F, -5.0F, 0.0F);
        this.method14023(arg0, this.field8651, var2, this.field8613);
        for (int var3 = 0; var3 < this.field8651.length; var3++) {
            this.field8651[var3] = null;
        }
    }

    @ObfuscatedName("ahs.gi(Lmz;II)V")
    public final void method16152(CompassPoint arg0, int arg1) {
        int var3 = this.routeWaypointX[0];
        int var4 = this.routeWaypointZ[0];
        switch (arg0.field3916) {
            case 0:
                var3--;
                break;
            case 1:
                var3++;
                var4--;
                break;
            case 2:
                var3++;
                break;
            case 3:
                var4--;
                break;
            case 4:
                var3--;
                var4--;
                break;
            case 5:
                var3++;
                var4++;
                break;
            case 6:
                var4++;
                break;
            case 7:
                var3--;
                var4++;
        }
        if (this.field8597.method11767() && this.field8597.method11804().field6330 == 1) {
            this.field8615 = null;
            this.field8597.method11769(-1);
        }
        for (int var5 = 0; var5 < this.spotAnims.length; var5++) {
            if (this.spotAnims[var5].field1204 != -1) {
                EffectAnimType var6 = Statics.field4213.method11082(this.spotAnims[var5].field1204);
                if (var6.field5264 && var6.field5252 != -1 && Statics.field566.method11144(var6.field5252).field6330 == 1) {
                    this.spotAnims[var5].field1203.method11769(-1);
                    this.spotAnims[var5].field1204 = -1;
                }
            }
        }
        if (this.routeLength < this.routeWaypointX.length - 1) {
            this.routeLength++;
        }
        for (int var7 = this.routeLength; var7 > 0; var7--) {
            this.routeWaypointX[var7] = this.routeWaypointX[var7 - 1];
            this.routeWaypointZ[var7] = this.routeWaypointZ[var7 - 1];
            this.field8645[var7] = this.field8645[var7 - 1];
        }
        this.routeWaypointX[0] = var3;
        this.routeWaypointZ[0] = var4;
        this.field8645[0] = (byte) arg1;
    }

    @ObfuscatedName("ahs.ga(IIIZII)V")
    public void method16153(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        this.level = this.field9809 = (byte) arg0;
        if (client.world.getSceneLevelTileFlags().isLinkBelow(arg1, arg2)) {
            this.field9809++;
        }
        if (this.field8597.method11767() && this.field8597.method11804().field6330 == 1) {
            this.field8615 = null;
            this.field8597.method11769(-1);
        }
        for (int var6 = 0; var6 < this.spotAnims.length; var6++) {
            if (this.spotAnims[var6].field1204 != -1) {
                EffectAnimType var7 = Statics.field4213.method11082(this.spotAnims[var6].field1204);
                if (var7.field5264 && var7.field5252 != -1 && Statics.field566.method11144(var7.field5252).field6330 == 1) {
                    this.spotAnims[var6].field1203.method11769(-1);
                    this.spotAnims[var6].field1204 = -1;
                }
            }
        }
        if (!arg3) {
            int var8 = arg1 - this.routeWaypointX[0];
            int var9 = arg2 - this.routeWaypointZ[0];
            if (var8 >= -8 && var8 <= 8 && var9 >= -8 && var9 <= 8) {
                if (this.routeLength < this.routeWaypointX.length - 1) {
                    this.routeLength++;
                }
                for (int var10 = this.routeLength; var10 > 0; var10--) {
                    this.routeWaypointX[var10] = this.routeWaypointX[var10 - 1];
                    this.routeWaypointZ[var10] = this.routeWaypointZ[var10 - 1];
                    this.field8645[var10] = this.field8645[var10 - 1];
                }
                this.routeWaypointX[0] = arg1;
                this.routeWaypointZ[0] = arg2;
                this.field8645[0] = MoveSpeed.field3921.id;
                return;
            }
        }
        this.routeLength = 0;
        this.field8646 = 0;
        this.field8648 = 0;
        this.routeWaypointX[0] = arg1;
        this.routeWaypointZ[0] = arg2;
        Vector3 var11 = Vector3.create(this.getTransform().trans);
        var11.x = (this.routeWaypointX[0] << 9) + (arg4 << 8);
        var11.z = (this.routeWaypointZ[0] << 9) + (arg4 << 8);
        this.method8551(var11);
        var11.release();
        if (this.field8640 != null) {
            this.field8640.method8100();
        }
    }

    @ObfuscatedName("ahs.gs(I)Z")
    public final boolean method16154() {
        return this.type != null;
    }

    @ObfuscatedName("ahs.bm(I)I")
    public int method13960() {
        if (this.field10069 != -1) {
            return this.field10069;
        }
        if (this.type.multinpc != null) {
            NPCType var1 = this.type.getMultiNPC(Statics.field2669);
            if (var1 != null && var1.field7217 != -1) {
                return var1.field7217;
            }
        }
        return this.type.field7217;
    }

    @ObfuscatedName("ahs.cx(I)I")
    public int method13961() {
        if (this.type.multinpc != null) {
            NPCType var1 = this.type.getMultiNPC(Statics.field2669);
            if (var1 != null && var1.field7242 != -1) {
                return var1.field7242;
            }
        }
        return this.type.field7242;
    }

    @ObfuscatedName("ahs.bp(I)I")
    public int method12811() {
        if (this.type.multinpc != null) {
            NPCType var1 = this.type.getMultiNPC(Statics.field2669);
            if (var1 != null && var1.field7266 != -1) {
                return var1.field7266;
            }
        }
        return this.type.field7266 == -1 ? super.method12811() : this.type.field7266;
    }

    @ObfuscatedName("ahs.gd(I)Z")
    public boolean method16155() {
        return this.type.active;
    }

    @ObfuscatedName("ahs.fg(I)I")
    public int method15633() {
        return this.type == null ? 0 : this.type.field7274;
    }

    @ObfuscatedName("ahs.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        if (this.type == null || !this.method16151(arg0, 131072)) {
            return false;
        }
        Matrix4x3 var4 = this.method8558();
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field8651.length; var6++) {
            if (this.field8651[var6] != null) {
                boolean var10000;
                label42:
                {
                    label41:
                    {
                        if (this.type.field7274 <= 0) {
                            if (this.type.field7229 == -1) {
                                if (this.type.field7213 != 1) {
                                    break label41;
                                }
                            } else if (this.type.field7229 != 1) {
                                break label41;
                            }
                        }
                        var10000 = true;
                        break label42;
                    }
                    var10000 = false;
                }
                boolean var7 = var10000;
                boolean var8 = this.field8651[var6].method272(arg1, arg2, var4, var7, this.type.field7274);
                if (var8) {
                    var5 = true;
                    break;
                }
            }
        }
        for (int var9 = 0; var9 < this.field8651.length; var9++) {
            this.field8651[var9] = null;
        }
        return var5;
    }

    @ObfuscatedName("ahs.be(I)Z")
    public final boolean method12815() {
        return false;
    }

    @ObfuscatedName("ahs.bw(Lra;Laes;IIIZI)V")
    public final void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
        throw new IllegalStateException();
    }

    @ObfuscatedName("ahs.bo(B)V")
    public final void method12817() {
        throw new IllegalStateException();
    }

    @ObfuscatedName("ahs.gj(II)I")
    public int method16156(int arg0) {
        return this.field10079[arg0];
    }

    @ObfuscatedName("ahs.gu(II)I")
    public int method16157(int arg0) {
        return this.field10071[arg0];
    }

    @ObfuscatedName("ahs.gg(IIII)V")
    public void method16158(int arg0, int arg1, int arg2) {
        this.field10079[arg0] = arg1;
        this.field10071[arg0] = arg2;
    }

    @ObfuscatedName("ahs.cf(I)Z")
    public boolean method13942() {
        return Statics.field4825.field5149;
    }

    @ObfuscatedName("ahs.cs(S)Lcd;")
    public EntityChatLine method13963() {
        return this.field8629 != null && this.field8629.field1232 == null ? null : this.field8629;
    }

    @ObfuscatedName("ahs.gy(Ljava/lang/String;III)V")
    public void method16148(String arg0, int arg1, int arg2) {
        int var4 = GameShell.method2809() * Statics.field4825.field5163;
        this.method13998(arg0, arg1, arg2, var4);
    }

    @ObfuscatedName("ahs.dk(S)I")
    public int method13970() {
        return this.localPlayerIndex + 1;
    }

    @ObfuscatedName("ahs.u(I)Ladu;")
    public CoordFine method3684() {
        CoordGrid var1 = client.world.getBase();
        return CoordFine.method8611(this.level, (int) this.getTransform().trans.x + var1.x * 512, -((int) this.getTransform().trans.y), (int) this.getTransform().trans.z + var1.z * 512);
    }

    @ObfuscatedName("ahs.j(I)Lkn;")
    public Quaternion method3680() {
        Quaternion var1 = Quaternion.method5206();
        var1.method5217(Trig1.method5096(this.field8638.field574), 0.0F, 0.0F);
        return var1;
    }

    @ObfuscatedName("ahs.a(I)Lko;")
    public Vector3 method3683() {
        return Vector3.create();
    }
}
