package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("kh")
public class class305 implements Runnable {

	@ObfuscatedName("kh.u")
	public volatile boolean field3353;

	@ObfuscatedName("kh.j")
	public boolean field3348;

	@ObfuscatedName("kh.a")
	public class310 field3349 = new class306();

	@ObfuscatedName("kh.s")
	public class310 field3350 = null;

	@ObfuscatedName("kh.c")
	public long field3347;

	@ObfuscatedName("kh.m")
	public int field3352;

	@ObfuscatedName("kh.t")
	public long field3351;

	@ObfuscatedName("kh.l")
	public String field3354;

	@ObfuscatedName("kh.f")
	public int field3355;

	@ObfuscatedName("kh.d")
	public LoadingStage field3356;

	@ObfuscatedName("kh.u(B)I")
	public int method4952() {
		return this.field3352;
	}

	@ObfuscatedName("kh.j(B)V")
	public synchronized void method4969() {
		this.field3348 = true;
	}

	@ObfuscatedName("kh.a(B)Z")
	public synchronized boolean method4954() {
		return this.field3349.method4988(this.field3347);
	}

	@ObfuscatedName("kh.s(Lkv;B)V")
	public synchronized void method4973(class310 arg0) {
		this.field3350 = this.field3349;
		this.field3349 = arg0;
		this.field3347 = class153.method5554();
	}

	@ObfuscatedName("kh.c(JLjava/lang/String;ILky;I)V")
	public synchronized void method4956(long arg0, String arg1, int arg2, LoadingStage arg3) {
		this.field3351 = arg0;
		this.field3354 = arg1;
		this.field3355 = arg2;
		this.field3356 = arg3;
	}

	@ObfuscatedName("kh.m(B)I")
	public int method4957() {
		if (this.field3356 == null) {
			return 0;
		}
		int var1 = this.field3356.field3404;
		if (this.field3356.field3406 && this.field3355 < this.field3356.field3398) {
			return this.field3355 + 1;
		} else if (var1 >= 0 && var1 < Statics.field3420.length - 1) {
			return this.field3356.field3410 == this.field3355 ? this.field3356.field3398 : this.field3356.field3410;
		} else {
			return 100;
		}
	}

	@ObfuscatedName("kh.t(I)I")
	public int method4974() {
		return this.field3355;
	}

	@ObfuscatedName("kh.l(I)Ljava/lang/String;")
	public String method4959() {
		return this.field3354;
	}

	@ObfuscatedName("kh.f(S)J")
	public long method4955() {
		return this.field3351;
	}

	@ObfuscatedName("kh.d(I)Lky;")
	public LoadingStage method4960() {
		return this.field3356;
	}

	@ObfuscatedName("kh.n(I)V")
	public void method4975() {
		this.field3353 = true;
	}

	public void run() {
		while (!this.field3353) {
			long var1 = class153.method5554();
			synchronized (this) {
				try {
					this.field3352++;
					if (this.field3349 instanceof class306) {
						this.field3349.method4982(this.field3348);
					} else {
						long var4 = class153.method5554();
						if (Statics.toolkit == null || this.field3350 == null || this.field3350.method4983() == 0 || this.field3347 < var4 - (long) this.field3350.method4983()) {
							if (this.field3350 != null) {
								this.field3348 = true;
								this.field3350.method4985();
								this.field3350 = null;
							}
							if (this.field3348) {
								client.method3536();
								if (Statics.toolkit != null) {
									Statics.toolkit.method505(1, 0);
								}
							}
							this.field3349.method4982(this.field3348 || Statics.toolkit != null && Statics.toolkit.method447());
						} else {
							int var6 = (int) ((var4 - this.field3347) * 255L / (long) this.field3350.method4983());
							int var7 = 255 - var6;
							int var8 = var6 << 24 | 0xFFFFFF;
							int var9 = var7 << 24 | 0xFFFFFF;
							client.method3536();
							Statics.toolkit.method505(1, 0);
							class118 var10 = Statics.toolkit.method777(Statics.field4125, Statics.field4677, true);
							class674 var11 = Statics.toolkit.method467();
							var11.method1206(0, var10.method1049());
							Statics.toolkit.method464(var11);
							this.field3350.method4982(true);
							Statics.toolkit.method696(var11);
							var10.method1054(0, 0, 0, var9, 1);
							Statics.toolkit.method464(var11);
							Statics.toolkit.method505(1, 0);
							this.field3349.method4982(true);
							Statics.toolkit.method696(var11);
							var10.method1054(0, 0, 0, var8, 1);
						}
						try {
							if (Statics.toolkit != null && !(this.field3349 instanceof class306)) {
								Statics.toolkit.method466();
							}
						} catch (class881 var18) {
							JagException.report(var18.getMessage() + Statics.field1543.method6701(), var18);
							Statics.method5600(0, true);
						}
					}
					this.field3348 = false;
					if (Statics.toolkit != null && !(this.field3349 instanceof class306) && this.field3356.field3404 < LoadingStage.field3401.field3404) {
						client.method13896();
					}
				} catch (Exception var19) {
					continue;
				}
			}
			long var15 = class153.method5554();
			int var17 = (int) (20L - (var15 - var1));
			if (var17 > 0) {
				class154.method7052((long) var17);
			}
		}
	}
}
