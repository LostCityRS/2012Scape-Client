
import deob.ObfuscatedName;

@ObfuscatedName("aat")
public final class class728 extends SpriteShader {

	@ObfuscatedName("aat.d")
	public Shader field8709;

	@ObfuscatedName("aat.r")
	public final class168[] field8702 = new class168[3];

	@ObfuscatedName("aat.g")
	public final int[][] field8698 = new int[3][7];

	@ObfuscatedName("aat.y")
	public int[] field8713;

	@ObfuscatedName("aat.e")
	public Vector4 field8714 = new Vector4(1.0F, 1.0F, 1.0F, 1.0F);

	@ObfuscatedName("aat.ay")
	public Vector4 field8704 = new Vector4(0.0F, 0.0F, 0.0F, 0.0F);

	public class728(GpuToolkit arg0) throws ShaderException {
		super(arg0);
		this.method14075();
	}

	@ObfuscatedName("aat.l(I)Z")
	public boolean method14075() throws ShaderException {
		this.field8709 = this.field2278.method13490("Sprite");
		class918 var1 = this.field8709.method3357("WVPMatrix");
		class918 var2 = this.field8709.method3357("SpriteSampler");
		class918 var3 = this.field8709.method3357("MaskSampler");
		class918 var4 = this.field8709.method3357("MulColour");
		class918 var5 = this.field8709.method3357("AddColour");
		class918 var6 = this.field8709.method3357("SpriteTexCoordMatrix");
		class918 var7 = this.field8709.method3357("MaskTexCoordMatrix");
		this.field8702[0] = this.field8709.method3330("Normal");
		this.field8702[1] = this.field8709.method3330("Masked");
		this.field8702[2] = this.field8709.method3330("AlphaTex");
		for (int var8 = 0; var8 < 3; var8++) {
			int var9 = this.field8709.method3345(this.field8702[var8]);
			this.field8698[var8][0] = var1.method16237(var9);
			this.field8698[var8][1] = var2.method16237(var9);
			this.field8698[var8][2] = var3.method16237(var9);
			this.field8698[var8][5] = var4.method16237(var9);
			this.field8698[var8][6] = var5.method16237(var9);
			this.field8698[var8][3] = var6.method16237(var9);
			this.field8698[var8][4] = var7.method16237(var9);
		}
		this.field8709.method3335(this.field8702[0]);
		return true;
	}

	@ObfuscatedName("aat.u(II)V")
	public void method3881(int arg0, int arg1) {
		switch(arg0) {
			case 0:
				this.field8714.method5076(arg1);
				this.field8704.method5076(0);
				break;
			case 1:
				this.field8714.method5076(-1);
				this.field8704.method5076(0);
				break;
			case 2:
				this.field8714.method5076(arg1);
				this.field8704.method5076(0);
				break;
			case 3:
				this.field8714.method5076(arg1 & 0xFF000000 | 0xFFFFFF);
				this.field8704.method5076(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.field8714.method5076(-1);
				this.field8704.method5076(arg1);
				this.field8704.method5078();
		}
	}

	@ObfuscatedName("aat.f(I)V")
	public void method14077() {
		this.field8709.method3353(this.field8713[1], 0, this.field2284);
		this.field2278.method13638(this.field2280);
		this.field8709.method3355(this.field8713[0], this.field2280);
		this.field8709.method3354(this.field8713[3], this.field2281);
		this.field8709.method3350(this.field8713[5], this.field8714.field3426, this.field8714.field3427, this.field8714.field3428, this.field8714.field3429);
		this.field8709.method3350(this.field8713[6], this.field8704.field3426, this.field8704.field3427, this.field8704.field3428, this.field8704.field3429);
		this.field2278.method13587(0, this.field2283);
		this.field2278.method13688(this.field2285);
		this.field2278.method13619(class255.field2580, this.field2277, 2);
	}

	@ObfuscatedName("aat.j()V")
	public void method3882() {
		this.field8709.method3335(this.field8702[0]);
		this.field8709.method3325();
		this.field8713 = this.field8698[this.field8709.method3401()];
		this.method14077();
	}

	@ObfuscatedName("aat.a()V")
	public void method3883() {
		this.field8709.method3335(this.field8702[1]);
		this.field8709.method3325();
		this.field8713 = this.field8698[this.field8709.method3401()];
		this.field8709.method3353(this.field8713[2], 1, this.field2279);
		this.field8709.method3354(this.field8713[4], this.field2282);
		this.method14077();
	}
}
