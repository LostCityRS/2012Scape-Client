import deob.ObfuscatedName;

@ObfuscatedName("aif")
public class DelayedStateChange extends SecondaryNode {

    @ObfuscatedName("aif.t")
    public int field10321;

    @ObfuscatedName("aif.l")
    public int field10298;

    @ObfuscatedName("aif.f")
    public int field10299;

    @ObfuscatedName("aif.d")
    public String field10300;

    @ObfuscatedName("aif.as")
    public static DualIterableQueue field10323 = new DualIterableQueue();

    @ObfuscatedName("aif.ai")
    public static DualIterableQueue field10317 = new DualIterableQueue();

    @ObfuscatedName("aif.ao")
    public static IterableMap field10326 = new IterableMap(16);

    @ObfuscatedName("qv.u(IJ)Laif;")
    public static DelayedStateChange method8304(int arg0, long arg1) {
        DelayedStateChange var3 = (DelayedStateChange) field10326.getNode((long) arg0 << 56 | arg1);
        if (var3 == null) {
            var3 = new DelayedStateChange(arg0, arg1);
            field10326.put(var3, var3.field4228);
        }
        return var3;
    }

    @ObfuscatedName("yw.a(I)Laif;")
    public static DelayedStateChange method12910() {
        DelayedStateChange var0 = (DelayedStateChange) field10323.last();
        if (var0 != null) {
            var0.remove();
            var0.dualRemove();
            return var0;
        }
        DelayedStateChange var1;
        do {
            var1 = (DelayedStateChange) field10317.last();
            if (var1 == null) {
                return null;
            }
            if (var1.method16510() > MonotonicTime.get()) {
                return null;
            }
            var1.remove();
            var1.dualRemove();
        } while ((var1.field9554 & Long.MIN_VALUE) == 0L);
        return var1;
    }

