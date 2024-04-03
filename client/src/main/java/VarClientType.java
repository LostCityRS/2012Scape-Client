import deob.ObfuscatedName;

@ObfuscatedName("vr")
public class VarClientType {

    @ObfuscatedName("vr.a")
    public char field7153;

    @ObfuscatedName("vr.s")
    public int field7156 = 1;

    @ObfuscatedName("vr.u(Laet;I)V")
    public void method12349(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method12350(arg0, var2);
        }
    }

    @ObfuscatedName("vr.j(Laet;IS)V")
    public void method12350(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field7153 = Cp1252.method16898(arg0.g1b());
        } else if (arg1 == 2) {
            this.field7156 = 0;
        }
    }
}
