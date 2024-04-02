
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aan")
public class class716 extends class168 {

	@ObfuscatedName("aan.t")
	public class899 field8580;

	@ObfuscatedName("aan.l")
	public class718 field8570;

	@ObfuscatedName("aan.f")
	public int field8571;

	@ObfuscatedName("aan.d")
	public int field8572;

	@ObfuscatedName("aan.z")
	public int field8574;

	@ObfuscatedName("aan.n")
	public boolean field8566;

	@ObfuscatedName("aan.o")
	public int[] field8575;

	@ObfuscatedName("aan.q")
	public static final int[] field8576 = new int[2];

	@ObfuscatedName("aan.p")
	public static final float[] field8577 = new float[16];

	@ObfuscatedName("aan.w")
	public float[] field8578;

	@ObfuscatedName("aan.b")
	public float[] field8583;

	@ObfuscatedName("aan.x")
	public float[] field8567;

	@ObfuscatedName("aan.i")
	public float[] field8581;

	@ObfuscatedName("aan.v")
	public int[] field8582;

	@ObfuscatedName("aan.k")
	public String field8573;

	@ObfuscatedName("aan.h")
	public String field8584;

	public class716(class899 arg0, class718 arg1, class167 arg2) {
		this(arg0, arg2);
		this.field8570 = arg1;
		this.field8580 = arg0;
	}

	public class716(class899 arg0, class167 arg1) {
		this.field8571 = 0;
		this.field8572 = 0;
		this.field8574 = 0;
		this.field8566 = false;
		this.field8575 = new int[13];
		this.field1940 = arg1.field1935;
		StringBuilder var3 = new StringBuilder();
		if (arg1.field1933 != null) {
			this.field1939 = arg1.field1933;
			if (arg1.field1932 != null) {
				class171[] var4 = arg1.field1932;
				for (int var5 = 0; var5 < var4.length; var5++) {
					class171 var6 = var4[var5];
					var3.append("#define " + var6.field2072 + " " + var6.field2071 + '\n');
				}
			}
			var3.append(new String(arg0.method16091(this.field1939)));
			this.field8573 = var3.toString();
		}
		if (arg1.field1934 != null) {
			this.field1938 = arg1.field1934;
			var3.setLength(0);
			if (arg1.field1936 != null) {
				class171[] var7 = arg1.field1936;
				for (int var8 = 0; var8 < var7.length; var8++) {
					class171 var9 = var7[var8];
					var3.append("#define " + var9.field2072 + " " + var9.field2071 + '\n');
				}
			}
			var3.append(new String(arg0.method16091(this.field1938)));
			this.field8584 = var3.toString();
		}
		class531.method11349(this.field8575, 0, this.field8575.length, -1);
	}

	@ObfuscatedName("aan.ba(ILjava/lang/String;Ljava/lang/String;)I")
	public int method13931(int arg0, String arg1, String arg2) {
		if (arg1 == null) {
			return 0;
		}
		int var4 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(var4, arg1);
		OpenGL.glCompileShader(var4);
		OpenGL.glGetShaderiv(var4, 35713, field8576, 0);
		if (field8576[0] == 0) {
			OpenGL.glDeleteShader(var4);
			var4 = 0;
		}
		return var4;
	}

