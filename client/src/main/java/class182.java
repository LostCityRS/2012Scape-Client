
import deob.ObfuscatedName;

@ObfuscatedName("fn")
public class class182 {

	@ObfuscatedName("fn.u")
	public IterableMap field2134;

	@ObfuscatedName("fn.j")
	public class786[] field2133;

	@ObfuscatedName("fn.a")
	public final class181 field2132;

	public class182(int arg0, class181 arg1) {
		int var3;
		for (var3 = 1; var3 < arg0; var3 += var3) {
		}
		this.field2134 = new IterableMap(var3);
		this.field2133 = new class786[var3];
		this.field2132 = arg1;
	}

	@ObfuscatedName("fn.u(II)Lacn;")
	public class786 method3557(int arg0) {
		return arg0 >= this.field2133.length ? null : this.field2133[arg0];
	}

	@ObfuscatedName("fn.j(Ljava/lang/String;I)Lacn;")
	public class786 method3550(String arg0) {
		long var2 = this.field2132.method3209(arg0);
		for (class786 var4 = (class786) this.field2134.method11923(var2); var4 != null; var4 = (class786) this.field2134.method11924()) {
			if (var4.field9424.equals(arg0)) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("fn.a(IB)V")
	public void method3551(int arg0) {
		class786 var2 = this.method3557(arg0);
		if (var2 != null) {
			var2.method6979();
			this.field2133[var2.field9425] = null;
		}
	}

	@ObfuscatedName("fn.s(ILjava/lang/String;Lacn;I)V")
	public void method3552(int arg0, String arg1, class786 arg2) {
		class786 var4 = this.method3550(arg1);
		if (var4 != null && var4.field9425 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method3551(arg0);
		if (arg0 >= this.field2133.length) {
			int var5;
			for (var5 = this.field2133.length; var5 <= arg0; var5 += var5) {
			}
			this.field2134 = new IterableMap(var5);
			for (int var6 = 0; var6 < this.field2133.length; var6++) {
				class786 var7 = this.field2133[var6];
				if (var7 != null) {
					this.field2134.method11927(var7, var7.field4228);
				}
			}
			class786[] var8 = new class786[var5];
			for (int var9 = 0; var9 < this.field2133.length; var9++) {
				var8[var9] = this.field2133[var9];
			}
			this.field2133 = var8;
		}
		arg2.field9425 = arg0;
		arg2.field9424 = arg1;
		this.field2134.method11927(arg2, this.field2132.method3209(arg1));
		this.field2133[arg0] = arg2;
	}
}
