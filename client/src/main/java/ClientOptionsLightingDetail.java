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
        if (this.value != 1 && this.value != 0) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("aea.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("aea.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("aea.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("aea.n(I)I")
    public int getValue() {
        return this.value;
    }
}
