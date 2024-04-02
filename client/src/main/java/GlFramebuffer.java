
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("agc")
public class GlFramebuffer extends class674 {

	@ObfuscatedName("agc.a")
	public final GlToolkit field9924;

	@ObfuscatedName("agc.s")
	public int field9932;

	@ObfuscatedName("agc.c")
	public int field9927;

	@ObfuscatedName("agc.m")
	public int field9928;

	@ObfuscatedName("agc.t")
	public int field9929;

	@ObfuscatedName("agc.l")
	public int field9930;

	@ObfuscatedName("agc.f")
	public class98 field9931;

	@ObfuscatedName("agc.d")
	public final class98[] field9926 = new class98[4];

	public GlFramebuffer(GlToolkit arg0) {
		if (!arg0.field8176) {
			throw new IllegalStateException("");
		}
		this.field9924 = arg0;
		int[] var2 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, var2, 0);
		this.field9932 = var2[0];
	}

	@ObfuscatedName("agc.u()I")
	public int method921() {
		return this.field9927;
	}

	@ObfuscatedName("agc.j()I")
	public int method922() {
		return this.field9928;
	}

	@ObfuscatedName("agc.x(ILde;)V")
	public void method1206(int arg0, GraphicsDeletable arg1) {
		int var3 = 0x1 << arg0;
		class98 var4 = (class98) arg1;
		if (arg1 == null) {
			this.field9929 &= ~var3;
			this.field9926[arg0] = null;
			if (this.field9929 == 0) {
				this.field9928 = 0;
				this.field9927 = 0;
			}
		} else {
			if ((this.field9929 | var3) == var3) {
				this.field9928 = var4.method165();
				this.field9927 = var4.method164();
				if (this.field9924.method457() == this) {
					this.field9924.method13270();
				}
			} else if (this.field9927 != var4.method164() || this.field9928 != var4.method165()) {
				throw new RuntimeException();
			}
			this.field9929 |= var3;
			this.field9926[arg0] = var4;
		}
		if (this.field9924.method457() == this) {
			this.method16002(arg0);
		} else {
			this.field9930 |= var3;
		}
	}

	@ObfuscatedName("agc.n(Ldo;)V")
	public void method1207(class132 arg0) {
		class98 var2 = (class98) arg0;
		if (arg0 == null) {
			this.field9929 &= 0xFFFFFFEF;
			this.field9931 = null;
			if (this.field9929 == 0) {
				this.field9928 = 0;
				this.field9927 = 0;
			}
		} else {
			if ((this.field9929 | 0x10) == 16) {
				this.field9928 = var2.method165();
				this.field9927 = var2.method164();
				if (this.field9924.method457() == this) {
					this.field9924.method13270();
				}
			} else if (this.field9927 != var2.method164() || this.field9928 != var2.method165()) {
				throw new RuntimeException();
			}
			this.field9929 |= 0x10;
			this.field9931 = var2;
		}
		if (this.field9924.method457() == this) {
			this.method15997();
		} else {
			this.field9930 |= 0x10;
		}
	}

	@ObfuscatedName("agc.ap(I)V")
	public void method16002(int arg0) {
		class98 var2 = this.field9926[arg0];
		if (var2 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			var2.method2260(arg0 + 36064);
		}
	}

	@ObfuscatedName("agc.ag()V")
	public void method15997() {
		if (this.field9931 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.field9931.method2260(36096);
		}
	}

	@ObfuscatedName("agc.r()Z")
	public boolean method1208() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	@ObfuscatedName("agc.s()Z")
	public boolean method954() {
		OpenGL.glBindFramebufferEXT(36160, this.field9932);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.field9930 & 0x1 << var1) != 0) {
				this.method16002(var1);
			}
		}
		if ((this.field9930 & 0x10) != 0) {
			this.method15997();
		}
		this.field9930 = 0;
		this.field9924.method13462();
		return true;
	}

	@ObfuscatedName("agc.c()Z")
	public boolean method925() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@ObfuscatedName("agc.as(I)V")
	public void method16000(int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@ObfuscatedName("agc.g(IIIIIIZZ)V")
	public void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		int var9 = this.field9928;
		int var10 = this.field9924.method457().method922();
		int var11 = 0;
		if (arg7) {
			var11 |= 0x100;
		}
		if (arg6) {
			var11 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.field9932);
		OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg2 + arg4, var10 - arg5, var11, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@ObfuscatedName("agc.a()V")
	public void method944() {
		if (this.field9932 != 0) {
			this.field9924.method13330(this.field9932);
			this.field9932 = 0;
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		this.method944();
	}
}
