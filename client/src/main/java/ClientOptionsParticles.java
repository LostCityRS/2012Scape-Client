
import deob.ObfuscatedName;

@ObfuscatedName("afa")
public class ClientOptionsParticles extends ClientOption {

	public ClientOptionsParticles(ClientOptions arg0) {
		super(arg0);
		ParticleSystemRenderer.method4754(this.field6461);
	}

	public ClientOptionsParticles(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
		ParticleSystemRenderer.method4754(this.field6461);
	}

	@ObfuscatedName("afa.z(I)V")
	public void method15715() {
		if (this.field6462.method15462().method11399() < 245) {
			this.field6461 = 0;
		}
		if (this.field6461 < 0 || this.field6461 > 2) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afa.u(I)I")
	public int method11386() {
		return this.field6462.method15462().method11399() < 245 ? 0 : 2;
	}

	@ObfuscatedName("afa.n(B)Z")
	public boolean method15717() {
		return this.field6462.method15462().method11399() >= 245;
	}

	@ObfuscatedName("afa.j(IB)I")
	public int method11387(int arg0) {
		return this.field6462.method15462().method11399() < 245 ? 3 : 1;
	}

	@ObfuscatedName("afa.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
		ParticleSystemRenderer.method4754(this.field6461);
	}

	@ObfuscatedName("afa.o(I)I")
	public int method15716() {
		return this.field6461;
	}
}