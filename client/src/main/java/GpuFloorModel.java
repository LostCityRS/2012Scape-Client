import deob.ObfuscatedName;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

@ObfuscatedName("yn")
public class GpuFloorModel extends FloorModel {

    @ObfuscatedName("yn.l")
    public final GpuToolkit field7722;

    @ObfuscatedName("yn.f")
    public int field7723;

    @ObfuscatedName("yn.d")
    public int field7745;

    @ObfuscatedName("yn.z")
    public int field7725;

    @ObfuscatedName("yn.n")
    public final int field7752;

    @ObfuscatedName("yn.o")
    public int field7727;

    @ObfuscatedName("yn.q")
    public int field7743;

    @ObfuscatedName("yn.p")
    public short[][] field7724;

    @ObfuscatedName("yn.w")
    public float field7744 = Float.MAX_VALUE;

    @ObfuscatedName("yn.b")
    public float field7730 = -3.4028235E38F;

    @ObfuscatedName("yn.x")
    public GpuFloorModelRelated1[][][] field7732;

    @ObfuscatedName("yn.i")
    public int[][][] field7733;

    @ObfuscatedName("yn.v")
    public int[][][] field7734;

    @ObfuscatedName("yn.k")
    public int[][][] field7735;

    @ObfuscatedName("yn.h")
    public int[][][] field7736;

    @ObfuscatedName("yn.r")
    public int[][][] field7737;

    @ObfuscatedName("yn.g")
    public int[][][] field7738;

    @ObfuscatedName("yn.y")
    public byte[][] field7748;

    @ObfuscatedName("yn.e")
    public GpuFloorModelHardShadows field7740;

    @ObfuscatedName("yn.ay")
    public IterableQueue field7741 = new IterableQueue();

    @ObfuscatedName("yn.af")
    public Node[] field7742;

    @ObfuscatedName("yn.ar")
    public VertexBuffer field7726;

    @ObfuscatedName("yn.an")
    public VertexBuffer field7757;

    @ObfuscatedName("yn.ap")
    public VertexDeclaration field7729;

    @ObfuscatedName("yn.ag")
    public int field7746;

    @ObfuscatedName("yn.as")
    public int field7720;

    @ObfuscatedName("yn.ai")
    public byte[][] field7728;

    @ObfuscatedName("yn.ao")
    public float[][] field7751;

    @ObfuscatedName("yn.al")
    public float[][] field7750;

    @ObfuscatedName("yn.at")
    public float[][] field7731;

    @ObfuscatedName("yn.ax")
    public IterableMap field7749;

    @ObfuscatedName("yn.aw")
    public Node[] field7753;

    @ObfuscatedName("yn.aa")
    public int field7754;

    @ObfuscatedName("yn.am")
    public long field7755;

    @ObfuscatedName("yn.ad")
    public long field7756;

    @ObfuscatedName("yn.az")
    public long field7747;

    @ObfuscatedName("yn.ak")
    public int field7758;

    @ObfuscatedName("yn.av")
    public int[] field7759 = new int[1];

    @ObfuscatedName("yn.aj")
    public int[] field7760 = new int[1];

    @ObfuscatedName("yn.ah")
    public int field7761;

    @ObfuscatedName("yn.au")
    public int[] field7762 = new int[1];

    public GpuFloorModel(GpuToolkit arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7722 = arg0;
        this.field7723 = this.field388 - 2;
        this.field7745 = 0x1 << this.field7723;
        this.field7725 = arg1;
        this.field7752 = arg2;
        this.field7737 = new int[arg3][arg4][];
        this.field7732 = new GpuFloorModelRelated1[arg3][arg4][];
        this.field7735 = new int[arg3][arg4][];
        this.field7736 = new int[arg3][arg4][];
        this.field7733 = new int[arg3][arg4][];
        this.field7734 = new int[arg3][arg4][];
        this.field7724 = new short[arg3 * arg4][];
        this.field7748 = new byte[arg3][arg4];
        this.field7728 = new byte[arg3 + 1][arg4 + 1];
        this.field7751 = new float[this.field387 + 1][this.field386 + 1];
        this.field7750 = new float[this.field387 + 1][this.field386 + 1];
        this.field7731 = new float[this.field387 + 1][this.field386 + 1];
        for (int var9 = 0; var9 <= this.field386; var9++) {
            for (int var10 = 0; var10 <= this.field387; var10++) {
                int var11 = this.field389[var10][var9];
                if ((float) var11 < this.field7744) {
                    this.field7744 = var11;
                }
                if ((float) var11 > this.field7730) {
                    this.field7730 = var11;
                }
                if (var10 > 0 && var9 > 0 && var10 < this.field387 && var9 < this.field386) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field7751[var10][var9] = (float) var12 * var14;
                    this.field7750[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7731[var10][var9] = (float) var13 * var14;
                }
            }
        }
        this.field7744--;
        this.field7730++;
        this.field7749 = new IterableMap(128);
        if ((this.field7752 & 0x10) != 0) {
            this.field7740 = new GpuFloorModelHardShadows(this.field7722, this);
        }
    }

    @ObfuscatedName("yn.LA(III)V")
    public void LA(int arg0, int arg1, int arg2) {
        if ((this.field7728[arg0][arg1] & 0xFF) < arg2) {
            this.field7728[arg0][arg1] = (byte) arg2;
        }
    }

