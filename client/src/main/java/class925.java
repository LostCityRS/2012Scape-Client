
import deob.ObfuscatedName;

@ObfuscatedName("aix")
public class class925 extends ClanSettingsDeltaEntry {

	// $FF: synthetic field
	public final class219 this$0;

	@ObfuscatedName("aix.s")
	public int field10195;

	@ObfuscatedName("aix.c")
	public String field10194;

	public class925(class219 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("aix.u(Laet;I)V")
	public void method14956(Packet arg0) {
		this.field10195 = arg0.method15379();
		this.field10194 = arg0.method15337();
	}

	@ObfuscatedName("aix.j(Lga;B)V")
	public void method14955(class218 arg0) {
		arg0.method4057(this.field10195, this.field10194);
	}
}
