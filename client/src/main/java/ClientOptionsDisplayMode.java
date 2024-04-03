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
        if (this.field6461 < 0 || this.field6461 > 5) {
            this.field6461 = this.method11386();
        }
    }

    @ObfuscatedName("afs.u(I)I")
    public int method11386() {
        this.field9844 = true;
        return 2;
    }

    @ObfuscatedName("afs.n(I)Z")
    public boolean method15775() {
        return true;
    }

    @ObfuscatedName("afs.j(IB)I")
    public int method11387(int arg0) {
        return arg0 == 3 && !NativeLibraries.method11710().method6803("jagdx") ? 3 : 2;
    }

    @ObfuscatedName("afs.s(II)V")
    public void method11389(int arg0) {
        this.field9844 = false;
        this.field6461 = arg0;
    }

    @ObfuscatedName("afs.o(B)I")
    public int method15781() {
        return this.field6461;
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
