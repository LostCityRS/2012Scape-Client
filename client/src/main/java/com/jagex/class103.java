package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("cb")
public class class103 {

	@ObfuscatedName("cb.j")
	public final class682 field1170;

	@ObfuscatedName("cb.a")
	public class79 field1171;

	public class103(class682 arg0) {
		this.field1170 = arg0;
	}

	@ObfuscatedName("cb.u()Z")
	public boolean method2318() {
		if (this.field1170.field8176 && this.field1170.field8213 && this.field1171 == null) {
			class82 var1 = class82.method2080(this.field1170, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (var1 != null) {
				this.field1171 = class79.method2027(this.field1170, new class82[] { var1 });
			}
		}
		return this.field1171 != null;
	}

	@ObfuscatedName("cb.j(Lxk;Lxk;F)Z")
	public boolean method2317(class639 arg0, class639 arg1, float arg2) {
		if (!this.method2318()) {
			return false;
		}
		class890 var4 = this.field1170.field8152;
		class656 var5 = new class656(this.field1170, class124.field1296, class139.field1501, arg0.field7438, arg0.field7437);
		boolean var6 = false;
		this.field1170.method464(var4);
		var4.method1206(0, var5);
		if (var4.method1208()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.field7438, arg0.field7437);
			OpenGL.glUseProgram(this.field1171.field1028);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.field1171.field1028, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.field1171.field1028, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.field1171.field1028, "sampleSize"), 1.0F / (float) arg1.field7438, 1.0F / (float) arg1.field7437);
			for (int var7 = 0; var7 < arg0.field7439; var7++) {
				float var8 = (float) var7 / (float) arg0.field7439;
				this.field1170.method13315(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, var8);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, var8);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, var8);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, var8);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method12759(0, 0, var7, arg0.field7438, arg0.field7437, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			var6 = true;
		}
		var4.method1206(0, null);
		this.field1170.method696(var4);
		return var6;
	}
}
