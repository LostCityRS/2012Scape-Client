import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("ay")
public class CpuProfiling {

    public CpuProfiling() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ig.j(I)I")
    public static int method4552() {
        Canvas var0 = new Canvas();
        var0.setSize(100, 100);
        RendererToolkit var1 = RendererToolkit.method11222(0, var0, null, null, 0);
        long var2 = MonotonicTime.method5554();
        for (int var4 = 0; var4 < 10000; var4++) {
            var1.method491(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
        }
        int var5 = (int) (MonotonicTime.method5554() - var2);
        var1.method496(0, 0, 100, 100, -16777216);
        var1.method442();
        return var5;
    }
}
