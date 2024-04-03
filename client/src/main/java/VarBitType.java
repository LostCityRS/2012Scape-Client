import deob.ObfuscatedName;

@ObfuscatedName("pe")
public class VarBitType implements PlayerTypeRelated {

    @ObfuscatedName("pe.u")
    public int field4669;

    @ObfuscatedName("pe.j")
    public int field4668;

    @ObfuscatedName("pe.a")
    public int field4670;

    @ObfuscatedName("pe.u(Laet;I)V")
    public void method7682(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method7680(arg0, var2);
        }
    }

    @ObfuscatedName("pe.j(Laet;II)V")
    public void method7680(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field4669 = arg0.g2();
            this.field4668 = arg0.g1();
            this.field4670 = arg0.g1();
        }
    }
}
