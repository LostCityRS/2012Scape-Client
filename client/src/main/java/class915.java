
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ahu")
public class class915 extends class776 {

	@ObfuscatedName("ahu.t")
	public static float field10153 = 0.25F;

	@ObfuscatedName("ahu.l")
	public static float field10158 = 1.0F;

	@ObfuscatedName("ahu.f")
	public static float field10155 = 1.0F;

	@ObfuscatedName("ahu.q")
	public class890 field10160;

	@ObfuscatedName("ahu.p")
	public class890 field10161;

	@ObfuscatedName("ahu.w")
	public class640 field10166;

	@ObfuscatedName("ahu.b")
	public class640 field10163;

	@ObfuscatedName("ahu.x")
	public class640[] field10170;

	@ObfuscatedName("ahu.i")
	public int field10165;

	@ObfuscatedName("ahu.v")
	public int field10154;

	@ObfuscatedName("ahu.k")
	public int field10167;

	@ObfuscatedName("ahu.h")
	public int field10168;

	@ObfuscatedName("ahu.r")
	public class79 field10152;

	@ObfuscatedName("ahu.g")
	public class79 field10169;

	@ObfuscatedName("ahu.y")
	public class79 field10171;

	@ObfuscatedName("ahu.e")
	public class79 field10172;

	public class915(GlToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahu.ao()Z")
	public boolean method16224() {
		return this.field9320.field8176 && this.field9320.field8213 && this.field9320.field8209;
	}

	@ObfuscatedName("ahu.u()Z")
	public boolean method14840() {
		return this.field10160 != null;
	}

	@ObfuscatedName("ahu.j()Z")
	public boolean method14844() {
		if (!this.field9320.field8176 || !this.field9320.field8213 || !this.field9320.field8209) {
			return false;
		}
		this.field10160 = new class890(this.field9320);
		this.field10166 = new class640(this.field9320, 3553, class124.field1296, class139.field1505, 256, 256);
		this.field10166.method12765(false, false);
		this.field10163 = new class640(this.field9320, 3553, class124.field1296, class139.field1505, 256, 256);
		this.field10163.method12765(false, false);
		this.field9320.method464(this.field10160);
		this.field10160.method1206(0, this.field10166.method12762(0));
		this.field10160.method1206(1, this.field10163.method12762(0));
		this.field10160.method16000(0);
		if (!this.field10160.method1208()) {
			this.field9320.method696(this.field10160);
			return false;
		}
		this.field9320.method696(this.field10160);
		this.field10172 = class79.method2027(this.field9320, new class82[] { class82.method2080(this.field9320, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.field10171 = class79.method2027(this.field9320, new class82[] { class82.method2080(this.field9320, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.field10169 = class79.method2027(this.field9320, new class82[] { class82.method2080(this.field9320, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") });
		this.field10152 = class79.method2027(this.field9320, new class82[] { class82.method2080(this.field9320, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.field10171 != null && this.field10172 != null && this.field10169 != null && this.field10152 != null;
	}

	@ObfuscatedName("ahu.s(II)V")
	public void method14821(int arg0, int arg1) {
		this.field10165 = arg0;
		this.field10154 = arg1;
		int var3 = class595.method1962(this.field10165);
		int var4 = class595.method1962(this.field10154);
		if (this.field10167 == var3 && this.field10168 == var4) {
			return;
		}
		if (this.field10170 != null) {
			for (int var5 = 0; var5 < this.field10170.length; var5++) {
				this.field10170[var5].method2048();
			}
			this.field10170 = null;
		}
		if (var3 <= 256 && var4 <= 256) {
			this.field10161 = null;
		} else {
			int var6 = var3;
			int var7 = var4;
			int var8 = 0;
			label61: while (true) {
				if (var6 <= 256 && var7 <= 256) {
					if (this.field10161 == null) {
						this.field10161 = new class890(this.field9320);
					}
					this.field10170 = new class640[var8];
					int var9 = var3;
					int var10 = var4;
					int var11 = 0;
					while (true) {
						if (var9 <= 256 && var10 <= 256) {
							break label61;
						}
						this.field10170[var11++] = new class640(this.field9320, 3553, class124.field1296, class139.field1505, var9, var10);
						if (var9 > 256) {
							var9 >>= 0x1;
						}
						if (var10 > 256) {
							var10 >>= 0x1;
						}
					}
				}
				if (var6 > 256) {
					var6 >>= 0x1;
				}
				if (var7 > 256) {
					var7 >>= 0x1;
				}
				var8++;
			}
		}
		this.field10167 = var3;
		this.field10168 = var4;
	}

	@ObfuscatedName("ahu.a()V")
	public void method14820() {
		this.field10168 = -1;
		this.field10167 = -1;
		this.field10161 = null;
		this.field10170 = null;
		this.field10160 = null;
		this.field10166 = null;
		this.field10163 = null;
		this.field10172 = null;
		this.field10171 = null;
		this.field10169 = null;
		this.field10152 = null;
	}

	@ObfuscatedName("ahu.c(ILxp;Lxp;)V")
	public void method14822(int arg0, class640 arg1, class640 arg2) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		if (this.field10170 == null) {
			this.field9320.method13315(arg1);
			this.field9320.method464(this.field10160);
			this.field10160.method16000(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int var8 = this.field10172.field1028;
			OpenGL.glUseProgram(var8);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var8, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var8, "params"), field10155, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.field10165, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.field10165, (float) this.field10154);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.field10154);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.field9320.method464(this.field10161);
			int var4 = class595.method1962(this.field10165);
			int var5 = class595.method1962(this.field10154);
			int var6 = 0;
			while (var4 > 256 || var5 > 256) {
				OpenGL.glViewport(0, 0, var4, var5);
				this.field10161.method1206(0, this.field10170[var6].method12762(0));
				if (var6 == 0) {
					this.field9320.method13315(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) this.field10165, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) this.field10165, (float) this.field10154);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.field10154);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.field9320.method13315(this.field10170[var6 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (var4 > 256) {
					var4 >>= 0x1;
				}
				if (var5 > 256) {
					var5 >>= 0x1;
				}
				var6++;
			}
			this.field9320.method696(this.field10161);
			this.field9320.method13315(this.field10170[var6 - 1]);
			this.field9320.method464(this.field10160);
			this.field10160.method16000(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int var7 = this.field10171.field1028;
			OpenGL.glUseProgram(var7);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), field10155, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.field10160.method16000(1);
		this.field9320.method13315(this.field10166);
		int var9 = this.field10152.field1028;
		OpenGL.glUseProgram(var9);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var9, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var9, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.field10160.method16000(0);
		this.field9320.method13315(this.field10163);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var9, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.field9320.method696(this.field10160);
		int var10 = this.field10169.field1028;
		OpenGL.glUseProgram(var10);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var10, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var10, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var10, "params"), field10153, field10158, 0.0F);
		this.field9320.method13314(1);
		this.field9320.method13315(this.field10166);
		this.field9320.method13314(0);
		this.field9320.method13315(arg1);
	}

	@ObfuscatedName("ahu.m(I)V")
	public void method14823(int arg0) {
		OpenGL.glUseProgram(0);
		this.field9320.method13314(1);
		this.field9320.method13315(null);
		this.field9320.method13314(0);
	}

	@ObfuscatedName("ahu.f()Ldz;")
	public class139 method14826() {
		return class139.field1505;
	}
}
