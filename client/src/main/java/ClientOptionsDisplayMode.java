import deob.ObfuscatedName;

@ObfuscatedName("afs")
public class ClientOptionsDisplayMode extends ClientOption {

    @ObfuscatedName("afs.m")
    public boolean field9845 = true;

    @ObfuscatedName("afs.t")
    public boolean field9844 = false;

    public ClientOptionsDisplayMode(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsDisplayMode(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afs.z(I)V")
    public void method15773() {
        if (this.value < 0 || this.value > 5) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afs.u(I)I")
    public int getDefault() {
        this.field9844 = true;
        return 2;
    }

    @ObfuscatedName("afs.n(I)Z")
    public boolean method15775() {
        return true;
    }

    @ObfuscatedName("afs.j(IB)I")
    public int canSetValue(int arg0) {
        return arg0 == 3 && !NativeLibraries.method11710().method6803("jagdx") ? 3 : 2;
    }

    @ObfuscatedName("afs.s(II)V")
    public void setValue(int arg0) {
        this.field9844 = false;
        this.value = arg0;
    }

    @ObfuscatedName("afs.o(B)I")
    public int getValue() {
        return this.value;
    }

    @ObfuscatedName("afs.q(I)Z")
    public boolean method15776() {
        return this.field9845;
    }

    @ObfuscatedName("afs.p(ZB)V")
    public void method15780(boolean arg0) {
        this.field9845 = arg0;
    }
}
