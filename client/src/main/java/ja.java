import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("ja")
public class ja extends RendererToolkit implements ua {

    public long nativeid = 0L;

    @ObfuscatedName("ja.y")
    public boolean field459 = false;

    @ObfuscatedName("ja.e")
    public ba field437;

    @ObfuscatedName("ja.ay")
    public IterableQueue field438 = new IterableQueue();

    @ObfuscatedName("ja.af")
    public int field453 = 4096;

    @ObfuscatedName("ja.ar")
    public int field440 = 4096;

    @ObfuscatedName("ja.an")
    public Matrix4x4 field441;

    @ObfuscatedName("ja.ap")
    public Matrix4x3 field442;

    @ObfuscatedName("ja.ag")
    public Matrix4x3 field443;

    @ObfuscatedName("ja.as")
    public Matrix4x4 field464;

    @ObfuscatedName("ja.ai")
    public Matrix4x4 field445;

    @ObfuscatedName("ja.ao")
    public Matrix4x4 field436;

    @ObfuscatedName("ja.al")
    public float field447;

    @ObfuscatedName("ja.at")
    public float field448;

    @ObfuscatedName("ja.ax")
    public float field450;

    @ObfuscatedName("ja.aw")
    public float field451;

    @ObfuscatedName("ja.aa")
    public int field457;

    @ObfuscatedName("ja.am")
    public a[] field452;

    @ObfuscatedName("ja.ah")
    public static int[] field446 = new int[Math.max(Math.max(104, 20), 24573)];

    @ObfuscatedName("ja.au")
    public static float[] field469 = new float[20];

    @ObfuscatedName("ja.ae")
    public static int[] field460 = new int[6];

    @ObfuscatedName("ja.ac")
    public static int[] field461 = field446;

    @ObfuscatedName("ja.aq")
    public static float[] field462 = field469;

    @ObfuscatedName("ja.ab")
    public static int[] field463 = field446;

    @ObfuscatedName("ja.bq")
    public static int[] field439 = field446;

    @ObfuscatedName("ja.bz")
    public static int[] field465 = new int[8191];

    @ObfuscatedName("ja.bv")
    public static int[] field466 = new int[8191];

    @ObfuscatedName("ja.bj")
    public static short[] field458 = new short[8191];

    @ObfuscatedName("ja.bf")
    public static byte[] field468 = new byte[8191];

    @ObfuscatedName("ja.bt")
    public boolean field449 = false;

