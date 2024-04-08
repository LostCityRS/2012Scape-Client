import deob.ObfuscatedName;

@ObfuscatedName("ga")
public class ClanSettings {

    @ObfuscatedName("ga.j")
    public boolean field2345;

    @ObfuscatedName("ga.a")
    public boolean field2373;

    @ObfuscatedName("ga.s")
    public long field2347;

    @ObfuscatedName("ga.c")
    public int field2348 = 0;

    @ObfuscatedName("ga.m")
    public String field2349 = null;

    @ObfuscatedName("ga.t")
    public int field2371 = 0;

    @ObfuscatedName("ga.l")
    public boolean field2366;

    @ObfuscatedName("ga.f")
    public byte field2352;

    @ObfuscatedName("ga.d")
    public byte field2353;

    @ObfuscatedName("ga.z")
    public byte field2354;

    @ObfuscatedName("ga.n")
    public byte field2350;

    @ObfuscatedName("ga.o")
    public int field2346;

    @ObfuscatedName("ga.q")
    public long[] field2351;

    @ObfuscatedName("ga.p")
    public byte[] field2358;

    @ObfuscatedName("ga.w")
    public int[] field2359;

    @ObfuscatedName("ga.b")
    public int[] field2372;

    @ObfuscatedName("ga.x")
    public int[] field2361;

    @ObfuscatedName("ga.i")
    public int field2364 = -1;

    @ObfuscatedName("ga.v")
    public int field2363 = -1;

    @ObfuscatedName("ga.k")
    public int field2356;

    @ObfuscatedName("ga.h")
    public long[] field2365;

    @ObfuscatedName("ga.r")
    public String[] field2355;

    @ObfuscatedName("ga.g")
    public String[] field2367;

    @ObfuscatedName("ga.y")
    public HashTable field2368;

    public ClanSettings(Packet arg0) {
        this.method4048(arg0);
    }

    @ObfuscatedName("ga.u(II)V")
    public void method4039(int arg0) {
        if (this.field2345) {
            if (this.field2351 == null) {
                this.field2351 = new long[arg0];
            } else {
                ArrayUtil.method11334(this.field2351, 0, this.field2351 = new long[arg0], 0, this.field2346);
            }
        }
        if (this.field2373) {
            if (this.field2355 == null) {
                this.field2355 = new String[arg0];
            } else {
                ArrayUtil.method11338(this.field2355, 0, this.field2355 = new String[arg0], 0, this.field2346);
            }
        }
        if (this.field2358 == null) {
            this.field2358 = new byte[arg0];
        } else {
            ArrayUtil.method11330(this.field2358, 0, this.field2358 = new byte[arg0], 0, this.field2346);
        }
        if (this.field2372 == null) {
            this.field2372 = new int[arg0];
        } else {
            ArrayUtil.method11351(this.field2372, 0, this.field2372 = new int[arg0], 0, this.field2346);
        }
        if (this.field2361 == null) {
            this.field2361 = new int[arg0];
        } else {
            ArrayUtil.method11351(this.field2361, 0, this.field2361 = new int[arg0], 0, this.field2346);
        }
    }

    @ObfuscatedName("ga.j(II)V")
    public void method4055(int arg0) {
        if (this.field2345) {
            if (this.field2365 == null) {
                this.field2365 = new long[arg0];
            } else {
                ArrayUtil.method11334(this.field2365, 0, this.field2365 = new long[arg0], 0, this.field2356);
            }
        }
        if (!this.field2373) {
            return;
        }
        if (this.field2367 == null) {
            this.field2367 = new String[arg0];
        } else {
            ArrayUtil.method11338(this.field2367, 0, this.field2367 = new String[arg0], 0, this.field2356);
        }
    }