    @ObfuscatedName("kw.s(IB)V")
    public static void method5553(int arg0) {
        DelayedStateChange var1 = method8304(1, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("uu.c(II)V")
    public static void method12064(int arg0) {
        DelayedStateChange var1 = method8304(2, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("gq.m(II)V")
    public static void method3929(int arg0) {
        DelayedStateChange var1 = method8304(3, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("n.t(IS)V")
    public static void method1382(int arg0) {
        DelayedStateChange var1 = method8304(22, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("pc.f(II)V")
    public static void method7890(int arg0) {
        DelayedStateChange var1 = method8304(5, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("aec.d(II)V")
    public static void method15629(int arg0) {
        DelayedStateChange var1 = method8304(6, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("ee.z(II)V")
    public static void method3097(int arg0) {
        DelayedStateChange var1 = method8304(7, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("rg.n(II)V")
    public static void method8721(int arg0) {
        DelayedStateChange var1 = method8304(8, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("me.o(II)V")
    public static void method6563(int arg0) {
        DelayedStateChange var1 = method8304(9, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("vj.q(IS)V")
    public static void method12329(int arg0) {
        DelayedStateChange var1 = method8304(10, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("on.x(II)V")
    public static void method7185(int arg0) {
        DelayedStateChange var1 = method8304(11, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("afw.k(IB)V")
    public static void method15881(int arg0) {
        DelayedStateChange var1 = method8304(12, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("afp.h(IB)V")
    public static void method15683(int arg0) {
        DelayedStateChange var1 = method8304(14, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("tf.y(IB)V")
    public static void method11667(int arg0) {
        DelayedStateChange var1 = method8304(16, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("zg.ay(II)V")
    public static void method13906(int arg0) {
        DelayedStateChange var1 = method8304(20, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("iw.af(II)V")
    public static void method4568(int arg0) {
        DelayedStateChange var1 = method8304(21, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("lb.ar(IB)V")
    public static void method5601(int arg0) {
        DelayedStateChange var1 = method8304(17, (long) arg0);
        var1.method16506();
    }

    @ObfuscatedName("aaw.an(I)V")
    public static void onMapFlag() {
        DelayedStateChange var0 = method8304(15, 0L);
        var0.method16506();
    }

    @ObfuscatedName("ac.ap(III)V")
    public static void method1981(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(18, (long) arg1 << 32 | (long) arg0);
        var2.method16506();
    }

    @ObfuscatedName("wt.ag(IIB)V")
    public static void method12693(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(19, (long) arg1 << 32 | (long) arg0);
        var2.method16506();
    }

    @ObfuscatedName("fi.as(III)V")
    public static void method3667(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(1, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("aaq.ai(ILjava/lang/String;B)V")
    public static void method14096(int arg0, String arg1) {
        DelayedStateChange var2 = method8304(2, (long) arg0);
        var2.method16598();
        var2.field10300 = arg1;
    }

    @ObfuscatedName("ahs.ao(ILjava/lang/String;B)V")
    public static void method16188(int arg0, String arg1) {
        DelayedStateChange var2 = method8304(3, (long) arg0);
        var2.method16598();
        var2.field10300 = arg1;
    }

    @ObfuscatedName("ei.al(IZI)V")
    public static void method3226(int arg0, boolean arg1) {
        DelayedStateChange var2 = method8304(22, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1 ? 1 : 0;
    }

    @ObfuscatedName("er.at(IIIII)V")
    public static void method2995(int arg0, int arg1, int arg2, int arg3) {
        DelayedStateChange var4 = method8304(4, (long) arg0);
        var4.method16598();
        var4.field10321 = arg1;
        var4.field10298 = arg2;
        var4.field10299 = arg3;
    }

    @ObfuscatedName("ae.ax(IIB)V")
    public static void method1974(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(5, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("tg.aw(III)V")
    public static void method11469(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(6, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("ow.aa(III)V")
    public static void method7351(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(7, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("fy.am(IIIIB)V")
    public static void method3599(int arg0, int arg1, int arg2, int arg3) {
        DelayedStateChange var4 = method8304(8, (long) arg0);
        var4.method16598();
        var4.field10321 = arg1;
        var4.field10298 = arg2;
        var4.field10299 = arg3;
    }

    @ObfuscatedName("agz.ad(IIIB)V")
    public static void method15973(int arg0, int arg1, int arg2) {
        DelayedStateChange var3 = method8304(9, (long) arg0);
        var3.method16598();
        var3.field10321 = arg1;
        var3.field10298 = arg2;
    }

    @ObfuscatedName("wl.az(IIIII)V")
    public static void method12633(int arg0, int arg1, int arg2, int arg3) {
        DelayedStateChange var4 = method8304(10, (long) arg0);
        var4.method16598();
        var4.field10321 = arg1;
        var4.field10298 = arg2;
        var4.field10299 = arg3;
    }

    @ObfuscatedName("mv.ak(IIII)V")
    public static void method6312(int arg0, int arg1, int arg2) {
        DelayedStateChange var3 = method8304(11, (long) arg0);
        var3.method16598();
        var3.field10321 = arg1;
        var3.field10298 = arg2;
    }

    @ObfuscatedName("go.av(III)V")
    public static void method4033(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(12, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("on.aj(III)V")
    public static void method7186(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(13, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("uq.ah(III)V")
    public static void method12119(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(14, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("y.au(III)V")
    public static void method1639(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(16, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("afj.ae(IZI)V")
    public static void method15850(int arg0, boolean arg1) {
        DelayedStateChange var2 = method8304(21, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1 ? 1 : 0;
    }

    @ObfuscatedName("xx.ac(III)V")
    public static void method12737(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(17, (long) arg0);
        var2.method16598();
        var2.field10321 = arg1;
    }

    @ObfuscatedName("eo.aq(III)V")
    public static void method3292(int arg0, int arg1) {
        DelayedStateChange var2 = method8304(15, 0L);
        var2.method16598();
        var2.field10321 = arg0;
        var2.field10298 = arg1;
    }

    @ObfuscatedName("cd.ab(IIIII)V")
    public static void method2497(int arg0, int arg1, int arg2, int arg3) {
        DelayedStateChange var4 = method8304(18, (long) arg1 << 32 | (long) arg0);
        var4.method16598();
        var4.field10321 = arg2;
        var4.field10298 = arg3;
    }

    @ObfuscatedName("adt.bq(IIIII)V")
    public static void method15139(int arg0, int arg1, int arg2, int arg3) {
        DelayedStateChange var4 = method8304(19, (long) arg1 << 32 | (long) arg0);
        var4.method16598();
        var4.field10321 = arg2;
        var4.field10298 = arg3;
    }

    public DelayedStateChange(int arg0, long arg1) {
        this.field4228 = (long) arg0 << 56 | arg1;
    }

    @ObfuscatedName("aif.bz(I)V")
    public void method16506() {
        this.field9554 = this.field9554 & Long.MIN_VALUE | MonotonicTime.get() + 500L;
        field10317.addFirst(this);
    }

    @ObfuscatedName("aif.bv(I)V")
    public void method16598() {
        this.field9554 |= Long.MIN_VALUE;
        if (this.method16510() == 0L) {
            field10323.addFirst(this);
        }
    }

    @ObfuscatedName("aif.bj(I)I")
    public int method16508() {
        return (int) (this.field4228 >>> 56 & 0xFFL);
    }

    @ObfuscatedName("aif.bf(I)J")
    public long method16612() {
        return this.field4228 & 0xFFFFFFFFFFFFFFL;
    }

    @ObfuscatedName("aif.bt(I)J")
    public long method16510() {
        return this.field9554 & Long.MAX_VALUE;
    }
}
