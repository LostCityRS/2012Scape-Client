import deob.ObfuscatedName;

@ObfuscatedName("aes")
public abstract class GraphEntity extends GraphNode {

    @ObfuscatedName("aes.z")
    public Scene field9808;

    @ObfuscatedName("aes.n")
    public GraphEntity field9806;

    @ObfuscatedName("aes.o")
    public byte level;

    @ObfuscatedName("aes.q")
    public byte field9809;

    @ObfuscatedName("aes.p")
    public int field9810;

    @ObfuscatedName("aes.w")
    public ScreenBoundingBox[] field9811;

    public GraphEntity(Scene arg0) {
        this.field9808 = arg0;
    }

    @ObfuscatedName("aes.fg(I)I")
    public int method15633() {
        return 0;
    }

    @ObfuscatedName("aes.fi(II[Lacg;I)I")
    public int method15637(int arg0, int arg1, Light[] arg2) {
        long var4 = this.field9808.field4526[this.level][arg0][arg1];
        long var6 = 0L;
        int var8 = 0;
        while (var6 <= 48L) {
            int var9 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var9 <= 0) {
                break;
            }
            arg2[var8++] = this.field9808.field4539[var9 - 1].field4588;
            var6 += 16L;
        }
        for (int var10 = var8; var10 < 4; var10++) {
            arg2[var10] = null;
        }
        return var8;
    }

    @ObfuscatedName("adj.fb(IIILqa;I)Lok;")
    public static EntityBounds method15140(int arg0, int arg1, int arg2, Model arg3) {
        return arg3 == null ? null : new EntityBounds(arg0, arg1, arg2, arg3.N(), arg3.RA(), arg3.ya(), arg3.YA(), arg3.o(), arg3.AA(), arg3.ha());
    }

    @ObfuscatedName("sz.fw(Lok;IIILqa;I)V")
    public static void method11162(EntityBounds arg0, int arg1, int arg2, int arg3, Model arg4) {
        if (arg4 != null) {
            arg0.method7641(arg1, arg2, arg3, arg4.N(), arg4.RA(), arg4.ya(), arg4.YA(), arg4.o(), arg4.AA(), arg4.ha());
        }
    }

    @ObfuscatedName("aes.bp(I)I")
    public int method12811() {
        return -this.method12809();
    }

    @ObfuscatedName("aes.fs(IB)V")
    public void method15642(int arg0) {
        this.field9811 = new ScreenBoundingBox[arg0];
        for (int var2 = 0; var2 < this.field9811.length; var2++) {
            this.field9811[var2] = new ScreenBoundingBox();
        }
    }

    @ObfuscatedName("aes.bb(Lra;III)Z")
    public abstract boolean method12814(RendererToolkit arg0, int arg1, int arg2);

    @ObfuscatedName("aes.ba(I)Z")
    public abstract boolean method12808();

    @ObfuscatedName("aes.bw(Lra;Laes;IIIZI)V")
    public abstract void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5);

    @ObfuscatedName("aes.bo(B)V")
    public abstract void method12817();

    @ObfuscatedName("aes.bi(Lra;B)Loz;")
    public abstract PickableEntity method12812(RendererToolkit arg0);

    @ObfuscatedName("aes.br(Lra;I)Lok;")
    public abstract EntityBounds method12810(RendererToolkit arg0);

    @ObfuscatedName("aes.fh(Lra;I)Z")
    public abstract boolean method15634(RendererToolkit arg0);

    @ObfuscatedName("aes.fz(I)Z")
    public abstract boolean method15635();

    @ObfuscatedName("aes.be(I)Z")
    public abstract boolean method12815();

    @ObfuscatedName("aes.bn(I)Z")
    public abstract boolean method12807();

    @ObfuscatedName("aes.fu([Lacg;I)I")
    public abstract int method15639(Light[] arg0);

    @ObfuscatedName("aes.bc(I)I")
    public abstract int method12809();

    @ObfuscatedName("aes.bx(Lra;B)V")
    public abstract void method12851(RendererToolkit arg0);
}
