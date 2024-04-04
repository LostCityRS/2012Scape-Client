import deob.ObfuscatedName;

@ObfuscatedName("akw")
public class SoundStreamRelated1 extends SoundAudioBuss {

    public SoundStreamRelated1(SynthVariableRateSoundPacket arg0, int arg1, int arg2, int arg3) {
        this.sound = arg0;
        this.field10272 = arg0.field10294;
        this.field10275 = arg0.field10292;
        this.field10276 = arg0.field10293;
        this.field10264 = arg1;
        this.field10263 = arg2;
        this.field10277 = arg3;
        this.field10266 = 0;
        this.method16382();
    }

    @ObfuscatedName("akw.m([III)V")
    public synchronized void read(int[] arg0, int arg1, int arg2) {
        if (this.field10263 == 0 && this.field10273 == 0) {
            this.skip(arg2);
            return;
        }
        int var4 = this.field10272 << 8;
        int var5 = this.field10275 << 8;
        int var6 = ((SynthVariableRateSoundPacket) this.sound).field10574.length << 8;
        int var7 = var5 - var4;
        if (var7 <= 0) {
            this.field10265 = 0;
        }
        int var8 = arg1;
        int var9 = arg1 + arg2;
        if (this.field10266 < 0) {
            if (this.field10264 <= 0) {
                this.method16394();
                this.remove();
                return;
            }
            this.field10266 = 0;
        }
        if (this.field10266 >= var6) {
            if (this.field10264 >= 0) {
                this.method16394();
                this.remove();
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
                            var8 = this.method16997(arg0, arg1, var4, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10272]);
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
                            var8 = this.method17025(arg0, var8, var5, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10275 - 1]);
                            if (this.field10266 < var5) {
                                return;
                            }
                            this.field10266 = var5 + var5 - 1 - this.field10266;
                            this.field10264 = -(this.field10264);
                            if (--this.field10265 == 0) {
                                break;
                            }
                            var8 = this.method16997(arg0, var8, var4, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10272]);
                            if (this.field10266 >= var4) {
                                return;
                            }
                            this.field10266 = var4 + var4 - 1 - this.field10266;
                            this.field10264 = -(this.field10264);
                        } while (--this.field10265 != 0);
                    }
                } else if (this.field10264 < 0) {
                    while (true) {
                        var8 = this.method16997(arg0, var8, var4, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10275 - 1]);
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
                        var8 = this.method17025(arg0, var8, var5, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10272]);
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
                this.method16997(arg0, var8, 0, var9, 0);
                if (this.field10266 < 0) {
                    this.field10266 = -1;
                    this.method16394();
                    this.remove();
                }
            } else {
                this.method17025(arg0, var8, var6, var9, 0);
                if (this.field10266 >= var6) {
                    this.field10266 = var6;
                    this.method16394();
                    this.remove();
                }
            }
        } else if (this.field10276) {
            if (this.field10264 < 0) {
                var8 = this.method16997(arg0, arg1, var4, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10272]);
                if (this.field10266 >= var4) {
                    return;
                }
                this.field10266 = var4 + var4 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
            }
            while (true) {
                int var10 = this.method17025(arg0, var8, var5, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10275 - 1]);
                if (this.field10266 < var5) {
                    return;
                }
                this.field10266 = var5 + var5 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
                var8 = this.method16997(arg0, var10, var4, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10272]);
                if (this.field10266 >= var4) {
                    return;
                }
                this.field10266 = var4 + var4 - 1 - this.field10266;
                this.field10264 = -(this.field10264);
            }
        } else if (this.field10264 < 0) {
            while (true) {
                var8 = this.method16997(arg0, var8, var4, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10275 - 1]);
                if (this.field10266 >= var4) {
                    return;
                }
                this.field10266 = var5 - 1 - (var5 - 1 - this.field10266) % var7;
            }
        } else {
            while (true) {
                var8 = this.method17025(arg0, var8, var5, var9, ((SynthVariableRateSoundPacket) this.sound).field10574[this.field10272]);
                if (this.field10266 < var5) {
                    return;
                }
                this.field10266 = (this.field10266 - var4) % var7 + var4;
            }
        }
    }

    @ObfuscatedName("akw.cv([IIIII)I")
    public int method17025(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field10273 > 0) {
                int var6 = this.field10273 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field10273 += arg1;
                if (this.field10264 == 256 && (this.field10266 & 0xFF) == 0) {
                    if (Statics.stereo) {
                        arg1 = method17005(0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10268, this.field10269, this.field10271, this.field10274, 0, var6, arg2, this);
                    } else {
                        arg1 = method17047(((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10267, this.field10270, 0, var6, arg2, this);
                    }
                } else if (Statics.stereo) {
                    arg1 = method17007(0, 0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10268, this.field10269, this.field10271, this.field10274, 0, var6, arg2, this, this.field10264, arg4);
                } else {
                    arg1 = method17048(0, 0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10267, this.field10270, 0, var6, arg2, this, this.field10264, arg4);
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
                    return method17027(0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10268, this.field10269, 0, arg3, arg2, this);
                }
                return method16998(((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10267, 0, arg3, arg2, this);
            }
            if (Statics.stereo) {
                return method17002(0, 0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10268, this.field10269, 0, arg3, arg2, this, this.field10264, arg4);
            }
            return method17001(0, 0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10267, 0, arg3, arg2, this, this.field10264, arg4);
        }
    }

    @ObfuscatedName("akw.ck([IIIII)I")
    public int method16997(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field10273 > 0) {
                int var6 = this.field10273 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field10273 += arg1;
                if (this.field10264 == -256 && (this.field10266 & 0xFF) == 0) {
                    if (Statics.stereo) {
                        arg1 = method17022(0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10268, this.field10269, this.field10271, this.field10274, 0, var6, arg2, this);
                    } else {
                        arg1 = method17015(((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10267, this.field10270, 0, var6, arg2, this);
                    }
                } else if (Statics.stereo) {
                    arg1 = method17012(0, 0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10268, this.field10269, this.field10271, this.field10274, 0, var6, arg2, this, this.field10264, arg4);
                } else {
                    arg1 = method17046(0, 0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10267, this.field10270, 0, var6, arg2, this, this.field10264, arg4);
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
                    return method17000(0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10268, this.field10269, 0, arg3, arg2, this);
                }
                return method17008(((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10267, 0, arg3, arg2, this);
            }
            if (Statics.stereo) {
                return method17031(0, 0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10268, this.field10269, 0, arg3, arg2, this, this.field10264, arg4);
            }
            return method17006(0, 0, ((SynthVariableRateSoundPacket) this.sound).field10574, arg0, this.field10266, arg1, this.field10267, 0, arg3, arg2, this, this.field10264, arg4);
        }
    }

    @ObfuscatedName("akw.cd([B[IIIIIIILakw;)I")
    public static int method16998(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, SoundStreamRelated1 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field10266 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("akw.ce(I[B[IIIIIIIILakw;)I")
    public static int method17027(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, SoundStreamRelated1 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field10266 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("akw.ct([B[IIIIIIILakw;)I")
    public static int method17008(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, SoundStreamRelated1 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field10266 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("akw.cu(I[B[IIIIIIIILakw;)I")
    public static int method17000(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, SoundStreamRelated1 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field10266 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("akw.cc(II[B[IIIIIIILakw;II)I")
    public static int method17001(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, SoundStreamRelated1 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field10266 = arg4;
        return arg5;
    }

    @ObfuscatedName("akw.cg(II[B[IIIIIIIILakw;II)I")
    public static int method17002(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, SoundStreamRelated1 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field10266 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("akw.cj(II[B[IIIIIIILakw;II)I")
    public static int method17006(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, SoundStreamRelated1 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field10266 = arg4;
        return arg5;
    }

    @ObfuscatedName("akw.cy(II[B[IIIIIIIILakw;II)I")
    public static int method17031(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, SoundStreamRelated1 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field10266 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("akw.cz([B[IIIIIIIILakw;)I")
    public static int method17047(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, SoundStreamRelated1 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field10268 += arg9.field10271 * (var14 - arg3);
        arg9.field10269 += arg9.field10274 * (var14 - arg3);
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field10267 = var12 >> 2;
        arg9.field10266 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("akw.dl(I[B[IIIIIIIIIILakw;)I")
    public static int method17005(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, SoundStreamRelated1 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        arg12.field10267 += arg12.field10270 * (var19 - arg4);
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field10268 = var15 >> 2;
        arg12.field10269 = var16 >> 2;
        arg12.field10266 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("akw.dj([B[IIIIIIIILakw;)I")
    public static int method17015(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, SoundStreamRelated1 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field10268 += arg9.field10271 * (var14 - arg3);
        arg9.field10269 += arg9.field10274 * (var14 - arg3);
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field10267 = var12 >> 2;
        arg9.field10266 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("akw.dp(I[B[IIIIIIIIIILakw;)I")
    public static int method17022(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, SoundStreamRelated1 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        arg12.field10267 += arg12.field10270 * (var19 - arg4);
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field10268 = var15 >> 2;
        arg12.field10269 = var16 >> 2;
        arg12.field10266 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("akw.dw(II[B[IIIIIIIILakw;II)I")
    public static int method17048(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, SoundStreamRelated1 arg11, int arg12, int arg13) {
        arg11.field10268 -= arg11.field10271 * arg5;
        arg11.field10269 -= arg11.field10274 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field10268 += arg11.field10271 * arg5;
        arg11.field10269 += arg11.field10274 * arg5;
        arg11.field10267 = arg6;
        arg11.field10266 = arg4;
        return arg5;
    }

    @ObfuscatedName("akw.di(II[B[IIIIIIIIIILakw;II)I")
    public static int method17007(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, SoundStreamRelated1 arg13, int arg14, int arg15) {
        arg13.field10267 -= arg13.field10270 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field10267 += arg13.field10270 * var27;
        arg13.field10268 = arg6;
        arg13.field10269 = arg7;
        arg13.field10266 = arg4;
        return var27;
    }

    @ObfuscatedName("akw.dg(II[B[IIIIIIIILakw;II)I")
    public static int method17046(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, SoundStreamRelated1 arg11, int arg12, int arg13) {
        arg11.field10268 -= arg11.field10271 * arg5;
        arg11.field10269 -= arg11.field10274 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field10268 += arg11.field10271 * arg5;
        arg11.field10269 += arg11.field10274 * arg5;
        arg11.field10267 = arg6;
        arg11.field10266 = arg4;
        return arg5;
    }

    @ObfuscatedName("akw.do(II[B[IIIIIIIIIILakw;II)I")
    public static int method17012(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, SoundStreamRelated1 arg13, int arg14, int arg15) {
        arg13.field10267 -= arg13.field10270 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field10267 += arg13.field10270 * var26;
        arg13.field10268 = arg6;
        arg13.field10269 = arg7;
        arg13.field10266 = arg4;
        return var26;
    }
}
