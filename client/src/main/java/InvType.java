import deob.ObfuscatedName;

@ObfuscatedName("aez")
public class InvType extends SecondaryNode implements class464 {

    @ObfuscatedName("aez.t")
    public int field9804 = 0;

    @ObfuscatedName("aez.l")
    public int[] field9801;

    @ObfuscatedName("aez.f")
    public int[] field9803;

    @ObfuscatedName("aez.d")
    public int field9802 = 0;

    @ObfuscatedName("aez.u(Laet;I)V")
    public void method15624(Packet arg0) {
        while (true) {
            int var2 = arg0.method15220();
            if (var2 == 0) {
                return;
            }
            this.method15621(arg0, var2);
        }
    }

    @ObfuscatedName("aez.j(Laet;II)V")
    public void method15621(Packet arg0, int arg1) {
        if (arg1 == 2) {
            this.field9802 = arg0.method15239();
        } else if (arg1 == 4) {
            this.field9804 = arg0.method15220();
            this.field9801 = new int[this.field9804];
            this.field9803 = new int[this.field9804];
            for (int var3 = 0; var3 < this.field9804; var3++) {
                this.field9801[var3] = arg0.method15239();
                this.field9803[var3] = arg0.method15239();
            }
        }
    }
}
