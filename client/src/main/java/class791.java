
import deob.ObfuscatedName;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

@ObfuscatedName("adn")
public class class791 extends class399 {

	@ObfuscatedName("adn.s")
	public final class683 field9460;

	@ObfuscatedName("adn.c")
	public final class673 field9448;

	@ObfuscatedName("adn.m")
	public final class780 field9450;

	@ObfuscatedName("adn.t")
	public int field9451;

	@ObfuscatedName("adn.l")
	public int field9452;

	@ObfuscatedName("adn.f")
	public int field9453;

	@ObfuscatedName("adn.d")
	public int field9454;

	@ObfuscatedName("adn.z")
	public int field9455 = 0;

	@ObfuscatedName("adn.n")
	public int field9456 = 0;

	@ObfuscatedName("adn.o")
	public int field9461 = 0;

	@ObfuscatedName("adn.q")
	public class258 field9449;

	@ObfuscatedName("adn.p")
	public class228 field9459;

	@ObfuscatedName("adn.w")
	public float[][] field9457;

	@ObfuscatedName("adn.b")
	public float[][] field9458;

	@ObfuscatedName("adn.x")
	public float[][] field9462;

	@ObfuscatedName("adn.i")
	public class565 field9463;

	@ObfuscatedName("adn.v")
	public ByteBuffer field9464;

