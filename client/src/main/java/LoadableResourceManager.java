import deob.ObfuscatedName;
import jaclib.ping.Ping;

@ObfuscatedName("ke")
public class LoadableResourceManager {

    @ObfuscatedName("ke.j")
    public static int field3495 = 0;

    @ObfuscatedName("ke.a")
    public static int field3494 = 0;

    public LoadableResourceManager() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("me.u(I)I")
    public static int method6562() {
        if (field3495 == 0) {
            LoadableResource.field6838.method12193(new Js5DllResourceLoader("jaclib"));
            if (LoadableResource.field6838.method12192().method5533() != 100) {
                return 1;
            }
            if (!((Js5DllResourceLoader) LoadableResource.field6838.method12192()).method5557()) {
                Statics.field1543.method6676();
                class477.method13902();
                try {
                    Ping.init();
                } catch (Throwable var19) {
                }
            }
            field3495 = 1;
        }
        if (field3495 == 1) {
            Statics.field3496 = LoadableResource.method12194();
            LoadableResource.field6859.method12193(new Js5ArchiveResourceLoader(Statics.field849));
            LoadableResource.field6839.method12193(new Js5DllResourceLoader("jaggl"));
            LoadableResource.field6840.method12193(new Js5DllResourceLoader("jagdx"));
            LoadableResource.field6841.method12193(new Js5DllResourceLoader("sw3d"));
            LoadableResource.field6842.method12193(new Js5DllResourceLoader("hw3d"));
            LoadableResource.field6843.method12193(new Js5DllResourceLoader("jagtheora"));
            LoadableResource.field6844.method12193(new Js5ArchiveResourceLoader(Statics.field2670));
            LoadableResource.field6862.method12193(new Js5ArchiveResourceLoader(Statics.field7572));
            LoadableResource.field6837.method12193(new Js5ArchiveResourceLoader(Statics.field7435));
            LoadableResource.field6847.method12193(new Js5ArchiveResourceLoader(Statics.field1565));
            LoadableResource.field6864.method12193(new Js5ArchiveResourceLoader(Statics.field6451));
            LoadableResource.field6858.method12193(new Js5ArchiveResourceLoader(Statics.field5080));
            LoadableResource.field6850.method12193(new Js5ArchiveResourceLoader(Statics.field5130));
            LoadableResource.field6851.method12193(new Js5ArchiveResourceLoader(Statics.field3897));
            LoadableResource.field6852.method12193(new Js5ArchiveResourceLoader(Statics.field2070));
            LoadableResource.field6853.method12193(new Js5ArchiveResourceLoader(Statics.field4229));
            LoadableResource.field6848.method12193(new Js5ArchiveResourceLoader(Statics.field6343));
            LoadableResource.field6855.method12193(new Js5ArchiveResourceLoader(Statics.field6712));
            LoadableResource.field6845.method12193(new Js5ArchiveResourceLoader(Statics.field8655));
            LoadableResource.field6857.method12193(new Js5ArchiveResourceLoader(Statics.field8734));
            LoadableResource.field6854.method12193(new Js5FileResourceLoader(Statics.field3523, "huffman"));
            LoadableResource.field6846.method12193(new Js5ArchiveResourceLoader(Statics.field2653));
            LoadableResource.field6860.method12193(new Js5ArchiveResourceLoader(Statics.field6651));
            LoadableResource.field6861.method12193(new Js5ArchiveResourceLoader(Statics.field8745));
            LoadableResource.field6849.method12193(new Js5GroupResourceLoader(Statics.field4059, "details"));
            for (int var1 = 0; var1 < Statics.field3496.length; var1++) {
                if (Statics.field3496[var1].method12192() == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            LoadableResource[] var3 = Statics.field3496;
            for (int var4 = 0; var4 < var3.length; var4++) {
                LoadableResource var5 = var3[var4];
                int var6 = var5.method12190();
                int var7 = var5.method12192().method5533();
                var2 += var6 * var7 / 100;
            }
            field3494 = var2;
            field3495 = 2;
        }
        if (Statics.field3496 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        LoadableResource[] var11 = Statics.field3496;
        for (int var12 = 0; var12 < var11.length; var12++) {
            LoadableResource var13 = var11[var12];
            int var14 = var13.method12190();
            int var15 = var13.method12192().method5533();
            if (var15 < 100) {
                var10 = false;
            }
            var8 += var14;
            var9 += var14 * var15 / 100;
        }
        if (var10) {
            if (!((Js5DllResourceLoader) LoadableResource.field6843.method12192()).method5557()) {
                client.field8944 = Statics.field1543.method6677();
            }
            Statics.field3496 = null;
        }
        int var16 = var9 - field3494;
        int var17 = var8 - field3494;
        int var18 = var17 > 0 ? var16 * 100 / var17 : 100;
        if (!var10 && var18 > 99) {
            var18 = 99;
        }
        return var18;
    }
}
