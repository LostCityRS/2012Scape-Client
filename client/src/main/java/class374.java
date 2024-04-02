
import deob.ObfuscatedName;
import java.awt.Component;
import java.util.Arrays;

@ObfuscatedName("mg")
public class class374 {

	@ObfuscatedName("mg.u")
	public static boolean field4041 = false;

	@ObfuscatedName("mg.l")
	public int[] field4042;

	@ObfuscatedName("mg.f")
	public boolean field4035 = false;

	@ObfuscatedName("mg.d")
	public class793 field4023;

	@ObfuscatedName("mg.z")
	public int field4026 = 32;

	@ObfuscatedName("mg.n")
	public long field4025 = MonotonicTime.method5554();

	@ObfuscatedName("mg.o")
	public int field4014;

	@ObfuscatedName("mg.q")
	public int field4020;

	@ObfuscatedName("mg.p")
	public int field4024;

	@ObfuscatedName("mg.w")
	public long field4029 = 0L;

	@ObfuscatedName("mg.b")
	public int field4030 = 0;

	@ObfuscatedName("mg.x")
	public int field4031 = 0;

	@ObfuscatedName("mg.i")
	public int field4032 = 0;

	@ObfuscatedName("mg.v")
	public long field4033 = 0L;

	@ObfuscatedName("mg.k")
	public boolean field4034 = true;

	@ObfuscatedName("mg.ay")
	public int field4040 = 0;

	@ObfuscatedName("mg.af")
	public class793[] field4018 = new class793[8];

	@ObfuscatedName("mg.ar")
	public class793[] field4022 = new class793[8];

	@ObfuscatedName("mg.u(IZI)V")
	public static final void method6512(int arg0, boolean arg1, int arg2) {
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		Statics.field4015 = arg0;
		Statics.field4016 = arg1;
		Statics.field4017 = arg2;
	}

