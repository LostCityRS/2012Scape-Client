import deob.ObfuscatedName;

@ObfuscatedName("ck")
public class DynamicLoc {

    @ObfuscatedName("ck.u")
    public LocTypeList field1215;

    @ObfuscatedName("ck.j")
    public byte field1212;

    @ObfuscatedName("ck.a")
    public byte field1213;

    @ObfuscatedName("ck.s")
    public GraphEntity field1217;

    @ObfuscatedName("ck.c")
    public int field1219;

    @ObfuscatedName("ck.m")
    public int field1226;

    @ObfuscatedName("ck.t")
    public int field1216;

    @ObfuscatedName("ck.l")
    public boolean field1218 = false;

    @ObfuscatedName("ck.f")
    public Model field1222;

    @ObfuscatedName("ck.d")
    public AnimationNode field1220;

    @ObfuscatedName("ck.z")
    public int field1221;

    @ObfuscatedName("ck.n")
    public int field1214 = -1;

    @ObfuscatedName("ck.o")
    public int field1223 = 0;

    @ObfuscatedName("ck.q")
    public boolean field1211 = false;

    @ObfuscatedName("ck.p")
    public boolean field1225;

    @ObfuscatedName("ck.w")
    public HardShadow field1224;

    @ObfuscatedName("ck.b")
    public boolean field1227 = false;

    @ObfuscatedName("ck.x")
    public boolean[] field1228;

    @ObfuscatedName("ck.i")
    public ParticleSystem field1229;

    @ObfuscatedName("ck.v")
    public LocTypeCustomisation field1230;

    public DynamicLoc(RendererToolkit arg0, LocTypeList arg1, LocType arg2, int arg3, int arg4, int arg5, int arg6, GraphEntity arg7, boolean arg8, int arg9) {
        this.field1215 = arg1;
        this.field1219 = arg2.field6474;
        this.field1226 = arg3;
        this.field1216 = arg4;
        this.field1217 = arg7;
        this.field1211 = arg9 != -1;
        this.field1212 = (byte) arg5;
        this.field1213 = (byte) arg6;
        this.field1218 = arg8;
        this.field1225 = arg0.method449() && arg2.field6541 && !this.field1218;
        this.field1220 = new EntityAnimationNode(arg7, false);
        this.method2439(false, arg9, 1);
    }

    @ObfuscatedName("ck.u(II)V")
    public void method2451(int arg0) {
        this.field1211 = true;
        this.method2439(false, arg0, 1);
    }

    @ObfuscatedName("ck.j(I)I")
    public int method2434() {
        return this.field1223;
    }

    @ObfuscatedName("ck.a(Lto;B)V")
    public void method2452(LocTypeCustomisation arg0) {
        this.field1230 = arg0;
        this.field1222 = null;
    }

    @ObfuscatedName("ck.s(B)I")
    public int method2436() {
        return -this.method2434();
    }

    @ObfuscatedName("ck.c(Lra;IZZI)Lqa;")
    public final Model method2437(RendererToolkit arg0, int arg1, boolean arg2, boolean arg3) {
        LocType var5 = this.field1215.get(this.field1219);
        if (var5.multiloc != null) {
            var5 = var5.getMultiLoc(client.field8988 == 0 ? CutsceneManager.field1538 : Statics.field2669);
        }
        if (var5 == null) {
            this.method2441(arg0);
            this.field1214 = -1;
            return null;
        }
        if (!this.field1211 && this.field1214 != var5.field6474) {
            this.method2439(true, -1, 0);
            this.field1227 = false;
            this.field1222 = null;
        }
        this.method2432(this.field1217);
        if (arg3) {
            arg3 &= this.field1225 & !this.field1227 & Statics.options.sceneryShadows.method15747() != 0;
        }
        if (arg2 && !arg3) {
            this.field1214 = var5.field6474;
            return null;
        }
        Vector3 var6 = this.field1217.getTransform().trans;
        Scene var7 = client.world.getScene();
        if (arg3) {
            var7.method7451(this.field1224, this.field1213, (int) var6.x, (int) var6.z, this.field1228);
            this.field1227 = false;
        }
        FloorModel var8 = var7.field4498[this.field1213];
        FloorModel var9;
        if (this.field1218) {
            var9 = var7.field4527[0];
        } else {
            var9 = this.field1213 < 3 ? var7.field4498[this.field1213 + 1] : null;
        }
        Model var10 = null;
        if (this.field1220.method11767()) {
            if (arg3) {
                arg1 |= 0x40000;
            }
            var10 = var5.method11414(arg0, arg1, this.field1226 == 11 ? 10 : this.field1226, this.field1226 == 11 ? this.field1216 + 4 : this.field1216, var8, var9, (int) var6.x, var8.getFineHeight((int) var6.x, (int) var6.z), (int) var6.z, this.field1220, this.field1230);
            if (var10 == null) {
                this.field1228 = null;
                this.field1224 = null;
                this.field1223 = 0;
            } else {
                if (arg3) {
                    if (this.field1228 == null) {
                        this.field1228 = new boolean[4];
                    }
                    this.field1224 = var10.ga(this.field1224);
                    var7.method7445(this.field1224, this.field1213, (int) var6.x, (int) var6.z, this.field1228);
                    this.field1227 = true;
                }
                this.field1223 = var10.YA();
                var10.n();
            }
            this.field1222 = null;
        } else if (this.field1222 != null && (this.field1222.m() & arg1) == arg1 && this.field1214 == var5.field6474) {
            var10 = this.field1222;
        } else {
            if (this.field1222 != null) {
                arg1 |= this.field1222.m();
            }
            Pair var11 = var5.method11447(arg0, arg1, this.field1226 == 11 ? 10 : this.field1226, this.field1226 == 11 ? this.field1216 + 4 : this.field1216, var8, var9, (int) var6.x, var8.getFineHeight((int) var6.x, (int) var6.z), (int) var6.z, arg3, this.field1230);
            if (var11 == null) {
                this.field1228 = null;
                this.field1224 = null;
                this.field1222 = null;
                this.field1223 = 0;
            } else {
                this.field1222 = var10 = (Model) var11.field6757;
                if (arg3) {
                    this.field1224 = (HardShadow) var11.field6756;
                    this.field1228 = null;
                    var7.method7445(this.field1224, this.field1213, (int) var6.x, (int) var6.z, null);
                    this.field1227 = true;
                }
                this.field1223 = var10.YA();
                var10.n();
            }
        }
        this.field1214 = var5.field6474;
        return var10;
    }

