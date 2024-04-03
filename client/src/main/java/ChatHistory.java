import deob.ObfuscatedName;

@ObfuscatedName("ek")
public class ChatHistory {

    @ObfuscatedName("ek.a")
    public static final ChatLine[] field2097 = new ChatLine[100];

    @ObfuscatedName("ek.s")
    public static int field2099 = 0;

    public ChatHistory() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ib.u(I)I")
    public static int method4608() {
        return ++field2099 - 1;
    }

    @ObfuscatedName("b.a(ILjava/lang/String;S)V")
    public static void method1587(int arg0, String arg1) {
        method3943(arg0, 0, "", "", "", arg1);
    }

    @ObfuscatedName("gz.s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3943(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5) {
        method13903(arg0, arg1, arg2, arg3, arg4, arg5, null, -1);
    }

    @ObfuscatedName("zx.c(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static void method13903(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7) {
        ChatLine var8 = field2097[99];
        for (int var9 = 99; var9 > 0; var9--) {
            field2097[var9] = field2097[var9 - 1];
        }
        if (var8 == null) {
            var8 = new ChatLine(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5);
        } else {
            var8.method3493(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5);
        }
        field2097[0] = var8;
        Statics.field2098++;
        client.field9130 = client.field9132;
    }

    @ObfuscatedName("gz.m(II)Lep;")
    public static ChatLine method3941(int arg0) {
        return arg0 >= 0 && arg0 < 100 ? field2097[arg0] : null;
    }

    @ObfuscatedName("pv.t(I)I")
    public static int method7655() {
        return Statics.field2098;
    }
}
