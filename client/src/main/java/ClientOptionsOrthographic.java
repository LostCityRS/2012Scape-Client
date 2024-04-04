import deob.ObfuscatedName;

@ObfuscatedName("afc")
public class ClientOptionsOrthographic extends ClientOption {

    public ClientOptionsOrthographic(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    public ClientOptionsOrthographic(ClientOptions arg0) {
        super(arg0);
    }

    @ObfuscatedName("afc.z(I)V")
    public void method15746() {
        if (this.value < 0 || this.value > 2) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afc.u(I)I")
    public int getDefault() {
        return 0;
    }

    @ObfuscatedName("afc.n(I)Z")
    public boolean method15740() {
        return true;
    }

    @ObfuscatedName("afc.j(IB)I")
    public int canSetValue(int arg0) {
        return arg0 == 2 ? 2 : 1;
    }

    @ObfuscatedName("afc.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afc.o(B)I")
    public int method15741() {
        return this.value;
    }
}