    @ObfuscatedName("ck.m(Lra;Lqa;Lkc;IIIIZB)V")
    public void method2438(RendererToolkit arg0, Model arg1, Matrix4x3 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        ModelParticleEmitter[] var9 = arg1.method276();
        ModelParticleEffector[] var10 = arg1.method413();
        if ((this.field1229 == null || this.field1229.field4945) && (var9 != null || var10 != null)) {
            LocType var11 = this.field1215.get(this.field1219);
            if (var11.multiloc != null) {
                var11 = var11.getMultiLoc(client.field8988 == 0 ? CutsceneManager.field1538 : Statics.field2669);
            }
            if (var11 != null) {
                this.field1229 = ParticleSystem.method8123(client.loopCycle, true);
            }
        }
        if (this.field1229 == null) {
            return;
        }
        arg1.method294(arg2);
        if (arg7) {
            this.field1229.method8106(arg0, (long) client.loopCycle, var9, var10, false);
        } else {
            this.field1229.method8105((long) client.loopCycle);
        }
        this.field1229.method8110(this.field1212, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("ck.t(B)Z")
    public boolean method2435() {
        return this.field1225;
    }

    @ObfuscatedName("ck.l(Lra;B)V")
    public void method2440(RendererToolkit arg0) {
        this.method2437(arg0, 262144, true, true);
    }

    @ObfuscatedName("ck.f(Lra;I)V")
    public void method2441(RendererToolkit arg0) {
        if (this.field1224 != null) {
            Vector3 var2 = this.field1217.getTransform().trans;
            client.world.getScene().method7451(this.field1224, this.field1213, (int) var2.x, (int) var2.z, this.field1228);
            this.field1228 = null;
            this.field1224 = null;
        }
    }

    @ObfuscatedName("ck.d(Laes;I)V")
    public void method2432(GraphEntity arg0) {
        if (!this.field1220.method11767()) {
            this.method2439(false, -1, 0);
        } else if (this.field1220.method11787(client.loopCycle - this.field1221)) {
            if (Statics.options.sceneryShadows.method15747() == 2) {
                this.field1227 = false;
            }
            if (this.field1220.method11784()) {
                this.field1220.method11769(-1);
                this.field1211 = false;
                this.method2439(false, -1, 0);
            }
        }
        this.field1221 = client.loopCycle;
    }

    @ObfuscatedName("ck.z(ZIIB)V")
    public void method2439(boolean arg0, int arg1, int arg2) {
        int var4 = arg1;
        boolean var5 = false;
        if (arg1 == -1) {
            LocType var6 = this.field1215.get(this.field1219);
            LocType var7 = var6;
            if (var6.multiloc != null) {
                var6 = var6.getMultiLoc(client.field8988 == 0 ? CutsceneManager.field1538 : Statics.field2669);
            }
            if (var6 == null) {
                return;
            }
            if (var6 == var7) {
                var7 = null;
            }
            if (var6.method11409()) {
                if (arg0 && this.field1220.method11767() && var6.method11423(this.field1220.getSeqTypeId())) {
                    return;
                }
                if (this.field1214 != var6.field6474) {
                    var5 = var6.field6539;
                }
                var4 = var6.method11421();
                if (var6.method11434()) {
                    arg2 = 0;
                } else {
                    arg2 = 1;
                }
            } else if (var7 != null && var7.method11409()) {
                if (arg0 && this.field1220.method11767() && var7.method11423(this.field1220.getSeqTypeId())) {
                    return;
                }
                if (this.field1214 != var6.field6474) {
                    var5 = var7.field6539;
                }
                var4 = var7.method11421();
                if (var7.method11434()) {
                    arg2 = 0;
                } else {
                    arg2 = 1;
                }
            }
        }
        if (var4 == -1) {
            this.field1220.method11772(-1, false);
        } else {
            this.field1220.method11803(var4, 0, arg2, var5);
            this.field1221 = client.loopCycle;
            this.field1227 = false;
            this.field1222 = null;
        }
    }
}
