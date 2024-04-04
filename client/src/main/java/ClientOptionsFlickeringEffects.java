import deob.ObfuscatedName;

@ObfuscatedName("afp")
public class ClientOptionsFlickeringEffects extends ClientOption {

    public ClientOptionsFlickeringEffects(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsFlickeringEffects(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afp.z(B)V")
    public void method15677() {
        if (this.value != 1 && this.value != 0) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afp.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afp.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afp.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afp.n(B)I")
    public int method15679() {
        return this.value;
    }
}
