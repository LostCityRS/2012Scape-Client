import deob.ObfuscatedName;

@ObfuscatedName("qf")
public class Environment {

    @ObfuscatedName("qf.u")
    public int field4991;

    @ObfuscatedName("qf.j")
    public float field4987;

    @ObfuscatedName("qf.a")
    public float field4988;

    @ObfuscatedName("qf.s")
    public float field4996;

    @ObfuscatedName("qf.c")
    public Vector3 field4990;

    @ObfuscatedName("qf.m")
    public int field4989;

    @ObfuscatedName("qf.t")
    public int field4997;

    @ObfuscatedName("qf.l")
    public EnvironmentSampler field4993;

    @ObfuscatedName("qf.f")
    public float field4992;

    @ObfuscatedName("qf.d")
    public float field4995;

    @ObfuscatedName("qf.z")
    public float field4994;

    @ObfuscatedName("qf.n")
    public SkyBox field4986;

    public Environment() {
        this.method8202();
    }

    public Environment(Packet arg0, EnvironmentManager arg1) {
        this.method8205(arg0, arg1);
    }

    @ObfuscatedName("qf.u(I)V")
    public void method8202() {
        this.field4991 = EnvironmentManager.field4983;
        this.field4990 = Vector3.create(-50.0F, -60.0F, -50.0F);
        this.field4987 = 1.1523438F;
        this.field4988 = 0.69921875F;
        this.field4996 = 1.2F;
        this.field4989 = EnvironmentManager.field4982;
        this.field4997 = 0;
        this.field4993 = Statics.field4971;
        this.field4992 = 1.0F;
        this.field4995 = 0.25F;
        this.field4994 = 1.0F;
        this.field4986 = Statics.field5193;
    }

    @ObfuscatedName("qf.j(Lqf;B)V")
    public void method8211(Environment arg0) {
        this.field4991 = arg0.field4991;
        this.field4987 = arg0.field4987;
        this.field4988 = arg0.field4988;
        this.field4996 = arg0.field4996;
        this.field4990.method5334(arg0.field4990);
        this.field4989 = arg0.field4989;
        this.field4997 = arg0.field4997;
        this.field4993 = arg0.field4993;
        this.field4992 = arg0.field4992;
        this.field4995 = arg0.field4995;
        this.field4994 = arg0.field4994;
        this.field4986 = arg0.field4986;
    }

    @ObfuscatedName("qf.a(Lra;Lqf;Lqf;FB)V")
    public void method8218(RendererToolkit arg0, Environment arg1, Environment arg2, float arg3) {
        this.field4991 = ColourUtils.method15824(arg1.field4991, arg2.field4991, arg3 * 255.0F);
        this.field4988 = (arg2.field4988 - arg1.field4988) * arg3 + arg1.field4988;
        this.field4996 = (arg2.field4996 - arg1.field4996) * arg3 + arg1.field4996;
        this.field4987 = (arg2.field4987 - arg1.field4987) * arg3 + arg1.field4987;
        this.field4994 = (arg2.field4994 - arg1.field4994) * arg3 + arg1.field4994;
        this.field4992 = (arg2.field4992 - arg1.field4992) * arg3 + arg1.field4992;
        this.field4995 = (arg2.field4995 - arg1.field4995) * arg3 + arg1.field4995;
        this.field4989 = ColourUtils.method15824(arg1.field4989, arg2.field4989, arg3 * 255.0F);
        this.field4997 = (int) ((float) (arg2.field4997 - arg1.field4997) * arg3 + (float) arg1.field4997);
        if (arg1.field4993 != arg2.field4993) {
            this.field4993 = arg0.method537(arg1.field4993, arg2.field4993, arg3, this.field4993);
        }
        if (arg1.field4986 == arg2.field4986) {
            return;
        }
        if (arg1.field4986 == null) {
            this.field4986 = arg2.field4986;
            if (this.field4986 != null) {
                this.field4986.method6378((int) (arg3 * 255.0F), 0);
            }
        } else {
            this.field4986 = arg1.field4986;
            if (this.field4986 != null) {
                this.field4986.method6378((int) (arg3 * 255.0F), 255);
            }
        }
    }

