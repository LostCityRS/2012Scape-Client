
import deob.ObfuscatedName;

@ObfuscatedName("ahn")
public class WaterfallShader extends class736 {

	@ObfuscatedName("ahn.ag")
	public final class221 field10091;

	@ObfuscatedName("ahn.as")
	public GpuProgramUniform field10102;

	@ObfuscatedName("ahn.ai")
	public GpuProgramUniform field10104;

	@ObfuscatedName("ahn.ao")
	public GpuProgram field10101;

	@ObfuscatedName("ahn.al")
	public GpuProgram field10087;

	@ObfuscatedName("ahn.at")
	public GpuProgramUniform field10092;

	@ObfuscatedName("ahn.ax")
	public final Matrix4x4 field10093 = new Matrix4x4();

	@ObfuscatedName("ahn.aw")
	public GpuProgramUniform field10094;

	@ObfuscatedName("ahn.aa")
	public final Matrix4x4 field10089 = new Matrix4x4();

	@ObfuscatedName("ahn.am")
	public GpuProgramUniform field10096;

	@ObfuscatedName("ahn.ad")
	public final float[] field10097 = new float[4];

	@ObfuscatedName("ahn.az")
	public GpuProgramUniform field10098;

	@ObfuscatedName("ahn.ak")
	public final float[] field10099 = new float[4];

	@ObfuscatedName("ahn.av")
	public float field10100;

	@ObfuscatedName("ahn.aj")
	public int field10095;

	@ObfuscatedName("ahn.ah")
	public int field10090;

	@ObfuscatedName("ahn.au")
	public int field10103;

	@ObfuscatedName("ahn.ae")
	public int field10088;

	public WaterfallShader(GpuToolkit arg0, class221 arg1) throws ShaderException {
		super(arg0);
		this.field10091 = arg1;
		if (this.field10091.method4125() && arg0.method13487()) {
			this.method14134("Waterfall");
		}
	}

	@ObfuscatedName("ahn.e()Z")
	public boolean method14135() throws ShaderException {
		this.field10094 = this.field8778.method3357("WorldMatrix");
		this.field10092 = this.field8778.method3357("WVPMatrix");
		this.field10096 = this.field8778.method3357("UGenerationPlane");
		this.field10098 = this.field8778.method3357("VGenerationPlane");
		this.field10102 = this.field8778.method3357("Time");
		this.field10104 = this.field8778.method3357("billowSampler3D");
		if (this.field10091.field2405) {
			this.field10101 = this.field8778.method3330("Waterfall3D");
			this.field8778.method3335(this.field10101);
		} else {
			this.field10087 = this.field8778.method3330("Waterfall2D");
			this.field8778.method3335(this.field10087);
		}
		return true;
	}

	@ObfuscatedName("ahn.bk(IIB)V")
	public void method16193(int arg0, int arg1) {
		float var3 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		if (var6) {
			this.field10097[0] = var5;
			this.field10097[1] = 0.0F;
			this.field10097[2] = 0.0F;
			this.field10097[3] = 0.0F;
		} else {
			this.field10097[0] = 0.0F;
			this.field10097[1] = 0.0F;
			this.field10097[2] = var5;
			this.field10097[3] = 0.0F;
		}
		this.field10099[0] = 0.0F;
		this.field10099[1] = var5;
		this.field10099[2] = 0.0F;
		this.field10099[3] = (float) this.field2414.field8391 * var3 % 1.0F;
		if (this.field10091.field2405) {
			this.field10100 = (float) ((double) var4 * (double) this.field2414.field8391 % 1.0D);
		} else {
			int var7 = (int) ((float) this.field2414.field8391 * var4 * 16.0F);
			this.field2414.method13557(this.field10091.field2408[var7 % 16]);
		}
	}

	@ObfuscatedName("ahn.bs(I)V")
	public void method16192() {
		if (this.field10091.field2405) {
			this.field8778.method3335(this.field10101);
		} else {
			this.field8778.method3335(this.field10087);
		}
		this.field8778.method3325();
		if (this.field10091.field2405) {
			this.field8778.method3336(this.field10104, 0, this.field10091.field2413);
		}
		this.field8778.method3371(this.field10094, this.field10089);
		this.field8778.method3371(this.field10092, this.field10093);
		this.field8778.method3406(this.field10096, new Vector4(this.field10097[0], this.field10097[1], this.field10097[2], this.field10097[3]));
		this.field8778.method3406(this.field10098, new Vector4(this.field10099[0], this.field10099[1], this.field10099[2], this.field10099[3]));
		this.field8778.method3406(this.field10102, new Vector4(this.field10100, 0.0F, 0.0F, 0.0F));
		this.field2414.method13596(class255.field2582, this.field10095, this.field10090, this.field10103, this.field10088);
	}
}
