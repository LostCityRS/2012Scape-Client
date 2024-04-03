import deob.ObfuscatedName;

@ObfuscatedName("ec")
public abstract class GpuShader {

    @ObfuscatedName("ec.u")
    public String field2080;

    @ObfuscatedName("ec.j")
    public GpuProgram[] field2073;

    @ObfuscatedName("ec.a")
    public HashMap field2075;

    @ObfuscatedName("ec.s")
    public HashMap field2077;

    @ObfuscatedName("ec.c")
    public int field2074;

    @ObfuscatedName("ec.m")
    public int field2078;

    @ObfuscatedName("ec.t")
    public int field2079 = -1;

    @ObfuscatedName("ec.l")
    public static final HashMapKey field2076 = new ShaderRelated();

    public GpuShader(GpuToolkit arg0, ShaderData arg1) {
        this.field2080 = arg1.field2086;
        this.field2074 = arg1.field2088.length;
        this.field2075 = new HashMap(this.field2074, field2076);
        for (int var3 = 0; var3 < this.field2074; var3++) {
            this.field2075.method3552(var3, arg1.field2088[var3].field2093, this.method3338(arg1.field2088[var3]));
        }
        this.field2078 = arg1.field2082.length;
        this.field2077 = new HashMap(this.field2078, field2076);
        for (int var4 = 0; var4 < this.field2078; var4++) {
            this.field2077.method3552(var4, arg1.field2082[var4].field2093, this.method3338(arg1.field2082[var4]));
        }
        this.field2073 = new GpuProgram[arg1.field2087.length];
        for (int var5 = 0; var5 < arg1.field2087.length; var5++) {
            this.field2073[var5] = this.method3404(arg0, arg1.field2087[var5]);
        }
    }

    @ObfuscatedName("ec.s(I)Ljava/lang/String;")
    public String method3328() {
        return this.field2080;
    }

    @ObfuscatedName("ec.m(Ljava/lang/String;I)Leo;")
    public GpuProgram method3330(String arg0) throws ProgramNotFoundException {
        GpuProgram[] var2 = this.field2073;
        for (int var3 = 0; var3 < var2.length; var3++) {
            GpuProgram var4 = var2[var3];
            String var5 = var4.method3244();
            if (var5 != null && var5.equals(arg0)) {
                if (!var4.method3272()) {
                    throw new ProgramNotFoundException(arg0);
                }
                return var4;
            }
        }
        throw new ProgramNotFoundException(arg0);
    }

    @ObfuscatedName("ec.t(B)I")
    public final int method3331() {
        return this.field2073.length;
    }

    @ObfuscatedName("ec.l(II)Leo;")
    public final GpuProgram method3332(int arg0) {
        return this.field2073[arg0];
    }

