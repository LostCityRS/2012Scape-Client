import deob.ObfuscatedName;

@ObfuscatedName("alz")
public class HardWeightedNode extends WeightedNode {

    @ObfuscatedName("alz.l")
    public Object field10602;

    public HardWeightedNode(Object arg0, int arg1) {
        super(arg1);
        this.field10602 = arg0;
    }

    @ObfuscatedName("alz.u(B)Ljava/lang/Object;")
    public Object method16722() {
        return this.field10602;
    }

    @ObfuscatedName("alz.j(B)Z")
    public boolean method16724() {
        return false;
    }
}