import deob.ObfuscatedName;

@ObfuscatedName("afd")
public class ClientOptionsFog extends ClientOption {

    public ClientOptionsFog(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsFog(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afd.z(I)V")
    public void method15695() {
        if (this.value != 0 && this.field6462.groundBlending.method15843() != 1) {
            this.value = 0;
        }
        if (this.value != 0 && this.field6462.orthographic.method15741() == 2) {
            this.value = 0;
        }
        if (this.value < 0 || this.value > 1) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afd.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afd.n(B)Z")
    public boolean method15698() {
        return true;
    }

    @ObfuscatedName("afd.j(IB)I")
    public int canSetValue(int arg0) {
        if (arg0 != 0 && this.field6462.orthographic.method15741() == 2) {
            return 3;
        } else if (arg0 == 0 || this.field6462.groundBlending.method15843() == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("afd.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afd.o(B)I")
    public int method15696() {
        return this.value;
    }
}
