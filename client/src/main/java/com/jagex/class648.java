package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xr")
public class class648 extends class85 {

	@ObfuscatedName("xr.s")
	public class79 field7477;

	@ObfuscatedName("xr.c")
	public boolean field7478 = false;

	@ObfuscatedName("xr.m")
	public boolean field7475 = false;

	@ObfuscatedName("xr.t")
	public class89 field7480;

	public class648(class682 arg0, class89 arg1) {
		super(arg0);
		this.field7480 = arg1;
		if (this.field7480.field1086 != null && this.field1062.field8212 && this.field1062.field8213) {
			class82 var3 = class82.method2080(this.field1062, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			class82 var4 = class82.method2080(this.field1062, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.field7477 = class79.method2027(this.field1062, new class82[] { var3, var4 });
			this.field7475 = this.field7477 != null;
		}
	}

	@ObfuscatedName("xr.u()Z")
	public boolean method2190() {
		return this.field7475;
	}

	@ObfuscatedName("xr.j(Z)V")
	public void method2189(boolean arg0) {
		class641 var2 = this.field1062.method13297();
		if (!this.field7475 || var2 == null) {
			return;
		}
		float var3 = (1.0F - Math.abs(this.field1062.field8145[1])) * 2.0F + 1.0F;
		this.field1062.method13314(1);
		this.field1062.method13315(var2);
		this.field1062.method13314(0);
		this.field1062.method13315(this.field7480.field1086);
		int var4 = this.field7477.field1028;
		OpenGL.glUseProgram(var4);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "sunDir"), -this.field1062.field8145[0], -this.field1062.field8145[1], -this.field1062.field8145[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var4, "sunColour"), this.field1062.field8136 * var3, this.field1062.field8156 * var3, this.field1062.field8179 * var3, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var4, "sunExponent"), Math.abs(this.field1062.field8145[1]) * 928.0F + 64.0F);
		this.field7478 = true;
	}

	@ObfuscatedName("xr.a(Z)V")
	public void method2191(boolean arg0) {
	}

	@ObfuscatedName("xr.s()V")
	public void method2192() {
		if (!this.field7478) {
			return;
		}
		this.field1062.method13314(1);
		this.field1062.method13315(null);
		this.field1062.method13314(0);
		this.field1062.method13315(null);
		OpenGL.glUseProgram(0);
		this.field7478 = false;
	}

	@ObfuscatedName("xr.c(II)V")
	public void method2193(int arg0, int arg1) {
		if (!this.field7478) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		float var7 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		float var8 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		int var9 = arg1 >> 27 & 0xF;
		int var10 = this.field7477.field1028;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (this.field1062.field8109 * var3 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
	}

	@ObfuscatedName("xr.m(Lbg;I)V")
	public void method2208(class81 arg0, int arg1) {
		if (!this.field7478) {
			this.field1062.method13315(arg0);
			this.field1062.method13316(arg1);
		}
	}
}
