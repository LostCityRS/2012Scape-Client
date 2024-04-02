package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("tt")
public class class553 {

	@ObfuscatedName("tt.s")
	public class509 field6671;

	@ObfuscatedName("tt.c")
	public int field6672;

	@ObfuscatedName("tt.m")
	public int field6673;

	@ObfuscatedName("tt.t")
	public int field6678;

	@ObfuscatedName("tt.l")
	public int field6670;

	@ObfuscatedName("tt.f")
	public int field6675;

	@ObfuscatedName("tt.d")
	public boolean field6668 = false;

	@ObfuscatedName("tt.z")
	public boolean field6677 = false;

	@ObfuscatedName("tt.n")
	public int field6679 = 0;

	@ObfuscatedName("tt.o")
	public boolean field6680 = false;

	@ObfuscatedName("tt.p")
	public final class554 field6681;

	@ObfuscatedName("tt.w")
	public final class554 field6682;

	@ObfuscatedName("ms.u(Lst;I)V")
	public static void method6490(class510 arg0) {
		Statics.field8530 = arg0;
	}

	public class553(boolean arg0) {
		this.field6677 = arg0;
		this.field6681 = new class554();
		if (this.field6677) {
			this.field6682 = new class554();
		} else {
			this.field6682 = null;
		}
	}

	@ObfuscatedName("tt.j(Ltt;I)V")
	public final void method11766(class553 arg0) {
		this.field6671 = arg0.field6671;
		this.field6668 = arg0.field6668;
		this.field6677 = arg0.field6677;
		this.field6673 = arg0.field6673;
		this.field6678 = arg0.field6678;
		this.field6670 = arg0.field6670;
		this.field6675 = arg0.field6675;
		this.field6672 = arg0.field6672;
		this.method11801();
	}

	@ObfuscatedName("tt.a(I)Z")
	public final boolean method11767() {
		return this.field6671 != null;
	}

	@ObfuscatedName("tt.s(I)Lso;")
	public final class509 method11804() {
		return this.field6671;
	}

	@ObfuscatedName("tt.c(B)I")
	public final int method11812() {
		return this.field6671 == null ? -1 : this.field6671.field6318;
	}

	@ObfuscatedName("tt.m(II)V")
	public final void method11769(int arg0) {
		this.method11803(arg0, 0, 0, false);
	}

	@ObfuscatedName("tt.t(III)V")
	public final void method11771(int arg0, int arg1) {
		this.method11803(arg0, arg1, 0, false);
	}

	@ObfuscatedName("tt.l(IZI)V")
	public final void method11772(int arg0, boolean arg1) {
		this.method11803(arg0, 0, 0, arg1);
	}

	@ObfuscatedName("tt.f(IZZI)V")
	public final void method11773(int arg0, boolean arg1, boolean arg2) {
		this.method11775(arg0, 0, 0, arg1, arg2);
	}

	@ObfuscatedName("tt.d(IIIZB)V")
	public final void method11803(int arg0, int arg1, int arg2, boolean arg3) {
		this.method11775(arg0, arg1, arg2, arg3, false);
	}

	@ObfuscatedName("tt.z(IIIZZI)V")
	public final void method11775(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
		if (arg0 == this.method11812()) {
			return;
		}
		if (arg0 == -1) {
			this.field6671 = null;
		} else {
			if (this.field6671 == null || this.field6671.field6318 != arg0) {
				this.field6671 = Statics.field8530.method11144(arg0);
			} else if (this.field6671.field6331 == 0) {
				return;
			}
			this.field6678 = 0;
			this.field6673 = arg1;
			this.field6679 = arg2;
			this.field6680 = arg4;
			if (arg3) {
				this.field6670 = (int) (Math.random() * (double) this.field6671.field6329.length);
				this.field6672 = (int) (Math.random() * (double) this.field6671.field6321[this.field6670]);
			} else {
				this.field6670 = 0;
				this.field6672 = 0;
			}
			this.field6675 = this.field6670 * 1201130439 + 1201130439;
			if (this.field6675 * 2062845431 < 0 || this.field6675 * 2062845431 >= this.field6671.field6329.length) {
				this.field6675 = -1201130439;
			}
			if (this.field6673 == 0) {
				this.method11789(this.field6671, this.field6670);
			}
			this.field6668 = false;
		}
		this.method11801();
	}

