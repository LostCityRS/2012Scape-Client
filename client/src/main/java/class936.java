
import deob.ObfuscatedName;

@ObfuscatedName("aij")
public class class936 extends class793 {

	@ObfuscatedName("aij.l")
	public class937 field10226;

	@ObfuscatedName("aij.f")
	public class547 field10227 = new class547();

	@ObfuscatedName("aij.d")
	public class939 field10225 = new class939();

	public class936(class937 arg0) {
		this.field10226 = arg0;
	}

	@ObfuscatedName("aij.j()Ladc;")
	public class793 method15031() {
		class783 var1 = (class783) this.field10227.method11563();
		if (var1 == null) {
			return null;
		} else if (var1.field9401 == null) {
			return this.method15032();
		} else {
			return var1.field9401;
		}
	}

	@ObfuscatedName("aij.a()Ladc;")
	public class793 method15032() {
		class783 var1;
		do {
			var1 = (class783) this.field10227.method11567();
			if (var1 == null) {
				return null;
			}
		} while (var1.field9401 == null);
		return var1.field9401;
	}

	@ObfuscatedName("aij.s()I")
	public int method15035() {
		return 0;
	}

	@ObfuscatedName("aij.m([III)V")
	public void method15034(int[] arg0, int arg1, int arg2) {
		this.field10225.method15034(arg0, arg1, arg2);
		for (class783 var4 = (class783) this.field10227.method11563(); var4 != null; var4 = (class783) this.field10227.method11567()) {
			if (!this.field10226.method16296(var4)) {
				int var5 = arg1;
				int var6 = arg2;
				do {
					if (var6 <= var4.field9392) {
						this.method16255(var4, arg0, var5, var6, var5 + var6);
						var4.field9392 -= var6;
						break;
					}
					this.method16255(var4, arg0, var5, var4.field9392, var5 + var6);
					var5 += var4.field9392;
					var6 -= var4.field9392;
				} while (!this.field10226.method16338(var4, arg0, var5, var6));
			}
		}
	}

	@ObfuscatedName("aij.t(I)V")
	public void method15046(int arg0) {
		this.field10225.method15046(arg0);
		for (class783 var2 = (class783) this.field10227.method11563(); var2 != null; var2 = (class783) this.field10227.method11567()) {
			if (!this.field10226.method16296(var2)) {
				int var3 = arg0;
				do {
					if (var3 <= var2.field9392) {
						this.method16256(var2, var3);
						var2.field9392 -= var3;
						break;
					}
					this.method16256(var2, var2.field9392);
					var3 -= var2.field9392;
				} while (!this.field10226.method16338(var2, null, 0, var3));
			}
		}
	}

	@ObfuscatedName("aij.an(Laci;[IIIII)V")
	public void method16255(class783 arg0, int[] arg1, int arg2, int arg3, int arg4) {
		if ((this.field10226.field10245[arg0.field9400] & 0x4) != 0 && arg0.field9402 < 0) {
			int var6 = this.field10226.field10250[arg0.field9400] / Statics.field4015;
			while (true) {
				int var7 = (var6 + 1048575 - arg0.field9398) / var6;
				if (var7 > arg3) {
					arg0.field9398 += arg3 * var6;
					break;
				}
				arg0.field9401.method15034(arg1, arg2, var7);
				arg2 += var7;
				arg3 -= var7;
				arg0.field9398 += var6 * var7 - 1048576;
				int var8 = Statics.field4015 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}
				class938 var10 = arg0.field9401;
				if (this.field10226.field10248[arg0.field9400] == 0) {
					arg0.field9401 = arg0.field9385.method16502(var10.method16397(), var10.method16442(), var10.method16426());
				} else {
					arg0.field9401 = arg0.field9385.method16502(var10.method16397(), 0, var10.method16426());
					this.field10226.method16280(arg0, arg0.field9384.field9406[arg0.field9388] < 0);
					arg0.field9401.method16399(var8, var10.method16442());
				}
				if (arg0.field9384.field9406[arg0.field9388] < 0) {
					arg0.field9401.method16384(-1);
				}
				var10.method16418(var8);
				var10.method15034(arg1, arg2, arg4 - arg2);
				if (var10.method16383()) {
					this.field10225.method16452(var10);
				}
			}
		}
		arg0.field9401.method15034(arg1, arg2, arg3);
	}

	@ObfuscatedName("aij.ap(Laci;II)V")
	public void method16256(class783 arg0, int arg1) {
		if ((this.field10226.field10245[arg0.field9400] & 0x4) != 0 && arg0.field9402 < 0) {
			int var3 = this.field10226.field10250[arg0.field9400] / Statics.field4015;
			int var4 = (var3 + 1048575 - arg0.field9398) / var3;
			arg0.field9398 = arg0.field9398 + arg1 * var3 & 0xFFFFF;
			if (var4 <= arg1) {
				class938 var5 = arg0.field9401;
				if (this.field10226.field10248[arg0.field9400] == 0) {
					arg0.field9401 = arg0.field9385.method16502(var5.method16397(), var5.method16442(), var5.method16426());
				} else {
					arg0.field9401 = arg0.field9385.method16502(var5.method16397(), 0, var5.method16426());
					this.field10226.method16280(arg0, arg0.field9384.field9406[arg0.field9388] < 0);
				}
				if (arg0.field9384.field9406[arg0.field9388] < 0) {
					arg0.field9401.method16384(-1);
				}
				arg1 = arg0.field9398 / var3;
			}
		}
		arg0.field9401.method15046(arg1);
	}
}
