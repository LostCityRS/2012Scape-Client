
import deob.ObfuscatedName;

@ObfuscatedName("afg")
public class ClientOptionsTextures extends ClientOption {

	public ClientOptionsTextures(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsTextures(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afg.z(I)V")
	public void method15685() {
		if (this.field6462.method15452() != ModeGame.field6407) {
			this.field6461 = 1;
		}
		if (this.field6461 != 0 && this.field6461 != 1) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afg.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afg.n(B)Z")
	public boolean method15687() {
		return this.field6462.method15452() == ModeGame.field6407;
	}

	@ObfuscatedName("afg.j(IB)I")
	public int method11387(int arg0) {
		if (this.field6462.method15452() == ModeGame.field6407) {
			return arg0 == 0 || this.field6462.field9647.method15843() == 1 ? 1 : 2;
		} else {
			return 3;
		}
	}

	@ObfuscatedName("afg.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afg.o(I)I")
	public int method15686() {
		return this.field6461;
	}
}