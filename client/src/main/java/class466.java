
import deob.ObfuscatedName;
import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("qr")
public class class466 {

	@ObfuscatedName("qr.a")
	public static int field4922 = 0;

	@ObfuscatedName("qr.s")
	public static int field4921 = 0;

	@ObfuscatedName("qr.m")
	public static int field4923 = 0;

	@ObfuscatedName("qr.t")
	public static int field4928 = 0;

	@ObfuscatedName("qr.l")
	public static int field4925 = 0;

	@ObfuscatedName("qr.f")
	public static int field4926 = 0;

	@ObfuscatedName("qr.d")
	public static IterableMap field4924 = new IterableMap(8);

	@ObfuscatedName("qr.z")
	public static int field4920 = 0;

	@ObfuscatedName("qr.n")
	public static int field4929 = 2;

	public class466() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("vt.u(Lls;B)V")
	public static void method12208(Js5 arg0) {
		field4922 = 0;
		field4921 = 0;
		Statics.field4686 = new LinkedList();
		Statics.field4919 = new class991[1024];
		Statics.field4927 = new ParticleSystem[class130.field1351[field4929] + 1];
		field4923 = 0;
		field4928 = 0;
		class273.method7704(arg0);
		class274.method3618(arg0);
	}

	@ObfuscatedName("dv.j(Lra;J)V")
	public static void method2847(RendererToolkit arg0, long arg1) {
		field4926 = field4925;
		field4925 = 0;
		MonotonicTime.method5554();
		Iterator var3 = Statics.field4686.iterator();
		while (var3.hasNext()) {
			ParticleSystem var4 = (ParticleSystem) var3.next();
			boolean var5 = var4.method8104(arg0, arg1);
			if (!var5) {
				var3.remove();
				Statics.field4927[field4928] = var4;
				field4928 = field4928 + 1 & class130.field1351[field4929];
			}
		}
	}

	@ObfuscatedName("fo.a(Loo;Lra;B)V")
	public static void method3619(Scene arg0, RendererToolkit arg1) {
		Iterator var2 = Statics.field4686.iterator();
		while (var2.hasNext()) {
			ParticleSystem var3 = (ParticleSystem) var2.next();
			if (var3.field4942) {
				var3.method8133(arg0, arg1);
			}
		}
	}

	@ObfuscatedName("jx.c(II)V")
	public static void method4754(int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		field4929 = arg0;
		Statics.field4927 = new ParticleSystem[class130.field1351[field4929] + 1];
		field4923 = 0;
		field4928 = 0;
	}
}
