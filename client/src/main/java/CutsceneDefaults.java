
import deob.ObfuscatedName;

@ObfuscatedName("rj")
public class CutsceneDefaults {

	@ObfuscatedName("rj.u")
	public Binding field5132;

	public CutsceneDefaults(Js5 arg0) {
		byte[] var2 = arg0.method5635(DefaultsGroup.field5139.field5145);
		this.method8594(new Packet(var2));
	}

	@ObfuscatedName("rj.u(Laet;I)V")
	public void method8594(Packet arg0) {
		while (true) {
			int var2 = arg0.method15220();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				this.field5132 = Bindings.method15895(arg0);
			}
		}
	}
}
