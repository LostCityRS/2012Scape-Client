import deob.ObfuscatedName;
import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("ahv")
public final class GlxToolkit extends GpuToolkit {

    @ObfuscatedName("ahv.gf")
    public OpenGL field10029;

    @ObfuscatedName("ahv.gl")
    public IterableQueue field10031 = new IterableQueue();

    @ObfuscatedName("ahv.gb")
    public IterableQueue field10005 = new IterableQueue();

    @ObfuscatedName("ahv.go")
    public IterableQueue field10010 = new IterableQueue();

    @ObfuscatedName("ahv.gi")
    public IterableQueue field10007 = new IterableQueue();

    @ObfuscatedName("ahv.ga")
    public IterableQueue field10008 = new IterableQueue();

    @ObfuscatedName("ahv.gs")
    public IterableQueue field10009 = new IterableQueue();

    @ObfuscatedName("ahv.gd")
    public IterableQueue field10004 = new IterableQueue();

    @ObfuscatedName("ahv.gj")
    public long field10011;

    @ObfuscatedName("ahv.gu")
    public final int[] field10012 = new int[1000];

    @ObfuscatedName("ahv.gg")
    public boolean field10013;

    @ObfuscatedName("ahv.gy")
    public boolean field10014;

    @ObfuscatedName("ahv.gt")
    public boolean field10015;

    @ObfuscatedName("ahv.gx")
    public int field10016;

    @ObfuscatedName("ahv.gv")
    public GlxVertexBuffer[] field10017 = new GlxVertexBuffer[16];

    @ObfuscatedName("ahv.he")
    public GlxIndexBuffer field10026;

    @ObfuscatedName("ahv.hk")
    public int[] field10018;

    @ObfuscatedName("ahv.hy")
    public GlxProgram field10027;

    @ObfuscatedName("ahv.ho")
    public final String field10021;

    @ObfuscatedName("ahv.hh")
    public final String field10022;

    @ObfuscatedName("ahv.hm")
    public final int field10023;

    @ObfuscatedName("ahv.hq")
    public boolean field10003;

    @ObfuscatedName("ahv.hx")
    public boolean field10025;

    @ObfuscatedName("ahv.hs")
    public boolean field10006;

    @ObfuscatedName("ahv.ha")
    public final boolean field10019;

    @ObfuscatedName("ahv.hb")
    public final boolean field10028;

    @ObfuscatedName("ahv.hc")
    public final int field10024;

    @ObfuscatedName("ahv.hn")
    public boolean field10030;

    @ObfuscatedName("ahv.hd")
    public final float[] field10020;

    @ObfuscatedName("ahv.hw")
    public final float[] field10032;

    @ObfuscatedName("ahv.aba(Ljava/lang/String;)[B")
    public byte[] method16091(String arg0) {
        return this.method13491("gl", arg0);
    }

    @ObfuscatedName("ahv.y(Ljava/lang/String;)Lec;")
    public GpuShader method13490(String arg0) {
        byte[] var2 = this.method16091(arg0);
        if (var2 == null) {
            return null;
        } else {
            ShaderData var3 = this.method13492(var2);
            return new GlxProgramManager(this, var3);
        }
    }

    @ObfuscatedName("ahv.x()Z")
    public boolean method13487() {
        return this.field10019;
    }

    @ObfuscatedName("ahv.k()Z")
    public boolean method13488() {
        return this.field10028;
    }

