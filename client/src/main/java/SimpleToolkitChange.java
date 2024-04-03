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
        ClientMessage var1 = ClientMessage.method14781(ClientProt.field2850, client.field8975.field834);
        var1.field9467.method15269(this.field6691.method6339());
        client.field8975.method1913(var1);
    }
}
