
import deob.ObfuscatedName;

@ObfuscatedName("aed")
public class ClientOptionsBrightness extends ClientOption {

	public ClientOptionsBrightness(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsBrightness(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("aed.z(B)V")
	public void method15673() {
		if (this.field6461 < 0 || this.field6461 > 4) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("aed.u(I)I")
	public int method11386() {
		return 3;
	}

	@ObfuscatedName("aed.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("aed.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("aed.n(I)I")
	public int method15672() {
		return this.field6461;
	}
}
