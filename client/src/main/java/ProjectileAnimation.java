import deob.ObfuscatedName;

@ObfuscatedName("alv")
public class ProjectileAnimation extends PrimaryLayerEntity {

    @ObfuscatedName("alv.r")
    public final int field10630;

    @ObfuscatedName("alv.g")
    public final int field10628;

    @ObfuscatedName("alv.y")
    public final int field10620;

    @ObfuscatedName("alv.e")
    public final int field10625;

    @ObfuscatedName("alv.ay")
    public final int field10622;

    @ObfuscatedName("alv.af")
    public final int field10623;

    @ObfuscatedName("alv.ar")
    public final int field10635;

    @ObfuscatedName("alv.an")
    public final int field10624;

    @ObfuscatedName("alv.ap")
    public final int field10626;

    @ObfuscatedName("alv.ag")
    public final int field10627;

    @ObfuscatedName("alv.as")
    public final boolean field10619;

    @ObfuscatedName("alv.ai")
    public boolean field10629 = false;

    @ObfuscatedName("alv.ao")
    public double field10618;

    @ObfuscatedName("alv.al")
    public double field10631;

    @ObfuscatedName("alv.at")
    public double field10621;

    @ObfuscatedName("alv.ax")
    public double field10633;

    @ObfuscatedName("alv.aw")
    public double field10634;

    @ObfuscatedName("alv.aa")
    public final AnimationNode field10638;

    @ObfuscatedName("alv.am")
    public int field10636 = 0;

    @ObfuscatedName("alv.ad")
    public boolean field10637 = false;

    @ObfuscatedName("alv.az")
    public ParticleSystem field10632;

    @ObfuscatedName("alv.ak")
    public int field10639 = 0;

    public ProjectileAnimation(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14, int arg15, int arg16) {
        super(arg0, arg2, arg3, arg4, client.getHeightmapY(arg4, arg5, arg2) - arg6, arg5, arg4 >> 9, arg4 >> 9, arg5 >> 9, arg5 >> 9, false, (byte) 0);
        this.field10630 = arg1;
        this.field10625 = arg7;
        this.field10622 = arg8;
        this.field10623 = arg9;
        this.field10635 = arg10;
        this.field10624 = arg11;
        this.field10626 = arg12;
        this.field10628 = arg6;
        this.field10620 = arg13;
        this.field10619 = arg14;
        this.field10629 = false;
        this.field10627 = arg15;
        this.field10639 = arg16;
        int var18 = Statics.field4213.method11082(this.field10630).field5252;
        this.field10638 = new EntityAnimationNode(this, false);
        this.field10638.method11769(var18);
        this.method15642(1);
    }

    @ObfuscatedName("alv.bn(I)Z")
    public boolean method12807() {
        return false;
    }

    @ObfuscatedName("alv.ba(I)Z")
    public boolean method12808() {
        return this.field10637;
    }

    @ObfuscatedName("alv.bc(I)I")
    public int method12809() {
        return this.field10636;
    }

    @ObfuscatedName("alv.u(B)I")
    public int method17154() {
        return this.field10639;
    }

    @ObfuscatedName("alv.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        return null;
    }

    @ObfuscatedName("alv.j(IIIIB)V")
    public final void method17162(int arg0, int arg1, int arg2, int arg3) {
        Vector3 var5 = Vector3.create(this.getTransform().trans);
        if (!this.field10629) {
            float var6 = (float) arg0 - var5.x;
            float var7 = (float) arg1 - var5.z;
            float var8 = (float) Math.sqrt((double) (var6 * var6 + var7 * var7));
            if (var8 != 0.0F) {
                var5.x += (float) this.field10635 * var6 / var8;
                var5.z += (float) this.field10635 * var7 / var8;
            }
            if (this.field10619) {
                var5.y = client.getHeightmapY((int) var5.x, (int) var5.z, this.level) - this.field10628;
            }
            this.method8551(var5);
        }
        double var9 = (double) (this.field10622 + 1 - arg3);
        this.field10618 = (double) ((float) arg0 - var5.x) / var9;
        this.field10631 = (double) ((float) arg1 - var5.z) / var9;
        this.field10621 = Math.sqrt(this.field10631 * this.field10631 + this.field10618 * this.field10618);
        if (this.field10623 == -1) {
            this.field10633 = (double) ((float) arg2 - var5.y) / var9;
        } else {
            if (!this.field10629) {
                this.field10633 = -this.field10621 * Math.tan((double) this.field10623 * 0.02454369D);
            }
            this.field10634 = ((double) ((float) arg2 - var5.y) - this.field10633 * var9) * 2.0D / (var9 * var9);
        }
        var5.release();
    }