    public GlxToolkit(OpenGL arg0, Canvas arg1, long arg2, MaterialTypeList arg3, Js5 arg4, int arg5) {
        super(arg3, arg4, arg5, 1);
        new MapBuffer();
        new MapBuffer();
        this.field10020 = new float[4];
        this.field10032 = new float[16];
        int[] var8 = new int[1];
        try {
            this.field10029 = arg0;
            this.field10029.method1();
            this.field10021 = OpenGL.glGetString(7936).toLowerCase();
            this.field10022 = OpenGL.glGetString(7937).toLowerCase();
            if (this.field10021.indexOf("microsoft") != -1 || this.field10021.indexOf("brian paul") != -1 || this.field10021.indexOf("mesa") != -1) {
                throw new RuntimeException("");
            }
            String var9 = OpenGL.glGetString(7938);
            String[] var10 = StringTools.method11508(var9.replace('.', ' '), ' ');
            if (var10.length < 2) {
                throw new RuntimeException("");
            }
            try {
                int var11 = StringTools.parseInt(var10[0]);
                int var12 = StringTools.parseInt(var10[1]);
                this.field10023 = var11 * 10 + var12;
            } catch (NumberFormatException var25) {
                throw new RuntimeException("");
            }
            if (this.field10023 < 12) {
                throw new RuntimeException("");
            }
            OpenGL.glGetIntegerv(34018, var8, 0);
            this.field8337 = var8[0];
            if (this.field8337 < 2) {
                throw new RuntimeException("");
            }
            this.field8379 = 8;
            this.field10003 = this.field10029.method0("GL_ARB_vertex_buffer_object");
            this.field8339 = this.field10029.method0("GL_ARB_multisample");
            this.field10025 = this.field10029.method0("GL_ARB_texture_rectangle");
            this.field10029.method0("GL_ARB_texture_cube_map");
            this.field10006 = this.field10029.method0("GL_ARB_texture_non_power_of_two");
            this.field8384 = true;
            this.field10019 = this.field10029.method0("GL_ARB_vertex_shader");
            this.field10029.method0("GL_ARB_vertex_program");
            this.field10028 = this.field10029.method0("GL_ARB_fragment_shader");
            this.field10029.method0("GL_ARB_fragment_program");
            this.field10029.method0("GL_EXT_framebuffer_object");
            this.field10018 = new int[this.field8337];
            this.field8380 = this.field10029.method0("GL_EXT_framebuffer_object");
            this.field8381 = this.field10029.method0("GL_EXT_framebuffer_blit");
            this.field8382 = this.field10029.method0("GL_EXT_framebuffer_multisample");
            if (!this.method13487() || !this.method13488()) {
                if (!this.field10029.method0("GL_ARB_multitexture")) {
                    throw new RuntimeException("");
                }
                if (!this.field10029.method0("GL_ARB_texture_env_combine")) {
                    throw new RuntimeException("");
                }
            }
            this.field10024 = Stream.method42() ? 33639 : 5121;
            if (this.field10022.indexOf("radeon") != -1) {
                int var14 = 0;
                boolean var15 = false;
                boolean var16 = false;
                String[] var17 = StringTools.method11508(this.field10022.replace('/', ' '), ' ');
                for (int var18 = 0; var18 < var17.length; var18++) {
                    String var19 = var17[var18];
                    try {
                        if (var19.length() > 0) {
                            if (var19.charAt(0) == 'x' && var19.length() >= 3 && StringTools.method7735(var19.substring(1, 3))) {
                                var19 = var19.substring(1);
                                var16 = true;
                            }
                            if (var19.equals("hd")) {
                                var15 = true;
                            } else {
                                if (var19.startsWith("hd")) {
                                    var19 = var19.substring(2);
                                    var15 = true;
                                }
                                if (var19.length() >= 4 && StringTools.method7735(var19.substring(0, 4))) {
                                    var14 = StringTools.parseInt(var19.substring(0, 4));
                                    break;
                                }
                            }
                        }
                    } catch (Exception var26) {
                    }
                }
                if (!var16 && !var15) {
                    if (var14 >= 7000 && var14 <= 7999) {
                        this.field10003 = false;
                    }
                    if (var14 >= 7000 && var14 <= 9250) {
                        this.field8384 = false;
                    }
                }
                this.field10025 &= this.field10029.method0("GL_ARB_half_float_pixel");
            }
            if (this.field10021.indexOf("intel") != -1) {
            }
            if (this.field10003) {
                try {
                    int[] var21 = new int[1];
                    OpenGL.glGenBuffersARB(1, var21, 0);
                } catch (Throwable var24) {
                    throw new RuntimeException("");
                }
            }
            this.method460(arg1, new GlxSurface(this, arg1, arg2));
            this.method462(arg1);
            this.method13512(32768, false);
            this.method13512(32768, false);
        } catch (Throwable var27) {
            var27.printStackTrace();
            this.method442();
            if (var27 instanceof OutOfMemoryError) {
                throw (OutOfMemoryError) var27;
            }
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ahv.ox()V")
    public void method13497() {
        OpenGL.glDepthFunc(515);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glPolygonMode(1028, 6914);
        for (int var1 = this.field8337 - 1; var1 >= 0; var1--) {
            OpenGL.glActiveTexture(var1 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var2 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            OpenGL.glLightfv(var4, 4608, var2, 0);
            OpenGL.glLightf(var4, 4615, 0.0F);
            OpenGL.glLightf(var4, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field10029.setSwapInterval(0);
        super.method13497();
    }

    @ObfuscatedName("ahv.t()Lcg;")
    public RendererInfo method456() {
        int var1 = -1;
        if (this.field10021.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field10021.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (this.field10021.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new RendererInfo(var1, "OpenGL", this.field10023, this.field10022, 0L);
    }

    @ObfuscatedName("ahv.f(II)V")
    public void method653(int arg0, int arg1) throws RendererException {
        this.field415.method918();
        if (this.field400 != null) {
            this.field400.method890();
        }
    }

    @ObfuscatedName("ahv.z()V")
    public void method441() {
        OpenGL.glFinish();
    }

    @ObfuscatedName("ahv.w()V")
    public void method443() {
        super.method443();
        if (this.field10029 != null) {
            this.field10029.method2();
            this.field10029.release();
            this.field10029 = null;
        }
    }

    @ObfuscatedName("ahv.oo()F")
    public float method13750() {
        return 0.0F;
    }

    @ObfuscatedName("ahv.ak(Ljava/awt/Canvas;II)Lya;")
    public Surface method735(Canvas arg0, int arg1, int arg2) {
        return new GlxSurface(this, arg0);
    }

    @ObfuscatedName("ahv.av()Lyu;")
    public Framebuffer method467() {
        return new GlxFramebuffer(this);
    }

    @ObfuscatedName("ahv.aj(IILcy;Ldz;I)Lde;")
    public GraphicsDeletable method468(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
        return new GlxRelated14(this, arg2, arg3, arg0, arg1, arg4);
    }

    @ObfuscatedName("ahv.ah(II)Ldo;")
    public EffectInterface method637(int arg0, int arg1) {
        return new GlxRelated14(this, TextureFormat.field1300, DataType.field1503, arg0, arg1);
    }

    @ObfuscatedName("ahv.au(III)Ldo;")
    public EffectInterface method541(int arg0, int arg1, int arg2) {
        return new GlxRelated14(this, TextureFormat.field1300, DataType.field1503, arg0, arg1, arg2);
    }

    @ObfuscatedName("ahv.ae(IIII)[I")
    public int[] ae(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = this.field412.method922();
        for (int var7 = 0; var7 < arg3; var7++) {
            OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.field10024, var5, arg2 * var7);
        }
        return var5;
    }

    @ObfuscatedName("ahv.ac()V")
    public void method587() {
        if (this.field412 == null) {
            return;
        }
        int var1 = this.field412.method921();
        int var2 = this.field412.method922();
        if (var1 <= 0 && var2 <= 0) {
            return;
        }
        int var3 = this.field8299;
        int var4 = this.field8300;
        int var5 = this.field8301;
        int var6 = this.field8376;
        this.method490();
        int var7 = this.field8293;
        int var8 = this.field8294;
        int var9 = this.field8291;
        int var10 = this.field8292;
        this.L();
        OpenGL.glReadBuffer(1028);
        OpenGL.glDrawBuffer(1029);
        this.method13802();
        this.method13578(false);
        this.method13539(false);
        this.method13620(false);
        this.method13728(false);
        this.method13557(null);
        this.method13791(1);
        this.method13592(0);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glRasterPos2i(0, 0);
        OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
        OpenGL.glFlush();
        OpenGL.glReadBuffer(1029);
        OpenGL.glDrawBuffer(1029);
        this.r(var7, var9, var8, var10);
        this.method474(var3, var4, var5, var6);
    }

    @ObfuscatedName("ahv.cu(Ldj;Ldj;FLdj;)Ldj;")
    public EnvironmentSampler method537(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @ObfuscatedName("ahv.ba(II)V")
    public void ba(int arg0, int arg1) {
        int var3 = 0;
        if ((arg0 & 0x1) != 0) {
            OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
            var3 = 16384;
        }
        if ((arg0 & 0x2) != 0) {
            this.method13728(true);
            var3 |= 0x100;
        }
        if ((arg0 & 0x4) != 0) {
            var3 |= 0x400;
        }
        OpenGL.glClear(var3);
    }

    @ObfuscatedName("ahv.pd()V")
    public void method13493() {
        if (this.field412 != null) {
            OpenGL.glViewport(this.field8303 + this.field8299, this.field8246 + this.field412.method922() - this.field8300 - this.field8376, this.field8301, this.field8376);
        }
        OpenGL.glDepthRange(this.field8285, this.field8286);
    }

    @ObfuscatedName("ahv.pe()V")
    public void method13519() {
        if (this.field412 == null) {
            return;
        }
        int var1 = this.field8303 + this.field8293;
        int var2 = this.field8246 + this.field412.method922() - this.field8292;
        int var3 = this.field8294 - this.field8293;
        int var4 = this.field8292 - this.field8291;
        if (var3 < 0) {
            var3 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        OpenGL.glScissor(var1, var2, var3, var4);
    }

    @ObfuscatedName("ahv.pp()V")
    public void method13520() {
        if (this.field8398) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
    }

    @ObfuscatedName("ahv.of(Lka;Lka;Lka;)V")
    public void method13764(Matrix4x4 arg0, Matrix4x4 arg1, Matrix4x4 arg2) {
        OpenGL.glMatrixMode(5888);
        this.field8264.method5383(arg0, arg1);
        OpenGL.glLoadMatrixf(this.field8264.field3480, 0);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(arg2.field3480, 0);
    }

    @ObfuscatedName("ahv.ph(Lka;)V")
    public void method13638(Matrix4x4 arg0) {
        float[] var2 = arg0.field3480;
        var2[1] = -var2[1];
        var2[5] = -var2[5];
        var2[9] = -var2[9];
        var2[13] = -var2[13];
    }

    @ObfuscatedName("ahv.py()V")
    public void method13536() {
        if (this.field8307) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
    }

    @ObfuscatedName("ahv.pu()V")
    public void method13537() {
        OpenGL.glDepthMask(this.field8305 && this.field8367);
    }

    @ObfuscatedName("ahv.qd()V")
    public void method13618() {
        if (this.field8231 && !this.field8287) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @ObfuscatedName("ahv.qm()V")
    public void method13540() {
        this.field10020[0] = this.field8319 * this.field8316;
        this.field10020[1] = this.field8319 * this.field8317;
        this.field10020[2] = this.field8319 * this.field8237;
        this.field10020[3] = 1.0F;
        OpenGL.glLightModelfv(2899, this.field10020, 0);
    }

    @ObfuscatedName("ahv.qi()V")
    public void method13541() {
        this.field10020[0] = this.field8320 * this.field8316;
        this.field10020[1] = this.field8320 * this.field8317;
        this.field10020[2] = this.field8320 * this.field8237;
        this.field10020[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, this.field10020, 0);
        this.field10020[0] = -this.field8373 * this.field8316;
        this.field10020[1] = -this.field8373 * this.field8317;
        this.field10020[2] = -this.field8373 * this.field8237;
        this.field10020[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, this.field10020, 0);
    }

    @ObfuscatedName("ahv.qx()V")
    public void method13842() {
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadMatrixf(this.field8258.field3480, 0);
        OpenGL.glLightfv(16384, 4611, this.field8272, 0);
        OpenGL.glLightfv(16385, 4611, this.field8308, 0);
    }

    @ObfuscatedName("ahv.qn()V")
    public void method13628() {
        if (this.field8309) {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        } else {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        }
    }

    @ObfuscatedName("ahv.qq()V")
    public void method13543() {
    }

    @ObfuscatedName("ahv.qo()V")
    public void method13545() {
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadMatrixf(this.field8258.field3480, 0);
        int var1;
        for (var1 = 0; var1 < this.field8324; var1++) {
            Light var2 = this.field8365[var1];
            int var3 = var2.method14881();
            int var4 = var1 + 16386;
            float var5 = var2.method14893() / 255.0F;
            this.field10020[0] = var2.method14888();
            this.field10020[1] = var2.method14882();
            this.field10020[2] = var2.method14879();
            this.field10020[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, this.field10020, 0);
            this.field10020[0] = (float) (var3 >> 16 & 0xFF) * var5;
            this.field10020[1] = (float) (var3 >> 8 & 0xFF) * var5;
            this.field10020[2] = (float) (var3 & 0xFF) * var5;
            this.field10020[3] = 1.0F;
            OpenGL.glLightfv(var4, 4609, this.field10020, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var2.method14880() * var2.method14880()));
            OpenGL.glEnable(var4);
        }
        while (var1 < this.field8323) {
            OpenGL.glDisable(var1 + 16386);
            var1++;
        }
    }

    @ObfuscatedName("ahv.qr(Lcy;Ldz;)Z")
    public boolean method13546(TextureFormat arg0, DataType arg1) {
        return true;
    }

    @ObfuscatedName("ahv.qw(Lcy;Ldz;)Z")
    public boolean method13547(TextureFormat arg0, DataType arg1) {
        return this.field8384;
    }

    @ObfuscatedName("ahv.qc(Lcy;Ldz;II)Lhc;")
    public GpuTexture method13550(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
        return this.method13542(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ahv.qh(IIZ[III)Lhc;")
    public GpuTexture method13552(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        if (this.field10006 || IntMath.method11258(arg0) && IntMath.method11258(arg1)) {
            return new GlxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5);
        } else if (this.field10025) {
            return new GlxTexture2(this, arg0, arg1, arg3, arg4, arg5);
        } else {
            GlxTexture var7 = new GlxTexture(this, TextureFormat.field1296, DataType.field1501, IntMath.method2839(arg0), IntMath.method2839(arg1));
            var7.method4413(0, 0, arg0, arg1, arg3, arg4, arg5);
            return var7;
        }
    }

    @ObfuscatedName("ahv.qj(Lcy;IIZ[BII)Lhc;")
    public GpuTexture method13599(TextureFormat arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
        if (this.field10006 || IntMath.method11258(arg1) && IntMath.method11258(arg2)) {
            return new GlxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        } else if (this.field10025) {
            return new GlxTexture2(this, arg0, arg1, arg2, arg4, arg5, arg6);
        } else {
            GlxTexture var8 = new GlxTexture(this, arg0, DataType.field1501, IntMath.method2839(arg1), IntMath.method2839(arg2));
            var8.method4414(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
            return var8;
        }
    }

    @ObfuscatedName("ahv.qz(Lcy;IIZ[FII)Lhc;")
    public GpuTexture method13630(TextureFormat arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
        if (this.field10006 || IntMath.method11258(arg1) && IntMath.method11258(arg2)) {
            return new GlxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        } else if (this.field10025) {
            return new GlxTexture2(this, arg0, arg1, arg2, arg4, arg5, arg6);
        } else {
            GlxTexture var8 = new GlxTexture(this, arg0, DataType.field1506, IntMath.method2839(arg1), IntMath.method2839(arg2));
            var8.method14192(0, 0, arg1, arg2, arg4, arg0, arg5, arg6);
            return var8;
        }
    }

    @ObfuscatedName("ahv.qy(Lcy;Ldz;II)Lii;")
    public GpuTextureRelated1 method13542(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
        if (this.field10006 || IntMath.method11258(arg2) && IntMath.method11258(arg3)) {
            return new GlxTexture(this, arg0, arg1, arg2, arg3);
        } else if (this.field10025) {
            return new GlxTexture2(this, arg0, arg1, arg2, arg3);
        } else {
            return new GlxTexture(this, arg0, arg1, IntMath.method2839(arg2), IntMath.method2839(arg3));
        }
    }

    @ObfuscatedName("ahv.qv(IZ[[I)Lih;")
    public GpuCubeTexture method13553(int arg0, boolean arg1, int[][] arg2) {
        return new GlxCubeTexture(this, arg0, arg1, arg2);
    }

    @ObfuscatedName("ahv.qe(Lcy;IIIZ[B)Lgt;")
    public GpuVolumeTexture method13554(TextureFormat arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        return new GlxVolumeTexture(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ahv.qb()V")
    public void method13558() {
        int var1 = this.field10018[this.field8253];
        if (var1 != 0) {
            this.field10018[this.field8253] = 0;
            OpenGL.glBindTexture(var1, 0);
            OpenGL.glDisable(var1);
        }
    }

    @ObfuscatedName("ahv.ru()V")
    public void method13570() {
        OpenGL.glMatrixMode(5890);
        if (this.field8306[this.field8253] == TextureTramsformType.field2550) {
            OpenGL.glLoadIdentity();
        } else {
            OpenGL.glLoadMatrixf(this.field8331[this.field8253].method5408(this.field10032), 0);
        }
        OpenGL.glMatrixMode(5888);
    }

    @ObfuscatedName("ahv.ra()V")
    public void method13719() {
        OpenGL.glActiveTexture(this.field8253 + 33984);
    }

    @ObfuscatedName("ahv.rf()V")
    public void method13779() {
        OpenGL.glTexEnvi(8960, 34161, method16084(this.field8333[this.field8253]));
    }

    @ObfuscatedName("ahv.rl()V")
    public void method13572() {
        OpenGL.glTexEnvi(8960, 34162, method16084(this.field8356[this.field8253]));
    }

    @ObfuscatedName("ahv.rs(ILhp;ZZ)V")
    public final void method13561(int arg0, TextureCombiner arg1, boolean arg2, boolean arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, method16085(arg1));
        if (arg2) {
            OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 771 : 770);
        } else {
            OpenGL.glTexEnvi(8960, arg0 + 34192, arg3 ? 769 : 768);
        }
    }

    @ObfuscatedName("ahv.rx(ILhp;Z)V")
    public final void method13563(int arg0, TextureCombiner arg1, boolean arg2) {
        OpenGL.glTexEnvi(8960, arg0 + 34184, method16085(arg1));
        OpenGL.glTexEnvi(8960, arg0 + 34200, arg2 ? 771 : 770);
    }

    @ObfuscatedName("ahv.rp()V")
    public final void method13569() {
        this.field10020[0] = (float) (this.field8335 & 0xFF0000) / 1.671168E7F;
        this.field10020[1] = (float) (this.field8335 & 0xFF00) / 65280.0F;
        this.field10020[2] = (float) (this.field8335 & 0xFF) / 255.0F;
        this.field10020[3] = (float) (this.field8335 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, this.field10020, 0);
    }

    @ObfuscatedName("ahv.abz(Lhi;)I")
    public static final int method16084(TextureCombineMode arg0) {
        if (TextureCombineMode.field2573 == arg0) {
            return 7681;
        } else if (TextureCombineMode.field2574 == arg0) {
            return 8448;
        } else if (TextureCombineMode.field2577 == arg0) {
            return 34165;
        } else if (TextureCombineMode.field2575 == arg0) {
            return 260;
        } else if (TextureCombineMode.field2576 == arg0) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ahv.acc(Lhp;)I")
    public static final int method16085(TextureCombiner arg0) {
        if (TextureCombiner.field2546 == arg0) {
            return 5890;
        } else if (TextureCombiner.field2545 == arg0) {
            return 34167;
        } else if (TextureCombiner.field2544 == arg0) {
            return 34168;
        } else if (TextureCombiner.field2547 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ahv.ro(I)V")
    public void method13637(int arg0) {
        OpenGL.glColorMask((arg0 & 0x1) != 0, (arg0 & 0x2) != 0, (arg0 & 0x4) != 0, (arg0 & 0x8) != 0);
    }

    @ObfuscatedName("ahv.rb()V")
    public void method13633() {
        if (this.field8377) {
            OpenGL.glEnable(3008);
        } else {
            OpenGL.glDisable(3008);
        }
    }

    @ObfuscatedName("ahv.rn()V")
    public void method13576() {
        byte var1 = 0;
        byte var2 = 0;
        if (this.field8399 == 0) {
            var1 = 0;
            var2 = 0;
        } else if (this.field8399 == 1) {
            var1 = 1;
            var2 = 0;
        } else if (this.field8399 == 2) {
            var1 = 1;
            var2 = 1;
        }
        if (BlendMode.field2543 == this.field8369) {
            OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
        } else if (BlendMode.field2540 == this.field8369) {
            OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
        } else if (BlendMode.field2541 == this.field8369) {
            OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
        }
    }

    @ObfuscatedName("ahv.rr()V")
    public void method13701() {
        if (this.field8241) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
    }

    @ObfuscatedName("ahv.sd()V")
    public void method13581() {
        if (this.field8250 && this.field8361 && this.field8364 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @ObfuscatedName("ahv.se()V")
    public void method13580() {
        this.field8304 = this.field8290 - (float) this.field8390;
        this.field8251 = this.field8304 - (float) this.field8364;
        if (this.field8251 < this.field8289) {
            this.field8251 = this.field8289;
        }
        if (!this.field8242) {
            return;
        }
        OpenGL.glFogf(2915, this.field8251);
        OpenGL.glFogf(2916, this.field8304);
        this.field10020[0] = (float) (this.field8363 & 0xFF0000) / 1.671168E7F;
        this.field10020[1] = (float) (this.field8363 & 0xFF00) / 65280.0F;
        this.field10020[2] = (float) (this.field8363 & 0xFF) / 255.0F;
        OpenGL.glFogfv(2918, this.field10020, 0);
    }

    @ObfuscatedName("ahv.so(Z)V")
    public void method13582(boolean arg0) {
        if (arg0) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
    }

    @ObfuscatedName("ahv.sz(Z)Lhe;")
    public final VertexBuffer method13584(boolean arg0) {
        return new GlxVertexBuffer(this, arg0);
    }

    @ObfuscatedName("ahv.st(Z)Lin;")
    public final IndexBuffer method13797(boolean arg0) {
        return new GlxIndexBuffer(this, DataType.field1502, arg0);
    }

    @ObfuscatedName("ahv.sb([Lhu;)Lhy;")
    public VertexDeclaration method13585(VertexDeclarationElement[] arg0) {
        return new VertexDeclaration_Sub1(arg0);
    }

    @ObfuscatedName("ahv.sl(ILhe;)V")
    public void method13587(int arg0, VertexBuffer arg1) {
        this.field10017[arg0] = (GlxVertexBuffer) arg1;
    }

    @ObfuscatedName("ahv.sf(Lin;)V")
    public void method13588(IndexBuffer arg0) {
        this.field10026 = (GlxIndexBuffer) arg0;
        this.field10026.method5996();
    }

    @ObfuscatedName("ahv.sa(Lhy;)V")
    public void method13688(VertexDeclaration arg0) {
        VertexDeclarationElement[] var2 = arg0.field2422;
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        for (int var7 = 0; var7 < var2.length; var7++) {
            VertexDeclarationElement var8 = var2[var7];
            GlxVertexBuffer var9 = this.field10017[var7];
            int var10 = 0;
            int var11 = var9.method14169();
            long var12 = var9.method5995();
            var9.method5996();
            for (int var14 = 0; var14 < var8.method4484(); var14++) {
                VertexDeclarationElementComponent var15 = var8.method4482(var14);
                switch (var15.field2491) {
                    case 0:
                        OpenGL.glColorPointer(4, 5121, var11, (long) var10 + var12);
                        var4 = true;
                    case 1:
                    case 2:
                    case 6:
                    case 9:
                    default:
                        break;
                    case 3:
                        OpenGL.glVertexPointer(3, 5126, var11, (long) var10 + var12);
                        var6 = true;
                        break;
                    case 4:
                        OpenGL.glClientActiveTexture(var3++ + 33984);
                        OpenGL.glTexCoordPointer(4, 5126, var11, (long) var10 + var12);
                        break;
                    case 5:
                        OpenGL.glClientActiveTexture(var3++ + 33984);
                        OpenGL.glTexCoordPointer(2, 5126, var11, (long) var10 + var12);
                        break;
                    case 7:
                        OpenGL.glClientActiveTexture(var3++ + 33984);
                        OpenGL.glTexCoordPointer(3, 5126, var11, (long) var10 + var12);
                        break;
                    case 8:
                        OpenGL.glNormalPointer(5126, var11, (long) var10 + var12);
                        var5 = true;
                        break;
                    case 10:
                        OpenGL.glClientActiveTexture(var3++ + 33984);
                        OpenGL.glTexCoordPointer(1, 5126, var11, (long) var10 + var12);
                }
                var10 += var15.field2486;
            }
        }
        if (this.field10015 != var6) {
            if (var6) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field10015 = var6;
        }
        if (this.field10013 != var5) {
            if (var5) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field10013 = var5;
        }
        if (this.field10014 != var4) {
            if (var4) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field10014 = var4;
        }
        if (this.field10016 < var3) {
            for (int var16 = this.field10016; var16 < var3; var16++) {
                OpenGL.glClientActiveTexture(var16 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field10016 = var3;
        } else if (this.field10016 > var3) {
            for (int var17 = var3; var17 < this.field10016; var17++) {
                OpenGL.glClientActiveTexture(var17 + 33984);
                OpenGL.glDisableClientState(32888);
            }
            this.field10016 = var3;
        }
    }

    @ObfuscatedName("ahv.sn(Lir;II)V")
    public final void method13619(PrimitiveType arg0, int arg1, int arg2) {
        byte var4;
        int var5;
        if (PrimitiveType.field2581 == arg0) {
            var4 = 1;
            var5 = arg2 * 2;
        } else if (PrimitiveType.field2585 == arg0) {
            var4 = 3;
            var5 = arg2 + 1;
        } else if (PrimitiveType.field2582 == arg0) {
            var4 = 4;
            var5 = arg2 * 3;
        } else if (PrimitiveType.field2580 == arg0) {
            var4 = 6;
            var5 = arg2 + 2;
        } else if (PrimitiveType.field2584 == arg0) {
            var4 = 5;
            var5 = arg2 + 2;
        } else {
            var4 = 0;
            var5 = arg2;
        }
        OpenGL.glDrawArrays(var4, arg1, var5);
    }

    @ObfuscatedName("ahv.su(Lin;Lir;IIII)V")
    public final void method13595(IndexBuffer arg0, PrimitiveType arg1, int arg2, int arg3, int arg4, int arg5) {
        byte var7;
        int var8;
        if (PrimitiveType.field2581 == arg1) {
            var7 = 1;
            var8 = arg5 * 2;
        } else if (PrimitiveType.field2585 == arg1) {
            var7 = 3;
            var8 = arg5 + 1;
        } else if (PrimitiveType.field2582 == arg1) {
            var7 = 4;
            var8 = arg5 * 3;
        } else if (PrimitiveType.field2580 == arg1) {
            var7 = 6;
            var8 = arg5 + 2;
        } else if (PrimitiveType.field2584 == arg1) {
            var7 = 5;
            var8 = arg5 + 2;
        } else {
            var7 = 0;
            var8 = arg5;
        }
        DataType var9 = arg0.method4538();
        GlxIndexBuffer var10 = (GlxIndexBuffer) arg0;
        var10.method5996();
        OpenGL.glDrawElements(var7, var8, method16090(var9), var10.method5995() + (long) (var9.field1508 * arg4));
    }

    @ObfuscatedName("ahv.sh(Lir;IIII)V")
    public final void method13596(PrimitiveType arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6;
        int var7;
        if (PrimitiveType.field2581 == arg0) {
            var6 = 1;
            var7 = arg4 * 2;
        } else if (PrimitiveType.field2585 == arg0) {
            var6 = 3;
            var7 = arg4 + 1;
        } else if (PrimitiveType.field2582 == arg0) {
            var6 = 4;
            var7 = arg4 * 3;
        } else if (PrimitiveType.field2580 == arg0) {
            var6 = 6;
            var7 = arg4 + 2;
        } else if (PrimitiveType.field2584 == arg0) {
            var6 = 5;
            var7 = arg4 + 2;
        } else {
            var6 = 0;
            var7 = arg4;
        }
        DataType var8 = this.field10026.method4538();
        OpenGL.glDrawElements(var6, var7, method16090(var8), this.field10026.method5995() + (long) (var8.field1508 * arg3));
    }

    @ObfuscatedName("ahv.b(I)V")
    public final synchronized void method444(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field10005.method11585()) {
            IntNode var4 = (IntNode) this.field10005.method11560();
            this.field10012[var2++] = (int) var4.field4228;
            this.field8252 -= var4.field9556;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, this.field10012, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, this.field10012, 0);
            var2 = 0;
        }
        while (!this.field10010.method11585()) {
            IntNode var5 = (IntNode) this.field10010.method11560();
            this.field10012[var2++] = (int) var5.field4228;
            this.field8325 -= var5.field9556;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, this.field10012, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, this.field10012, 0);
            var2 = 0;
        }
        while (!this.field10007.method11585()) {
            IntNode var6 = (IntNode) this.field10007.method11560();
            this.field10012[var2++] = var6.field9556;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, this.field10012, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, this.field10012, 0);
            var2 = 0;
        }
        while (!this.field10008.method11585()) {
            IntNode var7 = (IntNode) this.field10008.method11560();
            this.field10012[var2++] = (int) var7.field4228;
            this.field8334 -= var7.field9556;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, this.field10012, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, this.field10012, 0);
            boolean var8 = false;
        }
        while (!this.field10031.method11585()) {
            IntNode var9 = (IntNode) this.field10031.method11560();
            OpenGL.glDeleteLists((int) var9.field4228, var9.field9556);
        }
        while (!this.field10009.method11585()) {
            Node var10 = this.field10009.method11560();
            OpenGL.glDeleteProgram((int) var10.field4228);
        }
        while (!this.field10004.method11585()) {
            Node var11 = this.field10004.method11560();
            OpenGL.glDeleteShader((int) var11.field4228);
        }
        while (!this.field10031.method11585()) {
            IntNode var12 = (IntNode) this.field10031.method11560();
            OpenGL.glDeleteLists((int) var12.field4228, var12.field9556);
        }
        if (this.za() > 100663296 && MonotonicTime.get() > this.field10011 + 60000L) {
            System.gc();
            this.field10011 = MonotonicTime.get();
        }
        super.method444(var3);
    }

    @ObfuscatedName("ahv.acp(II)V")
    public final synchronized void method16083(int arg0, int arg1) {
        IntNode var3 = new IntNode(arg1);
        var3.field4228 = arg0;
        this.field10005.addFirst(var3);
    }

    @ObfuscatedName("ahv.aca(II)V")
    public final synchronized void method16086(int arg0, int arg1) {
        IntNode var3 = new IntNode(arg1);
        var3.field4228 = arg0;
        this.field10010.addFirst(var3);
    }

    @ObfuscatedName("ahv.acv(I)V")
    public final synchronized void method16087(int arg0) {
        IntNode var2 = new IntNode(arg0);
        this.field10007.addFirst(var2);
    }

    @ObfuscatedName("ahv.acl(II)V")
    public final synchronized void method16088(int arg0, int arg1) {
        IntNode var3 = new IntNode(arg1);
        var3.field4228 = arg0;
        this.field10008.addFirst(var3);
    }

    @ObfuscatedName("ahv.acm(J)V")
    public final synchronized void method16099(long arg0) {
        Node var3 = new Node();
        var3.field4228 = arg0;
        this.field10004.addFirst(var3);
    }

    @ObfuscatedName("ahv.acr(I)V")
    public final synchronized void method16089(int arg0) {
        Node var2 = new Node();
        var2.field4228 = arg0;
        this.field10009.addFirst(var2);
    }

    @ObfuscatedName("ahv.acx(Ldz;)I")
    public static final int method16090(DataType arg0) {
        switch (arg0.field1507) {
            case 0:
                return 5123;
            case 1:
            default:
                return 5121;
            case 2:
                return 5121;
            case 3:
                return 5122;
            case 4:
                return 5124;
            case 5:
                return 5120;
            case 6:
                return 5131;
            case 7:
                return 5126;
            case 8:
                return 5125;
        }
    }

    @ObfuscatedName("ahv.ach(Lcy;)I")
    public static int method16093(TextureFormat arg0) {
        switch (arg0.field1305) {
            case 0:
                return 6410;
            case 1:
                return 6408;
            case 2:
                return 6402;
            case 3:
            case 5:
            case 7:
            default:
                throw new IllegalStateException();
            case 4:
                return 6407;
            case 6:
                return 6409;
            case 8:
                return 6406;
        }
    }

    @ObfuscatedName("ahv.acz(Lcy;Ldz;)I")
    public static int method16100(TextureFormat arg0, DataType arg1) {
        if (DataType.field1501 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 6410;
                case 1:
                    return 6408;
                case 2:
                case 3:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 6407;
                case 5:
                    return 33777;
                case 6:
                    return 6409;
                case 7:
                    return 33779;
                case 8:
                    return 6406;
            }
        } else if (DataType.field1502 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 36219;
                case 1:
                    return 32859;
                case 2:
                    return 33189;
                case 3:
                case 5:
                case 7:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 32852;
                case 6:
                    return 32834;
                case 8:
                    return 32830;
            }
        } else if (DataType.field1503 == arg1) {
            switch (arg0.field1305) {
                case 2:
                    return 33190;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (DataType.field1505 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 34847;
                case 1:
                    return 34842;
                case 2:
                case 3:
                case 5:
                case 7:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 34843;
                case 6:
                    return 34846;
                case 8:
                    return 34844;
            }
        } else if (DataType.field1506 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 34841;
                case 1:
                    return 34836;
                case 2:
                case 3:
                case 5:
                case 7:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 34837;
                case 6:
                    return 34840;
                case 8:
                    return 34838;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int add(TextureFormat arg0, DataType arg1) {
        if (DataType.field1501 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 6410;
                case 1:
                    return 6408;
                case 2:
                case 3:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 6407;
                case 5:
                    return 33777;
                case 6:
                    return 6409;
                case 7:
                    return 33779;
                case 8:
                    return 6406;
            }
        } else if (DataType.field1502 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 36219;
                case 1:
                    return 32859;
                case 2:
                    return 33189;
                case 3:
                case 5:
                case 7:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 32852;
                case 6:
                    return 32834;
                case 8:
                    return 32830;
            }
        } else if (DataType.field1503 == arg1) {
            switch (arg0.field1305) {
                case 2:
                    return 33190;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (DataType.field1505 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 34847;
                case 1:
                    return 34842;
                case 2:
                case 3:
                case 5:
                case 7:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 34843;
                case 6:
                    return 34846;
                case 8:
                    return 34844;
            }
        } else if (DataType.field1506 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 34841;
                case 1:
                    return 34836;
                case 2:
                case 3:
                case 5:
                case 7:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 34837;
                case 6:
                    return 34840;
                case 8:
                    return 34838;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ahv.db(Z)V")
    public void method471(boolean arg0) {
    }

    @ObfuscatedName("ahv.sp(I)V")
    public void method13523(int arg0) {
        if (!this.field10030) {
            OpenGL.glPolygonMode(1028, (arg0 & 0x2) == 0 ? 6914 : 6913);
        }
    }
}
