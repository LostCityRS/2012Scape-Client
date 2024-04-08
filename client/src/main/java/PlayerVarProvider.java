import deob.ObfuscatedName;

@ObfuscatedName("ci")
public final class PlayerVarProvider {

    @ObfuscatedName("ci.u")
    public HashTable field1196;

    @ObfuscatedName("ci.j")
    public final int field1195;

    public PlayerVarProvider(int arg0) {
        this.field1195 = arg0;
    }

    @ObfuscatedName("ci.u(I)V")
    public void method2377() {
        if (this.field1196 != null) {
            this.field1196.clear();
        }
    }

    @ObfuscatedName("ci.j(III)V")
    public void method2372(int arg0, int arg1) {
        if (this.field1196 == null) {
            this.field1196 = new HashTable(this.field1195);
        }
        IntNode var3 = (IntNode) this.field1196.get((long) arg0);
        if (var3 == null) {
            IntNode var4 = new IntNode(arg1);
            this.field1196.put(var4, (long) arg0);
        } else {
            var3.value = arg1;
        }
    }

    @ObfuscatedName("ci.a(II)I")
    public int method2373(int arg0) {
        IntNode var2 = (IntNode) this.field1196.get((long) arg0);
        if (var2 == null) {
            VarPlayerType var3 = Statics.field6667.method4890(arg0);
            return var3.field3309 == 'i' ? 0 : -1;
        } else {
            return var2.value;
        }
    }

    @ObfuscatedName("ci.s(II)I")
    public int method2375(int arg0) {
        VarBitType var2 = Statics.field4645.method7668(arg0);
        int var3 = var2.field4669;
        int var4 = var2.field4670 == 31 ? -1 : (0x1 << var2.field4670 + 1) - 1;
        return (this.method2373(var3) & var4) >>> var2.field4668;
    }
}
