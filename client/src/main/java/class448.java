
import deob.ObfuscatedName;

@ObfuscatedName("pi")
public class class448 implements class445 {

	@ObfuscatedName("pi.u")
	public final int field4815;

	@ObfuscatedName("pi.j")
	public final int field4816;

	public class448(int arg0, int arg1) {
		this.field4815 = arg0;
		this.field4816 = arg1;
	}

	@ObfuscatedName("pi.u(Ladv;[Lox;ILoq;I)Z")
	public boolean method7884(BasicMouseEvent arg0, KeyboardEvent[] arg1, int arg2, Keyboard arg3) {
		for (int var5 = 0; var5 < arg2 && var5 < arg1.length; var5++) {
			KeyboardEvent var6 = arg1[var5];
			if (var6 != null && var6.method7286() == this.field4815 && var6.method7285() == this.field4816) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ul.a(Laet;I)Lpi;")
	public static class448 method11866(Packet arg0) {
		int var1 = arg0.method15220();
		int var2 = arg0.method15220();
		return new class448(var1, var2);
	}
}
