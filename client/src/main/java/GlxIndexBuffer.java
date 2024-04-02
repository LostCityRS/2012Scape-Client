
import deob.ObfuscatedName;

@ObfuscatedName("abc")
public class GlxIndexBuffer extends GlxBuffer implements IndexBuffer {

	@ObfuscatedName("abc.z")
	public DataType field8816;

	public GlxIndexBuffer(GlxToolkit arg0, DataType arg1, boolean arg2) {
		super(arg0, 34963, arg2);
		this.field8816 = arg1;
	}

	@ObfuscatedName("abc.t()I")
	public int method4451() {
		return super.method4451();
	}

	@ObfuscatedName("abc.u()Ldz;")
	public DataType method4538() {
		return this.field8816;
	}

	@ObfuscatedName("abc.v(I)V")
	public void method4535(int arg0) {
		super.method4535(this.field8816.field1508 * arg0);
	}

	@ObfuscatedName("abc.s()V")
	public void method168() {
		super.method168();
	}

	@ObfuscatedName("abc.l(IIJ)Z")
	public boolean method4452(int arg0, int arg1, long arg2) {
		return super.method4452(arg0, arg1, arg2);
	}

	@ObfuscatedName("abc.f(II)J")
	public long method4453(int arg0, int arg1) {
		return super.method4453(arg0, arg1);
	}

	@ObfuscatedName("abc.d()V")
	public void method4454() {
		super.method4454();
	}
}
