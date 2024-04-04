import deob.ObfuscatedName;

@ObfuscatedName("afi")
public class ClientOptionsPreset extends ClientOption {

    public ClientOptionsPreset(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsPreset(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afi.z(S)V")
    public void method15867() {
        if (this.value < 0 || this.value > 4) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afi.u(I)I")
    public int getDefault() {
        return 0;
    }

    @ObfuscatedName("afi.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afi.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afi.n(I)I")
    public int method15868() {
        return this.value;
    }
}
