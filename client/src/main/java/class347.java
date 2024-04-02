
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("lm")
public abstract class class347 implements class254 {

	@ObfuscatedName("lm.m")
	public final GlxToolkit field3733;

	@ObfuscatedName("lm.t")
	public int field3734;

	@ObfuscatedName("lm.l")
	public final int field3737;

	@ObfuscatedName("lm.f")
	public final class124 field3736;

	@ObfuscatedName("lm.d")
	public final DataType field3731;

	@ObfuscatedName("lm.z")
	public boolean field3728;

	@ObfuscatedName("lm.n")
	public GpuTextureRelated field3739 = GpuTextureRelated.field2501;

	@ObfuscatedName("lm.o")
	public final int field3729;

	@ObfuscatedName("lm.q")
	public static final int[] field3740 = new int[1];

	public class347(GlxToolkit arg0, int arg1, class124 arg2, DataType arg3, int arg4, boolean arg5) {
		this.field3733 = arg0;
		this.field3737 = arg1;
		this.field3736 = arg2;
		this.field3731 = arg3;
		this.field3728 = arg5;
		this.field3729 = arg4;
		OpenGL.glGenTextures(1, field3740, 0);
		this.field3734 = field3740[0];
		this.method5972();
		this.method5979(0);
	}

	@ObfuscatedName("lm.au()V")
	public void method4527() {
		int var1 = this.field3733.method13556();
		int var2 = this.field3733.field10018[var1];
		if (this.field3737 != var2) {
			if (var2 != 0) {
				OpenGL.glBindTexture(var2, 0);
				OpenGL.glDisable(var2);
			}
			OpenGL.glEnable(this.field3737);
			this.field3733.field10018[var1] = this.field3737;
		}
		OpenGL.glBindTexture(this.field3737, this.field3734);
	}

	@ObfuscatedName("lm.ae(Lhd;)V")
	public void method4525(GpuTextureRelated arg0) {
		if (this.field3739 != arg0) {
			this.field3739 = arg0;
			this.method5972();
		}
	}

	@ObfuscatedName("lm.bg()V")
	public void method5972() {
		this.field3733.method13557(this);
		if (GpuTextureRelated.field2501 == this.field3739) {
			OpenGL.glTexParameteri(this.field3737, 10241, this.field3728 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.field3737, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.field3737, 10241, this.field3728 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.field3737, 10240, 9728);
		}
	}

	@ObfuscatedName("lm.p()Z")
	public boolean method4418() {
		int var1 = this.method5971();
		this.field3733.method13557(this);
		OpenGL.glGenerateMipmapEXT(this.field3737);
		this.field3728 = true;
		this.method5972();
		this.method5979(var1);
		return true;
	}

