import deob.ObfuscatedName;

@ObfuscatedName("sh")
public class VideoTypeList {

    @ObfuscatedName("sh.j")
    public static IterableMap field6388 = new IterableMap(4);

    @ObfuscatedName("sh.a")
    public static final VideoOggTheoraRelated field6390 = new VideoOggTheoraRelated();

    public VideoTypeList() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oi.u(IIZI)V")
    public static void method7358(int arg0, int arg1, boolean arg2) {
        if (field6388.getNode((long) arg0) != null) {
            return;
        }
        if (client.field8944) {
            VideoType var3 = new VideoType(arg0, new Js5Video(4096, Statics.field2117, arg0), arg1, arg2);
            var3.field9618.method7003(Statics.field2308.method11187());
            field6388.method11927(var3, (long) arg0);
        } else {
            method5563(arg0, arg2);
        }
    }

    @ObfuscatedName("ti.j(IB)V")
    public static void method11689(int arg0) {
        VideoType var1 = (VideoType) field6388.getNode((long) arg0);
        if (var1 != null) {
            var1.field9622 = !var1.field9622;
            var1.field9618.method7018(var1.field9622);
        }
    }

    @ObfuscatedName("eu.a(II)V")
    public static void method2930(int arg0) {
        VideoType var1 = (VideoType) field6388.getNode((long) arg0);
        if (var1 != null) {
            var1.field9618.method7022();
            method5563(var1.field9624, var1.field9621);
            var1.method6979();
        }
    }

    @ObfuscatedName("kg.s(IZI)V")
    public static void method5563(int arg0, boolean arg1) {
        if (arg1) {
            ClientMessage var2 = ClientMessage.createMessage(ClientProt.field2867, client.gameConnection.randomOut);
            var2.field9467.p2(arg0);
            client.gameConnection.queue(var2);
        } else {
            ScriptRunner.method1372(ClientTriggerType.field7307, arg0, -1);
        }
    }

    @ObfuscatedName("ap.c(IB)Ljava/lang/String;")
    public static String method1723(int arg0) {
        VideoType var1 = (VideoType) field6388.getNode((long) arg0);
        if (var1 != null) {
            OggKateStream var2 = var1.field9618.method7014();
            if (var2 != null) {
                double var3 = var1.field9618.method7039();
                if ((double) var2.method16825() <= var3 && (double) var2.method16826() >= var3) {
                    return var2.method16823();
                }
            }
        }
        return null;
    }

    @ObfuscatedName("jf.m(Lra;II)Lce;")
    public static Sprite method4742(RendererToolkit arg0, int arg1) {
        VideoType var2 = (VideoType) field6388.getNode((long) arg1);
        if (var2 != null) {
            OggTheoraStream var3 = var2.field9618.method7029();
            var2.field9620 = true;
            if (var3 != null) {
                field6390.field6386 = arg0;
                return (Sprite) var3.method16817(field6390);
            }
        }
        return null;
    }

    @ObfuscatedName("aje.t(I)V")
    public static void method16665() {
        for (VideoType var0 = (VideoType) field6388.method11928(); var0 != null; var0 = (VideoType) field6388.method11929()) {
            if (var0.field9618.method7015()) {
                method2930(var0.field9624);
            } else {
                var0.field9618.method15486();
                try {
                    var0.field9618.method7006();
                } catch (Exception var4) {
                    JagException.method16252("" + var0.field9624, var4);
                    method2930(var0.field9624);
                }
                if (!var0.field9623 && !var0.field9622) {
                    OggVorbisStream var2 = var0.field9618.method7009();
                    if (var2 != null) {
                        OggVorbisStreamRelated1 var3 = var2.method16795();
                        if (var3 != null) {
                            var3.method16466(var0.field9619);
                            Statics.field4201.method16452(var3);
                            var0.field9623 = true;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("wl.l(I)V")
    public static void method12632() {
        for (VideoType var0 = (VideoType) field6388.method11928(); var0 != null; var0 = (VideoType) field6388.method11929()) {
            if (var0.field9620) {
                var0.field9620 = false;
            } else {
                method2930(var0.field9624);
            }
        }
    }

    @ObfuscatedName("jf.f(I)V")
    public static void method4743() {
        for (VideoType var0 = (VideoType) field6388.method11928(); var0 != null; var0 = (VideoType) field6388.method11929()) {
            method2930(var0.field9624);
        }
    }
}
