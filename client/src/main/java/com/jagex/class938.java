package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aib")
public abstract class class938 extends class793 {

	@ObfuscatedName("aib.l")
	public int field10266;

	@ObfuscatedName("aib.f")
	public int field10264;

	@ObfuscatedName("aib.d")
	public int field10263;

	@ObfuscatedName("aib.z")
	public int field10277;

	@ObfuscatedName("aib.n")
	public int field10267;

	@ObfuscatedName("aib.o")
	public int field10268;

	@ObfuscatedName("aib.q")
	public int field10269;

	@ObfuscatedName("aib.p")
	public int field10270;

	@ObfuscatedName("aib.w")
	public int field10271;

	@ObfuscatedName("aib.b")
	public int field10274;

	@ObfuscatedName("aib.x")
	public int field10265;

	@ObfuscatedName("aib.i")
	public int field10272;

	@ObfuscatedName("aib.v")
	public int field10275;

	@ObfuscatedName("aib.k")
	public boolean field10276;

	@ObfuscatedName("aib.h")
	public int field10273;

	@ObfuscatedName("wi.an(III)I")
	public static final int method12579(int arg0, int arg1) {
		return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ada.ap(III)I")
	public static final int method15028(int arg0, int arg1) {
		return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("aib.ag(B)V")
	public final void method16382() {
		this.field10267 = this.field10263 * 1793558841;
		this.field10268 = method12579(this.field10263 * 114643993, this.field10277 * -513627215) * -1006601769;
		this.field10269 = method15028(this.field10263 * 114643993, this.field10277 * -513627215) * -2143173225;
	}

	@ObfuscatedName("aib.u()I")
	public final int method15049() {
		int var1 = this.field10267 * 2081523107 >> 6;
		int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
		if (this.field10265 * -1714711623 == 0) {
			var2 -= this.field10266 * -230656597 * var2 / (((class941) this.field9474).method16496() << 8);
		} else if (this.field10265 * -1714711623 >= 0) {
			var2 -= this.field10272 * -1905901495 * var2 / ((class941) this.field9474).method16496();
		}
		return var2 > 255 ? 255 : var2;
	}

	@ObfuscatedName("aib.as(B)Z")
	public final synchronized boolean method16383() {
		return this.field10273 * -1897927611 != 0;
	}

	@ObfuscatedName("aib.ai(IS)V")
	public final synchronized void method16384(int arg0) {
		this.field10265 = arg0 * 1918534281;
	}

	@ObfuscatedName("aib.ao(II)V")
	public final synchronized void method16402(int arg0) {
		this.method16388(arg0 << 6, this.method16426());
	}

	@ObfuscatedName("aib.al(IB)V")
	public final synchronized void method16386(int arg0) {
		this.method16388(arg0, this.method16426());
	}

	@ObfuscatedName("aib.at(IB)V")
	public final synchronized void method16387(int arg0) {
		this.method16388(this.method16442(), arg0);
	}

	@ObfuscatedName("aib.ax(III)V")
	public final synchronized void method16388(int arg0, int arg1) {
		this.field10263 = arg0 * -2089629655;
		this.field10277 = arg1 * 1994833233;
		this.field10273 = 0;
		this.method16382();
	}

	@ObfuscatedName("aib.aw(B)I")
	public final synchronized int method16442() {
		return this.field10263 * 114643993 == Integer.MIN_VALUE ? 0 : this.field10263 * 114643993;
	}

	@ObfuscatedName("aib.aa(B)I")
	public final synchronized int method16426() {
		return this.field10277 * -513627215 < 0 ? -1 : this.field10277 * -513627215;
	}

	@ObfuscatedName("aib.am(II)V")
	public final synchronized void method16421(int arg0) {
		int var2 = ((class941) this.field9474).method16496() << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > var2) {
			arg0 = var2;
		}
		this.field10266 = arg0 * 1291771139;
	}

	@ObfuscatedName("aib.ad(ZB)V")
	public final synchronized void method16413(boolean arg0) {
		this.field10264 = ((this.field10264 * -866024637 >>> 31) + (this.field10264 * -866024637 ^ this.field10264 * -866024637 >> 31)) * -268721813;
		if (arg0) {
			this.field10264 = -this.field10264;
		}
	}

	@ObfuscatedName("aib.az(B)Z")
	public final synchronized boolean method16393() {
		return this.field10266 * -230656597 < 0 || this.field10266 * -230656597 >= ((class941) this.field9474).method16496() << 8;
	}

	@ObfuscatedName("aib.ak(B)V")
	public final void method16394() {
		if (this.field10273 * -1897927611 == 0) {
			return;
		}
		if (this.field10263 * 114643993 == Integer.MIN_VALUE) {
			this.field10263 = 0;
		}
		this.field10273 = 0;
		this.method16382();
	}

	@ObfuscatedName("aib.av(III)V")
	public final synchronized void method16399(int arg0, int arg1) {
		this.method16395(arg0, arg1, this.method16426());
	}

	@ObfuscatedName("aib.aj(IIIB)V")
	public final synchronized void method16395(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			this.method16388(arg1, arg2);
			return;
		}
		int var4 = method12579(arg1, arg2);
		int var5 = method15028(arg1, arg2);
		if (this.field10268 * -1865250329 == var4 && this.field10269 * 1681197607 == var5) {
			this.field10273 = 0;
			return;
		}
		int var6 = arg1 - this.field10267 * 2125496801;
		if (this.field10267 * 2125496801 - arg1 > var6) {
			var6 = this.field10267 * 2125496801 - arg1;
		}
		if (var4 - this.field10268 * -1865250329 > var6) {
			var6 = var4 - this.field10268 * -1865250329;
		}
		if (this.field10268 * -1865250329 - var4 > var6) {
			var6 = this.field10268 * -1865250329 - var4;
		}
		if (var5 - this.field10269 * 1681197607 > var6) {
			var6 = var5 - this.field10269 * 1681197607;
		}
		if (this.field10269 * 1681197607 - var5 > var6) {
			var6 = this.field10269 * 1681197607 - var5;
		}
		if (arg0 > var6) {
			arg0 = var6;
		}
		this.field10273 = arg0 * 1825588877;
		this.field10263 = arg1 * -2089629655;
		this.field10277 = arg2 * 1994833233;
		this.field10270 = (arg1 - this.field10267 * 2125496801) / arg0 * -172382997;
		this.field10271 = (var4 - this.field10268 * -1865250329) / arg0 * 1738714365;
		this.field10274 = (var5 - this.field10269 * 1681197607) / arg0 * 888405619;
	}

