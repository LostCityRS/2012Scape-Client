
import deob.ObfuscatedName;

@ObfuscatedName("afq")
public class ClientOptionsIdleAnimations extends class537 {

	public ClientOptionsIdleAnimations(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsIdleAnimations(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afq.z(I)V")
	public void method15835() {
		if (this.field6462.method15452() == ModeGame.field6402) {
			this.field6461 = 2;
		}
		if (this.field6461 < 0 || this.field6461 > 2) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afq.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afq.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afq.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afq.n(I)I")
	public int method15837() {
		return this.field6461;
	}
}
