
import deob.ObfuscatedName;

@ObfuscatedName("afc")
public class ClientOptionsOrthographic extends ClientOption {

	public ClientOptionsOrthographic(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	public ClientOptionsOrthographic(ClientOptions arg0) {
		super(arg0);
	}

	@ObfuscatedName("afc.z(I)V")
	public void method15746() {
		if (this.field6461 < 0 || this.field6461 > 2) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afc.u(I)I")
	public int method11386() {
		return 0;
	}

	@ObfuscatedName("afc.n(I)Z")
	public boolean method15740() {
		return true;
	}

	@ObfuscatedName("afc.j(IB)I")
	public int method11387(int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@ObfuscatedName("afc.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afc.o(B)I")
	public int method15741() {
		return this.field6461;
	}
}
