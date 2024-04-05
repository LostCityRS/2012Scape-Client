import deob.ObfuscatedName;

@ObfuscatedName("alz")
public class HardReferenceNode extends ReferenceNode {

    @ObfuscatedName("alz.l")
    public Object referent;

    public HardReferenceNode(Object referent, int weight) {
        super(weight);
        this.referent = referent;
    }

    @ObfuscatedName("alz.u(B)Ljava/lang/Object;")
    public Object get() {
        return this.referent;
    }

    @ObfuscatedName("alz.j(B)Z")
    public boolean isSoft() {
        return false;
    }
}
