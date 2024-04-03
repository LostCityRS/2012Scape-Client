import deob.ObfuscatedName;

@ObfuscatedName("aib")
public abstract class SoundStream extends AudioBuss {

    @ObfuscatedName("aib.l")
    public int field10266;

    @ObfuscatedName("aib.f")
    public int field10264;

    @ObfuscatedName("aib.d")
    public int field10263;

    @ObfuscatedName("aib.z")
    public int field10277;

    @ObfuscatedName("aib.n")
    public int field10267;

    @ObfuscatedName("aib.o")
    public int field10268;

    @ObfuscatedName("aib.q")
    public int field10269;

    @ObfuscatedName("aib.p")
    public int field10270;

    @ObfuscatedName("aib.w")
    public int field10271;

    @ObfuscatedName("aib.b")
    public int field10274;

    @ObfuscatedName("aib.x")
    public int field10265;

    @ObfuscatedName("aib.i")
    public int field10272;

    @ObfuscatedName("aib.v")
    public int field10275;

    @ObfuscatedName("aib.k")
    public boolean field10276;

    @ObfuscatedName("aib.h")
    public int field10273;

    @ObfuscatedName("wi.an(III)I")
    public static final int method12579(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ada.ap(III)I")
    public static final int method15028(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aib.ag(B)V")
    public final void method16382() {
        this.field10267 = this.field10263;
        this.field10268 = method12579(this.field10263, this.field10277);
        this.field10269 = method15028(this.field10263, this.field10277);
    }

    @ObfuscatedName("aib.u()I")
    public final int method15049() {
        int var1 = this.field10267 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field10265 == 0) {
            var2 -= this.field10266 * var2 / (((BasicVariableRateSoundPacket) this.field9474).method16496() << 8);
        } else if (this.field10265 >= 0) {
            var2 -= this.field10272 * var2 / ((BasicVariableRateSoundPacket) this.field9474).method16496();
        }
        return var2 > 255 ? 255 : var2;
    }

    @ObfuscatedName("aib.as(B)Z")
    public final synchronized boolean method16383() {
        return this.field10273 != 0;
    }

    @ObfuscatedName("aib.ai(IS)V")
    public final synchronized void method16384(int arg0) {
        this.field10265 = arg0;
    }

    @ObfuscatedName("aib.ao(II)V")
    public final synchronized void method16402(int arg0) {
        this.method16388(arg0 << 6, this.method16426());
    }

    @ObfuscatedName("aib.al(IB)V")
    public final synchronized void method16386(int arg0) {
        this.method16388(arg0, this.method16426());
    }

    @ObfuscatedName("aib.at(IB)V")
    public final synchronized void method16387(int arg0) {
        this.method16388(this.method16442(), arg0);
    }

    @ObfuscatedName("aib.ax(III)V")
    public final synchronized void method16388(int arg0, int arg1) {
        this.field10263 = arg0;
        this.field10277 = arg1;
        this.field10273 = 0;
        this.method16382();
    }

    @ObfuscatedName("aib.aw(B)I")
    public final synchronized int method16442() {
        return this.field10263 == Integer.MIN_VALUE ? 0 : this.field10263;
    }

    @ObfuscatedName("aib.aa(B)I")
    public final synchronized int method16426() {
        return this.field10277 < 0 ? -1 : this.field10277;
    }

    @ObfuscatedName("aib.am(II)V")
    public final synchronized void method16421(int arg0) {
        int var2 = ((BasicVariableRateSoundPacket) this.field9474).method16496() << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field10266 = arg0;
    }

    @ObfuscatedName("aib.ad(ZB)V")
    public final synchronized void method16413(boolean arg0) {
        this.field10264 = (this.field10264 >>> 31) + (this.field10264 ^ this.field10264 >> 31);
        if (arg0) {
            this.field10264 = -(this.field10264);
        }
    }

    @ObfuscatedName("aib.az(B)Z")
    public final synchronized boolean method16393() {
        return this.field10266 < 0 || this.field10266 >= ((BasicVariableRateSoundPacket) this.field9474).method16496() << 8;
    }

    @ObfuscatedName("aib.ak(B)V")
    public final void method16394() {
        if (this.field10273 == 0) {
            return;
        }
        if (this.field10263 == Integer.MIN_VALUE) {
            this.field10263 = 0;
        }
        this.field10273 = 0;
        this.method16382();
    }

    @ObfuscatedName("aib.av(III)V")
    public final synchronized void method16399(int arg0, int arg1) {
        this.method16395(arg0, arg1, this.method16426());
    }

    @ObfuscatedName("aib.aj(IIIB)V")
    public final synchronized void method16395(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method16388(arg1, arg2);
            return;
        }
        int var4 = method12579(arg1, arg2);
        int var5 = method15028(arg1, arg2);
        if (this.field10268 == var4 && this.field10269 == var5) {
            this.field10273 = 0;
            return;
        }
        int var6 = arg1 - this.field10267;
        if (this.field10267 - arg1 > var6) {
            var6 = this.field10267 - arg1;
        }
        if (var4 - this.field10268 > var6) {
            var6 = var4 - this.field10268;
        }
        if (this.field10268 - var4 > var6) {
            var6 = this.field10268 - var4;
        }
        if (var5 - this.field10269 > var6) {
            var6 = var5 - this.field10269;
        }
        if (this.field10269 - var5 > var6) {
            var6 = this.field10269 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field10273 = arg0;
        this.field10263 = arg1;
        this.field10277 = arg2;
        this.field10270 = (arg1 - this.field10267) / arg0;
        this.field10271 = (var4 - this.field10268) / arg0;
        this.field10274 = (var5 - this.field10269) / arg0;
    }

    @ObfuscatedName("aib.ah(IS)V")
    public final synchronized void method16418(int arg0) {
        if (arg0 == 0) {
            this.method16386(0);
            this.method6979();
        } else if (this.field10268 == 0 && this.field10269 == 0) {
            this.field10273 = 0;
            this.field10263 = 0;
            this.field10267 = 0;
            this.method6979();
        } else {
            int var2 = -this.field10267;
            if (this.field10267 > var2) {
                var2 = this.field10267;
            }
            if (-this.field10268 > var2) {
                var2 = -this.field10268;
            }
            if (this.field10268 > var2) {
                var2 = this.field10268;
            }
            if (-this.field10269 > var2) {
                var2 = -this.field10269;
            }
            if (this.field10269 > var2) {
                var2 = this.field10269;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field10273 = arg0;
            this.field10263 = Integer.MIN_VALUE;
            this.field10270 = -this.field10267 / arg0;
            this.field10271 = -this.field10268 / arg0;
            this.field10274 = -this.field10269 / arg0;
        }
    }

    @ObfuscatedName("aib.au(II)V")
    public final synchronized void method16396(int arg0) {
        if (this.field10264 < 0) {
            this.field10264 = -arg0;
        } else {
            this.field10264 = arg0;
        }
    }

    @ObfuscatedName("aib.ae(B)I")
    public final synchronized int method16397() {
        return this.field10264 < 0 ? -this.field10264 : this.field10264;
    }

    @ObfuscatedName("aib.s()I")
    public final int method15035() {
        return this.field10263 == 0 && this.field10273 == 0 ? 0 : 1;
    }

    @ObfuscatedName("aib.ac(I)Z")
    public final boolean method16398() {
        int var1 = this.field10263;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method12579(var1, this.field10277);
            var2 = method15028(var1, this.field10277);
        }
        if (this.field10267 != var1 || this.field10268 != var3 || this.field10269 != var2) {
            if (this.field10267 < var1) {
                this.field10270 = 1;
                this.field10273 = var1 - this.field10267;
            } else if (this.field10267 > var1) {
                this.field10270 = -1;
                this.field10273 = this.field10267 - var1;
            } else {
                this.field10270 = 0;
            }
            if (this.field10268 < var3) {
                this.field10271 = 1;
                if (this.field10273 == 0 || this.field10273 > var3 - this.field10268) {
                    this.field10273 = var3 - this.field10268;
                }
            } else if (this.field10268 > var3) {
                this.field10271 = -1;
                if (this.field10273 == 0 || this.field10273 > this.field10268 - var3) {
                    this.field10273 = this.field10268 - var3;
                }
            } else {
                this.field10271 = 0;
            }
            if (this.field10269 < var2) {
                this.field10274 = 1;
                if (this.field10273 == 0 || this.field10273 > var2 - this.field10269) {
                    this.field10273 = var2 - this.field10269;
                }
            } else if (this.field10269 > var2) {
                this.field10274 = -1;
                if (this.field10273 == 0 || this.field10273 > this.field10269 - var2) {
                    this.field10273 = this.field10269 - var2;
                }
            } else {
                this.field10274 = 0;
            }
            return false;
        } else if (this.field10263 == Integer.MIN_VALUE) {
            this.field10263 = 0;
            this.field10269 = 0;
            this.field10268 = 0;
            this.field10267 = 0;
            this.method6979();
            return true;
        } else {
            this.method16382();
            return false;
        }
    }

    @ObfuscatedName("aib.t(I)V")
    public final synchronized void method15046(int arg0) {
        if (this.field10273 > 0) {
            if (arg0 >= this.field10273) {
                if (this.field10263 == Integer.MIN_VALUE) {
                    this.field10263 = 0;
                    this.field10269 = 0;
                    this.field10268 = 0;
                    this.field10267 = 0;
                    this.method6979();
                    arg0 = this.field10273;
                }
                this.field10273 = 0;
                this.method16382();
            } else {
                this.field10267 += this.field10270 * arg0;
                this.field10268 += this.field10271 * arg0;
                this.field10269 += this.field10274 * arg0;
                this.field10273 -= arg0;
            }
        }
        int var2 = this.field10272 << 8;
        int var3 = this.field10275 << 8;
        int var4 = ((BasicVariableRateSoundPacket) this.field9474).method16496() << 8;
        int var5 = var3 - var2;
        if (var5 <= 0) {
            this.field10265 = 0;
        }
        if (this.field10266 < 0) {
            if (this.field10264 <= 0) {
                this.method16394();
                this.method6979();
                return;
            }
            this.field10266 = 0;
        }
        if (this.field10266 >= var4) {
            if (this.field10264 >= 0) {
                this.method16394();
                this.method6979();
                return;
            }
            this.field10266 = var4 - 1;
        }
        this.field10266 += this.field10264 * arg0;
        if (this.field10265 >= 0) {
            if (this.field10265 > 0) {
                if (this.field10276) {
                    label121:
                    {
                        if (this.field10264 < 0) {
                            if (this.field10266 >= var2) {
                                return;
                            }
                            this.field10266 = var2 + var2 - 1 - this.field10266;
                            this.field10264 = -(this.field10264);
                            if (--this.field10265 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field10266 < var3) {
                                return;
                            }
                            this.field10266 = var3 + var3 - 1 - this.field10266;
                            this.field10264 = -(this.field10264);
                            if (--this.field10265 == 0) {
                                break;
                            }
                            if (this.field10266 >= var2) {
                                return;
                            }
                            this.field10266 = var2 + var2 - 1 - this.field10266;
                            this.field10264 = -(this.field10264);
                        } while (--this.field10265 != 0);
                    }
                } else {
                    label153:
                    {
                        if (this.field10264 < 0) {
                            if (this.field10266 >= var2) {
                                return;
                            }
                            int var6 = (var3 - 1 - this.field10266) / var5;
                            if (var6 >= this.field10265) {
                                this.field10266 += this.field10265 * var5;
                                this.field10265 = 0;
                                break label153;
                            }
                            this.field10266 += var5 * var6;
                            this.field10265 -= var6;
                        } else if (this.field10266 >= var3) {
                            int var7 = (this.field10266 - var2) / var5;
                            if (var7 >= this.field10265) {
                                this.field10266 -= this.field10265 * var5;
                                this.field10265 = 0;
                                break label153;
                            }
                            this.field10266 -= var5 * var7;
                            this.field10265 -= var7;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field10264 < 0) {
                if (this.field10266 < 0) {
                    this.field10266 = -1;
                    this.method16394();
                    this.method6979();
                }
            } else if (this.field10266 >= var4) {
                this.field10266 = var4;
                this.method16394();
                this.method6979();
            }
        } else if (this.field10276) {
            if (this.field10264 < 0) {
                if (this.field10266 >= var2) {
                    return;
                }
                this.field10266 = var2 + var2 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
            }
            while (this.field10266 >= var3) {
                this.field10266 = var3 + var3 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
                if (this.field10266 >= var2) {
                    return;
                }
                this.field10266 = var2 + var2 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
            }
        } else if (this.field10264 < 0) {
            if (this.field10266 >= var2) {
                return;
            }
            this.field10266 = var3 - 1 - (var3 - 1 - this.field10266) % var5;
        } else if (this.field10266 >= var3) {
            this.field10266 = (this.field10266 - var2) % var5 + var2;
        } else {
            return;
        }
    }

    @ObfuscatedName("aib.j()Ladc;")
    public final AudioBuss method15031() {
        return null;
    }

    @ObfuscatedName("aib.a()Ladc;")
    public final AudioBuss method15032() {
        return null;
    }

    @ObfuscatedName("aib.m([III)V")
    public abstract void method15034(int[] arg0, int arg1, int arg2);
}
