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
        if (this.field6461 != 1 && this.field6461 != 0) {
            this.field6461 = this.method11386();
        }
    }

    @ObfuscatedName("afx.u(I)I")
    public int method11386() {
        return 1;
    }

    @ObfuscatedName("afx.n(B)Z")
    public boolean method15707() {
        return true;
    }

    @ObfuscatedName("afx.j(IB)I")
    public int method11387(int arg0) {
        return 1;
    }

    @ObfuscatedName("afx.s(II)V")
    public void method11389(int arg0) {
        this.field6461 = arg0;
    }

    @ObfuscatedName("afx.o(B)I")
    public int method15709() {
        return this.field6461;
    }
}
