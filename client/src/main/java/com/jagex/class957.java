package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

@ObfuscatedName("ajp")
public class class957 extends class803 {

	@ObfuscatedName("ajp.m")
	public final VorbisInfo field10397 = new VorbisInfo();

	@ObfuscatedName("ajp.t")
	public final VorbisComment field10398 = new VorbisComment();

	@ObfuscatedName("ajp.l")
	public DSPState field10399;

	@ObfuscatedName("ajp.f")
	public VorbisBlock field10400;

	@ObfuscatedName("ajp.d")
	public class375 field10401;

	@ObfuscatedName("ajp.z")
	public class940 field10402;

	@ObfuscatedName("ajp.n")
	public double field10403;

	@ObfuscatedName("ajp.o")
	public int field10404;

	public class957(OggStreamState arg0) {
		super(arg0);
	}

	@ObfuscatedName("ajp.j(Ljagtheora/ogg/OggPacket;I)V")
	public void method15150(OggPacket arg0) {
		if (this.field9558 * -352769937 < 3) {
			int var2 = this.field10397.headerIn(this.field10398, arg0);
			if (var2 < 0) {
				throw new IllegalStateException("" + var2);
			}
			if (this.field9558 * -352769937 == 2) {
				if (this.field10397.channels > 2 || this.field10397.channels < 1) {
					throw new RuntimeException("" + this.field10397.channels);
				}
				this.field10399 = new DSPState(this.field10397);
				this.field10400 = new VorbisBlock(this.field10399);
				this.field10401 = new class375(this.field10397.rate, Statics.field4015);
				this.field10402 = new class940(this.field10397.channels);
			}
			return;
		}
		if (this.field10400.synthesis(arg0) == 0) {
			this.field10399.blockIn(this.field10400);
		}
		float[][] var3 = this.field10399.pcmOut(this.field10397.channels);
		this.field10403 = this.field10399.granuleTime();
		if (this.field10403 == -1.0D) {
			this.field10403 = (float) (this.field10404 * -1229963035) / (float) this.field10397.rate;
		}
		this.field10399.read(var3[0].length);
		this.field10404 += var3[0].length * -595493651;
		class804 var4 = this.field10402.method16470(var3[0].length, this.field10403);
		method5018(var3, var4.field9559);
		for (int var5 = 0; var5 < this.field10397.channels; var5++) {
			var4.field9559[var5] = this.field10401.method6551(var4.field9559[var5]);
		}
		this.field10402.method16481(var4);
	}

	@ObfuscatedName("ky.z([[F[[SI)[[S")
	public static short[][] method5018(float[][] arg0, short[][] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			for (int var3 = 0; var3 < arg1[var2].length; var3++) {
				arg1[var2][var3] = (short) (arg0[var2][var3] * 16383.0F);
			}
		}
		return arg1;
	}

	@ObfuscatedName("ajp.n(I)Laiq;")
	public class940 method16795() {
		return this.field10402;
	}

	@ObfuscatedName("ajp.a(I)V")
	public void method15153() {
		if (this.field10400 != null) {
			this.field10400.method53();
		}
		if (this.field10399 != null) {
			this.field10399.method53();
		}
		this.field10398.method53();
		this.field10397.method53();
		if (this.field10402 != null) {
			this.field10402.method16472();
		}
	}

	@ObfuscatedName("ajp.o(B)D")
	public double method16793() {
		double var1 = this.field10403;
		if (this.field10402 != null) {
			var1 = this.field10402.method16492();
			if (var1 < 0.0D) {
				var1 = this.field10403;
			}
		}
		return var1 - (double) (256.0F / (float) Statics.field4015);
	}

	@ObfuscatedName("ajp.q(I)I")
	public int method16794() {
		return this.field10402 == null ? 0 : this.field10402.method16467();
	}
}
