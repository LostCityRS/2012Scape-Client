import deob.ObfuscatedName;
import jagdx.*;

import java.awt.*;

@ObfuscatedName("ahh")
public class DxToolkit extends GpuToolkit {

    @ObfuscatedName("ahh.gf")
    public final int field9989;

    @ObfuscatedName("ahh.gl")
    public final int field9973;

    @ObfuscatedName("ahh.gb")
    public long field9974 = 0L;

    @ObfuscatedName("ahh.go")
    public long field9975 = 0L;

    @ObfuscatedName("ahh.gi")
    public final D3DPRESENT_PARAMETERS field9976;

    @ObfuscatedName("ahh.ga")
    public LinkedList field9977 = new LinkedList();

    @ObfuscatedName("ahh.gs")
    public int field9978 = 0;

    @ObfuscatedName("ahh.gd")
    public long field9979 = 0L;

    @ObfuscatedName("ahh.gj")
    public long field9980 = 0L;

    @ObfuscatedName("ahh.gu")
    public long field9981 = 0L;

    @ObfuscatedName("ahh.gg")
    public boolean field9982 = false;

    @ObfuscatedName("ahh.gy")
    public boolean[] field9998;

    @ObfuscatedName("ahh.gt")
    public boolean[] field9984;

    @ObfuscatedName("ahh.gx")
    public boolean[] field9986;

    @ObfuscatedName("ahh.gv")
    public boolean[] field10001;

    @ObfuscatedName("ahh.he")
    public GpuTextureRelated[] field9987;

    @ObfuscatedName("ahh.hk")
    public int[] field9988;

    @ObfuscatedName("ahh.hy")
    public Matrix4x4 field9996;

    @ObfuscatedName("ahh.ho")
    public DxProgram field9990;

    @ObfuscatedName("ahh.hh")
    public long field9991;

    @ObfuscatedName("ahh.hm")
    public final D3DCAPS field9992;

    @ObfuscatedName("ahh.hq")
    public final boolean field10002;

    @ObfuscatedName("ahh.hx")
    public final boolean field9994;

    @ObfuscatedName("ahh.hs")
    public final boolean field9995;

    @ObfuscatedName("ahh.ha")
    public boolean field9985;

    @ObfuscatedName("ahh.hb")
    public final float[] field9997 = new float[16];

    @ObfuscatedName("ahh.hc")
    public int field9972 = 128;

    @ObfuscatedName("ahh.hn")
    public int field9999 = 0;

    @ObfuscatedName("ahh.hd")
    public long[] field10000 = new long[this.field9972];

    @ObfuscatedName("ahh.hw")
    public static final int[] field9983 = new int[]{77, 80};

    @ObfuscatedName("ahh.hu")
    public static final int[] field9993 = new int[]{22, 23};

    @ObfuscatedName("ahh.x()Z")
    public boolean method13487() {
        return (this.field9992.VertexShaderVersion & 0xFFFF) >= 257;
    }

    @ObfuscatedName("ahh.k()Z")
    public boolean method13488() {
        return (this.field9992.PixelShaderVersion & 0xFFFF) >= 257;
    }

