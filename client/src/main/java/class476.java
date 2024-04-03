import deob.ObfuscatedName;

import java.util.Queue;

@ObfuscatedName("qe")
public final class class476 implements class494 {

    @ObfuscatedName("qe.u(ZI)V")
    public void method8306(boolean arg0) {
    }

    @ObfuscatedName("qe.j(IIIB)V")
    public void method8307(int arg0, int arg1, int arg2) {
        int var4 = arg0 >> 16;
        int var5 = arg0 & 0xFFFF;
        Queue var6 = class477.field5041;
        synchronized (class477.field5041) {
            class477.field5041.add(NativeMouseEvent.method7166(var4, var5, arg1, arg2));
        }
    }
}
