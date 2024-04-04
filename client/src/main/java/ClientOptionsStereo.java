import deob.ObfuscatedName;

@ObfuscatedName("afu")
public class ClientOptionsStereo extends ClientOption {

    public ClientOptionsStereo(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsStereo(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afu.z(I)V")
    public void method15888() {
        if (this.value != 1 && this.value != 0) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afu.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afu.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afu.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afu.n(B)I")
    public int getValue() {
        return this.value;
    }
}
