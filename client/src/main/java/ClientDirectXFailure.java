import deob.ObfuscatedName;

@ObfuscatedName("tl")
public class ClientDirectXFailure implements SendablePacket {

    @ObfuscatedName("tl.u")
    public final int field6694;

    public ClientDirectXFailure(int arg0) {
        this.field6694 = arg0;
    }

    @ObfuscatedName("tl.u(I)V")
    public void method11847() {
        ClientMessage var1 = ClientMessage.createMessage(ClientProt.field2852, client.gameConnection.randomOut);
        var1.field9467.p2(this.field6694);
        client.gameConnection.queue(var1);
    }
}
