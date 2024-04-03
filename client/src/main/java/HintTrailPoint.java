import deob.ObfuscatedName;

@ObfuscatedName("alb")
public class HintTrailPoint extends PrimaryLayerEntity {

    @ObfuscatedName("alb.r")
    public HintTrail field10648;

    @ObfuscatedName("alb.g")
    public Model field10647;

    public HintTrailPoint(Scene arg0, HintTrail arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg0, arg2, arg3, arg4, arg5, arg6, arg4 >> 9, arg4 >> 9, arg6 >> 9, arg6 >> 9, false, (byte) 0);
        this.field10648 = arg1;
    }

    @ObfuscatedName("alb.bb(Lra;III)Z")
    public boolean method12814(RendererToolkit arg0, int arg1, int arg2) {
        return false;
    }

    @ObfuscatedName("alb.be(I)Z")
    public boolean method12815() {
        return false;
    }

    @ObfuscatedName("alb.bn(I)Z")
    public boolean method12807() {
        if (this.field10647 == null) {
            return true;
        } else {
            return !this.field10647.method293();
        }
    }

    @ObfuscatedName("alb.ba(I)Z")
    public boolean method12808() {
        return this.field10647 == null ? false : this.field10647.method292();
    }

    @ObfuscatedName("alb.bw(Lra;Laes;IIIZI)V")
    public void method12816(RendererToolkit arg0, GraphEntity arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @ObfuscatedName("alb.bo(B)V")
    public void method12817() {
    }

    @ObfuscatedName("alb.bi(Lra;B)Loz;")
    public PickableEntity method12812(RendererToolkit arg0) {
        if (this.field10647 == null) {
            this.field10647 = this.field10648.method6950(arg0);
        }
        if (this.field10647 != null) {
            Matrix4x3 var2 = arg0.method516();
            Matrix4x3 var3 = this.method8558();
            ScaleRotTrans var4 = this.method8565();
            var2.method5115(var3);
            Tile var5 = this.field9808.field4497[this.field9807][(int) var4.field3464.field3475 >> 9][(int) var4.field3464.field3477 >> 9];
            if (var5 != null && var5.field4552 != null) {
                var2.method5116(0.0F, (float) -var5.field4552.field10495, 0.0F);
            }
            this.field10647.method271(var2, null, 0);
        }
        return null;
    }

    @ObfuscatedName("alb.bx(Lra;B)V")
    public void method12851(RendererToolkit arg0) {
    }

    @ObfuscatedName("alb.br(Lra;I)Lok;")
    public EntityBounds method12810(RendererToolkit arg0) {
        return null;
    }

    @ObfuscatedName("alb.bc(I)I")
    public int method12809() {
        return this.field10647 == null ? 0 : this.field10647.method278();
    }
}
