import deob.ObfuscatedName;

@ObfuscatedName("a")
public class a implements ua {

    public long nativeid;

    @ObfuscatedName("a.u")
    public ja field378;

    @ObfuscatedName("a.j")
    public Runnable field377;

    @ObfuscatedName("a.a")
    public h[] field380 = new h[7];

    @ObfuscatedName("a.s")
    public h[] field379 = new h[7];

    @ObfuscatedName("a.c")
    public Matrix4x4 field376;

    public a(ja arg0, int arg1, int arg2) {
        this.field378 = arg0;
        for (int var4 = 0; var4 < 7; var4++) {
            this.field380[var4] = new h(this.field378);
            this.field379[var4] = new h(this.field378);
        }
        this.field376 = new Matrix4x4();
        this.ha(this.nativeid, arg0, arg1, arg2);
    }

    @ObfuscatedName("a.u()V")
    public void method110() {
        this.field377 = Thread.currentThread();
        this.method94();
    }

    @ObfuscatedName("a.j(Lh;BIZ)Lqa;")
    public Model method90(h arg0, byte arg1, int arg2, boolean arg3) {
        boolean var5 = false;
        h var6;
        h var7;
        if (arg1 > 0 && arg1 <= 7) {
            var6 = this.field379[arg1 - 1];
            var7 = this.field380[arg1 - 1];
            var5 = true;
        } else {
            var7 = var6 = new h(this.field378);
        }
        arg0.BA(var7, var6, arg2, var5, arg3);
        var7.field473 = arg0.field473;
        var7.field471 = arg0.field471;
        return var7;
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            cp.method2358(this);
        }
    }

    @ObfuscatedName("a.ma(Z)V")
    public void ma(boolean arg0) {
        this.R(this.nativeid, arg0);
    }

    @ObfuscatedName("a.a()V")
    public void method94() {
        this.JA(this.nativeid);
    }

    @ObfuscatedName("a.s(Lra;[I[I[I[SI)V")
    public void method96(RendererToolkit arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.b(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("a.c(Lra;IIIIIII)V")
    public void method98(RendererToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.K(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @ObfuscatedName("a.m(Lqa;Lqa;IIIZ)V")
    public void method100(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.P(this.nativeid, ((h) arg0).nativeid, ((h) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("a.t(Lqa;Lkc;[II)V")
    public void method102(Model arg0, Matrix4x3 arg1, int[] arg2, int arg3) {
        this.field376.method5385(arg1);
        this.wa(this.nativeid, ((h) arg0).nativeid, this.field376.entries, arg2, arg3);
    }

    @ObfuscatedName("a.l(Lqa;IILkc;Z)Z")
    public boolean method104(Model arg0, int arg1, int arg2, Matrix4x3 arg3, boolean arg4) {
        this.field376.method5385(arg3);
        return this.ya(this.nativeid, ((h) arg0).nativeid, arg1, arg2, this.field376.entries, arg4);
    }

    @ObfuscatedName("a.f(Lqa;[ILkc;)V")
    public void method89(Model arg0, int[] arg1, Matrix4x3 arg2) {
        this.field376.method5385(arg2);
        this.J(this.nativeid, ((h) arg0).nativeid, arg1, this.field376.entries);
    }

    @ObfuscatedName("a.d(Lxa;II)V")
    public void method108(FloorModel arg0, int arg1, int arg2) {
        this.v(this.nativeid, ((i) arg0).nativeid, arg1, arg2);
    }

    @ObfuscatedName("a.z(Lxa;IIIIIII[[Z)V")
    public void method119(FloorModel arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.i(this.nativeid, ((i) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @ObfuscatedName("a.wa(JJ[F[II)V")
    public native void wa(long arg0, long arg1, float[] arg2, int[] arg3, int arg4);

    @ObfuscatedName("a.R(JZ)V")
    public native void R(long arg0, boolean arg1);

    @ObfuscatedName("a.JA(J)V")
    public native void JA(long arg0);

    @ObfuscatedName("a.b(JLra;[I[I[I[SI)V")
    public native void b(long arg0, RendererToolkit arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @ObfuscatedName("a.ya(JJII[FZ)Z")
    public native boolean ya(long arg0, long arg1, int arg2, int arg3, float[] arg4, boolean arg5);

    @ObfuscatedName("a.v(JJII)V")
    public native void v(long arg0, long arg1, int arg2, int arg3);

    @ObfuscatedName("a.i(JJIIIIIII[[Z)V")
    public native void i(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @ObfuscatedName("a.P(JJJIIIZ)V")
    public native void P(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @ObfuscatedName("a.J(JJ[I[F)V")
    public native void J(long arg0, long arg1, int[] arg2, float[] arg3);

    @ObfuscatedName("a.K(JLra;IIIIIII)V")
    public native void K(long arg0, RendererToolkit arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @ObfuscatedName("a.ha(JLra;II)V")
    public native void ha(long arg0, RendererToolkit arg1, int arg2, int arg3);
}
