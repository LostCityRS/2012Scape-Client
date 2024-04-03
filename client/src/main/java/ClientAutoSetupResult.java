import deob.ObfuscatedName;

@ObfuscatedName("agp")
public class ClientAutoSetupResult extends AutoSetupResult implements SendablePacket {

    @ObfuscatedName("agp.u(I)V")
    public void method11847() {
        ClientMessage var1 = ClientMessage.method14781(ClientProt.field2952, client.field8975.field834);
        var1.field9467.p2_alt1(this.field7384);
        var1.field9467.p3(this.field7382);
        var1.field9467.p1(this.field7386);
        var1.field9467.p3_alt2(this.field7373);
        var1.field9467.p1_alt3(this.field7380);
        var1.field9467.p2(this.field7378);
        var1.field9467.p3_alt2(this.field7381);
        client.field8975.method1913(var1);
    }

    @ObfuscatedName("agp.f(IB)V")
    public void method15943(int arg0) {
        this.field7386 = arg0;
    }

    @ObfuscatedName("agp.d(II)V")
    public void method15941(int arg0) {
        this.field7384 |= arg0;
    }

    @ObfuscatedName("agp.z(II)V")
    public void method15939(int arg0) {
        this.field7380 = arg0;
    }

    @ObfuscatedName("agp.n(IIB)V")
    public void method15942(int arg0, int arg1) {
        if (arg0 == 0 && arg1 > 32767) {
            arg1 = 32767;
        } else if (arg1 > 8388607) {
            arg1 = 8388607;
        }
        switch (arg0) {
            case 0:
                this.field7378 = arg1;
                break;
            case 1:
                this.field7382 = arg1;
                break;
            case 2:
                this.field7381 = arg1;
                break;
            case 3:
                this.field7373 = arg1;
        }
    }
}
