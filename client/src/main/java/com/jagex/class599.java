package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vv")
public class class599 {

	@ObfuscatedName("vv.u")
	public class600 field7162;

	@ObfuscatedName("vv.j")
	public int field7164;

	@ObfuscatedName("vv.a")
	public int field7163;

	@ObfuscatedName("vv.s")
	public int field7165;

	@ObfuscatedName("vv.u(Laet;I)V")
	public void method12367(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method12362(arg0, var2);
		}
	}

	@ObfuscatedName("vv.j(Laet;IB)V")
	public void method12362(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field7164 = arg0.gSmart2or4null();
		} else if (arg1 == 2) {
			this.field7163 = arg0.g1();
			this.field7165 = arg0.g1();
		}
	}

	@ObfuscatedName("vv.a(B)Lds;")
	public synchronized class140 method12363() {
		class140 var1 = (class140) this.field7162.field7168.method7916((long) this.field7164);
		if (var1 != null) {
			return var1;
		}
		class140 var2 = class125.method2590(this.field7162.field7167, this.field7164, 0);
		if (var2 != null) {
			this.field7162.field7168.method7937(var2, (long) this.field7164);
		}
		return var2;
	}
}
