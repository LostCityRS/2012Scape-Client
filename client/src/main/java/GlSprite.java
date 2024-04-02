
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("yl")
public class GlSprite extends Sprite {

	@ObfuscatedName("yl.u")
	public final GlGraphicRelated field7625;

	@ObfuscatedName("yl.j")
	public final GlToolkit field7626;

	@ObfuscatedName("yl.a")
	public GlGraphicRelated field7627;

	@ObfuscatedName("yl.s")
	public int field7628 = 0;

	@ObfuscatedName("yl.c")
	public boolean field7633 = false;

	@ObfuscatedName("yl.m")
	public int field7630 = 0;

	@ObfuscatedName("yl.t")
	public int field7631 = 0;

	@ObfuscatedName("yl.l")
	public int field7632 = 0;

	@ObfuscatedName("yl.f")
	public int field7629 = 0;

	public GlSprite(GlToolkit arg0, int arg1, int arg2, boolean arg3) {
		this.field7626 = arg0;
		this.field7625 = GlGraphicRelated.method15981(arg0, arg3 ? class124.field1296 : class124.field1298, DataType.field1501, arg1, arg2);
	}

	public GlSprite(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4) {
		this.field7626 = arg0;
		this.field7625 = GlGraphicRelated.method15976(arg0, arg1, arg2, arg3, arg4);
	}

	public GlSprite(GlToolkit arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
		this.field7626 = arg0;
		this.field7625 = GlGraphicRelated.method15974(arg0, arg1, arg2, false, arg3, arg5, arg4);
	}

	@ObfuscatedName("yl.q(IIII)V")
	public void method1036(int arg0, int arg1, int arg2, int arg3) {
		this.field7631 = arg0;
		this.field7630 = arg1;
		this.field7629 = arg2;
		this.field7632 = arg3;
		this.field7633 = this.field7631 != 0 || this.field7630 != 0 || this.field7629 != 0 || this.field7632 != 0;
	}

	@ObfuscatedName("yl.p([I)V")
	public void method1063(int[] arg0) {
		arg0[0] = this.field7631;
		arg0[1] = this.field7630;
		arg0[2] = this.field7629;
		arg0[3] = this.field7632;
	}

	@ObfuscatedName("yl.w()I")
	public int method1061() {
		return this.field7625.field9910;
	}

	@ObfuscatedName("yl.b()I")
	public int method1042() {
		return this.field7625.field9910 + this.field7631 + this.field7629;
	}

	@ObfuscatedName("yl.i()I")
	public int method1045() {
		return this.field7625.field9909;
	}

	@ObfuscatedName("yl.v()I")
	public int method1047() {
		return this.field7625.field9909 + this.field7630 + this.field7632;
	}

	@ObfuscatedName("yl.k()Lde;")
	public GraphicsDeletable method1049() {
		return this.field7625.method12762(0);
	}