    @ObfuscatedName("yn.u(II[I[I[I[I[I[I[I[ILdk;Z)V")
    public void method193(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, WaterFogData arg10, boolean arg11) {
        MaterialTypeList var13 = this.field7722.field400;
        if (arg5 != null && this.field7738 == null) {
            this.field7738 = new int[this.field387][this.field386][];
        }
        if (arg3 != null && this.field7737 == null) {
            this.field7737 = new int[this.field387][this.field386][];
        }
        this.field7735[arg0][arg1] = arg2;
        this.field7736[arg0][arg1] = arg4;
        this.field7733[arg0][arg1] = arg6;
        this.field7734[arg0][arg1] = arg7;
        if (this.field7738 != null) {
            this.field7738[arg0][arg1] = arg5;
        }
        if (this.field7737 != null) {
            this.field7737[arg0][arg1] = arg3;
        }
        GpuFloorModelRelated1[] var14 = this.field7732[arg0][arg1] = new GpuFloorModelRelated1[arg6.length];
        for (int var15 = 0; var15 < arg6.length; var15++) {
            int var16 = arg8[var15];
            int var17 = arg9[var15];
            if ((this.field7752 & 0x20) != 0 && var16 != -1 && var13.method889(var16).field1250) {
                var17 = 128;
                var16 = -1;
            }
            long var18 = (long) arg10.field1474 << 48 | (long) arg10.scale << 42 | (long) arg10.colour << 28 | (long) (var17 << 14) | (long) var16;
            Node var20;
            for (var20 = this.field7749.getNode(var18); var20 != null; var20 = this.field7749.method11924()) {
                GpuFloorModelRelated1 var21 = (GpuFloorModelRelated1) var20;
                if (var21.field9438 == var16 && (float) var17 == var21.field9441 && var21.field9440.method2711(arg10)) {
                    break;
                }
            }
            if (var20 == null) {
                var14[var15] = new GpuFloorModelRelated1(this, var16, var17, arg10);
                this.field7749.put(var14[var15], var18);
            } else {
                var14[var15] = (GpuFloorModelRelated1) var20;
            }
        }
        if (arg11) {
            this.field7748[arg0][arg1] = (byte) (this.field7748[arg0][arg1] | 0x1);
        }
        if (arg6.length > this.field7720) {
            this.field7720 = arg6.length;
        }
        this.field7746 += arg6.length;
    }

    @ObfuscatedName("yn.j(II[I[I[I[I[I[I[I[I[I[I[ILdk;Z)V")
    public void method219(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, WaterFogData arg13, boolean arg14) {
        int var16 = arg9.length;
        int[] var17 = new int[var16 * 3];
        int[] var18 = new int[var16 * 3];
        int[] var19 = new int[var16 * 3];
        int[] var20 = new int[var16 * 3];
        int[] var21 = new int[var16 * 3];
        int[] var22 = new int[var16 * 3];
        int[] var23 = arg3 == null ? null : new int[var16 * 3];
        int[] var24 = arg5 == null ? null : new int[var16 * 3];
        int var25 = 0;
        for (int var26 = 0; var26 < var16; var26++) {
            int var27 = arg6[var26];
            int var28 = arg7[var26];
            int var29 = arg8[var26];
            var17[var25] = arg2[var27];
            var18[var25] = arg4[var27];
            var19[var25] = arg9[var26];
            var21[var25] = arg11[var26];
            var22[var25] = arg12[var26];
            var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
            if (arg3 != null) {
                var23[var25] = arg3[var27];
            }
            if (arg5 != null) {
                var24[var25] = arg5[var27];
            }
            var25++;
            var17[var25] = arg2[var28];
            var18[var25] = arg4[var28];
            var19[var25] = arg9[var26];
            var21[var25] = arg11[var26];
            var22[var25] = arg12[var26];
            var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
            if (arg3 != null) {
                var23[var25] = arg3[var28];
            }
            if (arg5 != null) {
                var24[var25] = arg5[var28];
            }
            var25++;
            var17[var25] = arg2[var29];
            var18[var25] = arg4[var29];
            var19[var25] = arg9[var26];
            var21[var25] = arg11[var26];
            var22[var25] = arg12[var26];
            var20[var25] = arg10 == null ? arg9[var26] : arg10[var26];
            if (arg3 != null) {
                var23[var25] = arg3[var29];
            }
            if (arg5 != null) {
                var24[var25] = arg5[var29];
            }
            var25++;
        }
        this.method193(arg0, arg1, var17, var23, var18, var24, var19, var20, var21, var22, arg13, arg14);
    }

