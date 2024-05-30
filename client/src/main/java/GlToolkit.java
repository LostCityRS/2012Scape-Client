import deob.ObfuscatedName;
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

import java.awt.*;

@ObfuscatedName("yq")
public class GlToolkit extends RendererToolkit {

    public static final boolean ALLOW_MICROSOFT = true; // microsoft support is better now!

    @ObfuscatedName("yq.bp")
    public OpenGL field8079;

    @ObfuscatedName("yq.bi")
    public int field8080;

    @ObfuscatedName("yq.bx")
    public final GlRelated8 field8083;

    @ObfuscatedName("yq.bm")
    public GlEffectList field8082;

    @ObfuscatedName("yq.bb")
    public GlPostProcessing field8093;

    @ObfuscatedName("yq.be")
    public GlColourGradingBloomEffect field8047;

    @ObfuscatedName("yq.bw")
    public GlParticleRenderer field8085 = new GlParticleRenderer();

    @ObfuscatedName("yq.bo")
    public Matrix4x4 field8086 = new Matrix4x4();

    @ObfuscatedName("yq.bh")
    public Matrix4x4 field8087 = new Matrix4x4();

    @ObfuscatedName("yq.by")
    public Matrix4x3 field8089 = new Matrix4x3();

    @ObfuscatedName("yq.bu")
    public GlEffectRelated5 field8090;

    @ObfuscatedName("yq.cl")
    public int field8109;

    @ObfuscatedName("yq.cq")
    public int field8217 = 8;

    @ObfuscatedName("yq.co")
    public int field8092 = 3;

    @ObfuscatedName("yq.cb")
    public boolean field8178 = false;

    @ObfuscatedName("yq.cm")
    public NativeHeap field8094;

    @ObfuscatedName("yq.cw")
    public LinkedList field8170 = new LinkedList();

    @ObfuscatedName("yq.cx")
    public int field8096;

    @ObfuscatedName("yq.cn")
    public int field8157;

    @ObfuscatedName("yq.cf")
    public int field8098;

    @ObfuscatedName("yq.cs")
    public LinkedList field8099 = new LinkedList();

    @ObfuscatedName("yq.cr")
    public LinkedList field8039 = new LinkedList();

    @ObfuscatedName("yq.cp")
    public LinkedList field8198 = new LinkedList();

    @ObfuscatedName("yq.ci")
    public LinkedList field8102 = new LinkedList();

    @ObfuscatedName("yq.ca")
    public LinkedList field8103 = new LinkedList();

    @ObfuscatedName("yq.ch")
    public LinkedList field8194 = new LinkedList();

    @ObfuscatedName("yq.cv")
    public LinkedList field8105 = new LinkedList();

    @ObfuscatedName("yq.ck")
    public long field8078;

    @ObfuscatedName("yq.cd")
    public static int[] field8228 = new int[1000];

    @ObfuscatedName("yq.ce")
    public int field8108;

    @ObfuscatedName("yq.ct")
    public int field8129;

    @ObfuscatedName("yq.cu")
    public int field8110;

    @ObfuscatedName("yq.cc")
    public boolean field8111;

    @ObfuscatedName("yq.cg")
    public boolean field8112;

    @ObfuscatedName("yq.cj")
    public boolean field8113;

    @ObfuscatedName("yq.cy")
    public boolean field8100;

    @ObfuscatedName("yq.cz")
    public Matrix4x3 field8088 = new Matrix4x3();

    @ObfuscatedName("yq.dl")
    public Matrix4x4 field8116 = new Matrix4x4();

    @ObfuscatedName("yq.dj")
    public Matrix4x4 field8117 = new Matrix4x4();

    @ObfuscatedName("yq.dp")
    public Matrix4x4 field8118 = new Matrix4x4();

    @ObfuscatedName("yq.dw")
    public Matrix4x4 field8119 = new Matrix4x4();

    @ObfuscatedName("yq.di")
    public Matrix4x4 field8120 = new Matrix4x4();

    @ObfuscatedName("yq.dg")
    public float[][] field8218 = new float[6][4];

    @ObfuscatedName("yq.do")
    public float[] field8210 = new float[4];

    @ObfuscatedName("yq.db")
    public float field8123;

    @ObfuscatedName("yq.dx")
    public float field8124;

    @ObfuscatedName("yq.dh")
    public float field8125;

    @ObfuscatedName("yq.de")
    public float field8224;

    @ObfuscatedName("yq.dk")
    public float field8127 = 0.0F;

    @ObfuscatedName("yq.du")
    public float field8128 = 1.0F;

    @ObfuscatedName("yq.dz")
    public float field8196 = 0.0F;

    @ObfuscatedName("yq.ds")
    public float field8130 = -1.0F;

    @ObfuscatedName("yq.dc")
    public Matrix4x3 field8077 = new Matrix4x3();

    @ObfuscatedName("yq.dy")
    public Matrix4x4 field8132 = new Matrix4x4();

    @ObfuscatedName("yq.dt")
    public Matrix4x4 field8133 = new Matrix4x4();

    @ObfuscatedName("yq.dd")
    public float[] field8134 = new float[16];

    @ObfuscatedName("yq.da")
    public int field8135;

    @ObfuscatedName("yq.dr")
    public boolean field8201 = true;

    @ObfuscatedName("yq.df")
    public int field8137 = 0;

    @ObfuscatedName("yq.dv")
    public int field8138 = 0;

    @ObfuscatedName("yq.dn")
    public int field8141 = 0;

    @ObfuscatedName("yq.dm")
    public int field8140 = 0;

    @ObfuscatedName("yq.dq")
    public int field8095 = 0;

    @ObfuscatedName("yq.et")
    public int field8091 = 0;

    @ObfuscatedName("yq.eu")
    public int field8220;

    @ObfuscatedName("yq.eg")
    public int field8144;

    @ObfuscatedName("yq.ev")
    public int field8139;

    @ObfuscatedName("yq.er")
    public int field8146;

    @ObfuscatedName("yq.eq")
    public static int field8147 = 4;

    @ObfuscatedName("yq.en")
    public boolean field8148;

    @ObfuscatedName("yq.ez")
    public boolean field8219;

    @ObfuscatedName("yq.eh")
    public float[] field8150 = new float[4];

    @ObfuscatedName("yq.ed")
    public float[] field8070 = new float[4];

    @ObfuscatedName("yq.ee")
    public float[] field8145 = new float[4];

    @ObfuscatedName("yq.es")
    public float[] field8153 = new float[4];

    @ObfuscatedName("yq.ej")
    public int field8154 = -1;

    @ObfuscatedName("yq.ew")
    public float field8136 = 1.0F;

    @ObfuscatedName("yq.el")
    public float field8156 = 1.0F;

    @ObfuscatedName("yq.ei")
    public float field8179 = 1.0F;

    @ObfuscatedName("yq.eo")
    public float field8158;

    @ObfuscatedName("yq.ef")
    public float field8159 = -1.0F;

    @ObfuscatedName("yq.ex")
    public float field8121 = -1.0F;

    @ObfuscatedName("yq.eb")
    public Light[] field8161 = new Light[field8147];

    @ObfuscatedName("yq.ec")
    public int field8162;

    @ObfuscatedName("yq.ea")
    public int field8163;

    @ObfuscatedName("yq.em")
    public int field8164;

    @ObfuscatedName("yq.ey")
    public int field8165;

    @ObfuscatedName("yq.ek")
    public boolean field8166;

    @ObfuscatedName("yq.ep")
    public int field8167 = -1;

    @ObfuscatedName("yq.fd")
    public int field8168 = -1;

    @ObfuscatedName("yq.fr")
    public int field8169 = 0;

    @ObfuscatedName("yq.fa")
    public float field8142;

    @ObfuscatedName("yq.fc")
    public float field8171;

    @ObfuscatedName("yq.fp")
    public float field8172 = 1.0F;

    @ObfuscatedName("yq.fv")
    public float field8173 = 0.0F;

    @ObfuscatedName("yq.fn")
    public boolean field8174;

    @ObfuscatedName("yq.fl")
    public boolean field8175 = false;

    @ObfuscatedName("yq.ff")
    public int field8143;

    @ObfuscatedName("yq.fx")
    public WaterFogData field8177;

    @ObfuscatedName("yq.fy")
    public GlBinding field8203;

    @ObfuscatedName("yq.fj")
    public GlInterfaceRelated field8061;

    @ObfuscatedName("yq.fo")
    public int field8180;

    @ObfuscatedName("yq.fm")
    public int field8190 = 8448;

    @ObfuscatedName("yq.fk")
    public int field8182 = 8448;

    @ObfuscatedName("yq.fg")
    public boolean field8183;

    @ObfuscatedName("yq.fu")
    public int field8076;

    @ObfuscatedName("yq.fh")
    public GlTexture[] field8185;

    @ObfuscatedName("yq.fz")
    public GlRelated2 field8186;

    @ObfuscatedName("yq.fi")
    public GlEnvironmentSampler field8187;

    @ObfuscatedName("yq.fb")
    public GlGraphicRelated field8204;

    @ObfuscatedName("yq.fw")
    public String field8036;

    @ObfuscatedName("yq.fs")
    public String field8084;

    @ObfuscatedName("yq.fe")
    public boolean field8191;

    @ObfuscatedName("yq.fq")
    public int field8192;

    @ObfuscatedName("yq.ft")
    public boolean field8149;

    @ObfuscatedName("yq.gw")
    public boolean field8199;

    @ObfuscatedName("yq.gn")
    public int field8195;

    @ObfuscatedName("yq.gp")
    public int field8052;

    @ObfuscatedName("yq.gq")
    public int field8197;

    @ObfuscatedName("yq.gz")
    public boolean field8176;

    @ObfuscatedName("yq.gk")
    public boolean field8122;

    @ObfuscatedName("yq.gc")
    public boolean field8200;

    @ObfuscatedName("yq.gm")
    public boolean field8126;

    @ObfuscatedName("yq.gh")
    public boolean field8202;

