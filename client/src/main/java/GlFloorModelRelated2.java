
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("cl")
public class GlFloorModelRelated2 {

	@ObfuscatedName("cl.u")
	public final GlToolkit field1141;

	@ObfuscatedName("cl.j")
	public final GlFloorModel field1138;

	@ObfuscatedName("cl.a")
	public final int field1139;

	@ObfuscatedName("cl.s")
	public final int field1140;

	@ObfuscatedName("cl.c")
	public final byte[] field1142;

	@ObfuscatedName("cl.m")
	public final int field1137;

	@ObfuscatedName("cl.t")
	public final int field1144;

	@ObfuscatedName("cl.l")
	public final int field1143;

	@ObfuscatedName("cl.f")
	public class80[][] field1145;

	public GlFloorModelRelated2(GlToolkit arg0, GlFloorModel arg1) {
		this.field1141 = arg0;
		this.field1138 = arg1;
		this.field1139 = (this.field1138.field387 * this.field1138.field385 >> this.field1141.field8092) + 2;
		this.field1140 = (this.field1138.field386 * this.field1138.field385 >> this.field1141.field8092) + 2;
		this.field1142 = new byte[this.field1140 * this.field1139];
		this.field1143 = this.field1141.field8092 + 7 - this.field1138.field388;
		this.field1137 = this.field1138.field387 >> this.field1143;
		this.field1144 = this.field1138.field386 >> this.field1143;
	}

	@ObfuscatedName("cl.u()V")
	public void method2276() {
		this.field1145 = new class80[this.field1137][this.field1144];
		for (int var1 = 0; var1 < this.field1144; var1++) {
			for (int var2 = 0; var2 < this.field1137; var2++) {
				this.field1145[var2][var1] = new class80(this.field1141, this, this.field1138, var2, var1, this.field1143, var2 * 128 + 1, var1 * 128 + 1);
			}
		}
	}

