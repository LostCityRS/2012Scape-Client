import deob.ObfuscatedName;

import java.io.IOException;

@ObfuscatedName("mx")
public class MapLogicRelated {

    public MapLogicRelated() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("rd.u(ZI)V")
    public static void method8512(boolean arg0) {
        AudioRenderer.method3461();
        if (!client.isStateGame(client.state)) {
            return;
        }
        ServerConnection[] var1 = client.connections;
        for (int var2 = 0; var2 < var1.length; var2++) {
            ServerConnection var3 = var1[var2];
            var3.numConnections++;
            if (var3.numConnections < 50 && !arg0) {
                return;
            }
            var3.numConnections = 0;
            if (!var3.disconnected && var3.getStream() != null) {
                ClientMessage var4 = ClientMessage.createMessage(ClientProt.NO_TIMEOUT, var3.randomOut);
                var3.queue(var4);
                try {
                    var3.method1912();
                } catch (IOException var6) {
                    var3.disconnected = true;
                }
            }
        }
        AudioRenderer.method3461();
    }
}
