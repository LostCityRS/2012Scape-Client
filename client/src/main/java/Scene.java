import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("oo")
public class Scene {

    @ObfuscatedName("oo.u")
    public static boolean field4504 = true;

    @ObfuscatedName("oo.j")
    public final int field4510;

    @ObfuscatedName("oo.a")
    public final int field4499;

    @ObfuscatedName("oo.s")
    public final int field4487;

    @ObfuscatedName("oo.c")
    public final int field4538 = 16;

    @ObfuscatedName("oo.m")
    public final RendererToolkit field4489;

    @ObfuscatedName("oo.t")
    public SceneDebugging field4490;

    @ObfuscatedName("oo.l")
    public final boolean field4491;

    @ObfuscatedName("oo.f")
    public boolean field4492;

    @ObfuscatedName("oo.d")
    public final OcclusionManager field4493;

    @ObfuscatedName("oo.z")
    public int field4494;

    @ObfuscatedName("oo.n")
    public final int field4495;

    @ObfuscatedName("oo.o")
    public final int field4496;

    @ObfuscatedName("oo.q")
    public Tile[][][] field4497;

    @ObfuscatedName("oo.p")
    public FloorModel[] field4498;

    @ObfuscatedName("oo.w")
    public Tile[][][] field4500;

    @ObfuscatedName("oo.b")
    public FloorModel[] field4527;

    @ObfuscatedName("oo.x")
    public Tile[][][] field4508;

    @ObfuscatedName("oo.i")
    public FloorModel[] field4502;

    @ObfuscatedName("oo.v")
    public int[][] field4488;

    @ObfuscatedName("oo.k")
    public short[][] field4517;

    @ObfuscatedName("oo.h")
    public byte[][] field4505;

    @ObfuscatedName("oo.r")
    public byte[][] field4530;

    @ObfuscatedName("oo.g")
    public byte[][] field4534;

    @ObfuscatedName("oo.y")
    public byte[][] field4524;

    @ObfuscatedName("oo.e")
    public int field4509 = 0;

    @ObfuscatedName("oo.ay")
    public final int field4501 = 10038;

    @ObfuscatedName("oo.af")
    public final int field4511 = 5063;

    @ObfuscatedName("oo.ar")
    public final int field4512 = 5091;

    @ObfuscatedName("oo.an")
    public final GraphEntity[] field4513;

    @ObfuscatedName("oo.ap")
    public final GraphEntity[] field4514;

    @ObfuscatedName("oo.ag")
    public final GraphEntity[] field4536;

    @ObfuscatedName("oo.as")
    public int field4516;

    @ObfuscatedName("oo.ai")
    public int field4485;

    @ObfuscatedName("oo.ao")
    public final GraphEntity[] field4528;

    @ObfuscatedName("oo.al")
    public final GraphEntity[] field4519;

    @ObfuscatedName("oo.at")
    public final PrimaryLayerEntity[] field4506;

    @ObfuscatedName("oo.ax")
    public int field4521;

    @ObfuscatedName("oo.aw")
    public int field4503;

    @ObfuscatedName("oo.aa")
    public int field4523;

    @ObfuscatedName("oo.am")
    public int field4515;

    @ObfuscatedName("oo.ad")
    public int field4525;

    @ObfuscatedName("oo.az")
    public int field4520;

    @ObfuscatedName("oo.ak")
    public int field4531;

    @ObfuscatedName("oo.av")
    public int field4518;

    @ObfuscatedName("oo.aj")
    public int field4529;

    @ObfuscatedName("oo.ah")
    public int field4486;

    @ObfuscatedName("oo.au")
    public int field4484;

    @ObfuscatedName("oo.ae")
    public int field4532;

    @ObfuscatedName("oo.ac")
    public int field4533;

    @ObfuscatedName("oo.aq")
    public final float[] field4522 = new float[3];

    @ObfuscatedName("oo.ab")
    public final Light[] field4535 = new Light[8];

    @ObfuscatedName("oo.bq")
    public final int field4545 = 1;

    @ObfuscatedName("oo.bz")
    public int field4537;

    @ObfuscatedName("oo.bv")
    public long[][][] field4526;

    @ObfuscatedName("oo.bj")
    public StaticPointLight[] field4539;

    @ObfuscatedName("oo.bf")
    public boolean[] field4540;

    @ObfuscatedName("oo.bt")
    public PickableEntityList field4541;

    @ObfuscatedName("oo.bg")
    public boolean[][] field4542;

    @ObfuscatedName("oo.bl")
    public final int[] field4543;

    @ObfuscatedName("oo.bk")
    public boolean[][] field4544;

    @ObfuscatedName("oo.bs")
    public boolean[][] field4507;

    public Scene(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        this.field4489 = arg0;
        this.field4491 = this.field4489.method768() > 0;
        this.field4510 = arg1;
        this.field4499 = 0x1 << this.field4510;
        this.field4487 = this.field4499 >> 1;
        this.field4494 = arg2;
        this.field4495 = arg3;
        this.field4496 = arg4;
        this.field4531 = arg5;
        this.field4490 = new SceneDebugging();
        this.field4493 = new OcclusionManager(this);
        this.field4500 = new Tile[arg2][this.field4495][this.field4496];
        this.field4527 = new FloorModel[arg2];
        if (arg6) {
            this.field4488 = new int[this.field4495][this.field4496];
            this.field4505 = new byte[this.field4495][this.field4496];
            this.field4517 = new short[this.field4495][this.field4496];
            this.field4530 = new byte[this.field4495][this.field4496];
            this.field4534 = new byte[this.field4495][this.field4496];
            this.field4524 = new byte[this.field4495][this.field4496];
            this.field4508 = new Tile[1][this.field4495][this.field4496];
            this.field4502 = new FloorModel[1];
        }
        if (arg7) {
            this.field4526 = new long[arg2][arg3][arg4];
            this.field4539 = new StaticPointLight[65459];
            this.field4540 = new boolean[65459];
            this.field4537 = 0;
        }
        this.method7404(false);
        this.field4513 = new GraphEntity[2];
        this.field4514 = new GraphEntity[2];
        this.field4536 = new GraphEntity[2];
        this.field4519 = new GraphEntity[10038];
        this.field4516 = 0;
        this.field4528 = new GraphEntity[5063];
        this.field4485 = 0;
        this.field4506 = new PrimaryLayerEntity[5091];
        this.field4509 = 0;
        this.field4544 = new boolean[this.field4531 + this.field4531 + 1][this.field4531 + this.field4531 + 1];
        this.field4542 = new boolean[this.field4531 + this.field4531 + 2][this.field4531 + this.field4531 + 2];
        this.field4543 = new int[this.field4531 + this.field4531 + 2];
        this.field4541 = new PickableEntityList(false);
    }

    @ObfuscatedName("oo.u(II)V")
    public void method7546(int arg0) {
    }

    @ObfuscatedName("oo.j(Ll;I)V")
    public void method7403(Font arg0) {
    }

    @ObfuscatedName("oo.a(ZI)V")
    public void method7404(boolean arg0) {
        if (arg0) {
            this.field4497 = this.field4508;
            this.field4498 = this.field4502;
        } else {
            this.field4497 = this.field4500;
            this.field4498 = this.field4527;
        }
        this.field4494 = this.field4497.length;
    }

