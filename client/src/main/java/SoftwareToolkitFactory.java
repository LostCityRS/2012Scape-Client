import deob.ObfuscatedName;

import java.awt.Canvas;

@ObfuscatedName("cr")
public class SoftwareToolkitFactory {

    public SoftwareToolkitFactory() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.u(Ljava/awt/Canvas;Lma;IIB)Lra;")
    public static RendererToolkit method1619(Canvas arg0, MaterialTypeList arg1, int arg2, int arg3) {
        return new ja(arg0, arg1, arg2, arg3);
    }
}
