import deob.ObfuscatedName;

@ObfuscatedName("agi")
public class ClientOptionsVolume extends ClientOption {

    public ClientOptionsVolume(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsVolume(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("agi.z(I)V")
    public void checkValue() {
        if (this.value < 0 || this.value > 255) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("agi.u(I)I")
    public int getDefault() {
        return 127;
    }

    @ObfuscatedName("agi.j(IB)I")
    public int canSetValue(int value) {
        return 1;
    }

    @ObfuscatedName("agi.s(II)V")
    public void setValue(int value) {
        this.value = value;
    }

    @ObfuscatedName("agi.n(I)I")
    public int getValue() {
        return this.value;
    }
}
