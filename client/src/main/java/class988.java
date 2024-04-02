
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("akc")
public class class988 extends class891 {

	@ObfuscatedName("akc.s")
	public final GlxToolkit field10544;

	@ObfuscatedName("akc.c")
	public int field10545;

	@ObfuscatedName("akc.m")
	public int field10549;

	@ObfuscatedName("akc.t")
	public int field10547;

	@ObfuscatedName("akc.l")
	public int field10548;

	@ObfuscatedName("akc.f")
	public int field10551;

	@ObfuscatedName("akc.d")
	public class349 field10543;

	@ObfuscatedName("akc.z")
	public final class349[] field10546 = new class349[4];

	public class988(GlxToolkit arg0) {
		super(arg0);
		this.field10544 = arg0;
		int[] var2 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, var2, 0);
		this.field10545 = var2[0];
	}

	@ObfuscatedName("akc.u()I")
	public int method921() {
		return this.field10549;
	}

	@ObfuscatedName("akc.j()I")
	public int method922() {
		return this.field10547;
	}

	@ObfuscatedName("akc.x(ILde;)V")
	public void method1206(int arg0, GraphicsDeletable arg1) {
		int var3 = 0x1 << arg0;
		class349 var4 = (class349) arg1;
		if (arg1 == null) {
			this.field10548 &= ~var3;
			this.field10546[arg0] = null;
			if (this.field10548 == 0) {
				this.field10547 = 0;
				this.field10549 = 0;
			}
		} else {
			if (this.field10548 == 0) {
				this.field10547 = var4.method165();
				this.field10549 = var4.method164();
				this.method16007();
			} else if (this.field10549 != var4.method164() || this.field10547 != var4.method165()) {
				throw new RuntimeException();
			}
			this.field10548 |= var3;
			this.field10546[arg0] = var4;
		}
		if (this.field10544.method457() == this) {
			this.method16955(arg0);
		} else {
			this.field10551 |= var3;
		}
	}

	@ObfuscatedName("akc.n(Ldo;)V")
	public void method1207(class132 arg0) {
		class349 var2 = (class349) arg0;
		if (arg0 == null) {
			this.field10548 &= 0xFFFFFFEF;
			this.field10543 = null;
			if (this.field10548 == 0) {
				this.field10547 = 0;
				this.field10549 = 0;
			}
		} else {
			if (this.field10548 == 0) {
				this.field10547 = var2.method165();
				this.field10549 = var2.method164();
				this.method16007();
			} else if (this.field10549 != var2.method164() || this.field10547 != var2.method165()) {
				throw new RuntimeException();
			}
			this.field10548 |= 0x10;
			this.field10543 = var2;
		}
		if (this.field10544.method457() == this) {
			this.method16956();
		} else {
			this.field10551 |= 0x10;
		}
	}

	@ObfuscatedName("akc.ag(I)V")
	public void method16955(int arg0) {
		class349 var2 = this.field10546[arg0];
		if (var2 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			var2.method5970(arg0 + 36064);
		}
	}

	@ObfuscatedName("akc.as()V")
	public void method16956() {
		if (this.field10543 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.field10543.method5970(36096);
		}
	}

	@ObfuscatedName("akc.r()Z")
	public boolean method1208() {
		int var1 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return var1 == 36053;
	}

	@ObfuscatedName("akc.s()Z")
	public boolean method954() {
		OpenGL.glBindFramebufferEXT(36160, this.field10545);
		for (int var1 = 0; var1 < 4; var1++) {
			if ((this.field10551 & 0x1 << var1) != 0) {
				this.method16955(var1);
			}
		}
		if ((this.field10551 & 0x10) != 0) {
			this.method16956();
		}
		this.field10551 = 0;
		return super.method954();
	}

	@ObfuscatedName("akc.c()Z")
	public boolean method925() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@ObfuscatedName("akc.g(IIIIIIZZ)V")
	public void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		int var9 = this.field10547;
		int var10 = this.field10544.method457().method922();
		int var11 = 0;
		if (arg7) {
			var11 |= 0x100;
		}
		if (arg6) {
			var11 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.field10545);
		OpenGL.glBlitFramebufferEXT(arg0, var9 - arg1 - arg3, arg0 + arg2, var9 - arg1, arg4, var10 - arg5 - arg3, arg2 + arg4, var10 - arg5, var11, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@ObfuscatedName("akc.a()V")
	public void method944() {
		if (this.field10545 != 0) {
			this.field10544.method16087(this.field10545);
			this.field10545 = 0;
		}
	}

	public void finalize() throws Throwable {
		super.finalize();
		this.method944();
	}
}
