
import deob.ObfuscatedName;
import java.nio.ByteBuffer;

@ObfuscatedName("hq")
public class class234 {

	@ObfuscatedName("hq.a")
	public final GpuToolkit field2451;

	@ObfuscatedName("hq.s")
	public final GpuFloorModelHardShadows field2457;

	@ObfuscatedName("hq.c")
	public final int field2452;

	@ObfuscatedName("hq.m")
	public final int field2454;

	@ObfuscatedName("hq.t")
	public boolean field2455 = true;

	@ObfuscatedName("hq.l")
	public int field2456 = -1;

	@ObfuscatedName("hq.f")
	public final int field2449;

	@ObfuscatedName("hq.d")
	public IndexBuffer field2458;

	@ObfuscatedName("hq.z")
	public GpuTexture field2459;

	@ObfuscatedName("hq.n")
	public int field2453;

	@ObfuscatedName("hq.o")
	public int field2461;

	@ObfuscatedName("hq.q")
	public int[] field2462;

	@ObfuscatedName("hq.p")
	public byte[] field2463;

	public class234(GpuToolkit arg0, GpuFloorModelHardShadows arg1, GpuFloorModel arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field2451 = arg0;
		this.field2457 = arg1;
		this.field2452 = arg6;
		this.field2454 = arg7;
		int var9 = 0x1 << arg5;
		int var10 = 0;
		int var11 = arg3 << arg5;
		int var12 = arg4 << arg5;
		for (int var13 = 0; var13 < var9; var13++) {
			int var14 = arg2.field387 * (var12 + var13) + var11;
			for (int var15 = 0; var15 < var9; var15++) {
				short[] var16 = arg2.field7724[var14++];
				if (var16 != null) {
					var10 += var16.length;
				}
			}
		}
		if (var10 > 0) {
			this.field2461 = Integer.MIN_VALUE;
			this.field2453 = Integer.MAX_VALUE;
			this.field2458 = this.field2451.method13797(false);
			this.field2458.method4535(var10);
			ByteBuffer var17 = this.field2451.field8244;
			var17.clear();
			for (int var18 = 0; var18 < var9; var18++) {
				int var19 = arg2.field387 * (var12 + var18) + var11;
				for (int var20 = 0; var20 < var9; var20++) {
					short[] var21 = arg2.field7724[var19++];
					if (var21 != null) {
						for (int var22 = 0; var22 < var21.length; var22++) {
							int var23 = var21[var22] & 0xFFFF;
							if (var23 < this.field2453) {
								this.field2453 = var23;
							}
							if (var23 > this.field2461) {
								this.field2461 = var23;
							}
							var17.putShort((short) var23);
						}
					}
				}
			}
			this.field2458.method4452(0, var17.position(), this.field2451.field8245);
			this.field2449 = var10 / 3;
		} else {
			this.field2449 = 0;
			this.field2459 = null;
		}
	}

	@ObfuscatedName("hq.u(Lfq;)V")
	public void method4363(ModelShader arg0) {
		this.method4371(arg0, this.field2458, 0, this.field2449);
	}

	@ObfuscatedName("hq.j(Lfq;Lin;II)V")
	public void method4371(ModelShader arg0, IndexBuffer arg1, int arg2, int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method4365();
		this.field2451.method13588(arg1);
		arg0.field2268 = this.field2459;
		arg0.field2267 = this.field2453;
		arg0.field2261 = this.field2461 - this.field2453 + 1;
		arg0.field2269 = arg2;
		arg0.field2252 = arg3;
		arg0.method3849(false);
	}

	@ObfuscatedName("hq.a()V")
	public void method4365() {
		if (!this.field2455) {
			return;
		}
		this.field2455 = false;
		byte[] var1 = this.field2457.field2468;
		int var2 = 0;
		int var3 = this.field2457.field2466;
		int var4 = this.field2457.field2466 * this.field2454 + this.field2452;
		for (int var5 = -128; var5 < 0; var5++) {
			var2 = (var2 << 8) - var2;
			for (int var6 = -128; var6 < 0; var6++) {
				if (var1[var4++] != 0) {
					var2++;
				}
			}
			var4 += var3 - 128;
		}
		if (this.field2459 != null && this.field2456 == var2) {
			this.field2455 = false;
			return;
		}
		this.field2456 = var2;
		int var7 = 0;
		int var8 = this.field2454 * var3 + this.field2452;
		if (!this.field2451.method13546(class124.field1297, DataType.field1501)) {
			if (this.field2462 == null) {
				this.field2462 = new int[16384];
			}
			int[] var13 = this.field2462;
			for (int var14 = -128; var14 < 0; var14++) {
				for (int var15 = -128; var15 < 0; var15++) {
					if (var1[var8] == 0) {
						int var16 = 0;
						if (var1[var8 - 1] != 0) {
							var16++;
						}
						if (var1[var8 + 1] != 0) {
							var16++;
						}
						if (var1[var8 - var3] != 0) {
							var16++;
						}
						if (var1[var3 + var8] != 0) {
							var16++;
						}
						var13[var7++] = var16 * 17 << 24;
					} else {
						var13[var7++] = 1140850688;
					}
					var8++;
				}
				var8 += this.field2457.field2466 - 128;
			}
			if (this.field2459 == null) {
				this.field2459 = this.field2451.method13548(128, 128, false, this.field2462);
				this.field2459.method4412(false, false);
			} else {
				this.field2459.method4413(0, 0, 128, 128, this.field2462, 0, 128);
			}
			return;
		}
		if (this.field2463 == null) {
			this.field2463 = new byte[16384];
		}
		byte[] var9 = this.field2463;
		for (int var10 = -128; var10 < 0; var10++) {
			for (int var11 = -128; var11 < 0; var11++) {
				if (var1[var8] == 0) {
					int var12 = 0;
					if (var1[var8 - 1] != 0) {
						var12++;
					}
					if (var1[var8 + 1] != 0) {
						var12++;
					}
					if (var1[var8 - var3] != 0) {
						var12++;
					}
					if (var1[var3 + var8] != 0) {
						var12++;
					}
					var9[var7++] = (byte) (var12 * 17);
				} else {
					var9[var7++] = 68;
				}
				var8++;
			}
			var8 += this.field2457.field2466 - 128;
		}
		if (this.field2459 == null) {
			this.field2459 = this.field2451.method13549(class124.field1297, 128, 128, false, this.field2463);
			this.field2459.method4412(false, false);
		} else {
			this.field2459.method4414(0, 0, 128, 128, this.field2463, class124.field1297, 0, 128);
		}
	}
}