	@ObfuscatedName("cl.j(III[[ZZ)V")
	public void method2277(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
		this.field1141.method13322(false);
		this.field1141.method13325(false);
		this.field1141.method13312(-2);
		this.field1141.method13316(1);
		this.field1141.method13327(1);
		float var6 = 1.0F / (float) (this.field1141.field8217 * 128);
		if (arg4) {
			for (int var7 = 0; var7 < this.field1144; var7++) {
				int var8 = var7 << this.field1143;
				int var9 = var7 + 1 << this.field1143;
				label128: for (int var10 = 0; var10 < this.field1137; var10++) {
					int var11 = var10 << this.field1143;
					int var12 = var10 + 1 << this.field1143;
					for (int var13 = var11; var13 < var12; var13++) {
						if (var13 - arg0 >= -arg2 && var13 - arg0 <= arg2) {
							for (int var14 = var8; var14 < var9; var14++) {
								if (var14 - arg1 >= -arg2 && var14 - arg1 <= arg2 && arg3[var13 - arg0 + arg2][var14 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(var6, var6, 1.0F);
									OpenGL.glTranslatef((float) -var10 / var6, (float) -var7 / var6, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.field1145[var10][var7].method2030();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (int var15 = 0; var15 < this.field1144; var15++) {
				int var16 = var15 << this.field1143;
				int var17 = var15 + 1 << this.field1143;
				for (int var18 = 0; var18 < this.field1137; var18++) {
					int var19 = 0;
					int var20 = var18 << this.field1143;
					int var21 = var18 + 1 << this.field1143;
					GpuPacket var22 = this.field1141.field8226;
					var22.field9626 = 0;
					for (int var23 = var16; var23 < var17; var23++) {
						if (var23 - arg1 >= -arg2 && var23 - arg1 <= arg2) {
							int var24 = this.field1138.field387 * var23 + var20;
							for (int var25 = var20; var25 < var21; var25++) {
								if (var25 - arg0 >= -arg2 && var25 - arg0 <= arg2 && arg3[var25 - arg0 + arg2][var23 - arg1 + arg2]) {
									short[] var26 = this.field1138.field7687[var24];
									if (var26 != null) {
										if (this.field1141.field8149) {
											for (int var27 = 0; var27 < var26.length; var27++) {
												var22.method15287(var26[var27] & 0xFFFF);
												var19++;
											}
										} else {
											for (int var28 = 0; var28 < var26.length; var28++) {
												var22.method15221(var26[var28] & 0xFFFF);
												var19++;
											}
										}
									}
								}
								var24++;
							}
						}
					}
					if (var19 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(var6, var6, 1.0F);
						OpenGL.glTranslatef((float) -var18 / var6, (float) -var15 / var6, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.field1145[var18][var15].method2041(var22.field9629, var19);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@ObfuscatedName("cl.a(Lna;II)V")
	public void method2281(HardShadow arg0, int arg1, int arg2) {
		GlHardShadow var4 = (GlHardShadow) arg0;
		int var5 = var4.field10578 + 1 + arg1;
		int var6 = var4.field10575 + 1 + arg2;
		int var7 = this.field1139 * var6 + var5;
		int var8 = 0;
		int var9 = var4.field10579;
		int var10 = var4.field10576;
		int var11 = this.field1139 - var10;
		int var12 = 0;
		if (var6 <= 0) {
			int var13 = 1 - var6;
			var9 -= var13;
			var8 += var10 * var13;
			var7 += this.field1139 * var13;
			var6 = 1;
		}
		if (var6 + var9 >= this.field1140) {
			int var14 = var6 + var9 + 1 - this.field1140;
			var9 -= var14;
		}
		if (var5 <= 0) {
			int var15 = 1 - var5;
			var10 -= var15;
			var8 += var15;
			var7 += var15;
			var12 += var15;
			var11 += var15;
			var5 = 1;
		}
		if (var5 + var10 >= this.field1139) {
			int var16 = var5 + var10 + 1 - this.field1139;
			var10 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var10 > 0 && var9 > 0) {
			method2290(this.field1142, var4.field10580, var8, var7, var10, var9, var11, var12);
			this.method2288(var5, var6, var10, var9);
		}
	}

	@ObfuscatedName("cl.s(Lna;II)V")
	public void method2287(HardShadow arg0, int arg1, int arg2) {
		GlHardShadow var4 = (GlHardShadow) arg0;
		int var5 = var4.field10578 + 1 + arg1;
		int var6 = var4.field10575 + 1 + arg2;
		int var7 = this.field1139 * var6 + var5;
		int var8 = 0;
		int var9 = var4.field10579;
		int var10 = var4.field10576;
		int var11 = this.field1139 - var10;
		int var12 = 0;
		if (var6 <= 0) {
			int var13 = 1 - var6;
			var9 -= var13;
			var8 += var10 * var13;
			var7 += this.field1139 * var13;
			var6 = 1;
		}
		if (var6 + var9 >= this.field1140) {
			int var14 = var6 + var9 + 1 - this.field1140;
			var9 -= var14;
		}
		if (var5 <= 0) {
			int var15 = 1 - var5;
			var10 -= var15;
			var8 += var15;
			var7 += var15;
			var12 += var15;
			var11 += var15;
			var5 = 1;
		}
		if (var5 + var10 >= this.field1139) {
			int var16 = var5 + var10 + 1 - this.field1139;
			var10 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (var10 > 0 && var9 > 0) {
			method2282(this.field1142, var4.field10580, var8, var7, var10, var9, var11, var12);
			this.method2288(var5, var6, var10, var9);
		}
	}

	@ObfuscatedName("cl.c(Lna;II)Z")
	public boolean method2279(HardShadow arg0, int arg1, int arg2) {
		GlHardShadow var4 = (GlHardShadow) arg0;
		int var5 = var4.field10578 + 1 + arg1;
		int var6 = var4.field10575 + 1 + arg2;
		int var7 = this.field1139 * var6 + var5;
		int var8 = var4.field10579;
		int var9 = var4.field10576;
		int var10 = this.field1139 - var9;
		if (var6 <= 0) {
			int var11 = 1 - var6;
			var8 -= var11;
			var7 += this.field1139 * var11;
			var6 = 1;
		}
		if (var6 + var8 >= this.field1140) {
			int var12 = var6 + var8 + 1 - this.field1140;
			var8 -= var12;
		}
		if (var5 <= 0) {
			int var13 = 1 - var5;
			var9 -= var13;
			var7 += var13;
			var10 += var13;
			var5 = 1;
		}
		if (var5 + var9 >= this.field1139) {
			int var14 = var5 + var9 + 1 - this.field1139;
			var9 -= var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			byte var15 = 8;
			int var16 = (var15 - 1) * this.field1139 + var10;
			return method2275(this.field1142, var7, var9, var8, var16, var15);
		} else {
			return false;
		}
	}

	@ObfuscatedName("cl.m(IIII)V")
	public void method2288(int arg0, int arg1, int arg2, int arg3) {
		if (this.field1145 == null) {
			return;
		}
		int var5 = arg0 - 1 >> 7;
		int var6 = arg0 - 1 + arg2 - 1 >> 7;
		int var7 = arg1 - 1 >> 7;
		int var8 = arg1 - 1 + arg3 - 1 >> 7;
		for (int var9 = var5; var9 <= var6; var9++) {
			class80[] var10 = this.field1145[var9];
			for (int var11 = var7; var11 <= var8; var11++) {
				var10[var11].field1033 = true;
			}
		}
	}

	@ObfuscatedName("cl.t([B[BIIIIII)V")
	public static final void method2290(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			int var10001;
			for (int var11 = var8; var11 < 0; var11++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] += arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] += arg1[arg2++];
				int var15 = arg3++;
				arg0[var15] += arg1[arg2++];
			}
			for (int var12 = var9; var12 < 0; var12++) {
				var10001 = arg3++;
				arg0[var10001] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("cl.l([B[BIIIIII)V")
	public static final void method2282(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			int var10001;
			for (int var11 = var8; var11 < 0; var11++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
				int var13 = arg3++;
				arg0[var13] -= arg1[arg2++];
				int var14 = arg3++;
				arg0[var14] -= arg1[arg2++];
				int var15 = arg3++;
				arg0[var15] -= arg1[arg2++];
			}
			for (int var12 = var9; var12 < 0; var12++) {
				var10001 = arg3++;
				arg0[var10001] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("cl.f([BIIIII)Z")
	public static final boolean method2275(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 % arg5;
		int var7;
		if (var6 == 0) {
			var7 = 0;
		} else {
			var7 = arg5 - var6;
		}
		int var8 = -((arg3 + arg5 - 1) / arg5);
		int var9 = -((arg2 + arg5 - 1) / arg5);
		for (int var10 = var8; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			int var12 = arg1 - var7;
			if (arg0[var12 - 1] == 0) {
				return true;
			}
			arg1 = arg4 + var12;
		}
		return false;
	}
}
