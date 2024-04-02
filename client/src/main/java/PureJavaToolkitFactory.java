
import deob.ObfuscatedName;
import java.awt.Canvas;

@ObfuscatedName("aj")
public class PureJavaToolkitFactory {

	public PureJavaToolkitFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aab.u(Ljava/awt/Canvas;Lma;IIB)Lra;")
	public static RendererToolkit method13911(Canvas arg0, MaterialTypeList arg1, int arg2, int arg3) {
		return new PureJavaToolkit(arg0, arg1, arg2, arg3);
	}
}
