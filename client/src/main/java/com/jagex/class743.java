package com.jagex;

import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

@ObfuscatedName("abu")
public class class743 extends class300 implements class239 {

	@ObfuscatedName("abu.m")
	public final int field8806;

	@ObfuscatedName("abu.t")
	public final int field8810;

	@ObfuscatedName("abu.l")
	public final float field8808;

	@ObfuscatedName("abu.f")
	public final float field8809;

	@ObfuscatedName("abu.d")
	public boolean field8807;

	@ObfuscatedName("abu.z")
	public boolean field8811;

	public class743(class898 arg0, class124 arg1, class139 arg2, int arg3, int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, 0, 1);
	}

	public class743(class898 arg0, class124 arg1, class139 arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.field3326.field10002) {
			this.field8806 = arg3;
			this.field8810 = arg4;
			this.field8808 = 1.0F;
			this.field8809 = 1.0F;
		} else {
			this.field8806 = IntMath.bitceil(arg3);
			this.field8810 = IntMath.bitceil(arg4);
			this.field8808 = (float) arg3 / (float) this.field8806;
			this.field8809 = (float) arg4 / (float) this.field8810;
		}
		this.field3325 = IDirect3DDevice.CreateTexture(this.field3326.field9975, arg3, arg4, 0, arg5, class898.method16037(this.field3327, this.field3329), arg6);
	}

	public class743(class898 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		super(arg0, class124.field1296, class139.field1501, arg3 && arg0.field9994, arg1 * arg2);
		if (this.field3326.field10002) {
			this.field8806 = arg1;
			this.field8810 = arg2;
			this.field8808 = 1.0F;
			this.field8809 = 1.0F;
		} else {
			this.field8806 = IntMath.bitceil(arg1);
			this.field8810 = IntMath.bitceil(arg2);
			this.field8808 = (float) arg1 / (float) this.field8806;
			this.field8809 = (float) arg2 / (float) this.field8810;
			if (this.field8806 != arg1 || this.field8810 != arg2) {
				arg4 = this.method14180(arg1, arg2, this.field8806, this.field8810, arg4, arg5, arg6);
				arg5 = 0;
				arg6 = this.field8806;
			}
		}
		if (arg3) {
			this.field3325 = IDirect3DDevice.CreateTexture(this.field3326.field9975, this.field8806, this.field8810, 0, 1024, 21, 1);
		} else {
			this.field3325 = IDirect3DDevice.CreateTexture(this.field3326.field9975, this.field8806, this.field8810, 1, 0, 21, 1);
		}
		if (arg6 == 0) {
			arg6 = this.field8806;
		}
		ByteBuffer var8 = this.field3326.field8244;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, this.field8810 * arg6);
		IDirect3DTexture.Upload(this.field3325, 0, 0, 0, this.field8806, this.field8810, this.field3327.field1306 * arg6, 0, this.field3326.field8245);
	}

	public class743(class898 arg0, class124 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
		super(arg0, arg1, class139.field1501, arg4 && arg0.field9994, arg2 * arg3);
		if (this.field3326.field10002) {
			this.field8806 = arg2;
			this.field8810 = arg3;
			this.field8808 = 1.0F;
			this.field8809 = 1.0F;
		} else {
			this.field8806 = IntMath.bitceil(arg2);
			this.field8810 = IntMath.bitceil(arg3);
			this.field8808 = (float) arg2 / (float) this.field8806;
			this.field8809 = (float) arg3 / (float) this.field8810;
			if (this.field8806 != arg2 || this.field8810 != arg3) {
				arg5 = this.method14186(arg2, arg3, this.field8806, this.field8810, arg5, arg6, arg7, arg1.field1306);
				arg6 = 0;
				arg7 = this.field8806;
			}
		}
		if (arg4) {
			this.field3325 = IDirect3DDevice.CreateTexture(this.field3326.field9975, this.field8806, this.field8810, 0, 1024, class898.method16037(this.field3327, class139.field1501), 1);
		} else {
			this.field3325 = IDirect3DDevice.CreateTexture(this.field3326.field9975, this.field8806, this.field8810, 1, 0, class898.method16037(this.field3327, class139.field1501), 1);
		}
		if (arg7 == 0) {
			arg7 = this.field8806;
		}
		ByteBuffer var9 = this.field3326.field8244;
		var9.clear();
		class124 var10001 = this.field3327;
		if (this.field3327 == class124.field1303) {
			var9.put(arg5, arg6, this.field8810 * this.field8806 / 2);
			IDirect3DTexture.Upload(this.field3325, 0, 0, 0, this.field8806, this.field8810 / 4, this.field8806 / 4 * 8, 0, this.field3326.field8245);
		} else {
			var10001 = this.field3327;
			if (this.field3327 == class124.field1295) {
				var9.put(arg5, arg6, this.field8810 * this.field8806);
				IDirect3DTexture.Upload(this.field3325, 0, 0, 0, this.field8806, this.field8810 / 4, this.field8806 / 4 * 16, 0, this.field3326.field8245);
			} else {
				var9.put(arg5, arg6, this.field8810 * arg7);
				IDirect3DTexture.Upload(this.field3325, 0, 0, 0, this.field8806, this.field8810, this.field3327.field1306 * arg7, 0, this.field3326.field8245);
			}
		}
	}

	public class743(class898 arg0, class124 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
		super(arg0, arg1, class139.field1501, arg4 && arg0.field9994, arg2 * arg3);
		if (this.field3326.field10002) {
			this.field8806 = arg2;
			this.field8810 = arg3;
			this.field8808 = 1.0F;
			this.field8809 = 1.0F;
		} else {
			this.field8806 = IntMath.bitceil(arg2);
			this.field8810 = IntMath.bitceil(arg3);
			this.field8808 = (float) arg2 / (float) this.field8806;
			this.field8809 = (float) arg3 / (float) this.field8810;
			if (this.field8806 != arg2 || this.field8810 != arg3) {
				arg5 = this.method14181(arg2, arg3, this.field8806, this.field8810, arg5, arg6, arg7, arg1.field1306);
				arg6 = 0;
				arg7 = this.field8806;
			}
		}
		if (arg4) {
			this.field3325 = IDirect3DDevice.CreateTexture(this.field3326.field9975, this.field8806, this.field8810, 0, 1024, class898.method16037(this.field3327, class139.field1506), 1);
		} else {
			this.field3325 = IDirect3DDevice.CreateTexture(this.field3326.field9975, this.field8806, this.field8810, 1, 0, class898.method16037(this.field3327, class139.field1506), 1);
		}
		if (arg7 == 0) {
			arg7 = this.field8806;
		}
		ByteBuffer var9 = this.field3326.field8244;
		var9.clear();
		var9.asFloatBuffer().put(arg5, arg6, this.field3327.field1306 * this.field8810 * arg7);
		IDirect3DTexture.Upload(this.field3325, 0, 0, 0, this.field8806, this.field8810, this.field3327.field1306 * arg7 * 4, 0, this.field3326.field8245);
	}

	@ObfuscatedName("abu.u()I")
	public int method4409() {
		return this.field8806;
	}

	@ObfuscatedName("abu.j()I")
	public int method4449() {
		return this.field8810;
	}

	@ObfuscatedName("abu.a(F)F")
	public float method4437(float arg0) {
		return arg0 / (float) this.field8806;
	}

	@ObfuscatedName("abu.t(F)F")
	public float method4439(float arg0) {
		return arg0 / (float) this.field8810;
	}

	@ObfuscatedName("abu.o()F")
	public float method4433() {
		return this.field8808;
	}

	@ObfuscatedName("abu.q()F")
	public float method4443() {
		return this.field8809;
	}

	@ObfuscatedName("abu.l()Z")
	public boolean method4408() {
		return true;
	}

	@ObfuscatedName("abu.bg()J")
	public long method4923() {
		return this.field3325;
	}

	@ObfuscatedName("abu.ae(Lhd;)V")
	public void method4525(class241 arg0) {
		super.method4525(arg0);
	}

	@ObfuscatedName("abu.f(ZZ)V")
	public void method4412(boolean arg0, boolean arg1) {
		this.field8807 = arg0;
		this.field8811 = arg1;
	}

	@ObfuscatedName("abu.d(IIII[III)V")
	public void method4413(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		if (class124.field1296 != this.field3327 || class139.field1501 != this.field3329) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		ByteBuffer var8 = this.field3326.field8244;
		var8.clear();
		var8.asIntBuffer().put(arg4, arg5, arg3 * arg6);
		IDirect3DTexture.Upload(this.field3325, 0, arg0, arg1, arg2, arg3, this.field3327.field1306 * arg6, 0, this.field3326.field8245);
	}

	@ObfuscatedName("abu.z(IIII[BLcy;II)V")
	public void method4414(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class124 arg5, int arg6, int arg7) {
		if (this.field3327 != arg5 || class139.field1501 != this.field3329) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		ByteBuffer var9 = this.field3326.field8244;
		var9.clear();
		var9.put(arg4, arg6, arg3 * arg7);
		IDirect3DTexture.Upload(this.field3325, 0, arg0, arg1, arg2, arg3, this.field3327.field1306 * arg7, 0, this.field3326.field8245);
	}

	@ObfuscatedName("abu.n(IIII[II)V")
	public void method4415(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		if (class124.field1296 != this.field3327 || class139.field1501 != this.field3329) {
			throw new RuntimeException();
		}
		ByteBuffer var7 = this.field3326.field8244;
		var7.clear();
		IDirect3DTexture.Download(this.field3325, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.field3326.field8245);
		var7.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@ObfuscatedName("abu.au()V")
	public void method4527() {
		this.field3326.method16080(this);
	}

	@ObfuscatedName("abu.p()Z")
	public boolean method4418() {
		return false;
	}

	@ObfuscatedName("abu.br(IIII[III)[I")
	public int[] method14180(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		int[] var8 = new int[arg2 * arg3];
		if (arg6 == 0) {
			arg6 = arg0;
		}
		for (int var9 = 0; var9 < arg3; var9++) {
			if (var9 >= arg1) {
				int var14 = (arg1 - 1) * arg2;
				for (int var15 = 0; var15 < arg2; var15++) {
					var8[arg2 * var9 + var15] = var8[var14 + var15];
				}
			} else {
				int var10 = arg6 * var9 + arg5;
				for (int var11 = 0; var11 < arg0; var11++) {
					var8[arg2 * var9 + var11] = arg4[var10 + var11];
				}
				int var12 = arg4[arg0 - 1 + var10];
				for (int var13 = arg0; var13 < arg2; var13++) {
					var8[arg2 * var9 + var13] = var12;
				}
			}
		}
		return var8;
	}

	@ObfuscatedName("abu.bp(IIII[FIII)[F")
	public float[] method14181(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7) {
		float[] var9 = new float[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (int var10 = 0; var10 < arg3; var10++) {
			if (var10 < arg1) {
				int var11 = arg6 * var10 + arg5;
				for (int var12 = 0; var12 < arg0; var12++) {
					for (int var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + arg7 * var12 + var13] = arg4[arg7 * var12 + var11 + var13];
					}
				}
				float[] var14 = new float[arg7];
				for (int var15 = 0; var15 < arg7; var15++) {
					var14[var15] = arg4[(arg0 - 1) * arg7 + var11 + var15];
				}
				for (int var16 = arg0; var16 < arg2; var16++) {
					for (int var17 = 0; var17 < arg7; var17++) {
						var9[arg2 * var10 * arg7 + arg7 * var16 + var17] = var14[var17];
					}
				}
			} else {
				int var18 = (arg1 - 1) * arg2 * arg7;
				for (int var19 = 0; var19 < arg2; var19++) {
					for (int var20 = 0; var20 < arg7; var20++) {
						var9[arg2 * var10 * arg7 + arg7 * var19 + var20] = var9[arg7 * var19 + var18 + var20];
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("abu.bi(IIII[BIII)[B")
	public byte[] method14186(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
		byte[] var9 = new byte[arg2 * arg3 * arg7];
		if (arg6 == 0) {
			arg6 = arg0 * arg7;
		}
		for (int var10 = 0; var10 < arg3; var10++) {
			if (var10 < arg1) {
				int var11 = arg6 * var10 + arg5;
				for (int var12 = 0; var12 < arg0; var12++) {
					for (int var13 = 0; var13 < arg7; var13++) {
						var9[arg2 * var10 * arg7 + arg7 * var12 + var13] = arg4[arg7 * var12 + var11 + var13];
					}
				}
				byte[] var14 = new byte[arg7];
				for (int var15 = 0; var15 < arg7; var15++) {
					var14[var15] = arg4[(arg0 - 1) * arg7 + var11 + var15];
				}
				for (int var16 = arg0; var16 < arg2; var16++) {
					for (int var17 = 0; var17 < arg7; var17++) {
						var9[arg2 * var10 * arg7 + arg7 * var16 + var17] = var14[var17];
					}
				}
			} else {
				int var18 = (arg1 - 1) * arg2 * arg7;
				for (int var19 = 0; var19 < arg2; var19++) {
					for (int var20 = 0; var20 < arg7; var20++) {
						var9[arg2 * var10 * arg7 + arg7 * var19 + var20] = var9[arg7 * var19 + var18 + var20];
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("abu.s()V")
	public void method168() {
		super.method168();
	}
}
