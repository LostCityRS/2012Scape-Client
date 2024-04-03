import deob.ObfuscatedName;

@ObfuscatedName("akm")
public abstract class GroundDecorLayerEntity extends GraphEntity {

    @ObfuscatedName("akm.b")
    public short field10495;

    public GroundDecorLayerEntity(Scene arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg0);
        this.level = (byte) arg4;
        this.field9809 = (byte) arg5;
        this.field10495 = (short) arg6;
        this.method8551(new Vector3((float) arg1, (float) arg2, (float) arg3));
    }

    @ObfuscatedName("akm.fu([Lacg;I)I")
    public int method15639(Light[] arg0) {
        Vector3 var2 = this.getTransform().trans;
        return this.method15637((int) var2.x >> this.field9808.field4510, (int) var2.z >> this.field9808.field4510, arg0);
    }

    @ObfuscatedName("akm.fh(Lra;I)Z")
    public boolean method15634(RendererToolkit arg0) {
        Vector3 var2 = this.getTransform().trans;
        return this.field9808.field4493.method7599(this.field9809, (int) var2.x >> this.field9808.field4510, (int) var2.z >> this.field9808.field4510);
    }

    @ObfuscatedName("akm.fz(I)Z")
    public boolean method15635() {
        Vector3 var1 = this.getTransform().trans;
        return this.field9808.field4544[this.field9808.field4531 + (((int) var1.x >> this.field9808.field4510) - this.field9808.field4521)][this.field9808.field4531 + (((int) var1.z >> this.field9808.field4510) - this.field9808.field4503)];
    }
}
