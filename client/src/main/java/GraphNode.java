import deob.ObfuscatedName;

@ObfuscatedName("ri")
public class GraphNode {

    @ObfuscatedName("ri.u")
    public ScaleRotTrans field5111 = new ScaleRotTrans();

    @ObfuscatedName("ri.j")
    public ScaleRotTrans field5115 = new ScaleRotTrans();

    @ObfuscatedName("ri.a")
    public boolean field5112 = true;

    @ObfuscatedName("ri.s")
    public ScaleRotTrans field5113 = new ScaleRotTrans();

    @ObfuscatedName("ri.c")
    public boolean field5110 = true;

    @ObfuscatedName("ri.m")
    public Matrix4x3 field5117;

    @ObfuscatedName("ri.t")
    public boolean field5116;

    @ObfuscatedName("ri.l")
    public GraphNode field5114;

    @ObfuscatedName("ri.f")
    public GraphNode field5118;

    @ObfuscatedName("ri.d")
    public GraphNode field5119;

    public GraphNode() {
        new Matrix4x4();
        new Matrix4x4();
        this.field5117 = new Matrix4x3();
        this.field5116 = true;
        this.field5114 = null;
        this.field5118 = null;
        this.field5119 = null;
    }

    @ObfuscatedName("ri.y()Lkx;")
    public final ScaleRotTrans method8545() {
        return this.field5111;
    }

    @ObfuscatedName("ri.e()Lkx;")
    public final ScaleRotTrans method8565() {
        if (this.field5112) {
            this.field5112 = false;
            this.field5115.method5191(this.field5111);
            if (this.field5114 != null) {
                this.field5115.method5190(this.field5114.method8565());
            }
        }
        return this.field5115;
    }

    @ObfuscatedName("ri.ay()Lkx;")
    public final ScaleRotTrans method8547() {
        if (this.field5110) {
            this.field5110 = false;
            this.field5113.method5191(this.method8565());
            this.field5113.method5192();
        }
        return this.field5115;
    }

    @ObfuscatedName("ri.af()Lkc;")
    public final Matrix4x3 method8558() {
        if (this.field5116) {
            this.field5116 = false;
            this.field5117.method5101(this.method8565());
        }
        return this.field5117;
    }

    @ObfuscatedName("ri.ar(Lkx;)V")
    public final void method8548(ScaleRotTrans arg0) {
        this.field5111.method5191(arg0);
        this.method8554();
        if (this.field5118 != null) {
            this.field5118.method8555();
        }
    }

    @ObfuscatedName("ri.an(Lkn;)V")
    public final void method8550(Quaternion arg0) {
        this.field5111.field3463.method5214(arg0);
        this.method8554();
        if (this.field5118 != null) {
            this.field5118.method8555();
        }
    }

    @ObfuscatedName("ri.ap(Lko;)V")
    public final void method8551(Vector3 arg0) {
        this.field5111.field3464.method5334(arg0);
        this.method8554();
        if (this.field5118 != null) {
            this.field5118.method8555();
        }
    }

    @ObfuscatedName("ri.ag(FFF)V")
    public final void method8552(float arg0, float arg1, float arg2) {
        this.field5111.field3464.method5373(arg0, arg1, arg2);
        this.method8554();
        if (this.field5118 != null) {
            this.field5118.method8555();
        }
    }

    @ObfuscatedName("ri.as(Lkx;)V")
    public final void method8553(ScaleRotTrans arg0) {
        if (this.field5114 == null) {
            this.method8548(arg0);
        } else {
            ScaleRotTrans var2 = new ScaleRotTrans(arg0);
            var2.method5190(this.field5114.method8547());
            this.method8548(var2);
        }
    }

    @ObfuscatedName("ri.ai()V")
    public final void method8554() {
        this.field5112 = true;
        this.field5110 = true;
        this.field5116 = true;
    }

    @ObfuscatedName("ri.ao()V")
    public final void method8555() {
        this.method8554();
        if (this.field5118 != null) {
            this.field5118.method8555();
        }
        if (this.field5119 != null) {
            this.field5119.method8555();
        }
    }

    @ObfuscatedName("ri.al()V")
    public final void method8566() {
        if (this.field5114 != null) {
            GraphNode var1 = this.field5114.field5118;
            if (var1 == this) {
                this.field5114.field5118 = this.field5119;
            } else {
                while (var1.field5119 != this) {
                    var1 = var1.field5119;
                }
                var1.field5119 = this.field5119;
            }
        }
        this.method8554();
        if (this.field5118 != null) {
            this.field5118.method8555();
            GraphNode var2 = this.field5118;
            while (true) {
                var2.field5111.method5190(this.field5111);
                var2.field5114 = this.field5114;
                if (var2.field5119 == null) {
                    var2.field5119 = this.field5114.field5118;
                    this.field5114.field5118 = this.field5118;
                    break;
                }
                var2 = var2.field5119;
            }
        }
        this.field5114 = null;
        this.field5119 = null;
        this.field5118 = null;
    }
}
