import deob.ObfuscatedName;

@ObfuscatedName("afn")
public class ClientOptionsScreenSize extends ClientOption {

    public ClientOptionsScreenSize(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsScreenSize(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afn.z(B)V")
    public void method15796() {
        if (this.value < 0 || this.value > 2) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afn.u(I)I")
    public int getDefault() {
        return this.field6462.toolkit.method15776() && RendererToolkit.method14198(this.field6462.toolkit.getValue()) ? 1 : 0;
    }

    @ObfuscatedName("afn.n(B)Z")
    public boolean method15795() {
        return true;
    }

    @ObfuscatedName("afn.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afn.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afn.o(I)I")
    public int method15794() {
        return this.value;
    }
}
