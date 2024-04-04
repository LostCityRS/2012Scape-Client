import deob.ObfuscatedName;

@ObfuscatedName("afm")
public class ClientOptionsWaterDetail extends ClientOption {

    public ClientOptionsWaterDetail(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsWaterDetail(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afm.z(I)V")
    public void method15754() {
        if (this.value < 0 && this.value > 2) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afm.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afm.n(I)Z")
    public boolean method15757() {
        return true;
    }

    @ObfuscatedName("afm.j(IB)I")
    public int canSetValue(int arg0) {
        return arg0 == 0 || this.field6462.groundBlending.method15843() == 1 ? 1 : 2;
    }

    @ObfuscatedName("afm.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afm.o(I)I")
    public int method15755() {
        return this.value;
    }
}
