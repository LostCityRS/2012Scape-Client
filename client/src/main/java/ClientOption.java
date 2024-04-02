
import deob.ObfuscatedName;

@ObfuscatedName("tb")
public abstract class ClientOption {

	@ObfuscatedName("tb.s")
	public ClientOptions field6462;

	@ObfuscatedName("tb.c")
	public int field6461;

	public ClientOption(ClientOptions arg0) {
		this.field6462 = arg0;
		this.field6461 = this.method11386();
	}

	public ClientOption(int arg0, ClientOptions arg1) {
		this.field6461 = arg0;
		this.field6462 = arg1;
	}

	@ObfuscatedName("tb.a(IB)V")
	public void method11388(int arg0) {
		if (this.method11387(arg0) != 3) {
			this.method11389(arg0);
		}
	}

	@ObfuscatedName("tb.u(I)I")
	public abstract int method11386();

	@ObfuscatedName("tb.j(IB)I")
	public abstract int method11387(int arg0);

	@ObfuscatedName("tb.s(II)V")
	public abstract void method11389(int arg0);
}
