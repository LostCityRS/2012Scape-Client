import deob.ObfuscatedName;

@ObfuscatedName("aff")
public class ClientOptionsCpuUsage extends ClientOption {

    public ClientOptionsCpuUsage(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsCpuUsage(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("aff.z(B)V")
    public void method15873() {
        if (this.value < 0 && this.value > 4) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("aff.u(I)I")
    public int getDefault() {
        return this.field6462.method15462().method11398() > 1 ? 4 : 2;
    }

    @ObfuscatedName("aff.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("aff.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("aff.n(I)I")
    public int method15874() {
        return this.value;
    }
}
