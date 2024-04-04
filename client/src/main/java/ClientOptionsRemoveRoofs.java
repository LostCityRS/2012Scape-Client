import deob.ObfuscatedName;

@ObfuscatedName("afh")
public class ClientOptionsRemoveRoofs extends ClientOption {

    public ClientOptionsRemoveRoofs(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsRemoveRoofs(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afh.z(B)V")
    public void method15734() {
        if (this.field6462.orthographic.method15741() == 2 && this.value == 2) {
            this.value = 1;
        }
        if (this.value < 0 || this.value > 2) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afh.u(I)I")
    public int getDefault() {
        return 2;
    }

    @ObfuscatedName("afh.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afh.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afh.n(B)I")
    public int getValue() {
        return this.value;
    }
}
