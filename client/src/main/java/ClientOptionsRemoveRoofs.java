
import deob.ObfuscatedName;

@ObfuscatedName("afh")
public class ClientOptionsRemoveRoofs extends ClientOption {

	public ClientOptionsRemoveRoofs(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsRemoveRoofs(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afh.z(B)V")
	public void method15734() {
		if (this.field6462.field9641.method15741() == 2 && this.field6461 == 2) {
			this.field6461 = 1;
		}
		if (this.field6461 < 0 || this.field6461 > 2) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afh.u(I)I")
	public int method11386() {
		return 2;
	}

	@ObfuscatedName("afh.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afh.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afh.n(B)I")
	public int method15735() {
		return this.field6461;
	}
}
