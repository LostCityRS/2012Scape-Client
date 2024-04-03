import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ms")
public class class373 {

    @ObfuscatedName("ms.u")
    public static LinkedList field4012 = new LinkedList();

    public class373() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nf.u(I)V")
    public static void method6640() {
        int var0 = field4012.size();
        Iterator var1 = field4012.iterator();
        while (var1.hasNext()) {
            VorbisSound var2 = (VorbisSound) var1.next();
            var2.method15069(var2.method15074() + var2.method15072() / (var0 * 2));
            if (!var2.method15071()) {
                var1.remove();
            }
        }
    }

    @ObfuscatedName("jr.j(Ladr;I)V")
    public static void method4778(VorbisSound arg0) {
        if (!field4012.contains(arg0)) {
            field4012.add(arg0);
        }
    }
}
