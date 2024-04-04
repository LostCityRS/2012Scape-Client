import deob.ObfuscatedName;

@ObfuscatedName("aft")
public class ClientOptionsLoadingScreen extends ClientOption {

    public ClientOptionsLoadingScreen(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsLoadingScreen(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("aft.z(I)V")
    public void method15860() {
    }

    @ObfuscatedName("aft.u(I)I")
    public int getDefault() {
        return 0;
    }

    @ObfuscatedName("aft.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("aft.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("aft.n(I)I")
    public int method15859() {
        return this.value;
    }
}
