
import deob.ObfuscatedName;

@ObfuscatedName("ki")
public class class308 implements class310 {

	@ObfuscatedName("ki.u")
	public static final byte[] field3414 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@ObfuscatedName("ki.j")
	public static class451 field3415 = new class451(128, 4);

	@ObfuscatedName("ki.a")
	public final class632 field3413;

	@ObfuscatedName("ki.s")
	public final class214[] field3417;

	@ObfuscatedName("ki.c")
	public final int field3416;

	@ObfuscatedName("ki.m")
	public final int field3412;

	@ObfuscatedName("ki.t")
	public RendererToolkit field3418;

	@ObfuscatedName("ki.l")
	public boolean field3419;

	@ObfuscatedName("la.u(I)V")
	public static void method6065() {
		field3415.method7922();
	}

	public class308(class632 arg0, int arg1, int arg2, class210 arg3) {
		this.field3413 = arg0;
		this.field3416 = arg1;
		this.field3412 = arg2;
		this.field3417 = new class214[this.field3413.field7395.length];
		for (int var5 = 0; var5 < this.field3417.length; var5++) {
			this.field3417[var5] = arg3.method3973(this.field3413.field7395[var5]);
		}
	}

	@ObfuscatedName("ki.t(B)V")
	public void method5006() {
		if (Statics.field5187 != this.field3418) {
			this.field3418 = Statics.field5187;
			this.field3419 = true;
		}
		this.field3418.method505(3, 0);
		class214[] var1 = this.field3417;
		for (int var2 = 0; var2 < var1.length; var2++) {
			class214 var3 = var1[var2];
			if (var3 != null) {
				var3.method3936();
			}
		}
	}

	@ObfuscatedName("ki.a(ZB)V")
	public void method4982(boolean arg0) {
		boolean var2 = true;
		class214[] var3 = this.field3417;
		for (int var4 = 0; var4 < var3.length; var4++) {
			class214 var5 = var3[var4];
			if (var5 != null) {
				var5.method3932(var2 || this.field3419);
			}
		}
		this.field3419 = false;
	}

	@ObfuscatedName("ki.l(I)I")
	public int method4981() {
		int var1 = 0;
		class214[] var2 = this.field3417;
		for (int var3 = 0; var3 < var2.length; var3++) {
			class214 var4 = var2[var3];
			if (var4 == null || var4.method3931()) {
				var1++;
			}
		}
		return var1 * 100 / this.field3417.length;
	}

	@ObfuscatedName("ki.m(I)V")
	public void method4985() {
	}

	@ObfuscatedName("ki.f(J)Z")
	public boolean method4988(long arg0) {
		return MonotonicTime.method5554() >= (long) this.field3416 + arg0;
	}

	@ObfuscatedName("g.j(Lls;II)Lce;")
	public static class118 method1624(class334 arg0, int arg1) {
		class118 var2 = (class118) field3415.method7916((long) arg1);
		if (var2 == null) {
			if (Statics.field5109) {
				var2 = Statics.field5187.method517(class125.method2598(arg0, arg1), true);
			} else {
				var2 = Statics.method1604(arg0.method5635(arg1));
			}
			field3415.method7937(var2, (long) arg1);
		}
		return var2;
	}

	@ObfuscatedName("id.s(I)Z")
	public static boolean method4590() {
		try {
			GZip var0 = new GZip();
			byte[] var1 = var0.method12747(field3414);
			Statics.method1604(var1);
			return true;
		} catch (Exception var3) {
			return false;
		}
	}

	@ObfuscatedName("ki.d(I)I")
	public int method4983() {
		return this.field3412;
	}
}
