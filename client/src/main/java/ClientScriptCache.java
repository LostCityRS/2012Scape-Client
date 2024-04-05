import deob.ObfuscatedName;

@ObfuscatedName("pk")
public final class ClientScriptCache {

    @ObfuscatedName("pk.u")
    public SecondaryNode field4834 = new SecondaryNode();

    @ObfuscatedName("pk.j")
    public int field4831;

    @ObfuscatedName("pk.a")
    public int field4832;

    @ObfuscatedName("pk.s")
    public HashTable field4833;

    @ObfuscatedName("pk.c")
    public SecondaryLinkedList field4830 = new SecondaryLinkedList();

    public ClientScriptCache(int arg0) {
        this.field4831 = arg0;
        this.field4832 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4833 = new HashTable(var2);
    }

    @ObfuscatedName("pk.u(J)Ladi;")
    public SecondaryNode method7965(long arg0) {
        SecondaryNode var3 = (SecondaryNode) this.field4833.get(arg0);
        if (var3 != null) {
            this.field4830.addFirst(var3);
        }
        return var3;
    }

    @ObfuscatedName("pk.j(Ladi;J)V")
    public void method7958(SecondaryNode arg0, long arg1) {
        if (this.field4832 == 0) {
            SecondaryNode var4 = this.field4830.removeHead();
            var4.unlink();
            var4.unlinkSecondary();
            if (this.field4834 == var4) {
                SecondaryNode var5 = this.field4830.removeHead();
                var5.unlink();
                var5.unlinkSecondary();
            }
        } else {
            this.field4832--;
        }
        this.field4833.put(arg0, arg1);
        this.field4830.addFirst(arg0);
    }

    @ObfuscatedName("pk.a(B)V")
    public void method7959() {
        this.field4830.clear();
        this.field4833.clear();
        this.field4834 = new SecondaryNode();
        this.field4832 = this.field4831;
    }
}
