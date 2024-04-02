
import deob.ObfuscatedName;

@ObfuscatedName("ct")
public class ModelParticleEffector {

	@ObfuscatedName("ct.u")
	public final int field1243;

	@ObfuscatedName("ct.j")
	public ModelParticleEffector field1238;

	@ObfuscatedName("ct.a")
	public final int field1239;

	@ObfuscatedName("ct.s")
	public int field1240;

	@ObfuscatedName("ct.c")
	public int field1241;

	@ObfuscatedName("ct.m")
	public int field1242;

	@ObfuscatedName("ct.t")
	public Matrix4x4 field1237;

	public ModelParticleEffector(int arg0, int arg1) {
		this.field1243 = arg0;
		this.field1239 = arg1;
	}

	@ObfuscatedName("ct.u(B)Lic;")
	public class274 method2534() {
		return class274.method2938(this.field1243);
	}

	@ObfuscatedName("ct.j(II)Lct;")
	public ModelParticleEffector method2536(int arg0) {
		return new ModelParticleEffector(this.field1243, arg0);
	}
}
