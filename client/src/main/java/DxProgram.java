
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@ObfuscatedName("aae")
public final class DxProgram extends GpuProgram {

	@ObfuscatedName("aae.s")
	public DxProgramManager field8555;

	@ObfuscatedName("aae.c")
	public boolean field8558;

	@ObfuscatedName("aae.m")
	public DxToolkit field8559;

	@ObfuscatedName("aae.t")
	public long field8557;

	@ObfuscatedName("aae.l")
	public long field8556;

	@ObfuscatedName("aae.f")
	public static final float[] field8564 = new float[16];

	@ObfuscatedName("aae.d")
	public byte[] field8560;

	@ObfuscatedName("aae.z")
	public byte[] field8561;

	@ObfuscatedName("aae.q")
	public final float[][] field8565;

	@ObfuscatedName("aae.p")
	public final boolean[] field8554;

	public DxProgram(DxToolkit arg0, DxProgramManager arg1, class167 arg2) {
		this(arg0, arg2);
		this.field8559 = arg0;
		this.field8555 = arg1;
	}

	public DxProgram(DxToolkit arg0, class167 arg1) {
		this.field8558 = false;
		this.field8565 = new float[2][];
		this.field8554 = new boolean[2];
		this.field1940 = arg1.field1935;
		if (arg1.field1933 != null) {
			this.field1939 = arg1.field1933;
			this.field8560 = arg0.method16036(this.field1939);
		}
		if (arg1.field1934 != null) {
			this.field1938 = arg1.field1934;
			this.field8561 = arg0.method16036(this.field1938);
		}
		arg0.method13586(this);
	}