	@ObfuscatedName("aib.ah(IS)V")
	public final synchronized void method16418(int arg0) {
		if (arg0 == 0) {
			this.method16386(0);
			this.method6979();
		} else if (this.field10268 * -1865250329 == 0 && this.field10269 * 1681197607 == 0) {
			this.field10273 = 0;
			this.field10263 = 0;
			this.field10267 = 0;
			this.method6979();
		} else {
			int var2 = -(this.field10267 * 2125496801);
			if (this.field10267 * 2125496801 > var2) {
				var2 = this.field10267 * 2125496801;
			}
			if (-(this.field10268 * -1865250329) > var2) {
				var2 = -(this.field10268 * -1865250329);
			}
			if (this.field10268 * -1865250329 > var2) {
				var2 = this.field10268 * -1865250329;
			}
			if (-(this.field10269 * 1681197607) > var2) {
				var2 = -(this.field10269 * 1681197607);
			}
			if (this.field10269 * 1681197607 > var2) {
				var2 = this.field10269 * 1681197607;
			}
			if (arg0 > var2) {
				arg0 = var2;
			}
			this.field10273 = arg0 * 1825588877;
			this.field10263 = Integer.MIN_VALUE;
			this.field10270 = -(this.field10267 * 2125496801) / arg0 * -172382997;
			this.field10271 = -(this.field10268 * -1865250329) / arg0 * 1738714365;
			this.field10274 = -(this.field10269 * 1681197607) / arg0 * 888405619;
		}
	}

	@ObfuscatedName("aib.au(II)V")
	public final synchronized void method16396(int arg0) {
		if (this.field10264 * -866024637 < 0) {
			this.field10264 = -arg0 * -268721813;
		} else {
			this.field10264 = arg0 * -268721813;
		}
	}

	@ObfuscatedName("aib.ae(B)I")
	public final synchronized int method16397() {
		return this.field10264 * -866024637 < 0 ? -(this.field10264 * -866024637) : this.field10264 * -866024637;
	}

