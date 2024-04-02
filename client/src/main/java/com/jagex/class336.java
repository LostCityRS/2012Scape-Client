package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ly")
public class class336 implements Runnable {

	@ObfuscatedName("ly.u")
	public class552 field3588 = new class552();

	@ObfuscatedName("ly.j")
	public int field3587 = 0;

	@ObfuscatedName("ly.a")
	public boolean field3589 = false;

	@ObfuscatedName("ly.s")
	public Thread field3586 = new Thread(this);

	public class336() {
		this.field3586.setDaemon(true);
		this.field3586.start();
		this.field3586.setPriority(1);
	}

	@ObfuscatedName("ly.u(ILon;I)Lalx;")
	public class1002 method5730(int arg0, class410 arg1) {
		class1002 var3 = new class1002();
		var3.field10593 = -2048699793;
		class552 var4 = this.field3588;
		synchronized (this.field3588) {
			class1002 var5 = (class1002) this.field3588.method11756();
			while (true) {
				if (var5 == null) {
					break;
				}
				if (var5.field9554 * 4148779780871537789L == (long) arg0 && var5.field10595 == arg1 && var5.field10593 * 892619919 == 2) {
					var3.field10597 = var5.field10597;
					var3.field10352 = false;
					return var3;
				}
				var5 = (class1002) this.field3588.method11744();
			}
		}
		var3.field10597 = arg1.method7168(arg0);
		var3.field10352 = false;
		var3.field10354 = true;
		return var3;
	}

	@ObfuscatedName("ly.j(I[BLon;I)Lalx;")
	public class1002 method5720(int arg0, byte[] arg1, class410 arg2) {
		class1002 var4 = new class1002();
		var4.field10593 = 197567710;
		var4.field9554 = (long) arg0 * -3315322578331577131L;
		var4.field10597 = arg1;
		var4.field10595 = arg2;
		var4.field10354 = false;
		this.method5722(var4);
		return var4;
	}

	@ObfuscatedName("ly.a(ILon;B)Lalx;")
	public class1002 method5721(int arg0, class410 arg1) {
		class1002 var3 = new class1002();
		var3.field10593 = -1851132083;
		var3.field9554 = (long) arg0 * -3315322578331577131L;
		var3.field10595 = arg1;
		var3.field10354 = false;
		this.method5722(var3);
		return var3;
	}

	@ObfuscatedName("ly.s(Lalx;I)V")
	public void method5722(class1002 arg0) {
		class552 var2 = this.field3588;
		synchronized (this.field3588) {
			this.field3588.method11728(arg0);
			this.field3587 += -933743647;
			this.field3588.notifyAll();
		}
	}

	public void run() {
		while (!this.field3589) {
			class552 var1 = this.field3588;
			class1002 var2;
			synchronized (this.field3588) {
				var2 = (class1002) this.field3588.method11729();
				if (var2 == null) {
					try {
						this.field3588.wait();
					} catch (InterruptedException var7) {
					}
					continue;
				}
				this.field3587 -= -933743647;
			}
			try {
				if (var2.field10593 * 892619919 == 2) {
					var2.field10595.method7169((int) (var2.field9554 * 4148779780871537789L), var2.field10597, var2.field10597.length);
				} else if (var2.field10593 * 892619919 == 3) {
					var2.field10597 = var2.field10595.method7168((int) (var2.field9554 * 4148779780871537789L));
				}
			} catch (Exception var6) {
				class983.method16252(null, var6);
			}
			var2.field10352 = false;
		}
	}

	@ObfuscatedName("ly.c(I)V")
	public void method5723() {
		this.field3589 = true;
		class552 var1 = this.field3588;
		synchronized (this.field3588) {
			this.field3588.notifyAll();
		}
		try {
			this.field3586.join();
		} catch (InterruptedException var4) {
		}
		this.field3586 = null;
	}
}