	@ObfuscatedName("yl.h(IIIIII)V")
	public void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (!this.field7626.field8199) {
			this.field7625.method12767(arg0, arg1, arg2, arg3, arg4, arg5);
			return;
		}
		int[] var7 = this.field7626.method691(arg4, arg5, arg2, arg3);
		if (var7 != null) {
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] |= 0xFF000000;
			}
			this.method12929(arg0, arg1, arg2, arg3, var7, 0, arg2);
		}
	}

	@ObfuscatedName("yl.r(III)V")
	public void method1052(int arg0, int arg1, int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.field7627 = GlGraphicRelated.method15976(this.field7626, arg0, arg1, this.field7625.field9910, this.field7625.field9909);
		this.field7628 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@ObfuscatedName("yl.u(IIII[III)V")
	public void method12929(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
		this.field7625.method12766(arg0, arg1, arg2, arg3, arg4, arg5, arg6, true);
	}

	@ObfuscatedName("yl.j(I)V")
	public void method12933(int arg0) {
		this.field7626.method13314(1);
		this.field7626.method13315(this.field7625);
		this.field7626.method13271(this.field7626.method13317(arg0), 7681);
		this.field7626.method13318(1, 34167, 768);
		this.field7626.method13267(0, 34168, 770);
		this.field7626.method13314(0);
		this.field7626.method13315(this.field7627);
		this.field7626.method13271(34479, 7681);
		this.field7626.method13318(1, 34166, 768);
		if (this.field7628 == 0) {
			this.field7626.method13443(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.field7628 == 1) {
			this.field7626.method13443(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.field7628 == 2) {
			this.field7626.method13443(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.field7628 == 3) {
			this.field7626.method13443(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@ObfuscatedName("yl.a()V")
	public void method12930() {
		this.field7626.method13314(1);
		this.field7626.method13315(null);
		this.field7626.method13271(8448, 8448);
		this.field7626.method13318(1, 34168, 768);
		this.field7626.method13267(0, 5890, 770);
		this.field7626.method13314(0);
		this.field7626.method13318(1, 34168, 768);
	}

	@ObfuscatedName("yl.ay(IIIII)V")
	public void method1054(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.field7625.method2055(false);
		this.field7626.method13309();
		this.field7626.method13327(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		int var6 = this.field7631 + arg0;
		int var7 = this.field7630 + arg1;
		if (this.field7627 == null) {
			this.field7626.method13315(this.field7625);
			this.field7626.method13316(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
			OpenGL.glVertex2i(var6, var7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(var6, this.field7625.field9909 + var7);
			OpenGL.glTexCoord2f(this.field7625.field9912, 0.0F);
			OpenGL.glVertex2i(this.field7625.field9910 + var6, this.field7625.field9909 + var7);
			OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
			OpenGL.glVertex2i(this.field7625.field9910 + var6, var7);
			OpenGL.glEnd();
			return;
		}
		this.method12933(arg2);
		this.field7627.method2055(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7625.field9911);
		OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
		OpenGL.glVertex2i(var6, var7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(var6, this.field7625.field9909 + var7);
		OpenGL.glMultiTexCoord2f(33985, this.field7625.field9912, 0.0F);
		OpenGL.glTexCoord2f(this.field7625.field9912, 0.0F);
		OpenGL.glVertex2i(this.field7625.field9910 + var6, this.field7625.field9909 + var7);
		OpenGL.glMultiTexCoord2f(33985, this.field7625.field9912, this.field7625.field9911);
		OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
		OpenGL.glVertex2i(this.field7625.field9910 + var6, var7);
		OpenGL.glEnd();
		this.method12930();
	}

	@ObfuscatedName("yl.af(IILta;II)V")
	public void method1056(int arg0, int arg1, class11 arg2, int arg3, int arg4) {
		class669 var6 = (class669) arg2;
		GlGraphicRelated var7 = var6.field7651;
		this.field7625.method2055(false);
		this.field7626.method13309();
		this.field7626.method13315(this.field7625);
		this.field7626.method13316(1);
		this.field7626.method13314(1);
		this.field7626.method13315(var7);
		this.field7626.method13271(7681, 8448);
		this.field7626.method13318(0, 34168, 768);
		this.field7626.method13327(1);
		int var8 = this.field7631 + arg0;
		int var9 = this.field7630 + arg1;
		int var10 = this.field7625.field9910 + var8;
		int var11 = this.field7625.field9909 + var9;
		float var12 = var7.field9912 / (float) var7.field9910;
		float var13 = var7.field9911 / (float) var7.field9909;
		float var14 = (float) (var8 - arg3) * var12;
		float var15 = (float) (var10 - arg3) * var12;
		float var16 = var7.field9911 - (float) (var9 - arg4) * var13;
		float var17 = var7.field9911 - (float) (var11 - arg4) * var13;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7625.field9911);
		OpenGL.glMultiTexCoord2f(33985, var14, var16);
		OpenGL.glVertex2i(var8, var9);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var14, var17);
		OpenGL.glVertex2i(var8, this.field7625.field9909 + var9);
		OpenGL.glMultiTexCoord2f(33984, this.field7625.field9912, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, var15, var17);
		OpenGL.glVertex2i(this.field7625.field9910 + var8, this.field7625.field9909 + var9);
		OpenGL.glMultiTexCoord2f(33984, this.field7625.field9912, this.field7625.field9911);
		OpenGL.glMultiTexCoord2f(33985, var15, var16);
		OpenGL.glVertex2i(this.field7625.field9910 + var8, var9);
		OpenGL.glEnd();
		this.field7626.method13318(0, 5890, 768);
		this.field7626.method13316(0);
		this.field7626.method13315(null);
		this.field7626.method13314(0);
	}

	@ObfuscatedName("yl.ap(IIIIIIII)V")
	public void method1041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field7625.method2055((arg7 & 0x1) != 0);
		this.field7626.method13309();
		this.field7626.method13327(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.field7633) {
			float var9 = (float) arg2 / (float) this.method1042();
			float var10 = (float) arg3 / (float) this.method1047();
			float var11 = (float) this.field7631 * var9 + (float) arg0;
			float var12 = (float) this.field7630 * var10 + (float) arg1;
			float var13 = (float) this.field7625.field9910 * var9 + var11;
			float var14 = (float) this.field7625.field9909 * var10 + var12;
			if (this.field7627 == null) {
				this.field7626.method13315(this.field7625);
				this.field7626.method13316(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glTexCoord2f(this.field7625.field9912, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
			} else {
				this.method12933(arg4);
				this.field7627.method2055(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7625.field9911);
				OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
				OpenGL.glVertex2f(var11, var12);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(var11, var14);
				OpenGL.glMultiTexCoord2f(33985, this.field7625.field9912, 0.0F);
				OpenGL.glTexCoord2f(this.field7625.field9912, 0.0F);
				OpenGL.glVertex2f(var13, var14);
				OpenGL.glMultiTexCoord2f(33985, this.field7625.field9912, this.field7625.field9911);
				OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
				OpenGL.glVertex2f(var13, var12);
				OpenGL.glEnd();
				this.method12930();
			}
		} else if (this.field7627 == null) {
			this.field7626.method13315(this.field7625);
			this.field7626.method13316(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.field7625.field9912, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method12933(arg4);
			this.field7627.method2055(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field7625.field9911);
			OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.field7625.field9912, 0.0F);
			OpenGL.glTexCoord2f(this.field7625.field9912, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.field7625.field9912, this.field7625.field9911);
			OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method12930();
		}
	}

	@ObfuscatedName("yl.as(IIIIIII)V")
	public void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2;
		int var9 = arg1 + arg3;
		this.field7625.method2055(false);
		this.field7626.method13309();
		this.field7626.method13315(this.field7625);
		this.field7626.method13327(arg6);
		this.field7626.method13316(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.field7625.field9913 && !this.field7633) {
			float var10 = (float) arg3 * this.field7625.field9911 / (float) this.field7625.field9909;
			float var11 = (float) arg2 * this.field7625.field9912 / (float) this.field7625.field9910;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, var10);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, var9);
			OpenGL.glTexCoord2f(var11, 0.0F);
			OpenGL.glVertex2i(var8, var9);
			OpenGL.glTexCoord2f(var11, var10);
			OpenGL.glVertex2i(var8, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.field7631, (float) this.field7630, 0.0F);
		int var12 = this.method1042();
		int var13 = this.method1047();
		int var14 = this.field7625.field9909 + arg1;
		OpenGL.glBegin(7);
		int var15 = arg1;
		while (var14 <= var9) {
			int var16 = this.field7625.field9910 + arg0;
			int var17 = arg0;
			while (var16 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
				OpenGL.glVertex2i(var17, var15);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var17, var14);
				OpenGL.glTexCoord2f(this.field7625.field9912, 0.0F);
				OpenGL.glVertex2i(var16, var14);
				OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
				OpenGL.glVertex2i(var16, var15);
				var16 += var12;
				var17 += var12;
			}
			if (var17 < var8) {
				float var18 = (float) (var8 - var17) * this.field7625.field9912 / (float) this.field7625.field9910;
				OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
				OpenGL.glVertex2i(var17, var15);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(var17, var14);
				OpenGL.glTexCoord2f(var18, 0.0F);
				OpenGL.glVertex2i(var8, var14);
				OpenGL.glTexCoord2f(var18, this.field7625.field9911);
				OpenGL.glVertex2i(var8, var15);
			}
			var15 += var13;
			var14 += var13;
		}
		if (var15 < var9) {
			float var19 = (float) (this.field7625.field9909 - (var9 - var15)) * this.field7625.field9911 / (float) this.field7625.field9909;
			int var20 = this.field7625.field9910 + arg0;
			int var21 = arg0;
			while (var20 <= var8) {
				OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
				OpenGL.glVertex2i(var21, var15);
				OpenGL.glTexCoord2f(0.0F, var19);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(this.field7625.field9912, var19);
				OpenGL.glVertex2i(var20, var9);
				OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
				OpenGL.glVertex2i(var20, var15);
				var20 += var12;
				var21 += var12;
			}
			if (var21 < var8) {
				float var22 = (float) (var8 - var21) * this.field7625.field9912 / (float) this.field7625.field9910;
				OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
				OpenGL.glVertex2i(var21, var15);
				OpenGL.glTexCoord2f(0.0F, var19);
				OpenGL.glVertex2i(var21, var9);
				OpenGL.glTexCoord2f(var22, var19);
				OpenGL.glVertex2i(var8, var9);
				OpenGL.glTexCoord2f(var22, this.field7625.field9911);
				OpenGL.glVertex2i(var8, var15);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@ObfuscatedName("yl.am(FFFFFFIIII)V")
	public void method1060(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
		if (this.field7633) {
			float var11 = (float) this.method1042();
			float var12 = (float) this.method1047();
			float var13 = (arg2 - arg0) / var11;
			float var14 = (arg3 - arg1) / var11;
			float var15 = (arg4 - arg0) / var12;
			float var16 = (arg5 - arg1) / var12;
			float var17 = (float) this.field7630 * var15;
			float var18 = (float) this.field7630 * var16;
			float var19 = (float) this.field7631 * var13;
			float var20 = (float) this.field7631 * var14;
			float var21 = (float) this.field7629 * -var13;
			float var22 = (float) this.field7629 * -var14;
			float var23 = (float) this.field7632 * -var15;
			float var24 = (float) this.field7632 * -var16;
			arg0 = arg0 + var19 + var17;
			arg1 = arg1 + var20 + var18;
			arg2 = arg2 + var21 + var17;
			arg3 = arg3 + var22 + var18;
			arg4 = arg4 + var19 + var23;
			arg5 = arg5 + var20 + var24;
		}
		float var25 = arg2 - arg0 + arg4;
		float var26 = arg5 - arg1 + arg3;
		this.field7625.method2055((arg9 & 0x1) != 0);
		this.field7626.method13309();
		this.field7626.method13315(this.field7625);
		this.field7626.method13327(arg8);
		this.field7626.method13316(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.field7625.field9911);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.field7625.field9912, 0.0F);
		OpenGL.glVertex2f(var25, var26);
		OpenGL.glTexCoord2f(this.field7625.field9912, this.field7625.field9911);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@ObfuscatedName("yl.az(FFFFFFILta;II)V")
	public void method1044(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class11 arg7, int arg8, int arg9) {
		GlGraphicRelated var11 = ((class669) arg7).field7651;
		if (this.field7633) {
			float var12 = (float) this.method1042();
			float var13 = (float) this.method1047();
			float var14 = (arg2 - arg0) / var12;
			float var15 = (arg3 - arg1) / var12;
			float var16 = (arg4 - arg0) / var13;
			float var17 = (arg5 - arg1) / var13;
			float var18 = (float) this.field7630 * var16;
			float var19 = (float) this.field7630 * var17;
			float var20 = (float) this.field7631 * var14;
			float var21 = (float) this.field7631 * var15;
			float var22 = (float) this.field7629 * -var14;
			float var23 = (float) this.field7629 * -var15;
			float var24 = (float) this.field7632 * -var16;
			float var25 = (float) this.field7632 * -var17;
			arg0 = arg0 + var20 + var18;
			arg1 = arg1 + var21 + var19;
			arg2 = arg2 + var22 + var18;
			arg3 = arg3 + var23 + var19;
			arg4 = arg4 + var20 + var24;
			arg5 = arg5 + var21 + var25;
		}
		float var26 = arg2 - arg0 + arg4;
		float var27 = arg5 - arg1 + arg3;
		this.field7625.method2055((arg6 & 0x1) != 0);
		this.field7626.method13309();
		this.field7626.method13315(this.field7625);
		this.field7626.method13316(1);
		this.field7626.method13314(1);
		this.field7626.method13315(var11);
		this.field7626.method13271(7681, 8448);
		this.field7626.method13318(0, 34168, 768);
		this.field7626.method13327(1);
		float var28 = var11.field9912 / (float) var11.field9910;
		float var29 = var11.field9911 / (float) var11.field9909;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field7625.field9911);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg8) * var28, var11.field9911 - (arg1 - (float) arg9) * var29);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg8) * var28, var11.field9911 - (arg5 - (float) arg9) * var29);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.field7625.field9912, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (var26 - (float) arg8) * var28, var11.field9911 - (var27 - (float) arg9) * var29);
		OpenGL.glVertex2f(var26, var27);
		OpenGL.glMultiTexCoord2f(33984, this.field7625.field9912, this.field7625.field9911);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg8) * var28, var11.field9911 - (arg3 - (float) arg9) * var29);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.field7626.method13318(0, 5890, 768);
		this.field7626.method13316(0);
		this.field7626.method13315(null);
		this.field7626.method13314(0);
	}
}
