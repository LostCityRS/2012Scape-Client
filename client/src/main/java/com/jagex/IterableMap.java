package com.jagex;

import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("uo")
public final class IterableMap implements Iterable {

	@ObfuscatedName("uo.u")
	public int field6722;

	@ObfuscatedName("uo.j")
	public class399[] field6725;

	@ObfuscatedName("uo.a")
	public long field6724;

	@ObfuscatedName("uo.s")
	public class399 field6727;

	@ObfuscatedName("uo.c")
	public class399 field6726;

	@ObfuscatedName("uo.m")
	public int field6723 = 0;

	public IterableMap(int arg0) {
		this.field6722 = arg0;
		this.field6725 = new class399[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class399 var3 = this.field6725[var2] = new class399();
			var3.field4226 = var3;
			var3.field4227 = var3;
		}
	}

	@ObfuscatedName("uo.u(J)Lnz;")
	public class399 method11923(long arg0) {
		this.field6724 = arg0;
		class399 var3 = this.field6725[(int) (arg0 & (long) (this.field6722 - 1))];
		for (this.field6727 = var3.field4226; this.field6727 != var3; this.field6727 = this.field6727.field4226) {
			if (this.field6727.field4228 == arg0) {
				class399 var4 = this.field6727;
				this.field6727 = this.field6727.field4226;
				return var4;
			}
		}
		this.field6727 = null;
		return null;
	}

	@ObfuscatedName("uo.j(I)Lnz;")
	public class399 method11924() {
		if (this.field6727 == null) {
			return null;
		}
		class399 var1 = this.field6725[(int) (this.field6724 & (long) (this.field6722 - 1))];
		while (this.field6727 != var1) {
			if (this.field6727.field4228 == this.field6724) {
				class399 var2 = this.field6727;
				this.field6727 = this.field6727.field4226;
				return var2;
			}
			this.field6727 = this.field6727.field4226;
		}
		this.field6727 = null;
		return null;
	}

	@ObfuscatedName("uo.a([Lnz;I)I")
	public int method11933(class399[] arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < this.field6722; var3++) {
			class399 var4 = this.field6725[var3];
			for (class399 var5 = var4.field4226; var5 != var4; var5 = var5.field4226) {
				arg0[var2++] = var5;
			}
		}
		return var2;
	}

	@ObfuscatedName("uo.s(B)I")
	public int method11926() {
		int var1 = 0;
		for (int var2 = 0; var2 < this.field6722; var2++) {
			class399 var3 = this.field6725[var2];
			for (class399 var4 = var3.field4226; var4 != var3; var4 = var4.field4226) {
				var1++;
			}
		}
		return var1;
	}

	@ObfuscatedName("uo.c(Lnz;J)V")
	public void pushNode(class399 arg0, long arg1) {
		if (arg0.field4227 != null) {
			arg0.method6979();
		}
		class399 var4 = this.field6725[(int) (arg1 & (long) (this.field6722 - 1))];
		arg0.field4227 = var4.field4227;
		arg0.field4226 = var4;
		arg0.field4227.field4226 = arg0;
		arg0.field4226.field4227 = arg0;
		arg0.field4228 = arg1;
	}

	@ObfuscatedName("uo.m(I)V")
	public void method11925() {
		for (int var1 = 0; var1 < this.field6722; var1++) {
			class399 var2 = this.field6725[var1];
			while (true) {
				class399 var3 = var2.field4226;
				if (var2 == var3) {
					break;
				}
				var3.method6979();
			}
		}
		this.field6727 = null;
		this.field6726 = null;
	}

	@ObfuscatedName("uo.t(B)Lnz;")
	public class399 method11928() {
		this.field6723 = 0;
		return this.method11929();
	}

	@ObfuscatedName("uo.l(B)Lnz;")
	public class399 method11929() {
		if (this.field6723 > 0 && this.field6725[this.field6723 - 1] != this.field6726) {
			class399 var1 = this.field6726;
			this.field6726 = var1.field4226;
			return var1;
		}
		class399 var2;
		do {
			if (this.field6723 >= this.field6722) {
				return null;
			}
			var2 = this.field6725[++this.field6723 - 1].field4226;
		} while (this.field6725[this.field6723 - 1] == var2);
		this.field6726 = var2.field4226;
		return var2;
	}

	public Iterator iterator() {
		return new class566(this);
	}
}
