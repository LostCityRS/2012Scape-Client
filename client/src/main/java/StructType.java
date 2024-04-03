import deob.ObfuscatedName;

@ObfuscatedName("aju")
public class StructType extends SecondaryNode {

    @ObfuscatedName("aju.t")
    public IterableMap field10396;

    @ObfuscatedName("aju.u(Laet;I)V")
    public void method16778(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method16779(arg0, var2);
        }
    }

    @ObfuscatedName("aju.j(Laet;II)V")
    public void method16779(Packet arg0, int arg1) {
        if (arg1 != 249) {
            return;
        }
        int var3 = arg0.g1();
        if (this.field10396 == null) {
            int var4 = IntMath.method2839(var3);
            this.field10396 = new IterableMap(var4);
        }
        for (int var5 = 0; var5 < var3; var5++) {
            boolean var6 = arg0.g1() == 1;
            int var7 = arg0.g3();
            Node var8;
            if (var6) {
                var8 = new ObjectNode(arg0.gjstr());
            } else {
                var8 = new IntNode(arg0.g4());
            }
            this.field10396.method11927(var8, (long) var7);
        }
    }

    @ObfuscatedName("aju.a(IIB)I")
    public int method16777(int arg0, int arg1) {
        if (this.field10396 == null) {
            return arg1;
        } else {
            IntNode var3 = (IntNode) this.field10396.method11923((long) arg0);
            return var3 == null ? arg1 : var3.field9556;
        }
    }

    @ObfuscatedName("aju.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method16782(int arg0, String arg1) {
        if (this.field10396 == null) {
            return arg1;
        } else {
            ObjectNode var3 = (ObjectNode) this.field10396.method11923((long) arg0);
            return var3 == null ? arg1 : (String) var3.field9550;
        }
    }
}
