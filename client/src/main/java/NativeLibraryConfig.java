import deob.ObfuscatedName;

import java.io.File;

@ObfuscatedName("wc")
public class NativeLibraryConfig {

    @ObfuscatedName("wc.u")
    public static final String field7296;

    @ObfuscatedName("wc.j")
    public static final String field7297;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var17) {
        }
        var0.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var16) {
        }
        var2.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var15) {
        }
        field7296 = var4.toLowerCase();
        String var6 = "Unknown";
        try {
            var6 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var14) {
        }
        field7297 = var6.toLowerCase();
        String var8 = "Unknown";
        try {
            var8 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var13) {
        }
        var8.toLowerCase();
        String var10 = "~/";
        try {
            var10 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var12) {
        }
        new File(var10);
    }

    public NativeLibraryConfig() throws Throwable {
        throw new Error();
    }
}
