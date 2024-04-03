import deob.ObfuscatedName;

@ObfuscatedName("yf")
public class class663 extends WallLayerEntity implements Location {

    @ObfuscatedName("yf.z")
    public class116 field7576;

    @ObfuscatedName("yf.n")
    public boolean field7577;

    @ObfuscatedName("yf.o")
    public EntityBounds field7575;

    @ObfuscatedName("yf.q")
    public static final int[] field7574 = new int[]{1, 2, 4, 8};

    @ObfuscatedName("yf.p")
    public static final int[] field7578 = new int[]{16, 32, 64, 128};

    @ObfuscatedName("yf.w")
    public boolean field7573 = true;

    public class663(Scene arg0, RendererToolkit arg1, LocTypeList arg2, LocType arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12) {
        super(arg0, arg6, arg7, arg8, arg4, arg5, method12063(arg10, arg11));
        this.field7576 = new class116(arg1, arg2, arg3, arg10, arg11, this.field9807, arg5, this, arg9, arg12);
        this.field7577 = arg3.field6493 != 0 && !arg9;
        this.method15642(1);
    }

    @ObfuscatedName("yf.bn(I)Z")
    public boolean method12807() {
        return false;
    }

    @ObfuscatedName("yf.ba(I)Z")
    public boolean method12808() {
        return this.field7573;
    }

    @ObfuscatedName("uu.bd(III)I")
    public static int method12063(int arg0, int arg1) {
        return class542.field6575.field6590 == arg0 || class542.field6570.field6590 == arg0 ? field7578[arg1 & 0x3] : field7574[arg1 & 0x3];
    }

    @ObfuscatedName("yf.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        return this.field7575;
    }

    @ObfuscatedName("yf.bc(I)I")
    public int method12809() {
        return this.field7576.method2434();
    }

    @ObfuscatedName("yf.bp(I)I")
    public int method12811() {
        return this.field7576.method2436();
    }

    @ObfuscatedName("yf.bm(Lto;S)V")
    public void method12898(class539 arg0) {
        this.field7576.method2452(arg0);
    }

    @ObfuscatedName("yf.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        Model var2 = this.field7576.method2437(arg0, 2048, false, true);
        if (var2 == null) {
            return null;
        }
        Matrix4x3 var3 = this.method8558();
        ScaleRotTrans var4 = this.method8565();
        PickableEntity var5 = PickableEntity.method12205(this.field7577);
        int var6 = (int) var4.field3464.field3475 >> 9;
        int var7 = (int) var4.field3464.field3477 >> 9;
        this.field7576.method2438(arg0, var2, var3, var6, var6, var7, var7, true);
        var2.method271(var3, this.field9811[0], 0);
        if (this.field7576.field1229 != null) {
            ParticleList var8 = this.field7576.field1229.method8112();
            arg0.method733(var8);
        }
        this.field7573 = var2.method292() || this.field7576.field1229 != null;
        if (this.field7575 == null) {
            this.field7575 = GraphEntity.method15140((int) var4.field3464.field3475, (int) var4.field3464.field3476, (int) var4.field3464.field3477, var2);
        } else {
            GraphEntity.method11162(this.field7575, (int) var4.field3464.field3475, (int) var4.field3464.field3476, (int) var4.field3464.field3477, var2);
        }
        return var5;
    }

    @ObfuscatedName("yf.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
        Model var2 = this.field7576.method2437(arg0, 262144, true, true);
        if (var2 == null) {
            return;
        }
        Matrix4x3 var3 = this.method8558();
        ScaleRotTrans var4 = this.method8565();
        int var5 = (int) var4.field3464.field3475 >> 9;
        int var6 = (int) var4.field3464.field3477 >> 9;
        this.field7576.method2438(arg0, var2, var3, var5, var5, var6, var6, false);
    }

    @ObfuscatedName("yf.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        Model var4 = this.field7576.method2437(arg0, 131072, false, false);
        return var4 == null ? false : var4.method272(arg1, arg2, this.method8558(), false, 0);
    }

    @ObfuscatedName("yf.be(I)Z")
    public final boolean method12815() {
        return false;
    }

    @ObfuscatedName("yf.bw(Lra;Laes;IIIZI)V")
    public final void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
        throw new IllegalStateException();
    }

    @ObfuscatedName("yf.bo(B)V")
    public final void method12817() {
        throw new IllegalStateException();
    }

    @ObfuscatedName("yf.u(B)I")
    public int method2401() {
        return this.field7576.field1219;
    }

    @ObfuscatedName("yf.j(B)I")
    public int method2390() {
        return this.field7576.field1226;
    }

    @ObfuscatedName("yf.a(I)I")
    public int method2391() {
        return this.field7576.field1216;
    }

    @ObfuscatedName("yf.s(I)V")
    public void method2409() {
    }

    @ObfuscatedName("yf.c(I)Z")
    public boolean method2393() {
        return this.field7576.method2435();
    }

    @ObfuscatedName("yf.m(Lra;I)V")
    public void method2406(RendererToolkit arg0) {
        this.field7576.method2440(arg0);
    }

    @ObfuscatedName("yf.t(Lra;I)V")
    public void method2412(RendererToolkit arg0) {
        this.field7576.method2441(arg0);
    }
}
