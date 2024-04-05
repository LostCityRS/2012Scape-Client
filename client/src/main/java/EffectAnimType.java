import deob.ObfuscatedName;

@ObfuscatedName("se")
public class EffectAnimType {

    @ObfuscatedName("se.u")
    public EffectAnimTypeList field5256;

    @ObfuscatedName("se.j")
    public int field5250;

    @ObfuscatedName("se.a")
    public int field5251;

    @ObfuscatedName("se.s")
    public int field5252 = -1;

    @ObfuscatedName("se.c")
    public short[] field5261;

    @ObfuscatedName("se.m")
    public short[] field5254;

    @ObfuscatedName("se.t")
    public short[] field5255;

    @ObfuscatedName("se.l")
    public short[] field5266;

    @ObfuscatedName("se.f")
    public byte[] field5249;

    @ObfuscatedName("se.d")
    public byte[] field5258;

    @ObfuscatedName("se.z")
    public int field5259 = 128;

    @ObfuscatedName("se.n")
    public int field5260 = 128;

    @ObfuscatedName("se.o")
    public int field5265 = 0;

    @ObfuscatedName("se.q")
    public int field5257 = 0;

    @ObfuscatedName("se.p")
    public int field5263 = 0;

    @ObfuscatedName("se.w")
    public boolean field5264 = false;

    @ObfuscatedName("se.b")
    public byte field5262 = 0;

    @ObfuscatedName("se.x")
    public int field5253 = -1;

    @ObfuscatedName("se.u(Laet;I)V")
    public void method11100(Packet arg0) {
        while (true) {
            int var2 = arg0.g1();
            if (var2 == 0) {
                return;
            }
            this.method11101(arg0, var2);
        }
    }

