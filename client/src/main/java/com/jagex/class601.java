package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vi")
public class class601 {

	@ObfuscatedName("vi.u")
	public final class334 field7172;

	@ObfuscatedName("vi.j")
	public int field7171;

	@ObfuscatedName("vi.a")
	public class956[] field7170;

	public class601(class527 arg0, class519 arg1, class334 arg2, boolean arg3) {
		this.field7172 = arg2;
		this.field7171 = this.field7172.method5637(class161.field1651.field1668);
		if (arg3) {
			this.field7170 = new class956[this.field7171];
			for (int var5 = 0; var5 < this.field7171; var5++) {
				class334 var6 = this.field7172;
				byte[] var7;
				synchronized (this.field7172) {
					var7 = this.field7172.method5627(class161.field1651.field1668, var5);
				}
				class956 var9 = new class956();
				if (var7 != null) {
					var9.method16778(new class814(var7));
				}
				this.field7170[var5] = var9;
			}
		}
	}

	@ObfuscatedName("vi.u(II)Laju;")
	public class956 method12383(int arg0) {
		return arg0 < 0 ? new class956() : this.field7170[arg0];
	}
}
