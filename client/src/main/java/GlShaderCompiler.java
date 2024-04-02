
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bd")
public class GlShaderCompiler {

	@ObfuscatedName("bd.j")
	public final GlToolkit field1064;

	@ObfuscatedName("bd.a")
	public final int field1065;

	@ObfuscatedName("bd.s")
	public static final int[] field1066 = new int[1];

	@ObfuscatedName("bd.u(Lyq;ILjava/lang/String;)Lbd;")
	public static GlShaderCompiler method2216(GlToolkit arg0, int arg1, String arg2) {
		int var3 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, var3);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, field1066, 0);
		if (field1066[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new GlShaderCompiler(arg0, arg1, var3);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	public GlShaderCompiler(GlToolkit arg0, int arg1, int arg2) {
		this.field1064 = arg0;
		this.field1065 = arg2;
	}

	public void finalize() throws Throwable {
		this.field1064.method13333(this.field1065);
		super.finalize();
	}
}
