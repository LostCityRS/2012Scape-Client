import deob.ObfuscatedName;

@ObfuscatedName("afq")
public class ClientOptionsIdleAnimations extends ClientOption {

    public ClientOptionsIdleAnimations(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsIdleAnimations(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afq.z(I)V")
    public void method15835() {
        if (this.field6462.method15452() == ModeGame.STELLARDAWN) {
            this.value = 2;
        }
        if (this.value < 0 || this.value > 2) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afq.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afq.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afq.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afq.n(I)I")
    public int method15837() {
        return this.value;
    }
}
