import deob.ObfuscatedName;

@ObfuscatedName("hm")
public class GpuRelated13 {

    @ObfuscatedName("hm.u")
    public final GpuToolkit field2447;

    @ObfuscatedName("hm.j")
    public final MaterialTypeList field2446;

    @ObfuscatedName("hm.a")
    public SoftLruHashTable field2448 = new SoftLruHashTable(6291456, 256);

    public GpuRelated13(GpuToolkit arg0, MaterialTypeList arg1) {
        this.field2447 = arg0;
        this.field2446 = arg1;
    }

    @ObfuscatedName("hm.u(I)Lhc;")
    public GpuTexture method4359(int arg0) {
        return this.method4349(arg0, -1);
    }

    @ObfuscatedName("hm.j(II)Lhc;")
    public GpuTexture method4349(int arg0, int arg1) {
        long var3 = (long) (arg1 << 16 | arg0);
        GpuTexture var5 = (GpuTexture) this.field2448.get(var3);
        if (var5 != null) {
            return var5;
        } else if (this.method4350(arg0, arg1)) {
            Material var6 = this.field2446.method889(arg0);
            if (arg1 == -1) {
                arg1 = var6.field1252;
            }
            GpuTexture var8;
            if (var6.field1245 && this.field2447.isBloomEnabled()) {
                float[] var7 = this.field2446.method888(arg0, 0.7F, arg1, arg1, false);
                var8 = this.field2447.method13697(TextureFormat.field1296, arg1, arg1, true, var7);
            } else {
                int[] var9;
                if (MaterialAlphaMode.field4853 != var6.field1262 && Material.method12638(var6.field1270)) {
                    var9 = this.field2446.method886(arg0, 0.7F, arg1, arg1, true);
                } else {
                    var9 = this.field2446.method887(arg0, 0.7F, arg1, arg1, false);
                }
                var8 = this.field2447.method13548(arg1, arg1, true, var9);
            }
            var8.method4412(var6.field1273, var6.field1274);
            this.field2448.method7918(var8, var3, arg1 * arg1);
            return var8;
        } else {
            return null;
        }
    }

    @ObfuscatedName("hm.a(II)Z")
    public boolean method4350(int arg0, int arg1) {
        Material var3 = this.field2446.method889(arg0);
        if (arg1 == -1) {
            arg1 = var3.field1252;
        }
        if (var3.field1245 && this.field2447.isBloomEnabled()) {
            return this.field2446.method898(arg0, TextureRelated2.field4850, 0.7F, arg1, arg1, false);
        } else if (MaterialAlphaMode.field4853 != var3.field1262 && Material.method12638(var3.field1270)) {
            return this.field2446.method898(arg0, TextureRelated2.field4849, 0.7F, arg1, arg1, true);
        } else {
            return this.field2446.method898(arg0, TextureRelated2.field4848, 0.7F, arg1, arg1, false);
        }
    }

    @ObfuscatedName("hm.s()V")
    public void method4357() {
        this.field2448.method7921(5);
    }

    @ObfuscatedName("hm.c()V")
    public void method4352() {
        this.field2448.method7922();
    }
}
