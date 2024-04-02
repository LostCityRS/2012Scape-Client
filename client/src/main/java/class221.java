
import deob.ObfuscatedName;

@ObfuscatedName("gj")
public class class221 {

	@ObfuscatedName("gj.s")
	public GpuToolkit field2404;

	@ObfuscatedName("gj.c")
	public boolean field2405;

	@ObfuscatedName("gj.m")
	public GpuTexture[] field2406 = null;

	@ObfuscatedName("gj.t")
	public class225 field2401 = null;

	@ObfuscatedName("gj.l")
	public GpuTexture[] field2408 = null;

	@ObfuscatedName("gj.f")
	public class225 field2413 = null;

	@ObfuscatedName("gj.d")
	public class225 field2410 = null;

	@ObfuscatedName("gj.u()V")
	public static void method4126() {
		if (Statics.field2411 == null) {
			class913 var0 = new class913();
			byte[] var1 = var0.method16221(128, 128, 16);
			Statics.field2411 = Statics.method4122(var1, false);
		}
		if (Statics.field2407 == null) {
			class911 var2 = new class911();
			byte[] var3 = var2.method16211(128, 128, 16);
			Statics.field2407 = Statics.method4122(var3, false);
		}
	}

	public class221(GpuToolkit arg0) {
		this.field2404 = arg0;
		this.field2405 = this.field2404.field8384;
		if (this.field2405 && !this.field2404.method13547(class124.field1299, class139.field1501)) {
			this.field2405 = false;
		}
		if (this.field2405 || this.field2404.method13546(class124.field1299, class139.field1501)) {
			method4126();
			if (this.field2405) {
				byte[] var6 = Statics.method2896(Statics.field2411, false);
				this.field2401 = this.field2404.method13554(class124.field1299, 128, 128, 16, true, var6);
				byte[] var7 = Statics.method2896(Statics.field2407, false);
				this.field2413 = this.field2404.method13554(class124.field1299, 128, 128, 16, true, var7);
			} else {
				this.field2406 = new GpuTexture[16];
				for (int var2 = 0; var2 < 16; var2++) {
					byte[] var3 = class533.method5943(Statics.field2411, var2 * 32768, 32768);
					this.field2406[var2] = this.field2404.method13549(class124.field1299, 128, 128, true, var3);
				}
				this.field2408 = new GpuTexture[16];
				for (int var4 = 0; var4 < 16; var4++) {
					byte[] var5 = class533.method5943(Statics.field2407, var4 * 32768, 32768);
					this.field2408[var4] = this.field2404.method13549(class124.field1299, 128, 128, true, var5);
				}
			}
		}
	}

	@ObfuscatedName("gj.j()Z")
	public boolean method4125() {
		return this.field2405 ? this.field2401 != null : this.field2406 != null;
	}

	@ObfuscatedName("gj.a()Z")
	public boolean method4127() {
		if (!this.field2404.field8384) {
			return false;
		}
		if (this.field2410 == null) {
			if (Statics.field2403 == null) {
				byte[] var1 = WaterRelated5.method6999(128, 128, 16, 8, new class820(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				Statics.field2403 = Statics.method4122(var1, false);
			}
			byte[] var2 = Statics.method2896(Statics.field2403, false);
			byte[] var3 = new byte[var2.length * 4];
			int var4 = 0;
			for (int var5 = 0; var5 < 16; var5++) {
				int var6 = var5 * 16384;
				int var7 = var6;
				for (int var8 = 0; var8 < 128; var8++) {
					int var9 = var8 * 128 + var7;
					int var10 = (var8 - 1 & 0x7F) * 128 + var7;
					int var11 = (var8 + 1 & 0x7F) * 128 + var7;
					for (int var12 = 0; var12 < 128; var12++) {
						float var13 = (float) ((var2[var10 + var12] & 0xFF) - (var2[var11 + var12] & 0xFF));
						float var14 = (float) ((var2[(var12 - 1 & 0x7F) + var9] & 0xFF) - (var2[(var12 + 1 & 0x7F) + var9] & 0xFF));
						float var15 = (float) (128.0D / Math.sqrt((double) (var13 * var13 + var14 * var14 + 16384.0F)));
						var3[var4++] = (byte) (var14 * var15 + 127.0F);
						var3[var4++] = (byte) (var15 * 128.0F + 127.0F);
						var3[var4++] = (byte) (var13 * var15 + 127.0F);
						var3[var4++] = var2[var6++];
					}
				}
			}
			this.field2410 = this.field2404.method13554(class124.field1296, 128, 128, 16, true, var3);
		}
		return this.field2410 != null;
	}
}
