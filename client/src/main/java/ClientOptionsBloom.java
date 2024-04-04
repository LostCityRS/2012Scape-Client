import deob.ObfuscatedName;

@ObfuscatedName("afl")
public class ClientOptionsBloom extends ClientOption {

    public ClientOptionsBloom(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsBloom(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afl.z(I)V")
    public void method15818() {
        if (this.field6462.toolkit.method15776() && !RendererToolkit.method3321(this.field6462.toolkit.getValue())) {
            this.value = 0;
        }
        if (this.value < 0 || this.value > 1) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afl.u(I)I")
    public int getDefault() {
        return 0;
    }

    @ObfuscatedName("afl.n(I)Z")
    public boolean method15815() {
        return RendererToolkit.method3321(this.field6462.toolkit.getValue());
    }

    @ObfuscatedName("afl.j(IB)I")
    public int canSetValue(int arg0) {
        return RendererToolkit.method3321(this.field6462.toolkit.getValue()) ? 1 : 3;
    }

    @ObfuscatedName("afl.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afl.o(I)I")
    public int method15816() {
        return this.value;
    }
}
