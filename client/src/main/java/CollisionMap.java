import deob.ObfuscatedName;

@ObfuscatedName("mv")
public class CollisionMap {

    @ObfuscatedName("mv.ah")
    public int field3857;

    @ObfuscatedName("mv.au")
    public int field3893;

    @ObfuscatedName("mv.ae")
    public int field3894;

    @ObfuscatedName("mv.ac")
    public int field3895;

    @ObfuscatedName("mv.aq")
    public int[][] field3896;

    @ObfuscatedName("it.u(III)Lmv;")
    public static CollisionMap method4718(int arg0, int arg1) {
        CollisionMap var2 = new CollisionMap();
        var2.field3857 = -1;
        var2.field3893 = -1;
        var2.field3894 = arg0 + 1 + 5;
        var2.field3895 = arg1 + 1 + 5;
        var2.field3896 = new int[var2.field3894][var2.field3895];
        var2.method6294();
        return var2;
    }

    @ObfuscatedName("mv.j(I)V")
    public void method6294() {
        for (int var1 = 0; var1 < this.field3894; var1++) {
            for (int var2 = 0; var2 < this.field3895; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field3894 - 5 || var2 >= this.field3895 - 5) {
                    this.field3896[var1][var2] = -1;
                } else {
                    this.field3896[var1][var2] = 2097152;
                }
            }
        }
    }

    @ObfuscatedName("mv.a(IIIIZZI)V")
    public void method6296(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        int var7 = arg0 - this.field3857;
        int var8 = arg1 - this.field3893;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method6267(var7, var8, 128);
                this.method6267(var7 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method6267(var7, var8, 2);
                this.method6267(var7, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method6267(var7, var8, 8);
                this.method6267(var7 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method6267(var7, var8, 32);
                this.method6267(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method6267(var7, var8, 1);
                this.method6267(var7 - 1, var8 + 1, 16);
            }
            if (arg3 == 1) {
                this.method6267(var7, var8, 4);
                this.method6267(var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method6267(var7, var8, 16);
                this.method6267(var7 + 1, var8 - 1, 1);
            }
            if (arg3 == 3) {
                this.method6267(var7, var8, 64);
                this.method6267(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method6267(var7, var8, 130);
                this.method6267(var7 - 1, var8, 8);
                this.method6267(var7, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method6267(var7, var8, 10);
                this.method6267(var7, var8 + 1, 32);
                this.method6267(var7 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method6267(var7, var8, 40);
                this.method6267(var7 + 1, var8, 128);
                this.method6267(var7, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method6267(var7, var8, 160);
                this.method6267(var7, var8 - 1, 2);
                this.method6267(var7 - 1, var8, 8);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    this.method6267(var7, var8, 65536);
                    this.method6267(var7 - 1, var8, 4096);
                }
                if (arg3 == 1) {
                    this.method6267(var7, var8, 1024);
                    this.method6267(var7, var8 + 1, 16384);
                }
                if (arg3 == 2) {
                    this.method6267(var7, var8, 4096);
                    this.method6267(var7 + 1, var8, 65536);
                }
                if (arg3 == 3) {
                    this.method6267(var7, var8, 16384);
                    this.method6267(var7, var8 - 1, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg3 == 0) {
                    this.method6267(var7, var8, 512);
                    this.method6267(var7 - 1, var8 + 1, 8192);
                }
                if (arg3 == 1) {
                    this.method6267(var7, var8, 2048);
                    this.method6267(var7 + 1, var8 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method6267(var7, var8, 8192);
                    this.method6267(var7 + 1, var8 - 1, 512);
                }
                if (arg3 == 3) {
                    this.method6267(var7, var8, 32768);
                    this.method6267(var7 - 1, var8 - 1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    this.method6267(var7, var8, 66560);
                    this.method6267(var7 - 1, var8, 4096);
                    this.method6267(var7, var8 + 1, 16384);
                }
                if (arg3 == 1) {
                    this.method6267(var7, var8, 5120);
                    this.method6267(var7, var8 + 1, 16384);
                    this.method6267(var7 + 1, var8, 65536);
                }
                if (arg3 == 2) {
                    this.method6267(var7, var8, 20480);
                    this.method6267(var7 + 1, var8, 65536);
                    this.method6267(var7, var8 - 1, 1024);
                }
                if (arg3 == 3) {
                    this.method6267(var7, var8, 81920);
                    this.method6267(var7, var8 - 1, 1024);
                    this.method6267(var7 - 1, var8, 4096);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method6267(var7, var8, 536870912);
                this.method6267(var7 - 1, var8, 33554432);
            }
            if (arg3 == 1) {
                this.method6267(var7, var8, 8388608);
                this.method6267(var7, var8 + 1, 134217728);
            }
            if (arg3 == 2) {
                this.method6267(var7, var8, 33554432);
                this.method6267(var7 + 1, var8, 536870912);
            }
            if (arg3 == 3) {
                this.method6267(var7, var8, 134217728);
                this.method6267(var7, var8 - 1, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method6267(var7, var8, 4194304);
                this.method6267(var7 - 1, var8 + 1, 67108864);
            }
            if (arg3 == 1) {
                this.method6267(var7, var8, 16777216);
                this.method6267(var7 + 1, var8 + 1, 268435456);
            }
            if (arg3 == 2) {
                this.method6267(var7, var8, 67108864);
                this.method6267(var7 + 1, var8 - 1, 4194304);
            }
            if (arg3 == 3) {
                this.method6267(var7, var8, 268435456);
                this.method6267(var7 - 1, var8 - 1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method6267(var7, var8, 545259520);
            this.method6267(var7 - 1, var8, 33554432);
            this.method6267(var7, var8 + 1, 134217728);
        }
        if (arg3 == 1) {
            this.method6267(var7, var8, 41943040);
            this.method6267(var7, var8 + 1, 134217728);
            this.method6267(var7 + 1, var8, 536870912);
        }
        if (arg3 == 2) {
            this.method6267(var7, var8, 167772160);
            this.method6267(var7 + 1, var8, 536870912);
            this.method6267(var7, var8 - 1, 8388608);
        }
        if (arg3 == 3) {
            this.method6267(var7, var8, 671088640);
            this.method6267(var7, var8 - 1, 8388608);
            this.method6267(var7 - 1, var8, 33554432);
        }
    }

    @ObfuscatedName("mv.s(IIIIZZB)V")
    public void method6264(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        int var7 = 256;
        if (arg4) {
            var7 |= 0x20000;
        }
        if (arg5) {
            var7 |= 0x40000000;
        }
        int var8 = arg0 - this.field3857;
        int var9 = arg1 - this.field3893;
        for (int var10 = var8; var10 < arg2 + var8; var10++) {
            if (var10 >= 0 && var10 < this.field3894) {
                for (int var11 = var9; var11 < arg3 + var9; var11++) {
                    if (var11 >= 0 && var11 < this.field3895) {
                        this.method6267(var10, var11, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("mv.c(III)V")
    public void method6274(int arg0, int arg1) {
        int var3 = arg0 - this.field3857;
        int var4 = arg1 - this.field3893;
        this.field3896[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("mv.m(III)V")
    public void method6266(int arg0, int arg1) {
        int var3 = arg0 - this.field3857;
        int var4 = arg1 - this.field3893;
        this.field3896[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("mv.t(IIIB)V")
    public void method6267(int arg0, int arg1, int arg2) {
        this.field3896[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("mv.l(IIIIZZI)V")
    public void method6263(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        int var7 = arg0 - this.field3857;
        int var8 = arg1 - this.field3893;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method6270(var7, var8, 128);
                this.method6270(var7 - 1, var8, 8);
            }
            if (arg3 == 1) {
                this.method6270(var7, var8, 2);
                this.method6270(var7, var8 + 1, 32);
            }
            if (arg3 == 2) {
                this.method6270(var7, var8, 8);
                this.method6270(var7 + 1, var8, 128);
            }
            if (arg3 == 3) {
                this.method6270(var7, var8, 32);
                this.method6270(var7, var8 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method6270(var7, var8, 1);
                this.method6270(var7 - 1, var8 + 1, 16);
            }
            if (arg3 == 1) {
                this.method6270(var7, var8, 4);
                this.method6270(var7 + 1, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method6270(var7, var8, 16);
                this.method6270(var7 + 1, var8 - 1, 1);
            }
            if (arg3 == 3) {
                this.method6270(var7, var8, 64);
                this.method6270(var7 - 1, var8 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method6270(var7, var8, 130);
                this.method6270(var7 - 1, var8, 8);
                this.method6270(var7, var8 + 1, 32);
            }
            if (arg3 == 1) {
                this.method6270(var7, var8, 10);
                this.method6270(var7, var8 + 1, 32);
                this.method6270(var7 + 1, var8, 128);
            }
            if (arg3 == 2) {
                this.method6270(var7, var8, 40);
                this.method6270(var7 + 1, var8, 128);
                this.method6270(var7, var8 - 1, 2);
            }
            if (arg3 == 3) {
                this.method6270(var7, var8, 160);
                this.method6270(var7, var8 - 1, 2);
                this.method6270(var7 - 1, var8, 8);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    this.method6270(var7, var8, 65536);
                    this.method6270(var7 - 1, var8, 4096);
                }
                if (arg3 == 1) {
                    this.method6270(var7, var8, 1024);
                    this.method6270(var7, var8 + 1, 16384);
                }
                if (arg3 == 2) {
                    this.method6270(var7, var8, 4096);
                    this.method6270(var7 + 1, var8, 65536);
                }
                if (arg3 == 3) {
                    this.method6270(var7, var8, 16384);
                    this.method6270(var7, var8 - 1, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg3 == 0) {
                    this.method6270(var7, var8, 512);
                    this.method6270(var7 - 1, var8 + 1, 8192);
                }
                if (arg3 == 1) {
                    this.method6270(var7, var8, 2048);
                    this.method6270(var7 + 1, var8 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method6270(var7, var8, 8192);
                    this.method6270(var7 + 1, var8 - 1, 512);
                }
                if (arg3 == 3) {
                    this.method6270(var7, var8, 32768);
                    this.method6270(var7 - 1, var8 - 1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    this.method6270(var7, var8, 66560);
                    this.method6270(var7 - 1, var8, 4096);
                    this.method6270(var7, var8 + 1, 16384);
                }
                if (arg3 == 1) {
                    this.method6270(var7, var8, 5120);
                    this.method6270(var7, var8 + 1, 16384);
                    this.method6270(var7 + 1, var8, 65536);
                }
                if (arg3 == 2) {
                    this.method6270(var7, var8, 20480);
                    this.method6270(var7 + 1, var8, 65536);
                    this.method6270(var7, var8 - 1, 1024);
                }
                if (arg3 == 3) {
                    this.method6270(var7, var8, 81920);
                    this.method6270(var7, var8 - 1, 1024);
                    this.method6270(var7 - 1, var8, 4096);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method6270(var7, var8, 536870912);
                this.method6270(var7 - 1, var8, 33554432);
            }
            if (arg3 == 1) {
                this.method6270(var7, var8, 8388608);
                this.method6270(var7, var8 + 1, 134217728);
            }
            if (arg3 == 2) {
                this.method6270(var7, var8, 33554432);
                this.method6270(var7 + 1, var8, 536870912);
            }
            if (arg3 == 3) {
                this.method6270(var7, var8, 134217728);
                this.method6270(var7, var8 - 1, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method6270(var7, var8, 4194304);
                this.method6270(var7 - 1, var8 + 1, 67108864);
            }
            if (arg3 == 1) {
                this.method6270(var7, var8, 16777216);
                this.method6270(var7 + 1, var8 + 1, 268435456);
            }
            if (arg3 == 2) {
                this.method6270(var7, var8, 67108864);
                this.method6270(var7 + 1, var8 - 1, 4194304);
            }
            if (arg3 == 3) {
                this.method6270(var7, var8, 268435456);
                this.method6270(var7 - 1, var8 - 1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method6270(var7, var8, 545259520);
            this.method6270(var7 - 1, var8, 33554432);
            this.method6270(var7, var8 + 1, 134217728);
        }
        if (arg3 == 1) {
            this.method6270(var7, var8, 41943040);
            this.method6270(var7, var8 + 1, 134217728);
            this.method6270(var7 + 1, var8, 536870912);
        }
        if (arg3 == 2) {
            this.method6270(var7, var8, 167772160);
            this.method6270(var7 + 1, var8, 536870912);
            this.method6270(var7, var8 - 1, 8388608);
        }
        if (arg3 == 3) {
            this.method6270(var7, var8, 671088640);
            this.method6270(var7, var8 - 1, 8388608);
            this.method6270(var7 - 1, var8, 33554432);
        }
    }

    @ObfuscatedName("mv.f(IIIIIZZI)V")
    public void method6269(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        int var8 = 256;
        if (arg5) {
            var8 |= 0x20000;
        }
        if (arg6) {
            var8 |= 0x40000000;
        }
        int var9 = arg0 - this.field3857;
        int var10 = arg1 - this.field3893;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg2;
            arg2 = arg3;
            arg3 = var11;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field3894) {
                for (int var13 = var10; var13 < arg3 + var10; var13++) {
                    if (var13 >= 0 && var13 < this.field3895) {
                        this.method6270(var12, var13, var8);
                    }
                }
            }
        }
    }

    @ObfuscatedName("mv.d(IIII)V")
    public void method6270(int arg0, int arg1, int arg2) {
        this.field3896[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("mv.z(IIB)V")
    public void method6271(int arg0, int arg1) {
        int var3 = arg0 - this.field3857;
        int var4 = arg1 - this.field3893;
        this.field3896[var3][var4] &= 0xFFDFFFFF;
    }

    @ObfuscatedName("mv.n(III)V")
    public void method6272(int arg0, int arg1) {
        int var3 = arg0 - this.field3857;
        int var4 = arg1 - this.field3893;
        this.field3896[var3][var4] &= 0xFFFBFFFF;
    }

    @ObfuscatedName("mv.o(IIIIIIIB)Z")
    public boolean method6273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == 1) {
            if (arg0 == arg3 && arg1 == arg4) {
                return true;
            }
        } else if (arg3 >= arg0 && arg3 <= arg0 + arg2 - 1 && arg4 >= arg4 && arg4 <= arg2 + arg4 - 1) {
            return true;
        }
        int var8 = arg0 - this.field3857;
        int var9 = arg1 - this.field3893;
        int var10 = arg3 - this.field3857;
        int var11 = arg4 - this.field3893;
        if (arg2 == 1) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field3896[var8][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field3896[var8][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field3896[var8][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field3896[var8][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field3896[var8][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9 && (this.field3896[var8][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field3896[var8][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - 1 == var8 && var9 == var11) {
                        return true;
                    }
                    if (var8 == var10 && var11 + 1 == var9 && (this.field3896[var8][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var8 == var10 && var11 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var8 == var10 && var11 + 1 == var9 && (this.field3896[var8][var9] & 0x20) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field3896[var8][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field3896[var8][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var12 = arg2 + var8 - 1;
            int var13 = arg2 + var9 - 1;
            if (arg5 == 0) {
                if (arg6 == 0) {
                    if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field3896[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field3896[var10][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var8][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field3896[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field3896[var10][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9) {
                        return true;
                    }
                    if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var8][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var8][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field3896[var10][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field3896[var10][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field3896[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field3896[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var8][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 >= var8 && var10 <= var12 && var11 + 1 == var9 && (this.field3896[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var8 && var10 <= var12 && var11 - arg2 == var9 && (this.field3896[var10][var13] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg2 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var12][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var11 >= var9 && var11 <= var13 && (this.field3896[var8][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("mv.q(IIIIIIIII)Z")
    public boolean method6290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 > 1) {
            return method13884(arg0, arg1, arg2, arg2, arg3, arg4, arg5, arg6) ? true : this.method6275(arg0, arg1, arg2, arg2, arg3, arg4, arg5, arg6, arg7);
        }
        int var9 = arg3 + arg5 - 1;
        int var10 = arg4 + arg6 - 1;
        if (arg0 >= arg3 && arg0 <= var9 && arg1 >= arg4 && arg1 <= var10) {
            return true;
        } else if (arg3 - 1 == arg0 && arg1 >= arg4 && arg1 <= var10 && (this.field3896[arg0 - this.field3857][arg1 - this.field3893] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg0 && arg1 >= arg4 && arg1 <= var10 && (this.field3896[arg0 - this.field3857][arg1 - this.field3893] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg1 && arg0 >= arg3 && arg0 <= var9 && (this.field3896[arg0 - this.field3857][arg1 - this.field3893] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg1 && arg0 >= arg3 && arg0 <= var9 && (this.field3896[arg0 - this.field3857][arg1 - this.field3893] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @ObfuscatedName("mv.p(IIIIIIIIII)Z")
    public boolean method6275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg0 + arg2;
        int var11 = arg1 + arg3;
        int var12 = arg4 + arg6;
        int var13 = arg5 + arg7;
        if (arg0 == var12 && (arg8 & 0x2) == 0) {
            int var14 = arg1 > arg5 ? arg1 : arg5;
            int var15 = var11 < var13 ? var11 : var13;
            while (var14 < var15) {
                if ((this.field3896[var12 - 1 - this.field3857][var14 - this.field3893] & 0x8) == 0) {
                    return true;
                }
                var14++;
            }
        } else if (arg4 == var10 && (arg8 & 0x8) == 0) {
            int var16 = arg1 > arg5 ? arg1 : arg5;
            int var17 = var11 < var13 ? var11 : var13;
            while (var16 < var17) {
                if ((this.field3896[arg4 - this.field3857][var16 - this.field3893] & 0x80) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg1 == var13 && (arg8 & 0x1) == 0) {
            int var18 = arg0 > arg4 ? arg0 : arg4;
            int var19 = var10 < var12 ? var10 : var12;
            while (var18 < var19) {
                if ((this.field3896[var18 - this.field3857][var13 - 1 - this.field3893] & 0x2) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg5 == var11 && (arg8 & 0x4) == 0) {
            int var20 = arg0 > arg4 ? arg0 : arg4;
            int var21 = var10 < var12 ? var10 : var12;
            while (var20 < var21) {
                if ((this.field3896[var20 - this.field3857][arg5 - this.field3893] & 0x20) == 0) {
                    return true;
                }
                var20++;
            }
        }
        return false;
    }

    @ObfuscatedName("zt.w(IIIIIIIIB)Z")
    public static boolean method13884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 < arg4 + arg6 && arg4 < arg0 + arg2) {
            return arg1 < arg5 + arg7 && arg5 < arg1 + arg3;
        } else {
            return false;
        }
    }
}
