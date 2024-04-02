
import deob.ObfuscatedName;

@ObfuscatedName("alj")
public class Shake extends CameraEffect {

	@ObfuscatedName("alj.l")
	public ShakeMode field10590;

	@ObfuscatedName("alj.f")
	public float field10589;

	@ObfuscatedName("alj.d")
	public float field10591;

	@ObfuscatedName("alj.z")
	public float field10588;

	public Shake(int arg0, ShakeMode arg1, float arg2, float arg3) {
		super(arg0);
		this.field10590 = arg1;
		this.field10589 = arg2;
		this.field10591 = arg3;
	}

	public Shake(int arg0, Packet arg1) {
		super(arg0);
		this.field10590 = ShakeMode.method7070(arg1.method15220());
		this.field10589 = arg1.method15324();
		this.field10591 = arg1.method15324();
	}

	@ObfuscatedName("alj.j(FI)V")
	public void method16667(float arg0) {
		this.field10588 += this.field10591 * arg0;
	}

	@ObfuscatedName("alj.a(Lfi;Lkc;Lka;B)V")
	public void method16668(Vector3i arg0, Matrix4x3 arg1, Matrix4x4 arg2) {
		float var4 = (float) Math.sin((double) this.field10588);
		float var5 = this.field10589 * var4;
		if (ShakeMode.field2127 == this.field10590) {
			arg0.field2212 = (int) ((float) arg0.field2212 + var5);
			arg1.method5116(var5, 0.0F, 0.0F);
		} else if (ShakeMode.field2125 == this.field10590) {
			arg0.field2211 = (int) ((float) arg0.field2211 + var5);
			arg1.method5116(0.0F, var5, 0.0F);
		} else if (ShakeMode.field2130 == this.field10590) {
			arg0.field2213 = (int) ((float) arg0.field2213 + var5);
			arg1.method5116(0.0F, 0.0F, var5);
		} else if (ShakeMode.field2126 == this.field10590) {
			arg1.method5178(1.0F, 0.0F, 0.0F, var5);
		} else if (ShakeMode.field2128 == this.field10590) {
			arg1.method5178(0.0F, 1.0F, 0.0F, var5);
		} else if (ShakeMode.field2129 == this.field10590) {
			arg1.method5178(0.0F, 0.0F, 1.0F, var5);
		}
	}

	@ObfuscatedName("alj.s(Laet;I)V")
	public void method16671(Packet arg0) {
		this.field10590 = ShakeMode.method7070(arg0.method15220());
		this.field10589 = arg0.method15324();
		this.field10591 = arg0.method15324();
	}
}
