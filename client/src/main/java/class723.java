
import deob.ObfuscatedName;

@ObfuscatedName("aao")
public final class class723 extends ParticleShader {

	public class723(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("aao.u(Lka;)V")
	public void method3875(Matrix4x4 arg0) {
		this.field2274.method13764(arg0, this.field2274.field8258, this.field2274.field8332);
	}

	@ObfuscatedName("aao.j(I)V")
	public void method3871(int arg0) {
		this.field2274.method13560(1, class249.field2545);
		this.field2274.method13562(1, class249.field2545);
		this.method14050();
		this.field2274.method13596(class255.field2582, 0, arg0 * 4, 0, arg0 * 2);
	}

	@ObfuscatedName("aao.a()V")
	public void method3872() {
		this.field2274.method13621(this.field2272);
		this.field2274.method13560(1, class249.field2547);
		this.field2274.method13562(1, class249.field2547);
		this.method14050();
		this.field2274.method13593();
	}

	@ObfuscatedName("aao.d()V")
	public void method14050() {
		this.field2274.method13629(0);
		this.field2274.method13557(this.field2271);
		this.field2274.method13560(0, class249.field2546);
		this.field2274.method13562(0, class249.field2546);
		this.field2274.method13632(class253.field2574, class253.field2574);
		this.field2274.method13566().method5412(this.field2273);
		this.field2274.method13567(class250.field2549);
	}
}
