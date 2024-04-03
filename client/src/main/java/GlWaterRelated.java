import deob.ObfuscatedName;

@ObfuscatedName("bp")
public class GlWaterRelated {

    @ObfuscatedName("bp.c")
    public boolean field1084;

    @ObfuscatedName("bp.m")
    public GlRelated2[] field1082 = null;

    @ObfuscatedName("bp.t")
    public GlColourRemapperRelated1 field1078 = null;

    @ObfuscatedName("bp.l")
    public GlRelated2[] field1083 = null;

    @ObfuscatedName("bp.f")
    public GlColourRemapperRelated1 field1081 = null;

    @ObfuscatedName("bp.d")
    public GlColourRemapperRelated1 field1086 = null;

    @ObfuscatedName("bp.u(Lyq;)V")
    public static void method2230(GlToolkit arg0) {
        if (Statics.field1087 == null) {
            GlWaterUnknownGenerator var1 = new GlWaterUnknownGenerator();
            byte[] var2 = var1.method16218(128, 128, 16);
            Statics.field1087 = Statics.method4122(var2, false);
        }
        if (Statics.field1085 == null) {
            GlWaterBillowGenerator var3 = new GlWaterBillowGenerator();
            byte[] var4 = var3.method16209(128, 128, 16);
            Statics.field1085 = Statics.method4122(var4, false);
        }
        GlEffectRelated5 var5 = arg0.field8090;
        if (var5.method2318() && Statics.field1089 == null) {
            byte[] var6 = WaterRelated5.method6999(128, 128, 16, 8, new GlEffectRelated3(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
            Statics.field1089 = Statics.method4122(var6, false);
        }
    }

    public GlWaterRelated(GlToolkit arg0) {
        this.field1084 = arg0.field8205;
        method2230(arg0);
        if (this.field1084) {
            byte[] var6 = Statics.method2896(Statics.field1087, false);
            this.field1078 = new GlColourRemapperRelated1(arg0, TextureFormat.field1299, DataType.field1501, 128, 128, 16, var6, TextureFormat.field1299);
            byte[] var7 = Statics.method2896(Statics.field1085, false);
            this.field1081 = new GlColourRemapperRelated1(arg0, TextureFormat.field1299, DataType.field1501, 128, 128, 16, var7, TextureFormat.field1299);
            GlEffectRelated5 var8 = arg0.field8090;
            if (var8.method2318()) {
                byte[] var9 = Statics.method2896(Statics.field1089, false);
                this.field1086 = new GlColourRemapperRelated1(arg0, TextureFormat.field1296, DataType.field1501, 128, 128, 16);
                GlColourRemapperRelated1 var10 = new GlColourRemapperRelated1(arg0, TextureFormat.field1304, DataType.field1501, 128, 128, 16, var9, TextureFormat.field1304);
                if (var8.method2317(this.field1086, var10, 2.0F)) {
                    this.field1086.method2046();
                } else {
                    this.field1086.method2049();
                    this.field1086 = null;
                }
                var10.method2049();
            }
        } else {
            this.field1082 = new GlRelated2[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var3 = class533.method5943(Statics.field1087, var2 * 32768, 32768);
                this.field1082[var2] = new GlRelated2(arg0, 3553, TextureFormat.field1299, DataType.field1501, 128, 128, true, var3, TextureFormat.field1299, false);
            }
            this.field1083 = new GlRelated2[16];
            for (int var4 = 0; var4 < 16; var4++) {
                byte[] var5 = class533.method5943(Statics.field1085, var4 * 32768, 32768);
                this.field1083[var4] = new GlRelated2(arg0, 3553, TextureFormat.field1299, DataType.field1501, 128, 128, true, var5, TextureFormat.field1299, false);
            }
        }
    }
}
