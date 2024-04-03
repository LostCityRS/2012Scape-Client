import deob.ObfuscatedName;

@ObfuscatedName("aam")
public class ProgrammableModelShader extends ModelShader {

    @ObfuscatedName("aam.g")
    public GpuShader field8682;

    @ObfuscatedName("aam.aq")
    public final Matrix4x4 field8671 = new Matrix4x4();

    @ObfuscatedName("aam.ab")
    public final GpuProgram[] field8686 = new GpuProgram[19];

    @ObfuscatedName("aam.bq")
    public final int[][] field8687 = new int[19][17];

    @ObfuscatedName("aam.bz")
    public int[] field8688;

    public ProgrammableModelShader(GpuToolkit arg0) throws ShaderException {
        super(arg0);
        this.method14042();
    }

    @ObfuscatedName("aam.r(I)Z")
    public boolean method14042() throws ShaderException {
        this.field8682 = this.field2270.method13490("Model");
        GpuProgramUniform var1 = this.field8682.method3357("DiffuseSampler");
        GpuProgramUniform var2 = this.field8682.method3357("EnvironmentSampler");
        GpuProgramUniform var3 = this.field8682.method3357("PointLightsPosAndRadiusSq");
        GpuProgramUniform var4 = this.field8682.method3357("PointLightsDiffuseColour");
        GpuProgramUniform var5 = this.field8682.method3357("WVPMatrix");
        GpuProgramUniform var6 = this.field8682.method3357("TexCoordMatrix");
        GpuProgramUniform var7 = this.field8682.method3357("HeightFogPlane");
        GpuProgramUniform var8 = this.field8682.method3357("HeightFogColour");
        GpuProgramUniform var9 = this.field8682.method3357("DistanceFogPlane");
        GpuProgramUniform var10 = this.field8682.method3357("DistanceFogColour");
        GpuProgramUniform var11 = this.field8682.method3357("SunDir");
        GpuProgramUniform var12 = this.field8682.method3357("SunColour");
        GpuProgramUniform var13 = this.field8682.method3357("AntiSunColour");
        GpuProgramUniform var14 = this.field8682.method3357("AmbientColour");
        GpuProgramUniform var15 = this.field8682.method3357("EyePos");
        GpuProgramUniform var16 = this.field8682.method3357("SpecularExponent");
        GpuProgramUniform var17 = this.field8682.method3357("WorldMatrix");
        this.field8686[0] = this.field8682.method3330("Unlit");
        this.field8686[1] = this.field8682.method3330("Unlit_IgnoreAlpha");
        this.field8686[17] = this.field8682.method3330("UnderwaterGround");
        this.field8686[18] = this.field8682.method3330("UnderwaterGroundSpecular");
        for (int var18 = 0; var18 <= 4; var18++) {
            this.field8686[var18 + 2] = this.field8682.method3330("Standard_" + var18 + "PointLights");
            this.field8686[var18 + 7] = this.field8682.method3330("Specular_" + var18 + "PointLights");
            this.field8686[var18 + 12] = this.field8682.method3330("EnvironmentalMapping_" + var18 + "PointLights");
        }
        for (int var19 = 0; var19 < 19; var19++) {
            int var20 = this.field8682.method3345(this.field8686[var19]);
            this.field8687[var19][2] = var1.method16237(var20);
            this.field8687[var19][3] = var2.method16237(var20);
            this.field8687[var19][1] = var3.method16237(var20);
            this.field8687[var19][0] = var4.method16237(var20);
            this.field8687[var19][4] = var5.method16237(var20);
            this.field8687[var19][5] = var6.method16237(var20);
            this.field8687[var19][7] = var7.method16237(var20);
            this.field8687[var19][8] = var8.method16237(var20);
            this.field8687[var19][9] = var9.method16237(var20);
            this.field8687[var19][10] = var10.method16237(var20);
            this.field8687[var19][11] = var11.method16237(var20);
            this.field8687[var19][12] = var12.method16237(var20);
            this.field8687[var19][13] = var13.method16237(var20);
            this.field8687[var19][14] = var14.method16237(var20);
            this.field8687[var19][6] = var15.method16237(var20);
            this.field8687[var19][15] = var17.method16237(var20);
            this.field8687[var19][16] = var16.method16237(var20);
        }
        this.field8682.method3335(this.field8686[2]);
        return true;
    }

    @ObfuscatedName("aam.j(Lka;)V")
    public void method3848(Matrix4x4 arg0) {
        this.field8671.method5412(arg0);
        this.field8671.method5384(this.field2270.field8279);
    }

