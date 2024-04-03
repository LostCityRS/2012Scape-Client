import deob.ObfuscatedName;

import java.util.Arrays;

@ObfuscatedName("wq")
public class NPCType {

    @ObfuscatedName("wq.j")
    public static short[] field7209 = new short[256];

    @ObfuscatedName("wq.a")
    public NPCTypeList field7210;

    @ObfuscatedName("wq.s")
    public int field7211;

    @ObfuscatedName("wq.c")
    public String field7212 = "null";

    @ObfuscatedName("wq.m")
    public int field7213 = 1;

    @ObfuscatedName("wq.t")
    public int[] field7214;

    @ObfuscatedName("wq.l")
    public int[] field7215;

    @ObfuscatedName("wq.f")
    public int[][] field7216;

    @ObfuscatedName("wq.d")
    public int field7217 = -1;

    @ObfuscatedName("wq.z")
    public short[] field7218;

    @ObfuscatedName("wq.n")
    public short[] field7267;

    @ObfuscatedName("wq.o")
    public byte[] field7272;

    @ObfuscatedName("wq.q")
    public short[] field7234;

    @ObfuscatedName("wq.p")
    public short[] field7270;

    @ObfuscatedName("wq.w")
    public byte[] field7221;

    @ObfuscatedName("wq.b")
    public byte[] field7224;

    @ObfuscatedName("wq.x")
    public byte field7225;

    @ObfuscatedName("wq.i")
    public byte field7226;

    @ObfuscatedName("wq.v")
    public byte field7255;

    @ObfuscatedName("wq.k")
    public byte field7228 = 0;

    @ObfuscatedName("wq.h")
    public String[] field7227;

    @ObfuscatedName("wq.r")
    public int[] field7230;

    @ObfuscatedName("wq.g")
    public int field7222 = -1;

    @ObfuscatedName("wq.y")
    public boolean field7232 = true;

    @ObfuscatedName("wq.e")
    public int field7233 = -1;

    @ObfuscatedName("wq.ay")
    public int field7235 = 128;

    @ObfuscatedName("wq.af")
    public int field7208 = 128;

    @ObfuscatedName("wq.ar")
    public boolean field7246 = false;

    @ObfuscatedName("wq.an")
    public boolean field7237 = false;

    @ObfuscatedName("wq.ap")
    public boolean field7238 = false;

    @ObfuscatedName("wq.ag")
    public int field7239 = 0;

    @ObfuscatedName("wq.as")
    public int field7240 = 0;

    @ObfuscatedName("wq.ai")
    public int field7231 = -1;

    @ObfuscatedName("wq.ao")
    public int field7242 = -1;

    @ObfuscatedName("wq.al")
    public int field7241 = 32;

    @ObfuscatedName("wq.at")
    public int[] field7244;

    @ObfuscatedName("wq.ax")
    public int field7245 = -1;

    @ObfuscatedName("wq.aw")
    public int field7219 = -1;

    @ObfuscatedName("wq.aa")
    public boolean field7271 = true;

    @ObfuscatedName("wq.am")
    public boolean field7259 = true;

    @ObfuscatedName("wq.ad")
    public boolean field7249 = true;

    @ObfuscatedName("wq.az")
    public short field7236 = 0;

    @ObfuscatedName("wq.ak")
    public short field7251 = 0;

    @ObfuscatedName("wq.av")
    public byte field7252 = -96;

    @ObfuscatedName("wq.aj")
    public byte field7253 = -16;

    @ObfuscatedName("wq.ah")
    public byte field7220 = 0;

    @ObfuscatedName("wq.ac")
    public int field7257 = -1;

    @ObfuscatedName("wq.aq")
    public int field7258 = -1;

    @ObfuscatedName("wq.ab")
    public int field7223 = -1;

    @ObfuscatedName("wq.bq")
    public int field7260 = -1;

    @ObfuscatedName("wq.bz")
    public int field7261 = 0;

    @ObfuscatedName("wq.bv")
    public int field7262 = 0;

    @ObfuscatedName("wq.bj")
    public int field7263 = 255;

    @ObfuscatedName("wq.bf")
    public boolean field7264;

