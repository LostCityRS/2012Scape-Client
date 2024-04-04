import deob.ObfuscatedName;

@ObfuscatedName("wg")
public class VarcStrTypeList {

    @ObfuscatedName("wg.u")
    public final Js5 field7323;

    @ObfuscatedName("wg.j")
    public int field7322;

    public VarcStrTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
        new WeightedCache(64);
        this.field7323 = arg2;
        this.field7322 = this.field7323.getGroupCapacity(Js5ConfigGroup.VARCSTR.field1668);
    }
}
