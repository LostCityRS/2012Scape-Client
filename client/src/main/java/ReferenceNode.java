import deob.ObfuscatedName;

@ObfuscatedName("ajc")
public abstract class ReferenceNode extends SecondaryNode {

    @ObfuscatedName("ajc.t")
    public final int weight;

    public ReferenceNode(int weight) {
        this.weight = weight;
    }

    @ObfuscatedName("ajc.u(B)Ljava/lang/Object;")
    public abstract Object get();

    @ObfuscatedName("ajc.j(B)Z")
    public abstract boolean isSoft();
}
