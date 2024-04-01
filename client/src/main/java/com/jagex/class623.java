package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("wo")
public class class623 implements class463 {

	@ObfuscatedName("wo.u")
	public final class334 field7325;

	@ObfuscatedName("wo.j")
	public final class451 field7326 = new class451(64);

	public class623(class527 arg0, class519 arg1, class334 arg2) {
		this.field7325 = arg2;
		this.field7325.method5637(class161.field1676.field1668);
	}

	@ObfuscatedName("wo.u(II)Laez;")
	public class833 method12644(int arg0) {
		class451 var2 = this.field7326;
		class833 var3;
		synchronized (this.field7326) {
			var3 = (class833) this.field7326.method7916((long) arg0);
		}
		if (var3 != null) {
			return var3;
		}
		class334 var5 = this.field7325;
		byte[] var6;
		synchronized (this.field7325) {
			var6 = this.field7325.method5627(class161.field1676.field1668, arg0);
		}
		class833 var8 = new class833();
		if (var6 != null) {
			var8.method15624(new class814(var6));
		}
		class451 var9 = this.field7326;
		synchronized (this.field7326) {
			this.field7326.method7937(var8, (long) arg0);
			return var8;
		}
	}
}
