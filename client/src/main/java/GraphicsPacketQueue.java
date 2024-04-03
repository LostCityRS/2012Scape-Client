import deob.ObfuscatedName;

import java.util.LinkedList;

@ObfuscatedName("ul")
public class GraphicsPacketQueue {

    @ObfuscatedName("ul.u")
    public static LinkedList field6695 = new LinkedList();

    public GraphicsPacketQueue() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("adp.u(Lagp;I)V")
    public static void method15160(ClientAutoSetupResult arg0) {
        method5935(arg0);
    }

    @ObfuscatedName("ax.j(IB)V")
    public static void method1838(int arg0) {
        method5935(new ClientDirectXFailure(arg0));
    }

    @ObfuscatedName("uh.a(Lwt;I)V")
    public static void method12023(ToolkitType arg0) {
        method5935(new SimpleToolkitChange(arg0));
    }

    @ObfuscatedName("lt.s(Lts;B)V")
    public static void method5935(SendablePacket arg0) {
        while (field6695.size() > 10) {
            field6695.remove();
        }
        field6695.add(arg0);
    }

    @ObfuscatedName("jh.c(I)V")
    public static void method4786() {
        if (client.field8923 != 1 || client.field8975 == null) {
            return;
        }
        while (true) {
            SendablePacket var0 = (SendablePacket) field6695.poll();
            if (var0 == null) {
                return;
            }
            var0.method11847();
        }
    }
}
