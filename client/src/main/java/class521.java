
import deob.ObfuscatedName;

@ObfuscatedName("sh")
public class class521 {

	@ObfuscatedName("sh.j")
	public static class565 field6388 = new class565(4);

	@ObfuscatedName("sh.a")
	public static final class520 field6390 = new class520();

	public class521() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("oi.u(IIZI)V")
	public static void method7358(int arg0, int arg1, boolean arg2) {
		if (field6388.method11923((long) arg0) != null) {
			return;
		}
		if (client.field8944) {
			class813 var3 = new class813(arg0, new class821(4096, Statics.field2117, arg0), arg1, arg2);
			var3.field9618.method7003(Statics.field2308.method11187());
			field6388.method11927(var3, (long) arg0);
		} else {
			method5563(arg0, arg2);
		}
	}

	@ObfuscatedName("ti.j(IB)V")
	public static void method11689(int arg0) {
		class813 var1 = (class813) field6388.method11923((long) arg0);
		if (var1 != null) {
			var1.field9622 = !var1.field9622;
			var1.field9618.method7018(var1.field9622);
		}
	}

	@ObfuscatedName("eu.a(II)V")
	public static void method2930(int arg0) {
		class813 var1 = (class813) field6388.method11923((long) arg0);
		if (var1 != null) {
			var1.field9618.method7022();
			method5563(var1.field9624, var1.field9621);
			var1.method6979();
		}
	}

	@ObfuscatedName("kg.s(IZI)V")
	public static void method5563(int arg0, boolean arg1) {
		if (arg1) {
			class792 var2 = class792.method14781(class280.field2867, client.field8975.field834);
			var2.field9467.method15287(arg0);
			client.field8975.method1913(var2);
		} else {
			class502.method1372(class619.field7307, arg0, -1);
		}
	}

	@ObfuscatedName("ap.c(IB)Ljava/lang/String;")
	public static String method1723(int arg0) {
		class813 var1 = (class813) field6388.method11923((long) arg0);
		if (var1 != null) {
			class959 var2 = var1.field9618.method7014();
			if (var2 != null) {
				double var3 = var1.field9618.method7039();
				if ((double) var2.method16825() <= var3 && (double) var2.method16826() >= var3) {
					return var2.method16823();
				}
			}
		}
		return null;
	}

	@ObfuscatedName("jf.m(Lra;II)Lce;")
	public static class118 method4742(class14 arg0, int arg1) {
		class813 var2 = (class813) field6388.method11923((long) arg1);
		if (var2 != null) {
			class958 var3 = var2.field9618.method7029();
			var2.field9620 = true;
			if (var3 != null) {
				field6390.field6386 = arg0;
				return (class118) var3.method16817(field6390);
			}
		}
		return null;
	}

	@ObfuscatedName("aje.t(I)V")
	public static void method16665() {
		for (class813 var0 = (class813) field6388.method11928(); var0 != null; var0 = (class813) field6388.method11929()) {
			if (var0.field9618.method7015()) {
				method2930(var0.field9624);
			} else {
				var0.field9618.method15486();
				try {
					var0.field9618.method7006();
				} catch (Exception var4) {
					class983.method16252("" + var0.field9624, var4);
					method2930(var0.field9624);
				}
				if (!var0.field9623 && !var0.field9622) {
					class957 var2 = var0.field9618.method7009();
					if (var2 != null) {
						class940 var3 = var2.method16795();
						if (var3 != null) {
							var3.method16466(var0.field9619);
							Statics.field4201.method16452(var3);
							var0.field9623 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("wl.l(I)V")
	public static void method12632() {
		for (class813 var0 = (class813) field6388.method11928(); var0 != null; var0 = (class813) field6388.method11929()) {
			if (var0.field9620) {
				var0.field9620 = false;
			} else {
				method2930(var0.field9624);
			}
		}
	}

	@ObfuscatedName("jf.f(I)V")
	public static void method4743() {
		for (class813 var0 = (class813) field6388.method11928(); var0 != null; var0 = (class813) field6388.method11929()) {
			method2930(var0.field9624);
		}
	}
}
