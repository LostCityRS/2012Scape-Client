
import deob.ObfuscatedName;

@ObfuscatedName("ku")
public class Vector4 {

	@ObfuscatedName("ku.u")
	public float field3426;

	@ObfuscatedName("ku.j")
	public float field3427;

	@ObfuscatedName("ku.a")
	public float field3428;

	@ObfuscatedName("ku.s")
	public float field3429;

	public Vector4() {
		this.method5077();
	}

	public Vector4(float arg0, float arg1, float arg2, float arg3) {
		this.method5074(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ku.u(FFFF)V")
	public void method5074(float arg0, float arg1, float arg2, float arg3) {
		this.field3426 = arg0;
		this.field3427 = arg1;
		this.field3428 = arg2;
		this.field3429 = arg3;
	}

	@ObfuscatedName("ku.j(Lku;)V")
	public void method5075(Vector4 arg0) {
		this.method5074(arg0.field3426, arg0.field3427, arg0.field3428, arg0.field3429);
	}

	@ObfuscatedName("ku.a(I)V")
	public void method5076(int arg0) {
		this.method5074((float) (arg0 >> 16 & 0xFF) * 0.003921569F, (float) (arg0 >> 8 & 0xFF) * 0.003921569F, (float) (arg0 >> 0 & 0xFF) * 0.003921569F, (float) (arg0 >> 24 & 0xFF) * 0.003921569F);
	}

	@ObfuscatedName("ku.s()V")
	public final void method5077() {
		this.field3429 = 0.0F;
		this.field3428 = 0.0F;
		this.field3427 = 0.0F;
		this.field3426 = 0.0F;
	}

	@ObfuscatedName("ku.c()V")
	public final void method5078() {
		this.field3426 = -this.field3426;
		this.field3427 = -this.field3427;
		this.field3428 = -this.field3428;
		this.field3429 = -this.field3429;
	}

	@ObfuscatedName("ku.m(F)V")
	public final void method5079(float arg0) {
		this.field3426 *= arg0;
		this.field3427 *= arg0;
		this.field3428 *= arg0;
		this.field3429 *= arg0;
	}

	@ObfuscatedName("ku.t(Lka;)V")
	public final void method5082(Matrix4x4 arg0) {
		float var2 = this.field3426;
		float var3 = this.field3427;
		float var4 = this.field3428;
		float var5 = this.field3429;
		this.field3426 = arg0.field3480[12] * var5 + arg0.field3480[8] * var4 + arg0.field3480[0] * var2 + arg0.field3480[4] * var3;
		this.field3427 = arg0.field3480[13] * var5 + arg0.field3480[9] * var4 + arg0.field3480[1] * var2 + arg0.field3480[5] * var3;
		this.field3428 = arg0.field3480[14] * var5 + arg0.field3480[10] * var4 + arg0.field3480[2] * var2 + arg0.field3480[6] * var3;
		this.field3429 = arg0.field3480[15] * var5 + arg0.field3480[11] * var4 + arg0.field3480[3] * var2 + arg0.field3480[7] * var3;
	}

	public String toString() {
		return this.field3426 + "," + this.field3427 + "," + this.field3428 + "," + this.field3429;
	}
}
