
import deob.ObfuscatedName;
import java.awt.Canvas;

@ObfuscatedName("cs")
public class GlToolkitFactory {

	public GlToolkitFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cs.u(Ljava/awt/Canvas;Lma;I)Lra;")
	public static RendererToolkit method2346(Canvas arg0, BillboardTypeList arg1, int arg2) {
		return new GlToolkit(arg0, arg1, arg2);
	}
}
