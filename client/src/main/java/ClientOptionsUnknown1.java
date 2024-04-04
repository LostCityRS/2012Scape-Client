import deob.ObfuscatedName;

@ObfuscatedName("afw")
public class ClientOptionsUnknown1 extends ClientOption {

    public ClientOptionsUnknown1(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsUnknown1(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afw.z(I)V")
    public void method15878() {
        if (this.value != 1 && this.value != 0) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afw.u(I)I")
    public int getDefault() {
        return 0;
    }

    @ObfuscatedName("afw.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afw.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afw.n(B)I")
    public int method15877() {
        return this.value;
    }
}
