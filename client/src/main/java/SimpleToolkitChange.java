import deob.ObfuscatedName;

@ObfuscatedName("tj")
public class SimpleToolkitChange implements SendablePacket {

    @ObfuscatedName("tj.u")
    public final ToolkitType field6691;

    public SimpleToolkitChange(ToolkitType arg0) {
        this.field6691 = arg0;
    }

    @ObfuscatedName("tj.u(I)V")
    public void method11847() {
        ClientMessage var1 = ClientMessage.createMessage(ClientProt.field2850, client.gameConnection.randomOut);
        var1.field9467.p1_alt2(this.field6691.method6339());
        client.gameConnection.queue(var1);
    }
}
