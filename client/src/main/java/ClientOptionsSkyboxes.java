import deob.ObfuscatedName;

@ObfuscatedName("afb")
public class ClientOptionsSkyboxes extends ClientOption {

    public ClientOptionsSkyboxes(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsSkyboxes(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afb.z(I)V")
    public void method15804() {
        if (this.field6461 < 0 || this.field6461 > 1) {
            this.field6461 = this.method11386();
        }
    }

    @ObfuscatedName("afb.u(I)I")
    public int method11386() {
        return 1;
    }

    @ObfuscatedName("afb.n(I)Z")
    public boolean method15806() {
        return RendererToolkit.method3321(this.field6462.field9661.method15781());
    }

    @ObfuscatedName("afb.j(IB)I")
    public int method11387(int arg0) {
        return RendererToolkit.method3321(this.field6462.field9661.method15781()) ? 1 : 3;
    }

    @ObfuscatedName("afb.s(II)V")
    public void method11389(int arg0) {
        this.field6461 = arg0;
    }

    @ObfuscatedName("afb.o(I)I")
    public int getValue() {
        return this.field6461;
    }
}