    @ObfuscatedName("oo.s(B)V")
    public void method7405() {
        for (int var1 = 0; var1 < this.field4495; var1++) {
            for (int var2 = 0; var2 < this.field4496; var2++) {
                if (this.field4497[0][var1][var2] == null) {
                    this.field4497[0][var1][var2] = new Tile(0);
                }
            }
        }
    }

    @ObfuscatedName("oo.c(IIB)V")
    public void method7466(int arg0, int arg1) {
        Tile var3 = this.field4497[0][arg0][arg1];
        for (int var4 = 0; var4 < 3; var4++) {
            Tile var5 = this.field4497[var4][arg0][arg1] = this.field4497[var4 + 1][arg0][arg1];
            if (var5 != null) {
                for (PrimaryLayerEntityList var6 = var5.field4554; var6 != null; var6 = var6.field4641) {
                    PrimaryLayerEntity var7 = var6.field4642;
                    if (var7.field10510 == arg0 && var7.field10509 == arg1) {
                        var7.field9807--;
                    }
                }
                if (var5.field4552 != null) {
                    var5.field4552.field9807--;
                }
                if (var5.field4548 != null) {
                    var5.field4548.field9807--;
                }
                if (var5.field4550 != null) {
                    var5.field4550.field9807--;
                }
                if (var5.field4546 != null) {
                    var5.field4546.field9807--;
                }
                if (var5.field4551 != null) {
                    var5.field4551.field9807--;
                }
            }
        }
        if (this.field4497[0][arg0][arg1] == null) {
            this.field4497[0][arg0][arg1] = new Tile(0);
            this.field4497[0][arg0][arg1].field4549 = 1;
        }
        this.field4497[0][arg0][arg1].field4547 = var3;
        this.field4497[3][arg0][arg1] = null;
    }

    @ObfuscatedName("oo.m(IIII)Lou;")
    public Tile method7406(int arg0, int arg1, int arg2) {
        if (this.field4497[arg0][arg1][arg2] == null) {
            boolean var4 = this.field4497[0][arg1][arg2] != null && this.field4497[0][arg1][arg2].field4547 != null;
            if (var4 && arg0 >= this.field4494 - 1) {
                return null;
            }
            this.method7408(arg0, arg1, arg2);
        }
        return this.field4497[arg0][arg1][arg2];
    }

    @ObfuscatedName("oo.t(IIII)V")
    public void method7408(int arg0, int arg1, int arg2) {
        boolean var4 = this.field4497[0][arg1][arg2] != null && this.field4497[0][arg1][arg2].field4547 != null;
        for (int var5 = arg0; var5 >= 0; var5--) {
            if (this.field4497[var5][arg1][arg2] == null) {
                Tile var6 = this.field4497[var5][arg1][arg2] = new Tile(var5);
                if (var4) {
                    var6.field4549++;
                }
            }
        }
    }

    @ObfuscatedName("oo.l(ILxa;I)V")
    public void method7409(int arg0, FloorModel arg1) {
        this.field4498[arg0] = arg1;
    }

    @ObfuscatedName("oo.f(IIB)I")
    public int method7410(int arg0, int arg1) {
        return this.field4517 == null ? 0 : this.field4517[arg0][arg1] & 0xFFFF;
    }

    @ObfuscatedName("oo.d(III)I")
    public int method7411(int arg0, int arg1) {
        return this.field4488 == null ? 0 : this.field4488[arg0][arg1] & 0xFFFFFF;
    }

    @ObfuscatedName("oo.z(III)I")
    public int method7489(int arg0, int arg1) {
        return this.field4505 == null ? 0 : this.field4505[arg0][arg1] & 0xFF;
    }

    @ObfuscatedName("oo.n(IIB)I")
    public int method7413(int arg0, int arg1) {
        return this.field4530 == null ? 0 : this.field4530[arg0][arg1] & 0xFF;
    }

    @ObfuscatedName("oo.o(IIB)I")
    public int method7505(int arg0, int arg1) {
        return this.field4534 == null ? 0 : this.field4534[arg0][arg1] & 0xFF;
    }

    @ObfuscatedName("oo.q(III)I")
    public int method7501(int arg0, int arg1) {
        return this.field4524 == null ? 0 : this.field4524[arg0][arg1] & 0xFF;
    }

