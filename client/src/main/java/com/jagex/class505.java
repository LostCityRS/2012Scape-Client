package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rq")
public class class505 {

	@ObfuscatedName("rq.u")
	public final class453 field5241;

	@ObfuscatedName("rq.j")
	public final int field5242;

	public class505(class453 arg0, int arg1) {
		this.field5241 = arg0;
		this.field5242 = arg1;
	}

	@ObfuscatedName("rq.u(I)Lali;")
	public class1008 method11076() {
		class774 var1 = (class774) client.field9088.method11923((long) (this.field5241.field4837 << 28 | this.field5241.field4838 << 14 | this.field5241.field4836));
		if (var1 == null) {
			return null;
		}
		class453 var2 = client.field8980.method6214();
		int var3 = this.field5241.field4836 - var2.field4836;
		int var4 = this.field5241.field4838 - var2.field4838;
		if (var3 >= 0 && var4 >= 0 && var3 < client.field8980.method6220() && var4 < client.field8980.method6193()) {
			for (class773 var5 = (class773) var1.field9313.method11563(); var5 != null; var5 = (class773) var1.field9313.method11567()) {
				if (this.field5242 == var5.field9311) {
					return (class1008) client.field8980.method6098().method7436(this.field5241.field4837, var3, var4);
				}
			}
		}
		return null;
	}
}