	@ObfuscatedName("lm.bl(III[I)V")
	public void method5985(int arg0, int arg1, int arg2, int[] arg3) {
		if (arg1 > 0 && !class595.method11258(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !class595.method11258(arg2)) {
			throw new IllegalArgumentException("");
		} else if (class124.field1296 == this.field3736) {
			int var5 = 0;
			int var6 = arg1 < arg2 ? arg1 : arg2;
			int var7 = arg1 >> 1;
			int var8 = arg2 >> 1;
			int[] var9 = arg3;
			int[] var10 = new int[var7 * var8];
			while (true) {
				OpenGL.glTexImage2Di(arg0, var5, GlxToolkit.method16100(this.field3736, this.field3731), arg1, arg2, 0, 32993, this.field3733.field10024, var9, 0);
				if (var6 <= 1) {
					return;
				}
				int var11 = 0;
				int var12 = 0;
				int var13 = arg1 + var12;
				for (int var14 = 0; var14 < var8; var14++) {
					for (int var15 = 0; var15 < var7; var15++) {
						int var16 = var9[var12++];
						int var17 = var9[var12++];
						int var18 = var9[var13++];
						int var19 = var9[var13++];
						int var20 = var16 >> 24 & 0xFF;
						int var21 = var16 >> 16 & 0xFF;
						int var22 = var16 >> 8 & 0xFF;
						int var23 = var16 & 0xFF;
						int var24 = (var17 >> 24 & 0xFF) + var20;
						int var25 = (var17 >> 16 & 0xFF) + var21;
						int var26 = (var17 >> 8 & 0xFF) + var22;
						int var27 = (var17 & 0xFF) + var23;
						int var28 = (var18 >> 24 & 0xFF) + var24;
						int var29 = (var18 >> 16 & 0xFF) + var25;
						int var30 = (var18 >> 8 & 0xFF) + var26;
						int var31 = (var18 & 0xFF) + var27;
						int var32 = (var19 >> 24 & 0xFF) + var28;
						int var33 = (var19 >> 16 & 0xFF) + var29;
						int var34 = (var19 >> 8 & 0xFF) + var30;
						int var35 = (var19 & 0xFF) + var31;
						var10[var11++] = (var32 & 0x3FC) << 22 | (var33 & 0x3FC) << 14 | (var34 & 0x3FC) << 6 | var35 >> 2 & 0xFF;
					}
					var12 += arg1;
					var13 += arg1;
				}
				int[] var36 = var10;
				var10 = var9;
				var9 = var36;
				arg1 = var7;
				arg2 = var8;
				var7 >>= 0x1;
				var8 >>= 0x1;
				var6 >>= 0x1;
				var5++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("lm.bk(III[B)V")
	public void method5974(int arg0, int arg1, int arg2, byte[] arg3) {
		if (arg1 > 0 && !class595.method11258(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || class595.method11258(arg2)) {
			int var5 = this.field3736.field1306;
			int var6 = 0;
			int var7 = arg1 < arg2 ? arg1 : arg2;
			int var8 = arg1 >> 1;
			int var9 = arg2 >> 1;
			byte[] var10 = arg3;
			byte[] var11 = new byte[var8 * var9 * var5];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, var6, GlxToolkit.method16100(this.field3736, this.field3731), arg1, arg2, 0, GlxToolkit.method16093(this.field3736), 5121, var10, 0);
				if (var7 <= 1) {
					return;
				}
				int var12 = arg1 * var5;
				for (int var13 = 0; var13 < var5; var13++) {
					int var14 = var13;
					int var15 = var13;
					int var16 = var12 + var13;
					for (int var17 = 0; var17 < var9; var17++) {
						for (int var18 = 0; var18 < var8; var18++) {
							byte var19 = var10[var15];
							int var20 = var5 + var15;
							int var21 = var10[var20] + var19;
							var15 = var5 + var20;
							int var22 = var10[var16] + var21;
							int var23 = var5 + var16;
							int var24 = var10[var23] + var22;
							var16 = var5 + var23;
							var11[var14] = (byte) (var24 >> 2);
							var14 += var5;
						}
						var15 += var12;
						var16 += var12;
					}
				}
				byte[] var25 = var11;
				var11 = var10;
				var10 = var25;
				arg1 = var8;
				arg2 = var9;
				var8 >>= 0x1;
				var9 >>= 0x1;
				var7 >>= 0x1;
				var6++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("lm.bs(III[F)V")
	public void method5978(int arg0, int arg1, int arg2, float[] arg3) {
		if (arg1 > 0 && !class595.method11258(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || class595.method11258(arg2)) {
			int var5 = this.field3736.field1306;
			int var6 = 0;
			int var7 = arg1 < arg2 ? arg1 : arg2;
			int var8 = arg1 >> 1;
			int var9 = arg2 >> 1;
			float[] var10 = arg3;
			float[] var11 = new float[var8 * var9 * var5];
			while (true) {
				OpenGL.glTexImage2Df(arg0, var6, GlxToolkit.method16100(this.field3736, this.field3731), arg1, arg2, 0, GlxToolkit.method16093(this.field3736), 5126, var10, 0);
				if (var7 <= 1) {
					return;
				}
				int var12 = arg1 * var5;
				for (int var13 = 0; var13 < var5; var13++) {
					int var14 = var13;
					int var15 = var13;
					int var16 = var12 + var13;
					for (int var17 = 0; var17 < var9; var17++) {
						for (int var18 = 0; var18 < var8; var18++) {
							float var19 = var10[var15];
							int var20 = var5 + var15;
							float var21 = var10[var20] + var19;
							var15 = var5 + var20;
							float var22 = var10[var16] + var21;
							int var23 = var5 + var16;
							float var24 = var10[var23] + var22;
							var16 = var5 + var23;
							var11[var14] = var24 * 0.25F;
							var14 += var5;
						}
						var15 += var12;
						var16 += var12;
					}
				}
				float[] var25 = var11;
				var11 = var10;
				var10 = var25;
				arg1 = var8;
				arg2 = var9;
				var8 >>= 0x1;
				var9 >>= 0x1;
				var7 >>= 0x1;
				var6++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@ObfuscatedName("lm.bn(I)V")
	public void method5979(int arg0) {
		this.field3733.field8325 -= arg0;
		this.field3733.field8325 += this.method5971();
	}

	@ObfuscatedName("lm.ba()I")
	public int method5971() {
		int var1 = this.field3731.field1508 * this.field3736.field1306 * this.field3729;
		return this.field3728 ? var1 * 4 / 3 : var1;
	}

	@ObfuscatedName("lm.s()V")
	public void method168() {
		if (this.field3734 > 0) {
			this.field3733.method16086(this.field3734, this.method5971());
			this.field3734 = 0;
		}
	}

	public void finalize() throws Throwable {
		this.method168();
		super.finalize();
	}
}