	@ObfuscatedName("mg.j(Ljava/awt/Component;II)Lmg;")
	public static final class374 method6494(Component arg0, int arg1, int arg2) {
		if (Statics.field4015 == 0) {
			throw new IllegalStateException();
		} else if (arg1 >= 0 && arg1 < 2) {
			int var3 = arg2;
			if (arg2 < 256) {
				var3 = 256;
			}
			if (!field4041) {
				try {
					class760 var4 = new class760();
					var4.field4042 = new int[(Statics.field4016 ? 2 : 1) * 256];
					var4.field4020 = var3;
					var4.method6505(arg0);
					var4.field4014 = (var3 & 0xFFFFFC00) + 1024;
					if (var4.field4014 > 16384) {
						var4.field4014 = 16384;
					}
					var4.method6538(var4.field4014);
					if (Statics.field4017 > 0 && Statics.field4027 == null) {
						Statics.field4027 = new class638();
						Thread var5 = new Thread(Statics.field4027);
						var5.setDaemon(true);
						var5.start();
						var5.setPriority(Statics.field4017);
					}
					if (Statics.field4027 != null) {
						if (Statics.field4027.field4010[arg1] != null) {
							throw new IllegalArgumentException();
						}
						Statics.field4027.field4010[arg1] = var4;
					}
					return var4;
				} catch (Throwable var7) {
				}
			}
			return new class374();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("mg.a(Ladc;)V")
	public final synchronized void method6521(class793 arg0) {
		this.field4023 = arg0;
	}

	@ObfuscatedName("mg.s()V")
	public final synchronized void method6496() {
		if (this.field4035) {
			return;
		}
		long var1 = MonotonicTime.method5554();
		try {
			if (var1 > this.field4025 + 6000L) {
				this.field4025 = var1 - 6000L;
			}
			while (var1 > this.field4025 + 5000L) {
				this.method6501(256);
				this.field4025 += 256000 / Statics.field4015;
				var1 = MonotonicTime.method5554();
			}
		} catch (Exception var8) {
			this.field4025 = var1;
		}
		if (this.field4042 == null) {
			return;
		}
		try {
			if (this.field4029 != 0L) {
				if (var1 < this.field4029) {
					return;
				}
				this.method6538(this.field4014);
				this.field4029 = 0L;
				this.field4034 = true;
			}
			int var4 = this.method6495();
			if (this.field4032 - var4 > this.field4030) {
				this.field4030 = this.field4032 - var4;
			}
			int var5 = this.field4024 + this.field4020;
			if (var5 + 256 > 16384) {
				var5 = 16128;
			}
			if (var5 + 256 > this.field4014) {
				this.field4014 += 1024;
				if (this.field4014 > 16384) {
					this.field4014 = 16384;
				}
				this.method6509(false);
				this.method6538(this.field4014);
				var4 = 0;
				this.field4034 = true;
				if (var5 + 256 > this.field4014) {
					var5 = this.field4014 - 256;
					this.field4024 = var5 - this.field4020;
				}
			}
			while (var4 < var5) {
				this.method6502(this.field4042, 256);
				this.method6547();
				var4 += 256;
			}
			if (var1 > this.field4033) {
				if (this.field4034) {
					this.field4034 = false;
				} else if (this.field4030 == 0 && this.field4031 == 0) {
					this.method6509(false);
					this.field4029 = var1 + 2000L;
					return;
				} else {
					this.field4024 = Math.min(this.field4031, this.field4030);
					this.field4031 = this.field4030;
				}
				this.field4030 = 0;
				this.field4033 = var1 + 2000L;
			}
			this.field4032 = var4;
		} catch (Exception var7) {
			this.method6509(false);
			this.field4029 = var1 + 2000L;
		}
	}

	@ObfuscatedName("mg.c()V")
	public final synchronized void method6497() {
		this.field4034 = true;
		try {
			this.method6510();
		} catch (Exception var2) {
			this.method6509(false);
			this.field4029 = MonotonicTime.method5554() + 2000L;
		}
	}

	@ObfuscatedName("mg.m()V")
	public final synchronized void method6498() {
		this.method6499(false);
		this.method6509(true);
		this.field4042 = null;
		this.field4035 = true;
	}

	@ObfuscatedName("mg.t(Z)V")
	public final synchronized void method6499(boolean arg0) {
		if (Statics.field4027 == null) {
			return;
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < 2; var3++) {
			if (arg0 || Statics.field4027.field4010[var3] == this) {
				Statics.field4027.field4010[var3] = null;
			}
			if (Statics.field4027.field4010[var3] != null) {
				var2 = false;
			}
		}
		if (!var2) {
			return;
		}
		Statics.field4027.field4008 = true;
		while (Statics.field4027.field4009) {
			PreciseSleep.method7052(50L);
		}
		Statics.field4027 = null;
	}

	@ObfuscatedName("mg.l()V")
	public void method6530() {
		this.method6499(true);
		this.field4042 = null;
		this.field4035 = true;
		field4041 = true;
	}

	@ObfuscatedName("mg.f(I)V")
	public final void method6501(int arg0) {
		this.field4040 -= arg0;
		if (this.field4040 < 0) {
			this.field4040 = 0;
		}
		if (this.field4023 != null) {
			this.field4023.method15046(arg0);
		}
	}

	@ObfuscatedName("mg.d([II)V")
	public final void method6502(int[] arg0, int arg1) {
		int var3 = arg1;
		if (Statics.field4016) {
			var3 = arg1 << 1;
		}
		Arrays.fill(arg0, 0, var3, 0);
		this.field4040 -= arg1;
		if (this.field4023 != null && this.field4040 <= 0) {
			this.field4040 += Statics.field4015 >> 4;
			method6513(this.field4023);
			this.method6504(this.field4023, this.field4023.method15049());
			int var4 = 0;
			int var5 = 255;
			int var6 = 7;
			label105: while (var5 != 0) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 0x3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}
				for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
					if ((var9 & 0x1) != 0) {
						var5 &= ~(0x1 << var7);
						class793 var10 = null;
						class793 var11 = this.field4018[var7];
						label99: while (true) {
							while (true) {
								if (var11 == null) {
									break label99;
								}
								class795 var12 = var11.field9474;
								if (var12 == null || var12.field9477 <= var8) {
									var11.field9472 = true;
									int var13 = var11.method15035();
									var4 += var13;
									if (var12 != null) {
										var12.field9477 += var13;
									}
									if (var4 >= this.field4026) {
										break label105;
									}
									class793 var14 = var11.method15031();
									if (var14 != null) {
										int var15 = var11.field9475;
										while (var14 != null) {
											this.method6504(var14, var15 * var14.method15049() >> 8);
											var14 = var11.method15032();
										}
									}
									class793 var16 = var11.field9473;
									var11.field9473 = null;
									if (var10 == null) {
										this.field4018[var7] = var16;
									} else {
										var10.field9473 = var16;
									}
									if (var16 == null) {
										this.field4022[var7] = var10;
									}
									var11 = var16;
								} else {
									var5 |= 0x1 << var7;
									var10 = var11;
									var11 = var11.field9473;
								}
							}
						}
					}
					var7 += 4;
					var8++;
				}
				var6--;
			}
			for (int var17 = 0; var17 < 8; var17++) {
				class793 var18 = this.field4018[var17];
				class793[] var19 = this.field4018;
				this.field4022[var17] = null;
				var19[var17] = null;
				while (var18 != null) {
					class793 var21 = var18.field9473;
					var18.field9473 = null;
					var18 = var21;
				}
			}
		}
		if (this.field4040 < 0) {
			this.field4040 = 0;
		}
		if (this.field4023 != null) {
			this.field4023.method15034(arg0, 0, arg1);
		}
		this.field4025 = MonotonicTime.method5554();
	}

	@ObfuscatedName("mg.z(Ladc;)V")
	public static final void method6513(class793 arg0) {
		arg0.field9472 = false;
		if (arg0.field9474 != null) {
			arg0.field9474.field9477 = 0;
		}
		for (class793 var1 = arg0.method15031(); var1 != null; var1 = arg0.method15032()) {
			method6513(var1);
		}
	}

	@ObfuscatedName("mg.n(Ladc;I)V")
	public final void method6504(class793 arg0, int arg1) {
		int var3 = arg1 >> 5;
		class793 var4 = this.field4022[var3];
		if (var4 == null) {
			this.field4018[var3] = arg0;
		} else {
			var4.field9473 = arg0;
		}
		this.field4022[var3] = arg0;
		arg0.field9475 = arg1;
	}

	@ObfuscatedName("mg.o(Ljava/awt/Component;)V")
	public void method6505(Component arg0) throws Exception {
	}

	@ObfuscatedName("mg.q(I)V")
	public void method6538(int arg0) throws Exception {
	}

	@ObfuscatedName("mg.p()I")
	public int method6495() throws Exception {
		return this.field4014;
	}

	@ObfuscatedName("mg.w()V")
	public void method6547() throws Exception {
	}

	@ObfuscatedName("mg.b(Z)V")
	public void method6509(boolean arg0) {
	}

	@ObfuscatedName("mg.x()V")
	public void method6510() throws Exception {
	}
}
