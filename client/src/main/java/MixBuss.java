import deob.ObfuscatedName;

@ObfuscatedName("aih")
public class MixBuss extends AudioBuss {

    @ObfuscatedName("aih.l")
    public IterableMap field10239;

    @ObfuscatedName("aih.f")
    public int field10229 = 256;

    @ObfuscatedName("aih.d")
    public int field10261 = 256;

    @ObfuscatedName("aih.z")
    public int field10231 = 1000000;

    @ObfuscatedName("aih.n")
    public int[] field10232 = new int[16];

    @ObfuscatedName("aih.o")
    public int[] field10233 = new int[16];

    @ObfuscatedName("aih.q")
    public int[] field10234 = new int[16];

    @ObfuscatedName("aih.p")
    public int[] field10235 = new int[16];

    @ObfuscatedName("aih.w")
    public int[] field10236 = new int[16];

    @ObfuscatedName("aih.b")
    public int[] field10262 = new int[16];

    @ObfuscatedName("aih.x")
    public int[] field10237 = new int[16];

    @ObfuscatedName("aih.i")
    public int[] field10244 = new int[16];

    @ObfuscatedName("aih.v")
    public int[] field10255 = new int[16];

    @ObfuscatedName("aih.k")
    public int[] field10241 = new int[16];

    @ObfuscatedName("aih.y")
    public int[] field10245 = new int[16];

    @ObfuscatedName("aih.e")
    public int[] field10246 = new int[16];

    @ObfuscatedName("aih.ay")
    public int[] field10247 = new int[16];

    @ObfuscatedName("aih.af")
    public int[] field10248 = new int[16];

    @ObfuscatedName("aih.ar")
    public int[] field10228 = new int[16];

    @ObfuscatedName("aih.an")
    public int[] field10250 = new int[16];

    @ObfuscatedName("aih.ap")
    public SoundRelated1[][] field10240 = new SoundRelated1[16][128];

    @ObfuscatedName("aih.ag")
    public SoundRelated1[][] field10252 = new SoundRelated1[16][128];

    @ObfuscatedName("aih.as")
    public MidiRelated1 field10253 = new MidiRelated1();

    @ObfuscatedName("aih.ai")
    public boolean field10254;

    @ObfuscatedName("aih.ao")
    public int field10256;

    @ObfuscatedName("aih.al")
    public int field10230;

    @ObfuscatedName("aih.at")
    public long field10257;

    @ObfuscatedName("aih.ax")
    public long field10258;

    @ObfuscatedName("aih.aw")
    public AudioBuss_Sub2 field10251 = new AudioBuss_Sub2(this);

    @ObfuscatedName("aih.aa")
    public MidiSong field10260;

    @ObfuscatedName("aih.am")
    public int field10249;

    @ObfuscatedName("aih.ad")
    public boolean field10238;

    public MixBuss() {
        this.field10239 = new IterableMap(128);
        this.method16266(-1, 256);
        this.method16287(true);
    }

    public MixBuss(MixBuss arg0) {
        this.field10239 = arg0.field10239;
        this.method16266(-1, 256);
        this.method16287(true);
    }

    @ObfuscatedName("aih.an(II)V")
    public synchronized void method16263(int arg0) {
        this.field10229 = arg0;
    }

    @ObfuscatedName("aih.ap(I)I")
    public int method16264() {
        return this.field10229;
    }

    @ObfuscatedName("aih.ag(II)V")
    public synchronized void method16265(int arg0) {
        this.field10261 = arg0;
    }

