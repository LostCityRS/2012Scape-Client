import deob.ObfuscatedName;

@ObfuscatedName("gp")
public class IDKType implements PlayerTypeRelated {

    @ObfuscatedName("gp.u")
    public IDKTypeList field2296;

    @ObfuscatedName("gp.j")
    public int[] field2287;

    @ObfuscatedName("gp.a")
    public short[] field2288;

    @ObfuscatedName("gp.s")
    public short[] field2290;

    @ObfuscatedName("gp.c")
    public short[] field2286;

    @ObfuscatedName("gp.m")
    public short[] field2291;

    @ObfuscatedName("gp.t")
    public byte[] field2292;

    @ObfuscatedName("gp.l")
    public byte[] field2293;

    @ObfuscatedName("gp.f")
    public int[] field2294 = new int[]{-1, -1, -1, -1, -1};

    @ObfuscatedName("gp.d")
    public static final int[] field2295 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};

    @ObfuscatedName("gp.z")
    public static final int[] field2289 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};

    @ObfuscatedName("gp.u(Laet;I)V")
    public void method3902(Packet arg0) {
        while (true) {
            int var2 = arg0.method15220();
            if (var2 == 0) {
                return;
            }
            this.method3893(arg0, var2);
        }
    }

    @ObfuscatedName("gp.j(Laet;II)V")
    public void method3893(Packet arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method15220();
        } else if (arg1 == 2) {
            int var3 = arg0.method15220();
            this.field2287 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2287[var4] = arg0.method15411();
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var5 = arg0.method15220();
                this.field2288 = new short[var5];
                this.field2290 = new short[var5];
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field2288[var6] = (short) arg0.method15239();
                    this.field2290[var6] = (short) arg0.method15239();
                }
            } else if (arg1 == 41) {
                int var7 = arg0.method15220();
                this.field2286 = new short[var7];
                this.field2291 = new short[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field2286[var8] = (short) arg0.method15239();
                    this.field2291[var8] = (short) arg0.method15239();
                }
            } else if (arg1 == 44) {
                int var9 = arg0.method15239();
                int var10 = 0;
                for (int var11 = var9; var11 > 0; var11 >>= 0x1) {
                    var10++;
                }
                this.field2292 = new byte[var10];
                byte var12 = 0;
                for (int var13 = 0; var13 < var10; var13++) {
                    if ((var9 & 0x1 << var13) > 0) {
                        this.field2292[var13] = var12++;
                    } else {
                        this.field2292[var13] = -1;
                    }
                }
            } else if (arg1 == 45) {
                int var14 = arg0.method15239();
                int var15 = 0;
                for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
                    var15++;
                }
                this.field2293 = new byte[var15];
                byte var17 = 0;
                for (int var18 = 0; var18 < var15; var18++) {
                    if ((var14 & 0x1 << var18) > 0) {
                        this.field2293[var18] = var17++;
                    } else {
                        this.field2293[var18] = -1;
                    }
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field2294[arg1 - 60] = arg0.method15411();
            }
        }
    }

    @ObfuscatedName("gp.a(B)Z")
    public boolean method3889() {
        if (this.field2287 == null) {
            return true;
        }
        boolean var1 = true;
        Js5 var2 = this.field2296.field2299;
        synchronized (this.field2296.field2299) {
            for (int var3 = 0; var3 < this.field2287.length; var3++) {
                if (!this.field2296.field2299.method5629(this.field2287[var3], 0)) {
                    var1 = false;
                }
            }
            return var1;
        }
    }

    @ObfuscatedName("gp.s(I)Ldw;")
    public ModelUnlit method3890() {
        if (this.field2287 == null) {
            return null;
        }
        ModelUnlit[] var1 = new ModelUnlit[this.field2287.length];
        Js5 var2 = this.field2296.field2299;
        synchronized (this.field2296.field2299) {
            int var3 = 0;
            while (true) {
                if (var3 >= this.field2287.length) {
                    break;
                }
                var1[var3] = ModelUnlit.method2664(this.field2296.field2299, this.field2287[var3], 0);
                var3++;
            }
        }
        for (int var5 = 0; var5 < this.field2287.length; var5++) {
            if (var1[var5].field1314 < 13) {
                var1[var5].method2634(2);
            }
        }
        ModelUnlit var6;
        if (var1.length == 1) {
            var6 = var1[0];
        } else {
            var6 = new ModelUnlit(var1, var1.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2288 != null) {
            for (int var7 = 0; var7 < this.field2288.length; var7++) {
                var6.method2661(this.field2288[var7], this.field2290[var7]);
            }
        }
        if (this.field2286 != null) {
            for (int var8 = 0; var8 < this.field2286.length; var8++) {
                var6.method2656(this.field2286[var8], this.field2291[var8]);
            }
        }
        return var6;
    }

    @ObfuscatedName("gp.c(I)Z")
    public boolean method3891() {
        boolean var1 = true;
        Js5 var2 = this.field2296.field2299;
        synchronized (this.field2296.field2299) {
            for (int var3 = 0; var3 < 5; var3++) {
                if (this.field2294[var3] != -1 && !this.field2296.field2299.method5629(this.field2294[var3], 0)) {
                    var1 = false;
                }
            }
            return var1;
        }
    }

    @ObfuscatedName("gp.m(I)Ldw;")
    public ModelUnlit method3892() {
        ModelUnlit[] var1 = new ModelUnlit[5];
        int var2 = 0;
        Js5 var3 = this.field2296.field2299;
        synchronized (this.field2296.field2299) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field2294[var4] != -1) {
                    var1[var2++] = ModelUnlit.method2664(this.field2296.field2299, this.field2294[var4], 0);
                }
                var4++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var1[var6] != null && var1[var6].field1314 < 13) {
                var1[var6].method2634(2);
            }
        }
        ModelUnlit var7 = new ModelUnlit(var1, var2);
        if (this.field2288 != null) {
            for (int var8 = 0; var8 < this.field2288.length; var8++) {
                var7.method2661(this.field2288[var8], this.field2290[var8]);
            }
        }
        if (this.field2286 != null) {
            for (int var9 = 0; var9 < this.field2286.length; var9++) {
                var7.method2656(this.field2286[var9], this.field2291[var9]);
            }
        }
        return var7;
    }
}
