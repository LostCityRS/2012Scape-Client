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
        ClientMessage var1 = ClientMessage.method14781(ClientProt.field2852, client.field8975.field834);
        var1.field9467.p2(this.field6694);
        client.field8975.method1913(var1);
    }
}
