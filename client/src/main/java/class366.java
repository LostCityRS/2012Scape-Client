
import deob.ObfuscatedName;

@ObfuscatedName("mq")
public class class366 {

	@ObfuscatedName("mq.j")
	public final int field3927;

	@ObfuscatedName("mq.a")
	public int field3928;

	@ObfuscatedName("mq.s")
	public class367 field3929;

	@ObfuscatedName("mq.c")
	public class367[] field3946;

	@ObfuscatedName("mq.m")
	public class367[] field3931;

	@ObfuscatedName("mq.t")
	public int field3932;

	@ObfuscatedName("mq.l")
	public int field3933 = -1;

	@ObfuscatedName("mq.f")
	public final int field3934;

	@ObfuscatedName("mq.d")
	public final int field3926;

	@ObfuscatedName("mq.z")
	public final int field3936;

	@ObfuscatedName("mq.n")
	public Sprite field3937;

	@ObfuscatedName("mq.o")
	public class420 field3930;

	@ObfuscatedName("mq.q")
	public int field3941;

	@ObfuscatedName("mq.p")
	public int field3940;

	@ObfuscatedName("mq.w")
	public boolean field3938 = true;

	@ObfuscatedName("mq.i")
	public int field3942;

	@ObfuscatedName("mq.v")
	public Model field3943;

	@ObfuscatedName("mq.k")
	public byte[] field3944;

	@ObfuscatedName("mq.h")
	public boolean field3945;

	@ObfuscatedName("mq.r")
	public class366 field3935;

	@ObfuscatedName("mq.g")
	public int field3947;

	@ObfuscatedName("mq.y")
	public int field3939;

	@ObfuscatedName("mq.e")
	public int field3949;

	@ObfuscatedName("vq.u(Lls;Lma;B)V")
	public static void method12289(Js5 arg0, BillboardTypeList arg1) {
		Statics.field549 = arg0;
		Statics.field6785 = arg1;
	}

	@ObfuscatedName("dj.j(I)V")
	public static void method2612() {
		class367.method6406();
	}

