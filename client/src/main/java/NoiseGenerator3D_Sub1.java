
import deob.ObfuscatedName;

@ObfuscatedName("abe")
public class NoiseGenerator3D_Sub1 extends NoiseGenerator3D {

	@ObfuscatedName("abe.n")
	public byte[] field8830;

	@ObfuscatedName("abe.o")
	public int field8831;

	@ObfuscatedName("abe.q")
	public int field8832;

	@ObfuscatedName("abe.p")
	public final int[] field8833 = new int[this.field3299];

	public NoiseGenerator3D_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (int var7 = 0; var7 < this.field3299; var7++) {
			this.field8833[var7] = (short) (Math.pow((double) arg5, (double) var7) * 4096.0D);
		}
	}

	@ObfuscatedName("abe.j()V")
	public void method4813() {
		this.field8831 = 0;
		this.field8832 = 0;
	}

	@ObfuscatedName("abe.s(II)V")
	public void method4815(int arg0, int arg1) {
		this.field8832 += this.field8833[arg0] * arg1 >> 12;
	}

	@ObfuscatedName("abe.a()V")
	public void method4814() {
		this.field8832 = Math.abs(this.field8832);
		if (this.field8832 >= 4096) {
			this.field8832 = 4095;
		}
		this.method14223(this.field8831++, (byte) (this.field8832 >> 4));
		this.field8832 = 0;
	}

	@ObfuscatedName("abe.y(IB)V")
	public void method14223(int arg0, byte arg1) {
		this.field8830[this.field8831++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
