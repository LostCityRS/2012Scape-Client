import deob.ObfuscatedName;

@ObfuscatedName("afz")
public class ClientOptionsSceneryShadows extends ClientOption {

    public ClientOptionsSceneryShadows(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsSceneryShadows(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afz.z(I)V")
    public void method15748() {
        if (this.field6462.texturing.method15686() == 0) {
            this.value = 0;
        }
        if (this.value < 0 || this.value > 2) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afz.u(I)I")
    public int getDefault() {
        return 2;
    }

    @ObfuscatedName("afz.n(I)Z")
    public boolean method15750() {
        return this.field6462.texturing.method15686() != 0;
    }

    @ObfuscatedName("afz.j(IB)I")
    public int canSetValue(int arg0) {
        return this.field6462.texturing.method15686() == 0 ? 3 : 1;
    }

    @ObfuscatedName("afz.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afz.o(I)I")
    public int method15747() {
        return this.value;
    }
}
