import deob.ObfuscatedName;

@ObfuscatedName("lp")
public class StockMarketSlot {

    @ObfuscatedName("lp.u")
    public byte field3759;

    @ObfuscatedName("lp.j")
    public int field3758;

    @ObfuscatedName("lp.a")
    public int field3762;

    @ObfuscatedName("lp.s")
    public int field3761;

    @ObfuscatedName("lp.c")
    public int field3760;

    @ObfuscatedName("lp.m")
    public int field3763;

    public StockMarketSlot() {
    }

    public StockMarketSlot(Packet arg0) {
        this.field3759 = arg0.method15238();
        this.field3758 = arg0.method15239();
        this.field3762 = arg0.method15379();
        this.field3761 = arg0.method15379();
        this.field3760 = arg0.method15379();
        this.field3763 = arg0.method15379();
    }

    @ObfuscatedName("lp.u(I)I")
    public int method6017() {
        return this.field3759 & 0x7;
    }

    @ObfuscatedName("lp.j(I)I")
    public int method6020() {
        return (this.field3759 & 0x8) == 8 ? 1 : 0;
    }
}
