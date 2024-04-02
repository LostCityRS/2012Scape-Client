
import deob.ObfuscatedName;

@ObfuscatedName("ak")
public class PureJavaToolkitContext {

	@ObfuscatedName("ak.u")
	public PureJavaToolkit field882;

	@ObfuscatedName("ak.j")
	public Runnable field897;

	@ObfuscatedName("ak.s")
	public boolean field866;

	@ObfuscatedName("ak.c")
	public float field867 = 0.85F;

	@ObfuscatedName("ak.m")
	public float field864 = 1.0F - this.field867;

	@ObfuscatedName("ak.t")
	public int field869 = 0;

	@ObfuscatedName("ak.l")
	public int field870 = 0;

	@ObfuscatedName("ak.f")
	public boolean field871 = false;

	@ObfuscatedName("ak.d")
	public int field872 = 0;

	@ObfuscatedName("ak.z")
	public int field873 = 0;

	@ObfuscatedName("ak.n")
	public boolean field874 = true;

	@ObfuscatedName("ak.o")
	public Matrix4x4 field875 = new Matrix4x4();

	@ObfuscatedName("ak.q")
	public Matrix4x3 field877 = new Matrix4x3();

	@ObfuscatedName("ak.p")
	public PureJavaRasteriser field868;

	@ObfuscatedName("ak.w")
	public Matrix4x3 field878 = new Matrix4x3();

	@ObfuscatedName("ak.b")
	public Matrix4x4 field879 = new Matrix4x4();

	@ObfuscatedName("ak.x")
	public Matrix4x4 field880 = new Matrix4x4();

	@ObfuscatedName("ak.i")
	public int[] field881 = new int[PureJavaModel.field7823];

	@ObfuscatedName("ak.v")
	public float[] field865 = new float[PureJavaModel.field7823];

	@ObfuscatedName("ak.k")
	public float[] field883 = new float[PureJavaModel.field7823];

	@ObfuscatedName("ak.h")
	public float[] field887 = new float[PureJavaModel.field7823];

	@ObfuscatedName("ak.r")
	public float[] field885 = new float[PureJavaModel.field7823];

	@ObfuscatedName("ak.g")
	public int[] field886 = new int[8];

	@ObfuscatedName("ak.y")
	public int[] field894 = new int[8];

	@ObfuscatedName("ak.e")
	public int[] field888 = new int[8];

	@ObfuscatedName("ak.ay")
	public int[] field884 = new int[10000];

	@ObfuscatedName("ak.af")
	public int[] field898 = new int[10000];

	@ObfuscatedName("ak.ar")
	public int[] field902;

	@ObfuscatedName("ak.an")
	public float field876;

	@ObfuscatedName("ak.ap")
	public float field893;

	@ObfuscatedName("ak.ag")
	public float field891;

	@ObfuscatedName("ak.as")
	public float field895;

	@ObfuscatedName("ak.ai")
	public float field896 = 1.0F;

	@ObfuscatedName("ak.ao")
	public float field906 = 0.0F;

	@ObfuscatedName("ak.al")
	public float field892 = 1.0F;

	@ObfuscatedName("ak.at")
	public int field889;

	@ObfuscatedName("ak.ax")
	public float[] field900 = new float[2];

	@ObfuscatedName("ak.aw")
	public PureJavaModel[] field901 = new PureJavaModel[7];

	@ObfuscatedName("ak.aa")
	public PureJavaModel[] field899 = new PureJavaModel[7];

	@ObfuscatedName("ak.am")
	public float[] field903 = new float[64];

	@ObfuscatedName("ak.ad")
	public float[] field904 = new float[64];

	@ObfuscatedName("ak.az")
	public float[] field905 = new float[64];

	@ObfuscatedName("ak.ak")
	public float[] field863 = new float[64];

	@ObfuscatedName("ak.av")
	public float[] field907 = new float[64];

	@ObfuscatedName("ak.aj")
	public float[] field908 = new float[3];

	public PureJavaToolkitContext(PureJavaToolkit arg0) {
		this.field882 = arg0;
		this.field868 = new PureJavaRasteriser(arg0, this);
		for (int var2 = 0; var2 < 7; var2++) {
			this.field901[var2] = new PureJavaModel(this.field882);
			this.field899[var2] = new PureJavaModel(this.field882);
		}
		this.field902 = new int[PureJavaModel.field7832];
		for (int var3 = 0; var3 < PureJavaModel.field7832; var3++) {
			this.field902[var3] = -1;
		}
	}

	@ObfuscatedName("ak.u(I)V")
	public void method1948() {
		this.field868 = new PureJavaRasteriser(this.field882, this);
	}

	@ObfuscatedName("ak.j(Ljava/lang/Runnable;I)V")
	public void method1949(Runnable arg0) {
		this.field897 = arg0;
	}
}