    @ObfuscatedName("yq.ge")
    public boolean field8181;

    @ObfuscatedName("yq.gr")
    public boolean field8049;

    @ObfuscatedName("yq.gf")
    public boolean field8205;

    @ObfuscatedName("yq.gl")
    public boolean field8206;

    @ObfuscatedName("yq.gb")
    public boolean field8207;

    @ObfuscatedName("yq.go")
    public boolean field8208;

    @ObfuscatedName("yq.gi")
    public boolean field8209;

    @ObfuscatedName("yq.ga")
    public boolean field8151;

    @ObfuscatedName("yq.gs")
    public boolean field8184;

    @ObfuscatedName("yq.gd")
    public boolean field8212;

    @ObfuscatedName("yq.gj")
    public boolean field8213;

    @ObfuscatedName("yq.gu")
    public boolean field8214;

    @ObfuscatedName("yq.gg")
    public final int field8215;

    @ObfuscatedName("yq.gy")
    public float field8216 = -1.0F;

    @ObfuscatedName("yq.gt")
    public float field8073 = -1.0F;

    @ObfuscatedName("yq.gx")
    public GlModel[] field8115 = new GlModel[7];

    @ObfuscatedName("yq.gv")
    public GlModel[] field8188 = new GlModel[7];

    @ObfuscatedName("yq.he")
    public GlFramebuffer field8152;

    @ObfuscatedName("yq.hk")
    public GlRelated1 field8221;

    @ObfuscatedName("yq.hy")
    public GlRelated1 field8211;

    @ObfuscatedName("yq.ho")
    public GlInterfaceRelated field8223;

    @ObfuscatedName("yq.hh")
    public static final float[] field8067 = new float[4];

    @ObfuscatedName("yq.hm")
    public static final float[] field8225 = new float[4];

    @ObfuscatedName("yq.hq")
    public GpuPacket field8226 = new GpuPacket(8192);

    @ObfuscatedName("yq.hx")
    public int[] field8041 = new int[1];

    @ObfuscatedName("yq.hs")
    public int[] field8059 = new int[1];

    @ObfuscatedName("yq.ha")
    public int[] field8229 = new int[1];

    @ObfuscatedName("yq.hb")
    public final byte[] field8230 = new byte[16384];

