import deob.ObfuscatedName;

@ObfuscatedName("wv")
public class ParamType {

    @ObfuscatedName("wv.u")
    public char field7286;

    @ObfuscatedName("wv.j")
    public int field7287;

    @ObfuscatedName("wv.a")
    public String field7288;

    @ObfuscatedName("wv.s")
    public boolean field7289 = true;

    @ObfuscatedName("wv.u(Laet;B)V")
    public void method12580(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method12581(arg0, var2);
        }
    }

    @ObfuscatedName("wv.j(Laet;II)V")
    public void method12581(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field7286 = Cp1252.method16898(arg0.g1b());
        } else if (arg1 == 2) {
            this.field7287 = arg0.g4();
        } else if (arg1 == 4) {
            this.field7289 = false;
        } else if (arg1 == 5) {
            this.field7288 = arg0.gjstr();
        }
    }

    @ObfuscatedName("wv.a(I)Z")
    public boolean method12586() {
        return this.field7286 == 's';
    }
}
