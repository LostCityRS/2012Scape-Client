
import deob.ObfuscatedName;

@ObfuscatedName("ea")
public class ea extends FontType implements class10 {

	public long nativeid;

	public ea(ja arg0, ba arg1, FontMetrics arg2, PalettedSpriteData[] arg3, Sprite[] arg4) {
		super(arg0, arg2);
		byte[][] var6 = new byte[arg3.length][];
		int[] var7 = new int[arg3.length];
		int[] var8 = new int[arg3.length];
		int[] var9 = new int[arg3.length];
		int[] var10 = new int[arg3.length];
		for (int var11 = 0; var11 < arg3.length; var11++) {
			PalettedSpriteData var12 = arg3[var11];
			if (var12.field8416 == null) {
				byte[] var13 = var12.field8408;
				byte[] var14 = var6[var11] = new byte[var13.length];
				for (int var15 = 0; var15 < var13.length; var15++) {
					var14[var15] = (byte) (var13[var15] == 0 ? 0 : -1);
				}
			} else {
				var6[var11] = var12.field8416;
			}
			var7[var11] = var12.field8415;
			var8[var11] = var12.field8409;
			var9[var11] = var12.field8413;
			var10[var11] = var12.field8412;
		}
		this.method1170(arg0, arg1, var6, var7, var8, var9, var10);
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			class111.method2358(this);
		}
	}

	@ObfuscatedName("ea.b(CIIIZLta;II)V")
	public void method867(char arg0, int arg1, int arg2, int arg3, boolean arg4, class11 arg5, int arg6, int arg7) {
		this.method1172(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@ObfuscatedName("ea.n(Lja;Lba;[[B[I[I[I[I)V")
	public native void method1170(ja arg0, ba arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

	@ObfuscatedName("ea.UA(CIIIZ)V")
	public native void method848(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("ea.P(CIIIZLta;II)V")
	public native void method1172(char arg0, int arg1, int arg2, int arg3, boolean arg4, class11 arg5, int arg6, int arg7);

	@ObfuscatedName("ea.ma(Z)V")
	public native void method92(boolean arg0);
}
