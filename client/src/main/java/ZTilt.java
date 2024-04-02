
import deob.ObfuscatedName;

@ObfuscatedName("ale")
public class ZTilt extends CameraEffect {

	@ObfuscatedName("ale.l")
	public float field10587 = 0.0F;

	public ZTilt(int arg0, float arg1) {
		super(arg0);
		this.field10587 = arg1;
	}

	public ZTilt(int arg0, Packet arg1) {
		super(arg0);
		this.field10587 = arg1.method15324();
	}

	@ObfuscatedName("ale.y(FI)V")
	public void method17143(float arg0) {
		this.field10587 = arg0;
	}

	@ObfuscatedName("ale.j(FI)V")
	public void method16667(float arg0) {
	}

	@ObfuscatedName("ale.a(Lfi;Lkc;Lka;B)V")
	public void method16668(Vector3i arg0, Matrix4x3 arg1, Matrix4x4 arg2) {
		arg1.method5178(0.0F, 0.0F, 1.0F, this.field10587);
	}

	@ObfuscatedName("ale.s(Laet;I)V")
	public void method16671(Packet arg0) {
		this.field10587 = arg0.method15324();
	}
}
