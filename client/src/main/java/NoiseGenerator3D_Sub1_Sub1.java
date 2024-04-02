
import deob.ObfuscatedName;

@ObfuscatedName("ahm")
public class NoiseGenerator3D_Sub1_Sub1 extends NoiseGenerator3D_Sub1 {

	@ObfuscatedName("ahm.w")
	public byte[] field10138;

	public NoiseGenerator3D_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@ObfuscatedName("ahm.an(III)[B")
	public byte[] method16209(int arg0, int arg1, int arg2) {
		this.field10138 = new byte[arg0 * arg1 * arg2 * 2];
		this.method4834(arg0, arg1, arg2);
		return this.field10138;
	}

	@ObfuscatedName("ahm.y(IB)V")
	public void method14223(int arg0, byte arg1) {
		int var3 = arg0 * 2;
		byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		int var10001 = var3;
		int var5 = var3 + 1;
		this.field10138[var10001] = var4;
		this.field10138[var5] = var4;
	}
}
