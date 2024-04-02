
import deob.ObfuscatedName;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

@ObfuscatedName("acs")
public class GlFloorModelRelated1 extends Node {

	@ObfuscatedName("acs.s")
	public final GlToolkit field9350;

	@ObfuscatedName("acs.c")
	public final GlFloorModel field9342;

	@ObfuscatedName("acs.m")
	public final int field9343;

	@ObfuscatedName("acs.t")
	public final float field9341;

	@ObfuscatedName("acs.l")
	public final WaterFogData field9345;

	@ObfuscatedName("acs.f")
	public GlRelated1 field9349;

	@ObfuscatedName("acs.d")
	public class655 field9347;

	@ObfuscatedName("acs.z")
	public int[] field9348;

	@ObfuscatedName("acs.n")
	public NativeHeapBuffer field9346;

	@ObfuscatedName("acs.o")
	public Stream field9344;

	public GlFloorModelRelated1(GlFloorModel arg0, int arg1, int arg2, WaterFogData arg3) {
		this.field9342 = arg0;
		this.field9350 = this.field9342.field7688;
		this.field9343 = arg1;
		this.field9341 = arg2;
		this.field9345 = arg3;
		this.field9348 = new int[this.field9342.field387 * this.field9342.field386];
		this.field9347 = new class655(this.field9350, 5123, null, 1);
	}

	@ObfuscatedName("acs.u(I)V")
	public void method14874(int arg0) {
		this.field9346 = this.field9350.field8094.method70(arg0 * 4, true);
		this.field9344 = new Stream(this.field9346);
	}

	@ObfuscatedName("acs.j(I)V")
	public void method14870(int arg0) {
		this.field9344.method37(arg0 * 4 + 3);
		this.field9344.method38(-1);
	}

	@ObfuscatedName("acs.a(III)V")
	public void method14866(int arg0, int arg1, int arg2) {
		this.field9348[this.field9342.field387 * arg1 + arg0] |= 0x1 << arg2;
	}

	@ObfuscatedName("acs.s(IIIF)V")
	public void method14860(int arg0, int arg1, int arg2, float arg3) {
		if (this.field9343 != -1) {
			Material var5 = this.field9350.field400.method889(this.field9343);
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
		this.field9344.method37(arg0 * 4);
		this.field9344.method38((byte) (arg1 >> 16));
		this.field9344.method38((byte) (arg1 >> 8));
		this.field9344.method38((byte) arg1);
	}

	@ObfuscatedName("acs.c(I)V")
	public void method14861(int arg0) {
		this.field9344.method41();
		GlInterfaceRelated var2 = this.field9350.method13302(4, this.field9346, arg0 * 4, false);
		if (var2 instanceof class653) {
			this.field9346.method62();
		}
		this.field9349 = new GlRelated1(var2, 5121, 4, 0);
		this.field9346 = null;
		this.field9344 = null;
	}

	@ObfuscatedName("acs.m([II)V")
	public void method14862(int[] arg0, int arg1) {
		int var3 = 0;
		GpuPacket var4 = this.field9350.field8226;
		var4.field9626 = 0;
		if (this.field9350.field8149) {
			for (int var5 = 0; var5 < arg1; var5++) {
				int var6 = arg0[var5];
				short[] var7 = this.field9342.field7687[var6];
				int var8 = this.field9348[var6];
				if (var8 != 0 && var7 != null) {
					int var9 = 0;
					int var10 = 0;
					while (var10 < var7.length) {
						if ((var8 & 0x1 << var9++) == 0) {
							var10 += 3;
						} else {
							var4.method15287(var7[var10++] & 0xFFFF);
							var3++;
							var4.method15287(var7[var10++] & 0xFFFF);
							var3++;
							var4.method15287(var7[var10++] & 0xFFFF);
							var3++;
						}
					}
				}
			}
		} else {
			for (int var11 = 0; var11 < arg1; var11++) {
				int var12 = arg0[var11];
				short[] var13 = this.field9342.field7687[var12];
				int var14 = this.field9348[var12];
				if (var14 != 0 && var13 != null) {
					int var15 = 0;
					int var16 = 0;
					while (var16 < var13.length) {
						if ((var14 & 0x1 << var15++) == 0) {
							var16 += 3;
						} else {
							var4.method15221(var13[var16++] & 0xFFFF);
							var3++;
							var4.method15221(var13[var16++] & 0xFFFF);
							var3++;
							var4.method15221(var13[var16++] & 0xFFFF);
							var3++;
						}
					}
				}
			}
		}
		if (var3 <= 0) {
			return;
		}
		this.field9347.method2338(5123, var4.field9629, var4.field9626);
		this.field9350.method13305(this.field9342.field7708, this.field9342.field7710, this.field9349, this.field9342.field7701);
		this.field9350.method13473(this.field9343, (this.field9342.field7692 & 0x7) != 0, (this.field9342.field7692 & 0x8) != 0);
		if (this.field9350.field8174) {
			this.field9350.method547(Integer.MAX_VALUE, this.field9345);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.field9341, 1.0F / this.field9341, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.field9350.method13305(this.field9342.field7708, this.field9342.field7710, this.field9349, this.field9342.field7701);
		this.field9350.method13307(this.field9347, 4, 0, var3);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