	@ObfuscatedName("tt.n(S)Z")
	public final boolean method11776() {
		return this.field6673 != 0;
	}

	@ObfuscatedName("tt.o(I)I")
	public final int method11777() {
		return this.field6673;
	}

	@ObfuscatedName("tt.q(IB)V")
	public final void method11791(int arg0) {
		this.field6673 = arg0;
	}

	@ObfuscatedName("tt.p(I)I")
	public final int method11779() {
		if (!this.method11790()) {
			return 0;
		}
		int var1 = 0;
		if (this.method11790()) {
			var1 |= this.field6681.field6685;
			if (this.field6677 && this.field6671.field6320 != null) {
				var1 |= this.field6682.field6685;
			}
		}
		return var1;
	}

	@ObfuscatedName("tt.w(Lqa;II)V")
	public final void method11780(class13 arg0, int arg1) {
		if (this.field6671 != null && (this.field6671.field6329 != null && this.method11790())) {
			arg0.method375(this.field6681.field6687, this.field6681.field6689, this.field6681.field6688, this.field6681.field6686, this.field6672, this.field6671.field6321[this.field6670], arg1, this.field6671.field6332);
			if (this.field6677 && this.field6671.field6320 != null && this.field6682.field6684) {
				arg0.method375(this.field6682.field6687, this.field6682.field6689, this.field6682.field6688, this.field6682.field6686, this.field6672, this.field6671.field6321[this.field6670], arg1, this.field6671.field6332);
			}
		}
	}

	@ObfuscatedName("tt.b(Lqa;IIB)V")
	public final void method11765(class13 arg0, int arg1, int arg2) {
		if (this.field6671.field6329 != null && this.method11790()) {
			arg0.method260(this.field6681.field6687, this.field6681.field6689, this.field6681.field6688, this.field6681.field6686, this.field6672, this.field6671.field6321[this.field6670], arg1, arg2, this.field6671.field6332, null);
			if (this.field6677 && this.field6671.field6320 != null && this.field6682.field6684) {
				arg0.method260(this.field6682.field6687, this.field6682.field6689, this.field6682.field6688, this.field6682.field6686, this.field6672, this.field6671.field6321[this.field6670], arg1, arg2, this.field6671.field6332, null);
			}
		}
	}

	@ObfuscatedName("tt.x(Lqa;B)V")
	public final void method11782(class13 arg0) {
		if (this.field6671.field6329 != null && this.method11790()) {
			arg0.method262(this.field6681.field6687, this.field6681.field6689);
			if (this.field6677 && this.field6671.field6320 != null && this.field6682.field6684) {
				arg0.method262(this.field6682.field6687, this.field6682.field6689);
			}
		}
	}

	@ObfuscatedName("tt.v(I)Z")
	public final boolean method11784() {
		return this.field6668;
	}

	@ObfuscatedName("tt.k(S)V")
	public final void method11806() {
		this.field6678 = 0;
	}

	@ObfuscatedName("tt.h(I)V")
	public final void method11785() {
		this.method11786(0);
	}

	@ObfuscatedName("tt.r(II)V")
	public final void method11786(int arg0) {
		this.field6670 = 0;
		this.field6675 = (this.field6671.field6329.length > 1 ? 1 : -1) * 1201130439;
		this.field6672 = 0;
		this.field6668 = false;
		this.field6673 = arg0;
		this.field6678 = 0;
		if (this.field6671 != null & this.field6671.field6329 != null) {
			this.method11789(this.field6671, this.field6670);
			this.method11801();
		}
	}

