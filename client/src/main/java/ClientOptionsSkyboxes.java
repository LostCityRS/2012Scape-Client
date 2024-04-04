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
        if (this.value < 0 || this.value > 1) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afb.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afb.n(I)Z")
    public boolean method15806() {
        return RendererToolkit.method3321(this.field6462.toolkit.getValue());
    }

    @ObfuscatedName("afb.j(IB)I")
    public int canSetValue(int arg0) {
        return RendererToolkit.method3321(this.field6462.toolkit.getValue()) ? 1 : 3;
    }

    @ObfuscatedName("afb.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afb.o(I)I")
    public int getValue() {
        return this.value;
    }
}
