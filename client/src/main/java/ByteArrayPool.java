import deob.ObfuscatedName;

@ObfuscatedName("sg")
public class ByteArrayPool {

    @ObfuscatedName("sg.u")
    public static int field6417 = 0;

    @ObfuscatedName("sg.j")
    public static int field6415 = 0;

    @ObfuscatedName("sg.a")
    public static int field6419 = 0;

    @ObfuscatedName("sg.s")
    public static byte[][] field6418 = new byte[1000][];

    @ObfuscatedName("sg.c")
    public static byte[][] field6416 = new byte[250][];

    @ObfuscatedName("sg.m")
    public static byte[][] field6420 = new byte[50][];

    public ByteArrayPool() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sg.u(IS)[B")
    public static synchronized byte[] method11364(int arg0) {
        if (arg0 == 100 && field6417 > 0) {
            byte[] var1 = field6418[--field6417];
            field6418[field6417] = null;
            return var1;
        } else if (arg0 == 5000 && field6415 > 0) {
            byte[] var2 = field6416[--field6415];
            field6416[field6415] = null;
            return var2;
        } else if (arg0 == 30000 && field6419 > 0) {
            byte[] var3 = field6420[--field6419];
            field6420[field6419] = null;
            return var3;
        } else {
            if (Statics.field6422 != null) {
                for (int var4 = 0; var4 < Statics.field642.length; var4++) {
                    if (Statics.field642[var4] == arg0 && Statics.field6421[var4] > 0) {
                        byte[] var5 = Statics.field6422[var4][--Statics.field6421[var4]];
                        Statics.field6422[var4][Statics.field6421[var4]] = null;
                        return var5;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("of.j([BI)V")
    public static synchronized void release(byte[] arg0) {
        if (arg0.length == 100 && field6417 < 1000) {
            field6418[++field6417 - 1] = arg0;
        } else if (arg0.length == 5000 && field6415 < 250) {
            field6416[++field6415 - 1] = arg0;
        } else if (arg0.length == 30000 && field6419 < 50) {
            field6420[++field6419 - 1] = arg0;
        } else if (Statics.field6422 != null) {
            for (int var1 = 0; var1 < Statics.field642.length; var1++) {
                if (Statics.field642[var1] == arg0.length && Statics.field6421[var1] < Statics.field6422[var1].length) {
                    Statics.field6422[var1][Statics.field6421[var1]++] = arg0;
                    return;
                }
            }
        }
    }
}
