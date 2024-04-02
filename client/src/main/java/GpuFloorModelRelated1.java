
import deob.ObfuscatedName;
import java.nio.ByteBuffer;

@ObfuscatedName("add")
public class GpuFloorModelRelated1 extends Node {

	@ObfuscatedName("add.s")
	public final GpuToolkit field9439;

	@ObfuscatedName("add.c")
	public final GpuFloorModel field9437;

	@ObfuscatedName("add.m")
	public final int field9438;

	@ObfuscatedName("add.t")
	public final float field9441;

	@ObfuscatedName("add.l")
	public class137 field9440;

	@ObfuscatedName("add.f")
	public VertexBuffer field9446;

	@ObfuscatedName("add.d")
	public int field9447 = 0;

	@ObfuscatedName("add.z")
	public int[] field9436;

	@ObfuscatedName("add.n")
	public int field9444 = 0;

	@ObfuscatedName("add.o")
	public int field9445 = 0;

	@ObfuscatedName("add.q")
	public int field9442 = 0;

	@ObfuscatedName("add.p")
	public long field9443;

	public GpuFloorModelRelated1(GpuFloorModel arg0, int arg1, int arg2, class137 arg3) {
		this.field9437 = arg0;
		this.field9439 = this.field9437.field7722;
		this.field9438 = arg1;
		this.field9441 = arg2;
		this.field9440 = arg3;
		this.field9436 = new int[this.field9437.field387 * this.field9437.field386];
		byte var5 = 10;
		if (arg1 >= 0) {
			class120 var6 = this.field9439.field400.method889(arg1);
			if (var6.field1270 > 0) {
				var5 = var6.field1270;
			}
		}
		this.field9439.method13739(var5);
		this.field9439.method13739(3);
	}

	@ObfuscatedName("add.u(I)V")
	public void method14996(int arg0) {
		this.field9443 = this.field9439.field8247.allocateMemory((long) (arg0 * 4));
		for (int var2 = 3; var2 < arg0 * 4; var2 += 4) {
			this.field9439.field8247.putByte((long) var2 + this.field9443, (byte) 0);
		}
	}

	@ObfuscatedName("add.j(I)V")
	public void method15001(int arg0) {
		this.field9439.field8247.putByte((long) (arg0 * 4) + this.field9443 + 3L, (byte) -1);
	}

	@ObfuscatedName("add.a(III)V")
	public void method14998(int arg0, int arg1, int arg2) {
		this.field9436[this.field9437.field387 * arg1 + arg0] |= 0x1 << arg2;
		this.field9447++;
	}

	@ObfuscatedName("add.s(IIIF)V")
	public void method15005(int arg0, int arg1, int arg2, float arg3) {
		if (this.field9438 != -1) {
			class120 var5 = this.field9439.field400.method889(this.field9438);
			int var6 = var5.field1266 & 0xFF;
			if (var6 != 0 && var5.field1270 != 4) {
				int var7;
				if (arg2 < 0) {
					var7 = 0;
				} else if (arg2 > 127) {
					var7 = 16777215;
				} else {
					var7 = arg2 * 131586;
				}
				if (var6 == 256) {
					arg1 = var7;
				} else {
					int var9 = 256 - var6;
					arg1 = ((arg1 & 0xFF00FF) * var9 + (var7 & 0xFF00FF) * var6 & 0xFF00FF00) + ((arg1 & 0xFF00) * var9 + (var7 & 0xFF00) * var6 & 0xFF0000) >> 8;
				}
			}
			int var10 = var5.field1267 & 0xFF;
			if (var10 != 0) {
				var10 += 256;
				int var11 = (arg1 >> 16 & 0xFF) * var10;
				if (var11 > 65535) {
					var11 = 65535;
				}
				int var12 = (arg1 >> 8 & 0xFF) * var10;
				if (var12 > 65535) {
					var12 = 65535;
				}
				int var13 = (arg1 & 0xFF) * var10;
				if (var13 > 65535) {
					var13 = 65535;
				}
				arg1 = (var13 >> 8) + ((var11 & 0xFF00) << 8) + (var12 & 0xFF00);
			}
		}
		if (arg3 != 1.0F) {
			int var14 = arg1 >> 16 & 0xFF;
			int var15 = arg1 >> 8 & 0xFF;
			int var16 = arg1 & 0xFF;
			int var17 = (int) ((float) var14 * arg3);
			if (var17 < 0) {
				var17 = 0;
			} else if (var17 > 255) {
				var17 = 255;
			}
			int var18 = (int) ((float) var15 * arg3);
			if (var18 < 0) {
				var18 = 0;
			} else if (var18 > 255) {
				var18 = 255;
			}
			int var19 = (int) ((float) var16 * arg3);
			if (var19 < 0) {
				var19 = 0;
			} else if (var19 > 255) {
				var19 = 255;
			}
			arg1 = var17 << 16 | var18 << 8 | var19;
		}
		if (this.field9439.field8348 == 0) {
			this.field9439.field8247.putByte((long) (arg0 * 4) + this.field9443, (byte) (arg1 >> 16));
			this.field9439.field8247.putByte((long) (arg0 * 4) + this.field9443 + 1L, (byte) (arg1 >> 8));
			this.field9439.field8247.putByte((long) (arg0 * 4) + this.field9443 + 2L, (byte) arg1);
		} else {
			this.field9439.field8247.putByte((long) (arg0 * 4) + this.field9443, (byte) arg1);
			this.field9439.field8247.putByte((long) (arg0 * 4) + this.field9443 + 1L, (byte) (arg1 >> 8));
			this.field9439.field8247.putByte((long) (arg0 * 4) + this.field9443 + 2L, (byte) (arg1 >> 16));
		}
	}

	@ObfuscatedName("add.c(I)V")
	public void method15000(int arg0) {
		this.field9446 = this.field9439.method13584(false);
		this.field9446.method4269(arg0 * 4, 4);
		this.field9446.method4452(0, arg0 * 4, this.field9443);
		this.field9439.field8247.freeMemory(this.field9443);
	}

	@ObfuscatedName("add.m([II)V")
	public void method14995(int[] arg0, int arg1) {
		this.field9444 = 0;
		this.field9445 = 32767;
		this.field9442 = -32768;
		ByteBuffer var3 = this.field9439.field8244;
		label49: for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0[var4];
			short[] var6 = this.field9437.field7724[var5];
			int var7 = this.field9436[var5];
			if (var7 != 0 && var6 != null) {
				int var8 = 0;
				int var9 = 0;
				while (true) {
					while (true) {
						if (var9 >= var6.length) {
							continue label49;
						}
						if ((var7 & 0x1 << var8++) == 0) {
							var9 += 3;
						} else {
							for (int var10 = 0; var10 < 3; var10++) {
								int var11 = var6[var9++] & 0xFFFF;
								if (var11 > this.field9442) {
									this.field9442 = var11;
								}
								if (var11 < this.field9445) {
									this.field9445 = var11;
								}
								var3.putShort((short) var11);
							}
							this.field9444 += 3;
						}
					}
				}
			}
		}
	}
}