	@ObfuscatedName("aae.j()Z")
	public boolean method3272() {
		if (this.field8558) {
			return true;
		}
		this.field8557 = this.field8560 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.field8559.field9975, this.field8560);
		this.field8556 = this.field8561 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.field8559.field9975, this.field8561);
		if (this.field8557 == 0L && this.field8556 == 0L) {
			return false;
		}
		int var1 = -1;
		for (int var2 = 0; var2 < this.field8555.method3331(); var2++) {
			if (this.field8555.method3332(var2) == this) {
				var1 = var2;
				break;
			}
		}
		int var3 = this.field8555.method3361();
		int var4 = this.field8555.method3337();
		for (int var5 = 0; var5 < var3; var5++) {
			GpuProgramUniform var6 = this.field8555.method3362(var5);
			var6.method16248(var1);
		}
		for (int var7 = 0; var7 < var4; var7++) {
			GpuProgramUniform var8 = this.field8555.method3359(var7);
			var8.method16248(var1);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = this.field8555.method3345(this);
		for (int var12 = 0; var12 < var3 + var4; var12++) {
			DxProgramUniform var13 = (DxProgramUniform) (var12 < var3 ? this.field8555.method3362(var12) : this.field8555.method3359(var12 - var3));
			class170 var14 = var13.method16234();
			int var15 = 1;
			if (class170.field1977 == var14) {
				var14 = var13.method16235();
				var15 = var13.method16236();
			}
			switch(var14.field2010) {
				case 6:
				case 56:
				case 63:
				case 81:
					var15 *= 2;
					break;
				case 13:
				case 61:
				case 86:
				case 96:
					var15 *= 4;
					break;
				case 34:
				case 67:
				case 79:
				case 90:
					var15 *= 3;
				case 37:
				case 44:
				case 99:
				case 109:
					break;
				default:
					var15 = 0;
			}
			if (var13.field10567[var11] >= 0) {
				int var16 = var13.field10567[var11] + var15;
				if (var9 < var16) {
					var9 = var16;
				}
			}
			if (var13.field10569[var11] >= 0) {
				int var17 = var13.field10569[var11] + var15;
				if (var10 < var17) {
					var10 = var17;
				}
			}
		}
		this.field8565[0] = new float[var9 * 4];
		this.field8565[1] = new float[var10 * 4];
		this.field8558 = true;
		return true;
	}

	@ObfuscatedName("aae.a(Laig;F)V")
	public void method3231(GpuProgramUniform arg0, float arg1) {
		int var3 = ((DxProgramUniform) arg0).method16988();
		int var4 = ((DxProgramUniform) arg0).method16989();
		if (arg0.method16234() != class170.field2067 && arg0.method16234() != class170.field2014) {
			throw new OpenGLError(arg0, "");
		}
		if (var3 >= 0) {
			int var5 = var3 * 4;
			this.field8565[0][var5] = arg1;
			this.field8554[0] = true;
		}
		if (var4 >= 0) {
			int var6 = var4 * 4;
			this.field8565[1][var6] = arg1;
			this.field8554[1] = true;
		}
	}

	@ObfuscatedName("aae.t(Laig;FF)V")
	public void method3267(GpuProgramUniform arg0, float arg1, float arg2) {
		int var4 = ((DxProgramUniform) arg0).method16988();
		int var5 = ((DxProgramUniform) arg0).method16989();
		if (arg0.method16234() != class170.field1948) {
			throw new OpenGLError(arg0, "");
		}
		if (var4 >= 0) {
			int var6 = var4 * 4;
			this.field8565[0][var6] = arg1;
			this.field8565[0][var6 + 1] = arg2;
			this.field8554[0] = true;
		}
		if (var5 >= 0) {
			int var7 = var5 * 4;
			this.field8565[1][var7] = arg1;
			this.field8565[1][var7 + 1] = arg2;
			this.field8554[1] = true;
		}
	}

	@ObfuscatedName("aae.l(Laig;FFF)V")
	public void method3233(GpuProgramUniform arg0, float arg1, float arg2, float arg3) {
		int var5 = ((DxProgramUniform) arg0).method16988();
		int var6 = ((DxProgramUniform) arg0).method16989();
		if (arg0.method16234() != class170.field2003) {
			throw new OpenGLError(arg0, "");
		}
		if (var5 >= 0) {
			int var7 = var5 * 4;
			this.field8565[0][var7] = arg1;
			this.field8565[0][var7 + 1] = arg2;
			this.field8565[0][var7 + 2] = arg3;
			this.field8554[0] = true;
		}
		if (var6 < 0) {
			return;
		}
		int var8 = var6 * 4;
		this.field8565[1][var8] = arg1;
		this.field8565[1][var8 + 1] = arg2;
		this.field8565[1][var8 + 2] = arg3;
		this.field8554[1] = true;
	}

	@ObfuscatedName("aae.f(Laig;FFFF)V")
	public void method3234(GpuProgramUniform arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((DxProgramUniform) arg0).method16988();
		int var7 = ((DxProgramUniform) arg0).method16989();
		if (arg0.method16234() != class170.field1971) {
			throw new OpenGLError(arg0, "");
		}
		if (var6 >= 0) {
			int var8 = var6 * 4;
			this.field8565[0][var8] = arg1;
			this.field8565[0][var8 + 1] = arg2;
			this.field8565[0][var8 + 2] = arg3;
			this.field8565[0][var8 + 3] = arg4;
			this.field8554[0] = true;
		}
		if (var7 < 0) {
			return;
		}
		int var9 = var7 * 4;
		this.field8565[1][var9] = arg1;
		this.field8565[1][var9 + 1] = arg2;
		this.field8565[1][var9 + 2] = arg3;
		this.field8565[1][var9 + 3] = arg4;
		this.field8554[1] = true;
	}

	@ObfuscatedName("aae.z(Laig;Lka;)V")
	public void method3232(GpuProgramUniform arg0, Matrix4x4 arg1) {
		int var3 = ((DxProgramUniform) arg0).method16988();
		int var4 = ((DxProgramUniform) arg0).method16989();
		if (arg0.method16234() != class170.field1985) {
			throw new OpenGLError(arg0, "");
		}
		if (var3 >= 0) {
			this.method13917(var3, arg1.method5413(field8564), 8);
		}
		if (var4 >= 0) {
			this.method13921(var4, arg1.method5413(field8564), 8);
		}
	}

	@ObfuscatedName("aae.n(Laig;Lka;)V")
	public void method3237(GpuProgramUniform arg0, Matrix4x4 arg1) {
		int var3 = ((DxProgramUniform) arg0).method16988();
		int var4 = ((DxProgramUniform) arg0).method16989();
		if (arg0.method16234() != class170.field1987) {
			throw new OpenGLError(arg0, "");
		}
		if (var3 >= 0) {
			this.method13917(var3, arg1.method5411(field8564), 16);
		}
		if (var4 >= 0) {
			this.method13921(var4, arg1.method5411(field8564), 16);
		}
	}

	@ObfuscatedName("aae.d(Laig;[FI)V")
	public void method3235(GpuProgramUniform arg0, float[] arg1, int arg2) {
		int var4 = ((DxProgramUniform) arg0).method16988();
		int var5 = ((DxProgramUniform) arg0).method16989();
		if (arg0.method16234() != class170.field1977) {
			throw new OpenGLError(arg0, "");
		}
		if (var4 >= 0) {
			this.method13917(var4, arg1, arg2);
		}
		if (var5 >= 0) {
			this.method13921(var5, arg1, arg2);
		}
	}

	@ObfuscatedName("aae.o(Laig;ILip;)V")
	public void method3271(GpuProgramUniform arg0, int arg1, class254 arg2) {
		this.field8559.method13629(arg1);
		this.field8559.method13557(arg2);
	}

	@ObfuscatedName("aae.q(IFFF)V")
	public void method3239(int arg0, float arg1, float arg2, float arg3) {
		int var5 = arg0 >> 16;
		int var6 = (arg0 & 0xFFFF) * 4;
		this.field8565[var5][var6] = arg1;
		this.field8565[var5][var6 + 1] = arg2;
		this.field8565[var5][var6 + 2] = arg3;
		this.field8554[var5] = true;
	}

	@ObfuscatedName("aae.p(IFFFF)V")
	public void method3240(int arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = arg0 >> 16;
		int var7 = (arg0 & 0xFFFF) * 4;
		this.field8565[var6][var7] = arg1;
		this.field8565[var6][var7 + 1] = arg2;
		this.field8565[var6][var7 + 2] = arg3;
		this.field8565[var6][var7 + 3] = arg4;
		this.field8554[var6] = true;
	}

	@ObfuscatedName("aae.b(ILka;)V")
	public void method3242(int arg0, Matrix4x4 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method5411(field8564), 0, this.field8565[var3], var4, 12);
		this.field8554[var3] = true;
	}

	@ObfuscatedName("aae.x(ILka;)V")
	public void method3243(int arg0, Matrix4x4 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method5413(field8564), 0, this.field8565[var3], var4, 8);
		this.field8554[var3] = true;
	}

	@ObfuscatedName("aae.i(ILka;)V")
	public void method3284(int arg0, Matrix4x4 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method5411(field8564), 0, this.field8565[var3], var4, 16);
		this.field8554[var3] = true;
	}

	@ObfuscatedName("aae.w(I[FI)V")
	public void method3241(int arg0, float[] arg1, int arg2) {
		int var4 = arg0 >> 16;
		int var5 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.field8565[var4], var5, arg2);
		this.field8554[var4] = true;
	}

	@ObfuscatedName("aae.ba(I[FI)V")
	public final void method13917(int arg0, float[] arg1, int arg2) {
		ArrayUtil.method11341(arg1, 0, this.field8565[0], arg0 * 4, arg2);
		this.field8554[0] = true;
	}

	@ObfuscatedName("aae.bd(I[FI)V")
	public final void method13921(int arg0, float[] arg1, int arg2) {
		ArrayUtil.method11341(arg1, 0, this.field8565[1], arg0 * 4, arg2);
		this.field8554[1] = true;
	}

	@ObfuscatedName("aae.v(IILip;)V")
	public void method3245(int arg0, int arg1, class254 arg2) {
		this.field8559.method13629(arg1);
		this.field8559.method13557(arg2);
	}

	@ObfuscatedName("aae.bc()V")
	public void method13918() {
		if (this.field8554[0]) {
			for (int var1 = 0; var1 < this.field8565[0].length; var1++) {
				this.field8559.field8247.putFloat((long) (var1 * 4) + this.field8559.field8245, this.field8565[0][var1]);
			}
			IDirect3DDevice.SetVertexShaderConstantF(this.field8559.field9975, 0, this.field8559.field8245, this.field8565[0].length / 4);
			this.field8554[0] = false;
		}
		if (!this.field8554[1]) {
			return;
		}
		for (int var2 = 0; var2 < this.field8565[1].length; var2++) {
			this.field8559.field8247.putFloat((long) (var2 * 4) + this.field8559.field8245, this.field8565[1][var2]);
		}
		IDirect3DDevice.SetPixelShaderConstantF(this.field8559.field9975, 0, this.field8559.field8245, this.field8565[1].length / 4);
		this.field8554[1] = false;
	}

	@ObfuscatedName("aae.s()V")
	public void method168() {
		if (this.field8557 != 0L) {
			IUnknown.Release(this.field8557);
			this.field8557 = 0L;
		}
		if (this.field8556 != 0L) {
			IUnknown.Release(this.field8556);
			this.field8556 = 0L;
		}
		this.field8559.method13485(this);
	}

	@ObfuscatedName("aae.br()V")
	public void method13919() {
		if (this.field8557 != 0L) {
			this.field8559.method16038(this.field8557);
			this.field8557 = 0L;
		}
		if (this.field8556 != 0L) {
			this.field8559.method16038(this.field8556);
			this.field8556 = 0L;
		}
	}

	public void finalize() {
		this.method13919();
	}
}