    @ObfuscatedName("wq.bt")
    public IterableMap field7265;

    @ObfuscatedName("wq.bg")
    public int field7266 = -1;

    @ObfuscatedName("wq.bl")
    public CompassPoint field7243 = CompassPoint.field3912;

    @ObfuscatedName("wq.bk")
    public int field7268 = -1;

    @ObfuscatedName("wq.bs")
    public int[] field7269;

    @ObfuscatedName("wq.bn")
    public byte field7248 = -1;

    @ObfuscatedName("wq.ba")
    public int field7229 = -1;

    @ObfuscatedName("wq.bd")
    public int field7250 = 256;

    @ObfuscatedName("wq.bc")
    public int field7273 = 256;

    @ObfuscatedName("wq.br")
    public int field7274 = 0;

    @ObfuscatedName("wq.bp")
    public boolean field7275 = true;

    @ObfuscatedName("wq.u(Laet;I)V")
    public void method12507(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method12508(arg0, var2);
        }
    }

    @ObfuscatedName("wq.j(Laet;II)V")
    public void method12508(Packet arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.g1();
            this.field7214 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field7214[var4] = arg0.gSmart2or4null();
            }
        } else if (arg1 == 2) {
            this.field7212 = arg0.gjstr();
        } else if (arg1 == 12) {
            this.field7213 = arg0.g1();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field7227[arg1 - 30] = arg0.gjstr();
        } else if (arg1 == 40) {
            int var5 = arg0.g1();
            this.field7218 = new short[var5];
            this.field7267 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field7218[var6] = (short) arg0.g2();
                this.field7267[var6] = (short) arg0.g2();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.g1();
            this.field7234 = new short[var7];
            this.field7270 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field7234[var8] = (short) arg0.g2();
                this.field7270[var8] = (short) arg0.g2();
            }
        } else if (arg1 == 42) {
            int var9 = arg0.g1();
            this.field7272 = new byte[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field7272[var10] = arg0.g1b();
            }
        } else if (arg1 == 44) {
            int var11 = arg0.g2();
            int var12 = 0;
            for (int var13 = var11; var13 > 0; var13 >>= 0x1) {
                var12++;
            }
            this.field7221 = new byte[var12];
            byte var14 = 0;
            for (int var15 = 0; var15 < var12; var15++) {
                if ((var11 & 0x1 << var15) > 0) {
                    this.field7221[var15] = var14++;
                } else {
                    this.field7221[var15] = -1;
                }
            }
        } else if (arg1 == 45) {
            int var16 = arg0.g2();
            int var17 = 0;
            for (int var18 = var16; var18 > 0; var18 >>= 0x1) {
                var17++;
            }
            this.field7224 = new byte[var17];
            byte var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                if ((var16 & 0x1 << var20) > 0) {
                    this.field7224[var20] = var19++;
                } else {
                    this.field7224[var20] = -1;
                }
            }
        } else if (arg1 == 60) {
            int var21 = arg0.g1();
            this.field7215 = new int[var21];
            for (int var22 = 0; var22 < var21; var22++) {
                this.field7215[var22] = arg0.gSmart2or4null();
            }
        } else if (arg1 == 93) {
            this.field7232 = false;
        } else if (arg1 == 95) {
            this.field7233 = arg0.g2();
        } else if (arg1 == 97) {
            this.field7235 = arg0.g2();
        } else if (arg1 == 98) {
            this.field7208 = arg0.g2();
        } else if (arg1 == 99) {
            this.field7246 = true;
        } else if (arg1 == 100) {
            this.field7239 = arg0.g1b();
        } else if (arg1 == 101) {
            this.field7240 = arg0.g1b();
        } else if (arg1 == 102) {
            this.field7231 = arg0.g2();
        } else if (arg1 == 103) {
            this.field7241 = arg0.g2();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field7245 = arg0.g2();
            if (this.field7245 == 65535) {
                this.field7245 = -1;
            }
            this.field7219 = arg0.g2();
            if (this.field7219 == 65535) {
                this.field7219 = -1;
            }
            int var36 = -1;
            if (arg1 == 118) {
                var36 = arg0.g2();
                if (var36 == 65535) {
                    var36 = -1;
                }
            }
            int var37 = arg0.g1();
            this.field7244 = new int[var37 + 2];
            for (int var38 = 0; var38 <= var37; var38++) {
                this.field7244[var38] = arg0.g2();
                if (this.field7244[var38] == 65535) {
                    this.field7244[var38] = -1;
                }
            }
            this.field7244[var37 + 1] = var36;
        } else if (arg1 == 107) {
            this.field7271 = false;
        } else if (arg1 == 109) {
            this.field7259 = false;
        } else if (arg1 == 111) {
            this.field7249 = false;
        } else if (arg1 == 113) {
            this.field7236 = (short) arg0.g2();
            this.field7251 = (short) arg0.g2();
        } else if (arg1 == 114) {
            this.field7252 = arg0.g1b();
            this.field7253 = arg0.g1b();
        } else if (arg1 == 119) {
            this.field7220 = arg0.g1b();
        } else if (arg1 == 121) {
            this.field7216 = new int[this.field7214.length][];
            int var23 = arg0.g1();
            for (int var24 = 0; var24 < var23; var24++) {
                int var25 = arg0.g1();
                int[] var26 = this.field7216[var25] = new int[3];
                var26[0] = arg0.g1b();
                var26[1] = arg0.g1b();
                var26[2] = arg0.g1b();
            }
        } else if (arg1 == 123) {
            this.field7266 = arg0.g2();
        } else if (arg1 == 125) {
            this.field7243 = (CompassPoint) SerializableEnums.method8032(Statics.method3921(), arg0.g1b());
        } else if (arg1 == 127) {
            this.field7217 = arg0.g2();
        } else if (arg1 == 128) {
            SerializableEnums.method8032(MoveSpeed.method2553(), arg0.g1());
        } else if (arg1 == 134) {
            this.field7257 = arg0.g2();
            if (this.field7257 == 65535) {
                this.field7257 = -1;
            }
            this.field7258 = arg0.g2();
            if (this.field7258 == 65535) {
                this.field7258 = -1;
            }
            this.field7223 = arg0.g2();
            if (this.field7223 == 65535) {
                this.field7223 = -1;
            }
            this.field7260 = arg0.g2();
            if (this.field7260 == 65535) {
                this.field7260 = -1;
            }
            this.field7261 = arg0.g1();
        } else if (arg1 == 135 || arg1 == 136) {
            arg0.g1();
            arg0.g2();
        } else if (arg1 == 137) {
            this.field7222 = arg0.g2();
        } else if (arg1 == 138) {
            this.field7242 = arg0.gSmart2or4null();
        } else if (arg1 == 140) {
            this.field7263 = arg0.g1();
        } else if (arg1 == 141) {
            this.field7238 = true;
        } else if (arg1 == 142) {
            this.field7268 = arg0.g2();
        } else if (arg1 == 143) {
            this.field7237 = true;
        } else if (arg1 >= 150 && arg1 < 155) {
            this.field7227[arg1 - 150] = arg0.gjstr();
            if (!this.field7210.field7278) {
                this.field7227[arg1 - 150] = null;
            }
        } else if (arg1 == 155) {
            this.field7225 = arg0.g1b();
            this.field7226 = arg0.g1b();
            this.field7255 = arg0.g1b();
            this.field7228 = arg0.g1b();
        } else if (arg1 == 158) {
            this.field7248 = 1;
        } else if (arg1 == 159) {
            this.field7248 = 0;
        } else if (arg1 == 160) {
            int var27 = arg0.g1();
            this.field7269 = new int[var27];
            for (int var28 = 0; var28 < var27; var28++) {
                this.field7269[var28] = arg0.g2();
            }
        } else if (arg1 == 162) {
            this.field7264 = true;
        } else if (arg1 == 163) {
            this.field7229 = arg0.g1();
        } else if (arg1 == 164) {
            this.field7250 = arg0.g2();
            this.field7273 = arg0.g2();
        } else if (arg1 == 165) {
            this.field7274 = arg0.g1();
        } else if (arg1 == 168) {
            this.field7262 = arg0.g1();
        } else if (arg1 == 169) {
            this.field7275 = false;
        } else if (arg1 >= 170 && arg1 < 176) {
            if (this.field7230 == null) {
                this.field7230 = new int[6];
                Arrays.fill(this.field7230, -1);
            }
            int var29 = arg0.g2();
            if (var29 == 65535) {
                var29 = -1;
            }
            this.field7230[arg1 - 170] = var29;
        } else if (arg1 == 249) {
            int var30 = arg0.g1();
            if (this.field7265 == null) {
                int var31 = IntMath.method2839(var30);
                this.field7265 = new IterableMap(var31);
            }
            for (int var32 = 0; var32 < var30; var32++) {
                boolean var33 = arg0.g1() == 1;
                int var34 = arg0.g3();
                Node var35;
                if (var33) {
                    var35 = new ObjectNode(arg0.gjstr());
                } else {
                    var35 = new IntNode(arg0.g4());
                }
                this.field7265.method11927(var35, (long) var34);
            }
        }
    }

    @ObfuscatedName("wq.a(I)V")
    public void method12509() {
        if (this.field7214 == null) {
            this.field7214 = new int[0];
        }
        if (this.field7248 != -1) {
            return;
        }
        if (ModeGame.field6407 == this.field7210.field7279) {
            this.field7248 = 1;
        } else {
            this.field7248 = 0;
        }
    }

    @ObfuscatedName("wq.s(Lra;ILpn;Lug;Ltt;Ltt;[Ltt;[IILwf;I)Lqa;")
    public final Model method12510(RendererToolkit arg0, int arg1, BASTypeList arg2, VarIntDomain arg3, AnimationNode arg4, AnimationNode arg5, AnimationNode[] arg6, int[] arg7, int arg8, NPCTypeCustomisation arg9) {
        return this.method12541(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field7217, true);
    }

    @ObfuscatedName("wq.c(Lra;ILpn;Lug;Ltt;Ltt;[Ltt;[IILwf;IZB)Lqa;")
    public final Model method12541(RendererToolkit arg0, int arg1, BASTypeList arg2, VarIntDomain arg3, AnimationNode arg4, AnimationNode arg5, AnimationNode[] arg6, int[] arg7, int arg8, NPCTypeCustomisation arg9, int arg10, boolean arg11) {
        if (this.field7244 != null) {
            NPCType var13 = this.method12516(arg3);
            return var13 == null ? null : var13.method12541(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
        }
        int var14 = arg1;
        if (this.field7208 != 128) {
            var14 = arg1 | 0x2;
        }
        if (this.field7235 != 128) {
            var14 |= 0x5;
        }
        boolean var15 = false;
        int var16 = arg6 == null ? 0 : arg6.length;
        for (int var17 = 0; var17 < var16; var17++) {
            if (arg6[var17] != null) {
                var14 |= arg6[var17].method11779();
                var15 = true;
            }
        }
        if (arg4 != null) {
            var14 |= arg4.method11779();
            var15 = true;
        }
        if (arg5 != null) {
            var14 |= arg5.method11779();
            var15 = true;
        }
        long var18 = (long) (this.field7211 | arg0.field397 << 16);
        if (arg9 != null) {
            var18 |= arg9.field7203 << 24;
        }
        WeightedCache var20 = this.field7210.field7285;
        Model var21;
        synchronized (this.field7210.field7285) {
            var21 = (Model) this.field7210.field7285.method7916(var18);
        }
        BASType var23 = null;
        if (!arg11 && arg10 != -1) {
            var23 = arg2.method7784(arg10);
        } else if (this.field7217 != -1) {
            var23 = arg2.method7784(this.field7217);
        }
        if (var21 == null || (var21.m() & var14) != var14) {
            if (var21 != null) {
                var14 |= var21.m();
            }
            int var24 = var14;
            if (this.field7218 != null) {
                var24 = var14 | 0x4000;
            }
            if (this.field7234 != null) {
                var24 |= 0x8000;
            }
            if (this.field7228 != 0) {
                var24 |= 0x80000;
            }
            int[] var25 = arg9 == null || arg9.field7204 == null ? this.field7214 : arg9.field7204;
            boolean var26 = false;
            Js5 var27 = this.field7210.field7280;
            synchronized (this.field7210.field7280) {
                for (int var28 = 0; var28 < var25.length; var28++) {
                    if (var25[var28] != -1 && !this.field7210.field7280.method5629(var25[var28], 0)) {
                        var26 = true;
                    }
                }
            }
            if (var26) {
                return null;
            }
            ModelUnlit[] var30 = new ModelUnlit[var25.length];
            for (int var31 = 0; var31 < var25.length; var31++) {
                if (var25[var31] != -1) {
                    Js5 var32 = this.field7210.field7280;
                    synchronized (this.field7210.field7280) {
                        var30[var31] = ModelUnlit.method2664(this.field7210.field7280, var25[var31], 0);
                    }
                    if (var30[var31] != null) {
                        if (var30[var31].field1314 < 13) {
                            var30[var31].method2634(2);
                        }
                        if (this.field7216 != null && this.field7216[var31] != null) {
                            var30[var31].method2630(this.field7216[var31][0], this.field7216[var31][1], this.field7216[var31][2]);
                        }
                    }
                }
            }
            if (var23 != null && var23.field4716 != null) {
                for (int var34 = 0; var34 < var23.field4716.length; var34++) {
                    if (var34 < var30.length && var30[var34] != null) {
                        int var35 = 0;
                        int var36 = 0;
                        int var37 = 0;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        if (var23.field4716[var34] != null) {
                            var35 = var23.field4716[var34][0];
                            var36 = var23.field4716[var34][1];
                            var37 = var23.field4716[var34][2];
                            var38 = var23.field4716[var34][3] << 3;
                            var39 = var23.field4716[var34][4] << 3;
                            var40 = var23.field4716[var34][5] << 3;
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var30[var34].method2633(var38, var39, var40);
                        }
                        if (var35 != 0 || var36 != 0 || var37 != 0) {
                            var30[var34].method2630(var35, var36, var37);
                        }
                    }
                }
            }
            ModelUnlit var41;
            if (var30.length == 1) {
                var41 = var30[0];
            } else {
                var41 = new ModelUnlit(var30, var30.length);
            }
            var21 = arg0.method625(var41, var24, this.field7210.field7276, this.field7239 + 64, this.field7240 * 5 + 850);
            if (this.field7218 != null) {
                short[] var42;
                if (arg9 == null || arg9.field7205 == null) {
                    var42 = this.field7267;
                } else {
                    var42 = arg9.field7205;
                }
                for (int var43 = 0; var43 < this.field7218.length; var43++) {
                    if (this.field7272 == null || var43 >= this.field7272.length) {
                        var21.X(this.field7218[var43], var42[var43]);
                    } else {
                        var21.X(this.field7218[var43], field7209[this.field7272[var43] & 0xFF]);
                    }
                }
            }
            if (this.field7234 != null) {
                short[] var44;
                if (arg9 == null || arg9.field7206 == null) {
                    var44 = this.field7270;
                } else {
                    var44 = arg9.field7206;
                }
                for (int var45 = 0; var45 < this.field7234.length; var45++) {
                    var21.W(this.field7234[var45], var44[var45]);
                }
            }
            if (this.field7228 != 0) {
                var21.PA(this.field7225, this.field7226, this.field7255, this.field7228 & 0xFF);
            }
            var21.KA(var14);
            WeightedCache var46 = this.field7210.field7285;
            synchronized (this.field7210.field7285) {
                this.field7210.field7285.method7937(var21, var18);
            }
        }
        Model var48 = var21.method295((byte) 4, var14, true);
        boolean var49 = false;
        if (arg7 != null) {
            for (int var50 = 0; var50 < 12; var50++) {
                if (arg7[var50] != -1) {
                    var49 = true;
                }
            }
        }
        if (!var15 && !var49) {
            return var48;
        }
        Matrix4x3[] var51 = null;
        if (var23 != null) {
            var51 = var23.method7750();
        }
        if (var49 && var51 != null) {
            for (int var52 = 0; var52 < 12; var52++) {
                if (var51[var52] != null) {
                    var48.method239(var51[var52], 0x1 << var52, true);
                }
            }
        }
        int var53 = 0;
        int var54 = 1;
        while (var53 < var16) {
            if (arg6[var53] != null) {
                arg6[var53].method11765(var48, 0, var54);
            }
            var53++;
            var54 <<= 0x1;
        }
        if (var49) {
            for (int var55 = 0; var55 < 12; var55++) {
                if (arg7[var55] != -1) {
                    int var56 = arg7[var55] - arg8;
                    int var57 = var56 & 0x3FFF;
                    Matrix4x3 var58 = new Matrix4x3();
                    var58.method5106(0.0F, 1.0F, 0.0F, Trig1.method5096(var57));
                    var48.method239(var58, 0x1 << var55, false);
                }
            }
        }
        if (var49 && var51 != null) {
            for (int var59 = 0; var59 < 12; var59++) {
                if (var51[var59] != null) {
                    var48.method239(var51[var59], 0x1 << var59, false);
                }
            }
        }
        if (arg4 != null && arg5 != null) {
            Statics.method3537(var48, arg4, arg5);
        } else if (arg4 != null) {
            arg4.method11780(var48, 0);
        } else if (arg5 != null) {
            arg5.method11780(var48, 0);
        }
        if (this.field7235 != 128 || this.field7208 != 128) {
            var48.oa(this.field7235, this.field7208, this.field7235);
        }
        var48.KA(arg1);
        return var48;
    }

    @ObfuscatedName("wq.m(Lra;ILug;Ltt;Lwf;B)Lqa;")
    public final Model method12512(RendererToolkit arg0, int arg1, VarIntDomain arg2, AnimationNode arg3, NPCTypeCustomisation arg4) {
        if (this.field7244 != null) {
            NPCType var6 = this.method12516(arg2);
            return var6 == null ? null : var6.method12512(arg0, arg1, arg2, arg3, arg4);
        } else if (this.field7215 == null && (arg4 == null || arg4.field7204 == null)) {
            return null;
        } else {
            int var7 = arg1;
            if (arg3 != null) {
                var7 = arg1 | arg3.method11779();
            }
            long var8 = (long) (this.field7211 | arg0.field397 << 16);
            if (arg4 != null) {
                var8 |= arg4.field7203 << 24;
            }
            WeightedCache var10 = this.field7210.field7283;
            Model var11;
            synchronized (this.field7210.field7283) {
                var11 = (Model) this.field7210.field7283.method7916(var8);
            }
            if (var11 == null || (var11.m() & var7) != var7) {
                if (var11 != null) {
                    var7 |= var11.m();
                }
                int var13 = var7;
                if (this.field7218 != null) {
                    var13 = var7 | 0x4000;
                }
                if (this.field7234 != null) {
                    var13 |= 0x8000;
                }
                if (this.field7228 != 0) {
                    var13 |= 0x80000;
                }
                int[] var14 = arg4 == null || arg4.field7204 == null ? this.field7215 : arg4.field7204;
                boolean var15 = false;
                Js5 var16 = this.field7210.field7280;
                synchronized (this.field7210.field7280) {
                    int var17 = 0;
                    while (true) {
                        if (var17 >= var14.length) {
                            break;
                        }
                        if (!this.field7210.field7280.method5629(var14[var17], 0)) {
                            var15 = true;
                        }
                        var17++;
                    }
                }
                if (var15) {
                    return null;
                }
                ModelUnlit[] var19 = new ModelUnlit[var14.length];
                Js5 var20 = this.field7210.field7280;
                synchronized (this.field7210.field7280) {
                    for (int var21 = 0; var21 < var14.length; var21++) {
                        var19[var21] = ModelUnlit.method2664(this.field7210.field7280, var14[var21], 0);
                    }
                }
                for (int var23 = 0; var23 < var14.length; var23++) {
                    if (var19[var23] != null && var19[var23].field1314 < 13) {
                        var19[var23].method2634(2);
                    }
                }
                ModelUnlit var24;
                if (var19.length == 1) {
                    var24 = var19[0];
                } else {
                    var24 = new ModelUnlit(var19, var19.length);
                }
                var11 = arg0.method625(var24, var13, this.field7210.field7276, 64, 768);
                if (this.field7218 != null) {
                    short[] var25;
                    if (arg4 == null || arg4.field7205 == null) {
                        var25 = this.field7267;
                    } else {
                        var25 = arg4.field7205;
                    }
                    for (int var26 = 0; var26 < this.field7218.length; var26++) {
                        if (this.field7272 == null || var26 >= this.field7272.length) {
                            var11.X(this.field7218[var26], var25[var26]);
                        } else {
                            var11.X(this.field7218[var26], field7209[this.field7272[var26] & 0xFF]);
                        }
                    }
                }
                if (this.field7234 != null) {
                    short[] var27;
                    if (arg4 == null || arg4.field7206 == null) {
                        var27 = this.field7270;
                    } else {
                        var27 = arg4.field7206;
                    }
                    for (int var28 = 0; var28 < this.field7234.length; var28++) {
                        var11.W(this.field7234[var28], var27[var28]);
                    }
                }
                if (this.field7228 != 0) {
                    var11.PA(this.field7225, this.field7226, this.field7255, this.field7228 & 0xFF);
                }
                var11.KA(var7);
                WeightedCache var29 = this.field7210.field7283;
                synchronized (this.field7210.field7283) {
                    this.field7210.field7283.method7937(var11, var8);
                }
            }
            if (arg3 != null) {
                var11 = var11.method295((byte) 1, var7, true);
                arg3.method11780(var11, 0);
            }
            var11.KA(arg1);
            return var11;
        }
    }

    @ObfuscatedName("wq.t(I)Z")
    public final boolean method12513() {
        if (this.field7214 == null) {
            return true;
        }
        boolean var1 = true;
        int[] var2 = this.field7214;
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var2[var3];
            if (!this.field7210.field7280.method5629(var4, 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("wq.l(III)I")
    public int method12514(int arg0, int arg1) {
        if (this.field7265 == null) {
            return arg1;
        } else {
            IntNode var3 = (IntNode) this.field7265.method11923((long) arg0);
            return var3 == null ? arg1 : var3.field9556;
        }
    }

    @ObfuscatedName("wq.f(ILjava/lang/String;I)Ljava/lang/String;")
    public String method12515(int arg0, String arg1) {
        if (this.field7265 == null) {
            return arg1;
        } else {
            ObjectNode var3 = (ObjectNode) this.field7265.method11923((long) arg0);
            return var3 == null ? arg1 : (String) var3.field9550;
        }
    }

    @ObfuscatedName("wq.d(Lug;I)Lwq;")
    public final NPCType method12516(VarIntDomain arg0) {
        int var2 = -1;
        if (this.field7245 != -1) {
            var2 = arg0.method1646(this.field7245);
        } else if (this.field7219 != -1) {
            var2 = arg0.method1664(this.field7219);
        }
        if (var2 >= 0 && var2 < this.field7244.length - 1) {
            return this.field7244[var2] == -1 ? null : this.field7210.method12565(this.field7244[var2]);
        } else {
            int var3 = this.field7244[this.field7244.length - 1];
            return var3 == -1 ? null : this.field7210.method12565(var3);
        }
    }

    @ObfuscatedName("wq.z(Lug;B)Z")
    public boolean method12517(VarIntDomain arg0) {
        if (this.field7244 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field7245 != -1) {
            var2 = arg0.method1646(this.field7245);
        } else if (this.field7219 != -1) {
            var2 = arg0.method1664(this.field7219);
        }
        if (var2 >= 0 && var2 < this.field7244.length - 1) {
            return this.field7244[var2] != -1;
        } else {
            int var3 = this.field7244[this.field7244.length - 1];
            return var3 != -1;
        }
    }

    @ObfuscatedName("wq.n(B)Z")
    public boolean method12511() {
        if (this.field7244 == null) {
            return this.field7257 != -1 || this.field7223 != -1 || this.field7260 != -1;
        }
        for (int var1 = 0; var1 < this.field7244.length; var1++) {
            if (this.field7244[var1] != -1) {
                NPCType var2 = this.field7210.method12565(this.field7244[var1]);
                if (var2.field7257 != -1 || var2.field7223 != -1 || var2.field7260 != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("wq.o(II)I")
    public int method12543(int arg0) {
        return this.field7230 == null ? -1 : this.field7230[arg0];
    }
}
