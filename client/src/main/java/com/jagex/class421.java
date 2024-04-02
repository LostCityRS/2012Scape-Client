package com.jagex;

import deob.ObfuscatedName;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@ObfuscatedName("oy")
public class class421 {

	@ObfuscatedName("oy.u")
	public List field4471 = new LinkedList();

	@ObfuscatedName("oy.j")
	public boolean field4473 = false;

	@ObfuscatedName("oy.a")
	public int field4472 = 0;

	@ObfuscatedName("oy.s")
	public int field4470 = 0;

	public class421(boolean arg0) {
		this.field4473 = arg0;
	}

	@ObfuscatedName("oy.u(I)V")
	public void method7384() {
		Iterator var1 = this.field4471.iterator();
		while (var1.hasNext()) {
			class425 var2 = (class425) var1.next();
			var1.remove();
			class425.method2573(var2);
		}
	}

	@ObfuscatedName("oy.j(Loz;B)V")
	public void method7390(class425 arg0) {
		class836 var2 = arg0.field4563;
		boolean var3 = true;
		class142[] var4 = arg0.field4563.field9811;
		for (int var5 = 0; var5 < var4.length; var5++) {
			if (var4[var5].field1521) {
				var3 = false;
				break;
			}
		}
		if (var3) {
			return;
		}
		arg0.field4562 = this;
		if (this.field4473) {
			Iterator var6 = this.field4471.iterator();
			while (var6.hasNext()) {
				class425 var7 = (class425) var6.next();
				if (var7.field4563 == var2) {
					var6.remove();
					class425.method2573(var7);
				}
			}
		}
		ListIterator var8 = this.field4471.listIterator();
		class425 var9;
		do {
			if (!var8.hasNext()) {
				this.field4471.add(arg0);
				return;
			}
			var9 = (class425) var8.next();
		} while (var2.field9810 * -1722027899 < var9.field4563.field9810 * -1722027899);
		var8.previous();
		var8.add(arg0);
	}
}
