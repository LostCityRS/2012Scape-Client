import deob.ObfuscatedName;

@ObfuscatedName("oc")
public class SkyBoxFillMode implements SerializableEnum {

    @ObfuscatedName("oc.u")
    public static final SkyBoxFillMode field4468 = new SkyBoxFillMode(0);

    @ObfuscatedName("oc.j")
    public static final SkyBoxFillMode field4467 = new SkyBoxFillMode(1);

    @ObfuscatedName("oc.a")
    public int field4466;

    public SkyBoxFillMode(int arg0) {
        this.field4466 = arg0;
    }

    @ObfuscatedName("aay.u(I)[Loc;")
    public static SkyBoxFillMode[] method14028() {
        return new SkyBoxFillMode[]{field4468, field4467};
    }

    @ObfuscatedName("oc.j(B)I")
    public int getId() {
        return this.field4466;
    }
}
