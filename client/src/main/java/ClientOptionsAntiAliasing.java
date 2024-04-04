import deob.ObfuscatedName;

@ObfuscatedName("afr")
public class ClientOptionsAntiAliasing extends ClientOption {

    public ClientOptionsAntiAliasing(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsAntiAliasing(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afr.z(I)V")
    public void method15826() {
        if (this.field6462.toolkit.method15776() && !RendererToolkit.method3321(this.field6462.toolkit.getValue())) {
            this.value = 0;
        }
        if (this.value < 0 || this.value > 2) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afr.u(I)I")
    public int getDefault() {
        return 0;
    }

    @ObfuscatedName("afr.n(B)Z")
    public boolean method15828() {
        return RendererToolkit.method3321(this.field6462.toolkit.getValue());
    }

    @ObfuscatedName("afr.j(IB)I")
    public int canSetValue(int arg0) {
        return RendererToolkit.method3321(this.field6462.toolkit.getValue()) ? 1 : 3;
    }

    @ObfuscatedName("afr.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afr.o(S)I")
    public int getValue() {
        return this.value;
    }
}
