import deob.ObfuscatedName;

import java.awt.Canvas;

@ObfuscatedName("jy")
public class DxToolkitFactory {

    public DxToolkitFactory() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jy.u(Ljava/awt/Canvas;Lma;Lls;I)Lra;")
    public static RendererToolkit method4912(Canvas arg0, MaterialTypeList arg1, Js5 arg2, int arg3) {
        try {
            boolean var4 = GpuToolkit.method13494();
            if (!var4) {
                throw new RuntimeException("");
            } else if (NativeLibraries.method11710().method6800("jagdx")) {
                return DxToolkit.method16047(arg0, arg1, arg2, arg3);
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var7) {
            throw var7;
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