    @ObfuscatedName("aih.as(III)V")
    public synchronized void method16266(int arg0, int arg1) {
        if (arg0 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.field10232[var3] = arg1;
            }
        } else {
            this.field10232[arg0] = arg1;
        }
    }

    @ObfuscatedName("aih.ai(Lacw;Lls;Lmd;II)Z")
    public synchronized boolean method16375(MidiSong arg0, Js5 arg1, SynthSoundRelated12 arg2, int arg3) {
        arg0.method14906();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[]{arg3};
        }
        for (ObjectNode var7 = (ObjectNode) arg0.field9382.method11928(); var7 != null; var7 = (ObjectNode) arg0.field9382.method11929()) {
            int var8 = (int) var7.field4228;
            SoundRelated2 var9 = (SoundRelated2) this.field10239.getNode((long) var8);
            if (var9 == null) {
                var9 = SoundRelated2.method14060(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field10239.method11927(var9, (long) var8);
            }
            if (!var9.method14918(arg2, (byte[]) var7.value, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method14907();
        }
        return var5;
    }

    @ObfuscatedName("aih.ao(B)V")
    public synchronized void method16324() {
        for (SoundRelated2 var1 = (SoundRelated2) this.field10239.method11928(); var1 != null; var1 = (SoundRelated2) this.field10239.method11929()) {
            var1.method14916();
        }
    }

    @ObfuscatedName("aih.al(I)V")
    public synchronized void method16269() {
        for (SoundRelated2 var1 = (SoundRelated2) this.field10239.method11928(); var1 != null; var1 = (SoundRelated2) this.field10239.method11929()) {
            var1.remove();
        }
    }

    @ObfuscatedName("aih.at(Lacw;ZI)V")
    public synchronized void method16311(MidiSong arg0, boolean arg1) {
        this.method16271(arg0, arg1, true);
    }

    @ObfuscatedName("aih.ax(Lacw;ZZB)V")
    public synchronized void method16271(MidiSong arg0, boolean arg1, boolean arg2) {
        this.method16325(arg2);
        this.field10253.method3015(arg0.field9381);
        this.field10254 = arg1;
        this.field10257 = 0L;
        int var4 = this.field10253.method3018();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field10253.method3030(var5);
            this.field10253.method3025(var5);
            this.field10253.method3020(var5);
        }
        this.field10256 = this.field10253.method3027();
        this.field10230 = this.field10253.field1605[this.field10256];
        this.field10258 = this.field10253.method3026(this.field10230);
    }

    @ObfuscatedName("aih.aw(Lacw;ZZJ)V")
    public synchronized void method16272(MidiSong arg0, boolean arg1, boolean arg2, long arg3) {
        this.method16271(arg0, arg1, arg2);
        this.method16261((long) this.field10253.field1606 * arg3);
    }

    @ObfuscatedName("aih.aa(B)V")
    public synchronized void method16273() {
        this.method16325(true);
    }

    @ObfuscatedName("aih.am(ZI)V")
    public synchronized void method16325(boolean arg0) {
        this.field10253.method3016();
        this.field10260 = null;
        this.method16287(arg0);
    }

    @ObfuscatedName("aih.ad(I)Z")
    public synchronized boolean method16299() {
        return this.field10253.method3017();
    }

    @ObfuscatedName("aih.az(III)V")
    public synchronized void method16283(int arg0, int arg1) {
        this.method16277(arg0, arg1);
    }

    @ObfuscatedName("aih.ak(III)V")
    public void method16277(int arg0, int arg1) {
        this.field10236[arg0] = arg1;
        this.field10237[arg0] = arg1 & 0xFFFFFF80;
        this.method16278(arg0, arg1);
    }

    @ObfuscatedName("aih.av(III)V")
    public void method16278(int arg0, int arg1) {
        if (this.field10262[arg0] != arg1) {
            this.field10262[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field10252[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("aih.aj(IIII)V")
    public void method16270(int arg0, int arg1, int arg2) {
        this.method16380(arg0, arg1, 64);
        if ((this.field10245[arg0] & 0x2) != 0) {
            for (SoundRelated1 var4 = (SoundRelated1) this.field10251.field10227.method11565(); var4 != null; var4 = (SoundRelated1) this.field10251.field10227.method11568()) {
                if (var4.field9400 == arg0 && var4.field9402 < 0) {
                    this.field10240[arg0][var4.field9388] = null;
                    this.field10240[arg0][arg1] = var4;
                    int var5 = (var4.field9393 * var4.field9389 >> 12) + var4.field9386;
                    var4.field9386 += arg1 - var4.field9388 << 8;
                    var4.field9389 = var5 - var4.field9386;
                    var4.field9393 = 4096;
                    var4.field9388 = arg1;
                    return;
                }
            }
        }
        SoundRelated2 var6 = (SoundRelated2) this.field10239.getNode((long) this.field10262[arg0]);
        if (var6 == null) {
            return;
        }
        BasicVariableRateSoundPacket var7 = var6.field9408[arg1];
        if (var7 == null) {
            return;
        }
        SoundRelated1 var8 = new SoundRelated1();
        var8.field9400 = arg0;
        var8.field9384 = var6;
        var8.field9385 = var7;
        var8.field9391 = var6.field9413[arg1];
        var8.field9387 = var6.field9412[arg1];
        var8.field9388 = arg1;
        var8.field9404 = var6.field9411 * arg2 * arg2 * var6.field9409[arg1] + 1024 >> 11;
        var8.field9390 = var6.field9410[arg1] & 0xFF;
        var8.field9386 = (arg1 << 8) - (var6.field9406[arg1] & 0x7FFF);
        var8.field9394 = 0;
        var8.field9395 = 0;
        var8.field9396 = 0;
        var8.field9402 = -1;
        var8.field9397 = 0;
        if (this.field10248[arg0] == 0) {
            var8.field9401 = var7.method16502(this.method16302(var8), this.method16274(var8), this.method16297(var8));
        } else {
            var8.field9401 = var7.method16502(this.method16302(var8), 0, this.method16297(var8));
            this.method16280(var8, var6.field9406[arg1] < 0);
        }
        if (var6.field9406[arg1] < 0) {
            var8.field9401.method16384(-1);
        }
        if (var8.field9387 >= 0) {
            SoundRelated1 var9 = this.field10252[arg0][var8.field9387];
            if (var9 != null && var9.field9402 < 0) {
                this.field10240[arg0][var9.field9388] = null;
                var9.field9402 = 0;
            }
            this.field10252[arg0][var8.field9387] = var8;
        }
        this.field10251.field10227.addFirst(var8);
        this.field10240[arg0][arg1] = var8;
    }

    @ObfuscatedName("aih.ah(Laci;ZI)V")
    public void method16280(SoundRelated1 arg0, boolean arg1) {
        int var3 = arg0.field9385.method16496();
        int var5;
        if (arg1 && arg0.field9385.field10293) {
            int var4 = var3 + var3 - arg0.field9385.field10294;
            var5 = (int) ((long) this.field10248[arg0.field9400] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field9401.method16413(true);
            }
        } else {
            var5 = (int) ((long) this.field10248[arg0.field9400] * (long) var3 >> 6);
        }
        arg0.field9401.method16421(var5);
    }

    @ObfuscatedName("aih.au(IIII)V")
    public void method16380(int arg0, int arg1, int arg2) {
        SoundRelated1 var4 = this.field10240[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field10240[arg0][arg1] = null;
        if ((this.field10245[arg0] & 0x2) == 0) {
            var4.field9402 = 0;
            return;
        }
        for (SoundRelated1 var5 = (SoundRelated1) this.field10251.field10227.last(); var5 != null; var5 = (SoundRelated1) this.field10251.field10227.method11567()) {
            if (var4.field9400 == var5.field9400 && var5.field9402 < 0 && var4 != var5) {
                var4.field9402 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("aih.ae(IIII)V")
    public void method16304(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("aih.ac(III)V")
    public void method16294(int arg0, int arg1) {
    }

    @ObfuscatedName("aih.aq(III)V")
    public void method16284(int arg0, int arg1) {
        this.field10244[arg0] = arg1;
    }

    @ObfuscatedName("aih.ab(II)V")
    public void method16262(int arg0) {
        for (SoundRelated1 var2 = (SoundRelated1) this.field10251.field10227.last(); var2 != null; var2 = (SoundRelated1) this.field10251.field10227.method11567()) {
            if (arg0 < 0 || var2.field9400 == arg0) {
                if (var2.field9401 != null) {
                    var2.field9401.method16418(Statics.field4015 / 100);
                    if (var2.field9401.method16383()) {
                        this.field10251.field10225.method16452(var2.field9401);
                    }
                    var2.method14911();
                }
                if (var2.field9402 < 0) {
                    this.field10240[var2.field9400][var2.field9388] = null;
                }
                var2.remove();
            }
        }
    }

    @ObfuscatedName("aih.bq(II)V")
    public void method16358(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method16358(var2);
            }
            return;
        }
        this.field10233[arg0] = 12800;
        this.field10234[arg0] = 8192;
        this.field10235[arg0] = 16383;
        this.field10244[arg0] = 8192;
        this.field10255[arg0] = 0;
        this.field10241[arg0] = 8192;
        this.method16323(arg0);
        this.method16289(arg0);
        this.field10245[arg0] = 0;
        this.field10246[arg0] = 32767;
        this.field10247[arg0] = 256;
        this.field10248[arg0] = 0;
        this.method16291(arg0, 8192);
    }

    @ObfuscatedName("aih.bz(II)V")
    public void method16286(int arg0) {
        for (SoundRelated1 var2 = (SoundRelated1) this.field10251.field10227.last(); var2 != null; var2 = (SoundRelated1) this.field10251.field10227.method11567()) {
            if ((arg0 < 0 || var2.field9400 == arg0) && var2.field9402 < 0) {
                this.field10240[var2.field9400][var2.field9388] = null;
                var2.field9402 = 0;
            }
        }
    }

    @ObfuscatedName("aih.bv(ZB)V")
    public void method16287(boolean arg0) {
        if (arg0) {
            this.method16262(-1);
        } else {
            this.method16286(-1);
        }
        this.method16358(-1);
        for (int var2 = 0; var2 < 16; var2++) {
            this.field10262[var2] = this.field10236[var2];
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field10237[var3] = this.field10236[var3] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("aih.bj(IB)V")
    public void method16323(int arg0) {
        if ((this.field10245[arg0] & 0x2) == 0) {
            return;
        }
        for (SoundRelated1 var2 = (SoundRelated1) this.field10251.field10227.last(); var2 != null; var2 = (SoundRelated1) this.field10251.field10227.method11567()) {
            if (var2.field9400 == arg0 && this.field10240[arg0][var2.field9388] == null && var2.field9402 < 0) {
                var2.field9402 = 0;
            }
        }
    }

    @ObfuscatedName("aih.bf(II)V")
    public void method16289(int arg0) {
        if ((this.field10245[arg0] & 0x4) == 0) {
            return;
        }
        for (SoundRelated1 var2 = (SoundRelated1) this.field10251.field10227.last(); var2 != null; var2 = (SoundRelated1) this.field10251.field10227.method11567()) {
            if (var2.field9400 == arg0) {
                var2.field9398 = 0;
            }
        }
    }

    @ObfuscatedName("aih.bt(II)V")
    public void method16290(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method16380(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method16270(var6, var7, var8);
            } else {
                this.method16380(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method16304(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field10237[var12] = (var14 << 14) + (this.field10237[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field10237[var12] = (var14 << 7) + (this.field10237[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field10255[var12] = (var14 << 7) + (this.field10255[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field10255[var12] = (this.field10255[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field10241[var12] = (var14 << 7) + (this.field10241[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field10241[var12] = (this.field10241[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field10233[var12] = (var14 << 7) + (this.field10233[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field10233[var12] = (this.field10233[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field10234[var12] = (var14 << 7) + (this.field10234[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field10234[var12] = (this.field10234[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field10235[var12] = (var14 << 7) + (this.field10235[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field10235[var12] = (this.field10235[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field10245[var12] |= 0x1;
                } else {
                    this.field10245[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field10245[var12] |= 0x2;
                } else {
                    this.method16323(var12);
                    this.field10245[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field10246[var12] = (var14 << 7) + (this.field10246[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field10246[var12] = (this.field10246[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field10246[var12] = (var14 << 7) + (this.field10246[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field10246[var12] = (this.field10246[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method16262(var12);
            }
            if (var13 == 121) {
                this.method16358(var12);
            }
            if (var13 == 123) {
                this.method16286(var12);
            }
            if (var13 == 6) {
                int var15 = this.field10246[var12];
                if (var15 == 16384) {
                    this.field10247[var12] = (var14 << 7) + (this.field10247[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field10246[var12];
                if (var16 == 16384) {
                    this.field10247[var12] = (this.field10247[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field10248[var12] = (var14 << 7) + (this.field10248[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field10248[var12] = (this.field10248[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field10245[var12] |= 0x4;
                } else {
                    this.method16289(var12);
                    this.field10245[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method16291(var12, (var14 << 7) + (this.field10228[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method16291(var12, (this.field10228[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method16278(var17, this.field10237[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method16294(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method16284(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method16287(true);
            }
        }
    }

    @ObfuscatedName("aih.bg(IIB)V")
    public void method16291(int arg0, int arg1) {
        this.field10228[arg0] = arg1;
        this.field10250[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @ObfuscatedName("aih.bl(Laci;I)I")
    public int method16302(SoundRelated1 arg0) {
        int var2 = (arg0.field9393 * arg0.field9389 >> 12) + arg0.field9386;
        int var3 = ((this.field10244[arg0.field9400] - 8192) * this.field10247[arg0.field9400] >> 12) + var2;
        SoundRelated3 var4 = arg0.field9391;
        if (var4.field1620 > 0 && (var4.field1621 > 0 || this.field10255[arg0.field9400] > 0)) {
            int var5 = var4.field1621 << 2;
            int var6 = var4.field1623 << 1;
            if (arg0.field9399 < var6) {
                var5 = arg0.field9399 * var5 / var6;
            }
            int var7 = (this.field10255[arg0.field9400] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field9383 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field9385.field10295 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field4015 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("aih.bk(Laci;I)I")
    public int method16274(SoundRelated1 arg0) {
        if (this.field10232[arg0.field9400] == 0) {
            return 0;
        }
        SoundRelated3 var2 = arg0.field9391;
        int var3 = this.field10235[arg0.field9400] * this.field10233[arg0.field9400] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field9404 * var4 + 16384 >> 15;
        int var6 = this.field10229 * var5 + 128 >> 8;
        int var7 = this.field10261 * var6 >> 8;
        int var8 = this.field10232[arg0.field9400] * var7 + 128 >> 8;
        if (var2.field1618 > 0) {
            var8 = (int) ((double) var8 * Math.pow(0.5D, (double) arg0.field9394 * 1.953125E-5D * (double) var2.field1618) + 0.5D);
        }
        if (var2.field1622 != null) {
            int var9 = arg0.field9395;
            int var10 = var2.field1622[arg0.field9396 * 4 + 1];
            if (arg0.field9396 * 4 < var2.field1622.length - 2) {
                int var11 = (var2.field1622[arg0.field9396 * 4] & 0xFF) << 8;
                int var12 = (var2.field1622[arg0.field9396 * 4 + 2] & 0xFF) << 8;
                var10 += (var2.field1622[arg0.field9396 * 4 + 3] - var10) * (var9 - var11) / (var12 - var11);
            }
            var8 = var8 * var10 + 32 >> 6;
        }
        if (arg0.field9402 > 0 && var2.field1616 != null) {
            int var13 = arg0.field9402;
            int var14 = var2.field1616[arg0.field9397 * 4 + 1];
            if (arg0.field9397 * 4 < var2.field1616.length - 2) {
                int var15 = (var2.field1616[arg0.field9397 * 4] & 0xFF) << 8;
                int var16 = (var2.field1616[arg0.field9397 * 4 + 2] & 0xFF) << 8;
                var14 += (var2.field1616[arg0.field9397 * 4 + 3] - var14) * (var13 - var15) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        return var8;
    }

    @ObfuscatedName("aih.bs(Laci;B)I")
    public int method16297(SoundRelated1 arg0) {
        int var2 = this.field10234[arg0.field9400];
        return var2 < 8192 ? arg0.field9390 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field9390) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("aih.j()Ladc;")
    public synchronized AudioBuss method15031() {
        return this.field10251;
    }

    @ObfuscatedName("aih.a()Ladc;")
    public synchronized AudioBuss method15032() {
        return null;
    }

    @ObfuscatedName("aih.s()I")
    public synchronized int method15035() {
        return 0;
    }

    @ObfuscatedName("aih.m([III)V")
    public synchronized void method15034(int[] arg0, int arg1, int arg2) {
        if (this.field10253.method3017()) {
            int var4 = this.field10231 * this.field10253.field1606 / Statics.field4015;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field10257;
                if (this.field10258 - var5 >= 0L) {
                    this.field10257 = var5;
                    break;
                }
                int var7 = (int) ((this.field10258 - this.field10257 + (long) var4 - 1L) / (long) var4);
                this.field10257 += (long) var4 * (long) var7;
                this.field10251.method15034(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method16362();
            } while (this.field10253.method3017());
        }
        this.field10251.method15034(arg0, arg1, arg2);
    }

    @ObfuscatedName("aih.t(I)V")
    public synchronized void method15046(int arg0) {
        if (this.field10253.method3017()) {
            int var2 = this.field10231 * this.field10253.field1606 / Statics.field4015;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field10257;
                if (this.field10258 - var3 >= 0L) {
                    this.field10257 = var3;
                    break;
                }
                int var5 = (int) ((this.field10258 - this.field10257 + (long) var2 - 1L) / (long) var2);
                this.field10257 += (long) var2 * (long) var5;
                this.field10251.method15046(var5);
                arg0 -= var5;
                this.method16362();
            } while (this.field10253.method3017());
        }
        this.field10251.method15046(arg0);
    }

    @ObfuscatedName("aih.bn(J)V")
    public void method16261(long arg0) {
        while (this.field10258 <= arg0) {
            int var3 = this.field10256;
            int var4 = this.field10230;
            long var5 = this.field10258;
            while (this.field10230 == var4) {
                while (this.field10253.field1605[var3] == var4) {
                    this.field10253.method3030(var3);
                    int var7 = this.field10253.method3029(var3);
                    if (var7 == 1) {
                        this.field10253.method3043();
                        this.field10253.method3020(var3);
                        if (this.field10253.method3019()) {
                            if (!this.field10254 || var4 == 0) {
                                this.method16287(true);
                                this.field10253.method3016();
                                return;
                            }
                            this.field10253.method3028(var5);
                        }
                        break;
                    }
                    if ((var7 & 0x80) != 0 && (var7 & 0xF0) != 144) {
                        this.method16290(var7);
                    }
                    this.field10253.method3025(var3);
                    this.field10253.method3020(var3);
                }
                this.field10257 = var5;
                var3 = this.field10253.method3027();
                var4 = this.field10253.field1605[var3];
                var5 = this.field10253.method3026(var4);
            }
            this.field10256 = var3;
            this.field10230 = var4;
            this.field10258 = var5;
        }
    }

    @ObfuscatedName("aih.ba(B)V")
    public void method16362() {
        int var1 = this.field10256;
        int var2 = this.field10230;
        long var3 = this.field10258;
        if (this.field10260 != null && this.field10249 == var2) {
            this.method16271(this.field10260, this.field10254, this.field10238);
            this.method16362();
            return;
        }
        while (this.field10230 == var2) {
            while (this.field10253.field1605[var1] == var2) {
                this.field10253.method3030(var1);
                int var5 = this.field10253.method3029(var1);
                if (var5 == 1) {
                    this.field10253.method3043();
                    this.field10253.method3020(var1);
                    if (this.field10253.method3019()) {
                        if (this.field10260 != null) {
                            this.method16311(this.field10260, this.field10254);
                            this.method16362();
                            return;
                        }
                        if (!this.field10254 || var2 == 0) {
                            this.method16287(true);
                            this.field10253.method3016();
                            return;
                        }
                        this.field10253.method3028(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method16290(var5);
                }
                this.field10253.method3025(var1);
                this.field10253.method3020(var1);
            }
            var1 = this.field10253.method3027();
            var2 = this.field10253.field1605[var1];
            var3 = this.field10253.method3026(var2);
        }
        this.field10256 = var1;
        this.field10230 = var2;
        this.field10258 = var3;
        if (this.field10260 != null && this.field10249 < var2) {
            this.field10256 = -1;
            this.field10230 = this.field10249;
            this.field10258 = this.field10253.method3026(this.field10230);
        }
    }

    @ObfuscatedName("aih.bd(Laci;S)Z")
    public boolean method16296(SoundRelated1 arg0) {
        if (arg0.field9401 != null) {
            return false;
        }
        if (arg0.field9402 >= 0) {
            arg0.remove();
            if (arg0.field9387 > 0 && this.field10252[arg0.field9400][arg0.field9387] == arg0) {
                this.field10252[arg0.field9400][arg0.field9387] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("aih.bc(Laci;[IIIB)Z")
    public boolean method16338(SoundRelated1 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field9392 = Statics.field4015 / 100;
        if (arg0.field9402 >= 0 && (arg0.field9401 == null || arg0.field9401.method16393())) {
            arg0.method14911();
            arg0.remove();
            if (arg0.field9387 > 0 && this.field10252[arg0.field9400][arg0.field9387] == arg0) {
                this.field10252[arg0.field9400][arg0.field9387] = null;
            }
            return true;
        }
        int var5 = arg0.field9393;
        if (var5 > 0) {
            int var6 = var5 - (int) (Math.pow(2.0D, (double) this.field10241[arg0.field9400] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field9393 = var6;
        }
        arg0.field9401.method16396(this.method16302(arg0));
        SoundRelated3 var7 = arg0.field9391;
        boolean var8 = false;
        arg0.field9399++;
        arg0.field9383 += var7.field1620;
        double var9 = (double) ((arg0.field9388 - 60 << 8) + (arg0.field9393 * arg0.field9389 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1618 > 0) {
            if (var7.field1617 > 0) {
                arg0.field9394 += (int) (Math.pow(2.0D, (double) var7.field1617 * var9) * 128.0D + 0.5D);
            } else {
                arg0.field9394 += 128;
            }
            if (arg0.field9394 * var7.field1618 >= 819200) {
                var8 = true;
            }
        }
        if (var7.field1622 != null) {
            if (var7.field1615 > 0) {
                arg0.field9395 += (int) (Math.pow(2.0D, (double) var7.field1615 * var9) * 128.0D + 0.5D);
            } else {
                arg0.field9395 += 128;
            }
            while (arg0.field9396 * 4 < var7.field1622.length - 2 && arg0.field9395 > (var7.field1622[arg0.field9396 * 4 + 2] & 0xFF) << 8) {
                arg0.field9396 = arg0.field9396 * 4 + 2;
            }
            if (arg0.field9396 * 4 == var7.field1622.length - 2 && var7.field1622[arg0.field9396 * 4 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field9402 >= 0 && var7.field1616 != null && (this.field10245[arg0.field9400] & 0x1) == 0 && (arg0.field9387 < 0 || this.field10252[arg0.field9400][arg0.field9387] != arg0)) {
            if (var7.field1619 > 0) {
                arg0.field9402 += (int) (Math.pow(2.0D, (double) var7.field1619 * var9) * 128.0D + 0.5D);
            } else {
                arg0.field9402 += 128;
            }
            while (arg0.field9397 * 4 < var7.field1616.length - 2 && arg0.field9402 > (var7.field1616[arg0.field9397 * 4 + 2] & 0xFF) << 8) {
                arg0.field9397 = arg0.field9397 * 4 + 2;
            }
            if (arg0.field9397 * 4 == var7.field1616.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field9401.method16395(arg0.field9392, this.method16274(arg0), this.method16297(arg0));
            return false;
        }
        arg0.field9401.method16418(arg0.field9392);
        if (arg1 == null) {
            arg0.field9401.method15046(arg3);
        } else {
            arg0.field9401.method15034(arg1, arg2, arg3);
        }
        if (arg0.field9401.method16383()) {
            this.field10251.field10225.method16452(arg0.field9401);
        }
        arg0.method14911();
        if (arg0.field9402 >= 0) {
            arg0.remove();
            if (arg0.field9387 > 0 && this.field10252[arg0.field9400][arg0.field9387] == arg0) {
                this.field10252[arg0.field9400][arg0.field9387] = null;
            }
        }
        return true;
    }
}