    @ObfuscatedName("aam.a(Z)V")
    public void method3849(boolean arg0) {
        if (arg0) {
            this.field8682.method3335(this.field8686[1]);
        } else {
            this.field8682.method3335(this.field8686[0]);
        }
        this.field8688 = this.field8687[this.field8682.method3401()];
        this.field8682.method3325();
        this.field8682.method3353(this.field8688[2], 0, this.field2268);
        this.field8682.method3355(this.field8688[4], this.field8671);
        this.field8682.method3354(this.field8688[5], this.field2248);
        this.field8682.method3350(this.field8688[7], this.field2266.field3426, this.field2266.field3427, this.field2266.field3428, this.field2266.field3429);
        this.field8682.method3349(this.field8688[8], this.field2259.x, this.field2259.y, this.field2259.z);
        this.field8682.method3350(this.field8688[9], this.field2260.field3426, this.field2260.field3427, this.field2260.field3428, this.field2260.field3429);
        this.field8682.method3349(this.field8688[10], this.field2249.x, this.field2249.y, this.field2249.z);
        this.field2270.method13596(PrimitiveType.field2582, this.field2267, this.field2261, this.field2269, this.field2252);
    }

    @ObfuscatedName("aam.t()V")
    public void method3853() {
        this.field8682.method3335(this.field8686[17]);
        this.field8688 = this.field8687[this.field8682.method3401()];
        this.field8682.method3325();
        this.method14043(0);
    }

    @ObfuscatedName("aam.l()V")
    public void method3854() {
        this.field8682.method3335(this.field8686[18]);
        this.field8688 = this.field8687[this.field8682.method3401()];
        this.field8682.method3325();
        this.field8682.method3349(this.field8688[6], this.field2258.x, this.field2258.y, this.field2258.z);
        this.field8682.method3350(this.field8688[16], this.field2254, this.field2257, 0.0F, 0.0F);
        this.method14043(0);
    }

    @ObfuscatedName("aam.g(IB)V")
    public void method14043(int arg0) {
        this.field8682.method3353(this.field8688[2], 0, this.field2268);
        this.field8682.method3355(this.field8688[4], this.field8671);
        this.field8682.method3354(this.field8688[5], this.field2248);
        this.field8682.method3350(this.field8688[7], this.field2266.field3426, this.field2266.field3427, this.field2266.field3428, this.field2266.field3429);
        this.field8682.method3349(this.field8688[8], this.field2259.x, this.field2259.y, this.field2259.z);
        this.field8682.method3350(this.field8688[9], this.field2260.field3426, this.field2260.field3427, this.field2260.field3428, this.field2260.field3429);
        this.field8682.method3349(this.field8688[10], this.field2249.x, this.field2249.y, this.field2249.z);
        this.field8682.method3351(this.field8688[11], this.field2262);
        this.field8682.method3351(this.field8688[12], this.field2263);
        this.field8682.method3351(this.field8688[13], this.field2264);
        this.field8682.method3351(this.field8688[14], this.field2265);
        if (arg0 > 0) {
            this.field8682.method3352(this.field8688[1], this.field2251, arg0 * 4);
            this.field8682.method3352(this.field8688[0], this.field2250, arg0 * 4);
        }
        this.field2270.method13596(PrimitiveType.field2582, this.field2267, this.field2261, this.field2269, this.field2252);
    }

    @ObfuscatedName("aam.s(I)V")
    public void method3850(int arg0) {
        this.field8682.method3335(this.field8686[arg0 + 2]);
        this.field8688 = this.field8687[this.field8682.method3401()];
        this.field8682.method3325();
        this.method14043(arg0);
    }

    @ObfuscatedName("aam.c(I)V")
    public void method3851(int arg0) {
        this.field8682.method3335(this.field8686[arg0 + 7]);
        this.field8688 = this.field8687[this.field8682.method3401()];
        this.field8682.method3325();
        this.field8682.method3349(this.field8688[6], this.field2258.x, this.field2258.y, this.field2258.z);
        this.field8682.method3350(this.field8688[16], this.field2254, this.field2257, 0.0F, 0.0F);
        this.method14043(arg0);
    }

    @ObfuscatedName("aam.m(I)V")
    public void method3852(int arg0) {
        this.field8682.method3335(this.field8686[arg0 + 12]);
        this.field8688 = this.field8687[this.field8682.method3401()];
        this.field8682.method3325();
        this.field8682.method3346(this.field8688[15], this.field2256);
        this.field8682.method3349(this.field8688[6], this.field2258.x, this.field2258.y, this.field2258.z);
        this.field8682.method3353(this.field8688[3], 1, this.field2253);
        this.method14043(arg0);
    }
}
