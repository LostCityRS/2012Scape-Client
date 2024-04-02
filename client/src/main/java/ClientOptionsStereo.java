
import deob.ObfuscatedName;

@ObfuscatedName("afu")
public class ClientOptionsStereo extends ClientOption {

	public ClientOptionsStereo(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsStereo(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afu.z(I)V")
	public void method15888() {
		if (this.field6461 != 1 && this.field6461 != 0) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afu.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afu.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afu.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afu.n(B)I")
	public int method15891() {
		return this.field6461;
	}
}
