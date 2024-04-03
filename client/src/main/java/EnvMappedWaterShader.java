import deob.ObfuscatedName;

@ObfuscatedName("ahw")
public class EnvMappedWaterShader extends WaterShader {

    @ObfuscatedName("ahw.ag")
    public final boolean field10134;

    @ObfuscatedName("ahw.as")
    public final GpuWaterRelated field10106;

    @ObfuscatedName("ahw.ai")
    public GpuProgramUniform field10116;

    @ObfuscatedName("ahw.ao")
    public GpuProgramUniform field10108;

    @ObfuscatedName("ahw.al")
    public GpuProgramUniform field10109;

    @ObfuscatedName("ahw.at")
    public final Matrix4x4 field10107 = new Matrix4x4();

    @ObfuscatedName("ahw.ax")
    public GpuProgramUniform field10110;

    @ObfuscatedName("ahw.aw")
    public final Matrix4x4 field10112 = new Matrix4x4();

    @ObfuscatedName("ahw.aa")
    public GpuProgramUniform field10113;

    @ObfuscatedName("ahw.am")
    public final Vector3 field10114 = new Vector3();

    @ObfuscatedName("ahw.ad")
    public int field10115;

    @ObfuscatedName("ahw.az")
    public GpuProgramUniform field10111;

    @ObfuscatedName("ahw.ak")
    public final Vector4 field10135 = new Vector4();

    @ObfuscatedName("ahw.av")
    public GpuProgramUniform field10118;

    @ObfuscatedName("ahw.aj")
    public final Vector4 field10119 = new Vector4();

    @ObfuscatedName("ahw.ah")
    public GpuProgramUniform field10120;

    @ObfuscatedName("ahw.au")
    public final Vector4 field10121 = new Vector4();

    @ObfuscatedName("ahw.ae")
    public GpuProgramUniform field10122;

    @ObfuscatedName("ahw.ac")
    public final Vector4 field10123 = new Vector4();

    @ObfuscatedName("ahw.aq")
    public GpuProgramUniform field10124;

    @ObfuscatedName("ahw.ab")
    public final Vector3 field10125 = new Vector3();

    @ObfuscatedName("ahw.bq")
    public GpuProgramUniform field10126;

    @ObfuscatedName("ahw.bz")
    public final Vector4 field10131 = new Vector4();

    @ObfuscatedName("ahw.bv")
    public GpuProgramUniform field10128;

    @ObfuscatedName("ahw.bj")
    public final Vector3 field10129 = new Vector3();

    @ObfuscatedName("ahw.bf")
    public int field10132;

    @ObfuscatedName("ahw.bt")
    public int field10117;

    @ObfuscatedName("ahw.bg")
    public int field10130;

    @ObfuscatedName("ahw.bl")
    public int field10133;

    @ObfuscatedName("ahw.bk")
    public float field10127 = 0.0F;

    @ObfuscatedName("ahw.bs")
    public boolean field10105;

    @ObfuscatedName("ahw.bn")
    public GpuProgram field10136;

    public EnvMappedWaterShader(GpuToolkit arg0, GpuWaterRelated arg1, boolean arg2) throws ShaderException {
        super(arg0);
        new Matrix4x4();
        this.field10106 = arg1;
        this.field10105 = arg2;
        if (arg0.method13487() && arg0.method13488()) {
            this.field10134 = this.method14134("EnvMappedWater");
        } else {
            this.field10134 = false;
        }
    }

    @ObfuscatedName("ahw.e()Z")
    public boolean method14135() throws ShaderException {
        if (!this.field10106.method4127()) {
            return false;
        }
        this.field10116 = this.field8778.method3357("NormalSampler");
        this.field10108 = this.field8778.method3357("EnvMapSampler");
        this.field10109 = this.field8778.method3357("WVPMatrix");
        this.field10110 = this.field8778.method3357("TexCoordMatrix");
        this.field10113 = this.field8778.method3357("EyePosAndTime");
        this.field10111 = this.field8778.method3357("SunDirectionAndExponent");
        this.field10118 = this.field8778.method3357("SunColourAndWaveExponent");
        this.field10120 = this.field8778.method3357("WaveIntensityAndBreakWaterDepthAndOffset");
        this.field10122 = this.field8778.method3357("HeightFogPlane");
        this.field10124 = this.field8778.method3357("HeightFogColour");
        this.field10126 = this.field8778.method3357("DistanceFogPlane");
        this.field10128 = this.field8778.method3357("DistanceFogColour");
        this.field10136 = this.field8778.method3330(this.field10105 ? "EnvMappedSea" : "EnvMappedWater");
        this.field8778.method3335(this.field10136);
        return true;
    }

    @ObfuscatedName("ahw.bk(I)Z")
    public boolean method16196() {
        return this.field10134;
    }

    @ObfuscatedName("ahw.af(Lka;)V")
    public void method14151(Matrix4x4 arg0) {
        Matrix4x4 var2 = new Matrix4x4();
        var2.method5435(this.field10127, this.field10127, 1.0F, 1.0F);
        var2.method5383(arg0, var2);
        super.method14151(var2);
    }

    @ObfuscatedName("ahw.ag(Z)V")
    public void method14141(boolean arg0) {
        float var2 = (1.0F - Math.abs(this.field2414.field8272[1])) * 2.0F + 1.0F;
        float var3 = this.field2414.field8320;
        this.field2414.field8320 *= var2;
        super.method14141(arg0);
        this.field2414.field8320 = var3;
    }

    @ObfuscatedName("ahw.bs(I)V")
    public void method16204() {
        this.method16197();
        this.field8778.method3335(this.field10136);
        this.field8778.method3325();
        this.field8778.method3336(this.field10116, 0, this.field10106.field2410);
        this.field8778.method3336(this.field10108, 1, this.field2414.method13516());
        this.field8778.method3371(this.field10109, this.field10107);
        this.field8778.method3356(this.field10110, this.field10112);
        int var1 = 0x1 << (this.field10115 & 0x3);
        this.field8778.method3342(this.field10113, this.field10114.field3475, this.field10114.field3476, this.field10114.field3477, (float) (this.field2414.field8391 * var1 % 40000) / 40000.0F);
        this.field8778.method3406(this.field10111, this.field10135);
        this.field8778.method3406(this.field10118, this.field10119);
        this.field8778.method3406(this.field10120, this.field10121);
        this.field8778.method3406(this.field10122, this.field10123);
        this.field8778.method3420(this.field10124, this.field10125);
        this.field8778.method3406(this.field10126, this.field10131);
        this.field8778.method3420(this.field10128, this.field10129);
        this.field2414.method13596(class255.field2582, this.field10132, this.field10117, this.field10130, this.field10133);
    }

    @ObfuscatedName("ahw.bn(B)V")
    public void method16197() {
        this.field10127 = 2.4414062E-4F;
        short var1 = 256;
        float var2 = 0.3F;
        float var3 = 0.4F;
        float var4 = 0.1F;
        byte var5 = 5;
        this.field10112.method5435(this.field10127, this.field10127, this.field10127, this.field10127);
        this.field10135.method5074(-this.field2414.field8272[0], -this.field2414.field8272[1], -this.field2414.field8272[2], 32.0F);
        this.field10119.method5074(this.field2414.field8316, this.field2414.field8317, this.field2414.field8237, (float) var5);
        this.field10121.method5074(var4, var3, (float) var1, var2);
    }
}
