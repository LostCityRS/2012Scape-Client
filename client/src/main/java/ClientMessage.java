import deob.ObfuscatedName;

@ObfuscatedName("ada")
public class ClientMessage extends Node {

    @ObfuscatedName("ada.s")
    public ClientProt field9469;

    @ObfuscatedName("ada.c")
    public int field9466;

    @ObfuscatedName("ada.m")
    public PacketBit buf;

    @ObfuscatedName("ada.t")
    public int field9465;

    @ObfuscatedName("ada.l")
    public static ClientMessage[] field9470 = new ClientMessage[300];

    @ObfuscatedName("ada.f")
    public static int field9468 = 0;

    @ObfuscatedName("ty.u(I)Lada;")
    public static ClientMessage method11377() {
        return field9468 == 0 ? new ClientMessage() : field9470[--field9468];
    }

    @ObfuscatedName("acx.j(Ljm;Lue;I)Lada;")
    public static ClientMessage createMessage(ClientProt arg0, Isaac arg1) {
        ClientMessage var2 = method11377();
        var2.field9469 = arg0;
        var2.field9466 = arg0.size;
        if (var2.field9466 == -1) {
            var2.buf = new PacketBit(260);
        } else if (var2.field9466 == -2) {
            var2.buf = new PacketBit(10000);
        } else if (var2.field9466 <= 18) {
            var2.buf = new PacketBit(20);
        } else if (var2.field9466 <= 98) {
            var2.buf = new PacketBit(100);
        } else {
            var2.buf = new PacketBit(260);
        }
        var2.buf.setIsaac(arg1);
        var2.buf.pIsaac1(var2.field9469.id);
        var2.field9465 = 0;
        return var2;
    }

    @ObfuscatedName("ju.a(B)Lada;")
    public static ClientMessage method4876() {
        ClientMessage var0 = method11377();
        var0.field9469 = null;
        var0.field9466 = 0;
        var0.buf = new PacketBit(5000);
        return var0;
    }

    @ObfuscatedName("ada.s(I)V")
    public void method15023() {
        if (field9468 < field9470.length) {
            field9470[++field9468 - 1] = this;
        }
    }
}