    @ObfuscatedName("ga.a(Ljava/lang/String;I)I")
    public int method4041(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < this.field2346; var2++) {
            if (this.field2355[var2].equals(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ga.s(IIII)I")
    public int method4042(int arg0, int arg1, int arg2) {
        int var4 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        return (this.field2372[arg0] & var4) >>> arg1;
    }

    @ObfuscatedName("ga.c(IB)Ljava/lang/Integer;")
    public Integer method4043(int arg0) {
        if (this.field2368 == null) {
            return null;
        } else {
            Node var2 = this.field2368.get((long) arg0);
            return var2 != null && var2 instanceof IntNode ? Integer.valueOf(((IntNode) var2).value) : null;
        }
    }

    @ObfuscatedName("ga.m(IIII)Ljava/lang/Integer;")
    public Integer method4080(int arg0, int arg1, int arg2) {
        if (this.field2368 == null) {
            return null;
        }
        Node var4 = this.field2368.get((long) arg0);
        if (var4 != null && var4 instanceof IntNode) {
            int var5 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
            return Integer.valueOf((((IntNode) var4).value & var5) >>> arg1);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ga.t(II)Ljava/lang/Long;")
    public Long method4045(int arg0) {
        if (this.field2368 == null) {
            return null;
        } else {
            Node var2 = this.field2368.get((long) arg0);
            return var2 != null && var2 instanceof LongNode ? Long.valueOf(((LongNode) var2).field9555) : null;
        }
    }

    @ObfuscatedName("ga.l(IB)Ljava/lang/String;")
    public String method4071(int arg0) {
        if (this.field2368 == null) {
            return null;
        } else {
            Node var2 = this.field2368.get((long) arg0);
            return var2 != null && var2 instanceof ObjectNode ? (String) ((ObjectNode) var2).value : null;
        }
    }

    @ObfuscatedName("ga.f(B)[I")
    public int[] method4047() {
        if (this.field2359 == null) {
            String[] var1 = new String[this.field2346];
            this.field2359 = new int[this.field2346];
            int var2 = 0;
            while (var2 < this.field2346) {
                var1[var2] = this.field2355[var2];
                this.field2359[var2] = var2++;
            }
            Algorithms.method8077(var1, this.field2359);
        }
        return this.field2359;
    }

    @ObfuscatedName("ga.d(JLjava/lang/String;IS)V")
    public void method4070(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field2345) {
            throw new RuntimeException("");
        } else if ((arg1 != null) == this.field2373) {
            if (arg0 > 0L && (this.field2351 == null || this.field2346 >= this.field2351.length) || arg1 != null && (this.field2355 == null || this.field2346 >= this.field2355.length)) {
                this.method4039(this.field2346 + 5);
            }
            if (this.field2351 != null) {
                this.field2351[this.field2346] = arg0;
            }
            if (this.field2355 != null) {
                this.field2355[this.field2346] = arg1;
            }
            if (this.field2364 == -1) {
                this.field2364 = this.field2346;
                this.field2358[this.field2346] = 126;
            } else {
                this.field2358[this.field2346] = 0;
            }
            this.field2372[this.field2346] = 0;
            this.field2361[this.field2346] = arg2;
            this.field2346++;
            this.field2359 = null;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ga.z(IB)V")
    public void method4049(int arg0) {
        if (arg0 < 0 || arg0 >= this.field2346) {
            throw new RuntimeException("");
        }
        this.field2346--;
        this.field2359 = null;
        if (this.field2346 == 0) {
            this.field2351 = null;
            this.field2355 = null;
            this.field2358 = null;
            this.field2372 = null;
            this.field2361 = null;
            this.field2364 = -1;
            this.field2363 = -1;
            return;
        }
        ArrayUtil.method11330(this.field2358, arg0 + 1, this.field2358, arg0, this.field2346 - arg0);
        ArrayUtil.method11351(this.field2372, arg0 + 1, this.field2372, arg0, this.field2346 - arg0);
        ArrayUtil.method11351(this.field2361, arg0 + 1, this.field2361, arg0, this.field2346 - arg0);
        if (this.field2351 != null) {
            ArrayUtil.method11334(this.field2351, arg0 + 1, this.field2351, arg0, this.field2346 - arg0);
        }
        if (this.field2355 != null) {
            ArrayUtil.method11338(this.field2355, arg0 + 1, this.field2355, arg0, this.field2346 - arg0);
        }
        if (this.field2364 == arg0 || this.field2363 == arg0) {
            this.method4050();
        }
    }

    @ObfuscatedName("ga.n(I)V")
    public void method4050() {
        if (this.field2346 == 0) {
            this.field2364 = -1;
            this.field2363 = -1;
            return;
        }
        this.field2364 = -1;
        this.field2363 = -1;
        int var1 = 0;
        byte var2 = this.field2358[0];
        for (int var3 = 1; var3 < this.field2346; var3++) {
            if (this.field2358[var3] > var2) {
                if (var2 == 125) {
                    this.field2363 = var1;
                }
                var1 = var3;
                var2 = this.field2358[var3];
            } else if (this.field2363 == -1 && this.field2358[var3] == 125) {
                this.field2363 = var3;
            }
        }
        this.field2364 = var1;
        if (this.field2364 != -1) {
            this.field2358[this.field2364] = 126;
        }
    }

    @ObfuscatedName("ga.o(JLjava/lang/String;B)V")
    public void method4051(long arg0, String arg1) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg0 > 0L != this.field2345) {
            throw new RuntimeException("");
        } else if (this.field2373 == (arg1 != null)) {
            if (arg0 > 0L && (this.field2365 == null || this.field2356 >= this.field2365.length) || arg1 != null && (this.field2367 == null || this.field2356 >= this.field2367.length)) {
                this.method4055(this.field2356 + 5);
            }
            if (this.field2365 != null) {
                this.field2365[this.field2356] = arg0;
            }
            if (this.field2367 != null) {
                this.field2367[this.field2356] = arg1;
            }
            this.field2356++;
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ga.q(II)V")
    public void method4063(int arg0) {
        this.field2356--;
        if (this.field2356 == 0) {
            this.field2365 = null;
            this.field2367 = null;
            return;
        }
        if (this.field2365 != null) {
            ArrayUtil.method11334(this.field2365, arg0 + 1, this.field2365, arg0, this.field2356 - arg0);
        }
        if (this.field2367 != null) {
            ArrayUtil.method11338(this.field2367, arg0 + 1, this.field2367, arg0, this.field2356 - arg0);
        }
    }

    @ObfuscatedName("ga.p(IBS)I")
    public int method4052(int arg0, byte arg1) {
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field2364 == arg0 && (this.field2363 == -1 || this.field2358[this.field2363] < 125)) {
            return -1;
        } else if (this.field2358[arg0] == arg1) {
            return -1;
        } else {
            this.field2358[arg0] = arg1;
            this.method4050();
            return arg0;
        }
    }

    @ObfuscatedName("ga.w(IIIIS)I")
    public int method4053(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        int var10 = this.field2372[arg0];
        if ((var10 & var7) == var9) {
            return -1;
        } else {
            int var11 = var10 & ~var7;
            this.field2372[arg0] = var11 | var9;
            return arg0;
        }
    }

    @ObfuscatedName("ga.b(IIB)Z")
    public boolean method4060(int arg0, int arg1) {
        if (this.field2368 == null) {
            this.field2368 = new HashTable(4);
        } else {
            Node var3 = this.field2368.get((long) arg0);
            if (var3 != null) {
                if (var3 instanceof IntNode) {
                    IntNode var4 = (IntNode) var3;
                    if (var4.value == arg1) {
                        return false;
                    }
                    var4.value = arg1;
                    return true;
                }
                var3.unlink();
            }
        }
        this.field2368.put(new IntNode(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ga.x(IIIIB)Z")
    public boolean method4040(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (0x1 << arg2) - 1;
        int var6 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var7 = var6 ^ var5;
        int var8 = arg1 << arg2;
        int var9 = var8 & var7;
        if (this.field2368 == null) {
            this.field2368 = new HashTable(4);
        } else {
            Node var10 = this.field2368.get((long) arg0);
            if (var10 != null) {
                if (var10 instanceof IntNode) {
                    IntNode var11 = (IntNode) var10;
                    if ((var11.value & var7) == var9) {
                        return false;
                    }
                    var11.value &= ~var7;
                    var11.value |= var9;
                    return true;
                }
                var10.unlink();
            }
        }
        this.field2368.put(new IntNode(var9), (long) arg0);
        return true;
    }

    @ObfuscatedName("ga.i(IJ)Z")
    public boolean method4062(int arg0, long arg1) {
        if (this.field2368 == null) {
            this.field2368 = new HashTable(4);
        } else {
            Node var4 = this.field2368.get((long) arg0);
            if (var4 != null) {
                if (var4 instanceof LongNode) {
                    LongNode var5 = (LongNode) var4;
                    if (var5.field9555 == arg1) {
                        return false;
                    }
                    var5.field9555 = arg1;
                    return true;
                }
                var4.unlink();
            }
        }
        this.field2368.put(new LongNode(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ga.v(ILjava/lang/String;B)Z")
    public boolean method4057(int arg0, String arg1) {
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field2368 == null) {
            this.field2368 = new HashTable(4);
        } else {
            Node var3 = this.field2368.get((long) arg0);
            if (var3 != null) {
                if (var3 instanceof ObjectNode) {
                    ObjectNode var4 = (ObjectNode) var3;
                    if (var4.value instanceof String) {
                        if (arg1.equals(var4.value)) {
                            return false;
                        }
                        var4.unlink();
                        var4.unlink();
                        this.field2368.put(new ObjectNode(arg1), var4.key);
                        return true;
                    }
                }
                var3.unlink();
            }
        }
        this.field2368.put(new ObjectNode(arg1), (long) arg0);
        return true;
    }

    @ObfuscatedName("ga.k(Laet;I)V")
    public void method4048(Packet arg0) {
        int var2 = arg0.g1();
        if (var2 < 1 || var2 > 5) {
            throw new RuntimeException("" + var2);
        }
        int var3 = arg0.g1();
        if ((var3 & 0x1) != 0) {
            this.field2345 = true;
        }
        if ((var3 & 0x2) != 0) {
            this.field2373 = true;
        }
        if (!this.field2345) {
            this.field2351 = null;
            this.field2365 = null;
        }
        if (!this.field2373) {
            this.field2355 = null;
            this.field2367 = null;
        }
        this.field2348 = arg0.g4s();
        this.field2371 = arg0.g4s();
        if (var2 <= 3 && this.field2371 != 0) {
            this.field2371 += 16912800;
        }
        this.field2346 = arg0.g2();
        this.field2356 = arg0.g1();
        this.field2349 = arg0.gjstr();
        if (var2 >= 4) {
            arg0.g4s();
        }
        this.field2366 = arg0.g1() == 1;
        this.field2352 = arg0.g1b();
        this.field2353 = arg0.g1b();
        this.field2354 = arg0.g1b();
        this.field2350 = arg0.g1b();
        if (this.field2346 > 0) {
            if (this.field2345 && (this.field2351 == null || this.field2351.length < this.field2346)) {
                this.field2351 = new long[this.field2346];
            }
            if (this.field2373 && (this.field2355 == null || this.field2355.length < this.field2346)) {
                this.field2355 = new String[this.field2346];
            }
            if (this.field2358 == null || this.field2358.length < this.field2346) {
                this.field2358 = new byte[this.field2346];
            }
            if (this.field2372 == null || this.field2372.length < this.field2346) {
                this.field2372 = new int[this.field2346];
            }
            if (this.field2361 == null || this.field2361.length < this.field2346) {
                this.field2361 = new int[this.field2346];
            }
            for (int var4 = 0; var4 < this.field2346; var4++) {
                if (this.field2345) {
                    this.field2351[var4] = arg0.g8();
                }
                if (this.field2373) {
                    this.field2355[var4] = arg0.fastgstr();
                }
                this.field2358[var4] = arg0.g1b();
                if (var2 >= 2) {
                    this.field2372[var4] = arg0.g4s();
                }
                if (var2 >= 5) {
                    this.field2361[var4] = arg0.g2();
                } else {
                    this.field2361[var4] = 0;
                }
            }
            this.method4050();
        }
        if (this.field2356 > 0) {
            if (this.field2345 && (this.field2365 == null || this.field2365.length < this.field2356)) {
                this.field2365 = new long[this.field2356];
            }
            if (this.field2373 && (this.field2367 == null || this.field2367.length < this.field2356)) {
                this.field2367 = new String[this.field2356];
            }
            for (int var5 = 0; var5 < this.field2356; var5++) {
                if (this.field2345) {
                    this.field2365[var5] = arg0.g8();
                }
                if (this.field2373) {
                    this.field2367[var5] = arg0.fastgstr();
                }
            }
        }
        if (var2 < 3) {
            return;
        }
        int var6 = arg0.g2();
        if (var6 <= 0) {
            return;
        }
        this.field2368 = new HashTable(var6 < 16 ? IntMath.bitceil(var6) : 16);
        while (var6-- > 0) {
            int var7 = arg0.g4s();
            int var8 = var7 & 0x3FFFFFFF;
            int var9 = var7 >>> 30;
            if (var9 == 0) {
                int var10 = arg0.g4s();
                this.field2368.put(new IntNode(var10), (long) var8);
            } else if (var9 == 1) {
                long var11 = arg0.g8();
                this.field2368.put(new LongNode(var11), (long) var8);
            } else if (var9 == 2) {
                String var13 = arg0.gjstr();
                this.field2368.put(new ObjectNode(var13), (long) var8);
            }
        }
    }
}
