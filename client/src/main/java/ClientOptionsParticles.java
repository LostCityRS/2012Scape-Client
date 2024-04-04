import deob.ObfuscatedName;

@ObfuscatedName("afa")
public class ClientOptionsParticles extends ClientOption {

    public ClientOptionsParticles(ClientOptions arg0) {
        super(arg0);
        ParticleSystemRenderer.method4754(this.value);
    }

    public ClientOptionsParticles(int arg0, ClientOptions arg1) {
        super(arg0, arg1);
        ParticleSystemRenderer.method4754(this.value);
    }

    @ObfuscatedName("afa.z(I)V")
    public void method15715() {
        if (this.field6462.method15462().method11399() < 245) {
            this.value = 0;
        }
        if (this.value < 0 || this.value > 2) {
            this.value = this.getDefault();
        }
    }

    @ObfuscatedName("afa.u(I)I")
    public int getDefault() {
        return this.field6462.method15462().method11399() < 245 ? 0 : 2;
    }

    @ObfuscatedName("afa.n(B)Z")
    public boolean method15717() {
        return this.field6462.method15462().method11399() >= 245;
    }

    @ObfuscatedName("afa.j(IB)I")
    public int canSetValue(int arg0) {
        return this.field6462.method15462().method11399() < 245 ? 3 : 1;
    }

    @ObfuscatedName("afa.s(II)V")
    public void setValue(int arg0) {
        this.value = arg0;
        ParticleSystemRenderer.method4754(this.value);
    }

    @ObfuscatedName("afa.o(I)I")
    public int method15716() {
        return this.value;
    }
}