    @ObfuscatedName("oo.p(IIIIIIIII)V")
    public void method7416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field4488 != null) {
            this.field4488[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (this.field4517 != null) {
            this.field4517[arg0][arg1] = (short) arg3;
        }
        if (this.field4505 != null) {
            this.field4505[arg0][arg1] = (byte) arg4;
        }
        if (this.field4530 != null) {
            this.field4530[arg0][arg1] = (byte) arg5;
        }
        if (this.field4534 != null) {
            this.field4534[arg0][arg1] = (byte) arg6;
        }
        if (this.field4524 != null) {
            this.field4524[arg0][arg1] = (byte) arg7;
        }
    }

    @ObfuscatedName("oo.w(IIILakm;B)V")
    public void method7512(int arg0, int arg1, int arg2, GroundDecorLayerEntity arg3) {
        Tile var5 = this.method7406(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field4552 = arg3;
        int var6 = this.field4502 == this.field4498 ? 1 : 0;
        if (!arg3.method12807()) {
            arg3.field9806 = this.field4536[var6];
            this.field4536[var6] = arg3;
        } else if (arg3.method12808()) {
            arg3.field9806 = this.field4514[var6];
            this.field4514[var6] = arg3;
        } else {
            arg3.field9806 = this.field4513[var6];
            this.field4513[var6] = arg3;
        }
    }

    @ObfuscatedName("oo.b(IIIILakb;B)V")
    public void method7499(int arg0, int arg1, int arg2, int arg3, ObjLayerEntity arg4) {
        Tile var6 = this.method7406(arg0, arg1, arg2);
        if (var6 == null) {
            return;
        }
        arg4.method8551(new Vector3((float) ((arg1 << this.field4510) + this.field4487), (float) arg3, (float) ((arg2 << this.field4510) + this.field4487)));
        var6.field4553 = arg4;
        int var7 = this.field4502 == this.field4498 ? 1 : 0;
        if (!arg4.method12807()) {
            arg4.field9806 = this.field4536[var7];
            this.field4536[var7] = arg4;
        } else if (arg4.method12808()) {
            arg4.field9806 = this.field4514[var7];
            this.field4514[var7] = arg4;
        } else {
            arg4.field9806 = this.field4513[var7];
            this.field4513[var7] = arg4;
        }
    }

    @ObfuscatedName("oo.x(IIILakr;Lakr;I)V")
    public void method7402(int arg0, int arg1, int arg2, WallLayerEntity arg3, WallLayerEntity arg4) {
        Tile var6 = this.method7406(arg0, arg1, arg2);
        if (var6 == null) {
            return;
        }
        var6.field4548 = arg3;
        var6.field4550 = arg4;
        int var7 = this.field4502 == this.field4498 ? 1 : 0;
        if (!arg3.method12807()) {
            arg3.field9806 = this.field4536[var7];
            this.field4536[var7] = arg3;
        } else if (arg3.method12808()) {
            arg3.field9806 = this.field4514[var7];
            this.field4514[var7] = arg3;
        } else {
            arg3.field9806 = this.field4513[var7];
            this.field4513[var7] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (!arg4.method12807()) {
            arg4.field9806 = this.field4536[var7];
            this.field4536[var7] = arg4;
        } else if (arg4.method12808()) {
            arg4.field9806 = this.field4514[var7];
            this.field4514[var7] = arg4;
        } else {
            arg4.field9806 = this.field4513[var7];
            this.field4513[var7] = arg4;
        }
    }

    @ObfuscatedName("oo.i(IIILakv;Lakv;I)V")
    public void method7420(int arg0, int arg1, int arg2, WallDecorLayerEntity arg3, WallDecorLayerEntity arg4) {
        Tile var6 = this.method7406(arg0, arg1, arg2);
        if (var6 == null) {
            return;
        }
        var6.field4546 = arg3;
        var6.field4551 = arg4;
        int var7 = this.field4502 == this.field4498 ? 1 : 0;
        if (!arg3.method12807()) {
            arg3.field9806 = this.field4536[var7];
            this.field4536[var7] = arg3;
        } else if (arg3.method12808()) {
            arg3.field9806 = this.field4514[var7];
            this.field4514[var7] = arg3;
        } else {
            arg3.field9806 = this.field4513[var7];
            this.field4513[var7] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (!arg4.method12807()) {
            arg4.field9806 = this.field4536[var7];
            this.field4536[var7] = arg4;
        } else if (arg4.method12808()) {
            arg4.field9806 = this.field4514[var7];
            this.field4514[var7] = arg4;
        } else {
            arg4.field9806 = this.field4513[var7];
            this.field4513[var7] = arg4;
        }
    }

    @ObfuscatedName("oo.v(Laku;ZI)Z")
    public boolean method7412(PrimaryLayerEntity arg0, boolean arg1) {
        boolean var3 = this.field4502 == this.field4498;
        int var4 = 0;
        short var5 = 0;
        byte var6 = 0;
        arg0.method14006();
        if (arg0.field10510 < 0 || arg0.field10509 < 0 || arg0.field10508 >= this.field4495 || arg0.field10511 >= this.field4496) {
            return false;
        }
        short var7 = 0;
        for (int var8 = arg0.field10510; var8 <= arg0.field10508; var8++) {
            for (int var9 = arg0.field10509; var9 <= arg0.field10511; var9++) {
                Tile var10 = this.method7406(arg0.field9807, var8, var9);
                if (var10 != null) {
                    PrimaryLayerEntityList var11 = PrimaryLayerEntityList.method11871(arg0);
                    PrimaryLayerEntityList var12 = var10.field4554;
                    if (var12 == null) {
                        var10.field4554 = var11;
                    } else {
                        while (var12.field4641 != null) {
                            var12 = var12.field4641;
                        }
                        var12.field4641 = var11;
                    }
                    if (var3 && (this.field4488[var8][var9] & 0xFF000000) != 0) {
                        var4 = this.field4488[var8][var9];
                        var5 = this.field4517[var8][var9];
                        var6 = this.field4505[var8][var9];
                    }
                    if (!arg1 && var10.field4552 != null && var10.field4552.field10495 > var7) {
                        var7 = var10.field4552.field10495;
                    }
                }
            }
        }
        if (var3 && (var4 & 0xFF000000) != 0) {
            for (int var13 = arg0.field10510; var13 <= arg0.field10508; var13++) {
                for (int var14 = arg0.field10509; var14 <= arg0.field10511; var14++) {
                    if ((this.field4488[var13][var14] & 0xFF000000) == 0) {
                        this.field4488[var13][var14] = var4;
                        this.field4517[var13][var14] = var5;
                        this.field4505[var13][var14] = var6;
                    }
                }
            }
        }
        if (arg1) {
            this.field4506[++this.field4509 - 1] = arg0;
            arg0.field9808 = this;
        } else {
            int var15 = this.field4502 == this.field4498 ? 1 : 0;
            if (!arg0.method12807()) {
                arg0.field9806 = this.field4536[var15];
                this.field4536[var15] = arg0;
            } else if (arg0.method12808()) {
                arg0.field9806 = this.field4514[var15];
                this.field4514[var15] = arg0;
            } else {
                arg0.field9806 = this.field4513[var15];
                this.field4513[var15] = arg0;
            }
        }
        if (arg1) {
            Vector3 var16 = Vector3.method5290(arg0.method8565().field3464);
            var16.field3476 -= var7;
            arg0.method8551(var16);
            var16.method5291();
        }
        return true;
    }

    @ObfuscatedName("oo.k(IIIIB)V")
    public void method7422(int arg0, int arg1, int arg2, int arg3) {
        Tile var5 = this.field4497[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        WallDecorLayerEntity var6 = var5.field4546;
        WallDecorLayerEntity var7 = var5.field4551;
        if (var6 != null) {
            var6.field10496 = (short) (var6.field10496 * arg3 / (0x10 << this.field4510 - 7));
            var6.field10497 = (short) (var6.field10497 * arg3 / (0x10 << this.field4510 - 7));
        }
        if (var7 != null) {
            var7.field10496 = (short) (var7.field10496 * arg3 / (0x10 << this.field4510 - 7));
            var7.field10497 = (short) (var7.field10497 * arg3 / (0x10 << this.field4510 - 7));
        }
    }

    @ObfuscatedName("oo.h(B)V")
    public void method7423() {
        for (int var1 = 0; var1 < this.field4509; var1++) {
            PrimaryLayerEntity var2 = this.field4506[var1];
            this.method7439(var2, true);
            this.field4506[var1] = null;
        }
        this.field4509 = 0;
    }

    @ObfuscatedName("oo.r(IIII)Lakr;")
    public WallLayerEntity method7462(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        if (var4 != null) {
            this.method7432(var4.field4548);
            if (var4.field4548 != null) {
                WallLayerEntity var5 = var4.field4548;
                var4.field4548 = null;
                return var5;
            }
        }
        return null;
    }

    @ObfuscatedName("oo.g(IIII)Lakr;")
    public WallLayerEntity method7425(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        if (var4 != null) {
            this.method7432(var4.field4550);
            if (var4.field4550 != null) {
                WallLayerEntity var5 = var4.field4550;
                var4.field4550 = null;
                return var5;
            }
        }
        return null;
    }

    @ObfuscatedName("oo.y(IIIB)Lakv;")
    public WallDecorLayerEntity method7426(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        if (var4 != null) {
            this.method7432(var4.field4546);
            if (var4.field4546 != null) {
                WallDecorLayerEntity var5 = var4.field4546;
                var4.field4546 = null;
                return var5;
            }
        }
        return null;
    }

    @ObfuscatedName("oo.e(IIII)Lakv;")
    public WallDecorLayerEntity method7461(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        if (var4 != null) {
            this.method7432(var4.field4551);
            if (var4.field4551 != null) {
                WallDecorLayerEntity var5 = var4.field4551;
                var4.field4551 = null;
                return var5;
            }
        }
        return null;
    }

    @ObfuscatedName("oo.ay(IIIB)Lakm;")
    public GroundDecorLayerEntity method7428(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        this.method7432(var4.field4552);
        if (var4.field4552 == null) {
            return null;
        } else {
            GroundDecorLayerEntity var5 = var4.field4552;
            var4.field4552 = null;
            return var5;
        }
    }

    @ObfuscatedName("oo.af(IIII)Lakb;")
    public ObjLayerEntity method7429(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            ObjLayerEntity var5 = var4.field4553;
            var4.field4553 = null;
            this.method7432(var5);
            return var5;
        }
    }

    @ObfuscatedName("oo.ar(IIILoj;B)Laku;")
    public PrimaryLayerEntity method7430(int arg0, int arg1, int arg2, PrimaryLayerEntityPredicate arg3) {
        Tile var5 = this.field4497[arg0][arg1][arg2];
        if (var5 == null) {
            return null;
        }
        for (PrimaryLayerEntityList var6 = var5.field4554; var6 != null; var6 = var6.field4641) {
            PrimaryLayerEntity var7 = var6.field4642;
            if ((arg3 == null || arg3.method1360(var7)) && var7.field10510 == arg1 && var7.field10509 == arg2) {
                this.method7439(var7, false);
                return var7;
            }
        }
        return null;
    }

    @ObfuscatedName("oo.an(Laku;ZI)V")
    public void method7439(PrimaryLayerEntity arg0, boolean arg1) {
        for (int var3 = arg0.field10510; var3 <= arg0.field10508; var3++) {
            for (int var4 = arg0.field10509; var4 <= arg0.field10511; var4++) {
                Tile var5 = this.field4497[arg0.field9807][var3][var4];
                if (var5 != null) {
                    PrimaryLayerEntityList var6 = var5.field4554;
                    PrimaryLayerEntityList var7 = null;
                    while (var6 != null) {
                        if (var6.field4642 == arg0) {
                            if (var7 == null) {
                                var5.field4554 = var6.field4641;
                            } else {
                                var7.field4641 = var6.field4641;
                            }
                            var6.method7646();
                            break;
                        }
                        var7 = var6;
                        var6 = var6.field4641;
                    }
                }
            }
        }
        if (!arg1) {
            this.method7432(arg0);
        }
    }

    @ObfuscatedName("oo.ap(Laes;I)V")
    public void method7432(GraphEntity arg0) {
        if (arg0 == null) {
            return;
        }
        arg0.method8566();
        for (int var2 = 0; var2 < 2; var2++) {
            GraphEntity var3 = null;
            for (GraphEntity var4 = this.field4513[var2]; var4 != null; var4 = var4.field9806) {
                if (arg0 == var4) {
                    if (var3 == null) {
                        this.field4513[var2] = var4.field9806;
                    } else {
                        var3.field9806 = var4.field9806;
                    }
                    return;
                }
                var3 = var4;
            }
            GraphEntity var5 = null;
            for (GraphEntity var6 = this.field4514[var2]; var6 != null; var6 = var6.field9806) {
                if (arg0 == var6) {
                    if (var5 == null) {
                        this.field4514[var2] = var6.field9806;
                    } else {
                        var5.field9806 = var6.field9806;
                    }
                    return;
                }
                var5 = var6;
            }
            GraphEntity var7 = null;
            for (GraphEntity var8 = this.field4536[var2]; var8 != null; var8 = var8.field9806) {
                if (arg0 == var8) {
                    if (var7 == null) {
                        this.field4536[var2] = var8.field9806;
                    } else {
                        var7.field9806 = var8.field9806;
                    }
                    return;
                }
                var7 = var8;
            }
        }
    }

    @ObfuscatedName("oo.ag(IIII)Lakr;")
    public WallLayerEntity method7433(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        return var4 == null ? null : var4.field4548;
    }

    @ObfuscatedName("oo.as(IIII)Lakr;")
    public WallLayerEntity method7442(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        return var4 == null ? null : var4.field4550;
    }

    @ObfuscatedName("oo.ai(IIIB)Lakv;")
    public WallDecorLayerEntity method7435(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        return var4 == null ? null : var4.field4546;
    }

    @ObfuscatedName("oo.ao(IIII)Lakb;")
    public ObjLayerEntity method7436(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        return var4 == null ? null : var4.field4553;
    }

    @ObfuscatedName("oo.al(IIILoj;I)Laku;")
    public PrimaryLayerEntity method7437(int arg0, int arg1, int arg2, PrimaryLayerEntityPredicate arg3) {
        Tile var5 = this.field4497[arg0][arg1][arg2];
        if (var5 == null) {
            return null;
        }
        for (PrimaryLayerEntityList var6 = var5.field4554; var6 != null; var6 = var6.field4641) {
            PrimaryLayerEntity var7 = var6.field4642;
            if ((arg3 == null || arg3.method1360(var7)) && var7.field10510 == arg1 && var7.field10509 == arg2) {
                return var7;
            }
        }
        return null;
    }

    @ObfuscatedName("oo.at(IIII)Loh;")
    public PrimaryLayerEntityList method7438(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        return var4 == null ? null : var4.field4554;
    }

    @ObfuscatedName("oo.ax(IIII)Lakm;")
    public GroundDecorLayerEntity method7517(int arg0, int arg1, int arg2) {
        Tile var4 = this.field4497[arg0][arg1][arg2];
        return var4 == null || var4.field4552 == null ? null : var4.field4552;
    }

    @ObfuscatedName("oo.aw()V")
    public void method7440() {
        for (int var1 = 0; var1 < this.field4494; var1++) {
            for (int var2 = 0; var2 < this.field4495; var2++) {
                for (int var3 = 0; var3 < this.field4496; var3++) {
                    Tile var4 = this.field4497[var1][var2][var3];
                    if (var4 != null) {
                        WallLayerEntity var5 = var4.field4548;
                        WallLayerEntity var6 = var4.field4550;
                        if (var5 != null && var5.method12815()) {
                            this.method7443(var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method12815()) {
                                this.method7443(var6, var1, var2, var3, 1, 1);
                                var6.method12816(this.field4489, var5, 0, 0, 0, false);
                                var6.method12817();
                            }
                            var5.method12817();
                        }
                        for (PrimaryLayerEntityList var7 = var4.field4554; var7 != null; var7 = var7.field4641) {
                            PrimaryLayerEntity var8 = var7.field4642;
                            if (var8 != null && var8.method12815()) {
                                this.method7443(var8, var1, var2, var3, var8.field10508 - var8.field10510 + 1, var8.field10511 - var8.field10509 + 1);
                                var8.method12817();
                            }
                        }
                        GroundDecorLayerEntity var9 = var4.field4552;
                        if (var9 != null && var9.method12815()) {
                            this.method7441(var9, var1, var2, var3);
                            var9.method12817();
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("oo.aa(Laes;IIII)V")
    public void method7441(GraphEntity arg0, int arg1, int arg2, int arg3) {
        if (arg2 < this.field4495) {
            Tile var5 = this.field4497[arg1][arg2 + 1][arg3];
            if (var5 != null && var5.field4552 != null && var5.field4552.method12815()) {
                int var6 = (this.field4498[arg1].method199(arg2 + 1, arg3) + this.field4498[arg1].method199(arg2 + 1 + 1, arg3) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1) + this.field4498[arg1].method199(arg2 + 1 + 1, arg3 + 1)) / 4 - (this.field4498[arg1].method199(arg2, arg3) + this.field4498[arg1].method199(arg2 + 1, arg3) + this.field4498[arg1].method199(arg2, arg3 + 1) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1)) / 4;
                arg0.method12816(this.field4489, var5.field4552, this.field4499, var6, 0, true);
            }
        }
        if (arg3 < this.field4495) {
            Tile var7 = this.field4497[arg1][arg2][arg3 + 1];
            if (var7 != null && var7.field4552 != null && var7.field4552.method12815()) {
                int var8 = (this.field4498[arg1].method199(arg2, arg3) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1) + this.field4498[arg1].method199(arg2, arg3 + 1 + 1) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1 + 1)) / 4 - (this.field4498[arg1].method199(arg2, arg3) + this.field4498[arg1].method199(arg2 + 1, arg3) + this.field4498[arg1].method199(arg2, arg3 + 1) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1)) / 4;
                arg0.method12816(this.field4489, var7.field4552, 0, var8, this.field4499, true);
            }
        }
        if (arg2 < this.field4495 && arg3 < this.field4496) {
            Tile var9 = this.field4497[arg1][arg2 + 1][arg3 + 1];
            if (var9 != null && var9.field4552 != null && var9.field4552.method12815()) {
                int var10 = (this.field4498[arg1].method199(arg2 + 1, arg3 + 1) + this.field4498[arg1].method199(arg2 + 1 + 1, arg3 + 1) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1 + 1) + this.field4498[arg1].method199(arg2 + 1 + 1, arg3 + 1 + 1)) / 4 - (this.field4498[arg1].method199(arg2, arg3) + this.field4498[arg1].method199(arg2 + 1, arg3) + this.field4498[arg1].method199(arg2, arg3 + 1) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1)) / 4;
                arg0.method12816(this.field4489, var9.field4552, this.field4499, var10, this.field4499, true);
            }
        }
        if (arg2 >= this.field4495 || arg3 <= 0) {
            return;
        }
        Tile var11 = this.field4497[arg1][arg2 + 1][arg3 - 1];
        if (var11 != null && var11.field4552 != null && var11.field4552.method12815()) {
            int var12 = (this.field4498[arg1].method199(arg2 + 1, arg3 - 1) + this.field4498[arg1].method199(arg2 + 1 + 1, arg3 - 1) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1 - 1) + this.field4498[arg1].method199(arg2 + 1 + 1, arg3 + 1 - 1)) / 4 - (this.field4498[arg1].method199(arg2, arg3) + this.field4498[arg1].method199(arg2 + 1, arg3) + this.field4498[arg1].method199(arg2, arg3 + 1) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1)) / 4;
            arg0.method12816(this.field4489, var11.field4552, this.field4499, var12, -this.field4499, true);
        }
    }

    @ObfuscatedName("oo.am(Laes;IIIII)V")
    public void method7443(GraphEntity arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        int var8 = arg2;
        int var9 = arg2 + arg4;
        int var10 = arg3 - 1;
        int var11 = arg3 + arg5;
        for (int var12 = arg1; var12 <= arg1 + 1; var12++) {
            if (this.field4494 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < this.field4495) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < this.field4496 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg3 && arg2 != var13)) {
                                Tile var15 = this.field4497[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (this.field4498[var12].method199(var13, var14) + this.field4498[var12].method199(var13 + 1, var14) + this.field4498[var12].method199(var13, var14 + 1) + this.field4498[var12].method199(var13 + 1, var14 + 1)) / 4 - (this.field4498[arg1].method199(arg2, arg3) + this.field4498[arg1].method199(arg2 + 1, arg3) + this.field4498[arg1].method199(arg2, arg3 + 1) + this.field4498[arg1].method199(arg2 + 1, arg3 + 1)) / 4;
                                    WallLayerEntity var17 = var15.field4548;
                                    WallLayerEntity var18 = var15.field4550;
                                    if (var17 != null && var17.method12815()) {
                                        arg0.method12816(this.field4489, var17, this.field4499 * (var13 - arg2) + this.field4487 * (1 - arg4), var16, this.field4499 * (var14 - arg3) + this.field4487 * (1 - arg5), var7);
                                    }
                                    if (var18 != null && var18.method12815()) {
                                        arg0.method12816(this.field4489, var18, this.field4499 * (var13 - arg2) + this.field4487 * (1 - arg4), var16, this.field4499 * (var14 - arg3) + this.field4487 * (1 - arg5), var7);
                                    }
                                    for (PrimaryLayerEntityList var19 = var15.field4554; var19 != null; var19 = var19.field4641) {
                                        PrimaryLayerEntity var20 = var19.field4642;
                                        if (var20 != null && var20.method12815() && (var20.field10510 == var13 || var8 == var13) && (var20.field10509 == var14 || var10 == var14)) {
                                            int var21 = var20.field10508 - var20.field10510 + 1;
                                            int var22 = var20.field10511 - var20.field10509 + 1;
                                            arg0.method12816(this.field4489, var20, this.field4499 * (var20.field10510 - arg2) + this.field4487 * (var21 - arg4), var16, this.field4499 * (var20.field10509 - arg3) + this.field4487 * (var22 - arg5), var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @ObfuscatedName("oo.ad(IIII[[[B[I[I[I[I[IIBIIZZIZ)V")
    public void method7419(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, boolean arg17) {
        this.field4493.field4613 = true;
        this.field4492 = arg15;
        this.field4521 = arg1 >> this.field4510;
        this.field4503 = arg3 >> this.field4510;
        this.field4523 = arg1;
        this.field4515 = arg3;
        this.field4525 = arg2;
        this.field4486 = this.field4521 - this.field4531;
        if (this.field4486 < 0) {
            this.field4518 = -(this.field4486);
            this.field4486 = 0;
        } else {
            this.field4518 = 0;
        }
        this.field4532 = this.field4503 - this.field4531;
        if (this.field4532 < 0) {
            this.field4529 = -(this.field4532);
            this.field4532 = 0;
        } else {
            this.field4529 = 0;
        }
        this.field4484 = this.field4531 + this.field4521;
        if (this.field4484 > this.field4495) {
            this.field4484 = this.field4495;
        }
        this.field4533 = this.field4531 + this.field4503;
        if (this.field4533 > this.field4496) {
            this.field4533 = this.field4496;
        }
        boolean[][] var19 = this.field4544;
        boolean[][] var20 = this.field4542;
        if (this.field4492) {
            for (int var21 = 0; var21 < this.field4531 + this.field4531 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < this.field4531 + this.field4531 + 2; var24++) {
                    if (var24 > 1) {
                        this.field4543[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = this.field4521 - this.field4531 + var21;
                    int var26 = this.field4503 - this.field4531 + var24;
                    if (var25 >= 0 && var26 >= 0 && var25 < this.field4495 && var26 < this.field4496) {
                        int var27 = var25 << this.field4510;
                        int var28 = var26 << this.field4510;
                        int var29 = this.field4527[this.field4527.length - 1].method199(var25, var26) - (0x3E8 << this.field4510 - 7);
                        int var30 = (this.field4502 == null ? this.field4527[0].method199(var25, var26) + this.field4499 : this.field4502[0].method199(var25, var26) + this.field4499) + (0x3E8 << this.field4510 - 7);
                        var23 = this.field4489.method500(var27, var29, var28, var27, var30, var28);
                        this.field4542[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        this.field4542[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = this.field4543[var24 - 1] & this.field4543[var24] & var22 & var23;
                        this.field4544[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                this.field4543[this.field4531 + this.field4531] = var22;
                this.field4543[this.field4531 + this.field4531 + 1] = var23;
            }
            if (arg17) {
                this.field4493.field4619 = arg5;
                this.field4493.field4620 = arg6;
                this.field4493.field4621 = arg7;
                this.field4493.field4622 = arg8;
                this.field4493.field4623 = arg9;
                this.field4493.method7591(this.field4489, arg10);
            } else {
                this.field4493.field4613 = false;
            }
        } else {
            if (this.field4507 == null) {
                this.field4507 = new boolean[this.field4531 + this.field4531 + 2][this.field4531 + this.field4531 + 2];
            }
            for (int var32 = 0; var32 < this.field4507.length; var32++) {
                for (int var33 = 0; var33 < this.field4507[0].length; var33++) {
                    this.field4507[var32][var33] = true;
                }
            }
            this.field4542 = this.field4507;
            this.field4544 = this.field4507;
            this.field4486 = 0;
            this.field4532 = 0;
            this.field4484 = this.field4495;
            this.field4533 = this.field4496;
            this.field4493.field4613 = false;
        }
        ParticleSystemRenderer.method3619(this, this.field4489);
        if (!this.field4541.field4473) {
            Iterator var34 = this.field4541.field4471.iterator();
            while (var34.hasNext()) {
                PickableEntity var35 = (PickableEntity) var34.next();
                var34.remove();
                PickableEntity.method2573(var35);
            }
        }
        if (this.field4491) {
            for (int var36 = 0; var36 < this.field4537; var36++) {
                this.field4539[var36].method7579(arg0, arg14);
            }
        }
        if (this.field4508 != null) {
            this.method7404(true);
            this.field4489.method503(-1, new WaterFogData(1583160, 40, 127, 63, 0, 0, 0));
            this.method7503(true, arg4, arg10, arg11, arg16);
            this.field4489.O();
            this.method7404(false);
        }
        this.method7503(false, arg4, arg10, arg11, arg16);
        if (!this.field4492) {
            this.field4544 = var19;
            this.field4542 = var20;
        }
    }

    @ObfuscatedName("oo.az(Z[[[BIBI)V")
    public void method7503(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4) {
        int var6 = arg0 ? 1 : 0;
        this.field4516 = 0;
        this.field4485 = 0;
        this.field4520++;
        if ((arg4 & 0x2) == 0) {
            for (GraphEntity var7 = this.field4513[var6]; var7 != null; var7 = var7.field9806) {
                this.method7491(var7);
                if (var7.field9810 != -1 && !this.method7448(var7, arg0, arg1, arg2, arg3)) {
                    this.field4519[++this.field4516 - 1] = var7;
                }
            }
        }
        if ((arg4 & 0x1) == 0) {
            for (GraphEntity var8 = this.field4514[var6]; var8 != null; var8 = var8.field9806) {
                this.method7491(var8);
                if (var8.field9810 != -1 && !this.method7448(var8, arg0, arg1, arg2, arg3)) {
                    this.field4528[++this.field4485 - 1] = var8;
                }
            }
            for (GraphEntity var9 = this.field4536[var6]; var9 != null; var9 = var9.field9806) {
                this.method7491(var9);
                if (var9.field9810 != -1 && !this.method7448(var9, arg0, arg1, arg2, arg3)) {
                    if (var9.method12808()) {
                        this.field4528[++this.field4485 - 1] = var9;
                    } else {
                        this.field4519[++this.field4516 - 1] = var9;
                    }
                }
            }
            if (!arg0) {
                for (int var10 = 0; var10 < this.field4509; var10++) {
                    this.method7491(this.field4506[var10]);
                    if (this.field4506[var10].field9810 != -1 && !this.method7448(this.field4506[var10], arg0, arg1, arg2, arg3)) {
                        if (this.field4506[var10].method12808()) {
                            this.field4528[++this.field4485 - 1] = this.field4506[var10];
                        } else {
                            this.field4519[++this.field4516 - 1] = this.field4506[var10];
                        }
                    }
                }
            }
        }
        if (this.field4516 > 0) {
            this.method7509(this.field4519, 0, this.field4516 - 1);
            for (int var11 = 0; var11 < this.field4516; var11++) {
                this.method7449(this.field4519[var11], this.field4535);
            }
        }
        if (this.field4491) {
            this.field4489.method535(0, null);
        }
        if ((arg4 & 0x2) == 0) {
            for (int var12 = 0; var12 < this.field4494; var12++) {
                if (var12 < arg2 || arg1 == null) {
                    int var21 = this.field4544.length;
                    if (this.field4486 + this.field4544.length > this.field4495) {
                        var21 -= this.field4486 + this.field4544.length - this.field4495;
                    }
                    int var22 = this.field4544[0].length;
                    if (this.field4532 + this.field4544[0].length > this.field4496) {
                        var22 -= this.field4532 + this.field4544[0].length - this.field4496;
                    }
                    boolean[][] var23 = this.field4542;
                    if (this.field4492) {
                        for (int var24 = this.field4518; var24 < var21; var24++) {
                            int var25 = this.field4486 + var24 - this.field4518;
                            for (int var26 = this.field4529; var26 < var22; var26++) {
                                if (this.field4544[var24][var26] && !this.field4493.method7599(var12, var25, this.field4532 + var26 - this.field4529)) {
                                    var23[var24][var26] = true;
                                } else {
                                    var23[var24][var26] = false;
                                }
                            }
                        }
                    }
                    this.field4498[var12].method212(this.field4521, this.field4503, this.field4531, this.field4542, true, arg4);
                } else {
                    int var13 = this.field4544.length;
                    if (this.field4486 + this.field4544.length > this.field4495) {
                        var13 -= this.field4486 + this.field4544.length - this.field4495;
                    }
                    int var14 = this.field4544[0].length;
                    if (this.field4532 + this.field4544[0].length > this.field4496) {
                        var14 -= this.field4532 + this.field4544[0].length - this.field4496;
                    }
                    boolean[][] var15 = this.field4542;
                    if (this.field4492) {
                        for (int var16 = this.field4518; var16 < var13; var16++) {
                            int var17 = this.field4486 + var16 - this.field4518;
                            for (int var18 = this.field4529; var18 < var14; var18++) {
                                var15[var16][var18] = false;
                                if (this.field4544[var16][var18]) {
                                    int var19 = this.field4532 + var18 - this.field4529;
                                    for (int var20 = var12; var20 >= 0; var20--) {
                                        if (this.field4497[var20][var17][var19] != null && this.field4497[var20][var17][var19].field4549 == var12) {
                                            if ((var20 < arg2 || arg1[var20][var17][var19] != arg3) && !this.field4493.method7599(var12, var17, var19)) {
                                                var15[var16][var18] = true;
                                                break;
                                            }
                                            var15[var16][var18] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.field4498[var12].method212(this.field4521, this.field4503, this.field4531, this.field4542, false, arg4);
                }
            }
        }
        if (this.field4485 > 0) {
            this.method7446(this.field4528, 0, this.field4485 - 1);
            for (int var27 = 0; var27 < this.field4485; var27++) {
                this.method7449(this.field4528[var27], this.field4535);
            }
        }
    }

    @ObfuscatedName("oo.ak(Laes;I)V")
    public void method7491(GraphEntity arg0) {
        Vector3 var2 = arg0.method8565().field3464;
        this.field4489.method550((float) var2.field3475, (float) ((int) var2.field3476 + (arg0.method12809() >> 1)), (float) var2.field3477, this.field4522);
        arg0.field9810 = (int) this.field4522[2];
    }

    @ObfuscatedName("oo.av([Laes;II)V")
    public void method7446(GraphEntity[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var4 = (arg1 + arg2) / 2;
        int var5 = arg1;
        GraphEntity var6 = arg0[var4];
        arg0[var4] = arg0[arg2];
        arg0[arg2] = var6;
        int var7 = var6.field9810;
        for (int var8 = arg1; var8 < arg2; var8++) {
            if (arg0[var8].field9810 > (var8 & 0x1) + var7) {
                GraphEntity var9 = arg0[var8];
                arg0[var8] = arg0[var5];
                arg0[var5++] = var9;
            }
        }
        arg0[arg2] = arg0[var5];
        arg0[var5] = var6;
        this.method7446(arg0, arg1, var5 - 1);
        this.method7446(arg0, var5 + 1, arg2);
    }

    @ObfuscatedName("oo.aj([Laes;II)V")
    public void method7509(GraphEntity[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var4 = (arg1 + arg2) / 2;
        int var5 = arg1;
        GraphEntity var6 = arg0[var4];
        arg0[var4] = arg0[arg2];
        arg0[arg2] = var6;
        int var7 = var6.field9810;
        for (int var8 = arg1; var8 < arg2; var8++) {
            if (arg0[var8].field9810 < (var8 & 0x1) + var7) {
                GraphEntity var9 = arg0[var8];
                arg0[var8] = arg0[var5];
                arg0[var5++] = var9;
            }
        }
        arg0[arg2] = arg0[var5];
        arg0[var5] = var6;
        this.method7509(arg0, arg1, var5 - 1);
        this.method7509(arg0, var5 + 1, arg2);
    }

    @ObfuscatedName("oo.ah(Laes;Z[[[BIB)Z")
    public boolean method7448(GraphEntity arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!this.field4492) {
            return false;
        } else if (arg0 instanceof PrimaryLayerEntity) {
            short var6 = ((PrimaryLayerEntity) arg0).field10508;
            short var7 = ((PrimaryLayerEntity) arg0).field10511;
            short var8 = ((PrimaryLayerEntity) arg0).field10510;
            short var9 = ((PrimaryLayerEntity) arg0).field10509;
            for (int var10 = var8; var10 <= var6; var10++) {
                for (int var11 = var9; var11 <= var7; var11++) {
                    if (arg0.field9809 < this.field4494 && var10 >= this.field4486 && var10 < this.field4484 && var11 >= this.field4532 && var11 < this.field4533) {
                        if ((arg2 == null || arg0.field9807 < arg3 || arg2[arg0.field9807][var10][var11] != arg4) && arg0.method15635() && !arg0.method15634(this.field4489)) {
                            return false;
                        }
                        if (!arg1 && var10 >= this.field4521 - 16 && var10 <= this.field4521 + 16 && var11 >= this.field4503 - 16 && var11 <= this.field4503 + 16) {
                            arg0.method12851(this.field4489);
                        }
                        return true;
                    }
                }
            }
            return true;
        } else {
            Vector3 var12 = arg0.method8565().field3464;
            int var13 = (int) var12.field3475 >> this.field4510;
            int var14 = (int) var12.field3477 >> this.field4510;
            if (arg0.field9809 >= this.field4494 || var13 < this.field4486 || var13 >= this.field4484 || var14 < this.field4532 || var14 >= this.field4533) {
                return true;
            } else if ((arg2 == null || arg0.field9807 < arg3 || arg2[arg0.field9807][var13][var14] != arg4) && arg0.method15635() && !arg0.method15634(this.field4489)) {
                return false;
            } else {
                if (!arg1 && var13 >= this.field4521 - 16 && var13 <= this.field4521 + 16 && var14 >= this.field4503 - 16 && var14 <= this.field4503 + 16) {
                    arg0.method12851(this.field4489);
                }
                return true;
            }
        }
    }

    @ObfuscatedName("oo.au(Laes;[Lacg;)V")
    public void method7449(GraphEntity arg0, Light[] arg1) {
        if (this.field4491) {
            int var3 = arg0.method15639(arg1);
            this.field4489.method535(var3, arg1);
        }
        if (this.field4502 == this.field4498) {
            boolean var4 = false;
            boolean var5 = false;
            Vector3 var6 = arg0.method8565().field3464;
            int var7;
            int var8;
            if (arg0 instanceof PrimaryLayerEntity) {
                var7 = ((PrimaryLayerEntity) arg0).field10510;
                var8 = ((PrimaryLayerEntity) arg0).field10509;
            } else {
                var7 = (int) var6.field3475 >> this.field4510;
                var8 = (int) var6.field3477 >> this.field4510;
            }
            WaterFogData var9 = new WaterFogData();
            var9.field1475 = this.method7411(var7, var8);
            var9.field1471 = this.method7410(var7, var8);
            var9.field1474 = this.method7489(var7, var8);
            var9.field1470 = this.method7413(var7, var8);
            var9.field1476 = this.method7505(var7, var8);
            var9.field1472 = this.method7501(var7, var8);
            this.field4489.method547(this.field4527[0].method196((int) var6.field3475, (int) var6.field3477), var9);
        }
        PickableEntity var10 = arg0.method12812(this.field4489);
        if (var10 == null) {
            return;
        }
        if (var10.field4564) {
            var10.field4563 = arg0;
            this.field4541.method7390(var10);
        } else {
            PickableEntity.method2573(var10);
        }
    }

    @ObfuscatedName("oo.ae(Lna;III[ZS)Z")
    public boolean method7445(HardShadow arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var6 = false;
        if (this.field4502 != this.field4498) {
            int var7 = this.field4527[arg1].method196(arg2, arg3);
            for (int var8 = 0; var8 <= arg1; var8++) {
                FloorModel var9 = this.field4527[var8];
                if (var9 != null) {
                    int var10 = var7 - var9.method196(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var8] = var9.method203(arg0, arg2, var10, arg3, 0, false);
                        if (!arg4[var8]) {
                            continue;
                        }
                    }
                    var9.UA(arg0, arg2, var10, arg3, 0, false);
                    var6 = true;
                }
            }
        }
        return var6;
    }

    @ObfuscatedName("oo.ac(Lna;III[ZI)V")
    public void method7451(HardShadow arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (this.field4502 == this.field4498) {
            return;
        }
        int var6 = this.field4527[arg1].method196(arg2, arg3);
        for (int var7 = 0; var7 <= arg1; var7++) {
            if (arg4 == null || arg4[var7]) {
                FloorModel var8 = this.field4527[var7];
                if (var8 != null) {
                    var8.NA(arg0, arg2, var6 - var8.method196(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @ObfuscatedName("oo.aq(III)V")
    public void method7452(int arg0, int arg1) {
        HardShadow var3 = null;
        for (int var4 = arg0; var4 < arg1; var4++) {
            FloorModel var5 = this.field4527[var4];
            if (var5 != null) {
                for (int var6 = 0; var6 < this.field4496; var6++) {
                    for (int var7 = 0; var7 < this.field4495; var7++) {
                        var3 = var5.w(var7, var6, var3);
                        if (var3 != null) {
                            int var8 = var7 << this.field4510;
                            int var9 = var6 << this.field4510;
                            for (int var10 = var4 - 1; var10 >= 0; var10--) {
                                FloorModel var11 = this.field4527[var10];
                                if (var11 != null) {
                                    int var12 = var5.method199(var7, var6) - var11.method199(var7, var6);
                                    int var13 = var5.method199(var7 + 1, var6) - var11.method199(var7 + 1, var6);
                                    int var14 = var5.method199(var7 + 1, var6 + 1) - var11.method199(var7 + 1, var6 + 1);
                                    int var15 = var5.method199(var7, var6 + 1) - var11.method199(var7, var6 + 1);
                                    var11.UA(var3, var8, (var12 + var13 + var14 + var15) / 4, var9, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("oo.ab(I)V")
    public void method7453() {
        this.method7452(1, this.field4494);
    }

    @ObfuscatedName("oo.bq(Lor;I)V")
    public void method7454(StaticPointLight arg0) {
        if (this.field4537 >= 65459) {
            return;
        }
        Light var2 = arg0.field4588;
        this.field4539[this.field4537] = arg0;
        this.field4540[this.field4537] = false;
        this.field4537++;
        int var3 = arg0.field4592;
        if (arg0.field4591) {
            var3 = 0;
        }
        int var4 = arg0.field4592;
        if (arg0.field4587) {
            var4 = this.field4494 - 1;
        }
        for (int var5 = var3; var5 <= var4; var5++) {
            int var6 = 0;
            int var7 = var2.method14879() - var2.method14880() + this.field4487 >> this.field4510;
            if (var7 < 0) {
                var6 -= var7;
                var7 = 0;
            }
            int var8 = var2.method14879() + var2.method14880() - this.field4487 >> this.field4510;
            if (var8 >= this.field4496) {
                var8 = this.field4496 - 1;
            }
            for (int var9 = var7; var9 <= var8; var9++) {
                short var10 = arg0.field4597[var6++];
                int var11 = (var2.method14888() - var2.method14880() + this.field4487 >> this.field4510) + (var10 >>> 8);
                int var12 = (var10 & 0xFF) + var11 - 1;
                if (var11 < 0) {
                    var11 = 0;
                }
                if (var12 >= this.field4495) {
                    var12 = this.field4495 - 1;
                }
                for (int var13 = var11; var13 <= var12; var13++) {
                    long var14 = this.field4526[var5][var13][var9];
                    if ((var14 & 0xFFFFL) == 0L) {
                        this.field4526[var5][var13][var9] = var14 | (long) this.field4537;
                    } else if ((var14 & 0xFFFF0000L) == 0L) {
                        this.field4526[var5][var13][var9] = var14 | (long) this.field4537 << 16;
                    } else if ((var14 & 0xFFFF00000000L) == 0L) {
                        this.field4526[var5][var13][var9] = var14 | (long) this.field4537 << 32;
                    } else if ((var14 & 0xFFFF000000000000L) == 0L) {
                        this.field4526[var5][var13][var9] = var14 | (long) this.field4537 << 48;
                    }
                }
            }
        }
    }

    @ObfuscatedName("oo.bz(I)V")
    public void method7455() {
        for (int var1 = 0; var1 < this.field4537; var1++) {
            if (!this.field4540[var1]) {
                StaticPointLight var2 = this.field4539[var1];
                Light var3 = var2.field4588;
                int var4 = var2.field4592;
                int var5 = var3.method14880() - this.field4487;
                int var6 = (var5 * 2 >> this.field4510) + 1;
                int var7 = 0;
                int[] var8 = new int[var6 * var6];
                int var9 = var3.method14888() - var5 >> this.field4510;
                int var10 = var3.method14879() - var5 >> this.field4510;
                int var11 = var3.method14879() + var5 >> this.field4510;
                if (var10 < 0) {
                    var7 -= var10;
                    var10 = 0;
                }
                if (var11 >= this.field4496) {
                    var11 = this.field4496 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    short var13 = var2.field4597[var7];
                    int var14 = var13 >>> 8;
                    int var15 = var6 * var7 + var14;
                    int var16 = (var13 >>> 8) + var9;
                    int var17 = (var13 & 0xFF) + var16 - 1;
                    if (var16 < 0) {
                        var15 -= var16;
                        var16 = 0;
                    }
                    if (var17 >= this.field4495) {
                        var17 = this.field4495 - 1;
                    }
                    for (int var18 = var16; var18 <= var17; var18++) {
                        byte var19 = 1;
                        PrimaryLayerEntity var20 = this.method7437(var4, var18, var12, null);
                        if (var20 != null && var20.field10513 != 0) {
                            if (var20.field10513 == 1) {
                                boolean var21 = var18 - 1 >= var16;
                                boolean var22 = var18 + 1 <= var17;
                                if (!var21 && var12 + 1 <= var11) {
                                    short var23 = var2.field4597[var7 + 1];
                                    int var24 = (var23 >>> 8) + var9;
                                    int var25 = (var23 & 0xFF) + var24;
                                    var21 = var18 > var24 && var18 < var25;
                                }
                                if (!var22 && var12 - 1 >= var10) {
                                    short var26 = var2.field4597[var7 - 1];
                                    int var27 = (var26 >>> 8) + var9;
                                    int var28 = (var26 & 0xFF) + var27;
                                    var22 = var18 > var27 && var18 < var28;
                                }
                                if (var21 && !var22) {
                                    var19 = 4;
                                } else if (var22 && !var21) {
                                    var19 = 2;
                                }
                            } else {
                                boolean var29 = var18 - 1 >= var16;
                                boolean var30 = var18 + 1 <= var17;
                                if (!var29 && var12 - 1 >= var10) {
                                    short var31 = var2.field4597[var7 - 1];
                                    int var32 = (var31 >>> 8) + var9;
                                    int var33 = (var31 & 0xFF) + var32;
                                    var29 = var18 > var32 && var18 < var33;
                                }
                                if (!var30 && var12 + 1 <= var11) {
                                    short var34 = var2.field4597[var7 + 1];
                                    int var35 = (var34 >>> 8) + var9;
                                    int var36 = (var34 & 0xFF) + var35;
                                    var30 = var18 > var35 && var18 < var36;
                                }
                                if (var29 && !var30) {
                                    var19 = 3;
                                } else if (var30 && !var29) {
                                    var19 = 5;
                                }
                            }
                        }
                        var8[var15++] = var19;
                    }
                    var7++;
                }
                this.field4540[var1] = true;
                if (field4504) {
                    this.field4498[var4].method204(var3, var8);
                }
            }
        }
    }
}
