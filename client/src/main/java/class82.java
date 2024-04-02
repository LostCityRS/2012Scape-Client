
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bl")
public class class82 {

	@ObfuscatedName("bl.a")
	public static final int[] field1056 = new int[2];

	@ObfuscatedName("bl.s")
	public final GlToolkit field1059;

	@ObfuscatedName("bl.c")
	public final int field1060;

	@ObfuscatedName("bl.u(Lyq;ILjava/lang/String;)Lbl;")
	public static class82 method2080(GlToolkit arg0, int arg1, String arg2) {
		int var3 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(var3, arg2);
		OpenGL.glCompileShader(var3);
		OpenGL.glGetShaderiv(var3, 35713, field1056, 0);
		if (field1056[0] == 0) {
			if (field1056[0] == 0) {
				System.out.println("");
			}
			OpenGL.glGetShaderiv(var3, 35716, field1056, 1);
			if (field1056[1] > 1) {
				byte[] var4 = new byte[field1056[1]];
				OpenGL.glGetShaderInfoLog(var3, field1056[1], field1056, 0, var4, 0);
				System.out.println(new String(var4));
			}
			if (field1056[0] == 0) {
				OpenGL.glDeleteShader(var3);
				return null;
			}
		}
		return new class82(arg0, var3, arg1);
	}

	public class82(GlToolkit arg0, int arg1, int arg2) {
		this.field1059 = arg0;
		this.field1060 = arg1;
	}

	public void finalize() throws Throwable {
		this.field1059.method13332((long) this.field1060);
		super.finalize();
	}
}
