
import deob.ObfuscatedName;

@ObfuscatedName("afk")
public class ClientOptionsBuildArea extends ClientOption {

	public ClientOptionsBuildArea(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsBuildArea(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afk.z(I)V")
	public void method15789() {
		int var1 = this.field6462.method15462().method11399();
		if (var1 < 245) {
			this.field6461 = BuildAreaSize.field2139.field2143;
		}
		if (BuildAreaSize.field2138.field2143 == this.field6461 && var1 < 500) {
			this.field6461 = BuildAreaSize.field2140.field2143;
		}
		if (this.field6461 < BuildAreaSize.field2139.field2143 || this.field6461 > BuildAreaSize.field2142.field2143) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afk.u(I)I")
	public int method11386() {
		return BuildAreaSize.field2139.field2143;
	}

	@ObfuscatedName("afk.n(I)Z")
	public boolean method15790() {
		int var1 = this.field6462.method15462().method11399();
		return var1 >= 245;
	}

	@ObfuscatedName("afk.j(IB)I")
	public int method11387(int arg0) {
		int var2 = this.field6462.method15462().method11399();
		if (var2 < 245) {
			return 3;
		} else if (BuildAreaSize.field2138.field2143 == arg0 && var2 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("afk.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afk.o(I)I")
	public int method15792() {
		return this.field6461;
	}
}
