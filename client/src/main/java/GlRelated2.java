
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xp")
public class GlRelated2 extends GlTexture {

	@ObfuscatedName("xp.w")
	public final int field7440;

	@ObfuscatedName("xp.b")
	public final int field7441;

	public GlRelated2(GlToolkit arg0, int arg1, class124 arg2, DataType arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, false);
		this.field7440 = arg4;
		this.field7441 = arg5;
		this.field1054.method13315(this);
		OpenGL.glTexImage2Dub(this.field1049, 0, GlToolkit.method13335(this.field1050, this.field1051), arg4, arg5, 0, GlToolkit.method13334(this.field1050), 5121, null, 0);
		this.method2055(true);
	}

	public GlRelated2(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(arg0, arg1, class124.field1298, DataType.field1501, arg4 * arg5, false);
		this.field7440 = arg4;
		this.field7441 = arg5;
		this.field1054.method13315(this);
		class126 var7 = this.field1054.method457();
		if (var7 != null) {
			int var8 = var7.method922() - (arg3 + arg5);
			int var9 = GlToolkit.method13335(this.field1050, this.field1051);
			OpenGL.glCopyTexImage2D(this.field1049, 0, var9, arg2, var8, arg4, arg5, 0);
		}
		this.method2055(true);
	}

	public GlRelated2(GlToolkit arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7, boolean arg8) {
		super(arg0, arg1, class124.field1296, DataType.field1501, arg2 * arg3, arg4);
		this.field7440 = arg2;
		this.field7441 = arg3;
		if (arg8) {
			int[] var10 = new int[arg5.length];
			for (int var11 = 0; var11 < arg3; var11++) {
				int var12 = arg2 * var11;
				int var13 = (arg3 - var11 - 1) * arg2;
				for (int var14 = 0; var14 < arg2; var14++) {
					var10[var12++] = arg5[var13++];
				}
			}
			arg5 = var10;
		}
		this.field1054.method13315(this);
		if (this.field1049 != 34037 && arg4 && arg6 == 0 && arg7 == 0) {
			method2053(this.field1049, GlToolkit.method13335(this.field1050, this.field1051), this.field7440, this.field7441, 32993, this.field1054.field8215, arg5);
			this.method2047(true);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.field1049, 0, GlToolkit.method13335(this.field1050, this.field1051), this.field7440, this.field7441, 0, 32993, this.field1054.field8215, arg5, arg7 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method2047(false);
		}
		this.method2055(true);
	}

	public GlRelated2(GlToolkit arg0, int arg1, class124 arg2, DataType arg3, int arg4, int arg5, boolean arg6, byte[] arg7, class124 arg8, boolean arg9) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.field7440 = arg4;
		this.field7441 = arg5;
		if (arg9) {
			byte[] var11 = new byte[arg7.length];
			for (int var12 = 0; var12 < arg5; var12++) {
				int var13 = arg4 * var12;
				int var14 = (arg5 - var12 - 1) * arg4;
				for (int var15 = 0; var15 < arg4; var15++) {
					var11[var13++] = arg7[var14++];
				}
			}
			arg7 = var11;
		}
		this.field1054.method13315(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg6 && this.field1049 != 34037) {
			method2054(arg1, GlToolkit.method13335(this.field1050, this.field1051), arg4, arg5, arg8, arg7);
			this.method2047(true);
		} else {
			OpenGL.glTexImage2Dub(this.field1049, 0, GlToolkit.method13335(this.field1050, this.field1051), this.field7440, this.field7441, 0, GlToolkit.method13334(arg8), 5121, arg7, 0);
			this.method2047(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method2055(true);
	}

	public GlRelated2(GlToolkit arg0, int arg1, class124 arg2, DataType arg3, int arg4, int arg5, boolean arg6, float[] arg7, class124 arg8) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.field7440 = arg4;
		this.field7441 = arg5;
		this.field1054.method13315(this);
		if (arg6 && this.field1049 != 34037) {
			method2059(arg1, GlToolkit.method13335(this.field1050, this.field1051), arg4, arg5, arg8, arg7);
			this.method2047(true);
		} else {
			OpenGL.glTexImage2Df(this.field1049, 0, GlToolkit.method13335(this.field1050, this.field1051), this.field7440, this.field7441, 0, GlToolkit.method13334(arg8), 5126, arg7, 0);
			this.method2047(false);
		}
		this.method2055(true);
	}

	@ObfuscatedName("xp.ag(ZZ)V")
	public void method12765(boolean arg0, boolean arg1) {
		if (this.field1049 == 3553) {
			this.field1054.method13315(this);
			OpenGL.glTexParameteri(this.field1049, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.field1049, 10243, arg1 ? 10497 : 33071);
		}
	}

	@ObfuscatedName("xp.as(IIII[BLcy;IIZ)V")
	public void method12769(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class124 arg5, int arg6, int arg7, boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			int var10 = arg5.field1306;
			int var11 = arg2 * var10;
			int var12 = arg7 * var10;
			byte[] var13 = new byte[arg3 * var11];
			for (int var14 = 0; var14 < arg3; var14++) {
				int var15 = var11 * var14;
				int var16 = (arg3 - var14 - 1) * var12 + arg6;
				for (int var17 = 0; var17 < var11; var17++) {
					var13[var15++] = arg4[var16++];
				}
			}
			arg4 = var13;
		}
		this.field1054.method13315(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg7) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.field1049, 0, arg0, this.field7441 - arg1 - arg3, arg2, arg3, GlToolkit.method13334(arg5), 5121, arg4, arg6);
		if (arg2 != arg7) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@ObfuscatedName("xp.ai(IIII[IIIZ)V")
	public void method12766(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			int[] var9 = new int[arg2 * arg3];
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = arg2 * var10;
				int var12 = (arg3 - var10 - 1) * arg6 + arg5;
				for (int var13 = 0; var13 < arg2; var13++) {
					var9[var11++] = arg4[var12++];
				}
			}
			arg4 = var9;
		}
		this.field1054.method13315(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.field1049, 0, arg0, this.field7441 - arg1 - arg3, arg2, arg3, 32993, this.field1054.field8215, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@ObfuscatedName("xp.ao(IIIIII)V")
	public void method12767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		class126 var7 = this.field1054.method457();
		if (var7 != null) {
			int var8 = var7.method922() - (arg3 + arg5);
			this.field1054.method13315(this);
			OpenGL.glCopyTexSubImage2D(this.field1049, 0, arg0, this.field7441 - (arg1 + arg3), arg4, var8, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@ObfuscatedName("xp.al(I)Ldo;")
	public class132 method12764(int arg0) {
		return new class107(this, arg0);
	}

	@ObfuscatedName("xp.at(I)Lde;")
	public GraphicsDeletable method12762(int arg0) {
		return new class107(this, arg0);
	}
}
