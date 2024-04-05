import deob.ObfuscatedName;

import java.lang.ref.SoftReference;

@ObfuscatedName("alq")
public class SoftReferenceNode extends ReferenceNode {

    @ObfuscatedName("alq.l")
    public SoftReference referent;

    public SoftReferenceNode(Object referent, int weight) {
        super(weight);
        this.referent = new SoftReference(referent);
    }

    @ObfuscatedName("alq.u(B)Ljava/lang/Object;")
    public Object get() {
        return this.referent.get();
    }

    @ObfuscatedName("alq.j(B)Z")
    public boolean isSoft() {
        return true;
    }
}