    @ObfuscatedName("yn.SA()V")
    public void SA() {
        if (this.field7746 <= 0) {
            this.field7740 = null;
            this.method12991();
            return;
        }
        byte[][] var1 = new byte[this.field387 + 1][this.field386 + 1];
        for (int var2 = 1; var2 < this.field387; var2++) {
            for (int var3 = 1; var3 < this.field386; var3++) {
                var1[var2][var3] = (byte) ((this.field7728[var2][var3] >> 1) + (this.field7728[var2][var3 + 1] >> 3) + (this.field7728[var2][var3 - 1] >> 2) + (this.field7728[var2 - 1][var3] >> 2) + (this.field7728[var2 + 1][var3] >> 3));
            }
        }
        this.field7753 = new Node[this.field7749.length()];
        this.field7749.method11933(this.field7753);
        for (int var4 = 0; var4 < this.field7753.length; var4++) {
            ((GpuFloorModelRelated1) this.field7753[var4]).method14996(this.field7746);
        }
        this.field7758 = 20;
        if (this.field7738 != null) {
            this.field7758 += 4;
        }
        if ((this.field7752 & 0x7) != 0) {
            this.field7758 += 12;
        }
        this.field7747 = this.field7722.field8247.allocateMemory((long) (this.field7758 * this.field7746 + this.field7746 * 4));
        this.field7755 = this.field7747;
        this.field7756 = (long) (this.field7746 * 4) + this.field7747;
        GpuFloorModelRelated1[] var5 = new GpuFloorModelRelated1[this.field7746];
        int var6 = IntMath.method1962(this.field7746 / 4);
        if (var6 < 1) {
            var6 = 1;
        }
        IterableMap var7 = new IterableMap(var6);
        GpuFloorModelRelated1[] var8 = new GpuFloorModelRelated1[this.field7720];
        for (int var9 = 0; var9 < this.field387; var9++) {
            for (int var10 = 0; var10 < this.field386; var10++) {
                this.method12982(var9, var10, var1, var8, var7, var5);
            }
        }
        for (int var11 = 0; var11 < this.field7727; var11++) {
            GpuFloorModelRelated1 var12 = var5[var11];
            if (var12 != null) {
                var12.method15001(var11);
            }
        }
        for (int var13 = 0; var13 < this.field387; var13++) {
            for (int var14 = 0; var14 < this.field386; var14++) {
                short[] var15 = this.field7724[this.field387 * var14 + var13];
                if (var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        int var18 = var15[var17++] & 0xFFFF;
                        int var19 = var15[var17++] & 0xFFFF;
                        int var20 = var15[var17++] & 0xFFFF;
                        GpuFloorModelRelated1 var21 = var5[var18];
                        GpuFloorModelRelated1 var22 = var5[var19];
                        GpuFloorModelRelated1 var23 = var5[var20];
                        GpuFloorModelRelated1 var24 = null;
                        if (var21 != null) {
                            var21.method14998(var13, var14, var16);
                            var24 = var21;
                        }
                        if (var22 != null) {
                            var22.method14998(var13, var14, var16);
                            if (var24 == null || var22.field4228 < var24.field4228) {
                                var24 = var22;
                            }
                        }
                        if (var23 != null) {
                            var23.method14998(var13, var14, var16);
                            if (var24 == null || var23.field4228 < var24.field4228) {
                                var24 = var23;
                            }
                        }
                        if (var24 != null) {
                            if (var21 != null) {
                                var24.method15001(var18);
                            }
                            if (var22 != null) {
                                var24.method15001(var19);
                            }
                            if (var23 != null) {
                                var24.method15001(var20);
                            }
                            var24.method14998(var13, var14, var16);
                        }
                        var16++;
                    }
                }
            }
        }
        this.field7754 = 0;
        for (int var25 = 0; var25 < this.field7753.length; var25++) {
            GpuFloorModelRelated1 var26 = (GpuFloorModelRelated1) this.field7753[var25];
            if (var26.field9447 > 0) {
                this.field7753[this.field7754++] = var26;
            }
        }
        this.field7742 = new Node[this.field7754];
        long[] var27 = new long[this.field7754];
        for (int var28 = 0; var28 < this.field7754; var28++) {
            GpuFloorModelRelated1 var29 = (GpuFloorModelRelated1) this.field7753[var28];
            var27[var28] = var29.field4228;
            this.field7742[var28] = var29;
        }
        Algorithms.method11178(var27, this.field7742);
        this.method12981();
    }

    @ObfuscatedName("yn.t()V")
    public void method12981() {
        this.field7757 = this.field7722.method13584(false);
        this.field7757.method4269(this.field7727 * 4, 4);
        this.field7757.method4452(0, this.field7727 * 4, this.field7747);
        this.field7726 = this.field7722.method13584(false);
        this.field7726.method4269(this.field7758 * this.field7727, this.field7758);
        this.field7726.method4452(0, this.field7758 * this.field7727, (long) (this.field7746 * 4) + this.field7747);
        this.field7722.field8247.freeMemory(this.field7747);
        if ((this.field7752 & 0x7) == 0) {
            if (this.field7738 == null) {
                this.field7729 = this.field7722.method13585(new VertexDeclarationElement[]{new VertexDeclarationElement(new VertexDeclarationElementComponent[]{VertexDeclarationElementComponent.field2495, VertexDeclarationElementComponent.field2483}), new VertexDeclarationElement(VertexDeclarationElementComponent.field2488)});
            } else {
                this.field7729 = this.field7722.method13585(new VertexDeclarationElement[]{new VertexDeclarationElement(new VertexDeclarationElementComponent[]{VertexDeclarationElementComponent.field2495, VertexDeclarationElementComponent.field2483, VertexDeclarationElementComponent.field2482}), new VertexDeclarationElement(VertexDeclarationElementComponent.field2488)});
            }
        } else if (this.field7738 == null) {
            this.field7729 = this.field7722.method13585(new VertexDeclarationElement[]{new VertexDeclarationElement(new VertexDeclarationElementComponent[]{VertexDeclarationElementComponent.field2495, VertexDeclarationElementComponent.field2483, VertexDeclarationElementComponent.field2480}), new VertexDeclarationElement(VertexDeclarationElementComponent.field2488)});
        } else {
            this.field7729 = this.field7722.method13585(new VertexDeclarationElement[]{new VertexDeclarationElement(new VertexDeclarationElementComponent[]{VertexDeclarationElementComponent.field2495, VertexDeclarationElementComponent.field2483, VertexDeclarationElementComponent.field2482, VertexDeclarationElementComponent.field2480}), new VertexDeclarationElement(VertexDeclarationElementComponent.field2488)});
        }
        for (int var1 = 0; var1 < this.field7754; var1++) {
            GpuFloorModelRelated1 var2 = (GpuFloorModelRelated1) this.field7753[var1];
            var2.method15000(this.field7727);
        }
        if (this.field7740 != null) {
            this.field7740.method4374();
        }
        this.method12991();
    }

    @ObfuscatedName("yn.x()V")
    public void method12991() {
        if ((this.field7725 & 0x2) == 0) {
            this.field7736 = null;
            this.field7735 = null;
            this.field7733 = null;
        }
        this.field7738 = null;
        this.field7734 = null;
        this.field7737 = null;
        this.field7732 = null;
        this.field7728 = null;
        this.field7749 = null;
        this.field7753 = null;
        this.field7731 = null;
        this.field7750 = null;
        this.field7751 = null;
    }

    @ObfuscatedName("yn.y(II[[B[Ladd;Luo;[Ladd;)V")
    public void method12982(int arg0, int arg1, byte[][] arg2, GpuFloorModelRelated1[] arg3, IterableMap arg4, GpuFloorModelRelated1[] arg5) {
        if (this.field7733[arg0][arg1] == null) {
            return;
        }
        GpuFloorModelRelated1[] var7 = this.field7732[arg0][arg1];
        int[] var8 = this.field7735[arg0][arg1];
        int[] var9 = this.field7736[arg0][arg1];
        int[] var10 = this.field7734[arg0][arg1];
        int[] var11 = this.field7733[arg0][arg1];
        int[] var12 = this.field7737 == null ? null : this.field7737[arg0][arg1];
        int[] var13 = this.field7738 == null ? null : this.field7738[arg0][arg1];
        if (var10 == null) {
            var10 = var11;
        }
        float var14 = this.field7751[arg0][arg1];
        float var15 = this.field7750[arg0][arg1];
        float var16 = this.field7731[arg0][arg1];
        float var17 = this.field7751[arg0][arg1 + 1];
        float var18 = this.field7750[arg0][arg1 + 1];
        float var19 = this.field7731[arg0][arg1 + 1];
        float var20 = this.field7751[arg0 + 1][arg1 + 1];
        float var21 = this.field7750[arg0 + 1][arg1 + 1];
        float var22 = this.field7731[arg0 + 1][arg1 + 1];
        float var23 = this.field7751[arg0 + 1][arg1];
        float var24 = this.field7750[arg0 + 1][arg1];
        float var25 = this.field7731[arg0 + 1][arg1];
        int var26 = arg2[arg0][arg1] & 0xFF;
        int var27 = arg2[arg0][arg1 + 1] & 0xFF;
        int var28 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
        int var29 = arg2[arg0 + 1][arg1] & 0xFF;
        int var30 = 0;
        label185:
        for (int var31 = 0; var31 < var11.length; var31++) {
            GpuFloorModelRelated1 var32 = var7[var31];
            for (int var33 = 0; var33 < var30; var33++) {
                if (arg3[var33] == var32) {
                    continue label185;
                }
            }
            arg3[var30++] = var32;
        }
        short[] var34 = this.field7724[this.field387 * arg1 + arg0] = new short[var11.length];
        for (int var35 = 0; var35 < var11.length; var35++) {
            int var36 = (arg0 << this.field388) + var8[var35];
            int var37 = (arg1 << this.field388) + var9[var35];
            int var38 = var36 >> this.field7723;
            int var39 = var37 >> this.field7723;
            int var40 = var11[var35];
            int var41 = var10[var35];
            int var42 = var12 == null ? 0 : var12[var35];
            long var43 = (long) var41 << 48 | (long) var40 << 32 | (long) (var38 << 16) | (long) var39;
            int var45 = var8[var35];
            int var46 = var9[var35];
            byte var47 = 74;
            int var48 = 0;
            float var49 = 1.0F;
            float var50;
            float var51;
            float var52;
            int var53;
            if (var45 == 0 && var46 == 0) {
                var50 = var14;
                var51 = var15;
                var52 = var16;
                var53 = var47 - var26;
            } else if (var45 == 0 && this.field385 == var46) {
                var50 = var17;
                var51 = var18;
                var52 = var19;
                var53 = var47 - var27;
            } else if (this.field385 == var45 && this.field385 == var46) {
                var50 = var20;
                var51 = var21;
                var52 = var22;
                var53 = var47 - var28;
            } else if (this.field385 == var45 && var46 == 0) {
                var50 = var23;
                var51 = var24;
                var52 = var25;
                var53 = var47 - var29;
            } else {
                float var54 = (float) var45 / (float) this.field385;
                float var55 = (float) var46 / (float) this.field385;
                float var56 = (var23 - var14) * var54 + var14;
                float var57 = (var24 - var15) * var54 + var15;
                float var58 = (var25 - var16) * var54 + var16;
                float var59 = (var20 - var17) * var54 + var17;
                float var60 = (var21 - var18) * var54 + var18;
                float var61 = (var22 - var19) * var54 + var19;
                var50 = (var59 - var56) * var55 + var56;
                var51 = (var60 - var57) * var55 + var57;
                var52 = (var61 - var58) * var55 + var58;
                int var62 = ((var29 - var26) * var45 >> this.field388) + var26;
                int var63 = ((var28 - var27) * var45 >> this.field388) + var27;
                var53 = var47 - (((var63 - var62) * var46 >> this.field388) + var62);
            }
            if (var40 != -1) {
                int var64 = (var40 & 0x7F) * var53 >> 7;
                if (var64 < 2) {
                    var64 = 2;
                } else if (var64 > 126) {
                    var64 = 126;
                }
                var48 = Statics.field5085[var40 & 0xFF80 | var64];
                if ((this.field7752 & 0x7) == 0) {
                    float var65 = this.field7722.field8272[2] * var52 + this.field7722.field8272[0] * var50 + this.field7722.field8272[1] * var51;
                    var49 = this.field7722.field8319 + var65 * (var65 > 0.0F ? this.field7722.field8320 : this.field7722.field8373);
                }
            }
            Node var66 = null;
            if ((var36 & this.field7745 - 1) == 0 && (var37 & this.field7745 - 1) == 0) {
                var66 = arg4.getNode(var43);
            }
            int var81;
            if (var66 == null) {
                int var68;
                if (var40 == var41) {
                    var68 = var48;
                } else {
                    int var67 = (var41 & 0x7F) * var53 >> 7;
                    if (var67 < 2) {
                        var67 = 2;
                    } else if (var67 > 126) {
                        var67 = 126;
                    }
                    var68 = Statics.field5085[var41 & 0xFF80 | var67];
                    if ((this.field7752 & 0x7) == 0) {
                        float var69 = this.field7722.field8272[2] * var52 + this.field7722.field8272[0] * var50 + this.field7722.field8272[1] * var51;
                        float var70 = this.field7722.field8319 + var49 * (var49 > 0.0F ? this.field7722.field8320 : this.field7722.field8373);
                        int var71 = var68 >> 16 & 0xFF;
                        int var72 = var68 >> 8 & 0xFF;
                        int var73 = var68 & 0xFF;
                        int var74 = (int) ((float) var71 * var70);
                        if (var74 < 0) {
                            var74 = 0;
                        } else if (var74 > 255) {
                            var74 = 255;
                        }
                        int var75 = (int) ((float) var72 * var70);
                        if (var75 < 0) {
                            var75 = 0;
                        } else if (var75 > 255) {
                            var75 = 255;
                        }
                        int var76 = (int) ((float) var73 * var70);
                        if (var76 < 0) {
                            var76 = 0;
                        } else if (var76 > 255) {
                            var76 = 255;
                        }
                        var68 = var74 << 16 | var75 << 8 | var76;
                    }
                }
                Unsafe var77 = this.field7722.field8247;
                var77.putFloat(this.field7756, (float) var36);
                this.field7756 += 4L;
                var77.putFloat(this.field7756, (float) (this.getFineHeight(var36, var37) + var42));
                this.field7756 += 4L;
                var77.putFloat(this.field7756, (float) var37);
                this.field7756 += 4L;
                var77.putFloat(this.field7756, (float) var36);
                this.field7756 += 4L;
                var77.putFloat(this.field7756, (float) var37);
                this.field7756 += 4L;
                if (this.field7738 != null) {
                    var77.putFloat(this.field7756, var13 == null ? 0.0F : (float) (var13[var35] - 1));
                    this.field7756 += 4L;
                }
                if ((this.field7752 & 0x7) != 0) {
                    var77.putFloat(this.field7756, var50);
                    this.field7756 += 4L;
                    var77.putFloat(this.field7756, var51);
                    this.field7756 += 4L;
                    var77.putFloat(this.field7756, var52);
                    this.field7756 += 4L;
                }
                if (this.field7722.field8348 == 0) {
                    int var78 = var68 & 0xFF00FF00;
                    int var79 = var78 | var68 >> 16 & 0xFF;
                    int var80 = var79 | (var68 & 0xFF) << 16;
                    var68 = var80;
                }
                var77.putInt(this.field7755, var68 | 0xFF000000);
                this.field7755 += 4L;
                var81 = this.field7727++;
                var34[var35] = (short) var81;
                if (var40 != -1) {
                    arg5[var81] = var7[var35];
                }
                arg4.put(new FloorModelNode(var34[var35]), var43);
            } else {
                var34[var35] = ((FloorModelNode) var66).field9551;
                var81 = var34[var35] & 0xFFFF;
                if (var40 != -1 && var7[var35].field4228 < arg5[var81].field4228) {
                    arg5[var81] = var7[var35];
                }
            }
            for (int var82 = 0; var82 < var30; var82++) {
                arg3[var82].method15005(var81, var48, var53, var49);
            }
            this.field7743++;
        }
    }

    @ObfuscatedName("yn.a(III[[ZZI)V")
    public void method212(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        if (this.field7742 == null) {
            return;
        }
        int var7 = arg2 + arg2 + 1;
        int var8 = var7 * var7;
        if (this.field7762.length < var8) {
            this.field7762 = new int[var8];
        }
        int var9 = arg0 - arg2;
        int var10 = var9;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = arg1 - arg2;
        int var12 = var11;
        if (var11 < 0) {
            var11 = 0;
        }
        int var13 = arg0 + arg2;
        if (var13 > this.field387 - 1) {
            var13 = this.field387 - 1;
        }
        int var14 = arg1 + arg2;
        if (var14 > this.field386 - 1) {
            var14 = this.field386 - 1;
        }
        this.field7761 = 0;
        for (int var15 = var9; var15 <= var13; var15++) {
            boolean[] var16 = arg3[var15 - var10];
            for (int var17 = var11; var17 <= var14; var17++) {
                if (var16[var17 - var12]) {
                    this.field7762[this.field7761++] = this.field387 * var17 + var15;
                }
            }
        }
        ByteBuffer var18 = this.field7722.field8244;
        var18.clear();
        for (int var19 = 0; var19 < this.field7742.length; var19++) {
            GpuFloorModelRelated1 var20 = (GpuFloorModelRelated1) this.field7742[var19];
            var20.method14995(this.field7762, this.field7761);
        }
        int var21 = var18.position();
        ModelShader var22 = this.field7722.field8345;
        if (var21 != 0) {
            IndexBuffer var23 = this.field7722.method13559(var21 / 2);
            var23.method4452(0, var21, this.field7722.field8245);
            this.field7722.method13598();
            this.field7722.method13587(0, this.field7726);
            this.field7722.method13588(var23);
            var22.method3848(Matrix4x4.field3479);
            if (this.field7722.field8364 > 0) {
                var22.field2260.method5074(0.0F, 0.0F, 1.0F, -this.field7722.field8251);
                var22.field2249.method5373((float) (this.field7722.field8363 >> 16 & 0xFF) / 255.0F, (float) (this.field7722.field8363 >> 8 & 0xFF) / 255.0F, (float) (this.field7722.field8363 >> 0 & 0xFF) / 255.0F);
                this.field7722.field8264.method5412(this.field7722.field8258);
                this.field7722.field8264.method5407();
                var22.field2260.method5082(this.field7722.field8264);
                var22.field2260.method5079(1.0F / (this.field7722.field8304 - this.field7722.field8251));
            } else {
                var22.field2260.method5074(0.0F, 0.0F, 0.0F, 0.0F);
                var22.field2249.method5373(0.0F, 0.0F, 0.0F);
            }
            if ((this.field7752 & 0x7) == 0) {
                int var24 = 0;
                for (int var25 = 0; var25 < this.field7742.length; var25++) {
                    GpuFloorModelRelated1 var26 = (GpuFloorModelRelated1) this.field7742[var25];
                    if (var26.field9444 != 0) {
                        if (this.field7722.field8274) {
                            this.field7722.setWaterFog(0, var26.field9440);
                            var22.field2266.method5074(0.0F, 1.0F, 0.0F, (float) var26.field9440.field1474 / 255.0F * (float) var26.field9440.scale + (float) this.field7722.field8236);
                            var22.field2266.method5079(1.0F / (float) var26.field9440.scale);
                            var22.field2259.method5373((float) (var26.field9440.colour >> 16 & 0xFF) / 255.0F, (float) (var26.field9440.colour >> 8 & 0xFF) / 255.0F, (float) (var26.field9440.colour >> 0 & 0xFF) / 255.0F);
                        } else {
                            var22.field2266.method5074(0.0F, 0.0F, 0.0F, 0.0F);
                            var22.field2259.method5373(0.0F, 0.0F, 0.0F);
                        }
                        boolean var27 = false;
                        if (var26.field9438 == -1) {
                            var22.field2268 = this.field7722.field8312;
                        } else {
                            var22.field2268 = this.field7722.field8336.method4359(var26.field9438);
                            Material var28 = this.field7722.field400.method889(var26.field9438);
                            var27 = !Material.method12638(var28.field1270);
                        }
                        this.field7722.method13587(1, var26.field9446);
                        this.field7722.method13688(this.field7729);
                        var22.field2248.method5435(1.0F / var26.field9441, 1.0F / var26.field9441, 1.0F, 1.0F);
                        var22.field2267 = var26.field9445;
                        var22.field2261 = var26.field9442 - var26.field9445 + 1;
                        var22.field2269 = var24;
                        var22.field2252 = var26.field9444 / 3;
                        var22.method3849(var27);
                        var24 += var26.field9444;
                    }
                }
            } else {
                var22.field2262.method5373(this.field7722.field8272[0], this.field7722.field8272[1], this.field7722.field8272[2]);
                var22.field2263.method5373(this.field7722.field8320 * this.field7722.field8316, this.field7722.field8320 * this.field7722.field8317, this.field7722.field8320 * this.field7722.field8237);
                var22.field2264.method5373(-this.field7722.field8373 * this.field7722.field8316, -this.field7722.field8373 * this.field7722.field8317, -this.field7722.field8373 * this.field7722.field8237);
                var22.field2265.method5373(this.field7722.field8319 * this.field7722.field8316, this.field7722.field8319 * this.field7722.field8317, this.field7722.field8319 * this.field7722.field8237);
                int var29 = 0;
                for (int var30 = 0; var30 < this.field7742.length; var30++) {
                    GpuFloorModelRelated1 var31 = (GpuFloorModelRelated1) this.field7742[var30];
                    if (var31.field9444 > 0) {
                        if (this.field7722.field8274) {
                            this.field7722.setWaterFog(0, var31.field9440);
                            float var32 = 0.15F;
                            var22.field2266.method5074(0.0F, 1.0F / ((float) var31.field9440.scale * var32), 0.0F, 256.0F / ((float) var31.field9440.scale * var32));
                            var22.field2259.method5373((float) (var31.field9440.colour >> 16 & 0xFF) / 255.0F, (float) (var31.field9440.colour >> 8 & 0xFF) / 255.0F, (float) (var31.field9440.colour >> 0 & 0xFF) / 255.0F);
                        } else {
                            var22.field2266.method5074(0.0F, 0.0F, 0.0F, 0.0F);
                            var22.field2259.method5373(0.0F, 0.0F, 0.0F);
                        }
                        byte var33 = 11;
                        if (var31.field9438 == -1) {
                            var22.field2268 = this.field7722.field8312;
                        } else {
                            Material var34 = this.field7722.field400.method889(var31.field9438);
                            var33 = var34.field1270;
                            var22.field2268 = this.field7722.field8336.method4359(var31.field9438);
                            var22.method3862(var34);
                        }
                        this.field7722.method13587(1, var31.field9446);
                        this.field7722.method13688(this.field7729);
                        var22.field2248.method5435(1.0F / var31.field9441, 1.0F / var31.field9441, 1.0F, 1.0F);
                        var22.field2267 = var31.field9445;
                        var22.field2261 = var31.field9442 - var31.field9445 + 1;
                        var22.field2269 = var29;
                        var22.field2252 = var31.field9444 / 3;
                        switch (var33) {
                            case 1:
                                var22.field2258.method5373(this.field7722.field8322.entries[12], this.field7722.field8322.entries[13], this.field7722.field8322.entries[14]);
                                if (this.field7722.field8274) {
                                    var22.method3854();
                                } else {
                                    var22.method3851(0);
                                }
                                break;
                            case 2:
                            case 4:
                            case 8:
                            case 9:
                                if (this.field7722.field8242 || (this.field7752 & 0x8) == 0 || !this.field7722.field8350.method16196()) {
                                    var22.method3850(0);
                                } else {
                                    EnvMappedWaterShader var35 = this.field7722.field8350;
                                    if (var33 == 2) {
                                        var35 = this.field7722.field8349;
                                    }
                                    var35.field10107.method5412(this.field7722.field8279);
                                    var35.field10112.method5435(1.0F / ((float) var31.field9440.field1470 * var31.field9441), 1.0F / ((float) var31.field9440.field1470 * var31.field9441), 1.0F, 1.0F);
                                    var35.field10114.method5373(this.field7722.field8322.entries[12], this.field7722.field8322.entries[13], this.field7722.field8322.entries[14]);
                                    Material var36 = this.field7722.field400.method889(var31.field9438);
                                    var35.field10115 = var36.field1248;
                                    var35.field10132 = var31.field9445;
                                    var35.field10117 = var31.field9442 - var31.field9445 + 1;
                                    var35.field10130 = var29;
                                    var35.field10133 = var31.field9444 / 3;
                                    var35.field10123.method5075(var22.field2266);
                                    var35.field10125.method5334(var22.field2259);
                                    var35.field10131.method5075(var22.field2260);
                                    var35.field10129.method5334(var22.field2249);
                                    var35.method16204();
                                }
                                break;
                            case 3:
                            case 5:
                            default:
                                if (this.field7722.field8274) {
                                    var22.method3853();
                                } else {
                                    var22.method3850(0);
                                }
                                break;
                            case 6:
                                var22.method3849(!Material.method12638(var33));
                                break;
                            case 7:
                                var22.field2258.method5373(this.field7722.field8322.entries[12], this.field7722.field8322.entries[13], this.field7722.field8322.entries[14]);
                                var22.field2256.method5453();
                                var22.field2253 = this.field7722.method13516();
                                var22.method3852(0);
                        }
                        var29 += var31.field9444;
                    }
                }
            }
        }
        if (this.field7740 == null) {
            return;
        }
        this.field7722.method13592(1);
        this.field7722.method13587(0, this.field7726);
        this.field7722.method13587(1, this.field7757);
        this.field7722.method13688(this.field7729);
        this.field7740.method4375(var22, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("yn.s(IIIIIII[[Z)V")
    public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field7746 <= 0) {
            return;
        }
        IndexBuffer var9 = this.field7722.method13559(this.field7743);
        int var10 = 0;
        int var11 = 32767;
        int var12 = -32768;
        ByteBuffer var13 = this.field7722.field8244;
        var13.clear();
        for (int var14 = arg4; var14 < arg6; var14++) {
            int var15 = this.field387 * var14 + arg3;
            for (int var16 = arg3; var16 < arg5; var16++) {
                if (arg7[var16 - arg3][var14 - arg4]) {
                    short[] var17 = this.field7724[var15];
                    if (var17 != null) {
                        for (int var18 = 0; var18 < var17.length; var18++) {
                            int var19 = var17[var18] & 0xFFFF;
                            if (var19 > var12) {
                                var12 = var19;
                            }
                            if (var19 < var11) {
                                var11 = var19;
                            }
                            var13.putShort((short) var19);
                            var10++;
                        }
                    }
                }
                var15++;
            }
        }
        var9.method4452(0, var13.position(), this.field7722.field8245);
        if (var10 <= 0) {
            return;
        }
        this.field7722.method13598();
        ModelShader var20 = this.field7722.field8345;
        this.field7722.method13587(0, this.field7726);
        this.field7722.method13587(1, this.field7757);
        this.field7722.method13688(this.field7729);
        this.field7722.method13588(var9);
        this.field7722.method524(Matrix4x3.field3455);
        float var21 = (float) this.field7722.method457().method921();
        float var22 = (float) this.field7722.method457().method922();
        Matrix4x3 var23 = new Matrix4x3();
        Matrix4x3 var24 = new Matrix4x3();
        var23.method5105(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
        var24.method5112((float) arg2 / ((float) this.field385 * 256.0F), (float) -arg2 / ((float) this.field385 * 256.0F), 1.0F / (this.field7730 - this.field7744));
        var24.method5116((float) arg0 - (float) (arg2 * arg3) / 256.0F, (float) (arg2 * arg6) / 256.0F + (float) arg1, -this.field7744 / (this.field7730 - this.field7744));
        var24.method5113(2.0F / var21, 2.0F / var22, 1.0F);
        var24.method5116(-1.0F, -1.0F, 0.0F);
        this.field7722.field8351.method5118(var23, var24);
        this.field7722.field8264.method5385(this.field7722.field8351);
        this.field7722.method784(this.field7722.field8264);
        var20.method3848(Matrix4x4.field3479);
        var20.field2260.method5074(0.0F, 0.0F, 0.0F, 0.0F);
        var20.field2249.method5373(0.0F, 0.0F, 0.0F);
        var20.field2266.method5074(0.0F, 0.0F, 0.0F, 0.0F);
        var20.field2259.method5373(0.0F, 0.0F, 0.0F);
        var20.field2268 = this.field7722.field8312;
        var20.field2248.method5453();
        var20.field2267 = var11;
        var20.field2261 = var12 - var11 + 1;
        var20.field2269 = 0;
        var20.field2252 = var10 / 3;
        if (this.field7722.field8305) {
            this.field7722.RA(false);
            var20.method3849(false);
            this.field7722.RA(true);
        } else {
            var20.method3849(false);
        }
    }

    @ObfuscatedName("yn.w(IILna;)Lna;")
    public HardShadow w(int arg0, int arg1, HardShadow arg2) {
        if ((this.field7748[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field385 >> this.field7722.field8326;
        GpuHardShadow var5 = (GpuHardShadow) arg2;
        GpuHardShadow var6;
        if (var5 != null && var5.method17123(var4, var4)) {
            var6 = var5;
            var5.method17126();
        } else {
            var6 = new GpuHardShadow(this.field7722, var4, var4);
        }
        var6.method17141(0, 0, var4, var4);
        this.method12983(var6, arg0, arg1);
        return var6;
    }

    @ObfuscatedName("yn.ad(Lalk;II)V")
    public void method12983(GpuHardShadow arg0, int arg1, int arg2) {
        int[] var4 = this.field7735[arg1][arg2];
        int[] var5 = this.field7736[arg1][arg2];
        int var6 = var4.length;
        if (this.field7759.length < var6) {
            this.field7759 = new int[var6];
            this.field7760 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            this.field7759[var7] = var4[var7] >> this.field7722.field8326;
            this.field7760[var7] = var5[var7] >> this.field7722.field8326;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = this.field7759[var8];
            int var10 = this.field7760[var8++];
            int var11 = this.field7759[var8];
            int var12 = this.field7760[var8++];
            int var13 = this.field7759[var8];
            int var14 = this.field7760[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method17127(var10, var12, var14, var9, var11, var13);
            }
        }
    }

    @ObfuscatedName("yn.l(Lna;IIIIZ)Z")
    public boolean method203(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field7740 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field7722.field8327 * arg2 >> 8) >> this.field7722.field8326;
            int var8 = arg3 - (this.field7722.field8371 * arg2 >> 8) >> this.field7722.field8326;
            return this.field7740.method4378(arg0, var7, var8);
        }
    }

    @ObfuscatedName("yn.UA(Lna;IIIIZ)V")
    public void UA(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field7740 != null && arg0 != null) {
            int var7 = arg1 - (this.field7722.field8327 * arg2 >> 8) >> this.field7722.field8326;
            int var8 = arg3 - (this.field7722.field8371 * arg2 >> 8) >> this.field7722.field8326;
            this.field7740.method4381(arg0, var7, var8);
        }
    }

    @ObfuscatedName("yn.NA(Lna;IIIIZ)V")
    public void NA(HardShadow arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field7740 != null && arg0 != null) {
            int var7 = arg1 - (this.field7722.field8327 * arg2 >> 8) >> this.field7722.field8326;
            int var8 = arg3 - (this.field7722.field8371 * arg2 >> 8) >> this.field7722.field8326;
            this.field7740.method4377(arg0, var7, var8);
        }
    }

    @ObfuscatedName("yn.f(Lacg;[I)V")
    public void method204(Light arg0, int[] arg1) {
        this.field7741.addFirst(new GpuFloorModelRelated(this.field7722, this, arg0, arg1));
    }
}