	public class791(class683 arg0, class673 arg1, class780 arg2, int[] arg3) {
		this.field9460 = arg0;
		this.field9450 = arg2;
		this.field9448 = arg1;
		int var5 = this.field9450.method14880() - (arg1.field385 >> 1);
		this.field9451 = this.field9450.method14888() - var5 >> arg1.field388;
		this.field9452 = this.field9450.method14888() + var5 >> arg1.field388;
		this.field9453 = this.field9450.method14879() - var5 >> arg1.field388;
		this.field9454 = this.field9450.method14879() + var5 >> arg1.field388;
		int var6 = this.field9452 - this.field9451 + 1;
		int var7 = this.field9454 - this.field9453 + 1;
		this.field9457 = new float[var6 + 1][var7 + 1];
		this.field9458 = new float[var6 + 1][var7 + 1];
		this.field9462 = new float[var6 + 1][var7 + 1];
		for (int var8 = 0; var8 <= var7; var8++) {
			int var9 = this.field9453 + var8;
			if (var9 > 0 && var9 < this.field9448.field386 - 1) {
				for (int var10 = 0; var10 <= var6; var10++) {
					int var11 = this.field9451 + var10;
					if (var11 > 0 && var11 < this.field9448.field387 - 1) {
						int var12 = arg1.method199(var11 + 1, var9) - arg1.method199(var11 - 1, var9);
						int var13 = arg1.method199(var11, var9 + 1) - arg1.method199(var11, var9 - 1);
						float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
						this.field9457[var10][var8] = (float) var12 * var14;
						this.field9458[var10][var8] = var14 * -256.0F;
						this.field9462[var10][var8] = (float) var13 * var14;
					}
				}
			}
		}
		int var15 = 0;
		for (int var16 = this.field9453; var16 <= this.field9454; var16++) {
			if (var16 >= 0 && var16 < arg1.field386) {
				for (int var17 = this.field9451; var17 <= this.field9452; var17++) {
					if (var17 >= 0 && var17 < arg1.field387) {
						int var18 = arg3[var15];
						int[] var19 = arg1.field7733[var17][var16];
						if (var19 != null && var18 != 0) {
							if (var18 == 1) {
								for (int var20 = 0; var20 < var19.length; var20 += 3) {
									if (var19[var20] != -1 && var19[var20 + 1] != -1 && var19[var20 + 2] != -1) {
										this.field9456 += 3;
									}
								}
							} else {
								this.field9456 += 3;
							}
						}
					}
					var15++;
				}
			} else {
				var15 += this.field9452 - this.field9451;
			}
		}
		if (this.field9456 > 0) {
			this.field9463 = new class565(class595.method2839(this.field9456));
			this.field9464 = this.field9460.field8244;
			this.field9464.clear();
			this.field9464.position(2097152);
			this.field9464.slice();
			this.field9464.position(0);
			this.field9464.limit(2097152);
			int var21 = 0;
			int var22 = 0;
			for (int var23 = this.field9453; var23 <= this.field9454; var23++) {
				if (var23 >= 0 && var23 < arg1.field386) {
					int var24 = 0;
					for (int var25 = this.field9451; var25 <= this.field9452; var25++) {
						if (var25 >= 0 && var25 < arg1.field387) {
							int var26 = arg3[var22];
							int[] var27 = arg1.field7733[var25][var23];
							if (var27 != null && var26 != 0) {
								if (var26 == 1) {
									int[] var28 = arg1.field7735[var25][var23];
									int[] var29 = arg1.field7736[var25][var23];
									int var30 = 0;
									label110: while (true) {
										while (true) {
											if (var30 >= var27.length) {
												break label110;
											}
											if (var27[var30] == -1 || var27[var30 + 1] == -1 || var27[var30 + 2] == -1) {
												var30 += 3;
											} else {
												this.method15016(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
												this.method15016(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
												this.method15016(var24, var21, var25, var23, var28[var30], var29[var30]);
												var30++;
											}
										}
									}
								} else if (var26 == 3) {
									this.method15016(var24, var21, var25, var23, 0, 0);
									this.method15016(var24, var21, var25, var23, arg1.field385, 0);
									this.method15016(var24, var21, var25, var23, 0, arg1.field385);
								} else if (var26 == 2) {
									this.method15016(var24, var21, var25, var23, arg1.field385, 0);
									this.method15016(var24, var21, var25, var23, arg1.field385, arg1.field385);
									this.method15016(var24, var21, var25, var23, 0, 0);
								} else if (var26 == 5) {
									this.method15016(var24, var21, var25, var23, arg1.field385, arg1.field385);
									this.method15016(var24, var21, var25, var23, 0, arg1.field385);
									this.method15016(var24, var21, var25, var23, arg1.field385, 0);
								} else if (var26 == 4) {
									this.method15016(var24, var21, var25, var23, 0, arg1.field385);
									this.method15016(var24, var21, var25, var23, 0, 0);
									this.method15016(var24, var21, var25, var23, arg1.field385, arg1.field385);
								}
							}
						}
						var22++;
						var24++;
					}
				} else {
					var22 += this.field9452 - this.field9451;
				}
				var21++;
			}
			this.method15015();
		} else {
			this.field9459 = null;
			this.field9449 = null;
		}
		this.field9463 = null;
		this.field9462 = null;
		this.field9458 = null;
		this.field9457 = null;
	}

	@ObfuscatedName("adn.u()V")
	public void method15015() {
		this.field9449 = this.field9460.method13797(false);
		this.field9449.method4535(this.field9461);
		this.field9459 = this.field9460.method13584(false);
		this.field9459.method4269(this.field9455 * 16, 16);
		this.field9459.method4452(0, this.field9455 * 16, this.field9460.field8245);
		this.field9449.method4452(0, this.field9461 * 2, this.field9460.field8245 + 2097152L);
	}

	@ObfuscatedName("adn.j(IIIIII)V")
	public void method15016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var7 = -1L;
		int var9 = (arg2 << this.field9448.field388) + arg4;
		int var10 = (arg3 << this.field9448.field388) + arg5;
		int var11 = this.field9448.method196(var9, var10);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			var7 = ((long) var10 & 0xFFFFL) << 16 | (long) var9 & 0xFFFFL;
			class399 var12 = this.field9463.method11923(var7);
			if (var12 != null) {
				Unsafe var13 = this.field9460.field8247;
				var13.putShort(this.field9460.field8245 + 2097152L + (long) (this.field9461 * 2), ((class799) var12).field9551);
				this.field9461++;
				return;
			}
		}
		short var14 = (short) this.field9455;
		if (var7 != -1L) {
			this.field9463.method11927(new class799(var14), var7);
		}
		float var15;
		float var16;
		float var17;
		if (arg4 == 0 && arg5 == 0) {
			var15 = this.field9457[arg0][arg1];
			var16 = this.field9458[arg0][arg1];
			var17 = this.field9462[arg0][arg1];
		} else if (this.field9448.field385 == arg4 && arg5 == 0) {
			var15 = this.field9457[arg0 + 1][arg1];
			var16 = this.field9458[arg0 + 1][arg1];
			var17 = this.field9462[arg0 + 1][arg1];
		} else if (this.field9448.field385 == arg4 && this.field9448.field385 == arg5) {
			var15 = this.field9457[arg0 + 1][arg1 + 1];
			var16 = this.field9458[arg0 + 1][arg1 + 1];
			var17 = this.field9462[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && this.field9448.field385 == arg5) {
			var15 = this.field9457[arg0][arg1 + 1];
			var16 = this.field9458[arg0][arg1 + 1];
			var17 = this.field9462[arg0][arg1 + 1];
		} else {
			float var18 = (float) arg4 / (float) this.field9448.field385;
			float var19 = (float) arg5 / (float) this.field9448.field385;
			float var20 = this.field9457[arg0][arg1];
			float var21 = this.field9458[arg0][arg1];
			float var22 = this.field9462[arg0][arg1];
			float var23 = this.field9457[arg0 + 1][arg1];
			float var24 = this.field9458[arg0 + 1][arg1];
			float var25 = this.field9462[arg0 + 1][arg1];
			float var26 = (this.field9457[arg0][arg1 + 1] - var20) * var18 + var20;
			float var27 = (this.field9458[arg0][arg1 + 1] - var21) * var18 + var21;
			float var28 = (this.field9462[arg0][arg1 + 1] - var22) * var18 + var22;
			float var29 = (this.field9457[arg0 + 1][arg1 + 1] - var23) * var18 + var23;
			float var30 = (this.field9458[arg0 + 1][arg1 + 1] - var24) * var18 + var24;
			float var31 = (this.field9462[arg0 + 1][arg1 + 1] - var25) * var18 + var25;
			var15 = (var29 - var26) * var19 + var26;
			var16 = (var30 - var27) * var19 + var27;
			var17 = (var31 - var28) * var19 + var28;
		}
		float var32 = (float) (this.field9450.method14888() - var9);
		float var33 = (float) (this.field9450.method14882() - var11);
		float var34 = (float) (this.field9450.method14879() - var10);
		float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
		float var36 = 1.0F / var35;
		float var37 = var32 * var36;
		float var38 = var33 * var36;
		float var39 = var34 * var36;
		float var40 = var35 / (float) this.field9450.method14880();
		float var41 = 1.0F - var40 * var40;
		if (var41 < 0.0F) {
			var41 = 0.0F;
		}
		float var42 = var17 * var39 + var15 * var37 + var16 * var38;
		if (var42 < 0.0F) {
			var42 = 0.0F;
		}
		float var43 = var41 * var42 * 2.0F;
		if (var43 > 1.0F) {
			var43 = 1.0F;
		}
		int var44 = this.field9450.method14881();
		int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
		if (var45 > 255) {
			var45 = 255;
		}
		int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
		if (var46 > 255) {
			var46 = 255;
		}
		int var47 = (int) ((float) (var44 & 0xFF) * var43);
		if (var47 > 255) {
			var47 = 255;
		}
		Unsafe var48 = this.field9460.field8247;
		var48.putFloat((long) (this.field9455 * 16) + this.field9460.field8245, (float) var9);
		var48.putFloat((long) (this.field9455 * 16) + this.field9460.field8245 + 4L, (float) var11);
		var48.putFloat((long) (this.field9455 * 16) + this.field9460.field8245 + 8L, (float) var10);
		if (this.field9460.field8348 == 0) {
			var48.putByte((long) (this.field9455 * 16) + this.field9460.field8245 + 12L, (byte) var47);
			var48.putByte((long) (this.field9455 * 16) + this.field9460.field8245 + 13L, (byte) var46);
			var48.putByte((long) (this.field9455 * 16) + this.field9460.field8245 + 14L, (byte) var45);
		} else {
			var48.putByte((long) (this.field9455 * 16) + this.field9460.field8245 + 12L, (byte) var45);
			var48.putByte((long) (this.field9455 * 16) + this.field9460.field8245 + 13L, (byte) var46);
			var48.putByte((long) (this.field9455 * 16) + this.field9460.field8245 + 14L, (byte) var47);
		}
		var48.putByte((long) (this.field9455 * 16) + this.field9460.field8245 + 15L, (byte) -1);
		this.field9455++;
		var48.putShort(this.field9460.field8245 + 2097152L + (long) (this.field9461 * 2), var14);
		this.field9461++;
	}
}
