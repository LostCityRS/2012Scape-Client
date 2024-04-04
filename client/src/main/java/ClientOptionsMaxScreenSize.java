import deob.ObfuscatedName;

@ObfuscatedName("afo")
public class ClientOptionsMaxScreenSize extends ClientOption {

    public ClientOptionsMaxScreenSize(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsMaxScreenSize(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afo.z(B)V")
    public void method15764() {
        if (this.value < 1 || this.value > 3) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afo.u(I)I")
    public int getDefault() {
        return this.field6462.method15462().method11400() ? 3 : 2;
    }

    @ObfuscatedName("afo.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afo.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afo.n(I)I")
    public int getValue() {
        return this.value;
    }
}
