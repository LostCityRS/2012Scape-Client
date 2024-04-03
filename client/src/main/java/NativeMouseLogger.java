import deob.ObfuscatedName;

import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("aec")
public class NativeMouseLogger extends MouseLogger {

    @ObfuscatedName("aec.m")
    public final Queue field9805 = new LinkedList();

    @ObfuscatedName("aec.al(Lajn;I)V")
    public void method15627(NativeMouseEvent arg0) {
        this.field9805.add(arg0);
        if (this.field9805.size() > 10) {
            this.field9805.poll();
        }
    }

    @ObfuscatedName("aec.t(B)V")
    public void method8357() {
        NativeMouseEvent var1 = (NativeMouseEvent) this.field9805.poll();
        if (var1 == null) {
            return;
        }
        ClientMessage var2 = ClientMessage.createMessage(ClientProt.field2956, client.gameConnection.randomOut);
        var2.field9467.p1_alt1(var1.method16844() << 1 | var1.method16842() & 0x1);
        var2.field9467.p2_alt2(this.method8354(var1, 65535));
        var2.field9467.p4_alt3(var1.method15182() | var1.method15183() << 16);
        client.gameConnection.queue(var2);
        var1.method15186();
    }

    @ObfuscatedName("aec.l(I)Z")
    public boolean method8358() {
        return !this.field9805.isEmpty() || this.field5048 < MonotonicTime.method5554() - 2000L;
    }

    @ObfuscatedName("aec.f(I)Lada;")
    public ClientMessage method8375() {
        return ClientMessage.createMessage(ClientProt.field2947, client.gameConnection.randomOut);
    }

    @ObfuscatedName("aec.at(Laet;Lajn;I)V")
    public void method15626(Packet arg0, NativeMouseEvent arg1) {
        arg0.p1(arg1.method16842());
    }

    @ObfuscatedName("aec.c(I)I")
    public int method8355() {
        return 1;
    }

    @ObfuscatedName("aec.m(Laet;Ladv;B)V")
    public void method8356(Packet arg0, BasicMouseEvent arg1) {
        this.method15626(arg0, (NativeMouseEvent) arg1);
    }
}
