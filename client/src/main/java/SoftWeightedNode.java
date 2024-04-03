import deob.ObfuscatedName;

import java.lang.ref.SoftReference;

@ObfuscatedName("alq")
public class SoftWeightedNode extends WeightedNode {

    @ObfuscatedName("alq.l")
    public SoftReference field10601;

    public SoftWeightedNode(Object arg0, int arg1) {
        super(arg1);
        this.field10601 = new SoftReference(arg0);
    }

    @ObfuscatedName("alq.u(B)Ljava/lang/Object;")
    public Object method16722() {
        return this.field10601.get();
    }

    @ObfuscatedName("alq.j(B)Z")
    public boolean method16724() {
        return true;
    }
}
