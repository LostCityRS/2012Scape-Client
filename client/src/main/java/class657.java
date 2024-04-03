import deob.ObfuscatedName;

@ObfuscatedName("xz")
public class class657 extends PrimaryLayerEntity implements Location {

    @ObfuscatedName("xz.z")
    public class116 field7524;

    @ObfuscatedName("xz.n")
    public boolean field7526;

    @ObfuscatedName("xz.o")
    public EntityBounds field7525;

    @ObfuscatedName("xz.q")
    public boolean field7527 = true;

    public class657(Scene arg0, RendererToolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.field6527 == 1, method3987(arg14, arg15));
        this.field7524 = new class116(arg1, arg2, arg3, arg14, arg15, this.field9807, arg5, this, arg9, arg16);
        this.field7526 = arg3.field6493 != 0 && !arg9;
        this.method15642(1);
    }

    @ObfuscatedName("xz.bn(I)Z")
    public boolean method12807() {
        return false;
    }

    @ObfuscatedName("xz.ba(I)Z")
    public boolean method12808() {
        return this.field7527;
    }

    @ObfuscatedName("gr.bd(III)B")
    public static byte method3987(int arg0, int arg1) {
        if (LocShape.field6567.field6590 == arg0) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @ObfuscatedName("xz.bc(I)I")
    public int method12809() {
        return this.field7524.method2434();
    }

    @ObfuscatedName("xz.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        return this.field7525;
    }

    @ObfuscatedName("xz.bp(I)I")
    public int method12811() {
        return this.field7524.method2436();
    }

    @ObfuscatedName("xz.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        Model var2 = this.field7524.method2437(arg0, 2048, false, true);
        if (var2 == null) {
            return null;
        }
        Matrix4x3 var3 = this.method8558();
        PickableEntity var4 = PickableEntity.method12205(this.field7526);
        this.field7524.method2438(arg0, var2, var3, this.field10510, this.field10508, this.field10509, this.field10511, true);
        var2.method271(var3, this.field9811[0], 0);
        if (this.field7524.field1229 != null) {
            ParticleList var5 = this.field7524.field1229.method8112();
            arg0.method733(var5);
        }
        this.field7527 = var2.method292() || this.field7524.field1229 != null;
        ScaleRotTrans var6 = this.method8565();
        if (this.field7525 == null) {
            this.field7525 = GraphEntity.method15140((int) var6.field3464.field3475, (int) var6.field3464.field3476, (int) var6.field3464.field3477, var2);
        } else {
            GraphEntity.method11162(this.field7525, (int) var6.field3464.field3475, (int) var6.field3464.field3476, (int) var6.field3464.field3477, var2);
        }
        return var4;
    }

    @ObfuscatedName("xz.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
        Model var2 = this.field7524.method2437(arg0, 262144, true, true);
        if (var2 != null) {
            this.field7524.method2438(arg0, var2, this.method8558(), this.field10510, this.field10508, this.field10509, this.field10511, false);
        }
    }

    @ObfuscatedName("xz.bm(Lto;S)V")
    public void method12813(class539 arg0) {
        this.field7524.method2452(arg0);
    }

    @ObfuscatedName("xz.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        Model var4 = this.field7524.method2437(arg0, 131072, false, false);
        return var4 == null ? false : var4.method272(arg1, arg2, this.method8558(), false, 0);
    }

    @ObfuscatedName("xz.be(I)Z")
    public final boolean method12815() {
        return false;
    }

    @ObfuscatedName("xz.bw(Lra;Laes;IIIZI)V")
    public final void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
        throw new IllegalStateException();
    }

    @ObfuscatedName("xz.bo(B)V")
    public final void method12817() {
        throw new IllegalStateException();
    }

    @ObfuscatedName("xz.u(B)I")
    public int method2401() {
        return this.field7524.field1219;
    }

    @ObfuscatedName("xz.j(B)I")
    public int method2390() {
        return this.field7524.field1226;
    }

    @ObfuscatedName("xz.a(I)I")
    public int method2391() {
        return this.field7524.field1216;
    }

    @ObfuscatedName("xz.s(I)V")
    public void method2409() {
    }

    @ObfuscatedName("xz.c(I)Z")
    public boolean method2393() {
        return this.field7524.method2435();
    }

    @ObfuscatedName("xz.m(Lra;I)V")
    public void method2406(RendererToolkit arg0) {
        this.field7524.method2440(arg0);
    }

    @ObfuscatedName("xz.t(Lra;I)V")
    public void method2412(RendererToolkit arg0) {
        this.field7524.method2441(arg0);
    }
}
