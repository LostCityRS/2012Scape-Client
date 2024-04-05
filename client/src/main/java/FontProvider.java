import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("je")
public class FontProvider {

    @ObfuscatedName("je.u")
    public final Js5 field3301;

    @ObfuscatedName("je.j")
    public final Js5 field3302;

    @ObfuscatedName("je.a")
    public final SoftLruHashTable field3303 = new SoftLruHashTable(20);

    @ObfuscatedName("je.s")
    public final int[] field3304;

    @ObfuscatedName("je.c")
    public Map field3305 = null;

    public FontProvider(Js5 arg0, Js5 arg1, int[] arg2) {
        this.field3301 = arg0;
        this.field3302 = arg1;
        if (arg2 == null) {
            this.field3304 = null;
        } else {
            this.field3304 = arg2;
        }
    }

    @ObfuscatedName("je.u(Ljd;I)V")
    public void method4837(FontFactory arg0) {
        this.field3305 = new HashMap(this.field3304.length);
        for (int var2 = 0; var2 < this.field3304.length; var2++) {
            int var3 = this.field3304[var2];
            FontMetrics var4 = FontMetrics.method14876(this.field3302, var3);
            byte[] var5 = this.field3301.method5635(var3);
            Object var6 = arg0.method1321(var5, var4, true);
            this.field3305.put(var2, new Pair(var6, var4));
        }
    }

    @ObfuscatedName("je.j(B)V")
    public void method4838() {
        this.field3305 = null;
    }

    @ObfuscatedName("je.a(B)I")
    public int method4839() {
        return this.method4840(false);
    }

    @ObfuscatedName("je.s(ZI)I")
    public int method4840(boolean arg0) {
        if (this.field3304 == null) {
            return 0;
        } else if (arg0 || this.field3305 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3304.length; var3++) {
                int var4 = this.field3304[var3];
                if (this.field3301.method5630(var4)) {
                    var2++;
                }
                if (this.field3302.method5630(var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return this.field3304.length * 2;
        }
    }

    @ObfuscatedName("je.c(B)I")
    public int method4841() {
        return this.field3304 == null ? 0 : this.field3304.length * 2;
    }

    @ObfuscatedName("je.m(Ljd;IZZI)Ljava/lang/Object;")
    public Object method4859(FontFactory arg0, int arg1, boolean arg2, boolean arg3) {
        Pair var5 = this.method4844(arg0, arg1, arg2, arg3);
        return var5 == null ? null : var5.field6757;
    }

    @ObfuscatedName("je.t(Ljd;IS)Lvm;")
    public FontMetrics method4843(FontFactory arg0, int arg1) {
        Pair var3 = this.method4844(arg0, arg1, true, true);
        return var3 == null ? null : (FontMetrics) var3.field6756;
    }

    @ObfuscatedName("je.l(Ljd;IZZI)Luz;")
    public Pair method4844(FontFactory arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg1 == -1) {
            return null;
        }
        if (this.field3304 != null) {
            for (int var5 = 0; var5 < this.field3304.length; var5++) {
                if (this.field3304[var5] == arg1) {
                    return (Pair) this.field3305.get(var5);
                }
            }
        }
        Pair var6 = (Pair) this.field3303.get((long) (arg1 << 1 | (arg3 ? 1 : 0)));
        if (var6 != null) {
            if (arg2 && var6.field6756 == null) {
                FontMetrics var7 = FontMetrics.method14876(this.field3302, arg1);
                if (var7 == null) {
                    return null;
                }
                var6.field6756 = var7;
            }
            return var6;
        }
        byte[] var8 = this.field3301.method5635(arg1);
        if (var8 == null) {
            return null;
        }
        FontMetrics var9 = FontMetrics.method14876(this.field3302, arg1);
        if (var9 == null) {
            return null;
        }
        Pair var10;
        if (arg2) {
            var10 = new Pair(arg0.method1321(var8, var9, arg3), var9);
        } else {
            var10 = new Pair(arg0.method1321(var8, var9, arg3), null);
        }
        this.field3303.method7937(var10, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
        return var10;
    }

    @ObfuscatedName("je.f(I)V")
    public void method4849() {
        this.field3303.method7922();
    }

    @ObfuscatedName("je.d(II)V")
    public void method4846(int arg0) {
        this.field3303.method7921(arg0);
    }

    @ObfuscatedName("je.z(B)V")
    public void method4842() {
        this.field3303.removeSoft();
    }
}
