import deob.ObfuscatedName;

@ObfuscatedName("pi")
public class KeyBinding implements Binding {

    @ObfuscatedName("pi.u")
    public final int field4815;

    @ObfuscatedName("pi.j")
    public final int field4816;

    public KeyBinding(int arg0, int arg1) {
        this.field4815 = arg0;
        this.field4816 = arg1;
    }

    @ObfuscatedName("pi.u(Ladv;[Lox;ILoq;I)Z")
    public boolean test(BasicMouseEvent arg0, KeyboardEvent[] arg1, int arg2, Keyboard arg3) {
        for (int var5 = 0; var5 < arg2 && var5 < arg1.length; var5++) {
            KeyboardEvent var6 = arg1[var5];
            if (var6 != null && var6.method7286() == this.field4815 && var6.method7285() == this.field4816) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ul.a(Laet;I)Lpi;")
    public static KeyBinding method11866(Packet arg0) {
        int var1 = arg0.g1();
        int var2 = arg0.g1();
        return new KeyBinding(var1, var2);
    }
}
