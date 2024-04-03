import deob.ObfuscatedName;

@ObfuscatedName("cp")
public class cp {

    @ObfuscatedName("cp.u")
    public static int field1192 = 0;

    @ObfuscatedName("cp.j")
    public static boolean field1193 = false;

    @ObfuscatedName("cp.a")
    public static final IterableQueue field1194 = new IterableQueue();

    public cp() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.u(Lua;I)V")
    public static synchronized void method2358(ua arg0) {
        if (field1193) {
            return;
        }
        if (field1192 > 0) {
            ObjectNode var1 = new ObjectNode(arg0);
            field1194.method11558(var1);
        } else {
            arg0.ma(false);
        }
    }

    @ObfuscatedName("cp.j(B)V")
    public static synchronized void method2359() {
        while (true) {
            ObjectNode var0 = (ObjectNode) field1194.method11560();
            if (var0 == null) {
                return;
            }
            ((ua) var0.field9550).ma(true);
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
