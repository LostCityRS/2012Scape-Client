import deob.ObfuscatedName;

@ObfuscatedName("afy")
public class ClientOptionsGroundDecoration extends ClientOption {

    public ClientOptionsGroundDecoration(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsGroundDecoration(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afy.z(B)V")
    public void method15723() {
        if (this.field6462.method15452() != ModeGame.RUNESCAPE) {
            this.value = 1;
        }
        if (this.value != 0 && this.value != 1) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afy.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afy.n(B)Z")
    public boolean method15724() {
        return this.field6462.method15452() == ModeGame.RUNESCAPE;
    }

    @ObfuscatedName("afy.j(IB)I")
    public int canSetValue(int arg0) {
        return this.field6462.method15452() == ModeGame.RUNESCAPE ? 1 : 3;
    }

    @ObfuscatedName("afy.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afy.o(I)I")
    public int method15725() {
        return this.value;
    }
}
