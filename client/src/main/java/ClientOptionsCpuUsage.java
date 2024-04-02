
import deob.ObfuscatedName;

@ObfuscatedName("aff")
public class ClientOptionsCpuUsage extends class537 {

	public ClientOptionsCpuUsage(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsCpuUsage(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aff.z(B)V")
	public void method15873() {
		if (this.field6461 < 0 && this.field6461 > 4) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("aff.u(I)I")
	public int method11386() {
		return this.field6462.method15462().method11398() > 1 ? 4 : 2;
	}

	@ObfuscatedName("aff.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("aff.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("aff.n(I)I")
	public int method15874() {
		return this.field6461;
	}
}
