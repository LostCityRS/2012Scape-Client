import deob.ObfuscatedName;

@ObfuscatedName("afv")
public class ClientOptionsDrawDistance extends ClientOption {

    public ClientOptionsDrawDistance(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsDrawDistance(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afv.z(I)V")
    public void method15851() {
        if (this.value < DrawDistance.field2148.field2145 || this.value > DrawDistance.field2147.field2145) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afv.u(I)I")
    public int getDefault() {
        return DrawDistance.field2148.field2145;
    }

    @ObfuscatedName("afv.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afv.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afv.n(I)I")
    public int method15853() {
        return this.value;
    }
}
