
import deob.ObfuscatedName;

@ObfuscatedName("afm")
public class ClientOptionsWaterDetail extends class537 {

	public ClientOptionsWaterDetail(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsWaterDetail(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afm.z(I)V")
	public void method15754() {
		if (this.field6461 < 0 && this.field6461 > 2) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afm.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afm.n(I)Z")
	public boolean method15757() {
		return true;
	}

	@ObfuscatedName("afm.j(IB)I")
	public int method11387(int arg0) {
		return arg0 == 0 || this.field6462.field9647.method15843() == 1 ? 1 : 2;
	}

	@ObfuscatedName("afm.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afm.o(I)I")
	public int method15755() {
		return this.field6461;
	}
}
