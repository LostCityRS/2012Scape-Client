import deob.ObfuscatedName;

@ObfuscatedName("cm")
public class class104 {

    @ObfuscatedName("cm.u")
    public final GlToolkit field1174;

    @ObfuscatedName("cm.j")
    public final MaterialTypeList field1173;

    @ObfuscatedName("cm.a")
    public final WeightedCache field1172 = new WeightedCache(6291456, 256);

    public class104(GlToolkit arg0, MaterialTypeList arg1) {
        this.field1174 = arg0;
        this.field1173 = arg1;
    }

    @ObfuscatedName("cm.u(I)Lxp;")
    public GlRelated2 method2335(int arg0) {
        return this.method2324(arg0, -1);
    }

    @ObfuscatedName("cm.j(II)Lxp;")
    public GlRelated2 method2324(int arg0, int arg1) {
        GlRelated2 var3 = (GlRelated2) this.field1172.method7916((long) arg0);
        if (var3 != null) {
            return var3;
        } else if (this.method2322(arg0, arg1)) {
            Material var4 = this.field1173.method889(arg0);
            if (arg1 == -1) {
                arg1 = var4.field1252;
            }
            GlRelated2 var6;
            if (var4.field1245 && this.field1174.method600()) {
                float[] var5 = this.field1173.method888(arg0, 0.7F, arg1, arg1, false);
                var6 = new GlRelated2(this.field1174, 3553, TextureFormat.field1296, DataType.field1505, arg1, arg1, var4.field1275 != 0, var5, TextureFormat.field1296);
            } else {
                int[] var7;
                if (MaterialAlphaMode.field4853 != var4.field1262 && Material.method12638(var4.field1270)) {
                    var7 = this.field1173.method886(arg0, 0.7F, arg1, arg1, true);
                } else {
                    var7 = this.field1173.method887(arg0, 0.7F, arg1, arg1, false);
                }
                var6 = new GlRelated2(this.field1174, 3553, arg1, arg1, var4.field1275 != 0, var7, 0, 0, false);
            }
            var6.method12765(var4.field1273, var4.field1274);
            this.field1172.method7918(var6, (long) arg0, arg1 * arg1);
            return var6;
        } else {
            return null;
        }
    }

    @ObfuscatedName("cm.a(II)Z")
    public boolean method2322(int arg0, int arg1) {
        Material var3 = this.field1173.method889(arg0);
        if (arg1 == -1) {
            arg1 = var3.field1252;
        }
        if (var3.field1245 && this.field1174.method600()) {
            return this.field1173.method898(arg0, class455.field4850, 0.7F, arg1, arg1, false);
        } else if (MaterialAlphaMode.field4853 != var3.field1262 && Material.method12638(var3.field1270)) {
            return this.field1173.method898(arg0, class455.field4849, 0.7F, arg1, arg1, true);
        } else {
            return this.field1173.method898(arg0, class455.field4848, 0.7F, arg1, arg1, false);
        }
    }

    @ObfuscatedName("cm.s()V")
    public void method2326() {
        this.field1172.method7921(5);
    }

    @ObfuscatedName("cm.c()V")
    public void method2327() {
        this.field1172.method7922();
    }
}
