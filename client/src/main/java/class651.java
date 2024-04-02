
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("xt")
public class class651 extends class85 {

	@ObfuscatedName("xt.s")
	public class79 field7510;

	@ObfuscatedName("xt.c")
	public boolean field7511 = false;

	@ObfuscatedName("xt.m")
	public boolean field7508 = false;

	@ObfuscatedName("xt.t")
	public class89 field7513;

	public class651(class682 arg0, class89 arg1) {
		super(arg0);
		this.field7513 = arg1;
		if (this.field7513.field1086 != null && this.field1062.field8212 && this.field1062.field8213) {
			class82 var3 = class82.method2080(this.field1062, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			class82 var4 = class82.method2080(this.field1062, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.field7510 = class79.method2027(this.field1062, new class82[] { var3, var4 });
			this.field7508 = this.field7510 != null;
		}
	}

	@ObfuscatedName("xt.u()Z")
	public boolean method2190() {
		return this.field7508;
	}

	@ObfuscatedName("xt.j(Z)V")
	public void method2189(boolean arg0) {
		class641 var2 = this.field1062.method13297();
		if (!this.field7508 || var2 == null) {
			return;
		}
		this.field1062.method13314(1);
		this.field1062.method13315(var2);
		this.field1062.method13314(0);
		this.field1062.method13315(this.field7513.field1086);
		int var3 = this.field7510.field1028;
		OpenGL.glUseProgram(var3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var3, "sunDir"), -this.field1062.field8145[0], -this.field1062.field8145[1], -this.field1062.field8145[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var3, "sunColour"), this.field1062.field8136, this.field1062.field8156, this.field1062.field8179, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var3, "sunExponent"), Math.abs(this.field1062.field8145[1]) * 928.0F + 96.0F);
		this.field7511 = true;
	}

	@ObfuscatedName("xt.a(Z)V")
	public void method2191(boolean arg0) {
	}

	@ObfuscatedName("xt.s()V")
	public void method2192() {
		if (!this.field7511) {
			return;
		}
		this.field1062.method13314(1);
		this.field1062.method13315(null);
		this.field1062.method13314(0);
		this.field1062.method13315(null);
		OpenGL.glUseProgram(0);
		this.field7511 = false;
	}

	@ObfuscatedName("xt.c(II)V")
	public void method2193(int arg0, int arg1) {
		if (!this.field7511) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		int var7 = this.field7510.field1028;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "time"), (float) (this.field1062.field8109 * var3 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterOffset"), var6);
	}

	@ObfuscatedName("xt.m(Lbg;I)V")
	public void method2208(class81 arg0, int arg1) {
		if (!this.field7511) {
			this.field1062.method13315(arg0);
			this.field1062.method13316(arg1);
		}
	}
}
