import deob.ObfuscatedName;

@ObfuscatedName("vq")
public class ObjTypeCustomisation {

    @ObfuscatedName("vq.c")
    public int[] field7130 = new int[3];

    @ObfuscatedName("vq.m")
    public int[] field7128 = new int[3];

    @ObfuscatedName("vq.t")
    public int[] field7132 = new int[2];

    @ObfuscatedName("vq.l")
    public int[] field7126 = new int[2];

    @ObfuscatedName("vq.f")
    public short[] field7134;

    @ObfuscatedName("vq.d")
    public short[] field7135;

    public ObjTypeCustomisation(ObjType arg0) {
        this.field7130[0] = arg0.manwear;
        this.field7130[1] = arg0.manwear2;
        this.field7130[2] = arg0.manwear3;
        this.field7128[0] = arg0.womanwear;
        this.field7128[1] = arg0.womanwear2;
        this.field7128[2] = arg0.womanwear3;
        this.field7132[0] = arg0.manhead;
        this.field7132[1] = arg0.manhead2;
        this.field7126[0] = arg0.womanhead;
        this.field7126[1] = arg0.womanhead2;
        if (arg0.recol_d != null) {
            this.field7134 = new short[arg0.recol_d.length];
            System.arraycopy(arg0.recol_d, 0, this.field7134, 0, this.field7134.length);
        }
        if (arg0.retex_d != null) {
            this.field7135 = new short[arg0.retex_d.length];
            System.arraycopy(arg0.retex_d, 0, this.field7135, 0, this.field7135.length);
        }
    }

    @ObfuscatedName("agg.u(Lvn;Laet;S)Lvq;")
    public static ObjTypeCustomisation method15930(ObjType arg0, Packet arg1) {
        ObjTypeCustomisation var2 = new ObjTypeCustomisation(arg0);
        int var3 = arg1.g1();
        boolean var4 = (var3 & 0x1) != 0;
        boolean var5 = (var3 & 0x2) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        boolean var7 = (var3 & 0x8) != 0;
        if (var4) {
            var2.field7130[0] = arg1.gSmart2or4null();
            var2.field7128[0] = arg1.gSmart2or4null();
            if (arg0.manwear2 != -1 || arg0.womanwear2 != -1) {
                var2.field7130[1] = arg1.gSmart2or4null();
                var2.field7128[1] = arg1.gSmart2or4null();
            }
            if (arg0.manwear3 != -1 || arg0.womanwear3 != -1) {
                var2.field7130[2] = arg1.gSmart2or4null();
                var2.field7128[2] = arg1.gSmart2or4null();
            }
        }
        if (var5) {
            var2.field7132[0] = arg1.gSmart2or4null();
            var2.field7126[0] = arg1.gSmart2or4null();
            if (arg0.manhead2 != -1 || arg0.womanhead2 != -1) {
                var2.field7132[1] = arg1.gSmart2or4null();
                var2.field7126[1] = arg1.gSmart2or4null();
            }
        }
        if (var6) {
            int var8 = arg1.g2();
            int[] var9 = new int[]{var8 & 0xF, var8 >> 4 & 0xF, var8 >> 8 & 0xF, var8 >> 12 & 0xF};
            for (int var10 = 0; var10 < 4; var10++) {
                if (var9[var10] != 15) {
                    var2.field7134[var9[var10]] = (short) arg1.g2();
                }
            }
        }
        if (var7) {
            int var11 = arg1.g1();
            int[] var12 = new int[]{var11 & 0xF, var11 >> 4 & 0xF};
            for (int var13 = 0; var13 < 2; var13++) {
                if (var12[var13] != 15) {
                    var2.field7135[var12[var13]] = (short) arg1.g2();
                }
            }
        }
        return var2;
    }
}
