import deob.ObfuscatedName;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("qy")
public class ClientWatch {

    @ObfuscatedName("qy.u")
    public static long field5044 = -1L;

    @ObfuscatedName("qy.j")
    public static int field5043 = 0;

    @ObfuscatedName("qy.a")
    public static boolean field5042 = true;

    @ObfuscatedName("qy.s")
    public static final AppletMouseLogger field5040 = new AppletMouseLogger();

    @ObfuscatedName("qy.c")
    public static final NativeMouseLogger field5045 = new NativeMouseLogger();

    @ObfuscatedName("qy.m")
    public static Queue field5041 = new LinkedList();

    public ClientWatch() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("zx.u(I)V")
    public static void method13902() {
        if (NativeMouse.method2792()) {
            NativeMouse.method6260(new NativeMouseLoggerNativeMouseListener());
        }
    }

    @ObfuscatedName("aiw.j(I)V")
    public static void method16253() {
        NativeMouse.method12637();
    }

    @ObfuscatedName("lw.a(I)V")
    public static void method5946() {
        field5040.method8350();
        field5045.method8350();
        field5044 = -1L;
        field5042 = true;
    }

    @ObfuscatedName("is.s(Ladv;I)V")
    public static void method4631(BasicMouseEvent arg0) {
        if (client.method1608(client.state)) {
            field5040.method8370(arg0);
        } else {
            arg0.method15186();
        }
    }

    @ObfuscatedName("it.c(I)V")
    public static void method4710() {
        Queue var0 = field5041;
        synchronized (field5041) {
            Point var1;
            if (Statics.field1231.isShowing()) {
                var1 = Statics.field1231.getLocationOnScreen();
            } else {
                var1 = null;
            }
            while (true) {
                while (true) {
                    NativeMouseEvent var2 = (NativeMouseEvent) field5041.poll();
                    if (var2 == null) {
                        return;
                    }
                    if (var1 != null && Statics.field1231.isShowing() && Statics.field578) {
                        var2.method16843(var1);
                        if (!var2.method16850() && var2.method15182() < Statics.field4125 && var2.method15183() < Statics.field4677 && var2.method15182() >= 0 && var2.method15183() >= 0) {
                            int var3 = var2.method15181();
                            if (var2.method15181() == -1) {
                                field5045.method8370(var2);
                            } else if (BasicMouseEvent.method3926(var3)) {
                                field5045.method15627(var2);
                            }
                        }
                    } else {
                        var2.method15186();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ic.m(B)V")
    public static void method4689() {
        Queue var0 = field5041;
        synchronized (field5041) {
            while (true) {
                NativeMouseEvent var1 = (NativeMouseEvent) field5041.poll();
                if (var1 == null) {
                    return;
                }
                var1.method15186();
            }
        }
    }

    @ObfuscatedName("di.t(I)V")
    public static void method2676() {
        method4710();
        field5040.method8371();
        field5045.method8371();
        if (client.field8953 > 0) {
            ClientMessage var0 = ClientMessage.createMessage(ClientProt.field2878, client.gameConnection.randomOut);
            var0.field9467.p2(client.field8953 * 4);
            for (int var1 = 0; var1 < client.field8953; var1++) {
                KeyboardEvent var2 = client.field9072[var1];
                long var3 = var2.method7287() - field5044;
                if (var3 > 16777215L) {
                    var3 = 16777215L;
                }
                field5044 = var2.method7287();
                var0.field9467.p1(var2.method7286());
                var0.field9467.p3((int) var3);
            }
            client.gameConnection.queue(var0);
        }
        if (field5043 > 0) {
            field5043--;
        }
        if (client.field9028 && field5043 <= 0) {
            field5043 = 20;
            client.field9028 = false;
            ClientMessage var5 = ClientMessage.createMessage(ClientProt.field2882, client.gameConnection.randomOut);
            var5.field9467.p2_alt3((int) client.field9171 >> 3);
            var5.field9467.p2_alt3((int) client.field9021 >> 3);
            client.gameConnection.queue(var5);
        }
        if (Statics.field578 != field5042) {
            field5042 = Statics.field578;
            ClientMessage var6 = ClientMessage.createMessage(ClientProt.field2925, client.gameConnection.randomOut);
            var6.field9467.p1(Statics.field578 ? 1 : 0);
            client.gameConnection.queue(var6);
        }
        if (client.field8932) {
            return;
        }
        ClientMessage var7 = ClientMessage.createMessage(ClientProt.field2888, client.gameConnection.randomOut);
        var7.field9467.p1(0);
        int var8 = var7.field9467.pos;
        Packet var9 = Statics.clientOptions.method15447();
        var7.field9467.pdata(var9.data, 0, var9.pos);
        var7.field9467.psize1(var7.field9467.pos - var8);
        client.gameConnection.queue(var7);
        client.field8932 = true;
    }
}
