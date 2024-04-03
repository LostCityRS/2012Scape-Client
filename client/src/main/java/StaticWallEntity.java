import deob.ObfuscatedName;

@ObfuscatedName("ye")
public class StaticWallEntity extends WallLayerEntity implements Location {

    @ObfuscatedName("ye.z")
    public static final int[] field7558 = new int[]{1, 2, 4, 8};

    @ObfuscatedName("ye.n")
    public static final int[] field7565 = new int[]{16, 32, 64, 128};

    @ObfuscatedName("ye.o")
    public LocTypeList field7556;

    @ObfuscatedName("ye.q")
    public Model field7557;

    @ObfuscatedName("ye.p")
    public HardShadow field7555;

    @ObfuscatedName("ye.w")
    public EntityBounds field7554;

    @ObfuscatedName("ye.b")
    public final int field10505;

    @ObfuscatedName("ye.x")
    public final byte field7561;

    @ObfuscatedName("ye.i")
    public final byte field7559;

    @ObfuscatedName("ye.v")
    public final boolean field7566;

    @ObfuscatedName("ye.k")
    public boolean field7564;

    @ObfuscatedName("ye.h")
    public boolean field7563;

    @ObfuscatedName("ye.r")
    public boolean field7562;

    public StaticWallEntity(Scene arg0, RendererToolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, boolean arg12) {
        super(arg0, arg6, arg7, arg8, arg4, arg5, method3208(arg10, arg11));
        this.field7556 = arg2;
        this.field10505 = arg3.field6474;
        this.field7566 = arg9;
        this.field7559 = (byte) arg10;
        this.field7561 = (byte) arg11;
        this.field7564 = arg3.field6493 != 0 && !arg9;
        this.field7563 = arg12;
        this.field7562 = arg1.method449() && arg3.field6541 && !this.field7566 && Statics.field4961.field9651.method15747() != 0;
        int var14 = 2048;
        if (this.field7563) {
            var14 |= 0x10000;
        }
        if (arg3.field6472) {
            var14 |= 0x80000;
        }
        Pair var15 = this.method12887(arg1, var14, this.field7562);
        if (var15 != null) {
            this.field7557 = (Model) var15.field6757;
            this.field7555 = (HardShadow) var15.field6756;
            if (this.field7563 || arg3.field6472) {
                this.field7557 = this.field7557.method295((byte) 0, var14, false);
                if (arg3.field6472) {
                    LocTint var16 = client.field8980.method6094();
                    this.field7557.PA(var16.field3783, var16.field3782, var16.field3781, var16.field3784);
                }
            }
        }
        this.method15642(1);
    }

    @ObfuscatedName("ye.bn(I)Z")
    public boolean method12807() {
        if (this.field7557 == null) {
            return true;
        } else {
            return !this.field7557.u();
        }
    }

    @ObfuscatedName("ye.ba(I)Z")
    public boolean method12808() {
        return this.field7557 == null ? false : this.field7557.i();
    }

    @ObfuscatedName("ye.bc(I)I")
    public int method12809() {
        return this.field7557 == null ? 0 : this.field7557.YA();
    }

    @ObfuscatedName("ew.bd(III)I")
    public static int method3208(int arg0, int arg1) {
        return LocShape.field6575.field6590 == arg0 || LocShape.field6570.field6590 == arg0 ? field7565[arg1 & 0x3] : field7558[arg1 & 0x3];
    }

    @ObfuscatedName("ye.bm(Lra;II)Lqa;")
    public Model method12890(RendererToolkit arg0, int arg1) {
        if (this.field7557 != null && arg0.method519(this.field7557.m(), arg1) == 0) {
            return this.field7557;
        } else {
            Pair var3 = this.method12887(arg0, arg1, false);
            return var3 == null ? null : (Model) var3.field6757;
        }
    }

