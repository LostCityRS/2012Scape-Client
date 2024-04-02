package com.jagex;

import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("qs")
public abstract class class478 {

	@ObfuscatedName("qs.u")
	public final class547 field5050 = new class547();

	@ObfuscatedName("qs.j")
	public long field5047 = 855059529796087651L;

	@ObfuscatedName("qs.a")
	public long field5048 = -4102018018079529601L;

	@ObfuscatedName("qs.s")
	public int field5049 = 498920713;

	@ObfuscatedName("qs.c")
	public int field5046 = 488115863;

	@ObfuscatedName("qs.u(I)V")
	public void method8371() {
		if (this.method8358()) {
			class792 var1 = null;
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			Iterator var5 = this.field5050.iterator();
			label102: while (true) {
				while (true) {
					if (!var5.hasNext()) {
						break label102;
					}
					class809 var6 = (class809) var5.next();
					if (var1 != null && var1.field9467.field9626 * 803401371 - var2 >= 252 - (this.method8355() + 6)) {
						break label102;
					}
					var6.method6979();
					int var7 = var6.method15183();
					if (var7 < -1) {
						var7 = -1;
					} else if (var7 > 65534) {
						var7 = 65534;
					}
					int var8 = var6.method15182();
					if (var8 < -1) {
						var8 = -1;
					} else if (var8 > 65534) {
						var8 = 65534;
					}
					if (this.field5049 * -1202499897 == var8 && this.field5046 * 2146938585 == var7) {
						var6.method15186();
					} else {
						if (var1 == null) {
							var1 = this.method8375();
							var1.field9467.method15308(0);
							var2 = var1.field9467.field9626 * 803401371;
							var1.field9467.field9626 += 798527270;
							var3 = 0;
							var4 = 0;
						}
						int var9;
						int var10;
						int var11;
						if (this.field5048 * -136983794581478015L == -1L) {
							var9 = var8;
							var10 = var7;
							var11 = Integer.MAX_VALUE;
						} else {
							var9 = var8 - this.field5049 * -1202499897;
							var10 = var7 - this.field5046 * 2146938585;
							var11 = (int) ((var6.method15185() - this.field5048 * -136983794581478015L) / 20L);
							var3 = (int) ((long) var3 + (var6.method15185() - this.field5048 * -136983794581478015L) % 20L);
						}
						this.field5049 = var8 * -498920713;
						this.field5046 = var7 * -488115863;
						if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
							var9 += 32;
							var10 += 32;
							var1.field9467.method15287((var9 << 6) + (var11 << 12) + var10);
						} else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
							var9 += 128;
							var10 += 128;
							var1.field9467.method15308(var11 + 128);
							var1.field9467.method15287((var9 << 8) + var10);
						} else if (var11 < 32) {
							var1.field9467.method15308(var11 + 192);
							if (var8 == -1 || var7 == -1) {
								var1.field9467.method15223(Integer.MIN_VALUE);
							} else {
								var1.field9467.method15223(var8 | var7 << 16);
							}
						} else {
							var1.field9467.method15287((var11 & 0x1FFF) + 57344);
							if (var8 == -1 || var7 == -1) {
								var1.field9467.method15223(Integer.MIN_VALUE);
							} else {
								var1.field9467.method15223(var8 | var7 << 16);
							}
						}
						var4++;
						this.method8356(var1.field9467, var6);
						this.field5048 = var6.method15185() * 4102018018079529601L;
						var6.method15186();
					}
				}
			}
			if (var1 != null) {
				var1.field9467.method15251(var1.field9467.field9626 * 803401371 - var2);
				int var12 = var1.field9467.field9626 * 803401371;
				var1.field9467.field9626 = var2 * -1748220013;
				var1.field9467.method15308(var3 / var4);
				var1.field9467.method15308(var3 % var4);
				var1.field9467.field9626 = var12 * -1748220013;
				client.field8975.method1913(var1);
			}
		}
		this.method8357();
	}

	@ObfuscatedName("qs.j(B)V")
	public void method8350() {
		this.field5050.method11557();
		this.field5047 = 855059529796087651L;
		this.field5048 = -4102018018079529601L;
		this.field5049 = 498920713;
		this.field5046 = 488115863;
	}

	@ObfuscatedName("qs.a(Ladv;B)V")
	public void method8370(class809 arg0) {
		this.field5050.method11558(arg0);
	}

	@ObfuscatedName("qs.s(Ladv;IB)I")
	public int method8354(class809 arg0, int arg1) {
		long var3;
		if (this.field5047 * -3621070279918357067L == -1L) {
			var3 = arg1;
		} else {
			var3 = arg0.method15185() - this.field5047 * -3621070279918357067L;
			if (var3 > (long) arg1) {
				var3 = arg1;
			}
		}
		this.field5047 = arg0.method15185() * -855059529796087651L;
		return (int) var3;
	}

	@ObfuscatedName("qs.c(I)I")
	public abstract int method8355();

	@ObfuscatedName("qs.m(Laet;Ladv;B)V")
	public abstract void method8356(class814 arg0, class809 arg1);

	@ObfuscatedName("qs.t(B)V")
	public abstract void method8357();

	@ObfuscatedName("qs.l(I)Z")
	public abstract boolean method8358();

	@ObfuscatedName("qs.f(I)Lada;")
	public abstract class792 method8375();
}