	@ObfuscatedName("tt.g(II)Z")
	public final boolean method11787(int arg0) {
		if (this.field6671 == null || arg0 == 0) {
			return false;
		}
		if (this.field6673 > 0) {
			if (this.field6673 >= arg0) {
				this.field6673 -= arg0;
				return false;
			}
			arg0 -= this.field6673;
			this.field6673 = 0;
			this.method11789(this.field6671, this.field6670);
		}
		int var2 = this.field6672 + arg0;
		boolean var3 = this.field6671.field6333 | class509.field6319;
		if (var2 > 100 && this.field6671.field6336 > 0) {
			int var4 = this.field6671.field6329.length - this.field6671.field6336;
			while (this.field6670 < var4 && var2 > this.field6671.field6321[this.field6670]) {
				var2 -= this.field6671.field6321[this.field6670];
				this.field6670++;
			}
			if (this.field6670 >= var4) {
				int var5 = 0;
				for (int var6 = var4; var6 < this.field6671.field6329.length; var6++) {
					var5 += this.field6671.field6321[var6];
				}
				if (this.field6679 == 0) {
					this.field6678 += var2 / var5;
				}
				var2 %= var5;
			}
			this.field6675 = this.field6670 * 1201130439 + 1201130439;
			if (this.field6675 * 2062845431 >= this.field6671.field6329.length) {
				if (this.field6671.field6336 == -1 && this.field6680) {
					this.field6675 = 0;
				} else {
					this.field6675 -= this.field6671.field6336 * 1201130439;
				}
				if (this.field6675 * 2062845431 < 0 || this.field6675 * 2062845431 >= this.field6671.field6329.length) {
					this.field6675 = -1201130439;
				}
			}
			var3 = true;
		}
		while (var2 > this.field6671.field6321[this.field6670]) {
			var3 = true;
			var2 -= this.field6671.field6321[++this.field6670 - 1];
			if (this.field6670 >= this.field6671.field6329.length) {
				if (this.field6671.field6336 != -1 && this.field6679 != 2) {
					this.field6670 -= this.field6671.field6336;
					if (this.field6679 == 0) {
						this.field6678++;
					}
				}
				if (this.field6678 >= this.field6671.field6328 || this.field6670 < 0 || this.field6670 >= this.field6671.field6329.length) {
					this.field6668 = true;
					break;
				}
			}
			this.method11789(this.field6671, this.field6670);
			this.field6675 = this.field6670 * 1201130439 + 1201130439;
			if (this.field6675 * 2062845431 >= this.field6671.field6329.length) {
				if (this.field6671.field6336 == -1 && this.field6680) {
					this.field6675 = 0;
				} else {
					this.field6675 -= this.field6671.field6336 * 1201130439;
				}
				if (this.field6675 * 2062845431 < 0 || this.field6675 * 2062845431 >= this.field6671.field6329.length) {
					this.field6675 = -1201130439;
				}
			}
		}
		this.field6672 = var2;
		if (var3) {
			this.method11801();
		}
		return var3;
	}

	@ObfuscatedName("tt.y(II)Z")
	public final boolean method11788(int arg0) {
		int var2;
		return this.field6671 == null | (var2 = arg0 - this.field6673) <= 0 ? false : this.field6671.field6333 | this.field6672 + var2 > this.field6671.field6321[this.field6670];
	}

	@ObfuscatedName("tt.e(Lso;II)V")
	public void method11789(class509 arg0, int arg1) {
	}

	@ObfuscatedName("tt.ay(B)Z")
	public final boolean method11790() {
		if (this.field6671 == null) {
			return false;
		}
		boolean var1 = this.field6681.method11837(Statics.field8530, this.field6671, this.field6670, this.field6675 * 2062845431, this.field6671.field6329);
		if (var1 && this.field6677 && this.field6671.field6320 != null) {
			this.field6682.method11837(Statics.field8530, this.field6671, this.field6670, this.field6675 * 2062845431, this.field6671.field6320);
		}
		return var1;
	}

	@ObfuscatedName("tt.af(I)V")
	public final void method11801() {
		this.field6681.method11839();
		if (this.field6677) {
			this.field6682.method11839();
		}
	}
}
