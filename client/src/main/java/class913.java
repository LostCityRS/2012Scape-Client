
import deob.ObfuscatedName;

@ObfuscatedName("ahc")
public class class913 extends class755 {

	@ObfuscatedName("ahc.k")
	public byte[] field10141;

	public class913() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@ObfuscatedName("ahc.ar(III)[B")
	public byte[] method16221(int arg0, int arg1, int arg2) {
		this.field10141 = new byte[arg0 * arg1 * arg2 * 2];
		this.method4834(arg0, arg1, arg2);
		return this.field10141;
	}

	@ObfuscatedName("ahc.y(IB)V")
	public void method14224(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		int var4 = arg1 & 0xFF;
		int var10001 = var3;
		int var5 = var3 + 1;
		this.field10141[var10001] = -1;
		this.field10141[var5] = (byte) (var4 * 3 >> 5);
	}
}
