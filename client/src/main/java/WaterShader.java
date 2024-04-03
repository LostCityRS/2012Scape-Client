import deob.ObfuscatedName;

@ObfuscatedName("abf")
public abstract class WaterShader extends GpuRendererRelated2 {

    @ObfuscatedName("abf.j")
    public GpuShader field8778;

    @ObfuscatedName("abf.a")
    public GpuProgramUniform field8750;

    @ObfuscatedName("abf.s")
    public GpuProgramUniform field8749;

    @ObfuscatedName("abf.c")
    public GpuProgramUniform field8752;

    @ObfuscatedName("abf.m")
    public GpuProgramUniform field8753;

    @ObfuscatedName("abf.t")
    public GpuProgramUniform field8754;

    @ObfuscatedName("abf.l")
    public GpuProgramUniform field8767;

    @ObfuscatedName("abf.f")
    public GpuProgramUniform field8756;

    @ObfuscatedName("abf.d")
    public GpuProgramUniform field8774;

    @ObfuscatedName("abf.z")
    public GpuProgramUniform field8769;

    @ObfuscatedName("abf.n")
    public GpuProgramUniform field8759;

    @ObfuscatedName("abf.o")
    public GpuProgramUniform field8760;

    @ObfuscatedName("abf.q")
    public GpuProgramUniform field8761;

    @ObfuscatedName("abf.p")
    public GpuProgramUniform field8762;

    @ObfuscatedName("abf.w")
    public GpuProgramUniform field8763;

    @ObfuscatedName("abf.b")
    public GpuProgramUniform field8766;

    @ObfuscatedName("abf.x")
    public GpuProgramUniform field8765;

    @ObfuscatedName("abf.ay")
    public int field8755;

    @ObfuscatedName("abf.af")
    public int[] field8775;

    @ObfuscatedName("abf.ar")
    public static final Matrix4x4 field8777 = new Matrix4x4();

    @ObfuscatedName("abf.an")
    public Matrix4x4[] field8770;

    @ObfuscatedName("abf.ap")
    public float[] field8764 = new float[3];

    public WaterShader(GpuToolkit arg0) {
        super(arg0);
        new Matrix4x3();
        this.field8770 = new Matrix4x4[this.field2414.field8337];
        for (int var2 = 0; var2 < this.field2414.field8337; var2++) {
            this.field8770[var2] = new Matrix4x4();
        }
    }

    @ObfuscatedName("abf.y(Ljava/lang/String;)Z")
    public boolean method14134(String arg0) throws ShaderException {
        this.field8778 = this.field2414.method13490(arg0);
        if (this.field8778 == null) {
            throw new ShaderException("");
        }
        this.field8750 = this.field8778.method3360("textureMatrix");
        this.field8749 = this.field8778.method3360("modelMatrix");
        this.field8752 = this.field8778.method3360("viewMatrix");
        this.field8753 = this.field8778.method3360("projectionMatrix");
        this.field8767 = this.field8778.method3360("modelViewMatrix");
        this.field8756 = this.field8778.method3360("modelViewProjectionMatrix");
        this.field8774 = this.field8778.method3360("viewProjectionMatrix");
        this.field8761 = this.field8778.method3360("ambientColour");
        this.field8766 = this.field8778.method3360("sunDirection");
        this.field8762 = this.field8778.method3360("sunColour");
        this.field8763 = this.field8778.method3360("antiSunColour");
        this.field8765 = this.field8778.method3360("sunExponent");
        this.field8769 = this.field8778.method3360("eyePosition");
        this.field8759 = this.field8778.method3360("eyePositionOS");
        this.field8760 = this.field8778.method3360("sunDirectionOS");
        if (this.method14135()) {
            if (this.field8778.method3376() == null) {
                GpuProgram var2 = this.field8778.method3334();
                if (var2 == null) {
                    throw new ShaderException(this.field8778.method3328() + "");
                }
                this.field8778.method3335(var2);
            }
            this.field8755 = this.field8778.method3331();
            this.field8775 = new int[this.field8755];
            return true;
        }
        this.field8778 = null;
        this.field8750 = null;
        this.field8749 = null;
        this.field8752 = null;
        this.field8753 = null;
        this.field8767 = null;
        this.field8756 = null;
        this.field8774 = null;
        this.field8761 = null;
        this.field8766 = null;
        this.field8762 = null;
        this.field8763 = null;
        this.field8765 = null;
        this.field8769 = null;
        this.field8759 = null;
        this.field8760 = null;
        return false;
    }

