
import deob.ObfuscatedName;

@ObfuscatedName("aik")
public class class927 extends ClanSettingsDeltaEntry {

	// $FF: synthetic field
	public final class219 this$0;

	@ObfuscatedName("aik.s")
	public boolean field10201;

	@ObfuscatedName("aik.c")
	public byte field10198;

	@ObfuscatedName("aik.m")
	public byte field10199;

	@ObfuscatedName("aik.t")
	public byte field10197;

	@ObfuscatedName("aik.l")
	public byte field10200;

	public class927(class219 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("aik.u(Laet;I)V")
	public void method14956(Packet arg0) {
		this.field10201 = arg0.method15220() == 1;
		this.field10198 = arg0.method15238();
		this.field10199 = arg0.method15238();
		this.field10197 = arg0.method15238();
		this.field10200 = arg0.method15238();
	}

	@ObfuscatedName("aik.j(Lga;B)V")
	public void method14955(class218 arg0) {
		arg0.field2366 = this.field10201;
		arg0.field2352 = this.field10198;
		arg0.field2353 = this.field10199;
		arg0.field2354 = this.field10197;
		arg0.field2350 = this.field10200;
	}
}
