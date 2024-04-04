import deob.ObfuscatedName;

@ObfuscatedName("afx")
public class ClientOptionsCharacterShadows extends ClientOption {

    public ClientOptionsCharacterShadows(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsCharacterShadows(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afx.z(S)V")
    public void method15706() {
        if (this.value != 1 && this.value != 0) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afx.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afx.n(B)Z")
    public boolean method15707() {
        return true;
    }

    @ObfuscatedName("afx.j(IB)I")
    public int canSetValue(int arg0) {
        return 1;
    }

    @ObfuscatedName("afx.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afx.o(B)I")
    public int method15709() {
        return this.value;
    }
}