    @ObfuscatedName("abf.u()V")
    public void method4130() {
        this.field8778.method3325();
        this.field8775[this.field8778.method3401()] = -1;
        this.method14145(0);
        this.method14136();
    }

    @ObfuscatedName("abf.ay()V")
    public void method14136() {
        this.method14141(this.field2414.field8231);
        this.method14151(this.field2414.method13565());
        this.method14138();
        this.method4134();
    }

    @ObfuscatedName("abf.j()V")
    public void method4143() {
        if (this.field8778 != null) {
            this.field8778.method3416();
        }
    }

    @ObfuscatedName("abf.af(Lka;)V")
    public void method14151(Matrix4x4 arg0) {
        if (this.field8778 == null || !this.field8778.method3327() || this.field2414.method13556() != 0) {
            return;
        }
        int var2 = this.field8778.method3401();
        if ((this.field8775[var2] & 0x80) != 0 && this.field8750 != null) {
            this.field8778.method3356(this.field8750, arg0);
            this.field8775[var2] &= 0xFFFFFF7F;
        }
    }

    @ObfuscatedName("abf.ar()V")
    public void method14138() {
        if (this.field8778 == null || !this.field8778.method3327()) {
            return;
        }
        int var1 = this.field8778.method3401();
        int var2 = this.field8775[var1];
        if ((var2 & 0x1) != 0 && this.field8749 != null) {
            this.field8778.method3371(this.field8749, this.field2414.method13526());
        }
        if ((var2 & 0x2) != 0) {
            if (this.field8752 != null) {
                this.field8778.method3371(this.field8752, this.field2414.method13690());
            }
            if (this.field8769 != null) {
                this.field8764[0] = 0.0F;
                this.field8764[1] = 0.0F;
                this.field8764[2] = 0.0F;
                this.field2414.method525().method5120(this.field8764[0], this.field8764[1], this.field8764[2], this.field8764);
                this.field8778.method3341(this.field8769, this.field8764[0], this.field8764[1], this.field8764[2]);
            }
        }
        if ((var2 & 0x10) != 0 && this.field8767 != null) {
            this.field8778.method3371(this.field8767, this.field2414.method13504());
        }
        if ((var2 & 0x8) != 0 && this.field8754 != null) {
            this.field8778.method3371(this.field8754, this.field2414.method13522());
        }
        if ((var2 & 0x4) != 0 && this.field8753 != null) {
            this.field8778.method3371(this.field8753, this.field2414.method13511());
        }
        if ((var2 & 0x20) != 0 && this.field8756 != null) {
            field8777.method5383(this.field2414.method13504(), this.field2414.method13511());
            this.field8778.method3371(this.field8756, field8777);
        }
        if ((var2 & 0x40) != 0 && this.field8774 != null) {
            field8777.method5383(this.field2414.method13690(), this.field2414.method13511());
            this.field8778.method3371(this.field8774, field8777);
        }
        if (this.field2414.method13556() == 0 && (this.field8775[var1] & 0x80) != 0 && this.field8750 != null) {
            this.field8778.method3356(this.field8750, this.field2414.method13565());
            this.field8775[var1] &= 0xFFFFFF7F;
        }
        this.field8775[var1] = 0;
    }

