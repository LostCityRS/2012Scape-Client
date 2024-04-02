
import deob.ObfuscatedName;

@ObfuscatedName("afd")
public class ClientOptionsFog extends class537 {

	public ClientOptionsFog(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsFog(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afd.z(I)V")
	public void method15695() {
		if (this.field6461 != 0 && this.field6462.field9647.method15843() != 1) {
			this.field6461 = 0;
		}
		if (this.field6461 != 0 && this.field6462.field9641.method15741() == 2) {
			this.field6461 = 0;
		}
		if (this.field6461 < 0 || this.field6461 > 1) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afd.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afd.n(B)Z")
	public boolean method15698() {
		return true;
	}

	@ObfuscatedName("afd.j(IB)I")
	public int method11387(int arg0) {
		if (arg0 != 0 && this.field6462.field9641.method15741() == 2) {
			return 3;
		} else if (arg0 == 0 || this.field6462.field9647.method15843() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("afd.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afd.o(B)I")
	public int method15696() {
		return this.field6461;
	}
}
