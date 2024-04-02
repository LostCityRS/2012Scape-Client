
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bf")
public class class79 {

	@ObfuscatedName("bf.u")
	public static final int[] field1027 = new int[2];

	@ObfuscatedName("bf.j")
	public final class682 field1026;

	@ObfuscatedName("bf.a")
	public final int field1028;

	@ObfuscatedName("bf.u(Lyq;[Lbl;)Lbf;")
	public static class79 method2027(class682 arg0, class82[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg1[var2] == null || arg1[var2].field1060 <= 0) {
				return null;
			}
		}
		int var3 = OpenGL.glCreateProgram();
		for (int var4 = 0; var4 < arg1.length; var4++) {
			OpenGL.glAttachShader(var3, arg1[var4].field1060);
		}
		OpenGL.glLinkProgram(var3);
		OpenGL.glGetProgramiv(var3, 35714, field1027, 0);
		if (field1027[0] == 0) {
			OpenGL.glGetProgramiv(var3, 35716, field1027, 1);
			if (field1027[1] > 1) {
				byte[] var5 = new byte[field1027[1]];
				OpenGL.glGetProgramInfoLog(var3, field1027[1], field1027, 0, var5, 0);
				System.out.println(new String(var5));
			}
			if (field1027[0] == 0) {
				for (int var6 = 0; var6 < arg1.length; var6++) {
					OpenGL.glDetachShader(var3, arg1[var6].field1060);
				}
				OpenGL.glDeleteProgram(var3);
				return null;
			}
		}
		return new class79(arg0, var3, arg1);
	}

	public class79(class682 arg0, int arg1, class82[] arg2) {
		this.field1026 = arg0;
		this.field1028 = arg1;
	}

	public void finalize() throws Throwable {
		this.field1026.method13332((long) this.field1028);
		super.finalize();
	}
}