    @ObfuscatedName("se.j(Laet;II)V")
    public void method11101(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field5251 = arg0.gSmart2or4null();
        } else if (arg1 == 2) {
            this.field5252 = arg0.gSmart2or4null();
        } else if (arg1 == 4) {
            this.field5259 = arg0.g2();
        } else if (arg1 == 5) {
            this.field5260 = arg0.g2();
        } else if (arg1 == 6) {
            this.field5265 = arg0.g2();
        } else if (arg1 == 7) {
            this.field5257 = arg0.g1();
        } else if (arg1 == 8) {
            this.field5263 = arg0.g1();
        } else if (arg1 == 9) {
            this.field5262 = 3;
            this.field5253 = 8224;
        } else if (arg1 == 10) {
            this.field5264 = true;
        } else if (arg1 == 11) {
            this.field5262 = 1;
        } else if (arg1 == 12) {
            this.field5262 = 4;
        } else if (arg1 == 13) {
            this.field5262 = 5;
        } else if (arg1 == 14) {
            this.field5262 = 2;
            this.field5253 = arg0.g1() * 256;
        } else if (arg1 == 15) {
            this.field5262 = 3;
            this.field5253 = arg0.g2();
        } else if (arg1 == 16) {
            this.field5262 = 3;
            this.field5253 = arg0.g4s();
        } else if (arg1 == 40) {
            int var3 = arg0.g1();
            this.field5261 = new short[var3];
            this.field5254 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field5261[var4] = (short) arg0.g2();
                this.field5254[var4] = (short) arg0.g2();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.g1();
            this.field5255 = new short[var5];
            this.field5266 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field5255[var6] = (short) arg0.g2();
                this.field5266[var6] = (short) arg0.g2();
            }
        } else if (arg1 == 44) {
            int var7 = arg0.g2();
            int var8 = 0;
            for (int var9 = var7; var9 > 0; var9 >>= 0x1) {
                var8++;
            }
            this.field5249 = new byte[var8];
            byte var10 = 0;
            for (int var11 = 0; var11 < var8; var11++) {
                if ((var7 & 0x1 << var11) > 0) {
                    this.field5249[var11] = var10++;
                } else {
                    this.field5249[var11] = -1;
                }
            }
        } else if (arg1 == 45) {
            int var12 = arg0.g2();
            int var13 = 0;
            for (int var14 = var12; var14 > 0; var14 >>= 0x1) {
                var13++;
            }
            this.field5258 = new byte[var13];
            byte var15 = 0;
            for (int var16 = 0; var16 < var13; var16++) {
                if ((var12 & 0x1 << var16) > 0) {
                    this.field5258[var16] = var15++;
                } else {
                    this.field5258[var16] = -1;
                }
            }
        }
    }

    @ObfuscatedName("se.a(Lra;ILtt;BB)Lqa;")
    public final Model method11102(RendererToolkit arg0, int arg1, AnimationNode arg2, byte arg3) {
        return this.method11103(arg0, arg1, false, null, null, 0, 0, 0, arg2, arg3);
    }

    @ObfuscatedName("se.s(Lra;IZLxa;Lxa;IIILtt;BI)Lqa;")
    public final Model method11103(RendererToolkit arg0, int arg1, boolean arg2, FloorModel arg3, FloorModel arg4, int arg5, int arg6, int arg7, AnimationNode arg8, byte arg9) {
        int var11 = arg1;
        boolean var12 = arg2 & this.field5262 != 0;
        if (arg8 != null) {
            var11 = arg1 | arg8.method11779();
        }
        if (var12) {
            var11 |= this.field5262 == 3 ? 7 : 2;
        }
        if (this.field5260 != 128) {
            var11 |= 0x2;
        }
        if (this.field5259 != 128 || this.field5265 != 0) {
            var11 |= 0x5;
        }
        SoftLruHashTable var13 = this.field5256.field5245;
        Model var14;
        synchronized (this.field5256.field5245) {
            var14 = (Model) this.field5256.field5245.get((long) (this.field5250 |= arg0.field397 << 29));
        }
        if (var14 == null || arg0.method519(var14.m(), var11) != 0) {
            if (var14 != null) {
                var11 = arg0.method520(var11, var14.m());
            }
            int var16 = var11;
            if (this.field5261 != null) {
                var16 = var11 | 0x4000;
            }
            if (this.field5255 != null) {
                var16 |= 0x8000;
            }
            ModelUnlit var17 = ModelUnlit.method2664(this.field5256.field5244, this.field5251, 0);
            if (var17 == null) {
                return null;
            }
            if (var17.field1314 < 13) {
                var17.method2634(2);
            }
            var14 = arg0.method625(var17, var16, this.field5256.field5248, this.field5257 + 64, this.field5263 + 850);
            if (this.field5261 != null) {
                for (int var18 = 0; var18 < this.field5261.length; var18++) {
                    var14.X(this.field5261[var18], this.field5254[var18]);
                }
            }
            if (this.field5255 != null) {
                for (int var19 = 0; var19 < this.field5255.length; var19++) {
                    var14.W(this.field5255[var19], this.field5266[var19]);
                }
            }
            var14.KA(var11);
            SoftLruHashTable var20 = this.field5256.field5245;
            synchronized (this.field5256.field5245) {
                this.field5256.field5245.method7937(var14, (long) (this.field5250 |= arg0.field397 << 29));
            }
        }
        Model var22 = var14.method295(arg9, var11, true);
        if (arg8 != null) {
            arg8.method11780(var22, 0);
        }
        if (this.field5259 != 128 || this.field5260 != 128) {
            var22.oa(this.field5259, this.field5260, this.field5259);
        }
        if (this.field5265 != 0) {
            if (this.field5265 == 90) {
                var22.f(4096);
            }
            if (this.field5265 == 180) {
                var22.f(8192);
            }
            if (this.field5265 == 270) {
                var22.f(12288);
            }
        }
        if (var12) {
            var22.pa(this.field5262, this.field5253, arg3, arg4, arg5, arg6, arg7);
        }
        var22.KA(arg1);
        return var22;
    }

    @ObfuscatedName("se.c(I)Z")
    public final boolean method11104() {
        return this.field5251 == -1 ? true : this.field5256.field5244.method5629(this.field5251, 0);
    }
}
