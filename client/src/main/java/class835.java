import deob.ObfuscatedName;

@ObfuscatedName("ael")
public class class835 extends class478 {

    @ObfuscatedName("ael.t(B)V")
    public void method8357() {
        BasicMouseEvent var1 = this.method15630();
        if (var1 == null) {
            return;
        }
        int var2 = this.method8354(var1, 32767);
        int var3 = var1.method15183();
        if (var3 < 0) {
            var3 = 0;
        } else if (var3 > 65535) {
            var3 = 65535;
        }
        int var4 = var1.method15182();
        if (var4 < 0) {
            var4 = 0;
        } else if (var4 > 65535) {
            var4 = 65535;
        }
        byte var5 = 0;
        if (var1.method15181() == 2) {
            var5 = 1;
        }
        ClientMessage var6 = ClientMessage.method14781(ClientProt.field2893, client.field8975.field834);
        var6.field9467.method15345(var4 | var3 << 16);
        var6.field9467.method15287(var2 | var5 << 15);
        client.field8975.method1913(var6);
    }

    @ObfuscatedName("ael.l(I)Z")
    public boolean method8358() {
        return this.method15630() != null || this.field5048 < MonotonicTime.method5554() - 2000L;
    }

    @ObfuscatedName("ael.al(B)Ladv;")
    public BasicMouseEvent method15630() {
        return (BasicMouseEvent) client.field9136.method11563();
    }

    @ObfuscatedName("ael.f(I)Lada;")
    public ClientMessage method8375() {
        return ClientMessage.method14781(ClientProt.field2879, client.field8975.field834);
    }

    @ObfuscatedName("ael.m(Laet;Ladv;B)V")
    public void method8356(Packet arg0, BasicMouseEvent arg1) {
    }

    @ObfuscatedName("ael.c(I)I")
    public int method8355() {
        return 0;
    }
}
