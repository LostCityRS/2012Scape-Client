
import deob.ObfuscatedName;
import jaggl.OpenGL;
import java.awt.Canvas;

@ObfuscatedName("lz")
public class GlxToolkitFactory {

	public GlxToolkitFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("lz.u(Ljava/awt/Canvas;Lma;Lls;I)Lra;")
	public static RendererToolkit method6008(Canvas arg0, BillboardTypeList arg1, Js5 arg2, int arg3) {
		try {
			boolean var4 = GpuToolkit.method13494();
			if (!var4) {
				throw new RuntimeException("");
			} else if (NativeLibraries.method11710().method6800("jaggl")) {
				RendererToolkit.method16838(arg0);
				OpenGL var5 = new OpenGL();
				long var6 = var5.init(arg0, 8, 8, 8, 24, 0, arg3);
				if (var6 == 0L) {
					throw new RuntimeException("");
				}
				GlxToolkit var8 = new GlxToolkit(var5, arg0, var6, arg1, arg2, arg3);
				var8.method13495();
				return var8;
			} else {
				throw new RuntimeException("");
			}
		} catch (RuntimeException var11) {
			throw var11;
		} catch (Throwable var12) {
			throw new RuntimeException("");
		}
	}
}
