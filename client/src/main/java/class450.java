
import deob.ObfuscatedName;

@ObfuscatedName("pf")
public class class450 implements Binding {

	@ObfuscatedName("pf.u")
	public final int[] field4823;

	public class450(int[] arg0) {
		this.field4823 = arg0;
	}

	@ObfuscatedName("pf.u(Ladv;[Lox;ILoq;I)Z")
	public boolean method7884(BasicMouseEvent arg0, KeyboardEvent[] arg1, int arg2, Keyboard arg3) {
		int[] var5 = this.field4823;
		for (int var6 = 0; var6 < var5.length; var6++) {
			int var7 = var5[var6];
			if (!arg3.method7243(var7)) {
				return false;
			}
		}
		return true;
	}
}
