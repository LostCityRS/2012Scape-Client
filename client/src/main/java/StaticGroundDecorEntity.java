import deob.ObfuscatedName;

@ObfuscatedName("yw")
public class StaticGroundDecorEntity extends GroundDecorLayerEntity implements Location {

    @ObfuscatedName("yw.z")
    public LocTypeList field7588;

    @ObfuscatedName("yw.n")
    public Model field7580;

    @ObfuscatedName("yw.o")
    public HardShadow field7581;

    @ObfuscatedName("yw.q")
    public EntityBounds field7582;

    @ObfuscatedName("yw.p")
    public final int field9810;

    @ObfuscatedName("yw.w")
    public final byte field7584;

    @ObfuscatedName("yw.b")
    public final boolean field7585;

    @ObfuscatedName("yw.x")
    public boolean field7579;

    @ObfuscatedName("yw.i")
    public boolean field7587;

    @ObfuscatedName("yw.v")
    public boolean field7586;

    public StaticGroundDecorEntity(Scene arg0, RendererToolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, boolean arg11) {
        super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.field6477);
        this.field7588 = arg2;
        this.field9810 = arg3.field6474;
        this.field7585 = arg9;
        this.field7584 = (byte) arg10;
        this.field7579 = arg3.active != 0 && !arg9;
        this.field7587 = arg11;
        this.field7586 = arg1.method449() && arg3.field6541 && !this.field7585 && Statics.options.sceneryShadows.method15747() != 0;
        int var13 = 2048;
        if (this.field7587) {
            var13 |= 0x10000;
        }
        if (arg3.field6472) {
            var13 |= 0x80000;
        }
        Pair var14 = this.method12906(arg1, var13, this.field7586);
        if (var14 != null) {
            this.field7580 = (Model) var14.field6757;
            this.field7581 = (HardShadow) var14.field6756;
            if (this.field7587 || arg3.field6472) {
                this.field7580 = this.field7580.method295((byte) 0, var13, false);
                if (arg3.field6472) {
                    LocTint var15 = client.world.method6094();
                    this.field7580.PA(var15.field3783, var15.field3782, var15.field3781, var15.field3784);
                }
            }
        }
        this.method15642(1);
    }

    @ObfuscatedName("yw.bn(I)Z")
    public boolean method12807() {
        if (this.field7580 == null) {
            return true;
        } else {
            return !this.field7580.u();
        }
    }

    @ObfuscatedName("yw.ba(I)Z")
    public boolean method12808() {
        return this.field7580 == null ? false : this.field7580.i();
    }

    @ObfuscatedName("yw.bc(I)I")
    public int method12809() {
        return this.field7580 == null ? 0 : this.field7580.YA();
    }

    @ObfuscatedName("yw.bd(Lra;II)Lqa;")
    public Model method12905(RendererToolkit arg0, int arg1) {
        if (this.field7580 != null && arg0.method519(this.field7580.m(), arg1) == 0) {
            return this.field7580;
        } else {
            Pair var3 = this.method12906(arg0, arg1, false);
            return var3 == null ? null : (Model) var3.field6757;
        }
    }

    @ObfuscatedName("yw.bm(Lra;IZI)Luz;")
    public Pair method12906(RendererToolkit arg0, int arg1, boolean arg2) {
        LocType var4 = this.field7588.get(this.field9810);
        FloorModel var5;
        FloorModel var6;
        if (this.field7585) {
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
        return var4.method11447(arg0, arg1, LocShape.field6589.field6590, this.field7584, var5, var6, (int) var7.x, (int) var7.y, (int) var7.z, arg2, null);
    }

    @ObfuscatedName("yw.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        Vector3 var2 = this.getTransform().trans;
        if (this.field7582 == null) {
            this.field7582 = GraphEntity.method15140((int) var2.x, (int) var2.y, (int) var2.z, this.method12905(arg0, 0));
        }
        return this.field7582;
    }

    @ObfuscatedName("yw.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        if (this.field7580 == null) {
            return null;
        } else {
            Matrix4x3 var2 = this.method8558();
            PickableEntity var3 = PickableEntity.method12205(this.field7579);
            this.field7580.method271(var2, this.field9811[0], 0);
            return var3;
        }
    }

    @ObfuscatedName("yw.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
    }

    @ObfuscatedName("yw.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        Model var4 = this.method12905(arg0, 131072);
        if (var4 == null) {
            return false;
        } else {
            Matrix4x3 var5 = this.method8558();
            return var4.method272(arg1, arg2, var5, false, 0);
        }
    }

    @ObfuscatedName("yw.be(I)Z")
    public boolean method12815() {
        return this.field7587;
    }

    @ObfuscatedName("yw.bw(Lra;Laes;IIIZI)V")
    public void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 instanceof StaticGroundDecorEntity) {
            StaticGroundDecorEntity var7 = (StaticGroundDecorEntity) arg1;
            if (this.field7580 != null && var7.field7580 != null) {
                this.field7580.method297(var7.field7580, arg2, arg3, arg4, arg5);
            }
        }
    }

    @ObfuscatedName("yw.bo(B)V")
    public void method12817() {
        this.field7587 = false;
        if (this.field7580 != null) {
            this.field7580.KA(this.field7580.m() & 0xFFFEFFFF);
        }
    }

    @ObfuscatedName("yw.u(B)I")
    public int getType() {
        return this.field9810;
    }

    @ObfuscatedName("yw.j(B)I")
    public int method2390() {
        return LocShape.field6589.field6590;
    }

    @ObfuscatedName("yw.a(I)I")
    public int method2391() {
        return this.field7584;
    }

    @ObfuscatedName("yw.s(I)V")
    public void method2409() {
        if (this.field7580 != null) {
            this.field7580.method247();
        }
    }

    @ObfuscatedName("yw.c(I)Z")
    public boolean method2393() {
        return this.field7586;
    }

    @ObfuscatedName("yw.m(Lra;I)V")
    public void method2406(RendererToolkit arg0) {
        Object var2 = null;
        HardShadow var4;
        if (this.field7581 == null && this.field7586) {
            Pair var3 = this.method12906(arg0, 262144, true);
            var4 = (HardShadow) (var3 == null ? null : var3.field6756);
        } else {
            var4 = this.field7581;
            this.field7581 = null;
        }
        Vector3 var5 = this.getTransform().trans;
        if (var4 != null) {
            this.field9808.method7445(var4, this.field9809, (int) var5.x, (int) var5.z, null);
        }
    }

    @ObfuscatedName("yw.t(Lra;I)V")
    public void method2412(RendererToolkit arg0) {
        Object var2 = null;
        HardShadow var4;
        if (this.field7581 == null && this.field7586) {
            Pair var3 = this.method12906(arg0, 262144, true);
            var4 = (HardShadow) (var3 == null ? null : var3.field6756);
        } else {
            var4 = this.field7581;
            this.field7581 = null;
        }
        Vector3 var5 = this.getTransform().trans;
        if (var4 != null) {
            this.field9808.method7451(var4, this.field9809, (int) var5.x, (int) var5.z, null);
        }
    }
}
