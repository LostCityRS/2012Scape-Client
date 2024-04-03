import deob.ObfuscatedName;

@ObfuscatedName("ahk")
public class class896 extends class679 {

    @ObfuscatedName("ahk.u")
    public final GlToolkit field9961;

    @ObfuscatedName("ahk.j")
    public GlCubeTexture field9953;

    @ObfuscatedName("ahk.a")
    public final int field9952;

    @ObfuscatedName("ahk.s")
    public final int field9955;

    @ObfuscatedName("ahk.c")
    public final int field9956;

    @ObfuscatedName("ahk.m")
    public final int field9954;

    @ObfuscatedName("ahk.t")
    public final int field9958;

    @ObfuscatedName("ahk.l")
    public final int field9960;

    @ObfuscatedName("ahk.f")
    public static final int[] field9957 = new int[6];

    @ObfuscatedName("ahk.d")
    public static final int[][] field9959 = new int[6][];

    public class896(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9961 = arg0;
        this.field9956 = arg3;
        this.field9954 = arg4;
        this.field9958 = arg5;
        this.field9960 = arg6;
        this.field9952 = arg1;
        this.field9955 = arg2;
    }

    @ObfuscatedName("ahk.u()Lxl;")
    public GlCubeTexture method13186() {
        if (this.field9953 == null) {
            MaterialTypeList var1 = this.field9961.field400;
            field9957[0] = this.field9952;
            field9957[1] = this.field9955;
            field9957[2] = this.field9956;
            field9957[3] = this.field9954;
            field9957[4] = this.field9958;
            field9957[5] = this.field9960;
            boolean var2 = false;
            int var3 = 0;
            for (int var4 = 0; var4 < 6; var4++) {
                if (field9957[var4] < 0) {
                    return null;
                }
                Material var5 = var1.method889(field9957[var4]);
                int var6 = var5.field1252;
                if (var6 > var3) {
                    var3 = var6;
                }
                if (!var1.method898(field9957[var4], class455.field4849, 1.0F, var3, var3, false)) {
                    return null;
                }
                if (var5.field1275 > 0) {
                    var2 = true;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                field9959[var7] = var1.method886(field9957[var7], 1.0F, var3, var3, false);
                if (var3 * var3 != field9959[var7].length) {
                    Material var8 = var1.method889(field9957[var7]);
                    int var9 = var3 / var8.field1252;
                    int[] var10 = new int[var3 * var3];
                    for (int var11 = 0; var11 < var8.field1252; var11++) {
                        for (int var12 = 0; var12 < var8.field1252; var12++) {
                            int var13 = var8.field1252 * var12 + var11;
                            int var14 = (var3 * var12 + var11) * var9;
                            for (int var15 = 0; var15 < var9; var15++) {
                                for (int var16 = 0; var16 < var9; var16++) {
                                    var10[var9 * var16 + var14 + var15] = field9959[var7][var13];
                                }
                            }
                        }
                    }
                    field9959[var7] = var10;
                }
            }
            this.field9953 = new GlCubeTexture(this.field9961, TextureFormat.field1298, DataType.field1501, var3, var2, field9959);
        }
        return this.field9953;
    }
}
