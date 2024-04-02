
import deob.ObfuscatedName;

@ObfuscatedName("ail")
public class ClanChannelDelta_Sub3 extends ClanChannelDeltaEntry {

	// $FF: synthetic field
	public final ClanChannelDelta this$0;

	@ObfuscatedName("ail.s")
	public int field10217;

	public ClanChannelDelta_Sub3(ClanChannelDelta arg0) {
		this.this$0 = arg0;
		this.field10217 = -1;
	}

	@ObfuscatedName("ail.u(Laet;B)V")
	public void method14985(Packet arg0) {
		this.field10217 = arg0.method15239();
		arg0.method15220();
		if (arg0.method15220() != 255) {
			arg0.field9626--;
			arg0.method15246();
		}
	}

	@ObfuscatedName("ail.j(Ladh;B)V")
	public void method14986(ClanChannel arg0) {
		arg0.method14964(this.field10217);
	}
}
