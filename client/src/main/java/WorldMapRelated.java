import deob.ObfuscatedName;

@ObfuscatedName("of")
public class WorldMapRelated {

    @ObfuscatedName("of.u")
    public int field4255;

    @ObfuscatedName("of.j")
    public int[] field4254;

    @ObfuscatedName("of.a")
    public int[] field4253;

    public WorldMapRelated(int arg0) {
        this.field4255 = arg0;
        this.field4254 = new int[this.field4255];
        this.field4253 = new int[this.field4255];
    }

    @ObfuscatedName("dc.u(Lls;Ljava/lang/String;ZI)Lof;")
    public static WorldMapRelated method2791(Js5 arg0, String arg1, boolean arg2) {
        int var3 = arg0.method5688(arg1);
        if (var3 == -1) {
            return new WorldMapRelated(0);
        }
        int[] var4 = arg0.method5683(var3);
        WorldMapRelated var5 = new WorldMapRelated(var4.length);
        int var6 = 0;
        int var7 = 0;
        while (true) {
            while (var6 < var5.field4255) {
                Packet var8 = new Packet(arg0.fetchFile(var3, var4[var7++]));
                int var9 = var8.g4s();
                int var10 = var8.g2();
                int var11 = var8.g1();
                if (!arg2 && var11 == 1) {
                    var5.field4255--;
                } else {
                    var5.field4254[var6] = var9;
                    var5.field4253[var6] = var10;
                    var6++;
                }
            }
            return var5;
        }
    }
}