    @ObfuscatedName("ec.f(Leo;I)I")
    public int method3345(GpuProgram arg0) {
        for (int var2 = 0; var2 < this.field2073.length; var2++) {
            if (this.field2073[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ec.d(I)Leo;")
    public GpuProgram method3334() {
        GpuProgram[] var1 = this.field2073;
        for (int var2 = 0; var2 < var1.length; var2++) {
            GpuProgram var3 = var1[var2];
            if (var3.method3272()) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("ec.n(I)Leo;")
    public final GpuProgram method3376() {
        return this.field2079 >= 0 ? this.field2073[this.field2079] : null;
    }

    @ObfuscatedName("ec.o(I)I")
    public final int method3401() {
        return this.field2079;
    }

    @ObfuscatedName("ec.p(Laig;FI)V")
    public final void method3383(GpuProgramUniform arg0, float arg1) {
        this.field2073[this.field2079].method3231(arg0, arg1);
    }

    @ObfuscatedName("ec.w(Laig;FFI)V")
    public final void method3340(GpuProgramUniform arg0, float arg1, float arg2) {
        this.field2073[this.field2079].method3267(arg0, arg1, arg2);
    }

    @ObfuscatedName("ec.b(Laig;FFFB)V")
    public final void method3341(GpuProgramUniform arg0, float arg1, float arg2, float arg3) {
        this.field2073[this.field2079].method3233(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ec.x(Laig;FFFFB)V")
    public final void method3342(GpuProgramUniform arg0, float arg1, float arg2, float arg3, float arg4) {
        this.field2073[this.field2079].method3234(arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ec.i(Laig;Lko;I)V")
    public final void method3420(GpuProgramUniform arg0, Vector3 arg1) {
        this.field2073[this.field2079].method3233(arg0, arg1.field3475, arg1.field3476, arg1.field3477);
    }

    @ObfuscatedName("ec.v(Laig;Lku;I)V")
    public final void method3406(GpuProgramUniform arg0, Vector4 arg1) {
        this.field2073[this.field2079].method3234(arg0, arg1.field3426, arg1.field3427, arg1.field3428, arg1.field3429);
    }

    @ObfuscatedName("ec.k(Laig;[FI)V")
    public final void method3344(GpuProgramUniform arg0, float[] arg1) {
        this.field2073[this.field2079].method3235(arg0, arg1, arg1.length);
    }

    @ObfuscatedName("ec.h(Laig;II)V")
    public final void method3381(GpuProgramUniform arg0, int arg1) {
        float var3 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
        float var4 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
        float var5 = (float) (arg1 & 0xFF) / 255.0F;
        float var6 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
        this.method3342(arg0, var3, var4, var5, var6);
    }

    @ObfuscatedName("ec.r(Laig;Lka;I)V")
    public final void method3356(GpuProgramUniform arg0, Matrix4x4 arg1) {
        this.field2073[this.field2079].method3232(arg0, arg1);
    }

    @ObfuscatedName("ec.g(Laig;Lka;I)V")
    public final void method3371(GpuProgramUniform arg0, Matrix4x4 arg1) {
        this.field2073[this.field2079].method3237(arg0, arg1);
    }

    @ObfuscatedName("ec.y(Laig;ILip;I)V")
    public final void method3336(GpuProgramUniform arg0, int arg1, BaseTexture arg2) {
        this.field2073[this.field2079].method3271(arg0, arg1, arg2);
    }

    @ObfuscatedName("ec.e(IFFFB)V")
    public final void method3349(int arg0, float arg1, float arg2, float arg3) {
        this.field2073[this.field2079].method3239(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ec.ay(IFFFFB)V")
    public final void method3350(int arg0, float arg1, float arg2, float arg3, float arg4) {
        this.field2073[this.field2079].method3240(arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ec.af(ILko;B)V")
    public final void method3351(int arg0, Vector3 arg1) {
        this.field2073[this.field2079].method3239(arg0, arg1.field3475, arg1.field3476, arg1.field3477);
    }

    @ObfuscatedName("ec.ar(I[FII)V")
    public final void method3352(int arg0, float[] arg1, int arg2) {
        this.field2073[this.field2079].method3241(arg0, arg1, arg2);
    }

    @ObfuscatedName("ec.an(ILka;I)V")
    public final void method3346(int arg0, Matrix4x4 arg1) {
        this.field2073[this.field2079].method3242(arg0, arg1);
    }

    @ObfuscatedName("ec.ap(ILka;B)V")
    public final void method3354(int arg0, Matrix4x4 arg1) {
        this.field2073[this.field2079].method3243(arg0, arg1);
    }

    @ObfuscatedName("ec.ag(ILka;B)V")
    public final void method3355(int arg0, Matrix4x4 arg1) {
        this.field2073[this.field2079].method3284(arg0, arg1);
    }

    @ObfuscatedName("ec.as(IILip;B)V")
    public final void method3353(int arg0, int arg1, BaseTexture arg2) {
        this.field2073[this.field2079].method3245(arg0, arg1, arg2);
    }

    @ObfuscatedName("ec.ai(Ljava/lang/String;I)Laig;")
    public GpuProgramUniform method3357(String arg0) throws UniformNotFoundException {
        GpuProgramUniform var2 = (GpuProgramUniform) this.field2075.method3550(arg0);
        if (var2 == null) {
            throw new UniformNotFoundException(arg0);
        }
        return var2;
    }

    @ObfuscatedName("ec.ao(I)I")
    public int method3337() {
        return this.field2078;
    }

    @ObfuscatedName("ec.al(II)Laig;")
    public GpuProgramUniform method3359(int arg0) {
        return (GpuProgramUniform) this.field2077.method3557(arg0);
    }

    @ObfuscatedName("ec.at(Ljava/lang/String;B)Laig;")
    public GpuProgramUniform method3360(String arg0) {
        return (GpuProgramUniform) this.field2077.method3550(arg0);
    }

    @ObfuscatedName("ec.ax(B)I")
    public int method3361() {
        return this.field2074;
    }

    @ObfuscatedName("ec.aw(IS)Laig;")
    public GpuProgramUniform method3362(int arg0) {
        return (GpuProgramUniform) this.field2075.method3557(arg0);
    }

    @ObfuscatedName("ec.aa()V")
    public void method3363() {
    }

    @ObfuscatedName("ec.u()V")
    public abstract void method3325();

    @ObfuscatedName("ec.a()Z")
    public abstract boolean method3327();

    @ObfuscatedName("ec.z(Leo;)Z")
    public abstract boolean method3335(GpuProgram arg0);

    @ObfuscatedName("ec.q(Ley;)Laig;")
    public abstract GpuProgramUniform method3338(ProgramUniformData arg0);

    @ObfuscatedName("ec.c(Lyk;Lei;)Leo;")
    public abstract GpuProgram method3404(GpuToolkit arg0, ProgramData arg1);

    @ObfuscatedName("ec.j()V")
    public abstract void method3416();
}
