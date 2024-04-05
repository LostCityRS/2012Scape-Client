import deob.ObfuscatedName;

@ObfuscatedName("aks")
public class VorbisSoundAudioBuss extends SoundAudioBuss {

    public VorbisSoundAudioBuss(VorbisSoundPacket arg0, int arg1, int arg2, int arg3) {
        this.sound = arg0;
        this.field10272 = arg0.start;
        this.field10275 = arg0.field10292;
        this.field10276 = arg0.field10293;
        this.field10264 = arg1;
        this.field10263 = arg2;
        this.field10277 = arg3;
        this.field10266 = 0;
        this.method16382();
    }

    @ObfuscatedName("aks.m([III)V")
    public synchronized void read(int[] arg0, int arg1, int arg2) throws IllegalStateException {
        if (this.field10263 == 0 && this.field10273 == 0) {
            this.skip(arg2);
            return;
        }
        int var4 = this.field10272 << 8;
        int var5 = this.field10275 << 8;
        int var6 = ((VorbisSoundPacket) this.sound).getSampleLength() << 8;
        int var7 = var5 - var4;
        if (var7 <= 0) {
            this.field10265 = 0;
        }
        int var8 = arg1;
        int var9 = arg1 + arg2;
        if (this.field10266 < 0) {
            if (this.field10264 <= 0) {
                this.method16394();
                this.unlink();
                return;
            }
            this.field10266 = 0;
        }
        if (this.field10266 >= var6) {
            if (this.field10264 >= 0) {
                this.method16394();
                this.unlink();
                return;
            }
            this.field10266 = var6 - 1;
        }
        if (this.field10265 >= 0) {
            if (this.field10265 > 0) {
                if (this.field10276) {
                    label131:
                    {
                        if (this.field10264 < 0) {
                            var8 = this.method17052(arg0, arg1, var4, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10272]);
                            if (this.field10266 >= var4) {
                                return;
                            }
                            this.field10266 = var4 + var4 - 1 - this.field10266;
                            this.field10264 = -(this.field10264);
                            if (--this.field10265 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var8 = this.method17051(arg0, var8, var5, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10275 - 1]);
                            if (this.field10266 < var5) {
                                return;
                            }
                            this.field10266 = var5 + var5 - 1 - this.field10266;
                            this.field10264 = -(this.field10264);
                            if (--this.field10265 == 0) {
                                break;
                            }
                            var8 = this.method17052(arg0, var8, var4, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10272]);
                            if (this.field10266 >= var4) {
                                return;
                            }
                            this.field10266 = var4 + var4 - 1 - this.field10266;
                            this.field10264 = -(this.field10264);
                        } while (--this.field10265 != 0);
                    }
                } else if (this.field10264 < 0) {
                    while (true) {
                        var8 = this.method17052(arg0, var8, var4, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10275 - 1]);
                        if (this.field10266 >= var4) {
                            return;
                        }
                        int var11 = (var5 - 1 - this.field10266) / var7;
                        if (var11 >= this.field10265) {
                            this.field10266 += this.field10265 * var7;
                            this.field10265 = 0;
                            break;
                        }
                        this.field10266 += var7 * var11;
                        this.field10265 -= var11;
                    }
                } else {
                    while (true) {
                        var8 = this.method17051(arg0, var8, var5, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10272]);
                        if (this.field10266 < var5) {
                            return;
                        }
                        int var12 = (this.field10266 - var4) / var7;
                        if (var12 >= this.field10265) {
                            this.field10266 -= this.field10265 * var7;
                            this.field10265 = 0;
                            break;
                        }
                        this.field10266 -= var7 * var12;
                        this.field10265 -= var12;
                    }
                }
            }
            if (this.field10264 < 0) {
                this.method17052(arg0, var8, 0, var9, 0.0F);
                if (this.field10266 < 0) {
                    this.field10266 = -1;
                    this.method16394();
                    this.unlink();
                }
            } else {
                this.method17051(arg0, var8, var6, var9, 0.0F);
                if (this.field10266 >= var6) {
                    this.field10266 = var6;
                    this.method16394();
                    this.unlink();
                }
            }
        } else if (this.field10276) {
            if (this.field10264 < 0) {
                var8 = this.method17052(arg0, arg1, var4, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10272]);
                if (this.field10266 >= var4) {
                    return;
                }
                this.field10266 = var4 + var4 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
            }
            while (true) {
                int var10 = this.method17051(arg0, var8, var5, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10275 - 1]);
                if (this.field10266 < var5) {
                    return;
                }
                this.field10266 = var5 + var5 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
                var8 = this.method17052(arg0, var10, var4, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10272]);
                if (this.field10266 >= var4) {
                    return;
                }
                this.field10266 = var4 + var4 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
            }
        } else if (this.field10264 < 0) {
            while (true) {
                var8 = this.method17052(arg0, var8, var4, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10275 - 1]);
                if (this.field10266 >= var4) {
                    return;
                }
                this.field10266 = var5 - 1 - (var5 - 1 - this.field10266) % var7;
            }
        } else {
            while (true) {
                var8 = this.method17051(arg0, var8, var5, var9, ((VorbisSoundPacket) this.sound).method17104()[this.field10272]);
                if (this.field10266 < var5) {
                    return;
                }
                this.field10266 = (this.field10266 - var4) % var7 + var4;
            }
        }
    }

    @ObfuscatedName("aks.cv([IIIIF)I")
    public int method17051(int[] arg0, int arg1, int arg2, int arg3, float arg4) {
        while (true) {
            if (this.field10273 > 0) {
                int var6 = this.field10273 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field10273 += arg1;
                if (this.field10264 == 256 && (this.field10266 & 0xFF) == 0) {
                    if (Statics.stereo) {
                        arg1 = method17100(0.0F, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10268, this.field10269, this.field10271, this.field10274, 0, var6, arg2, this);
                    } else {
                        arg1 = method17061(((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10267, this.field10270, 0, var6, arg2, this);
                    }
                } else if (Statics.stereo) {
                    arg1 = method17066(0.0F, 0, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10268, this.field10269, this.field10271, this.field10274, 0, var6, arg2, this, this.field10264, arg4);
                } else {
                    arg1 = method17065(0.0F, 0, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10267, this.field10270, 0, var6, arg2, this, this.field10264, arg4);
                }
                this.field10273 -= arg1;
                if (this.field10273 != 0) {
                    return arg1;
                }
                if (!this.method16398()) {
                    continue;
                }
                return arg3;
            }
            if (this.field10264 == 256 && (this.field10266 & 0xFF) == 0) {
                if (Statics.stereo) {
                    return method17054(0.0F, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10268, this.field10269, 0, arg3, arg2, this);
                }
                return method17050(((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10267, 0, arg3, arg2, this);
            }
            if (Statics.stereo) {
                return method17058(0.0F, 0, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10268, this.field10269, 0, arg3, arg2, this, this.field10264, arg4);
            }
            return method17057(0.0F, 0, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10267, 0, arg3, arg2, this, this.field10264, arg4);
        }
    }

    @ObfuscatedName("aks.ck([IIIIF)I")
    public int method17052(int[] arg0, int arg1, int arg2, int arg3, float arg4) {
        while (true) {
            if (this.field10273 > 0) {
                int var6 = this.field10273 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field10273 += arg1;
                if (this.field10264 == -256 && (this.field10266 & 0xFF) == 0) {
                    if (Statics.stereo) {
                        arg1 = method17064(0.0F, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10268, this.field10269, this.field10271, this.field10274, 0, var6, arg2, this);
                    } else {
                        arg1 = method17063(((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10267, this.field10270, 0, var6, arg2, this);
                    }
                } else if (Statics.stereo) {
                    arg1 = method17062(0.0F, 0, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10268, this.field10269, this.field10271, this.field10274, 0, var6, arg2, this, this.field10264, arg4);
                } else {
                    arg1 = method17070(0.0F, 0, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10267, this.field10270, 0, var6, arg2, this, this.field10264, arg4);
                }
                this.field10273 -= arg1;
                if (this.field10273 != 0) {
                    return arg1;
                }
                if (!this.method16398()) {
                    continue;
                }
                return arg3;
            }
            if (this.field10264 == -256 && (this.field10266 & 0xFF) == 0) {
                if (Statics.stereo) {
                    return method17056(0.0F, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10268, this.field10269, 0, arg3, arg2, this);
                }
                return method17055(((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10267, 0, arg3, arg2, this);
            }
            if (Statics.stereo) {
                return method17060(0.0F, 0, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10268, this.field10269, 0, arg3, arg2, this, this.field10264, arg4);
            }
            return method17059(0.0F, 0, ((VorbisSoundPacket) this.sound).method17104(), arg0, this.field10266, arg1, this.field10267, 0, arg3, arg2, this, this.field10264, arg4);
        }
    }

    @ObfuscatedName("aks.cd([F[IIIIIIILaks;)I")
    public static int method17050(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, VorbisSoundAudioBuss arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12 = var11 * 128;
        int var13;
        if ((var13 = arg3 + var10 - var9) > arg6) {
            var13 = arg6;
        }
        var13 -= 3;
        int var10001;
        while (arg3 < var13) {
            var10001 = arg3++;
            arg1[var10001] = (int) ((float) arg1[var10001] + arg0[var9++] * (float) var12);
            int var14 = arg3++;
            arg1[var14] = (int) ((float) arg1[var14] + arg0[var9++] * (float) var12);
            int var15 = arg3++;
            arg1[var15] = (int) ((float) arg1[var15] + arg0[var9++] * (float) var12);
            int var16 = arg3++;
            arg1[var16] = (int) ((float) arg1[var16] + arg0[var9++] * (float) var12);
        }
        var13 += 3;
        while (arg3 < var13) {
            var10001 = arg3++;
            arg1[var10001] = (int) ((float) arg1[var10001] + arg0[var9++] * (float) var12);
        }
        arg8.field10266 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aks.ce(F[F[IIIIIIIILaks;)I")
    public static int method17054(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, VorbisSoundAudioBuss arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15 = var13 * 128;
        int var16 = var14 * 128;
        int var17;
        if ((var17 = arg4 + var12 - var11) > arg8) {
            var17 = arg8;
        }
        int var18 = arg4 << 1;
        int var19 = var17 << 1;
        int var31 = var19 - 6;
        while (var18 < var31) {
            float var20 = arg1[var11++];
            int var25 = var18++;
            arg2[var25] = (int) ((float) arg2[var25] + (float) var15 * var20);
            int var26 = var18++;
            arg2[var26] = (int) ((float) arg2[var26] + (float) var16 * var20);
            float var21 = arg1[var11++];
            int var28 = var18++;
            arg2[var28] = (int) ((float) arg2[var28] + (float) var15 * var21);
            int var29 = var18++;
            arg2[var29] = (int) ((float) arg2[var29] + (float) var16 * var21);
            float var22 = arg1[var11++];
            int var32 = var18++;
            arg2[var32] = (int) ((float) arg2[var32] + (float) var15 * var22);
            int var33 = var18++;
            arg2[var33] = (int) ((float) arg2[var33] + (float) var16 * var22);
            float var23 = arg1[var11++];
            int var35 = var18++;
            arg2[var35] = (int) ((float) arg2[var35] + (float) var15 * var23);
            int var36 = var18++;
            arg2[var36] = (int) ((float) arg2[var36] + (float) var16 * var23);
        }
        var19 = var31 + 6;
        while (var18 < var19) {
            float var24 = arg1[var11++];
            int var10001 = var18++;
            arg2[var10001] = (int) ((float) arg2[var10001] + (float) var15 * var24);
            int var37 = var18++;
            arg2[var37] = (int) ((float) arg2[var37] + (float) var16 * var24);
        }
        arg10.field10266 = var11 << 8;
        return var18 >> 1;
    }

    @ObfuscatedName("aks.ct([F[IIIIIIILaks;)I")
    public static int method17055(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, VorbisSoundAudioBuss arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12 = var11 * 128;
        int var13;
        if ((var13 = arg3 + var9 - (var10 - 1)) > arg6) {
            var13 = arg6;
        }
        var13 -= 3;
        int var10001;
        while (arg3 < var13) {
            var10001 = arg3++;
            arg1[var10001] = (int) ((float) arg1[var10001] + arg0[var9--] * (float) var12);
            int var14 = arg3++;
            arg1[var14] = (int) ((float) arg1[var14] + arg0[var9--] * (float) var12);
            int var15 = arg3++;
            arg1[var15] = (int) ((float) arg1[var15] + arg0[var9--] * (float) var12);
            int var16 = arg3++;
            arg1[var16] = (int) ((float) arg1[var16] + arg0[var9--] * (float) var12);
        }
        var13 += 3;
        while (arg3 < var13) {
            var10001 = arg3++;
            arg1[var10001] = (int) ((float) arg1[var10001] + arg0[var9--] * (float) var12);
        }
        arg8.field10266 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aks.cu(F[F[IIIIIIIILaks;)I")
    public static int method17056(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, VorbisSoundAudioBuss arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15 = var13 * 128;
        int var16 = var14 * 128;
        int var17;
        if ((var17 = arg4 + var11 - (var12 - 1)) > arg8) {
            var17 = arg8;
        }
        int var18 = arg4 << 1;
        int var19 = var17 << 1;
        int var31 = var19 - 6;
        while (var18 < var31) {
            float var20 = arg1[var11--];
            int var25 = var18++;
            arg2[var25] = (int) ((float) arg2[var25] + (float) var15 * var20);
            int var26 = var18++;
            arg2[var26] = (int) ((float) arg2[var26] + (float) var16 * var20);
            float var21 = arg1[var11--];
            int var28 = var18++;
            arg2[var28] = (int) ((float) arg2[var28] + (float) var15 * var21);
            int var29 = var18++;
            arg2[var29] = (int) ((float) arg2[var29] + (float) var16 * var21);
            float var22 = arg1[var11--];
            int var32 = var18++;
            arg2[var32] = (int) ((float) arg2[var32] + (float) var15 * var22);
            int var33 = var18++;
            arg2[var33] = (int) ((float) arg2[var33] + (float) var16 * var22);
            float var23 = arg1[var11--];
            int var35 = var18++;
            arg2[var35] = (int) ((float) arg2[var35] + (float) var15 * var23);
            int var36 = var18++;
            arg2[var36] = (int) ((float) arg2[var36] + (float) var16 * var23);
        }
        var19 = var31 + 6;
        while (var18 < var19) {
            float var24 = arg1[var11--];
            int var10001 = var18++;
            arg2[var10001] = (int) ((float) arg2[var10001] + (float) var15 * var24);
            int var37 = var18++;
            arg2[var37] = (int) ((float) arg2[var37] + (float) var16 * var24);
        }
        arg10.field10266 = var11 << 8;
        return var18 >> 1;
    }

    @ObfuscatedName("aks.cc(FI[F[IIIIIIILaks;IF)I")
    public static int method17057(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, VorbisSoundAudioBuss arg10, int arg11, float arg12) {
        int var13 = arg6 * 128;
        int var14;
        if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            float var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += (int) (((arg2[var15 + 1] - var16) * (float) (arg4 & 0xFF) + var16 * 256.0F) * (float) var13) >> 6;
            arg4 += arg11;
        }
        int var17;
        if (arg11 == 0 || (var17 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var17 = arg8;
        }
        while (arg5 < var17) {
            float var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += (int) (((arg12 - var18) * (float) (arg4 & 0xFF) + var18 * 256.0F) * (float) var13) >> 6;
            arg4 += arg11;
        }
        arg10.field10266 = arg4;
        return arg5;
    }

    @ObfuscatedName("aks.cg(FI[F[IIIIIIIILaks;IF)I")
    public static int method17058(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, VorbisSoundAudioBuss arg11, int arg12, float arg13) {
        int var14 = arg6 * 128;
        int var15 = arg7 * 128;
        int var16;
        if (arg12 == 0 || (var16 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var16 = arg9;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            float var20 = arg2[var19];
            float var21 = (arg2[var19 + 1] - var20) * (float) (arg4 & 0xFF) + var20 * 256.0F;
            var10001 = var17++;
            arg3[var10001] += (int) ((float) var14 * var21) >> 6;
            int var26 = var17++;
            arg3[var26] += (int) ((float) var15 * var21) >> 6;
            arg4 += arg12;
        }
        int var22;
        if (arg12 == 0 || (var22 = (var17 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var22 = arg9;
        }
        int var23 = var22 << 1;
        while (var17 < var23) {
            float var24 = arg2[arg4 >> 8];
            float var25 = (arg13 - var24) * (float) (arg4 & 0xFF) + var24 * 256.0F;
            var10001 = var17++;
            arg3[var10001] += (int) ((float) var14 * var25) >> 6;
            var10001 = var17++;
            arg3[var10001] += (int) ((float) var15 * var25) >> 6;
            arg4 += arg12;
        }
        arg11.field10266 = arg4;
        return var17 >> 1;
    }

    @ObfuscatedName("aks.cj(FI[F[IIIIIIILaks;IF)I")
    public static int method17059(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, VorbisSoundAudioBuss arg10, int arg11, float arg12) {
        int var13 = arg6 * 128;
        int var14;
        if (arg11 == 0 || (var14 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var14 = arg8;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            float var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += (int) (((arg2[var15] - var16) * (float) (arg4 & 0xFF) + var16 * 256.0F) * (float) var13) >> 6;
            arg4 += arg11;
        }
        int var17;
        if (arg11 == 0 || (var17 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var17 = arg8;
        }
        float var18 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += (int) (((arg2[arg4 >> 8] - var18) * (float) (arg4 & 0xFF) + var18 * 256.0F) * (float) var13) >> 6;
            arg4 += arg11;
        }
        arg10.field10266 = arg4;
        return arg5;
    }

    @ObfuscatedName("aks.cy(FI[F[IIIIIIIILaks;IF)I")
    public static int method17060(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, VorbisSoundAudioBuss arg11, int arg12, float arg13) {
        int var14 = arg6 * 128;
        int var15 = arg7 * 128;
        int var16;
        if (arg12 == 0 || (var16 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var16 = arg9;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            float var20 = arg2[var19 - 1];
            float var21 = (arg2[var19] - var20) * (float) (arg4 & 0xFF) + var20 * 256.0F;
            var10001 = var17++;
            arg3[var10001] += (int) ((float) var14 * var21) >> 6;
            int var25 = var17++;
            arg3[var25] += (int) ((float) var15 * var21) >> 6;
            arg4 += arg12;
        }
        int var22;
        if (arg12 == 0 || (var22 = (var17 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var22 = arg9;
        }
        int var23 = var22 << 1;
        while (var17 < var23) {
            float var24 = (arg2[arg4 >> 8] - arg13) * (float) (arg4 & 0xFF) + arg13 * 256.0F;
            var10001 = var17++;
            arg3[var10001] += (int) ((float) var14 * var24) >> 6;
            var10001 = var17++;
            arg3[var10001] += (int) ((float) var15 * var24) >> 6;
            arg4 += arg12;
        }
        arg11.field10266 = arg4;
        return var17 >> 1;
    }

    @ObfuscatedName("aks.cz([F[IIIIIIIILaks;)I")
    public static int method17061(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, VorbisSoundAudioBuss arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14 = var12 * 128;
        int var15 = var13 * 128;
        int var16;
        if ((var16 = arg3 + var11 - var10) > arg7) {
            var16 = arg7;
        }
        arg9.field10268 += arg9.field10271 * (var16 - arg3);
        arg9.field10269 += arg9.field10274 * (var16 - arg3);
        var16 -= 3;
        int var10001;
        while (arg3 < var16) {
            var10001 = arg3++;
            arg1[var10001] = (int) ((float) arg1[var10001] + arg0[var10++] * (float) var14);
            int var17 = var14 + var15;
            int var20 = arg3++;
            arg1[var20] = (int) ((float) arg1[var20] + arg0[var10++] * (float) var17);
            int var18 = var15 + var17;
            int var21 = arg3++;
            arg1[var21] = (int) ((float) arg1[var21] + arg0[var10++] * (float) var18);
            int var19 = var15 + var18;
            int var22 = arg3++;
            arg1[var22] = (int) ((float) arg1[var22] + arg0[var10++] * (float) var19);
            var14 = var15 + var19;
        }
        var16 += 3;
        while (arg3 < var16) {
            var10001 = arg3++;
            arg1[var10001] = (int) ((float) arg1[var10001] + arg0[var10++] * (float) var14);
            var14 += var15;
        }
        arg9.field10267 = var14 / 128 >> 2;
        arg9.field10266 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aks.dl(F[F[IIIIIIIIIILaks;)I")
    public static int method17100(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, VorbisSoundAudioBuss arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19 = var15 * 128;
        int var20 = var17 * 128;
        int var21 = var16 * 128;
        int var22 = var18 * 128;
        int var23;
        if ((var23 = arg4 + var14 - var13) > arg10) {
            var23 = arg10;
        }
        arg12.field10267 += arg12.field10270 * (var23 - arg4);
        int var24 = arg4 << 1;
        int var25 = var23 << 1;
        int var48 = var25 - 6;
        while (var24 < var48) {
            float var26 = arg1[var13++];
            int var37 = var24++;
            arg2[var37] = (int) ((float) arg2[var37] + (float) var19 * var26);
            int var27 = var19 + var20;
            int var38 = var24++;
            arg2[var38] = (int) ((float) arg2[var38] + (float) var21 * var26);
            int var28 = var21 + var22;
            float var29 = arg1[var13++];
            int var40 = var24++;
            arg2[var40] = (int) ((float) arg2[var40] + (float) var27 * var29);
            int var30 = var20 + var27;
            int var41 = var24++;
            arg2[var41] = (int) ((float) arg2[var41] + (float) var28 * var29);
            int var31 = var22 + var28;
            float var32 = arg1[var13++];
            int var43 = var24++;
            arg2[var43] = (int) ((float) arg2[var43] + (float) var30 * var32);
            int var33 = var20 + var30;
            int var44 = var24++;
            arg2[var44] = (int) ((float) arg2[var44] + (float) var31 * var32);
            int var34 = var22 + var31;
            float var35 = arg1[var13++];
            int var46 = var24++;
            arg2[var46] = (int) ((float) arg2[var46] + (float) var33 * var35);
            var19 = var20 + var33;
            int var47 = var24++;
            arg2[var47] = (int) ((float) arg2[var47] + (float) var34 * var35);
            var21 = var22 + var34;
        }
        var25 = var48 + 6;
        while (var24 < var25) {
            float var36 = arg1[var13++];
            int var10001 = var24++;
            arg2[var10001] = (int) ((float) arg2[var10001] + (float) var19 * var36);
            var19 += var20;
            int var49 = var24++;
            arg2[var49] = (int) ((float) arg2[var49] + (float) var21 * var36);
            var21 += var22;
        }
        arg12.field10268 = var19 / 128 >> 2;
        arg12.field10269 = var21 / 128 >> 2;
        arg12.field10266 = var13 << 8;
        return var24 >> 1;
    }

    @ObfuscatedName("aks.dj([F[IIIIIIIILaks;)I")
    public static int method17063(float[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, VorbisSoundAudioBuss arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14 = var12 * 128;
        int var15 = var13 * 128;
        int var16;
        if ((var16 = arg3 + var10 - (var11 - 1)) > arg7) {
            var16 = arg7;
        }
        arg9.field10268 += arg9.field10271 * (var16 - arg3);
        arg9.field10269 += arg9.field10274 * (var16 - arg3);
        var16 -= 3;
        int var10001;
        while (arg3 < var16) {
            var10001 = arg3++;
            arg1[var10001] = (int) ((float) arg1[var10001] + arg0[var10--] * (float) var14);
            int var17 = var14 + var15;
            int var20 = arg3++;
            arg1[var20] = (int) ((float) arg1[var20] + arg0[var10--] * (float) var17);
            int var18 = var15 + var17;
            int var21 = arg3++;
            arg1[var21] = (int) ((float) arg1[var21] + arg0[var10--] * (float) var18);
            int var19 = var15 + var18;
            int var22 = arg3++;
            arg1[var22] = (int) ((float) arg1[var22] + arg0[var10--] * (float) var19);
            var14 = var15 + var19;
        }
        var16 += 3;
        while (arg3 < var16) {
            var10001 = arg3++;
            arg1[var10001] = (int) ((float) arg1[var10001] + arg0[var10--] * (float) var14);
            var14 += var15;
        }
        arg9.field10267 = var14 / 128 >> 2;
        arg9.field10266 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aks.dp(F[F[IIIIIIIIIILaks;)I")
    public static int method17064(float arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, VorbisSoundAudioBuss arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19 = var15 * 128;
        int var20 = var17 * 128;
        int var21 = var16 * 128;
        int var22 = var18 * 128;
        int var23;
        if ((var23 = arg4 + var13 - (var14 - 1)) > arg10) {
            var23 = arg10;
        }
        arg12.field10267 += arg12.field10270 * (var23 - arg4);
        int var24 = arg4 << 1;
        int var25 = var23 << 1;
        int var48 = var25 - 6;
        while (var24 < var48) {
            float var26 = arg1[var13--];
            int var37 = var24++;
            arg2[var37] = (int) ((float) arg2[var37] + (float) var19 * var26);
            int var27 = var19 + var20;
            int var38 = var24++;
            arg2[var38] = (int) ((float) arg2[var38] + (float) var21 * var26);
            int var28 = var21 + var22;
            float var29 = arg1[var13--];
            int var40 = var24++;
            arg2[var40] = (int) ((float) arg2[var40] + (float) var27 * var29);
            int var30 = var20 + var27;
            int var41 = var24++;
            arg2[var41] = (int) ((float) arg2[var41] + (float) var28 * var29);
            int var31 = var22 + var28;
            float var32 = arg1[var13--];
            int var43 = var24++;
            arg2[var43] = (int) ((float) arg2[var43] + (float) var30 * var32);
            int var33 = var20 + var30;
            int var44 = var24++;
            arg2[var44] = (int) ((float) arg2[var44] + (float) var31 * var32);
            int var34 = var22 + var31;
            float var35 = arg1[var13--];
            int var46 = var24++;
            arg2[var46] = (int) ((float) arg2[var46] + (float) var33 * var35);
            var19 = var20 + var33;
            int var47 = var24++;
            arg2[var47] = (int) ((float) arg2[var47] + (float) var34 * var35);
            var21 = var22 + var34;
        }
        var25 = var48 + 6;
        while (var24 < var25) {
            float var36 = arg1[var13--];
            int var10001 = var24++;
            arg2[var10001] = (int) ((float) arg2[var10001] + (float) var19 * var36);
            var19 += var20;
            int var49 = var24++;
            arg2[var49] = (int) ((float) arg2[var49] + (float) var21 * var36);
            var21 += var22;
        }
        arg12.field10268 = var19 / 128 >> 2;
        arg12.field10269 = var21 / 128 >> 2;
        arg12.field10266 = var13 << 8;
        return var24 >> 1;
    }

    @ObfuscatedName("aks.dw(FI[F[IIIIIIIILaks;IF)I")
    public static int method17065(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, VorbisSoundAudioBuss arg11, int arg12, float arg13) {
        int var14 = arg6 * 128;
        int var15 = arg7 * 128;
        arg11.field10268 -= arg11.field10271 * arg5;
        arg11.field10269 -= arg11.field10274 * arg5;
        int var16;
        if (arg12 == 0 || (var16 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var16 = arg9;
        }
        int var10001;
        while (arg5 < var16) {
            int var17 = arg4 >> 8;
            float var18 = arg2[var17];
            var10001 = arg5++;
            arg3[var10001] += (int) (((arg2[var17 + 1] - var18) * (float) (arg4 & 0xFF) + var18 * 256.0F) * (float) var14) >> 6;
            var14 += var15;
            arg4 += arg12;
        }
        int var19;
        if (arg12 == 0 || (var19 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var19 = arg9;
        }
        while (arg5 < var19) {
            float var20 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += (int) (((arg13 - var20) * (float) (arg4 & 0xFF) + var20 * 256.0F) * (float) var14) >> 6;
            var14 += var15;
            arg4 += arg12;
        }
        arg11.field10268 += arg11.field10271 * arg5;
        arg11.field10269 += arg11.field10274 * arg5;
        arg11.field10267 = var14 / 128;
        arg11.field10266 = arg4;
        return arg5;
    }

    @ObfuscatedName("aks.di(FI[F[IIIIIIIIIILaks;IF)I")
    public static int method17066(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, VorbisSoundAudioBuss arg13, int arg14, float arg15) {
        int var16 = arg6 * 128;
        int var17 = arg8 * 128;
        int var18 = arg7 * 128;
        int var19 = arg9 * 128;
        arg13.field10267 -= arg13.field10270 * arg5;
        int var20;
        if (arg14 == 0 || (var20 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var20 = arg11;
        }
        int var21 = arg5 << 1;
        int var22 = var20 << 1;
        int var10001;
        while (var21 < var22) {
            int var23 = arg4 >> 8;
            float var24 = arg2[var23];
            float var25 = (arg2[var23 + 1] - var24) * (float) (arg4 & 0xFF) + var24 * 256.0F;
            var10001 = var21++;
            arg3[var10001] += (int) ((float) var16 * var25) >> 6;
            var16 += var17;
            int var31 = var21++;
            arg3[var31] += (int) ((float) var18 * var25) >> 6;
            var18 += var19;
            arg4 += arg14;
        }
        int var26;
        if (arg14 == 0 || (var26 = (var21 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var26 = arg11;
        }
        int var27 = var26 << 1;
        while (var21 < var27) {
            float var28 = arg2[arg4 >> 8];
            float var29 = (arg15 - var28) * (float) (arg4 & 0xFF) + var28 * 256.0F;
            var10001 = var21++;
            arg3[var10001] += (int) ((float) var16 * var29) >> 6;
            var16 += var17;
            var10001 = var21++;
            arg3[var10001] += (int) ((float) var18 * var29) >> 6;
            var18 += var19;
            arg4 += arg14;
        }
        int var30 = var21 >> 1;
        arg13.field10267 += arg13.field10270 * var30;
        arg13.field10268 = var16 / 128;
        arg13.field10269 = var18 / 128;
        arg13.field10266 = arg4;
        return var30;
    }

    @ObfuscatedName("aks.dg(FI[F[IIIIIIIILaks;IF)I")
    public static int method17070(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, VorbisSoundAudioBuss arg11, int arg12, float arg13) {
        int var14 = arg6 * 128;
        int var15 = arg7 * 128;
        arg11.field10268 -= arg11.field10271 * arg5;
        arg11.field10269 -= arg11.field10274 * arg5;
        int var16;
        if (arg12 == 0 || (var16 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var16 = arg9;
        }
        int var10001;
        while (arg5 < var16) {
            int var17 = arg4 >> 8;
            float var18 = arg2[var17 - 1];
            var10001 = arg5++;
            arg3[var10001] += (int) (((arg2[var17] - var18) * (float) (arg4 & 0xFF) + var18 * 256.0F) * (float) var14) >> 6;
            var14 += var15;
            arg4 += arg12;
        }
        int var19;
        if (arg12 == 0 || (var19 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var19 = arg9;
        }
        float var20 = arg13;
        while (arg5 < var19) {
            var10001 = arg5++;
            arg3[var10001] += (int) (((arg2[arg4 >> 8] - var20) * (float) (arg4 & 0xFF) + var20 * 256.0F) * (float) var14) >> 6;
            var14 += var15;
            arg4 += arg12;
        }
        arg11.field10268 += arg11.field10271 * arg5;
        arg11.field10269 += arg11.field10274 * arg5;
        arg11.field10267 = var14 / 128;
        arg11.field10266 = arg4;
        return arg5;
    }

    @ObfuscatedName("aks.do(FI[F[IIIIIIIIIILaks;IF)I")
    public static int method17062(float arg0, int arg1, float[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, VorbisSoundAudioBuss arg13, int arg14, float arg15) {
        int var16 = arg6 * 128;
        int var17 = arg8 * 128;
        int var18 = arg7 * 128;
        int var19 = arg9 * 128;
        arg13.field10267 -= arg13.field10270 * arg5;
        int var20;
        if (arg14 == 0 || (var20 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var20 = arg11;
        }
        int var21 = arg5 << 1;
        int var22 = var20 << 1;
        int var10001;
        while (var21 < var22) {
            int var23 = arg4 >> 8;
            float var24 = arg2[var23 - 1];
            float var25 = (arg2[var23] - var24) * (float) (arg4 & 0xFF) + var24 * 256.0F;
            var10001 = var21++;
            arg3[var10001] += (int) ((float) var16 * var25) >> 6;
            var16 += var17;
            int var30 = var21++;
            arg3[var30] += (int) ((float) var18 * var25) >> 6;
            var18 += var19;
            arg4 += arg14;
        }
        int var26;
        if (arg14 == 0 || (var26 = (var21 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var26 = arg11;
        }
        int var27 = var26 << 1;
        while (var21 < var27) {
            float var28 = (arg2[arg4 >> 8] - arg15) * (float) (arg4 & 0xFF) + arg15 * 256.0F;
            var10001 = var21++;
            arg3[var10001] += (int) ((float) var16 * var28) >> 6;
            var16 += var17;
            var10001 = var21++;
            arg3[var10001] += (int) ((float) var18 * var28) >> 6;
            var18 += var19;
            arg4 += arg14;
        }
        int var29 = var21 >> 1;
        arg13.field10267 += arg13.field10270 * var29;
        arg13.field10268 = var16 / 128;
        arg13.field10269 = var18 / 128;
        arg13.field10266 = arg4;
        return var29;
    }
}
