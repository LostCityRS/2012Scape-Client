import deob.ObfuscatedName;

@ObfuscatedName("ahj")
public class CutsceneAction_Sub14 extends CutsceneAction_Sub25 {

    @ObfuscatedName("ahj.c")
    public final int field10035;

    @ObfuscatedName("ahj.m")
    public final int field10034;

    @ObfuscatedName("ahj.t")
    public final int field10033;

    public CutsceneAction_Sub14(Packet arg0) {
        super(arg0);
        int var2 = arg0.g4s();
        this.field10035 = var2 >>> 16;
        this.field10034 = var2 & 0xFFFF;
        this.field10033 = arg0.g1();
    }

    @ObfuscatedName("ahj.j(I)V")
    public void method2873() {
        int var1 = this.field10035 * 512 + 256;
        int var2 = this.field10034 * 512 + 256;
        int var3 = this.field10033;
        if (var3 < 3 && client.world.getSceneLevelTileFlags().isLinkBelow(this.field10035, this.field10034)) {
            var3++;
        }
        SpotAnimation var4 = new SpotAnimation(client.world.getScene(), this.field8498, 0, this.field10033, var3, var1, client.getHeightmapY(var1, var2, this.field10033) - this.field8497, var2, this.field10035, this.field10035, this.field10034, this.field10034, this.field8496, false, 0);
        client.field9090.method11927(new SpotAnimationEntityNode(var4), (long) (this.field10035 << 16 | this.field10034));
    }
}