	public class366(int arg0, class367[] arg1, int arg2, int arg3, int arg4, int arg5, class420 arg6, int arg7) {
		this.field3934 = arg3;
		this.field3926 = arg4;
		this.field3936 = arg5;
		this.field3927 = arg0;
		this.field3946 = arg1;
		this.field3930 = arg6;
		if (arg1 == null) {
			this.field3931 = null;
			this.field3929 = null;
		} else {
			this.field3931 = new class367[arg1.length];
			this.field3929 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.field3942 = arg7;
	}

	@ObfuscatedName("mq.a(IIB)V")
	public void method6378(int arg0, int arg1) {
		if (!this.field3945) {
		}
		this.field3947 = (arg1 - this.field3949) * arg0 / 255 + this.field3949;
	}

	@ObfuscatedName("mq.s(Lmq;B)V")
	public void method6386(class366 arg0) {
		if (this.field3945) {
			this.field3949 = this.field3947;
		} else if (arg0 != null && arg0.field3945) {
			this.field3949 = 255 - arg0.field3947;
		} else {
			this.field3949 = 0;
		}
		this.field3945 = true;
		this.field3935 = arg0;
		this.field3947 = 0;
	}

	@ObfuscatedName("mq.c(B)V")
	public void method6374() {
		this.field3945 = false;
		this.field3935 = null;
		this.field3947 = 0;
	}

	@ObfuscatedName("mq.m(S)Z")
	public boolean method6384() {
		return this.field3945;
	}

	@ObfuscatedName("mq.t(I)Lmq;")
	public class366 method6365() {
		return this.field3935;
	}

	@ObfuscatedName("mq.l(Lra;III)Z")
	public boolean method6366(RendererToolkit arg0, int arg1, int arg2) {
		if (this.field3933 != arg1) {
			this.field3933 = arg1;
			int var4 = class595.method1962(arg1);
			if (var4 > 512) {
				var4 = 512;
			}
			if (var4 <= 0) {
				var4 = 1;
			}
			if (this.field3928 != var4) {
				this.field3928 = var4;
				this.field3937 = null;
			}
			if (this.field3946 != null) {
				this.field3932 = 0;
				int[] var5 = new int[this.field3946.length];
				for (int var6 = 0; var6 < this.field3946.length; var6++) {
					class367 var7 = this.field3946[var6];
					if (var7.method6407(this.field3934, this.field3926, this.field3936, this.field3933)) {
						var5[this.field3932] = var7.field3964;
						this.field3931[++this.field3932 - 1] = var7;
					}
				}
				Algorithms.method15811(var5, this.field3931, 0, this.field3932 - 1);
			}
			this.field3938 = true;
		}
		boolean var8 = false;
		if (this.field3938) {
			this.field3938 = false;
			for (int var9 = this.field3932 - 1; var9 >= 0; var9--) {
				boolean var10 = this.field3931[var9].method6422(arg0, this.field3929);
				this.field3938 |= !var10;
				var8 |= var10;
			}
		}
		if (arg2 == 0 || !arg0.method451()) {
			this.field3943 = null;
		} else if (this.field3943 == null && this.field3942 >= 0) {
			this.method6372(arg0);
		}
		if (this.field3935 != null && this.field3935 != this) {
			this.field3935.method6374();
			var8 |= this.field3935.method6366(arg0, arg1, arg2);
		}
		return var8;
	}

	@ObfuscatedName("mq.f(Lra;B)V")
	public void method6372(RendererToolkit arg0) {
		try {
			boolean var2 = Statics.field549.method5631(this.field3942);
			if (var2) {
				arg0.method530(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				ModelUnlit var3 = ModelUnlit.method2664(Statics.field549, this.field3942, 0);
				this.field3943 = arg0.method625(var3, 1099776, 0, 255, 1);
				byte[] var4 = this.field3943.method334();
				if (var4 == null) {
					this.field3944 = null;
				} else {
					this.field3944 = new byte[var4.length];
					System.arraycopy(var4, 0, this.field3944, 0, var4.length);
				}
			}
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("mq.d(Lra;IIIIIIIIIB)V")
	public void method6368(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		this.method6369(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false);
	}

	@ObfuscatedName("mq.z(Lra;IIIIIIIIIZZB)V")
	public void method6369(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11) {
		int var13 = 0;
		if (this.field3945) {
			var13 = this.field3947;
		}
		if (this.field3935 == null) {
			this.method6370(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, var13);
			return;
		}
		class366 var14 = this;
		class366 var15 = this.field3935;
		if (this.hashCode() > var15.hashCode()) {
			var14 = this.field3935;
			var15 = this;
			var13 = 255 - var13;
		}
		var14.method6370(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, var13);
		var15.method6370(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - var13);
	}

	@ObfuscatedName("mq.n(Lra;IIIIIIIIIZZIB)V")
	public void method6370(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11, int arg12) {
		int var14 = 255 - arg12;
		arg0.method510();
		if (this.field3943 == null) {
			arg0.method505(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.field3927 == -1 || this.field3928 == 0) {
				arg0.method489(arg2, arg3, arg4, arg5, var14 << 24 | arg9, 1);
			} else {
				Material var15 = Statics.field6785.method889(this.field3927);
				if (this.field3937 == null && Statics.field6785.method898(this.field3927, MaterialAlphaMode.field4853 == var15.field1262 ? class455.field4848 : class455.field4849, 0.7F, this.field3928, this.field3928, false)) {
					int[] var16 = MaterialAlphaMode.field4853 == var15.field1262 ? Statics.field6785.method887(this.field3927, 0.7F, this.field3928, this.field3928, false) : Statics.field6785.method886(this.field3927, 0.7F, this.field3928, this.field3928, false);
					this.field3941 = var16[0];
					this.field3940 = var16[var16.length - 1];
					this.field3937 = arg0.method506(var16, 0, var15.field1252, var15.field1252, var15.field1252);
				}
				int var17 = var14 == 255 ? (MaterialAlphaMode.field4853 == var15.field1262 ? 1 : 0) : 1;
				if (var17 == 1 && arg10) {
					arg0.method489(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.field3937 != null) {
					int var18 = arg5 * arg6 / -4096;
					int var19;
					for (var19 = arg5 * arg7 / 4096 + (arg4 - arg5) / 2; var19 > arg5; var19 -= arg5) {
					}
					while (var19 < 0) {
						var19 += arg5;
					}
					if (class420.field4467 == this.field3930) {
						for (int var20 = var19 - arg5; var20 < arg4; var20 += arg5) {
							this.field3937.method2502(arg2 + var20, arg3 + var18, arg5, arg5, 0, var14 << 24 | 0xFFFFFF, var17);
						}
						if ((this.field3941 & 0xFF000000) != 0) {
							arg0.method496(0, 0, arg4, arg3 + var18 + 1, this.field3941);
						}
						if ((this.field3940 & 0xFF000000) != 0) {
							arg0.method496(0, arg3 + var18 + arg5, arg4, arg5 - (arg3 + var18 + arg5), this.field3940);
						}
					} else {
						while (var18 > arg5) {
							var18 -= arg5;
						}
						while (var18 < 0) {
							var18 += arg5;
						}
						for (int var21 = var19 - arg5; var21 < arg4; var21 += arg5) {
							for (int var22 = var18 - arg5; var22 < arg5; var22 += arg5) {
								this.field3937.method2502(arg2 + var21, arg3 + var22, arg5, arg5, 0, var14 << 24 | 0xFFFFFF, var17);
							}
						}
					}
				}
			}
		} else if (arg11) {
			Matrix4x4 var23 = arg0.method528();
			Matrix4x4 var24 = arg0.method528();
			var23.field3480[2] = var23.field3480[3];
			var23.field3480[6] = var23.field3480[7];
			var23.field3480[10] = var23.field3480[11];
			var23.field3480[14] = var23.field3480[15];
			arg0.method784(var23);
			this.method6375(arg0, arg6, arg7, arg8, arg12);
			arg0.method784(var24);
		} else {
			if (arg10) {
				arg0.method505(3, arg9);
			}
			this.method6375(arg0, arg6, arg7, arg8, arg12);
		}
		for (int var25 = this.field3932 - 1; var25 >= 0; var25--) {
			this.field3931[var25].method6409(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.field3934, this.field3926, this.field3936, var14);
		}
		arg0.method505(2, 0);
		arg0.method511();
	}

	@ObfuscatedName("mq.o(Lra;IIIII)V")
	public void method6375(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4) {
		Matrix4x3 var6 = arg0.method525();
		Matrix4x3 var7 = new Matrix4x3();
		var7.method5114(0.0F, 0.0F, 0.0F);
		var7.method5178(0.0F, -1.0F, 0.0F, Trig1.method5096(-arg2 & 0x3FFF));
		var7.method5178(-1.0F, 0.0F, 0.0F, Trig1.method5096(-arg1 & 0x3FFF));
		var7.method5178(0.0F, 0.0F, -1.0F, Trig1.method5096(-arg3 & 0x3FFF));
		arg0.method524(var7);
		Matrix4x3 var8 = new Matrix4x3();
		if (this.field3939 != arg4) {
			this.field3943.method288((byte) arg4, this.field3944);
			this.field3939 = arg4;
		}
		this.field3943.method271(var8, null, 0);
		arg0.method524(var6);
	}
}