    public GlToolkit(Canvas arg0, MaterialTypeList arg1, int arg2) {
        super(arg1);
        try {
            this.field8080 = arg2;
            if (!NativeLibraries.method11710().method6800("jaclib")) {
                throw new RuntimeException("");
            } else if (NativeLibraries.method11710().method6800("jaggl")) {
                this.field8079 = new OpenGL();
                long var4 = this.field8079.init(arg0, 8, 8, 8, 24, 0, this.field8080);
                if (var4 == 0L) {
                    throw new RuntimeException("");
                }
                this.method13348();
                int var6 = this.method13264();
                if (var6 != 0) {
                    throw new RuntimeException("");
                }
                this.field8215 = this.field8149 ? 33639 : 5121;
                if (this.field8084.indexOf("radeon") != -1) {
                    int var7 = 0;
                    boolean var8 = false;
                    boolean var9 = false;
                    String[] var10 = StringTools.method11508(this.field8084.replace('/', ' '), ' ');
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        String var12 = var10[var11];
                        try {
                            if (var12.length() > 0) {
                                if (var12.charAt(0) == 'x' && var12.length() >= 3 && StringTools.method7735(var12.substring(1, 3))) {
                                    var12 = var12.substring(1);
                                    var9 = true;
                                }
                                if (var12.equals("hd")) {
                                    var8 = true;
                                } else {
                                    if (var12.startsWith("hd")) {
                                        var12 = var12.substring(2);
                                        var8 = true;
                                    }
                                    if (var12.length() >= 4 && StringTools.method7735(var12.substring(0, 4))) {
                                        var7 = StringTools.parseInt(var12.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var18) {
                        }
                    }
                    if (!var9 && !var8) {
                        if (var7 >= 7000 && var7 <= 7999) {
                            this.field8181 = false;
                        }
                        if (var7 >= 7000 && var7 <= 9250) {
                            this.field8205 = false;
                        }
                    }
                    if (!var8 || var7 < 4000) {
                        this.field8209 = false;
                    }
                    this.field8208 &= this.field8079.method0("GL_ARB_half_float_pixel");
                    this.field8049 = this.field8181;
                    this.field8191 = true;
                }
                if (this.field8036.indexOf("intel") != -1) {
                    this.field8176 = false;
                }
                this.field8214 = !this.field8036.equals("s3 graphics");
                if (this.field8181) {
                    try {
                        int[] var14 = new int[1];
                        OpenGL.glGenBuffersARB(1, var14, 0);
                    } catch (Throwable var17) {
                        throw new RuntimeException("");
                    }
                }
                ColourUtils.method8092(false, true);
                this.field8178 = true;
                this.field8083 = new GlRelated8(this, this.field400);
                this.method13475();
                this.field8090 = new GlEffectRelated5(this);
                this.field8093 = new GlPostProcessing(this);
                if (this.field8093.method2298()) {
                    this.field8047 = new GlColourGradingBloomEffect(this);
                    if (!this.field8047.method16224()) {
                        this.field8047.method14820();
                        this.field8047 = null;
                    }
                }
                this.method460(arg0, new GlSurface(this, arg0, var4));
                this.method462(arg0);
                this.field8082 = new GlEffectList(this);
                this.method13265();
                this.method587();
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var19) {
            var19.printStackTrace();
            this.method442();
            if (var19 instanceof OutOfMemoryError) {
                throw (OutOfMemoryError) var19;
            }
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("yq.d()V")
    public void method13348() {
        int var1 = 0;
        while (!this.field8079.method1()) {
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            PreciseSleep.method7052(1000L);
        }
    }

    @ObfuscatedName("yq.n()I")
    public int method13264() {
        int var1 = 0;
        this.field8036 = OpenGL.glGetString(7936).toLowerCase();
        this.field8084 = OpenGL.glGetString(7937).toLowerCase();
        if (!GlToolkit.ALLOW_MICROSOFT && this.field8036.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (this.field8036.indexOf("brian paul") != -1 || this.field8036.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var2 = OpenGL.glGetString(7938);
        String[] var3 = StringTools.method11508(var2.replace('.', ' '), ' ');
        if (var3.length >= 2) {
            try {
                int var4 = StringTools.parseInt(var3[0]);
                int var5 = StringTools.parseInt(var3[1]);
                this.field8192 = var4 * 10 + var5;
            } catch (NumberFormatException var8) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field8192 < 12) {
            var1 |= 0x2;
        }
        if (!this.field8079.method0("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field8079.method0("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field8195 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field8052 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field8197 = var7[0];
        if (this.field8195 < 2 || this.field8052 < 2 || this.field8197 < 2) {
            var1 |= 0x10;
        }
        this.field8149 = Stream.method42();
        this.field8181 = this.field8079.method0("GL_ARB_vertex_buffer_object");
        this.field8126 = this.field8079.method0("GL_ARB_multisample");
        this.field8184 = this.field8079.method0("GL_ARB_vertex_program");
        this.field8079.method0("GL_ARB_fragment_program");
        this.field8212 = this.field8079.method0("GL_ARB_vertex_shader");
        this.field8213 = this.field8079.method0("GL_ARB_fragment_shader");
        this.field8205 = this.field8079.method0("GL_EXT_texture3D");
        this.field8208 = this.field8079.method0("GL_ARB_texture_rectangle");
        this.field8206 = this.field8079.method0("GL_ARB_texture_cube_map");
        this.field8207 = this.field8079.method0("GL_ARB_seamless_cube_map");
        this.field8209 = this.field8079.method0("GL_ARB_texture_float");
        this.field8151 = false;
        this.field8176 = this.field8079.method0("GL_EXT_framebuffer_object");
        this.field8122 = this.field8079.method0("GL_EXT_framebuffer_blit");
        this.field8200 = this.field8079.method0("GL_EXT_framebuffer_multisample");
        this.field8202 = this.field8122 & this.field8200;
        this.field8199 = NativeLibraryConfig.field7296.startsWith("mac");
        OpenGL.glGetFloatv(2834, field8067, 0);
        this.field8073 = field8067[0];
        this.field8216 = field8067[1];
        return var1 == 0 ? 0 : var1;
    }

    @ObfuscatedName("yq.q()V")
    public void method13475() {
        this.field8185 = new GlTexture[this.field8195];
        this.field8186 = new GlRelated2(this, 3553, TextureFormat.field1296, DataType.field1501, 1, 1);
        new GlRelated2(this, 3553, TextureFormat.field1296, DataType.field1501, 1, 1);
        new GlRelated2(this, 3553, TextureFormat.field1296, DataType.field1501, 1, 1);
        for (int var1 = 0; var1 < 7; var1++) {
            this.field8115[var1] = new GlModel(this);
            this.field8188[var1] = new GlModel(this);
        }
        if (this.field8176) {
            this.field8152 = new GlFramebuffer(this);
            new GlFramebuffer(this);
        }
    }

    @ObfuscatedName("yq.x()V")
    public void method13265() {
        this.method13312(-2);
        for (int var1 = this.field8195 - 1; var1 >= 0; var1--) {
            this.method13314(var1);
            this.method13315(null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method13271(8448, 8448);
        this.method13318(2, 34168, 770);
        this.method13362();
        this.field8129 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field8110 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field8112 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field8111 = true;
        this.method13321(true);
        this.method13322(true);
        this.method13364(true);
        this.method13325(true);
        this.GA(0.0F, 1.0F);
        this.method13324();
        this.field8079.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
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
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        if (this.field8207) {
            OpenGL.glEnable(34895);
        }
        this.field8167 = -1;
        this.field8154 = -1;
        this.method490();
        this.L();
    }

    @ObfuscatedName("yq.t()Lcg;")
    public RendererInfo method456() {
        int var1 = -1;
        if (this.field8036.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field8036.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (this.field8036.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new RendererInfo(var1, "OpenGL", this.field8192, this.field8084, 0L);
    }

    @ObfuscatedName("yq.f(II)V")
    public void method653(int arg0, int arg1) throws RendererException {
        try {
            this.field415.method918();
        } catch (Exception var4) {
        }
        if (this.field400 != null) {
            this.field400.method890();
        }
    }

    @ObfuscatedName("yq.z()V")
    public void method441() {
        OpenGL.glFinish();
    }

    @ObfuscatedName("yq.w()V")
    public void method443() {
        for (Node var1 = this.field8170.head(); var1 != null; var1 = this.field8170.next()) {
            ((GlHeap) var1).method16226();
        }
        if (this.field8093 != null) {
            this.field8093.method2297();
        }
        if (this.field8178) {
            ColourUtils.method2790(false, true);
            this.field8178 = false;
        }
    }

    @ObfuscatedName("yq.i()Z")
    public boolean method629() {
        return true;
    }

    @ObfuscatedName("yq.v()Z")
    public boolean method447() {
        return true;
    }

    @ObfuscatedName("yq.g()Z")
    public boolean method448() {
        return true;
    }

    @ObfuscatedName("yq.ay()Z")
    public boolean method450() {
        return this.field8047 != null && (this.field8080 <= 1 || this.field8202);
    }

    @ObfuscatedName("yq.af()Z")
    public boolean method451() {
        return true;
    }

    @ObfuscatedName("yq.e()Z")
    public boolean method449() {
        return true;
    }

    @ObfuscatedName("yq.ar()Z")
    public boolean method452() {
        return this.field8126 && (!this.isBloomEnabled() || this.field8202);
    }

    @ObfuscatedName("yq.an()Z")
    public boolean method765() {
        return true;
    }

    @ObfuscatedName("yq.k()Z")
    public boolean method13269() {
        return this.field8082.method2220(3);
    }

    @ObfuscatedName("yq.ap()Z")
    public boolean method454() {
        return true;
    }

    @ObfuscatedName("yq.ag()Z")
    public boolean method455() {
        return false;
    }

    @ObfuscatedName("yq.ak(Ljava/awt/Canvas;II)Lya;")
    public Surface method735(Canvas arg0, int arg1, int arg2) {
        return new GlSurface(this, arg0);
    }

    @ObfuscatedName("yq.h()V")
    public void method13462() {
        this.method13270();
    }

    @ObfuscatedName("yq.y()V")
    public void method13270() {
        int var1 = this.field412.method921();
        int var2 = this.field412.method922();
        this.field8119.method5393(0.0F, (float) var1, 0.0F, (float) var2, -1.0F, 1.0F);
        this.method490();
        this.method13324();
        this.L();
    }

    @ObfuscatedName("yq.ae(IIII)[I")
    public int[] ae(int arg0, int arg1, int arg2, int arg3) {
        if (this.field412 == null) {
            return null;
        }
        int[] var5 = new int[arg2 * arg3];
        int var6 = this.field412.method922();
        for (int var7 = 0; var7 < arg3; var7++) {
            OpenGL.glReadPixelsi(arg0, var6 - arg1 - var7 - 1, arg2, 1, 32993, this.field8215, var5, arg2 * var7);
        }
        return var5;
    }

    @ObfuscatedName("yq.ac()V")
    public void method587() {
        if (!this.field8214 || this.field412 == null) {
            return;
        }
        int var1 = this.field8141;
        int var2 = this.field8140;
        int var3 = this.field8137;
        int var4 = this.field8138;
        this.L();
        int var5 = this.field8220;
        int var6 = this.field8144;
        int var7 = this.field8139;
        int var8 = this.field8146;
        this.method490();
        OpenGL.glReadBuffer(1028);
        OpenGL.glDrawBuffer(1029);
        this.method13324();
        this.method13321(false);
        this.method13322(false);
        this.method13364(false);
        this.method13325(false);
        this.method13315(null);
        this.method13312(-2);
        this.method13316(1);
        this.method13327(0);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glRasterPos2i(0, 0);
        OpenGL.glCopyPixels(0, 0, this.field412.method921(), this.field412.method922(), 6144);
        OpenGL.glFlush();
        OpenGL.glReadBuffer(1029);
        OpenGL.glDrawBuffer(1029);
        this.r(var1, var3, var2, var4);
        this.method474(var5, var6, var7, var8);
    }

    @ObfuscatedName("yq.ba(II)V")
    public void ba(int arg0, int arg1) {
        int var3 = 0;
        if ((arg0 & 0x1) != 0) {
            OpenGL.glClearColor((float) (arg1 & 0xFF0000) / 1.671168E7F, (float) (arg1 & 0xFF00) / 65280.0F, (float) (arg1 & 0xFF) / 255.0F, (float) (arg1 >>> 24) / 255.0F);
            var3 = 16384;
        }
        if ((arg0 & 0x2) != 0) {
            this.method13325(true);
            var3 |= 0x100;
        }
        if ((arg0 & 0x4) != 0) {
            var3 |= 0x400;
        }
        OpenGL.glClear(var3);
    }

    @ObfuscatedName("yq.bl(IIIIII)V")
    public void drawRectangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method13308();
        this.method13327(arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8126) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8126) {
            OpenGL.glEnable(32925);
        }
    }

    @ObfuscatedName("yq.B(IIIIII)V")
    public void B(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method13308();
        this.method13327(arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8126) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8126) {
            OpenGL.glEnable(32925);
        }
    }

    @ObfuscatedName("yq.N(IIIIII[BII)V")
    public void N(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field8204 == null || this.field8204.field7440 < arg2 || this.field8204.field7441 < arg3) {
            this.field8204 = GlGraphicRelated.method15975(this, TextureFormat.field1297, DataType.field1501, arg2, arg3, false, arg6, TextureFormat.field1297);
            this.field8204.method12765(false, false);
            var10 = this.field8204.field9911;
            var11 = this.field8204.field9912;
        } else {
            this.field8204.method12769(0, 0, arg2, arg3, arg6, TextureFormat.field1297, 0, 0, false);
            var10 = (float) arg3 * this.field8204.field9911 / (float) this.field8204.field7441;
            var11 = (float) arg2 * this.field8204.field9912 / (float) this.field8204.field7440;
        }
        this.method13309();
        this.method13315(this.field8204);
        this.method13327(arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method13319(arg5);
        this.method13271(34165, 34165);
        this.method13318(0, 34166, 768);
        this.method13318(2, 5890, 770);
        this.method13267(0, 34166, 770);
        this.method13267(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method13318(0, 5890, 768);
        this.method13318(2, 34166, 770);
        this.method13267(0, 5890, 770);
        this.method13267(2, 34166, 770);
    }

    @ObfuscatedName("yq.bk(IIFIIFIIFIIII)V")
    public void method491(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method13308();
        this.method13327(arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, arg8);
        OpenGL.glEnd();
    }

    @ObfuscatedName("yq.CA(IIIII)V")
    public void CA(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (arg0 + arg2 < this.field8141 || arg0 - arg2 > this.field8140 || arg1 + arg2 < this.field8137 || arg1 - arg2 > this.field8138) {
            return;
        }
        this.method13308();
        this.method13327(arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        int var8 = arg2 << 1;
        if ((float) var8 < this.field8073) {
            OpenGL.glBegin(7);
            OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
            OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
            OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
            OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
            OpenGL.glEnd();
        } else if ((float) var8 <= this.field8216) {
            OpenGL.glEnable(2832);
            OpenGL.glPointSize((float) var8);
            OpenGL.glBegin(0);
            OpenGL.glVertex2f(var6, var7);
            OpenGL.glEnd();
            OpenGL.glDisable(2832);
        } else {
            OpenGL.glBegin(6);
            OpenGL.glVertex2f(var6, var7);
            int var9 = 262144 / (arg2 * 6);
            if (var9 <= 64) {
                var9 = 64;
            } else if (var9 > 512) {
                var9 = 512;
            }
            int var10 = IntMath.method1962(var9);
            OpenGL.glVertex2f((float) arg2 + var6, var7);
            for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                OpenGL.glVertex2f(GlTrig.field1146[var11] * (float) arg2 + var6, GlTrig.field1147[var11] * (float) arg2 + var7);
            }
            OpenGL.glVertex2f((float) arg2 + var6, var7);
            OpenGL.glEnd();
        }
    }

    @ObfuscatedName("yq.XA(IIIII)V")
    public void XA(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method13308();
        this.method13327(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @ObfuscatedName("yq.G(IIIII)V")
    public void G(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method13308();
        this.method13327(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @ObfuscatedName("yq.bs(IIIIII)V")
    public void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method13308();
        this.method13327(arg5);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @ObfuscatedName("yq.bd(IIIIIIIII)V")
    public void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 == arg2 && arg1 == arg3) {
            return;
        }
        this.method13308();
        this.method13327(arg5);
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) arg3 - (float) arg1;
        float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
        float var13 = var10 * var12;
        float var14 = var11 * var12;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        int var15 = arg8 % (arg6 + arg7);
        float var16 = (float) arg6 * var13;
        float var17 = (float) arg6 * var14;
        float var18 = 0.0F;
        float var19 = 0.0F;
        float var20 = var16;
        float var21 = var17;
        if (var15 > arg6) {
            var18 = (float) (arg6 + arg7 - var15) * var13;
            var19 = (float) (arg6 + arg7 - var15) * var14;
        } else {
            var20 = (float) (arg6 - var15) * var13;
            var21 = (float) (arg6 - var15) * var14;
        }
        float var22 = (float) arg0 + 0.35F + var18;
        float var23 = (float) arg1 + 0.35F + var19;
        float var24 = (float) arg7 * var13;
        float var25 = (float) arg7 * var14;
        while (true) {
            if (arg2 > arg0) {
                if (var22 > (float) arg2 + 0.35F) {
                    break;
                }
                if (var20 + var22 > (float) arg2) {
                    var20 = (float) arg2 - var22;
                }
            } else {
                if (var22 < (float) arg2 + 0.35F) {
                    break;
                }
                if (var20 + var22 < (float) arg2) {
                    var20 = (float) arg2 - var22;
                }
            }
            if (arg3 > arg1) {
                if (var23 > (float) arg3 + 0.35F) {
                    break;
                }
                if (var21 + var23 > (float) arg3) {
                    var21 = (float) arg3 - var23;
                }
            } else {
                if (var23 < (float) arg3 + 0.35F) {
                    break;
                }
                if (var21 + var23 < (float) arg3) {
                    var21 = (float) arg3 - var23;
                }
            }
            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var22, var23);
            OpenGL.glVertex2f(var20 + var22, var21 + var23);
            OpenGL.glEnd();
            var22 += var20 + var24;
            var23 += var21 + var25;
            var20 = var16;
            var21 = var17;
        }
    }

    @ObfuscatedName("yq.bn(IIIIIILta;II)V")
    public void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, GraphicsRelated arg6, int arg7, int arg8) {
        GlGraphicRelated2 var10 = (GlGraphicRelated2) arg6;
        GlGraphicRelated var11 = var10.field7651;
        this.method13309();
        this.method13315(var10.field7651);
        this.method13327(arg5);
        this.method13271(7681, 8448);
        this.method13318(0, 34167, 768);
        float var12 = var11.field9912 / (float) var11.field9910;
        float var13 = var11.field9911 / (float) var11.field9909;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method13318(0, 5890, 768);
    }

    @ObfuscatedName("yq.bc(IIIIIILta;IIIII)V")
    public void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, GraphicsRelated arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg0 == arg2 && arg1 == arg3) {
            return;
        }
        GlGraphicRelated2 var13 = (GlGraphicRelated2) arg6;
        GlGraphicRelated var14 = var13.field7651;
        this.method13309();
        this.method13315(var13.field7651);
        this.method13327(arg5);
        this.method13271(7681, 8448);
        this.method13318(0, 34167, 768);
        float var15 = var14.field9912 / (float) var14.field9910;
        float var16 = var14.field9911 / (float) var14.field9909;
        float var17 = (float) arg2 - (float) arg0;
        float var18 = (float) arg3 - (float) arg1;
        float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
        float var20 = var17 * var19;
        float var21 = var18 * var19;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        int var22 = arg11 % (arg9 + arg10);
        float var23 = (float) arg9 * var20;
        float var24 = (float) arg9 * var21;
        float var25 = 0.0F;
        float var26 = 0.0F;
        float var27 = var23;
        float var28 = var24;
        if (var22 > arg9) {
            var25 = (float) (arg9 + arg10 - var22) * var20;
            var26 = (float) (arg9 + arg10 - var22) * var21;
        } else {
            var27 = (float) (arg9 - var22) * var20;
            var28 = (float) (arg9 - var22) * var21;
        }
        float var29 = (float) arg0 + 0.35F + var25;
        float var30 = (float) arg1 + 0.35F + var26;
        float var31 = (float) arg10 * var20;
        float var32 = (float) arg10 * var21;
        while (true) {
            if (arg2 > arg0) {
                if (var29 > (float) arg2 + 0.35F) {
                    break;
                }
                if (var27 + var29 > (float) arg2) {
                    var27 = (float) arg2 - var29;
                }
            } else {
                if (var29 < (float) arg2 + 0.35F) {
                    break;
                }
                if (var27 + var29 < (float) arg2) {
                    var27 = (float) arg2 - var29;
                }
            }
            if (arg3 > arg1) {
                if (var30 > (float) arg3 + 0.35F) {
                    break;
                }
                if (var28 + var30 > (float) arg3) {
                    var28 = (float) arg3 - var30;
                }
            } else {
                if (var30 < (float) arg3 + 0.35F) {
                    break;
                }
                if (var28 + var30 < (float) arg3) {
                    var28 = (float) arg3 - var30;
                }
            }
            OpenGL.glBegin(1);
            OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, (var30 - (float) arg8) * var16);
            OpenGL.glVertex2f(var29, var30);
            OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 - (float) arg8) * var16);
            OpenGL.glVertex2f(var27 + var29, var28 + var30);
            OpenGL.glEnd();
            var29 += var27 + var31;
            var30 += var28 + var32;
            var27 = var23;
            var28 = var24;
        }
        this.method13318(0, 5890, 768);
    }

    @ObfuscatedName("yq.br(IIIIIII)V")
    public void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        this.method825(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @ObfuscatedName("yq.do(FFF[F)V")
    public void method550(float arg0, float arg1, float arg2, float[] arg3) {
        float var5 = this.field8120.entries[11] * arg2 + this.field8120.entries[7] * arg1 + this.field8120.entries[3] * arg0 + this.field8120.entries[15];
        float var6 = this.field8120.entries[8] * arg2 + this.field8120.entries[4] * arg1 + this.field8120.entries[0] * arg0 + this.field8120.entries[12];
        float var7 = this.field8120.entries[9] * arg2 + this.field8120.entries[5] * arg1 + this.field8120.entries[1] * arg0 + this.field8120.entries[13];
        float var8 = this.field8116.entries[10] * arg2 + this.field8116.entries[6] * arg1 + this.field8116.entries[2] * arg0 + this.field8116.entries[14];
        arg3[0] = this.field8124 * var6 / var5 + this.field8123;
        arg3[1] = this.field8224 * var7 / var5 + this.field8125;
        arg3[2] = var8;
    }

    @ObfuscatedName("yq.dg(FFF[F)V")
    public void method567(float arg0, float arg1, float arg2, float[] arg3) {
        float var5 = this.field8120.entries[10] * arg2 + this.field8120.entries[6] * arg1 + this.field8120.entries[2] * arg0 + this.field8120.entries[14];
        float var6 = this.field8120.entries[11] * arg2 + this.field8120.entries[7] * arg1 + this.field8120.entries[3] * arg0 + this.field8120.entries[15];
        if (var5 < -var6 || var5 > var6) {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
            return;
        }
        float var7 = this.field8120.entries[8] * arg2 + this.field8120.entries[4] * arg1 + this.field8120.entries[0] * arg0 + this.field8120.entries[12];
        if (var7 < -var6 || var7 > var6) {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
            return;
        }
        float var8 = this.field8120.entries[9] * arg2 + this.field8120.entries[5] * arg1 + this.field8120.entries[1] * arg0 + this.field8120.entries[13];
        if (var8 < -var6 || var8 > var6) {
            arg3[2] = Float.NaN;
            arg3[1] = Float.NaN;
            arg3[0] = Float.NaN;
        } else {
            float var9 = this.field8116.entries[10] * arg2 + this.field8116.entries[6] * arg1 + this.field8116.entries[2] * arg0 + this.field8116.entries[14];
            arg3[0] = this.field8124 * var7 / var6 + this.field8123;
            arg3[1] = this.field8224 * var8 / var6 + this.field8125;
            arg3[2] = var9;
        }
    }

    @ObfuscatedName("yq.bp(IIIIII)I")
    public int method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 0;
        float var8 = this.field8120.entries[10] * (float) arg2 + this.field8120.entries[6] * (float) arg1 + this.field8120.entries[2] * (float) arg0 + this.field8120.entries[14];
        float var9 = this.field8120.entries[10] * (float) arg5 + this.field8120.entries[6] * (float) arg4 + this.field8120.entries[2] * (float) arg3 + this.field8120.entries[14];
        float var10 = this.field8120.entries[11] * (float) arg2 + this.field8120.entries[7] * (float) arg1 + this.field8120.entries[3] * (float) arg0 + this.field8120.entries[15];
        float var11 = this.field8120.entries[11] * (float) arg5 + this.field8120.entries[7] * (float) arg4 + this.field8120.entries[3] * (float) arg3 + this.field8120.entries[15];
        if (var8 < -var10 && var9 < -var11) {
            var7 |= 0x10;
        } else if (var8 > var10 && var9 > var11) {
            var7 |= 0x20;
        }
        float var12 = this.field8120.entries[8] * (float) arg2 + this.field8120.entries[4] * (float) arg1 + this.field8120.entries[0] * (float) arg0 + this.field8120.entries[12];
        float var13 = this.field8120.entries[8] * (float) arg5 + this.field8120.entries[4] * (float) arg4 + this.field8120.entries[0] * (float) arg3 + this.field8120.entries[12];
        if (var12 < -var10 && var13 < -var11) {
            var7 |= 0x1;
        }
        if (var12 > var10 && var13 > var11) {
            var7 |= 0x2;
        }
        float var14 = this.field8120.entries[9] * (float) arg2 + this.field8120.entries[5] * (float) arg1 + this.field8120.entries[1] * (float) arg0 + this.field8120.entries[13];
        float var15 = this.field8120.entries[9] * (float) arg5 + this.field8120.entries[5] * (float) arg4 + this.field8120.entries[1] * (float) arg3 + this.field8120.entries[13];
        if (var14 < -var10 && var15 < -var11) {
            var7 |= 0x4;
        }
        if (var14 > var10 && var15 > var11) {
            var7 |= 0x8;
        }
        return var7;
    }

    @ObfuscatedName("yq.bi(I)Lv;")
    public Heap method593(int arg0) {
        GlHeap var2 = new GlHeap(arg0);
        this.field8170.addTail(var2);
        return var2;
    }

    @ObfuscatedName("yq.bx(Lv;)V")
    public void method502(Heap arg0) {
        this.field8094 = ((GlHeap) arg0).field10173;
        if (this.field8223 != null) {
            return;
        }
        GpuPacket var2 = new GpuPacket(80);
        if (this.field8149) {
            var2.method16851(-1.0F);
            var2.method16851(-1.0F);
            var2.method16851(0.0F);
            var2.method16851(0.0F);
            var2.method16851(0.0F);
            var2.method16851(-1.0F);
            var2.method16851(1.0F);
            var2.method16851(0.0F);
            var2.method16851(0.0F);
            var2.method16851(1.0F);
            var2.method16851(1.0F);
            var2.method16851(1.0F);
            var2.method16851(0.0F);
            var2.method16851(1.0F);
            var2.method16851(1.0F);
            var2.method16851(1.0F);
            var2.method16851(-1.0F);
            var2.method16851(0.0F);
            var2.method16851(1.0F);
            var2.method16851(0.0F);
        } else {
            var2.method16855(-1.0F);
            var2.method16855(-1.0F);
            var2.method16855(0.0F);
            var2.method16855(0.0F);
            var2.method16855(0.0F);
            var2.method16855(-1.0F);
            var2.method16855(1.0F);
            var2.method16855(0.0F);
            var2.method16855(0.0F);
            var2.method16855(1.0F);
            var2.method16855(1.0F);
            var2.method16855(1.0F);
            var2.method16855(0.0F);
            var2.method16855(1.0F);
            var2.method16855(1.0F);
            var2.method16855(1.0F);
            var2.method16855(-1.0F);
            var2.method16855(0.0F);
            var2.method16855(1.0F);
            var2.method16855(0.0F);
        }
        this.field8223 = this.method13301(20, var2.data, var2.pos, false);
        this.field8221 = new GlRelated1(this.field8223, 5126, 3, 0);
        this.field8211 = new GlRelated1(this.field8223, 5126, 2, 12);
        this.field8085.method2263(this);
    }

    @ObfuscatedName("yq.bb(IIZZ)Lce;")
    public Sprite method658(int arg0, int arg1, boolean arg2, boolean arg3) {
        return new GlSprite(this, arg0, arg1, arg2);
    }

    @ObfuscatedName("yq.bo(Lds;Z)Lce;")
    public Sprite method517(SpriteData arg0, boolean arg1) {
        int[] var3 = arg0.method2735(false);
        Sprite var4 = this.method506(var3, 0, arg0.method2721(), arg0.method2721(), arg0.method2763());
        var4.method1036(arg0.method2722(), arg0.method2724(), arg0.method2732(), arg0.method2734());
        return var4;
    }

    @ObfuscatedName("yq.be([IIIIIZ)Lce;")
    public Sprite method513(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new GlSprite(this, arg3, arg4, arg0, arg1, arg2);
    }

    @ObfuscatedName("yq.bh(IIIIZ)Lce;")
    public Sprite method508(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new GlSprite(this, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("yq.cq(II[I[I)Lta;")
    public GraphicsRelated method571(int arg0, int arg1, int[] arg2, int[] arg3) {
        return GlGraphicRelated2.method12942(this, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("yq.DA(ILta;II)V")
    public void DA(int arg0, GraphicsRelated arg1, int arg2, int arg3) {
        GlGraphicRelated2 var5 = (GlGraphicRelated2) arg1;
        GlGraphicRelated var6 = var5.field7651;
        this.method13309();
        this.method13315(var5.field7651);
        this.method13327(1);
        this.method13271(7681, 8448);
        this.method13318(0, 34167, 768);
        float var7 = var6.field9912 / (float) var6.field9910;
        float var8 = var6.field9911 / (float) var6.field9909;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field8141 - arg2) * var7, (float) (this.field8137 - arg3) * var8);
        OpenGL.glVertex2i(this.field8141, this.field8137);
        OpenGL.glTexCoord2f((float) (this.field8141 - arg2) * var7, (float) (this.field8138 - arg3) * var8);
        OpenGL.glVertex2i(this.field8141, this.field8138);
        OpenGL.glTexCoord2f((float) (this.field8140 - arg2) * var7, (float) (this.field8138 - arg3) * var8);
        OpenGL.glVertex2i(this.field8140, this.field8138);
        OpenGL.glTexCoord2f((float) (this.field8140 - arg2) * var7, (float) (this.field8137 - arg3) * var8);
        OpenGL.glVertex2i(this.field8140, this.field8137);
        OpenGL.glEnd();
        this.method13318(0, 5890, 768);
    }

    @ObfuscatedName("yq.co(Lvm;[Lzv;Z)Ll;")
    public Font createFont(FontMetrics arg0, PalettedSpriteData[] arg1, boolean arg2) {
        return new GlFont(this, arg0, arg1, arg2);
    }

    @ObfuscatedName("yq.cw(I)V")
    public void method673(int arg0) {
    }

    @ObfuscatedName("yq.cx(Ldw;IIII)Lqa;")
    public Model createModel(ModelUnlit arg0, int arg1, int arg2, int arg3, int arg4) {
        return new GlModel(this, arg0, arg1, arg3, arg4, arg2);
    }

    @ObfuscatedName("yq.cn(II)I")
    public int method519(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @ObfuscatedName("yq.cf(II)I")
    public int method520(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @ObfuscatedName("yq.cs(II[[I[[IIII)Lxa;")
    public FloorModel method521(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new GlFloorModel(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("yq.cb()Lka;")
    public Matrix4x4 method781() {
        return this.field8086;
    }

    @ObfuscatedName("yq.cm()Lkc;")
    public Matrix4x3 method516() {
        return this.field8089;
    }

    @ObfuscatedName("yq.cp(Ldp;)V")
    public void method733(ParticleList arg0) {
        this.field8085.method2264(this, arg0);
    }

    @ObfuscatedName("yq.dw(ILdk;)V")
    public void method503(int arg0, WaterFogData arg1) {
        this.field8143 = arg0;
        this.field8177 = arg1;
        this.field8174 = true;
    }

    @ObfuscatedName("yq.di(ILdk;)V")
    public void setWaterFog(int arg0, WaterFogData arg1) {
        if (!this.field8174) {
            throw new RuntimeException("");
        }
        this.field8143 = arg0;
        this.field8177 = arg1;
        if (this.field8175) {
            this.field8082.field1073.method12794();
            this.field8082.field1073.method12793();
        }
    }

    @ObfuscatedName("yq.O()V")
    public void O() {
        this.field8174 = false;
    }

    @ObfuscatedName("yq.aq()V")
    public void method490() {
        this.field8220 = 0;
        this.field8144 = 0;
        this.field8139 = this.field412.method921();
        this.field8146 = this.field412.method922();
        this.method13279();
    }

    @ObfuscatedName("yq.ab(IIII)V")
    public void method474(int arg0, int arg1, int arg2, int arg3) {
        this.field8220 = arg0;
        this.field8144 = arg1;
        this.field8139 = arg2;
        this.field8146 = arg3;
        this.method13279();
    }

    @ObfuscatedName("yq.GA(FF)V")
    public void GA(float arg0, float arg1) {
        this.field8127 = arg0;
        this.field8128 = arg1;
        this.method13460();
    }

    @ObfuscatedName("yq.qa([I)V")
    public final void qa(int[] arg0) {
        arg0[0] = this.field8141;
        arg0[1] = this.field8137;
        arg0[2] = this.field8140;
        arg0[3] = this.field8138;
    }

    @ObfuscatedName("yq.L()V")
    public final void L() {
        if (this.field412 == null) {
            return;
        }
        this.field8141 = 0;
        this.field8137 = 0;
        this.field8140 = this.field412.method921();
        this.field8138 = this.field412.method922();
        OpenGL.glDisable(3089);
    }

    @ObfuscatedName("yq.r(IIII)V")
    public final void r(int arg0, int arg1, int arg2, int arg3) {
        if (this.field412 == null) {
            return;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field412.method921()) {
            arg2 = this.field412.method921();
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field412.method922()) {
            arg3 = this.field412.method922();
        }
        this.field8141 = arg0;
        this.field8137 = arg1;
        this.field8140 = arg2;
        this.field8138 = arg3;
        OpenGL.glEnable(3089);
        this.method13280();
    }

    @ObfuscatedName("yq.o(IIII)V")
    public final void o(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8141 < arg0) {
            this.field8141 = arg0;
        }
        if (this.field8140 > arg2) {
            this.field8140 = arg2;
        }
        if (this.field8137 < arg1) {
            this.field8137 = arg1;
        }
        if (this.field8138 > arg3) {
            this.field8138 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method13280();
    }

    @ObfuscatedName("yq.da(II)V")
    public final void method13379(int arg0, int arg1) {
        this.field8095 = arg0;
        this.field8091 = arg1;
        this.method13279();
        this.method13280();
    }

    @ObfuscatedName("yq.ma()V")
    public final void method13279() {
        if (this.field412 == null) {
            return;
        }
        int var1;
        int var2;
        int var3;
        int var4;
        if (this.field8135 == 2) {
            var1 = this.field8220;
            var2 = this.field8144;
            var3 = this.field8139;
            var4 = this.field8146;
        } else {
            var1 = 0;
            var2 = 0;
            var3 = this.field412.method921();
            var4 = this.field412.method922();
        }
        if (var3 < 1) {
            var3 = 1;
        }
        if (var4 < 1) {
            var4 = 1;
        }
        OpenGL.glViewport(this.field8095 + var1, this.field8091 + this.field412.method922() - var2 - var4, var3, var4);
        this.field8124 = (float) this.field8139 / 2.0F;
        this.field8224 = (float) this.field8146 / 2.0F;
        this.field8123 = (float) this.field8220 + this.field8124;
        this.field8125 = (float) this.field8144 + this.field8224;
    }

    @ObfuscatedName("yq.of()V")
    public final void method13460() {
        if (this.field8135 == 2) {
            OpenGL.glDepthRange(this.field8127, this.field8128);
        } else {
            OpenGL.glDepthRange(0.0F, 1.0F);
        }
    }

    @ObfuscatedName("yq.oa()V")
    public final void method13280() {
        if (this.field412 == null || this.field8141 >= this.field8140 || this.field8137 >= this.field8138) {
            OpenGL.glScissor(0, 0, 0, 0);
        } else {
            OpenGL.glScissor(this.field8141 + this.field8095, this.field8091 + this.field412.method922() - this.field8138, this.field8140 - this.field8141, this.field8138 - this.field8137);
        }
    }

    @ObfuscatedName("yq.os()V")
    public final void method13281() {
        OpenGL.glPushMatrix();
    }

    @ObfuscatedName("yq.oq(Lka;)V")
    public final void method13282(Matrix4x4 arg0) {
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.entries, 0);
    }

    @ObfuscatedName("yq.ob(Lka;)V")
    public final void method13360(Matrix4x4 arg0) {
        OpenGL.glLoadMatrixf(arg0.entries, 0);
    }

    @ObfuscatedName("yq.ox()V")
    public final void method13357() {
        OpenGL.glPopMatrix();
    }

    @ObfuscatedName("yq.ci(Lkc;)V")
    public final void method524(Matrix4x3 arg0) {
        this.field8088.method5115(arg0);
        this.field8116.method5385(this.field8088);
        this.field8077.method5115(arg0);
        this.field8077.method5102();
        this.field8117.method5385(this.field8077);
        this.method13427();
        if (this.field8135 != 1) {
            this.method13284();
        }
    }

    @ObfuscatedName("yq.ca()Lkc;")
    public Matrix4x3 method525() {
        return new Matrix4x3(this.field8088);
    }

    @ObfuscatedName("yq.oe()V")
    public final void method13284() {
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field8116.entries, 0);
        if (this.field8175) {
            this.field8082.field1073.method12794();
        }
        this.method13294();
        this.method13291();
    }

    @ObfuscatedName("yq.ch(Lka;)V")
    public final void method784(Matrix4x4 arg0) {
        this.field8118.method5412(arg0);
        this.method13427();
        this.method13289();
    }

    @ObfuscatedName("yq.cv()Lka;")
    public final Matrix4x4 method528() {
        return new Matrix4x4(this.field8118);
    }

    @ObfuscatedName("yq.ow()V")
    public final void method13324() {
        if (this.field8135 != 0) {
            this.field8135 = 0;
            this.method13279();
            this.method13460();
            this.field8108 &= 0xFFFFFFF0;
        }
    }

    @ObfuscatedName("yq.oi()V")
    public final void method13287() {
        if (this.field8135 == 1) {
            return;
        }
        this.field8135 = 1;
        this.method13289();
        this.method13279();
        this.method13460();
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        this.field8108 &= 0xFFFFFFF7;
    }

    @ObfuscatedName("yq.ot()V")
    public final void method13268() {
        if (this.field8135 == 2) {
            return;
        }
        this.field8135 = 2;
        this.method13290(this.field8118.entries);
        this.method13284();
        this.method13279();
        this.method13460();
        this.field8108 &= 0xFFFFFFF8;
    }

    @ObfuscatedName("yq.oc()V")
    public final void method13289() {
        this.field8130 = this.field8118.method5400();
        this.field8196 = this.field8118.method5399();
        this.method13296();
        if (this.field8135 == 2) {
            this.method13290(this.field8118.entries);
        } else if (this.field8135 == 1) {
            this.method13290(this.field8119.entries);
        }
    }

    @ObfuscatedName("yq.oy()V")
    public final void method13427() {
        this.field8120.method5412(this.field8116);
        this.field8120.method5384(this.field8118);
        this.field8120.method5405(this.field8218[0]);
        this.field8120.method5460(this.field8218[1]);
        this.field8120.method5401(this.field8218[2]);
        this.field8120.method5434(this.field8218[3]);
        this.field8120.method5403(this.field8218[4]);
        this.field8120.method5459(this.field8218[5]);
    }

    @ObfuscatedName("yq.op([F)V")
    public final void method13290(float[] arg0) {
        float[] var2 = new float[16];
        System.arraycopy(arg0, 0, var2, 0, 16);
        var2[1] = -var2[1];
        var2[5] = -var2[5];
        var2[9] = -var2[9];
        var2[13] = -var2[13];
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(var2, 0);
        OpenGL.glMatrixMode(5888);
    }

    @ObfuscatedName("yq.RA(Z)V")
    public void RA(boolean arg0) {
        this.field8201 = arg0;
        this.method13326();
    }

    @ObfuscatedName("yq.ck()I")
    public int method768() {
        return 4;
    }

    @ObfuscatedName("yq.ce(I[Lacg;)V")
    public void method535(int arg0, Light[] arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            this.field8161[var3] = arg1[var3];
        }
        this.field8163 = arg0;
        if (this.field8135 != 1) {
            this.method13291();
        }
    }

    @ObfuscatedName("yq.oo()V")
    public void method13291() {
        int var1;
        for (var1 = 0; var1 < this.field8163; var1++) {
            Light var2 = this.field8161[var1];
            int var3 = var1 + 16386;
            field8225[0] = var2.method14888();
            field8225[1] = var2.method14882();
            field8225[2] = var2.method14879();
            field8225[3] = 1.0F;
            OpenGL.glLightfv(var3, 4611, field8225, 0);
            int var4 = var2.method14881();
            float var5 = var2.method14893() / 255.0F;
            field8225[0] = (float) (var4 >> 16 & 0xFF) * var5;
            field8225[1] = (float) (var4 >> 8 & 0xFF) * var5;
            field8225[2] = (float) (var4 & 0xFF) * var5;
            OpenGL.glLightfv(var3, 4609, field8225, 0);
            OpenGL.glLightf(var3, 4617, 1.0F / (float) (var2.method14880() * var2.method14880()));
            OpenGL.glEnable(var3);
        }
        while (var1 < this.field8162) {
            OpenGL.glDisable(var1 + 16386);
            var1++;
        }
        this.field8162 = this.field8163;
    }

    @ObfuscatedName("yq.IA(F)V")
    public final void IA(float arg0) {
        if (this.field8158 != arg0) {
            this.field8158 = arg0;
            this.method13293();
        }
    }

    @ObfuscatedName("yq.m(IFFFFF)V")
    public final void m(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field8154 != arg0;
        if (var7 || this.field8159 != arg1 || this.field8121 != arg2) {
            this.field8154 = arg0;
            this.field8159 = arg1;
            this.field8121 = arg2;
            if (var7) {
                this.field8136 = (float) (this.field8154 & 0xFF0000) / 1.671168E7F;
                this.field8156 = (float) (this.field8154 & 0xFF00) / 65280.0F;
                this.field8179 = (float) (this.field8154 & 0xFF) / 255.0F;
                this.method13293();
            }
            this.method13343();
        }
        if (this.field8150[0] == arg3 && this.field8150[1] == arg4 && this.field8150[2] == arg5) {
            return;
        }
        this.field8150[0] = arg3;
        this.field8150[1] = arg4;
        this.field8150[2] = arg5;
        this.field8070[0] = -arg3;
        this.field8070[1] = -arg4;
        this.field8070[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field8145[0] = arg3 * var8;
        this.field8145[1] = arg4 * var8;
        this.field8145[2] = arg5 * var8;
        this.field8153[0] = -this.field8145[0];
        this.field8153[1] = -this.field8145[1];
        this.field8153[2] = -this.field8145[2];
        this.method13294();
        this.field8164 = (int) (arg3 * 256.0F / arg4);
        this.field8165 = (int) (arg5 * 256.0F / arg4);
    }

    @ObfuscatedName("yq.J(I)V")
    public final void J(int arg0) {
        this.field8092 = 0;
        while (arg0 > 1) {
            this.field8092++;
            arg0 >>= 0x1;
        }
        this.field8217 = 0x1 << this.field8092;
    }

    @ObfuscatedName("yq.c(III)V")
    public final void c(int arg0, int arg1, int arg2) {
        if (this.field8167 == arg0 && this.field8168 == arg1 && this.field8169 == arg2) {
            return;
        }
        this.field8167 = arg0;
        this.field8168 = arg1;
        this.field8169 = arg2;
        this.method13296();
        this.method13295();
    }

    @ObfuscatedName("yq.ou(FF)V")
    public final void method13292(float arg0, float arg1) {
        this.field8172 = arg0;
        this.field8173 = arg1;
        this.method13296();
    }

    @ObfuscatedName("yq.oz()V")
    public void method13293() {
        field8067[0] = this.field8158 * this.field8136;
        field8067[1] = this.field8158 * this.field8156;
        field8067[2] = this.field8179 * this.field8158;
        field8067[3] = 1.0F;
        OpenGL.glLightModelfv(2899, field8067, 0);
    }

    @ObfuscatedName("yq.oj()V")
    public void method13343() {
        field8067[0] = this.field8159 * this.field8136;
        field8067[1] = this.field8159 * this.field8156;
        field8067[2] = this.field8179 * this.field8159;
        field8067[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, field8067, 0);
        field8067[0] = -this.field8121 * this.field8136;
        field8067[1] = -this.field8121 * this.field8156;
        field8067[2] = -this.field8121 * this.field8179;
        field8067[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, field8067, 0);
    }

    @ObfuscatedName("yq.or()V")
    public void method13294() {
        OpenGL.glLightfv(16384, 4611, this.field8145, 0);
        OpenGL.glLightfv(16385, 4611, this.field8153, 0);
    }

    @ObfuscatedName("yq.od()V")
    public void method13295() {
        if (this.field8166 && this.field8168 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @ObfuscatedName("yq.ok()V")
    public void method13296() {
        this.field8171 = this.field8130 - (float) this.field8169 - this.field8173;
        this.field8142 = this.field8171 - (float) this.field8168 * this.field8172;
        if (this.field8142 < this.field8196) {
            this.field8142 = this.field8196;
        }
        OpenGL.glFogf(2915, this.field8142);
        OpenGL.glFogf(2916, this.field8171);
        field8067[0] = (float) (this.field8167 & 0xFF0000) / 1.671168E7F;
        field8067[1] = (float) (this.field8167 & 0xFF00) / 65280.0F;
        field8067[2] = (float) (this.field8167 & 0xFF) / 255.0F;
        OpenGL.glFogfv(2918, field8067, 0);
    }

    @ObfuscatedName("yq.ct(IIIIII)Ldj;")
    public EnvironmentSampler method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field8206 ? new GlEnvironmentSampler_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @ObfuscatedName("yq.cu(Ldj;Ldj;FLdj;)Ldj;")
    public EnvironmentSampler method537(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3) {
        if (arg0 != null && arg1 != null && this.field8206 && this.field8176) {
            GlEnvironmentSampler_Sub1 var5 = null;
            GlEnvironmentSampler var6 = (GlEnvironmentSampler) arg0;
            GlEnvironmentSampler var7 = (GlEnvironmentSampler) arg1;
            GlCubeTexture var8 = var6.method13186();
            GlCubeTexture var9 = var7.method13186();
            if (var8 != null && var9 != null) {
                int var10 = var8.field7448 > var9.field7448 ? var8.field7448 : var9.field7448;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof GlEnvironmentSampler_Sub1) {
                    GlEnvironmentSampler_Sub1 var11 = (GlEnvironmentSampler_Sub1) arg3;
                    if (var11.method16016() == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new GlEnvironmentSampler_Sub1(this, var10);
                }
                if (var5.method16015(var8, var9, arg2)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @ObfuscatedName("yq.cc(Ldj;)V")
    public final void method549(EnvironmentSampler arg0) {
        this.field8187 = (GlEnvironmentSampler) arg0;
    }

    @ObfuscatedName("yq.oh()Lxl;")
    public final GlCubeTexture method13297() {
        return this.field8187 == null ? null : this.field8187.method13186();
    }

    @ObfuscatedName("yq.cg()Z")
    public final boolean method539() {
        if (this.field8047 == null) {
            return false;
        }
        if (!this.field8047.method14819()) {
            if (!this.field8093.method2301(this.field8047)) {
                return false;
            }
            this.field8083.method2327();
        }
        return true;
    }

    @ObfuscatedName("yq.cj()V")
    public final void method558() {
        if (this.field8047 != null && this.field8047.method14819()) {
            this.field8093.method2302(this.field8047);
            this.field8083.method2327();
        }
    }

    @ObfuscatedName("yq.cy()Z")
    public final boolean isBloomEnabled() {
        return this.field8047 != null && this.field8047.method14819();
    }

    @ObfuscatedName("yq.dl(FFFFFF)V")
    public final void method543(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        GlColourGradingBloomEffect.field10155 = arg0;
        GlColourGradingBloomEffect.field10158 = arg1;
        GlColourGradingBloomEffect.field10153 = arg2;
    }

    @ObfuscatedName("yq.dj(IIII)V")
    public final void method514(int arg0, int arg1, int arg2, int arg3) {
        this.field8093.method2308(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("yq.dp()V")
    public final void method545() {
        this.field8093.method2300();
    }

    @ObfuscatedName("yq.av()Lyu;")
    public Framebuffer method467() {
        return new GlFramebuffer(this);
    }

    @ObfuscatedName("yq.ah(II)Ldo;")
    public EffectInterface method637(int arg0, int arg1) {
        return new PostProcessingRelated(this, TextureFormat.field1300, DataType.field1503, arg0, arg1);
    }

    @ObfuscatedName("yq.au(III)Ldo;")
    public EffectInterface method541(int arg0, int arg1, int arg2) {
        return new PostProcessingRelated(this, TextureFormat.field1300, DataType.field1503, arg0, arg1, arg2);
    }

    @ObfuscatedName("yq.aj(IILcy;Ldz;I)Lde;")
    public GraphicsDeletable method468(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
        return new PostProcessingRelated(this, arg2, arg3, arg0, arg1, arg4);
    }

    @ObfuscatedName("yq.pv(I[BIZ)Lcf;")
    public final GlBinding method13345(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (GlBinding) (this.field8181 && (!arg3 || this.field8049) ? new GlRelated7(this, arg0, arg1, arg2, arg3) : new GlFloorModelRelated4_Sub1(this, arg0, arg1, arg2));
    }

    @ObfuscatedName("yq.pd(I[BIZ)Lbi;")
    public final GlInterfaceRelated method13301(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (GlInterfaceRelated) (this.field8181 && (!arg3 || this.field8049) ? new GpuBufferRelated12(this, arg0, arg1, arg2, arg3) : new GlFloorModelRelated12(this, arg0, arg1, arg2));
    }

    @ObfuscatedName("yq.pe(ILjaclib/memory/Buffer;IZ)Lbi;")
    public final GlInterfaceRelated method13302(int arg0, Buffer arg1, int arg2, boolean arg3) {
        return (GlInterfaceRelated) (this.field8181 && (!arg3 || this.field8049) ? new GpuBufferRelated12(this, arg0, arg1, arg2, arg3) : new GlFloorModelRelated12(this, arg0, arg1));
    }

    @ObfuscatedName("yq.pp(Lbi;)V")
    public final void method13365(GlInterfaceRelated arg0) {
        if (this.field8061 != arg0) {
            if (this.field8181) {
                OpenGL.glBindBufferARB(34962, arg0.method2231());
            }
            this.field8061 = arg0;
        }
    }

    @ObfuscatedName("yq.pq(Lcf;)V")
    public final void method13304(GlBinding arg0) {
        if (this.field8203 != arg0) {
            if (this.field8181) {
                OpenGL.glBindBufferARB(34963, arg0.method2342());
            }
            this.field8203 = arg0;
        }
    }

    @ObfuscatedName("yq.px(Lbb;Lbb;Lbb;Lbb;)V")
    public final void method13305(GlRelated1 arg0, GlRelated1 arg1, GlRelated1 arg2, GlRelated1 arg3) {
        if (arg0 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method13365(arg0.field1097);
            OpenGL.glVertexPointer(arg0.field1100, arg0.field1098, this.field8061.method2239(), this.field8061.method2233() + (long) arg0.field1099);
            OpenGL.glEnableClientState(32884);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method13365(arg1.field1097);
            OpenGL.glNormalPointer(arg1.field1098, this.field8061.method2239(), this.field8061.method2233() + (long) arg1.field1099);
            OpenGL.glEnableClientState(32885);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method13365(arg2.field1097);
            OpenGL.glColorPointer(arg2.field1100, arg2.field1098, this.field8061.method2239(), this.field8061.method2233() + (long) arg2.field1099);
            OpenGL.glEnableClientState(32886);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method13365(arg3.field1097);
            OpenGL.glTexCoordPointer(arg3.field1100, arg3.field1098, this.field8061.method2239(), this.field8061.method2233() + (long) arg3.field1099);
            OpenGL.glEnableClientState(32888);
        }
    }

    @ObfuscatedName("yq.pt(III)V")
    public final void method13306(int arg0, int arg1, int arg2) {
        OpenGL.glDrawArrays(arg0, arg1, arg2);
    }

    @ObfuscatedName("yq.pa(Lcf;III)V")
    public final void method13307(GlBinding arg0, int arg1, int arg2, int arg3) {
        this.method13304(arg0);
        OpenGL.glDrawElements(arg1, arg3, 5123, arg0.method2344() + (long) (arg2 * 2));
    }

    @ObfuscatedName("yq.ps()V")
    public final void method13308() {
        if (this.field8108 == 1) {
            return;
        }
        this.method13287();
        this.method13321(false);
        this.method13322(false);
        this.method13364(false);
        this.method13325(false);
        this.method13315(null);
        this.method13312(-2);
        this.method13316(1);
        this.field8108 = 1;
    }

    @ObfuscatedName("yq.pn()V")
    public final void method13309() {
        if (this.field8108 == 2) {
            return;
        }
        this.method13287();
        this.method13321(false);
        this.method13322(false);
        this.method13364(false);
        this.method13325(false);
        this.method13312(-2);
        this.field8108 = 2;
    }

    @ObfuscatedName("yq.po()V")
    public final void method13341() {
        if (this.field8108 == 4) {
            return;
        }
        this.method13287();
        this.method13321(false);
        this.method13322(false);
        this.method13364(false);
        this.method13325(false);
        this.method13312(-2);
        this.method13327(1);
        this.field8108 = 4;
    }

    @ObfuscatedName("yq.pb()V")
    public final void method13311() {
        if (this.field8108 == 8) {
            return;
        }
        this.method13268();
        this.method13321(true);
        this.method13364(true);
        this.method13325(true);
        this.method13327(1);
        this.field8108 = 8;
    }

    @ObfuscatedName("yq.pw(I)V")
    public final void method13312(int arg0) {
        this.method13313(arg0, true);
    }

    @ObfuscatedName("yq.ph(IZ)V")
    public final void method13313(int arg0, boolean arg1) {
        this.method13473(arg0, arg1, true);
    }

    @ObfuscatedName("yq.pr(IZZ)V")
    public final void method13473(int arg0, boolean arg1, boolean arg2) {
        if (this.field8180 != arg0 || this.field8175 != this.field8174) {
            GlRelated2 var4 = null;
            int var5 = 0;
            byte var6 = 0;
            int var7 = 0;
            int var8 = this.field8174 ? 3 : 0;
            if (arg0 < 0) {
                this.method13362();
            } else {
                var4 = this.field8083.method2335(arg0);
                Material var9 = this.field400.method889(arg0);
                if (var9.field1268 == 0 && var9.field1261 == 0) {
                    this.method13362();
                } else {
                    this.method13320((float) (this.field8109 % 128000) / 1000.0F * (float) var9.field1268 / 64.0F % 1.0F, (float) (this.field8109 % 128000) / 1000.0F * (float) var9.field1261 / 64.0F % 1.0F, 0.0F);
                }
                if (!this.field8174) {
                    var6 = var9.field1248;
                    var7 = var9.field1264;
                    var8 = var9.field1270;
                }
                var5 = var9.field1278;
            }
            this.field8082.method2225(var8, var6, var7, arg1, arg2);
            if (!this.field8082.method2222(var4, var5)) {
                this.method13315(var4);
                this.method13316(var5);
            }
            this.field8175 = this.field8174;
            this.field8180 = arg0;
        }
        this.field8108 &= 0xFFFFFFF8;
    }

    @ObfuscatedName("yq.pc(I)V")
    public final void method13314(int arg0) {
        if (this.field8076 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field8076 = arg0;
        }
    }

    @ObfuscatedName("yq.pj(Lbg;)V")
    public final void method13315(GlTexture arg0) {
        GlTexture var2 = this.field8185[this.field8076];
        if (arg0 != var2) {
            if (arg0 == null) {
                OpenGL.glDisable(var2.field1049);
            } else {
                if (var2 == null) {
                    OpenGL.glEnable(arg0.field1049);
                } else if (arg0.field1049 != var2.field1049) {
                    OpenGL.glDisable(var2.field1049);
                    OpenGL.glEnable(arg0.field1049);
                }
                OpenGL.glBindTexture(arg0.field1049, arg0.field1048);
            }
            this.field8185[this.field8076] = arg0;
        }
        this.field8108 &= 0xFFFFFFFE;
    }

    @ObfuscatedName("yq.pi(I)V")
    public final void method13316(int arg0) {
        if (arg0 == 1) {
            this.method13271(7681, 7681);
        } else if (arg0 == 0) {
            this.method13271(8448, 8448);
        } else if (arg0 == 2) {
            this.method13271(34165, 7681);
        } else if (arg0 == 3) {
            this.method13271(260, 8448);
        } else if (arg0 == 4) {
            this.method13271(34023, 34023);
        }
    }

    @ObfuscatedName("yq.pl(I)I")
    public final int method13317(int arg0) {
        if (arg0 == 1) {
            return 7681;
        } else if (arg0 == 0) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else if (arg0 == 3) {
            return 260;
        } else if (arg0 == 4) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("yq.pf(II)V")
    public final void method13271(int arg0, int arg1) {
        if (this.field8076 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field8190 != arg0) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            this.field8190 = arg0;
            var3 = true;
        }
        if (this.field8182 != arg1) {
            OpenGL.glTexEnvi(8960, 34162, arg1);
            this.field8182 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field8108 &= 0xFFFFFFF2;
        }
    }

    @ObfuscatedName("yq.pm(III)V")
    public final void method13318(int arg0, int arg1, int arg2) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @ObfuscatedName("yq.pk(III)V")
    public final void method13267(int arg0, int arg1, int arg2) {
        OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
        OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @ObfuscatedName("yq.pz(I)V")
    public final void method13319(int arg0) {
        field8067[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field8067[1] = (float) (arg0 & 0xFF00) / 65280.0F;
        field8067[2] = (float) (arg0 & 0xFF) / 255.0F;
        field8067[3] = (float) (arg0 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, field8067, 0);
    }

    @ObfuscatedName("yq.pg(FFFF)V")
    public final void method13443(float arg0, float arg1, float arg2, float arg3) {
        field8067[0] = arg0;
        field8067[1] = arg1;
        field8067[2] = arg2;
        field8067[3] = arg3;
        OpenGL.glTexEnvfv(8960, 8705, field8067, 0);
    }

    @ObfuscatedName("yq.py(FFF)V")
    public final void method13320(float arg0, float arg1, float arg2) {
        OpenGL.glMatrixMode(5890);
        if (this.field8183) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg1, arg2);
        OpenGL.glMatrixMode(5888);
        this.field8183 = true;
    }

    @ObfuscatedName("yq.pu()V")
    public final void method13362() {
        if (this.field8183) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field8183 = false;
        }
    }

    @ObfuscatedName("yq.qu(Z)V")
    public final void method13321(boolean arg0) {
        if (this.field8166 != arg0) {
            this.field8166 = arg0;
            this.method13295();
            this.field8108 &= 0xFFFFFFF0;
        }
    }

    @ObfuscatedName("yq.qd(Z)V")
    public final void method13322(boolean arg0) {
        if (this.field8148 != arg0) {
            this.field8148 = arg0;
            this.method13323();
            this.field8108 &= 0xFFFFFFF8;
        }
    }

    @ObfuscatedName("yq.qm(Z)V")
    public final void method13445(boolean arg0) {
        if (this.field8219 != arg0) {
            this.field8219 = arg0;
            this.method13323();
        }
    }

    @ObfuscatedName("yq.qi()V")
    public void method13323() {
        if (this.field8148 && !this.field8219) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @ObfuscatedName("yq.qx(Z)V")
    public final void method13364(boolean arg0) {
        if (this.field8113 == arg0) {
            return;
        }
        if (arg0) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        this.field8113 = arg0;
        this.field8108 &= 0xFFFFFFF0;
    }

    @ObfuscatedName("yq.qq(Z)V")
    public final void method13325(boolean arg0) {
        if (this.field8100 != arg0) {
            this.field8100 = arg0;
            this.method13326();
            this.field8108 &= 0xFFFFFFF0;
        }
    }

    @ObfuscatedName("yq.qn()V")
    public final void method13326() {
        OpenGL.glDepthMask(this.field8100 && this.field8201);
    }

    @ObfuscatedName("yq.qt(I)V")
    public final void method13327(int arg0) {
        if (this.field8129 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 3;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field8111 != var3) {
            OpenGL.glColorMask(var3, var3, var3, true);
            this.field8111 = var3;
        }
        if (this.field8112 != var4) {
            if (var4) {
                OpenGL.glEnable(3008);
            } else {
                OpenGL.glDisable(3008);
            }
            this.field8112 = var4;
        }
        if (this.field8110 != var2) {
            if (var2 == 1) {
                OpenGL.glEnable(3042);
                OpenGL.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                OpenGL.glEnable(3042);
                OpenGL.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                OpenGL.glEnable(3042);
                OpenGL.glBlendFunc(774, 1);
            } else {
                OpenGL.glDisable(3042);
            }
            this.field8110 = var2;
        }
        this.field8129 = arg0;
        this.field8108 &= 0xFFFFFFF3;
    }

    @ObfuscatedName("yq.za()I")
    public final int za() {
        return this.field8157 + this.field8096 + this.field8098;
    }

    @ObfuscatedName("yq.b(I)V")
    public final synchronized void method444(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field8039.method11585()) {
            IntNode var4 = (IntNode) this.field8039.method11560();
            field8228[var2++] = (int) var4.key;
            this.field8157 -= var4.value;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, field8228, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, field8228, 0);
            var2 = 0;
        }
        while (!this.field8198.method11585()) {
            IntNode var5 = (IntNode) this.field8198.method11560();
            field8228[var2++] = (int) var5.key;
            this.field8096 -= var5.value;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, field8228, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, field8228, 0);
            var2 = 0;
        }
        while (!this.field8102.method11585()) {
            IntNode var6 = (IntNode) this.field8102.method11560();
            field8228[var2++] = var6.value;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, field8228, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, field8228, 0);
            var2 = 0;
        }
        while (!this.field8103.method11585()) {
            IntNode var7 = (IntNode) this.field8103.method11560();
            field8228[var2++] = (int) var7.key;
            this.field8098 -= var7.value;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, field8228, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, field8228, 0);
            boolean var8 = false;
        }
        while (!this.field8099.method11585()) {
            IntNode var9 = (IntNode) this.field8099.method11560();
            OpenGL.glDeleteLists((int) var9.key, var9.value);
        }
        while (!this.field8194.method11585()) {
            Node var10 = this.field8194.method11560();
            OpenGL.glDeleteProgramARB((int) var10.key);
        }
        while (!this.field8105.method11585()) {
            Node var11 = this.field8105.method11560();
            OpenGL.glDeleteShader((int) var11.key);
        }
        while (!this.field8099.method11585()) {
            IntNode var12 = (IntNode) this.field8099.method11560();
            OpenGL.glDeleteLists((int) var12.key, var12.value);
        }
        this.field8083.method2326();
        if (this.za() > 100663296 && MonotonicTime.get() > this.field8078 + 60000L) {
            System.gc();
            this.field8078 = MonotonicTime.get();
        }
        this.field8109 = var3;
    }

    @ObfuscatedName("yq.qo(II)V")
    public final synchronized void method13328(int arg0, int arg1) {
        IntNode var3 = new IntNode(arg1);
        var3.key = arg0;
        this.field8039.addTail(var3);
    }

    @ObfuscatedName("yq.qr(II)V")
    public final synchronized void method13329(int arg0, int arg1) {
        IntNode var3 = new IntNode(arg1);
        var3.key = arg0;
        this.field8198.addTail(var3);
    }

    @ObfuscatedName("yq.qw(I)V")
    public final synchronized void method13330(int arg0) {
        IntNode var2 = new IntNode(arg0);
        this.field8102.addTail(var2);
    }

    @ObfuscatedName("yq.ql(II)V")
    public final synchronized void method13331(int arg0, int arg1) {
        IntNode var3 = new IntNode(arg1);
        var3.key = arg0;
        this.field8103.addTail(var3);
    }

    @ObfuscatedName("yq.qp(J)V")
    public final synchronized void method13332(long arg0) {
        Node var3 = new Node();
        var3.key = arg0;
        this.field8105.addTail(var3);
    }

    @ObfuscatedName("yq.qf(I)V")
    public final synchronized void method13333(int arg0) {
        Node var2 = new Node();
        var2.key = arg0;
        this.field8194.addTail(var2);
    }

    @ObfuscatedName("yq.qc(Lcy;)I")
    public static int method13334(TextureFormat arg0) {
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

    @ObfuscatedName("yq.qj(Lcy;Ldz;)I")
    public static int method13335(TextureFormat arg0, DataType arg1) {
        if (DataType.field1501 == arg1) {
            switch (arg0.field1305) {
                case 0:
                    return 6410;
                case 1:
                    return 6408;
                case 2:
                case 3:
                case 5:
                case 7:
                default:
                    throw new IllegalArgumentException();
                case 4:
                    return 6407;
                case 6:
                    return 6409;
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

    @ObfuscatedName("yq.db(Z)V")
    public void method471(boolean arg0) {
    }
}
