import deob.ObfuscatedName;

@ObfuscatedName("ys")
public class class669 extends GraphicsRelated {

    @ObfuscatedName("ys.u")
    public final GlGraphicRelated field7651;

    public class669(GlToolkit arg0, int arg1, int arg2, byte[] arg3) {
        this.field7651 = GlGraphicRelated.method15975(arg0, TextureFormat.field1297, DataType.field1501, arg1, arg2, false, arg3, TextureFormat.field1297);
        this.field7651.method12765(false, false);
    }

    @ObfuscatedName("ys.u(Lyq;II[I[I)Lys;")
    public static class669 method12942(GlToolkit arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        byte[] var5 = new byte[arg1 * arg2];
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1 * var6 + arg3[var6];
            for (int var8 = 0; var8 < arg4[var6]; var8++) {
                var5[var7++] = -1;
            }
        }
        return new class669(arg0, arg1, arg2, var5);
    }
}
