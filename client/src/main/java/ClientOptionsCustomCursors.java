import deob.ObfuscatedName;

@ObfuscatedName("agd")
public class ClientOptionsCustomCursors extends ClientOption {

    public ClientOptionsCustomCursors(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsCustomCursors(int arg0, ClientOptions arg1) {
        super(arg1);
    }

    @ObfuscatedName("agd.z(I)V")
    public void method15906() {
        if (this.value != 1 && this.value != 0) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("agd.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("agd.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("agd.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("agd.n(I)I")
    public int method15908() {
        return this.value;
    }
}
