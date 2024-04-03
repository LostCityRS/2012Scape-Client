import deob.ObfuscatedName;

@ObfuscatedName("aea")
public class ClientOptionsLightingDetail extends ClientOption {

    public ClientOptionsLightingDetail(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsLightingDetail(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("aea.z(B)V")
    public void method15665() {
        if (this.field6461 != 1 && this.field6461 != 0) {
            this.field6461 = this.method11386();
        }
    }

    @ObfuscatedName("aea.u(I)I")
    public int method11386() {
        return 1;
    }

    @ObfuscatedName("aea.j(IB)I")
    public int method11387(int arg0) {
        return 1;
    }

    @ObfuscatedName("aea.s(II)V")
    public void method11389(int arg0) {
        this.field6461 = arg0;
    }

    @ObfuscatedName("aea.n(I)I")
    public int method15667() {
        return this.field6461;
    }
}