    @ObfuscatedName("ahh.aba(Ljava/awt/Canvas;Lma;Lls;Ljava/lang/Integer;)Lra;")
    public static RendererToolkit method16047(Canvas arg0, MaterialTypeList arg1, Js5 arg2, Integer arg3) {
        DxToolkit var4 = null;
        try {
            byte var5 = 0;
            byte var6 = 1;
            long var7 = IDirect3D.Direct3DCreate();
            D3DCAPS var9 = new D3DCAPS();
            IDirect3D.GetDeviceCaps(var7, var5, var6, var9);
            if (var9.MaxSimultaneousTextures < 2) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x8) == 0) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x40) == 0) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x200) == 0) {
                throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 0x2000000) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x10) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x20) == 0) {
                throw new RuntimeException("");
            } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 0x2) == 0) {
                throw new RuntimeException("");
            } else if (var9.MaxActiveLights > 0 && var9.MaxActiveLights < 2) {
                throw new RuntimeException("");
            } else if (var9.MaxStreams < 5) {
                throw new RuntimeException("");
            } else {
                D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                var10.Windowed = true;
                var10.EnableAutoDepthStencil = true;
                var10.BackBufferWidth = arg0.getWidth();
                var10.BackBufferHeight = arg0.getHeight();
                var10.BackBufferCount = 1;
                var10.PresentationInterval = Integer.MIN_VALUE;
                if (!method16034(var5, var6, var7, arg3, var10)) {
                    throw new RuntimeException("");
                }
                int var11 = 0;
                if ((var9.DevCaps & 0x100000) != 0) {
                    var11 |= 0x10;
                }
                long var12 = 0L;
                long var14;
                try {
                    var14 = IDirect3D.CreateDeviceContext(var7, var5, var6, arg0, var11 | 0x40, var10);
                } catch (class7 var18) {
                    var14 = IDirect3D.CreateDeviceContext(var7, var5, var6, arg0, var11 & 0xFFEFFFFF | 0x20, var10);
                }
                var4 = new DxToolkit(var5, var6, var7, var14, var10, var9, arg1, arg2, arg3);
                if (!var4.field401.containsKey(arg0)) {
                    RendererToolkit.method16838(arg0);
                    var4.method460(arg0, new DxSurface(var4, arg0, arg0.getWidth(), arg0.getHeight(), true));
                }
                var4.method462(arg0);
                var4.method13495();
                return var4;
            }
        } catch (RuntimeException var19) {
            if (var4 != null) {
                var4.method443();
            }
            throw var19;
        }
    }

    public DxToolkit(int arg0, int arg1, long arg2, long arg3, D3DPRESENT_PARAMETERS arg4, D3DCAPS arg5, MaterialTypeList arg6, Js5 arg7, int arg8) {
        super(arg6, arg7, arg8, 0);
        try {
            this.field9989 = arg0;
            this.field9973 = arg1;
            this.field9974 = arg2;
            this.field9975 = arg3;
            this.field9976 = arg4;
            this.field9992 = arg5;
            this.field9979 = D3DLIGHT.Create();
            this.field9980 = D3DLIGHT.Create();
            this.field9981 = D3DLIGHT.Create();
            this.field8337 = this.field9992.MaxSimultaneousTextures;
            this.field8379 = this.field9992.MaxActiveLights > 0 ? this.field9992.MaxActiveLights : 8;
            this.field10002 = (this.field9992.TextureCaps & 0x2) == 0;
            this.field8384 = (this.field9992.TextureCaps & 0x2000) != 0;
            this.field9995 = (this.field9992.TextureCaps & 0x10000) != 0;
            this.field9994 = (this.field9992.TextureCaps & 0x4000) != 0;
            this.field8380 = this.field9992.NumSimultaneousRTs > 0;
            this.field8381 = this.field9992.NumSimultaneousRTs > 0;
            this.field8339 = this.field8383 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field9974, this.field9989, this.field9973, this.field9976.BackBufferFormat, true, 2) == 0;
            this.field8382 = this.field9992.NumSimultaneousRTs > 0 && this.field8383 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.field9974, this.field9989, this.field9973, 113, true, 2) == 0;
            this.field9998 = new boolean[this.field8337];
            this.field9984 = new boolean[this.field8337];
            this.field9986 = new boolean[this.field8337];
            this.field9987 = new GpuTextureRelated[this.field8337];
            this.field10001 = new boolean[this.field8337];
            this.field9988 = new int[this.field8337];
            Matrix4x3 var12 = new Matrix4x3();
            var12.method5112(1.0F, -1.0F, 0.5F);
            var12.method5116(0.0F, 0.0F, 0.5F);
            this.field9996 = new Matrix4x4();
            this.field9996.method5385(var12);
            IDirect3DDevice.BeginScene(this.field9975);
        } catch (Throwable var14) {
            var14.printStackTrace();
            this.method442();
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ahh.oi()V")
    public void method13499() {
        for (ObjectNode var1 = (ObjectNode) this.field9977.head(); var1 != null; var1 = (ObjectNode) this.field9977.next()) {
            DxInterface1 var2 = (DxInterface1) var1.value;
            var2.method4914();
            if (this.field412 == var2) {
                var2.method954();
            }
        }
        super.method13499();
    }

    @ObfuscatedName("ahh.ow()V")
    public void method13583() {
        for (ObjectNode var1 = (ObjectNode) this.field9977.head(); var1 != null; var1 = (ObjectNode) this.field9977.next()) {
            DxInterface1 var2 = (DxInterface1) var1.value;
            var2.method944();
        }
        super.method13583();
    }

    @ObfuscatedName("ahh.abz()Z")
    public boolean method16023() {
        int var1 = IDirect3DDevice.TestCooperativeLevel(this.field9975);
        if (var1 == 0 || var1 == -2005530519) {
            IDirect3DDevice.SetDepthStencilSurface(this.field9975, 0L);
            for (int var2 = 0; var2 < 4; var2++) {
                IDirect3DDevice.SetRenderTarget(this.field9975, var2, 0L);
            }
            for (int var3 = 0; var3 < 4; var3++) {
                IDirect3DDevice.SetStreamSource(this.field9975, var3, 0L, 0, 0);
            }
            for (int var4 = 0; var4 < 4; var4++) {
                IDirect3DDevice.SetTexture(this.field9975, var4, 0L);
            }
            IDirect3DDevice.SetIndices(this.field9975, 0L);
            this.method13583();
            this.field9976.BackBufferWidth = 0;
            this.field9976.BackBufferHeight = 0;
            if (method16034(this.field9989, this.field9973, this.field9974, this.field8383, this.field9976)) {
                int var5 = IDirect3DDevice.Reset(this.field9975, this.field9976);
                if (HRESULT.method19(var5)) {
                    this.method13499();
                    this.method13497();
                    return true;
                }
                System.exit(0);
            }
        }
        return false;
    }

    @ObfuscatedName("ahh.ox()V")
    public void method13497() {
        for (int var1 = 0; var1 < this.field8337; var1++) {
            IDirect3DDevice.SetSamplerState(this.field9975, var1, 7, 2);
            IDirect3DDevice.SetSamplerState(this.field9975, var1, 6, 2);
            IDirect3DDevice.SetSamplerState(this.field9975, var1, 5, 2);
            IDirect3DDevice.SetSamplerState(this.field9975, var1, 1, 1);
            IDirect3DDevice.SetSamplerState(this.field9975, var1, 2, 1);
            this.field9987[var1] = GpuTextureRelated.field2501;
            boolean[] var2 = this.field9998;
            this.field9984[var1] = true;
            var2[var1] = true;
            this.field10001[var1] = false;
            this.field9988[var1] = 0;
        }
        IDirect3DDevice.SetTextureStageState(this.field9975, 0, 6, 1);
        IDirect3DDevice.SetRenderState(this.field9975, 9, 2);
        IDirect3DDevice.SetRenderState(this.field9975, 23, 4);
        IDirect3DDevice.SetRenderState(this.field9975, 25, 5);
        IDirect3DDevice.SetRenderState(this.field9975, 24, 0);
        IDirect3DDevice.SetRenderState(this.field9975, 22, 2);
        IDirect3DDevice.SetRenderState(this.field9975, 147, 1);
        IDirect3DDevice.SetRenderState(this.field9975, 145, 1);
        IDirect3DDevice.method22(this.field9975, 38, 0.95F);
        IDirect3DDevice.SetRenderState(this.field9975, 35, 3);
        IDirect3DDevice.method22(this.field9975, 154, 1.0F);
        D3DLIGHT.SetType(this.field9979, 3);
        D3DLIGHT.SetType(this.field9980, 3);
        D3DLIGHT.SetType(this.field9981, 1);
        IDirect3DDevice.SetRenderState(this.field9975, 206, 1);
        this.field9982 = false;
        super.method13497();
    }

    @ObfuscatedName("ahh.t()Lcg;")
    public RendererInfo method456() {
        D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
        IDirect3D.GetAdapterIdentifier(this.field9974, this.field9989, 0, var1);
        return new RendererInfo(var1.VendorID, "Direct3D", 9, var1.Description, var1.DriverVersion);
    }

    @ObfuscatedName("ahh.f(II)V")
    public void method653(int arg0, int arg1) throws RendererException {
        IDirect3DDevice.EndScene(this.field9975);
        int var3 = this.field415.method918();
        if (!HRESULT.method18(var3)) {
            this.field9978 = 0;
        } else if (var3 == -2005530520) {
            this.field415.method944();
            this.method16023();
            ((DxSurface) this.field415).method4914();
        } else if (++this.field9978 > 50) {
            throw new RendererException(var3);
        }
        IDirect3DDevice.BeginScene(this.field9975);
        if (this.field400 != null) {
            this.field400.method890();
        }
    }

    @ObfuscatedName("ahh.z()V")
    public void method441() {
        long var1 = IDirect3DDevice.CreateEventQuery(this.field9975);
        if (HRESULT.method19(IDirect3DEventQuery.Issue(var1))) {
            while (true) {
                int var3 = IDirect3DEventQuery.IsSignaled(var1);
                if (var3 != 1) {
                    break;
                }
                Thread.yield();
            }
        }
        IUnknown.Release(var1);
    }

    @ObfuscatedName("ahh.w()V")
    public void method443() {
        super.method443();
        if (this.field9979 != 0L) {
            D3DLIGHT.Destroy(this.field9979);
            this.field9979 = 0L;
        }
        if (this.field9980 != 0L) {
            D3DLIGHT.Destroy(this.field9980);
            this.field9980 = 0L;
        }
        if (this.field9981 != 0L) {
            D3DLIGHT.Destroy(this.field9981);
            this.field9981 = 0L;
        }
        if (this.field9975 != 0L) {
            IDirect3DDevice.Destroy(this.field9975);
            this.field9975 = 0L;
        }
        if (this.field9974 != 0L) {
            IUnknown.Release(this.field9974);
            this.field9974 = 0L;
        }
    }

    public void finalize() {
        super.finalize();
    }

    @ObfuscatedName("ahh.oo()F")
    public float method13750() {
        return -0.5F;
    }

    @ObfuscatedName("ahh.av()Lyu;")
    public Framebuffer method467() {
        return new DxFramebuffer(this);
    }

    @ObfuscatedName("ahh.ak(Ljava/awt/Canvas;II)Lya;")
    public Surface method735(Canvas arg0, int arg1, int arg2) {
        return new DxSurface(this, arg0, arg1, arg2, false);
    }

    @ObfuscatedName("ahh.aj(IILcy;Ldz;I)Lde;")
    public GraphicsDeletable method468(int arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4) {
        return new DxGraphicsDeletableRelated(this, arg2, arg3, arg0, arg1, arg4);
    }

    @ObfuscatedName("ahh.ah(II)Ldo;")
    public EffectInterface method637(int arg0, int arg1) {
        return new DxStencilBuffer(this, DataType.field1503, arg0, arg1, 0);
    }

    @ObfuscatedName("ahh.au(III)Ldo;")
    public EffectInterface method541(int arg0, int arg1, int arg2) {
        return new DxStencilBuffer(this, DataType.field1503, arg0, arg1, arg2);
    }

    @ObfuscatedName("ahh.acc(Ljz;)Ladt;")
    public ObjectNode method16024(DxInterface1 arg0) {
        for (ObjectNode var2 = (ObjectNode) this.field9977.head(); var2 != null; var2 = (ObjectNode) this.field9977.next()) {
            if (var2.value == arg0) {
                return var2;
            }
        }
        return null;
    }

    @ObfuscatedName("ahh.acp(Ljz;)V")
    public void method16025(DxInterface1 arg0) {
        if (this.method16024(arg0) == null) {
            this.field9977.addTail(new ObjectNode(arg0));
        }
    }

    public void add(DxInterface1 arg0) {
        ObjectNode var2 = this.method16024(arg0);
        if (var2 != null) {
            var2.unlink();
        }
    }

    @ObfuscatedName("ahh.aca(Ljz;)V")
    public void method16026(DxInterface1 arg0) {
        ObjectNode var2 = this.method16024(arg0);
        if (var2 != null) {
            var2.unlink();
        }
    }

    @ObfuscatedName("ahh.ae(IIII)[I")
    public int[] ae(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = null;
        long var6 = IDirect3DDevice.GetRenderTarget(this.field9975, 0);
        long var8 = IDirect3DDevice.CreateRenderTarget(this.field9975, arg2, arg3, 21, 0, 0, true);
        if (HRESULT.method19(IDirect3DDevice.StretchRect(this.field9975, var6, arg0, arg1, arg2, arg3, var8, 0, 0, arg2, arg3, 1))) {
            var5 = new int[arg2 * arg3];
            IDirect3DSurface.Download(var8, 0, 0, arg2, arg3, arg2 * 4, 16, this.field8245);
            this.field8244.clear();
            this.field8244.asIntBuffer().get(var5);
        }
        IUnknown.Release(var6);
        IUnknown.Release(var8);
        return var5;
    }

    @ObfuscatedName("ahh.ac()V")
    public void method587() {
    }

    @ObfuscatedName("ahh.cu(Ldj;Ldj;FLdj;)Ldj;")
    public EnvironmentSampler method537(EnvironmentSampler arg0, EnvironmentSampler arg1, float arg2, EnvironmentSampler arg3) {
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @ObfuscatedName("ahh.ba(II)V")
    public void ba(int arg0, int arg1) {
        IDirect3DDevice.Clear(this.field9975, arg0, arg1, 1.0F, 0);
    }

    @ObfuscatedName("ahh.pd()V")
    public void method13493() {
        if (this.field412 != null) {
            IDirect3DDevice.SetViewport(this.field9975, this.field8303 + this.field8299, this.field8300 + this.field8246, this.field8301, this.field8376, this.field8285, this.field8286);
        }
    }

    @ObfuscatedName("ahh.pe()V")
    public void method13519() {
        IDirect3DDevice.SetScissorRect(this.field9975, this.field8303 + this.field8293, this.field8291 + this.field8246, this.field8294, this.field8292);
    }

    @ObfuscatedName("ahh.pp()V")
    public void method13520() {
        IDirect3DDevice.method23(this.field9975, 174, this.field8398);
    }

    @ObfuscatedName("ahh.acv(J)V")
    public final void method16028(long arg0) {
        this.field9991 = arg0;
        IDirect3DDevice.SetVertexShader(this.field9975, arg0);
    }

    @ObfuscatedName("ahh.acl(J)V")
    public final void method16029(long arg0) {
        IDirect3DDevice.SetPixelShader(this.field9975, arg0);
    }

    @ObfuscatedName("ahh.of(Lka;Lka;Lka;)V")
    public void method13764(Matrix4x4 arg0, Matrix4x4 arg1, Matrix4x4 arg2) {
        IDirect3DDevice.SetTransform(this.field9975, 256, arg0.entries);
        IDirect3DDevice.SetTransform(this.field9975, 2, arg1.entries);
        IDirect3DDevice.SetTransform(this.field9975, 3, arg2.entries);
    }

    @ObfuscatedName("ahh.ph(Lka;)V")
    public void method13638(Matrix4x4 arg0) {
        arg0.method5384(this.field9996);
    }

    @ObfuscatedName("ahh.py()V")
    public void method13536() {
        IDirect3DDevice.method23(this.field9975, 7, this.field8307);
    }

    @ObfuscatedName("ahh.pu()V")
    public void method13537() {
        IDirect3DDevice.method23(this.field9975, 14, this.field8305 && this.field8367);
    }

    @ObfuscatedName("ahh.qd()V")
    public void method13618() {
        if (this.field8242) {
            IDirect3DDevice.method23(this.field9975, 137, this.field8231 && !this.field8287);
        }
    }

    @ObfuscatedName("ahh.qm()V")
    public void method13540() {
        if (this.field8242) {
            D3DLIGHT.SetAmbient(this.field9979, this.field8319 * this.field8316, this.field8319 * this.field8317, this.field8319 * this.field8237, 0.0F);
            this.field9982 = false;
        }
    }

    @ObfuscatedName("ahh.qi()V")
    public void method13541() {
        if (!this.field8242) {
            return;
        }
        float var1 = this.field8309 ? this.field8320 : 0.0F;
        float var2 = this.field8309 ? -this.field8373 : 0.0F;
        D3DLIGHT.SetDiffuse(this.field9979, this.field8316 * var1, this.field8317 * var1, this.field8237 * var1, 0.0F);
        D3DLIGHT.SetDiffuse(this.field9980, this.field8316 * var2, this.field8317 * var2, this.field8237 * var2, 0.0F);
        this.field9982 = false;
    }

    @ObfuscatedName("ahh.qx()V")
    public void method13842() {
        if (this.field8242) {
            D3DLIGHT.SetDirection(this.field9979, -this.field8272[0], -this.field8272[1], -this.field8272[2]);
            D3DLIGHT.SetDirection(this.field9980, -this.field8308[0], -this.field8308[1], -this.field8308[2]);
            this.field9982 = false;
        }
    }

    @ObfuscatedName("ahh.qn()V")
    public void method13628() {
        this.method13541();
        this.method13543();
    }

    @ObfuscatedName("ahh.qq()V")
    public void method13543() {
        if (!this.field8242 || this.field9982) {
            return;
        }
        IDirect3DDevice.LightEnable(this.field9975, 0, false);
        IDirect3DDevice.LightEnable(this.field9975, 1, false);
        IDirect3DDevice.SetLight(this.field9975, 0, this.field9979);
        IDirect3DDevice.SetLight(this.field9975, 1, this.field9980);
        IDirect3DDevice.LightEnable(this.field9975, 0, true);
        IDirect3DDevice.LightEnable(this.field9975, 1, true);
        this.field9982 = true;
    }

    @ObfuscatedName("ahh.qo()V")
    public void method13545() {
        int var1;
        for (var1 = 0; var1 < this.field8324; var1++) {
            Light var2 = this.field8365[var1];
            int var3 = var1 + 2;
            int var4 = var2.method14881();
            float var5 = var2.method14893() / 255.0F;
            D3DLIGHT.SetPosition(this.field9981, (float) var2.method14888(), (float) var2.method14882(), (float) var2.method14879());
            D3DLIGHT.SetDiffuse(this.field9981, (float) (var4 >> 16 & 0xFF) * var5, (float) (var4 >> 8 & 0xFF) * var5, (float) (var4 & 0xFF) * var5, 0.0F);
            D3DLIGHT.SetAttenuation(this.field9981, 0.0F, 0.0F, 1.0F / (float) (var2.method14880() * var2.method14880()));
            D3DLIGHT.SetRange(this.field9981, (float) var2.method14880());
            IDirect3DDevice.SetLight(this.field9975, var3, this.field9981);
            IDirect3DDevice.LightEnable(this.field9975, var3, true);
        }
        while (var1 < this.field8323) {
            IDirect3DDevice.LightEnable(this.field9975, var1 + 2, false);
            var1++;
        }
    }

    @ObfuscatedName("ahh.qr(Lcy;Ldz;)Z")
    public boolean method13546(TextureFormat arg0, DataType arg1) {
        D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
        return HRESULT.method19(IDirect3D.GetAdapterDisplayMode(this.field9974, this.field9989, var3)) && HRESULT.method19(IDirect3D.CheckDeviceFormat(this.field9974, this.field9989, this.field9973, var3.Format, 0, 3, method16037(arg0, arg1)));
    }

    @ObfuscatedName("ahh.qw(Lcy;Ldz;)Z")
    public boolean method13547(TextureFormat arg0, DataType arg1) {
        D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
        return HRESULT.method19(IDirect3D.GetAdapterDisplayMode(this.field9974, this.field9989, var3)) && HRESULT.method19(IDirect3D.CheckDeviceFormat(this.field9974, this.field9989, this.field9973, var3.Format, 0, 4, method16037(arg0, arg1)));
    }

    @ObfuscatedName("ahh.qc(Lcy;Ldz;II)Lhc;")
    public GpuTexture method13550(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
        return new DxTexture(this, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ahh.qh(IIZ[III)Lhc;")
    public GpuTexture method13552(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        return new DxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ahh.qj(Lcy;IIZ[BII)Lhc;")
    public GpuTexture method13599(TextureFormat arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6) {
        return new DxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("ahh.qz(Lcy;IIZ[FII)Lhc;")
    public GpuTexture method13630(TextureFormat arg0, int arg1, int arg2, boolean arg3, float[] arg4, int arg5, int arg6) {
        return new DxTexture(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("ahh.qy(Lcy;Ldz;II)Lii;")
    public GpuTextureRelated1 method13542(TextureFormat arg0, DataType arg1, int arg2, int arg3) {
        return new DxTexture_Sub1(this, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ahh.qv(IZ[[I)Lih;")
    public GpuCubeTexture method13553(int arg0, boolean arg1, int[][] arg2) {
        return new DxCubeTexture(this, arg0, arg1, arg2);
    }

    @ObfuscatedName("ahh.qe(Lcy;IIIZ[B)Lgt;")
    public GpuVolumeTexture method13554(TextureFormat arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        return new DxVolumeTexture(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ahh.acm(Ljq;)V")
    public final void method16045(DxBaseTexture arg0) {
        IDirect3DDevice.SetTexture(this.field9975, this.field8253, arg0.method4923());
        if (this.field8242 && !this.field9986[this.field8253]) {
            this.field9986[this.field8253] = true;
            this.method13572();
            this.method13779();
        }
    }

    @ObfuscatedName("ahh.acr(Labu;)V")
    public final void method16080(DxTexture arg0) {
        this.method16045(arg0);
        if (this.field9998[this.field8253] != arg0.field8807) {
            IDirect3DDevice.SetSamplerState(this.field9975, this.field8253, 1, arg0.field8807 ? 1 : 3);
            this.field9998[this.field8253] = arg0.field8807;
        }
        if (this.field9984[this.field8253] != arg0.field8811) {
            IDirect3DDevice.SetSamplerState(this.field9975, this.field8253, 2, arg0.field8811 ? 1 : 3);
            this.field9984[this.field8253] = arg0.field8811;
        }
    }

    @ObfuscatedName("ahh.acx(Labp;)V")
    public final void method16043(DxVolumeTexture arg0) {
        this.method16045(arg0);
        if (!this.field9998[this.field8253]) {
            IDirect3DDevice.SetSamplerState(this.field9975, this.field8253, 1, 1);
            this.field9998[this.field8253] = true;
        }
        if (!this.field9984[this.field8253]) {
            IDirect3DDevice.SetSamplerState(this.field9975, this.field8253, 2, 1);
            this.field9984[this.field8253] = true;
        }
    }

    @ObfuscatedName("ahh.qb()V")
    public void method13558() {
        if (this.field9986[this.field8253]) {
            this.field9986[this.field8253] = false;
            IDirect3DDevice.SetTexture(this.field9975, this.field8253, 0L);
            this.method13572();
            this.method13779();
        }
    }

    @ObfuscatedName("ahh.ru()V")
    public void method13570() {
        if (this.field9991 != 0L || this.field8306[this.field8253] == TextureTramsformType.field2550) {
            IDirect3DDevice.SetTextureStageState(this.field9975, this.field8253, 24, 0);
            this.field9988[this.field8253] = 0;
            return;
        }
        if (this.field8306[this.field8253] == TextureTramsformType.field2549) {
            IDirect3DDevice.SetTransform(this.field9975, this.field8253 + 16, this.field8331[this.field8253].method5414(this.field9997));
        } else {
            IDirect3DDevice.SetTransform(this.field9975, this.field8253 + 16, this.field8331[this.field8253].method5408(this.field9997));
        }
        int var1 = method16035(this.field8306[this.field8253]);
        if (this.field9988[this.field8253] != var1) {
            IDirect3DDevice.SetTextureStageState(this.field9975, this.field8253, 24, var1);
            this.field9988[this.field8253] = var1;
        }
    }

    @ObfuscatedName("ahh.ra()V")
    public void method13719() {
    }

    @ObfuscatedName("ahh.rf()V")
    public void method13779() {
        if (this.field8242) {
            int var1 = this.field9986[this.field8253] ? method16033(this.field8333[this.field8253]) : 1;
            IDirect3DDevice.SetTextureStageState(this.field9975, this.field8253, 1, var1);
        }
    }

    @ObfuscatedName("ahh.rl()V")
    public void method13572() {
        if (this.field8242) {
            int var1 = this.field9986[this.field8253] ? method16033(this.field8356[this.field8253]) : 1;
            IDirect3DDevice.SetTextureStageState(this.field9975, this.field8253, 4, var1);
        }
    }

    @ObfuscatedName("ahh.rs(ILhp;ZZ)V")
    public final void method13561(int arg0, TextureCombiner arg1, boolean arg2, boolean arg3) {
        if (!this.field8242) {
            return;
        }
        int var5 = 0;
        byte var6;
        switch (arg0) {
            case 1:
                var6 = 3;
                break;
            case 2:
                var6 = 26;
                break;
            default:
                var6 = 2;
        }
        if (arg2) {
            var5 |= 0x20;
        }
        if (arg3) {
            var5 |= 0x10;
        }
        IDirect3DDevice.SetTextureStageState(this.field9975, this.field8253, var6, method16048(arg1) | var5);
    }

    @ObfuscatedName("ahh.rx(ILhp;Z)V")
    public final void method13563(int arg0, TextureCombiner arg1, boolean arg2) {
        if (!this.field8242) {
            return;
        }
        int var4 = 0;
        byte var5;
        switch (arg0) {
            case 1:
                var5 = 6;
                break;
            case 2:
                var5 = 27;
                break;
            default:
                var5 = 5;
        }
        if (arg2) {
            var4 |= 0x10;
        }
        IDirect3DDevice.SetTextureStageState(this.field9975, this.field8253, var5, method16048(arg1) | var4);
    }

    @ObfuscatedName("ahh.rp()V")
    public final void method13569() {
        if (this.field8242) {
            IDirect3DDevice.SetRenderState(this.field9975, 60, this.field8335);
        }
    }

    @ObfuscatedName("ahh.ach(Lhi;)I")
    public static final int method16033(TextureCombineMode arg0) {
        switch (arg0.field2578) {
            case 0:
                return 26;
            case 1:
                return 4;
            case 2:
                return 7;
            case 3:
                return 2;
            case 4:
                return 10;
            default:
                throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ahh.acz(Lhp;)I")
    public static final int method16048(TextureCombiner arg0) {
        switch (arg0.field2548) {
            case 0:
                return 2;
            case 1:
                return 0;
            case 2:
                return 3;
            case 3:
                return 1;
            default:
                throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ahh.acb(Lhr;)I")
    public static final int method16035(TextureTramsformType arg0) {
        switch (arg0.field2555) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 256;
            default:
                return 0;
        }
    }

    @ObfuscatedName("ahh.ro(I)V")
    public void method13637(int arg0) {
        IDirect3DDevice.SetRenderState(this.field9975, 168, arg0);
    }

    @ObfuscatedName("ahh.rb()V")
    public void method13633() {
        IDirect3DDevice.method23(this.field9975, 15, this.field8377);
    }

    @ObfuscatedName("ahh.rn()V")
    public void method13576() {
        switch (this.field8369.field2539) {
            case 0:
                IDirect3DDevice.SetRenderState(this.field9975, 19, 2);
                IDirect3DDevice.SetRenderState(this.field9975, 20, 2);
                break;
            case 1:
                IDirect3DDevice.SetRenderState(this.field9975, 19, 5);
                IDirect3DDevice.SetRenderState(this.field9975, 20, 6);
                break;
            case 2:
                IDirect3DDevice.SetRenderState(this.field9975, 19, 9);
                IDirect3DDevice.SetRenderState(this.field9975, 20, 2);
                break;
            case 3:
                IDirect3DDevice.SetRenderState(this.field9975, 19, 2);
                IDirect3DDevice.SetRenderState(this.field9975, 20, 1);
        }
        switch (this.field8399) {
            case 0:
                IDirect3DDevice.SetRenderState(this.field9975, 207, 1);
                IDirect3DDevice.SetRenderState(this.field9975, 208, 1);
                break;
            case 1:
                IDirect3DDevice.SetRenderState(this.field9975, 207, 2);
                IDirect3DDevice.SetRenderState(this.field9975, 208, 1);
                break;
            case 2:
                IDirect3DDevice.SetRenderState(this.field9975, 207, 2);
                IDirect3DDevice.SetRenderState(this.field9975, 208, 2);
        }
    }

    @ObfuscatedName("ahh.rr()V")
    public void method13701() {
        IDirect3DDevice.method23(this.field9975, 27, this.field8241);
    }

    @ObfuscatedName("ahh.sd()V")
    public void method13581() {
        if (this.field8242) {
            IDirect3DDevice.method23(this.field9975, 28, this.field8250 && this.field8361 && this.field8364 >= 0);
        }
    }

    @ObfuscatedName("ahh.se()V")
    public void method13580() {
        this.field8304 = this.field8290 - (float) this.field8390;
        this.field8251 = this.field8304 - (float) this.field8364;
        if (this.field8251 < this.field8289) {
            this.field8251 = this.field8289;
        }
        if (this.field8242) {
            IDirect3DDevice.method22(this.field9975, 36, this.field8251);
            IDirect3DDevice.method22(this.field9975, 37, this.field8304);
            IDirect3DDevice.SetRenderState(this.field9975, 34, this.field8363);
        }
    }

    @ObfuscatedName("ahh.so(Z)V")
    public void method13582(boolean arg0) {
        IDirect3DDevice.method23(this.field9975, 161, arg0);
    }

    @ObfuscatedName("ahh.st(Z)Lin;")
    public final IndexBuffer method13797(boolean arg0) {
        return new DxIndexBuffer(this, DataType.field1502, arg0);
    }

    @ObfuscatedName("ahh.sz(Z)Lhe;")
    public final VertexBuffer method13584(boolean arg0) {
        return new DxVertexBuffer(this, arg0);
    }

    @ObfuscatedName("ahh.sb([Lhu;)Lhy;")
    public VertexDeclaration method13585(VertexDeclarationElement[] arg0) {
        return new DxVertexDeclaration(this, arg0);
    }

    @ObfuscatedName("ahh.sa(Lhy;)V")
    public void method13688(VertexDeclaration arg0) {
        DxVertexDeclaration var2 = (DxVertexDeclaration) arg0;
        IDirect3DDevice.SetVertexDeclaration(this.field9975, var2.field8786);
    }

    @ObfuscatedName("ahh.sl(ILhe;)V")
    public void method13587(int arg0, VertexBuffer arg1) {
        DxVertexBuffer var3 = (DxVertexBuffer) arg1;
        IDirect3DDevice.SetStreamSource(this.field9975, arg0, var3.field3335, 0, var3.method4934());
    }

    @ObfuscatedName("ahh.sf(Lin;)V")
    public void method13588(IndexBuffer arg0) {
        IDirect3DDevice.SetIndices(this.field9975, ((DxIndexBuffer) arg0).field3320);
    }

    @ObfuscatedName("ahh.sn(Lir;II)V")
    public final void method13619(PrimitiveType arg0, int arg1, int arg2) {
        if (this.field9990 != null) {
            this.field9990.method13918();
        }
        IDirect3DDevice.DrawPrimitive(this.field9975, method16027(arg0), arg1, arg2);
    }

    @ObfuscatedName("ahh.su(Lin;Lir;IIII)V")
    public final void method13595(IndexBuffer arg0, PrimitiveType arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field9990 != null) {
            this.field9990.method13918();
        }
        IDirect3DDevice.DrawIndexedPrimitiveIB(this.field9975, ((DxIndexBuffer) arg0).field3320, 4, 0, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ahh.sh(Lir;IIII)V")
    public final void method13596(PrimitiveType arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field9990 != null) {
            this.field9990.method13918();
        }
        IDirect3DDevice.DrawIndexedPrimitive(this.field9975, method16027(arg0), 0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ahh.act(Ljava/lang/String;)[B")
    public byte[] method16036(String arg0) {
        return this.method13491("dx", arg0);
    }

    @ObfuscatedName("ahh.y(Ljava/lang/String;)Lec;")
    public GpuShader method13490(String arg0) {
        byte[] var2 = this.method16036(arg0);
        if (var2 == null) {
            return null;
        } else {
            ShaderData var3 = this.method13492(var2);
            return new DxProgramManager(this, var3);
        }
    }

    @ObfuscatedName("ahh.b(I)V")
    public final synchronized void method444(int arg0) {
        for (int var2 = 0; var2 < this.field9999; var2++) {
            IUnknown.Release(this.field10000[var2]);
        }
        this.field9999 = 0;
        super.method444(arg0);
    }

    @ObfuscatedName("ahh.acf(Lcy;Ldz;)I")
    public static final int method16037(TextureFormat arg0, DataType arg1) {
        switch (arg1.field1507) {
            case 2:
                switch (arg0.field1305) {
                    case 0:
                        return 51;
                    case 1:
                        return 21;
                    case 2:
                        return 77;
                    case 3:
                    default:
                        throw new IllegalArgumentException("");
                    case 4:
                        return 22;
                    case 5:
                        return class2.field225;
                    case 6:
                        return 50;
                    case 7:
                        return class2.field226;
                    case 8:
                        return 28;
                }
            case 6:
                if (TextureFormat.field1296 == arg0) {
                    return 113;
                }
                break;
            case 7:
                if (TextureFormat.field1296 == arg0) {
                    return 116;
                }
        }
        throw new IllegalArgumentException("");
    }

    @ObfuscatedName("ahh.acj(Ldz;)I")
    public static final int method16022(DataType arg0) {
        if (DataType.field1502 == arg0) {
            return 80;
        } else if (DataType.field1503 == arg0) {
            return 77;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @ObfuscatedName("ahh.acd(Lir;)I")
    public static final int method16027(PrimitiveType arg0) {
        switch (arg0.field2579) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
                return 3;
            default:
                throw new IllegalArgumentException("");
        }
    }

    @ObfuscatedName("ahh.db(Z)V")
    public void method471(boolean arg0) {
    }

    @ObfuscatedName("ahh.acq(IIJILjagdx/D3DPRESENT_PARAMETERS;)Z")
    public static boolean method16034(int arg0, int arg1, long arg2, int arg3, D3DPRESENT_PARAMETERS arg4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (HRESULT.method18(IDirect3D.GetAdapterDisplayMode(arg2, arg0, var9))) {
                return false;
            }
            label76:
            while (arg3 >= 0) {
                if (arg3 != 1) {
                    var8 = arg3;
                    for (int var10 = 0; var10 < field9993.length; var10++) {
                        if (IDirect3D.CheckDeviceType(arg2, arg0, arg1, var9.Format, field9993[var10], true) == 0 && IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, var9.Format, 1, 1, field9993[var10]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, field9993[var10], true, var8) == 0)) {
                            for (int var11 = 0; var11 < field9983.length; var11++) {
                                if (IDirect3D.CheckDeviceFormat(arg2, arg0, arg1, var9.Format, 2, 1, field9983[var11]) == 0 && IDirect3D.CheckDepthStencilMatch(arg2, arg0, arg1, var9.Format, field9993[var10], field9983[var11]) == 0 && (arg3 == 0 || IDirect3D.CheckDeviceMultiSampleType(arg2, arg0, arg1, field9983[var10], true, var8) == 0)) {
                                    var7 = field9993[var10];
                                    var6 = field9983[var11];
                                    break label76;
                                }
                            }
                        }
                    }
                }
                arg3--;
            }
            if (arg3 < 0 || var7 == 0 || var6 == 0) {
                return false;
            }
            arg4.BackBufferFormat = var7;
            arg4.AutoDepthStencilFormat = var6;
            arg4.MultiSampleType = var8;
            arg4.MultiSampleQuality = 0;
            return true;
        } catch (Throwable var13) {
            return false;
        }
    }

    @ObfuscatedName("ahh.acs(J)V")
    public synchronized void method16038(long arg0) {
        if (this.field9999 == this.field9972) {
            this.field9972 *= 2;
            long[] var3 = new long[this.field9972];
            System.arraycopy(this.field10000, 0, var3, 0, this.field9999);
            this.field10000 = var3;
        }
        this.field10000[this.field9999] = arg0;
        this.field9999++;
    }

    @ObfuscatedName("ahh.sp(I)V")
    public void method13523(int arg0) {
        if (!this.field9985) {
            int var2 = (arg0 & 0x2) == 0 ? 3 : 2;
            IDirect3DDevice.SetRenderState(this.field9975, 8, var2);
        }
    }
}
