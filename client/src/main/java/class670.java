import deob.ObfuscatedName;

@ObfuscatedName("yv")
public class class670 extends GraphicsRelated {

    @ObfuscatedName("yv.u")
    public final GpuTexture field7652;

    public class670(GpuToolkit arg0, int arg1, int arg2, byte[] arg3) {
        this.field7652 = arg0.method13549(TextureFormat.field1297, arg1, arg2, false, arg3);
        this.field7652.method4412(false, false);
    }

    public class670(GpuToolkit arg0, int arg1, int arg2, int[] arg3) {
        this.field7652 = arg0.method13548(arg1, arg2, false, arg3);
        this.field7652.method4412(false, false);
    }

    @ObfuscatedName("yv.u(Lyk;II[I[I)Lyv;")
    public static class670 method12944(GpuToolkit arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (!arg0.method13546(TextureFormat.field1297, DataType.field1501)) {
            int[] var9 = new int[arg1 * arg2];
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg1 * var10 + arg3[var10];
                for (int var12 = 0; var12 < arg4[var10]; var12++) {
                    var9[var11++] = -16777216;
                }
            }
            return new class670(arg0, arg1, arg2, var9);
        }
        byte[] var5 = new byte[arg1 * arg2];
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1 * var6 + arg3[var6];
            for (int var8 = 0; var8 < arg4[var6]; var8++) {
                var5[var7++] = -1;
            }
        }
        return new class670(arg0, arg1, arg2, var5);
    }
}
