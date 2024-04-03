import deob.ObfuscatedName;

@ObfuscatedName("yc")
public class StaticWallDecorLayerEntity extends WallDecorLayerEntity implements Location {

    @ObfuscatedName("yc.z")
    public LocTypeList field7550;

    @ObfuscatedName("yc.n")
    public Model field7544;

    @ObfuscatedName("yc.o")
    public HardShadow field7547;

    @ObfuscatedName("yc.q")
    public EntityBounds field7545;

    @ObfuscatedName("yc.p")
    public final int field9810;

    @ObfuscatedName("yc.w")
    public final byte field7549;

    @ObfuscatedName("yc.b")
    public final byte field7546;

    @ObfuscatedName("yc.x")
    public final boolean field7551;

    @ObfuscatedName("yc.i")
    public boolean field7552;

    @ObfuscatedName("yc.v")
    public boolean field7553;

    public StaticWallDecorLayerEntity(Scene arg0, RendererToolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11);
        this.field7550 = arg2;
        this.field9810 = arg3.field6474;
        this.field7551 = arg9;
        this.field7546 = (byte) arg13;
        this.field7549 = (byte) arg12;
        this.field7552 = arg3.field6493 != 0 && !arg9;
        this.field7553 = arg1.method449() && arg3.field6541 && !this.field7551 && Statics.clientOptions.field9651.method15747() != 0;
        int var15 = 2048;
        if (arg3.field6472) {
            var15 |= 0x80000;
        }
        Pair var16 = this.method12879(arg1, var15, this.field7553);
        if (var16 != null) {
            this.field7544 = (Model) var16.field6757;
            this.field7547 = (HardShadow) var16.field6756;
            if (arg3.field6472) {
                this.field7544 = this.field7544.method295((byte) 0, var15, false);
                if (arg3.field6472) {
                    LocTint var17 = client.world.method6094();
                    this.field7544.PA(var17.field3783, var17.field3782, var17.field3781, var17.field3784);
                }
            }
        }
        this.method15642(1);
    }

    @ObfuscatedName("yc.bn(I)Z")
    public boolean method12807() {
        if (this.field7544 == null) {
            return true;
        } else {
            return !this.field7544.u();
        }
    }

    @ObfuscatedName("yc.ba(I)Z")
    public boolean method12808() {
        return this.field7544 == null ? false : this.field7544.i();
    }

    @ObfuscatedName("yc.bc(I)I")
    public int method12809() {
        return this.field7544 == null ? 0 : this.field7544.YA();
    }

    @ObfuscatedName("yc.bd(Lra;IS)Lqa;")
    public Model method12878(RendererToolkit arg0, int arg1) {
        if (this.field7544 != null && arg0.method519(this.field7544.m(), arg1) == 0) {
            return this.field7544;
        } else {
            Pair var3 = this.method12879(arg0, arg1, false);
            return var3 == null ? null : (Model) var3.field6757;
        }
    }

    @ObfuscatedName("yc.bm(Lra;IZI)Luz;")
    public Pair method12879(RendererToolkit arg0, int arg1, boolean arg2) {
        LocType var4 = this.field7550.method11471(this.field9810);
        FloorModel var5;
        FloorModel var6;
        if (this.field7551) {
            var5 = this.field9808.field4502[this.field9809];
            var6 = this.field9808.field4527[0];
        } else {
            var5 = this.field9808.field4527[this.field9809];
            if (this.field9809 < 3) {
                var6 = this.field9808.field4527[this.field9809 + 1];
            } else {
                var6 = null;
            }
        }
        Vector3 var7 = this.getTransform().trans;
        return var4.method11447(arg0, arg1, this.field7549, this.field7546, var5, var6, (int) var7.x, (int) var7.y, (int) var7.z, arg2, null);
    }

    @ObfuscatedName("yc.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        Vector3 var2 = this.getTransform().trans;
        if (this.field7545 == null) {
            this.field7545 = GraphEntity.method15140((int) var2.x, (int) var2.y, (int) var2.z, this.method12878(arg0, 0));
        }
        return this.field7545;
    }

    @ObfuscatedName("yc.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        if (this.field7544 == null) {
            return null;
        }
        Matrix4x3 var2 = arg0.method516();
        var2.method5115(this.method8558());
        var2.method5116((float) this.field10496, 0.0F, (float) this.field10497);
        PickableEntity var3 = PickableEntity.method12205(this.field7552);
        this.field7544.method271(var2, this.field9811[0], 0);
        return var3;
    }

    @ObfuscatedName("yc.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
    }

    @ObfuscatedName("yc.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        Model var4 = this.method12878(arg0, 131072);
        if (var4 == null) {
            return false;
        } else {
            Matrix4x3 var5 = this.method8558();
            return var4.method272(arg1, arg2, var5, false, 0);
        }
    }

    @ObfuscatedName("yc.u(B)I")
    public int method2401() {
        return this.field9810;
    }

    @ObfuscatedName("yc.j(B)I")
    public int method2390() {
        return this.field7549;
    }

    @ObfuscatedName("yc.a(I)I")
    public int method2391() {
        return this.field7546;
    }

    @ObfuscatedName("yc.s(I)V")
    public void method2409() {
        if (this.field7544 != null) {
            this.field7544.method247();
        }
    }

    @ObfuscatedName("yc.c(I)Z")
    public boolean method2393() {
        return this.field7553;
    }

    @ObfuscatedName("yc.m(Lra;I)V")
    public void method2406(RendererToolkit arg0) {
        Object var2 = null;
        HardShadow var4;
        if (this.field7547 == null && this.field7553) {
            Pair var3 = this.method12879(arg0, 262144, true);
            var4 = (HardShadow) (var3 == null ? null : var3.field6756);
        } else {
            var4 = this.field7547;
            this.field7547 = null;
        }
        Vector3 var5 = this.getTransform().trans;
        if (var4 != null) {
            this.field9808.method7445(var4, this.field9809, (int) var5.x, (int) var5.z, null);
        }
    }

    @ObfuscatedName("yc.t(Lra;I)V")
    public void method2412(RendererToolkit arg0) {
        Object var2 = null;
        HardShadow var4;
        if (this.field7547 == null && this.field7553) {
            Pair var3 = this.method12879(arg0, 262144, true);
            var4 = (HardShadow) (var3 == null ? null : var3.field6756);
        } else {
            var4 = this.field7547;
            this.field7547 = null;
        }
        Vector3 var5 = this.getTransform().trans;
        if (var4 != null) {
            this.field9808.method7451(var4, this.field9809, (int) var5.x, (int) var5.z, null);
        }
    }
}
