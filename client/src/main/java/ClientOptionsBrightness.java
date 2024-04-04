import deob.ObfuscatedName;

@ObfuscatedName("aed")
public class ClientOptionsBrightness extends ClientOption {

    public ClientOptionsBrightness(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsBrightness(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("aed.z(B)V")
    public void method15673() {
        if (this.value < 0 || this.value > 4) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("aed.u(I)I")
    public int getDefault() {
        return 3;
    }

    @ObfuscatedName("aed.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("aed.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("aed.n(I)I")
    public int method15672() {
        return this.value;
    }
}
