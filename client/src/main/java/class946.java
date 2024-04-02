
import deob.ObfuscatedName;

@ObfuscatedName("ajz")
public class class946 extends SecondaryNode {

	@ObfuscatedName("ajz.t")
	public final String field10344;

	@ObfuscatedName("ajz.l")
	public final DualIterableQueue field10345;

	@ObfuscatedName("ajz.f")
	public int field10346;

	public class946(String arg0) {
		this.field10344 = arg0;
		this.field10345 = new DualIterableQueue();
	}

	@ObfuscatedName("ajz.u(I)I")
	public int method16648() {
		return this.field10345.field6662.field9552 == this.field10345.field6662 ? -1 : ((MiniMenuEntry) this.field10345.field6662.field9552).field10340;
	}

	@ObfuscatedName("ajz.j(Lajs;I)Z")
	public boolean method16644(MiniMenuEntry arg0) {
		boolean var2 = true;
		arg0.method15142();
		MiniMenuEntry var3 = (MiniMenuEntry) this.field10345.method11756();
		while (var3 != null) {
			if (MiniMenu.method5825(arg0.field10340, var3.field10340)) {
				DualIterableQueue.method8542(arg0, var3);
				this.field10346++;
				return !var2;
			}
			var3 = (MiniMenuEntry) this.field10345.method11744();
			var2 = false;
		}
		this.field10345.method11728(arg0);
		this.field10346++;
		return var2;
	}

	@ObfuscatedName("ajz.a(Lajs;I)Z")
	public boolean method16650(MiniMenuEntry arg0) {
		int var2 = this.method16648();
		arg0.method15142();
		this.field10346--;
		if (this.field10346 != 0) {
			return var2 != this.method16648();
		}
		this.method6979();
		this.method15142();
		MiniMenu.field594--;
		MiniMenu.field600.method7937(this, arg0.field10330);
		return false;
	}
}
