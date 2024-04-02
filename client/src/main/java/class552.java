
import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("tv")
public class class552 implements Iterable {

	@ObfuscatedName("tv.u")
	public class800 field6662 = new class800();

	@ObfuscatedName("tv.j")
	public class800 field6663;

	public class552() {
		this.field6662.field9552 = this.field6662;
		this.field6662.field9553 = this.field6662;
	}

	@ObfuscatedName("tv.u(I)V")
	public void method11733() {
		while (this.field6662.field9552 != this.field6662) {
			this.field6662.field9552.method15142();
		}
	}

	@ObfuscatedName("tv.j(Ladi;I)V")
	public void method11728(class800 arg0) {
		if (arg0.field9553 != null) {
			arg0.method15142();
		}
		arg0.field9553 = this.field6662.field9553;
		arg0.field9552 = this.field6662;
		arg0.field9553.field9552 = arg0;
		arg0.field9552.field9553 = arg0;
	}

	@ObfuscatedName("rs.a(Ladi;Ladi;I)V")
	public static void method8542(class800 arg0, class800 arg1) {
		if (arg0.field9553 != null) {
			arg0.method15142();
		}
		arg0.field9553 = arg1.field9553;
		arg0.field9552 = arg1;
		arg0.field9553.field9552 = arg0;
		arg0.field9552.field9553 = arg0;
	}

	@ObfuscatedName("cr.s(Ladi;Ladi;B)V")
	public static void method2355(class800 arg0, class800 arg1) {
		if (arg0.field9553 != null) {
			arg0.method15142();
		}
		arg0.field9553 = arg1;
		arg0.field9552 = arg1.field9552;
		arg0.field9553.field9552 = arg0;
		arg0.field9552.field9553 = arg0;
	}

	@ObfuscatedName("tv.c(I)Ladi;")
	public class800 method11729() {
		class800 var1 = this.field6662.field9552;
		if (this.field6662 == var1) {
			return null;
		} else {
			var1.method15142();
			return var1;
		}
	}

	@ObfuscatedName("tv.m(I)Ladi;")
	public class800 method11756() {
		return this.method11731(null);
	}

	@ObfuscatedName("tv.t(Ladi;I)Ladi;")
	public class800 method11731(class800 arg0) {
		class800 var2;
		if (arg0 == null) {
			var2 = this.field6662.field9552;
		} else {
			var2 = arg0;
		}
		if (this.field6662 == var2) {
			this.field6663 = null;
			return null;
		} else {
			this.field6663 = var2.field9552;
			return var2;
		}
	}

	@ObfuscatedName("tv.l(I)Ladi;")
	public class800 method11744() {
		class800 var1 = this.field6663;
		if (this.field6662 == var1) {
			this.field6663 = null;
			return null;
		} else {
			this.field6663 = var1.field9552;
			return var1;
		}
	}

	@ObfuscatedName("tv.f(I)I")
	public int method11732() {
		int var1 = 0;
		for (class800 var2 = this.field6662.field9552; var2 != this.field6662; var2 = var2.field9552) {
			var1++;
		}
		return var1;
	}

	public Iterator iterator() {
		return new class551(this);
	}
}
