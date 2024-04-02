
import deob.ObfuscatedName;

@ObfuscatedName("abr")
public class class742 extends class231 {

	@ObfuscatedName("abr.s")
	public static float field8789 = 0.25F;

	@ObfuscatedName("abr.c")
	public static float field8792 = 1.0F;

	@ObfuscatedName("abr.m")
	public static float field8795 = 1.0F;

	@ObfuscatedName("abr.t")
	public static float field8803 = 1.0F;

	@ObfuscatedName("abr.l")
	public Shader field8793;

	@ObfuscatedName("abr.f")
	public class168 field8794;

	@ObfuscatedName("abr.d")
	public class168 field8790;

	@ObfuscatedName("abr.z")
	public class168 field8796;

	@ObfuscatedName("abr.n")
	public class168 field8797;

	@ObfuscatedName("abr.o")
	public class168 field8798;

	@ObfuscatedName("abr.q")
	public class918 field8799;

	@ObfuscatedName("abr.p")
	public class918 field8800;

	@ObfuscatedName("abr.w")
	public class918 field8788;

	@ObfuscatedName("abr.b")
	public class918 field8802;

	@ObfuscatedName("abr.x")
	public class918 field8801;

	@ObfuscatedName("abr.i")
	public class918 field8804;

	@ObfuscatedName("abr.v")
	public boolean field8791;

	public class742(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("abr.ao()Z")
	public boolean method14178() {
		return this.field2424.field8380 && this.field2424.method13488();
	}

	@ObfuscatedName("abr.u()Z")
	public boolean method4279() {
		return this.field8791;
	}

	@ObfuscatedName("abr.j()Z")
	public boolean method4287() {
		if (!this.method14178()) {
			return false;
		}
		this.field8793 = this.field2424.method13490("FilterBloom");
		if (this.field8793 == null) {
			return false;
		}
		try {
			this.field8799 = this.field8793.method3357("sceneTex");
			this.field8800 = this.field8793.method3357("bloomTex1");
			this.field8788 = this.field8793.method3357("params");
			this.field8802 = this.field8793.method3357("sampleSize");
			this.field8801 = this.field8793.method3357("pixelOffsetAndBloomScale");
			this.field8804 = this.field8793.method3357("PosAndTexCoords");
			this.field8793.method3330("test");
			this.field8794 = this.field8793.method3330("techFullscreenTri");
			this.field8790 = this.field8793.method3330("brightpass");
			this.field8796 = this.field8793.method3330("blur");
			this.field8797 = this.field8793.method3330("composite");
			this.field8798 = this.field8793.method3330("techDefault");
		} catch (UniformNotFoundException var3) {
			return false;
		} catch (ProgramNotFoundException var4) {
			return false;
		}
		if (!this.field8794.method3272()) {
			return false;
		} else if (!this.field8790.method3272()) {
			return false;
		} else if (!this.field8796.method3272()) {
			return false;
		} else if (!this.field8797.method3272()) {
			return false;
		} else if (this.field8798.method3272()) {
			this.field8791 = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("abr.c(II)V")
	public void method4283(int arg0, int arg1) {
	}

	@ObfuscatedName("abr.s()V")
	public void method4290() {
	}

	@ObfuscatedName("abr.l()I")
	public int method4286() {
		return 4;
	}

	@ObfuscatedName("abr.m(ILyu;Lhc;Ldo;Lhc;)V")
	public void method4284(int arg0, class674 arg1, GpuTexture arg2, class132 arg3, GpuTexture arg4) {
		float var6 = this.field2424.method13750();
		float var7 = (float) arg1.method921();
		float var8 = (float) arg1.method922();
		GpuTexture var9 = arg2;
		float var10 = var6 * 2.0F / var7;
		float var11 = -var6 * 2.0F / var8;
		float[] var12 = new float[] { var10 + -1.0F, var11 + 1.0F, 0.0F, 0.0F, var10 + -1.0F, var11 + -3.0F, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F };
		int var13 = (int) var7;
		int var14 = (int) var8;
		int var15 = var13;
		int var16 = var14;
		if (arg0 == 0) {
			var13 = 256;
			var14 = 256;
			this.field8793.method3335(this.field8790);
			this.field8793.method3325();
		} else if (arg0 == 1) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.field8793.method3335(this.field8796);
			this.field8793.method3325();
			this.field8793.method3340(this.field8802, field8803 / var7, 0.0F);
		} else if (arg0 == 2) {
			var13 = 256;
			var14 = 256;
			var15 = var13;
			var16 = var14;
			this.field8793.method3335(this.field8796);
			this.field8793.method3325();
			this.field8793.method3340(this.field8802, 0.0F, field8803 / var8);
		} else if (arg0 == 3) {
			this.field8793.method3335(this.field8797);
			var9 = arg4;
			this.field8793.method3336(this.field8800, 1, arg2);
			this.field8793.method3325();
		}
		float var17 = (float) var13 / var7;
		float var18 = (float) var14 / var8;
		float var19 = (float) var15 / var7;
		float var20 = (float) var16 / var8;
		var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
		var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
		var12[10] *= var19;
		var12[7] *= var20;
		this.field8793.method3344(this.field8804, var12);
		this.field8793.method3336(this.field8799, 0, var9);
		this.field8793.method3342(this.field8788, field8795, field8789, field8792, 0.0F);
		this.field8793.method3342(this.field8801, 0.0F, 0.0F, 256.0F / var7, 256.0F / var8);
		this.field2424.method474(0, 0, var13, var14);
		this.field2424.method659(0, 0, var13, var14);
	}

	@ObfuscatedName("abr.t(I)V")
	public void method4285(int arg0) {
		this.field8793.method3416();
	}

	@ObfuscatedName("abr.f()I")
	public int method4306() {
		return 1;
	}
}
