
import deob.ObfuscatedName;

@ObfuscatedName("afw")
public class ClientOptionsUnknown1 extends class537 {

	public ClientOptionsUnknown1(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsUnknown1(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afw.z(I)V")
	public void method15878() {
		if (this.field6461 != 1 && this.field6461 != 0) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afw.u(I)I")
	public int method11386() {
		return 0;
	}

	@ObfuscatedName("afw.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afw.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afw.n(B)I")
	public int method15877() {
		return this.field6461;
	}
}
