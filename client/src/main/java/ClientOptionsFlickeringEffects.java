
import deob.ObfuscatedName;

@ObfuscatedName("afp")
public class ClientOptionsFlickeringEffects extends class537 {

	public ClientOptionsFlickeringEffects(ClientOptions arg0) {
		super(arg0);
	}

	public ClientOptionsFlickeringEffects(int arg0, ClientOptions arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afp.z(B)V")
	public void method15677() {
		if (this.field6461 != 1 && this.field6461 != 0) {
			this.field6461 = this.method11386();
		}
	}

	@ObfuscatedName("afp.u(I)I")
	public int method11386() {
		return 1;
	}

	@ObfuscatedName("afp.j(IB)I")
	public int method11387(int arg0) {
		return 1;
	}

	@ObfuscatedName("afp.s(II)V")
	public void method11389(int arg0) {
		this.field6461 = arg0;
	}

	@ObfuscatedName("afp.n(B)I")
	public int method15679() {
		return this.field6461;
	}
}
