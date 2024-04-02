
import deob.ObfuscatedName;

@ObfuscatedName("ajz")
public class class946 extends class800 {

	@ObfuscatedName("ajz.t")
	public final String field10344;

	@ObfuscatedName("ajz.l")
	public final class552 field10345;

	@ObfuscatedName("ajz.f")
	public int field10346;

	public class946(String arg0) {
		this.field10344 = arg0;
		this.field10345 = new class552();
	}

	@ObfuscatedName("ajz.u(I)I")
	public int method16648() {
		return this.field10345.field6662.field9552 == this.field10345.field6662 ? -1 : ((class944) this.field10345.field6662.field9552).field10340;
	}

	@ObfuscatedName("ajz.j(Lajs;I)Z")
	public boolean method16644(class944 arg0) {
		boolean var2 = true;
		arg0.method15142();
		class944 var3 = (class944) this.field10345.method11756();
		while (var3 != null) {
			if (class42.method5825(arg0.field10340, var3.field10340)) {
				class552.method8542(arg0, var3);
				this.field10346++;
				return !var2;
			}
			var3 = (class944) this.field10345.method11744();
			var2 = false;
		}
		this.field10345.method11728(arg0);
		this.field10346++;
		return var2;
	}

	@ObfuscatedName("ajz.a(Lajs;I)Z")
	public boolean method16650(class944 arg0) {
		int var2 = this.method16648();
		arg0.method15142();
		this.field10346--;
		if (this.field10346 != 0) {
			return var2 != this.method16648();
		}
		this.method6979();
		this.method15142();
		class42.field594--;
		class42.field600.method7937(this, arg0.field10330);
		return false;
	}
}
