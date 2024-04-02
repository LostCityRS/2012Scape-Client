
import deob.ObfuscatedName;

@ObfuscatedName("aht")
public class class897 extends class680 {

	@ObfuscatedName("aht.u")
	public final GpuToolkit field9963;

	@ObfuscatedName("aht.j")
	public class259 field9964;

	@ObfuscatedName("aht.a")
	public final int field9971;

	@ObfuscatedName("aht.s")
	public final int field9965;

	@ObfuscatedName("aht.c")
	public final int field9966;

	@ObfuscatedName("aht.m")
	public final int field9967;

	@ObfuscatedName("aht.t")
	public final int field9968;

	@ObfuscatedName("aht.l")
	public final int field9969;

	@ObfuscatedName("aht.f")
	public static final int[] field9970 = new int[6];

	@ObfuscatedName("aht.d")
	public static final int[][] field9962 = new int[6][];

	public class897(GpuToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field9963 = arg0;
		this.field9966 = arg3;
		this.field9967 = arg4;
		this.field9968 = arg5;
		this.field9969 = arg6;
		this.field9971 = arg1;
		this.field9965 = arg2;
	}

	@ObfuscatedName("aht.u()Lih;")
	public class259 method13190() {
		if (this.field9964 == null) {
			BillboardTypeList var1 = this.field9963.field400;
			field9970[0] = this.field9971;
			field9970[1] = this.field9965;
			field9970[2] = this.field9966;
			field9970[3] = this.field9967;
			field9970[4] = this.field9968;
			field9970[5] = this.field9969;
			boolean var2 = false;
			int var3 = 0;
			for (int var4 = 0; var4 < 6; var4++) {
				if (field9970[var4] == -1) {
					return null;
				}
				Material var5 = var1.method889(field9970[var4]);
				int var6 = var5.field1252;
				if (var6 > var3) {
					var3 = var6;
				}
				if (!var1.method898(field9970[var4], class455.field4849, 1.0F, var3, var3, false)) {
					return null;
				}
				if (var5.field1275 > 0) {
					var2 = true;
				}
			}
			for (int var7 = 0; var7 < 6; var7++) {
				field9962[var7] = var1.method886(field9970[var7], 1.0F, var3, var3, false);
				if (var3 * var3 != field9962[var7].length) {
					Material var8 = var1.method889(field9970[var7]);
					int var9 = var3 / var8.field1252;
					int[] var10 = new int[var3 * var3];
					for (int var11 = 0; var11 < var8.field1252; var11++) {
						for (int var12 = 0; var12 < var8.field1252; var12++) {
							int var13 = var8.field1252 * var12 + var11;
							int var14 = (var3 * var12 + var11) * var9;
							for (int var15 = 0; var15 < var9; var15++) {
								for (int var16 = 0; var16 < var9; var16++) {
									var10[var9 * var16 + var14 + var15] = field9962[var7][var13];
								}
							}
						}
					}
					field9962[var7] = var10;
				}
			}
			this.field9964 = this.field9963.method13553(var3, var2, field9962);
		}
		return this.field9964;
	}
}
