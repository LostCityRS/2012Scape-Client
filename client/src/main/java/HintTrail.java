import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("nj")
public class HintTrail {

    @ObfuscatedName("nj.u")
    public static int field4221 = 0;

    @ObfuscatedName("nj.j")
    public final int field4217;

    @ObfuscatedName("nj.a")
    public final int field4218;

    @ObfuscatedName("nj.s")
    public final int[] field4216;

    @ObfuscatedName("nj.c")
    public final int[] field4220;

    @ObfuscatedName("nj.m")
    public LinkedList field4219;

    public HintTrail(RendererToolkit arg0, Packet arg1, int arg2) {
        this.field4217 = arg2;
        this.field4218 = arg1.gSmart1or2s();
        this.field4216 = new int[this.field4218];
        this.field4220 = new int[this.field4218];
        int var4 = arg1.g2();
        int var5 = arg1.g2();
        for (int var6 = 0; var6 < this.field4218; var6++) {
            this.field4216[var6] = var4 + arg1.g1b();
            this.field4220[var6] = var5 + arg1.g1b();
        }
        this.method6950(arg0);
    }

    @ObfuscatedName("nj.u(Lra;S)Lqa;")
    public Model method6950(RendererToolkit arg0) {
        ModelUnlit var2 = ModelUnlit.method2664(Statics.field4560, this.field4217, 0);
        if (var2 == null) {
            return null;
        } else {
            if (var2.field1314 < 13) {
                var2.method2634(2);
            }
            return arg0.method625(var2, 2048, field4221, 64, 768);
        }
    }

    @ObfuscatedName("nj.j(Loo;I)V")
    public void method6951(Scene arg0) {
        if (arg0 == null || this.field4218 <= 0) {
            return;
        }
        this.method6953(arg0);
        Iterator var2 = this.field4219.iterator();
        while (var2.hasNext()) {
            HintTrailPoint var3 = (HintTrailPoint) var2.next();
            arg0.method7412(var3, false);
        }
    }

    @ObfuscatedName("nj.a(Loo;S)V")
    public void method6952(Scene arg0) {
        if (arg0 == null || this.field4219 == null) {
            return;
        }
        Iterator var2 = this.field4219.iterator();
        while (var2.hasNext()) {
            HintTrailPoint var3 = (HintTrailPoint) var2.next();
            arg0.method7430(var3.level, var3.field10510, var3.field10509, new HintTrailPointPrimaryLayerEntityPredicate(var3));
        }
    }

    @ObfuscatedName("nj.s(Loo;I)V")
    public void method6953(Scene arg0) {
        this.field4219 = new LinkedList();
        SceneLevelTileFlags var2 = client.world.getSceneLevelTileFlags();
        CoordGrid var3 = client.world.method6214();
        CoordGrid var4 = new CoordGrid(Statics.currentPlayerLevel, this.field4216[0], this.field4220[0]);
        for (int var5 = 1; var5 < this.field4218; var5++) {
            CoordGrid var6 = new CoordGrid(Statics.currentPlayerLevel, this.field4216[var5], this.field4220[var5]);
            while (var4.x != var6.x || var4.z != var6.z) {
                if (var4.x < var6.x) {
                    var4.x++;
                } else if (var4.x > var6.x) {
                    var4.x--;
                }
                if (var4.z < var6.z) {
                    var4.z++;
                } else if (var4.z > var6.z) {
                    var4.z--;
                }
                int var7 = Statics.currentPlayerLevel;
                int var8 = var4.x - var3.x;
                int var9 = var4.z - var3.z;
                if (var8 >= 0 && var8 < arg0.field4495 && var9 >= 0 && var9 < arg0.field4496) {
                    int var10 = (var8 << 9) + 256;
                    int var11 = (var9 << 9) + 256;
                    if (var2.isLinkBelow(var8, var9)) {
                        var7++;
                    }
                    this.field4219.add(new HintTrailPoint(arg0, this, Statics.currentPlayerLevel, var7, var10, client.getHeightmapY(var10, var11, Statics.currentPlayerLevel), var11));
                }
            }
            var4 = var6;
        }
    }

    @ObfuscatedName("ej.c(IB)V")
    public static void method3109(int arg0) {
        field4221 = arg0;
    }
}