    @ObfuscatedName("qf.s(Laet;Lqp;I)V")
    public void method8205(Packet arg0, EnvironmentManager arg1) {
        int var3 = arg0.g1();
        if (Statics.options.lightDetail.method15667() == 1 && Statics.renderer.method768() > 0) {
            if ((var3 & 0x1) == 0) {
                this.field4991 = EnvironmentManager.field4983;
            } else {
                this.field4991 = arg0.g4s();
            }
            if ((var3 & 0x2) == 0) {
                this.field4987 = 1.1523438F;
            } else {
                this.field4987 = (float) arg0.g2() / 256.0F;
            }
            if ((var3 & 0x4) == 0) {
                this.field4988 = 0.69921875F;
            } else {
                this.field4988 = (float) arg0.g2() / 256.0F;
            }
            if ((var3 & 0x8) == 0) {
                this.field4996 = 1.2F;
            } else {
                this.field4996 = (float) arg0.g2() / 256.0F;
            }
        } else {
            if ((var3 & 0x1) != 0) {
                arg0.g4s();
            }
            if ((var3 & 0x2) != 0) {
                arg0.g2();
            }
            if ((var3 & 0x4) != 0) {
                arg0.g2();
            }
            if ((var3 & 0x8) != 0) {
                arg0.g2();
            }
            this.field4991 = EnvironmentManager.field4983;
            this.field4996 = 1.2F;
            this.field4988 = 0.69921875F;
            this.field4987 = 1.1523438F;
        }
        if ((var3 & 0x10) == 0) {
            this.field4990 = Vector3.create(-50.0F, -60.0F, -50.0F);
        } else {
            this.field4990 = Vector3.create((float) arg0.g2s(), (float) arg0.g2s(), (float) arg0.g2s());
        }
        if ((var3 & 0x20) == 0) {
            this.field4989 = EnvironmentManager.field4982;
        } else {
            this.field4989 = arg0.g4s();
        }
        if ((var3 & 0x40) == 0) {
            this.field4997 = 0;
        } else {
            this.field4997 = arg0.g2();
        }
        if ((var3 & 0x80) == 0) {
            this.field4993 = Statics.field4971;
            return;
        }
        int var4 = arg0.g2();
        int var5 = arg0.g2();
        int var6 = arg0.g2();
        int var7 = arg0.g2();
        int var8 = arg0.g2();
        int var9 = arg0.g2();
        this.field4993 = arg1.method8185(var4, var5, var6, var7, var8, var9);
    }

    @ObfuscatedName("qf.c(Laet;S)V")
    public void method8206(Packet arg0) {
        this.field4992 = (float) (arg0.g1() * 8) / 255.0F;
        this.field4995 = (float) (arg0.g1() * 8) / 255.0F;
        this.field4994 = (float) (arg0.g1() * 8) / 255.0F;
    }

    @ObfuscatedName("qf.m(Laet;Lqp;I)V")
    public void method8207(Packet arg0, EnvironmentManager arg1) {
        int var3 = arg0.g2();
        int var4 = arg0.g2s();
        int var5 = arg0.g2s();
        int var6 = arg0.g2s();
        int var7 = arg0.g2();
        Statics.field3358 = var7;
        this.field4986 = arg1.method8193(var3, var4, var5, var6);
    }

    @ObfuscatedName("qf.t(Lqf;I)Z")
    public boolean method8208(Environment arg0) {
        return this.field4991 == arg0.field4991 && this.field4987 == arg0.field4987 && this.field4988 == arg0.field4988 && this.field4996 == arg0.field4996 && this.field4995 == arg0.field4995 && this.field4992 == arg0.field4992 && this.field4994 == arg0.field4994 && this.field4989 == arg0.field4989 && this.field4997 == arg0.field4997 && this.field4993 == arg0.field4993 && this.field4986 == arg0.field4986;
    }

    @ObfuscatedName("qf.l(B)I")
    public int method8226() {
        return this.field4989;
    }

    @ObfuscatedName("qf.f(I)Lmq;")
    public SkyBox getSkybox() {
        return this.field4986;
    }
}