    @ObfuscatedName("alv.a(I)V")
    public void method17152() {
        if (this.field10629 || this.field10624 == 0) {
            return;
        }
        PathingEntity var1 = null;
        if (client.field8988 == 0) {
            var1 = Statics.field1537[this.field10624 - 1].method2854();
        } else if (this.field10624 < 0) {
            int var2 = -this.field10624 - 1;
            if (client.currentPlayerUid == var2) {
                var1 = Statics.localPlayerEntity;
            } else {
                var1 = client.players[var2];
            }
        } else {
            int var3 = this.field10624 - 1;
            ObjectNode var4 = (ObjectNode) client.npcEntities.get((long) var3);
            if (var4 != null) {
                var1 = (PathingEntity) var4.value;
            }
        }
        if (var1 == null) {
            return;
        }
        Vector3 var5 = var1.getTransform().trans;
        this.method8552(var5.x, (float) (client.getHeightmapY((int) var5.x, (int) var5.z, this.level) - this.field10628), var5.z);
        if (this.field10627 < 0) {
            return;
        }
        BASType var6 = var1.getBASType();
        int var7 = 0;
        int var8 = 0;
        if (var6.field4716 != null && var6.field4716[this.field10627] != null) {
            var7 += var6.field4716[this.field10627][0];
            var8 += var6.field4716[this.field10627][2];
        }
        if (var6.field4729 != null && var6.field4729[this.field10627] != null) {
            var7 += var6.field4729[this.field10627][0];
            var8 += var6.field4729[this.field10627][2];
        }
        if (var7 == 0 && var8 == 0) {
            return;
        }
        int var9 = var1.field8638.method1387();
        int var10 = var9;
        if (var1.field8654 != null && var1.field8654[this.field10627] != -1) {
            var10 = var1.field8654[this.field10627];
        }
        int var11 = var10 - var9 & 0x3FFF;
        int var12 = Trig1.sin[var11];
        int var13 = Trig1.cos[var11];
        int var14 = var7 * var13 + var8 * var12 >> 14;
        int var15 = var8 * var13 - var7 * var12 >> 14;
        Vector3 var17 = Vector3.create(this.getTransform().trans);
        var17.x += var14;
        var17.z += var15;
        this.method8551(var17);
        var17.release();
    }

    @ObfuscatedName("alv.s(II)V")
    public final void method17157(int arg0) {
        this.field10629 = true;
        ScaleRotTrans var2 = new ScaleRotTrans(this.getTransform());
        var2.trans.x = (float) ((double) var2.trans.x + (double) arg0 * this.field10618);
        var2.trans.z = (float) ((double) var2.trans.z + (double) arg0 * this.field10631);
        if (this.field10619) {
            var2.trans.y = client.getHeightmapY((int) var2.trans.x, (int) var2.trans.z, this.level) - this.field10628;
        } else if (this.field10623 == -1) {
            var2.trans.y = (float) ((double) var2.trans.y + (double) arg0 * this.field10633);
        } else {
            var2.trans.y = (float) ((double) var2.trans.y + this.field10634 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field10633);
            this.field10633 += (double) arg0 * this.field10634;
        }
        var2.field3463.method5216(1.0F, 0.0F, 0.0F, (float) Math.atan2(this.field10633, this.field10621));
        Quaternion var3 = Quaternion.method5206();
        var3.method5216(0.0F, 1.0F, 0.0F, (float) Math.atan2(this.field10618, this.field10631) - 3.1415927F);
        var2.field3463.method5266(var3);
        var3.method5209();
        this.method8553(var2);
        if (this.field10638.method11787(1) && this.field10638.method11784()) {
            this.field10638.method11785();
        }
    }

    @ObfuscatedName("alv.c(Lra;II)Lqa;")
    public Model method17156(RendererToolkit arg0, int arg1) {
        EffectAnimType var3 = Statics.field4213.method11082(this.field10630);
        return var3.method11102(arg0, arg1, this.field10638, (byte) 2);
    }

    @ObfuscatedName("alv.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        Model var2 = this.method17156(arg0, 2048);
        if (var2 == null) {
            return null;
        }
        Matrix4x3 var3 = this.method8558();
        this.method17158(arg0, var2, var3);
        PickableEntity var4 = PickableEntity.method12205(false);
        var2.method271(var3, this.field9811[0], 0);
        if (this.field10632 != null) {
            ParticleList var5 = this.field10632.method8112();
            arg0.method733(var5);
        }
        this.field10637 = var2.i();
        var2.n();
        this.field10636 = var2.YA();
        return var4;
    }

    @ObfuscatedName("alv.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
        Model var2 = this.method17156(arg0, 0);
        if (var2 != null) {
            Matrix4x3 var3 = this.method8558();
            this.field10636 = var2.YA();
            var2.n();
            this.method17158(arg0, var2, var3);
        }
    }

    @ObfuscatedName("alv.dz(I)V")
    public void method14006() {
        Vector3 var1 = this.getTransform().trans;
        this.field10510 = this.field10508 = (short) (var1.x / 512.0F);
        this.field10509 = this.field10511 = (short) (var1.z / 512.0F);
    }

    @ObfuscatedName("alv.m(Lra;Lqa;Lkc;I)V")
    public void method17158(RendererToolkit arg0, Model arg1, Matrix4x3 arg2) {
        arg1.method294(arg2);
        ModelParticleEmitter[] var4 = arg1.method276();
        ModelParticleEffector[] var5 = arg1.method413();
        if ((this.field10632 == null || this.field10632.field4945) && (var4 != null || var5 != null)) {
            this.field10632 = ParticleSystem.method8123(client.loopCycle, true);
        }
        if (this.field10632 != null) {
            this.field10632.method8106(arg0, (long) client.loopCycle, var4, var5, false);
            this.field10632.method8110(this.level, this.field10510, this.field10508, this.field10509, this.field10511);
        }
    }

    @ObfuscatedName("alv.t(B)V")
    public void method17159() {
        if (this.field10632 != null) {
            this.field10632.method8102();
        }
    }

    @ObfuscatedName("alv.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        return false;
    }

    @ObfuscatedName("alv.be(I)Z")
    public final boolean method12815() {
        return false;
    }

    @ObfuscatedName("alv.bw(Lra;Laes;IIIZI)V")
    public final void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
        throw new IllegalStateException();
    }

    @ObfuscatedName("alv.bo(B)V")
    public final void method12817() {
        throw new IllegalStateException();
    }
}