	@ObfuscatedName("aan.j()Z")
	public boolean method3272() {
		if (this.field8566) {
			return true;
		}
		this.field8580.field10027 = null;
		this.field8572 = this.method13931(35633, this.field8573, this.field1939);
		this.field8574 = this.method13931(35632, this.field8584, this.field1938);
		if (this.field8572 == 0 || this.field8574 == 0) {
			if (this.field8572 != 0) {
				OpenGL.glDeleteShader(this.field8572);
			}
			if (this.field8574 != 0) {
				OpenGL.glDeleteShader(this.field8574);
			}
			return false;
		}
		this.field8571 = OpenGL.glCreateProgram();
		if (this.field8572 != 0) {
			OpenGL.glAttachShader(this.field8571, this.field8572);
		}
		if (this.field8574 != 0) {
			OpenGL.glAttachShader(this.field8571, this.field8574);
		}
		OpenGL.glLinkProgram(this.field8571);
		OpenGL.glGetProgramiv(this.field8571, 35714, field8576, 0);
		if (field8576[0] == 0) {
			if (this.field8572 != 0) {
				OpenGL.glDetachShader(this.field8571, this.field8572);
				OpenGL.glDeleteShader(this.field8572);
			}
			if (this.field8574 != 0) {
				OpenGL.glDetachShader(this.field8571, this.field8574);
				OpenGL.glDeleteShader(this.field8574);
			}
			OpenGL.glDeleteProgram(this.field8571);
			return false;
		}
		OpenGL.glUseProgram(this.field8571);
		int var1 = -1;
		for (int var2 = 0; var2 < this.field8570.method3331(); var2++) {
			if (this.field8570.method3332(var2) == this) {
				var1 = var2;
				break;
			}
		}
		if (var1 == -1) {
			return false;
		}
		int var3 = 0;
		int var4 = 0;
		for (int var5 = 0; var5 < this.field8570.method3361(); var5++) {
			class918 var6 = this.field8570.method3362(var5);
			if (var6 != null) {
				var6.method16248(var1);
				class170 var7 = var6.method16234();
				int var8 = ((class993) var6).field10571[var1];
				if (class170.field2067 == var7 || class170.field2014 == var7 || class170.field1948 == var7 || class170.field2003 == var7 || class170.field1971 == var7) {
					var3 = Math.max(var8, var3);
				} else {
					var4 = Math.max(var8, var4);
				}
			}
		}
		for (int var9 = 0; var9 < this.field8570.method3337(); var9++) {
			class918 var10 = this.field8570.method3359(var9);
			if (var10 != null) {
				var10.method16248(var1);
				class170 var11 = var10.method16234();
				int var12 = ((class993) var10).field10571[var1];
				if (class170.field2067 == var11 || class170.field2014 == var11 || class170.field1948 == var11 || class170.field2003 == var11 || class170.field1971 == var11) {
					var3 = Math.max(var12, var3);
				} else {
					var4 = Math.max(var12, var4);
				}
			}
		}
		this.field8578 = new float[var3 + 1];
		this.field8583 = new float[var3 + 1];
		this.field8567 = new float[var3 + 1];
		this.field8581 = new float[var3 + 1];
		this.field8582 = new int[var4 + 1];
		for (int var13 = 0; var13 < this.field8582.length; var13++) {
			this.field8582[var13] = -1;
		}
		this.field8573 = null;
		this.field8584 = null;
		this.field8566 = true;
		return true;
	}

	@ObfuscatedName("aan.a(Laig;F)V")
	public void method3231(class918 arg0, float arg1) {
		int var3 = ((class993) arg0).method16994();
		if (var3 == -1 || this.field8578[var3] == arg1) {
			return;
		}
		this.field8578[var3] = arg1;
		if (arg0.method16234() != class170.field2067 && arg0.method16234() != class170.field2014) {
			throw new class1012(arg0, "");
		}
		OpenGL.glUniform1f(var3, arg1);
	}

	@ObfuscatedName("aan.t(Laig;FF)V")
	public void method3267(class918 arg0, float arg1, float arg2) {
		int var4 = ((class993) arg0).method16994();
		if (var4 == -1 || this.field8578[var4] == arg1 && this.field8583[var4] == arg2) {
			return;
		}
		this.field8578[var4] = arg1;
		this.field8583[var4] = arg2;
		if (arg0.method16234() != class170.field1948) {
			throw new class1012(arg0, "");
		}
		OpenGL.glUniform2f(var4, arg1, arg2);
	}

