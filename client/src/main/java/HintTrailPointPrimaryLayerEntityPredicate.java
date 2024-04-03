import deob.ObfuscatedName;

@ObfuscatedName("ns")
public class HintTrailPointPrimaryLayerEntityPredicate implements PrimaryLayerEntityPredicate {

    @ObfuscatedName("ns.u")
    public final HintTrailPoint field4222;

    public HintTrailPointPrimaryLayerEntityPredicate(HintTrailPoint arg0) {
        this.field4222 = arg0;
    }

    @ObfuscatedName("ns.u(Laku;I)Z")
    public boolean method1360(PrimaryLayerEntity arg0) {
        return this.field4222 == arg0;
    }
}
