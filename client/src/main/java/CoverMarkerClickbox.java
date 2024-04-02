
import deob.ObfuscatedName;

@ObfuscatedName("acp")
public class CoverMarkerClickbox extends Link {

	@ObfuscatedName("acp.a")
	public static LinkQueue field9248 = new LinkQueue();

	@ObfuscatedName("acp.s")
	public static int field9249 = 0;

	@ObfuscatedName("acp.c")
	public PathingEntity field9250;

	@ObfuscatedName("acp.m")
	public int field9251;

	@ObfuscatedName("acp.t")
	public int field9252;

	@ObfuscatedName("acp.l")
	public int field9253;

	@ObfuscatedName("acp.f")
	public int field9254;

	@ObfuscatedName("vj.a(I)Lacp;")
	public static CoverMarkerClickbox method12327() {
		CoverMarkerClickbox var0 = (CoverMarkerClickbox) field9248.method11642();
		if (var0 == null) {
			return new CoverMarkerClickbox();
		} else {
			field9249--;
			return var0;
		}
	}
}