    @ObfuscatedName("ye.cx(Lra;IZI)Luz;")
    public Pair method12887(RendererToolkit arg0, int arg1, boolean arg2) {
        LocType var4 = this.field7556.method11471(this.field10505);
        FloorModel var5;
        FloorModel var6;
        if (this.field7566) {
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
        Vector3 var7 = this.method8565().field3464;
        return var4.method11447(arg0, arg1, this.field7559, this.field7561, var5, var6, (int) var7.field3475, (int) var7.field3476, (int) var7.field3477, arg2, null);
    }

    @ObfuscatedName("ye.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        Vector3 var2 = this.method8565().field3464;
        if (this.field7554 == null) {
            this.field7554 = GraphEntity.method15140((int) var2.field3475, (int) var2.field3476, (int) var2.field3477, this.method12890(arg0, 0));
        }
        return this.field7554;
    }

    @ObfuscatedName("ye.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        if (this.field7557 == null) {
            return null;
        } else {
            Matrix4x3 var2 = this.method8558();
            PickableEntity var3 = PickableEntity.method12205(this.field7564);
            this.field7557.method271(var2, this.field9811[0], 0);
            return var3;
        }
    }

    @ObfuscatedName("ye.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
    }

    @ObfuscatedName("ye.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        Model var4 = this.method12890(arg0, 131072);
        if (var4 == null) {
            return false;
        } else {
            Matrix4x3 var5 = this.method8558();
            return var4.method272(arg1, arg2, var5, false, 0);
        }
    }

    @ObfuscatedName("ye.be(I)Z")
    public boolean method12815() {
        return this.field7563;
    }

    @ObfuscatedName("ye.bw(Lra;Laes;IIIZI)V")
    public void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 instanceof StaticWallEntity) {
            StaticWallEntity var7 = (StaticWallEntity) arg1;
            if (this.field7557 != null && var7.field7557 != null) {
                this.field7557.method297(var7.field7557, arg2, arg3, arg4, arg5);
            }
        } else if (arg1 instanceof StaticSceneryEntity) {
            StaticSceneryEntity var8 = (StaticSceneryEntity) arg1;
            if (this.field7557 != null && var8.field7537 != null) {
                this.field7557.method297(var8.field7537, arg2, arg3, arg4, arg5);
            }
        }
    }

    @ObfuscatedName("ye.bo(B)V")
    public void method12817() {
        this.field7563 = false;
        if (this.field7557 != null) {
            this.field7557.KA(this.field7557.m() & 0xFFFEFFFF);
        }
    }

    @ObfuscatedName("ye.u(B)I")
    public int method2401() {
        return this.field10505;
    }

    @ObfuscatedName("ye.j(B)I")
    public int method2390() {
        return this.field7559;
    }

    @ObfuscatedName("ye.a(I)I")
    public int method2391() {
        return this.field7561;
    }

    @ObfuscatedName("ye.s(I)V")
    public void method2409() {
        if (this.field7557 != null) {
            this.field7557.method247();
        }
    }

    @ObfuscatedName("ye.c(I)Z")
    public boolean method2393() {
        return this.field7562;
    }

    @ObfuscatedName("ye.m(Lra;I)V")
    public void method2406(RendererToolkit arg0) {
        Object var2 = null;
        HardShadow var4;
        if (this.field7555 == null && this.field7562) {
            Pair var3 = this.method12887(arg0, 262144, true);
            var4 = (HardShadow) (var3 == null ? null : var3.field6756);
        } else {
            var4 = this.field7555;
            this.field7555 = null;
        }
        Vector3 var5 = this.method8565().field3464;
        if (var4 != null) {
            this.field9808.method7445(var4, this.field9809, (int) var5.field3475, (int) var5.field3477, null);
        }
    }

    @ObfuscatedName("ye.t(Lra;I)V")
    public void method2412(RendererToolkit arg0) {
        Object var2 = null;
        HardShadow var4;
        if (this.field7555 == null && this.field7562) {
            Pair var3 = this.method12887(arg0, 262144, true);
            var4 = (HardShadow) (var3 == null ? null : var3.field6756);
        } else {
            var4 = this.field7555;
            this.field7555 = null;
        }
        Vector3 var5 = this.method8565().field3464;
        if (var4 != null) {
            this.field9808.method7451(var4, this.field9809, (int) var5.field3475, (int) var5.field3477, null);
        }
    }
}
