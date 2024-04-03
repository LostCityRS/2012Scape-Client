import deob.ObfuscatedName;

@ObfuscatedName("fa")
public class fa extends Sprite implements SoftwareRendererRelated, GraphicsDeletable {

    public long nativeid;

    @ObfuscatedName("fa.u")
    public boolean field470 = false;

    public fa(ja arg0, int arg1, int arg2, boolean arg3) {
        this.field470 = arg3;
        this.method1069(arg0, arg1, arg2);
    }

    public fa(ja arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1033(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public fa(ja arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1034(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void finalize() {
        if (this.nativeid != 0L) {
            SoftwareRendererRelated2.method2358(this);
        }
    }

    @ObfuscatedName("fa.ma(Z)V")
    public void method92(boolean arg0) {
        this.method1035(this.nativeid, arg0);
    }

    @ObfuscatedName("fa.q(IIII)V")
    public void method1036(int arg0, int arg1, int arg2, int arg3) {
        this.method1037(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("fa.p([I)V")
    public void method1063(int[] arg0) {
        this.method1039(this.nativeid, arg0);
    }

    @ObfuscatedName("fa.u()I")
    public int method164() {
        return this.method1095(this.nativeid);
    }

    @ObfuscatedName("fa.w()I")
    public int method1061() {
        return this.method1095(this.nativeid);
    }

    @ObfuscatedName("fa.b()I")
    public int method1042() {
        return this.method1118(this.nativeid);
    }

    @ObfuscatedName("fa.a()I")
    public int method165() {
        return this.method1038(this.nativeid);
    }

    @ObfuscatedName("fa.i()I")
    public int method1045() {
        return this.method1038(this.nativeid);
    }

    @ObfuscatedName("fa.v()I")
    public int method1047() {
        return this.method1048(this.nativeid);
    }

    @ObfuscatedName("fa.k()Lde;")
    public GraphicsDeletable method1049() {
        return this.field470 ? this : null;
    }

    @ObfuscatedName("fa.h(IIIIII)V")
    public void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1051(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("fa.r(III)V")
    public void method1052(int arg0, int arg1, int arg2) {
        this.method1053(this.nativeid, arg0, arg1, arg2);
    }

    @ObfuscatedName("fa.ay(IIIII)V")
    public void method1054(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1109(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fa.af(IILta;II)V")
    public void method1056(int arg0, int arg1, GraphicsRelated arg2, int arg3, int arg4) {
        this.method1057(this.nativeid, arg0, arg1, ((wa) arg2).nativeid, arg3, arg4);
    }

    @ObfuscatedName("fa.ap(IIIIIIII)V")
    public void method1041(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1066(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @ObfuscatedName("fa.as(IIIIIII)V")
    public void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1059(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("fa.am(FFFFFFIIII)V")
    public void method1060(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method1032(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @ObfuscatedName("fa.az(FFFFFFILta;II)V")
    public void method1044(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, GraphicsRelated arg7, int arg8, int arg9) {
        this.method1096(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((wa) arg7).nativeid, arg8, arg9, this.field470);
    }

    @ObfuscatedName("fa.s()V")
    public void method168() {
    }

    @ObfuscatedName("fa.e(JFFFFFFIIII)V")
    public native void method1032(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @ObfuscatedName("fa.RA(Lja;[IIIIIZ)V")
    public native void method1033(ja arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @ObfuscatedName("fa.K(Lja;IIIIZ)V")
    public native void method1034(ja arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @ObfuscatedName("fa.M(JZ)V")
    public native void method1035(long arg0, boolean arg1);

    @ObfuscatedName("fa.U(JIIII)V")
    public native void method1037(long arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("fa.GA(J)I")
    public native int method1038(long arg0);

    @ObfuscatedName("fa.F(J[I)V")
    public native void method1039(long arg0, int[] arg1);

    @ObfuscatedName("fa.ba(J)I")
    public native int method1048(long arg0);

    @ObfuscatedName("fa.ea(JIIIIII)V")
    public native void method1051(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("fa.j(JIII)V")
    public native void method1053(long arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("fa.o(JIIJII)V")
    public native void method1057(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @ObfuscatedName("fa.aa(JIIIIIII)V")
    public native void method1059(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @ObfuscatedName("fa.ha(JIIIIIIII)V")
    public native void method1066(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @ObfuscatedName("fa.UA(Lja;II)V")
    public native void method1069(ja arg0, int arg1, int arg2);

    @ObfuscatedName("fa.da(J)I")
    public native int method1095(long arg0);

    @ObfuscatedName("fa.FA(JFFFFFFIJIIZ)V")
    public native void method1096(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10, boolean arg11);

    @ObfuscatedName("fa.Y(JIIIII)V")
    public native void method1109(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("fa.WA(J)I")
    public native int method1118(long arg0);
}
