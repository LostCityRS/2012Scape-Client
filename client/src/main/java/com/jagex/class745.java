package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("abb")
public class class745 extends class347 implements class257 {

	@ObfuscatedName("abb.p")
	public final int field8813;

	@ObfuscatedName("abb.w")
	public final int field8812;

	public class745(class899 arg0, class124 arg1, class139 arg2, int arg3, int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.field8813 = arg3;
		this.field8812 = arg4;
		this.field3733.method13557(this);
		OpenGL.glTexImage2Dub(this.field3737, 0, class899.method16100(this.field3736, this.field3731), arg3, arg4, 0, class899.method16093(this.field3736), class899.method16090(this.field3731), null, 0);
	}

	public class745(class899 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		super(arg0, 3553, class124.field1296, class139.field1501, arg1 * arg2, arg3);
		this.field8813 = arg1;
		this.field8812 = arg2;
		this.field3733.method13557(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method5985(this.field3737, arg1, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.field3737, 0, 6408, this.field8813, this.field8812, 0, 32993, this.field3733.field10024, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	public class745(class899 arg0, class124 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
		super(arg0, 3553, arg1, class139.field1501, arg2 * arg3, arg4);
		this.field8813 = arg2;
		this.field8812 = arg3;
		this.field3733.method13557(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method5974(this.field3737, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			class124 var10001 = this.field3736;
			if (this.field3736 == class124.field1303) {
				OpenGL.glCompressedTexImage2Dub(this.field3737, 0, 33777, arg2, arg3, 0, arg2 * arg3 / 2, arg5, arg6);
			} else {
				var10001 = this.field3736;
				if (this.field3736 == class124.field1295) {
					OpenGL.glCompressedTexImage2Dub(this.field3737, 0, 33779, arg2, arg3, 0, arg2 * arg3, arg5, arg6);
				} else {
					OpenGL.glTexImage2Dub(this.field3737, 0, class899.method16100(this.field3736, this.field3731), arg2, arg3, 0, class899.method16093(this.field3736), 5121, arg5, arg6);
				}
			}
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	public class745(class899 arg0, class124 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
		super(arg0, 3553, arg1, class139.field1506, arg2 * arg3, arg4);
		this.field8813 = arg2;
		this.field8812 = arg3;
		this.field3733.method13557(this);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method5978(this.field3737, arg2, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(this.field3737, 0, class899.method16100(this.field3736, this.field3731), arg2, arg3, 0, class899.method16093(this.field3736), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@ObfuscatedName("abb.u()I")
	public int method4409() {
		return this.field8813;
	}

	@ObfuscatedName("abb.j()I")
	public int method4449() {
		return this.field8812;
	}

	@ObfuscatedName("abb.a(F)F")
	public float method4437(float arg0) {
		return arg0 / (float) this.field8813;
	}

	@ObfuscatedName("abb.t(F)F")
	public float method4439(float arg0) {
		return arg0 / (float) this.field8812;
	}

	@ObfuscatedName("abb.o()F")
	public float method4433() {
		return 1.0F;
	}

	@ObfuscatedName("abb.q()F")
	public float method4443() {
		return 1.0F;
	}

	@ObfuscatedName("abb.l()Z")
	public boolean method4408() {
		return true;
	}

	@ObfuscatedName("abb.f(ZZ)V")
	public void method4412(boolean arg0, boolean arg1) {
		this.field3733.method13557(this);
		OpenGL.glTexParameteri(this.field3737, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(this.field3737, 10243, arg1 ? 10497 : 33071);
	}

	@ObfuscatedName("abb.d(IIII[III)V")
	public void method4413(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.field3733.method13557(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexSubImage2Di(this.field3737, 0, arg0, arg1, arg2, arg3, 32993, this.field3733.field10024, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
	}

	@ObfuscatedName("abb.z(IIII[BLcy;II)V")
	public void method4414(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class124 arg5, int arg6, int arg7) {
		this.field3733.method13557(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Dub(this.field3737, 0, arg0, arg1, arg2, arg3, class899.method16093(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@ObfuscatedName("abb.cl(IIII[FLcy;II)V")
	public void method14192(int arg0, int arg1, int arg2, int arg3, float[] arg4, class124 arg5, int arg6, int arg7) {
		this.field3733.method13557(this);
		OpenGL.glPixelStorei(3314, arg7);
		OpenGL.glTexSubImage2Df(this.field3737, 0, arg0, arg1, arg2, arg3, class899.method16093(arg5), 5121, arg4, arg6);
		OpenGL.glPixelStorei(3314, 0);
	}

	@ObfuscatedName("abb.n(IIII[II)V")
	public void method4415(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
		int[] var7 = new int[this.field8813 * this.field8812];
		this.field3733.method13557(this);
		OpenGL.glGetTexImagei(this.field3737, 0, 32993, 5121, var7, 0);
		for (int var8 = 0; var8 < arg3; var8++) {
			System.arraycopy(var7, (arg3 - 1 + arg1 - var8) * this.field8813, arg4, arg2 * var8 + arg5, arg2);
		}
	}

	@ObfuscatedName("abb.bf(I)Lde;")
	public class136 method4534(int arg0) {
		return new class346(this, arg0);
	}

	@ObfuscatedName("abb.p()Z")
	public boolean method4418() {
		return super.method4418();
	}

	@ObfuscatedName("abb.au()V")
	public void method4527() {
		super.method4527();
	}

	@ObfuscatedName("abb.ae(Lhd;)V")
	public void method4525(class241 arg0) {
		super.method4525(arg0);
	}

	@ObfuscatedName("abb.s()V")
	public void method168() {
		super.method168();
	}
}