	@ObfuscatedName("aan.l(Laig;FFF)V")
	public void method3233(class918 arg0, float arg1, float arg2, float arg3) {
		int var5 = ((class993) arg0).method16994();
		if (var5 == -1 || this.field8578[var5] == arg1 && this.field8583[var5] == arg2 && this.field8567[var5] == arg3) {
			return;
		}
		this.field8578[var5] = arg1;
		this.field8583[var5] = arg2;
		this.field8567[var5] = arg3;
		if (arg0.method16234() != class170.field2003) {
			throw new class1012(arg0, "");
		}
		OpenGL.glUniform3f(var5, arg1, arg2, arg3);
	}

	@ObfuscatedName("aan.f(Laig;FFFF)V")
	public void method3234(class918 arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((class993) arg0).method16994();
		if (var6 == -1 || this.field8578[var6] == arg1 && this.field8583[var6] == arg2 && this.field8567[var6] == arg3 && this.field8581[var6] == arg4) {
			return;
		}
		this.field8578[var6] = arg1;
		this.field8583[var6] = arg2;
		this.field8567[var6] = arg3;
		this.field8581[var6] = arg4;
		if (arg0.method16234() != class170.field1971) {
			throw new class1012(arg0, "");
		}
		OpenGL.glUniform4f(var6, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("aan.d(Laig;[FI)V")
	public void method3235(class918 arg0, float[] arg1, int arg2) {
		int var4 = ((class993) arg0).method16994();
		if (var4 != -1) {
			OpenGL.glUniform4fv(var4, arg2, arg1, 0);
		}
	}

	@ObfuscatedName("aan.z(Laig;Lka;)V")
	public void method3232(class918 arg0, class320 arg1) {
		assert arg0.method16234() == class170.field1985;
		int var3 = ((class993) arg0).method16994();
		if (var3 != -1) {
			OpenGL.glUniform2fv(var3, 4, arg1.method5458(field8577), 0);
		}
	}

	@ObfuscatedName("aan.n(Laig;Lka;)V")
	public void method3237(class918 arg0, class320 arg1) {
		assert arg0.method16234() == class170.field1987;
		int var3 = ((class993) arg0).method16994();
		if (var3 != -1) {
			OpenGL.glUniform4fv(var3, 4, arg1.method5408(field8577), 0);
		}
	}

	@ObfuscatedName("aan.o(Laig;ILip;)V")
	public void method3271(class918 arg0, int arg1, class254 arg2) {
		int var4 = ((class993) arg0).method16994();
		if (var4 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.field8580.field8312;
		}
		if (arg1 < this.field8580.field8337) {
			this.field8580.method13629(arg1);
			this.field8580.method13557(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((class347) arg2).field3737, ((class347) arg2).field3734);
		}
		if (this.field8582[var4] != arg1) {
			this.field8582[var4] = arg1;
			OpenGL.glUniform1i(var4, arg1);
		}
	}

	@ObfuscatedName("aan.q(IFFF)V")
	public void method3239(int arg0, float arg1, float arg2, float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("aan.p(IFFFF)V")
	public void method3240(int arg0, float arg1, float arg2, float arg3, float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("aan.w(I[FI)V")
	public void method3241(int arg0, float[] arg1, int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@ObfuscatedName("aan.b(ILka;)V")
	public void method3242(int arg0, class320 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method5410(field8577), 0);
	}

	@ObfuscatedName("aan.x(ILka;)V")
	public void method3243(int arg0, class320 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method5458(field8577), 0);
	}

	@ObfuscatedName("aan.i(ILka;)V")
	public void method3284(int arg0, class320 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method5408(field8577), 0);
	}

	@ObfuscatedName("aan.v(IILip;)V")
	public void method3245(int arg0, int arg1, class254 arg2) {
		this.field8580.method13629(arg1);
		this.field8580.method13557(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@ObfuscatedName("aan.s()V")
	public void method168() {
		if (this.field8571 == 0) {
			return;
		}
		this.field8580.method16089(this.field8571);
		if (this.field8572 != 0) {
			this.field8580.method16099((long) this.field8572);
		}
		if (this.field8574 != 0) {
			this.field8580.method16099((long) this.field8574);
		}
		this.field8571 = 0;
		this.field8572 = 0;
		this.field8574 = 0;
	}

	public void finalize() {
		this.method168();
	}
}