	@ObfuscatedName("aib.s()I")
	public final int method15035() {
		return this.field10263 * 114643993 == 0 && this.field10273 * -1897927611 == 0 ? 0 : 1;
	}

	@ObfuscatedName("aib.ac(I)Z")
	public final boolean method16398() {
		int var1 = this.field10263 * 114643993;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method12579(var1, this.field10277 * -513627215);
			var2 = method15028(var1, this.field10277 * -513627215);
		}
		if (this.field10267 * 2125496801 != var1 || this.field10268 * -1865250329 != var3 || this.field10269 * 1681197607 != var2) {
			if (this.field10267 * 2125496801 < var1) {
				this.field10270 = -172382997;
				this.field10273 = (var1 - this.field10267 * 2125496801) * 1825588877;
			} else if (this.field10267 * 2125496801 > var1) {
				this.field10270 = 172382997;
				this.field10273 = (this.field10267 * 2125496801 - var1) * 1825588877;
			} else {
				this.field10270 = 0;
			}
			if (this.field10268 * -1865250329 < var3) {
				this.field10271 = 1738714365;
				if (this.field10273 * -1897927611 == 0 || this.field10273 * -1897927611 > var3 - this.field10268 * -1865250329) {
					this.field10273 = (var3 - this.field10268 * -1865250329) * 1825588877;
				}
			} else if (this.field10268 * -1865250329 > var3) {
				this.field10271 = -1738714365;
				if (this.field10273 * -1897927611 == 0 || this.field10273 * -1897927611 > this.field10268 * -1865250329 - var3) {
					this.field10273 = (this.field10268 * -1865250329 - var3) * 1825588877;
				}
			} else {
				this.field10271 = 0;
			}
			if (this.field10269 * 1681197607 < var2) {
				this.field10274 = 888405619;
				if (this.field10273 * -1897927611 == 0 || this.field10273 * -1897927611 > var2 - this.field10269 * 1681197607) {
					this.field10273 = (var2 - this.field10269 * 1681197607) * 1825588877;
				}
			} else if (this.field10269 * 1681197607 > var2) {
				this.field10274 = -888405619;
				if (this.field10273 * -1897927611 == 0 || this.field10273 * -1897927611 > this.field10269 * 1681197607 - var2) {
					this.field10273 = (this.field10269 * 1681197607 - var2) * 1825588877;
				}
			} else {
				this.field10274 = 0;
			}
			return false;
		} else if (this.field10263 * 114643993 == Integer.MIN_VALUE) {
			this.field10263 = 0;
			this.field10269 = 0;
			this.field10268 = 0;
			this.field10267 = 0;
			this.method6979();
			return true;
		} else {
			this.method16382();
			return false;
		}
	}

	@ObfuscatedName("aib.t(I)V")
	public final synchronized void method15046(int arg0) {
		if (this.field10273 * -1897927611 > 0) {
			if (arg0 >= this.field10273 * -1897927611) {
				if (this.field10263 * 114643993 == Integer.MIN_VALUE) {
					this.field10263 = 0;
					this.field10269 = 0;
					this.field10268 = 0;
					this.field10267 = 0;
					this.method6979();
					arg0 = this.field10273 * -1897927611;
				}
				this.field10273 = 0;
				this.method16382();
			} else {
				this.field10267 += this.field10270 * 408019907 * arg0 * 1219199521;
				this.field10268 += this.field10271 * -2032414635 * arg0 * -1006601769;
				this.field10269 += this.field10274 * -1150560581 * arg0 * -2143173225;
				this.field10273 -= arg0 * 1825588877;
			}
		}
		int var2 = this.field10272 * -1905901495 << 8;
		int var3 = this.field10275 * 663751757 << 8;
		int var4 = ((class941) this.field9474).method16496() << 8;
		int var5 = var3 - var2;
		if (var5 <= 0) {
			this.field10265 = 0;
		}
		if (this.field10266 * -230656597 < 0) {
			if (this.field10264 * -866024637 <= 0) {
				this.method16394();
				this.method6979();
				return;
			}
			this.field10266 = 0;
		}
		if (this.field10266 * -230656597 >= var4) {
			if (this.field10264 * -866024637 >= 0) {
				this.method16394();
				this.method6979();
				return;
			}
			this.field10266 = (var4 - 1) * 1291771139;
		}
		this.field10266 += this.field10264 * -866024637 * arg0 * 1291771139;
		if (this.field10265 * -1714711623 >= 0) {
			if (this.field10265 * -1714711623 > 0) {
				if (this.field10276) {
					label121: {
						if (this.field10264 * -866024637 < 0) {
							if (this.field10266 * -230656597 >= var2) {
								return;
							}
							this.field10266 = (var2 + var2 - 1 - this.field10266 * -230656597) * 1291771139;
							this.field10264 = -this.field10264;
							if ((this.field10265 -= 1918534281) * -1714711623 == 0) {
								break label121;
							}
						}
						do {
							if (this.field10266 * -230656597 < var3) {
								return;
							}
							this.field10266 = (var3 + var3 - 1 - this.field10266 * -230656597) * 1291771139;
							this.field10264 = -this.field10264;
							if ((this.field10265 -= 1918534281) * -1714711623 == 0) {
								break;
							}
							if (this.field10266 * -230656597 >= var2) {
								return;
							}
							this.field10266 = (var2 + var2 - 1 - this.field10266 * -230656597) * 1291771139;
							this.field10264 = -this.field10264;
						} while ((this.field10265 -= 1918534281) * -1714711623 != 0);
					}
				} else {
					label153: {
						if (this.field10264 * -866024637 < 0) {
							if (this.field10266 * -230656597 >= var2) {
								return;
							}
							int var6 = (var3 - 1 - this.field10266 * -230656597) / var5;
							if (var6 >= this.field10265 * -1714711623) {
								this.field10266 += this.field10265 * -1714711623 * var5 * 1291771139;
								this.field10265 = 0;
								break label153;
							}
							this.field10266 += var5 * var6 * 1291771139;
							this.field10265 -= var6 * 1918534281;
						} else if (this.field10266 * -230656597 >= var3) {
							int var7 = (this.field10266 * -230656597 - var2) / var5;
							if (var7 >= this.field10265 * -1714711623) {
								this.field10266 -= this.field10265 * -1714711623 * var5 * 1291771139;
								this.field10265 = 0;
								break label153;
							}
							this.field10266 -= var5 * var7 * 1291771139;
							this.field10265 -= var7 * 1918534281;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.field10264 * -866024637 < 0) {
				if (this.field10266 * -230656597 < 0) {
					this.field10266 = -1291771139;
					this.method16394();
					this.method6979();
				}
			} else if (this.field10266 * -230656597 >= var4) {
				this.field10266 = var4 * 1291771139;
				this.method16394();
				this.method6979();
			}
		} else if (this.field10276) {
			if (this.field10264 * -866024637 < 0) {
				if (this.field10266 * -230656597 >= var2) {
					return;
				}
				this.field10266 = (var2 + var2 - 1 - this.field10266 * -230656597) * 1291771139;
				this.field10264 = -this.field10264;
			}
			while (this.field10266 * -230656597 >= var3) {
				this.field10266 = (var3 + var3 - 1 - this.field10266 * -230656597) * 1291771139;
				this.field10264 = -this.field10264;
				if (this.field10266 * -230656597 >= var2) {
					return;
				}
				this.field10266 = (var2 + var2 - 1 - this.field10266 * -230656597) * 1291771139;
				this.field10264 = -this.field10264;
			}
		} else if (this.field10264 * -866024637 < 0) {
			if (this.field10266 * -230656597 >= var2) {
				return;
			}
			this.field10266 = (var3 - 1 - (var3 - 1 - this.field10266 * -230656597) % var5) * 1291771139;
		} else if (this.field10266 * -230656597 >= var3) {
			this.field10266 = ((this.field10266 * -230656597 - var2) % var5 + var2) * 1291771139;
		} else {
			return;
		}
	}

	@ObfuscatedName("aib.j()Ladc;")
	public final class793 method15031() {
		return null;
	}

	@ObfuscatedName("aib.a()Ladc;")
	public final class793 method15032() {
		return null;
	}

	@ObfuscatedName("aib.m([III)V")
	public abstract void method15034(int[] arg0, int arg1, int arg2);
}
