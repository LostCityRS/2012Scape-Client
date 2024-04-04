import deob.ObfuscatedName;

@ObfuscatedName("afj")
public class ClientOptionsGroundBlending extends ClientOption {

    public ClientOptionsGroundBlending(ClientOptions arg0) {
        super(arg0);
    }

    public ClientOptionsGroundBlending(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
    }

    @ObfuscatedName("afj.z(I)V")
    public void method15841() {
        if (this.field6462.method15452() != ModeGame.field6407) {
            this.value = 1;
        }
        if (this.value != 0 && this.value != 1) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afj.u(I)I")
    public int getDefault() {
        return 1;
    }

    @ObfuscatedName("afj.n(I)Z")
    public boolean method15842() {
        return this.field6462.method15452() == ModeGame.field6407;
    }

    @ObfuscatedName("afj.j(IB)I")
    public int canSetValue(int arg0) {
        if (this.field6462.method15452() != ModeGame.field6407) {
            return 3;
        }
        if (arg0 == 0) {
            if (this.field6462.fog.method15696() == 1) {
                return 2;
            }
            if (this.field6462.texturing.method15686() == 1) {
                return 2;
            }
            if (this.field6462.waterDetail.method15755() > 0) {
                return 2;
            }
        }
        return 1;
    }

    @ObfuscatedName("afj.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
    }

    @ObfuscatedName("afj.o(I)I")
    public int method15843() {
        return this.value;
    }
}
