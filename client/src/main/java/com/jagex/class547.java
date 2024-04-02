package com.jagex;

import deob.ObfuscatedName;
import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("tq")
public class class547 implements Iterable, Collection {

	@ObfuscatedName("tq.u")
	public class399 field6647 = new class399();

	@ObfuscatedName("tq.j")
	public class399 field6646;

	public class547() {
		this.field6647.field4226 = this.field6647;
		this.field6647.field4227 = this.field6647;
	}

	@ObfuscatedName("tq.u(S)V")
	public void method11557() {
		while (this.field6647.field4226 != this.field6647) {
			this.field6647.field4226.method6979();
		}
	}

	@ObfuscatedName("tq.j(Lnz;I)V")
	public void method11558(class399 arg0) {
		if (arg0.field4227 != null) {
			arg0.method6979();
		}
		arg0.field4227 = this.field6647.field4227;
		arg0.field4226 = this.field6647;
		arg0.field4227.field4226 = arg0;
		arg0.field4226.field4227 = arg0;
	}

	@ObfuscatedName("tq.a(Lnz;I)V")
	public void method11559(class399 arg0) {
		if (arg0.field4227 != null) {
			arg0.method6979();
		}
		arg0.field4227 = this.field6647;
		arg0.field4226 = this.field6647.field4226;
		arg0.field4227.field4226 = arg0;
		arg0.field4226.field4227 = arg0;
	}

	@ObfuscatedName("cu.s(Lnz;Lnz;I)V")
	public static void method2546(class399 arg0, class399 arg1) {
		if (arg0.field4227 != null) {
			arg0.method6979();
		}
		arg0.field4227 = arg1.field4227;
		arg0.field4226 = arg1;
		arg0.field4227.field4226 = arg0;
		arg0.field4226.field4227 = arg0;
	}

	@ObfuscatedName("tq.c(I)Lnz;")
	public class399 method11560() {
		class399 var1 = this.field6647.field4226;
		if (this.field6647 == var1) {
			return null;
		} else {
			var1.method6979();
			return var1;
		}
	}

	@ObfuscatedName("tq.m(Ltq;Lnz;I)V")
	public void method11599(class547 arg0, class399 arg1) {
		class399 var3 = this.field6647.field4227;
		this.field6647.field4227 = arg1.field4227;
		arg1.field4227.field4226 = this.field6647;
		if (this.field6647 != arg1) {
			arg1.field4227 = arg0.field6647.field4227;
			arg1.field4227.field4226 = arg1;
			var3.field4226 = arg0.field6647;
			arg0.field6647.field4227 = var3;
		}
	}

	@ObfuscatedName("tq.t(Ltq;B)V")
	public void method11601(class547 arg0) {
		if (this.field6647.field4226 != this.field6647) {
			this.method11599(arg0, this.field6647.field4226);
		}
	}

	@ObfuscatedName("tq.l(I)Lnz;")
	public class399 method11563() {
		return this.method11564(null);
	}

	@ObfuscatedName("tq.f(Lnz;B)Lnz;")
	public class399 method11564(class399 arg0) {
		class399 var2;
		if (arg0 == null) {
			var2 = this.field6647.field4226;
		} else {
			var2 = arg0;
		}
		if (this.field6647 == var2) {
			this.field6646 = null;
			return null;
		} else {
			this.field6646 = var2.field4226;
			return var2;
		}
	}

	@ObfuscatedName("tq.d(I)Lnz;")
	public class399 method11565() {
		return this.method11566(null);
	}

	@ObfuscatedName("tq.z(Lnz;I)Lnz;")
	public class399 method11566(class399 arg0) {
		class399 var2;
		if (arg0 == null) {
			var2 = this.field6647.field4227;
		} else {
			var2 = arg0;
		}
		if (this.field6647 == var2) {
			this.field6646 = null;
			return null;
		} else {
			this.field6646 = var2.field4227;
			return var2;
		}
	}

	@ObfuscatedName("tq.n(I)Lnz;")
	public class399 method11567() {
		class399 var1 = this.field6646;
		if (this.field6647 == var1) {
			this.field6646 = null;
			return null;
		} else {
			this.field6646 = var1.field4226;
			return var1;
		}
	}

	@ObfuscatedName("tq.o(I)Lnz;")
	public class399 method11568() {
		class399 var1 = this.field6646;
		if (this.field6647 == var1) {
			this.field6646 = null;
			return null;
		} else {
			this.field6646 = var1.field4227;
			return var1;
		}
	}

	@ObfuscatedName("tq.q(I)I")
	public int method11613() {
		int var1 = 0;
		for (class399 var2 = this.field6647.field4226; var2 != this.field6647; var2 = var2.field4226) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("tq.p(B)Z")
	public boolean method11585() {
		return this.field6647.field4226 == this.field6647;
	}

	@ObfuscatedName("tq.w(B)[Lnz;")
	public class399[] method11571() {
		class399[] var1 = new class399[this.method11613()];
		int var2 = 0;
		for (class399 var3 = this.field6647.field4226; var3 != this.field6647; var3 = var3.field4226) {
			var1[var2++] = var3;
		}
		return var1;
	}

	public Iterator iterator() {
		return new class550(this);
	}

	public int size() {
		return this.method11613();
	}

	public boolean isEmpty() {
		return this.method11585();
	}

	public boolean contains(Object arg0) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method11571();
	}

	public Object[] toArray(Object[] arg0) {
		int var2 = 0;
		for (class399 var3 = this.field6647.field4226; var3 != this.field6647; var3 = var3.field4226) {
			arg0[var2++] = var3;
		}
		return arg0;
	}

	@ObfuscatedName("tq.b(Lnz;I)Z")
	public boolean method11575(class399 arg0) {
		this.method11558(arg0);
		return true;
	}

	public boolean remove(Object arg0) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection arg0) {
		throw new RuntimeException();
	}

	public void clear() {
		this.method11557();
	}

	public boolean add(Object arg0) {
		return this.method11575((class399) arg0);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	public int hashCode() {
		return super.hashCode();
	}
}
