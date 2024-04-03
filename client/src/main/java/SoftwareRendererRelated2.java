import deob.ObfuscatedName;

@ObfuscatedName("cp")
public class SoftwareRendererRelated2 {

    @ObfuscatedName("cp.u")
    public static int field1192 = 0;

    @ObfuscatedName("cp.j")
    public static boolean field1193 = false;

    @ObfuscatedName("cp.a")
    public static final IterableQueue field1194 = new IterableQueue();

    public SoftwareRendererRelated2() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.u(Lua;I)V")
    public static synchronized void method2358(SoftwareRendererRelated arg0) {
        if (field1193) {
            return;
        }
        if (field1192 > 0) {
            ObjectNode var1 = new ObjectNode(arg0);
            field1194.method11558(var1);
        } else {
            arg0.method92(false);
        }
    }

    @ObfuscatedName("cp.j(B)V")
    public static synchronized void method2359() {
        while (true) {
            ObjectNode var0 = (ObjectNode) field1194.method11560();
            if (var0 == null) {
                return;
            }
            ((SoftwareRendererRelated) var0.field9550).method92(true);
            var0.method6979();
        }
    }

    @ObfuscatedName("cp.a(B)V")
    public static synchronized void method2360() {
        field1192++;
    }

    @ObfuscatedName("cp.s(I)V")
    public static synchronized void method2361() {
        field1192--;
        if (field1192 == 0) {
            method2359();
        }
    }
}
