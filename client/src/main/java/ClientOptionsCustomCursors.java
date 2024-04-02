
import deob.ObfuscatedName;

@ObfuscatedName("agd")
public class ClientOptionsCustomCursors extends class537 {

	public ClientOptionsCustomCursors(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsCustomCursors(int arg0, ClientOptions arg1) {
		super(arg1);
	}

	@ObfuscatedName("agd.z(I)V")
	public void method15906() {
		if (this.field6461 != 1 && this.field6461 != 0) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("agd.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("agd.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("agd.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("agd.n(I)I")
	public int method15908() {
		return this.field6461;
	}
}