    @ObfuscatedName("abf.an(ILkc;)V")
    public void method14139(int arg0, Matrix4x3 arg1) {
        if (this.field8759 == null) {
            return;
        }
        Matrix4x4 var3 = this.field2414.method13522();
        float[] var4 = new float[]{var3.field3480[12], var3.field3480[13], var3.field3480[14]};
        float[] var5 = new float[]{0.0F, 0.0F, 0.0F};
        var3.method5470(var5);
        float[] var6 = new float[]{0.0F, 0.0F, 0.0F};
        this.field2414.method525().method5119(0.0F, 0.0F, 0.0F, var6);
        arg1.method5121(var4);
        this.field8778.method3341(this.field8759, var4[0], var4[1], var4[2]);
    }

    @ObfuscatedName("abf.ap(ILkc;)V")
    public void method14140(int arg0, Matrix4x3 arg1) {
        if (this.field8760 != null) {
            float[] var3 = new float[]{this.field2414.field8272[0], this.field2414.field8272[1], this.field2414.field8272[2]};
            arg1.method5184(var3);
            this.field8778.method3341(this.field8760, var3[0], var3[1], var3[2]);
        }
    }

    @ObfuscatedName("abf.ag(Z)V")
    public void method14141(boolean arg0) {
        if (this.field8778 == null || !this.field8778.method3327()) {
            return;
        }
        if (this.field8761 != null) {
            this.field8778.method3341(this.field8761, this.field2414.field8319 * this.field2414.field8316, this.field2414.field8319 * this.field2414.field8317, this.field2414.field8319 * this.field2414.field8237);
        }
        if (this.field8766 != null) {
            this.field8778.method3341(this.field8766, this.field2414.field8272[0], this.field2414.field8272[1], this.field2414.field8272[2]);
        }
        if (this.field8762 != null) {
            this.field8778.method3341(this.field8762, this.field2414.field8320 * this.field2414.field8316, this.field2414.field8320 * this.field2414.field8317, this.field2414.field8320 * this.field2414.field8237);
        }
        if (this.field8763 != null) {
            this.field8778.method3341(this.field8763, -this.field2414.field8316 * this.field2414.field8373, -this.field2414.field8317 * this.field2414.field8373, -this.field2414.field8237 * this.field2414.field8373);
        }
        if (this.field8765 != null) {
            this.field8778.method3383(this.field8765, Math.abs(this.field2414.field8272[1]) * 928.0F + 64.0F);
        }
    }

    @ObfuscatedName("abf.c()V")
    public void method4134() {
    }

    @ObfuscatedName("abf.as(I)V")
    public void method14155(int arg0) {
        for (int var2 = 0; var2 < this.field8755; var2++) {
            this.field8775[var2] |= 0x80 << arg0;
        }
    }

    @ObfuscatedName("abf.ai(Lkc;)V")
    public void method14143(Matrix4x3 arg0) {
        Matrix4x4 var2 = this.field2414.field8264;
        var2.method5385(arg0);
        int var3 = this.field8778.method3401();
        if (this.field8749 != null) {
            this.field8778.method3371(this.field8749, var2);
            this.field8775[var3] &= 0xFFFFFFFE;
        }
        if (this.field8767 != null) {
            field8777.method5383(var2, this.field2414.method13690());
            this.field8778.method3371(this.field8767, field8777);
            this.field8775[var3] &= 0xFFFFFFEF;
        }
        if (this.field8756 != null) {
            field8777.method5383(var2, this.field2414.method13528());
            this.field8778.method3371(this.field8756, field8777);
            this.field8775[var3] &= 0xFFFFFFDF;
        }
        this.method14139(var3, arg0);
        this.method14140(var3, arg0);
    }

    @ObfuscatedName("abf.t()V")
    public void method4136() {
        this.method14143(Matrix4x3.field3455);
    }

    @ObfuscatedName("abf.ao(I)V")
    public void method14145(int arg0) {
        this.field8770[0].method5453();
        this.method14155(arg0);
    }

    @ObfuscatedName("abf.e()Z")
    public abstract boolean method14135() throws ShaderException;
}