    public ja(Canvas arg0, MaterialTypeList arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!NativeLibraries.method11710().method6800("sw3d")) {
                throw new RuntimeException("");
            }
            cp.method2360();
            this.q(this.field400, this.field400.method894(), 0);
            ColourUtils.method8092(false, true);
            this.field449 = true;
            this.field441 = new Matrix4x4();
            new Vector3();
            this.field442 = new Matrix4x3();
            new Quaternion();
            this.field464 = new Matrix4x4();
            this.field445 = new Matrix4x4();
            this.field436 = new Matrix4x4();
            this.method524(new Matrix4x3());
            this.method784(new Matrix4x4());
            this.method985(1);
            this.method986(0);
            if (arg0 != null) {
                this.method459(arg0, arg2, arg3);
                this.method462(arg0);
            }
            int var5 = this.field400.method894();
            for (short var6 = 0; var6 < var5; var6++) {
                Material var7 = this.field400.method889(var6);
                if (var7 != null) {
                    this.V(var6, var7.field1260, var7.field1262.getId(), var7.field1270, var7.field1248, var7.field1264, var7.field1252 == 64, var7.field1266, var7.field1267, var7.field1268, var7.field1261, var7.field1250, var7.field1265, var7.field1276, var7.field1273, var7.field1274, var7.field1275, var7.field1245, var7.field1277, var7.field1278);
                }
            }
        } catch (Throwable var9) {
            var9.printStackTrace();
            this.method442();
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ja.h()V")
    public void method992() {
        System.gc();
        System.runFinalization();
        cp.method2359();
    }

    public synchronized void finalize() {
        this.method442();
        if (this.nativeid != 0L) {
            cp.method2358(this);
        }
    }

    @ObfuscatedName("ja.of(Ldp;Z)V")
    public void method1022(ParticleList arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (Particle var8 = (Particle) arg0.field1311.method11670(); var8 != null; var8 = (Particle) arg0.field1311.method11671()) {
            field439[var3++] = var8.field10145;
            field439[var3++] = var8.field10146;
            field439[var3++] = var8.field10147;
            field465[var4++] = var8.field10144;
            field458[var6++] = (short) var8.field10149;
            field466[var5++] = var8.field10148;
            if (arg1) {
                field468[var7++] = var8.field10151;
            }
        }
    }

    @ObfuscatedName("ja.t()Lcg;")
    public RendererInfo method456() {
        return new RendererInfo(0, "SSE", 1, "CPU", 0L);
    }

    @ObfuscatedName("ja.f(II)V")
    public void method653(int arg0, int arg1) throws RendererException {
        za var3 = (za) this.method458();
        if (var3 == null) {
            throw new IllegalStateException();
        }
        var3.method919(arg0, arg1);
        if (this.field400 != null) {
            this.field400.method890();
        }
    }

    @ObfuscatedName("ja.z()V")
    public void method441() {
    }

    @ObfuscatedName("ja.w()V")
    public void method443() {
        if (this.field459) {
            return;
        }
        this.field452 = null;
        this.field437 = null;
        this.field441 = null;
        for (ba var1 = (ba) this.field438.head(); var1 != null; var1 = (ba) this.field438.next()) {
            var1.ha();
        }
        this.field438.clearBridged();
        this.da();
        if (this.field449) {
            ColourUtils.method2790(false, true);
            this.field449 = false;
        }
        this.method992();
        cp.method2361();
        this.field459 = true;
    }

    @ObfuscatedName("ja.b(I)V")
    public void method444(int arg0) {
        cp.method2359();
        this.Y(arg0);
        for (ba var2 = (ba) this.field438.head(); var2 != null; var2 = (ba) this.field438.next()) {
            var2.u();
        }
    }

    @ObfuscatedName("ja.i()Z")
    public boolean method629() {
        return true;
    }

    @ObfuscatedName("ja.v()Z")
    public boolean method447() {
        return true;
    }

    @ObfuscatedName("ja.g()Z")
    public boolean method448() {
        return true;
    }

    @ObfuscatedName("ja.ay()Z")
    public boolean method450() {
        return false;
    }

    @ObfuscatedName("ja.af()Z")
    public boolean method451() {
        return false;
    }

    @ObfuscatedName("ja.e()Z")
    public boolean method449() {
        return true;
    }

    @ObfuscatedName("ja.ar()Z")
    public boolean method452() {
        return false;
    }

    @ObfuscatedName("ja.an()Z")
    public boolean method765() {
        return true;
    }

    @ObfuscatedName("ja.ap()Z")
    public boolean method454() {
        return true;
    }

    @ObfuscatedName("ja.ag()Z")
    public boolean method455() {
        return true;
    }

    @ObfuscatedName("ja.ck()I")
    public int method768() {
        return 4;
    }

    @ObfuscatedName("ja.db(Z)V")
    public void method471(boolean arg0) {
    }

    @ObfuscatedName("ja.ac()V")
    public void method587() {
    }

    @ObfuscatedName("ja.ak(Ljava/awt/Canvas;II)Lya;")
    public Surface method735(Canvas arg0, int arg1, int arg2) {
        return new za(this, arg0, arg1, arg2);
    }

    @ObfuscatedName("ja.aq()V")
    public void method490() {
        this.field447 = (float) this.method457().method921() / 2.0F;
        this.field450 = (float) this.method457().method922() / 2.0F;
        this.field448 = this.field447;
        this.field451 = this.field450;
        this.k();
    }

    @ObfuscatedName("ja.ab(IIII)V")
    public void method474(int arg0, int arg1, int arg2, int arg3) {
        this.field447 = (float) arg2 / 2.0F;
        this.field450 = (float) arg3 / 2.0F;
        this.field448 = (float) arg0 + this.field447;
        this.field451 = (float) arg1 + this.field450;
        this.A(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ja.bl(IIIIII)V")
    public void drawRectangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.XA(arg0, arg1, arg2, arg4, arg5);
        this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.G(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.G(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @ObfuscatedName("ja.bk(IIFIIFIIFIIII)V")
    public void method491(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
        throw new IllegalStateException();
    }

    @ObfuscatedName("ja.bs(IIIIII)V")
    public void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.YA(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ja.bn(IIIIIILta;II)V")
    public void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, GraphicsRelated arg6, int arg7, int arg8) {
        this.R(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @ObfuscatedName("ja.br(IIIIIII)V")
    public void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method987().method98(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("ja.bc(IIIIIILta;IIIII)V")
    public void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, GraphicsRelated arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @ObfuscatedName("ja.bd(IIIIIIIII)V")
    public void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @ObfuscatedName("ja.bp(IIIIII)I")
    public int method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = this.field436.entries[10] * (float) arg2 + this.field436.entries[6] * (float) arg1 + this.field436.entries[2] * (float) arg0 + this.field436.entries[14];
        float var9 = this.field436.entries[10] * (float) arg5 + this.field436.entries[6] * (float) arg4 + this.field436.entries[2] * (float) arg3 + this.field436.entries[14];
        float var10 = this.field436.entries[11] * (float) arg2 + this.field436.entries[7] * (float) arg1 + this.field436.entries[3] * (float) arg0 + this.field436.entries[15];
        float var11 = this.field436.entries[11] * (float) arg5 + this.field436.entries[7] * (float) arg4 + this.field436.entries[3] * (float) arg3 + this.field436.entries[15];
        if (var8 < -var10 && var9 < -var11) {
            var7 |= 0x10;
        } else if (var8 > var10 && var9 > var11) {
            var7 |= 0x20;
        }
        float var12 = this.field436.entries[8] * (float) arg2 + this.field436.entries[4] * (float) arg1 + this.field436.entries[0] * (float) arg0 + this.field436.entries[12];
        float var13 = this.field436.entries[8] * (float) arg5 + this.field436.entries[4] * (float) arg4 + this.field436.entries[0] * (float) arg3 + this.field436.entries[12];
        if (var12 < -var10 && var13 < -var11) {
            var7 |= 0x1;
        }
        if (var12 > var10 && var13 > var11) {
            var7 |= 0x2;
        }
        float var14 = this.field436.entries[9] * (float) arg2 + this.field436.entries[5] * (float) arg1 + this.field436.entries[1] * (float) arg0 + this.field436.entries[13];
        float var15 = this.field436.entries[9] * (float) arg5 + this.field436.entries[5] * (float) arg4 + this.field436.entries[1] * (float) arg3 + this.field436.entries[13];
        if (var14 < -var10 && var15 < -var11) {
            var7 |= 0x4;
        }
        if (var14 > var10 && var15 > var11) {
            var7 |= 0x8;
        }
        return var7;
    }

    @ObfuscatedName("ja.do(FFF[F)V")
    public void method550(float arg0, float arg1, float arg2, float[] arg3) {
        float var5 = this.field436.entries[11] * arg2 + this.field436.entries[7] * arg1 + this.field436.entries[3] * arg0 + this.field436.entries[15];
        float var6 = this.field436.entries[8] * arg2 + this.field436.entries[4] * arg1 + this.field436.entries[0] * arg0 + this.field436.entries[12];
        float var7 = this.field436.entries[9] * arg2 + this.field436.entries[5] * arg1 + this.field436.entries[1] * arg0 + this.field436.entries[13];
        float var8 = this.field464.entries[10] * arg2 + this.field464.entries[6] * arg1 + this.field464.entries[2] * arg0 + this.field464.entries[14];
        arg3[0] = this.field447 * var6 / var5 + this.field448;
        arg3[1] = this.field450 * var7 / var5 + this.field451;
        arg3[2] = var8;
    }

    @ObfuscatedName("ja.dg(FFF[F)V")
    public void method567(float arg0, float arg1, float arg2, float[] arg3) {
        float var5 = this.field436.entries[10] * arg2 + this.field436.entries[6] * arg1 + this.field436.entries[2] * arg0 + this.field436.entries[14];
        float var6 = this.field436.entries[11] * arg2 + this.field436.entries[7] * arg1 + this.field436.entries[3] * arg0 + this.field436.entries[15];
        if (var5 < -var6 || var5 > var6) {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
            return;
        }
        float var7 = this.field436.entries[8] * arg2 + this.field436.entries[4] * arg1 + this.field436.entries[0] * arg0 + this.field436.entries[12];
        if (var7 < -var6 || var7 > var6) {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
            return;
        }
        float var8 = this.field436.entries[9] * arg2 + this.field436.entries[5] * arg1 + this.field436.entries[1] * arg0 + this.field436.entries[13];
        if (var8 < -var6 || var8 > var6) {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
        } else {
            float var9 = this.field464.entries[10] * arg2 + this.field464.entries[6] * arg1 + this.field464.entries[2] * arg0 + this.field464.entries[14];
            arg3[0] = this.field447 * var7 / var6 + this.field448;
            arg3[1] = this.field450 * var8 / var6 + this.field451;
            arg3[2] = var9;
        }
    }

    @ObfuscatedName("ja.bi(I)Lv;")
    public Heap method593(int arg0) {
        ba var2 = new ba(this, arg0);
        this.field438.addTail(var2);
        return var2;
    }

    @ObfuscatedName("ja.bx(Lv;)V")
    public void method502(Heap arg0) {
        this.field437 = (ba) arg0;
        this.n(arg0);
    }

    @ObfuscatedName("ja.bb(IIZZ)Lce;")
    public Sprite method658(int arg0, int arg1, boolean arg2, boolean arg3) {
        return new fa(this, arg0, arg1, arg3);
    }

    @ObfuscatedName("ja.be([IIIIIZ)Lce;")
    public Sprite method513(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new fa(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("ja.bo(Lds;Z)Lce;")
    public Sprite method517(SpriteData arg0, boolean arg1) {
        fa var3 = new fa(this, arg0.method2735(false), 0, arg0.method2721(), arg0.method2721(), arg0.method2763(), false);
        var3.method1036(arg0.method2722(), arg0.method2724(), arg0.method2732(), arg0.method2734());
        return var3;
    }

    @ObfuscatedName("ja.bh(IIIIZ)Lce;")
    public Sprite method508(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new fa(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @ObfuscatedName("ja.cq(II[I[I)Lta;")
    public GraphicsRelated method571(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new wa(this, this.field437, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ja.co(Lvm;[Lzv;Z)Ll;")
    public Font createFont(FontMetrics arg0, PalettedSpriteData[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; var7++) {
            var4[var7] = arg1[var7].field8415;
            var5[var7] = arg1[var7].field8409;
            if (arg1[var7].field8416 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                return new ea(this, this.field437, arg0, arg1, null);
            } else {
                return new m(this, this.field437, arg0, arg1, null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("");
        } else {
            return new ia(this, this.field437, arg0, arg1, null);
        }
    }

    @ObfuscatedName("ja.cw(I)V")
    public void method673(int arg0) {
        this.field453 = this.field440 = arg0;
        if (this.field457 > 1) {
            throw new IllegalStateException();
        }
        this.method985(this.field457);
        this.method986(0);
    }

    @ObfuscatedName("ja.cx(Ldw;IIII)Lqa;")
    public Model method625(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4) {
        return new h(this, this.field437, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ja.cn(II)I")
    public int method519(int arg0, int arg1) {
        int var3 = arg0 & 0xFFFFF;
        int var4 = arg1 & 0xFFFFF;
        return var3 & var4 ^ var4;
    }

    @ObfuscatedName("ja.cf(II)I")
    public int method520(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @ObfuscatedName("ja.cs(II[[I[[IIII)Lxa;")
    public FloorModel method521(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new i(this, this.field437, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("ja.cb()Lka;")
    public Matrix4x4 method781() {
        return this.field441;
    }

    @ObfuscatedName("ja.cm()Lkc;")
    public Matrix4x3 method516() {
        return this.field442;
    }

    @ObfuscatedName("ja.oa(I)V")
    public void method985(int arg0) {
        this.field457 = arg0;
        this.field452 = new a[this.field457];
        for (int var2 = 0; var2 < this.field457; var2++) {
            this.field452[var2] = new a(this, this.field453, this.field440);
        }
    }

    @ObfuscatedName("ja.os(I)V")
    public void method986(int arg0) {
        this.field452[arg0].method110();
    }

    @ObfuscatedName("ja.oq()La;")
    public a method987() {
        for (int var1 = 0; var1 < this.field457; var1++) {
            if (this.field452[var1].field377 == Thread.currentThread()) {
                return this.field452[var1];
            }
        }
        return null;
    }

    @ObfuscatedName("ja.cp(Ldp;)V")
    public void method733(ParticleList arg0) {
        if (!arg0.field1311.method11674()) {
            this.method1022(arg0, false);
            this.method987().method96(this, field439, field465, field466, field458, arg0.field1311.method11681());
        }
    }

    @ObfuscatedName("ja.ci(Lkc;)V")
    public void method524(Matrix4x3 arg0) {
        this.field443 = arg0;
        this.field464.method5385(arg0);
        this.AA(this.field464.entries);
        this.field436.method5383(this.field464, this.field445);
    }

    @ObfuscatedName("ja.ca()Lkc;")
    public Matrix4x3 method525() {
        return this.field443;
    }

    @ObfuscatedName("ja.ch(Lka;)V")
    public void method784(Matrix4x4 arg0) {
        this.field445 = arg0;
        this.wa(this.field445.entries);
        this.field436.method5383(this.field464, this.field445);
    }

    @ObfuscatedName("ja.cv()Lka;")
    public Matrix4x4 method528() {
        return this.field445;
    }

    @ObfuscatedName("ja.ce(I[Lacg;)V")
    public void method535(int arg0, Light[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; var4++) {
            field461[var3++] = arg1[var4].method14888();
            field461[var3++] = arg1[var4].method14882();
            field461[var3++] = arg1[var4].method14879();
            field461[var3++] = arg1[var4].method14880();
            field462[var4] = arg1[var4].method14893();
            field461[var3++] = arg1[var4].method14881();
        }
        this.Q(arg0, field461, field462);
    }

    @ObfuscatedName("ja.ct(IIIIII)Ldj;")
    public EnvironmentSampler method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @ObfuscatedName("ja.cu(Ldj;Ldj;FLdj;)Ldj;")
    public EnvironmentSampler method537(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3) {
        return null;
    }

    @ObfuscatedName("ja.cc(Ldj;)V")
    public void method549(EnvironmentSampler arg0) {
    }

    @ObfuscatedName("ja.dj(IIII)V")
    public void method514(int arg0, int arg1, int arg2, int arg3) {
    }

    @ObfuscatedName("ja.dp()V")
    public void method545() {
    }

    @ObfuscatedName("ja.cg()Z")
    public boolean method539() {
        return false;
    }

    @ObfuscatedName("ja.cj()V")
    public void method558() {
    }

    @ObfuscatedName("ja.cy()Z")
    public boolean method600() {
        return false;
    }

    @ObfuscatedName("ja.dl(FFFFFF)V")
    public void method543(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
    }

    @ObfuscatedName("ja.di(ILdk;)V")
    public final void setWaterFog(int arg0, WaterFogData arg1) {
        this.JA(arg0, arg1.colour, arg1.scale, arg1.field1474);
    }

    @ObfuscatedName("ja.dw(ILdk;)V")
    public final void method503(int arg0, WaterFogData arg1) {
        this.M(arg0, arg1.colour, arg1.scale, arg1.field1474);
    }

    @ObfuscatedName("ja.av()Lyu;")
    public Framebuffer method467() {
        return new o(this);
    }

    @ObfuscatedName("ja.ob(II)Lde;")
    public GraphicsDeletable method991(int arg0, int arg1) {
        return (fa) this.method658(arg0, arg1, false, true);
    }

    @ObfuscatedName("ja.aj(IILcy;Ldz;I)Lde;")
    public GraphicsDeletable method468(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
        return this.method991(arg0, arg1);
    }

    @ObfuscatedName("ja.ah(II)Ldo;")
    public EffectInterface method637(int arg0, int arg1) {
        return new oa(arg0, arg1);
    }

    @ObfuscatedName("ja.au(III)Ldo;")
    public EffectInterface method541(int arg0, int arg1, int arg2) {
        return new oa(arg0, arg1);
    }

    // Native -> Java (do not change)
    @ObfuscatedName("ja.WA()Ljava/lang/Object;")
    public Object WA() {
        return new aa(this);
    }

    // Native -> Java (do not change)
    @ObfuscatedName("ja.h()V")
    public void h() {
        System.gc();
        System.runFinalization();
        cp.method2359();
    }

    // Native -> Java (do not change)
    @ObfuscatedName("ja.SA(S)Z")
    public boolean SA(short arg0) {
        MaterialTypeList var2 = this.field400;
        synchronized(this.field400) {
            Material var3 = this.field400.method889(arg0);
            if (var3 == null) {
                return false;
            } else {
                int var4 = var3.field1252;
                if (!this.field400.method898(arg0, MaterialAlphaMode.field4853 != var3.field1262 ? TextureRelated2.field4849 : TextureRelated2.field4848, 0.7F, var4, var4, true)) {
                    return false;
                } else {
                    int[] var5;
                    if (MaterialAlphaMode.field4853 != var3.field1262) {
                        var5 = this.field400.method886(arg0, 0.7F, var4, var4, true);
                    } else {
                        var5 = this.field400.method887(arg0, 0.7F, var4, var4, true);
                    }

                    int[] var6;
                    if (var4 == 64) {
                        var6 = new int[16384];

                        for(int var7 = 0; var7 < var4; ++var7) {
                            for(int var8 = 0; var8 < var4; ++var8) {
                                int var9 = (var8 * 128 + var7) * 2;
                                var6[var9] = var6[var9 + 1] = var6[var9 + 128] = var6[var9 + 128 + 1] = var5[var4 * var8 + var7];
                            }
                        }
                    } else {
                        var6 = var5;
                    }

                    this.F(arg0, var6, var3.field1260, var3.field1262.getId(), var3.field1270, var3.field1248, var3.field1264, var3.field1252 == 64, var3.field1266, var3.field1267, var3.field1268, var3.field1261, var3.field1250, var3.field1265, var3.field1276, var3.field1273, var3.field1274, var3.field1275, var3.field1245, var3.field1277, var3.field1278);
                    return true;
                }
            }
        }
    }

    @ObfuscatedName("ja.q(Lma;II)V")
    public native void q(MaterialTypeList arg0, int arg1, int arg2);

    @ObfuscatedName("ja.YA(IIIIII)V")
    public native void YA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("ja.R(IIIIIILta;II)V")
    public native void R(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, GraphicsRelated arg6, int arg7, int arg8);

    @ObfuscatedName("ja.da()V")
    public native void da();

    @ObfuscatedName("ja.Y(I)V")
    public native void Y(int arg0);

    @ObfuscatedName("ja.n(Lv;)V")
    public native void n(Heap arg0);

    @ObfuscatedName("ja.Q(I[I[F)V")
    public native void Q(int arg0, int[] arg1, float[] arg2);

    @ObfuscatedName("ja.V(SSIBBIZBBBBZZZZZBZZI)V")
    public native void V(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @ObfuscatedName("ja.F(S[ISIBBIZBBBBZZZZZBZZI)V")
    public native void F(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @ObfuscatedName("ja.ma(Z)V")
    public native void ma(boolean arg0);

    @ObfuscatedName("ja.d(JJ)V")
    public native void d(long arg0, long arg1);

    @ObfuscatedName("ja.za()I")
    public native int za();

    @ObfuscatedName("ja.ba(II)V")
    public native void ba(int arg0, int arg1);

    @ObfuscatedName("ja.ae(IIII)[I")
    public native int[] ae(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("ja.wa([F)V")
    public native void wa(float[] arg0);

    @ObfuscatedName("ja.PA(Lza;)V")
    public native void PA(za arg0);

    @ObfuscatedName("ja.k()V")
    public native void k();

    @ObfuscatedName("ja.A(IIII)V")
    public native void A(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("ja.GA(FF)V")
    public native void GA(float arg0, float arg1);

    @ObfuscatedName("ja.r(IIII)V")
    public native void r(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("ja.B(IIIIII)V")
    public native void B(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("ja.N(IIIIII[BII)V")
    public native void N(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @ObfuscatedName("ja.DA(ILta;II)V")
    public native void DA(int arg0, GraphicsRelated arg1, int arg2, int arg3);

    @ObfuscatedName("ja.IA(F)V")
    public native void IA(float arg0);

    @ObfuscatedName("ja.m(IFFFFF)V")
    public native void m(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @ObfuscatedName("ja.J(I)V")
    public native void J(int arg0);

    @ObfuscatedName("ja.c(III)V")
    public native void c(int arg0, int arg1, int arg2);

    @ObfuscatedName("ja.JA(IIII)V")
    public native void JA(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("ja.M(IIII)V")
    public native void M(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("ja.O()V")
    public native void O();

    @ObfuscatedName("ja.RA(Z)V")
    public native void RA(boolean arg0);

    @ObfuscatedName("ja.qa([I)V")
    public native void qa(int[] arg0);

    @ObfuscatedName("ja.XA(IIIII)V")
    public native void XA(int arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ja.AA([F)V")
    public native void AA(float[] arg0);

    @ObfuscatedName("ja.G(IIIII)V")
    public native void G(int arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ja.L()V")
    public native void L();

    @ObfuscatedName("ja.o(IIII)V")
    public native void o(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("ja.CA(IIIII)V")
    public native void CA(int arg0, int arg1, int arg2, int arg3, int arg4);
}
